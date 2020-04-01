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
import AppSync.AdditionalAuthenticationProvider
import AppSync.ApiKey
import AppSync.DataSource
import AppSync.FunctionConfiguration
import AppSync.GraphqlApi
import AppSync.Resolver
import AppSync.Type
import AppSync.CreateApiCacheRequest
import AppSync.CreateApiCacheResponse
import AppSync.CreateApiKeyRequest
import AppSync.CreateApiKeyResponse
import AppSync.CreateDataSourceRequest
import AppSync.CreateDataSourceResponse
import AppSync.CreateFunctionRequest
import AppSync.CreateFunctionResponse
import AppSync.CreateGraphqlApiRequest
import AppSync.CreateGraphqlApiResponse
import AppSync.CreateResolverRequest
import AppSync.CreateResolverResponse
import AppSync.CreateTypeRequest
import AppSync.CreateTypeResponse
import AppSync.DeleteApiCacheRequest
import AppSync.DeleteApiCacheResponse
import AppSync.DeleteApiKeyRequest
import AppSync.DeleteApiKeyResponse
import AppSync.DeleteDataSourceRequest
import AppSync.DeleteDataSourceResponse
import AppSync.DeleteFunctionRequest
import AppSync.DeleteFunctionResponse
import AppSync.DeleteGraphqlApiRequest
import AppSync.DeleteGraphqlApiResponse
import AppSync.DeleteResolverRequest
import AppSync.DeleteResolverResponse
import AppSync.DeleteTypeRequest
import AppSync.DeleteTypeResponse
import AppSync.FlushApiCacheRequest
import AppSync.FlushApiCacheResponse
import AppSync.GetApiCacheRequest
import AppSync.GetApiCacheResponse
import AppSync.GetDataSourceRequest
import AppSync.GetDataSourceResponse
import AppSync.GetFunctionRequest
import AppSync.GetFunctionResponse
import AppSync.GetGraphqlApiRequest
import AppSync.GetGraphqlApiResponse
import AppSync.GetIntrospectionSchemaRequest
import AppSync.GetIntrospectionSchemaResponse
import AppSync.GetResolverRequest
import AppSync.GetResolverResponse
import AppSync.GetSchemaCreationStatusRequest
import AppSync.GetSchemaCreationStatusResponse
import AppSync.GetTypeRequest
import AppSync.GetTypeResponse
import AppSync.ListApiKeysRequest
import AppSync.ListApiKeysResponse
import AppSync.ListDataSourcesRequest
import AppSync.ListDataSourcesResponse
import AppSync.ListFunctionsRequest
import AppSync.ListFunctionsResponse
import AppSync.ListGraphqlApisRequest
import AppSync.ListGraphqlApisResponse
import AppSync.ListResolversRequest
import AppSync.ListResolversResponse
import AppSync.ListResolversByFunctionRequest
import AppSync.ListResolversByFunctionResponse
import AppSync.ListTagsForResourceRequest
import AppSync.ListTagsForResourceResponse
import AppSync.ListTypesRequest
import AppSync.ListTypesResponse
import AppSync.StartSchemaCreationRequest
import AppSync.StartSchemaCreationResponse
import AppSync.TagResourceRequest
import AppSync.TagResourceResponse
import AppSync.UntagResourceRequest
import AppSync.UntagResourceResponse
import AppSync.UpdateApiCacheRequest
import AppSync.UpdateApiCacheResponse
import AppSync.UpdateApiKeyRequest
import AppSync.UpdateApiKeyResponse
import AppSync.UpdateDataSourceRequest
import AppSync.UpdateDataSourceResponse
import AppSync.UpdateFunctionRequest
import AppSync.UpdateFunctionResponse
import AppSync.UpdateGraphqlApiRequest
import AppSync.UpdateGraphqlApiResponse
import AppSync.UpdateResolverRequest
import AppSync.UpdateResolverResponse
import AppSync.UpdateTypeRequest
import AppSync.UpdateTypeResponse
import AppSync.OpenIDConnectConfig
import AppSync.CognitoUserPoolConfig
import AppSync.AwsIamConfig
import AppSync.ApiCache
import AppSync.DynamodbDataSourceConfig
import AppSync.LambdaDataSourceConfig
import AppSync.ElasticsearchDataSourceConfig
import AppSync.HttpDataSourceConfig
import AppSync.RelationalDatabaseDataSourceConfig
import AppSync.LogConfig
import AppSync.UserPoolConfig
import AppSync.TagMap
import AppSync.PipelineConfig
import AppSync.SyncConfig
import AppSync.CachingConfig
import AppSync.DeltaSyncConfig
import AppSync.MapOfStringToString
import AppSync.AuthorizationConfig
import AppSync.RdsHttpEndpointConfig
import AppSync.LambdaConflictHandlerConfig

typealias AdditionalAuthenticationProviders = Array<AdditionalAuthenticationProvider>

typealias ApiKeys = Array<ApiKey>

typealias Boolean = Boolean

typealias BooleanValue = Boolean

typealias CachingKeys = Array<String>

typealias DataSources = Array<DataSource>

typealias Functions = Array<FunctionConfiguration>

typealias FunctionsIds = Array<String>

typealias GraphqlApis = Array<GraphqlApi>

typealias Long = Number

typealias MappingTemplate = String

typealias MaxResults = Number

typealias PaginationToken = String

typealias Resolvers = Array<Resolver>

typealias ResourceArn = String

typealias ResourceName = String

typealias String = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagValue = String

typealias TypeList = Array<Type>

@JsModule("aws-sdk")
external open class AppSync(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & AppSync.Types.ClientConfiguration */
    open fun createApiCache(params: CreateApiCacheRequest, callback: (err: AWSError, data: CreateApiCacheResponse) -> Unit = definedExternally): Request<CreateApiCacheResponse, AWSError>
    open fun createApiCache(callback: (err: AWSError, data: CreateApiCacheResponse) -> Unit = definedExternally): Request<CreateApiCacheResponse, AWSError>
    open fun createApiKey(params: CreateApiKeyRequest, callback: (err: AWSError, data: CreateApiKeyResponse) -> Unit = definedExternally): Request<CreateApiKeyResponse, AWSError>
    open fun createApiKey(callback: (err: AWSError, data: CreateApiKeyResponse) -> Unit = definedExternally): Request<CreateApiKeyResponse, AWSError>
    open fun createDataSource(params: CreateDataSourceRequest, callback: (err: AWSError, data: CreateDataSourceResponse) -> Unit = definedExternally): Request<CreateDataSourceResponse, AWSError>
    open fun createDataSource(callback: (err: AWSError, data: CreateDataSourceResponse) -> Unit = definedExternally): Request<CreateDataSourceResponse, AWSError>
    open fun createFunction(params: CreateFunctionRequest, callback: (err: AWSError, data: CreateFunctionResponse) -> Unit = definedExternally): Request<CreateFunctionResponse, AWSError>
    open fun createFunction(callback: (err: AWSError, data: CreateFunctionResponse) -> Unit = definedExternally): Request<CreateFunctionResponse, AWSError>
    open fun createGraphqlApi(params: CreateGraphqlApiRequest, callback: (err: AWSError, data: CreateGraphqlApiResponse) -> Unit = definedExternally): Request<CreateGraphqlApiResponse, AWSError>
    open fun createGraphqlApi(callback: (err: AWSError, data: CreateGraphqlApiResponse) -> Unit = definedExternally): Request<CreateGraphqlApiResponse, AWSError>
    open fun createResolver(params: CreateResolverRequest, callback: (err: AWSError, data: CreateResolverResponse) -> Unit = definedExternally): Request<CreateResolverResponse, AWSError>
    open fun createResolver(callback: (err: AWSError, data: CreateResolverResponse) -> Unit = definedExternally): Request<CreateResolverResponse, AWSError>
    open fun createType(params: CreateTypeRequest, callback: (err: AWSError, data: CreateTypeResponse) -> Unit = definedExternally): Request<CreateTypeResponse, AWSError>
    open fun createType(callback: (err: AWSError, data: CreateTypeResponse) -> Unit = definedExternally): Request<CreateTypeResponse, AWSError>
    open fun deleteApiCache(params: DeleteApiCacheRequest, callback: (err: AWSError, data: DeleteApiCacheResponse) -> Unit = definedExternally): Request<DeleteApiCacheResponse, AWSError>
    open fun deleteApiCache(callback: (err: AWSError, data: DeleteApiCacheResponse) -> Unit = definedExternally): Request<DeleteApiCacheResponse, AWSError>
    open fun deleteApiKey(params: DeleteApiKeyRequest, callback: (err: AWSError, data: DeleteApiKeyResponse) -> Unit = definedExternally): Request<DeleteApiKeyResponse, AWSError>
    open fun deleteApiKey(callback: (err: AWSError, data: DeleteApiKeyResponse) -> Unit = definedExternally): Request<DeleteApiKeyResponse, AWSError>
    open fun deleteDataSource(params: DeleteDataSourceRequest, callback: (err: AWSError, data: DeleteDataSourceResponse) -> Unit = definedExternally): Request<DeleteDataSourceResponse, AWSError>
    open fun deleteDataSource(callback: (err: AWSError, data: DeleteDataSourceResponse) -> Unit = definedExternally): Request<DeleteDataSourceResponse, AWSError>
    open fun deleteFunction(params: DeleteFunctionRequest, callback: (err: AWSError, data: DeleteFunctionResponse) -> Unit = definedExternally): Request<DeleteFunctionResponse, AWSError>
    open fun deleteFunction(callback: (err: AWSError, data: DeleteFunctionResponse) -> Unit = definedExternally): Request<DeleteFunctionResponse, AWSError>
    open fun deleteGraphqlApi(params: DeleteGraphqlApiRequest, callback: (err: AWSError, data: DeleteGraphqlApiResponse) -> Unit = definedExternally): Request<DeleteGraphqlApiResponse, AWSError>
    open fun deleteGraphqlApi(callback: (err: AWSError, data: DeleteGraphqlApiResponse) -> Unit = definedExternally): Request<DeleteGraphqlApiResponse, AWSError>
    open fun deleteResolver(params: DeleteResolverRequest, callback: (err: AWSError, data: DeleteResolverResponse) -> Unit = definedExternally): Request<DeleteResolverResponse, AWSError>
    open fun deleteResolver(callback: (err: AWSError, data: DeleteResolverResponse) -> Unit = definedExternally): Request<DeleteResolverResponse, AWSError>
    open fun deleteType(params: DeleteTypeRequest, callback: (err: AWSError, data: DeleteTypeResponse) -> Unit = definedExternally): Request<DeleteTypeResponse, AWSError>
    open fun deleteType(callback: (err: AWSError, data: DeleteTypeResponse) -> Unit = definedExternally): Request<DeleteTypeResponse, AWSError>
    open fun flushApiCache(params: FlushApiCacheRequest, callback: (err: AWSError, data: FlushApiCacheResponse) -> Unit = definedExternally): Request<FlushApiCacheResponse, AWSError>
    open fun flushApiCache(callback: (err: AWSError, data: FlushApiCacheResponse) -> Unit = definedExternally): Request<FlushApiCacheResponse, AWSError>
    open fun getApiCache(params: GetApiCacheRequest, callback: (err: AWSError, data: GetApiCacheResponse) -> Unit = definedExternally): Request<GetApiCacheResponse, AWSError>
    open fun getApiCache(callback: (err: AWSError, data: GetApiCacheResponse) -> Unit = definedExternally): Request<GetApiCacheResponse, AWSError>
    open fun getDataSource(params: GetDataSourceRequest, callback: (err: AWSError, data: GetDataSourceResponse) -> Unit = definedExternally): Request<GetDataSourceResponse, AWSError>
    open fun getDataSource(callback: (err: AWSError, data: GetDataSourceResponse) -> Unit = definedExternally): Request<GetDataSourceResponse, AWSError>
    open fun getFunction(params: GetFunctionRequest, callback: (err: AWSError, data: GetFunctionResponse) -> Unit = definedExternally): Request<GetFunctionResponse, AWSError>
    open fun getFunction(callback: (err: AWSError, data: GetFunctionResponse) -> Unit = definedExternally): Request<GetFunctionResponse, AWSError>
    open fun getGraphqlApi(params: GetGraphqlApiRequest, callback: (err: AWSError, data: GetGraphqlApiResponse) -> Unit = definedExternally): Request<GetGraphqlApiResponse, AWSError>
    open fun getGraphqlApi(callback: (err: AWSError, data: GetGraphqlApiResponse) -> Unit = definedExternally): Request<GetGraphqlApiResponse, AWSError>
    open fun getIntrospectionSchema(params: GetIntrospectionSchemaRequest, callback: (err: AWSError, data: GetIntrospectionSchemaResponse) -> Unit = definedExternally): Request<GetIntrospectionSchemaResponse, AWSError>
    open fun getIntrospectionSchema(callback: (err: AWSError, data: GetIntrospectionSchemaResponse) -> Unit = definedExternally): Request<GetIntrospectionSchemaResponse, AWSError>
    open fun getResolver(params: GetResolverRequest, callback: (err: AWSError, data: GetResolverResponse) -> Unit = definedExternally): Request<GetResolverResponse, AWSError>
    open fun getResolver(callback: (err: AWSError, data: GetResolverResponse) -> Unit = definedExternally): Request<GetResolverResponse, AWSError>
    open fun getSchemaCreationStatus(params: GetSchemaCreationStatusRequest, callback: (err: AWSError, data: GetSchemaCreationStatusResponse) -> Unit = definedExternally): Request<GetSchemaCreationStatusResponse, AWSError>
    open fun getSchemaCreationStatus(callback: (err: AWSError, data: GetSchemaCreationStatusResponse) -> Unit = definedExternally): Request<GetSchemaCreationStatusResponse, AWSError>
    open fun getType(params: GetTypeRequest, callback: (err: AWSError, data: GetTypeResponse) -> Unit = definedExternally): Request<GetTypeResponse, AWSError>
    open fun getType(callback: (err: AWSError, data: GetTypeResponse) -> Unit = definedExternally): Request<GetTypeResponse, AWSError>
    open fun listApiKeys(params: ListApiKeysRequest, callback: (err: AWSError, data: ListApiKeysResponse) -> Unit = definedExternally): Request<ListApiKeysResponse, AWSError>
    open fun listApiKeys(callback: (err: AWSError, data: ListApiKeysResponse) -> Unit = definedExternally): Request<ListApiKeysResponse, AWSError>
    open fun listDataSources(params: ListDataSourcesRequest, callback: (err: AWSError, data: ListDataSourcesResponse) -> Unit = definedExternally): Request<ListDataSourcesResponse, AWSError>
    open fun listDataSources(callback: (err: AWSError, data: ListDataSourcesResponse) -> Unit = definedExternally): Request<ListDataSourcesResponse, AWSError>
    open fun listFunctions(params: ListFunctionsRequest, callback: (err: AWSError, data: ListFunctionsResponse) -> Unit = definedExternally): Request<ListFunctionsResponse, AWSError>
    open fun listFunctions(callback: (err: AWSError, data: ListFunctionsResponse) -> Unit = definedExternally): Request<ListFunctionsResponse, AWSError>
    open fun listGraphqlApis(params: ListGraphqlApisRequest, callback: (err: AWSError, data: ListGraphqlApisResponse) -> Unit = definedExternally): Request<ListGraphqlApisResponse, AWSError>
    open fun listGraphqlApis(callback: (err: AWSError, data: ListGraphqlApisResponse) -> Unit = definedExternally): Request<ListGraphqlApisResponse, AWSError>
    open fun listResolvers(params: ListResolversRequest, callback: (err: AWSError, data: ListResolversResponse) -> Unit = definedExternally): Request<ListResolversResponse, AWSError>
    open fun listResolvers(callback: (err: AWSError, data: ListResolversResponse) -> Unit = definedExternally): Request<ListResolversResponse, AWSError>
    open fun listResolversByFunction(params: ListResolversByFunctionRequest, callback: (err: AWSError, data: ListResolversByFunctionResponse) -> Unit = definedExternally): Request<ListResolversByFunctionResponse, AWSError>
    open fun listResolversByFunction(callback: (err: AWSError, data: ListResolversByFunctionResponse) -> Unit = definedExternally): Request<ListResolversByFunctionResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTypes(params: ListTypesRequest, callback: (err: AWSError, data: ListTypesResponse) -> Unit = definedExternally): Request<ListTypesResponse, AWSError>
    open fun listTypes(callback: (err: AWSError, data: ListTypesResponse) -> Unit = definedExternally): Request<ListTypesResponse, AWSError>
    open fun startSchemaCreation(params: StartSchemaCreationRequest, callback: (err: AWSError, data: StartSchemaCreationResponse) -> Unit = definedExternally): Request<StartSchemaCreationResponse, AWSError>
    open fun startSchemaCreation(callback: (err: AWSError, data: StartSchemaCreationResponse) -> Unit = definedExternally): Request<StartSchemaCreationResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateApiCache(params: UpdateApiCacheRequest, callback: (err: AWSError, data: UpdateApiCacheResponse) -> Unit = definedExternally): Request<UpdateApiCacheResponse, AWSError>
    open fun updateApiCache(callback: (err: AWSError, data: UpdateApiCacheResponse) -> Unit = definedExternally): Request<UpdateApiCacheResponse, AWSError>
    open fun updateApiKey(params: UpdateApiKeyRequest, callback: (err: AWSError, data: UpdateApiKeyResponse) -> Unit = definedExternally): Request<UpdateApiKeyResponse, AWSError>
    open fun updateApiKey(callback: (err: AWSError, data: UpdateApiKeyResponse) -> Unit = definedExternally): Request<UpdateApiKeyResponse, AWSError>
    open fun updateDataSource(params: UpdateDataSourceRequest, callback: (err: AWSError, data: UpdateDataSourceResponse) -> Unit = definedExternally): Request<UpdateDataSourceResponse, AWSError>
    open fun updateDataSource(callback: (err: AWSError, data: UpdateDataSourceResponse) -> Unit = definedExternally): Request<UpdateDataSourceResponse, AWSError>
    open fun updateFunction(params: UpdateFunctionRequest, callback: (err: AWSError, data: UpdateFunctionResponse) -> Unit = definedExternally): Request<UpdateFunctionResponse, AWSError>
    open fun updateFunction(callback: (err: AWSError, data: UpdateFunctionResponse) -> Unit = definedExternally): Request<UpdateFunctionResponse, AWSError>
    open fun updateGraphqlApi(params: UpdateGraphqlApiRequest, callback: (err: AWSError, data: UpdateGraphqlApiResponse) -> Unit = definedExternally): Request<UpdateGraphqlApiResponse, AWSError>
    open fun updateGraphqlApi(callback: (err: AWSError, data: UpdateGraphqlApiResponse) -> Unit = definedExternally): Request<UpdateGraphqlApiResponse, AWSError>
    open fun updateResolver(params: UpdateResolverRequest, callback: (err: AWSError, data: UpdateResolverResponse) -> Unit = definedExternally): Request<UpdateResolverResponse, AWSError>
    open fun updateResolver(callback: (err: AWSError, data: UpdateResolverResponse) -> Unit = definedExternally): Request<UpdateResolverResponse, AWSError>
    open fun updateType(params: UpdateTypeRequest, callback: (err: AWSError, data: UpdateTypeResponse) -> Unit = definedExternally): Request<UpdateTypeResponse, AWSError>
    open fun updateType(callback: (err: AWSError, data: UpdateTypeResponse) -> Unit = definedExternally): Request<UpdateTypeResponse, AWSError>
    interface AdditionalAuthenticationProvider {
        var authenticationType: String /* "API_KEY" | "AWS_IAM" | "AMAZON_COGNITO_USER_POOLS" | "OPENID_CONNECT" | String */
        var openIDConnectConfig: OpenIDConnectConfig?
            get() = definedExternally
            set(value) = definedExternally
        var userPoolConfig: CognitoUserPoolConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApiCache {
        var ttl: Long?
            get() = definedExternally
            set(value) = definedExternally
        var apiCachingBehavior: String /* "FULL_REQUEST_CACHING" | "PER_RESOLVER_CACHING" | String */
        var transitEncryptionEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var atRestEncryptionEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "T2_SMALL" | "T2_MEDIUM" | "R4_LARGE" | "R4_XLARGE" | "R4_2XLARGE" | "R4_4XLARGE" | "R4_8XLARGE" | String */
        var status: String /* "AVAILABLE" | "CREATING" | "DELETING" | "MODIFYING" | "FAILED" | String */
    }
    interface ApiKey {
        var id: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var expires: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AuthorizationConfig {
        var authorizationType: String /* "AWS_IAM" | String */
        var awsIamConfig: AwsIamConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsIamConfig {
        var signingRegion: String?
            get() = definedExternally
            set(value) = definedExternally
        var signingServiceName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CachingConfig {
        var ttl: Long?
            get() = definedExternally
            set(value) = definedExternally
        var cachingKeys: CachingKeys?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CognitoUserPoolConfig {
        var userPoolId: String
        var awsRegion: String
        var appIdClientRegex: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateApiCacheRequest {
        var apiId: String
        var ttl: Long
        var transitEncryptionEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var atRestEncryptionEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var apiCachingBehavior: String /* "FULL_REQUEST_CACHING" | "PER_RESOLVER_CACHING" | String */
        var type: String /* "T2_SMALL" | "T2_MEDIUM" | "R4_LARGE" | "R4_XLARGE" | "R4_2XLARGE" | "R4_4XLARGE" | "R4_8XLARGE" | String */
    }
    interface CreateApiCacheResponse {
        var apiCache: ApiCache?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateApiKeyRequest {
        var apiId: String
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var expires: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateApiKeyResponse {
        var apiKey: ApiKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDataSourceRequest {
        var apiId: String
        var name: ResourceName
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "AWS_LAMBDA" | "AMAZON_DYNAMODB" | "AMAZON_ELASTICSEARCH" | "NONE" | "HTTP" | "RELATIONAL_DATABASE" | String */
        var serviceRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var dynamodbConfig: DynamodbDataSourceConfig?
            get() = definedExternally
            set(value) = definedExternally
        var lambdaConfig: LambdaDataSourceConfig?
            get() = definedExternally
            set(value) = definedExternally
        var elasticsearchConfig: ElasticsearchDataSourceConfig?
            get() = definedExternally
            set(value) = definedExternally
        var httpConfig: HttpDataSourceConfig?
            get() = definedExternally
            set(value) = definedExternally
        var relationalDatabaseConfig: RelationalDatabaseDataSourceConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDataSourceResponse {
        var dataSource: DataSource?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFunctionRequest {
        var apiId: String
        var name: ResourceName
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var dataSourceName: ResourceName
        var requestMappingTemplate: MappingTemplate
        var responseMappingTemplate: MappingTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var functionVersion: String
    }
    interface CreateFunctionResponse {
        var functionConfiguration: FunctionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGraphqlApiRequest {
        var name: String
        var logConfig: LogConfig?
            get() = definedExternally
            set(value) = definedExternally
        var authenticationType: String /* "API_KEY" | "AWS_IAM" | "AMAZON_COGNITO_USER_POOLS" | "OPENID_CONNECT" | String */
        var userPoolConfig: UserPoolConfig?
            get() = definedExternally
            set(value) = definedExternally
        var openIDConnectConfig: OpenIDConnectConfig?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var additionalAuthenticationProviders: AdditionalAuthenticationProviders?
            get() = definedExternally
            set(value) = definedExternally
        var xrayEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGraphqlApiResponse {
        var graphqlApi: GraphqlApi?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateResolverRequest {
        var apiId: String
        var typeName: ResourceName
        var fieldName: ResourceName
        var dataSourceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var requestMappingTemplate: MappingTemplate
        var responseMappingTemplate: MappingTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var kind: String /* "UNIT" | "PIPELINE" | String */
        var pipelineConfig: PipelineConfig?
            get() = definedExternally
            set(value) = definedExternally
        var syncConfig: SyncConfig?
            get() = definedExternally
            set(value) = definedExternally
        var cachingConfig: CachingConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateResolverResponse {
        var resolver: Resolver?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTypeRequest {
        var apiId: String
        var definition: String
        var format: String /* "SDL" | "JSON" | String */
    }
    interface CreateTypeResponse {
        var type: Type?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataSource {
        var dataSourceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "AWS_LAMBDA" | "AMAZON_DYNAMODB" | "AMAZON_ELASTICSEARCH" | "NONE" | "HTTP" | "RELATIONAL_DATABASE" | String */
        var serviceRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var dynamodbConfig: DynamodbDataSourceConfig?
            get() = definedExternally
            set(value) = definedExternally
        var lambdaConfig: LambdaDataSourceConfig?
            get() = definedExternally
            set(value) = definedExternally
        var elasticsearchConfig: ElasticsearchDataSourceConfig?
            get() = definedExternally
            set(value) = definedExternally
        var httpConfig: HttpDataSourceConfig?
            get() = definedExternally
            set(value) = definedExternally
        var relationalDatabaseConfig: RelationalDatabaseDataSourceConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteApiCacheRequest {
        var apiId: String
    }
    interface DeleteApiCacheResponse
    interface DeleteApiKeyRequest {
        var apiId: String
        var id: String
    }
    interface DeleteApiKeyResponse
    interface DeleteDataSourceRequest {
        var apiId: String
        var name: ResourceName
    }
    interface DeleteDataSourceResponse
    interface DeleteFunctionRequest {
        var apiId: String
        var functionId: ResourceName
    }
    interface DeleteFunctionResponse
    interface DeleteGraphqlApiRequest {
        var apiId: String
    }
    interface DeleteGraphqlApiResponse
    interface DeleteResolverRequest {
        var apiId: String
        var typeName: ResourceName
        var fieldName: ResourceName
    }
    interface DeleteResolverResponse
    interface DeleteTypeRequest {
        var apiId: String
        var typeName: ResourceName
    }
    interface DeleteTypeResponse
    interface DeltaSyncConfig {
        var baseTableTTL: Long?
            get() = definedExternally
            set(value) = definedExternally
        var deltaSyncTableName: String?
            get() = definedExternally
            set(value) = definedExternally
        var deltaSyncTableTTL: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DynamodbDataSourceConfig {
        var tableName: String
        var awsRegion: String
        var useCallerCredentials: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var deltaSyncConfig: DeltaSyncConfig?
            get() = definedExternally
            set(value) = definedExternally
        var versioned: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ElasticsearchDataSourceConfig {
        var endpoint: String
        var awsRegion: String
    }
    interface FlushApiCacheRequest {
        var apiId: String
    }
    interface FlushApiCacheResponse
    interface FunctionConfiguration {
        var functionId: String?
            get() = definedExternally
            set(value) = definedExternally
        var functionArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var dataSourceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var requestMappingTemplate: MappingTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var responseMappingTemplate: MappingTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var functionVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetApiCacheRequest {
        var apiId: String
    }
    interface GetApiCacheResponse {
        var apiCache: ApiCache?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDataSourceRequest {
        var apiId: String
        var name: ResourceName
    }
    interface GetDataSourceResponse {
        var dataSource: DataSource?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFunctionRequest {
        var apiId: String
        var functionId: ResourceName
    }
    interface GetFunctionResponse {
        var functionConfiguration: FunctionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetGraphqlApiRequest {
        var apiId: String
    }
    interface GetGraphqlApiResponse {
        var graphqlApi: GraphqlApi?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIntrospectionSchemaRequest {
        var apiId: String
        var format: String /* "SDL" | "JSON" | String */
        var includeDirectives: BooleanValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIntrospectionSchemaResponse {
        var schema: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResolverRequest {
        var apiId: String
        var typeName: ResourceName
        var fieldName: ResourceName
    }
    interface GetResolverResponse {
        var resolver: Resolver?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSchemaCreationStatusRequest {
        var apiId: String
    }
    interface GetSchemaCreationStatusResponse {
        var status: String /* "PROCESSING" | "ACTIVE" | "DELETING" | "FAILED" | "SUCCESS" | "NOT_APPLICABLE" | String */
        var details: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTypeRequest {
        var apiId: String
        var typeName: ResourceName
        var format: String /* "SDL" | "JSON" | String */
    }
    interface GetTypeResponse {
        var type: Type?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GraphqlApi {
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var apiId: String?
            get() = definedExternally
            set(value) = definedExternally
        var authenticationType: String /* "API_KEY" | "AWS_IAM" | "AMAZON_COGNITO_USER_POOLS" | "OPENID_CONNECT" | String */
        var logConfig: LogConfig?
            get() = definedExternally
            set(value) = definedExternally
        var userPoolConfig: UserPoolConfig?
            get() = definedExternally
            set(value) = definedExternally
        var openIDConnectConfig: OpenIDConnectConfig?
            get() = definedExternally
            set(value) = definedExternally
        var arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var uris: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var additionalAuthenticationProviders: AdditionalAuthenticationProviders?
            get() = definedExternally
            set(value) = definedExternally
        var xrayEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HttpDataSourceConfig {
        var endpoint: String?
            get() = definedExternally
            set(value) = definedExternally
        var authorizationConfig: AuthorizationConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LambdaConflictHandlerConfig {
        var lambdaConflictHandlerArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LambdaDataSourceConfig {
        var lambdaFunctionArn: String
    }
    interface ListApiKeysRequest {
        var apiId: String
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListApiKeysResponse {
        var apiKeys: ApiKeys?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDataSourcesRequest {
        var apiId: String
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDataSourcesResponse {
        var dataSources: DataSources?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFunctionsRequest {
        var apiId: String
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFunctionsResponse {
        var functions: Functions?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGraphqlApisRequest {
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGraphqlApisResponse {
        var graphqlApis: GraphqlApis?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResolversByFunctionRequest {
        var apiId: String
        var functionId: String
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResolversByFunctionResponse {
        var resolvers: Resolvers?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResolversRequest {
        var apiId: String
        var typeName: String
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResolversResponse {
        var resolvers: Resolvers?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var resourceArn: ResourceArn
    }
    interface ListTagsForResourceResponse {
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTypesRequest {
        var apiId: String
        var format: String /* "SDL" | "JSON" | String */
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTypesResponse {
        var types: TypeList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogConfig {
        var fieldLogLevel: String /* "NONE" | "ERROR" | "ALL" | String */
        var cloudWatchLogsRoleArn: String
        var excludeVerboseContent: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MapOfStringToString {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface OpenIDConnectConfig {
        var issuer: String
        var clientId: String?
            get() = definedExternally
            set(value) = definedExternally
        var iatTTL: Long?
            get() = definedExternally
            set(value) = definedExternally
        var authTTL: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PipelineConfig {
        var functions: FunctionsIds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RdsHttpEndpointConfig {
        var awsRegion: String?
            get() = definedExternally
            set(value) = definedExternally
        var dbClusterIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var databaseName: String?
            get() = definedExternally
            set(value) = definedExternally
        var schema: String?
            get() = definedExternally
            set(value) = definedExternally
        var awsSecretStoreArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RelationalDatabaseDataSourceConfig {
        var relationalDatabaseSourceType: String /* "RDS_HTTP_ENDPOINT" | String */
        var rdsHttpEndpointConfig: RdsHttpEndpointConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Resolver {
        var typeName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var fieldName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var dataSourceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var resolverArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var requestMappingTemplate: MappingTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var responseMappingTemplate: MappingTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var kind: String /* "UNIT" | "PIPELINE" | String */
        var pipelineConfig: PipelineConfig?
            get() = definedExternally
            set(value) = definedExternally
        var syncConfig: SyncConfig?
            get() = definedExternally
            set(value) = definedExternally
        var cachingConfig: CachingConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartSchemaCreationRequest {
        var apiId: String
        var definition: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartSchemaCreationResponse {
        var status: String /* "PROCESSING" | "ACTIVE" | "DELETING" | "FAILED" | "SUCCESS" | "NOT_APPLICABLE" | String */
    }
    interface SyncConfig {
        var conflictHandler: String /* "OPTIMISTIC_CONCURRENCY" | "LAMBDA" | "AUTOMERGE" | "NONE" | String */
        var conflictDetection: String /* "VERSION" | "NONE" | String */
        var lambdaConflictHandlerConfig: LambdaConflictHandlerConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagMap {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface TagResourceRequest {
        var resourceArn: ResourceArn
        var tags: TagMap
    }
    interface TagResourceResponse
    interface Type {
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var definition: String?
            get() = definedExternally
            set(value) = definedExternally
        var format: String /* "SDL" | "JSON" | String */
    }
    interface UntagResourceRequest {
        var resourceArn: ResourceArn
        var tagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateApiCacheRequest {
        var apiId: String
        var ttl: Long
        var apiCachingBehavior: String /* "FULL_REQUEST_CACHING" | "PER_RESOLVER_CACHING" | String */
        var type: String /* "T2_SMALL" | "T2_MEDIUM" | "R4_LARGE" | "R4_XLARGE" | "R4_2XLARGE" | "R4_4XLARGE" | "R4_8XLARGE" | String */
    }
    interface UpdateApiCacheResponse {
        var apiCache: ApiCache?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateApiKeyRequest {
        var apiId: String
        var id: String
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var expires: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateApiKeyResponse {
        var apiKey: ApiKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDataSourceRequest {
        var apiId: String
        var name: ResourceName
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "AWS_LAMBDA" | "AMAZON_DYNAMODB" | "AMAZON_ELASTICSEARCH" | "NONE" | "HTTP" | "RELATIONAL_DATABASE" | String */
        var serviceRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var dynamodbConfig: DynamodbDataSourceConfig?
            get() = definedExternally
            set(value) = definedExternally
        var lambdaConfig: LambdaDataSourceConfig?
            get() = definedExternally
            set(value) = definedExternally
        var elasticsearchConfig: ElasticsearchDataSourceConfig?
            get() = definedExternally
            set(value) = definedExternally
        var httpConfig: HttpDataSourceConfig?
            get() = definedExternally
            set(value) = definedExternally
        var relationalDatabaseConfig: RelationalDatabaseDataSourceConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDataSourceResponse {
        var dataSource: DataSource?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFunctionRequest {
        var apiId: String
        var name: ResourceName
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var functionId: ResourceName
        var dataSourceName: ResourceName
        var requestMappingTemplate: MappingTemplate
        var responseMappingTemplate: MappingTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var functionVersion: String
    }
    interface UpdateFunctionResponse {
        var functionConfiguration: FunctionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGraphqlApiRequest {
        var apiId: String
        var name: String
        var logConfig: LogConfig?
            get() = definedExternally
            set(value) = definedExternally
        var authenticationType: String /* "API_KEY" | "AWS_IAM" | "AMAZON_COGNITO_USER_POOLS" | "OPENID_CONNECT" | String */
        var userPoolConfig: UserPoolConfig?
            get() = definedExternally
            set(value) = definedExternally
        var openIDConnectConfig: OpenIDConnectConfig?
            get() = definedExternally
            set(value) = definedExternally
        var additionalAuthenticationProviders: AdditionalAuthenticationProviders?
            get() = definedExternally
            set(value) = definedExternally
        var xrayEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGraphqlApiResponse {
        var graphqlApi: GraphqlApi?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateResolverRequest {
        var apiId: String
        var typeName: ResourceName
        var fieldName: ResourceName
        var dataSourceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var requestMappingTemplate: MappingTemplate
        var responseMappingTemplate: MappingTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var kind: String /* "UNIT" | "PIPELINE" | String */
        var pipelineConfig: PipelineConfig?
            get() = definedExternally
            set(value) = definedExternally
        var syncConfig: SyncConfig?
            get() = definedExternally
            set(value) = definedExternally
        var cachingConfig: CachingConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateResolverResponse {
        var resolver: Resolver?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTypeRequest {
        var apiId: String
        var typeName: ResourceName
        var definition: String?
            get() = definedExternally
            set(value) = definedExternally
        var format: String /* "SDL" | "JSON" | String */
    }
    interface UpdateTypeResponse {
        var type: Type?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserPoolConfig {
        var userPoolId: String
        var awsRegion: String
        var defaultAction: String /* "ALLOW" | "DENY" | String */
        var appIdClientRegex: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-07-25" | "latest" | String */
    }
}