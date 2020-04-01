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
import Amplify.App
import Amplify.Artifact
import Amplify.BackendEnvironment
import Amplify.Branch
import Amplify.CustomRule
import Amplify.DomainAssociation
import Amplify.JobSummary
import Amplify.Step
import Amplify.SubDomainSetting
import Amplify.SubDomain
import Amplify.Webhook
import Amplify.CreateAppRequest
import Amplify.CreateAppResult
import Amplify.CreateBackendEnvironmentRequest
import Amplify.CreateBackendEnvironmentResult
import Amplify.CreateBranchRequest
import Amplify.CreateBranchResult
import Amplify.CreateDeploymentRequest
import Amplify.CreateDeploymentResult
import Amplify.CreateDomainAssociationRequest
import Amplify.CreateDomainAssociationResult
import Amplify.CreateWebhookRequest
import Amplify.CreateWebhookResult
import Amplify.DeleteAppRequest
import Amplify.DeleteAppResult
import Amplify.DeleteBackendEnvironmentRequest
import Amplify.DeleteBackendEnvironmentResult
import Amplify.DeleteBranchRequest
import Amplify.DeleteBranchResult
import Amplify.DeleteDomainAssociationRequest
import Amplify.DeleteDomainAssociationResult
import Amplify.DeleteJobRequest
import Amplify.DeleteJobResult
import Amplify.DeleteWebhookRequest
import Amplify.DeleteWebhookResult
import Amplify.GenerateAccessLogsRequest
import Amplify.GenerateAccessLogsResult
import Amplify.GetAppRequest
import Amplify.GetAppResult
import Amplify.GetArtifactUrlRequest
import Amplify.GetArtifactUrlResult
import Amplify.GetBackendEnvironmentRequest
import Amplify.GetBackendEnvironmentResult
import Amplify.GetBranchRequest
import Amplify.GetBranchResult
import Amplify.GetDomainAssociationRequest
import Amplify.GetDomainAssociationResult
import Amplify.GetJobRequest
import Amplify.GetJobResult
import Amplify.GetWebhookRequest
import Amplify.GetWebhookResult
import Amplify.ListAppsRequest
import Amplify.ListAppsResult
import Amplify.ListArtifactsRequest
import Amplify.ListArtifactsResult
import Amplify.ListBackendEnvironmentsRequest
import Amplify.ListBackendEnvironmentsResult
import Amplify.ListBranchesRequest
import Amplify.ListBranchesResult
import Amplify.ListDomainAssociationsRequest
import Amplify.ListDomainAssociationsResult
import Amplify.ListJobsRequest
import Amplify.ListJobsResult
import Amplify.ListTagsForResourceRequest
import Amplify.ListTagsForResourceResponse
import Amplify.ListWebhooksRequest
import Amplify.ListWebhooksResult
import Amplify.StartDeploymentRequest
import Amplify.StartDeploymentResult
import Amplify.StartJobRequest
import Amplify.StartJobResult
import Amplify.StopJobRequest
import Amplify.StopJobResult
import Amplify.TagResourceRequest
import Amplify.TagResourceResponse
import Amplify.UntagResourceRequest
import Amplify.UntagResourceResponse
import Amplify.UpdateAppRequest
import Amplify.UpdateAppResult
import Amplify.UpdateBranchRequest
import Amplify.UpdateBranchResult
import Amplify.UpdateDomainAssociationRequest
import Amplify.UpdateDomainAssociationResult
import Amplify.UpdateWebhookRequest
import Amplify.UpdateWebhookResult
import Amplify.TagMap
import Amplify.EnvironmentVariables
import Amplify.ProductionBranch
import Amplify.AutoBranchCreationConfig
import Amplify.FileMap
import Amplify.FileUploadUrls
import Amplify.Job
import Amplify.Screenshots

typealias AccessToken = String

typealias ActiveJobId = String

typealias AppArn = String

typealias AppId = String

typealias Apps = Array<App>

typealias ArtifactFileName = String

typealias ArtifactId = String

typealias ArtifactUrl = String

typealias Artifacts = Array<Artifact>

typealias ArtifactsUrl = String

typealias AssociatedResource = String

typealias AssociatedResources = Array<AssociatedResource>

typealias AutoBranchCreationPattern = String

typealias AutoBranchCreationPatterns = Array<AutoBranchCreationPattern>

typealias BackendEnvironmentArn = String

typealias BackendEnvironments = Array<BackendEnvironment>

typealias BasicAuthCredentials = String

typealias BranchArn = String

typealias BranchName = String

typealias Branches = Array<Branch>

typealias BuildSpec = String

typealias CertificateVerificationDNSRecord = String

typealias CommitId = String

typealias CommitMessage = String

typealias CommitTime = Date

typealias Condition = String

typealias Context = String

typealias CreateTime = Date

typealias CustomDomain = String

typealias CustomDomains = Array<CustomDomain>

typealias CustomRules = Array<CustomRule>

typealias DNSRecord = String

typealias DefaultDomain = String

typealias DeploymentArtifacts = String

typealias Description = String

typealias DisplayName = String

typealias DomainAssociationArn = String

typealias DomainAssociations = Array<DomainAssociation>

typealias DomainName = String

typealias DomainPrefix = String

typealias EnableAutoBranchCreation = Boolean

typealias EnableAutoBuild = Boolean

typealias EnableAutoSubDomain = Boolean

typealias EnableBasicAuth = Boolean

typealias EnableBranchAutoBuild = Boolean

typealias EnableNotification = Boolean

typealias EnablePullRequestPreview = Boolean

typealias EndTime = Date

typealias EnvKey = String

typealias EnvValue = String

typealias EnvironmentName = String

typealias FileName = String

typealias Framework = String

typealias JobArn = String

typealias JobId = String

typealias JobReason = String

typealias JobSummaries = Array<JobSummary>

typealias LastDeployTime = Date

typealias LogUrl = String

typealias MD5Hash = String

typealias MaxResults = Number

typealias Name = String

typealias NextToken = String

typealias OauthToken = String

typealias PullRequestEnvironmentName = String

typealias Repository = String

typealias ResourceArn = String

typealias ServiceRoleArn = String

typealias Source = String

typealias SourceUrl = String

typealias StackName = String

typealias StartTime = Date

typealias Status = String

typealias StatusReason = String

typealias StepName = String

typealias Steps = Array<Step>

typealias SubDomainSettings = Array<SubDomainSetting>

typealias SubDomains = Array<SubDomain>

typealias TTL = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagValue = String

typealias Target = String

typealias TestArtifactsUrl = String

typealias TestConfigUrl = String

typealias ThumbnailName = String

typealias ThumbnailUrl = String

typealias TotalNumberOfJobs = String

typealias UpdateTime = Date

typealias UploadUrl = String

typealias Verified = Boolean

typealias WebhookArn = String

typealias WebhookId = String

typealias WebhookUrl = String

typealias Webhooks = Array<Webhook>

@JsModule("aws-sdk")
external open class Amplify(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Amplify.Types.ClientConfiguration */
    open fun createApp(params: CreateAppRequest, callback: (err: AWSError, data: CreateAppResult) -> Unit = definedExternally): Request<CreateAppResult, AWSError>
    open fun createApp(callback: (err: AWSError, data: CreateAppResult) -> Unit = definedExternally): Request<CreateAppResult, AWSError>
    open fun createBackendEnvironment(params: CreateBackendEnvironmentRequest, callback: (err: AWSError, data: CreateBackendEnvironmentResult) -> Unit = definedExternally): Request<CreateBackendEnvironmentResult, AWSError>
    open fun createBackendEnvironment(callback: (err: AWSError, data: CreateBackendEnvironmentResult) -> Unit = definedExternally): Request<CreateBackendEnvironmentResult, AWSError>
    open fun createBranch(params: CreateBranchRequest, callback: (err: AWSError, data: CreateBranchResult) -> Unit = definedExternally): Request<CreateBranchResult, AWSError>
    open fun createBranch(callback: (err: AWSError, data: CreateBranchResult) -> Unit = definedExternally): Request<CreateBranchResult, AWSError>
    open fun createDeployment(params: CreateDeploymentRequest, callback: (err: AWSError, data: CreateDeploymentResult) -> Unit = definedExternally): Request<CreateDeploymentResult, AWSError>
    open fun createDeployment(callback: (err: AWSError, data: CreateDeploymentResult) -> Unit = definedExternally): Request<CreateDeploymentResult, AWSError>
    open fun createDomainAssociation(params: CreateDomainAssociationRequest, callback: (err: AWSError, data: CreateDomainAssociationResult) -> Unit = definedExternally): Request<CreateDomainAssociationResult, AWSError>
    open fun createDomainAssociation(callback: (err: AWSError, data: CreateDomainAssociationResult) -> Unit = definedExternally): Request<CreateDomainAssociationResult, AWSError>
    open fun createWebhook(params: CreateWebhookRequest, callback: (err: AWSError, data: CreateWebhookResult) -> Unit = definedExternally): Request<CreateWebhookResult, AWSError>
    open fun createWebhook(callback: (err: AWSError, data: CreateWebhookResult) -> Unit = definedExternally): Request<CreateWebhookResult, AWSError>
    open fun deleteApp(params: DeleteAppRequest, callback: (err: AWSError, data: DeleteAppResult) -> Unit = definedExternally): Request<DeleteAppResult, AWSError>
    open fun deleteApp(callback: (err: AWSError, data: DeleteAppResult) -> Unit = definedExternally): Request<DeleteAppResult, AWSError>
    open fun deleteBackendEnvironment(params: DeleteBackendEnvironmentRequest, callback: (err: AWSError, data: DeleteBackendEnvironmentResult) -> Unit = definedExternally): Request<DeleteBackendEnvironmentResult, AWSError>
    open fun deleteBackendEnvironment(callback: (err: AWSError, data: DeleteBackendEnvironmentResult) -> Unit = definedExternally): Request<DeleteBackendEnvironmentResult, AWSError>
    open fun deleteBranch(params: DeleteBranchRequest, callback: (err: AWSError, data: DeleteBranchResult) -> Unit = definedExternally): Request<DeleteBranchResult, AWSError>
    open fun deleteBranch(callback: (err: AWSError, data: DeleteBranchResult) -> Unit = definedExternally): Request<DeleteBranchResult, AWSError>
    open fun deleteDomainAssociation(params: DeleteDomainAssociationRequest, callback: (err: AWSError, data: DeleteDomainAssociationResult) -> Unit = definedExternally): Request<DeleteDomainAssociationResult, AWSError>
    open fun deleteDomainAssociation(callback: (err: AWSError, data: DeleteDomainAssociationResult) -> Unit = definedExternally): Request<DeleteDomainAssociationResult, AWSError>
    open fun deleteJob(params: DeleteJobRequest, callback: (err: AWSError, data: DeleteJobResult) -> Unit = definedExternally): Request<DeleteJobResult, AWSError>
    open fun deleteJob(callback: (err: AWSError, data: DeleteJobResult) -> Unit = definedExternally): Request<DeleteJobResult, AWSError>
    open fun deleteWebhook(params: DeleteWebhookRequest, callback: (err: AWSError, data: DeleteWebhookResult) -> Unit = definedExternally): Request<DeleteWebhookResult, AWSError>
    open fun deleteWebhook(callback: (err: AWSError, data: DeleteWebhookResult) -> Unit = definedExternally): Request<DeleteWebhookResult, AWSError>
    open fun generateAccessLogs(params: GenerateAccessLogsRequest, callback: (err: AWSError, data: GenerateAccessLogsResult) -> Unit = definedExternally): Request<GenerateAccessLogsResult, AWSError>
    open fun generateAccessLogs(callback: (err: AWSError, data: GenerateAccessLogsResult) -> Unit = definedExternally): Request<GenerateAccessLogsResult, AWSError>
    open fun getApp(params: GetAppRequest, callback: (err: AWSError, data: GetAppResult) -> Unit = definedExternally): Request<GetAppResult, AWSError>
    open fun getApp(callback: (err: AWSError, data: GetAppResult) -> Unit = definedExternally): Request<GetAppResult, AWSError>
    open fun getArtifactUrl(params: GetArtifactUrlRequest, callback: (err: AWSError, data: GetArtifactUrlResult) -> Unit = definedExternally): Request<GetArtifactUrlResult, AWSError>
    open fun getArtifactUrl(callback: (err: AWSError, data: GetArtifactUrlResult) -> Unit = definedExternally): Request<GetArtifactUrlResult, AWSError>
    open fun getBackendEnvironment(params: GetBackendEnvironmentRequest, callback: (err: AWSError, data: GetBackendEnvironmentResult) -> Unit = definedExternally): Request<GetBackendEnvironmentResult, AWSError>
    open fun getBackendEnvironment(callback: (err: AWSError, data: GetBackendEnvironmentResult) -> Unit = definedExternally): Request<GetBackendEnvironmentResult, AWSError>
    open fun getBranch(params: GetBranchRequest, callback: (err: AWSError, data: GetBranchResult) -> Unit = definedExternally): Request<GetBranchResult, AWSError>
    open fun getBranch(callback: (err: AWSError, data: GetBranchResult) -> Unit = definedExternally): Request<GetBranchResult, AWSError>
    open fun getDomainAssociation(params: GetDomainAssociationRequest, callback: (err: AWSError, data: GetDomainAssociationResult) -> Unit = definedExternally): Request<GetDomainAssociationResult, AWSError>
    open fun getDomainAssociation(callback: (err: AWSError, data: GetDomainAssociationResult) -> Unit = definedExternally): Request<GetDomainAssociationResult, AWSError>
    open fun getJob(params: GetJobRequest, callback: (err: AWSError, data: GetJobResult) -> Unit = definedExternally): Request<GetJobResult, AWSError>
    open fun getJob(callback: (err: AWSError, data: GetJobResult) -> Unit = definedExternally): Request<GetJobResult, AWSError>
    open fun getWebhook(params: GetWebhookRequest, callback: (err: AWSError, data: GetWebhookResult) -> Unit = definedExternally): Request<GetWebhookResult, AWSError>
    open fun getWebhook(callback: (err: AWSError, data: GetWebhookResult) -> Unit = definedExternally): Request<GetWebhookResult, AWSError>
    open fun listApps(params: ListAppsRequest, callback: (err: AWSError, data: ListAppsResult) -> Unit = definedExternally): Request<ListAppsResult, AWSError>
    open fun listApps(callback: (err: AWSError, data: ListAppsResult) -> Unit = definedExternally): Request<ListAppsResult, AWSError>
    open fun listArtifacts(params: ListArtifactsRequest, callback: (err: AWSError, data: ListArtifactsResult) -> Unit = definedExternally): Request<ListArtifactsResult, AWSError>
    open fun listArtifacts(callback: (err: AWSError, data: ListArtifactsResult) -> Unit = definedExternally): Request<ListArtifactsResult, AWSError>
    open fun listBackendEnvironments(params: ListBackendEnvironmentsRequest, callback: (err: AWSError, data: ListBackendEnvironmentsResult) -> Unit = definedExternally): Request<ListBackendEnvironmentsResult, AWSError>
    open fun listBackendEnvironments(callback: (err: AWSError, data: ListBackendEnvironmentsResult) -> Unit = definedExternally): Request<ListBackendEnvironmentsResult, AWSError>
    open fun listBranches(params: ListBranchesRequest, callback: (err: AWSError, data: ListBranchesResult) -> Unit = definedExternally): Request<ListBranchesResult, AWSError>
    open fun listBranches(callback: (err: AWSError, data: ListBranchesResult) -> Unit = definedExternally): Request<ListBranchesResult, AWSError>
    open fun listDomainAssociations(params: ListDomainAssociationsRequest, callback: (err: AWSError, data: ListDomainAssociationsResult) -> Unit = definedExternally): Request<ListDomainAssociationsResult, AWSError>
    open fun listDomainAssociations(callback: (err: AWSError, data: ListDomainAssociationsResult) -> Unit = definedExternally): Request<ListDomainAssociationsResult, AWSError>
    open fun listJobs(params: ListJobsRequest, callback: (err: AWSError, data: ListJobsResult) -> Unit = definedExternally): Request<ListJobsResult, AWSError>
    open fun listJobs(callback: (err: AWSError, data: ListJobsResult) -> Unit = definedExternally): Request<ListJobsResult, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listWebhooks(params: ListWebhooksRequest, callback: (err: AWSError, data: ListWebhooksResult) -> Unit = definedExternally): Request<ListWebhooksResult, AWSError>
    open fun listWebhooks(callback: (err: AWSError, data: ListWebhooksResult) -> Unit = definedExternally): Request<ListWebhooksResult, AWSError>
    open fun startDeployment(params: StartDeploymentRequest, callback: (err: AWSError, data: StartDeploymentResult) -> Unit = definedExternally): Request<StartDeploymentResult, AWSError>
    open fun startDeployment(callback: (err: AWSError, data: StartDeploymentResult) -> Unit = definedExternally): Request<StartDeploymentResult, AWSError>
    open fun startJob(params: StartJobRequest, callback: (err: AWSError, data: StartJobResult) -> Unit = definedExternally): Request<StartJobResult, AWSError>
    open fun startJob(callback: (err: AWSError, data: StartJobResult) -> Unit = definedExternally): Request<StartJobResult, AWSError>
    open fun stopJob(params: StopJobRequest, callback: (err: AWSError, data: StopJobResult) -> Unit = definedExternally): Request<StopJobResult, AWSError>
    open fun stopJob(callback: (err: AWSError, data: StopJobResult) -> Unit = definedExternally): Request<StopJobResult, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateApp(params: UpdateAppRequest, callback: (err: AWSError, data: UpdateAppResult) -> Unit = definedExternally): Request<UpdateAppResult, AWSError>
    open fun updateApp(callback: (err: AWSError, data: UpdateAppResult) -> Unit = definedExternally): Request<UpdateAppResult, AWSError>
    open fun updateBranch(params: UpdateBranchRequest, callback: (err: AWSError, data: UpdateBranchResult) -> Unit = definedExternally): Request<UpdateBranchResult, AWSError>
    open fun updateBranch(callback: (err: AWSError, data: UpdateBranchResult) -> Unit = definedExternally): Request<UpdateBranchResult, AWSError>
    open fun updateDomainAssociation(params: UpdateDomainAssociationRequest, callback: (err: AWSError, data: UpdateDomainAssociationResult) -> Unit = definedExternally): Request<UpdateDomainAssociationResult, AWSError>
    open fun updateDomainAssociation(callback: (err: AWSError, data: UpdateDomainAssociationResult) -> Unit = definedExternally): Request<UpdateDomainAssociationResult, AWSError>
    open fun updateWebhook(params: UpdateWebhookRequest, callback: (err: AWSError, data: UpdateWebhookResult) -> Unit = definedExternally): Request<UpdateWebhookResult, AWSError>
    open fun updateWebhook(callback: (err: AWSError, data: UpdateWebhookResult) -> Unit = definedExternally): Request<UpdateWebhookResult, AWSError>
    interface App {
        var appId: AppId
        var appArn: AppArn
        var name: Name
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description
        var repository: Repository
        var platform: String /* "WEB" | String */
        var createTime: CreateTime
        var updateTime: UpdateTime
        var iamServiceRoleArn: ServiceRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var environmentVariables: EnvironmentVariables
        var defaultDomain: DefaultDomain
        var enableBranchAutoBuild: EnableBranchAutoBuild
        var enableBasicAuth: EnableBasicAuth
        var basicAuthCredentials: BasicAuthCredentials?
            get() = definedExternally
            set(value) = definedExternally
        var customRules: CustomRules?
            get() = definedExternally
            set(value) = definedExternally
        var productionBranch: ProductionBranch?
            get() = definedExternally
            set(value) = definedExternally
        var buildSpec: BuildSpec?
            get() = definedExternally
            set(value) = definedExternally
        var enableAutoBranchCreation: EnableAutoBranchCreation?
            get() = definedExternally
            set(value) = definedExternally
        var autoBranchCreationPatterns: AutoBranchCreationPatterns?
            get() = definedExternally
            set(value) = definedExternally
        var autoBranchCreationConfig: AutoBranchCreationConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Artifact {
        var artifactFileName: ArtifactFileName
        var artifactId: ArtifactId
    }
    interface AutoBranchCreationConfig {
        var stage: String /* "PRODUCTION" | "BETA" | "DEVELOPMENT" | "EXPERIMENTAL" | "PULL_REQUEST" | String */
        var framework: Framework?
            get() = definedExternally
            set(value) = definedExternally
        var enableAutoBuild: EnableAutoBuild?
            get() = definedExternally
            set(value) = definedExternally
        var environmentVariables: EnvironmentVariables?
            get() = definedExternally
            set(value) = definedExternally
        var basicAuthCredentials: BasicAuthCredentials?
            get() = definedExternally
            set(value) = definedExternally
        var enableBasicAuth: EnableBasicAuth?
            get() = definedExternally
            set(value) = definedExternally
        var buildSpec: BuildSpec?
            get() = definedExternally
            set(value) = definedExternally
        var enablePullRequestPreview: EnablePullRequestPreview?
            get() = definedExternally
            set(value) = definedExternally
        var pullRequestEnvironmentName: PullRequestEnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BackendEnvironment {
        var backendEnvironmentArn: BackendEnvironmentArn
        var environmentName: EnvironmentName
        var stackName: StackName?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentArtifacts: DeploymentArtifacts?
            get() = definedExternally
            set(value) = definedExternally
        var createTime: CreateTime
        var updateTime: UpdateTime
    }
    interface Branch {
        var branchArn: BranchArn
        var branchName: BranchName
        var description: Description
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var stage: String /* "PRODUCTION" | "BETA" | "DEVELOPMENT" | "EXPERIMENTAL" | "PULL_REQUEST" | String */
        var displayName: DisplayName
        var enableNotification: EnableNotification
        var createTime: CreateTime
        var updateTime: UpdateTime
        var environmentVariables: EnvironmentVariables
        var enableAutoBuild: EnableAutoBuild
        var customDomains: CustomDomains
        var framework: Framework
        var activeJobId: ActiveJobId
        var totalNumberOfJobs: TotalNumberOfJobs
        var enableBasicAuth: EnableBasicAuth
        var thumbnailUrl: ThumbnailUrl?
            get() = definedExternally
            set(value) = definedExternally
        var basicAuthCredentials: BasicAuthCredentials?
            get() = definedExternally
            set(value) = definedExternally
        var buildSpec: BuildSpec?
            get() = definedExternally
            set(value) = definedExternally
        var ttl: TTL
        var associatedResources: AssociatedResources?
            get() = definedExternally
            set(value) = definedExternally
        var enablePullRequestPreview: EnablePullRequestPreview
        var pullRequestEnvironmentName: PullRequestEnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var destinationBranch: BranchName?
            get() = definedExternally
            set(value) = definedExternally
        var sourceBranch: BranchName?
            get() = definedExternally
            set(value) = definedExternally
        var backendEnvironmentArn: BackendEnvironmentArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAppRequest {
        var name: Name
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var repository: Repository?
            get() = definedExternally
            set(value) = definedExternally
        var platform: String /* "WEB" | String */
        var iamServiceRoleArn: ServiceRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var oauthToken: OauthToken?
            get() = definedExternally
            set(value) = definedExternally
        var accessToken: AccessToken?
            get() = definedExternally
            set(value) = definedExternally
        var environmentVariables: EnvironmentVariables?
            get() = definedExternally
            set(value) = definedExternally
        var enableBranchAutoBuild: EnableBranchAutoBuild?
            get() = definedExternally
            set(value) = definedExternally
        var enableBasicAuth: EnableBasicAuth?
            get() = definedExternally
            set(value) = definedExternally
        var basicAuthCredentials: BasicAuthCredentials?
            get() = definedExternally
            set(value) = definedExternally
        var customRules: CustomRules?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var buildSpec: BuildSpec?
            get() = definedExternally
            set(value) = definedExternally
        var enableAutoBranchCreation: EnableAutoBranchCreation?
            get() = definedExternally
            set(value) = definedExternally
        var autoBranchCreationPatterns: AutoBranchCreationPatterns?
            get() = definedExternally
            set(value) = definedExternally
        var autoBranchCreationConfig: AutoBranchCreationConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAppResult {
        var app: App
    }
    interface CreateBackendEnvironmentRequest {
        var appId: AppId
        var environmentName: EnvironmentName
        var stackName: StackName?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentArtifacts: DeploymentArtifacts?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBackendEnvironmentResult {
        var backendEnvironment: BackendEnvironment
    }
    interface CreateBranchRequest {
        var appId: AppId
        var branchName: BranchName
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var stage: String /* "PRODUCTION" | "BETA" | "DEVELOPMENT" | "EXPERIMENTAL" | "PULL_REQUEST" | String */
        var framework: Framework?
            get() = definedExternally
            set(value) = definedExternally
        var enableNotification: EnableNotification?
            get() = definedExternally
            set(value) = definedExternally
        var enableAutoBuild: EnableAutoBuild?
            get() = definedExternally
            set(value) = definedExternally
        var environmentVariables: EnvironmentVariables?
            get() = definedExternally
            set(value) = definedExternally
        var basicAuthCredentials: BasicAuthCredentials?
            get() = definedExternally
            set(value) = definedExternally
        var enableBasicAuth: EnableBasicAuth?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var buildSpec: BuildSpec?
            get() = definedExternally
            set(value) = definedExternally
        var ttl: TTL?
            get() = definedExternally
            set(value) = definedExternally
        var displayName: DisplayName?
            get() = definedExternally
            set(value) = definedExternally
        var enablePullRequestPreview: EnablePullRequestPreview?
            get() = definedExternally
            set(value) = definedExternally
        var pullRequestEnvironmentName: PullRequestEnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var backendEnvironmentArn: BackendEnvironmentArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBranchResult {
        var branch: Branch
    }
    interface CreateDeploymentRequest {
        var appId: AppId
        var branchName: BranchName
        var fileMap: FileMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeploymentResult {
        var jobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var fileUploadUrls: FileUploadUrls
        var zipUploadUrl: UploadUrl
    }
    interface CreateDomainAssociationRequest {
        var appId: AppId
        var domainName: DomainName
        var enableAutoSubDomain: EnableAutoSubDomain?
            get() = definedExternally
            set(value) = definedExternally
        var subDomainSettings: SubDomainSettings
    }
    interface CreateDomainAssociationResult {
        var domainAssociation: DomainAssociation
    }
    interface CreateWebhookRequest {
        var appId: AppId
        var branchName: BranchName
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateWebhookResult {
        var webhook: Webhook
    }
    interface CustomRule {
        var source: Source
        var target: Target
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var condition: Condition?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAppRequest {
        var appId: AppId
    }
    interface DeleteAppResult {
        var app: App
    }
    interface DeleteBackendEnvironmentRequest {
        var appId: AppId
        var environmentName: EnvironmentName
    }
    interface DeleteBackendEnvironmentResult {
        var backendEnvironment: BackendEnvironment
    }
    interface DeleteBranchRequest {
        var appId: AppId
        var branchName: BranchName
    }
    interface DeleteBranchResult {
        var branch: Branch
    }
    interface DeleteDomainAssociationRequest {
        var appId: AppId
        var domainName: DomainName
    }
    interface DeleteDomainAssociationResult {
        var domainAssociation: DomainAssociation
    }
    interface DeleteJobRequest {
        var appId: AppId
        var branchName: BranchName
        var jobId: JobId
    }
    interface DeleteJobResult {
        var jobSummary: JobSummary
    }
    interface DeleteWebhookRequest {
        var webhookId: WebhookId
    }
    interface DeleteWebhookResult {
        var webhook: Webhook
    }
    interface DomainAssociation {
        var domainAssociationArn: DomainAssociationArn
        var domainName: DomainName
        var enableAutoSubDomain: EnableAutoSubDomain
        var domainStatus: String /* "PENDING_VERIFICATION" | "IN_PROGRESS" | "AVAILABLE" | "PENDING_DEPLOYMENT" | "FAILED" | "CREATING" | "REQUESTING_CERTIFICATE" | "UPDATING" | String */
        var statusReason: StatusReason
        var certificateVerificationDNSRecord: CertificateVerificationDNSRecord?
            get() = definedExternally
            set(value) = definedExternally
        var subDomains: SubDomains
    }
    interface EnvironmentVariables {
        @nativeGetter
        operator fun get(key: String): EnvValue?
        @nativeSetter
        operator fun set(key: String, value: EnvValue)
    }
    interface FileMap {
        @nativeGetter
        operator fun get(key: String): MD5Hash?
        @nativeSetter
        operator fun set(key: String, value: MD5Hash)
    }
    interface FileUploadUrls {
        @nativeGetter
        operator fun get(key: String): UploadUrl?
        @nativeSetter
        operator fun set(key: String, value: UploadUrl)
    }
    interface GenerateAccessLogsRequest {
        var startTime: StartTime?
            get() = definedExternally
            set(value) = definedExternally
        var endTime: EndTime?
            get() = definedExternally
            set(value) = definedExternally
        var domainName: DomainName
        var appId: AppId
    }
    interface GenerateAccessLogsResult {
        var logUrl: LogUrl?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAppRequest {
        var appId: AppId
    }
    interface GetAppResult {
        var app: App
    }
    interface GetArtifactUrlRequest {
        var artifactId: ArtifactId
    }
    interface GetArtifactUrlResult {
        var artifactId: ArtifactId
        var artifactUrl: ArtifactUrl
    }
    interface GetBackendEnvironmentRequest {
        var appId: AppId
        var environmentName: EnvironmentName
    }
    interface GetBackendEnvironmentResult {
        var backendEnvironment: BackendEnvironment
    }
    interface GetBranchRequest {
        var appId: AppId
        var branchName: BranchName
    }
    interface GetBranchResult {
        var branch: Branch
    }
    interface GetDomainAssociationRequest {
        var appId: AppId
        var domainName: DomainName
    }
    interface GetDomainAssociationResult {
        var domainAssociation: DomainAssociation
    }
    interface GetJobRequest {
        var appId: AppId
        var branchName: BranchName
        var jobId: JobId
    }
    interface GetJobResult {
        var job: Job
    }
    interface GetWebhookRequest {
        var webhookId: WebhookId
    }
    interface GetWebhookResult {
        var webhook: Webhook
    }
    interface Job {
        var summary: JobSummary
        var steps: Steps
    }
    interface JobSummary {
        var jobArn: JobArn
        var jobId: JobId
        var commitId: CommitId
        var commitMessage: CommitMessage
        var commitTime: CommitTime
        var startTime: StartTime
        var status: String /* "PENDING" | "PROVISIONING" | "RUNNING" | "FAILED" | "SUCCEED" | "CANCELLING" | "CANCELLED" | String */
        var endTime: EndTime?
            get() = definedExternally
            set(value) = definedExternally
        var jobType: String /* "RELEASE" | "RETRY" | "MANUAL" | "WEB_HOOK" | String */
    }
    interface ListAppsRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAppsResult {
        var apps: Apps
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListArtifactsRequest {
        var appId: AppId
        var branchName: BranchName
        var jobId: JobId
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListArtifactsResult {
        var artifacts: Artifacts
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBackendEnvironmentsRequest {
        var appId: AppId
        var environmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBackendEnvironmentsResult {
        var backendEnvironments: BackendEnvironments
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBranchesRequest {
        var appId: AppId
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBranchesResult {
        var branches: Branches
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDomainAssociationsRequest {
        var appId: AppId
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDomainAssociationsResult {
        var domainAssociations: DomainAssociations
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobsRequest {
        var appId: AppId
        var branchName: BranchName
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobsResult {
        var jobSummaries: JobSummaries
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var resourceArn: ResourceArn
    }
    interface ListTagsForResourceResponse {
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListWebhooksRequest {
        var appId: AppId
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListWebhooksResult {
        var webhooks: Webhooks
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProductionBranch {
        var lastDeployTime: LastDeployTime?
            get() = definedExternally
            set(value) = definedExternally
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var thumbnailUrl: ThumbnailUrl?
            get() = definedExternally
            set(value) = definedExternally
        var branchName: BranchName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Screenshots {
        @nativeGetter
        operator fun get(key: String): ThumbnailUrl?
        @nativeSetter
        operator fun set(key: String, value: ThumbnailUrl)
    }
    interface StartDeploymentRequest {
        var appId: AppId
        var branchName: BranchName
        var jobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var sourceUrl: SourceUrl?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartDeploymentResult {
        var jobSummary: JobSummary
    }
    interface StartJobRequest {
        var appId: AppId
        var branchName: BranchName
        var jobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var jobType: String /* "RELEASE" | "RETRY" | "MANUAL" | "WEB_HOOK" | String */
        var jobReason: JobReason?
            get() = definedExternally
            set(value) = definedExternally
        var commitId: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var commitMessage: CommitMessage?
            get() = definedExternally
            set(value) = definedExternally
        var commitTime: CommitTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartJobResult {
        var jobSummary: JobSummary
    }
    interface Step {
        var stepName: StepName
        var startTime: StartTime
        var status: String /* "PENDING" | "PROVISIONING" | "RUNNING" | "FAILED" | "SUCCEED" | "CANCELLING" | "CANCELLED" | String */
        var endTime: EndTime
        var logUrl: LogUrl?
            get() = definedExternally
            set(value) = definedExternally
        var artifactsUrl: ArtifactsUrl?
            get() = definedExternally
            set(value) = definedExternally
        var testArtifactsUrl: TestArtifactsUrl?
            get() = definedExternally
            set(value) = definedExternally
        var testConfigUrl: TestConfigUrl?
            get() = definedExternally
            set(value) = definedExternally
        var screenshots: Screenshots?
            get() = definedExternally
            set(value) = definedExternally
        var statusReason: StatusReason?
            get() = definedExternally
            set(value) = definedExternally
        var context: Context?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopJobRequest {
        var appId: AppId
        var branchName: BranchName
        var jobId: JobId
    }
    interface StopJobResult {
        var jobSummary: JobSummary
    }
    interface SubDomain {
        var subDomainSetting: SubDomainSetting
        var verified: Verified
        var dnsRecord: DNSRecord
    }
    interface SubDomainSetting {
        var prefix: DomainPrefix
        var branchName: BranchName
    }
    interface TagMap {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface TagResourceRequest {
        var resourceArn: ResourceArn
        var tags: TagMap
    }
    interface TagResourceResponse
    interface UntagResourceRequest {
        var resourceArn: ResourceArn
        var tagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateAppRequest {
        var appId: AppId
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var platform: String /* "WEB" | String */
        var iamServiceRoleArn: ServiceRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var environmentVariables: EnvironmentVariables?
            get() = definedExternally
            set(value) = definedExternally
        var enableBranchAutoBuild: EnableAutoBuild?
            get() = definedExternally
            set(value) = definedExternally
        var enableBasicAuth: EnableBasicAuth?
            get() = definedExternally
            set(value) = definedExternally
        var basicAuthCredentials: BasicAuthCredentials?
            get() = definedExternally
            set(value) = definedExternally
        var customRules: CustomRules?
            get() = definedExternally
            set(value) = definedExternally
        var buildSpec: BuildSpec?
            get() = definedExternally
            set(value) = definedExternally
        var enableAutoBranchCreation: EnableAutoBranchCreation?
            get() = definedExternally
            set(value) = definedExternally
        var autoBranchCreationPatterns: AutoBranchCreationPatterns?
            get() = definedExternally
            set(value) = definedExternally
        var autoBranchCreationConfig: AutoBranchCreationConfig?
            get() = definedExternally
            set(value) = definedExternally
        var repository: Repository?
            get() = definedExternally
            set(value) = definedExternally
        var oauthToken: OauthToken?
            get() = definedExternally
            set(value) = definedExternally
        var accessToken: AccessToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateAppResult {
        var app: App
    }
    interface UpdateBranchRequest {
        var appId: AppId
        var branchName: BranchName
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var framework: Framework?
            get() = definedExternally
            set(value) = definedExternally
        var stage: String /* "PRODUCTION" | "BETA" | "DEVELOPMENT" | "EXPERIMENTAL" | "PULL_REQUEST" | String */
        var enableNotification: EnableNotification?
            get() = definedExternally
            set(value) = definedExternally
        var enableAutoBuild: EnableAutoBuild?
            get() = definedExternally
            set(value) = definedExternally
        var environmentVariables: EnvironmentVariables?
            get() = definedExternally
            set(value) = definedExternally
        var basicAuthCredentials: BasicAuthCredentials?
            get() = definedExternally
            set(value) = definedExternally
        var enableBasicAuth: EnableBasicAuth?
            get() = definedExternally
            set(value) = definedExternally
        var buildSpec: BuildSpec?
            get() = definedExternally
            set(value) = definedExternally
        var ttl: TTL?
            get() = definedExternally
            set(value) = definedExternally
        var displayName: DisplayName?
            get() = definedExternally
            set(value) = definedExternally
        var enablePullRequestPreview: EnablePullRequestPreview?
            get() = definedExternally
            set(value) = definedExternally
        var pullRequestEnvironmentName: PullRequestEnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var backendEnvironmentArn: BackendEnvironmentArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateBranchResult {
        var branch: Branch
    }
    interface UpdateDomainAssociationRequest {
        var appId: AppId
        var domainName: DomainName
        var enableAutoSubDomain: EnableAutoSubDomain?
            get() = definedExternally
            set(value) = definedExternally
        var subDomainSettings: SubDomainSettings
    }
    interface UpdateDomainAssociationResult {
        var domainAssociation: DomainAssociation
    }
    interface UpdateWebhookRequest {
        var webhookId: WebhookId
        var branchName: BranchName?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateWebhookResult {
        var webhook: Webhook
    }
    interface Webhook {
        var webhookArn: WebhookArn
        var webhookId: WebhookId
        var webhookUrl: WebhookUrl
        var branchName: BranchName
        var description: Description
        var createTime: CreateTime
        var updateTime: UpdateTime
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-07-25" | "latest" | String */
    }
}