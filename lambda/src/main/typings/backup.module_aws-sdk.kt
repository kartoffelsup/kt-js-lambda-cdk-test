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
import Backup.BackupJob
import Backup.BackupPlanTemplatesListMember
import Backup.BackupPlansListMember
import Backup.BackupRule
import Backup.BackupRuleInput
import Backup.BackupSelectionsListMember
import Backup.BackupVaultListMember
import Backup.CopyAction
import Backup.CopyJob
import Backup.Condition
import Backup.ProtectedResource
import Backup.RecoveryPointByBackupVault
import Backup.RecoveryPointByResource
import Backup.RestoreJobsListMember
import Backup.CreateBackupPlanInput
import Backup.CreateBackupPlanOutput
import Backup.CreateBackupSelectionInput
import Backup.CreateBackupSelectionOutput
import Backup.CreateBackupVaultInput
import Backup.CreateBackupVaultOutput
import Backup.DeleteBackupPlanInput
import Backup.DeleteBackupPlanOutput
import Backup.DeleteBackupSelectionInput
import Backup.DeleteBackupVaultInput
import Backup.DeleteBackupVaultAccessPolicyInput
import Backup.DeleteBackupVaultNotificationsInput
import Backup.DeleteRecoveryPointInput
import Backup.DescribeBackupJobInput
import Backup.DescribeBackupJobOutput
import Backup.DescribeBackupVaultInput
import Backup.DescribeBackupVaultOutput
import Backup.DescribeCopyJobInput
import Backup.DescribeCopyJobOutput
import Backup.DescribeProtectedResourceInput
import Backup.DescribeProtectedResourceOutput
import Backup.DescribeRecoveryPointInput
import Backup.DescribeRecoveryPointOutput
import Backup.DescribeRestoreJobInput
import Backup.DescribeRestoreJobOutput
import Backup.ExportBackupPlanTemplateInput
import Backup.ExportBackupPlanTemplateOutput
import Backup.GetBackupPlanInput
import Backup.GetBackupPlanOutput
import Backup.GetBackupPlanFromJSONInput
import Backup.GetBackupPlanFromJSONOutput
import Backup.GetBackupPlanFromTemplateInput
import Backup.GetBackupPlanFromTemplateOutput
import Backup.GetBackupSelectionInput
import Backup.GetBackupSelectionOutput
import Backup.GetBackupVaultAccessPolicyInput
import Backup.GetBackupVaultAccessPolicyOutput
import Backup.GetBackupVaultNotificationsInput
import Backup.GetBackupVaultNotificationsOutput
import Backup.GetRecoveryPointRestoreMetadataInput
import Backup.GetRecoveryPointRestoreMetadataOutput
import Backup.GetSupportedResourceTypesOutput
import Backup.ListBackupJobsInput
import Backup.ListBackupJobsOutput
import Backup.ListBackupPlanTemplatesInput
import Backup.ListBackupPlanTemplatesOutput
import Backup.ListBackupPlanVersionsInput
import Backup.ListBackupPlanVersionsOutput
import Backup.ListBackupPlansInput
import Backup.ListBackupPlansOutput
import Backup.ListBackupSelectionsInput
import Backup.ListBackupSelectionsOutput
import Backup.ListBackupVaultsInput
import Backup.ListBackupVaultsOutput
import Backup.ListCopyJobsInput
import Backup.ListCopyJobsOutput
import Backup.ListProtectedResourcesInput
import Backup.ListProtectedResourcesOutput
import Backup.ListRecoveryPointsByBackupVaultInput
import Backup.ListRecoveryPointsByBackupVaultOutput
import Backup.ListRecoveryPointsByResourceInput
import Backup.ListRecoveryPointsByResourceOutput
import Backup.ListRestoreJobsInput
import Backup.ListRestoreJobsOutput
import Backup.ListTagsInput
import Backup.ListTagsOutput
import Backup.PutBackupVaultAccessPolicyInput
import Backup.PutBackupVaultNotificationsInput
import Backup.StartBackupJobInput
import Backup.StartBackupJobOutput
import Backup.StartCopyJobInput
import Backup.StartCopyJobOutput
import Backup.StartRestoreJobInput
import Backup.StartRestoreJobOutput
import Backup.StopBackupJobInput
import Backup.TagResourceInput
import Backup.UntagResourceInput
import Backup.UpdateBackupPlanInput
import Backup.UpdateBackupPlanOutput
import Backup.UpdateRecoveryPointLifecycleInput
import Backup.UpdateRecoveryPointLifecycleOutput
import Backup.RecoveryPointCreator
import Backup.Lifecycle
import Backup.Tags
import Backup.BackupPlanInput
import Backup.BackupSelection
import Backup.CalculatedLifecycle
import Backup.BackupPlan
import Backup.Metadata

typealias ARN = String

typealias BackupJobsList = Array<BackupJob>

typealias BackupPlanName = String

typealias BackupPlanTemplatesList = Array<BackupPlanTemplatesListMember>

typealias BackupPlanVersionsList = Array<BackupPlansListMember>

typealias BackupPlansList = Array<BackupPlansListMember>

typealias BackupRuleName = String

typealias BackupRules = Array<BackupRule>

typealias BackupRulesInput = Array<BackupRuleInput>

typealias BackupSelectionName = String

typealias BackupSelectionsList = Array<BackupSelectionsListMember>

typealias BackupVaultEvents = Array<String /* "BACKUP_JOB_STARTED" | "BACKUP_JOB_COMPLETED" | "BACKUP_JOB_SUCCESSFUL" | "BACKUP_JOB_FAILED" | "BACKUP_JOB_EXPIRED" | "RESTORE_JOB_STARTED" | "RESTORE_JOB_COMPLETED" | "RESTORE_JOB_SUCCESSFUL" | "RESTORE_JOB_FAILED" | "COPY_JOB_STARTED" | "COPY_JOB_SUCCESSFUL" | "COPY_JOB_FAILED" | "RECOVERY_POINT_MODIFIED" | "BACKUP_PLAN_CREATED" | "BACKUP_PLAN_MODIFIED" | String */>

typealias BackupVaultList = Array<BackupVaultListMember>

typealias BackupVaultName = String

typealias Boolean = Boolean

typealias ConditionKey = String

typealias ConditionValue = String

typealias CopyActions = Array<CopyAction>

typealias CopyJobsList = Array<CopyJob>

typealias CronExpression = String

typealias IAMPolicy = String

typealias IAMRoleArn = String

typealias ListOfTags = Array<Condition>

typealias Long = Number

typealias MaxResults = Number

typealias MetadataKey = String

typealias MetadataValue = String

typealias ProtectedResourcesList = Array<ProtectedResource>

typealias RecoveryPointByBackupVaultList = Array<RecoveryPointByBackupVault>

typealias RecoveryPointByResourceList = Array<RecoveryPointByResource>

typealias ResourceArns = Array<ARN>

typealias ResourceType = String

typealias ResourceTypes = Array<ResourceType>

typealias RestoreJobId = String

typealias RestoreJobsList = Array<RestoreJobsListMember>

typealias TagKey = String

typealias TagKeyList = Array<String>

typealias TagValue = String

typealias WindowMinutes = Number

typealias long = Number

typealias timestamp = Date

@JsModule("aws-sdk")
external open class Backup(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Backup.Types.ClientConfiguration */
    open fun createBackupPlan(params: CreateBackupPlanInput, callback: (err: AWSError, data: CreateBackupPlanOutput) -> Unit = definedExternally): Request<CreateBackupPlanOutput, AWSError>
    open fun createBackupPlan(callback: (err: AWSError, data: CreateBackupPlanOutput) -> Unit = definedExternally): Request<CreateBackupPlanOutput, AWSError>
    open fun createBackupSelection(params: CreateBackupSelectionInput, callback: (err: AWSError, data: CreateBackupSelectionOutput) -> Unit = definedExternally): Request<CreateBackupSelectionOutput, AWSError>
    open fun createBackupSelection(callback: (err: AWSError, data: CreateBackupSelectionOutput) -> Unit = definedExternally): Request<CreateBackupSelectionOutput, AWSError>
    open fun createBackupVault(params: CreateBackupVaultInput, callback: (err: AWSError, data: CreateBackupVaultOutput) -> Unit = definedExternally): Request<CreateBackupVaultOutput, AWSError>
    open fun createBackupVault(callback: (err: AWSError, data: CreateBackupVaultOutput) -> Unit = definedExternally): Request<CreateBackupVaultOutput, AWSError>
    open fun deleteBackupPlan(params: DeleteBackupPlanInput, callback: (err: AWSError, data: DeleteBackupPlanOutput) -> Unit = definedExternally): Request<DeleteBackupPlanOutput, AWSError>
    open fun deleteBackupPlan(callback: (err: AWSError, data: DeleteBackupPlanOutput) -> Unit = definedExternally): Request<DeleteBackupPlanOutput, AWSError>
    open fun deleteBackupSelection(params: DeleteBackupSelectionInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteBackupSelection(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteBackupVault(params: DeleteBackupVaultInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteBackupVault(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteBackupVaultAccessPolicy(params: DeleteBackupVaultAccessPolicyInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteBackupVaultAccessPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteBackupVaultNotifications(params: DeleteBackupVaultNotificationsInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteBackupVaultNotifications(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRecoveryPoint(params: DeleteRecoveryPointInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRecoveryPoint(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeBackupJob(params: DescribeBackupJobInput, callback: (err: AWSError, data: DescribeBackupJobOutput) -> Unit = definedExternally): Request<DescribeBackupJobOutput, AWSError>
    open fun describeBackupJob(callback: (err: AWSError, data: DescribeBackupJobOutput) -> Unit = definedExternally): Request<DescribeBackupJobOutput, AWSError>
    open fun describeBackupVault(params: DescribeBackupVaultInput, callback: (err: AWSError, data: DescribeBackupVaultOutput) -> Unit = definedExternally): Request<DescribeBackupVaultOutput, AWSError>
    open fun describeBackupVault(callback: (err: AWSError, data: DescribeBackupVaultOutput) -> Unit = definedExternally): Request<DescribeBackupVaultOutput, AWSError>
    open fun describeCopyJob(params: DescribeCopyJobInput, callback: (err: AWSError, data: DescribeCopyJobOutput) -> Unit = definedExternally): Request<DescribeCopyJobOutput, AWSError>
    open fun describeCopyJob(callback: (err: AWSError, data: DescribeCopyJobOutput) -> Unit = definedExternally): Request<DescribeCopyJobOutput, AWSError>
    open fun describeProtectedResource(params: DescribeProtectedResourceInput, callback: (err: AWSError, data: DescribeProtectedResourceOutput) -> Unit = definedExternally): Request<DescribeProtectedResourceOutput, AWSError>
    open fun describeProtectedResource(callback: (err: AWSError, data: DescribeProtectedResourceOutput) -> Unit = definedExternally): Request<DescribeProtectedResourceOutput, AWSError>
    open fun describeRecoveryPoint(params: DescribeRecoveryPointInput, callback: (err: AWSError, data: DescribeRecoveryPointOutput) -> Unit = definedExternally): Request<DescribeRecoveryPointOutput, AWSError>
    open fun describeRecoveryPoint(callback: (err: AWSError, data: DescribeRecoveryPointOutput) -> Unit = definedExternally): Request<DescribeRecoveryPointOutput, AWSError>
    open fun describeRestoreJob(params: DescribeRestoreJobInput, callback: (err: AWSError, data: DescribeRestoreJobOutput) -> Unit = definedExternally): Request<DescribeRestoreJobOutput, AWSError>
    open fun describeRestoreJob(callback: (err: AWSError, data: DescribeRestoreJobOutput) -> Unit = definedExternally): Request<DescribeRestoreJobOutput, AWSError>
    open fun exportBackupPlanTemplate(params: ExportBackupPlanTemplateInput, callback: (err: AWSError, data: ExportBackupPlanTemplateOutput) -> Unit = definedExternally): Request<ExportBackupPlanTemplateOutput, AWSError>
    open fun exportBackupPlanTemplate(callback: (err: AWSError, data: ExportBackupPlanTemplateOutput) -> Unit = definedExternally): Request<ExportBackupPlanTemplateOutput, AWSError>
    open fun getBackupPlan(params: GetBackupPlanInput, callback: (err: AWSError, data: GetBackupPlanOutput) -> Unit = definedExternally): Request<GetBackupPlanOutput, AWSError>
    open fun getBackupPlan(callback: (err: AWSError, data: GetBackupPlanOutput) -> Unit = definedExternally): Request<GetBackupPlanOutput, AWSError>
    open fun getBackupPlanFromJSON(params: GetBackupPlanFromJSONInput, callback: (err: AWSError, data: GetBackupPlanFromJSONOutput) -> Unit = definedExternally): Request<GetBackupPlanFromJSONOutput, AWSError>
    open fun getBackupPlanFromJSON(callback: (err: AWSError, data: GetBackupPlanFromJSONOutput) -> Unit = definedExternally): Request<GetBackupPlanFromJSONOutput, AWSError>
    open fun getBackupPlanFromTemplate(params: GetBackupPlanFromTemplateInput, callback: (err: AWSError, data: GetBackupPlanFromTemplateOutput) -> Unit = definedExternally): Request<GetBackupPlanFromTemplateOutput, AWSError>
    open fun getBackupPlanFromTemplate(callback: (err: AWSError, data: GetBackupPlanFromTemplateOutput) -> Unit = definedExternally): Request<GetBackupPlanFromTemplateOutput, AWSError>
    open fun getBackupSelection(params: GetBackupSelectionInput, callback: (err: AWSError, data: GetBackupSelectionOutput) -> Unit = definedExternally): Request<GetBackupSelectionOutput, AWSError>
    open fun getBackupSelection(callback: (err: AWSError, data: GetBackupSelectionOutput) -> Unit = definedExternally): Request<GetBackupSelectionOutput, AWSError>
    open fun getBackupVaultAccessPolicy(params: GetBackupVaultAccessPolicyInput, callback: (err: AWSError, data: GetBackupVaultAccessPolicyOutput) -> Unit = definedExternally): Request<GetBackupVaultAccessPolicyOutput, AWSError>
    open fun getBackupVaultAccessPolicy(callback: (err: AWSError, data: GetBackupVaultAccessPolicyOutput) -> Unit = definedExternally): Request<GetBackupVaultAccessPolicyOutput, AWSError>
    open fun getBackupVaultNotifications(params: GetBackupVaultNotificationsInput, callback: (err: AWSError, data: GetBackupVaultNotificationsOutput) -> Unit = definedExternally): Request<GetBackupVaultNotificationsOutput, AWSError>
    open fun getBackupVaultNotifications(callback: (err: AWSError, data: GetBackupVaultNotificationsOutput) -> Unit = definedExternally): Request<GetBackupVaultNotificationsOutput, AWSError>
    open fun getRecoveryPointRestoreMetadata(params: GetRecoveryPointRestoreMetadataInput, callback: (err: AWSError, data: GetRecoveryPointRestoreMetadataOutput) -> Unit = definedExternally): Request<GetRecoveryPointRestoreMetadataOutput, AWSError>
    open fun getRecoveryPointRestoreMetadata(callback: (err: AWSError, data: GetRecoveryPointRestoreMetadataOutput) -> Unit = definedExternally): Request<GetRecoveryPointRestoreMetadataOutput, AWSError>
    open fun getSupportedResourceTypes(callback: (err: AWSError, data: GetSupportedResourceTypesOutput) -> Unit = definedExternally): Request<GetSupportedResourceTypesOutput, AWSError>
    open fun listBackupJobs(params: ListBackupJobsInput, callback: (err: AWSError, data: ListBackupJobsOutput) -> Unit = definedExternally): Request<ListBackupJobsOutput, AWSError>
    open fun listBackupJobs(callback: (err: AWSError, data: ListBackupJobsOutput) -> Unit = definedExternally): Request<ListBackupJobsOutput, AWSError>
    open fun listBackupPlanTemplates(params: ListBackupPlanTemplatesInput, callback: (err: AWSError, data: ListBackupPlanTemplatesOutput) -> Unit = definedExternally): Request<ListBackupPlanTemplatesOutput, AWSError>
    open fun listBackupPlanTemplates(callback: (err: AWSError, data: ListBackupPlanTemplatesOutput) -> Unit = definedExternally): Request<ListBackupPlanTemplatesOutput, AWSError>
    open fun listBackupPlanVersions(params: ListBackupPlanVersionsInput, callback: (err: AWSError, data: ListBackupPlanVersionsOutput) -> Unit = definedExternally): Request<ListBackupPlanVersionsOutput, AWSError>
    open fun listBackupPlanVersions(callback: (err: AWSError, data: ListBackupPlanVersionsOutput) -> Unit = definedExternally): Request<ListBackupPlanVersionsOutput, AWSError>
    open fun listBackupPlans(params: ListBackupPlansInput, callback: (err: AWSError, data: ListBackupPlansOutput) -> Unit = definedExternally): Request<ListBackupPlansOutput, AWSError>
    open fun listBackupPlans(callback: (err: AWSError, data: ListBackupPlansOutput) -> Unit = definedExternally): Request<ListBackupPlansOutput, AWSError>
    open fun listBackupSelections(params: ListBackupSelectionsInput, callback: (err: AWSError, data: ListBackupSelectionsOutput) -> Unit = definedExternally): Request<ListBackupSelectionsOutput, AWSError>
    open fun listBackupSelections(callback: (err: AWSError, data: ListBackupSelectionsOutput) -> Unit = definedExternally): Request<ListBackupSelectionsOutput, AWSError>
    open fun listBackupVaults(params: ListBackupVaultsInput, callback: (err: AWSError, data: ListBackupVaultsOutput) -> Unit = definedExternally): Request<ListBackupVaultsOutput, AWSError>
    open fun listBackupVaults(callback: (err: AWSError, data: ListBackupVaultsOutput) -> Unit = definedExternally): Request<ListBackupVaultsOutput, AWSError>
    open fun listCopyJobs(params: ListCopyJobsInput, callback: (err: AWSError, data: ListCopyJobsOutput) -> Unit = definedExternally): Request<ListCopyJobsOutput, AWSError>
    open fun listCopyJobs(callback: (err: AWSError, data: ListCopyJobsOutput) -> Unit = definedExternally): Request<ListCopyJobsOutput, AWSError>
    open fun listProtectedResources(params: ListProtectedResourcesInput, callback: (err: AWSError, data: ListProtectedResourcesOutput) -> Unit = definedExternally): Request<ListProtectedResourcesOutput, AWSError>
    open fun listProtectedResources(callback: (err: AWSError, data: ListProtectedResourcesOutput) -> Unit = definedExternally): Request<ListProtectedResourcesOutput, AWSError>
    open fun listRecoveryPointsByBackupVault(params: ListRecoveryPointsByBackupVaultInput, callback: (err: AWSError, data: ListRecoveryPointsByBackupVaultOutput) -> Unit = definedExternally): Request<ListRecoveryPointsByBackupVaultOutput, AWSError>
    open fun listRecoveryPointsByBackupVault(callback: (err: AWSError, data: ListRecoveryPointsByBackupVaultOutput) -> Unit = definedExternally): Request<ListRecoveryPointsByBackupVaultOutput, AWSError>
    open fun listRecoveryPointsByResource(params: ListRecoveryPointsByResourceInput, callback: (err: AWSError, data: ListRecoveryPointsByResourceOutput) -> Unit = definedExternally): Request<ListRecoveryPointsByResourceOutput, AWSError>
    open fun listRecoveryPointsByResource(callback: (err: AWSError, data: ListRecoveryPointsByResourceOutput) -> Unit = definedExternally): Request<ListRecoveryPointsByResourceOutput, AWSError>
    open fun listRestoreJobs(params: ListRestoreJobsInput, callback: (err: AWSError, data: ListRestoreJobsOutput) -> Unit = definedExternally): Request<ListRestoreJobsOutput, AWSError>
    open fun listRestoreJobs(callback: (err: AWSError, data: ListRestoreJobsOutput) -> Unit = definedExternally): Request<ListRestoreJobsOutput, AWSError>
    open fun listTags(params: ListTagsInput, callback: (err: AWSError, data: ListTagsOutput) -> Unit = definedExternally): Request<ListTagsOutput, AWSError>
    open fun listTags(callback: (err: AWSError, data: ListTagsOutput) -> Unit = definedExternally): Request<ListTagsOutput, AWSError>
    open fun putBackupVaultAccessPolicy(params: PutBackupVaultAccessPolicyInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putBackupVaultAccessPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putBackupVaultNotifications(params: PutBackupVaultNotificationsInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putBackupVaultNotifications(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun startBackupJob(params: StartBackupJobInput, callback: (err: AWSError, data: StartBackupJobOutput) -> Unit = definedExternally): Request<StartBackupJobOutput, AWSError>
    open fun startBackupJob(callback: (err: AWSError, data: StartBackupJobOutput) -> Unit = definedExternally): Request<StartBackupJobOutput, AWSError>
    open fun startCopyJob(params: StartCopyJobInput, callback: (err: AWSError, data: StartCopyJobOutput) -> Unit = definedExternally): Request<StartCopyJobOutput, AWSError>
    open fun startCopyJob(callback: (err: AWSError, data: StartCopyJobOutput) -> Unit = definedExternally): Request<StartCopyJobOutput, AWSError>
    open fun startRestoreJob(params: StartRestoreJobInput, callback: (err: AWSError, data: StartRestoreJobOutput) -> Unit = definedExternally): Request<StartRestoreJobOutput, AWSError>
    open fun startRestoreJob(callback: (err: AWSError, data: StartRestoreJobOutput) -> Unit = definedExternally): Request<StartRestoreJobOutput, AWSError>
    open fun stopBackupJob(params: StopBackupJobInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopBackupJob(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(params: TagResourceInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(params: UntagResourceInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateBackupPlan(params: UpdateBackupPlanInput, callback: (err: AWSError, data: UpdateBackupPlanOutput) -> Unit = definedExternally): Request<UpdateBackupPlanOutput, AWSError>
    open fun updateBackupPlan(callback: (err: AWSError, data: UpdateBackupPlanOutput) -> Unit = definedExternally): Request<UpdateBackupPlanOutput, AWSError>
    open fun updateRecoveryPointLifecycle(params: UpdateRecoveryPointLifecycleInput, callback: (err: AWSError, data: UpdateRecoveryPointLifecycleOutput) -> Unit = definedExternally): Request<UpdateRecoveryPointLifecycleOutput, AWSError>
    open fun updateRecoveryPointLifecycle(callback: (err: AWSError, data: UpdateRecoveryPointLifecycleOutput) -> Unit = definedExternally): Request<UpdateRecoveryPointLifecycleOutput, AWSError>
    interface BackupJob {
        var BackupJobId: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupVaultName: BackupVaultName?
            get() = definedExternally
            set(value) = definedExternally
        var BackupVaultArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var RecoveryPointArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CompletionDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "CREATED" | "PENDING" | "RUNNING" | "ABORTING" | "ABORTED" | "COMPLETED" | "FAILED" | "EXPIRED" | String */
        var StatusMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var PercentDone: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupSizeInBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoleArn: IAMRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBy: RecoveryPointCreator?
            get() = definedExternally
            set(value) = definedExternally
        var ExpectedCompletionDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var StartBy: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: ResourceType?
            get() = definedExternally
            set(value) = definedExternally
        var BytesTransferred: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BackupPlan {
        var BackupPlanName: BackupPlanName
        var Rules: BackupRules
    }
    interface BackupPlanInput {
        var BackupPlanName: BackupPlanName
        var Rules: BackupRulesInput
    }
    interface BackupPlanTemplatesListMember {
        var BackupPlanTemplateId: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupPlanTemplateName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BackupPlansListMember {
        var BackupPlanArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var BackupPlanId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var VersionId: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupPlanName: BackupPlanName?
            get() = definedExternally
            set(value) = definedExternally
        var CreatorRequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var LastExecutionDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BackupRule {
        var RuleName: BackupRuleName
        var TargetBackupVaultName: BackupVaultName
        var ScheduleExpression: CronExpression?
            get() = definedExternally
            set(value) = definedExternally
        var StartWindowMinutes: WindowMinutes?
            get() = definedExternally
            set(value) = definedExternally
        var CompletionWindowMinutes: WindowMinutes?
            get() = definedExternally
            set(value) = definedExternally
        var Lifecycle: Lifecycle?
            get() = definedExternally
            set(value) = definedExternally
        var RecoveryPointTags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var RuleId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CopyActions: CopyActions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BackupRuleInput {
        var RuleName: BackupRuleName
        var TargetBackupVaultName: BackupVaultName
        var ScheduleExpression: CronExpression?
            get() = definedExternally
            set(value) = definedExternally
        var StartWindowMinutes: WindowMinutes?
            get() = definedExternally
            set(value) = definedExternally
        var CompletionWindowMinutes: WindowMinutes?
            get() = definedExternally
            set(value) = definedExternally
        var Lifecycle: Lifecycle?
            get() = definedExternally
            set(value) = definedExternally
        var RecoveryPointTags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var CopyActions: CopyActions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BackupSelection {
        var SelectionName: BackupSelectionName
        var IamRoleArn: IAMRoleArn
        var Resources: ResourceArns?
            get() = definedExternally
            set(value) = definedExternally
        var ListOfTags: ListOfTags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BackupSelectionsListMember {
        var SelectionId: String?
            get() = definedExternally
            set(value) = definedExternally
        var SelectionName: BackupSelectionName?
            get() = definedExternally
            set(value) = definedExternally
        var BackupPlanId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreatorRequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoleArn: IAMRoleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BackupVaultListMember {
        var BackupVaultName: BackupVaultName?
            get() = definedExternally
            set(value) = definedExternally
        var BackupVaultArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionKeyArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var CreatorRequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfRecoveryPoints: long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CalculatedLifecycle {
        var MoveToColdStorageAt: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DeleteAt: timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Condition {
        var ConditionType: String /* "STRINGEQUALS" | String */
        var ConditionKey: ConditionKey
        var ConditionValue: ConditionValue
    }
    interface CopyAction {
        var Lifecycle: Lifecycle?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationBackupVaultArn: ARN
    }
    interface CopyJob {
        var CopyJobId: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceBackupVaultArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var SourceRecoveryPointArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationBackupVaultArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationRecoveryPointArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CompletionDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "CREATED" | "RUNNING" | "COMPLETED" | "FAILED" | String */
        var StatusMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupSizeInBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoleArn: IAMRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBy: RecoveryPointCreator?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: ResourceType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBackupPlanInput {
        var BackupPlan: BackupPlanInput
        var BackupPlanTags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var CreatorRequestId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBackupPlanOutput {
        var BackupPlanId: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupPlanArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var VersionId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBackupSelectionInput {
        var BackupPlanId: String
        var BackupSelection: BackupSelection
        var CreatorRequestId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBackupSelectionOutput {
        var SelectionId: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupPlanId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBackupVaultInput {
        var BackupVaultName: BackupVaultName
        var BackupVaultTags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionKeyArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var CreatorRequestId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBackupVaultOutput {
        var BackupVaultName: BackupVaultName?
            get() = definedExternally
            set(value) = definedExternally
        var BackupVaultArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteBackupPlanInput {
        var BackupPlanId: String
    }
    interface DeleteBackupPlanOutput {
        var BackupPlanId: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupPlanArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var VersionId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteBackupSelectionInput {
        var BackupPlanId: String
        var SelectionId: String
    }
    interface DeleteBackupVaultAccessPolicyInput {
        var BackupVaultName: BackupVaultName
    }
    interface DeleteBackupVaultInput {
        var BackupVaultName: String
    }
    interface DeleteBackupVaultNotificationsInput {
        var BackupVaultName: BackupVaultName
    }
    interface DeleteRecoveryPointInput {
        var BackupVaultName: BackupVaultName
        var RecoveryPointArn: ARN
    }
    interface DescribeBackupJobInput {
        var BackupJobId: String
    }
    interface DescribeBackupJobOutput {
        var BackupJobId: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupVaultName: BackupVaultName?
            get() = definedExternally
            set(value) = definedExternally
        var BackupVaultArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var RecoveryPointArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CompletionDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "CREATED" | "PENDING" | "RUNNING" | "ABORTING" | "ABORTED" | "COMPLETED" | "FAILED" | "EXPIRED" | String */
        var StatusMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var PercentDone: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupSizeInBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoleArn: IAMRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBy: RecoveryPointCreator?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: ResourceType?
            get() = definedExternally
            set(value) = definedExternally
        var BytesTransferred: Long?
            get() = definedExternally
            set(value) = definedExternally
        var ExpectedCompletionDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var StartBy: timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeBackupVaultInput {
        var BackupVaultName: String
    }
    interface DescribeBackupVaultOutput {
        var BackupVaultName: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupVaultArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionKeyArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreatorRequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfRecoveryPoints: long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCopyJobInput {
        var CopyJobId: String
    }
    interface DescribeCopyJobOutput {
        var CopyJob: CopyJob?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProtectedResourceInput {
        var ResourceArn: ARN
    }
    interface DescribeProtectedResourceOutput {
        var ResourceArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: ResourceType?
            get() = definedExternally
            set(value) = definedExternally
        var LastBackupTime: timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRecoveryPointInput {
        var BackupVaultName: BackupVaultName
        var RecoveryPointArn: ARN
    }
    interface DescribeRecoveryPointOutput {
        var RecoveryPointArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var BackupVaultName: BackupVaultName?
            get() = definedExternally
            set(value) = definedExternally
        var BackupVaultArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: ResourceType?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBy: RecoveryPointCreator?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoleArn: IAMRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "COMPLETED" | "PARTIAL" | "DELETING" | "EXPIRED" | String */
        var CreationDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CompletionDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var BackupSizeInBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var CalculatedLifecycle: CalculatedLifecycle?
            get() = definedExternally
            set(value) = definedExternally
        var Lifecycle: Lifecycle?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionKeyArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var IsEncrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var StorageClass: String /* "WARM" | "COLD" | "DELETED" | String */
        var LastRestoreTime: timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRestoreJobInput {
        var RestoreJobId: RestoreJobId
    }
    interface DescribeRestoreJobOutput {
        var RestoreJobId: String?
            get() = definedExternally
            set(value) = definedExternally
        var RecoveryPointArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CompletionDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "RUNNING" | "COMPLETED" | "ABORTED" | "FAILED" | String */
        var StatusMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var PercentDone: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupSizeInBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoleArn: IAMRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var ExpectedCompletionTimeMinutes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedResourceArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExportBackupPlanTemplateInput {
        var BackupPlanId: String
    }
    interface ExportBackupPlanTemplateOutput {
        var BackupPlanTemplateJson: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBackupPlanFromJSONInput {
        var BackupPlanTemplateJson: String
    }
    interface GetBackupPlanFromJSONOutput {
        var BackupPlan: BackupPlan?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBackupPlanFromTemplateInput {
        var BackupPlanTemplateId: String
    }
    interface GetBackupPlanFromTemplateOutput {
        var BackupPlanDocument: BackupPlan?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBackupPlanInput {
        var BackupPlanId: String
        var VersionId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBackupPlanOutput {
        var BackupPlan: BackupPlan?
            get() = definedExternally
            set(value) = definedExternally
        var BackupPlanId: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupPlanArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var VersionId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreatorRequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastExecutionDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBackupSelectionInput {
        var BackupPlanId: String
        var SelectionId: String
    }
    interface GetBackupSelectionOutput {
        var BackupSelection: BackupSelection?
            get() = definedExternally
            set(value) = definedExternally
        var SelectionId: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupPlanId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreatorRequestId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBackupVaultAccessPolicyInput {
        var BackupVaultName: BackupVaultName
    }
    interface GetBackupVaultAccessPolicyOutput {
        var BackupVaultName: BackupVaultName?
            get() = definedExternally
            set(value) = definedExternally
        var BackupVaultArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var Policy: IAMPolicy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBackupVaultNotificationsInput {
        var BackupVaultName: BackupVaultName
    }
    interface GetBackupVaultNotificationsOutput {
        var BackupVaultName: BackupVaultName?
            get() = definedExternally
            set(value) = definedExternally
        var BackupVaultArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var SNSTopicArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var BackupVaultEvents: BackupVaultEvents?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRecoveryPointRestoreMetadataInput {
        var BackupVaultName: BackupVaultName
        var RecoveryPointArn: ARN
    }
    interface GetRecoveryPointRestoreMetadataOutput {
        var BackupVaultArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var RecoveryPointArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var RestoreMetadata: Metadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSupportedResourceTypesOutput {
        var ResourceTypes: ResourceTypes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Lifecycle {
        var MoveToColdStorageAfterDays: Long?
            get() = definedExternally
            set(value) = definedExternally
        var DeleteAfterDays: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBackupJobsInput {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var ByResourceArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var ByState: String /* "CREATED" | "PENDING" | "RUNNING" | "ABORTING" | "ABORTED" | "COMPLETED" | "FAILED" | "EXPIRED" | String */
        var ByBackupVaultName: BackupVaultName?
            get() = definedExternally
            set(value) = definedExternally
        var ByCreatedBefore: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ByCreatedAfter: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ByResourceType: ResourceType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBackupJobsOutput {
        var BackupJobs: BackupJobsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBackupPlanTemplatesInput {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBackupPlanTemplatesOutput {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupPlanTemplatesList: BackupPlanTemplatesList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBackupPlanVersionsInput {
        var BackupPlanId: String
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBackupPlanVersionsOutput {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupPlanVersionsList: BackupPlanVersionsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBackupPlansInput {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeDeleted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBackupPlansOutput {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupPlansList: BackupPlansList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBackupSelectionsInput {
        var BackupPlanId: String
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBackupSelectionsOutput {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupSelectionsList: BackupSelectionsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBackupVaultsInput {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBackupVaultsOutput {
        var BackupVaultList: BackupVaultList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCopyJobsInput {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var ByResourceArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var ByState: String /* "CREATED" | "RUNNING" | "COMPLETED" | "FAILED" | String */
        var ByCreatedBefore: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ByCreatedAfter: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ByResourceType: ResourceType?
            get() = definedExternally
            set(value) = definedExternally
        var ByDestinationVaultArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCopyJobsOutput {
        var CopyJobs: CopyJobsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProtectedResourcesInput {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProtectedResourcesOutput {
        var Results: ProtectedResourcesList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRecoveryPointsByBackupVaultInput {
        var BackupVaultName: BackupVaultName
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var ByResourceArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var ByResourceType: ResourceType?
            get() = definedExternally
            set(value) = definedExternally
        var ByBackupPlanId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ByCreatedBefore: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ByCreatedAfter: timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRecoveryPointsByBackupVaultOutput {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var RecoveryPoints: RecoveryPointByBackupVaultList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRecoveryPointsByResourceInput {
        var ResourceArn: ARN
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRecoveryPointsByResourceOutput {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var RecoveryPoints: RecoveryPointByResourceList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRestoreJobsInput {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRestoreJobsOutput {
        var RestoreJobs: RestoreJobsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsInput {
        var ResourceArn: ARN
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsOutput {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Metadata {
        @nativeGetter
        operator fun get(key: String): MetadataValue?
        @nativeSetter
        operator fun set(key: String, value: MetadataValue)
    }
    interface ProtectedResource {
        var ResourceArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: ResourceType?
            get() = definedExternally
            set(value) = definedExternally
        var LastBackupTime: timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutBackupVaultAccessPolicyInput {
        var BackupVaultName: BackupVaultName
        var Policy: IAMPolicy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutBackupVaultNotificationsInput {
        var BackupVaultName: BackupVaultName
        var SNSTopicArn: ARN
        var BackupVaultEvents: BackupVaultEvents
    }
    interface RecoveryPointByBackupVault {
        var RecoveryPointArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var BackupVaultName: BackupVaultName?
            get() = definedExternally
            set(value) = definedExternally
        var BackupVaultArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: ResourceType?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBy: RecoveryPointCreator?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoleArn: IAMRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "COMPLETED" | "PARTIAL" | "DELETING" | "EXPIRED" | String */
        var CreationDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CompletionDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var BackupSizeInBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var CalculatedLifecycle: CalculatedLifecycle?
            get() = definedExternally
            set(value) = definedExternally
        var Lifecycle: Lifecycle?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionKeyArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var IsEncrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var LastRestoreTime: timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecoveryPointByResource {
        var RecoveryPointArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "COMPLETED" | "PARTIAL" | "DELETING" | "EXPIRED" | String */
        var EncryptionKeyArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var BackupSizeBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var BackupVaultName: BackupVaultName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecoveryPointCreator {
        var BackupPlanId: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupPlanArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var BackupPlanVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupRuleId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreJobsListMember {
        var RestoreJobId: String?
            get() = definedExternally
            set(value) = definedExternally
        var RecoveryPointArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CompletionDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "RUNNING" | "COMPLETED" | "ABORTED" | "FAILED" | String */
        var StatusMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var PercentDone: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupSizeInBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoleArn: IAMRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var ExpectedCompletionTimeMinutes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedResourceArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartBackupJobInput {
        var BackupVaultName: BackupVaultName
        var ResourceArn: ARN
        var IamRoleArn: IAMRoleArn
        var IdempotencyToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var StartWindowMinutes: WindowMinutes?
            get() = definedExternally
            set(value) = definedExternally
        var CompleteWindowMinutes: WindowMinutes?
            get() = definedExternally
            set(value) = definedExternally
        var Lifecycle: Lifecycle?
            get() = definedExternally
            set(value) = definedExternally
        var RecoveryPointTags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartBackupJobOutput {
        var BackupJobId: String?
            get() = definedExternally
            set(value) = definedExternally
        var RecoveryPointArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartCopyJobInput {
        var RecoveryPointArn: ARN
        var SourceBackupVaultName: BackupVaultName
        var DestinationBackupVaultArn: ARN
        var IamRoleArn: IAMRoleArn
        var IdempotencyToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var Lifecycle: Lifecycle?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartCopyJobOutput {
        var CopyJobId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartRestoreJobInput {
        var RecoveryPointArn: ARN
        var Metadata: Metadata
        var IamRoleArn: IAMRoleArn
        var IdempotencyToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: ResourceType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartRestoreJobOutput {
        var RestoreJobId: RestoreJobId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopBackupJobInput {
        var BackupJobId: String
    }
    interface TagResourceInput {
        var ResourceArn: ARN
        var Tags: Tags
    }
    interface Tags {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface UntagResourceInput {
        var ResourceArn: ARN
        var TagKeyList: TagKeyList
    }
    interface UpdateBackupPlanInput {
        var BackupPlanId: String
        var BackupPlan: BackupPlanInput
    }
    interface UpdateBackupPlanOutput {
        var BackupPlanId: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupPlanArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var VersionId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRecoveryPointLifecycleInput {
        var BackupVaultName: BackupVaultName
        var RecoveryPointArn: ARN
        var Lifecycle: Lifecycle?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRecoveryPointLifecycleOutput {
        var BackupVaultArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var RecoveryPointArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var Lifecycle: Lifecycle?
            get() = definedExternally
            set(value) = definedExternally
        var CalculatedLifecycle: CalculatedLifecycle?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-11-15" | "latest" | String */
    }
}