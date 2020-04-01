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
import Signer.CancelSigningProfileRequest
import Signer.DescribeSigningJobRequest
import Signer.DescribeSigningJobResponse
import Signer.GetSigningPlatformRequest
import Signer.GetSigningPlatformResponse
import Signer.GetSigningProfileRequest
import Signer.GetSigningProfileResponse
import Signer.ListSigningJobsRequest
import Signer.ListSigningJobsResponse
import Signer.ListSigningPlatformsRequest
import Signer.ListSigningPlatformsResponse
import Signer.ListSigningProfilesRequest
import Signer.ListSigningProfilesResponse
import Signer.ListTagsForResourceRequest
import Signer.ListTagsForResourceResponse
import Signer.PutSigningProfileRequest
import Signer.PutSigningProfileResponse
import Signer.StartSigningJobRequest
import Signer.StartSigningJobResponse
import Signer.TagResourceRequest
import Signer.TagResourceResponse
import Signer.UntagResourceRequest
import Signer.UntagResourceResponse
import Signer.SignerOptions
import Signer.SignerOptionsWithPolicy
import Signer.CustomPolicy
import Signer.SignerOptionsWithoutPolicy
import Signer.CannedPolicy

external open class Signer(keyPairId: String, privateKey: String) : Service {
    open var config: ConfigBase /* Config & Signer.Types.ClientConfiguration */
    open fun cancelSigningProfile(params: CancelSigningProfileRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun cancelSigningProfile(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeSigningJob(params: DescribeSigningJobRequest, callback: (err: AWSError, data: DescribeSigningJobResponse) -> Unit = definedExternally): Request<DescribeSigningJobResponse, AWSError>
    open fun describeSigningJob(callback: (err: AWSError, data: DescribeSigningJobResponse) -> Unit = definedExternally): Request<DescribeSigningJobResponse, AWSError>
    open fun getSigningPlatform(params: GetSigningPlatformRequest, callback: (err: AWSError, data: GetSigningPlatformResponse) -> Unit = definedExternally): Request<GetSigningPlatformResponse, AWSError>
    open fun getSigningPlatform(callback: (err: AWSError, data: GetSigningPlatformResponse) -> Unit = definedExternally): Request<GetSigningPlatformResponse, AWSError>
    open fun getSigningProfile(params: GetSigningProfileRequest, callback: (err: AWSError, data: GetSigningProfileResponse) -> Unit = definedExternally): Request<GetSigningProfileResponse, AWSError>
    open fun getSigningProfile(callback: (err: AWSError, data: GetSigningProfileResponse) -> Unit = definedExternally): Request<GetSigningProfileResponse, AWSError>
    open fun listSigningJobs(params: ListSigningJobsRequest, callback: (err: AWSError, data: ListSigningJobsResponse) -> Unit = definedExternally): Request<ListSigningJobsResponse, AWSError>
    open fun listSigningJobs(callback: (err: AWSError, data: ListSigningJobsResponse) -> Unit = definedExternally): Request<ListSigningJobsResponse, AWSError>
    open fun listSigningPlatforms(params: ListSigningPlatformsRequest, callback: (err: AWSError, data: ListSigningPlatformsResponse) -> Unit = definedExternally): Request<ListSigningPlatformsResponse, AWSError>
    open fun listSigningPlatforms(callback: (err: AWSError, data: ListSigningPlatformsResponse) -> Unit = definedExternally): Request<ListSigningPlatformsResponse, AWSError>
    open fun listSigningProfiles(params: ListSigningProfilesRequest, callback: (err: AWSError, data: ListSigningProfilesResponse) -> Unit = definedExternally): Request<ListSigningProfilesResponse, AWSError>
    open fun listSigningProfiles(callback: (err: AWSError, data: ListSigningProfilesResponse) -> Unit = definedExternally): Request<ListSigningProfilesResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun putSigningProfile(params: PutSigningProfileRequest, callback: (err: AWSError, data: PutSigningProfileResponse) -> Unit = definedExternally): Request<PutSigningProfileResponse, AWSError>
    open fun putSigningProfile(callback: (err: AWSError, data: PutSigningProfileResponse) -> Unit = definedExternally): Request<PutSigningProfileResponse, AWSError>
    open fun startSigningJob(params: StartSigningJobRequest, callback: (err: AWSError, data: StartSigningJobResponse) -> Unit = definedExternally): Request<StartSigningJobResponse, AWSError>
    open fun startSigningJob(callback: (err: AWSError, data: StartSigningJobResponse) -> Unit = definedExternally): Request<StartSigningJobResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun waitFor(state: String /* "successfulSigningJob" */, params: DescribeSigningJobRequest /* Signer.Types.DescribeSigningJobRequest & `T$0` */, callback: (err: AWSError, data: DescribeSigningJobResponse) -> Unit = definedExternally): Request<DescribeSigningJobResponse, AWSError>
    open fun waitFor(state: String /* "successfulSigningJob" */, callback: (err: AWSError, data: DescribeSigningJobResponse) -> Unit = definedExternally): Request<DescribeSigningJobResponse, AWSError>
    open fun getAuthToken(options: SignerOptions, callback: (err: AWSError, token: String) -> Unit)
    open fun getAuthToken(options: SignerOptions): String
    open fun getSignedCookie(options: SignerOptionsWithPolicy): CustomPolicy
    open fun getSignedCookie(options: SignerOptionsWithoutPolicy): CannedPolicy
    open fun getSignedCookie(options: SignerOptionsWithPolicy, callback: (err: Error, cookie: CustomPolicy) -> Unit)
    open fun getSignedCookie(options: SignerOptionsWithoutPolicy, callback: (err: Error, cookie: CannedPolicy) -> Unit)
    open fun getSignedUrl(options: SignerOptionsWithPolicy): String
    open fun getSignedUrl(options: SignerOptionsWithoutPolicy): String
    open fun getSignedUrl(options: SignerOptionsWithPolicy, callback: (err: Error, url: String) -> Unit)
    open fun getSignedUrl(options: SignerOptionsWithoutPolicy, callback: (err: Error, url: String) -> Unit)
    interface SignerOptionsWithPolicy {
        var policy: String
    }
    interface SignerOptionsWithoutPolicy {
        var url: String
        var expires: Number
    }
    interface CustomPolicy {
        operator fun get(key: String): String
        operator fun set(key: String, value: String)
    }
    interface CannedPolicy {
        operator fun get(key: String): Any?
        operator fun set(key: String, value: Any?)
    }
}