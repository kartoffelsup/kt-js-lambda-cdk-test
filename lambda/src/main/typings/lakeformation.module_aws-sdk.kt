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
import LakeFormation.BatchPermissionsFailureEntry
import LakeFormation.BatchPermissionsRequestEntry
import LakeFormation.DataLakePrincipal
import LakeFormation.FilterCondition
import LakeFormation.PrincipalPermissions
import LakeFormation.PrincipalResourcePermissions
import LakeFormation.ResourceInfo
import LakeFormation.BatchGrantPermissionsRequest
import LakeFormation.BatchGrantPermissionsResponse
import LakeFormation.BatchRevokePermissionsRequest
import LakeFormation.BatchRevokePermissionsResponse
import LakeFormation.DeregisterResourceRequest
import LakeFormation.DeregisterResourceResponse
import LakeFormation.DescribeResourceRequest
import LakeFormation.DescribeResourceResponse
import LakeFormation.GetDataLakeSettingsRequest
import LakeFormation.GetDataLakeSettingsResponse
import LakeFormation.GetEffectivePermissionsForPathRequest
import LakeFormation.GetEffectivePermissionsForPathResponse
import LakeFormation.GrantPermissionsRequest
import LakeFormation.GrantPermissionsResponse
import LakeFormation.ListPermissionsRequest
import LakeFormation.ListPermissionsResponse
import LakeFormation.ListResourcesRequest
import LakeFormation.ListResourcesResponse
import LakeFormation.PutDataLakeSettingsRequest
import LakeFormation.PutDataLakeSettingsResponse
import LakeFormation.RegisterResourceRequest
import LakeFormation.RegisterResourceResponse
import LakeFormation.RevokePermissionsRequest
import LakeFormation.RevokePermissionsResponse
import LakeFormation.UpdateResourceRequest
import LakeFormation.UpdateResourceResponse
import LakeFormation.ErrorDetail
import LakeFormation.Resource
import LakeFormation.DataLakeSettings
import LakeFormation.CatalogResource
import LakeFormation.DatabaseResource
import LakeFormation.TableResource
import LakeFormation.TableWithColumnsResource
import LakeFormation.DataLocationResource
import LakeFormation.ColumnWildcard

typealias BatchPermissionsFailureList = Array<BatchPermissionsFailureEntry>

typealias BatchPermissionsRequestEntryList = Array<BatchPermissionsRequestEntry>

typealias CatalogIdString = String

typealias ColumnNames = Array<NameString>

typealias DataLakePrincipalList = Array<DataLakePrincipal>

typealias DataLakePrincipalString = String

typealias DescriptionString = String

typealias FilterConditionList = Array<FilterCondition>

typealias IAMRoleArn = String

typealias Identifier = String

typealias LastModifiedTimestamp = Date

typealias NameString = String

typealias NullableBoolean = Boolean

typealias PageSize = Number

typealias PermissionList = Array<String /* "ALL" | "SELECT" | "ALTER" | "DROP" | "DELETE" | "INSERT" | "CREATE_DATABASE" | "CREATE_TABLE" | "DATA_LOCATION_ACCESS" | String */>

typealias PrincipalPermissionsList = Array<PrincipalPermissions>

typealias PrincipalResourcePermissionsList = Array<PrincipalResourcePermissions>

typealias ResourceArnString = String

typealias ResourceInfoList = Array<ResourceInfo>

typealias StringValue = String

typealias StringValueList = Array<StringValue>

typealias Token = String

@JsModule("aws-sdk")
external open class LakeFormation(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & LakeFormation.Types.ClientConfiguration */
    open fun batchGrantPermissions(params: BatchGrantPermissionsRequest, callback: (err: AWSError, data: BatchGrantPermissionsResponse) -> Unit = definedExternally): Request<BatchGrantPermissionsResponse, AWSError>
    open fun batchGrantPermissions(callback: (err: AWSError, data: BatchGrantPermissionsResponse) -> Unit = definedExternally): Request<BatchGrantPermissionsResponse, AWSError>
    open fun batchRevokePermissions(params: BatchRevokePermissionsRequest, callback: (err: AWSError, data: BatchRevokePermissionsResponse) -> Unit = definedExternally): Request<BatchRevokePermissionsResponse, AWSError>
    open fun batchRevokePermissions(callback: (err: AWSError, data: BatchRevokePermissionsResponse) -> Unit = definedExternally): Request<BatchRevokePermissionsResponse, AWSError>
    open fun deregisterResource(params: DeregisterResourceRequest, callback: (err: AWSError, data: DeregisterResourceResponse) -> Unit = definedExternally): Request<DeregisterResourceResponse, AWSError>
    open fun deregisterResource(callback: (err: AWSError, data: DeregisterResourceResponse) -> Unit = definedExternally): Request<DeregisterResourceResponse, AWSError>
    open fun describeResource(params: DescribeResourceRequest, callback: (err: AWSError, data: DescribeResourceResponse) -> Unit = definedExternally): Request<DescribeResourceResponse, AWSError>
    open fun describeResource(callback: (err: AWSError, data: DescribeResourceResponse) -> Unit = definedExternally): Request<DescribeResourceResponse, AWSError>
    open fun getDataLakeSettings(params: GetDataLakeSettingsRequest, callback: (err: AWSError, data: GetDataLakeSettingsResponse) -> Unit = definedExternally): Request<GetDataLakeSettingsResponse, AWSError>
    open fun getDataLakeSettings(callback: (err: AWSError, data: GetDataLakeSettingsResponse) -> Unit = definedExternally): Request<GetDataLakeSettingsResponse, AWSError>
    open fun getEffectivePermissionsForPath(params: GetEffectivePermissionsForPathRequest, callback: (err: AWSError, data: GetEffectivePermissionsForPathResponse) -> Unit = definedExternally): Request<GetEffectivePermissionsForPathResponse, AWSError>
    open fun getEffectivePermissionsForPath(callback: (err: AWSError, data: GetEffectivePermissionsForPathResponse) -> Unit = definedExternally): Request<GetEffectivePermissionsForPathResponse, AWSError>
    open fun grantPermissions(params: GrantPermissionsRequest, callback: (err: AWSError, data: GrantPermissionsResponse) -> Unit = definedExternally): Request<GrantPermissionsResponse, AWSError>
    open fun grantPermissions(callback: (err: AWSError, data: GrantPermissionsResponse) -> Unit = definedExternally): Request<GrantPermissionsResponse, AWSError>
    open fun listPermissions(params: ListPermissionsRequest, callback: (err: AWSError, data: ListPermissionsResponse) -> Unit = definedExternally): Request<ListPermissionsResponse, AWSError>
    open fun listPermissions(callback: (err: AWSError, data: ListPermissionsResponse) -> Unit = definedExternally): Request<ListPermissionsResponse, AWSError>
    open fun listResources(params: ListResourcesRequest, callback: (err: AWSError, data: ListResourcesResponse) -> Unit = definedExternally): Request<ListResourcesResponse, AWSError>
    open fun listResources(callback: (err: AWSError, data: ListResourcesResponse) -> Unit = definedExternally): Request<ListResourcesResponse, AWSError>
    open fun putDataLakeSettings(params: PutDataLakeSettingsRequest, callback: (err: AWSError, data: PutDataLakeSettingsResponse) -> Unit = definedExternally): Request<PutDataLakeSettingsResponse, AWSError>
    open fun putDataLakeSettings(callback: (err: AWSError, data: PutDataLakeSettingsResponse) -> Unit = definedExternally): Request<PutDataLakeSettingsResponse, AWSError>
    open fun registerResource(params: RegisterResourceRequest, callback: (err: AWSError, data: RegisterResourceResponse) -> Unit = definedExternally): Request<RegisterResourceResponse, AWSError>
    open fun registerResource(callback: (err: AWSError, data: RegisterResourceResponse) -> Unit = definedExternally): Request<RegisterResourceResponse, AWSError>
    open fun revokePermissions(params: RevokePermissionsRequest, callback: (err: AWSError, data: RevokePermissionsResponse) -> Unit = definedExternally): Request<RevokePermissionsResponse, AWSError>
    open fun revokePermissions(callback: (err: AWSError, data: RevokePermissionsResponse) -> Unit = definedExternally): Request<RevokePermissionsResponse, AWSError>
    open fun updateResource(params: UpdateResourceRequest, callback: (err: AWSError, data: UpdateResourceResponse) -> Unit = definedExternally): Request<UpdateResourceResponse, AWSError>
    open fun updateResource(callback: (err: AWSError, data: UpdateResourceResponse) -> Unit = definedExternally): Request<UpdateResourceResponse, AWSError>
    interface BatchGrantPermissionsRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var Entries: BatchPermissionsRequestEntryList
    }
    interface BatchGrantPermissionsResponse {
        var Failures: BatchPermissionsFailureList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchPermissionsFailureEntry {
        var RequestEntry: BatchPermissionsRequestEntry?
            get() = definedExternally
            set(value) = definedExternally
        var Error: ErrorDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchPermissionsRequestEntry {
        var Id: Identifier
        var Principal: DataLakePrincipal?
            get() = definedExternally
            set(value) = definedExternally
        var Resource: Resource?
            get() = definedExternally
            set(value) = definedExternally
        var Permissions: PermissionList?
            get() = definedExternally
            set(value) = definedExternally
        var PermissionsWithGrantOption: PermissionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchRevokePermissionsRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var Entries: BatchPermissionsRequestEntryList
    }
    interface BatchRevokePermissionsResponse {
        var Failures: BatchPermissionsFailureList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CatalogResource
    interface ColumnWildcard {
        var ExcludedColumnNames: ColumnNames?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataLakePrincipal {
        var DataLakePrincipalIdentifier: DataLakePrincipalString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataLakeSettings {
        var DataLakeAdmins: DataLakePrincipalList?
            get() = definedExternally
            set(value) = definedExternally
        var CreateDatabaseDefaultPermissions: PrincipalPermissionsList?
            get() = definedExternally
            set(value) = definedExternally
        var CreateTableDefaultPermissions: PrincipalPermissionsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataLocationResource {
        var ResourceArn: ResourceArnString
    }
    interface DatabaseResource {
        var Name: NameString
    }
    interface DeregisterResourceRequest {
        var ResourceArn: ResourceArnString
    }
    interface DeregisterResourceResponse
    interface DescribeResourceRequest {
        var ResourceArn: ResourceArnString
    }
    interface DescribeResourceResponse {
        var ResourceInfo: ResourceInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ErrorDetail {
        var ErrorCode: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FilterCondition {
        var Field: String /* "RESOURCE_ARN" | "ROLE_ARN" | "LAST_MODIFIED" | String */
        var ComparisonOperator: String /* "EQ" | "NE" | "LE" | "LT" | "GE" | "GT" | "CONTAINS" | "NOT_CONTAINS" | "BEGINS_WITH" | "IN" | "BETWEEN" | String */
        var StringValueList: StringValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDataLakeSettingsRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDataLakeSettingsResponse {
        var DataLakeSettings: DataLakeSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetEffectivePermissionsForPathRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceArn: ResourceArnString
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetEffectivePermissionsForPathResponse {
        var Permissions: PrincipalResourcePermissionsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GrantPermissionsRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var Principal: DataLakePrincipal
        var Resource: Resource
        var Permissions: PermissionList
        var PermissionsWithGrantOption: PermissionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GrantPermissionsResponse
    interface ListPermissionsRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var Principal: DataLakePrincipal?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: String /* "CATALOG" | "DATABASE" | "TABLE" | "DATA_LOCATION" | String */
        var Resource: Resource?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPermissionsResponse {
        var PrincipalResourcePermissions: PrincipalResourcePermissionsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourcesRequest {
        var FilterConditionList: FilterConditionList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourcesResponse {
        var ResourceInfoList: ResourceInfoList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PrincipalPermissions {
        var Principal: DataLakePrincipal?
            get() = definedExternally
            set(value) = definedExternally
        var Permissions: PermissionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PrincipalResourcePermissions {
        var Principal: DataLakePrincipal?
            get() = definedExternally
            set(value) = definedExternally
        var Resource: Resource?
            get() = definedExternally
            set(value) = definedExternally
        var Permissions: PermissionList?
            get() = definedExternally
            set(value) = definedExternally
        var PermissionsWithGrantOption: PermissionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutDataLakeSettingsRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DataLakeSettings: DataLakeSettings
    }
    interface PutDataLakeSettingsResponse
    interface RegisterResourceRequest {
        var ResourceArn: ResourceArnString
        var UseServiceLinkedRole: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: IAMRoleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterResourceResponse
    interface Resource {
        var Catalog: CatalogResource?
            get() = definedExternally
            set(value) = definedExternally
        var Database: DatabaseResource?
            get() = definedExternally
            set(value) = definedExternally
        var Table: TableResource?
            get() = definedExternally
            set(value) = definedExternally
        var TableWithColumns: TableWithColumnsResource?
            get() = definedExternally
            set(value) = definedExternally
        var DataLocation: DataLocationResource?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceInfo {
        var ResourceArn: ResourceArnString?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: IAMRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var LastModified: LastModifiedTimestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RevokePermissionsRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var Principal: DataLakePrincipal
        var Resource: Resource
        var Permissions: PermissionList
        var PermissionsWithGrantOption: PermissionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RevokePermissionsResponse
    interface TableResource {
        var DatabaseName: NameString
        var Name: NameString
    }
    interface TableWithColumnsResource {
        var DatabaseName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var ColumnNames: ColumnNames?
            get() = definedExternally
            set(value) = definedExternally
        var ColumnWildcard: ColumnWildcard?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateResourceRequest {
        var RoleArn: IAMRoleArn
        var ResourceArn: ResourceArnString
    }
    interface UpdateResourceResponse
    interface ClientApiVersions {
        var apiVersion: String /* "2017-03-31" | "latest" | String */
    }
}