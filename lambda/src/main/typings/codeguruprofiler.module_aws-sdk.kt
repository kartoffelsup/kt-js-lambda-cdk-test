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
import CodeGuruProfiler.ProfileTime
import CodeGuruProfiler.ProfilingGroupDescription
import CodeGuruProfiler.ConfigureAgentRequest
import CodeGuruProfiler.ConfigureAgentResponse
import CodeGuruProfiler.CreateProfilingGroupRequest
import CodeGuruProfiler.CreateProfilingGroupResponse
import CodeGuruProfiler.DeleteProfilingGroupRequest
import CodeGuruProfiler.DeleteProfilingGroupResponse
import CodeGuruProfiler.DescribeProfilingGroupRequest
import CodeGuruProfiler.DescribeProfilingGroupResponse
import CodeGuruProfiler.GetProfileRequest
import CodeGuruProfiler.GetProfileResponse
import CodeGuruProfiler.ListProfileTimesRequest
import CodeGuruProfiler.ListProfileTimesResponse
import CodeGuruProfiler.ListProfilingGroupsRequest
import CodeGuruProfiler.ListProfilingGroupsResponse
import CodeGuruProfiler.PostAgentProfileRequest
import CodeGuruProfiler.PostAgentProfileResponse
import CodeGuruProfiler.UpdateProfilingGroupRequest
import CodeGuruProfiler.UpdateProfilingGroupResponse
import CodeGuruProfiler.AgentConfiguration
import CodeGuruProfiler.AgentOrchestrationConfig
import CodeGuruProfiler.ProfilingStatus
import CodeGuruProfiler.AggregatedProfileTime

typealias Boolean = Boolean

typealias ClientToken = String

typealias FleetInstanceId = String

typealias Integer = Number

typealias MaxDepth = Number

typealias MaxResults = Number

typealias PaginationToken = String

typealias Period = String

typealias ProfileTimes = Array<ProfileTime>

typealias ProfilingGroupArn = String

typealias ProfilingGroupDescriptions = Array<ProfilingGroupDescription>

typealias ProfilingGroupName = String

typealias ProfilingGroupNames = Array<ProfilingGroupName>

typealias String = String

typealias Timestamp = Date

@JsModule("aws-sdk")
external open class CodeGuruProfiler(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CodeGuruProfiler.Types.ClientConfiguration */
    open fun configureAgent(params: ConfigureAgentRequest, callback: (err: AWSError, data: ConfigureAgentResponse) -> Unit = definedExternally): Request<ConfigureAgentResponse, AWSError>
    open fun configureAgent(callback: (err: AWSError, data: ConfigureAgentResponse) -> Unit = definedExternally): Request<ConfigureAgentResponse, AWSError>
    open fun createProfilingGroup(params: CreateProfilingGroupRequest, callback: (err: AWSError, data: CreateProfilingGroupResponse) -> Unit = definedExternally): Request<CreateProfilingGroupResponse, AWSError>
    open fun createProfilingGroup(callback: (err: AWSError, data: CreateProfilingGroupResponse) -> Unit = definedExternally): Request<CreateProfilingGroupResponse, AWSError>
    open fun deleteProfilingGroup(params: DeleteProfilingGroupRequest, callback: (err: AWSError, data: DeleteProfilingGroupResponse) -> Unit = definedExternally): Request<DeleteProfilingGroupResponse, AWSError>
    open fun deleteProfilingGroup(callback: (err: AWSError, data: DeleteProfilingGroupResponse) -> Unit = definedExternally): Request<DeleteProfilingGroupResponse, AWSError>
    open fun describeProfilingGroup(params: DescribeProfilingGroupRequest, callback: (err: AWSError, data: DescribeProfilingGroupResponse) -> Unit = definedExternally): Request<DescribeProfilingGroupResponse, AWSError>
    open fun describeProfilingGroup(callback: (err: AWSError, data: DescribeProfilingGroupResponse) -> Unit = definedExternally): Request<DescribeProfilingGroupResponse, AWSError>
    open fun getProfile(params: GetProfileRequest, callback: (err: AWSError, data: GetProfileResponse) -> Unit = definedExternally): Request<GetProfileResponse, AWSError>
    open fun getProfile(callback: (err: AWSError, data: GetProfileResponse) -> Unit = definedExternally): Request<GetProfileResponse, AWSError>
    open fun listProfileTimes(params: ListProfileTimesRequest, callback: (err: AWSError, data: ListProfileTimesResponse) -> Unit = definedExternally): Request<ListProfileTimesResponse, AWSError>
    open fun listProfileTimes(callback: (err: AWSError, data: ListProfileTimesResponse) -> Unit = definedExternally): Request<ListProfileTimesResponse, AWSError>
    open fun listProfilingGroups(params: ListProfilingGroupsRequest, callback: (err: AWSError, data: ListProfilingGroupsResponse) -> Unit = definedExternally): Request<ListProfilingGroupsResponse, AWSError>
    open fun listProfilingGroups(callback: (err: AWSError, data: ListProfilingGroupsResponse) -> Unit = definedExternally): Request<ListProfilingGroupsResponse, AWSError>
    open fun postAgentProfile(params: PostAgentProfileRequest, callback: (err: AWSError, data: PostAgentProfileResponse) -> Unit = definedExternally): Request<PostAgentProfileResponse, AWSError>
    open fun postAgentProfile(callback: (err: AWSError, data: PostAgentProfileResponse) -> Unit = definedExternally): Request<PostAgentProfileResponse, AWSError>
    open fun updateProfilingGroup(params: UpdateProfilingGroupRequest, callback: (err: AWSError, data: UpdateProfilingGroupResponse) -> Unit = definedExternally): Request<UpdateProfilingGroupResponse, AWSError>
    open fun updateProfilingGroup(callback: (err: AWSError, data: UpdateProfilingGroupResponse) -> Unit = definedExternally): Request<UpdateProfilingGroupResponse, AWSError>
    interface AgentConfiguration {
        var periodInSeconds: Integer
        var shouldProfile: Boolean
    }
    interface AgentOrchestrationConfig {
        var profilingEnabled: Boolean
    }
    interface AggregatedProfileTime {
        var period: String /* "P1D" | "PT1H" | "PT5M" | String */
        var start: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigureAgentRequest {
        var fleetInstanceId: FleetInstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var profilingGroupName: ProfilingGroupName
    }
    interface ConfigureAgentResponse {
        var configuration: AgentConfiguration
    }
    interface CreateProfilingGroupRequest {
        var agentOrchestrationConfig: AgentOrchestrationConfig?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken
        var profilingGroupName: ProfilingGroupName
    }
    interface CreateProfilingGroupResponse {
        var profilingGroup: ProfilingGroupDescription
    }
    interface DeleteProfilingGroupRequest {
        var profilingGroupName: ProfilingGroupName
    }
    interface DeleteProfilingGroupResponse
    interface DescribeProfilingGroupRequest {
        var profilingGroupName: ProfilingGroupName
    }
    interface DescribeProfilingGroupResponse {
        var profilingGroup: ProfilingGroupDescription
    }
    interface GetProfileRequest {
        var accept: String?
            get() = definedExternally
            set(value) = definedExternally
        var endTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var maxDepth: MaxDepth?
            get() = definedExternally
            set(value) = definedExternally
        var period: Period?
            get() = definedExternally
            set(value) = definedExternally
        var profilingGroupName: ProfilingGroupName
        var startTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetProfileResponse {
        var contentEncoding: String?
            get() = definedExternally
            set(value) = definedExternally
        var contentType: String
        var profile: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProfileTimesRequest {
        var endTime: Timestamp
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var orderBy: String /* "TimestampAscending" | "TimestampDescending" | String */
        var period: String /* "P1D" | "PT1H" | "PT5M" | String */
        var profilingGroupName: ProfilingGroupName
        var startTime: Timestamp
    }
    interface ListProfileTimesResponse {
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var profileTimes: ProfileTimes
    }
    interface ListProfilingGroupsRequest {
        var includeDescription: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProfilingGroupsResponse {
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var profilingGroupNames: ProfilingGroupNames
        var profilingGroups: ProfilingGroupDescriptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PostAgentProfileRequest {
        var agentProfile: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var contentType: String
        var profileToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var profilingGroupName: ProfilingGroupName
    }
    interface PostAgentProfileResponse
    interface ProfileTime {
        var start: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProfilingGroupDescription {
        var agentOrchestrationConfig: AgentOrchestrationConfig?
            get() = definedExternally
            set(value) = definedExternally
        var arn: ProfilingGroupArn?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var name: ProfilingGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var profilingStatus: ProfilingStatus?
            get() = definedExternally
            set(value) = definedExternally
        var updatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProfilingStatus {
        var latestAgentOrchestratedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var latestAgentProfileReportedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var latestAggregatedProfile: AggregatedProfileTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateProfilingGroupRequest {
        var agentOrchestrationConfig: AgentOrchestrationConfig
        var profilingGroupName: ProfilingGroupName
    }
    interface UpdateProfilingGroupResponse {
        var profilingGroup: ProfilingGroupDescription
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-07-18" | "latest" | String */
    }
}