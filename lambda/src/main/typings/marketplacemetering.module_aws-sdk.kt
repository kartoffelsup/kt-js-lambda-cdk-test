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
import MarketplaceMetering.UsageRecord
import MarketplaceMetering.UsageRecordResult
import MarketplaceMetering.BatchMeterUsageRequest
import MarketplaceMetering.BatchMeterUsageResult
import MarketplaceMetering.MeterUsageRequest
import MarketplaceMetering.MeterUsageResult
import MarketplaceMetering.RegisterUsageRequest
import MarketplaceMetering.RegisterUsageResult
import MarketplaceMetering.ResolveCustomerRequest
import MarketplaceMetering.ResolveCustomerResult

typealias Boolean = Boolean

typealias CustomerIdentifier = String

typealias NonEmptyString = String

typealias Nonce = String

typealias ProductCode = String

typealias String = String

typealias Timestamp = Date

typealias UsageDimension = String

typealias UsageQuantity = Number

typealias UsageRecordList = Array<UsageRecord>

typealias UsageRecordResultList = Array<UsageRecordResult>

typealias VersionInteger = Number

@JsModule("aws-sdk")
external open class MarketplaceMetering(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & MarketplaceMetering.Types.ClientConfiguration */
    open fun batchMeterUsage(params: BatchMeterUsageRequest, callback: (err: AWSError, data: BatchMeterUsageResult) -> Unit = definedExternally): Request<BatchMeterUsageResult, AWSError>
    open fun batchMeterUsage(callback: (err: AWSError, data: BatchMeterUsageResult) -> Unit = definedExternally): Request<BatchMeterUsageResult, AWSError>
    open fun meterUsage(params: MeterUsageRequest, callback: (err: AWSError, data: MeterUsageResult) -> Unit = definedExternally): Request<MeterUsageResult, AWSError>
    open fun meterUsage(callback: (err: AWSError, data: MeterUsageResult) -> Unit = definedExternally): Request<MeterUsageResult, AWSError>
    open fun registerUsage(params: RegisterUsageRequest, callback: (err: AWSError, data: RegisterUsageResult) -> Unit = definedExternally): Request<RegisterUsageResult, AWSError>
    open fun registerUsage(callback: (err: AWSError, data: RegisterUsageResult) -> Unit = definedExternally): Request<RegisterUsageResult, AWSError>
    open fun resolveCustomer(params: ResolveCustomerRequest, callback: (err: AWSError, data: ResolveCustomerResult) -> Unit = definedExternally): Request<ResolveCustomerResult, AWSError>
    open fun resolveCustomer(callback: (err: AWSError, data: ResolveCustomerResult) -> Unit = definedExternally): Request<ResolveCustomerResult, AWSError>
    interface BatchMeterUsageRequest {
        var UsageRecords: UsageRecordList
        var ProductCode: ProductCode
    }
    interface BatchMeterUsageResult {
        var Results: UsageRecordResultList?
            get() = definedExternally
            set(value) = definedExternally
        var UnprocessedRecords: UsageRecordList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MeterUsageRequest {
        var ProductCode: ProductCode
        var Timestamp: Timestamp
        var UsageDimension: UsageDimension
        var UsageQuantity: UsageQuantity?
            get() = definedExternally
            set(value) = definedExternally
        var DryRun: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MeterUsageResult {
        var MeteringRecordId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterUsageRequest {
        var ProductCode: ProductCode
        var PublicKeyVersion: VersionInteger
        var Nonce: Nonce?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterUsageResult {
        var PublicKeyRotationTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Signature: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResolveCustomerRequest {
        var RegistrationToken: NonEmptyString
    }
    interface ResolveCustomerResult {
        var CustomerIdentifier: CustomerIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var ProductCode: ProductCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UsageRecord {
        var Timestamp: Timestamp
        var CustomerIdentifier: CustomerIdentifier
        var Dimension: UsageDimension
        var Quantity: UsageQuantity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UsageRecordResult {
        var UsageRecord: UsageRecord?
            get() = definedExternally
            set(value) = definedExternally
        var MeteringRecordId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Success" | "CustomerNotSubscribed" | "DuplicateRecord" | String */
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2016-01-14" | "latest" | String */
    }
}