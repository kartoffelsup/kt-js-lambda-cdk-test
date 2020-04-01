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
import ApplicationAutoScaling.Alarm
import ApplicationAutoScaling.MetricDimension
import ApplicationAutoScaling.ScalableTarget
import ApplicationAutoScaling.ScalingActivity
import ApplicationAutoScaling.ScalingPolicy
import ApplicationAutoScaling.ScheduledAction
import ApplicationAutoScaling.StepAdjustment
import ApplicationAutoScaling.DeleteScalingPolicyRequest
import ApplicationAutoScaling.DeleteScalingPolicyResponse
import ApplicationAutoScaling.DeleteScheduledActionRequest
import ApplicationAutoScaling.DeleteScheduledActionResponse
import ApplicationAutoScaling.DeregisterScalableTargetRequest
import ApplicationAutoScaling.DeregisterScalableTargetResponse
import ApplicationAutoScaling.DescribeScalableTargetsRequest
import ApplicationAutoScaling.DescribeScalableTargetsResponse
import ApplicationAutoScaling.DescribeScalingActivitiesRequest
import ApplicationAutoScaling.DescribeScalingActivitiesResponse
import ApplicationAutoScaling.DescribeScalingPoliciesRequest
import ApplicationAutoScaling.DescribeScalingPoliciesResponse
import ApplicationAutoScaling.DescribeScheduledActionsRequest
import ApplicationAutoScaling.DescribeScheduledActionsResponse
import ApplicationAutoScaling.PutScalingPolicyRequest
import ApplicationAutoScaling.PutScalingPolicyResponse
import ApplicationAutoScaling.PutScheduledActionRequest
import ApplicationAutoScaling.PutScheduledActionResponse
import ApplicationAutoScaling.RegisterScalableTargetRequest
import ApplicationAutoScaling.RegisterScalableTargetResponse
import ApplicationAutoScaling.StepScalingPolicyConfiguration
import ApplicationAutoScaling.TargetTrackingScalingPolicyConfiguration
import ApplicationAutoScaling.ScalableTargetAction
import ApplicationAutoScaling.SuspendedState
import ApplicationAutoScaling.PredefinedMetricSpecification
import ApplicationAutoScaling.CustomizedMetricSpecification

typealias Alarms = Array<Alarm>

typealias Cooldown = Number

typealias DisableScaleIn = Boolean

typealias MaxResults = Number

typealias MetricDimensionName = String

typealias MetricDimensionValue = String

typealias MetricDimensions = Array<MetricDimension>

typealias MetricName = String

typealias MetricNamespace = String

typealias MetricScale = Number

typealias MetricUnit = String

typealias MinAdjustmentMagnitude = Number

typealias PolicyName = String

typealias ResourceCapacity = Number

typealias ResourceId = String

typealias ResourceIdMaxLen1600 = String

typealias ResourceIdsMaxLen1600 = Array<ResourceIdMaxLen1600>

typealias ResourceLabel = String

typealias ScalableTargets = Array<ScalableTarget>

typealias ScalingActivities = Array<ScalingActivity>

typealias ScalingAdjustment = Number

typealias ScalingPolicies = Array<ScalingPolicy>

typealias ScalingSuspended = Boolean

typealias ScheduledActionName = String

typealias ScheduledActions = Array<ScheduledAction>

typealias StepAdjustments = Array<StepAdjustment>

typealias TimestampType = Date

typealias XmlString = String

@JsModule("aws-sdk")
external open class ApplicationAutoScaling(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ApplicationAutoScaling.Types.ClientConfiguration */
    open fun deleteScalingPolicy(params: DeleteScalingPolicyRequest, callback: (err: AWSError, data: DeleteScalingPolicyResponse) -> Unit = definedExternally): Request<DeleteScalingPolicyResponse, AWSError>
    open fun deleteScalingPolicy(callback: (err: AWSError, data: DeleteScalingPolicyResponse) -> Unit = definedExternally): Request<DeleteScalingPolicyResponse, AWSError>
    open fun deleteScheduledAction(params: DeleteScheduledActionRequest, callback: (err: AWSError, data: DeleteScheduledActionResponse) -> Unit = definedExternally): Request<DeleteScheduledActionResponse, AWSError>
    open fun deleteScheduledAction(callback: (err: AWSError, data: DeleteScheduledActionResponse) -> Unit = definedExternally): Request<DeleteScheduledActionResponse, AWSError>
    open fun deregisterScalableTarget(params: DeregisterScalableTargetRequest, callback: (err: AWSError, data: DeregisterScalableTargetResponse) -> Unit = definedExternally): Request<DeregisterScalableTargetResponse, AWSError>
    open fun deregisterScalableTarget(callback: (err: AWSError, data: DeregisterScalableTargetResponse) -> Unit = definedExternally): Request<DeregisterScalableTargetResponse, AWSError>
    open fun describeScalableTargets(params: DescribeScalableTargetsRequest, callback: (err: AWSError, data: DescribeScalableTargetsResponse) -> Unit = definedExternally): Request<DescribeScalableTargetsResponse, AWSError>
    open fun describeScalableTargets(callback: (err: AWSError, data: DescribeScalableTargetsResponse) -> Unit = definedExternally): Request<DescribeScalableTargetsResponse, AWSError>
    open fun describeScalingActivities(params: DescribeScalingActivitiesRequest, callback: (err: AWSError, data: DescribeScalingActivitiesResponse) -> Unit = definedExternally): Request<DescribeScalingActivitiesResponse, AWSError>
    open fun describeScalingActivities(callback: (err: AWSError, data: DescribeScalingActivitiesResponse) -> Unit = definedExternally): Request<DescribeScalingActivitiesResponse, AWSError>
    open fun describeScalingPolicies(params: DescribeScalingPoliciesRequest, callback: (err: AWSError, data: DescribeScalingPoliciesResponse) -> Unit = definedExternally): Request<DescribeScalingPoliciesResponse, AWSError>
    open fun describeScalingPolicies(callback: (err: AWSError, data: DescribeScalingPoliciesResponse) -> Unit = definedExternally): Request<DescribeScalingPoliciesResponse, AWSError>
    open fun describeScheduledActions(params: DescribeScheduledActionsRequest, callback: (err: AWSError, data: DescribeScheduledActionsResponse) -> Unit = definedExternally): Request<DescribeScheduledActionsResponse, AWSError>
    open fun describeScheduledActions(callback: (err: AWSError, data: DescribeScheduledActionsResponse) -> Unit = definedExternally): Request<DescribeScheduledActionsResponse, AWSError>
    open fun putScalingPolicy(params: PutScalingPolicyRequest, callback: (err: AWSError, data: PutScalingPolicyResponse) -> Unit = definedExternally): Request<PutScalingPolicyResponse, AWSError>
    open fun putScalingPolicy(callback: (err: AWSError, data: PutScalingPolicyResponse) -> Unit = definedExternally): Request<PutScalingPolicyResponse, AWSError>
    open fun putScheduledAction(params: PutScheduledActionRequest, callback: (err: AWSError, data: PutScheduledActionResponse) -> Unit = definedExternally): Request<PutScheduledActionResponse, AWSError>
    open fun putScheduledAction(callback: (err: AWSError, data: PutScheduledActionResponse) -> Unit = definedExternally): Request<PutScheduledActionResponse, AWSError>
    open fun registerScalableTarget(params: RegisterScalableTargetRequest, callback: (err: AWSError, data: RegisterScalableTargetResponse) -> Unit = definedExternally): Request<RegisterScalableTargetResponse, AWSError>
    open fun registerScalableTarget(callback: (err: AWSError, data: RegisterScalableTargetResponse) -> Unit = definedExternally): Request<RegisterScalableTargetResponse, AWSError>
    interface Alarm {
        var AlarmName: ResourceId
        var AlarmARN: ResourceId
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
    interface DeleteScalingPolicyRequest {
        var PolicyName: ResourceIdMaxLen1600
        var ServiceNamespace: String /* "ecs" | "elasticmapreduce" | "ec2" | "appstream" | "dynamodb" | "rds" | "sagemaker" | "custom-resource" | "comprehend" | "lambda" | String */
        var ResourceId: ResourceIdMaxLen1600
        var ScalableDimension: String /* "ecs:service:DesiredCount" | "ec2:spot-fleet-request:TargetCapacity" | "elasticmapreduce:instancegroup:InstanceCount" | "appstream:fleet:DesiredCapacity" | "dynamodb:table:ReadCapacityUnits" | "dynamodb:table:WriteCapacityUnits" | "dynamodb:index:ReadCapacityUnits" | "dynamodb:index:WriteCapacityUnits" | "rds:cluster:ReadReplicaCount" | "sagemaker:variant:DesiredInstanceCount" | "custom-resource:ResourceType:Property" | "comprehend:document-classifier-endpoint:DesiredInferenceUnits" | "lambda:function:ProvisionedConcurrency" | String */
    }
    interface DeleteScalingPolicyResponse
    interface DeleteScheduledActionRequest {
        var ServiceNamespace: String /* "ecs" | "elasticmapreduce" | "ec2" | "appstream" | "dynamodb" | "rds" | "sagemaker" | "custom-resource" | "comprehend" | "lambda" | String */
        var ScheduledActionName: ResourceIdMaxLen1600
        var ResourceId: ResourceIdMaxLen1600
        var ScalableDimension: String /* "ecs:service:DesiredCount" | "ec2:spot-fleet-request:TargetCapacity" | "elasticmapreduce:instancegroup:InstanceCount" | "appstream:fleet:DesiredCapacity" | "dynamodb:table:ReadCapacityUnits" | "dynamodb:table:WriteCapacityUnits" | "dynamodb:index:ReadCapacityUnits" | "dynamodb:index:WriteCapacityUnits" | "rds:cluster:ReadReplicaCount" | "sagemaker:variant:DesiredInstanceCount" | "custom-resource:ResourceType:Property" | "comprehend:document-classifier-endpoint:DesiredInferenceUnits" | "lambda:function:ProvisionedConcurrency" | String */
    }
    interface DeleteScheduledActionResponse
    interface DeregisterScalableTargetRequest {
        var ServiceNamespace: String /* "ecs" | "elasticmapreduce" | "ec2" | "appstream" | "dynamodb" | "rds" | "sagemaker" | "custom-resource" | "comprehend" | "lambda" | String */
        var ResourceId: ResourceIdMaxLen1600
        var ScalableDimension: String /* "ecs:service:DesiredCount" | "ec2:spot-fleet-request:TargetCapacity" | "elasticmapreduce:instancegroup:InstanceCount" | "appstream:fleet:DesiredCapacity" | "dynamodb:table:ReadCapacityUnits" | "dynamodb:table:WriteCapacityUnits" | "dynamodb:index:ReadCapacityUnits" | "dynamodb:index:WriteCapacityUnits" | "rds:cluster:ReadReplicaCount" | "sagemaker:variant:DesiredInstanceCount" | "custom-resource:ResourceType:Property" | "comprehend:document-classifier-endpoint:DesiredInferenceUnits" | "lambda:function:ProvisionedConcurrency" | String */
    }
    interface DeregisterScalableTargetResponse
    interface DescribeScalableTargetsRequest {
        var ServiceNamespace: String /* "ecs" | "elasticmapreduce" | "ec2" | "appstream" | "dynamodb" | "rds" | "sagemaker" | "custom-resource" | "comprehend" | "lambda" | String */
        var ResourceIds: ResourceIdsMaxLen1600?
            get() = definedExternally
            set(value) = definedExternally
        var ScalableDimension: String /* "ecs:service:DesiredCount" | "ec2:spot-fleet-request:TargetCapacity" | "elasticmapreduce:instancegroup:InstanceCount" | "appstream:fleet:DesiredCapacity" | "dynamodb:table:ReadCapacityUnits" | "dynamodb:table:WriteCapacityUnits" | "dynamodb:index:ReadCapacityUnits" | "dynamodb:index:WriteCapacityUnits" | "rds:cluster:ReadReplicaCount" | "sagemaker:variant:DesiredInstanceCount" | "custom-resource:ResourceType:Property" | "comprehend:document-classifier-endpoint:DesiredInferenceUnits" | "lambda:function:ProvisionedConcurrency" | String */
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeScalableTargetsResponse {
        var ScalableTargets: ScalableTargets?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeScalingActivitiesRequest {
        var ServiceNamespace: String /* "ecs" | "elasticmapreduce" | "ec2" | "appstream" | "dynamodb" | "rds" | "sagemaker" | "custom-resource" | "comprehend" | "lambda" | String */
        var ResourceId: ResourceIdMaxLen1600?
            get() = definedExternally
            set(value) = definedExternally
        var ScalableDimension: String /* "ecs:service:DesiredCount" | "ec2:spot-fleet-request:TargetCapacity" | "elasticmapreduce:instancegroup:InstanceCount" | "appstream:fleet:DesiredCapacity" | "dynamodb:table:ReadCapacityUnits" | "dynamodb:table:WriteCapacityUnits" | "dynamodb:index:ReadCapacityUnits" | "dynamodb:index:WriteCapacityUnits" | "rds:cluster:ReadReplicaCount" | "sagemaker:variant:DesiredInstanceCount" | "custom-resource:ResourceType:Property" | "comprehend:document-classifier-endpoint:DesiredInferenceUnits" | "lambda:function:ProvisionedConcurrency" | String */
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeScalingActivitiesResponse {
        var ScalingActivities: ScalingActivities?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeScalingPoliciesRequest {
        var PolicyNames: ResourceIdsMaxLen1600?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceNamespace: String /* "ecs" | "elasticmapreduce" | "ec2" | "appstream" | "dynamodb" | "rds" | "sagemaker" | "custom-resource" | "comprehend" | "lambda" | String */
        var ResourceId: ResourceIdMaxLen1600?
            get() = definedExternally
            set(value) = definedExternally
        var ScalableDimension: String /* "ecs:service:DesiredCount" | "ec2:spot-fleet-request:TargetCapacity" | "elasticmapreduce:instancegroup:InstanceCount" | "appstream:fleet:DesiredCapacity" | "dynamodb:table:ReadCapacityUnits" | "dynamodb:table:WriteCapacityUnits" | "dynamodb:index:ReadCapacityUnits" | "dynamodb:index:WriteCapacityUnits" | "rds:cluster:ReadReplicaCount" | "sagemaker:variant:DesiredInstanceCount" | "custom-resource:ResourceType:Property" | "comprehend:document-classifier-endpoint:DesiredInferenceUnits" | "lambda:function:ProvisionedConcurrency" | String */
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeScalingPoliciesResponse {
        var ScalingPolicies: ScalingPolicies?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeScheduledActionsRequest {
        var ScheduledActionNames: ResourceIdsMaxLen1600?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceNamespace: String /* "ecs" | "elasticmapreduce" | "ec2" | "appstream" | "dynamodb" | "rds" | "sagemaker" | "custom-resource" | "comprehend" | "lambda" | String */
        var ResourceId: ResourceIdMaxLen1600?
            get() = definedExternally
            set(value) = definedExternally
        var ScalableDimension: String /* "ecs:service:DesiredCount" | "ec2:spot-fleet-request:TargetCapacity" | "elasticmapreduce:instancegroup:InstanceCount" | "appstream:fleet:DesiredCapacity" | "dynamodb:table:ReadCapacityUnits" | "dynamodb:table:WriteCapacityUnits" | "dynamodb:index:ReadCapacityUnits" | "dynamodb:index:WriteCapacityUnits" | "rds:cluster:ReadReplicaCount" | "sagemaker:variant:DesiredInstanceCount" | "custom-resource:ResourceType:Property" | "comprehend:document-classifier-endpoint:DesiredInferenceUnits" | "lambda:function:ProvisionedConcurrency" | String */
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeScheduledActionsResponse {
        var ScheduledActions: ScheduledActions?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MetricDimension {
        var Name: MetricDimensionName
        var Value: MetricDimensionValue
    }
    interface PredefinedMetricSpecification {
        var PredefinedMetricType: String /* "DynamoDBReadCapacityUtilization" | "DynamoDBWriteCapacityUtilization" | "ALBRequestCountPerTarget" | "RDSReaderAverageCPUUtilization" | "RDSReaderAverageDatabaseConnections" | "EC2SpotFleetRequestAverageCPUUtilization" | "EC2SpotFleetRequestAverageNetworkIn" | "EC2SpotFleetRequestAverageNetworkOut" | "SageMakerVariantInvocationsPerInstance" | "ECSServiceAverageCPUUtilization" | "ECSServiceAverageMemoryUtilization" | "AppStreamAverageCapacityUtilization" | "ComprehendInferenceUtilization" | "LambdaProvisionedConcurrencyUtilization" | String */
        var ResourceLabel: ResourceLabel?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutScalingPolicyRequest {
        var PolicyName: PolicyName
        var ServiceNamespace: String /* "ecs" | "elasticmapreduce" | "ec2" | "appstream" | "dynamodb" | "rds" | "sagemaker" | "custom-resource" | "comprehend" | "lambda" | String */
        var ResourceId: ResourceIdMaxLen1600
        var ScalableDimension: String /* "ecs:service:DesiredCount" | "ec2:spot-fleet-request:TargetCapacity" | "elasticmapreduce:instancegroup:InstanceCount" | "appstream:fleet:DesiredCapacity" | "dynamodb:table:ReadCapacityUnits" | "dynamodb:table:WriteCapacityUnits" | "dynamodb:index:ReadCapacityUnits" | "dynamodb:index:WriteCapacityUnits" | "rds:cluster:ReadReplicaCount" | "sagemaker:variant:DesiredInstanceCount" | "custom-resource:ResourceType:Property" | "comprehend:document-classifier-endpoint:DesiredInferenceUnits" | "lambda:function:ProvisionedConcurrency" | String */
        var PolicyType: String /* "StepScaling" | "TargetTrackingScaling" | String */
        var StepScalingPolicyConfiguration: StepScalingPolicyConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var TargetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutScalingPolicyResponse {
        var PolicyARN: ResourceIdMaxLen1600
        var Alarms: Alarms?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutScheduledActionRequest {
        var ServiceNamespace: String /* "ecs" | "elasticmapreduce" | "ec2" | "appstream" | "dynamodb" | "rds" | "sagemaker" | "custom-resource" | "comprehend" | "lambda" | String */
        var Schedule: ResourceIdMaxLen1600?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduledActionName: ScheduledActionName
        var ResourceId: ResourceIdMaxLen1600
        var ScalableDimension: String /* "ecs:service:DesiredCount" | "ec2:spot-fleet-request:TargetCapacity" | "elasticmapreduce:instancegroup:InstanceCount" | "appstream:fleet:DesiredCapacity" | "dynamodb:table:ReadCapacityUnits" | "dynamodb:table:WriteCapacityUnits" | "dynamodb:index:ReadCapacityUnits" | "dynamodb:index:WriteCapacityUnits" | "rds:cluster:ReadReplicaCount" | "sagemaker:variant:DesiredInstanceCount" | "custom-resource:ResourceType:Property" | "comprehend:document-classifier-endpoint:DesiredInferenceUnits" | "lambda:function:ProvisionedConcurrency" | String */
        var StartTime: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var ScalableTargetAction: ScalableTargetAction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutScheduledActionResponse
    interface RegisterScalableTargetRequest {
        var ServiceNamespace: String /* "ecs" | "elasticmapreduce" | "ec2" | "appstream" | "dynamodb" | "rds" | "sagemaker" | "custom-resource" | "comprehend" | "lambda" | String */
        var ResourceId: ResourceIdMaxLen1600
        var ScalableDimension: String /* "ecs:service:DesiredCount" | "ec2:spot-fleet-request:TargetCapacity" | "elasticmapreduce:instancegroup:InstanceCount" | "appstream:fleet:DesiredCapacity" | "dynamodb:table:ReadCapacityUnits" | "dynamodb:table:WriteCapacityUnits" | "dynamodb:index:ReadCapacityUnits" | "dynamodb:index:WriteCapacityUnits" | "rds:cluster:ReadReplicaCount" | "sagemaker:variant:DesiredInstanceCount" | "custom-resource:ResourceType:Property" | "comprehend:document-classifier-endpoint:DesiredInferenceUnits" | "lambda:function:ProvisionedConcurrency" | String */
        var MinCapacity: ResourceCapacity?
            get() = definedExternally
            set(value) = definedExternally
        var MaxCapacity: ResourceCapacity?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: ResourceIdMaxLen1600?
            get() = definedExternally
            set(value) = definedExternally
        var SuspendedState: SuspendedState?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterScalableTargetResponse
    interface ScalableTarget {
        var ServiceNamespace: String /* "ecs" | "elasticmapreduce" | "ec2" | "appstream" | "dynamodb" | "rds" | "sagemaker" | "custom-resource" | "comprehend" | "lambda" | String */
        var ResourceId: ResourceIdMaxLen1600
        var ScalableDimension: String /* "ecs:service:DesiredCount" | "ec2:spot-fleet-request:TargetCapacity" | "elasticmapreduce:instancegroup:InstanceCount" | "appstream:fleet:DesiredCapacity" | "dynamodb:table:ReadCapacityUnits" | "dynamodb:table:WriteCapacityUnits" | "dynamodb:index:ReadCapacityUnits" | "dynamodb:index:WriteCapacityUnits" | "rds:cluster:ReadReplicaCount" | "sagemaker:variant:DesiredInstanceCount" | "custom-resource:ResourceType:Property" | "comprehend:document-classifier-endpoint:DesiredInferenceUnits" | "lambda:function:ProvisionedConcurrency" | String */
        var MinCapacity: ResourceCapacity
        var MaxCapacity: ResourceCapacity
        var RoleARN: ResourceIdMaxLen1600
        var CreationTime: TimestampType
        var SuspendedState: SuspendedState?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScalableTargetAction {
        var MinCapacity: ResourceCapacity?
            get() = definedExternally
            set(value) = definedExternally
        var MaxCapacity: ResourceCapacity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScalingActivity {
        var ActivityId: ResourceId
        var ServiceNamespace: String /* "ecs" | "elasticmapreduce" | "ec2" | "appstream" | "dynamodb" | "rds" | "sagemaker" | "custom-resource" | "comprehend" | "lambda" | String */
        var ResourceId: ResourceIdMaxLen1600
        var ScalableDimension: String /* "ecs:service:DesiredCount" | "ec2:spot-fleet-request:TargetCapacity" | "elasticmapreduce:instancegroup:InstanceCount" | "appstream:fleet:DesiredCapacity" | "dynamodb:table:ReadCapacityUnits" | "dynamodb:table:WriteCapacityUnits" | "dynamodb:index:ReadCapacityUnits" | "dynamodb:index:WriteCapacityUnits" | "rds:cluster:ReadReplicaCount" | "sagemaker:variant:DesiredInstanceCount" | "custom-resource:ResourceType:Property" | "comprehend:document-classifier-endpoint:DesiredInferenceUnits" | "lambda:function:ProvisionedConcurrency" | String */
        var Description: XmlString
        var Cause: XmlString
        var StartTime: TimestampType
        var EndTime: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var StatusCode: String /* "Pending" | "InProgress" | "Successful" | "Overridden" | "Unfulfilled" | "Failed" | String */
        var StatusMessage: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var Details: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScalingPolicy {
        var PolicyARN: ResourceIdMaxLen1600
        var PolicyName: PolicyName
        var ServiceNamespace: String /* "ecs" | "elasticmapreduce" | "ec2" | "appstream" | "dynamodb" | "rds" | "sagemaker" | "custom-resource" | "comprehend" | "lambda" | String */
        var ResourceId: ResourceIdMaxLen1600
        var ScalableDimension: String /* "ecs:service:DesiredCount" | "ec2:spot-fleet-request:TargetCapacity" | "elasticmapreduce:instancegroup:InstanceCount" | "appstream:fleet:DesiredCapacity" | "dynamodb:table:ReadCapacityUnits" | "dynamodb:table:WriteCapacityUnits" | "dynamodb:index:ReadCapacityUnits" | "dynamodb:index:WriteCapacityUnits" | "rds:cluster:ReadReplicaCount" | "sagemaker:variant:DesiredInstanceCount" | "custom-resource:ResourceType:Property" | "comprehend:document-classifier-endpoint:DesiredInferenceUnits" | "lambda:function:ProvisionedConcurrency" | String */
        var PolicyType: String /* "StepScaling" | "TargetTrackingScaling" | String */
        var StepScalingPolicyConfiguration: StepScalingPolicyConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var TargetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Alarms: Alarms?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: TimestampType
    }
    interface ScheduledAction {
        var ScheduledActionName: ScheduledActionName
        var ScheduledActionARN: ResourceIdMaxLen1600
        var ServiceNamespace: String /* "ecs" | "elasticmapreduce" | "ec2" | "appstream" | "dynamodb" | "rds" | "sagemaker" | "custom-resource" | "comprehend" | "lambda" | String */
        var Schedule: ResourceIdMaxLen1600
        var ResourceId: ResourceIdMaxLen1600
        var ScalableDimension: String /* "ecs:service:DesiredCount" | "ec2:spot-fleet-request:TargetCapacity" | "elasticmapreduce:instancegroup:InstanceCount" | "appstream:fleet:DesiredCapacity" | "dynamodb:table:ReadCapacityUnits" | "dynamodb:table:WriteCapacityUnits" | "dynamodb:index:ReadCapacityUnits" | "dynamodb:index:WriteCapacityUnits" | "rds:cluster:ReadReplicaCount" | "sagemaker:variant:DesiredInstanceCount" | "custom-resource:ResourceType:Property" | "comprehend:document-classifier-endpoint:DesiredInferenceUnits" | "lambda:function:ProvisionedConcurrency" | String */
        var StartTime: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var ScalableTargetAction: ScalableTargetAction?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: TimestampType
    }
    interface StepAdjustment {
        var MetricIntervalLowerBound: MetricScale?
            get() = definedExternally
            set(value) = definedExternally
        var MetricIntervalUpperBound: MetricScale?
            get() = definedExternally
            set(value) = definedExternally
        var ScalingAdjustment: ScalingAdjustment
    }
    interface StepScalingPolicyConfiguration {
        var AdjustmentType: String /* "ChangeInCapacity" | "PercentChangeInCapacity" | "ExactCapacity" | String */
        var StepAdjustments: StepAdjustments?
            get() = definedExternally
            set(value) = definedExternally
        var MinAdjustmentMagnitude: MinAdjustmentMagnitude?
            get() = definedExternally
            set(value) = definedExternally
        var Cooldown: Cooldown?
            get() = definedExternally
            set(value) = definedExternally
        var MetricAggregationType: String /* "Average" | "Minimum" | "Maximum" | String */
    }
    interface SuspendedState {
        var DynamicScalingInSuspended: ScalingSuspended?
            get() = definedExternally
            set(value) = definedExternally
        var DynamicScalingOutSuspended: ScalingSuspended?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduledScalingSuspended: ScalingSuspended?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TargetTrackingScalingPolicyConfiguration {
        var TargetValue: MetricScale
        var PredefinedMetricSpecification: PredefinedMetricSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var CustomizedMetricSpecification: CustomizedMetricSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var ScaleOutCooldown: Cooldown?
            get() = definedExternally
            set(value) = definedExternally
        var ScaleInCooldown: Cooldown?
            get() = definedExternally
            set(value) = definedExternally
        var DisableScaleIn: DisableScaleIn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2016-02-06" | "latest" | String */
    }
}