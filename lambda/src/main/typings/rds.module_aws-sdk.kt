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
import RDS.AccountQuota
import RDS.AvailabilityZone
import RDS.AvailableProcessorFeature
import RDS.Certificate
import RDS.CustomAvailabilityZone
import RDS.DBClusterBacktrack
import RDS.DBClusterEndpoint
import RDS.DBCluster
import RDS.DBClusterMember
import RDS.DBClusterOptionGroupStatus
import RDS.DBClusterParameterGroup
import RDS.DBClusterRole
import RDS.DBClusterSnapshotAttribute
import RDS.DBClusterSnapshot
import RDS.DBEngineVersion
import RDS.DBInstanceAutomatedBackup
import RDS.DBInstance
import RDS.DBInstanceRole
import RDS.DBInstanceStatusInfo
import RDS.DBParameterGroup
import RDS.DBParameterGroupStatus
import RDS.DBProxy
import RDS.DBSecurityGroupMembership
import RDS.DBSecurityGroup
import RDS.DBSnapshotAttribute
import RDS.DBSnapshot
import RDS.DBSubnetGroup
import RDS.DescribeDBLogFilesDetails
import RDS.DomainMembership
import RDS.DoubleRange
import RDS.EC2SecurityGroup
import RDS.EventCategoriesMap
import RDS.Event
import RDS.EventSubscription
import RDS.ExportTask
import RDS.Filter
import RDS.GlobalCluster
import RDS.GlobalClusterMember
import RDS.IPRange
import RDS.InstallationMedia
import RDS.MinimumEngineVersionPerAllowedValue
import RDS.OptionConfiguration
import RDS.OptionGroupMembership
import RDS.OptionGroupOptionSetting
import RDS.OptionVersion
import RDS.OptionGroupOption
import RDS.OptionGroup
import RDS.OptionSetting
import RDS.Option
import RDS.OrderableDBInstanceOption
import RDS.Parameter
import RDS.PendingMaintenanceAction
import RDS.ResourcePendingMaintenanceActions
import RDS.ProcessorFeature
import RDS.Range
import RDS.RecurringCharge
import RDS.ReservedDBInstance
import RDS.ReservedDBInstancesOffering
import RDS.SourceRegion
import RDS.Subnet
import RDS.CharacterSet
import RDS.Timezone
import RDS.Tag
import RDS.DBProxyTargetGroup
import RDS.DBProxyTarget
import RDS.UserAuthConfigInfo
import RDS.UserAuthConfig
import RDS.ValidStorageOptions
import RDS.UpgradeTarget
import RDS.VpcSecurityGroupMembership
import RDS.AddRoleToDBClusterMessage
import RDS.AddRoleToDBInstanceMessage
import RDS.AddSourceIdentifierToSubscriptionMessage
import RDS.AddSourceIdentifierToSubscriptionResult
import RDS.AddTagsToResourceMessage
import RDS.ApplyPendingMaintenanceActionMessage
import RDS.ApplyPendingMaintenanceActionResult
import RDS.AuthorizeDBSecurityGroupIngressMessage
import RDS.AuthorizeDBSecurityGroupIngressResult
import RDS.BacktrackDBClusterMessage
import RDS.CancelExportTaskMessage
import RDS.CopyDBClusterParameterGroupMessage
import RDS.CopyDBClusterParameterGroupResult
import RDS.CopyDBClusterSnapshotMessage
import RDS.CopyDBClusterSnapshotResult
import RDS.CopyDBParameterGroupMessage
import RDS.CopyDBParameterGroupResult
import RDS.CopyDBSnapshotMessage
import RDS.CopyDBSnapshotResult
import RDS.CopyOptionGroupMessage
import RDS.CopyOptionGroupResult
import RDS.CreateCustomAvailabilityZoneMessage
import RDS.CreateCustomAvailabilityZoneResult
import RDS.CreateDBClusterMessage
import RDS.CreateDBClusterResult
import RDS.CreateDBClusterEndpointMessage
import RDS.CreateDBClusterParameterGroupMessage
import RDS.CreateDBClusterParameterGroupResult
import RDS.CreateDBClusterSnapshotMessage
import RDS.CreateDBClusterSnapshotResult
import RDS.CreateDBInstanceMessage
import RDS.CreateDBInstanceResult
import RDS.CreateDBInstanceReadReplicaMessage
import RDS.CreateDBInstanceReadReplicaResult
import RDS.CreateDBParameterGroupMessage
import RDS.CreateDBParameterGroupResult
import RDS.CreateDBProxyRequest
import RDS.CreateDBProxyResponse
import RDS.CreateDBSecurityGroupMessage
import RDS.CreateDBSecurityGroupResult
import RDS.CreateDBSnapshotMessage
import RDS.CreateDBSnapshotResult
import RDS.CreateDBSubnetGroupMessage
import RDS.CreateDBSubnetGroupResult
import RDS.CreateEventSubscriptionMessage
import RDS.CreateEventSubscriptionResult
import RDS.CreateGlobalClusterMessage
import RDS.CreateGlobalClusterResult
import RDS.CreateOptionGroupMessage
import RDS.CreateOptionGroupResult
import RDS.DeleteCustomAvailabilityZoneMessage
import RDS.DeleteCustomAvailabilityZoneResult
import RDS.DeleteDBClusterMessage
import RDS.DeleteDBClusterResult
import RDS.DeleteDBClusterEndpointMessage
import RDS.DeleteDBClusterParameterGroupMessage
import RDS.DeleteDBClusterSnapshotMessage
import RDS.DeleteDBClusterSnapshotResult
import RDS.DeleteDBInstanceMessage
import RDS.DeleteDBInstanceResult
import RDS.DeleteDBInstanceAutomatedBackupMessage
import RDS.DeleteDBInstanceAutomatedBackupResult
import RDS.DeleteDBParameterGroupMessage
import RDS.DeleteDBProxyRequest
import RDS.DeleteDBProxyResponse
import RDS.DeleteDBSecurityGroupMessage
import RDS.DeleteDBSnapshotMessage
import RDS.DeleteDBSnapshotResult
import RDS.DeleteDBSubnetGroupMessage
import RDS.DeleteEventSubscriptionMessage
import RDS.DeleteEventSubscriptionResult
import RDS.DeleteGlobalClusterMessage
import RDS.DeleteGlobalClusterResult
import RDS.DeleteInstallationMediaMessage
import RDS.DeleteOptionGroupMessage
import RDS.DeregisterDBProxyTargetsRequest
import RDS.DeregisterDBProxyTargetsResponse
import RDS.DescribeAccountAttributesMessage
import RDS.AccountAttributesMessage
import RDS.DescribeCertificatesMessage
import RDS.CertificateMessage
import RDS.DescribeCustomAvailabilityZonesMessage
import RDS.CustomAvailabilityZoneMessage
import RDS.DescribeDBClusterBacktracksMessage
import RDS.DBClusterBacktrackMessage
import RDS.DescribeDBClusterEndpointsMessage
import RDS.DBClusterEndpointMessage
import RDS.DescribeDBClusterParameterGroupsMessage
import RDS.DBClusterParameterGroupsMessage
import RDS.DescribeDBClusterParametersMessage
import RDS.DBClusterParameterGroupDetails
import RDS.DescribeDBClusterSnapshotAttributesMessage
import RDS.DescribeDBClusterSnapshotAttributesResult
import RDS.DescribeDBClusterSnapshotsMessage
import RDS.DBClusterSnapshotMessage
import RDS.DescribeDBClustersMessage
import RDS.DBClusterMessage
import RDS.DescribeDBEngineVersionsMessage
import RDS.DBEngineVersionMessage
import RDS.DescribeDBInstanceAutomatedBackupsMessage
import RDS.DBInstanceAutomatedBackupMessage
import RDS.DescribeDBInstancesMessage
import RDS.DBInstanceMessage
import RDS.DescribeDBLogFilesMessage
import RDS.DescribeDBLogFilesResponse
import RDS.DescribeDBParameterGroupsMessage
import RDS.DBParameterGroupsMessage
import RDS.DescribeDBParametersMessage
import RDS.DBParameterGroupDetails
import RDS.DescribeDBProxiesRequest
import RDS.DescribeDBProxiesResponse
import RDS.DescribeDBProxyTargetGroupsRequest
import RDS.DescribeDBProxyTargetGroupsResponse
import RDS.DescribeDBProxyTargetsRequest
import RDS.DescribeDBProxyTargetsResponse
import RDS.DescribeDBSecurityGroupsMessage
import RDS.DBSecurityGroupMessage
import RDS.DescribeDBSnapshotAttributesMessage
import RDS.DescribeDBSnapshotAttributesResult
import RDS.DescribeDBSnapshotsMessage
import RDS.DBSnapshotMessage
import RDS.DescribeDBSubnetGroupsMessage
import RDS.DBSubnetGroupMessage
import RDS.DescribeEngineDefaultClusterParametersMessage
import RDS.DescribeEngineDefaultClusterParametersResult
import RDS.DescribeEngineDefaultParametersMessage
import RDS.DescribeEngineDefaultParametersResult
import RDS.DescribeEventCategoriesMessage
import RDS.EventCategoriesMessage
import RDS.DescribeEventSubscriptionsMessage
import RDS.EventSubscriptionsMessage
import RDS.DescribeEventsMessage
import RDS.EventsMessage
import RDS.DescribeExportTasksMessage
import RDS.ExportTasksMessage
import RDS.DescribeGlobalClustersMessage
import RDS.GlobalClustersMessage
import RDS.DescribeInstallationMediaMessage
import RDS.InstallationMediaMessage
import RDS.DescribeOptionGroupOptionsMessage
import RDS.OptionGroupOptionsMessage
import RDS.DescribeOptionGroupsMessage
import RDS.OptionGroups
import RDS.DescribeOrderableDBInstanceOptionsMessage
import RDS.OrderableDBInstanceOptionsMessage
import RDS.DescribePendingMaintenanceActionsMessage
import RDS.PendingMaintenanceActionsMessage
import RDS.DescribeReservedDBInstancesMessage
import RDS.ReservedDBInstanceMessage
import RDS.DescribeReservedDBInstancesOfferingsMessage
import RDS.ReservedDBInstancesOfferingMessage
import RDS.DescribeSourceRegionsMessage
import RDS.SourceRegionMessage
import RDS.DescribeValidDBInstanceModificationsMessage
import RDS.DescribeValidDBInstanceModificationsResult
import RDS.DownloadDBLogFilePortionMessage
import RDS.DownloadDBLogFilePortionDetails
import RDS.FailoverDBClusterMessage
import RDS.FailoverDBClusterResult
import RDS.ImportInstallationMediaMessage
import RDS.ListTagsForResourceMessage
import RDS.TagListMessage
import RDS.ModifyCertificatesMessage
import RDS.ModifyCertificatesResult
import RDS.ModifyCurrentDBClusterCapacityMessage
import RDS.DBClusterCapacityInfo
import RDS.ModifyDBClusterMessage
import RDS.ModifyDBClusterResult
import RDS.ModifyDBClusterEndpointMessage
import RDS.ModifyDBClusterParameterGroupMessage
import RDS.DBClusterParameterGroupNameMessage
import RDS.ModifyDBClusterSnapshotAttributeMessage
import RDS.ModifyDBClusterSnapshotAttributeResult
import RDS.ModifyDBInstanceMessage
import RDS.ModifyDBInstanceResult
import RDS.ModifyDBParameterGroupMessage
import RDS.DBParameterGroupNameMessage
import RDS.ModifyDBProxyRequest
import RDS.ModifyDBProxyResponse
import RDS.ModifyDBProxyTargetGroupRequest
import RDS.ModifyDBProxyTargetGroupResponse
import RDS.ModifyDBSnapshotMessage
import RDS.ModifyDBSnapshotResult
import RDS.ModifyDBSnapshotAttributeMessage
import RDS.ModifyDBSnapshotAttributeResult
import RDS.ModifyDBSubnetGroupMessage
import RDS.ModifyDBSubnetGroupResult
import RDS.ModifyEventSubscriptionMessage
import RDS.ModifyEventSubscriptionResult
import RDS.ModifyGlobalClusterMessage
import RDS.ModifyGlobalClusterResult
import RDS.ModifyOptionGroupMessage
import RDS.ModifyOptionGroupResult
import RDS.PromoteReadReplicaMessage
import RDS.PromoteReadReplicaResult
import RDS.PromoteReadReplicaDBClusterMessage
import RDS.PromoteReadReplicaDBClusterResult
import RDS.PurchaseReservedDBInstancesOfferingMessage
import RDS.PurchaseReservedDBInstancesOfferingResult
import RDS.RebootDBInstanceMessage
import RDS.RebootDBInstanceResult
import RDS.RegisterDBProxyTargetsRequest
import RDS.RegisterDBProxyTargetsResponse
import RDS.RemoveFromGlobalClusterMessage
import RDS.RemoveFromGlobalClusterResult
import RDS.RemoveRoleFromDBClusterMessage
import RDS.RemoveRoleFromDBInstanceMessage
import RDS.RemoveSourceIdentifierFromSubscriptionMessage
import RDS.RemoveSourceIdentifierFromSubscriptionResult
import RDS.RemoveTagsFromResourceMessage
import RDS.ResetDBClusterParameterGroupMessage
import RDS.ResetDBParameterGroupMessage
import RDS.RestoreDBClusterFromS3Message
import RDS.RestoreDBClusterFromS3Result
import RDS.RestoreDBClusterFromSnapshotMessage
import RDS.RestoreDBClusterFromSnapshotResult
import RDS.RestoreDBClusterToPointInTimeMessage
import RDS.RestoreDBClusterToPointInTimeResult
import RDS.RestoreDBInstanceFromDBSnapshotMessage
import RDS.RestoreDBInstanceFromDBSnapshotResult
import RDS.RestoreDBInstanceFromS3Message
import RDS.RestoreDBInstanceFromS3Result
import RDS.RestoreDBInstanceToPointInTimeMessage
import RDS.RestoreDBInstanceToPointInTimeResult
import RDS.RevokeDBSecurityGroupIngressMessage
import RDS.RevokeDBSecurityGroupIngressResult
import RDS.StartActivityStreamRequest
import RDS.StartActivityStreamResponse
import RDS.StartDBClusterMessage
import RDS.StartDBClusterResult
import RDS.StartDBInstanceMessage
import RDS.StartDBInstanceResult
import RDS.StartExportTaskMessage
import RDS.StopActivityStreamRequest
import RDS.StopActivityStreamResponse
import RDS.StopDBClusterMessage
import RDS.StopDBClusterResult
import RDS.StopDBInstanceMessage
import RDS.StopDBInstanceResult
import RDS.ScalingConfiguration
import RDS.VpnDetails
import RDS.ScalingConfigurationInfo
import RDS.Endpoint
import RDS.PendingModifiedValues
import RDS.RestoreWindow
import RDS.ConnectionPoolConfigurationInfo
import RDS.DBClusterSnapshotAttributesResult
import RDS.DBSnapshotAttributesResult
import RDS.EngineDefaults
import RDS.ValidDBInstanceModificationsMessage
import RDS.InstallationMediaFailureCause
import RDS.CloudwatchLogsExportConfiguration
import RDS.ConnectionPoolConfiguration
import RDS.PendingCloudwatchLogsExports

typealias AccountQuotaList = Array<AccountQuota>

typealias AttributeValueList = Array<String>

typealias AvailabilityZoneList = Array<AvailabilityZone>

typealias AvailabilityZones = Array<String>

typealias AvailableProcessorFeatureList = Array<AvailableProcessorFeature>

typealias Boolean = Boolean

typealias BooleanOptional = Boolean

typealias CertificateList = Array<Certificate>

typealias CustomAvailabilityZoneList = Array<CustomAvailabilityZone>

typealias DBClusterBacktrackList = Array<DBClusterBacktrack>

typealias DBClusterEndpointList = Array<DBClusterEndpoint>

typealias DBClusterList = Array<DBCluster>

typealias DBClusterMemberList = Array<DBClusterMember>

typealias DBClusterOptionGroupMemberships = Array<DBClusterOptionGroupStatus>

typealias DBClusterParameterGroupList = Array<DBClusterParameterGroup>

typealias DBClusterRoles = Array<DBClusterRole>

typealias DBClusterSnapshotAttributeList = Array<DBClusterSnapshotAttribute>

typealias DBClusterSnapshotList = Array<DBClusterSnapshot>

typealias DBEngineVersionList = Array<DBEngineVersion>

typealias DBInstanceAutomatedBackupList = Array<DBInstanceAutomatedBackup>

typealias DBInstanceList = Array<DBInstance>

typealias DBInstanceRoles = Array<DBInstanceRole>

typealias DBInstanceStatusInfoList = Array<DBInstanceStatusInfo>

typealias DBParameterGroupList = Array<DBParameterGroup>

typealias DBParameterGroupStatusList = Array<DBParameterGroupStatus>

typealias DBProxyList = Array<DBProxy>

typealias DBSecurityGroupMembershipList = Array<DBSecurityGroupMembership>

typealias DBSecurityGroupNameList = Array<String>

typealias DBSecurityGroups = Array<DBSecurityGroup>

typealias DBSnapshotAttributeList = Array<DBSnapshotAttribute>

typealias DBSnapshotList = Array<DBSnapshot>

typealias DBSubnetGroups = Array<DBSubnetGroup>

typealias DescribeDBLogFilesList = Array<DescribeDBLogFilesDetails>

typealias DomainMembershipList = Array<DomainMembership>

typealias Double = Number

typealias DoubleOptional = Number

typealias DoubleRangeList = Array<DoubleRange>

typealias EC2SecurityGroupList = Array<EC2SecurityGroup>

typealias EngineModeList = Array<String>

typealias EventCategoriesList = Array<String>

typealias EventCategoriesMapList = Array<EventCategoriesMap>

typealias EventList = Array<Event>

typealias EventSubscriptionsList = Array<EventSubscription>

typealias ExportTasksList = Array<ExportTask>

typealias FeatureNameList = Array<String>

typealias FilterList = Array<Filter>

typealias FilterValueList = Array<String>

typealias GlobalClusterList = Array<GlobalCluster>

typealias GlobalClusterMemberList = Array<GlobalClusterMember>

typealias IPRangeList = Array<IPRange>

typealias InstallationMediaList = Array<InstallationMedia>

typealias Integer = Number

typealias IntegerOptional = Number

typealias KeyList = Array<String>

typealias LogTypeList = Array<String>

typealias Long = Number

typealias LongOptional = Number

typealias MaxRecords = Number

typealias MinimumEngineVersionPerAllowedValueList = Array<MinimumEngineVersionPerAllowedValue>

typealias OptionConfigurationList = Array<OptionConfiguration>

typealias OptionGroupMembershipList = Array<OptionGroupMembership>

typealias OptionGroupOptionSettingsList = Array<OptionGroupOptionSetting>

typealias OptionGroupOptionVersionsList = Array<OptionVersion>

typealias OptionGroupOptionsList = Array<OptionGroupOption>

typealias OptionGroupsList = Array<OptionGroup>

typealias OptionNamesList = Array<String>

typealias OptionSettingConfigurationList = Array<OptionSetting>

typealias OptionSettingsList = Array<OptionSetting>

typealias OptionsConflictsWith = Array<String>

typealias OptionsDependedOn = Array<String>

typealias OptionsList = Array<Option>

typealias OrderableDBInstanceOptionsList = Array<OrderableDBInstanceOption>

typealias ParametersList = Array<Parameter>

typealias PendingMaintenanceActionDetails = Array<PendingMaintenanceAction>

typealias PendingMaintenanceActions = Array<ResourcePendingMaintenanceActions>

typealias ProcessorFeatureList = Array<ProcessorFeature>

typealias RangeList = Array<Range>

typealias ReadReplicaDBClusterIdentifierList = Array<String>

typealias ReadReplicaDBInstanceIdentifierList = Array<String>

typealias ReadReplicaIdentifierList = Array<String>

typealias ReadersArnList = Array<String>

typealias RecurringChargeList = Array<RecurringCharge>

typealias ReservedDBInstanceList = Array<ReservedDBInstance>

typealias ReservedDBInstancesOfferingList = Array<ReservedDBInstancesOffering>

typealias SourceIdsList = Array<String>

typealias SourceRegionList = Array<SourceRegion>

typealias String = String

typealias StringList = Array<String>

typealias StringSensitive = String

typealias SubnetIdentifierList = Array<String>

typealias SubnetList = Array<Subnet>

typealias SupportedCharacterSetsList = Array<CharacterSet>

typealias SupportedTimezonesList = Array<Timezone>

typealias TStamp = Date

typealias TagList = Array<Tag>

typealias TargetGroupList = Array<DBProxyTargetGroup>

typealias TargetList = Array<DBProxyTarget>

typealias UserAuthConfigInfoList = Array<UserAuthConfigInfo>

typealias UserAuthConfigList = Array<UserAuthConfig>

typealias ValidStorageOptionsList = Array<ValidStorageOptions>

typealias ValidUpgradeTargetList = Array<UpgradeTarget>

typealias VpcSecurityGroupIdList = Array<String>

typealias VpcSecurityGroupMembershipList = Array<VpcSecurityGroupMembership>

@JsModule("aws-sdk")
external open class RDS(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & RDS.Types.ClientConfiguration */
    open fun addRoleToDBCluster(params: AddRoleToDBClusterMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun addRoleToDBCluster(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun addRoleToDBInstance(params: AddRoleToDBInstanceMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun addRoleToDBInstance(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun addSourceIdentifierToSubscription(params: AddSourceIdentifierToSubscriptionMessage, callback: (err: AWSError, data: AddSourceIdentifierToSubscriptionResult) -> Unit = definedExternally): Request<AddSourceIdentifierToSubscriptionResult, AWSError>
    open fun addSourceIdentifierToSubscription(callback: (err: AWSError, data: AddSourceIdentifierToSubscriptionResult) -> Unit = definedExternally): Request<AddSourceIdentifierToSubscriptionResult, AWSError>
    open fun addTagsToResource(params: AddTagsToResourceMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun addTagsToResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun applyPendingMaintenanceAction(params: ApplyPendingMaintenanceActionMessage, callback: (err: AWSError, data: ApplyPendingMaintenanceActionResult) -> Unit = definedExternally): Request<ApplyPendingMaintenanceActionResult, AWSError>
    open fun applyPendingMaintenanceAction(callback: (err: AWSError, data: ApplyPendingMaintenanceActionResult) -> Unit = definedExternally): Request<ApplyPendingMaintenanceActionResult, AWSError>
    open fun authorizeDBSecurityGroupIngress(params: AuthorizeDBSecurityGroupIngressMessage, callback: (err: AWSError, data: AuthorizeDBSecurityGroupIngressResult) -> Unit = definedExternally): Request<AuthorizeDBSecurityGroupIngressResult, AWSError>
    open fun authorizeDBSecurityGroupIngress(callback: (err: AWSError, data: AuthorizeDBSecurityGroupIngressResult) -> Unit = definedExternally): Request<AuthorizeDBSecurityGroupIngressResult, AWSError>
    open fun backtrackDBCluster(params: BacktrackDBClusterMessage, callback: (err: AWSError, data: DBClusterBacktrack) -> Unit = definedExternally): Request<DBClusterBacktrack, AWSError>
    open fun backtrackDBCluster(callback: (err: AWSError, data: DBClusterBacktrack) -> Unit = definedExternally): Request<DBClusterBacktrack, AWSError>
    open fun cancelExportTask(params: CancelExportTaskMessage, callback: (err: AWSError, data: ExportTask) -> Unit = definedExternally): Request<ExportTask, AWSError>
    open fun cancelExportTask(callback: (err: AWSError, data: ExportTask) -> Unit = definedExternally): Request<ExportTask, AWSError>
    open fun copyDBClusterParameterGroup(params: CopyDBClusterParameterGroupMessage, callback: (err: AWSError, data: CopyDBClusterParameterGroupResult) -> Unit = definedExternally): Request<CopyDBClusterParameterGroupResult, AWSError>
    open fun copyDBClusterParameterGroup(callback: (err: AWSError, data: CopyDBClusterParameterGroupResult) -> Unit = definedExternally): Request<CopyDBClusterParameterGroupResult, AWSError>
    open fun copyDBClusterSnapshot(params: CopyDBClusterSnapshotMessage, callback: (err: AWSError, data: CopyDBClusterSnapshotResult) -> Unit = definedExternally): Request<CopyDBClusterSnapshotResult, AWSError>
    open fun copyDBClusterSnapshot(callback: (err: AWSError, data: CopyDBClusterSnapshotResult) -> Unit = definedExternally): Request<CopyDBClusterSnapshotResult, AWSError>
    open fun copyDBParameterGroup(params: CopyDBParameterGroupMessage, callback: (err: AWSError, data: CopyDBParameterGroupResult) -> Unit = definedExternally): Request<CopyDBParameterGroupResult, AWSError>
    open fun copyDBParameterGroup(callback: (err: AWSError, data: CopyDBParameterGroupResult) -> Unit = definedExternally): Request<CopyDBParameterGroupResult, AWSError>
    open fun copyDBSnapshot(params: CopyDBSnapshotMessage, callback: (err: AWSError, data: CopyDBSnapshotResult) -> Unit = definedExternally): Request<CopyDBSnapshotResult, AWSError>
    open fun copyDBSnapshot(callback: (err: AWSError, data: CopyDBSnapshotResult) -> Unit = definedExternally): Request<CopyDBSnapshotResult, AWSError>
    open fun copyOptionGroup(params: CopyOptionGroupMessage, callback: (err: AWSError, data: CopyOptionGroupResult) -> Unit = definedExternally): Request<CopyOptionGroupResult, AWSError>
    open fun copyOptionGroup(callback: (err: AWSError, data: CopyOptionGroupResult) -> Unit = definedExternally): Request<CopyOptionGroupResult, AWSError>
    open fun createCustomAvailabilityZone(params: CreateCustomAvailabilityZoneMessage, callback: (err: AWSError, data: CreateCustomAvailabilityZoneResult) -> Unit = definedExternally): Request<CreateCustomAvailabilityZoneResult, AWSError>
    open fun createCustomAvailabilityZone(callback: (err: AWSError, data: CreateCustomAvailabilityZoneResult) -> Unit = definedExternally): Request<CreateCustomAvailabilityZoneResult, AWSError>
    open fun createDBCluster(params: CreateDBClusterMessage, callback: (err: AWSError, data: CreateDBClusterResult) -> Unit = definedExternally): Request<CreateDBClusterResult, AWSError>
    open fun createDBCluster(callback: (err: AWSError, data: CreateDBClusterResult) -> Unit = definedExternally): Request<CreateDBClusterResult, AWSError>
    open fun createDBClusterEndpoint(params: CreateDBClusterEndpointMessage, callback: (err: AWSError, data: DBClusterEndpoint) -> Unit = definedExternally): Request<DBClusterEndpoint, AWSError>
    open fun createDBClusterEndpoint(callback: (err: AWSError, data: DBClusterEndpoint) -> Unit = definedExternally): Request<DBClusterEndpoint, AWSError>
    open fun createDBClusterParameterGroup(params: CreateDBClusterParameterGroupMessage, callback: (err: AWSError, data: CreateDBClusterParameterGroupResult) -> Unit = definedExternally): Request<CreateDBClusterParameterGroupResult, AWSError>
    open fun createDBClusterParameterGroup(callback: (err: AWSError, data: CreateDBClusterParameterGroupResult) -> Unit = definedExternally): Request<CreateDBClusterParameterGroupResult, AWSError>
    open fun createDBClusterSnapshot(params: CreateDBClusterSnapshotMessage, callback: (err: AWSError, data: CreateDBClusterSnapshotResult) -> Unit = definedExternally): Request<CreateDBClusterSnapshotResult, AWSError>
    open fun createDBClusterSnapshot(callback: (err: AWSError, data: CreateDBClusterSnapshotResult) -> Unit = definedExternally): Request<CreateDBClusterSnapshotResult, AWSError>
    open fun createDBInstance(params: CreateDBInstanceMessage, callback: (err: AWSError, data: CreateDBInstanceResult) -> Unit = definedExternally): Request<CreateDBInstanceResult, AWSError>
    open fun createDBInstance(callback: (err: AWSError, data: CreateDBInstanceResult) -> Unit = definedExternally): Request<CreateDBInstanceResult, AWSError>
    open fun createDBInstanceReadReplica(params: CreateDBInstanceReadReplicaMessage, callback: (err: AWSError, data: CreateDBInstanceReadReplicaResult) -> Unit = definedExternally): Request<CreateDBInstanceReadReplicaResult, AWSError>
    open fun createDBInstanceReadReplica(callback: (err: AWSError, data: CreateDBInstanceReadReplicaResult) -> Unit = definedExternally): Request<CreateDBInstanceReadReplicaResult, AWSError>
    open fun createDBParameterGroup(params: CreateDBParameterGroupMessage, callback: (err: AWSError, data: CreateDBParameterGroupResult) -> Unit = definedExternally): Request<CreateDBParameterGroupResult, AWSError>
    open fun createDBParameterGroup(callback: (err: AWSError, data: CreateDBParameterGroupResult) -> Unit = definedExternally): Request<CreateDBParameterGroupResult, AWSError>
    open fun createDBProxy(params: CreateDBProxyRequest, callback: (err: AWSError, data: CreateDBProxyResponse) -> Unit = definedExternally): Request<CreateDBProxyResponse, AWSError>
    open fun createDBProxy(callback: (err: AWSError, data: CreateDBProxyResponse) -> Unit = definedExternally): Request<CreateDBProxyResponse, AWSError>
    open fun createDBSecurityGroup(params: CreateDBSecurityGroupMessage, callback: (err: AWSError, data: CreateDBSecurityGroupResult) -> Unit = definedExternally): Request<CreateDBSecurityGroupResult, AWSError>
    open fun createDBSecurityGroup(callback: (err: AWSError, data: CreateDBSecurityGroupResult) -> Unit = definedExternally): Request<CreateDBSecurityGroupResult, AWSError>
    open fun createDBSnapshot(params: CreateDBSnapshotMessage, callback: (err: AWSError, data: CreateDBSnapshotResult) -> Unit = definedExternally): Request<CreateDBSnapshotResult, AWSError>
    open fun createDBSnapshot(callback: (err: AWSError, data: CreateDBSnapshotResult) -> Unit = definedExternally): Request<CreateDBSnapshotResult, AWSError>
    open fun createDBSubnetGroup(params: CreateDBSubnetGroupMessage, callback: (err: AWSError, data: CreateDBSubnetGroupResult) -> Unit = definedExternally): Request<CreateDBSubnetGroupResult, AWSError>
    open fun createDBSubnetGroup(callback: (err: AWSError, data: CreateDBSubnetGroupResult) -> Unit = definedExternally): Request<CreateDBSubnetGroupResult, AWSError>
    open fun createEventSubscription(params: CreateEventSubscriptionMessage, callback: (err: AWSError, data: CreateEventSubscriptionResult) -> Unit = definedExternally): Request<CreateEventSubscriptionResult, AWSError>
    open fun createEventSubscription(callback: (err: AWSError, data: CreateEventSubscriptionResult) -> Unit = definedExternally): Request<CreateEventSubscriptionResult, AWSError>
    open fun createGlobalCluster(params: CreateGlobalClusterMessage, callback: (err: AWSError, data: CreateGlobalClusterResult) -> Unit = definedExternally): Request<CreateGlobalClusterResult, AWSError>
    open fun createGlobalCluster(callback: (err: AWSError, data: CreateGlobalClusterResult) -> Unit = definedExternally): Request<CreateGlobalClusterResult, AWSError>
    open fun createOptionGroup(params: CreateOptionGroupMessage, callback: (err: AWSError, data: CreateOptionGroupResult) -> Unit = definedExternally): Request<CreateOptionGroupResult, AWSError>
    open fun createOptionGroup(callback: (err: AWSError, data: CreateOptionGroupResult) -> Unit = definedExternally): Request<CreateOptionGroupResult, AWSError>
    open fun deleteCustomAvailabilityZone(params: DeleteCustomAvailabilityZoneMessage, callback: (err: AWSError, data: DeleteCustomAvailabilityZoneResult) -> Unit = definedExternally): Request<DeleteCustomAvailabilityZoneResult, AWSError>
    open fun deleteCustomAvailabilityZone(callback: (err: AWSError, data: DeleteCustomAvailabilityZoneResult) -> Unit = definedExternally): Request<DeleteCustomAvailabilityZoneResult, AWSError>
    open fun deleteDBCluster(params: DeleteDBClusterMessage, callback: (err: AWSError, data: DeleteDBClusterResult) -> Unit = definedExternally): Request<DeleteDBClusterResult, AWSError>
    open fun deleteDBCluster(callback: (err: AWSError, data: DeleteDBClusterResult) -> Unit = definedExternally): Request<DeleteDBClusterResult, AWSError>
    open fun deleteDBClusterEndpoint(params: DeleteDBClusterEndpointMessage, callback: (err: AWSError, data: DBClusterEndpoint) -> Unit = definedExternally): Request<DBClusterEndpoint, AWSError>
    open fun deleteDBClusterEndpoint(callback: (err: AWSError, data: DBClusterEndpoint) -> Unit = definedExternally): Request<DBClusterEndpoint, AWSError>
    open fun deleteDBClusterParameterGroup(params: DeleteDBClusterParameterGroupMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDBClusterParameterGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDBClusterSnapshot(params: DeleteDBClusterSnapshotMessage, callback: (err: AWSError, data: DeleteDBClusterSnapshotResult) -> Unit = definedExternally): Request<DeleteDBClusterSnapshotResult, AWSError>
    open fun deleteDBClusterSnapshot(callback: (err: AWSError, data: DeleteDBClusterSnapshotResult) -> Unit = definedExternally): Request<DeleteDBClusterSnapshotResult, AWSError>
    open fun deleteDBInstance(params: DeleteDBInstanceMessage, callback: (err: AWSError, data: DeleteDBInstanceResult) -> Unit = definedExternally): Request<DeleteDBInstanceResult, AWSError>
    open fun deleteDBInstance(callback: (err: AWSError, data: DeleteDBInstanceResult) -> Unit = definedExternally): Request<DeleteDBInstanceResult, AWSError>
    open fun deleteDBInstanceAutomatedBackup(params: DeleteDBInstanceAutomatedBackupMessage, callback: (err: AWSError, data: DeleteDBInstanceAutomatedBackupResult) -> Unit = definedExternally): Request<DeleteDBInstanceAutomatedBackupResult, AWSError>
    open fun deleteDBInstanceAutomatedBackup(callback: (err: AWSError, data: DeleteDBInstanceAutomatedBackupResult) -> Unit = definedExternally): Request<DeleteDBInstanceAutomatedBackupResult, AWSError>
    open fun deleteDBParameterGroup(params: DeleteDBParameterGroupMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDBParameterGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDBProxy(params: DeleteDBProxyRequest, callback: (err: AWSError, data: DeleteDBProxyResponse) -> Unit = definedExternally): Request<DeleteDBProxyResponse, AWSError>
    open fun deleteDBProxy(callback: (err: AWSError, data: DeleteDBProxyResponse) -> Unit = definedExternally): Request<DeleteDBProxyResponse, AWSError>
    open fun deleteDBSecurityGroup(params: DeleteDBSecurityGroupMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDBSecurityGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDBSnapshot(params: DeleteDBSnapshotMessage, callback: (err: AWSError, data: DeleteDBSnapshotResult) -> Unit = definedExternally): Request<DeleteDBSnapshotResult, AWSError>
    open fun deleteDBSnapshot(callback: (err: AWSError, data: DeleteDBSnapshotResult) -> Unit = definedExternally): Request<DeleteDBSnapshotResult, AWSError>
    open fun deleteDBSubnetGroup(params: DeleteDBSubnetGroupMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDBSubnetGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEventSubscription(params: DeleteEventSubscriptionMessage, callback: (err: AWSError, data: DeleteEventSubscriptionResult) -> Unit = definedExternally): Request<DeleteEventSubscriptionResult, AWSError>
    open fun deleteEventSubscription(callback: (err: AWSError, data: DeleteEventSubscriptionResult) -> Unit = definedExternally): Request<DeleteEventSubscriptionResult, AWSError>
    open fun deleteGlobalCluster(params: DeleteGlobalClusterMessage, callback: (err: AWSError, data: DeleteGlobalClusterResult) -> Unit = definedExternally): Request<DeleteGlobalClusterResult, AWSError>
    open fun deleteGlobalCluster(callback: (err: AWSError, data: DeleteGlobalClusterResult) -> Unit = definedExternally): Request<DeleteGlobalClusterResult, AWSError>
    open fun deleteInstallationMedia(params: DeleteInstallationMediaMessage, callback: (err: AWSError, data: InstallationMedia) -> Unit = definedExternally): Request<InstallationMedia, AWSError>
    open fun deleteInstallationMedia(callback: (err: AWSError, data: InstallationMedia) -> Unit = definedExternally): Request<InstallationMedia, AWSError>
    open fun deleteOptionGroup(params: DeleteOptionGroupMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteOptionGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deregisterDBProxyTargets(params: DeregisterDBProxyTargetsRequest, callback: (err: AWSError, data: DeregisterDBProxyTargetsResponse) -> Unit = definedExternally): Request<DeregisterDBProxyTargetsResponse, AWSError>
    open fun deregisterDBProxyTargets(callback: (err: AWSError, data: DeregisterDBProxyTargetsResponse) -> Unit = definedExternally): Request<DeregisterDBProxyTargetsResponse, AWSError>
    open fun describeAccountAttributes(params: DescribeAccountAttributesMessage, callback: (err: AWSError, data: AccountAttributesMessage) -> Unit = definedExternally): Request<AccountAttributesMessage, AWSError>
    open fun describeAccountAttributes(callback: (err: AWSError, data: AccountAttributesMessage) -> Unit = definedExternally): Request<AccountAttributesMessage, AWSError>
    open fun describeCertificates(params: DescribeCertificatesMessage, callback: (err: AWSError, data: CertificateMessage) -> Unit = definedExternally): Request<CertificateMessage, AWSError>
    open fun describeCertificates(callback: (err: AWSError, data: CertificateMessage) -> Unit = definedExternally): Request<CertificateMessage, AWSError>
    open fun describeCustomAvailabilityZones(params: DescribeCustomAvailabilityZonesMessage, callback: (err: AWSError, data: CustomAvailabilityZoneMessage) -> Unit = definedExternally): Request<CustomAvailabilityZoneMessage, AWSError>
    open fun describeCustomAvailabilityZones(callback: (err: AWSError, data: CustomAvailabilityZoneMessage) -> Unit = definedExternally): Request<CustomAvailabilityZoneMessage, AWSError>
    open fun describeDBClusterBacktracks(params: DescribeDBClusterBacktracksMessage, callback: (err: AWSError, data: DBClusterBacktrackMessage) -> Unit = definedExternally): Request<DBClusterBacktrackMessage, AWSError>
    open fun describeDBClusterBacktracks(callback: (err: AWSError, data: DBClusterBacktrackMessage) -> Unit = definedExternally): Request<DBClusterBacktrackMessage, AWSError>
    open fun describeDBClusterEndpoints(params: DescribeDBClusterEndpointsMessage, callback: (err: AWSError, data: DBClusterEndpointMessage) -> Unit = definedExternally): Request<DBClusterEndpointMessage, AWSError>
    open fun describeDBClusterEndpoints(callback: (err: AWSError, data: DBClusterEndpointMessage) -> Unit = definedExternally): Request<DBClusterEndpointMessage, AWSError>
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
    open fun describeDBInstanceAutomatedBackups(params: DescribeDBInstanceAutomatedBackupsMessage, callback: (err: AWSError, data: DBInstanceAutomatedBackupMessage) -> Unit = definedExternally): Request<DBInstanceAutomatedBackupMessage, AWSError>
    open fun describeDBInstanceAutomatedBackups(callback: (err: AWSError, data: DBInstanceAutomatedBackupMessage) -> Unit = definedExternally): Request<DBInstanceAutomatedBackupMessage, AWSError>
    open fun describeDBInstances(params: DescribeDBInstancesMessage, callback: (err: AWSError, data: DBInstanceMessage) -> Unit = definedExternally): Request<DBInstanceMessage, AWSError>
    open fun describeDBInstances(callback: (err: AWSError, data: DBInstanceMessage) -> Unit = definedExternally): Request<DBInstanceMessage, AWSError>
    open fun describeDBLogFiles(params: DescribeDBLogFilesMessage, callback: (err: AWSError, data: DescribeDBLogFilesResponse) -> Unit = definedExternally): Request<DescribeDBLogFilesResponse, AWSError>
    open fun describeDBLogFiles(callback: (err: AWSError, data: DescribeDBLogFilesResponse) -> Unit = definedExternally): Request<DescribeDBLogFilesResponse, AWSError>
    open fun describeDBParameterGroups(params: DescribeDBParameterGroupsMessage, callback: (err: AWSError, data: DBParameterGroupsMessage) -> Unit = definedExternally): Request<DBParameterGroupsMessage, AWSError>
    open fun describeDBParameterGroups(callback: (err: AWSError, data: DBParameterGroupsMessage) -> Unit = definedExternally): Request<DBParameterGroupsMessage, AWSError>
    open fun describeDBParameters(params: DescribeDBParametersMessage, callback: (err: AWSError, data: DBParameterGroupDetails) -> Unit = definedExternally): Request<DBParameterGroupDetails, AWSError>
    open fun describeDBParameters(callback: (err: AWSError, data: DBParameterGroupDetails) -> Unit = definedExternally): Request<DBParameterGroupDetails, AWSError>
    open fun describeDBProxies(params: DescribeDBProxiesRequest, callback: (err: AWSError, data: DescribeDBProxiesResponse) -> Unit = definedExternally): Request<DescribeDBProxiesResponse, AWSError>
    open fun describeDBProxies(callback: (err: AWSError, data: DescribeDBProxiesResponse) -> Unit = definedExternally): Request<DescribeDBProxiesResponse, AWSError>
    open fun describeDBProxyTargetGroups(params: DescribeDBProxyTargetGroupsRequest, callback: (err: AWSError, data: DescribeDBProxyTargetGroupsResponse) -> Unit = definedExternally): Request<DescribeDBProxyTargetGroupsResponse, AWSError>
    open fun describeDBProxyTargetGroups(callback: (err: AWSError, data: DescribeDBProxyTargetGroupsResponse) -> Unit = definedExternally): Request<DescribeDBProxyTargetGroupsResponse, AWSError>
    open fun describeDBProxyTargets(params: DescribeDBProxyTargetsRequest, callback: (err: AWSError, data: DescribeDBProxyTargetsResponse) -> Unit = definedExternally): Request<DescribeDBProxyTargetsResponse, AWSError>
    open fun describeDBProxyTargets(callback: (err: AWSError, data: DescribeDBProxyTargetsResponse) -> Unit = definedExternally): Request<DescribeDBProxyTargetsResponse, AWSError>
    open fun describeDBSecurityGroups(params: DescribeDBSecurityGroupsMessage, callback: (err: AWSError, data: DBSecurityGroupMessage) -> Unit = definedExternally): Request<DBSecurityGroupMessage, AWSError>
    open fun describeDBSecurityGroups(callback: (err: AWSError, data: DBSecurityGroupMessage) -> Unit = definedExternally): Request<DBSecurityGroupMessage, AWSError>
    open fun describeDBSnapshotAttributes(params: DescribeDBSnapshotAttributesMessage, callback: (err: AWSError, data: DescribeDBSnapshotAttributesResult) -> Unit = definedExternally): Request<DescribeDBSnapshotAttributesResult, AWSError>
    open fun describeDBSnapshotAttributes(callback: (err: AWSError, data: DescribeDBSnapshotAttributesResult) -> Unit = definedExternally): Request<DescribeDBSnapshotAttributesResult, AWSError>
    open fun describeDBSnapshots(params: DescribeDBSnapshotsMessage, callback: (err: AWSError, data: DBSnapshotMessage) -> Unit = definedExternally): Request<DBSnapshotMessage, AWSError>
    open fun describeDBSnapshots(callback: (err: AWSError, data: DBSnapshotMessage) -> Unit = definedExternally): Request<DBSnapshotMessage, AWSError>
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
    open fun describeExportTasks(params: DescribeExportTasksMessage, callback: (err: AWSError, data: ExportTasksMessage) -> Unit = definedExternally): Request<ExportTasksMessage, AWSError>
    open fun describeExportTasks(callback: (err: AWSError, data: ExportTasksMessage) -> Unit = definedExternally): Request<ExportTasksMessage, AWSError>
    open fun describeGlobalClusters(params: DescribeGlobalClustersMessage, callback: (err: AWSError, data: GlobalClustersMessage) -> Unit = definedExternally): Request<GlobalClustersMessage, AWSError>
    open fun describeGlobalClusters(callback: (err: AWSError, data: GlobalClustersMessage) -> Unit = definedExternally): Request<GlobalClustersMessage, AWSError>
    open fun describeInstallationMedia(params: DescribeInstallationMediaMessage, callback: (err: AWSError, data: InstallationMediaMessage) -> Unit = definedExternally): Request<InstallationMediaMessage, AWSError>
    open fun describeInstallationMedia(callback: (err: AWSError, data: InstallationMediaMessage) -> Unit = definedExternally): Request<InstallationMediaMessage, AWSError>
    open fun describeOptionGroupOptions(params: DescribeOptionGroupOptionsMessage, callback: (err: AWSError, data: OptionGroupOptionsMessage) -> Unit = definedExternally): Request<OptionGroupOptionsMessage, AWSError>
    open fun describeOptionGroupOptions(callback: (err: AWSError, data: OptionGroupOptionsMessage) -> Unit = definedExternally): Request<OptionGroupOptionsMessage, AWSError>
    open fun describeOptionGroups(params: DescribeOptionGroupsMessage, callback: (err: AWSError, data: OptionGroups) -> Unit = definedExternally): Request<OptionGroups, AWSError>
    open fun describeOptionGroups(callback: (err: AWSError, data: OptionGroups) -> Unit = definedExternally): Request<OptionGroups, AWSError>
    open fun describeOrderableDBInstanceOptions(params: DescribeOrderableDBInstanceOptionsMessage, callback: (err: AWSError, data: OrderableDBInstanceOptionsMessage) -> Unit = definedExternally): Request<OrderableDBInstanceOptionsMessage, AWSError>
    open fun describeOrderableDBInstanceOptions(callback: (err: AWSError, data: OrderableDBInstanceOptionsMessage) -> Unit = definedExternally): Request<OrderableDBInstanceOptionsMessage, AWSError>
    open fun describePendingMaintenanceActions(params: DescribePendingMaintenanceActionsMessage, callback: (err: AWSError, data: PendingMaintenanceActionsMessage) -> Unit = definedExternally): Request<PendingMaintenanceActionsMessage, AWSError>
    open fun describePendingMaintenanceActions(callback: (err: AWSError, data: PendingMaintenanceActionsMessage) -> Unit = definedExternally): Request<PendingMaintenanceActionsMessage, AWSError>
    open fun describeReservedDBInstances(params: DescribeReservedDBInstancesMessage, callback: (err: AWSError, data: ReservedDBInstanceMessage) -> Unit = definedExternally): Request<ReservedDBInstanceMessage, AWSError>
    open fun describeReservedDBInstances(callback: (err: AWSError, data: ReservedDBInstanceMessage) -> Unit = definedExternally): Request<ReservedDBInstanceMessage, AWSError>
    open fun describeReservedDBInstancesOfferings(params: DescribeReservedDBInstancesOfferingsMessage, callback: (err: AWSError, data: ReservedDBInstancesOfferingMessage) -> Unit = definedExternally): Request<ReservedDBInstancesOfferingMessage, AWSError>
    open fun describeReservedDBInstancesOfferings(callback: (err: AWSError, data: ReservedDBInstancesOfferingMessage) -> Unit = definedExternally): Request<ReservedDBInstancesOfferingMessage, AWSError>
    open fun describeSourceRegions(params: DescribeSourceRegionsMessage, callback: (err: AWSError, data: SourceRegionMessage) -> Unit = definedExternally): Request<SourceRegionMessage, AWSError>
    open fun describeSourceRegions(callback: (err: AWSError, data: SourceRegionMessage) -> Unit = definedExternally): Request<SourceRegionMessage, AWSError>
    open fun describeValidDBInstanceModifications(params: DescribeValidDBInstanceModificationsMessage, callback: (err: AWSError, data: DescribeValidDBInstanceModificationsResult) -> Unit = definedExternally): Request<DescribeValidDBInstanceModificationsResult, AWSError>
    open fun describeValidDBInstanceModifications(callback: (err: AWSError, data: DescribeValidDBInstanceModificationsResult) -> Unit = definedExternally): Request<DescribeValidDBInstanceModificationsResult, AWSError>
    open fun downloadDBLogFilePortion(params: DownloadDBLogFilePortionMessage, callback: (err: AWSError, data: DownloadDBLogFilePortionDetails) -> Unit = definedExternally): Request<DownloadDBLogFilePortionDetails, AWSError>
    open fun downloadDBLogFilePortion(callback: (err: AWSError, data: DownloadDBLogFilePortionDetails) -> Unit = definedExternally): Request<DownloadDBLogFilePortionDetails, AWSError>
    open fun failoverDBCluster(params: FailoverDBClusterMessage, callback: (err: AWSError, data: FailoverDBClusterResult) -> Unit = definedExternally): Request<FailoverDBClusterResult, AWSError>
    open fun failoverDBCluster(callback: (err: AWSError, data: FailoverDBClusterResult) -> Unit = definedExternally): Request<FailoverDBClusterResult, AWSError>
    open fun importInstallationMedia(params: ImportInstallationMediaMessage, callback: (err: AWSError, data: InstallationMedia) -> Unit = definedExternally): Request<InstallationMedia, AWSError>
    open fun importInstallationMedia(callback: (err: AWSError, data: InstallationMedia) -> Unit = definedExternally): Request<InstallationMedia, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceMessage, callback: (err: AWSError, data: TagListMessage) -> Unit = definedExternally): Request<TagListMessage, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: TagListMessage) -> Unit = definedExternally): Request<TagListMessage, AWSError>
    open fun modifyCertificates(params: ModifyCertificatesMessage, callback: (err: AWSError, data: ModifyCertificatesResult) -> Unit = definedExternally): Request<ModifyCertificatesResult, AWSError>
    open fun modifyCertificates(callback: (err: AWSError, data: ModifyCertificatesResult) -> Unit = definedExternally): Request<ModifyCertificatesResult, AWSError>
    open fun modifyCurrentDBClusterCapacity(params: ModifyCurrentDBClusterCapacityMessage, callback: (err: AWSError, data: DBClusterCapacityInfo) -> Unit = definedExternally): Request<DBClusterCapacityInfo, AWSError>
    open fun modifyCurrentDBClusterCapacity(callback: (err: AWSError, data: DBClusterCapacityInfo) -> Unit = definedExternally): Request<DBClusterCapacityInfo, AWSError>
    open fun modifyDBCluster(params: ModifyDBClusterMessage, callback: (err: AWSError, data: ModifyDBClusterResult) -> Unit = definedExternally): Request<ModifyDBClusterResult, AWSError>
    open fun modifyDBCluster(callback: (err: AWSError, data: ModifyDBClusterResult) -> Unit = definedExternally): Request<ModifyDBClusterResult, AWSError>
    open fun modifyDBClusterEndpoint(params: ModifyDBClusterEndpointMessage, callback: (err: AWSError, data: DBClusterEndpoint) -> Unit = definedExternally): Request<DBClusterEndpoint, AWSError>
    open fun modifyDBClusterEndpoint(callback: (err: AWSError, data: DBClusterEndpoint) -> Unit = definedExternally): Request<DBClusterEndpoint, AWSError>
    open fun modifyDBClusterParameterGroup(params: ModifyDBClusterParameterGroupMessage, callback: (err: AWSError, data: DBClusterParameterGroupNameMessage) -> Unit = definedExternally): Request<DBClusterParameterGroupNameMessage, AWSError>
    open fun modifyDBClusterParameterGroup(callback: (err: AWSError, data: DBClusterParameterGroupNameMessage) -> Unit = definedExternally): Request<DBClusterParameterGroupNameMessage, AWSError>
    open fun modifyDBClusterSnapshotAttribute(params: ModifyDBClusterSnapshotAttributeMessage, callback: (err: AWSError, data: ModifyDBClusterSnapshotAttributeResult) -> Unit = definedExternally): Request<ModifyDBClusterSnapshotAttributeResult, AWSError>
    open fun modifyDBClusterSnapshotAttribute(callback: (err: AWSError, data: ModifyDBClusterSnapshotAttributeResult) -> Unit = definedExternally): Request<ModifyDBClusterSnapshotAttributeResult, AWSError>
    open fun modifyDBInstance(params: ModifyDBInstanceMessage, callback: (err: AWSError, data: ModifyDBInstanceResult) -> Unit = definedExternally): Request<ModifyDBInstanceResult, AWSError>
    open fun modifyDBInstance(callback: (err: AWSError, data: ModifyDBInstanceResult) -> Unit = definedExternally): Request<ModifyDBInstanceResult, AWSError>
    open fun modifyDBParameterGroup(params: ModifyDBParameterGroupMessage, callback: (err: AWSError, data: DBParameterGroupNameMessage) -> Unit = definedExternally): Request<DBParameterGroupNameMessage, AWSError>
    open fun modifyDBParameterGroup(callback: (err: AWSError, data: DBParameterGroupNameMessage) -> Unit = definedExternally): Request<DBParameterGroupNameMessage, AWSError>
    open fun modifyDBProxy(params: ModifyDBProxyRequest, callback: (err: AWSError, data: ModifyDBProxyResponse) -> Unit = definedExternally): Request<ModifyDBProxyResponse, AWSError>
    open fun modifyDBProxy(callback: (err: AWSError, data: ModifyDBProxyResponse) -> Unit = definedExternally): Request<ModifyDBProxyResponse, AWSError>
    open fun modifyDBProxyTargetGroup(params: ModifyDBProxyTargetGroupRequest, callback: (err: AWSError, data: ModifyDBProxyTargetGroupResponse) -> Unit = definedExternally): Request<ModifyDBProxyTargetGroupResponse, AWSError>
    open fun modifyDBProxyTargetGroup(callback: (err: AWSError, data: ModifyDBProxyTargetGroupResponse) -> Unit = definedExternally): Request<ModifyDBProxyTargetGroupResponse, AWSError>
    open fun modifyDBSnapshot(params: ModifyDBSnapshotMessage, callback: (err: AWSError, data: ModifyDBSnapshotResult) -> Unit = definedExternally): Request<ModifyDBSnapshotResult, AWSError>
    open fun modifyDBSnapshot(callback: (err: AWSError, data: ModifyDBSnapshotResult) -> Unit = definedExternally): Request<ModifyDBSnapshotResult, AWSError>
    open fun modifyDBSnapshotAttribute(params: ModifyDBSnapshotAttributeMessage, callback: (err: AWSError, data: ModifyDBSnapshotAttributeResult) -> Unit = definedExternally): Request<ModifyDBSnapshotAttributeResult, AWSError>
    open fun modifyDBSnapshotAttribute(callback: (err: AWSError, data: ModifyDBSnapshotAttributeResult) -> Unit = definedExternally): Request<ModifyDBSnapshotAttributeResult, AWSError>
    open fun modifyDBSubnetGroup(params: ModifyDBSubnetGroupMessage, callback: (err: AWSError, data: ModifyDBSubnetGroupResult) -> Unit = definedExternally): Request<ModifyDBSubnetGroupResult, AWSError>
    open fun modifyDBSubnetGroup(callback: (err: AWSError, data: ModifyDBSubnetGroupResult) -> Unit = definedExternally): Request<ModifyDBSubnetGroupResult, AWSError>
    open fun modifyEventSubscription(params: ModifyEventSubscriptionMessage, callback: (err: AWSError, data: ModifyEventSubscriptionResult) -> Unit = definedExternally): Request<ModifyEventSubscriptionResult, AWSError>
    open fun modifyEventSubscription(callback: (err: AWSError, data: ModifyEventSubscriptionResult) -> Unit = definedExternally): Request<ModifyEventSubscriptionResult, AWSError>
    open fun modifyGlobalCluster(params: ModifyGlobalClusterMessage, callback: (err: AWSError, data: ModifyGlobalClusterResult) -> Unit = definedExternally): Request<ModifyGlobalClusterResult, AWSError>
    open fun modifyGlobalCluster(callback: (err: AWSError, data: ModifyGlobalClusterResult) -> Unit = definedExternally): Request<ModifyGlobalClusterResult, AWSError>
    open fun modifyOptionGroup(params: ModifyOptionGroupMessage, callback: (err: AWSError, data: ModifyOptionGroupResult) -> Unit = definedExternally): Request<ModifyOptionGroupResult, AWSError>
    open fun modifyOptionGroup(callback: (err: AWSError, data: ModifyOptionGroupResult) -> Unit = definedExternally): Request<ModifyOptionGroupResult, AWSError>
    open fun promoteReadReplica(params: PromoteReadReplicaMessage, callback: (err: AWSError, data: PromoteReadReplicaResult) -> Unit = definedExternally): Request<PromoteReadReplicaResult, AWSError>
    open fun promoteReadReplica(callback: (err: AWSError, data: PromoteReadReplicaResult) -> Unit = definedExternally): Request<PromoteReadReplicaResult, AWSError>
    open fun promoteReadReplicaDBCluster(params: PromoteReadReplicaDBClusterMessage, callback: (err: AWSError, data: PromoteReadReplicaDBClusterResult) -> Unit = definedExternally): Request<PromoteReadReplicaDBClusterResult, AWSError>
    open fun promoteReadReplicaDBCluster(callback: (err: AWSError, data: PromoteReadReplicaDBClusterResult) -> Unit = definedExternally): Request<PromoteReadReplicaDBClusterResult, AWSError>
    open fun purchaseReservedDBInstancesOffering(params: PurchaseReservedDBInstancesOfferingMessage, callback: (err: AWSError, data: PurchaseReservedDBInstancesOfferingResult) -> Unit = definedExternally): Request<PurchaseReservedDBInstancesOfferingResult, AWSError>
    open fun purchaseReservedDBInstancesOffering(callback: (err: AWSError, data: PurchaseReservedDBInstancesOfferingResult) -> Unit = definedExternally): Request<PurchaseReservedDBInstancesOfferingResult, AWSError>
    open fun rebootDBInstance(params: RebootDBInstanceMessage, callback: (err: AWSError, data: RebootDBInstanceResult) -> Unit = definedExternally): Request<RebootDBInstanceResult, AWSError>
    open fun rebootDBInstance(callback: (err: AWSError, data: RebootDBInstanceResult) -> Unit = definedExternally): Request<RebootDBInstanceResult, AWSError>
    open fun registerDBProxyTargets(params: RegisterDBProxyTargetsRequest, callback: (err: AWSError, data: RegisterDBProxyTargetsResponse) -> Unit = definedExternally): Request<RegisterDBProxyTargetsResponse, AWSError>
    open fun registerDBProxyTargets(callback: (err: AWSError, data: RegisterDBProxyTargetsResponse) -> Unit = definedExternally): Request<RegisterDBProxyTargetsResponse, AWSError>
    open fun removeFromGlobalCluster(params: RemoveFromGlobalClusterMessage, callback: (err: AWSError, data: RemoveFromGlobalClusterResult) -> Unit = definedExternally): Request<RemoveFromGlobalClusterResult, AWSError>
    open fun removeFromGlobalCluster(callback: (err: AWSError, data: RemoveFromGlobalClusterResult) -> Unit = definedExternally): Request<RemoveFromGlobalClusterResult, AWSError>
    open fun removeRoleFromDBCluster(params: RemoveRoleFromDBClusterMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeRoleFromDBCluster(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeRoleFromDBInstance(params: RemoveRoleFromDBInstanceMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeRoleFromDBInstance(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeSourceIdentifierFromSubscription(params: RemoveSourceIdentifierFromSubscriptionMessage, callback: (err: AWSError, data: RemoveSourceIdentifierFromSubscriptionResult) -> Unit = definedExternally): Request<RemoveSourceIdentifierFromSubscriptionResult, AWSError>
    open fun removeSourceIdentifierFromSubscription(callback: (err: AWSError, data: RemoveSourceIdentifierFromSubscriptionResult) -> Unit = definedExternally): Request<RemoveSourceIdentifierFromSubscriptionResult, AWSError>
    open fun removeTagsFromResource(params: RemoveTagsFromResourceMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeTagsFromResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun resetDBClusterParameterGroup(params: ResetDBClusterParameterGroupMessage, callback: (err: AWSError, data: DBClusterParameterGroupNameMessage) -> Unit = definedExternally): Request<DBClusterParameterGroupNameMessage, AWSError>
    open fun resetDBClusterParameterGroup(callback: (err: AWSError, data: DBClusterParameterGroupNameMessage) -> Unit = definedExternally): Request<DBClusterParameterGroupNameMessage, AWSError>
    open fun resetDBParameterGroup(params: ResetDBParameterGroupMessage, callback: (err: AWSError, data: DBParameterGroupNameMessage) -> Unit = definedExternally): Request<DBParameterGroupNameMessage, AWSError>
    open fun resetDBParameterGroup(callback: (err: AWSError, data: DBParameterGroupNameMessage) -> Unit = definedExternally): Request<DBParameterGroupNameMessage, AWSError>
    open fun restoreDBClusterFromS3(params: RestoreDBClusterFromS3Message, callback: (err: AWSError, data: RestoreDBClusterFromS3Result) -> Unit = definedExternally): Request<RestoreDBClusterFromS3Result, AWSError>
    open fun restoreDBClusterFromS3(callback: (err: AWSError, data: RestoreDBClusterFromS3Result) -> Unit = definedExternally): Request<RestoreDBClusterFromS3Result, AWSError>
    open fun restoreDBClusterFromSnapshot(params: RestoreDBClusterFromSnapshotMessage, callback: (err: AWSError, data: RestoreDBClusterFromSnapshotResult) -> Unit = definedExternally): Request<RestoreDBClusterFromSnapshotResult, AWSError>
    open fun restoreDBClusterFromSnapshot(callback: (err: AWSError, data: RestoreDBClusterFromSnapshotResult) -> Unit = definedExternally): Request<RestoreDBClusterFromSnapshotResult, AWSError>
    open fun restoreDBClusterToPointInTime(params: RestoreDBClusterToPointInTimeMessage, callback: (err: AWSError, data: RestoreDBClusterToPointInTimeResult) -> Unit = definedExternally): Request<RestoreDBClusterToPointInTimeResult, AWSError>
    open fun restoreDBClusterToPointInTime(callback: (err: AWSError, data: RestoreDBClusterToPointInTimeResult) -> Unit = definedExternally): Request<RestoreDBClusterToPointInTimeResult, AWSError>
    open fun restoreDBInstanceFromDBSnapshot(params: RestoreDBInstanceFromDBSnapshotMessage, callback: (err: AWSError, data: RestoreDBInstanceFromDBSnapshotResult) -> Unit = definedExternally): Request<RestoreDBInstanceFromDBSnapshotResult, AWSError>
    open fun restoreDBInstanceFromDBSnapshot(callback: (err: AWSError, data: RestoreDBInstanceFromDBSnapshotResult) -> Unit = definedExternally): Request<RestoreDBInstanceFromDBSnapshotResult, AWSError>
    open fun restoreDBInstanceFromS3(params: RestoreDBInstanceFromS3Message, callback: (err: AWSError, data: RestoreDBInstanceFromS3Result) -> Unit = definedExternally): Request<RestoreDBInstanceFromS3Result, AWSError>
    open fun restoreDBInstanceFromS3(callback: (err: AWSError, data: RestoreDBInstanceFromS3Result) -> Unit = definedExternally): Request<RestoreDBInstanceFromS3Result, AWSError>
    open fun restoreDBInstanceToPointInTime(params: RestoreDBInstanceToPointInTimeMessage, callback: (err: AWSError, data: RestoreDBInstanceToPointInTimeResult) -> Unit = definedExternally): Request<RestoreDBInstanceToPointInTimeResult, AWSError>
    open fun restoreDBInstanceToPointInTime(callback: (err: AWSError, data: RestoreDBInstanceToPointInTimeResult) -> Unit = definedExternally): Request<RestoreDBInstanceToPointInTimeResult, AWSError>
    open fun revokeDBSecurityGroupIngress(params: RevokeDBSecurityGroupIngressMessage, callback: (err: AWSError, data: RevokeDBSecurityGroupIngressResult) -> Unit = definedExternally): Request<RevokeDBSecurityGroupIngressResult, AWSError>
    open fun revokeDBSecurityGroupIngress(callback: (err: AWSError, data: RevokeDBSecurityGroupIngressResult) -> Unit = definedExternally): Request<RevokeDBSecurityGroupIngressResult, AWSError>
    open fun startActivityStream(params: StartActivityStreamRequest, callback: (err: AWSError, data: StartActivityStreamResponse) -> Unit = definedExternally): Request<StartActivityStreamResponse, AWSError>
    open fun startActivityStream(callback: (err: AWSError, data: StartActivityStreamResponse) -> Unit = definedExternally): Request<StartActivityStreamResponse, AWSError>
    open fun startDBCluster(params: StartDBClusterMessage, callback: (err: AWSError, data: StartDBClusterResult) -> Unit = definedExternally): Request<StartDBClusterResult, AWSError>
    open fun startDBCluster(callback: (err: AWSError, data: StartDBClusterResult) -> Unit = definedExternally): Request<StartDBClusterResult, AWSError>
    open fun startDBInstance(params: StartDBInstanceMessage, callback: (err: AWSError, data: StartDBInstanceResult) -> Unit = definedExternally): Request<StartDBInstanceResult, AWSError>
    open fun startDBInstance(callback: (err: AWSError, data: StartDBInstanceResult) -> Unit = definedExternally): Request<StartDBInstanceResult, AWSError>
    open fun startExportTask(params: StartExportTaskMessage, callback: (err: AWSError, data: ExportTask) -> Unit = definedExternally): Request<ExportTask, AWSError>
    open fun startExportTask(callback: (err: AWSError, data: ExportTask) -> Unit = definedExternally): Request<ExportTask, AWSError>
    open fun stopActivityStream(params: StopActivityStreamRequest, callback: (err: AWSError, data: StopActivityStreamResponse) -> Unit = definedExternally): Request<StopActivityStreamResponse, AWSError>
    open fun stopActivityStream(callback: (err: AWSError, data: StopActivityStreamResponse) -> Unit = definedExternally): Request<StopActivityStreamResponse, AWSError>
    open fun stopDBCluster(params: StopDBClusterMessage, callback: (err: AWSError, data: StopDBClusterResult) -> Unit = definedExternally): Request<StopDBClusterResult, AWSError>
    open fun stopDBCluster(callback: (err: AWSError, data: StopDBClusterResult) -> Unit = definedExternally): Request<StopDBClusterResult, AWSError>
    open fun stopDBInstance(params: StopDBInstanceMessage, callback: (err: AWSError, data: StopDBInstanceResult) -> Unit = definedExternally): Request<StopDBInstanceResult, AWSError>
    open fun stopDBInstance(callback: (err: AWSError, data: StopDBInstanceResult) -> Unit = definedExternally): Request<StopDBInstanceResult, AWSError>
    open fun waitFor(state: String, params: DescribeDBInstancesMessage, callback: (err: AWSError, data: DBInstanceMessage) -> Unit = definedExternally): Request<DBInstanceMessage, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DBInstanceMessage) -> Unit = definedExternally): Request<DBInstanceMessage, AWSError>
    open fun waitFor(state: String, params: DescribeDBSnapshotsMessage, callback: (err: AWSError, data: DBSnapshotMessage) -> Unit = definedExternally): Request<DBSnapshotMessage, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DBSnapshotMessage) -> Unit = definedExternally): Request<DBSnapshotMessage, AWSError>
    open fun waitFor(state: String, params: DescribeDBClusterSnapshotsMessage, callback: (err: AWSError, data: DBClusterSnapshotMessage) -> Unit = definedExternally): Request<DBClusterSnapshotMessage, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DBClusterSnapshotMessage) -> Unit = definedExternally): Request<DBClusterSnapshotMessage, AWSError>
    interface AccountAttributesMessage {
        var AccountQuotas: AccountQuotaList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AccountQuota {
        var AccountQuotaName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Used: Long?
            get() = definedExternally
            set(value) = definedExternally
        var Max: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddRoleToDBClusterMessage {
        var DBClusterIdentifier: String
        var RoleArn: String
        var FeatureName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddRoleToDBInstanceMessage {
        var DBInstanceIdentifier: String
        var RoleArn: String
        var FeatureName: String
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
    interface AuthorizeDBSecurityGroupIngressMessage {
        var DBSecurityGroupName: String
        var CIDRIP: String?
            get() = definedExternally
            set(value) = definedExternally
        var EC2SecurityGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var EC2SecurityGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var EC2SecurityGroupOwnerId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AuthorizeDBSecurityGroupIngressResult {
        var DBSecurityGroup: DBSecurityGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AvailabilityZone {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AvailableProcessorFeature {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultValue: String?
            get() = definedExternally
            set(value) = definedExternally
        var AllowedValues: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BacktrackDBClusterMessage {
        var DBClusterIdentifier: String
        var BacktrackTo: TStamp
        var Force: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var UseEarliestTimeOnPointInTimeUnavailable: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelExportTaskMessage {
        var ExportTaskIdentifier: String
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
        var CustomerOverride: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var CustomerOverrideValidTill: TStamp?
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
    interface ConnectionPoolConfiguration {
        var MaxConnectionsPercent: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MaxIdleConnectionsPercent: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionBorrowTimeout: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SessionPinningFilters: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var InitQuery: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConnectionPoolConfigurationInfo {
        var MaxConnectionsPercent: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var MaxIdleConnectionsPercent: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionBorrowTimeout: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var SessionPinningFilters: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var InitQuery: String?
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
        var SourceRegion: String?
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
    interface CopyDBSnapshotMessage {
        var SourceDBSnapshotIdentifier: String
        var TargetDBSnapshotIdentifier: String
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var CopyTags: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var PreSignedUrl: String?
            get() = definedExternally
            set(value) = definedExternally
        var OptionGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceRegion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CopyDBSnapshotResult {
        var DBSnapshot: DBSnapshot?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CopyOptionGroupMessage {
        var SourceOptionGroupIdentifier: String
        var TargetOptionGroupIdentifier: String
        var TargetOptionGroupDescription: String
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CopyOptionGroupResult {
        var OptionGroup: OptionGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCustomAvailabilityZoneMessage {
        var CustomAvailabilityZoneName: String
        var ExistingVpnId: String?
            get() = definedExternally
            set(value) = definedExternally
        var NewVpnTunnelName: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpnTunnelOriginatorIP: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCustomAvailabilityZoneResult {
        var CustomAvailabilityZone: CustomAvailabilityZone?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDBClusterEndpointMessage {
        var DBClusterIdentifier: String
        var DBClusterEndpointIdentifier: String
        var EndpointType: String
        var StaticMembers: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var ExcludedMembers: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
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
        var BacktrackWindow: LongOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EnableCloudwatchLogsExports: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var EngineMode: String?
            get() = definedExternally
            set(value) = definedExternally
        var ScalingConfiguration: ScalingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var EnableHttpEndpoint: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var CopyTagsToSnapshot: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Domain: String?
            get() = definedExternally
            set(value) = definedExternally
        var DomainIAMRoleName: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceRegion: String?
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
        var PerformanceInsightsRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EnableCloudwatchLogsExports: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessorFeatures: ProcessorFeatureList?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MaxAllocatedStorage: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDBInstanceReadReplicaMessage {
        var DBInstanceIdentifier: String
        var SourceDBInstanceIdentifier: String
        var DBInstanceClass: String?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MultiAZ: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMinorVersionUpgrade: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Iops: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var OptionGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var PubliclyAccessible: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var DBSubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpcSecurityGroupIds: VpcSecurityGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var StorageType: String?
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
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var PreSignedUrl: String?
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
        var PerformanceInsightsRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EnableCloudwatchLogsExports: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessorFeatures: ProcessorFeatureList?
            get() = definedExternally
            set(value) = definedExternally
        var UseDefaultProcessorFeatures: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Domain: String?
            get() = definedExternally
            set(value) = definedExternally
        var DomainIAMRoleName: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceRegion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDBInstanceReadReplicaResult {
        var DBInstance: DBInstance?
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
    interface CreateDBProxyRequest {
        var DBProxyName: String
        var EngineFamily: String /* "MYSQL" | String */
        var Auth: UserAuthConfigList
        var RoleArn: String
        var VpcSubnetIds: StringList
        var VpcSecurityGroupIds: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var RequireTLS: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var IdleClientTimeout: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DebugLogging: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDBProxyResponse {
        var DBProxy: DBProxy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDBSecurityGroupMessage {
        var DBSecurityGroupName: String
        var DBSecurityGroupDescription: String
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDBSecurityGroupResult {
        var DBSecurityGroup: DBSecurityGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDBSnapshotMessage {
        var DBSnapshotIdentifier: String
        var DBInstanceIdentifier: String
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDBSnapshotResult {
        var DBSnapshot: DBSnapshot?
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
    interface CreateGlobalClusterMessage {
        var GlobalClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceDBClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: String?
            get() = definedExternally
            set(value) = definedExternally
        var StorageEncrypted: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGlobalClusterResult {
        var GlobalCluster: GlobalCluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateOptionGroupMessage {
        var OptionGroupName: String
        var EngineName: String
        var MajorEngineVersion: String
        var OptionGroupDescription: String
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateOptionGroupResult {
        var OptionGroup: OptionGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CustomAvailabilityZone {
        var CustomAvailabilityZoneId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CustomAvailabilityZoneName: String?
            get() = definedExternally
            set(value) = definedExternally
        var CustomAvailabilityZoneStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpnDetails: VpnDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CustomAvailabilityZoneMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var CustomAvailabilityZones: CustomAvailabilityZoneList?
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
        var CustomEndpoints: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var MultiAZ: BooleanOptional?
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
        var IAMDatabaseAuthenticationEnabled: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var CloneGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterCreateTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var EarliestBacktrackTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var BacktrackWindow: LongOptional?
            get() = definedExternally
            set(value) = definedExternally
        var BacktrackConsumedChangeRecords: LongOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EnabledCloudwatchLogsExports: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var Capacity: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EngineMode: String?
            get() = definedExternally
            set(value) = definedExternally
        var ScalingConfigurationInfo: ScalingConfigurationInfo?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var HttpEndpointEnabled: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ActivityStreamMode: String /* "sync" | "async" | String */
        var ActivityStreamStatus: String /* "stopped" | "starting" | "started" | "stopping" | String */
        var ActivityStreamKmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ActivityStreamKinesisStreamName: String?
            get() = definedExternally
            set(value) = definedExternally
        var CopyTagsToSnapshot: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var CrossAccountClone: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DomainMemberships: DomainMembershipList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBClusterBacktrack {
        var DBClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var BacktrackIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var BacktrackTo: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var BacktrackedFrom: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var BacktrackRequestCreationTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBClusterBacktrackMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterBacktracks: DBClusterBacktrackList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBClusterCapacityInfo {
        var DBClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var PendingCapacity: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentCapacity: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SecondsBeforeTimeout: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var TimeoutAction: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBClusterEndpoint {
        var DBClusterEndpointIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterEndpointResourceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var Endpoint: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointType: String?
            get() = definedExternally
            set(value) = definedExternally
        var CustomEndpointType: String?
            get() = definedExternally
            set(value) = definedExternally
        var StaticMembers: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var ExcludedMembers: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterEndpointArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBClusterEndpointMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterEndpoints: DBClusterEndpointList?
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
        var FeatureName: String?
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
        var SupportedEngineModes: EngineModeList?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedFeatureNames: FeatureNameList?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
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
        var PerformanceInsightsRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EnabledCloudwatchLogsExports: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessorFeatures: ProcessorFeatureList?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AssociatedRoles: DBInstanceRoles?
            get() = definedExternally
            set(value) = definedExternally
        var ListenerEndpoint: Endpoint?
            get() = definedExternally
            set(value) = definedExternally
        var MaxAllocatedStorage: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBInstanceAutomatedBackup {
        var DBInstanceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var DbiResourceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Region: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var RestoreWindow: RestoreWindow?
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
        var AvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceCreateTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var MasterUsername: String?
            get() = definedExternally
            set(value) = definedExternally
        var Engine: String?
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
        var OptionGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var TdeCredentialArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Encrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var StorageType: String?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Timezone: String?
            get() = definedExternally
            set(value) = definedExternally
        var IAMDatabaseAuthenticationEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBInstanceAutomatedBackupMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceAutomatedBackups: DBInstanceAutomatedBackupList?
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
    interface DBInstanceRole {
        var RoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var FeatureName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
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
    interface DBProxy {
        var DBProxyName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBProxyArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "available" | "modifying" | "incompatible-network" | "insufficient-resource-limits" | "creating" | "deleting" | String */
        var EngineFamily: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpcSecurityGroupIds: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var VpcSubnetIds: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var Auth: UserAuthConfigInfoList?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Endpoint: String?
            get() = definedExternally
            set(value) = definedExternally
        var RequireTLS: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var IdleClientTimeout: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var DebugLogging: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBProxyTarget {
        var TargetArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Endpoint: String?
            get() = definedExternally
            set(value) = definedExternally
        var TrackedClusterId: String?
            get() = definedExternally
            set(value) = definedExternally
        var RdsResourceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Port: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "RDS_INSTANCE" | "RDS_SERVERLESS_ENDPOINT" | "TRACKED_CLUSTER" | String */
    }
    interface DBProxyTargetGroup {
        var DBProxyName: String?
            get() = definedExternally
            set(value) = definedExternally
        var TargetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var TargetGroupArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var IsDefault: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionPoolConfig: ConnectionPoolConfigurationInfo?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBSecurityGroup {
        var OwnerId: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBSecurityGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBSecurityGroupDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: String?
            get() = definedExternally
            set(value) = definedExternally
        var EC2SecurityGroups: EC2SecurityGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var IPRanges: IPRangeList?
            get() = definedExternally
            set(value) = definedExternally
        var DBSecurityGroupArn: String?
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
    interface DBSecurityGroupMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBSecurityGroups: DBSecurityGroups?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBSnapshot {
        var DBSnapshotIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceIdentifier: String?
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
        var AvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceCreateTime: TStamp?
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
        var Iops: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var OptionGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var PercentProgress: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var SourceRegion: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceDBSnapshotIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var StorageType: String?
            get() = definedExternally
            set(value) = definedExternally
        var TdeCredentialArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Encrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBSnapshotArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Timezone: String?
            get() = definedExternally
            set(value) = definedExternally
        var IAMDatabaseAuthenticationEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessorFeatures: ProcessorFeatureList?
            get() = definedExternally
            set(value) = definedExternally
        var DbiResourceId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBSnapshotAttribute {
        var AttributeName: String?
            get() = definedExternally
            set(value) = definedExternally
        var AttributeValues: AttributeValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBSnapshotAttributesResult {
        var DBSnapshotIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBSnapshotAttributes: DBSnapshotAttributeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DBSnapshotMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBSnapshots: DBSnapshotList?
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
    interface DeleteCustomAvailabilityZoneMessage {
        var CustomAvailabilityZoneId: String
    }
    interface DeleteCustomAvailabilityZoneResult {
        var CustomAvailabilityZone: CustomAvailabilityZone?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDBClusterEndpointMessage {
        var DBClusterEndpointIdentifier: String
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
    interface DeleteDBInstanceAutomatedBackupMessage {
        var DbiResourceId: String
    }
    interface DeleteDBInstanceAutomatedBackupResult {
        var DBInstanceAutomatedBackup: DBInstanceAutomatedBackup?
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
        var DeleteAutomatedBackups: BooleanOptional?
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
    interface DeleteDBProxyRequest {
        var DBProxyName: String
    }
    interface DeleteDBProxyResponse {
        var DBProxy: DBProxy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDBSecurityGroupMessage {
        var DBSecurityGroupName: String
    }
    interface DeleteDBSnapshotMessage {
        var DBSnapshotIdentifier: String
    }
    interface DeleteDBSnapshotResult {
        var DBSnapshot: DBSnapshot?
            get() = definedExternally
            set(value) = definedExternally
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
    interface DeleteGlobalClusterMessage {
        var GlobalClusterIdentifier: String
    }
    interface DeleteGlobalClusterResult {
        var GlobalCluster: GlobalCluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteInstallationMediaMessage {
        var InstallationMediaId: String
    }
    interface DeleteOptionGroupMessage {
        var OptionGroupName: String
    }
    interface DeregisterDBProxyTargetsRequest {
        var DBProxyName: String
        var TargetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceIdentifiers: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterIdentifiers: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeregisterDBProxyTargetsResponse
    interface DescribeAccountAttributesMessage
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
    interface DescribeCustomAvailabilityZonesMessage {
        var CustomAvailabilityZoneId: String?
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
    interface DescribeDBClusterBacktracksMessage {
        var DBClusterIdentifier: String
        var BacktrackIdentifier: String?
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
    interface DescribeDBClusterEndpointsMessage {
        var DBClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterEndpointIdentifier: String?
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
        var IncludeShared: Boolean?
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
        var IncludeAll: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDBInstanceAutomatedBackupsMessage {
        var DbiResourceId: String?
            get() = definedExternally
            set(value) = definedExternally
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
    interface DescribeDBLogFilesDetails {
        var LogFileName: String?
            get() = definedExternally
            set(value) = definedExternally
        var LastWritten: Long?
            get() = definedExternally
            set(value) = definedExternally
        var Size: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDBLogFilesMessage {
        var DBInstanceIdentifier: String
        var FilenameContains: String?
            get() = definedExternally
            set(value) = definedExternally
        var FileLastWritten: Long?
            get() = definedExternally
            set(value) = definedExternally
        var FileSize: Long?
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
    interface DescribeDBLogFilesResponse {
        var DescribeDBLogFiles: DescribeDBLogFilesList?
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
    interface DescribeDBProxiesRequest {
        var DBProxyName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: MaxRecords?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDBProxiesResponse {
        var DBProxies: DBProxyList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDBProxyTargetGroupsRequest {
        var DBProxyName: String
        var TargetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: MaxRecords?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDBProxyTargetGroupsResponse {
        var TargetGroups: TargetGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDBProxyTargetsRequest {
        var DBProxyName: String
        var TargetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: MaxRecords?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDBProxyTargetsResponse {
        var Targets: TargetList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDBSecurityGroupsMessage {
        var DBSecurityGroupName: String?
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
    interface DescribeDBSnapshotAttributesMessage {
        var DBSnapshotIdentifier: String
    }
    interface DescribeDBSnapshotAttributesResult {
        var DBSnapshotAttributesResult: DBSnapshotAttributesResult?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDBSnapshotsMessage {
        var DBInstanceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBSnapshotIdentifier: String?
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
        var DbiResourceId: String?
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
    interface DescribeExportTasksMessage {
        var ExportTaskIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: MaxRecords?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeGlobalClustersMessage {
        var GlobalClusterIdentifier: String?
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
    interface DescribeInstallationMediaMessage {
        var InstallationMediaId: String?
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
    interface DescribeOptionGroupOptionsMessage {
        var EngineName: String
        var MajorEngineVersion: String?
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
    interface DescribeOptionGroupsMessage {
        var OptionGroupName: String?
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
        var EngineName: String?
            get() = definedExternally
            set(value) = definedExternally
        var MajorEngineVersion: String?
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
    interface DescribeReservedDBInstancesMessage {
        var ReservedDBInstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReservedDBInstancesOfferingId: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceClass: String?
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
        var MultiAZ: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var LeaseId: String?
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
    interface DescribeReservedDBInstancesOfferingsMessage {
        var ReservedDBInstancesOfferingId: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceClass: String?
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
        var MultiAZ: BooleanOptional?
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
    interface DescribeSourceRegionsMessage {
        var RegionName: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
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
    interface DownloadDBLogFilePortionDetails {
        var LogFileData: String?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var AdditionalDataPending: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DownloadDBLogFilePortionMessage {
        var DBInstanceIdentifier: String
        var LogFileName: String
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfLines: Integer?
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
        var EC2SecurityGroupId: String?
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
    interface ExportTask {
        var ExportTaskIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ExportOnly: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var TaskStartTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var TaskEndTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var S3Bucket: String?
            get() = definedExternally
            set(value) = definedExternally
        var S3Prefix: String?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var PercentProgress: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var TotalExtractedDataInGB: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var FailureCause: String?
            get() = definedExternally
            set(value) = definedExternally
        var WarningMessage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExportTasksMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var ExportTasks: ExportTasksList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FailoverDBClusterMessage {
        var DBClusterIdentifier: String
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
    interface GlobalCluster {
        var GlobalClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalClusterResourceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalClusterArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: String?
            get() = definedExternally
            set(value) = definedExternally
        var StorageEncrypted: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalClusterMembers: GlobalClusterMemberList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GlobalClusterMember {
        var DBClusterArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Readers: ReadersArnList?
            get() = definedExternally
            set(value) = definedExternally
        var IsWriter: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GlobalClustersMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalClusters: GlobalClusterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IPRange {
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var CIDRIP: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportInstallationMediaMessage {
        var CustomAvailabilityZoneId: String
        var Engine: String
        var EngineVersion: String
        var EngineInstallationMediaPath: String
        var OSInstallationMediaPath: String
    }
    interface InstallationMedia {
        var InstallationMediaId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CustomAvailabilityZoneId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineInstallationMediaPath: String?
            get() = definedExternally
            set(value) = definedExternally
        var OSInstallationMediaPath: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var FailureCause: InstallationMediaFailureCause?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstallationMediaFailureCause {
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstallationMediaMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstallationMedia: InstallationMediaList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceMessage {
        var ResourceName: String
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MinimumEngineVersionPerAllowedValue {
        var AllowedValue: String?
            get() = definedExternally
            set(value) = definedExternally
        var MinimumEngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyCertificatesMessage {
        var CertificateIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var RemoveCustomerOverride: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyCertificatesResult {
        var Certificate: Certificate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyCurrentDBClusterCapacityMessage {
        var DBClusterIdentifier: String
        var Capacity: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SecondsBeforeTimeout: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var TimeoutAction: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyDBClusterEndpointMessage {
        var DBClusterEndpointIdentifier: String
        var EndpointType: String?
            get() = definedExternally
            set(value) = definedExternally
        var StaticMembers: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var ExcludedMembers: StringList?
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
        var BacktrackWindow: LongOptional?
            get() = definedExternally
            set(value) = definedExternally
        var CloudwatchLogsExportConfiguration: CloudwatchLogsExportConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var AllowMajorVersionUpgrade: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Domain: String?
            get() = definedExternally
            set(value) = definedExternally
        var DomainIAMRoleName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ScalingConfiguration: ScalingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EnableHttpEndpoint: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var CopyTagsToSnapshot: BooleanOptional?
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
        var PerformanceInsightsRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var CloudwatchLogsExportConfiguration: CloudwatchLogsExportConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessorFeatures: ProcessorFeatureList?
            get() = definedExternally
            set(value) = definedExternally
        var UseDefaultProcessorFeatures: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MaxAllocatedStorage: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateRotationRestart: BooleanOptional?
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
    interface ModifyDBProxyRequest {
        var DBProxyName: String
        var NewDBProxyName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Auth: UserAuthConfigList?
            get() = definedExternally
            set(value) = definedExternally
        var RequireTLS: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var IdleClientTimeout: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DebugLogging: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroups: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyDBProxyResponse {
        var DBProxy: DBProxy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyDBProxyTargetGroupRequest {
        var TargetGroupName: String
        var DBProxyName: String
        var ConnectionPoolConfig: ConnectionPoolConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var NewName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyDBProxyTargetGroupResponse {
        var DBProxyTargetGroup: DBProxyTargetGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyDBSnapshotAttributeMessage {
        var DBSnapshotIdentifier: String
        var AttributeName: String
        var ValuesToAdd: AttributeValueList?
            get() = definedExternally
            set(value) = definedExternally
        var ValuesToRemove: AttributeValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyDBSnapshotAttributeResult {
        var DBSnapshotAttributesResult: DBSnapshotAttributesResult?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyDBSnapshotMessage {
        var DBSnapshotIdentifier: String
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var OptionGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyDBSnapshotResult {
        var DBSnapshot: DBSnapshot?
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
    interface ModifyGlobalClusterMessage {
        var GlobalClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var NewGlobalClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyGlobalClusterResult {
        var GlobalCluster: GlobalCluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyOptionGroupMessage {
        var OptionGroupName: String
        var OptionsToInclude: OptionConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
        var OptionsToRemove: OptionNamesList?
            get() = definedExternally
            set(value) = definedExternally
        var ApplyImmediately: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyOptionGroupResult {
        var OptionGroup: OptionGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Option {
        var OptionName: String?
            get() = definedExternally
            set(value) = definedExternally
        var OptionDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var Persistent: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Permanent: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var OptionVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var OptionSettings: OptionSettingConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
        var DBSecurityGroupMemberships: DBSecurityGroupMembershipList?
            get() = definedExternally
            set(value) = definedExternally
        var VpcSecurityGroupMemberships: VpcSecurityGroupMembershipList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OptionConfiguration {
        var OptionName: String
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var OptionVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBSecurityGroupMemberships: DBSecurityGroupNameList?
            get() = definedExternally
            set(value) = definedExternally
        var VpcSecurityGroupMemberships: VpcSecurityGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var OptionSettings: OptionSettingsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OptionGroup {
        var OptionGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var OptionGroupDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineName: String?
            get() = definedExternally
            set(value) = definedExternally
        var MajorEngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var Options: OptionsList?
            get() = definedExternally
            set(value) = definedExternally
        var AllowsVpcAndNonVpcInstanceMemberships: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: String?
            get() = definedExternally
            set(value) = definedExternally
        var OptionGroupArn: String?
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
    interface OptionGroupOption {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineName: String?
            get() = definedExternally
            set(value) = definedExternally
        var MajorEngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var MinimumRequiredMinorEngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var PortRequired: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultPort: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var OptionsDependedOn: OptionsDependedOn?
            get() = definedExternally
            set(value) = definedExternally
        var OptionsConflictsWith: OptionsConflictsWith?
            get() = definedExternally
            set(value) = definedExternally
        var Persistent: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Permanent: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RequiresAutoMinorEngineVersionUpgrade: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var VpcOnly: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SupportsOptionVersionDowngrade: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var OptionGroupOptionSettings: OptionGroupOptionSettingsList?
            get() = definedExternally
            set(value) = definedExternally
        var OptionGroupOptionVersions: OptionGroupOptionVersionsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OptionGroupOptionSetting {
        var SettingName: String?
            get() = definedExternally
            set(value) = definedExternally
        var SettingDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultValue: String?
            get() = definedExternally
            set(value) = definedExternally
        var ApplyType: String?
            get() = definedExternally
            set(value) = definedExternally
        var AllowedValues: String?
            get() = definedExternally
            set(value) = definedExternally
        var IsModifiable: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var IsRequired: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var MinimumEngineVersionPerAllowedValue: MinimumEngineVersionPerAllowedValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OptionGroupOptionsMessage {
        var OptionGroupOptions: OptionGroupOptionsList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OptionGroups {
        var OptionGroupsList: OptionGroupsList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OptionSetting {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Value: String?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultValue: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
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
        var IsCollection: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OptionVersion {
        var Version: String?
            get() = definedExternally
            set(value) = definedExternally
        var IsDefault: Boolean?
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
        var AvailableProcessorFeatures: AvailableProcessorFeatureList?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedEngineModes: EngineModeList?
            get() = definedExternally
            set(value) = definedExternally
        var SupportsStorageAutoscaling: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SupportsKerberosAuthentication: BooleanOptional?
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
        var SupportedEngineModes: EngineModeList?
            get() = definedExternally
            set(value) = definedExternally
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
        var ProcessorFeatures: ProcessorFeatureList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProcessorFeature {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Value: String?
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
    interface PromoteReadReplicaMessage {
        var DBInstanceIdentifier: String
        var BackupRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredBackupWindow: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PromoteReadReplicaResult {
        var DBInstance: DBInstance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PurchaseReservedDBInstancesOfferingMessage {
        var ReservedDBInstancesOfferingId: String
        var ReservedDBInstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceCount: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PurchaseReservedDBInstancesOfferingResult {
        var ReservedDBInstance: ReservedDBInstance?
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
    interface RecurringCharge {
        var RecurringChargeAmount: Double?
            get() = definedExternally
            set(value) = definedExternally
        var RecurringChargeFrequency: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterDBProxyTargetsRequest {
        var DBProxyName: String
        var TargetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceIdentifiers: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterIdentifiers: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterDBProxyTargetsResponse {
        var DBProxyTargets: TargetList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveFromGlobalClusterMessage {
        var GlobalClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var DbClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveFromGlobalClusterResult {
        var GlobalCluster: GlobalCluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveRoleFromDBClusterMessage {
        var DBClusterIdentifier: String
        var RoleArn: String
        var FeatureName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveRoleFromDBInstanceMessage {
        var DBInstanceIdentifier: String
        var RoleArn: String
        var FeatureName: String
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
    interface ReservedDBInstance {
        var ReservedDBInstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReservedDBInstancesOfferingId: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceClass: String?
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
        var CurrencyCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ProductDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingType: String?
            get() = definedExternally
            set(value) = definedExternally
        var MultiAZ: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var State: String?
            get() = definedExternally
            set(value) = definedExternally
        var RecurringCharges: RecurringChargeList?
            get() = definedExternally
            set(value) = definedExternally
        var ReservedDBInstanceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var LeaseId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReservedDBInstanceMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReservedDBInstances: ReservedDBInstanceList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReservedDBInstancesOffering {
        var ReservedDBInstancesOfferingId: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceClass: String?
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
        var CurrencyCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var ProductDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingType: String?
            get() = definedExternally
            set(value) = definedExternally
        var MultiAZ: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RecurringCharges: RecurringChargeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReservedDBInstancesOfferingMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReservedDBInstancesOfferings: ReservedDBInstancesOfferingList?
            get() = definedExternally
            set(value) = definedExternally
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
    interface RestoreDBClusterFromS3Message {
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
        var MasterUsername: String
        var MasterUserPassword: String
        var OptionGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
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
        var EnableIAMDatabaseAuthentication: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SourceEngine: String
        var SourceEngineVersion: String
        var S3BucketName: String
        var S3Prefix: String?
            get() = definedExternally
            set(value) = definedExternally
        var S3IngestionRoleArn: String
        var BacktrackWindow: LongOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EnableCloudwatchLogsExports: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var CopyTagsToSnapshot: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Domain: String?
            get() = definedExternally
            set(value) = definedExternally
        var DomainIAMRoleName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreDBClusterFromS3Result {
        var DBCluster: DBCluster?
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
        var BacktrackWindow: LongOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EnableCloudwatchLogsExports: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var EngineMode: String?
            get() = definedExternally
            set(value) = definedExternally
        var ScalingConfiguration: ScalingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var CopyTagsToSnapshot: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Domain: String?
            get() = definedExternally
            set(value) = definedExternally
        var DomainIAMRoleName: String?
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
        var BacktrackWindow: LongOptional?
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
        var CopyTagsToSnapshot: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Domain: String?
            get() = definedExternally
            set(value) = definedExternally
        var DomainIAMRoleName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreDBClusterToPointInTimeResult {
        var DBCluster: DBCluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreDBInstanceFromDBSnapshotMessage {
        var DBInstanceIdentifier: String
        var DBSnapshotIdentifier: String
        var DBInstanceClass: String?
            get() = definedExternally
            set(value) = definedExternally
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBSubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var MultiAZ: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var PubliclyAccessible: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMinorVersionUpgrade: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseModel: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var Iops: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var OptionGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
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
        var VpcSecurityGroupIds: VpcSecurityGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var Domain: String?
            get() = definedExternally
            set(value) = definedExternally
        var CopyTagsToSnapshot: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DomainIAMRoleName: String?
            get() = definedExternally
            set(value) = definedExternally
        var EnableIAMDatabaseAuthentication: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EnableCloudwatchLogsExports: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessorFeatures: ProcessorFeatureList?
            get() = definedExternally
            set(value) = definedExternally
        var UseDefaultProcessorFeatures: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DBParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreDBInstanceFromDBSnapshotResult {
        var DBInstance: DBInstance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreDBInstanceFromS3Message {
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
        var PubliclyAccessible: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var StorageType: String?
            get() = definedExternally
            set(value) = definedExternally
        var StorageEncrypted: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
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
        var EnableIAMDatabaseAuthentication: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SourceEngine: String
        var SourceEngineVersion: String
        var S3BucketName: String
        var S3Prefix: String?
            get() = definedExternally
            set(value) = definedExternally
        var S3IngestionRoleArn: String
        var EnablePerformanceInsights: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var PerformanceInsightsKMSKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var PerformanceInsightsRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EnableCloudwatchLogsExports: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessorFeatures: ProcessorFeatureList?
            get() = definedExternally
            set(value) = definedExternally
        var UseDefaultProcessorFeatures: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreDBInstanceFromS3Result {
        var DBInstance: DBInstance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreDBInstanceToPointInTimeMessage {
        var SourceDBInstanceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var TargetDBInstanceIdentifier: String
        var RestoreTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var UseLatestRestorableTime: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceClass: String?
            get() = definedExternally
            set(value) = definedExternally
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBSubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var MultiAZ: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var PubliclyAccessible: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMinorVersionUpgrade: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseModel: String?
            get() = definedExternally
            set(value) = definedExternally
        var DBName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var Iops: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var OptionGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var CopyTagsToSnapshot: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
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
        var VpcSecurityGroupIds: VpcSecurityGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var Domain: String?
            get() = definedExternally
            set(value) = definedExternally
        var DomainIAMRoleName: String?
            get() = definedExternally
            set(value) = definedExternally
        var EnableIAMDatabaseAuthentication: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EnableCloudwatchLogsExports: LogTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessorFeatures: ProcessorFeatureList?
            get() = definedExternally
            set(value) = definedExternally
        var UseDefaultProcessorFeatures: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DBParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SourceDbiResourceId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreDBInstanceToPointInTimeResult {
        var DBInstance: DBInstance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreWindow {
        var EarliestTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var LatestTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RevokeDBSecurityGroupIngressMessage {
        var DBSecurityGroupName: String
        var CIDRIP: String?
            get() = definedExternally
            set(value) = definedExternally
        var EC2SecurityGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var EC2SecurityGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var EC2SecurityGroupOwnerId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RevokeDBSecurityGroupIngressResult {
        var DBSecurityGroup: DBSecurityGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScalingConfiguration {
        var MinCapacity: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MaxCapacity: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var AutoPause: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SecondsUntilAutoPause: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var TimeoutAction: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScalingConfigurationInfo {
        var MinCapacity: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MaxCapacity: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var AutoPause: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SecondsUntilAutoPause: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var TimeoutAction: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SourceRegion {
        var RegionName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Endpoint: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SourceRegionMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceRegions: SourceRegionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartActivityStreamRequest {
        var ResourceArn: String
        var Mode: String /* "sync" | "async" | String */
        var KmsKeyId: String
        var ApplyImmediately: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartActivityStreamResponse {
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var KinesisStreamName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "stopped" | "starting" | "started" | "stopping" | String */
        var Mode: String /* "sync" | "async" | String */
        var ApplyImmediately: Boolean?
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
    interface StartDBInstanceMessage {
        var DBInstanceIdentifier: String
    }
    interface StartDBInstanceResult {
        var DBInstance: DBInstance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartExportTaskMessage {
        var ExportTaskIdentifier: String
        var SourceArn: String
        var S3BucketName: String
        var IamRoleArn: String
        var KmsKeyId: String
        var S3Prefix: String?
            get() = definedExternally
            set(value) = definedExternally
        var ExportOnly: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopActivityStreamRequest {
        var ResourceArn: String
        var ApplyImmediately: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopActivityStreamResponse {
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var KinesisStreamName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "stopped" | "starting" | "started" | "stopping" | String */
    }
    interface StopDBClusterMessage {
        var DBClusterIdentifier: String
    }
    interface StopDBClusterResult {
        var DBCluster: DBCluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopDBInstanceMessage {
        var DBInstanceIdentifier: String
        var DBSnapshotIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopDBInstanceResult {
        var DBInstance: DBInstance?
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
    interface UserAuthConfig {
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var UserName: String?
            get() = definedExternally
            set(value) = definedExternally
        var AuthScheme: String /* "SECRETS" | String */
        var SecretArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var IAMAuth: String /* "DISABLED" | "REQUIRED" | String */
    }
    interface UserAuthConfigInfo {
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var UserName: String?
            get() = definedExternally
            set(value) = definedExternally
        var AuthScheme: String /* "SECRETS" | String */
        var SecretArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var IAMAuth: String /* "DISABLED" | "REQUIRED" | String */
    }
    interface ValidDBInstanceModificationsMessage {
        var Storage: ValidStorageOptionsList?
            get() = definedExternally
            set(value) = definedExternally
        var ValidProcessorFeatures: AvailableProcessorFeatureList?
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
        var SupportsStorageAutoscaling: Boolean?
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
    interface VpnDetails {
        var VpnId: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpnTunnelOriginatorIP: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpnGatewayIp: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpnPSK: StringSensitive?
            get() = definedExternally
            set(value) = definedExternally
        var VpnName: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpnState: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2013-01-10" | "2013-02-12" | "2013-09-09" | "2014-09-01" | "2014-10-31" | "latest" | String */
    }
}