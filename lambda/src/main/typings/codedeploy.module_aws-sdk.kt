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
import CodeDeploy.Alarm
import CodeDeploy.ApplicationInfo
import CodeDeploy.AutoScalingGroup
import CodeDeploy.DeploymentGroupInfo
import CodeDeploy.DeploymentTarget
import CodeDeploy.DeploymentInfo
import CodeDeploy.EC2TagFilter
import CodeDeploy.ECSService
import CodeDeploy.ECSTaskSet
import CodeDeploy.ELBInfo
import CodeDeploy.InstanceInfo
import CodeDeploy.InstanceSummary
import CodeDeploy.LifecycleEvent
import CodeDeploy.RevisionInfo
import CodeDeploy.RevisionLocation
import CodeDeploy.TagFilter
import CodeDeploy.Tag
import CodeDeploy.TargetGroupInfo
import CodeDeploy.TargetGroupPairInfo
import CodeDeploy.TriggerConfig
import CodeDeploy.AddTagsToOnPremisesInstancesInput
import CodeDeploy.BatchGetApplicationRevisionsInput
import CodeDeploy.BatchGetApplicationRevisionsOutput
import CodeDeploy.BatchGetApplicationsInput
import CodeDeploy.BatchGetApplicationsOutput
import CodeDeploy.BatchGetDeploymentGroupsInput
import CodeDeploy.BatchGetDeploymentGroupsOutput
import CodeDeploy.BatchGetDeploymentInstancesInput
import CodeDeploy.BatchGetDeploymentInstancesOutput
import CodeDeploy.BatchGetDeploymentTargetsInput
import CodeDeploy.BatchGetDeploymentTargetsOutput
import CodeDeploy.BatchGetDeploymentsInput
import CodeDeploy.BatchGetDeploymentsOutput
import CodeDeploy.BatchGetOnPremisesInstancesInput
import CodeDeploy.BatchGetOnPremisesInstancesOutput
import CodeDeploy.ContinueDeploymentInput
import CodeDeploy.CreateApplicationInput
import CodeDeploy.CreateApplicationOutput
import CodeDeploy.CreateDeploymentInput
import CodeDeploy.CreateDeploymentOutput
import CodeDeploy.CreateDeploymentConfigInput
import CodeDeploy.CreateDeploymentConfigOutput
import CodeDeploy.CreateDeploymentGroupInput
import CodeDeploy.CreateDeploymentGroupOutput
import CodeDeploy.DeleteApplicationInput
import CodeDeploy.DeleteDeploymentConfigInput
import CodeDeploy.DeleteDeploymentGroupInput
import CodeDeploy.DeleteDeploymentGroupOutput
import CodeDeploy.DeleteGitHubAccountTokenInput
import CodeDeploy.DeleteGitHubAccountTokenOutput
import CodeDeploy.DeregisterOnPremisesInstanceInput
import CodeDeploy.GetApplicationInput
import CodeDeploy.GetApplicationOutput
import CodeDeploy.GetApplicationRevisionInput
import CodeDeploy.GetApplicationRevisionOutput
import CodeDeploy.GetDeploymentInput
import CodeDeploy.GetDeploymentOutput
import CodeDeploy.GetDeploymentConfigInput
import CodeDeploy.GetDeploymentConfigOutput
import CodeDeploy.GetDeploymentGroupInput
import CodeDeploy.GetDeploymentGroupOutput
import CodeDeploy.GetDeploymentInstanceInput
import CodeDeploy.GetDeploymentInstanceOutput
import CodeDeploy.GetDeploymentTargetInput
import CodeDeploy.GetDeploymentTargetOutput
import CodeDeploy.GetOnPremisesInstanceInput
import CodeDeploy.GetOnPremisesInstanceOutput
import CodeDeploy.ListApplicationRevisionsInput
import CodeDeploy.ListApplicationRevisionsOutput
import CodeDeploy.ListApplicationsInput
import CodeDeploy.ListApplicationsOutput
import CodeDeploy.ListDeploymentConfigsInput
import CodeDeploy.ListDeploymentConfigsOutput
import CodeDeploy.ListDeploymentGroupsInput
import CodeDeploy.ListDeploymentGroupsOutput
import CodeDeploy.ListDeploymentInstancesInput
import CodeDeploy.ListDeploymentInstancesOutput
import CodeDeploy.ListDeploymentTargetsInput
import CodeDeploy.ListDeploymentTargetsOutput
import CodeDeploy.ListDeploymentsInput
import CodeDeploy.ListDeploymentsOutput
import CodeDeploy.ListGitHubAccountTokenNamesInput
import CodeDeploy.ListGitHubAccountTokenNamesOutput
import CodeDeploy.ListOnPremisesInstancesInput
import CodeDeploy.ListOnPremisesInstancesOutput
import CodeDeploy.ListTagsForResourceInput
import CodeDeploy.ListTagsForResourceOutput
import CodeDeploy.PutLifecycleEventHookExecutionStatusInput
import CodeDeploy.PutLifecycleEventHookExecutionStatusOutput
import CodeDeploy.RegisterApplicationRevisionInput
import CodeDeploy.RegisterOnPremisesInstanceInput
import CodeDeploy.RemoveTagsFromOnPremisesInstancesInput
import CodeDeploy.SkipWaitTimeForInstanceTerminationInput
import CodeDeploy.StopDeploymentInput
import CodeDeploy.StopDeploymentOutput
import CodeDeploy.TagResourceInput
import CodeDeploy.TagResourceOutput
import CodeDeploy.UntagResourceInput
import CodeDeploy.UntagResourceOutput
import CodeDeploy.UpdateApplicationInput
import CodeDeploy.UpdateDeploymentGroupInput
import CodeDeploy.UpdateDeploymentGroupOutput
import CodeDeploy.BlueInstanceTerminationOption
import CodeDeploy.DeploymentReadyOption
import CodeDeploy.GreenFleetProvisioningOption
import CodeDeploy.MinimumHealthyHosts
import CodeDeploy.TrafficRoutingConfig
import CodeDeploy.AlarmConfiguration
import CodeDeploy.AutoRollbackConfiguration
import CodeDeploy.DeploymentStyle
import CodeDeploy.BlueGreenDeploymentConfiguration
import CodeDeploy.LoadBalancerInfo
import CodeDeploy.EC2TagSet
import CodeDeploy.OnPremisesTagSet
import CodeDeploy.TargetInstances
import CodeDeploy.LastDeploymentInfo
import CodeDeploy.ErrorInformation
import CodeDeploy.DeploymentOverview
import CodeDeploy.RollbackInfo
import CodeDeploy.InstanceTarget
import CodeDeploy.LambdaTarget
import CodeDeploy.ECSTarget
import CodeDeploy.GenericRevisionInfo
import CodeDeploy.DeploymentConfigInfo
import CodeDeploy.LambdaFunctionInfo
import CodeDeploy.Diagnostics
import CodeDeploy.TargetFilters
import CodeDeploy.TimeRange
import CodeDeploy.S3Location
import CodeDeploy.GitHubLocation
import CodeDeploy.RawString
import CodeDeploy.AppSpecContent
import CodeDeploy.TrafficRoute
import CodeDeploy.TimeBasedCanary
import CodeDeploy.TimeBasedLinear

typealias AdditionalDeploymentStatusInfo = String

typealias AlarmList = Array<Alarm>

typealias AlarmName = String

typealias ApplicationId = String

typealias ApplicationName = String

typealias ApplicationsInfoList = Array<ApplicationInfo>

typealias ApplicationsList = Array<ApplicationName>

typealias Arn = String

typealias AutoRollbackEventsList = Array<String /* "DEPLOYMENT_FAILURE" | "DEPLOYMENT_STOP_ON_ALARM" | "DEPLOYMENT_STOP_ON_REQUEST" | String */>

typealias AutoScalingGroupHook = String

typealias AutoScalingGroupList = Array<AutoScalingGroup>

typealias AutoScalingGroupName = String

typealias AutoScalingGroupNameList = Array<AutoScalingGroupName>

typealias Boolean = Boolean

typealias CommitId = String

typealias DeploymentConfigId = String

typealias DeploymentConfigName = String

typealias DeploymentConfigsList = Array<DeploymentConfigName>

typealias DeploymentGroupId = String

typealias DeploymentGroupInfoList = Array<DeploymentGroupInfo>

typealias DeploymentGroupName = String

typealias DeploymentGroupsList = Array<DeploymentGroupName>

typealias DeploymentId = String

typealias DeploymentStatusList = Array<String /* "Created" | "Queued" | "InProgress" | "Succeeded" | "Failed" | "Stopped" | "Ready" | String */>

typealias DeploymentStatusMessageList = Array<ErrorMessage>

typealias DeploymentTargetList = Array<DeploymentTarget>

typealias DeploymentsInfoList = Array<DeploymentInfo>

typealias DeploymentsList = Array<DeploymentId>

typealias Description = String

typealias Duration = Number

typealias EC2TagFilterList = Array<EC2TagFilter>

typealias EC2TagSetList = Array<EC2TagFilterList>

typealias ECSClusterName = String

typealias ECSServiceList = Array<ECSService>

typealias ECSServiceName = String

typealias ECSTaskSetCount = Number

typealias ECSTaskSetIdentifier = String

typealias ECSTaskSetList = Array<ECSTaskSet>

typealias ECSTaskSetStatus = String

typealias ELBInfoList = Array<ELBInfo>

typealias ELBName = String

typealias ETag = String

typealias ErrorMessage = String

typealias FilterValue = String

typealias FilterValueList = Array<FilterValue>

typealias GitHubAccountTokenName = String

typealias GitHubAccountTokenNameList = Array<GitHubAccountTokenName>

typealias IamSessionArn = String

typealias IamUserArn = String

typealias InstanceArn = String

typealias InstanceCount = Number

typealias InstanceId = String

typealias InstanceInfoList = Array<InstanceInfo>

typealias InstanceName = String

typealias InstanceNameList = Array<InstanceName>

typealias InstanceStatusList = Array<String /* "Pending" | "InProgress" | "Succeeded" | "Failed" | "Skipped" | "Unknown" | "Ready" | String */>

typealias InstanceSummaryList = Array<InstanceSummary>

typealias InstanceTypeList = Array<String /* "Blue" | "Green" | String */>

typealias InstancesList = Array<InstanceId>

typealias Key = String

typealias LambdaFunctionAlias = String

typealias LambdaFunctionName = String

typealias LifecycleEventHookExecutionId = String

typealias LifecycleEventList = Array<LifecycleEvent>

typealias LifecycleEventName = String

typealias LifecycleMessage = String

typealias ListenerArn = String

typealias ListenerArnList = Array<ListenerArn>

typealias LogTail = String

typealias Message = String

typealias MinimumHealthyHostsValue = Number

typealias NextToken = String

typealias NullableBoolean = Boolean

typealias OnPremisesTagSetList = Array<TagFilterList>

typealias Percentage = Number

typealias RawStringContent = String

typealias RawStringSha256 = String

typealias Repository = String

typealias RevisionInfoList = Array<RevisionInfo>

typealias RevisionLocationList = Array<RevisionLocation>

typealias Role = String

typealias S3Bucket = String

typealias S3Key = String

typealias ScriptName = String

typealias TagFilterList = Array<TagFilter>

typealias TagKeyList = Array<Key>

typealias TagList = Array<Tag>

typealias TargetArn = String

typealias TargetGroupInfoList = Array<TargetGroupInfo>

typealias TargetGroupName = String

typealias TargetGroupPairInfoList = Array<TargetGroupPairInfo>

typealias TargetId = String

typealias TargetIdList = Array<TargetId>

typealias Time = Date

typealias Timestamp = Date

typealias TrafficWeight = Number

typealias TriggerConfigList = Array<TriggerConfig>

typealias TriggerEventTypeList = Array<String /* "DeploymentStart" | "DeploymentSuccess" | "DeploymentFailure" | "DeploymentStop" | "DeploymentRollback" | "DeploymentReady" | "InstanceStart" | "InstanceSuccess" | "InstanceFailure" | "InstanceReady" | String */>

typealias TriggerName = String

typealias TriggerTargetArn = String

typealias Value = String

typealias Version = String

typealias VersionId = String

typealias WaitTimeInMins = Number

@JsModule("aws-sdk")
external open class CodeDeploy(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CodeDeploy.Types.ClientConfiguration */
    open fun addTagsToOnPremisesInstances(params: AddTagsToOnPremisesInstancesInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun addTagsToOnPremisesInstances(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun batchGetApplicationRevisions(params: BatchGetApplicationRevisionsInput, callback: (err: AWSError, data: BatchGetApplicationRevisionsOutput) -> Unit = definedExternally): Request<BatchGetApplicationRevisionsOutput, AWSError>
    open fun batchGetApplicationRevisions(callback: (err: AWSError, data: BatchGetApplicationRevisionsOutput) -> Unit = definedExternally): Request<BatchGetApplicationRevisionsOutput, AWSError>
    open fun batchGetApplications(params: BatchGetApplicationsInput, callback: (err: AWSError, data: BatchGetApplicationsOutput) -> Unit = definedExternally): Request<BatchGetApplicationsOutput, AWSError>
    open fun batchGetApplications(callback: (err: AWSError, data: BatchGetApplicationsOutput) -> Unit = definedExternally): Request<BatchGetApplicationsOutput, AWSError>
    open fun batchGetDeploymentGroups(params: BatchGetDeploymentGroupsInput, callback: (err: AWSError, data: BatchGetDeploymentGroupsOutput) -> Unit = definedExternally): Request<BatchGetDeploymentGroupsOutput, AWSError>
    open fun batchGetDeploymentGroups(callback: (err: AWSError, data: BatchGetDeploymentGroupsOutput) -> Unit = definedExternally): Request<BatchGetDeploymentGroupsOutput, AWSError>
    open fun batchGetDeploymentInstances(params: BatchGetDeploymentInstancesInput, callback: (err: AWSError, data: BatchGetDeploymentInstancesOutput) -> Unit = definedExternally): Request<BatchGetDeploymentInstancesOutput, AWSError>
    open fun batchGetDeploymentInstances(callback: (err: AWSError, data: BatchGetDeploymentInstancesOutput) -> Unit = definedExternally): Request<BatchGetDeploymentInstancesOutput, AWSError>
    open fun batchGetDeploymentTargets(params: BatchGetDeploymentTargetsInput, callback: (err: AWSError, data: BatchGetDeploymentTargetsOutput) -> Unit = definedExternally): Request<BatchGetDeploymentTargetsOutput, AWSError>
    open fun batchGetDeploymentTargets(callback: (err: AWSError, data: BatchGetDeploymentTargetsOutput) -> Unit = definedExternally): Request<BatchGetDeploymentTargetsOutput, AWSError>
    open fun batchGetDeployments(params: BatchGetDeploymentsInput, callback: (err: AWSError, data: BatchGetDeploymentsOutput) -> Unit = definedExternally): Request<BatchGetDeploymentsOutput, AWSError>
    open fun batchGetDeployments(callback: (err: AWSError, data: BatchGetDeploymentsOutput) -> Unit = definedExternally): Request<BatchGetDeploymentsOutput, AWSError>
    open fun batchGetOnPremisesInstances(params: BatchGetOnPremisesInstancesInput, callback: (err: AWSError, data: BatchGetOnPremisesInstancesOutput) -> Unit = definedExternally): Request<BatchGetOnPremisesInstancesOutput, AWSError>
    open fun batchGetOnPremisesInstances(callback: (err: AWSError, data: BatchGetOnPremisesInstancesOutput) -> Unit = definedExternally): Request<BatchGetOnPremisesInstancesOutput, AWSError>
    open fun continueDeployment(params: ContinueDeploymentInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun continueDeployment(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createApplication(params: CreateApplicationInput, callback: (err: AWSError, data: CreateApplicationOutput) -> Unit = definedExternally): Request<CreateApplicationOutput, AWSError>
    open fun createApplication(callback: (err: AWSError, data: CreateApplicationOutput) -> Unit = definedExternally): Request<CreateApplicationOutput, AWSError>
    open fun createDeployment(params: CreateDeploymentInput, callback: (err: AWSError, data: CreateDeploymentOutput) -> Unit = definedExternally): Request<CreateDeploymentOutput, AWSError>
    open fun createDeployment(callback: (err: AWSError, data: CreateDeploymentOutput) -> Unit = definedExternally): Request<CreateDeploymentOutput, AWSError>
    open fun createDeploymentConfig(params: CreateDeploymentConfigInput, callback: (err: AWSError, data: CreateDeploymentConfigOutput) -> Unit = definedExternally): Request<CreateDeploymentConfigOutput, AWSError>
    open fun createDeploymentConfig(callback: (err: AWSError, data: CreateDeploymentConfigOutput) -> Unit = definedExternally): Request<CreateDeploymentConfigOutput, AWSError>
    open fun createDeploymentGroup(params: CreateDeploymentGroupInput, callback: (err: AWSError, data: CreateDeploymentGroupOutput) -> Unit = definedExternally): Request<CreateDeploymentGroupOutput, AWSError>
    open fun createDeploymentGroup(callback: (err: AWSError, data: CreateDeploymentGroupOutput) -> Unit = definedExternally): Request<CreateDeploymentGroupOutput, AWSError>
    open fun deleteApplication(params: DeleteApplicationInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteApplication(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDeploymentConfig(params: DeleteDeploymentConfigInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDeploymentConfig(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDeploymentGroup(params: DeleteDeploymentGroupInput, callback: (err: AWSError, data: DeleteDeploymentGroupOutput) -> Unit = definedExternally): Request<DeleteDeploymentGroupOutput, AWSError>
    open fun deleteDeploymentGroup(callback: (err: AWSError, data: DeleteDeploymentGroupOutput) -> Unit = definedExternally): Request<DeleteDeploymentGroupOutput, AWSError>
    open fun deleteGitHubAccountToken(params: DeleteGitHubAccountTokenInput, callback: (err: AWSError, data: DeleteGitHubAccountTokenOutput) -> Unit = definedExternally): Request<DeleteGitHubAccountTokenOutput, AWSError>
    open fun deleteGitHubAccountToken(callback: (err: AWSError, data: DeleteGitHubAccountTokenOutput) -> Unit = definedExternally): Request<DeleteGitHubAccountTokenOutput, AWSError>
    open fun deregisterOnPremisesInstance(params: DeregisterOnPremisesInstanceInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deregisterOnPremisesInstance(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun getApplication(params: GetApplicationInput, callback: (err: AWSError, data: GetApplicationOutput) -> Unit = definedExternally): Request<GetApplicationOutput, AWSError>
    open fun getApplication(callback: (err: AWSError, data: GetApplicationOutput) -> Unit = definedExternally): Request<GetApplicationOutput, AWSError>
    open fun getApplicationRevision(params: GetApplicationRevisionInput, callback: (err: AWSError, data: GetApplicationRevisionOutput) -> Unit = definedExternally): Request<GetApplicationRevisionOutput, AWSError>
    open fun getApplicationRevision(callback: (err: AWSError, data: GetApplicationRevisionOutput) -> Unit = definedExternally): Request<GetApplicationRevisionOutput, AWSError>
    open fun getDeployment(params: GetDeploymentInput, callback: (err: AWSError, data: GetDeploymentOutput) -> Unit = definedExternally): Request<GetDeploymentOutput, AWSError>
    open fun getDeployment(callback: (err: AWSError, data: GetDeploymentOutput) -> Unit = definedExternally): Request<GetDeploymentOutput, AWSError>
    open fun getDeploymentConfig(params: GetDeploymentConfigInput, callback: (err: AWSError, data: GetDeploymentConfigOutput) -> Unit = definedExternally): Request<GetDeploymentConfigOutput, AWSError>
    open fun getDeploymentConfig(callback: (err: AWSError, data: GetDeploymentConfigOutput) -> Unit = definedExternally): Request<GetDeploymentConfigOutput, AWSError>
    open fun getDeploymentGroup(params: GetDeploymentGroupInput, callback: (err: AWSError, data: GetDeploymentGroupOutput) -> Unit = definedExternally): Request<GetDeploymentGroupOutput, AWSError>
    open fun getDeploymentGroup(callback: (err: AWSError, data: GetDeploymentGroupOutput) -> Unit = definedExternally): Request<GetDeploymentGroupOutput, AWSError>
    open fun getDeploymentInstance(params: GetDeploymentInstanceInput, callback: (err: AWSError, data: GetDeploymentInstanceOutput) -> Unit = definedExternally): Request<GetDeploymentInstanceOutput, AWSError>
    open fun getDeploymentInstance(callback: (err: AWSError, data: GetDeploymentInstanceOutput) -> Unit = definedExternally): Request<GetDeploymentInstanceOutput, AWSError>
    open fun getDeploymentTarget(params: GetDeploymentTargetInput, callback: (err: AWSError, data: GetDeploymentTargetOutput) -> Unit = definedExternally): Request<GetDeploymentTargetOutput, AWSError>
    open fun getDeploymentTarget(callback: (err: AWSError, data: GetDeploymentTargetOutput) -> Unit = definedExternally): Request<GetDeploymentTargetOutput, AWSError>
    open fun getOnPremisesInstance(params: GetOnPremisesInstanceInput, callback: (err: AWSError, data: GetOnPremisesInstanceOutput) -> Unit = definedExternally): Request<GetOnPremisesInstanceOutput, AWSError>
    open fun getOnPremisesInstance(callback: (err: AWSError, data: GetOnPremisesInstanceOutput) -> Unit = definedExternally): Request<GetOnPremisesInstanceOutput, AWSError>
    open fun listApplicationRevisions(params: ListApplicationRevisionsInput, callback: (err: AWSError, data: ListApplicationRevisionsOutput) -> Unit = definedExternally): Request<ListApplicationRevisionsOutput, AWSError>
    open fun listApplicationRevisions(callback: (err: AWSError, data: ListApplicationRevisionsOutput) -> Unit = definedExternally): Request<ListApplicationRevisionsOutput, AWSError>
    open fun listApplications(params: ListApplicationsInput, callback: (err: AWSError, data: ListApplicationsOutput) -> Unit = definedExternally): Request<ListApplicationsOutput, AWSError>
    open fun listApplications(callback: (err: AWSError, data: ListApplicationsOutput) -> Unit = definedExternally): Request<ListApplicationsOutput, AWSError>
    open fun listDeploymentConfigs(params: ListDeploymentConfigsInput, callback: (err: AWSError, data: ListDeploymentConfigsOutput) -> Unit = definedExternally): Request<ListDeploymentConfigsOutput, AWSError>
    open fun listDeploymentConfigs(callback: (err: AWSError, data: ListDeploymentConfigsOutput) -> Unit = definedExternally): Request<ListDeploymentConfigsOutput, AWSError>
    open fun listDeploymentGroups(params: ListDeploymentGroupsInput, callback: (err: AWSError, data: ListDeploymentGroupsOutput) -> Unit = definedExternally): Request<ListDeploymentGroupsOutput, AWSError>
    open fun listDeploymentGroups(callback: (err: AWSError, data: ListDeploymentGroupsOutput) -> Unit = definedExternally): Request<ListDeploymentGroupsOutput, AWSError>
    open fun listDeploymentInstances(params: ListDeploymentInstancesInput, callback: (err: AWSError, data: ListDeploymentInstancesOutput) -> Unit = definedExternally): Request<ListDeploymentInstancesOutput, AWSError>
    open fun listDeploymentInstances(callback: (err: AWSError, data: ListDeploymentInstancesOutput) -> Unit = definedExternally): Request<ListDeploymentInstancesOutput, AWSError>
    open fun listDeploymentTargets(params: ListDeploymentTargetsInput, callback: (err: AWSError, data: ListDeploymentTargetsOutput) -> Unit = definedExternally): Request<ListDeploymentTargetsOutput, AWSError>
    open fun listDeploymentTargets(callback: (err: AWSError, data: ListDeploymentTargetsOutput) -> Unit = definedExternally): Request<ListDeploymentTargetsOutput, AWSError>
    open fun listDeployments(params: ListDeploymentsInput, callback: (err: AWSError, data: ListDeploymentsOutput) -> Unit = definedExternally): Request<ListDeploymentsOutput, AWSError>
    open fun listDeployments(callback: (err: AWSError, data: ListDeploymentsOutput) -> Unit = definedExternally): Request<ListDeploymentsOutput, AWSError>
    open fun listGitHubAccountTokenNames(params: ListGitHubAccountTokenNamesInput, callback: (err: AWSError, data: ListGitHubAccountTokenNamesOutput) -> Unit = definedExternally): Request<ListGitHubAccountTokenNamesOutput, AWSError>
    open fun listGitHubAccountTokenNames(callback: (err: AWSError, data: ListGitHubAccountTokenNamesOutput) -> Unit = definedExternally): Request<ListGitHubAccountTokenNamesOutput, AWSError>
    open fun listOnPremisesInstances(params: ListOnPremisesInstancesInput, callback: (err: AWSError, data: ListOnPremisesInstancesOutput) -> Unit = definedExternally): Request<ListOnPremisesInstancesOutput, AWSError>
    open fun listOnPremisesInstances(callback: (err: AWSError, data: ListOnPremisesInstancesOutput) -> Unit = definedExternally): Request<ListOnPremisesInstancesOutput, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceInput, callback: (err: AWSError, data: ListTagsForResourceOutput) -> Unit = definedExternally): Request<ListTagsForResourceOutput, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceOutput) -> Unit = definedExternally): Request<ListTagsForResourceOutput, AWSError>
    open fun putLifecycleEventHookExecutionStatus(params: PutLifecycleEventHookExecutionStatusInput, callback: (err: AWSError, data: PutLifecycleEventHookExecutionStatusOutput) -> Unit = definedExternally): Request<PutLifecycleEventHookExecutionStatusOutput, AWSError>
    open fun putLifecycleEventHookExecutionStatus(callback: (err: AWSError, data: PutLifecycleEventHookExecutionStatusOutput) -> Unit = definedExternally): Request<PutLifecycleEventHookExecutionStatusOutput, AWSError>
    open fun registerApplicationRevision(params: RegisterApplicationRevisionInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun registerApplicationRevision(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun registerOnPremisesInstance(params: RegisterOnPremisesInstanceInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun registerOnPremisesInstance(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeTagsFromOnPremisesInstances(params: RemoveTagsFromOnPremisesInstancesInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeTagsFromOnPremisesInstances(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun skipWaitTimeForInstanceTermination(params: SkipWaitTimeForInstanceTerminationInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun skipWaitTimeForInstanceTermination(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopDeployment(params: StopDeploymentInput, callback: (err: AWSError, data: StopDeploymentOutput) -> Unit = definedExternally): Request<StopDeploymentOutput, AWSError>
    open fun stopDeployment(callback: (err: AWSError, data: StopDeploymentOutput) -> Unit = definedExternally): Request<StopDeploymentOutput, AWSError>
    open fun tagResource(params: TagResourceInput, callback: (err: AWSError, data: TagResourceOutput) -> Unit = definedExternally): Request<TagResourceOutput, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceOutput) -> Unit = definedExternally): Request<TagResourceOutput, AWSError>
    open fun untagResource(params: UntagResourceInput, callback: (err: AWSError, data: UntagResourceOutput) -> Unit = definedExternally): Request<UntagResourceOutput, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceOutput) -> Unit = definedExternally): Request<UntagResourceOutput, AWSError>
    open fun updateApplication(params: UpdateApplicationInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateApplication(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateDeploymentGroup(params: UpdateDeploymentGroupInput, callback: (err: AWSError, data: UpdateDeploymentGroupOutput) -> Unit = definedExternally): Request<UpdateDeploymentGroupOutput, AWSError>
    open fun updateDeploymentGroup(callback: (err: AWSError, data: UpdateDeploymentGroupOutput) -> Unit = definedExternally): Request<UpdateDeploymentGroupOutput, AWSError>
    open fun waitFor(state: String /* "deploymentSuccessful" */, params: GetDeploymentInput /* CodeDeploy.Types.GetDeploymentInput & `T$0` */, callback: (err: AWSError, data: GetDeploymentOutput) -> Unit = definedExternally): Request<GetDeploymentOutput, AWSError>
    open fun waitFor(state: String /* "deploymentSuccessful" */, callback: (err: AWSError, data: GetDeploymentOutput) -> Unit = definedExternally): Request<GetDeploymentOutput, AWSError>
    interface AddTagsToOnPremisesInstancesInput {
        var tags: TagList
        var instanceNames: InstanceNameList
    }
    interface Alarm {
        var name: AlarmName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AlarmConfiguration {
        var enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ignorePollAlarmFailure: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var alarms: AlarmList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AppSpecContent {
        var content: RawStringContent?
            get() = definedExternally
            set(value) = definedExternally
        var sha256: RawStringSha256?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationInfo {
        var applicationId: ApplicationId?
            get() = definedExternally
            set(value) = definedExternally
        var applicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
        var createTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var linkedToGitHub: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var gitHubAccountName: GitHubAccountTokenName?
            get() = definedExternally
            set(value) = definedExternally
        var computePlatform: String /* "Server" | "Lambda" | "ECS" | String */
    }
    interface AutoRollbackConfiguration {
        var enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var events: AutoRollbackEventsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoScalingGroup {
        var name: AutoScalingGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var hook: AutoScalingGroupHook?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetApplicationRevisionsInput {
        var applicationName: ApplicationName
        var revisions: RevisionLocationList
    }
    interface BatchGetApplicationRevisionsOutput {
        var applicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
        var errorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
        var revisions: RevisionInfoList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetApplicationsInput {
        var applicationNames: ApplicationsList
    }
    interface BatchGetApplicationsOutput {
        var applicationsInfo: ApplicationsInfoList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetDeploymentGroupsInput {
        var applicationName: ApplicationName
        var deploymentGroupNames: DeploymentGroupsList
    }
    interface BatchGetDeploymentGroupsOutput {
        var deploymentGroupsInfo: DeploymentGroupInfoList?
            get() = definedExternally
            set(value) = definedExternally
        var errorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetDeploymentInstancesInput {
        var deploymentId: DeploymentId
        var instanceIds: InstancesList
    }
    interface BatchGetDeploymentInstancesOutput {
        var instancesSummary: InstanceSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var errorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetDeploymentTargetsInput {
        var deploymentId: DeploymentId?
            get() = definedExternally
            set(value) = definedExternally
        var targetIds: TargetIdList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetDeploymentTargetsOutput {
        var deploymentTargets: DeploymentTargetList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetDeploymentsInput {
        var deploymentIds: DeploymentsList
    }
    interface BatchGetDeploymentsOutput {
        var deploymentsInfo: DeploymentsInfoList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetOnPremisesInstancesInput {
        var instanceNames: InstanceNameList
    }
    interface BatchGetOnPremisesInstancesOutput {
        var instanceInfos: InstanceInfoList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BlueGreenDeploymentConfiguration {
        var terminateBlueInstancesOnDeploymentSuccess: BlueInstanceTerminationOption?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentReadyOption: DeploymentReadyOption?
            get() = definedExternally
            set(value) = definedExternally
        var greenFleetProvisioningOption: GreenFleetProvisioningOption?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BlueInstanceTerminationOption {
        var action: String /* "TERMINATE" | "KEEP_ALIVE" | String */
        var terminationWaitTimeInMinutes: Duration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContinueDeploymentInput {
        var deploymentId: DeploymentId?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentWaitType: String /* "READY_WAIT" | "TERMINATION_WAIT" | String */
    }
    interface CreateApplicationInput {
        var applicationName: ApplicationName
        var computePlatform: String /* "Server" | "Lambda" | "ECS" | String */
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateApplicationOutput {
        var applicationId: ApplicationId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeploymentConfigInput {
        var deploymentConfigName: DeploymentConfigName
        var minimumHealthyHosts: MinimumHealthyHosts?
            get() = definedExternally
            set(value) = definedExternally
        var trafficRoutingConfig: TrafficRoutingConfig?
            get() = definedExternally
            set(value) = definedExternally
        var computePlatform: String /* "Server" | "Lambda" | "ECS" | String */
    }
    interface CreateDeploymentConfigOutput {
        var deploymentConfigId: DeploymentConfigId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeploymentGroupInput {
        var applicationName: ApplicationName
        var deploymentGroupName: DeploymentGroupName
        var deploymentConfigName: DeploymentConfigName?
            get() = definedExternally
            set(value) = definedExternally
        var ec2TagFilters: EC2TagFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var onPremisesInstanceTagFilters: TagFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var autoScalingGroups: AutoScalingGroupNameList?
            get() = definedExternally
            set(value) = definedExternally
        var serviceRoleArn: Role
        var triggerConfigurations: TriggerConfigList?
            get() = definedExternally
            set(value) = definedExternally
        var alarmConfiguration: AlarmConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var autoRollbackConfiguration: AutoRollbackConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentStyle: DeploymentStyle?
            get() = definedExternally
            set(value) = definedExternally
        var blueGreenDeploymentConfiguration: BlueGreenDeploymentConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var loadBalancerInfo: LoadBalancerInfo?
            get() = definedExternally
            set(value) = definedExternally
        var ec2TagSet: EC2TagSet?
            get() = definedExternally
            set(value) = definedExternally
        var ecsServices: ECSServiceList?
            get() = definedExternally
            set(value) = definedExternally
        var onPremisesTagSet: OnPremisesTagSet?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeploymentGroupOutput {
        var deploymentGroupId: DeploymentGroupId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeploymentInput {
        var applicationName: ApplicationName
        var deploymentGroupName: DeploymentGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var revision: RevisionLocation?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentConfigName: DeploymentConfigName?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var ignoreApplicationStopFailures: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var targetInstances: TargetInstances?
            get() = definedExternally
            set(value) = definedExternally
        var autoRollbackConfiguration: AutoRollbackConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var updateOutdatedInstancesOnly: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var fileExistsBehavior: String /* "DISALLOW" | "OVERWRITE" | "RETAIN" | String */
    }
    interface CreateDeploymentOutput {
        var deploymentId: DeploymentId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteApplicationInput {
        var applicationName: ApplicationName
    }
    interface DeleteDeploymentConfigInput {
        var deploymentConfigName: DeploymentConfigName
    }
    interface DeleteDeploymentGroupInput {
        var applicationName: ApplicationName
        var deploymentGroupName: DeploymentGroupName
    }
    interface DeleteDeploymentGroupOutput {
        var hooksNotCleanedUp: AutoScalingGroupList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteGitHubAccountTokenInput {
        var tokenName: GitHubAccountTokenName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteGitHubAccountTokenOutput {
        var tokenName: GitHubAccountTokenName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeploymentConfigInfo {
        var deploymentConfigId: DeploymentConfigId?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentConfigName: DeploymentConfigName?
            get() = definedExternally
            set(value) = definedExternally
        var minimumHealthyHosts: MinimumHealthyHosts?
            get() = definedExternally
            set(value) = definedExternally
        var createTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var computePlatform: String /* "Server" | "Lambda" | "ECS" | String */
        var trafficRoutingConfig: TrafficRoutingConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeploymentGroupInfo {
        var applicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentGroupId: DeploymentGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentGroupName: DeploymentGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentConfigName: DeploymentConfigName?
            get() = definedExternally
            set(value) = definedExternally
        var ec2TagFilters: EC2TagFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var onPremisesInstanceTagFilters: TagFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var autoScalingGroups: AutoScalingGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var serviceRoleArn: Role?
            get() = definedExternally
            set(value) = definedExternally
        var targetRevision: RevisionLocation?
            get() = definedExternally
            set(value) = definedExternally
        var triggerConfigurations: TriggerConfigList?
            get() = definedExternally
            set(value) = definedExternally
        var alarmConfiguration: AlarmConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var autoRollbackConfiguration: AutoRollbackConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentStyle: DeploymentStyle?
            get() = definedExternally
            set(value) = definedExternally
        var blueGreenDeploymentConfiguration: BlueGreenDeploymentConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var loadBalancerInfo: LoadBalancerInfo?
            get() = definedExternally
            set(value) = definedExternally
        var lastSuccessfulDeployment: LastDeploymentInfo?
            get() = definedExternally
            set(value) = definedExternally
        var lastAttemptedDeployment: LastDeploymentInfo?
            get() = definedExternally
            set(value) = definedExternally
        var ec2TagSet: EC2TagSet?
            get() = definedExternally
            set(value) = definedExternally
        var onPremisesTagSet: OnPremisesTagSet?
            get() = definedExternally
            set(value) = definedExternally
        var computePlatform: String /* "Server" | "Lambda" | "ECS" | String */
        var ecsServices: ECSServiceList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeploymentInfo {
        var applicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentGroupName: DeploymentGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentConfigName: DeploymentConfigName?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentId: DeploymentId?
            get() = definedExternally
            set(value) = definedExternally
        var previousRevision: RevisionLocation?
            get() = definedExternally
            set(value) = definedExternally
        var revision: RevisionLocation?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Created" | "Queued" | "InProgress" | "Succeeded" | "Failed" | "Stopped" | "Ready" | String */
        var errorInformation: ErrorInformation?
            get() = definedExternally
            set(value) = definedExternally
        var createTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var startTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var completeTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentOverview: DeploymentOverview?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var creator: String /* "user" | "autoscaling" | "codeDeployRollback" | String */
        var ignoreApplicationStopFailures: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var autoRollbackConfiguration: AutoRollbackConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var updateOutdatedInstancesOnly: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var rollbackInfo: RollbackInfo?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentStyle: DeploymentStyle?
            get() = definedExternally
            set(value) = definedExternally
        var targetInstances: TargetInstances?
            get() = definedExternally
            set(value) = definedExternally
        var instanceTerminationWaitTimeStarted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var blueGreenDeploymentConfiguration: BlueGreenDeploymentConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var loadBalancerInfo: LoadBalancerInfo?
            get() = definedExternally
            set(value) = definedExternally
        var additionalDeploymentStatusInfo: AdditionalDeploymentStatusInfo?
            get() = definedExternally
            set(value) = definedExternally
        var fileExistsBehavior: String /* "DISALLOW" | "OVERWRITE" | "RETAIN" | String */
        var deploymentStatusMessages: DeploymentStatusMessageList?
            get() = definedExternally
            set(value) = definedExternally
        var computePlatform: String /* "Server" | "Lambda" | "ECS" | String */
    }
    interface DeploymentOverview {
        var Pending: InstanceCount?
            get() = definedExternally
            set(value) = definedExternally
        var InProgress: InstanceCount?
            get() = definedExternally
            set(value) = definedExternally
        var Succeeded: InstanceCount?
            get() = definedExternally
            set(value) = definedExternally
        var Failed: InstanceCount?
            get() = definedExternally
            set(value) = definedExternally
        var Skipped: InstanceCount?
            get() = definedExternally
            set(value) = definedExternally
        var Ready: InstanceCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeploymentReadyOption {
        var actionOnTimeout: String /* "CONTINUE_DEPLOYMENT" | "STOP_DEPLOYMENT" | String */
        var waitTimeInMinutes: Duration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeploymentStyle {
        var deploymentType: String /* "IN_PLACE" | "BLUE_GREEN" | String */
        var deploymentOption: String /* "WITH_TRAFFIC_CONTROL" | "WITHOUT_TRAFFIC_CONTROL" | String */
    }
    interface DeploymentTarget {
        var deploymentTargetType: String /* "InstanceTarget" | "LambdaTarget" | "ECSTarget" | String */
        var instanceTarget: InstanceTarget?
            get() = definedExternally
            set(value) = definedExternally
        var lambdaTarget: LambdaTarget?
            get() = definedExternally
            set(value) = definedExternally
        var ecsTarget: ECSTarget?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeregisterOnPremisesInstanceInput {
        var instanceName: InstanceName
    }
    interface Diagnostics {
        var errorCode: String /* "Success" | "ScriptMissing" | "ScriptNotExecutable" | "ScriptTimedOut" | "ScriptFailed" | "UnknownError" | String */
        var scriptName: ScriptName?
            get() = definedExternally
            set(value) = definedExternally
        var message: LifecycleMessage?
            get() = definedExternally
            set(value) = definedExternally
        var logTail: LogTail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EC2TagFilter {
        var Key: Key?
            get() = definedExternally
            set(value) = definedExternally
        var Value: Value?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "KEY_ONLY" | "VALUE_ONLY" | "KEY_AND_VALUE" | String */
    }
    interface EC2TagSet {
        var ec2TagSetList: EC2TagSetList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ECSService {
        var serviceName: ECSServiceName?
            get() = definedExternally
            set(value) = definedExternally
        var clusterName: ECSClusterName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ECSTarget {
        var deploymentId: DeploymentId?
            get() = definedExternally
            set(value) = definedExternally
        var targetId: TargetId?
            get() = definedExternally
            set(value) = definedExternally
        var targetArn: TargetArn?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: Time?
            get() = definedExternally
            set(value) = definedExternally
        var lifecycleEvents: LifecycleEventList?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Pending" | "InProgress" | "Succeeded" | "Failed" | "Skipped" | "Unknown" | "Ready" | String */
        var taskSetsInfo: ECSTaskSetList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ECSTaskSet {
        var identifer: ECSTaskSetIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var desiredCount: ECSTaskSetCount?
            get() = definedExternally
            set(value) = definedExternally
        var pendingCount: ECSTaskSetCount?
            get() = definedExternally
            set(value) = definedExternally
        var runningCount: ECSTaskSetCount?
            get() = definedExternally
            set(value) = definedExternally
        var status: ECSTaskSetStatus?
            get() = definedExternally
            set(value) = definedExternally
        var trafficWeight: TrafficWeight?
            get() = definedExternally
            set(value) = definedExternally
        var targetGroup: TargetGroupInfo?
            get() = definedExternally
            set(value) = definedExternally
        var taskSetLabel: String /* "Blue" | "Green" | String */
    }
    interface ELBInfo {
        var name: ELBName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ErrorInformation {
        var code: String /* "AGENT_ISSUE" | "ALARM_ACTIVE" | "APPLICATION_MISSING" | "AUTOSCALING_VALIDATION_ERROR" | "AUTO_SCALING_CONFIGURATION" | "AUTO_SCALING_IAM_ROLE_PERMISSIONS" | "CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND" | "CUSTOMER_APPLICATION_UNHEALTHY" | "DEPLOYMENT_GROUP_MISSING" | "ECS_UPDATE_ERROR" | "ELASTIC_LOAD_BALANCING_INVALID" | "ELB_INVALID_INSTANCE" | "HEALTH_CONSTRAINTS" | "HEALTH_CONSTRAINTS_INVALID" | "HOOK_EXECUTION_FAILURE" | "IAM_ROLE_MISSING" | "IAM_ROLE_PERMISSIONS" | "INTERNAL_ERROR" | "INVALID_ECS_SERVICE" | "INVALID_LAMBDA_CONFIGURATION" | "INVALID_LAMBDA_FUNCTION" | "INVALID_REVISION" | "MANUAL_STOP" | "MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION" | "MISSING_ELB_INFORMATION" | "MISSING_GITHUB_TOKEN" | "NO_EC2_SUBSCRIPTION" | "NO_INSTANCES" | "OVER_MAX_INSTANCES" | "RESOURCE_LIMIT_EXCEEDED" | "REVISION_MISSING" | "THROTTLED" | "TIMEOUT" | String */
        var message: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GenericRevisionInfo {
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentGroups: DeploymentGroupsList?
            get() = definedExternally
            set(value) = definedExternally
        var firstUsedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastUsedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var registerTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetApplicationInput {
        var applicationName: ApplicationName
    }
    interface GetApplicationOutput {
        var application: ApplicationInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetApplicationRevisionInput {
        var applicationName: ApplicationName
        var revision: RevisionLocation
    }
    interface GetApplicationRevisionOutput {
        var applicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
        var revision: RevisionLocation?
            get() = definedExternally
            set(value) = definedExternally
        var revisionInfo: GenericRevisionInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeploymentConfigInput {
        var deploymentConfigName: DeploymentConfigName
    }
    interface GetDeploymentConfigOutput {
        var deploymentConfigInfo: DeploymentConfigInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeploymentGroupInput {
        var applicationName: ApplicationName
        var deploymentGroupName: DeploymentGroupName
    }
    interface GetDeploymentGroupOutput {
        var deploymentGroupInfo: DeploymentGroupInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeploymentInput {
        var deploymentId: DeploymentId
    }
    interface GetDeploymentInstanceInput {
        var deploymentId: DeploymentId
        var instanceId: InstanceId
    }
    interface GetDeploymentInstanceOutput {
        var instanceSummary: InstanceSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeploymentOutput {
        var deploymentInfo: DeploymentInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeploymentTargetInput {
        var deploymentId: DeploymentId?
            get() = definedExternally
            set(value) = definedExternally
        var targetId: TargetId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeploymentTargetOutput {
        var deploymentTarget: DeploymentTarget?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOnPremisesInstanceInput {
        var instanceName: InstanceName
    }
    interface GetOnPremisesInstanceOutput {
        var instanceInfo: InstanceInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GitHubLocation {
        var repository: Repository?
            get() = definedExternally
            set(value) = definedExternally
        var commitId: CommitId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GreenFleetProvisioningOption {
        var action: String /* "DISCOVER_EXISTING" | "COPY_AUTO_SCALING_GROUP" | String */
    }
    interface InstanceInfo {
        var instanceName: InstanceName?
            get() = definedExternally
            set(value) = definedExternally
        var iamSessionArn: IamSessionArn?
            get() = definedExternally
            set(value) = definedExternally
        var iamUserArn: IamUserArn?
            get() = definedExternally
            set(value) = definedExternally
        var instanceArn: InstanceArn?
            get() = definedExternally
            set(value) = definedExternally
        var registerTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var deregisterTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceSummary {
        var deploymentId: DeploymentId?
            get() = definedExternally
            set(value) = definedExternally
        var instanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Pending" | "InProgress" | "Succeeded" | "Failed" | "Skipped" | "Unknown" | "Ready" | String */
        var lastUpdatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lifecycleEvents: LifecycleEventList?
            get() = definedExternally
            set(value) = definedExternally
        var instanceType: String /* "Blue" | "Green" | String */
    }
    interface InstanceTarget {
        var deploymentId: DeploymentId?
            get() = definedExternally
            set(value) = definedExternally
        var targetId: TargetId?
            get() = definedExternally
            set(value) = definedExternally
        var targetArn: TargetArn?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Pending" | "InProgress" | "Succeeded" | "Failed" | "Skipped" | "Unknown" | "Ready" | String */
        var lastUpdatedAt: Time?
            get() = definedExternally
            set(value) = definedExternally
        var lifecycleEvents: LifecycleEventList?
            get() = definedExternally
            set(value) = definedExternally
        var instanceLabel: String /* "Blue" | "Green" | String */
    }
    interface LambdaFunctionInfo {
        var functionName: LambdaFunctionName?
            get() = definedExternally
            set(value) = definedExternally
        var functionAlias: LambdaFunctionAlias?
            get() = definedExternally
            set(value) = definedExternally
        var currentVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
        var targetVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
        var targetVersionWeight: TrafficWeight?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LambdaTarget {
        var deploymentId: DeploymentId?
            get() = definedExternally
            set(value) = definedExternally
        var targetId: TargetId?
            get() = definedExternally
            set(value) = definedExternally
        var targetArn: TargetArn?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Pending" | "InProgress" | "Succeeded" | "Failed" | "Skipped" | "Unknown" | "Ready" | String */
        var lastUpdatedAt: Time?
            get() = definedExternally
            set(value) = definedExternally
        var lifecycleEvents: LifecycleEventList?
            get() = definedExternally
            set(value) = definedExternally
        var lambdaFunctionInfo: LambdaFunctionInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LastDeploymentInfo {
        var deploymentId: DeploymentId?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Created" | "Queued" | "InProgress" | "Succeeded" | "Failed" | "Stopped" | "Ready" | String */
        var endTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var createTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LifecycleEvent {
        var lifecycleEventName: LifecycleEventName?
            get() = definedExternally
            set(value) = definedExternally
        var diagnostics: Diagnostics?
            get() = definedExternally
            set(value) = definedExternally
        var startTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var endTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Pending" | "InProgress" | "Succeeded" | "Failed" | "Skipped" | "Unknown" | String */
    }
    interface ListApplicationRevisionsInput {
        var applicationName: ApplicationName
        var sortBy: String /* "registerTime" | "firstUsedTime" | "lastUsedTime" | String */
        var sortOrder: String /* "ascending" | "descending" | String */
        var s3Bucket: S3Bucket?
            get() = definedExternally
            set(value) = definedExternally
        var s3KeyPrefix: S3Key?
            get() = definedExternally
            set(value) = definedExternally
        var deployed: String /* "include" | "exclude" | "ignore" | String */
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListApplicationRevisionsOutput {
        var revisions: RevisionLocationList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListApplicationsInput {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListApplicationsOutput {
        var applications: ApplicationsList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeploymentConfigsInput {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeploymentConfigsOutput {
        var deploymentConfigsList: DeploymentConfigsList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeploymentGroupsInput {
        var applicationName: ApplicationName
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeploymentGroupsOutput {
        var applicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentGroups: DeploymentGroupsList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeploymentInstancesInput {
        var deploymentId: DeploymentId
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var instanceStatusFilter: InstanceStatusList?
            get() = definedExternally
            set(value) = definedExternally
        var instanceTypeFilter: InstanceTypeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeploymentInstancesOutput {
        var instancesList: InstancesList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeploymentTargetsInput {
        var deploymentId: DeploymentId?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var targetFilters: TargetFilters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeploymentTargetsOutput {
        var targetIds: TargetIdList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeploymentsInput {
        var applicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentGroupName: DeploymentGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var includeOnlyStatuses: DeploymentStatusList?
            get() = definedExternally
            set(value) = definedExternally
        var createTimeRange: TimeRange?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeploymentsOutput {
        var deployments: DeploymentsList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGitHubAccountTokenNamesInput {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGitHubAccountTokenNamesOutput {
        var tokenNameList: GitHubAccountTokenNameList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOnPremisesInstancesInput {
        var registrationStatus: String /* "Registered" | "Deregistered" | String */
        var tagFilters: TagFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOnPremisesInstancesOutput {
        var instanceNames: InstanceNameList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceInput {
        var ResourceArn: Arn
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceOutput {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoadBalancerInfo {
        var elbInfoList: ELBInfoList?
            get() = definedExternally
            set(value) = definedExternally
        var targetGroupInfoList: TargetGroupInfoList?
            get() = definedExternally
            set(value) = definedExternally
        var targetGroupPairInfoList: TargetGroupPairInfoList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MinimumHealthyHosts {
        var value: MinimumHealthyHostsValue?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "HOST_COUNT" | "FLEET_PERCENT" | String */
    }
    interface OnPremisesTagSet {
        var onPremisesTagSetList: OnPremisesTagSetList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutLifecycleEventHookExecutionStatusInput {
        var deploymentId: DeploymentId?
            get() = definedExternally
            set(value) = definedExternally
        var lifecycleEventHookExecutionId: LifecycleEventHookExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Pending" | "InProgress" | "Succeeded" | "Failed" | "Skipped" | "Unknown" | String */
    }
    interface PutLifecycleEventHookExecutionStatusOutput {
        var lifecycleEventHookExecutionId: LifecycleEventHookExecutionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RawString {
        var content: RawStringContent?
            get() = definedExternally
            set(value) = definedExternally
        var sha256: RawStringSha256?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterApplicationRevisionInput {
        var applicationName: ApplicationName
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var revision: RevisionLocation
    }
    interface RegisterOnPremisesInstanceInput {
        var instanceName: InstanceName
        var iamSessionArn: IamSessionArn?
            get() = definedExternally
            set(value) = definedExternally
        var iamUserArn: IamUserArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveTagsFromOnPremisesInstancesInput {
        var tags: TagList
        var instanceNames: InstanceNameList
    }
    interface RevisionInfo {
        var revisionLocation: RevisionLocation?
            get() = definedExternally
            set(value) = definedExternally
        var genericRevisionInfo: GenericRevisionInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RevisionLocation {
        var revisionType: String /* "S3" | "GitHub" | "String" | "AppSpecContent" | String */
        var s3Location: S3Location?
            get() = definedExternally
            set(value) = definedExternally
        var gitHubLocation: GitHubLocation?
            get() = definedExternally
            set(value) = definedExternally
        var string: RawString?
            get() = definedExternally
            set(value) = definedExternally
        var appSpecContent: AppSpecContent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RollbackInfo {
        var rollbackDeploymentId: DeploymentId?
            get() = definedExternally
            set(value) = definedExternally
        var rollbackTriggeringDeploymentId: DeploymentId?
            get() = definedExternally
            set(value) = definedExternally
        var rollbackMessage: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3Location {
        var bucket: S3Bucket?
            get() = definedExternally
            set(value) = definedExternally
        var key: S3Key?
            get() = definedExternally
            set(value) = definedExternally
        var bundleType: String /* "tar" | "tgz" | "zip" | "YAML" | "JSON" | String */
        var version: VersionId?
            get() = definedExternally
            set(value) = definedExternally
        var eTag: ETag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SkipWaitTimeForInstanceTerminationInput {
        var deploymentId: DeploymentId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopDeploymentInput {
        var deploymentId: DeploymentId
        var autoRollbackEnabled: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopDeploymentOutput {
        var status: String /* "Pending" | "Succeeded" | String */
        var statusMessage: Message?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: Key?
            get() = definedExternally
            set(value) = definedExternally
        var Value: Value?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagFilter {
        var Key: Key?
            get() = definedExternally
            set(value) = definedExternally
        var Value: Value?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "KEY_ONLY" | "VALUE_ONLY" | "KEY_AND_VALUE" | String */
    }
    interface TagResourceInput {
        var ResourceArn: Arn
        var Tags: TagList
    }
    interface TagResourceOutput
    interface TargetFilters {
        @nativeGetter
        operator fun get(key: String): FilterValueList?
        @nativeSetter
        operator fun set(key: String, value: FilterValueList)
    }
    interface TargetGroupInfo {
        var name: TargetGroupName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TargetGroupPairInfo {
        var targetGroups: TargetGroupInfoList?
            get() = definedExternally
            set(value) = definedExternally
        var prodTrafficRoute: TrafficRoute?
            get() = definedExternally
            set(value) = definedExternally
        var testTrafficRoute: TrafficRoute?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TargetInstances {
        var tagFilters: EC2TagFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var autoScalingGroups: AutoScalingGroupNameList?
            get() = definedExternally
            set(value) = definedExternally
        var ec2TagSet: EC2TagSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TimeBasedCanary {
        var canaryPercentage: Percentage?
            get() = definedExternally
            set(value) = definedExternally
        var canaryInterval: WaitTimeInMins?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TimeBasedLinear {
        var linearPercentage: Percentage?
            get() = definedExternally
            set(value) = definedExternally
        var linearInterval: WaitTimeInMins?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TimeRange {
        var start: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var end: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrafficRoute {
        var listenerArns: ListenerArnList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrafficRoutingConfig {
        var type: String /* "TimeBasedCanary" | "TimeBasedLinear" | "AllAtOnce" | String */
        var timeBasedCanary: TimeBasedCanary?
            get() = definedExternally
            set(value) = definedExternally
        var timeBasedLinear: TimeBasedLinear?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TriggerConfig {
        var triggerName: TriggerName?
            get() = definedExternally
            set(value) = definedExternally
        var triggerTargetArn: TriggerTargetArn?
            get() = definedExternally
            set(value) = definedExternally
        var triggerEvents: TriggerEventTypeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceInput {
        var ResourceArn: Arn
        var TagKeys: TagKeyList
    }
    interface UntagResourceOutput
    interface UpdateApplicationInput {
        var applicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
        var newApplicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDeploymentGroupInput {
        var applicationName: ApplicationName
        var currentDeploymentGroupName: DeploymentGroupName
        var newDeploymentGroupName: DeploymentGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentConfigName: DeploymentConfigName?
            get() = definedExternally
            set(value) = definedExternally
        var ec2TagFilters: EC2TagFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var onPremisesInstanceTagFilters: TagFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var autoScalingGroups: AutoScalingGroupNameList?
            get() = definedExternally
            set(value) = definedExternally
        var serviceRoleArn: Role?
            get() = definedExternally
            set(value) = definedExternally
        var triggerConfigurations: TriggerConfigList?
            get() = definedExternally
            set(value) = definedExternally
        var alarmConfiguration: AlarmConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var autoRollbackConfiguration: AutoRollbackConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentStyle: DeploymentStyle?
            get() = definedExternally
            set(value) = definedExternally
        var blueGreenDeploymentConfiguration: BlueGreenDeploymentConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var loadBalancerInfo: LoadBalancerInfo?
            get() = definedExternally
            set(value) = definedExternally
        var ec2TagSet: EC2TagSet?
            get() = definedExternally
            set(value) = definedExternally
        var ecsServices: ECSServiceList?
            get() = definedExternally
            set(value) = definedExternally
        var onPremisesTagSet: OnPremisesTagSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDeploymentGroupOutput {
        var hooksNotCleanedUp: AutoScalingGroupList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2014-10-06" | "latest" | String */
    }
}