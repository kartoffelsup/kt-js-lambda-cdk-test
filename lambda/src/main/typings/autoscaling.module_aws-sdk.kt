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
import AutoScaling.Activity
import AutoScaling.AdjustmentType
import AutoScaling.Alarm
import AutoScaling.AutoScalingGroup
import AutoScaling.AutoScalingInstanceDetails
import AutoScaling.BlockDeviceMapping
import AutoScaling.EnabledMetric
import AutoScaling.FailedScheduledUpdateGroupActionRequest
import AutoScaling.Filter
import AutoScaling.Instance
import AutoScaling.LaunchConfiguration
import AutoScaling.LifecycleHookSpecification
import AutoScaling.LifecycleHook
import AutoScaling.LoadBalancerState
import AutoScaling.LoadBalancerTargetGroupState
import AutoScaling.MetricCollectionType
import AutoScaling.MetricDimension
import AutoScaling.MetricGranularityType
import AutoScaling.NotificationConfiguration
import AutoScaling.LaunchTemplateOverrides
import AutoScaling.ProcessType
import AutoScaling.ScalingPolicy
import AutoScaling.ScheduledUpdateGroupActionRequest
import AutoScaling.ScheduledUpdateGroupAction
import AutoScaling.StepAdjustment
import AutoScaling.SuspendedProcess
import AutoScaling.TagDescription
import AutoScaling.Tag
import AutoScaling.AttachInstancesQuery
import AutoScaling.AttachLoadBalancerTargetGroupsType
import AutoScaling.AttachLoadBalancerTargetGroupsResultType
import AutoScaling.AttachLoadBalancersType
import AutoScaling.AttachLoadBalancersResultType
import AutoScaling.BatchDeleteScheduledActionType
import AutoScaling.BatchDeleteScheduledActionAnswer
import AutoScaling.BatchPutScheduledUpdateGroupActionType
import AutoScaling.BatchPutScheduledUpdateGroupActionAnswer
import AutoScaling.CompleteLifecycleActionType
import AutoScaling.CompleteLifecycleActionAnswer
import AutoScaling.CreateAutoScalingGroupType
import AutoScaling.CreateLaunchConfigurationType
import AutoScaling.CreateOrUpdateTagsType
import AutoScaling.DeleteAutoScalingGroupType
import AutoScaling.LaunchConfigurationNameType
import AutoScaling.DeleteLifecycleHookType
import AutoScaling.DeleteLifecycleHookAnswer
import AutoScaling.DeleteNotificationConfigurationType
import AutoScaling.DeletePolicyType
import AutoScaling.DeleteScheduledActionType
import AutoScaling.DeleteTagsType
import AutoScaling.DescribeAccountLimitsAnswer
import AutoScaling.DescribeAdjustmentTypesAnswer
import AutoScaling.AutoScalingGroupNamesType
import AutoScaling.AutoScalingGroupsType
import AutoScaling.DescribeAutoScalingInstancesType
import AutoScaling.AutoScalingInstancesType
import AutoScaling.DescribeAutoScalingNotificationTypesAnswer
import AutoScaling.LaunchConfigurationNamesType
import AutoScaling.LaunchConfigurationsType
import AutoScaling.DescribeLifecycleHookTypesAnswer
import AutoScaling.DescribeLifecycleHooksType
import AutoScaling.DescribeLifecycleHooksAnswer
import AutoScaling.DescribeLoadBalancerTargetGroupsRequest
import AutoScaling.DescribeLoadBalancerTargetGroupsResponse
import AutoScaling.DescribeLoadBalancersRequest
import AutoScaling.DescribeLoadBalancersResponse
import AutoScaling.DescribeMetricCollectionTypesAnswer
import AutoScaling.DescribeNotificationConfigurationsType
import AutoScaling.DescribeNotificationConfigurationsAnswer
import AutoScaling.DescribePoliciesType
import AutoScaling.PoliciesType
import AutoScaling.DescribeScalingActivitiesType
import AutoScaling.ActivitiesType
import AutoScaling.ProcessesType
import AutoScaling.DescribeScheduledActionsType
import AutoScaling.ScheduledActionsType
import AutoScaling.DescribeTagsType
import AutoScaling.TagsType
import AutoScaling.DescribeTerminationPolicyTypesAnswer
import AutoScaling.DetachInstancesQuery
import AutoScaling.DetachInstancesAnswer
import AutoScaling.DetachLoadBalancerTargetGroupsType
import AutoScaling.DetachLoadBalancerTargetGroupsResultType
import AutoScaling.DetachLoadBalancersType
import AutoScaling.DetachLoadBalancersResultType
import AutoScaling.DisableMetricsCollectionQuery
import AutoScaling.EnableMetricsCollectionQuery
import AutoScaling.EnterStandbyQuery
import AutoScaling.EnterStandbyAnswer
import AutoScaling.ExecutePolicyType
import AutoScaling.ExitStandbyQuery
import AutoScaling.ExitStandbyAnswer
import AutoScaling.PutLifecycleHookType
import AutoScaling.PutLifecycleHookAnswer
import AutoScaling.PutNotificationConfigurationType
import AutoScaling.PutScalingPolicyType
import AutoScaling.PolicyARNType
import AutoScaling.PutScheduledUpdateGroupActionType
import AutoScaling.RecordLifecycleActionHeartbeatType
import AutoScaling.RecordLifecycleActionHeartbeatAnswer
import AutoScaling.ScalingProcessQuery
import AutoScaling.SetDesiredCapacityType
import AutoScaling.SetInstanceHealthQuery
import AutoScaling.SetInstanceProtectionQuery
import AutoScaling.SetInstanceProtectionAnswer
import AutoScaling.TerminateInstanceInAutoScalingGroupType
import AutoScaling.ActivityType
import AutoScaling.UpdateAutoScalingGroupType
import AutoScaling.LaunchTemplateSpecification
import AutoScaling.MixedInstancesPolicy
import AutoScaling.Ebs
import AutoScaling.InstanceMonitoring
import AutoScaling.LaunchTemplate
import AutoScaling.InstancesDistribution
import AutoScaling.TargetTrackingConfiguration
import AutoScaling.PredefinedMetricSpecification
import AutoScaling.CustomizedMetricSpecification

typealias Activities = Array<Activity>

typealias ActivityIds = Array<XmlString>

typealias AdjustmentTypes = Array<AdjustmentType>

typealias Alarms = Array<Alarm>

typealias AsciiStringMaxLen255 = String

typealias AssociatePublicIpAddress = Boolean

typealias AutoScalingGroupDesiredCapacity = Number

typealias AutoScalingGroupMaxSize = Number

typealias AutoScalingGroupMinSize = Number

typealias AutoScalingGroupNames = Array<ResourceName>

typealias AutoScalingGroups = Array<AutoScalingGroup>

typealias AutoScalingInstances = Array<AutoScalingInstanceDetails>

typealias AutoScalingNotificationTypes = Array<XmlStringMaxLen255>

typealias AvailabilityZones = Array<XmlStringMaxLen255>

typealias BlockDeviceEbsDeleteOnTermination = Boolean

typealias BlockDeviceEbsEncrypted = Boolean

typealias BlockDeviceEbsIops = Number

typealias BlockDeviceEbsVolumeSize = Number

typealias BlockDeviceEbsVolumeType = String

typealias BlockDeviceMappings = Array<BlockDeviceMapping>

typealias ClassicLinkVPCSecurityGroups = Array<XmlStringMaxLen255>

typealias Cooldown = Number

typealias DisableScaleIn = Boolean

typealias EbsOptimized = Boolean

typealias EnabledMetrics = Array<EnabledMetric>

typealias EstimatedInstanceWarmup = Number

typealias FailedScheduledUpdateGroupActionRequests = Array<FailedScheduledUpdateGroupActionRequest>

typealias Filters = Array<Filter>

typealias ForceDelete = Boolean

typealias GlobalTimeout = Number

typealias HealthCheckGracePeriod = Number

typealias HeartbeatTimeout = Number

typealias HonorCooldown = Boolean

typealias InstanceIds = Array<XmlStringMaxLen19>

typealias InstanceProtected = Boolean

typealias Instances = Array<Instance>

typealias LaunchConfigurationNames = Array<ResourceName>

typealias LaunchConfigurations = Array<LaunchConfiguration>

typealias LaunchTemplateName = String

typealias LifecycleActionResult = String

typealias LifecycleActionToken = String

typealias LifecycleHookNames = Array<AsciiStringMaxLen255>

typealias LifecycleHookSpecifications = Array<LifecycleHookSpecification>

typealias LifecycleHooks = Array<LifecycleHook>

typealias LifecycleTransition = String

typealias LoadBalancerNames = Array<XmlStringMaxLen255>

typealias LoadBalancerStates = Array<LoadBalancerState>

typealias LoadBalancerTargetGroupStates = Array<LoadBalancerTargetGroupState>

typealias MaxInstanceLifetime = Number

typealias MaxNumberOfAutoScalingGroups = Number

typealias MaxNumberOfLaunchConfigurations = Number

typealias MaxRecords = Number

typealias MetricCollectionTypes = Array<MetricCollectionType>

typealias MetricDimensionName = String

typealias MetricDimensionValue = String

typealias MetricDimensions = Array<MetricDimension>

typealias MetricGranularityTypes = Array<MetricGranularityType>

typealias MetricName = String

typealias MetricNamespace = String

typealias MetricScale = Number

typealias MetricUnit = String

typealias Metrics = Array<XmlStringMaxLen255>

typealias MinAdjustmentMagnitude = Number

typealias MinAdjustmentStep = Number

typealias MixedInstanceSpotPrice = String

typealias MonitoringEnabled = Boolean

typealias NoDevice = Boolean

typealias NotificationConfigurations = Array<NotificationConfiguration>

typealias NotificationTargetResourceName = String

typealias NumberOfAutoScalingGroups = Number

typealias NumberOfLaunchConfigurations = Number

typealias OnDemandBaseCapacity = Number

typealias OnDemandPercentageAboveBaseCapacity = Number

typealias Overrides = Array<LaunchTemplateOverrides>

typealias PolicyIncrement = Number

typealias PolicyNames = Array<ResourceName>

typealias PolicyTypes = Array<XmlStringMaxLen64>

typealias ProcessNames = Array<XmlStringMaxLen255>

typealias Processes = Array<ProcessType>

typealias Progress = Number

typealias PropagateAtLaunch = Boolean

typealias ProtectedFromScaleIn = Boolean

typealias ResourceName = String

typealias ScalingPolicies = Array<ScalingPolicy>

typealias ScalingPolicyEnabled = Boolean

typealias ScheduledActionNames = Array<ResourceName>

typealias ScheduledUpdateGroupActionRequests = Array<ScheduledUpdateGroupActionRequest>

typealias ScheduledUpdateGroupActions = Array<ScheduledUpdateGroupAction>

typealias SecurityGroups = Array<XmlString>

typealias ShouldDecrementDesiredCapacity = Boolean

typealias ShouldRespectGracePeriod = Boolean

typealias SpotInstancePools = Number

typealias SpotPrice = String

typealias StepAdjustments = Array<StepAdjustment>

typealias SuspendedProcesses = Array<SuspendedProcess>

typealias TagDescriptionList = Array<TagDescription>

typealias TagKey = String

typealias TagValue = String

typealias Tags = Array<Tag>

typealias TargetGroupARNs = Array<XmlStringMaxLen511>

typealias TerminationPolicies = Array<XmlStringMaxLen1600>

typealias TimestampType = Date

typealias Values = Array<XmlString>

typealias XmlString = String

typealias XmlStringMaxLen1023 = String

typealias XmlStringMaxLen1600 = String

typealias XmlStringMaxLen19 = String

typealias XmlStringMaxLen2047 = String

typealias XmlStringMaxLen255 = String

typealias XmlStringMaxLen32 = String

typealias XmlStringMaxLen511 = String

typealias XmlStringMaxLen64 = String

typealias XmlStringUserData = String

@JsModule("aws-sdk")
external open class AutoScaling(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & AutoScaling.Types.ClientConfiguration */
    open fun attachInstances(params: AttachInstancesQuery, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun attachInstances(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun attachLoadBalancerTargetGroups(params: AttachLoadBalancerTargetGroupsType, callback: (err: AWSError, data: AttachLoadBalancerTargetGroupsResultType) -> Unit = definedExternally): Request<AttachLoadBalancerTargetGroupsResultType, AWSError>
    open fun attachLoadBalancerTargetGroups(callback: (err: AWSError, data: AttachLoadBalancerTargetGroupsResultType) -> Unit = definedExternally): Request<AttachLoadBalancerTargetGroupsResultType, AWSError>
    open fun attachLoadBalancers(params: AttachLoadBalancersType, callback: (err: AWSError, data: AttachLoadBalancersResultType) -> Unit = definedExternally): Request<AttachLoadBalancersResultType, AWSError>
    open fun attachLoadBalancers(callback: (err: AWSError, data: AttachLoadBalancersResultType) -> Unit = definedExternally): Request<AttachLoadBalancersResultType, AWSError>
    open fun batchDeleteScheduledAction(params: BatchDeleteScheduledActionType, callback: (err: AWSError, data: BatchDeleteScheduledActionAnswer) -> Unit = definedExternally): Request<BatchDeleteScheduledActionAnswer, AWSError>
    open fun batchDeleteScheduledAction(callback: (err: AWSError, data: BatchDeleteScheduledActionAnswer) -> Unit = definedExternally): Request<BatchDeleteScheduledActionAnswer, AWSError>
    open fun batchPutScheduledUpdateGroupAction(params: BatchPutScheduledUpdateGroupActionType, callback: (err: AWSError, data: BatchPutScheduledUpdateGroupActionAnswer) -> Unit = definedExternally): Request<BatchPutScheduledUpdateGroupActionAnswer, AWSError>
    open fun batchPutScheduledUpdateGroupAction(callback: (err: AWSError, data: BatchPutScheduledUpdateGroupActionAnswer) -> Unit = definedExternally): Request<BatchPutScheduledUpdateGroupActionAnswer, AWSError>
    open fun completeLifecycleAction(params: CompleteLifecycleActionType, callback: (err: AWSError, data: CompleteLifecycleActionAnswer) -> Unit = definedExternally): Request<CompleteLifecycleActionAnswer, AWSError>
    open fun completeLifecycleAction(callback: (err: AWSError, data: CompleteLifecycleActionAnswer) -> Unit = definedExternally): Request<CompleteLifecycleActionAnswer, AWSError>
    open fun createAutoScalingGroup(params: CreateAutoScalingGroupType, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createAutoScalingGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createLaunchConfiguration(params: CreateLaunchConfigurationType, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createLaunchConfiguration(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createOrUpdateTags(params: CreateOrUpdateTagsType, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createOrUpdateTags(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAutoScalingGroup(params: DeleteAutoScalingGroupType, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAutoScalingGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteLaunchConfiguration(params: LaunchConfigurationNameType, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteLaunchConfiguration(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteLifecycleHook(params: DeleteLifecycleHookType, callback: (err: AWSError, data: DeleteLifecycleHookAnswer) -> Unit = definedExternally): Request<DeleteLifecycleHookAnswer, AWSError>
    open fun deleteLifecycleHook(callback: (err: AWSError, data: DeleteLifecycleHookAnswer) -> Unit = definedExternally): Request<DeleteLifecycleHookAnswer, AWSError>
    open fun deleteNotificationConfiguration(params: DeleteNotificationConfigurationType, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteNotificationConfiguration(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePolicy(params: DeletePolicyType, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteScheduledAction(params: DeleteScheduledActionType, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteScheduledAction(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteTags(params: DeleteTagsType, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteTags(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeAccountLimits(callback: (err: AWSError, data: DescribeAccountLimitsAnswer) -> Unit = definedExternally): Request<DescribeAccountLimitsAnswer, AWSError>
    open fun describeAdjustmentTypes(callback: (err: AWSError, data: DescribeAdjustmentTypesAnswer) -> Unit = definedExternally): Request<DescribeAdjustmentTypesAnswer, AWSError>
    open fun describeAutoScalingGroups(params: AutoScalingGroupNamesType, callback: (err: AWSError, data: AutoScalingGroupsType) -> Unit = definedExternally): Request<AutoScalingGroupsType, AWSError>
    open fun describeAutoScalingGroups(callback: (err: AWSError, data: AutoScalingGroupsType) -> Unit = definedExternally): Request<AutoScalingGroupsType, AWSError>
    open fun describeAutoScalingInstances(params: DescribeAutoScalingInstancesType, callback: (err: AWSError, data: AutoScalingInstancesType) -> Unit = definedExternally): Request<AutoScalingInstancesType, AWSError>
    open fun describeAutoScalingInstances(callback: (err: AWSError, data: AutoScalingInstancesType) -> Unit = definedExternally): Request<AutoScalingInstancesType, AWSError>
    open fun describeAutoScalingNotificationTypes(callback: (err: AWSError, data: DescribeAutoScalingNotificationTypesAnswer) -> Unit = definedExternally): Request<DescribeAutoScalingNotificationTypesAnswer, AWSError>
    open fun describeLaunchConfigurations(params: LaunchConfigurationNamesType, callback: (err: AWSError, data: LaunchConfigurationsType) -> Unit = definedExternally): Request<LaunchConfigurationsType, AWSError>
    open fun describeLaunchConfigurations(callback: (err: AWSError, data: LaunchConfigurationsType) -> Unit = definedExternally): Request<LaunchConfigurationsType, AWSError>
    open fun describeLifecycleHookTypes(callback: (err: AWSError, data: DescribeLifecycleHookTypesAnswer) -> Unit = definedExternally): Request<DescribeLifecycleHookTypesAnswer, AWSError>
    open fun describeLifecycleHooks(params: DescribeLifecycleHooksType, callback: (err: AWSError, data: DescribeLifecycleHooksAnswer) -> Unit = definedExternally): Request<DescribeLifecycleHooksAnswer, AWSError>
    open fun describeLifecycleHooks(callback: (err: AWSError, data: DescribeLifecycleHooksAnswer) -> Unit = definedExternally): Request<DescribeLifecycleHooksAnswer, AWSError>
    open fun describeLoadBalancerTargetGroups(params: DescribeLoadBalancerTargetGroupsRequest, callback: (err: AWSError, data: DescribeLoadBalancerTargetGroupsResponse) -> Unit = definedExternally): Request<DescribeLoadBalancerTargetGroupsResponse, AWSError>
    open fun describeLoadBalancerTargetGroups(callback: (err: AWSError, data: DescribeLoadBalancerTargetGroupsResponse) -> Unit = definedExternally): Request<DescribeLoadBalancerTargetGroupsResponse, AWSError>
    open fun describeLoadBalancers(params: DescribeLoadBalancersRequest, callback: (err: AWSError, data: DescribeLoadBalancersResponse) -> Unit = definedExternally): Request<DescribeLoadBalancersResponse, AWSError>
    open fun describeLoadBalancers(callback: (err: AWSError, data: DescribeLoadBalancersResponse) -> Unit = definedExternally): Request<DescribeLoadBalancersResponse, AWSError>
    open fun describeMetricCollectionTypes(callback: (err: AWSError, data: DescribeMetricCollectionTypesAnswer) -> Unit = definedExternally): Request<DescribeMetricCollectionTypesAnswer, AWSError>
    open fun describeNotificationConfigurations(params: DescribeNotificationConfigurationsType, callback: (err: AWSError, data: DescribeNotificationConfigurationsAnswer) -> Unit = definedExternally): Request<DescribeNotificationConfigurationsAnswer, AWSError>
    open fun describeNotificationConfigurations(callback: (err: AWSError, data: DescribeNotificationConfigurationsAnswer) -> Unit = definedExternally): Request<DescribeNotificationConfigurationsAnswer, AWSError>
    open fun describePolicies(params: DescribePoliciesType, callback: (err: AWSError, data: PoliciesType) -> Unit = definedExternally): Request<PoliciesType, AWSError>
    open fun describePolicies(callback: (err: AWSError, data: PoliciesType) -> Unit = definedExternally): Request<PoliciesType, AWSError>
    open fun describeScalingActivities(params: DescribeScalingActivitiesType, callback: (err: AWSError, data: ActivitiesType) -> Unit = definedExternally): Request<ActivitiesType, AWSError>
    open fun describeScalingActivities(callback: (err: AWSError, data: ActivitiesType) -> Unit = definedExternally): Request<ActivitiesType, AWSError>
    open fun describeScalingProcessTypes(callback: (err: AWSError, data: ProcessesType) -> Unit = definedExternally): Request<ProcessesType, AWSError>
    open fun describeScheduledActions(params: DescribeScheduledActionsType, callback: (err: AWSError, data: ScheduledActionsType) -> Unit = definedExternally): Request<ScheduledActionsType, AWSError>
    open fun describeScheduledActions(callback: (err: AWSError, data: ScheduledActionsType) -> Unit = definedExternally): Request<ScheduledActionsType, AWSError>
    open fun describeTags(params: DescribeTagsType, callback: (err: AWSError, data: TagsType) -> Unit = definedExternally): Request<TagsType, AWSError>
    open fun describeTags(callback: (err: AWSError, data: TagsType) -> Unit = definedExternally): Request<TagsType, AWSError>
    open fun describeTerminationPolicyTypes(callback: (err: AWSError, data: DescribeTerminationPolicyTypesAnswer) -> Unit = definedExternally): Request<DescribeTerminationPolicyTypesAnswer, AWSError>
    open fun detachInstances(params: DetachInstancesQuery, callback: (err: AWSError, data: DetachInstancesAnswer) -> Unit = definedExternally): Request<DetachInstancesAnswer, AWSError>
    open fun detachInstances(callback: (err: AWSError, data: DetachInstancesAnswer) -> Unit = definedExternally): Request<DetachInstancesAnswer, AWSError>
    open fun detachLoadBalancerTargetGroups(params: DetachLoadBalancerTargetGroupsType, callback: (err: AWSError, data: DetachLoadBalancerTargetGroupsResultType) -> Unit = definedExternally): Request<DetachLoadBalancerTargetGroupsResultType, AWSError>
    open fun detachLoadBalancerTargetGroups(callback: (err: AWSError, data: DetachLoadBalancerTargetGroupsResultType) -> Unit = definedExternally): Request<DetachLoadBalancerTargetGroupsResultType, AWSError>
    open fun detachLoadBalancers(params: DetachLoadBalancersType, callback: (err: AWSError, data: DetachLoadBalancersResultType) -> Unit = definedExternally): Request<DetachLoadBalancersResultType, AWSError>
    open fun detachLoadBalancers(callback: (err: AWSError, data: DetachLoadBalancersResultType) -> Unit = definedExternally): Request<DetachLoadBalancersResultType, AWSError>
    open fun disableMetricsCollection(params: DisableMetricsCollectionQuery, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disableMetricsCollection(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun enableMetricsCollection(params: EnableMetricsCollectionQuery, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun enableMetricsCollection(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun enterStandby(params: EnterStandbyQuery, callback: (err: AWSError, data: EnterStandbyAnswer) -> Unit = definedExternally): Request<EnterStandbyAnswer, AWSError>
    open fun enterStandby(callback: (err: AWSError, data: EnterStandbyAnswer) -> Unit = definedExternally): Request<EnterStandbyAnswer, AWSError>
    open fun executePolicy(params: ExecutePolicyType, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun executePolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun exitStandby(params: ExitStandbyQuery, callback: (err: AWSError, data: ExitStandbyAnswer) -> Unit = definedExternally): Request<ExitStandbyAnswer, AWSError>
    open fun exitStandby(callback: (err: AWSError, data: ExitStandbyAnswer) -> Unit = definedExternally): Request<ExitStandbyAnswer, AWSError>
    open fun putLifecycleHook(params: PutLifecycleHookType, callback: (err: AWSError, data: PutLifecycleHookAnswer) -> Unit = definedExternally): Request<PutLifecycleHookAnswer, AWSError>
    open fun putLifecycleHook(callback: (err: AWSError, data: PutLifecycleHookAnswer) -> Unit = definedExternally): Request<PutLifecycleHookAnswer, AWSError>
    open fun putNotificationConfiguration(params: PutNotificationConfigurationType, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putNotificationConfiguration(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putScalingPolicy(params: PutScalingPolicyType, callback: (err: AWSError, data: PolicyARNType) -> Unit = definedExternally): Request<PolicyARNType, AWSError>
    open fun putScalingPolicy(callback: (err: AWSError, data: PolicyARNType) -> Unit = definedExternally): Request<PolicyARNType, AWSError>
    open fun putScheduledUpdateGroupAction(params: PutScheduledUpdateGroupActionType, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putScheduledUpdateGroupAction(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun recordLifecycleActionHeartbeat(params: RecordLifecycleActionHeartbeatType, callback: (err: AWSError, data: RecordLifecycleActionHeartbeatAnswer) -> Unit = definedExternally): Request<RecordLifecycleActionHeartbeatAnswer, AWSError>
    open fun recordLifecycleActionHeartbeat(callback: (err: AWSError, data: RecordLifecycleActionHeartbeatAnswer) -> Unit = definedExternally): Request<RecordLifecycleActionHeartbeatAnswer, AWSError>
    open fun resumeProcesses(params: ScalingProcessQuery, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun resumeProcesses(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setDesiredCapacity(params: SetDesiredCapacityType, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setDesiredCapacity(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setInstanceHealth(params: SetInstanceHealthQuery, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setInstanceHealth(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setInstanceProtection(params: SetInstanceProtectionQuery, callback: (err: AWSError, data: SetInstanceProtectionAnswer) -> Unit = definedExternally): Request<SetInstanceProtectionAnswer, AWSError>
    open fun setInstanceProtection(callback: (err: AWSError, data: SetInstanceProtectionAnswer) -> Unit = definedExternally): Request<SetInstanceProtectionAnswer, AWSError>
    open fun suspendProcesses(params: ScalingProcessQuery, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun suspendProcesses(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun terminateInstanceInAutoScalingGroup(params: TerminateInstanceInAutoScalingGroupType, callback: (err: AWSError, data: ActivityType) -> Unit = definedExternally): Request<ActivityType, AWSError>
    open fun terminateInstanceInAutoScalingGroup(callback: (err: AWSError, data: ActivityType) -> Unit = definedExternally): Request<ActivityType, AWSError>
    open fun updateAutoScalingGroup(params: UpdateAutoScalingGroupType, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateAutoScalingGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    interface ActivitiesType {
        var Activities: Activities
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Activity {
        var ActivityId: XmlString
        var AutoScalingGroupName: XmlStringMaxLen255
        var Description: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var Cause: XmlStringMaxLen1023
        var StartTime: TimestampType
        var EndTime: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var StatusCode: String /* "PendingSpotBidPlacement" | "WaitingForSpotInstanceRequestId" | "WaitingForSpotInstanceId" | "WaitingForInstanceId" | "PreInService" | "InProgress" | "WaitingForELBConnectionDraining" | "MidLifecycleAction" | "WaitingForInstanceWarmup" | "Successful" | "Failed" | "Cancelled" | String */
        var StatusMessage: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var Progress: Progress?
            get() = definedExternally
            set(value) = definedExternally
        var Details: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActivityType {
        var Activity: Activity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdjustmentType {
        var AdjustmentType: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Alarm {
        var AlarmName: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var AlarmARN: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttachInstancesQuery {
        var InstanceIds: InstanceIds?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingGroupName: ResourceName
    }
    interface AttachLoadBalancerTargetGroupsResultType
    interface AttachLoadBalancerTargetGroupsType {
        var AutoScalingGroupName: ResourceName
        var TargetGroupARNs: TargetGroupARNs
    }
    interface AttachLoadBalancersResultType
    interface AttachLoadBalancersType {
        var AutoScalingGroupName: ResourceName
        var LoadBalancerNames: LoadBalancerNames
    }
    interface AutoScalingGroup {
        var AutoScalingGroupName: XmlStringMaxLen255
        var AutoScalingGroupARN: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var LaunchConfigurationName: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var LaunchTemplate: LaunchTemplateSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var MixedInstancesPolicy: MixedInstancesPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var MinSize: AutoScalingGroupMinSize
        var MaxSize: AutoScalingGroupMaxSize
        var DesiredCapacity: AutoScalingGroupDesiredCapacity
        var DefaultCooldown: Cooldown
        var AvailabilityZones: AvailabilityZones
        var LoadBalancerNames: LoadBalancerNames?
            get() = definedExternally
            set(value) = definedExternally
        var TargetGroupARNs: TargetGroupARNs?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckType: XmlStringMaxLen32
        var HealthCheckGracePeriod: HealthCheckGracePeriod?
            get() = definedExternally
            set(value) = definedExternally
        var Instances: Instances?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: TimestampType
        var SuspendedProcesses: SuspendedProcesses?
            get() = definedExternally
            set(value) = definedExternally
        var PlacementGroup: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var VPCZoneIdentifier: XmlStringMaxLen2047?
            get() = definedExternally
            set(value) = definedExternally
        var EnabledMetrics: EnabledMetrics?
            get() = definedExternally
            set(value) = definedExternally
        var Status: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagDescriptionList?
            get() = definedExternally
            set(value) = definedExternally
        var TerminationPolicies: TerminationPolicies?
            get() = definedExternally
            set(value) = definedExternally
        var NewInstancesProtectedFromScaleIn: InstanceProtected?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceLinkedRoleARN: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var MaxInstanceLifetime: MaxInstanceLifetime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoScalingGroupNamesType {
        var AutoScalingGroupNames: AutoScalingGroupNames?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: MaxRecords?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoScalingGroupsType {
        var AutoScalingGroups: AutoScalingGroups
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoScalingInstanceDetails {
        var InstanceId: XmlStringMaxLen19
        var InstanceType: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingGroupName: XmlStringMaxLen255
        var AvailabilityZone: XmlStringMaxLen255
        var LifecycleState: XmlStringMaxLen32
        var HealthStatus: XmlStringMaxLen32
        var LaunchConfigurationName: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var LaunchTemplate: LaunchTemplateSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var ProtectedFromScaleIn: InstanceProtected
        var WeightedCapacity: XmlStringMaxLen32?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoScalingInstancesType {
        var AutoScalingInstances: AutoScalingInstances?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDeleteScheduledActionAnswer {
        var FailedScheduledActions: FailedScheduledUpdateGroupActionRequests?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDeleteScheduledActionType {
        var AutoScalingGroupName: ResourceName
        var ScheduledActionNames: ScheduledActionNames
    }
    interface BatchPutScheduledUpdateGroupActionAnswer {
        var FailedScheduledUpdateGroupActions: FailedScheduledUpdateGroupActionRequests?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchPutScheduledUpdateGroupActionType {
        var AutoScalingGroupName: ResourceName
        var ScheduledUpdateGroupActions: ScheduledUpdateGroupActionRequests
    }
    interface BlockDeviceMapping {
        var VirtualName: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceName: XmlStringMaxLen255
        var Ebs: Ebs?
            get() = definedExternally
            set(value) = definedExternally
        var NoDevice: NoDevice?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CompleteLifecycleActionAnswer
    interface CompleteLifecycleActionType {
        var LifecycleHookName: AsciiStringMaxLen255
        var AutoScalingGroupName: ResourceName
        var LifecycleActionToken: LifecycleActionToken?
            get() = definedExternally
            set(value) = definedExternally
        var LifecycleActionResult: LifecycleActionResult
        var InstanceId: XmlStringMaxLen19?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAutoScalingGroupType {
        var AutoScalingGroupName: XmlStringMaxLen255
        var LaunchConfigurationName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var LaunchTemplate: LaunchTemplateSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var MixedInstancesPolicy: MixedInstancesPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: XmlStringMaxLen19?
            get() = definedExternally
            set(value) = definedExternally
        var MinSize: AutoScalingGroupMinSize
        var MaxSize: AutoScalingGroupMaxSize
        var DesiredCapacity: AutoScalingGroupDesiredCapacity?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultCooldown: Cooldown?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZones: AvailabilityZones?
            get() = definedExternally
            set(value) = definedExternally
        var LoadBalancerNames: LoadBalancerNames?
            get() = definedExternally
            set(value) = definedExternally
        var TargetGroupARNs: TargetGroupARNs?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckType: XmlStringMaxLen32?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckGracePeriod: HealthCheckGracePeriod?
            get() = definedExternally
            set(value) = definedExternally
        var PlacementGroup: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var VPCZoneIdentifier: XmlStringMaxLen2047?
            get() = definedExternally
            set(value) = definedExternally
        var TerminationPolicies: TerminationPolicies?
            get() = definedExternally
            set(value) = definedExternally
        var NewInstancesProtectedFromScaleIn: InstanceProtected?
            get() = definedExternally
            set(value) = definedExternally
        var LifecycleHookSpecificationList: LifecycleHookSpecifications?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceLinkedRoleARN: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var MaxInstanceLifetime: MaxInstanceLifetime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLaunchConfigurationType {
        var LaunchConfigurationName: XmlStringMaxLen255
        var ImageId: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var KeyName: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroups: SecurityGroups?
            get() = definedExternally
            set(value) = definedExternally
        var ClassicLinkVPCId: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var ClassicLinkVPCSecurityGroups: ClassicLinkVPCSecurityGroups?
            get() = definedExternally
            set(value) = definedExternally
        var UserData: XmlStringUserData?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: XmlStringMaxLen19?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var KernelId: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var RamdiskId: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var BlockDeviceMappings: BlockDeviceMappings?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceMonitoring: InstanceMonitoring?
            get() = definedExternally
            set(value) = definedExternally
        var SpotPrice: SpotPrice?
            get() = definedExternally
            set(value) = definedExternally
        var IamInstanceProfile: XmlStringMaxLen1600?
            get() = definedExternally
            set(value) = definedExternally
        var EbsOptimized: EbsOptimized?
            get() = definedExternally
            set(value) = definedExternally
        var AssociatePublicIpAddress: AssociatePublicIpAddress?
            get() = definedExternally
            set(value) = definedExternally
        var PlacementTenancy: XmlStringMaxLen64?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateOrUpdateTagsType {
        var Tags: Tags
    }
    interface CustomizedMetricSpecification {
        var MetricName: MetricName
        var Namespace: MetricNamespace
        var Dimensions: MetricDimensions?
            get() = definedExternally
            set(value) = definedExternally
        var Statistic: String /* "Average" | "Minimum" | "Maximum" | "SampleCount" | "Sum" | String */
        var Unit: MetricUnit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAutoScalingGroupType {
        var AutoScalingGroupName: ResourceName
        var ForceDelete: ForceDelete?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteLifecycleHookAnswer
    interface DeleteLifecycleHookType {
        var LifecycleHookName: AsciiStringMaxLen255
        var AutoScalingGroupName: ResourceName
    }
    interface DeleteNotificationConfigurationType {
        var AutoScalingGroupName: ResourceName
        var TopicARN: ResourceName
    }
    interface DeletePolicyType {
        var AutoScalingGroupName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyName: ResourceName
    }
    interface DeleteScheduledActionType {
        var AutoScalingGroupName: ResourceName
        var ScheduledActionName: ResourceName
    }
    interface DeleteTagsType {
        var Tags: Tags
    }
    interface DescribeAccountLimitsAnswer {
        var MaxNumberOfAutoScalingGroups: MaxNumberOfAutoScalingGroups?
            get() = definedExternally
            set(value) = definedExternally
        var MaxNumberOfLaunchConfigurations: MaxNumberOfLaunchConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfAutoScalingGroups: NumberOfAutoScalingGroups?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfLaunchConfigurations: NumberOfLaunchConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAdjustmentTypesAnswer {
        var AdjustmentTypes: AdjustmentTypes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAutoScalingInstancesType {
        var InstanceIds: InstanceIds?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: MaxRecords?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAutoScalingNotificationTypesAnswer {
        var AutoScalingNotificationTypes: AutoScalingNotificationTypes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLifecycleHookTypesAnswer {
        var LifecycleHookTypes: AutoScalingNotificationTypes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLifecycleHooksAnswer {
        var LifecycleHooks: LifecycleHooks?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLifecycleHooksType {
        var AutoScalingGroupName: ResourceName
        var LifecycleHookNames: LifecycleHookNames?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLoadBalancerTargetGroupsRequest {
        var AutoScalingGroupName: ResourceName
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: MaxRecords?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLoadBalancerTargetGroupsResponse {
        var LoadBalancerTargetGroups: LoadBalancerTargetGroupStates?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLoadBalancersRequest {
        var AutoScalingGroupName: ResourceName
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: MaxRecords?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLoadBalancersResponse {
        var LoadBalancers: LoadBalancerStates?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMetricCollectionTypesAnswer {
        var Metrics: MetricCollectionTypes?
            get() = definedExternally
            set(value) = definedExternally
        var Granularities: MetricGranularityTypes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeNotificationConfigurationsAnswer {
        var NotificationConfigurations: NotificationConfigurations
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeNotificationConfigurationsType {
        var AutoScalingGroupNames: AutoScalingGroupNames?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: MaxRecords?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePoliciesType {
        var AutoScalingGroupName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyNames: PolicyNames?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyTypes: PolicyTypes?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: MaxRecords?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeScalingActivitiesType {
        var ActivityIds: ActivityIds?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingGroupName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: MaxRecords?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeScheduledActionsType {
        var AutoScalingGroupName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduledActionNames: ScheduledActionNames?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: MaxRecords?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTagsType {
        var Filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: MaxRecords?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTerminationPolicyTypesAnswer {
        var TerminationPolicyTypes: TerminationPolicies?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetachInstancesAnswer {
        var Activities: Activities?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetachInstancesQuery {
        var InstanceIds: InstanceIds?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingGroupName: ResourceName
        var ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity
    }
    interface DetachLoadBalancerTargetGroupsResultType
    interface DetachLoadBalancerTargetGroupsType {
        var AutoScalingGroupName: ResourceName
        var TargetGroupARNs: TargetGroupARNs
    }
    interface DetachLoadBalancersResultType
    interface DetachLoadBalancersType {
        var AutoScalingGroupName: ResourceName
        var LoadBalancerNames: LoadBalancerNames
    }
    interface DisableMetricsCollectionQuery {
        var AutoScalingGroupName: ResourceName
        var Metrics: Metrics?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Ebs {
        var SnapshotId: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeSize: BlockDeviceEbsVolumeSize?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeType: BlockDeviceEbsVolumeType?
            get() = definedExternally
            set(value) = definedExternally
        var DeleteOnTermination: BlockDeviceEbsDeleteOnTermination?
            get() = definedExternally
            set(value) = definedExternally
        var Iops: BlockDeviceEbsIops?
            get() = definedExternally
            set(value) = definedExternally
        var Encrypted: BlockDeviceEbsEncrypted?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnableMetricsCollectionQuery {
        var AutoScalingGroupName: ResourceName
        var Metrics: Metrics?
            get() = definedExternally
            set(value) = definedExternally
        var Granularity: XmlStringMaxLen255
    }
    interface EnabledMetric {
        var Metric: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var Granularity: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnterStandbyAnswer {
        var Activities: Activities?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnterStandbyQuery {
        var InstanceIds: InstanceIds?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingGroupName: ResourceName
        var ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity
    }
    interface ExecutePolicyType {
        var AutoScalingGroupName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyName: ResourceName
        var HonorCooldown: HonorCooldown?
            get() = definedExternally
            set(value) = definedExternally
        var MetricValue: MetricScale?
            get() = definedExternally
            set(value) = definedExternally
        var BreachThreshold: MetricScale?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExitStandbyAnswer {
        var Activities: Activities?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExitStandbyQuery {
        var InstanceIds: InstanceIds?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingGroupName: ResourceName
    }
    interface FailedScheduledUpdateGroupActionRequest {
        var ScheduledActionName: XmlStringMaxLen255
        var ErrorCode: XmlStringMaxLen64?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Filter {
        var Name: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var Values: Values?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Instance {
        var InstanceId: XmlStringMaxLen19
        var InstanceType: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: XmlStringMaxLen255
        var LifecycleState: String /* "Pending" | "Pending:Wait" | "Pending:Proceed" | "Quarantined" | "InService" | "Terminating" | "Terminating:Wait" | "Terminating:Proceed" | "Terminated" | "Detaching" | "Detached" | "EnteringStandby" | "Standby" | String */
        var HealthStatus: XmlStringMaxLen32
        var LaunchConfigurationName: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var LaunchTemplate: LaunchTemplateSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var ProtectedFromScaleIn: InstanceProtected
        var WeightedCapacity: XmlStringMaxLen32?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceMonitoring {
        var Enabled: MonitoringEnabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstancesDistribution {
        var OnDemandAllocationStrategy: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var OnDemandBaseCapacity: OnDemandBaseCapacity?
            get() = definedExternally
            set(value) = definedExternally
        var OnDemandPercentageAboveBaseCapacity: OnDemandPercentageAboveBaseCapacity?
            get() = definedExternally
            set(value) = definedExternally
        var SpotAllocationStrategy: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var SpotInstancePools: SpotInstancePools?
            get() = definedExternally
            set(value) = definedExternally
        var SpotMaxPrice: MixedInstanceSpotPrice?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LaunchConfiguration {
        var LaunchConfigurationName: XmlStringMaxLen255
        var LaunchConfigurationARN: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var ImageId: XmlStringMaxLen255
        var KeyName: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroups: SecurityGroups?
            get() = definedExternally
            set(value) = definedExternally
        var ClassicLinkVPCId: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var ClassicLinkVPCSecurityGroups: ClassicLinkVPCSecurityGroups?
            get() = definedExternally
            set(value) = definedExternally
        var UserData: XmlStringUserData?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: XmlStringMaxLen255
        var KernelId: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var RamdiskId: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var BlockDeviceMappings: BlockDeviceMappings?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceMonitoring: InstanceMonitoring?
            get() = definedExternally
            set(value) = definedExternally
        var SpotPrice: SpotPrice?
            get() = definedExternally
            set(value) = definedExternally
        var IamInstanceProfile: XmlStringMaxLen1600?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: TimestampType
        var EbsOptimized: EbsOptimized?
            get() = definedExternally
            set(value) = definedExternally
        var AssociatePublicIpAddress: AssociatePublicIpAddress?
            get() = definedExternally
            set(value) = definedExternally
        var PlacementTenancy: XmlStringMaxLen64?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LaunchConfigurationNameType {
        var LaunchConfigurationName: ResourceName
    }
    interface LaunchConfigurationNamesType {
        var LaunchConfigurationNames: LaunchConfigurationNames?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: MaxRecords?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LaunchConfigurationsType {
        var LaunchConfigurations: LaunchConfigurations
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LaunchTemplate {
        var LaunchTemplateSpecification: LaunchTemplateSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var Overrides: Overrides?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LaunchTemplateOverrides {
        var InstanceType: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var WeightedCapacity: XmlStringMaxLen32?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LaunchTemplateSpecification {
        var LaunchTemplateId: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var LaunchTemplateName: LaunchTemplateName?
            get() = definedExternally
            set(value) = definedExternally
        var Version: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LifecycleHook {
        var LifecycleHookName: AsciiStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingGroupName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var LifecycleTransition: LifecycleTransition?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationTargetARN: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationMetadata: XmlStringMaxLen1023?
            get() = definedExternally
            set(value) = definedExternally
        var HeartbeatTimeout: HeartbeatTimeout?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalTimeout: GlobalTimeout?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultResult: LifecycleActionResult?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LifecycleHookSpecification {
        var LifecycleHookName: AsciiStringMaxLen255
        var LifecycleTransition: LifecycleTransition
        var NotificationMetadata: XmlStringMaxLen1023?
            get() = definedExternally
            set(value) = definedExternally
        var HeartbeatTimeout: HeartbeatTimeout?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultResult: LifecycleActionResult?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationTargetARN: NotificationTargetResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoadBalancerState {
        var LoadBalancerName: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var State: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoadBalancerTargetGroupState {
        var LoadBalancerTargetGroupARN: XmlStringMaxLen511?
            get() = definedExternally
            set(value) = definedExternally
        var State: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MetricCollectionType {
        var Metric: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MetricDimension {
        var Name: MetricDimensionName
        var Value: MetricDimensionValue
    }
    interface MetricGranularityType {
        var Granularity: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MixedInstancesPolicy {
        var LaunchTemplate: LaunchTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var InstancesDistribution: InstancesDistribution?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NotificationConfiguration {
        var AutoScalingGroupName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var TopicARN: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationType: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PoliciesType {
        var ScalingPolicies: ScalingPolicies?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyARNType {
        var PolicyARN: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var Alarms: Alarms?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PredefinedMetricSpecification {
        var PredefinedMetricType: String /* "ASGAverageCPUUtilization" | "ASGAverageNetworkIn" | "ASGAverageNetworkOut" | "ALBRequestCountPerTarget" | String */
        var ResourceLabel: XmlStringMaxLen1023?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProcessType {
        var ProcessName: XmlStringMaxLen255
    }
    interface ProcessesType {
        var Processes: Processes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutLifecycleHookAnswer
    interface PutLifecycleHookType {
        var LifecycleHookName: AsciiStringMaxLen255
        var AutoScalingGroupName: ResourceName
        var LifecycleTransition: LifecycleTransition?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationTargetARN: NotificationTargetResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationMetadata: XmlStringMaxLen1023?
            get() = definedExternally
            set(value) = definedExternally
        var HeartbeatTimeout: HeartbeatTimeout?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultResult: LifecycleActionResult?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutNotificationConfigurationType {
        var AutoScalingGroupName: ResourceName
        var TopicARN: ResourceName
        var NotificationTypes: AutoScalingNotificationTypes
    }
    interface PutScalingPolicyType {
        var AutoScalingGroupName: ResourceName
        var PolicyName: XmlStringMaxLen255
        var PolicyType: XmlStringMaxLen64?
            get() = definedExternally
            set(value) = definedExternally
        var AdjustmentType: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var MinAdjustmentStep: MinAdjustmentStep?
            get() = definedExternally
            set(value) = definedExternally
        var MinAdjustmentMagnitude: MinAdjustmentMagnitude?
            get() = definedExternally
            set(value) = definedExternally
        var ScalingAdjustment: PolicyIncrement?
            get() = definedExternally
            set(value) = definedExternally
        var Cooldown: Cooldown?
            get() = definedExternally
            set(value) = definedExternally
        var MetricAggregationType: XmlStringMaxLen32?
            get() = definedExternally
            set(value) = definedExternally
        var StepAdjustments: StepAdjustments?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedInstanceWarmup: EstimatedInstanceWarmup?
            get() = definedExternally
            set(value) = definedExternally
        var TargetTrackingConfiguration: TargetTrackingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: ScalingPolicyEnabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutScheduledUpdateGroupActionType {
        var AutoScalingGroupName: ResourceName
        var ScheduledActionName: XmlStringMaxLen255
        var Time: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var Recurrence: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var MinSize: AutoScalingGroupMinSize?
            get() = definedExternally
            set(value) = definedExternally
        var MaxSize: AutoScalingGroupMaxSize?
            get() = definedExternally
            set(value) = definedExternally
        var DesiredCapacity: AutoScalingGroupDesiredCapacity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecordLifecycleActionHeartbeatAnswer
    interface RecordLifecycleActionHeartbeatType {
        var LifecycleHookName: AsciiStringMaxLen255
        var AutoScalingGroupName: ResourceName
        var LifecycleActionToken: LifecycleActionToken?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: XmlStringMaxLen19?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScalingPolicy {
        var AutoScalingGroupName: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyName: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyARN: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyType: XmlStringMaxLen64?
            get() = definedExternally
            set(value) = definedExternally
        var AdjustmentType: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var MinAdjustmentStep: MinAdjustmentStep?
            get() = definedExternally
            set(value) = definedExternally
        var MinAdjustmentMagnitude: MinAdjustmentMagnitude?
            get() = definedExternally
            set(value) = definedExternally
        var ScalingAdjustment: PolicyIncrement?
            get() = definedExternally
            set(value) = definedExternally
        var Cooldown: Cooldown?
            get() = definedExternally
            set(value) = definedExternally
        var StepAdjustments: StepAdjustments?
            get() = definedExternally
            set(value) = definedExternally
        var MetricAggregationType: XmlStringMaxLen32?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedInstanceWarmup: EstimatedInstanceWarmup?
            get() = definedExternally
            set(value) = definedExternally
        var Alarms: Alarms?
            get() = definedExternally
            set(value) = definedExternally
        var TargetTrackingConfiguration: TargetTrackingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: ScalingPolicyEnabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScalingProcessQuery {
        var AutoScalingGroupName: ResourceName
        var ScalingProcesses: ProcessNames?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScheduledActionsType {
        var ScheduledUpdateGroupActions: ScheduledUpdateGroupActions?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScheduledUpdateGroupAction {
        var AutoScalingGroupName: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduledActionName: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduledActionARN: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var Time: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var Recurrence: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var MinSize: AutoScalingGroupMinSize?
            get() = definedExternally
            set(value) = definedExternally
        var MaxSize: AutoScalingGroupMaxSize?
            get() = definedExternally
            set(value) = definedExternally
        var DesiredCapacity: AutoScalingGroupDesiredCapacity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScheduledUpdateGroupActionRequest {
        var ScheduledActionName: XmlStringMaxLen255
        var StartTime: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var Recurrence: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var MinSize: AutoScalingGroupMinSize?
            get() = definedExternally
            set(value) = definedExternally
        var MaxSize: AutoScalingGroupMaxSize?
            get() = definedExternally
            set(value) = definedExternally
        var DesiredCapacity: AutoScalingGroupDesiredCapacity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetDesiredCapacityType {
        var AutoScalingGroupName: ResourceName
        var DesiredCapacity: AutoScalingGroupDesiredCapacity
        var HonorCooldown: HonorCooldown?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetInstanceHealthQuery {
        var InstanceId: XmlStringMaxLen19
        var HealthStatus: XmlStringMaxLen32
        var ShouldRespectGracePeriod: ShouldRespectGracePeriod?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetInstanceProtectionAnswer
    interface SetInstanceProtectionQuery {
        var InstanceIds: InstanceIds
        var AutoScalingGroupName: ResourceName
        var ProtectedFromScaleIn: ProtectedFromScaleIn
    }
    interface StepAdjustment {
        var MetricIntervalLowerBound: MetricScale?
            get() = definedExternally
            set(value) = definedExternally
        var MetricIntervalUpperBound: MetricScale?
            get() = definedExternally
            set(value) = definedExternally
        var ScalingAdjustment: PolicyIncrement
    }
    interface SuspendedProcess {
        var ProcessName: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var SuspensionReason: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var ResourceId: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var Key: TagKey
        var Value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
        var PropagateAtLaunch: PropagateAtLaunch?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagDescription {
        var ResourceId: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var Key: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var Value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
        var PropagateAtLaunch: PropagateAtLaunch?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagsType {
        var Tags: TagDescriptionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TargetTrackingConfiguration {
        var PredefinedMetricSpecification: PredefinedMetricSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var CustomizedMetricSpecification: CustomizedMetricSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var TargetValue: MetricScale
        var DisableScaleIn: DisableScaleIn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TerminateInstanceInAutoScalingGroupType {
        var InstanceId: XmlStringMaxLen19
        var ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity
    }
    interface UpdateAutoScalingGroupType {
        var AutoScalingGroupName: ResourceName
        var LaunchConfigurationName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var LaunchTemplate: LaunchTemplateSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var MixedInstancesPolicy: MixedInstancesPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var MinSize: AutoScalingGroupMinSize?
            get() = definedExternally
            set(value) = definedExternally
        var MaxSize: AutoScalingGroupMaxSize?
            get() = definedExternally
            set(value) = definedExternally
        var DesiredCapacity: AutoScalingGroupDesiredCapacity?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultCooldown: Cooldown?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZones: AvailabilityZones?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckType: XmlStringMaxLen32?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckGracePeriod: HealthCheckGracePeriod?
            get() = definedExternally
            set(value) = definedExternally
        var PlacementGroup: XmlStringMaxLen255?
            get() = definedExternally
            set(value) = definedExternally
        var VPCZoneIdentifier: XmlStringMaxLen2047?
            get() = definedExternally
            set(value) = definedExternally
        var TerminationPolicies: TerminationPolicies?
            get() = definedExternally
            set(value) = definedExternally
        var NewInstancesProtectedFromScaleIn: InstanceProtected?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceLinkedRoleARN: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var MaxInstanceLifetime: MaxInstanceLifetime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2011-01-01" | "latest" | String */
    }
}