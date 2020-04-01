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
import ForecastQueryService.DataPoint
import ForecastQueryService.QueryForecastRequest
import ForecastQueryService.QueryForecastResponse
import ForecastQueryService.Predictions
import ForecastQueryService.Filters
import ForecastQueryService.Forecast

typealias Arn = String

typealias AttributeName = String

typealias AttributeValue = String

typealias DateTime = String

typealias Double = Number

typealias NextToken = String

typealias Statistic = String

typealias TimeSeries = Array<DataPoint>

typealias Timestamp = String

@JsModule("aws-sdk")
external open class ForecastQueryService(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ForecastQueryService.Types.ClientConfiguration */
    open fun queryForecast(params: QueryForecastRequest, callback: (err: AWSError, data: QueryForecastResponse) -> Unit = definedExternally): Request<QueryForecastResponse, AWSError>
    open fun queryForecast(callback: (err: AWSError, data: QueryForecastResponse) -> Unit = definedExternally): Request<QueryForecastResponse, AWSError>
    interface DataPoint {
        var Timestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Value: Double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Filters {
        @nativeGetter
        operator fun get(key: String): AttributeValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeValue)
    }
    interface Forecast {
        var Predictions: Predictions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Predictions {
        @nativeGetter
        operator fun get(key: String): TimeSeries?
        @nativeSetter
        operator fun set(key: String, value: TimeSeries)
    }
    interface QueryForecastRequest {
        var ForecastArn: Arn
        var StartDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var EndDate: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: Filters
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface QueryForecastResponse {
        var Forecast: Forecast?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-06-26" | "latest" | String */
    }
}