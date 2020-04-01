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
import DAX.Cluster
import DAX.Event
import DAX.Node
import DAX.NodeTypeSpecificValue
import DAX.ParameterGroup
import DAX.Parameter
import DAX.ParameterNameValue
import DAX.SecurityGroupMembership
import DAX.SubnetGroup
import DAX.Subnet
import DAX.Tag
import DAX.CreateClusterRequest
import DAX.CreateClusterResponse
import DAX.CreateParameterGroupRequest
import DAX.CreateParameterGroupResponse
import DAX.CreateSubnetGroupRequest
import DAX.CreateSubnetGroupResponse
import DAX.DecreaseReplicationFactorRequest
import DAX.DecreaseReplicationFactorResponse
import DAX.DeleteClusterRequest
import DAX.DeleteClusterResponse
import DAX.DeleteParameterGroupRequest
import DAX.DeleteParameterGroupResponse
import DAX.DeleteSubnetGroupRequest
import DAX.DeleteSubnetGroupResponse
import DAX.DescribeClustersRequest
import DAX.DescribeClustersResponse
import DAX.DescribeDefaultParametersRequest
import DAX.DescribeDefaultParametersResponse
import DAX.DescribeEventsRequest
import DAX.DescribeEventsResponse
import DAX.DescribeParameterGroupsRequest
import DAX.DescribeParameterGroupsResponse
import DAX.DescribeParametersRequest
import DAX.DescribeParametersResponse
import DAX.DescribeSubnetGroupsRequest
import DAX.DescribeSubnetGroupsResponse
import DAX.IncreaseReplicationFactorRequest
import DAX.IncreaseReplicationFactorResponse
import DAX.ListTagsRequest
import DAX.ListTagsResponse
import DAX.RebootNodeRequest
import DAX.RebootNodeResponse
import DAX.TagResourceRequest
import DAX.TagResourceResponse
import DAX.UntagResourceRequest
import DAX.UntagResourceResponse
import DAX.UpdateClusterRequest
import DAX.UpdateClusterResponse
import DAX.UpdateParameterGroupRequest
import DAX.UpdateParameterGroupResponse
import DAX.UpdateSubnetGroupRequest
import DAX.UpdateSubnetGroupResponse
import DAX.Endpoint
import DAX.NotificationConfiguration
import DAX.ParameterGroupStatus
import DAX.SSEDescription
import DAX.SSESpecification

typealias AvailabilityZoneList = Array<String>

typealias ClusterList = Array<Cluster>

typealias ClusterNameList = Array<String>

typealias EventList = Array<Event>

typealias Integer = Number

typealias IntegerOptional = Number

typealias KeyList = Array<String>

typealias NodeIdentifierList = Array<String>

typealias NodeList = Array<Node>

typealias NodeTypeSpecificValueList = Array<NodeTypeSpecificValue>

typealias ParameterGroupList = Array<ParameterGroup>

typealias ParameterGroupNameList = Array<String>

typealias ParameterList = Array<Parameter>

typealias ParameterNameValueList = Array<ParameterNameValue>

typealias SSEEnabled = Boolean

typealias SecurityGroupIdentifierList = Array<String>

typealias SecurityGroupMembershipList = Array<SecurityGroupMembership>

typealias String = String

typealias SubnetGroupList = Array<SubnetGroup>

typealias SubnetGroupNameList = Array<String>

typealias SubnetIdentifierList = Array<String>

typealias SubnetList = Array<Subnet>

typealias TStamp = Date

typealias TagList = Array<Tag>

@JsModule("aws-sdk")
external open class DAX(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & DAX.Types.ClientConfiguration */
    open fun createCluster(params: CreateClusterRequest, callback: (err: AWSError, data: CreateClusterResponse) -> Unit = definedExternally): Request<CreateClusterResponse, AWSError>
    open fun createCluster(callback: (err: AWSError, data: CreateClusterResponse) -> Unit = definedExternally): Request<CreateClusterResponse, AWSError>
    open fun createParameterGroup(params: CreateParameterGroupRequest, callback: (err: AWSError, data: CreateParameterGroupResponse) -> Unit = definedExternally): Request<CreateParameterGroupResponse, AWSError>
    open fun createParameterGroup(callback: (err: AWSError, data: CreateParameterGroupResponse) -> Unit = definedExternally): Request<CreateParameterGroupResponse, AWSError>
    open fun createSubnetGroup(params: CreateSubnetGroupRequest, callback: (err: AWSError, data: CreateSubnetGroupResponse) -> Unit = definedExternally): Request<CreateSubnetGroupResponse, AWSError>
    open fun createSubnetGroup(callback: (err: AWSError, data: CreateSubnetGroupResponse) -> Unit = definedExternally): Request<CreateSubnetGroupResponse, AWSError>
    open fun decreaseReplicationFactor(params: DecreaseReplicationFactorRequest, callback: (err: AWSError, data: DecreaseReplicationFactorResponse) -> Unit = definedExternally): Request<DecreaseReplicationFactorResponse, AWSError>
    open fun decreaseReplicationFactor(callback: (err: AWSError, data: DecreaseReplicationFactorResponse) -> Unit = definedExternally): Request<DecreaseReplicationFactorResponse, AWSError>
    open fun deleteCluster(params: DeleteClusterRequest, callback: (err: AWSError, data: DeleteClusterResponse) -> Unit = definedExternally): Request<DeleteClusterResponse, AWSError>
    open fun deleteCluster(callback: (err: AWSError, data: DeleteClusterResponse) -> Unit = definedExternally): Request<DeleteClusterResponse, AWSError>
    open fun deleteParameterGroup(params: DeleteParameterGroupRequest, callback: (err: AWSError, data: DeleteParameterGroupResponse) -> Unit = definedExternally): Request<DeleteParameterGroupResponse, AWSError>
    open fun deleteParameterGroup(callback: (err: AWSError, data: DeleteParameterGroupResponse) -> Unit = definedExternally): Request<DeleteParameterGroupResponse, AWSError>
    open fun deleteSubnetGroup(params: DeleteSubnetGroupRequest, callback: (err: AWSError, data: DeleteSubnetGroupResponse) -> Unit = definedExternally): Request<DeleteSubnetGroupResponse, AWSError>
    open fun deleteSubnetGroup(callback: (err: AWSError, data: DeleteSubnetGroupResponse) -> Unit = definedExternally): Request<DeleteSubnetGroupResponse, AWSError>
    open fun describeClusters(params: DescribeClustersRequest, callback: (err: AWSError, data: DescribeClustersResponse) -> Unit = definedExternally): Request<DescribeClustersResponse, AWSError>
    open fun describeClusters(callback: (err: AWSError, data: DescribeClustersResponse) -> Unit = definedExternally): Request<DescribeClustersResponse, AWSError>
    open fun describeDefaultParameters(params: DescribeDefaultParametersRequest, callback: (err: AWSError, data: DescribeDefaultParametersResponse) -> Unit = definedExternally): Request<DescribeDefaultParametersResponse, AWSError>
    open fun describeDefaultParameters(callback: (err: AWSError, data: DescribeDefaultParametersResponse) -> Unit = definedExternally): Request<DescribeDefaultParametersResponse, AWSError>
    open fun describeEvents(params: DescribeEventsRequest, callback: (err: AWSError, data: DescribeEventsResponse) -> Unit = definedExternally): Request<DescribeEventsResponse, AWSError>
    open fun describeEvents(callback: (err: AWSError, data: DescribeEventsResponse) -> Unit = definedExternally): Request<DescribeEventsResponse, AWSError>
    open fun describeParameterGroups(params: DescribeParameterGroupsRequest, callback: (err: AWSError, data: DescribeParameterGroupsResponse) -> Unit = definedExternally): Request<DescribeParameterGroupsResponse, AWSError>
    open fun describeParameterGroups(callback: (err: AWSError, data: DescribeParameterGroupsResponse) -> Unit = definedExternally): Request<DescribeParameterGroupsResponse, AWSError>
    open fun describeParameters(params: DescribeParametersRequest, callback: (err: AWSError, data: DescribeParametersResponse) -> Unit = definedExternally): Request<DescribeParametersResponse, AWSError>
    open fun describeParameters(callback: (err: AWSError, data: DescribeParametersResponse) -> Unit = definedExternally): Request<DescribeParametersResponse, AWSError>
    open fun describeSubnetGroups(params: DescribeSubnetGroupsRequest, callback: (err: AWSError, data: DescribeSubnetGroupsResponse) -> Unit = definedExternally): Request<DescribeSubnetGroupsResponse, AWSError>
    open fun describeSubnetGroups(callback: (err: AWSError, data: DescribeSubnetGroupsResponse) -> Unit = definedExternally): Request<DescribeSubnetGroupsResponse, AWSError>
    open fun increaseReplicationFactor(params: IncreaseReplicationFactorRequest, callback: (err: AWSError, data: IncreaseReplicationFactorResponse) -> Unit = definedExternally): Request<IncreaseReplicationFactorResponse, AWSError>
    open fun increaseReplicationFactor(callback: (err: AWSError, data: IncreaseReplicationFactorResponse) -> Unit = definedExternally): Request<IncreaseReplicationFactorResponse, AWSError>
    open fun listTags(params: ListTagsRequest, callback: (err: AWSError, data: ListTagsResponse) -> Unit = definedExternally): Request<ListTagsResponse, AWSError>
    open fun listTags(callback: (err: AWSError, data: ListTagsResponse) -> Unit = definedExternally): Request<ListTagsResponse, AWSError>
    open fun rebootNode(params: RebootNodeRequest, callback: (err: AWSError, data: RebootNodeResponse) -> Unit = definedExternally): Request<RebootNodeResponse, AWSError>
    open fun rebootNode(callback: (err: AWSError, data: RebootNodeResponse) -> Unit = definedExternally): Request<RebootNodeResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateCluster(params: UpdateClusterRequest, callback: (err: AWSError, data: UpdateClusterResponse) -> Unit = definedExternally): Request<UpdateClusterResponse, AWSError>
    open fun updateCluster(callback: (err: AWSError, data: UpdateClusterResponse) -> Unit = definedExternally): Request<UpdateClusterResponse, AWSError>
    open fun updateParameterGroup(params: UpdateParameterGroupRequest, callback: (err: AWSError, data: UpdateParameterGroupResponse) -> Unit = definedExternally): Request<UpdateParameterGroupResponse, AWSError>
    open fun updateParameterGroup(callback: (err: AWSError, data: UpdateParameterGroupResponse) -> Unit = definedExternally): Request<UpdateParameterGroupResponse, AWSError>
    open fun updateSubnetGroup(params: UpdateSubnetGroupRequest, callback: (err: AWSError, data: UpdateSubnetGroupResponse) -> Unit = definedExternally): Request<UpdateSubnetGroupResponse, AWSError>
    open fun updateSubnetGroup(callback: (err: AWSError, data: UpdateSubnetGroupResponse) -> Unit = definedExternally): Request<UpdateSubnetGroupResponse, AWSError>
    interface Cluster {
        var ClusterName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var TotalNodes: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ActiveNodes: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var NodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterDiscoveryEndpoint: Endpoint?
            get() = definedExternally
            set(value) = definedExternally
        var NodeIdsToRemove: NodeIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var Nodes: NodeList?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationConfiguration: NotificationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetGroup: String?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroups: SecurityGroupMembershipList?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterGroup: ParameterGroupStatus?
            get() = definedExternally
            set(value) = definedExternally
        var SSEDescription: SSEDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClusterRequest {
        var ClusterName: String
        var NodeType: String
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationFactor: Integer
        var AvailabilityZones: AvailabilityZoneList?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: SecurityGroupIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationTopicArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoleArn: String
        var ParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var SSESpecification: SSESpecification?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClusterResponse {
        var Cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateParameterGroupRequest {
        var ParameterGroupName: String
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateParameterGroupResponse {
        var ParameterGroup: ParameterGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSubnetGroupRequest {
        var SubnetGroupName: String
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: SubnetIdentifierList
    }
    interface CreateSubnetGroupResponse {
        var SubnetGroup: SubnetGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DecreaseReplicationFactorRequest {
        var ClusterName: String
        var NewReplicationFactor: Integer
        var AvailabilityZones: AvailabilityZoneList?
            get() = definedExternally
            set(value) = definedExternally
        var NodeIdsToRemove: NodeIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DecreaseReplicationFactorResponse {
        var Cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteClusterRequest {
        var ClusterName: String
    }
    interface DeleteClusterResponse {
        var Cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteParameterGroupRequest {
        var ParameterGroupName: String
    }
    interface DeleteParameterGroupResponse {
        var DeletionMessage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteSubnetGroupRequest {
        var SubnetGroupName: String
    }
    interface DeleteSubnetGroupResponse {
        var DeletionMessage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeClustersRequest {
        var ClusterNames: ClusterNameList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeClustersResponse {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var Clusters: ClusterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDefaultParametersRequest {
        var MaxResults: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDefaultParametersResponse {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: ParameterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventsRequest {
        var SourceName: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceType: String /* "CLUSTER" | "PARAMETER_GROUP" | "SUBNET_GROUP" | String */
        var StartTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventsResponse {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var Events: EventList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeParameterGroupsRequest {
        var ParameterGroupNames: ParameterGroupNameList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeParameterGroupsResponse {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterGroups: ParameterGroupList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeParametersRequest {
        var ParameterGroupName: String
        var Source: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeParametersResponse {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: ParameterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSubnetGroupsRequest {
        var SubnetGroupNames: SubnetGroupNameList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSubnetGroupsResponse {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetGroups: SubnetGroupList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Endpoint {
        var Address: String?
            get() = definedExternally
            set(value) = definedExternally
        var Port: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Event {
        var SourceName: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceType: String /* "CLUSTER" | "PARAMETER_GROUP" | "SUBNET_GROUP" | String */
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
        var Date: TStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IncreaseReplicationFactorRequest {
        var ClusterName: String
        var NewReplicationFactor: Integer
        var AvailabilityZones: AvailabilityZoneList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IncreaseReplicationFactorResponse {
        var Cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsRequest {
        var ResourceName: String
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsResponse {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Node {
        var NodeId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Endpoint: Endpoint?
            get() = definedExternally
            set(value) = definedExternally
        var NodeCreateTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var NodeStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterGroupStatus: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodeTypeSpecificValue {
        var NodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Value: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NotificationConfiguration {
        var TopicArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var TopicStatus: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Parameter {
        var ParameterName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterType: String /* "DEFAULT" | "NODE_TYPE_SPECIFIC" | String */
        var ParameterValue: String?
            get() = definedExternally
            set(value) = definedExternally
        var NodeTypeSpecificValues: NodeTypeSpecificValueList?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var Source: String?
            get() = definedExternally
            set(value) = definedExternally
        var DataType: String?
            get() = definedExternally
            set(value) = definedExternally
        var AllowedValues: String?
            get() = definedExternally
            set(value) = definedExternally
        var IsModifiable: String /* "TRUE" | "FALSE" | "CONDITIONAL" | String */
        var ChangeType: String /* "IMMEDIATE" | "REQUIRES_REBOOT" | String */
    }
    interface ParameterGroup {
        var ParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ParameterGroupStatus {
        var ParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterApplyStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var NodeIdsToReboot: NodeIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ParameterNameValue {
        var ParameterName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterValue: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RebootNodeRequest {
        var ClusterName: String
        var NodeId: String
    }
    interface RebootNodeResponse {
        var Cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SSEDescription {
        var Status: String /* "ENABLING" | "ENABLED" | "DISABLING" | "DISABLED" | String */
    }
    interface SSESpecification {
        var Enabled: SSEEnabled
    }
    interface SecurityGroupMembership {
        var SecurityGroupIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Subnet {
        var SubnetIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetAvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SubnetGroup {
        var SubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Subnets: SubnetList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: String?
            get() = definedExternally
            set(value) = definedExternally
        var Value: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var ResourceName: String
        var Tags: TagList
    }
    interface TagResourceResponse {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceRequest {
        var ResourceName: String
        var TagKeys: KeyList
    }
    interface UntagResourceResponse {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateClusterRequest {
        var ClusterName: String
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationTopicArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationTopicStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: SecurityGroupIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateClusterResponse {
        var Cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateParameterGroupRequest {
        var ParameterGroupName: String
        var ParameterNameValues: ParameterNameValueList
    }
    interface UpdateParameterGroupResponse {
        var ParameterGroup: ParameterGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSubnetGroupRequest {
        var SubnetGroupName: String
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: SubnetIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSubnetGroupResponse {
        var SubnetGroup: SubnetGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-04-19" | "latest" | String */
    }
}