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
import IoTJobsDataPlane.JobExecutionSummary
import IoTJobsDataPlane.DescribeJobExecutionRequest
import IoTJobsDataPlane.DescribeJobExecutionResponse
import IoTJobsDataPlane.GetPendingJobExecutionsRequest
import IoTJobsDataPlane.GetPendingJobExecutionsResponse
import IoTJobsDataPlane.StartNextPendingJobExecutionRequest
import IoTJobsDataPlane.StartNextPendingJobExecutionResponse
import IoTJobsDataPlane.UpdateJobExecutionRequest
import IoTJobsDataPlane.UpdateJobExecutionResponse
import IoTJobsDataPlane.JobExecution
import IoTJobsDataPlane.DetailsMap
import IoTJobsDataPlane.JobExecutionState

typealias ApproximateSecondsBeforeTimedOut = Number

typealias DescribeJobExecutionJobId = String

typealias DetailsKey = String

typealias DetailsValue = String

typealias ExecutionNumber = Number

typealias ExpectedVersion = Number

typealias IncludeExecutionState = Boolean

typealias IncludeJobDocument = Boolean

typealias JobDocument = String

typealias JobExecutionSummaryList = Array<JobExecutionSummary>

typealias JobId = String

typealias LastUpdatedAt = Number

typealias QueuedAt = Number

typealias StartedAt = Number

typealias StepTimeoutInMinutes = Number

typealias ThingName = String

typealias VersionNumber = Number

@JsModule("aws-sdk")
external open class IoTJobsDataPlane(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & IoTJobsDataPlane.Types.ClientConfiguration */
    open fun describeJobExecution(params: DescribeJobExecutionRequest, callback: (err: AWSError, data: DescribeJobExecutionResponse) -> Unit = definedExternally): Request<DescribeJobExecutionResponse, AWSError>
    open fun describeJobExecution(callback: (err: AWSError, data: DescribeJobExecutionResponse) -> Unit = definedExternally): Request<DescribeJobExecutionResponse, AWSError>
    open fun getPendingJobExecutions(params: GetPendingJobExecutionsRequest, callback: (err: AWSError, data: GetPendingJobExecutionsResponse) -> Unit = definedExternally): Request<GetPendingJobExecutionsResponse, AWSError>
    open fun getPendingJobExecutions(callback: (err: AWSError, data: GetPendingJobExecutionsResponse) -> Unit = definedExternally): Request<GetPendingJobExecutionsResponse, AWSError>
    open fun startNextPendingJobExecution(params: StartNextPendingJobExecutionRequest, callback: (err: AWSError, data: StartNextPendingJobExecutionResponse) -> Unit = definedExternally): Request<StartNextPendingJobExecutionResponse, AWSError>
    open fun startNextPendingJobExecution(callback: (err: AWSError, data: StartNextPendingJobExecutionResponse) -> Unit = definedExternally): Request<StartNextPendingJobExecutionResponse, AWSError>
    open fun updateJobExecution(params: UpdateJobExecutionRequest, callback: (err: AWSError, data: UpdateJobExecutionResponse) -> Unit = definedExternally): Request<UpdateJobExecutionResponse, AWSError>
    open fun updateJobExecution(callback: (err: AWSError, data: UpdateJobExecutionResponse) -> Unit = definedExternally): Request<UpdateJobExecutionResponse, AWSError>
    interface DescribeJobExecutionRequest {
        var jobId: DescribeJobExecutionJobId
        var thingName: ThingName
        var includeJobDocument: IncludeJobDocument?
            get() = definedExternally
            set(value) = definedExternally
        var executionNumber: ExecutionNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeJobExecutionResponse {
        var execution: JobExecution?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetailsMap {
        @nativeGetter
        operator fun get(key: String): DetailsValue?
        @nativeSetter
        operator fun set(key: String, value: DetailsValue)
    }
    interface GetPendingJobExecutionsRequest {
        var thingName: ThingName
    }
    interface GetPendingJobExecutionsResponse {
        var inProgressJobs: JobExecutionSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var queuedJobs: JobExecutionSummaryList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobExecution {
        var jobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var thingName: ThingName?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "QUEUED" | "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "TIMED_OUT" | "REJECTED" | "REMOVED" | "CANCELED" | String */
        var statusDetails: DetailsMap?
            get() = definedExternally
            set(value) = definedExternally
        var queuedAt: QueuedAt?
            get() = definedExternally
            set(value) = definedExternally
        var startedAt: StartedAt?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: LastUpdatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var approximateSecondsBeforeTimedOut: ApproximateSecondsBeforeTimedOut?
            get() = definedExternally
            set(value) = definedExternally
        var versionNumber: VersionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var executionNumber: ExecutionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var jobDocument: JobDocument?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobExecutionState {
        var status: String /* "QUEUED" | "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "TIMED_OUT" | "REJECTED" | "REMOVED" | "CANCELED" | String */
        var statusDetails: DetailsMap?
            get() = definedExternally
            set(value) = definedExternally
        var versionNumber: VersionNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobExecutionSummary {
        var jobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var queuedAt: QueuedAt?
            get() = definedExternally
            set(value) = definedExternally
        var startedAt: StartedAt?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: LastUpdatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var versionNumber: VersionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var executionNumber: ExecutionNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartNextPendingJobExecutionRequest {
        var thingName: ThingName
        var statusDetails: DetailsMap?
            get() = definedExternally
            set(value) = definedExternally
        var stepTimeoutInMinutes: StepTimeoutInMinutes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartNextPendingJobExecutionResponse {
        var execution: JobExecution?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateJobExecutionRequest {
        var jobId: JobId
        var thingName: ThingName
        var status: String /* "QUEUED" | "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "TIMED_OUT" | "REJECTED" | "REMOVED" | "CANCELED" | String */
        var statusDetails: DetailsMap?
            get() = definedExternally
            set(value) = definedExternally
        var stepTimeoutInMinutes: StepTimeoutInMinutes?
            get() = definedExternally
            set(value) = definedExternally
        var expectedVersion: ExpectedVersion?
            get() = definedExternally
            set(value) = definedExternally
        var includeJobExecutionState: IncludeExecutionState?
            get() = definedExternally
            set(value) = definedExternally
        var includeJobDocument: IncludeJobDocument?
            get() = definedExternally
            set(value) = definedExternally
        var executionNumber: ExecutionNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateJobExecutionResponse {
        var executionState: JobExecutionState?
            get() = definedExternally
            set(value) = definedExternally
        var jobDocument: JobDocument?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-09-29" | "latest" | String */
    }
}