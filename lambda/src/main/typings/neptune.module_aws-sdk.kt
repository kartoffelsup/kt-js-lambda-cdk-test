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
import Neptune.AvailabilityZone
import Neptune.DBCluster
import Neptune.DBClusterMember
import Neptune.DBClusterOptionGroupStatus
import Neptune.DBClusterParameterGroup
import Neptune.DBClusterRole
import Neptune.DBClusterSnapshotAttribute
import Neptune.DBClusterSnapshot
import Neptune.DBEngineVersion
import Neptune.DBInstance
import Neptune.DBInstanceStatusInfo
import Neptune.DBParameterGroup
import Neptune.DBParameterGroupStatus
import Neptune.DBSecurityGroupMembership
import Neptune.DBSubnetGroup
import Neptune.DomainMembership
import Neptune.DoubleRange
import Neptune.EventCategoriesMap
import Neptune.Event
import Neptune.EventSubscription
import Neptune.Filter
import Neptune.OptionGroupMembership
import Neptune.OrderableDBInstanceOption
import Neptune.Parameter
import Neptune.PendingMaintenanceAction
import Neptune.ResourcePendingMaintenanceActions
import Neptune.Range
import Neptune.Subnet
import Neptune.CharacterSet
import Neptune.Timezone
import Neptune.Tag
import Neptune.ValidStorageOptions
import Neptune.UpgradeTarget
import Neptune.VpcSecurityGroupMembership
import Neptune.AddRoleToDBClusterMessage
import Neptune.AddSourceIdentifierToSubscriptionMessage
import Neptune.AddSourceIdentifierToSubscriptionResult
import Neptune.AddTagsToResourceMessage
import Neptune.ApplyPendingMaintenanceActionMessage
import Neptune.ApplyPendingMaintenanceActionResult
import Neptune.CopyDBClusterParameterGroupMessage
import Neptune.CopyDBClusterParameterGroupResult
import Neptune.CopyDBClusterSnapshotMessage
import Neptune.CopyDBClusterSnapshotResult
import Neptune.CopyDBParameterGroupMessage
import Neptune.CopyDBParameterGroupResult
import Neptune.CreateDBClusterMessage
import Neptune.CreateDBClusterResult
import Neptune.CreateDBClusterParameterGroupMessage
import Neptune.CreateDBClusterParameterGroupResult
import Neptune.CreateDBClusterSnapshotMessage
import Neptune.CreateDBClusterSnapshotResult
import Neptune.CreateDBInstanceMessage
import Neptune.CreateDBInstanceResult
import Neptune.CreateDBParameterGroupMessage
import Neptune.CreateDBParameterGroupResult
import Neptune.CreateDBSubnetGroupMessage
import Neptune.CreateDBSubnetGroupResult
import Neptune.CreateEventSubscriptionMessage
import Neptune.CreateEventSubscriptionResult
import Neptune.DeleteDBClusterMessage
import Neptune.DeleteDBClusterResult
import Neptune.DeleteDBClusterParameterGroupMessage
import Neptune.DeleteDBClusterSnapshotMessage
import Neptune.DeleteDBClusterSnapshotResult
import Neptune.DeleteDBInstanceMessage
import Neptune.DeleteDBInstanceResult
import Neptune.DeleteDBParameterGroupMessage
import Neptune.DeleteDBSubnetGroupMessage
import Neptune.DeleteEventSubscriptionMessage
import Neptune.DeleteEventSubscriptionResult
import Neptune.DescribeDBClusterParameterGroupsMessage
import Neptune.DBClusterParameterGroupsMessage
import Neptune.DescribeDBClusterParametersMessage
import Neptune.DBClusterParameterGroupDetails
import Neptune.DescribeDBClusterSnapshotAttributesMessage
import Neptune.DescribeDBClusterSnapshotAttributesResult
import Neptune.DescribeDBClusterSnapshotsMessage
import Neptune.DBClusterSnapshotMessage
import Neptune.DescribeDBClustersMessage
import Neptune.DBClusterMessage
import Neptune.DescribeDBEngineVersionsMessage
import Neptune.DBEngineVersionMessage
import Neptune.DescribeDBInstancesMessage
import Neptune.DBInstanceMessage
import Neptune.DescribeDBParameterGroupsMessage
import Neptune.DBParameterGroupsMessage
import Neptune.DescribeDBParametersMessage
import Neptune.DBParameterGroupDetails
import Neptune.DescribeDBSubnetGroupsMessage
import Neptune.DBSubnetGroupMessage
import Neptune.DescribeEngineDefaultClusterParametersMessage
import Neptune.DescribeEngineDefaultClusterParametersResult
import Neptune.DescribeEngineDefaultParametersMessage
import Neptune.DescribeEngineDefaultParametersResult
import Neptune.DescribeEventCategoriesMessage
import Neptune.EventCategoriesMessage
import Neptune.DescribeEventSubscriptionsMessage
import Neptune.EventSubscriptionsMessage
import Neptune.DescribeEventsMessage
import Neptune.EventsMessage
import Neptune.DescribeOrderableDBInstanceOptionsMessage
import Neptune.OrderableDBInstanceOptionsMessage
import Neptune.DescribePendingMaintenanceActionsMessage
import Neptune.PendingMaintenanceActionsMessage
import Neptune.DescribeValidDBInstanceModificationsMessage
import Neptune.DescribeValidDBInstanceModificationsResult
import Neptune.FailoverDBClusterMessage
import Neptune.FailoverDBClusterResult
import Neptune.ListTagsForResourceMessage
import Neptune.TagListMessage
import Neptune.ModifyDBClusterMessage
import Neptune.ModifyDBClusterResult
import Neptune.ModifyDBClusterParameterGroupMessage
import Neptune.DBClusterParameterGroupNameMessage
import Neptune.ModifyDBClusterSnapshotAttributeMessage
import Neptune.ModifyDBClusterSnapshotAttributeResult
import Neptune.ModifyDBInstanceMessage
import Neptune.ModifyDBInstanceResult
import Neptune.ModifyDBParameterGroupMessage
import Neptune.DBParameterGroupNameMessage
import Neptune.ModifyDBSubnetGroupMessage
import Neptune.ModifyDBSubnetGroupResult
import Neptune.ModifyEventSubscriptionMessage
import Neptune.ModifyEventSubscriptionResult
import Neptune.PromoteReadReplicaDBClusterMessage
import Neptune.PromoteReadReplicaDBClusterResult
import Neptune.RebootDBInstanceMessage
import Neptune.RebootDBInstanceResult
import Neptune.RemoveRoleFromDBClusterMessage
import Neptune.RemoveSourceIdentifierFromSubscriptionMessage
import Neptune.RemoveSourceIdentifierFromSubscriptionResult
import Neptune.RemoveTagsFromResourceMessage
import Neptune.ResetDBClusterParameterGroupMessage
import Neptune.ResetDBParameterGroupMessage
import Neptune.RestoreDBClusterFromSnapshotMessage
import Neptune.RestoreDBClusterFromSnapshotResult
import Neptune.RestoreDBClusterToPointInTimeMessage
import Neptune.RestoreDBClusterToPointInTimeResult
import Neptune.StartDBClusterMessage
import Neptune.StartDBClusterResult
import Neptune.StopDBClusterMessage
import Neptune.StopDBClusterResult
import Neptune.Endpoint
import Neptune.PendingModifiedValues
import Neptune.DBClusterSnapshotAttributesResult
import Neptune.EngineDefaults
import Neptune.ValidDBInstanceModificationsMessage
import Neptune.CloudwatchLogsExportConfiguration
import Neptune.PendingCloudwatchLogsExports

typealias AttributeValueList = Array<String>

typealias AvailabilityZoneList = Array<AvailabilityZone>

typealias AvailabilityZones = Array<String>

typealias Boolean = Boolean

typealias BooleanOptional = Boolean

typealias DBClusterList = Array<DBCluster>

typealias DBClusterMemberList = Array<DBClusterMember>

typealias DBClusterOptionGroupMemberships = Array<DBClusterOptionGroupStatus>

typealias DBClusterParameterGroupList = Array<DBClusterParameterGroup>

typealias DBClusterRoles = Array<DBClusterRole>

typealias DBClusterSnapshotAttributeList = Array<DBClusterSnapshotAttribute>

typealias DBClusterSnapshotList = Array<DBClusterSnapshot>

typealias DBEngineVersionList = Array<DBEngineVersion>

typealias DBInstanceList = Array<DBInstance>

typealias DBInstanceStatusInfoList = Array<DBInstanceStatusInfo>

typealias DBParameterGroupList = Array<DBParameterGroup>

typealias DBParameterGroupStatusList = Array<DBParameterGroupStatus>

typealias DBSecurityGroupMembershipList = Array<DBSecurityGroupMembership>

typealias DBSecurityGroupNameList = Array<String>

typealias DBSubnetGroups = Array<DBSubnetGroup>

typealias DomainMembershipList = Array<DomainMembership>

typealias Double = Number

typealias DoubleOptional = Number

typealias DoubleRangeList = Array<DoubleRange>

typealias EventCategoriesList = Array<String>

typealias EventCategoriesMapList = Array<EventCategoriesMap>

typealias EventList = Array<Event>

typealias EventSubscriptionsList = Array<EventSubscription>

typealias FilterList = Array<Filter>

typealias FilterValueList = Array<String>

typealias Integer = Number

typealias IntegerOptional = Number

typealias KeyList = Array<String>

typealias LogTypeList = Array<String>

typealias OptionGroupMembershipList = Array<OptionGroupMembership>

typealias OrderableDBInstanceOptionsList = Array<OrderableDBInstanceOption>

typealias ParametersList = Array<Parameter>

typealias PendingMaintenanceActionDetails = Array<PendingMaintenanceAction>

typealias PendingMaintenanceActions = Array<ResourcePendingMaintenanceActions>

typealias RangeList = Array<Range>

typealias ReadReplicaDBClusterIdentifierList = Array<String>

typealias ReadReplicaDBInstanceIdentifierList = Array<String>

typealias ReadReplicaIdentifierList = Array<String>

typealias SourceIdsList = Array<String>

typealias String = String

typealias SubnetIdentifierList = Array<String>

typealias SubnetList = Array<Subnet>

typealias SupportedCharacterSetsList = Array<CharacterSet>

typealias SupportedTimezonesList = Array<Timezone>

typealias TStamp = Date

typealias TagList = Array<Tag>

typealias ValidStorageOptionsList = Array<ValidStorageOptions>

typealias ValidUpgradeTargetList = Array<UpgradeTarget>

typealias VpcSecurityGroupIdList = Array<String>

typealias VpcSecurityGroupMembershipList = Array<VpcSecurityGroupMembership>

@JsModule("aws-sdk")
external open class Neptune(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Neptune.Types.ClientConfiguration */
    open fun addRoleToDBCluster(params: AddRoleToDBClusterMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun addRoleToDBCluster(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun addSourceIdentifierToSubscription(params: AddSourceIdentifierToSubscriptionMessage, callback: (err: AWSError, data: AddSourceIdentifierToSubscriptionResult) -> Unit = definedExternally): Request<AddSourceIdentifierToSubscriptionResult, AWSError>
    open fun addSourceIdentifierToSubscription(callback: (err: AWSError, data: AddSourceIdentifierToSubscriptionResult) -> Unit = definedExternally): Request<AddSourceIdentifierToSubscriptionResult, AWSError>
    open fun addTagsToResource(params: AddTagsToResourceMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun addTagsToResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun applyPendingMaintenanceAction(params: ApplyPendingMaintenanceActionMessage, callback: (err: AWSError, data: ApplyPendingMaintenanceActionResult) -> Unit = definedExternally): Request<ApplyPendingMaintenanceActionResult, AWSError>
    open fun applyPendingMaintenanceAction(callback: (err: AWSError, data: ApplyPendingMaintenanceActionResult) -> Unit = definedExternally): Request<ApplyPendingMaintenanceActionResult, AWSError>
    open fun copyDBClusterParameterGroup(params: CopyDBClusterParameterGroupMessage, callback: (err: AWSError, data: CopyDBClusterParameterGroupResult) -> Unit = definedExternally): Request<CopyDBClusterParameterGroupResult, AWSError>
    open fun copyDBClusterParameterGroup(callback: (err: AWSError, data: CopyDBClusterParameterGroupResult) -> Unit = definedExternally): Request<CopyDBClusterParameterGroupResult, AWSError>
    open fun copyDBClusterSnapshot(params: CopyDBClusterSnapshotMessage, callback: (err: AWSError, data: CopyDBClusterSnapshotResult) -> Unit = definedExternally): Request<CopyDBClusterSnapshotResult, AWSError>
    open fun copyDBClusterSnapshot(callback: (err: AWSError, data: CopyDBClusterSnapshotResult) -> Unit = definedExternally): Request<CopyDBClusterSnapshotResult, AWSError>
    open fun copyDBParameterGroup(params: CopyDBParameterGroupMessage, callback: (err: AWSError, data: CopyDBParameterGroupResult) -> Unit = definedExternally): Request<CopyDBParameterGroupResult, AWSError>
    open fun copyDBParameterGroup(callback: (err: AWSError, data: CopyDBParameterGroupResult) -> Unit = definedExternally): Request<CopyDBParameterGroupResult, AWSError>
    open fun createDBCluster(params: CreateDBClusterMessage, callback: (err: AWSError, data: CreateDBClusterResult) -> Unit = definedExternally): Request<CreateDBClusterResult, AWSError>
    open fun createDBCluster(callback: (err: AWSError, data: CreateDBClusterResult) -> Unit = definedExternally): Request<CreateDBClusterResult, AWSError>
    open fun createDBClusterParameterGroup(params: CreateDBClusterParameterGroupMessage, callback: (err: AWSError, data: CreateDBClusterParameterGroupResult) -> Unit = definedExternally): Request<CreateDBClusterParameterGroupResult, AWSError>
    open fun createDBClusterParameterGroup(callback: (err: AWSError, data: CreateDBClusterParameterGroupResult) -> Unit = definedExternally): Request<CreateDBClusterParameterGroupResult, AWSError>
    open fun createDBClusterSnapshot(params: CreateDBClusterSnapshotMessage, callback: (err: AWSError, data: CreateDBClusterSnapshotResult) -> Unit = definedExternally): Request<CreateDBClusterSnapshotResult, AWSError>
    open fun createDBClusterSnapshot(callback: (err: AWSError, data: CreateDBClusterSnapshotResult) -> Unit = definedExternally): Request<CreateDBClusterSnapshotResult, AWSError>
    open fun createDBInstance(params: CreateDBInstanceMessage, callback: (err: AWSError, data: CreateDBInstanceResult) -> Unit = definedExternally): Request<CreateDBInstanceResult, AWSError>
    open fun createDBInstance(callback: (err: AWSError, data: CreateDBInstanceResult) -> Unit = definedExternally): Request<CreateDBInstanceResult, AWSError>
    open fun createDBParameterGroup(params: CreateDBParameterGroupMessage, callback: (err: AWSError, data: CreateDBParameterGroupResult) -> Unit = definedExternally): Request<CreateDBParameterGroupResult, AWSError>
    open fun createDBParameterGroup(callback: (err: AWSError, data: CreateDBParameterGroupResult) -> Unit = definedExternally): Request<CreateDBParameterGroupResult, AWSError>
    open fun createDBSubnetGroup(params: CreateDBSubnetGroupMessage, callback: (err: AWSError, data: CreateDBSubnetGroupResult) -> Unit = definedExternally): Request<CreateDBSubnetGroupResult, AWSError>
    open fun createDBSubnetGroup(callback: (err: AWSError, data: CreateDBSubnetGroupResult) -> Unit = definedExternally): Request<CreateDBSubnetGroupResult, AWSError>
    open fun createEventSubscription(params: CreateEventSubscriptionMessage, callback: (err: AWSError, data: CreateEventSubscriptionResult) -> Unit = definedExternally): Request<CreateEventSubscriptionResult, AWSError>
    open fun createEventSubscription(callback: (err: AWSError, data: CreateEventSubscriptionResult) -> Unit = definedExternally): Request<CreateEventSubscriptionResult, AWSError>
    open fun deleteDBCluster(params: DeleteDBClusterMessage, callback: (err: AWSError, data: DeleteDBClusterResult) -> Unit = definedExternally): Request<DeleteDBClusterResult, AWSError>
    open fun deleteDBCluster(callback: (err: AWSError, data: DeleteDBClusterResult) -> Unit = definedExternally): Request<DeleteDBClusterResult, AWSError>
    open fun deleteDBClusterParameterGroup(params: DeleteDBClusterParameterGroupMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDBClusterParameterGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDBClusterSnapshot(params: DeleteDBClusterSnapshotMessage, callback: (err: AWSError, data: DeleteDBClusterSnapshotResult) -> Unit = definedExternally): Request<DeleteDBClusterSnapshotResult, AWSError>
    open fun deleteDBClusterSnapshot(callback: (err: AWSError, data: DeleteDBClusterSnapshotResult) -> Unit = definedExternally): Request<DeleteDBClusterSnapshotResult, AWSError>
    open fun deleteDBInstance(params: DeleteDBInstanceMessage, callback: (err: AWSError, data: DeleteDBInstanceResult) -> Unit = definedExternally): Request<DeleteDBInstanceResult, AWSError>
    open fun deleteDBInstance(callback: (err: AWSError, data: DeleteDBInstanceResult) -> Unit = definedExternally): Request<DeleteDBInstanceResult, AWSError>
    open fun deleteDBParameterGroup(params: DeleteDBParameterGroupMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDBParameterGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDBSubnetGroup(params: DeleteDBSubnetGroupMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDBSubnetGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEventSubscription(params: DeleteEventSubscriptionMessage, callback: (err: AWSError, data: DeleteEventSubscriptionResult) -> Unit = definedExternally): Request<DeleteEventSubscriptionResult, AWSError>
    open fun deleteEventSubscription(callback: (err: AWSError, data: DeleteEventSubscriptionResult) -> Unit = definedExternally): Request<DeleteEventSubscriptionResult, AWSError>
    open fun describeDBClusterParameterGroups(params: DescribeDBClusterParameterGroupsMessage, callback: (err: AWSError, data: DBClusterParameterGroupsMessage) -> Unit = definedExternally): Request<DBClusterParameterGroupsMessage, AWSError>
    open fun describeDBClusterParameterGroups(callback: (err: AWSError, data: DBClusterParameterGroupsMessage) -> Unit = definedExternally): Request<DBClusterParameterGroupsMessage, AWSError>
    open fun describeDBClusterParameters(params: DescribeDBClusterParametersMessage, callback: (err: AWSError, data: DBClusterParameterGroupDetails) -> Unit = definedExternally): Request<DBClusterParameterGroupDetails, AWSError>
    open fun describeDBClusterParameters(callback: (err: AWSError, data: DBClusterParameterGroupDetails) -> Unit = definedExternally): Request<DBClusterParameterGroupDetails, AWSError>
    open fun describeDBClusterSnapshotAttributes(params: DescribeDBClusterSnapshotAttributesMessage, callback: (err: AWSError, data: DescribeDBClusterSnapshotAttributesResult) -> Unit = definedExternally): Request<DescribeDBClusterSnapshotAttributesResult, AWSError>
    open fun describeDBClusterSnapshotAttributes(callback: (err: AWSError, data: DescribeDBClusterSnapshotAttributesResult) -> Unit = definedExternally): Request<DescribeDBClusterSnapshotAttributesResult, AWSError>
    open fun describeDBClusterSnapshots(params: DescribeDBClusterSnapshotsMessage, callback: (err: AWSError, data: DBClusterSnapshotMessage) -> Unit = definedExternally): Request<DBClusterSnapshotMessage, AWSError>
    open fun describeDBClusterSnapshots(callback: (err: AWSError, data: DBClusterSnapshotMessage) -> Unit = definedExternally): Request<DBClusterSnapshotMessage, AWSError>
    open fun describeDBClusters(params: DescribeDBClustersMessage, callback: (err: AWSError, data: DBClusterMessage) -> Unit = definedExternally): Request<DBClusterMessage, AWSError>
    open fun describeDBClusters(callback: (err: AWSError, data: DBClusterMessage) -> Unit = definedExternally): Request<DBClusterMessage, AWSError>
    open fun describeDBEngineVersions(params: DescribeDBEngineVersionsMessage, callback: (err: AWSError, data: DBEngineVersionMessage) -> Unit = definedExternally): Request<DBEngineVersionMessage, AWSError>
    open fun describeDBEngineVersions(callback: (err: AWSError, data: DBEngineVersionMessage) -> Unit = definedExternally): Request<DBEngineVersionMessage, AWSError>
    open fun describeDBInstances(params: DescribeDBInstancesMessage, callback: (err: AWSError, data: DBInstanceMessage) -> Unit = definedExternally): Request<DBInstanceMessage, AWSError>
    open fun describeDBInstances(callback: (err: AWSError, data: DBInstanceMessage) -> Unit = definedExternally): Request<DBInstanceMessage, AWSError>
    open fun describeDBParameterGroups(params: DescribeDBParameterGroupsMessage, callback: (err: AWSError, data: DBParameterGroupsMessage) -> Unit = definedExternally): Request<DBParameterGroupsMessage, AWSError>
    open fun describeDBParameterGroups(callback: (err: AWSError, data: DBParameterGroupsMessage) -> Unit = definedExternally): Request<DBParameterGroupsMessage, AWSError>
    open fun describeDBParameters(params: DescribeDBParametersMessage, callback: (err: AWSError, data: DBParameterGroupDetails) -> Unit = definedExternally): Request<DBParameterGroupDetails, AWSError>
    open fun describeDBParameters(callback: (err: AWSError, data: DBParameterGroupDetails) -> Unit = definedExternally): Request<DBParameterGroupDetails, AWSError>
    open fun describeDBSubnetGroups(params: DescribeDBSubnetGroupsMessage, callback: (err: AWSError, data: DBSubnetGroupMessage) -> Unit = definedExternally): Request<DBSubnetGroupMessage, AWSError>
    open fun describeDBSubnetGroups(callback: (err: AWSError, data: DBSubnetGroupMessage) -> Unit = definedExternally): Request<DBSubnetGroupMessage, AWSError>
    open fun describeEngineDefaultClusterParameters(params: DescribeEngineDefaultClusterParametersMessage, callback: (err: AWSError, data: DescribeEngineDefaultClusterParametersResult) -> Unit = definedExternally): Request<DescribeEngineDefaultClusterParametersResult, AWSError>
    open fun describeEngineDefaultClusterParameters(callback: (err: AWSError, data: DescribeEngineDefaultClusterParametersResult) -> Unit = definedExternally): Request<DescribeEngineDefaultClusterParametersResult, AWSError>
    open fun describeEngineDefaultParameters(params: DescribeEngineDefaultParametersMessage, callback: (err: AWSError, data: DescribeEngineDefaultParametersResult) -> Unit = definedExternally): Request<DescribeEngineDefaultParametersResult, AWSError>
    open fun describeEngineDefaultParameters(callback: (err: AWSError, data: DescribeEngineDefaultParametersResult) -> Unit = definedExternally): Request<DescribeEngineDefaultParametersResult, AWSError>
    open fun describeEventCategories(params: DescribeEventCategoriesMessage, callback: (err: AWSError, data: EventCategoriesMessage) -> Unit = definedExternally): Request<EventCategoriesMessage, AWSError>
    open fun describeEventCategories(callback: (err: AWSError, data: EventCategoriesMessage) -> Unit = definedExternally): Request<EventCategoriesMessage, AWSError>
    open fun describeEventSubscriptions(params: DescribeEventSubscriptionsMessage, callback: (err: AWSError, data: EventSubscriptionsMessage) -> Unit = definedExternally): Request<EventSubscriptionsMessage, AWSError>
    open fun describeEventSubscriptions(callback: (err: AWSError, data: EventSubscriptionsMessage) -> Unit = definedExternally): Request<EventSubscriptionsMessage, AWSError>
    open fun describeEvents(params: DescribeEventsMessage, callback: (err: AWSError, data: EventsMessage) -> Unit = definedExternally): Request<EventsMessage, AWSError>
    open fun describeEvents(callback: (err: AWSError, data: EventsMessage) -> Unit = definedExternally): Request<EventsMessage, AWSError>
    open fun describeOrderableDBInstanceOptions(params: DescribeOrderableDBInstanceOptionsMessage, callback: (err: AWSError, data: OrderableDBInstanceOptionsMessage) -> Unit = definedExternally): Request<OrderableDBInstanceOptionsMessage, AWSError>
    open fun describeOrderableDBInstanceOptions(callback: (err: AWSError, data: OrderableDBInstanceOptionsMessage) -> Unit = definedExternally): Request<OrderableDBInstanceOptionsMessage, AWSError>
    open fun describePendingMaintenanceActions(params: DescribePendingMaintenanceActionsMessage, callback: (err: AWSError, data: PendingMaintenanceActionsMessage) -> Unit = definedExternally): Request<PendingMaintenanceActionsMessage, AWSError>
    open fun describePendingMaintenanceActions(callback: (err: AWSError, data: PendingMaintenanceActionsMessage) -> Unit = definedExternally): Request<PendingMaintenanceActionsMessage, AWSError>
    open fun describeValidDBInstanceModifications(params: DescribeValidDBInstanceModificationsMessage, callback: (err: AWSError, data: DescribeValidDBInstanceModificationsResult) -> Unit = definedExternally): Request<DescribeValidDBInstanceModificationsResult, AWSError>
    open fun describeValidDBInstanceModifications(callback: (err: AWSError, data: DescribeValidDBInstanceModificationsResult) -> Unit = definedExternally): Request<DescribeValidDBInstanceModificationsResult, AWSError>
    open fun failoverDBCluster(params: FailoverDBClusterMessage, callback: (err: AWSError, data: FailoverDBClusterResult) -> Unit = definedExternally): Request<FailoverDBClusterResult, AWSError>
    open fun failoverDBCluster(callback: (err: AWSError, data: FailoverDBClusterResult) -> Unit = definedExternally): Request<FailoverDBClusterResult, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceMessage, callback: (err: AWSError, data: TagListMessage) -> Unit = definedExternally): Request<TagListMessage, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: TagListMessage) -> Unit = definedExternally): Request<TagListMessage, AWSError>
    open fun modifyDBCluster(params: ModifyDBClusterMessage, callback: (err: AWSError, data: ModifyDBClusterResult) -> Unit = definedExternally): Request<ModifyDBClusterResult, AWSError>
    open fun modifyDBCluster(callback: (err: AWSError, data: ModifyDBClusterResult) -> Unit = definedExternally): Request<ModifyDBClusterResult, AWSError>
    open fun modifyDBClusterParameterGroup(params: ModifyDBClusterParameterGroupMessage, callback: (err: AWSError, data: DBClusterParameterGroupNameMessage) -> Unit = definedExternally): Request<DBClusterParameterGroupNameMessage, AWSError>
    open fun modifyDBClusterParameterGroup(callback: (err: AWSError, data: DBClusterParameterGroupNameMessage) -> Unit = definedExternally): Request<DBClusterParameterGroupNameMessage, AWSError>
    open fun modifyDBClusterSnapshotAttribute(params: ModifyDBClusterSnapshotAttributeMessage, callback: (err: AWSError, data: ModifyDBClusterSnapshotAttributeResult) -> Unit = definedExternally): Request<ModifyDBClusterSnapshotAttributeResult, AWSError>
    open fun modifyDBClusterSnapshotAttribute(callback: (err: AWSError, data: ModifyDBClusterSnapshotAttributeResult) -> Unit = definedExternally): Request<ModifyDBClusterSnapshotAttributeResult, AWSError>
    open fun modifyDBInstance(params: ModifyDBInstanceMessage, callback: (err: AWSError, data: ModifyDBInstanceResult) -> Unit = definedExternally): Request<ModifyDBInstanceResult, AWSError>
    open fun modifyDBInstance(callback: (err: AWSError, data: ModifyDBInstanceResult) -> Unit = definedExternally): Request<ModifyDBInstanceResult, AWSError>
    open fun modifyDBParameterGroup(params: ModifyDBParameterGroupMessage, callback: (err: AWSError, data: DBParameterGroupNameMessage) -> Unit = definedExternally): Request<DBParameterGroupNameMessage, AWSError>
    open fun modifyDBParameterGroup(callback: (err: AWSError, data: DBParameterGroupNameMessage) -> Unit = definedExternally): Request<DBParameterGroupNameMessage, AWSError>
    open fun modifyDBSubnetGroup(params: ModifyDBSubnetGroupMessage, callback: (err: AWSError, data: ModifyDBSubnetGroupResult) -> Unit = definedExternally): Request<ModifyDBSubnetGroupResult, AWSError>
    open fun modifyDBSubnetGroup(callback: (err: AWSError, data: ModifyDBSubnetGroupResult) -> Unit = definedExternally): Request<ModifyDBSubnetGroupResult, AWSError>
    open fun modifyEventSubscription(params: ModifyEventSubscriptionMessage, callback: (err: AWSError, data: ModifyEventSubscriptionResult) -> Unit = definedExternally): Request<ModifyEventSubscriptionResult, AWSError>
    open fun modifyEventSubscription(callback: (err: AWSError, data: ModifyEventSubscriptionResult) -> Unit = definedExternally): Request<ModifyEventSubscriptionResult, AWSError>
    open fun promoteReadReplicaDBCluster(params: PromoteReadReplicaDBClusterMessage, callback: (err: AWSError, data: PromoteReadReplicaDBClusterResult) -> Unit = definedExternally): Request<PromoteReadReplicaDBClusterResult, AWSError>
    open fun promoteReadReplicaDBCluster(callback: (err: AWSError, data: PromoteReadReplicaDBClusterResult) -> Unit = definedExternally): Request<PromoteReadReplicaDBClusterResult, AWSError>
    open fun rebootDBInstance(params: RebootDBInstanceMessage, callback: (err: AWSError, data: RebootDBInstanceResult) -> Unit = definedExternally): Request<RebootDBInstanceResult, AWSError>
    open fun rebootDBInstance(callback: (err: AWSError, data: RebootDBInstanceResult) -> Unit = definedExternally): Request<RebootDBInstanceResult, AWSError>
    open fun removeRoleFromDBCluster(params: RemoveRoleFromDBClusterMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeRoleFromDBCluster(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeSourceIdentifierFromSubscription(params: RemoveSourceIdentifierFromSubscriptionMessage, callback: (err: AWSError, data: RemoveSourceIdentifierFromSubscriptionResult) -> Unit = definedExternally): Request<RemoveSourceIdentifierFromSubscriptionResult, AWSError>
    open fun removeSourceIdentifierFromSubscription(callback: (err: AWSError, data: RemoveSourceIdentifierFromSubscriptionResult) -> Unit = definedExternally): Request<RemoveSourceIdentifierFromSubscriptionResult, AWSError>
    open fun removeTagsFromResource(params: RemoveTagsFromResourceMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeTagsFromResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun resetDBClusterParameterGroup(params: ResetDBClusterParameterGroupMessage, callback: (err: AWSError, data: DBClusterParameterGroupNameMessage) -> Unit = definedExternally): Request<DBClusterParameterGroupNameMessage, AWSError>
    open fun resetDBClusterParameterGroup(callback: (err: AWSError, data: DBClusterParameterGroupNameMessage) -> Unit = definedExternally): Request<DBClusterParameterGroupNameMessage, AWSError>
    open fun resetDBParameterGroup(params: ResetDBParameterGroupMessage, callback: (err: AWSError, data: DBParameterGroupNameMessage) -> Unit = definedExternally): Request<DBParameterGroupNameMessage, AWSError>
    open fun resetDBParameterGroup(callback: (err: AWSError, data: DBParameterGroupNameMessage) -> Unit = definedExternally): Request<DBParameterGroupNameMessage, AWSError>
    open fun restoreDBClusterFromSnapshot(params: RestoreDBClusterFromSnapshotMessage, callback: (err: AWSError, data: RestoreDBClusterFromSnapshotResult) -> Unit = definedExternally): Request<RestoreDBClusterFromSnapshotResult, AWSError>
    open fun restoreDBClusterFromSnapshot(callback: (err: AWSError, data: RestoreDBClusterFromSnapshotResult) -> Unit = definedExternally): Request<RestoreDBClusterFromSnapshotResult, AWSError>
    open fun restoreDBClusterToPointInTime(params: RestoreDBClusterToPointInTimeMessage, callback: (err: AWSError, data: RestoreDBClusterToPointInTimeResult) -> Unit = definedExternally): Request<RestoreDBClusterToPointInTimeResult, AWSError>
    open fun restoreDBClusterToPointInTime(callback: (err: AWSError, data: RestoreDBClusterToPointInTimeResult) -> Unit = definedExternally): Request<RestoreDBClusterToPointInTimeResult, AWSError>
    open fun startDBCluster(params: StartDBClusterMessage, callback: (err: AWSError, data: StartDBClusterResult) -> Unit = definedExternally): Request<StartDBClusterResult, AWSError>
    open fun startDBCluster(callback: (err: AWSError, data: StartDBClusterResult) -> Unit = definedExternally): Request<StartDBClusterResult, AWSError>
    open fun stopDBCluster(params: StopDBClusterMessage, callback: (err: AWSError, data: StopDBClusterResult) -> Unit = definedExternally): Request<StopDBClusterResult, AWSError>
    open fun stopDBCluster(callback: (err: AWSError, data: StopDBClusterResult) -> Unit = definedExternally): Request<StopDBClusterResult, AWSError>
    open fun waitFor(state: String, params: DescribeDBInstancesMessage, callback: (err: AWSError, data: DBInstanceMessage) -> Unit = definedExternally): Request<DBInstanceMessage, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DBInstanceMessage) -> Unit = definedExternally): Request<DBInstanceMessage, AWSError>
    interface AddRoleToDBClusterMessage {
        var DBClusterIdentifier: String
        var RoleArn: String
    }
    interface AddSourceIdentifierToSubscriptionMessage {
        var SubscriptionName: String
        var SourceIdentifier: String
    }
    interface AddSourceIdentifierToSubscriptionResult {
        var EventSubscription: EventSubscription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddTagsToResourceMessage {
        var ResourceName: String
        var Tags: TagList
    }
    interface ApplyPendingMaintenanceActionMessage {
        var ResourceIdentifier: String
        var ApplyAction: String
        var OptInType: String
    }
    interface ApplyPendingMaintenanceActionResult {
        var ResourcePendingMaintenanceActions: ResourcePendingMaintenanceActions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AvailabilityZone {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CharacterSet {
        var CharacterSetName: String?
            get() = definedExternally
            set(value) = definedExternally
        var CharacterSetDescription: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CloudwatchLogsExportConfiguration {
        var EnableLogTypes: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var DisableLogTypes: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CopyDBClusterParameterGroupMessage {
        var SourceDBClusterParameterGroupIdentifier: String
        var TargetDBClusterParameterGroupIdentifier: String
        var TargetDBClusterParameterGroupDescription: String
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CopyDBClusterParameterGroupResult {
        var DBClusterParameterGroup: DBClusterParameterGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CopyDBClusterSnapshotMessage {
        var SourceDBClusterSnapshotIdentifier: String
        var TargetDBClusterSnapshotIdentifier: String
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var PreSignedUrl: String?
            get() = definedExternally
            set(value) = definedExternally
        var CopyTags: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CopyDBClusterSnapshotResult {
        var DBClusterSnapshot: DBClusterSnapshot?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CopyDBParameterGroupMessage {
        var SourceDBParameterGroupIdentifier: String
        var TargetDBParameterGroupIdentifier: String
        var TargetDBParameterGroupDescription: String
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CopyDBParameterGroupResult {
        var DBParameterGroup: DBParameterGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDBClusterMessage {
        var AvailabilityZones: AvailabilityZones?
            get() = definedExternally
            set(value) = definedExternally
        var BackupRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var CharacterSetName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterIdentifier: String
        var DBClusterParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpcSecurityGroupIds: VpcSecurityGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var DBSubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Engine: String
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MasterUsername: String?
            get() = definedExternally
            set(value) = definedExternally
        var MasterUserPassword: String?
            get() = definedExternally
            set(value) = definedExternally
        var OptionGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredBackupWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationSourceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var StorageEncrypted: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var PreSignedUrl: String?
            get() = definedExternally
            set(value) = definedExternally
        var EnableIAMDatabaseAuthentication: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EnableCloudwatchLogsExports: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDBClusterParameterGroupMessage {
        var DBClusterParameterGroupName: String
        var DBParameterGroupFamily: String
        var Description: String
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDBClusterParameterGroupResult {
        var DBClusterParameterGroup: DBClusterParameterGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDBClusterResult {
        var DBCluster: DBCluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDBClusterSnapshotMessage {
        var DBClusterSnapshotIdentifier: String
        var DBClusterIdentifier: String
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDBClusterSnapshotResult {
        var DBClusterSnapshot: DBClusterSnapshot?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDBInstanceMessage {
        var DBName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceIdentifier: String
        var AllocatedStorage: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceClass: String
        var Engine: String
        var MasterUsername: String?
            get() = definedExternally
            set(value) = definedExternally
        var MasterUserPassword: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBSecurityGroups: DBSecurityGroupNameList?
            get() = definedExternally
            set(value) = definedExternally
        var VpcSecurityGroupIds: VpcSecurityGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBSubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredBackupWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MultiAZ: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMinorVersionUpgrade: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseModel: String?
            get() = definedExternally
            set(value) = definedExternally
        var Iops: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var OptionGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var CharacterSetName: String?
            get() = definedExternally
            set(value) = definedExternally
        var PubliclyAccessible: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var StorageType: String?
            get() = definedExternally
            set(value) = definedExternally
        var TdeCredentialArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var TdeCredentialPassword: String?
            get() = definedExternally
            set(value) = definedExternally
        var StorageEncrypted: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Domain: String?
            get() = definedExternally
            set(value) = definedExternally
        var CopyTagsToSnapshot: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MonitoringInterval: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MonitoringRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var DomainIAMRoleName: String?
            get() = definedExternally
            set(value) = definedExternally
        var PromotionTier: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Timezone: String?
            get() = definedExternally
            set(value) = definedExternally
        var EnableIAMDatabaseAuthentication: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EnablePerformanceInsights: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var PerformanceInsightsKMSKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var EnableCloudwatchLogsExports: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDBInstanceResult {
        var DBInstance: DBInstance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDBParameterGroupMessage {
        var DBParameterGroupName: String
        var DBParameterGroupFamily: String
        var Description: String
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDBParameterGroupResult {
        var DBParameterGroup: DBParameterGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDBSubnetGroupMessage {
        var DBSubnetGroupName: String
        var DBSubnetGroupDescription: String
        var SubnetIds: SubnetIdentifierList
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDBSubnetGroupResult {
        var DBSubnetGroup: DBSubnetGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEventSubscriptionMessage {
        var SubscriptionName: String
        var SnsTopicArn: String
        var SourceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var EventCategories: EventCategoriesList?
            get() = definedExternally
            set(value) = definedExternally
        var SourceIds: SourceIdsList?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEventSubscriptionResult {
        var EventSubscription: EventSubscription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBCluster {
        var AllocatedStorage: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZones: AvailabilityZones?
            get() = definedExternally
            set(value) = definedExternally
        var BackupRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var CharacterSetName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterParameterGroup: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBSubnetGroup: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var PercentProgress: String?
            get() = definedExternally
            set(value) = definedExternally
        var EarliestRestorableTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var Endpoint: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReaderEndpoint: String?
            get() = definedExternally
            set(value) = definedExternally
        var MultiAZ: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var LatestRestorableTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MasterUsername: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterOptionGroupMemberships: DBClusterOptionGroupMemberships?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredBackupWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationSourceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReadReplicaIdentifiers: ReadReplicaIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterMembers: DBClusterMemberList?
            get() = definedExternally
            set(value) = definedExternally
        var VpcSecurityGroups: VpcSecurityGroupMembershipList?
            get() = definedExternally
            set(value) = definedExternally
        var HostedZoneId: String?
            get() = definedExternally
            set(value) = definedExternally
        var StorageEncrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var DbClusterResourceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var AssociatedRoles: DBClusterRoles?
            get() = definedExternally
            set(value) = definedExternally
        var IAMDatabaseAuthenticationEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CloneGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterCreateTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var EnabledCloudwatchLogsExports: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBClusterMember {
        var DBInstanceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var IsClusterWriter: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterParameterGroupStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var PromotionTier: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBClusterMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusters: DBClusterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBClusterOptionGroupStatus {
        var DBClusterOptionGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBClusterParameterGroup {
        var DBClusterParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBParameterGroupFamily: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterParameterGroupArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBClusterParameterGroupDetails {
        var Parameters: ParametersList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBClusterParameterGroupNameMessage {
        var DBClusterParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBClusterParameterGroupsMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterParameterGroups: DBClusterParameterGroupList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBClusterRole {
        var RoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBClusterSnapshot {
        var AvailabilityZones: AvailabilityZones?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterSnapshotIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotCreateTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var AllocatedStorage: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var Port: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterCreateTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var MasterUsername: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseModel: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotType: String?
            get() = definedExternally
            set(value) = definedExternally
        var PercentProgress: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var StorageEncrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterSnapshotArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceDBClusterSnapshotArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var IAMDatabaseAuthenticationEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBClusterSnapshotAttribute {
        var AttributeName: String?
            get() = definedExternally
            set(value) = definedExternally
        var AttributeValues: AttributeValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBClusterSnapshotAttributesResult {
        var DBClusterSnapshotIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterSnapshotAttributes: DBClusterSnapshotAttributeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBClusterSnapshotMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterSnapshots: DBClusterSnapshotList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBEngineVersion {
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBParameterGroupFamily: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBEngineDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBEngineVersionDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultCharacterSet: CharacterSet?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedCharacterSets: SupportedCharacterSetsList?
            get() = definedExternally
            set(value) = definedExternally
        var ValidUpgradeTarget: ValidUpgradeTargetList?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedTimezones: SupportedTimezonesList?
            get() = definedExternally
            set(value) = definedExternally
        var ExportableLogTypes: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var SupportsLogExportsToCloudwatchLogs: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SupportsReadReplica: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBEngineVersionMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBEngineVersions: DBEngineVersionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBInstance {
        var DBInstanceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceClass: String?
            get() = definedExternally
            set(value) = definedExternally
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var MasterUsername: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Endpoint: Endpoint?
            get() = definedExternally
            set(value) = definedExternally
        var AllocatedStorage: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceCreateTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredBackupWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupRetentionPeriod: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var DBSecurityGroups: DBSecurityGroupMembershipList?
            get() = definedExternally
            set(value) = definedExternally
        var VpcSecurityGroups: VpcSecurityGroupMembershipList?
            get() = definedExternally
            set(value) = definedExternally
        var DBParameterGroups: DBParameterGroupStatusList?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBSubnetGroup: DBSubnetGroup?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var PendingModifiedValues: PendingModifiedValues?
            get() = definedExternally
            set(value) = definedExternally
        var LatestRestorableTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var MultiAZ: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMinorVersionUpgrade: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ReadReplicaSourceDBInstanceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReadReplicaDBInstanceIdentifiers: ReadReplicaDBInstanceIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var ReadReplicaDBClusterIdentifiers: ReadReplicaDBClusterIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseModel: String?
            get() = definedExternally
            set(value) = definedExternally
        var Iops: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var OptionGroupMemberships: OptionGroupMembershipList?
            get() = definedExternally
            set(value) = definedExternally
        var CharacterSetName: String?
            get() = definedExternally
            set(value) = definedExternally
        var SecondaryAvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var PubliclyAccessible: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var StatusInfos: DBInstanceStatusInfoList?
            get() = definedExternally
            set(value) = definedExternally
        var StorageType: String?
            get() = definedExternally
            set(value) = definedExternally
        var TdeCredentialArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var DbInstancePort: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var StorageEncrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var DbiResourceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CACertificateIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var DomainMemberships: DomainMembershipList?
            get() = definedExternally
            set(value) = definedExternally
        var CopyTagsToSnapshot: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var MonitoringInterval: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EnhancedMonitoringResourceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var MonitoringRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var PromotionTier: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Timezone: String?
            get() = definedExternally
            set(value) = definedExternally
        var IAMDatabaseAuthenticationEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var PerformanceInsightsEnabled: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var PerformanceInsightsKMSKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var EnabledCloudwatchLogsExports: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBInstanceMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstances: DBInstanceList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBInstanceStatusInfo {
        var StatusType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Normal: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBParameterGroup {
        var DBParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBParameterGroupFamily: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBParameterGroupArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBParameterGroupDetails {
        var Parameters: ParametersList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBParameterGroupNameMessage {
        var DBParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBParameterGroupStatus {
        var DBParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterApplyStatus: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBParameterGroupsMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBParameterGroups: DBParameterGroupList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBSecurityGroupMembership {
        var DBSecurityGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBSubnetGroup {
        var DBSubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBSubnetGroupDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: String?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetGroupStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var Subnets: SubnetList?
            get() = definedExternally
            set(value) = definedExternally
        var DBSubnetGroupArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBSubnetGroupMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBSubnetGroups: DBSubnetGroups?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDBClusterMessage {
        var DBClusterIdentifier: String
        var SkipFinalSnapshot: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var FinalDBSnapshotIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDBClusterParameterGroupMessage {
        var DBClusterParameterGroupName: String
    }
    interface DeleteDBClusterResult {
        var DBCluster: DBCluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDBClusterSnapshotMessage {
        var DBClusterSnapshotIdentifier: String
    }
    interface DeleteDBClusterSnapshotResult {
        var DBClusterSnapshot: DBClusterSnapshot?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDBInstanceMessage {
        var DBInstanceIdentifier: String
        var SkipFinalSnapshot: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var FinalDBSnapshotIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDBInstanceResult {
        var DBInstance: DBInstance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDBParameterGroupMessage {
        var DBParameterGroupName: String
    }
    interface DeleteDBSubnetGroupMessage {
        var DBSubnetGroupName: String
    }
    interface DeleteEventSubscriptionMessage {
        var SubscriptionName: String
    }
    interface DeleteEventSubscriptionResult {
        var EventSubscription: EventSubscription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDBClusterParameterGroupsMessage {
        var DBClusterParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDBClusterParametersMessage {
        var DBClusterParameterGroupName: String
        var Source: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDBClusterSnapshotAttributesMessage {
        var DBClusterSnapshotIdentifier: String
    }
    interface DescribeDBClusterSnapshotAttributesResult {
        var DBClusterSnapshotAttributesResult: DBClusterSnapshotAttributesResult?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDBClusterSnapshotsMessage {
        var DBClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterSnapshotIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeShared: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var IncludePublic: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDBClustersMessage {
        var DBClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDBEngineVersionsMessage {
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBParameterGroupFamily: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
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
        var ListSupportedCharacterSets: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ListSupportedTimezones: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDBInstancesMessage {
        var DBInstanceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDBParameterGroupsMessage {
        var DBParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDBParametersMessage {
        var DBParameterGroupName: String
        var Source: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDBSubnetGroupsMessage {
        var DBSubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEngineDefaultClusterParametersMessage {
        var DBParameterGroupFamily: String
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEngineDefaultClusterParametersResult {
        var EngineDefaults: EngineDefaults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEngineDefaultParametersMessage {
        var DBParameterGroupFamily: String
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
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
    interface DescribeEventCategoriesMessage {
        var SourceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventSubscriptionsMessage {
        var SubscriptionName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventsMessage {
        var SourceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceType: String /* "db-instance" | "db-parameter-group" | "db-security-group" | "db-snapshot" | "db-cluster" | "db-cluster-snapshot" | String */
        var StartTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EventCategories: EventCategoriesList?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeOrderableDBInstanceOptionsMessage {
        var Engine: String
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceClass: String?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseModel: String?
            get() = definedExternally
            set(value) = definedExternally
        var Vpc: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePendingMaintenanceActionsMessage {
        var ResourceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeValidDBInstanceModificationsMessage {
        var DBInstanceIdentifier: String
    }
    interface DescribeValidDBInstanceModificationsResult {
        var ValidDBInstanceModificationsMessage: ValidDBInstanceModificationsMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DomainMembership {
        var Domain: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var FQDN: String?
            get() = definedExternally
            set(value) = definedExternally
        var IAMRoleName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DoubleRange {
        var From: Double?
            get() = definedExternally
            set(value) = definedExternally
        var To: Double?
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
        var HostedZoneId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EngineDefaults {
        var DBParameterGroupFamily: String?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: ParametersList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Event {
        var SourceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceType: String /* "db-instance" | "db-parameter-group" | "db-security-group" | "db-snapshot" | "db-cluster" | "db-cluster-snapshot" | String */
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
        var EventCategories: EventCategoriesList?
            get() = definedExternally
            set(value) = definedExternally
        var Date: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var SourceArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventCategoriesMap {
        var SourceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var EventCategories: EventCategoriesList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventCategoriesMessage {
        var EventCategoriesMapList: EventCategoriesMapList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventSubscription {
        var CustomerAwsId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CustSubscriptionId: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnsTopicArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var SubscriptionCreationTime: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceIdsList: SourceIdsList?
            get() = definedExternally
            set(value) = definedExternally
        var EventCategoriesList: EventCategoriesList?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EventSubscriptionArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventSubscriptionsMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var EventSubscriptionsList: EventSubscriptionsList?
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
    interface FailoverDBClusterMessage {
        var DBClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var TargetDBInstanceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FailoverDBClusterResult {
        var DBCluster: DBCluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Filter {
        var Name: String
        var Values: FilterValueList
    }
    interface ListTagsForResourceMessage {
        var ResourceName: String
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyDBClusterMessage {
        var DBClusterIdentifier: String
        var NewDBClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var ApplyImmediately: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var BackupRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpcSecurityGroupIds: VpcSecurityGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MasterUserPassword: String?
            get() = definedExternally
            set(value) = definedExternally
        var OptionGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredBackupWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var EnableIAMDatabaseAuthentication: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var CloudwatchLogsExportConfiguration: CloudwatchLogsExportConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyDBClusterParameterGroupMessage {
        var DBClusterParameterGroupName: String
        var Parameters: ParametersList
    }
    interface ModifyDBClusterResult {
        var DBCluster: DBCluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyDBClusterSnapshotAttributeMessage {
        var DBClusterSnapshotIdentifier: String
        var AttributeName: String
        var ValuesToAdd: AttributeValueList?
            get() = definedExternally
            set(value) = definedExternally
        var ValuesToRemove: AttributeValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyDBClusterSnapshotAttributeResult {
        var DBClusterSnapshotAttributesResult: DBClusterSnapshotAttributesResult?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyDBInstanceMessage {
        var DBInstanceIdentifier: String
        var AllocatedStorage: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceClass: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBSubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBSecurityGroups: DBSecurityGroupNameList?
            get() = definedExternally
            set(value) = definedExternally
        var VpcSecurityGroupIds: VpcSecurityGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var ApplyImmediately: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var MasterUserPassword: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredBackupWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var MultiAZ: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var AllowMajorVersionUpgrade: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMinorVersionUpgrade: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseModel: String?
            get() = definedExternally
            set(value) = definedExternally
        var Iops: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var OptionGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var NewDBInstanceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var StorageType: String?
            get() = definedExternally
            set(value) = definedExternally
        var TdeCredentialArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var TdeCredentialPassword: String?
            get() = definedExternally
            set(value) = definedExternally
        var CACertificateIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var Domain: String?
            get() = definedExternally
            set(value) = definedExternally
        var CopyTagsToSnapshot: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MonitoringInterval: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DBPortNumber: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var PubliclyAccessible: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MonitoringRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var DomainIAMRoleName: String?
            get() = definedExternally
            set(value) = definedExternally
        var PromotionTier: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EnableIAMDatabaseAuthentication: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EnablePerformanceInsights: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var PerformanceInsightsKMSKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CloudwatchLogsExportConfiguration: CloudwatchLogsExportConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyDBInstanceResult {
        var DBInstance: DBInstance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyDBParameterGroupMessage {
        var DBParameterGroupName: String
        var Parameters: ParametersList
    }
    interface ModifyDBSubnetGroupMessage {
        var DBSubnetGroupName: String
        var DBSubnetGroupDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: SubnetIdentifierList
    }
    interface ModifyDBSubnetGroupResult {
        var DBSubnetGroup: DBSubnetGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyEventSubscriptionMessage {
        var SubscriptionName: String
        var SnsTopicArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var EventCategories: EventCategoriesList?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyEventSubscriptionResult {
        var EventSubscription: EventSubscription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OptionGroupMembership {
        var OptionGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrderableDBInstanceOption {
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceClass: String?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseModel: String?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZones: AvailabilityZoneList?
            get() = definedExternally
            set(value) = definedExternally
        var MultiAZCapable: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ReadReplicaCapable: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Vpc: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SupportsStorageEncryption: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var StorageType: String?
            get() = definedExternally
            set(value) = definedExternally
        var SupportsIops: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SupportsEnhancedMonitoring: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SupportsIAMDatabaseAuthentication: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SupportsPerformanceInsights: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var MinStorageSize: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MaxStorageSize: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MinIopsPerDbInstance: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MaxIopsPerDbInstance: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MinIopsPerGib: DoubleOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MaxIopsPerGib: DoubleOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrderableDBInstanceOptionsMessage {
        var OrderableDBInstanceOptions: OrderableDBInstanceOptionsList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
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
        var ApplyType: String?
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
        var ApplyMethod: String /* "immediate" | "pending-reboot" | String */
    }
    interface PendingCloudwatchLogsExports {
        var LogTypesToEnable: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var LogTypesToDisable: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PendingMaintenanceAction {
        var Action: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutoAppliedAfterDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var ForcedApplyDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var OptInStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentApplyDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PendingMaintenanceActionsMessage {
        var PendingMaintenanceActions: PendingMaintenanceActions?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PendingModifiedValues {
        var DBInstanceClass: String?
            get() = definedExternally
            set(value) = definedExternally
        var AllocatedStorage: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MasterUserPassword: String?
            get() = definedExternally
            set(value) = definedExternally
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var BackupRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MultiAZ: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseModel: String?
            get() = definedExternally
            set(value) = definedExternally
        var Iops: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var StorageType: String?
            get() = definedExternally
            set(value) = definedExternally
        var CACertificateIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBSubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var PendingCloudwatchLogsExports: PendingCloudwatchLogsExports?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PromoteReadReplicaDBClusterMessage {
        var DBClusterIdentifier: String
    }
    interface PromoteReadReplicaDBClusterResult {
        var DBCluster: DBCluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Range {
        var From: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var To: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Step: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RebootDBInstanceMessage {
        var DBInstanceIdentifier: String
        var ForceFailover: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RebootDBInstanceResult {
        var DBInstance: DBInstance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveRoleFromDBClusterMessage {
        var DBClusterIdentifier: String
        var RoleArn: String
    }
    interface RemoveSourceIdentifierFromSubscriptionMessage {
        var SubscriptionName: String
        var SourceIdentifier: String
    }
    interface RemoveSourceIdentifierFromSubscriptionResult {
        var EventSubscription: EventSubscription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveTagsFromResourceMessage {
        var ResourceName: String
        var TagKeys: KeyList
    }
    interface ResetDBClusterParameterGroupMessage {
        var DBClusterParameterGroupName: String
        var ResetAllParameters: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: ParametersList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResetDBParameterGroupMessage {
        var DBParameterGroupName: String
        var ResetAllParameters: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: ParametersList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourcePendingMaintenanceActions {
        var ResourceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var PendingMaintenanceActionDetails: PendingMaintenanceActionDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreDBClusterFromSnapshotMessage {
        var AvailabilityZones: AvailabilityZones?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterIdentifier: String
        var SnapshotIdentifier: String
        var Engine: String
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DBSubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: String?
            get() = definedExternally
            set(value) = definedExternally
        var OptionGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpcSecurityGroupIds: VpcSecurityGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var EnableIAMDatabaseAuthentication: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EnableCloudwatchLogsExports: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreDBClusterFromSnapshotResult {
        var DBCluster: DBCluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreDBClusterToPointInTimeMessage {
        var DBClusterIdentifier: String
        var RestoreType: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceDBClusterIdentifier: String
        var RestoreToTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var UseLatestRestorableTime: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DBSubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var OptionGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpcSecurityGroupIds: VpcSecurityGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var EnableIAMDatabaseAuthentication: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EnableCloudwatchLogsExports: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreDBClusterToPointInTimeResult {
        var DBCluster: DBCluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartDBClusterMessage {
        var DBClusterIdentifier: String
    }
    interface StartDBClusterResult {
        var DBCluster: DBCluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopDBClusterMessage {
        var DBClusterIdentifier: String
    }
    interface StopDBClusterResult {
        var DBCluster: DBCluster?
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
        var SubnetStatus: String?
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
    interface Timezone {
        var TimezoneName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpgradeTarget {
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutoUpgrade: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var IsMajorVersionUpgrade: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ValidDBInstanceModificationsMessage {
        var Storage: ValidStorageOptionsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ValidStorageOptions {
        var StorageType: String?
            get() = definedExternally
            set(value) = definedExternally
        var StorageSize: RangeList?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedIops: RangeList?
            get() = definedExternally
            set(value) = definedExternally
        var IopsToStorageRatio: DoubleRangeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VpcSecurityGroupMembership {
        var VpcSecurityGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2014-10-31" | "latest" | String */
    }
}