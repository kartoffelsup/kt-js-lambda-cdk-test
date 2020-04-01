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
import EFS.AccessPointDescription
import EFS.FileSystemDescription
import EFS.LifecyclePolicy
import EFS.MountTargetDescription
import EFS.Tag
import EFS.CreateAccessPointRequest
import EFS.CreateFileSystemRequest
import EFS.CreateMountTargetRequest
import EFS.CreateTagsRequest
import EFS.DeleteAccessPointRequest
import EFS.DeleteFileSystemRequest
import EFS.DeleteFileSystemPolicyRequest
import EFS.DeleteMountTargetRequest
import EFS.DeleteTagsRequest
import EFS.DescribeAccessPointsRequest
import EFS.DescribeAccessPointsResponse
import EFS.DescribeFileSystemPolicyRequest
import EFS.FileSystemPolicyDescription
import EFS.DescribeFileSystemsRequest
import EFS.DescribeFileSystemsResponse
import EFS.DescribeLifecycleConfigurationRequest
import EFS.LifecycleConfigurationDescription
import EFS.DescribeMountTargetSecurityGroupsRequest
import EFS.DescribeMountTargetSecurityGroupsResponse
import EFS.DescribeMountTargetsRequest
import EFS.DescribeMountTargetsResponse
import EFS.DescribeTagsRequest
import EFS.DescribeTagsResponse
import EFS.ListTagsForResourceRequest
import EFS.ListTagsForResourceResponse
import EFS.ModifyMountTargetSecurityGroupsRequest
import EFS.PutFileSystemPolicyRequest
import EFS.PutLifecycleConfigurationRequest
import EFS.TagResourceRequest
import EFS.UntagResourceRequest
import EFS.UpdateFileSystemRequest
import EFS.PosixUser
import EFS.RootDirectory
import EFS.FileSystemSize
import EFS.CreationInfo

typealias AccessPointArn = String

typealias AccessPointDescriptions = Array<AccessPointDescription>

typealias AccessPointId = String

typealias AvailabilityZoneId = String

typealias AvailabilityZoneName = String

typealias AwsAccountId = String

typealias BypassPolicyLockoutSafetyCheck = Boolean

typealias ClientToken = String

typealias CreationToken = String

typealias Encrypted = Boolean

typealias FileSystemDescriptions = Array<FileSystemDescription>

typealias FileSystemId = String

typealias FileSystemNullableSizeValue = Number

typealias FileSystemSizeValue = Number

typealias Gid = Number

typealias IpAddress = String

typealias KmsKeyId = String

typealias LifecyclePolicies = Array<LifecyclePolicy>

typealias Marker = String

typealias MaxItems = Number

typealias MaxResults = Number

typealias MountTargetCount = Number

typealias MountTargetDescriptions = Array<MountTargetDescription>

typealias MountTargetId = String

typealias Name = String

typealias NetworkInterfaceId = String

typealias OwnerGid = Number

typealias OwnerUid = Number

typealias Path = String

typealias Permissions = String

typealias Policy = String

typealias ProvisionedThroughputInMibps = Number

typealias ResourceId = String

typealias SecondaryGids = Array<Gid>

typealias SecurityGroup = String

typealias SecurityGroups = Array<SecurityGroup>

typealias SubnetId = String

typealias TagKey = String

typealias TagKeys = Array<TagKey>

typealias TagValue = String

typealias Tags = Array<Tag>

typealias Timestamp = Date

typealias Token = String

typealias Uid = Number

@JsModule("aws-sdk")
external open class EFS(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & EFS.Types.ClientConfiguration */
    open fun createAccessPoint(params: CreateAccessPointRequest, callback: (err: AWSError, data: AccessPointDescription) -> Unit = definedExternally): Request<AccessPointDescription, AWSError>
    open fun createAccessPoint(callback: (err: AWSError, data: AccessPointDescription) -> Unit = definedExternally): Request<AccessPointDescription, AWSError>
    open fun createFileSystem(params: CreateFileSystemRequest, callback: (err: AWSError, data: FileSystemDescription) -> Unit = definedExternally): Request<FileSystemDescription, AWSError>
    open fun createFileSystem(callback: (err: AWSError, data: FileSystemDescription) -> Unit = definedExternally): Request<FileSystemDescription, AWSError>
    open fun createMountTarget(params: CreateMountTargetRequest, callback: (err: AWSError, data: MountTargetDescription) -> Unit = definedExternally): Request<MountTargetDescription, AWSError>
    open fun createMountTarget(callback: (err: AWSError, data: MountTargetDescription) -> Unit = definedExternally): Request<MountTargetDescription, AWSError>
    open fun createTags(params: CreateTagsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createTags(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAccessPoint(params: DeleteAccessPointRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAccessPoint(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteFileSystem(params: DeleteFileSystemRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteFileSystem(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteFileSystemPolicy(params: DeleteFileSystemPolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteFileSystemPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteMountTarget(params: DeleteMountTargetRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteMountTarget(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteTags(params: DeleteTagsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteTags(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeAccessPoints(params: DescribeAccessPointsRequest, callback: (err: AWSError, data: DescribeAccessPointsResponse) -> Unit = definedExternally): Request<DescribeAccessPointsResponse, AWSError>
    open fun describeAccessPoints(callback: (err: AWSError, data: DescribeAccessPointsResponse) -> Unit = definedExternally): Request<DescribeAccessPointsResponse, AWSError>
    open fun describeFileSystemPolicy(params: DescribeFileSystemPolicyRequest, callback: (err: AWSError, data: FileSystemPolicyDescription) -> Unit = definedExternally): Request<FileSystemPolicyDescription, AWSError>
    open fun describeFileSystemPolicy(callback: (err: AWSError, data: FileSystemPolicyDescription) -> Unit = definedExternally): Request<FileSystemPolicyDescription, AWSError>
    open fun describeFileSystems(params: DescribeFileSystemsRequest, callback: (err: AWSError, data: DescribeFileSystemsResponse) -> Unit = definedExternally): Request<DescribeFileSystemsResponse, AWSError>
    open fun describeFileSystems(callback: (err: AWSError, data: DescribeFileSystemsResponse) -> Unit = definedExternally): Request<DescribeFileSystemsResponse, AWSError>
    open fun describeLifecycleConfiguration(params: DescribeLifecycleConfigurationRequest, callback: (err: AWSError, data: LifecycleConfigurationDescription) -> Unit = definedExternally): Request<LifecycleConfigurationDescription, AWSError>
    open fun describeLifecycleConfiguration(callback: (err: AWSError, data: LifecycleConfigurationDescription) -> Unit = definedExternally): Request<LifecycleConfigurationDescription, AWSError>
    open fun describeMountTargetSecurityGroups(params: DescribeMountTargetSecurityGroupsRequest, callback: (err: AWSError, data: DescribeMountTargetSecurityGroupsResponse) -> Unit = definedExternally): Request<DescribeMountTargetSecurityGroupsResponse, AWSError>
    open fun describeMountTargetSecurityGroups(callback: (err: AWSError, data: DescribeMountTargetSecurityGroupsResponse) -> Unit = definedExternally): Request<DescribeMountTargetSecurityGroupsResponse, AWSError>
    open fun describeMountTargets(params: DescribeMountTargetsRequest, callback: (err: AWSError, data: DescribeMountTargetsResponse) -> Unit = definedExternally): Request<DescribeMountTargetsResponse, AWSError>
    open fun describeMountTargets(callback: (err: AWSError, data: DescribeMountTargetsResponse) -> Unit = definedExternally): Request<DescribeMountTargetsResponse, AWSError>
    open fun describeTags(params: DescribeTagsRequest, callback: (err: AWSError, data: DescribeTagsResponse) -> Unit = definedExternally): Request<DescribeTagsResponse, AWSError>
    open fun describeTags(callback: (err: AWSError, data: DescribeTagsResponse) -> Unit = definedExternally): Request<DescribeTagsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun modifyMountTargetSecurityGroups(params: ModifyMountTargetSecurityGroupsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun modifyMountTargetSecurityGroups(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putFileSystemPolicy(params: PutFileSystemPolicyRequest, callback: (err: AWSError, data: FileSystemPolicyDescription) -> Unit = definedExternally): Request<FileSystemPolicyDescription, AWSError>
    open fun putFileSystemPolicy(callback: (err: AWSError, data: FileSystemPolicyDescription) -> Unit = definedExternally): Request<FileSystemPolicyDescription, AWSError>
    open fun putLifecycleConfiguration(params: PutLifecycleConfigurationRequest, callback: (err: AWSError, data: LifecycleConfigurationDescription) -> Unit = definedExternally): Request<LifecycleConfigurationDescription, AWSError>
    open fun putLifecycleConfiguration(callback: (err: AWSError, data: LifecycleConfigurationDescription) -> Unit = definedExternally): Request<LifecycleConfigurationDescription, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateFileSystem(params: UpdateFileSystemRequest, callback: (err: AWSError, data: FileSystemDescription) -> Unit = definedExternally): Request<FileSystemDescription, AWSError>
    open fun updateFileSystem(callback: (err: AWSError, data: FileSystemDescription) -> Unit = definedExternally): Request<FileSystemDescription, AWSError>
    interface AccessPointDescription {
        var ClientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var AccessPointId: AccessPointId?
            get() = definedExternally
            set(value) = definedExternally
        var AccessPointArn: AccessPointArn?
            get() = definedExternally
            set(value) = definedExternally
        var FileSystemId: FileSystemId?
            get() = definedExternally
            set(value) = definedExternally
        var PosixUser: PosixUser?
            get() = definedExternally
            set(value) = definedExternally
        var RootDirectory: RootDirectory?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerId: AwsAccountId?
            get() = definedExternally
            set(value) = definedExternally
        var LifeCycleState: String /* "creating" | "available" | "updating" | "deleting" | "deleted" | String */
    }
    interface CreateAccessPointRequest {
        var ClientToken: ClientToken
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var FileSystemId: FileSystemId
        var PosixUser: PosixUser?
            get() = definedExternally
            set(value) = definedExternally
        var RootDirectory: RootDirectory?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFileSystemRequest {
        var CreationToken: CreationToken
        var PerformanceMode: String /* "generalPurpose" | "maxIO" | String */
        var Encrypted: Encrypted?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var ThroughputMode: String /* "bursting" | "provisioned" | String */
        var ProvisionedThroughputInMibps: ProvisionedThroughputInMibps?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateMountTargetRequest {
        var FileSystemId: FileSystemId
        var SubnetId: SubnetId
        var IpAddress: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroups: SecurityGroups?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTagsRequest {
        var FileSystemId: FileSystemId
        var Tags: Tags
    }
    interface CreationInfo {
        var OwnerUid: OwnerUid
        var OwnerGid: OwnerGid
        var Permissions: Permissions
    }
    interface DeleteAccessPointRequest {
        var AccessPointId: AccessPointId
    }
    interface DeleteFileSystemPolicyRequest {
        var FileSystemId: FileSystemId
    }
    interface DeleteFileSystemRequest {
        var FileSystemId: FileSystemId
    }
    interface DeleteMountTargetRequest {
        var MountTargetId: MountTargetId
    }
    interface DeleteTagsRequest {
        var FileSystemId: FileSystemId
        var TagKeys: TagKeys
    }
    interface DescribeAccessPointsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var AccessPointId: AccessPointId?
            get() = definedExternally
            set(value) = definedExternally
        var FileSystemId: FileSystemId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAccessPointsResponse {
        var AccessPoints: AccessPointDescriptions?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFileSystemPolicyRequest {
        var FileSystemId: FileSystemId
    }
    interface DescribeFileSystemsRequest {
        var MaxItems: MaxItems?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var CreationToken: CreationToken?
            get() = definedExternally
            set(value) = definedExternally
        var FileSystemId: FileSystemId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFileSystemsResponse {
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var FileSystems: FileSystemDescriptions?
            get() = definedExternally
            set(value) = definedExternally
        var NextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLifecycleConfigurationRequest {
        var FileSystemId: FileSystemId
    }
    interface DescribeMountTargetSecurityGroupsRequest {
        var MountTargetId: MountTargetId
    }
    interface DescribeMountTargetSecurityGroupsResponse {
        var SecurityGroups: SecurityGroups
    }
    interface DescribeMountTargetsRequest {
        var MaxItems: MaxItems?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var FileSystemId: FileSystemId?
            get() = definedExternally
            set(value) = definedExternally
        var MountTargetId: MountTargetId?
            get() = definedExternally
            set(value) = definedExternally
        var AccessPointId: AccessPointId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMountTargetsResponse {
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var MountTargets: MountTargetDescriptions?
            get() = definedExternally
            set(value) = definedExternally
        var NextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTagsRequest {
        var MaxItems: MaxItems?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var FileSystemId: FileSystemId
    }
    interface DescribeTagsResponse {
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags
        var NextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FileSystemDescription {
        var OwnerId: AwsAccountId
        var CreationToken: CreationToken
        var FileSystemId: FileSystemId
        var CreationTime: Timestamp
        var LifeCycleState: String /* "creating" | "available" | "updating" | "deleting" | "deleted" | String */
        var Name: TagValue?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfMountTargets: MountTargetCount
        var SizeInBytes: FileSystemSize
        var PerformanceMode: String /* "generalPurpose" | "maxIO" | String */
        var Encrypted: Encrypted?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var ThroughputMode: String /* "bursting" | "provisioned" | String */
        var ProvisionedThroughputInMibps: ProvisionedThroughputInMibps?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags
    }
    interface FileSystemPolicyDescription {
        var FileSystemId: FileSystemId?
            get() = definedExternally
            set(value) = definedExternally
        var Policy: Policy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FileSystemSize {
        var Value: FileSystemSizeValue
        var Timestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ValueInIA: FileSystemNullableSizeValue?
            get() = definedExternally
            set(value) = definedExternally
        var ValueInStandard: FileSystemNullableSizeValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LifecycleConfigurationDescription {
        var LifecyclePolicies: LifecyclePolicies?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LifecyclePolicy {
        var TransitionToIA: String /* "AFTER_7_DAYS" | "AFTER_14_DAYS" | "AFTER_30_DAYS" | "AFTER_60_DAYS" | "AFTER_90_DAYS" | String */
    }
    interface ListTagsForResourceRequest {
        var ResourceId: ResourceId
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceResponse {
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyMountTargetSecurityGroupsRequest {
        var MountTargetId: MountTargetId
        var SecurityGroups: SecurityGroups?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MountTargetDescription {
        var OwnerId: AwsAccountId?
            get() = definedExternally
            set(value) = definedExternally
        var MountTargetId: MountTargetId
        var FileSystemId: FileSystemId
        var SubnetId: SubnetId
        var LifeCycleState: String /* "creating" | "available" | "updating" | "deleting" | "deleted" | String */
        var IpAddress: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkInterfaceId: NetworkInterfaceId?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZoneId: AvailabilityZoneId?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZoneName: AvailabilityZoneName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PosixUser {
        var Uid: Uid
        var Gid: Gid
        var SecondaryGids: SecondaryGids?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutFileSystemPolicyRequest {
        var FileSystemId: FileSystemId
        var Policy: Policy
        var BypassPolicyLockoutSafetyCheck: BypassPolicyLockoutSafetyCheck?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutLifecycleConfigurationRequest {
        var FileSystemId: FileSystemId
        var LifecyclePolicies: LifecyclePolicies
    }
    interface RootDirectory {
        var Path: Path?
            get() = definedExternally
            set(value) = definedExternally
        var CreationInfo: CreationInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface TagResourceRequest {
        var ResourceId: ResourceId
        var Tags: Tags
    }
    interface UntagResourceRequest {
        var ResourceId: ResourceId
        var TagKeys: TagKeys?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFileSystemRequest {
        var FileSystemId: FileSystemId
        var ThroughputMode: String /* "bursting" | "provisioned" | String */
        var ProvisionedThroughputInMibps: ProvisionedThroughputInMibps?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2015-02-01" | "latest" | String */
    }
}