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
import DocDB.AvailabilityZone
import DocDB.Certificate
import DocDB.DBCluster
import DocDB.DBClusterMember
import DocDB.DBClusterParameterGroup
import DocDB.DBClusterRole
import DocDB.DBClusterSnapshotAttribute
import DocDB.DBClusterSnapshot
import DocDB.DBEngineVersion
import DocDB.DBInstance
import DocDB.DBInstanceStatusInfo
import DocDB.DBSubnetGroup
import DocDB.EventCategoriesMap
import DocDB.Event
import DocDB.Filter
import DocDB.OrderableDBInstanceOption
import DocDB.Parameter
import DocDB.PendingMaintenanceAction
import DocDB.ResourcePendingMaintenanceActions
import DocDB.Subnet
import DocDB.Tag
import DocDB.UpgradeTarget
import DocDB.VpcSecurityGroupMembership
import DocDB.AddTagsToResourceMessage
import DocDB.ApplyPendingMaintenanceActionMessage
import DocDB.ApplyPendingMaintenanceActionResult
import DocDB.CopyDBClusterParameterGroupMessage
import DocDB.CopyDBClusterParameterGroupResult
import DocDB.CopyDBClusterSnapshotMessage
import DocDB.CopyDBClusterSnapshotResult
import DocDB.CreateDBClusterMessage
import DocDB.CreateDBClusterResult
import DocDB.CreateDBClusterParameterGroupMessage
import DocDB.CreateDBClusterParameterGroupResult
import DocDB.CreateDBClusterSnapshotMessage
import DocDB.CreateDBClusterSnapshotResult
import DocDB.CreateDBInstanceMessage
import DocDB.CreateDBInstanceResult
import DocDB.CreateDBSubnetGroupMessage
import DocDB.CreateDBSubnetGroupResult
import DocDB.DeleteDBClusterMessage
import DocDB.DeleteDBClusterResult
import DocDB.DeleteDBClusterParameterGroupMessage
import DocDB.DeleteDBClusterSnapshotMessage
import DocDB.DeleteDBClusterSnapshotResult
import DocDB.DeleteDBInstanceMessage
import DocDB.DeleteDBInstanceResult
import DocDB.DeleteDBSubnetGroupMessage
import DocDB.DescribeCertificatesMessage
import DocDB.CertificateMessage
import DocDB.DescribeDBClusterParameterGroupsMessage
import DocDB.DBClusterParameterGroupsMessage
import DocDB.DescribeDBClusterParametersMessage
import DocDB.DBClusterParameterGroupDetails
import DocDB.DescribeDBClusterSnapshotAttributesMessage
import DocDB.DescribeDBClusterSnapshotAttributesResult
import DocDB.DescribeDBClusterSnapshotsMessage
import DocDB.DBClusterSnapshotMessage
import DocDB.DescribeDBClustersMessage
import DocDB.DBClusterMessage
import DocDB.DescribeDBEngineVersionsMessage
import DocDB.DBEngineVersionMessage
import DocDB.DescribeDBInstancesMessage
import DocDB.DBInstanceMessage
import DocDB.DescribeDBSubnetGroupsMessage
import DocDB.DBSubnetGroupMessage
import DocDB.DescribeEngineDefaultClusterParametersMessage
import DocDB.DescribeEngineDefaultClusterParametersResult
import DocDB.DescribeEventCategoriesMessage
import DocDB.EventCategoriesMessage
import DocDB.DescribeEventsMessage
import DocDB.EventsMessage
import DocDB.DescribeOrderableDBInstanceOptionsMessage
import DocDB.OrderableDBInstanceOptionsMessage
import DocDB.DescribePendingMaintenanceActionsMessage
import DocDB.PendingMaintenanceActionsMessage
import DocDB.FailoverDBClusterMessage
import DocDB.FailoverDBClusterResult
import DocDB.ListTagsForResourceMessage
import DocDB.TagListMessage
import DocDB.ModifyDBClusterMessage
import DocDB.ModifyDBClusterResult
import DocDB.ModifyDBClusterParameterGroupMessage
import DocDB.DBClusterParameterGroupNameMessage
import DocDB.ModifyDBClusterSnapshotAttributeMessage
import DocDB.ModifyDBClusterSnapshotAttributeResult
import DocDB.ModifyDBInstanceMessage
import DocDB.ModifyDBInstanceResult
import DocDB.ModifyDBSubnetGroupMessage
import DocDB.ModifyDBSubnetGroupResult
import DocDB.RebootDBInstanceMessage
import DocDB.RebootDBInstanceResult
import DocDB.RemoveTagsFromResourceMessage
import DocDB.ResetDBClusterParameterGroupMessage
import DocDB.RestoreDBClusterFromSnapshotMessage
import DocDB.RestoreDBClusterFromSnapshotResult
import DocDB.RestoreDBClusterToPointInTimeMessage
import DocDB.RestoreDBClusterToPointInTimeResult
import DocDB.StartDBClusterMessage
import DocDB.StartDBClusterResult
import DocDB.StopDBClusterMessage
import DocDB.StopDBClusterResult
import DocDB.Endpoint
import DocDB.PendingModifiedValues
import DocDB.DBClusterSnapshotAttributesResult
import DocDB.EngineDefaults
import DocDB.CloudwatchLogsExportConfiguration
import DocDB.PendingCloudwatchLogsExports

typealias AttributeValueList = Array<String>

typealias AvailabilityZoneList = Array<AvailabilityZone>

typealias AvailabilityZones = Array<String>

typealias Boolean = Boolean

typealias BooleanOptional = Boolean

typealias CertificateList = Array<Certificate>

typealias DBClusterList = Array<DBCluster>

typealias DBClusterMemberList = Array<DBClusterMember>

typealias DBClusterParameterGroupList = Array<DBClusterParameterGroup>

typealias DBClusterRoles = Array<DBClusterRole>

typealias DBClusterSnapshotAttributeList = Array<DBClusterSnapshotAttribute>

typealias DBClusterSnapshotList = Array<DBClusterSnapshot>

typealias DBEngineVersionList = Array<DBEngineVersion>

typealias DBInstanceList = Array<DBInstance>

typealias DBInstanceStatusInfoList = Array<DBInstanceStatusInfo>

typealias DBSubnetGroups = Array<DBSubnetGroup>

typealias EventCategoriesList = Array<String>

typealias EventCategoriesMapList = Array<EventCategoriesMap>

typealias EventList = Array<Event>

typealias FilterList = Array<Filter>

typealias FilterValueList = Array<String>

typealias Integer = Number

typealias IntegerOptional = Number

typealias KeyList = Array<String>

typealias LogTypeList = Array<String>

typealias OrderableDBInstanceOptionsList = Array<OrderableDBInstanceOption>

typealias ParametersList = Array<Parameter>

typealias PendingMaintenanceActionDetails = Array<PendingMaintenanceAction>

typealias PendingMaintenanceActions = Array<ResourcePendingMaintenanceActions>

typealias String = String

typealias SubnetIdentifierList = Array<String>

typealias SubnetList = Array<Subnet>

typealias TStamp = Date

typealias TagList = Array<Tag>

typealias ValidUpgradeTargetList = Array<UpgradeTarget>

typealias VpcSecurityGroupIdList = Array<String>

typealias VpcSecurityGroupMembershipList = Array<VpcSecurityGroupMembership>

@JsModule("aws-sdk")
external open class DocDB(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & DocDB.Types.ClientConfiguration */
    open fun addTagsToResource(params: AddTagsToResourceMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun addTagsToResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun applyPendingMaintenanceAction(params: ApplyPendingMaintenanceActionMessage, callback: (err: AWSError, data: ApplyPendingMaintenanceActionResult) -> Unit = definedExternally): Request<ApplyPendingMaintenanceActionResult, AWSError>
    open fun applyPendingMaintenanceAction(callback: (err: AWSError, data: ApplyPendingMaintenanceActionResult) -> Unit = definedExternally): Request<ApplyPendingMaintenanceActionResult, AWSError>
    open fun copyDBClusterParameterGroup(params: CopyDBClusterParameterGroupMessage, callback: (err: AWSError, data: CopyDBClusterParameterGroupResult) -> Unit = definedExternally): Request<CopyDBClusterParameterGroupResult, AWSError>
    open fun copyDBClusterParameterGroup(callback: (err: AWSError, data: CopyDBClusterParameterGroupResult) -> Unit = definedExternally): Request<CopyDBClusterParameterGroupResult, AWSError>
    open fun copyDBClusterSnapshot(params: CopyDBClusterSnapshotMessage, callback: (err: AWSError, data: CopyDBClusterSnapshotResult) -> Unit = definedExternally): Request<CopyDBClusterSnapshotResult, AWSError>
    open fun copyDBClusterSnapshot(callback: (err: AWSError, data: CopyDBClusterSnapshotResult) -> Unit = definedExternally): Request<CopyDBClusterSnapshotResult, AWSError>
    open fun createDBCluster(params: CreateDBClusterMessage, callback: (err: AWSError, data: CreateDBClusterResult) -> Unit = definedExternally): Request<CreateDBClusterResult, AWSError>
    open fun createDBCluster(callback: (err: AWSError, data: CreateDBClusterResult) -> Unit = definedExternally): Request<CreateDBClusterResult, AWSError>
    open fun createDBClusterParameterGroup(params: CreateDBClusterParameterGroupMessage, callback: (err: AWSError, data: CreateDBClusterParameterGroupResult) -> Unit = definedExternally): Request<CreateDBClusterParameterGroupResult, AWSError>
    open fun createDBClusterParameterGroup(callback: (err: AWSError, data: CreateDBClusterParameterGroupResult) -> Unit = definedExternally): Request<CreateDBClusterParameterGroupResult, AWSError>
    open fun createDBClusterSnapshot(params: CreateDBClusterSnapshotMessage, callback: (err: AWSError, data: CreateDBClusterSnapshotResult) -> Unit = definedExternally): Request<CreateDBClusterSnapshotResult, AWSError>
    open fun createDBClusterSnapshot(callback: (err: AWSError, data: CreateDBClusterSnapshotResult) -> Unit = definedExternally): Request<CreateDBClusterSnapshotResult, AWSError>
    open fun createDBInstance(params: CreateDBInstanceMessage, callback: (err: AWSError, data: CreateDBInstanceResult) -> Unit = definedExternally): Request<CreateDBInstanceResult, AWSError>
    open fun createDBInstance(callback: (err: AWSError, data: CreateDBInstanceResult) -> Unit = definedExternally): Request<CreateDBInstanceResult, AWSError>
    open fun createDBSubnetGroup(params: CreateDBSubnetGroupMessage, callback: (err: AWSError, data: CreateDBSubnetGroupResult) -> Unit = definedExternally): Request<CreateDBSubnetGroupResult, AWSError>
    open fun createDBSubnetGroup(callback: (err: AWSError, data: CreateDBSubnetGroupResult) -> Unit = definedExternally): Request<CreateDBSubnetGroupResult, AWSError>
    open fun deleteDBCluster(params: DeleteDBClusterMessage, callback: (err: AWSError, data: DeleteDBClusterResult) -> Unit = definedExternally): Request<DeleteDBClusterResult, AWSError>
    open fun deleteDBCluster(callback: (err: AWSError, data: DeleteDBClusterResult) -> Unit = definedExternally): Request<DeleteDBClusterResult, AWSError>
    open fun deleteDBClusterParameterGroup(params: DeleteDBClusterParameterGroupMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDBClusterParameterGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDBClusterSnapshot(params: DeleteDBClusterSnapshotMessage, callback: (err: AWSError, data: DeleteDBClusterSnapshotResult) -> Unit = definedExternally): Request<DeleteDBClusterSnapshotResult, AWSError>
    open fun deleteDBClusterSnapshot(callback: (err: AWSError, data: DeleteDBClusterSnapshotResult) -> Unit = definedExternally): Request<DeleteDBClusterSnapshotResult, AWSError>
    open fun deleteDBInstance(params: DeleteDBInstanceMessage, callback: (err: AWSError, data: DeleteDBInstanceResult) -> Unit = definedExternally): Request<DeleteDBInstanceResult, AWSError>
    open fun deleteDBInstance(callback: (err: AWSError, data: DeleteDBInstanceResult) -> Unit = definedExternally): Request<DeleteDBInstanceResult, AWSError>
    open fun deleteDBSubnetGroup(params: DeleteDBSubnetGroupMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDBSubnetGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeCertificates(params: DescribeCertificatesMessage, callback: (err: AWSError, data: CertificateMessage) -> Unit = definedExternally): Request<CertificateMessage, AWSError>
    open fun describeCertificates(callback: (err: AWSError, data: CertificateMessage) -> Unit = definedExternally): Request<CertificateMessage, AWSError>
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
    open fun describeDBSubnetGroups(params: DescribeDBSubnetGroupsMessage, callback: (err: AWSError, data: DBSubnetGroupMessage) -> Unit = definedExternally): Request<DBSubnetGroupMessage, AWSError>
    open fun describeDBSubnetGroups(callback: (err: AWSError, data: DBSubnetGroupMessage) -> Unit = definedExternally): Request<DBSubnetGroupMessage, AWSError>
    open fun describeEngineDefaultClusterParameters(params: DescribeEngineDefaultClusterParametersMessage, callback: (err: AWSError, data: DescribeEngineDefaultClusterParametersResult) -> Unit = definedExternally): Request<DescribeEngineDefaultClusterParametersResult, AWSError>
    open fun describeEngineDefaultClusterParameters(callback: (err: AWSError, data: DescribeEngineDefaultClusterParametersResult) -> Unit = definedExternally): Request<DescribeEngineDefaultClusterParametersResult, AWSError>
    open fun describeEventCategories(params: DescribeEventCategoriesMessage, callback: (err: AWSError, data: EventCategoriesMessage) -> Unit = definedExternally): Request<EventCategoriesMessage, AWSError>
    open fun describeEventCategories(callback: (err: AWSError, data: EventCategoriesMessage) -> Unit = definedExternally): Request<EventCategoriesMessage, AWSError>
    open fun describeEvents(params: DescribeEventsMessage, callback: (err: AWSError, data: EventsMessage) -> Unit = definedExternally): Request<EventsMessage, AWSError>
    open fun describeEvents(callback: (err: AWSError, data: EventsMessage) -> Unit = definedExternally): Request<EventsMessage, AWSError>
    open fun describeOrderableDBInstanceOptions(params: DescribeOrderableDBInstanceOptionsMessage, callback: (err: AWSError, data: OrderableDBInstanceOptionsMessage) -> Unit = definedExternally): Request<OrderableDBInstanceOptionsMessage, AWSError>
    open fun describeOrderableDBInstanceOptions(callback: (err: AWSError, data: OrderableDBInstanceOptionsMessage) -> Unit = definedExternally): Request<OrderableDBInstanceOptionsMessage, AWSError>
    open fun describePendingMaintenanceActions(params: DescribePendingMaintenanceActionsMessage, callback: (err: AWSError, data: PendingMaintenanceActionsMessage) -> Unit = definedExternally): Request<PendingMaintenanceActionsMessage, AWSError>
    open fun describePendingMaintenanceActions(callback: (err: AWSError, data: PendingMaintenanceActionsMessage) -> Unit = definedExternally): Request<PendingMaintenanceActionsMessage, AWSError>
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
    open fun modifyDBSubnetGroup(params: ModifyDBSubnetGroupMessage, callback: (err: AWSError, data: ModifyDBSubnetGroupResult) -> Unit = definedExternally): Request<ModifyDBSubnetGroupResult, AWSError>
    open fun modifyDBSubnetGroup(callback: (err: AWSError, data: ModifyDBSubnetGroupResult) -> Unit = definedExternally): Request<ModifyDBSubnetGroupResult, AWSError>
    open fun rebootDBInstance(params: RebootDBInstanceMessage, callback: (err: AWSError, data: RebootDBInstanceResult) -> Unit = definedExternally): Request<RebootDBInstanceResult, AWSError>
    open fun rebootDBInstance(callback: (err: AWSError, data: RebootDBInstanceResult) -> Unit = definedExternally): Request<RebootDBInstanceResult, AWSError>
    open fun removeTagsFromResource(params: RemoveTagsFromResourceMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeTagsFromResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun resetDBClusterParameterGroup(params: ResetDBClusterParameterGroupMessage, callback: (err: AWSError, data: DBClusterParameterGroupNameMessage) -> Unit = definedExternally): Request<DBClusterParameterGroupNameMessage, AWSError>
    open fun resetDBClusterParameterGroup(callback: (err: AWSError, data: DBClusterParameterGroupNameMessage) -> Unit = definedExternally): Request<DBClusterParameterGroupNameMessage, AWSError>
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
    interface Certificate {
        var CertificateIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Thumbprint: String?
            get() = definedExternally
            set(value) = definedExternally
        var ValidFrom: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var ValidTill: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CertificateMessage {
        var Certificates: CertificateList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
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
    interface CreateDBClusterMessage {
        var AvailabilityZones: AvailabilityZones?
            get() = definedExternally
            set(value) = definedExternally
        var BackupRetentionPeriod: IntegerOptional?
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
        var MasterUsername: String
        var MasterUserPassword: String
        var PreferredBackupWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
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
        var DBInstanceIdentifier: String
        var DBInstanceClass: String
        var Engine: String
        var AvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMinorVersionUpgrade: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterIdentifier: String
        var PromotionTier: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDBInstanceResult {
        var DBInstance: DBInstance?
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
    interface DBCluster {
        var AvailabilityZones: AvailabilityZones?
            get() = definedExternally
            set(value) = definedExternally
        var BackupRetentionPeriod: IntegerOptional?
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
        var PreferredBackupWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
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
        var ClusterCreateTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var EnabledCloudwatchLogsExports: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: Boolean?
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
        var ValidUpgradeTarget: ValidUpgradeTargetList?
            get() = definedExternally
            set(value) = definedExternally
        var ExportableLogTypes: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var SupportsLogExportsToCloudwatchLogs: Boolean?
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
        var Endpoint: Endpoint?
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
        var VpcSecurityGroups: VpcSecurityGroupMembershipList?
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
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMinorVersionUpgrade: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var PubliclyAccessible: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var StatusInfos: DBInstanceStatusInfoList?
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
        var PromotionTier: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var EnabledCloudwatchLogsExports: LogTypeList?
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
    }
    interface DeleteDBInstanceResult {
        var DBInstance: DBInstance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDBSubnetGroupMessage {
        var DBSubnetGroupName: String
    }
    interface DescribeCertificatesMessage {
        var CertificateIdentifier: String?
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
    interface DescribeEventCategoriesMessage {
        var SourceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
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
        var PreferredBackupWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
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
        var DBInstanceClass: String?
            get() = definedExternally
            set(value) = definedExternally
        var ApplyImmediately: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMinorVersionUpgrade: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var NewDBInstanceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var CACertificateIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var PromotionTier: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyDBInstanceResult {
        var DBInstance: DBInstance?
            get() = definedExternally
            set(value) = definedExternally
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
        var Vpc: Boolean?
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
        var VpcSecurityGroupIds: VpcSecurityGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var EnableCloudwatchLogsExports: LogTypeList?
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
        var VpcSecurityGroupIds: VpcSecurityGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var EnableCloudwatchLogsExports: LogTypeList?
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