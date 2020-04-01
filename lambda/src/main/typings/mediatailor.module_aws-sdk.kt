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
import MediaTailor.PlaybackConfiguration
import MediaTailor.DeletePlaybackConfigurationRequest
import MediaTailor.DeletePlaybackConfigurationResponse
import MediaTailor.GetPlaybackConfigurationRequest
import MediaTailor.GetPlaybackConfigurationResponse
import MediaTailor.ListPlaybackConfigurationsRequest
import MediaTailor.ListPlaybackConfigurationsResponse
import MediaTailor.ListTagsForResourceRequest
import MediaTailor.ListTagsForResourceResponse
import MediaTailor.PutPlaybackConfigurationRequest
import MediaTailor.PutPlaybackConfigurationResponse
import MediaTailor.TagResourceRequest
import MediaTailor.UntagResourceRequest
import MediaTailor.CdnConfiguration
import MediaTailor.DashConfiguration
import MediaTailor.HlsConfiguration
import MediaTailor.LivePreRollConfiguration
import MediaTailor.__mapOf__string
import MediaTailor.DashConfigurationForPut

typealias __integer = Number

typealias __integerMin1 = Number

typealias __integerMin1Max100 = Number

typealias __listOfPlaybackConfigurations = Array<PlaybackConfiguration>

typealias __listOf__string = Array<__string>

typealias __string = String

@JsModule("aws-sdk")
external open class MediaTailor(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & MediaTailor.Types.ClientConfiguration */
    open fun deletePlaybackConfiguration(params: DeletePlaybackConfigurationRequest, callback: (err: AWSError, data: DeletePlaybackConfigurationResponse) -> Unit = definedExternally): Request<DeletePlaybackConfigurationResponse, AWSError>
    open fun deletePlaybackConfiguration(callback: (err: AWSError, data: DeletePlaybackConfigurationResponse) -> Unit = definedExternally): Request<DeletePlaybackConfigurationResponse, AWSError>
    open fun getPlaybackConfiguration(params: GetPlaybackConfigurationRequest, callback: (err: AWSError, data: GetPlaybackConfigurationResponse) -> Unit = definedExternally): Request<GetPlaybackConfigurationResponse, AWSError>
    open fun getPlaybackConfiguration(callback: (err: AWSError, data: GetPlaybackConfigurationResponse) -> Unit = definedExternally): Request<GetPlaybackConfigurationResponse, AWSError>
    open fun listPlaybackConfigurations(params: ListPlaybackConfigurationsRequest, callback: (err: AWSError, data: ListPlaybackConfigurationsResponse) -> Unit = definedExternally): Request<ListPlaybackConfigurationsResponse, AWSError>
    open fun listPlaybackConfigurations(callback: (err: AWSError, data: ListPlaybackConfigurationsResponse) -> Unit = definedExternally): Request<ListPlaybackConfigurationsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun putPlaybackConfiguration(params: PutPlaybackConfigurationRequest, callback: (err: AWSError, data: PutPlaybackConfigurationResponse) -> Unit = definedExternally): Request<PutPlaybackConfigurationResponse, AWSError>
    open fun putPlaybackConfiguration(callback: (err: AWSError, data: PutPlaybackConfigurationResponse) -> Unit = definedExternally): Request<PutPlaybackConfigurationResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    interface CdnConfiguration {
        var AdSegmentUrlPrefix: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ContentSegmentUrlPrefix: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DashConfiguration {
        var ManifestEndpointPrefix: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MpdLocation: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OriginManifestType: String /* "SINGLE_PERIOD" | "MULTI_PERIOD" | String */
    }
    interface DashConfigurationForPut {
        var MpdLocation: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OriginManifestType: String /* "SINGLE_PERIOD" | "MULTI_PERIOD" | String */
    }
    interface DeletePlaybackConfigurationRequest {
        var Name: __string
    }
    interface DeletePlaybackConfigurationResponse
    interface GetPlaybackConfigurationRequest {
        var Name: __string
    }
    interface GetPlaybackConfigurationResponse {
        var AdDecisionServerUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CdnConfiguration: CdnConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var DashConfiguration: DashConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var HlsConfiguration: HlsConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var LivePreRollConfiguration: LivePreRollConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PersonalizationThresholdSeconds: __integerMin1?
            get() = definedExternally
            set(value) = definedExternally
        var PlaybackConfigurationArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PlaybackEndpointPrefix: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SessionInitializationEndpointPrefix: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SlateAdUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var TranscodeProfileName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var VideoContentSourceUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HlsConfiguration {
        var ManifestEndpointPrefix: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPlaybackConfigurationsRequest {
        var MaxResults: __integerMin1Max100?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPlaybackConfigurationsResponse {
        var Items: __listOfPlaybackConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: __string
    }
    interface ListTagsForResourceResponse {
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PlaybackConfiguration {
        var AdDecisionServerUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CdnConfiguration: CdnConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var DashConfiguration: DashConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var HlsConfiguration: HlsConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PlaybackConfigurationArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PlaybackEndpointPrefix: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SessionInitializationEndpointPrefix: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SlateAdUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var TranscodeProfileName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PersonalizationThresholdSeconds: __integerMin1?
            get() = definedExternally
            set(value) = definedExternally
        var VideoContentSourceUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LivePreRollConfiguration {
        var AdDecisionServerUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MaxDurationSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutPlaybackConfigurationRequest {
        var AdDecisionServerUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CdnConfiguration: CdnConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var DashConfiguration: DashConfigurationForPut?
            get() = definedExternally
            set(value) = definedExternally
        var LivePreRollConfiguration: LivePreRollConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PersonalizationThresholdSeconds: __integerMin1?
            get() = definedExternally
            set(value) = definedExternally
        var SlateAdUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var TranscodeProfileName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var VideoContentSourceUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutPlaybackConfigurationResponse {
        var AdDecisionServerUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CdnConfiguration: CdnConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var DashConfiguration: DashConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var HlsConfiguration: HlsConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var LivePreRollConfiguration: LivePreRollConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PersonalizationThresholdSeconds: __integerMin1?
            get() = definedExternally
            set(value) = definedExternally
        var PlaybackConfigurationArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PlaybackEndpointPrefix: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SessionInitializationEndpointPrefix: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SlateAdUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var TranscodeProfileName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var VideoContentSourceUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var ResourceArn: __string
        var Tags: __mapOf__string
    }
    interface UntagResourceRequest {
        var ResourceArn: __string
        var TagKeys: __listOf__string
    }
    interface __mapOf__string {
        @nativeGetter
        operator fun get(key: String): __string?
        @nativeSetter
        operator fun set(key: String, value: __string)
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-04-23" | "latest" | String */
    }
}