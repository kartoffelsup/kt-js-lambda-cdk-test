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
import ElasticInference.ListTagsForResourceRequest
import ElasticInference.ListTagsForResourceResult
import ElasticInference.TagResourceRequest
import ElasticInference.TagResourceResult
import ElasticInference.UntagResourceRequest
import ElasticInference.UntagResourceResult
import ElasticInference.TagMap

typealias ResourceARN = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagValue = String

@JsModule("aws-sdk")
external open class ElasticInference(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ElasticInference.Types.ClientConfiguration */
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResult) -> Unit = definedExternally): Request<ListTagsForResourceResult, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResult) -> Unit = definedExternally): Request<ListTagsForResourceResult, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResult) -> Unit = definedExternally): Request<TagResourceResult, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResult) -> Unit = definedExternally): Request<TagResourceResult, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResult) -> Unit = definedExternally): Request<UntagResourceResult, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResult) -> Unit = definedExternally): Request<UntagResourceResult, AWSError>
    interface ListTagsForResourceRequest {
        var resourceArn: ResourceARN
    }
    interface ListTagsForResourceResult {
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagMap {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface TagResourceRequest {
        var resourceArn: ResourceARN
        var tags: TagMap
    }
    interface TagResourceResult
    interface UntagResourceRequest {
        var resourceArn: ResourceARN
        var tagKeys: TagKeyList
    }
    interface UntagResourceResult
    interface ClientApiVersions {
        var apiVersion: String /* "2017-07-25" | "latest" | String */
    }
}