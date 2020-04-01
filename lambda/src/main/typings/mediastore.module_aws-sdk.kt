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
import MediaStore.Container
import MediaStore.CorsRule
import MediaStore.Tag
import MediaStore.CreateContainerInput
import MediaStore.CreateContainerOutput
import MediaStore.DeleteContainerInput
import MediaStore.DeleteContainerOutput
import MediaStore.DeleteContainerPolicyInput
import MediaStore.DeleteContainerPolicyOutput
import MediaStore.DeleteCorsPolicyInput
import MediaStore.DeleteCorsPolicyOutput
import MediaStore.DeleteLifecyclePolicyInput
import MediaStore.DeleteLifecyclePolicyOutput
import MediaStore.DescribeContainerInput
import MediaStore.DescribeContainerOutput
import MediaStore.GetContainerPolicyInput
import MediaStore.GetContainerPolicyOutput
import MediaStore.GetCorsPolicyInput
import MediaStore.GetCorsPolicyOutput
import MediaStore.GetLifecyclePolicyInput
import MediaStore.GetLifecyclePolicyOutput
import MediaStore.ListContainersInput
import MediaStore.ListContainersOutput
import MediaStore.ListTagsForResourceInput
import MediaStore.ListTagsForResourceOutput
import MediaStore.PutContainerPolicyInput
import MediaStore.PutContainerPolicyOutput
import MediaStore.PutCorsPolicyInput
import MediaStore.PutCorsPolicyOutput
import MediaStore.PutLifecyclePolicyInput
import MediaStore.PutLifecyclePolicyOutput
import MediaStore.StartAccessLoggingInput
import MediaStore.StartAccessLoggingOutput
import MediaStore.StopAccessLoggingInput
import MediaStore.StopAccessLoggingOutput
import MediaStore.TagResourceInput
import MediaStore.TagResourceOutput
import MediaStore.UntagResourceInput
import MediaStore.UntagResourceOutput

typealias AllowedHeaders = Array<Header>

typealias AllowedMethods = Array<String /* "PUT" | "GET" | "DELETE" | "HEAD" | String */>

typealias AllowedOrigins = Array<Origin>

typealias ContainerARN = String

typealias ContainerAccessLoggingEnabled = Boolean

typealias ContainerList = Array<Container>

typealias ContainerListLimit = Number

typealias ContainerName = String

typealias ContainerPolicy = String

typealias CorsPolicy = Array<CorsRule>

typealias Endpoint = String

typealias ExposeHeaders = Array<Header>

typealias Header = String

typealias LifecyclePolicy = String

typealias MaxAgeSeconds = Number

typealias Origin = String

typealias PaginationToken = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TimeStamp = Date

@JsModule("aws-sdk")
external open class MediaStore(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & MediaStore.Types.ClientConfiguration */
    open fun createContainer(params: CreateContainerInput, callback: (err: AWSError, data: CreateContainerOutput) -> Unit = definedExternally): Request<CreateContainerOutput, AWSError>
    open fun createContainer(callback: (err: AWSError, data: CreateContainerOutput) -> Unit = definedExternally): Request<CreateContainerOutput, AWSError>
    open fun deleteContainer(params: DeleteContainerInput, callback: (err: AWSError, data: DeleteContainerOutput) -> Unit = definedExternally): Request<DeleteContainerOutput, AWSError>
    open fun deleteContainer(callback: (err: AWSError, data: DeleteContainerOutput) -> Unit = definedExternally): Request<DeleteContainerOutput, AWSError>
    open fun deleteContainerPolicy(params: DeleteContainerPolicyInput, callback: (err: AWSError, data: DeleteContainerPolicyOutput) -> Unit = definedExternally): Request<DeleteContainerPolicyOutput, AWSError>
    open fun deleteContainerPolicy(callback: (err: AWSError, data: DeleteContainerPolicyOutput) -> Unit = definedExternally): Request<DeleteContainerPolicyOutput, AWSError>
    open fun deleteCorsPolicy(params: DeleteCorsPolicyInput, callback: (err: AWSError, data: DeleteCorsPolicyOutput) -> Unit = definedExternally): Request<DeleteCorsPolicyOutput, AWSError>
    open fun deleteCorsPolicy(callback: (err: AWSError, data: DeleteCorsPolicyOutput) -> Unit = definedExternally): Request<DeleteCorsPolicyOutput, AWSError>
    open fun deleteLifecyclePolicy(params: DeleteLifecyclePolicyInput, callback: (err: AWSError, data: DeleteLifecyclePolicyOutput) -> Unit = definedExternally): Request<DeleteLifecyclePolicyOutput, AWSError>
    open fun deleteLifecyclePolicy(callback: (err: AWSError, data: DeleteLifecyclePolicyOutput) -> Unit = definedExternally): Request<DeleteLifecyclePolicyOutput, AWSError>
    open fun describeContainer(params: DescribeContainerInput, callback: (err: AWSError, data: DescribeContainerOutput) -> Unit = definedExternally): Request<DescribeContainerOutput, AWSError>
    open fun describeContainer(callback: (err: AWSError, data: DescribeContainerOutput) -> Unit = definedExternally): Request<DescribeContainerOutput, AWSError>
    open fun getContainerPolicy(params: GetContainerPolicyInput, callback: (err: AWSError, data: GetContainerPolicyOutput) -> Unit = definedExternally): Request<GetContainerPolicyOutput, AWSError>
    open fun getContainerPolicy(callback: (err: AWSError, data: GetContainerPolicyOutput) -> Unit = definedExternally): Request<GetContainerPolicyOutput, AWSError>
    open fun getCorsPolicy(params: GetCorsPolicyInput, callback: (err: AWSError, data: GetCorsPolicyOutput) -> Unit = definedExternally): Request<GetCorsPolicyOutput, AWSError>
    open fun getCorsPolicy(callback: (err: AWSError, data: GetCorsPolicyOutput) -> Unit = definedExternally): Request<GetCorsPolicyOutput, AWSError>
    open fun getLifecyclePolicy(params: GetLifecyclePolicyInput, callback: (err: AWSError, data: GetLifecyclePolicyOutput) -> Unit = definedExternally): Request<GetLifecyclePolicyOutput, AWSError>
    open fun getLifecyclePolicy(callback: (err: AWSError, data: GetLifecyclePolicyOutput) -> Unit = definedExternally): Request<GetLifecyclePolicyOutput, AWSError>
    open fun listContainers(params: ListContainersInput, callback: (err: AWSError, data: ListContainersOutput) -> Unit = definedExternally): Request<ListContainersOutput, AWSError>
    open fun listContainers(callback: (err: AWSError, data: ListContainersOutput) -> Unit = definedExternally): Request<ListContainersOutput, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceInput, callback: (err: AWSError, data: ListTagsForResourceOutput) -> Unit = definedExternally): Request<ListTagsForResourceOutput, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceOutput) -> Unit = definedExternally): Request<ListTagsForResourceOutput, AWSError>
    open fun putContainerPolicy(params: PutContainerPolicyInput, callback: (err: AWSError, data: PutContainerPolicyOutput) -> Unit = definedExternally): Request<PutContainerPolicyOutput, AWSError>
    open fun putContainerPolicy(callback: (err: AWSError, data: PutContainerPolicyOutput) -> Unit = definedExternally): Request<PutContainerPolicyOutput, AWSError>
    open fun putCorsPolicy(params: PutCorsPolicyInput, callback: (err: AWSError, data: PutCorsPolicyOutput) -> Unit = definedExternally): Request<PutCorsPolicyOutput, AWSError>
    open fun putCorsPolicy(callback: (err: AWSError, data: PutCorsPolicyOutput) -> Unit = definedExternally): Request<PutCorsPolicyOutput, AWSError>
    open fun putLifecyclePolicy(params: PutLifecyclePolicyInput, callback: (err: AWSError, data: PutLifecyclePolicyOutput) -> Unit = definedExternally): Request<PutLifecyclePolicyOutput, AWSError>
    open fun putLifecyclePolicy(callback: (err: AWSError, data: PutLifecyclePolicyOutput) -> Unit = definedExternally): Request<PutLifecyclePolicyOutput, AWSError>
    open fun startAccessLogging(params: StartAccessLoggingInput, callback: (err: AWSError, data: StartAccessLoggingOutput) -> Unit = definedExternally): Request<StartAccessLoggingOutput, AWSError>
    open fun startAccessLogging(callback: (err: AWSError, data: StartAccessLoggingOutput) -> Unit = definedExternally): Request<StartAccessLoggingOutput, AWSError>
    open fun stopAccessLogging(params: StopAccessLoggingInput, callback: (err: AWSError, data: StopAccessLoggingOutput) -> Unit = definedExternally): Request<StopAccessLoggingOutput, AWSError>
    open fun stopAccessLogging(callback: (err: AWSError, data: StopAccessLoggingOutput) -> Unit = definedExternally): Request<StopAccessLoggingOutput, AWSError>
    open fun tagResource(params: TagResourceInput, callback: (err: AWSError, data: TagResourceOutput) -> Unit = definedExternally): Request<TagResourceOutput, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceOutput) -> Unit = definedExternally): Request<TagResourceOutput, AWSError>
    open fun untagResource(params: UntagResourceInput, callback: (err: AWSError, data: UntagResourceOutput) -> Unit = definedExternally): Request<UntagResourceOutput, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceOutput) -> Unit = definedExternally): Request<UntagResourceOutput, AWSError>
    interface Container {
        var Endpoint: Endpoint?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var ARN: ContainerARN?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ContainerName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "ACTIVE" | "CREATING" | "DELETING" | String */
        var AccessLoggingEnabled: ContainerAccessLoggingEnabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CorsRule {
        var AllowedOrigins: AllowedOrigins
        var AllowedMethods: AllowedMethods?
            get() = definedExternally
            set(value) = definedExternally
        var AllowedHeaders: AllowedHeaders
        var MaxAgeSeconds: MaxAgeSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var ExposeHeaders: ExposeHeaders?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateContainerInput {
        var ContainerName: ContainerName
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateContainerOutput {
        var Container: Container
    }
    interface DeleteContainerInput {
        var ContainerName: ContainerName
    }
    interface DeleteContainerOutput
    interface DeleteContainerPolicyInput {
        var ContainerName: ContainerName
    }
    interface DeleteContainerPolicyOutput
    interface DeleteCorsPolicyInput {
        var ContainerName: ContainerName
    }
    interface DeleteCorsPolicyOutput
    interface DeleteLifecyclePolicyInput {
        var ContainerName: ContainerName
    }
    interface DeleteLifecyclePolicyOutput
    interface DescribeContainerInput {
        var ContainerName: ContainerName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeContainerOutput {
        var Container: Container?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetContainerPolicyInput {
        var ContainerName: ContainerName
    }
    interface GetContainerPolicyOutput {
        var Policy: ContainerPolicy
    }
    interface GetCorsPolicyInput {
        var ContainerName: ContainerName
    }
    interface GetCorsPolicyOutput {
        var CorsPolicy: CorsPolicy
    }
    interface GetLifecyclePolicyInput {
        var ContainerName: ContainerName
    }
    interface GetLifecyclePolicyOutput {
        var LifecyclePolicy: LifecyclePolicy
    }
    interface ListContainersInput {
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ContainerListLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListContainersOutput {
        var Containers: ContainerList
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceInput {
        var Resource: ContainerARN
    }
    interface ListTagsForResourceOutput {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutContainerPolicyInput {
        var ContainerName: ContainerName
        var Policy: ContainerPolicy
    }
    interface PutContainerPolicyOutput
    interface PutCorsPolicyInput {
        var ContainerName: ContainerName
        var CorsPolicy: CorsPolicy
    }
    interface PutCorsPolicyOutput
    interface PutLifecyclePolicyInput {
        var ContainerName: ContainerName
        var LifecyclePolicy: LifecyclePolicy
    }
    interface PutLifecyclePolicyOutput
    interface StartAccessLoggingInput {
        var ContainerName: ContainerName
    }
    interface StartAccessLoggingOutput
    interface StopAccessLoggingInput {
        var ContainerName: ContainerName
    }
    interface StopAccessLoggingOutput
    interface Tag {
        var Key: TagKey
        var Value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceInput {
        var Resource: ContainerARN
        var Tags: TagList
    }
    interface TagResourceOutput
    interface UntagResourceInput {
        var Resource: ContainerARN
        var TagKeys: TagKeyList
    }
    interface UntagResourceOutput
    interface ClientApiVersions {
        var apiVersion: String /* "2017-09-01" | "latest" | String */
    }
}