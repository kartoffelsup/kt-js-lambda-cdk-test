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
import ApiGatewayV2.DomainNameConfiguration
import ApiGatewayV2.Api
import ApiGatewayV2.ApiMapping
import ApiGatewayV2.Authorizer
import ApiGatewayV2.Deployment
import ApiGatewayV2.DomainName
import ApiGatewayV2.Integration
import ApiGatewayV2.IntegrationResponse
import ApiGatewayV2.Model
import ApiGatewayV2.Route
import ApiGatewayV2.RouteResponse
import ApiGatewayV2.Stage
import ApiGatewayV2.VpcLink
import ApiGatewayV2.CreateApiRequest
import ApiGatewayV2.CreateApiResponse
import ApiGatewayV2.CreateApiMappingRequest
import ApiGatewayV2.CreateApiMappingResponse
import ApiGatewayV2.CreateAuthorizerRequest
import ApiGatewayV2.CreateAuthorizerResponse
import ApiGatewayV2.CreateDeploymentRequest
import ApiGatewayV2.CreateDeploymentResponse
import ApiGatewayV2.CreateDomainNameRequest
import ApiGatewayV2.CreateDomainNameResponse
import ApiGatewayV2.CreateIntegrationRequest
import ApiGatewayV2.CreateIntegrationResult
import ApiGatewayV2.CreateIntegrationResponseRequest
import ApiGatewayV2.CreateIntegrationResponseResponse
import ApiGatewayV2.CreateModelRequest
import ApiGatewayV2.CreateModelResponse
import ApiGatewayV2.CreateRouteRequest
import ApiGatewayV2.CreateRouteResult
import ApiGatewayV2.CreateRouteResponseRequest
import ApiGatewayV2.CreateRouteResponseResponse
import ApiGatewayV2.CreateStageRequest
import ApiGatewayV2.CreateStageResponse
import ApiGatewayV2.CreateVpcLinkRequest
import ApiGatewayV2.CreateVpcLinkResponse
import ApiGatewayV2.DeleteAccessLogSettingsRequest
import ApiGatewayV2.DeleteApiRequest
import ApiGatewayV2.DeleteApiMappingRequest
import ApiGatewayV2.DeleteAuthorizerRequest
import ApiGatewayV2.DeleteCorsConfigurationRequest
import ApiGatewayV2.DeleteDeploymentRequest
import ApiGatewayV2.DeleteDomainNameRequest
import ApiGatewayV2.DeleteIntegrationRequest
import ApiGatewayV2.DeleteIntegrationResponseRequest
import ApiGatewayV2.DeleteModelRequest
import ApiGatewayV2.DeleteRouteRequest
import ApiGatewayV2.DeleteRouteRequestParameterRequest
import ApiGatewayV2.DeleteRouteResponseRequest
import ApiGatewayV2.DeleteRouteSettingsRequest
import ApiGatewayV2.DeleteStageRequest
import ApiGatewayV2.DeleteVpcLinkRequest
import ApiGatewayV2.DeleteVpcLinkResponse
import ApiGatewayV2.GetApiRequest
import ApiGatewayV2.GetApiResponse
import ApiGatewayV2.GetApiMappingRequest
import ApiGatewayV2.GetApiMappingResponse
import ApiGatewayV2.GetApiMappingsRequest
import ApiGatewayV2.GetApiMappingsResponse
import ApiGatewayV2.GetApisRequest
import ApiGatewayV2.GetApisResponse
import ApiGatewayV2.GetAuthorizerRequest
import ApiGatewayV2.GetAuthorizerResponse
import ApiGatewayV2.GetAuthorizersRequest
import ApiGatewayV2.GetAuthorizersResponse
import ApiGatewayV2.GetDeploymentRequest
import ApiGatewayV2.GetDeploymentResponse
import ApiGatewayV2.GetDeploymentsRequest
import ApiGatewayV2.GetDeploymentsResponse
import ApiGatewayV2.GetDomainNameRequest
import ApiGatewayV2.GetDomainNameResponse
import ApiGatewayV2.GetDomainNamesRequest
import ApiGatewayV2.GetDomainNamesResponse
import ApiGatewayV2.GetIntegrationRequest
import ApiGatewayV2.GetIntegrationResult
import ApiGatewayV2.GetIntegrationResponseRequest
import ApiGatewayV2.GetIntegrationResponseResponse
import ApiGatewayV2.GetIntegrationResponsesRequest
import ApiGatewayV2.GetIntegrationResponsesResponse
import ApiGatewayV2.GetIntegrationsRequest
import ApiGatewayV2.GetIntegrationsResponse
import ApiGatewayV2.GetModelRequest
import ApiGatewayV2.GetModelResponse
import ApiGatewayV2.GetModelTemplateRequest
import ApiGatewayV2.GetModelTemplateResponse
import ApiGatewayV2.GetModelsRequest
import ApiGatewayV2.GetModelsResponse
import ApiGatewayV2.GetRouteRequest
import ApiGatewayV2.GetRouteResult
import ApiGatewayV2.GetRouteResponseRequest
import ApiGatewayV2.GetRouteResponseResponse
import ApiGatewayV2.GetRouteResponsesRequest
import ApiGatewayV2.GetRouteResponsesResponse
import ApiGatewayV2.GetRoutesRequest
import ApiGatewayV2.GetRoutesResponse
import ApiGatewayV2.GetStageRequest
import ApiGatewayV2.GetStageResponse
import ApiGatewayV2.GetStagesRequest
import ApiGatewayV2.GetStagesResponse
import ApiGatewayV2.GetTagsRequest
import ApiGatewayV2.GetTagsResponse
import ApiGatewayV2.GetVpcLinkRequest
import ApiGatewayV2.GetVpcLinkResponse
import ApiGatewayV2.GetVpcLinksRequest
import ApiGatewayV2.GetVpcLinksResponse
import ApiGatewayV2.ImportApiRequest
import ApiGatewayV2.ImportApiResponse
import ApiGatewayV2.ReimportApiRequest
import ApiGatewayV2.ReimportApiResponse
import ApiGatewayV2.TagResourceRequest
import ApiGatewayV2.TagResourceResponse
import ApiGatewayV2.UntagResourceRequest
import ApiGatewayV2.UpdateApiRequest
import ApiGatewayV2.UpdateApiResponse
import ApiGatewayV2.UpdateApiMappingRequest
import ApiGatewayV2.UpdateApiMappingResponse
import ApiGatewayV2.UpdateAuthorizerRequest
import ApiGatewayV2.UpdateAuthorizerResponse
import ApiGatewayV2.UpdateDeploymentRequest
import ApiGatewayV2.UpdateDeploymentResponse
import ApiGatewayV2.UpdateDomainNameRequest
import ApiGatewayV2.UpdateDomainNameResponse
import ApiGatewayV2.UpdateIntegrationRequest
import ApiGatewayV2.UpdateIntegrationResult
import ApiGatewayV2.UpdateIntegrationResponseRequest
import ApiGatewayV2.UpdateIntegrationResponseResponse
import ApiGatewayV2.UpdateModelRequest
import ApiGatewayV2.UpdateModelResponse
import ApiGatewayV2.UpdateRouteRequest
import ApiGatewayV2.UpdateRouteResult
import ApiGatewayV2.UpdateRouteResponseRequest
import ApiGatewayV2.UpdateRouteResponseResponse
import ApiGatewayV2.UpdateStageRequest
import ApiGatewayV2.UpdateStageResponse
import ApiGatewayV2.UpdateVpcLinkRequest
import ApiGatewayV2.UpdateVpcLinkResponse
import ApiGatewayV2.Cors
import ApiGatewayV2.Tags
import ApiGatewayV2.JWTConfiguration
import ApiGatewayV2.IntegrationParameters
import ApiGatewayV2.TemplateMap
import ApiGatewayV2.TlsConfigInput
import ApiGatewayV2.TlsConfig
import ApiGatewayV2.RouteModels
import ApiGatewayV2.RouteParameters
import ApiGatewayV2.AccessLogSettings
import ApiGatewayV2.RouteSettings
import ApiGatewayV2.RouteSettingsMap
import ApiGatewayV2.StageVariablesMap
import ApiGatewayV2.ParameterConstraints

typealias Arn = String

typealias AuthorizationScopes = Array<StringWithLengthBetween1And64>

typealias CorsHeaderList = Array<__string>

typealias CorsMethodList = Array<StringWithLengthBetween1And64>

typealias CorsOriginList = Array<__string>

typealias DomainNameConfigurations = Array<DomainNameConfiguration>

typealias Id = String

typealias IdentitySourceList = Array<__string>

typealias IntegerWithLengthBetween0And3600 = Number

typealias IntegerWithLengthBetween50And30000 = Number

typealias IntegerWithLengthBetweenMinus1And86400 = Number

typealias NextToken = String

typealias SecurityGroupIdList = Array<__string>

typealias SelectionExpression = String

typealias SelectionKey = String

typealias StringWithLengthBetween0And1024 = String

typealias StringWithLengthBetween0And2048 = String

typealias StringWithLengthBetween0And32K = String

typealias StringWithLengthBetween1And1024 = String

typealias StringWithLengthBetween1And128 = String

typealias StringWithLengthBetween1And1600 = String

typealias StringWithLengthBetween1And256 = String

typealias StringWithLengthBetween1And512 = String

typealias StringWithLengthBetween1And64 = String

typealias SubnetIdList = Array<__string>

typealias UriWithLengthBetween1And2048 = String

typealias __boolean = Boolean

typealias __double = Number

typealias __integer = Number

typealias __listOfApi = Array<Api>

typealias __listOfApiMapping = Array<ApiMapping>

typealias __listOfAuthorizer = Array<Authorizer>

typealias __listOfDeployment = Array<Deployment>

typealias __listOfDomainName = Array<DomainName>

typealias __listOfIntegration = Array<Integration>

typealias __listOfIntegrationResponse = Array<IntegrationResponse>

typealias __listOfModel = Array<Model>

typealias __listOfRoute = Array<Route>

typealias __listOfRouteResponse = Array<RouteResponse>

typealias __listOfStage = Array<Stage>

typealias __listOfVpcLink = Array<VpcLink>

typealias __listOf__string = Array<__string>

typealias __string = String

typealias __timestampIso8601 = Date

@JsModule("aws-sdk")
external open class ApiGatewayV2(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ApiGatewayV2.Types.ClientConfiguration */
    open fun createApi(params: CreateApiRequest, callback: (err: AWSError, data: CreateApiResponse) -> Unit = definedExternally): Request<CreateApiResponse, AWSError>
    open fun createApi(callback: (err: AWSError, data: CreateApiResponse) -> Unit = definedExternally): Request<CreateApiResponse, AWSError>
    open fun createApiMapping(params: CreateApiMappingRequest, callback: (err: AWSError, data: CreateApiMappingResponse) -> Unit = definedExternally): Request<CreateApiMappingResponse, AWSError>
    open fun createApiMapping(callback: (err: AWSError, data: CreateApiMappingResponse) -> Unit = definedExternally): Request<CreateApiMappingResponse, AWSError>
    open fun createAuthorizer(params: CreateAuthorizerRequest, callback: (err: AWSError, data: CreateAuthorizerResponse) -> Unit = definedExternally): Request<CreateAuthorizerResponse, AWSError>
    open fun createAuthorizer(callback: (err: AWSError, data: CreateAuthorizerResponse) -> Unit = definedExternally): Request<CreateAuthorizerResponse, AWSError>
    open fun createDeployment(params: CreateDeploymentRequest, callback: (err: AWSError, data: CreateDeploymentResponse) -> Unit = definedExternally): Request<CreateDeploymentResponse, AWSError>
    open fun createDeployment(callback: (err: AWSError, data: CreateDeploymentResponse) -> Unit = definedExternally): Request<CreateDeploymentResponse, AWSError>
    open fun createDomainName(params: CreateDomainNameRequest, callback: (err: AWSError, data: CreateDomainNameResponse) -> Unit = definedExternally): Request<CreateDomainNameResponse, AWSError>
    open fun createDomainName(callback: (err: AWSError, data: CreateDomainNameResponse) -> Unit = definedExternally): Request<CreateDomainNameResponse, AWSError>
    open fun createIntegration(params: CreateIntegrationRequest, callback: (err: AWSError, data: CreateIntegrationResult) -> Unit = definedExternally): Request<CreateIntegrationResult, AWSError>
    open fun createIntegration(callback: (err: AWSError, data: CreateIntegrationResult) -> Unit = definedExternally): Request<CreateIntegrationResult, AWSError>
    open fun createIntegrationResponse(params: CreateIntegrationResponseRequest, callback: (err: AWSError, data: CreateIntegrationResponseResponse) -> Unit = definedExternally): Request<CreateIntegrationResponseResponse, AWSError>
    open fun createIntegrationResponse(callback: (err: AWSError, data: CreateIntegrationResponseResponse) -> Unit = definedExternally): Request<CreateIntegrationResponseResponse, AWSError>
    open fun createModel(params: CreateModelRequest, callback: (err: AWSError, data: CreateModelResponse) -> Unit = definedExternally): Request<CreateModelResponse, AWSError>
    open fun createModel(callback: (err: AWSError, data: CreateModelResponse) -> Unit = definedExternally): Request<CreateModelResponse, AWSError>
    open fun createRoute(params: CreateRouteRequest, callback: (err: AWSError, data: CreateRouteResult) -> Unit = definedExternally): Request<CreateRouteResult, AWSError>
    open fun createRoute(callback: (err: AWSError, data: CreateRouteResult) -> Unit = definedExternally): Request<CreateRouteResult, AWSError>
    open fun createRouteResponse(params: CreateRouteResponseRequest, callback: (err: AWSError, data: CreateRouteResponseResponse) -> Unit = definedExternally): Request<CreateRouteResponseResponse, AWSError>
    open fun createRouteResponse(callback: (err: AWSError, data: CreateRouteResponseResponse) -> Unit = definedExternally): Request<CreateRouteResponseResponse, AWSError>
    open fun createStage(params: CreateStageRequest, callback: (err: AWSError, data: CreateStageResponse) -> Unit = definedExternally): Request<CreateStageResponse, AWSError>
    open fun createStage(callback: (err: AWSError, data: CreateStageResponse) -> Unit = definedExternally): Request<CreateStageResponse, AWSError>
    open fun createVpcLink(params: CreateVpcLinkRequest, callback: (err: AWSError, data: CreateVpcLinkResponse) -> Unit = definedExternally): Request<CreateVpcLinkResponse, AWSError>
    open fun createVpcLink(callback: (err: AWSError, data: CreateVpcLinkResponse) -> Unit = definedExternally): Request<CreateVpcLinkResponse, AWSError>
    open fun deleteAccessLogSettings(params: DeleteAccessLogSettingsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAccessLogSettings(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteApi(params: DeleteApiRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteApi(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteApiMapping(params: DeleteApiMappingRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteApiMapping(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAuthorizer(params: DeleteAuthorizerRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAuthorizer(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteCorsConfiguration(params: DeleteCorsConfigurationRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteCorsConfiguration(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDeployment(params: DeleteDeploymentRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDeployment(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDomainName(params: DeleteDomainNameRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDomainName(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteIntegration(params: DeleteIntegrationRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteIntegration(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteIntegrationResponse(params: DeleteIntegrationResponseRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteIntegrationResponse(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteModel(params: DeleteModelRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteModel(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRoute(params: DeleteRouteRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRoute(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRouteRequestParameter(params: DeleteRouteRequestParameterRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRouteRequestParameter(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRouteResponse(params: DeleteRouteResponseRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRouteResponse(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRouteSettings(params: DeleteRouteSettingsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRouteSettings(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteStage(params: DeleteStageRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteStage(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVpcLink(params: DeleteVpcLinkRequest, callback: (err: AWSError, data: DeleteVpcLinkResponse) -> Unit = definedExternally): Request<DeleteVpcLinkResponse, AWSError>
    open fun deleteVpcLink(callback: (err: AWSError, data: DeleteVpcLinkResponse) -> Unit = definedExternally): Request<DeleteVpcLinkResponse, AWSError>
    open fun getApi(params: GetApiRequest, callback: (err: AWSError, data: GetApiResponse) -> Unit = definedExternally): Request<GetApiResponse, AWSError>
    open fun getApi(callback: (err: AWSError, data: GetApiResponse) -> Unit = definedExternally): Request<GetApiResponse, AWSError>
    open fun getApiMapping(params: GetApiMappingRequest, callback: (err: AWSError, data: GetApiMappingResponse) -> Unit = definedExternally): Request<GetApiMappingResponse, AWSError>
    open fun getApiMapping(callback: (err: AWSError, data: GetApiMappingResponse) -> Unit = definedExternally): Request<GetApiMappingResponse, AWSError>
    open fun getApiMappings(params: GetApiMappingsRequest, callback: (err: AWSError, data: GetApiMappingsResponse) -> Unit = definedExternally): Request<GetApiMappingsResponse, AWSError>
    open fun getApiMappings(callback: (err: AWSError, data: GetApiMappingsResponse) -> Unit = definedExternally): Request<GetApiMappingsResponse, AWSError>
    open fun getApis(params: GetApisRequest, callback: (err: AWSError, data: GetApisResponse) -> Unit = definedExternally): Request<GetApisResponse, AWSError>
    open fun getApis(callback: (err: AWSError, data: GetApisResponse) -> Unit = definedExternally): Request<GetApisResponse, AWSError>
    open fun getAuthorizer(params: GetAuthorizerRequest, callback: (err: AWSError, data: GetAuthorizerResponse) -> Unit = definedExternally): Request<GetAuthorizerResponse, AWSError>
    open fun getAuthorizer(callback: (err: AWSError, data: GetAuthorizerResponse) -> Unit = definedExternally): Request<GetAuthorizerResponse, AWSError>
    open fun getAuthorizers(params: GetAuthorizersRequest, callback: (err: AWSError, data: GetAuthorizersResponse) -> Unit = definedExternally): Request<GetAuthorizersResponse, AWSError>
    open fun getAuthorizers(callback: (err: AWSError, data: GetAuthorizersResponse) -> Unit = definedExternally): Request<GetAuthorizersResponse, AWSError>
    open fun getDeployment(params: GetDeploymentRequest, callback: (err: AWSError, data: GetDeploymentResponse) -> Unit = definedExternally): Request<GetDeploymentResponse, AWSError>
    open fun getDeployment(callback: (err: AWSError, data: GetDeploymentResponse) -> Unit = definedExternally): Request<GetDeploymentResponse, AWSError>
    open fun getDeployments(params: GetDeploymentsRequest, callback: (err: AWSError, data: GetDeploymentsResponse) -> Unit = definedExternally): Request<GetDeploymentsResponse, AWSError>
    open fun getDeployments(callback: (err: AWSError, data: GetDeploymentsResponse) -> Unit = definedExternally): Request<GetDeploymentsResponse, AWSError>
    open fun getDomainName(params: GetDomainNameRequest, callback: (err: AWSError, data: GetDomainNameResponse) -> Unit = definedExternally): Request<GetDomainNameResponse, AWSError>
    open fun getDomainName(callback: (err: AWSError, data: GetDomainNameResponse) -> Unit = definedExternally): Request<GetDomainNameResponse, AWSError>
    open fun getDomainNames(params: GetDomainNamesRequest, callback: (err: AWSError, data: GetDomainNamesResponse) -> Unit = definedExternally): Request<GetDomainNamesResponse, AWSError>
    open fun getDomainNames(callback: (err: AWSError, data: GetDomainNamesResponse) -> Unit = definedExternally): Request<GetDomainNamesResponse, AWSError>
    open fun getIntegration(params: GetIntegrationRequest, callback: (err: AWSError, data: GetIntegrationResult) -> Unit = definedExternally): Request<GetIntegrationResult, AWSError>
    open fun getIntegration(callback: (err: AWSError, data: GetIntegrationResult) -> Unit = definedExternally): Request<GetIntegrationResult, AWSError>
    open fun getIntegrationResponse(params: GetIntegrationResponseRequest, callback: (err: AWSError, data: GetIntegrationResponseResponse) -> Unit = definedExternally): Request<GetIntegrationResponseResponse, AWSError>
    open fun getIntegrationResponse(callback: (err: AWSError, data: GetIntegrationResponseResponse) -> Unit = definedExternally): Request<GetIntegrationResponseResponse, AWSError>
    open fun getIntegrationResponses(params: GetIntegrationResponsesRequest, callback: (err: AWSError, data: GetIntegrationResponsesResponse) -> Unit = definedExternally): Request<GetIntegrationResponsesResponse, AWSError>
    open fun getIntegrationResponses(callback: (err: AWSError, data: GetIntegrationResponsesResponse) -> Unit = definedExternally): Request<GetIntegrationResponsesResponse, AWSError>
    open fun getIntegrations(params: GetIntegrationsRequest, callback: (err: AWSError, data: GetIntegrationsResponse) -> Unit = definedExternally): Request<GetIntegrationsResponse, AWSError>
    open fun getIntegrations(callback: (err: AWSError, data: GetIntegrationsResponse) -> Unit = definedExternally): Request<GetIntegrationsResponse, AWSError>
    open fun getModel(params: GetModelRequest, callback: (err: AWSError, data: GetModelResponse) -> Unit = definedExternally): Request<GetModelResponse, AWSError>
    open fun getModel(callback: (err: AWSError, data: GetModelResponse) -> Unit = definedExternally): Request<GetModelResponse, AWSError>
    open fun getModelTemplate(params: GetModelTemplateRequest, callback: (err: AWSError, data: GetModelTemplateResponse) -> Unit = definedExternally): Request<GetModelTemplateResponse, AWSError>
    open fun getModelTemplate(callback: (err: AWSError, data: GetModelTemplateResponse) -> Unit = definedExternally): Request<GetModelTemplateResponse, AWSError>
    open fun getModels(params: GetModelsRequest, callback: (err: AWSError, data: GetModelsResponse) -> Unit = definedExternally): Request<GetModelsResponse, AWSError>
    open fun getModels(callback: (err: AWSError, data: GetModelsResponse) -> Unit = definedExternally): Request<GetModelsResponse, AWSError>
    open fun getRoute(params: GetRouteRequest, callback: (err: AWSError, data: GetRouteResult) -> Unit = definedExternally): Request<GetRouteResult, AWSError>
    open fun getRoute(callback: (err: AWSError, data: GetRouteResult) -> Unit = definedExternally): Request<GetRouteResult, AWSError>
    open fun getRouteResponse(params: GetRouteResponseRequest, callback: (err: AWSError, data: GetRouteResponseResponse) -> Unit = definedExternally): Request<GetRouteResponseResponse, AWSError>
    open fun getRouteResponse(callback: (err: AWSError, data: GetRouteResponseResponse) -> Unit = definedExternally): Request<GetRouteResponseResponse, AWSError>
    open fun getRouteResponses(params: GetRouteResponsesRequest, callback: (err: AWSError, data: GetRouteResponsesResponse) -> Unit = definedExternally): Request<GetRouteResponsesResponse, AWSError>
    open fun getRouteResponses(callback: (err: AWSError, data: GetRouteResponsesResponse) -> Unit = definedExternally): Request<GetRouteResponsesResponse, AWSError>
    open fun getRoutes(params: GetRoutesRequest, callback: (err: AWSError, data: GetRoutesResponse) -> Unit = definedExternally): Request<GetRoutesResponse, AWSError>
    open fun getRoutes(callback: (err: AWSError, data: GetRoutesResponse) -> Unit = definedExternally): Request<GetRoutesResponse, AWSError>
    open fun getStage(params: GetStageRequest, callback: (err: AWSError, data: GetStageResponse) -> Unit = definedExternally): Request<GetStageResponse, AWSError>
    open fun getStage(callback: (err: AWSError, data: GetStageResponse) -> Unit = definedExternally): Request<GetStageResponse, AWSError>
    open fun getStages(params: GetStagesRequest, callback: (err: AWSError, data: GetStagesResponse) -> Unit = definedExternally): Request<GetStagesResponse, AWSError>
    open fun getStages(callback: (err: AWSError, data: GetStagesResponse) -> Unit = definedExternally): Request<GetStagesResponse, AWSError>
    open fun getTags(params: GetTagsRequest, callback: (err: AWSError, data: GetTagsResponse) -> Unit = definedExternally): Request<GetTagsResponse, AWSError>
    open fun getTags(callback: (err: AWSError, data: GetTagsResponse) -> Unit = definedExternally): Request<GetTagsResponse, AWSError>
    open fun getVpcLink(params: GetVpcLinkRequest, callback: (err: AWSError, data: GetVpcLinkResponse) -> Unit = definedExternally): Request<GetVpcLinkResponse, AWSError>
    open fun getVpcLink(callback: (err: AWSError, data: GetVpcLinkResponse) -> Unit = definedExternally): Request<GetVpcLinkResponse, AWSError>
    open fun getVpcLinks(params: GetVpcLinksRequest, callback: (err: AWSError, data: GetVpcLinksResponse) -> Unit = definedExternally): Request<GetVpcLinksResponse, AWSError>
    open fun getVpcLinks(callback: (err: AWSError, data: GetVpcLinksResponse) -> Unit = definedExternally): Request<GetVpcLinksResponse, AWSError>
    open fun importApi(params: ImportApiRequest, callback: (err: AWSError, data: ImportApiResponse) -> Unit = definedExternally): Request<ImportApiResponse, AWSError>
    open fun importApi(callback: (err: AWSError, data: ImportApiResponse) -> Unit = definedExternally): Request<ImportApiResponse, AWSError>
    open fun reimportApi(params: ReimportApiRequest, callback: (err: AWSError, data: ReimportApiResponse) -> Unit = definedExternally): Request<ReimportApiResponse, AWSError>
    open fun reimportApi(callback: (err: AWSError, data: ReimportApiResponse) -> Unit = definedExternally): Request<ReimportApiResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateApi(params: UpdateApiRequest, callback: (err: AWSError, data: UpdateApiResponse) -> Unit = definedExternally): Request<UpdateApiResponse, AWSError>
    open fun updateApi(callback: (err: AWSError, data: UpdateApiResponse) -> Unit = definedExternally): Request<UpdateApiResponse, AWSError>
    open fun updateApiMapping(params: UpdateApiMappingRequest, callback: (err: AWSError, data: UpdateApiMappingResponse) -> Unit = definedExternally): Request<UpdateApiMappingResponse, AWSError>
    open fun updateApiMapping(callback: (err: AWSError, data: UpdateApiMappingResponse) -> Unit = definedExternally): Request<UpdateApiMappingResponse, AWSError>
    open fun updateAuthorizer(params: UpdateAuthorizerRequest, callback: (err: AWSError, data: UpdateAuthorizerResponse) -> Unit = definedExternally): Request<UpdateAuthorizerResponse, AWSError>
    open fun updateAuthorizer(callback: (err: AWSError, data: UpdateAuthorizerResponse) -> Unit = definedExternally): Request<UpdateAuthorizerResponse, AWSError>
    open fun updateDeployment(params: UpdateDeploymentRequest, callback: (err: AWSError, data: UpdateDeploymentResponse) -> Unit = definedExternally): Request<UpdateDeploymentResponse, AWSError>
    open fun updateDeployment(callback: (err: AWSError, data: UpdateDeploymentResponse) -> Unit = definedExternally): Request<UpdateDeploymentResponse, AWSError>
    open fun updateDomainName(params: UpdateDomainNameRequest, callback: (err: AWSError, data: UpdateDomainNameResponse) -> Unit = definedExternally): Request<UpdateDomainNameResponse, AWSError>
    open fun updateDomainName(callback: (err: AWSError, data: UpdateDomainNameResponse) -> Unit = definedExternally): Request<UpdateDomainNameResponse, AWSError>
    open fun updateIntegration(params: UpdateIntegrationRequest, callback: (err: AWSError, data: UpdateIntegrationResult) -> Unit = definedExternally): Request<UpdateIntegrationResult, AWSError>
    open fun updateIntegration(callback: (err: AWSError, data: UpdateIntegrationResult) -> Unit = definedExternally): Request<UpdateIntegrationResult, AWSError>
    open fun updateIntegrationResponse(params: UpdateIntegrationResponseRequest, callback: (err: AWSError, data: UpdateIntegrationResponseResponse) -> Unit = definedExternally): Request<UpdateIntegrationResponseResponse, AWSError>
    open fun updateIntegrationResponse(callback: (err: AWSError, data: UpdateIntegrationResponseResponse) -> Unit = definedExternally): Request<UpdateIntegrationResponseResponse, AWSError>
    open fun updateModel(params: UpdateModelRequest, callback: (err: AWSError, data: UpdateModelResponse) -> Unit = definedExternally): Request<UpdateModelResponse, AWSError>
    open fun updateModel(callback: (err: AWSError, data: UpdateModelResponse) -> Unit = definedExternally): Request<UpdateModelResponse, AWSError>
    open fun updateRoute(params: UpdateRouteRequest, callback: (err: AWSError, data: UpdateRouteResult) -> Unit = definedExternally): Request<UpdateRouteResult, AWSError>
    open fun updateRoute(callback: (err: AWSError, data: UpdateRouteResult) -> Unit = definedExternally): Request<UpdateRouteResult, AWSError>
    open fun updateRouteResponse(params: UpdateRouteResponseRequest, callback: (err: AWSError, data: UpdateRouteResponseResponse) -> Unit = definedExternally): Request<UpdateRouteResponseResponse, AWSError>
    open fun updateRouteResponse(callback: (err: AWSError, data: UpdateRouteResponseResponse) -> Unit = definedExternally): Request<UpdateRouteResponseResponse, AWSError>
    open fun updateStage(params: UpdateStageRequest, callback: (err: AWSError, data: UpdateStageResponse) -> Unit = definedExternally): Request<UpdateStageResponse, AWSError>
    open fun updateStage(callback: (err: AWSError, data: UpdateStageResponse) -> Unit = definedExternally): Request<UpdateStageResponse, AWSError>
    open fun updateVpcLink(params: UpdateVpcLinkRequest, callback: (err: AWSError, data: UpdateVpcLinkResponse) -> Unit = definedExternally): Request<UpdateVpcLinkResponse, AWSError>
    open fun updateVpcLink(callback: (err: AWSError, data: UpdateVpcLinkResponse) -> Unit = definedExternally): Request<UpdateVpcLinkResponse, AWSError>
    interface AccessLogSettings {
        var DestinationArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Format: StringWithLengthBetween1And1024?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Api {
        var ApiEndpoint: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ApiId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ApiKeySelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var CorsConfiguration: Cors?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var DisableSchemaValidation: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ImportInfo: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128
        var ProtocolType: String /* "WEBSOCKET" | "HTTP" | String */
        var RouteSelectionExpression: SelectionExpression
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var Version: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var Warnings: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApiMapping {
        var ApiId: Id
        var ApiMappingId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ApiMappingKey: SelectionKey?
            get() = definedExternally
            set(value) = definedExternally
        var Stage: StringWithLengthBetween1And128
    }
    interface Authorizer {
        var AuthorizerCredentialsArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizerId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizerResultTtlInSeconds: IntegerWithLengthBetween0And3600?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizerType: String /* "REQUEST" | "JWT" | String */
        var AuthorizerUri: UriWithLengthBetween1And2048?
            get() = definedExternally
            set(value) = definedExternally
        var IdentitySource: IdentitySourceList?
            get() = definedExternally
            set(value) = definedExternally
        var IdentityValidationExpression: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var JwtConfiguration: JWTConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128
    }
    interface Cors {
        var AllowCredentials: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AllowHeaders: CorsHeaderList?
            get() = definedExternally
            set(value) = definedExternally
        var AllowMethods: CorsMethodList?
            get() = definedExternally
            set(value) = definedExternally
        var AllowOrigins: CorsOriginList?
            get() = definedExternally
            set(value) = definedExternally
        var ExposeHeaders: CorsHeaderList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxAge: IntegerWithLengthBetweenMinus1And86400?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateApiMappingRequest {
        var ApiId: Id
        var ApiMappingKey: SelectionKey?
            get() = definedExternally
            set(value) = definedExternally
        var DomainName: __string
        var Stage: StringWithLengthBetween1And128
    }
    interface CreateApiMappingResponse {
        var ApiId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ApiMappingId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ApiMappingKey: SelectionKey?
            get() = definedExternally
            set(value) = definedExternally
        var Stage: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateApiRequest {
        var ApiKeySelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var CorsConfiguration: Cors?
            get() = definedExternally
            set(value) = definedExternally
        var CredentialsArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var DisableSchemaValidation: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128
        var ProtocolType: String /* "WEBSOCKET" | "HTTP" | String */
        var RouteKey: SelectionKey?
            get() = definedExternally
            set(value) = definedExternally
        var RouteSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var Target: UriWithLengthBetween1And2048?
            get() = definedExternally
            set(value) = definedExternally
        var Version: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateApiResponse {
        var ApiEndpoint: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ApiId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ApiKeySelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var CorsConfiguration: Cors?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var DisableSchemaValidation: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ImportInfo: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
        var ProtocolType: String /* "WEBSOCKET" | "HTTP" | String */
        var RouteSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var Version: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var Warnings: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAuthorizerRequest {
        var ApiId: __string
        var AuthorizerCredentialsArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizerResultTtlInSeconds: IntegerWithLengthBetween0And3600?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizerType: String /* "REQUEST" | "JWT" | String */
        var AuthorizerUri: UriWithLengthBetween1And2048?
            get() = definedExternally
            set(value) = definedExternally
        var IdentitySource: IdentitySourceList
        var IdentityValidationExpression: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var JwtConfiguration: JWTConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128
    }
    interface CreateAuthorizerResponse {
        var AuthorizerCredentialsArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizerId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizerResultTtlInSeconds: IntegerWithLengthBetween0And3600?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizerType: String /* "REQUEST" | "JWT" | String */
        var AuthorizerUri: UriWithLengthBetween1And2048?
            get() = definedExternally
            set(value) = definedExternally
        var IdentitySource: IdentitySourceList?
            get() = definedExternally
            set(value) = definedExternally
        var IdentityValidationExpression: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var JwtConfiguration: JWTConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeploymentRequest {
        var ApiId: __string
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var StageName: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeploymentResponse {
        var AutoDeployed: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentStatus: String /* "PENDING" | "FAILED" | "DEPLOYED" | String */
        var DeploymentStatusMessage: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDomainNameRequest {
        var DomainName: StringWithLengthBetween1And512
        var DomainNameConfigurations: DomainNameConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDomainNameResponse {
        var ApiMappingSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var DomainName: StringWithLengthBetween1And512?
            get() = definedExternally
            set(value) = definedExternally
        var DomainNameConfigurations: DomainNameConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateIntegrationRequest {
        var ApiId: __string
        var ConnectionId: StringWithLengthBetween1And1024?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionType: String /* "INTERNET" | "VPC_LINK" | String */
        var ContentHandlingStrategy: String /* "CONVERT_TO_BINARY" | "CONVERT_TO_TEXT" | String */
        var CredentialsArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationMethod: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationType: String /* "AWS" | "HTTP" | "MOCK" | "HTTP_PROXY" | "AWS_PROXY" | String */
        var IntegrationUri: UriWithLengthBetween1And2048?
            get() = definedExternally
            set(value) = definedExternally
        var PassthroughBehavior: String /* "WHEN_NO_MATCH" | "NEVER" | "WHEN_NO_TEMPLATES" | String */
        var PayloadFormatVersion: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var RequestParameters: IntegrationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var RequestTemplates: TemplateMap?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var TimeoutInMillis: IntegerWithLengthBetween50And30000?
            get() = definedExternally
            set(value) = definedExternally
        var TlsConfig: TlsConfigInput?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateIntegrationResult {
        var ApiGatewayManaged: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionId: StringWithLengthBetween1And1024?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionType: String /* "INTERNET" | "VPC_LINK" | String */
        var ContentHandlingStrategy: String /* "CONVERT_TO_BINARY" | "CONVERT_TO_TEXT" | String */
        var CredentialsArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationMethod: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationResponseSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationType: String /* "AWS" | "HTTP" | "MOCK" | "HTTP_PROXY" | "AWS_PROXY" | String */
        var IntegrationUri: UriWithLengthBetween1And2048?
            get() = definedExternally
            set(value) = definedExternally
        var PassthroughBehavior: String /* "WHEN_NO_MATCH" | "NEVER" | "WHEN_NO_TEMPLATES" | String */
        var PayloadFormatVersion: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var RequestParameters: IntegrationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var RequestTemplates: TemplateMap?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var TimeoutInMillis: IntegerWithLengthBetween50And30000?
            get() = definedExternally
            set(value) = definedExternally
        var TlsConfig: TlsConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateIntegrationResponseRequest {
        var ApiId: __string
        var ContentHandlingStrategy: String /* "CONVERT_TO_BINARY" | "CONVERT_TO_TEXT" | String */
        var IntegrationId: __string
        var IntegrationResponseKey: SelectionKey
        var ResponseParameters: IntegrationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseTemplates: TemplateMap?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateIntegrationResponseResponse {
        var ContentHandlingStrategy: String /* "CONVERT_TO_BINARY" | "CONVERT_TO_TEXT" | String */
        var IntegrationResponseId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationResponseKey: SelectionKey?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseParameters: IntegrationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseTemplates: TemplateMap?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateModelRequest {
        var ApiId: __string
        var ContentType: StringWithLengthBetween1And256?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128
        var Schema: StringWithLengthBetween0And32K
    }
    interface CreateModelResponse {
        var ContentType: StringWithLengthBetween1And256?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var ModelId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
        var Schema: StringWithLengthBetween0And32K?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRouteRequest {
        var ApiId: __string
        var ApiKeyRequired: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizationScopes: AuthorizationScopes?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizationType: String /* "NONE" | "AWS_IAM" | "CUSTOM" | "JWT" | String */
        var AuthorizerId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ModelSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var OperationName: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var RequestModels: RouteModels?
            get() = definedExternally
            set(value) = definedExternally
        var RequestParameters: RouteParameters?
            get() = definedExternally
            set(value) = definedExternally
        var RouteKey: SelectionKey
        var RouteResponseSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var Target: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRouteResult {
        var ApiGatewayManaged: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ApiKeyRequired: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizationScopes: AuthorizationScopes?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizationType: String /* "NONE" | "AWS_IAM" | "CUSTOM" | "JWT" | String */
        var AuthorizerId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ModelSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var OperationName: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var RequestModels: RouteModels?
            get() = definedExternally
            set(value) = definedExternally
        var RequestParameters: RouteParameters?
            get() = definedExternally
            set(value) = definedExternally
        var RouteId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var RouteKey: SelectionKey?
            get() = definedExternally
            set(value) = definedExternally
        var RouteResponseSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var Target: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRouteResponseRequest {
        var ApiId: __string
        var ModelSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseModels: RouteModels?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseParameters: RouteParameters?
            get() = definedExternally
            set(value) = definedExternally
        var RouteId: __string
        var RouteResponseKey: SelectionKey
    }
    interface CreateRouteResponseResponse {
        var ModelSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseModels: RouteModels?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseParameters: RouteParameters?
            get() = definedExternally
            set(value) = definedExternally
        var RouteResponseId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var RouteResponseKey: SelectionKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStageRequest {
        var AccessLogSettings: AccessLogSettings?
            get() = definedExternally
            set(value) = definedExternally
        var ApiId: __string
        var AutoDeploy: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ClientCertificateId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultRouteSettings: RouteSettings?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var RouteSettings: RouteSettingsMap?
            get() = definedExternally
            set(value) = definedExternally
        var StageName: StringWithLengthBetween1And128
        var StageVariables: StageVariablesMap?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStageResponse {
        var AccessLogSettings: AccessLogSettings?
            get() = definedExternally
            set(value) = definedExternally
        var ApiGatewayManaged: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AutoDeploy: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ClientCertificateId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultRouteSettings: RouteSettings?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var LastDeploymentStatusMessage: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var RouteSettings: RouteSettingsMap?
            get() = definedExternally
            set(value) = definedExternally
        var StageName: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
        var StageVariables: StageVariablesMap?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateVpcLinkRequest {
        var Name: StringWithLengthBetween1And128
        var SecurityGroupIds: SecurityGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: SubnetIdList
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateVpcLinkResponse {
        var CreatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: SecurityGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: SubnetIdList?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var VpcLinkId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var VpcLinkStatus: String /* "PENDING" | "AVAILABLE" | "DELETING" | "FAILED" | "INACTIVE" | String */
        var VpcLinkStatusMessage: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var VpcLinkVersion: String /* "V2" | String */
    }
    interface DeleteAccessLogSettingsRequest {
        var ApiId: __string
        var StageName: __string
    }
    interface DeleteApiMappingRequest {
        var ApiMappingId: __string
        var DomainName: __string
    }
    interface DeleteApiRequest {
        var ApiId: __string
    }
    interface DeleteAuthorizerRequest {
        var ApiId: __string
        var AuthorizerId: __string
    }
    interface DeleteCorsConfigurationRequest {
        var ApiId: __string
    }
    interface DeleteDeploymentRequest {
        var ApiId: __string
        var DeploymentId: __string
    }
    interface DeleteDomainNameRequest {
        var DomainName: __string
    }
    interface DeleteIntegrationRequest {
        var ApiId: __string
        var IntegrationId: __string
    }
    interface DeleteIntegrationResponseRequest {
        var ApiId: __string
        var IntegrationId: __string
        var IntegrationResponseId: __string
    }
    interface DeleteModelRequest {
        var ApiId: __string
        var ModelId: __string
    }
    interface DeleteRouteRequest {
        var ApiId: __string
        var RouteId: __string
    }
    interface DeleteRouteRequestParameterRequest {
        var ApiId: __string
        var RequestParameterKey: __string
        var RouteId: __string
    }
    interface DeleteRouteResponseRequest {
        var ApiId: __string
        var RouteId: __string
        var RouteResponseId: __string
    }
    interface DeleteRouteSettingsRequest {
        var ApiId: __string
        var RouteKey: __string
        var StageName: __string
    }
    interface DeleteStageRequest {
        var ApiId: __string
        var StageName: __string
    }
    interface DeleteVpcLinkRequest {
        var VpcLinkId: __string
    }
    interface DeleteVpcLinkResponse
    interface Deployment {
        var AutoDeployed: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentStatus: String /* "PENDING" | "FAILED" | "DEPLOYED" | String */
        var DeploymentStatusMessage: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DomainName {
        var ApiMappingSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var DomainName: StringWithLengthBetween1And512
        var DomainNameConfigurations: DomainNameConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DomainNameConfiguration {
        var ApiGatewayDomainName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateName: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateUploadDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var DomainNameStatus: String /* "AVAILABLE" | "UPDATING" | String */
        var DomainNameStatusMessage: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointType: String /* "REGIONAL" | "EDGE" | String */
        var HostedZoneId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityPolicy: String /* "TLS_1_0" | "TLS_1_2" | String */
    }
    interface GetApiMappingRequest {
        var ApiMappingId: __string
        var DomainName: __string
    }
    interface GetApiMappingResponse {
        var ApiId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ApiMappingId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ApiMappingKey: SelectionKey?
            get() = definedExternally
            set(value) = definedExternally
        var Stage: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetApiMappingsRequest {
        var DomainName: __string
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetApiMappingsResponse {
        var Items: __listOfApiMapping?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetApiRequest {
        var ApiId: __string
    }
    interface GetApiResponse {
        var ApiEndpoint: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ApiId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ApiKeySelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var CorsConfiguration: Cors?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var DisableSchemaValidation: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ImportInfo: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
        var ProtocolType: String /* "WEBSOCKET" | "HTTP" | String */
        var RouteSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var Version: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var Warnings: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetApisRequest {
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetApisResponse {
        var Items: __listOfApi?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAuthorizerRequest {
        var ApiId: __string
        var AuthorizerId: __string
    }
    interface GetAuthorizerResponse {
        var AuthorizerCredentialsArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizerId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizerResultTtlInSeconds: IntegerWithLengthBetween0And3600?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizerType: String /* "REQUEST" | "JWT" | String */
        var AuthorizerUri: UriWithLengthBetween1And2048?
            get() = definedExternally
            set(value) = definedExternally
        var IdentitySource: IdentitySourceList?
            get() = definedExternally
            set(value) = definedExternally
        var IdentityValidationExpression: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var JwtConfiguration: JWTConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAuthorizersRequest {
        var ApiId: __string
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAuthorizersResponse {
        var Items: __listOfAuthorizer?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeploymentRequest {
        var ApiId: __string
        var DeploymentId: __string
    }
    interface GetDeploymentResponse {
        var AutoDeployed: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentStatus: String /* "PENDING" | "FAILED" | "DEPLOYED" | String */
        var DeploymentStatusMessage: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeploymentsRequest {
        var ApiId: __string
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeploymentsResponse {
        var Items: __listOfDeployment?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDomainNameRequest {
        var DomainName: __string
    }
    interface GetDomainNameResponse {
        var ApiMappingSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var DomainName: StringWithLengthBetween1And512?
            get() = definedExternally
            set(value) = definedExternally
        var DomainNameConfigurations: DomainNameConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDomainNamesRequest {
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDomainNamesResponse {
        var Items: __listOfDomainName?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIntegrationRequest {
        var ApiId: __string
        var IntegrationId: __string
    }
    interface GetIntegrationResult {
        var ApiGatewayManaged: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionId: StringWithLengthBetween1And1024?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionType: String /* "INTERNET" | "VPC_LINK" | String */
        var ContentHandlingStrategy: String /* "CONVERT_TO_BINARY" | "CONVERT_TO_TEXT" | String */
        var CredentialsArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationMethod: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationResponseSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationType: String /* "AWS" | "HTTP" | "MOCK" | "HTTP_PROXY" | "AWS_PROXY" | String */
        var IntegrationUri: UriWithLengthBetween1And2048?
            get() = definedExternally
            set(value) = definedExternally
        var PassthroughBehavior: String /* "WHEN_NO_MATCH" | "NEVER" | "WHEN_NO_TEMPLATES" | String */
        var PayloadFormatVersion: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var RequestParameters: IntegrationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var RequestTemplates: TemplateMap?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var TimeoutInMillis: IntegerWithLengthBetween50And30000?
            get() = definedExternally
            set(value) = definedExternally
        var TlsConfig: TlsConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIntegrationResponseRequest {
        var ApiId: __string
        var IntegrationId: __string
        var IntegrationResponseId: __string
    }
    interface GetIntegrationResponseResponse {
        var ContentHandlingStrategy: String /* "CONVERT_TO_BINARY" | "CONVERT_TO_TEXT" | String */
        var IntegrationResponseId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationResponseKey: SelectionKey?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseParameters: IntegrationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseTemplates: TemplateMap?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIntegrationResponsesRequest {
        var ApiId: __string
        var IntegrationId: __string
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIntegrationResponsesResponse {
        var Items: __listOfIntegrationResponse?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIntegrationsRequest {
        var ApiId: __string
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIntegrationsResponse {
        var Items: __listOfIntegration?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetModelRequest {
        var ApiId: __string
        var ModelId: __string
    }
    interface GetModelResponse {
        var ContentType: StringWithLengthBetween1And256?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var ModelId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
        var Schema: StringWithLengthBetween0And32K?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetModelTemplateRequest {
        var ApiId: __string
        var ModelId: __string
    }
    interface GetModelTemplateResponse {
        var Value: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetModelsRequest {
        var ApiId: __string
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetModelsResponse {
        var Items: __listOfModel?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRouteRequest {
        var ApiId: __string
        var RouteId: __string
    }
    interface GetRouteResult {
        var ApiGatewayManaged: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ApiKeyRequired: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizationScopes: AuthorizationScopes?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizationType: String /* "NONE" | "AWS_IAM" | "CUSTOM" | "JWT" | String */
        var AuthorizerId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ModelSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var OperationName: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var RequestModels: RouteModels?
            get() = definedExternally
            set(value) = definedExternally
        var RequestParameters: RouteParameters?
            get() = definedExternally
            set(value) = definedExternally
        var RouteId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var RouteKey: SelectionKey?
            get() = definedExternally
            set(value) = definedExternally
        var RouteResponseSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var Target: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRouteResponseRequest {
        var ApiId: __string
        var RouteId: __string
        var RouteResponseId: __string
    }
    interface GetRouteResponseResponse {
        var ModelSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseModels: RouteModels?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseParameters: RouteParameters?
            get() = definedExternally
            set(value) = definedExternally
        var RouteResponseId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var RouteResponseKey: SelectionKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRouteResponsesRequest {
        var ApiId: __string
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RouteId: __string
    }
    interface GetRouteResponsesResponse {
        var Items: __listOfRouteResponse?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRoutesRequest {
        var ApiId: __string
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRoutesResponse {
        var Items: __listOfRoute?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetStageRequest {
        var ApiId: __string
        var StageName: __string
    }
    interface GetStageResponse {
        var AccessLogSettings: AccessLogSettings?
            get() = definedExternally
            set(value) = definedExternally
        var ApiGatewayManaged: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AutoDeploy: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ClientCertificateId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultRouteSettings: RouteSettings?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var LastDeploymentStatusMessage: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var RouteSettings: RouteSettingsMap?
            get() = definedExternally
            set(value) = definedExternally
        var StageName: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
        var StageVariables: StageVariablesMap?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetStagesRequest {
        var ApiId: __string
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetStagesResponse {
        var Items: __listOfStage?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTagsRequest {
        var ResourceArn: __string
    }
    interface GetTagsResponse {
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetVpcLinkRequest {
        var VpcLinkId: __string
    }
    interface GetVpcLinkResponse {
        var CreatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: SecurityGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: SubnetIdList?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var VpcLinkId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var VpcLinkStatus: String /* "PENDING" | "AVAILABLE" | "DELETING" | "FAILED" | "INACTIVE" | String */
        var VpcLinkStatusMessage: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var VpcLinkVersion: String /* "V2" | String */
    }
    interface GetVpcLinksRequest {
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetVpcLinksResponse {
        var Items: __listOfVpcLink?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportApiRequest {
        var Basepath: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Body: __string
        var FailOnWarnings: __boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportApiResponse {
        var ApiEndpoint: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ApiId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ApiKeySelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var CorsConfiguration: Cors?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var DisableSchemaValidation: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ImportInfo: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
        var ProtocolType: String /* "WEBSOCKET" | "HTTP" | String */
        var RouteSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var Version: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var Warnings: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Integration {
        var ApiGatewayManaged: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionId: StringWithLengthBetween1And1024?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionType: String /* "INTERNET" | "VPC_LINK" | String */
        var ContentHandlingStrategy: String /* "CONVERT_TO_BINARY" | "CONVERT_TO_TEXT" | String */
        var CredentialsArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationMethod: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationResponseSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationType: String /* "AWS" | "HTTP" | "MOCK" | "HTTP_PROXY" | "AWS_PROXY" | String */
        var IntegrationUri: UriWithLengthBetween1And2048?
            get() = definedExternally
            set(value) = definedExternally
        var PassthroughBehavior: String /* "WHEN_NO_MATCH" | "NEVER" | "WHEN_NO_TEMPLATES" | String */
        var PayloadFormatVersion: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var RequestParameters: IntegrationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var RequestTemplates: TemplateMap?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var TimeoutInMillis: IntegerWithLengthBetween50And30000?
            get() = definedExternally
            set(value) = definedExternally
        var TlsConfig: TlsConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IntegrationParameters {
        @nativeGetter
        operator fun get(key: String): StringWithLengthBetween1And512?
        @nativeSetter
        operator fun set(key: String, value: StringWithLengthBetween1And512)
    }
    interface IntegrationResponse {
        var ContentHandlingStrategy: String /* "CONVERT_TO_BINARY" | "CONVERT_TO_TEXT" | String */
        var IntegrationResponseId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationResponseKey: SelectionKey
        var ResponseParameters: IntegrationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseTemplates: TemplateMap?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JWTConfiguration {
        var Audience: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Issuer: UriWithLengthBetween1And2048?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Model {
        var ContentType: StringWithLengthBetween1And256?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var ModelId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128
        var Schema: StringWithLengthBetween0And32K?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ParameterConstraints {
        var Required: __boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReimportApiRequest {
        var ApiId: __string
        var Basepath: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Body: __string
        var FailOnWarnings: __boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReimportApiResponse {
        var ApiEndpoint: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ApiId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ApiKeySelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var CorsConfiguration: Cors?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var DisableSchemaValidation: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ImportInfo: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
        var ProtocolType: String /* "WEBSOCKET" | "HTTP" | String */
        var RouteSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var Version: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var Warnings: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Route {
        var ApiGatewayManaged: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ApiKeyRequired: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizationScopes: AuthorizationScopes?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizationType: String /* "NONE" | "AWS_IAM" | "CUSTOM" | "JWT" | String */
        var AuthorizerId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ModelSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var OperationName: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var RequestModels: RouteModels?
            get() = definedExternally
            set(value) = definedExternally
        var RequestParameters: RouteParameters?
            get() = definedExternally
            set(value) = definedExternally
        var RouteId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var RouteKey: SelectionKey
        var RouteResponseSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var Target: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RouteModels {
        @nativeGetter
        operator fun get(key: String): StringWithLengthBetween1And128?
        @nativeSetter
        operator fun set(key: String, value: StringWithLengthBetween1And128)
    }
    interface RouteParameters {
        @nativeGetter
        operator fun get(key: String): ParameterConstraints?
        @nativeSetter
        operator fun set(key: String, value: ParameterConstraints)
    }
    interface RouteResponse {
        var ModelSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseModels: RouteModels?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseParameters: RouteParameters?
            get() = definedExternally
            set(value) = definedExternally
        var RouteResponseId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var RouteResponseKey: SelectionKey
    }
    interface RouteSettings {
        var DataTraceEnabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var DetailedMetricsEnabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var LoggingLevel: String /* "ERROR" | "INFO" | "OFF" | String */
        var ThrottlingBurstLimit: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var ThrottlingRateLimit: __double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RouteSettingsMap {
        @nativeGetter
        operator fun get(key: String): RouteSettings?
        @nativeSetter
        operator fun set(key: String, value: RouteSettings)
    }
    interface Stage {
        var AccessLogSettings: AccessLogSettings?
            get() = definedExternally
            set(value) = definedExternally
        var ApiGatewayManaged: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AutoDeploy: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ClientCertificateId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultRouteSettings: RouteSettings?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var LastDeploymentStatusMessage: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var RouteSettings: RouteSettingsMap?
            get() = definedExternally
            set(value) = definedExternally
        var StageName: StringWithLengthBetween1And128
        var StageVariables: StageVariablesMap?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StageVariablesMap {
        @nativeGetter
        operator fun get(key: String): StringWithLengthBetween0And2048?
        @nativeSetter
        operator fun set(key: String, value: StringWithLengthBetween0And2048)
    }
    interface TagResourceRequest {
        var ResourceArn: __string
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceResponse
    interface Tags {
        @nativeGetter
        operator fun get(key: String): StringWithLengthBetween1And1600?
        @nativeSetter
        operator fun set(key: String, value: StringWithLengthBetween1And1600)
    }
    interface TemplateMap {
        @nativeGetter
        operator fun get(key: String): StringWithLengthBetween0And32K?
        @nativeSetter
        operator fun set(key: String, value: StringWithLengthBetween0And32K)
    }
    interface TlsConfig {
        var ServerNameToVerify: StringWithLengthBetween1And512?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TlsConfigInput {
        var ServerNameToVerify: StringWithLengthBetween1And512?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceRequest {
        var ResourceArn: __string
        var TagKeys: __listOf__string
    }
    interface UpdateApiMappingRequest {
        var ApiId: Id
        var ApiMappingId: __string
        var ApiMappingKey: SelectionKey?
            get() = definedExternally
            set(value) = definedExternally
        var DomainName: __string
        var Stage: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateApiMappingResponse {
        var ApiId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ApiMappingId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ApiMappingKey: SelectionKey?
            get() = definedExternally
            set(value) = definedExternally
        var Stage: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateApiRequest {
        var ApiId: __string
        var ApiKeySelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var CorsConfiguration: Cors?
            get() = definedExternally
            set(value) = definedExternally
        var CredentialsArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var DisableSchemaValidation: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
        var RouteKey: SelectionKey?
            get() = definedExternally
            set(value) = definedExternally
        var RouteSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var Target: UriWithLengthBetween1And2048?
            get() = definedExternally
            set(value) = definedExternally
        var Version: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateApiResponse {
        var ApiEndpoint: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ApiId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ApiKeySelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var CorsConfiguration: Cors?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var DisableSchemaValidation: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ImportInfo: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
        var ProtocolType: String /* "WEBSOCKET" | "HTTP" | String */
        var RouteSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var Version: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var Warnings: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateAuthorizerRequest {
        var ApiId: __string
        var AuthorizerCredentialsArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizerId: __string
        var AuthorizerResultTtlInSeconds: IntegerWithLengthBetween0And3600?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizerType: String /* "REQUEST" | "JWT" | String */
        var AuthorizerUri: UriWithLengthBetween1And2048?
            get() = definedExternally
            set(value) = definedExternally
        var IdentitySource: IdentitySourceList?
            get() = definedExternally
            set(value) = definedExternally
        var IdentityValidationExpression: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var JwtConfiguration: JWTConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateAuthorizerResponse {
        var AuthorizerCredentialsArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizerId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizerResultTtlInSeconds: IntegerWithLengthBetween0And3600?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizerType: String /* "REQUEST" | "JWT" | String */
        var AuthorizerUri: UriWithLengthBetween1And2048?
            get() = definedExternally
            set(value) = definedExternally
        var IdentitySource: IdentitySourceList?
            get() = definedExternally
            set(value) = definedExternally
        var IdentityValidationExpression: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var JwtConfiguration: JWTConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDeploymentRequest {
        var ApiId: __string
        var DeploymentId: __string
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDeploymentResponse {
        var AutoDeployed: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentStatus: String /* "PENDING" | "FAILED" | "DEPLOYED" | String */
        var DeploymentStatusMessage: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDomainNameRequest {
        var DomainName: __string
        var DomainNameConfigurations: DomainNameConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDomainNameResponse {
        var ApiMappingSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var DomainName: StringWithLengthBetween1And512?
            get() = definedExternally
            set(value) = definedExternally
        var DomainNameConfigurations: DomainNameConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateIntegrationRequest {
        var ApiId: __string
        var ConnectionId: StringWithLengthBetween1And1024?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionType: String /* "INTERNET" | "VPC_LINK" | String */
        var ContentHandlingStrategy: String /* "CONVERT_TO_BINARY" | "CONVERT_TO_TEXT" | String */
        var CredentialsArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationId: __string
        var IntegrationMethod: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationType: String /* "AWS" | "HTTP" | "MOCK" | "HTTP_PROXY" | "AWS_PROXY" | String */
        var IntegrationUri: UriWithLengthBetween1And2048?
            get() = definedExternally
            set(value) = definedExternally
        var PassthroughBehavior: String /* "WHEN_NO_MATCH" | "NEVER" | "WHEN_NO_TEMPLATES" | String */
        var PayloadFormatVersion: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var RequestParameters: IntegrationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var RequestTemplates: TemplateMap?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var TimeoutInMillis: IntegerWithLengthBetween50And30000?
            get() = definedExternally
            set(value) = definedExternally
        var TlsConfig: TlsConfigInput?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateIntegrationResult {
        var ApiGatewayManaged: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionId: StringWithLengthBetween1And1024?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionType: String /* "INTERNET" | "VPC_LINK" | String */
        var ContentHandlingStrategy: String /* "CONVERT_TO_BINARY" | "CONVERT_TO_TEXT" | String */
        var CredentialsArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationMethod: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationResponseSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationType: String /* "AWS" | "HTTP" | "MOCK" | "HTTP_PROXY" | "AWS_PROXY" | String */
        var IntegrationUri: UriWithLengthBetween1And2048?
            get() = definedExternally
            set(value) = definedExternally
        var PassthroughBehavior: String /* "WHEN_NO_MATCH" | "NEVER" | "WHEN_NO_TEMPLATES" | String */
        var PayloadFormatVersion: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var RequestParameters: IntegrationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var RequestTemplates: TemplateMap?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var TimeoutInMillis: IntegerWithLengthBetween50And30000?
            get() = definedExternally
            set(value) = definedExternally
        var TlsConfig: TlsConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateIntegrationResponseRequest {
        var ApiId: __string
        var ContentHandlingStrategy: String /* "CONVERT_TO_BINARY" | "CONVERT_TO_TEXT" | String */
        var IntegrationId: __string
        var IntegrationResponseId: __string
        var IntegrationResponseKey: SelectionKey?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseParameters: IntegrationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseTemplates: TemplateMap?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateIntegrationResponseResponse {
        var ContentHandlingStrategy: String /* "CONVERT_TO_BINARY" | "CONVERT_TO_TEXT" | String */
        var IntegrationResponseId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationResponseKey: SelectionKey?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseParameters: IntegrationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseTemplates: TemplateMap?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateModelRequest {
        var ApiId: __string
        var ContentType: StringWithLengthBetween1And256?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var ModelId: __string
        var Name: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
        var Schema: StringWithLengthBetween0And32K?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateModelResponse {
        var ContentType: StringWithLengthBetween1And256?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var ModelId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
        var Schema: StringWithLengthBetween0And32K?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRouteRequest {
        var ApiId: __string
        var ApiKeyRequired: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizationScopes: AuthorizationScopes?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizationType: String /* "NONE" | "AWS_IAM" | "CUSTOM" | "JWT" | String */
        var AuthorizerId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ModelSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var OperationName: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var RequestModels: RouteModels?
            get() = definedExternally
            set(value) = definedExternally
        var RequestParameters: RouteParameters?
            get() = definedExternally
            set(value) = definedExternally
        var RouteId: __string
        var RouteKey: SelectionKey?
            get() = definedExternally
            set(value) = definedExternally
        var RouteResponseSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var Target: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRouteResult {
        var ApiGatewayManaged: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ApiKeyRequired: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizationScopes: AuthorizationScopes?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizationType: String /* "NONE" | "AWS_IAM" | "CUSTOM" | "JWT" | String */
        var AuthorizerId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ModelSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var OperationName: StringWithLengthBetween1And64?
            get() = definedExternally
            set(value) = definedExternally
        var RequestModels: RouteModels?
            get() = definedExternally
            set(value) = definedExternally
        var RequestParameters: RouteParameters?
            get() = definedExternally
            set(value) = definedExternally
        var RouteId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var RouteKey: SelectionKey?
            get() = definedExternally
            set(value) = definedExternally
        var RouteResponseSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var Target: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRouteResponseRequest {
        var ApiId: __string
        var ModelSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseModels: RouteModels?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseParameters: RouteParameters?
            get() = definedExternally
            set(value) = definedExternally
        var RouteId: __string
        var RouteResponseId: __string
        var RouteResponseKey: SelectionKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRouteResponseResponse {
        var ModelSelectionExpression: SelectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseModels: RouteModels?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseParameters: RouteParameters?
            get() = definedExternally
            set(value) = definedExternally
        var RouteResponseId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var RouteResponseKey: SelectionKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateStageRequest {
        var AccessLogSettings: AccessLogSettings?
            get() = definedExternally
            set(value) = definedExternally
        var ApiId: __string
        var AutoDeploy: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ClientCertificateId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultRouteSettings: RouteSettings?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var RouteSettings: RouteSettingsMap?
            get() = definedExternally
            set(value) = definedExternally
        var StageName: __string
        var StageVariables: StageVariablesMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateStageResponse {
        var AccessLogSettings: AccessLogSettings?
            get() = definedExternally
            set(value) = definedExternally
        var ApiGatewayManaged: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AutoDeploy: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ClientCertificateId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultRouteSettings: RouteSettings?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var LastDeploymentStatusMessage: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var RouteSettings: RouteSettingsMap?
            get() = definedExternally
            set(value) = definedExternally
        var StageName: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
        var StageVariables: StageVariablesMap?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateVpcLinkRequest {
        var Name: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
        var VpcLinkId: __string
    }
    interface UpdateVpcLinkResponse {
        var CreatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: SecurityGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: SubnetIdList?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var VpcLinkId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var VpcLinkStatus: String /* "PENDING" | "AVAILABLE" | "DELETING" | "FAILED" | "INACTIVE" | String */
        var VpcLinkStatusMessage: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var VpcLinkVersion: String /* "V2" | String */
    }
    interface VpcLink {
        var CreatedDate: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var Name: StringWithLengthBetween1And128
        var SecurityGroupIds: SecurityGroupIdList
        var SubnetIds: SubnetIdList
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var VpcLinkId: Id
        var VpcLinkStatus: String /* "PENDING" | "AVAILABLE" | "DELETING" | "FAILED" | "INACTIVE" | String */
        var VpcLinkStatusMessage: StringWithLengthBetween0And1024?
            get() = definedExternally
            set(value) = definedExternally
        var VpcLinkVersion: String /* "V2" | String */
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-11-29" | "latest" | String */
    }
}