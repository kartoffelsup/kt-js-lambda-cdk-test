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
import CostExplorer.CostCategoryReference
import CostExplorer.CostCategoryRule
import CostExplorer.CoverageByTime
import CostExplorer.DimensionValuesWithAttributes
import CostExplorer.Expression
import CostExplorer.ForecastResult
import CostExplorer.GroupDefinition
import CostExplorer.Group
import CostExplorer.ReservationCoverageGroup
import CostExplorer.ReservationPurchaseRecommendationDetail
import CostExplorer.ReservationPurchaseRecommendation
import CostExplorer.ReservationUtilizationGroup
import CostExplorer.ResultByTime
import CostExplorer.RightsizingRecommendation
import CostExplorer.SavingsPlansCoverage
import CostExplorer.SavingsPlansPurchaseRecommendationDetail
import CostExplorer.SavingsPlansUtilizationDetail
import CostExplorer.SavingsPlansUtilizationByTime
import CostExplorer.TagValues
import CostExplorer.TargetInstance
import CostExplorer.UtilizationByTime
import CostExplorer.CreateCostCategoryDefinitionRequest
import CostExplorer.CreateCostCategoryDefinitionResponse
import CostExplorer.DeleteCostCategoryDefinitionRequest
import CostExplorer.DeleteCostCategoryDefinitionResponse
import CostExplorer.DescribeCostCategoryDefinitionRequest
import CostExplorer.DescribeCostCategoryDefinitionResponse
import CostExplorer.GetCostAndUsageRequest
import CostExplorer.GetCostAndUsageResponse
import CostExplorer.GetCostAndUsageWithResourcesRequest
import CostExplorer.GetCostAndUsageWithResourcesResponse
import CostExplorer.GetCostForecastRequest
import CostExplorer.GetCostForecastResponse
import CostExplorer.GetDimensionValuesRequest
import CostExplorer.GetDimensionValuesResponse
import CostExplorer.GetReservationCoverageRequest
import CostExplorer.GetReservationCoverageResponse
import CostExplorer.GetReservationPurchaseRecommendationRequest
import CostExplorer.GetReservationPurchaseRecommendationResponse
import CostExplorer.GetReservationUtilizationRequest
import CostExplorer.GetReservationUtilizationResponse
import CostExplorer.GetRightsizingRecommendationRequest
import CostExplorer.GetRightsizingRecommendationResponse
import CostExplorer.GetSavingsPlansCoverageRequest
import CostExplorer.GetSavingsPlansCoverageResponse
import CostExplorer.GetSavingsPlansPurchaseRecommendationRequest
import CostExplorer.GetSavingsPlansPurchaseRecommendationResponse
import CostExplorer.GetSavingsPlansUtilizationRequest
import CostExplorer.GetSavingsPlansUtilizationResponse
import CostExplorer.GetSavingsPlansUtilizationDetailsRequest
import CostExplorer.GetSavingsPlansUtilizationDetailsResponse
import CostExplorer.GetTagsRequest
import CostExplorer.GetTagsResponse
import CostExplorer.GetUsageForecastRequest
import CostExplorer.GetUsageForecastResponse
import CostExplorer.ListCostCategoryDefinitionsRequest
import CostExplorer.ListCostCategoryDefinitionsResponse
import CostExplorer.UpdateCostCategoryDefinitionRequest
import CostExplorer.UpdateCostCategoryDefinitionResponse
import CostExplorer.CoverageHours
import CostExplorer.CoverageNormalizedUnits
import CostExplorer.CoverageCost
import CostExplorer.DateInterval
import CostExplorer.Coverage
import CostExplorer.ResourceDetails
import CostExplorer.ResourceUtilization
import CostExplorer.CostCategory
import CostExplorer.Attributes
import CostExplorer.DimensionValues
import CostExplorer.CostCategoryValues
import CostExplorer.MetricValue
import CostExplorer.ServiceSpecification
import CostExplorer.ReservationPurchaseRecommendationMetadata
import CostExplorer.ReservationAggregates
import CostExplorer.RightsizingRecommendationMetadata
import CostExplorer.RightsizingRecommendationSummary
import CostExplorer.SavingsPlansPurchaseRecommendationMetadata
import CostExplorer.SavingsPlansPurchaseRecommendation
import CostExplorer.SavingsPlansUtilizationAggregates
import CostExplorer.Metrics
import CostExplorer.EC2InstanceDetails
import CostExplorer.RDSInstanceDetails
import CostExplorer.RedshiftInstanceDetails
import CostExplorer.ElastiCacheInstanceDetails
import CostExplorer.ESInstanceDetails
import CostExplorer.ReservationPurchaseRecommendationSummary
import CostExplorer.InstanceDetails
import CostExplorer.EC2ResourceDetails
import CostExplorer.EC2ResourceUtilization
import CostExplorer.CurrentInstance
import CostExplorer.ModifyRecommendationDetail
import CostExplorer.TerminateRecommendationDetail
import CostExplorer.SavingsPlansCoverageData
import CostExplorer.SavingsPlansPurchaseRecommendationSummary
import CostExplorer.SavingsPlansDetails
import CostExplorer.SavingsPlansUtilization
import CostExplorer.SavingsPlansSavings
import CostExplorer.SavingsPlansAmortizedCommitment
import CostExplorer.EC2Specification

typealias AmortizedRecurringFee = String

typealias AmortizedUpfrontFee = String

typealias Arn = String

typealias AttributeType = String

typealias AttributeValue = String

typealias CostCategoryName = String

typealias CostCategoryReferencesList = Array<CostCategoryReference>

typealias CostCategoryRulesList = Array<CostCategoryRule>

typealias CostCategoryValue = String

typealias CoverageHoursPercentage = String

typealias CoverageNormalizedUnitsPercentage = String

typealias CoveragesByTime = Array<CoverageByTime>

typealias DimensionValuesWithAttributesList = Array<DimensionValuesWithAttributes>

typealias Entity = String

typealias Estimated = Boolean

typealias Expressions = Array<Expression>

typealias ForecastResultsByTime = Array<ForecastResult>

typealias GenericBoolean = Boolean

typealias GenericString = String

typealias GroupDefinitionKey = String

typealias GroupDefinitions = Array<GroupDefinition>

typealias Groups = Array<Group>

typealias Key = String

typealias Keys = Array<Key>

typealias MaxResults = Number

typealias MetricAmount = String

typealias MetricName = String

typealias MetricNames = Array<MetricName>

typealias MetricUnit = String

typealias NetRISavings = String

typealias NextPageToken = String

typealias NonNegativeInteger = Number

typealias OnDemandCost = String

typealias OnDemandCostOfRIHoursUsed = String

typealias OnDemandHours = String

typealias OnDemandNormalizedUnits = String

typealias PageSize = Number

typealias PredictionIntervalLevel = Number

typealias PurchasedHours = String

typealias PurchasedUnits = String

typealias ReservationCoverageGroups = Array<ReservationCoverageGroup>

typealias ReservationGroupKey = String

typealias ReservationGroupValue = String

typealias ReservationPurchaseRecommendationDetails = Array<ReservationPurchaseRecommendationDetail>

typealias ReservationPurchaseRecommendations = Array<ReservationPurchaseRecommendation>

typealias ReservationUtilizationGroups = Array<ReservationUtilizationGroup>

typealias ReservedHours = String

typealias ReservedNormalizedUnits = String

typealias ResultsByTime = Array<ResultByTime>

typealias RightsizingRecommendationList = Array<RightsizingRecommendation>

typealias SavingsPlanArn = String

typealias SavingsPlansCoverages = Array<SavingsPlansCoverage>

typealias SavingsPlansPurchaseRecommendationDetailList = Array<SavingsPlansPurchaseRecommendationDetail>

typealias SavingsPlansUtilizationDetails = Array<SavingsPlansUtilizationDetail>

typealias SavingsPlansUtilizationsByTime = Array<SavingsPlansUtilizationByTime>

typealias SearchString = String

typealias TagKey = String

typealias TagList = Array<Entity>

typealias TagValuesList = Array<TagValues>

typealias TargetInstancesList = Array<TargetInstance>

typealias TotalActualHours = String

typealias TotalActualUnits = String

typealias TotalAmortizedFee = String

typealias TotalPotentialRISavings = String

typealias TotalRunningHours = String

typealias TotalRunningNormalizedUnits = String

typealias UnusedHours = String

typealias UnusedUnits = String

typealias UtilizationPercentage = String

typealias UtilizationPercentageInUnits = String

typealias UtilizationsByTime = Array<UtilizationByTime>

typealias Value = String

typealias Values = Array<Value>

typealias YearMonthDay = String

typealias ZonedDateTime = String

@JsModule("aws-sdk")
external open class CostExplorer(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CostExplorer.Types.ClientConfiguration */
    open fun createCostCategoryDefinition(params: CreateCostCategoryDefinitionRequest, callback: (err: AWSError, data: CreateCostCategoryDefinitionResponse) -> Unit = definedExternally): Request<CreateCostCategoryDefinitionResponse, AWSError>
    open fun createCostCategoryDefinition(callback: (err: AWSError, data: CreateCostCategoryDefinitionResponse) -> Unit = definedExternally): Request<CreateCostCategoryDefinitionResponse, AWSError>
    open fun deleteCostCategoryDefinition(params: DeleteCostCategoryDefinitionRequest, callback: (err: AWSError, data: DeleteCostCategoryDefinitionResponse) -> Unit = definedExternally): Request<DeleteCostCategoryDefinitionResponse, AWSError>
    open fun deleteCostCategoryDefinition(callback: (err: AWSError, data: DeleteCostCategoryDefinitionResponse) -> Unit = definedExternally): Request<DeleteCostCategoryDefinitionResponse, AWSError>
    open fun describeCostCategoryDefinition(params: DescribeCostCategoryDefinitionRequest, callback: (err: AWSError, data: DescribeCostCategoryDefinitionResponse) -> Unit = definedExternally): Request<DescribeCostCategoryDefinitionResponse, AWSError>
    open fun describeCostCategoryDefinition(callback: (err: AWSError, data: DescribeCostCategoryDefinitionResponse) -> Unit = definedExternally): Request<DescribeCostCategoryDefinitionResponse, AWSError>
    open fun getCostAndUsage(params: GetCostAndUsageRequest, callback: (err: AWSError, data: GetCostAndUsageResponse) -> Unit = definedExternally): Request<GetCostAndUsageResponse, AWSError>
    open fun getCostAndUsage(callback: (err: AWSError, data: GetCostAndUsageResponse) -> Unit = definedExternally): Request<GetCostAndUsageResponse, AWSError>
    open fun getCostAndUsageWithResources(params: GetCostAndUsageWithResourcesRequest, callback: (err: AWSError, data: GetCostAndUsageWithResourcesResponse) -> Unit = definedExternally): Request<GetCostAndUsageWithResourcesResponse, AWSError>
    open fun getCostAndUsageWithResources(callback: (err: AWSError, data: GetCostAndUsageWithResourcesResponse) -> Unit = definedExternally): Request<GetCostAndUsageWithResourcesResponse, AWSError>
    open fun getCostForecast(params: GetCostForecastRequest, callback: (err: AWSError, data: GetCostForecastResponse) -> Unit = definedExternally): Request<GetCostForecastResponse, AWSError>
    open fun getCostForecast(callback: (err: AWSError, data: GetCostForecastResponse) -> Unit = definedExternally): Request<GetCostForecastResponse, AWSError>
    open fun getDimensionValues(params: GetDimensionValuesRequest, callback: (err: AWSError, data: GetDimensionValuesResponse) -> Unit = definedExternally): Request<GetDimensionValuesResponse, AWSError>
    open fun getDimensionValues(callback: (err: AWSError, data: GetDimensionValuesResponse) -> Unit = definedExternally): Request<GetDimensionValuesResponse, AWSError>
    open fun getReservationCoverage(params: GetReservationCoverageRequest, callback: (err: AWSError, data: GetReservationCoverageResponse) -> Unit = definedExternally): Request<GetReservationCoverageResponse, AWSError>
    open fun getReservationCoverage(callback: (err: AWSError, data: GetReservationCoverageResponse) -> Unit = definedExternally): Request<GetReservationCoverageResponse, AWSError>
    open fun getReservationPurchaseRecommendation(params: GetReservationPurchaseRecommendationRequest, callback: (err: AWSError, data: GetReservationPurchaseRecommendationResponse) -> Unit = definedExternally): Request<GetReservationPurchaseRecommendationResponse, AWSError>
    open fun getReservationPurchaseRecommendation(callback: (err: AWSError, data: GetReservationPurchaseRecommendationResponse) -> Unit = definedExternally): Request<GetReservationPurchaseRecommendationResponse, AWSError>
    open fun getReservationUtilization(params: GetReservationUtilizationRequest, callback: (err: AWSError, data: GetReservationUtilizationResponse) -> Unit = definedExternally): Request<GetReservationUtilizationResponse, AWSError>
    open fun getReservationUtilization(callback: (err: AWSError, data: GetReservationUtilizationResponse) -> Unit = definedExternally): Request<GetReservationUtilizationResponse, AWSError>
    open fun getRightsizingRecommendation(params: GetRightsizingRecommendationRequest, callback: (err: AWSError, data: GetRightsizingRecommendationResponse) -> Unit = definedExternally): Request<GetRightsizingRecommendationResponse, AWSError>
    open fun getRightsizingRecommendation(callback: (err: AWSError, data: GetRightsizingRecommendationResponse) -> Unit = definedExternally): Request<GetRightsizingRecommendationResponse, AWSError>
    open fun getSavingsPlansCoverage(params: GetSavingsPlansCoverageRequest, callback: (err: AWSError, data: GetSavingsPlansCoverageResponse) -> Unit = definedExternally): Request<GetSavingsPlansCoverageResponse, AWSError>
    open fun getSavingsPlansCoverage(callback: (err: AWSError, data: GetSavingsPlansCoverageResponse) -> Unit = definedExternally): Request<GetSavingsPlansCoverageResponse, AWSError>
    open fun getSavingsPlansPurchaseRecommendation(params: GetSavingsPlansPurchaseRecommendationRequest, callback: (err: AWSError, data: GetSavingsPlansPurchaseRecommendationResponse) -> Unit = definedExternally): Request<GetSavingsPlansPurchaseRecommendationResponse, AWSError>
    open fun getSavingsPlansPurchaseRecommendation(callback: (err: AWSError, data: GetSavingsPlansPurchaseRecommendationResponse) -> Unit = definedExternally): Request<GetSavingsPlansPurchaseRecommendationResponse, AWSError>
    open fun getSavingsPlansUtilization(params: GetSavingsPlansUtilizationRequest, callback: (err: AWSError, data: GetSavingsPlansUtilizationResponse) -> Unit = definedExternally): Request<GetSavingsPlansUtilizationResponse, AWSError>
    open fun getSavingsPlansUtilization(callback: (err: AWSError, data: GetSavingsPlansUtilizationResponse) -> Unit = definedExternally): Request<GetSavingsPlansUtilizationResponse, AWSError>
    open fun getSavingsPlansUtilizationDetails(params: GetSavingsPlansUtilizationDetailsRequest, callback: (err: AWSError, data: GetSavingsPlansUtilizationDetailsResponse) -> Unit = definedExternally): Request<GetSavingsPlansUtilizationDetailsResponse, AWSError>
    open fun getSavingsPlansUtilizationDetails(callback: (err: AWSError, data: GetSavingsPlansUtilizationDetailsResponse) -> Unit = definedExternally): Request<GetSavingsPlansUtilizationDetailsResponse, AWSError>
    open fun getTags(params: GetTagsRequest, callback: (err: AWSError, data: GetTagsResponse) -> Unit = definedExternally): Request<GetTagsResponse, AWSError>
    open fun getTags(callback: (err: AWSError, data: GetTagsResponse) -> Unit = definedExternally): Request<GetTagsResponse, AWSError>
    open fun getUsageForecast(params: GetUsageForecastRequest, callback: (err: AWSError, data: GetUsageForecastResponse) -> Unit = definedExternally): Request<GetUsageForecastResponse, AWSError>
    open fun getUsageForecast(callback: (err: AWSError, data: GetUsageForecastResponse) -> Unit = definedExternally): Request<GetUsageForecastResponse, AWSError>
    open fun listCostCategoryDefinitions(params: ListCostCategoryDefinitionsRequest, callback: (err: AWSError, data: ListCostCategoryDefinitionsResponse) -> Unit = definedExternally): Request<ListCostCategoryDefinitionsResponse, AWSError>
    open fun listCostCategoryDefinitions(callback: (err: AWSError, data: ListCostCategoryDefinitionsResponse) -> Unit = definedExternally): Request<ListCostCategoryDefinitionsResponse, AWSError>
    open fun updateCostCategoryDefinition(params: UpdateCostCategoryDefinitionRequest, callback: (err: AWSError, data: UpdateCostCategoryDefinitionResponse) -> Unit = definedExternally): Request<UpdateCostCategoryDefinitionResponse, AWSError>
    open fun updateCostCategoryDefinition(callback: (err: AWSError, data: UpdateCostCategoryDefinitionResponse) -> Unit = definedExternally): Request<UpdateCostCategoryDefinitionResponse, AWSError>
    interface Attributes {
        @nativeGetter
        operator fun get(key: String): AttributeValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeValue)
    }
    interface CostCategory {
        var CostCategoryArn: Arn
        var EffectiveStart: ZonedDateTime
        var EffectiveEnd: ZonedDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Name: CostCategoryName
        var RuleVersion: String /* "CostCategoryExpression.v1" | String */
        var Rules: CostCategoryRulesList
    }
    interface CostCategoryReference {
        var CostCategoryArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: CostCategoryName?
            get() = definedExternally
            set(value) = definedExternally
        var EffectiveStart: ZonedDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var EffectiveEnd: ZonedDateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CostCategoryRule {
        var Value: CostCategoryValue
        var Rule: Expression
    }
    interface CostCategoryValues {
        var Key: CostCategoryName?
            get() = definedExternally
            set(value) = definedExternally
        var Values: Values?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Coverage {
        var CoverageHours: CoverageHours?
            get() = definedExternally
            set(value) = definedExternally
        var CoverageNormalizedUnits: CoverageNormalizedUnits?
            get() = definedExternally
            set(value) = definedExternally
        var CoverageCost: CoverageCost?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CoverageByTime {
        var TimePeriod: DateInterval?
            get() = definedExternally
            set(value) = definedExternally
        var Groups: ReservationCoverageGroups?
            get() = definedExternally
            set(value) = definedExternally
        var Total: Coverage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CoverageCost {
        var OnDemandCost: OnDemandCost?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CoverageHours {
        var OnDemandHours: OnDemandHours?
            get() = definedExternally
            set(value) = definedExternally
        var ReservedHours: ReservedHours?
            get() = definedExternally
            set(value) = definedExternally
        var TotalRunningHours: TotalRunningHours?
            get() = definedExternally
            set(value) = definedExternally
        var CoverageHoursPercentage: CoverageHoursPercentage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CoverageNormalizedUnits {
        var OnDemandNormalizedUnits: OnDemandNormalizedUnits?
            get() = definedExternally
            set(value) = definedExternally
        var ReservedNormalizedUnits: ReservedNormalizedUnits?
            get() = definedExternally
            set(value) = definedExternally
        var TotalRunningNormalizedUnits: TotalRunningNormalizedUnits?
            get() = definedExternally
            set(value) = definedExternally
        var CoverageNormalizedUnitsPercentage: CoverageNormalizedUnitsPercentage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCostCategoryDefinitionRequest {
        var Name: CostCategoryName
        var RuleVersion: String /* "CostCategoryExpression.v1" | String */
        var Rules: CostCategoryRulesList
    }
    interface CreateCostCategoryDefinitionResponse {
        var CostCategoryArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var EffectiveStart: ZonedDateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CurrentInstance {
        var ResourceId: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagValuesList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceDetails: ResourceDetails?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceUtilization: ResourceUtilization?
            get() = definedExternally
            set(value) = definedExternally
        var ReservationCoveredHoursInLookbackPeriod: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var SavingsPlansCoveredHoursInLookbackPeriod: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var OnDemandHoursInLookbackPeriod: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var TotalRunningHoursInLookbackPeriod: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var MonthlyCost: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var CurrencyCode: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DateInterval {
        var Start: YearMonthDay
        var End: YearMonthDay
    }
    interface DeleteCostCategoryDefinitionRequest {
        var CostCategoryArn: Arn
    }
    interface DeleteCostCategoryDefinitionResponse {
        var CostCategoryArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var EffectiveEnd: ZonedDateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCostCategoryDefinitionRequest {
        var CostCategoryArn: Arn
        var EffectiveOn: ZonedDateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCostCategoryDefinitionResponse {
        var CostCategory: CostCategory?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DimensionValues {
        var Key: String /* "AZ" | "INSTANCE_TYPE" | "LINKED_ACCOUNT" | "OPERATION" | "PURCHASE_TYPE" | "REGION" | "SERVICE" | "USAGE_TYPE" | "USAGE_TYPE_GROUP" | "RECORD_TYPE" | "OPERATING_SYSTEM" | "TENANCY" | "SCOPE" | "PLATFORM" | "SUBSCRIPTION_ID" | "LEGAL_ENTITY_NAME" | "DEPLOYMENT_OPTION" | "DATABASE_ENGINE" | "CACHE_ENGINE" | "INSTANCE_TYPE_FAMILY" | "BILLING_ENTITY" | "RESERVATION_ID" | "RESOURCE_ID" | "RIGHTSIZING_TYPE" | "SAVINGS_PLANS_TYPE" | "SAVINGS_PLAN_ARN" | "PAYMENT_OPTION" | String */
        var Values: Values?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DimensionValuesWithAttributes {
        var Value: Value?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EC2InstanceDetails {
        var Family: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Region: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Platform: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Tenancy: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentGeneration: GenericBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var SizeFlexEligible: GenericBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EC2ResourceDetails {
        var HourlyOnDemandRate: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Platform: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Region: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Sku: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Memory: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkPerformance: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Storage: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Vcpu: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EC2ResourceUtilization {
        var MaxCpuUtilizationPercentage: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxMemoryUtilizationPercentage: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxStorageUtilizationPercentage: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EC2Specification {
        var OfferingClass: String /* "STANDARD" | "CONVERTIBLE" | String */
    }
    interface ESInstanceDetails {
        var InstanceClass: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceSize: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Region: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentGeneration: GenericBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var SizeFlexEligible: GenericBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ElastiCacheInstanceDetails {
        var Family: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var NodeType: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Region: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var ProductDescription: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentGeneration: GenericBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var SizeFlexEligible: GenericBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Expression {
        var Or: Expressions?
            get() = definedExternally
            set(value) = definedExternally
        var And: Expressions?
            get() = definedExternally
            set(value) = definedExternally
        var Not: Expression?
            get() = definedExternally
            set(value) = definedExternally
        var Dimensions: DimensionValues?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagValues?
            get() = definedExternally
            set(value) = definedExternally
        var CostCategories: CostCategoryValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ForecastResult {
        var TimePeriod: DateInterval?
            get() = definedExternally
            set(value) = definedExternally
        var MeanValue: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var PredictionIntervalLowerBound: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var PredictionIntervalUpperBound: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCostAndUsageRequest {
        var TimePeriod: DateInterval
        var Granularity: String /* "DAILY" | "MONTHLY" | "HOURLY" | String */
        var Filter: Expression?
            get() = definedExternally
            set(value) = definedExternally
        var Metrics: MetricNames?
            get() = definedExternally
            set(value) = definedExternally
        var GroupBy: GroupDefinitions?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCostAndUsageResponse {
        var NextPageToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
        var GroupDefinitions: GroupDefinitions?
            get() = definedExternally
            set(value) = definedExternally
        var ResultsByTime: ResultsByTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCostAndUsageWithResourcesRequest {
        var TimePeriod: DateInterval
        var Granularity: String /* "DAILY" | "MONTHLY" | "HOURLY" | String */
        var Filter: Expression?
            get() = definedExternally
            set(value) = definedExternally
        var Metrics: MetricNames?
            get() = definedExternally
            set(value) = definedExternally
        var GroupBy: GroupDefinitions?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCostAndUsageWithResourcesResponse {
        var NextPageToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
        var GroupDefinitions: GroupDefinitions?
            get() = definedExternally
            set(value) = definedExternally
        var ResultsByTime: ResultsByTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCostForecastRequest {
        var TimePeriod: DateInterval
        var Metric: String /* "BLENDED_COST" | "UNBLENDED_COST" | "AMORTIZED_COST" | "NET_UNBLENDED_COST" | "NET_AMORTIZED_COST" | "USAGE_QUANTITY" | "NORMALIZED_USAGE_AMOUNT" | String */
        var Granularity: String /* "DAILY" | "MONTHLY" | "HOURLY" | String */
        var Filter: Expression?
            get() = definedExternally
            set(value) = definedExternally
        var PredictionIntervalLevel: PredictionIntervalLevel?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCostForecastResponse {
        var Total: MetricValue?
            get() = definedExternally
            set(value) = definedExternally
        var ForecastResultsByTime: ForecastResultsByTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDimensionValuesRequest {
        var SearchString: SearchString?
            get() = definedExternally
            set(value) = definedExternally
        var TimePeriod: DateInterval
        var Dimension: String /* "AZ" | "INSTANCE_TYPE" | "LINKED_ACCOUNT" | "OPERATION" | "PURCHASE_TYPE" | "REGION" | "SERVICE" | "USAGE_TYPE" | "USAGE_TYPE_GROUP" | "RECORD_TYPE" | "OPERATING_SYSTEM" | "TENANCY" | "SCOPE" | "PLATFORM" | "SUBSCRIPTION_ID" | "LEGAL_ENTITY_NAME" | "DEPLOYMENT_OPTION" | "DATABASE_ENGINE" | "CACHE_ENGINE" | "INSTANCE_TYPE_FAMILY" | "BILLING_ENTITY" | "RESERVATION_ID" | "RESOURCE_ID" | "RIGHTSIZING_TYPE" | "SAVINGS_PLANS_TYPE" | "SAVINGS_PLAN_ARN" | "PAYMENT_OPTION" | String */
        var Context: String /* "COST_AND_USAGE" | "RESERVATIONS" | "SAVINGS_PLANS" | String */
        var NextPageToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDimensionValuesResponse {
        var DimensionValues: DimensionValuesWithAttributesList
        var ReturnSize: PageSize
        var TotalSize: PageSize
        var NextPageToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetReservationCoverageRequest {
        var TimePeriod: DateInterval
        var GroupBy: GroupDefinitions?
            get() = definedExternally
            set(value) = definedExternally
        var Granularity: String /* "DAILY" | "MONTHLY" | "HOURLY" | String */
        var Filter: Expression?
            get() = definedExternally
            set(value) = definedExternally
        var Metrics: MetricNames?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetReservationCoverageResponse {
        var CoveragesByTime: CoveragesByTime
        var Total: Coverage?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetReservationPurchaseRecommendationRequest {
        var AccountId: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Service: GenericString
        var AccountScope: String /* "PAYER" | "LINKED" | String */
        var LookbackPeriodInDays: String /* "SEVEN_DAYS" | "THIRTY_DAYS" | "SIXTY_DAYS" | String */
        var TermInYears: String /* "ONE_YEAR" | "THREE_YEARS" | String */
        var PaymentOption: String /* "NO_UPFRONT" | "PARTIAL_UPFRONT" | "ALL_UPFRONT" | "LIGHT_UTILIZATION" | "MEDIUM_UTILIZATION" | "HEAVY_UTILIZATION" | String */
        var ServiceSpecification: ServiceSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: NonNegativeInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetReservationPurchaseRecommendationResponse {
        var Metadata: ReservationPurchaseRecommendationMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var Recommendations: ReservationPurchaseRecommendations?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetReservationUtilizationRequest {
        var TimePeriod: DateInterval
        var GroupBy: GroupDefinitions?
            get() = definedExternally
            set(value) = definedExternally
        var Granularity: String /* "DAILY" | "MONTHLY" | "HOURLY" | String */
        var Filter: Expression?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetReservationUtilizationResponse {
        var UtilizationsByTime: UtilizationsByTime
        var Total: ReservationAggregates?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRightsizingRecommendationRequest {
        var Filter: Expression?
            get() = definedExternally
            set(value) = definedExternally
        var Service: GenericString
        var PageSize: NonNegativeInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRightsizingRecommendationResponse {
        var Metadata: RightsizingRecommendationMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var Summary: RightsizingRecommendationSummary?
            get() = definedExternally
            set(value) = definedExternally
        var RightsizingRecommendations: RightsizingRecommendationList?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSavingsPlansCoverageRequest {
        var TimePeriod: DateInterval
        var GroupBy: GroupDefinitions?
            get() = definedExternally
            set(value) = definedExternally
        var Granularity: String /* "DAILY" | "MONTHLY" | "HOURLY" | String */
        var Filter: Expression?
            get() = definedExternally
            set(value) = definedExternally
        var Metrics: MetricNames?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSavingsPlansCoverageResponse {
        var SavingsPlansCoverages: SavingsPlansCoverages
        var NextToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSavingsPlansPurchaseRecommendationRequest {
        var SavingsPlansType: String /* "COMPUTE_SP" | "EC2_INSTANCE_SP" | String */
        var TermInYears: String /* "ONE_YEAR" | "THREE_YEARS" | String */
        var PaymentOption: String /* "NO_UPFRONT" | "PARTIAL_UPFRONT" | "ALL_UPFRONT" | "LIGHT_UTILIZATION" | "MEDIUM_UTILIZATION" | "HEAVY_UTILIZATION" | String */
        var AccountScope: String /* "PAYER" | "LINKED" | String */
        var NextPageToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: NonNegativeInteger?
            get() = definedExternally
            set(value) = definedExternally
        var LookbackPeriodInDays: String /* "SEVEN_DAYS" | "THIRTY_DAYS" | "SIXTY_DAYS" | String */
        var Filter: Expression?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSavingsPlansPurchaseRecommendationResponse {
        var Metadata: SavingsPlansPurchaseRecommendationMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var SavingsPlansPurchaseRecommendation: SavingsPlansPurchaseRecommendation?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSavingsPlansUtilizationDetailsRequest {
        var TimePeriod: DateInterval
        var Filter: Expression?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSavingsPlansUtilizationDetailsResponse {
        var SavingsPlansUtilizationDetails: SavingsPlansUtilizationDetails
        var Total: SavingsPlansUtilizationAggregates?
            get() = definedExternally
            set(value) = definedExternally
        var TimePeriod: DateInterval
        var NextToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSavingsPlansUtilizationRequest {
        var TimePeriod: DateInterval
        var Granularity: String /* "DAILY" | "MONTHLY" | "HOURLY" | String */
        var Filter: Expression?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSavingsPlansUtilizationResponse {
        var SavingsPlansUtilizationsByTime: SavingsPlansUtilizationsByTime?
            get() = definedExternally
            set(value) = definedExternally
        var Total: SavingsPlansUtilizationAggregates
    }
    interface GetTagsRequest {
        var SearchString: SearchString?
            get() = definedExternally
            set(value) = definedExternally
        var TimePeriod: DateInterval
        var TagKey: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTagsResponse {
        var NextPageToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList
        var ReturnSize: PageSize
        var TotalSize: PageSize
    }
    interface GetUsageForecastRequest {
        var TimePeriod: DateInterval
        var Metric: String /* "BLENDED_COST" | "UNBLENDED_COST" | "AMORTIZED_COST" | "NET_UNBLENDED_COST" | "NET_AMORTIZED_COST" | "USAGE_QUANTITY" | "NORMALIZED_USAGE_AMOUNT" | String */
        var Granularity: String /* "DAILY" | "MONTHLY" | "HOURLY" | String */
        var Filter: Expression?
            get() = definedExternally
            set(value) = definedExternally
        var PredictionIntervalLevel: PredictionIntervalLevel?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetUsageForecastResponse {
        var Total: MetricValue?
            get() = definedExternally
            set(value) = definedExternally
        var ForecastResultsByTime: ForecastResultsByTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Group {
        var Keys: Keys?
            get() = definedExternally
            set(value) = definedExternally
        var Metrics: Metrics?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GroupDefinition {
        var Type: String /* "DIMENSION" | "TAG" | "COST_CATEGORY" | String */
        var Key: GroupDefinitionKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceDetails {
        var EC2InstanceDetails: EC2InstanceDetails?
            get() = definedExternally
            set(value) = definedExternally
        var RDSInstanceDetails: RDSInstanceDetails?
            get() = definedExternally
            set(value) = definedExternally
        var RedshiftInstanceDetails: RedshiftInstanceDetails?
            get() = definedExternally
            set(value) = definedExternally
        var ElastiCacheInstanceDetails: ElastiCacheInstanceDetails?
            get() = definedExternally
            set(value) = definedExternally
        var ESInstanceDetails: ESInstanceDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCostCategoryDefinitionsRequest {
        var EffectiveOn: ZonedDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCostCategoryDefinitionsResponse {
        var CostCategoryReferences: CostCategoryReferencesList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextPageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MetricValue {
        var Amount: MetricAmount?
            get() = definedExternally
            set(value) = definedExternally
        var Unit: MetricUnit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Metrics {
        @nativeGetter
        operator fun get(key: String): MetricValue?
        @nativeSetter
        operator fun set(key: String, value: MetricValue)
    }
    interface ModifyRecommendationDetail {
        var TargetInstances: TargetInstancesList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RDSInstanceDetails {
        var Family: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Region: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseEngine: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseEdition: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentOption: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseModel: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentGeneration: GenericBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var SizeFlexEligible: GenericBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RedshiftInstanceDetails {
        var Family: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var NodeType: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Region: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentGeneration: GenericBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var SizeFlexEligible: GenericBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReservationAggregates {
        var UtilizationPercentage: UtilizationPercentage?
            get() = definedExternally
            set(value) = definedExternally
        var UtilizationPercentageInUnits: UtilizationPercentageInUnits?
            get() = definedExternally
            set(value) = definedExternally
        var PurchasedHours: PurchasedHours?
            get() = definedExternally
            set(value) = definedExternally
        var PurchasedUnits: PurchasedUnits?
            get() = definedExternally
            set(value) = definedExternally
        var TotalActualHours: TotalActualHours?
            get() = definedExternally
            set(value) = definedExternally
        var TotalActualUnits: TotalActualUnits?
            get() = definedExternally
            set(value) = definedExternally
        var UnusedHours: UnusedHours?
            get() = definedExternally
            set(value) = definedExternally
        var UnusedUnits: UnusedUnits?
            get() = definedExternally
            set(value) = definedExternally
        var OnDemandCostOfRIHoursUsed: OnDemandCostOfRIHoursUsed?
            get() = definedExternally
            set(value) = definedExternally
        var NetRISavings: NetRISavings?
            get() = definedExternally
            set(value) = definedExternally
        var TotalPotentialRISavings: TotalPotentialRISavings?
            get() = definedExternally
            set(value) = definedExternally
        var AmortizedUpfrontFee: AmortizedUpfrontFee?
            get() = definedExternally
            set(value) = definedExternally
        var AmortizedRecurringFee: AmortizedRecurringFee?
            get() = definedExternally
            set(value) = definedExternally
        var TotalAmortizedFee: TotalAmortizedFee?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReservationCoverageGroup {
        var Attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
        var Coverage: Coverage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReservationPurchaseRecommendation {
        var AccountScope: String /* "PAYER" | "LINKED" | String */
        var LookbackPeriodInDays: String /* "SEVEN_DAYS" | "THIRTY_DAYS" | "SIXTY_DAYS" | String */
        var TermInYears: String /* "ONE_YEAR" | "THREE_YEARS" | String */
        var PaymentOption: String /* "NO_UPFRONT" | "PARTIAL_UPFRONT" | "ALL_UPFRONT" | "LIGHT_UTILIZATION" | "MEDIUM_UTILIZATION" | "HEAVY_UTILIZATION" | String */
        var ServiceSpecification: ServiceSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var RecommendationDetails: ReservationPurchaseRecommendationDetails?
            get() = definedExternally
            set(value) = definedExternally
        var RecommendationSummary: ReservationPurchaseRecommendationSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReservationPurchaseRecommendationDetail {
        var AccountId: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceDetails: InstanceDetails?
            get() = definedExternally
            set(value) = definedExternally
        var RecommendedNumberOfInstancesToPurchase: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var RecommendedNormalizedUnitsToPurchase: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var MinimumNumberOfInstancesUsedPerHour: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var MinimumNormalizedUnitsUsedPerHour: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumNumberOfInstancesUsedPerHour: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumNormalizedUnitsUsedPerHour: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var AverageNumberOfInstancesUsedPerHour: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var AverageNormalizedUnitsUsedPerHour: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var AverageUtilization: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedBreakEvenInMonths: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var CurrencyCode: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedMonthlySavingsAmount: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedMonthlySavingsPercentage: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedMonthlyOnDemandCost: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedReservationCostForLookbackPeriod: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var UpfrontCost: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var RecurringStandardMonthlyCost: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReservationPurchaseRecommendationMetadata {
        var RecommendationId: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var GenerationTimestamp: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReservationPurchaseRecommendationSummary {
        var TotalEstimatedMonthlySavingsAmount: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var TotalEstimatedMonthlySavingsPercentage: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var CurrencyCode: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReservationUtilizationGroup {
        var Key: ReservationGroupKey?
            get() = definedExternally
            set(value) = definedExternally
        var Value: ReservationGroupValue?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
        var Utilization: ReservationAggregates?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceDetails {
        var EC2ResourceDetails: EC2ResourceDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceUtilization {
        var EC2ResourceUtilization: EC2ResourceUtilization?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResultByTime {
        var TimePeriod: DateInterval?
            get() = definedExternally
            set(value) = definedExternally
        var Total: Metrics?
            get() = definedExternally
            set(value) = definedExternally
        var Groups: Groups?
            get() = definedExternally
            set(value) = definedExternally
        var Estimated: Estimated?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RightsizingRecommendation {
        var AccountId: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentInstance: CurrentInstance?
            get() = definedExternally
            set(value) = definedExternally
        var RightsizingType: String /* "TERMINATE" | "MODIFY" | String */
        var ModifyRecommendationDetail: ModifyRecommendationDetail?
            get() = definedExternally
            set(value) = definedExternally
        var TerminateRecommendationDetail: TerminateRecommendationDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RightsizingRecommendationMetadata {
        var RecommendationId: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var GenerationTimestamp: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var LookbackPeriodInDays: String /* "SEVEN_DAYS" | "THIRTY_DAYS" | "SIXTY_DAYS" | String */
    }
    interface RightsizingRecommendationSummary {
        var TotalRecommendationCount: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedTotalMonthlySavingsAmount: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var SavingsCurrencyCode: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var SavingsPercentage: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlansAmortizedCommitment {
        var AmortizedRecurringCommitment: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var AmortizedUpfrontCommitment: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var TotalAmortizedCommitment: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlansCoverage {
        var Attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
        var Coverage: SavingsPlansCoverageData?
            get() = definedExternally
            set(value) = definedExternally
        var TimePeriod: DateInterval?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlansCoverageData {
        var SpendCoveredBySavingsPlans: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var OnDemandCost: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var TotalCost: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var CoveragePercentage: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlansDetails {
        var Region: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceFamily: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingId: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlansPurchaseRecommendation {
        var AccountScope: String /* "PAYER" | "LINKED" | String */
        var SavingsPlansType: String /* "COMPUTE_SP" | "EC2_INSTANCE_SP" | String */
        var TermInYears: String /* "ONE_YEAR" | "THREE_YEARS" | String */
        var PaymentOption: String /* "NO_UPFRONT" | "PARTIAL_UPFRONT" | "ALL_UPFRONT" | "LIGHT_UTILIZATION" | "MEDIUM_UTILIZATION" | "HEAVY_UTILIZATION" | String */
        var LookbackPeriodInDays: String /* "SEVEN_DAYS" | "THIRTY_DAYS" | "SIXTY_DAYS" | String */
        var SavingsPlansPurchaseRecommendationDetails: SavingsPlansPurchaseRecommendationDetailList?
            get() = definedExternally
            set(value) = definedExternally
        var SavingsPlansPurchaseRecommendationSummary: SavingsPlansPurchaseRecommendationSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlansPurchaseRecommendationDetail {
        var SavingsPlansDetails: SavingsPlansDetails?
            get() = definedExternally
            set(value) = definedExternally
        var AccountId: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var UpfrontCost: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedROI: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var CurrencyCode: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedSPCost: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedOnDemandCost: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedOnDemandCostWithCurrentCommitment: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedSavingsAmount: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedSavingsPercentage: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var HourlyCommitmentToPurchase: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedAverageUtilization: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedMonthlySavingsAmount: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentMinimumHourlyOnDemandSpend: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentMaximumHourlyOnDemandSpend: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentAverageHourlyOnDemandSpend: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlansPurchaseRecommendationMetadata {
        var RecommendationId: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var GenerationTimestamp: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlansPurchaseRecommendationSummary {
        var EstimatedROI: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var CurrencyCode: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedTotalCost: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentOnDemandSpend: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedSavingsAmount: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var TotalRecommendationCount: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var DailyCommitmentToPurchase: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var HourlyCommitmentToPurchase: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedSavingsPercentage: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedMonthlySavingsAmount: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedOnDemandCostWithCurrentCommitment: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlansSavings {
        var NetSavings: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var OnDemandCostEquivalent: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlansUtilization {
        var TotalCommitment: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var UsedCommitment: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var UnusedCommitment: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var UtilizationPercentage: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlansUtilizationAggregates {
        var Utilization: SavingsPlansUtilization
        var Savings: SavingsPlansSavings?
            get() = definedExternally
            set(value) = definedExternally
        var AmortizedCommitment: SavingsPlansAmortizedCommitment?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlansUtilizationByTime {
        var TimePeriod: DateInterval
        var Utilization: SavingsPlansUtilization
        var Savings: SavingsPlansSavings?
            get() = definedExternally
            set(value) = definedExternally
        var AmortizedCommitment: SavingsPlansAmortizedCommitment?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SavingsPlansUtilizationDetail {
        var SavingsPlanArn: SavingsPlanArn?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
        var Utilization: SavingsPlansUtilization?
            get() = definedExternally
            set(value) = definedExternally
        var Savings: SavingsPlansSavings?
            get() = definedExternally
            set(value) = definedExternally
        var AmortizedCommitment: SavingsPlansAmortizedCommitment?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServiceSpecification {
        var EC2Specification: EC2Specification?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagValues {
        var Key: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var Values: Values?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TargetInstance {
        var EstimatedMonthlyCost: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedMonthlySavings: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var CurrencyCode: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultTargetInstance: GenericBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceDetails: ResourceDetails?
            get() = definedExternally
            set(value) = definedExternally
        var ExpectedResourceUtilization: ResourceUtilization?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TerminateRecommendationDetail {
        var EstimatedMonthlySavings: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var CurrencyCode: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateCostCategoryDefinitionRequest {
        var CostCategoryArn: Arn
        var RuleVersion: String /* "CostCategoryExpression.v1" | String */
        var Rules: CostCategoryRulesList
    }
    interface UpdateCostCategoryDefinitionResponse {
        var CostCategoryArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var EffectiveStart: ZonedDateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UtilizationByTime {
        var TimePeriod: DateInterval?
            get() = definedExternally
            set(value) = definedExternally
        var Groups: ReservationUtilizationGroups?
            get() = definedExternally
            set(value) = definedExternally
        var Total: ReservationAggregates?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-10-25" | "latest" | String */
    }
}