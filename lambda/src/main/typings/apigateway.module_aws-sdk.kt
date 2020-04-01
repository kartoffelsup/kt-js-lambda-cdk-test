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
import APIGateway.ApiKey
import APIGateway.ApiStage
import APIGateway.Authorizer
import APIGateway.BasePathMapping
import APIGateway.ClientCertificate
import APIGateway.Deployment
import APIGateway.DocumentationPart
import APIGateway.DocumentationVersion
import APIGateway.DomainName
import APIGateway.GatewayResponse
import APIGateway.Model
import APIGateway.PatchOperation
import APIGateway.RequestValidator
import APIGateway.Resource
import APIGateway.RestApi
import APIGateway.SdkConfigurationProperty
import APIGateway.SdkType
import APIGateway.Stage
import APIGateway.StageKey
import APIGateway.UsagePlan
import APIGateway.UsagePlanKey
import APIGateway.VpcLink
import APIGateway.CreateApiKeyRequest
import APIGateway.CreateAuthorizerRequest
import APIGateway.CreateBasePathMappingRequest
import APIGateway.CreateDeploymentRequest
import APIGateway.CreateDocumentationPartRequest
import APIGateway.CreateDocumentationVersionRequest
import APIGateway.CreateDomainNameRequest
import APIGateway.CreateModelRequest
import APIGateway.CreateRequestValidatorRequest
import APIGateway.CreateResourceRequest
import APIGateway.CreateRestApiRequest
import APIGateway.CreateStageRequest
import APIGateway.CreateUsagePlanRequest
import APIGateway.CreateUsagePlanKeyRequest
import APIGateway.CreateVpcLinkRequest
import APIGateway.DeleteApiKeyRequest
import APIGateway.DeleteAuthorizerRequest
import APIGateway.DeleteBasePathMappingRequest
import APIGateway.DeleteClientCertificateRequest
import APIGateway.DeleteDeploymentRequest
import APIGateway.DeleteDocumentationPartRequest
import APIGateway.DeleteDocumentationVersionRequest
import APIGateway.DeleteDomainNameRequest
import APIGateway.DeleteGatewayResponseRequest
import APIGateway.DeleteIntegrationRequest
import APIGateway.DeleteIntegrationResponseRequest
import APIGateway.DeleteMethodRequest
import APIGateway.DeleteMethodResponseRequest
import APIGateway.DeleteModelRequest
import APIGateway.DeleteRequestValidatorRequest
import APIGateway.DeleteResourceRequest
import APIGateway.DeleteRestApiRequest
import APIGateway.DeleteStageRequest
import APIGateway.DeleteUsagePlanRequest
import APIGateway.DeleteUsagePlanKeyRequest
import APIGateway.DeleteVpcLinkRequest
import APIGateway.FlushStageAuthorizersCacheRequest
import APIGateway.FlushStageCacheRequest
import APIGateway.GenerateClientCertificateRequest
import APIGateway.GetAccountRequest
import APIGateway.Account
import APIGateway.GetApiKeyRequest
import APIGateway.GetApiKeysRequest
import APIGateway.ApiKeys
import APIGateway.GetAuthorizerRequest
import APIGateway.GetAuthorizersRequest
import APIGateway.Authorizers
import APIGateway.GetBasePathMappingRequest
import APIGateway.GetBasePathMappingsRequest
import APIGateway.BasePathMappings
import APIGateway.GetClientCertificateRequest
import APIGateway.GetClientCertificatesRequest
import APIGateway.ClientCertificates
import APIGateway.GetDeploymentRequest
import APIGateway.GetDeploymentsRequest
import APIGateway.Deployments
import APIGateway.GetDocumentationPartRequest
import APIGateway.GetDocumentationPartsRequest
import APIGateway.DocumentationParts
import APIGateway.GetDocumentationVersionRequest
import APIGateway.GetDocumentationVersionsRequest
import APIGateway.DocumentationVersions
import APIGateway.GetDomainNameRequest
import APIGateway.GetDomainNamesRequest
import APIGateway.DomainNames
import APIGateway.GetExportRequest
import APIGateway.ExportResponse
import APIGateway.GetGatewayResponseRequest
import APIGateway.GetGatewayResponsesRequest
import APIGateway.GatewayResponses
import APIGateway.GetIntegrationRequest
import APIGateway.Integration
import APIGateway.GetIntegrationResponseRequest
import APIGateway.IntegrationResponse
import APIGateway.GetMethodRequest
import APIGateway.Method
import APIGateway.GetMethodResponseRequest
import APIGateway.MethodResponse
import APIGateway.GetModelRequest
import APIGateway.GetModelTemplateRequest
import APIGateway.Template
import APIGateway.GetModelsRequest
import APIGateway.Models
import APIGateway.GetRequestValidatorRequest
import APIGateway.GetRequestValidatorsRequest
import APIGateway.RequestValidators
import APIGateway.GetResourceRequest
import APIGateway.GetResourcesRequest
import APIGateway.Resources
import APIGateway.GetRestApiRequest
import APIGateway.GetRestApisRequest
import APIGateway.RestApis
import APIGateway.GetSdkRequest
import APIGateway.SdkResponse
import APIGateway.GetSdkTypeRequest
import APIGateway.GetSdkTypesRequest
import APIGateway.SdkTypes
import APIGateway.GetStageRequest
import APIGateway.GetStagesRequest
import APIGateway.Stages
import APIGateway.GetTagsRequest
import APIGateway.Tags
import APIGateway.GetUsageRequest
import APIGateway.Usage
import APIGateway.GetUsagePlanRequest
import APIGateway.GetUsagePlanKeyRequest
import APIGateway.GetUsagePlanKeysRequest
import APIGateway.UsagePlanKeys
import APIGateway.GetUsagePlansRequest
import APIGateway.UsagePlans
import APIGateway.GetVpcLinkRequest
import APIGateway.GetVpcLinksRequest
import APIGateway.VpcLinks
import APIGateway.ImportApiKeysRequest
import APIGateway.ApiKeyIds
import APIGateway.ImportDocumentationPartsRequest
import APIGateway.DocumentationPartIds
import APIGateway.ImportRestApiRequest
import APIGateway.PutGatewayResponseRequest
import APIGateway.PutIntegrationRequest
import APIGateway.PutIntegrationResponseRequest
import APIGateway.PutMethodRequest
import APIGateway.PutMethodResponseRequest
import APIGateway.PutRestApiRequest
import APIGateway.TagResourceRequest
import APIGateway.TestInvokeAuthorizerRequest
import APIGateway.TestInvokeAuthorizerResponse
import APIGateway.TestInvokeMethodRequest
import APIGateway.TestInvokeMethodResponse
import APIGateway.UntagResourceRequest
import APIGateway.UpdateAccountRequest
import APIGateway.UpdateApiKeyRequest
import APIGateway.UpdateAuthorizerRequest
import APIGateway.UpdateBasePathMappingRequest
import APIGateway.UpdateClientCertificateRequest
import APIGateway.UpdateDeploymentRequest
import APIGateway.UpdateDocumentationPartRequest
import APIGateway.UpdateDocumentationVersionRequest
import APIGateway.UpdateDomainNameRequest
import APIGateway.UpdateGatewayResponseRequest
import APIGateway.UpdateIntegrationRequest
import APIGateway.UpdateIntegrationResponseRequest
import APIGateway.UpdateMethodRequest
import APIGateway.UpdateMethodResponseRequest
import APIGateway.UpdateModelRequest
import APIGateway.UpdateRequestValidatorRequest
import APIGateway.UpdateResourceRequest
import APIGateway.UpdateRestApiRequest
import APIGateway.UpdateStageRequest
import APIGateway.UpdateUsageRequest
import APIGateway.UpdateUsagePlanRequest
import APIGateway.UpdateVpcLinkRequest
import APIGateway.ThrottleSettings
import APIGateway.MapOfStringToString
import APIGateway.MapOfApiStageThrottleSettings
import APIGateway.DeploymentCanarySettings
import APIGateway.DocumentationPartLocation
import APIGateway.EndpointConfiguration
import APIGateway.CanarySettings
import APIGateway.QuotaSettings
import APIGateway.PathToMapOfMethodSnapshot
import APIGateway.MapOfIntegrationResponse
import APIGateway.MethodSetting
import APIGateway.MethodSnapshot
import APIGateway.MapOfStringToBoolean
import APIGateway.MapOfMethodResponse
import APIGateway.MapOfMethodSnapshot
import APIGateway.MapOfMethod
import APIGateway.MapOfMethodSettings
import APIGateway.AccessLogSettings
import APIGateway.MapOfStringToList
import APIGateway.MapOfKeyUsages

typealias Boolean = Boolean

typealias DocumentationPartLocationStatusCode = String

typealias Double = Number

typealias Integer = Number

typealias ListOfARNs = Array<ProviderARN>

typealias ListOfApiKey = Array<ApiKey>

typealias ListOfApiStage = Array<ApiStage>

typealias ListOfAuthorizer = Array<Authorizer>

typealias ListOfBasePathMapping = Array<BasePathMapping>

typealias ListOfClientCertificate = Array<ClientCertificate>

typealias ListOfDeployment = Array<Deployment>

typealias ListOfDocumentationPart = Array<DocumentationPart>

typealias ListOfDocumentationVersion = Array<DocumentationVersion>

typealias ListOfDomainName = Array<DomainName>

typealias ListOfEndpointType = Array<String /* "REGIONAL" | "EDGE" | "PRIVATE" | String */>

typealias ListOfGatewayResponse = Array<GatewayResponse>

typealias ListOfLong = Array<Long>

typealias ListOfModel = Array<Model>

typealias ListOfPatchOperation = Array<PatchOperation>

typealias ListOfRequestValidator = Array<RequestValidator>

typealias ListOfResource = Array<Resource>

typealias ListOfRestApi = Array<RestApi>

typealias ListOfSdkConfigurationProperty = Array<SdkConfigurationProperty>

typealias ListOfSdkType = Array<SdkType>

typealias ListOfStage = Array<Stage>

typealias ListOfStageKeys = Array<StageKey>

typealias ListOfString = Array<String>

typealias ListOfUsage = Array<ListOfLong>

typealias ListOfUsagePlan = Array<UsagePlan>

typealias ListOfUsagePlanKey = Array<UsagePlanKey>

typealias ListOfVpcLink = Array<VpcLink>

typealias Long = Number

typealias NullableBoolean = Boolean

typealias NullableInteger = Number

typealias ProviderARN = String

typealias StatusCode = String

typealias String = String

typealias Timestamp = Date

@JsModule("aws-sdk")
external open class APIGateway(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & APIGateway.Types.ClientConfiguration */
    open fun createApiKey(params: CreateApiKeyRequest, callback: (err: AWSError, data: ApiKey) -> Unit = definedExternally): Request<ApiKey, AWSError>
    open fun createApiKey(callback: (err: AWSError, data: ApiKey) -> Unit = definedExternally): Request<ApiKey, AWSError>
    open fun createAuthorizer(params: CreateAuthorizerRequest, callback: (err: AWSError, data: Authorizer) -> Unit = definedExternally): Request<Authorizer, AWSError>
    open fun createAuthorizer(callback: (err: AWSError, data: Authorizer) -> Unit = definedExternally): Request<Authorizer, AWSError>
    open fun createBasePathMapping(params: CreateBasePathMappingRequest, callback: (err: AWSError, data: BasePathMapping) -> Unit = definedExternally): Request<BasePathMapping, AWSError>
    open fun createBasePathMapping(callback: (err: AWSError, data: BasePathMapping) -> Unit = definedExternally): Request<BasePathMapping, AWSError>
    open fun createDeployment(params: CreateDeploymentRequest, callback: (err: AWSError, data: Deployment) -> Unit = definedExternally): Request<Deployment, AWSError>
    open fun createDeployment(callback: (err: AWSError, data: Deployment) -> Unit = definedExternally): Request<Deployment, AWSError>
    open fun createDocumentationPart(params: CreateDocumentationPartRequest, callback: (err: AWSError, data: DocumentationPart) -> Unit = definedExternally): Request<DocumentationPart, AWSError>
    open fun createDocumentationPart(callback: (err: AWSError, data: DocumentationPart) -> Unit = definedExternally): Request<DocumentationPart, AWSError>
    open fun createDocumentationVersion(params: CreateDocumentationVersionRequest, callback: (err: AWSError, data: DocumentationVersion) -> Unit = definedExternally): Request<DocumentationVersion, AWSError>
    open fun createDocumentationVersion(callback: (err: AWSError, data: DocumentationVersion) -> Unit = definedExternally): Request<DocumentationVersion, AWSError>
    open fun createDomainName(params: CreateDomainNameRequest, callback: (err: AWSError, data: DomainName) -> Unit = definedExternally): Request<DomainName, AWSError>
    open fun createDomainName(callback: (err: AWSError, data: DomainName) -> Unit = definedExternally): Request<DomainName, AWSError>
    open fun createModel(params: CreateModelRequest, callback: (err: AWSError, data: Model) -> Unit = definedExternally): Request<Model, AWSError>
    open fun createModel(callback: (err: AWSError, data: Model) -> Unit = definedExternally): Request<Model, AWSError>
    open fun createRequestValidator(params: CreateRequestValidatorRequest, callback: (err: AWSError, data: RequestValidator) -> Unit = definedExternally): Request<RequestValidator, AWSError>
    open fun createRequestValidator(callback: (err: AWSError, data: RequestValidator) -> Unit = definedExternally): Request<RequestValidator, AWSError>
    open fun createResource(params: CreateResourceRequest, callback: (err: AWSError, data: Resource) -> Unit = definedExternally): Request<Resource, AWSError>
    open fun createResource(callback: (err: AWSError, data: Resource) -> Unit = definedExternally): Request<Resource, AWSError>
    open fun createRestApi(params: CreateRestApiRequest, callback: (err: AWSError, data: RestApi) -> Unit = definedExternally): Request<RestApi, AWSError>
    open fun createRestApi(callback: (err: AWSError, data: RestApi) -> Unit = definedExternally): Request<RestApi, AWSError>
    open fun createStage(params: CreateStageRequest, callback: (err: AWSError, data: Stage) -> Unit = definedExternally): Request<Stage, AWSError>
    open fun createStage(callback: (err: AWSError, data: Stage) -> Unit = definedExternally): Request<Stage, AWSError>
    open fun createUsagePlan(params: CreateUsagePlanRequest, callback: (err: AWSError, data: UsagePlan) -> Unit = definedExternally): Request<UsagePlan, AWSError>
    open fun createUsagePlan(callback: (err: AWSError, data: UsagePlan) -> Unit = definedExternally): Request<UsagePlan, AWSError>
    open fun createUsagePlanKey(params: CreateUsagePlanKeyRequest, callback: (err: AWSError, data: UsagePlanKey) -> Unit = definedExternally): Request<UsagePlanKey, AWSError>
    open fun createUsagePlanKey(callback: (err: AWSError, data: UsagePlanKey) -> Unit = definedExternally): Request<UsagePlanKey, AWSError>
    open fun createVpcLink(params: CreateVpcLinkRequest, callback: (err: AWSError, data: VpcLink) -> Unit = definedExternally): Request<VpcLink, AWSError>
    open fun createVpcLink(callback: (err: AWSError, data: VpcLink) -> Unit = definedExternally): Request<VpcLink, AWSError>
    open fun deleteApiKey(params: DeleteApiKeyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteApiKey(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAuthorizer(params: DeleteAuthorizerRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAuthorizer(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteBasePathMapping(params: DeleteBasePathMappingRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteBasePathMapping(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteClientCertificate(params: DeleteClientCertificateRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteClientCertificate(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDeployment(params: DeleteDeploymentRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDeployment(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDocumentationPart(params: DeleteDocumentationPartRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDocumentationPart(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDocumentationVersion(params: DeleteDocumentationVersionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDocumentationVersion(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDomainName(params: DeleteDomainNameRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDomainName(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteGatewayResponse(params: DeleteGatewayResponseRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteGatewayResponse(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteIntegration(params: DeleteIntegrationRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteIntegration(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteIntegrationResponse(params: DeleteIntegrationResponseRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteIntegrationResponse(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteMethod(params: DeleteMethodRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteMethod(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteMethodResponse(params: DeleteMethodResponseRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteMethodResponse(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteModel(params: DeleteModelRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteModel(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRequestValidator(params: DeleteRequestValidatorRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRequestValidator(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteResource(params: DeleteResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRestApi(params: DeleteRestApiRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRestApi(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteStage(params: DeleteStageRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteStage(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUsagePlan(params: DeleteUsagePlanRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUsagePlan(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUsagePlanKey(params: DeleteUsagePlanKeyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUsagePlanKey(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVpcLink(params: DeleteVpcLinkRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVpcLink(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun flushStageAuthorizersCache(params: FlushStageAuthorizersCacheRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun flushStageAuthorizersCache(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun flushStageCache(params: FlushStageCacheRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun flushStageCache(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun generateClientCertificate(params: GenerateClientCertificateRequest, callback: (err: AWSError, data: ClientCertificate) -> Unit = definedExternally): Request<ClientCertificate, AWSError>
    open fun generateClientCertificate(callback: (err: AWSError, data: ClientCertificate) -> Unit = definedExternally): Request<ClientCertificate, AWSError>
    open fun getAccount(params: GetAccountRequest, callback: (err: AWSError, data: Account) -> Unit = definedExternally): Request<Account, AWSError>
    open fun getAccount(callback: (err: AWSError, data: Account) -> Unit = definedExternally): Request<Account, AWSError>
    open fun getApiKey(params: GetApiKeyRequest, callback: (err: AWSError, data: ApiKey) -> Unit = definedExternally): Request<ApiKey, AWSError>
    open fun getApiKey(callback: (err: AWSError, data: ApiKey) -> Unit = definedExternally): Request<ApiKey, AWSError>
    open fun getApiKeys(params: GetApiKeysRequest, callback: (err: AWSError, data: ApiKeys) -> Unit = definedExternally): Request<ApiKeys, AWSError>
    open fun getApiKeys(callback: (err: AWSError, data: ApiKeys) -> Unit = definedExternally): Request<ApiKeys, AWSError>
    open fun getAuthorizer(params: GetAuthorizerRequest, callback: (err: AWSError, data: Authorizer) -> Unit = definedExternally): Request<Authorizer, AWSError>
    open fun getAuthorizer(callback: (err: AWSError, data: Authorizer) -> Unit = definedExternally): Request<Authorizer, AWSError>
    open fun getAuthorizers(params: GetAuthorizersRequest, callback: (err: AWSError, data: Authorizers) -> Unit = definedExternally): Request<Authorizers, AWSError>
    open fun getAuthorizers(callback: (err: AWSError, data: Authorizers) -> Unit = definedExternally): Request<Authorizers, AWSError>
    open fun getBasePathMapping(params: GetBasePathMappingRequest, callback: (err: AWSError, data: BasePathMapping) -> Unit = definedExternally): Request<BasePathMapping, AWSError>
    open fun getBasePathMapping(callback: (err: AWSError, data: BasePathMapping) -> Unit = definedExternally): Request<BasePathMapping, AWSError>
    open fun getBasePathMappings(params: GetBasePathMappingsRequest, callback: (err: AWSError, data: BasePathMappings) -> Unit = definedExternally): Request<BasePathMappings, AWSError>
    open fun getBasePathMappings(callback: (err: AWSError, data: BasePathMappings) -> Unit = definedExternally): Request<BasePathMappings, AWSError>
    open fun getClientCertificate(params: GetClientCertificateRequest, callback: (err: AWSError, data: ClientCertificate) -> Unit = definedExternally): Request<ClientCertificate, AWSError>
    open fun getClientCertificate(callback: (err: AWSError, data: ClientCertificate) -> Unit = definedExternally): Request<ClientCertificate, AWSError>
    open fun getClientCertificates(params: GetClientCertificatesRequest, callback: (err: AWSError, data: ClientCertificates) -> Unit = definedExternally): Request<ClientCertificates, AWSError>
    open fun getClientCertificates(callback: (err: AWSError, data: ClientCertificates) -> Unit = definedExternally): Request<ClientCertificates, AWSError>
    open fun getDeployment(params: GetDeploymentRequest, callback: (err: AWSError, data: Deployment) -> Unit = definedExternally): Request<Deployment, AWSError>
    open fun getDeployment(callback: (err: AWSError, data: Deployment) -> Unit = definedExternally): Request<Deployment, AWSError>
    open fun getDeployments(params: GetDeploymentsRequest, callback: (err: AWSError, data: Deployments) -> Unit = definedExternally): Request<Deployments, AWSError>
    open fun getDeployments(callback: (err: AWSError, data: Deployments) -> Unit = definedExternally): Request<Deployments, AWSError>
    open fun getDocumentationPart(params: GetDocumentationPartRequest, callback: (err: AWSError, data: DocumentationPart) -> Unit = definedExternally): Request<DocumentationPart, AWSError>
    open fun getDocumentationPart(callback: (err: AWSError, data: DocumentationPart) -> Unit = definedExternally): Request<DocumentationPart, AWSError>
    open fun getDocumentationParts(params: GetDocumentationPartsRequest, callback: (err: AWSError, data: DocumentationParts) -> Unit = definedExternally): Request<DocumentationParts, AWSError>
    open fun getDocumentationParts(callback: (err: AWSError, data: DocumentationParts) -> Unit = definedExternally): Request<DocumentationParts, AWSError>
    open fun getDocumentationVersion(params: GetDocumentationVersionRequest, callback: (err: AWSError, data: DocumentationVersion) -> Unit = definedExternally): Request<DocumentationVersion, AWSError>
    open fun getDocumentationVersion(callback: (err: AWSError, data: DocumentationVersion) -> Unit = definedExternally): Request<DocumentationVersion, AWSError>
    open fun getDocumentationVersions(params: GetDocumentationVersionsRequest, callback: (err: AWSError, data: DocumentationVersions) -> Unit = definedExternally): Request<DocumentationVersions, AWSError>
    open fun getDocumentationVersions(callback: (err: AWSError, data: DocumentationVersions) -> Unit = definedExternally): Request<DocumentationVersions, AWSError>
    open fun getDomainName(params: GetDomainNameRequest, callback: (err: AWSError, data: DomainName) -> Unit = definedExternally): Request<DomainName, AWSError>
    open fun getDomainName(callback: (err: AWSError, data: DomainName) -> Unit = definedExternally): Request<DomainName, AWSError>
    open fun getDomainNames(params: GetDomainNamesRequest, callback: (err: AWSError, data: DomainNames) -> Unit = definedExternally): Request<DomainNames, AWSError>
    open fun getDomainNames(callback: (err: AWSError, data: DomainNames) -> Unit = definedExternally): Request<DomainNames, AWSError>
    open fun getExport(params: GetExportRequest, callback: (err: AWSError, data: ExportResponse) -> Unit = definedExternally): Request<ExportResponse, AWSError>
    open fun getExport(callback: (err: AWSError, data: ExportResponse) -> Unit = definedExternally): Request<ExportResponse, AWSError>
    open fun getGatewayResponse(params: GetGatewayResponseRequest, callback: (err: AWSError, data: GatewayResponse) -> Unit = definedExternally): Request<GatewayResponse, AWSError>
    open fun getGatewayResponse(callback: (err: AWSError, data: GatewayResponse) -> Unit = definedExternally): Request<GatewayResponse, AWSError>
    open fun getGatewayResponses(params: GetGatewayResponsesRequest, callback: (err: AWSError, data: GatewayResponses) -> Unit = definedExternally): Request<GatewayResponses, AWSError>
    open fun getGatewayResponses(callback: (err: AWSError, data: GatewayResponses) -> Unit = definedExternally): Request<GatewayResponses, AWSError>
    open fun getIntegration(params: GetIntegrationRequest, callback: (err: AWSError, data: Integration) -> Unit = definedExternally): Request<Integration, AWSError>
    open fun getIntegration(callback: (err: AWSError, data: Integration) -> Unit = definedExternally): Request<Integration, AWSError>
    open fun getIntegrationResponse(params: GetIntegrationResponseRequest, callback: (err: AWSError, data: IntegrationResponse) -> Unit = definedExternally): Request<IntegrationResponse, AWSError>
    open fun getIntegrationResponse(callback: (err: AWSError, data: IntegrationResponse) -> Unit = definedExternally): Request<IntegrationResponse, AWSError>
    open fun getMethod(params: GetMethodRequest, callback: (err: AWSError, data: Method) -> Unit = definedExternally): Request<Method, AWSError>
    open fun getMethod(callback: (err: AWSError, data: Method) -> Unit = definedExternally): Request<Method, AWSError>
    open fun getMethodResponse(params: GetMethodResponseRequest, callback: (err: AWSError, data: MethodResponse) -> Unit = definedExternally): Request<MethodResponse, AWSError>
    open fun getMethodResponse(callback: (err: AWSError, data: MethodResponse) -> Unit = definedExternally): Request<MethodResponse, AWSError>
    open fun getModel(params: GetModelRequest, callback: (err: AWSError, data: Model) -> Unit = definedExternally): Request<Model, AWSError>
    open fun getModel(callback: (err: AWSError, data: Model) -> Unit = definedExternally): Request<Model, AWSError>
    open fun getModelTemplate(params: GetModelTemplateRequest, callback: (err: AWSError, data: Template) -> Unit = definedExternally): Request<Template, AWSError>
    open fun getModelTemplate(callback: (err: AWSError, data: Template) -> Unit = definedExternally): Request<Template, AWSError>
    open fun getModels(params: GetModelsRequest, callback: (err: AWSError, data: Models) -> Unit = definedExternally): Request<Models, AWSError>
    open fun getModels(callback: (err: AWSError, data: Models) -> Unit = definedExternally): Request<Models, AWSError>
    open fun getRequestValidator(params: GetRequestValidatorRequest, callback: (err: AWSError, data: RequestValidator) -> Unit = definedExternally): Request<RequestValidator, AWSError>
    open fun getRequestValidator(callback: (err: AWSError, data: RequestValidator) -> Unit = definedExternally): Request<RequestValidator, AWSError>
    open fun getRequestValidators(params: GetRequestValidatorsRequest, callback: (err: AWSError, data: RequestValidators) -> Unit = definedExternally): Request<RequestValidators, AWSError>
    open fun getRequestValidators(callback: (err: AWSError, data: RequestValidators) -> Unit = definedExternally): Request<RequestValidators, AWSError>
    open fun getResource(params: GetResourceRequest, callback: (err: AWSError, data: Resource) -> Unit = definedExternally): Request<Resource, AWSError>
    open fun getResource(callback: (err: AWSError, data: Resource) -> Unit = definedExternally): Request<Resource, AWSError>
    open fun getResources(params: GetResourcesRequest, callback: (err: AWSError, data: Resources) -> Unit = definedExternally): Request<Resources, AWSError>
    open fun getResources(callback: (err: AWSError, data: Resources) -> Unit = definedExternally): Request<Resources, AWSError>
    open fun getRestApi(params: GetRestApiRequest, callback: (err: AWSError, data: RestApi) -> Unit = definedExternally): Request<RestApi, AWSError>
    open fun getRestApi(callback: (err: AWSError, data: RestApi) -> Unit = definedExternally): Request<RestApi, AWSError>
    open fun getRestApis(params: GetRestApisRequest, callback: (err: AWSError, data: RestApis) -> Unit = definedExternally): Request<RestApis, AWSError>
    open fun getRestApis(callback: (err: AWSError, data: RestApis) -> Unit = definedExternally): Request<RestApis, AWSError>
    open fun getSdk(params: GetSdkRequest, callback: (err: AWSError, data: SdkResponse) -> Unit = definedExternally): Request<SdkResponse, AWSError>
    open fun getSdk(callback: (err: AWSError, data: SdkResponse) -> Unit = definedExternally): Request<SdkResponse, AWSError>
    open fun getSdkType(params: GetSdkTypeRequest, callback: (err: AWSError, data: SdkType) -> Unit = definedExternally): Request<SdkType, AWSError>
    open fun getSdkType(callback: (err: AWSError, data: SdkType) -> Unit = definedExternally): Request<SdkType, AWSError>
    open fun getSdkTypes(params: GetSdkTypesRequest, callback: (err: AWSError, data: SdkTypes) -> Unit = definedExternally): Request<SdkTypes, AWSError>
    open fun getSdkTypes(callback: (err: AWSError, data: SdkTypes) -> Unit = definedExternally): Request<SdkTypes, AWSError>
    open fun getStage(params: GetStageRequest, callback: (err: AWSError, data: Stage) -> Unit = definedExternally): Request<Stage, AWSError>
    open fun getStage(callback: (err: AWSError, data: Stage) -> Unit = definedExternally): Request<Stage, AWSError>
    open fun getStages(params: GetStagesRequest, callback: (err: AWSError, data: Stages) -> Unit = definedExternally): Request<Stages, AWSError>
    open fun getStages(callback: (err: AWSError, data: Stages) -> Unit = definedExternally): Request<Stages, AWSError>
    open fun getTags(params: GetTagsRequest, callback: (err: AWSError, data: Tags) -> Unit = definedExternally): Request<Tags, AWSError>
    open fun getTags(callback: (err: AWSError, data: Tags) -> Unit = definedExternally): Request<Tags, AWSError>
    open fun getUsage(params: GetUsageRequest, callback: (err: AWSError, data: Usage) -> Unit = definedExternally): Request<Usage, AWSError>
    open fun getUsage(callback: (err: AWSError, data: Usage) -> Unit = definedExternally): Request<Usage, AWSError>
    open fun getUsagePlan(params: GetUsagePlanRequest, callback: (err: AWSError, data: UsagePlan) -> Unit = definedExternally): Request<UsagePlan, AWSError>
    open fun getUsagePlan(callback: (err: AWSError, data: UsagePlan) -> Unit = definedExternally): Request<UsagePlan, AWSError>
    open fun getUsagePlanKey(params: GetUsagePlanKeyRequest, callback: (err: AWSError, data: UsagePlanKey) -> Unit = definedExternally): Request<UsagePlanKey, AWSError>
    open fun getUsagePlanKey(callback: (err: AWSError, data: UsagePlanKey) -> Unit = definedExternally): Request<UsagePlanKey, AWSError>
    open fun getUsagePlanKeys(params: GetUsagePlanKeysRequest, callback: (err: AWSError, data: UsagePlanKeys) -> Unit = definedExternally): Request<UsagePlanKeys, AWSError>
    open fun getUsagePlanKeys(callback: (err: AWSError, data: UsagePlanKeys) -> Unit = definedExternally): Request<UsagePlanKeys, AWSError>
    open fun getUsagePlans(params: GetUsagePlansRequest, callback: (err: AWSError, data: UsagePlans) -> Unit = definedExternally): Request<UsagePlans, AWSError>
    open fun getUsagePlans(callback: (err: AWSError, data: UsagePlans) -> Unit = definedExternally): Request<UsagePlans, AWSError>
    open fun getVpcLink(params: GetVpcLinkRequest, callback: (err: AWSError, data: VpcLink) -> Unit = definedExternally): Request<VpcLink, AWSError>
    open fun getVpcLink(callback: (err: AWSError, data: VpcLink) -> Unit = definedExternally): Request<VpcLink, AWSError>
    open fun getVpcLinks(params: GetVpcLinksRequest, callback: (err: AWSError, data: VpcLinks) -> Unit = definedExternally): Request<VpcLinks, AWSError>
    open fun getVpcLinks(callback: (err: AWSError, data: VpcLinks) -> Unit = definedExternally): Request<VpcLinks, AWSError>
    open fun importApiKeys(params: ImportApiKeysRequest, callback: (err: AWSError, data: ApiKeyIds) -> Unit = definedExternally): Request<ApiKeyIds, AWSError>
    open fun importApiKeys(callback: (err: AWSError, data: ApiKeyIds) -> Unit = definedExternally): Request<ApiKeyIds, AWSError>
    open fun importDocumentationParts(params: ImportDocumentationPartsRequest, callback: (err: AWSError, data: DocumentationPartIds) -> Unit = definedExternally): Request<DocumentationPartIds, AWSError>
    open fun importDocumentationParts(callback: (err: AWSError, data: DocumentationPartIds) -> Unit = definedExternally): Request<DocumentationPartIds, AWSError>
    open fun importRestApi(params: ImportRestApiRequest, callback: (err: AWSError, data: RestApi) -> Unit = definedExternally): Request<RestApi, AWSError>
    open fun importRestApi(callback: (err: AWSError, data: RestApi) -> Unit = definedExternally): Request<RestApi, AWSError>
    open fun putGatewayResponse(params: PutGatewayResponseRequest, callback: (err: AWSError, data: GatewayResponse) -> Unit = definedExternally): Request<GatewayResponse, AWSError>
    open fun putGatewayResponse(callback: (err: AWSError, data: GatewayResponse) -> Unit = definedExternally): Request<GatewayResponse, AWSError>
    open fun putIntegration(params: PutIntegrationRequest, callback: (err: AWSError, data: Integration) -> Unit = definedExternally): Request<Integration, AWSError>
    open fun putIntegration(callback: (err: AWSError, data: Integration) -> Unit = definedExternally): Request<Integration, AWSError>
    open fun putIntegrationResponse(params: PutIntegrationResponseRequest, callback: (err: AWSError, data: IntegrationResponse) -> Unit = definedExternally): Request<IntegrationResponse, AWSError>
    open fun putIntegrationResponse(callback: (err: AWSError, data: IntegrationResponse) -> Unit = definedExternally): Request<IntegrationResponse, AWSError>
    open fun putMethod(params: PutMethodRequest, callback: (err: AWSError, data: Method) -> Unit = definedExternally): Request<Method, AWSError>
    open fun putMethod(callback: (err: AWSError, data: Method) -> Unit = definedExternally): Request<Method, AWSError>
    open fun putMethodResponse(params: PutMethodResponseRequest, callback: (err: AWSError, data: MethodResponse) -> Unit = definedExternally): Request<MethodResponse, AWSError>
    open fun putMethodResponse(callback: (err: AWSError, data: MethodResponse) -> Unit = definedExternally): Request<MethodResponse, AWSError>
    open fun putRestApi(params: PutRestApiRequest, callback: (err: AWSError, data: RestApi) -> Unit = definedExternally): Request<RestApi, AWSError>
    open fun putRestApi(callback: (err: AWSError, data: RestApi) -> Unit = definedExternally): Request<RestApi, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun testInvokeAuthorizer(params: TestInvokeAuthorizerRequest, callback: (err: AWSError, data: TestInvokeAuthorizerResponse) -> Unit = definedExternally): Request<TestInvokeAuthorizerResponse, AWSError>
    open fun testInvokeAuthorizer(callback: (err: AWSError, data: TestInvokeAuthorizerResponse) -> Unit = definedExternally): Request<TestInvokeAuthorizerResponse, AWSError>
    open fun testInvokeMethod(params: TestInvokeMethodRequest, callback: (err: AWSError, data: TestInvokeMethodResponse) -> Unit = definedExternally): Request<TestInvokeMethodResponse, AWSError>
    open fun testInvokeMethod(callback: (err: AWSError, data: TestInvokeMethodResponse) -> Unit = definedExternally): Request<TestInvokeMethodResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateAccount(params: UpdateAccountRequest, callback: (err: AWSError, data: Account) -> Unit = definedExternally): Request<Account, AWSError>
    open fun updateAccount(callback: (err: AWSError, data: Account) -> Unit = definedExternally): Request<Account, AWSError>
    open fun updateApiKey(params: UpdateApiKeyRequest, callback: (err: AWSError, data: ApiKey) -> Unit = definedExternally): Request<ApiKey, AWSError>
    open fun updateApiKey(callback: (err: AWSError, data: ApiKey) -> Unit = definedExternally): Request<ApiKey, AWSError>
    open fun updateAuthorizer(params: UpdateAuthorizerRequest, callback: (err: AWSError, data: Authorizer) -> Unit = definedExternally): Request<Authorizer, AWSError>
    open fun updateAuthorizer(callback: (err: AWSError, data: Authorizer) -> Unit = definedExternally): Request<Authorizer, AWSError>
    open fun updateBasePathMapping(params: UpdateBasePathMappingRequest, callback: (err: AWSError, data: BasePathMapping) -> Unit = definedExternally): Request<BasePathMapping, AWSError>
    open fun updateBasePathMapping(callback: (err: AWSError, data: BasePathMapping) -> Unit = definedExternally): Request<BasePathMapping, AWSError>
    open fun updateClientCertificate(params: UpdateClientCertificateRequest, callback: (err: AWSError, data: ClientCertificate) -> Unit = definedExternally): Request<ClientCertificate, AWSError>
    open fun updateClientCertificate(callback: (err: AWSError, data: ClientCertificate) -> Unit = definedExternally): Request<ClientCertificate, AWSError>
    open fun updateDeployment(params: UpdateDeploymentRequest, callback: (err: AWSError, data: Deployment) -> Unit = definedExternally): Request<Deployment, AWSError>
    open fun updateDeployment(callback: (err: AWSError, data: Deployment) -> Unit = definedExternally): Request<Deployment, AWSError>
    open fun updateDocumentationPart(params: UpdateDocumentationPartRequest, callback: (err: AWSError, data: DocumentationPart) -> Unit = definedExternally): Request<DocumentationPart, AWSError>
    open fun updateDocumentationPart(callback: (err: AWSError, data: DocumentationPart) -> Unit = definedExternally): Request<DocumentationPart, AWSError>
    open fun updateDocumentationVersion(params: UpdateDocumentationVersionRequest, callback: (err: AWSError, data: DocumentationVersion) -> Unit = definedExternally): Request<DocumentationVersion, AWSError>
    open fun updateDocumentationVersion(callback: (err: AWSError, data: DocumentationVersion) -> Unit = definedExternally): Request<DocumentationVersion, AWSError>
    open fun updateDomainName(params: UpdateDomainNameRequest, callback: (err: AWSError, data: DomainName) -> Unit = definedExternally): Request<DomainName, AWSError>
    open fun updateDomainName(callback: (err: AWSError, data: DomainName) -> Unit = definedExternally): Request<DomainName, AWSError>
    open fun updateGatewayResponse(params: UpdateGatewayResponseRequest, callback: (err: AWSError, data: GatewayResponse) -> Unit = definedExternally): Request<GatewayResponse, AWSError>
    open fun updateGatewayResponse(callback: (err: AWSError, data: GatewayResponse) -> Unit = definedExternally): Request<GatewayResponse, AWSError>
    open fun updateIntegration(params: UpdateIntegrationRequest, callback: (err: AWSError, data: Integration) -> Unit = definedExternally): Request<Integration, AWSError>
    open fun updateIntegration(callback: (err: AWSError, data: Integration) -> Unit = definedExternally): Request<Integration, AWSError>
    open fun updateIntegrationResponse(params: UpdateIntegrationResponseRequest, callback: (err: AWSError, data: IntegrationResponse) -> Unit = definedExternally): Request<IntegrationResponse, AWSError>
    open fun updateIntegrationResponse(callback: (err: AWSError, data: IntegrationResponse) -> Unit = definedExternally): Request<IntegrationResponse, AWSError>
    open fun updateMethod(params: UpdateMethodRequest, callback: (err: AWSError, data: Method) -> Unit = definedExternally): Request<Method, AWSError>
    open fun updateMethod(callback: (err: AWSError, data: Method) -> Unit = definedExternally): Request<Method, AWSError>
    open fun updateMethodResponse(params: UpdateMethodResponseRequest, callback: (err: AWSError, data: MethodResponse) -> Unit = definedExternally): Request<MethodResponse, AWSError>
    open fun updateMethodResponse(callback: (err: AWSError, data: MethodResponse) -> Unit = definedExternally): Request<MethodResponse, AWSError>
    open fun updateModel(params: UpdateModelRequest, callback: (err: AWSError, data: Model) -> Unit = definedExternally): Request<Model, AWSError>
    open fun updateModel(callback: (err: AWSError, data: Model) -> Unit = definedExternally): Request<Model, AWSError>
    open fun updateRequestValidator(params: UpdateRequestValidatorRequest, callback: (err: AWSError, data: RequestValidator) -> Unit = definedExternally): Request<RequestValidator, AWSError>
    open fun updateRequestValidator(callback: (err: AWSError, data: RequestValidator) -> Unit = definedExternally): Request<RequestValidator, AWSError>
    open fun updateResource(params: UpdateResourceRequest, callback: (err: AWSError, data: Resource) -> Unit = definedExternally): Request<Resource, AWSError>
    open fun updateResource(callback: (err: AWSError, data: Resource) -> Unit = definedExternally): Request<Resource, AWSError>
    open fun updateRestApi(params: UpdateRestApiRequest, callback: (err: AWSError, data: RestApi) -> Unit = definedExternally): Request<RestApi, AWSError>
    open fun updateRestApi(callback: (err: AWSError, data: RestApi) -> Unit = definedExternally): Request<RestApi, AWSError>
    open fun updateStage(params: UpdateStageRequest, callback: (err: AWSError, data: Stage) -> Unit = definedExternally): Request<Stage, AWSError>
    open fun updateStage(callback: (err: AWSError, data: Stage) -> Unit = definedExternally): Request<Stage, AWSError>
    open fun updateUsage(params: UpdateUsageRequest, callback: (err: AWSError, data: Usage) -> Unit = definedExternally): Request<Usage, AWSError>
    open fun updateUsage(callback: (err: AWSError, data: Usage) -> Unit = definedExternally): Request<Usage, AWSError>
    open fun updateUsagePlan(params: UpdateUsagePlanRequest, callback: (err: AWSError, data: UsagePlan) -> Unit = definedExternally): Request<UsagePlan, AWSError>
    open fun updateUsagePlan(callback: (err: AWSError, data: UsagePlan) -> Unit = definedExternally): Request<UsagePlan, AWSError>
    open fun updateVpcLink(params: UpdateVpcLinkRequest, callback: (err: AWSError, data: VpcLink) -> Unit = definedExternally): Request<VpcLink, AWSError>
    open fun updateVpcLink(callback: (err: AWSError, data: VpcLink) -> Unit = definedExternally): Request<VpcLink, AWSError>
    interface AccessLogSettings {
        var format: String?
            get() = definedExternally
            set(value) = definedExternally
        var destinationArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Account {
        var cloudwatchRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var throttleSettings: ThrottleSettings?
            get() = definedExternally
            set(value) = definedExternally
        var features: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
        var apiKeyVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApiKey {
        var id: String?
            get() = definedExternally
            set(value) = definedExternally
        var value: String?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var customerId: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var stageKeys: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
        var tags: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApiKeyIds {
        var ids: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
        var warnings: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApiKeys {
        var warnings: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var items: ListOfApiKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApiStage {
        var apiId: String?
            get() = definedExternally
            set(value) = definedExternally
        var stage: String?
            get() = definedExternally
            set(value) = definedExternally
        var throttle: MapOfApiStageThrottleSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Authorizer {
        var id: String?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "TOKEN" | "REQUEST" | "COGNITO_USER_POOLS" | String */
        var providerARNs: ListOfARNs?
            get() = definedExternally
            set(value) = definedExternally
        var authType: String?
            get() = definedExternally
            set(value) = definedExternally
        var authorizerUri: String?
            get() = definedExternally
            set(value) = definedExternally
        var authorizerCredentials: String?
            get() = definedExternally
            set(value) = definedExternally
        var identitySource: String?
            get() = definedExternally
            set(value) = definedExternally
        var identityValidationExpression: String?
            get() = definedExternally
            set(value) = definedExternally
        var authorizerResultTtlInSeconds: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Authorizers {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var items: ListOfAuthorizer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BasePathMapping {
        var basePath: String?
            get() = definedExternally
            set(value) = definedExternally
        var restApiId: String?
            get() = definedExternally
            set(value) = definedExternally
        var stage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BasePathMappings {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var items: ListOfBasePathMapping?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CanarySettings {
        var percentTraffic: Double?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentId: String?
            get() = definedExternally
            set(value) = definedExternally
        var stageVariableOverrides: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var useStageCache: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientCertificate {
        var clientCertificateId: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var pemEncodedCertificate: String?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var expirationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var tags: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientCertificates {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var items: ListOfClientCertificate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateApiKeyRequest {
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var generateDistinctId: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var value: String?
            get() = definedExternally
            set(value) = definedExternally
        var stageKeys: ListOfStageKeys?
            get() = definedExternally
            set(value) = definedExternally
        var customerId: String?
            get() = definedExternally
            set(value) = definedExternally
        var tags: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAuthorizerRequest {
        var restApiId: String
        var name: String
        var type: String /* "TOKEN" | "REQUEST" | "COGNITO_USER_POOLS" | String */
        var providerARNs: ListOfARNs?
            get() = definedExternally
            set(value) = definedExternally
        var authType: String?
            get() = definedExternally
            set(value) = definedExternally
        var authorizerUri: String?
            get() = definedExternally
            set(value) = definedExternally
        var authorizerCredentials: String?
            get() = definedExternally
            set(value) = definedExternally
        var identitySource: String?
            get() = definedExternally
            set(value) = definedExternally
        var identityValidationExpression: String?
            get() = definedExternally
            set(value) = definedExternally
        var authorizerResultTtlInSeconds: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBasePathMappingRequest {
        var domainName: String
        var basePath: String?
            get() = definedExternally
            set(value) = definedExternally
        var restApiId: String
        var stage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeploymentRequest {
        var restApiId: String
        var stageName: String?
            get() = definedExternally
            set(value) = definedExternally
        var stageDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var cacheClusterEnabled: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var cacheClusterSize: String /* "0.5" | "1.6" | "6.1" | "13.5" | "28.4" | "58.2" | "118" | "237" | String */
        var variables: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var canarySettings: DeploymentCanarySettings?
            get() = definedExternally
            set(value) = definedExternally
        var tracingEnabled: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDocumentationPartRequest {
        var restApiId: String
        var location: DocumentationPartLocation
        var properties: String
    }
    interface CreateDocumentationVersionRequest {
        var restApiId: String
        var documentationVersion: String
        var stageName: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDomainNameRequest {
        var domainName: String
        var certificateName: String?
            get() = definedExternally
            set(value) = definedExternally
        var certificateBody: String?
            get() = definedExternally
            set(value) = definedExternally
        var certificatePrivateKey: String?
            get() = definedExternally
            set(value) = definedExternally
        var certificateChain: String?
            get() = definedExternally
            set(value) = definedExternally
        var certificateArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var regionalCertificateName: String?
            get() = definedExternally
            set(value) = definedExternally
        var regionalCertificateArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var endpointConfiguration: EndpointConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var tags: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var securityPolicy: String /* "TLS_1_0" | "TLS_1_2" | String */
    }
    interface CreateModelRequest {
        var restApiId: String
        var name: String
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var schema: String?
            get() = definedExternally
            set(value) = definedExternally
        var contentType: String
    }
    interface CreateRequestValidatorRequest {
        var restApiId: String
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var validateRequestBody: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var validateRequestParameters: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateResourceRequest {
        var restApiId: String
        var parentId: String
        var pathPart: String
    }
    interface CreateRestApiRequest {
        var name: String
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var version: String?
            get() = definedExternally
            set(value) = definedExternally
        var cloneFrom: String?
            get() = definedExternally
            set(value) = definedExternally
        var binaryMediaTypes: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
        var minimumCompressionSize: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var apiKeySource: String /* "HEADER" | "AUTHORIZER" | String */
        var endpointConfiguration: EndpointConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var policy: String?
            get() = definedExternally
            set(value) = definedExternally
        var tags: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStageRequest {
        var restApiId: String
        var stageName: String
        var deploymentId: String
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var cacheClusterEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var cacheClusterSize: String /* "0.5" | "1.6" | "6.1" | "13.5" | "28.4" | "58.2" | "118" | "237" | String */
        var variables: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var documentationVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var canarySettings: CanarySettings?
            get() = definedExternally
            set(value) = definedExternally
        var tracingEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var tags: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUsagePlanKeyRequest {
        var usagePlanId: String
        var keyId: String
        var keyType: String
    }
    interface CreateUsagePlanRequest {
        var name: String
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var apiStages: ListOfApiStage?
            get() = definedExternally
            set(value) = definedExternally
        var throttle: ThrottleSettings?
            get() = definedExternally
            set(value) = definedExternally
        var quota: QuotaSettings?
            get() = definedExternally
            set(value) = definedExternally
        var tags: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateVpcLinkRequest {
        var name: String
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var targetArns: ListOfString
        var tags: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteApiKeyRequest {
        var apiKey: String
    }
    interface DeleteAuthorizerRequest {
        var restApiId: String
        var authorizerId: String
    }
    interface DeleteBasePathMappingRequest {
        var domainName: String
        var basePath: String
    }
    interface DeleteClientCertificateRequest {
        var clientCertificateId: String
    }
    interface DeleteDeploymentRequest {
        var restApiId: String
        var deploymentId: String
    }
    interface DeleteDocumentationPartRequest {
        var restApiId: String
        var documentationPartId: String
    }
    interface DeleteDocumentationVersionRequest {
        var restApiId: String
        var documentationVersion: String
    }
    interface DeleteDomainNameRequest {
        var domainName: String
    }
    interface DeleteGatewayResponseRequest {
        var restApiId: String
        var responseType: String /* "DEFAULT_4XX" | "DEFAULT_5XX" | "RESOURCE_NOT_FOUND" | "UNAUTHORIZED" | "INVALID_API_KEY" | "ACCESS_DENIED" | "AUTHORIZER_FAILURE" | "AUTHORIZER_CONFIGURATION_ERROR" | "INVALID_SIGNATURE" | "EXPIRED_TOKEN" | "MISSING_AUTHENTICATION_TOKEN" | "INTEGRATION_FAILURE" | "INTEGRATION_TIMEOUT" | "API_CONFIGURATION_ERROR" | "UNSUPPORTED_MEDIA_TYPE" | "BAD_REQUEST_PARAMETERS" | "BAD_REQUEST_BODY" | "REQUEST_TOO_LARGE" | "THROTTLED" | "QUOTA_EXCEEDED" | String */
    }
    interface DeleteIntegrationRequest {
        var restApiId: String
        var resourceId: String
        var httpMethod: String
    }
    interface DeleteIntegrationResponseRequest {
        var restApiId: String
        var resourceId: String
        var httpMethod: String
        var statusCode: StatusCode
    }
    interface DeleteMethodRequest {
        var restApiId: String
        var resourceId: String
        var httpMethod: String
    }
    interface DeleteMethodResponseRequest {
        var restApiId: String
        var resourceId: String
        var httpMethod: String
        var statusCode: StatusCode
    }
    interface DeleteModelRequest {
        var restApiId: String
        var modelName: String
    }
    interface DeleteRequestValidatorRequest {
        var restApiId: String
        var requestValidatorId: String
    }
    interface DeleteResourceRequest {
        var restApiId: String
        var resourceId: String
    }
    interface DeleteRestApiRequest {
        var restApiId: String
    }
    interface DeleteStageRequest {
        var restApiId: String
        var stageName: String
    }
    interface DeleteUsagePlanKeyRequest {
        var usagePlanId: String
        var keyId: String
    }
    interface DeleteUsagePlanRequest {
        var usagePlanId: String
    }
    interface DeleteVpcLinkRequest {
        var vpcLinkId: String
    }
    interface Deployment {
        var id: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var apiSummary: PathToMapOfMethodSnapshot?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeploymentCanarySettings {
        var percentTraffic: Double?
            get() = definedExternally
            set(value) = definedExternally
        var stageVariableOverrides: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var useStageCache: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Deployments {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var items: ListOfDeployment?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentationPart {
        var id: String?
            get() = definedExternally
            set(value) = definedExternally
        var location: DocumentationPartLocation?
            get() = definedExternally
            set(value) = definedExternally
        var properties: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentationPartIds {
        var ids: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
        var warnings: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentationPartLocation {
        var type: String /* "API" | "AUTHORIZER" | "MODEL" | "RESOURCE" | "METHOD" | "PATH_PARAMETER" | "QUERY_PARAMETER" | "REQUEST_HEADER" | "REQUEST_BODY" | "RESPONSE" | "RESPONSE_HEADER" | "RESPONSE_BODY" | String */
        var path: String?
            get() = definedExternally
            set(value) = definedExternally
        var method: String?
            get() = definedExternally
            set(value) = definedExternally
        var statusCode: DocumentationPartLocationStatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentationParts {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var items: ListOfDocumentationPart?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentationVersion {
        var version: String?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentationVersions {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var items: ListOfDocumentationVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DomainName {
        var domainName: String?
            get() = definedExternally
            set(value) = definedExternally
        var certificateName: String?
            get() = definedExternally
            set(value) = definedExternally
        var certificateArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var certificateUploadDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var regionalDomainName: String?
            get() = definedExternally
            set(value) = definedExternally
        var regionalHostedZoneId: String?
            get() = definedExternally
            set(value) = definedExternally
        var regionalCertificateName: String?
            get() = definedExternally
            set(value) = definedExternally
        var regionalCertificateArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var distributionDomainName: String?
            get() = definedExternally
            set(value) = definedExternally
        var distributionHostedZoneId: String?
            get() = definedExternally
            set(value) = definedExternally
        var endpointConfiguration: EndpointConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var domainNameStatus: String /* "AVAILABLE" | "UPDATING" | "PENDING" | String */
        var domainNameStatusMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var securityPolicy: String /* "TLS_1_0" | "TLS_1_2" | String */
        var tags: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DomainNames {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var items: ListOfDomainName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EndpointConfiguration {
        var types: ListOfEndpointType?
            get() = definedExternally
            set(value) = definedExternally
        var vpcEndpointIds: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExportResponse {
        var contentType: String?
            get() = definedExternally
            set(value) = definedExternally
        var contentDisposition: String?
            get() = definedExternally
            set(value) = definedExternally
        var body: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FlushStageAuthorizersCacheRequest {
        var restApiId: String
        var stageName: String
    }
    interface FlushStageCacheRequest {
        var restApiId: String
        var stageName: String
    }
    interface GatewayResponse {
        var responseType: String /* "DEFAULT_4XX" | "DEFAULT_5XX" | "RESOURCE_NOT_FOUND" | "UNAUTHORIZED" | "INVALID_API_KEY" | "ACCESS_DENIED" | "AUTHORIZER_FAILURE" | "AUTHORIZER_CONFIGURATION_ERROR" | "INVALID_SIGNATURE" | "EXPIRED_TOKEN" | "MISSING_AUTHENTICATION_TOKEN" | "INTEGRATION_FAILURE" | "INTEGRATION_TIMEOUT" | "API_CONFIGURATION_ERROR" | "UNSUPPORTED_MEDIA_TYPE" | "BAD_REQUEST_PARAMETERS" | "BAD_REQUEST_BODY" | "REQUEST_TOO_LARGE" | "THROTTLED" | "QUOTA_EXCEEDED" | String */
        var statusCode: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var responseParameters: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var responseTemplates: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var defaultResponse: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GatewayResponses {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var items: ListOfGatewayResponse?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GenerateClientCertificateRequest {
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var tags: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAccountRequest
    interface GetApiKeyRequest {
        var apiKey: String
        var includeValue: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetApiKeysRequest {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var limit: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var nameQuery: String?
            get() = definedExternally
            set(value) = definedExternally
        var customerId: String?
            get() = definedExternally
            set(value) = definedExternally
        var includeValues: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAuthorizerRequest {
        var restApiId: String
        var authorizerId: String
    }
    interface GetAuthorizersRequest {
        var restApiId: String
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var limit: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBasePathMappingRequest {
        var domainName: String
        var basePath: String
    }
    interface GetBasePathMappingsRequest {
        var domainName: String
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var limit: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetClientCertificateRequest {
        var clientCertificateId: String
    }
    interface GetClientCertificatesRequest {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var limit: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeploymentRequest {
        var restApiId: String
        var deploymentId: String
        var embed: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeploymentsRequest {
        var restApiId: String
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var limit: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDocumentationPartRequest {
        var restApiId: String
        var documentationPartId: String
    }
    interface GetDocumentationPartsRequest {
        var restApiId: String
        var type: String /* "API" | "AUTHORIZER" | "MODEL" | "RESOURCE" | "METHOD" | "PATH_PARAMETER" | "QUERY_PARAMETER" | "REQUEST_HEADER" | "REQUEST_BODY" | "RESPONSE" | "RESPONSE_HEADER" | "RESPONSE_BODY" | String */
        var nameQuery: String?
            get() = definedExternally
            set(value) = definedExternally
        var path: String?
            get() = definedExternally
            set(value) = definedExternally
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var limit: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var locationStatus: String /* "DOCUMENTED" | "UNDOCUMENTED" | String */
    }
    interface GetDocumentationVersionRequest {
        var restApiId: String
        var documentationVersion: String
    }
    interface GetDocumentationVersionsRequest {
        var restApiId: String
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var limit: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDomainNameRequest {
        var domainName: String
    }
    interface GetDomainNamesRequest {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var limit: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetExportRequest {
        var restApiId: String
        var stageName: String
        var exportType: String
        var parameters: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var accepts: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetGatewayResponseRequest {
        var restApiId: String
        var responseType: String /* "DEFAULT_4XX" | "DEFAULT_5XX" | "RESOURCE_NOT_FOUND" | "UNAUTHORIZED" | "INVALID_API_KEY" | "ACCESS_DENIED" | "AUTHORIZER_FAILURE" | "AUTHORIZER_CONFIGURATION_ERROR" | "INVALID_SIGNATURE" | "EXPIRED_TOKEN" | "MISSING_AUTHENTICATION_TOKEN" | "INTEGRATION_FAILURE" | "INTEGRATION_TIMEOUT" | "API_CONFIGURATION_ERROR" | "UNSUPPORTED_MEDIA_TYPE" | "BAD_REQUEST_PARAMETERS" | "BAD_REQUEST_BODY" | "REQUEST_TOO_LARGE" | "THROTTLED" | "QUOTA_EXCEEDED" | String */
    }
    interface GetGatewayResponsesRequest {
        var restApiId: String
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var limit: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIntegrationRequest {
        var restApiId: String
        var resourceId: String
        var httpMethod: String
    }
    interface GetIntegrationResponseRequest {
        var restApiId: String
        var resourceId: String
        var httpMethod: String
        var statusCode: StatusCode
    }
    interface GetMethodRequest {
        var restApiId: String
        var resourceId: String
        var httpMethod: String
    }
    interface GetMethodResponseRequest {
        var restApiId: String
        var resourceId: String
        var httpMethod: String
        var statusCode: StatusCode
    }
    interface GetModelRequest {
        var restApiId: String
        var modelName: String
        var flatten: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetModelTemplateRequest {
        var restApiId: String
        var modelName: String
    }
    interface GetModelsRequest {
        var restApiId: String
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var limit: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRequestValidatorRequest {
        var restApiId: String
        var requestValidatorId: String
    }
    interface GetRequestValidatorsRequest {
        var restApiId: String
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var limit: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResourceRequest {
        var restApiId: String
        var resourceId: String
        var embed: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResourcesRequest {
        var restApiId: String
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var limit: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var embed: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRestApiRequest {
        var restApiId: String
    }
    interface GetRestApisRequest {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var limit: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSdkRequest {
        var restApiId: String
        var stageName: String
        var sdkType: String
        var parameters: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSdkTypeRequest {
        var id: String
    }
    interface GetSdkTypesRequest {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var limit: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetStageRequest {
        var restApiId: String
        var stageName: String
    }
    interface GetStagesRequest {
        var restApiId: String
        var deploymentId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTagsRequest {
        var resourceArn: String
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var limit: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetUsagePlanKeyRequest {
        var usagePlanId: String
        var keyId: String
    }
    interface GetUsagePlanKeysRequest {
        var usagePlanId: String
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var limit: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var nameQuery: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetUsagePlanRequest {
        var usagePlanId: String
    }
    interface GetUsagePlansRequest {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var keyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var limit: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetUsageRequest {
        var usagePlanId: String
        var keyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var startDate: String
        var endDate: String
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var limit: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetVpcLinkRequest {
        var vpcLinkId: String
    }
    interface GetVpcLinksRequest {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var limit: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportApiKeysRequest {
        var body: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var format: String /* "csv" | String */
        var failOnWarnings: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportDocumentationPartsRequest {
        var restApiId: String
        var mode: String /* "merge" | "overwrite" | String */
        var failOnWarnings: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var body: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportRestApiRequest {
        var failOnWarnings: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var parameters: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var body: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Integration {
        var type: String /* "HTTP" | "AWS" | "MOCK" | "HTTP_PROXY" | "AWS_PROXY" | String */
        var httpMethod: String?
            get() = definedExternally
            set(value) = definedExternally
        var uri: String?
            get() = definedExternally
            set(value) = definedExternally
        var connectionType: String /* "INTERNET" | "VPC_LINK" | String */
        var connectionId: String?
            get() = definedExternally
            set(value) = definedExternally
        var credentials: String?
            get() = definedExternally
            set(value) = definedExternally
        var requestParameters: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var requestTemplates: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var passthroughBehavior: String?
            get() = definedExternally
            set(value) = definedExternally
        var contentHandling: String /* "CONVERT_TO_BINARY" | "CONVERT_TO_TEXT" | String */
        var timeoutInMillis: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var cacheNamespace: String?
            get() = definedExternally
            set(value) = definedExternally
        var cacheKeyParameters: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
        var integrationResponses: MapOfIntegrationResponse?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IntegrationResponse {
        var statusCode: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var selectionPattern: String?
            get() = definedExternally
            set(value) = definedExternally
        var responseParameters: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var responseTemplates: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var contentHandling: String /* "CONVERT_TO_BINARY" | "CONVERT_TO_TEXT" | String */
    }
    interface MapOfApiStageThrottleSettings {
        @nativeGetter
        operator fun get(key: String): ThrottleSettings?
        @nativeSetter
        operator fun set(key: String, value: ThrottleSettings)
    }
    interface MapOfIntegrationResponse {
        @nativeGetter
        operator fun get(key: String): IntegrationResponse?
        @nativeSetter
        operator fun set(key: String, value: IntegrationResponse)
    }
    interface MapOfKeyUsages {
        @nativeGetter
        operator fun get(key: String): ListOfUsage?
        @nativeSetter
        operator fun set(key: String, value: ListOfUsage)
    }
    interface MapOfMethod {
        @nativeGetter
        operator fun get(key: String): Method?
        @nativeSetter
        operator fun set(key: String, value: Method)
    }
    interface MapOfMethodResponse {
        @nativeGetter
        operator fun get(key: String): MethodResponse?
        @nativeSetter
        operator fun set(key: String, value: MethodResponse)
    }
    interface MapOfMethodSettings {
        @nativeGetter
        operator fun get(key: String): MethodSetting?
        @nativeSetter
        operator fun set(key: String, value: MethodSetting)
    }
    interface MapOfMethodSnapshot {
        @nativeGetter
        operator fun get(key: String): MethodSnapshot?
        @nativeSetter
        operator fun set(key: String, value: MethodSnapshot)
    }
    interface MapOfStringToBoolean {
        @nativeGetter
        operator fun get(key: String): NullableBoolean?
        @nativeSetter
        operator fun set(key: String, value: NullableBoolean)
    }
    interface MapOfStringToList {
        @nativeGetter
        operator fun get(key: String): ListOfString?
        @nativeSetter
        operator fun set(key: String, value: ListOfString)
    }
    interface MapOfStringToString {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface Method {
        var httpMethod: String?
            get() = definedExternally
            set(value) = definedExternally
        var authorizationType: String?
            get() = definedExternally
            set(value) = definedExternally
        var authorizerId: String?
            get() = definedExternally
            set(value) = definedExternally
        var apiKeyRequired: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var requestValidatorId: String?
            get() = definedExternally
            set(value) = definedExternally
        var operationName: String?
            get() = definedExternally
            set(value) = definedExternally
        var requestParameters: MapOfStringToBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var requestModels: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var methodResponses: MapOfMethodResponse?
            get() = definedExternally
            set(value) = definedExternally
        var methodIntegration: Integration?
            get() = definedExternally
            set(value) = definedExternally
        var authorizationScopes: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MethodResponse {
        var statusCode: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var responseParameters: MapOfStringToBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var responseModels: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MethodSetting {
        var metricsEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var loggingLevel: String?
            get() = definedExternally
            set(value) = definedExternally
        var dataTraceEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var throttlingBurstLimit: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var throttlingRateLimit: Double?
            get() = definedExternally
            set(value) = definedExternally
        var cachingEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var cacheTtlInSeconds: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var cacheDataEncrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var requireAuthorizationForCacheControl: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var unauthorizedCacheControlHeaderStrategy: String /* "FAIL_WITH_403" | "SUCCEED_WITH_RESPONSE_HEADER" | "SUCCEED_WITHOUT_RESPONSE_HEADER" | String */
    }
    interface MethodSnapshot {
        var authorizationType: String?
            get() = definedExternally
            set(value) = definedExternally
        var apiKeyRequired: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Model {
        var id: String?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var schema: String?
            get() = definedExternally
            set(value) = definedExternally
        var contentType: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Models {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var items: ListOfModel?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PatchOperation {
        var op: String /* "add" | "remove" | "replace" | "move" | "copy" | "test" | String */
        var path: String?
            get() = definedExternally
            set(value) = definedExternally
        var value: String?
            get() = definedExternally
            set(value) = definedExternally
        var from: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PathToMapOfMethodSnapshot {
        @nativeGetter
        operator fun get(key: String): MapOfMethodSnapshot?
        @nativeSetter
        operator fun set(key: String, value: MapOfMethodSnapshot)
    }
    interface PutGatewayResponseRequest {
        var restApiId: String
        var responseType: String /* "DEFAULT_4XX" | "DEFAULT_5XX" | "RESOURCE_NOT_FOUND" | "UNAUTHORIZED" | "INVALID_API_KEY" | "ACCESS_DENIED" | "AUTHORIZER_FAILURE" | "AUTHORIZER_CONFIGURATION_ERROR" | "INVALID_SIGNATURE" | "EXPIRED_TOKEN" | "MISSING_AUTHENTICATION_TOKEN" | "INTEGRATION_FAILURE" | "INTEGRATION_TIMEOUT" | "API_CONFIGURATION_ERROR" | "UNSUPPORTED_MEDIA_TYPE" | "BAD_REQUEST_PARAMETERS" | "BAD_REQUEST_BODY" | "REQUEST_TOO_LARGE" | "THROTTLED" | "QUOTA_EXCEEDED" | String */
        var statusCode: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var responseParameters: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var responseTemplates: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutIntegrationRequest {
        var restApiId: String
        var resourceId: String
        var httpMethod: String
        var type: String /* "HTTP" | "AWS" | "MOCK" | "HTTP_PROXY" | "AWS_PROXY" | String */
        var integrationHttpMethod: String?
            get() = definedExternally
            set(value) = definedExternally
        var uri: String?
            get() = definedExternally
            set(value) = definedExternally
        var connectionType: String /* "INTERNET" | "VPC_LINK" | String */
        var connectionId: String?
            get() = definedExternally
            set(value) = definedExternally
        var credentials: String?
            get() = definedExternally
            set(value) = definedExternally
        var requestParameters: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var requestTemplates: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var passthroughBehavior: String?
            get() = definedExternally
            set(value) = definedExternally
        var cacheNamespace: String?
            get() = definedExternally
            set(value) = definedExternally
        var cacheKeyParameters: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
        var contentHandling: String /* "CONVERT_TO_BINARY" | "CONVERT_TO_TEXT" | String */
        var timeoutInMillis: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutIntegrationResponseRequest {
        var restApiId: String
        var resourceId: String
        var httpMethod: String
        var statusCode: StatusCode
        var selectionPattern: String?
            get() = definedExternally
            set(value) = definedExternally
        var responseParameters: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var responseTemplates: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var contentHandling: String /* "CONVERT_TO_BINARY" | "CONVERT_TO_TEXT" | String */
    }
    interface PutMethodRequest {
        var restApiId: String
        var resourceId: String
        var httpMethod: String
        var authorizationType: String
        var authorizerId: String?
            get() = definedExternally
            set(value) = definedExternally
        var apiKeyRequired: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var operationName: String?
            get() = definedExternally
            set(value) = definedExternally
        var requestParameters: MapOfStringToBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var requestModels: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var requestValidatorId: String?
            get() = definedExternally
            set(value) = definedExternally
        var authorizationScopes: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutMethodResponseRequest {
        var restApiId: String
        var resourceId: String
        var httpMethod: String
        var statusCode: StatusCode
        var responseParameters: MapOfStringToBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var responseModels: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutRestApiRequest {
        var restApiId: String
        var mode: String /* "merge" | "overwrite" | String */
        var failOnWarnings: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var parameters: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var body: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface QuotaSettings {
        var limit: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var offset: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var period: String /* "DAY" | "WEEK" | "MONTH" | String */
    }
    interface RequestValidator {
        var id: String?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var validateRequestBody: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var validateRequestParameters: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RequestValidators {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var items: ListOfRequestValidator?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Resource {
        var id: String?
            get() = definedExternally
            set(value) = definedExternally
        var parentId: String?
            get() = definedExternally
            set(value) = definedExternally
        var pathPart: String?
            get() = definedExternally
            set(value) = definedExternally
        var path: String?
            get() = definedExternally
            set(value) = definedExternally
        var resourceMethods: MapOfMethod?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Resources {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var items: ListOfResource?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestApi {
        var id: String?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var version: String?
            get() = definedExternally
            set(value) = definedExternally
        var warnings: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
        var binaryMediaTypes: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
        var minimumCompressionSize: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var apiKeySource: String /* "HEADER" | "AUTHORIZER" | String */
        var endpointConfiguration: EndpointConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var policy: String?
            get() = definedExternally
            set(value) = definedExternally
        var tags: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestApis {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var items: ListOfRestApi?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SdkConfigurationProperty {
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var friendlyName: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var required: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var defaultValue: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SdkResponse {
        var contentType: String?
            get() = definedExternally
            set(value) = definedExternally
        var contentDisposition: String?
            get() = definedExternally
            set(value) = definedExternally
        var body: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SdkType {
        var id: String?
            get() = definedExternally
            set(value) = definedExternally
        var friendlyName: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var configurationProperties: ListOfSdkConfigurationProperty?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SdkTypes {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var items: ListOfSdkType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Stage {
        var deploymentId: String?
            get() = definedExternally
            set(value) = definedExternally
        var clientCertificateId: String?
            get() = definedExternally
            set(value) = definedExternally
        var stageName: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var cacheClusterEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var cacheClusterSize: String /* "0.5" | "1.6" | "6.1" | "13.5" | "28.4" | "58.2" | "118" | "237" | String */
        var cacheClusterStatus: String /* "CREATE_IN_PROGRESS" | "AVAILABLE" | "DELETE_IN_PROGRESS" | "NOT_AVAILABLE" | "FLUSH_IN_PROGRESS" | String */
        var methodSettings: MapOfMethodSettings?
            get() = definedExternally
            set(value) = definedExternally
        var variables: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var documentationVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var accessLogSettings: AccessLogSettings?
            get() = definedExternally
            set(value) = definedExternally
        var canarySettings: CanarySettings?
            get() = definedExternally
            set(value) = definedExternally
        var tracingEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var webAclArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var tags: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StageKey {
        var restApiId: String?
            get() = definedExternally
            set(value) = definedExternally
        var stageName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Stages {
        var item: ListOfStage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var resourceArn: String
        var tags: MapOfStringToString
    }
    interface Tags {
        var tags: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Template {
        var value: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestInvokeAuthorizerRequest {
        var restApiId: String
        var authorizerId: String
        var headers: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var multiValueHeaders: MapOfStringToList?
            get() = definedExternally
            set(value) = definedExternally
        var pathWithQueryString: String?
            get() = definedExternally
            set(value) = definedExternally
        var body: String?
            get() = definedExternally
            set(value) = definedExternally
        var stageVariables: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var additionalContext: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestInvokeAuthorizerResponse {
        var clientStatus: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var log: String?
            get() = definedExternally
            set(value) = definedExternally
        var latency: Long?
            get() = definedExternally
            set(value) = definedExternally
        var principalId: String?
            get() = definedExternally
            set(value) = definedExternally
        var policy: String?
            get() = definedExternally
            set(value) = definedExternally
        var authorization: MapOfStringToList?
            get() = definedExternally
            set(value) = definedExternally
        var claims: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestInvokeMethodRequest {
        var restApiId: String
        var resourceId: String
        var httpMethod: String
        var pathWithQueryString: String?
            get() = definedExternally
            set(value) = definedExternally
        var body: String?
            get() = definedExternally
            set(value) = definedExternally
        var headers: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var multiValueHeaders: MapOfStringToList?
            get() = definedExternally
            set(value) = definedExternally
        var clientCertificateId: String?
            get() = definedExternally
            set(value) = definedExternally
        var stageVariables: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestInvokeMethodResponse {
        var status: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var body: String?
            get() = definedExternally
            set(value) = definedExternally
        var headers: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var multiValueHeaders: MapOfStringToList?
            get() = definedExternally
            set(value) = definedExternally
        var log: String?
            get() = definedExternally
            set(value) = definedExternally
        var latency: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ThrottleSettings {
        var burstLimit: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var rateLimit: Double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceRequest {
        var resourceArn: String
        var tagKeys: ListOfString
    }
    interface UpdateAccountRequest {
        var patchOperations: ListOfPatchOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateApiKeyRequest {
        var apiKey: String
        var patchOperations: ListOfPatchOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateAuthorizerRequest {
        var restApiId: String
        var authorizerId: String
        var patchOperations: ListOfPatchOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateBasePathMappingRequest {
        var domainName: String
        var basePath: String
        var patchOperations: ListOfPatchOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateClientCertificateRequest {
        var clientCertificateId: String
        var patchOperations: ListOfPatchOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDeploymentRequest {
        var restApiId: String
        var deploymentId: String
        var patchOperations: ListOfPatchOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDocumentationPartRequest {
        var restApiId: String
        var documentationPartId: String
        var patchOperations: ListOfPatchOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDocumentationVersionRequest {
        var restApiId: String
        var documentationVersion: String
        var patchOperations: ListOfPatchOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDomainNameRequest {
        var domainName: String
        var patchOperations: ListOfPatchOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGatewayResponseRequest {
        var restApiId: String
        var responseType: String /* "DEFAULT_4XX" | "DEFAULT_5XX" | "RESOURCE_NOT_FOUND" | "UNAUTHORIZED" | "INVALID_API_KEY" | "ACCESS_DENIED" | "AUTHORIZER_FAILURE" | "AUTHORIZER_CONFIGURATION_ERROR" | "INVALID_SIGNATURE" | "EXPIRED_TOKEN" | "MISSING_AUTHENTICATION_TOKEN" | "INTEGRATION_FAILURE" | "INTEGRATION_TIMEOUT" | "API_CONFIGURATION_ERROR" | "UNSUPPORTED_MEDIA_TYPE" | "BAD_REQUEST_PARAMETERS" | "BAD_REQUEST_BODY" | "REQUEST_TOO_LARGE" | "THROTTLED" | "QUOTA_EXCEEDED" | String */
        var patchOperations: ListOfPatchOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateIntegrationRequest {
        var restApiId: String
        var resourceId: String
        var httpMethod: String
        var patchOperations: ListOfPatchOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateIntegrationResponseRequest {
        var restApiId: String
        var resourceId: String
        var httpMethod: String
        var statusCode: StatusCode
        var patchOperations: ListOfPatchOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMethodRequest {
        var restApiId: String
        var resourceId: String
        var httpMethod: String
        var patchOperations: ListOfPatchOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMethodResponseRequest {
        var restApiId: String
        var resourceId: String
        var httpMethod: String
        var statusCode: StatusCode
        var patchOperations: ListOfPatchOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateModelRequest {
        var restApiId: String
        var modelName: String
        var patchOperations: ListOfPatchOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRequestValidatorRequest {
        var restApiId: String
        var requestValidatorId: String
        var patchOperations: ListOfPatchOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateResourceRequest {
        var restApiId: String
        var resourceId: String
        var patchOperations: ListOfPatchOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRestApiRequest {
        var restApiId: String
        var patchOperations: ListOfPatchOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateStageRequest {
        var restApiId: String
        var stageName: String
        var patchOperations: ListOfPatchOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateUsagePlanRequest {
        var usagePlanId: String
        var patchOperations: ListOfPatchOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateUsageRequest {
        var usagePlanId: String
        var keyId: String
        var patchOperations: ListOfPatchOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateVpcLinkRequest {
        var vpcLinkId: String
        var patchOperations: ListOfPatchOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Usage {
        var usagePlanId: String?
            get() = definedExternally
            set(value) = definedExternally
        var startDate: String?
            get() = definedExternally
            set(value) = definedExternally
        var endDate: String?
            get() = definedExternally
            set(value) = definedExternally
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var items: MapOfKeyUsages?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UsagePlan {
        var id: String?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var apiStages: ListOfApiStage?
            get() = definedExternally
            set(value) = definedExternally
        var throttle: ThrottleSettings?
            get() = definedExternally
            set(value) = definedExternally
        var quota: QuotaSettings?
            get() = definedExternally
            set(value) = definedExternally
        var productCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var tags: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UsagePlanKey {
        var id: String?
            get() = definedExternally
            set(value) = definedExternally
        var type: String?
            get() = definedExternally
            set(value) = definedExternally
        var value: String?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UsagePlanKeys {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var items: ListOfUsagePlanKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UsagePlans {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var items: ListOfUsagePlan?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VpcLink {
        var id: String?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var targetArns: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "AVAILABLE" | "PENDING" | "DELETING" | "FAILED" | String */
        var statusMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var tags: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VpcLinks {
        var position: String?
            get() = definedExternally
            set(value) = definedExternally
        var items: ListOfVpcLink?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2015-07-09" | "latest" | String */
    }
}