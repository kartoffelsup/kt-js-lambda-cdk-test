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
import MarketplaceCommerceAnalytics.GenerateDataSetRequest
import MarketplaceCommerceAnalytics.GenerateDataSetResult
import MarketplaceCommerceAnalytics.StartSupportDataExportRequest
import MarketplaceCommerceAnalytics.StartSupportDataExportResult
import MarketplaceCommerceAnalytics.CustomerDefinedValues

typealias DataSetPublicationDate = Date

typealias DataSetRequestId = String

typealias DestinationS3BucketName = String

typealias DestinationS3Prefix = String

typealias FromDate = Date

typealias OptionalKey = String

typealias OptionalValue = String

typealias RoleNameArn = String

typealias SnsTopicArn = String

@JsModule("aws-sdk")
external open class MarketplaceCommerceAnalytics(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & MarketplaceCommerceAnalytics.Types.ClientConfiguration */
    open fun generateDataSet(params: GenerateDataSetRequest, callback: (err: AWSError, data: GenerateDataSetResult) -> Unit = definedExternally): Request<GenerateDataSetResult, AWSError>
    open fun generateDataSet(callback: (err: AWSError, data: GenerateDataSetResult) -> Unit = definedExternally): Request<GenerateDataSetResult, AWSError>
    open fun startSupportDataExport(params: StartSupportDataExportRequest, callback: (err: AWSError, data: StartSupportDataExportResult) -> Unit = definedExternally): Request<StartSupportDataExportResult, AWSError>
    open fun startSupportDataExport(callback: (err: AWSError, data: StartSupportDataExportResult) -> Unit = definedExternally): Request<StartSupportDataExportResult, AWSError>
    interface CustomerDefinedValues {
        @nativeGetter
        operator fun get(key: String): OptionalValue?
        @nativeSetter
        operator fun set(key: String, value: OptionalValue)
    }
    interface GenerateDataSetRequest {
        var dataSetType: String /* "customer_subscriber_hourly_monthly_subscriptions" | "customer_subscriber_annual_subscriptions" | "daily_business_usage_by_instance_type" | "daily_business_fees" | "daily_business_free_trial_conversions" | "daily_business_new_instances" | "daily_business_new_product_subscribers" | "daily_business_canceled_product_subscribers" | "monthly_revenue_billing_and_revenue_data" | "monthly_revenue_annual_subscriptions" | "monthly_revenue_field_demonstration_usage" | "monthly_revenue_flexible_payment_schedule" | "disbursed_amount_by_product" | "disbursed_amount_by_product_with_uncollected_funds" | "disbursed_amount_by_instance_hours" | "disbursed_amount_by_customer_geo" | "disbursed_amount_by_age_of_uncollected_funds" | "disbursed_amount_by_age_of_disbursed_funds" | "disbursed_amount_by_age_of_past_due_funds" | "disbursed_amount_by_uncollected_funds_breakdown" | "customer_profile_by_industry" | "customer_profile_by_revenue" | "customer_profile_by_geography" | "sales_compensation_billed_revenue" | "us_sales_and_use_tax_records" | String */
        var dataSetPublicationDate: DataSetPublicationDate
        var roleNameArn: RoleNameArn
        var destinationS3BucketName: DestinationS3BucketName
        var destinationS3Prefix: DestinationS3Prefix?
            get() = definedExternally
            set(value) = definedExternally
        var snsTopicArn: SnsTopicArn
        var customerDefinedValues: CustomerDefinedValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GenerateDataSetResult {
        var dataSetRequestId: DataSetRequestId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartSupportDataExportRequest {
        var dataSetType: String /* "customer_support_contacts_data" | "test_customer_support_contacts_data" | String */
        var fromDate: FromDate
        var roleNameArn: RoleNameArn
        var destinationS3BucketName: DestinationS3BucketName
        var destinationS3Prefix: DestinationS3Prefix?
            get() = definedExternally
            set(value) = definedExternally
        var snsTopicArn: SnsTopicArn
        var customerDefinedValues: CustomerDefinedValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartSupportDataExportResult {
        var dataSetRequestId: DataSetRequestId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2015-07-01" | "latest" | String */
    }
}