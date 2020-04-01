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
import SavingsPlans.SavingsPlanFilter
import SavingsPlans.SavingsPlan
import SavingsPlans.SavingsPlanOfferingFilterElement
import SavingsPlans.SavingsPlanOfferingProperty
import SavingsPlans.SavingsPlanOfferingRateFilterElement
import SavingsPlans.SavingsPlanOfferingRateProperty
import SavingsPlans.SavingsPlanOfferingRate
import SavingsPlans.SavingsPlanOffering
import SavingsPlans.SavingsPlanRateFilter
import SavingsPlans.SavingsPlanRate
import SavingsPlans.SavingsPlanRateProperty
import SavingsPlans.CreateSavingsPlanRequest
import SavingsPlans.CreateSavingsPlanResponse
import SavingsPlans.DescribeSavingsPlanRatesRequest
import SavingsPlans.DescribeSavingsPlanRatesResponse
import SavingsPlans.DescribeSavingsPlansRequest
import SavingsPlans.DescribeSavingsPlansResponse
import SavingsPlans.DescribeSavingsPlansOfferingRatesRequest
import SavingsPlans.DescribeSavingsPlansOfferingRatesResponse
import SavingsPlans.DescribeSavingsPlansOfferingsRequest
import SavingsPlans.DescribeSavingsPlansOfferingsResponse
import SavingsPlans.ListTagsForResourceRequest
import SavingsPlans.ListTagsForResourceResponse
import SavingsPlans.TagResourceRequest
import SavingsPlans.TagResourceResponse
import SavingsPlans.UntagResourceRequest
import SavingsPlans.UntagResourceResponse
import SavingsPlans.TagMap
import SavingsPlans.ParentSavingsPlanOffering

typealias Amount = String

typealias ClientToken = String

typealias CurrencyList = Array<String /* "CNY" | "USD" | String */>

typealias DurationsList = Array<SavingsPlansDuration>

typealias EC2InstanceFamily = String

typealias FilterValuesList = Array<JsonSafeFilterValueString>

typealias JsonSafeFilterValueString = String

typealias ListOfStrings = Array<String>

typealias MaxResults = Number

typealias PageSize = Number

typealias PaginationToken = String

typealias Region = String

typealias SavingsPlanArn = String

typealias SavingsPlanArnList = Array<SavingsPlanArn>

typealias SavingsPlanDescription = String

typealias SavingsPlanDescriptionsList = Array<SavingsPlanDescription>

typealias SavingsPlanFilterList = Array<SavingsPlanFilter>

typealias SavingsPlanId = String

typealias SavingsPlanIdList = Array<SavingsPlanId>

typealias SavingsPlanList = Array<SavingsPlan>

typealias SavingsPlanOfferingFiltersList = Array<SavingsPlanOfferingFilterElement>

typealias SavingsPlanOfferingId = String

typealias SavingsPlanOfferingPropertyList = Array<SavingsPlanOfferingProperty>

typealias SavingsPlanOfferingRateFiltersList = Array<SavingsPlanOfferingRateFilterElement>

typealias SavingsPlanOfferingRatePropertyList = Array<SavingsPlanOfferingRateProperty>

typealias SavingsPlanOfferingRatesList = Array<SavingsPlanOfferingRate>

typealias SavingsPlanOfferingsList = Array<SavingsPlanOffering>

typealias SavingsPlanOperation = String

typealias SavingsPlanOperationList = Array<SavingsPlanOperation>

typealias SavingsPlanPaymentOptionList = Array<String /* "All Upfront" | "Partial Upfront" | "No Upfront" | String */>

typealias SavingsPlanProductTypeList = Array<String /* "EC2" | "Fargate" | "Lambda" | String */>

typealias SavingsPlanRateFilterList = Array<SavingsPlanRateFilter>

typealias SavingsPlanRateList = Array<SavingsPlanRate>

typealias SavingsPlanRateOperation = String

typealias SavingsPlanRateOperationList = Array<SavingsPlanRateOperation>

typealias SavingsPlanRatePricePerUnit = String

typealias SavingsPlanRatePropertyList = Array<SavingsPlanRateProperty>

typealias SavingsPlanRateServiceCodeList = Array<String /* "AmazonEC2" | "AmazonECS" | "AWSLambda" | String */>

typealias SavingsPlanRateUsageType = String

typealias SavingsPlanRateUsageTypeList = Array<SavingsPlanRateUsageType>

typealias SavingsPlanServiceCode = String

typealias SavingsPlanServiceCodeList = Array<SavingsPlanServiceCode>

typealias SavingsPlanStateList = Array<String /* "payment-pending" | "payment-failed" | "active" | "retired" | String */>

typealias SavingsPlanTypeList = Array<String /* "Compute" | "EC2Instance" | String */>

typealias SavingsPlanUsageType = String

typealias SavingsPlanUsageTypeList = Array<SavingsPlanUsageType>

typealias SavingsPlansDuration = Number

typealias String = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagValue = String

typealias TermDurationInSeconds = Number

typealias UUID = String

typealias UUIDs = Array<UUID>

@JsModule("aws-sdk")
external open class SavingsPlans(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & SavingsPlans.Types.ClientConfiguration */
    open fun createSavingsPlan(params: CreateSavingsPlanRequest, callback: (err: AWSError, data: CreateSavingsPlanResponse) -> Unit = definedExternally): Request<CreateSavingsPlanResponse, AWSError>
    open fun createSavingsPlan(callback: (err: AWSError, data: CreateSavingsPlanResponse) -> Unit = definedExternally): Request<CreateSavingsPlanResponse, AWSError>
    open fun describeSavingsPlanRates(params: DescribeSavingsPlanRatesRequest, callback: (err: AWSError, data: DescribeSavingsPlanRatesResponse) -> Unit = definedExternally): Request<DescribeSavingsPlanRatesResponse, AWSError>
    open fun describeSavingsPlanRates(callback: (err: AWSError, data: DescribeSavingsPlanRatesResponse) -> Unit = definedExternally): Request<DescribeSavingsPlanRatesResponse, AWSError>
    open fun describeSavingsPlans(params: DescribeSavingsPlansRequest, callback: (err: AWSError, data: DescribeSavingsPlansResponse) -> Unit = definedExternally): Request<DescribeSavingsPlansResponse, AWSError>
    open fun describeSavingsPlans(callback: (err: AWSError, data: DescribeSavingsPlansResponse) -> Unit = definedExternally): Request<DescribeSavingsPlansResponse, AWSError>
    open fun describeSavingsPlansOfferingRates(params: DescribeSavingsPlansOfferingRatesRequest, callback: (err: AWSError, data: DescribeSavingsPlansOfferingRatesResponse) -> Unit = definedExternally): Request<DescribeSavingsPlansOfferingRatesResponse, AWSError>
    open fun describeSavingsPlansOfferingRates(callback: (err: AWSError, data: DescribeSavingsPlansOfferingRatesResponse) -> Unit = definedExternally): Request<DescribeSavingsPlansOfferingRatesResponse, AWSError>
    open fun describeSavingsPlansOfferings(params: DescribeSavingsPlansOfferingsRequest, callback: (err: AWSError, data: DescribeSavingsPlansOfferingsResponse) -> Unit = definedExternally): Request<DescribeSavingsPlansOfferingsResponse, AWSError>
    open fun describeSavingsPlansOfferings(callback: (err: AWSError, data: DescribeSavingsPlansOfferingsResponse) -> Unit = definedExternally): Request<DescribeSavingsPlansOfferingsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    interface CreateSavingsPlanRequest {
        var savingsPlanOfferingId: SavingsPlanOfferingId
        var commitment: Amount
        var upfrontPaymentAmount: Amount?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSavingsPlanResponse {
        var savingsPlanId: SavingsPlanId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSavingsPlanRatesRequest {
        var savingsPlanId: SavingsPlanId
        var filters: SavingsPlanRateFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSavingsPlanRatesResponse {
        var savingsPlanId: SavingsPlanId?
            get() = definedExternally
            set(value) = definedExternally
        var searchResults: SavingsPlanRateList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSavingsPlansOfferingRatesRequest {
        var savingsPlanOfferingIds: UUIDs?
            get() = definedExternally
            set(value) = definedExternally
        var savingsPlanPaymentOptions: SavingsPlanPaymentOptionList?
            get() = definedExternally
            set(value) = definedExternally
        var savingsPlanTypes: SavingsPlanTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var products: SavingsPlanProductTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var serviceCodes: SavingsPlanRateServiceCodeList?
            get() = definedExternally
            set(value) = definedExternally
        var usageTypes: SavingsPlanRateUsageTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var operations: SavingsPlanRateOperationList?
            get() = definedExternally
            set(value) = definedExternally
        var filters: SavingsPlanOfferingRateFiltersList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSavingsPlansOfferingRatesResponse {
        var searchResults: SavingsPlanOfferingRatesList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSavingsPlansOfferingsRequest {
        var offeringIds: UUIDs?
            get() = definedExternally
            set(value) = definedExternally
        var paymentOptions: SavingsPlanPaymentOptionList?
            get() = definedExternally
            set(value) = definedExternally
        var productType: String /* "EC2" | "Fargate" | "Lambda" | String */
        var planTypes: SavingsPlanTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var durations: DurationsList?
            get() = definedExternally
            set(value) = definedExternally
        var currencies: CurrencyList?
            get() = definedExternally
            set(value) = definedExternally
        var descriptions: SavingsPlanDescriptionsList?
            get() = definedExternally
            set(value) = definedExternally
        var serviceCodes: SavingsPlanServiceCodeList?
            get() = definedExternally
            set(value) = definedExternally
        var usageTypes: SavingsPlanUsageTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var operations: SavingsPlanOperationList?
            get() = definedExternally
            set(value) = definedExternally
        var filters: SavingsPlanOfferingFiltersList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSavingsPlansOfferingsResponse {
        var searchResults: SavingsPlanOfferingsList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSavingsPlansRequest {
        var savingsPlanArns: SavingsPlanArnList?
            get() = definedExternally
            set(value) = definedExternally
        var savingsPlanIds: SavingsPlanIdList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var states: SavingsPlanStateList?
            get() = definedExternally
            set(value) = definedExternally
        var filters: SavingsPlanFilterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSavingsPlansResponse {
        var savingsPlans: SavingsPlanList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var resourceArn: SavingsPlanArn
    }
    interface ListTagsForResourceResponse {
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ParentSavingsPlanOffering {
        var offeringId: UUID?
            get() = definedExternally
            set(value) = definedExternally
        var paymentOption: String /* "All Upfront" | "Partial Upfront" | "No Upfront" | String */
        var planType: String /* "Compute" | "EC2Instance" | String */
        var durationSeconds: SavingsPlansDuration?
            get() = definedExternally
            set(value) = definedExternally
        var currency: String /* "CNY" | "USD" | String */
        var planDescription: SavingsPlanDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlan {
        var offeringId: SavingsPlanOfferingId?
            get() = definedExternally
            set(value) = definedExternally
        var savingsPlanId: SavingsPlanId?
            get() = definedExternally
            set(value) = definedExternally
        var savingsPlanArn: SavingsPlanArn?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var start: String?
            get() = definedExternally
            set(value) = definedExternally
        var end: String?
            get() = definedExternally
            set(value) = definedExternally
        var state: String /* "payment-pending" | "payment-failed" | "active" | "retired" | String */
        var region: Region?
            get() = definedExternally
            set(value) = definedExternally
        var ec2InstanceFamily: EC2InstanceFamily?
            get() = definedExternally
            set(value) = definedExternally
        var savingsPlanType: String /* "Compute" | "EC2Instance" | String */
        var paymentOption: String /* "All Upfront" | "Partial Upfront" | "No Upfront" | String */
        var productTypes: SavingsPlanProductTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var currency: String /* "CNY" | "USD" | String */
        var commitment: Amount?
            get() = definedExternally
            set(value) = definedExternally
        var upfrontPaymentAmount: Amount?
            get() = definedExternally
            set(value) = definedExternally
        var recurringPaymentAmount: Amount?
            get() = definedExternally
            set(value) = definedExternally
        var termDurationInSeconds: TermDurationInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlanFilter {
        var name: String /* "region" | "ec2-instance-family" | "commitment" | "upfront" | "term" | "savings-plan-type" | "payment-option" | "start" | "end" | String */
        var values: ListOfStrings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlanOffering {
        var offeringId: UUID?
            get() = definedExternally
            set(value) = definedExternally
        var productTypes: SavingsPlanProductTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var planType: String /* "Compute" | "EC2Instance" | String */
        var description: SavingsPlanDescription?
            get() = definedExternally
            set(value) = definedExternally
        var paymentOption: String /* "All Upfront" | "Partial Upfront" | "No Upfront" | String */
        var durationSeconds: SavingsPlansDuration?
            get() = definedExternally
            set(value) = definedExternally
        var currency: String /* "CNY" | "USD" | String */
        var serviceCode: SavingsPlanServiceCode?
            get() = definedExternally
            set(value) = definedExternally
        var usageType: SavingsPlanUsageType?
            get() = definedExternally
            set(value) = definedExternally
        var operation: SavingsPlanOperation?
            get() = definedExternally
            set(value) = definedExternally
        var properties: SavingsPlanOfferingPropertyList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlanOfferingFilterElement {
        var name: String /* "region" | "instanceFamily" | String */
        var values: FilterValuesList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlanOfferingProperty {
        var name: String /* "region" | "instanceFamily" | String */
        var value: JsonSafeFilterValueString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlanOfferingRate {
        var savingsPlanOffering: ParentSavingsPlanOffering?
            get() = definedExternally
            set(value) = definedExternally
        var rate: SavingsPlanRatePricePerUnit?
            get() = definedExternally
            set(value) = definedExternally
        var unit: String /* "Hrs" | "Lambda-GB-Second" | "Request" | String */
        var productType: String /* "EC2" | "Fargate" | "Lambda" | String */
        var serviceCode: String /* "AmazonEC2" | "AmazonECS" | "AWSLambda" | String */
        var usageType: SavingsPlanRateUsageType?
            get() = definedExternally
            set(value) = definedExternally
        var operation: SavingsPlanRateOperation?
            get() = definedExternally
            set(value) = definedExternally
        var properties: SavingsPlanOfferingRatePropertyList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlanOfferingRateFilterElement {
        var name: String /* "region" | "instanceFamily" | "instanceType" | "productDescription" | "tenancy" | "productId" | String */
        var values: FilterValuesList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlanOfferingRateProperty {
        var name: JsonSafeFilterValueString?
            get() = definedExternally
            set(value) = definedExternally
        var value: JsonSafeFilterValueString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlanRate {
        var rate: Amount?
            get() = definedExternally
            set(value) = definedExternally
        var currency: String /* "CNY" | "USD" | String */
        var unit: String /* "Hrs" | "Lambda-GB-Second" | "Request" | String */
        var productType: String /* "EC2" | "Fargate" | "Lambda" | String */
        var serviceCode: String /* "AmazonEC2" | "AmazonECS" | "AWSLambda" | String */
        var usageType: SavingsPlanRateUsageType?
            get() = definedExternally
            set(value) = definedExternally
        var operation: SavingsPlanRateOperation?
            get() = definedExternally
            set(value) = definedExternally
        var properties: SavingsPlanRatePropertyList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlanRateFilter {
        var name: String /* "region" | "instanceType" | "productDescription" | "tenancy" | "productType" | "serviceCode" | "usageType" | "operation" | String */
        var values: ListOfStrings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlanRateProperty {
        var name: String /* "region" | "instanceType" | "instanceFamily" | "productDescription" | "tenancy" | String */
        var value: JsonSafeFilterValueString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagMap {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface TagResourceRequest {
        var resourceArn: SavingsPlanArn
        var tags: TagMap
    }
    interface TagResourceResponse
    interface UntagResourceRequest {
        var resourceArn: SavingsPlanArn
        var tagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface ClientApiVersions {
        var apiVersion: String /* "2019-06-28" | "latest" | String */
    }
}