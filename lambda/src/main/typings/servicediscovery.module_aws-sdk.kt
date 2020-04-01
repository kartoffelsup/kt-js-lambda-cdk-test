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
import ServiceDiscovery.DnsRecord
import ServiceDiscovery.HttpInstanceSummary
import ServiceDiscovery.InstanceSummary
import ServiceDiscovery.NamespaceFilter
import ServiceDiscovery.NamespaceSummary
import ServiceDiscovery.OperationFilter
import ServiceDiscovery.OperationSummary
import ServiceDiscovery.ServiceFilter
import ServiceDiscovery.ServiceSummary
import ServiceDiscovery.CreateHttpNamespaceRequest
import ServiceDiscovery.CreateHttpNamespaceResponse
import ServiceDiscovery.CreatePrivateDnsNamespaceRequest
import ServiceDiscovery.CreatePrivateDnsNamespaceResponse
import ServiceDiscovery.CreatePublicDnsNamespaceRequest
import ServiceDiscovery.CreatePublicDnsNamespaceResponse
import ServiceDiscovery.CreateServiceRequest
import ServiceDiscovery.CreateServiceResponse
import ServiceDiscovery.DeleteNamespaceRequest
import ServiceDiscovery.DeleteNamespaceResponse
import ServiceDiscovery.DeleteServiceRequest
import ServiceDiscovery.DeleteServiceResponse
import ServiceDiscovery.DeregisterInstanceRequest
import ServiceDiscovery.DeregisterInstanceResponse
import ServiceDiscovery.DiscoverInstancesRequest
import ServiceDiscovery.DiscoverInstancesResponse
import ServiceDiscovery.GetInstanceRequest
import ServiceDiscovery.GetInstanceResponse
import ServiceDiscovery.GetInstancesHealthStatusRequest
import ServiceDiscovery.GetInstancesHealthStatusResponse
import ServiceDiscovery.GetNamespaceRequest
import ServiceDiscovery.GetNamespaceResponse
import ServiceDiscovery.GetOperationRequest
import ServiceDiscovery.GetOperationResponse
import ServiceDiscovery.GetServiceRequest
import ServiceDiscovery.GetServiceResponse
import ServiceDiscovery.ListInstancesRequest
import ServiceDiscovery.ListInstancesResponse
import ServiceDiscovery.ListNamespacesRequest
import ServiceDiscovery.ListNamespacesResponse
import ServiceDiscovery.ListOperationsRequest
import ServiceDiscovery.ListOperationsResponse
import ServiceDiscovery.ListServicesRequest
import ServiceDiscovery.ListServicesResponse
import ServiceDiscovery.RegisterInstanceRequest
import ServiceDiscovery.RegisterInstanceResponse
import ServiceDiscovery.UpdateInstanceCustomHealthStatusRequest
import ServiceDiscovery.UpdateServiceRequest
import ServiceDiscovery.UpdateServiceResponse
import ServiceDiscovery.DnsConfig
import ServiceDiscovery.HealthCheckConfig
import ServiceDiscovery.HealthCheckCustomConfig
import ServiceDiscovery.Service
import ServiceDiscovery.Attributes
import ServiceDiscovery.Instance
import ServiceDiscovery.InstanceHealthStatusMap
import ServiceDiscovery.Namespace
import ServiceDiscovery.Operation
import ServiceDiscovery.NamespaceProperties
import ServiceDiscovery.DnsProperties
import ServiceDiscovery.HttpProperties
import ServiceDiscovery.OperationTargetsMap
import ServiceDiscovery.DnsConfigChange
import ServiceDiscovery.ServiceChange
import Service as _Service

typealias Arn = String

typealias AttrKey = String

typealias AttrValue = String

typealias Code = String

typealias DnsRecordList = Array<DnsRecord>

typealias FailureThreshold = Number

typealias FilterValue = String

typealias FilterValues = Array<FilterValue>

typealias HttpInstanceSummaryList = Array<HttpInstanceSummary>

typealias InstanceIdList = Array<ResourceId>

typealias InstanceSummaryList = Array<InstanceSummary>

typealias MaxResults = Number

typealias Message = String

typealias NamespaceFilters = Array<NamespaceFilter>

typealias NamespaceName = String

typealias NamespaceSummariesList = Array<NamespaceSummary>

typealias NextToken = String

typealias OperationFilters = Array<OperationFilter>

typealias OperationId = String

typealias OperationSummaryList = Array<OperationSummary>

typealias RecordTTL = Number

typealias ResourceCount = Number

typealias ResourceDescription = String

typealias ResourceId = String

typealias ResourcePath = String

typealias ServiceFilters = Array<ServiceFilter>

typealias ServiceName = String

typealias ServiceSummariesList = Array<ServiceSummary>

typealias Timestamp = Date

@JsModule("aws-sdk")
external open class ServiceDiscovery(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : _Service {
    open var config: ConfigBase /* Config & ServiceDiscovery.Types.ClientConfiguration */
    open fun createHttpNamespace(params: CreateHttpNamespaceRequest, callback: (err: AWSError, data: CreateHttpNamespaceResponse) -> Unit = definedExternally): Request<CreateHttpNamespaceResponse, AWSError>
    open fun createHttpNamespace(callback: (err: AWSError, data: CreateHttpNamespaceResponse) -> Unit = definedExternally): Request<CreateHttpNamespaceResponse, AWSError>
    open fun createPrivateDnsNamespace(params: CreatePrivateDnsNamespaceRequest, callback: (err: AWSError, data: CreatePrivateDnsNamespaceResponse) -> Unit = definedExternally): Request<CreatePrivateDnsNamespaceResponse, AWSError>
    open fun createPrivateDnsNamespace(callback: (err: AWSError, data: CreatePrivateDnsNamespaceResponse) -> Unit = definedExternally): Request<CreatePrivateDnsNamespaceResponse, AWSError>
    open fun createPublicDnsNamespace(params: CreatePublicDnsNamespaceRequest, callback: (err: AWSError, data: CreatePublicDnsNamespaceResponse) -> Unit = definedExternally): Request<CreatePublicDnsNamespaceResponse, AWSError>
    open fun createPublicDnsNamespace(callback: (err: AWSError, data: CreatePublicDnsNamespaceResponse) -> Unit = definedExternally): Request<CreatePublicDnsNamespaceResponse, AWSError>
    open fun createService(params: CreateServiceRequest, callback: (err: AWSError, data: CreateServiceResponse) -> Unit = definedExternally): Request<CreateServiceResponse, AWSError>
    open fun createService(callback: (err: AWSError, data: CreateServiceResponse) -> Unit = definedExternally): Request<CreateServiceResponse, AWSError>
    open fun deleteNamespace(params: DeleteNamespaceRequest, callback: (err: AWSError, data: DeleteNamespaceResponse) -> Unit = definedExternally): Request<DeleteNamespaceResponse, AWSError>
    open fun deleteNamespace(callback: (err: AWSError, data: DeleteNamespaceResponse) -> Unit = definedExternally): Request<DeleteNamespaceResponse, AWSError>
    open fun deleteService(params: DeleteServiceRequest, callback: (err: AWSError, data: DeleteServiceResponse) -> Unit = definedExternally): Request<DeleteServiceResponse, AWSError>
    open fun deleteService(callback: (err: AWSError, data: DeleteServiceResponse) -> Unit = definedExternally): Request<DeleteServiceResponse, AWSError>
    open fun deregisterInstance(params: DeregisterInstanceRequest, callback: (err: AWSError, data: DeregisterInstanceResponse) -> Unit = definedExternally): Request<DeregisterInstanceResponse, AWSError>
    open fun deregisterInstance(callback: (err: AWSError, data: DeregisterInstanceResponse) -> Unit = definedExternally): Request<DeregisterInstanceResponse, AWSError>
    open fun discoverInstances(params: DiscoverInstancesRequest, callback: (err: AWSError, data: DiscoverInstancesResponse) -> Unit = definedExternally): Request<DiscoverInstancesResponse, AWSError>
    open fun discoverInstances(callback: (err: AWSError, data: DiscoverInstancesResponse) -> Unit = definedExternally): Request<DiscoverInstancesResponse, AWSError>
    open fun getInstance(params: GetInstanceRequest, callback: (err: AWSError, data: GetInstanceResponse) -> Unit = definedExternally): Request<GetInstanceResponse, AWSError>
    open fun getInstance(callback: (err: AWSError, data: GetInstanceResponse) -> Unit = definedExternally): Request<GetInstanceResponse, AWSError>
    open fun getInstancesHealthStatus(params: GetInstancesHealthStatusRequest, callback: (err: AWSError, data: GetInstancesHealthStatusResponse) -> Unit = definedExternally): Request<GetInstancesHealthStatusResponse, AWSError>
    open fun getInstancesHealthStatus(callback: (err: AWSError, data: GetInstancesHealthStatusResponse) -> Unit = definedExternally): Request<GetInstancesHealthStatusResponse, AWSError>
    open fun getNamespace(params: GetNamespaceRequest, callback: (err: AWSError, data: GetNamespaceResponse) -> Unit = definedExternally): Request<GetNamespaceResponse, AWSError>
    open fun getNamespace(callback: (err: AWSError, data: GetNamespaceResponse) -> Unit = definedExternally): Request<GetNamespaceResponse, AWSError>
    open fun getOperation(params: GetOperationRequest, callback: (err: AWSError, data: GetOperationResponse) -> Unit = definedExternally): Request<GetOperationResponse, AWSError>
    open fun getOperation(callback: (err: AWSError, data: GetOperationResponse) -> Unit = definedExternally): Request<GetOperationResponse, AWSError>
    open fun getService(params: GetServiceRequest, callback: (err: AWSError, data: GetServiceResponse) -> Unit = definedExternally): Request<GetServiceResponse, AWSError>
    open fun getService(callback: (err: AWSError, data: GetServiceResponse) -> Unit = definedExternally): Request<GetServiceResponse, AWSError>
    open fun listInstances(params: ListInstancesRequest, callback: (err: AWSError, data: ListInstancesResponse) -> Unit = definedExternally): Request<ListInstancesResponse, AWSError>
    open fun listInstances(callback: (err: AWSError, data: ListInstancesResponse) -> Unit = definedExternally): Request<ListInstancesResponse, AWSError>
    open fun listNamespaces(params: ListNamespacesRequest, callback: (err: AWSError, data: ListNamespacesResponse) -> Unit = definedExternally): Request<ListNamespacesResponse, AWSError>
    open fun listNamespaces(callback: (err: AWSError, data: ListNamespacesResponse) -> Unit = definedExternally): Request<ListNamespacesResponse, AWSError>
    open fun listOperations(params: ListOperationsRequest, callback: (err: AWSError, data: ListOperationsResponse) -> Unit = definedExternally): Request<ListOperationsResponse, AWSError>
    open fun listOperations(callback: (err: AWSError, data: ListOperationsResponse) -> Unit = definedExternally): Request<ListOperationsResponse, AWSError>
    open fun listServices(params: ListServicesRequest, callback: (err: AWSError, data: ListServicesResponse) -> Unit = definedExternally): Request<ListServicesResponse, AWSError>
    open fun listServices(callback: (err: AWSError, data: ListServicesResponse) -> Unit = definedExternally): Request<ListServicesResponse, AWSError>
    open fun registerInstance(params: RegisterInstanceRequest, callback: (err: AWSError, data: RegisterInstanceResponse) -> Unit = definedExternally): Request<RegisterInstanceResponse, AWSError>
    open fun registerInstance(callback: (err: AWSError, data: RegisterInstanceResponse) -> Unit = definedExternally): Request<RegisterInstanceResponse, AWSError>
    open fun updateInstanceCustomHealthStatus(params: UpdateInstanceCustomHealthStatusRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateInstanceCustomHealthStatus(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateService(params: UpdateServiceRequest, callback: (err: AWSError, data: UpdateServiceResponse) -> Unit = definedExternally): Request<UpdateServiceResponse, AWSError>
    open fun updateService(callback: (err: AWSError, data: UpdateServiceResponse) -> Unit = definedExternally): Request<UpdateServiceResponse, AWSError>
    interface Attributes {
        @nativeGetter
        operator fun get(key: String): AttrValue?
        @nativeSetter
        operator fun set(key: String, value: AttrValue)
    }
    interface CreateHttpNamespaceRequest {
        var Name: NamespaceName
        var CreatorRequestId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ResourceDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateHttpNamespaceResponse {
        var OperationId: OperationId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePrivateDnsNamespaceRequest {
        var Name: NamespaceName
        var CreatorRequestId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ResourceDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Vpc: ResourceId
    }
    interface CreatePrivateDnsNamespaceResponse {
        var OperationId: OperationId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePublicDnsNamespaceRequest {
        var Name: NamespaceName
        var CreatorRequestId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ResourceDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePublicDnsNamespaceResponse {
        var OperationId: OperationId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateServiceRequest {
        var Name: ServiceName
        var NamespaceId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var CreatorRequestId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ResourceDescription?
            get() = definedExternally
            set(value) = definedExternally
        var DnsConfig: DnsConfig?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckConfig: HealthCheckConfig?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckCustomConfig: HealthCheckCustomConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateServiceResponse {
        var Service: Service?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteNamespaceRequest {
        var Id: ResourceId
    }
    interface DeleteNamespaceResponse {
        var OperationId: OperationId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteServiceRequest {
        var Id: ResourceId
    }
    interface DeleteServiceResponse
    interface DeregisterInstanceRequest {
        var ServiceId: ResourceId
        var InstanceId: ResourceId
    }
    interface DeregisterInstanceResponse {
        var OperationId: OperationId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DiscoverInstancesRequest {
        var NamespaceName: NamespaceName
        var ServiceName: ServiceName
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var QueryParameters: Attributes?
            get() = definedExternally
            set(value) = definedExternally
        var HealthStatus: String /* "HEALTHY" | "UNHEALTHY" | "ALL" | String */
    }
    interface DiscoverInstancesResponse {
        var Instances: HttpInstanceSummaryList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DnsConfig {
        var NamespaceId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var RoutingPolicy: String /* "MULTIVALUE" | "WEIGHTED" | String */
        var DnsRecords: DnsRecordList
    }
    interface DnsConfigChange {
        var DnsRecords: DnsRecordList
    }
    interface DnsProperties {
        var HostedZoneId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DnsRecord {
        var Type: String /* "SRV" | "A" | "AAAA" | "CNAME" | String */
        var TTL: RecordTTL
    }
    interface GetInstanceRequest {
        var ServiceId: ResourceId
        var InstanceId: ResourceId
    }
    interface GetInstanceResponse {
        var Instance: Instance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInstancesHealthStatusRequest {
        var ServiceId: ResourceId
        var Instances: InstanceIdList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInstancesHealthStatusResponse {
        var Status: InstanceHealthStatusMap?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetNamespaceRequest {
        var Id: ResourceId
    }
    interface GetNamespaceResponse {
        var Namespace: Namespace?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOperationRequest {
        var OperationId: ResourceId
    }
    interface GetOperationResponse {
        var Operation: Operation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetServiceRequest {
        var Id: ResourceId
    }
    interface GetServiceResponse {
        var Service: Service?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HealthCheckConfig {
        var Type: String /* "HTTP" | "HTTPS" | "TCP" | String */
        var ResourcePath: ResourcePath?
            get() = definedExternally
            set(value) = definedExternally
        var FailureThreshold: FailureThreshold?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HealthCheckCustomConfig {
        var FailureThreshold: FailureThreshold?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HttpInstanceSummary {
        var InstanceId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var NamespaceName: NamespaceName?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceName: ServiceName?
            get() = definedExternally
            set(value) = definedExternally
        var HealthStatus: String /* "HEALTHY" | "UNHEALTHY" | "UNKNOWN" | String */
        var Attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HttpProperties {
        var HttpName: NamespaceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Instance {
        var Id: ResourceId
        var CreatorRequestId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceHealthStatusMap {
        @nativeGetter
        operator fun get(key: String): String /* "HEALTHY" | "UNHEALTHY" | "UNKNOWN" | String */
        @nativeSetter
        operator fun set(key: String, value: String)
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface InstanceSummary {
        var Id: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInstancesRequest {
        var ServiceId: ResourceId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInstancesResponse {
        var Instances: InstanceSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListNamespacesRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: NamespaceFilters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListNamespacesResponse {
        var Namespaces: NamespaceSummariesList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOperationsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: OperationFilters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOperationsResponse {
        var Operations: OperationSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListServicesRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: ServiceFilters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListServicesResponse {
        var Services: ServiceSummariesList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Namespace {
        var Id: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NamespaceName?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "DNS_PUBLIC" | "DNS_PRIVATE" | "HTTP" | String */
        var Description: ResourceDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceCount: ResourceCount?
            get() = definedExternally
            set(value) = definedExternally
        var Properties: NamespaceProperties?
            get() = definedExternally
            set(value) = definedExternally
        var CreateDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreatorRequestId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NamespaceFilter {
        var Name: String /* "TYPE" | String */
        var Values: FilterValues
        var Condition: String /* "EQ" | "IN" | "BETWEEN" | String */
    }
    interface NamespaceProperties {
        var DnsProperties: DnsProperties?
            get() = definedExternally
            set(value) = definedExternally
        var HttpProperties: HttpProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NamespaceSummary {
        var Id: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NamespaceName?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "DNS_PUBLIC" | "DNS_PRIVATE" | "HTTP" | String */
        var Description: ResourceDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceCount: ResourceCount?
            get() = definedExternally
            set(value) = definedExternally
        var Properties: NamespaceProperties?
            get() = definedExternally
            set(value) = definedExternally
        var CreateDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Operation {
        var Id: OperationId?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "CREATE_NAMESPACE" | "DELETE_NAMESPACE" | "UPDATE_SERVICE" | "REGISTER_INSTANCE" | "DEREGISTER_INSTANCE" | String */
        var Status: String /* "SUBMITTED" | "PENDING" | "SUCCESS" | "FAIL" | String */
        var ErrorMessage: Message?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: Code?
            get() = definedExternally
            set(value) = definedExternally
        var CreateDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var UpdateDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: OperationTargetsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OperationFilter {
        var Name: String /* "NAMESPACE_ID" | "SERVICE_ID" | "STATUS" | "TYPE" | "UPDATE_DATE" | String */
        var Values: FilterValues
        var Condition: String /* "EQ" | "IN" | "BETWEEN" | String */
    }
    interface OperationSummary {
        var Id: OperationId?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "SUBMITTED" | "PENDING" | "SUCCESS" | "FAIL" | String */
    }
    interface OperationTargetsMap {
        @nativeGetter
        operator fun get(key: String): ResourceId?
        @nativeSetter
        operator fun set(key: String, value: ResourceId)
    }
    interface RegisterInstanceRequest {
        var ServiceId: ResourceId
        var InstanceId: ResourceId
        var CreatorRequestId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: Attributes
    }
    interface RegisterInstanceResponse {
        var OperationId: OperationId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Service {
        var Id: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ServiceName?
            get() = definedExternally
            set(value) = definedExternally
        var NamespaceId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ResourceDescription?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceCount: ResourceCount?
            get() = definedExternally
            set(value) = definedExternally
        var DnsConfig: DnsConfig?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckConfig: HealthCheckConfig?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckCustomConfig: HealthCheckCustomConfig?
            get() = definedExternally
            set(value) = definedExternally
        var CreateDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreatorRequestId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServiceChange {
        var Description: ResourceDescription?
            get() = definedExternally
            set(value) = definedExternally
        var DnsConfig: DnsConfigChange
        var HealthCheckConfig: HealthCheckConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServiceFilter {
        var Name: String /* "NAMESPACE_ID" | String */
        var Values: FilterValues
        var Condition: String /* "EQ" | "IN" | "BETWEEN" | String */
    }
    interface ServiceSummary {
        var Id: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ServiceName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ResourceDescription?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceCount: ResourceCount?
            get() = definedExternally
            set(value) = definedExternally
        var DnsConfig: DnsConfig?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckConfig: HealthCheckConfig?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckCustomConfig: HealthCheckCustomConfig?
            get() = definedExternally
            set(value) = definedExternally
        var CreateDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateInstanceCustomHealthStatusRequest {
        var ServiceId: ResourceId
        var InstanceId: ResourceId
        var Status: String /* "HEALTHY" | "UNHEALTHY" | String */
    }
    interface UpdateServiceRequest {
        var Id: ResourceId
        var Service: ServiceChange
    }
    interface UpdateServiceResponse {
        var OperationId: OperationId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-03-14" | "latest" | String */
    }
}