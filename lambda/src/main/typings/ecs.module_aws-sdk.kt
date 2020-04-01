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
import ECS.KeyValuePair
import ECS.AttachmentStateChange
import ECS.Attachment
import ECS.Attribute
import ECS.CapacityProviderStrategyItem
import ECS.CapacityProvider
import ECS.ClusterSetting
import ECS.Cluster
import ECS.ContainerDefinition
import ECS.ContainerDependency
import ECS.ContainerInstance
import ECS.ContainerOverride
import ECS.ContainerStateChange
import ECS.Container
import ECS.Deployment
import ECS.Device
import ECS.Failure
import ECS.HostEntry
import ECS.InferenceAcceleratorOverride
import ECS.InferenceAccelerator
import ECS.LoadBalancer
import ECS.MountPoint
import ECS.NetworkBinding
import ECS.NetworkInterface
import ECS.PlacementConstraint
import ECS.PlacementStrategy
import ECS.PlatformDevice
import ECS.PortMapping
import ECS.ResourceRequirement
import ECS.Resource
import ECS.Secret
import ECS.ServiceEvent
import ECS.ServiceRegistry
import ECS.Service
import ECS.Setting
import ECS.SystemControl
import ECS.Tag
import ECS.TaskDefinitionPlacementConstraint
import ECS.TaskSet
import ECS.Task
import ECS.Tmpfs
import ECS.Ulimit
import ECS.VolumeFrom
import ECS.Volume
import ECS.CreateCapacityProviderRequest
import ECS.CreateCapacityProviderResponse
import ECS.CreateClusterRequest
import ECS.CreateClusterResponse
import ECS.CreateServiceRequest
import ECS.CreateServiceResponse
import ECS.CreateTaskSetRequest
import ECS.CreateTaskSetResponse
import ECS.DeleteAccountSettingRequest
import ECS.DeleteAccountSettingResponse
import ECS.DeleteAttributesRequest
import ECS.DeleteAttributesResponse
import ECS.DeleteClusterRequest
import ECS.DeleteClusterResponse
import ECS.DeleteServiceRequest
import ECS.DeleteServiceResponse
import ECS.DeleteTaskSetRequest
import ECS.DeleteTaskSetResponse
import ECS.DeregisterContainerInstanceRequest
import ECS.DeregisterContainerInstanceResponse
import ECS.DeregisterTaskDefinitionRequest
import ECS.DeregisterTaskDefinitionResponse
import ECS.DescribeCapacityProvidersRequest
import ECS.DescribeCapacityProvidersResponse
import ECS.DescribeClustersRequest
import ECS.DescribeClustersResponse
import ECS.DescribeContainerInstancesRequest
import ECS.DescribeContainerInstancesResponse
import ECS.DescribeServicesRequest
import ECS.DescribeServicesResponse
import ECS.DescribeTaskDefinitionRequest
import ECS.DescribeTaskDefinitionResponse
import ECS.DescribeTaskSetsRequest
import ECS.DescribeTaskSetsResponse
import ECS.DescribeTasksRequest
import ECS.DescribeTasksResponse
import ECS.DiscoverPollEndpointRequest
import ECS.DiscoverPollEndpointResponse
import ECS.ListAccountSettingsRequest
import ECS.ListAccountSettingsResponse
import ECS.ListAttributesRequest
import ECS.ListAttributesResponse
import ECS.ListClustersRequest
import ECS.ListClustersResponse
import ECS.ListContainerInstancesRequest
import ECS.ListContainerInstancesResponse
import ECS.ListServicesRequest
import ECS.ListServicesResponse
import ECS.ListTagsForResourceRequest
import ECS.ListTagsForResourceResponse
import ECS.ListTaskDefinitionFamiliesRequest
import ECS.ListTaskDefinitionFamiliesResponse
import ECS.ListTaskDefinitionsRequest
import ECS.ListTaskDefinitionsResponse
import ECS.ListTasksRequest
import ECS.ListTasksResponse
import ECS.PutAccountSettingRequest
import ECS.PutAccountSettingResponse
import ECS.PutAccountSettingDefaultRequest
import ECS.PutAccountSettingDefaultResponse
import ECS.PutAttributesRequest
import ECS.PutAttributesResponse
import ECS.PutClusterCapacityProvidersRequest
import ECS.PutClusterCapacityProvidersResponse
import ECS.RegisterContainerInstanceRequest
import ECS.RegisterContainerInstanceResponse
import ECS.RegisterTaskDefinitionRequest
import ECS.RegisterTaskDefinitionResponse
import ECS.RunTaskRequest
import ECS.RunTaskResponse
import ECS.StartTaskRequest
import ECS.StartTaskResponse
import ECS.StopTaskRequest
import ECS.StopTaskResponse
import ECS.SubmitAttachmentStateChangesRequest
import ECS.SubmitAttachmentStateChangesResponse
import ECS.SubmitContainerStateChangeRequest
import ECS.SubmitContainerStateChangeResponse
import ECS.SubmitTaskStateChangeRequest
import ECS.SubmitTaskStateChangeResponse
import ECS.TagResourceRequest
import ECS.TagResourceResponse
import ECS.UntagResourceRequest
import ECS.UntagResourceResponse
import ECS.UpdateClusterSettingsRequest
import ECS.UpdateClusterSettingsResponse
import ECS.UpdateContainerAgentRequest
import ECS.UpdateContainerAgentResponse
import ECS.UpdateContainerInstancesStateRequest
import ECS.UpdateContainerInstancesStateResponse
import ECS.UpdateServiceRequest
import ECS.UpdateServiceResponse
import ECS.UpdateServicePrimaryTaskSetRequest
import ECS.UpdateServicePrimaryTaskSetResponse
import ECS.UpdateTaskSetRequest
import ECS.UpdateTaskSetResponse
import ECS.ManagedScaling
import ECS.AutoScalingGroupProvider
import ECS.RepositoryCredentials
import ECS.LinuxParameters
import ECS.DockerLabelsMap
import ECS.LogConfiguration
import ECS.HealthCheck
import ECS.FirelensConfiguration
import ECS.VersionInfo
import ECS.DeploymentConfiguration
import ECS.NetworkConfiguration
import ECS.DeploymentController
import ECS.Scale
import ECS.TaskDefinition
import ECS.StringMap
import ECS.FirelensConfigurationOptionsMap
import ECS.KernelCapabilities
import ECS.LogConfigurationOptionsMap
import ECS.AwsVpcConfiguration
import ECS.ProxyConfiguration
import ECS.TaskOverride
import ECS.HostVolumeProperties
import ECS.DockerVolumeConfiguration
import ECS.EFSVolumeConfiguration
import Service as _Service

typealias AttachmentDetails = Array<KeyValuePair>

typealias AttachmentStateChanges = Array<AttachmentStateChange>

typealias Attachments = Array<Attachment>

typealias Attributes = Array<Attribute>

typealias Boolean = Boolean

typealias BoxedBoolean = Boolean

typealias BoxedInteger = Number

typealias CapacityProviderFieldList = Array<String /* "TAGS" | String */>

typealias CapacityProviderStrategy = Array<CapacityProviderStrategyItem>

typealias CapacityProviderStrategyItemBase = Number

typealias CapacityProviderStrategyItemWeight = Number

typealias CapacityProviders = Array<CapacityProvider>

typealias ClusterFieldList = Array<String /* "ATTACHMENTS" | "SETTINGS" | "STATISTICS" | "TAGS" | String */>

typealias ClusterSettings = Array<ClusterSetting>

typealias Clusters = Array<Cluster>

typealias CompatibilityList = Array<String /* "EC2" | "FARGATE" | String */>

typealias ContainerDefinitions = Array<ContainerDefinition>

typealias ContainerDependencies = Array<ContainerDependency>

typealias ContainerInstanceFieldList = Array<String /* "TAGS" | String */>

typealias ContainerInstances = Array<ContainerInstance>

typealias ContainerOverrides = Array<ContainerOverride>

typealias ContainerStateChanges = Array<ContainerStateChange>

typealias Containers = Array<Container>

typealias Deployments = Array<Deployment>

typealias DeviceCgroupPermissions = Array<String /* "read" | "write" | "mknod" | String */>

typealias DevicesList = Array<Device>

typealias Double = Number

typealias EnvironmentVariables = Array<KeyValuePair>

typealias Failures = Array<Failure>

typealias GpuIds = Array<String>

typealias HostEntryList = Array<HostEntry>

typealias InferenceAcceleratorOverrides = Array<InferenceAcceleratorOverride>

typealias InferenceAccelerators = Array<InferenceAccelerator>

typealias Integer = Number

typealias LoadBalancers = Array<LoadBalancer>

typealias Long = Number

typealias ManagedScalingStepSize = Number

typealias ManagedScalingTargetCapacity = Number

typealias MountPointList = Array<MountPoint>

typealias NetworkBindings = Array<NetworkBinding>

typealias NetworkInterfaces = Array<NetworkInterface>

typealias PlacementConstraints = Array<PlacementConstraint>

typealias PlacementStrategies = Array<PlacementStrategy>

typealias PlatformDevices = Array<PlatformDevice>

typealias PortMappingList = Array<PortMapping>

typealias ProxyConfigurationProperties = Array<KeyValuePair>

typealias RequiresAttributes = Array<Attribute>

typealias ResourceRequirements = Array<ResourceRequirement>

typealias Resources = Array<Resource>

typealias SecretList = Array<Secret>

typealias ServiceEvents = Array<ServiceEvent>

typealias ServiceFieldList = Array<String /* "TAGS" | String */>

typealias ServiceRegistries = Array<ServiceRegistry>

typealias Services = Array<Service>

typealias Settings = Array<Setting>

typealias Statistics = Array<KeyValuePair>

typealias String = String

typealias StringList = Array<String>

typealias SystemControls = Array<SystemControl>

typealias TagKey = String

typealias TagKeys = Array<TagKey>

typealias TagValue = String

typealias Tags = Array<Tag>

typealias TaskDefinitionFieldList = Array<String /* "TAGS" | String */>

typealias TaskDefinitionPlacementConstraints = Array<TaskDefinitionPlacementConstraint>

typealias TaskFieldList = Array<String /* "TAGS" | String */>

typealias TaskSetFieldList = Array<String /* "TAGS" | String */>

typealias TaskSets = Array<TaskSet>

typealias Tasks = Array<Task>

typealias Timestamp = Date

typealias TmpfsList = Array<Tmpfs>

typealias UlimitList = Array<Ulimit>

typealias VolumeFromList = Array<VolumeFrom>

typealias VolumeList = Array<Volume>

@JsModule("aws-sdk")
external open class ECS(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : _Service {
    open var config: ConfigBase /* Config & ECS.Types.ClientConfiguration */
    open fun createCapacityProvider(params: CreateCapacityProviderRequest, callback: (err: AWSError, data: CreateCapacityProviderResponse) -> Unit = definedExternally): Request<CreateCapacityProviderResponse, AWSError>
    open fun createCapacityProvider(callback: (err: AWSError, data: CreateCapacityProviderResponse) -> Unit = definedExternally): Request<CreateCapacityProviderResponse, AWSError>
    open fun createCluster(params: CreateClusterRequest, callback: (err: AWSError, data: CreateClusterResponse) -> Unit = definedExternally): Request<CreateClusterResponse, AWSError>
    open fun createCluster(callback: (err: AWSError, data: CreateClusterResponse) -> Unit = definedExternally): Request<CreateClusterResponse, AWSError>
    open fun createService(params: CreateServiceRequest, callback: (err: AWSError, data: CreateServiceResponse) -> Unit = definedExternally): Request<CreateServiceResponse, AWSError>
    open fun createService(callback: (err: AWSError, data: CreateServiceResponse) -> Unit = definedExternally): Request<CreateServiceResponse, AWSError>
    open fun createTaskSet(params: CreateTaskSetRequest, callback: (err: AWSError, data: CreateTaskSetResponse) -> Unit = definedExternally): Request<CreateTaskSetResponse, AWSError>
    open fun createTaskSet(callback: (err: AWSError, data: CreateTaskSetResponse) -> Unit = definedExternally): Request<CreateTaskSetResponse, AWSError>
    open fun deleteAccountSetting(params: DeleteAccountSettingRequest, callback: (err: AWSError, data: DeleteAccountSettingResponse) -> Unit = definedExternally): Request<DeleteAccountSettingResponse, AWSError>
    open fun deleteAccountSetting(callback: (err: AWSError, data: DeleteAccountSettingResponse) -> Unit = definedExternally): Request<DeleteAccountSettingResponse, AWSError>
    open fun deleteAttributes(params: DeleteAttributesRequest, callback: (err: AWSError, data: DeleteAttributesResponse) -> Unit = definedExternally): Request<DeleteAttributesResponse, AWSError>
    open fun deleteAttributes(callback: (err: AWSError, data: DeleteAttributesResponse) -> Unit = definedExternally): Request<DeleteAttributesResponse, AWSError>
    open fun deleteCluster(params: DeleteClusterRequest, callback: (err: AWSError, data: DeleteClusterResponse) -> Unit = definedExternally): Request<DeleteClusterResponse, AWSError>
    open fun deleteCluster(callback: (err: AWSError, data: DeleteClusterResponse) -> Unit = definedExternally): Request<DeleteClusterResponse, AWSError>
    open fun deleteService(params: DeleteServiceRequest, callback: (err: AWSError, data: DeleteServiceResponse) -> Unit = definedExternally): Request<DeleteServiceResponse, AWSError>
    open fun deleteService(callback: (err: AWSError, data: DeleteServiceResponse) -> Unit = definedExternally): Request<DeleteServiceResponse, AWSError>
    open fun deleteTaskSet(params: DeleteTaskSetRequest, callback: (err: AWSError, data: DeleteTaskSetResponse) -> Unit = definedExternally): Request<DeleteTaskSetResponse, AWSError>
    open fun deleteTaskSet(callback: (err: AWSError, data: DeleteTaskSetResponse) -> Unit = definedExternally): Request<DeleteTaskSetResponse, AWSError>
    open fun deregisterContainerInstance(params: DeregisterContainerInstanceRequest, callback: (err: AWSError, data: DeregisterContainerInstanceResponse) -> Unit = definedExternally): Request<DeregisterContainerInstanceResponse, AWSError>
    open fun deregisterContainerInstance(callback: (err: AWSError, data: DeregisterContainerInstanceResponse) -> Unit = definedExternally): Request<DeregisterContainerInstanceResponse, AWSError>
    open fun deregisterTaskDefinition(params: DeregisterTaskDefinitionRequest, callback: (err: AWSError, data: DeregisterTaskDefinitionResponse) -> Unit = definedExternally): Request<DeregisterTaskDefinitionResponse, AWSError>
    open fun deregisterTaskDefinition(callback: (err: AWSError, data: DeregisterTaskDefinitionResponse) -> Unit = definedExternally): Request<DeregisterTaskDefinitionResponse, AWSError>
    open fun describeCapacityProviders(params: DescribeCapacityProvidersRequest, callback: (err: AWSError, data: DescribeCapacityProvidersResponse) -> Unit = definedExternally): Request<DescribeCapacityProvidersResponse, AWSError>
    open fun describeCapacityProviders(callback: (err: AWSError, data: DescribeCapacityProvidersResponse) -> Unit = definedExternally): Request<DescribeCapacityProvidersResponse, AWSError>
    open fun describeClusters(params: DescribeClustersRequest, callback: (err: AWSError, data: DescribeClustersResponse) -> Unit = definedExternally): Request<DescribeClustersResponse, AWSError>
    open fun describeClusters(callback: (err: AWSError, data: DescribeClustersResponse) -> Unit = definedExternally): Request<DescribeClustersResponse, AWSError>
    open fun describeContainerInstances(params: DescribeContainerInstancesRequest, callback: (err: AWSError, data: DescribeContainerInstancesResponse) -> Unit = definedExternally): Request<DescribeContainerInstancesResponse, AWSError>
    open fun describeContainerInstances(callback: (err: AWSError, data: DescribeContainerInstancesResponse) -> Unit = definedExternally): Request<DescribeContainerInstancesResponse, AWSError>
    open fun describeServices(params: DescribeServicesRequest, callback: (err: AWSError, data: DescribeServicesResponse) -> Unit = definedExternally): Request<DescribeServicesResponse, AWSError>
    open fun describeServices(callback: (err: AWSError, data: DescribeServicesResponse) -> Unit = definedExternally): Request<DescribeServicesResponse, AWSError>
    open fun describeTaskDefinition(params: DescribeTaskDefinitionRequest, callback: (err: AWSError, data: DescribeTaskDefinitionResponse) -> Unit = definedExternally): Request<DescribeTaskDefinitionResponse, AWSError>
    open fun describeTaskDefinition(callback: (err: AWSError, data: DescribeTaskDefinitionResponse) -> Unit = definedExternally): Request<DescribeTaskDefinitionResponse, AWSError>
    open fun describeTaskSets(params: DescribeTaskSetsRequest, callback: (err: AWSError, data: DescribeTaskSetsResponse) -> Unit = definedExternally): Request<DescribeTaskSetsResponse, AWSError>
    open fun describeTaskSets(callback: (err: AWSError, data: DescribeTaskSetsResponse) -> Unit = definedExternally): Request<DescribeTaskSetsResponse, AWSError>
    open fun describeTasks(params: DescribeTasksRequest, callback: (err: AWSError, data: DescribeTasksResponse) -> Unit = definedExternally): Request<DescribeTasksResponse, AWSError>
    open fun describeTasks(callback: (err: AWSError, data: DescribeTasksResponse) -> Unit = definedExternally): Request<DescribeTasksResponse, AWSError>
    open fun discoverPollEndpoint(params: DiscoverPollEndpointRequest, callback: (err: AWSError, data: DiscoverPollEndpointResponse) -> Unit = definedExternally): Request<DiscoverPollEndpointResponse, AWSError>
    open fun discoverPollEndpoint(callback: (err: AWSError, data: DiscoverPollEndpointResponse) -> Unit = definedExternally): Request<DiscoverPollEndpointResponse, AWSError>
    open fun listAccountSettings(params: ListAccountSettingsRequest, callback: (err: AWSError, data: ListAccountSettingsResponse) -> Unit = definedExternally): Request<ListAccountSettingsResponse, AWSError>
    open fun listAccountSettings(callback: (err: AWSError, data: ListAccountSettingsResponse) -> Unit = definedExternally): Request<ListAccountSettingsResponse, AWSError>
    open fun listAttributes(params: ListAttributesRequest, callback: (err: AWSError, data: ListAttributesResponse) -> Unit = definedExternally): Request<ListAttributesResponse, AWSError>
    open fun listAttributes(callback: (err: AWSError, data: ListAttributesResponse) -> Unit = definedExternally): Request<ListAttributesResponse, AWSError>
    open fun listClusters(params: ListClustersRequest, callback: (err: AWSError, data: ListClustersResponse) -> Unit = definedExternally): Request<ListClustersResponse, AWSError>
    open fun listClusters(callback: (err: AWSError, data: ListClustersResponse) -> Unit = definedExternally): Request<ListClustersResponse, AWSError>
    open fun listContainerInstances(params: ListContainerInstancesRequest, callback: (err: AWSError, data: ListContainerInstancesResponse) -> Unit = definedExternally): Request<ListContainerInstancesResponse, AWSError>
    open fun listContainerInstances(callback: (err: AWSError, data: ListContainerInstancesResponse) -> Unit = definedExternally): Request<ListContainerInstancesResponse, AWSError>
    open fun listServices(params: ListServicesRequest, callback: (err: AWSError, data: ListServicesResponse) -> Unit = definedExternally): Request<ListServicesResponse, AWSError>
    open fun listServices(callback: (err: AWSError, data: ListServicesResponse) -> Unit = definedExternally): Request<ListServicesResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTaskDefinitionFamilies(params: ListTaskDefinitionFamiliesRequest, callback: (err: AWSError, data: ListTaskDefinitionFamiliesResponse) -> Unit = definedExternally): Request<ListTaskDefinitionFamiliesResponse, AWSError>
    open fun listTaskDefinitionFamilies(callback: (err: AWSError, data: ListTaskDefinitionFamiliesResponse) -> Unit = definedExternally): Request<ListTaskDefinitionFamiliesResponse, AWSError>
    open fun listTaskDefinitions(params: ListTaskDefinitionsRequest, callback: (err: AWSError, data: ListTaskDefinitionsResponse) -> Unit = definedExternally): Request<ListTaskDefinitionsResponse, AWSError>
    open fun listTaskDefinitions(callback: (err: AWSError, data: ListTaskDefinitionsResponse) -> Unit = definedExternally): Request<ListTaskDefinitionsResponse, AWSError>
    open fun listTasks(params: ListTasksRequest, callback: (err: AWSError, data: ListTasksResponse) -> Unit = definedExternally): Request<ListTasksResponse, AWSError>
    open fun listTasks(callback: (err: AWSError, data: ListTasksResponse) -> Unit = definedExternally): Request<ListTasksResponse, AWSError>
    open fun putAccountSetting(params: PutAccountSettingRequest, callback: (err: AWSError, data: PutAccountSettingResponse) -> Unit = definedExternally): Request<PutAccountSettingResponse, AWSError>
    open fun putAccountSetting(callback: (err: AWSError, data: PutAccountSettingResponse) -> Unit = definedExternally): Request<PutAccountSettingResponse, AWSError>
    open fun putAccountSettingDefault(params: PutAccountSettingDefaultRequest, callback: (err: AWSError, data: PutAccountSettingDefaultResponse) -> Unit = definedExternally): Request<PutAccountSettingDefaultResponse, AWSError>
    open fun putAccountSettingDefault(callback: (err: AWSError, data: PutAccountSettingDefaultResponse) -> Unit = definedExternally): Request<PutAccountSettingDefaultResponse, AWSError>
    open fun putAttributes(params: PutAttributesRequest, callback: (err: AWSError, data: PutAttributesResponse) -> Unit = definedExternally): Request<PutAttributesResponse, AWSError>
    open fun putAttributes(callback: (err: AWSError, data: PutAttributesResponse) -> Unit = definedExternally): Request<PutAttributesResponse, AWSError>
    open fun putClusterCapacityProviders(params: PutClusterCapacityProvidersRequest, callback: (err: AWSError, data: PutClusterCapacityProvidersResponse) -> Unit = definedExternally): Request<PutClusterCapacityProvidersResponse, AWSError>
    open fun putClusterCapacityProviders(callback: (err: AWSError, data: PutClusterCapacityProvidersResponse) -> Unit = definedExternally): Request<PutClusterCapacityProvidersResponse, AWSError>
    open fun registerContainerInstance(params: RegisterContainerInstanceRequest, callback: (err: AWSError, data: RegisterContainerInstanceResponse) -> Unit = definedExternally): Request<RegisterContainerInstanceResponse, AWSError>
    open fun registerContainerInstance(callback: (err: AWSError, data: RegisterContainerInstanceResponse) -> Unit = definedExternally): Request<RegisterContainerInstanceResponse, AWSError>
    open fun registerTaskDefinition(params: RegisterTaskDefinitionRequest, callback: (err: AWSError, data: RegisterTaskDefinitionResponse) -> Unit = definedExternally): Request<RegisterTaskDefinitionResponse, AWSError>
    open fun registerTaskDefinition(callback: (err: AWSError, data: RegisterTaskDefinitionResponse) -> Unit = definedExternally): Request<RegisterTaskDefinitionResponse, AWSError>
    open fun runTask(params: RunTaskRequest, callback: (err: AWSError, data: RunTaskResponse) -> Unit = definedExternally): Request<RunTaskResponse, AWSError>
    open fun runTask(callback: (err: AWSError, data: RunTaskResponse) -> Unit = definedExternally): Request<RunTaskResponse, AWSError>
    open fun startTask(params: StartTaskRequest, callback: (err: AWSError, data: StartTaskResponse) -> Unit = definedExternally): Request<StartTaskResponse, AWSError>
    open fun startTask(callback: (err: AWSError, data: StartTaskResponse) -> Unit = definedExternally): Request<StartTaskResponse, AWSError>
    open fun stopTask(params: StopTaskRequest, callback: (err: AWSError, data: StopTaskResponse) -> Unit = definedExternally): Request<StopTaskResponse, AWSError>
    open fun stopTask(callback: (err: AWSError, data: StopTaskResponse) -> Unit = definedExternally): Request<StopTaskResponse, AWSError>
    open fun submitAttachmentStateChanges(params: SubmitAttachmentStateChangesRequest, callback: (err: AWSError, data: SubmitAttachmentStateChangesResponse) -> Unit = definedExternally): Request<SubmitAttachmentStateChangesResponse, AWSError>
    open fun submitAttachmentStateChanges(callback: (err: AWSError, data: SubmitAttachmentStateChangesResponse) -> Unit = definedExternally): Request<SubmitAttachmentStateChangesResponse, AWSError>
    open fun submitContainerStateChange(params: SubmitContainerStateChangeRequest, callback: (err: AWSError, data: SubmitContainerStateChangeResponse) -> Unit = definedExternally): Request<SubmitContainerStateChangeResponse, AWSError>
    open fun submitContainerStateChange(callback: (err: AWSError, data: SubmitContainerStateChangeResponse) -> Unit = definedExternally): Request<SubmitContainerStateChangeResponse, AWSError>
    open fun submitTaskStateChange(params: SubmitTaskStateChangeRequest, callback: (err: AWSError, data: SubmitTaskStateChangeResponse) -> Unit = definedExternally): Request<SubmitTaskStateChangeResponse, AWSError>
    open fun submitTaskStateChange(callback: (err: AWSError, data: SubmitTaskStateChangeResponse) -> Unit = definedExternally): Request<SubmitTaskStateChangeResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateClusterSettings(params: UpdateClusterSettingsRequest, callback: (err: AWSError, data: UpdateClusterSettingsResponse) -> Unit = definedExternally): Request<UpdateClusterSettingsResponse, AWSError>
    open fun updateClusterSettings(callback: (err: AWSError, data: UpdateClusterSettingsResponse) -> Unit = definedExternally): Request<UpdateClusterSettingsResponse, AWSError>
    open fun updateContainerAgent(params: UpdateContainerAgentRequest, callback: (err: AWSError, data: UpdateContainerAgentResponse) -> Unit = definedExternally): Request<UpdateContainerAgentResponse, AWSError>
    open fun updateContainerAgent(callback: (err: AWSError, data: UpdateContainerAgentResponse) -> Unit = definedExternally): Request<UpdateContainerAgentResponse, AWSError>
    open fun updateContainerInstancesState(params: UpdateContainerInstancesStateRequest, callback: (err: AWSError, data: UpdateContainerInstancesStateResponse) -> Unit = definedExternally): Request<UpdateContainerInstancesStateResponse, AWSError>
    open fun updateContainerInstancesState(callback: (err: AWSError, data: UpdateContainerInstancesStateResponse) -> Unit = definedExternally): Request<UpdateContainerInstancesStateResponse, AWSError>
    open fun updateService(params: UpdateServiceRequest, callback: (err: AWSError, data: UpdateServiceResponse) -> Unit = definedExternally): Request<UpdateServiceResponse, AWSError>
    open fun updateService(callback: (err: AWSError, data: UpdateServiceResponse) -> Unit = definedExternally): Request<UpdateServiceResponse, AWSError>
    open fun updateServicePrimaryTaskSet(params: UpdateServicePrimaryTaskSetRequest, callback: (err: AWSError, data: UpdateServicePrimaryTaskSetResponse) -> Unit = definedExternally): Request<UpdateServicePrimaryTaskSetResponse, AWSError>
    open fun updateServicePrimaryTaskSet(callback: (err: AWSError, data: UpdateServicePrimaryTaskSetResponse) -> Unit = definedExternally): Request<UpdateServicePrimaryTaskSetResponse, AWSError>
    open fun updateTaskSet(params: UpdateTaskSetRequest, callback: (err: AWSError, data: UpdateTaskSetResponse) -> Unit = definedExternally): Request<UpdateTaskSetResponse, AWSError>
    open fun updateTaskSet(callback: (err: AWSError, data: UpdateTaskSetResponse) -> Unit = definedExternally): Request<UpdateTaskSetResponse, AWSError>
    open fun waitFor(state: String, params: DescribeTasksRequest, callback: (err: AWSError, data: DescribeTasksResponse) -> Unit = definedExternally): Request<DescribeTasksResponse, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DescribeTasksResponse) -> Unit = definedExternally): Request<DescribeTasksResponse, AWSError>
    open fun waitFor(state: String, params: DescribeServicesRequest, callback: (err: AWSError, data: DescribeServicesResponse) -> Unit = definedExternally): Request<DescribeServicesResponse, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DescribeServicesResponse) -> Unit = definedExternally): Request<DescribeServicesResponse, AWSError>
    interface Attachment {
        var id: String?
            get() = definedExternally
            set(value) = definedExternally
        var type: String?
            get() = definedExternally
            set(value) = definedExternally
        var status: String?
            get() = definedExternally
            set(value) = definedExternally
        var details: AttachmentDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttachmentStateChange {
        var attachmentArn: String
        var status: String
    }
    interface Attribute {
        var name: String
        var value: String?
            get() = definedExternally
            set(value) = definedExternally
        var targetType: String /* "container-instance" | String */
        var targetId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoScalingGroupProvider {
        var autoScalingGroupArn: String
        var managedScaling: ManagedScaling?
            get() = definedExternally
            set(value) = definedExternally
        var managedTerminationProtection: String /* "ENABLED" | "DISABLED" | String */
    }
    interface AwsVpcConfiguration {
        var subnets: StringList
        var securityGroups: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var assignPublicIp: String /* "ENABLED" | "DISABLED" | String */
    }
    interface CapacityProvider {
        var capacityProviderArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "ACTIVE" | String */
        var autoScalingGroupProvider: AutoScalingGroupProvider?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CapacityProviderStrategyItem {
        var capacityProvider: String
        var weight: CapacityProviderStrategyItemWeight?
            get() = definedExternally
            set(value) = definedExternally
        var base: CapacityProviderStrategyItemBase?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Cluster {
        var clusterArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var clusterName: String?
            get() = definedExternally
            set(value) = definedExternally
        var status: String?
            get() = definedExternally
            set(value) = definedExternally
        var registeredContainerInstancesCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var runningTasksCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var pendingTasksCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var activeServicesCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var statistics: Statistics?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var settings: ClusterSettings?
            get() = definedExternally
            set(value) = definedExternally
        var capacityProviders: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var defaultCapacityProviderStrategy: CapacityProviderStrategy?
            get() = definedExternally
            set(value) = definedExternally
        var attachments: Attachments?
            get() = definedExternally
            set(value) = definedExternally
        var attachmentsStatus: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterSetting {
        var name: String /* "containerInsights" | String */
        var value: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Container {
        var containerArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var taskArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var image: String?
            get() = definedExternally
            set(value) = definedExternally
        var imageDigest: String?
            get() = definedExternally
            set(value) = definedExternally
        var runtimeId: String?
            get() = definedExternally
            set(value) = definedExternally
        var lastStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var exitCode: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var reason: String?
            get() = definedExternally
            set(value) = definedExternally
        var networkBindings: NetworkBindings?
            get() = definedExternally
            set(value) = definedExternally
        var networkInterfaces: NetworkInterfaces?
            get() = definedExternally
            set(value) = definedExternally
        var healthStatus: String /* "HEALTHY" | "UNHEALTHY" | "UNKNOWN" | String */
        var cpu: String?
            get() = definedExternally
            set(value) = definedExternally
        var memory: String?
            get() = definedExternally
            set(value) = definedExternally
        var memoryReservation: String?
            get() = definedExternally
            set(value) = definedExternally
        var gpuIds: GpuIds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContainerDefinition {
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var image: String?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryCredentials: RepositoryCredentials?
            get() = definedExternally
            set(value) = definedExternally
        var cpu: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var memory: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var memoryReservation: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var links: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var portMappings: PortMappingList?
            get() = definedExternally
            set(value) = definedExternally
        var essential: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var entryPoint: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var command: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var environment: EnvironmentVariables?
            get() = definedExternally
            set(value) = definedExternally
        var mountPoints: MountPointList?
            get() = definedExternally
            set(value) = definedExternally
        var volumesFrom: VolumeFromList?
            get() = definedExternally
            set(value) = definedExternally
        var linuxParameters: LinuxParameters?
            get() = definedExternally
            set(value) = definedExternally
        var secrets: SecretList?
            get() = definedExternally
            set(value) = definedExternally
        var dependsOn: ContainerDependencies?
            get() = definedExternally
            set(value) = definedExternally
        var startTimeout: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var stopTimeout: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var hostname: String?
            get() = definedExternally
            set(value) = definedExternally
        var user: String?
            get() = definedExternally
            set(value) = definedExternally
        var workingDirectory: String?
            get() = definedExternally
            set(value) = definedExternally
        var disableNetworking: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var privileged: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var readonlyRootFilesystem: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var dnsServers: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var dnsSearchDomains: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var extraHosts: HostEntryList?
            get() = definedExternally
            set(value) = definedExternally
        var dockerSecurityOptions: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var interactive: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var pseudoTerminal: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var dockerLabels: DockerLabelsMap?
            get() = definedExternally
            set(value) = definedExternally
        var ulimits: UlimitList?
            get() = definedExternally
            set(value) = definedExternally
        var logConfiguration: LogConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var healthCheck: HealthCheck?
            get() = definedExternally
            set(value) = definedExternally
        var systemControls: SystemControls?
            get() = definedExternally
            set(value) = definedExternally
        var resourceRequirements: ResourceRequirements?
            get() = definedExternally
            set(value) = definedExternally
        var firelensConfiguration: FirelensConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContainerDependency {
        var containerName: String
        var condition: String /* "START" | "COMPLETE" | "SUCCESS" | "HEALTHY" | String */
    }
    interface ContainerInstance {
        var containerInstanceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ec2InstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var capacityProviderName: String?
            get() = definedExternally
            set(value) = definedExternally
        var version: Long?
            get() = definedExternally
            set(value) = definedExternally
        var versionInfo: VersionInfo?
            get() = definedExternally
            set(value) = definedExternally
        var remainingResources: Resources?
            get() = definedExternally
            set(value) = definedExternally
        var registeredResources: Resources?
            get() = definedExternally
            set(value) = definedExternally
        var status: String?
            get() = definedExternally
            set(value) = definedExternally
        var statusReason: String?
            get() = definedExternally
            set(value) = definedExternally
        var agentConnected: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var runningTasksCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var pendingTasksCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var agentUpdateStatus: String /* "PENDING" | "STAGING" | "STAGED" | "UPDATING" | "UPDATED" | "FAILED" | String */
        var attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
        var registeredAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var attachments: Attachments?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContainerOverride {
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var command: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var environment: EnvironmentVariables?
            get() = definedExternally
            set(value) = definedExternally
        var cpu: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var memory: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var memoryReservation: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var resourceRequirements: ResourceRequirements?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContainerStateChange {
        var containerName: String?
            get() = definedExternally
            set(value) = definedExternally
        var imageDigest: String?
            get() = definedExternally
            set(value) = definedExternally
        var runtimeId: String?
            get() = definedExternally
            set(value) = definedExternally
        var exitCode: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var networkBindings: NetworkBindings?
            get() = definedExternally
            set(value) = definedExternally
        var reason: String?
            get() = definedExternally
            set(value) = definedExternally
        var status: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCapacityProviderRequest {
        var name: String
        var autoScalingGroupProvider: AutoScalingGroupProvider
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCapacityProviderResponse {
        var capacityProvider: CapacityProvider?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClusterRequest {
        var clusterName: String?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var settings: ClusterSettings?
            get() = definedExternally
            set(value) = definedExternally
        var capacityProviders: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var defaultCapacityProviderStrategy: CapacityProviderStrategy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClusterResponse {
        var cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateServiceRequest {
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
        var serviceName: String
        var taskDefinition: String?
            get() = definedExternally
            set(value) = definedExternally
        var loadBalancers: LoadBalancers?
            get() = definedExternally
            set(value) = definedExternally
        var serviceRegistries: ServiceRegistries?
            get() = definedExternally
            set(value) = definedExternally
        var desiredCount: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var launchType: String /* "EC2" | "FARGATE" | String */
        var capacityProviderStrategy: CapacityProviderStrategy?
            get() = definedExternally
            set(value) = definedExternally
        var platformVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var role: String?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentConfiguration: DeploymentConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var placementConstraints: PlacementConstraints?
            get() = definedExternally
            set(value) = definedExternally
        var placementStrategy: PlacementStrategies?
            get() = definedExternally
            set(value) = definedExternally
        var networkConfiguration: NetworkConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var healthCheckGracePeriodSeconds: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var schedulingStrategy: String /* "REPLICA" | "DAEMON" | String */
        var deploymentController: DeploymentController?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var enableECSManagedTags: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var propagateTags: String /* "TASK_DEFINITION" | "SERVICE" | String */
    }
    interface CreateServiceResponse {
        var service: Service?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTaskSetRequest {
        var service: String
        var cluster: String
        var externalId: String?
            get() = definedExternally
            set(value) = definedExternally
        var taskDefinition: String
        var networkConfiguration: NetworkConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var loadBalancers: LoadBalancers?
            get() = definedExternally
            set(value) = definedExternally
        var serviceRegistries: ServiceRegistries?
            get() = definedExternally
            set(value) = definedExternally
        var launchType: String /* "EC2" | "FARGATE" | String */
        var capacityProviderStrategy: CapacityProviderStrategy?
            get() = definedExternally
            set(value) = definedExternally
        var platformVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var scale: Scale?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTaskSetResponse {
        var taskSet: TaskSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAccountSettingRequest {
        var name: String /* "serviceLongArnFormat" | "taskLongArnFormat" | "containerInstanceLongArnFormat" | "awsvpcTrunking" | "containerInsights" | String */
        var principalArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAccountSettingResponse {
        var setting: Setting?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAttributesRequest {
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
        var attributes: Attributes
    }
    interface DeleteAttributesResponse {
        var attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteClusterRequest {
        var cluster: String
    }
    interface DeleteClusterResponse {
        var cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteServiceRequest {
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
        var service: String
        var force: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteServiceResponse {
        var service: Service?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteTaskSetRequest {
        var cluster: String
        var service: String
        var taskSet: String
        var force: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteTaskSetResponse {
        var taskSet: TaskSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Deployment {
        var id: String?
            get() = definedExternally
            set(value) = definedExternally
        var status: String?
            get() = definedExternally
            set(value) = definedExternally
        var taskDefinition: String?
            get() = definedExternally
            set(value) = definedExternally
        var desiredCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var pendingCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var runningCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var updatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var capacityProviderStrategy: CapacityProviderStrategy?
            get() = definedExternally
            set(value) = definedExternally
        var launchType: String /* "EC2" | "FARGATE" | String */
        var platformVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var networkConfiguration: NetworkConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeploymentConfiguration {
        var maximumPercent: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var minimumHealthyPercent: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeploymentController {
        var type: String /* "ECS" | "CODE_DEPLOY" | "EXTERNAL" | String */
    }
    interface DeregisterContainerInstanceRequest {
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
        var containerInstance: String
        var force: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeregisterContainerInstanceResponse {
        var containerInstance: ContainerInstance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeregisterTaskDefinitionRequest {
        var taskDefinition: String
    }
    interface DeregisterTaskDefinitionResponse {
        var taskDefinition: TaskDefinition?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCapacityProvidersRequest {
        var capacityProviders: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var include: CapacityProviderFieldList?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCapacityProvidersResponse {
        var capacityProviders: CapacityProviders?
            get() = definedExternally
            set(value) = definedExternally
        var failures: Failures?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeClustersRequest {
        var clusters: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var include: ClusterFieldList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeClustersResponse {
        var clusters: Clusters?
            get() = definedExternally
            set(value) = definedExternally
        var failures: Failures?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeContainerInstancesRequest {
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
        var containerInstances: StringList
        var include: ContainerInstanceFieldList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeContainerInstancesResponse {
        var containerInstances: ContainerInstances?
            get() = definedExternally
            set(value) = definedExternally
        var failures: Failures?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeServicesRequest {
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
        var services: StringList
        var include: ServiceFieldList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeServicesResponse {
        var services: Services?
            get() = definedExternally
            set(value) = definedExternally
        var failures: Failures?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTaskDefinitionRequest {
        var taskDefinition: String
        var include: TaskDefinitionFieldList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTaskDefinitionResponse {
        var taskDefinition: TaskDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTaskSetsRequest {
        var cluster: String
        var service: String
        var taskSets: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var include: TaskSetFieldList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTaskSetsResponse {
        var taskSets: TaskSets?
            get() = definedExternally
            set(value) = definedExternally
        var failures: Failures?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTasksRequest {
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
        var tasks: StringList
        var include: TaskFieldList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTasksResponse {
        var tasks: Tasks?
            get() = definedExternally
            set(value) = definedExternally
        var failures: Failures?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Device {
        var hostPath: String
        var containerPath: String?
            get() = definedExternally
            set(value) = definedExternally
        var permissions: DeviceCgroupPermissions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DiscoverPollEndpointRequest {
        var containerInstance: String?
            get() = definedExternally
            set(value) = definedExternally
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DiscoverPollEndpointResponse {
        var endpoint: String?
            get() = definedExternally
            set(value) = definedExternally
        var telemetryEndpoint: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DockerLabelsMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface DockerVolumeConfiguration {
        var scope: String /* "task" | "shared" | String */
        var autoprovision: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var driver: String?
            get() = definedExternally
            set(value) = definedExternally
        var driverOpts: StringMap?
            get() = definedExternally
            set(value) = definedExternally
        var labels: StringMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EFSVolumeConfiguration {
        var fileSystemId: String
        var rootDirectory: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Failure {
        var arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var reason: String?
            get() = definedExternally
            set(value) = definedExternally
        var detail: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FirelensConfiguration {
        var type: String /* "fluentd" | "fluentbit" | String */
        var options: FirelensConfigurationOptionsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FirelensConfigurationOptionsMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface HealthCheck {
        var command: StringList
        var interval: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var timeout: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var retries: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var startPeriod: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HostEntry {
        var hostname: String
        var ipAddress: String
    }
    interface HostVolumeProperties {
        var sourcePath: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InferenceAccelerator {
        var deviceName: String
        var deviceType: String
    }
    interface InferenceAcceleratorOverride {
        var deviceName: String?
            get() = definedExternally
            set(value) = definedExternally
        var deviceType: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KernelCapabilities {
        var add: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var drop: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KeyValuePair {
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var value: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LinuxParameters {
        var capabilities: KernelCapabilities?
            get() = definedExternally
            set(value) = definedExternally
        var devices: DevicesList?
            get() = definedExternally
            set(value) = definedExternally
        var initProcessEnabled: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var sharedMemorySize: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var tmpfs: TmpfsList?
            get() = definedExternally
            set(value) = definedExternally
        var maxSwap: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var swappiness: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAccountSettingsRequest {
        var name: String /* "serviceLongArnFormat" | "taskLongArnFormat" | "containerInstanceLongArnFormat" | "awsvpcTrunking" | "containerInsights" | String */
        var value: String?
            get() = definedExternally
            set(value) = definedExternally
        var principalArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var effectiveSettings: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAccountSettingsResponse {
        var settings: Settings?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAttributesRequest {
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
        var targetType: String /* "container-instance" | String */
        var attributeName: String?
            get() = definedExternally
            set(value) = definedExternally
        var attributeValue: String?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAttributesResponse {
        var attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListClustersRequest {
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListClustersResponse {
        var clusterArns: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListContainerInstancesRequest {
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
        var filter: String?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "ACTIVE" | "DRAINING" | "REGISTERING" | "DEREGISTERING" | "REGISTRATION_FAILED" | String */
    }
    interface ListContainerInstancesResponse {
        var containerInstanceArns: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListServicesRequest {
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var launchType: String /* "EC2" | "FARGATE" | String */
        var schedulingStrategy: String /* "REPLICA" | "DAEMON" | String */
    }
    interface ListServicesResponse {
        var serviceArns: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var resourceArn: String
    }
    interface ListTagsForResourceResponse {
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTaskDefinitionFamiliesRequest {
        var familyPrefix: String?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "ACTIVE" | "INACTIVE" | "ALL" | String */
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTaskDefinitionFamiliesResponse {
        var families: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTaskDefinitionsRequest {
        var familyPrefix: String?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "ACTIVE" | "INACTIVE" | String */
        var sort: String /* "ASC" | "DESC" | String */
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTaskDefinitionsResponse {
        var taskDefinitionArns: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTasksRequest {
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
        var containerInstance: String?
            get() = definedExternally
            set(value) = definedExternally
        var family: String?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var startedBy: String?
            get() = definedExternally
            set(value) = definedExternally
        var serviceName: String?
            get() = definedExternally
            set(value) = definedExternally
        var desiredStatus: String /* "RUNNING" | "PENDING" | "STOPPED" | String */
        var launchType: String /* "EC2" | "FARGATE" | String */
    }
    interface ListTasksResponse {
        var taskArns: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoadBalancer {
        var targetGroupArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var loadBalancerName: String?
            get() = definedExternally
            set(value) = definedExternally
        var containerName: String?
            get() = definedExternally
            set(value) = definedExternally
        var containerPort: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogConfiguration {
        var logDriver: String /* "json-file" | "syslog" | "journald" | "gelf" | "fluentd" | "awslogs" | "splunk" | "awsfirelens" | String */
        var options: LogConfigurationOptionsMap?
            get() = definedExternally
            set(value) = definedExternally
        var secretOptions: SecretList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogConfigurationOptionsMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface ManagedScaling {
        var status: String /* "ENABLED" | "DISABLED" | String */
        var targetCapacity: ManagedScalingTargetCapacity?
            get() = definedExternally
            set(value) = definedExternally
        var minimumScalingStepSize: ManagedScalingStepSize?
            get() = definedExternally
            set(value) = definedExternally
        var maximumScalingStepSize: ManagedScalingStepSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MountPoint {
        var sourceVolume: String?
            get() = definedExternally
            set(value) = definedExternally
        var containerPath: String?
            get() = definedExternally
            set(value) = definedExternally
        var readOnly: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NetworkBinding {
        var bindIP: String?
            get() = definedExternally
            set(value) = definedExternally
        var containerPort: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var hostPort: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var protocol: String /* "tcp" | "udp" | String */
    }
    interface NetworkConfiguration {
        var awsvpcConfiguration: AwsVpcConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NetworkInterface {
        var attachmentId: String?
            get() = definedExternally
            set(value) = definedExternally
        var privateIpv4Address: String?
            get() = definedExternally
            set(value) = definedExternally
        var ipv6Address: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PlacementConstraint {
        var type: String /* "distinctInstance" | "memberOf" | String */
        var expression: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PlacementStrategy {
        var type: String /* "random" | "spread" | "binpack" | String */
        var field: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PlatformDevice {
        var id: String
        var type: String /* "GPU" | String */
    }
    interface PortMapping {
        var containerPort: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var hostPort: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var protocol: String /* "tcp" | "udp" | String */
    }
    interface ProxyConfiguration {
        var type: String /* "APPMESH" | String */
        var containerName: String
        var properties: ProxyConfigurationProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutAccountSettingDefaultRequest {
        var name: String /* "serviceLongArnFormat" | "taskLongArnFormat" | "containerInstanceLongArnFormat" | "awsvpcTrunking" | "containerInsights" | String */
        var value: String
    }
    interface PutAccountSettingDefaultResponse {
        var setting: Setting?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutAccountSettingRequest {
        var name: String /* "serviceLongArnFormat" | "taskLongArnFormat" | "containerInstanceLongArnFormat" | "awsvpcTrunking" | "containerInsights" | String */
        var value: String
        var principalArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutAccountSettingResponse {
        var setting: Setting?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutAttributesRequest {
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
        var attributes: Attributes
    }
    interface PutAttributesResponse {
        var attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutClusterCapacityProvidersRequest {
        var cluster: String
        var capacityProviders: StringList
        var defaultCapacityProviderStrategy: CapacityProviderStrategy
    }
    interface PutClusterCapacityProvidersResponse {
        var cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterContainerInstanceRequest {
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
        var instanceIdentityDocument: String?
            get() = definedExternally
            set(value) = definedExternally
        var instanceIdentityDocumentSignature: String?
            get() = definedExternally
            set(value) = definedExternally
        var totalResources: Resources?
            get() = definedExternally
            set(value) = definedExternally
        var versionInfo: VersionInfo?
            get() = definedExternally
            set(value) = definedExternally
        var containerInstanceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
        var platformDevices: PlatformDevices?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterContainerInstanceResponse {
        var containerInstance: ContainerInstance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterTaskDefinitionRequest {
        var family: String
        var taskRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var executionRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var networkMode: String /* "bridge" | "host" | "awsvpc" | "none" | String */
        var containerDefinitions: ContainerDefinitions
        var volumes: VolumeList?
            get() = definedExternally
            set(value) = definedExternally
        var placementConstraints: TaskDefinitionPlacementConstraints?
            get() = definedExternally
            set(value) = definedExternally
        var requiresCompatibilities: CompatibilityList?
            get() = definedExternally
            set(value) = definedExternally
        var cpu: String?
            get() = definedExternally
            set(value) = definedExternally
        var memory: String?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var pidMode: String /* "host" | "task" | String */
        var ipcMode: String /* "host" | "task" | "none" | String */
        var proxyConfiguration: ProxyConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var inferenceAccelerators: InferenceAccelerators?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterTaskDefinitionResponse {
        var taskDefinition: TaskDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RepositoryCredentials {
        var credentialsParameter: String
    }
    interface Resource {
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var type: String?
            get() = definedExternally
            set(value) = definedExternally
        var doubleValue: Double?
            get() = definedExternally
            set(value) = definedExternally
        var longValue: Long?
            get() = definedExternally
            set(value) = definedExternally
        var integerValue: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var stringSetValue: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceRequirement {
        var value: String
        var type: String /* "GPU" | "InferenceAccelerator" | String */
    }
    interface RunTaskRequest {
        var capacityProviderStrategy: CapacityProviderStrategy?
            get() = definedExternally
            set(value) = definedExternally
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
        var count: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var enableECSManagedTags: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var group: String?
            get() = definedExternally
            set(value) = definedExternally
        var launchType: String /* "EC2" | "FARGATE" | String */
        var networkConfiguration: NetworkConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var overrides: TaskOverride?
            get() = definedExternally
            set(value) = definedExternally
        var placementConstraints: PlacementConstraints?
            get() = definedExternally
            set(value) = definedExternally
        var placementStrategy: PlacementStrategies?
            get() = definedExternally
            set(value) = definedExternally
        var platformVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var propagateTags: String /* "TASK_DEFINITION" | "SERVICE" | String */
        var referenceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var startedBy: String?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var taskDefinition: String
    }
    interface RunTaskResponse {
        var tasks: Tasks?
            get() = definedExternally
            set(value) = definedExternally
        var failures: Failures?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Scale {
        var value: Double?
            get() = definedExternally
            set(value) = definedExternally
        var unit: String /* "PERCENT" | String */
    }
    interface Secret {
        var name: String
        var valueFrom: String
    }
    interface Service {
        var serviceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var serviceName: String?
            get() = definedExternally
            set(value) = definedExternally
        var clusterArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var loadBalancers: LoadBalancers?
            get() = definedExternally
            set(value) = definedExternally
        var serviceRegistries: ServiceRegistries?
            get() = definedExternally
            set(value) = definedExternally
        var status: String?
            get() = definedExternally
            set(value) = definedExternally
        var desiredCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var runningCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var pendingCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var launchType: String /* "EC2" | "FARGATE" | String */
        var capacityProviderStrategy: CapacityProviderStrategy?
            get() = definedExternally
            set(value) = definedExternally
        var platformVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var taskDefinition: String?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentConfiguration: DeploymentConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var taskSets: TaskSets?
            get() = definedExternally
            set(value) = definedExternally
        var deployments: Deployments?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var events: ServiceEvents?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var placementConstraints: PlacementConstraints?
            get() = definedExternally
            set(value) = definedExternally
        var placementStrategy: PlacementStrategies?
            get() = definedExternally
            set(value) = definedExternally
        var networkConfiguration: NetworkConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var healthCheckGracePeriodSeconds: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var schedulingStrategy: String /* "REPLICA" | "DAEMON" | String */
        var deploymentController: DeploymentController?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var createdBy: String?
            get() = definedExternally
            set(value) = definedExternally
        var enableECSManagedTags: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var propagateTags: String /* "TASK_DEFINITION" | "SERVICE" | String */
    }
    interface ServiceEvent {
        var id: String?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServiceRegistry {
        var registryArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var port: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var containerName: String?
            get() = definedExternally
            set(value) = definedExternally
        var containerPort: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Setting {
        var name: String /* "serviceLongArnFormat" | "taskLongArnFormat" | "containerInstanceLongArnFormat" | "awsvpcTrunking" | "containerInsights" | String */
        var value: String?
            get() = definedExternally
            set(value) = definedExternally
        var principalArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartTaskRequest {
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
        var containerInstances: StringList
        var enableECSManagedTags: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var group: String?
            get() = definedExternally
            set(value) = definedExternally
        var networkConfiguration: NetworkConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var overrides: TaskOverride?
            get() = definedExternally
            set(value) = definedExternally
        var propagateTags: String /* "TASK_DEFINITION" | "SERVICE" | String */
        var referenceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var startedBy: String?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var taskDefinition: String
    }
    interface StartTaskResponse {
        var tasks: Tasks?
            get() = definedExternally
            set(value) = definedExternally
        var failures: Failures?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopTaskRequest {
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
        var task: String
        var reason: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopTaskResponse {
        var task: Task?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StringMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface SubmitAttachmentStateChangesRequest {
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
        var attachments: AttachmentStateChanges
    }
    interface SubmitAttachmentStateChangesResponse {
        var acknowledgment: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SubmitContainerStateChangeRequest {
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
        var task: String?
            get() = definedExternally
            set(value) = definedExternally
        var containerName: String?
            get() = definedExternally
            set(value) = definedExternally
        var runtimeId: String?
            get() = definedExternally
            set(value) = definedExternally
        var status: String?
            get() = definedExternally
            set(value) = definedExternally
        var exitCode: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var reason: String?
            get() = definedExternally
            set(value) = definedExternally
        var networkBindings: NetworkBindings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SubmitContainerStateChangeResponse {
        var acknowledgment: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SubmitTaskStateChangeRequest {
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
        var task: String?
            get() = definedExternally
            set(value) = definedExternally
        var status: String?
            get() = definedExternally
            set(value) = definedExternally
        var reason: String?
            get() = definedExternally
            set(value) = definedExternally
        var containers: ContainerStateChanges?
            get() = definedExternally
            set(value) = definedExternally
        var attachments: AttachmentStateChanges?
            get() = definedExternally
            set(value) = definedExternally
        var pullStartedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var pullStoppedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var executionStoppedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SubmitTaskStateChangeResponse {
        var acknowledgment: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SystemControl {
        var namespace: String?
            get() = definedExternally
            set(value) = definedExternally
        var value: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var key: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var resourceArn: String
        var tags: Tags
    }
    interface TagResourceResponse
    interface Task {
        var attachments: Attachments?
            get() = definedExternally
            set(value) = definedExternally
        var attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
        var availabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var capacityProviderName: String?
            get() = definedExternally
            set(value) = definedExternally
        var clusterArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var connectivity: String /* "CONNECTED" | "DISCONNECTED" | String */
        var connectivityAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var containerInstanceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var containers: Containers?
            get() = definedExternally
            set(value) = definedExternally
        var cpu: String?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var desiredStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var executionStoppedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var group: String?
            get() = definedExternally
            set(value) = definedExternally
        var healthStatus: String /* "HEALTHY" | "UNHEALTHY" | "UNKNOWN" | String */
        var inferenceAccelerators: InferenceAccelerators?
            get() = definedExternally
            set(value) = definedExternally
        var lastStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var launchType: String /* "EC2" | "FARGATE" | String */
        var memory: String?
            get() = definedExternally
            set(value) = definedExternally
        var overrides: TaskOverride?
            get() = definedExternally
            set(value) = definedExternally
        var platformVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var pullStartedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var pullStoppedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var startedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var startedBy: String?
            get() = definedExternally
            set(value) = definedExternally
        var stopCode: String /* "TaskFailedToStart" | "EssentialContainerExited" | "UserInitiated" | String */
        var stoppedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var stoppedReason: String?
            get() = definedExternally
            set(value) = definedExternally
        var stoppingAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var taskArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var taskDefinitionArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var version: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TaskDefinition {
        var taskDefinitionArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var containerDefinitions: ContainerDefinitions?
            get() = definedExternally
            set(value) = definedExternally
        var family: String?
            get() = definedExternally
            set(value) = definedExternally
        var taskRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var executionRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var networkMode: String /* "bridge" | "host" | "awsvpc" | "none" | String */
        var revision: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var volumes: VolumeList?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "ACTIVE" | "INACTIVE" | String */
        var requiresAttributes: RequiresAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var placementConstraints: TaskDefinitionPlacementConstraints?
            get() = definedExternally
            set(value) = definedExternally
        var compatibilities: CompatibilityList?
            get() = definedExternally
            set(value) = definedExternally
        var requiresCompatibilities: CompatibilityList?
            get() = definedExternally
            set(value) = definedExternally
        var cpu: String?
            get() = definedExternally
            set(value) = definedExternally
        var memory: String?
            get() = definedExternally
            set(value) = definedExternally
        var inferenceAccelerators: InferenceAccelerators?
            get() = definedExternally
            set(value) = definedExternally
        var pidMode: String /* "host" | "task" | String */
        var ipcMode: String /* "host" | "task" | "none" | String */
        var proxyConfiguration: ProxyConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TaskDefinitionPlacementConstraint {
        var type: String /* "memberOf" | String */
        var expression: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TaskOverride {
        var containerOverrides: ContainerOverrides?
            get() = definedExternally
            set(value) = definedExternally
        var cpu: String?
            get() = definedExternally
            set(value) = definedExternally
        var inferenceAcceleratorOverrides: InferenceAcceleratorOverrides?
            get() = definedExternally
            set(value) = definedExternally
        var executionRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var memory: String?
            get() = definedExternally
            set(value) = definedExternally
        var taskRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TaskSet {
        var id: String?
            get() = definedExternally
            set(value) = definedExternally
        var taskSetArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var serviceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var clusterArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var startedBy: String?
            get() = definedExternally
            set(value) = definedExternally
        var externalId: String?
            get() = definedExternally
            set(value) = definedExternally
        var status: String?
            get() = definedExternally
            set(value) = definedExternally
        var taskDefinition: String?
            get() = definedExternally
            set(value) = definedExternally
        var computedDesiredCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var pendingCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var runningCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var updatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var launchType: String /* "EC2" | "FARGATE" | String */
        var capacityProviderStrategy: CapacityProviderStrategy?
            get() = definedExternally
            set(value) = definedExternally
        var platformVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var networkConfiguration: NetworkConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var loadBalancers: LoadBalancers?
            get() = definedExternally
            set(value) = definedExternally
        var serviceRegistries: ServiceRegistries?
            get() = definedExternally
            set(value) = definedExternally
        var scale: Scale?
            get() = definedExternally
            set(value) = definedExternally
        var stabilityStatus: String /* "STEADY_STATE" | "STABILIZING" | String */
        var stabilityStatusAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tmpfs {
        var containerPath: String
        var size: Integer
        var mountOptions: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Ulimit {
        var name: String /* "core" | "cpu" | "data" | "fsize" | "locks" | "memlock" | "msgqueue" | "nice" | "nofile" | "nproc" | "rss" | "rtprio" | "rttime" | "sigpending" | "stack" | String */
        var softLimit: Integer
        var hardLimit: Integer
    }
    interface UntagResourceRequest {
        var resourceArn: String
        var tagKeys: TagKeys
    }
    interface UntagResourceResponse
    interface UpdateClusterSettingsRequest {
        var cluster: String
        var settings: ClusterSettings
    }
    interface UpdateClusterSettingsResponse {
        var cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateContainerAgentRequest {
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
        var containerInstance: String
    }
    interface UpdateContainerAgentResponse {
        var containerInstance: ContainerInstance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateContainerInstancesStateRequest {
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
        var containerInstances: StringList
        var status: String /* "ACTIVE" | "DRAINING" | "REGISTERING" | "DEREGISTERING" | "REGISTRATION_FAILED" | String */
    }
    interface UpdateContainerInstancesStateResponse {
        var containerInstances: ContainerInstances?
            get() = definedExternally
            set(value) = definedExternally
        var failures: Failures?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateServicePrimaryTaskSetRequest {
        var cluster: String
        var service: String
        var primaryTaskSet: String
    }
    interface UpdateServicePrimaryTaskSetResponse {
        var taskSet: TaskSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateServiceRequest {
        var cluster: String?
            get() = definedExternally
            set(value) = definedExternally
        var service: String
        var desiredCount: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var taskDefinition: String?
            get() = definedExternally
            set(value) = definedExternally
        var capacityProviderStrategy: CapacityProviderStrategy?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentConfiguration: DeploymentConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var networkConfiguration: NetworkConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var placementConstraints: PlacementConstraints?
            get() = definedExternally
            set(value) = definedExternally
        var placementStrategy: PlacementStrategies?
            get() = definedExternally
            set(value) = definedExternally
        var platformVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var forceNewDeployment: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var healthCheckGracePeriodSeconds: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateServiceResponse {
        var service: Service?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTaskSetRequest {
        var cluster: String
        var service: String
        var taskSet: String
        var scale: Scale
    }
    interface UpdateTaskSetResponse {
        var taskSet: TaskSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VersionInfo {
        var agentVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var agentHash: String?
            get() = definedExternally
            set(value) = definedExternally
        var dockerVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Volume {
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var host: HostVolumeProperties?
            get() = definedExternally
            set(value) = definedExternally
        var dockerVolumeConfiguration: DockerVolumeConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var efsVolumeConfiguration: EFSVolumeConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VolumeFrom {
        var sourceContainer: String?
            get() = definedExternally
            set(value) = definedExternally
        var readOnly: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2014-11-13" | "latest" | String */
    }
}