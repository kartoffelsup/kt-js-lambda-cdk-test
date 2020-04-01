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
import Redshift.AccountWithRestoreAccess
import Redshift.ClusterAssociatedToSchedule
import Redshift.AccountAttribute
import Redshift.AttributeValueTarget
import Redshift.AvailabilityZone
import Redshift.SnapshotErrorMessage
import Redshift.ClusterDbRevision
import Redshift.ClusterIamRole
import Redshift.Cluster
import Redshift.ClusterNode
import Redshift.ClusterParameterGroupStatus
import Redshift.ClusterParameterStatus
import Redshift.ClusterSecurityGroupMembership
import Redshift.ClusterSecurityGroup
import Redshift.ClusterSubnetGroup
import Redshift.ClusterVersion
import Redshift.DeferredMaintenanceWindow
import Redshift.DeleteClusterSnapshotMessage
import Redshift.EC2SecurityGroup
import Redshift.UpdateTarget
import Redshift.EventCategoriesMap
import Redshift.EventInfoMap
import Redshift.Event
import Redshift.EventSubscription
import Redshift.HsmClientCertificate
import Redshift.HsmConfiguration
import Redshift.IPRange
import Redshift.NodeConfigurationOption
import Redshift.NodeConfigurationOptionsFilter
import Redshift.OrderableClusterOption
import Redshift.ClusterParameterGroup
import Redshift.Parameter
import Redshift.RecurringCharge
import Redshift.ReservedNode
import Redshift.ReservedNodeOffering
import Redshift.RevisionTarget
import Redshift.ScheduledActionFilter
import Redshift.ScheduledAction
import Redshift.SnapshotCopyGrant
import Redshift.Snapshot
import Redshift.SnapshotSchedule
import Redshift.SnapshotSortingEntity
import Redshift.Subnet
import Redshift.SupportedOperation
import Redshift.SupportedPlatform
import Redshift.TableRestoreStatus
import Redshift.Tag
import Redshift.TaggedResource
import Redshift.MaintenanceTrack
import Redshift.VpcSecurityGroupMembership
import Redshift.AcceptReservedNodeExchangeInputMessage
import Redshift.AcceptReservedNodeExchangeOutputMessage
import Redshift.AuthorizeClusterSecurityGroupIngressMessage
import Redshift.AuthorizeClusterSecurityGroupIngressResult
import Redshift.AuthorizeSnapshotAccessMessage
import Redshift.AuthorizeSnapshotAccessResult
import Redshift.BatchDeleteClusterSnapshotsRequest
import Redshift.BatchDeleteClusterSnapshotsResult
import Redshift.BatchModifyClusterSnapshotsMessage
import Redshift.BatchModifyClusterSnapshotsOutputMessage
import Redshift.CancelResizeMessage
import Redshift.ResizeProgressMessage
import Redshift.CopyClusterSnapshotMessage
import Redshift.CopyClusterSnapshotResult
import Redshift.CreateClusterMessage
import Redshift.CreateClusterResult
import Redshift.CreateClusterParameterGroupMessage
import Redshift.CreateClusterParameterGroupResult
import Redshift.CreateClusterSecurityGroupMessage
import Redshift.CreateClusterSecurityGroupResult
import Redshift.CreateClusterSnapshotMessage
import Redshift.CreateClusterSnapshotResult
import Redshift.CreateClusterSubnetGroupMessage
import Redshift.CreateClusterSubnetGroupResult
import Redshift.CreateEventSubscriptionMessage
import Redshift.CreateEventSubscriptionResult
import Redshift.CreateHsmClientCertificateMessage
import Redshift.CreateHsmClientCertificateResult
import Redshift.CreateHsmConfigurationMessage
import Redshift.CreateHsmConfigurationResult
import Redshift.CreateScheduledActionMessage
import Redshift.CreateSnapshotCopyGrantMessage
import Redshift.CreateSnapshotCopyGrantResult
import Redshift.CreateSnapshotScheduleMessage
import Redshift.CreateTagsMessage
import Redshift.DeleteClusterMessage
import Redshift.DeleteClusterResult
import Redshift.DeleteClusterParameterGroupMessage
import Redshift.DeleteClusterSecurityGroupMessage
import Redshift.DeleteClusterSnapshotResult
import Redshift.DeleteClusterSubnetGroupMessage
import Redshift.DeleteEventSubscriptionMessage
import Redshift.DeleteHsmClientCertificateMessage
import Redshift.DeleteHsmConfigurationMessage
import Redshift.DeleteScheduledActionMessage
import Redshift.DeleteSnapshotCopyGrantMessage
import Redshift.DeleteSnapshotScheduleMessage
import Redshift.DeleteTagsMessage
import Redshift.DescribeAccountAttributesMessage
import Redshift.AccountAttributeList
import Redshift.DescribeClusterDbRevisionsMessage
import Redshift.ClusterDbRevisionsMessage
import Redshift.DescribeClusterParameterGroupsMessage
import Redshift.ClusterParameterGroupsMessage
import Redshift.DescribeClusterParametersMessage
import Redshift.ClusterParameterGroupDetails
import Redshift.DescribeClusterSecurityGroupsMessage
import Redshift.ClusterSecurityGroupMessage
import Redshift.DescribeClusterSnapshotsMessage
import Redshift.SnapshotMessage
import Redshift.DescribeClusterSubnetGroupsMessage
import Redshift.ClusterSubnetGroupMessage
import Redshift.DescribeClusterTracksMessage
import Redshift.TrackListMessage
import Redshift.DescribeClusterVersionsMessage
import Redshift.ClusterVersionsMessage
import Redshift.DescribeClustersMessage
import Redshift.ClustersMessage
import Redshift.DescribeDefaultClusterParametersMessage
import Redshift.DescribeDefaultClusterParametersResult
import Redshift.DescribeEventCategoriesMessage
import Redshift.EventCategoriesMessage
import Redshift.DescribeEventSubscriptionsMessage
import Redshift.EventSubscriptionsMessage
import Redshift.DescribeEventsMessage
import Redshift.EventsMessage
import Redshift.DescribeHsmClientCertificatesMessage
import Redshift.HsmClientCertificateMessage
import Redshift.DescribeHsmConfigurationsMessage
import Redshift.HsmConfigurationMessage
import Redshift.DescribeLoggingStatusMessage
import Redshift.LoggingStatus
import Redshift.DescribeNodeConfigurationOptionsMessage
import Redshift.NodeConfigurationOptionsMessage
import Redshift.DescribeOrderableClusterOptionsMessage
import Redshift.OrderableClusterOptionsMessage
import Redshift.DescribeReservedNodeOfferingsMessage
import Redshift.ReservedNodeOfferingsMessage
import Redshift.DescribeReservedNodesMessage
import Redshift.ReservedNodesMessage
import Redshift.DescribeResizeMessage
import Redshift.DescribeScheduledActionsMessage
import Redshift.ScheduledActionsMessage
import Redshift.DescribeSnapshotCopyGrantsMessage
import Redshift.SnapshotCopyGrantMessage
import Redshift.DescribeSnapshotSchedulesMessage
import Redshift.DescribeSnapshotSchedulesOutputMessage
import Redshift.CustomerStorageMessage
import Redshift.DescribeTableRestoreStatusMessage
import Redshift.TableRestoreStatusMessage
import Redshift.DescribeTagsMessage
import Redshift.TaggedResourceListMessage
import Redshift.DisableLoggingMessage
import Redshift.DisableSnapshotCopyMessage
import Redshift.DisableSnapshotCopyResult
import Redshift.EnableLoggingMessage
import Redshift.EnableSnapshotCopyMessage
import Redshift.EnableSnapshotCopyResult
import Redshift.GetClusterCredentialsMessage
import Redshift.ClusterCredentials
import Redshift.GetReservedNodeExchangeOfferingsInputMessage
import Redshift.GetReservedNodeExchangeOfferingsOutputMessage
import Redshift.ModifyClusterMessage
import Redshift.ModifyClusterResult
import Redshift.ModifyClusterDbRevisionMessage
import Redshift.ModifyClusterDbRevisionResult
import Redshift.ModifyClusterIamRolesMessage
import Redshift.ModifyClusterIamRolesResult
import Redshift.ModifyClusterMaintenanceMessage
import Redshift.ModifyClusterMaintenanceResult
import Redshift.ModifyClusterParameterGroupMessage
import Redshift.ClusterParameterGroupNameMessage
import Redshift.ModifyClusterSnapshotMessage
import Redshift.ModifyClusterSnapshotResult
import Redshift.ModifyClusterSnapshotScheduleMessage
import Redshift.ModifyClusterSubnetGroupMessage
import Redshift.ModifyClusterSubnetGroupResult
import Redshift.ModifyEventSubscriptionMessage
import Redshift.ModifyEventSubscriptionResult
import Redshift.ModifyScheduledActionMessage
import Redshift.ModifySnapshotCopyRetentionPeriodMessage
import Redshift.ModifySnapshotCopyRetentionPeriodResult
import Redshift.ModifySnapshotScheduleMessage
import Redshift.PauseClusterMessage
import Redshift.PauseClusterResult
import Redshift.PurchaseReservedNodeOfferingMessage
import Redshift.PurchaseReservedNodeOfferingResult
import Redshift.RebootClusterMessage
import Redshift.RebootClusterResult
import Redshift.ResetClusterParameterGroupMessage
import Redshift.ResizeClusterMessage
import Redshift.ResizeClusterResult
import Redshift.RestoreFromClusterSnapshotMessage
import Redshift.RestoreFromClusterSnapshotResult
import Redshift.RestoreTableFromClusterSnapshotMessage
import Redshift.RestoreTableFromClusterSnapshotResult
import Redshift.ResumeClusterMessage
import Redshift.ResumeClusterResult
import Redshift.RevokeClusterSecurityGroupIngressMessage
import Redshift.RevokeClusterSecurityGroupIngressResult
import Redshift.RevokeSnapshotAccessMessage
import Redshift.RevokeSnapshotAccessResult
import Redshift.RotateEncryptionKeyMessage
import Redshift.RotateEncryptionKeyResult
import Redshift.Endpoint
import Redshift.PendingModifiedValues
import Redshift.RestoreStatus
import Redshift.DataTransferProgress
import Redshift.HsmStatus
import Redshift.ClusterSnapshotCopyStatus
import Redshift.ElasticIpStatus
import Redshift.ResizeInfo
import Redshift.ScheduledActionType
import Redshift.DefaultClusterParameters

typealias AccountsWithRestoreAccessList = Array<AccountWithRestoreAccess>

typealias AssociatedClusterList = Array<ClusterAssociatedToSchedule>

typealias AttributeList = Array<AccountAttribute>

typealias AttributeNameList = Array<String>

typealias AttributeValueList = Array<AttributeValueTarget>

typealias AvailabilityZoneList = Array<AvailabilityZone>

typealias BatchSnapshotOperationErrorList = Array<SnapshotErrorMessage>

typealias BatchSnapshotOperationErrors = Array<SnapshotErrorMessage>

typealias Boolean = Boolean

typealias BooleanOptional = Boolean

typealias ClusterDbRevisionsList = Array<ClusterDbRevision>

typealias ClusterIamRoleList = Array<ClusterIamRole>

typealias ClusterList = Array<Cluster>

typealias ClusterNodesList = Array<ClusterNode>

typealias ClusterParameterGroupStatusList = Array<ClusterParameterGroupStatus>

typealias ClusterParameterStatusList = Array<ClusterParameterStatus>

typealias ClusterSecurityGroupMembershipList = Array<ClusterSecurityGroupMembership>

typealias ClusterSecurityGroupNameList = Array<String>

typealias ClusterSecurityGroups = Array<ClusterSecurityGroup>

typealias ClusterSubnetGroups = Array<ClusterSubnetGroup>

typealias ClusterVersionList = Array<ClusterVersion>

typealias DbGroupList = Array<String>

typealias DeferredMaintenanceWindowsList = Array<DeferredMaintenanceWindow>

typealias DeleteClusterSnapshotMessageList = Array<DeleteClusterSnapshotMessage>

typealias Double = Number

typealias DoubleOptional = Number

typealias EC2SecurityGroupList = Array<EC2SecurityGroup>

typealias EligibleTracksToUpdateList = Array<UpdateTarget>

typealias EventCategoriesList = Array<String>

typealias EventCategoriesMapList = Array<EventCategoriesMap>

typealias EventInfoMapList = Array<EventInfoMap>

typealias EventList = Array<Event>

typealias EventSubscriptionsList = Array<EventSubscription>

typealias HsmClientCertificateList = Array<HsmClientCertificate>

typealias HsmConfigurationList = Array<HsmConfiguration>

typealias IPRangeList = Array<IPRange>

typealias IamRoleArnList = Array<String>

typealias ImportTablesCompleted = Array<String>

typealias ImportTablesInProgress = Array<String>

typealias ImportTablesNotStarted = Array<String>

typealias Integer = Number

typealias IntegerOptional = Number

typealias Long = Number

typealias LongOptional = Number

typealias NodeConfigurationOptionList = Array<NodeConfigurationOption>

typealias NodeConfigurationOptionsFilterList = Array<NodeConfigurationOptionsFilter>

typealias OrderableClusterOptionsList = Array<OrderableClusterOption>

typealias ParameterGroupList = Array<ClusterParameterGroup>

typealias ParametersList = Array<Parameter>

typealias PendingActionsList = Array<String>

typealias RecurringChargeList = Array<RecurringCharge>

typealias ReservedNodeList = Array<ReservedNode>

typealias ReservedNodeOfferingList = Array<ReservedNodeOffering>

typealias RestorableNodeTypeList = Array<String>

typealias RevisionTargetsList = Array<RevisionTarget>

typealias ScheduleDefinitionList = Array<String>

typealias ScheduledActionFilterList = Array<ScheduledActionFilter>

typealias ScheduledActionList = Array<ScheduledAction>

typealias ScheduledActionTimeList = Array<TStamp>

typealias ScheduledSnapshotTimeList = Array<TStamp>

typealias SensitiveString = String

typealias SnapshotCopyGrantList = Array<SnapshotCopyGrant>

typealias SnapshotIdentifierList = Array<String>

typealias SnapshotList = Array<Snapshot>

typealias SnapshotScheduleList = Array<SnapshotSchedule>

typealias SnapshotSortingEntityList = Array<SnapshotSortingEntity>

typealias SourceIdsList = Array<String>

typealias String = String

typealias SubnetIdentifierList = Array<String>

typealias SubnetList = Array<Subnet>

typealias SupportedOperationList = Array<SupportedOperation>

typealias SupportedPlatformsList = Array<SupportedPlatform>

typealias TStamp = Date

typealias TableRestoreStatusList = Array<TableRestoreStatus>

typealias TagKeyList = Array<String>

typealias TagList = Array<Tag>

typealias TagValueList = Array<String>

typealias TaggedResourceList = Array<TaggedResource>

typealias TrackList = Array<MaintenanceTrack>

typealias ValueStringList = Array<String>

typealias VpcSecurityGroupIdList = Array<String>

typealias VpcSecurityGroupMembershipList = Array<VpcSecurityGroupMembership>

@JsModule("aws-sdk")
external open class Redshift(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Redshift.Types.ClientConfiguration */
    open fun acceptReservedNodeExchange(params: AcceptReservedNodeExchangeInputMessage, callback: (err: AWSError, data: AcceptReservedNodeExchangeOutputMessage) -> Unit = definedExternally): Request<AcceptReservedNodeExchangeOutputMessage, AWSError>
    open fun acceptReservedNodeExchange(callback: (err: AWSError, data: AcceptReservedNodeExchangeOutputMessage) -> Unit = definedExternally): Request<AcceptReservedNodeExchangeOutputMessage, AWSError>
    open fun authorizeClusterSecurityGroupIngress(params: AuthorizeClusterSecurityGroupIngressMessage, callback: (err: AWSError, data: AuthorizeClusterSecurityGroupIngressResult) -> Unit = definedExternally): Request<AuthorizeClusterSecurityGroupIngressResult, AWSError>
    open fun authorizeClusterSecurityGroupIngress(callback: (err: AWSError, data: AuthorizeClusterSecurityGroupIngressResult) -> Unit = definedExternally): Request<AuthorizeClusterSecurityGroupIngressResult, AWSError>
    open fun authorizeSnapshotAccess(params: AuthorizeSnapshotAccessMessage, callback: (err: AWSError, data: AuthorizeSnapshotAccessResult) -> Unit = definedExternally): Request<AuthorizeSnapshotAccessResult, AWSError>
    open fun authorizeSnapshotAccess(callback: (err: AWSError, data: AuthorizeSnapshotAccessResult) -> Unit = definedExternally): Request<AuthorizeSnapshotAccessResult, AWSError>
    open fun batchDeleteClusterSnapshots(params: BatchDeleteClusterSnapshotsRequest, callback: (err: AWSError, data: BatchDeleteClusterSnapshotsResult) -> Unit = definedExternally): Request<BatchDeleteClusterSnapshotsResult, AWSError>
    open fun batchDeleteClusterSnapshots(callback: (err: AWSError, data: BatchDeleteClusterSnapshotsResult) -> Unit = definedExternally): Request<BatchDeleteClusterSnapshotsResult, AWSError>
    open fun batchModifyClusterSnapshots(params: BatchModifyClusterSnapshotsMessage, callback: (err: AWSError, data: BatchModifyClusterSnapshotsOutputMessage) -> Unit = definedExternally): Request<BatchModifyClusterSnapshotsOutputMessage, AWSError>
    open fun batchModifyClusterSnapshots(callback: (err: AWSError, data: BatchModifyClusterSnapshotsOutputMessage) -> Unit = definedExternally): Request<BatchModifyClusterSnapshotsOutputMessage, AWSError>
    open fun cancelResize(params: CancelResizeMessage, callback: (err: AWSError, data: ResizeProgressMessage) -> Unit = definedExternally): Request<ResizeProgressMessage, AWSError>
    open fun cancelResize(callback: (err: AWSError, data: ResizeProgressMessage) -> Unit = definedExternally): Request<ResizeProgressMessage, AWSError>
    open fun copyClusterSnapshot(params: CopyClusterSnapshotMessage, callback: (err: AWSError, data: CopyClusterSnapshotResult) -> Unit = definedExternally): Request<CopyClusterSnapshotResult, AWSError>
    open fun copyClusterSnapshot(callback: (err: AWSError, data: CopyClusterSnapshotResult) -> Unit = definedExternally): Request<CopyClusterSnapshotResult, AWSError>
    open fun createCluster(params: CreateClusterMessage, callback: (err: AWSError, data: CreateClusterResult) -> Unit = definedExternally): Request<CreateClusterResult, AWSError>
    open fun createCluster(callback: (err: AWSError, data: CreateClusterResult) -> Unit = definedExternally): Request<CreateClusterResult, AWSError>
    open fun createClusterParameterGroup(params: CreateClusterParameterGroupMessage, callback: (err: AWSError, data: CreateClusterParameterGroupResult) -> Unit = definedExternally): Request<CreateClusterParameterGroupResult, AWSError>
    open fun createClusterParameterGroup(callback: (err: AWSError, data: CreateClusterParameterGroupResult) -> Unit = definedExternally): Request<CreateClusterParameterGroupResult, AWSError>
    open fun createClusterSecurityGroup(params: CreateClusterSecurityGroupMessage, callback: (err: AWSError, data: CreateClusterSecurityGroupResult) -> Unit = definedExternally): Request<CreateClusterSecurityGroupResult, AWSError>
    open fun createClusterSecurityGroup(callback: (err: AWSError, data: CreateClusterSecurityGroupResult) -> Unit = definedExternally): Request<CreateClusterSecurityGroupResult, AWSError>
    open fun createClusterSnapshot(params: CreateClusterSnapshotMessage, callback: (err: AWSError, data: CreateClusterSnapshotResult) -> Unit = definedExternally): Request<CreateClusterSnapshotResult, AWSError>
    open fun createClusterSnapshot(callback: (err: AWSError, data: CreateClusterSnapshotResult) -> Unit = definedExternally): Request<CreateClusterSnapshotResult, AWSError>
    open fun createClusterSubnetGroup(params: CreateClusterSubnetGroupMessage, callback: (err: AWSError, data: CreateClusterSubnetGroupResult) -> Unit = definedExternally): Request<CreateClusterSubnetGroupResult, AWSError>
    open fun createClusterSubnetGroup(callback: (err: AWSError, data: CreateClusterSubnetGroupResult) -> Unit = definedExternally): Request<CreateClusterSubnetGroupResult, AWSError>
    open fun createEventSubscription(params: CreateEventSubscriptionMessage, callback: (err: AWSError, data: CreateEventSubscriptionResult) -> Unit = definedExternally): Request<CreateEventSubscriptionResult, AWSError>
    open fun createEventSubscription(callback: (err: AWSError, data: CreateEventSubscriptionResult) -> Unit = definedExternally): Request<CreateEventSubscriptionResult, AWSError>
    open fun createHsmClientCertificate(params: CreateHsmClientCertificateMessage, callback: (err: AWSError, data: CreateHsmClientCertificateResult) -> Unit = definedExternally): Request<CreateHsmClientCertificateResult, AWSError>
    open fun createHsmClientCertificate(callback: (err: AWSError, data: CreateHsmClientCertificateResult) -> Unit = definedExternally): Request<CreateHsmClientCertificateResult, AWSError>
    open fun createHsmConfiguration(params: CreateHsmConfigurationMessage, callback: (err: AWSError, data: CreateHsmConfigurationResult) -> Unit = definedExternally): Request<CreateHsmConfigurationResult, AWSError>
    open fun createHsmConfiguration(callback: (err: AWSError, data: CreateHsmConfigurationResult) -> Unit = definedExternally): Request<CreateHsmConfigurationResult, AWSError>
    open fun createScheduledAction(params: CreateScheduledActionMessage, callback: (err: AWSError, data: ScheduledAction) -> Unit = definedExternally): Request<ScheduledAction, AWSError>
    open fun createScheduledAction(callback: (err: AWSError, data: ScheduledAction) -> Unit = definedExternally): Request<ScheduledAction, AWSError>
    open fun createSnapshotCopyGrant(params: CreateSnapshotCopyGrantMessage, callback: (err: AWSError, data: CreateSnapshotCopyGrantResult) -> Unit = definedExternally): Request<CreateSnapshotCopyGrantResult, AWSError>
    open fun createSnapshotCopyGrant(callback: (err: AWSError, data: CreateSnapshotCopyGrantResult) -> Unit = definedExternally): Request<CreateSnapshotCopyGrantResult, AWSError>
    open fun createSnapshotSchedule(params: CreateSnapshotScheduleMessage, callback: (err: AWSError, data: SnapshotSchedule) -> Unit = definedExternally): Request<SnapshotSchedule, AWSError>
    open fun createSnapshotSchedule(callback: (err: AWSError, data: SnapshotSchedule) -> Unit = definedExternally): Request<SnapshotSchedule, AWSError>
    open fun createTags(params: CreateTagsMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createTags(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteCluster(params: DeleteClusterMessage, callback: (err: AWSError, data: DeleteClusterResult) -> Unit = definedExternally): Request<DeleteClusterResult, AWSError>
    open fun deleteCluster(callback: (err: AWSError, data: DeleteClusterResult) -> Unit = definedExternally): Request<DeleteClusterResult, AWSError>
    open fun deleteClusterParameterGroup(params: DeleteClusterParameterGroupMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteClusterParameterGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteClusterSecurityGroup(params: DeleteClusterSecurityGroupMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteClusterSecurityGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteClusterSnapshot(params: DeleteClusterSnapshotMessage, callback: (err: AWSError, data: DeleteClusterSnapshotResult) -> Unit = definedExternally): Request<DeleteClusterSnapshotResult, AWSError>
    open fun deleteClusterSnapshot(callback: (err: AWSError, data: DeleteClusterSnapshotResult) -> Unit = definedExternally): Request<DeleteClusterSnapshotResult, AWSError>
    open fun deleteClusterSubnetGroup(params: DeleteClusterSubnetGroupMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteClusterSubnetGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEventSubscription(params: DeleteEventSubscriptionMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEventSubscription(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteHsmClientCertificate(params: DeleteHsmClientCertificateMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteHsmClientCertificate(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteHsmConfiguration(params: DeleteHsmConfigurationMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteHsmConfiguration(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteScheduledAction(params: DeleteScheduledActionMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteScheduledAction(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSnapshotCopyGrant(params: DeleteSnapshotCopyGrantMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSnapshotCopyGrant(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSnapshotSchedule(params: DeleteSnapshotScheduleMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSnapshotSchedule(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteTags(params: DeleteTagsMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteTags(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeAccountAttributes(params: DescribeAccountAttributesMessage, callback: (err: AWSError, data: AccountAttributeList) -> Unit = definedExternally): Request<AccountAttributeList, AWSError>
    open fun describeAccountAttributes(callback: (err: AWSError, data: AccountAttributeList) -> Unit = definedExternally): Request<AccountAttributeList, AWSError>
    open fun describeClusterDbRevisions(params: DescribeClusterDbRevisionsMessage, callback: (err: AWSError, data: ClusterDbRevisionsMessage) -> Unit = definedExternally): Request<ClusterDbRevisionsMessage, AWSError>
    open fun describeClusterDbRevisions(callback: (err: AWSError, data: ClusterDbRevisionsMessage) -> Unit = definedExternally): Request<ClusterDbRevisionsMessage, AWSError>
    open fun describeClusterParameterGroups(params: DescribeClusterParameterGroupsMessage, callback: (err: AWSError, data: ClusterParameterGroupsMessage) -> Unit = definedExternally): Request<ClusterParameterGroupsMessage, AWSError>
    open fun describeClusterParameterGroups(callback: (err: AWSError, data: ClusterParameterGroupsMessage) -> Unit = definedExternally): Request<ClusterParameterGroupsMessage, AWSError>
    open fun describeClusterParameters(params: DescribeClusterParametersMessage, callback: (err: AWSError, data: ClusterParameterGroupDetails) -> Unit = definedExternally): Request<ClusterParameterGroupDetails, AWSError>
    open fun describeClusterParameters(callback: (err: AWSError, data: ClusterParameterGroupDetails) -> Unit = definedExternally): Request<ClusterParameterGroupDetails, AWSError>
    open fun describeClusterSecurityGroups(params: DescribeClusterSecurityGroupsMessage, callback: (err: AWSError, data: ClusterSecurityGroupMessage) -> Unit = definedExternally): Request<ClusterSecurityGroupMessage, AWSError>
    open fun describeClusterSecurityGroups(callback: (err: AWSError, data: ClusterSecurityGroupMessage) -> Unit = definedExternally): Request<ClusterSecurityGroupMessage, AWSError>
    open fun describeClusterSnapshots(params: DescribeClusterSnapshotsMessage, callback: (err: AWSError, data: SnapshotMessage) -> Unit = definedExternally): Request<SnapshotMessage, AWSError>
    open fun describeClusterSnapshots(callback: (err: AWSError, data: SnapshotMessage) -> Unit = definedExternally): Request<SnapshotMessage, AWSError>
    open fun describeClusterSubnetGroups(params: DescribeClusterSubnetGroupsMessage, callback: (err: AWSError, data: ClusterSubnetGroupMessage) -> Unit = definedExternally): Request<ClusterSubnetGroupMessage, AWSError>
    open fun describeClusterSubnetGroups(callback: (err: AWSError, data: ClusterSubnetGroupMessage) -> Unit = definedExternally): Request<ClusterSubnetGroupMessage, AWSError>
    open fun describeClusterTracks(params: DescribeClusterTracksMessage, callback: (err: AWSError, data: TrackListMessage) -> Unit = definedExternally): Request<TrackListMessage, AWSError>
    open fun describeClusterTracks(callback: (err: AWSError, data: TrackListMessage) -> Unit = definedExternally): Request<TrackListMessage, AWSError>
    open fun describeClusterVersions(params: DescribeClusterVersionsMessage, callback: (err: AWSError, data: ClusterVersionsMessage) -> Unit = definedExternally): Request<ClusterVersionsMessage, AWSError>
    open fun describeClusterVersions(callback: (err: AWSError, data: ClusterVersionsMessage) -> Unit = definedExternally): Request<ClusterVersionsMessage, AWSError>
    open fun describeClusters(params: DescribeClustersMessage, callback: (err: AWSError, data: ClustersMessage) -> Unit = definedExternally): Request<ClustersMessage, AWSError>
    open fun describeClusters(callback: (err: AWSError, data: ClustersMessage) -> Unit = definedExternally): Request<ClustersMessage, AWSError>
    open fun describeDefaultClusterParameters(params: DescribeDefaultClusterParametersMessage, callback: (err: AWSError, data: DescribeDefaultClusterParametersResult) -> Unit = definedExternally): Request<DescribeDefaultClusterParametersResult, AWSError>
    open fun describeDefaultClusterParameters(callback: (err: AWSError, data: DescribeDefaultClusterParametersResult) -> Unit = definedExternally): Request<DescribeDefaultClusterParametersResult, AWSError>
    open fun describeEventCategories(params: DescribeEventCategoriesMessage, callback: (err: AWSError, data: EventCategoriesMessage) -> Unit = definedExternally): Request<EventCategoriesMessage, AWSError>
    open fun describeEventCategories(callback: (err: AWSError, data: EventCategoriesMessage) -> Unit = definedExternally): Request<EventCategoriesMessage, AWSError>
    open fun describeEventSubscriptions(params: DescribeEventSubscriptionsMessage, callback: (err: AWSError, data: EventSubscriptionsMessage) -> Unit = definedExternally): Request<EventSubscriptionsMessage, AWSError>
    open fun describeEventSubscriptions(callback: (err: AWSError, data: EventSubscriptionsMessage) -> Unit = definedExternally): Request<EventSubscriptionsMessage, AWSError>
    open fun describeEvents(params: DescribeEventsMessage, callback: (err: AWSError, data: EventsMessage) -> Unit = definedExternally): Request<EventsMessage, AWSError>
    open fun describeEvents(callback: (err: AWSError, data: EventsMessage) -> Unit = definedExternally): Request<EventsMessage, AWSError>
    open fun describeHsmClientCertificates(params: DescribeHsmClientCertificatesMessage, callback: (err: AWSError, data: HsmClientCertificateMessage) -> Unit = definedExternally): Request<HsmClientCertificateMessage, AWSError>
    open fun describeHsmClientCertificates(callback: (err: AWSError, data: HsmClientCertificateMessage) -> Unit = definedExternally): Request<HsmClientCertificateMessage, AWSError>
    open fun describeHsmConfigurations(params: DescribeHsmConfigurationsMessage, callback: (err: AWSError, data: HsmConfigurationMessage) -> Unit = definedExternally): Request<HsmConfigurationMessage, AWSError>
    open fun describeHsmConfigurations(callback: (err: AWSError, data: HsmConfigurationMessage) -> Unit = definedExternally): Request<HsmConfigurationMessage, AWSError>
    open fun describeLoggingStatus(params: DescribeLoggingStatusMessage, callback: (err: AWSError, data: LoggingStatus) -> Unit = definedExternally): Request<LoggingStatus, AWSError>
    open fun describeLoggingStatus(callback: (err: AWSError, data: LoggingStatus) -> Unit = definedExternally): Request<LoggingStatus, AWSError>
    open fun describeNodeConfigurationOptions(params: DescribeNodeConfigurationOptionsMessage, callback: (err: AWSError, data: NodeConfigurationOptionsMessage) -> Unit = definedExternally): Request<NodeConfigurationOptionsMessage, AWSError>
    open fun describeNodeConfigurationOptions(callback: (err: AWSError, data: NodeConfigurationOptionsMessage) -> Unit = definedExternally): Request<NodeConfigurationOptionsMessage, AWSError>
    open fun describeOrderableClusterOptions(params: DescribeOrderableClusterOptionsMessage, callback: (err: AWSError, data: OrderableClusterOptionsMessage) -> Unit = definedExternally): Request<OrderableClusterOptionsMessage, AWSError>
    open fun describeOrderableClusterOptions(callback: (err: AWSError, data: OrderableClusterOptionsMessage) -> Unit = definedExternally): Request<OrderableClusterOptionsMessage, AWSError>
    open fun describeReservedNodeOfferings(params: DescribeReservedNodeOfferingsMessage, callback: (err: AWSError, data: ReservedNodeOfferingsMessage) -> Unit = definedExternally): Request<ReservedNodeOfferingsMessage, AWSError>
    open fun describeReservedNodeOfferings(callback: (err: AWSError, data: ReservedNodeOfferingsMessage) -> Unit = definedExternally): Request<ReservedNodeOfferingsMessage, AWSError>
    open fun describeReservedNodes(params: DescribeReservedNodesMessage, callback: (err: AWSError, data: ReservedNodesMessage) -> Unit = definedExternally): Request<ReservedNodesMessage, AWSError>
    open fun describeReservedNodes(callback: (err: AWSError, data: ReservedNodesMessage) -> Unit = definedExternally): Request<ReservedNodesMessage, AWSError>
    open fun describeResize(params: DescribeResizeMessage, callback: (err: AWSError, data: ResizeProgressMessage) -> Unit = definedExternally): Request<ResizeProgressMessage, AWSError>
    open fun describeResize(callback: (err: AWSError, data: ResizeProgressMessage) -> Unit = definedExternally): Request<ResizeProgressMessage, AWSError>
    open fun describeScheduledActions(params: DescribeScheduledActionsMessage, callback: (err: AWSError, data: ScheduledActionsMessage) -> Unit = definedExternally): Request<ScheduledActionsMessage, AWSError>
    open fun describeScheduledActions(callback: (err: AWSError, data: ScheduledActionsMessage) -> Unit = definedExternally): Request<ScheduledActionsMessage, AWSError>
    open fun describeSnapshotCopyGrants(params: DescribeSnapshotCopyGrantsMessage, callback: (err: AWSError, data: SnapshotCopyGrantMessage) -> Unit = definedExternally): Request<SnapshotCopyGrantMessage, AWSError>
    open fun describeSnapshotCopyGrants(callback: (err: AWSError, data: SnapshotCopyGrantMessage) -> Unit = definedExternally): Request<SnapshotCopyGrantMessage, AWSError>
    open fun describeSnapshotSchedules(params: DescribeSnapshotSchedulesMessage, callback: (err: AWSError, data: DescribeSnapshotSchedulesOutputMessage) -> Unit = definedExternally): Request<DescribeSnapshotSchedulesOutputMessage, AWSError>
    open fun describeSnapshotSchedules(callback: (err: AWSError, data: DescribeSnapshotSchedulesOutputMessage) -> Unit = definedExternally): Request<DescribeSnapshotSchedulesOutputMessage, AWSError>
    open fun describeStorage(callback: (err: AWSError, data: CustomerStorageMessage) -> Unit = definedExternally): Request<CustomerStorageMessage, AWSError>
    open fun describeTableRestoreStatus(params: DescribeTableRestoreStatusMessage, callback: (err: AWSError, data: TableRestoreStatusMessage) -> Unit = definedExternally): Request<TableRestoreStatusMessage, AWSError>
    open fun describeTableRestoreStatus(callback: (err: AWSError, data: TableRestoreStatusMessage) -> Unit = definedExternally): Request<TableRestoreStatusMessage, AWSError>
    open fun describeTags(params: DescribeTagsMessage, callback: (err: AWSError, data: TaggedResourceListMessage) -> Unit = definedExternally): Request<TaggedResourceListMessage, AWSError>
    open fun describeTags(callback: (err: AWSError, data: TaggedResourceListMessage) -> Unit = definedExternally): Request<TaggedResourceListMessage, AWSError>
    open fun disableLogging(params: DisableLoggingMessage, callback: (err: AWSError, data: LoggingStatus) -> Unit = definedExternally): Request<LoggingStatus, AWSError>
    open fun disableLogging(callback: (err: AWSError, data: LoggingStatus) -> Unit = definedExternally): Request<LoggingStatus, AWSError>
    open fun disableSnapshotCopy(params: DisableSnapshotCopyMessage, callback: (err: AWSError, data: DisableSnapshotCopyResult) -> Unit = definedExternally): Request<DisableSnapshotCopyResult, AWSError>
    open fun disableSnapshotCopy(callback: (err: AWSError, data: DisableSnapshotCopyResult) -> Unit = definedExternally): Request<DisableSnapshotCopyResult, AWSError>
    open fun enableLogging(params: EnableLoggingMessage, callback: (err: AWSError, data: LoggingStatus) -> Unit = definedExternally): Request<LoggingStatus, AWSError>
    open fun enableLogging(callback: (err: AWSError, data: LoggingStatus) -> Unit = definedExternally): Request<LoggingStatus, AWSError>
    open fun enableSnapshotCopy(params: EnableSnapshotCopyMessage, callback: (err: AWSError, data: EnableSnapshotCopyResult) -> Unit = definedExternally): Request<EnableSnapshotCopyResult, AWSError>
    open fun enableSnapshotCopy(callback: (err: AWSError, data: EnableSnapshotCopyResult) -> Unit = definedExternally): Request<EnableSnapshotCopyResult, AWSError>
    open fun getClusterCredentials(params: GetClusterCredentialsMessage, callback: (err: AWSError, data: ClusterCredentials) -> Unit = definedExternally): Request<ClusterCredentials, AWSError>
    open fun getClusterCredentials(callback: (err: AWSError, data: ClusterCredentials) -> Unit = definedExternally): Request<ClusterCredentials, AWSError>
    open fun getReservedNodeExchangeOfferings(params: GetReservedNodeExchangeOfferingsInputMessage, callback: (err: AWSError, data: GetReservedNodeExchangeOfferingsOutputMessage) -> Unit = definedExternally): Request<GetReservedNodeExchangeOfferingsOutputMessage, AWSError>
    open fun getReservedNodeExchangeOfferings(callback: (err: AWSError, data: GetReservedNodeExchangeOfferingsOutputMessage) -> Unit = definedExternally): Request<GetReservedNodeExchangeOfferingsOutputMessage, AWSError>
    open fun modifyCluster(params: ModifyClusterMessage, callback: (err: AWSError, data: ModifyClusterResult) -> Unit = definedExternally): Request<ModifyClusterResult, AWSError>
    open fun modifyCluster(callback: (err: AWSError, data: ModifyClusterResult) -> Unit = definedExternally): Request<ModifyClusterResult, AWSError>
    open fun modifyClusterDbRevision(params: ModifyClusterDbRevisionMessage, callback: (err: AWSError, data: ModifyClusterDbRevisionResult) -> Unit = definedExternally): Request<ModifyClusterDbRevisionResult, AWSError>
    open fun modifyClusterDbRevision(callback: (err: AWSError, data: ModifyClusterDbRevisionResult) -> Unit = definedExternally): Request<ModifyClusterDbRevisionResult, AWSError>
    open fun modifyClusterIamRoles(params: ModifyClusterIamRolesMessage, callback: (err: AWSError, data: ModifyClusterIamRolesResult) -> Unit = definedExternally): Request<ModifyClusterIamRolesResult, AWSError>
    open fun modifyClusterIamRoles(callback: (err: AWSError, data: ModifyClusterIamRolesResult) -> Unit = definedExternally): Request<ModifyClusterIamRolesResult, AWSError>
    open fun modifyClusterMaintenance(params: ModifyClusterMaintenanceMessage, callback: (err: AWSError, data: ModifyClusterMaintenanceResult) -> Unit = definedExternally): Request<ModifyClusterMaintenanceResult, AWSError>
    open fun modifyClusterMaintenance(callback: (err: AWSError, data: ModifyClusterMaintenanceResult) -> Unit = definedExternally): Request<ModifyClusterMaintenanceResult, AWSError>
    open fun modifyClusterParameterGroup(params: ModifyClusterParameterGroupMessage, callback: (err: AWSError, data: ClusterParameterGroupNameMessage) -> Unit = definedExternally): Request<ClusterParameterGroupNameMessage, AWSError>
    open fun modifyClusterParameterGroup(callback: (err: AWSError, data: ClusterParameterGroupNameMessage) -> Unit = definedExternally): Request<ClusterParameterGroupNameMessage, AWSError>
    open fun modifyClusterSnapshot(params: ModifyClusterSnapshotMessage, callback: (err: AWSError, data: ModifyClusterSnapshotResult) -> Unit = definedExternally): Request<ModifyClusterSnapshotResult, AWSError>
    open fun modifyClusterSnapshot(callback: (err: AWSError, data: ModifyClusterSnapshotResult) -> Unit = definedExternally): Request<ModifyClusterSnapshotResult, AWSError>
    open fun modifyClusterSnapshotSchedule(params: ModifyClusterSnapshotScheduleMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun modifyClusterSnapshotSchedule(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun modifyClusterSubnetGroup(params: ModifyClusterSubnetGroupMessage, callback: (err: AWSError, data: ModifyClusterSubnetGroupResult) -> Unit = definedExternally): Request<ModifyClusterSubnetGroupResult, AWSError>
    open fun modifyClusterSubnetGroup(callback: (err: AWSError, data: ModifyClusterSubnetGroupResult) -> Unit = definedExternally): Request<ModifyClusterSubnetGroupResult, AWSError>
    open fun modifyEventSubscription(params: ModifyEventSubscriptionMessage, callback: (err: AWSError, data: ModifyEventSubscriptionResult) -> Unit = definedExternally): Request<ModifyEventSubscriptionResult, AWSError>
    open fun modifyEventSubscription(callback: (err: AWSError, data: ModifyEventSubscriptionResult) -> Unit = definedExternally): Request<ModifyEventSubscriptionResult, AWSError>
    open fun modifyScheduledAction(params: ModifyScheduledActionMessage, callback: (err: AWSError, data: ScheduledAction) -> Unit = definedExternally): Request<ScheduledAction, AWSError>
    open fun modifyScheduledAction(callback: (err: AWSError, data: ScheduledAction) -> Unit = definedExternally): Request<ScheduledAction, AWSError>
    open fun modifySnapshotCopyRetentionPeriod(params: ModifySnapshotCopyRetentionPeriodMessage, callback: (err: AWSError, data: ModifySnapshotCopyRetentionPeriodResult) -> Unit = definedExternally): Request<ModifySnapshotCopyRetentionPeriodResult, AWSError>
    open fun modifySnapshotCopyRetentionPeriod(callback: (err: AWSError, data: ModifySnapshotCopyRetentionPeriodResult) -> Unit = definedExternally): Request<ModifySnapshotCopyRetentionPeriodResult, AWSError>
    open fun modifySnapshotSchedule(params: ModifySnapshotScheduleMessage, callback: (err: AWSError, data: SnapshotSchedule) -> Unit = definedExternally): Request<SnapshotSchedule, AWSError>
    open fun modifySnapshotSchedule(callback: (err: AWSError, data: SnapshotSchedule) -> Unit = definedExternally): Request<SnapshotSchedule, AWSError>
    open fun pauseCluster(params: PauseClusterMessage, callback: (err: AWSError, data: PauseClusterResult) -> Unit = definedExternally): Request<PauseClusterResult, AWSError>
    open fun pauseCluster(callback: (err: AWSError, data: PauseClusterResult) -> Unit = definedExternally): Request<PauseClusterResult, AWSError>
    open fun purchaseReservedNodeOffering(params: PurchaseReservedNodeOfferingMessage, callback: (err: AWSError, data: PurchaseReservedNodeOfferingResult) -> Unit = definedExternally): Request<PurchaseReservedNodeOfferingResult, AWSError>
    open fun purchaseReservedNodeOffering(callback: (err: AWSError, data: PurchaseReservedNodeOfferingResult) -> Unit = definedExternally): Request<PurchaseReservedNodeOfferingResult, AWSError>
    open fun rebootCluster(params: RebootClusterMessage, callback: (err: AWSError, data: RebootClusterResult) -> Unit = definedExternally): Request<RebootClusterResult, AWSError>
    open fun rebootCluster(callback: (err: AWSError, data: RebootClusterResult) -> Unit = definedExternally): Request<RebootClusterResult, AWSError>
    open fun resetClusterParameterGroup(params: ResetClusterParameterGroupMessage, callback: (err: AWSError, data: ClusterParameterGroupNameMessage) -> Unit = definedExternally): Request<ClusterParameterGroupNameMessage, AWSError>
    open fun resetClusterParameterGroup(callback: (err: AWSError, data: ClusterParameterGroupNameMessage) -> Unit = definedExternally): Request<ClusterParameterGroupNameMessage, AWSError>
    open fun resizeCluster(params: ResizeClusterMessage, callback: (err: AWSError, data: ResizeClusterResult) -> Unit = definedExternally): Request<ResizeClusterResult, AWSError>
    open fun resizeCluster(callback: (err: AWSError, data: ResizeClusterResult) -> Unit = definedExternally): Request<ResizeClusterResult, AWSError>
    open fun restoreFromClusterSnapshot(params: RestoreFromClusterSnapshotMessage, callback: (err: AWSError, data: RestoreFromClusterSnapshotResult) -> Unit = definedExternally): Request<RestoreFromClusterSnapshotResult, AWSError>
    open fun restoreFromClusterSnapshot(callback: (err: AWSError, data: RestoreFromClusterSnapshotResult) -> Unit = definedExternally): Request<RestoreFromClusterSnapshotResult, AWSError>
    open fun restoreTableFromClusterSnapshot(params: RestoreTableFromClusterSnapshotMessage, callback: (err: AWSError, data: RestoreTableFromClusterSnapshotResult) -> Unit = definedExternally): Request<RestoreTableFromClusterSnapshotResult, AWSError>
    open fun restoreTableFromClusterSnapshot(callback: (err: AWSError, data: RestoreTableFromClusterSnapshotResult) -> Unit = definedExternally): Request<RestoreTableFromClusterSnapshotResult, AWSError>
    open fun resumeCluster(params: ResumeClusterMessage, callback: (err: AWSError, data: ResumeClusterResult) -> Unit = definedExternally): Request<ResumeClusterResult, AWSError>
    open fun resumeCluster(callback: (err: AWSError, data: ResumeClusterResult) -> Unit = definedExternally): Request<ResumeClusterResult, AWSError>
    open fun revokeClusterSecurityGroupIngress(params: RevokeClusterSecurityGroupIngressMessage, callback: (err: AWSError, data: RevokeClusterSecurityGroupIngressResult) -> Unit = definedExternally): Request<RevokeClusterSecurityGroupIngressResult, AWSError>
    open fun revokeClusterSecurityGroupIngress(callback: (err: AWSError, data: RevokeClusterSecurityGroupIngressResult) -> Unit = definedExternally): Request<RevokeClusterSecurityGroupIngressResult, AWSError>
    open fun revokeSnapshotAccess(params: RevokeSnapshotAccessMessage, callback: (err: AWSError, data: RevokeSnapshotAccessResult) -> Unit = definedExternally): Request<RevokeSnapshotAccessResult, AWSError>
    open fun revokeSnapshotAccess(callback: (err: AWSError, data: RevokeSnapshotAccessResult) -> Unit = definedExternally): Request<RevokeSnapshotAccessResult, AWSError>
    open fun rotateEncryptionKey(params: RotateEncryptionKeyMessage, callback: (err: AWSError, data: RotateEncryptionKeyResult) -> Unit = definedExternally): Request<RotateEncryptionKeyResult, AWSError>
    open fun rotateEncryptionKey(callback: (err: AWSError, data: RotateEncryptionKeyResult) -> Unit = definedExternally): Request<RotateEncryptionKeyResult, AWSError>
    open fun waitFor(state: String, params: DescribeClustersMessage, callback: (err: AWSError, data: ClustersMessage) -> Unit = definedExternally): Request<ClustersMessage, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: ClustersMessage) -> Unit = definedExternally): Request<ClustersMessage, AWSError>
    open fun waitFor(state: String /* "snapshotAvailable" */, params: DescribeClusterSnapshotsMessage /* Redshift.Types.DescribeClusterSnapshotsMessage & `T$0` */, callback: (err: AWSError, data: SnapshotMessage) -> Unit = definedExternally): Request<SnapshotMessage, AWSError>
    open fun waitFor(state: String /* "snapshotAvailable" */, callback: (err: AWSError, data: SnapshotMessage) -> Unit = definedExternally): Request<SnapshotMessage, AWSError>
    interface AcceptReservedNodeExchangeInputMessage {
        var ReservedNodeId: String
        var TargetReservedNodeOfferingId: String
    }
    interface AcceptReservedNodeExchangeOutputMessage {
        var ExchangedReservedNode: ReservedNode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AccountAttribute {
        var AttributeName: String?
            get() = definedExternally
            set(value) = definedExternally
        var AttributeValues: AttributeValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AccountAttributeList {
        var AccountAttributes: AttributeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AccountWithRestoreAccess {
        var AccountId: String?
            get() = definedExternally
            set(value) = definedExternally
        var AccountAlias: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttributeValueTarget {
        var AttributeValue: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AuthorizeClusterSecurityGroupIngressMessage {
        var ClusterSecurityGroupName: String
        var CIDRIP: String?
            get() = definedExternally
            set(value) = definedExternally
        var EC2SecurityGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var EC2SecurityGroupOwnerId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AuthorizeClusterSecurityGroupIngressResult {
        var ClusterSecurityGroup: ClusterSecurityGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AuthorizeSnapshotAccessMessage {
        var SnapshotIdentifier: String
        var SnapshotClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var AccountWithRestoreAccess: String
    }
    interface AuthorizeSnapshotAccessResult {
        var Snapshot: Snapshot?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AvailabilityZone {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedPlatforms: SupportedPlatformsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDeleteClusterSnapshotsRequest {
        var Identifiers: DeleteClusterSnapshotMessageList
    }
    interface BatchDeleteClusterSnapshotsResult {
        var Resources: SnapshotIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var Errors: BatchSnapshotOperationErrorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchModifyClusterSnapshotsMessage {
        var SnapshotIdentifierList: SnapshotIdentifierList
        var ManualSnapshotRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Force: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchModifyClusterSnapshotsOutputMessage {
        var Resources: SnapshotIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var Errors: BatchSnapshotOperationErrors?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelResizeMessage {
        var ClusterIdentifier: String
    }
    interface Cluster {
        var ClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var NodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterAvailabilityStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var ModifyStatus: String?
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
        var ClusterCreateTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var AutomatedSnapshotRetentionPeriod: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ManualSnapshotRetentionPeriod: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterSecurityGroups: ClusterSecurityGroupMembershipList?
            get() = definedExternally
            set(value) = definedExternally
        var VpcSecurityGroups: VpcSecurityGroupMembershipList?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterParameterGroups: ClusterParameterGroupStatusList?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterSubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: String?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var PendingModifiedValues: PendingModifiedValues?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var AllowVersionUpgrade: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfNodes: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var PubliclyAccessible: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Encrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RestoreStatus: RestoreStatus?
            get() = definedExternally
            set(value) = definedExternally
        var DataTransferProgress: DataTransferProgress?
            get() = definedExternally
            set(value) = definedExternally
        var HsmStatus: HsmStatus?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterSnapshotCopyStatus: ClusterSnapshotCopyStatus?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterPublicKey: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterNodes: ClusterNodesList?
            get() = definedExternally
            set(value) = definedExternally
        var ElasticIpStatus: ElasticIpStatus?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterRevisionNumber: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var EnhancedVpcRouting: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoles: ClusterIamRoleList?
            get() = definedExternally
            set(value) = definedExternally
        var PendingActions: PendingActionsList?
            get() = definedExternally
            set(value) = definedExternally
        var MaintenanceTrackName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ElasticResizeNumberOfNodeOptions: String?
            get() = definedExternally
            set(value) = definedExternally
        var DeferredMaintenanceWindows: DeferredMaintenanceWindowsList?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotScheduleIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotScheduleState: String /* "MODIFYING" | "ACTIVE" | "FAILED" | String */
        var ExpectedNextSnapshotScheduleTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var ExpectedNextSnapshotScheduleTimeStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var NextMaintenanceWindowStartTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var ResizeInfo: ResizeInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterAssociatedToSchedule {
        var ClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduleAssociationState: String /* "MODIFYING" | "ACTIVE" | "FAILED" | String */
    }
    interface ClusterCredentials {
        var DbUser: String?
            get() = definedExternally
            set(value) = definedExternally
        var DbPassword: SensitiveString?
            get() = definedExternally
            set(value) = definedExternally
        var Expiration: TStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterDbRevision {
        var ClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentDatabaseRevision: String?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseRevisionReleaseDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var RevisionTargets: RevisionTargetsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterDbRevisionsMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterDbRevisions: ClusterDbRevisionsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterIamRole {
        var IamRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ApplyStatus: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterNode {
        var NodeRole: String?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateIPAddress: String?
            get() = definedExternally
            set(value) = definedExternally
        var PublicIPAddress: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterParameterGroup {
        var ParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterGroupFamily: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterParameterGroupDetails {
        var Parameters: ParametersList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterParameterGroupNameMessage {
        var ParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterGroupStatus: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterParameterGroupStatus {
        var ParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterApplyStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterParameterStatusList: ClusterParameterStatusList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterParameterGroupsMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterGroups: ParameterGroupList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterParameterStatus {
        var ParameterName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterApplyStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterApplyErrorDescription: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterSecurityGroup {
        var ClusterSecurityGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var EC2SecurityGroups: EC2SecurityGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var IPRanges: IPRangeList?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterSecurityGroupMembership {
        var ClusterSecurityGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterSecurityGroupMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterSecurityGroups: ClusterSecurityGroups?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterSnapshotCopyStatus {
        var DestinationRegion: String?
            get() = definedExternally
            set(value) = definedExternally
        var RetentionPeriod: Long?
            get() = definedExternally
            set(value) = definedExternally
        var ManualSnapshotRetentionPeriod: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotCopyGrantName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterSubnetGroup {
        var ClusterSubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
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
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterSubnetGroupMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterSubnetGroups: ClusterSubnetGroups?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterVersion {
        var ClusterVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterParameterGroupFamily: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterVersionsMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterVersions: ClusterVersionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClustersMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var Clusters: ClusterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CopyClusterSnapshotMessage {
        var SourceSnapshotIdentifier: String
        var SourceSnapshotClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var TargetSnapshotIdentifier: String
        var ManualSnapshotRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CopyClusterSnapshotResult {
        var Snapshot: Snapshot?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClusterMessage {
        var DBName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterIdentifier: String
        var ClusterType: String?
            get() = definedExternally
            set(value) = definedExternally
        var NodeType: String
        var MasterUsername: String
        var MasterUserPassword: String
        var ClusterSecurityGroups: ClusterSecurityGroupNameList?
            get() = definedExternally
            set(value) = definedExternally
        var VpcSecurityGroupIds: VpcSecurityGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterSubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutomatedSnapshotRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ManualSnapshotRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var AllowVersionUpgrade: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfNodes: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var PubliclyAccessible: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Encrypted: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var HsmClientCertificateIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var HsmConfigurationIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var ElasticIp: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var EnhancedVpcRouting: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var AdditionalInfo: String?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoles: IamRoleArnList?
            get() = definedExternally
            set(value) = definedExternally
        var MaintenanceTrackName: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotScheduleIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClusterParameterGroupMessage {
        var ParameterGroupName: String
        var ParameterGroupFamily: String
        var Description: String
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClusterParameterGroupResult {
        var ClusterParameterGroup: ClusterParameterGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClusterResult {
        var Cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClusterSecurityGroupMessage {
        var ClusterSecurityGroupName: String
        var Description: String
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClusterSecurityGroupResult {
        var ClusterSecurityGroup: ClusterSecurityGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClusterSnapshotMessage {
        var SnapshotIdentifier: String
        var ClusterIdentifier: String
        var ManualSnapshotRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClusterSnapshotResult {
        var Snapshot: Snapshot?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClusterSubnetGroupMessage {
        var ClusterSubnetGroupName: String
        var Description: String
        var SubnetIds: SubnetIdentifierList
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClusterSubnetGroupResult {
        var ClusterSubnetGroup: ClusterSubnetGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEventSubscriptionMessage {
        var SubscriptionName: String
        var SnsTopicArn: String
        var SourceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceIds: SourceIdsList?
            get() = definedExternally
            set(value) = definedExternally
        var EventCategories: EventCategoriesList?
            get() = definedExternally
            set(value) = definedExternally
        var Severity: String?
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
    interface CreateHsmClientCertificateMessage {
        var HsmClientCertificateIdentifier: String
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateHsmClientCertificateResult {
        var HsmClientCertificate: HsmClientCertificate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateHsmConfigurationMessage {
        var HsmConfigurationIdentifier: String
        var Description: String
        var HsmIpAddress: String
        var HsmPartitionName: String
        var HsmPartitionPassword: String
        var HsmServerPublicCertificate: String
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateHsmConfigurationResult {
        var HsmConfiguration: HsmConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateScheduledActionMessage {
        var ScheduledActionName: String
        var TargetAction: ScheduledActionType
        var Schedule: String
        var IamRole: String
        var ScheduledActionDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var Enable: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSnapshotCopyGrantMessage {
        var SnapshotCopyGrantName: String
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSnapshotCopyGrantResult {
        var SnapshotCopyGrant: SnapshotCopyGrant?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSnapshotScheduleMessage {
        var ScheduleDefinitions: ScheduleDefinitionList?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduleIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduleDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var DryRun: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var NextInvocations: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTagsMessage {
        var ResourceName: String
        var Tags: TagList
    }
    interface CustomerStorageMessage {
        var TotalBackupSizeInMegaBytes: Double?
            get() = definedExternally
            set(value) = definedExternally
        var TotalProvisionedStorageInMegaBytes: Double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataTransferProgress {
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentRateInMegaBytesPerSecond: DoubleOptional?
            get() = definedExternally
            set(value) = definedExternally
        var TotalDataInMegaBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var DataTransferredInMegaBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedTimeToCompletionInSeconds: LongOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ElapsedTimeInSeconds: LongOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DefaultClusterParameters {
        var ParameterGroupFamily: String?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: ParametersList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeferredMaintenanceWindow {
        var DeferMaintenanceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var DeferMaintenanceStartTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var DeferMaintenanceEndTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteClusterMessage {
        var ClusterIdentifier: String
        var SkipFinalClusterSnapshot: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var FinalClusterSnapshotIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var FinalClusterSnapshotRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteClusterParameterGroupMessage {
        var ParameterGroupName: String
    }
    interface DeleteClusterResult {
        var Cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteClusterSecurityGroupMessage {
        var ClusterSecurityGroupName: String
    }
    interface DeleteClusterSnapshotMessage {
        var SnapshotIdentifier: String
        var SnapshotClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteClusterSnapshotResult {
        var Snapshot: Snapshot?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteClusterSubnetGroupMessage {
        var ClusterSubnetGroupName: String
    }
    interface DeleteEventSubscriptionMessage {
        var SubscriptionName: String
    }
    interface DeleteHsmClientCertificateMessage {
        var HsmClientCertificateIdentifier: String
    }
    interface DeleteHsmConfigurationMessage {
        var HsmConfigurationIdentifier: String
    }
    interface DeleteScheduledActionMessage {
        var ScheduledActionName: String
    }
    interface DeleteSnapshotCopyGrantMessage {
        var SnapshotCopyGrantName: String
    }
    interface DeleteSnapshotScheduleMessage {
        var ScheduleIdentifier: String
    }
    interface DeleteTagsMessage {
        var ResourceName: String
        var TagKeys: TagKeyList
    }
    interface DescribeAccountAttributesMessage {
        var AttributeNames: AttributeNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeClusterDbRevisionsMessage {
        var ClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeClusterParameterGroupsMessage {
        var ParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var TagKeys: TagKeyList?
            get() = definedExternally
            set(value) = definedExternally
        var TagValues: TagValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeClusterParametersMessage {
        var ParameterGroupName: String
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
    interface DescribeClusterSecurityGroupsMessage {
        var ClusterSecurityGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var TagKeys: TagKeyList?
            get() = definedExternally
            set(value) = definedExternally
        var TagValues: TagValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeClusterSnapshotsMessage {
        var ClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotType: String?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerAccount: String?
            get() = definedExternally
            set(value) = definedExternally
        var TagKeys: TagKeyList?
            get() = definedExternally
            set(value) = definedExternally
        var TagValues: TagValueList?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterExists: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SortingEntities: SnapshotSortingEntityList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeClusterSubnetGroupsMessage {
        var ClusterSubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var TagKeys: TagKeyList?
            get() = definedExternally
            set(value) = definedExternally
        var TagValues: TagValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeClusterTracksMessage {
        var MaintenanceTrackName: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeClusterVersionsMessage {
        var ClusterVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterParameterGroupFamily: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeClustersMessage {
        var ClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var TagKeys: TagKeyList?
            get() = definedExternally
            set(value) = definedExternally
        var TagValues: TagValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDefaultClusterParametersMessage {
        var ParameterGroupFamily: String
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDefaultClusterParametersResult {
        var DefaultClusterParameters: DefaultClusterParameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventCategoriesMessage {
        var SourceType: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventSubscriptionsMessage {
        var SubscriptionName: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var TagKeys: TagKeyList?
            get() = definedExternally
            set(value) = definedExternally
        var TagValues: TagValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventsMessage {
        var SourceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceType: String /* "cluster" | "cluster-parameter-group" | "cluster-security-group" | "cluster-snapshot" | "scheduled-action" | String */
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
    interface DescribeHsmClientCertificatesMessage {
        var HsmClientCertificateIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var TagKeys: TagKeyList?
            get() = definedExternally
            set(value) = definedExternally
        var TagValues: TagValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeHsmConfigurationsMessage {
        var HsmConfigurationIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var TagKeys: TagKeyList?
            get() = definedExternally
            set(value) = definedExternally
        var TagValues: TagValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLoggingStatusMessage {
        var ClusterIdentifier: String
    }
    interface DescribeNodeConfigurationOptionsMessage {
        var ActionType: String /* "restore-cluster" | "recommend-node-config" | "resize-cluster" | String */
        var ClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerAccount: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: NodeConfigurationOptionsFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeOrderableClusterOptionsMessage {
        var ClusterVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var NodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeReservedNodeOfferingsMessage {
        var ReservedNodeOfferingId: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeReservedNodesMessage {
        var ReservedNodeId: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeResizeMessage {
        var ClusterIdentifier: String
    }
    interface DescribeScheduledActionsMessage {
        var ScheduledActionName: String?
            get() = definedExternally
            set(value) = definedExternally
        var TargetActionType: String /* "ResizeCluster" | "PauseCluster" | "ResumeCluster" | String */
        var StartTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var Active: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: ScheduledActionFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSnapshotCopyGrantsMessage {
        var SnapshotCopyGrantName: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var TagKeys: TagKeyList?
            get() = definedExternally
            set(value) = definedExternally
        var TagValues: TagValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSnapshotSchedulesMessage {
        var ClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduleIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var TagKeys: TagKeyList?
            get() = definedExternally
            set(value) = definedExternally
        var TagValues: TagValueList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSnapshotSchedulesOutputMessage {
        var SnapshotSchedules: SnapshotScheduleList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTableRestoreStatusMessage {
        var ClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var TableRestoreRequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTagsMessage {
        var ResourceName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var TagKeys: TagKeyList?
            get() = definedExternally
            set(value) = definedExternally
        var TagValues: TagValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisableLoggingMessage {
        var ClusterIdentifier: String
    }
    interface DisableSnapshotCopyMessage {
        var ClusterIdentifier: String
    }
    interface DisableSnapshotCopyResult {
        var Cluster: Cluster?
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
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ElasticIpStatus {
        var ElasticIp: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnableLoggingMessage {
        var ClusterIdentifier: String
        var BucketName: String
        var S3KeyPrefix: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnableSnapshotCopyMessage {
        var ClusterIdentifier: String
        var DestinationRegion: String
        var RetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotCopyGrantName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ManualSnapshotRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnableSnapshotCopyResult {
        var Cluster: Cluster?
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
        var SourceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceType: String /* "cluster" | "cluster-parameter-group" | "cluster-security-group" | "cluster-snapshot" | "scheduled-action" | String */
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
        var EventCategories: EventCategoriesList?
            get() = definedExternally
            set(value) = definedExternally
        var Severity: String?
            get() = definedExternally
            set(value) = definedExternally
        var Date: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var EventId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventCategoriesMap {
        var SourceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Events: EventInfoMapList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventCategoriesMessage {
        var EventCategoriesMapList: EventCategoriesMapList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventInfoMap {
        var EventId: String?
            get() = definedExternally
            set(value) = definedExternally
        var EventCategories: EventCategoriesList?
            get() = definedExternally
            set(value) = definedExternally
        var EventDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var Severity: String?
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
        var SubscriptionCreationTime: TStamp?
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
        var Severity: String?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
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
    interface GetClusterCredentialsMessage {
        var DbUser: String
        var DbName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterIdentifier: String
        var DurationSeconds: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var AutoCreate: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DbGroups: DbGroupList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetReservedNodeExchangeOfferingsInputMessage {
        var ReservedNodeId: String
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetReservedNodeExchangeOfferingsOutputMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReservedNodeOfferings: ReservedNodeOfferingList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HsmClientCertificate {
        var HsmClientCertificateIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var HsmClientCertificatePublicKey: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HsmClientCertificateMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var HsmClientCertificates: HsmClientCertificateList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HsmConfiguration {
        var HsmConfigurationIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var HsmIpAddress: String?
            get() = definedExternally
            set(value) = definedExternally
        var HsmPartitionName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HsmConfigurationMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var HsmConfigurations: HsmConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HsmStatus {
        var HsmClientCertificateIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var HsmConfigurationIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
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
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoggingStatus {
        var LoggingEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var BucketName: String?
            get() = definedExternally
            set(value) = definedExternally
        var S3KeyPrefix: String?
            get() = definedExternally
            set(value) = definedExternally
        var LastSuccessfulDeliveryTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastFailureTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastFailureMessage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MaintenanceTrack {
        var MaintenanceTrackName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var UpdateTargets: EligibleTracksToUpdateList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyClusterDbRevisionMessage {
        var ClusterIdentifier: String
        var RevisionTarget: String
    }
    interface ModifyClusterDbRevisionResult {
        var Cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyClusterIamRolesMessage {
        var ClusterIdentifier: String
        var AddIamRoles: IamRoleArnList?
            get() = definedExternally
            set(value) = definedExternally
        var RemoveIamRoles: IamRoleArnList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyClusterIamRolesResult {
        var Cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyClusterMaintenanceMessage {
        var ClusterIdentifier: String
        var DeferMaintenance: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DeferMaintenanceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var DeferMaintenanceStartTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var DeferMaintenanceEndTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var DeferMaintenanceDuration: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyClusterMaintenanceResult {
        var Cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyClusterMessage {
        var ClusterIdentifier: String
        var ClusterType: String?
            get() = definedExternally
            set(value) = definedExternally
        var NodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfNodes: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterSecurityGroups: ClusterSecurityGroupNameList?
            get() = definedExternally
            set(value) = definedExternally
        var VpcSecurityGroupIds: VpcSecurityGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var MasterUserPassword: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutomatedSnapshotRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ManualSnapshotRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var AllowVersionUpgrade: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var HsmClientCertificateIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var HsmConfigurationIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var NewClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var PubliclyAccessible: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ElasticIp: String?
            get() = definedExternally
            set(value) = definedExternally
        var EnhancedVpcRouting: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MaintenanceTrackName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Encrypted: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyClusterParameterGroupMessage {
        var ParameterGroupName: String
        var Parameters: ParametersList
    }
    interface ModifyClusterResult {
        var Cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyClusterSnapshotMessage {
        var SnapshotIdentifier: String
        var ManualSnapshotRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Force: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyClusterSnapshotResult {
        var Snapshot: Snapshot?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyClusterSnapshotScheduleMessage {
        var ClusterIdentifier: String
        var ScheduleIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var DisassociateSchedule: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyClusterSubnetGroupMessage {
        var ClusterSubnetGroupName: String
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: SubnetIdentifierList
    }
    interface ModifyClusterSubnetGroupResult {
        var ClusterSubnetGroup: ClusterSubnetGroup?
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
        var SourceIds: SourceIdsList?
            get() = definedExternally
            set(value) = definedExternally
        var EventCategories: EventCategoriesList?
            get() = definedExternally
            set(value) = definedExternally
        var Severity: String?
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
    interface ModifyScheduledActionMessage {
        var ScheduledActionName: String
        var TargetAction: ScheduledActionType?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: String?
            get() = definedExternally
            set(value) = definedExternally
        var IamRole: String?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduledActionDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var Enable: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifySnapshotCopyRetentionPeriodMessage {
        var ClusterIdentifier: String
        var RetentionPeriod: Integer
        var Manual: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifySnapshotCopyRetentionPeriodResult {
        var Cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifySnapshotScheduleMessage {
        var ScheduleIdentifier: String
        var ScheduleDefinitions: ScheduleDefinitionList
    }
    interface NodeConfigurationOption {
        var NodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfNodes: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedDiskUtilizationPercent: DoubleOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Mode: String /* "standard" | "high-performance" | String */
    }
    interface NodeConfigurationOptionsFilter {
        var Name: String /* "NodeType" | "NumberOfNodes" | "EstimatedDiskUtilizationPercent" | "Mode" | String */
        var Operator: String /* "eq" | "lt" | "gt" | "le" | "ge" | "in" | "between" | String */
        var Values: ValueStringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodeConfigurationOptionsMessage {
        var NodeConfigurationOptionList: NodeConfigurationOptionList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrderableClusterOption {
        var ClusterVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterType: String?
            get() = definedExternally
            set(value) = definedExternally
        var NodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZones: AvailabilityZoneList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrderableClusterOptionsMessage {
        var OrderableClusterOptions: OrderableClusterOptionsList?
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
        var DataType: String?
            get() = definedExternally
            set(value) = definedExternally
        var AllowedValues: String?
            get() = definedExternally
            set(value) = definedExternally
        var ApplyType: String /* "static" | "dynamic" | String */
        var IsModifiable: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var MinimumEngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PauseClusterMessage {
        var ClusterIdentifier: String
    }
    interface PauseClusterResult {
        var Cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PendingModifiedValues {
        var MasterUserPassword: String?
            get() = definedExternally
            set(value) = definedExternally
        var NodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfNodes: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterType: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutomatedSnapshotRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var PubliclyAccessible: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EnhancedVpcRouting: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MaintenanceTrackName: String?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionType: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PurchaseReservedNodeOfferingMessage {
        var ReservedNodeOfferingId: String
        var NodeCount: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PurchaseReservedNodeOfferingResult {
        var ReservedNode: ReservedNode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RebootClusterMessage {
        var ClusterIdentifier: String
    }
    interface RebootClusterResult {
        var Cluster: Cluster?
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
    interface ReservedNode {
        var ReservedNodeId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReservedNodeOfferingId: String?
            get() = definedExternally
            set(value) = definedExternally
        var NodeType: String?
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
        var NodeCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var State: String?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingType: String?
            get() = definedExternally
            set(value) = definedExternally
        var RecurringCharges: RecurringChargeList?
            get() = definedExternally
            set(value) = definedExternally
        var ReservedNodeOfferingType: String /* "Regular" | "Upgradable" | String */
    }
    interface ReservedNodeOffering {
        var ReservedNodeOfferingId: String?
            get() = definedExternally
            set(value) = definedExternally
        var NodeType: String?
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
        var OfferingType: String?
            get() = definedExternally
            set(value) = definedExternally
        var RecurringCharges: RecurringChargeList?
            get() = definedExternally
            set(value) = definedExternally
        var ReservedNodeOfferingType: String /* "Regular" | "Upgradable" | String */
    }
    interface ReservedNodeOfferingsMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReservedNodeOfferings: ReservedNodeOfferingList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReservedNodesMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReservedNodes: ReservedNodeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResetClusterParameterGroupMessage {
        var ParameterGroupName: String
        var ResetAllParameters: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: ParametersList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResizeClusterMessage {
        var ClusterIdentifier: String
        var ClusterType: String?
            get() = definedExternally
            set(value) = definedExternally
        var NodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfNodes: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Classic: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResizeClusterResult {
        var Cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResizeInfo {
        var ResizeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var AllowCancelResize: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResizeProgressMessage {
        var TargetNodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var TargetNumberOfNodes: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var TargetClusterType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var ImportTablesCompleted: ImportTablesCompleted?
            get() = definedExternally
            set(value) = definedExternally
        var ImportTablesInProgress: ImportTablesInProgress?
            get() = definedExternally
            set(value) = definedExternally
        var ImportTablesNotStarted: ImportTablesNotStarted?
            get() = definedExternally
            set(value) = definedExternally
        var AvgResizeRateInMegaBytesPerSecond: DoubleOptional?
            get() = definedExternally
            set(value) = definedExternally
        var TotalResizeDataInMegaBytes: LongOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ProgressInMegaBytes: LongOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ElapsedTimeInSeconds: LongOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedTimeToCompletionInSeconds: LongOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ResizeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
        var TargetEncryptionType: String?
            get() = definedExternally
            set(value) = definedExternally
        var DataTransferProgressPercent: DoubleOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreFromClusterSnapshotMessage {
        var ClusterIdentifier: String
        var SnapshotIdentifier: String
        var SnapshotClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var AllowVersionUpgrade: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterSubnetGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var PubliclyAccessible: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerAccount: String?
            get() = definedExternally
            set(value) = definedExternally
        var HsmClientCertificateIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var HsmConfigurationIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var ElasticIp: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterParameterGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterSecurityGroups: ClusterSecurityGroupNameList?
            get() = definedExternally
            set(value) = definedExternally
        var VpcSecurityGroupIds: VpcSecurityGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutomatedSnapshotRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ManualSnapshotRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var NodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var EnhancedVpcRouting: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var AdditionalInfo: String?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoles: IamRoleArnList?
            get() = definedExternally
            set(value) = definedExternally
        var MaintenanceTrackName: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotScheduleIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfNodes: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreFromClusterSnapshotResult {
        var Cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreStatus {
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentRestoreRateInMegaBytesPerSecond: Double?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotSizeInMegaBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var ProgressInMegaBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var ElapsedTimeInSeconds: Long?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedTimeToCompletionInSeconds: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreTableFromClusterSnapshotMessage {
        var ClusterIdentifier: String
        var SnapshotIdentifier: String
        var SourceDatabaseName: String
        var SourceSchemaName: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceTableName: String
        var TargetDatabaseName: String?
            get() = definedExternally
            set(value) = definedExternally
        var TargetSchemaName: String?
            get() = definedExternally
            set(value) = definedExternally
        var NewTableName: String
    }
    interface RestoreTableFromClusterSnapshotResult {
        var TableRestoreStatus: TableRestoreStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResumeClusterMessage {
        var ClusterIdentifier: String
    }
    interface ResumeClusterResult {
        var Cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RevisionTarget {
        var DatabaseRevision: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseRevisionReleaseDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RevokeClusterSecurityGroupIngressMessage {
        var ClusterSecurityGroupName: String
        var CIDRIP: String?
            get() = definedExternally
            set(value) = definedExternally
        var EC2SecurityGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var EC2SecurityGroupOwnerId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RevokeClusterSecurityGroupIngressResult {
        var ClusterSecurityGroup: ClusterSecurityGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RevokeSnapshotAccessMessage {
        var SnapshotIdentifier: String
        var SnapshotClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var AccountWithRestoreAccess: String
    }
    interface RevokeSnapshotAccessResult {
        var Snapshot: Snapshot?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RotateEncryptionKeyMessage {
        var ClusterIdentifier: String
    }
    interface RotateEncryptionKeyResult {
        var Cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScheduledAction {
        var ScheduledActionName: String?
            get() = definedExternally
            set(value) = definedExternally
        var TargetAction: ScheduledActionType?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: String?
            get() = definedExternally
            set(value) = definedExternally
        var IamRole: String?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduledActionDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ACTIVE" | "DISABLED" | String */
        var NextInvocations: ScheduledActionTimeList?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScheduledActionFilter {
        var Name: String /* "cluster-identifier" | "iam-role" | String */
        var Values: ValueStringList
    }
    interface ScheduledActionType {
        var ResizeCluster: ResizeClusterMessage?
            get() = definedExternally
            set(value) = definedExternally
        var PauseCluster: PauseClusterMessage?
            get() = definedExternally
            set(value) = definedExternally
        var ResumeCluster: ResumeClusterMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScheduledActionsMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduledActions: ScheduledActionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Snapshot {
        var SnapshotIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotCreateTime: TStamp?
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
        var ClusterCreateTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var MasterUsername: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotType: String?
            get() = definedExternally
            set(value) = definedExternally
        var NodeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfNodes: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var DBName: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Encrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptedWithHSM: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AccountsWithRestoreAccess: AccountsWithRestoreAccessList?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerAccount: String?
            get() = definedExternally
            set(value) = definedExternally
        var TotalBackupSizeInMegaBytes: Double?
            get() = definedExternally
            set(value) = definedExternally
        var ActualIncrementalBackupSizeInMegaBytes: Double?
            get() = definedExternally
            set(value) = definedExternally
        var BackupProgressInMegaBytes: Double?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentBackupRateInMegaBytesPerSecond: Double?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedSecondsToCompletion: Long?
            get() = definedExternally
            set(value) = definedExternally
        var ElapsedTimeInSeconds: Long?
            get() = definedExternally
            set(value) = definedExternally
        var SourceRegion: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var RestorableNodeTypes: RestorableNodeTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var EnhancedVpcRouting: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var MaintenanceTrackName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ManualSnapshotRetentionPeriod: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ManualSnapshotRemainingDays: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotRetentionStartTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SnapshotCopyGrant {
        var SnapshotCopyGrantName: String?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SnapshotCopyGrantMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotCopyGrants: SnapshotCopyGrantList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SnapshotErrorMessage {
        var SnapshotIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var FailureCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var FailureReason: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SnapshotMessage {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var Snapshots: SnapshotList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SnapshotSchedule {
        var ScheduleDefinitions: ScheduleDefinitionList?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduleIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduleDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var NextInvocations: ScheduledSnapshotTimeList?
            get() = definedExternally
            set(value) = definedExternally
        var AssociatedClusterCount: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var AssociatedClusters: AssociatedClusterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SnapshotSortingEntity {
        var Attribute: String /* "SOURCE_TYPE" | "TOTAL_SIZE" | "CREATE_TIME" | String */
        var SortOrder: String /* "ASC" | "DESC" | String */
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
    interface SupportedOperation {
        var OperationName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SupportedPlatform {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TableRestoreStatus {
        var TableRestoreRequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "CANCELED" | String */
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
        var RequestTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var ProgressInMegaBytes: LongOptional?
            get() = definedExternally
            set(value) = definedExternally
        var TotalDataInMegaBytes: LongOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceDatabaseName: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceSchemaName: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceTableName: String?
            get() = definedExternally
            set(value) = definedExternally
        var TargetDatabaseName: String?
            get() = definedExternally
            set(value) = definedExternally
        var TargetSchemaName: String?
            get() = definedExternally
            set(value) = definedExternally
        var NewTableName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TableRestoreStatusMessage {
        var TableRestoreStatusDetails: TableRestoreStatusList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
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
    interface TaggedResource {
        var Tag: Tag?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TaggedResourceListMessage {
        var TaggedResources: TaggedResourceList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrackListMessage {
        var MaintenanceTracks: TrackList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTarget {
        var MaintenanceTrackName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedOperations: SupportedOperationList?
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
        var apiVersion: String /* "2012-12-01" | "latest" | String */
    }
}