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
import EMR.Application
import EMR.BootstrapActionConfig
import EMR.BootstrapActionDetail
import EMR.CancelStepsInfo
import EMR.ClusterSummary
import EMR.Command
import EMR.Configuration
import EMR.EbsBlockDeviceConfig
import EMR.EbsBlockDevice
import EMR.EbsVolume
import EMR.InstanceFleetConfig
import EMR.InstanceFleet
import EMR.InstanceGroupConfig
import EMR.InstanceGroupDetail
import EMR.InstanceGroup
import EMR.InstanceGroupModifyConfig
import EMR.Instance
import EMR.InstanceTypeConfig
import EMR.InstanceTypeSpecification
import EMR.JobFlowDetail
import EMR.KeyValue
import EMR.MetricDimension
import EMR.SupportedProductConfig
import EMR.PortRange
import EMR.ScalingRule
import EMR.SecurityConfigurationSummary
import EMR.StepConfig
import EMR.StepDetail
import EMR.StepSummary
import EMR.Tag
import EMR.AddInstanceFleetInput
import EMR.AddInstanceFleetOutput
import EMR.AddInstanceGroupsInput
import EMR.AddInstanceGroupsOutput
import EMR.AddJobFlowStepsInput
import EMR.AddJobFlowStepsOutput
import EMR.AddTagsInput
import EMR.AddTagsOutput
import EMR.CancelStepsInput
import EMR.CancelStepsOutput
import EMR.CreateSecurityConfigurationInput
import EMR.CreateSecurityConfigurationOutput
import EMR.DeleteSecurityConfigurationInput
import EMR.DeleteSecurityConfigurationOutput
import EMR.DescribeClusterInput
import EMR.DescribeClusterOutput
import EMR.DescribeJobFlowsInput
import EMR.DescribeJobFlowsOutput
import EMR.DescribeSecurityConfigurationInput
import EMR.DescribeSecurityConfigurationOutput
import EMR.DescribeStepInput
import EMR.DescribeStepOutput
import EMR.GetBlockPublicAccessConfigurationInput
import EMR.GetBlockPublicAccessConfigurationOutput
import EMR.ListBootstrapActionsInput
import EMR.ListBootstrapActionsOutput
import EMR.ListClustersInput
import EMR.ListClustersOutput
import EMR.ListInstanceFleetsInput
import EMR.ListInstanceFleetsOutput
import EMR.ListInstanceGroupsInput
import EMR.ListInstanceGroupsOutput
import EMR.ListInstancesInput
import EMR.ListInstancesOutput
import EMR.ListSecurityConfigurationsInput
import EMR.ListSecurityConfigurationsOutput
import EMR.ListStepsInput
import EMR.ListStepsOutput
import EMR.ModifyClusterInput
import EMR.ModifyClusterOutput
import EMR.ModifyInstanceFleetInput
import EMR.ModifyInstanceGroupsInput
import EMR.PutAutoScalingPolicyInput
import EMR.PutAutoScalingPolicyOutput
import EMR.PutBlockPublicAccessConfigurationInput
import EMR.PutBlockPublicAccessConfigurationOutput
import EMR.RemoveAutoScalingPolicyInput
import EMR.RemoveAutoScalingPolicyOutput
import EMR.RemoveTagsInput
import EMR.RemoveTagsOutput
import EMR.RunJobFlowInput
import EMR.RunJobFlowOutput
import EMR.SetTerminationProtectionInput
import EMR.SetVisibleToAllUsersInput
import EMR.TerminateJobFlowsInput
import EMR.StringMap
import EMR.ScalingConstraints
import EMR.AutoScalingPolicyStatus
import EMR.AutoScalingPolicyStateChangeReason
import EMR.ScriptBootstrapActionConfig
import EMR.ClusterStatus
import EMR.Ec2InstanceAttributes
import EMR.KerberosAttributes
import EMR.ClusterStateChangeReason
import EMR.ClusterTimeline
import EMR.Cluster
import EMR.Step
import EMR.VolumeSpecification
import EMR.BlockPublicAccessConfiguration
import EMR.BlockPublicAccessConfigurationMetadata
import EMR.InstanceStatus
import EMR.InstanceFleetStatus
import EMR.InstanceFleetProvisioningSpecifications
import EMR.SpotProvisioningSpecification
import EMR.InstanceFleetStateChangeReason
import EMR.InstanceFleetTimeline
import EMR.InstanceGroupStatus
import EMR.ShrinkPolicy
import EMR.AutoScalingPolicyDescription
import EMR.EbsConfiguration
import EMR.AutoScalingPolicy
import EMR.InstanceGroupStateChangeReason
import EMR.InstanceGroupTimeline
import EMR.InstanceStateChangeReason
import EMR.InstanceTimeline
import EMR.JobFlowExecutionStatusDetail
import EMR.JobFlowInstancesDetail
import EMR.PlacementType
import EMR.InstanceFleetModifyConfig
import EMR.JobFlowInstancesConfig
import EMR.SimpleScalingPolicyConfiguration
import EMR.ScalingAction
import EMR.ScalingTrigger
import EMR.CloudWatchAlarmDefinition
import EMR.InstanceResizePolicy
import EMR.HadoopStepConfig
import EMR.StepStatus
import EMR.HadoopJarStepConfig
import EMR.StepExecutionStatusDetail
import EMR.StepStateChangeReason
import EMR.FailureDetails
import EMR.StepTimeline

typealias ApplicationList = Array<Application>

typealias ArnType = String

typealias Boolean = Boolean

typealias BooleanObject = Boolean

typealias BootstrapActionConfigList = Array<BootstrapActionConfig>

typealias BootstrapActionDetailList = Array<BootstrapActionDetail>

typealias CancelStepsInfoList = Array<CancelStepsInfo>

typealias ClusterId = String

typealias ClusterStateList = Array<String /* "STARTING" | "BOOTSTRAPPING" | "RUNNING" | "WAITING" | "TERMINATING" | "TERMINATED" | "TERMINATED_WITH_ERRORS" | String */>

typealias ClusterSummaryList = Array<ClusterSummary>

typealias CommandList = Array<Command>

typealias ConfigurationList = Array<Configuration>

typealias _Date = Date

typealias EC2InstanceIdsList = Array<InstanceId>

typealias EC2InstanceIdsToTerminateList = Array<InstanceId>

typealias EbsBlockDeviceConfigList = Array<EbsBlockDeviceConfig>

typealias EbsBlockDeviceList = Array<EbsBlockDevice>

typealias EbsVolumeList = Array<EbsVolume>

typealias InstanceFleetConfigList = Array<InstanceFleetConfig>

typealias InstanceFleetId = String

typealias InstanceFleetList = Array<InstanceFleet>

typealias InstanceGroupConfigList = Array<InstanceGroupConfig>

typealias InstanceGroupDetailList = Array<InstanceGroupDetail>

typealias InstanceGroupId = String

typealias InstanceGroupIdsList = Array<XmlStringMaxLen256>

typealias InstanceGroupList = Array<InstanceGroup>

typealias InstanceGroupModifyConfigList = Array<InstanceGroupModifyConfig>

typealias InstanceGroupTypeList = Array<String /* "MASTER" | "CORE" | "TASK" | String */>

typealias InstanceId = String

typealias InstanceList = Array<Instance>

typealias InstanceStateList = Array<String /* "AWAITING_FULFILLMENT" | "PROVISIONING" | "BOOTSTRAPPING" | "RUNNING" | "TERMINATED" | String */>

typealias InstanceType = String

typealias InstanceTypeConfigList = Array<InstanceTypeConfig>

typealias InstanceTypeSpecificationList = Array<InstanceTypeSpecification>

typealias Integer = Number

typealias JobFlowDetailList = Array<JobFlowDetail>

typealias JobFlowExecutionStateList = Array<String /* "STARTING" | "BOOTSTRAPPING" | "RUNNING" | "WAITING" | "SHUTTING_DOWN" | "TERMINATED" | "COMPLETED" | "FAILED" | String */>

typealias KeyValueList = Array<KeyValue>

typealias Long = Number

typealias Marker = String

typealias MetricDimensionList = Array<MetricDimension>

typealias NewSupportedProductsList = Array<SupportedProductConfig>

typealias NonNegativeDouble = Number

typealias OptionalArnType = String

typealias Port = Number

typealias PortRanges = Array<PortRange>

typealias ResourceId = String

typealias ScalingRuleList = Array<ScalingRule>

typealias SecurityConfigurationList = Array<SecurityConfigurationSummary>

typealias SecurityGroupsList = Array<XmlStringMaxLen256>

typealias StepConfigList = Array<StepConfig>

typealias StepDetailList = Array<StepDetail>

typealias StepId = String

typealias StepIdsList = Array<XmlStringMaxLen256>

typealias StepStateList = Array<String /* "PENDING" | "CANCEL_PENDING" | "RUNNING" | "COMPLETED" | "CANCELLED" | "FAILED" | "INTERRUPTED" | String */>

typealias StepSummaryList = Array<StepSummary>

typealias String = String

typealias StringList = Array<String>

typealias SupportedProductsList = Array<XmlStringMaxLen256>

typealias TagList = Array<Tag>

typealias WholeNumber = Number

typealias XmlString = String

typealias XmlStringList = Array<XmlString>

typealias XmlStringMaxLen256 = String

typealias XmlStringMaxLen256List = Array<XmlStringMaxLen256>

@JsModule("aws-sdk")
external open class EMR(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & EMR.Types.ClientConfiguration */
    open fun addInstanceFleet(params: AddInstanceFleetInput, callback: (err: AWSError, data: AddInstanceFleetOutput) -> Unit = definedExternally): Request<AddInstanceFleetOutput, AWSError>
    open fun addInstanceFleet(callback: (err: AWSError, data: AddInstanceFleetOutput) -> Unit = definedExternally): Request<AddInstanceFleetOutput, AWSError>
    open fun addInstanceGroups(params: AddInstanceGroupsInput, callback: (err: AWSError, data: AddInstanceGroupsOutput) -> Unit = definedExternally): Request<AddInstanceGroupsOutput, AWSError>
    open fun addInstanceGroups(callback: (err: AWSError, data: AddInstanceGroupsOutput) -> Unit = definedExternally): Request<AddInstanceGroupsOutput, AWSError>
    open fun addJobFlowSteps(params: AddJobFlowStepsInput, callback: (err: AWSError, data: AddJobFlowStepsOutput) -> Unit = definedExternally): Request<AddJobFlowStepsOutput, AWSError>
    open fun addJobFlowSteps(callback: (err: AWSError, data: AddJobFlowStepsOutput) -> Unit = definedExternally): Request<AddJobFlowStepsOutput, AWSError>
    open fun addTags(params: AddTagsInput, callback: (err: AWSError, data: AddTagsOutput) -> Unit = definedExternally): Request<AddTagsOutput, AWSError>
    open fun addTags(callback: (err: AWSError, data: AddTagsOutput) -> Unit = definedExternally): Request<AddTagsOutput, AWSError>
    open fun cancelSteps(params: CancelStepsInput, callback: (err: AWSError, data: CancelStepsOutput) -> Unit = definedExternally): Request<CancelStepsOutput, AWSError>
    open fun cancelSteps(callback: (err: AWSError, data: CancelStepsOutput) -> Unit = definedExternally): Request<CancelStepsOutput, AWSError>
    open fun createSecurityConfiguration(params: CreateSecurityConfigurationInput, callback: (err: AWSError, data: CreateSecurityConfigurationOutput) -> Unit = definedExternally): Request<CreateSecurityConfigurationOutput, AWSError>
    open fun createSecurityConfiguration(callback: (err: AWSError, data: CreateSecurityConfigurationOutput) -> Unit = definedExternally): Request<CreateSecurityConfigurationOutput, AWSError>
    open fun deleteSecurityConfiguration(params: DeleteSecurityConfigurationInput, callback: (err: AWSError, data: DeleteSecurityConfigurationOutput) -> Unit = definedExternally): Request<DeleteSecurityConfigurationOutput, AWSError>
    open fun deleteSecurityConfiguration(callback: (err: AWSError, data: DeleteSecurityConfigurationOutput) -> Unit = definedExternally): Request<DeleteSecurityConfigurationOutput, AWSError>
    open fun describeCluster(params: DescribeClusterInput, callback: (err: AWSError, data: DescribeClusterOutput) -> Unit = definedExternally): Request<DescribeClusterOutput, AWSError>
    open fun describeCluster(callback: (err: AWSError, data: DescribeClusterOutput) -> Unit = definedExternally): Request<DescribeClusterOutput, AWSError>
    open fun describeJobFlows(params: DescribeJobFlowsInput, callback: (err: AWSError, data: DescribeJobFlowsOutput) -> Unit = definedExternally): Request<DescribeJobFlowsOutput, AWSError>
    open fun describeJobFlows(callback: (err: AWSError, data: DescribeJobFlowsOutput) -> Unit = definedExternally): Request<DescribeJobFlowsOutput, AWSError>
    open fun describeSecurityConfiguration(params: DescribeSecurityConfigurationInput, callback: (err: AWSError, data: DescribeSecurityConfigurationOutput) -> Unit = definedExternally): Request<DescribeSecurityConfigurationOutput, AWSError>
    open fun describeSecurityConfiguration(callback: (err: AWSError, data: DescribeSecurityConfigurationOutput) -> Unit = definedExternally): Request<DescribeSecurityConfigurationOutput, AWSError>
    open fun describeStep(params: DescribeStepInput, callback: (err: AWSError, data: DescribeStepOutput) -> Unit = definedExternally): Request<DescribeStepOutput, AWSError>
    open fun describeStep(callback: (err: AWSError, data: DescribeStepOutput) -> Unit = definedExternally): Request<DescribeStepOutput, AWSError>
    open fun getBlockPublicAccessConfiguration(params: GetBlockPublicAccessConfigurationInput, callback: (err: AWSError, data: GetBlockPublicAccessConfigurationOutput) -> Unit = definedExternally): Request<GetBlockPublicAccessConfigurationOutput, AWSError>
    open fun getBlockPublicAccessConfiguration(callback: (err: AWSError, data: GetBlockPublicAccessConfigurationOutput) -> Unit = definedExternally): Request<GetBlockPublicAccessConfigurationOutput, AWSError>
    open fun listBootstrapActions(params: ListBootstrapActionsInput, callback: (err: AWSError, data: ListBootstrapActionsOutput) -> Unit = definedExternally): Request<ListBootstrapActionsOutput, AWSError>
    open fun listBootstrapActions(callback: (err: AWSError, data: ListBootstrapActionsOutput) -> Unit = definedExternally): Request<ListBootstrapActionsOutput, AWSError>
    open fun listClusters(params: ListClustersInput, callback: (err: AWSError, data: ListClustersOutput) -> Unit = definedExternally): Request<ListClustersOutput, AWSError>
    open fun listClusters(callback: (err: AWSError, data: ListClustersOutput) -> Unit = definedExternally): Request<ListClustersOutput, AWSError>
    open fun listInstanceFleets(params: ListInstanceFleetsInput, callback: (err: AWSError, data: ListInstanceFleetsOutput) -> Unit = definedExternally): Request<ListInstanceFleetsOutput, AWSError>
    open fun listInstanceFleets(callback: (err: AWSError, data: ListInstanceFleetsOutput) -> Unit = definedExternally): Request<ListInstanceFleetsOutput, AWSError>
    open fun listInstanceGroups(params: ListInstanceGroupsInput, callback: (err: AWSError, data: ListInstanceGroupsOutput) -> Unit = definedExternally): Request<ListInstanceGroupsOutput, AWSError>
    open fun listInstanceGroups(callback: (err: AWSError, data: ListInstanceGroupsOutput) -> Unit = definedExternally): Request<ListInstanceGroupsOutput, AWSError>
    open fun listInstances(params: ListInstancesInput, callback: (err: AWSError, data: ListInstancesOutput) -> Unit = definedExternally): Request<ListInstancesOutput, AWSError>
    open fun listInstances(callback: (err: AWSError, data: ListInstancesOutput) -> Unit = definedExternally): Request<ListInstancesOutput, AWSError>
    open fun listSecurityConfigurations(params: ListSecurityConfigurationsInput, callback: (err: AWSError, data: ListSecurityConfigurationsOutput) -> Unit = definedExternally): Request<ListSecurityConfigurationsOutput, AWSError>
    open fun listSecurityConfigurations(callback: (err: AWSError, data: ListSecurityConfigurationsOutput) -> Unit = definedExternally): Request<ListSecurityConfigurationsOutput, AWSError>
    open fun listSteps(params: ListStepsInput, callback: (err: AWSError, data: ListStepsOutput) -> Unit = definedExternally): Request<ListStepsOutput, AWSError>
    open fun listSteps(callback: (err: AWSError, data: ListStepsOutput) -> Unit = definedExternally): Request<ListStepsOutput, AWSError>
    open fun modifyCluster(params: ModifyClusterInput, callback: (err: AWSError, data: ModifyClusterOutput) -> Unit = definedExternally): Request<ModifyClusterOutput, AWSError>
    open fun modifyCluster(callback: (err: AWSError, data: ModifyClusterOutput) -> Unit = definedExternally): Request<ModifyClusterOutput, AWSError>
    open fun modifyInstanceFleet(params: ModifyInstanceFleetInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun modifyInstanceFleet(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun modifyInstanceGroups(params: ModifyInstanceGroupsInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun modifyInstanceGroups(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putAutoScalingPolicy(params: PutAutoScalingPolicyInput, callback: (err: AWSError, data: PutAutoScalingPolicyOutput) -> Unit = definedExternally): Request<PutAutoScalingPolicyOutput, AWSError>
    open fun putAutoScalingPolicy(callback: (err: AWSError, data: PutAutoScalingPolicyOutput) -> Unit = definedExternally): Request<PutAutoScalingPolicyOutput, AWSError>
    open fun putBlockPublicAccessConfiguration(params: PutBlockPublicAccessConfigurationInput, callback: (err: AWSError, data: PutBlockPublicAccessConfigurationOutput) -> Unit = definedExternally): Request<PutBlockPublicAccessConfigurationOutput, AWSError>
    open fun putBlockPublicAccessConfiguration(callback: (err: AWSError, data: PutBlockPublicAccessConfigurationOutput) -> Unit = definedExternally): Request<PutBlockPublicAccessConfigurationOutput, AWSError>
    open fun removeAutoScalingPolicy(params: RemoveAutoScalingPolicyInput, callback: (err: AWSError, data: RemoveAutoScalingPolicyOutput) -> Unit = definedExternally): Request<RemoveAutoScalingPolicyOutput, AWSError>
    open fun removeAutoScalingPolicy(callback: (err: AWSError, data: RemoveAutoScalingPolicyOutput) -> Unit = definedExternally): Request<RemoveAutoScalingPolicyOutput, AWSError>
    open fun removeTags(params: RemoveTagsInput, callback: (err: AWSError, data: RemoveTagsOutput) -> Unit = definedExternally): Request<RemoveTagsOutput, AWSError>
    open fun removeTags(callback: (err: AWSError, data: RemoveTagsOutput) -> Unit = definedExternally): Request<RemoveTagsOutput, AWSError>
    open fun runJobFlow(params: RunJobFlowInput, callback: (err: AWSError, data: RunJobFlowOutput) -> Unit = definedExternally): Request<RunJobFlowOutput, AWSError>
    open fun runJobFlow(callback: (err: AWSError, data: RunJobFlowOutput) -> Unit = definedExternally): Request<RunJobFlowOutput, AWSError>
    open fun setTerminationProtection(params: SetTerminationProtectionInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setTerminationProtection(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setVisibleToAllUsers(params: SetVisibleToAllUsersInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setVisibleToAllUsers(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun terminateJobFlows(params: TerminateJobFlowsInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun terminateJobFlows(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun waitFor(state: String, params: DescribeClusterInput, callback: (err: AWSError, data: DescribeClusterOutput) -> Unit = definedExternally): Request<DescribeClusterOutput, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DescribeClusterOutput) -> Unit = definedExternally): Request<DescribeClusterOutput, AWSError>
    open fun waitFor(state: String /* "stepComplete" */, params: DescribeStepInput /* EMR.Types.DescribeStepInput & `T$0` */, callback: (err: AWSError, data: DescribeStepOutput) -> Unit = definedExternally): Request<DescribeStepOutput, AWSError>
    open fun waitFor(state: String /* "stepComplete" */, callback: (err: AWSError, data: DescribeStepOutput) -> Unit = definedExternally): Request<DescribeStepOutput, AWSError>
    interface AddInstanceFleetInput {
        var ClusterId: XmlStringMaxLen256
        var InstanceFleet: InstanceFleetConfig
    }
    interface AddInstanceFleetOutput {
        var ClusterId: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceFleetId: InstanceFleetId?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterArn: ArnType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddInstanceGroupsInput {
        var InstanceGroups: InstanceGroupConfigList
        var JobFlowId: XmlStringMaxLen256
    }
    interface AddInstanceGroupsOutput {
        var JobFlowId: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceGroupIds: InstanceGroupIdsList?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterArn: ArnType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddJobFlowStepsInput {
        var JobFlowId: XmlStringMaxLen256
        var Steps: StepConfigList
    }
    interface AddJobFlowStepsOutput {
        var StepIds: StepIdsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddTagsInput {
        var ResourceId: ResourceId
        var Tags: TagList
    }
    interface AddTagsOutput
    interface Application {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Version: String?
            get() = definedExternally
            set(value) = definedExternally
        var Args: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var AdditionalInfo: StringMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoScalingPolicy {
        var Constraints: ScalingConstraints
        var Rules: ScalingRuleList
    }
    interface AutoScalingPolicyDescription {
        var Status: AutoScalingPolicyStatus?
            get() = definedExternally
            set(value) = definedExternally
        var Constraints: ScalingConstraints?
            get() = definedExternally
            set(value) = definedExternally
        var Rules: ScalingRuleList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoScalingPolicyStateChangeReason {
        var Code: String /* "USER_REQUEST" | "PROVISION_FAILURE" | "CLEANUP_FAILURE" | String */
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoScalingPolicyStatus {
        var State: String /* "PENDING" | "ATTACHING" | "ATTACHED" | "DETACHING" | "DETACHED" | "FAILED" | String */
        var StateChangeReason: AutoScalingPolicyStateChangeReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BlockPublicAccessConfiguration {
        var BlockPublicSecurityGroupRules: Boolean
        var PermittedPublicSecurityGroupRuleRanges: PortRanges?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BlockPublicAccessConfigurationMetadata {
        var CreationDateTime: _Date
        var CreatedByArn: ArnType
    }
    interface BootstrapActionConfig {
        var Name: XmlStringMaxLen256
        var ScriptBootstrapAction: ScriptBootstrapActionConfig
    }
    interface BootstrapActionDetail {
        var BootstrapActionConfig: BootstrapActionConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelStepsInfo {
        var StepId: StepId?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "SUBMITTED" | "FAILED" | String */
        var Reason: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelStepsInput {
        var ClusterId: XmlStringMaxLen256
        var StepIds: StepIdsList
        var StepCancellationOption: String /* "SEND_INTERRUPT" | "TERMINATE_PROCESS" | String */
    }
    interface CancelStepsOutput {
        var CancelStepsInfoList: CancelStepsInfoList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CloudWatchAlarmDefinition {
        var ComparisonOperator: String /* "GREATER_THAN_OR_EQUAL" | "GREATER_THAN" | "LESS_THAN" | "LESS_THAN_OR_EQUAL" | String */
        var EvaluationPeriods: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var MetricName: String
        var Namespace: String?
            get() = definedExternally
            set(value) = definedExternally
        var Period: Integer
        var Statistic: String /* "SAMPLE_COUNT" | "AVERAGE" | "SUM" | "MINIMUM" | "MAXIMUM" | String */
        var Threshold: NonNegativeDouble
        var Unit: String /* "NONE" | "SECONDS" | "MICRO_SECONDS" | "MILLI_SECONDS" | "BYTES" | "KILO_BYTES" | "MEGA_BYTES" | "GIGA_BYTES" | "TERA_BYTES" | "BITS" | "KILO_BITS" | "MEGA_BITS" | "GIGA_BITS" | "TERA_BITS" | "PERCENT" | "COUNT" | "BYTES_PER_SECOND" | "KILO_BYTES_PER_SECOND" | "MEGA_BYTES_PER_SECOND" | "GIGA_BYTES_PER_SECOND" | "TERA_BYTES_PER_SECOND" | "BITS_PER_SECOND" | "KILO_BITS_PER_SECOND" | "MEGA_BITS_PER_SECOND" | "GIGA_BITS_PER_SECOND" | "TERA_BITS_PER_SECOND" | "COUNT_PER_SECOND" | String */
        var Dimensions: MetricDimensionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Cluster {
        var Id: ClusterId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: ClusterStatus?
            get() = definedExternally
            set(value) = definedExternally
        var Ec2InstanceAttributes: Ec2InstanceAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceCollectionType: String /* "INSTANCE_FLEET" | "INSTANCE_GROUP" | String */
        var LogUri: String?
            get() = definedExternally
            set(value) = definedExternally
        var RequestedAmiVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var RunningAmiVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReleaseLabel: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutoTerminate: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var TerminationProtected: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var VisibleToAllUsers: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Applications: ApplicationList?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceRole: String?
            get() = definedExternally
            set(value) = definedExternally
        var NormalizedInstanceHours: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var MasterPublicDnsName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Configurations: ConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityConfiguration: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingRole: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var ScaleDownBehavior: String /* "TERMINATE_AT_INSTANCE_HOUR" | "TERMINATE_AT_TASK_COMPLETION" | String */
        var CustomAmiId: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var EbsRootVolumeSize: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var RepoUpgradeOnBoot: String /* "SECURITY" | "NONE" | String */
        var KerberosAttributes: KerberosAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterArn: ArnType?
            get() = definedExternally
            set(value) = definedExternally
        var StepConcurrencyLevel: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var OutpostArn: OptionalArnType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterStateChangeReason {
        var Code: String /* "INTERNAL_ERROR" | "VALIDATION_ERROR" | "INSTANCE_FAILURE" | "INSTANCE_FLEET_TIMEOUT" | "BOOTSTRAP_FAILURE" | "USER_REQUEST" | "STEP_FAILURE" | "ALL_STEPS_COMPLETED" | String */
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterStatus {
        var State: String /* "STARTING" | "BOOTSTRAPPING" | "RUNNING" | "WAITING" | "TERMINATING" | "TERMINATED" | "TERMINATED_WITH_ERRORS" | String */
        var StateChangeReason: ClusterStateChangeReason?
            get() = definedExternally
            set(value) = definedExternally
        var Timeline: ClusterTimeline?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterSummary {
        var Id: ClusterId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: ClusterStatus?
            get() = definedExternally
            set(value) = definedExternally
        var NormalizedInstanceHours: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterArn: ArnType?
            get() = definedExternally
            set(value) = definedExternally
        var OutpostArn: OptionalArnType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterTimeline {
        var CreationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var ReadyDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var EndDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Command {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var ScriptPath: String?
            get() = definedExternally
            set(value) = definedExternally
        var Args: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Configuration {
        var Classification: String?
            get() = definedExternally
            set(value) = definedExternally
        var Configurations: ConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
        var Properties: StringMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSecurityConfigurationInput {
        var Name: XmlString
        var SecurityConfiguration: String
    }
    interface CreateSecurityConfigurationOutput {
        var Name: XmlString
        var CreationDateTime: _Date
    }
    interface DeleteSecurityConfigurationInput {
        var Name: XmlString
    }
    interface DeleteSecurityConfigurationOutput
    interface DescribeClusterInput {
        var ClusterId: ClusterId
    }
    interface DescribeClusterOutput {
        var Cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeJobFlowsInput {
        var CreatedAfter: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBefore: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var JobFlowIds: XmlStringList?
            get() = definedExternally
            set(value) = definedExternally
        var JobFlowStates: JobFlowExecutionStateList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeJobFlowsOutput {
        var JobFlows: JobFlowDetailList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSecurityConfigurationInput {
        var Name: XmlString
    }
    interface DescribeSecurityConfigurationOutput {
        var Name: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityConfiguration: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStepInput {
        var ClusterId: ClusterId
        var StepId: StepId
    }
    interface DescribeStepOutput {
        var Step: Step?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EbsBlockDevice {
        var VolumeSpecification: VolumeSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var Device: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EbsBlockDeviceConfig {
        var VolumeSpecification: VolumeSpecification
        var VolumesPerInstance: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EbsConfiguration {
        var EbsBlockDeviceConfigs: EbsBlockDeviceConfigList?
            get() = definedExternally
            set(value) = definedExternally
        var EbsOptimized: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EbsVolume {
        var Device: String?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Ec2InstanceAttributes {
        var Ec2KeyName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Ec2SubnetId: String?
            get() = definedExternally
            set(value) = definedExternally
        var RequestedEc2SubnetIds: XmlStringMaxLen256List?
            get() = definedExternally
            set(value) = definedExternally
        var Ec2AvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var RequestedEc2AvailabilityZones: XmlStringMaxLen256List?
            get() = definedExternally
            set(value) = definedExternally
        var IamInstanceProfile: String?
            get() = definedExternally
            set(value) = definedExternally
        var EmrManagedMasterSecurityGroup: String?
            get() = definedExternally
            set(value) = definedExternally
        var EmrManagedSlaveSecurityGroup: String?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceAccessSecurityGroup: String?
            get() = definedExternally
            set(value) = definedExternally
        var AdditionalMasterSecurityGroups: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var AdditionalSlaveSecurityGroups: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FailureDetails {
        var Reason: String?
            get() = definedExternally
            set(value) = definedExternally
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
        var LogFile: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBlockPublicAccessConfigurationInput
    interface GetBlockPublicAccessConfigurationOutput {
        var BlockPublicAccessConfiguration: BlockPublicAccessConfiguration
        var BlockPublicAccessConfigurationMetadata: BlockPublicAccessConfigurationMetadata
    }
    interface HadoopJarStepConfig {
        var Properties: KeyValueList?
            get() = definedExternally
            set(value) = definedExternally
        var Jar: XmlString
        var MainClass: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var Args: XmlStringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HadoopStepConfig {
        var Jar: String?
            get() = definedExternally
            set(value) = definedExternally
        var Properties: StringMap?
            get() = definedExternally
            set(value) = definedExternally
        var MainClass: String?
            get() = definedExternally
            set(value) = definedExternally
        var Args: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Instance {
        var Id: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var Ec2InstanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var PublicDnsName: String?
            get() = definedExternally
            set(value) = definedExternally
        var PublicIpAddress: String?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateDnsName: String?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateIpAddress: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: InstanceStatus?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceFleetId: InstanceFleetId?
            get() = definedExternally
            set(value) = definedExternally
        var Market: String /* "ON_DEMAND" | "SPOT" | String */
        var InstanceType: InstanceType?
            get() = definedExternally
            set(value) = definedExternally
        var EbsVolumes: EbsVolumeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceFleet {
        var Id: InstanceFleetId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var Status: InstanceFleetStatus?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceFleetType: String /* "MASTER" | "CORE" | "TASK" | String */
        var TargetOnDemandCapacity: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var TargetSpotCapacity: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedOnDemandCapacity: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedSpotCapacity: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceTypeSpecifications: InstanceTypeSpecificationList?
            get() = definedExternally
            set(value) = definedExternally
        var LaunchSpecifications: InstanceFleetProvisioningSpecifications?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceFleetConfig {
        var Name: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceFleetType: String /* "MASTER" | "CORE" | "TASK" | String */
        var TargetOnDemandCapacity: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var TargetSpotCapacity: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceTypeConfigs: InstanceTypeConfigList?
            get() = definedExternally
            set(value) = definedExternally
        var LaunchSpecifications: InstanceFleetProvisioningSpecifications?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceFleetModifyConfig {
        var InstanceFleetId: InstanceFleetId
        var TargetOnDemandCapacity: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var TargetSpotCapacity: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceFleetProvisioningSpecifications {
        var SpotSpecification: SpotProvisioningSpecification
    }
    interface InstanceFleetStateChangeReason {
        var Code: String /* "INTERNAL_ERROR" | "VALIDATION_ERROR" | "INSTANCE_FAILURE" | "CLUSTER_TERMINATED" | String */
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceFleetStatus {
        var State: String /* "PROVISIONING" | "BOOTSTRAPPING" | "RUNNING" | "RESIZING" | "SUSPENDED" | "TERMINATING" | "TERMINATED" | String */
        var StateChangeReason: InstanceFleetStateChangeReason?
            get() = definedExternally
            set(value) = definedExternally
        var Timeline: InstanceFleetTimeline?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceFleetTimeline {
        var CreationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var ReadyDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var EndDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceGroup {
        var Id: InstanceGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Market: String /* "ON_DEMAND" | "SPOT" | String */
        var InstanceGroupType: String /* "MASTER" | "CORE" | "TASK" | String */
        var BidPrice: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: InstanceType?
            get() = definedExternally
            set(value) = definedExternally
        var RequestedInstanceCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var RunningInstanceCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Status: InstanceGroupStatus?
            get() = definedExternally
            set(value) = definedExternally
        var Configurations: ConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationsVersion: Long?
            get() = definedExternally
            set(value) = definedExternally
        var LastSuccessfullyAppliedConfigurations: ConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
        var LastSuccessfullyAppliedConfigurationsVersion: Long?
            get() = definedExternally
            set(value) = definedExternally
        var EbsBlockDevices: EbsBlockDeviceList?
            get() = definedExternally
            set(value) = definedExternally
        var EbsOptimized: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var ShrinkPolicy: ShrinkPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingPolicy: AutoScalingPolicyDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceGroupConfig {
        var Name: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var Market: String /* "ON_DEMAND" | "SPOT" | String */
        var InstanceRole: String /* "MASTER" | "CORE" | "TASK" | String */
        var BidPrice: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: InstanceType
        var InstanceCount: Integer
        var Configurations: ConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
        var EbsConfiguration: EbsConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingPolicy: AutoScalingPolicy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceGroupDetail {
        var InstanceGroupId: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var Name: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var Market: String /* "ON_DEMAND" | "SPOT" | String */
        var InstanceRole: String /* "MASTER" | "CORE" | "TASK" | String */
        var BidPrice: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: InstanceType
        var InstanceRequestCount: Integer
        var InstanceRunningCount: Integer
        var State: String /* "PROVISIONING" | "BOOTSTRAPPING" | "RUNNING" | "RECONFIGURING" | "RESIZING" | "SUSPENDED" | "TERMINATING" | "TERMINATED" | "ARRESTED" | "SHUTTING_DOWN" | "ENDED" | String */
        var LastStateChangeReason: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDateTime: _Date
        var StartDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var ReadyDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var EndDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceGroupModifyConfig {
        var InstanceGroupId: XmlStringMaxLen256
        var InstanceCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var EC2InstanceIdsToTerminate: EC2InstanceIdsToTerminateList?
            get() = definedExternally
            set(value) = definedExternally
        var ShrinkPolicy: ShrinkPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var Configurations: ConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceGroupStateChangeReason {
        var Code: String /* "INTERNAL_ERROR" | "VALIDATION_ERROR" | "INSTANCE_FAILURE" | "CLUSTER_TERMINATED" | String */
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceGroupStatus {
        var State: String /* "PROVISIONING" | "BOOTSTRAPPING" | "RUNNING" | "RECONFIGURING" | "RESIZING" | "SUSPENDED" | "TERMINATING" | "TERMINATED" | "ARRESTED" | "SHUTTING_DOWN" | "ENDED" | String */
        var StateChangeReason: InstanceGroupStateChangeReason?
            get() = definedExternally
            set(value) = definedExternally
        var Timeline: InstanceGroupTimeline?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceGroupTimeline {
        var CreationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var ReadyDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var EndDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceResizePolicy {
        var InstancesToTerminate: EC2InstanceIdsList?
            get() = definedExternally
            set(value) = definedExternally
        var InstancesToProtect: EC2InstanceIdsList?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceTerminationTimeout: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceStateChangeReason {
        var Code: String /* "INTERNAL_ERROR" | "VALIDATION_ERROR" | "INSTANCE_FAILURE" | "BOOTSTRAP_FAILURE" | "CLUSTER_TERMINATED" | String */
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceStatus {
        var State: String /* "AWAITING_FULFILLMENT" | "PROVISIONING" | "BOOTSTRAPPING" | "RUNNING" | "TERMINATED" | String */
        var StateChangeReason: InstanceStateChangeReason?
            get() = definedExternally
            set(value) = definedExternally
        var Timeline: InstanceTimeline?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceTimeline {
        var CreationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var ReadyDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var EndDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceTypeConfig {
        var InstanceType: InstanceType
        var WeightedCapacity: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var BidPrice: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var BidPriceAsPercentageOfOnDemandPrice: NonNegativeDouble?
            get() = definedExternally
            set(value) = definedExternally
        var EbsConfiguration: EbsConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Configurations: ConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceTypeSpecification {
        var InstanceType: InstanceType?
            get() = definedExternally
            set(value) = definedExternally
        var WeightedCapacity: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var BidPrice: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var BidPriceAsPercentageOfOnDemandPrice: NonNegativeDouble?
            get() = definedExternally
            set(value) = definedExternally
        var Configurations: ConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
        var EbsBlockDevices: EbsBlockDeviceList?
            get() = definedExternally
            set(value) = definedExternally
        var EbsOptimized: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobFlowDetail {
        var JobFlowId: XmlStringMaxLen256
        var Name: XmlStringMaxLen256
        var LogUri: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var AmiVersion: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionStatusDetail: JobFlowExecutionStatusDetail
        var Instances: JobFlowInstancesDetail
        var Steps: StepDetailList?
            get() = definedExternally
            set(value) = definedExternally
        var BootstrapActions: BootstrapActionDetailList?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedProducts: SupportedProductsList?
            get() = definedExternally
            set(value) = definedExternally
        var VisibleToAllUsers: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var JobFlowRole: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceRole: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingRole: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var ScaleDownBehavior: String /* "TERMINATE_AT_INSTANCE_HOUR" | "TERMINATE_AT_TASK_COMPLETION" | String */
    }
    interface JobFlowExecutionStatusDetail {
        var State: String /* "STARTING" | "BOOTSTRAPPING" | "RUNNING" | "WAITING" | "SHUTTING_DOWN" | "TERMINATED" | "COMPLETED" | "FAILED" | String */
        var CreationDateTime: _Date
        var StartDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var ReadyDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var EndDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var LastStateChangeReason: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobFlowInstancesConfig {
        var MasterInstanceType: InstanceType?
            get() = definedExternally
            set(value) = definedExternally
        var SlaveInstanceType: InstanceType?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceGroups: InstanceGroupConfigList?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceFleets: InstanceFleetConfigList?
            get() = definedExternally
            set(value) = definedExternally
        var Ec2KeyName: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var Placement: PlacementType?
            get() = definedExternally
            set(value) = definedExternally
        var KeepJobFlowAliveWhenNoSteps: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var TerminationProtected: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var HadoopVersion: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var Ec2SubnetId: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var Ec2SubnetIds: XmlStringMaxLen256List?
            get() = definedExternally
            set(value) = definedExternally
        var EmrManagedMasterSecurityGroup: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var EmrManagedSlaveSecurityGroup: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceAccessSecurityGroup: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var AdditionalMasterSecurityGroups: SecurityGroupsList?
            get() = definedExternally
            set(value) = definedExternally
        var AdditionalSlaveSecurityGroups: SecurityGroupsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobFlowInstancesDetail {
        var MasterInstanceType: InstanceType
        var MasterPublicDnsName: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var MasterInstanceId: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var SlaveInstanceType: InstanceType
        var InstanceCount: Integer
        var InstanceGroups: InstanceGroupDetailList?
            get() = definedExternally
            set(value) = definedExternally
        var NormalizedInstanceHours: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Ec2KeyName: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var Ec2SubnetId: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var Placement: PlacementType?
            get() = definedExternally
            set(value) = definedExternally
        var KeepJobFlowAliveWhenNoSteps: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var TerminationProtected: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var HadoopVersion: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KerberosAttributes {
        var Realm: XmlStringMaxLen256
        var KdcAdminPassword: XmlStringMaxLen256
        var CrossRealmTrustPrincipalPassword: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var ADDomainJoinUser: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var ADDomainJoinPassword: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KeyValue {
        var Key: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var Value: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBootstrapActionsInput {
        var ClusterId: ClusterId
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBootstrapActionsOutput {
        var BootstrapActions: CommandList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListClustersInput {
        var CreatedAfter: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBefore: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterStates: ClusterStateList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListClustersOutput {
        var Clusters: ClusterSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInstanceFleetsInput {
        var ClusterId: ClusterId
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInstanceFleetsOutput {
        var InstanceFleets: InstanceFleetList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInstanceGroupsInput {
        var ClusterId: ClusterId
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInstanceGroupsOutput {
        var InstanceGroups: InstanceGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInstancesInput {
        var ClusterId: ClusterId
        var InstanceGroupId: InstanceGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceGroupTypes: InstanceGroupTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceFleetId: InstanceFleetId?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceFleetType: String /* "MASTER" | "CORE" | "TASK" | String */
        var InstanceStates: InstanceStateList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInstancesOutput {
        var Instances: InstanceList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSecurityConfigurationsInput {
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSecurityConfigurationsOutput {
        var SecurityConfigurations: SecurityConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStepsInput {
        var ClusterId: ClusterId
        var StepStates: StepStateList?
            get() = definedExternally
            set(value) = definedExternally
        var StepIds: XmlStringList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStepsOutput {
        var Steps: StepSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MetricDimension {
        var Key: String?
            get() = definedExternally
            set(value) = definedExternally
        var Value: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyClusterInput {
        var ClusterId: String
        var StepConcurrencyLevel: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyClusterOutput {
        var StepConcurrencyLevel: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyInstanceFleetInput {
        var ClusterId: ClusterId
        var InstanceFleet: InstanceFleetModifyConfig
    }
    interface ModifyInstanceGroupsInput {
        var ClusterId: ClusterId?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceGroups: InstanceGroupModifyConfigList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PlacementType {
        var AvailabilityZone: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZones: XmlStringMaxLen256List?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PortRange {
        var MinRange: Port
        var MaxRange: Port?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutAutoScalingPolicyInput {
        var ClusterId: ClusterId
        var InstanceGroupId: InstanceGroupId
        var AutoScalingPolicy: AutoScalingPolicy
    }
    interface PutAutoScalingPolicyOutput {
        var ClusterId: ClusterId?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceGroupId: InstanceGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingPolicy: AutoScalingPolicyDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterArn: ArnType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutBlockPublicAccessConfigurationInput {
        var BlockPublicAccessConfiguration: BlockPublicAccessConfiguration
    }
    interface PutBlockPublicAccessConfigurationOutput
    interface RemoveAutoScalingPolicyInput {
        var ClusterId: ClusterId
        var InstanceGroupId: InstanceGroupId
    }
    interface RemoveAutoScalingPolicyOutput
    interface RemoveTagsInput {
        var ResourceId: ResourceId
        var TagKeys: StringList
    }
    interface RemoveTagsOutput
    interface RunJobFlowInput {
        var Name: XmlStringMaxLen256
        var LogUri: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var AdditionalInfo: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var AmiVersion: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var ReleaseLabel: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var Instances: JobFlowInstancesConfig
        var Steps: StepConfigList?
            get() = definedExternally
            set(value) = definedExternally
        var BootstrapActions: BootstrapActionConfigList?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedProducts: SupportedProductsList?
            get() = definedExternally
            set(value) = definedExternally
        var NewSupportedProducts: NewSupportedProductsList?
            get() = definedExternally
            set(value) = definedExternally
        var Applications: ApplicationList?
            get() = definedExternally
            set(value) = definedExternally
        var Configurations: ConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
        var VisibleToAllUsers: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var JobFlowRole: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceRole: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityConfiguration: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingRole: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var ScaleDownBehavior: String /* "TERMINATE_AT_INSTANCE_HOUR" | "TERMINATE_AT_TASK_COMPLETION" | String */
        var CustomAmiId: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var EbsRootVolumeSize: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var RepoUpgradeOnBoot: String /* "SECURITY" | "NONE" | String */
        var KerberosAttributes: KerberosAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var StepConcurrencyLevel: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RunJobFlowOutput {
        var JobFlowId: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterArn: ArnType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScalingAction {
        var Market: String /* "ON_DEMAND" | "SPOT" | String */
        var SimpleScalingPolicyConfiguration: SimpleScalingPolicyConfiguration
    }
    interface ScalingConstraints {
        var MinCapacity: Integer
        var MaxCapacity: Integer
    }
    interface ScalingRule {
        var Name: String
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var Action: ScalingAction
        var Trigger: ScalingTrigger
    }
    interface ScalingTrigger {
        var CloudWatchAlarmDefinition: CloudWatchAlarmDefinition
    }
    interface ScriptBootstrapActionConfig {
        var Path: XmlString
        var Args: XmlStringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SecurityConfigurationSummary {
        var Name: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetTerminationProtectionInput {
        var JobFlowIds: XmlStringList
        var TerminationProtected: Boolean
    }
    interface SetVisibleToAllUsersInput {
        var JobFlowIds: XmlStringList
        var VisibleToAllUsers: Boolean
    }
    interface ShrinkPolicy {
        var DecommissionTimeout: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceResizePolicy: InstanceResizePolicy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SimpleScalingPolicyConfiguration {
        var AdjustmentType: String /* "CHANGE_IN_CAPACITY" | "PERCENT_CHANGE_IN_CAPACITY" | "EXACT_CAPACITY" | String */
        var ScalingAdjustment: Integer
        var CoolDown: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SpotProvisioningSpecification {
        var TimeoutDurationMinutes: WholeNumber
        var TimeoutAction: String /* "SWITCH_TO_ON_DEMAND" | "TERMINATE_CLUSTER" | String */
        var BlockDurationMinutes: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Step {
        var Id: StepId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Config: HadoopStepConfig?
            get() = definedExternally
            set(value) = definedExternally
        var ActionOnFailure: String /* "TERMINATE_JOB_FLOW" | "TERMINATE_CLUSTER" | "CANCEL_AND_WAIT" | "CONTINUE" | String */
        var Status: StepStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StepConfig {
        var Name: XmlStringMaxLen256
        var ActionOnFailure: String /* "TERMINATE_JOB_FLOW" | "TERMINATE_CLUSTER" | "CANCEL_AND_WAIT" | "CONTINUE" | String */
        var HadoopJarStep: HadoopJarStepConfig
    }
    interface StepDetail {
        var StepConfig: StepConfig
        var ExecutionStatusDetail: StepExecutionStatusDetail
    }
    interface StepExecutionStatusDetail {
        var State: String /* "PENDING" | "RUNNING" | "CONTINUE" | "COMPLETED" | "CANCELLED" | "FAILED" | "INTERRUPTED" | String */
        var CreationDateTime: _Date
        var StartDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var EndDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var LastStateChangeReason: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StepStateChangeReason {
        var Code: String /* "NONE" | String */
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StepStatus {
        var State: String /* "PENDING" | "CANCEL_PENDING" | "RUNNING" | "COMPLETED" | "CANCELLED" | "FAILED" | "INTERRUPTED" | String */
        var StateChangeReason: StepStateChangeReason?
            get() = definedExternally
            set(value) = definedExternally
        var FailureDetails: FailureDetails?
            get() = definedExternally
            set(value) = definedExternally
        var Timeline: StepTimeline?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StepSummary {
        var Id: StepId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Config: HadoopStepConfig?
            get() = definedExternally
            set(value) = definedExternally
        var ActionOnFailure: String /* "TERMINATE_JOB_FLOW" | "TERMINATE_CLUSTER" | "CANCEL_AND_WAIT" | "CONTINUE" | String */
        var Status: StepStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StepTimeline {
        var CreationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var StartDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var EndDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StringMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface SupportedProductConfig {
        var Name: XmlStringMaxLen256?
            get() = definedExternally
            set(value) = definedExternally
        var Args: XmlStringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: String?
            get() = definedExternally
            set(value) = definedExternally
        var Value: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TerminateJobFlowsInput {
        var JobFlowIds: XmlStringList
    }
    interface VolumeSpecification {
        var VolumeType: String
        var Iops: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var SizeInGB: Integer
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2009-03-31" | "latest" | String */
    }
}