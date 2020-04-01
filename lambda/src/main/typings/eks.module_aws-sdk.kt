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
import EKS.AutoScalingGroup
import EKS.EncryptionConfig
import EKS.ErrorDetail
import EKS.FargateProfileSelector
import EKS.Issue
import EKS.LogSetup
import EKS.UpdateParam
import EKS.CreateClusterRequest
import EKS.CreateClusterResponse
import EKS.CreateFargateProfileRequest
import EKS.CreateFargateProfileResponse
import EKS.CreateNodegroupRequest
import EKS.CreateNodegroupResponse
import EKS.DeleteClusterRequest
import EKS.DeleteClusterResponse
import EKS.DeleteFargateProfileRequest
import EKS.DeleteFargateProfileResponse
import EKS.DeleteNodegroupRequest
import EKS.DeleteNodegroupResponse
import EKS.DescribeClusterRequest
import EKS.DescribeClusterResponse
import EKS.DescribeFargateProfileRequest
import EKS.DescribeFargateProfileResponse
import EKS.DescribeNodegroupRequest
import EKS.DescribeNodegroupResponse
import EKS.DescribeUpdateRequest
import EKS.DescribeUpdateResponse
import EKS.ListClustersRequest
import EKS.ListClustersResponse
import EKS.ListFargateProfilesRequest
import EKS.ListFargateProfilesResponse
import EKS.ListNodegroupsRequest
import EKS.ListNodegroupsResponse
import EKS.ListTagsForResourceRequest
import EKS.ListTagsForResourceResponse
import EKS.ListUpdatesRequest
import EKS.ListUpdatesResponse
import EKS.TagResourceRequest
import EKS.TagResourceResponse
import EKS.UntagResourceRequest
import EKS.UntagResourceResponse
import EKS.UpdateClusterConfigRequest
import EKS.UpdateClusterConfigResponse
import EKS.UpdateClusterVersionRequest
import EKS.UpdateClusterVersionResponse
import EKS.UpdateNodegroupConfigRequest
import EKS.UpdateNodegroupConfigResponse
import EKS.UpdateNodegroupVersionRequest
import EKS.UpdateNodegroupVersionResponse
import EKS.VpcConfigResponse
import EKS.Logging
import EKS.Identity
import EKS.Certificate
import EKS.TagMap
import EKS.VpcConfigRequest
import EKS.Cluster
import EKS.FargateProfile
import EKS.NodegroupScalingConfig
import EKS.RemoteAccessConfig
import EKS.labelsMap
import EKS.Nodegroup
import EKS.Update
import EKS.Provider
import EKS.FargateProfileLabel
import EKS.OIDC
import EKS.NodegroupResources
import EKS.NodegroupHealth
import EKS.UpdateLabelsPayload

typealias AutoScalingGroupList = Array<AutoScalingGroup>

typealias Boolean = Boolean

typealias BoxedBoolean = Boolean

typealias BoxedInteger = Number

typealias Capacity = Number

typealias ClusterName = String

typealias EncryptionConfigList = Array<EncryptionConfig>

typealias ErrorDetails = Array<ErrorDetail>

typealias FargateProfileSelectors = Array<FargateProfileSelector>

typealias FargateProfilesRequestMaxResults = Number

typealias IssueList = Array<Issue>

typealias ListClustersRequestMaxResults = Number

typealias ListNodegroupsRequestMaxResults = Number

typealias ListUpdatesRequestMaxResults = Number

typealias LogSetups = Array<LogSetup>

typealias LogTypes = Array<String /* "api" | "audit" | "authenticator" | "controllerManager" | "scheduler" | String */>

typealias String = String

typealias StringList = Array<String>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagValue = String

typealias Timestamp = Date

typealias UpdateParams = Array<UpdateParam>

typealias labelKey = String

typealias labelValue = String

typealias labelsKeyList = Array<String>

@JsModule("aws-sdk")
external open class EKS(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & EKS.Types.ClientConfiguration */
    open fun createCluster(params: CreateClusterRequest, callback: (err: AWSError, data: CreateClusterResponse) -> Unit = definedExternally): Request<CreateClusterResponse, AWSError>
    open fun createCluster(callback: (err: AWSError, data: CreateClusterResponse) -> Unit = definedExternally): Request<CreateClusterResponse, AWSError>
    open fun createFargateProfile(params: CreateFargateProfileRequest, callback: (err: AWSError, data: CreateFargateProfileResponse) -> Unit = definedExternally): Request<CreateFargateProfileResponse, AWSError>
    open fun createFargateProfile(callback: (err: AWSError, data: CreateFargateProfileResponse) -> Unit = definedExternally): Request<CreateFargateProfileResponse, AWSError>
    open fun createNodegroup(params: CreateNodegroupRequest, callback: (err: AWSError, data: CreateNodegroupResponse) -> Unit = definedExternally): Request<CreateNodegroupResponse, AWSError>
    open fun createNodegroup(callback: (err: AWSError, data: CreateNodegroupResponse) -> Unit = definedExternally): Request<CreateNodegroupResponse, AWSError>
    open fun deleteCluster(params: DeleteClusterRequest, callback: (err: AWSError, data: DeleteClusterResponse) -> Unit = definedExternally): Request<DeleteClusterResponse, AWSError>
    open fun deleteCluster(callback: (err: AWSError, data: DeleteClusterResponse) -> Unit = definedExternally): Request<DeleteClusterResponse, AWSError>
    open fun deleteFargateProfile(params: DeleteFargateProfileRequest, callback: (err: AWSError, data: DeleteFargateProfileResponse) -> Unit = definedExternally): Request<DeleteFargateProfileResponse, AWSError>
    open fun deleteFargateProfile(callback: (err: AWSError, data: DeleteFargateProfileResponse) -> Unit = definedExternally): Request<DeleteFargateProfileResponse, AWSError>
    open fun deleteNodegroup(params: DeleteNodegroupRequest, callback: (err: AWSError, data: DeleteNodegroupResponse) -> Unit = definedExternally): Request<DeleteNodegroupResponse, AWSError>
    open fun deleteNodegroup(callback: (err: AWSError, data: DeleteNodegroupResponse) -> Unit = definedExternally): Request<DeleteNodegroupResponse, AWSError>
    open fun describeCluster(params: DescribeClusterRequest, callback: (err: AWSError, data: DescribeClusterResponse) -> Unit = definedExternally): Request<DescribeClusterResponse, AWSError>
    open fun describeCluster(callback: (err: AWSError, data: DescribeClusterResponse) -> Unit = definedExternally): Request<DescribeClusterResponse, AWSError>
    open fun describeFargateProfile(params: DescribeFargateProfileRequest, callback: (err: AWSError, data: DescribeFargateProfileResponse) -> Unit = definedExternally): Request<DescribeFargateProfileResponse, AWSError>
    open fun describeFargateProfile(callback: (err: AWSError, data: DescribeFargateProfileResponse) -> Unit = definedExternally): Request<DescribeFargateProfileResponse, AWSError>
    open fun describeNodegroup(params: DescribeNodegroupRequest, callback: (err: AWSError, data: DescribeNodegroupResponse) -> Unit = definedExternally): Request<DescribeNodegroupResponse, AWSError>
    open fun describeNodegroup(callback: (err: AWSError, data: DescribeNodegroupResponse) -> Unit = definedExternally): Request<DescribeNodegroupResponse, AWSError>
    open fun describeUpdate(params: DescribeUpdateRequest, callback: (err: AWSError, data: DescribeUpdateResponse) -> Unit = definedExternally): Request<DescribeUpdateResponse, AWSError>
    open fun describeUpdate(callback: (err: AWSError, data: DescribeUpdateResponse) -> Unit = definedExternally): Request<DescribeUpdateResponse, AWSError>
    open fun listClusters(params: ListClustersRequest, callback: (err: AWSError, data: ListClustersResponse) -> Unit = definedExternally): Request<ListClustersResponse, AWSError>
    open fun listClusters(callback: (err: AWSError, data: ListClustersResponse) -> Unit = definedExternally): Request<ListClustersResponse, AWSError>
    open fun listFargateProfiles(params: ListFargateProfilesRequest, callback: (err: AWSError, data: ListFargateProfilesResponse) -> Unit = definedExternally): Request<ListFargateProfilesResponse, AWSError>
    open fun listFargateProfiles(callback: (err: AWSError, data: ListFargateProfilesResponse) -> Unit = definedExternally): Request<ListFargateProfilesResponse, AWSError>
    open fun listNodegroups(params: ListNodegroupsRequest, callback: (err: AWSError, data: ListNodegroupsResponse) -> Unit = definedExternally): Request<ListNodegroupsResponse, AWSError>
    open fun listNodegroups(callback: (err: AWSError, data: ListNodegroupsResponse) -> Unit = definedExternally): Request<ListNodegroupsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listUpdates(params: ListUpdatesRequest, callback: (err: AWSError, data: ListUpdatesResponse) -> Unit = definedExternally): Request<ListUpdatesResponse, AWSError>
    open fun listUpdates(callback: (err: AWSError, data: ListUpdatesResponse) -> Unit = definedExternally): Request<ListUpdatesResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateClusterConfig(params: UpdateClusterConfigRequest, callback: (err: AWSError, data: UpdateClusterConfigResponse) -> Unit = definedExternally): Request<UpdateClusterConfigResponse, AWSError>
    open fun updateClusterConfig(callback: (err: AWSError, data: UpdateClusterConfigResponse) -> Unit = definedExternally): Request<UpdateClusterConfigResponse, AWSError>
    open fun updateClusterVersion(params: UpdateClusterVersionRequest, callback: (err: AWSError, data: UpdateClusterVersionResponse) -> Unit = definedExternally): Request<UpdateClusterVersionResponse, AWSError>
    open fun updateClusterVersion(callback: (err: AWSError, data: UpdateClusterVersionResponse) -> Unit = definedExternally): Request<UpdateClusterVersionResponse, AWSError>
    open fun updateNodegroupConfig(params: UpdateNodegroupConfigRequest, callback: (err: AWSError, data: UpdateNodegroupConfigResponse) -> Unit = definedExternally): Request<UpdateNodegroupConfigResponse, AWSError>
    open fun updateNodegroupConfig(callback: (err: AWSError, data: UpdateNodegroupConfigResponse) -> Unit = definedExternally): Request<UpdateNodegroupConfigResponse, AWSError>
    open fun updateNodegroupVersion(params: UpdateNodegroupVersionRequest, callback: (err: AWSError, data: UpdateNodegroupVersionResponse) -> Unit = definedExternally): Request<UpdateNodegroupVersionResponse, AWSError>
    open fun updateNodegroupVersion(callback: (err: AWSError, data: UpdateNodegroupVersionResponse) -> Unit = definedExternally): Request<UpdateNodegroupVersionResponse, AWSError>
    open fun waitFor(state: String, params: DescribeClusterRequest, callback: (err: AWSError, data: DescribeClusterResponse) -> Unit = definedExternally): Request<DescribeClusterResponse, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DescribeClusterResponse) -> Unit = definedExternally): Request<DescribeClusterResponse, AWSError>
    open fun waitFor(state: String, params: DescribeNodegroupRequest, callback: (err: AWSError, data: DescribeNodegroupResponse) -> Unit = definedExternally): Request<DescribeNodegroupResponse, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DescribeNodegroupResponse) -> Unit = definedExternally): Request<DescribeNodegroupResponse, AWSError>
    interface AutoScalingGroup {
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Certificate {
        var data: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Cluster {
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var version: String?
            get() = definedExternally
            set(value) = definedExternally
        var endpoint: String?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var resourcesVpcConfig: VpcConfigResponse?
            get() = definedExternally
            set(value) = definedExternally
        var logging: Logging?
            get() = definedExternally
            set(value) = definedExternally
        var identity: Identity?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "CREATING" | "ACTIVE" | "DELETING" | "FAILED" | "UPDATING" | String */
        var certificateAuthority: Certificate?
            get() = definedExternally
            set(value) = definedExternally
        var clientRequestToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var platformVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var encryptionConfig: EncryptionConfigList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClusterRequest {
        var name: ClusterName
        var version: String?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: String
        var resourcesVpcConfig: VpcConfigRequest
        var logging: Logging?
            get() = definedExternally
            set(value) = definedExternally
        var clientRequestToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var encryptionConfig: EncryptionConfigList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClusterResponse {
        var cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFargateProfileRequest {
        var fargateProfileName: String
        var clusterName: String
        var podExecutionRoleArn: String
        var subnets: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var selectors: FargateProfileSelectors?
            get() = definedExternally
            set(value) = definedExternally
        var clientRequestToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFargateProfileResponse {
        var fargateProfile: FargateProfile?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateNodegroupRequest {
        var clusterName: String
        var nodegroupName: String
        var scalingConfig: NodegroupScalingConfig?
            get() = definedExternally
            set(value) = definedExternally
        var diskSize: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var subnets: StringList
        var instanceTypes: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var amiType: String /* "AL2_x86_64" | "AL2_x86_64_GPU" | String */
        var remoteAccess: RemoteAccessConfig?
            get() = definedExternally
            set(value) = definedExternally
        var nodeRole: String
        var labels: labelsMap?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var clientRequestToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var version: String?
            get() = definedExternally
            set(value) = definedExternally
        var releaseVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateNodegroupResponse {
        var nodegroup: Nodegroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteClusterRequest {
        var name: String
    }
    interface DeleteClusterResponse {
        var cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteFargateProfileRequest {
        var clusterName: String
        var fargateProfileName: String
    }
    interface DeleteFargateProfileResponse {
        var fargateProfile: FargateProfile?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteNodegroupRequest {
        var clusterName: String
        var nodegroupName: String
    }
    interface DeleteNodegroupResponse {
        var nodegroup: Nodegroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeClusterRequest {
        var name: String
    }
    interface DescribeClusterResponse {
        var cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFargateProfileRequest {
        var clusterName: String
        var fargateProfileName: String
    }
    interface DescribeFargateProfileResponse {
        var fargateProfile: FargateProfile?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeNodegroupRequest {
        var clusterName: String
        var nodegroupName: String
    }
    interface DescribeNodegroupResponse {
        var nodegroup: Nodegroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUpdateRequest {
        var name: String
        var updateId: String
        var nodegroupName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUpdateResponse {
        var update: Update?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EncryptionConfig {
        var resources: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var provider: Provider?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ErrorDetail {
        var errorCode: String /* "SubnetNotFound" | "SecurityGroupNotFound" | "EniLimitReached" | "IpNotAvailable" | "AccessDenied" | "OperationNotPermitted" | "VpcIdNotFound" | "Unknown" | "NodeCreationFailure" | "PodEvictionFailure" | "InsufficientFreeAddresses" | String */
        var errorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var resourceIds: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FargateProfile {
        var fargateProfileName: String?
            get() = definedExternally
            set(value) = definedExternally
        var fargateProfileArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var clusterName: String?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var podExecutionRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var subnets: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var selectors: FargateProfileSelectors?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "CREATING" | "ACTIVE" | "DELETING" | "CREATE_FAILED" | "DELETE_FAILED" | String */
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FargateProfileLabel {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface FargateProfileSelector {
        var namespace: String?
            get() = definedExternally
            set(value) = definedExternally
        var labels: FargateProfileLabel?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Identity {
        var oidc: OIDC?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Issue {
        var code: String /* "AutoScalingGroupNotFound" | "AutoScalingGroupInvalidConfiguration" | "Ec2SecurityGroupNotFound" | "Ec2SecurityGroupDeletionFailure" | "Ec2LaunchTemplateNotFound" | "Ec2LaunchTemplateVersionMismatch" | "Ec2SubnetNotFound" | "Ec2SubnetInvalidConfiguration" | "IamInstanceProfileNotFound" | "IamLimitExceeded" | "IamNodeRoleNotFound" | "NodeCreationFailure" | "AsgInstanceLaunchFailures" | "InstanceLimitExceeded" | "InsufficientFreeAddresses" | "AccessDenied" | "InternalFailure" | String */
        var message: String?
            get() = definedExternally
            set(value) = definedExternally
        var resourceIds: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListClustersRequest {
        var maxResults: ListClustersRequestMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListClustersResponse {
        var clusters: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFargateProfilesRequest {
        var clusterName: String
        var maxResults: FargateProfilesRequestMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFargateProfilesResponse {
        var fargateProfileNames: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListNodegroupsRequest {
        var clusterName: String
        var maxResults: ListNodegroupsRequestMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListNodegroupsResponse {
        var nodegroups: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var resourceArn: String
    }
    interface ListTagsForResourceResponse {
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUpdatesRequest {
        var name: String
        var nodegroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: ListUpdatesRequestMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUpdatesResponse {
        var updateIds: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogSetup {
        var types: LogTypes?
            get() = definedExternally
            set(value) = definedExternally
        var enabled: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Logging {
        var clusterLogging: LogSetups?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Nodegroup {
        var nodegroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var nodegroupArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var clusterName: String?
            get() = definedExternally
            set(value) = definedExternally
        var version: String?
            get() = definedExternally
            set(value) = definedExternally
        var releaseVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var modifiedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "CREATING" | "ACTIVE" | "UPDATING" | "DELETING" | "CREATE_FAILED" | "DELETE_FAILED" | "DEGRADED" | String */
        var scalingConfig: NodegroupScalingConfig?
            get() = definedExternally
            set(value) = definedExternally
        var instanceTypes: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var subnets: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var remoteAccess: RemoteAccessConfig?
            get() = definedExternally
            set(value) = definedExternally
        var amiType: String /* "AL2_x86_64" | "AL2_x86_64_GPU" | String */
        var nodeRole: String?
            get() = definedExternally
            set(value) = definedExternally
        var labels: labelsMap?
            get() = definedExternally
            set(value) = definedExternally
        var resources: NodegroupResources?
            get() = definedExternally
            set(value) = definedExternally
        var diskSize: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var health: NodegroupHealth?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodegroupHealth {
        var issues: IssueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodegroupResources {
        var autoScalingGroups: AutoScalingGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var remoteAccessSecurityGroup: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodegroupScalingConfig {
        var minSize: Capacity?
            get() = definedExternally
            set(value) = definedExternally
        var maxSize: Capacity?
            get() = definedExternally
            set(value) = definedExternally
        var desiredSize: Capacity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OIDC {
        var issuer: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Provider {
        var keyArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoteAccessConfig {
        var ec2SshKey: String?
            get() = definedExternally
            set(value) = definedExternally
        var sourceSecurityGroups: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagMap {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface TagResourceRequest {
        var resourceArn: String
        var tags: TagMap
    }
    interface TagResourceResponse
    interface UntagResourceRequest {
        var resourceArn: String
        var tagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface Update {
        var id: String?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "InProgress" | "Failed" | "Cancelled" | "Successful" | String */
        var type: String /* "VersionUpdate" | "EndpointAccessUpdate" | "LoggingUpdate" | "ConfigUpdate" | String */
        var params: UpdateParams?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var errors: ErrorDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateClusterConfigRequest {
        var name: String
        var resourcesVpcConfig: VpcConfigRequest?
            get() = definedExternally
            set(value) = definedExternally
        var logging: Logging?
            get() = definedExternally
            set(value) = definedExternally
        var clientRequestToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateClusterConfigResponse {
        var update: Update?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateClusterVersionRequest {
        var name: String
        var version: String
        var clientRequestToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateClusterVersionResponse {
        var update: Update?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateLabelsPayload {
        var addOrUpdateLabels: labelsMap?
            get() = definedExternally
            set(value) = definedExternally
        var removeLabels: labelsKeyList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateNodegroupConfigRequest {
        var clusterName: String
        var nodegroupName: String
        var labels: UpdateLabelsPayload?
            get() = definedExternally
            set(value) = definedExternally
        var scalingConfig: NodegroupScalingConfig?
            get() = definedExternally
            set(value) = definedExternally
        var clientRequestToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateNodegroupConfigResponse {
        var update: Update?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateNodegroupVersionRequest {
        var clusterName: String
        var nodegroupName: String
        var version: String?
            get() = definedExternally
            set(value) = definedExternally
        var releaseVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var force: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var clientRequestToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateNodegroupVersionResponse {
        var update: Update?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateParam {
        var type: String /* "Version" | "PlatformVersion" | "EndpointPrivateAccess" | "EndpointPublicAccess" | "ClusterLogging" | "DesiredSize" | "LabelsToAdd" | "LabelsToRemove" | "MaxSize" | "MinSize" | "ReleaseVersion" | "PublicAccessCidrs" | String */
        var value: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VpcConfigRequest {
        var subnetIds: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var securityGroupIds: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var endpointPublicAccess: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var endpointPrivateAccess: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var publicAccessCidrs: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VpcConfigResponse {
        var subnetIds: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var securityGroupIds: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var clusterSecurityGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var vpcId: String?
            get() = definedExternally
            set(value) = definedExternally
        var endpointPublicAccess: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var endpointPrivateAccess: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var publicAccessCidrs: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface labelsMap {
        @nativeGetter
        operator fun get(key: String): labelValue?
        @nativeSetter
        operator fun set(key: String, value: labelValue)
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-11-01" | "latest" | String */
    }
}