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
import Lambda.AliasConfiguration
import Lambda.EventSourceMappingConfiguration
import Lambda.FunctionEventInvokeConfig
import Lambda.FunctionConfiguration
import Lambda.LayerVersionsListItem
import Lambda.LayersListItem
import Lambda.Layer
import Lambda.ProvisionedConcurrencyConfigListItem
import Lambda.AddLayerVersionPermissionRequest
import Lambda.AddLayerVersionPermissionResponse
import Lambda.AddPermissionRequest
import Lambda.AddPermissionResponse
import Lambda.CreateAliasRequest
import Lambda.CreateEventSourceMappingRequest
import Lambda.CreateFunctionRequest
import Lambda.DeleteAliasRequest
import Lambda.DeleteEventSourceMappingRequest
import Lambda.DeleteFunctionRequest
import Lambda.DeleteFunctionConcurrencyRequest
import Lambda.DeleteFunctionEventInvokeConfigRequest
import Lambda.DeleteLayerVersionRequest
import Lambda.DeleteProvisionedConcurrencyConfigRequest
import Lambda.GetAccountSettingsRequest
import Lambda.GetAccountSettingsResponse
import Lambda.GetAliasRequest
import Lambda.GetEventSourceMappingRequest
import Lambda.GetFunctionRequest
import Lambda.GetFunctionResponse
import Lambda.GetFunctionConcurrencyRequest
import Lambda.GetFunctionConcurrencyResponse
import Lambda.GetFunctionConfigurationRequest
import Lambda.GetFunctionEventInvokeConfigRequest
import Lambda.GetLayerVersionRequest
import Lambda.GetLayerVersionResponse
import Lambda.GetLayerVersionByArnRequest
import Lambda.GetLayerVersionPolicyRequest
import Lambda.GetLayerVersionPolicyResponse
import Lambda.GetPolicyRequest
import Lambda.GetPolicyResponse
import Lambda.GetProvisionedConcurrencyConfigRequest
import Lambda.GetProvisionedConcurrencyConfigResponse
import Lambda.InvocationRequest
import Lambda.InvocationResponse
import Lambda.InvokeAsyncRequest
import Lambda.InvokeAsyncResponse
import Lambda.ListAliasesRequest
import Lambda.ListAliasesResponse
import Lambda.ListEventSourceMappingsRequest
import Lambda.ListEventSourceMappingsResponse
import Lambda.ListFunctionEventInvokeConfigsRequest
import Lambda.ListFunctionEventInvokeConfigsResponse
import Lambda.ListFunctionsRequest
import Lambda.ListFunctionsResponse
import Lambda.ListLayerVersionsRequest
import Lambda.ListLayerVersionsResponse
import Lambda.ListLayersRequest
import Lambda.ListLayersResponse
import Lambda.ListProvisionedConcurrencyConfigsRequest
import Lambda.ListProvisionedConcurrencyConfigsResponse
import Lambda.ListTagsRequest
import Lambda.ListTagsResponse
import Lambda.ListVersionsByFunctionRequest
import Lambda.ListVersionsByFunctionResponse
import Lambda.PublishLayerVersionRequest
import Lambda.PublishLayerVersionResponse
import Lambda.PublishVersionRequest
import Lambda.PutFunctionConcurrencyRequest
import Lambda.Concurrency
import Lambda.PutFunctionEventInvokeConfigRequest
import Lambda.PutProvisionedConcurrencyConfigRequest
import Lambda.PutProvisionedConcurrencyConfigResponse
import Lambda.RemoveLayerVersionPermissionRequest
import Lambda.RemovePermissionRequest
import Lambda.TagResourceRequest
import Lambda.UntagResourceRequest
import Lambda.UpdateAliasRequest
import Lambda.UpdateEventSourceMappingRequest
import Lambda.UpdateFunctionCodeRequest
import Lambda.UpdateFunctionConfigurationRequest
import Lambda.UpdateFunctionEventInvokeConfigRequest
import Lambda.AliasRoutingConfiguration
import Lambda.AdditionalVersionWeights
import Lambda.DestinationConfig
import Lambda.FunctionCode
import Lambda.VpcConfig
import Lambda.DeadLetterConfig
import Lambda.Environment
import Lambda.TracingConfig
import Lambda.Tags
import Lambda.OnSuccess
import Lambda.OnFailure
import Lambda.EnvironmentVariables
import Lambda.EnvironmentError
import Lambda.VpcConfigResponse
import Lambda.EnvironmentResponse
import Lambda.TracingConfigResponse
import Lambda.AccountLimit
import Lambda.AccountUsage
import Lambda.FunctionCodeLocation
import Lambda.LayerVersionContentOutput
import Lambda.LayerVersionContentInput

typealias Action = String

typealias AdditionalVersion = String

typealias Alias = String

typealias AliasList = Array<AliasConfiguration>

typealias Arn = String

typealias BatchSize = Number

typealias BisectBatchOnFunctionError = Boolean

typealias Boolean = Boolean

typealias CompatibleRuntimes = Array<String /* "nodejs" | "nodejs4.3" | "nodejs6.10" | "nodejs8.10" | "nodejs10.x" | "nodejs12.x" | "java8" | "java11" | "python2.7" | "python3.6" | "python3.7" | "python3.8" | "dotnetcore1.0" | "dotnetcore2.0" | "dotnetcore2.1" | "nodejs4.3-edge" | "go1.x" | "ruby2.5" | "ruby2.7" | "provided" | String */>

typealias _Date = Date

typealias Description = String

typealias DestinationArn = String

typealias Enabled = Boolean

typealias EnvironmentVariableName = String

typealias EnvironmentVariableValue = String

typealias EventSourceMappingsList = Array<EventSourceMappingConfiguration>

typealias EventSourceToken = String

typealias FunctionArn = String

typealias FunctionEventInvokeConfigList = Array<FunctionEventInvokeConfig>

typealias FunctionList = Array<FunctionConfiguration>

typealias FunctionName = String

typealias Handler = String

typealias HttpStatus = Number

typealias Integer = Number

typealias KMSKeyArn = String

typealias LastUpdateStatusReason = String

typealias LayerArn = String

typealias LayerList = Array<LayerVersionArn>

typealias LayerName = String

typealias LayerPermissionAllowedAction = String

typealias LayerPermissionAllowedPrincipal = String

typealias LayerVersionArn = String

typealias LayerVersionNumber = Number

typealias LayerVersionsList = Array<LayerVersionsListItem>

typealias LayersList = Array<LayersListItem>

typealias LayersReferenceList = Array<Layer>

typealias LicenseInfo = String

typealias Long = Number

typealias MasterRegion = String

typealias MaxFunctionEventInvokeConfigListItems = Number

typealias MaxLayerListItems = Number

typealias MaxListItems = Number

typealias MaxProvisionedConcurrencyConfigListItems = Number

typealias MaximumBatchingWindowInSeconds = Number

typealias MaximumEventAgeInSeconds = Number

typealias MaximumRecordAgeInSeconds = Number

typealias MaximumRetryAttempts = Number

typealias MaximumRetryAttemptsEventSourceMapping = Number

typealias MemorySize = Number

typealias NameSpacedFunctionArn = String

typealias NamespacedFunctionName = String

typealias NamespacedStatementId = String

typealias NonNegativeInteger = Number

typealias OrganizationId = String

typealias ParallelizationFactor = Number

typealias PositiveInteger = Number

typealias Principal = String

typealias ProvisionedConcurrencyConfigList = Array<ProvisionedConcurrencyConfigListItem>

typealias Qualifier = String

typealias ReservedConcurrentExecutions = Number

typealias ResourceArn = String

typealias RoleArn = String

typealias S3Bucket = String

typealias S3Key = String

typealias S3ObjectVersion = String

typealias SecurityGroupId = String

typealias SecurityGroupIds = Array<SecurityGroupId>

typealias SensitiveString = String

typealias SourceOwner = String

typealias StateReason = String

typealias StatementId = String

typealias String = String

typealias SubnetId = String

typealias SubnetIds = Array<SubnetId>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagValue = String

typealias Timeout = Number

typealias Timestamp = String

typealias UnreservedConcurrentExecutions = Number

typealias Version = String

typealias VpcId = String

typealias Weight = Number

@JsModule("aws-sdk")
external open class Lambda(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Lambda.Types.ClientConfiguration */
    open fun addLayerVersionPermission(params: AddLayerVersionPermissionRequest, callback: (err: AWSError, data: AddLayerVersionPermissionResponse) -> Unit = definedExternally): Request<AddLayerVersionPermissionResponse, AWSError>
    open fun addLayerVersionPermission(callback: (err: AWSError, data: AddLayerVersionPermissionResponse) -> Unit = definedExternally): Request<AddLayerVersionPermissionResponse, AWSError>
    open fun addPermission(params: AddPermissionRequest, callback: (err: AWSError, data: AddPermissionResponse) -> Unit = definedExternally): Request<AddPermissionResponse, AWSError>
    open fun addPermission(callback: (err: AWSError, data: AddPermissionResponse) -> Unit = definedExternally): Request<AddPermissionResponse, AWSError>
    open fun createAlias(params: CreateAliasRequest, callback: (err: AWSError, data: AliasConfiguration) -> Unit = definedExternally): Request<AliasConfiguration, AWSError>
    open fun createAlias(callback: (err: AWSError, data: AliasConfiguration) -> Unit = definedExternally): Request<AliasConfiguration, AWSError>
    open fun createEventSourceMapping(params: CreateEventSourceMappingRequest, callback: (err: AWSError, data: EventSourceMappingConfiguration) -> Unit = definedExternally): Request<EventSourceMappingConfiguration, AWSError>
    open fun createEventSourceMapping(callback: (err: AWSError, data: EventSourceMappingConfiguration) -> Unit = definedExternally): Request<EventSourceMappingConfiguration, AWSError>
    open fun createFunction(params: CreateFunctionRequest, callback: (err: AWSError, data: FunctionConfiguration) -> Unit = definedExternally): Request<FunctionConfiguration, AWSError>
    open fun createFunction(callback: (err: AWSError, data: FunctionConfiguration) -> Unit = definedExternally): Request<FunctionConfiguration, AWSError>
    open fun deleteAlias(params: DeleteAliasRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAlias(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEventSourceMapping(params: DeleteEventSourceMappingRequest, callback: (err: AWSError, data: EventSourceMappingConfiguration) -> Unit = definedExternally): Request<EventSourceMappingConfiguration, AWSError>
    open fun deleteEventSourceMapping(callback: (err: AWSError, data: EventSourceMappingConfiguration) -> Unit = definedExternally): Request<EventSourceMappingConfiguration, AWSError>
    open fun deleteFunction(params: DeleteFunctionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteFunction(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteFunctionConcurrency(params: DeleteFunctionConcurrencyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteFunctionConcurrency(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteFunctionEventInvokeConfig(params: DeleteFunctionEventInvokeConfigRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteFunctionEventInvokeConfig(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteLayerVersion(params: DeleteLayerVersionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteLayerVersion(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteProvisionedConcurrencyConfig(params: DeleteProvisionedConcurrencyConfigRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteProvisionedConcurrencyConfig(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun getAccountSettings(params: GetAccountSettingsRequest, callback: (err: AWSError, data: GetAccountSettingsResponse) -> Unit = definedExternally): Request<GetAccountSettingsResponse, AWSError>
    open fun getAccountSettings(callback: (err: AWSError, data: GetAccountSettingsResponse) -> Unit = definedExternally): Request<GetAccountSettingsResponse, AWSError>
    open fun getAlias(params: GetAliasRequest, callback: (err: AWSError, data: AliasConfiguration) -> Unit = definedExternally): Request<AliasConfiguration, AWSError>
    open fun getAlias(callback: (err: AWSError, data: AliasConfiguration) -> Unit = definedExternally): Request<AliasConfiguration, AWSError>
    open fun getEventSourceMapping(params: GetEventSourceMappingRequest, callback: (err: AWSError, data: EventSourceMappingConfiguration) -> Unit = definedExternally): Request<EventSourceMappingConfiguration, AWSError>
    open fun getEventSourceMapping(callback: (err: AWSError, data: EventSourceMappingConfiguration) -> Unit = definedExternally): Request<EventSourceMappingConfiguration, AWSError>
    open fun getFunction(params: GetFunctionRequest, callback: (err: AWSError, data: GetFunctionResponse) -> Unit = definedExternally): Request<GetFunctionResponse, AWSError>
    open fun getFunction(callback: (err: AWSError, data: GetFunctionResponse) -> Unit = definedExternally): Request<GetFunctionResponse, AWSError>
    open fun getFunctionConcurrency(params: GetFunctionConcurrencyRequest, callback: (err: AWSError, data: GetFunctionConcurrencyResponse) -> Unit = definedExternally): Request<GetFunctionConcurrencyResponse, AWSError>
    open fun getFunctionConcurrency(callback: (err: AWSError, data: GetFunctionConcurrencyResponse) -> Unit = definedExternally): Request<GetFunctionConcurrencyResponse, AWSError>
    open fun getFunctionConfiguration(params: GetFunctionConfigurationRequest, callback: (err: AWSError, data: FunctionConfiguration) -> Unit = definedExternally): Request<FunctionConfiguration, AWSError>
    open fun getFunctionConfiguration(callback: (err: AWSError, data: FunctionConfiguration) -> Unit = definedExternally): Request<FunctionConfiguration, AWSError>
    open fun getFunctionEventInvokeConfig(params: GetFunctionEventInvokeConfigRequest, callback: (err: AWSError, data: FunctionEventInvokeConfig) -> Unit = definedExternally): Request<FunctionEventInvokeConfig, AWSError>
    open fun getFunctionEventInvokeConfig(callback: (err: AWSError, data: FunctionEventInvokeConfig) -> Unit = definedExternally): Request<FunctionEventInvokeConfig, AWSError>
    open fun getLayerVersion(params: GetLayerVersionRequest, callback: (err: AWSError, data: GetLayerVersionResponse) -> Unit = definedExternally): Request<GetLayerVersionResponse, AWSError>
    open fun getLayerVersion(callback: (err: AWSError, data: GetLayerVersionResponse) -> Unit = definedExternally): Request<GetLayerVersionResponse, AWSError>
    open fun getLayerVersionByArn(params: GetLayerVersionByArnRequest, callback: (err: AWSError, data: GetLayerVersionResponse) -> Unit = definedExternally): Request<GetLayerVersionResponse, AWSError>
    open fun getLayerVersionByArn(callback: (err: AWSError, data: GetLayerVersionResponse) -> Unit = definedExternally): Request<GetLayerVersionResponse, AWSError>
    open fun getLayerVersionPolicy(params: GetLayerVersionPolicyRequest, callback: (err: AWSError, data: GetLayerVersionPolicyResponse) -> Unit = definedExternally): Request<GetLayerVersionPolicyResponse, AWSError>
    open fun getLayerVersionPolicy(callback: (err: AWSError, data: GetLayerVersionPolicyResponse) -> Unit = definedExternally): Request<GetLayerVersionPolicyResponse, AWSError>
    open fun getPolicy(params: GetPolicyRequest, callback: (err: AWSError, data: GetPolicyResponse) -> Unit = definedExternally): Request<GetPolicyResponse, AWSError>
    open fun getPolicy(callback: (err: AWSError, data: GetPolicyResponse) -> Unit = definedExternally): Request<GetPolicyResponse, AWSError>
    open fun getProvisionedConcurrencyConfig(params: GetProvisionedConcurrencyConfigRequest, callback: (err: AWSError, data: GetProvisionedConcurrencyConfigResponse) -> Unit = definedExternally): Request<GetProvisionedConcurrencyConfigResponse, AWSError>
    open fun getProvisionedConcurrencyConfig(callback: (err: AWSError, data: GetProvisionedConcurrencyConfigResponse) -> Unit = definedExternally): Request<GetProvisionedConcurrencyConfigResponse, AWSError>
    open fun invoke(params: InvocationRequest, callback: (err: AWSError, data: InvocationResponse) -> Unit = definedExternally): Request<InvocationResponse, AWSError>
    open fun invoke(callback: (err: AWSError, data: InvocationResponse) -> Unit = definedExternally): Request<InvocationResponse, AWSError>
    open fun invokeAsync(params: InvokeAsyncRequest, callback: (err: AWSError, data: InvokeAsyncResponse) -> Unit = definedExternally): Request<InvokeAsyncResponse, AWSError>
    open fun invokeAsync(callback: (err: AWSError, data: InvokeAsyncResponse) -> Unit = definedExternally): Request<InvokeAsyncResponse, AWSError>
    open fun listAliases(params: ListAliasesRequest, callback: (err: AWSError, data: ListAliasesResponse) -> Unit = definedExternally): Request<ListAliasesResponse, AWSError>
    open fun listAliases(callback: (err: AWSError, data: ListAliasesResponse) -> Unit = definedExternally): Request<ListAliasesResponse, AWSError>
    open fun listEventSourceMappings(params: ListEventSourceMappingsRequest, callback: (err: AWSError, data: ListEventSourceMappingsResponse) -> Unit = definedExternally): Request<ListEventSourceMappingsResponse, AWSError>
    open fun listEventSourceMappings(callback: (err: AWSError, data: ListEventSourceMappingsResponse) -> Unit = definedExternally): Request<ListEventSourceMappingsResponse, AWSError>
    open fun listFunctionEventInvokeConfigs(params: ListFunctionEventInvokeConfigsRequest, callback: (err: AWSError, data: ListFunctionEventInvokeConfigsResponse) -> Unit = definedExternally): Request<ListFunctionEventInvokeConfigsResponse, AWSError>
    open fun listFunctionEventInvokeConfigs(callback: (err: AWSError, data: ListFunctionEventInvokeConfigsResponse) -> Unit = definedExternally): Request<ListFunctionEventInvokeConfigsResponse, AWSError>
    open fun listFunctions(params: ListFunctionsRequest, callback: (err: AWSError, data: ListFunctionsResponse) -> Unit = definedExternally): Request<ListFunctionsResponse, AWSError>
    open fun listFunctions(callback: (err: AWSError, data: ListFunctionsResponse) -> Unit = definedExternally): Request<ListFunctionsResponse, AWSError>
    open fun listLayerVersions(params: ListLayerVersionsRequest, callback: (err: AWSError, data: ListLayerVersionsResponse) -> Unit = definedExternally): Request<ListLayerVersionsResponse, AWSError>
    open fun listLayerVersions(callback: (err: AWSError, data: ListLayerVersionsResponse) -> Unit = definedExternally): Request<ListLayerVersionsResponse, AWSError>
    open fun listLayers(params: ListLayersRequest, callback: (err: AWSError, data: ListLayersResponse) -> Unit = definedExternally): Request<ListLayersResponse, AWSError>
    open fun listLayers(callback: (err: AWSError, data: ListLayersResponse) -> Unit = definedExternally): Request<ListLayersResponse, AWSError>
    open fun listProvisionedConcurrencyConfigs(params: ListProvisionedConcurrencyConfigsRequest, callback: (err: AWSError, data: ListProvisionedConcurrencyConfigsResponse) -> Unit = definedExternally): Request<ListProvisionedConcurrencyConfigsResponse, AWSError>
    open fun listProvisionedConcurrencyConfigs(callback: (err: AWSError, data: ListProvisionedConcurrencyConfigsResponse) -> Unit = definedExternally): Request<ListProvisionedConcurrencyConfigsResponse, AWSError>
    open fun listTags(params: ListTagsRequest, callback: (err: AWSError, data: ListTagsResponse) -> Unit = definedExternally): Request<ListTagsResponse, AWSError>
    open fun listTags(callback: (err: AWSError, data: ListTagsResponse) -> Unit = definedExternally): Request<ListTagsResponse, AWSError>
    open fun listVersionsByFunction(params: ListVersionsByFunctionRequest, callback: (err: AWSError, data: ListVersionsByFunctionResponse) -> Unit = definedExternally): Request<ListVersionsByFunctionResponse, AWSError>
    open fun listVersionsByFunction(callback: (err: AWSError, data: ListVersionsByFunctionResponse) -> Unit = definedExternally): Request<ListVersionsByFunctionResponse, AWSError>
    open fun publishLayerVersion(params: PublishLayerVersionRequest, callback: (err: AWSError, data: PublishLayerVersionResponse) -> Unit = definedExternally): Request<PublishLayerVersionResponse, AWSError>
    open fun publishLayerVersion(callback: (err: AWSError, data: PublishLayerVersionResponse) -> Unit = definedExternally): Request<PublishLayerVersionResponse, AWSError>
    open fun publishVersion(params: PublishVersionRequest, callback: (err: AWSError, data: FunctionConfiguration) -> Unit = definedExternally): Request<FunctionConfiguration, AWSError>
    open fun publishVersion(callback: (err: AWSError, data: FunctionConfiguration) -> Unit = definedExternally): Request<FunctionConfiguration, AWSError>
    open fun putFunctionConcurrency(params: PutFunctionConcurrencyRequest, callback: (err: AWSError, data: Concurrency) -> Unit = definedExternally): Request<Concurrency, AWSError>
    open fun putFunctionConcurrency(callback: (err: AWSError, data: Concurrency) -> Unit = definedExternally): Request<Concurrency, AWSError>
    open fun putFunctionEventInvokeConfig(params: PutFunctionEventInvokeConfigRequest, callback: (err: AWSError, data: FunctionEventInvokeConfig) -> Unit = definedExternally): Request<FunctionEventInvokeConfig, AWSError>
    open fun putFunctionEventInvokeConfig(callback: (err: AWSError, data: FunctionEventInvokeConfig) -> Unit = definedExternally): Request<FunctionEventInvokeConfig, AWSError>
    open fun putProvisionedConcurrencyConfig(params: PutProvisionedConcurrencyConfigRequest, callback: (err: AWSError, data: PutProvisionedConcurrencyConfigResponse) -> Unit = definedExternally): Request<PutProvisionedConcurrencyConfigResponse, AWSError>
    open fun putProvisionedConcurrencyConfig(callback: (err: AWSError, data: PutProvisionedConcurrencyConfigResponse) -> Unit = definedExternally): Request<PutProvisionedConcurrencyConfigResponse, AWSError>
    open fun removeLayerVersionPermission(params: RemoveLayerVersionPermissionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeLayerVersionPermission(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removePermission(params: RemovePermissionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removePermission(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateAlias(params: UpdateAliasRequest, callback: (err: AWSError, data: AliasConfiguration) -> Unit = definedExternally): Request<AliasConfiguration, AWSError>
    open fun updateAlias(callback: (err: AWSError, data: AliasConfiguration) -> Unit = definedExternally): Request<AliasConfiguration, AWSError>
    open fun updateEventSourceMapping(params: UpdateEventSourceMappingRequest, callback: (err: AWSError, data: EventSourceMappingConfiguration) -> Unit = definedExternally): Request<EventSourceMappingConfiguration, AWSError>
    open fun updateEventSourceMapping(callback: (err: AWSError, data: EventSourceMappingConfiguration) -> Unit = definedExternally): Request<EventSourceMappingConfiguration, AWSError>
    open fun updateFunctionCode(params: UpdateFunctionCodeRequest, callback: (err: AWSError, data: FunctionConfiguration) -> Unit = definedExternally): Request<FunctionConfiguration, AWSError>
    open fun updateFunctionCode(callback: (err: AWSError, data: FunctionConfiguration) -> Unit = definedExternally): Request<FunctionConfiguration, AWSError>
    open fun updateFunctionConfiguration(params: UpdateFunctionConfigurationRequest, callback: (err: AWSError, data: FunctionConfiguration) -> Unit = definedExternally): Request<FunctionConfiguration, AWSError>
    open fun updateFunctionConfiguration(callback: (err: AWSError, data: FunctionConfiguration) -> Unit = definedExternally): Request<FunctionConfiguration, AWSError>
    open fun updateFunctionEventInvokeConfig(params: UpdateFunctionEventInvokeConfigRequest, callback: (err: AWSError, data: FunctionEventInvokeConfig) -> Unit = definedExternally): Request<FunctionEventInvokeConfig, AWSError>
    open fun updateFunctionEventInvokeConfig(callback: (err: AWSError, data: FunctionEventInvokeConfig) -> Unit = definedExternally): Request<FunctionEventInvokeConfig, AWSError>
    open fun waitFor(state: String /* "functionExists" */, params: GetFunctionRequest /* Lambda.Types.GetFunctionRequest & `T$0` */, callback: (err: AWSError, data: GetFunctionResponse) -> Unit = definedExternally): Request<GetFunctionResponse, AWSError>
    open fun waitFor(state: String /* "functionExists" */, callback: (err: AWSError, data: GetFunctionResponse) -> Unit = definedExternally): Request<GetFunctionResponse, AWSError>
    open fun waitFor(state: String, params: GetFunctionConfigurationRequest, callback: (err: AWSError, data: FunctionConfiguration) -> Unit = definedExternally): Request<FunctionConfiguration, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: FunctionConfiguration) -> Unit = definedExternally): Request<FunctionConfiguration, AWSError>
    interface AccountLimit {
        var TotalCodeSize: Long?
            get() = definedExternally
            set(value) = definedExternally
        var CodeSizeUnzipped: Long?
            get() = definedExternally
            set(value) = definedExternally
        var CodeSizeZipped: Long?
            get() = definedExternally
            set(value) = definedExternally
        var ConcurrentExecutions: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var UnreservedConcurrentExecutions: UnreservedConcurrentExecutions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AccountUsage {
        var TotalCodeSize: Long?
            get() = definedExternally
            set(value) = definedExternally
        var FunctionCount: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddLayerVersionPermissionRequest {
        var LayerName: LayerName
        var VersionNumber: LayerVersionNumber
        var StatementId: StatementId
        var Action: LayerPermissionAllowedAction
        var Principal: LayerPermissionAllowedPrincipal
        var OrganizationId: OrganizationId?
            get() = definedExternally
            set(value) = definedExternally
        var RevisionId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddLayerVersionPermissionResponse {
        var Statement: String?
            get() = definedExternally
            set(value) = definedExternally
        var RevisionId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddPermissionRequest {
        var FunctionName: FunctionName
        var StatementId: StatementId
        var Action: Action
        var Principal: Principal
        var SourceArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var SourceAccount: SourceOwner?
            get() = definedExternally
            set(value) = definedExternally
        var EventSourceToken: EventSourceToken?
            get() = definedExternally
            set(value) = definedExternally
        var Qualifier: Qualifier?
            get() = definedExternally
            set(value) = definedExternally
        var RevisionId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddPermissionResponse {
        var Statement: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdditionalVersionWeights {
        @nativeGetter
        operator fun get(key: String): Weight?
        @nativeSetter
        operator fun set(key: String, value: Weight)
    }
    interface AliasConfiguration {
        var AliasArn: FunctionArn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: Alias?
            get() = definedExternally
            set(value) = definedExternally
        var FunctionVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var RoutingConfig: AliasRoutingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var RevisionId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AliasRoutingConfiguration {
        var AdditionalVersionWeights: AdditionalVersionWeights?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Concurrency {
        var ReservedConcurrentExecutions: ReservedConcurrentExecutions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAliasRequest {
        var FunctionName: FunctionName
        var Name: Alias
        var FunctionVersion: Version
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var RoutingConfig: AliasRoutingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEventSourceMappingRequest {
        var EventSourceArn: Arn
        var FunctionName: FunctionName
        var Enabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
        var BatchSize: BatchSize?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumBatchingWindowInSeconds: MaximumBatchingWindowInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var ParallelizationFactor: ParallelizationFactor?
            get() = definedExternally
            set(value) = definedExternally
        var StartingPosition: String /* "TRIM_HORIZON" | "LATEST" | "AT_TIMESTAMP" | String */
        var StartingPositionTimestamp: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationConfig: DestinationConfig?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumRecordAgeInSeconds: MaximumRecordAgeInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var BisectBatchOnFunctionError: BisectBatchOnFunctionError?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumRetryAttempts: MaximumRetryAttemptsEventSourceMapping?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFunctionRequest {
        var FunctionName: FunctionName
        var Runtime: String /* "nodejs" | "nodejs4.3" | "nodejs6.10" | "nodejs8.10" | "nodejs10.x" | "nodejs12.x" | "java8" | "java11" | "python2.7" | "python3.6" | "python3.7" | "python3.8" | "dotnetcore1.0" | "dotnetcore2.0" | "dotnetcore2.1" | "nodejs4.3-edge" | "go1.x" | "ruby2.5" | "ruby2.7" | "provided" | String */
        var Role: RoleArn
        var Handler: Handler
        var Code: FunctionCode
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Timeout: Timeout?
            get() = definedExternally
            set(value) = definedExternally
        var MemorySize: MemorySize?
            get() = definedExternally
            set(value) = definedExternally
        var Publish: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
        var DeadLetterConfig: DeadLetterConfig?
            get() = definedExternally
            set(value) = definedExternally
        var Environment: Environment?
            get() = definedExternally
            set(value) = definedExternally
        var KMSKeyArn: KMSKeyArn?
            get() = definedExternally
            set(value) = definedExternally
        var TracingConfig: TracingConfig?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var Layers: LayerList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeadLetterConfig {
        var TargetArn: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAliasRequest {
        var FunctionName: FunctionName
        var Name: Alias
    }
    interface DeleteEventSourceMappingRequest {
        var UUID: String
    }
    interface DeleteFunctionConcurrencyRequest {
        var FunctionName: FunctionName
    }
    interface DeleteFunctionEventInvokeConfigRequest {
        var FunctionName: FunctionName
        var Qualifier: Qualifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteFunctionRequest {
        var FunctionName: FunctionName
        var Qualifier: Qualifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteLayerVersionRequest {
        var LayerName: LayerName
        var VersionNumber: LayerVersionNumber
    }
    interface DeleteProvisionedConcurrencyConfigRequest {
        var FunctionName: FunctionName
        var Qualifier: Qualifier
    }
    interface DestinationConfig {
        var OnSuccess: OnSuccess?
            get() = definedExternally
            set(value) = definedExternally
        var OnFailure: OnFailure?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Environment {
        var Variables: EnvironmentVariables?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnvironmentError {
        var ErrorCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var Message: SensitiveString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnvironmentResponse {
        var Variables: EnvironmentVariables?
            get() = definedExternally
            set(value) = definedExternally
        var Error: EnvironmentError?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnvironmentVariables {
        @nativeGetter
        operator fun get(key: String): EnvironmentVariableValue?
        @nativeSetter
        operator fun set(key: String, value: EnvironmentVariableValue)
    }
    interface EventSourceMappingConfiguration {
        var UUID: String?
            get() = definedExternally
            set(value) = definedExternally
        var BatchSize: BatchSize?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumBatchingWindowInSeconds: MaximumBatchingWindowInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var ParallelizationFactor: ParallelizationFactor?
            get() = definedExternally
            set(value) = definedExternally
        var EventSourceArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var FunctionArn: FunctionArn?
            get() = definedExternally
            set(value) = definedExternally
        var LastModified: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var LastProcessingResult: String?
            get() = definedExternally
            set(value) = definedExternally
        var State: String?
            get() = definedExternally
            set(value) = definedExternally
        var StateTransitionReason: String?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationConfig: DestinationConfig?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumRecordAgeInSeconds: MaximumRecordAgeInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var BisectBatchOnFunctionError: BisectBatchOnFunctionError?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumRetryAttempts: MaximumRetryAttemptsEventSourceMapping?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FunctionCode {
        var ZipFile: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var S3Bucket: S3Bucket?
            get() = definedExternally
            set(value) = definedExternally
        var S3Key: S3Key?
            get() = definedExternally
            set(value) = definedExternally
        var S3ObjectVersion: S3ObjectVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FunctionCodeLocation {
        var RepositoryType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Location: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FunctionConfiguration {
        var FunctionName: NamespacedFunctionName?
            get() = definedExternally
            set(value) = definedExternally
        var FunctionArn: NameSpacedFunctionArn?
            get() = definedExternally
            set(value) = definedExternally
        var Runtime: String /* "nodejs" | "nodejs4.3" | "nodejs6.10" | "nodejs8.10" | "nodejs10.x" | "nodejs12.x" | "java8" | "java11" | "python2.7" | "python3.6" | "python3.7" | "python3.8" | "dotnetcore1.0" | "dotnetcore2.0" | "dotnetcore2.1" | "nodejs4.3-edge" | "go1.x" | "ruby2.5" | "ruby2.7" | "provided" | String */
        var Role: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var Handler: Handler?
            get() = definedExternally
            set(value) = definedExternally
        var CodeSize: Long?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Timeout: Timeout?
            get() = definedExternally
            set(value) = definedExternally
        var MemorySize: MemorySize?
            get() = definedExternally
            set(value) = definedExternally
        var LastModified: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CodeSha256: String?
            get() = definedExternally
            set(value) = definedExternally
        var Version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfigResponse?
            get() = definedExternally
            set(value) = definedExternally
        var DeadLetterConfig: DeadLetterConfig?
            get() = definedExternally
            set(value) = definedExternally
        var Environment: EnvironmentResponse?
            get() = definedExternally
            set(value) = definedExternally
        var KMSKeyArn: KMSKeyArn?
            get() = definedExternally
            set(value) = definedExternally
        var TracingConfig: TracingConfigResponse?
            get() = definedExternally
            set(value) = definedExternally
        var MasterArn: FunctionArn?
            get() = definedExternally
            set(value) = definedExternally
        var RevisionId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Layers: LayersReferenceList?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "Pending" | "Active" | "Inactive" | "Failed" | String */
        var StateReason: StateReason?
            get() = definedExternally
            set(value) = definedExternally
        var StateReasonCode: String /* "Idle" | "Creating" | "Restoring" | "EniLimitExceeded" | "InsufficientRolePermissions" | "InvalidConfiguration" | "InternalError" | "SubnetOutOfIPAddresses" | "InvalidSubnet" | "InvalidSecurityGroup" | String */
        var LastUpdateStatus: String /* "Successful" | "Failed" | "InProgress" | String */
        var LastUpdateStatusReason: LastUpdateStatusReason?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdateStatusReasonCode: String /* "EniLimitExceeded" | "InsufficientRolePermissions" | "InvalidConfiguration" | "InternalError" | "SubnetOutOfIPAddresses" | "InvalidSubnet" | "InvalidSecurityGroup" | String */
    }
    interface FunctionEventInvokeConfig {
        var LastModified: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var FunctionArn: FunctionArn?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumRetryAttempts: MaximumRetryAttempts?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumEventAgeInSeconds: MaximumEventAgeInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationConfig: DestinationConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAccountSettingsRequest
    interface GetAccountSettingsResponse {
        var AccountLimit: AccountLimit?
            get() = definedExternally
            set(value) = definedExternally
        var AccountUsage: AccountUsage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAliasRequest {
        var FunctionName: FunctionName
        var Name: Alias
    }
    interface GetEventSourceMappingRequest {
        var UUID: String
    }
    interface GetFunctionConcurrencyRequest {
        var FunctionName: FunctionName
    }
    interface GetFunctionConcurrencyResponse {
        var ReservedConcurrentExecutions: ReservedConcurrentExecutions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFunctionConfigurationRequest {
        var FunctionName: NamespacedFunctionName
        var Qualifier: Qualifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFunctionEventInvokeConfigRequest {
        var FunctionName: FunctionName
        var Qualifier: Qualifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFunctionRequest {
        var FunctionName: NamespacedFunctionName
        var Qualifier: Qualifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFunctionResponse {
        var Configuration: FunctionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Code: FunctionCodeLocation?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var Concurrency: Concurrency?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLayerVersionByArnRequest {
        var Arn: LayerVersionArn
    }
    interface GetLayerVersionPolicyRequest {
        var LayerName: LayerName
        var VersionNumber: LayerVersionNumber
    }
    interface GetLayerVersionPolicyResponse {
        var Policy: String?
            get() = definedExternally
            set(value) = definedExternally
        var RevisionId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLayerVersionRequest {
        var LayerName: LayerName
        var VersionNumber: LayerVersionNumber
    }
    interface GetLayerVersionResponse {
        var Content: LayerVersionContentOutput?
            get() = definedExternally
            set(value) = definedExternally
        var LayerArn: LayerArn?
            get() = definedExternally
            set(value) = definedExternally
        var LayerVersionArn: LayerVersionArn?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Version: LayerVersionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var CompatibleRuntimes: CompatibleRuntimes?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseInfo: LicenseInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPolicyRequest {
        var FunctionName: NamespacedFunctionName
        var Qualifier: Qualifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPolicyResponse {
        var Policy: String?
            get() = definedExternally
            set(value) = definedExternally
        var RevisionId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetProvisionedConcurrencyConfigRequest {
        var FunctionName: FunctionName
        var Qualifier: Qualifier
    }
    interface GetProvisionedConcurrencyConfigResponse {
        var RequestedProvisionedConcurrentExecutions: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var AvailableProvisionedConcurrentExecutions: NonNegativeInteger?
            get() = definedExternally
            set(value) = definedExternally
        var AllocatedProvisionedConcurrentExecutions: NonNegativeInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "IN_PROGRESS" | "READY" | "FAILED" | String */
        var StatusReason: String?
            get() = definedExternally
            set(value) = definedExternally
        var LastModified: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InvocationRequest {
        var FunctionName: NamespacedFunctionName
        var InvocationType: String /* "Event" | "RequestResponse" | "DryRun" | String */
        var LogType: String /* "None" | "Tail" | String */
        var ClientContext: String?
            get() = definedExternally
            set(value) = definedExternally
        var Payload: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var Qualifier: Qualifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InvocationResponse {
        var StatusCode: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var FunctionError: String?
            get() = definedExternally
            set(value) = definedExternally
        var LogResult: String?
            get() = definedExternally
            set(value) = definedExternally
        var Payload: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var ExecutedVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InvokeAsyncRequest {
        var FunctionName: NamespacedFunctionName
        var InvokeArgs: dynamic /* Buffer | Uint8Array | Blob | String | Readable */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InvokeAsyncResponse {
        var Status: HttpStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Layer {
        var Arn: LayerVersionArn?
            get() = definedExternally
            set(value) = definedExternally
        var CodeSize: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LayerVersionContentInput {
        var S3Bucket: S3Bucket?
            get() = definedExternally
            set(value) = definedExternally
        var S3Key: S3Key?
            get() = definedExternally
            set(value) = definedExternally
        var S3ObjectVersion: S3ObjectVersion?
            get() = definedExternally
            set(value) = definedExternally
        var ZipFile: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LayerVersionContentOutput {
        var Location: String?
            get() = definedExternally
            set(value) = definedExternally
        var CodeSha256: String?
            get() = definedExternally
            set(value) = definedExternally
        var CodeSize: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LayerVersionsListItem {
        var LayerVersionArn: LayerVersionArn?
            get() = definedExternally
            set(value) = definedExternally
        var Version: LayerVersionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CompatibleRuntimes: CompatibleRuntimes?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseInfo: LicenseInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LayersListItem {
        var LayerName: LayerName?
            get() = definedExternally
            set(value) = definedExternally
        var LayerArn: LayerArn?
            get() = definedExternally
            set(value) = definedExternally
        var LatestMatchingVersion: LayerVersionsListItem?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAliasesRequest {
        var FunctionName: FunctionName
        var FunctionVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: MaxListItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAliasesResponse {
        var NextMarker: String?
            get() = definedExternally
            set(value) = definedExternally
        var Aliases: AliasList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEventSourceMappingsRequest {
        var EventSourceArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var FunctionName: FunctionName?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: MaxListItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEventSourceMappingsResponse {
        var NextMarker: String?
            get() = definedExternally
            set(value) = definedExternally
        var EventSourceMappings: EventSourceMappingsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFunctionEventInvokeConfigsRequest {
        var FunctionName: FunctionName
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: MaxFunctionEventInvokeConfigListItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFunctionEventInvokeConfigsResponse {
        var FunctionEventInvokeConfigs: FunctionEventInvokeConfigList?
            get() = definedExternally
            set(value) = definedExternally
        var NextMarker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFunctionsRequest {
        var MasterRegion: MasterRegion?
            get() = definedExternally
            set(value) = definedExternally
        var FunctionVersion: String /* "ALL" | String */
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: MaxListItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFunctionsResponse {
        var NextMarker: String?
            get() = definedExternally
            set(value) = definedExternally
        var Functions: FunctionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLayerVersionsRequest {
        var CompatibleRuntime: String /* "nodejs" | "nodejs4.3" | "nodejs6.10" | "nodejs8.10" | "nodejs10.x" | "nodejs12.x" | "java8" | "java11" | "python2.7" | "python3.6" | "python3.7" | "python3.8" | "dotnetcore1.0" | "dotnetcore2.0" | "dotnetcore2.1" | "nodejs4.3-edge" | "go1.x" | "ruby2.5" | "ruby2.7" | "provided" | String */
        var LayerName: LayerName
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: MaxLayerListItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLayerVersionsResponse {
        var NextMarker: String?
            get() = definedExternally
            set(value) = definedExternally
        var LayerVersions: LayerVersionsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLayersRequest {
        var CompatibleRuntime: String /* "nodejs" | "nodejs4.3" | "nodejs6.10" | "nodejs8.10" | "nodejs10.x" | "nodejs12.x" | "java8" | "java11" | "python2.7" | "python3.6" | "python3.7" | "python3.8" | "dotnetcore1.0" | "dotnetcore2.0" | "dotnetcore2.1" | "nodejs4.3-edge" | "go1.x" | "ruby2.5" | "ruby2.7" | "provided" | String */
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: MaxLayerListItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLayersResponse {
        var NextMarker: String?
            get() = definedExternally
            set(value) = definedExternally
        var Layers: LayersList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProvisionedConcurrencyConfigsRequest {
        var FunctionName: FunctionName
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: MaxProvisionedConcurrencyConfigListItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProvisionedConcurrencyConfigsResponse {
        var ProvisionedConcurrencyConfigs: ProvisionedConcurrencyConfigList?
            get() = definedExternally
            set(value) = definedExternally
        var NextMarker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsRequest {
        var Resource: FunctionArn
    }
    interface ListTagsResponse {
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVersionsByFunctionRequest {
        var FunctionName: NamespacedFunctionName
        var Marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: MaxListItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVersionsByFunctionResponse {
        var NextMarker: String?
            get() = definedExternally
            set(value) = definedExternally
        var Versions: FunctionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OnFailure {
        var Destination: DestinationArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OnSuccess {
        var Destination: DestinationArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProvisionedConcurrencyConfigListItem {
        var FunctionArn: FunctionArn?
            get() = definedExternally
            set(value) = definedExternally
        var RequestedProvisionedConcurrentExecutions: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var AvailableProvisionedConcurrentExecutions: NonNegativeInteger?
            get() = definedExternally
            set(value) = definedExternally
        var AllocatedProvisionedConcurrentExecutions: NonNegativeInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "IN_PROGRESS" | "READY" | "FAILED" | String */
        var StatusReason: String?
            get() = definedExternally
            set(value) = definedExternally
        var LastModified: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PublishLayerVersionRequest {
        var LayerName: LayerName
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Content: LayerVersionContentInput
        var CompatibleRuntimes: CompatibleRuntimes?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseInfo: LicenseInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PublishLayerVersionResponse {
        var Content: LayerVersionContentOutput?
            get() = definedExternally
            set(value) = definedExternally
        var LayerArn: LayerArn?
            get() = definedExternally
            set(value) = definedExternally
        var LayerVersionArn: LayerVersionArn?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Version: LayerVersionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var CompatibleRuntimes: CompatibleRuntimes?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseInfo: LicenseInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PublishVersionRequest {
        var FunctionName: FunctionName
        var CodeSha256: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var RevisionId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutFunctionConcurrencyRequest {
        var FunctionName: FunctionName
        var ReservedConcurrentExecutions: ReservedConcurrentExecutions
    }
    interface PutFunctionEventInvokeConfigRequest {
        var FunctionName: FunctionName
        var Qualifier: Qualifier?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumRetryAttempts: MaximumRetryAttempts?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumEventAgeInSeconds: MaximumEventAgeInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationConfig: DestinationConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutProvisionedConcurrencyConfigRequest {
        var FunctionName: FunctionName
        var Qualifier: Qualifier
        var ProvisionedConcurrentExecutions: PositiveInteger
    }
    interface PutProvisionedConcurrencyConfigResponse {
        var RequestedProvisionedConcurrentExecutions: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var AvailableProvisionedConcurrentExecutions: NonNegativeInteger?
            get() = definedExternally
            set(value) = definedExternally
        var AllocatedProvisionedConcurrentExecutions: NonNegativeInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "IN_PROGRESS" | "READY" | "FAILED" | String */
        var StatusReason: String?
            get() = definedExternally
            set(value) = definedExternally
        var LastModified: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveLayerVersionPermissionRequest {
        var LayerName: LayerName
        var VersionNumber: LayerVersionNumber
        var StatementId: StatementId
        var RevisionId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemovePermissionRequest {
        var FunctionName: FunctionName
        var StatementId: NamespacedStatementId
        var Qualifier: Qualifier?
            get() = definedExternally
            set(value) = definedExternally
        var RevisionId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var Resource: FunctionArn
        var Tags: Tags
    }
    interface Tags {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface TracingConfig {
        var Mode: String /* "Active" | "PassThrough" | String */
    }
    interface TracingConfigResponse {
        var Mode: String /* "Active" | "PassThrough" | String */
    }
    interface UntagResourceRequest {
        var Resource: FunctionArn
        var TagKeys: TagKeyList
    }
    interface UpdateAliasRequest {
        var FunctionName: FunctionName
        var Name: Alias
        var FunctionVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var RoutingConfig: AliasRoutingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var RevisionId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateEventSourceMappingRequest {
        var UUID: String
        var FunctionName: FunctionName?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
        var BatchSize: BatchSize?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumBatchingWindowInSeconds: MaximumBatchingWindowInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationConfig: DestinationConfig?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumRecordAgeInSeconds: MaximumRecordAgeInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var BisectBatchOnFunctionError: BisectBatchOnFunctionError?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumRetryAttempts: MaximumRetryAttemptsEventSourceMapping?
            get() = definedExternally
            set(value) = definedExternally
        var ParallelizationFactor: ParallelizationFactor?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFunctionCodeRequest {
        var FunctionName: FunctionName
        var ZipFile: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var S3Bucket: S3Bucket?
            get() = definedExternally
            set(value) = definedExternally
        var S3Key: S3Key?
            get() = definedExternally
            set(value) = definedExternally
        var S3ObjectVersion: S3ObjectVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Publish: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var DryRun: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RevisionId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFunctionConfigurationRequest {
        var FunctionName: FunctionName
        var Role: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var Handler: Handler?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Timeout: Timeout?
            get() = definedExternally
            set(value) = definedExternally
        var MemorySize: MemorySize?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
        var Environment: Environment?
            get() = definedExternally
            set(value) = definedExternally
        var Runtime: String /* "nodejs" | "nodejs4.3" | "nodejs6.10" | "nodejs8.10" | "nodejs10.x" | "nodejs12.x" | "java8" | "java11" | "python2.7" | "python3.6" | "python3.7" | "python3.8" | "dotnetcore1.0" | "dotnetcore2.0" | "dotnetcore2.1" | "nodejs4.3-edge" | "go1.x" | "ruby2.5" | "ruby2.7" | "provided" | String */
        var DeadLetterConfig: DeadLetterConfig?
            get() = definedExternally
            set(value) = definedExternally
        var KMSKeyArn: KMSKeyArn?
            get() = definedExternally
            set(value) = definedExternally
        var TracingConfig: TracingConfig?
            get() = definedExternally
            set(value) = definedExternally
        var RevisionId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Layers: LayerList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFunctionEventInvokeConfigRequest {
        var FunctionName: FunctionName
        var Qualifier: Qualifier?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumRetryAttempts: MaximumRetryAttempts?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumEventAgeInSeconds: MaximumEventAgeInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationConfig: DestinationConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VpcConfig {
        var SubnetIds: SubnetIds?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: SecurityGroupIds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VpcConfigResponse {
        var SubnetIds: SubnetIds?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: SecurityGroupIds?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: VpcId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2014-11-11" | "2015-03-31" | "latest" | String */
    }
}