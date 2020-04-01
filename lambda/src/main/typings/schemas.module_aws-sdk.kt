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
import Schemas.DiscovererSummary
import Schemas.RegistrySummary
import Schemas.SchemaSummary
import Schemas.SchemaVersionSummary
import Schemas.SearchSchemaSummary
import Schemas.SearchSchemaVersionSummary
import Schemas.CreateDiscovererRequest
import Schemas.CreateDiscovererResponse
import Schemas.CreateRegistryRequest
import Schemas.CreateRegistryResponse
import Schemas.CreateSchemaRequest
import Schemas.CreateSchemaResponse
import Schemas.DeleteDiscovererRequest
import Schemas.DeleteRegistryRequest
import Schemas.DeleteSchemaRequest
import Schemas.DeleteSchemaVersionRequest
import Schemas.DescribeCodeBindingRequest
import Schemas.DescribeCodeBindingResponse
import Schemas.DescribeDiscovererRequest
import Schemas.DescribeDiscovererResponse
import Schemas.DescribeRegistryRequest
import Schemas.DescribeRegistryResponse
import Schemas.DescribeSchemaRequest
import Schemas.DescribeSchemaResponse
import Schemas.GetCodeBindingSourceRequest
import Schemas.GetCodeBindingSourceResponse
import Schemas.GetDiscoveredSchemaRequest
import Schemas.GetDiscoveredSchemaResponse
import Schemas.ListDiscoverersRequest
import Schemas.ListDiscoverersResponse
import Schemas.ListRegistriesRequest
import Schemas.ListRegistriesResponse
import Schemas.ListSchemaVersionsRequest
import Schemas.ListSchemaVersionsResponse
import Schemas.ListSchemasRequest
import Schemas.ListSchemasResponse
import Schemas.ListTagsForResourceRequest
import Schemas.ListTagsForResourceResponse
import Schemas.LockServiceLinkedRoleRequest
import Schemas.LockServiceLinkedRoleResponse
import Schemas.PutCodeBindingRequest
import Schemas.PutCodeBindingResponse
import Schemas.SearchSchemasRequest
import Schemas.SearchSchemasResponse
import Schemas.StartDiscovererRequest
import Schemas.StartDiscovererResponse
import Schemas.StopDiscovererRequest
import Schemas.StopDiscovererResponse
import Schemas.TagResourceRequest
import Schemas.UnlockServiceLinkedRoleRequest
import Schemas.UnlockServiceLinkedRoleResponse
import Schemas.UntagResourceRequest
import Schemas.UpdateDiscovererRequest
import Schemas.UpdateDiscovererResponse
import Schemas.UpdateRegistryRequest
import Schemas.UpdateRegistryResponse
import Schemas.UpdateSchemaRequest
import Schemas.UpdateSchemaResponse
import Schemas.Tags

typealias GetDiscoveredSchemaVersionItemInput = String

typealias __boolean = Boolean

typealias __integer = Number

typealias __integerMin1Max29000 = Number

typealias __listOfDiscovererSummary = Array<DiscovererSummary>

typealias __listOfGetDiscoveredSchemaVersionItemInput = Array<GetDiscoveredSchemaVersionItemInput>

typealias __listOfRegistrySummary = Array<RegistrySummary>

typealias __listOfSchemaSummary = Array<SchemaSummary>

typealias __listOfSchemaVersionSummary = Array<SchemaVersionSummary>

typealias __listOfSearchSchemaSummary = Array<SearchSchemaSummary>

typealias __listOfSearchSchemaVersionSummary = Array<SearchSchemaVersionSummary>

typealias __listOf__string = Array<__string>

typealias __long = Number

typealias __string = String

typealias __stringMin0Max256 = String

typealias __stringMin0Max36 = String

typealias __stringMin1Max100000 = String

typealias __stringMin1Max1600 = String

typealias __stringMin20Max1600 = String

typealias __timestampIso8601 = Date

@JsModule("aws-sdk")
external open class Schemas(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Schemas.Types.ClientConfiguration */
    open fun createDiscoverer(params: CreateDiscovererRequest, callback: (err: AWSError, data: CreateDiscovererResponse) -> Unit = definedExternally): Request<CreateDiscovererResponse, AWSError>
    open fun createDiscoverer(callback: (err: AWSError, data: CreateDiscovererResponse) -> Unit = definedExternally): Request<CreateDiscovererResponse, AWSError>
    open fun createRegistry(params: CreateRegistryRequest, callback: (err: AWSError, data: CreateRegistryResponse) -> Unit = definedExternally): Request<CreateRegistryResponse, AWSError>
    open fun createRegistry(callback: (err: AWSError, data: CreateRegistryResponse) -> Unit = definedExternally): Request<CreateRegistryResponse, AWSError>
    open fun createSchema(params: CreateSchemaRequest, callback: (err: AWSError, data: CreateSchemaResponse) -> Unit = definedExternally): Request<CreateSchemaResponse, AWSError>
    open fun createSchema(callback: (err: AWSError, data: CreateSchemaResponse) -> Unit = definedExternally): Request<CreateSchemaResponse, AWSError>
    open fun deleteDiscoverer(params: DeleteDiscovererRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDiscoverer(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRegistry(params: DeleteRegistryRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRegistry(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSchema(params: DeleteSchemaRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSchema(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSchemaVersion(params: DeleteSchemaVersionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSchemaVersion(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeCodeBinding(params: DescribeCodeBindingRequest, callback: (err: AWSError, data: DescribeCodeBindingResponse) -> Unit = definedExternally): Request<DescribeCodeBindingResponse, AWSError>
    open fun describeCodeBinding(callback: (err: AWSError, data: DescribeCodeBindingResponse) -> Unit = definedExternally): Request<DescribeCodeBindingResponse, AWSError>
    open fun describeDiscoverer(params: DescribeDiscovererRequest, callback: (err: AWSError, data: DescribeDiscovererResponse) -> Unit = definedExternally): Request<DescribeDiscovererResponse, AWSError>
    open fun describeDiscoverer(callback: (err: AWSError, data: DescribeDiscovererResponse) -> Unit = definedExternally): Request<DescribeDiscovererResponse, AWSError>
    open fun describeRegistry(params: DescribeRegistryRequest, callback: (err: AWSError, data: DescribeRegistryResponse) -> Unit = definedExternally): Request<DescribeRegistryResponse, AWSError>
    open fun describeRegistry(callback: (err: AWSError, data: DescribeRegistryResponse) -> Unit = definedExternally): Request<DescribeRegistryResponse, AWSError>
    open fun describeSchema(params: DescribeSchemaRequest, callback: (err: AWSError, data: DescribeSchemaResponse) -> Unit = definedExternally): Request<DescribeSchemaResponse, AWSError>
    open fun describeSchema(callback: (err: AWSError, data: DescribeSchemaResponse) -> Unit = definedExternally): Request<DescribeSchemaResponse, AWSError>
    open fun getCodeBindingSource(params: GetCodeBindingSourceRequest, callback: (err: AWSError, data: GetCodeBindingSourceResponse) -> Unit = definedExternally): Request<GetCodeBindingSourceResponse, AWSError>
    open fun getCodeBindingSource(callback: (err: AWSError, data: GetCodeBindingSourceResponse) -> Unit = definedExternally): Request<GetCodeBindingSourceResponse, AWSError>
    open fun getDiscoveredSchema(params: GetDiscoveredSchemaRequest, callback: (err: AWSError, data: GetDiscoveredSchemaResponse) -> Unit = definedExternally): Request<GetDiscoveredSchemaResponse, AWSError>
    open fun getDiscoveredSchema(callback: (err: AWSError, data: GetDiscoveredSchemaResponse) -> Unit = definedExternally): Request<GetDiscoveredSchemaResponse, AWSError>
    open fun listDiscoverers(params: ListDiscoverersRequest, callback: (err: AWSError, data: ListDiscoverersResponse) -> Unit = definedExternally): Request<ListDiscoverersResponse, AWSError>
    open fun listDiscoverers(callback: (err: AWSError, data: ListDiscoverersResponse) -> Unit = definedExternally): Request<ListDiscoverersResponse, AWSError>
    open fun listRegistries(params: ListRegistriesRequest, callback: (err: AWSError, data: ListRegistriesResponse) -> Unit = definedExternally): Request<ListRegistriesResponse, AWSError>
    open fun listRegistries(callback: (err: AWSError, data: ListRegistriesResponse) -> Unit = definedExternally): Request<ListRegistriesResponse, AWSError>
    open fun listSchemaVersions(params: ListSchemaVersionsRequest, callback: (err: AWSError, data: ListSchemaVersionsResponse) -> Unit = definedExternally): Request<ListSchemaVersionsResponse, AWSError>
    open fun listSchemaVersions(callback: (err: AWSError, data: ListSchemaVersionsResponse) -> Unit = definedExternally): Request<ListSchemaVersionsResponse, AWSError>
    open fun listSchemas(params: ListSchemasRequest, callback: (err: AWSError, data: ListSchemasResponse) -> Unit = definedExternally): Request<ListSchemasResponse, AWSError>
    open fun listSchemas(callback: (err: AWSError, data: ListSchemasResponse) -> Unit = definedExternally): Request<ListSchemasResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun lockServiceLinkedRole(params: LockServiceLinkedRoleRequest, callback: (err: AWSError, data: LockServiceLinkedRoleResponse) -> Unit = definedExternally): Request<LockServiceLinkedRoleResponse, AWSError>
    open fun lockServiceLinkedRole(callback: (err: AWSError, data: LockServiceLinkedRoleResponse) -> Unit = definedExternally): Request<LockServiceLinkedRoleResponse, AWSError>
    open fun putCodeBinding(params: PutCodeBindingRequest, callback: (err: AWSError, data: PutCodeBindingResponse) -> Unit = definedExternally): Request<PutCodeBindingResponse, AWSError>
    open fun putCodeBinding(callback: (err: AWSError, data: PutCodeBindingResponse) -> Unit = definedExternally): Request<PutCodeBindingResponse, AWSError>
    open fun searchSchemas(params: SearchSchemasRequest, callback: (err: AWSError, data: SearchSchemasResponse) -> Unit = definedExternally): Request<SearchSchemasResponse, AWSError>
    open fun searchSchemas(callback: (err: AWSError, data: SearchSchemasResponse) -> Unit = definedExternally): Request<SearchSchemasResponse, AWSError>
    open fun startDiscoverer(params: StartDiscovererRequest, callback: (err: AWSError, data: StartDiscovererResponse) -> Unit = definedExternally): Request<StartDiscovererResponse, AWSError>
    open fun startDiscoverer(callback: (err: AWSError, data: StartDiscovererResponse) -> Unit = definedExternally): Request<StartDiscovererResponse, AWSError>
    open fun stopDiscoverer(params: StopDiscovererRequest, callback: (err: AWSError, data: StopDiscovererResponse) -> Unit = definedExternally): Request<StopDiscovererResponse, AWSError>
    open fun stopDiscoverer(callback: (err: AWSError, data: StopDiscovererResponse) -> Unit = definedExternally): Request<StopDiscovererResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun unlockServiceLinkedRole(params: UnlockServiceLinkedRoleRequest, callback: (err: AWSError, data: UnlockServiceLinkedRoleResponse) -> Unit = definedExternally): Request<UnlockServiceLinkedRoleResponse, AWSError>
    open fun unlockServiceLinkedRole(callback: (err: AWSError, data: UnlockServiceLinkedRoleResponse) -> Unit = definedExternally): Request<UnlockServiceLinkedRoleResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateDiscoverer(params: UpdateDiscovererRequest, callback: (err: AWSError, data: UpdateDiscovererResponse) -> Unit = definedExternally): Request<UpdateDiscovererResponse, AWSError>
    open fun updateDiscoverer(callback: (err: AWSError, data: UpdateDiscovererResponse) -> Unit = definedExternally): Request<UpdateDiscovererResponse, AWSError>
    open fun updateRegistry(params: UpdateRegistryRequest, callback: (err: AWSError, data: UpdateRegistryResponse) -> Unit = definedExternally): Request<UpdateRegistryResponse, AWSError>
    open fun updateRegistry(callback: (err: AWSError, data: UpdateRegistryResponse) -> Unit = definedExternally): Request<UpdateRegistryResponse, AWSError>
    open fun updateSchema(params: UpdateSchemaRequest, callback: (err: AWSError, data: UpdateSchemaResponse) -> Unit = definedExternally): Request<UpdateSchemaResponse, AWSError>
    open fun updateSchema(callback: (err: AWSError, data: UpdateSchemaResponse) -> Unit = definedExternally): Request<UpdateSchemaResponse, AWSError>
    open fun waitFor(state: String /* "codeBindingExists" */, params: DescribeCodeBindingRequest /* Schemas.Types.DescribeCodeBindingRequest & `T$0` */, callback: (err: AWSError, data: DescribeCodeBindingResponse) -> Unit = definedExternally): Request<DescribeCodeBindingResponse, AWSError>
    open fun waitFor(state: String /* "codeBindingExists" */, callback: (err: AWSError, data: DescribeCodeBindingResponse) -> Unit = definedExternally): Request<DescribeCodeBindingResponse, AWSError>
    interface CreateDiscovererRequest {
        var Description: __stringMin0Max256?
            get() = definedExternally
            set(value) = definedExternally
        var SourceArn: __stringMin20Max1600
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDiscovererResponse {
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DiscovererArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DiscovererId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SourceArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "STARTED" | "STOPPED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRegistryRequest {
        var Description: __stringMin0Max256?
            get() = definedExternally
            set(value) = definedExternally
        var RegistryName: __string
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRegistryResponse {
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RegistryArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RegistryName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSchemaRequest {
        var Content: __stringMin1Max100000
        var Description: __stringMin0Max256?
            get() = definedExternally
            set(value) = definedExternally
        var RegistryName: __string
        var SchemaName: __string
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "OpenApi3" | String */
    }
    interface CreateSchemaResponse {
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastModified: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var Type: __string?
            get() = definedExternally
            set(value) = definedExternally
        var VersionCreatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDiscovererRequest {
        var DiscovererId: __string
    }
    interface DeleteRegistryRequest {
        var RegistryName: __string
    }
    interface DeleteSchemaRequest {
        var RegistryName: __string
        var SchemaName: __string
    }
    interface DeleteSchemaVersionRequest {
        var RegistryName: __string
        var SchemaName: __string
        var SchemaVersion: __string
    }
    interface DescribeCodeBindingRequest {
        var Language: __string
        var RegistryName: __string
        var SchemaName: __string
        var SchemaVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCodeBindingResponse {
        var CreationDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var LastModified: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATE_IN_PROGRESS" | "CREATE_COMPLETE" | "CREATE_FAILED" | String */
    }
    interface DescribeDiscovererRequest {
        var DiscovererId: __string
    }
    interface DescribeDiscovererResponse {
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DiscovererArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DiscovererId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SourceArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "STARTED" | "STOPPED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRegistryRequest {
        var RegistryName: __string
    }
    interface DescribeRegistryResponse {
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RegistryArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RegistryName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSchemaRequest {
        var RegistryName: __string
        var SchemaName: __string
        var SchemaVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSchemaResponse {
        var Content: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastModified: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var Type: __string?
            get() = definedExternally
            set(value) = definedExternally
        var VersionCreatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DiscovererSummary {
        var DiscovererArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DiscovererId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SourceArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "STARTED" | "STOPPED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCodeBindingSourceRequest {
        var Language: __string
        var RegistryName: __string
        var SchemaName: __string
        var SchemaVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCodeBindingSourceResponse {
        var Body: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDiscoveredSchemaRequest {
        var Events: __listOfGetDiscoveredSchemaVersionItemInput
        var Type: String /* "OpenApi3" | String */
    }
    interface GetDiscoveredSchemaResponse {
        var Content: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDiscoverersRequest {
        var DiscovererIdPrefix: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SourceArnPrefix: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDiscoverersResponse {
        var Discoverers: __listOfDiscovererSummary?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRegistriesRequest {
        var Limit: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RegistryNamePrefix: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Scope: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRegistriesResponse {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Registries: __listOfRegistrySummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSchemaVersionsRequest {
        var Limit: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RegistryName: __string
        var SchemaName: __string
    }
    interface ListSchemaVersionsResponse {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaVersions: __listOfSchemaVersionSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSchemasRequest {
        var Limit: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RegistryName: __string
        var SchemaNamePrefix: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSchemasResponse {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Schemas: __listOfSchemaSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: __string
    }
    interface ListTagsForResourceResponse {
        var Tags: Tags
    }
    interface LockServiceLinkedRoleRequest {
        var RoleArn: __stringMin1Max1600
        var Timeout: __integerMin1Max29000
    }
    interface LockServiceLinkedRoleResponse {
        var CanBeDeleted: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ReasonOfFailure: __stringMin1Max1600?
            get() = definedExternally
            set(value) = definedExternally
        var RelatedResources: __listOfDiscovererSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutCodeBindingRequest {
        var Language: __string
        var RegistryName: __string
        var SchemaName: __string
        var SchemaVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutCodeBindingResponse {
        var CreationDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var LastModified: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATE_IN_PROGRESS" | "CREATE_COMPLETE" | "CREATE_FAILED" | String */
    }
    interface RegistrySummary {
        var RegistryArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RegistryName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SchemaSummary {
        var LastModified: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var VersionCount: __long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SchemaVersionSummary {
        var SchemaArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchSchemaSummary {
        var RegistryName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaVersions: __listOfSearchSchemaVersionSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchSchemaVersionSummary {
        var CreatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchSchemasRequest {
        var Keywords: __string
        var Limit: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RegistryName: __string
    }
    interface SearchSchemasResponse {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Schemas: __listOfSearchSchemaSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartDiscovererRequest {
        var DiscovererId: __string
    }
    interface StartDiscovererResponse {
        var DiscovererId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "STARTED" | "STOPPED" | String */
    }
    interface StopDiscovererRequest {
        var DiscovererId: __string
    }
    interface StopDiscovererResponse {
        var DiscovererId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "STARTED" | "STOPPED" | String */
    }
    interface TagResourceRequest {
        var ResourceArn: __string
        var Tags: Tags
    }
    interface Tags {
        @nativeGetter
        operator fun get(key: String): __string?
        @nativeSetter
        operator fun set(key: String, value: __string)
    }
    interface UnlockServiceLinkedRoleRequest {
        var RoleArn: __stringMin1Max1600
    }
    interface UnlockServiceLinkedRoleResponse
    interface UntagResourceRequest {
        var ResourceArn: __string
        var TagKeys: __listOf__string
    }
    interface UpdateDiscovererRequest {
        var Description: __stringMin0Max256?
            get() = definedExternally
            set(value) = definedExternally
        var DiscovererId: __string
    }
    interface UpdateDiscovererResponse {
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DiscovererArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DiscovererId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SourceArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "STARTED" | "STOPPED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRegistryRequest {
        var Description: __stringMin0Max256?
            get() = definedExternally
            set(value) = definedExternally
        var RegistryName: __string
    }
    interface UpdateRegistryResponse {
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RegistryArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RegistryName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSchemaRequest {
        var ClientTokenId: __stringMin0Max36?
            get() = definedExternally
            set(value) = definedExternally
        var Content: __stringMin1Max100000?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __stringMin0Max256?
            get() = definedExternally
            set(value) = definedExternally
        var RegistryName: __string
        var SchemaName: __string
        var Type: String /* "OpenApi3" | String */
    }
    interface UpdateSchemaResponse {
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastModified: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var Type: __string?
            get() = definedExternally
            set(value) = definedExternally
        var VersionCreatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-12-02" | "latest" | String */
    }
}