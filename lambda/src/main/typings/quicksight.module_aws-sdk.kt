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
import QuickSight.ActiveIAMPolicyAssignment
import QuickSight.CalculatedColumn
import QuickSight.ColumnGroupColumnSchema
import QuickSight.ColumnGroup
import QuickSight.ColumnGroupSchema
import QuickSight.ColumnSchema
import QuickSight.ColumnTag
import QuickSight.DashboardError
import QuickSight.DashboardSearchFilter
import QuickSight.DashboardSummary
import QuickSight.DashboardVersionSummary
import QuickSight.DataSetConfiguration
import QuickSight.DataSetReference
import QuickSight.DataSetSummary
import QuickSight.DataSource
import QuickSight.DateTimeParameter
import QuickSight.DecimalParameter
import QuickSight.Group
import QuickSight.GroupMember
import QuickSight.IAMPolicyAssignmentSummary
import QuickSight.Ingestion
import QuickSight.InputColumn
import QuickSight.IntegerParameter
import QuickSight.OutputColumn
import QuickSight.ResourcePermission
import QuickSight.StringParameter
import QuickSight.Tag
import QuickSight.TemplateAlias
import QuickSight.TemplateError
import QuickSight.TemplateSummary
import QuickSight.TemplateVersionSummary
import QuickSight.TransformOperation
import QuickSight.User
import QuickSight.CancelIngestionRequest
import QuickSight.CancelIngestionResponse
import QuickSight.CreateDashboardRequest
import QuickSight.CreateDashboardResponse
import QuickSight.CreateDataSetRequest
import QuickSight.CreateDataSetResponse
import QuickSight.CreateDataSourceRequest
import QuickSight.CreateDataSourceResponse
import QuickSight.CreateGroupRequest
import QuickSight.CreateGroupResponse
import QuickSight.CreateGroupMembershipRequest
import QuickSight.CreateGroupMembershipResponse
import QuickSight.CreateIAMPolicyAssignmentRequest
import QuickSight.CreateIAMPolicyAssignmentResponse
import QuickSight.CreateIngestionRequest
import QuickSight.CreateIngestionResponse
import QuickSight.CreateTemplateRequest
import QuickSight.CreateTemplateResponse
import QuickSight.CreateTemplateAliasRequest
import QuickSight.CreateTemplateAliasResponse
import QuickSight.DeleteDashboardRequest
import QuickSight.DeleteDashboardResponse
import QuickSight.DeleteDataSetRequest
import QuickSight.DeleteDataSetResponse
import QuickSight.DeleteDataSourceRequest
import QuickSight.DeleteDataSourceResponse
import QuickSight.DeleteGroupRequest
import QuickSight.DeleteGroupResponse
import QuickSight.DeleteGroupMembershipRequest
import QuickSight.DeleteGroupMembershipResponse
import QuickSight.DeleteIAMPolicyAssignmentRequest
import QuickSight.DeleteIAMPolicyAssignmentResponse
import QuickSight.DeleteTemplateRequest
import QuickSight.DeleteTemplateResponse
import QuickSight.DeleteTemplateAliasRequest
import QuickSight.DeleteTemplateAliasResponse
import QuickSight.DeleteUserRequest
import QuickSight.DeleteUserResponse
import QuickSight.DeleteUserByPrincipalIdRequest
import QuickSight.DeleteUserByPrincipalIdResponse
import QuickSight.DescribeDashboardRequest
import QuickSight.DescribeDashboardResponse
import QuickSight.DescribeDashboardPermissionsRequest
import QuickSight.DescribeDashboardPermissionsResponse
import QuickSight.DescribeDataSetRequest
import QuickSight.DescribeDataSetResponse
import QuickSight.DescribeDataSetPermissionsRequest
import QuickSight.DescribeDataSetPermissionsResponse
import QuickSight.DescribeDataSourceRequest
import QuickSight.DescribeDataSourceResponse
import QuickSight.DescribeDataSourcePermissionsRequest
import QuickSight.DescribeDataSourcePermissionsResponse
import QuickSight.DescribeGroupRequest
import QuickSight.DescribeGroupResponse
import QuickSight.DescribeIAMPolicyAssignmentRequest
import QuickSight.DescribeIAMPolicyAssignmentResponse
import QuickSight.DescribeIngestionRequest
import QuickSight.DescribeIngestionResponse
import QuickSight.DescribeTemplateRequest
import QuickSight.DescribeTemplateResponse
import QuickSight.DescribeTemplateAliasRequest
import QuickSight.DescribeTemplateAliasResponse
import QuickSight.DescribeTemplatePermissionsRequest
import QuickSight.DescribeTemplatePermissionsResponse
import QuickSight.DescribeUserRequest
import QuickSight.DescribeUserResponse
import QuickSight.GetDashboardEmbedUrlRequest
import QuickSight.GetDashboardEmbedUrlResponse
import QuickSight.ListDashboardVersionsRequest
import QuickSight.ListDashboardVersionsResponse
import QuickSight.ListDashboardsRequest
import QuickSight.ListDashboardsResponse
import QuickSight.ListDataSetsRequest
import QuickSight.ListDataSetsResponse
import QuickSight.ListDataSourcesRequest
import QuickSight.ListDataSourcesResponse
import QuickSight.ListGroupMembershipsRequest
import QuickSight.ListGroupMembershipsResponse
import QuickSight.ListGroupsRequest
import QuickSight.ListGroupsResponse
import QuickSight.ListIAMPolicyAssignmentsRequest
import QuickSight.ListIAMPolicyAssignmentsResponse
import QuickSight.ListIAMPolicyAssignmentsForUserRequest
import QuickSight.ListIAMPolicyAssignmentsForUserResponse
import QuickSight.ListIngestionsRequest
import QuickSight.ListIngestionsResponse
import QuickSight.ListTagsForResourceRequest
import QuickSight.ListTagsForResourceResponse
import QuickSight.ListTemplateAliasesRequest
import QuickSight.ListTemplateAliasesResponse
import QuickSight.ListTemplateVersionsRequest
import QuickSight.ListTemplateVersionsResponse
import QuickSight.ListTemplatesRequest
import QuickSight.ListTemplatesResponse
import QuickSight.ListUserGroupsRequest
import QuickSight.ListUserGroupsResponse
import QuickSight.ListUsersRequest
import QuickSight.ListUsersResponse
import QuickSight.RegisterUserRequest
import QuickSight.RegisterUserResponse
import QuickSight.SearchDashboardsRequest
import QuickSight.SearchDashboardsResponse
import QuickSight.TagResourceRequest
import QuickSight.TagResourceResponse
import QuickSight.UntagResourceRequest
import QuickSight.UntagResourceResponse
import QuickSight.UpdateDashboardRequest
import QuickSight.UpdateDashboardResponse
import QuickSight.UpdateDashboardPermissionsRequest
import QuickSight.UpdateDashboardPermissionsResponse
import QuickSight.UpdateDashboardPublishedVersionRequest
import QuickSight.UpdateDashboardPublishedVersionResponse
import QuickSight.UpdateDataSetRequest
import QuickSight.UpdateDataSetResponse
import QuickSight.UpdateDataSetPermissionsRequest
import QuickSight.UpdateDataSetPermissionsResponse
import QuickSight.UpdateDataSourceRequest
import QuickSight.UpdateDataSourceResponse
import QuickSight.UpdateDataSourcePermissionsRequest
import QuickSight.UpdateDataSourcePermissionsResponse
import QuickSight.UpdateGroupRequest
import QuickSight.UpdateGroupResponse
import QuickSight.UpdateIAMPolicyAssignmentRequest
import QuickSight.UpdateIAMPolicyAssignmentResponse
import QuickSight.UpdateTemplateRequest
import QuickSight.UpdateTemplateResponse
import QuickSight.UpdateTemplateAliasRequest
import QuickSight.UpdateTemplateAliasResponse
import QuickSight.UpdateTemplatePermissionsRequest
import QuickSight.UpdateTemplatePermissionsResponse
import QuickSight.UpdateUserRequest
import QuickSight.UpdateUserResponse
import QuickSight.GeoSpatialColumnGroup
import QuickSight.Parameters
import QuickSight.DashboardSourceEntity
import QuickSight.DashboardPublishOptions
import QuickSight.PhysicalTableMap
import QuickSight.LogicalTableMap
import QuickSight.RowLevelPermissionDataSet
import QuickSight.DataSourceParameters
import QuickSight.DataSourceCredentials
import QuickSight.VpcConnectionProperties
import QuickSight.SslProperties
import QuickSight.IdentityMap
import QuickSight.TemplateSourceEntity
import QuickSight.DashboardVersion
import QuickSight.AdHocFilteringOption
import QuickSight.ExportToCSVOption
import QuickSight.SheetControlsOption
import QuickSight.DashboardSourceTemplate
import QuickSight.DataSetSchema
import QuickSight.DataSourceErrorInfo
import QuickSight.CredentialPair
import QuickSight.AmazonElasticsearchParameters
import QuickSight.AthenaParameters
import QuickSight.AuroraParameters
import QuickSight.AuroraPostgreSqlParameters
import QuickSight.AwsIotAnalyticsParameters
import QuickSight.JiraParameters
import QuickSight.MariaDbParameters
import QuickSight.MySqlParameters
import QuickSight.PostgreSqlParameters
import QuickSight.PrestoParameters
import QuickSight.RdsParameters
import QuickSight.RedshiftParameters
import QuickSight.S3Parameters
import QuickSight.ServiceNowParameters
import QuickSight.SnowflakeParameters
import QuickSight.SparkParameters
import QuickSight.SqlServerParameters
import QuickSight.TeradataParameters
import QuickSight.TwitterParameters
import QuickSight.Dashboard
import QuickSight.DataSet
import QuickSight.IAMPolicyAssignment
import QuickSight.Template
import QuickSight.ErrorInfo
import QuickSight.RowInfo
import QuickSight.QueueInfo
import QuickSight.LogicalTableSource
import QuickSight.LogicalTable
import QuickSight.JoinInstruction
import QuickSight.RelationalTable
import QuickSight.CustomSql
import QuickSight.S3Source
import QuickSight.PhysicalTable
import QuickSight.ManifestFileLocation
import QuickSight.UploadSettings
import QuickSight.TemplateVersion
import QuickSight.TemplateSourceAnalysis
import QuickSight.TemplateSourceTemplate
import QuickSight.ProjectOperation
import QuickSight.FilterOperation
import QuickSight.CreateColumnsOperation
import QuickSight.RenameColumnOperation
import QuickSight.CastColumnTypeOperation
import QuickSight.TagColumnOperation

typealias ActionList = Array<String>

typealias ActiveIAMPolicyAssignmentList = Array<ActiveIAMPolicyAssignment>

typealias AliasName = String

typealias Arn = String

typealias AwsAccountId = String

typealias Boolean = Boolean

typealias CalculatedColumnList = Array<CalculatedColumn>

typealias Catalog = String

typealias ClusterId = String

typealias ColumnGroupColumnSchemaList = Array<ColumnGroupColumnSchema>

typealias ColumnGroupList = Array<ColumnGroup>

typealias ColumnGroupName = String

typealias ColumnGroupSchemaList = Array<ColumnGroupSchema>

typealias ColumnId = String

typealias ColumnList = Array<ColumnName>

typealias ColumnName = String

typealias ColumnSchemaList = Array<ColumnSchema>

typealias ColumnTagList = Array<ColumnTag>

typealias CustomSqlName = String

typealias DashboardErrorList = Array<DashboardError>

typealias DashboardName = String

typealias DashboardSearchFilterList = Array<DashboardSearchFilter>

typealias DashboardSummaryList = Array<DashboardSummary>

typealias DashboardVersionSummaryList = Array<DashboardVersionSummary>

typealias DataSetConfigurationList = Array<DataSetConfiguration>

typealias DataSetName = String

typealias DataSetReferenceList = Array<DataSetReference>

typealias DataSetSummaryList = Array<DataSetSummary>

typealias DataSourceList = Array<DataSource>

typealias Database = String

typealias DateTimeParameterList = Array<DateTimeParameter>

typealias DecimalParameterList = Array<DecimalParameter>

typealias Delimiter = String

typealias Domain = String

typealias Double = Number

typealias DoubleList = Array<Double>

typealias EmbeddingUrl = String

typealias Expression = String

typealias GroupDescription = String

typealias GroupList = Array<Group>

typealias GroupMemberList = Array<GroupMember>

typealias GroupMemberName = String

typealias GroupName = String

typealias Host = String

typealias IAMPolicyAssignmentName = String

typealias IAMPolicyAssignmentSummaryList = Array<IAMPolicyAssignmentSummary>

typealias IdentityName = String

typealias IdentityNameList = Array<IdentityName>

typealias IngestionId = String

typealias IngestionMaxResults = Number

typealias Ingestions = Array<Ingestion>

typealias InputColumnList = Array<InputColumn>

typealias InstanceId = String

typealias IntegerParameterList = Array<IntegerParameter>

typealias LogicalTableAlias = String

typealias LogicalTableId = String

typealias Long = Number

typealias LongList = Array<Long>

typealias MaxResults = Number

typealias Namespace = String

typealias NonEmptyString = String

typealias OnClause = String

typealias OptionalPort = Number

typealias OutputColumnList = Array<OutputColumn>

typealias Password = String

typealias PhysicalTableId = String

typealias Port = Number

typealias PositiveInteger = Number

typealias Principal = String

typealias ProjectedColumnList = Array<String>

typealias Query = String

typealias RelationalTableName = String

typealias RelationalTableSchema = String

typealias ResourceId = String

typealias ResourceName = String

typealias ResourcePermissionList = Array<ResourcePermission>

typealias RestrictiveResourceId = String

typealias RoleSessionName = String

typealias S3Bucket = String

typealias S3Key = String

typealias SessionLifetimeInMinutes = Number

typealias SiteBaseUrl = String

typealias SqlQuery = String

typealias StatusCode = Number

typealias String = String

typealias StringList = Array<String>

typealias StringParameterList = Array<StringParameter>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TemplateAliasList = Array<TemplateAlias>

typealias TemplateErrorList = Array<TemplateError>

typealias TemplateName = String

typealias TemplateSummaryList = Array<TemplateSummary>

typealias TemplateVersionSummaryList = Array<TemplateVersionSummary>

typealias Timestamp = Date

typealias TimestampList = Array<Timestamp>

typealias TransformOperationList = Array<TransformOperation>

typealias TypeCastFormat = String

typealias UpdateResourcePermissionList = Array<ResourcePermission>

typealias UserList = Array<User>

typealias UserName = String

typealias Username = String

typealias VersionDescription = String

typealias VersionNumber = Number

typealias Warehouse = String

typealias WorkGroup = String

typealias long = Number

typealias timestamp = Date

@JsModule("aws-sdk")
external open class QuickSight(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & QuickSight.Types.ClientConfiguration */
    open fun cancelIngestion(params: CancelIngestionRequest, callback: (err: AWSError, data: CancelIngestionResponse) -> Unit = definedExternally): Request<CancelIngestionResponse, AWSError>
    open fun cancelIngestion(callback: (err: AWSError, data: CancelIngestionResponse) -> Unit = definedExternally): Request<CancelIngestionResponse, AWSError>
    open fun createDashboard(params: CreateDashboardRequest, callback: (err: AWSError, data: CreateDashboardResponse) -> Unit = definedExternally): Request<CreateDashboardResponse, AWSError>
    open fun createDashboard(callback: (err: AWSError, data: CreateDashboardResponse) -> Unit = definedExternally): Request<CreateDashboardResponse, AWSError>
    open fun createDataSet(params: CreateDataSetRequest, callback: (err: AWSError, data: CreateDataSetResponse) -> Unit = definedExternally): Request<CreateDataSetResponse, AWSError>
    open fun createDataSet(callback: (err: AWSError, data: CreateDataSetResponse) -> Unit = definedExternally): Request<CreateDataSetResponse, AWSError>
    open fun createDataSource(params: CreateDataSourceRequest, callback: (err: AWSError, data: CreateDataSourceResponse) -> Unit = definedExternally): Request<CreateDataSourceResponse, AWSError>
    open fun createDataSource(callback: (err: AWSError, data: CreateDataSourceResponse) -> Unit = definedExternally): Request<CreateDataSourceResponse, AWSError>
    open fun createGroup(params: CreateGroupRequest, callback: (err: AWSError, data: CreateGroupResponse) -> Unit = definedExternally): Request<CreateGroupResponse, AWSError>
    open fun createGroup(callback: (err: AWSError, data: CreateGroupResponse) -> Unit = definedExternally): Request<CreateGroupResponse, AWSError>
    open fun createGroupMembership(params: CreateGroupMembershipRequest, callback: (err: AWSError, data: CreateGroupMembershipResponse) -> Unit = definedExternally): Request<CreateGroupMembershipResponse, AWSError>
    open fun createGroupMembership(callback: (err: AWSError, data: CreateGroupMembershipResponse) -> Unit = definedExternally): Request<CreateGroupMembershipResponse, AWSError>
    open fun createIAMPolicyAssignment(params: CreateIAMPolicyAssignmentRequest, callback: (err: AWSError, data: CreateIAMPolicyAssignmentResponse) -> Unit = definedExternally): Request<CreateIAMPolicyAssignmentResponse, AWSError>
    open fun createIAMPolicyAssignment(callback: (err: AWSError, data: CreateIAMPolicyAssignmentResponse) -> Unit = definedExternally): Request<CreateIAMPolicyAssignmentResponse, AWSError>
    open fun createIngestion(params: CreateIngestionRequest, callback: (err: AWSError, data: CreateIngestionResponse) -> Unit = definedExternally): Request<CreateIngestionResponse, AWSError>
    open fun createIngestion(callback: (err: AWSError, data: CreateIngestionResponse) -> Unit = definedExternally): Request<CreateIngestionResponse, AWSError>
    open fun createTemplate(params: CreateTemplateRequest, callback: (err: AWSError, data: CreateTemplateResponse) -> Unit = definedExternally): Request<CreateTemplateResponse, AWSError>
    open fun createTemplate(callback: (err: AWSError, data: CreateTemplateResponse) -> Unit = definedExternally): Request<CreateTemplateResponse, AWSError>
    open fun createTemplateAlias(params: CreateTemplateAliasRequest, callback: (err: AWSError, data: CreateTemplateAliasResponse) -> Unit = definedExternally): Request<CreateTemplateAliasResponse, AWSError>
    open fun createTemplateAlias(callback: (err: AWSError, data: CreateTemplateAliasResponse) -> Unit = definedExternally): Request<CreateTemplateAliasResponse, AWSError>
    open fun deleteDashboard(params: DeleteDashboardRequest, callback: (err: AWSError, data: DeleteDashboardResponse) -> Unit = definedExternally): Request<DeleteDashboardResponse, AWSError>
    open fun deleteDashboard(callback: (err: AWSError, data: DeleteDashboardResponse) -> Unit = definedExternally): Request<DeleteDashboardResponse, AWSError>
    open fun deleteDataSet(params: DeleteDataSetRequest, callback: (err: AWSError, data: DeleteDataSetResponse) -> Unit = definedExternally): Request<DeleteDataSetResponse, AWSError>
    open fun deleteDataSet(callback: (err: AWSError, data: DeleteDataSetResponse) -> Unit = definedExternally): Request<DeleteDataSetResponse, AWSError>
    open fun deleteDataSource(params: DeleteDataSourceRequest, callback: (err: AWSError, data: DeleteDataSourceResponse) -> Unit = definedExternally): Request<DeleteDataSourceResponse, AWSError>
    open fun deleteDataSource(callback: (err: AWSError, data: DeleteDataSourceResponse) -> Unit = definedExternally): Request<DeleteDataSourceResponse, AWSError>
    open fun deleteGroup(params: DeleteGroupRequest, callback: (err: AWSError, data: DeleteGroupResponse) -> Unit = definedExternally): Request<DeleteGroupResponse, AWSError>
    open fun deleteGroup(callback: (err: AWSError, data: DeleteGroupResponse) -> Unit = definedExternally): Request<DeleteGroupResponse, AWSError>
    open fun deleteGroupMembership(params: DeleteGroupMembershipRequest, callback: (err: AWSError, data: DeleteGroupMembershipResponse) -> Unit = definedExternally): Request<DeleteGroupMembershipResponse, AWSError>
    open fun deleteGroupMembership(callback: (err: AWSError, data: DeleteGroupMembershipResponse) -> Unit = definedExternally): Request<DeleteGroupMembershipResponse, AWSError>
    open fun deleteIAMPolicyAssignment(params: DeleteIAMPolicyAssignmentRequest, callback: (err: AWSError, data: DeleteIAMPolicyAssignmentResponse) -> Unit = definedExternally): Request<DeleteIAMPolicyAssignmentResponse, AWSError>
    open fun deleteIAMPolicyAssignment(callback: (err: AWSError, data: DeleteIAMPolicyAssignmentResponse) -> Unit = definedExternally): Request<DeleteIAMPolicyAssignmentResponse, AWSError>
    open fun deleteTemplate(params: DeleteTemplateRequest, callback: (err: AWSError, data: DeleteTemplateResponse) -> Unit = definedExternally): Request<DeleteTemplateResponse, AWSError>
    open fun deleteTemplate(callback: (err: AWSError, data: DeleteTemplateResponse) -> Unit = definedExternally): Request<DeleteTemplateResponse, AWSError>
    open fun deleteTemplateAlias(params: DeleteTemplateAliasRequest, callback: (err: AWSError, data: DeleteTemplateAliasResponse) -> Unit = definedExternally): Request<DeleteTemplateAliasResponse, AWSError>
    open fun deleteTemplateAlias(callback: (err: AWSError, data: DeleteTemplateAliasResponse) -> Unit = definedExternally): Request<DeleteTemplateAliasResponse, AWSError>
    open fun deleteUser(params: DeleteUserRequest, callback: (err: AWSError, data: DeleteUserResponse) -> Unit = definedExternally): Request<DeleteUserResponse, AWSError>
    open fun deleteUser(callback: (err: AWSError, data: DeleteUserResponse) -> Unit = definedExternally): Request<DeleteUserResponse, AWSError>
    open fun deleteUserByPrincipalId(params: DeleteUserByPrincipalIdRequest, callback: (err: AWSError, data: DeleteUserByPrincipalIdResponse) -> Unit = definedExternally): Request<DeleteUserByPrincipalIdResponse, AWSError>
    open fun deleteUserByPrincipalId(callback: (err: AWSError, data: DeleteUserByPrincipalIdResponse) -> Unit = definedExternally): Request<DeleteUserByPrincipalIdResponse, AWSError>
    open fun describeDashboard(params: DescribeDashboardRequest, callback: (err: AWSError, data: DescribeDashboardResponse) -> Unit = definedExternally): Request<DescribeDashboardResponse, AWSError>
    open fun describeDashboard(callback: (err: AWSError, data: DescribeDashboardResponse) -> Unit = definedExternally): Request<DescribeDashboardResponse, AWSError>
    open fun describeDashboardPermissions(params: DescribeDashboardPermissionsRequest, callback: (err: AWSError, data: DescribeDashboardPermissionsResponse) -> Unit = definedExternally): Request<DescribeDashboardPermissionsResponse, AWSError>
    open fun describeDashboardPermissions(callback: (err: AWSError, data: DescribeDashboardPermissionsResponse) -> Unit = definedExternally): Request<DescribeDashboardPermissionsResponse, AWSError>
    open fun describeDataSet(params: DescribeDataSetRequest, callback: (err: AWSError, data: DescribeDataSetResponse) -> Unit = definedExternally): Request<DescribeDataSetResponse, AWSError>
    open fun describeDataSet(callback: (err: AWSError, data: DescribeDataSetResponse) -> Unit = definedExternally): Request<DescribeDataSetResponse, AWSError>
    open fun describeDataSetPermissions(params: DescribeDataSetPermissionsRequest, callback: (err: AWSError, data: DescribeDataSetPermissionsResponse) -> Unit = definedExternally): Request<DescribeDataSetPermissionsResponse, AWSError>
    open fun describeDataSetPermissions(callback: (err: AWSError, data: DescribeDataSetPermissionsResponse) -> Unit = definedExternally): Request<DescribeDataSetPermissionsResponse, AWSError>
    open fun describeDataSource(params: DescribeDataSourceRequest, callback: (err: AWSError, data: DescribeDataSourceResponse) -> Unit = definedExternally): Request<DescribeDataSourceResponse, AWSError>
    open fun describeDataSource(callback: (err: AWSError, data: DescribeDataSourceResponse) -> Unit = definedExternally): Request<DescribeDataSourceResponse, AWSError>
    open fun describeDataSourcePermissions(params: DescribeDataSourcePermissionsRequest, callback: (err: AWSError, data: DescribeDataSourcePermissionsResponse) -> Unit = definedExternally): Request<DescribeDataSourcePermissionsResponse, AWSError>
    open fun describeDataSourcePermissions(callback: (err: AWSError, data: DescribeDataSourcePermissionsResponse) -> Unit = definedExternally): Request<DescribeDataSourcePermissionsResponse, AWSError>
    open fun describeGroup(params: DescribeGroupRequest, callback: (err: AWSError, data: DescribeGroupResponse) -> Unit = definedExternally): Request<DescribeGroupResponse, AWSError>
    open fun describeGroup(callback: (err: AWSError, data: DescribeGroupResponse) -> Unit = definedExternally): Request<DescribeGroupResponse, AWSError>
    open fun describeIAMPolicyAssignment(params: DescribeIAMPolicyAssignmentRequest, callback: (err: AWSError, data: DescribeIAMPolicyAssignmentResponse) -> Unit = definedExternally): Request<DescribeIAMPolicyAssignmentResponse, AWSError>
    open fun describeIAMPolicyAssignment(callback: (err: AWSError, data: DescribeIAMPolicyAssignmentResponse) -> Unit = definedExternally): Request<DescribeIAMPolicyAssignmentResponse, AWSError>
    open fun describeIngestion(params: DescribeIngestionRequest, callback: (err: AWSError, data: DescribeIngestionResponse) -> Unit = definedExternally): Request<DescribeIngestionResponse, AWSError>
    open fun describeIngestion(callback: (err: AWSError, data: DescribeIngestionResponse) -> Unit = definedExternally): Request<DescribeIngestionResponse, AWSError>
    open fun describeTemplate(params: DescribeTemplateRequest, callback: (err: AWSError, data: DescribeTemplateResponse) -> Unit = definedExternally): Request<DescribeTemplateResponse, AWSError>
    open fun describeTemplate(callback: (err: AWSError, data: DescribeTemplateResponse) -> Unit = definedExternally): Request<DescribeTemplateResponse, AWSError>
    open fun describeTemplateAlias(params: DescribeTemplateAliasRequest, callback: (err: AWSError, data: DescribeTemplateAliasResponse) -> Unit = definedExternally): Request<DescribeTemplateAliasResponse, AWSError>
    open fun describeTemplateAlias(callback: (err: AWSError, data: DescribeTemplateAliasResponse) -> Unit = definedExternally): Request<DescribeTemplateAliasResponse, AWSError>
    open fun describeTemplatePermissions(params: DescribeTemplatePermissionsRequest, callback: (err: AWSError, data: DescribeTemplatePermissionsResponse) -> Unit = definedExternally): Request<DescribeTemplatePermissionsResponse, AWSError>
    open fun describeTemplatePermissions(callback: (err: AWSError, data: DescribeTemplatePermissionsResponse) -> Unit = definedExternally): Request<DescribeTemplatePermissionsResponse, AWSError>
    open fun describeUser(params: DescribeUserRequest, callback: (err: AWSError, data: DescribeUserResponse) -> Unit = definedExternally): Request<DescribeUserResponse, AWSError>
    open fun describeUser(callback: (err: AWSError, data: DescribeUserResponse) -> Unit = definedExternally): Request<DescribeUserResponse, AWSError>
    open fun getDashboardEmbedUrl(params: GetDashboardEmbedUrlRequest, callback: (err: AWSError, data: GetDashboardEmbedUrlResponse) -> Unit = definedExternally): Request<GetDashboardEmbedUrlResponse, AWSError>
    open fun getDashboardEmbedUrl(callback: (err: AWSError, data: GetDashboardEmbedUrlResponse) -> Unit = definedExternally): Request<GetDashboardEmbedUrlResponse, AWSError>
    open fun listDashboardVersions(params: ListDashboardVersionsRequest, callback: (err: AWSError, data: ListDashboardVersionsResponse) -> Unit = definedExternally): Request<ListDashboardVersionsResponse, AWSError>
    open fun listDashboardVersions(callback: (err: AWSError, data: ListDashboardVersionsResponse) -> Unit = definedExternally): Request<ListDashboardVersionsResponse, AWSError>
    open fun listDashboards(params: ListDashboardsRequest, callback: (err: AWSError, data: ListDashboardsResponse) -> Unit = definedExternally): Request<ListDashboardsResponse, AWSError>
    open fun listDashboards(callback: (err: AWSError, data: ListDashboardsResponse) -> Unit = definedExternally): Request<ListDashboardsResponse, AWSError>
    open fun listDataSets(params: ListDataSetsRequest, callback: (err: AWSError, data: ListDataSetsResponse) -> Unit = definedExternally): Request<ListDataSetsResponse, AWSError>
    open fun listDataSets(callback: (err: AWSError, data: ListDataSetsResponse) -> Unit = definedExternally): Request<ListDataSetsResponse, AWSError>
    open fun listDataSources(params: ListDataSourcesRequest, callback: (err: AWSError, data: ListDataSourcesResponse) -> Unit = definedExternally): Request<ListDataSourcesResponse, AWSError>
    open fun listDataSources(callback: (err: AWSError, data: ListDataSourcesResponse) -> Unit = definedExternally): Request<ListDataSourcesResponse, AWSError>
    open fun listGroupMemberships(params: ListGroupMembershipsRequest, callback: (err: AWSError, data: ListGroupMembershipsResponse) -> Unit = definedExternally): Request<ListGroupMembershipsResponse, AWSError>
    open fun listGroupMemberships(callback: (err: AWSError, data: ListGroupMembershipsResponse) -> Unit = definedExternally): Request<ListGroupMembershipsResponse, AWSError>
    open fun listGroups(params: ListGroupsRequest, callback: (err: AWSError, data: ListGroupsResponse) -> Unit = definedExternally): Request<ListGroupsResponse, AWSError>
    open fun listGroups(callback: (err: AWSError, data: ListGroupsResponse) -> Unit = definedExternally): Request<ListGroupsResponse, AWSError>
    open fun listIAMPolicyAssignments(params: ListIAMPolicyAssignmentsRequest, callback: (err: AWSError, data: ListIAMPolicyAssignmentsResponse) -> Unit = definedExternally): Request<ListIAMPolicyAssignmentsResponse, AWSError>
    open fun listIAMPolicyAssignments(callback: (err: AWSError, data: ListIAMPolicyAssignmentsResponse) -> Unit = definedExternally): Request<ListIAMPolicyAssignmentsResponse, AWSError>
    open fun listIAMPolicyAssignmentsForUser(params: ListIAMPolicyAssignmentsForUserRequest, callback: (err: AWSError, data: ListIAMPolicyAssignmentsForUserResponse) -> Unit = definedExternally): Request<ListIAMPolicyAssignmentsForUserResponse, AWSError>
    open fun listIAMPolicyAssignmentsForUser(callback: (err: AWSError, data: ListIAMPolicyAssignmentsForUserResponse) -> Unit = definedExternally): Request<ListIAMPolicyAssignmentsForUserResponse, AWSError>
    open fun listIngestions(params: ListIngestionsRequest, callback: (err: AWSError, data: ListIngestionsResponse) -> Unit = definedExternally): Request<ListIngestionsResponse, AWSError>
    open fun listIngestions(callback: (err: AWSError, data: ListIngestionsResponse) -> Unit = definedExternally): Request<ListIngestionsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTemplateAliases(params: ListTemplateAliasesRequest, callback: (err: AWSError, data: ListTemplateAliasesResponse) -> Unit = definedExternally): Request<ListTemplateAliasesResponse, AWSError>
    open fun listTemplateAliases(callback: (err: AWSError, data: ListTemplateAliasesResponse) -> Unit = definedExternally): Request<ListTemplateAliasesResponse, AWSError>
    open fun listTemplateVersions(params: ListTemplateVersionsRequest, callback: (err: AWSError, data: ListTemplateVersionsResponse) -> Unit = definedExternally): Request<ListTemplateVersionsResponse, AWSError>
    open fun listTemplateVersions(callback: (err: AWSError, data: ListTemplateVersionsResponse) -> Unit = definedExternally): Request<ListTemplateVersionsResponse, AWSError>
    open fun listTemplates(params: ListTemplatesRequest, callback: (err: AWSError, data: ListTemplatesResponse) -> Unit = definedExternally): Request<ListTemplatesResponse, AWSError>
    open fun listTemplates(callback: (err: AWSError, data: ListTemplatesResponse) -> Unit = definedExternally): Request<ListTemplatesResponse, AWSError>
    open fun listUserGroups(params: ListUserGroupsRequest, callback: (err: AWSError, data: ListUserGroupsResponse) -> Unit = definedExternally): Request<ListUserGroupsResponse, AWSError>
    open fun listUserGroups(callback: (err: AWSError, data: ListUserGroupsResponse) -> Unit = definedExternally): Request<ListUserGroupsResponse, AWSError>
    open fun listUsers(params: ListUsersRequest, callback: (err: AWSError, data: ListUsersResponse) -> Unit = definedExternally): Request<ListUsersResponse, AWSError>
    open fun listUsers(callback: (err: AWSError, data: ListUsersResponse) -> Unit = definedExternally): Request<ListUsersResponse, AWSError>
    open fun registerUser(params: RegisterUserRequest, callback: (err: AWSError, data: RegisterUserResponse) -> Unit = definedExternally): Request<RegisterUserResponse, AWSError>
    open fun registerUser(callback: (err: AWSError, data: RegisterUserResponse) -> Unit = definedExternally): Request<RegisterUserResponse, AWSError>
    open fun searchDashboards(params: SearchDashboardsRequest, callback: (err: AWSError, data: SearchDashboardsResponse) -> Unit = definedExternally): Request<SearchDashboardsResponse, AWSError>
    open fun searchDashboards(callback: (err: AWSError, data: SearchDashboardsResponse) -> Unit = definedExternally): Request<SearchDashboardsResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateDashboard(params: UpdateDashboardRequest, callback: (err: AWSError, data: UpdateDashboardResponse) -> Unit = definedExternally): Request<UpdateDashboardResponse, AWSError>
    open fun updateDashboard(callback: (err: AWSError, data: UpdateDashboardResponse) -> Unit = definedExternally): Request<UpdateDashboardResponse, AWSError>
    open fun updateDashboardPermissions(params: UpdateDashboardPermissionsRequest, callback: (err: AWSError, data: UpdateDashboardPermissionsResponse) -> Unit = definedExternally): Request<UpdateDashboardPermissionsResponse, AWSError>
    open fun updateDashboardPermissions(callback: (err: AWSError, data: UpdateDashboardPermissionsResponse) -> Unit = definedExternally): Request<UpdateDashboardPermissionsResponse, AWSError>
    open fun updateDashboardPublishedVersion(params: UpdateDashboardPublishedVersionRequest, callback: (err: AWSError, data: UpdateDashboardPublishedVersionResponse) -> Unit = definedExternally): Request<UpdateDashboardPublishedVersionResponse, AWSError>
    open fun updateDashboardPublishedVersion(callback: (err: AWSError, data: UpdateDashboardPublishedVersionResponse) -> Unit = definedExternally): Request<UpdateDashboardPublishedVersionResponse, AWSError>
    open fun updateDataSet(params: UpdateDataSetRequest, callback: (err: AWSError, data: UpdateDataSetResponse) -> Unit = definedExternally): Request<UpdateDataSetResponse, AWSError>
    open fun updateDataSet(callback: (err: AWSError, data: UpdateDataSetResponse) -> Unit = definedExternally): Request<UpdateDataSetResponse, AWSError>
    open fun updateDataSetPermissions(params: UpdateDataSetPermissionsRequest, callback: (err: AWSError, data: UpdateDataSetPermissionsResponse) -> Unit = definedExternally): Request<UpdateDataSetPermissionsResponse, AWSError>
    open fun updateDataSetPermissions(callback: (err: AWSError, data: UpdateDataSetPermissionsResponse) -> Unit = definedExternally): Request<UpdateDataSetPermissionsResponse, AWSError>
    open fun updateDataSource(params: UpdateDataSourceRequest, callback: (err: AWSError, data: UpdateDataSourceResponse) -> Unit = definedExternally): Request<UpdateDataSourceResponse, AWSError>
    open fun updateDataSource(callback: (err: AWSError, data: UpdateDataSourceResponse) -> Unit = definedExternally): Request<UpdateDataSourceResponse, AWSError>
    open fun updateDataSourcePermissions(params: UpdateDataSourcePermissionsRequest, callback: (err: AWSError, data: UpdateDataSourcePermissionsResponse) -> Unit = definedExternally): Request<UpdateDataSourcePermissionsResponse, AWSError>
    open fun updateDataSourcePermissions(callback: (err: AWSError, data: UpdateDataSourcePermissionsResponse) -> Unit = definedExternally): Request<UpdateDataSourcePermissionsResponse, AWSError>
    open fun updateGroup(params: UpdateGroupRequest, callback: (err: AWSError, data: UpdateGroupResponse) -> Unit = definedExternally): Request<UpdateGroupResponse, AWSError>
    open fun updateGroup(callback: (err: AWSError, data: UpdateGroupResponse) -> Unit = definedExternally): Request<UpdateGroupResponse, AWSError>
    open fun updateIAMPolicyAssignment(params: UpdateIAMPolicyAssignmentRequest, callback: (err: AWSError, data: UpdateIAMPolicyAssignmentResponse) -> Unit = definedExternally): Request<UpdateIAMPolicyAssignmentResponse, AWSError>
    open fun updateIAMPolicyAssignment(callback: (err: AWSError, data: UpdateIAMPolicyAssignmentResponse) -> Unit = definedExternally): Request<UpdateIAMPolicyAssignmentResponse, AWSError>
    open fun updateTemplate(params: UpdateTemplateRequest, callback: (err: AWSError, data: UpdateTemplateResponse) -> Unit = definedExternally): Request<UpdateTemplateResponse, AWSError>
    open fun updateTemplate(callback: (err: AWSError, data: UpdateTemplateResponse) -> Unit = definedExternally): Request<UpdateTemplateResponse, AWSError>
    open fun updateTemplateAlias(params: UpdateTemplateAliasRequest, callback: (err: AWSError, data: UpdateTemplateAliasResponse) -> Unit = definedExternally): Request<UpdateTemplateAliasResponse, AWSError>
    open fun updateTemplateAlias(callback: (err: AWSError, data: UpdateTemplateAliasResponse) -> Unit = definedExternally): Request<UpdateTemplateAliasResponse, AWSError>
    open fun updateTemplatePermissions(params: UpdateTemplatePermissionsRequest, callback: (err: AWSError, data: UpdateTemplatePermissionsResponse) -> Unit = definedExternally): Request<UpdateTemplatePermissionsResponse, AWSError>
    open fun updateTemplatePermissions(callback: (err: AWSError, data: UpdateTemplatePermissionsResponse) -> Unit = definedExternally): Request<UpdateTemplatePermissionsResponse, AWSError>
    open fun updateUser(params: UpdateUserRequest, callback: (err: AWSError, data: UpdateUserResponse) -> Unit = definedExternally): Request<UpdateUserResponse, AWSError>
    open fun updateUser(callback: (err: AWSError, data: UpdateUserResponse) -> Unit = definedExternally): Request<UpdateUserResponse, AWSError>
    interface ActiveIAMPolicyAssignment {
        var AssignmentName: IAMPolicyAssignmentName?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdHocFilteringOption {
        var AvailabilityStatus: String /* "ENABLED" | "DISABLED" | String */
    }
    interface AmazonElasticsearchParameters {
        var Domain: Domain
    }
    interface AthenaParameters {
        var WorkGroup: WorkGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AuroraParameters {
        var Host: Host
        var Port: Port
        var Database: Database
    }
    interface AuroraPostgreSqlParameters {
        var Host: Host
        var Port: Port
        var Database: Database
    }
    interface AwsIotAnalyticsParameters {
        var DataSetName: DataSetName
    }
    interface CalculatedColumn {
        var ColumnName: ColumnName
        var ColumnId: ColumnId
        var Expression: Expression
    }
    interface CancelIngestionRequest {
        var AwsAccountId: AwsAccountId
        var DataSetId: String
        var IngestionId: IngestionId
    }
    interface CancelIngestionResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var IngestionId: IngestionId?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CastColumnTypeOperation {
        var ColumnName: ColumnName
        var NewColumnType: String /* "STRING" | "INTEGER" | "DECIMAL" | "DATETIME" | String */
        var Format: TypeCastFormat?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ColumnGroup {
        var GeoSpatialColumnGroup: GeoSpatialColumnGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ColumnGroupColumnSchema {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ColumnGroupSchema {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var ColumnGroupColumnSchemaList: ColumnGroupColumnSchemaList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ColumnSchema {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var DataType: String?
            get() = definedExternally
            set(value) = definedExternally
        var GeographicRole: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ColumnTag {
        var ColumnGeographicRole: String /* "COUNTRY" | "STATE" | "COUNTY" | "CITY" | "POSTCODE" | "LONGITUDE" | "LATITUDE" | String */
    }
    interface CreateColumnsOperation {
        var Columns: CalculatedColumnList
    }
    interface CreateDashboardRequest {
        var AwsAccountId: AwsAccountId
        var DashboardId: RestrictiveResourceId
        var Name: DashboardName
        var Parameters: Parameters?
            get() = definedExternally
            set(value) = definedExternally
        var Permissions: ResourcePermissionList?
            get() = definedExternally
            set(value) = definedExternally
        var SourceEntity: DashboardSourceEntity
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var VersionDescription: VersionDescription?
            get() = definedExternally
            set(value) = definedExternally
        var DashboardPublishOptions: DashboardPublishOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDashboardResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var VersionArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DashboardId: RestrictiveResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var CreationStatus: String /* "CREATION_IN_PROGRESS" | "CREATION_SUCCESSFUL" | "CREATION_FAILED" | "UPDATE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_FAILED" | String */
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDataSetRequest {
        var AwsAccountId: AwsAccountId
        var DataSetId: ResourceId
        var Name: ResourceName
        var PhysicalTableMap: PhysicalTableMap
        var LogicalTableMap: LogicalTableMap?
            get() = definedExternally
            set(value) = definedExternally
        var ImportMode: String /* "SPICE" | "DIRECT_QUERY" | String */
        var ColumnGroups: ColumnGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var Permissions: ResourcePermissionList?
            get() = definedExternally
            set(value) = definedExternally
        var RowLevelPermissionDataSet: RowLevelPermissionDataSet?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDataSetResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DataSetId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var IngestionArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var IngestionId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDataSourceRequest {
        var AwsAccountId: AwsAccountId
        var DataSourceId: ResourceId
        var Name: ResourceName
        var Type: String /* "ADOBE_ANALYTICS" | "AMAZON_ELASTICSEARCH" | "ATHENA" | "AURORA" | "AURORA_POSTGRESQL" | "AWS_IOT_ANALYTICS" | "GITHUB" | "JIRA" | "MARIADB" | "MYSQL" | "POSTGRESQL" | "PRESTO" | "REDSHIFT" | "S3" | "SALESFORCE" | "SERVICENOW" | "SNOWFLAKE" | "SPARK" | "SQLSERVER" | "TERADATA" | "TWITTER" | String */
        var DataSourceParameters: DataSourceParameters?
            get() = definedExternally
            set(value) = definedExternally
        var Credentials: DataSourceCredentials?
            get() = definedExternally
            set(value) = definedExternally
        var Permissions: ResourcePermissionList?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConnectionProperties: VpcConnectionProperties?
            get() = definedExternally
            set(value) = definedExternally
        var SslProperties: SslProperties?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDataSourceResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DataSourceId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var CreationStatus: String /* "CREATION_IN_PROGRESS" | "CREATION_SUCCESSFUL" | "CREATION_FAILED" | "UPDATE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_FAILED" | String */
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGroupMembershipRequest {
        var MemberName: GroupMemberName
        var GroupName: GroupName
        var AwsAccountId: AwsAccountId
        var Namespace: Namespace
    }
    interface CreateGroupMembershipResponse {
        var GroupMember: GroupMember?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGroupRequest {
        var GroupName: GroupName
        var Description: GroupDescription?
            get() = definedExternally
            set(value) = definedExternally
        var AwsAccountId: AwsAccountId
        var Namespace: Namespace
    }
    interface CreateGroupResponse {
        var Group: Group?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateIAMPolicyAssignmentRequest {
        var AwsAccountId: AwsAccountId
        var AssignmentName: IAMPolicyAssignmentName
        var AssignmentStatus: String /* "ENABLED" | "DRAFT" | "DISABLED" | String */
        var PolicyArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Identities: IdentityMap?
            get() = definedExternally
            set(value) = definedExternally
        var Namespace: Namespace
    }
    interface CreateIAMPolicyAssignmentResponse {
        var AssignmentName: IAMPolicyAssignmentName?
            get() = definedExternally
            set(value) = definedExternally
        var AssignmentId: String?
            get() = definedExternally
            set(value) = definedExternally
        var AssignmentStatus: String /* "ENABLED" | "DRAFT" | "DISABLED" | String */
        var PolicyArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Identities: IdentityMap?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateIngestionRequest {
        var DataSetId: String
        var IngestionId: IngestionId
        var AwsAccountId: AwsAccountId
    }
    interface CreateIngestionResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var IngestionId: IngestionId?
            get() = definedExternally
            set(value) = definedExternally
        var IngestionStatus: String /* "INITIALIZED" | "QUEUED" | "RUNNING" | "FAILED" | "COMPLETED" | "CANCELLED" | String */
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTemplateAliasRequest {
        var AwsAccountId: AwsAccountId
        var TemplateId: RestrictiveResourceId
        var AliasName: AliasName
        var TemplateVersionNumber: VersionNumber
    }
    interface CreateTemplateAliasResponse {
        var TemplateAlias: TemplateAlias?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTemplateRequest {
        var AwsAccountId: AwsAccountId
        var TemplateId: RestrictiveResourceId
        var Name: TemplateName?
            get() = definedExternally
            set(value) = definedExternally
        var Permissions: ResourcePermissionList?
            get() = definedExternally
            set(value) = definedExternally
        var SourceEntity: TemplateSourceEntity
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var VersionDescription: VersionDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTemplateResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var VersionArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateId: RestrictiveResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var CreationStatus: String /* "CREATION_IN_PROGRESS" | "CREATION_SUCCESSFUL" | "CREATION_FAILED" | "UPDATE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_FAILED" | String */
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CredentialPair {
        var Username: Username
        var Password: Password
    }
    interface CustomSql {
        var DataSourceArn: Arn
        var Name: CustomSqlName
        var SqlQuery: SqlQuery
        var Columns: InputColumnList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Dashboard {
        var DashboardId: RestrictiveResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: DashboardName?
            get() = definedExternally
            set(value) = definedExternally
        var Version: DashboardVersion?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastPublishedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DashboardError {
        var Type: String /* "DATA_SET_NOT_FOUND" | "INTERNAL_FAILURE" | "PARAMETER_VALUE_INCOMPATIBLE" | "PARAMETER_TYPE_INVALID" | "PARAMETER_NOT_FOUND" | "COLUMN_TYPE_MISMATCH" | "COLUMN_GEOGRAPHIC_ROLE_MISMATCH" | "COLUMN_REPLACEMENT_MISSING" | String */
        var Message: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DashboardPublishOptions {
        var AdHocFilteringOption: AdHocFilteringOption?
            get() = definedExternally
            set(value) = definedExternally
        var ExportToCSVOption: ExportToCSVOption?
            get() = definedExternally
            set(value) = definedExternally
        var SheetControlsOption: SheetControlsOption?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DashboardSearchFilter {
        var Operator: String /* "StringEquals" | String */
        var Name: String /* "QUICKSIGHT_USER" | String */
        var Value: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DashboardSourceEntity {
        var SourceTemplate: DashboardSourceTemplate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DashboardSourceTemplate {
        var DataSetReferences: DataSetReferenceList
        var Arn: Arn
    }
    interface DashboardSummary {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DashboardId: RestrictiveResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: DashboardName?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var PublishedVersionNumber: VersionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var LastPublishedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DashboardVersion {
        var CreatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Errors: DashboardErrorList?
            get() = definedExternally
            set(value) = definedExternally
        var VersionNumber: VersionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATION_IN_PROGRESS" | "CREATION_SUCCESSFUL" | "CREATION_FAILED" | "UPDATE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_FAILED" | String */
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var SourceEntityArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Description: VersionDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DashboardVersionSummary {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var VersionNumber: VersionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATION_IN_PROGRESS" | "CREATION_SUCCESSFUL" | "CREATION_FAILED" | "UPDATE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_FAILED" | String */
        var SourceEntityArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Description: VersionDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataSet {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DataSetId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var PhysicalTableMap: PhysicalTableMap?
            get() = definedExternally
            set(value) = definedExternally
        var LogicalTableMap: LogicalTableMap?
            get() = definedExternally
            set(value) = definedExternally
        var OutputColumns: OutputColumnList?
            get() = definedExternally
            set(value) = definedExternally
        var ImportMode: String /* "SPICE" | "DIRECT_QUERY" | String */
        var ConsumedSpiceCapacityInBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var ColumnGroups: ColumnGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var RowLevelPermissionDataSet: RowLevelPermissionDataSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataSetConfiguration {
        var Placeholder: String?
            get() = definedExternally
            set(value) = definedExternally
        var DataSetSchema: DataSetSchema?
            get() = definedExternally
            set(value) = definedExternally
        var ColumnGroupSchemaList: ColumnGroupSchemaList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataSetReference {
        var DataSetPlaceholder: NonEmptyString
        var DataSetArn: Arn
    }
    interface DataSetSchema {
        var ColumnSchemaList: ColumnSchemaList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataSetSummary {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DataSetId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ImportMode: String /* "SPICE" | "DIRECT_QUERY" | String */
        var RowLevelPermissionDataSet: RowLevelPermissionDataSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataSource {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DataSourceId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "ADOBE_ANALYTICS" | "AMAZON_ELASTICSEARCH" | "ATHENA" | "AURORA" | "AURORA_POSTGRESQL" | "AWS_IOT_ANALYTICS" | "GITHUB" | "JIRA" | "MARIADB" | "MYSQL" | "POSTGRESQL" | "PRESTO" | "REDSHIFT" | "S3" | "SALESFORCE" | "SERVICENOW" | "SNOWFLAKE" | "SPARK" | "SQLSERVER" | "TERADATA" | "TWITTER" | String */
        var Status: String /* "CREATION_IN_PROGRESS" | "CREATION_SUCCESSFUL" | "CREATION_FAILED" | "UPDATE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_FAILED" | String */
        var CreatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DataSourceParameters: DataSourceParameters?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConnectionProperties: VpcConnectionProperties?
            get() = definedExternally
            set(value) = definedExternally
        var SslProperties: SslProperties?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorInfo: DataSourceErrorInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataSourceCredentials {
        var CredentialPair: CredentialPair?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataSourceErrorInfo {
        var Type: String /* "TIMEOUT" | "ENGINE_VERSION_NOT_SUPPORTED" | "UNKNOWN_HOST" | "GENERIC_SQL_FAILURE" | "CONFLICT" | "UNKNOWN" | String */
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataSourceParameters {
        var AmazonElasticsearchParameters: AmazonElasticsearchParameters?
            get() = definedExternally
            set(value) = definedExternally
        var AthenaParameters: AthenaParameters?
            get() = definedExternally
            set(value) = definedExternally
        var AuroraParameters: AuroraParameters?
            get() = definedExternally
            set(value) = definedExternally
        var AuroraPostgreSqlParameters: AuroraPostgreSqlParameters?
            get() = definedExternally
            set(value) = definedExternally
        var AwsIotAnalyticsParameters: AwsIotAnalyticsParameters?
            get() = definedExternally
            set(value) = definedExternally
        var JiraParameters: JiraParameters?
            get() = definedExternally
            set(value) = definedExternally
        var MariaDbParameters: MariaDbParameters?
            get() = definedExternally
            set(value) = definedExternally
        var MySqlParameters: MySqlParameters?
            get() = definedExternally
            set(value) = definedExternally
        var PostgreSqlParameters: PostgreSqlParameters?
            get() = definedExternally
            set(value) = definedExternally
        var PrestoParameters: PrestoParameters?
            get() = definedExternally
            set(value) = definedExternally
        var RdsParameters: RdsParameters?
            get() = definedExternally
            set(value) = definedExternally
        var RedshiftParameters: RedshiftParameters?
            get() = definedExternally
            set(value) = definedExternally
        var S3Parameters: S3Parameters?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceNowParameters: ServiceNowParameters?
            get() = definedExternally
            set(value) = definedExternally
        var SnowflakeParameters: SnowflakeParameters?
            get() = definedExternally
            set(value) = definedExternally
        var SparkParameters: SparkParameters?
            get() = definedExternally
            set(value) = definedExternally
        var SqlServerParameters: SqlServerParameters?
            get() = definedExternally
            set(value) = definedExternally
        var TeradataParameters: TeradataParameters?
            get() = definedExternally
            set(value) = definedExternally
        var TwitterParameters: TwitterParameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DateTimeParameter {
        var Name: NonEmptyString
        var Values: TimestampList
    }
    interface DecimalParameter {
        var Name: NonEmptyString
        var Values: DoubleList
    }
    interface DeleteDashboardRequest {
        var AwsAccountId: AwsAccountId
        var DashboardId: RestrictiveResourceId
        var VersionNumber: VersionNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDashboardResponse {
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DashboardId: RestrictiveResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDataSetRequest {
        var AwsAccountId: AwsAccountId
        var DataSetId: ResourceId
    }
    interface DeleteDataSetResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DataSetId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDataSourceRequest {
        var AwsAccountId: AwsAccountId
        var DataSourceId: ResourceId
    }
    interface DeleteDataSourceResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DataSourceId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteGroupMembershipRequest {
        var MemberName: GroupMemberName
        var GroupName: GroupName
        var AwsAccountId: AwsAccountId
        var Namespace: Namespace
    }
    interface DeleteGroupMembershipResponse {
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteGroupRequest {
        var GroupName: GroupName
        var AwsAccountId: AwsAccountId
        var Namespace: Namespace
    }
    interface DeleteGroupResponse {
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteIAMPolicyAssignmentRequest {
        var AwsAccountId: AwsAccountId
        var AssignmentName: IAMPolicyAssignmentName
        var Namespace: Namespace
    }
    interface DeleteIAMPolicyAssignmentResponse {
        var AssignmentName: IAMPolicyAssignmentName?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteTemplateAliasRequest {
        var AwsAccountId: AwsAccountId
        var TemplateId: RestrictiveResourceId
        var AliasName: AliasName
    }
    interface DeleteTemplateAliasResponse {
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateId: RestrictiveResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var AliasName: AliasName?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteTemplateRequest {
        var AwsAccountId: AwsAccountId
        var TemplateId: RestrictiveResourceId
        var VersionNumber: VersionNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteTemplateResponse {
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateId: RestrictiveResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteUserByPrincipalIdRequest {
        var PrincipalId: String
        var AwsAccountId: AwsAccountId
        var Namespace: Namespace
    }
    interface DeleteUserByPrincipalIdResponse {
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteUserRequest {
        var UserName: UserName
        var AwsAccountId: AwsAccountId
        var Namespace: Namespace
    }
    interface DeleteUserResponse {
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDashboardPermissionsRequest {
        var AwsAccountId: AwsAccountId
        var DashboardId: RestrictiveResourceId
    }
    interface DescribeDashboardPermissionsResponse {
        var DashboardId: RestrictiveResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var DashboardArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Permissions: ResourcePermissionList?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDashboardRequest {
        var AwsAccountId: AwsAccountId
        var DashboardId: RestrictiveResourceId
        var VersionNumber: VersionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var AliasName: AliasName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDashboardResponse {
        var Dashboard: Dashboard?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDataSetPermissionsRequest {
        var AwsAccountId: AwsAccountId
        var DataSetId: ResourceId
    }
    interface DescribeDataSetPermissionsResponse {
        var DataSetArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DataSetId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Permissions: ResourcePermissionList?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDataSetRequest {
        var AwsAccountId: AwsAccountId
        var DataSetId: ResourceId
    }
    interface DescribeDataSetResponse {
        var DataSet: DataSet?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDataSourcePermissionsRequest {
        var AwsAccountId: AwsAccountId
        var DataSourceId: ResourceId
    }
    interface DescribeDataSourcePermissionsResponse {
        var DataSourceArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DataSourceId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Permissions: ResourcePermissionList?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDataSourceRequest {
        var AwsAccountId: AwsAccountId
        var DataSourceId: ResourceId
    }
    interface DescribeDataSourceResponse {
        var DataSource: DataSource?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeGroupRequest {
        var GroupName: GroupName
        var AwsAccountId: AwsAccountId
        var Namespace: Namespace
    }
    interface DescribeGroupResponse {
        var Group: Group?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeIAMPolicyAssignmentRequest {
        var AwsAccountId: AwsAccountId
        var AssignmentName: IAMPolicyAssignmentName
        var Namespace: Namespace
    }
    interface DescribeIAMPolicyAssignmentResponse {
        var IAMPolicyAssignment: IAMPolicyAssignment?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeIngestionRequest {
        var AwsAccountId: AwsAccountId
        var DataSetId: String
        var IngestionId: IngestionId
    }
    interface DescribeIngestionResponse {
        var Ingestion: Ingestion?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTemplateAliasRequest {
        var AwsAccountId: AwsAccountId
        var TemplateId: RestrictiveResourceId
        var AliasName: AliasName
    }
    interface DescribeTemplateAliasResponse {
        var TemplateAlias: TemplateAlias?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTemplatePermissionsRequest {
        var AwsAccountId: AwsAccountId
        var TemplateId: RestrictiveResourceId
    }
    interface DescribeTemplatePermissionsResponse {
        var TemplateId: RestrictiveResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Permissions: ResourcePermissionList?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTemplateRequest {
        var AwsAccountId: AwsAccountId
        var TemplateId: RestrictiveResourceId
        var VersionNumber: VersionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var AliasName: AliasName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTemplateResponse {
        var Template: Template?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUserRequest {
        var UserName: UserName
        var AwsAccountId: AwsAccountId
        var Namespace: Namespace
    }
    interface DescribeUserResponse {
        var User: User?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ErrorInfo {
        var Type: String /* "FAILURE_TO_ASSUME_ROLE" | "INGESTION_SUPERSEDED" | "INGESTION_CANCELED" | "DATA_SET_DELETED" | "DATA_SET_NOT_SPICE" | "S3_UPLOADED_FILE_DELETED" | "S3_MANIFEST_ERROR" | "DATA_TOLERANCE_EXCEPTION" | "SPICE_TABLE_NOT_FOUND" | "DATA_SET_SIZE_LIMIT_EXCEEDED" | "ROW_SIZE_LIMIT_EXCEEDED" | "ACCOUNT_CAPACITY_LIMIT_EXCEEDED" | "CUSTOMER_ERROR" | "DATA_SOURCE_NOT_FOUND" | "IAM_ROLE_NOT_AVAILABLE" | "CONNECTION_FAILURE" | "SQL_TABLE_NOT_FOUND" | "PERMISSION_DENIED" | "SSL_CERTIFICATE_VALIDATION_FAILURE" | "OAUTH_TOKEN_FAILURE" | "SOURCE_API_LIMIT_EXCEEDED_FAILURE" | "PASSWORD_AUTHENTICATION_FAILURE" | "SQL_SCHEMA_MISMATCH_ERROR" | "INVALID_DATE_FORMAT" | "INVALID_DATAPREP_SYNTAX" | "SOURCE_RESOURCE_LIMIT_EXCEEDED" | "SQL_INVALID_PARAMETER_VALUE" | "QUERY_TIMEOUT" | "SQL_NUMERIC_OVERFLOW" | "UNRESOLVABLE_HOST" | "UNROUTABLE_HOST" | "SQL_EXCEPTION" | "S3_FILE_INACCESSIBLE" | "IOT_FILE_NOT_FOUND" | "IOT_DATA_SET_FILE_EMPTY" | "INVALID_DATA_SOURCE_CONFIG" | "DATA_SOURCE_AUTH_FAILED" | "DATA_SOURCE_CONNECTION_FAILED" | "FAILURE_TO_PROCESS_JSON_FILE" | "INTERNAL_SERVICE_ERROR" | String */
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExportToCSVOption {
        var AvailabilityStatus: String /* "ENABLED" | "DISABLED" | String */
    }
    interface FilterOperation {
        var ConditionExpression: Expression
    }
    interface GeoSpatialColumnGroup {
        var Name: ColumnGroupName
        var CountryCode: String /* "US" | String */
        var Columns: ColumnList
    }
    interface GetDashboardEmbedUrlRequest {
        var AwsAccountId: AwsAccountId
        var DashboardId: RestrictiveResourceId
        var IdentityType: String /* "IAM" | "QUICKSIGHT" | String */
        var SessionLifetimeInMinutes: SessionLifetimeInMinutes?
            get() = definedExternally
            set(value) = definedExternally
        var UndoRedoDisabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ResetDisabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var UserArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDashboardEmbedUrlResponse {
        var EmbedUrl: EmbeddingUrl?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Group {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var GroupName: GroupName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: GroupDescription?
            get() = definedExternally
            set(value) = definedExternally
        var PrincipalId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GroupMember {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var MemberName: GroupMemberName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IAMPolicyAssignment {
        var AwsAccountId: AwsAccountId?
            get() = definedExternally
            set(value) = definedExternally
        var AssignmentId: String?
            get() = definedExternally
            set(value) = definedExternally
        var AssignmentName: IAMPolicyAssignmentName?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Identities: IdentityMap?
            get() = definedExternally
            set(value) = definedExternally
        var AssignmentStatus: String /* "ENABLED" | "DRAFT" | "DISABLED" | String */
    }
    interface IAMPolicyAssignmentSummary {
        var AssignmentName: IAMPolicyAssignmentName?
            get() = definedExternally
            set(value) = definedExternally
        var AssignmentStatus: String /* "ENABLED" | "DRAFT" | "DISABLED" | String */
    }
    interface IdentityMap {
        @nativeGetter
        operator fun get(key: String): IdentityNameList?
        @nativeSetter
        operator fun set(key: String, value: IdentityNameList)
    }
    interface Ingestion {
        var Arn: Arn
        var IngestionId: IngestionId?
            get() = definedExternally
            set(value) = definedExternally
        var IngestionStatus: String /* "INITIALIZED" | "QUEUED" | "RUNNING" | "FAILED" | "COMPLETED" | "CANCELLED" | String */
        var ErrorInfo: ErrorInfo?
            get() = definedExternally
            set(value) = definedExternally
        var RowInfo: RowInfo?
            get() = definedExternally
            set(value) = definedExternally
        var QueueInfo: QueueInfo?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: timestamp
        var IngestionTimeInSeconds: long?
            get() = definedExternally
            set(value) = definedExternally
        var IngestionSizeInBytes: long?
            get() = definedExternally
            set(value) = definedExternally
        var RequestSource: String /* "MANUAL" | "SCHEDULED" | String */
        var RequestType: String /* "INITIAL_INGESTION" | "EDIT" | "INCREMENTAL_REFRESH" | "FULL_REFRESH" | String */
    }
    interface InputColumn {
        var Name: ColumnName
        var Type: String /* "STRING" | "INTEGER" | "DECIMAL" | "DATETIME" | "BIT" | "BOOLEAN" | "JSON" | String */
    }
    interface IntegerParameter {
        var Name: NonEmptyString
        var Values: LongList
    }
    interface JiraParameters {
        var SiteBaseUrl: SiteBaseUrl
    }
    interface JoinInstruction {
        var LeftOperand: LogicalTableId
        var RightOperand: LogicalTableId
        var Type: String /* "INNER" | "OUTER" | "LEFT" | "RIGHT" | String */
        var OnClause: OnClause
    }
    interface ListDashboardVersionsRequest {
        var AwsAccountId: AwsAccountId
        var DashboardId: RestrictiveResourceId
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDashboardVersionsResponse {
        var DashboardVersionSummaryList: DashboardVersionSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDashboardsRequest {
        var AwsAccountId: AwsAccountId
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDashboardsResponse {
        var DashboardSummaryList: DashboardSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDataSetsRequest {
        var AwsAccountId: AwsAccountId
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDataSetsResponse {
        var DataSetSummaries: DataSetSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDataSourcesRequest {
        var AwsAccountId: AwsAccountId
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDataSourcesResponse {
        var DataSources: DataSourceList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroupMembershipsRequest {
        var GroupName: GroupName
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var AwsAccountId: AwsAccountId
        var Namespace: Namespace
    }
    interface ListGroupMembershipsResponse {
        var GroupMemberList: GroupMemberList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroupsRequest {
        var AwsAccountId: AwsAccountId
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var Namespace: Namespace
    }
    interface ListGroupsResponse {
        var GroupList: GroupList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIAMPolicyAssignmentsForUserRequest {
        var AwsAccountId: AwsAccountId
        var UserName: UserName
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var Namespace: Namespace
    }
    interface ListIAMPolicyAssignmentsForUserResponse {
        var ActiveAssignments: ActiveIAMPolicyAssignmentList?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIAMPolicyAssignmentsRequest {
        var AwsAccountId: AwsAccountId
        var AssignmentStatus: String /* "ENABLED" | "DRAFT" | "DISABLED" | String */
        var Namespace: Namespace
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIAMPolicyAssignmentsResponse {
        var IAMPolicyAssignments: IAMPolicyAssignmentSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIngestionsRequest {
        var DataSetId: String
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var AwsAccountId: AwsAccountId
        var MaxResults: IngestionMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIngestionsResponse {
        var Ingestions: Ingestions?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: Arn
    }
    interface ListTagsForResourceResponse {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTemplateAliasesRequest {
        var AwsAccountId: AwsAccountId
        var TemplateId: RestrictiveResourceId
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTemplateAliasesResponse {
        var TemplateAliasList: TemplateAliasList?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTemplateVersionsRequest {
        var AwsAccountId: AwsAccountId
        var TemplateId: RestrictiveResourceId
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTemplateVersionsResponse {
        var TemplateVersionSummaryList: TemplateVersionSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTemplatesRequest {
        var AwsAccountId: AwsAccountId
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTemplatesResponse {
        var TemplateSummaryList: TemplateSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUserGroupsRequest {
        var UserName: UserName
        var AwsAccountId: AwsAccountId
        var Namespace: Namespace
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUserGroupsResponse {
        var GroupList: GroupList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUsersRequest {
        var AwsAccountId: AwsAccountId
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var Namespace: Namespace
    }
    interface ListUsersResponse {
        var UserList: UserList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogicalTable {
        var Alias: LogicalTableAlias
        var DataTransforms: TransformOperationList?
            get() = definedExternally
            set(value) = definedExternally
        var Source: LogicalTableSource
    }
    interface LogicalTableMap {
        @nativeGetter
        operator fun get(key: String): LogicalTable?
        @nativeSetter
        operator fun set(key: String, value: LogicalTable)
    }
    interface LogicalTableSource {
        var JoinInstruction: JoinInstruction?
            get() = definedExternally
            set(value) = definedExternally
        var PhysicalTableId: PhysicalTableId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ManifestFileLocation {
        var Bucket: S3Bucket
        var Key: S3Key
    }
    interface MariaDbParameters {
        var Host: Host
        var Port: Port
        var Database: Database
    }
    interface MySqlParameters {
        var Host: Host
        var Port: Port
        var Database: Database
    }
    interface OutputColumn {
        var Name: ColumnName?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "STRING" | "INTEGER" | "DECIMAL" | "DATETIME" | String */
    }
    interface Parameters {
        var StringParameters: StringParameterList?
            get() = definedExternally
            set(value) = definedExternally
        var IntegerParameters: IntegerParameterList?
            get() = definedExternally
            set(value) = definedExternally
        var DecimalParameters: DecimalParameterList?
            get() = definedExternally
            set(value) = definedExternally
        var DateTimeParameters: DateTimeParameterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PhysicalTable {
        var RelationalTable: RelationalTable?
            get() = definedExternally
            set(value) = definedExternally
        var CustomSql: CustomSql?
            get() = definedExternally
            set(value) = definedExternally
        var S3Source: S3Source?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PhysicalTableMap {
        @nativeGetter
        operator fun get(key: String): PhysicalTable?
        @nativeSetter
        operator fun set(key: String, value: PhysicalTable)
    }
    interface PostgreSqlParameters {
        var Host: Host
        var Port: Port
        var Database: Database
    }
    interface PrestoParameters {
        var Host: Host
        var Port: Port
        var Catalog: Catalog
    }
    interface ProjectOperation {
        var ProjectedColumns: ProjectedColumnList
    }
    interface QueueInfo {
        var WaitingOnIngestion: String
        var QueuedIngestion: String
    }
    interface RdsParameters {
        var InstanceId: InstanceId
        var Database: Database
    }
    interface RedshiftParameters {
        var Host: Host?
            get() = definedExternally
            set(value) = definedExternally
        var Port: OptionalPort?
            get() = definedExternally
            set(value) = definedExternally
        var Database: Database
        var ClusterId: ClusterId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterUserRequest {
        var IdentityType: String /* "IAM" | "QUICKSIGHT" | String */
        var Email: String
        var UserRole: String /* "ADMIN" | "AUTHOR" | "READER" | "RESTRICTED_AUTHOR" | "RESTRICTED_READER" | String */
        var IamArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var SessionName: RoleSessionName?
            get() = definedExternally
            set(value) = definedExternally
        var AwsAccountId: AwsAccountId
        var Namespace: Namespace
        var UserName: UserName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterUserResponse {
        var User: User?
            get() = definedExternally
            set(value) = definedExternally
        var UserInvitationUrl: String?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RelationalTable {
        var DataSourceArn: Arn
        var Schema: RelationalTableSchema?
            get() = definedExternally
            set(value) = definedExternally
        var Name: RelationalTableName
        var InputColumns: InputColumnList
    }
    interface RenameColumnOperation {
        var ColumnName: ColumnName
        var NewColumnName: ColumnName
    }
    interface ResourcePermission {
        var Principal: Principal
        var Actions: ActionList
    }
    interface RowInfo {
        var RowsIngested: long?
            get() = definedExternally
            set(value) = definedExternally
        var RowsDropped: long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RowLevelPermissionDataSet {
        var Arn: Arn
        var PermissionPolicy: String /* "GRANT_ACCESS" | "DENY_ACCESS" | String */
    }
    interface S3Parameters {
        var ManifestFileLocation: ManifestFileLocation
    }
    interface S3Source {
        var DataSourceArn: Arn
        var UploadSettings: UploadSettings?
            get() = definedExternally
            set(value) = definedExternally
        var InputColumns: InputColumnList
    }
    interface SearchDashboardsRequest {
        var AwsAccountId: AwsAccountId
        var Filters: DashboardSearchFilterList
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchDashboardsResponse {
        var DashboardSummaryList: DashboardSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServiceNowParameters {
        var SiteBaseUrl: SiteBaseUrl
    }
    interface SheetControlsOption {
        var VisibilityState: String /* "EXPANDED" | "COLLAPSED" | String */
    }
    interface SnowflakeParameters {
        var Host: Host
        var Database: Database
        var Warehouse: Warehouse
    }
    interface SparkParameters {
        var Host: Host
        var Port: Port
    }
    interface SqlServerParameters {
        var Host: Host
        var Port: Port
        var Database: Database
    }
    interface SslProperties {
        var DisableSsl: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StringParameter {
        var Name: NonEmptyString
        var Values: StringList
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface TagColumnOperation {
        var ColumnName: ColumnName
        var Tags: ColumnTagList
    }
    interface TagResourceRequest {
        var ResourceArn: Arn
        var Tags: TagList
    }
    interface TagResourceResponse {
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Template {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: TemplateName?
            get() = definedExternally
            set(value) = definedExternally
        var Version: TemplateVersion?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateId: RestrictiveResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TemplateAlias {
        var AliasName: AliasName?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateVersionNumber: VersionNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TemplateError {
        var Type: String /* "DATA_SET_NOT_FOUND" | "INTERNAL_FAILURE" | String */
        var Message: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TemplateSourceAnalysis {
        var Arn: Arn
        var DataSetReferences: DataSetReferenceList
    }
    interface TemplateSourceEntity {
        var SourceAnalysis: TemplateSourceAnalysis?
            get() = definedExternally
            set(value) = definedExternally
        var SourceTemplate: TemplateSourceTemplate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TemplateSourceTemplate {
        var Arn: Arn
    }
    interface TemplateSummary {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateId: RestrictiveResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: TemplateName?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersionNumber: VersionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TemplateVersion {
        var CreatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Errors: TemplateErrorList?
            get() = definedExternally
            set(value) = definedExternally
        var VersionNumber: VersionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATION_IN_PROGRESS" | "CREATION_SUCCESSFUL" | "CREATION_FAILED" | "UPDATE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_FAILED" | String */
        var DataSetConfigurations: DataSetConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
        var Description: VersionDescription?
            get() = definedExternally
            set(value) = definedExternally
        var SourceEntityArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TemplateVersionSummary {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var VersionNumber: VersionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATION_IN_PROGRESS" | "CREATION_SUCCESSFUL" | "CREATION_FAILED" | "UPDATE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_FAILED" | String */
        var Description: VersionDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TeradataParameters {
        var Host: Host
        var Port: Port
        var Database: Database
    }
    interface TransformOperation {
        var ProjectOperation: ProjectOperation?
            get() = definedExternally
            set(value) = definedExternally
        var FilterOperation: FilterOperation?
            get() = definedExternally
            set(value) = definedExternally
        var CreateColumnsOperation: CreateColumnsOperation?
            get() = definedExternally
            set(value) = definedExternally
        var RenameColumnOperation: RenameColumnOperation?
            get() = definedExternally
            set(value) = definedExternally
        var CastColumnTypeOperation: CastColumnTypeOperation?
            get() = definedExternally
            set(value) = definedExternally
        var TagColumnOperation: TagColumnOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TwitterParameters {
        var Query: Query
        var MaxRows: PositiveInteger
    }
    interface UntagResourceRequest {
        var ResourceArn: Arn
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse {
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDashboardPermissionsRequest {
        var AwsAccountId: AwsAccountId
        var DashboardId: RestrictiveResourceId
        var GrantPermissions: UpdateResourcePermissionList?
            get() = definedExternally
            set(value) = definedExternally
        var RevokePermissions: UpdateResourcePermissionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDashboardPermissionsResponse {
        var DashboardArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DashboardId: RestrictiveResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Permissions: ResourcePermissionList?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDashboardPublishedVersionRequest {
        var AwsAccountId: AwsAccountId
        var DashboardId: RestrictiveResourceId
        var VersionNumber: VersionNumber
    }
    interface UpdateDashboardPublishedVersionResponse {
        var DashboardId: RestrictiveResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var DashboardArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDashboardRequest {
        var AwsAccountId: AwsAccountId
        var DashboardId: RestrictiveResourceId
        var Name: DashboardName
        var SourceEntity: DashboardSourceEntity
        var Parameters: Parameters?
            get() = definedExternally
            set(value) = definedExternally
        var VersionDescription: VersionDescription?
            get() = definedExternally
            set(value) = definedExternally
        var DashboardPublishOptions: DashboardPublishOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDashboardResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var VersionArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DashboardId: RestrictiveResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var CreationStatus: String /* "CREATION_IN_PROGRESS" | "CREATION_SUCCESSFUL" | "CREATION_FAILED" | "UPDATE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_FAILED" | String */
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDataSetPermissionsRequest {
        var AwsAccountId: AwsAccountId
        var DataSetId: ResourceId
        var GrantPermissions: ResourcePermissionList?
            get() = definedExternally
            set(value) = definedExternally
        var RevokePermissions: ResourcePermissionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDataSetPermissionsResponse {
        var DataSetArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DataSetId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDataSetRequest {
        var AwsAccountId: AwsAccountId
        var DataSetId: ResourceId
        var Name: ResourceName
        var PhysicalTableMap: PhysicalTableMap
        var LogicalTableMap: LogicalTableMap?
            get() = definedExternally
            set(value) = definedExternally
        var ImportMode: String /* "SPICE" | "DIRECT_QUERY" | String */
        var ColumnGroups: ColumnGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var RowLevelPermissionDataSet: RowLevelPermissionDataSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDataSetResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DataSetId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var IngestionArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var IngestionId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDataSourcePermissionsRequest {
        var AwsAccountId: AwsAccountId
        var DataSourceId: ResourceId
        var GrantPermissions: ResourcePermissionList?
            get() = definedExternally
            set(value) = definedExternally
        var RevokePermissions: ResourcePermissionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDataSourcePermissionsResponse {
        var DataSourceArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DataSourceId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDataSourceRequest {
        var AwsAccountId: AwsAccountId
        var DataSourceId: ResourceId
        var Name: ResourceName
        var DataSourceParameters: DataSourceParameters?
            get() = definedExternally
            set(value) = definedExternally
        var Credentials: DataSourceCredentials?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConnectionProperties: VpcConnectionProperties?
            get() = definedExternally
            set(value) = definedExternally
        var SslProperties: SslProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDataSourceResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DataSourceId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var UpdateStatus: String /* "CREATION_IN_PROGRESS" | "CREATION_SUCCESSFUL" | "CREATION_FAILED" | "UPDATE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_FAILED" | String */
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGroupRequest {
        var GroupName: GroupName
        var Description: GroupDescription?
            get() = definedExternally
            set(value) = definedExternally
        var AwsAccountId: AwsAccountId
        var Namespace: Namespace
    }
    interface UpdateGroupResponse {
        var Group: Group?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateIAMPolicyAssignmentRequest {
        var AwsAccountId: AwsAccountId
        var AssignmentName: IAMPolicyAssignmentName
        var Namespace: Namespace
        var AssignmentStatus: String /* "ENABLED" | "DRAFT" | "DISABLED" | String */
        var PolicyArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Identities: IdentityMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateIAMPolicyAssignmentResponse {
        var AssignmentName: IAMPolicyAssignmentName?
            get() = definedExternally
            set(value) = definedExternally
        var AssignmentId: String?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Identities: IdentityMap?
            get() = definedExternally
            set(value) = definedExternally
        var AssignmentStatus: String /* "ENABLED" | "DRAFT" | "DISABLED" | String */
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTemplateAliasRequest {
        var AwsAccountId: AwsAccountId
        var TemplateId: RestrictiveResourceId
        var AliasName: AliasName
        var TemplateVersionNumber: VersionNumber
    }
    interface UpdateTemplateAliasResponse {
        var TemplateAlias: TemplateAlias?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTemplatePermissionsRequest {
        var AwsAccountId: AwsAccountId
        var TemplateId: RestrictiveResourceId
        var GrantPermissions: UpdateResourcePermissionList?
            get() = definedExternally
            set(value) = definedExternally
        var RevokePermissions: UpdateResourcePermissionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTemplatePermissionsResponse {
        var TemplateId: RestrictiveResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Permissions: ResourcePermissionList?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTemplateRequest {
        var AwsAccountId: AwsAccountId
        var TemplateId: RestrictiveResourceId
        var SourceEntity: TemplateSourceEntity
        var VersionDescription: VersionDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Name: TemplateName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTemplateResponse {
        var TemplateId: RestrictiveResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var VersionArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var CreationStatus: String /* "CREATION_IN_PROGRESS" | "CREATION_SUCCESSFUL" | "CREATION_FAILED" | "UPDATE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_FAILED" | String */
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateUserRequest {
        var UserName: UserName
        var AwsAccountId: AwsAccountId
        var Namespace: Namespace
        var Email: String
        var Role: String /* "ADMIN" | "AUTHOR" | "READER" | "RESTRICTED_AUTHOR" | "RESTRICTED_READER" | String */
    }
    interface UpdateUserResponse {
        var User: User?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UploadSettings {
        var Format: String /* "CSV" | "TSV" | "CLF" | "ELF" | "XLSX" | "JSON" | String */
        var StartFromRow: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var ContainsHeader: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var TextQualifier: String /* "DOUBLE_QUOTE" | "SINGLE_QUOTE" | String */
        var Delimiter: Delimiter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface User {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var UserName: UserName?
            get() = definedExternally
            set(value) = definedExternally
        var Email: String?
            get() = definedExternally
            set(value) = definedExternally
        var Role: String /* "ADMIN" | "AUTHOR" | "READER" | "RESTRICTED_AUTHOR" | "RESTRICTED_READER" | String */
        var IdentityType: String /* "IAM" | "QUICKSIGHT" | String */
        var Active: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var PrincipalId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VpcConnectionProperties {
        var VpcConnectionArn: Arn
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-04-01" | "latest" | String */
    }
}