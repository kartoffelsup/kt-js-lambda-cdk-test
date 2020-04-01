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
import Mobile.BundleDetails
import Mobile.ProjectSummary
import Mobile.Resource
import Mobile.CreateProjectRequest
import Mobile.CreateProjectResult
import Mobile.DeleteProjectRequest
import Mobile.DeleteProjectResult
import Mobile.DescribeBundleRequest
import Mobile.DescribeBundleResult
import Mobile.DescribeProjectRequest
import Mobile.DescribeProjectResult
import Mobile.ExportBundleRequest
import Mobile.ExportBundleResult
import Mobile.ExportProjectRequest
import Mobile.ExportProjectResult
import Mobile.ListBundlesRequest
import Mobile.ListBundlesResult
import Mobile.ListProjectsRequest
import Mobile.ListProjectsResult
import Mobile.UpdateProjectRequest
import Mobile.UpdateProjectResult
import Mobile.ProjectDetails
import Mobile.Attributes

typealias AttributeKey = String

typealias AttributeValue = String

typealias Boolean = Boolean

typealias BundleDescription = String

typealias BundleId = String

typealias BundleList = Array<BundleDetails>

typealias BundleTitle = String

typealias BundleVersion = String

typealias ConsoleUrl = String

typealias _Date = Date

typealias DownloadUrl = String

typealias Feature = String

typealias IconUrl = String

typealias MaxResults = Number

typealias NextToken = String

typealias Platforms = Array<String /* "OSX" | "WINDOWS" | "LINUX" | "OBJC" | "SWIFT" | "ANDROID" | "JAVASCRIPT" | String */>

typealias ProjectId = String

typealias ProjectName = String

typealias ProjectRegion = String

typealias ProjectSummaries = Array<ProjectSummary>

typealias ResourceArn = String

typealias ResourceName = String

typealias ResourceType = String

typealias Resources = Array<Resource>

typealias ShareUrl = String

typealias SnapshotId = String

@JsModule("aws-sdk")
external open class Mobile(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Mobile.Types.ClientConfiguration */
    open fun createProject(params: CreateProjectRequest, callback: (err: AWSError, data: CreateProjectResult) -> Unit = definedExternally): Request<CreateProjectResult, AWSError>
    open fun createProject(callback: (err: AWSError, data: CreateProjectResult) -> Unit = definedExternally): Request<CreateProjectResult, AWSError>
    open fun deleteProject(params: DeleteProjectRequest, callback: (err: AWSError, data: DeleteProjectResult) -> Unit = definedExternally): Request<DeleteProjectResult, AWSError>
    open fun deleteProject(callback: (err: AWSError, data: DeleteProjectResult) -> Unit = definedExternally): Request<DeleteProjectResult, AWSError>
    open fun describeBundle(params: DescribeBundleRequest, callback: (err: AWSError, data: DescribeBundleResult) -> Unit = definedExternally): Request<DescribeBundleResult, AWSError>
    open fun describeBundle(callback: (err: AWSError, data: DescribeBundleResult) -> Unit = definedExternally): Request<DescribeBundleResult, AWSError>
    open fun describeProject(params: DescribeProjectRequest, callback: (err: AWSError, data: DescribeProjectResult) -> Unit = definedExternally): Request<DescribeProjectResult, AWSError>
    open fun describeProject(callback: (err: AWSError, data: DescribeProjectResult) -> Unit = definedExternally): Request<DescribeProjectResult, AWSError>
    open fun exportBundle(params: ExportBundleRequest, callback: (err: AWSError, data: ExportBundleResult) -> Unit = definedExternally): Request<ExportBundleResult, AWSError>
    open fun exportBundle(callback: (err: AWSError, data: ExportBundleResult) -> Unit = definedExternally): Request<ExportBundleResult, AWSError>
    open fun exportProject(params: ExportProjectRequest, callback: (err: AWSError, data: ExportProjectResult) -> Unit = definedExternally): Request<ExportProjectResult, AWSError>
    open fun exportProject(callback: (err: AWSError, data: ExportProjectResult) -> Unit = definedExternally): Request<ExportProjectResult, AWSError>
    open fun listBundles(params: ListBundlesRequest, callback: (err: AWSError, data: ListBundlesResult) -> Unit = definedExternally): Request<ListBundlesResult, AWSError>
    open fun listBundles(callback: (err: AWSError, data: ListBundlesResult) -> Unit = definedExternally): Request<ListBundlesResult, AWSError>
    open fun listProjects(params: ListProjectsRequest, callback: (err: AWSError, data: ListProjectsResult) -> Unit = definedExternally): Request<ListProjectsResult, AWSError>
    open fun listProjects(callback: (err: AWSError, data: ListProjectsResult) -> Unit = definedExternally): Request<ListProjectsResult, AWSError>
    open fun updateProject(params: UpdateProjectRequest, callback: (err: AWSError, data: UpdateProjectResult) -> Unit = definedExternally): Request<UpdateProjectResult, AWSError>
    open fun updateProject(callback: (err: AWSError, data: UpdateProjectResult) -> Unit = definedExternally): Request<UpdateProjectResult, AWSError>
    interface Attributes {
        @nativeGetter
        operator fun get(key: String): AttributeValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeValue)
    }
    interface BundleDetails {
        var bundleId: BundleId?
            get() = definedExternally
            set(value) = definedExternally
        var title: BundleTitle?
            get() = definedExternally
            set(value) = definedExternally
        var version: BundleVersion?
            get() = definedExternally
            set(value) = definedExternally
        var description: BundleDescription?
            get() = definedExternally
            set(value) = definedExternally
        var iconUrl: IconUrl?
            get() = definedExternally
            set(value) = definedExternally
        var availablePlatforms: Platforms?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProjectRequest {
        var name: ProjectName?
            get() = definedExternally
            set(value) = definedExternally
        var region: ProjectRegion?
            get() = definedExternally
            set(value) = definedExternally
        var contents: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var snapshotId: SnapshotId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProjectResult {
        var details: ProjectDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteProjectRequest {
        var projectId: ProjectId
    }
    interface DeleteProjectResult {
        var deletedResources: Resources?
            get() = definedExternally
            set(value) = definedExternally
        var orphanedResources: Resources?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeBundleRequest {
        var bundleId: BundleId
    }
    interface DescribeBundleResult {
        var details: BundleDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProjectRequest {
        var projectId: ProjectId
        var syncFromResources: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProjectResult {
        var details: ProjectDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExportBundleRequest {
        var bundleId: BundleId
        var projectId: ProjectId?
            get() = definedExternally
            set(value) = definedExternally
        var platform: String /* "OSX" | "WINDOWS" | "LINUX" | "OBJC" | "SWIFT" | "ANDROID" | "JAVASCRIPT" | String */
    }
    interface ExportBundleResult {
        var downloadUrl: DownloadUrl?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExportProjectRequest {
        var projectId: ProjectId
    }
    interface ExportProjectResult {
        var downloadUrl: DownloadUrl?
            get() = definedExternally
            set(value) = definedExternally
        var shareUrl: ShareUrl?
            get() = definedExternally
            set(value) = definedExternally
        var snapshotId: SnapshotId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBundlesRequest {
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBundlesResult {
        var bundleList: BundleList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProjectsRequest {
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProjectsResult {
        var projects: ProjectSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProjectDetails {
        var name: ProjectName?
            get() = definedExternally
            set(value) = definedExternally
        var projectId: ProjectId?
            get() = definedExternally
            set(value) = definedExternally
        var region: ProjectRegion?
            get() = definedExternally
            set(value) = definedExternally
        var state: String /* "NORMAL" | "SYNCING" | "IMPORTING" | String */
        var createdDate: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDate: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var consoleUrl: ConsoleUrl?
            get() = definedExternally
            set(value) = definedExternally
        var resources: Resources?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProjectSummary {
        var name: ProjectName?
            get() = definedExternally
            set(value) = definedExternally
        var projectId: ProjectId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Resource {
        var type: ResourceType?
            get() = definedExternally
            set(value) = definedExternally
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var arn: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
        var feature: Feature?
            get() = definedExternally
            set(value) = definedExternally
        var attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateProjectRequest {
        var contents: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var projectId: ProjectId
    }
    interface UpdateProjectResult {
        var details: ProjectDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-07-01" | "latest" | String */
    }
}