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
import Support.AttachmentDetails
import Support.Attachment
import Support.CaseDetails
import Support.Category
import Support.Communication
import Support.Service
import Support.SeverityLevel
import Support.TrustedAdvisorCheckDescription
import Support.TrustedAdvisorCheckRefreshStatus
import Support.TrustedAdvisorCheckSummary
import Support.TrustedAdvisorResourceDetail
import Support.AddAttachmentsToSetRequest
import Support.AddAttachmentsToSetResponse
import Support.AddCommunicationToCaseRequest
import Support.AddCommunicationToCaseResponse
import Support.CreateCaseRequest
import Support.CreateCaseResponse
import Support.DescribeAttachmentRequest
import Support.DescribeAttachmentResponse
import Support.DescribeCasesRequest
import Support.DescribeCasesResponse
import Support.DescribeCommunicationsRequest
import Support.DescribeCommunicationsResponse
import Support.DescribeServicesRequest
import Support.DescribeServicesResponse
import Support.DescribeSeverityLevelsRequest
import Support.DescribeSeverityLevelsResponse
import Support.DescribeTrustedAdvisorCheckRefreshStatusesRequest
import Support.DescribeTrustedAdvisorCheckRefreshStatusesResponse
import Support.DescribeTrustedAdvisorCheckResultRequest
import Support.DescribeTrustedAdvisorCheckResultResponse
import Support.DescribeTrustedAdvisorCheckSummariesRequest
import Support.DescribeTrustedAdvisorCheckSummariesResponse
import Support.DescribeTrustedAdvisorChecksRequest
import Support.DescribeTrustedAdvisorChecksResponse
import Support.RefreshTrustedAdvisorCheckRequest
import Support.RefreshTrustedAdvisorCheckResponse
import Support.ResolveCaseRequest
import Support.ResolveCaseResponse
import Support.RecentCaseCommunications
import Support.TrustedAdvisorCheckResult
import Support.TrustedAdvisorCostOptimizingSummary
import Support.TrustedAdvisorResourcesSummary
import Support.TrustedAdvisorCategorySpecificSummary
import Service as _Service

typealias AfterTime = String

typealias AttachmentId = String

typealias AttachmentSet = Array<AttachmentDetails>

typealias AttachmentSetId = String

typealias Attachments = Array<Attachment>

typealias BeforeTime = String

typealias Boolean = Boolean

typealias CaseId = String

typealias CaseIdList = Array<CaseId>

typealias CaseList = Array<CaseDetails>

typealias CaseStatus = String

typealias CategoryCode = String

typealias CategoryList = Array<Category>

typealias CategoryName = String

typealias CcEmailAddress = String

typealias CcEmailAddressList = Array<CcEmailAddress>

typealias CommunicationBody = String

typealias CommunicationList = Array<Communication>

typealias DisplayId = String

typealias Double = Number

typealias ExpiryTime = String

typealias FileName = String

typealias IncludeCommunications = Boolean

typealias IncludeResolvedCases = Boolean

typealias IssueType = String

typealias Language = String

typealias Long = Number

typealias MaxResults = Number

typealias NextToken = String

typealias Result = Boolean

typealias ServiceCode = String

typealias ServiceCodeList = Array<ServiceCode>

typealias ServiceList = Array<Service>

typealias ServiceName = String

typealias SeverityCode = String

typealias SeverityLevelCode = String

typealias SeverityLevelName = String

typealias SeverityLevelsList = Array<SeverityLevel>

typealias Status = String

typealias String = String

typealias StringList = Array<String>

typealias Subject = String

typealias SubmittedBy = String

typealias TimeCreated = String

typealias TrustedAdvisorCheckList = Array<TrustedAdvisorCheckDescription>

typealias TrustedAdvisorCheckRefreshStatusList = Array<TrustedAdvisorCheckRefreshStatus>

typealias TrustedAdvisorCheckSummaryList = Array<TrustedAdvisorCheckSummary>

typealias TrustedAdvisorResourceDetailList = Array<TrustedAdvisorResourceDetail>

@JsModule("aws-sdk")
external open class Support(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : _Service {
    open var config: ConfigBase /* Config & Support.Types.ClientConfiguration */
    open fun addAttachmentsToSet(params: AddAttachmentsToSetRequest, callback: (err: AWSError, data: AddAttachmentsToSetResponse) -> Unit = definedExternally): Request<AddAttachmentsToSetResponse, AWSError>
    open fun addAttachmentsToSet(callback: (err: AWSError, data: AddAttachmentsToSetResponse) -> Unit = definedExternally): Request<AddAttachmentsToSetResponse, AWSError>
    open fun addCommunicationToCase(params: AddCommunicationToCaseRequest, callback: (err: AWSError, data: AddCommunicationToCaseResponse) -> Unit = definedExternally): Request<AddCommunicationToCaseResponse, AWSError>
    open fun addCommunicationToCase(callback: (err: AWSError, data: AddCommunicationToCaseResponse) -> Unit = definedExternally): Request<AddCommunicationToCaseResponse, AWSError>
    open fun createCase(params: CreateCaseRequest, callback: (err: AWSError, data: CreateCaseResponse) -> Unit = definedExternally): Request<CreateCaseResponse, AWSError>
    open fun createCase(callback: (err: AWSError, data: CreateCaseResponse) -> Unit = definedExternally): Request<CreateCaseResponse, AWSError>
    open fun describeAttachment(params: DescribeAttachmentRequest, callback: (err: AWSError, data: DescribeAttachmentResponse) -> Unit = definedExternally): Request<DescribeAttachmentResponse, AWSError>
    open fun describeAttachment(callback: (err: AWSError, data: DescribeAttachmentResponse) -> Unit = definedExternally): Request<DescribeAttachmentResponse, AWSError>
    open fun describeCases(params: DescribeCasesRequest, callback: (err: AWSError, data: DescribeCasesResponse) -> Unit = definedExternally): Request<DescribeCasesResponse, AWSError>
    open fun describeCases(callback: (err: AWSError, data: DescribeCasesResponse) -> Unit = definedExternally): Request<DescribeCasesResponse, AWSError>
    open fun describeCommunications(params: DescribeCommunicationsRequest, callback: (err: AWSError, data: DescribeCommunicationsResponse) -> Unit = definedExternally): Request<DescribeCommunicationsResponse, AWSError>
    open fun describeCommunications(callback: (err: AWSError, data: DescribeCommunicationsResponse) -> Unit = definedExternally): Request<DescribeCommunicationsResponse, AWSError>
    open fun describeServices(params: DescribeServicesRequest, callback: (err: AWSError, data: DescribeServicesResponse) -> Unit = definedExternally): Request<DescribeServicesResponse, AWSError>
    open fun describeServices(callback: (err: AWSError, data: DescribeServicesResponse) -> Unit = definedExternally): Request<DescribeServicesResponse, AWSError>
    open fun describeSeverityLevels(params: DescribeSeverityLevelsRequest, callback: (err: AWSError, data: DescribeSeverityLevelsResponse) -> Unit = definedExternally): Request<DescribeSeverityLevelsResponse, AWSError>
    open fun describeSeverityLevels(callback: (err: AWSError, data: DescribeSeverityLevelsResponse) -> Unit = definedExternally): Request<DescribeSeverityLevelsResponse, AWSError>
    open fun describeTrustedAdvisorCheckRefreshStatuses(params: DescribeTrustedAdvisorCheckRefreshStatusesRequest, callback: (err: AWSError, data: DescribeTrustedAdvisorCheckRefreshStatusesResponse) -> Unit = definedExternally): Request<DescribeTrustedAdvisorCheckRefreshStatusesResponse, AWSError>
    open fun describeTrustedAdvisorCheckRefreshStatuses(callback: (err: AWSError, data: DescribeTrustedAdvisorCheckRefreshStatusesResponse) -> Unit = definedExternally): Request<DescribeTrustedAdvisorCheckRefreshStatusesResponse, AWSError>
    open fun describeTrustedAdvisorCheckResult(params: DescribeTrustedAdvisorCheckResultRequest, callback: (err: AWSError, data: DescribeTrustedAdvisorCheckResultResponse) -> Unit = definedExternally): Request<DescribeTrustedAdvisorCheckResultResponse, AWSError>
    open fun describeTrustedAdvisorCheckResult(callback: (err: AWSError, data: DescribeTrustedAdvisorCheckResultResponse) -> Unit = definedExternally): Request<DescribeTrustedAdvisorCheckResultResponse, AWSError>
    open fun describeTrustedAdvisorCheckSummaries(params: DescribeTrustedAdvisorCheckSummariesRequest, callback: (err: AWSError, data: DescribeTrustedAdvisorCheckSummariesResponse) -> Unit = definedExternally): Request<DescribeTrustedAdvisorCheckSummariesResponse, AWSError>
    open fun describeTrustedAdvisorCheckSummaries(callback: (err: AWSError, data: DescribeTrustedAdvisorCheckSummariesResponse) -> Unit = definedExternally): Request<DescribeTrustedAdvisorCheckSummariesResponse, AWSError>
    open fun describeTrustedAdvisorChecks(params: DescribeTrustedAdvisorChecksRequest, callback: (err: AWSError, data: DescribeTrustedAdvisorChecksResponse) -> Unit = definedExternally): Request<DescribeTrustedAdvisorChecksResponse, AWSError>
    open fun describeTrustedAdvisorChecks(callback: (err: AWSError, data: DescribeTrustedAdvisorChecksResponse) -> Unit = definedExternally): Request<DescribeTrustedAdvisorChecksResponse, AWSError>
    open fun refreshTrustedAdvisorCheck(params: RefreshTrustedAdvisorCheckRequest, callback: (err: AWSError, data: RefreshTrustedAdvisorCheckResponse) -> Unit = definedExternally): Request<RefreshTrustedAdvisorCheckResponse, AWSError>
    open fun refreshTrustedAdvisorCheck(callback: (err: AWSError, data: RefreshTrustedAdvisorCheckResponse) -> Unit = definedExternally): Request<RefreshTrustedAdvisorCheckResponse, AWSError>
    open fun resolveCase(params: ResolveCaseRequest, callback: (err: AWSError, data: ResolveCaseResponse) -> Unit = definedExternally): Request<ResolveCaseResponse, AWSError>
    open fun resolveCase(callback: (err: AWSError, data: ResolveCaseResponse) -> Unit = definedExternally): Request<ResolveCaseResponse, AWSError>
    interface AddAttachmentsToSetRequest {
        var attachmentSetId: AttachmentSetId?
            get() = definedExternally
            set(value) = definedExternally
        var attachments: Attachments
    }
    interface AddAttachmentsToSetResponse {
        var attachmentSetId: AttachmentSetId?
            get() = definedExternally
            set(value) = definedExternally
        var expiryTime: ExpiryTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddCommunicationToCaseRequest {
        var caseId: CaseId?
            get() = definedExternally
            set(value) = definedExternally
        var communicationBody: CommunicationBody
        var ccEmailAddresses: CcEmailAddressList?
            get() = definedExternally
            set(value) = definedExternally
        var attachmentSetId: AttachmentSetId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddCommunicationToCaseResponse {
        var result: Result?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Attachment {
        var fileName: FileName?
            get() = definedExternally
            set(value) = definedExternally
        var data: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttachmentDetails {
        var attachmentId: AttachmentId?
            get() = definedExternally
            set(value) = definedExternally
        var fileName: FileName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CaseDetails {
        var caseId: CaseId?
            get() = definedExternally
            set(value) = definedExternally
        var displayId: DisplayId?
            get() = definedExternally
            set(value) = definedExternally
        var subject: Subject?
            get() = definedExternally
            set(value) = definedExternally
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var serviceCode: ServiceCode?
            get() = definedExternally
            set(value) = definedExternally
        var categoryCode: CategoryCode?
            get() = definedExternally
            set(value) = definedExternally
        var severityCode: SeverityCode?
            get() = definedExternally
            set(value) = definedExternally
        var submittedBy: SubmittedBy?
            get() = definedExternally
            set(value) = definedExternally
        var timeCreated: TimeCreated?
            get() = definedExternally
            set(value) = definedExternally
        var recentCommunications: RecentCaseCommunications?
            get() = definedExternally
            set(value) = definedExternally
        var ccEmailAddresses: CcEmailAddressList?
            get() = definedExternally
            set(value) = definedExternally
        var language: Language?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Category {
        var code: CategoryCode?
            get() = definedExternally
            set(value) = definedExternally
        var name: CategoryName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Communication {
        var caseId: CaseId?
            get() = definedExternally
            set(value) = definedExternally
        var body: CommunicationBody?
            get() = definedExternally
            set(value) = definedExternally
        var submittedBy: SubmittedBy?
            get() = definedExternally
            set(value) = definedExternally
        var timeCreated: TimeCreated?
            get() = definedExternally
            set(value) = definedExternally
        var attachmentSet: AttachmentSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCaseRequest {
        var subject: Subject
        var serviceCode: ServiceCode?
            get() = definedExternally
            set(value) = definedExternally
        var severityCode: SeverityCode?
            get() = definedExternally
            set(value) = definedExternally
        var categoryCode: CategoryCode?
            get() = definedExternally
            set(value) = definedExternally
        var communicationBody: CommunicationBody
        var ccEmailAddresses: CcEmailAddressList?
            get() = definedExternally
            set(value) = definedExternally
        var language: Language?
            get() = definedExternally
            set(value) = definedExternally
        var issueType: IssueType?
            get() = definedExternally
            set(value) = definedExternally
        var attachmentSetId: AttachmentSetId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCaseResponse {
        var caseId: CaseId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAttachmentRequest {
        var attachmentId: AttachmentId
    }
    interface DescribeAttachmentResponse {
        var attachment: Attachment?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCasesRequest {
        var caseIdList: CaseIdList?
            get() = definedExternally
            set(value) = definedExternally
        var displayId: DisplayId?
            get() = definedExternally
            set(value) = definedExternally
        var afterTime: AfterTime?
            get() = definedExternally
            set(value) = definedExternally
        var beforeTime: BeforeTime?
            get() = definedExternally
            set(value) = definedExternally
        var includeResolvedCases: IncludeResolvedCases?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var language: Language?
            get() = definedExternally
            set(value) = definedExternally
        var includeCommunications: IncludeCommunications?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCasesResponse {
        var cases: CaseList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCommunicationsRequest {
        var caseId: CaseId
        var beforeTime: BeforeTime?
            get() = definedExternally
            set(value) = definedExternally
        var afterTime: AfterTime?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCommunicationsResponse {
        var communications: CommunicationList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeServicesRequest {
        var serviceCodeList: ServiceCodeList?
            get() = definedExternally
            set(value) = definedExternally
        var language: Language?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeServicesResponse {
        var services: ServiceList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSeverityLevelsRequest {
        var language: Language?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSeverityLevelsResponse {
        var severityLevels: SeverityLevelsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTrustedAdvisorCheckRefreshStatusesRequest {
        var checkIds: StringList
    }
    interface DescribeTrustedAdvisorCheckRefreshStatusesResponse {
        var statuses: TrustedAdvisorCheckRefreshStatusList
    }
    interface DescribeTrustedAdvisorCheckResultRequest {
        var checkId: String
        var language: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTrustedAdvisorCheckResultResponse {
        var result: TrustedAdvisorCheckResult?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTrustedAdvisorCheckSummariesRequest {
        var checkIds: StringList
    }
    interface DescribeTrustedAdvisorCheckSummariesResponse {
        var summaries: TrustedAdvisorCheckSummaryList
    }
    interface DescribeTrustedAdvisorChecksRequest {
        var language: String
    }
    interface DescribeTrustedAdvisorChecksResponse {
        var checks: TrustedAdvisorCheckList
    }
    interface RecentCaseCommunications {
        var communications: CommunicationList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RefreshTrustedAdvisorCheckRequest {
        var checkId: String
    }
    interface RefreshTrustedAdvisorCheckResponse {
        var status: TrustedAdvisorCheckRefreshStatus
    }
    interface ResolveCaseRequest {
        var caseId: CaseId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResolveCaseResponse {
        var initialCaseStatus: CaseStatus?
            get() = definedExternally
            set(value) = definedExternally
        var finalCaseStatus: CaseStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Service {
        var code: ServiceCode?
            get() = definedExternally
            set(value) = definedExternally
        var name: ServiceName?
            get() = definedExternally
            set(value) = definedExternally
        var categories: CategoryList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SeverityLevel {
        var code: SeverityLevelCode?
            get() = definedExternally
            set(value) = definedExternally
        var name: SeverityLevelName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrustedAdvisorCategorySpecificSummary {
        var costOptimizing: TrustedAdvisorCostOptimizingSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrustedAdvisorCheckDescription {
        var id: String
        var name: String
        var description: String
        var category: String
        var metadata: StringList
    }
    interface TrustedAdvisorCheckRefreshStatus {
        var checkId: String
        var status: String
        var millisUntilNextRefreshable: Long
    }
    interface TrustedAdvisorCheckResult {
        var checkId: String
        var timestamp: String
        var status: String
        var resourcesSummary: TrustedAdvisorResourcesSummary
        var categorySpecificSummary: TrustedAdvisorCategorySpecificSummary
        var flaggedResources: TrustedAdvisorResourceDetailList
    }
    interface TrustedAdvisorCheckSummary {
        var checkId: String
        var timestamp: String
        var status: String
        var hasFlaggedResources: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var resourcesSummary: TrustedAdvisorResourcesSummary
        var categorySpecificSummary: TrustedAdvisorCategorySpecificSummary
    }
    interface TrustedAdvisorCostOptimizingSummary {
        var estimatedMonthlySavings: Double
        var estimatedPercentMonthlySavings: Double
    }
    interface TrustedAdvisorResourceDetail {
        var status: String
        var region: String?
            get() = definedExternally
            set(value) = definedExternally
        var resourceId: String
        var isSuppressed: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var metadata: StringList
    }
    interface TrustedAdvisorResourcesSummary {
        var resourcesProcessed: Long
        var resourcesFlagged: Long
        var resourcesIgnored: Long
        var resourcesSuppressed: Long
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2013-04-15" | "latest" | String */
    }
}