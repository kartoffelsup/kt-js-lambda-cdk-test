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
import SSM.AccountSharingInfo
import SSM.Activation
import SSM.AssociationDescription
import SSM.AssociationExecutionFilter
import SSM.AssociationExecutionTargetsFilter
import SSM.AssociationExecutionTarget
import SSM.AssociationExecution
import SSM.AssociationFilter
import SSM.Association
import SSM.AssociationVersionInfo
import SSM.AttachmentContent
import SSM.AttachmentInformation
import SSM.AttachmentsSource
import SSM.AutomationExecutionFilter
import SSM.AutomationExecutionMetadata
import SSM.CommandFilter
import SSM.CommandInvocation
import SSM.Command
import SSM.CommandPlugin
import SSM.ComplianceItemEntry
import SSM.ComplianceItem
import SSM.ComplianceStringFilter
import SSM.ComplianceSummaryItem
import SSM.CreateAssociationBatchRequestEntry
import SSM.DescribeActivationsFilter
import SSM.DocumentFilter
import SSM.DocumentIdentifier
import SSM.DocumentKeyValuesFilter
import SSM.DocumentParameter
import SSM.DocumentRequires
import SSM.DocumentVersionInfo
import SSM.EffectivePatch
import SSM.FailedCreateAssociation
import SSM.InstanceAssociation
import SSM.InstanceAssociationStatusInfo
import SSM.InstanceInformationFilter
import SSM.InstanceInformation
import SSM.InstanceInformationStringFilter
import SSM.InstancePatchStateFilter
import SSM.InstancePatchState
import SSM.InventoryAggregator
import SSM.InventoryDeletionSummaryItem
import SSM.InventoryDeletionStatusItem
import SSM.InventoryFilter
import SSM.InventoryGroup
import SSM.InventoryItemAttribute
import SSM.InventoryItemEntry
import SSM.InventoryItem
import SSM.InventoryItemSchema
import SSM.InventoryResultEntity
import SSM.MaintenanceWindowExecution
import SSM.MaintenanceWindowExecutionTaskIdentity
import SSM.MaintenanceWindowExecutionTaskInvocationIdentity
import SSM.MaintenanceWindowFilter
import SSM.MaintenanceWindowIdentity
import SSM.MaintenanceWindowTarget
import SSM.MaintenanceWindowTask
import SSM.MaintenanceWindowTaskParameters
import SSM.MaintenanceWindowIdentityForTarget
import SSM.OpsAggregator
import SSM.OpsEntityItemEntry
import SSM.OpsEntity
import SSM.OpsFilter
import SSM.OpsItemFilter
import SSM.OpsItemNotification
import SSM.OpsItemSummary
import SSM.OpsResultAttribute
import SSM.ParameterHistory
import SSM.Parameter
import SSM.ParameterMetadata
import SSM.ParameterInlinePolicy
import SSM.ParameterStringFilter
import SSM.ParametersFilter
import SSM.PatchBaselineIdentity
import SSM.PatchComplianceData
import SSM.PatchFilter
import SSM.PatchGroupPatchBaselineMapping
import SSM.Patch
import SSM.PatchOrchestratorFilter
import SSM.PatchPropertyEntry
import SSM.PatchRule
import SSM.PatchSource
import SSM.RelatedOpsItem
import SSM.ResourceComplianceSummaryItem
import SSM.ResourceDataSyncItem
import SSM.ResourceDataSyncOrganizationalUnit
import SSM.ResultAttribute
import SSM.ScheduledWindowExecution
import SSM.SessionFilter
import SSM.Session
import SSM.StepExecutionFilter
import SSM.StepExecution
import SSM.Tag
import SSM.TargetLocation
import SSM.TargetMap
import SSM.Target
import SSM.AddTagsToResourceRequest
import SSM.AddTagsToResourceResult
import SSM.CancelCommandRequest
import SSM.CancelCommandResult
import SSM.CancelMaintenanceWindowExecutionRequest
import SSM.CancelMaintenanceWindowExecutionResult
import SSM.CreateActivationRequest
import SSM.CreateActivationResult
import SSM.CreateAssociationRequest
import SSM.CreateAssociationResult
import SSM.CreateAssociationBatchRequest
import SSM.CreateAssociationBatchResult
import SSM.CreateDocumentRequest
import SSM.CreateDocumentResult
import SSM.CreateMaintenanceWindowRequest
import SSM.CreateMaintenanceWindowResult
import SSM.CreateOpsItemRequest
import SSM.CreateOpsItemResponse
import SSM.CreatePatchBaselineRequest
import SSM.CreatePatchBaselineResult
import SSM.CreateResourceDataSyncRequest
import SSM.CreateResourceDataSyncResult
import SSM.DeleteActivationRequest
import SSM.DeleteActivationResult
import SSM.DeleteAssociationRequest
import SSM.DeleteAssociationResult
import SSM.DeleteDocumentRequest
import SSM.DeleteDocumentResult
import SSM.DeleteInventoryRequest
import SSM.DeleteInventoryResult
import SSM.DeleteMaintenanceWindowRequest
import SSM.DeleteMaintenanceWindowResult
import SSM.DeleteParameterRequest
import SSM.DeleteParameterResult
import SSM.DeleteParametersRequest
import SSM.DeleteParametersResult
import SSM.DeletePatchBaselineRequest
import SSM.DeletePatchBaselineResult
import SSM.DeleteResourceDataSyncRequest
import SSM.DeleteResourceDataSyncResult
import SSM.DeregisterManagedInstanceRequest
import SSM.DeregisterManagedInstanceResult
import SSM.DeregisterPatchBaselineForPatchGroupRequest
import SSM.DeregisterPatchBaselineForPatchGroupResult
import SSM.DeregisterTargetFromMaintenanceWindowRequest
import SSM.DeregisterTargetFromMaintenanceWindowResult
import SSM.DeregisterTaskFromMaintenanceWindowRequest
import SSM.DeregisterTaskFromMaintenanceWindowResult
import SSM.DescribeActivationsRequest
import SSM.DescribeActivationsResult
import SSM.DescribeAssociationRequest
import SSM.DescribeAssociationResult
import SSM.DescribeAssociationExecutionTargetsRequest
import SSM.DescribeAssociationExecutionTargetsResult
import SSM.DescribeAssociationExecutionsRequest
import SSM.DescribeAssociationExecutionsResult
import SSM.DescribeAutomationExecutionsRequest
import SSM.DescribeAutomationExecutionsResult
import SSM.DescribeAutomationStepExecutionsRequest
import SSM.DescribeAutomationStepExecutionsResult
import SSM.DescribeAvailablePatchesRequest
import SSM.DescribeAvailablePatchesResult
import SSM.DescribeDocumentRequest
import SSM.DescribeDocumentResult
import SSM.DescribeDocumentPermissionRequest
import SSM.DescribeDocumentPermissionResponse
import SSM.DescribeEffectiveInstanceAssociationsRequest
import SSM.DescribeEffectiveInstanceAssociationsResult
import SSM.DescribeEffectivePatchesForPatchBaselineRequest
import SSM.DescribeEffectivePatchesForPatchBaselineResult
import SSM.DescribeInstanceAssociationsStatusRequest
import SSM.DescribeInstanceAssociationsStatusResult
import SSM.DescribeInstanceInformationRequest
import SSM.DescribeInstanceInformationResult
import SSM.DescribeInstancePatchStatesRequest
import SSM.DescribeInstancePatchStatesResult
import SSM.DescribeInstancePatchStatesForPatchGroupRequest
import SSM.DescribeInstancePatchStatesForPatchGroupResult
import SSM.DescribeInstancePatchesRequest
import SSM.DescribeInstancePatchesResult
import SSM.DescribeInventoryDeletionsRequest
import SSM.DescribeInventoryDeletionsResult
import SSM.DescribeMaintenanceWindowExecutionTaskInvocationsRequest
import SSM.DescribeMaintenanceWindowExecutionTaskInvocationsResult
import SSM.DescribeMaintenanceWindowExecutionTasksRequest
import SSM.DescribeMaintenanceWindowExecutionTasksResult
import SSM.DescribeMaintenanceWindowExecutionsRequest
import SSM.DescribeMaintenanceWindowExecutionsResult
import SSM.DescribeMaintenanceWindowScheduleRequest
import SSM.DescribeMaintenanceWindowScheduleResult
import SSM.DescribeMaintenanceWindowTargetsRequest
import SSM.DescribeMaintenanceWindowTargetsResult
import SSM.DescribeMaintenanceWindowTasksRequest
import SSM.DescribeMaintenanceWindowTasksResult
import SSM.DescribeMaintenanceWindowsRequest
import SSM.DescribeMaintenanceWindowsResult
import SSM.DescribeMaintenanceWindowsForTargetRequest
import SSM.DescribeMaintenanceWindowsForTargetResult
import SSM.DescribeOpsItemsRequest
import SSM.DescribeOpsItemsResponse
import SSM.DescribeParametersRequest
import SSM.DescribeParametersResult
import SSM.DescribePatchBaselinesRequest
import SSM.DescribePatchBaselinesResult
import SSM.DescribePatchGroupStateRequest
import SSM.DescribePatchGroupStateResult
import SSM.DescribePatchGroupsRequest
import SSM.DescribePatchGroupsResult
import SSM.DescribePatchPropertiesRequest
import SSM.DescribePatchPropertiesResult
import SSM.DescribeSessionsRequest
import SSM.DescribeSessionsResponse
import SSM.GetAutomationExecutionRequest
import SSM.GetAutomationExecutionResult
import SSM.GetCalendarStateRequest
import SSM.GetCalendarStateResponse
import SSM.GetCommandInvocationRequest
import SSM.GetCommandInvocationResult
import SSM.GetConnectionStatusRequest
import SSM.GetConnectionStatusResponse
import SSM.GetDefaultPatchBaselineRequest
import SSM.GetDefaultPatchBaselineResult
import SSM.GetDeployablePatchSnapshotForInstanceRequest
import SSM.GetDeployablePatchSnapshotForInstanceResult
import SSM.GetDocumentRequest
import SSM.GetDocumentResult
import SSM.GetInventoryRequest
import SSM.GetInventoryResult
import SSM.GetInventorySchemaRequest
import SSM.GetInventorySchemaResult
import SSM.GetMaintenanceWindowRequest
import SSM.GetMaintenanceWindowResult
import SSM.GetMaintenanceWindowExecutionRequest
import SSM.GetMaintenanceWindowExecutionResult
import SSM.GetMaintenanceWindowExecutionTaskRequest
import SSM.GetMaintenanceWindowExecutionTaskResult
import SSM.GetMaintenanceWindowExecutionTaskInvocationRequest
import SSM.GetMaintenanceWindowExecutionTaskInvocationResult
import SSM.GetMaintenanceWindowTaskRequest
import SSM.GetMaintenanceWindowTaskResult
import SSM.GetOpsItemRequest
import SSM.GetOpsItemResponse
import SSM.GetOpsSummaryRequest
import SSM.GetOpsSummaryResult
import SSM.GetParameterRequest
import SSM.GetParameterResult
import SSM.GetParameterHistoryRequest
import SSM.GetParameterHistoryResult
import SSM.GetParametersRequest
import SSM.GetParametersResult
import SSM.GetParametersByPathRequest
import SSM.GetParametersByPathResult
import SSM.GetPatchBaselineRequest
import SSM.GetPatchBaselineResult
import SSM.GetPatchBaselineForPatchGroupRequest
import SSM.GetPatchBaselineForPatchGroupResult
import SSM.GetServiceSettingRequest
import SSM.GetServiceSettingResult
import SSM.LabelParameterVersionRequest
import SSM.LabelParameterVersionResult
import SSM.ListAssociationVersionsRequest
import SSM.ListAssociationVersionsResult
import SSM.ListAssociationsRequest
import SSM.ListAssociationsResult
import SSM.ListCommandInvocationsRequest
import SSM.ListCommandInvocationsResult
import SSM.ListCommandsRequest
import SSM.ListCommandsResult
import SSM.ListComplianceItemsRequest
import SSM.ListComplianceItemsResult
import SSM.ListComplianceSummariesRequest
import SSM.ListComplianceSummariesResult
import SSM.ListDocumentVersionsRequest
import SSM.ListDocumentVersionsResult
import SSM.ListDocumentsRequest
import SSM.ListDocumentsResult
import SSM.ListInventoryEntriesRequest
import SSM.ListInventoryEntriesResult
import SSM.ListResourceComplianceSummariesRequest
import SSM.ListResourceComplianceSummariesResult
import SSM.ListResourceDataSyncRequest
import SSM.ListResourceDataSyncResult
import SSM.ListTagsForResourceRequest
import SSM.ListTagsForResourceResult
import SSM.ModifyDocumentPermissionRequest
import SSM.ModifyDocumentPermissionResponse
import SSM.PutComplianceItemsRequest
import SSM.PutComplianceItemsResult
import SSM.PutInventoryRequest
import SSM.PutInventoryResult
import SSM.PutParameterRequest
import SSM.PutParameterResult
import SSM.RegisterDefaultPatchBaselineRequest
import SSM.RegisterDefaultPatchBaselineResult
import SSM.RegisterPatchBaselineForPatchGroupRequest
import SSM.RegisterPatchBaselineForPatchGroupResult
import SSM.RegisterTargetWithMaintenanceWindowRequest
import SSM.RegisterTargetWithMaintenanceWindowResult
import SSM.RegisterTaskWithMaintenanceWindowRequest
import SSM.RegisterTaskWithMaintenanceWindowResult
import SSM.RemoveTagsFromResourceRequest
import SSM.RemoveTagsFromResourceResult
import SSM.ResetServiceSettingRequest
import SSM.ResetServiceSettingResult
import SSM.ResumeSessionRequest
import SSM.ResumeSessionResponse
import SSM.SendAutomationSignalRequest
import SSM.SendAutomationSignalResult
import SSM.SendCommandRequest
import SSM.SendCommandResult
import SSM.StartAssociationsOnceRequest
import SSM.StartAssociationsOnceResult
import SSM.StartAutomationExecutionRequest
import SSM.StartAutomationExecutionResult
import SSM.StartSessionRequest
import SSM.StartSessionResponse
import SSM.StopAutomationExecutionRequest
import SSM.StopAutomationExecutionResult
import SSM.TerminateSessionRequest
import SSM.TerminateSessionResponse
import SSM.UpdateAssociationRequest
import SSM.UpdateAssociationResult
import SSM.UpdateAssociationStatusRequest
import SSM.UpdateAssociationStatusResult
import SSM.UpdateDocumentRequest
import SSM.UpdateDocumentResult
import SSM.UpdateDocumentDefaultVersionRequest
import SSM.UpdateDocumentDefaultVersionResult
import SSM.UpdateMaintenanceWindowRequest
import SSM.UpdateMaintenanceWindowResult
import SSM.UpdateMaintenanceWindowTargetRequest
import SSM.UpdateMaintenanceWindowTargetResult
import SSM.UpdateMaintenanceWindowTaskRequest
import SSM.UpdateMaintenanceWindowTaskResult
import SSM.UpdateManagedInstanceRoleRequest
import SSM.UpdateManagedInstanceRoleResult
import SSM.UpdateOpsItemRequest
import SSM.UpdateOpsItemResponse
import SSM.UpdatePatchBaselineRequest
import SSM.UpdatePatchBaselineResult
import SSM.UpdateResourceDataSyncRequest
import SSM.UpdateResourceDataSyncResult
import SSM.UpdateServiceSettingRequest
import SSM.UpdateServiceSettingResult
import SSM.AssociationOverview
import SSM.AssociationStatus
import SSM.Parameters
import SSM.InstanceAssociationOutputLocation
import SSM.OutputSource
import SSM.AssociationStatusAggregatedCount
import SSM.AutomationParameterMap
import SSM.ResolvedTargets
import SSM.ProgressCounters
import SSM.NotificationConfig
import SSM.CloudWatchOutputConfig
import SSM.ComplianceExecutionSummary
import SSM.ComplianceItemDetails
import SSM.CompliantSummary
import SSM.NonCompliantSummary
import SSM.SeveritySummary
import SSM.DocumentDescription
import SSM.OpsItemOperationalData
import SSM.PatchFilterGroup
import SSM.PatchRuleGroup
import SSM.ResourceDataSyncS3Destination
import SSM.ResourceDataSyncSource
import SSM.InventoryDeletionSummary
import SSM.PatchStatus
import SSM.AutomationExecution
import SSM.MaintenanceWindowTaskInvocationParameters
import SSM.LoggingInfo
import SSM.OpsItem
import SSM.ServiceSetting
import SSM.InstanceAssociationStatusAggregatedCount
import SSM.S3OutputLocation
import SSM.S3OutputUrl
import SSM.InstanceAssociationOutputUrl
import SSM.InstanceAggregatedAssociationOverview
import SSM.InventoryItemContentContext
import SSM.InventoryResultItemMap
import SSM.InventoryResultItem
import SSM.MaintenanceWindowRunCommandParameters
import SSM.MaintenanceWindowAutomationParameters
import SSM.MaintenanceWindowStepFunctionsParameters
import SSM.MaintenanceWindowLambdaParameters
import SSM.MaintenanceWindowTaskParameterValueExpression
import SSM.OpsAggregatorValueMap
import SSM.OpsEntityItemMap
import SSM.OpsEntityItem
import SSM.OpsItemDataValue
import SSM.ResourceDataSyncSourceWithState
import SSM.ResourceDataSyncDestinationDataSharing
import SSM.ResourceDataSyncAwsOrganizationsSource
import SSM.SessionManagerOutputUrl
import SSM.SessionManagerParameters
import SSM.NormalStringMap
import SSM.FailureDetails
import SSM.DocumentDefaultVersionDescription

typealias Account = String

typealias AccountId = String

typealias AccountIdList = Array<AccountId>

typealias AccountSharingInfoList = Array<AccountSharingInfo>

typealias Accounts = Array<Account>

typealias ActivationCode = String

typealias ActivationDescription = String

typealias ActivationId = String

typealias ActivationList = Array<Activation>

typealias AgentErrorCode = String

typealias AggregatorSchemaOnly = Boolean

typealias AllowedPattern = String

typealias ApproveAfterDays = Number

typealias AssociationDescriptionList = Array<AssociationDescription>

typealias AssociationExecutionFilterList = Array<AssociationExecutionFilter>

typealias AssociationExecutionFilterValue = String

typealias AssociationExecutionId = String

typealias AssociationExecutionTargetsFilterList = Array<AssociationExecutionTargetsFilter>

typealias AssociationExecutionTargetsFilterValue = String

typealias AssociationExecutionTargetsList = Array<AssociationExecutionTarget>

typealias AssociationExecutionsList = Array<AssociationExecution>

typealias AssociationFilterList = Array<AssociationFilter>

typealias AssociationFilterValue = String

typealias AssociationId = String

typealias AssociationIdList = Array<AssociationId>

typealias AssociationList = Array<Association>

typealias AssociationName = String

typealias AssociationResourceId = String

typealias AssociationResourceType = String

typealias AssociationVersion = String

typealias AssociationVersionList = Array<AssociationVersionInfo>

typealias AttachmentContentList = Array<AttachmentContent>

typealias AttachmentHash = String

typealias AttachmentIdentifier = String

typealias AttachmentInformationList = Array<AttachmentInformation>

typealias AttachmentName = String

typealias AttachmentUrl = String

typealias AttachmentsSourceList = Array<AttachmentsSource>

typealias AttachmentsSourceValue = String

typealias AttachmentsSourceValues = Array<AttachmentsSourceValue>

typealias AttributeName = String

typealias AttributeValue = String

typealias AutomationActionName = String

typealias AutomationExecutionFilterList = Array<AutomationExecutionFilter>

typealias AutomationExecutionFilterValue = String

typealias AutomationExecutionFilterValueList = Array<AutomationExecutionFilterValue>

typealias AutomationExecutionId = String

typealias AutomationExecutionMetadataList = Array<AutomationExecutionMetadata>

typealias AutomationParameterKey = String

typealias AutomationParameterValue = String

typealias AutomationParameterValueList = Array<AutomationParameterValue>

typealias AutomationTargetParameterName = String

typealias BaselineDescription = String

typealias BaselineId = String

typealias BaselineName = String

typealias BatchErrorMessage = String

typealias Boolean = Boolean

typealias CalendarNameOrARN = String

typealias CalendarNameOrARNList = Array<CalendarNameOrARN>

typealias ClientToken = String

typealias CloudWatchLogGroupName = String

typealias CloudWatchOutputEnabled = Boolean

typealias CommandFilterList = Array<CommandFilter>

typealias CommandFilterValue = String

typealias CommandId = String

typealias CommandInvocationList = Array<CommandInvocation>

typealias CommandList = Array<Command>

typealias CommandMaxResults = Number

typealias CommandPluginList = Array<CommandPlugin>

typealias CommandPluginName = String

typealias CommandPluginOutput = String

typealias Comment = String

typealias CompletedCount = Number

typealias ComplianceExecutionId = String

typealias ComplianceExecutionType = String

typealias ComplianceFilterValue = String

typealias ComplianceItemContentHash = String

typealias ComplianceItemEntryList = Array<ComplianceItemEntry>

typealias ComplianceItemId = String

typealias ComplianceItemList = Array<ComplianceItem>

typealias ComplianceItemTitle = String

typealias ComplianceResourceId = String

typealias ComplianceResourceIdList = Array<ComplianceResourceId>

typealias ComplianceResourceType = String

typealias ComplianceResourceTypeList = Array<ComplianceResourceType>

typealias ComplianceStringFilterKey = String

typealias ComplianceStringFilterList = Array<ComplianceStringFilter>

typealias ComplianceStringFilterValueList = Array<ComplianceFilterValue>

typealias ComplianceSummaryCount = Number

typealias ComplianceSummaryItemList = Array<ComplianceSummaryItem>

typealias ComplianceTypeName = String

typealias ComputerName = String

typealias ContentLength = Number

typealias CreateAssociationBatchRequestEntries = Array<CreateAssociationBatchRequestEntry>

typealias CreatedDate = Date

typealias DateTime = Date

typealias DefaultBaseline = Boolean

typealias DefaultInstanceName = String

typealias DeliveryTimedOutCount = Number

typealias DescribeActivationsFilterList = Array<DescribeActivationsFilter>

typealias DescriptionInDocument = String

typealias DocumentARN = String

typealias DocumentContent = String

typealias DocumentFilterList = Array<DocumentFilter>

typealias DocumentFilterValue = String

typealias DocumentHash = String

typealias DocumentIdentifierList = Array<DocumentIdentifier>

typealias DocumentKeyValuesFilterKey = String

typealias DocumentKeyValuesFilterList = Array<DocumentKeyValuesFilter>

typealias DocumentKeyValuesFilterValue = String

typealias DocumentKeyValuesFilterValues = Array<DocumentKeyValuesFilterValue>

typealias DocumentName = String

typealias DocumentOwner = String

typealias DocumentParameterDefaultValue = String

typealias DocumentParameterDescrption = String

typealias DocumentParameterList = Array<DocumentParameter>

typealias DocumentParameterName = String

typealias DocumentRequiresList = Array<DocumentRequires>

typealias DocumentSchemaVersion = String

typealias DocumentSha1 = String

typealias DocumentStatusInformation = String

typealias DocumentVersion = String

typealias DocumentVersionList = Array<DocumentVersionInfo>

typealias DocumentVersionName = String

typealias DocumentVersionNumber = String

typealias DryRun = Boolean

typealias EffectiveInstanceAssociationMaxResults = Number

typealias EffectivePatchList = Array<EffectivePatch>

typealias ErrorCount = Number

typealias ExecutionRoleName = String

typealias ExpirationDate = Date

typealias FailedCreateAssociationList = Array<FailedCreateAssociation>

typealias GetInventorySchemaMaxResults = Number

typealias GetParametersByPathMaxResults = Number

typealias IPAddress = String

typealias ISO8601String = String

typealias IamRole = String

typealias IdempotencyToken = String

typealias InstallOverrideList = String

typealias InstanceAssociationExecutionSummary = String

typealias InstanceAssociationList = Array<InstanceAssociation>

typealias InstanceAssociationStatusInfos = Array<InstanceAssociationStatusInfo>

typealias InstanceCount = Number

typealias InstanceId = String

typealias InstanceIdList = Array<InstanceId>

typealias InstanceInformationFilterList = Array<InstanceInformationFilter>

typealias InstanceInformationFilterValue = String

typealias InstanceInformationFilterValueSet = Array<InstanceInformationFilterValue>

typealias InstanceInformationList = Array<InstanceInformation>

typealias InstanceInformationStringFilterKey = String

typealias InstanceInformationStringFilterList = Array<InstanceInformationStringFilter>

typealias InstancePatchStateFilterKey = String

typealias InstancePatchStateFilterList = Array<InstancePatchStateFilter>

typealias InstancePatchStateFilterValue = String

typealias InstancePatchStateFilterValues = Array<InstancePatchStateFilterValue>

typealias InstancePatchStateList = Array<InstancePatchState>

typealias InstancePatchStatesList = Array<InstancePatchState>

typealias InstanceTagName = String

typealias InstancesCount = Number

typealias Integer = Number

typealias InventoryAggregatorExpression = String

typealias InventoryAggregatorList = Array<InventoryAggregator>

typealias InventoryDeletionId = String

typealias InventoryDeletionLastStatusMessage = String

typealias InventoryDeletionLastStatusUpdateTime = Date

typealias InventoryDeletionStartTime = Date

typealias InventoryDeletionSummaryItems = Array<InventoryDeletionSummaryItem>

typealias InventoryDeletionsList = Array<InventoryDeletionStatusItem>

typealias InventoryFilterKey = String

typealias InventoryFilterList = Array<InventoryFilter>

typealias InventoryFilterValue = String

typealias InventoryFilterValueList = Array<InventoryFilterValue>

typealias InventoryGroupList = Array<InventoryGroup>

typealias InventoryGroupName = String

typealias InventoryItemAttributeList = Array<InventoryItemAttribute>

typealias InventoryItemAttributeName = String

typealias InventoryItemCaptureTime = String

typealias InventoryItemContentHash = String

typealias InventoryItemEntryList = Array<InventoryItemEntry>

typealias InventoryItemList = Array<InventoryItem>

typealias InventoryItemSchemaResultList = Array<InventoryItemSchema>

typealias InventoryItemSchemaVersion = String

typealias InventoryItemTypeName = String

typealias InventoryItemTypeNameFilter = String

typealias InventoryResultEntityId = String

typealias InventoryResultEntityList = Array<InventoryResultEntity>

typealias InventoryResultItemKey = String

typealias InventoryTypeDisplayName = String

typealias InvocationTraceOutput = String

typealias IsSubTypeSchema = Boolean

typealias KeyList = Array<TagKey>

typealias LastResourceDataSyncMessage = String

typealias LastResourceDataSyncTime = Date

typealias LastSuccessfulResourceDataSyncTime = Date

typealias Long = Number

typealias MaintenanceWindowAllowUnassociatedTargets = Boolean

typealias MaintenanceWindowCutoff = Number

typealias MaintenanceWindowDescription = String

typealias MaintenanceWindowDurationHours = Number

typealias MaintenanceWindowEnabled = Boolean

typealias MaintenanceWindowExecutionId = String

typealias MaintenanceWindowExecutionList = Array<MaintenanceWindowExecution>

typealias MaintenanceWindowExecutionStatusDetails = String

typealias MaintenanceWindowExecutionTaskExecutionId = String

typealias MaintenanceWindowExecutionTaskId = String

typealias MaintenanceWindowExecutionTaskIdList = Array<MaintenanceWindowExecutionTaskId>

typealias MaintenanceWindowExecutionTaskIdentityList = Array<MaintenanceWindowExecutionTaskIdentity>

typealias MaintenanceWindowExecutionTaskInvocationId = String

typealias MaintenanceWindowExecutionTaskInvocationIdentityList = Array<MaintenanceWindowExecutionTaskInvocationIdentity>

typealias MaintenanceWindowExecutionTaskInvocationParameters = String

typealias MaintenanceWindowFilterKey = String

typealias MaintenanceWindowFilterList = Array<MaintenanceWindowFilter>

typealias MaintenanceWindowFilterValue = String

typealias MaintenanceWindowFilterValues = Array<MaintenanceWindowFilterValue>

typealias MaintenanceWindowId = String

typealias MaintenanceWindowIdentityList = Array<MaintenanceWindowIdentity>

typealias MaintenanceWindowLambdaClientContext = String

typealias MaintenanceWindowLambdaQualifier = String

typealias MaintenanceWindowMaxResults = Number

typealias MaintenanceWindowName = String

typealias MaintenanceWindowSchedule = String

typealias MaintenanceWindowSearchMaxResults = Number

typealias MaintenanceWindowStepFunctionsInput = String

typealias MaintenanceWindowStepFunctionsName = String

typealias MaintenanceWindowStringDateTime = String

typealias MaintenanceWindowTargetId = String

typealias MaintenanceWindowTargetList = Array<MaintenanceWindowTarget>

typealias MaintenanceWindowTaskArn = String

typealias MaintenanceWindowTaskId = String

typealias MaintenanceWindowTaskList = Array<MaintenanceWindowTask>

typealias MaintenanceWindowTaskParameterName = String

typealias MaintenanceWindowTaskParameterValue = String

typealias MaintenanceWindowTaskParameterValueList = Array<MaintenanceWindowTaskParameterValue>

typealias MaintenanceWindowTaskParametersList = Array<MaintenanceWindowTaskParameters>

typealias MaintenanceWindowTaskPriority = Number

typealias MaintenanceWindowTaskTargetId = String

typealias MaintenanceWindowTimezone = String

typealias MaintenanceWindowsForTargetList = Array<MaintenanceWindowIdentityForTarget>

typealias ManagedInstanceId = String

typealias MaxConcurrency = String

typealias MaxErrors = String

typealias MaxResults = Number

typealias MaxResultsEC2Compatible = Number

typealias NextToken = String

typealias NotificationArn = String

typealias NotificationEventList = Array<String /* "All" | "InProgress" | "Success" | "TimedOut" | "Cancelled" | "Failed" | String */>

typealias OpsAggregatorList = Array<OpsAggregator>

typealias OpsAggregatorType = String

typealias OpsAggregatorValue = String

typealias OpsAggregatorValueKey = String

typealias OpsDataAttributeName = String

typealias OpsDataTypeName = String

typealias OpsEntityId = String

typealias OpsEntityItemCaptureTime = String

typealias OpsEntityItemEntryList = Array<OpsEntityItemEntry>

typealias OpsEntityItemKey = String

typealias OpsEntityList = Array<OpsEntity>

typealias OpsFilterKey = String

typealias OpsFilterList = Array<OpsFilter>

typealias OpsFilterValue = String

typealias OpsFilterValueList = Array<OpsFilterValue>

typealias OpsItemCategory = String

typealias OpsItemDataKey = String

typealias OpsItemDataValueString = String

typealias OpsItemDescription = String

typealias OpsItemFilterValue = String

typealias OpsItemFilterValues = Array<OpsItemFilterValue>

typealias OpsItemFilters = Array<OpsItemFilter>

typealias OpsItemId = String

typealias OpsItemMaxResults = Number

typealias OpsItemNotifications = Array<OpsItemNotification>

typealias OpsItemOpsDataKeysList = Array<String>

typealias OpsItemPriority = Number

typealias OpsItemSeverity = String

typealias OpsItemSource = String

typealias OpsItemSummaries = Array<OpsItemSummary>

typealias OpsItemTitle = String

typealias OpsResultAttributeList = Array<OpsResultAttribute>

typealias OutputSourceId = String

typealias OutputSourceType = String

typealias OwnerInformation = String

typealias PSParameterName = String

typealias PSParameterSelector = String

typealias PSParameterValue = String

typealias PSParameterVersion = Number

typealias ParameterDescription = String

typealias ParameterHistoryList = Array<ParameterHistory>

typealias ParameterKeyId = String

typealias ParameterLabel = String

typealias ParameterLabelList = Array<ParameterLabel>

typealias ParameterList = Array<Parameter>

typealias ParameterMetadataList = Array<ParameterMetadata>

typealias ParameterName = String

typealias ParameterNameList = Array<PSParameterName>

typealias ParameterPolicies = String

typealias ParameterPolicyList = Array<ParameterInlinePolicy>

typealias ParameterStringFilterKey = String

typealias ParameterStringFilterList = Array<ParameterStringFilter>

typealias ParameterStringFilterValue = String

typealias ParameterStringFilterValueList = Array<ParameterStringFilterValue>

typealias ParameterStringQueryOption = String

typealias ParameterValue = String

typealias ParameterValueList = Array<ParameterValue>

typealias ParametersFilterList = Array<ParametersFilter>

typealias ParametersFilterValue = String

typealias ParametersFilterValueList = Array<ParametersFilterValue>

typealias PatchBaselineIdentityList = Array<PatchBaselineIdentity>

typealias PatchBaselineMaxResults = Number

typealias PatchClassification = String

typealias PatchComplianceDataList = Array<PatchComplianceData>

typealias PatchComplianceMaxResults = Number

typealias PatchContentUrl = String

typealias PatchDescription = String

typealias PatchFailedCount = Number

typealias PatchFilterList = Array<PatchFilter>

typealias PatchFilterValue = String

typealias PatchFilterValueList = Array<PatchFilterValue>

typealias PatchGroup = String

typealias PatchGroupList = Array<PatchGroup>

typealias PatchGroupPatchBaselineMappingList = Array<PatchGroupPatchBaselineMapping>

typealias PatchId = String

typealias PatchIdList = Array<PatchId>

typealias PatchInstalledCount = Number

typealias PatchInstalledOtherCount = Number

typealias PatchInstalledPendingRebootCount = Number

typealias PatchInstalledRejectedCount = Number

typealias PatchKbNumber = String

typealias PatchLanguage = String

typealias PatchList = Array<Patch>

typealias PatchMissingCount = Number

typealias PatchMsrcNumber = String

typealias PatchMsrcSeverity = String

typealias PatchNotApplicableCount = Number

typealias PatchOrchestratorFilterKey = String

typealias PatchOrchestratorFilterList = Array<PatchOrchestratorFilter>

typealias PatchOrchestratorFilterValue = String

typealias PatchOrchestratorFilterValues = Array<PatchOrchestratorFilterValue>

typealias PatchProduct = String

typealias PatchProductFamily = String

typealias PatchPropertiesList = Array<PatchPropertyEntry>

typealias PatchRuleList = Array<PatchRule>

typealias PatchSeverity = String

typealias PatchSourceConfiguration = String

typealias PatchSourceList = Array<PatchSource>

typealias PatchSourceName = String

typealias PatchSourceProduct = String

typealias PatchSourceProductList = Array<PatchSourceProduct>

typealias PatchStringDateTime = String

typealias PatchTitle = String

typealias PatchUnreportedNotApplicableCount = Number

typealias PatchVendor = String

typealias PlatformTypeList = Array<String /* "Windows" | "Linux" | String */>

typealias Product = String

typealias PutInventoryMessage = String

typealias Region = String

typealias Regions = Array<Region>

typealias RegistrationLimit = Number

typealias RegistrationsCount = Number

typealias RelatedOpsItems = Array<RelatedOpsItem>

typealias RemainingCount = Number

typealias ResourceComplianceSummaryItemList = Array<ResourceComplianceSummaryItem>

typealias ResourceCount = Number

typealias ResourceCountByStatus = String

typealias ResourceDataSyncAWSKMSKeyARN = String

typealias ResourceDataSyncCreatedTime = Date

typealias ResourceDataSyncDestinationDataSharingType = String

typealias ResourceDataSyncIncludeFutureRegions = Boolean

typealias ResourceDataSyncItemList = Array<ResourceDataSyncItem>

typealias ResourceDataSyncLastModifiedTime = Date

typealias ResourceDataSyncName = String

typealias ResourceDataSyncOrganizationSourceType = String

typealias ResourceDataSyncOrganizationalUnitId = String

typealias ResourceDataSyncOrganizationalUnitList = Array<ResourceDataSyncOrganizationalUnit>

typealias ResourceDataSyncS3BucketName = String

typealias ResourceDataSyncS3Prefix = String

typealias ResourceDataSyncS3Region = String

typealias ResourceDataSyncSourceRegion = String

typealias ResourceDataSyncSourceRegionList = Array<ResourceDataSyncSourceRegion>

typealias ResourceDataSyncSourceType = String

typealias ResourceDataSyncState = String

typealias ResourceDataSyncType = String

typealias ResourceId = String

typealias ResponseCode = Number

typealias ResultAttributeList = Array<ResultAttribute>

typealias S3BucketName = String

typealias S3KeyPrefix = String

typealias S3Region = String

typealias ScheduleExpression = String

typealias ScheduledWindowExecutionList = Array<ScheduledWindowExecution>

typealias ServiceRole = String

typealias ServiceSettingId = String

typealias ServiceSettingValue = String

typealias SessionDetails = String

typealias SessionFilterList = Array<SessionFilter>

typealias SessionFilterValue = String

typealias SessionId = String

typealias SessionList = Array<Session>

typealias SessionManagerCloudWatchOutputUrl = String

typealias SessionManagerParameterName = String

typealias SessionManagerParameterValue = String

typealias SessionManagerParameterValueList = Array<SessionManagerParameterValue>

typealias SessionManagerS3OutputUrl = String

typealias SessionMaxResults = Number

typealias SessionOwner = String

typealias SessionTarget = String

typealias SharedDocumentVersion = String

typealias SnapshotDownloadUrl = String

typealias SnapshotId = String

typealias StandardErrorContent = String

typealias StandardOutputContent = String

typealias StatusAdditionalInfo = String

typealias StatusDetails = String

typealias StatusMessage = String

typealias StatusName = String

typealias StepExecutionFilterList = Array<StepExecutionFilter>

typealias StepExecutionFilterValue = String

typealias StepExecutionFilterValueList = Array<StepExecutionFilterValue>

typealias StepExecutionList = Array<StepExecution>

typealias StreamUrl = String

typealias String = String

typealias StringDateTime = String

typealias StringList = Array<String>

typealias TagKey = String

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TargetCount = Number

typealias TargetKey = String

typealias TargetLocations = Array<TargetLocation>

typealias TargetMapKey = String

typealias TargetMapValue = String

typealias TargetMapValueList = Array<TargetMapValue>

typealias TargetMaps = Array<TargetMap>

typealias TargetParameterList = Array<ParameterValue>

typealias TargetType = String

typealias TargetValue = String

typealias TargetValues = Array<TargetValue>

typealias Targets = Array<Target>

typealias TimeoutSeconds = Number

typealias TokenValue = String

typealias TotalCount = Number

typealias Url = String

typealias ValidNextStep = String

typealias ValidNextStepList = Array<ValidNextStep>

typealias Version = String

@JsModule("aws-sdk")
external open class SSM(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & SSM.Types.ClientConfiguration */
    open fun addTagsToResource(params: AddTagsToResourceRequest, callback: (err: AWSError, data: AddTagsToResourceResult) -> Unit = definedExternally): Request<AddTagsToResourceResult, AWSError>
    open fun addTagsToResource(callback: (err: AWSError, data: AddTagsToResourceResult) -> Unit = definedExternally): Request<AddTagsToResourceResult, AWSError>
    open fun cancelCommand(params: CancelCommandRequest, callback: (err: AWSError, data: CancelCommandResult) -> Unit = definedExternally): Request<CancelCommandResult, AWSError>
    open fun cancelCommand(callback: (err: AWSError, data: CancelCommandResult) -> Unit = definedExternally): Request<CancelCommandResult, AWSError>
    open fun cancelMaintenanceWindowExecution(params: CancelMaintenanceWindowExecutionRequest, callback: (err: AWSError, data: CancelMaintenanceWindowExecutionResult) -> Unit = definedExternally): Request<CancelMaintenanceWindowExecutionResult, AWSError>
    open fun cancelMaintenanceWindowExecution(callback: (err: AWSError, data: CancelMaintenanceWindowExecutionResult) -> Unit = definedExternally): Request<CancelMaintenanceWindowExecutionResult, AWSError>
    open fun createActivation(params: CreateActivationRequest, callback: (err: AWSError, data: CreateActivationResult) -> Unit = definedExternally): Request<CreateActivationResult, AWSError>
    open fun createActivation(callback: (err: AWSError, data: CreateActivationResult) -> Unit = definedExternally): Request<CreateActivationResult, AWSError>
    open fun createAssociation(params: CreateAssociationRequest, callback: (err: AWSError, data: CreateAssociationResult) -> Unit = definedExternally): Request<CreateAssociationResult, AWSError>
    open fun createAssociation(callback: (err: AWSError, data: CreateAssociationResult) -> Unit = definedExternally): Request<CreateAssociationResult, AWSError>
    open fun createAssociationBatch(params: CreateAssociationBatchRequest, callback: (err: AWSError, data: CreateAssociationBatchResult) -> Unit = definedExternally): Request<CreateAssociationBatchResult, AWSError>
    open fun createAssociationBatch(callback: (err: AWSError, data: CreateAssociationBatchResult) -> Unit = definedExternally): Request<CreateAssociationBatchResult, AWSError>
    open fun createDocument(params: CreateDocumentRequest, callback: (err: AWSError, data: CreateDocumentResult) -> Unit = definedExternally): Request<CreateDocumentResult, AWSError>
    open fun createDocument(callback: (err: AWSError, data: CreateDocumentResult) -> Unit = definedExternally): Request<CreateDocumentResult, AWSError>
    open fun createMaintenanceWindow(params: CreateMaintenanceWindowRequest, callback: (err: AWSError, data: CreateMaintenanceWindowResult) -> Unit = definedExternally): Request<CreateMaintenanceWindowResult, AWSError>
    open fun createMaintenanceWindow(callback: (err: AWSError, data: CreateMaintenanceWindowResult) -> Unit = definedExternally): Request<CreateMaintenanceWindowResult, AWSError>
    open fun createOpsItem(params: CreateOpsItemRequest, callback: (err: AWSError, data: CreateOpsItemResponse) -> Unit = definedExternally): Request<CreateOpsItemResponse, AWSError>
    open fun createOpsItem(callback: (err: AWSError, data: CreateOpsItemResponse) -> Unit = definedExternally): Request<CreateOpsItemResponse, AWSError>
    open fun createPatchBaseline(params: CreatePatchBaselineRequest, callback: (err: AWSError, data: CreatePatchBaselineResult) -> Unit = definedExternally): Request<CreatePatchBaselineResult, AWSError>
    open fun createPatchBaseline(callback: (err: AWSError, data: CreatePatchBaselineResult) -> Unit = definedExternally): Request<CreatePatchBaselineResult, AWSError>
    open fun createResourceDataSync(params: CreateResourceDataSyncRequest, callback: (err: AWSError, data: CreateResourceDataSyncResult) -> Unit = definedExternally): Request<CreateResourceDataSyncResult, AWSError>
    open fun createResourceDataSync(callback: (err: AWSError, data: CreateResourceDataSyncResult) -> Unit = definedExternally): Request<CreateResourceDataSyncResult, AWSError>
    open fun deleteActivation(params: DeleteActivationRequest, callback: (err: AWSError, data: DeleteActivationResult) -> Unit = definedExternally): Request<DeleteActivationResult, AWSError>
    open fun deleteActivation(callback: (err: AWSError, data: DeleteActivationResult) -> Unit = definedExternally): Request<DeleteActivationResult, AWSError>
    open fun deleteAssociation(params: DeleteAssociationRequest, callback: (err: AWSError, data: DeleteAssociationResult) -> Unit = definedExternally): Request<DeleteAssociationResult, AWSError>
    open fun deleteAssociation(callback: (err: AWSError, data: DeleteAssociationResult) -> Unit = definedExternally): Request<DeleteAssociationResult, AWSError>
    open fun deleteDocument(params: DeleteDocumentRequest, callback: (err: AWSError, data: DeleteDocumentResult) -> Unit = definedExternally): Request<DeleteDocumentResult, AWSError>
    open fun deleteDocument(callback: (err: AWSError, data: DeleteDocumentResult) -> Unit = definedExternally): Request<DeleteDocumentResult, AWSError>
    open fun deleteInventory(params: DeleteInventoryRequest, callback: (err: AWSError, data: DeleteInventoryResult) -> Unit = definedExternally): Request<DeleteInventoryResult, AWSError>
    open fun deleteInventory(callback: (err: AWSError, data: DeleteInventoryResult) -> Unit = definedExternally): Request<DeleteInventoryResult, AWSError>
    open fun deleteMaintenanceWindow(params: DeleteMaintenanceWindowRequest, callback: (err: AWSError, data: DeleteMaintenanceWindowResult) -> Unit = definedExternally): Request<DeleteMaintenanceWindowResult, AWSError>
    open fun deleteMaintenanceWindow(callback: (err: AWSError, data: DeleteMaintenanceWindowResult) -> Unit = definedExternally): Request<DeleteMaintenanceWindowResult, AWSError>
    open fun deleteParameter(params: DeleteParameterRequest, callback: (err: AWSError, data: DeleteParameterResult) -> Unit = definedExternally): Request<DeleteParameterResult, AWSError>
    open fun deleteParameter(callback: (err: AWSError, data: DeleteParameterResult) -> Unit = definedExternally): Request<DeleteParameterResult, AWSError>
    open fun deleteParameters(params: DeleteParametersRequest, callback: (err: AWSError, data: DeleteParametersResult) -> Unit = definedExternally): Request<DeleteParametersResult, AWSError>
    open fun deleteParameters(callback: (err: AWSError, data: DeleteParametersResult) -> Unit = definedExternally): Request<DeleteParametersResult, AWSError>
    open fun deletePatchBaseline(params: DeletePatchBaselineRequest, callback: (err: AWSError, data: DeletePatchBaselineResult) -> Unit = definedExternally): Request<DeletePatchBaselineResult, AWSError>
    open fun deletePatchBaseline(callback: (err: AWSError, data: DeletePatchBaselineResult) -> Unit = definedExternally): Request<DeletePatchBaselineResult, AWSError>
    open fun deleteResourceDataSync(params: DeleteResourceDataSyncRequest, callback: (err: AWSError, data: DeleteResourceDataSyncResult) -> Unit = definedExternally): Request<DeleteResourceDataSyncResult, AWSError>
    open fun deleteResourceDataSync(callback: (err: AWSError, data: DeleteResourceDataSyncResult) -> Unit = definedExternally): Request<DeleteResourceDataSyncResult, AWSError>
    open fun deregisterManagedInstance(params: DeregisterManagedInstanceRequest, callback: (err: AWSError, data: DeregisterManagedInstanceResult) -> Unit = definedExternally): Request<DeregisterManagedInstanceResult, AWSError>
    open fun deregisterManagedInstance(callback: (err: AWSError, data: DeregisterManagedInstanceResult) -> Unit = definedExternally): Request<DeregisterManagedInstanceResult, AWSError>
    open fun deregisterPatchBaselineForPatchGroup(params: DeregisterPatchBaselineForPatchGroupRequest, callback: (err: AWSError, data: DeregisterPatchBaselineForPatchGroupResult) -> Unit = definedExternally): Request<DeregisterPatchBaselineForPatchGroupResult, AWSError>
    open fun deregisterPatchBaselineForPatchGroup(callback: (err: AWSError, data: DeregisterPatchBaselineForPatchGroupResult) -> Unit = definedExternally): Request<DeregisterPatchBaselineForPatchGroupResult, AWSError>
    open fun deregisterTargetFromMaintenanceWindow(params: DeregisterTargetFromMaintenanceWindowRequest, callback: (err: AWSError, data: DeregisterTargetFromMaintenanceWindowResult) -> Unit = definedExternally): Request<DeregisterTargetFromMaintenanceWindowResult, AWSError>
    open fun deregisterTargetFromMaintenanceWindow(callback: (err: AWSError, data: DeregisterTargetFromMaintenanceWindowResult) -> Unit = definedExternally): Request<DeregisterTargetFromMaintenanceWindowResult, AWSError>
    open fun deregisterTaskFromMaintenanceWindow(params: DeregisterTaskFromMaintenanceWindowRequest, callback: (err: AWSError, data: DeregisterTaskFromMaintenanceWindowResult) -> Unit = definedExternally): Request<DeregisterTaskFromMaintenanceWindowResult, AWSError>
    open fun deregisterTaskFromMaintenanceWindow(callback: (err: AWSError, data: DeregisterTaskFromMaintenanceWindowResult) -> Unit = definedExternally): Request<DeregisterTaskFromMaintenanceWindowResult, AWSError>
    open fun describeActivations(params: DescribeActivationsRequest, callback: (err: AWSError, data: DescribeActivationsResult) -> Unit = definedExternally): Request<DescribeActivationsResult, AWSError>
    open fun describeActivations(callback: (err: AWSError, data: DescribeActivationsResult) -> Unit = definedExternally): Request<DescribeActivationsResult, AWSError>
    open fun describeAssociation(params: DescribeAssociationRequest, callback: (err: AWSError, data: DescribeAssociationResult) -> Unit = definedExternally): Request<DescribeAssociationResult, AWSError>
    open fun describeAssociation(callback: (err: AWSError, data: DescribeAssociationResult) -> Unit = definedExternally): Request<DescribeAssociationResult, AWSError>
    open fun describeAssociationExecutionTargets(params: DescribeAssociationExecutionTargetsRequest, callback: (err: AWSError, data: DescribeAssociationExecutionTargetsResult) -> Unit = definedExternally): Request<DescribeAssociationExecutionTargetsResult, AWSError>
    open fun describeAssociationExecutionTargets(callback: (err: AWSError, data: DescribeAssociationExecutionTargetsResult) -> Unit = definedExternally): Request<DescribeAssociationExecutionTargetsResult, AWSError>
    open fun describeAssociationExecutions(params: DescribeAssociationExecutionsRequest, callback: (err: AWSError, data: DescribeAssociationExecutionsResult) -> Unit = definedExternally): Request<DescribeAssociationExecutionsResult, AWSError>
    open fun describeAssociationExecutions(callback: (err: AWSError, data: DescribeAssociationExecutionsResult) -> Unit = definedExternally): Request<DescribeAssociationExecutionsResult, AWSError>
    open fun describeAutomationExecutions(params: DescribeAutomationExecutionsRequest, callback: (err: AWSError, data: DescribeAutomationExecutionsResult) -> Unit = definedExternally): Request<DescribeAutomationExecutionsResult, AWSError>
    open fun describeAutomationExecutions(callback: (err: AWSError, data: DescribeAutomationExecutionsResult) -> Unit = definedExternally): Request<DescribeAutomationExecutionsResult, AWSError>
    open fun describeAutomationStepExecutions(params: DescribeAutomationStepExecutionsRequest, callback: (err: AWSError, data: DescribeAutomationStepExecutionsResult) -> Unit = definedExternally): Request<DescribeAutomationStepExecutionsResult, AWSError>
    open fun describeAutomationStepExecutions(callback: (err: AWSError, data: DescribeAutomationStepExecutionsResult) -> Unit = definedExternally): Request<DescribeAutomationStepExecutionsResult, AWSError>
    open fun describeAvailablePatches(params: DescribeAvailablePatchesRequest, callback: (err: AWSError, data: DescribeAvailablePatchesResult) -> Unit = definedExternally): Request<DescribeAvailablePatchesResult, AWSError>
    open fun describeAvailablePatches(callback: (err: AWSError, data: DescribeAvailablePatchesResult) -> Unit = definedExternally): Request<DescribeAvailablePatchesResult, AWSError>
    open fun describeDocument(params: DescribeDocumentRequest, callback: (err: AWSError, data: DescribeDocumentResult) -> Unit = definedExternally): Request<DescribeDocumentResult, AWSError>
    open fun describeDocument(callback: (err: AWSError, data: DescribeDocumentResult) -> Unit = definedExternally): Request<DescribeDocumentResult, AWSError>
    open fun describeDocumentPermission(params: DescribeDocumentPermissionRequest, callback: (err: AWSError, data: DescribeDocumentPermissionResponse) -> Unit = definedExternally): Request<DescribeDocumentPermissionResponse, AWSError>
    open fun describeDocumentPermission(callback: (err: AWSError, data: DescribeDocumentPermissionResponse) -> Unit = definedExternally): Request<DescribeDocumentPermissionResponse, AWSError>
    open fun describeEffectiveInstanceAssociations(params: DescribeEffectiveInstanceAssociationsRequest, callback: (err: AWSError, data: DescribeEffectiveInstanceAssociationsResult) -> Unit = definedExternally): Request<DescribeEffectiveInstanceAssociationsResult, AWSError>
    open fun describeEffectiveInstanceAssociations(callback: (err: AWSError, data: DescribeEffectiveInstanceAssociationsResult) -> Unit = definedExternally): Request<DescribeEffectiveInstanceAssociationsResult, AWSError>
    open fun describeEffectivePatchesForPatchBaseline(params: DescribeEffectivePatchesForPatchBaselineRequest, callback: (err: AWSError, data: DescribeEffectivePatchesForPatchBaselineResult) -> Unit = definedExternally): Request<DescribeEffectivePatchesForPatchBaselineResult, AWSError>
    open fun describeEffectivePatchesForPatchBaseline(callback: (err: AWSError, data: DescribeEffectivePatchesForPatchBaselineResult) -> Unit = definedExternally): Request<DescribeEffectivePatchesForPatchBaselineResult, AWSError>
    open fun describeInstanceAssociationsStatus(params: DescribeInstanceAssociationsStatusRequest, callback: (err: AWSError, data: DescribeInstanceAssociationsStatusResult) -> Unit = definedExternally): Request<DescribeInstanceAssociationsStatusResult, AWSError>
    open fun describeInstanceAssociationsStatus(callback: (err: AWSError, data: DescribeInstanceAssociationsStatusResult) -> Unit = definedExternally): Request<DescribeInstanceAssociationsStatusResult, AWSError>
    open fun describeInstanceInformation(params: DescribeInstanceInformationRequest, callback: (err: AWSError, data: DescribeInstanceInformationResult) -> Unit = definedExternally): Request<DescribeInstanceInformationResult, AWSError>
    open fun describeInstanceInformation(callback: (err: AWSError, data: DescribeInstanceInformationResult) -> Unit = definedExternally): Request<DescribeInstanceInformationResult, AWSError>
    open fun describeInstancePatchStates(params: DescribeInstancePatchStatesRequest, callback: (err: AWSError, data: DescribeInstancePatchStatesResult) -> Unit = definedExternally): Request<DescribeInstancePatchStatesResult, AWSError>
    open fun describeInstancePatchStates(callback: (err: AWSError, data: DescribeInstancePatchStatesResult) -> Unit = definedExternally): Request<DescribeInstancePatchStatesResult, AWSError>
    open fun describeInstancePatchStatesForPatchGroup(params: DescribeInstancePatchStatesForPatchGroupRequest, callback: (err: AWSError, data: DescribeInstancePatchStatesForPatchGroupResult) -> Unit = definedExternally): Request<DescribeInstancePatchStatesForPatchGroupResult, AWSError>
    open fun describeInstancePatchStatesForPatchGroup(callback: (err: AWSError, data: DescribeInstancePatchStatesForPatchGroupResult) -> Unit = definedExternally): Request<DescribeInstancePatchStatesForPatchGroupResult, AWSError>
    open fun describeInstancePatches(params: DescribeInstancePatchesRequest, callback: (err: AWSError, data: DescribeInstancePatchesResult) -> Unit = definedExternally): Request<DescribeInstancePatchesResult, AWSError>
    open fun describeInstancePatches(callback: (err: AWSError, data: DescribeInstancePatchesResult) -> Unit = definedExternally): Request<DescribeInstancePatchesResult, AWSError>
    open fun describeInventoryDeletions(params: DescribeInventoryDeletionsRequest, callback: (err: AWSError, data: DescribeInventoryDeletionsResult) -> Unit = definedExternally): Request<DescribeInventoryDeletionsResult, AWSError>
    open fun describeInventoryDeletions(callback: (err: AWSError, data: DescribeInventoryDeletionsResult) -> Unit = definedExternally): Request<DescribeInventoryDeletionsResult, AWSError>
    open fun describeMaintenanceWindowExecutionTaskInvocations(params: DescribeMaintenanceWindowExecutionTaskInvocationsRequest, callback: (err: AWSError, data: DescribeMaintenanceWindowExecutionTaskInvocationsResult) -> Unit = definedExternally): Request<DescribeMaintenanceWindowExecutionTaskInvocationsResult, AWSError>
    open fun describeMaintenanceWindowExecutionTaskInvocations(callback: (err: AWSError, data: DescribeMaintenanceWindowExecutionTaskInvocationsResult) -> Unit = definedExternally): Request<DescribeMaintenanceWindowExecutionTaskInvocationsResult, AWSError>
    open fun describeMaintenanceWindowExecutionTasks(params: DescribeMaintenanceWindowExecutionTasksRequest, callback: (err: AWSError, data: DescribeMaintenanceWindowExecutionTasksResult) -> Unit = definedExternally): Request<DescribeMaintenanceWindowExecutionTasksResult, AWSError>
    open fun describeMaintenanceWindowExecutionTasks(callback: (err: AWSError, data: DescribeMaintenanceWindowExecutionTasksResult) -> Unit = definedExternally): Request<DescribeMaintenanceWindowExecutionTasksResult, AWSError>
    open fun describeMaintenanceWindowExecutions(params: DescribeMaintenanceWindowExecutionsRequest, callback: (err: AWSError, data: DescribeMaintenanceWindowExecutionsResult) -> Unit = definedExternally): Request<DescribeMaintenanceWindowExecutionsResult, AWSError>
    open fun describeMaintenanceWindowExecutions(callback: (err: AWSError, data: DescribeMaintenanceWindowExecutionsResult) -> Unit = definedExternally): Request<DescribeMaintenanceWindowExecutionsResult, AWSError>
    open fun describeMaintenanceWindowSchedule(params: DescribeMaintenanceWindowScheduleRequest, callback: (err: AWSError, data: DescribeMaintenanceWindowScheduleResult) -> Unit = definedExternally): Request<DescribeMaintenanceWindowScheduleResult, AWSError>
    open fun describeMaintenanceWindowSchedule(callback: (err: AWSError, data: DescribeMaintenanceWindowScheduleResult) -> Unit = definedExternally): Request<DescribeMaintenanceWindowScheduleResult, AWSError>
    open fun describeMaintenanceWindowTargets(params: DescribeMaintenanceWindowTargetsRequest, callback: (err: AWSError, data: DescribeMaintenanceWindowTargetsResult) -> Unit = definedExternally): Request<DescribeMaintenanceWindowTargetsResult, AWSError>
    open fun describeMaintenanceWindowTargets(callback: (err: AWSError, data: DescribeMaintenanceWindowTargetsResult) -> Unit = definedExternally): Request<DescribeMaintenanceWindowTargetsResult, AWSError>
    open fun describeMaintenanceWindowTasks(params: DescribeMaintenanceWindowTasksRequest, callback: (err: AWSError, data: DescribeMaintenanceWindowTasksResult) -> Unit = definedExternally): Request<DescribeMaintenanceWindowTasksResult, AWSError>
    open fun describeMaintenanceWindowTasks(callback: (err: AWSError, data: DescribeMaintenanceWindowTasksResult) -> Unit = definedExternally): Request<DescribeMaintenanceWindowTasksResult, AWSError>
    open fun describeMaintenanceWindows(params: DescribeMaintenanceWindowsRequest, callback: (err: AWSError, data: DescribeMaintenanceWindowsResult) -> Unit = definedExternally): Request<DescribeMaintenanceWindowsResult, AWSError>
    open fun describeMaintenanceWindows(callback: (err: AWSError, data: DescribeMaintenanceWindowsResult) -> Unit = definedExternally): Request<DescribeMaintenanceWindowsResult, AWSError>
    open fun describeMaintenanceWindowsForTarget(params: DescribeMaintenanceWindowsForTargetRequest, callback: (err: AWSError, data: DescribeMaintenanceWindowsForTargetResult) -> Unit = definedExternally): Request<DescribeMaintenanceWindowsForTargetResult, AWSError>
    open fun describeMaintenanceWindowsForTarget(callback: (err: AWSError, data: DescribeMaintenanceWindowsForTargetResult) -> Unit = definedExternally): Request<DescribeMaintenanceWindowsForTargetResult, AWSError>
    open fun describeOpsItems(params: DescribeOpsItemsRequest, callback: (err: AWSError, data: DescribeOpsItemsResponse) -> Unit = definedExternally): Request<DescribeOpsItemsResponse, AWSError>
    open fun describeOpsItems(callback: (err: AWSError, data: DescribeOpsItemsResponse) -> Unit = definedExternally): Request<DescribeOpsItemsResponse, AWSError>
    open fun describeParameters(params: DescribeParametersRequest, callback: (err: AWSError, data: DescribeParametersResult) -> Unit = definedExternally): Request<DescribeParametersResult, AWSError>
    open fun describeParameters(callback: (err: AWSError, data: DescribeParametersResult) -> Unit = definedExternally): Request<DescribeParametersResult, AWSError>
    open fun describePatchBaselines(params: DescribePatchBaselinesRequest, callback: (err: AWSError, data: DescribePatchBaselinesResult) -> Unit = definedExternally): Request<DescribePatchBaselinesResult, AWSError>
    open fun describePatchBaselines(callback: (err: AWSError, data: DescribePatchBaselinesResult) -> Unit = definedExternally): Request<DescribePatchBaselinesResult, AWSError>
    open fun describePatchGroupState(params: DescribePatchGroupStateRequest, callback: (err: AWSError, data: DescribePatchGroupStateResult) -> Unit = definedExternally): Request<DescribePatchGroupStateResult, AWSError>
    open fun describePatchGroupState(callback: (err: AWSError, data: DescribePatchGroupStateResult) -> Unit = definedExternally): Request<DescribePatchGroupStateResult, AWSError>
    open fun describePatchGroups(params: DescribePatchGroupsRequest, callback: (err: AWSError, data: DescribePatchGroupsResult) -> Unit = definedExternally): Request<DescribePatchGroupsResult, AWSError>
    open fun describePatchGroups(callback: (err: AWSError, data: DescribePatchGroupsResult) -> Unit = definedExternally): Request<DescribePatchGroupsResult, AWSError>
    open fun describePatchProperties(params: DescribePatchPropertiesRequest, callback: (err: AWSError, data: DescribePatchPropertiesResult) -> Unit = definedExternally): Request<DescribePatchPropertiesResult, AWSError>
    open fun describePatchProperties(callback: (err: AWSError, data: DescribePatchPropertiesResult) -> Unit = definedExternally): Request<DescribePatchPropertiesResult, AWSError>
    open fun describeSessions(params: DescribeSessionsRequest, callback: (err: AWSError, data: DescribeSessionsResponse) -> Unit = definedExternally): Request<DescribeSessionsResponse, AWSError>
    open fun describeSessions(callback: (err: AWSError, data: DescribeSessionsResponse) -> Unit = definedExternally): Request<DescribeSessionsResponse, AWSError>
    open fun getAutomationExecution(params: GetAutomationExecutionRequest, callback: (err: AWSError, data: GetAutomationExecutionResult) -> Unit = definedExternally): Request<GetAutomationExecutionResult, AWSError>
    open fun getAutomationExecution(callback: (err: AWSError, data: GetAutomationExecutionResult) -> Unit = definedExternally): Request<GetAutomationExecutionResult, AWSError>
    open fun getCalendarState(params: GetCalendarStateRequest, callback: (err: AWSError, data: GetCalendarStateResponse) -> Unit = definedExternally): Request<GetCalendarStateResponse, AWSError>
    open fun getCalendarState(callback: (err: AWSError, data: GetCalendarStateResponse) -> Unit = definedExternally): Request<GetCalendarStateResponse, AWSError>
    open fun getCommandInvocation(params: GetCommandInvocationRequest, callback: (err: AWSError, data: GetCommandInvocationResult) -> Unit = definedExternally): Request<GetCommandInvocationResult, AWSError>
    open fun getCommandInvocation(callback: (err: AWSError, data: GetCommandInvocationResult) -> Unit = definedExternally): Request<GetCommandInvocationResult, AWSError>
    open fun getConnectionStatus(params: GetConnectionStatusRequest, callback: (err: AWSError, data: GetConnectionStatusResponse) -> Unit = definedExternally): Request<GetConnectionStatusResponse, AWSError>
    open fun getConnectionStatus(callback: (err: AWSError, data: GetConnectionStatusResponse) -> Unit = definedExternally): Request<GetConnectionStatusResponse, AWSError>
    open fun getDefaultPatchBaseline(params: GetDefaultPatchBaselineRequest, callback: (err: AWSError, data: GetDefaultPatchBaselineResult) -> Unit = definedExternally): Request<GetDefaultPatchBaselineResult, AWSError>
    open fun getDefaultPatchBaseline(callback: (err: AWSError, data: GetDefaultPatchBaselineResult) -> Unit = definedExternally): Request<GetDefaultPatchBaselineResult, AWSError>
    open fun getDeployablePatchSnapshotForInstance(params: GetDeployablePatchSnapshotForInstanceRequest, callback: (err: AWSError, data: GetDeployablePatchSnapshotForInstanceResult) -> Unit = definedExternally): Request<GetDeployablePatchSnapshotForInstanceResult, AWSError>
    open fun getDeployablePatchSnapshotForInstance(callback: (err: AWSError, data: GetDeployablePatchSnapshotForInstanceResult) -> Unit = definedExternally): Request<GetDeployablePatchSnapshotForInstanceResult, AWSError>
    open fun getDocument(params: GetDocumentRequest, callback: (err: AWSError, data: GetDocumentResult) -> Unit = definedExternally): Request<GetDocumentResult, AWSError>
    open fun getDocument(callback: (err: AWSError, data: GetDocumentResult) -> Unit = definedExternally): Request<GetDocumentResult, AWSError>
    open fun getInventory(params: GetInventoryRequest, callback: (err: AWSError, data: GetInventoryResult) -> Unit = definedExternally): Request<GetInventoryResult, AWSError>
    open fun getInventory(callback: (err: AWSError, data: GetInventoryResult) -> Unit = definedExternally): Request<GetInventoryResult, AWSError>
    open fun getInventorySchema(params: GetInventorySchemaRequest, callback: (err: AWSError, data: GetInventorySchemaResult) -> Unit = definedExternally): Request<GetInventorySchemaResult, AWSError>
    open fun getInventorySchema(callback: (err: AWSError, data: GetInventorySchemaResult) -> Unit = definedExternally): Request<GetInventorySchemaResult, AWSError>
    open fun getMaintenanceWindow(params: GetMaintenanceWindowRequest, callback: (err: AWSError, data: GetMaintenanceWindowResult) -> Unit = definedExternally): Request<GetMaintenanceWindowResult, AWSError>
    open fun getMaintenanceWindow(callback: (err: AWSError, data: GetMaintenanceWindowResult) -> Unit = definedExternally): Request<GetMaintenanceWindowResult, AWSError>
    open fun getMaintenanceWindowExecution(params: GetMaintenanceWindowExecutionRequest, callback: (err: AWSError, data: GetMaintenanceWindowExecutionResult) -> Unit = definedExternally): Request<GetMaintenanceWindowExecutionResult, AWSError>
    open fun getMaintenanceWindowExecution(callback: (err: AWSError, data: GetMaintenanceWindowExecutionResult) -> Unit = definedExternally): Request<GetMaintenanceWindowExecutionResult, AWSError>
    open fun getMaintenanceWindowExecutionTask(params: GetMaintenanceWindowExecutionTaskRequest, callback: (err: AWSError, data: GetMaintenanceWindowExecutionTaskResult) -> Unit = definedExternally): Request<GetMaintenanceWindowExecutionTaskResult, AWSError>
    open fun getMaintenanceWindowExecutionTask(callback: (err: AWSError, data: GetMaintenanceWindowExecutionTaskResult) -> Unit = definedExternally): Request<GetMaintenanceWindowExecutionTaskResult, AWSError>
    open fun getMaintenanceWindowExecutionTaskInvocation(params: GetMaintenanceWindowExecutionTaskInvocationRequest, callback: (err: AWSError, data: GetMaintenanceWindowExecutionTaskInvocationResult) -> Unit = definedExternally): Request<GetMaintenanceWindowExecutionTaskInvocationResult, AWSError>
    open fun getMaintenanceWindowExecutionTaskInvocation(callback: (err: AWSError, data: GetMaintenanceWindowExecutionTaskInvocationResult) -> Unit = definedExternally): Request<GetMaintenanceWindowExecutionTaskInvocationResult, AWSError>
    open fun getMaintenanceWindowTask(params: GetMaintenanceWindowTaskRequest, callback: (err: AWSError, data: GetMaintenanceWindowTaskResult) -> Unit = definedExternally): Request<GetMaintenanceWindowTaskResult, AWSError>
    open fun getMaintenanceWindowTask(callback: (err: AWSError, data: GetMaintenanceWindowTaskResult) -> Unit = definedExternally): Request<GetMaintenanceWindowTaskResult, AWSError>
    open fun getOpsItem(params: GetOpsItemRequest, callback: (err: AWSError, data: GetOpsItemResponse) -> Unit = definedExternally): Request<GetOpsItemResponse, AWSError>
    open fun getOpsItem(callback: (err: AWSError, data: GetOpsItemResponse) -> Unit = definedExternally): Request<GetOpsItemResponse, AWSError>
    open fun getOpsSummary(params: GetOpsSummaryRequest, callback: (err: AWSError, data: GetOpsSummaryResult) -> Unit = definedExternally): Request<GetOpsSummaryResult, AWSError>
    open fun getOpsSummary(callback: (err: AWSError, data: GetOpsSummaryResult) -> Unit = definedExternally): Request<GetOpsSummaryResult, AWSError>
    open fun getParameter(params: GetParameterRequest, callback: (err: AWSError, data: GetParameterResult) -> Unit = definedExternally): Request<GetParameterResult, AWSError>
    open fun getParameter(callback: (err: AWSError, data: GetParameterResult) -> Unit = definedExternally): Request<GetParameterResult, AWSError>
    open fun getParameterHistory(params: GetParameterHistoryRequest, callback: (err: AWSError, data: GetParameterHistoryResult) -> Unit = definedExternally): Request<GetParameterHistoryResult, AWSError>
    open fun getParameterHistory(callback: (err: AWSError, data: GetParameterHistoryResult) -> Unit = definedExternally): Request<GetParameterHistoryResult, AWSError>
    open fun getParameters(params: GetParametersRequest, callback: (err: AWSError, data: GetParametersResult) -> Unit = definedExternally): Request<GetParametersResult, AWSError>
    open fun getParameters(callback: (err: AWSError, data: GetParametersResult) -> Unit = definedExternally): Request<GetParametersResult, AWSError>
    open fun getParametersByPath(params: GetParametersByPathRequest, callback: (err: AWSError, data: GetParametersByPathResult) -> Unit = definedExternally): Request<GetParametersByPathResult, AWSError>
    open fun getParametersByPath(callback: (err: AWSError, data: GetParametersByPathResult) -> Unit = definedExternally): Request<GetParametersByPathResult, AWSError>
    open fun getPatchBaseline(params: GetPatchBaselineRequest, callback: (err: AWSError, data: GetPatchBaselineResult) -> Unit = definedExternally): Request<GetPatchBaselineResult, AWSError>
    open fun getPatchBaseline(callback: (err: AWSError, data: GetPatchBaselineResult) -> Unit = definedExternally): Request<GetPatchBaselineResult, AWSError>
    open fun getPatchBaselineForPatchGroup(params: GetPatchBaselineForPatchGroupRequest, callback: (err: AWSError, data: GetPatchBaselineForPatchGroupResult) -> Unit = definedExternally): Request<GetPatchBaselineForPatchGroupResult, AWSError>
    open fun getPatchBaselineForPatchGroup(callback: (err: AWSError, data: GetPatchBaselineForPatchGroupResult) -> Unit = definedExternally): Request<GetPatchBaselineForPatchGroupResult, AWSError>
    open fun getServiceSetting(params: GetServiceSettingRequest, callback: (err: AWSError, data: GetServiceSettingResult) -> Unit = definedExternally): Request<GetServiceSettingResult, AWSError>
    open fun getServiceSetting(callback: (err: AWSError, data: GetServiceSettingResult) -> Unit = definedExternally): Request<GetServiceSettingResult, AWSError>
    open fun labelParameterVersion(params: LabelParameterVersionRequest, callback: (err: AWSError, data: LabelParameterVersionResult) -> Unit = definedExternally): Request<LabelParameterVersionResult, AWSError>
    open fun labelParameterVersion(callback: (err: AWSError, data: LabelParameterVersionResult) -> Unit = definedExternally): Request<LabelParameterVersionResult, AWSError>
    open fun listAssociationVersions(params: ListAssociationVersionsRequest, callback: (err: AWSError, data: ListAssociationVersionsResult) -> Unit = definedExternally): Request<ListAssociationVersionsResult, AWSError>
    open fun listAssociationVersions(callback: (err: AWSError, data: ListAssociationVersionsResult) -> Unit = definedExternally): Request<ListAssociationVersionsResult, AWSError>
    open fun listAssociations(params: ListAssociationsRequest, callback: (err: AWSError, data: ListAssociationsResult) -> Unit = definedExternally): Request<ListAssociationsResult, AWSError>
    open fun listAssociations(callback: (err: AWSError, data: ListAssociationsResult) -> Unit = definedExternally): Request<ListAssociationsResult, AWSError>
    open fun listCommandInvocations(params: ListCommandInvocationsRequest, callback: (err: AWSError, data: ListCommandInvocationsResult) -> Unit = definedExternally): Request<ListCommandInvocationsResult, AWSError>
    open fun listCommandInvocations(callback: (err: AWSError, data: ListCommandInvocationsResult) -> Unit = definedExternally): Request<ListCommandInvocationsResult, AWSError>
    open fun listCommands(params: ListCommandsRequest, callback: (err: AWSError, data: ListCommandsResult) -> Unit = definedExternally): Request<ListCommandsResult, AWSError>
    open fun listCommands(callback: (err: AWSError, data: ListCommandsResult) -> Unit = definedExternally): Request<ListCommandsResult, AWSError>
    open fun listComplianceItems(params: ListComplianceItemsRequest, callback: (err: AWSError, data: ListComplianceItemsResult) -> Unit = definedExternally): Request<ListComplianceItemsResult, AWSError>
    open fun listComplianceItems(callback: (err: AWSError, data: ListComplianceItemsResult) -> Unit = definedExternally): Request<ListComplianceItemsResult, AWSError>
    open fun listComplianceSummaries(params: ListComplianceSummariesRequest, callback: (err: AWSError, data: ListComplianceSummariesResult) -> Unit = definedExternally): Request<ListComplianceSummariesResult, AWSError>
    open fun listComplianceSummaries(callback: (err: AWSError, data: ListComplianceSummariesResult) -> Unit = definedExternally): Request<ListComplianceSummariesResult, AWSError>
    open fun listDocumentVersions(params: ListDocumentVersionsRequest, callback: (err: AWSError, data: ListDocumentVersionsResult) -> Unit = definedExternally): Request<ListDocumentVersionsResult, AWSError>
    open fun listDocumentVersions(callback: (err: AWSError, data: ListDocumentVersionsResult) -> Unit = definedExternally): Request<ListDocumentVersionsResult, AWSError>
    open fun listDocuments(params: ListDocumentsRequest, callback: (err: AWSError, data: ListDocumentsResult) -> Unit = definedExternally): Request<ListDocumentsResult, AWSError>
    open fun listDocuments(callback: (err: AWSError, data: ListDocumentsResult) -> Unit = definedExternally): Request<ListDocumentsResult, AWSError>
    open fun listInventoryEntries(params: ListInventoryEntriesRequest, callback: (err: AWSError, data: ListInventoryEntriesResult) -> Unit = definedExternally): Request<ListInventoryEntriesResult, AWSError>
    open fun listInventoryEntries(callback: (err: AWSError, data: ListInventoryEntriesResult) -> Unit = definedExternally): Request<ListInventoryEntriesResult, AWSError>
    open fun listResourceComplianceSummaries(params: ListResourceComplianceSummariesRequest, callback: (err: AWSError, data: ListResourceComplianceSummariesResult) -> Unit = definedExternally): Request<ListResourceComplianceSummariesResult, AWSError>
    open fun listResourceComplianceSummaries(callback: (err: AWSError, data: ListResourceComplianceSummariesResult) -> Unit = definedExternally): Request<ListResourceComplianceSummariesResult, AWSError>
    open fun listResourceDataSync(params: ListResourceDataSyncRequest, callback: (err: AWSError, data: ListResourceDataSyncResult) -> Unit = definedExternally): Request<ListResourceDataSyncResult, AWSError>
    open fun listResourceDataSync(callback: (err: AWSError, data: ListResourceDataSyncResult) -> Unit = definedExternally): Request<ListResourceDataSyncResult, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResult) -> Unit = definedExternally): Request<ListTagsForResourceResult, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResult) -> Unit = definedExternally): Request<ListTagsForResourceResult, AWSError>
    open fun modifyDocumentPermission(params: ModifyDocumentPermissionRequest, callback: (err: AWSError, data: ModifyDocumentPermissionResponse) -> Unit = definedExternally): Request<ModifyDocumentPermissionResponse, AWSError>
    open fun modifyDocumentPermission(callback: (err: AWSError, data: ModifyDocumentPermissionResponse) -> Unit = definedExternally): Request<ModifyDocumentPermissionResponse, AWSError>
    open fun putComplianceItems(params: PutComplianceItemsRequest, callback: (err: AWSError, data: PutComplianceItemsResult) -> Unit = definedExternally): Request<PutComplianceItemsResult, AWSError>
    open fun putComplianceItems(callback: (err: AWSError, data: PutComplianceItemsResult) -> Unit = definedExternally): Request<PutComplianceItemsResult, AWSError>
    open fun putInventory(params: PutInventoryRequest, callback: (err: AWSError, data: PutInventoryResult) -> Unit = definedExternally): Request<PutInventoryResult, AWSError>
    open fun putInventory(callback: (err: AWSError, data: PutInventoryResult) -> Unit = definedExternally): Request<PutInventoryResult, AWSError>
    open fun putParameter(params: PutParameterRequest, callback: (err: AWSError, data: PutParameterResult) -> Unit = definedExternally): Request<PutParameterResult, AWSError>
    open fun putParameter(callback: (err: AWSError, data: PutParameterResult) -> Unit = definedExternally): Request<PutParameterResult, AWSError>
    open fun registerDefaultPatchBaseline(params: RegisterDefaultPatchBaselineRequest, callback: (err: AWSError, data: RegisterDefaultPatchBaselineResult) -> Unit = definedExternally): Request<RegisterDefaultPatchBaselineResult, AWSError>
    open fun registerDefaultPatchBaseline(callback: (err: AWSError, data: RegisterDefaultPatchBaselineResult) -> Unit = definedExternally): Request<RegisterDefaultPatchBaselineResult, AWSError>
    open fun registerPatchBaselineForPatchGroup(params: RegisterPatchBaselineForPatchGroupRequest, callback: (err: AWSError, data: RegisterPatchBaselineForPatchGroupResult) -> Unit = definedExternally): Request<RegisterPatchBaselineForPatchGroupResult, AWSError>
    open fun registerPatchBaselineForPatchGroup(callback: (err: AWSError, data: RegisterPatchBaselineForPatchGroupResult) -> Unit = definedExternally): Request<RegisterPatchBaselineForPatchGroupResult, AWSError>
    open fun registerTargetWithMaintenanceWindow(params: RegisterTargetWithMaintenanceWindowRequest, callback: (err: AWSError, data: RegisterTargetWithMaintenanceWindowResult) -> Unit = definedExternally): Request<RegisterTargetWithMaintenanceWindowResult, AWSError>
    open fun registerTargetWithMaintenanceWindow(callback: (err: AWSError, data: RegisterTargetWithMaintenanceWindowResult) -> Unit = definedExternally): Request<RegisterTargetWithMaintenanceWindowResult, AWSError>
    open fun registerTaskWithMaintenanceWindow(params: RegisterTaskWithMaintenanceWindowRequest, callback: (err: AWSError, data: RegisterTaskWithMaintenanceWindowResult) -> Unit = definedExternally): Request<RegisterTaskWithMaintenanceWindowResult, AWSError>
    open fun registerTaskWithMaintenanceWindow(callback: (err: AWSError, data: RegisterTaskWithMaintenanceWindowResult) -> Unit = definedExternally): Request<RegisterTaskWithMaintenanceWindowResult, AWSError>
    open fun removeTagsFromResource(params: RemoveTagsFromResourceRequest, callback: (err: AWSError, data: RemoveTagsFromResourceResult) -> Unit = definedExternally): Request<RemoveTagsFromResourceResult, AWSError>
    open fun removeTagsFromResource(callback: (err: AWSError, data: RemoveTagsFromResourceResult) -> Unit = definedExternally): Request<RemoveTagsFromResourceResult, AWSError>
    open fun resetServiceSetting(params: ResetServiceSettingRequest, callback: (err: AWSError, data: ResetServiceSettingResult) -> Unit = definedExternally): Request<ResetServiceSettingResult, AWSError>
    open fun resetServiceSetting(callback: (err: AWSError, data: ResetServiceSettingResult) -> Unit = definedExternally): Request<ResetServiceSettingResult, AWSError>
    open fun resumeSession(params: ResumeSessionRequest, callback: (err: AWSError, data: ResumeSessionResponse) -> Unit = definedExternally): Request<ResumeSessionResponse, AWSError>
    open fun resumeSession(callback: (err: AWSError, data: ResumeSessionResponse) -> Unit = definedExternally): Request<ResumeSessionResponse, AWSError>
    open fun sendAutomationSignal(params: SendAutomationSignalRequest, callback: (err: AWSError, data: SendAutomationSignalResult) -> Unit = definedExternally): Request<SendAutomationSignalResult, AWSError>
    open fun sendAutomationSignal(callback: (err: AWSError, data: SendAutomationSignalResult) -> Unit = definedExternally): Request<SendAutomationSignalResult, AWSError>
    open fun sendCommand(params: SendCommandRequest, callback: (err: AWSError, data: SendCommandResult) -> Unit = definedExternally): Request<SendCommandResult, AWSError>
    open fun sendCommand(callback: (err: AWSError, data: SendCommandResult) -> Unit = definedExternally): Request<SendCommandResult, AWSError>
    open fun startAssociationsOnce(params: StartAssociationsOnceRequest, callback: (err: AWSError, data: StartAssociationsOnceResult) -> Unit = definedExternally): Request<StartAssociationsOnceResult, AWSError>
    open fun startAssociationsOnce(callback: (err: AWSError, data: StartAssociationsOnceResult) -> Unit = definedExternally): Request<StartAssociationsOnceResult, AWSError>
    open fun startAutomationExecution(params: StartAutomationExecutionRequest, callback: (err: AWSError, data: StartAutomationExecutionResult) -> Unit = definedExternally): Request<StartAutomationExecutionResult, AWSError>
    open fun startAutomationExecution(callback: (err: AWSError, data: StartAutomationExecutionResult) -> Unit = definedExternally): Request<StartAutomationExecutionResult, AWSError>
    open fun startSession(params: StartSessionRequest, callback: (err: AWSError, data: StartSessionResponse) -> Unit = definedExternally): Request<StartSessionResponse, AWSError>
    open fun startSession(callback: (err: AWSError, data: StartSessionResponse) -> Unit = definedExternally): Request<StartSessionResponse, AWSError>
    open fun stopAutomationExecution(params: StopAutomationExecutionRequest, callback: (err: AWSError, data: StopAutomationExecutionResult) -> Unit = definedExternally): Request<StopAutomationExecutionResult, AWSError>
    open fun stopAutomationExecution(callback: (err: AWSError, data: StopAutomationExecutionResult) -> Unit = definedExternally): Request<StopAutomationExecutionResult, AWSError>
    open fun terminateSession(params: TerminateSessionRequest, callback: (err: AWSError, data: TerminateSessionResponse) -> Unit = definedExternally): Request<TerminateSessionResponse, AWSError>
    open fun terminateSession(callback: (err: AWSError, data: TerminateSessionResponse) -> Unit = definedExternally): Request<TerminateSessionResponse, AWSError>
    open fun updateAssociation(params: UpdateAssociationRequest, callback: (err: AWSError, data: UpdateAssociationResult) -> Unit = definedExternally): Request<UpdateAssociationResult, AWSError>
    open fun updateAssociation(callback: (err: AWSError, data: UpdateAssociationResult) -> Unit = definedExternally): Request<UpdateAssociationResult, AWSError>
    open fun updateAssociationStatus(params: UpdateAssociationStatusRequest, callback: (err: AWSError, data: UpdateAssociationStatusResult) -> Unit = definedExternally): Request<UpdateAssociationStatusResult, AWSError>
    open fun updateAssociationStatus(callback: (err: AWSError, data: UpdateAssociationStatusResult) -> Unit = definedExternally): Request<UpdateAssociationStatusResult, AWSError>
    open fun updateDocument(params: UpdateDocumentRequest, callback: (err: AWSError, data: UpdateDocumentResult) -> Unit = definedExternally): Request<UpdateDocumentResult, AWSError>
    open fun updateDocument(callback: (err: AWSError, data: UpdateDocumentResult) -> Unit = definedExternally): Request<UpdateDocumentResult, AWSError>
    open fun updateDocumentDefaultVersion(params: UpdateDocumentDefaultVersionRequest, callback: (err: AWSError, data: UpdateDocumentDefaultVersionResult) -> Unit = definedExternally): Request<UpdateDocumentDefaultVersionResult, AWSError>
    open fun updateDocumentDefaultVersion(callback: (err: AWSError, data: UpdateDocumentDefaultVersionResult) -> Unit = definedExternally): Request<UpdateDocumentDefaultVersionResult, AWSError>
    open fun updateMaintenanceWindow(params: UpdateMaintenanceWindowRequest, callback: (err: AWSError, data: UpdateMaintenanceWindowResult) -> Unit = definedExternally): Request<UpdateMaintenanceWindowResult, AWSError>
    open fun updateMaintenanceWindow(callback: (err: AWSError, data: UpdateMaintenanceWindowResult) -> Unit = definedExternally): Request<UpdateMaintenanceWindowResult, AWSError>
    open fun updateMaintenanceWindowTarget(params: UpdateMaintenanceWindowTargetRequest, callback: (err: AWSError, data: UpdateMaintenanceWindowTargetResult) -> Unit = definedExternally): Request<UpdateMaintenanceWindowTargetResult, AWSError>
    open fun updateMaintenanceWindowTarget(callback: (err: AWSError, data: UpdateMaintenanceWindowTargetResult) -> Unit = definedExternally): Request<UpdateMaintenanceWindowTargetResult, AWSError>
    open fun updateMaintenanceWindowTask(params: UpdateMaintenanceWindowTaskRequest, callback: (err: AWSError, data: UpdateMaintenanceWindowTaskResult) -> Unit = definedExternally): Request<UpdateMaintenanceWindowTaskResult, AWSError>
    open fun updateMaintenanceWindowTask(callback: (err: AWSError, data: UpdateMaintenanceWindowTaskResult) -> Unit = definedExternally): Request<UpdateMaintenanceWindowTaskResult, AWSError>
    open fun updateManagedInstanceRole(params: UpdateManagedInstanceRoleRequest, callback: (err: AWSError, data: UpdateManagedInstanceRoleResult) -> Unit = definedExternally): Request<UpdateManagedInstanceRoleResult, AWSError>
    open fun updateManagedInstanceRole(callback: (err: AWSError, data: UpdateManagedInstanceRoleResult) -> Unit = definedExternally): Request<UpdateManagedInstanceRoleResult, AWSError>
    open fun updateOpsItem(params: UpdateOpsItemRequest, callback: (err: AWSError, data: UpdateOpsItemResponse) -> Unit = definedExternally): Request<UpdateOpsItemResponse, AWSError>
    open fun updateOpsItem(callback: (err: AWSError, data: UpdateOpsItemResponse) -> Unit = definedExternally): Request<UpdateOpsItemResponse, AWSError>
    open fun updatePatchBaseline(params: UpdatePatchBaselineRequest, callback: (err: AWSError, data: UpdatePatchBaselineResult) -> Unit = definedExternally): Request<UpdatePatchBaselineResult, AWSError>
    open fun updatePatchBaseline(callback: (err: AWSError, data: UpdatePatchBaselineResult) -> Unit = definedExternally): Request<UpdatePatchBaselineResult, AWSError>
    open fun updateResourceDataSync(params: UpdateResourceDataSyncRequest, callback: (err: AWSError, data: UpdateResourceDataSyncResult) -> Unit = definedExternally): Request<UpdateResourceDataSyncResult, AWSError>
    open fun updateResourceDataSync(callback: (err: AWSError, data: UpdateResourceDataSyncResult) -> Unit = definedExternally): Request<UpdateResourceDataSyncResult, AWSError>
    open fun updateServiceSetting(params: UpdateServiceSettingRequest, callback: (err: AWSError, data: UpdateServiceSettingResult) -> Unit = definedExternally): Request<UpdateServiceSettingResult, AWSError>
    open fun updateServiceSetting(callback: (err: AWSError, data: UpdateServiceSettingResult) -> Unit = definedExternally): Request<UpdateServiceSettingResult, AWSError>
    interface AccountSharingInfo {
        var AccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var SharedDocumentVersion: SharedDocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Activation {
        var ActivationId: ActivationId?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ActivationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultInstanceName: DefaultInstanceName?
            get() = definedExternally
            set(value) = definedExternally
        var IamRole: IamRole?
            get() = definedExternally
            set(value) = definedExternally
        var RegistrationLimit: RegistrationLimit?
            get() = definedExternally
            set(value) = definedExternally
        var RegistrationsCount: RegistrationsCount?
            get() = definedExternally
            set(value) = definedExternally
        var ExpirationDate: ExpirationDate?
            get() = definedExternally
            set(value) = definedExternally
        var Expired: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: CreatedDate?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddTagsToResourceRequest {
        var ResourceType: String /* "Document" | "ManagedInstance" | "MaintenanceWindow" | "Parameter" | "PatchBaseline" | "OpsItem" | String */
        var ResourceId: ResourceId
        var Tags: TagList
    }
    interface AddTagsToResourceResult
    interface Association {
        var Name: DocumentARN?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationId: AssociationId?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationVersion: AssociationVersion?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: Targets?
            get() = definedExternally
            set(value) = definedExternally
        var LastExecutionDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Overview: AssociationOverview?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduleExpression: ScheduleExpression?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationName: AssociationName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociationDescription {
        var Name: DocumentARN?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationVersion: AssociationVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Date: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdateAssociationDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Status: AssociationStatus?
            get() = definedExternally
            set(value) = definedExternally
        var Overview: AssociationOverview?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var AutomationTargetParameterName: AutomationTargetParameterName?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: Parameters?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationId: AssociationId?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: Targets?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduleExpression: ScheduleExpression?
            get() = definedExternally
            set(value) = definedExternally
        var OutputLocation: InstanceAssociationOutputLocation?
            get() = definedExternally
            set(value) = definedExternally
        var LastExecutionDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastSuccessfulExecutionDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationName: AssociationName?
            get() = definedExternally
            set(value) = definedExternally
        var MaxErrors: MaxErrors?
            get() = definedExternally
            set(value) = definedExternally
        var MaxConcurrency: MaxConcurrency?
            get() = definedExternally
            set(value) = definedExternally
        var ComplianceSeverity: String /* "CRITICAL" | "HIGH" | "MEDIUM" | "LOW" | "UNSPECIFIED" | String */
    }
    interface AssociationExecution {
        var AssociationId: AssociationId?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationVersion: AssociationVersion?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionId: AssociationExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusName?
            get() = definedExternally
            set(value) = definedExternally
        var DetailedStatus: StatusName?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastExecutionDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceCountByStatus: ResourceCountByStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociationExecutionFilter {
        var Key: String /* "ExecutionId" | "Status" | "CreatedTime" | String */
        var Value: AssociationExecutionFilterValue
        var Type: String /* "EQUAL" | "LESS_THAN" | "GREATER_THAN" | String */
    }
    interface AssociationExecutionTarget {
        var AssociationId: AssociationId?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationVersion: AssociationVersion?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionId: AssociationExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: AssociationResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: AssociationResourceType?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusName?
            get() = definedExternally
            set(value) = definedExternally
        var DetailedStatus: StatusName?
            get() = definedExternally
            set(value) = definedExternally
        var LastExecutionDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var OutputSource: OutputSource?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociationExecutionTargetsFilter {
        var Key: String /* "Status" | "ResourceId" | "ResourceType" | String */
        var Value: AssociationExecutionTargetsFilterValue
    }
    interface AssociationFilter {
        var key: String /* "InstanceId" | "Name" | "AssociationId" | "AssociationStatusName" | "LastExecutedBefore" | "LastExecutedAfter" | "AssociationName" | String */
        var value: AssociationFilterValue
    }
    interface AssociationOverview {
        var Status: StatusName?
            get() = definedExternally
            set(value) = definedExternally
        var DetailedStatus: StatusName?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationStatusAggregatedCount: AssociationStatusAggregatedCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociationStatus {
        var Date: DateTime
        var Name: String /* "Pending" | "Success" | "Failed" | String */
        var Message: StatusMessage
        var AdditionalInfo: StatusAdditionalInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociationStatusAggregatedCount {
        @nativeGetter
        operator fun get(key: String): InstanceCount?
        @nativeSetter
        operator fun set(key: String, value: InstanceCount)
    }
    interface AssociationVersionInfo {
        var AssociationId: AssociationId?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationVersion: AssociationVersion?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Name: DocumentARN?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: Parameters?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: Targets?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduleExpression: ScheduleExpression?
            get() = definedExternally
            set(value) = definedExternally
        var OutputLocation: InstanceAssociationOutputLocation?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationName: AssociationName?
            get() = definedExternally
            set(value) = definedExternally
        var MaxErrors: MaxErrors?
            get() = definedExternally
            set(value) = definedExternally
        var MaxConcurrency: MaxConcurrency?
            get() = definedExternally
            set(value) = definedExternally
        var ComplianceSeverity: String /* "CRITICAL" | "HIGH" | "MEDIUM" | "LOW" | "UNSPECIFIED" | String */
    }
    interface AttachmentContent {
        var Name: AttachmentName?
            get() = definedExternally
            set(value) = definedExternally
        var Size: ContentLength?
            get() = definedExternally
            set(value) = definedExternally
        var Hash: AttachmentHash?
            get() = definedExternally
            set(value) = definedExternally
        var HashType: String /* "Sha256" | String */
        var Url: AttachmentUrl?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttachmentInformation {
        var Name: AttachmentName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttachmentsSource {
        var Key: String /* "SourceUrl" | "S3FileUrl" | "AttachmentReference" | String */
        var Values: AttachmentsSourceValues?
            get() = definedExternally
            set(value) = definedExternally
        var Name: AttachmentIdentifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutomationExecution {
        var AutomationExecutionId: AutomationExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentName: DocumentName?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionStartTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionEndTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var AutomationExecutionStatus: String /* "Pending" | "InProgress" | "Waiting" | "Success" | "TimedOut" | "Cancelling" | "Cancelled" | "Failed" | String */
        var StepExecutions: StepExecutionList?
            get() = definedExternally
            set(value) = definedExternally
        var StepExecutionsTruncated: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: AutomationParameterMap?
            get() = definedExternally
            set(value) = definedExternally
        var Outputs: AutomationParameterMap?
            get() = definedExternally
            set(value) = definedExternally
        var FailureMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var Mode: String /* "Auto" | "Interactive" | String */
        var ParentAutomationExecutionId: AutomationExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutedBy: String?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentStepName: String?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentAction: String?
            get() = definedExternally
            set(value) = definedExternally
        var TargetParameterName: AutomationParameterKey?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: Targets?
            get() = definedExternally
            set(value) = definedExternally
        var TargetMaps: TargetMaps?
            get() = definedExternally
            set(value) = definedExternally
        var ResolvedTargets: ResolvedTargets?
            get() = definedExternally
            set(value) = definedExternally
        var MaxConcurrency: MaxConcurrency?
            get() = definedExternally
            set(value) = definedExternally
        var MaxErrors: MaxErrors?
            get() = definedExternally
            set(value) = definedExternally
        var Target: String?
            get() = definedExternally
            set(value) = definedExternally
        var TargetLocations: TargetLocations?
            get() = definedExternally
            set(value) = definedExternally
        var ProgressCounters: ProgressCounters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutomationExecutionFilter {
        var Key: String /* "DocumentNamePrefix" | "ExecutionStatus" | "ExecutionId" | "ParentExecutionId" | "CurrentAction" | "StartTimeBefore" | "StartTimeAfter" | "AutomationType" | "TagKey" | String */
        var Values: AutomationExecutionFilterValueList
    }
    interface AutomationExecutionMetadata {
        var AutomationExecutionId: AutomationExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentName: DocumentName?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var AutomationExecutionStatus: String /* "Pending" | "InProgress" | "Waiting" | "Success" | "TimedOut" | "Cancelling" | "Cancelled" | "Failed" | String */
        var ExecutionStartTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionEndTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutedBy: String?
            get() = definedExternally
            set(value) = definedExternally
        var LogFile: String?
            get() = definedExternally
            set(value) = definedExternally
        var Outputs: AutomationParameterMap?
            get() = definedExternally
            set(value) = definedExternally
        var Mode: String /* "Auto" | "Interactive" | String */
        var ParentAutomationExecutionId: AutomationExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentStepName: String?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentAction: String?
            get() = definedExternally
            set(value) = definedExternally
        var FailureMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var TargetParameterName: AutomationParameterKey?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: Targets?
            get() = definedExternally
            set(value) = definedExternally
        var TargetMaps: TargetMaps?
            get() = definedExternally
            set(value) = definedExternally
        var ResolvedTargets: ResolvedTargets?
            get() = definedExternally
            set(value) = definedExternally
        var MaxConcurrency: MaxConcurrency?
            get() = definedExternally
            set(value) = definedExternally
        var MaxErrors: MaxErrors?
            get() = definedExternally
            set(value) = definedExternally
        var Target: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutomationType: String /* "CrossAccount" | "Local" | String */
    }
    interface AutomationParameterMap {
        @nativeGetter
        operator fun get(key: String): AutomationParameterValueList?
        @nativeSetter
        operator fun set(key: String, value: AutomationParameterValueList)
    }
    interface CancelCommandRequest {
        var CommandId: CommandId
        var InstanceIds: InstanceIdList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelCommandResult
    interface CancelMaintenanceWindowExecutionRequest {
        var WindowExecutionId: MaintenanceWindowExecutionId
    }
    interface CancelMaintenanceWindowExecutionResult {
        var WindowExecutionId: MaintenanceWindowExecutionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CloudWatchOutputConfig {
        var CloudWatchLogGroupName: CloudWatchLogGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchOutputEnabled: CloudWatchOutputEnabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Command {
        var CommandId: CommandId?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentName: DocumentName?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Comment: Comment?
            get() = definedExternally
            set(value) = definedExternally
        var ExpiresAfter: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: Parameters?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceIds: InstanceIdList?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: Targets?
            get() = definedExternally
            set(value) = definedExternally
        var RequestedDateTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Pending" | "InProgress" | "Success" | "Cancelled" | "Failed" | "TimedOut" | "Cancelling" | String */
        var StatusDetails: StatusDetails?
            get() = definedExternally
            set(value) = definedExternally
        var OutputS3Region: S3Region?
            get() = definedExternally
            set(value) = definedExternally
        var OutputS3BucketName: S3BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var OutputS3KeyPrefix: S3KeyPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var MaxConcurrency: MaxConcurrency?
            get() = definedExternally
            set(value) = definedExternally
        var MaxErrors: MaxErrors?
            get() = definedExternally
            set(value) = definedExternally
        var TargetCount: TargetCount?
            get() = definedExternally
            set(value) = definedExternally
        var CompletedCount: CompletedCount?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCount: ErrorCount?
            get() = definedExternally
            set(value) = definedExternally
        var DeliveryTimedOutCount: DeliveryTimedOutCount?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceRole: ServiceRole?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationConfig: NotificationConfig?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchOutputConfig: CloudWatchOutputConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CommandFilter {
        var key: String /* "InvokedAfter" | "InvokedBefore" | "Status" | "ExecutionStage" | "DocumentName" | String */
        var value: CommandFilterValue
    }
    interface CommandInvocation {
        var CommandId: CommandId?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceName: InstanceTagName?
            get() = definedExternally
            set(value) = definedExternally
        var Comment: Comment?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentName: DocumentName?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var RequestedDateTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Pending" | "InProgress" | "Delayed" | "Success" | "Cancelled" | "TimedOut" | "Failed" | "Cancelling" | String */
        var StatusDetails: StatusDetails?
            get() = definedExternally
            set(value) = definedExternally
        var TraceOutput: InvocationTraceOutput?
            get() = definedExternally
            set(value) = definedExternally
        var StandardOutputUrl: Url?
            get() = definedExternally
            set(value) = definedExternally
        var StandardErrorUrl: Url?
            get() = definedExternally
            set(value) = definedExternally
        var CommandPlugins: CommandPluginList?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceRole: ServiceRole?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationConfig: NotificationConfig?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchOutputConfig: CloudWatchOutputConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CommandPlugin {
        var Name: CommandPluginName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Pending" | "InProgress" | "Success" | "TimedOut" | "Cancelled" | "Failed" | String */
        var StatusDetails: StatusDetails?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseCode: ResponseCode?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseStartDateTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseFinishDateTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Output: CommandPluginOutput?
            get() = definedExternally
            set(value) = definedExternally
        var StandardOutputUrl: Url?
            get() = definedExternally
            set(value) = definedExternally
        var StandardErrorUrl: Url?
            get() = definedExternally
            set(value) = definedExternally
        var OutputS3Region: S3Region?
            get() = definedExternally
            set(value) = definedExternally
        var OutputS3BucketName: S3BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var OutputS3KeyPrefix: S3KeyPrefix?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ComplianceExecutionSummary {
        var ExecutionTime: DateTime
        var ExecutionId: ComplianceExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionType: ComplianceExecutionType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ComplianceItem {
        var ComplianceType: ComplianceTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: ComplianceResourceType?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: ComplianceResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Id: ComplianceItemId?
            get() = definedExternally
            set(value) = definedExternally
        var Title: ComplianceItemTitle?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "COMPLIANT" | "NON_COMPLIANT" | String */
        var Severity: String /* "CRITICAL" | "HIGH" | "MEDIUM" | "LOW" | "INFORMATIONAL" | "UNSPECIFIED" | String */
        var ExecutionSummary: ComplianceExecutionSummary?
            get() = definedExternally
            set(value) = definedExternally
        var Details: ComplianceItemDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ComplianceItemDetails {
        @nativeGetter
        operator fun get(key: String): AttributeValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeValue)
    }
    interface ComplianceItemEntry {
        var Id: ComplianceItemId?
            get() = definedExternally
            set(value) = definedExternally
        var Title: ComplianceItemTitle?
            get() = definedExternally
            set(value) = definedExternally
        var Severity: String /* "CRITICAL" | "HIGH" | "MEDIUM" | "LOW" | "INFORMATIONAL" | "UNSPECIFIED" | String */
        var Status: String /* "COMPLIANT" | "NON_COMPLIANT" | String */
        var Details: ComplianceItemDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ComplianceStringFilter {
        var Key: ComplianceStringFilterKey?
            get() = definedExternally
            set(value) = definedExternally
        var Values: ComplianceStringFilterValueList?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "EQUAL" | "NOT_EQUAL" | "BEGIN_WITH" | "LESS_THAN" | "GREATER_THAN" | String */
    }
    interface ComplianceSummaryItem {
        var ComplianceType: ComplianceTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var CompliantSummary: CompliantSummary?
            get() = definedExternally
            set(value) = definedExternally
        var NonCompliantSummary: NonCompliantSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CompliantSummary {
        var CompliantCount: ComplianceSummaryCount?
            get() = definedExternally
            set(value) = definedExternally
        var SeveritySummary: SeveritySummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateActivationRequest {
        var Description: ActivationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultInstanceName: DefaultInstanceName?
            get() = definedExternally
            set(value) = definedExternally
        var IamRole: IamRole
        var RegistrationLimit: RegistrationLimit?
            get() = definedExternally
            set(value) = definedExternally
        var ExpirationDate: ExpirationDate?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateActivationResult {
        var ActivationId: ActivationId?
            get() = definedExternally
            set(value) = definedExternally
        var ActivationCode: ActivationCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAssociationBatchRequest {
        var Entries: CreateAssociationBatchRequestEntries
    }
    interface CreateAssociationBatchRequestEntry {
        var Name: DocumentARN
        var InstanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: Parameters?
            get() = definedExternally
            set(value) = definedExternally
        var AutomationTargetParameterName: AutomationTargetParameterName?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: Targets?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduleExpression: ScheduleExpression?
            get() = definedExternally
            set(value) = definedExternally
        var OutputLocation: InstanceAssociationOutputLocation?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationName: AssociationName?
            get() = definedExternally
            set(value) = definedExternally
        var MaxErrors: MaxErrors?
            get() = definedExternally
            set(value) = definedExternally
        var MaxConcurrency: MaxConcurrency?
            get() = definedExternally
            set(value) = definedExternally
        var ComplianceSeverity: String /* "CRITICAL" | "HIGH" | "MEDIUM" | "LOW" | "UNSPECIFIED" | String */
    }
    interface CreateAssociationBatchResult {
        var Successful: AssociationDescriptionList?
            get() = definedExternally
            set(value) = definedExternally
        var Failed: FailedCreateAssociationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAssociationRequest {
        var Name: DocumentARN
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: Parameters?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: Targets?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduleExpression: ScheduleExpression?
            get() = definedExternally
            set(value) = definedExternally
        var OutputLocation: InstanceAssociationOutputLocation?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationName: AssociationName?
            get() = definedExternally
            set(value) = definedExternally
        var AutomationTargetParameterName: AutomationTargetParameterName?
            get() = definedExternally
            set(value) = definedExternally
        var MaxErrors: MaxErrors?
            get() = definedExternally
            set(value) = definedExternally
        var MaxConcurrency: MaxConcurrency?
            get() = definedExternally
            set(value) = definedExternally
        var ComplianceSeverity: String /* "CRITICAL" | "HIGH" | "MEDIUM" | "LOW" | "UNSPECIFIED" | String */
    }
    interface CreateAssociationResult {
        var AssociationDescription: AssociationDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDocumentRequest {
        var Content: DocumentContent
        var Requires: DocumentRequiresList?
            get() = definedExternally
            set(value) = definedExternally
        var Attachments: AttachmentsSourceList?
            get() = definedExternally
            set(value) = definedExternally
        var Name: DocumentName
        var VersionName: DocumentVersionName?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentType: String /* "Command" | "Policy" | "Automation" | "Session" | "Package" | "ApplicationConfiguration" | "ApplicationConfigurationSchema" | "DeploymentStrategy" | "ChangeCalendar" | String */
        var DocumentFormat: String /* "YAML" | "JSON" | "TEXT" | String */
        var TargetType: TargetType?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDocumentResult {
        var DocumentDescription: DocumentDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateMaintenanceWindowRequest {
        var Name: MaintenanceWindowName
        var Description: MaintenanceWindowDescription?
            get() = definedExternally
            set(value) = definedExternally
        var StartDate: MaintenanceWindowStringDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var EndDate: MaintenanceWindowStringDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: MaintenanceWindowSchedule
        var ScheduleTimezone: MaintenanceWindowTimezone?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: MaintenanceWindowDurationHours
        var Cutoff: MaintenanceWindowCutoff
        var AllowUnassociatedTargets: MaintenanceWindowAllowUnassociatedTargets
        var ClientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateMaintenanceWindowResult {
        var WindowId: MaintenanceWindowId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateOpsItemRequest {
        var Description: OpsItemDescription
        var OperationalData: OpsItemOperationalData?
            get() = definedExternally
            set(value) = definedExternally
        var Notifications: OpsItemNotifications?
            get() = definedExternally
            set(value) = definedExternally
        var Priority: OpsItemPriority?
            get() = definedExternally
            set(value) = definedExternally
        var RelatedOpsItems: RelatedOpsItems?
            get() = definedExternally
            set(value) = definedExternally
        var Source: OpsItemSource
        var Title: OpsItemTitle
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var Category: OpsItemCategory?
            get() = definedExternally
            set(value) = definedExternally
        var Severity: OpsItemSeverity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateOpsItemResponse {
        var OpsItemId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePatchBaselineRequest {
        var OperatingSystem: String /* "WINDOWS" | "AMAZON_LINUX" | "AMAZON_LINUX_2" | "UBUNTU" | "REDHAT_ENTERPRISE_LINUX" | "SUSE" | "CENTOS" | String */
        var Name: BaselineName
        var GlobalFilters: PatchFilterGroup?
            get() = definedExternally
            set(value) = definedExternally
        var ApprovalRules: PatchRuleGroup?
            get() = definedExternally
            set(value) = definedExternally
        var ApprovedPatches: PatchIdList?
            get() = definedExternally
            set(value) = definedExternally
        var ApprovedPatchesComplianceLevel: String /* "CRITICAL" | "HIGH" | "MEDIUM" | "LOW" | "INFORMATIONAL" | "UNSPECIFIED" | String */
        var ApprovedPatchesEnableNonSecurity: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RejectedPatches: PatchIdList?
            get() = definedExternally
            set(value) = definedExternally
        var RejectedPatchesAction: String /* "ALLOW_AS_DEPENDENCY" | "BLOCK" | String */
        var Description: BaselineDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Sources: PatchSourceList?
            get() = definedExternally
            set(value) = definedExternally
        var ClientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePatchBaselineResult {
        var BaselineId: BaselineId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateResourceDataSyncRequest {
        var SyncName: ResourceDataSyncName
        var S3Destination: ResourceDataSyncS3Destination?
            get() = definedExternally
            set(value) = definedExternally
        var SyncType: ResourceDataSyncType?
            get() = definedExternally
            set(value) = definedExternally
        var SyncSource: ResourceDataSyncSource?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateResourceDataSyncResult
    interface DeleteActivationRequest {
        var ActivationId: ActivationId
    }
    interface DeleteActivationResult
    interface DeleteAssociationRequest {
        var Name: DocumentARN?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationId: AssociationId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAssociationResult
    interface DeleteDocumentRequest {
        var Name: DocumentName
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var VersionName: DocumentVersionName?
            get() = definedExternally
            set(value) = definedExternally
        var Force: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDocumentResult
    interface DeleteInventoryRequest {
        var TypeName: InventoryItemTypeName
        var SchemaDeleteOption: String /* "DisableSchema" | "DeleteSchema" | String */
        var DryRun: DryRun?
            get() = definedExternally
            set(value) = definedExternally
        var ClientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteInventoryResult {
        var DeletionId: InventoryDeletionId?
            get() = definedExternally
            set(value) = definedExternally
        var TypeName: InventoryItemTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionSummary: InventoryDeletionSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteMaintenanceWindowRequest {
        var WindowId: MaintenanceWindowId
    }
    interface DeleteMaintenanceWindowResult {
        var WindowId: MaintenanceWindowId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteParameterRequest {
        var Name: PSParameterName
    }
    interface DeleteParameterResult
    interface DeleteParametersRequest {
        var Names: ParameterNameList
    }
    interface DeleteParametersResult {
        var DeletedParameters: ParameterNameList?
            get() = definedExternally
            set(value) = definedExternally
        var InvalidParameters: ParameterNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeletePatchBaselineRequest {
        var BaselineId: BaselineId
    }
    interface DeletePatchBaselineResult {
        var BaselineId: BaselineId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteResourceDataSyncRequest {
        var SyncName: ResourceDataSyncName
        var SyncType: ResourceDataSyncType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteResourceDataSyncResult
    interface DeregisterManagedInstanceRequest {
        var InstanceId: ManagedInstanceId
    }
    interface DeregisterManagedInstanceResult
    interface DeregisterPatchBaselineForPatchGroupRequest {
        var BaselineId: BaselineId
        var PatchGroup: PatchGroup
    }
    interface DeregisterPatchBaselineForPatchGroupResult {
        var BaselineId: BaselineId?
            get() = definedExternally
            set(value) = definedExternally
        var PatchGroup: PatchGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeregisterTargetFromMaintenanceWindowRequest {
        var WindowId: MaintenanceWindowId
        var WindowTargetId: MaintenanceWindowTargetId
        var Safe: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeregisterTargetFromMaintenanceWindowResult {
        var WindowId: MaintenanceWindowId?
            get() = definedExternally
            set(value) = definedExternally
        var WindowTargetId: MaintenanceWindowTargetId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeregisterTaskFromMaintenanceWindowRequest {
        var WindowId: MaintenanceWindowId
        var WindowTaskId: MaintenanceWindowTaskId
    }
    interface DeregisterTaskFromMaintenanceWindowResult {
        var WindowId: MaintenanceWindowId?
            get() = definedExternally
            set(value) = definedExternally
        var WindowTaskId: MaintenanceWindowTaskId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeActivationsFilter {
        var FilterKey: String /* "ActivationIds" | "DefaultInstanceName" | "IamRole" | String */
        var FilterValues: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeActivationsRequest {
        var Filters: DescribeActivationsFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeActivationsResult {
        var ActivationList: ActivationList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAssociationExecutionTargetsRequest {
        var AssociationId: AssociationId
        var ExecutionId: AssociationExecutionId
        var Filters: AssociationExecutionTargetsFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAssociationExecutionTargetsResult {
        var AssociationExecutionTargets: AssociationExecutionTargetsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAssociationExecutionsRequest {
        var AssociationId: AssociationId
        var Filters: AssociationExecutionFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAssociationExecutionsResult {
        var AssociationExecutions: AssociationExecutionsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAssociationRequest {
        var Name: DocumentARN?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationId: AssociationId?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationVersion: AssociationVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAssociationResult {
        var AssociationDescription: AssociationDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAutomationExecutionsRequest {
        var Filters: AutomationExecutionFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAutomationExecutionsResult {
        var AutomationExecutionMetadataList: AutomationExecutionMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAutomationStepExecutionsRequest {
        var AutomationExecutionId: AutomationExecutionId
        var Filters: StepExecutionFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var ReverseOrder: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAutomationStepExecutionsResult {
        var StepExecutions: StepExecutionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAvailablePatchesRequest {
        var Filters: PatchOrchestratorFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PatchBaselineMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAvailablePatchesResult {
        var Patches: PatchList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDocumentPermissionRequest {
        var Name: DocumentName
        var PermissionType: String /* "Share" | String */
    }
    interface DescribeDocumentPermissionResponse {
        var AccountIds: AccountIdList?
            get() = definedExternally
            set(value) = definedExternally
        var AccountSharingInfoList: AccountSharingInfoList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDocumentRequest {
        var Name: DocumentARN
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var VersionName: DocumentVersionName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDocumentResult {
        var Document: DocumentDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEffectiveInstanceAssociationsRequest {
        var InstanceId: InstanceId
        var MaxResults: EffectiveInstanceAssociationMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEffectiveInstanceAssociationsResult {
        var Associations: InstanceAssociationList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEffectivePatchesForPatchBaselineRequest {
        var BaselineId: BaselineId
        var MaxResults: PatchBaselineMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEffectivePatchesForPatchBaselineResult {
        var EffectivePatches: EffectivePatchList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInstanceAssociationsStatusRequest {
        var InstanceId: InstanceId
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInstanceAssociationsStatusResult {
        var InstanceAssociationStatusInfos: InstanceAssociationStatusInfos?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInstanceInformationRequest {
        var InstanceInformationFilterList: InstanceInformationFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: InstanceInformationStringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultsEC2Compatible?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInstanceInformationResult {
        var InstanceInformationList: InstanceInformationList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInstancePatchStatesForPatchGroupRequest {
        var PatchGroup: PatchGroup
        var Filters: InstancePatchStateFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PatchComplianceMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInstancePatchStatesForPatchGroupResult {
        var InstancePatchStates: InstancePatchStatesList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInstancePatchStatesRequest {
        var InstanceIds: InstanceIdList
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PatchComplianceMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInstancePatchStatesResult {
        var InstancePatchStates: InstancePatchStateList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInstancePatchesRequest {
        var InstanceId: InstanceId
        var Filters: PatchOrchestratorFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PatchComplianceMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInstancePatchesResult {
        var Patches: PatchComplianceDataList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInventoryDeletionsRequest {
        var DeletionId: InventoryDeletionId?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInventoryDeletionsResult {
        var InventoryDeletions: InventoryDeletionsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMaintenanceWindowExecutionTaskInvocationsRequest {
        var WindowExecutionId: MaintenanceWindowExecutionId
        var TaskId: MaintenanceWindowExecutionTaskId
        var Filters: MaintenanceWindowFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaintenanceWindowMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMaintenanceWindowExecutionTaskInvocationsResult {
        var WindowExecutionTaskInvocationIdentities: MaintenanceWindowExecutionTaskInvocationIdentityList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMaintenanceWindowExecutionTasksRequest {
        var WindowExecutionId: MaintenanceWindowExecutionId
        var Filters: MaintenanceWindowFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaintenanceWindowMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMaintenanceWindowExecutionTasksResult {
        var WindowExecutionTaskIdentities: MaintenanceWindowExecutionTaskIdentityList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMaintenanceWindowExecutionsRequest {
        var WindowId: MaintenanceWindowId
        var Filters: MaintenanceWindowFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaintenanceWindowMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMaintenanceWindowExecutionsResult {
        var WindowExecutions: MaintenanceWindowExecutionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMaintenanceWindowScheduleRequest {
        var WindowId: MaintenanceWindowId?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: Targets?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: String /* "INSTANCE" | "RESOURCE_GROUP" | String */
        var Filters: PatchOrchestratorFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaintenanceWindowSearchMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMaintenanceWindowScheduleResult {
        var ScheduledWindowExecutions: ScheduledWindowExecutionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMaintenanceWindowTargetsRequest {
        var WindowId: MaintenanceWindowId
        var Filters: MaintenanceWindowFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaintenanceWindowMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMaintenanceWindowTargetsResult {
        var Targets: MaintenanceWindowTargetList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMaintenanceWindowTasksRequest {
        var WindowId: MaintenanceWindowId
        var Filters: MaintenanceWindowFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaintenanceWindowMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMaintenanceWindowTasksResult {
        var Tasks: MaintenanceWindowTaskList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMaintenanceWindowsForTargetRequest {
        var Targets: Targets
        var ResourceType: String /* "INSTANCE" | "RESOURCE_GROUP" | String */
        var MaxResults: MaintenanceWindowSearchMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMaintenanceWindowsForTargetResult {
        var WindowIdentities: MaintenanceWindowsForTargetList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMaintenanceWindowsRequest {
        var Filters: MaintenanceWindowFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaintenanceWindowMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMaintenanceWindowsResult {
        var WindowIdentities: MaintenanceWindowIdentityList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeOpsItemsRequest {
        var OpsItemFilters: OpsItemFilters?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: OpsItemMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeOpsItemsResponse {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var OpsItemSummaries: OpsItemSummaries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeParametersRequest {
        var Filters: ParametersFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterFilters: ParameterStringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeParametersResult {
        var Parameters: ParameterMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePatchBaselinesRequest {
        var Filters: PatchOrchestratorFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PatchBaselineMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePatchBaselinesResult {
        var BaselineIdentities: PatchBaselineIdentityList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePatchGroupStateRequest {
        var PatchGroup: PatchGroup
    }
    interface DescribePatchGroupStateResult {
        var Instances: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var InstancesWithInstalledPatches: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var InstancesWithInstalledOtherPatches: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var InstancesWithInstalledPendingRebootPatches: InstancesCount?
            get() = definedExternally
            set(value) = definedExternally
        var InstancesWithInstalledRejectedPatches: InstancesCount?
            get() = definedExternally
            set(value) = definedExternally
        var InstancesWithMissingPatches: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var InstancesWithFailedPatches: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var InstancesWithNotApplicablePatches: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var InstancesWithUnreportedNotApplicablePatches: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePatchGroupsRequest {
        var MaxResults: PatchBaselineMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: PatchOrchestratorFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePatchGroupsResult {
        var Mappings: PatchGroupPatchBaselineMappingList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePatchPropertiesRequest {
        var OperatingSystem: String /* "WINDOWS" | "AMAZON_LINUX" | "AMAZON_LINUX_2" | "UBUNTU" | "REDHAT_ENTERPRISE_LINUX" | "SUSE" | "CENTOS" | String */
        var Property: String /* "PRODUCT" | "PRODUCT_FAMILY" | "CLASSIFICATION" | "MSRC_SEVERITY" | "PRIORITY" | "SEVERITY" | String */
        var PatchSet: String /* "OS" | "APPLICATION" | String */
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePatchPropertiesResult {
        var Properties: PatchPropertiesList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSessionsRequest {
        var State: String /* "Active" | "History" | String */
        var MaxResults: SessionMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: SessionFilterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSessionsResponse {
        var Sessions: SessionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentDefaultVersionDescription {
        var Name: DocumentName?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultVersionName: DocumentVersionName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentDescription {
        var Sha1: DocumentSha1?
            get() = definedExternally
            set(value) = definedExternally
        var Hash: DocumentHash?
            get() = definedExternally
            set(value) = definedExternally
        var HashType: String /* "Sha256" | "Sha1" | String */
        var Name: DocumentARN?
            get() = definedExternally
            set(value) = definedExternally
        var VersionName: DocumentVersionName?
            get() = definedExternally
            set(value) = definedExternally
        var Owner: DocumentOwner?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Creating" | "Active" | "Updating" | "Deleting" | "Failed" | String */
        var StatusInformation: DocumentStatusInformation?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionInDocument?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: DocumentParameterList?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformTypes: PlatformTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentType: String /* "Command" | "Policy" | "Automation" | "Session" | "Package" | "ApplicationConfiguration" | "ApplicationConfigurationSchema" | "DeploymentStrategy" | "ChangeCalendar" | String */
        var SchemaVersion: DocumentSchemaVersion?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentFormat: String /* "YAML" | "JSON" | "TEXT" | String */
        var TargetType: TargetType?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var AttachmentsInformation: AttachmentInformationList?
            get() = definedExternally
            set(value) = definedExternally
        var Requires: DocumentRequiresList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentFilter {
        var key: String /* "Name" | "Owner" | "PlatformTypes" | "DocumentType" | String */
        var value: DocumentFilterValue
    }
    interface DocumentIdentifier {
        var Name: DocumentARN?
            get() = definedExternally
            set(value) = definedExternally
        var Owner: DocumentOwner?
            get() = definedExternally
            set(value) = definedExternally
        var VersionName: DocumentVersionName?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformTypes: PlatformTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentType: String /* "Command" | "Policy" | "Automation" | "Session" | "Package" | "ApplicationConfiguration" | "ApplicationConfigurationSchema" | "DeploymentStrategy" | "ChangeCalendar" | String */
        var SchemaVersion: DocumentSchemaVersion?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentFormat: String /* "YAML" | "JSON" | "TEXT" | String */
        var TargetType: TargetType?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var Requires: DocumentRequiresList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentKeyValuesFilter {
        var Key: DocumentKeyValuesFilterKey?
            get() = definedExternally
            set(value) = definedExternally
        var Values: DocumentKeyValuesFilterValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentParameter {
        var Name: DocumentParameterName?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "String" | "StringList" | String */
        var Description: DocumentParameterDescrption?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultValue: DocumentParameterDefaultValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentRequires {
        var Name: DocumentARN
        var Version: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentVersionInfo {
        var Name: DocumentName?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var VersionName: DocumentVersionName?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var IsDefaultVersion: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentFormat: String /* "YAML" | "JSON" | "TEXT" | String */
        var Status: String /* "Creating" | "Active" | "Updating" | "Deleting" | "Failed" | String */
        var StatusInformation: DocumentStatusInformation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EffectivePatch {
        var Patch: Patch?
            get() = definedExternally
            set(value) = definedExternally
        var PatchStatus: PatchStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FailedCreateAssociation {
        var Entry: CreateAssociationBatchRequestEntry?
            get() = definedExternally
            set(value) = definedExternally
        var Message: BatchErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
        var Fault: String /* "Client" | "Server" | "Unknown" | String */
    }
    interface FailureDetails {
        var FailureStage: String?
            get() = definedExternally
            set(value) = definedExternally
        var FailureType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Details: AutomationParameterMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAutomationExecutionRequest {
        var AutomationExecutionId: AutomationExecutionId
    }
    interface GetAutomationExecutionResult {
        var AutomationExecution: AutomationExecution?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCalendarStateRequest {
        var CalendarNames: CalendarNameOrARNList
        var AtTime: ISO8601String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCalendarStateResponse {
        var State: String /* "OPEN" | "CLOSED" | String */
        var AtTime: ISO8601String?
            get() = definedExternally
            set(value) = definedExternally
        var NextTransitionTime: ISO8601String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCommandInvocationRequest {
        var CommandId: CommandId
        var InstanceId: InstanceId
        var PluginName: CommandPluginName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCommandInvocationResult {
        var CommandId: CommandId?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var Comment: Comment?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentName: DocumentName?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var PluginName: CommandPluginName?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseCode: ResponseCode?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionStartDateTime: StringDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionElapsedTime: StringDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionEndDateTime: StringDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Pending" | "InProgress" | "Delayed" | "Success" | "Cancelled" | "TimedOut" | "Failed" | "Cancelling" | String */
        var StatusDetails: StatusDetails?
            get() = definedExternally
            set(value) = definedExternally
        var StandardOutputContent: StandardOutputContent?
            get() = definedExternally
            set(value) = definedExternally
        var StandardOutputUrl: Url?
            get() = definedExternally
            set(value) = definedExternally
        var StandardErrorContent: StandardErrorContent?
            get() = definedExternally
            set(value) = definedExternally
        var StandardErrorUrl: Url?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchOutputConfig: CloudWatchOutputConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetConnectionStatusRequest {
        var Target: SessionTarget
    }
    interface GetConnectionStatusResponse {
        var Target: SessionTarget?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Connected" | "NotConnected" | String */
    }
    interface GetDefaultPatchBaselineRequest {
        var OperatingSystem: String /* "WINDOWS" | "AMAZON_LINUX" | "AMAZON_LINUX_2" | "UBUNTU" | "REDHAT_ENTERPRISE_LINUX" | "SUSE" | "CENTOS" | String */
    }
    interface GetDefaultPatchBaselineResult {
        var BaselineId: BaselineId?
            get() = definedExternally
            set(value) = definedExternally
        var OperatingSystem: String /* "WINDOWS" | "AMAZON_LINUX" | "AMAZON_LINUX_2" | "UBUNTU" | "REDHAT_ENTERPRISE_LINUX" | "SUSE" | "CENTOS" | String */
    }
    interface GetDeployablePatchSnapshotForInstanceRequest {
        var InstanceId: InstanceId
        var SnapshotId: SnapshotId
    }
    interface GetDeployablePatchSnapshotForInstanceResult {
        var InstanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotId: SnapshotId?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotDownloadUrl: SnapshotDownloadUrl?
            get() = definedExternally
            set(value) = definedExternally
        var Product: Product?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDocumentRequest {
        var Name: DocumentARN
        var VersionName: DocumentVersionName?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentFormat: String /* "YAML" | "JSON" | "TEXT" | String */
    }
    interface GetDocumentResult {
        var Name: DocumentARN?
            get() = definedExternally
            set(value) = definedExternally
        var VersionName: DocumentVersionName?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Creating" | "Active" | "Updating" | "Deleting" | "Failed" | String */
        var StatusInformation: DocumentStatusInformation?
            get() = definedExternally
            set(value) = definedExternally
        var Content: DocumentContent?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentType: String /* "Command" | "Policy" | "Automation" | "Session" | "Package" | "ApplicationConfiguration" | "ApplicationConfigurationSchema" | "DeploymentStrategy" | "ChangeCalendar" | String */
        var DocumentFormat: String /* "YAML" | "JSON" | "TEXT" | String */
        var Requires: DocumentRequiresList?
            get() = definedExternally
            set(value) = definedExternally
        var AttachmentsContent: AttachmentContentList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInventoryRequest {
        var Filters: InventoryFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Aggregators: InventoryAggregatorList?
            get() = definedExternally
            set(value) = definedExternally
        var ResultAttributes: ResultAttributeList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInventoryResult {
        var Entities: InventoryResultEntityList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInventorySchemaRequest {
        var TypeName: InventoryItemTypeNameFilter?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: GetInventorySchemaMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var Aggregator: AggregatorSchemaOnly?
            get() = definedExternally
            set(value) = definedExternally
        var SubType: IsSubTypeSchema?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInventorySchemaResult {
        var Schemas: InventoryItemSchemaResultList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMaintenanceWindowExecutionRequest {
        var WindowExecutionId: MaintenanceWindowExecutionId
    }
    interface GetMaintenanceWindowExecutionResult {
        var WindowExecutionId: MaintenanceWindowExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var TaskIds: MaintenanceWindowExecutionTaskIdList?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "IN_PROGRESS" | "SUCCESS" | "FAILED" | "TIMED_OUT" | "CANCELLING" | "CANCELLED" | "SKIPPED_OVERLAPPING" | String */
        var StatusDetails: MaintenanceWindowExecutionStatusDetails?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMaintenanceWindowExecutionTaskInvocationRequest {
        var WindowExecutionId: MaintenanceWindowExecutionId
        var TaskId: MaintenanceWindowExecutionTaskId
        var InvocationId: MaintenanceWindowExecutionTaskInvocationId
    }
    interface GetMaintenanceWindowExecutionTaskInvocationResult {
        var WindowExecutionId: MaintenanceWindowExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var TaskExecutionId: MaintenanceWindowExecutionTaskId?
            get() = definedExternally
            set(value) = definedExternally
        var InvocationId: MaintenanceWindowExecutionTaskInvocationId?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionId: MaintenanceWindowExecutionTaskExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var TaskType: String /* "RUN_COMMAND" | "AUTOMATION" | "STEP_FUNCTIONS" | "LAMBDA" | String */
        var Parameters: MaintenanceWindowExecutionTaskInvocationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "IN_PROGRESS" | "SUCCESS" | "FAILED" | "TIMED_OUT" | "CANCELLING" | "CANCELLED" | "SKIPPED_OVERLAPPING" | String */
        var StatusDetails: MaintenanceWindowExecutionStatusDetails?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerInformation: OwnerInformation?
            get() = definedExternally
            set(value) = definedExternally
        var WindowTargetId: MaintenanceWindowTaskTargetId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMaintenanceWindowExecutionTaskRequest {
        var WindowExecutionId: MaintenanceWindowExecutionId
        var TaskId: MaintenanceWindowExecutionTaskId
    }
    interface GetMaintenanceWindowExecutionTaskResult {
        var WindowExecutionId: MaintenanceWindowExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var TaskExecutionId: MaintenanceWindowExecutionTaskId?
            get() = definedExternally
            set(value) = definedExternally
        var TaskArn: MaintenanceWindowTaskArn?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceRole: ServiceRole?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "RUN_COMMAND" | "AUTOMATION" | "STEP_FUNCTIONS" | "LAMBDA" | String */
        var TaskParameters: MaintenanceWindowTaskParametersList?
            get() = definedExternally
            set(value) = definedExternally
        var Priority: MaintenanceWindowTaskPriority?
            get() = definedExternally
            set(value) = definedExternally
        var MaxConcurrency: MaxConcurrency?
            get() = definedExternally
            set(value) = definedExternally
        var MaxErrors: MaxErrors?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "IN_PROGRESS" | "SUCCESS" | "FAILED" | "TIMED_OUT" | "CANCELLING" | "CANCELLED" | "SKIPPED_OVERLAPPING" | String */
        var StatusDetails: MaintenanceWindowExecutionStatusDetails?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMaintenanceWindowRequest {
        var WindowId: MaintenanceWindowId
    }
    interface GetMaintenanceWindowResult {
        var WindowId: MaintenanceWindowId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: MaintenanceWindowName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: MaintenanceWindowDescription?
            get() = definedExternally
            set(value) = definedExternally
        var StartDate: MaintenanceWindowStringDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var EndDate: MaintenanceWindowStringDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: MaintenanceWindowSchedule?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduleTimezone: MaintenanceWindowTimezone?
            get() = definedExternally
            set(value) = definedExternally
        var NextExecutionTime: MaintenanceWindowStringDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: MaintenanceWindowDurationHours?
            get() = definedExternally
            set(value) = definedExternally
        var Cutoff: MaintenanceWindowCutoff?
            get() = definedExternally
            set(value) = definedExternally
        var AllowUnassociatedTargets: MaintenanceWindowAllowUnassociatedTargets?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: MaintenanceWindowEnabled?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var ModifiedDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMaintenanceWindowTaskRequest {
        var WindowId: MaintenanceWindowId
        var WindowTaskId: MaintenanceWindowTaskId
    }
    interface GetMaintenanceWindowTaskResult {
        var WindowId: MaintenanceWindowId?
            get() = definedExternally
            set(value) = definedExternally
        var WindowTaskId: MaintenanceWindowTaskId?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: Targets?
            get() = definedExternally
            set(value) = definedExternally
        var TaskArn: MaintenanceWindowTaskArn?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceRoleArn: ServiceRole?
            get() = definedExternally
            set(value) = definedExternally
        var TaskType: String /* "RUN_COMMAND" | "AUTOMATION" | "STEP_FUNCTIONS" | "LAMBDA" | String */
        var TaskParameters: MaintenanceWindowTaskParameters?
            get() = definedExternally
            set(value) = definedExternally
        var TaskInvocationParameters: MaintenanceWindowTaskInvocationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var Priority: MaintenanceWindowTaskPriority?
            get() = definedExternally
            set(value) = definedExternally
        var MaxConcurrency: MaxConcurrency?
            get() = definedExternally
            set(value) = definedExternally
        var MaxErrors: MaxErrors?
            get() = definedExternally
            set(value) = definedExternally
        var LoggingInfo: LoggingInfo?
            get() = definedExternally
            set(value) = definedExternally
        var Name: MaintenanceWindowName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: MaintenanceWindowDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOpsItemRequest {
        var OpsItemId: OpsItemId
    }
    interface GetOpsItemResponse {
        var OpsItem: OpsItem?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOpsSummaryRequest {
        var SyncName: ResourceDataSyncName?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: OpsFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Aggregators: OpsAggregatorList?
            get() = definedExternally
            set(value) = definedExternally
        var ResultAttributes: OpsResultAttributeList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOpsSummaryResult {
        var Entities: OpsEntityList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetParameterHistoryRequest {
        var Name: PSParameterName
        var WithDecryption: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetParameterHistoryResult {
        var Parameters: ParameterHistoryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetParameterRequest {
        var Name: PSParameterName
        var WithDecryption: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetParameterResult {
        var Parameter: Parameter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetParametersByPathRequest {
        var Path: PSParameterName
        var Recursive: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterFilters: ParameterStringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var WithDecryption: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: GetParametersByPathMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetParametersByPathResult {
        var Parameters: ParameterList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetParametersRequest {
        var Names: ParameterNameList
        var WithDecryption: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetParametersResult {
        var Parameters: ParameterList?
            get() = definedExternally
            set(value) = definedExternally
        var InvalidParameters: ParameterNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPatchBaselineForPatchGroupRequest {
        var PatchGroup: PatchGroup
        var OperatingSystem: String /* "WINDOWS" | "AMAZON_LINUX" | "AMAZON_LINUX_2" | "UBUNTU" | "REDHAT_ENTERPRISE_LINUX" | "SUSE" | "CENTOS" | String */
    }
    interface GetPatchBaselineForPatchGroupResult {
        var BaselineId: BaselineId?
            get() = definedExternally
            set(value) = definedExternally
        var PatchGroup: PatchGroup?
            get() = definedExternally
            set(value) = definedExternally
        var OperatingSystem: String /* "WINDOWS" | "AMAZON_LINUX" | "AMAZON_LINUX_2" | "UBUNTU" | "REDHAT_ENTERPRISE_LINUX" | "SUSE" | "CENTOS" | String */
    }
    interface GetPatchBaselineRequest {
        var BaselineId: BaselineId
    }
    interface GetPatchBaselineResult {
        var BaselineId: BaselineId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: BaselineName?
            get() = definedExternally
            set(value) = definedExternally
        var OperatingSystem: String /* "WINDOWS" | "AMAZON_LINUX" | "AMAZON_LINUX_2" | "UBUNTU" | "REDHAT_ENTERPRISE_LINUX" | "SUSE" | "CENTOS" | String */
        var GlobalFilters: PatchFilterGroup?
            get() = definedExternally
            set(value) = definedExternally
        var ApprovalRules: PatchRuleGroup?
            get() = definedExternally
            set(value) = definedExternally
        var ApprovedPatches: PatchIdList?
            get() = definedExternally
            set(value) = definedExternally
        var ApprovedPatchesComplianceLevel: String /* "CRITICAL" | "HIGH" | "MEDIUM" | "LOW" | "INFORMATIONAL" | "UNSPECIFIED" | String */
        var ApprovedPatchesEnableNonSecurity: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RejectedPatches: PatchIdList?
            get() = definedExternally
            set(value) = definedExternally
        var RejectedPatchesAction: String /* "ALLOW_AS_DEPENDENCY" | "BLOCK" | String */
        var PatchGroups: PatchGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var ModifiedDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Description: BaselineDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Sources: PatchSourceList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetServiceSettingRequest {
        var SettingId: ServiceSettingId
    }
    interface GetServiceSettingResult {
        var ServiceSetting: ServiceSetting?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceAggregatedAssociationOverview {
        var DetailedStatus: StatusName?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceAssociationStatusAggregatedCount: InstanceAssociationStatusAggregatedCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceAssociation {
        var AssociationId: AssociationId?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var Content: DocumentContent?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationVersion: AssociationVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceAssociationOutputLocation {
        var S3Location: S3OutputLocation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceAssociationOutputUrl {
        var S3OutputUrl: S3OutputUrl?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceAssociationStatusAggregatedCount {
        @nativeGetter
        operator fun get(key: String): InstanceCount?
        @nativeSetter
        operator fun set(key: String, value: InstanceCount)
    }
    interface InstanceAssociationStatusInfo {
        var AssociationId: AssociationId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: DocumentARN?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationVersion: AssociationVersion?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusName?
            get() = definedExternally
            set(value) = definedExternally
        var DetailedStatus: StatusName?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionSummary: InstanceAssociationExecutionSummary?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: AgentErrorCode?
            get() = definedExternally
            set(value) = definedExternally
        var OutputUrl: InstanceAssociationOutputUrl?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationName: AssociationName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceInformation {
        var InstanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var PingStatus: String /* "Online" | "ConnectionLost" | "Inactive" | String */
        var LastPingDateTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var AgentVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
        var IsLatestVersion: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformType: String /* "Windows" | "Linux" | String */
        var PlatformName: String?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var ActivationId: ActivationId?
            get() = definedExternally
            set(value) = definedExternally
        var IamRole: IamRole?
            get() = definedExternally
            set(value) = definedExternally
        var RegistrationDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: String /* "ManagedInstance" | "Document" | "EC2Instance" | String */
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var IPAddress: IPAddress?
            get() = definedExternally
            set(value) = definedExternally
        var ComputerName: ComputerName?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationStatus: StatusName?
            get() = definedExternally
            set(value) = definedExternally
        var LastAssociationExecutionDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastSuccessfulAssociationExecutionDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationOverview: InstanceAggregatedAssociationOverview?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceInformationFilter {
        var key: String /* "InstanceIds" | "AgentVersion" | "PingStatus" | "PlatformTypes" | "ActivationIds" | "IamRole" | "ResourceType" | "AssociationStatus" | String */
        var valueSet: InstanceInformationFilterValueSet
    }
    interface InstanceInformationStringFilter {
        var Key: InstanceInformationStringFilterKey
        var Values: InstanceInformationFilterValueSet
    }
    interface InstancePatchState {
        var InstanceId: InstanceId
        var PatchGroup: PatchGroup
        var BaselineId: BaselineId
        var SnapshotId: SnapshotId?
            get() = definedExternally
            set(value) = definedExternally
        var InstallOverrideList: InstallOverrideList?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerInformation: OwnerInformation?
            get() = definedExternally
            set(value) = definedExternally
        var InstalledCount: PatchInstalledCount?
            get() = definedExternally
            set(value) = definedExternally
        var InstalledOtherCount: PatchInstalledOtherCount?
            get() = definedExternally
            set(value) = definedExternally
        var InstalledPendingRebootCount: PatchInstalledPendingRebootCount?
            get() = definedExternally
            set(value) = definedExternally
        var InstalledRejectedCount: PatchInstalledRejectedCount?
            get() = definedExternally
            set(value) = definedExternally
        var MissingCount: PatchMissingCount?
            get() = definedExternally
            set(value) = definedExternally
        var FailedCount: PatchFailedCount?
            get() = definedExternally
            set(value) = definedExternally
        var UnreportedNotApplicableCount: PatchUnreportedNotApplicableCount?
            get() = definedExternally
            set(value) = definedExternally
        var NotApplicableCount: PatchNotApplicableCount?
            get() = definedExternally
            set(value) = definedExternally
        var OperationStartTime: DateTime
        var OperationEndTime: DateTime
        var Operation: String /* "Scan" | "Install" | String */
        var LastNoRebootInstallOperationTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var RebootOption: String /* "RebootIfNeeded" | "NoReboot" | String */
    }
    interface InstancePatchStateFilter {
        var Key: InstancePatchStateFilterKey
        var Values: InstancePatchStateFilterValues
        var Type: String /* "Equal" | "NotEqual" | "LessThan" | "GreaterThan" | String */
    }
    interface InventoryAggregator {
        var Expression: InventoryAggregatorExpression?
            get() = definedExternally
            set(value) = definedExternally
        var Aggregators: InventoryAggregatorList?
            get() = definedExternally
            set(value) = definedExternally
        var Groups: InventoryGroupList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InventoryDeletionStatusItem {
        var DeletionId: InventoryDeletionId?
            get() = definedExternally
            set(value) = definedExternally
        var TypeName: InventoryItemTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionStartTime: InventoryDeletionStartTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastStatus: String /* "InProgress" | "Complete" | String */
        var LastStatusMessage: InventoryDeletionLastStatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionSummary: InventoryDeletionSummary?
            get() = definedExternally
            set(value) = definedExternally
        var LastStatusUpdateTime: InventoryDeletionLastStatusUpdateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InventoryDeletionSummary {
        var TotalCount: TotalCount?
            get() = definedExternally
            set(value) = definedExternally
        var RemainingCount: RemainingCount?
            get() = definedExternally
            set(value) = definedExternally
        var SummaryItems: InventoryDeletionSummaryItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InventoryDeletionSummaryItem {
        var Version: InventoryItemSchemaVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Count: ResourceCount?
            get() = definedExternally
            set(value) = definedExternally
        var RemainingCount: RemainingCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InventoryFilter {
        var Key: InventoryFilterKey
        var Values: InventoryFilterValueList
        var Type: String /* "Equal" | "NotEqual" | "BeginWith" | "LessThan" | "GreaterThan" | "Exists" | String */
    }
    interface InventoryGroup {
        var Name: InventoryGroupName
        var Filters: InventoryFilterList
    }
    interface InventoryItem {
        var TypeName: InventoryItemTypeName
        var SchemaVersion: InventoryItemSchemaVersion
        var CaptureTime: InventoryItemCaptureTime
        var ContentHash: InventoryItemContentHash?
            get() = definedExternally
            set(value) = definedExternally
        var Content: InventoryItemEntryList?
            get() = definedExternally
            set(value) = definedExternally
        var Context: InventoryItemContentContext?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InventoryItemAttribute {
        var Name: InventoryItemAttributeName
        var DataType: String /* "string" | "number" | String */
    }
    interface InventoryItemContentContext {
        @nativeGetter
        operator fun get(key: String): AttributeValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeValue)
    }
    interface InventoryItemEntry {
        @nativeGetter
        operator fun get(key: String): AttributeValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeValue)
    }
    interface InventoryItemSchema {
        var TypeName: InventoryItemTypeName
        var Version: InventoryItemSchemaVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: InventoryItemAttributeList
        var DisplayName: InventoryTypeDisplayName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InventoryResultEntity {
        var Id: InventoryResultEntityId?
            get() = definedExternally
            set(value) = definedExternally
        var Data: InventoryResultItemMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InventoryResultItem {
        var TypeName: InventoryItemTypeName
        var SchemaVersion: InventoryItemSchemaVersion
        var CaptureTime: InventoryItemCaptureTime?
            get() = definedExternally
            set(value) = definedExternally
        var ContentHash: InventoryItemContentHash?
            get() = definedExternally
            set(value) = definedExternally
        var Content: InventoryItemEntryList
    }
    interface InventoryResultItemMap {
        @nativeGetter
        operator fun get(key: String): InventoryResultItem?
        @nativeSetter
        operator fun set(key: String, value: InventoryResultItem)
    }
    interface LabelParameterVersionRequest {
        var Name: PSParameterName
        var ParameterVersion: PSParameterVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Labels: ParameterLabelList
    }
    interface LabelParameterVersionResult {
        var InvalidLabels: ParameterLabelList?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterVersion: PSParameterVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAssociationVersionsRequest {
        var AssociationId: AssociationId
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAssociationVersionsResult {
        var AssociationVersions: AssociationVersionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAssociationsRequest {
        var AssociationFilterList: AssociationFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAssociationsResult {
        var Associations: AssociationList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCommandInvocationsRequest {
        var CommandId: CommandId?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: CommandMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: CommandFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Details: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCommandInvocationsResult {
        var CommandInvocations: CommandInvocationList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCommandsRequest {
        var CommandId: CommandId?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: CommandMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: CommandFilterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCommandsResult {
        var Commands: CommandList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListComplianceItemsRequest {
        var Filters: ComplianceStringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceIds: ComplianceResourceIdList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceTypes: ComplianceResourceTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListComplianceItemsResult {
        var ComplianceItems: ComplianceItemList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListComplianceSummariesRequest {
        var Filters: ComplianceStringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListComplianceSummariesResult {
        var ComplianceSummaryItems: ComplianceSummaryItemList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDocumentVersionsRequest {
        var Name: DocumentARN
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDocumentVersionsResult {
        var DocumentVersions: DocumentVersionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDocumentsRequest {
        var DocumentFilterList: DocumentFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: DocumentKeyValuesFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDocumentsResult {
        var DocumentIdentifiers: DocumentIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInventoryEntriesRequest {
        var InstanceId: InstanceId
        var TypeName: InventoryItemTypeName
        var Filters: InventoryFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInventoryEntriesResult {
        var TypeName: InventoryItemTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaVersion: InventoryItemSchemaVersion?
            get() = definedExternally
            set(value) = definedExternally
        var CaptureTime: InventoryItemCaptureTime?
            get() = definedExternally
            set(value) = definedExternally
        var Entries: InventoryItemEntryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourceComplianceSummariesRequest {
        var Filters: ComplianceStringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourceComplianceSummariesResult {
        var ResourceComplianceSummaryItems: ResourceComplianceSummaryItemList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourceDataSyncRequest {
        var SyncType: ResourceDataSyncType?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourceDataSyncResult {
        var ResourceDataSyncItems: ResourceDataSyncItemList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceType: String /* "Document" | "ManagedInstance" | "MaintenanceWindow" | "Parameter" | "PatchBaseline" | "OpsItem" | String */
        var ResourceId: ResourceId
    }
    interface ListTagsForResourceResult {
        var TagList: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoggingInfo {
        var S3BucketName: S3BucketName
        var S3KeyPrefix: S3KeyPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var S3Region: S3Region
    }
    interface MaintenanceWindowAutomationParameters {
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: AutomationParameterMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MaintenanceWindowExecution {
        var WindowId: MaintenanceWindowId?
            get() = definedExternally
            set(value) = definedExternally
        var WindowExecutionId: MaintenanceWindowExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "IN_PROGRESS" | "SUCCESS" | "FAILED" | "TIMED_OUT" | "CANCELLING" | "CANCELLED" | "SKIPPED_OVERLAPPING" | String */
        var StatusDetails: MaintenanceWindowExecutionStatusDetails?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MaintenanceWindowExecutionTaskIdentity {
        var WindowExecutionId: MaintenanceWindowExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var TaskExecutionId: MaintenanceWindowExecutionTaskId?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "IN_PROGRESS" | "SUCCESS" | "FAILED" | "TIMED_OUT" | "CANCELLING" | "CANCELLED" | "SKIPPED_OVERLAPPING" | String */
        var StatusDetails: MaintenanceWindowExecutionStatusDetails?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var TaskArn: MaintenanceWindowTaskArn?
            get() = definedExternally
            set(value) = definedExternally
        var TaskType: String /* "RUN_COMMAND" | "AUTOMATION" | "STEP_FUNCTIONS" | "LAMBDA" | String */
    }
    interface MaintenanceWindowExecutionTaskInvocationIdentity {
        var WindowExecutionId: MaintenanceWindowExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var TaskExecutionId: MaintenanceWindowExecutionTaskId?
            get() = definedExternally
            set(value) = definedExternally
        var InvocationId: MaintenanceWindowExecutionTaskInvocationId?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionId: MaintenanceWindowExecutionTaskExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var TaskType: String /* "RUN_COMMAND" | "AUTOMATION" | "STEP_FUNCTIONS" | "LAMBDA" | String */
        var Parameters: MaintenanceWindowExecutionTaskInvocationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "IN_PROGRESS" | "SUCCESS" | "FAILED" | "TIMED_OUT" | "CANCELLING" | "CANCELLED" | "SKIPPED_OVERLAPPING" | String */
        var StatusDetails: MaintenanceWindowExecutionStatusDetails?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerInformation: OwnerInformation?
            get() = definedExternally
            set(value) = definedExternally
        var WindowTargetId: MaintenanceWindowTaskTargetId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MaintenanceWindowFilter {
        var Key: MaintenanceWindowFilterKey?
            get() = definedExternally
            set(value) = definedExternally
        var Values: MaintenanceWindowFilterValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MaintenanceWindowIdentity {
        var WindowId: MaintenanceWindowId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: MaintenanceWindowName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: MaintenanceWindowDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: MaintenanceWindowEnabled?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: MaintenanceWindowDurationHours?
            get() = definedExternally
            set(value) = definedExternally
        var Cutoff: MaintenanceWindowCutoff?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: MaintenanceWindowSchedule?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduleTimezone: MaintenanceWindowTimezone?
            get() = definedExternally
            set(value) = definedExternally
        var EndDate: MaintenanceWindowStringDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var StartDate: MaintenanceWindowStringDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var NextExecutionTime: MaintenanceWindowStringDateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MaintenanceWindowIdentityForTarget {
        var WindowId: MaintenanceWindowId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: MaintenanceWindowName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MaintenanceWindowLambdaParameters {
        var ClientContext: MaintenanceWindowLambdaClientContext?
            get() = definedExternally
            set(value) = definedExternally
        var Qualifier: MaintenanceWindowLambdaQualifier?
            get() = definedExternally
            set(value) = definedExternally
        var Payload: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MaintenanceWindowRunCommandParameters {
        var Comment: Comment?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchOutputConfig: CloudWatchOutputConfig?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentHash: DocumentHash?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentHashType: String /* "Sha256" | "Sha1" | String */
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationConfig: NotificationConfig?
            get() = definedExternally
            set(value) = definedExternally
        var OutputS3BucketName: S3BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var OutputS3KeyPrefix: S3KeyPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: Parameters?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceRoleArn: ServiceRole?
            get() = definedExternally
            set(value) = definedExternally
        var TimeoutSeconds: TimeoutSeconds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MaintenanceWindowStepFunctionsParameters {
        var Input: MaintenanceWindowStepFunctionsInput?
            get() = definedExternally
            set(value) = definedExternally
        var Name: MaintenanceWindowStepFunctionsName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MaintenanceWindowTarget {
        var WindowId: MaintenanceWindowId?
            get() = definedExternally
            set(value) = definedExternally
        var WindowTargetId: MaintenanceWindowTargetId?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: String /* "INSTANCE" | "RESOURCE_GROUP" | String */
        var Targets: Targets?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerInformation: OwnerInformation?
            get() = definedExternally
            set(value) = definedExternally
        var Name: MaintenanceWindowName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: MaintenanceWindowDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MaintenanceWindowTask {
        var WindowId: MaintenanceWindowId?
            get() = definedExternally
            set(value) = definedExternally
        var WindowTaskId: MaintenanceWindowTaskId?
            get() = definedExternally
            set(value) = definedExternally
        var TaskArn: MaintenanceWindowTaskArn?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "RUN_COMMAND" | "AUTOMATION" | "STEP_FUNCTIONS" | "LAMBDA" | String */
        var Targets: Targets?
            get() = definedExternally
            set(value) = definedExternally
        var TaskParameters: MaintenanceWindowTaskParameters?
            get() = definedExternally
            set(value) = definedExternally
        var Priority: MaintenanceWindowTaskPriority?
            get() = definedExternally
            set(value) = definedExternally
        var LoggingInfo: LoggingInfo?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceRoleArn: ServiceRole?
            get() = definedExternally
            set(value) = definedExternally
        var MaxConcurrency: MaxConcurrency?
            get() = definedExternally
            set(value) = definedExternally
        var MaxErrors: MaxErrors?
            get() = definedExternally
            set(value) = definedExternally
        var Name: MaintenanceWindowName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: MaintenanceWindowDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MaintenanceWindowTaskInvocationParameters {
        var RunCommand: MaintenanceWindowRunCommandParameters?
            get() = definedExternally
            set(value) = definedExternally
        var Automation: MaintenanceWindowAutomationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var StepFunctions: MaintenanceWindowStepFunctionsParameters?
            get() = definedExternally
            set(value) = definedExternally
        var Lambda: MaintenanceWindowLambdaParameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MaintenanceWindowTaskParameterValueExpression {
        var Values: MaintenanceWindowTaskParameterValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MaintenanceWindowTaskParameters {
        @nativeGetter
        operator fun get(key: String): MaintenanceWindowTaskParameterValueExpression?
        @nativeSetter
        operator fun set(key: String, value: MaintenanceWindowTaskParameterValueExpression)
    }
    interface ModifyDocumentPermissionRequest {
        var Name: DocumentName
        var PermissionType: String /* "Share" | String */
        var AccountIdsToAdd: AccountIdList?
            get() = definedExternally
            set(value) = definedExternally
        var AccountIdsToRemove: AccountIdList?
            get() = definedExternally
            set(value) = definedExternally
        var SharedDocumentVersion: SharedDocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyDocumentPermissionResponse
    interface NonCompliantSummary {
        var NonCompliantCount: ComplianceSummaryCount?
            get() = definedExternally
            set(value) = definedExternally
        var SeveritySummary: SeveritySummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NormalStringMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface NotificationConfig {
        var NotificationArn: NotificationArn?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationEvents: NotificationEventList?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationType: String /* "Command" | "Invocation" | String */
    }
    interface OpsAggregator {
        var AggregatorType: OpsAggregatorType?
            get() = definedExternally
            set(value) = definedExternally
        var TypeName: OpsDataTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var AttributeName: OpsDataAttributeName?
            get() = definedExternally
            set(value) = definedExternally
        var Values: OpsAggregatorValueMap?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: OpsFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Aggregators: OpsAggregatorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OpsAggregatorValueMap {
        @nativeGetter
        operator fun get(key: String): OpsAggregatorValue?
        @nativeSetter
        operator fun set(key: String, value: OpsAggregatorValue)
    }
    interface OpsEntity {
        var Id: OpsEntityId?
            get() = definedExternally
            set(value) = definedExternally
        var Data: OpsEntityItemMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OpsEntityItem {
        var CaptureTime: OpsEntityItemCaptureTime?
            get() = definedExternally
            set(value) = definedExternally
        var Content: OpsEntityItemEntryList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OpsEntityItemEntry {
        @nativeGetter
        operator fun get(key: String): AttributeValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeValue)
    }
    interface OpsEntityItemMap {
        @nativeGetter
        operator fun get(key: String): OpsEntityItem?
        @nativeSetter
        operator fun set(key: String, value: OpsEntityItem)
    }
    interface OpsFilter {
        var Key: OpsFilterKey
        var Values: OpsFilterValueList
        var Type: String /* "Equal" | "NotEqual" | "BeginWith" | "LessThan" | "GreaterThan" | "Exists" | String */
    }
    interface OpsItem {
        var CreatedBy: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Description: OpsItemDescription?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: String?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Notifications: OpsItemNotifications?
            get() = definedExternally
            set(value) = definedExternally
        var Priority: OpsItemPriority?
            get() = definedExternally
            set(value) = definedExternally
        var RelatedOpsItems: RelatedOpsItems?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Open" | "InProgress" | "Resolved" | String */
        var OpsItemId: OpsItemId?
            get() = definedExternally
            set(value) = definedExternally
        var Version: String?
            get() = definedExternally
            set(value) = definedExternally
        var Title: OpsItemTitle?
            get() = definedExternally
            set(value) = definedExternally
        var Source: OpsItemSource?
            get() = definedExternally
            set(value) = definedExternally
        var OperationalData: OpsItemOperationalData?
            get() = definedExternally
            set(value) = definedExternally
        var Category: OpsItemCategory?
            get() = definedExternally
            set(value) = definedExternally
        var Severity: OpsItemSeverity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OpsItemDataValue {
        var Value: OpsItemDataValueString?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "SearchableString" | "String" | String */
    }
    interface OpsItemFilter {
        var Key: String /* "Status" | "CreatedBy" | "Source" | "Priority" | "Title" | "OpsItemId" | "CreatedTime" | "LastModifiedTime" | "OperationalData" | "OperationalDataKey" | "OperationalDataValue" | "ResourceId" | "AutomationId" | "Category" | "Severity" | String */
        var Values: OpsItemFilterValues
        var Operator: String /* "Equal" | "Contains" | "GreaterThan" | "LessThan" | String */
    }
    interface OpsItemNotification {
        var Arn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OpsItemOperationalData {
        @nativeGetter
        operator fun get(key: String): OpsItemDataValue?
        @nativeSetter
        operator fun set(key: String, value: OpsItemDataValue)
    }
    interface OpsItemSummary {
        var CreatedBy: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: String?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Priority: OpsItemPriority?
            get() = definedExternally
            set(value) = definedExternally
        var Source: OpsItemSource?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Open" | "InProgress" | "Resolved" | String */
        var OpsItemId: OpsItemId?
            get() = definedExternally
            set(value) = definedExternally
        var Title: OpsItemTitle?
            get() = definedExternally
            set(value) = definedExternally
        var OperationalData: OpsItemOperationalData?
            get() = definedExternally
            set(value) = definedExternally
        var Category: OpsItemCategory?
            get() = definedExternally
            set(value) = definedExternally
        var Severity: OpsItemSeverity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OpsResultAttribute {
        var TypeName: OpsDataTypeName
    }
    interface OutputSource {
        var OutputSourceId: OutputSourceId?
            get() = definedExternally
            set(value) = definedExternally
        var OutputSourceType: OutputSourceType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Parameter {
        var Name: PSParameterName?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "String" | "StringList" | "SecureString" | String */
        var Value: PSParameterValue?
            get() = definedExternally
            set(value) = definedExternally
        var Version: PSParameterVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Selector: PSParameterSelector?
            get() = definedExternally
            set(value) = definedExternally
        var SourceResult: String?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var ARN: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ParameterHistory {
        var Name: PSParameterName?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "String" | "StringList" | "SecureString" | String */
        var KeyId: ParameterKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedUser: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ParameterDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Value: PSParameterValue?
            get() = definedExternally
            set(value) = definedExternally
        var AllowedPattern: AllowedPattern?
            get() = definedExternally
            set(value) = definedExternally
        var Version: PSParameterVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Labels: ParameterLabelList?
            get() = definedExternally
            set(value) = definedExternally
        var Tier: String /* "Standard" | "Advanced" | "Intelligent-Tiering" | String */
        var Policies: ParameterPolicyList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ParameterInlinePolicy {
        var PolicyText: String?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyType: String?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyStatus: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ParameterMetadata {
        var Name: PSParameterName?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "String" | "StringList" | "SecureString" | String */
        var KeyId: ParameterKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedUser: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ParameterDescription?
            get() = definedExternally
            set(value) = definedExternally
        var AllowedPattern: AllowedPattern?
            get() = definedExternally
            set(value) = definedExternally
        var Version: PSParameterVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Tier: String /* "Standard" | "Advanced" | "Intelligent-Tiering" | String */
        var Policies: ParameterPolicyList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ParameterStringFilter {
        var Key: ParameterStringFilterKey
        var Option: ParameterStringQueryOption?
            get() = definedExternally
            set(value) = definedExternally
        var Values: ParameterStringFilterValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Parameters {
        @nativeGetter
        operator fun get(key: String): ParameterValueList?
        @nativeSetter
        operator fun set(key: String, value: ParameterValueList)
    }
    interface ParametersFilter {
        var Key: String /* "Name" | "Type" | "KeyId" | String */
        var Values: ParametersFilterValueList
    }
    interface Patch {
        var Id: PatchId?
            get() = definedExternally
            set(value) = definedExternally
        var ReleaseDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Title: PatchTitle?
            get() = definedExternally
            set(value) = definedExternally
        var Description: PatchDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ContentUrl: PatchContentUrl?
            get() = definedExternally
            set(value) = definedExternally
        var Vendor: PatchVendor?
            get() = definedExternally
            set(value) = definedExternally
        var ProductFamily: PatchProductFamily?
            get() = definedExternally
            set(value) = definedExternally
        var Product: PatchProduct?
            get() = definedExternally
            set(value) = definedExternally
        var Classification: PatchClassification?
            get() = definedExternally
            set(value) = definedExternally
        var MsrcSeverity: PatchMsrcSeverity?
            get() = definedExternally
            set(value) = definedExternally
        var KbNumber: PatchKbNumber?
            get() = definedExternally
            set(value) = definedExternally
        var MsrcNumber: PatchMsrcNumber?
            get() = definedExternally
            set(value) = definedExternally
        var Language: PatchLanguage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PatchBaselineIdentity {
        var BaselineId: BaselineId?
            get() = definedExternally
            set(value) = definedExternally
        var BaselineName: BaselineName?
            get() = definedExternally
            set(value) = definedExternally
        var OperatingSystem: String /* "WINDOWS" | "AMAZON_LINUX" | "AMAZON_LINUX_2" | "UBUNTU" | "REDHAT_ENTERPRISE_LINUX" | "SUSE" | "CENTOS" | String */
        var BaselineDescription: BaselineDescription?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultBaseline: DefaultBaseline?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PatchComplianceData {
        var Title: PatchTitle
        var KBId: PatchKbNumber
        var Classification: PatchClassification
        var Severity: PatchSeverity
        var State: String /* "INSTALLED" | "INSTALLED_OTHER" | "INSTALLED_PENDING_REBOOT" | "INSTALLED_REJECTED" | "MISSING" | "NOT_APPLICABLE" | "FAILED" | String */
        var InstalledTime: DateTime
    }
    interface PatchFilter {
        var Key: String /* "PATCH_SET" | "PRODUCT" | "PRODUCT_FAMILY" | "CLASSIFICATION" | "MSRC_SEVERITY" | "PATCH_ID" | "SECTION" | "PRIORITY" | "SEVERITY" | String */
        var Values: PatchFilterValueList
    }
    interface PatchFilterGroup {
        var PatchFilters: PatchFilterList
    }
    interface PatchGroupPatchBaselineMapping {
        var PatchGroup: PatchGroup?
            get() = definedExternally
            set(value) = definedExternally
        var BaselineIdentity: PatchBaselineIdentity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PatchOrchestratorFilter {
        var Key: PatchOrchestratorFilterKey?
            get() = definedExternally
            set(value) = definedExternally
        var Values: PatchOrchestratorFilterValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PatchPropertyEntry {
        @nativeGetter
        operator fun get(key: String): AttributeValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeValue)
    }
    interface PatchRule {
        var PatchFilterGroup: PatchFilterGroup
        var ComplianceLevel: String /* "CRITICAL" | "HIGH" | "MEDIUM" | "LOW" | "INFORMATIONAL" | "UNSPECIFIED" | String */
        var ApproveAfterDays: ApproveAfterDays?
            get() = definedExternally
            set(value) = definedExternally
        var ApproveUntilDate: PatchStringDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var EnableNonSecurity: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PatchRuleGroup {
        var PatchRules: PatchRuleList
    }
    interface PatchSource {
        var Name: PatchSourceName
        var Products: PatchSourceProductList
        var Configuration: PatchSourceConfiguration
    }
    interface PatchStatus {
        var DeploymentStatus: String /* "APPROVED" | "PENDING_APPROVAL" | "EXPLICIT_APPROVED" | "EXPLICIT_REJECTED" | String */
        var ComplianceLevel: String /* "CRITICAL" | "HIGH" | "MEDIUM" | "LOW" | "INFORMATIONAL" | "UNSPECIFIED" | String */
        var ApprovalDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProgressCounters {
        var TotalSteps: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var SuccessSteps: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var FailedSteps: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var CancelledSteps: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var TimedOutSteps: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutComplianceItemsRequest {
        var ResourceId: ComplianceResourceId
        var ResourceType: ComplianceResourceType
        var ComplianceType: ComplianceTypeName
        var ExecutionSummary: ComplianceExecutionSummary
        var Items: ComplianceItemEntryList
        var ItemContentHash: ComplianceItemContentHash?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutComplianceItemsResult
    interface PutInventoryRequest {
        var InstanceId: InstanceId
        var Items: InventoryItemList
    }
    interface PutInventoryResult {
        var Message: PutInventoryMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutParameterRequest {
        var Name: PSParameterName
        var Description: ParameterDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Value: PSParameterValue
        var Type: String /* "String" | "StringList" | "SecureString" | String */
        var KeyId: ParameterKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var Overwrite: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AllowedPattern: AllowedPattern?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var Tier: String /* "Standard" | "Advanced" | "Intelligent-Tiering" | String */
        var Policies: ParameterPolicies?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutParameterResult {
        var Version: PSParameterVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Tier: String /* "Standard" | "Advanced" | "Intelligent-Tiering" | String */
    }
    interface RegisterDefaultPatchBaselineRequest {
        var BaselineId: BaselineId
    }
    interface RegisterDefaultPatchBaselineResult {
        var BaselineId: BaselineId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterPatchBaselineForPatchGroupRequest {
        var BaselineId: BaselineId
        var PatchGroup: PatchGroup
    }
    interface RegisterPatchBaselineForPatchGroupResult {
        var BaselineId: BaselineId?
            get() = definedExternally
            set(value) = definedExternally
        var PatchGroup: PatchGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterTargetWithMaintenanceWindowRequest {
        var WindowId: MaintenanceWindowId
        var ResourceType: String /* "INSTANCE" | "RESOURCE_GROUP" | String */
        var Targets: Targets
        var OwnerInformation: OwnerInformation?
            get() = definedExternally
            set(value) = definedExternally
        var Name: MaintenanceWindowName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: MaintenanceWindowDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ClientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterTargetWithMaintenanceWindowResult {
        var WindowTargetId: MaintenanceWindowTargetId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterTaskWithMaintenanceWindowRequest {
        var WindowId: MaintenanceWindowId
        var Targets: Targets
        var TaskArn: MaintenanceWindowTaskArn
        var ServiceRoleArn: ServiceRole?
            get() = definedExternally
            set(value) = definedExternally
        var TaskType: String /* "RUN_COMMAND" | "AUTOMATION" | "STEP_FUNCTIONS" | "LAMBDA" | String */
        var TaskParameters: MaintenanceWindowTaskParameters?
            get() = definedExternally
            set(value) = definedExternally
        var TaskInvocationParameters: MaintenanceWindowTaskInvocationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var Priority: MaintenanceWindowTaskPriority?
            get() = definedExternally
            set(value) = definedExternally
        var MaxConcurrency: MaxConcurrency
        var MaxErrors: MaxErrors
        var LoggingInfo: LoggingInfo?
            get() = definedExternally
            set(value) = definedExternally
        var Name: MaintenanceWindowName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: MaintenanceWindowDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ClientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterTaskWithMaintenanceWindowResult {
        var WindowTaskId: MaintenanceWindowTaskId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RelatedOpsItem {
        var OpsItemId: String
    }
    interface RemoveTagsFromResourceRequest {
        var ResourceType: String /* "Document" | "ManagedInstance" | "MaintenanceWindow" | "Parameter" | "PatchBaseline" | "OpsItem" | String */
        var ResourceId: ResourceId
        var TagKeys: KeyList
    }
    interface RemoveTagsFromResourceResult
    interface ResetServiceSettingRequest {
        var SettingId: ServiceSettingId
    }
    interface ResetServiceSettingResult {
        var ServiceSetting: ServiceSetting?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResolvedTargets {
        var ParameterValues: TargetParameterList?
            get() = definedExternally
            set(value) = definedExternally
        var Truncated: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceComplianceSummaryItem {
        var ComplianceType: ComplianceTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: ComplianceResourceType?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: ComplianceResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "COMPLIANT" | "NON_COMPLIANT" | String */
        var OverallSeverity: String /* "CRITICAL" | "HIGH" | "MEDIUM" | "LOW" | "INFORMATIONAL" | "UNSPECIFIED" | String */
        var ExecutionSummary: ComplianceExecutionSummary?
            get() = definedExternally
            set(value) = definedExternally
        var CompliantSummary: CompliantSummary?
            get() = definedExternally
            set(value) = definedExternally
        var NonCompliantSummary: NonCompliantSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceDataSyncAwsOrganizationsSource {
        var OrganizationSourceType: ResourceDataSyncOrganizationSourceType
        var OrganizationalUnits: ResourceDataSyncOrganizationalUnitList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceDataSyncDestinationDataSharing {
        var DestinationDataSharingType: ResourceDataSyncDestinationDataSharingType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceDataSyncItem {
        var SyncName: ResourceDataSyncName?
            get() = definedExternally
            set(value) = definedExternally
        var SyncType: ResourceDataSyncType?
            get() = definedExternally
            set(value) = definedExternally
        var SyncSource: ResourceDataSyncSourceWithState?
            get() = definedExternally
            set(value) = definedExternally
        var S3Destination: ResourceDataSyncS3Destination?
            get() = definedExternally
            set(value) = definedExternally
        var LastSyncTime: LastResourceDataSyncTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastSuccessfulSyncTime: LastSuccessfulResourceDataSyncTime?
            get() = definedExternally
            set(value) = definedExternally
        var SyncLastModifiedTime: ResourceDataSyncLastModifiedTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastStatus: String /* "Successful" | "Failed" | "InProgress" | String */
        var SyncCreatedTime: ResourceDataSyncCreatedTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastSyncStatusMessage: LastResourceDataSyncMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceDataSyncOrganizationalUnit {
        var OrganizationalUnitId: ResourceDataSyncOrganizationalUnitId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceDataSyncS3Destination {
        var BucketName: ResourceDataSyncS3BucketName
        var Prefix: ResourceDataSyncS3Prefix?
            get() = definedExternally
            set(value) = definedExternally
        var SyncFormat: String /* "JsonSerDe" | String */
        var Region: ResourceDataSyncS3Region
        var AWSKMSKeyARN: ResourceDataSyncAWSKMSKeyARN?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationDataSharing: ResourceDataSyncDestinationDataSharing?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceDataSyncSource {
        var SourceType: ResourceDataSyncSourceType
        var AwsOrganizationsSource: ResourceDataSyncAwsOrganizationsSource?
            get() = definedExternally
            set(value) = definedExternally
        var SourceRegions: ResourceDataSyncSourceRegionList
        var IncludeFutureRegions: ResourceDataSyncIncludeFutureRegions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceDataSyncSourceWithState {
        var SourceType: ResourceDataSyncSourceType?
            get() = definedExternally
            set(value) = definedExternally
        var AwsOrganizationsSource: ResourceDataSyncAwsOrganizationsSource?
            get() = definedExternally
            set(value) = definedExternally
        var SourceRegions: ResourceDataSyncSourceRegionList?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeFutureRegions: ResourceDataSyncIncludeFutureRegions?
            get() = definedExternally
            set(value) = definedExternally
        var State: ResourceDataSyncState?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResultAttribute {
        var TypeName: InventoryItemTypeName
    }
    interface ResumeSessionRequest {
        var SessionId: SessionId
    }
    interface ResumeSessionResponse {
        var SessionId: SessionId?
            get() = definedExternally
            set(value) = definedExternally
        var TokenValue: TokenValue?
            get() = definedExternally
            set(value) = definedExternally
        var StreamUrl: StreamUrl?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3OutputLocation {
        var OutputS3Region: S3Region?
            get() = definedExternally
            set(value) = definedExternally
        var OutputS3BucketName: S3BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var OutputS3KeyPrefix: S3KeyPrefix?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3OutputUrl {
        var OutputUrl: Url?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScheduledWindowExecution {
        var WindowId: MaintenanceWindowId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: MaintenanceWindowName?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionTime: MaintenanceWindowStringDateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendAutomationSignalRequest {
        var AutomationExecutionId: AutomationExecutionId
        var SignalType: String /* "Approve" | "Reject" | "StartStep" | "StopStep" | "Resume" | String */
        var Payload: AutomationParameterMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendAutomationSignalResult
    interface SendCommandRequest {
        var InstanceIds: InstanceIdList?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: Targets?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentName: DocumentARN
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentHash: DocumentHash?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentHashType: String /* "Sha256" | "Sha1" | String */
        var TimeoutSeconds: TimeoutSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var Comment: Comment?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: Parameters?
            get() = definedExternally
            set(value) = definedExternally
        var OutputS3Region: S3Region?
            get() = definedExternally
            set(value) = definedExternally
        var OutputS3BucketName: S3BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var OutputS3KeyPrefix: S3KeyPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var MaxConcurrency: MaxConcurrency?
            get() = definedExternally
            set(value) = definedExternally
        var MaxErrors: MaxErrors?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceRoleArn: ServiceRole?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationConfig: NotificationConfig?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchOutputConfig: CloudWatchOutputConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendCommandResult {
        var Command: Command?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServiceSetting {
        var SettingId: ServiceSettingId?
            get() = definedExternally
            set(value) = definedExternally
        var SettingValue: ServiceSettingValue?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedUser: String?
            get() = definedExternally
            set(value) = definedExternally
        var ARN: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Session {
        var SessionId: SessionId?
            get() = definedExternally
            set(value) = definedExternally
        var Target: SessionTarget?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Connected" | "Connecting" | "Disconnected" | "Terminated" | "Terminating" | "Failed" | String */
        var StartDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var EndDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentName: DocumentName?
            get() = definedExternally
            set(value) = definedExternally
        var Owner: SessionOwner?
            get() = definedExternally
            set(value) = definedExternally
        var Details: SessionDetails?
            get() = definedExternally
            set(value) = definedExternally
        var OutputUrl: SessionManagerOutputUrl?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SessionFilter {
        var key: String /* "InvokedAfter" | "InvokedBefore" | "Target" | "Owner" | "Status" | String */
        var value: SessionFilterValue
    }
    interface SessionManagerOutputUrl {
        var S3OutputUrl: SessionManagerS3OutputUrl?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchOutputUrl: SessionManagerCloudWatchOutputUrl?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SessionManagerParameters {
        @nativeGetter
        operator fun get(key: String): SessionManagerParameterValueList?
        @nativeSetter
        operator fun set(key: String, value: SessionManagerParameterValueList)
    }
    interface SeveritySummary {
        var CriticalCount: ComplianceSummaryCount?
            get() = definedExternally
            set(value) = definedExternally
        var HighCount: ComplianceSummaryCount?
            get() = definedExternally
            set(value) = definedExternally
        var MediumCount: ComplianceSummaryCount?
            get() = definedExternally
            set(value) = definedExternally
        var LowCount: ComplianceSummaryCount?
            get() = definedExternally
            set(value) = definedExternally
        var InformationalCount: ComplianceSummaryCount?
            get() = definedExternally
            set(value) = definedExternally
        var UnspecifiedCount: ComplianceSummaryCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartAssociationsOnceRequest {
        var AssociationIds: AssociationIdList
    }
    interface StartAssociationsOnceResult
    interface StartAutomationExecutionRequest {
        var DocumentName: DocumentARN
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: AutomationParameterMap?
            get() = definedExternally
            set(value) = definedExternally
        var ClientToken: IdempotencyToken?
            get() = definedExternally
            set(value) = definedExternally
        var Mode: String /* "Auto" | "Interactive" | String */
        var TargetParameterName: AutomationParameterKey?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: Targets?
            get() = definedExternally
            set(value) = definedExternally
        var TargetMaps: TargetMaps?
            get() = definedExternally
            set(value) = definedExternally
        var MaxConcurrency: MaxConcurrency?
            get() = definedExternally
            set(value) = definedExternally
        var MaxErrors: MaxErrors?
            get() = definedExternally
            set(value) = definedExternally
        var TargetLocations: TargetLocations?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartAutomationExecutionResult {
        var AutomationExecutionId: AutomationExecutionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartSessionRequest {
        var Target: SessionTarget
        var DocumentName: DocumentARN?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: SessionManagerParameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartSessionResponse {
        var SessionId: SessionId?
            get() = definedExternally
            set(value) = definedExternally
        var TokenValue: TokenValue?
            get() = definedExternally
            set(value) = definedExternally
        var StreamUrl: StreamUrl?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StepExecution {
        var StepName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Action: AutomationActionName?
            get() = definedExternally
            set(value) = definedExternally
        var TimeoutSeconds: Long?
            get() = definedExternally
            set(value) = definedExternally
        var OnFailure: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxAttempts: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionStartTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionEndTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var StepStatus: String /* "Pending" | "InProgress" | "Waiting" | "Success" | "TimedOut" | "Cancelling" | "Cancelled" | "Failed" | String */
        var ResponseCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var Inputs: NormalStringMap?
            get() = definedExternally
            set(value) = definedExternally
        var Outputs: AutomationParameterMap?
            get() = definedExternally
            set(value) = definedExternally
        var Response: String?
            get() = definedExternally
            set(value) = definedExternally
        var FailureMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var FailureDetails: FailureDetails?
            get() = definedExternally
            set(value) = definedExternally
        var StepExecutionId: String?
            get() = definedExternally
            set(value) = definedExternally
        var OverriddenParameters: AutomationParameterMap?
            get() = definedExternally
            set(value) = definedExternally
        var IsEnd: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var NextStep: String?
            get() = definedExternally
            set(value) = definedExternally
        var IsCritical: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ValidNextSteps: ValidNextStepList?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: Targets?
            get() = definedExternally
            set(value) = definedExternally
        var TargetLocation: TargetLocation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StepExecutionFilter {
        var Key: String /* "StartTimeBefore" | "StartTimeAfter" | "StepExecutionStatus" | "StepExecutionId" | "StepName" | "Action" | String */
        var Values: StepExecutionFilterValueList
    }
    interface StopAutomationExecutionRequest {
        var AutomationExecutionId: AutomationExecutionId
        var Type: String /* "Complete" | "Cancel" | String */
    }
    interface StopAutomationExecutionResult
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface Target {
        var Key: TargetKey?
            get() = definedExternally
            set(value) = definedExternally
        var Values: TargetValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TargetLocation {
        var Accounts: Accounts?
            get() = definedExternally
            set(value) = definedExternally
        var Regions: Regions?
            get() = definedExternally
            set(value) = definedExternally
        var TargetLocationMaxConcurrency: MaxConcurrency?
            get() = definedExternally
            set(value) = definedExternally
        var TargetLocationMaxErrors: MaxErrors?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionRoleName: ExecutionRoleName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TargetMap {
        @nativeGetter
        operator fun get(key: String): TargetMapValueList?
        @nativeSetter
        operator fun set(key: String, value: TargetMapValueList)
    }
    interface TerminateSessionRequest {
        var SessionId: SessionId
    }
    interface TerminateSessionResponse {
        var SessionId: SessionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateAssociationRequest {
        var AssociationId: AssociationId
        var Parameters: Parameters?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduleExpression: ScheduleExpression?
            get() = definedExternally
            set(value) = definedExternally
        var OutputLocation: InstanceAssociationOutputLocation?
            get() = definedExternally
            set(value) = definedExternally
        var Name: DocumentARN?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: Targets?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationName: AssociationName?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationVersion: AssociationVersion?
            get() = definedExternally
            set(value) = definedExternally
        var AutomationTargetParameterName: AutomationTargetParameterName?
            get() = definedExternally
            set(value) = definedExternally
        var MaxErrors: MaxErrors?
            get() = definedExternally
            set(value) = definedExternally
        var MaxConcurrency: MaxConcurrency?
            get() = definedExternally
            set(value) = definedExternally
        var ComplianceSeverity: String /* "CRITICAL" | "HIGH" | "MEDIUM" | "LOW" | "UNSPECIFIED" | String */
    }
    interface UpdateAssociationResult {
        var AssociationDescription: AssociationDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateAssociationStatusRequest {
        var Name: DocumentARN
        var InstanceId: InstanceId
        var AssociationStatus: AssociationStatus
    }
    interface UpdateAssociationStatusResult {
        var AssociationDescription: AssociationDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDocumentDefaultVersionRequest {
        var Name: DocumentName
        var DocumentVersion: DocumentVersionNumber
    }
    interface UpdateDocumentDefaultVersionResult {
        var Description: DocumentDefaultVersionDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDocumentRequest {
        var Content: DocumentContent
        var Attachments: AttachmentsSourceList?
            get() = definedExternally
            set(value) = definedExternally
        var Name: DocumentName
        var VersionName: DocumentVersionName?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentVersion: DocumentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentFormat: String /* "YAML" | "JSON" | "TEXT" | String */
        var TargetType: TargetType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDocumentResult {
        var DocumentDescription: DocumentDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMaintenanceWindowRequest {
        var WindowId: MaintenanceWindowId
        var Name: MaintenanceWindowName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: MaintenanceWindowDescription?
            get() = definedExternally
            set(value) = definedExternally
        var StartDate: MaintenanceWindowStringDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var EndDate: MaintenanceWindowStringDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: MaintenanceWindowSchedule?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduleTimezone: MaintenanceWindowTimezone?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: MaintenanceWindowDurationHours?
            get() = definedExternally
            set(value) = definedExternally
        var Cutoff: MaintenanceWindowCutoff?
            get() = definedExternally
            set(value) = definedExternally
        var AllowUnassociatedTargets: MaintenanceWindowAllowUnassociatedTargets?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: MaintenanceWindowEnabled?
            get() = definedExternally
            set(value) = definedExternally
        var Replace: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMaintenanceWindowResult {
        var WindowId: MaintenanceWindowId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: MaintenanceWindowName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: MaintenanceWindowDescription?
            get() = definedExternally
            set(value) = definedExternally
        var StartDate: MaintenanceWindowStringDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var EndDate: MaintenanceWindowStringDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: MaintenanceWindowSchedule?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduleTimezone: MaintenanceWindowTimezone?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: MaintenanceWindowDurationHours?
            get() = definedExternally
            set(value) = definedExternally
        var Cutoff: MaintenanceWindowCutoff?
            get() = definedExternally
            set(value) = definedExternally
        var AllowUnassociatedTargets: MaintenanceWindowAllowUnassociatedTargets?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: MaintenanceWindowEnabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMaintenanceWindowTargetRequest {
        var WindowId: MaintenanceWindowId
        var WindowTargetId: MaintenanceWindowTargetId
        var Targets: Targets?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerInformation: OwnerInformation?
            get() = definedExternally
            set(value) = definedExternally
        var Name: MaintenanceWindowName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: MaintenanceWindowDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Replace: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMaintenanceWindowTargetResult {
        var WindowId: MaintenanceWindowId?
            get() = definedExternally
            set(value) = definedExternally
        var WindowTargetId: MaintenanceWindowTargetId?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: Targets?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerInformation: OwnerInformation?
            get() = definedExternally
            set(value) = definedExternally
        var Name: MaintenanceWindowName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: MaintenanceWindowDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMaintenanceWindowTaskRequest {
        var WindowId: MaintenanceWindowId
        var WindowTaskId: MaintenanceWindowTaskId
        var Targets: Targets?
            get() = definedExternally
            set(value) = definedExternally
        var TaskArn: MaintenanceWindowTaskArn?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceRoleArn: ServiceRole?
            get() = definedExternally
            set(value) = definedExternally
        var TaskParameters: MaintenanceWindowTaskParameters?
            get() = definedExternally
            set(value) = definedExternally
        var TaskInvocationParameters: MaintenanceWindowTaskInvocationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var Priority: MaintenanceWindowTaskPriority?
            get() = definedExternally
            set(value) = definedExternally
        var MaxConcurrency: MaxConcurrency?
            get() = definedExternally
            set(value) = definedExternally
        var MaxErrors: MaxErrors?
            get() = definedExternally
            set(value) = definedExternally
        var LoggingInfo: LoggingInfo?
            get() = definedExternally
            set(value) = definedExternally
        var Name: MaintenanceWindowName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: MaintenanceWindowDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Replace: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMaintenanceWindowTaskResult {
        var WindowId: MaintenanceWindowId?
            get() = definedExternally
            set(value) = definedExternally
        var WindowTaskId: MaintenanceWindowTaskId?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: Targets?
            get() = definedExternally
            set(value) = definedExternally
        var TaskArn: MaintenanceWindowTaskArn?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceRoleArn: ServiceRole?
            get() = definedExternally
            set(value) = definedExternally
        var TaskParameters: MaintenanceWindowTaskParameters?
            get() = definedExternally
            set(value) = definedExternally
        var TaskInvocationParameters: MaintenanceWindowTaskInvocationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var Priority: MaintenanceWindowTaskPriority?
            get() = definedExternally
            set(value) = definedExternally
        var MaxConcurrency: MaxConcurrency?
            get() = definedExternally
            set(value) = definedExternally
        var MaxErrors: MaxErrors?
            get() = definedExternally
            set(value) = definedExternally
        var LoggingInfo: LoggingInfo?
            get() = definedExternally
            set(value) = definedExternally
        var Name: MaintenanceWindowName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: MaintenanceWindowDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateManagedInstanceRoleRequest {
        var InstanceId: ManagedInstanceId
        var IamRole: IamRole
    }
    interface UpdateManagedInstanceRoleResult
    interface UpdateOpsItemRequest {
        var Description: OpsItemDescription?
            get() = definedExternally
            set(value) = definedExternally
        var OperationalData: OpsItemOperationalData?
            get() = definedExternally
            set(value) = definedExternally
        var OperationalDataToDelete: OpsItemOpsDataKeysList?
            get() = definedExternally
            set(value) = definedExternally
        var Notifications: OpsItemNotifications?
            get() = definedExternally
            set(value) = definedExternally
        var Priority: OpsItemPriority?
            get() = definedExternally
            set(value) = definedExternally
        var RelatedOpsItems: RelatedOpsItems?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Open" | "InProgress" | "Resolved" | String */
        var OpsItemId: OpsItemId
        var Title: OpsItemTitle?
            get() = definedExternally
            set(value) = definedExternally
        var Category: OpsItemCategory?
            get() = definedExternally
            set(value) = definedExternally
        var Severity: OpsItemSeverity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateOpsItemResponse
    interface UpdatePatchBaselineRequest {
        var BaselineId: BaselineId
        var Name: BaselineName?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalFilters: PatchFilterGroup?
            get() = definedExternally
            set(value) = definedExternally
        var ApprovalRules: PatchRuleGroup?
            get() = definedExternally
            set(value) = definedExternally
        var ApprovedPatches: PatchIdList?
            get() = definedExternally
            set(value) = definedExternally
        var ApprovedPatchesComplianceLevel: String /* "CRITICAL" | "HIGH" | "MEDIUM" | "LOW" | "INFORMATIONAL" | "UNSPECIFIED" | String */
        var ApprovedPatchesEnableNonSecurity: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RejectedPatches: PatchIdList?
            get() = definedExternally
            set(value) = definedExternally
        var RejectedPatchesAction: String /* "ALLOW_AS_DEPENDENCY" | "BLOCK" | String */
        var Description: BaselineDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Sources: PatchSourceList?
            get() = definedExternally
            set(value) = definedExternally
        var Replace: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdatePatchBaselineResult {
        var BaselineId: BaselineId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: BaselineName?
            get() = definedExternally
            set(value) = definedExternally
        var OperatingSystem: String /* "WINDOWS" | "AMAZON_LINUX" | "AMAZON_LINUX_2" | "UBUNTU" | "REDHAT_ENTERPRISE_LINUX" | "SUSE" | "CENTOS" | String */
        var GlobalFilters: PatchFilterGroup?
            get() = definedExternally
            set(value) = definedExternally
        var ApprovalRules: PatchRuleGroup?
            get() = definedExternally
            set(value) = definedExternally
        var ApprovedPatches: PatchIdList?
            get() = definedExternally
            set(value) = definedExternally
        var ApprovedPatchesComplianceLevel: String /* "CRITICAL" | "HIGH" | "MEDIUM" | "LOW" | "INFORMATIONAL" | "UNSPECIFIED" | String */
        var ApprovedPatchesEnableNonSecurity: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RejectedPatches: PatchIdList?
            get() = definedExternally
            set(value) = definedExternally
        var RejectedPatchesAction: String /* "ALLOW_AS_DEPENDENCY" | "BLOCK" | String */
        var CreatedDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var ModifiedDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Description: BaselineDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Sources: PatchSourceList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateResourceDataSyncRequest {
        var SyncName: ResourceDataSyncName
        var SyncType: ResourceDataSyncType
        var SyncSource: ResourceDataSyncSource
    }
    interface UpdateResourceDataSyncResult
    interface UpdateServiceSettingRequest {
        var SettingId: ServiceSettingId
        var SettingValue: ServiceSettingValue
    }
    interface UpdateServiceSettingResult
    interface ClientApiVersions {
        var apiVersion: String /* "2014-11-06" | "latest" | String */
    }
}