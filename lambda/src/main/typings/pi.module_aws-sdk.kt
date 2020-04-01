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
import PI.DataPoint
import PI.DimensionKeyDescription
import PI.MetricKeyDataPoints
import PI.MetricQuery
import PI.ResponsePartitionKey
import PI.DescribeDimensionKeysRequest
import PI.DescribeDimensionKeysResponse
import PI.GetResourceMetricsRequest
import PI.GetResourceMetricsResponse
import PI.DimensionGroup
import PI.MetricQueryFilterMap
import PI.DimensionMap
import PI.ResponseResourceMetricKey

typealias DataPointsList = Array<DataPoint>

typealias DimensionKeyDescriptionList = Array<DimensionKeyDescription>

typealias Double = Number

typealias ISOTimestamp = Date

typealias Integer = Number

typealias Limit = Number

typealias MaxResults = Number

typealias MetricKeyDataPointsList = Array<MetricKeyDataPoints>

typealias MetricQueryList = Array<MetricQuery>

typealias MetricValuesList = Array<Double>

typealias ResponsePartitionKeyList = Array<ResponsePartitionKey>

typealias String = String

typealias StringList = Array<String>

@JsModule("aws-sdk")
external open class PI(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & PI.Types.ClientConfiguration */
    open fun describeDimensionKeys(params: DescribeDimensionKeysRequest, callback: (err: AWSError, data: DescribeDimensionKeysResponse) -> Unit = definedExternally): Request<DescribeDimensionKeysResponse, AWSError>
    open fun describeDimensionKeys(callback: (err: AWSError, data: DescribeDimensionKeysResponse) -> Unit = definedExternally): Request<DescribeDimensionKeysResponse, AWSError>
    open fun getResourceMetrics(params: GetResourceMetricsRequest, callback: (err: AWSError, data: GetResourceMetricsResponse) -> Unit = definedExternally): Request<GetResourceMetricsResponse, AWSError>
    open fun getResourceMetrics(callback: (err: AWSError, data: GetResourceMetricsResponse) -> Unit = definedExternally): Request<GetResourceMetricsResponse, AWSError>
    interface DataPoint {
        var Timestamp: ISOTimestamp
        var Value: Double
    }
    interface DescribeDimensionKeysRequest {
        var ServiceType: String /* "RDS" | String */
        var Identifier: String
        var StartTime: ISOTimestamp
        var EndTime: ISOTimestamp
        var Metric: String
        var PeriodInSeconds: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var GroupBy: DimensionGroup
        var PartitionBy: DimensionGroup?
            get() = definedExternally
            set(value) = definedExternally
        var Filter: MetricQueryFilterMap?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDimensionKeysResponse {
        var AlignedStartTime: ISOTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var AlignedEndTime: ISOTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var PartitionKeys: ResponsePartitionKeyList?
            get() = definedExternally
            set(value) = definedExternally
        var Keys: DimensionKeyDescriptionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DimensionGroup {
        var Group: String
        var Dimensions: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DimensionKeyDescription {
        var Dimensions: DimensionMap?
            get() = definedExternally
            set(value) = definedExternally
        var Total: Double?
            get() = definedExternally
            set(value) = definedExternally
        var Partitions: MetricValuesList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DimensionMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface GetResourceMetricsRequest {
        var ServiceType: String /* "RDS" | String */
        var Identifier: String
        var MetricQueries: MetricQueryList
        var StartTime: ISOTimestamp
        var EndTime: ISOTimestamp
        var PeriodInSeconds: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResourceMetricsResponse {
        var AlignedStartTime: ISOTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var AlignedEndTime: ISOTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Identifier: String?
            get() = definedExternally
            set(value) = definedExternally
        var MetricList: MetricKeyDataPointsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MetricKeyDataPoints {
        var Key: ResponseResourceMetricKey?
            get() = definedExternally
            set(value) = definedExternally
        var DataPoints: DataPointsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MetricQuery {
        var Metric: String
        var GroupBy: DimensionGroup?
            get() = definedExternally
            set(value) = definedExternally
        var Filter: MetricQueryFilterMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MetricQueryFilterMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface ResponsePartitionKey {
        var Dimensions: DimensionMap
    }
    interface ResponseResourceMetricKey {
        var Metric: String
        var Dimensions: DimensionMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-02-27" | "latest" | String */
    }
}