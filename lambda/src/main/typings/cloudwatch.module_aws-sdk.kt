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
import CloudWatch.AlarmHistoryItem
import CloudWatch.Range
import CloudWatch.AnomalyDetector
import CloudWatch.PartialFailure
import CloudWatch.CompositeAlarm
import CloudWatch.DashboardEntry
import CloudWatch.DashboardValidationMessage
import CloudWatch.Datapoint
import CloudWatch.DimensionFilter
import CloudWatch.Dimension
import CloudWatch.InsightRuleContributorDatapoint
import CloudWatch.InsightRuleContributor
import CloudWatch.InsightRuleMetricDatapoint
import CloudWatch.InsightRule
import CloudWatch.MetricAlarm
import CloudWatch.MetricDatum
import CloudWatch.MetricDataQuery
import CloudWatch.MessageData
import CloudWatch.MetricDataResult
import CloudWatch.Metric
import CloudWatch.Tag
import CloudWatch.DeleteAlarmsInput
import CloudWatch.DeleteAnomalyDetectorInput
import CloudWatch.DeleteAnomalyDetectorOutput
import CloudWatch.DeleteDashboardsInput
import CloudWatch.DeleteDashboardsOutput
import CloudWatch.DeleteInsightRulesInput
import CloudWatch.DeleteInsightRulesOutput
import CloudWatch.DescribeAlarmHistoryInput
import CloudWatch.DescribeAlarmHistoryOutput
import CloudWatch.DescribeAlarmsInput
import CloudWatch.DescribeAlarmsOutput
import CloudWatch.DescribeAlarmsForMetricInput
import CloudWatch.DescribeAlarmsForMetricOutput
import CloudWatch.DescribeAnomalyDetectorsInput
import CloudWatch.DescribeAnomalyDetectorsOutput
import CloudWatch.DescribeInsightRulesInput
import CloudWatch.DescribeInsightRulesOutput
import CloudWatch.DisableAlarmActionsInput
import CloudWatch.DisableInsightRulesInput
import CloudWatch.DisableInsightRulesOutput
import CloudWatch.EnableAlarmActionsInput
import CloudWatch.EnableInsightRulesInput
import CloudWatch.EnableInsightRulesOutput
import CloudWatch.GetDashboardInput
import CloudWatch.GetDashboardOutput
import CloudWatch.GetInsightRuleReportInput
import CloudWatch.GetInsightRuleReportOutput
import CloudWatch.GetMetricDataInput
import CloudWatch.GetMetricDataOutput
import CloudWatch.GetMetricStatisticsInput
import CloudWatch.GetMetricStatisticsOutput
import CloudWatch.GetMetricWidgetImageInput
import CloudWatch.GetMetricWidgetImageOutput
import CloudWatch.ListDashboardsInput
import CloudWatch.ListDashboardsOutput
import CloudWatch.ListMetricsInput
import CloudWatch.ListMetricsOutput
import CloudWatch.ListTagsForResourceInput
import CloudWatch.ListTagsForResourceOutput
import CloudWatch.PutAnomalyDetectorInput
import CloudWatch.PutAnomalyDetectorOutput
import CloudWatch.PutCompositeAlarmInput
import CloudWatch.PutDashboardInput
import CloudWatch.PutDashboardOutput
import CloudWatch.PutInsightRuleInput
import CloudWatch.PutInsightRuleOutput
import CloudWatch.PutMetricAlarmInput
import CloudWatch.PutMetricDataInput
import CloudWatch.SetAlarmStateInput
import CloudWatch.TagResourceInput
import CloudWatch.TagResourceOutput
import CloudWatch.UntagResourceInput
import CloudWatch.UntagResourceOutput
import CloudWatch.AnomalyDetectorConfiguration
import CloudWatch.DatapointValueMap
import CloudWatch.MetricStat
import CloudWatch.StatisticSet

typealias ActionPrefix = String

typealias ActionsEnabled = Boolean

typealias AlarmArn = String

typealias AlarmDescription = String

typealias AlarmHistoryItems = Array<AlarmHistoryItem>

typealias AlarmName = String

typealias AlarmNamePrefix = String

typealias AlarmNames = Array<AlarmName>

typealias AlarmRule = String

typealias AlarmTypes = Array<String /* "CompositeAlarm" | "MetricAlarm" | String */>

typealias AmazonResourceName = String

typealias AnomalyDetectorExcludedTimeRanges = Array<Range>

typealias AnomalyDetectorMetricTimezone = String

typealias AnomalyDetectors = Array<AnomalyDetector>

typealias BatchFailures = Array<PartialFailure>

typealias CompositeAlarms = Array<CompositeAlarm>

typealias Counts = Array<DatapointValue>

typealias DashboardArn = String

typealias DashboardBody = String

typealias DashboardEntries = Array<DashboardEntry>

typealias DashboardName = String

typealias DashboardNamePrefix = String

typealias DashboardNames = Array<DashboardName>

typealias DashboardValidationMessages = Array<DashboardValidationMessage>

typealias DataPath = String

typealias DatapointValue = Number

typealias DatapointValues = Array<DatapointValue>

typealias Datapoints = Array<Datapoint>

typealias DatapointsToAlarm = Number

typealias DimensionFilters = Array<DimensionFilter>

typealias DimensionName = String

typealias DimensionValue = String

typealias Dimensions = Array<Dimension>

typealias EvaluateLowSampleCountPercentile = String

typealias EvaluationPeriods = Number

typealias ExceptionType = String

typealias ExtendedStatistic = String

typealias ExtendedStatistics = Array<ExtendedStatistic>

typealias FailureCode = String

typealias FailureDescription = String

typealias FailureResource = String

typealias GetMetricDataMaxDatapoints = Number

typealias HistoryData = String

typealias HistorySummary = String

typealias InsightRuleAggregationStatistic = String

typealias InsightRuleContributorDatapoints = Array<InsightRuleContributorDatapoint>

typealias InsightRuleContributorKey = String

typealias InsightRuleContributorKeyLabel = String

typealias InsightRuleContributorKeyLabels = Array<InsightRuleContributorKeyLabel>

typealias InsightRuleContributorKeys = Array<InsightRuleContributorKey>

typealias InsightRuleContributors = Array<InsightRuleContributor>

typealias InsightRuleDefinition = String

typealias InsightRuleMaxResults = Number

typealias InsightRuleMetricDatapoints = Array<InsightRuleMetricDatapoint>

typealias InsightRuleMetricList = Array<InsightRuleMetricName>

typealias InsightRuleMetricName = String

typealias InsightRuleName = String

typealias InsightRuleNames = Array<InsightRuleName>

typealias InsightRuleOrderBy = String

typealias InsightRuleSchema = String

typealias InsightRuleState = String

typealias InsightRuleUnboundDouble = Number

typealias InsightRuleUnboundInteger = Number

typealias InsightRuleUnboundLong = Number

typealias InsightRules = Array<InsightRule>

typealias LastModified = Date

typealias MaxRecords = Number

typealias MaxReturnedResultsCount = Number

typealias Message = String

typealias MessageDataCode = String

typealias MessageDataValue = String

typealias MetricAlarms = Array<MetricAlarm>

typealias MetricData = Array<MetricDatum>

typealias MetricDataQueries = Array<MetricDataQuery>

typealias MetricDataResultMessages = Array<MessageData>

typealias MetricDataResults = Array<MetricDataResult>

typealias MetricExpression = String

typealias MetricId = String

typealias MetricLabel = String

typealias MetricName = String

typealias MetricWidget = String

typealias Metrics = Array<Metric>

typealias Namespace = String

typealias NextToken = String

typealias OutputFormat = String

typealias Period = Number

typealias ResourceList = Array<ResourceName>

typealias ResourceName = String

typealias ReturnData = Boolean

typealias Size = Number

typealias Stat = String

typealias StateReason = String

typealias StateReasonData = String

typealias Statistics = Array<String /* "SampleCount" | "Average" | "Sum" | "Minimum" | "Maximum" | String */>

typealias StorageResolution = Number

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias Threshold = Number

typealias Timestamp = Date

typealias Timestamps = Array<Timestamp>

typealias TreatMissingData = String

typealias Values = Array<DatapointValue>

@JsModule("aws-sdk")
external open class CloudWatch(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CloudWatch.Types.ClientConfiguration */
    open fun deleteAlarms(params: DeleteAlarmsInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAlarms(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAnomalyDetector(params: DeleteAnomalyDetectorInput, callback: (err: AWSError, data: DeleteAnomalyDetectorOutput) -> Unit = definedExternally): Request<DeleteAnomalyDetectorOutput, AWSError>
    open fun deleteAnomalyDetector(callback: (err: AWSError, data: DeleteAnomalyDetectorOutput) -> Unit = definedExternally): Request<DeleteAnomalyDetectorOutput, AWSError>
    open fun deleteDashboards(params: DeleteDashboardsInput, callback: (err: AWSError, data: DeleteDashboardsOutput) -> Unit = definedExternally): Request<DeleteDashboardsOutput, AWSError>
    open fun deleteDashboards(callback: (err: AWSError, data: DeleteDashboardsOutput) -> Unit = definedExternally): Request<DeleteDashboardsOutput, AWSError>
    open fun deleteInsightRules(params: DeleteInsightRulesInput, callback: (err: AWSError, data: DeleteInsightRulesOutput) -> Unit = definedExternally): Request<DeleteInsightRulesOutput, AWSError>
    open fun deleteInsightRules(callback: (err: AWSError, data: DeleteInsightRulesOutput) -> Unit = definedExternally): Request<DeleteInsightRulesOutput, AWSError>
    open fun describeAlarmHistory(params: DescribeAlarmHistoryInput, callback: (err: AWSError, data: DescribeAlarmHistoryOutput) -> Unit = definedExternally): Request<DescribeAlarmHistoryOutput, AWSError>
    open fun describeAlarmHistory(callback: (err: AWSError, data: DescribeAlarmHistoryOutput) -> Unit = definedExternally): Request<DescribeAlarmHistoryOutput, AWSError>
    open fun describeAlarms(params: DescribeAlarmsInput, callback: (err: AWSError, data: DescribeAlarmsOutput) -> Unit = definedExternally): Request<DescribeAlarmsOutput, AWSError>
    open fun describeAlarms(callback: (err: AWSError, data: DescribeAlarmsOutput) -> Unit = definedExternally): Request<DescribeAlarmsOutput, AWSError>
    open fun describeAlarmsForMetric(params: DescribeAlarmsForMetricInput, callback: (err: AWSError, data: DescribeAlarmsForMetricOutput) -> Unit = definedExternally): Request<DescribeAlarmsForMetricOutput, AWSError>
    open fun describeAlarmsForMetric(callback: (err: AWSError, data: DescribeAlarmsForMetricOutput) -> Unit = definedExternally): Request<DescribeAlarmsForMetricOutput, AWSError>
    open fun describeAnomalyDetectors(params: DescribeAnomalyDetectorsInput, callback: (err: AWSError, data: DescribeAnomalyDetectorsOutput) -> Unit = definedExternally): Request<DescribeAnomalyDetectorsOutput, AWSError>
    open fun describeAnomalyDetectors(callback: (err: AWSError, data: DescribeAnomalyDetectorsOutput) -> Unit = definedExternally): Request<DescribeAnomalyDetectorsOutput, AWSError>
    open fun describeInsightRules(params: DescribeInsightRulesInput, callback: (err: AWSError, data: DescribeInsightRulesOutput) -> Unit = definedExternally): Request<DescribeInsightRulesOutput, AWSError>
    open fun describeInsightRules(callback: (err: AWSError, data: DescribeInsightRulesOutput) -> Unit = definedExternally): Request<DescribeInsightRulesOutput, AWSError>
    open fun disableAlarmActions(params: DisableAlarmActionsInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disableAlarmActions(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disableInsightRules(params: DisableInsightRulesInput, callback: (err: AWSError, data: DisableInsightRulesOutput) -> Unit = definedExternally): Request<DisableInsightRulesOutput, AWSError>
    open fun disableInsightRules(callback: (err: AWSError, data: DisableInsightRulesOutput) -> Unit = definedExternally): Request<DisableInsightRulesOutput, AWSError>
    open fun enableAlarmActions(params: EnableAlarmActionsInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun enableAlarmActions(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun enableInsightRules(params: EnableInsightRulesInput, callback: (err: AWSError, data: EnableInsightRulesOutput) -> Unit = definedExternally): Request<EnableInsightRulesOutput, AWSError>
    open fun enableInsightRules(callback: (err: AWSError, data: EnableInsightRulesOutput) -> Unit = definedExternally): Request<EnableInsightRulesOutput, AWSError>
    open fun getDashboard(params: GetDashboardInput, callback: (err: AWSError, data: GetDashboardOutput) -> Unit = definedExternally): Request<GetDashboardOutput, AWSError>
    open fun getDashboard(callback: (err: AWSError, data: GetDashboardOutput) -> Unit = definedExternally): Request<GetDashboardOutput, AWSError>
    open fun getInsightRuleReport(params: GetInsightRuleReportInput, callback: (err: AWSError, data: GetInsightRuleReportOutput) -> Unit = definedExternally): Request<GetInsightRuleReportOutput, AWSError>
    open fun getInsightRuleReport(callback: (err: AWSError, data: GetInsightRuleReportOutput) -> Unit = definedExternally): Request<GetInsightRuleReportOutput, AWSError>
    open fun getMetricData(params: GetMetricDataInput, callback: (err: AWSError, data: GetMetricDataOutput) -> Unit = definedExternally): Request<GetMetricDataOutput, AWSError>
    open fun getMetricData(callback: (err: AWSError, data: GetMetricDataOutput) -> Unit = definedExternally): Request<GetMetricDataOutput, AWSError>
    open fun getMetricStatistics(params: GetMetricStatisticsInput, callback: (err: AWSError, data: GetMetricStatisticsOutput) -> Unit = definedExternally): Request<GetMetricStatisticsOutput, AWSError>
    open fun getMetricStatistics(callback: (err: AWSError, data: GetMetricStatisticsOutput) -> Unit = definedExternally): Request<GetMetricStatisticsOutput, AWSError>
    open fun getMetricWidgetImage(params: GetMetricWidgetImageInput, callback: (err: AWSError, data: GetMetricWidgetImageOutput) -> Unit = definedExternally): Request<GetMetricWidgetImageOutput, AWSError>
    open fun getMetricWidgetImage(callback: (err: AWSError, data: GetMetricWidgetImageOutput) -> Unit = definedExternally): Request<GetMetricWidgetImageOutput, AWSError>
    open fun listDashboards(params: ListDashboardsInput, callback: (err: AWSError, data: ListDashboardsOutput) -> Unit = definedExternally): Request<ListDashboardsOutput, AWSError>
    open fun listDashboards(callback: (err: AWSError, data: ListDashboardsOutput) -> Unit = definedExternally): Request<ListDashboardsOutput, AWSError>
    open fun listMetrics(params: ListMetricsInput, callback: (err: AWSError, data: ListMetricsOutput) -> Unit = definedExternally): Request<ListMetricsOutput, AWSError>
    open fun listMetrics(callback: (err: AWSError, data: ListMetricsOutput) -> Unit = definedExternally): Request<ListMetricsOutput, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceInput, callback: (err: AWSError, data: ListTagsForResourceOutput) -> Unit = definedExternally): Request<ListTagsForResourceOutput, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceOutput) -> Unit = definedExternally): Request<ListTagsForResourceOutput, AWSError>
    open fun putAnomalyDetector(params: PutAnomalyDetectorInput, callback: (err: AWSError, data: PutAnomalyDetectorOutput) -> Unit = definedExternally): Request<PutAnomalyDetectorOutput, AWSError>
    open fun putAnomalyDetector(callback: (err: AWSError, data: PutAnomalyDetectorOutput) -> Unit = definedExternally): Request<PutAnomalyDetectorOutput, AWSError>
    open fun putCompositeAlarm(params: PutCompositeAlarmInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putCompositeAlarm(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putDashboard(params: PutDashboardInput, callback: (err: AWSError, data: PutDashboardOutput) -> Unit = definedExternally): Request<PutDashboardOutput, AWSError>
    open fun putDashboard(callback: (err: AWSError, data: PutDashboardOutput) -> Unit = definedExternally): Request<PutDashboardOutput, AWSError>
    open fun putInsightRule(params: PutInsightRuleInput, callback: (err: AWSError, data: PutInsightRuleOutput) -> Unit = definedExternally): Request<PutInsightRuleOutput, AWSError>
    open fun putInsightRule(callback: (err: AWSError, data: PutInsightRuleOutput) -> Unit = definedExternally): Request<PutInsightRuleOutput, AWSError>
    open fun putMetricAlarm(params: PutMetricAlarmInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putMetricAlarm(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putMetricData(params: PutMetricDataInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putMetricData(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setAlarmState(params: SetAlarmStateInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setAlarmState(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(params: TagResourceInput, callback: (err: AWSError, data: TagResourceOutput) -> Unit = definedExternally): Request<TagResourceOutput, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceOutput) -> Unit = definedExternally): Request<TagResourceOutput, AWSError>
    open fun untagResource(params: UntagResourceInput, callback: (err: AWSError, data: UntagResourceOutput) -> Unit = definedExternally): Request<UntagResourceOutput, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceOutput) -> Unit = definedExternally): Request<UntagResourceOutput, AWSError>
    open fun waitFor(state: String, params: DescribeAlarmsInput, callback: (err: AWSError, data: DescribeAlarmsOutput) -> Unit = definedExternally): Request<DescribeAlarmsOutput, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DescribeAlarmsOutput) -> Unit = definedExternally): Request<DescribeAlarmsOutput, AWSError>
    interface AlarmHistoryItem {
        var AlarmName: AlarmName?
            get() = definedExternally
            set(value) = definedExternally
        var AlarmType: String /* "CompositeAlarm" | "MetricAlarm" | String */
        var Timestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var HistoryItemType: String /* "ConfigurationUpdate" | "StateUpdate" | "Action" | String */
        var HistorySummary: HistorySummary?
            get() = definedExternally
            set(value) = definedExternally
        var HistoryData: HistoryData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AnomalyDetector {
        var Namespace: Namespace?
            get() = definedExternally
            set(value) = definedExternally
        var MetricName: MetricName?
            get() = definedExternally
            set(value) = definedExternally
        var Dimensions: Dimensions?
            get() = definedExternally
            set(value) = definedExternally
        var Stat: Stat?
            get() = definedExternally
            set(value) = definedExternally
        var Configuration: AnomalyDetectorConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var StateValue: String /* "PENDING_TRAINING" | "TRAINED_INSUFFICIENT_DATA" | "TRAINED" | String */
    }
    interface AnomalyDetectorConfiguration {
        var ExcludedTimeRanges: AnomalyDetectorExcludedTimeRanges?
            get() = definedExternally
            set(value) = definedExternally
        var MetricTimezone: AnomalyDetectorMetricTimezone?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CompositeAlarm {
        var ActionsEnabled: ActionsEnabled?
            get() = definedExternally
            set(value) = definedExternally
        var AlarmActions: ResourceList?
            get() = definedExternally
            set(value) = definedExternally
        var AlarmArn: AlarmArn?
            get() = definedExternally
            set(value) = definedExternally
        var AlarmConfigurationUpdatedTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var AlarmDescription: AlarmDescription?
            get() = definedExternally
            set(value) = definedExternally
        var AlarmName: AlarmName?
            get() = definedExternally
            set(value) = definedExternally
        var AlarmRule: AlarmRule?
            get() = definedExternally
            set(value) = definedExternally
        var InsufficientDataActions: ResourceList?
            get() = definedExternally
            set(value) = definedExternally
        var OKActions: ResourceList?
            get() = definedExternally
            set(value) = definedExternally
        var StateReason: StateReason?
            get() = definedExternally
            set(value) = definedExternally
        var StateReasonData: StateReasonData?
            get() = definedExternally
            set(value) = definedExternally
        var StateUpdatedTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var StateValue: String /* "OK" | "ALARM" | "INSUFFICIENT_DATA" | String */
    }
    interface DashboardEntry {
        var DashboardName: DashboardName?
            get() = definedExternally
            set(value) = definedExternally
        var DashboardArn: DashboardArn?
            get() = definedExternally
            set(value) = definedExternally
        var LastModified: LastModified?
            get() = definedExternally
            set(value) = definedExternally
        var Size: Size?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DashboardValidationMessage {
        var DataPath: DataPath?
            get() = definedExternally
            set(value) = definedExternally
        var Message: Message?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Datapoint {
        var Timestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SampleCount: DatapointValue?
            get() = definedExternally
            set(value) = definedExternally
        var Average: DatapointValue?
            get() = definedExternally
            set(value) = definedExternally
        var Sum: DatapointValue?
            get() = definedExternally
            set(value) = definedExternally
        var Minimum: DatapointValue?
            get() = definedExternally
            set(value) = definedExternally
        var Maximum: DatapointValue?
            get() = definedExternally
            set(value) = definedExternally
        var Unit: String /* "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Count" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second" | "None" | String */
        var ExtendedStatistics: DatapointValueMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DatapointValueMap {
        @nativeGetter
        operator fun get(key: String): DatapointValue?
        @nativeSetter
        operator fun set(key: String, value: DatapointValue)
    }
    interface DeleteAlarmsInput {
        var AlarmNames: AlarmNames
    }
    interface DeleteAnomalyDetectorInput {
        var Namespace: Namespace
        var MetricName: MetricName
        var Dimensions: Dimensions?
            get() = definedExternally
            set(value) = definedExternally
        var Stat: Stat
    }
    interface DeleteAnomalyDetectorOutput
    interface DeleteDashboardsInput {
        var DashboardNames: DashboardNames
    }
    interface DeleteDashboardsOutput
    interface DeleteInsightRulesInput {
        var RuleNames: InsightRuleNames
    }
    interface DeleteInsightRulesOutput {
        var Failures: BatchFailures?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAlarmHistoryInput {
        var AlarmName: AlarmName?
            get() = definedExternally
            set(value) = definedExternally
        var AlarmTypes: AlarmTypes?
            get() = definedExternally
            set(value) = definedExternally
        var HistoryItemType: String /* "ConfigurationUpdate" | "StateUpdate" | "Action" | String */
        var StartDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: MaxRecords?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var ScanBy: String /* "TimestampDescending" | "TimestampAscending" | String */
    }
    interface DescribeAlarmHistoryOutput {
        var AlarmHistoryItems: AlarmHistoryItems?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAlarmsForMetricInput {
        var MetricName: MetricName
        var Namespace: Namespace
        var Statistic: String /* "SampleCount" | "Average" | "Sum" | "Minimum" | "Maximum" | String */
        var ExtendedStatistic: ExtendedStatistic?
            get() = definedExternally
            set(value) = definedExternally
        var Dimensions: Dimensions?
            get() = definedExternally
            set(value) = definedExternally
        var Period: Period?
            get() = definedExternally
            set(value) = definedExternally
        var Unit: String /* "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Count" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second" | "None" | String */
    }
    interface DescribeAlarmsForMetricOutput {
        var MetricAlarms: MetricAlarms?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAlarmsInput {
        var AlarmNames: AlarmNames?
            get() = definedExternally
            set(value) = definedExternally
        var AlarmNamePrefix: AlarmNamePrefix?
            get() = definedExternally
            set(value) = definedExternally
        var AlarmTypes: AlarmTypes?
            get() = definedExternally
            set(value) = definedExternally
        var ChildrenOfAlarmName: AlarmName?
            get() = definedExternally
            set(value) = definedExternally
        var ParentsOfAlarmName: AlarmName?
            get() = definedExternally
            set(value) = definedExternally
        var StateValue: String /* "OK" | "ALARM" | "INSUFFICIENT_DATA" | String */
        var ActionPrefix: ActionPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: MaxRecords?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAlarmsOutput {
        var CompositeAlarms: CompositeAlarms?
            get() = definedExternally
            set(value) = definedExternally
        var MetricAlarms: MetricAlarms?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAnomalyDetectorsInput {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxReturnedResultsCount?
            get() = definedExternally
            set(value) = definedExternally
        var Namespace: Namespace?
            get() = definedExternally
            set(value) = definedExternally
        var MetricName: MetricName?
            get() = definedExternally
            set(value) = definedExternally
        var Dimensions: Dimensions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAnomalyDetectorsOutput {
        var AnomalyDetectors: AnomalyDetectors?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInsightRulesInput {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: InsightRuleMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInsightRulesOutput {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var InsightRules: InsightRules?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Dimension {
        var Name: DimensionName
        var Value: DimensionValue
    }
    interface DimensionFilter {
        var Name: DimensionName
        var Value: DimensionValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisableAlarmActionsInput {
        var AlarmNames: AlarmNames
    }
    interface DisableInsightRulesInput {
        var RuleNames: InsightRuleNames
    }
    interface DisableInsightRulesOutput {
        var Failures: BatchFailures?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnableAlarmActionsInput {
        var AlarmNames: AlarmNames
    }
    interface EnableInsightRulesInput {
        var RuleNames: InsightRuleNames
    }
    interface EnableInsightRulesOutput {
        var Failures: BatchFailures?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDashboardInput {
        var DashboardName: DashboardName
    }
    interface GetDashboardOutput {
        var DashboardArn: DashboardArn?
            get() = definedExternally
            set(value) = definedExternally
        var DashboardBody: DashboardBody?
            get() = definedExternally
            set(value) = definedExternally
        var DashboardName: DashboardName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInsightRuleReportInput {
        var RuleName: InsightRuleName
        var StartTime: Timestamp
        var EndTime: Timestamp
        var Period: Period
        var MaxContributorCount: InsightRuleUnboundInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Metrics: InsightRuleMetricList?
            get() = definedExternally
            set(value) = definedExternally
        var OrderBy: InsightRuleOrderBy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInsightRuleReportOutput {
        var KeyLabels: InsightRuleContributorKeyLabels?
            get() = definedExternally
            set(value) = definedExternally
        var AggregationStatistic: InsightRuleAggregationStatistic?
            get() = definedExternally
            set(value) = definedExternally
        var AggregateValue: InsightRuleUnboundDouble?
            get() = definedExternally
            set(value) = definedExternally
        var ApproximateUniqueCount: InsightRuleUnboundLong?
            get() = definedExternally
            set(value) = definedExternally
        var Contributors: InsightRuleContributors?
            get() = definedExternally
            set(value) = definedExternally
        var MetricDatapoints: InsightRuleMetricDatapoints?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMetricDataInput {
        var MetricDataQueries: MetricDataQueries
        var StartTime: Timestamp
        var EndTime: Timestamp
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var ScanBy: String /* "TimestampDescending" | "TimestampAscending" | String */
        var MaxDatapoints: GetMetricDataMaxDatapoints?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMetricDataOutput {
        var MetricDataResults: MetricDataResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Messages: MetricDataResultMessages?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMetricStatisticsInput {
        var Namespace: Namespace
        var MetricName: MetricName
        var Dimensions: Dimensions?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: Timestamp
        var EndTime: Timestamp
        var Period: Period
        var Statistics: Statistics?
            get() = definedExternally
            set(value) = definedExternally
        var ExtendedStatistics: ExtendedStatistics?
            get() = definedExternally
            set(value) = definedExternally
        var Unit: String /* "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Count" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second" | "None" | String */
    }
    interface GetMetricStatisticsOutput {
        var Label: MetricLabel?
            get() = definedExternally
            set(value) = definedExternally
        var Datapoints: Datapoints?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMetricWidgetImageInput {
        var MetricWidget: MetricWidget
        var OutputFormat: OutputFormat?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMetricWidgetImageOutput {
        var MetricWidgetImage: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InsightRule {
        var Name: InsightRuleName
        var State: InsightRuleState
        var Schema: InsightRuleSchema
        var Definition: InsightRuleDefinition
    }
    interface InsightRuleContributor {
        var Keys: InsightRuleContributorKeys
        var ApproximateAggregateValue: InsightRuleUnboundDouble
        var Datapoints: InsightRuleContributorDatapoints
    }
    interface InsightRuleContributorDatapoint {
        var Timestamp: Timestamp
        var ApproximateValue: InsightRuleUnboundDouble
    }
    interface InsightRuleMetricDatapoint {
        var Timestamp: Timestamp
        var UniqueContributors: InsightRuleUnboundDouble?
            get() = definedExternally
            set(value) = definedExternally
        var MaxContributorValue: InsightRuleUnboundDouble?
            get() = definedExternally
            set(value) = definedExternally
        var SampleCount: InsightRuleUnboundDouble?
            get() = definedExternally
            set(value) = definedExternally
        var Average: InsightRuleUnboundDouble?
            get() = definedExternally
            set(value) = definedExternally
        var Sum: InsightRuleUnboundDouble?
            get() = definedExternally
            set(value) = definedExternally
        var Minimum: InsightRuleUnboundDouble?
            get() = definedExternally
            set(value) = definedExternally
        var Maximum: InsightRuleUnboundDouble?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDashboardsInput {
        var DashboardNamePrefix: DashboardNamePrefix?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDashboardsOutput {
        var DashboardEntries: DashboardEntries?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMetricsInput {
        var Namespace: Namespace?
            get() = definedExternally
            set(value) = definedExternally
        var MetricName: MetricName?
            get() = definedExternally
            set(value) = definedExternally
        var Dimensions: DimensionFilters?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMetricsOutput {
        var Metrics: Metrics?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceInput {
        var ResourceARN: AmazonResourceName
    }
    interface ListTagsForResourceOutput {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MessageData {
        var Code: MessageDataCode?
            get() = definedExternally
            set(value) = definedExternally
        var Value: MessageDataValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Metric {
        var Namespace: Namespace?
            get() = definedExternally
            set(value) = definedExternally
        var MetricName: MetricName?
            get() = definedExternally
            set(value) = definedExternally
        var Dimensions: Dimensions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MetricAlarm {
        var AlarmName: AlarmName?
            get() = definedExternally
            set(value) = definedExternally
        var AlarmArn: AlarmArn?
            get() = definedExternally
            set(value) = definedExternally
        var AlarmDescription: AlarmDescription?
            get() = definedExternally
            set(value) = definedExternally
        var AlarmConfigurationUpdatedTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ActionsEnabled: ActionsEnabled?
            get() = definedExternally
            set(value) = definedExternally
        var OKActions: ResourceList?
            get() = definedExternally
            set(value) = definedExternally
        var AlarmActions: ResourceList?
            get() = definedExternally
            set(value) = definedExternally
        var InsufficientDataActions: ResourceList?
            get() = definedExternally
            set(value) = definedExternally
        var StateValue: String /* "OK" | "ALARM" | "INSUFFICIENT_DATA" | String */
        var StateReason: StateReason?
            get() = definedExternally
            set(value) = definedExternally
        var StateReasonData: StateReasonData?
            get() = definedExternally
            set(value) = definedExternally
        var StateUpdatedTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var MetricName: MetricName?
            get() = definedExternally
            set(value) = definedExternally
        var Namespace: Namespace?
            get() = definedExternally
            set(value) = definedExternally
        var Statistic: String /* "SampleCount" | "Average" | "Sum" | "Minimum" | "Maximum" | String */
        var ExtendedStatistic: ExtendedStatistic?
            get() = definedExternally
            set(value) = definedExternally
        var Dimensions: Dimensions?
            get() = definedExternally
            set(value) = definedExternally
        var Period: Period?
            get() = definedExternally
            set(value) = definedExternally
        var Unit: String /* "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Count" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second" | "None" | String */
        var EvaluationPeriods: EvaluationPeriods?
            get() = definedExternally
            set(value) = definedExternally
        var DatapointsToAlarm: DatapointsToAlarm?
            get() = definedExternally
            set(value) = definedExternally
        var Threshold: Threshold?
            get() = definedExternally
            set(value) = definedExternally
        var ComparisonOperator: String /* "GreaterThanOrEqualToThreshold" | "GreaterThanThreshold" | "LessThanThreshold" | "LessThanOrEqualToThreshold" | "LessThanLowerOrGreaterThanUpperThreshold" | "LessThanLowerThreshold" | "GreaterThanUpperThreshold" | String */
        var TreatMissingData: TreatMissingData?
            get() = definedExternally
            set(value) = definedExternally
        var EvaluateLowSampleCountPercentile: EvaluateLowSampleCountPercentile?
            get() = definedExternally
            set(value) = definedExternally
        var Metrics: MetricDataQueries?
            get() = definedExternally
            set(value) = definedExternally
        var ThresholdMetricId: MetricId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MetricDataQuery {
        var Id: MetricId
        var MetricStat: MetricStat?
            get() = definedExternally
            set(value) = definedExternally
        var Expression: MetricExpression?
            get() = definedExternally
            set(value) = definedExternally
        var Label: MetricLabel?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnData: ReturnData?
            get() = definedExternally
            set(value) = definedExternally
        var Period: Period?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MetricDataResult {
        var Id: MetricId?
            get() = definedExternally
            set(value) = definedExternally
        var Label: MetricLabel?
            get() = definedExternally
            set(value) = definedExternally
        var Timestamps: Timestamps?
            get() = definedExternally
            set(value) = definedExternally
        var Values: DatapointValues?
            get() = definedExternally
            set(value) = definedExternally
        var StatusCode: String /* "Complete" | "InternalError" | "PartialData" | String */
        var Messages: MetricDataResultMessages?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MetricDatum {
        var MetricName: MetricName
        var Dimensions: Dimensions?
            get() = definedExternally
            set(value) = definedExternally
        var Timestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Value: DatapointValue?
            get() = definedExternally
            set(value) = definedExternally
        var StatisticValues: StatisticSet?
            get() = definedExternally
            set(value) = definedExternally
        var Values: Values?
            get() = definedExternally
            set(value) = definedExternally
        var Counts: Counts?
            get() = definedExternally
            set(value) = definedExternally
        var Unit: String /* "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Count" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second" | "None" | String */
        var StorageResolution: StorageResolution?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MetricStat {
        var Metric: Metric
        var Period: Period
        var Stat: Stat
        var Unit: String /* "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Count" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second" | "None" | String */
    }
    interface PartialFailure {
        var FailureResource: FailureResource?
            get() = definedExternally
            set(value) = definedExternally
        var ExceptionType: ExceptionType?
            get() = definedExternally
            set(value) = definedExternally
        var FailureCode: FailureCode?
            get() = definedExternally
            set(value) = definedExternally
        var FailureDescription: FailureDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutAnomalyDetectorInput {
        var Namespace: Namespace
        var MetricName: MetricName
        var Dimensions: Dimensions?
            get() = definedExternally
            set(value) = definedExternally
        var Stat: Stat
        var Configuration: AnomalyDetectorConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutAnomalyDetectorOutput
    interface PutCompositeAlarmInput {
        var ActionsEnabled: ActionsEnabled?
            get() = definedExternally
            set(value) = definedExternally
        var AlarmActions: ResourceList?
            get() = definedExternally
            set(value) = definedExternally
        var AlarmDescription: AlarmDescription?
            get() = definedExternally
            set(value) = definedExternally
        var AlarmName: AlarmName
        var AlarmRule: AlarmRule
        var InsufficientDataActions: ResourceList?
            get() = definedExternally
            set(value) = definedExternally
        var OKActions: ResourceList?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutDashboardInput {
        var DashboardName: DashboardName
        var DashboardBody: DashboardBody
    }
    interface PutDashboardOutput {
        var DashboardValidationMessages: DashboardValidationMessages?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutInsightRuleInput {
        var RuleName: InsightRuleName
        var RuleState: InsightRuleState?
            get() = definedExternally
            set(value) = definedExternally
        var RuleDefinition: InsightRuleDefinition
    }
    interface PutInsightRuleOutput
    interface PutMetricAlarmInput {
        var AlarmName: AlarmName
        var AlarmDescription: AlarmDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ActionsEnabled: ActionsEnabled?
            get() = definedExternally
            set(value) = definedExternally
        var OKActions: ResourceList?
            get() = definedExternally
            set(value) = definedExternally
        var AlarmActions: ResourceList?
            get() = definedExternally
            set(value) = definedExternally
        var InsufficientDataActions: ResourceList?
            get() = definedExternally
            set(value) = definedExternally
        var MetricName: MetricName?
            get() = definedExternally
            set(value) = definedExternally
        var Namespace: Namespace?
            get() = definedExternally
            set(value) = definedExternally
        var Statistic: String /* "SampleCount" | "Average" | "Sum" | "Minimum" | "Maximum" | String */
        var ExtendedStatistic: ExtendedStatistic?
            get() = definedExternally
            set(value) = definedExternally
        var Dimensions: Dimensions?
            get() = definedExternally
            set(value) = definedExternally
        var Period: Period?
            get() = definedExternally
            set(value) = definedExternally
        var Unit: String /* "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Count" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second" | "None" | String */
        var EvaluationPeriods: EvaluationPeriods
        var DatapointsToAlarm: DatapointsToAlarm?
            get() = definedExternally
            set(value) = definedExternally
        var Threshold: Threshold?
            get() = definedExternally
            set(value) = definedExternally
        var ComparisonOperator: String /* "GreaterThanOrEqualToThreshold" | "GreaterThanThreshold" | "LessThanThreshold" | "LessThanOrEqualToThreshold" | "LessThanLowerOrGreaterThanUpperThreshold" | "LessThanLowerThreshold" | "GreaterThanUpperThreshold" | String */
        var TreatMissingData: TreatMissingData?
            get() = definedExternally
            set(value) = definedExternally
        var EvaluateLowSampleCountPercentile: EvaluateLowSampleCountPercentile?
            get() = definedExternally
            set(value) = definedExternally
        var Metrics: MetricDataQueries?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var ThresholdMetricId: MetricId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutMetricDataInput {
        var Namespace: Namespace
        var MetricData: MetricData
    }
    interface Range {
        var StartTime: Timestamp
        var EndTime: Timestamp
    }
    interface SetAlarmStateInput {
        var AlarmName: AlarmName
        var StateValue: String /* "OK" | "ALARM" | "INSUFFICIENT_DATA" | String */
        var StateReason: StateReason
        var StateReasonData: StateReasonData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StatisticSet {
        var SampleCount: DatapointValue
        var Sum: DatapointValue
        var Minimum: DatapointValue
        var Maximum: DatapointValue
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface TagResourceInput {
        var ResourceARN: AmazonResourceName
        var Tags: TagList
    }
    interface TagResourceOutput
    interface UntagResourceInput {
        var ResourceARN: AmazonResourceName
        var TagKeys: TagKeyList
    }
    interface UntagResourceOutput
    interface ClientApiVersions {
        var apiVersion: String /* "2010-08-01" | "latest" | String */
    }
}