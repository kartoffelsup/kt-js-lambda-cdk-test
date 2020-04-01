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
import WorkSpaces.AccountModification
import WorkSpaces.WorkspaceBundle
import WorkSpaces.ClientPropertiesResult
import WorkSpaces.WorkspaceDirectory
import WorkSpaces.FailedCreateWorkspaceRequest
import WorkSpaces.FailedWorkspaceChangeRequest
import WorkSpaces.IpRuleItem
import WorkSpaces.ModificationState
import WorkSpaces.RebootRequest
import WorkSpaces.RebuildRequest
import WorkSpaces.Snapshot
import WorkSpaces.StartRequest
import WorkSpaces.StopRequest
import WorkSpaces.Tag
import WorkSpaces.TerminateRequest
import WorkSpaces.WorkspaceConnectionStatus
import WorkSpaces.WorkspaceImage
import WorkSpaces.Workspace
import WorkSpaces.WorkspaceRequest
import WorkSpaces.WorkspacesIpGroup
import WorkSpaces.AssociateIpGroupsRequest
import WorkSpaces.AssociateIpGroupsResult
import WorkSpaces.AuthorizeIpRulesRequest
import WorkSpaces.AuthorizeIpRulesResult
import WorkSpaces.CopyWorkspaceImageRequest
import WorkSpaces.CopyWorkspaceImageResult
import WorkSpaces.CreateIpGroupRequest
import WorkSpaces.CreateIpGroupResult
import WorkSpaces.CreateTagsRequest
import WorkSpaces.CreateTagsResult
import WorkSpaces.CreateWorkspacesRequest
import WorkSpaces.CreateWorkspacesResult
import WorkSpaces.DeleteIpGroupRequest
import WorkSpaces.DeleteIpGroupResult
import WorkSpaces.DeleteTagsRequest
import WorkSpaces.DeleteTagsResult
import WorkSpaces.DeleteWorkspaceImageRequest
import WorkSpaces.DeleteWorkspaceImageResult
import WorkSpaces.DeregisterWorkspaceDirectoryRequest
import WorkSpaces.DeregisterWorkspaceDirectoryResult
import WorkSpaces.DescribeAccountRequest
import WorkSpaces.DescribeAccountResult
import WorkSpaces.DescribeAccountModificationsRequest
import WorkSpaces.DescribeAccountModificationsResult
import WorkSpaces.DescribeClientPropertiesRequest
import WorkSpaces.DescribeClientPropertiesResult
import WorkSpaces.DescribeIpGroupsRequest
import WorkSpaces.DescribeIpGroupsResult
import WorkSpaces.DescribeTagsRequest
import WorkSpaces.DescribeTagsResult
import WorkSpaces.DescribeWorkspaceBundlesRequest
import WorkSpaces.DescribeWorkspaceBundlesResult
import WorkSpaces.DescribeWorkspaceDirectoriesRequest
import WorkSpaces.DescribeWorkspaceDirectoriesResult
import WorkSpaces.DescribeWorkspaceImagesRequest
import WorkSpaces.DescribeWorkspaceImagesResult
import WorkSpaces.DescribeWorkspaceSnapshotsRequest
import WorkSpaces.DescribeWorkspaceSnapshotsResult
import WorkSpaces.DescribeWorkspacesRequest
import WorkSpaces.DescribeWorkspacesResult
import WorkSpaces.DescribeWorkspacesConnectionStatusRequest
import WorkSpaces.DescribeWorkspacesConnectionStatusResult
import WorkSpaces.DisassociateIpGroupsRequest
import WorkSpaces.DisassociateIpGroupsResult
import WorkSpaces.ImportWorkspaceImageRequest
import WorkSpaces.ImportWorkspaceImageResult
import WorkSpaces.ListAvailableManagementCidrRangesRequest
import WorkSpaces.ListAvailableManagementCidrRangesResult
import WorkSpaces.MigrateWorkspaceRequest
import WorkSpaces.MigrateWorkspaceResult
import WorkSpaces.ModifyAccountRequest
import WorkSpaces.ModifyAccountResult
import WorkSpaces.ModifyClientPropertiesRequest
import WorkSpaces.ModifyClientPropertiesResult
import WorkSpaces.ModifySelfservicePermissionsRequest
import WorkSpaces.ModifySelfservicePermissionsResult
import WorkSpaces.ModifyWorkspaceAccessPropertiesRequest
import WorkSpaces.ModifyWorkspaceAccessPropertiesResult
import WorkSpaces.ModifyWorkspaceCreationPropertiesRequest
import WorkSpaces.ModifyWorkspaceCreationPropertiesResult
import WorkSpaces.ModifyWorkspacePropertiesRequest
import WorkSpaces.ModifyWorkspacePropertiesResult
import WorkSpaces.ModifyWorkspaceStateRequest
import WorkSpaces.ModifyWorkspaceStateResult
import WorkSpaces.RebootWorkspacesRequest
import WorkSpaces.RebootWorkspacesResult
import WorkSpaces.RebuildWorkspacesRequest
import WorkSpaces.RebuildWorkspacesResult
import WorkSpaces.RegisterWorkspaceDirectoryRequest
import WorkSpaces.RegisterWorkspaceDirectoryResult
import WorkSpaces.RestoreWorkspaceRequest
import WorkSpaces.RestoreWorkspaceResult
import WorkSpaces.RevokeIpRulesRequest
import WorkSpaces.RevokeIpRulesResult
import WorkSpaces.StartWorkspacesRequest
import WorkSpaces.StartWorkspacesResult
import WorkSpaces.StopWorkspacesRequest
import WorkSpaces.StopWorkspacesResult
import WorkSpaces.TerminateWorkspacesRequest
import WorkSpaces.TerminateWorkspacesResult
import WorkSpaces.UpdateRulesOfIpGroupRequest
import WorkSpaces.UpdateRulesOfIpGroupResult
import WorkSpaces.ClientProperties
import WorkSpaces.SelfservicePermissions
import WorkSpaces.WorkspaceAccessProperties
import WorkSpaces.WorkspaceCreationProperties
import WorkSpaces.WorkspaceProperties
import WorkSpaces.RootStorage
import WorkSpaces.UserStorage
import WorkSpaces.ComputeType
import WorkSpaces.DefaultWorkspaceCreationProperties
import WorkSpaces.OperatingSystem

typealias ARN = String

typealias AccountModificationList = Array<AccountModification>

typealias Alias = String

typealias BooleanObject = Boolean

typealias BundleId = String

typealias BundleIdList = Array<BundleId>

typealias BundleList = Array<WorkspaceBundle>

typealias BundleOwner = String

typealias ClientPropertiesList = Array<ClientPropertiesResult>

typealias ComputerName = String

typealias DedicatedTenancyCidrRangeList = Array<DedicatedTenancyManagementCidrRange>

typealias DedicatedTenancyManagementCidrRange = String

typealias DefaultOu = String

typealias Description = String

typealias DirectoryId = String

typealias DirectoryIdList = Array<DirectoryId>

typealias DirectoryList = Array<WorkspaceDirectory>

typealias DirectoryName = String

typealias DnsIpAddresses = Array<IpAddress>

typealias Ec2ImageId = String

typealias ErrorType = String

typealias FailedCreateWorkspaceRequests = Array<FailedCreateWorkspaceRequest>

typealias FailedRebootWorkspaceRequests = Array<FailedWorkspaceChangeRequest>

typealias FailedRebuildWorkspaceRequests = Array<FailedWorkspaceChangeRequest>

typealias FailedStartWorkspaceRequests = Array<FailedWorkspaceChangeRequest>

typealias FailedStopWorkspaceRequests = Array<FailedWorkspaceChangeRequest>

typealias FailedTerminateWorkspaceRequests = Array<FailedWorkspaceChangeRequest>

typealias IpAddress = String

typealias IpGroupDesc = String

typealias IpGroupId = String

typealias IpGroupIdList = Array<IpGroupId>

typealias IpGroupName = String

typealias IpRevokedRuleList = Array<IpRule>

typealias IpRule = String

typealias IpRuleDesc = String

typealias IpRuleList = Array<IpRuleItem>

typealias Limit = Number

typealias ManagementCidrRangeConstraint = String

typealias ManagementCidrRangeMaxResults = Number

typealias ModificationStateList = Array<ModificationState>

typealias NonEmptyString = String

typealias PaginationToken = String

typealias RebootWorkspaceRequests = Array<RebootRequest>

typealias RebuildWorkspaceRequests = Array<RebuildRequest>

typealias Region = String

typealias RegistrationCode = String

typealias ResourceIdList = Array<NonEmptyString>

typealias RootVolumeSizeGib = Number

typealias RunningModeAutoStopTimeoutInMinutes = Number

typealias SecurityGroupId = String

typealias SnapshotList = Array<Snapshot>

typealias StartWorkspaceRequests = Array<StartRequest>

typealias StopWorkspaceRequests = Array<StopRequest>

typealias SubnetId = String

typealias SubnetIds = Array<SubnetId>

typealias TagKey = String

typealias TagKeyList = Array<NonEmptyString>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TerminateWorkspaceRequests = Array<TerminateRequest>

typealias Timestamp = Date

typealias UserName = String

typealias UserVolumeSizeGib = Number

typealias VolumeEncryptionKey = String

typealias WorkspaceConnectionStatusList = Array<WorkspaceConnectionStatus>

typealias WorkspaceErrorCode = String

typealias WorkspaceId = String

typealias WorkspaceIdList = Array<WorkspaceId>

typealias WorkspaceImageDescription = String

typealias WorkspaceImageErrorCode = String

typealias WorkspaceImageId = String

typealias WorkspaceImageIdList = Array<WorkspaceImageId>

typealias WorkspaceImageList = Array<WorkspaceImage>

typealias WorkspaceImageName = String

typealias WorkspaceList = Array<Workspace>

typealias WorkspaceRequestList = Array<WorkspaceRequest>

typealias WorkspacesIpGroupsList = Array<WorkspacesIpGroup>

@JsModule("aws-sdk")
external open class WorkSpaces(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & WorkSpaces.Types.ClientConfiguration */
    open fun associateIpGroups(params: AssociateIpGroupsRequest, callback: (err: AWSError, data: AssociateIpGroupsResult) -> Unit = definedExternally): Request<AssociateIpGroupsResult, AWSError>
    open fun associateIpGroups(callback: (err: AWSError, data: AssociateIpGroupsResult) -> Unit = definedExternally): Request<AssociateIpGroupsResult, AWSError>
    open fun authorizeIpRules(params: AuthorizeIpRulesRequest, callback: (err: AWSError, data: AuthorizeIpRulesResult) -> Unit = definedExternally): Request<AuthorizeIpRulesResult, AWSError>
    open fun authorizeIpRules(callback: (err: AWSError, data: AuthorizeIpRulesResult) -> Unit = definedExternally): Request<AuthorizeIpRulesResult, AWSError>
    open fun copyWorkspaceImage(params: CopyWorkspaceImageRequest, callback: (err: AWSError, data: CopyWorkspaceImageResult) -> Unit = definedExternally): Request<CopyWorkspaceImageResult, AWSError>
    open fun copyWorkspaceImage(callback: (err: AWSError, data: CopyWorkspaceImageResult) -> Unit = definedExternally): Request<CopyWorkspaceImageResult, AWSError>
    open fun createIpGroup(params: CreateIpGroupRequest, callback: (err: AWSError, data: CreateIpGroupResult) -> Unit = definedExternally): Request<CreateIpGroupResult, AWSError>
    open fun createIpGroup(callback: (err: AWSError, data: CreateIpGroupResult) -> Unit = definedExternally): Request<CreateIpGroupResult, AWSError>
    open fun createTags(params: CreateTagsRequest, callback: (err: AWSError, data: CreateTagsResult) -> Unit = definedExternally): Request<CreateTagsResult, AWSError>
    open fun createTags(callback: (err: AWSError, data: CreateTagsResult) -> Unit = definedExternally): Request<CreateTagsResult, AWSError>
    open fun createWorkspaces(params: CreateWorkspacesRequest, callback: (err: AWSError, data: CreateWorkspacesResult) -> Unit = definedExternally): Request<CreateWorkspacesResult, AWSError>
    open fun createWorkspaces(callback: (err: AWSError, data: CreateWorkspacesResult) -> Unit = definedExternally): Request<CreateWorkspacesResult, AWSError>
    open fun deleteIpGroup(params: DeleteIpGroupRequest, callback: (err: AWSError, data: DeleteIpGroupResult) -> Unit = definedExternally): Request<DeleteIpGroupResult, AWSError>
    open fun deleteIpGroup(callback: (err: AWSError, data: DeleteIpGroupResult) -> Unit = definedExternally): Request<DeleteIpGroupResult, AWSError>
    open fun deleteTags(params: DeleteTagsRequest, callback: (err: AWSError, data: DeleteTagsResult) -> Unit = definedExternally): Request<DeleteTagsResult, AWSError>
    open fun deleteTags(callback: (err: AWSError, data: DeleteTagsResult) -> Unit = definedExternally): Request<DeleteTagsResult, AWSError>
    open fun deleteWorkspaceImage(params: DeleteWorkspaceImageRequest, callback: (err: AWSError, data: DeleteWorkspaceImageResult) -> Unit = definedExternally): Request<DeleteWorkspaceImageResult, AWSError>
    open fun deleteWorkspaceImage(callback: (err: AWSError, data: DeleteWorkspaceImageResult) -> Unit = definedExternally): Request<DeleteWorkspaceImageResult, AWSError>
    open fun deregisterWorkspaceDirectory(params: DeregisterWorkspaceDirectoryRequest, callback: (err: AWSError, data: DeregisterWorkspaceDirectoryResult) -> Unit = definedExternally): Request<DeregisterWorkspaceDirectoryResult, AWSError>
    open fun deregisterWorkspaceDirectory(callback: (err: AWSError, data: DeregisterWorkspaceDirectoryResult) -> Unit = definedExternally): Request<DeregisterWorkspaceDirectoryResult, AWSError>
    open fun describeAccount(params: DescribeAccountRequest, callback: (err: AWSError, data: DescribeAccountResult) -> Unit = definedExternally): Request<DescribeAccountResult, AWSError>
    open fun describeAccount(callback: (err: AWSError, data: DescribeAccountResult) -> Unit = definedExternally): Request<DescribeAccountResult, AWSError>
    open fun describeAccountModifications(params: DescribeAccountModificationsRequest, callback: (err: AWSError, data: DescribeAccountModificationsResult) -> Unit = definedExternally): Request<DescribeAccountModificationsResult, AWSError>
    open fun describeAccountModifications(callback: (err: AWSError, data: DescribeAccountModificationsResult) -> Unit = definedExternally): Request<DescribeAccountModificationsResult, AWSError>
    open fun describeClientProperties(params: DescribeClientPropertiesRequest, callback: (err: AWSError, data: DescribeClientPropertiesResult) -> Unit = definedExternally): Request<DescribeClientPropertiesResult, AWSError>
    open fun describeClientProperties(callback: (err: AWSError, data: DescribeClientPropertiesResult) -> Unit = definedExternally): Request<DescribeClientPropertiesResult, AWSError>
    open fun describeIpGroups(params: DescribeIpGroupsRequest, callback: (err: AWSError, data: DescribeIpGroupsResult) -> Unit = definedExternally): Request<DescribeIpGroupsResult, AWSError>
    open fun describeIpGroups(callback: (err: AWSError, data: DescribeIpGroupsResult) -> Unit = definedExternally): Request<DescribeIpGroupsResult, AWSError>
    open fun describeTags(params: DescribeTagsRequest, callback: (err: AWSError, data: DescribeTagsResult) -> Unit = definedExternally): Request<DescribeTagsResult, AWSError>
    open fun describeTags(callback: (err: AWSError, data: DescribeTagsResult) -> Unit = definedExternally): Request<DescribeTagsResult, AWSError>
    open fun describeWorkspaceBundles(params: DescribeWorkspaceBundlesRequest, callback: (err: AWSError, data: DescribeWorkspaceBundlesResult) -> Unit = definedExternally): Request<DescribeWorkspaceBundlesResult, AWSError>
    open fun describeWorkspaceBundles(callback: (err: AWSError, data: DescribeWorkspaceBundlesResult) -> Unit = definedExternally): Request<DescribeWorkspaceBundlesResult, AWSError>
    open fun describeWorkspaceDirectories(params: DescribeWorkspaceDirectoriesRequest, callback: (err: AWSError, data: DescribeWorkspaceDirectoriesResult) -> Unit = definedExternally): Request<DescribeWorkspaceDirectoriesResult, AWSError>
    open fun describeWorkspaceDirectories(callback: (err: AWSError, data: DescribeWorkspaceDirectoriesResult) -> Unit = definedExternally): Request<DescribeWorkspaceDirectoriesResult, AWSError>
    open fun describeWorkspaceImages(params: DescribeWorkspaceImagesRequest, callback: (err: AWSError, data: DescribeWorkspaceImagesResult) -> Unit = definedExternally): Request<DescribeWorkspaceImagesResult, AWSError>
    open fun describeWorkspaceImages(callback: (err: AWSError, data: DescribeWorkspaceImagesResult) -> Unit = definedExternally): Request<DescribeWorkspaceImagesResult, AWSError>
    open fun describeWorkspaceSnapshots(params: DescribeWorkspaceSnapshotsRequest, callback: (err: AWSError, data: DescribeWorkspaceSnapshotsResult) -> Unit = definedExternally): Request<DescribeWorkspaceSnapshotsResult, AWSError>
    open fun describeWorkspaceSnapshots(callback: (err: AWSError, data: DescribeWorkspaceSnapshotsResult) -> Unit = definedExternally): Request<DescribeWorkspaceSnapshotsResult, AWSError>
    open fun describeWorkspaces(params: DescribeWorkspacesRequest, callback: (err: AWSError, data: DescribeWorkspacesResult) -> Unit = definedExternally): Request<DescribeWorkspacesResult, AWSError>
    open fun describeWorkspaces(callback: (err: AWSError, data: DescribeWorkspacesResult) -> Unit = definedExternally): Request<DescribeWorkspacesResult, AWSError>
    open fun describeWorkspacesConnectionStatus(params: DescribeWorkspacesConnectionStatusRequest, callback: (err: AWSError, data: DescribeWorkspacesConnectionStatusResult) -> Unit = definedExternally): Request<DescribeWorkspacesConnectionStatusResult, AWSError>
    open fun describeWorkspacesConnectionStatus(callback: (err: AWSError, data: DescribeWorkspacesConnectionStatusResult) -> Unit = definedExternally): Request<DescribeWorkspacesConnectionStatusResult, AWSError>
    open fun disassociateIpGroups(params: DisassociateIpGroupsRequest, callback: (err: AWSError, data: DisassociateIpGroupsResult) -> Unit = definedExternally): Request<DisassociateIpGroupsResult, AWSError>
    open fun disassociateIpGroups(callback: (err: AWSError, data: DisassociateIpGroupsResult) -> Unit = definedExternally): Request<DisassociateIpGroupsResult, AWSError>
    open fun importWorkspaceImage(params: ImportWorkspaceImageRequest, callback: (err: AWSError, data: ImportWorkspaceImageResult) -> Unit = definedExternally): Request<ImportWorkspaceImageResult, AWSError>
    open fun importWorkspaceImage(callback: (err: AWSError, data: ImportWorkspaceImageResult) -> Unit = definedExternally): Request<ImportWorkspaceImageResult, AWSError>
    open fun listAvailableManagementCidrRanges(params: ListAvailableManagementCidrRangesRequest, callback: (err: AWSError, data: ListAvailableManagementCidrRangesResult) -> Unit = definedExternally): Request<ListAvailableManagementCidrRangesResult, AWSError>
    open fun listAvailableManagementCidrRanges(callback: (err: AWSError, data: ListAvailableManagementCidrRangesResult) -> Unit = definedExternally): Request<ListAvailableManagementCidrRangesResult, AWSError>
    open fun migrateWorkspace(params: MigrateWorkspaceRequest, callback: (err: AWSError, data: MigrateWorkspaceResult) -> Unit = definedExternally): Request<MigrateWorkspaceResult, AWSError>
    open fun migrateWorkspace(callback: (err: AWSError, data: MigrateWorkspaceResult) -> Unit = definedExternally): Request<MigrateWorkspaceResult, AWSError>
    open fun modifyAccount(params: ModifyAccountRequest, callback: (err: AWSError, data: ModifyAccountResult) -> Unit = definedExternally): Request<ModifyAccountResult, AWSError>
    open fun modifyAccount(callback: (err: AWSError, data: ModifyAccountResult) -> Unit = definedExternally): Request<ModifyAccountResult, AWSError>
    open fun modifyClientProperties(params: ModifyClientPropertiesRequest, callback: (err: AWSError, data: ModifyClientPropertiesResult) -> Unit = definedExternally): Request<ModifyClientPropertiesResult, AWSError>
    open fun modifyClientProperties(callback: (err: AWSError, data: ModifyClientPropertiesResult) -> Unit = definedExternally): Request<ModifyClientPropertiesResult, AWSError>
    open fun modifySelfservicePermissions(params: ModifySelfservicePermissionsRequest, callback: (err: AWSError, data: ModifySelfservicePermissionsResult) -> Unit = definedExternally): Request<ModifySelfservicePermissionsResult, AWSError>
    open fun modifySelfservicePermissions(callback: (err: AWSError, data: ModifySelfservicePermissionsResult) -> Unit = definedExternally): Request<ModifySelfservicePermissionsResult, AWSError>
    open fun modifyWorkspaceAccessProperties(params: ModifyWorkspaceAccessPropertiesRequest, callback: (err: AWSError, data: ModifyWorkspaceAccessPropertiesResult) -> Unit = definedExternally): Request<ModifyWorkspaceAccessPropertiesResult, AWSError>
    open fun modifyWorkspaceAccessProperties(callback: (err: AWSError, data: ModifyWorkspaceAccessPropertiesResult) -> Unit = definedExternally): Request<ModifyWorkspaceAccessPropertiesResult, AWSError>
    open fun modifyWorkspaceCreationProperties(params: ModifyWorkspaceCreationPropertiesRequest, callback: (err: AWSError, data: ModifyWorkspaceCreationPropertiesResult) -> Unit = definedExternally): Request<ModifyWorkspaceCreationPropertiesResult, AWSError>
    open fun modifyWorkspaceCreationProperties(callback: (err: AWSError, data: ModifyWorkspaceCreationPropertiesResult) -> Unit = definedExternally): Request<ModifyWorkspaceCreationPropertiesResult, AWSError>
    open fun modifyWorkspaceProperties(params: ModifyWorkspacePropertiesRequest, callback: (err: AWSError, data: ModifyWorkspacePropertiesResult) -> Unit = definedExternally): Request<ModifyWorkspacePropertiesResult, AWSError>
    open fun modifyWorkspaceProperties(callback: (err: AWSError, data: ModifyWorkspacePropertiesResult) -> Unit = definedExternally): Request<ModifyWorkspacePropertiesResult, AWSError>
    open fun modifyWorkspaceState(params: ModifyWorkspaceStateRequest, callback: (err: AWSError, data: ModifyWorkspaceStateResult) -> Unit = definedExternally): Request<ModifyWorkspaceStateResult, AWSError>
    open fun modifyWorkspaceState(callback: (err: AWSError, data: ModifyWorkspaceStateResult) -> Unit = definedExternally): Request<ModifyWorkspaceStateResult, AWSError>
    open fun rebootWorkspaces(params: RebootWorkspacesRequest, callback: (err: AWSError, data: RebootWorkspacesResult) -> Unit = definedExternally): Request<RebootWorkspacesResult, AWSError>
    open fun rebootWorkspaces(callback: (err: AWSError, data: RebootWorkspacesResult) -> Unit = definedExternally): Request<RebootWorkspacesResult, AWSError>
    open fun rebuildWorkspaces(params: RebuildWorkspacesRequest, callback: (err: AWSError, data: RebuildWorkspacesResult) -> Unit = definedExternally): Request<RebuildWorkspacesResult, AWSError>
    open fun rebuildWorkspaces(callback: (err: AWSError, data: RebuildWorkspacesResult) -> Unit = definedExternally): Request<RebuildWorkspacesResult, AWSError>
    open fun registerWorkspaceDirectory(params: RegisterWorkspaceDirectoryRequest, callback: (err: AWSError, data: RegisterWorkspaceDirectoryResult) -> Unit = definedExternally): Request<RegisterWorkspaceDirectoryResult, AWSError>
    open fun registerWorkspaceDirectory(callback: (err: AWSError, data: RegisterWorkspaceDirectoryResult) -> Unit = definedExternally): Request<RegisterWorkspaceDirectoryResult, AWSError>
    open fun restoreWorkspace(params: RestoreWorkspaceRequest, callback: (err: AWSError, data: RestoreWorkspaceResult) -> Unit = definedExternally): Request<RestoreWorkspaceResult, AWSError>
    open fun restoreWorkspace(callback: (err: AWSError, data: RestoreWorkspaceResult) -> Unit = definedExternally): Request<RestoreWorkspaceResult, AWSError>
    open fun revokeIpRules(params: RevokeIpRulesRequest, callback: (err: AWSError, data: RevokeIpRulesResult) -> Unit = definedExternally): Request<RevokeIpRulesResult, AWSError>
    open fun revokeIpRules(callback: (err: AWSError, data: RevokeIpRulesResult) -> Unit = definedExternally): Request<RevokeIpRulesResult, AWSError>
    open fun startWorkspaces(params: StartWorkspacesRequest, callback: (err: AWSError, data: StartWorkspacesResult) -> Unit = definedExternally): Request<StartWorkspacesResult, AWSError>
    open fun startWorkspaces(callback: (err: AWSError, data: StartWorkspacesResult) -> Unit = definedExternally): Request<StartWorkspacesResult, AWSError>
    open fun stopWorkspaces(params: StopWorkspacesRequest, callback: (err: AWSError, data: StopWorkspacesResult) -> Unit = definedExternally): Request<StopWorkspacesResult, AWSError>
    open fun stopWorkspaces(callback: (err: AWSError, data: StopWorkspacesResult) -> Unit = definedExternally): Request<StopWorkspacesResult, AWSError>
    open fun terminateWorkspaces(params: TerminateWorkspacesRequest, callback: (err: AWSError, data: TerminateWorkspacesResult) -> Unit = definedExternally): Request<TerminateWorkspacesResult, AWSError>
    open fun terminateWorkspaces(callback: (err: AWSError, data: TerminateWorkspacesResult) -> Unit = definedExternally): Request<TerminateWorkspacesResult, AWSError>
    open fun updateRulesOfIpGroup(params: UpdateRulesOfIpGroupRequest, callback: (err: AWSError, data: UpdateRulesOfIpGroupResult) -> Unit = definedExternally): Request<UpdateRulesOfIpGroupResult, AWSError>
    open fun updateRulesOfIpGroup(callback: (err: AWSError, data: UpdateRulesOfIpGroupResult) -> Unit = definedExternally): Request<UpdateRulesOfIpGroupResult, AWSError>
    interface AccountModification {
        var ModificationState: String /* "PENDING" | "COMPLETED" | "FAILED" | String */
        var DedicatedTenancySupport: String /* "ENABLED" | "DISABLED" | String */
        var DedicatedTenancyManagementCidrRange: DedicatedTenancyManagementCidrRange?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: WorkspaceErrorCode?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateIpGroupsRequest {
        var DirectoryId: DirectoryId
        var GroupIds: IpGroupIdList
    }
    interface AssociateIpGroupsResult
    interface AuthorizeIpRulesRequest {
        var GroupId: IpGroupId
        var UserRules: IpRuleList
    }
    interface AuthorizeIpRulesResult
    interface ClientProperties {
        var ReconnectEnabled: String /* "ENABLED" | "DISABLED" | String */
    }
    interface ClientPropertiesResult {
        var ResourceId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var ClientProperties: ClientProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ComputeType {
        var Name: String /* "VALUE" | "STANDARD" | "PERFORMANCE" | "POWER" | "GRAPHICS" | "POWERPRO" | "GRAPHICSPRO" | String */
    }
    interface CopyWorkspaceImageRequest {
        var Name: WorkspaceImageName
        var Description: WorkspaceImageDescription?
            get() = definedExternally
            set(value) = definedExternally
        var SourceImageId: WorkspaceImageId
        var SourceRegion: Region
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CopyWorkspaceImageResult {
        var ImageId: WorkspaceImageId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateIpGroupRequest {
        var GroupName: IpGroupName
        var GroupDesc: IpGroupDesc?
            get() = definedExternally
            set(value) = definedExternally
        var UserRules: IpRuleList?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateIpGroupResult {
        var GroupId: IpGroupId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTagsRequest {
        var ResourceId: NonEmptyString
        var Tags: TagList
    }
    interface CreateTagsResult
    interface CreateWorkspacesRequest {
        var Workspaces: WorkspaceRequestList
    }
    interface CreateWorkspacesResult {
        var FailedRequests: FailedCreateWorkspaceRequests?
            get() = definedExternally
            set(value) = definedExternally
        var PendingRequests: WorkspaceList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DefaultWorkspaceCreationProperties {
        var EnableWorkDocs: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var EnableInternetAccess: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultOu: DefaultOu?
            get() = definedExternally
            set(value) = definedExternally
        var CustomSecurityGroupId: SecurityGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var UserEnabledAsLocalAdministrator: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var EnableMaintenanceMode: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteIpGroupRequest {
        var GroupId: IpGroupId
    }
    interface DeleteIpGroupResult
    interface DeleteTagsRequest {
        var ResourceId: NonEmptyString
        var TagKeys: TagKeyList
    }
    interface DeleteTagsResult
    interface DeleteWorkspaceImageRequest {
        var ImageId: WorkspaceImageId
    }
    interface DeleteWorkspaceImageResult
    interface DeregisterWorkspaceDirectoryRequest {
        var DirectoryId: DirectoryId
    }
    interface DeregisterWorkspaceDirectoryResult
    interface DescribeAccountModificationsRequest {
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAccountModificationsResult {
        var AccountModifications: AccountModificationList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAccountRequest
    interface DescribeAccountResult {
        var DedicatedTenancySupport: String /* "ENABLED" | "DISABLED" | String */
        var DedicatedTenancyManagementCidrRange: DedicatedTenancyManagementCidrRange?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeClientPropertiesRequest {
        var ResourceIds: ResourceIdList
    }
    interface DescribeClientPropertiesResult {
        var ClientPropertiesList: ClientPropertiesList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeIpGroupsRequest {
        var GroupIds: IpGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: Limit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeIpGroupsResult {
        var Result: WorkspacesIpGroupsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTagsRequest {
        var ResourceId: NonEmptyString
    }
    interface DescribeTagsResult {
        var TagList: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeWorkspaceBundlesRequest {
        var BundleIds: BundleIdList?
            get() = definedExternally
            set(value) = definedExternally
        var Owner: BundleOwner?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeWorkspaceBundlesResult {
        var Bundles: BundleList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeWorkspaceDirectoriesRequest {
        var DirectoryIds: DirectoryIdList?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeWorkspaceDirectoriesResult {
        var Directories: DirectoryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeWorkspaceImagesRequest {
        var ImageIds: WorkspaceImageIdList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: Limit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeWorkspaceImagesResult {
        var Images: WorkspaceImageList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeWorkspaceSnapshotsRequest {
        var WorkspaceId: WorkspaceId
    }
    interface DescribeWorkspaceSnapshotsResult {
        var RebuildSnapshots: SnapshotList?
            get() = definedExternally
            set(value) = definedExternally
        var RestoreSnapshots: SnapshotList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeWorkspacesConnectionStatusRequest {
        var WorkspaceIds: WorkspaceIdList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeWorkspacesConnectionStatusResult {
        var WorkspacesConnectionStatus: WorkspaceConnectionStatusList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeWorkspacesRequest {
        var WorkspaceIds: WorkspaceIdList?
            get() = definedExternally
            set(value) = definedExternally
        var DirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
        var UserName: UserName?
            get() = definedExternally
            set(value) = definedExternally
        var BundleId: BundleId?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeWorkspacesResult {
        var Workspaces: WorkspaceList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateIpGroupsRequest {
        var DirectoryId: DirectoryId
        var GroupIds: IpGroupIdList
    }
    interface DisassociateIpGroupsResult
    interface FailedCreateWorkspaceRequest {
        var WorkspaceRequest: WorkspaceRequest?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: ErrorType?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FailedWorkspaceChangeRequest {
        var WorkspaceId: WorkspaceId?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: ErrorType?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportWorkspaceImageRequest {
        var Ec2ImageId: Ec2ImageId
        var IngestionProcess: String /* "BYOL_REGULAR" | "BYOL_GRAPHICS" | "BYOL_GRAPHICSPRO" | String */
        var ImageName: WorkspaceImageName
        var ImageDescription: WorkspaceImageDescription
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportWorkspaceImageResult {
        var ImageId: WorkspaceImageId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IpRuleItem {
        var ipRule: IpRule?
            get() = definedExternally
            set(value) = definedExternally
        var ruleDesc: IpRuleDesc?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAvailableManagementCidrRangesRequest {
        var ManagementCidrRangeConstraint: ManagementCidrRangeConstraint
        var MaxResults: ManagementCidrRangeMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAvailableManagementCidrRangesResult {
        var ManagementCidrRanges: DedicatedTenancyCidrRangeList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MigrateWorkspaceRequest {
        var SourceWorkspaceId: WorkspaceId
        var BundleId: BundleId
    }
    interface MigrateWorkspaceResult {
        var SourceWorkspaceId: WorkspaceId?
            get() = definedExternally
            set(value) = definedExternally
        var TargetWorkspaceId: WorkspaceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModificationState {
        var Resource: String /* "ROOT_VOLUME" | "USER_VOLUME" | "COMPUTE_TYPE" | String */
        var State: String /* "UPDATE_INITIATED" | "UPDATE_IN_PROGRESS" | String */
    }
    interface ModifyAccountRequest {
        var DedicatedTenancySupport: String /* "ENABLED" | String */
        var DedicatedTenancyManagementCidrRange: DedicatedTenancyManagementCidrRange?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyAccountResult
    interface ModifyClientPropertiesRequest {
        var ResourceId: NonEmptyString
        var ClientProperties: ClientProperties
    }
    interface ModifyClientPropertiesResult
    interface ModifySelfservicePermissionsRequest {
        var ResourceId: DirectoryId
        var SelfservicePermissions: SelfservicePermissions
    }
    interface ModifySelfservicePermissionsResult
    interface ModifyWorkspaceAccessPropertiesRequest {
        var ResourceId: DirectoryId
        var WorkspaceAccessProperties: WorkspaceAccessProperties
    }
    interface ModifyWorkspaceAccessPropertiesResult
    interface ModifyWorkspaceCreationPropertiesRequest {
        var ResourceId: DirectoryId
        var WorkspaceCreationProperties: WorkspaceCreationProperties
    }
    interface ModifyWorkspaceCreationPropertiesResult
    interface ModifyWorkspacePropertiesRequest {
        var WorkspaceId: WorkspaceId
        var WorkspaceProperties: WorkspaceProperties
    }
    interface ModifyWorkspacePropertiesResult
    interface ModifyWorkspaceStateRequest {
        var WorkspaceId: WorkspaceId
        var WorkspaceState: String /* "AVAILABLE" | "ADMIN_MAINTENANCE" | String */
    }
    interface ModifyWorkspaceStateResult
    interface OperatingSystem {
        var Type: String /* "WINDOWS" | "LINUX" | String */
    }
    interface RebootRequest {
        var WorkspaceId: WorkspaceId
    }
    interface RebootWorkspacesRequest {
        var RebootWorkspaceRequests: RebootWorkspaceRequests
    }
    interface RebootWorkspacesResult {
        var FailedRequests: FailedRebootWorkspaceRequests?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RebuildRequest {
        var WorkspaceId: WorkspaceId
    }
    interface RebuildWorkspacesRequest {
        var RebuildWorkspaceRequests: RebuildWorkspaceRequests
    }
    interface RebuildWorkspacesResult {
        var FailedRequests: FailedRebuildWorkspaceRequests?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterWorkspaceDirectoryRequest {
        var DirectoryId: DirectoryId
        var SubnetIds: SubnetIds?
            get() = definedExternally
            set(value) = definedExternally
        var EnableWorkDocs: BooleanObject
        var EnableSelfService: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var Tenancy: String /* "DEDICATED" | "SHARED" | String */
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterWorkspaceDirectoryResult
    interface RestoreWorkspaceRequest {
        var WorkspaceId: WorkspaceId
    }
    interface RestoreWorkspaceResult
    interface RevokeIpRulesRequest {
        var GroupId: IpGroupId
        var UserRules: IpRevokedRuleList
    }
    interface RevokeIpRulesResult
    interface RootStorage {
        var Capacity: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SelfservicePermissions {
        var RestartWorkspace: String /* "ENABLED" | "DISABLED" | String */
        var IncreaseVolumeSize: String /* "ENABLED" | "DISABLED" | String */
        var ChangeComputeType: String /* "ENABLED" | "DISABLED" | String */
        var SwitchRunningMode: String /* "ENABLED" | "DISABLED" | String */
        var RebuildWorkspace: String /* "ENABLED" | "DISABLED" | String */
    }
    interface Snapshot {
        var SnapshotTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartRequest {
        var WorkspaceId: WorkspaceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartWorkspacesRequest {
        var StartWorkspaceRequests: StartWorkspaceRequests
    }
    interface StartWorkspacesResult {
        var FailedRequests: FailedStartWorkspaceRequests?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopRequest {
        var WorkspaceId: WorkspaceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopWorkspacesRequest {
        var StopWorkspaceRequests: StopWorkspaceRequests
    }
    interface StopWorkspacesResult {
        var FailedRequests: FailedStopWorkspaceRequests?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TerminateRequest {
        var WorkspaceId: WorkspaceId
    }
    interface TerminateWorkspacesRequest {
        var TerminateWorkspaceRequests: TerminateWorkspaceRequests
    }
    interface TerminateWorkspacesResult {
        var FailedRequests: FailedTerminateWorkspaceRequests?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRulesOfIpGroupRequest {
        var GroupId: IpGroupId
        var UserRules: IpRuleList
    }
    interface UpdateRulesOfIpGroupResult
    interface UserStorage {
        var Capacity: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Workspace {
        var WorkspaceId: WorkspaceId?
            get() = definedExternally
            set(value) = definedExternally
        var DirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
        var UserName: UserName?
            get() = definedExternally
            set(value) = definedExternally
        var IpAddress: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "PENDING" | "AVAILABLE" | "IMPAIRED" | "UNHEALTHY" | "REBOOTING" | "STARTING" | "REBUILDING" | "RESTORING" | "MAINTENANCE" | "ADMIN_MAINTENANCE" | "TERMINATING" | "TERMINATED" | "SUSPENDED" | "UPDATING" | "STOPPING" | "STOPPED" | "ERROR" | String */
        var BundleId: BundleId?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetId: SubnetId?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: Description?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: WorkspaceErrorCode?
            get() = definedExternally
            set(value) = definedExternally
        var ComputerName: ComputerName?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeEncryptionKey: VolumeEncryptionKey?
            get() = definedExternally
            set(value) = definedExternally
        var UserVolumeEncryptionEnabled: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var RootVolumeEncryptionEnabled: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var WorkspaceProperties: WorkspaceProperties?
            get() = definedExternally
            set(value) = definedExternally
        var ModificationStates: ModificationStateList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkspaceAccessProperties {
        var DeviceTypeWindows: String /* "ALLOW" | "DENY" | String */
        var DeviceTypeOsx: String /* "ALLOW" | "DENY" | String */
        var DeviceTypeWeb: String /* "ALLOW" | "DENY" | String */
        var DeviceTypeIos: String /* "ALLOW" | "DENY" | String */
        var DeviceTypeAndroid: String /* "ALLOW" | "DENY" | String */
        var DeviceTypeChromeOs: String /* "ALLOW" | "DENY" | String */
        var DeviceTypeZeroClient: String /* "ALLOW" | "DENY" | String */
    }
    interface WorkspaceBundle {
        var BundleId: BundleId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Owner: BundleOwner?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var ImageId: WorkspaceImageId?
            get() = definedExternally
            set(value) = definedExternally
        var RootStorage: RootStorage?
            get() = definedExternally
            set(value) = definedExternally
        var UserStorage: UserStorage?
            get() = definedExternally
            set(value) = definedExternally
        var ComputeType: ComputeType?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkspaceConnectionStatus {
        var WorkspaceId: WorkspaceId?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionState: String /* "CONNECTED" | "DISCONNECTED" | "UNKNOWN" | String */
        var ConnectionStateCheckTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastKnownUserConnectionTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkspaceCreationProperties {
        var EnableInternetAccess: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultOu: DefaultOu?
            get() = definedExternally
            set(value) = definedExternally
        var CustomSecurityGroupId: SecurityGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var UserEnabledAsLocalAdministrator: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var EnableMaintenanceMode: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkspaceDirectory {
        var DirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
        var Alias: Alias?
            get() = definedExternally
            set(value) = definedExternally
        var DirectoryName: DirectoryName?
            get() = definedExternally
            set(value) = definedExternally
        var RegistrationCode: RegistrationCode?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: SubnetIds?
            get() = definedExternally
            set(value) = definedExternally
        var DnsIpAddresses: DnsIpAddresses?
            get() = definedExternally
            set(value) = definedExternally
        var CustomerUserName: UserName?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoleId: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var DirectoryType: String /* "SIMPLE_AD" | "AD_CONNECTOR" | String */
        var WorkspaceSecurityGroupId: SecurityGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "REGISTERING" | "REGISTERED" | "DEREGISTERING" | "DEREGISTERED" | "ERROR" | String */
        var WorkspaceCreationProperties: DefaultWorkspaceCreationProperties?
            get() = definedExternally
            set(value) = definedExternally
        var ipGroupIds: IpGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var WorkspaceAccessProperties: WorkspaceAccessProperties?
            get() = definedExternally
            set(value) = definedExternally
        var Tenancy: String /* "DEDICATED" | "SHARED" | String */
        var SelfservicePermissions: SelfservicePermissions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkspaceImage {
        var ImageId: WorkspaceImageId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: WorkspaceImageName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: WorkspaceImageDescription?
            get() = definedExternally
            set(value) = definedExternally
        var OperatingSystem: OperatingSystem?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "AVAILABLE" | "PENDING" | "ERROR" | String */
        var RequiredTenancy: String /* "DEFAULT" | "DEDICATED" | String */
        var ErrorCode: WorkspaceImageErrorCode?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkspaceProperties {
        var RunningMode: String /* "AUTO_STOP" | "ALWAYS_ON" | String */
        var RunningModeAutoStopTimeoutInMinutes: RunningModeAutoStopTimeoutInMinutes?
            get() = definedExternally
            set(value) = definedExternally
        var RootVolumeSizeGib: RootVolumeSizeGib?
            get() = definedExternally
            set(value) = definedExternally
        var UserVolumeSizeGib: UserVolumeSizeGib?
            get() = definedExternally
            set(value) = definedExternally
        var ComputeTypeName: String /* "VALUE" | "STANDARD" | "PERFORMANCE" | "POWER" | "GRAPHICS" | "POWERPRO" | "GRAPHICSPRO" | String */
    }
    interface WorkspaceRequest {
        var DirectoryId: DirectoryId
        var UserName: UserName
        var BundleId: BundleId
        var VolumeEncryptionKey: VolumeEncryptionKey?
            get() = definedExternally
            set(value) = definedExternally
        var UserVolumeEncryptionEnabled: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var RootVolumeEncryptionEnabled: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var WorkspaceProperties: WorkspaceProperties?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkspacesIpGroup {
        var groupId: IpGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var groupName: IpGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var groupDesc: IpGroupDesc?
            get() = definedExternally
            set(value) = definedExternally
        var userRules: IpRuleList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2015-04-08" | "latest" | String */
    }
}