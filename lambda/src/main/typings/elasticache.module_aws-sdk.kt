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
import ElastiCache.CacheCluster
import ElastiCache.CacheEngineVersion
import ElastiCache.CacheNode
import ElastiCache.CacheNodeTypeSpecificParameter
import ElastiCache.CacheNodeTypeSpecificValue
import ElastiCache.CacheNodeUpdateStatus
import ElastiCache.CacheParameterGroup
import ElastiCache.CacheSecurityGroupMembership
import ElastiCache.CacheSecurityGroup
import ElastiCache.CacheSubnetGroup
import ElastiCache.CustomerNodeEndpoint
import ElastiCache.EC2SecurityGroup
import ElastiCache.Event
import ElastiCache.GlobalNodeGroup
import ElastiCache.GlobalReplicationGroup
import ElastiCache.GlobalReplicationGroupMember
import ElastiCache.NodeGroupConfiguration
import ElastiCache.NodeGroup
import ElastiCache.NodeGroupMember
import ElastiCache.NodeGroupMemberUpdateStatus
import ElastiCache.NodeGroupUpdateStatus
import ElastiCache.NodeSnapshot
import ElastiCache.ParameterNameValue
import ElastiCache.Parameter
import ElastiCache.ProcessedUpdateAction
import ElastiCache.RecurringCharge
import ElastiCache.RegionalConfiguration
import ElastiCache.ConfigureShard
import ElastiCache.ReplicationGroup
import ElastiCache.ReservedCacheNode
import ElastiCache.ReservedCacheNodesOffering
import ElastiCache.ReshardingConfiguration
import ElastiCache.SecurityGroupMembership
import ElastiCache.ServiceUpdate
import ElastiCache.Snapshot
import ElastiCache.Subnet
import ElastiCache.Tag
import ElastiCache.UnprocessedUpdateAction
import ElastiCache.UpdateAction
import ElastiCache.AddTagsToResourceMessage
import ElastiCache.TagListMessage
import ElastiCache.AuthorizeCacheSecurityGroupIngressMessage
import ElastiCache.AuthorizeCacheSecurityGroupIngressResult
import ElastiCache.BatchApplyUpdateActionMessage
import ElastiCache.UpdateActionResultsMessage
import ElastiCache.BatchStopUpdateActionMessage
import ElastiCache.CompleteMigrationMessage
import ElastiCache.CompleteMigrationResponse
import ElastiCache.CopySnapshotMessage
import ElastiCache.CopySnapshotResult
import ElastiCache.CreateCacheClusterMessage
import ElastiCache.CreateCacheClusterResult
import ElastiCache.CreateCacheParameterGroupMessage
import ElastiCache.CreateCacheParameterGroupResult
import ElastiCache.CreateCacheSecurityGroupMessage
import ElastiCache.CreateCacheSecurityGroupResult
import ElastiCache.CreateCacheSubnetGroupMessage
import ElastiCache.CreateCacheSubnetGroupResult
import ElastiCache.CreateGlobalReplicationGroupMessage
import ElastiCache.CreateGlobalReplicationGroupResult
import ElastiCache.CreateReplicationGroupMessage
import ElastiCache.CreateReplicationGroupResult
import ElastiCache.CreateSnapshotMessage
import ElastiCache.CreateSnapshotResult
import ElastiCache.DecreaseNodeGroupsInGlobalReplicationGroupMessage
import ElastiCache.DecreaseNodeGroupsInGlobalReplicationGroupResult
import ElastiCache.DecreaseReplicaCountMessage
import ElastiCache.DecreaseReplicaCountResult
import ElastiCache.DeleteCacheClusterMessage
import ElastiCache.DeleteCacheClusterResult
import ElastiCache.DeleteCacheParameterGroupMessage
import ElastiCache.DeleteCacheSecurityGroupMessage
import ElastiCache.DeleteCacheSubnetGroupMessage
import ElastiCache.DeleteGlobalReplicationGroupMessage
import ElastiCache.DeleteGlobalReplicationGroupResult
import ElastiCache.DeleteReplicationGroupMessage
import ElastiCache.DeleteReplicationGroupResult
import ElastiCache.DeleteSnapshotMessage
import ElastiCache.DeleteSnapshotResult
import ElastiCache.DescribeCacheClustersMessage
import ElastiCache.CacheClusterMessage
import ElastiCache.DescribeCacheEngineVersionsMessage
import ElastiCache.CacheEngineVersionMessage
import ElastiCache.DescribeCacheParameterGroupsMessage
import ElastiCache.CacheParameterGroupsMessage
import ElastiCache.DescribeCacheParametersMessage
import ElastiCache.CacheParameterGroupDetails
import ElastiCache.DescribeCacheSecurityGroupsMessage
import ElastiCache.CacheSecurityGroupMessage
import ElastiCache.DescribeCacheSubnetGroupsMessage
import ElastiCache.CacheSubnetGroupMessage
import ElastiCache.DescribeEngineDefaultParametersMessage
import ElastiCache.DescribeEngineDefaultParametersResult
import ElastiCache.DescribeEventsMessage
import ElastiCache.EventsMessage
import ElastiCache.DescribeGlobalReplicationGroupsMessage
import ElastiCache.DescribeGlobalReplicationGroupsResult
import ElastiCache.DescribeReplicationGroupsMessage
import ElastiCache.ReplicationGroupMessage
import ElastiCache.DescribeReservedCacheNodesMessage
import ElastiCache.ReservedCacheNodeMessage
import ElastiCache.DescribeReservedCacheNodesOfferingsMessage
import ElastiCache.ReservedCacheNodesOfferingMessage
import ElastiCache.DescribeServiceUpdatesMessage
import ElastiCache.ServiceUpdatesMessage
import ElastiCache.DescribeSnapshotsMessage
import ElastiCache.DescribeSnapshotsListMessage
import ElastiCache.DescribeUpdateActionsMessage
import ElastiCache.UpdateActionsMessage
import ElastiCache.DisassociateGlobalReplicationGroupMessage
import ElastiCache.DisassociateGlobalReplicationGroupResult
import ElastiCache.FailoverGlobalReplicationGroupMessage
import ElastiCache.FailoverGlobalReplicationGroupResult
import ElastiCache.IncreaseNodeGroupsInGlobalReplicationGroupMessage
import ElastiCache.IncreaseNodeGroupsInGlobalReplicationGroupResult
import ElastiCache.IncreaseReplicaCountMessage
import ElastiCache.IncreaseReplicaCountResult
import ElastiCache.ListAllowedNodeTypeModificationsMessage
import ElastiCache.AllowedNodeTypeModificationsMessage
import ElastiCache.ListTagsForResourceMessage
import ElastiCache.ModifyCacheClusterMessage
import ElastiCache.ModifyCacheClusterResult
import ElastiCache.ModifyCacheParameterGroupMessage
import ElastiCache.CacheParameterGroupNameMessage
import ElastiCache.ModifyCacheSubnetGroupMessage
import ElastiCache.ModifyCacheSubnetGroupResult
import ElastiCache.ModifyGlobalReplicationGroupMessage
import ElastiCache.ModifyGlobalReplicationGroupResult
import ElastiCache.ModifyReplicationGroupMessage
import ElastiCache.ModifyReplicationGroupResult
import ElastiCache.ModifyReplicationGroupShardConfigurationMessage
import ElastiCache.ModifyReplicationGroupShardConfigurationResult
import ElastiCache.PurchaseReservedCacheNodesOfferingMessage
import ElastiCache.PurchaseReservedCacheNodesOfferingResult
import ElastiCache.RebalanceSlotsInGlobalReplicationGroupMessage
import ElastiCache.RebalanceSlotsInGlobalReplicationGroupResult
import ElastiCache.RebootCacheClusterMessage
import ElastiCache.RebootCacheClusterResult
import ElastiCache.RemoveTagsFromResourceMessage
import ElastiCache.ResetCacheParameterGroupMessage
import ElastiCache.RevokeCacheSecurityGroupIngressMessage
import ElastiCache.RevokeCacheSecurityGroupIngressResult
import ElastiCache.StartMigrationMessage
import ElastiCache.StartMigrationResponse
import ElastiCache.TestFailoverMessage
import ElastiCache.TestFailoverResult
import ElastiCache.Endpoint
import ElastiCache.PendingModifiedValues
import ElastiCache.NotificationConfiguration
import ElastiCache.CacheParameterGroupStatus
import ElastiCache.EngineDefaults
import ElastiCache.TimeRangeFilter
import ElastiCache.GlobalReplicationGroupInfo
import ElastiCache.ReplicationGroupPendingModifiedValues
import ElastiCache.ReshardingStatus
import ElastiCache.SlotMigration
import ElastiCache.AvailabilityZone

typealias AllowedNodeGroupId = String

typealias AvailabilityZonesList = Array<String>

typealias Boolean = Boolean

typealias BooleanOptional = Boolean

typealias CacheClusterIdList = Array<String>

typealias CacheClusterList = Array<CacheCluster>

typealias CacheEngineVersionList = Array<CacheEngineVersion>

typealias CacheNodeIdsList = Array<String>

typealias CacheNodeList = Array<CacheNode>

typealias CacheNodeTypeSpecificParametersList = Array<CacheNodeTypeSpecificParameter>

typealias CacheNodeTypeSpecificValueList = Array<CacheNodeTypeSpecificValue>

typealias CacheNodeUpdateStatusList = Array<CacheNodeUpdateStatus>

typealias CacheParameterGroupList = Array<CacheParameterGroup>

typealias CacheSecurityGroupMembershipList = Array<CacheSecurityGroupMembership>

typealias CacheSecurityGroupNameList = Array<String>

typealias CacheSecurityGroups = Array<CacheSecurityGroup>

typealias CacheSubnetGroups = Array<CacheSubnetGroup>

typealias ClusterIdList = Array<String>

typealias CustomerNodeEndpointList = Array<CustomerNodeEndpoint>

typealias Double = Number

typealias EC2SecurityGroupList = Array<EC2SecurityGroup>

typealias EventList = Array<Event>

typealias GlobalNodeGroupIdList = Array<String>

typealias GlobalNodeGroupList = Array<GlobalNodeGroup>

typealias GlobalReplicationGroupList = Array<GlobalReplicationGroup>

typealias GlobalReplicationGroupMemberList = Array<GlobalReplicationGroupMember>

typealias Integer = Number

typealias IntegerOptional = Number

typealias KeyList = Array<String>

typealias NodeGroupConfigurationList = Array<NodeGroupConfiguration>

typealias NodeGroupList = Array<NodeGroup>

typealias NodeGroupMemberList = Array<NodeGroupMember>

typealias NodeGroupMemberUpdateStatusList = Array<NodeGroupMemberUpdateStatus>

typealias NodeGroupUpdateStatusList = Array<NodeGroupUpdateStatus>

typealias NodeGroupsToRemoveList = Array<AllowedNodeGroupId>

typealias NodeGroupsToRetainList = Array<AllowedNodeGroupId>

typealias NodeSnapshotList = Array<NodeSnapshot>

typealias NodeTypeList = Array<String>

typealias ParameterNameValueList = Array<ParameterNameValue>

typealias ParametersList = Array<Parameter>

typealias PreferredAvailabilityZoneList = Array<String>

typealias ProcessedUpdateActionList = Array<ProcessedUpdateAction>

typealias RecurringChargeList = Array<RecurringCharge>

typealias RegionalConfigurationList = Array<RegionalConfiguration>

typealias RemoveReplicasList = Array<String>

typealias ReplicaConfigurationList = Array<ConfigureShard>

typealias ReplicationGroupIdList = Array<String>

typealias ReplicationGroupList = Array<ReplicationGroup>

typealias ReservedCacheNodeList = Array<ReservedCacheNode>

typealias ReservedCacheNodesOfferingList = Array<ReservedCacheNodesOffering>

typealias ReshardingConfigurationList = Array<ReshardingConfiguration>

typealias SecurityGroupIdsList = Array<String>

typealias SecurityGroupMembershipList = Array<SecurityGroupMembership>

typealias ServiceUpdateList = Array<ServiceUpdate>

typealias ServiceUpdateStatusList = Array<String /* "available" | "cancelled" | "expired" | String */>

typealias SnapshotArnsList = Array<String>

typealias SnapshotList = Array<Snapshot>

typealias String = String

typealias SubnetIdentifierList = Array<String>

typealias SubnetList = Array<Subnet>

typealias TStamp = Date

typealias TagList = Array<Tag>

typealias UnprocessedUpdateActionList = Array<UnprocessedUpdateAction>

typealias UpdateActionList = Array<UpdateAction>

typealias UpdateActionStatusList = Array<String /* "not-applied" | "waiting-to-start" | "in-progress" | "stopping" | "stopped" | "complete" | String */>

@JsModule("aws-sdk")
external open class ElastiCache(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ElastiCache.Types.ClientConfiguration */
    open fun addTagsToResource(params: AddTagsToResourceMessage, callback: (err: AWSError, data: TagListMessage) -> Unit = definedExternally): Request<TagListMessage, AWSError>
    open fun addTagsToResource(callback: (err: AWSError, data: TagListMessage) -> Unit = definedExternally): Request<TagListMessage, AWSError>
    open fun authorizeCacheSecurityGroupIngress(params: AuthorizeCacheSecurityGroupIngressMessage, callback: (err: AWSError, data: AuthorizeCacheSecurityGroupIngressResult) -> Unit = definedExternally): Request<AuthorizeCacheSecurityGroupIngressResult, AWSError>
    open fun authorizeCacheSecurityGroupIngress(callback: (err: AWSError, data: AuthorizeCacheSecurityGroupIngressResult) -> Unit = definedExternally): Request<AuthorizeCacheSecurityGroupIngressResult, AWSError>
    open fun batchApplyUpdateAction(params: BatchApplyUpdateActionMessage, callback: (err: AWSError, data: UpdateActionResultsMessage) -> Unit = definedExternally): Request<UpdateActionResultsMessage, AWSError>
    open fun batchApplyUpdateAction(callback: (err: AWSError, data: UpdateActionResultsMessage) -> Unit = definedExternally): Request<UpdateActionResultsMessage, AWSError>
    open fun batchStopUpdateAction(params: BatchStopUpdateActionMessage, callback: (err: AWSError, data: UpdateActionResultsMessage) -> Unit = definedExternally): Request<UpdateActionResultsMessage, AWSError>
    open fun batchStopUpdateAction(callback: (err: AWSError, data: UpdateActionResultsMessage) -> Unit = definedExternally): Request<UpdateActionResultsMessage, AWSError>
    open fun completeMigration(params: CompleteMigrationMessage, callback: (err: AWSError, data: CompleteMigrationResponse) -> Unit = definedExternally): Request<CompleteMigrationResponse, AWSError>
    open fun completeMigration(callback: (err: AWSError, data: CompleteMigrationResponse) -> Unit = definedExternally): Request<CompleteMigrationResponse, AWSError>
    open fun copySnapshot(params: CopySnapshotMessage, callback: (err: AWSError, data: CopySnapshotResult) -> Unit = definedExternally): Request<CopySnapshotResult, AWSError>
    open fun copySnapshot(callback: (err: AWSError, data: CopySnapshotResult) -> Unit = definedExternally): Request<CopySnapshotResult, AWSError>
    open fun createCacheCluster(params: CreateCacheClusterMessage, callback: (err: AWSError, data: CreateCacheClusterResult) -> Unit = definedExternally): Request<CreateCacheClusterResult, AWSError>
    open fun createCacheCluster(callback: (err: AWSError, data: CreateCacheClusterResult) -> Unit = definedExternally): Request<CreateCacheClusterResult, AWSError>
    open fun createCacheParameterGroup(params: CreateCacheParameterGroupMessage, callback: (err: AWSError, data: CreateCacheParameterGroupResult) -> Unit = definedExternally): Request<CreateCacheParameterGroupResult, AWSError>
    open fun createCacheParameterGroup(callback: (err: AWSError, data: CreateCacheParameterGroupResult) -> Unit = definedExternally): Request<CreateCacheParameterGroupResult, AWSError>
    open fun createCacheSecurityGroup(params: CreateCacheSecurityGroupMessage, callback: (err: AWSError, data: CreateCacheSecurityGroupResult) -> Unit = definedExternally): Request<CreateCacheSecurityGroupResult, AWSError>
    open fun createCacheSecurityGroup(callback: (err: AWSError, data: CreateCacheSecurityGroupResult) -> Unit = definedExternally): Request<CreateCacheSecurityGroupResult, AWSError>
    open fun createCacheSubnetGroup(params: CreateCacheSubnetGroupMessage, callback: (err: AWSError, data: CreateCacheSubnetGroupResult) -> Unit = definedExternally): Request<CreateCacheSubnetGroupResult, AWSError>
    open fun createCacheSubnetGroup(callback: (err: AWSError, data: CreateCacheSubnetGroupResult) -> Unit = definedExternally): Request<CreateCacheSubnetGroupResult, AWSError>
    open fun createGlobalReplicationGroup(params: CreateGlobalReplicationGroupMessage, callback: (err: AWSError, data: CreateGlobalReplicationGroupResult) -> Unit = definedExternally): Request<CreateGlobalReplicationGroupResult, AWSError>
    open fun createGlobalReplicationGroup(callback: (err: AWSError, data: CreateGlobalReplicationGroupResult) -> Unit = definedExternally): Request<CreateGlobalReplicationGroupResult, AWSError>
    open fun createReplicationGroup(params: CreateReplicationGroupMessage, callback: (err: AWSError, data: CreateReplicationGroupResult) -> Unit = definedExternally): Request<CreateReplicationGroupResult, AWSError>
    open fun createReplicationGroup(callback: (err: AWSError, data: CreateReplicationGroupResult) -> Unit = definedExternally): Request<CreateReplicationGroupResult, AWSError>
    open fun createSnapshot(params: CreateSnapshotMessage, callback: (err: AWSError, data: CreateSnapshotResult) -> Unit = definedExternally): Request<CreateSnapshotResult, AWSError>
    open fun createSnapshot(callback: (err: AWSError, data: CreateSnapshotResult) -> Unit = definedExternally): Request<CreateSnapshotResult, AWSError>
    open fun decreaseNodeGroupsInGlobalReplicationGroup(params: DecreaseNodeGroupsInGlobalReplicationGroupMessage, callback: (err: AWSError, data: DecreaseNodeGroupsInGlobalReplicationGroupResult) -> Unit = definedExternally): Request<DecreaseNodeGroupsInGlobalReplicationGroupResult, AWSError>
    open fun decreaseNodeGroupsInGlobalReplicationGroup(callback: (err: AWSError, data: DecreaseNodeGroupsInGlobalReplicationGroupResult) -> Unit = definedExternally): Request<DecreaseNodeGroupsInGlobalReplicationGroupResult, AWSError>
    open fun decreaseReplicaCount(params: DecreaseReplicaCountMessage, callback: (err: AWSError, data: DecreaseReplicaCountResult) -> Unit = definedExternally): Request<DecreaseReplicaCountResult, AWSError>
    open fun decreaseReplicaCount(callback: (err: AWSError, data: DecreaseReplicaCountResult) -> Unit = definedExternally): Request<DecreaseReplicaCountResult, AWSError>
    open fun deleteCacheCluster(params: DeleteCacheClusterMessage, callback: (err: AWSError, data: DeleteCacheClusterResult) -> Unit = definedExternally): Request<DeleteCacheClusterResult, AWSError>
    open fun deleteCacheCluster(callback: (err: AWSError, data: DeleteCacheClusterResult) -> Unit = definedExternally): Request<DeleteCacheClusterResult, AWSError>
    open fun deleteCacheParameterGroup(params: DeleteCacheParameterGroupMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteCacheParameterGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteCacheSecurityGroup(params: DeleteCacheSecurityGroupMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteCacheSecurityGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteCacheSubnetGroup(params: DeleteCacheSubnetGroupMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteCacheSubnetGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteGlobalReplicationGroup(params: DeleteGlobalReplicationGroupMessage, callback: (err: AWSError, data: DeleteGlobalReplicationGroupResult) -> Unit = definedExternally): Request<DeleteGlobalReplicationGroupResult, AWSError>
    open fun deleteGlobalReplicationGroup(callback: (err: AWSError, data: DeleteGlobalReplicationGroupResult) -> Unit = definedExternally): Request<DeleteGlobalReplicationGroupResult, AWSError>
    open fun deleteReplicationGroup(params: DeleteReplicationGroupMessage, callback: (err: AWSError, data: DeleteReplicationGroupResult) -> Unit = definedExternally): Request<DeleteReplicationGroupResult, AWSError>
    open fun deleteReplicationGroup(callback: (err: AWSError, data: DeleteReplicationGroupResult) -> Unit = definedExternally): Request<DeleteReplicationGroupResult, AWSError>
    open fun deleteSnapshot(params: DeleteSnapshotMessage, callback: (err: AWSError, data: DeleteSnapshotResult) -> Unit = definedExternally): Request<DeleteSnapshotResult, AWSError>
    open fun deleteSnapshot(callback: (err: AWSError, data: DeleteSnapshotResult) -> Unit = definedExternally): Request<DeleteSnapshotResult, AWSError>
    open fun describeCacheClusters(params: DescribeCacheClustersMessage, callback: (err: AWSError, data: CacheClusterMessage) -> Unit = definedExternally): Request<CacheClusterMessage, AWSError>
    open fun describeCacheClusters(callback: (err: AWSError, data: CacheClusterMessage) -> Unit = definedExternally): Request<CacheClusterMessage, AWSError>
    open fun describeCacheEngineVersions(params: DescribeCacheEngineVersionsMessage, callback: (err: AWSError, data: CacheEngineVersionMessage) -> Unit = definedExternally): Request<CacheEngineVersionMessage, AWSError>
    open fun describeCacheEngineVersions(callback: (err: AWSError, data: CacheEngineVersionMessage) -> Unit = definedExternally): Request<CacheEngineVersionMessage, AWSError>
    open fun describeCacheParameterGroups(params: DescribeCacheParameterGroupsMessage, callback: (err: AWSError, data: CacheParameterGroupsMessage) -> Unit = definedExternally): Request<CacheParameterGroupsMessage, AWSError>
    open fun describeCacheParameterGroups(callback: (err: AWSError, data: CacheParameterGroupsMessage) -> Unit = definedExternally): Request<CacheParameterGroupsMessage, AWSError>
    open fun describeCacheParameters(params: DescribeCacheParametersMessage, callback: (err: AWSError, data: CacheParameterGroupDetails) -> Unit = definedExternally): Request<CacheParameterGroupDetails, AWSError>
    open fun describeCacheParameters(callback: (err: AWSError, data: CacheParameterGroupDetails) -> Unit = definedExternally): Request<CacheParameterGroupDetails, AWSError>
    open fun describeCacheSecurityGroups(params: DescribeCacheSecurityGroupsMessage, callback: (err: AWSError, data: CacheSecurityGroupMessage) -> Unit = definedExternally): Request<CacheSecurityGroupMessage, AWSError>
    open fun describeCacheSecurityGroups(callback: (err: AWSError, data: CacheSecurityGroupMessage) -> Unit = definedExternally): Request<CacheSecurityGroupMessage, AWSError>
    open fun describeCacheSubnetGroups(params: DescribeCacheSubnetGroupsMessage, callback: (err: AWSError, data: CacheSubnetGroupMessage) -> Unit = definedExternally): Request<CacheSubnetGroupMessage, AWSError>
    open fun describeCacheSubnetGroups(callback: (err: AWSError, data: CacheSubnetGroupMessage) -> Unit = definedExternally): Request<CacheSubnetGroupMessage, AWSError>
    open fun describeEngineDefaultParameters(params: DescribeEngineDefaultParametersMessage, callback: (err: AWSError, data: DescribeEngineDefaultParametersResult) -> Unit = definedExternally): Request<DescribeEngineDefaultParametersResult, AWSError>
    open fun describeEngineDefaultParameters(callback: (err: AWSError, data: DescribeEngineDefaultParametersResult) -> Unit = definedExternally): Request<DescribeEngineDefaultParametersResult, AWSError>
    open fun describeEvents(params: DescribeEventsMessage, callback: (err: AWSError, data: EventsMessage) -> Unit = definedExternally): Request<EventsMessage, AWSError>
    open fun describeEvents(callback: (err: AWSError, data: EventsMessage) -> Unit = definedExternally): Request<EventsMessage, AWSError>
    open fun describeGlobalReplicationGroups(params: DescribeGlobalReplicationGroupsMessage, callback: (err: AWSError, data: DescribeGlobalReplicationGroupsResult) -> Unit = definedExternally): Request<DescribeGlobalReplicationGroupsResult, AWSError>
    open fun describeGlobalReplicationGroups(callback: (err: AWSError, data: DescribeGlobalReplicationGroupsResult) -> Unit = definedExternally): Request<DescribeGlobalReplicationGroupsResult, AWSError>
    open fun describeReplicationGroups(params: DescribeReplicationGroupsMessage, callback: (err: AWSError, data: ReplicationGroupMessage) -> Unit = definedExternally): Request<ReplicationGroupMessage, AWSError>
    open fun describeReplicationGroups(callback: (err: AWSError, data: ReplicationGroupMessage) -> Unit = definedExternally): Request<ReplicationGroupMessage, AWSError>
    open fun describeReservedCacheNodes(params: DescribeReservedCacheNodesMessage, callback: (err: AWSError, data: ReservedCacheNodeMessage) -> Unit = definedExternally): Request<ReservedCacheNodeMessage, AWSError>
    open fun describeReservedCacheNodes(callback: (err: AWSError, data: ReservedCacheNodeMessage) -> Unit = definedExternally): Request<ReservedCacheNodeMessage, AWSError>
    open fun describeReservedCacheNodesOfferings(params: DescribeReservedCacheNodesOfferingsMessage, callback: (err: AWSError, data: ReservedCacheNodesOfferingMessage) -> Unit = definedExternally): Request<ReservedCacheNodesOfferingMessage, AWSError>
    open fun describeReservedCacheNodesOfferings(callback: (err: AWSError, data: ReservedCacheNodesOfferingMessage) -> Unit = definedExternally): Request<ReservedCacheNodesOfferingMessage, AWSError>
    open fun describeServiceUpdates(params: DescribeServiceUpdatesMessage, callback: (err: AWSError, data: ServiceUpdatesMessage) -> Unit = definedExternally): Request<ServiceUpdatesMessage, AWSError>
    open fun describeServiceUpdates(callback: (err: AWSError, data: ServiceUpdatesMessage) -> Unit = definedExternally): Request<ServiceUpdatesMessage, AWSError>
    open fun describeSnapshots(params: DescribeSnapshotsMessage, callback: (err: AWSError, data: DescribeSnapshotsListMessage) -> Unit = definedExternally): Request<DescribeSnapshotsListMessage, AWSError>
    open fun describeSnapshots(callback: (err: AWSError, data: DescribeSnapshotsListMessage) -> Unit = definedExternally): Request<DescribeSnapshotsListMessage, AWSError>
    open fun describeUpdateActions(params: DescribeUpdateActionsMessage, callback: (err: AWSError, data: UpdateActionsMessage) -> Unit = definedExternally): Request<UpdateActionsMessage, AWSError>
    open fun describeUpdateActions(callback: (err: AWSError, data: UpdateActionsMessage) -> Unit = definedExternally): Request<UpdateActionsMessage, AWSError>
    open fun disassociateGlobalReplicationGroup(params: DisassociateGlobalReplicationGroupMessage, callback: (err: AWSError, data: DisassociateGlobalReplicationGroupResult) -> Unit = definedExternally): Request<DisassociateGlobalReplicationGroupResult, AWSError>
    open fun disassociateGlobalReplicationGroup(callback: (err: AWSError, data: DisassociateGlobalReplicationGroupResult) -> Unit = definedExternally): Request<DisassociateGlobalReplicationGroupResult, AWSError>
    open fun failoverGlobalReplicationGroup(params: FailoverGlobalReplicationGroupMessage, callback: (err: AWSError, data: FailoverGlobalReplicationGroupResult) -> Unit = definedExternally): Request<FailoverGlobalReplicationGroupResult, AWSError>
    open fun failoverGlobalReplicationGroup(callback: (err: AWSError, data: FailoverGlobalReplicationGroupResult) -> Unit = definedExternally): Request<FailoverGlobalReplicationGroupResult, AWSError>
    open fun increaseNodeGroupsInGlobalReplicationGroup(params: IncreaseNodeGroupsInGlobalReplicationGroupMessage, callback: (err: AWSError, data: IncreaseNodeGroupsInGlobalReplicationGroupResult) -> Unit = definedExternally): Request<IncreaseNodeGroupsInGlobalReplicationGroupResult, AWSError>
    open fun increaseNodeGroupsInGlobalReplicationGroup(callback: (err: AWSError, data: IncreaseNodeGroupsInGlobalReplicationGroupResult) -> Unit = definedExternally): Request<IncreaseNodeGroupsInGlobalReplicationGroupResult, AWSError>
    open fun increaseReplicaCount(params: IncreaseReplicaCountMessage, callback: (err: AWSError, data: IncreaseReplicaCountResult) -> Unit = definedExternally): Request<IncreaseReplicaCountResult, AWSError>
    open fun increaseReplicaCount(callback: (err: AWSError, data: IncreaseReplicaCountResult) -> Unit = definedExternally): Request<IncreaseReplicaCountResult, AWSError>
    open fun listAllowedNodeTypeModifications(params: ListAllowedNodeTypeModificationsMessage, callback: (err: AWSError, data: AllowedNodeTypeModificationsMessage) -> Unit = definedExternally): Request<AllowedNodeTypeModificationsMessage, AWSError>
    open fun listAllowedNodeTypeModifications(callback: (err: AWSError, data: AllowedNodeTypeModificationsMessage) -> Unit = definedExternally): Request<AllowedNodeTypeModificationsMessage, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceMessage, callback: (err: AWSError, data: TagListMessage) -> Unit = definedExternally): Request<TagListMessage, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: TagListMessage) -> Unit = definedExternally): Request<TagListMessage, AWSError>
    open fun modifyCacheCluster(params: ModifyCacheClusterMessage, callback: (err: AWSError, data: ModifyCacheClusterResult) -> Unit = definedExternally): Request<ModifyCacheClusterResult, AWSError>
    open fun modifyCacheCluster(callback: (err: AWSError, data: ModifyCacheClusterResult) -> Unit = definedExternally): Request<ModifyCacheClusterResult, AWSError>
    open fun modifyCacheParameterGroup(params: ModifyCacheParameterGroupMessage, callback: (err: AWSError, data: CacheParameterGroupNameMessage) -> Unit = definedExternally): Request<CacheParameterGroupNameMessage, AWSError>
    open fun modifyCacheParameterGroup(callback: (err: AWSError, data: CacheParameterGroupNameMessage) -> Unit = definedExternally): Request<CacheParameterGroupNameMessage, AWSError>
    open fun modifyCacheSubnetGroup(params: ModifyCacheSubnetGroupMessage, callback: (err: AWSError, data: ModifyCacheSubnetGroupResult) -> Unit = definedExternally): Request<ModifyCacheSubnetGroupResult, AWSError>
    open fun modifyCacheSubnetGroup(callback: (err: AWSError, data: ModifyCacheSubnetGroupResult) -> Unit = definedExternally): Request<ModifyCacheSubnetGroupResult, AWSError>
    open fun modifyGlobalReplicationGroup(params: ModifyGlobalReplicationGroupMessage, callback: (err: AWSError, data: ModifyGlobalReplicationGroupResult) -> Unit = definedExternally): Request<ModifyGlobalReplicationGroupResult, AWSError>
    open fun modifyGlobalReplicationGroup(callback: (err: AWSError, data: ModifyGlobalReplicationGroupResult) -> Unit = definedExternally): Request<ModifyGlobalReplicationGroupResult, AWSError>
    open fun modifyReplicationGroup(params: ModifyReplicationGroupMessage, callback: (err: AWSError, data: ModifyReplicationGroupResult) -> Unit = definedExternally): Request<ModifyReplicationGroupResult, AWSError>
    open fun modifyReplicationGroup(callback: (err: AWSError, data: ModifyReplicationGroupResult) -> Unit = definedExternally): Request<ModifyReplicationGroupResult, AWSError>
    open fun modifyReplicationGroupShardConfiguration(params: ModifyReplicationGroupShardConfigurationMessage, callback: (err: AWSError, data: ModifyReplicationGroupShardConfigurationResult) -> Unit = definedExternally): Request<ModifyReplicationGroupShardConfigurationResult, AWSError>
    open fun modifyReplicationGroupShardConfiguration(callback: (err: AWSError, data: ModifyReplicationGroupShardConfigurationResult) -> Unit = definedExternally): Request<ModifyReplicationGroupShardConfigurationResult, AWSError>
    open fun purchaseReservedCacheNodesOffering(params: PurchaseReservedCacheNodesOfferingMessage, callback: (err: AWSError, data: PurchaseReservedCacheNodesOfferingResult) -> Unit = definedExternally): Request<PurchaseReservedCacheNodesOfferingResult, AWSError>
    open fun purchaseReservedCacheNodesOffering(callback: (err: AWSError, data: PurchaseReservedCacheNodesOfferingResult) -> Unit = definedExternally): Request<PurchaseReservedCacheNodesOfferingResult, AWSError>
    open fun rebalanceSlotsInGlobalReplicationGroup(params: RebalanceSlotsInGlobalReplicationGroupMessage, callback: (err: AWSError, data: RebalanceSlotsInGlobalReplicationGroupResult) -> Unit = definedExternally): Request<RebalanceSlotsInGlobalReplicationGroupResult, AWSError>
    open fun rebalanceSlotsInGlobalReplicationGroup(callback: (err: AWSError, data: RebalanceSlotsInGlobalReplicationGroupResult) -> Unit = definedExternally): Request<RebalanceSlotsInGlobalReplicationGroupResult, AWSError>
    open fun rebootCacheCluster(params: RebootCacheClusterMessage, callback: (err: AWSError, data: RebootCacheClusterResult) -> Unit = definedExternally): Request<RebootCacheClusterResult, AWSError>
    open fun rebootCacheCluster(callback: (err: AWSError, data: RebootCacheClusterResult) -> Unit = definedExternally): Request<RebootCacheClusterResult, AWSError>
    open fun removeTagsFromResource(params: RemoveTagsFromResourceMessage, callback: (err: AWSError, data: TagListMessage) -> Unit = definedExternally): Request<TagListMessage, AWSError>
    open fun removeTagsFromResource(callback: (err: AWSError, data: TagListMessage) -> Unit = definedExternally): Request<TagListMessage, AWSError>
    open fun resetCacheParameterGroup(params: ResetCacheParameterGroupMessage, callback: (err: AWSError, data: CacheParameterGroupNameMessage) -> Unit = definedExternally): Request<CacheParameterGroupNameMessage, AWSError>
    open fun resetCacheParameterGroup(callback: (err: AWSError, data: CacheParameterGroupNameMessage) -> Unit = definedExternally): Request<CacheParameterGroupNameMessage, AWSError>
    open fun revokeCacheSecurityGroupIngress(params: RevokeCacheSecurityGroupIngressMessage, callback: (err: AWSError, data: RevokeCacheSecurityGroupIngressResult) -> Unit = definedExternally): Request<RevokeCacheSecurityGroupIngressResult, AWSError>
    open fun revokeCacheSecurityGroupIngress(callback: (err: AWSError, data: RevokeCacheSecurityGroupIngressResult) -> Unit = definedExternally): Request<RevokeCacheSecurityGroupIngressResult, AWSError>
    open fun startMigration(params: StartMigrationMessage, callback: (err: AWSError, data: StartMigrationResponse) -> Unit = definedExternally): Request<StartMigrationResponse, AWSError>
    open fun startMigration(callback: (err: AWSError, data: StartMigrationResponse) -> Unit = definedExternally): Request<StartMigrationResponse, AWSError>
    open fun testFailover(params: TestFailoverMessage, callback: (err: AWSError, data: TestFailoverResult) -> Unit = definedExternally): Request<TestFailoverResult, AWSError>
    open fun testFailover(callback: (err: AWSError, data: TestFailoverResult) -> Unit = definedExternally): Request<TestFailoverResult, AWSError>
    open fun waitFor(state: String, params: DescribeCacheClustersMessage, callback: (err: AWSError, data: CacheClusterMessage) -> Unit = definedExternally): Request<CacheClusterMessage, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: CacheClusterMessage) -> Unit = definedExternally): Request<CacheClusterMessage, AWSError>
    open fun waitFor(state: String, params: DescribeReplicationGroupsMessage, callback: (err: AWSError, data: ReplicationGroupMessage) -> Unit = definedExternally): Request<ReplicationGroupMessage, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: ReplicationGroupMessage) -> Unit = definedExternally): Request<ReplicationGroupMessage, AWSError>
    interface AddTagsToResourceMessage {
        var ResourceName: String
        var Tags: TagList
    }
    interface AllowedNodeTypeModificationsMessage {
        var ScaleUpModifications: NodeTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var ScaleDownModifications: NodeTypeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AuthorizeCacheSecurityGroupIngressMessage {
        var CacheSecurityGroupName: String
        var EC2SecurityGroupName: String
        var EC2SecurityGroupOwnerId: String
    }
    interface AuthorizeCacheSecurityGroupIngressResult {
        var CacheSecurityGroup: CacheSecurityGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AvailabilityZone {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchApplyUpdateActionMessage {
        var ReplicationGroupIds: ReplicationGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var CacheClusterIds: CacheClusterIdList?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceUpdateName: String
    }
    interface BatchStopUpdateActionMessage {
        var ReplicationGroupIds: ReplicationGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var CacheClusterIds: CacheClusterIdList?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceUpdateName: String
    }
    interface CacheCluster {
        var CacheClusterId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationEndpoint: Endpoint?
            get() = definedExternally
            set(value) = definedExternally
        var ClientDownloadLandingPage: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheClusterStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var NumCacheNodes: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredAvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheClusterCreateTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var PendingModifiedValues: PendingModifiedValues?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationConfiguration: NotificationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CacheSecurityGroups: CacheSecurityGroupMembershipList?
            get() = definedExternally
            set(value) = definedExternally
        var CacheParameterGroup: CacheParameterGroupStatus?
            get() = definedExternally
            set(value) = definedExternally
        var CacheSubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodes: CacheNodeList?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMinorVersionUpgrade: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroups: SecurityGroupMembershipList?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotRetentionLimit: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var AuthTokenEnabled: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var AuthTokenLastModifiedDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var TransitEncryptionEnabled: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var AtRestEncryptionEnabled: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CacheClusterMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheClusters: CacheClusterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CacheEngineVersion {
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheParameterGroupFamily: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheEngineDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheEngineVersionDescription: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CacheEngineVersionMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheEngineVersions: CacheEngineVersionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CacheNode {
        var CacheNodeId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeCreateTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var Endpoint: Endpoint?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterGroupStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceCacheNodeId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CustomerAvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CacheNodeTypeSpecificParameter {
        var ParameterName: String?
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
        var IsModifiable: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var MinimumEngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeTypeSpecificValues: CacheNodeTypeSpecificValueList?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeType: String /* "immediate" | "requires-reboot" | String */
    }
    interface CacheNodeTypeSpecificValue {
        var CacheNodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Value: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CacheNodeUpdateStatus {
        var CacheNodeId: String?
            get() = definedExternally
            set(value) = definedExternally
        var NodeUpdateStatus: String /* "not-applied" | "waiting-to-start" | "in-progress" | "stopping" | "stopped" | "complete" | String */
        var NodeDeletionDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var NodeUpdateStartDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var NodeUpdateEndDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var NodeUpdateInitiatedBy: String /* "system" | "customer" | String */
        var NodeUpdateInitiatedDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var NodeUpdateStatusModifiedDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CacheParameterGroup {
        var CacheParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheParameterGroupFamily: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var IsGlobal: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CacheParameterGroupDetails {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: ParametersList?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeTypeSpecificParameters: CacheNodeTypeSpecificParametersList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CacheParameterGroupNameMessage {
        var CacheParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CacheParameterGroupStatus {
        var CacheParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterApplyStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeIdsToReboot: CacheNodeIdsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CacheParameterGroupsMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheParameterGroups: CacheParameterGroupList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CacheSecurityGroup {
        var OwnerId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheSecurityGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var EC2SecurityGroups: EC2SecurityGroupList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CacheSecurityGroupMembership {
        var CacheSecurityGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CacheSecurityGroupMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheSecurityGroups: CacheSecurityGroups?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CacheSubnetGroup {
        var CacheSubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheSubnetGroupDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Subnets: SubnetList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CacheSubnetGroupMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheSubnetGroups: CacheSubnetGroups?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CompleteMigrationMessage {
        var ReplicationGroupId: String
        var Force: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CompleteMigrationResponse {
        var ReplicationGroup: ReplicationGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigureShard {
        var NodeGroupId: AllowedNodeGroupId
        var NewReplicaCount: Integer
        var PreferredAvailabilityZones: PreferredAvailabilityZoneList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CopySnapshotMessage {
        var SourceSnapshotName: String
        var TargetSnapshotName: String
        var TargetBucket: String?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CopySnapshotResult {
        var Snapshot: Snapshot?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCacheClusterMessage {
        var CacheClusterId: String
        var ReplicationGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var AZMode: String /* "single-az" | "cross-az" | String */
        var PreferredAvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredAvailabilityZones: PreferredAvailabilityZoneList?
            get() = definedExternally
            set(value) = definedExternally
        var NumCacheNodes: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheSubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheSecurityGroupNames: CacheSecurityGroupNameList?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: SecurityGroupIdsList?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotArns: SnapshotArnsList?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotName: String?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationTopicArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMinorVersionUpgrade: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotRetentionLimit: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var AuthToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCacheClusterResult {
        var CacheCluster: CacheCluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCacheParameterGroupMessage {
        var CacheParameterGroupName: String
        var CacheParameterGroupFamily: String
        var Description: String
    }
    interface CreateCacheParameterGroupResult {
        var CacheParameterGroup: CacheParameterGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCacheSecurityGroupMessage {
        var CacheSecurityGroupName: String
        var Description: String
    }
    interface CreateCacheSecurityGroupResult {
        var CacheSecurityGroup: CacheSecurityGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCacheSubnetGroupMessage {
        var CacheSubnetGroupName: String
        var CacheSubnetGroupDescription: String
        var SubnetIds: SubnetIdentifierList
    }
    interface CreateCacheSubnetGroupResult {
        var CacheSubnetGroup: CacheSubnetGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGlobalReplicationGroupMessage {
        var GlobalReplicationGroupIdSuffix: String
        var GlobalReplicationGroupDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var PrimaryReplicationGroupId: String
    }
    interface CreateGlobalReplicationGroupResult {
        var GlobalReplicationGroup: GlobalReplicationGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateReplicationGroupMessage {
        var ReplicationGroupId: String
        var ReplicationGroupDescription: String
        var GlobalReplicationGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var PrimaryClusterId: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutomaticFailoverEnabled: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var NumCacheClusters: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredCacheClusterAZs: AvailabilityZonesList?
            get() = definedExternally
            set(value) = definedExternally
        var NumNodeGroups: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicasPerNodeGroup: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var NodeGroupConfiguration: NodeGroupConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheSubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheSecurityGroupNames: CacheSecurityGroupNameList?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: SecurityGroupIdsList?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotArns: SnapshotArnsList?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotName: String?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationTopicArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMinorVersionUpgrade: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotRetentionLimit: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var AuthToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var TransitEncryptionEnabled: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var AtRestEncryptionEnabled: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateReplicationGroupResult {
        var ReplicationGroup: ReplicationGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSnapshotMessage {
        var ReplicationGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheClusterId: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotName: String
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSnapshotResult {
        var Snapshot: Snapshot?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CustomerNodeEndpoint {
        var Address: String?
            get() = definedExternally
            set(value) = definedExternally
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DecreaseNodeGroupsInGlobalReplicationGroupMessage {
        var GlobalReplicationGroupId: String
        var NodeGroupCount: Integer
        var GlobalNodeGroupsToRemove: GlobalNodeGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalNodeGroupsToRetain: GlobalNodeGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var ApplyImmediately: Boolean
    }
    interface DecreaseNodeGroupsInGlobalReplicationGroupResult {
        var GlobalReplicationGroup: GlobalReplicationGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DecreaseReplicaCountMessage {
        var ReplicationGroupId: String
        var NewReplicaCount: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicaConfiguration: ReplicaConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicasToRemove: RemoveReplicasList?
            get() = definedExternally
            set(value) = definedExternally
        var ApplyImmediately: Boolean
    }
    interface DecreaseReplicaCountResult {
        var ReplicationGroup: ReplicationGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteCacheClusterMessage {
        var CacheClusterId: String
        var FinalSnapshotIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteCacheClusterResult {
        var CacheCluster: CacheCluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteCacheParameterGroupMessage {
        var CacheParameterGroupName: String
    }
    interface DeleteCacheSecurityGroupMessage {
        var CacheSecurityGroupName: String
    }
    interface DeleteCacheSubnetGroupMessage {
        var CacheSubnetGroupName: String
    }
    interface DeleteGlobalReplicationGroupMessage {
        var GlobalReplicationGroupId: String
        var RetainPrimaryReplicationGroup: Boolean
    }
    interface DeleteGlobalReplicationGroupResult {
        var GlobalReplicationGroup: GlobalReplicationGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteReplicationGroupMessage {
        var ReplicationGroupId: String
        var RetainPrimaryCluster: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var FinalSnapshotIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteReplicationGroupResult {
        var ReplicationGroup: ReplicationGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteSnapshotMessage {
        var SnapshotName: String
    }
    interface DeleteSnapshotResult {
        var Snapshot: Snapshot?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCacheClustersMessage {
        var CacheClusterId: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var ShowCacheNodeInfo: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ShowCacheClustersNotInReplicationGroups: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCacheEngineVersionsMessage {
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheParameterGroupFamily: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultOnly: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCacheParameterGroupsMessage {
        var CacheParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCacheParametersMessage {
        var CacheParameterGroupName: String
        var Source: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCacheSecurityGroupsMessage {
        var CacheSecurityGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCacheSubnetGroupsMessage {
        var CacheSubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEngineDefaultParametersMessage {
        var CacheParameterGroupFamily: String
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEngineDefaultParametersResult {
        var EngineDefaults: EngineDefaults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventsMessage {
        var SourceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceType: String /* "cache-cluster" | "cache-parameter-group" | "cache-security-group" | "cache-subnet-group" | "replication-group" | String */
        var StartTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeGlobalReplicationGroupsMessage {
        var GlobalReplicationGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var ShowMemberInfo: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeGlobalReplicationGroupsResult {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalReplicationGroups: GlobalReplicationGroupList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeReplicationGroupsMessage {
        var ReplicationGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeReservedCacheNodesMessage {
        var ReservedCacheNodeId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReservedCacheNodesOfferingId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: String?
            get() = definedExternally
            set(value) = definedExternally
        var ProductDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingType: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeReservedCacheNodesOfferingsMessage {
        var ReservedCacheNodesOfferingId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: String?
            get() = definedExternally
            set(value) = definedExternally
        var ProductDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingType: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeServiceUpdatesMessage {
        var ServiceUpdateName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceUpdateStatus: ServiceUpdateStatusList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSnapshotsListMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var Snapshots: SnapshotList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSnapshotsMessage {
        var ReplicationGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheClusterId: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotName: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotSource: String?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ShowNodeGroupConfig: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUpdateActionsMessage {
        var ServiceUpdateName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationGroupIds: ReplicationGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var CacheClusterIds: CacheClusterIdList?
            get() = definedExternally
            set(value) = definedExternally
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceUpdateStatus: ServiceUpdateStatusList?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceUpdateTimeRange: TimeRangeFilter?
            get() = definedExternally
            set(value) = definedExternally
        var UpdateActionStatus: UpdateActionStatusList?
            get() = definedExternally
            set(value) = definedExternally
        var ShowNodeLevelUpdateStatus: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateGlobalReplicationGroupMessage {
        var GlobalReplicationGroupId: String
        var ReplicationGroupId: String
        var ReplicationGroupRegion: String
    }
    interface DisassociateGlobalReplicationGroupResult {
        var GlobalReplicationGroup: GlobalReplicationGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EC2SecurityGroup {
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var EC2SecurityGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var EC2SecurityGroupOwnerId: String?
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
    interface EngineDefaults {
        var CacheParameterGroupFamily: String?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: ParametersList?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeTypeSpecificParameters: CacheNodeTypeSpecificParametersList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Event {
        var SourceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceType: String /* "cache-cluster" | "cache-parameter-group" | "cache-security-group" | "cache-subnet-group" | "replication-group" | String */
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
        var Date: TStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventsMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var Events: EventList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FailoverGlobalReplicationGroupMessage {
        var GlobalReplicationGroupId: String
        var PrimaryRegion: String
        var PrimaryReplicationGroupId: String
    }
    interface FailoverGlobalReplicationGroupResult {
        var GlobalReplicationGroup: GlobalReplicationGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GlobalNodeGroup {
        var GlobalNodeGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Slots: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GlobalReplicationGroup {
        var GlobalReplicationGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalReplicationGroupDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var Members: GlobalReplicationGroupMemberList?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterEnabled: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalNodeGroups: GlobalNodeGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var AuthTokenEnabled: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var TransitEncryptionEnabled: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var AtRestEncryptionEnabled: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GlobalReplicationGroupInfo {
        var GlobalReplicationGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalReplicationGroupMemberRole: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GlobalReplicationGroupMember {
        var ReplicationGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationGroupRegion: String?
            get() = definedExternally
            set(value) = definedExternally
        var Role: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutomaticFailover: String /* "enabled" | "disabled" | "enabling" | "disabling" | String */
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IncreaseNodeGroupsInGlobalReplicationGroupMessage {
        var GlobalReplicationGroupId: String
        var NodeGroupCount: Integer
        var RegionalConfigurations: RegionalConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
        var ApplyImmediately: Boolean
    }
    interface IncreaseNodeGroupsInGlobalReplicationGroupResult {
        var GlobalReplicationGroup: GlobalReplicationGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IncreaseReplicaCountMessage {
        var ReplicationGroupId: String
        var NewReplicaCount: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicaConfiguration: ReplicaConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
        var ApplyImmediately: Boolean
    }
    interface IncreaseReplicaCountResult {
        var ReplicationGroup: ReplicationGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAllowedNodeTypeModificationsMessage {
        var CacheClusterId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceMessage {
        var ResourceName: String
    }
    interface ModifyCacheClusterMessage {
        var CacheClusterId: String
        var NumCacheNodes: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeIdsToRemove: CacheNodeIdsList?
            get() = definedExternally
            set(value) = definedExternally
        var AZMode: String /* "single-az" | "cross-az" | String */
        var NewAvailabilityZones: PreferredAvailabilityZoneList?
            get() = definedExternally
            set(value) = definedExternally
        var CacheSecurityGroupNames: CacheSecurityGroupNameList?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: SecurityGroupIdsList?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationTopicArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationTopicStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var ApplyImmediately: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMinorVersionUpgrade: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotRetentionLimit: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var AuthToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var AuthTokenUpdateStrategy: String /* "SET" | "ROTATE" | String */
    }
    interface ModifyCacheClusterResult {
        var CacheCluster: CacheCluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyCacheParameterGroupMessage {
        var CacheParameterGroupName: String
        var ParameterNameValues: ParameterNameValueList
    }
    interface ModifyCacheSubnetGroupMessage {
        var CacheSubnetGroupName: String
        var CacheSubnetGroupDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: SubnetIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyCacheSubnetGroupResult {
        var CacheSubnetGroup: CacheSubnetGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyGlobalReplicationGroupMessage {
        var GlobalReplicationGroupId: String
        var ApplyImmediately: Boolean
        var CacheNodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalReplicationGroupDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutomaticFailoverEnabled: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyGlobalReplicationGroupResult {
        var GlobalReplicationGroup: GlobalReplicationGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyReplicationGroupMessage {
        var ReplicationGroupId: String
        var ReplicationGroupDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var PrimaryClusterId: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshottingClusterId: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutomaticFailoverEnabled: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var NodeGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheSecurityGroupNames: CacheSecurityGroupNameList?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: SecurityGroupIdsList?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationTopicArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationTopicStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var ApplyImmediately: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMinorVersionUpgrade: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotRetentionLimit: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var AuthToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var AuthTokenUpdateStrategy: String /* "SET" | "ROTATE" | String */
    }
    interface ModifyReplicationGroupResult {
        var ReplicationGroup: ReplicationGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyReplicationGroupShardConfigurationMessage {
        var ReplicationGroupId: String
        var NodeGroupCount: Integer
        var ApplyImmediately: Boolean
        var ReshardingConfiguration: ReshardingConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
        var NodeGroupsToRemove: NodeGroupsToRemoveList?
            get() = definedExternally
            set(value) = definedExternally
        var NodeGroupsToRetain: NodeGroupsToRetainList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyReplicationGroupShardConfigurationResult {
        var ReplicationGroup: ReplicationGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodeGroup {
        var NodeGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var PrimaryEndpoint: Endpoint?
            get() = definedExternally
            set(value) = definedExternally
        var ReaderEndpoint: Endpoint?
            get() = definedExternally
            set(value) = definedExternally
        var Slots: String?
            get() = definedExternally
            set(value) = definedExternally
        var NodeGroupMembers: NodeGroupMemberList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodeGroupConfiguration {
        var NodeGroupId: AllowedNodeGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var Slots: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicaCount: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var PrimaryAvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicaAvailabilityZones: AvailabilityZonesList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodeGroupMember {
        var CacheClusterId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReadEndpoint: Endpoint?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredAvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentRole: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodeGroupMemberUpdateStatus {
        var CacheClusterId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeId: String?
            get() = definedExternally
            set(value) = definedExternally
        var NodeUpdateStatus: String /* "not-applied" | "waiting-to-start" | "in-progress" | "stopping" | "stopped" | "complete" | String */
        var NodeDeletionDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var NodeUpdateStartDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var NodeUpdateEndDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var NodeUpdateInitiatedBy: String /* "system" | "customer" | String */
        var NodeUpdateInitiatedDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var NodeUpdateStatusModifiedDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodeGroupUpdateStatus {
        var NodeGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var NodeGroupMemberUpdateStatus: NodeGroupMemberUpdateStatusList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodeSnapshot {
        var CacheClusterId: String?
            get() = definedExternally
            set(value) = definedExternally
        var NodeGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeId: String?
            get() = definedExternally
            set(value) = definedExternally
        var NodeGroupConfiguration: NodeGroupConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CacheSize: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeCreateTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotCreateTime: TStamp?
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
        var ParameterValue: String?
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
        var IsModifiable: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var MinimumEngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeType: String /* "immediate" | "requires-reboot" | String */
    }
    interface ParameterNameValue {
        var ParameterName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterValue: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PendingModifiedValues {
        var NumCacheNodes: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeIdsToRemove: CacheNodeIdsList?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var AuthTokenStatus: String /* "SETTING" | "ROTATING" | String */
    }
    interface ProcessedUpdateAction {
        var ReplicationGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheClusterId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceUpdateName: String?
            get() = definedExternally
            set(value) = definedExternally
        var UpdateActionStatus: String /* "not-applied" | "waiting-to-start" | "in-progress" | "stopping" | "stopped" | "complete" | String */
    }
    interface PurchaseReservedCacheNodesOfferingMessage {
        var ReservedCacheNodesOfferingId: String
        var ReservedCacheNodeId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeCount: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PurchaseReservedCacheNodesOfferingResult {
        var ReservedCacheNode: ReservedCacheNode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RebalanceSlotsInGlobalReplicationGroupMessage {
        var GlobalReplicationGroupId: String
        var ApplyImmediately: Boolean
    }
    interface RebalanceSlotsInGlobalReplicationGroupResult {
        var GlobalReplicationGroup: GlobalReplicationGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RebootCacheClusterMessage {
        var CacheClusterId: String
        var CacheNodeIdsToReboot: CacheNodeIdsList
    }
    interface RebootCacheClusterResult {
        var CacheCluster: CacheCluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecurringCharge {
        var RecurringChargeAmount: Double?
            get() = definedExternally
            set(value) = definedExternally
        var RecurringChargeFrequency: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegionalConfiguration {
        var ReplicationGroupId: String
        var ReplicationGroupRegion: String
        var ReshardingConfiguration: ReshardingConfigurationList
    }
    interface RemoveTagsFromResourceMessage {
        var ResourceName: String
        var TagKeys: KeyList
    }
    interface ReplicationGroup {
        var ReplicationGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalReplicationGroupInfo: GlobalReplicationGroupInfo?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var PendingModifiedValues: ReplicationGroupPendingModifiedValues?
            get() = definedExternally
            set(value) = definedExternally
        var MemberClusters: ClusterIdList?
            get() = definedExternally
            set(value) = definedExternally
        var NodeGroups: NodeGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshottingClusterId: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutomaticFailover: String /* "enabled" | "disabled" | "enabling" | "disabling" | String */
        var ConfigurationEndpoint: Endpoint?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotRetentionLimit: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterEnabled: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var AuthTokenEnabled: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var AuthTokenLastModifiedDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var TransitEncryptionEnabled: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var AtRestEncryptionEnabled: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplicationGroupMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationGroups: ReplicationGroupList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplicationGroupPendingModifiedValues {
        var PrimaryClusterId: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutomaticFailoverStatus: String /* "enabled" | "disabled" | String */
        var Resharding: ReshardingStatus?
            get() = definedExternally
            set(value) = definedExternally
        var AuthTokenStatus: String /* "SETTING" | "ROTATING" | String */
    }
    interface ReservedCacheNode {
        var ReservedCacheNodeId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReservedCacheNodesOfferingId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var FixedPrice: Double?
            get() = definedExternally
            set(value) = definedExternally
        var UsagePrice: Double?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ProductDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingType: String?
            get() = definedExternally
            set(value) = definedExternally
        var State: String?
            get() = definedExternally
            set(value) = definedExternally
        var RecurringCharges: RecurringChargeList?
            get() = definedExternally
            set(value) = definedExternally
        var ReservationARN: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReservedCacheNodeMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReservedCacheNodes: ReservedCacheNodeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReservedCacheNodesOffering {
        var ReservedCacheNodesOfferingId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var FixedPrice: Double?
            get() = definedExternally
            set(value) = definedExternally
        var UsagePrice: Double?
            get() = definedExternally
            set(value) = definedExternally
        var ProductDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingType: String?
            get() = definedExternally
            set(value) = definedExternally
        var RecurringCharges: RecurringChargeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReservedCacheNodesOfferingMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReservedCacheNodesOfferings: ReservedCacheNodesOfferingList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResetCacheParameterGroupMessage {
        var CacheParameterGroupName: String
        var ResetAllParameters: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterNameValues: ParameterNameValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReshardingConfiguration {
        var NodeGroupId: AllowedNodeGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredAvailabilityZones: AvailabilityZonesList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReshardingStatus {
        var SlotMigration: SlotMigration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RevokeCacheSecurityGroupIngressMessage {
        var CacheSecurityGroupName: String
        var EC2SecurityGroupName: String
        var EC2SecurityGroupOwnerId: String
    }
    interface RevokeCacheSecurityGroupIngressResult {
        var CacheSecurityGroup: CacheSecurityGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SecurityGroupMembership {
        var SecurityGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServiceUpdate {
        var ServiceUpdateName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceUpdateReleaseDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceUpdateEndDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceUpdateSeverity: String /* "critical" | "important" | "medium" | "low" | String */
        var ServiceUpdateRecommendedApplyByDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceUpdateStatus: String /* "available" | "cancelled" | "expired" | String */
        var ServiceUpdateDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceUpdateType: String /* "security-update" | String */
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutoUpdateAfterRecommendedApplyByDate: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedUpdateTime: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServiceUpdatesMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceUpdates: ServiceUpdateList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SlotMigration {
        var ProgressPercentage: Double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Snapshot {
        var SnapshotName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationGroupDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheClusterId: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotSource: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var NumCacheNodes: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredAvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheClusterCreateTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var TopicArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var CacheParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheSubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMinorVersionUpgrade: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotRetentionLimit: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var NumNodeGroups: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var AutomaticFailover: String /* "enabled" | "disabled" | "enabling" | "disabling" | String */
        var NodeSnapshots: NodeSnapshotList?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartMigrationMessage {
        var ReplicationGroupId: String
        var CustomerNodeEndpointList: CustomerNodeEndpointList
    }
    interface StartMigrationResponse {
        var ReplicationGroup: ReplicationGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Subnet {
        var SubnetIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetAvailabilityZone: AvailabilityZone?
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
    interface TagListMessage {
        var TagList: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestFailoverMessage {
        var ReplicationGroupId: String
        var NodeGroupId: AllowedNodeGroupId
    }
    interface TestFailoverResult {
        var ReplicationGroup: ReplicationGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TimeRangeFilter {
        var StartTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UnprocessedUpdateAction {
        var ReplicationGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheClusterId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceUpdateName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorType: String?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateAction {
        var ReplicationGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CacheClusterId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceUpdateName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceUpdateReleaseDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceUpdateSeverity: String /* "critical" | "important" | "medium" | "low" | String */
        var ServiceUpdateStatus: String /* "available" | "cancelled" | "expired" | String */
        var ServiceUpdateRecommendedApplyByDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceUpdateType: String /* "security-update" | String */
        var UpdateActionAvailableDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var UpdateActionStatus: String /* "not-applied" | "waiting-to-start" | "in-progress" | "stopping" | "stopped" | "complete" | String */
        var NodesUpdated: String?
            get() = definedExternally
            set(value) = definedExternally
        var UpdateActionStatusModifiedDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var SlaMet: String /* "yes" | "no" | "n/a" | String */
        var NodeGroupUpdateStatus: NodeGroupUpdateStatusList?
            get() = definedExternally
            set(value) = definedExternally
        var CacheNodeUpdateStatus: CacheNodeUpdateStatusList?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedUpdateTime: String?
            get() = definedExternally
            set(value) = definedExternally
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateActionResultsMessage {
        var ProcessedUpdateActions: ProcessedUpdateActionList?
            get() = definedExternally
            set(value) = definedExternally
        var UnprocessedUpdateActions: UnprocessedUpdateActionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateActionsMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var UpdateActions: UpdateActionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2012-11-15" | "2014-03-24" | "2014-07-15" | "2014-09-30" | "2015-02-02" | "latest" | String */
    }
}