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
import S3Control.AccessPoint
import S3Control.JobFailure
import S3Control.JobListDescriptor
import S3Control.S3Grant
import S3Control.S3Tag
import S3Control.CreateAccessPointRequest
import S3Control.CreateJobRequest
import S3Control.CreateJobResult
import S3Control.DeleteAccessPointRequest
import S3Control.DeleteAccessPointPolicyRequest
import S3Control.DeleteJobTaggingRequest
import S3Control.DeleteJobTaggingResult
import S3Control.DeletePublicAccessBlockRequest
import S3Control.DescribeJobRequest
import S3Control.DescribeJobResult
import S3Control.GetAccessPointRequest
import S3Control.GetAccessPointResult
import S3Control.GetAccessPointPolicyRequest
import S3Control.GetAccessPointPolicyResult
import S3Control.GetAccessPointPolicyStatusRequest
import S3Control.GetAccessPointPolicyStatusResult
import S3Control.GetJobTaggingRequest
import S3Control.GetJobTaggingResult
import S3Control.GetPublicAccessBlockRequest
import S3Control.GetPublicAccessBlockOutput
import S3Control.ListAccessPointsRequest
import S3Control.ListAccessPointsResult
import S3Control.ListJobsRequest
import S3Control.ListJobsResult
import S3Control.PutAccessPointPolicyRequest
import S3Control.PutJobTaggingRequest
import S3Control.PutJobTaggingResult
import S3Control.PutPublicAccessBlockRequest
import S3Control.UpdateJobPriorityRequest
import S3Control.UpdateJobPriorityResult
import S3Control.UpdateJobStatusRequest
import S3Control.UpdateJobStatusResult
import S3Control.VpcConfiguration
import S3Control.PublicAccessBlockConfiguration
import S3Control.JobOperation
import S3Control.JobReport
import S3Control.JobManifest
import S3Control.JobDescriptor
import S3Control.PolicyStatus
import S3Control.JobProgressSummary
import S3Control.JobManifestSpec
import S3Control.JobManifestLocation
import S3Control.LambdaInvokeOperation
import S3Control.S3CopyObjectOperation
import S3Control.S3SetObjectAclOperation
import S3Control.S3SetObjectTaggingOperation
import S3Control.S3InitiateRestoreObjectOperation
import S3Control.S3ObjectOwner
import S3Control.S3AccessControlList
import S3Control.S3ObjectMetadata
import S3Control.S3Grantee
import S3Control.S3UserMetadata
import S3Control.S3AccessControlPolicy

typealias AccessPointList = Array<AccessPoint>

typealias AccessPointName = String

typealias AccountId = String

typealias Boolean = Boolean

typealias BucketName = String

typealias ConfirmationRequired = Boolean

typealias CreationDate = Date

typealias IAMRoleArn = String

typealias IsPublic = Boolean

typealias JobArn = String

typealias JobCreationTime = Date

typealias JobFailureCode = String

typealias JobFailureList = Array<JobFailure>

typealias JobFailureReason = String

typealias JobId = String

typealias JobListDescriptorList = Array<JobListDescriptor>

typealias JobManifestFieldList = Array<String /* "Ignore" | "Bucket" | "Key" | "VersionId" | String */>

typealias JobNumberOfTasksFailed = Number

typealias JobNumberOfTasksSucceeded = Number

typealias JobPriority = Number

typealias JobStatusList = Array<String /* "Active" | "Cancelled" | "Cancelling" | "Complete" | "Completing" | "Failed" | "Failing" | "New" | "Paused" | "Pausing" | "Preparing" | "Ready" | "Suspended" | String */>

typealias JobStatusUpdateReason = String

typealias JobTerminationDate = Date

typealias JobTotalNumberOfTasks = Number

typealias KmsKeyArnString = String

typealias MaxLength1024String = String

typealias MaxResults = Number

typealias NonEmptyMaxLength1024String = String

typealias NonEmptyMaxLength2048String = String

typealias NonEmptyMaxLength256String = String

typealias NonEmptyMaxLength64String = String

typealias Policy = String

typealias ReportPrefixString = String

typealias S3BucketArnString = String

typealias S3ContentLength = Number

typealias S3ExpirationInDays = Number

typealias S3GrantList = Array<S3Grant>

typealias S3KeyArnString = String

typealias S3ObjectVersionId = String

typealias S3TagSet = Array<S3Tag>

typealias Setting = Boolean

typealias SuspendedCause = String

typealias SuspendedDate = Date

typealias TimeStamp = Date

typealias VpcId = String

@JsModule("aws-sdk")
external open class S3Control(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & UseDualstackConfigOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & S3Control.Types.ClientConfiguration */
    open fun createAccessPoint(params: CreateAccessPointRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createAccessPoint(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createJob(params: CreateJobRequest, callback: (err: AWSError, data: CreateJobResult) -> Unit = definedExternally): Request<CreateJobResult, AWSError>
    open fun createJob(callback: (err: AWSError, data: CreateJobResult) -> Unit = definedExternally): Request<CreateJobResult, AWSError>
    open fun deleteAccessPoint(params: DeleteAccessPointRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAccessPoint(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAccessPointPolicy(params: DeleteAccessPointPolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAccessPointPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteJobTagging(params: DeleteJobTaggingRequest, callback: (err: AWSError, data: DeleteJobTaggingResult) -> Unit = definedExternally): Request<DeleteJobTaggingResult, AWSError>
    open fun deleteJobTagging(callback: (err: AWSError, data: DeleteJobTaggingResult) -> Unit = definedExternally): Request<DeleteJobTaggingResult, AWSError>
    open fun deletePublicAccessBlock(params: DeletePublicAccessBlockRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePublicAccessBlock(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeJob(params: DescribeJobRequest, callback: (err: AWSError, data: DescribeJobResult) -> Unit = definedExternally): Request<DescribeJobResult, AWSError>
    open fun describeJob(callback: (err: AWSError, data: DescribeJobResult) -> Unit = definedExternally): Request<DescribeJobResult, AWSError>
    open fun getAccessPoint(params: GetAccessPointRequest, callback: (err: AWSError, data: GetAccessPointResult) -> Unit = definedExternally): Request<GetAccessPointResult, AWSError>
    open fun getAccessPoint(callback: (err: AWSError, data: GetAccessPointResult) -> Unit = definedExternally): Request<GetAccessPointResult, AWSError>
    open fun getAccessPointPolicy(params: GetAccessPointPolicyRequest, callback: (err: AWSError, data: GetAccessPointPolicyResult) -> Unit = definedExternally): Request<GetAccessPointPolicyResult, AWSError>
    open fun getAccessPointPolicy(callback: (err: AWSError, data: GetAccessPointPolicyResult) -> Unit = definedExternally): Request<GetAccessPointPolicyResult, AWSError>
    open fun getAccessPointPolicyStatus(params: GetAccessPointPolicyStatusRequest, callback: (err: AWSError, data: GetAccessPointPolicyStatusResult) -> Unit = definedExternally): Request<GetAccessPointPolicyStatusResult, AWSError>
    open fun getAccessPointPolicyStatus(callback: (err: AWSError, data: GetAccessPointPolicyStatusResult) -> Unit = definedExternally): Request<GetAccessPointPolicyStatusResult, AWSError>
    open fun getJobTagging(params: GetJobTaggingRequest, callback: (err: AWSError, data: GetJobTaggingResult) -> Unit = definedExternally): Request<GetJobTaggingResult, AWSError>
    open fun getJobTagging(callback: (err: AWSError, data: GetJobTaggingResult) -> Unit = definedExternally): Request<GetJobTaggingResult, AWSError>
    open fun getPublicAccessBlock(params: GetPublicAccessBlockRequest, callback: (err: AWSError, data: GetPublicAccessBlockOutput) -> Unit = definedExternally): Request<GetPublicAccessBlockOutput, AWSError>
    open fun getPublicAccessBlock(callback: (err: AWSError, data: GetPublicAccessBlockOutput) -> Unit = definedExternally): Request<GetPublicAccessBlockOutput, AWSError>
    open fun listAccessPoints(params: ListAccessPointsRequest, callback: (err: AWSError, data: ListAccessPointsResult) -> Unit = definedExternally): Request<ListAccessPointsResult, AWSError>
    open fun listAccessPoints(callback: (err: AWSError, data: ListAccessPointsResult) -> Unit = definedExternally): Request<ListAccessPointsResult, AWSError>
    open fun listJobs(params: ListJobsRequest, callback: (err: AWSError, data: ListJobsResult) -> Unit = definedExternally): Request<ListJobsResult, AWSError>
    open fun listJobs(callback: (err: AWSError, data: ListJobsResult) -> Unit = definedExternally): Request<ListJobsResult, AWSError>
    open fun putAccessPointPolicy(params: PutAccessPointPolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putAccessPointPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putJobTagging(params: PutJobTaggingRequest, callback: (err: AWSError, data: PutJobTaggingResult) -> Unit = definedExternally): Request<PutJobTaggingResult, AWSError>
    open fun putJobTagging(callback: (err: AWSError, data: PutJobTaggingResult) -> Unit = definedExternally): Request<PutJobTaggingResult, AWSError>
    open fun putPublicAccessBlock(params: PutPublicAccessBlockRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putPublicAccessBlock(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateJobPriority(params: UpdateJobPriorityRequest, callback: (err: AWSError, data: UpdateJobPriorityResult) -> Unit = definedExternally): Request<UpdateJobPriorityResult, AWSError>
    open fun updateJobPriority(callback: (err: AWSError, data: UpdateJobPriorityResult) -> Unit = definedExternally): Request<UpdateJobPriorityResult, AWSError>
    open fun updateJobStatus(params: UpdateJobStatusRequest, callback: (err: AWSError, data: UpdateJobStatusResult) -> Unit = definedExternally): Request<UpdateJobStatusResult, AWSError>
    open fun updateJobStatus(callback: (err: AWSError, data: UpdateJobStatusResult) -> Unit = definedExternally): Request<UpdateJobStatusResult, AWSError>
    interface AccessPoint {
        var Name: AccessPointName
        var NetworkOrigin: String /* "Internet" | "VPC" | String */
        var VpcConfiguration: VpcConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Bucket: BucketName
    }
    interface CreateAccessPointRequest {
        var AccountId: AccountId
        var Name: AccessPointName
        var Bucket: BucketName
        var VpcConfiguration: VpcConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var PublicAccessBlockConfiguration: PublicAccessBlockConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateJobRequest {
        var AccountId: AccountId
        var ConfirmationRequired: ConfirmationRequired?
            get() = definedExternally
            set(value) = definedExternally
        var Operation: JobOperation
        var Report: JobReport
        var ClientRequestToken: NonEmptyMaxLength64String
        var Manifest: JobManifest
        var Description: NonEmptyMaxLength256String?
            get() = definedExternally
            set(value) = definedExternally
        var Priority: JobPriority
        var RoleArn: IAMRoleArn
        var Tags: S3TagSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateJobResult {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAccessPointPolicyRequest {
        var AccountId: AccountId
        var Name: AccessPointName
    }
    interface DeleteAccessPointRequest {
        var AccountId: AccountId
        var Name: AccessPointName
    }
    interface DeleteJobTaggingRequest {
        var AccountId: AccountId
        var JobId: JobId
    }
    interface DeleteJobTaggingResult
    interface DeletePublicAccessBlockRequest {
        var AccountId: AccountId
    }
    interface DescribeJobRequest {
        var AccountId: AccountId
        var JobId: JobId
    }
    interface DescribeJobResult {
        var Job: JobDescriptor?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAccessPointPolicyRequest {
        var AccountId: AccountId
        var Name: AccessPointName
    }
    interface GetAccessPointPolicyResult {
        var Policy: Policy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAccessPointPolicyStatusRequest {
        var AccountId: AccountId
        var Name: AccessPointName
    }
    interface GetAccessPointPolicyStatusResult {
        var PolicyStatus: PolicyStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAccessPointRequest {
        var AccountId: AccountId
        var Name: AccessPointName
    }
    interface GetAccessPointResult {
        var Name: AccessPointName?
            get() = definedExternally
            set(value) = definedExternally
        var Bucket: BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkOrigin: String /* "Internet" | "VPC" | String */
        var VpcConfiguration: VpcConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var PublicAccessBlockConfiguration: PublicAccessBlockConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: CreationDate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetJobTaggingRequest {
        var AccountId: AccountId
        var JobId: JobId
    }
    interface GetJobTaggingResult {
        var Tags: S3TagSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPublicAccessBlockOutput {
        var PublicAccessBlockConfiguration: PublicAccessBlockConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPublicAccessBlockRequest {
        var AccountId: AccountId
    }
    interface JobDescriptor {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var ConfirmationRequired: ConfirmationRequired?
            get() = definedExternally
            set(value) = definedExternally
        var Description: NonEmptyMaxLength256String?
            get() = definedExternally
            set(value) = definedExternally
        var JobArn: JobArn?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Active" | "Cancelled" | "Cancelling" | "Complete" | "Completing" | "Failed" | "Failing" | "New" | "Paused" | "Pausing" | "Preparing" | "Ready" | "Suspended" | String */
        var Manifest: JobManifest?
            get() = definedExternally
            set(value) = definedExternally
        var Operation: JobOperation?
            get() = definedExternally
            set(value) = definedExternally
        var Priority: JobPriority?
            get() = definedExternally
            set(value) = definedExternally
        var ProgressSummary: JobProgressSummary?
            get() = definedExternally
            set(value) = definedExternally
        var StatusUpdateReason: JobStatusUpdateReason?
            get() = definedExternally
            set(value) = definedExternally
        var FailureReasons: JobFailureList?
            get() = definedExternally
            set(value) = definedExternally
        var Report: JobReport?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: JobCreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var TerminationDate: JobTerminationDate?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: IAMRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var SuspendedDate: SuspendedDate?
            get() = definedExternally
            set(value) = definedExternally
        var SuspendedCause: SuspendedCause?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobFailure {
        var FailureCode: JobFailureCode?
            get() = definedExternally
            set(value) = definedExternally
        var FailureReason: JobFailureReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobListDescriptor {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var Description: NonEmptyMaxLength256String?
            get() = definedExternally
            set(value) = definedExternally
        var Operation: String /* "LambdaInvoke" | "S3PutObjectCopy" | "S3PutObjectAcl" | "S3PutObjectTagging" | "S3InitiateRestoreObject" | String */
        var Priority: JobPriority?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Active" | "Cancelled" | "Cancelling" | "Complete" | "Completing" | "Failed" | "Failing" | "New" | "Paused" | "Pausing" | "Preparing" | "Ready" | "Suspended" | String */
        var CreationTime: JobCreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var TerminationDate: JobTerminationDate?
            get() = definedExternally
            set(value) = definedExternally
        var ProgressSummary: JobProgressSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobManifest {
        var Spec: JobManifestSpec
        var Location: JobManifestLocation
    }
    interface JobManifestLocation {
        var ObjectArn: S3KeyArnString
        var ObjectVersionId: S3ObjectVersionId?
            get() = definedExternally
            set(value) = definedExternally
        var ETag: NonEmptyMaxLength1024String
    }
    interface JobManifestSpec {
        var Format: String /* "S3BatchOperations_CSV_20180820" | "S3InventoryReport_CSV_20161130" | String */
        var Fields: JobManifestFieldList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobOperation {
        var LambdaInvoke: LambdaInvokeOperation?
            get() = definedExternally
            set(value) = definedExternally
        var S3PutObjectCopy: S3CopyObjectOperation?
            get() = definedExternally
            set(value) = definedExternally
        var S3PutObjectAcl: S3SetObjectAclOperation?
            get() = definedExternally
            set(value) = definedExternally
        var S3PutObjectTagging: S3SetObjectTaggingOperation?
            get() = definedExternally
            set(value) = definedExternally
        var S3InitiateRestoreObject: S3InitiateRestoreObjectOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobProgressSummary {
        var TotalNumberOfTasks: JobTotalNumberOfTasks?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfTasksSucceeded: JobNumberOfTasksSucceeded?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfTasksFailed: JobNumberOfTasksFailed?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobReport {
        var Bucket: S3BucketArnString?
            get() = definedExternally
            set(value) = definedExternally
        var Format: String /* "Report_CSV_20180820" | String */
        var Enabled: Boolean
        var Prefix: ReportPrefixString?
            get() = definedExternally
            set(value) = definedExternally
        var ReportScope: String /* "AllTasks" | "FailedTasksOnly" | String */
    }
    interface LambdaInvokeOperation {
        var FunctionArn: NonEmptyMaxLength1024String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAccessPointsRequest {
        var AccountId: AccountId
        var Bucket: BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonEmptyMaxLength1024String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAccessPointsResult {
        var AccessPointList: AccessPointList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonEmptyMaxLength1024String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobsRequest {
        var AccountId: AccountId
        var JobStatuses: JobStatusList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonEmptyMaxLength1024String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobsResult {
        var NextToken: NonEmptyMaxLength1024String?
            get() = definedExternally
            set(value) = definedExternally
        var Jobs: JobListDescriptorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyStatus {
        var IsPublic: IsPublic?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PublicAccessBlockConfiguration {
        var BlockPublicAcls: Setting?
            get() = definedExternally
            set(value) = definedExternally
        var IgnorePublicAcls: Setting?
            get() = definedExternally
            set(value) = definedExternally
        var BlockPublicPolicy: Setting?
            get() = definedExternally
            set(value) = definedExternally
        var RestrictPublicBuckets: Setting?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutAccessPointPolicyRequest {
        var AccountId: AccountId
        var Name: AccessPointName
        var Policy: Policy
    }
    interface PutJobTaggingRequest {
        var AccountId: AccountId
        var JobId: JobId
        var Tags: S3TagSet
    }
    interface PutJobTaggingResult
    interface PutPublicAccessBlockRequest {
        var PublicAccessBlockConfiguration: PublicAccessBlockConfiguration
        var AccountId: AccountId
    }
    interface S3AccessControlList {
        var Owner: S3ObjectOwner
        var Grants: S3GrantList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3AccessControlPolicy {
        var AccessControlList: S3AccessControlList?
            get() = definedExternally
            set(value) = definedExternally
        var CannedAccessControlList: String /* "private" | "public-read" | "public-read-write" | "aws-exec-read" | "authenticated-read" | "bucket-owner-read" | "bucket-owner-full-control" | String */
    }
    interface S3CopyObjectOperation {
        var TargetResource: S3BucketArnString?
            get() = definedExternally
            set(value) = definedExternally
        var CannedAccessControlList: String /* "private" | "public-read" | "public-read-write" | "aws-exec-read" | "authenticated-read" | "bucket-owner-read" | "bucket-owner-full-control" | String */
        var AccessControlGrants: S3GrantList?
            get() = definedExternally
            set(value) = definedExternally
        var MetadataDirective: String /* "COPY" | "REPLACE" | String */
        var ModifiedSinceConstraint: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var NewObjectMetadata: S3ObjectMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var NewObjectTagging: S3TagSet?
            get() = definedExternally
            set(value) = definedExternally
        var RedirectLocation: NonEmptyMaxLength2048String?
            get() = definedExternally
            set(value) = definedExternally
        var RequesterPays: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var StorageClass: String /* "STANDARD" | "STANDARD_IA" | "ONEZONE_IA" | "GLACIER" | "INTELLIGENT_TIERING" | "DEEP_ARCHIVE" | String */
        var UnModifiedSinceConstraint: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var SSEAwsKmsKeyId: KmsKeyArnString?
            get() = definedExternally
            set(value) = definedExternally
        var TargetKeyPrefix: NonEmptyMaxLength1024String?
            get() = definedExternally
            set(value) = definedExternally
        var ObjectLockLegalHoldStatus: String /* "OFF" | "ON" | String */
        var ObjectLockMode: String /* "COMPLIANCE" | "GOVERNANCE" | String */
        var ObjectLockRetainUntilDate: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3Grant {
        var Grantee: S3Grantee?
            get() = definedExternally
            set(value) = definedExternally
        var Permission: String /* "FULL_CONTROL" | "READ" | "WRITE" | "READ_ACP" | "WRITE_ACP" | String */
    }
    interface S3Grantee {
        var TypeIdentifier: String /* "id" | "emailAddress" | "uri" | String */
        var Identifier: NonEmptyMaxLength1024String?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: NonEmptyMaxLength1024String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3InitiateRestoreObjectOperation {
        var ExpirationInDays: S3ExpirationInDays?
            get() = definedExternally
            set(value) = definedExternally
        var GlacierJobTier: String /* "BULK" | "STANDARD" | String */
    }
    interface S3ObjectMetadata {
        var CacheControl: NonEmptyMaxLength1024String?
            get() = definedExternally
            set(value) = definedExternally
        var ContentDisposition: NonEmptyMaxLength1024String?
            get() = definedExternally
            set(value) = definedExternally
        var ContentEncoding: NonEmptyMaxLength1024String?
            get() = definedExternally
            set(value) = definedExternally
        var ContentLanguage: NonEmptyMaxLength1024String?
            get() = definedExternally
            set(value) = definedExternally
        var UserMetadata: S3UserMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var ContentLength: S3ContentLength?
            get() = definedExternally
            set(value) = definedExternally
        var ContentMD5: NonEmptyMaxLength1024String?
            get() = definedExternally
            set(value) = definedExternally
        var ContentType: NonEmptyMaxLength1024String?
            get() = definedExternally
            set(value) = definedExternally
        var HttpExpiresDate: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var RequesterCharged: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SSEAlgorithm: String /* "AES256" | "KMS" | String */
    }
    interface S3ObjectOwner {
        var ID: NonEmptyMaxLength1024String?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: NonEmptyMaxLength1024String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3SetObjectAclOperation {
        var AccessControlPolicy: S3AccessControlPolicy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3SetObjectTaggingOperation {
        var TagSet: S3TagSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3Tag {
        var Key: NonEmptyMaxLength1024String
        var Value: MaxLength1024String
    }
    interface S3UserMetadata {
        @nativeGetter
        operator fun get(key: String): MaxLength1024String?
        @nativeSetter
        operator fun set(key: String, value: MaxLength1024String)
    }
    interface UpdateJobPriorityRequest {
        var AccountId: AccountId
        var JobId: JobId
        var Priority: JobPriority
    }
    interface UpdateJobPriorityResult {
        var JobId: JobId
        var Priority: JobPriority
    }
    interface UpdateJobStatusRequest {
        var AccountId: AccountId
        var JobId: JobId
        var RequestedJobStatus: String /* "Cancelled" | "Ready" | String */
        var StatusUpdateReason: JobStatusUpdateReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateJobStatusResult {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Active" | "Cancelled" | "Cancelling" | "Complete" | "Completing" | "Failed" | "Failing" | "New" | "Paused" | "Pausing" | "Preparing" | "Ready" | "Suspended" | String */
        var StatusUpdateReason: JobStatusUpdateReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VpcConfiguration {
        var VpcId: VpcId
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-08-20" | "latest" | String */
    }
}