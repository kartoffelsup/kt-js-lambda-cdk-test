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
import Pricing.AttributeValue
import Pricing.Filter
import Pricing.Service
import Pricing.DescribeServicesRequest
import Pricing.DescribeServicesResponse
import Pricing.GetAttributeValuesRequest
import Pricing.GetAttributeValuesResponse
import Pricing.GetProductsRequest
import Pricing.GetProductsResponse
import Service as _Service

typealias AttributeNameList = Array<String>

typealias AttributeValueList = Array<AttributeValue>

typealias BoxedInteger = Number

typealias Filters = Array<Filter>

typealias PriceList = Array<PriceListItemJSON>

typealias PriceListItemJSON = String

typealias ServiceList = Array<Service>

typealias String = String

@JsModule("aws-sdk")
external open class Pricing(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : _Service {
    open var config: ConfigBase /* Config & Pricing.Types.ClientConfiguration */
    open fun describeServices(params: DescribeServicesRequest, callback: (err: AWSError, data: DescribeServicesResponse) -> Unit = definedExternally): Request<DescribeServicesResponse, AWSError>
    open fun describeServices(callback: (err: AWSError, data: DescribeServicesResponse) -> Unit = definedExternally): Request<DescribeServicesResponse, AWSError>
    open fun getAttributeValues(params: GetAttributeValuesRequest, callback: (err: AWSError, data: GetAttributeValuesResponse) -> Unit = definedExternally): Request<GetAttributeValuesResponse, AWSError>
    open fun getAttributeValues(callback: (err: AWSError, data: GetAttributeValuesResponse) -> Unit = definedExternally): Request<GetAttributeValuesResponse, AWSError>
    open fun getProducts(params: GetProductsRequest, callback: (err: AWSError, data: GetProductsResponse) -> Unit = definedExternally): Request<GetProductsResponse, AWSError>
    open fun getProducts(callback: (err: AWSError, data: GetProductsResponse) -> Unit = definedExternally): Request<GetProductsResponse, AWSError>
    interface AttributeValue {
        var Value: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeServicesRequest {
        var ServiceCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var FormatVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeServicesResponse {
        var Services: ServiceList?
            get() = definedExternally
            set(value) = definedExternally
        var FormatVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Filter {
        var Type: String /* "TERM_MATCH" | String */
        var Field: String
        var Value: String
    }
    interface GetAttributeValuesRequest {
        var ServiceCode: String
        var AttributeName: String
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAttributeValuesResponse {
        var AttributeValues: AttributeValueList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetProductsRequest {
        var ServiceCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
        var FormatVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetProductsResponse {
        var FormatVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var PriceList: PriceList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Service {
        var ServiceCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var AttributeNames: AttributeNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-10-15" | "latest" | String */
    }
}