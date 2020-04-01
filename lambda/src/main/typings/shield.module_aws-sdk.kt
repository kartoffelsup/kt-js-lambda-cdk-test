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
import Shield.AttackProperty
import Shield.AttackSummary
import Shield.AttackVectorDescription
import Shield.EmergencyContact
import Shield.Limit
import Shield.Mitigation
import Shield.Protection
import Shield.SubResourceSummary
import Shield.SummarizedAttackVector
import Shield.SummarizedCounter
import Shield.Contributor
import Shield.AssociateDRTLogBucketRequest
import Shield.AssociateDRTLogBucketResponse
import Shield.AssociateDRTRoleRequest
import Shield.AssociateDRTRoleResponse
import Shield.AssociateHealthCheckRequest
import Shield.AssociateHealthCheckResponse
import Shield.CreateProtectionRequest
import Shield.CreateProtectionResponse
import Shield.CreateSubscriptionRequest
import Shield.CreateSubscriptionResponse
import Shield.DeleteProtectionRequest
import Shield.DeleteProtectionResponse
import Shield.DeleteSubscriptionRequest
import Shield.DeleteSubscriptionResponse
import Shield.DescribeAttackRequest
import Shield.DescribeAttackResponse
import Shield.DescribeDRTAccessRequest
import Shield.DescribeDRTAccessResponse
import Shield.DescribeEmergencyContactSettingsRequest
import Shield.DescribeEmergencyContactSettingsResponse
import Shield.DescribeProtectionRequest
import Shield.DescribeProtectionResponse
import Shield.DescribeSubscriptionRequest
import Shield.DescribeSubscriptionResponse
import Shield.DisassociateDRTLogBucketRequest
import Shield.DisassociateDRTLogBucketResponse
import Shield.DisassociateDRTRoleRequest
import Shield.DisassociateDRTRoleResponse
import Shield.DisassociateHealthCheckRequest
import Shield.DisassociateHealthCheckResponse
import Shield.GetSubscriptionStateRequest
import Shield.GetSubscriptionStateResponse
import Shield.ListAttacksRequest
import Shield.ListAttacksResponse
import Shield.ListProtectionsRequest
import Shield.ListProtectionsResponse
import Shield.UpdateEmergencyContactSettingsRequest
import Shield.UpdateEmergencyContactSettingsResponse
import Shield.UpdateSubscriptionRequest
import Shield.UpdateSubscriptionResponse
import Shield.AttackDetail
import Shield.Subscription
import Shield.TimeRange

typealias AttackId = String

typealias AttackProperties = Array<AttackProperty>

typealias AttackSummaries = Array<AttackSummary>

typealias AttackTimestamp = Date

typealias AttackVectorDescriptionList = Array<AttackVectorDescription>

typealias Double = Number

typealias DurationInSeconds = Number

typealias EmailAddress = String

typealias EmergencyContactList = Array<EmergencyContact>

typealias HealthCheckArn = String

typealias HealthCheckId = String

typealias HealthCheckIds = Array<HealthCheckId>

typealias Integer = Number

typealias Limits = Array<Limit>

typealias LogBucket = String

typealias LogBucketList = Array<LogBucket>

typealias Long = Number

typealias MaxResults = Number

typealias MitigationList = Array<Mitigation>

typealias ProtectionId = String

typealias ProtectionName = String

typealias Protections = Array<Protection>

typealias ResourceArn = String

typealias ResourceArnFilterList = Array<ResourceArn>

typealias RoleArn = String

typealias String = String

typealias SubResourceSummaryList = Array<SubResourceSummary>

typealias SummarizedAttackVectorList = Array<SummarizedAttackVector>

typealias SummarizedCounterList = Array<SummarizedCounter>

typealias Timestamp = Date

typealias Token = String

typealias TopContributors = Array<Contributor>

@JsModule("aws-sdk")
external open class Shield(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Shield.Types.ClientConfiguration */
    open fun associateDRTLogBucket(params: AssociateDRTLogBucketRequest, callback: (err: AWSError, data: AssociateDRTLogBucketResponse) -> Unit = definedExternally): Request<AssociateDRTLogBucketResponse, AWSError>
    open fun associateDRTLogBucket(callback: (err: AWSError, data: AssociateDRTLogBucketResponse) -> Unit = definedExternally): Request<AssociateDRTLogBucketResponse, AWSError>
    open fun associateDRTRole(params: AssociateDRTRoleRequest, callback: (err: AWSError, data: AssociateDRTRoleResponse) -> Unit = definedExternally): Request<AssociateDRTRoleResponse, AWSError>
    open fun associateDRTRole(callback: (err: AWSError, data: AssociateDRTRoleResponse) -> Unit = definedExternally): Request<AssociateDRTRoleResponse, AWSError>
    open fun associateHealthCheck(params: AssociateHealthCheckRequest, callback: (err: AWSError, data: AssociateHealthCheckResponse) -> Unit = definedExternally): Request<AssociateHealthCheckResponse, AWSError>
    open fun associateHealthCheck(callback: (err: AWSError, data: AssociateHealthCheckResponse) -> Unit = definedExternally): Request<AssociateHealthCheckResponse, AWSError>
    open fun createProtection(params: CreateProtectionRequest, callback: (err: AWSError, data: CreateProtectionResponse) -> Unit = definedExternally): Request<CreateProtectionResponse, AWSError>
    open fun createProtection(callback: (err: AWSError, data: CreateProtectionResponse) -> Unit = definedExternally): Request<CreateProtectionResponse, AWSError>
    open fun createSubscription(params: CreateSubscriptionRequest, callback: (err: AWSError, data: CreateSubscriptionResponse) -> Unit = definedExternally): Request<CreateSubscriptionResponse, AWSError>
    open fun createSubscription(callback: (err: AWSError, data: CreateSubscriptionResponse) -> Unit = definedExternally): Request<CreateSubscriptionResponse, AWSError>
    open fun deleteProtection(params: DeleteProtectionRequest, callback: (err: AWSError, data: DeleteProtectionResponse) -> Unit = definedExternally): Request<DeleteProtectionResponse, AWSError>
    open fun deleteProtection(callback: (err: AWSError, data: DeleteProtectionResponse) -> Unit = definedExternally): Request<DeleteProtectionResponse, AWSError>
    open fun deleteSubscription(params: DeleteSubscriptionRequest, callback: (err: AWSError, data: DeleteSubscriptionResponse) -> Unit = definedExternally): Request<DeleteSubscriptionResponse, AWSError>
    open fun deleteSubscription(callback: (err: AWSError, data: DeleteSubscriptionResponse) -> Unit = definedExternally): Request<DeleteSubscriptionResponse, AWSError>
    open fun describeAttack(params: DescribeAttackRequest, callback: (err: AWSError, data: DescribeAttackResponse) -> Unit = definedExternally): Request<DescribeAttackResponse, AWSError>
    open fun describeAttack(callback: (err: AWSError, data: DescribeAttackResponse) -> Unit = definedExternally): Request<DescribeAttackResponse, AWSError>
    open fun describeDRTAccess(params: DescribeDRTAccessRequest, callback: (err: AWSError, data: DescribeDRTAccessResponse) -> Unit = definedExternally): Request<DescribeDRTAccessResponse, AWSError>
    open fun describeDRTAccess(callback: (err: AWSError, data: DescribeDRTAccessResponse) -> Unit = definedExternally): Request<DescribeDRTAccessResponse, AWSError>
    open fun describeEmergencyContactSettings(params: DescribeEmergencyContactSettingsRequest, callback: (err: AWSError, data: DescribeEmergencyContactSettingsResponse) -> Unit = definedExternally): Request<DescribeEmergencyContactSettingsResponse, AWSError>
    open fun describeEmergencyContactSettings(callback: (err: AWSError, data: DescribeEmergencyContactSettingsResponse) -> Unit = definedExternally): Request<DescribeEmergencyContactSettingsResponse, AWSError>
    open fun describeProtection(params: DescribeProtectionRequest, callback: (err: AWSError, data: DescribeProtectionResponse) -> Unit = definedExternally): Request<DescribeProtectionResponse, AWSError>
    open fun describeProtection(callback: (err: AWSError, data: DescribeProtectionResponse) -> Unit = definedExternally): Request<DescribeProtectionResponse, AWSError>
    open fun describeSubscription(params: DescribeSubscriptionRequest, callback: (err: AWSError, data: DescribeSubscriptionResponse) -> Unit = definedExternally): Request<DescribeSubscriptionResponse, AWSError>
    open fun describeSubscription(callback: (err: AWSError, data: DescribeSubscriptionResponse) -> Unit = definedExternally): Request<DescribeSubscriptionResponse, AWSError>
    open fun disassociateDRTLogBucket(params: DisassociateDRTLogBucketRequest, callback: (err: AWSError, data: DisassociateDRTLogBucketResponse) -> Unit = definedExternally): Request<DisassociateDRTLogBucketResponse, AWSError>
    open fun disassociateDRTLogBucket(callback: (err: AWSError, data: DisassociateDRTLogBucketResponse) -> Unit = definedExternally): Request<DisassociateDRTLogBucketResponse, AWSError>
    open fun disassociateDRTRole(params: DisassociateDRTRoleRequest, callback: (err: AWSError, data: DisassociateDRTRoleResponse) -> Unit = definedExternally): Request<DisassociateDRTRoleResponse, AWSError>
    open fun disassociateDRTRole(callback: (err: AWSError, data: DisassociateDRTRoleResponse) -> Unit = definedExternally): Request<DisassociateDRTRoleResponse, AWSError>
    open fun disassociateHealthCheck(params: DisassociateHealthCheckRequest, callback: (err: AWSError, data: DisassociateHealthCheckResponse) -> Unit = definedExternally): Request<DisassociateHealthCheckResponse, AWSError>
    open fun disassociateHealthCheck(callback: (err: AWSError, data: DisassociateHealthCheckResponse) -> Unit = definedExternally): Request<DisassociateHealthCheckResponse, AWSError>
    open fun getSubscriptionState(params: GetSubscriptionStateRequest, callback: (err: AWSError, data: GetSubscriptionStateResponse) -> Unit = definedExternally): Request<GetSubscriptionStateResponse, AWSError>
    open fun getSubscriptionState(callback: (err: AWSError, data: GetSubscriptionStateResponse) -> Unit = definedExternally): Request<GetSubscriptionStateResponse, AWSError>
    open fun listAttacks(params: ListAttacksRequest, callback: (err: AWSError, data: ListAttacksResponse) -> Unit = definedExternally): Request<ListAttacksResponse, AWSError>
    open fun listAttacks(callback: (err: AWSError, data: ListAttacksResponse) -> Unit = definedExternally): Request<ListAttacksResponse, AWSError>
    open fun listProtections(params: ListProtectionsRequest, callback: (err: AWSError, data: ListProtectionsResponse) -> Unit = definedExternally): Request<ListProtectionsResponse, AWSError>
    open fun listProtections(callback: (err: AWSError, data: ListProtectionsResponse) -> Unit = definedExternally): Request<ListProtectionsResponse, AWSError>
    open fun updateEmergencyContactSettings(params: UpdateEmergencyContactSettingsRequest, callback: (err: AWSError, data: UpdateEmergencyContactSettingsResponse) -> Unit = definedExternally): Request<UpdateEmergencyContactSettingsResponse, AWSError>
    open fun updateEmergencyContactSettings(callback: (err: AWSError, data: UpdateEmergencyContactSettingsResponse) -> Unit = definedExternally): Request<UpdateEmergencyContactSettingsResponse, AWSError>
    open fun updateSubscription(params: UpdateSubscriptionRequest, callback: (err: AWSError, data: UpdateSubscriptionResponse) -> Unit = definedExternally): Request<UpdateSubscriptionResponse, AWSError>
    open fun updateSubscription(callback: (err: AWSError, data: UpdateSubscriptionResponse) -> Unit = definedExternally): Request<UpdateSubscriptionResponse, AWSError>
    interface AssociateDRTLogBucketRequest {
        var LogBucket: LogBucket
    }
    interface AssociateDRTLogBucketResponse
    interface AssociateDRTRoleRequest {
        var RoleArn: RoleArn
    }
    interface AssociateDRTRoleResponse
    interface AssociateHealthCheckRequest {
        var ProtectionId: ProtectionId
        var HealthCheckArn: HealthCheckArn
    }
    interface AssociateHealthCheckResponse
    interface AttackDetail {
        var AttackId: AttackId?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceArn: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
        var SubResources: SubResourceSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: AttackTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: AttackTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var AttackCounters: SummarizedCounterList?
            get() = definedExternally
            set(value) = definedExternally
        var AttackProperties: AttackProperties?
            get() = definedExternally
            set(value) = definedExternally
        var Mitigations: MitigationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttackProperty {
        var AttackLayer: String /* "NETWORK" | "APPLICATION" | String */
        var AttackPropertyIdentifier: String /* "DESTINATION_URL" | "REFERRER" | "SOURCE_ASN" | "SOURCE_COUNTRY" | "SOURCE_IP_ADDRESS" | "SOURCE_USER_AGENT" | "WORDPRESS_PINGBACK_REFLECTOR" | "WORDPRESS_PINGBACK_SOURCE" | String */
        var TopContributors: TopContributors?
            get() = definedExternally
            set(value) = definedExternally
        var Unit: String /* "BITS" | "BYTES" | "PACKETS" | "REQUESTS" | String */
        var Total: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttackSummary {
        var AttackId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: AttackTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: AttackTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var AttackVectors: AttackVectorDescriptionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttackVectorDescription {
        var VectorType: String
    }
    interface Contributor {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Value: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProtectionRequest {
        var Name: ProtectionName
        var ResourceArn: ResourceArn
    }
    interface CreateProtectionResponse {
        var ProtectionId: ProtectionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSubscriptionRequest
    interface CreateSubscriptionResponse
    interface DeleteProtectionRequest {
        var ProtectionId: ProtectionId
    }
    interface DeleteProtectionResponse
    interface DeleteSubscriptionRequest
    interface DeleteSubscriptionResponse
    interface DescribeAttackRequest {
        var AttackId: AttackId
    }
    interface DescribeAttackResponse {
        var Attack: AttackDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDRTAccessRequest
    interface DescribeDRTAccessResponse {
        var RoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var LogBucketList: LogBucketList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEmergencyContactSettingsRequest
    interface DescribeEmergencyContactSettingsResponse {
        var EmergencyContactList: EmergencyContactList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProtectionRequest {
        var ProtectionId: ProtectionId?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceArn: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProtectionResponse {
        var Protection: Protection?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSubscriptionRequest
    interface DescribeSubscriptionResponse {
        var Subscription: Subscription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateDRTLogBucketRequest {
        var LogBucket: LogBucket
    }
    interface DisassociateDRTLogBucketResponse
    interface DisassociateDRTRoleRequest
    interface DisassociateDRTRoleResponse
    interface DisassociateHealthCheckRequest {
        var ProtectionId: ProtectionId
        var HealthCheckArn: HealthCheckArn
    }
    interface DisassociateHealthCheckResponse
    interface EmergencyContact {
        var EmailAddress: EmailAddress
    }
    interface GetSubscriptionStateRequest
    interface GetSubscriptionStateResponse {
        var SubscriptionState: String /* "ACTIVE" | "INACTIVE" | String */
    }
    interface Limit {
        var Type: String?
            get() = definedExternally
            set(value) = definedExternally
        var Max: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAttacksRequest {
        var ResourceArns: ResourceArnFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: TimeRange?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: TimeRange?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAttacksResponse {
        var AttackSummaries: AttackSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProtectionsRequest {
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProtectionsResponse {
        var Protections: Protections?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Mitigation {
        var MitigationName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Protection {
        var Id: ProtectionId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ProtectionName?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceArn: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckIds: HealthCheckIds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SubResourceSummary {
        var Type: String /* "IP" | "URL" | String */
        var Id: String?
            get() = definedExternally
            set(value) = definedExternally
        var AttackVectors: SummarizedAttackVectorList?
            get() = definedExternally
            set(value) = definedExternally
        var Counters: SummarizedCounterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Subscription {
        var StartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TimeCommitmentInSeconds: DurationInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var AutoRenew: String /* "ENABLED" | "DISABLED" | String */
        var Limits: Limits?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SummarizedAttackVector {
        var VectorType: String
        var VectorCounters: SummarizedCounterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SummarizedCounter {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Max: Double?
            get() = definedExternally
            set(value) = definedExternally
        var Average: Double?
            get() = definedExternally
            set(value) = definedExternally
        var Sum: Double?
            get() = definedExternally
            set(value) = definedExternally
        var N: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Unit: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TimeRange {
        var FromInclusive: AttackTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ToExclusive: AttackTimestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateEmergencyContactSettingsRequest {
        var EmergencyContactList: EmergencyContactList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateEmergencyContactSettingsResponse
    interface UpdateSubscriptionRequest {
        var AutoRenew: String /* "ENABLED" | "DISABLED" | String */
    }
    interface UpdateSubscriptionResponse
    interface ClientApiVersions {
        var apiVersion: String /* "2016-06-02" | "latest" | String */
    }
}