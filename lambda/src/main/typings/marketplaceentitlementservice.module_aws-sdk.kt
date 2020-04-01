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
import MarketplaceEntitlementService.Entitlement
import MarketplaceEntitlementService.GetEntitlementsRequest
import MarketplaceEntitlementService.GetEntitlementsResult
import MarketplaceEntitlementService.EntitlementValue
import MarketplaceEntitlementService.GetEntitlementFilters

typealias Boolean = Boolean

typealias Double = Number

typealias EntitlementList = Array<Entitlement>

typealias FilterValue = String

typealias FilterValueList = Array<FilterValue>

typealias Integer = Number

typealias NonEmptyString = String

typealias ProductCode = String

typealias String = String

typealias Timestamp = Date

@JsModule("aws-sdk")
external open class MarketplaceEntitlementService(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & MarketplaceEntitlementService.Types.ClientConfiguration */
    open fun getEntitlements(params: GetEntitlementsRequest, callback: (err: AWSError, data: GetEntitlementsResult) -> Unit = definedExternally): Request<GetEntitlementsResult, AWSError>
    open fun getEntitlements(callback: (err: AWSError, data: GetEntitlementsResult) -> Unit = definedExternally): Request<GetEntitlementsResult, AWSError>
    interface Entitlement {
        var ProductCode: ProductCode?
            get() = definedExternally
            set(value) = definedExternally
        var Dimension: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var CustomerIdentifier: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Value: EntitlementValue?
            get() = definedExternally
            set(value) = definedExternally
        var ExpirationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EntitlementValue {
        var IntegerValue: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var DoubleValue: Double?
            get() = definedExternally
            set(value) = definedExternally
        var BooleanValue: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var StringValue: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetEntitlementFilters {
        @nativeGetter
        operator fun get(key: String): FilterValueList?
        @nativeSetter
        operator fun set(key: String, value: FilterValueList)
    }
    interface GetEntitlementsRequest {
        var ProductCode: ProductCode
        var Filter: GetEntitlementFilters?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetEntitlementsResult {
        var Entitlements: EntitlementList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-01-11" | "latest" | String */
    }
}