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
import OpsWorks.AgentVersion
import OpsWorks.App
import OpsWorks.BlockDeviceMapping
import OpsWorks.CloudWatchLogsLogStream
import OpsWorks.Command
import OpsWorks.DataSource
import OpsWorks.Deployment
import OpsWorks.EcsCluster
import OpsWorks.ElasticIp
import OpsWorks.ElasticLoadBalancer
import OpsWorks.EnvironmentVariable
import OpsWorks.Instance
import OpsWorks.Layer
import OpsWorks.LoadBasedAutoScalingConfiguration
import OpsWorks.OperatingSystemConfigurationManager
import OpsWorks.OperatingSystem
import OpsWorks.Permission
import OpsWorks.RaidArray
import OpsWorks.RdsDbInstance
import OpsWorks.ServiceError
import OpsWorks.Stack
import OpsWorks.TimeBasedAutoScalingConfiguration
import OpsWorks.UserProfile
import OpsWorks.VolumeConfiguration
import OpsWorks.Volume
import OpsWorks.AssignInstanceRequest
import OpsWorks.AssignVolumeRequest
import OpsWorks.AssociateElasticIpRequest
import OpsWorks.AttachElasticLoadBalancerRequest
import OpsWorks.CloneStackRequest
import OpsWorks.CloneStackResult
import OpsWorks.CreateAppRequest
import OpsWorks.CreateAppResult
import OpsWorks.CreateDeploymentRequest
import OpsWorks.CreateDeploymentResult
import OpsWorks.CreateInstanceRequest
import OpsWorks.CreateInstanceResult
import OpsWorks.CreateLayerRequest
import OpsWorks.CreateLayerResult
import OpsWorks.CreateStackRequest
import OpsWorks.CreateStackResult
import OpsWorks.CreateUserProfileRequest
import OpsWorks.CreateUserProfileResult
import OpsWorks.DeleteAppRequest
import OpsWorks.DeleteInstanceRequest
import OpsWorks.DeleteLayerRequest
import OpsWorks.DeleteStackRequest
import OpsWorks.DeleteUserProfileRequest
import OpsWorks.DeregisterEcsClusterRequest
import OpsWorks.DeregisterElasticIpRequest
import OpsWorks.DeregisterInstanceRequest
import OpsWorks.DeregisterRdsDbInstanceRequest
import OpsWorks.DeregisterVolumeRequest
import OpsWorks.DescribeAgentVersionsRequest
import OpsWorks.DescribeAgentVersionsResult
import OpsWorks.DescribeAppsRequest
import OpsWorks.DescribeAppsResult
import OpsWorks.DescribeCommandsRequest
import OpsWorks.DescribeCommandsResult
import OpsWorks.DescribeDeploymentsRequest
import OpsWorks.DescribeDeploymentsResult
import OpsWorks.DescribeEcsClustersRequest
import OpsWorks.DescribeEcsClustersResult
import OpsWorks.DescribeElasticIpsRequest
import OpsWorks.DescribeElasticIpsResult
import OpsWorks.DescribeElasticLoadBalancersRequest
import OpsWorks.DescribeElasticLoadBalancersResult
import OpsWorks.DescribeInstancesRequest
import OpsWorks.DescribeInstancesResult
import OpsWorks.DescribeLayersRequest
import OpsWorks.DescribeLayersResult
import OpsWorks.DescribeLoadBasedAutoScalingRequest
import OpsWorks.DescribeLoadBasedAutoScalingResult
import OpsWorks.DescribeMyUserProfileResult
import OpsWorks.DescribeOperatingSystemsResponse
import OpsWorks.DescribePermissionsRequest
import OpsWorks.DescribePermissionsResult
import OpsWorks.DescribeRaidArraysRequest
import OpsWorks.DescribeRaidArraysResult
import OpsWorks.DescribeRdsDbInstancesRequest
import OpsWorks.DescribeRdsDbInstancesResult
import OpsWorks.DescribeServiceErrorsRequest
import OpsWorks.DescribeServiceErrorsResult
import OpsWorks.DescribeStackProvisioningParametersRequest
import OpsWorks.DescribeStackProvisioningParametersResult
import OpsWorks.DescribeStackSummaryRequest
import OpsWorks.DescribeStackSummaryResult
import OpsWorks.DescribeStacksRequest
import OpsWorks.DescribeStacksResult
import OpsWorks.DescribeTimeBasedAutoScalingRequest
import OpsWorks.DescribeTimeBasedAutoScalingResult
import OpsWorks.DescribeUserProfilesRequest
import OpsWorks.DescribeUserProfilesResult
import OpsWorks.DescribeVolumesRequest
import OpsWorks.DescribeVolumesResult
import OpsWorks.DetachElasticLoadBalancerRequest
import OpsWorks.DisassociateElasticIpRequest
import OpsWorks.GetHostnameSuggestionRequest
import OpsWorks.GetHostnameSuggestionResult
import OpsWorks.GrantAccessRequest
import OpsWorks.GrantAccessResult
import OpsWorks.ListTagsRequest
import OpsWorks.ListTagsResult
import OpsWorks.RebootInstanceRequest
import OpsWorks.RegisterEcsClusterRequest
import OpsWorks.RegisterEcsClusterResult
import OpsWorks.RegisterElasticIpRequest
import OpsWorks.RegisterElasticIpResult
import OpsWorks.RegisterInstanceRequest
import OpsWorks.RegisterInstanceResult
import OpsWorks.RegisterRdsDbInstanceRequest
import OpsWorks.RegisterVolumeRequest
import OpsWorks.RegisterVolumeResult
import OpsWorks.SetLoadBasedAutoScalingRequest
import OpsWorks.SetPermissionRequest
import OpsWorks.SetTimeBasedAutoScalingRequest
import OpsWorks.StartInstanceRequest
import OpsWorks.StartStackRequest
import OpsWorks.StopInstanceRequest
import OpsWorks.StopStackRequest
import OpsWorks.TagResourceRequest
import OpsWorks.UnassignInstanceRequest
import OpsWorks.UnassignVolumeRequest
import OpsWorks.UntagResourceRequest
import OpsWorks.UpdateAppRequest
import OpsWorks.UpdateElasticIpRequest
import OpsWorks.UpdateInstanceRequest
import OpsWorks.UpdateLayerRequest
import OpsWorks.UpdateMyUserProfileRequest
import OpsWorks.UpdateRdsDbInstanceRequest
import OpsWorks.UpdateStackRequest
import OpsWorks.UpdateUserProfileRequest
import OpsWorks.UpdateVolumeRequest
import OpsWorks.StackConfigurationManager
import OpsWorks.Source
import OpsWorks.SslConfiguration
import OpsWorks.AppAttributes
import OpsWorks.EbsBlockDevice
import OpsWorks.StackAttributes
import OpsWorks.ChefConfiguration
import OpsWorks.DeploymentCommand
import OpsWorks.LayerAttributes
import OpsWorks.CloudWatchLogsConfiguration
import OpsWorks.Recipes
import OpsWorks.LifecycleEventConfiguration
import OpsWorks.DeploymentCommandArgs
import OpsWorks.SelfUserProfile
import OpsWorks.Parameters
import OpsWorks.StackSummary
import OpsWorks.TemporaryCredential
import OpsWorks.ReportedOs
import OpsWorks.ShutdownEventConfiguration
import OpsWorks.Tags
import OpsWorks.AutoScalingThresholds
import OpsWorks.InstanceIdentity
import OpsWorks.WeeklyAutoScalingSchedule
import OpsWorks.InstancesCount
import OpsWorks.DailyAutoScalingSchedule

typealias AgentVersions = Array<AgentVersion>

typealias Apps = Array<App>

typealias BlockDeviceMappings = Array<BlockDeviceMapping>

typealias Boolean = Boolean

typealias CloudWatchLogsLogStreams = Array<CloudWatchLogsLogStream>

typealias Commands = Array<Command>

typealias DataSources = Array<DataSource>

typealias DateTime = String

typealias Deployments = Array<Deployment>

typealias Double = Number

typealias EcsClusters = Array<EcsCluster>

typealias ElasticIps = Array<ElasticIp>

typealias ElasticLoadBalancers = Array<ElasticLoadBalancer>

typealias EnvironmentVariables = Array<EnvironmentVariable>

typealias Hour = String

typealias Instances = Array<Instance>

typealias Integer = Number

typealias Layers = Array<Layer>

typealias LoadBasedAutoScalingConfigurations = Array<LoadBasedAutoScalingConfiguration>

typealias MaxResults = Number

typealias Minute = Number

typealias NextToken = String

typealias OperatingSystemConfigurationManagers = Array<OperatingSystemConfigurationManager>

typealias OperatingSystems = Array<OperatingSystem>

typealias Permissions = Array<Permission>

typealias RaidArrays = Array<RaidArray>

typealias RdsDbInstances = Array<RdsDbInstance>

typealias ResourceArn = String

typealias ServiceErrors = Array<ServiceError>

typealias Stacks = Array<Stack>

typealias String = String

typealias Strings = Array<String>

typealias Switch = String

typealias TagKey = String

typealias TagKeys = Array<TagKey>

typealias TagValue = String

typealias TimeBasedAutoScalingConfigurations = Array<TimeBasedAutoScalingConfiguration>

typealias UserProfiles = Array<UserProfile>

typealias ValidForInMinutes = Number

typealias VolumeConfigurations = Array<VolumeConfiguration>

typealias Volumes = Array<Volume>

@JsModule("aws-sdk")
external open class OpsWorks(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & OpsWorks.Types.ClientConfiguration */
    open fun assignInstance(params: AssignInstanceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun assignInstance(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun assignVolume(params: AssignVolumeRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun assignVolume(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun associateElasticIp(params: AssociateElasticIpRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun associateElasticIp(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun attachElasticLoadBalancer(params: AttachElasticLoadBalancerRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun attachElasticLoadBalancer(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun cloneStack(params: CloneStackRequest, callback: (err: AWSError, data: CloneStackResult) -> Unit = definedExternally): Request<CloneStackResult, AWSError>
    open fun cloneStack(callback: (err: AWSError, data: CloneStackResult) -> Unit = definedExternally): Request<CloneStackResult, AWSError>
    open fun createApp(params: CreateAppRequest, callback: (err: AWSError, data: CreateAppResult) -> Unit = definedExternally): Request<CreateAppResult, AWSError>
    open fun createApp(callback: (err: AWSError, data: CreateAppResult) -> Unit = definedExternally): Request<CreateAppResult, AWSError>
    open fun createDeployment(params: CreateDeploymentRequest, callback: (err: AWSError, data: CreateDeploymentResult) -> Unit = definedExternally): Request<CreateDeploymentResult, AWSError>
    open fun createDeployment(callback: (err: AWSError, data: CreateDeploymentResult) -> Unit = definedExternally): Request<CreateDeploymentResult, AWSError>
    open fun createInstance(params: CreateInstanceRequest, callback: (err: AWSError, data: CreateInstanceResult) -> Unit = definedExternally): Request<CreateInstanceResult, AWSError>
    open fun createInstance(callback: (err: AWSError, data: CreateInstanceResult) -> Unit = definedExternally): Request<CreateInstanceResult, AWSError>
    open fun createLayer(params: CreateLayerRequest, callback: (err: AWSError, data: CreateLayerResult) -> Unit = definedExternally): Request<CreateLayerResult, AWSError>
    open fun createLayer(callback: (err: AWSError, data: CreateLayerResult) -> Unit = definedExternally): Request<CreateLayerResult, AWSError>
    open fun createStack(params: CreateStackRequest, callback: (err: AWSError, data: CreateStackResult) -> Unit = definedExternally): Request<CreateStackResult, AWSError>
    open fun createStack(callback: (err: AWSError, data: CreateStackResult) -> Unit = definedExternally): Request<CreateStackResult, AWSError>
    open fun createUserProfile(params: CreateUserProfileRequest, callback: (err: AWSError, data: CreateUserProfileResult) -> Unit = definedExternally): Request<CreateUserProfileResult, AWSError>
    open fun createUserProfile(callback: (err: AWSError, data: CreateUserProfileResult) -> Unit = definedExternally): Request<CreateUserProfileResult, AWSError>
    open fun deleteApp(params: DeleteAppRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteApp(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteInstance(params: DeleteInstanceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteInstance(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteLayer(params: DeleteLayerRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteLayer(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteStack(params: DeleteStackRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteStack(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUserProfile(params: DeleteUserProfileRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUserProfile(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deregisterEcsCluster(params: DeregisterEcsClusterRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deregisterEcsCluster(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deregisterElasticIp(params: DeregisterElasticIpRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deregisterElasticIp(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deregisterInstance(params: DeregisterInstanceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deregisterInstance(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deregisterRdsDbInstance(params: DeregisterRdsDbInstanceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deregisterRdsDbInstance(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deregisterVolume(params: DeregisterVolumeRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deregisterVolume(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeAgentVersions(params: DescribeAgentVersionsRequest, callback: (err: AWSError, data: DescribeAgentVersionsResult) -> Unit = definedExternally): Request<DescribeAgentVersionsResult, AWSError>
    open fun describeAgentVersions(callback: (err: AWSError, data: DescribeAgentVersionsResult) -> Unit = definedExternally): Request<DescribeAgentVersionsResult, AWSError>
    open fun describeApps(params: DescribeAppsRequest, callback: (err: AWSError, data: DescribeAppsResult) -> Unit = definedExternally): Request<DescribeAppsResult, AWSError>
    open fun describeApps(callback: (err: AWSError, data: DescribeAppsResult) -> Unit = definedExternally): Request<DescribeAppsResult, AWSError>
    open fun describeCommands(params: DescribeCommandsRequest, callback: (err: AWSError, data: DescribeCommandsResult) -> Unit = definedExternally): Request<DescribeCommandsResult, AWSError>
    open fun describeCommands(callback: (err: AWSError, data: DescribeCommandsResult) -> Unit = definedExternally): Request<DescribeCommandsResult, AWSError>
    open fun describeDeployments(params: DescribeDeploymentsRequest, callback: (err: AWSError, data: DescribeDeploymentsResult) -> Unit = definedExternally): Request<DescribeDeploymentsResult, AWSError>
    open fun describeDeployments(callback: (err: AWSError, data: DescribeDeploymentsResult) -> Unit = definedExternally): Request<DescribeDeploymentsResult, AWSError>
    open fun describeEcsClusters(params: DescribeEcsClustersRequest, callback: (err: AWSError, data: DescribeEcsClustersResult) -> Unit = definedExternally): Request<DescribeEcsClustersResult, AWSError>
    open fun describeEcsClusters(callback: (err: AWSError, data: DescribeEcsClustersResult) -> Unit = definedExternally): Request<DescribeEcsClustersResult, AWSError>
    open fun describeElasticIps(params: DescribeElasticIpsRequest, callback: (err: AWSError, data: DescribeElasticIpsResult) -> Unit = definedExternally): Request<DescribeElasticIpsResult, AWSError>
    open fun describeElasticIps(callback: (err: AWSError, data: DescribeElasticIpsResult) -> Unit = definedExternally): Request<DescribeElasticIpsResult, AWSError>
    open fun describeElasticLoadBalancers(params: DescribeElasticLoadBalancersRequest, callback: (err: AWSError, data: DescribeElasticLoadBalancersResult) -> Unit = definedExternally): Request<DescribeElasticLoadBalancersResult, AWSError>
    open fun describeElasticLoadBalancers(callback: (err: AWSError, data: DescribeElasticLoadBalancersResult) -> Unit = definedExternally): Request<DescribeElasticLoadBalancersResult, AWSError>
    open fun describeInstances(params: DescribeInstancesRequest, callback: (err: AWSError, data: DescribeInstancesResult) -> Unit = definedExternally): Request<DescribeInstancesResult, AWSError>
    open fun describeInstances(callback: (err: AWSError, data: DescribeInstancesResult) -> Unit = definedExternally): Request<DescribeInstancesResult, AWSError>
    open fun describeLayers(params: DescribeLayersRequest, callback: (err: AWSError, data: DescribeLayersResult) -> Unit = definedExternally): Request<DescribeLayersResult, AWSError>
    open fun describeLayers(callback: (err: AWSError, data: DescribeLayersResult) -> Unit = definedExternally): Request<DescribeLayersResult, AWSError>
    open fun describeLoadBasedAutoScaling(params: DescribeLoadBasedAutoScalingRequest, callback: (err: AWSError, data: DescribeLoadBasedAutoScalingResult) -> Unit = definedExternally): Request<DescribeLoadBasedAutoScalingResult, AWSError>
    open fun describeLoadBasedAutoScaling(callback: (err: AWSError, data: DescribeLoadBasedAutoScalingResult) -> Unit = definedExternally): Request<DescribeLoadBasedAutoScalingResult, AWSError>
    open fun describeMyUserProfile(callback: (err: AWSError, data: DescribeMyUserProfileResult) -> Unit = definedExternally): Request<DescribeMyUserProfileResult, AWSError>
    open fun describeOperatingSystems(callback: (err: AWSError, data: DescribeOperatingSystemsResponse) -> Unit = definedExternally): Request<DescribeOperatingSystemsResponse, AWSError>
    open fun describePermissions(params: DescribePermissionsRequest, callback: (err: AWSError, data: DescribePermissionsResult) -> Unit = definedExternally): Request<DescribePermissionsResult, AWSError>
    open fun describePermissions(callback: (err: AWSError, data: DescribePermissionsResult) -> Unit = definedExternally): Request<DescribePermissionsResult, AWSError>
    open fun describeRaidArrays(params: DescribeRaidArraysRequest, callback: (err: AWSError, data: DescribeRaidArraysResult) -> Unit = definedExternally): Request<DescribeRaidArraysResult, AWSError>
    open fun describeRaidArrays(callback: (err: AWSError, data: DescribeRaidArraysResult) -> Unit = definedExternally): Request<DescribeRaidArraysResult, AWSError>
    open fun describeRdsDbInstances(params: DescribeRdsDbInstancesRequest, callback: (err: AWSError, data: DescribeRdsDbInstancesResult) -> Unit = definedExternally): Request<DescribeRdsDbInstancesResult, AWSError>
    open fun describeRdsDbInstances(callback: (err: AWSError, data: DescribeRdsDbInstancesResult) -> Unit = definedExternally): Request<DescribeRdsDbInstancesResult, AWSError>
    open fun describeServiceErrors(params: DescribeServiceErrorsRequest, callback: (err: AWSError, data: DescribeServiceErrorsResult) -> Unit = definedExternally): Request<DescribeServiceErrorsResult, AWSError>
    open fun describeServiceErrors(callback: (err: AWSError, data: DescribeServiceErrorsResult) -> Unit = definedExternally): Request<DescribeServiceErrorsResult, AWSError>
    open fun describeStackProvisioningParameters(params: DescribeStackProvisioningParametersRequest, callback: (err: AWSError, data: DescribeStackProvisioningParametersResult) -> Unit = definedExternally): Request<DescribeStackProvisioningParametersResult, AWSError>
    open fun describeStackProvisioningParameters(callback: (err: AWSError, data: DescribeStackProvisioningParametersResult) -> Unit = definedExternally): Request<DescribeStackProvisioningParametersResult, AWSError>
    open fun describeStackSummary(params: DescribeStackSummaryRequest, callback: (err: AWSError, data: DescribeStackSummaryResult) -> Unit = definedExternally): Request<DescribeStackSummaryResult, AWSError>
    open fun describeStackSummary(callback: (err: AWSError, data: DescribeStackSummaryResult) -> Unit = definedExternally): Request<DescribeStackSummaryResult, AWSError>
    open fun describeStacks(params: DescribeStacksRequest, callback: (err: AWSError, data: DescribeStacksResult) -> Unit = definedExternally): Request<DescribeStacksResult, AWSError>
    open fun describeStacks(callback: (err: AWSError, data: DescribeStacksResult) -> Unit = definedExternally): Request<DescribeStacksResult, AWSError>
    open fun describeTimeBasedAutoScaling(params: DescribeTimeBasedAutoScalingRequest, callback: (err: AWSError, data: DescribeTimeBasedAutoScalingResult) -> Unit = definedExternally): Request<DescribeTimeBasedAutoScalingResult, AWSError>
    open fun describeTimeBasedAutoScaling(callback: (err: AWSError, data: DescribeTimeBasedAutoScalingResult) -> Unit = definedExternally): Request<DescribeTimeBasedAutoScalingResult, AWSError>
    open fun describeUserProfiles(params: DescribeUserProfilesRequest, callback: (err: AWSError, data: DescribeUserProfilesResult) -> Unit = definedExternally): Request<DescribeUserProfilesResult, AWSError>
    open fun describeUserProfiles(callback: (err: AWSError, data: DescribeUserProfilesResult) -> Unit = definedExternally): Request<DescribeUserProfilesResult, AWSError>
    open fun describeVolumes(params: DescribeVolumesRequest, callback: (err: AWSError, data: DescribeVolumesResult) -> Unit = definedExternally): Request<DescribeVolumesResult, AWSError>
    open fun describeVolumes(callback: (err: AWSError, data: DescribeVolumesResult) -> Unit = definedExternally): Request<DescribeVolumesResult, AWSError>
    open fun detachElasticLoadBalancer(params: DetachElasticLoadBalancerRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun detachElasticLoadBalancer(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disassociateElasticIp(params: DisassociateElasticIpRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disassociateElasticIp(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun getHostnameSuggestion(params: GetHostnameSuggestionRequest, callback: (err: AWSError, data: GetHostnameSuggestionResult) -> Unit = definedExternally): Request<GetHostnameSuggestionResult, AWSError>
    open fun getHostnameSuggestion(callback: (err: AWSError, data: GetHostnameSuggestionResult) -> Unit = definedExternally): Request<GetHostnameSuggestionResult, AWSError>
    open fun grantAccess(params: GrantAccessRequest, callback: (err: AWSError, data: GrantAccessResult) -> Unit = definedExternally): Request<GrantAccessResult, AWSError>
    open fun grantAccess(callback: (err: AWSError, data: GrantAccessResult) -> Unit = definedExternally): Request<GrantAccessResult, AWSError>
    open fun listTags(params: ListTagsRequest, callback: (err: AWSError, data: ListTagsResult) -> Unit = definedExternally): Request<ListTagsResult, AWSError>
    open fun listTags(callback: (err: AWSError, data: ListTagsResult) -> Unit = definedExternally): Request<ListTagsResult, AWSError>
    open fun rebootInstance(params: RebootInstanceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun rebootInstance(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun registerEcsCluster(params: RegisterEcsClusterRequest, callback: (err: AWSError, data: RegisterEcsClusterResult) -> Unit = definedExternally): Request<RegisterEcsClusterResult, AWSError>
    open fun registerEcsCluster(callback: (err: AWSError, data: RegisterEcsClusterResult) -> Unit = definedExternally): Request<RegisterEcsClusterResult, AWSError>
    open fun registerElasticIp(params: RegisterElasticIpRequest, callback: (err: AWSError, data: RegisterElasticIpResult) -> Unit = definedExternally): Request<RegisterElasticIpResult, AWSError>
    open fun registerElasticIp(callback: (err: AWSError, data: RegisterElasticIpResult) -> Unit = definedExternally): Request<RegisterElasticIpResult, AWSError>
    open fun registerInstance(params: RegisterInstanceRequest, callback: (err: AWSError, data: RegisterInstanceResult) -> Unit = definedExternally): Request<RegisterInstanceResult, AWSError>
    open fun registerInstance(callback: (err: AWSError, data: RegisterInstanceResult) -> Unit = definedExternally): Request<RegisterInstanceResult, AWSError>
    open fun registerRdsDbInstance(params: RegisterRdsDbInstanceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun registerRdsDbInstance(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun registerVolume(params: RegisterVolumeRequest, callback: (err: AWSError, data: RegisterVolumeResult) -> Unit = definedExternally): Request<RegisterVolumeResult, AWSError>
    open fun registerVolume(callback: (err: AWSError, data: RegisterVolumeResult) -> Unit = definedExternally): Request<RegisterVolumeResult, AWSError>
    open fun setLoadBasedAutoScaling(params: SetLoadBasedAutoScalingRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setLoadBasedAutoScaling(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setPermission(params: SetPermissionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setPermission(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setTimeBasedAutoScaling(params: SetTimeBasedAutoScalingRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setTimeBasedAutoScaling(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun startInstance(params: StartInstanceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun startInstance(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun startStack(params: StartStackRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun startStack(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopInstance(params: StopInstanceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopInstance(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopStack(params: StopStackRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopStack(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun unassignInstance(params: UnassignInstanceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun unassignInstance(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun unassignVolume(params: UnassignVolumeRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun unassignVolume(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateApp(params: UpdateAppRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateApp(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateElasticIp(params: UpdateElasticIpRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateElasticIp(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateInstance(params: UpdateInstanceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateInstance(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateLayer(params: UpdateLayerRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateLayer(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateMyUserProfile(params: UpdateMyUserProfileRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateMyUserProfile(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateRdsDbInstance(params: UpdateRdsDbInstanceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateRdsDbInstance(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateStack(params: UpdateStackRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateStack(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateUserProfile(params: UpdateUserProfileRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateUserProfile(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateVolume(params: UpdateVolumeRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateVolume(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun waitFor(state: String /* "appExists" */, params: DescribeAppsRequest /* OpsWorks.Types.DescribeAppsRequest & `T$0` */, callback: (err: AWSError, data: DescribeAppsResult) -> Unit = definedExternally): Request<DescribeAppsResult, AWSError>
    open fun waitFor(state: String /* "appExists" */, callback: (err: AWSError, data: DescribeAppsResult) -> Unit = definedExternally): Request<DescribeAppsResult, AWSError>
    open fun waitFor(state: String /* "deploymentSuccessful" */, params: DescribeDeploymentsRequest /* OpsWorks.Types.DescribeDeploymentsRequest & `T$0` */, callback: (err: AWSError, data: DescribeDeploymentsResult) -> Unit = definedExternally): Request<DescribeDeploymentsResult, AWSError>
    open fun waitFor(state: String /* "deploymentSuccessful" */, callback: (err: AWSError, data: DescribeDeploymentsResult) -> Unit = definedExternally): Request<DescribeDeploymentsResult, AWSError>
    open fun waitFor(state: String, params: DescribeInstancesRequest, callback: (err: AWSError, data: DescribeInstancesResult) -> Unit = definedExternally): Request<DescribeInstancesResult, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DescribeInstancesResult) -> Unit = definedExternally): Request<DescribeInstancesResult, AWSError>
    interface AgentVersion {
        var Version: String?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationManager: StackConfigurationManager?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface App {
        var AppId: String?
            get() = definedExternally
            set(value) = definedExternally
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Shortname: String?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var DataSources: DataSources?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "aws-flow-ruby" | "java" | "rails" | "php" | "nodejs" | "static" | "other" | String */
        var AppSource: Source?
            get() = definedExternally
            set(value) = definedExternally
        var Domains: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var EnableSsl: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SslConfiguration: SslConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: AppAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: String?
            get() = definedExternally
            set(value) = definedExternally
        var Environment: EnvironmentVariables?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AppAttributes {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface AssignInstanceRequest {
        var InstanceId: String
        var LayerIds: Strings
    }
    interface AssignVolumeRequest {
        var VolumeId: String
        var InstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateElasticIpRequest {
        var ElasticIp: String
        var InstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttachElasticLoadBalancerRequest {
        var ElasticLoadBalancerName: String
        var LayerId: String
    }
    interface AutoScalingThresholds {
        var InstanceCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ThresholdsWaitTime: Minute?
            get() = definedExternally
            set(value) = definedExternally
        var IgnoreMetricsTime: Minute?
            get() = definedExternally
            set(value) = definedExternally
        var CpuThreshold: Double?
            get() = definedExternally
            set(value) = definedExternally
        var MemoryThreshold: Double?
            get() = definedExternally
            set(value) = definedExternally
        var LoadThreshold: Double?
            get() = definedExternally
            set(value) = definedExternally
        var Alarms: Strings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BlockDeviceMapping {
        var DeviceName: String?
            get() = definedExternally
            set(value) = definedExternally
        var NoDevice: String?
            get() = definedExternally
            set(value) = definedExternally
        var VirtualName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Ebs: EbsBlockDevice?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChefConfiguration {
        var ManageBerkshelf: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var BerkshelfVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CloneStackRequest {
        var SourceStackId: String
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Region: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: StackAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceRoleArn: String
        var DefaultInstanceProfileArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultOs: String?
            get() = definedExternally
            set(value) = definedExternally
        var HostnameTheme: String?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultAvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultSubnetId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CustomJson: String?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationManager: StackConfigurationManager?
            get() = definedExternally
            set(value) = definedExternally
        var ChefConfiguration: ChefConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var UseCustomCookbooks: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var UseOpsworksSecurityGroups: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CustomCookbooksSource: Source?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultSshKeyName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClonePermissions: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CloneAppIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultRootDeviceType: String /* "ebs" | "instance-store" | String */
        var AgentVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CloneStackResult {
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CloudWatchLogsConfiguration {
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var LogStreams: CloudWatchLogsLogStreams?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CloudWatchLogsLogStream {
        var LogGroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DatetimeFormat: String?
            get() = definedExternally
            set(value) = definedExternally
        var TimeZone: String /* "LOCAL" | "UTC" | String */
        var File: String?
            get() = definedExternally
            set(value) = definedExternally
        var FileFingerprintLines: String?
            get() = definedExternally
            set(value) = definedExternally
        var MultiLineStartPattern: String?
            get() = definedExternally
            set(value) = definedExternally
        var InitialPosition: String /* "start_of_file" | "end_of_file" | String */
        var Encoding: String /* "ascii" | "big5" | "big5hkscs" | "cp037" | "cp424" | "cp437" | "cp500" | "cp720" | "cp737" | "cp775" | "cp850" | "cp852" | "cp855" | "cp856" | "cp857" | "cp858" | "cp860" | "cp861" | "cp862" | "cp863" | "cp864" | "cp865" | "cp866" | "cp869" | "cp874" | "cp875" | "cp932" | "cp949" | "cp950" | "cp1006" | "cp1026" | "cp1140" | "cp1250" | "cp1251" | "cp1252" | "cp1253" | "cp1254" | "cp1255" | "cp1256" | "cp1257" | "cp1258" | "euc_jp" | "euc_jis_2004" | "euc_jisx0213" | "euc_kr" | "gb2312" | "gbk" | "gb18030" | "hz" | "iso2022_jp" | "iso2022_jp_1" | "iso2022_jp_2" | "iso2022_jp_2004" | "iso2022_jp_3" | "iso2022_jp_ext" | "iso2022_kr" | "latin_1" | "iso8859_2" | "iso8859_3" | "iso8859_4" | "iso8859_5" | "iso8859_6" | "iso8859_7" | "iso8859_8" | "iso8859_9" | "iso8859_10" | "iso8859_13" | "iso8859_14" | "iso8859_15" | "iso8859_16" | "johab" | "koi8_r" | "koi8_u" | "mac_cyrillic" | "mac_greek" | "mac_iceland" | "mac_latin2" | "mac_roman" | "mac_turkish" | "ptcp154" | "shift_jis" | "shift_jis_2004" | "shift_jisx0213" | "utf_32" | "utf_32_be" | "utf_32_le" | "utf_16" | "utf_16_be" | "utf_16_le" | "utf_7" | "utf_8" | "utf_8_sig" | String */
        var BufferDuration: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var BatchCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var BatchSize: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Command {
        var CommandId: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var AcknowledgedAt: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var CompletedAt: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var ExitCode: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var LogUrl: String?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAppRequest {
        var StackId: String
        var Shortname: String?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var DataSources: DataSources?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "aws-flow-ruby" | "java" | "rails" | "php" | "nodejs" | "static" | "other" | String */
        var AppSource: Source?
            get() = definedExternally
            set(value) = definedExternally
        var Domains: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var EnableSsl: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SslConfiguration: SslConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: AppAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var Environment: EnvironmentVariables?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAppResult {
        var AppId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeploymentRequest {
        var StackId: String
        var AppId: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var LayerIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var Command: DeploymentCommand
        var Comment: String?
            get() = definedExternally
            set(value) = definedExternally
        var CustomJson: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeploymentResult {
        var DeploymentId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateInstanceRequest {
        var StackId: String
        var LayerIds: Strings
        var InstanceType: String
        var AutoScalingType: String /* "load" | "timer" | String */
        var Hostname: String?
            get() = definedExternally
            set(value) = definedExternally
        var Os: String?
            get() = definedExternally
            set(value) = definedExternally
        var AmiId: String?
            get() = definedExternally
            set(value) = definedExternally
        var SshKeyName: String?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var VirtualizationType: String?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Architecture: String /* "x86_64" | "i386" | String */
        var RootDeviceType: String /* "ebs" | "instance-store" | String */
        var BlockDeviceMappings: BlockDeviceMappings?
            get() = definedExternally
            set(value) = definedExternally
        var InstallUpdatesOnBoot: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EbsOptimized: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AgentVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tenancy: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateInstanceResult {
        var InstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLayerRequest {
        var StackId: String
        var Type: String /* "aws-flow-ruby" | "ecs-cluster" | "java-app" | "lb" | "web" | "php-app" | "rails-app" | "nodejs-app" | "memcached" | "db-master" | "monitoring-master" | "custom" | String */
        var Name: String
        var Shortname: String
        var Attributes: LayerAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLogsConfiguration: CloudWatchLogsConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CustomInstanceProfileArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var CustomJson: String?
            get() = definedExternally
            set(value) = definedExternally
        var CustomSecurityGroupIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var Packages: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeConfigurations: VolumeConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var EnableAutoHealing: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AutoAssignElasticIps: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AutoAssignPublicIps: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CustomRecipes: Recipes?
            get() = definedExternally
            set(value) = definedExternally
        var InstallUpdatesOnBoot: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var UseEbsOptimizedInstances: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var LifecycleEventConfiguration: LifecycleEventConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLayerResult {
        var LayerId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStackRequest {
        var Name: String
        var Region: String
        var VpcId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: StackAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceRoleArn: String
        var DefaultInstanceProfileArn: String
        var DefaultOs: String?
            get() = definedExternally
            set(value) = definedExternally
        var HostnameTheme: String?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultAvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultSubnetId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CustomJson: String?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationManager: StackConfigurationManager?
            get() = definedExternally
            set(value) = definedExternally
        var ChefConfiguration: ChefConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var UseCustomCookbooks: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var UseOpsworksSecurityGroups: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CustomCookbooksSource: Source?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultSshKeyName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultRootDeviceType: String /* "ebs" | "instance-store" | String */
        var AgentVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStackResult {
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUserProfileRequest {
        var IamUserArn: String
        var SshUsername: String?
            get() = definedExternally
            set(value) = definedExternally
        var SshPublicKey: String?
            get() = definedExternally
            set(value) = definedExternally
        var AllowSelfManagement: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUserProfileResult {
        var IamUserArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DailyAutoScalingSchedule {
        @nativeGetter
        operator fun get(key: String): Switch?
        @nativeSetter
        operator fun set(key: String, value: Switch)
    }
    interface DataSource {
        var Type: String?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAppRequest {
        var AppId: String
    }
    interface DeleteInstanceRequest {
        var InstanceId: String
        var DeleteElasticIp: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var DeleteVolumes: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteLayerRequest {
        var LayerId: String
    }
    interface DeleteStackRequest {
        var StackId: String
    }
    interface DeleteUserProfileRequest {
        var IamUserArn: String
    }
    interface Deployment {
        var DeploymentId: String?
            get() = definedExternally
            set(value) = definedExternally
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var AppId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var CompletedAt: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var IamUserArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Comment: String?
            get() = definedExternally
            set(value) = definedExternally
        var Command: DeploymentCommand?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var CustomJson: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeploymentCommand {
        var Name: String /* "install_dependencies" | "update_dependencies" | "update_custom_cookbooks" | "execute_recipes" | "configure" | "setup" | "deploy" | "rollback" | "start" | "stop" | "restart" | "undeploy" | String */
        var Args: DeploymentCommandArgs?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeploymentCommandArgs {
        @nativeGetter
        operator fun get(key: String): Strings?
        @nativeSetter
        operator fun set(key: String, value: Strings)
    }
    interface DeregisterEcsClusterRequest {
        var EcsClusterArn: String
    }
    interface DeregisterElasticIpRequest {
        var ElasticIp: String
    }
    interface DeregisterInstanceRequest {
        var InstanceId: String
    }
    interface DeregisterRdsDbInstanceRequest {
        var RdsDbInstanceArn: String
    }
    interface DeregisterVolumeRequest {
        var VolumeId: String
    }
    interface DescribeAgentVersionsRequest {
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationManager: StackConfigurationManager?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAgentVersionsResult {
        var AgentVersions: AgentVersions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAppsRequest {
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var AppIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAppsResult {
        var Apps: Apps?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCommandsRequest {
        var DeploymentId: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CommandIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCommandsResult {
        var Commands: Commands?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDeploymentsRequest {
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var AppId: String?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDeploymentsResult {
        var Deployments: Deployments?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEcsClustersRequest {
        var EcsClusterArns: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEcsClustersResult {
        var EcsClusters: EcsClusters?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeElasticIpsRequest {
        var InstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Ips: Strings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeElasticIpsResult {
        var ElasticIps: ElasticIps?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeElasticLoadBalancersRequest {
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var LayerIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeElasticLoadBalancersResult {
        var ElasticLoadBalancers: ElasticLoadBalancers?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInstancesRequest {
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var LayerId: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInstancesResult {
        var Instances: Instances?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLayersRequest {
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var LayerIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLayersResult {
        var Layers: Layers?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLoadBasedAutoScalingRequest {
        var LayerIds: Strings
    }
    interface DescribeLoadBasedAutoScalingResult {
        var LoadBasedAutoScalingConfigurations: LoadBasedAutoScalingConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMyUserProfileResult {
        var UserProfile: SelfUserProfile?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeOperatingSystemsResponse {
        var OperatingSystems: OperatingSystems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePermissionsRequest {
        var IamUserArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePermissionsResult {
        var Permissions: Permissions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRaidArraysRequest {
        var InstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var RaidArrayIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRaidArraysResult {
        var RaidArrays: RaidArrays?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRdsDbInstancesRequest {
        var StackId: String
        var RdsDbInstanceArns: Strings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRdsDbInstancesResult {
        var RdsDbInstances: RdsDbInstances?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeServiceErrorsRequest {
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceErrorIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeServiceErrorsResult {
        var ServiceErrors: ServiceErrors?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStackProvisioningParametersRequest {
        var StackId: String
    }
    interface DescribeStackProvisioningParametersResult {
        var AgentInstallerUrl: String?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: Parameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStackSummaryRequest {
        var StackId: String
    }
    interface DescribeStackSummaryResult {
        var StackSummary: StackSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStacksRequest {
        var StackIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStacksResult {
        var Stacks: Stacks?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTimeBasedAutoScalingRequest {
        var InstanceIds: Strings
    }
    interface DescribeTimeBasedAutoScalingResult {
        var TimeBasedAutoScalingConfigurations: TimeBasedAutoScalingConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUserProfilesRequest {
        var IamUserArns: Strings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUserProfilesResult {
        var UserProfiles: UserProfiles?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeVolumesRequest {
        var InstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var RaidArrayId: String?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeVolumesResult {
        var Volumes: Volumes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetachElasticLoadBalancerRequest {
        var ElasticLoadBalancerName: String
        var LayerId: String
    }
    interface DisassociateElasticIpRequest {
        var ElasticIp: String
    }
    interface EbsBlockDevice {
        var SnapshotId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Iops: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeSize: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeType: String /* "gp2" | "io1" | "standard" | String */
        var DeleteOnTermination: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EcsCluster {
        var EcsClusterArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var EcsClusterName: String?
            get() = definedExternally
            set(value) = definedExternally
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var RegisteredAt: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ElasticIp {
        var Ip: String?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Domain: String?
            get() = definedExternally
            set(value) = definedExternally
        var Region: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ElasticLoadBalancer {
        var ElasticLoadBalancerName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Region: String?
            get() = definedExternally
            set(value) = definedExternally
        var DnsName: String?
            get() = definedExternally
            set(value) = definedExternally
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var LayerId: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: String?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZones: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var Ec2InstanceIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnvironmentVariable {
        var Key: String
        var Value: String
        var Secure: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetHostnameSuggestionRequest {
        var LayerId: String
    }
    interface GetHostnameSuggestionResult {
        var LayerId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Hostname: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GrantAccessRequest {
        var InstanceId: String
        var ValidForInMinutes: ValidForInMinutes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GrantAccessResult {
        var TemporaryCredential: TemporaryCredential?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Instance {
        var AgentVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var AmiId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Architecture: String /* "x86_64" | "i386" | String */
        var Arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingType: String /* "load" | "timer" | String */
        var AvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var BlockDeviceMappings: BlockDeviceMappings?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var EbsOptimized: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Ec2InstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var EcsClusterArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var EcsContainerInstanceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ElasticIp: String?
            get() = definedExternally
            set(value) = definedExternally
        var Hostname: String?
            get() = definedExternally
            set(value) = definedExternally
        var InfrastructureClass: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstallUpdatesOnBoot: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceProfileArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var LastServiceErrorId: String?
            get() = definedExternally
            set(value) = definedExternally
        var LayerIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var Os: String?
            get() = definedExternally
            set(value) = definedExternally
        var Platform: String?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateDns: String?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateIp: String?
            get() = definedExternally
            set(value) = definedExternally
        var PublicDns: String?
            get() = definedExternally
            set(value) = definedExternally
        var PublicIp: String?
            get() = definedExternally
            set(value) = definedExternally
        var RegisteredBy: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReportedAgentVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReportedOs: ReportedOs?
            get() = definedExternally
            set(value) = definedExternally
        var RootDeviceType: String /* "ebs" | "instance-store" | String */
        var RootDeviceVolumeId: String?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var SshHostDsaKeyFingerprint: String?
            get() = definedExternally
            set(value) = definedExternally
        var SshHostRsaKeyFingerprint: String?
            get() = definedExternally
            set(value) = definedExternally
        var SshKeyName: String?
            get() = definedExternally
            set(value) = definedExternally
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tenancy: String?
            get() = definedExternally
            set(value) = definedExternally
        var VirtualizationType: String /* "paravirtual" | "hvm" | String */
    }
    interface InstanceIdentity {
        var Document: String?
            get() = definedExternally
            set(value) = definedExternally
        var Signature: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstancesCount {
        var Assigning: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Booting: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionLost: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Deregistering: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Online: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Pending: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Rebooting: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Registered: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Registering: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Requested: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var RunningSetup: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var SetupFailed: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ShuttingDown: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var StartFailed: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var StopFailed: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Stopped: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Stopping: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Terminated: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Terminating: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Unassigning: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Layer {
        var Arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var LayerId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "aws-flow-ruby" | "ecs-cluster" | "java-app" | "lb" | "web" | "php-app" | "rails-app" | "nodejs-app" | "memcached" | "db-master" | "monitoring-master" | "custom" | String */
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Shortname: String?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: LayerAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLogsConfiguration: CloudWatchLogsConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CustomInstanceProfileArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var CustomJson: String?
            get() = definedExternally
            set(value) = definedExternally
        var CustomSecurityGroupIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultSecurityGroupNames: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var Packages: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeConfigurations: VolumeConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var EnableAutoHealing: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AutoAssignElasticIps: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AutoAssignPublicIps: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultRecipes: Recipes?
            get() = definedExternally
            set(value) = definedExternally
        var CustomRecipes: Recipes?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var InstallUpdatesOnBoot: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var UseEbsOptimizedInstances: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var LifecycleEventConfiguration: LifecycleEventConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LayerAttributes {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface LifecycleEventConfiguration {
        var Shutdown: ShutdownEventConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsRequest {
        var ResourceArn: ResourceArn
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsResult {
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoadBasedAutoScalingConfiguration {
        var LayerId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Enable: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var UpScaling: AutoScalingThresholds?
            get() = definedExternally
            set(value) = definedExternally
        var DownScaling: AutoScalingThresholds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OperatingSystem {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Id: String?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationManagers: OperatingSystemConfigurationManagers?
            get() = definedExternally
            set(value) = definedExternally
        var ReportedName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReportedVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var Supported: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OperatingSystemConfigurationManager {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Version: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Parameters {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface Permission {
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var IamUserArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var AllowSsh: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AllowSudo: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Level: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RaidArray {
        var RaidArrayId: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var RaidLevel: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfDisks: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Size: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Device: String?
            get() = definedExternally
            set(value) = definedExternally
        var MountPoint: String?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Iops: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RdsDbInstance {
        var RdsDbInstanceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var DbInstanceIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var DbUser: String?
            get() = definedExternally
            set(value) = definedExternally
        var DbPassword: String?
            get() = definedExternally
            set(value) = definedExternally
        var Region: String?
            get() = definedExternally
            set(value) = definedExternally
        var Address: String?
            get() = definedExternally
            set(value) = definedExternally
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var MissingOnRds: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RebootInstanceRequest {
        var InstanceId: String
    }
    interface Recipes {
        var Setup: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var Configure: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var Deploy: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var Undeploy: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var Shutdown: Strings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterEcsClusterRequest {
        var EcsClusterArn: String
        var StackId: String
    }
    interface RegisterEcsClusterResult {
        var EcsClusterArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterElasticIpRequest {
        var ElasticIp: String
        var StackId: String
    }
    interface RegisterElasticIpResult {
        var ElasticIp: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterInstanceRequest {
        var StackId: String
        var Hostname: String?
            get() = definedExternally
            set(value) = definedExternally
        var PublicIp: String?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateIp: String?
            get() = definedExternally
            set(value) = definedExternally
        var RsaPublicKey: String?
            get() = definedExternally
            set(value) = definedExternally
        var RsaPublicKeyFingerprint: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceIdentity: InstanceIdentity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterInstanceResult {
        var InstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterRdsDbInstanceRequest {
        var StackId: String
        var RdsDbInstanceArn: String
        var DbUser: String
        var DbPassword: String
    }
    interface RegisterVolumeRequest {
        var Ec2VolumeId: String?
            get() = definedExternally
            set(value) = definedExternally
        var StackId: String
    }
    interface RegisterVolumeResult {
        var VolumeId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReportedOs {
        var Family: String?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Version: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SelfUserProfile {
        var IamUserArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var SshUsername: String?
            get() = definedExternally
            set(value) = definedExternally
        var SshPublicKey: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServiceError {
        var ServiceErrorId: String?
            get() = definedExternally
            set(value) = definedExternally
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String?
            get() = definedExternally
            set(value) = definedExternally
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetLoadBasedAutoScalingRequest {
        var LayerId: String
        var Enable: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var UpScaling: AutoScalingThresholds?
            get() = definedExternally
            set(value) = definedExternally
        var DownScaling: AutoScalingThresholds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetPermissionRequest {
        var StackId: String
        var IamUserArn: String
        var AllowSsh: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AllowSudo: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Level: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetTimeBasedAutoScalingRequest {
        var InstanceId: String
        var AutoScalingSchedule: WeeklyAutoScalingSchedule?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ShutdownEventConfiguration {
        var ExecutionTimeout: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var DelayUntilElbConnectionsDrained: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Source {
        var Type: String /* "git" | "svn" | "archive" | "s3" | String */
        var Url: String?
            get() = definedExternally
            set(value) = definedExternally
        var Username: String?
            get() = definedExternally
            set(value) = definedExternally
        var Password: String?
            get() = definedExternally
            set(value) = definedExternally
        var SshKey: String?
            get() = definedExternally
            set(value) = definedExternally
        var Revision: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SslConfiguration {
        var Certificate: String
        var PrivateKey: String
        var Chain: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Stack {
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Region: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: StackAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultInstanceProfileArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultOs: String?
            get() = definedExternally
            set(value) = definedExternally
        var HostnameTheme: String?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultAvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultSubnetId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CustomJson: String?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationManager: StackConfigurationManager?
            get() = definedExternally
            set(value) = definedExternally
        var ChefConfiguration: ChefConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var UseCustomCookbooks: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var UseOpsworksSecurityGroups: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CustomCookbooksSource: Source?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultSshKeyName: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultRootDeviceType: String /* "ebs" | "instance-store" | String */
        var AgentVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StackAttributes {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface StackConfigurationManager {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Version: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StackSummary {
        var StackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var LayersCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var AppsCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var InstancesCount: InstancesCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartInstanceRequest {
        var InstanceId: String
    }
    interface StartStackRequest {
        var StackId: String
    }
    interface StopInstanceRequest {
        var InstanceId: String
        var Force: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopStackRequest {
        var StackId: String
    }
    interface TagResourceRequest {
        var ResourceArn: ResourceArn
        var Tags: Tags
    }
    interface Tags {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface TemporaryCredential {
        var Username: String?
            get() = definedExternally
            set(value) = definedExternally
        var Password: String?
            get() = definedExternally
            set(value) = definedExternally
        var ValidForInMinutes: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TimeBasedAutoScalingConfiguration {
        var InstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingSchedule: WeeklyAutoScalingSchedule?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UnassignInstanceRequest {
        var InstanceId: String
    }
    interface UnassignVolumeRequest {
        var VolumeId: String
    }
    interface UntagResourceRequest {
        var ResourceArn: ResourceArn
        var TagKeys: TagKeys
    }
    interface UpdateAppRequest {
        var AppId: String
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var DataSources: DataSources?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "aws-flow-ruby" | "java" | "rails" | "php" | "nodejs" | "static" | "other" | String */
        var AppSource: Source?
            get() = definedExternally
            set(value) = definedExternally
        var Domains: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var EnableSsl: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SslConfiguration: SslConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: AppAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var Environment: EnvironmentVariables?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateElasticIpRequest {
        var ElasticIp: String
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateInstanceRequest {
        var InstanceId: String
        var LayerIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingType: String /* "load" | "timer" | String */
        var Hostname: String?
            get() = definedExternally
            set(value) = definedExternally
        var Os: String?
            get() = definedExternally
            set(value) = definedExternally
        var AmiId: String?
            get() = definedExternally
            set(value) = definedExternally
        var SshKeyName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Architecture: String /* "x86_64" | "i386" | String */
        var InstallUpdatesOnBoot: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EbsOptimized: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AgentVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateLayerRequest {
        var LayerId: String
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Shortname: String?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: LayerAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLogsConfiguration: CloudWatchLogsConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CustomInstanceProfileArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var CustomJson: String?
            get() = definedExternally
            set(value) = definedExternally
        var CustomSecurityGroupIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var Packages: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeConfigurations: VolumeConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var EnableAutoHealing: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AutoAssignElasticIps: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AutoAssignPublicIps: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CustomRecipes: Recipes?
            get() = definedExternally
            set(value) = definedExternally
        var InstallUpdatesOnBoot: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var UseEbsOptimizedInstances: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var LifecycleEventConfiguration: LifecycleEventConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMyUserProfileRequest {
        var SshPublicKey: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRdsDbInstanceRequest {
        var RdsDbInstanceArn: String
        var DbUser: String?
            get() = definedExternally
            set(value) = definedExternally
        var DbPassword: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateStackRequest {
        var StackId: String
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: StackAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultInstanceProfileArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultOs: String?
            get() = definedExternally
            set(value) = definedExternally
        var HostnameTheme: String?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultAvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultSubnetId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CustomJson: String?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationManager: StackConfigurationManager?
            get() = definedExternally
            set(value) = definedExternally
        var ChefConfiguration: ChefConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var UseCustomCookbooks: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CustomCookbooksSource: Source?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultSshKeyName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultRootDeviceType: String /* "ebs" | "instance-store" | String */
        var UseOpsworksSecurityGroups: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AgentVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateUserProfileRequest {
        var IamUserArn: String
        var SshUsername: String?
            get() = definedExternally
            set(value) = definedExternally
        var SshPublicKey: String?
            get() = definedExternally
            set(value) = definedExternally
        var AllowSelfManagement: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateVolumeRequest {
        var VolumeId: String
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var MountPoint: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserProfile {
        var IamUserArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var SshUsername: String?
            get() = definedExternally
            set(value) = definedExternally
        var SshPublicKey: String?
            get() = definedExternally
            set(value) = definedExternally
        var AllowSelfManagement: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Volume {
        var VolumeId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Ec2VolumeId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var RaidArrayId: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var Size: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Device: String?
            get() = definedExternally
            set(value) = definedExternally
        var MountPoint: String?
            get() = definedExternally
            set(value) = definedExternally
        var Region: String?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Iops: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Encrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VolumeConfiguration {
        var MountPoint: String
        var RaidLevel: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfDisks: Integer
        var Size: Integer
        var VolumeType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Iops: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Encrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WeeklyAutoScalingSchedule {
        var Monday: DailyAutoScalingSchedule?
            get() = definedExternally
            set(value) = definedExternally
        var Tuesday: DailyAutoScalingSchedule?
            get() = definedExternally
            set(value) = definedExternally
        var Wednesday: DailyAutoScalingSchedule?
            get() = definedExternally
            set(value) = definedExternally
        var Thursday: DailyAutoScalingSchedule?
            get() = definedExternally
            set(value) = definedExternally
        var Friday: DailyAutoScalingSchedule?
            get() = definedExternally
            set(value) = definedExternally
        var Saturday: DailyAutoScalingSchedule?
            get() = definedExternally
            set(value) = definedExternally
        var Sunday: DailyAutoScalingSchedule?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2013-02-18" | "latest" | String */
    }
}