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
import DMS.AccountQuota
import DMS.Certificate
import DMS.Connection
import DMS.Endpoint
import DMS.EventCategoryGroup
import DMS.Event
import DMS.EventSubscription
import DMS.Filter
import DMS.OrderableReplicationInstance
import DMS.PendingMaintenanceAction
import DMS.ResourcePendingMaintenanceActions
import DMS.ReplicationInstance
import DMS.ReplicationInstanceTaskLog
import DMS.ReplicationSubnetGroup
import DMS.ReplicationTaskAssessmentResult
import DMS.ReplicationTask
import DMS.Subnet
import DMS.SupportedEndpointType
import DMS.TableToReload
import DMS.TableStatistics
import DMS.Tag
import DMS.VpcSecurityGroupMembership
import DMS.AddTagsToResourceMessage
import DMS.AddTagsToResourceResponse
import DMS.ApplyPendingMaintenanceActionMessage
import DMS.ApplyPendingMaintenanceActionResponse
import DMS.CreateEndpointMessage
import DMS.CreateEndpointResponse
import DMS.CreateEventSubscriptionMessage
import DMS.CreateEventSubscriptionResponse
import DMS.CreateReplicationInstanceMessage
import DMS.CreateReplicationInstanceResponse
import DMS.CreateReplicationSubnetGroupMessage
import DMS.CreateReplicationSubnetGroupResponse
import DMS.CreateReplicationTaskMessage
import DMS.CreateReplicationTaskResponse
import DMS.DeleteCertificateMessage
import DMS.DeleteCertificateResponse
import DMS.DeleteConnectionMessage
import DMS.DeleteConnectionResponse
import DMS.DeleteEndpointMessage
import DMS.DeleteEndpointResponse
import DMS.DeleteEventSubscriptionMessage
import DMS.DeleteEventSubscriptionResponse
import DMS.DeleteReplicationInstanceMessage
import DMS.DeleteReplicationInstanceResponse
import DMS.DeleteReplicationSubnetGroupMessage
import DMS.DeleteReplicationSubnetGroupResponse
import DMS.DeleteReplicationTaskMessage
import DMS.DeleteReplicationTaskResponse
import DMS.DescribeAccountAttributesMessage
import DMS.DescribeAccountAttributesResponse
import DMS.DescribeCertificatesMessage
import DMS.DescribeCertificatesResponse
import DMS.DescribeConnectionsMessage
import DMS.DescribeConnectionsResponse
import DMS.DescribeEndpointTypesMessage
import DMS.DescribeEndpointTypesResponse
import DMS.DescribeEndpointsMessage
import DMS.DescribeEndpointsResponse
import DMS.DescribeEventCategoriesMessage
import DMS.DescribeEventCategoriesResponse
import DMS.DescribeEventSubscriptionsMessage
import DMS.DescribeEventSubscriptionsResponse
import DMS.DescribeEventsMessage
import DMS.DescribeEventsResponse
import DMS.DescribeOrderableReplicationInstancesMessage
import DMS.DescribeOrderableReplicationInstancesResponse
import DMS.DescribePendingMaintenanceActionsMessage
import DMS.DescribePendingMaintenanceActionsResponse
import DMS.DescribeRefreshSchemasStatusMessage
import DMS.DescribeRefreshSchemasStatusResponse
import DMS.DescribeReplicationInstanceTaskLogsMessage
import DMS.DescribeReplicationInstanceTaskLogsResponse
import DMS.DescribeReplicationInstancesMessage
import DMS.DescribeReplicationInstancesResponse
import DMS.DescribeReplicationSubnetGroupsMessage
import DMS.DescribeReplicationSubnetGroupsResponse
import DMS.DescribeReplicationTaskAssessmentResultsMessage
import DMS.DescribeReplicationTaskAssessmentResultsResponse
import DMS.DescribeReplicationTasksMessage
import DMS.DescribeReplicationTasksResponse
import DMS.DescribeSchemasMessage
import DMS.DescribeSchemasResponse
import DMS.DescribeTableStatisticsMessage
import DMS.DescribeTableStatisticsResponse
import DMS.ImportCertificateMessage
import DMS.ImportCertificateResponse
import DMS.ListTagsForResourceMessage
import DMS.ListTagsForResourceResponse
import DMS.ModifyEndpointMessage
import DMS.ModifyEndpointResponse
import DMS.ModifyEventSubscriptionMessage
import DMS.ModifyEventSubscriptionResponse
import DMS.ModifyReplicationInstanceMessage
import DMS.ModifyReplicationInstanceResponse
import DMS.ModifyReplicationSubnetGroupMessage
import DMS.ModifyReplicationSubnetGroupResponse
import DMS.ModifyReplicationTaskMessage
import DMS.ModifyReplicationTaskResponse
import DMS.RebootReplicationInstanceMessage
import DMS.RebootReplicationInstanceResponse
import DMS.RefreshSchemasMessage
import DMS.RefreshSchemasResponse
import DMS.ReloadTablesMessage
import DMS.ReloadTablesResponse
import DMS.RemoveTagsFromResourceMessage
import DMS.RemoveTagsFromResourceResponse
import DMS.StartReplicationTaskMessage
import DMS.StartReplicationTaskResponse
import DMS.StartReplicationTaskAssessmentMessage
import DMS.StartReplicationTaskAssessmentResponse
import DMS.StopReplicationTaskMessage
import DMS.StopReplicationTaskResponse
import DMS.TestConnectionMessage
import DMS.TestConnectionResponse
import DMS.DynamoDbSettings
import DMS.S3Settings
import DMS.DmsTransferSettings
import DMS.MongoDbSettings
import DMS.KinesisSettings
import DMS.KafkaSettings
import DMS.ElasticsearchSettings
import DMS.RedshiftSettings
import DMS.RefreshSchemasStatus
import DMS.ReplicationPendingModifiedValues
import DMS.ReplicationTaskStats
import DMS.AvailabilityZone

typealias AccountQuotaList = Array<AccountQuota>

typealias AvailabilityZonesList = Array<String>

typealias Boolean = Boolean

typealias BooleanOptional = Boolean

typealias CertificateList = Array<Certificate>

typealias ConnectionList = Array<Connection>

typealias EndpointList = Array<Endpoint>

typealias EventCategoriesList = Array<String>

typealias EventCategoryGroupList = Array<EventCategoryGroup>

typealias EventList = Array<Event>

typealias EventSubscriptionsList = Array<EventSubscription>

typealias FilterList = Array<Filter>

typealias FilterValueList = Array<String>

typealias Integer = Number

typealias IntegerOptional = Number

typealias KeyList = Array<String>

typealias Long = Number

typealias OrderableReplicationInstanceList = Array<OrderableReplicationInstance>

typealias PendingMaintenanceActionDetails = Array<PendingMaintenanceAction>

typealias PendingMaintenanceActions = Array<ResourcePendingMaintenanceActions>

typealias ReplicationInstanceList = Array<ReplicationInstance>

typealias ReplicationInstancePrivateIpAddressList = Array<String>

typealias ReplicationInstancePublicIpAddressList = Array<String>

typealias ReplicationInstanceTaskLogsList = Array<ReplicationInstanceTaskLog>

typealias ReplicationSubnetGroups = Array<ReplicationSubnetGroup>

typealias ReplicationTaskAssessmentResultList = Array<ReplicationTaskAssessmentResult>

typealias ReplicationTaskList = Array<ReplicationTask>

typealias SchemaList = Array<String>

typealias SecretString = String

typealias SourceIdsList = Array<String>

typealias String = String

typealias SubnetIdentifierList = Array<String>

typealias SubnetList = Array<Subnet>

typealias SupportedEndpointTypeList = Array<SupportedEndpointType>

typealias TStamp = Date

typealias TableListToReload = Array<TableToReload>

typealias TableStatisticsList = Array<TableStatistics>

typealias TagList = Array<Tag>

typealias VpcSecurityGroupIdList = Array<String>

typealias VpcSecurityGroupMembershipList = Array<VpcSecurityGroupMembership>

@JsModule("aws-sdk")
external open class DMS(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & DMS.Types.ClientConfiguration */
    open fun addTagsToResource(params: AddTagsToResourceMessage, callback: (err: AWSError, data: AddTagsToResourceResponse) -> Unit = definedExternally): Request<AddTagsToResourceResponse, AWSError>
    open fun addTagsToResource(callback: (err: AWSError, data: AddTagsToResourceResponse) -> Unit = definedExternally): Request<AddTagsToResourceResponse, AWSError>
    open fun applyPendingMaintenanceAction(params: ApplyPendingMaintenanceActionMessage, callback: (err: AWSError, data: ApplyPendingMaintenanceActionResponse) -> Unit = definedExternally): Request<ApplyPendingMaintenanceActionResponse, AWSError>
    open fun applyPendingMaintenanceAction(callback: (err: AWSError, data: ApplyPendingMaintenanceActionResponse) -> Unit = definedExternally): Request<ApplyPendingMaintenanceActionResponse, AWSError>
    open fun createEndpoint(params: CreateEndpointMessage, callback: (err: AWSError, data: CreateEndpointResponse) -> Unit = definedExternally): Request<CreateEndpointResponse, AWSError>
    open fun createEndpoint(callback: (err: AWSError, data: CreateEndpointResponse) -> Unit = definedExternally): Request<CreateEndpointResponse, AWSError>
    open fun createEventSubscription(params: CreateEventSubscriptionMessage, callback: (err: AWSError, data: CreateEventSubscriptionResponse) -> Unit = definedExternally): Request<CreateEventSubscriptionResponse, AWSError>
    open fun createEventSubscription(callback: (err: AWSError, data: CreateEventSubscriptionResponse) -> Unit = definedExternally): Request<CreateEventSubscriptionResponse, AWSError>
    open fun createReplicationInstance(params: CreateReplicationInstanceMessage, callback: (err: AWSError, data: CreateReplicationInstanceResponse) -> Unit = definedExternally): Request<CreateReplicationInstanceResponse, AWSError>
    open fun createReplicationInstance(callback: (err: AWSError, data: CreateReplicationInstanceResponse) -> Unit = definedExternally): Request<CreateReplicationInstanceResponse, AWSError>
    open fun createReplicationSubnetGroup(params: CreateReplicationSubnetGroupMessage, callback: (err: AWSError, data: CreateReplicationSubnetGroupResponse) -> Unit = definedExternally): Request<CreateReplicationSubnetGroupResponse, AWSError>
    open fun createReplicationSubnetGroup(callback: (err: AWSError, data: CreateReplicationSubnetGroupResponse) -> Unit = definedExternally): Request<CreateReplicationSubnetGroupResponse, AWSError>
    open fun createReplicationTask(params: CreateReplicationTaskMessage, callback: (err: AWSError, data: CreateReplicationTaskResponse) -> Unit = definedExternally): Request<CreateReplicationTaskResponse, AWSError>
    open fun createReplicationTask(callback: (err: AWSError, data: CreateReplicationTaskResponse) -> Unit = definedExternally): Request<CreateReplicationTaskResponse, AWSError>
    open fun deleteCertificate(params: DeleteCertificateMessage, callback: (err: AWSError, data: DeleteCertificateResponse) -> Unit = definedExternally): Request<DeleteCertificateResponse, AWSError>
    open fun deleteCertificate(callback: (err: AWSError, data: DeleteCertificateResponse) -> Unit = definedExternally): Request<DeleteCertificateResponse, AWSError>
    open fun deleteConnection(params: DeleteConnectionMessage, callback: (err: AWSError, data: DeleteConnectionResponse) -> Unit = definedExternally): Request<DeleteConnectionResponse, AWSError>
    open fun deleteConnection(callback: (err: AWSError, data: DeleteConnectionResponse) -> Unit = definedExternally): Request<DeleteConnectionResponse, AWSError>
    open fun deleteEndpoint(params: DeleteEndpointMessage, callback: (err: AWSError, data: DeleteEndpointResponse) -> Unit = definedExternally): Request<DeleteEndpointResponse, AWSError>
    open fun deleteEndpoint(callback: (err: AWSError, data: DeleteEndpointResponse) -> Unit = definedExternally): Request<DeleteEndpointResponse, AWSError>
    open fun deleteEventSubscription(params: DeleteEventSubscriptionMessage, callback: (err: AWSError, data: DeleteEventSubscriptionResponse) -> Unit = definedExternally): Request<DeleteEventSubscriptionResponse, AWSError>
    open fun deleteEventSubscription(callback: (err: AWSError, data: DeleteEventSubscriptionResponse) -> Unit = definedExternally): Request<DeleteEventSubscriptionResponse, AWSError>
    open fun deleteReplicationInstance(params: DeleteReplicationInstanceMessage, callback: (err: AWSError, data: DeleteReplicationInstanceResponse) -> Unit = definedExternally): Request<DeleteReplicationInstanceResponse, AWSError>
    open fun deleteReplicationInstance(callback: (err: AWSError, data: DeleteReplicationInstanceResponse) -> Unit = definedExternally): Request<DeleteReplicationInstanceResponse, AWSError>
    open fun deleteReplicationSubnetGroup(params: DeleteReplicationSubnetGroupMessage, callback: (err: AWSError, data: DeleteReplicationSubnetGroupResponse) -> Unit = definedExternally): Request<DeleteReplicationSubnetGroupResponse, AWSError>
    open fun deleteReplicationSubnetGroup(callback: (err: AWSError, data: DeleteReplicationSubnetGroupResponse) -> Unit = definedExternally): Request<DeleteReplicationSubnetGroupResponse, AWSError>
    open fun deleteReplicationTask(params: DeleteReplicationTaskMessage, callback: (err: AWSError, data: DeleteReplicationTaskResponse) -> Unit = definedExternally): Request<DeleteReplicationTaskResponse, AWSError>
    open fun deleteReplicationTask(callback: (err: AWSError, data: DeleteReplicationTaskResponse) -> Unit = definedExternally): Request<DeleteReplicationTaskResponse, AWSError>
    open fun describeAccountAttributes(params: DescribeAccountAttributesMessage, callback: (err: AWSError, data: DescribeAccountAttributesResponse) -> Unit = definedExternally): Request<DescribeAccountAttributesResponse, AWSError>
    open fun describeAccountAttributes(callback: (err: AWSError, data: DescribeAccountAttributesResponse) -> Unit = definedExternally): Request<DescribeAccountAttributesResponse, AWSError>
    open fun describeCertificates(params: DescribeCertificatesMessage, callback: (err: AWSError, data: DescribeCertificatesResponse) -> Unit = definedExternally): Request<DescribeCertificatesResponse, AWSError>
    open fun describeCertificates(callback: (err: AWSError, data: DescribeCertificatesResponse) -> Unit = definedExternally): Request<DescribeCertificatesResponse, AWSError>
    open fun describeConnections(params: DescribeConnectionsMessage, callback: (err: AWSError, data: DescribeConnectionsResponse) -> Unit = definedExternally): Request<DescribeConnectionsResponse, AWSError>
    open fun describeConnections(callback: (err: AWSError, data: DescribeConnectionsResponse) -> Unit = definedExternally): Request<DescribeConnectionsResponse, AWSError>
    open fun describeEndpointTypes(params: DescribeEndpointTypesMessage, callback: (err: AWSError, data: DescribeEndpointTypesResponse) -> Unit = definedExternally): Request<DescribeEndpointTypesResponse, AWSError>
    open fun describeEndpointTypes(callback: (err: AWSError, data: DescribeEndpointTypesResponse) -> Unit = definedExternally): Request<DescribeEndpointTypesResponse, AWSError>
    open fun describeEndpoints(params: DescribeEndpointsMessage, callback: (err: AWSError, data: DescribeEndpointsResponse) -> Unit = definedExternally): Request<DescribeEndpointsResponse, AWSError>
    open fun describeEndpoints(callback: (err: AWSError, data: DescribeEndpointsResponse) -> Unit = definedExternally): Request<DescribeEndpointsResponse, AWSError>
    open fun describeEventCategories(params: DescribeEventCategoriesMessage, callback: (err: AWSError, data: DescribeEventCategoriesResponse) -> Unit = definedExternally): Request<DescribeEventCategoriesResponse, AWSError>
    open fun describeEventCategories(callback: (err: AWSError, data: DescribeEventCategoriesResponse) -> Unit = definedExternally): Request<DescribeEventCategoriesResponse, AWSError>
    open fun describeEventSubscriptions(params: DescribeEventSubscriptionsMessage, callback: (err: AWSError, data: DescribeEventSubscriptionsResponse) -> Unit = definedExternally): Request<DescribeEventSubscriptionsResponse, AWSError>
    open fun describeEventSubscriptions(callback: (err: AWSError, data: DescribeEventSubscriptionsResponse) -> Unit = definedExternally): Request<DescribeEventSubscriptionsResponse, AWSError>
    open fun describeEvents(params: DescribeEventsMessage, callback: (err: AWSError, data: DescribeEventsResponse) -> Unit = definedExternally): Request<DescribeEventsResponse, AWSError>
    open fun describeEvents(callback: (err: AWSError, data: DescribeEventsResponse) -> Unit = definedExternally): Request<DescribeEventsResponse, AWSError>
    open fun describeOrderableReplicationInstances(params: DescribeOrderableReplicationInstancesMessage, callback: (err: AWSError, data: DescribeOrderableReplicationInstancesResponse) -> Unit = definedExternally): Request<DescribeOrderableReplicationInstancesResponse, AWSError>
    open fun describeOrderableReplicationInstances(callback: (err: AWSError, data: DescribeOrderableReplicationInstancesResponse) -> Unit = definedExternally): Request<DescribeOrderableReplicationInstancesResponse, AWSError>
    open fun describePendingMaintenanceActions(params: DescribePendingMaintenanceActionsMessage, callback: (err: AWSError, data: DescribePendingMaintenanceActionsResponse) -> Unit = definedExternally): Request<DescribePendingMaintenanceActionsResponse, AWSError>
    open fun describePendingMaintenanceActions(callback: (err: AWSError, data: DescribePendingMaintenanceActionsResponse) -> Unit = definedExternally): Request<DescribePendingMaintenanceActionsResponse, AWSError>
    open fun describeRefreshSchemasStatus(params: DescribeRefreshSchemasStatusMessage, callback: (err: AWSError, data: DescribeRefreshSchemasStatusResponse) -> Unit = definedExternally): Request<DescribeRefreshSchemasStatusResponse, AWSError>
    open fun describeRefreshSchemasStatus(callback: (err: AWSError, data: DescribeRefreshSchemasStatusResponse) -> Unit = definedExternally): Request<DescribeRefreshSchemasStatusResponse, AWSError>
    open fun describeReplicationInstanceTaskLogs(params: DescribeReplicationInstanceTaskLogsMessage, callback: (err: AWSError, data: DescribeReplicationInstanceTaskLogsResponse) -> Unit = definedExternally): Request<DescribeReplicationInstanceTaskLogsResponse, AWSError>
    open fun describeReplicationInstanceTaskLogs(callback: (err: AWSError, data: DescribeReplicationInstanceTaskLogsResponse) -> Unit = definedExternally): Request<DescribeReplicationInstanceTaskLogsResponse, AWSError>
    open fun describeReplicationInstances(params: DescribeReplicationInstancesMessage, callback: (err: AWSError, data: DescribeReplicationInstancesResponse) -> Unit = definedExternally): Request<DescribeReplicationInstancesResponse, AWSError>
    open fun describeReplicationInstances(callback: (err: AWSError, data: DescribeReplicationInstancesResponse) -> Unit = definedExternally): Request<DescribeReplicationInstancesResponse, AWSError>
    open fun describeReplicationSubnetGroups(params: DescribeReplicationSubnetGroupsMessage, callback: (err: AWSError, data: DescribeReplicationSubnetGroupsResponse) -> Unit = definedExternally): Request<DescribeReplicationSubnetGroupsResponse, AWSError>
    open fun describeReplicationSubnetGroups(callback: (err: AWSError, data: DescribeReplicationSubnetGroupsResponse) -> Unit = definedExternally): Request<DescribeReplicationSubnetGroupsResponse, AWSError>
    open fun describeReplicationTaskAssessmentResults(params: DescribeReplicationTaskAssessmentResultsMessage, callback: (err: AWSError, data: DescribeReplicationTaskAssessmentResultsResponse) -> Unit = definedExternally): Request<DescribeReplicationTaskAssessmentResultsResponse, AWSError>
    open fun describeReplicationTaskAssessmentResults(callback: (err: AWSError, data: DescribeReplicationTaskAssessmentResultsResponse) -> Unit = definedExternally): Request<DescribeReplicationTaskAssessmentResultsResponse, AWSError>
    open fun describeReplicationTasks(params: DescribeReplicationTasksMessage, callback: (err: AWSError, data: DescribeReplicationTasksResponse) -> Unit = definedExternally): Request<DescribeReplicationTasksResponse, AWSError>
    open fun describeReplicationTasks(callback: (err: AWSError, data: DescribeReplicationTasksResponse) -> Unit = definedExternally): Request<DescribeReplicationTasksResponse, AWSError>
    open fun describeSchemas(params: DescribeSchemasMessage, callback: (err: AWSError, data: DescribeSchemasResponse) -> Unit = definedExternally): Request<DescribeSchemasResponse, AWSError>
    open fun describeSchemas(callback: (err: AWSError, data: DescribeSchemasResponse) -> Unit = definedExternally): Request<DescribeSchemasResponse, AWSError>
    open fun describeTableStatistics(params: DescribeTableStatisticsMessage, callback: (err: AWSError, data: DescribeTableStatisticsResponse) -> Unit = definedExternally): Request<DescribeTableStatisticsResponse, AWSError>
    open fun describeTableStatistics(callback: (err: AWSError, data: DescribeTableStatisticsResponse) -> Unit = definedExternally): Request<DescribeTableStatisticsResponse, AWSError>
    open fun importCertificate(params: ImportCertificateMessage, callback: (err: AWSError, data: ImportCertificateResponse) -> Unit = definedExternally): Request<ImportCertificateResponse, AWSError>
    open fun importCertificate(callback: (err: AWSError, data: ImportCertificateResponse) -> Unit = definedExternally): Request<ImportCertificateResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceMessage, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun modifyEndpoint(params: ModifyEndpointMessage, callback: (err: AWSError, data: ModifyEndpointResponse) -> Unit = definedExternally): Request<ModifyEndpointResponse, AWSError>
    open fun modifyEndpoint(callback: (err: AWSError, data: ModifyEndpointResponse) -> Unit = definedExternally): Request<ModifyEndpointResponse, AWSError>
    open fun modifyEventSubscription(params: ModifyEventSubscriptionMessage, callback: (err: AWSError, data: ModifyEventSubscriptionResponse) -> Unit = definedExternally): Request<ModifyEventSubscriptionResponse, AWSError>
    open fun modifyEventSubscription(callback: (err: AWSError, data: ModifyEventSubscriptionResponse) -> Unit = definedExternally): Request<ModifyEventSubscriptionResponse, AWSError>
    open fun modifyReplicationInstance(params: ModifyReplicationInstanceMessage, callback: (err: AWSError, data: ModifyReplicationInstanceResponse) -> Unit = definedExternally): Request<ModifyReplicationInstanceResponse, AWSError>
    open fun modifyReplicationInstance(callback: (err: AWSError, data: ModifyReplicationInstanceResponse) -> Unit = definedExternally): Request<ModifyReplicationInstanceResponse, AWSError>
    open fun modifyReplicationSubnetGroup(params: ModifyReplicationSubnetGroupMessage, callback: (err: AWSError, data: ModifyReplicationSubnetGroupResponse) -> Unit = definedExternally): Request<ModifyReplicationSubnetGroupResponse, AWSError>
    open fun modifyReplicationSubnetGroup(callback: (err: AWSError, data: ModifyReplicationSubnetGroupResponse) -> Unit = definedExternally): Request<ModifyReplicationSubnetGroupResponse, AWSError>
    open fun modifyReplicationTask(params: ModifyReplicationTaskMessage, callback: (err: AWSError, data: ModifyReplicationTaskResponse) -> Unit = definedExternally): Request<ModifyReplicationTaskResponse, AWSError>
    open fun modifyReplicationTask(callback: (err: AWSError, data: ModifyReplicationTaskResponse) -> Unit = definedExternally): Request<ModifyReplicationTaskResponse, AWSError>
    open fun rebootReplicationInstance(params: RebootReplicationInstanceMessage, callback: (err: AWSError, data: RebootReplicationInstanceResponse) -> Unit = definedExternally): Request<RebootReplicationInstanceResponse, AWSError>
    open fun rebootReplicationInstance(callback: (err: AWSError, data: RebootReplicationInstanceResponse) -> Unit = definedExternally): Request<RebootReplicationInstanceResponse, AWSError>
    open fun refreshSchemas(params: RefreshSchemasMessage, callback: (err: AWSError, data: RefreshSchemasResponse) -> Unit = definedExternally): Request<RefreshSchemasResponse, AWSError>
    open fun refreshSchemas(callback: (err: AWSError, data: RefreshSchemasResponse) -> Unit = definedExternally): Request<RefreshSchemasResponse, AWSError>
    open fun reloadTables(params: ReloadTablesMessage, callback: (err: AWSError, data: ReloadTablesResponse) -> Unit = definedExternally): Request<ReloadTablesResponse, AWSError>
    open fun reloadTables(callback: (err: AWSError, data: ReloadTablesResponse) -> Unit = definedExternally): Request<ReloadTablesResponse, AWSError>
    open fun removeTagsFromResource(params: RemoveTagsFromResourceMessage, callback: (err: AWSError, data: RemoveTagsFromResourceResponse) -> Unit = definedExternally): Request<RemoveTagsFromResourceResponse, AWSError>
    open fun removeTagsFromResource(callback: (err: AWSError, data: RemoveTagsFromResourceResponse) -> Unit = definedExternally): Request<RemoveTagsFromResourceResponse, AWSError>
    open fun startReplicationTask(params: StartReplicationTaskMessage, callback: (err: AWSError, data: StartReplicationTaskResponse) -> Unit = definedExternally): Request<StartReplicationTaskResponse, AWSError>
    open fun startReplicationTask(callback: (err: AWSError, data: StartReplicationTaskResponse) -> Unit = definedExternally): Request<StartReplicationTaskResponse, AWSError>
    open fun startReplicationTaskAssessment(params: StartReplicationTaskAssessmentMessage, callback: (err: AWSError, data: StartReplicationTaskAssessmentResponse) -> Unit = definedExternally): Request<StartReplicationTaskAssessmentResponse, AWSError>
    open fun startReplicationTaskAssessment(callback: (err: AWSError, data: StartReplicationTaskAssessmentResponse) -> Unit = definedExternally): Request<StartReplicationTaskAssessmentResponse, AWSError>
    open fun stopReplicationTask(params: StopReplicationTaskMessage, callback: (err: AWSError, data: StopReplicationTaskResponse) -> Unit = definedExternally): Request<StopReplicationTaskResponse, AWSError>
    open fun stopReplicationTask(callback: (err: AWSError, data: StopReplicationTaskResponse) -> Unit = definedExternally): Request<StopReplicationTaskResponse, AWSError>
    open fun testConnection(params: TestConnectionMessage, callback: (err: AWSError, data: TestConnectionResponse) -> Unit = definedExternally): Request<TestConnectionResponse, AWSError>
    open fun testConnection(callback: (err: AWSError, data: TestConnectionResponse) -> Unit = definedExternally): Request<TestConnectionResponse, AWSError>
    open fun waitFor(state: String /* "testConnectionSucceeds" */, params: DescribeConnectionsMessage /* DMS.Types.DescribeConnectionsMessage & `T$0` */, callback: (err: AWSError, data: DescribeConnectionsResponse) -> Unit = definedExternally): Request<DescribeConnectionsResponse, AWSError>
    open fun waitFor(state: String /* "testConnectionSucceeds" */, callback: (err: AWSError, data: DescribeConnectionsResponse) -> Unit = definedExternally): Request<DescribeConnectionsResponse, AWSError>
    open fun waitFor(state: String /* "endpointDeleted" */, params: DescribeEndpointsMessage /* DMS.Types.DescribeEndpointsMessage & `T$0` */, callback: (err: AWSError, data: DescribeEndpointsResponse) -> Unit = definedExternally): Request<DescribeEndpointsResponse, AWSError>
    open fun waitFor(state: String /* "endpointDeleted" */, callback: (err: AWSError, data: DescribeEndpointsResponse) -> Unit = definedExternally): Request<DescribeEndpointsResponse, AWSError>
    open fun waitFor(state: String, params: DescribeReplicationInstancesMessage, callback: (err: AWSError, data: DescribeReplicationInstancesResponse) -> Unit = definedExternally): Request<DescribeReplicationInstancesResponse, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DescribeReplicationInstancesResponse) -> Unit = definedExternally): Request<DescribeReplicationInstancesResponse, AWSError>
    open fun waitFor(state: String, params: DescribeReplicationTasksMessage, callback: (err: AWSError, data: DescribeReplicationTasksResponse) -> Unit = definedExternally): Request<DescribeReplicationTasksResponse, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DescribeReplicationTasksResponse) -> Unit = definedExternally): Request<DescribeReplicationTasksResponse, AWSError>
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
    interface AddTagsToResourceMessage {
        var ResourceArn: String
        var Tags: TagList
    }
    interface AddTagsToResourceResponse
    interface ApplyPendingMaintenanceActionMessage {
        var ReplicationInstanceArn: String
        var ApplyAction: String
        var OptInType: String
    }
    interface ApplyPendingMaintenanceActionResponse {
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
        var CertificateCreationDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var CertificatePem: String?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateWallet: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var CertificateArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateOwner: String?
            get() = definedExternally
            set(value) = definedExternally
        var ValidFromDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var ValidToDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var SigningAlgorithm: String?
            get() = definedExternally
            set(value) = definedExternally
        var KeyLength: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Connection {
        var ReplicationInstanceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var LastFailureMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationInstanceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEndpointMessage {
        var EndpointIdentifier: String
        var EndpointType: String /* "source" | "target" | String */
        var EngineName: String
        var Username: String?
            get() = definedExternally
            set(value) = definedExternally
        var Password: SecretString?
            get() = definedExternally
            set(value) = definedExternally
        var ServerName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ExtraConnectionAttributes: String?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var SslMode: String /* "none" | "require" | "verify-ca" | "verify-full" | String */
        var ServiceAccessRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ExternalTableDefinition: String?
            get() = definedExternally
            set(value) = definedExternally
        var DynamoDbSettings: DynamoDbSettings?
            get() = definedExternally
            set(value) = definedExternally
        var S3Settings: S3Settings?
            get() = definedExternally
            set(value) = definedExternally
        var DmsTransferSettings: DmsTransferSettings?
            get() = definedExternally
            set(value) = definedExternally
        var MongoDbSettings: MongoDbSettings?
            get() = definedExternally
            set(value) = definedExternally
        var KinesisSettings: KinesisSettings?
            get() = definedExternally
            set(value) = definedExternally
        var KafkaSettings: KafkaSettings?
            get() = definedExternally
            set(value) = definedExternally
        var ElasticsearchSettings: ElasticsearchSettings?
            get() = definedExternally
            set(value) = definedExternally
        var RedshiftSettings: RedshiftSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEndpointResponse {
        var Endpoint: Endpoint?
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
    interface CreateEventSubscriptionResponse {
        var EventSubscription: EventSubscription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateReplicationInstanceMessage {
        var ReplicationInstanceIdentifier: String
        var AllocatedStorage: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationInstanceClass: String
        var VpcSecurityGroupIds: VpcSecurityGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationSubnetGroupIdentifier: String?
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
        var AutoMinorVersionUpgrade: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var PubliclyAccessible: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DnsNameServers: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateReplicationInstanceResponse {
        var ReplicationInstance: ReplicationInstance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateReplicationSubnetGroupMessage {
        var ReplicationSubnetGroupIdentifier: String
        var ReplicationSubnetGroupDescription: String
        var SubnetIds: SubnetIdentifierList
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateReplicationSubnetGroupResponse {
        var ReplicationSubnetGroup: ReplicationSubnetGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateReplicationTaskMessage {
        var ReplicationTaskIdentifier: String
        var SourceEndpointArn: String
        var TargetEndpointArn: String
        var ReplicationInstanceArn: String
        var MigrationType: String /* "full-load" | "cdc" | "full-load-and-cdc" | String */
        var TableMappings: String
        var ReplicationTaskSettings: String?
            get() = definedExternally
            set(value) = definedExternally
        var CdcStartTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var CdcStartPosition: String?
            get() = definedExternally
            set(value) = definedExternally
        var CdcStopPosition: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateReplicationTaskResponse {
        var ReplicationTask: ReplicationTask?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteCertificateMessage {
        var CertificateArn: String
    }
    interface DeleteCertificateResponse {
        var Certificate: Certificate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteConnectionMessage {
        var EndpointArn: String
        var ReplicationInstanceArn: String
    }
    interface DeleteConnectionResponse {
        var Connection: Connection?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteEndpointMessage {
        var EndpointArn: String
    }
    interface DeleteEndpointResponse {
        var Endpoint: Endpoint?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteEventSubscriptionMessage {
        var SubscriptionName: String
    }
    interface DeleteEventSubscriptionResponse {
        var EventSubscription: EventSubscription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteReplicationInstanceMessage {
        var ReplicationInstanceArn: String
    }
    interface DeleteReplicationInstanceResponse {
        var ReplicationInstance: ReplicationInstance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteReplicationSubnetGroupMessage {
        var ReplicationSubnetGroupIdentifier: String
    }
    interface DeleteReplicationSubnetGroupResponse
    interface DeleteReplicationTaskMessage {
        var ReplicationTaskArn: String
    }
    interface DeleteReplicationTaskResponse {
        var ReplicationTask: ReplicationTask?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAccountAttributesMessage
    interface DescribeAccountAttributesResponse {
        var AccountQuotas: AccountQuotaList?
            get() = definedExternally
            set(value) = definedExternally
        var UniqueAccountIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCertificatesMessage {
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
    interface DescribeCertificatesResponse {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var Certificates: CertificateList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConnectionsMessage {
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
    interface DescribeConnectionsResponse {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var Connections: ConnectionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEndpointTypesMessage {
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
    interface DescribeEndpointTypesResponse {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedEndpointTypes: SupportedEndpointTypeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEndpointsMessage {
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
    interface DescribeEndpointsResponse {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var Endpoints: EndpointList?
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
    interface DescribeEventCategoriesResponse {
        var EventCategoryGroupList: EventCategoryGroupList?
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
    interface DescribeEventSubscriptionsResponse {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var EventSubscriptionsList: EventSubscriptionsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventsMessage {
        var SourceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceType: String /* "replication-instance" | String */
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
    interface DescribeEventsResponse {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var Events: EventList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeOrderableReplicationInstancesMessage {
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeOrderableReplicationInstancesResponse {
        var OrderableReplicationInstances: OrderableReplicationInstanceList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePendingMaintenanceActionsMessage {
        var ReplicationInstanceArn: String?
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
    interface DescribePendingMaintenanceActionsResponse {
        var PendingMaintenanceActions: PendingMaintenanceActions?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRefreshSchemasStatusMessage {
        var EndpointArn: String
    }
    interface DescribeRefreshSchemasStatusResponse {
        var RefreshSchemasStatus: RefreshSchemasStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeReplicationInstanceTaskLogsMessage {
        var ReplicationInstanceArn: String
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeReplicationInstanceTaskLogsResponse {
        var ReplicationInstanceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationInstanceTaskLogs: ReplicationInstanceTaskLogsList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeReplicationInstancesMessage {
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
    interface DescribeReplicationInstancesResponse {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationInstances: ReplicationInstanceList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeReplicationSubnetGroupsMessage {
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
    interface DescribeReplicationSubnetGroupsResponse {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationSubnetGroups: ReplicationSubnetGroups?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeReplicationTaskAssessmentResultsMessage {
        var ReplicationTaskArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeReplicationTaskAssessmentResultsResponse {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var BucketName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationTaskAssessmentResults: ReplicationTaskAssessmentResultList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeReplicationTasksMessage {
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var WithoutSettings: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeReplicationTasksResponse {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationTasks: ReplicationTaskList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSchemasMessage {
        var EndpointArn: String
        var MaxRecords: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSchemasResponse {
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var Schemas: SchemaList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTableStatisticsMessage {
        var ReplicationTaskArn: String
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
    interface DescribeTableStatisticsResponse {
        var ReplicationTaskArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var TableStatistics: TableStatisticsList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DmsTransferSettings {
        var ServiceAccessRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var BucketName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DynamoDbSettings {
        var ServiceAccessRoleArn: String
    }
    interface ElasticsearchSettings {
        var ServiceAccessRoleArn: String
        var EndpointUri: String
        var FullLoadErrorPercentage: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorRetryDuration: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Endpoint {
        var EndpointIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointType: String /* "source" | "target" | String */
        var EngineName: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineDisplayName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Username: String?
            get() = definedExternally
            set(value) = definedExternally
        var ServerName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ExtraConnectionAttributes: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var SslMode: String /* "none" | "require" | "verify-ca" | "verify-full" | String */
        var ServiceAccessRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ExternalTableDefinition: String?
            get() = definedExternally
            set(value) = definedExternally
        var ExternalId: String?
            get() = definedExternally
            set(value) = definedExternally
        var DynamoDbSettings: DynamoDbSettings?
            get() = definedExternally
            set(value) = definedExternally
        var S3Settings: S3Settings?
            get() = definedExternally
            set(value) = definedExternally
        var DmsTransferSettings: DmsTransferSettings?
            get() = definedExternally
            set(value) = definedExternally
        var MongoDbSettings: MongoDbSettings?
            get() = definedExternally
            set(value) = definedExternally
        var KinesisSettings: KinesisSettings?
            get() = definedExternally
            set(value) = definedExternally
        var KafkaSettings: KafkaSettings?
            get() = definedExternally
            set(value) = definedExternally
        var ElasticsearchSettings: ElasticsearchSettings?
            get() = definedExternally
            set(value) = definedExternally
        var RedshiftSettings: RedshiftSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Event {
        var SourceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceType: String /* "replication-instance" | String */
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
        var EventCategories: EventCategoriesList?
            get() = definedExternally
            set(value) = definedExternally
        var Date: TStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventCategoryGroup {
        var SourceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var EventCategories: EventCategoriesList?
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
    }
    interface Filter {
        var Name: String
        var Values: FilterValueList
    }
    interface ImportCertificateMessage {
        var CertificateIdentifier: String
        var CertificatePem: String?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateWallet: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportCertificateResponse {
        var Certificate: Certificate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KafkaSettings {
        var Broker: String?
            get() = definedExternally
            set(value) = definedExternally
        var Topic: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KinesisSettings {
        var StreamArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var MessageFormat: String /* "json" | "json-unformatted" | String */
        var ServiceAccessRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeTransactionDetails: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var IncludePartitionValue: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var PartitionIncludeSchemaTable: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeTableAlterOperations: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeControlDetails: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceMessage {
        var ResourceArn: String
    }
    interface ListTagsForResourceResponse {
        var TagList: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyEndpointMessage {
        var EndpointArn: String
        var EndpointIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointType: String /* "source" | "target" | String */
        var EngineName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Username: String?
            get() = definedExternally
            set(value) = definedExternally
        var Password: SecretString?
            get() = definedExternally
            set(value) = definedExternally
        var ServerName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ExtraConnectionAttributes: String?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var SslMode: String /* "none" | "require" | "verify-ca" | "verify-full" | String */
        var ServiceAccessRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ExternalTableDefinition: String?
            get() = definedExternally
            set(value) = definedExternally
        var DynamoDbSettings: DynamoDbSettings?
            get() = definedExternally
            set(value) = definedExternally
        var S3Settings: S3Settings?
            get() = definedExternally
            set(value) = definedExternally
        var DmsTransferSettings: DmsTransferSettings?
            get() = definedExternally
            set(value) = definedExternally
        var MongoDbSettings: MongoDbSettings?
            get() = definedExternally
            set(value) = definedExternally
        var KinesisSettings: KinesisSettings?
            get() = definedExternally
            set(value) = definedExternally
        var KafkaSettings: KafkaSettings?
            get() = definedExternally
            set(value) = definedExternally
        var ElasticsearchSettings: ElasticsearchSettings?
            get() = definedExternally
            set(value) = definedExternally
        var RedshiftSettings: RedshiftSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyEndpointResponse {
        var Endpoint: Endpoint?
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
    interface ModifyEventSubscriptionResponse {
        var EventSubscription: EventSubscription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyReplicationInstanceMessage {
        var ReplicationInstanceArn: String
        var AllocatedStorage: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ApplyImmediately: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationInstanceClass: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpcSecurityGroupIds: VpcSecurityGroupIdList?
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
        var ReplicationInstanceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyReplicationInstanceResponse {
        var ReplicationInstance: ReplicationInstance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyReplicationSubnetGroupMessage {
        var ReplicationSubnetGroupIdentifier: String
        var ReplicationSubnetGroupDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: SubnetIdentifierList
    }
    interface ModifyReplicationSubnetGroupResponse {
        var ReplicationSubnetGroup: ReplicationSubnetGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyReplicationTaskMessage {
        var ReplicationTaskArn: String
        var ReplicationTaskIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var MigrationType: String /* "full-load" | "cdc" | "full-load-and-cdc" | String */
        var TableMappings: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationTaskSettings: String?
            get() = definedExternally
            set(value) = definedExternally
        var CdcStartTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var CdcStartPosition: String?
            get() = definedExternally
            set(value) = definedExternally
        var CdcStopPosition: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyReplicationTaskResponse {
        var ReplicationTask: ReplicationTask?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MongoDbSettings {
        var Username: String?
            get() = definedExternally
            set(value) = definedExternally
        var Password: SecretString?
            get() = definedExternally
            set(value) = definedExternally
        var ServerName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: String?
            get() = definedExternally
            set(value) = definedExternally
        var AuthType: String /* "no" | "password" | String */
        var AuthMechanism: String /* "default" | "mongodb_cr" | "scram_sha_1" | String */
        var NestingLevel: String /* "none" | "one" | String */
        var ExtractDocId: String?
            get() = definedExternally
            set(value) = definedExternally
        var DocsToInvestigate: String?
            get() = definedExternally
            set(value) = definedExternally
        var AuthSource: String?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrderableReplicationInstance {
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationInstanceClass: String?
            get() = definedExternally
            set(value) = definedExternally
        var StorageType: String?
            get() = definedExternally
            set(value) = definedExternally
        var MinAllocatedStorage: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var MaxAllocatedStorage: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultAllocatedStorage: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var IncludedAllocatedStorage: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZones: AvailabilityZonesList?
            get() = definedExternally
            set(value) = definedExternally
        var ReleaseStatus: String /* "beta" | String */
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
    interface RebootReplicationInstanceMessage {
        var ReplicationInstanceArn: String
        var ForceFailover: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RebootReplicationInstanceResponse {
        var ReplicationInstance: ReplicationInstance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RedshiftSettings {
        var AcceptAnyDate: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var AfterConnectScript: String?
            get() = definedExternally
            set(value) = definedExternally
        var BucketFolder: String?
            get() = definedExternally
            set(value) = definedExternally
        var BucketName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionTimeout: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DateFormat: String?
            get() = definedExternally
            set(value) = definedExternally
        var EmptyAsNull: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionMode: String /* "sse-s3" | "sse-kms" | String */
        var FileTransferUploadStreams: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var LoadTimeout: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MaxFileSize: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Password: SecretString?
            get() = definedExternally
            set(value) = definedExternally
        var Port: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var RemoveQuotes: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ReplaceInvalidChars: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplaceChars: String?
            get() = definedExternally
            set(value) = definedExternally
        var ServerName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceAccessRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ServerSideEncryptionKmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var TimeFormat: String?
            get() = definedExternally
            set(value) = definedExternally
        var TrimBlanks: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var TruncateColumns: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var Username: String?
            get() = definedExternally
            set(value) = definedExternally
        var WriteBufferSize: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RefreshSchemasMessage {
        var EndpointArn: String
        var ReplicationInstanceArn: String
    }
    interface RefreshSchemasResponse {
        var RefreshSchemasStatus: RefreshSchemasStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RefreshSchemasStatus {
        var EndpointArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationInstanceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "successful" | "failed" | "refreshing" | String */
        var LastRefreshDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastFailureMessage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReloadTablesMessage {
        var ReplicationTaskArn: String
        var TablesToReload: TableListToReload
        var ReloadOption: String /* "data-reload" | "validate-only" | String */
    }
    interface ReloadTablesResponse {
        var ReplicationTaskArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveTagsFromResourceMessage {
        var ResourceArn: String
        var TagKeys: KeyList
    }
    interface RemoveTagsFromResourceResponse
    interface ReplicationInstance {
        var ReplicationInstanceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationInstanceClass: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationInstanceStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var AllocatedStorage: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceCreateTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var VpcSecurityGroups: VpcSecurityGroupMembershipList?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationSubnetGroup: ReplicationSubnetGroup?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var PendingModifiedValues: ReplicationPendingModifiedValues?
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
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationInstanceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationInstancePublicIpAddress: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationInstancePrivateIpAddress: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationInstancePublicIpAddresses: ReplicationInstancePublicIpAddressList?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationInstancePrivateIpAddresses: ReplicationInstancePrivateIpAddressList?
            get() = definedExternally
            set(value) = definedExternally
        var PubliclyAccessible: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SecondaryAvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var FreeUntil: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var DnsNameServers: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplicationInstanceTaskLog {
        var ReplicationTaskName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationTaskArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationInstanceTaskLogSize: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplicationPendingModifiedValues {
        var ReplicationInstanceClass: String?
            get() = definedExternally
            set(value) = definedExternally
        var AllocatedStorage: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var MultiAZ: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplicationSubnetGroup {
        var ReplicationSubnetGroupIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationSubnetGroupDescription: String?
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
    }
    interface ReplicationTask {
        var ReplicationTaskIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceEndpointArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var TargetEndpointArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationInstanceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var MigrationType: String /* "full-load" | "cdc" | "full-load-and-cdc" | String */
        var TableMappings: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationTaskSettings: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var LastFailureMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var StopReason: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationTaskCreationDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationTaskStartDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var CdcStartPosition: String?
            get() = definedExternally
            set(value) = definedExternally
        var CdcStopPosition: String?
            get() = definedExternally
            set(value) = definedExternally
        var RecoveryCheckpoint: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationTaskArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationTaskStats: ReplicationTaskStats?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplicationTaskAssessmentResult {
        var ReplicationTaskIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationTaskArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationTaskLastAssessmentDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var AssessmentStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var AssessmentResultsFile: String?
            get() = definedExternally
            set(value) = definedExternally
        var AssessmentResults: String?
            get() = definedExternally
            set(value) = definedExternally
        var S3ObjectUrl: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplicationTaskStats {
        var FullLoadProgressPercent: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ElapsedTimeMillis: Long?
            get() = definedExternally
            set(value) = definedExternally
        var TablesLoaded: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var TablesLoading: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var TablesQueued: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var TablesErrored: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var FreshStartDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var StartDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var StopDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var FullLoadStartDate: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var FullLoadFinishDate: TStamp?
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
    interface S3Settings {
        var ServiceAccessRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ExternalTableDefinition: String?
            get() = definedExternally
            set(value) = definedExternally
        var CsvRowDelimiter: String?
            get() = definedExternally
            set(value) = definedExternally
        var CsvDelimiter: String?
            get() = definedExternally
            set(value) = definedExternally
        var BucketFolder: String?
            get() = definedExternally
            set(value) = definedExternally
        var BucketName: String?
            get() = definedExternally
            set(value) = definedExternally
        var CompressionType: String /* "none" | "gzip" | String */
        var EncryptionMode: String /* "sse-s3" | "sse-kms" | String */
        var ServerSideEncryptionKmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var DataFormat: String /* "csv" | "parquet" | String */
        var EncodingType: String /* "plain" | "plain-dictionary" | "rle-dictionary" | String */
        var DictPageSizeLimit: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var RowGroupLength: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var DataPageSize: IntegerOptional?
            get() = definedExternally
            set(value) = definedExternally
        var ParquetVersion: String /* "parquet-1-0" | "parquet-2-0" | String */
        var EnableStatistics: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeOpForFullLoad: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var CdcInsertsOnly: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var TimestampColumnName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ParquetTimestampInMillisecond: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var CdcInsertsAndUpdates: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartReplicationTaskAssessmentMessage {
        var ReplicationTaskArn: String
    }
    interface StartReplicationTaskAssessmentResponse {
        var ReplicationTask: ReplicationTask?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartReplicationTaskMessage {
        var ReplicationTaskArn: String
        var StartReplicationTaskType: String /* "start-replication" | "resume-processing" | "reload-target" | String */
        var CdcStartTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var CdcStartPosition: String?
            get() = definedExternally
            set(value) = definedExternally
        var CdcStopPosition: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartReplicationTaskResponse {
        var ReplicationTask: ReplicationTask?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopReplicationTaskMessage {
        var ReplicationTaskArn: String
    }
    interface StopReplicationTaskResponse {
        var ReplicationTask: ReplicationTask?
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
    interface SupportedEndpointType {
        var EngineName: String?
            get() = definedExternally
            set(value) = definedExternally
        var SupportsCDC: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointType: String /* "source" | "target" | String */
        var EngineDisplayName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TableStatistics {
        var SchemaName: String?
            get() = definedExternally
            set(value) = definedExternally
        var TableName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Inserts: Long?
            get() = definedExternally
            set(value) = definedExternally
        var Deletes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var Updates: Long?
            get() = definedExternally
            set(value) = definedExternally
        var Ddls: Long?
            get() = definedExternally
            set(value) = definedExternally
        var FullLoadRows: Long?
            get() = definedExternally
            set(value) = definedExternally
        var FullLoadCondtnlChkFailedRows: Long?
            get() = definedExternally
            set(value) = definedExternally
        var FullLoadErrorRows: Long?
            get() = definedExternally
            set(value) = definedExternally
        var FullLoadStartTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var FullLoadEndTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var FullLoadReloaded: BooleanOptional?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdateTime: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var TableState: String?
            get() = definedExternally
            set(value) = definedExternally
        var ValidationPendingRecords: Long?
            get() = definedExternally
            set(value) = definedExternally
        var ValidationFailedRecords: Long?
            get() = definedExternally
            set(value) = definedExternally
        var ValidationSuspendedRecords: Long?
            get() = definedExternally
            set(value) = definedExternally
        var ValidationState: String?
            get() = definedExternally
            set(value) = definedExternally
        var ValidationStateDetails: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TableToReload {
        var SchemaName: String?
            get() = definedExternally
            set(value) = definedExternally
        var TableName: String?
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
    interface TestConnectionMessage {
        var ReplicationInstanceArn: String
        var EndpointArn: String
    }
    interface TestConnectionResponse {
        var Connection: Connection?
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
        var apiVersion: String /* "2016-01-01" | "latest" | String */
    }
}