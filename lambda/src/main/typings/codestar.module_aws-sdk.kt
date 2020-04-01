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
import CodeStar.ProjectSummary
import CodeStar.Resource
import CodeStar.Code
import CodeStar.TeamMember
import CodeStar.UserProfileSummary
import CodeStar.AssociateTeamMemberRequest
import CodeStar.AssociateTeamMemberResult
import CodeStar.CreateProjectRequest
import CodeStar.CreateProjectResult
import CodeStar.CreateUserProfileRequest
import CodeStar.CreateUserProfileResult
import CodeStar.DeleteProjectRequest
import CodeStar.DeleteProjectResult
import CodeStar.DeleteUserProfileRequest
import CodeStar.DeleteUserProfileResult
import CodeStar.DescribeProjectRequest
import CodeStar.DescribeProjectResult
import CodeStar.DescribeUserProfileRequest
import CodeStar.DescribeUserProfileResult
import CodeStar.DisassociateTeamMemberRequest
import CodeStar.DisassociateTeamMemberResult
import CodeStar.ListProjectsRequest
import CodeStar.ListProjectsResult
import CodeStar.ListResourcesRequest
import CodeStar.ListResourcesResult
import CodeStar.ListTagsForProjectRequest
import CodeStar.ListTagsForProjectResult
import CodeStar.ListTeamMembersRequest
import CodeStar.ListTeamMembersResult
import CodeStar.ListUserProfilesRequest
import CodeStar.ListUserProfilesResult
import CodeStar.TagProjectRequest
import CodeStar.TagProjectResult
import CodeStar.UntagProjectRequest
import CodeStar.UntagProjectResult
import CodeStar.UpdateProjectRequest
import CodeStar.UpdateProjectResult
import CodeStar.UpdateTeamMemberRequest
import CodeStar.UpdateTeamMemberResult
import CodeStar.UpdateUserProfileRequest
import CodeStar.UpdateUserProfileResult
import CodeStar.CodeSource
import CodeStar.CodeDestination
import CodeStar.CodeCommitCodeDestination
import CodeStar.GitHubCodeDestination
import CodeStar.S3Location
import CodeStar.Toolchain
import CodeStar.Tags
import CodeStar.ProjectStatus
import CodeStar.ToolchainSource
import CodeStar.TemplateParameterMap

typealias BucketKey = String

typealias BucketName = String

typealias ClientRequestToken = String

typealias CreatedTimestamp = Date

typealias DeleteStack = Boolean

typealias Email = String

typealias GitHubPersonalToken = String

typealias LastModifiedTimestamp = Date

typealias MaxResults = Number

typealias PaginationToken = String

typealias ProjectArn = String

typealias ProjectDescription = String

typealias ProjectId = String

typealias ProjectName = String

typealias ProjectTemplateId = String

typealias ProjectsList = Array<ProjectSummary>

typealias Reason = String

typealias RemoteAccessAllowed = Boolean

typealias RepositoryDescription = String

typealias RepositoryEnableIssues = Boolean

typealias RepositoryIsPrivate = Boolean

typealias RepositoryName = String

typealias RepositoryOwner = String

typealias RepositoryType = String

typealias ResourceId = String

typealias ResourcesResult = Array<Resource>

typealias Role = String

typealias RoleArn = String

typealias SourceCode = Array<Code>

typealias SshPublicKey = String

typealias StackId = String

typealias State = String

typealias TagKey = String

typealias TagKeys = Array<TagKey>

typealias TagValue = String

typealias TeamMemberResult = Array<TeamMember>

typealias TemplateParameterKey = String

typealias TemplateParameterValue = String

typealias UserArn = String

typealias UserProfileDisplayName = String

typealias UserProfilesList = Array<UserProfileSummary>

@JsModule("aws-sdk")
external open class CodeStar(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CodeStar.Types.ClientConfiguration */
    open fun associateTeamMember(params: AssociateTeamMemberRequest, callback: (err: AWSError, data: AssociateTeamMemberResult) -> Unit = definedExternally): Request<AssociateTeamMemberResult, AWSError>
    open fun associateTeamMember(callback: (err: AWSError, data: AssociateTeamMemberResult) -> Unit = definedExternally): Request<AssociateTeamMemberResult, AWSError>
    open fun createProject(params: CreateProjectRequest, callback: (err: AWSError, data: CreateProjectResult) -> Unit = definedExternally): Request<CreateProjectResult, AWSError>
    open fun createProject(callback: (err: AWSError, data: CreateProjectResult) -> Unit = definedExternally): Request<CreateProjectResult, AWSError>
    open fun createUserProfile(params: CreateUserProfileRequest, callback: (err: AWSError, data: CreateUserProfileResult) -> Unit = definedExternally): Request<CreateUserProfileResult, AWSError>
    open fun createUserProfile(callback: (err: AWSError, data: CreateUserProfileResult) -> Unit = definedExternally): Request<CreateUserProfileResult, AWSError>
    open fun deleteProject(params: DeleteProjectRequest, callback: (err: AWSError, data: DeleteProjectResult) -> Unit = definedExternally): Request<DeleteProjectResult, AWSError>
    open fun deleteProject(callback: (err: AWSError, data: DeleteProjectResult) -> Unit = definedExternally): Request<DeleteProjectResult, AWSError>
    open fun deleteUserProfile(params: DeleteUserProfileRequest, callback: (err: AWSError, data: DeleteUserProfileResult) -> Unit = definedExternally): Request<DeleteUserProfileResult, AWSError>
    open fun deleteUserProfile(callback: (err: AWSError, data: DeleteUserProfileResult) -> Unit = definedExternally): Request<DeleteUserProfileResult, AWSError>
    open fun describeProject(params: DescribeProjectRequest, callback: (err: AWSError, data: DescribeProjectResult) -> Unit = definedExternally): Request<DescribeProjectResult, AWSError>
    open fun describeProject(callback: (err: AWSError, data: DescribeProjectResult) -> Unit = definedExternally): Request<DescribeProjectResult, AWSError>
    open fun describeUserProfile(params: DescribeUserProfileRequest, callback: (err: AWSError, data: DescribeUserProfileResult) -> Unit = definedExternally): Request<DescribeUserProfileResult, AWSError>
    open fun describeUserProfile(callback: (err: AWSError, data: DescribeUserProfileResult) -> Unit = definedExternally): Request<DescribeUserProfileResult, AWSError>
    open fun disassociateTeamMember(params: DisassociateTeamMemberRequest, callback: (err: AWSError, data: DisassociateTeamMemberResult) -> Unit = definedExternally): Request<DisassociateTeamMemberResult, AWSError>
    open fun disassociateTeamMember(callback: (err: AWSError, data: DisassociateTeamMemberResult) -> Unit = definedExternally): Request<DisassociateTeamMemberResult, AWSError>
    open fun listProjects(params: ListProjectsRequest, callback: (err: AWSError, data: ListProjectsResult) -> Unit = definedExternally): Request<ListProjectsResult, AWSError>
    open fun listProjects(callback: (err: AWSError, data: ListProjectsResult) -> Unit = definedExternally): Request<ListProjectsResult, AWSError>
    open fun listResources(params: ListResourcesRequest, callback: (err: AWSError, data: ListResourcesResult) -> Unit = definedExternally): Request<ListResourcesResult, AWSError>
    open fun listResources(callback: (err: AWSError, data: ListResourcesResult) -> Unit = definedExternally): Request<ListResourcesResult, AWSError>
    open fun listTagsForProject(params: ListTagsForProjectRequest, callback: (err: AWSError, data: ListTagsForProjectResult) -> Unit = definedExternally): Request<ListTagsForProjectResult, AWSError>
    open fun listTagsForProject(callback: (err: AWSError, data: ListTagsForProjectResult) -> Unit = definedExternally): Request<ListTagsForProjectResult, AWSError>
    open fun listTeamMembers(params: ListTeamMembersRequest, callback: (err: AWSError, data: ListTeamMembersResult) -> Unit = definedExternally): Request<ListTeamMembersResult, AWSError>
    open fun listTeamMembers(callback: (err: AWSError, data: ListTeamMembersResult) -> Unit = definedExternally): Request<ListTeamMembersResult, AWSError>
    open fun listUserProfiles(params: ListUserProfilesRequest, callback: (err: AWSError, data: ListUserProfilesResult) -> Unit = definedExternally): Request<ListUserProfilesResult, AWSError>
    open fun listUserProfiles(callback: (err: AWSError, data: ListUserProfilesResult) -> Unit = definedExternally): Request<ListUserProfilesResult, AWSError>
    open fun tagProject(params: TagProjectRequest, callback: (err: AWSError, data: TagProjectResult) -> Unit = definedExternally): Request<TagProjectResult, AWSError>
    open fun tagProject(callback: (err: AWSError, data: TagProjectResult) -> Unit = definedExternally): Request<TagProjectResult, AWSError>
    open fun untagProject(params: UntagProjectRequest, callback: (err: AWSError, data: UntagProjectResult) -> Unit = definedExternally): Request<UntagProjectResult, AWSError>
    open fun untagProject(callback: (err: AWSError, data: UntagProjectResult) -> Unit = definedExternally): Request<UntagProjectResult, AWSError>
    open fun updateProject(params: UpdateProjectRequest, callback: (err: AWSError, data: UpdateProjectResult) -> Unit = definedExternally): Request<UpdateProjectResult, AWSError>
    open fun updateProject(callback: (err: AWSError, data: UpdateProjectResult) -> Unit = definedExternally): Request<UpdateProjectResult, AWSError>
    open fun updateTeamMember(params: UpdateTeamMemberRequest, callback: (err: AWSError, data: UpdateTeamMemberResult) -> Unit = definedExternally): Request<UpdateTeamMemberResult, AWSError>
    open fun updateTeamMember(callback: (err: AWSError, data: UpdateTeamMemberResult) -> Unit = definedExternally): Request<UpdateTeamMemberResult, AWSError>
    open fun updateUserProfile(params: UpdateUserProfileRequest, callback: (err: AWSError, data: UpdateUserProfileResult) -> Unit = definedExternally): Request<UpdateUserProfileResult, AWSError>
    open fun updateUserProfile(callback: (err: AWSError, data: UpdateUserProfileResult) -> Unit = definedExternally): Request<UpdateUserProfileResult, AWSError>
    interface AssociateTeamMemberRequest {
        var projectId: ProjectId
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var userArn: UserArn
        var projectRole: Role
        var remoteAccessAllowed: RemoteAccessAllowed?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateTeamMemberResult {
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Code {
        var source: CodeSource
        var destination: CodeDestination
    }
    interface CodeCommitCodeDestination {
        var name: RepositoryName
    }
    interface CodeDestination {
        var codeCommit: CodeCommitCodeDestination?
            get() = definedExternally
            set(value) = definedExternally
        var gitHub: GitHubCodeDestination?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CodeSource {
        var s3: S3Location
    }
    interface CreateProjectRequest {
        var name: ProjectName
        var id: ProjectId
        var description: ProjectDescription?
            get() = definedExternally
            set(value) = definedExternally
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var sourceCode: SourceCode?
            get() = definedExternally
            set(value) = definedExternally
        var toolchain: Toolchain?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProjectResult {
        var id: ProjectId
        var arn: ProjectArn
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var projectTemplateId: ProjectTemplateId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUserProfileRequest {
        var userArn: UserArn
        var displayName: UserProfileDisplayName
        var emailAddress: Email
        var sshPublicKey: SshPublicKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUserProfileResult {
        var userArn: UserArn
        var displayName: UserProfileDisplayName?
            get() = definedExternally
            set(value) = definedExternally
        var emailAddress: Email?
            get() = definedExternally
            set(value) = definedExternally
        var sshPublicKey: SshPublicKey?
            get() = definedExternally
            set(value) = definedExternally
        var createdTimestamp: CreatedTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastModifiedTimestamp: LastModifiedTimestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteProjectRequest {
        var id: ProjectId
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var deleteStack: DeleteStack?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteProjectResult {
        var stackId: StackId?
            get() = definedExternally
            set(value) = definedExternally
        var projectArn: ProjectArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteUserProfileRequest {
        var userArn: UserArn
    }
    interface DeleteUserProfileResult {
        var userArn: UserArn
    }
    interface DescribeProjectRequest {
        var id: ProjectId
    }
    interface DescribeProjectResult {
        var name: ProjectName?
            get() = definedExternally
            set(value) = definedExternally
        var id: ProjectId?
            get() = definedExternally
            set(value) = definedExternally
        var arn: ProjectArn?
            get() = definedExternally
            set(value) = definedExternally
        var description: ProjectDescription?
            get() = definedExternally
            set(value) = definedExternally
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var createdTimeStamp: CreatedTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var stackId: StackId?
            get() = definedExternally
            set(value) = definedExternally
        var projectTemplateId: ProjectTemplateId?
            get() = definedExternally
            set(value) = definedExternally
        var status: ProjectStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUserProfileRequest {
        var userArn: UserArn
    }
    interface DescribeUserProfileResult {
        var userArn: UserArn
        var displayName: UserProfileDisplayName?
            get() = definedExternally
            set(value) = definedExternally
        var emailAddress: Email?
            get() = definedExternally
            set(value) = definedExternally
        var sshPublicKey: SshPublicKey?
            get() = definedExternally
            set(value) = definedExternally
        var createdTimestamp: CreatedTimestamp
        var lastModifiedTimestamp: LastModifiedTimestamp
    }
    interface DisassociateTeamMemberRequest {
        var projectId: ProjectId
        var userArn: UserArn
    }
    interface DisassociateTeamMemberResult
    interface GitHubCodeDestination {
        var name: RepositoryName
        var description: RepositoryDescription?
            get() = definedExternally
            set(value) = definedExternally
        var type: RepositoryType
        var owner: RepositoryOwner
        var privateRepository: RepositoryIsPrivate
        var issuesEnabled: RepositoryEnableIssues
        var token: GitHubPersonalToken
    }
    interface ListProjectsRequest {
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProjectsResult {
        var projects: ProjectsList
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourcesRequest {
        var projectId: ProjectId
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourcesResult {
        var resources: ResourcesResult?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForProjectRequest {
        var id: ProjectId
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForProjectResult {
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTeamMembersRequest {
        var projectId: ProjectId
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTeamMembersResult {
        var teamMembers: TeamMemberResult
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUserProfilesRequest {
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUserProfilesResult {
        var userProfiles: UserProfilesList
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProjectStatus {
        var state: State
        var reason: Reason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProjectSummary {
        var projectId: ProjectId?
            get() = definedExternally
            set(value) = definedExternally
        var projectArn: ProjectArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Resource {
        var id: ResourceId
    }
    interface S3Location {
        var bucketName: BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var bucketKey: BucketKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagProjectRequest {
        var id: ProjectId
        var tags: Tags
    }
    interface TagProjectResult {
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tags {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface TeamMember {
        var userArn: UserArn
        var projectRole: Role
        var remoteAccessAllowed: RemoteAccessAllowed?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TemplateParameterMap {
        @nativeGetter
        operator fun get(key: String): TemplateParameterValue?
        @nativeSetter
        operator fun set(key: String, value: TemplateParameterValue)
    }
    interface Toolchain {
        var source: ToolchainSource
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var stackParameters: TemplateParameterMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ToolchainSource {
        var s3: S3Location
    }
    interface UntagProjectRequest {
        var id: ProjectId
        var tags: TagKeys
    }
    interface UntagProjectResult
    interface UpdateProjectRequest {
        var id: ProjectId
        var name: ProjectName?
            get() = definedExternally
            set(value) = definedExternally
        var description: ProjectDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateProjectResult
    interface UpdateTeamMemberRequest {
        var projectId: ProjectId
        var userArn: UserArn
        var projectRole: Role?
            get() = definedExternally
            set(value) = definedExternally
        var remoteAccessAllowed: RemoteAccessAllowed?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTeamMemberResult {
        var userArn: UserArn?
            get() = definedExternally
            set(value) = definedExternally
        var projectRole: Role?
            get() = definedExternally
            set(value) = definedExternally
        var remoteAccessAllowed: RemoteAccessAllowed?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateUserProfileRequest {
        var userArn: UserArn
        var displayName: UserProfileDisplayName?
            get() = definedExternally
            set(value) = definedExternally
        var emailAddress: Email?
            get() = definedExternally
            set(value) = definedExternally
        var sshPublicKey: SshPublicKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateUserProfileResult {
        var userArn: UserArn
        var displayName: UserProfileDisplayName?
            get() = definedExternally
            set(value) = definedExternally
        var emailAddress: Email?
            get() = definedExternally
            set(value) = definedExternally
        var sshPublicKey: SshPublicKey?
            get() = definedExternally
            set(value) = definedExternally
        var createdTimestamp: CreatedTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastModifiedTimestamp: LastModifiedTimestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserProfileSummary {
        var userArn: UserArn?
            get() = definedExternally
            set(value) = definedExternally
        var displayName: UserProfileDisplayName?
            get() = definedExternally
            set(value) = definedExternally
        var emailAddress: Email?
            get() = definedExternally
            set(value) = definedExternally
        var sshPublicKey: SshPublicKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-04-19" | "latest" | String */
    }
}