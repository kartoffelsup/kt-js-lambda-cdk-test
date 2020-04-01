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
import CodeBuild.BuildArtifacts
import CodeBuild.BuildPhase
import CodeBuild.Build
import CodeBuild.BuildNotDeleted
import CodeBuild.EnvironmentImage
import CodeBuild.EnvironmentLanguage
import CodeBuild.EnvironmentPlatform
import CodeBuild.EnvironmentVariable
import CodeBuild.ExportedEnvironmentVariable
import CodeBuild.WebhookFilter
import CodeBuild.PhaseContext
import CodeBuild.ProjectArtifacts
import CodeBuild.ProjectFileSystemLocation
import CodeBuild.ProjectSourceVersion
import CodeBuild.ProjectSource
import CodeBuild.Project
import CodeBuild.ReportGroup
import CodeBuild.Report
import CodeBuild.SourceCredentialsInfo
import CodeBuild.Tag
import CodeBuild.TestCase
import CodeBuild.BatchDeleteBuildsInput
import CodeBuild.BatchDeleteBuildsOutput
import CodeBuild.BatchGetBuildsInput
import CodeBuild.BatchGetBuildsOutput
import CodeBuild.BatchGetProjectsInput
import CodeBuild.BatchGetProjectsOutput
import CodeBuild.BatchGetReportGroupsInput
import CodeBuild.BatchGetReportGroupsOutput
import CodeBuild.BatchGetReportsInput
import CodeBuild.BatchGetReportsOutput
import CodeBuild.CreateProjectInput
import CodeBuild.CreateProjectOutput
import CodeBuild.CreateReportGroupInput
import CodeBuild.CreateReportGroupOutput
import CodeBuild.CreateWebhookInput
import CodeBuild.CreateWebhookOutput
import CodeBuild.DeleteProjectInput
import CodeBuild.DeleteProjectOutput
import CodeBuild.DeleteReportInput
import CodeBuild.DeleteReportOutput
import CodeBuild.DeleteReportGroupInput
import CodeBuild.DeleteReportGroupOutput
import CodeBuild.DeleteResourcePolicyInput
import CodeBuild.DeleteResourcePolicyOutput
import CodeBuild.DeleteSourceCredentialsInput
import CodeBuild.DeleteSourceCredentialsOutput
import CodeBuild.DeleteWebhookInput
import CodeBuild.DeleteWebhookOutput
import CodeBuild.DescribeTestCasesInput
import CodeBuild.DescribeTestCasesOutput
import CodeBuild.GetResourcePolicyInput
import CodeBuild.GetResourcePolicyOutput
import CodeBuild.ImportSourceCredentialsInput
import CodeBuild.ImportSourceCredentialsOutput
import CodeBuild.InvalidateProjectCacheInput
import CodeBuild.InvalidateProjectCacheOutput
import CodeBuild.ListBuildsInput
import CodeBuild.ListBuildsOutput
import CodeBuild.ListBuildsForProjectInput
import CodeBuild.ListBuildsForProjectOutput
import CodeBuild.ListCuratedEnvironmentImagesInput
import CodeBuild.ListCuratedEnvironmentImagesOutput
import CodeBuild.ListProjectsInput
import CodeBuild.ListProjectsOutput
import CodeBuild.ListReportGroupsInput
import CodeBuild.ListReportGroupsOutput
import CodeBuild.ListReportsInput
import CodeBuild.ListReportsOutput
import CodeBuild.ListReportsForReportGroupInput
import CodeBuild.ListReportsForReportGroupOutput
import CodeBuild.ListSharedProjectsInput
import CodeBuild.ListSharedProjectsOutput
import CodeBuild.ListSharedReportGroupsInput
import CodeBuild.ListSharedReportGroupsOutput
import CodeBuild.ListSourceCredentialsInput
import CodeBuild.ListSourceCredentialsOutput
import CodeBuild.PutResourcePolicyInput
import CodeBuild.PutResourcePolicyOutput
import CodeBuild.StartBuildInput
import CodeBuild.StartBuildOutput
import CodeBuild.StopBuildInput
import CodeBuild.StopBuildOutput
import CodeBuild.UpdateProjectInput
import CodeBuild.UpdateProjectOutput
import CodeBuild.UpdateReportGroupInput
import CodeBuild.UpdateReportGroupOutput
import CodeBuild.UpdateWebhookInput
import CodeBuild.UpdateWebhookOutput
import CodeBuild.ProjectCache
import CodeBuild.ProjectEnvironment
import CodeBuild.LogsLocation
import CodeBuild.VpcConfig
import CodeBuild.NetworkInterface
import CodeBuild.LogsConfig
import CodeBuild.ReportExportConfig
import CodeBuild.Webhook
import CodeBuild.TestCaseFilter
import CodeBuild.ReportFilter
import CodeBuild.CloudWatchLogsConfig
import CodeBuild.S3LogsConfig
import CodeBuild.ProjectBadge
import CodeBuild.RegistryCredential
import CodeBuild.GitSubmodulesConfig
import CodeBuild.SourceAuth
import CodeBuild.TestReportSummary
import CodeBuild.S3ReportExportConfig
import CodeBuild.ReportStatusCounts

typealias Boolean = Boolean

typealias BuildArtifactsList = Array<BuildArtifacts>

typealias BuildIds = Array<NonEmptyString>

typealias BuildPhases = Array<BuildPhase>

typealias BuildReportArns = Array<String>

typealias Builds = Array<Build>

typealias BuildsNotDeleted = Array<BuildNotDeleted>

typealias EnvironmentImages = Array<EnvironmentImage>

typealias EnvironmentLanguages = Array<EnvironmentLanguage>

typealias EnvironmentPlatforms = Array<EnvironmentPlatform>

typealias EnvironmentVariables = Array<EnvironmentVariable>

typealias ExportedEnvironmentVariables = Array<ExportedEnvironmentVariable>

typealias FilterGroup = Array<WebhookFilter>

typealias FilterGroups = Array<FilterGroup>

typealias GitCloneDepth = Number

typealias ImageVersions = Array<String>

typealias KeyInput = String

typealias NonEmptyString = String

typealias PageSize = Number

typealias PhaseContexts = Array<PhaseContext>

typealias ProjectArns = Array<NonEmptyString>

typealias ProjectArtifactsList = Array<ProjectArtifacts>

typealias ProjectCacheModes = Array<String /* "LOCAL_DOCKER_LAYER_CACHE" | "LOCAL_SOURCE_CACHE" | "LOCAL_CUSTOM_CACHE" | String */>

typealias ProjectDescription = String

typealias ProjectFileSystemLocations = Array<ProjectFileSystemLocation>

typealias ProjectName = String

typealias ProjectNames = Array<NonEmptyString>

typealias ProjectSecondarySourceVersions = Array<ProjectSourceVersion>

typealias ProjectSources = Array<ProjectSource>

typealias Projects = Array<Project>

typealias ReportArns = Array<NonEmptyString>

typealias ReportGroupArns = Array<NonEmptyString>

typealias ReportGroupName = String

typealias ReportGroups = Array<ReportGroup>

typealias Reports = Array<Report>

typealias SecurityGroupIds = Array<NonEmptyString>

typealias SensitiveNonEmptyString = String

typealias SourceCredentialsInfos = Array<SourceCredentialsInfo>

typealias String = String

typealias Subnets = Array<NonEmptyString>

typealias TagList = Array<Tag>

typealias TestCases = Array<TestCase>

typealias TimeOut = Number

typealias Timestamp = Date

typealias ValueInput = String

typealias WrapperBoolean = Boolean

typealias WrapperInt = Number

typealias WrapperLong = Number

@JsModule("aws-sdk")
external open class CodeBuild(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CodeBuild.Types.ClientConfiguration */
    open fun batchDeleteBuilds(params: BatchDeleteBuildsInput, callback: (err: AWSError, data: BatchDeleteBuildsOutput) -> Unit = definedExternally): Request<BatchDeleteBuildsOutput, AWSError>
    open fun batchDeleteBuilds(callback: (err: AWSError, data: BatchDeleteBuildsOutput) -> Unit = definedExternally): Request<BatchDeleteBuildsOutput, AWSError>
    open fun batchGetBuilds(params: BatchGetBuildsInput, callback: (err: AWSError, data: BatchGetBuildsOutput) -> Unit = definedExternally): Request<BatchGetBuildsOutput, AWSError>
    open fun batchGetBuilds(callback: (err: AWSError, data: BatchGetBuildsOutput) -> Unit = definedExternally): Request<BatchGetBuildsOutput, AWSError>
    open fun batchGetProjects(params: BatchGetProjectsInput, callback: (err: AWSError, data: BatchGetProjectsOutput) -> Unit = definedExternally): Request<BatchGetProjectsOutput, AWSError>
    open fun batchGetProjects(callback: (err: AWSError, data: BatchGetProjectsOutput) -> Unit = definedExternally): Request<BatchGetProjectsOutput, AWSError>
    open fun batchGetReportGroups(params: BatchGetReportGroupsInput, callback: (err: AWSError, data: BatchGetReportGroupsOutput) -> Unit = definedExternally): Request<BatchGetReportGroupsOutput, AWSError>
    open fun batchGetReportGroups(callback: (err: AWSError, data: BatchGetReportGroupsOutput) -> Unit = definedExternally): Request<BatchGetReportGroupsOutput, AWSError>
    open fun batchGetReports(params: BatchGetReportsInput, callback: (err: AWSError, data: BatchGetReportsOutput) -> Unit = definedExternally): Request<BatchGetReportsOutput, AWSError>
    open fun batchGetReports(callback: (err: AWSError, data: BatchGetReportsOutput) -> Unit = definedExternally): Request<BatchGetReportsOutput, AWSError>
    open fun createProject(params: CreateProjectInput, callback: (err: AWSError, data: CreateProjectOutput) -> Unit = definedExternally): Request<CreateProjectOutput, AWSError>
    open fun createProject(callback: (err: AWSError, data: CreateProjectOutput) -> Unit = definedExternally): Request<CreateProjectOutput, AWSError>
    open fun createReportGroup(params: CreateReportGroupInput, callback: (err: AWSError, data: CreateReportGroupOutput) -> Unit = definedExternally): Request<CreateReportGroupOutput, AWSError>
    open fun createReportGroup(callback: (err: AWSError, data: CreateReportGroupOutput) -> Unit = definedExternally): Request<CreateReportGroupOutput, AWSError>
    open fun createWebhook(params: CreateWebhookInput, callback: (err: AWSError, data: CreateWebhookOutput) -> Unit = definedExternally): Request<CreateWebhookOutput, AWSError>
    open fun createWebhook(callback: (err: AWSError, data: CreateWebhookOutput) -> Unit = definedExternally): Request<CreateWebhookOutput, AWSError>
    open fun deleteProject(params: DeleteProjectInput, callback: (err: AWSError, data: DeleteProjectOutput) -> Unit = definedExternally): Request<DeleteProjectOutput, AWSError>
    open fun deleteProject(callback: (err: AWSError, data: DeleteProjectOutput) -> Unit = definedExternally): Request<DeleteProjectOutput, AWSError>
    open fun deleteReport(params: DeleteReportInput, callback: (err: AWSError, data: DeleteReportOutput) -> Unit = definedExternally): Request<DeleteReportOutput, AWSError>
    open fun deleteReport(callback: (err: AWSError, data: DeleteReportOutput) -> Unit = definedExternally): Request<DeleteReportOutput, AWSError>
    open fun deleteReportGroup(params: DeleteReportGroupInput, callback: (err: AWSError, data: DeleteReportGroupOutput) -> Unit = definedExternally): Request<DeleteReportGroupOutput, AWSError>
    open fun deleteReportGroup(callback: (err: AWSError, data: DeleteReportGroupOutput) -> Unit = definedExternally): Request<DeleteReportGroupOutput, AWSError>
    open fun deleteResourcePolicy(params: DeleteResourcePolicyInput, callback: (err: AWSError, data: DeleteResourcePolicyOutput) -> Unit = definedExternally): Request<DeleteResourcePolicyOutput, AWSError>
    open fun deleteResourcePolicy(callback: (err: AWSError, data: DeleteResourcePolicyOutput) -> Unit = definedExternally): Request<DeleteResourcePolicyOutput, AWSError>
    open fun deleteSourceCredentials(params: DeleteSourceCredentialsInput, callback: (err: AWSError, data: DeleteSourceCredentialsOutput) -> Unit = definedExternally): Request<DeleteSourceCredentialsOutput, AWSError>
    open fun deleteSourceCredentials(callback: (err: AWSError, data: DeleteSourceCredentialsOutput) -> Unit = definedExternally): Request<DeleteSourceCredentialsOutput, AWSError>
    open fun deleteWebhook(params: DeleteWebhookInput, callback: (err: AWSError, data: DeleteWebhookOutput) -> Unit = definedExternally): Request<DeleteWebhookOutput, AWSError>
    open fun deleteWebhook(callback: (err: AWSError, data: DeleteWebhookOutput) -> Unit = definedExternally): Request<DeleteWebhookOutput, AWSError>
    open fun describeTestCases(params: DescribeTestCasesInput, callback: (err: AWSError, data: DescribeTestCasesOutput) -> Unit = definedExternally): Request<DescribeTestCasesOutput, AWSError>
    open fun describeTestCases(callback: (err: AWSError, data: DescribeTestCasesOutput) -> Unit = definedExternally): Request<DescribeTestCasesOutput, AWSError>
    open fun getResourcePolicy(params: GetResourcePolicyInput, callback: (err: AWSError, data: GetResourcePolicyOutput) -> Unit = definedExternally): Request<GetResourcePolicyOutput, AWSError>
    open fun getResourcePolicy(callback: (err: AWSError, data: GetResourcePolicyOutput) -> Unit = definedExternally): Request<GetResourcePolicyOutput, AWSError>
    open fun importSourceCredentials(params: ImportSourceCredentialsInput, callback: (err: AWSError, data: ImportSourceCredentialsOutput) -> Unit = definedExternally): Request<ImportSourceCredentialsOutput, AWSError>
    open fun importSourceCredentials(callback: (err: AWSError, data: ImportSourceCredentialsOutput) -> Unit = definedExternally): Request<ImportSourceCredentialsOutput, AWSError>
    open fun invalidateProjectCache(params: InvalidateProjectCacheInput, callback: (err: AWSError, data: InvalidateProjectCacheOutput) -> Unit = definedExternally): Request<InvalidateProjectCacheOutput, AWSError>
    open fun invalidateProjectCache(callback: (err: AWSError, data: InvalidateProjectCacheOutput) -> Unit = definedExternally): Request<InvalidateProjectCacheOutput, AWSError>
    open fun listBuilds(params: ListBuildsInput, callback: (err: AWSError, data: ListBuildsOutput) -> Unit = definedExternally): Request<ListBuildsOutput, AWSError>
    open fun listBuilds(callback: (err: AWSError, data: ListBuildsOutput) -> Unit = definedExternally): Request<ListBuildsOutput, AWSError>
    open fun listBuildsForProject(params: ListBuildsForProjectInput, callback: (err: AWSError, data: ListBuildsForProjectOutput) -> Unit = definedExternally): Request<ListBuildsForProjectOutput, AWSError>
    open fun listBuildsForProject(callback: (err: AWSError, data: ListBuildsForProjectOutput) -> Unit = definedExternally): Request<ListBuildsForProjectOutput, AWSError>
    open fun listCuratedEnvironmentImages(params: ListCuratedEnvironmentImagesInput, callback: (err: AWSError, data: ListCuratedEnvironmentImagesOutput) -> Unit = definedExternally): Request<ListCuratedEnvironmentImagesOutput, AWSError>
    open fun listCuratedEnvironmentImages(callback: (err: AWSError, data: ListCuratedEnvironmentImagesOutput) -> Unit = definedExternally): Request<ListCuratedEnvironmentImagesOutput, AWSError>
    open fun listProjects(params: ListProjectsInput, callback: (err: AWSError, data: ListProjectsOutput) -> Unit = definedExternally): Request<ListProjectsOutput, AWSError>
    open fun listProjects(callback: (err: AWSError, data: ListProjectsOutput) -> Unit = definedExternally): Request<ListProjectsOutput, AWSError>
    open fun listReportGroups(params: ListReportGroupsInput, callback: (err: AWSError, data: ListReportGroupsOutput) -> Unit = definedExternally): Request<ListReportGroupsOutput, AWSError>
    open fun listReportGroups(callback: (err: AWSError, data: ListReportGroupsOutput) -> Unit = definedExternally): Request<ListReportGroupsOutput, AWSError>
    open fun listReports(params: ListReportsInput, callback: (err: AWSError, data: ListReportsOutput) -> Unit = definedExternally): Request<ListReportsOutput, AWSError>
    open fun listReports(callback: (err: AWSError, data: ListReportsOutput) -> Unit = definedExternally): Request<ListReportsOutput, AWSError>
    open fun listReportsForReportGroup(params: ListReportsForReportGroupInput, callback: (err: AWSError, data: ListReportsForReportGroupOutput) -> Unit = definedExternally): Request<ListReportsForReportGroupOutput, AWSError>
    open fun listReportsForReportGroup(callback: (err: AWSError, data: ListReportsForReportGroupOutput) -> Unit = definedExternally): Request<ListReportsForReportGroupOutput, AWSError>
    open fun listSharedProjects(params: ListSharedProjectsInput, callback: (err: AWSError, data: ListSharedProjectsOutput) -> Unit = definedExternally): Request<ListSharedProjectsOutput, AWSError>
    open fun listSharedProjects(callback: (err: AWSError, data: ListSharedProjectsOutput) -> Unit = definedExternally): Request<ListSharedProjectsOutput, AWSError>
    open fun listSharedReportGroups(params: ListSharedReportGroupsInput, callback: (err: AWSError, data: ListSharedReportGroupsOutput) -> Unit = definedExternally): Request<ListSharedReportGroupsOutput, AWSError>
    open fun listSharedReportGroups(callback: (err: AWSError, data: ListSharedReportGroupsOutput) -> Unit = definedExternally): Request<ListSharedReportGroupsOutput, AWSError>
    open fun listSourceCredentials(params: ListSourceCredentialsInput, callback: (err: AWSError, data: ListSourceCredentialsOutput) -> Unit = definedExternally): Request<ListSourceCredentialsOutput, AWSError>
    open fun listSourceCredentials(callback: (err: AWSError, data: ListSourceCredentialsOutput) -> Unit = definedExternally): Request<ListSourceCredentialsOutput, AWSError>
    open fun putResourcePolicy(params: PutResourcePolicyInput, callback: (err: AWSError, data: PutResourcePolicyOutput) -> Unit = definedExternally): Request<PutResourcePolicyOutput, AWSError>
    open fun putResourcePolicy(callback: (err: AWSError, data: PutResourcePolicyOutput) -> Unit = definedExternally): Request<PutResourcePolicyOutput, AWSError>
    open fun startBuild(params: StartBuildInput, callback: (err: AWSError, data: StartBuildOutput) -> Unit = definedExternally): Request<StartBuildOutput, AWSError>
    open fun startBuild(callback: (err: AWSError, data: StartBuildOutput) -> Unit = definedExternally): Request<StartBuildOutput, AWSError>
    open fun stopBuild(params: StopBuildInput, callback: (err: AWSError, data: StopBuildOutput) -> Unit = definedExternally): Request<StopBuildOutput, AWSError>
    open fun stopBuild(callback: (err: AWSError, data: StopBuildOutput) -> Unit = definedExternally): Request<StopBuildOutput, AWSError>
    open fun updateProject(params: UpdateProjectInput, callback: (err: AWSError, data: UpdateProjectOutput) -> Unit = definedExternally): Request<UpdateProjectOutput, AWSError>
    open fun updateProject(callback: (err: AWSError, data: UpdateProjectOutput) -> Unit = definedExternally): Request<UpdateProjectOutput, AWSError>
    open fun updateReportGroup(params: UpdateReportGroupInput, callback: (err: AWSError, data: UpdateReportGroupOutput) -> Unit = definedExternally): Request<UpdateReportGroupOutput, AWSError>
    open fun updateReportGroup(callback: (err: AWSError, data: UpdateReportGroupOutput) -> Unit = definedExternally): Request<UpdateReportGroupOutput, AWSError>
    open fun updateWebhook(params: UpdateWebhookInput, callback: (err: AWSError, data: UpdateWebhookOutput) -> Unit = definedExternally): Request<UpdateWebhookOutput, AWSError>
    open fun updateWebhook(callback: (err: AWSError, data: UpdateWebhookOutput) -> Unit = definedExternally): Request<UpdateWebhookOutput, AWSError>
    interface BatchDeleteBuildsInput {
        var ids: BuildIds
    }
    interface BatchDeleteBuildsOutput {
        var buildsDeleted: BuildIds?
            get() = definedExternally
            set(value) = definedExternally
        var buildsNotDeleted: BuildsNotDeleted?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetBuildsInput {
        var ids: BuildIds
    }
    interface BatchGetBuildsOutput {
        var builds: Builds?
            get() = definedExternally
            set(value) = definedExternally
        var buildsNotFound: BuildIds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetProjectsInput {
        var names: ProjectNames
    }
    interface BatchGetProjectsOutput {
        var projects: Projects?
            get() = definedExternally
            set(value) = definedExternally
        var projectsNotFound: ProjectNames?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetReportGroupsInput {
        var reportGroupArns: ReportGroupArns
    }
    interface BatchGetReportGroupsOutput {
        var reportGroups: ReportGroups?
            get() = definedExternally
            set(value) = definedExternally
        var reportGroupsNotFound: ReportGroupArns?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetReportsInput {
        var reportArns: ReportArns
    }
    interface BatchGetReportsOutput {
        var reports: Reports?
            get() = definedExternally
            set(value) = definedExternally
        var reportsNotFound: ReportArns?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Build {
        var id: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var buildNumber: WrapperLong?
            get() = definedExternally
            set(value) = definedExternally
        var startTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var endTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var currentPhase: String?
            get() = definedExternally
            set(value) = definedExternally
        var buildStatus: String /* "SUCCEEDED" | "FAILED" | "FAULT" | "TIMED_OUT" | "IN_PROGRESS" | "STOPPED" | String */
        var sourceVersion: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var resolvedSourceVersion: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var projectName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var phases: BuildPhases?
            get() = definedExternally
            set(value) = definedExternally
        var source: ProjectSource?
            get() = definedExternally
            set(value) = definedExternally
        var secondarySources: ProjectSources?
            get() = definedExternally
            set(value) = definedExternally
        var secondarySourceVersions: ProjectSecondarySourceVersions?
            get() = definedExternally
            set(value) = definedExternally
        var artifacts: BuildArtifacts?
            get() = definedExternally
            set(value) = definedExternally
        var secondaryArtifacts: BuildArtifactsList?
            get() = definedExternally
            set(value) = definedExternally
        var cache: ProjectCache?
            get() = definedExternally
            set(value) = definedExternally
        var environment: ProjectEnvironment?
            get() = definedExternally
            set(value) = definedExternally
        var serviceRole: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var logs: LogsLocation?
            get() = definedExternally
            set(value) = definedExternally
        var timeoutInMinutes: WrapperInt?
            get() = definedExternally
            set(value) = definedExternally
        var queuedTimeoutInMinutes: WrapperInt?
            get() = definedExternally
            set(value) = definedExternally
        var buildComplete: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var initiator: String?
            get() = definedExternally
            set(value) = definedExternally
        var vpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
        var networkInterface: NetworkInterface?
            get() = definedExternally
            set(value) = definedExternally
        var encryptionKey: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var exportedEnvironmentVariables: ExportedEnvironmentVariables?
            get() = definedExternally
            set(value) = definedExternally
        var reportArns: BuildReportArns?
            get() = definedExternally
            set(value) = definedExternally
        var fileSystemLocations: ProjectFileSystemLocations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BuildArtifacts {
        var location: String?
            get() = definedExternally
            set(value) = definedExternally
        var sha256sum: String?
            get() = definedExternally
            set(value) = definedExternally
        var md5sum: String?
            get() = definedExternally
            set(value) = definedExternally
        var overrideArtifactName: WrapperBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var encryptionDisabled: WrapperBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var artifactIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BuildNotDeleted {
        var id: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var statusCode: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BuildPhase {
        var phaseType: String /* "SUBMITTED" | "QUEUED" | "PROVISIONING" | "DOWNLOAD_SOURCE" | "INSTALL" | "PRE_BUILD" | "BUILD" | "POST_BUILD" | "UPLOAD_ARTIFACTS" | "FINALIZING" | "COMPLETED" | String */
        var phaseStatus: String /* "SUCCEEDED" | "FAILED" | "FAULT" | "TIMED_OUT" | "IN_PROGRESS" | "STOPPED" | String */
        var startTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var endTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var durationInSeconds: WrapperLong?
            get() = definedExternally
            set(value) = definedExternally
        var contexts: PhaseContexts?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CloudWatchLogsConfig {
        var status: String /* "ENABLED" | "DISABLED" | String */
        var groupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var streamName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProjectInput {
        var name: ProjectName
        var description: ProjectDescription?
            get() = definedExternally
            set(value) = definedExternally
        var source: ProjectSource
        var secondarySources: ProjectSources?
            get() = definedExternally
            set(value) = definedExternally
        var sourceVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var secondarySourceVersions: ProjectSecondarySourceVersions?
            get() = definedExternally
            set(value) = definedExternally
        var artifacts: ProjectArtifacts
        var secondaryArtifacts: ProjectArtifactsList?
            get() = definedExternally
            set(value) = definedExternally
        var cache: ProjectCache?
            get() = definedExternally
            set(value) = definedExternally
        var environment: ProjectEnvironment
        var serviceRole: NonEmptyString
        var timeoutInMinutes: TimeOut?
            get() = definedExternally
            set(value) = definedExternally
        var queuedTimeoutInMinutes: TimeOut?
            get() = definedExternally
            set(value) = definedExternally
        var encryptionKey: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var vpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
        var badgeEnabled: WrapperBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var logsConfig: LogsConfig?
            get() = definedExternally
            set(value) = definedExternally
        var fileSystemLocations: ProjectFileSystemLocations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProjectOutput {
        var project: Project?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateReportGroupInput {
        var name: ReportGroupName
        var type: String /* "TEST" | String */
        var exportConfig: ReportExportConfig
    }
    interface CreateReportGroupOutput {
        var reportGroup: ReportGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateWebhookInput {
        var projectName: ProjectName
        var branchFilter: String?
            get() = definedExternally
            set(value) = definedExternally
        var filterGroups: FilterGroups?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateWebhookOutput {
        var webhook: Webhook?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteProjectInput {
        var name: NonEmptyString
    }
    interface DeleteProjectOutput
    interface DeleteReportGroupInput {
        var arn: NonEmptyString
    }
    interface DeleteReportGroupOutput
    interface DeleteReportInput {
        var arn: NonEmptyString
    }
    interface DeleteReportOutput
    interface DeleteResourcePolicyInput {
        var resourceArn: NonEmptyString
    }
    interface DeleteResourcePolicyOutput
    interface DeleteSourceCredentialsInput {
        var arn: NonEmptyString
    }
    interface DeleteSourceCredentialsOutput {
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteWebhookInput {
        var projectName: ProjectName
    }
    interface DeleteWebhookOutput
    interface DescribeTestCasesInput {
        var reportArn: String
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var filter: TestCaseFilter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTestCasesOutput {
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var testCases: TestCases?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnvironmentImage {
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var versions: ImageVersions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnvironmentLanguage {
        var language: String /* "JAVA" | "PYTHON" | "NODE_JS" | "RUBY" | "GOLANG" | "DOCKER" | "ANDROID" | "DOTNET" | "BASE" | "PHP" | String */
        var images: EnvironmentImages?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnvironmentPlatform {
        var platform: String /* "DEBIAN" | "AMAZON_LINUX" | "UBUNTU" | "WINDOWS_SERVER" | String */
        var languages: EnvironmentLanguages?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnvironmentVariable {
        var name: NonEmptyString
        var value: String
        var type: String /* "PLAINTEXT" | "PARAMETER_STORE" | "SECRETS_MANAGER" | String */
    }
    interface ExportedEnvironmentVariable {
        var name: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var value: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResourcePolicyInput {
        var resourceArn: NonEmptyString
    }
    interface GetResourcePolicyOutput {
        var policy: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GitSubmodulesConfig {
        var fetchSubmodules: WrapperBoolean
    }
    interface ImportSourceCredentialsInput {
        var username: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var token: SensitiveNonEmptyString
        var serverType: String /* "GITHUB" | "BITBUCKET" | "GITHUB_ENTERPRISE" | String */
        var authType: String /* "OAUTH" | "BASIC_AUTH" | "PERSONAL_ACCESS_TOKEN" | String */
        var shouldOverwrite: WrapperBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportSourceCredentialsOutput {
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InvalidateProjectCacheInput {
        var projectName: NonEmptyString
    }
    interface InvalidateProjectCacheOutput
    interface ListBuildsForProjectInput {
        var projectName: NonEmptyString
        var sortOrder: String /* "ASCENDING" | "DESCENDING" | String */
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBuildsForProjectOutput {
        var ids: BuildIds?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBuildsInput {
        var sortOrder: String /* "ASCENDING" | "DESCENDING" | String */
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBuildsOutput {
        var ids: BuildIds?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCuratedEnvironmentImagesInput
    interface ListCuratedEnvironmentImagesOutput {
        var platforms: EnvironmentPlatforms?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProjectsInput {
        var sortBy: String /* "NAME" | "CREATED_TIME" | "LAST_MODIFIED_TIME" | String */
        var sortOrder: String /* "ASCENDING" | "DESCENDING" | String */
        var nextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProjectsOutput {
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var projects: ProjectNames?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListReportGroupsInput {
        var sortOrder: String /* "ASCENDING" | "DESCENDING" | String */
        var sortBy: String /* "NAME" | "CREATED_TIME" | "LAST_MODIFIED_TIME" | String */
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListReportGroupsOutput {
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var reportGroups: ReportGroupArns?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListReportsForReportGroupInput {
        var reportGroupArn: String
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var sortOrder: String /* "ASCENDING" | "DESCENDING" | String */
        var maxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var filter: ReportFilter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListReportsForReportGroupOutput {
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var reports: ReportArns?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListReportsInput {
        var sortOrder: String /* "ASCENDING" | "DESCENDING" | String */
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var filter: ReportFilter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListReportsOutput {
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var reports: ReportArns?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSharedProjectsInput {
        var sortBy: String /* "ARN" | "MODIFIED_TIME" | String */
        var sortOrder: String /* "ASCENDING" | "DESCENDING" | String */
        var maxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSharedProjectsOutput {
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var projects: ProjectArns?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSharedReportGroupsInput {
        var sortOrder: String /* "ASCENDING" | "DESCENDING" | String */
        var sortBy: String /* "ARN" | "MODIFIED_TIME" | String */
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSharedReportGroupsOutput {
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var reportGroups: ReportGroupArns?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSourceCredentialsInput
    interface ListSourceCredentialsOutput {
        var sourceCredentialsInfos: SourceCredentialsInfos?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogsConfig {
        var cloudWatchLogs: CloudWatchLogsConfig?
            get() = definedExternally
            set(value) = definedExternally
        var s3Logs: S3LogsConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogsLocation {
        var groupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var streamName: String?
            get() = definedExternally
            set(value) = definedExternally
        var deepLink: String?
            get() = definedExternally
            set(value) = definedExternally
        var s3DeepLink: String?
            get() = definedExternally
            set(value) = definedExternally
        var cloudWatchLogsArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var s3LogsArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var cloudWatchLogs: CloudWatchLogsConfig?
            get() = definedExternally
            set(value) = definedExternally
        var s3Logs: S3LogsConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NetworkInterface {
        var subnetId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var networkInterfaceId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PhaseContext {
        var statusCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Project {
        var name: ProjectName?
            get() = definedExternally
            set(value) = definedExternally
        var arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: ProjectDescription?
            get() = definedExternally
            set(value) = definedExternally
        var source: ProjectSource?
            get() = definedExternally
            set(value) = definedExternally
        var secondarySources: ProjectSources?
            get() = definedExternally
            set(value) = definedExternally
        var sourceVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var secondarySourceVersions: ProjectSecondarySourceVersions?
            get() = definedExternally
            set(value) = definedExternally
        var artifacts: ProjectArtifacts?
            get() = definedExternally
            set(value) = definedExternally
        var secondaryArtifacts: ProjectArtifactsList?
            get() = definedExternally
            set(value) = definedExternally
        var cache: ProjectCache?
            get() = definedExternally
            set(value) = definedExternally
        var environment: ProjectEnvironment?
            get() = definedExternally
            set(value) = definedExternally
        var serviceRole: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var timeoutInMinutes: TimeOut?
            get() = definedExternally
            set(value) = definedExternally
        var queuedTimeoutInMinutes: TimeOut?
            get() = definedExternally
            set(value) = definedExternally
        var encryptionKey: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var created: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastModified: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var webhook: Webhook?
            get() = definedExternally
            set(value) = definedExternally
        var vpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
        var badge: ProjectBadge?
            get() = definedExternally
            set(value) = definedExternally
        var logsConfig: LogsConfig?
            get() = definedExternally
            set(value) = definedExternally
        var fileSystemLocations: ProjectFileSystemLocations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProjectArtifacts {
        var type: String /* "CODEPIPELINE" | "S3" | "NO_ARTIFACTS" | String */
        var location: String?
            get() = definedExternally
            set(value) = definedExternally
        var path: String?
            get() = definedExternally
            set(value) = definedExternally
        var namespaceType: String /* "NONE" | "BUILD_ID" | String */
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var packaging: String /* "NONE" | "ZIP" | String */
        var overrideArtifactName: WrapperBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var encryptionDisabled: WrapperBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var artifactIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProjectBadge {
        var badgeEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var badgeRequestUrl: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProjectCache {
        var type: String /* "NO_CACHE" | "S3" | "LOCAL" | String */
        var location: String?
            get() = definedExternally
            set(value) = definedExternally
        var modes: ProjectCacheModes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProjectEnvironment {
        var type: String /* "WINDOWS_CONTAINER" | "LINUX_CONTAINER" | "LINUX_GPU_CONTAINER" | "ARM_CONTAINER" | String */
        var image: NonEmptyString
        var computeType: String /* "BUILD_GENERAL1_SMALL" | "BUILD_GENERAL1_MEDIUM" | "BUILD_GENERAL1_LARGE" | "BUILD_GENERAL1_2XLARGE" | String */
        var environmentVariables: EnvironmentVariables?
            get() = definedExternally
            set(value) = definedExternally
        var privilegedMode: WrapperBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var certificate: String?
            get() = definedExternally
            set(value) = definedExternally
        var registryCredential: RegistryCredential?
            get() = definedExternally
            set(value) = definedExternally
        var imagePullCredentialsType: String /* "CODEBUILD" | "SERVICE_ROLE" | String */
    }
    interface ProjectFileSystemLocation {
        var type: String /* "EFS" | String */
        var location: String?
            get() = definedExternally
            set(value) = definedExternally
        var mountPoint: String?
            get() = definedExternally
            set(value) = definedExternally
        var identifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var mountOptions: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProjectSource {
        var type: String /* "CODECOMMIT" | "CODEPIPELINE" | "GITHUB" | "S3" | "BITBUCKET" | "GITHUB_ENTERPRISE" | "NO_SOURCE" | String */
        var location: String?
            get() = definedExternally
            set(value) = definedExternally
        var gitCloneDepth: GitCloneDepth?
            get() = definedExternally
            set(value) = definedExternally
        var gitSubmodulesConfig: GitSubmodulesConfig?
            get() = definedExternally
            set(value) = definedExternally
        var buildspec: String?
            get() = definedExternally
            set(value) = definedExternally
        var auth: SourceAuth?
            get() = definedExternally
            set(value) = definedExternally
        var reportBuildStatus: WrapperBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var insecureSsl: WrapperBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var sourceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProjectSourceVersion {
        var sourceIdentifier: String
        var sourceVersion: String
    }
    interface PutResourcePolicyInput {
        var policy: NonEmptyString
        var resourceArn: NonEmptyString
    }
    interface PutResourcePolicyOutput {
        var resourceArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegistryCredential {
        var credential: NonEmptyString
        var credentialProvider: String /* "SECRETS_MANAGER" | String */
    }
    interface Report {
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "TEST" | String */
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var reportGroupArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var executionId: String?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "GENERATING" | "SUCCEEDED" | "FAILED" | "INCOMPLETE" | "DELETING" | String */
        var created: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var expired: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var exportConfig: ReportExportConfig?
            get() = definedExternally
            set(value) = definedExternally
        var truncated: WrapperBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var testSummary: TestReportSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReportExportConfig {
        var exportConfigType: String /* "S3" | "NO_EXPORT" | String */
        var s3Destination: S3ReportExportConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReportFilter {
        var status: String /* "GENERATING" | "SUCCEEDED" | "FAILED" | "INCOMPLETE" | "DELETING" | String */
    }
    interface ReportGroup {
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var name: ReportGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "TEST" | String */
        var exportConfig: ReportExportConfig?
            get() = definedExternally
            set(value) = definedExternally
        var created: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastModified: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReportStatusCounts {
        @nativeGetter
        operator fun get(key: String): WrapperInt?
        @nativeSetter
        operator fun set(key: String, value: WrapperInt)
    }
    interface S3LogsConfig {
        var status: String /* "ENABLED" | "DISABLED" | String */
        var location: String?
            get() = definedExternally
            set(value) = definedExternally
        var encryptionDisabled: WrapperBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3ReportExportConfig {
        var bucket: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var path: String?
            get() = definedExternally
            set(value) = definedExternally
        var packaging: String /* "ZIP" | "NONE" | String */
        var encryptionKey: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var encryptionDisabled: WrapperBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SourceAuth {
        var type: String /* "OAUTH" | String */
        var resource: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SourceCredentialsInfo {
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var serverType: String /* "GITHUB" | "BITBUCKET" | "GITHUB_ENTERPRISE" | String */
        var authType: String /* "OAUTH" | "BASIC_AUTH" | "PERSONAL_ACCESS_TOKEN" | String */
    }
    interface StartBuildInput {
        var projectName: NonEmptyString
        var secondarySourcesOverride: ProjectSources?
            get() = definedExternally
            set(value) = definedExternally
        var secondarySourcesVersionOverride: ProjectSecondarySourceVersions?
            get() = definedExternally
            set(value) = definedExternally
        var sourceVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var artifactsOverride: ProjectArtifacts?
            get() = definedExternally
            set(value) = definedExternally
        var secondaryArtifactsOverride: ProjectArtifactsList?
            get() = definedExternally
            set(value) = definedExternally
        var environmentVariablesOverride: EnvironmentVariables?
            get() = definedExternally
            set(value) = definedExternally
        var sourceTypeOverride: String /* "CODECOMMIT" | "CODEPIPELINE" | "GITHUB" | "S3" | "BITBUCKET" | "GITHUB_ENTERPRISE" | "NO_SOURCE" | String */
        var sourceLocationOverride: String?
            get() = definedExternally
            set(value) = definedExternally
        var sourceAuthOverride: SourceAuth?
            get() = definedExternally
            set(value) = definedExternally
        var gitCloneDepthOverride: GitCloneDepth?
            get() = definedExternally
            set(value) = definedExternally
        var gitSubmodulesConfigOverride: GitSubmodulesConfig?
            get() = definedExternally
            set(value) = definedExternally
        var buildspecOverride: String?
            get() = definedExternally
            set(value) = definedExternally
        var insecureSslOverride: WrapperBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var reportBuildStatusOverride: WrapperBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var environmentTypeOverride: String /* "WINDOWS_CONTAINER" | "LINUX_CONTAINER" | "LINUX_GPU_CONTAINER" | "ARM_CONTAINER" | String */
        var imageOverride: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var computeTypeOverride: String /* "BUILD_GENERAL1_SMALL" | "BUILD_GENERAL1_MEDIUM" | "BUILD_GENERAL1_LARGE" | "BUILD_GENERAL1_2XLARGE" | String */
        var certificateOverride: String?
            get() = definedExternally
            set(value) = definedExternally
        var cacheOverride: ProjectCache?
            get() = definedExternally
            set(value) = definedExternally
        var serviceRoleOverride: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var privilegedModeOverride: WrapperBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var timeoutInMinutesOverride: TimeOut?
            get() = definedExternally
            set(value) = definedExternally
        var queuedTimeoutInMinutesOverride: TimeOut?
            get() = definedExternally
            set(value) = definedExternally
        var encryptionKeyOverride: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var idempotencyToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var logsConfigOverride: LogsConfig?
            get() = definedExternally
            set(value) = definedExternally
        var registryCredentialOverride: RegistryCredential?
            get() = definedExternally
            set(value) = definedExternally
        var imagePullCredentialsTypeOverride: String /* "CODEBUILD" | "SERVICE_ROLE" | String */
    }
    interface StartBuildOutput {
        var build: Build?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopBuildInput {
        var id: NonEmptyString
    }
    interface StopBuildOutput {
        var build: Build?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var key: KeyInput?
            get() = definedExternally
            set(value) = definedExternally
        var value: ValueInput?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestCase {
        var reportArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var testRawDataPath: String?
            get() = definedExternally
            set(value) = definedExternally
        var prefix: String?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var status: String?
            get() = definedExternally
            set(value) = definedExternally
        var durationInNanoSeconds: WrapperLong?
            get() = definedExternally
            set(value) = definedExternally
        var message: String?
            get() = definedExternally
            set(value) = definedExternally
        var expired: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestCaseFilter {
        var status: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestReportSummary {
        var total: WrapperInt
        var statusCounts: ReportStatusCounts
        var durationInNanoSeconds: WrapperLong
    }
    interface UpdateProjectInput {
        var name: NonEmptyString
        var description: ProjectDescription?
            get() = definedExternally
            set(value) = definedExternally
        var source: ProjectSource?
            get() = definedExternally
            set(value) = definedExternally
        var secondarySources: ProjectSources?
            get() = definedExternally
            set(value) = definedExternally
        var sourceVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var secondarySourceVersions: ProjectSecondarySourceVersions?
            get() = definedExternally
            set(value) = definedExternally
        var artifacts: ProjectArtifacts?
            get() = definedExternally
            set(value) = definedExternally
        var secondaryArtifacts: ProjectArtifactsList?
            get() = definedExternally
            set(value) = definedExternally
        var cache: ProjectCache?
            get() = definedExternally
            set(value) = definedExternally
        var environment: ProjectEnvironment?
            get() = definedExternally
            set(value) = definedExternally
        var serviceRole: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var timeoutInMinutes: TimeOut?
            get() = definedExternally
            set(value) = definedExternally
        var queuedTimeoutInMinutes: TimeOut?
            get() = definedExternally
            set(value) = definedExternally
        var encryptionKey: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var vpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
        var badgeEnabled: WrapperBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var logsConfig: LogsConfig?
            get() = definedExternally
            set(value) = definedExternally
        var fileSystemLocations: ProjectFileSystemLocations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateProjectOutput {
        var project: Project?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateReportGroupInput {
        var arn: NonEmptyString
        var exportConfig: ReportExportConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateReportGroupOutput {
        var reportGroup: ReportGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateWebhookInput {
        var projectName: ProjectName
        var branchFilter: String?
            get() = definedExternally
            set(value) = definedExternally
        var rotateSecret: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var filterGroups: FilterGroups?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateWebhookOutput {
        var webhook: Webhook?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VpcConfig {
        var vpcId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var subnets: Subnets?
            get() = definedExternally
            set(value) = definedExternally
        var securityGroupIds: SecurityGroupIds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Webhook {
        var url: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var payloadUrl: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var secret: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var branchFilter: String?
            get() = definedExternally
            set(value) = definedExternally
        var filterGroups: FilterGroups?
            get() = definedExternally
            set(value) = definedExternally
        var lastModifiedSecret: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WebhookFilter {
        var type: String /* "EVENT" | "BASE_REF" | "HEAD_REF" | "ACTOR_ACCOUNT_ID" | "FILE_PATH" | String */
        var pattern: String
        var excludeMatchedPattern: WrapperBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2016-10-06" | "latest" | String */
    }
}