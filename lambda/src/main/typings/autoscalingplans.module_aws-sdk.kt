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
import AutoScalingPlans.ApplicationSource
import AutoScalingPlans.Datapoint
import AutoScalingPlans.MetricDimension
import AutoScalingPlans.ScalingInstruction
import AutoScalingPlans.ScalingPlanResource
import AutoScalingPlans.ScalingPlan
import AutoScalingPlans.ScalingPolicy
import AutoScalingPlans.TagFilter
import AutoScalingPlans.TargetTrackingConfiguration
import AutoScalingPlans.CreateScalingPlanRequest
import AutoScalingPlans.CreateScalingPlanResponse
import AutoScalingPlans.DeleteScalingPlanRequest
import AutoScalingPlans.DeleteScalingPlanResponse
import AutoScalingPlans.DescribeScalingPlanResourcesRequest
import AutoScalingPlans.DescribeScalingPlanResourcesResponse
import AutoScalingPlans.DescribeScalingPlansRequest
import AutoScalingPlans.DescribeScalingPlansResponse
import AutoScalingPlans.GetScalingPlanResourceForecastDataRequest
import AutoScalingPlans.GetScalingPlanResourceForecastDataResponse
import AutoScalingPlans.UpdateScalingPlanRequest
import AutoScalingPlans.UpdateScalingPlanResponse
import AutoScalingPlans.PredefinedLoadMetricSpecification
import AutoScalingPlans.CustomizedLoadMetricSpecification
import AutoScalingPlans.PredefinedScalingMetricSpecification
import AutoScalingPlans.CustomizedScalingMetricSpecification

typealias ApplicationSources = Array<ApplicationSource>

typealias Cooldown = Number

typealias Datapoints = Array<Datapoint>

typealias DisableDynamicScaling = Boolean

typealias DisableScaleIn = Boolean

typealias MaxResults = Number

typealias MetricDimensionName = String

typealias MetricDimensionValue = String

typealias MetricDimensions = Array<MetricDimension>

typealias MetricName = String

typealias MetricNamespace = String

typealias MetricScale = Number

typealias MetricUnit = String

typealias NextToken = String

typealias PolicyName = String

typealias ResourceCapacity = Number

typealias ResourceIdMaxLen1600 = String

typealias ResourceLabel = String

typealias ScalingInstructions = Array<ScalingInstruction>

typealias ScalingPlanName = String

typealias ScalingPlanNames = Array<ScalingPlanName>

typealias ScalingPlanResources = Array<ScalingPlanResource>

typealias ScalingPlanVersion = Number

typealias ScalingPlans = Array<ScalingPlan>

typealias ScalingPolicies = Array<ScalingPolicy>

typealias ScheduledActionBufferTime = Number

typealias TagFilters = Array<TagFilter>

typealias TagValues = Array<XmlStringMaxLen256>

typealias TargetTrackingConfigurations = Array<TargetTrackingConfiguration>

typealias TimestampType = Date

typealias XmlString = String

typealias XmlStringMaxLen128 = String

typealias XmlStringMaxLen256 = String

@JsModule("aws-sdk")
external open class AutoScalingPlans(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & AutoScalingPlans.Types.ClientConfiguration */
    open fun createScalingPlan(params: CreateScalingPlanRequest, callback: (err: AWSError, data: CreateScalingPlanResponse) -> Unit = definedExternally): Request<CreateScalingPlanResponse, AWSError>
    open fun createScalingPlan(callback: (err: AWSError, data: CreateScalingPlanResponse) -> Unit = definedExternally): Request<CreateScalingPlanResponse, AWSError>
    open fun deleteScalingPlan(params: DeleteScalingPlanRequest, callback: (err: AWSError, data: DeleteScalingPlanResponse) -> Unit = definedExternally): Request<DeleteScalingPlanResponse, AWSError>
    open fun deleteScalingPlan(callback: (err: AWSError, data: DeleteScalingPlanResponse) -> Unit = definedExternally): Request<DeleteScalingPlanResponse, AWSError>
    open fun describeScalingPlanResources(params: DescribeScalingPlanResourcesRequest, callback: (err: AWSError, data: DescribeScalingPlanResourcesResponse) -> Unit = definedExternally): Request<DescribeScalingPlanResourcesResponse, AWSError>
    open fun describeScalingPlanResources(callback: (err: AWSError, data: DescribeScalingPlanResourcesResponse) -> Unit = definedExternally): Request<DescribeScalingPlanResourcesResponse, AWSError>
    open fun describeScalingPlans(params: DescribeScalingPlansRequest, callback: (err: AWSError, data: DescribeScalingPlansResponse) -> Unit = definedExternally): Request<DescribeScalingPlansResponse, AWSError>
    open fun describeScalingPlans(callback: (err: AWSError, data: DescribeScalingPlansResponse) -> Unit = definedExternally): Request<DescribeScalingPlansResponse, AWSError>
    open fun getScalingPlanResourceForecastData(params: GetScalingPlanResourceForecastDataRequest, callback: (err: AWSError, data: GetScalingPlanResourceForecastDataResponse) -> Unit = definedExternally): Request<GetScalingPlanResourceForecastDataResponse, AWSError>
    open fun getScalingPlanResourceForecastData(callback: (err: AWSError, data: GetScalingPlanResourceForecastDataResponse) -> Unit = definedExternally): Request<GetScalingPlanResourceForecastDataResponse, AWSError>
    open fun updateScalingPlan(params: UpdateScalingPlanRequest, callback: (err: AWSError, data: UpdateScalingPlanResponse) -> Unit = definedExternally): Request<UpdateScalingPlanResponse, AWSError>
    open fun updateScalingPlan(callback: (err: AWSError, data: UpdateScalingPlanResponse) -> Unit = definedExternally): Request<UpdateScalingPlanResponse, AWSError>
    interface ApplicationSource {
        var CloudFormationStackARN: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var TagFilters: TagFilters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateScalingPlanRequest {
        var ScalingPlanName: ScalingPlanName
        var ApplicationSource: ApplicationSource
        var ScalingInstructions: ScalingInstructions
    }
    interface CreateScalingPlanResponse {
        var ScalingPlanVersion: ScalingPlanVersion
    }
    interface CustomizedLoadMetricSpecification {
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
    interface CustomizedScalingMetricSpecification {
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
    interface Datapoint {
        var Timestamp: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var Value: MetricScale?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteScalingPlanRequest {
        var ScalingPlanName: ScalingPlanName
        var ScalingPlanVersion: ScalingPlanVersion
    }
    interface DeleteScalingPlanResponse
    interface DescribeScalingPlanResourcesRequest {
        var ScalingPlanName: ScalingPlanName
        var ScalingPlanVersion: ScalingPlanVersion
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeScalingPlanResourcesResponse {
        var ScalingPlanResources: ScalingPlanResources?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeScalingPlansRequest {
        var ScalingPlanNames: ScalingPlanNames?
            get() = definedExternally
            set(value) = definedExternally
        var ScalingPlanVersion: ScalingPlanVersion?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationSources: ApplicationSources?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeScalingPlansResponse {
        var ScalingPlans: ScalingPlans?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetScalingPlanResourceForecastDataRequest {
        var ScalingPlanName: ScalingPlanName
        var ScalingPlanVersion: ScalingPlanVersion
        var ServiceNamespace: String /* "autoscaling" | "ecs" | "ec2" | "rds" | "dynamodb" | String */
        var ResourceId: XmlString
        var ScalableDimension: String /* "autoscaling:autoScalingGroup:DesiredCapacity" | "ecs:service:DesiredCount" | "ec2:spot-fleet-request:TargetCapacity" | "rds:cluster:ReadReplicaCount" | "dynamodb:table:ReadCapacityUnits" | "dynamodb:table:WriteCapacityUnits" | "dynamodb:index:ReadCapacityUnits" | "dynamodb:index:WriteCapacityUnits" | String */
        var ForecastDataType: String /* "CapacityForecast" | "LoadForecast" | "ScheduledActionMinCapacity" | "ScheduledActionMaxCapacity" | String */
        var StartTime: TimestampType
        var EndTime: TimestampType
    }
    interface GetScalingPlanResourceForecastDataResponse {
        var Datapoints: Datapoints
    }
    interface MetricDimension {
        var Name: MetricDimensionName
        var Value: MetricDimensionValue
    }
    interface PredefinedLoadMetricSpecification {
        var PredefinedLoadMetricType: String /* "ASGTotalCPUUtilization" | "ASGTotalNetworkIn" | "ASGTotalNetworkOut" | "ALBTargetGroupRequestCount" | String */
        var ResourceLabel: ResourceLabel?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PredefinedScalingMetricSpecification {
        var PredefinedScalingMetricType: String /* "ASGAverageCPUUtilization" | "ASGAverageNetworkIn" | "ASGAverageNetworkOut" | "DynamoDBReadCapacityUtilization" | "DynamoDBWriteCapacityUtilization" | "ECSServiceAverageCPUUtilization" | "ECSServiceAverageMemoryUtilization" | "ALBRequestCountPerTarget" | "RDSReaderAverageCPUUtilization" | "RDSReaderAverageDatabaseConnections" | "EC2SpotFleetRequestAverageCPUUtilization" | "EC2SpotFleetRequestAverageNetworkIn" | "EC2SpotFleetRequestAverageNetworkOut" | String */
        var ResourceLabel: ResourceLabel?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScalingInstruction {
        var ServiceNamespace: String /* "autoscaling" | "ecs" | "ec2" | "rds" | "dynamodb" | String */
        var ResourceId: ResourceIdMaxLen1600
        var ScalableDimension: String /* "autoscaling:autoScalingGroup:DesiredCapacity" | "ecs:service:DesiredCount" | "ec2:spot-fleet-request:TargetCapacity" | "rds:cluster:ReadReplicaCount" | "dynamodb:table:ReadCapacityUnits" | "dynamodb:table:WriteCapacityUnits" | "dynamodb:index:ReadCapacityUnits" | "dynamodb:index:WriteCapacityUnits" | String */
        var MinCapacity: ResourceCapacity
        var MaxCapacity: ResourceCapacity
        var TargetTrackingConfigurations: TargetTrackingConfigurations
        var PredefinedLoadMetricSpecification: PredefinedLoadMetricSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var CustomizedLoadMetricSpecification: CustomizedLoadMetricSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduledActionBufferTime: ScheduledActionBufferTime?
            get() = definedExternally
            set(value) = definedExternally
        var PredictiveScalingMaxCapacityBehavior: String /* "SetForecastCapacityToMaxCapacity" | "SetMaxCapacityToForecastCapacity" | "SetMaxCapacityAboveForecastCapacity" | String */
        var PredictiveScalingMaxCapacityBuffer: ResourceCapacity?
            get() = definedExternally
            set(value) = definedExternally
        var PredictiveScalingMode: String /* "ForecastAndScale" | "ForecastOnly" | String */
        var ScalingPolicyUpdateBehavior: String /* "KeepExternalPolicies" | "ReplaceExternalPolicies" | String */
        var DisableDynamicScaling: DisableDynamicScaling?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScalingPlan {
        var ScalingPlanName: ScalingPlanName
        var ScalingPlanVersion: ScalingPlanVersion
        var ApplicationSource: ApplicationSource
        var ScalingInstructions: ScalingInstructions
        var StatusCode: String /* "Active" | "ActiveWithProblems" | "CreationInProgress" | "CreationFailed" | "DeletionInProgress" | "DeletionFailed" | "UpdateInProgress" | "UpdateFailed" | String */
        var StatusMessage: XmlString?
            get() = definedExternally
            set(value) = definedExternally
        var StatusStartTime: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScalingPlanResource {
        var ScalingPlanName: ScalingPlanName
        var ScalingPlanVersion: ScalingPlanVersion
        var ServiceNamespace: String /* "autoscaling" | "ecs" | "ec2" | "rds" | "dynamodb" | String */
        var ResourceId: ResourceIdMaxLen1600
        var ScalableDimension: String /* "autoscaling:autoScalingGroup:DesiredCapacity" | "ecs:service:DesiredCount" | "ec2:spot-fleet-request:TargetCapacity" | "rds:cluster:ReadReplicaCount" | "dynamodb:table:ReadCapacityUnits" | "dynamodb:table:WriteCapacityUnits" | "dynamodb:index:ReadCapacityUnits" | "dynamodb:index:WriteCapacityUnits" | String */
        var ScalingPolicies: ScalingPolicies?
            get() = definedExternally
            set(value) = definedExternally
        var ScalingStatusCode: String /* "Inactive" | "PartiallyActive" | "Active" | String */
        var ScalingStatusMessage: XmlString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScalingPolicy {
        var PolicyName: PolicyName
        var PolicyType: String /* "TargetTrackingScaling" | String */
        var TargetTrackingConfiguration: TargetTrackingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagFilter {
        var Key: XmlStringMaxLen128?
            get() = definedExternally
            set(value) = definedExternally
        var Values: TagValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TargetTrackingConfiguration {
        var PredefinedScalingMetricSpecification: PredefinedScalingMetricSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var CustomizedScalingMetricSpecification: CustomizedScalingMetricSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var TargetValue: MetricScale
        var DisableScaleIn: DisableScaleIn?
            get() = definedExternally
            set(value) = definedExternally
        var ScaleOutCooldown: Cooldown?
            get() = definedExternally
            set(value) = definedExternally
        var ScaleInCooldown: Cooldown?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedInstanceWarmup: Cooldown?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateScalingPlanRequest {
        var ScalingPlanName: ScalingPlanName
        var ScalingPlanVersion: ScalingPlanVersion
        var ApplicationSource: ApplicationSource?
            get() = definedExternally
            set(value) = definedExternally
        var ScalingInstructions: ScalingInstructions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateScalingPlanResponse
    interface ClientApiVersions {
        var apiVersion: String /* "2018-01-06" | "latest" | String */
    }
}