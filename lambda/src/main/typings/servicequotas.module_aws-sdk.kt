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
import ServiceQuotas.RequestedServiceQuotaChange
import ServiceQuotas.ServiceInfo
import ServiceQuotas.ServiceQuotaIncreaseRequestInTemplate
import ServiceQuotas.ServiceQuota
import ServiceQuotas.AssociateServiceQuotaTemplateRequest
import ServiceQuotas.AssociateServiceQuotaTemplateResponse
import ServiceQuotas.DeleteServiceQuotaIncreaseRequestFromTemplateRequest
import ServiceQuotas.DeleteServiceQuotaIncreaseRequestFromTemplateResponse
import ServiceQuotas.DisassociateServiceQuotaTemplateRequest
import ServiceQuotas.DisassociateServiceQuotaTemplateResponse
import ServiceQuotas.GetAWSDefaultServiceQuotaRequest
import ServiceQuotas.GetAWSDefaultServiceQuotaResponse
import ServiceQuotas.GetAssociationForServiceQuotaTemplateRequest
import ServiceQuotas.GetAssociationForServiceQuotaTemplateResponse
import ServiceQuotas.GetRequestedServiceQuotaChangeRequest
import ServiceQuotas.GetRequestedServiceQuotaChangeResponse
import ServiceQuotas.GetServiceQuotaRequest
import ServiceQuotas.GetServiceQuotaResponse
import ServiceQuotas.GetServiceQuotaIncreaseRequestFromTemplateRequest
import ServiceQuotas.GetServiceQuotaIncreaseRequestFromTemplateResponse
import ServiceQuotas.ListAWSDefaultServiceQuotasRequest
import ServiceQuotas.ListAWSDefaultServiceQuotasResponse
import ServiceQuotas.ListRequestedServiceQuotaChangeHistoryRequest
import ServiceQuotas.ListRequestedServiceQuotaChangeHistoryResponse
import ServiceQuotas.ListRequestedServiceQuotaChangeHistoryByQuotaRequest
import ServiceQuotas.ListRequestedServiceQuotaChangeHistoryByQuotaResponse
import ServiceQuotas.ListServiceQuotaIncreaseRequestsInTemplateRequest
import ServiceQuotas.ListServiceQuotaIncreaseRequestsInTemplateResponse
import ServiceQuotas.ListServiceQuotasRequest
import ServiceQuotas.ListServiceQuotasResponse
import ServiceQuotas.ListServicesRequest
import ServiceQuotas.ListServicesResponse
import ServiceQuotas.PutServiceQuotaIncreaseRequestIntoTemplateRequest
import ServiceQuotas.PutServiceQuotaIncreaseRequestIntoTemplateResponse
import ServiceQuotas.RequestServiceQuotaIncreaseRequest
import ServiceQuotas.RequestServiceQuotaIncreaseResponse
import ServiceQuotas.MetricDimensionsMapDefinition
import ServiceQuotas.MetricInfo
import ServiceQuotas.QuotaPeriod
import ServiceQuotas.ErrorReason

typealias AwsRegion = String

typealias CustomerServiceEngagementId = String

typealias DateTime = Date

typealias ErrorMessage = String

typealias GlobalQuota = Boolean

typealias MaxResults = Number

typealias MetricDimensionName = String

typealias MetricDimensionValue = String

typealias NextToken = String

typealias PeriodValue = Number

typealias QuotaAdjustable = Boolean

typealias QuotaArn = String

typealias QuotaCode = String

typealias QuotaMetricName = String

typealias QuotaMetricNamespace = String

typealias QuotaName = String

typealias QuotaUnit = String

typealias QuotaValue = Number

typealias RequestId = String

typealias RequestedServiceQuotaChangeHistoryListDefinition = Array<RequestedServiceQuotaChange>

typealias Requester = String

typealias ServiceCode = String

typealias ServiceInfoListDefinition = Array<ServiceInfo>

typealias ServiceName = String

typealias ServiceQuotaIncreaseRequestInTemplateList = Array<ServiceQuotaIncreaseRequestInTemplate>

typealias ServiceQuotaListDefinition = Array<ServiceQuota>

typealias Statistic = String

@JsModule("aws-sdk")
external open class ServiceQuotas(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ServiceQuotas.Types.ClientConfiguration */
    open fun associateServiceQuotaTemplate(params: AssociateServiceQuotaTemplateRequest, callback: (err: AWSError, data: AssociateServiceQuotaTemplateResponse) -> Unit = definedExternally): Request<AssociateServiceQuotaTemplateResponse, AWSError>
    open fun associateServiceQuotaTemplate(callback: (err: AWSError, data: AssociateServiceQuotaTemplateResponse) -> Unit = definedExternally): Request<AssociateServiceQuotaTemplateResponse, AWSError>
    open fun deleteServiceQuotaIncreaseRequestFromTemplate(params: DeleteServiceQuotaIncreaseRequestFromTemplateRequest, callback: (err: AWSError, data: DeleteServiceQuotaIncreaseRequestFromTemplateResponse) -> Unit = definedExternally): Request<DeleteServiceQuotaIncreaseRequestFromTemplateResponse, AWSError>
    open fun deleteServiceQuotaIncreaseRequestFromTemplate(callback: (err: AWSError, data: DeleteServiceQuotaIncreaseRequestFromTemplateResponse) -> Unit = definedExternally): Request<DeleteServiceQuotaIncreaseRequestFromTemplateResponse, AWSError>
    open fun disassociateServiceQuotaTemplate(params: DisassociateServiceQuotaTemplateRequest, callback: (err: AWSError, data: DisassociateServiceQuotaTemplateResponse) -> Unit = definedExternally): Request<DisassociateServiceQuotaTemplateResponse, AWSError>
    open fun disassociateServiceQuotaTemplate(callback: (err: AWSError, data: DisassociateServiceQuotaTemplateResponse) -> Unit = definedExternally): Request<DisassociateServiceQuotaTemplateResponse, AWSError>
    open fun getAWSDefaultServiceQuota(params: GetAWSDefaultServiceQuotaRequest, callback: (err: AWSError, data: GetAWSDefaultServiceQuotaResponse) -> Unit = definedExternally): Request<GetAWSDefaultServiceQuotaResponse, AWSError>
    open fun getAWSDefaultServiceQuota(callback: (err: AWSError, data: GetAWSDefaultServiceQuotaResponse) -> Unit = definedExternally): Request<GetAWSDefaultServiceQuotaResponse, AWSError>
    open fun getAssociationForServiceQuotaTemplate(params: GetAssociationForServiceQuotaTemplateRequest, callback: (err: AWSError, data: GetAssociationForServiceQuotaTemplateResponse) -> Unit = definedExternally): Request<GetAssociationForServiceQuotaTemplateResponse, AWSError>
    open fun getAssociationForServiceQuotaTemplate(callback: (err: AWSError, data: GetAssociationForServiceQuotaTemplateResponse) -> Unit = definedExternally): Request<GetAssociationForServiceQuotaTemplateResponse, AWSError>
    open fun getRequestedServiceQuotaChange(params: GetRequestedServiceQuotaChangeRequest, callback: (err: AWSError, data: GetRequestedServiceQuotaChangeResponse) -> Unit = definedExternally): Request<GetRequestedServiceQuotaChangeResponse, AWSError>
    open fun getRequestedServiceQuotaChange(callback: (err: AWSError, data: GetRequestedServiceQuotaChangeResponse) -> Unit = definedExternally): Request<GetRequestedServiceQuotaChangeResponse, AWSError>
    open fun getServiceQuota(params: GetServiceQuotaRequest, callback: (err: AWSError, data: GetServiceQuotaResponse) -> Unit = definedExternally): Request<GetServiceQuotaResponse, AWSError>
    open fun getServiceQuota(callback: (err: AWSError, data: GetServiceQuotaResponse) -> Unit = definedExternally): Request<GetServiceQuotaResponse, AWSError>
    open fun getServiceQuotaIncreaseRequestFromTemplate(params: GetServiceQuotaIncreaseRequestFromTemplateRequest, callback: (err: AWSError, data: GetServiceQuotaIncreaseRequestFromTemplateResponse) -> Unit = definedExternally): Request<GetServiceQuotaIncreaseRequestFromTemplateResponse, AWSError>
    open fun getServiceQuotaIncreaseRequestFromTemplate(callback: (err: AWSError, data: GetServiceQuotaIncreaseRequestFromTemplateResponse) -> Unit = definedExternally): Request<GetServiceQuotaIncreaseRequestFromTemplateResponse, AWSError>
    open fun listAWSDefaultServiceQuotas(params: ListAWSDefaultServiceQuotasRequest, callback: (err: AWSError, data: ListAWSDefaultServiceQuotasResponse) -> Unit = definedExternally): Request<ListAWSDefaultServiceQuotasResponse, AWSError>
    open fun listAWSDefaultServiceQuotas(callback: (err: AWSError, data: ListAWSDefaultServiceQuotasResponse) -> Unit = definedExternally): Request<ListAWSDefaultServiceQuotasResponse, AWSError>
    open fun listRequestedServiceQuotaChangeHistory(params: ListRequestedServiceQuotaChangeHistoryRequest, callback: (err: AWSError, data: ListRequestedServiceQuotaChangeHistoryResponse) -> Unit = definedExternally): Request<ListRequestedServiceQuotaChangeHistoryResponse, AWSError>
    open fun listRequestedServiceQuotaChangeHistory(callback: (err: AWSError, data: ListRequestedServiceQuotaChangeHistoryResponse) -> Unit = definedExternally): Request<ListRequestedServiceQuotaChangeHistoryResponse, AWSError>
    open fun listRequestedServiceQuotaChangeHistoryByQuota(params: ListRequestedServiceQuotaChangeHistoryByQuotaRequest, callback: (err: AWSError, data: ListRequestedServiceQuotaChangeHistoryByQuotaResponse) -> Unit = definedExternally): Request<ListRequestedServiceQuotaChangeHistoryByQuotaResponse, AWSError>
    open fun listRequestedServiceQuotaChangeHistoryByQuota(callback: (err: AWSError, data: ListRequestedServiceQuotaChangeHistoryByQuotaResponse) -> Unit = definedExternally): Request<ListRequestedServiceQuotaChangeHistoryByQuotaResponse, AWSError>
    open fun listServiceQuotaIncreaseRequestsInTemplate(params: ListServiceQuotaIncreaseRequestsInTemplateRequest, callback: (err: AWSError, data: ListServiceQuotaIncreaseRequestsInTemplateResponse) -> Unit = definedExternally): Request<ListServiceQuotaIncreaseRequestsInTemplateResponse, AWSError>
    open fun listServiceQuotaIncreaseRequestsInTemplate(callback: (err: AWSError, data: ListServiceQuotaIncreaseRequestsInTemplateResponse) -> Unit = definedExternally): Request<ListServiceQuotaIncreaseRequestsInTemplateResponse, AWSError>
    open fun listServiceQuotas(params: ListServiceQuotasRequest, callback: (err: AWSError, data: ListServiceQuotasResponse) -> Unit = definedExternally): Request<ListServiceQuotasResponse, AWSError>
    open fun listServiceQuotas(callback: (err: AWSError, data: ListServiceQuotasResponse) -> Unit = definedExternally): Request<ListServiceQuotasResponse, AWSError>
    open fun listServices(params: ListServicesRequest, callback: (err: AWSError, data: ListServicesResponse) -> Unit = definedExternally): Request<ListServicesResponse, AWSError>
    open fun listServices(callback: (err: AWSError, data: ListServicesResponse) -> Unit = definedExternally): Request<ListServicesResponse, AWSError>
    open fun putServiceQuotaIncreaseRequestIntoTemplate(params: PutServiceQuotaIncreaseRequestIntoTemplateRequest, callback: (err: AWSError, data: PutServiceQuotaIncreaseRequestIntoTemplateResponse) -> Unit = definedExternally): Request<PutServiceQuotaIncreaseRequestIntoTemplateResponse, AWSError>
    open fun putServiceQuotaIncreaseRequestIntoTemplate(callback: (err: AWSError, data: PutServiceQuotaIncreaseRequestIntoTemplateResponse) -> Unit = definedExternally): Request<PutServiceQuotaIncreaseRequestIntoTemplateResponse, AWSError>
    open fun requestServiceQuotaIncrease(params: RequestServiceQuotaIncreaseRequest, callback: (err: AWSError, data: RequestServiceQuotaIncreaseResponse) -> Unit = definedExternally): Request<RequestServiceQuotaIncreaseResponse, AWSError>
    open fun requestServiceQuotaIncrease(callback: (err: AWSError, data: RequestServiceQuotaIncreaseResponse) -> Unit = definedExternally): Request<RequestServiceQuotaIncreaseResponse, AWSError>
    interface AssociateServiceQuotaTemplateRequest
    interface AssociateServiceQuotaTemplateResponse
    interface DeleteServiceQuotaIncreaseRequestFromTemplateRequest {
        var ServiceCode: ServiceCode
        var QuotaCode: QuotaCode
        var AwsRegion: AwsRegion
    }
    interface DeleteServiceQuotaIncreaseRequestFromTemplateResponse
    interface DisassociateServiceQuotaTemplateRequest
    interface DisassociateServiceQuotaTemplateResponse
    interface ErrorReason {
        var ErrorCode: String /* "DEPENDENCY_ACCESS_DENIED_ERROR" | "DEPENDENCY_THROTTLING_ERROR" | "DEPENDENCY_SERVICE_ERROR" | "SERVICE_QUOTA_NOT_AVAILABLE_ERROR" | String */
        var ErrorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAWSDefaultServiceQuotaRequest {
        var ServiceCode: ServiceCode
        var QuotaCode: QuotaCode
    }
    interface GetAWSDefaultServiceQuotaResponse {
        var Quota: ServiceQuota?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAssociationForServiceQuotaTemplateRequest
    interface GetAssociationForServiceQuotaTemplateResponse {
        var ServiceQuotaTemplateAssociationStatus: String /* "ASSOCIATED" | "DISASSOCIATED" | String */
    }
    interface GetRequestedServiceQuotaChangeRequest {
        var RequestId: RequestId
    }
    interface GetRequestedServiceQuotaChangeResponse {
        var RequestedQuota: RequestedServiceQuotaChange?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetServiceQuotaIncreaseRequestFromTemplateRequest {
        var ServiceCode: ServiceCode
        var QuotaCode: QuotaCode
        var AwsRegion: AwsRegion
    }
    interface GetServiceQuotaIncreaseRequestFromTemplateResponse {
        var ServiceQuotaIncreaseRequestInTemplate: ServiceQuotaIncreaseRequestInTemplate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetServiceQuotaRequest {
        var ServiceCode: ServiceCode
        var QuotaCode: QuotaCode
    }
    interface GetServiceQuotaResponse {
        var Quota: ServiceQuota?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAWSDefaultServiceQuotasRequest {
        var ServiceCode: ServiceCode
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAWSDefaultServiceQuotasResponse {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Quotas: ServiceQuotaListDefinition?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRequestedServiceQuotaChangeHistoryByQuotaRequest {
        var ServiceCode: ServiceCode
        var QuotaCode: QuotaCode
        var Status: String /* "PENDING" | "CASE_OPENED" | "APPROVED" | "DENIED" | "CASE_CLOSED" | String */
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRequestedServiceQuotaChangeHistoryByQuotaResponse {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var RequestedQuotas: RequestedServiceQuotaChangeHistoryListDefinition?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRequestedServiceQuotaChangeHistoryRequest {
        var ServiceCode: ServiceCode?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "CASE_OPENED" | "APPROVED" | "DENIED" | "CASE_CLOSED" | String */
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRequestedServiceQuotaChangeHistoryResponse {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var RequestedQuotas: RequestedServiceQuotaChangeHistoryListDefinition?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListServiceQuotaIncreaseRequestsInTemplateRequest {
        var ServiceCode: ServiceCode?
            get() = definedExternally
            set(value) = definedExternally
        var AwsRegion: AwsRegion?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListServiceQuotaIncreaseRequestsInTemplateResponse {
        var ServiceQuotaIncreaseRequestInTemplateList: ServiceQuotaIncreaseRequestInTemplateList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListServiceQuotasRequest {
        var ServiceCode: ServiceCode
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListServiceQuotasResponse {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Quotas: ServiceQuotaListDefinition?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListServicesRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListServicesResponse {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Services: ServiceInfoListDefinition?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MetricDimensionsMapDefinition {
        @nativeGetter
        operator fun get(key: String): MetricDimensionValue?
        @nativeSetter
        operator fun set(key: String, value: MetricDimensionValue)
    }
    interface MetricInfo {
        var MetricNamespace: QuotaMetricNamespace?
            get() = definedExternally
            set(value) = definedExternally
        var MetricName: QuotaMetricName?
            get() = definedExternally
            set(value) = definedExternally
        var MetricDimensions: MetricDimensionsMapDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var MetricStatisticRecommendation: Statistic?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutServiceQuotaIncreaseRequestIntoTemplateRequest {
        var QuotaCode: QuotaCode
        var ServiceCode: ServiceCode
        var AwsRegion: AwsRegion
        var DesiredValue: QuotaValue
    }
    interface PutServiceQuotaIncreaseRequestIntoTemplateResponse {
        var ServiceQuotaIncreaseRequestInTemplate: ServiceQuotaIncreaseRequestInTemplate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface QuotaPeriod {
        var PeriodValue: PeriodValue?
            get() = definedExternally
            set(value) = definedExternally
        var PeriodUnit: String /* "MICROSECOND" | "MILLISECOND" | "SECOND" | "MINUTE" | "HOUR" | "DAY" | "WEEK" | String */
    }
    interface RequestServiceQuotaIncreaseRequest {
        var ServiceCode: ServiceCode
        var QuotaCode: QuotaCode
        var DesiredValue: QuotaValue
    }
    interface RequestServiceQuotaIncreaseResponse {
        var RequestedQuota: RequestedServiceQuotaChange?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RequestedServiceQuotaChange {
        var Id: RequestId?
            get() = definedExternally
            set(value) = definedExternally
        var CaseId: CustomerServiceEngagementId?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceCode: ServiceCode?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceName: ServiceName?
            get() = definedExternally
            set(value) = definedExternally
        var QuotaCode: QuotaCode?
            get() = definedExternally
            set(value) = definedExternally
        var QuotaName: QuotaName?
            get() = definedExternally
            set(value) = definedExternally
        var DesiredValue: QuotaValue?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "CASE_OPENED" | "APPROVED" | "DENIED" | "CASE_CLOSED" | String */
        var Created: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdated: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Requester: Requester?
            get() = definedExternally
            set(value) = definedExternally
        var QuotaArn: QuotaArn?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalQuota: GlobalQuota?
            get() = definedExternally
            set(value) = definedExternally
        var Unit: QuotaUnit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServiceInfo {
        var ServiceCode: ServiceCode?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceName: ServiceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServiceQuota {
        var ServiceCode: ServiceCode?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceName: ServiceName?
            get() = definedExternally
            set(value) = definedExternally
        var QuotaArn: QuotaArn?
            get() = definedExternally
            set(value) = definedExternally
        var QuotaCode: QuotaCode?
            get() = definedExternally
            set(value) = definedExternally
        var QuotaName: QuotaName?
            get() = definedExternally
            set(value) = definedExternally
        var Value: QuotaValue?
            get() = definedExternally
            set(value) = definedExternally
        var Unit: QuotaUnit?
            get() = definedExternally
            set(value) = definedExternally
        var Adjustable: QuotaAdjustable?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalQuota: GlobalQuota?
            get() = definedExternally
            set(value) = definedExternally
        var UsageMetric: MetricInfo?
            get() = definedExternally
            set(value) = definedExternally
        var Period: QuotaPeriod?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorReason: ErrorReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServiceQuotaIncreaseRequestInTemplate {
        var ServiceCode: ServiceCode?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceName: ServiceName?
            get() = definedExternally
            set(value) = definedExternally
        var QuotaCode: QuotaCode?
            get() = definedExternally
            set(value) = definedExternally
        var QuotaName: QuotaName?
            get() = definedExternally
            set(value) = definedExternally
        var DesiredValue: QuotaValue?
            get() = definedExternally
            set(value) = definedExternally
        var AwsRegion: AwsRegion?
            get() = definedExternally
            set(value) = definedExternally
        var Unit: QuotaUnit?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalQuota: GlobalQuota?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-06-24" | "latest" | String */
    }
}