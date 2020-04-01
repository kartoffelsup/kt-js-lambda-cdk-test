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
import Cloud9.Environment
import Cloud9.EnvironmentMember
import Cloud9.Tag
import Cloud9.CreateEnvironmentEC2Request
import Cloud9.CreateEnvironmentEC2Result
import Cloud9.CreateEnvironmentMembershipRequest
import Cloud9.CreateEnvironmentMembershipResult
import Cloud9.DeleteEnvironmentRequest
import Cloud9.DeleteEnvironmentResult
import Cloud9.DeleteEnvironmentMembershipRequest
import Cloud9.DeleteEnvironmentMembershipResult
import Cloud9.DescribeEnvironmentMembershipsRequest
import Cloud9.DescribeEnvironmentMembershipsResult
import Cloud9.DescribeEnvironmentStatusRequest
import Cloud9.DescribeEnvironmentStatusResult
import Cloud9.DescribeEnvironmentsRequest
import Cloud9.DescribeEnvironmentsResult
import Cloud9.ListEnvironmentsRequest
import Cloud9.ListEnvironmentsResult
import Cloud9.ListTagsForResourceRequest
import Cloud9.ListTagsForResourceResponse
import Cloud9.TagResourceRequest
import Cloud9.TagResourceResponse
import Cloud9.UntagResourceRequest
import Cloud9.UntagResourceResponse
import Cloud9.UpdateEnvironmentRequest
import Cloud9.UpdateEnvironmentResult
import Cloud9.UpdateEnvironmentMembershipRequest
import Cloud9.UpdateEnvironmentMembershipResult
import Cloud9.EnvironmentLifecycle

typealias AutomaticStopTimeMinutes = Number

typealias BoundedEnvironmentIdList = Array<EnvironmentId>

typealias ClientRequestToken = String

typealias EnvironmentArn = String

typealias EnvironmentDescription = String

typealias EnvironmentId = String

typealias EnvironmentIdList = Array<EnvironmentId>

typealias EnvironmentList = Array<Environment>

typealias EnvironmentMembersList = Array<EnvironmentMember>

typealias EnvironmentName = String

typealias InstanceType = String

typealias MaxResults = Number

typealias PermissionsList = Array<String /* "owner" | "read-write" | "read-only" | String */>

typealias String = String

typealias SubnetId = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias Timestamp = Date

typealias UserArn = String

@JsModule("aws-sdk")
external open class Cloud9(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Cloud9.Types.ClientConfiguration */
    open fun createEnvironmentEC2(params: CreateEnvironmentEC2Request, callback: (err: AWSError, data: CreateEnvironmentEC2Result) -> Unit = definedExternally): Request<CreateEnvironmentEC2Result, AWSError>
    open fun createEnvironmentEC2(callback: (err: AWSError, data: CreateEnvironmentEC2Result) -> Unit = definedExternally): Request<CreateEnvironmentEC2Result, AWSError>
    open fun createEnvironmentMembership(params: CreateEnvironmentMembershipRequest, callback: (err: AWSError, data: CreateEnvironmentMembershipResult) -> Unit = definedExternally): Request<CreateEnvironmentMembershipResult, AWSError>
    open fun createEnvironmentMembership(callback: (err: AWSError, data: CreateEnvironmentMembershipResult) -> Unit = definedExternally): Request<CreateEnvironmentMembershipResult, AWSError>
    open fun deleteEnvironment(params: DeleteEnvironmentRequest, callback: (err: AWSError, data: DeleteEnvironmentResult) -> Unit = definedExternally): Request<DeleteEnvironmentResult, AWSError>
    open fun deleteEnvironment(callback: (err: AWSError, data: DeleteEnvironmentResult) -> Unit = definedExternally): Request<DeleteEnvironmentResult, AWSError>
    open fun deleteEnvironmentMembership(params: DeleteEnvironmentMembershipRequest, callback: (err: AWSError, data: DeleteEnvironmentMembershipResult) -> Unit = definedExternally): Request<DeleteEnvironmentMembershipResult, AWSError>
    open fun deleteEnvironmentMembership(callback: (err: AWSError, data: DeleteEnvironmentMembershipResult) -> Unit = definedExternally): Request<DeleteEnvironmentMembershipResult, AWSError>
    open fun describeEnvironmentMemberships(params: DescribeEnvironmentMembershipsRequest, callback: (err: AWSError, data: DescribeEnvironmentMembershipsResult) -> Unit = definedExternally): Request<DescribeEnvironmentMembershipsResult, AWSError>
    open fun describeEnvironmentMemberships(callback: (err: AWSError, data: DescribeEnvironmentMembershipsResult) -> Unit = definedExternally): Request<DescribeEnvironmentMembershipsResult, AWSError>
    open fun describeEnvironmentStatus(params: DescribeEnvironmentStatusRequest, callback: (err: AWSError, data: DescribeEnvironmentStatusResult) -> Unit = definedExternally): Request<DescribeEnvironmentStatusResult, AWSError>
    open fun describeEnvironmentStatus(callback: (err: AWSError, data: DescribeEnvironmentStatusResult) -> Unit = definedExternally): Request<DescribeEnvironmentStatusResult, AWSError>
    open fun describeEnvironments(params: DescribeEnvironmentsRequest, callback: (err: AWSError, data: DescribeEnvironmentsResult) -> Unit = definedExternally): Request<DescribeEnvironmentsResult, AWSError>
    open fun describeEnvironments(callback: (err: AWSError, data: DescribeEnvironmentsResult) -> Unit = definedExternally): Request<DescribeEnvironmentsResult, AWSError>
    open fun listEnvironments(params: ListEnvironmentsRequest, callback: (err: AWSError, data: ListEnvironmentsResult) -> Unit = definedExternally): Request<ListEnvironmentsResult, AWSError>
    open fun listEnvironments(callback: (err: AWSError, data: ListEnvironmentsResult) -> Unit = definedExternally): Request<ListEnvironmentsResult, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateEnvironment(params: UpdateEnvironmentRequest, callback: (err: AWSError, data: UpdateEnvironmentResult) -> Unit = definedExternally): Request<UpdateEnvironmentResult, AWSError>
    open fun updateEnvironment(callback: (err: AWSError, data: UpdateEnvironmentResult) -> Unit = definedExternally): Request<UpdateEnvironmentResult, AWSError>
    open fun updateEnvironmentMembership(params: UpdateEnvironmentMembershipRequest, callback: (err: AWSError, data: UpdateEnvironmentMembershipResult) -> Unit = definedExternally): Request<UpdateEnvironmentMembershipResult, AWSError>
    open fun updateEnvironmentMembership(callback: (err: AWSError, data: UpdateEnvironmentMembershipResult) -> Unit = definedExternally): Request<UpdateEnvironmentMembershipResult, AWSError>
    interface CreateEnvironmentEC2Request {
        var name: EnvironmentName
        var description: EnvironmentDescription?
            get() = definedExternally
            set(value) = definedExternally
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var instanceType: InstanceType
        var subnetId: SubnetId?
            get() = definedExternally
            set(value) = definedExternally
        var automaticStopTimeMinutes: AutomaticStopTimeMinutes?
            get() = definedExternally
            set(value) = definedExternally
        var ownerArn: UserArn?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEnvironmentEC2Result {
        var environmentId: EnvironmentId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEnvironmentMembershipRequest {
        var environmentId: EnvironmentId
        var userArn: UserArn
        var permissions: String /* "read-write" | "read-only" | String */
    }
    interface CreateEnvironmentMembershipResult {
        var membership: EnvironmentMember?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteEnvironmentMembershipRequest {
        var environmentId: EnvironmentId
        var userArn: UserArn
    }
    interface DeleteEnvironmentMembershipResult
    interface DeleteEnvironmentRequest {
        var environmentId: EnvironmentId
    }
    interface DeleteEnvironmentResult
    interface DescribeEnvironmentMembershipsRequest {
        var userArn: UserArn?
            get() = definedExternally
            set(value) = definedExternally
        var environmentId: EnvironmentId?
            get() = definedExternally
            set(value) = definedExternally
        var permissions: PermissionsList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEnvironmentMembershipsResult {
        var memberships: EnvironmentMembersList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEnvironmentStatusRequest {
        var environmentId: EnvironmentId
    }
    interface DescribeEnvironmentStatusResult {
        var status: String /* "error" | "creating" | "connecting" | "ready" | "stopping" | "stopped" | "deleting" | String */
        var message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEnvironmentsRequest {
        var environmentIds: BoundedEnvironmentIdList
    }
    interface DescribeEnvironmentsResult {
        var environments: EnvironmentList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Environment {
        var id: EnvironmentId?
            get() = definedExternally
            set(value) = definedExternally
        var name: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var description: EnvironmentDescription?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "ssh" | "ec2" | String */
        var arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ownerArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var lifecycle: EnvironmentLifecycle?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnvironmentLifecycle {
        var status: String /* "CREATING" | "CREATED" | "CREATE_FAILED" | "DELETING" | "DELETE_FAILED" | String */
        var reason: String?
            get() = definedExternally
            set(value) = definedExternally
        var failureResource: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnvironmentMember {
        var permissions: String /* "owner" | "read-write" | "read-only" | String */
        var userId: String?
            get() = definedExternally
            set(value) = definedExternally
        var userArn: UserArn?
            get() = definedExternally
            set(value) = definedExternally
        var environmentId: EnvironmentId?
            get() = definedExternally
            set(value) = definedExternally
        var lastAccess: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEnvironmentsRequest {
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEnvironmentsResult {
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var environmentIds: EnvironmentIdList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceARN: EnvironmentArn
    }
    interface ListTagsForResourceResponse {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface TagResourceRequest {
        var ResourceARN: EnvironmentArn
        var Tags: TagList
    }
    interface TagResourceResponse
    interface UntagResourceRequest {
        var ResourceARN: EnvironmentArn
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateEnvironmentMembershipRequest {
        var environmentId: EnvironmentId
        var userArn: UserArn
        var permissions: String /* "read-write" | "read-only" | String */
    }
    interface UpdateEnvironmentMembershipResult {
        var membership: EnvironmentMember?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateEnvironmentRequest {
        var environmentId: EnvironmentId
        var name: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var description: EnvironmentDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateEnvironmentResult
    interface ClientApiVersions {
        var apiVersion: String /* "2017-09-23" | "latest" | String */
    }
}