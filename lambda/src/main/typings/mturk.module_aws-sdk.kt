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
import MTurk.Assignment
import MTurk.BonusPayment
import MTurk.HITLayoutParameter
import MTurk.HIT
import MTurk.Locale
import MTurk.NotifyWorkersFailureStatus
import MTurk.ParameterMapEntry
import MTurk.PolicyParameter
import MTurk.Qualification
import MTurk.QualificationRequest
import MTurk.QualificationRequirement
import MTurk.QualificationType
import MTurk.ReviewActionDetail
import MTurk.ReviewResultDetail
import MTurk.WorkerBlock
import MTurk.AcceptQualificationRequestRequest
import MTurk.AcceptQualificationRequestResponse
import MTurk.ApproveAssignmentRequest
import MTurk.ApproveAssignmentResponse
import MTurk.AssociateQualificationWithWorkerRequest
import MTurk.AssociateQualificationWithWorkerResponse
import MTurk.CreateAdditionalAssignmentsForHITRequest
import MTurk.CreateAdditionalAssignmentsForHITResponse
import MTurk.CreateHITRequest
import MTurk.CreateHITResponse
import MTurk.CreateHITTypeRequest
import MTurk.CreateHITTypeResponse
import MTurk.CreateHITWithHITTypeRequest
import MTurk.CreateHITWithHITTypeResponse
import MTurk.CreateQualificationTypeRequest
import MTurk.CreateQualificationTypeResponse
import MTurk.CreateWorkerBlockRequest
import MTurk.CreateWorkerBlockResponse
import MTurk.DeleteHITRequest
import MTurk.DeleteHITResponse
import MTurk.DeleteQualificationTypeRequest
import MTurk.DeleteQualificationTypeResponse
import MTurk.DeleteWorkerBlockRequest
import MTurk.DeleteWorkerBlockResponse
import MTurk.DisassociateQualificationFromWorkerRequest
import MTurk.DisassociateQualificationFromWorkerResponse
import MTurk.GetAccountBalanceRequest
import MTurk.GetAccountBalanceResponse
import MTurk.GetAssignmentRequest
import MTurk.GetAssignmentResponse
import MTurk.GetFileUploadURLRequest
import MTurk.GetFileUploadURLResponse
import MTurk.GetHITRequest
import MTurk.GetHITResponse
import MTurk.GetQualificationScoreRequest
import MTurk.GetQualificationScoreResponse
import MTurk.GetQualificationTypeRequest
import MTurk.GetQualificationTypeResponse
import MTurk.ListAssignmentsForHITRequest
import MTurk.ListAssignmentsForHITResponse
import MTurk.ListBonusPaymentsRequest
import MTurk.ListBonusPaymentsResponse
import MTurk.ListHITsRequest
import MTurk.ListHITsResponse
import MTurk.ListHITsForQualificationTypeRequest
import MTurk.ListHITsForQualificationTypeResponse
import MTurk.ListQualificationRequestsRequest
import MTurk.ListQualificationRequestsResponse
import MTurk.ListQualificationTypesRequest
import MTurk.ListQualificationTypesResponse
import MTurk.ListReviewPolicyResultsForHITRequest
import MTurk.ListReviewPolicyResultsForHITResponse
import MTurk.ListReviewableHITsRequest
import MTurk.ListReviewableHITsResponse
import MTurk.ListWorkerBlocksRequest
import MTurk.ListWorkerBlocksResponse
import MTurk.ListWorkersWithQualificationTypeRequest
import MTurk.ListWorkersWithQualificationTypeResponse
import MTurk.NotifyWorkersRequest
import MTurk.NotifyWorkersResponse
import MTurk.RejectAssignmentRequest
import MTurk.RejectAssignmentResponse
import MTurk.RejectQualificationRequestRequest
import MTurk.RejectQualificationRequestResponse
import MTurk.SendBonusRequest
import MTurk.SendBonusResponse
import MTurk.SendTestEventNotificationRequest
import MTurk.SendTestEventNotificationResponse
import MTurk.UpdateExpirationForHITRequest
import MTurk.UpdateExpirationForHITResponse
import MTurk.UpdateHITReviewStatusRequest
import MTurk.UpdateHITReviewStatusResponse
import MTurk.UpdateHITTypeOfHITRequest
import MTurk.UpdateHITTypeOfHITResponse
import MTurk.UpdateNotificationSettingsRequest
import MTurk.UpdateNotificationSettingsResponse
import MTurk.UpdateQualificationTypeRequest
import MTurk.UpdateQualificationTypeResponse
import MTurk.ReviewPolicy
import MTurk.ReviewReport
import MTurk.NotificationSpecification

typealias AssignmentList = Array<Assignment>

typealias AssignmentStatusList = Array<String /* "Submitted" | "Approved" | "Rejected" | String */>

typealias BonusPaymentList = Array<BonusPayment>

typealias Boolean = Boolean

typealias CountryParameters = String

typealias CurrencyAmount = String

typealias CustomerId = String

typealias CustomerIdList = Array<CustomerId>

typealias EntityId = String

typealias EventTypeList = Array<String /* "AssignmentAccepted" | "AssignmentAbandoned" | "AssignmentReturned" | "AssignmentSubmitted" | "AssignmentRejected" | "AssignmentApproved" | "HITCreated" | "HITExpired" | "HITReviewable" | "HITExtended" | "HITDisposed" | "Ping" | String */>

typealias HITLayoutParameterList = Array<HITLayoutParameter>

typealias HITList = Array<HIT>

typealias IdempotencyToken = String

typealias Integer = Number

typealias IntegerList = Array<Integer>

typealias LocaleList = Array<Locale>

typealias Long = Number

typealias NotifyWorkersFailureStatusList = Array<NotifyWorkersFailureStatus>

typealias PaginationToken = String

typealias ParameterMapEntryList = Array<ParameterMapEntry>

typealias PolicyParameterList = Array<PolicyParameter>

typealias QualificationList = Array<Qualification>

typealias QualificationRequestList = Array<QualificationRequest>

typealias QualificationRequirementList = Array<QualificationRequirement>

typealias QualificationTypeList = Array<QualificationType>

typealias ResultSize = Number

typealias ReviewActionDetailList = Array<ReviewActionDetail>

typealias ReviewPolicyLevelList = Array<String /* "Assignment" | "HIT" | String */>

typealias ReviewResultDetailList = Array<ReviewResultDetail>

typealias String = String

typealias StringList = Array<String>

typealias Timestamp = Date

typealias WorkerBlockList = Array<WorkerBlock>

@JsModule("aws-sdk")
external open class MTurk(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & MTurk.Types.ClientConfiguration */
    open fun acceptQualificationRequest(params: AcceptQualificationRequestRequest, callback: (err: AWSError, data: AcceptQualificationRequestResponse) -> Unit = definedExternally): Request<AcceptQualificationRequestResponse, AWSError>
    open fun acceptQualificationRequest(callback: (err: AWSError, data: AcceptQualificationRequestResponse) -> Unit = definedExternally): Request<AcceptQualificationRequestResponse, AWSError>
    open fun approveAssignment(params: ApproveAssignmentRequest, callback: (err: AWSError, data: ApproveAssignmentResponse) -> Unit = definedExternally): Request<ApproveAssignmentResponse, AWSError>
    open fun approveAssignment(callback: (err: AWSError, data: ApproveAssignmentResponse) -> Unit = definedExternally): Request<ApproveAssignmentResponse, AWSError>
    open fun associateQualificationWithWorker(params: AssociateQualificationWithWorkerRequest, callback: (err: AWSError, data: AssociateQualificationWithWorkerResponse) -> Unit = definedExternally): Request<AssociateQualificationWithWorkerResponse, AWSError>
    open fun associateQualificationWithWorker(callback: (err: AWSError, data: AssociateQualificationWithWorkerResponse) -> Unit = definedExternally): Request<AssociateQualificationWithWorkerResponse, AWSError>
    open fun createAdditionalAssignmentsForHIT(params: CreateAdditionalAssignmentsForHITRequest, callback: (err: AWSError, data: CreateAdditionalAssignmentsForHITResponse) -> Unit = definedExternally): Request<CreateAdditionalAssignmentsForHITResponse, AWSError>
    open fun createAdditionalAssignmentsForHIT(callback: (err: AWSError, data: CreateAdditionalAssignmentsForHITResponse) -> Unit = definedExternally): Request<CreateAdditionalAssignmentsForHITResponse, AWSError>
    open fun createHIT(params: CreateHITRequest, callback: (err: AWSError, data: CreateHITResponse) -> Unit = definedExternally): Request<CreateHITResponse, AWSError>
    open fun createHIT(callback: (err: AWSError, data: CreateHITResponse) -> Unit = definedExternally): Request<CreateHITResponse, AWSError>
    open fun createHITType(params: CreateHITTypeRequest, callback: (err: AWSError, data: CreateHITTypeResponse) -> Unit = definedExternally): Request<CreateHITTypeResponse, AWSError>
    open fun createHITType(callback: (err: AWSError, data: CreateHITTypeResponse) -> Unit = definedExternally): Request<CreateHITTypeResponse, AWSError>
    open fun createHITWithHITType(params: CreateHITWithHITTypeRequest, callback: (err: AWSError, data: CreateHITWithHITTypeResponse) -> Unit = definedExternally): Request<CreateHITWithHITTypeResponse, AWSError>
    open fun createHITWithHITType(callback: (err: AWSError, data: CreateHITWithHITTypeResponse) -> Unit = definedExternally): Request<CreateHITWithHITTypeResponse, AWSError>
    open fun createQualificationType(params: CreateQualificationTypeRequest, callback: (err: AWSError, data: CreateQualificationTypeResponse) -> Unit = definedExternally): Request<CreateQualificationTypeResponse, AWSError>
    open fun createQualificationType(callback: (err: AWSError, data: CreateQualificationTypeResponse) -> Unit = definedExternally): Request<CreateQualificationTypeResponse, AWSError>
    open fun createWorkerBlock(params: CreateWorkerBlockRequest, callback: (err: AWSError, data: CreateWorkerBlockResponse) -> Unit = definedExternally): Request<CreateWorkerBlockResponse, AWSError>
    open fun createWorkerBlock(callback: (err: AWSError, data: CreateWorkerBlockResponse) -> Unit = definedExternally): Request<CreateWorkerBlockResponse, AWSError>
    open fun deleteHIT(params: DeleteHITRequest, callback: (err: AWSError, data: DeleteHITResponse) -> Unit = definedExternally): Request<DeleteHITResponse, AWSError>
    open fun deleteHIT(callback: (err: AWSError, data: DeleteHITResponse) -> Unit = definedExternally): Request<DeleteHITResponse, AWSError>
    open fun deleteQualificationType(params: DeleteQualificationTypeRequest, callback: (err: AWSError, data: DeleteQualificationTypeResponse) -> Unit = definedExternally): Request<DeleteQualificationTypeResponse, AWSError>
    open fun deleteQualificationType(callback: (err: AWSError, data: DeleteQualificationTypeResponse) -> Unit = definedExternally): Request<DeleteQualificationTypeResponse, AWSError>
    open fun deleteWorkerBlock(params: DeleteWorkerBlockRequest, callback: (err: AWSError, data: DeleteWorkerBlockResponse) -> Unit = definedExternally): Request<DeleteWorkerBlockResponse, AWSError>
    open fun deleteWorkerBlock(callback: (err: AWSError, data: DeleteWorkerBlockResponse) -> Unit = definedExternally): Request<DeleteWorkerBlockResponse, AWSError>
    open fun disassociateQualificationFromWorker(params: DisassociateQualificationFromWorkerRequest, callback: (err: AWSError, data: DisassociateQualificationFromWorkerResponse) -> Unit = definedExternally): Request<DisassociateQualificationFromWorkerResponse, AWSError>
    open fun disassociateQualificationFromWorker(callback: (err: AWSError, data: DisassociateQualificationFromWorkerResponse) -> Unit = definedExternally): Request<DisassociateQualificationFromWorkerResponse, AWSError>
    open fun getAccountBalance(params: GetAccountBalanceRequest, callback: (err: AWSError, data: GetAccountBalanceResponse) -> Unit = definedExternally): Request<GetAccountBalanceResponse, AWSError>
    open fun getAccountBalance(callback: (err: AWSError, data: GetAccountBalanceResponse) -> Unit = definedExternally): Request<GetAccountBalanceResponse, AWSError>
    open fun getAssignment(params: GetAssignmentRequest, callback: (err: AWSError, data: GetAssignmentResponse) -> Unit = definedExternally): Request<GetAssignmentResponse, AWSError>
    open fun getAssignment(callback: (err: AWSError, data: GetAssignmentResponse) -> Unit = definedExternally): Request<GetAssignmentResponse, AWSError>
    open fun getFileUploadURL(params: GetFileUploadURLRequest, callback: (err: AWSError, data: GetFileUploadURLResponse) -> Unit = definedExternally): Request<GetFileUploadURLResponse, AWSError>
    open fun getFileUploadURL(callback: (err: AWSError, data: GetFileUploadURLResponse) -> Unit = definedExternally): Request<GetFileUploadURLResponse, AWSError>
    open fun getHIT(params: GetHITRequest, callback: (err: AWSError, data: GetHITResponse) -> Unit = definedExternally): Request<GetHITResponse, AWSError>
    open fun getHIT(callback: (err: AWSError, data: GetHITResponse) -> Unit = definedExternally): Request<GetHITResponse, AWSError>
    open fun getQualificationScore(params: GetQualificationScoreRequest, callback: (err: AWSError, data: GetQualificationScoreResponse) -> Unit = definedExternally): Request<GetQualificationScoreResponse, AWSError>
    open fun getQualificationScore(callback: (err: AWSError, data: GetQualificationScoreResponse) -> Unit = definedExternally): Request<GetQualificationScoreResponse, AWSError>
    open fun getQualificationType(params: GetQualificationTypeRequest, callback: (err: AWSError, data: GetQualificationTypeResponse) -> Unit = definedExternally): Request<GetQualificationTypeResponse, AWSError>
    open fun getQualificationType(callback: (err: AWSError, data: GetQualificationTypeResponse) -> Unit = definedExternally): Request<GetQualificationTypeResponse, AWSError>
    open fun listAssignmentsForHIT(params: ListAssignmentsForHITRequest, callback: (err: AWSError, data: ListAssignmentsForHITResponse) -> Unit = definedExternally): Request<ListAssignmentsForHITResponse, AWSError>
    open fun listAssignmentsForHIT(callback: (err: AWSError, data: ListAssignmentsForHITResponse) -> Unit = definedExternally): Request<ListAssignmentsForHITResponse, AWSError>
    open fun listBonusPayments(params: ListBonusPaymentsRequest, callback: (err: AWSError, data: ListBonusPaymentsResponse) -> Unit = definedExternally): Request<ListBonusPaymentsResponse, AWSError>
    open fun listBonusPayments(callback: (err: AWSError, data: ListBonusPaymentsResponse) -> Unit = definedExternally): Request<ListBonusPaymentsResponse, AWSError>
    open fun listHITs(params: ListHITsRequest, callback: (err: AWSError, data: ListHITsResponse) -> Unit = definedExternally): Request<ListHITsResponse, AWSError>
    open fun listHITs(callback: (err: AWSError, data: ListHITsResponse) -> Unit = definedExternally): Request<ListHITsResponse, AWSError>
    open fun listHITsForQualificationType(params: ListHITsForQualificationTypeRequest, callback: (err: AWSError, data: ListHITsForQualificationTypeResponse) -> Unit = definedExternally): Request<ListHITsForQualificationTypeResponse, AWSError>
    open fun listHITsForQualificationType(callback: (err: AWSError, data: ListHITsForQualificationTypeResponse) -> Unit = definedExternally): Request<ListHITsForQualificationTypeResponse, AWSError>
    open fun listQualificationRequests(params: ListQualificationRequestsRequest, callback: (err: AWSError, data: ListQualificationRequestsResponse) -> Unit = definedExternally): Request<ListQualificationRequestsResponse, AWSError>
    open fun listQualificationRequests(callback: (err: AWSError, data: ListQualificationRequestsResponse) -> Unit = definedExternally): Request<ListQualificationRequestsResponse, AWSError>
    open fun listQualificationTypes(params: ListQualificationTypesRequest, callback: (err: AWSError, data: ListQualificationTypesResponse) -> Unit = definedExternally): Request<ListQualificationTypesResponse, AWSError>
    open fun listQualificationTypes(callback: (err: AWSError, data: ListQualificationTypesResponse) -> Unit = definedExternally): Request<ListQualificationTypesResponse, AWSError>
    open fun listReviewPolicyResultsForHIT(params: ListReviewPolicyResultsForHITRequest, callback: (err: AWSError, data: ListReviewPolicyResultsForHITResponse) -> Unit = definedExternally): Request<ListReviewPolicyResultsForHITResponse, AWSError>
    open fun listReviewPolicyResultsForHIT(callback: (err: AWSError, data: ListReviewPolicyResultsForHITResponse) -> Unit = definedExternally): Request<ListReviewPolicyResultsForHITResponse, AWSError>
    open fun listReviewableHITs(params: ListReviewableHITsRequest, callback: (err: AWSError, data: ListReviewableHITsResponse) -> Unit = definedExternally): Request<ListReviewableHITsResponse, AWSError>
    open fun listReviewableHITs(callback: (err: AWSError, data: ListReviewableHITsResponse) -> Unit = definedExternally): Request<ListReviewableHITsResponse, AWSError>
    open fun listWorkerBlocks(params: ListWorkerBlocksRequest, callback: (err: AWSError, data: ListWorkerBlocksResponse) -> Unit = definedExternally): Request<ListWorkerBlocksResponse, AWSError>
    open fun listWorkerBlocks(callback: (err: AWSError, data: ListWorkerBlocksResponse) -> Unit = definedExternally): Request<ListWorkerBlocksResponse, AWSError>
    open fun listWorkersWithQualificationType(params: ListWorkersWithQualificationTypeRequest, callback: (err: AWSError, data: ListWorkersWithQualificationTypeResponse) -> Unit = definedExternally): Request<ListWorkersWithQualificationTypeResponse, AWSError>
    open fun listWorkersWithQualificationType(callback: (err: AWSError, data: ListWorkersWithQualificationTypeResponse) -> Unit = definedExternally): Request<ListWorkersWithQualificationTypeResponse, AWSError>
    open fun notifyWorkers(params: NotifyWorkersRequest, callback: (err: AWSError, data: NotifyWorkersResponse) -> Unit = definedExternally): Request<NotifyWorkersResponse, AWSError>
    open fun notifyWorkers(callback: (err: AWSError, data: NotifyWorkersResponse) -> Unit = definedExternally): Request<NotifyWorkersResponse, AWSError>
    open fun rejectAssignment(params: RejectAssignmentRequest, callback: (err: AWSError, data: RejectAssignmentResponse) -> Unit = definedExternally): Request<RejectAssignmentResponse, AWSError>
    open fun rejectAssignment(callback: (err: AWSError, data: RejectAssignmentResponse) -> Unit = definedExternally): Request<RejectAssignmentResponse, AWSError>
    open fun rejectQualificationRequest(params: RejectQualificationRequestRequest, callback: (err: AWSError, data: RejectQualificationRequestResponse) -> Unit = definedExternally): Request<RejectQualificationRequestResponse, AWSError>
    open fun rejectQualificationRequest(callback: (err: AWSError, data: RejectQualificationRequestResponse) -> Unit = definedExternally): Request<RejectQualificationRequestResponse, AWSError>
    open fun sendBonus(params: SendBonusRequest, callback: (err: AWSError, data: SendBonusResponse) -> Unit = definedExternally): Request<SendBonusResponse, AWSError>
    open fun sendBonus(callback: (err: AWSError, data: SendBonusResponse) -> Unit = definedExternally): Request<SendBonusResponse, AWSError>
    open fun sendTestEventNotification(params: SendTestEventNotificationRequest, callback: (err: AWSError, data: SendTestEventNotificationResponse) -> Unit = definedExternally): Request<SendTestEventNotificationResponse, AWSError>
    open fun sendTestEventNotification(callback: (err: AWSError, data: SendTestEventNotificationResponse) -> Unit = definedExternally): Request<SendTestEventNotificationResponse, AWSError>
    open fun updateExpirationForHIT(params: UpdateExpirationForHITRequest, callback: (err: AWSError, data: UpdateExpirationForHITResponse) -> Unit = definedExternally): Request<UpdateExpirationForHITResponse, AWSError>
    open fun updateExpirationForHIT(callback: (err: AWSError, data: UpdateExpirationForHITResponse) -> Unit = definedExternally): Request<UpdateExpirationForHITResponse, AWSError>
    open fun updateHITReviewStatus(params: UpdateHITReviewStatusRequest, callback: (err: AWSError, data: UpdateHITReviewStatusResponse) -> Unit = definedExternally): Request<UpdateHITReviewStatusResponse, AWSError>
    open fun updateHITReviewStatus(callback: (err: AWSError, data: UpdateHITReviewStatusResponse) -> Unit = definedExternally): Request<UpdateHITReviewStatusResponse, AWSError>
    open fun updateHITTypeOfHIT(params: UpdateHITTypeOfHITRequest, callback: (err: AWSError, data: UpdateHITTypeOfHITResponse) -> Unit = definedExternally): Request<UpdateHITTypeOfHITResponse, AWSError>
    open fun updateHITTypeOfHIT(callback: (err: AWSError, data: UpdateHITTypeOfHITResponse) -> Unit = definedExternally): Request<UpdateHITTypeOfHITResponse, AWSError>
    open fun updateNotificationSettings(params: UpdateNotificationSettingsRequest, callback: (err: AWSError, data: UpdateNotificationSettingsResponse) -> Unit = definedExternally): Request<UpdateNotificationSettingsResponse, AWSError>
    open fun updateNotificationSettings(callback: (err: AWSError, data: UpdateNotificationSettingsResponse) -> Unit = definedExternally): Request<UpdateNotificationSettingsResponse, AWSError>
    open fun updateQualificationType(params: UpdateQualificationTypeRequest, callback: (err: AWSError, data: UpdateQualificationTypeResponse) -> Unit = definedExternally): Request<UpdateQualificationTypeResponse, AWSError>
    open fun updateQualificationType(callback: (err: AWSError, data: UpdateQualificationTypeResponse) -> Unit = definedExternally): Request<UpdateQualificationTypeResponse, AWSError>
    interface AcceptQualificationRequestRequest {
        var QualificationRequestId: String
        var IntegerValue: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AcceptQualificationRequestResponse
    interface ApproveAssignmentRequest {
        var AssignmentId: EntityId
        var RequesterFeedback: String?
            get() = definedExternally
            set(value) = definedExternally
        var OverrideRejection: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApproveAssignmentResponse
    interface Assignment {
        var AssignmentId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var WorkerId: CustomerId?
            get() = definedExternally
            set(value) = definedExternally
        var HITId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var AssignmentStatus: String /* "Submitted" | "Approved" | "Rejected" | String */
        var AutoApprovalTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var AcceptTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SubmitTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ApprovalTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var RejectionTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Deadline: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Answer: String?
            get() = definedExternally
            set(value) = definedExternally
        var RequesterFeedback: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateQualificationWithWorkerRequest {
        var QualificationTypeId: EntityId
        var WorkerId: CustomerId
        var IntegerValue: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var SendNotification: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateQualificationWithWorkerResponse
    interface BonusPayment {
        var WorkerId: CustomerId?
            get() = definedExternally
            set(value) = definedExternally
        var BonusAmount: CurrencyAmount?
            get() = definedExternally
            set(value) = definedExternally
        var AssignmentId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var Reason: String?
            get() = definedExternally
            set(value) = definedExternally
        var GrantTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAdditionalAssignmentsForHITRequest {
        var HITId: EntityId
        var NumberOfAdditionalAssignments: Integer
        var UniqueRequestToken: IdempotencyToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAdditionalAssignmentsForHITResponse
    interface CreateHITRequest {
        var MaxAssignments: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var AutoApprovalDelayInSeconds: Long?
            get() = definedExternally
            set(value) = definedExternally
        var LifetimeInSeconds: Long
        var AssignmentDurationInSeconds: Long
        var Reward: CurrencyAmount
        var Title: String
        var Keywords: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String
        var Question: String?
            get() = definedExternally
            set(value) = definedExternally
        var RequesterAnnotation: String?
            get() = definedExternally
            set(value) = definedExternally
        var QualificationRequirements: QualificationRequirementList?
            get() = definedExternally
            set(value) = definedExternally
        var UniqueRequestToken: IdempotencyToken?
            get() = definedExternally
            set(value) = definedExternally
        var AssignmentReviewPolicy: ReviewPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var HITReviewPolicy: ReviewPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var HITLayoutId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var HITLayoutParameters: HITLayoutParameterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateHITResponse {
        var HIT: HIT?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateHITTypeRequest {
        var AutoApprovalDelayInSeconds: Long?
            get() = definedExternally
            set(value) = definedExternally
        var AssignmentDurationInSeconds: Long
        var Reward: CurrencyAmount
        var Title: String
        var Keywords: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String
        var QualificationRequirements: QualificationRequirementList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateHITTypeResponse {
        var HITTypeId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateHITWithHITTypeRequest {
        var HITTypeId: EntityId
        var MaxAssignments: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var LifetimeInSeconds: Long
        var Question: String?
            get() = definedExternally
            set(value) = definedExternally
        var RequesterAnnotation: String?
            get() = definedExternally
            set(value) = definedExternally
        var UniqueRequestToken: IdempotencyToken?
            get() = definedExternally
            set(value) = definedExternally
        var AssignmentReviewPolicy: ReviewPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var HITReviewPolicy: ReviewPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var HITLayoutId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var HITLayoutParameters: HITLayoutParameterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateHITWithHITTypeResponse {
        var HIT: HIT?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateQualificationTypeRequest {
        var Name: String
        var Keywords: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String
        var QualificationTypeStatus: String /* "Active" | "Inactive" | String */
        var RetryDelayInSeconds: Long?
            get() = definedExternally
            set(value) = definedExternally
        var Test: String?
            get() = definedExternally
            set(value) = definedExternally
        var AnswerKey: String?
            get() = definedExternally
            set(value) = definedExternally
        var TestDurationInSeconds: Long?
            get() = definedExternally
            set(value) = definedExternally
        var AutoGranted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AutoGrantedValue: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateQualificationTypeResponse {
        var QualificationType: QualificationType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateWorkerBlockRequest {
        var WorkerId: CustomerId
        var Reason: String
    }
    interface CreateWorkerBlockResponse
    interface DeleteHITRequest {
        var HITId: EntityId
    }
    interface DeleteHITResponse
    interface DeleteQualificationTypeRequest {
        var QualificationTypeId: EntityId
    }
    interface DeleteQualificationTypeResponse
    interface DeleteWorkerBlockRequest {
        var WorkerId: CustomerId
        var Reason: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteWorkerBlockResponse
    interface DisassociateQualificationFromWorkerRequest {
        var WorkerId: CustomerId
        var QualificationTypeId: EntityId
        var Reason: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateQualificationFromWorkerResponse
    interface GetAccountBalanceRequest
    interface GetAccountBalanceResponse {
        var AvailableBalance: CurrencyAmount?
            get() = definedExternally
            set(value) = definedExternally
        var OnHoldBalance: CurrencyAmount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAssignmentRequest {
        var AssignmentId: EntityId
    }
    interface GetAssignmentResponse {
        var Assignment: Assignment?
            get() = definedExternally
            set(value) = definedExternally
        var HIT: HIT?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFileUploadURLRequest {
        var AssignmentId: EntityId
        var QuestionIdentifier: String
    }
    interface GetFileUploadURLResponse {
        var FileUploadURL: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetHITRequest {
        var HITId: EntityId
    }
    interface GetHITResponse {
        var HIT: HIT?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetQualificationScoreRequest {
        var QualificationTypeId: EntityId
        var WorkerId: CustomerId
    }
    interface GetQualificationScoreResponse {
        var Qualification: Qualification?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetQualificationTypeRequest {
        var QualificationTypeId: EntityId
    }
    interface GetQualificationTypeResponse {
        var QualificationType: QualificationType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HIT {
        var HITId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var HITTypeId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var HITGroupId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var HITLayoutId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Title: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var Question: String?
            get() = definedExternally
            set(value) = definedExternally
        var Keywords: String?
            get() = definedExternally
            set(value) = definedExternally
        var HITStatus: String /* "Assignable" | "Unassignable" | "Reviewable" | "Reviewing" | "Disposed" | String */
        var MaxAssignments: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Reward: CurrencyAmount?
            get() = definedExternally
            set(value) = definedExternally
        var AutoApprovalDelayInSeconds: Long?
            get() = definedExternally
            set(value) = definedExternally
        var Expiration: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var AssignmentDurationInSeconds: Long?
            get() = definedExternally
            set(value) = definedExternally
        var RequesterAnnotation: String?
            get() = definedExternally
            set(value) = definedExternally
        var QualificationRequirements: QualificationRequirementList?
            get() = definedExternally
            set(value) = definedExternally
        var HITReviewStatus: String /* "NotReviewed" | "MarkedForReview" | "ReviewedAppropriate" | "ReviewedInappropriate" | String */
        var NumberOfAssignmentsPending: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfAssignmentsAvailable: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfAssignmentsCompleted: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HITLayoutParameter {
        var Name: String
        var Value: String
    }
    interface ListAssignmentsForHITRequest {
        var HITId: EntityId
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ResultSize?
            get() = definedExternally
            set(value) = definedExternally
        var AssignmentStatuses: AssignmentStatusList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAssignmentsForHITResponse {
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var NumResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Assignments: AssignmentList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBonusPaymentsRequest {
        var HITId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var AssignmentId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ResultSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBonusPaymentsResponse {
        var NumResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var BonusPayments: BonusPaymentList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHITsForQualificationTypeRequest {
        var QualificationTypeId: EntityId
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ResultSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHITsForQualificationTypeResponse {
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var NumResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var HITs: HITList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHITsRequest {
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ResultSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHITsResponse {
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var NumResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var HITs: HITList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListQualificationRequestsRequest {
        var QualificationTypeId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ResultSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListQualificationRequestsResponse {
        var NumResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var QualificationRequests: QualificationRequestList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListQualificationTypesRequest {
        var Query: String?
            get() = definedExternally
            set(value) = definedExternally
        var MustBeRequestable: Boolean
        var MustBeOwnedByCaller: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ResultSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListQualificationTypesResponse {
        var NumResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var QualificationTypes: QualificationTypeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListReviewPolicyResultsForHITRequest {
        var HITId: EntityId
        var PolicyLevels: ReviewPolicyLevelList?
            get() = definedExternally
            set(value) = definedExternally
        var RetrieveActions: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RetrieveResults: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ResultSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListReviewPolicyResultsForHITResponse {
        var HITId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var AssignmentReviewPolicy: ReviewPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var HITReviewPolicy: ReviewPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var AssignmentReviewReport: ReviewReport?
            get() = definedExternally
            set(value) = definedExternally
        var HITReviewReport: ReviewReport?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListReviewableHITsRequest {
        var HITTypeId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Reviewable" | "Reviewing" | String */
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ResultSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListReviewableHITsResponse {
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var NumResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var HITs: HITList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListWorkerBlocksRequest {
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ResultSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListWorkerBlocksResponse {
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var NumResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var WorkerBlocks: WorkerBlockList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListWorkersWithQualificationTypeRequest {
        var QualificationTypeId: EntityId
        var Status: String /* "Granted" | "Revoked" | String */
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ResultSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListWorkersWithQualificationTypeResponse {
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var NumResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Qualifications: QualificationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Locale {
        var Country: CountryParameters
        var Subdivision: CountryParameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NotificationSpecification {
        var Destination: String
        var Transport: String /* "Email" | "SQS" | "SNS" | String */
        var Version: String
        var EventTypes: EventTypeList
    }
    interface NotifyWorkersFailureStatus {
        var NotifyWorkersFailureCode: String /* "SoftFailure" | "HardFailure" | String */
        var NotifyWorkersFailureMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var WorkerId: CustomerId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NotifyWorkersRequest {
        var Subject: String
        var MessageText: String
        var WorkerIds: CustomerIdList
    }
    interface NotifyWorkersResponse {
        var NotifyWorkersFailureStatuses: NotifyWorkersFailureStatusList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ParameterMapEntry {
        var Key: String?
            get() = definedExternally
            set(value) = definedExternally
        var Values: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyParameter {
        var Key: String?
            get() = definedExternally
            set(value) = definedExternally
        var Values: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var MapEntries: ParameterMapEntryList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Qualification {
        var QualificationTypeId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var WorkerId: CustomerId?
            get() = definedExternally
            set(value) = definedExternally
        var GrantTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var IntegerValue: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var LocaleValue: Locale?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Granted" | "Revoked" | String */
    }
    interface QualificationRequest {
        var QualificationRequestId: String?
            get() = definedExternally
            set(value) = definedExternally
        var QualificationTypeId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var WorkerId: CustomerId?
            get() = definedExternally
            set(value) = definedExternally
        var Test: String?
            get() = definedExternally
            set(value) = definedExternally
        var Answer: String?
            get() = definedExternally
            set(value) = definedExternally
        var SubmitTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface QualificationRequirement {
        var QualificationTypeId: String
        var Comparator: String /* "LessThan" | "LessThanOrEqualTo" | "GreaterThan" | "GreaterThanOrEqualTo" | "EqualTo" | "NotEqualTo" | "Exists" | "DoesNotExist" | "In" | "NotIn" | String */
        var IntegerValues: IntegerList?
            get() = definedExternally
            set(value) = definedExternally
        var LocaleValues: LocaleList?
            get() = definedExternally
            set(value) = definedExternally
        var RequiredToPreview: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ActionsGuarded: String /* "Accept" | "PreviewAndAccept" | "DiscoverPreviewAndAccept" | String */
    }
    interface QualificationType {
        var QualificationTypeId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var Keywords: String?
            get() = definedExternally
            set(value) = definedExternally
        var QualificationTypeStatus: String /* "Active" | "Inactive" | String */
        var Test: String?
            get() = definedExternally
            set(value) = definedExternally
        var TestDurationInSeconds: Long?
            get() = definedExternally
            set(value) = definedExternally
        var AnswerKey: String?
            get() = definedExternally
            set(value) = definedExternally
        var RetryDelayInSeconds: Long?
            get() = definedExternally
            set(value) = definedExternally
        var IsRequestable: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AutoGranted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AutoGrantedValue: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RejectAssignmentRequest {
        var AssignmentId: EntityId
        var RequesterFeedback: String
    }
    interface RejectAssignmentResponse
    interface RejectQualificationRequestRequest {
        var QualificationRequestId: String
        var Reason: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RejectQualificationRequestResponse
    interface ReviewActionDetail {
        var ActionId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var ActionName: String?
            get() = definedExternally
            set(value) = definedExternally
        var TargetId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var TargetType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Intended" | "Succeeded" | "Failed" | "Cancelled" | String */
        var CompleteTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Result: String?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReviewPolicy {
        var PolicyName: String
        var Parameters: PolicyParameterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReviewReport {
        var ReviewResults: ReviewResultDetailList?
            get() = definedExternally
            set(value) = definedExternally
        var ReviewActions: ReviewActionDetailList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReviewResultDetail {
        var ActionId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var SubjectId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var SubjectType: String?
            get() = definedExternally
            set(value) = definedExternally
        var QuestionId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var Key: String?
            get() = definedExternally
            set(value) = definedExternally
        var Value: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendBonusRequest {
        var WorkerId: CustomerId
        var BonusAmount: CurrencyAmount
        var AssignmentId: EntityId
        var Reason: String
        var UniqueRequestToken: IdempotencyToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendBonusResponse
    interface SendTestEventNotificationRequest {
        var Notification: NotificationSpecification
        var TestEventType: String /* "AssignmentAccepted" | "AssignmentAbandoned" | "AssignmentReturned" | "AssignmentSubmitted" | "AssignmentRejected" | "AssignmentApproved" | "HITCreated" | "HITExpired" | "HITReviewable" | "HITExtended" | "HITDisposed" | "Ping" | String */
    }
    interface SendTestEventNotificationResponse
    interface UpdateExpirationForHITRequest {
        var HITId: EntityId
        var ExpireAt: Timestamp
    }
    interface UpdateExpirationForHITResponse
    interface UpdateHITReviewStatusRequest {
        var HITId: EntityId
        var Revert: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateHITReviewStatusResponse
    interface UpdateHITTypeOfHITRequest {
        var HITId: EntityId
        var HITTypeId: EntityId
    }
    interface UpdateHITTypeOfHITResponse
    interface UpdateNotificationSettingsRequest {
        var HITTypeId: EntityId
        var Notification: NotificationSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var Active: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateNotificationSettingsResponse
    interface UpdateQualificationTypeRequest {
        var QualificationTypeId: EntityId
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var QualificationTypeStatus: String /* "Active" | "Inactive" | String */
        var Test: String?
            get() = definedExternally
            set(value) = definedExternally
        var AnswerKey: String?
            get() = definedExternally
            set(value) = definedExternally
        var TestDurationInSeconds: Long?
            get() = definedExternally
            set(value) = definedExternally
        var RetryDelayInSeconds: Long?
            get() = definedExternally
            set(value) = definedExternally
        var AutoGranted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AutoGrantedValue: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateQualificationTypeResponse {
        var QualificationType: QualificationType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkerBlock {
        var WorkerId: CustomerId?
            get() = definedExternally
            set(value) = definedExternally
        var Reason: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-01-17" | "latest" | String */
    }
}