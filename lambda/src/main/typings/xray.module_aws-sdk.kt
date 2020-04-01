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
import XRay.Alias
import XRay.Edge
import XRay.ErrorRootCauseEntity
import XRay.ErrorRootCauseService
import XRay.ErrorRootCause
import XRay.FaultRootCauseEntity
import XRay.FaultRootCauseService
import XRay.FaultRootCause
import XRay.GroupSummary
import XRay.HistogramEntry
import XRay.ResponseTimeRootCauseEntity
import XRay.ResponseTimeRootCauseService
import XRay.ResponseTimeRootCause
import XRay.RootCauseException
import XRay.SamplingRuleRecord
import XRay.SamplingStatisticSummary
import XRay.SamplingStatisticsDocument
import XRay.SamplingTargetDocument
import XRay.Segment
import XRay.ServiceId
import XRay.Service
import XRay.TelemetryRecord
import XRay.TimeSeriesServiceStatistics
import XRay.AvailabilityZoneDetail
import XRay.InstanceIdDetail
import XRay.Trace
import XRay.ResourceARNDetail
import XRay.TraceSummary
import XRay.TraceUser
import XRay.UnprocessedStatistics
import XRay.UnprocessedTraceSegment
import XRay.ValueWithServiceIds
import XRay.BatchGetTracesRequest
import XRay.BatchGetTracesResult
import XRay.CreateGroupRequest
import XRay.CreateGroupResult
import XRay.CreateSamplingRuleRequest
import XRay.CreateSamplingRuleResult
import XRay.DeleteGroupRequest
import XRay.DeleteGroupResult
import XRay.DeleteSamplingRuleRequest
import XRay.DeleteSamplingRuleResult
import XRay.GetEncryptionConfigRequest
import XRay.GetEncryptionConfigResult
import XRay.GetGroupRequest
import XRay.GetGroupResult
import XRay.GetGroupsRequest
import XRay.GetGroupsResult
import XRay.GetSamplingRulesRequest
import XRay.GetSamplingRulesResult
import XRay.GetSamplingStatisticSummariesRequest
import XRay.GetSamplingStatisticSummariesResult
import XRay.GetSamplingTargetsRequest
import XRay.GetSamplingTargetsResult
import XRay.GetServiceGraphRequest
import XRay.GetServiceGraphResult
import XRay.GetTimeSeriesServiceStatisticsRequest
import XRay.GetTimeSeriesServiceStatisticsResult
import XRay.GetTraceGraphRequest
import XRay.GetTraceGraphResult
import XRay.GetTraceSummariesRequest
import XRay.GetTraceSummariesResult
import XRay.PutEncryptionConfigRequest
import XRay.PutEncryptionConfigResult
import XRay.PutTelemetryRecordsRequest
import XRay.PutTelemetryRecordsResult
import XRay.PutTraceSegmentsRequest
import XRay.PutTraceSegmentsResult
import XRay.UpdateGroupRequest
import XRay.UpdateGroupResult
import XRay.UpdateSamplingRuleRequest
import XRay.UpdateSamplingRuleResult
import XRay.Group
import XRay.SamplingRule
import XRay.EdgeStatistics
import XRay.ErrorStatistics
import XRay.FaultStatistics
import XRay.EncryptionConfig
import XRay.SamplingStrategy
import XRay.AttributeMap
import XRay.ServiceStatistics
import XRay.BackendConnectionErrors
import XRay.Http
import XRay.Annotations
import XRay.SamplingRuleUpdate
import XRay.AnnotationValue
import Service as _Service

typealias AliasList = Array<Alias>

typealias AliasNames = Array<String>

typealias AnnotationKey = String

typealias AttributeKey = String

typealias AttributeValue = String

typealias Boolean = Boolean

typealias BorrowCount = Number

typealias ClientID = String

typealias Double = Number

typealias EC2InstanceId = String

typealias EdgeList = Array<Edge>

typealias EncryptionKeyId = String

typealias EntitySelectorExpression = String

typealias ErrorRootCauseEntityPath = Array<ErrorRootCauseEntity>

typealias ErrorRootCauseServices = Array<ErrorRootCauseService>

typealias ErrorRootCauses = Array<ErrorRootCause>

typealias FaultRootCauseEntityPath = Array<FaultRootCauseEntity>

typealias FaultRootCauseServices = Array<FaultRootCauseService>

typealias FaultRootCauses = Array<FaultRootCause>

typealias FilterExpression = String

typealias FixedRate = Number

typealias GetGroupsNextToken = String

typealias GroupARN = String

typealias GroupName = String

typealias GroupSummaryList = Array<GroupSummary>

typealias HTTPMethod = String

typealias Histogram = Array<HistogramEntry>

typealias Host = String

typealias Hostname = String

typealias Integer = Number

typealias NullableBoolean = Boolean

typealias NullableDouble = Number

typealias NullableInteger = Number

typealias NullableLong = Number

typealias Priority = Number

typealias RequestCount = Number

typealias ReservoirSize = Number

typealias ResourceARN = String

typealias ResponseTimeRootCauseEntityPath = Array<ResponseTimeRootCauseEntity>

typealias ResponseTimeRootCauseServices = Array<ResponseTimeRootCauseService>

typealias ResponseTimeRootCauses = Array<ResponseTimeRootCause>

typealias RootCauseExceptions = Array<RootCauseException>

typealias RuleName = String

typealias SampledCount = Number

typealias SamplingRuleRecordList = Array<SamplingRuleRecord>

typealias SamplingStatisticSummaryList = Array<SamplingStatisticSummary>

typealias SamplingStatisticsDocumentList = Array<SamplingStatisticsDocument>

typealias SamplingTargetDocumentList = Array<SamplingTargetDocument>

typealias SegmentDocument = String

typealias SegmentId = String

typealias SegmentList = Array<Segment>

typealias ServiceIds = Array<ServiceId>

typealias ServiceList = Array<Service>

typealias ServiceName = String

typealias ServiceNames = Array<String>

typealias ServiceType = String

typealias String = String

typealias TelemetryRecordList = Array<TelemetryRecord>

typealias TimeSeriesServiceStatisticsList = Array<TimeSeriesServiceStatistics>

typealias Timestamp = Date

typealias TraceAvailabilityZones = Array<AvailabilityZoneDetail>

typealias TraceId = String

typealias TraceIdList = Array<TraceId>

typealias TraceInstanceIds = Array<InstanceIdDetail>

typealias TraceList = Array<Trace>

typealias TraceResourceARNs = Array<ResourceARNDetail>

typealias TraceSegmentDocument = String

typealias TraceSegmentDocumentList = Array<TraceSegmentDocument>

typealias TraceSummaryList = Array<TraceSummary>

typealias TraceUsers = Array<TraceUser>

typealias URLPath = String

typealias UnprocessedStatisticsList = Array<UnprocessedStatistics>

typealias UnprocessedTraceIdList = Array<TraceId>

typealias UnprocessedTraceSegmentList = Array<UnprocessedTraceSegment>

typealias ValuesWithServiceIds = Array<ValueWithServiceIds>

typealias Version = Number

@JsModule("aws-sdk")
external open class XRay(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : _Service {
    open var config: ConfigBase /* Config & XRay.Types.ClientConfiguration */
    open fun batchGetTraces(params: BatchGetTracesRequest, callback: (err: AWSError, data: BatchGetTracesResult) -> Unit = definedExternally): Request<BatchGetTracesResult, AWSError>
    open fun batchGetTraces(callback: (err: AWSError, data: BatchGetTracesResult) -> Unit = definedExternally): Request<BatchGetTracesResult, AWSError>
    open fun createGroup(params: CreateGroupRequest, callback: (err: AWSError, data: CreateGroupResult) -> Unit = definedExternally): Request<CreateGroupResult, AWSError>
    open fun createGroup(callback: (err: AWSError, data: CreateGroupResult) -> Unit = definedExternally): Request<CreateGroupResult, AWSError>
    open fun createSamplingRule(params: CreateSamplingRuleRequest, callback: (err: AWSError, data: CreateSamplingRuleResult) -> Unit = definedExternally): Request<CreateSamplingRuleResult, AWSError>
    open fun createSamplingRule(callback: (err: AWSError, data: CreateSamplingRuleResult) -> Unit = definedExternally): Request<CreateSamplingRuleResult, AWSError>
    open fun deleteGroup(params: DeleteGroupRequest, callback: (err: AWSError, data: DeleteGroupResult) -> Unit = definedExternally): Request<DeleteGroupResult, AWSError>
    open fun deleteGroup(callback: (err: AWSError, data: DeleteGroupResult) -> Unit = definedExternally): Request<DeleteGroupResult, AWSError>
    open fun deleteSamplingRule(params: DeleteSamplingRuleRequest, callback: (err: AWSError, data: DeleteSamplingRuleResult) -> Unit = definedExternally): Request<DeleteSamplingRuleResult, AWSError>
    open fun deleteSamplingRule(callback: (err: AWSError, data: DeleteSamplingRuleResult) -> Unit = definedExternally): Request<DeleteSamplingRuleResult, AWSError>
    open fun getEncryptionConfig(params: GetEncryptionConfigRequest, callback: (err: AWSError, data: GetEncryptionConfigResult) -> Unit = definedExternally): Request<GetEncryptionConfigResult, AWSError>
    open fun getEncryptionConfig(callback: (err: AWSError, data: GetEncryptionConfigResult) -> Unit = definedExternally): Request<GetEncryptionConfigResult, AWSError>
    open fun getGroup(params: GetGroupRequest, callback: (err: AWSError, data: GetGroupResult) -> Unit = definedExternally): Request<GetGroupResult, AWSError>
    open fun getGroup(callback: (err: AWSError, data: GetGroupResult) -> Unit = definedExternally): Request<GetGroupResult, AWSError>
    open fun getGroups(params: GetGroupsRequest, callback: (err: AWSError, data: GetGroupsResult) -> Unit = definedExternally): Request<GetGroupsResult, AWSError>
    open fun getGroups(callback: (err: AWSError, data: GetGroupsResult) -> Unit = definedExternally): Request<GetGroupsResult, AWSError>
    open fun getSamplingRules(params: GetSamplingRulesRequest, callback: (err: AWSError, data: GetSamplingRulesResult) -> Unit = definedExternally): Request<GetSamplingRulesResult, AWSError>
    open fun getSamplingRules(callback: (err: AWSError, data: GetSamplingRulesResult) -> Unit = definedExternally): Request<GetSamplingRulesResult, AWSError>
    open fun getSamplingStatisticSummaries(params: GetSamplingStatisticSummariesRequest, callback: (err: AWSError, data: GetSamplingStatisticSummariesResult) -> Unit = definedExternally): Request<GetSamplingStatisticSummariesResult, AWSError>
    open fun getSamplingStatisticSummaries(callback: (err: AWSError, data: GetSamplingStatisticSummariesResult) -> Unit = definedExternally): Request<GetSamplingStatisticSummariesResult, AWSError>
    open fun getSamplingTargets(params: GetSamplingTargetsRequest, callback: (err: AWSError, data: GetSamplingTargetsResult) -> Unit = definedExternally): Request<GetSamplingTargetsResult, AWSError>
    open fun getSamplingTargets(callback: (err: AWSError, data: GetSamplingTargetsResult) -> Unit = definedExternally): Request<GetSamplingTargetsResult, AWSError>
    open fun getServiceGraph(params: GetServiceGraphRequest, callback: (err: AWSError, data: GetServiceGraphResult) -> Unit = definedExternally): Request<GetServiceGraphResult, AWSError>
    open fun getServiceGraph(callback: (err: AWSError, data: GetServiceGraphResult) -> Unit = definedExternally): Request<GetServiceGraphResult, AWSError>
    open fun getTimeSeriesServiceStatistics(params: GetTimeSeriesServiceStatisticsRequest, callback: (err: AWSError, data: GetTimeSeriesServiceStatisticsResult) -> Unit = definedExternally): Request<GetTimeSeriesServiceStatisticsResult, AWSError>
    open fun getTimeSeriesServiceStatistics(callback: (err: AWSError, data: GetTimeSeriesServiceStatisticsResult) -> Unit = definedExternally): Request<GetTimeSeriesServiceStatisticsResult, AWSError>
    open fun getTraceGraph(params: GetTraceGraphRequest, callback: (err: AWSError, data: GetTraceGraphResult) -> Unit = definedExternally): Request<GetTraceGraphResult, AWSError>
    open fun getTraceGraph(callback: (err: AWSError, data: GetTraceGraphResult) -> Unit = definedExternally): Request<GetTraceGraphResult, AWSError>
    open fun getTraceSummaries(params: GetTraceSummariesRequest, callback: (err: AWSError, data: GetTraceSummariesResult) -> Unit = definedExternally): Request<GetTraceSummariesResult, AWSError>
    open fun getTraceSummaries(callback: (err: AWSError, data: GetTraceSummariesResult) -> Unit = definedExternally): Request<GetTraceSummariesResult, AWSError>
    open fun putEncryptionConfig(params: PutEncryptionConfigRequest, callback: (err: AWSError, data: PutEncryptionConfigResult) -> Unit = definedExternally): Request<PutEncryptionConfigResult, AWSError>
    open fun putEncryptionConfig(callback: (err: AWSError, data: PutEncryptionConfigResult) -> Unit = definedExternally): Request<PutEncryptionConfigResult, AWSError>
    open fun putTelemetryRecords(params: PutTelemetryRecordsRequest, callback: (err: AWSError, data: PutTelemetryRecordsResult) -> Unit = definedExternally): Request<PutTelemetryRecordsResult, AWSError>
    open fun putTelemetryRecords(callback: (err: AWSError, data: PutTelemetryRecordsResult) -> Unit = definedExternally): Request<PutTelemetryRecordsResult, AWSError>
    open fun putTraceSegments(params: PutTraceSegmentsRequest, callback: (err: AWSError, data: PutTraceSegmentsResult) -> Unit = definedExternally): Request<PutTraceSegmentsResult, AWSError>
    open fun putTraceSegments(callback: (err: AWSError, data: PutTraceSegmentsResult) -> Unit = definedExternally): Request<PutTraceSegmentsResult, AWSError>
    open fun updateGroup(params: UpdateGroupRequest, callback: (err: AWSError, data: UpdateGroupResult) -> Unit = definedExternally): Request<UpdateGroupResult, AWSError>
    open fun updateGroup(callback: (err: AWSError, data: UpdateGroupResult) -> Unit = definedExternally): Request<UpdateGroupResult, AWSError>
    open fun updateSamplingRule(params: UpdateSamplingRuleRequest, callback: (err: AWSError, data: UpdateSamplingRuleResult) -> Unit = definedExternally): Request<UpdateSamplingRuleResult, AWSError>
    open fun updateSamplingRule(callback: (err: AWSError, data: UpdateSamplingRuleResult) -> Unit = definedExternally): Request<UpdateSamplingRuleResult, AWSError>
    interface Alias {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Names: AliasNames?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AnnotationValue {
        var NumberValue: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var BooleanValue: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var StringValue: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Annotations {
        @nativeGetter
        operator fun get(key: String): ValuesWithServiceIds?
        @nativeSetter
        operator fun set(key: String, value: ValuesWithServiceIds)
    }
    interface AttributeMap {
        @nativeGetter
        operator fun get(key: String): AttributeValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeValue)
    }
    interface AvailabilityZoneDetail {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BackendConnectionErrors {
        var TimeoutCount: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionRefusedCount: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var HTTPCode4XXCount: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var HTTPCode5XXCount: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var UnknownHostCount: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var OtherCount: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetTracesRequest {
        var TraceIds: TraceIdList
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetTracesResult {
        var Traces: TraceList?
            get() = definedExternally
            set(value) = definedExternally
        var UnprocessedTraceIds: UnprocessedTraceIdList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGroupRequest {
        var GroupName: GroupName
        var FilterExpression: FilterExpression?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGroupResult {
        var Group: Group?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSamplingRuleRequest {
        var SamplingRule: SamplingRule
    }
    interface CreateSamplingRuleResult {
        var SamplingRuleRecord: SamplingRuleRecord?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteGroupRequest {
        var GroupName: GroupName?
            get() = definedExternally
            set(value) = definedExternally
        var GroupARN: GroupARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteGroupResult
    interface DeleteSamplingRuleRequest {
        var RuleName: String?
            get() = definedExternally
            set(value) = definedExternally
        var RuleARN: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteSamplingRuleResult {
        var SamplingRuleRecord: SamplingRuleRecord?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Edge {
        var ReferenceId: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SummaryStatistics: EdgeStatistics?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseTimeHistogram: Histogram?
            get() = definedExternally
            set(value) = definedExternally
        var Aliases: AliasList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EdgeStatistics {
        var OkCount: NullableLong?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorStatistics: ErrorStatistics?
            get() = definedExternally
            set(value) = definedExternally
        var FaultStatistics: FaultStatistics?
            get() = definedExternally
            set(value) = definedExternally
        var TotalCount: NullableLong?
            get() = definedExternally
            set(value) = definedExternally
        var TotalResponseTime: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EncryptionConfig {
        var KeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "UPDATING" | "ACTIVE" | String */
        var Type: String /* "NONE" | "KMS" | String */
    }
    interface ErrorRootCause {
        var Services: ErrorRootCauseServices?
            get() = definedExternally
            set(value) = definedExternally
        var ClientImpacting: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ErrorRootCauseEntity {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Exceptions: RootCauseExceptions?
            get() = definedExternally
            set(value) = definedExternally
        var Remote: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ErrorRootCauseService {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Names: ServiceNames?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String?
            get() = definedExternally
            set(value) = definedExternally
        var AccountId: String?
            get() = definedExternally
            set(value) = definedExternally
        var EntityPath: ErrorRootCauseEntityPath?
            get() = definedExternally
            set(value) = definedExternally
        var Inferred: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ErrorStatistics {
        var ThrottleCount: NullableLong?
            get() = definedExternally
            set(value) = definedExternally
        var OtherCount: NullableLong?
            get() = definedExternally
            set(value) = definedExternally
        var TotalCount: NullableLong?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FaultRootCause {
        var Services: FaultRootCauseServices?
            get() = definedExternally
            set(value) = definedExternally
        var ClientImpacting: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FaultRootCauseEntity {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Exceptions: RootCauseExceptions?
            get() = definedExternally
            set(value) = definedExternally
        var Remote: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FaultRootCauseService {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Names: ServiceNames?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String?
            get() = definedExternally
            set(value) = definedExternally
        var AccountId: String?
            get() = definedExternally
            set(value) = definedExternally
        var EntityPath: FaultRootCauseEntityPath?
            get() = definedExternally
            set(value) = definedExternally
        var Inferred: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FaultStatistics {
        var OtherCount: NullableLong?
            get() = definedExternally
            set(value) = definedExternally
        var TotalCount: NullableLong?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetEncryptionConfigRequest
    interface GetEncryptionConfigResult {
        var EncryptionConfig: EncryptionConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetGroupRequest {
        var GroupName: GroupName?
            get() = definedExternally
            set(value) = definedExternally
        var GroupARN: GroupARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetGroupResult {
        var Group: Group?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetGroupsRequest {
        var NextToken: GetGroupsNextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetGroupsResult {
        var Groups: GroupSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSamplingRulesRequest {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSamplingRulesResult {
        var SamplingRuleRecords: SamplingRuleRecordList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSamplingStatisticSummariesRequest {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSamplingStatisticSummariesResult {
        var SamplingStatisticSummaries: SamplingStatisticSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSamplingTargetsRequest {
        var SamplingStatisticsDocuments: SamplingStatisticsDocumentList
    }
    interface GetSamplingTargetsResult {
        var SamplingTargetDocuments: SamplingTargetDocumentList?
            get() = definedExternally
            set(value) = definedExternally
        var LastRuleModification: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var UnprocessedStatistics: UnprocessedStatisticsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetServiceGraphRequest {
        var StartTime: Timestamp
        var EndTime: Timestamp
        var GroupName: GroupName?
            get() = definedExternally
            set(value) = definedExternally
        var GroupARN: GroupARN?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetServiceGraphResult {
        var StartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Services: ServiceList?
            get() = definedExternally
            set(value) = definedExternally
        var ContainsOldGroupVersions: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTimeSeriesServiceStatisticsRequest {
        var StartTime: Timestamp
        var EndTime: Timestamp
        var GroupName: GroupName?
            get() = definedExternally
            set(value) = definedExternally
        var GroupARN: GroupARN?
            get() = definedExternally
            set(value) = definedExternally
        var EntitySelectorExpression: EntitySelectorExpression?
            get() = definedExternally
            set(value) = definedExternally
        var Period: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTimeSeriesServiceStatisticsResult {
        var TimeSeriesServiceStatistics: TimeSeriesServiceStatisticsList?
            get() = definedExternally
            set(value) = definedExternally
        var ContainsOldGroupVersions: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTraceGraphRequest {
        var TraceIds: TraceIdList
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTraceGraphResult {
        var Services: ServiceList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTraceSummariesRequest {
        var StartTime: Timestamp
        var EndTime: Timestamp
        var TimeRangeType: String /* "TraceId" | "Event" | String */
        var Sampling: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var SamplingStrategy: SamplingStrategy?
            get() = definedExternally
            set(value) = definedExternally
        var FilterExpression: FilterExpression?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTraceSummariesResult {
        var TraceSummaries: TraceSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var ApproximateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TracesProcessedCount: NullableLong?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Group {
        var GroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var GroupARN: String?
            get() = definedExternally
            set(value) = definedExternally
        var FilterExpression: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GroupSummary {
        var GroupName: String?
            get() = definedExternally
            set(value) = definedExternally
        var GroupARN: String?
            get() = definedExternally
            set(value) = definedExternally
        var FilterExpression: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HistogramEntry {
        var Value: Double?
            get() = definedExternally
            set(value) = definedExternally
        var Count: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Http {
        var HttpURL: String?
            get() = definedExternally
            set(value) = definedExternally
        var HttpStatus: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var HttpMethod: String?
            get() = definedExternally
            set(value) = definedExternally
        var UserAgent: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClientIp: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceIdDetail {
        var Id: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutEncryptionConfigRequest {
        var KeyId: EncryptionKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "NONE" | "KMS" | String */
    }
    interface PutEncryptionConfigResult {
        var EncryptionConfig: EncryptionConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutTelemetryRecordsRequest {
        var TelemetryRecords: TelemetryRecordList
        var EC2InstanceId: EC2InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var Hostname: Hostname?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutTelemetryRecordsResult
    interface PutTraceSegmentsRequest {
        var TraceSegmentDocuments: TraceSegmentDocumentList
    }
    interface PutTraceSegmentsResult {
        var UnprocessedTraceSegments: UnprocessedTraceSegmentList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceARNDetail {
        var ARN: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResponseTimeRootCause {
        var Services: ResponseTimeRootCauseServices?
            get() = definedExternally
            set(value) = definedExternally
        var ClientImpacting: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResponseTimeRootCauseEntity {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Coverage: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var Remote: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResponseTimeRootCauseService {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Names: ServiceNames?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String?
            get() = definedExternally
            set(value) = definedExternally
        var AccountId: String?
            get() = definedExternally
            set(value) = definedExternally
        var EntityPath: ResponseTimeRootCauseEntityPath?
            get() = definedExternally
            set(value) = definedExternally
        var Inferred: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RootCauseException {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SamplingRule {
        var RuleName: RuleName?
            get() = definedExternally
            set(value) = definedExternally
        var RuleARN: String?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceARN: ResourceARN
        var Priority: Priority
        var FixedRate: FixedRate
        var ReservoirSize: ReservoirSize
        var ServiceName: ServiceName
        var ServiceType: ServiceType
        var Host: Host
        var HTTPMethod: HTTPMethod
        var URLPath: URLPath
        var Version: Version
        var Attributes: AttributeMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SamplingRuleRecord {
        var SamplingRule: SamplingRule?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ModifiedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SamplingRuleUpdate {
        var RuleName: RuleName?
            get() = definedExternally
            set(value) = definedExternally
        var RuleARN: String?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var Priority: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var FixedRate: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var ReservoirSize: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Host: Host?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceName: ServiceName?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceType: ServiceType?
            get() = definedExternally
            set(value) = definedExternally
        var HTTPMethod: HTTPMethod?
            get() = definedExternally
            set(value) = definedExternally
        var URLPath: URLPath?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: AttributeMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SamplingStatisticSummary {
        var RuleName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Timestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var RequestCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var BorrowCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var SampledCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SamplingStatisticsDocument {
        var RuleName: RuleName
        var ClientID: ClientID
        var Timestamp: Timestamp
        var RequestCount: RequestCount
        var SampledCount: SampledCount
        var BorrowCount: BorrowCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SamplingStrategy {
        var Name: String /* "PartialScan" | "FixedRate" | String */
        var Value: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SamplingTargetDocument {
        var RuleName: String?
            get() = definedExternally
            set(value) = definedExternally
        var FixedRate: Double?
            get() = definedExternally
            set(value) = definedExternally
        var ReservoirQuota: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var ReservoirQuotaTTL: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Interval: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Segment {
        var Id: SegmentId?
            get() = definedExternally
            set(value) = definedExternally
        var Document: SegmentDocument?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Service {
        var ReferenceId: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Names: ServiceNames?
            get() = definedExternally
            set(value) = definedExternally
        var Root: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var AccountId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String?
            get() = definedExternally
            set(value) = definedExternally
        var State: String?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Edges: EdgeList?
            get() = definedExternally
            set(value) = definedExternally
        var SummaryStatistics: ServiceStatistics?
            get() = definedExternally
            set(value) = definedExternally
        var DurationHistogram: Histogram?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseTimeHistogram: Histogram?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServiceId {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Names: ServiceNames?
            get() = definedExternally
            set(value) = definedExternally
        var AccountId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServiceStatistics {
        var OkCount: NullableLong?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorStatistics: ErrorStatistics?
            get() = definedExternally
            set(value) = definedExternally
        var FaultStatistics: FaultStatistics?
            get() = definedExternally
            set(value) = definedExternally
        var TotalCount: NullableLong?
            get() = definedExternally
            set(value) = definedExternally
        var TotalResponseTime: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TelemetryRecord {
        var Timestamp: Timestamp
        var SegmentsReceivedCount: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentsSentCount: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentsSpilloverCount: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentsRejectedCount: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var BackendConnectionErrors: BackendConnectionErrors?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TimeSeriesServiceStatistics {
        var Timestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EdgeSummaryStatistics: EdgeStatistics?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceSummaryStatistics: ServiceStatistics?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseTimeHistogram: Histogram?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Trace {
        var Id: TraceId?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var Segments: SegmentList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TraceSummary {
        var Id: TraceId?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseTime: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var HasFault: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var HasError: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var HasThrottle: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var IsPartial: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var Http: Http?
            get() = definedExternally
            set(value) = definedExternally
        var Annotations: Annotations?
            get() = definedExternally
            set(value) = definedExternally
        var Users: TraceUsers?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceIds: ServiceIds?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceARNs: TraceResourceARNs?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceIds: TraceInstanceIds?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZones: TraceAvailabilityZones?
            get() = definedExternally
            set(value) = definedExternally
        var EntryPoint: ServiceId?
            get() = definedExternally
            set(value) = definedExternally
        var FaultRootCauses: FaultRootCauses?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorRootCauses: ErrorRootCauses?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseTimeRootCauses: ResponseTimeRootCauses?
            get() = definedExternally
            set(value) = definedExternally
        var Revision: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var MatchedEventTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TraceUser {
        var UserName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceIds: ServiceIds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UnprocessedStatistics {
        var RuleName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UnprocessedTraceSegment {
        var Id: String?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGroupRequest {
        var GroupName: GroupName?
            get() = definedExternally
            set(value) = definedExternally
        var GroupARN: GroupARN?
            get() = definedExternally
            set(value) = definedExternally
        var FilterExpression: FilterExpression?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGroupResult {
        var Group: Group?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSamplingRuleRequest {
        var SamplingRuleUpdate: SamplingRuleUpdate
    }
    interface UpdateSamplingRuleResult {
        var SamplingRuleRecord: SamplingRuleRecord?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ValueWithServiceIds {
        var AnnotationValue: AnnotationValue?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceIds: ServiceIds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2016-04-12" | "latest" | String */
    }
}