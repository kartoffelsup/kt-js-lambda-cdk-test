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
import ComputeOptimizer.AutoScalingGroupRecommendationOption
import ComputeOptimizer.AutoScalingGroupRecommendation
import ComputeOptimizer.Filter
import ComputeOptimizer.GetRecommendationError
import ComputeOptimizer.InstanceRecommendation
import ComputeOptimizer.ProjectedMetric
import ComputeOptimizer.UtilizationMetric
import ComputeOptimizer.InstanceRecommendationOption
import ComputeOptimizer.RecommendationSource
import ComputeOptimizer.RecommendationSummary
import ComputeOptimizer.RecommendedOptionProjectedMetric
import ComputeOptimizer.Summary
import ComputeOptimizer.GetAutoScalingGroupRecommendationsRequest
import ComputeOptimizer.GetAutoScalingGroupRecommendationsResponse
import ComputeOptimizer.GetEC2InstanceRecommendationsRequest
import ComputeOptimizer.GetEC2InstanceRecommendationsResponse
import ComputeOptimizer.GetEC2RecommendationProjectedMetricsRequest
import ComputeOptimizer.GetEC2RecommendationProjectedMetricsResponse
import ComputeOptimizer.GetEnrollmentStatusRequest
import ComputeOptimizer.GetEnrollmentStatusResponse
import ComputeOptimizer.GetRecommendationSummariesRequest
import ComputeOptimizer.GetRecommendationSummariesResponse
import ComputeOptimizer.UpdateEnrollmentStatusRequest
import ComputeOptimizer.UpdateEnrollmentStatusResponse
import ComputeOptimizer.AutoScalingGroupConfiguration

typealias AccountId = String

typealias AccountIds = Array<AccountId>

typealias AutoScalingGroupArn = String

typealias AutoScalingGroupArns = Array<AutoScalingGroupArn>

typealias AutoScalingGroupName = String

typealias AutoScalingGroupRecommendationOptions = Array<AutoScalingGroupRecommendationOption>

typealias AutoScalingGroupRecommendations = Array<AutoScalingGroupRecommendation>

typealias Code = String

typealias CurrentInstanceType = String

typealias DesiredCapacity = Number

typealias FilterValue = String

typealias FilterValues = Array<FilterValue>

typealias Filters = Array<Filter>

typealias GetRecommendationErrors = Array<GetRecommendationError>

typealias Identifier = String

typealias IncludeMemberAccounts = Boolean

typealias InstanceArn = String

typealias InstanceArns = Array<InstanceArn>

typealias InstanceName = String

typealias InstanceRecommendations = Array<InstanceRecommendation>

typealias InstanceType = String

typealias LastRefreshTimestamp = Date

typealias LookBackPeriodInDays = Number

typealias MaxResults = Number

typealias MaxSize = Number

typealias MemberAccountsEnrolled = Boolean

typealias Message = String

typealias MetricValue = Number

typealias MetricValues = Array<MetricValue>

typealias MinSize = Number

typealias NextToken = String

typealias PerformanceRisk = Number

typealias Period = Number

typealias ProjectedMetrics = Array<ProjectedMetric>

typealias ProjectedUtilizationMetrics = Array<UtilizationMetric>

typealias Rank = Number

typealias RecommendationOptions = Array<InstanceRecommendationOption>

typealias RecommendationSourceArn = String

typealias RecommendationSources = Array<RecommendationSource>

typealias RecommendationSummaries = Array<RecommendationSummary>

typealias RecommendedInstanceType = String

typealias RecommendedOptionProjectedMetrics = Array<RecommendedOptionProjectedMetric>

typealias StatusReason = String

typealias Summaries = Array<Summary>

typealias SummaryValue = Number

typealias Timestamp = Date

typealias Timestamps = Array<Timestamp>

typealias UtilizationMetrics = Array<UtilizationMetric>

@JsModule("aws-sdk")
external open class ComputeOptimizer(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ComputeOptimizer.Types.ClientConfiguration */
    open fun getAutoScalingGroupRecommendations(params: GetAutoScalingGroupRecommendationsRequest, callback: (err: AWSError, data: GetAutoScalingGroupRecommendationsResponse) -> Unit = definedExternally): Request<GetAutoScalingGroupRecommendationsResponse, AWSError>
    open fun getAutoScalingGroupRecommendations(callback: (err: AWSError, data: GetAutoScalingGroupRecommendationsResponse) -> Unit = definedExternally): Request<GetAutoScalingGroupRecommendationsResponse, AWSError>
    open fun getEC2InstanceRecommendations(params: GetEC2InstanceRecommendationsRequest, callback: (err: AWSError, data: GetEC2InstanceRecommendationsResponse) -> Unit = definedExternally): Request<GetEC2InstanceRecommendationsResponse, AWSError>
    open fun getEC2InstanceRecommendations(callback: (err: AWSError, data: GetEC2InstanceRecommendationsResponse) -> Unit = definedExternally): Request<GetEC2InstanceRecommendationsResponse, AWSError>
    open fun getEC2RecommendationProjectedMetrics(params: GetEC2RecommendationProjectedMetricsRequest, callback: (err: AWSError, data: GetEC2RecommendationProjectedMetricsResponse) -> Unit = definedExternally): Request<GetEC2RecommendationProjectedMetricsResponse, AWSError>
    open fun getEC2RecommendationProjectedMetrics(callback: (err: AWSError, data: GetEC2RecommendationProjectedMetricsResponse) -> Unit = definedExternally): Request<GetEC2RecommendationProjectedMetricsResponse, AWSError>
    open fun getEnrollmentStatus(params: GetEnrollmentStatusRequest, callback: (err: AWSError, data: GetEnrollmentStatusResponse) -> Unit = definedExternally): Request<GetEnrollmentStatusResponse, AWSError>
    open fun getEnrollmentStatus(callback: (err: AWSError, data: GetEnrollmentStatusResponse) -> Unit = definedExternally): Request<GetEnrollmentStatusResponse, AWSError>
    open fun getRecommendationSummaries(params: GetRecommendationSummariesRequest, callback: (err: AWSError, data: GetRecommendationSummariesResponse) -> Unit = definedExternally): Request<GetRecommendationSummariesResponse, AWSError>
    open fun getRecommendationSummaries(callback: (err: AWSError, data: GetRecommendationSummariesResponse) -> Unit = definedExternally): Request<GetRecommendationSummariesResponse, AWSError>
    open fun updateEnrollmentStatus(params: UpdateEnrollmentStatusRequest, callback: (err: AWSError, data: UpdateEnrollmentStatusResponse) -> Unit = definedExternally): Request<UpdateEnrollmentStatusResponse, AWSError>
    open fun updateEnrollmentStatus(callback: (err: AWSError, data: UpdateEnrollmentStatusResponse) -> Unit = definedExternally): Request<UpdateEnrollmentStatusResponse, AWSError>
    interface AutoScalingGroupConfiguration {
        var desiredCapacity: DesiredCapacity?
            get() = definedExternally
            set(value) = definedExternally
        var minSize: MinSize?
            get() = definedExternally
            set(value) = definedExternally
        var maxSize: MaxSize?
            get() = definedExternally
            set(value) = definedExternally
        var instanceType: InstanceType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoScalingGroupRecommendation {
        var accountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var autoScalingGroupArn: AutoScalingGroupArn?
            get() = definedExternally
            set(value) = definedExternally
        var autoScalingGroupName: AutoScalingGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var finding: String /* "Underprovisioned" | "Overprovisioned" | "Optimized" | "NotOptimized" | String */
        var utilizationMetrics: UtilizationMetrics?
            get() = definedExternally
            set(value) = definedExternally
        var lookBackPeriodInDays: LookBackPeriodInDays?
            get() = definedExternally
            set(value) = definedExternally
        var currentConfiguration: AutoScalingGroupConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var recommendationOptions: AutoScalingGroupRecommendationOptions?
            get() = definedExternally
            set(value) = definedExternally
        var lastRefreshTimestamp: LastRefreshTimestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoScalingGroupRecommendationOption {
        var configuration: AutoScalingGroupConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var projectedUtilizationMetrics: ProjectedUtilizationMetrics?
            get() = definedExternally
            set(value) = definedExternally
        var performanceRisk: PerformanceRisk?
            get() = definedExternally
            set(value) = definedExternally
        var rank: Rank?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Filter {
        var name: String /* "Finding" | "RecommendationSourceType" | String */
        var values: FilterValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAutoScalingGroupRecommendationsRequest {
        var accountIds: AccountIds?
            get() = definedExternally
            set(value) = definedExternally
        var autoScalingGroupArns: AutoScalingGroupArns?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAutoScalingGroupRecommendationsResponse {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var autoScalingGroupRecommendations: AutoScalingGroupRecommendations?
            get() = definedExternally
            set(value) = definedExternally
        var errors: GetRecommendationErrors?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetEC2InstanceRecommendationsRequest {
        var instanceArns: InstanceArns?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
        var accountIds: AccountIds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetEC2InstanceRecommendationsResponse {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var instanceRecommendations: InstanceRecommendations?
            get() = definedExternally
            set(value) = definedExternally
        var errors: GetRecommendationErrors?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetEC2RecommendationProjectedMetricsRequest {
        var instanceArn: InstanceArn
        var stat: String /* "Maximum" | "Average" | String */
        var period: Period
        var startTime: Timestamp
        var endTime: Timestamp
    }
    interface GetEC2RecommendationProjectedMetricsResponse {
        var recommendedOptionProjectedMetrics: RecommendedOptionProjectedMetrics?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetEnrollmentStatusRequest
    interface GetEnrollmentStatusResponse {
        var status: String /* "Active" | "Inactive" | "Pending" | "Failed" | String */
        var statusReason: StatusReason?
            get() = definedExternally
            set(value) = definedExternally
        var memberAccountsEnrolled: MemberAccountsEnrolled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRecommendationError {
        var identifier: Identifier?
            get() = definedExternally
            set(value) = definedExternally
        var code: Code?
            get() = definedExternally
            set(value) = definedExternally
        var message: Message?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRecommendationSummariesRequest {
        var accountIds: AccountIds?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRecommendationSummariesResponse {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var recommendationSummaries: RecommendationSummaries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceRecommendation {
        var instanceArn: InstanceArn?
            get() = definedExternally
            set(value) = definedExternally
        var accountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var instanceName: InstanceName?
            get() = definedExternally
            set(value) = definedExternally
        var currentInstanceType: CurrentInstanceType?
            get() = definedExternally
            set(value) = definedExternally
        var finding: String /* "Underprovisioned" | "Overprovisioned" | "Optimized" | "NotOptimized" | String */
        var utilizationMetrics: UtilizationMetrics?
            get() = definedExternally
            set(value) = definedExternally
        var lookBackPeriodInDays: LookBackPeriodInDays?
            get() = definedExternally
            set(value) = definedExternally
        var recommendationOptions: RecommendationOptions?
            get() = definedExternally
            set(value) = definedExternally
        var recommendationSources: RecommendationSources?
            get() = definedExternally
            set(value) = definedExternally
        var lastRefreshTimestamp: LastRefreshTimestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceRecommendationOption {
        var instanceType: InstanceType?
            get() = definedExternally
            set(value) = definedExternally
        var projectedUtilizationMetrics: ProjectedUtilizationMetrics?
            get() = definedExternally
            set(value) = definedExternally
        var performanceRisk: PerformanceRisk?
            get() = definedExternally
            set(value) = definedExternally
        var rank: Rank?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProjectedMetric {
        var name: String /* "Cpu" | "Memory" | String */
        var timestamps: Timestamps?
            get() = definedExternally
            set(value) = definedExternally
        var values: MetricValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecommendationSource {
        var recommendationSourceArn: RecommendationSourceArn?
            get() = definedExternally
            set(value) = definedExternally
        var recommendationSourceType: String /* "Ec2Instance" | "AutoScalingGroup" | String */
    }
    interface RecommendationSummary {
        var summaries: Summaries?
            get() = definedExternally
            set(value) = definedExternally
        var recommendationResourceType: String /* "Ec2Instance" | "AutoScalingGroup" | String */
        var accountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecommendedOptionProjectedMetric {
        var recommendedInstanceType: RecommendedInstanceType?
            get() = definedExternally
            set(value) = definedExternally
        var rank: Rank?
            get() = definedExternally
            set(value) = definedExternally
        var projectedMetrics: ProjectedMetrics?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Summary {
        var name: String /* "Underprovisioned" | "Overprovisioned" | "Optimized" | "NotOptimized" | String */
        var value: SummaryValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateEnrollmentStatusRequest {
        var status: String /* "Active" | "Inactive" | "Pending" | "Failed" | String */
        var includeMemberAccounts: IncludeMemberAccounts?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateEnrollmentStatusResponse {
        var status: String /* "Active" | "Inactive" | "Pending" | "Failed" | String */
        var statusReason: StatusReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UtilizationMetric {
        var name: String /* "Cpu" | "Memory" | String */
        var statistic: String /* "Maximum" | "Average" | String */
        var value: MetricValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-11-01" | "latest" | String */
    }
}