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
import Greengrass.BulkDeploymentResult
import Greengrass.BulkDeployment
import Greengrass.Deployment
import Greengrass.ErrorDetail
import Greengrass.ConnectivityInfo
import Greengrass.Connector
import Greengrass.Core
import Greengrass.DefinitionInformation
import Greengrass.Device
import Greengrass.Function
import Greengrass.GroupCertificateAuthorityProperties
import Greengrass.GroupInformation
import Greengrass.Logger
import Greengrass.Resource
import Greengrass.ResourceAccessPolicy
import Greengrass.Subscription
import Greengrass.VersionInformation
import Greengrass.AssociateRoleToGroupRequest
import Greengrass.AssociateRoleToGroupResponse
import Greengrass.AssociateServiceRoleToAccountRequest
import Greengrass.AssociateServiceRoleToAccountResponse
import Greengrass.CreateConnectorDefinitionRequest
import Greengrass.CreateConnectorDefinitionResponse
import Greengrass.CreateConnectorDefinitionVersionRequest
import Greengrass.CreateConnectorDefinitionVersionResponse
import Greengrass.CreateCoreDefinitionRequest
import Greengrass.CreateCoreDefinitionResponse
import Greengrass.CreateCoreDefinitionVersionRequest
import Greengrass.CreateCoreDefinitionVersionResponse
import Greengrass.CreateDeploymentRequest
import Greengrass.CreateDeploymentResponse
import Greengrass.CreateDeviceDefinitionRequest
import Greengrass.CreateDeviceDefinitionResponse
import Greengrass.CreateDeviceDefinitionVersionRequest
import Greengrass.CreateDeviceDefinitionVersionResponse
import Greengrass.CreateFunctionDefinitionRequest
import Greengrass.CreateFunctionDefinitionResponse
import Greengrass.CreateFunctionDefinitionVersionRequest
import Greengrass.CreateFunctionDefinitionVersionResponse
import Greengrass.CreateGroupRequest
import Greengrass.CreateGroupResponse
import Greengrass.CreateGroupCertificateAuthorityRequest
import Greengrass.CreateGroupCertificateAuthorityResponse
import Greengrass.CreateGroupVersionRequest
import Greengrass.CreateGroupVersionResponse
import Greengrass.CreateLoggerDefinitionRequest
import Greengrass.CreateLoggerDefinitionResponse
import Greengrass.CreateLoggerDefinitionVersionRequest
import Greengrass.CreateLoggerDefinitionVersionResponse
import Greengrass.CreateResourceDefinitionRequest
import Greengrass.CreateResourceDefinitionResponse
import Greengrass.CreateResourceDefinitionVersionRequest
import Greengrass.CreateResourceDefinitionVersionResponse
import Greengrass.CreateSoftwareUpdateJobRequest
import Greengrass.CreateSoftwareUpdateJobResponse
import Greengrass.CreateSubscriptionDefinitionRequest
import Greengrass.CreateSubscriptionDefinitionResponse
import Greengrass.CreateSubscriptionDefinitionVersionRequest
import Greengrass.CreateSubscriptionDefinitionVersionResponse
import Greengrass.DeleteConnectorDefinitionRequest
import Greengrass.DeleteConnectorDefinitionResponse
import Greengrass.DeleteCoreDefinitionRequest
import Greengrass.DeleteCoreDefinitionResponse
import Greengrass.DeleteDeviceDefinitionRequest
import Greengrass.DeleteDeviceDefinitionResponse
import Greengrass.DeleteFunctionDefinitionRequest
import Greengrass.DeleteFunctionDefinitionResponse
import Greengrass.DeleteGroupRequest
import Greengrass.DeleteGroupResponse
import Greengrass.DeleteLoggerDefinitionRequest
import Greengrass.DeleteLoggerDefinitionResponse
import Greengrass.DeleteResourceDefinitionRequest
import Greengrass.DeleteResourceDefinitionResponse
import Greengrass.DeleteSubscriptionDefinitionRequest
import Greengrass.DeleteSubscriptionDefinitionResponse
import Greengrass.DisassociateRoleFromGroupRequest
import Greengrass.DisassociateRoleFromGroupResponse
import Greengrass.DisassociateServiceRoleFromAccountRequest
import Greengrass.DisassociateServiceRoleFromAccountResponse
import Greengrass.GetAssociatedRoleRequest
import Greengrass.GetAssociatedRoleResponse
import Greengrass.GetBulkDeploymentStatusRequest
import Greengrass.GetBulkDeploymentStatusResponse
import Greengrass.GetConnectivityInfoRequest
import Greengrass.GetConnectivityInfoResponse
import Greengrass.GetConnectorDefinitionRequest
import Greengrass.GetConnectorDefinitionResponse
import Greengrass.GetConnectorDefinitionVersionRequest
import Greengrass.GetConnectorDefinitionVersionResponse
import Greengrass.GetCoreDefinitionRequest
import Greengrass.GetCoreDefinitionResponse
import Greengrass.GetCoreDefinitionVersionRequest
import Greengrass.GetCoreDefinitionVersionResponse
import Greengrass.GetDeploymentStatusRequest
import Greengrass.GetDeploymentStatusResponse
import Greengrass.GetDeviceDefinitionRequest
import Greengrass.GetDeviceDefinitionResponse
import Greengrass.GetDeviceDefinitionVersionRequest
import Greengrass.GetDeviceDefinitionVersionResponse
import Greengrass.GetFunctionDefinitionRequest
import Greengrass.GetFunctionDefinitionResponse
import Greengrass.GetFunctionDefinitionVersionRequest
import Greengrass.GetFunctionDefinitionVersionResponse
import Greengrass.GetGroupRequest
import Greengrass.GetGroupResponse
import Greengrass.GetGroupCertificateAuthorityRequest
import Greengrass.GetGroupCertificateAuthorityResponse
import Greengrass.GetGroupCertificateConfigurationRequest
import Greengrass.GetGroupCertificateConfigurationResponse
import Greengrass.GetGroupVersionRequest
import Greengrass.GetGroupVersionResponse
import Greengrass.GetLoggerDefinitionRequest
import Greengrass.GetLoggerDefinitionResponse
import Greengrass.GetLoggerDefinitionVersionRequest
import Greengrass.GetLoggerDefinitionVersionResponse
import Greengrass.GetResourceDefinitionRequest
import Greengrass.GetResourceDefinitionResponse
import Greengrass.GetResourceDefinitionVersionRequest
import Greengrass.GetResourceDefinitionVersionResponse
import Greengrass.GetServiceRoleForAccountRequest
import Greengrass.GetServiceRoleForAccountResponse
import Greengrass.GetSubscriptionDefinitionRequest
import Greengrass.GetSubscriptionDefinitionResponse
import Greengrass.GetSubscriptionDefinitionVersionRequest
import Greengrass.GetSubscriptionDefinitionVersionResponse
import Greengrass.ListBulkDeploymentDetailedReportsRequest
import Greengrass.ListBulkDeploymentDetailedReportsResponse
import Greengrass.ListBulkDeploymentsRequest
import Greengrass.ListBulkDeploymentsResponse
import Greengrass.ListConnectorDefinitionVersionsRequest
import Greengrass.ListConnectorDefinitionVersionsResponse
import Greengrass.ListConnectorDefinitionsRequest
import Greengrass.ListConnectorDefinitionsResponse
import Greengrass.ListCoreDefinitionVersionsRequest
import Greengrass.ListCoreDefinitionVersionsResponse
import Greengrass.ListCoreDefinitionsRequest
import Greengrass.ListCoreDefinitionsResponse
import Greengrass.ListDeploymentsRequest
import Greengrass.ListDeploymentsResponse
import Greengrass.ListDeviceDefinitionVersionsRequest
import Greengrass.ListDeviceDefinitionVersionsResponse
import Greengrass.ListDeviceDefinitionsRequest
import Greengrass.ListDeviceDefinitionsResponse
import Greengrass.ListFunctionDefinitionVersionsRequest
import Greengrass.ListFunctionDefinitionVersionsResponse
import Greengrass.ListFunctionDefinitionsRequest
import Greengrass.ListFunctionDefinitionsResponse
import Greengrass.ListGroupCertificateAuthoritiesRequest
import Greengrass.ListGroupCertificateAuthoritiesResponse
import Greengrass.ListGroupVersionsRequest
import Greengrass.ListGroupVersionsResponse
import Greengrass.ListGroupsRequest
import Greengrass.ListGroupsResponse
import Greengrass.ListLoggerDefinitionVersionsRequest
import Greengrass.ListLoggerDefinitionVersionsResponse
import Greengrass.ListLoggerDefinitionsRequest
import Greengrass.ListLoggerDefinitionsResponse
import Greengrass.ListResourceDefinitionVersionsRequest
import Greengrass.ListResourceDefinitionVersionsResponse
import Greengrass.ListResourceDefinitionsRequest
import Greengrass.ListResourceDefinitionsResponse
import Greengrass.ListSubscriptionDefinitionVersionsRequest
import Greengrass.ListSubscriptionDefinitionVersionsResponse
import Greengrass.ListSubscriptionDefinitionsRequest
import Greengrass.ListSubscriptionDefinitionsResponse
import Greengrass.ListTagsForResourceRequest
import Greengrass.ListTagsForResourceResponse
import Greengrass.ResetDeploymentsRequest
import Greengrass.ResetDeploymentsResponse
import Greengrass.StartBulkDeploymentRequest
import Greengrass.StartBulkDeploymentResponse
import Greengrass.StopBulkDeploymentRequest
import Greengrass.StopBulkDeploymentResponse
import Greengrass.TagResourceRequest
import Greengrass.UntagResourceRequest
import Greengrass.UpdateConnectivityInfoRequest
import Greengrass.UpdateConnectivityInfoResponse
import Greengrass.UpdateConnectorDefinitionRequest
import Greengrass.UpdateConnectorDefinitionResponse
import Greengrass.UpdateCoreDefinitionRequest
import Greengrass.UpdateCoreDefinitionResponse
import Greengrass.UpdateDeviceDefinitionRequest
import Greengrass.UpdateDeviceDefinitionResponse
import Greengrass.UpdateFunctionDefinitionRequest
import Greengrass.UpdateFunctionDefinitionResponse
import Greengrass.UpdateGroupRequest
import Greengrass.UpdateGroupResponse
import Greengrass.UpdateGroupCertificateConfigurationRequest
import Greengrass.UpdateGroupCertificateConfigurationResponse
import Greengrass.UpdateLoggerDefinitionRequest
import Greengrass.UpdateLoggerDefinitionResponse
import Greengrass.UpdateResourceDefinitionRequest
import Greengrass.UpdateResourceDefinitionResponse
import Greengrass.UpdateSubscriptionDefinitionRequest
import Greengrass.UpdateSubscriptionDefinitionResponse
import Greengrass.__mapOf__string
import Greengrass.ConnectorDefinitionVersion
import Greengrass.Tags
import Greengrass.CoreDefinitionVersion
import Greengrass.DeviceDefinitionVersion
import Greengrass.FunctionDefinitionVersion
import Greengrass.FunctionDefaultConfig
import Greengrass.GroupVersion
import Greengrass.LoggerDefinitionVersion
import Greengrass.ResourceDefinitionVersion
import Greengrass.SubscriptionDefinitionVersion
import Greengrass.FunctionConfiguration
import Greengrass.FunctionConfigurationEnvironment
import Greengrass.FunctionExecutionConfig
import Greengrass.FunctionDefaultExecutionConfig
import Greengrass.FunctionRunAsConfig
import Greengrass.BulkDeploymentMetrics
import Greengrass.GroupOwnerSetting
import Greengrass.ResourceDataContainer
import Greengrass.LocalDeviceResourceData
import Greengrass.LocalVolumeResourceData
import Greengrass.S3MachineLearningModelResourceData
import Greengrass.SageMakerMachineLearningModelResourceData
import Greengrass.SecretsManagerSecretResourceData
import Greengrass.ResourceDownloadOwnerSetting

typealias BulkDeploymentResults = Array<BulkDeploymentResult>

typealias BulkDeployments = Array<BulkDeployment>

typealias Deployments = Array<Deployment>

typealias ErrorDetails = Array<ErrorDetail>

typealias S3UrlSignerRole = String

typealias UpdateTargets = Array<__string>

typealias __boolean = Boolean

typealias __integer = Number

typealias __listOfConnectivityInfo = Array<ConnectivityInfo>

typealias __listOfConnector = Array<Connector>

typealias __listOfCore = Array<Core>

typealias __listOfDefinitionInformation = Array<DefinitionInformation>

typealias __listOfDevice = Array<Device>

typealias __listOfFunction = Array<Function<*>>

typealias __listOfGroupCertificateAuthorityProperties = Array<GroupCertificateAuthorityProperties>

typealias __listOfGroupInformation = Array<GroupInformation>

typealias __listOfLogger = Array<Logger>

typealias __listOfResource = Array<Resource>

typealias __listOfResourceAccessPolicy = Array<ResourceAccessPolicy>

typealias __listOfSubscription = Array<Subscription>

typealias __listOfVersionInformation = Array<VersionInformation>

typealias __listOf__string = Array<__string>

typealias __string = String

@JsModule("aws-sdk")
external open class Greengrass(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Greengrass.Types.ClientConfiguration */
    open fun associateRoleToGroup(params: AssociateRoleToGroupRequest, callback: (err: AWSError, data: AssociateRoleToGroupResponse) -> Unit = definedExternally): Request<AssociateRoleToGroupResponse, AWSError>
    open fun associateRoleToGroup(callback: (err: AWSError, data: AssociateRoleToGroupResponse) -> Unit = definedExternally): Request<AssociateRoleToGroupResponse, AWSError>
    open fun associateServiceRoleToAccount(params: AssociateServiceRoleToAccountRequest, callback: (err: AWSError, data: AssociateServiceRoleToAccountResponse) -> Unit = definedExternally): Request<AssociateServiceRoleToAccountResponse, AWSError>
    open fun associateServiceRoleToAccount(callback: (err: AWSError, data: AssociateServiceRoleToAccountResponse) -> Unit = definedExternally): Request<AssociateServiceRoleToAccountResponse, AWSError>
    open fun createConnectorDefinition(params: CreateConnectorDefinitionRequest, callback: (err: AWSError, data: CreateConnectorDefinitionResponse) -> Unit = definedExternally): Request<CreateConnectorDefinitionResponse, AWSError>
    open fun createConnectorDefinition(callback: (err: AWSError, data: CreateConnectorDefinitionResponse) -> Unit = definedExternally): Request<CreateConnectorDefinitionResponse, AWSError>
    open fun createConnectorDefinitionVersion(params: CreateConnectorDefinitionVersionRequest, callback: (err: AWSError, data: CreateConnectorDefinitionVersionResponse) -> Unit = definedExternally): Request<CreateConnectorDefinitionVersionResponse, AWSError>
    open fun createConnectorDefinitionVersion(callback: (err: AWSError, data: CreateConnectorDefinitionVersionResponse) -> Unit = definedExternally): Request<CreateConnectorDefinitionVersionResponse, AWSError>
    open fun createCoreDefinition(params: CreateCoreDefinitionRequest, callback: (err: AWSError, data: CreateCoreDefinitionResponse) -> Unit = definedExternally): Request<CreateCoreDefinitionResponse, AWSError>
    open fun createCoreDefinition(callback: (err: AWSError, data: CreateCoreDefinitionResponse) -> Unit = definedExternally): Request<CreateCoreDefinitionResponse, AWSError>
    open fun createCoreDefinitionVersion(params: CreateCoreDefinitionVersionRequest, callback: (err: AWSError, data: CreateCoreDefinitionVersionResponse) -> Unit = definedExternally): Request<CreateCoreDefinitionVersionResponse, AWSError>
    open fun createCoreDefinitionVersion(callback: (err: AWSError, data: CreateCoreDefinitionVersionResponse) -> Unit = definedExternally): Request<CreateCoreDefinitionVersionResponse, AWSError>
    open fun createDeployment(params: CreateDeploymentRequest, callback: (err: AWSError, data: CreateDeploymentResponse) -> Unit = definedExternally): Request<CreateDeploymentResponse, AWSError>
    open fun createDeployment(callback: (err: AWSError, data: CreateDeploymentResponse) -> Unit = definedExternally): Request<CreateDeploymentResponse, AWSError>
    open fun createDeviceDefinition(params: CreateDeviceDefinitionRequest, callback: (err: AWSError, data: CreateDeviceDefinitionResponse) -> Unit = definedExternally): Request<CreateDeviceDefinitionResponse, AWSError>
    open fun createDeviceDefinition(callback: (err: AWSError, data: CreateDeviceDefinitionResponse) -> Unit = definedExternally): Request<CreateDeviceDefinitionResponse, AWSError>
    open fun createDeviceDefinitionVersion(params: CreateDeviceDefinitionVersionRequest, callback: (err: AWSError, data: CreateDeviceDefinitionVersionResponse) -> Unit = definedExternally): Request<CreateDeviceDefinitionVersionResponse, AWSError>
    open fun createDeviceDefinitionVersion(callback: (err: AWSError, data: CreateDeviceDefinitionVersionResponse) -> Unit = definedExternally): Request<CreateDeviceDefinitionVersionResponse, AWSError>
    open fun createFunctionDefinition(params: CreateFunctionDefinitionRequest, callback: (err: AWSError, data: CreateFunctionDefinitionResponse) -> Unit = definedExternally): Request<CreateFunctionDefinitionResponse, AWSError>
    open fun createFunctionDefinition(callback: (err: AWSError, data: CreateFunctionDefinitionResponse) -> Unit = definedExternally): Request<CreateFunctionDefinitionResponse, AWSError>
    open fun createFunctionDefinitionVersion(params: CreateFunctionDefinitionVersionRequest, callback: (err: AWSError, data: CreateFunctionDefinitionVersionResponse) -> Unit = definedExternally): Request<CreateFunctionDefinitionVersionResponse, AWSError>
    open fun createFunctionDefinitionVersion(callback: (err: AWSError, data: CreateFunctionDefinitionVersionResponse) -> Unit = definedExternally): Request<CreateFunctionDefinitionVersionResponse, AWSError>
    open fun createGroup(params: CreateGroupRequest, callback: (err: AWSError, data: CreateGroupResponse) -> Unit = definedExternally): Request<CreateGroupResponse, AWSError>
    open fun createGroup(callback: (err: AWSError, data: CreateGroupResponse) -> Unit = definedExternally): Request<CreateGroupResponse, AWSError>
    open fun createGroupCertificateAuthority(params: CreateGroupCertificateAuthorityRequest, callback: (err: AWSError, data: CreateGroupCertificateAuthorityResponse) -> Unit = definedExternally): Request<CreateGroupCertificateAuthorityResponse, AWSError>
    open fun createGroupCertificateAuthority(callback: (err: AWSError, data: CreateGroupCertificateAuthorityResponse) -> Unit = definedExternally): Request<CreateGroupCertificateAuthorityResponse, AWSError>
    open fun createGroupVersion(params: CreateGroupVersionRequest, callback: (err: AWSError, data: CreateGroupVersionResponse) -> Unit = definedExternally): Request<CreateGroupVersionResponse, AWSError>
    open fun createGroupVersion(callback: (err: AWSError, data: CreateGroupVersionResponse) -> Unit = definedExternally): Request<CreateGroupVersionResponse, AWSError>
    open fun createLoggerDefinition(params: CreateLoggerDefinitionRequest, callback: (err: AWSError, data: CreateLoggerDefinitionResponse) -> Unit = definedExternally): Request<CreateLoggerDefinitionResponse, AWSError>
    open fun createLoggerDefinition(callback: (err: AWSError, data: CreateLoggerDefinitionResponse) -> Unit = definedExternally): Request<CreateLoggerDefinitionResponse, AWSError>
    open fun createLoggerDefinitionVersion(params: CreateLoggerDefinitionVersionRequest, callback: (err: AWSError, data: CreateLoggerDefinitionVersionResponse) -> Unit = definedExternally): Request<CreateLoggerDefinitionVersionResponse, AWSError>
    open fun createLoggerDefinitionVersion(callback: (err: AWSError, data: CreateLoggerDefinitionVersionResponse) -> Unit = definedExternally): Request<CreateLoggerDefinitionVersionResponse, AWSError>
    open fun createResourceDefinition(params: CreateResourceDefinitionRequest, callback: (err: AWSError, data: CreateResourceDefinitionResponse) -> Unit = definedExternally): Request<CreateResourceDefinitionResponse, AWSError>
    open fun createResourceDefinition(callback: (err: AWSError, data: CreateResourceDefinitionResponse) -> Unit = definedExternally): Request<CreateResourceDefinitionResponse, AWSError>
    open fun createResourceDefinitionVersion(params: CreateResourceDefinitionVersionRequest, callback: (err: AWSError, data: CreateResourceDefinitionVersionResponse) -> Unit = definedExternally): Request<CreateResourceDefinitionVersionResponse, AWSError>
    open fun createResourceDefinitionVersion(callback: (err: AWSError, data: CreateResourceDefinitionVersionResponse) -> Unit = definedExternally): Request<CreateResourceDefinitionVersionResponse, AWSError>
    open fun createSoftwareUpdateJob(params: CreateSoftwareUpdateJobRequest, callback: (err: AWSError, data: CreateSoftwareUpdateJobResponse) -> Unit = definedExternally): Request<CreateSoftwareUpdateJobResponse, AWSError>
    open fun createSoftwareUpdateJob(callback: (err: AWSError, data: CreateSoftwareUpdateJobResponse) -> Unit = definedExternally): Request<CreateSoftwareUpdateJobResponse, AWSError>
    open fun createSubscriptionDefinition(params: CreateSubscriptionDefinitionRequest, callback: (err: AWSError, data: CreateSubscriptionDefinitionResponse) -> Unit = definedExternally): Request<CreateSubscriptionDefinitionResponse, AWSError>
    open fun createSubscriptionDefinition(callback: (err: AWSError, data: CreateSubscriptionDefinitionResponse) -> Unit = definedExternally): Request<CreateSubscriptionDefinitionResponse, AWSError>
    open fun createSubscriptionDefinitionVersion(params: CreateSubscriptionDefinitionVersionRequest, callback: (err: AWSError, data: CreateSubscriptionDefinitionVersionResponse) -> Unit = definedExternally): Request<CreateSubscriptionDefinitionVersionResponse, AWSError>
    open fun createSubscriptionDefinitionVersion(callback: (err: AWSError, data: CreateSubscriptionDefinitionVersionResponse) -> Unit = definedExternally): Request<CreateSubscriptionDefinitionVersionResponse, AWSError>
    open fun deleteConnectorDefinition(params: DeleteConnectorDefinitionRequest, callback: (err: AWSError, data: DeleteConnectorDefinitionResponse) -> Unit = definedExternally): Request<DeleteConnectorDefinitionResponse, AWSError>
    open fun deleteConnectorDefinition(callback: (err: AWSError, data: DeleteConnectorDefinitionResponse) -> Unit = definedExternally): Request<DeleteConnectorDefinitionResponse, AWSError>
    open fun deleteCoreDefinition(params: DeleteCoreDefinitionRequest, callback: (err: AWSError, data: DeleteCoreDefinitionResponse) -> Unit = definedExternally): Request<DeleteCoreDefinitionResponse, AWSError>
    open fun deleteCoreDefinition(callback: (err: AWSError, data: DeleteCoreDefinitionResponse) -> Unit = definedExternally): Request<DeleteCoreDefinitionResponse, AWSError>
    open fun deleteDeviceDefinition(params: DeleteDeviceDefinitionRequest, callback: (err: AWSError, data: DeleteDeviceDefinitionResponse) -> Unit = definedExternally): Request<DeleteDeviceDefinitionResponse, AWSError>
    open fun deleteDeviceDefinition(callback: (err: AWSError, data: DeleteDeviceDefinitionResponse) -> Unit = definedExternally): Request<DeleteDeviceDefinitionResponse, AWSError>
    open fun deleteFunctionDefinition(params: DeleteFunctionDefinitionRequest, callback: (err: AWSError, data: DeleteFunctionDefinitionResponse) -> Unit = definedExternally): Request<DeleteFunctionDefinitionResponse, AWSError>
    open fun deleteFunctionDefinition(callback: (err: AWSError, data: DeleteFunctionDefinitionResponse) -> Unit = definedExternally): Request<DeleteFunctionDefinitionResponse, AWSError>
    open fun deleteGroup(params: DeleteGroupRequest, callback: (err: AWSError, data: DeleteGroupResponse) -> Unit = definedExternally): Request<DeleteGroupResponse, AWSError>
    open fun deleteGroup(callback: (err: AWSError, data: DeleteGroupResponse) -> Unit = definedExternally): Request<DeleteGroupResponse, AWSError>
    open fun deleteLoggerDefinition(params: DeleteLoggerDefinitionRequest, callback: (err: AWSError, data: DeleteLoggerDefinitionResponse) -> Unit = definedExternally): Request<DeleteLoggerDefinitionResponse, AWSError>
    open fun deleteLoggerDefinition(callback: (err: AWSError, data: DeleteLoggerDefinitionResponse) -> Unit = definedExternally): Request<DeleteLoggerDefinitionResponse, AWSError>
    open fun deleteResourceDefinition(params: DeleteResourceDefinitionRequest, callback: (err: AWSError, data: DeleteResourceDefinitionResponse) -> Unit = definedExternally): Request<DeleteResourceDefinitionResponse, AWSError>
    open fun deleteResourceDefinition(callback: (err: AWSError, data: DeleteResourceDefinitionResponse) -> Unit = definedExternally): Request<DeleteResourceDefinitionResponse, AWSError>
    open fun deleteSubscriptionDefinition(params: DeleteSubscriptionDefinitionRequest, callback: (err: AWSError, data: DeleteSubscriptionDefinitionResponse) -> Unit = definedExternally): Request<DeleteSubscriptionDefinitionResponse, AWSError>
    open fun deleteSubscriptionDefinition(callback: (err: AWSError, data: DeleteSubscriptionDefinitionResponse) -> Unit = definedExternally): Request<DeleteSubscriptionDefinitionResponse, AWSError>
    open fun disassociateRoleFromGroup(params: DisassociateRoleFromGroupRequest, callback: (err: AWSError, data: DisassociateRoleFromGroupResponse) -> Unit = definedExternally): Request<DisassociateRoleFromGroupResponse, AWSError>
    open fun disassociateRoleFromGroup(callback: (err: AWSError, data: DisassociateRoleFromGroupResponse) -> Unit = definedExternally): Request<DisassociateRoleFromGroupResponse, AWSError>
    open fun disassociateServiceRoleFromAccount(params: DisassociateServiceRoleFromAccountRequest, callback: (err: AWSError, data: DisassociateServiceRoleFromAccountResponse) -> Unit = definedExternally): Request<DisassociateServiceRoleFromAccountResponse, AWSError>
    open fun disassociateServiceRoleFromAccount(callback: (err: AWSError, data: DisassociateServiceRoleFromAccountResponse) -> Unit = definedExternally): Request<DisassociateServiceRoleFromAccountResponse, AWSError>
    open fun getAssociatedRole(params: GetAssociatedRoleRequest, callback: (err: AWSError, data: GetAssociatedRoleResponse) -> Unit = definedExternally): Request<GetAssociatedRoleResponse, AWSError>
    open fun getAssociatedRole(callback: (err: AWSError, data: GetAssociatedRoleResponse) -> Unit = definedExternally): Request<GetAssociatedRoleResponse, AWSError>
    open fun getBulkDeploymentStatus(params: GetBulkDeploymentStatusRequest, callback: (err: AWSError, data: GetBulkDeploymentStatusResponse) -> Unit = definedExternally): Request<GetBulkDeploymentStatusResponse, AWSError>
    open fun getBulkDeploymentStatus(callback: (err: AWSError, data: GetBulkDeploymentStatusResponse) -> Unit = definedExternally): Request<GetBulkDeploymentStatusResponse, AWSError>
    open fun getConnectivityInfo(params: GetConnectivityInfoRequest, callback: (err: AWSError, data: GetConnectivityInfoResponse) -> Unit = definedExternally): Request<GetConnectivityInfoResponse, AWSError>
    open fun getConnectivityInfo(callback: (err: AWSError, data: GetConnectivityInfoResponse) -> Unit = definedExternally): Request<GetConnectivityInfoResponse, AWSError>
    open fun getConnectorDefinition(params: GetConnectorDefinitionRequest, callback: (err: AWSError, data: GetConnectorDefinitionResponse) -> Unit = definedExternally): Request<GetConnectorDefinitionResponse, AWSError>
    open fun getConnectorDefinition(callback: (err: AWSError, data: GetConnectorDefinitionResponse) -> Unit = definedExternally): Request<GetConnectorDefinitionResponse, AWSError>
    open fun getConnectorDefinitionVersion(params: GetConnectorDefinitionVersionRequest, callback: (err: AWSError, data: GetConnectorDefinitionVersionResponse) -> Unit = definedExternally): Request<GetConnectorDefinitionVersionResponse, AWSError>
    open fun getConnectorDefinitionVersion(callback: (err: AWSError, data: GetConnectorDefinitionVersionResponse) -> Unit = definedExternally): Request<GetConnectorDefinitionVersionResponse, AWSError>
    open fun getCoreDefinition(params: GetCoreDefinitionRequest, callback: (err: AWSError, data: GetCoreDefinitionResponse) -> Unit = definedExternally): Request<GetCoreDefinitionResponse, AWSError>
    open fun getCoreDefinition(callback: (err: AWSError, data: GetCoreDefinitionResponse) -> Unit = definedExternally): Request<GetCoreDefinitionResponse, AWSError>
    open fun getCoreDefinitionVersion(params: GetCoreDefinitionVersionRequest, callback: (err: AWSError, data: GetCoreDefinitionVersionResponse) -> Unit = definedExternally): Request<GetCoreDefinitionVersionResponse, AWSError>
    open fun getCoreDefinitionVersion(callback: (err: AWSError, data: GetCoreDefinitionVersionResponse) -> Unit = definedExternally): Request<GetCoreDefinitionVersionResponse, AWSError>
    open fun getDeploymentStatus(params: GetDeploymentStatusRequest, callback: (err: AWSError, data: GetDeploymentStatusResponse) -> Unit = definedExternally): Request<GetDeploymentStatusResponse, AWSError>
    open fun getDeploymentStatus(callback: (err: AWSError, data: GetDeploymentStatusResponse) -> Unit = definedExternally): Request<GetDeploymentStatusResponse, AWSError>
    open fun getDeviceDefinition(params: GetDeviceDefinitionRequest, callback: (err: AWSError, data: GetDeviceDefinitionResponse) -> Unit = definedExternally): Request<GetDeviceDefinitionResponse, AWSError>
    open fun getDeviceDefinition(callback: (err: AWSError, data: GetDeviceDefinitionResponse) -> Unit = definedExternally): Request<GetDeviceDefinitionResponse, AWSError>
    open fun getDeviceDefinitionVersion(params: GetDeviceDefinitionVersionRequest, callback: (err: AWSError, data: GetDeviceDefinitionVersionResponse) -> Unit = definedExternally): Request<GetDeviceDefinitionVersionResponse, AWSError>
    open fun getDeviceDefinitionVersion(callback: (err: AWSError, data: GetDeviceDefinitionVersionResponse) -> Unit = definedExternally): Request<GetDeviceDefinitionVersionResponse, AWSError>
    open fun getFunctionDefinition(params: GetFunctionDefinitionRequest, callback: (err: AWSError, data: GetFunctionDefinitionResponse) -> Unit = definedExternally): Request<GetFunctionDefinitionResponse, AWSError>
    open fun getFunctionDefinition(callback: (err: AWSError, data: GetFunctionDefinitionResponse) -> Unit = definedExternally): Request<GetFunctionDefinitionResponse, AWSError>
    open fun getFunctionDefinitionVersion(params: GetFunctionDefinitionVersionRequest, callback: (err: AWSError, data: GetFunctionDefinitionVersionResponse) -> Unit = definedExternally): Request<GetFunctionDefinitionVersionResponse, AWSError>
    open fun getFunctionDefinitionVersion(callback: (err: AWSError, data: GetFunctionDefinitionVersionResponse) -> Unit = definedExternally): Request<GetFunctionDefinitionVersionResponse, AWSError>
    open fun getGroup(params: GetGroupRequest, callback: (err: AWSError, data: GetGroupResponse) -> Unit = definedExternally): Request<GetGroupResponse, AWSError>
    open fun getGroup(callback: (err: AWSError, data: GetGroupResponse) -> Unit = definedExternally): Request<GetGroupResponse, AWSError>
    open fun getGroupCertificateAuthority(params: GetGroupCertificateAuthorityRequest, callback: (err: AWSError, data: GetGroupCertificateAuthorityResponse) -> Unit = definedExternally): Request<GetGroupCertificateAuthorityResponse, AWSError>
    open fun getGroupCertificateAuthority(callback: (err: AWSError, data: GetGroupCertificateAuthorityResponse) -> Unit = definedExternally): Request<GetGroupCertificateAuthorityResponse, AWSError>
    open fun getGroupCertificateConfiguration(params: GetGroupCertificateConfigurationRequest, callback: (err: AWSError, data: GetGroupCertificateConfigurationResponse) -> Unit = definedExternally): Request<GetGroupCertificateConfigurationResponse, AWSError>
    open fun getGroupCertificateConfiguration(callback: (err: AWSError, data: GetGroupCertificateConfigurationResponse) -> Unit = definedExternally): Request<GetGroupCertificateConfigurationResponse, AWSError>
    open fun getGroupVersion(params: GetGroupVersionRequest, callback: (err: AWSError, data: GetGroupVersionResponse) -> Unit = definedExternally): Request<GetGroupVersionResponse, AWSError>
    open fun getGroupVersion(callback: (err: AWSError, data: GetGroupVersionResponse) -> Unit = definedExternally): Request<GetGroupVersionResponse, AWSError>
    open fun getLoggerDefinition(params: GetLoggerDefinitionRequest, callback: (err: AWSError, data: GetLoggerDefinitionResponse) -> Unit = definedExternally): Request<GetLoggerDefinitionResponse, AWSError>
    open fun getLoggerDefinition(callback: (err: AWSError, data: GetLoggerDefinitionResponse) -> Unit = definedExternally): Request<GetLoggerDefinitionResponse, AWSError>
    open fun getLoggerDefinitionVersion(params: GetLoggerDefinitionVersionRequest, callback: (err: AWSError, data: GetLoggerDefinitionVersionResponse) -> Unit = definedExternally): Request<GetLoggerDefinitionVersionResponse, AWSError>
    open fun getLoggerDefinitionVersion(callback: (err: AWSError, data: GetLoggerDefinitionVersionResponse) -> Unit = definedExternally): Request<GetLoggerDefinitionVersionResponse, AWSError>
    open fun getResourceDefinition(params: GetResourceDefinitionRequest, callback: (err: AWSError, data: GetResourceDefinitionResponse) -> Unit = definedExternally): Request<GetResourceDefinitionResponse, AWSError>
    open fun getResourceDefinition(callback: (err: AWSError, data: GetResourceDefinitionResponse) -> Unit = definedExternally): Request<GetResourceDefinitionResponse, AWSError>
    open fun getResourceDefinitionVersion(params: GetResourceDefinitionVersionRequest, callback: (err: AWSError, data: GetResourceDefinitionVersionResponse) -> Unit = definedExternally): Request<GetResourceDefinitionVersionResponse, AWSError>
    open fun getResourceDefinitionVersion(callback: (err: AWSError, data: GetResourceDefinitionVersionResponse) -> Unit = definedExternally): Request<GetResourceDefinitionVersionResponse, AWSError>
    open fun getServiceRoleForAccount(params: GetServiceRoleForAccountRequest, callback: (err: AWSError, data: GetServiceRoleForAccountResponse) -> Unit = definedExternally): Request<GetServiceRoleForAccountResponse, AWSError>
    open fun getServiceRoleForAccount(callback: (err: AWSError, data: GetServiceRoleForAccountResponse) -> Unit = definedExternally): Request<GetServiceRoleForAccountResponse, AWSError>
    open fun getSubscriptionDefinition(params: GetSubscriptionDefinitionRequest, callback: (err: AWSError, data: GetSubscriptionDefinitionResponse) -> Unit = definedExternally): Request<GetSubscriptionDefinitionResponse, AWSError>
    open fun getSubscriptionDefinition(callback: (err: AWSError, data: GetSubscriptionDefinitionResponse) -> Unit = definedExternally): Request<GetSubscriptionDefinitionResponse, AWSError>
    open fun getSubscriptionDefinitionVersion(params: GetSubscriptionDefinitionVersionRequest, callback: (err: AWSError, data: GetSubscriptionDefinitionVersionResponse) -> Unit = definedExternally): Request<GetSubscriptionDefinitionVersionResponse, AWSError>
    open fun getSubscriptionDefinitionVersion(callback: (err: AWSError, data: GetSubscriptionDefinitionVersionResponse) -> Unit = definedExternally): Request<GetSubscriptionDefinitionVersionResponse, AWSError>
    open fun listBulkDeploymentDetailedReports(params: ListBulkDeploymentDetailedReportsRequest, callback: (err: AWSError, data: ListBulkDeploymentDetailedReportsResponse) -> Unit = definedExternally): Request<ListBulkDeploymentDetailedReportsResponse, AWSError>
    open fun listBulkDeploymentDetailedReports(callback: (err: AWSError, data: ListBulkDeploymentDetailedReportsResponse) -> Unit = definedExternally): Request<ListBulkDeploymentDetailedReportsResponse, AWSError>
    open fun listBulkDeployments(params: ListBulkDeploymentsRequest, callback: (err: AWSError, data: ListBulkDeploymentsResponse) -> Unit = definedExternally): Request<ListBulkDeploymentsResponse, AWSError>
    open fun listBulkDeployments(callback: (err: AWSError, data: ListBulkDeploymentsResponse) -> Unit = definedExternally): Request<ListBulkDeploymentsResponse, AWSError>
    open fun listConnectorDefinitionVersions(params: ListConnectorDefinitionVersionsRequest, callback: (err: AWSError, data: ListConnectorDefinitionVersionsResponse) -> Unit = definedExternally): Request<ListConnectorDefinitionVersionsResponse, AWSError>
    open fun listConnectorDefinitionVersions(callback: (err: AWSError, data: ListConnectorDefinitionVersionsResponse) -> Unit = definedExternally): Request<ListConnectorDefinitionVersionsResponse, AWSError>
    open fun listConnectorDefinitions(params: ListConnectorDefinitionsRequest, callback: (err: AWSError, data: ListConnectorDefinitionsResponse) -> Unit = definedExternally): Request<ListConnectorDefinitionsResponse, AWSError>
    open fun listConnectorDefinitions(callback: (err: AWSError, data: ListConnectorDefinitionsResponse) -> Unit = definedExternally): Request<ListConnectorDefinitionsResponse, AWSError>
    open fun listCoreDefinitionVersions(params: ListCoreDefinitionVersionsRequest, callback: (err: AWSError, data: ListCoreDefinitionVersionsResponse) -> Unit = definedExternally): Request<ListCoreDefinitionVersionsResponse, AWSError>
    open fun listCoreDefinitionVersions(callback: (err: AWSError, data: ListCoreDefinitionVersionsResponse) -> Unit = definedExternally): Request<ListCoreDefinitionVersionsResponse, AWSError>
    open fun listCoreDefinitions(params: ListCoreDefinitionsRequest, callback: (err: AWSError, data: ListCoreDefinitionsResponse) -> Unit = definedExternally): Request<ListCoreDefinitionsResponse, AWSError>
    open fun listCoreDefinitions(callback: (err: AWSError, data: ListCoreDefinitionsResponse) -> Unit = definedExternally): Request<ListCoreDefinitionsResponse, AWSError>
    open fun listDeployments(params: ListDeploymentsRequest, callback: (err: AWSError, data: ListDeploymentsResponse) -> Unit = definedExternally): Request<ListDeploymentsResponse, AWSError>
    open fun listDeployments(callback: (err: AWSError, data: ListDeploymentsResponse) -> Unit = definedExternally): Request<ListDeploymentsResponse, AWSError>
    open fun listDeviceDefinitionVersions(params: ListDeviceDefinitionVersionsRequest, callback: (err: AWSError, data: ListDeviceDefinitionVersionsResponse) -> Unit = definedExternally): Request<ListDeviceDefinitionVersionsResponse, AWSError>
    open fun listDeviceDefinitionVersions(callback: (err: AWSError, data: ListDeviceDefinitionVersionsResponse) -> Unit = definedExternally): Request<ListDeviceDefinitionVersionsResponse, AWSError>
    open fun listDeviceDefinitions(params: ListDeviceDefinitionsRequest, callback: (err: AWSError, data: ListDeviceDefinitionsResponse) -> Unit = definedExternally): Request<ListDeviceDefinitionsResponse, AWSError>
    open fun listDeviceDefinitions(callback: (err: AWSError, data: ListDeviceDefinitionsResponse) -> Unit = definedExternally): Request<ListDeviceDefinitionsResponse, AWSError>
    open fun listFunctionDefinitionVersions(params: ListFunctionDefinitionVersionsRequest, callback: (err: AWSError, data: ListFunctionDefinitionVersionsResponse) -> Unit = definedExternally): Request<ListFunctionDefinitionVersionsResponse, AWSError>
    open fun listFunctionDefinitionVersions(callback: (err: AWSError, data: ListFunctionDefinitionVersionsResponse) -> Unit = definedExternally): Request<ListFunctionDefinitionVersionsResponse, AWSError>
    open fun listFunctionDefinitions(params: ListFunctionDefinitionsRequest, callback: (err: AWSError, data: ListFunctionDefinitionsResponse) -> Unit = definedExternally): Request<ListFunctionDefinitionsResponse, AWSError>
    open fun listFunctionDefinitions(callback: (err: AWSError, data: ListFunctionDefinitionsResponse) -> Unit = definedExternally): Request<ListFunctionDefinitionsResponse, AWSError>
    open fun listGroupCertificateAuthorities(params: ListGroupCertificateAuthoritiesRequest, callback: (err: AWSError, data: ListGroupCertificateAuthoritiesResponse) -> Unit = definedExternally): Request<ListGroupCertificateAuthoritiesResponse, AWSError>
    open fun listGroupCertificateAuthorities(callback: (err: AWSError, data: ListGroupCertificateAuthoritiesResponse) -> Unit = definedExternally): Request<ListGroupCertificateAuthoritiesResponse, AWSError>
    open fun listGroupVersions(params: ListGroupVersionsRequest, callback: (err: AWSError, data: ListGroupVersionsResponse) -> Unit = definedExternally): Request<ListGroupVersionsResponse, AWSError>
    open fun listGroupVersions(callback: (err: AWSError, data: ListGroupVersionsResponse) -> Unit = definedExternally): Request<ListGroupVersionsResponse, AWSError>
    open fun listGroups(params: ListGroupsRequest, callback: (err: AWSError, data: ListGroupsResponse) -> Unit = definedExternally): Request<ListGroupsResponse, AWSError>
    open fun listGroups(callback: (err: AWSError, data: ListGroupsResponse) -> Unit = definedExternally): Request<ListGroupsResponse, AWSError>
    open fun listLoggerDefinitionVersions(params: ListLoggerDefinitionVersionsRequest, callback: (err: AWSError, data: ListLoggerDefinitionVersionsResponse) -> Unit = definedExternally): Request<ListLoggerDefinitionVersionsResponse, AWSError>
    open fun listLoggerDefinitionVersions(callback: (err: AWSError, data: ListLoggerDefinitionVersionsResponse) -> Unit = definedExternally): Request<ListLoggerDefinitionVersionsResponse, AWSError>
    open fun listLoggerDefinitions(params: ListLoggerDefinitionsRequest, callback: (err: AWSError, data: ListLoggerDefinitionsResponse) -> Unit = definedExternally): Request<ListLoggerDefinitionsResponse, AWSError>
    open fun listLoggerDefinitions(callback: (err: AWSError, data: ListLoggerDefinitionsResponse) -> Unit = definedExternally): Request<ListLoggerDefinitionsResponse, AWSError>
    open fun listResourceDefinitionVersions(params: ListResourceDefinitionVersionsRequest, callback: (err: AWSError, data: ListResourceDefinitionVersionsResponse) -> Unit = definedExternally): Request<ListResourceDefinitionVersionsResponse, AWSError>
    open fun listResourceDefinitionVersions(callback: (err: AWSError, data: ListResourceDefinitionVersionsResponse) -> Unit = definedExternally): Request<ListResourceDefinitionVersionsResponse, AWSError>
    open fun listResourceDefinitions(params: ListResourceDefinitionsRequest, callback: (err: AWSError, data: ListResourceDefinitionsResponse) -> Unit = definedExternally): Request<ListResourceDefinitionsResponse, AWSError>
    open fun listResourceDefinitions(callback: (err: AWSError, data: ListResourceDefinitionsResponse) -> Unit = definedExternally): Request<ListResourceDefinitionsResponse, AWSError>
    open fun listSubscriptionDefinitionVersions(params: ListSubscriptionDefinitionVersionsRequest, callback: (err: AWSError, data: ListSubscriptionDefinitionVersionsResponse) -> Unit = definedExternally): Request<ListSubscriptionDefinitionVersionsResponse, AWSError>
    open fun listSubscriptionDefinitionVersions(callback: (err: AWSError, data: ListSubscriptionDefinitionVersionsResponse) -> Unit = definedExternally): Request<ListSubscriptionDefinitionVersionsResponse, AWSError>
    open fun listSubscriptionDefinitions(params: ListSubscriptionDefinitionsRequest, callback: (err: AWSError, data: ListSubscriptionDefinitionsResponse) -> Unit = definedExternally): Request<ListSubscriptionDefinitionsResponse, AWSError>
    open fun listSubscriptionDefinitions(callback: (err: AWSError, data: ListSubscriptionDefinitionsResponse) -> Unit = definedExternally): Request<ListSubscriptionDefinitionsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun resetDeployments(params: ResetDeploymentsRequest, callback: (err: AWSError, data: ResetDeploymentsResponse) -> Unit = definedExternally): Request<ResetDeploymentsResponse, AWSError>
    open fun resetDeployments(callback: (err: AWSError, data: ResetDeploymentsResponse) -> Unit = definedExternally): Request<ResetDeploymentsResponse, AWSError>
    open fun startBulkDeployment(params: StartBulkDeploymentRequest, callback: (err: AWSError, data: StartBulkDeploymentResponse) -> Unit = definedExternally): Request<StartBulkDeploymentResponse, AWSError>
    open fun startBulkDeployment(callback: (err: AWSError, data: StartBulkDeploymentResponse) -> Unit = definedExternally): Request<StartBulkDeploymentResponse, AWSError>
    open fun stopBulkDeployment(params: StopBulkDeploymentRequest, callback: (err: AWSError, data: StopBulkDeploymentResponse) -> Unit = definedExternally): Request<StopBulkDeploymentResponse, AWSError>
    open fun stopBulkDeployment(callback: (err: AWSError, data: StopBulkDeploymentResponse) -> Unit = definedExternally): Request<StopBulkDeploymentResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateConnectivityInfo(params: UpdateConnectivityInfoRequest, callback: (err: AWSError, data: UpdateConnectivityInfoResponse) -> Unit = definedExternally): Request<UpdateConnectivityInfoResponse, AWSError>
    open fun updateConnectivityInfo(callback: (err: AWSError, data: UpdateConnectivityInfoResponse) -> Unit = definedExternally): Request<UpdateConnectivityInfoResponse, AWSError>
    open fun updateConnectorDefinition(params: UpdateConnectorDefinitionRequest, callback: (err: AWSError, data: UpdateConnectorDefinitionResponse) -> Unit = definedExternally): Request<UpdateConnectorDefinitionResponse, AWSError>
    open fun updateConnectorDefinition(callback: (err: AWSError, data: UpdateConnectorDefinitionResponse) -> Unit = definedExternally): Request<UpdateConnectorDefinitionResponse, AWSError>
    open fun updateCoreDefinition(params: UpdateCoreDefinitionRequest, callback: (err: AWSError, data: UpdateCoreDefinitionResponse) -> Unit = definedExternally): Request<UpdateCoreDefinitionResponse, AWSError>
    open fun updateCoreDefinition(callback: (err: AWSError, data: UpdateCoreDefinitionResponse) -> Unit = definedExternally): Request<UpdateCoreDefinitionResponse, AWSError>
    open fun updateDeviceDefinition(params: UpdateDeviceDefinitionRequest, callback: (err: AWSError, data: UpdateDeviceDefinitionResponse) -> Unit = definedExternally): Request<UpdateDeviceDefinitionResponse, AWSError>
    open fun updateDeviceDefinition(callback: (err: AWSError, data: UpdateDeviceDefinitionResponse) -> Unit = definedExternally): Request<UpdateDeviceDefinitionResponse, AWSError>
    open fun updateFunctionDefinition(params: UpdateFunctionDefinitionRequest, callback: (err: AWSError, data: UpdateFunctionDefinitionResponse) -> Unit = definedExternally): Request<UpdateFunctionDefinitionResponse, AWSError>
    open fun updateFunctionDefinition(callback: (err: AWSError, data: UpdateFunctionDefinitionResponse) -> Unit = definedExternally): Request<UpdateFunctionDefinitionResponse, AWSError>
    open fun updateGroup(params: UpdateGroupRequest, callback: (err: AWSError, data: UpdateGroupResponse) -> Unit = definedExternally): Request<UpdateGroupResponse, AWSError>
    open fun updateGroup(callback: (err: AWSError, data: UpdateGroupResponse) -> Unit = definedExternally): Request<UpdateGroupResponse, AWSError>
    open fun updateGroupCertificateConfiguration(params: UpdateGroupCertificateConfigurationRequest, callback: (err: AWSError, data: UpdateGroupCertificateConfigurationResponse) -> Unit = definedExternally): Request<UpdateGroupCertificateConfigurationResponse, AWSError>
    open fun updateGroupCertificateConfiguration(callback: (err: AWSError, data: UpdateGroupCertificateConfigurationResponse) -> Unit = definedExternally): Request<UpdateGroupCertificateConfigurationResponse, AWSError>
    open fun updateLoggerDefinition(params: UpdateLoggerDefinitionRequest, callback: (err: AWSError, data: UpdateLoggerDefinitionResponse) -> Unit = definedExternally): Request<UpdateLoggerDefinitionResponse, AWSError>
    open fun updateLoggerDefinition(callback: (err: AWSError, data: UpdateLoggerDefinitionResponse) -> Unit = definedExternally): Request<UpdateLoggerDefinitionResponse, AWSError>
    open fun updateResourceDefinition(params: UpdateResourceDefinitionRequest, callback: (err: AWSError, data: UpdateResourceDefinitionResponse) -> Unit = definedExternally): Request<UpdateResourceDefinitionResponse, AWSError>
    open fun updateResourceDefinition(callback: (err: AWSError, data: UpdateResourceDefinitionResponse) -> Unit = definedExternally): Request<UpdateResourceDefinitionResponse, AWSError>
    open fun updateSubscriptionDefinition(params: UpdateSubscriptionDefinitionRequest, callback: (err: AWSError, data: UpdateSubscriptionDefinitionResponse) -> Unit = definedExternally): Request<UpdateSubscriptionDefinitionResponse, AWSError>
    open fun updateSubscriptionDefinition(callback: (err: AWSError, data: UpdateSubscriptionDefinitionResponse) -> Unit = definedExternally): Request<UpdateSubscriptionDefinitionResponse, AWSError>
    interface AssociateRoleToGroupRequest {
        var GroupId: __string
        var RoleArn: __string
    }
    interface AssociateRoleToGroupResponse {
        var AssociatedAt: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateServiceRoleToAccountRequest {
        var RoleArn: __string
    }
    interface AssociateServiceRoleToAccountResponse {
        var AssociatedAt: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BulkDeployment {
        var BulkDeploymentArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var BulkDeploymentId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BulkDeploymentMetrics {
        var InvalidInputRecords: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var RecordsProcessed: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var RetryAttempts: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BulkDeploymentResult {
        var CreatedAt: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentStatus: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentType: String /* "NewDeployment" | "Redeployment" | "ResetDeployment" | "ForceResetDeployment" | String */
        var ErrorDetails: ErrorDetails?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: __string?
            get() = definedExternally
            set(value) = definedExternally
        var GroupArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConnectivityInfo {
        var HostAddress: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Metadata: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PortNumber: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Connector {
        var ConnectorArn: __string
        var Id: __string
        var Parameters: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConnectorDefinitionVersion {
        var Connectors: __listOfConnector?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Core {
        var CertificateArn: __string
        var Id: __string
        var SyncShadow: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ThingArn: __string
    }
    interface CoreDefinitionVersion {
        var Cores: __listOfCore?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateConnectorDefinitionRequest {
        var AmznClientToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var InitialVersion: ConnectorDefinitionVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateConnectorDefinitionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateConnectorDefinitionVersionRequest {
        var AmznClientToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectorDefinitionId: __string
        var Connectors: __listOfConnector?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateConnectorDefinitionVersionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCoreDefinitionRequest {
        var AmznClientToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var InitialVersion: CoreDefinitionVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCoreDefinitionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCoreDefinitionVersionRequest {
        var AmznClientToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CoreDefinitionId: __string
        var Cores: __listOfCore?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCoreDefinitionVersionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeploymentRequest {
        var AmznClientToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentType: String /* "NewDeployment" | "Redeployment" | "ResetDeployment" | "ForceResetDeployment" | String */
        var GroupId: __string
        var GroupVersionId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeploymentResponse {
        var DeploymentArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeviceDefinitionRequest {
        var AmznClientToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var InitialVersion: DeviceDefinitionVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeviceDefinitionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeviceDefinitionVersionRequest {
        var AmznClientToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceDefinitionId: __string
        var Devices: __listOfDevice?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeviceDefinitionVersionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFunctionDefinitionRequest {
        var AmznClientToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var InitialVersion: FunctionDefinitionVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFunctionDefinitionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFunctionDefinitionVersionRequest {
        var AmznClientToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultConfig: FunctionDefaultConfig?
            get() = definedExternally
            set(value) = definedExternally
        var FunctionDefinitionId: __string
        var Functions: __listOfFunction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFunctionDefinitionVersionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGroupCertificateAuthorityRequest {
        var AmznClientToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var GroupId: __string
    }
    interface CreateGroupCertificateAuthorityResponse {
        var GroupCertificateAuthorityArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGroupRequest {
        var AmznClientToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var InitialVersion: GroupVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGroupResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGroupVersionRequest {
        var AmznClientToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectorDefinitionVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CoreDefinitionVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceDefinitionVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var FunctionDefinitionVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var GroupId: __string
        var LoggerDefinitionVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceDefinitionVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SubscriptionDefinitionVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGroupVersionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLoggerDefinitionRequest {
        var AmznClientToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var InitialVersion: LoggerDefinitionVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLoggerDefinitionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLoggerDefinitionVersionRequest {
        var AmznClientToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LoggerDefinitionId: __string
        var Loggers: __listOfLogger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLoggerDefinitionVersionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateResourceDefinitionRequest {
        var AmznClientToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var InitialVersion: ResourceDefinitionVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateResourceDefinitionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateResourceDefinitionVersionRequest {
        var AmznClientToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceDefinitionId: __string
        var Resources: __listOfResource?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateResourceDefinitionVersionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSoftwareUpdateJobRequest {
        var AmznClientToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var S3UrlSignerRole: S3UrlSignerRole
        var SoftwareToUpdate: String /* "core" | "ota_agent" | String */
        var UpdateAgentLogLevel: String /* "NONE" | "TRACE" | "DEBUG" | "VERBOSE" | "INFO" | "WARN" | "ERROR" | "FATAL" | String */
        var UpdateTargets: UpdateTargets
        var UpdateTargetsArchitecture: String /* "armv6l" | "armv7l" | "x86_64" | "aarch64" | String */
        var UpdateTargetsOperatingSystem: String /* "ubuntu" | "raspbian" | "amazon_linux" | "openwrt" | String */
    }
    interface CreateSoftwareUpdateJobResponse {
        var IotJobArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var IotJobId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformSoftwareVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSubscriptionDefinitionRequest {
        var AmznClientToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var InitialVersion: SubscriptionDefinitionVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSubscriptionDefinitionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSubscriptionDefinitionVersionRequest {
        var AmznClientToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SubscriptionDefinitionId: __string
        var Subscriptions: __listOfSubscription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSubscriptionDefinitionVersionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DefinitionInformation {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteConnectorDefinitionRequest {
        var ConnectorDefinitionId: __string
    }
    interface DeleteConnectorDefinitionResponse
    interface DeleteCoreDefinitionRequest {
        var CoreDefinitionId: __string
    }
    interface DeleteCoreDefinitionResponse
    interface DeleteDeviceDefinitionRequest {
        var DeviceDefinitionId: __string
    }
    interface DeleteDeviceDefinitionResponse
    interface DeleteFunctionDefinitionRequest {
        var FunctionDefinitionId: __string
    }
    interface DeleteFunctionDefinitionResponse
    interface DeleteGroupRequest {
        var GroupId: __string
    }
    interface DeleteGroupResponse
    interface DeleteLoggerDefinitionRequest {
        var LoggerDefinitionId: __string
    }
    interface DeleteLoggerDefinitionResponse
    interface DeleteResourceDefinitionRequest {
        var ResourceDefinitionId: __string
    }
    interface DeleteResourceDefinitionResponse
    interface DeleteSubscriptionDefinitionRequest {
        var SubscriptionDefinitionId: __string
    }
    interface DeleteSubscriptionDefinitionResponse
    interface Deployment {
        var CreatedAt: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentType: String /* "NewDeployment" | "Redeployment" | "ResetDeployment" | "ForceResetDeployment" | String */
        var GroupArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Device {
        var CertificateArn: __string
        var Id: __string
        var SyncShadow: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ThingArn: __string
    }
    interface DeviceDefinitionVersion {
        var Devices: __listOfDevice?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateRoleFromGroupRequest {
        var GroupId: __string
    }
    interface DisassociateRoleFromGroupResponse {
        var DisassociatedAt: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateServiceRoleFromAccountRequest
    interface DisassociateServiceRoleFromAccountResponse {
        var DisassociatedAt: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ErrorDetail {
        var DetailedErrorCode: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DetailedErrorMessage: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Function {
        var FunctionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var FunctionConfiguration: FunctionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string
    }
    interface FunctionConfiguration {
        var EncodingType: String /* "binary" | "json" | String */
        var Environment: FunctionConfigurationEnvironment?
            get() = definedExternally
            set(value) = definedExternally
        var ExecArgs: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Executable: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MemorySize: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Pinned: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Timeout: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FunctionConfigurationEnvironment {
        var AccessSysfs: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Execution: FunctionExecutionConfig?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceAccessPolicies: __listOfResourceAccessPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var Variables: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FunctionDefaultConfig {
        var Execution: FunctionDefaultExecutionConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FunctionDefaultExecutionConfig {
        var IsolationMode: String /* "GreengrassContainer" | "NoContainer" | String */
        var RunAs: FunctionRunAsConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FunctionDefinitionVersion {
        var DefaultConfig: FunctionDefaultConfig?
            get() = definedExternally
            set(value) = definedExternally
        var Functions: __listOfFunction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FunctionExecutionConfig {
        var IsolationMode: String /* "GreengrassContainer" | "NoContainer" | String */
        var RunAs: FunctionRunAsConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FunctionRunAsConfig {
        var Gid: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Uid: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAssociatedRoleRequest {
        var GroupId: __string
    }
    interface GetAssociatedRoleResponse {
        var AssociatedAt: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBulkDeploymentStatusRequest {
        var BulkDeploymentId: __string
    }
    interface GetBulkDeploymentStatusResponse {
        var BulkDeploymentMetrics: BulkDeploymentMetrics?
            get() = definedExternally
            set(value) = definedExternally
        var BulkDeploymentStatus: String /* "Initializing" | "Running" | "Completed" | "Stopping" | "Stopped" | "Failed" | String */
        var CreatedAt: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorDetails: ErrorDetails?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetConnectivityInfoRequest {
        var ThingName: __string
    }
    interface GetConnectivityInfoResponse {
        var ConnectivityInfo: __listOfConnectivityInfo?
            get() = definedExternally
            set(value) = definedExternally
        var Message: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetConnectorDefinitionRequest {
        var ConnectorDefinitionId: __string
    }
    interface GetConnectorDefinitionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetConnectorDefinitionVersionRequest {
        var ConnectorDefinitionId: __string
        var ConnectorDefinitionVersionId: __string
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetConnectorDefinitionVersionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Definition: ConnectorDefinitionVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCoreDefinitionRequest {
        var CoreDefinitionId: __string
    }
    interface GetCoreDefinitionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCoreDefinitionVersionRequest {
        var CoreDefinitionId: __string
        var CoreDefinitionVersionId: __string
    }
    interface GetCoreDefinitionVersionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Definition: CoreDefinitionVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeploymentStatusRequest {
        var DeploymentId: __string
        var GroupId: __string
    }
    interface GetDeploymentStatusResponse {
        var DeploymentStatus: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentType: String /* "NewDeployment" | "Redeployment" | "ResetDeployment" | "ForceResetDeployment" | String */
        var ErrorDetails: ErrorDetails?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: __string?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedAt: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeviceDefinitionRequest {
        var DeviceDefinitionId: __string
    }
    interface GetDeviceDefinitionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeviceDefinitionVersionRequest {
        var DeviceDefinitionId: __string
        var DeviceDefinitionVersionId: __string
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeviceDefinitionVersionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Definition: DeviceDefinitionVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFunctionDefinitionRequest {
        var FunctionDefinitionId: __string
    }
    interface GetFunctionDefinitionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFunctionDefinitionVersionRequest {
        var FunctionDefinitionId: __string
        var FunctionDefinitionVersionId: __string
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFunctionDefinitionVersionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Definition: FunctionDefinitionVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetGroupCertificateAuthorityRequest {
        var CertificateAuthorityId: __string
        var GroupId: __string
    }
    interface GetGroupCertificateAuthorityResponse {
        var GroupCertificateAuthorityArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var GroupCertificateAuthorityId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PemEncodedCertificate: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetGroupCertificateConfigurationRequest {
        var GroupId: __string
    }
    interface GetGroupCertificateConfigurationResponse {
        var CertificateAuthorityExpiryInMilliseconds: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateExpiryInMilliseconds: __string?
            get() = definedExternally
            set(value) = definedExternally
        var GroupId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetGroupRequest {
        var GroupId: __string
    }
    interface GetGroupResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetGroupVersionRequest {
        var GroupId: __string
        var GroupVersionId: __string
    }
    interface GetGroupVersionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Definition: GroupVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLoggerDefinitionRequest {
        var LoggerDefinitionId: __string
    }
    interface GetLoggerDefinitionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLoggerDefinitionVersionRequest {
        var LoggerDefinitionId: __string
        var LoggerDefinitionVersionId: __string
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLoggerDefinitionVersionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Definition: LoggerDefinitionVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResourceDefinitionRequest {
        var ResourceDefinitionId: __string
    }
    interface GetResourceDefinitionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResourceDefinitionVersionRequest {
        var ResourceDefinitionId: __string
        var ResourceDefinitionVersionId: __string
    }
    interface GetResourceDefinitionVersionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Definition: ResourceDefinitionVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetServiceRoleForAccountRequest
    interface GetServiceRoleForAccountResponse {
        var AssociatedAt: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSubscriptionDefinitionRequest {
        var SubscriptionDefinitionId: __string
    }
    interface GetSubscriptionDefinitionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSubscriptionDefinitionVersionRequest {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SubscriptionDefinitionId: __string
        var SubscriptionDefinitionVersionId: __string
    }
    interface GetSubscriptionDefinitionVersionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Definition: SubscriptionDefinitionVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GroupCertificateAuthorityProperties {
        var GroupCertificateAuthorityArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var GroupCertificateAuthorityId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GroupInformation {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GroupOwnerSetting {
        var AutoAddGroupOwner: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var GroupOwner: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GroupVersion {
        var ConnectorDefinitionVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CoreDefinitionVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceDefinitionVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var FunctionDefinitionVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LoggerDefinitionVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceDefinitionVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SubscriptionDefinitionVersionArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBulkDeploymentDetailedReportsRequest {
        var BulkDeploymentId: __string
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBulkDeploymentDetailedReportsResponse {
        var Deployments: BulkDeploymentResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBulkDeploymentsRequest {
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBulkDeploymentsResponse {
        var BulkDeployments: BulkDeployments?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConnectorDefinitionVersionsRequest {
        var ConnectorDefinitionId: __string
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConnectorDefinitionVersionsResponse {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Versions: __listOfVersionInformation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConnectorDefinitionsRequest {
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConnectorDefinitionsResponse {
        var Definitions: __listOfDefinitionInformation?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCoreDefinitionVersionsRequest {
        var CoreDefinitionId: __string
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCoreDefinitionVersionsResponse {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Versions: __listOfVersionInformation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCoreDefinitionsRequest {
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCoreDefinitionsResponse {
        var Definitions: __listOfDefinitionInformation?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeploymentsRequest {
        var GroupId: __string
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeploymentsResponse {
        var Deployments: Deployments?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeviceDefinitionVersionsRequest {
        var DeviceDefinitionId: __string
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeviceDefinitionVersionsResponse {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Versions: __listOfVersionInformation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeviceDefinitionsRequest {
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeviceDefinitionsResponse {
        var Definitions: __listOfDefinitionInformation?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFunctionDefinitionVersionsRequest {
        var FunctionDefinitionId: __string
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFunctionDefinitionVersionsResponse {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Versions: __listOfVersionInformation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFunctionDefinitionsRequest {
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFunctionDefinitionsResponse {
        var Definitions: __listOfDefinitionInformation?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroupCertificateAuthoritiesRequest {
        var GroupId: __string
    }
    interface ListGroupCertificateAuthoritiesResponse {
        var GroupCertificateAuthorities: __listOfGroupCertificateAuthorityProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroupVersionsRequest {
        var GroupId: __string
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroupVersionsResponse {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Versions: __listOfVersionInformation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroupsRequest {
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroupsResponse {
        var Groups: __listOfGroupInformation?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLoggerDefinitionVersionsRequest {
        var LoggerDefinitionId: __string
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLoggerDefinitionVersionsResponse {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Versions: __listOfVersionInformation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLoggerDefinitionsRequest {
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLoggerDefinitionsResponse {
        var Definitions: __listOfDefinitionInformation?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourceDefinitionVersionsRequest {
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceDefinitionId: __string
    }
    interface ListResourceDefinitionVersionsResponse {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Versions: __listOfVersionInformation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourceDefinitionsRequest {
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourceDefinitionsResponse {
        var Definitions: __listOfDefinitionInformation?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSubscriptionDefinitionVersionsRequest {
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SubscriptionDefinitionId: __string
    }
    interface ListSubscriptionDefinitionVersionsResponse {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Versions: __listOfVersionInformation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSubscriptionDefinitionsRequest {
        var MaxResults: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSubscriptionDefinitionsResponse {
        var Definitions: __listOfDefinitionInformation?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: __string
    }
    interface ListTagsForResourceResponse {
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LocalDeviceResourceData {
        var GroupOwnerSetting: GroupOwnerSetting?
            get() = definedExternally
            set(value) = definedExternally
        var SourcePath: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LocalVolumeResourceData {
        var DestinationPath: __string?
            get() = definedExternally
            set(value) = definedExternally
        var GroupOwnerSetting: GroupOwnerSetting?
            get() = definedExternally
            set(value) = definedExternally
        var SourcePath: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Logger {
        var Component: String /* "GreengrassSystem" | "Lambda" | String */
        var Id: __string
        var Level: String /* "DEBUG" | "INFO" | "WARN" | "ERROR" | "FATAL" | String */
        var Space: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "FileSystem" | "AWSCloudWatch" | String */
    }
    interface LoggerDefinitionVersion {
        var Loggers: __listOfLogger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResetDeploymentsRequest {
        var AmznClientToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Force: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var GroupId: __string
    }
    interface ResetDeploymentsResponse {
        var DeploymentArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Resource {
        var Id: __string
        var Name: __string
        var ResourceDataContainer: ResourceDataContainer
    }
    interface ResourceAccessPolicy {
        var Permission: String /* "ro" | "rw" | String */
        var ResourceId: __string
    }
    interface ResourceDataContainer {
        var LocalDeviceResourceData: LocalDeviceResourceData?
            get() = definedExternally
            set(value) = definedExternally
        var LocalVolumeResourceData: LocalVolumeResourceData?
            get() = definedExternally
            set(value) = definedExternally
        var S3MachineLearningModelResourceData: S3MachineLearningModelResourceData?
            get() = definedExternally
            set(value) = definedExternally
        var SageMakerMachineLearningModelResourceData: SageMakerMachineLearningModelResourceData?
            get() = definedExternally
            set(value) = definedExternally
        var SecretsManagerSecretResourceData: SecretsManagerSecretResourceData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceDefinitionVersion {
        var Resources: __listOfResource?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceDownloadOwnerSetting {
        var GroupOwner: __string
        var GroupPermission: String /* "ro" | "rw" | String */
    }
    interface S3MachineLearningModelResourceData {
        var DestinationPath: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerSetting: ResourceDownloadOwnerSetting?
            get() = definedExternally
            set(value) = definedExternally
        var S3Uri: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SageMakerMachineLearningModelResourceData {
        var DestinationPath: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerSetting: ResourceDownloadOwnerSetting?
            get() = definedExternally
            set(value) = definedExternally
        var SageMakerJobArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SecretsManagerSecretResourceData {
        var ARN: __string?
            get() = definedExternally
            set(value) = definedExternally
        var AdditionalStagingLabelsToDownload: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartBulkDeploymentRequest {
        var AmznClientToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionRoleArn: __string
        var InputFileUri: __string
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartBulkDeploymentResponse {
        var BulkDeploymentArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var BulkDeploymentId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopBulkDeploymentRequest {
        var BulkDeploymentId: __string
    }
    interface StopBulkDeploymentResponse
    interface Subscription {
        var Id: __string
        var Source: __string
        var Subject: __string
        var Target: __string
    }
    interface SubscriptionDefinitionVersion {
        var Subscriptions: __listOfSubscription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var ResourceArn: __string
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tags {
        @nativeGetter
        operator fun get(key: String): __string?
        @nativeSetter
        operator fun set(key: String, value: __string)
    }
    interface UntagResourceRequest {
        var ResourceArn: __string
        var TagKeys: __listOf__string
    }
    interface UpdateConnectivityInfoRequest {
        var ConnectivityInfo: __listOfConnectivityInfo?
            get() = definedExternally
            set(value) = definedExternally
        var ThingName: __string
    }
    interface UpdateConnectivityInfoResponse {
        var Message: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateConnectorDefinitionRequest {
        var ConnectorDefinitionId: __string
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateConnectorDefinitionResponse
    interface UpdateCoreDefinitionRequest {
        var CoreDefinitionId: __string
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateCoreDefinitionResponse
    interface UpdateDeviceDefinitionRequest {
        var DeviceDefinitionId: __string
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDeviceDefinitionResponse
    interface UpdateFunctionDefinitionRequest {
        var FunctionDefinitionId: __string
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFunctionDefinitionResponse
    interface UpdateGroupCertificateConfigurationRequest {
        var CertificateExpiryInMilliseconds: __string?
            get() = definedExternally
            set(value) = definedExternally
        var GroupId: __string
    }
    interface UpdateGroupCertificateConfigurationResponse {
        var CertificateAuthorityExpiryInMilliseconds: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateExpiryInMilliseconds: __string?
            get() = definedExternally
            set(value) = definedExternally
        var GroupId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGroupRequest {
        var GroupId: __string
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGroupResponse
    interface UpdateLoggerDefinitionRequest {
        var LoggerDefinitionId: __string
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateLoggerDefinitionResponse
    interface UpdateResourceDefinitionRequest {
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceDefinitionId: __string
    }
    interface UpdateResourceDefinitionResponse
    interface UpdateSubscriptionDefinitionRequest {
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SubscriptionDefinitionId: __string
    }
    interface UpdateSubscriptionDefinitionResponse
    interface VersionInformation {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface __mapOf__string {
        @nativeGetter
        operator fun get(key: String): __string?
        @nativeSetter
        operator fun set(key: String, value: __string)
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-06-07" | "latest" | String */
    }
}