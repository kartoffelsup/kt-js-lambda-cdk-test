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
import IoT1ClickDevicesService.DeviceDescription
import IoT1ClickDevicesService.DeviceEvent
import IoT1ClickDevicesService.DeviceMethod
import IoT1ClickDevicesService.ClaimDevicesByClaimCodeRequest
import IoT1ClickDevicesService.ClaimDevicesByClaimCodeResponse
import IoT1ClickDevicesService.DescribeDeviceRequest
import IoT1ClickDevicesService.DescribeDeviceResponse
import IoT1ClickDevicesService.FinalizeDeviceClaimRequest
import IoT1ClickDevicesService.FinalizeDeviceClaimResponse
import IoT1ClickDevicesService.GetDeviceMethodsRequest
import IoT1ClickDevicesService.GetDeviceMethodsResponse
import IoT1ClickDevicesService.InitiateDeviceClaimRequest
import IoT1ClickDevicesService.InitiateDeviceClaimResponse
import IoT1ClickDevicesService.InvokeDeviceMethodRequest
import IoT1ClickDevicesService.InvokeDeviceMethodResponse
import IoT1ClickDevicesService.ListDeviceEventsRequest
import IoT1ClickDevicesService.ListDeviceEventsResponse
import IoT1ClickDevicesService.ListDevicesRequest
import IoT1ClickDevicesService.ListDevicesResponse
import IoT1ClickDevicesService.ListTagsForResourceRequest
import IoT1ClickDevicesService.ListTagsForResourceResponse
import IoT1ClickDevicesService.TagResourceRequest
import IoT1ClickDevicesService.UnclaimDeviceRequest
import IoT1ClickDevicesService.UnclaimDeviceResponse
import IoT1ClickDevicesService.UntagResourceRequest
import IoT1ClickDevicesService.UpdateDeviceStateRequest
import IoT1ClickDevicesService.UpdateDeviceStateResponse
import IoT1ClickDevicesService.Attributes
import IoT1ClickDevicesService.DeviceAttributes
import IoT1ClickDevicesService.__mapOf__string
import IoT1ClickDevicesService.Device

typealias MaxResults = Number

typealias __boolean = Boolean

typealias __doubleMin0Max100 = Number

typealias __integer = Number

typealias __listOfDeviceDescription = Array<DeviceDescription>

typealias __listOfDeviceEvent = Array<DeviceEvent>

typealias __listOfDeviceMethod = Array<DeviceMethod>

typealias __listOf__string = Array<__string>

typealias __string = String

typealias __stringMin12Max40 = String

typealias __timestampIso8601 = Date

@JsModule("aws-sdk")
external open class IoT1ClickDevicesService(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & IoT1ClickDevicesService.Types.ClientConfiguration */
    open fun claimDevicesByClaimCode(params: ClaimDevicesByClaimCodeRequest, callback: (err: AWSError, data: ClaimDevicesByClaimCodeResponse) -> Unit = definedExternally): Request<ClaimDevicesByClaimCodeResponse, AWSError>
    open fun claimDevicesByClaimCode(callback: (err: AWSError, data: ClaimDevicesByClaimCodeResponse) -> Unit = definedExternally): Request<ClaimDevicesByClaimCodeResponse, AWSError>
    open fun describeDevice(params: DescribeDeviceRequest, callback: (err: AWSError, data: DescribeDeviceResponse) -> Unit = definedExternally): Request<DescribeDeviceResponse, AWSError>
    open fun describeDevice(callback: (err: AWSError, data: DescribeDeviceResponse) -> Unit = definedExternally): Request<DescribeDeviceResponse, AWSError>
    open fun finalizeDeviceClaim(params: FinalizeDeviceClaimRequest, callback: (err: AWSError, data: FinalizeDeviceClaimResponse) -> Unit = definedExternally): Request<FinalizeDeviceClaimResponse, AWSError>
    open fun finalizeDeviceClaim(callback: (err: AWSError, data: FinalizeDeviceClaimResponse) -> Unit = definedExternally): Request<FinalizeDeviceClaimResponse, AWSError>
    open fun getDeviceMethods(params: GetDeviceMethodsRequest, callback: (err: AWSError, data: GetDeviceMethodsResponse) -> Unit = definedExternally): Request<GetDeviceMethodsResponse, AWSError>
    open fun getDeviceMethods(callback: (err: AWSError, data: GetDeviceMethodsResponse) -> Unit = definedExternally): Request<GetDeviceMethodsResponse, AWSError>
    open fun initiateDeviceClaim(params: InitiateDeviceClaimRequest, callback: (err: AWSError, data: InitiateDeviceClaimResponse) -> Unit = definedExternally): Request<InitiateDeviceClaimResponse, AWSError>
    open fun initiateDeviceClaim(callback: (err: AWSError, data: InitiateDeviceClaimResponse) -> Unit = definedExternally): Request<InitiateDeviceClaimResponse, AWSError>
    open fun invokeDeviceMethod(params: InvokeDeviceMethodRequest, callback: (err: AWSError, data: InvokeDeviceMethodResponse) -> Unit = definedExternally): Request<InvokeDeviceMethodResponse, AWSError>
    open fun invokeDeviceMethod(callback: (err: AWSError, data: InvokeDeviceMethodResponse) -> Unit = definedExternally): Request<InvokeDeviceMethodResponse, AWSError>
    open fun listDeviceEvents(params: ListDeviceEventsRequest, callback: (err: AWSError, data: ListDeviceEventsResponse) -> Unit = definedExternally): Request<ListDeviceEventsResponse, AWSError>
    open fun listDeviceEvents(callback: (err: AWSError, data: ListDeviceEventsResponse) -> Unit = definedExternally): Request<ListDeviceEventsResponse, AWSError>
    open fun listDevices(params: ListDevicesRequest, callback: (err: AWSError, data: ListDevicesResponse) -> Unit = definedExternally): Request<ListDevicesResponse, AWSError>
    open fun listDevices(callback: (err: AWSError, data: ListDevicesResponse) -> Unit = definedExternally): Request<ListDevicesResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun unclaimDevice(params: UnclaimDeviceRequest, callback: (err: AWSError, data: UnclaimDeviceResponse) -> Unit = definedExternally): Request<UnclaimDeviceResponse, AWSError>
    open fun unclaimDevice(callback: (err: AWSError, data: UnclaimDeviceResponse) -> Unit = definedExternally): Request<UnclaimDeviceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateDeviceState(params: UpdateDeviceStateRequest, callback: (err: AWSError, data: UpdateDeviceStateResponse) -> Unit = definedExternally): Request<UpdateDeviceStateResponse, AWSError>
    open fun updateDeviceState(callback: (err: AWSError, data: UpdateDeviceStateResponse) -> Unit = definedExternally): Request<UpdateDeviceStateResponse, AWSError>
    interface Attributes
    interface ClaimDevicesByClaimCodeRequest {
        var ClaimCode: __string
    }
    interface ClaimDevicesByClaimCodeResponse {
        var ClaimCode: __stringMin12Max40?
            get() = definedExternally
            set(value) = definedExternally
        var Total: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDeviceRequest {
        var DeviceId: __string
    }
    interface DescribeDeviceResponse {
        var DeviceDescription: DeviceDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Device {
        var Attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Type: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeviceAttributes {
        @nativeGetter
        operator fun get(key: String): __string?
        @nativeSetter
        operator fun set(key: String, value: __string)
    }
    interface DeviceDescription {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: DeviceAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RemainingLife: __doubleMin0Max100?
            get() = definedExternally
            set(value) = definedExternally
        var Type: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeviceEvent {
        var Device: Device?
            get() = definedExternally
            set(value) = definedExternally
        var StdEvent: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeviceMethod {
        var DeviceType: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MethodName: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FinalizeDeviceClaimRequest {
        var DeviceId: __string
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FinalizeDeviceClaimResponse {
        var State: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeviceMethodsRequest {
        var DeviceId: __string
    }
    interface GetDeviceMethodsResponse {
        var DeviceMethods: __listOfDeviceMethod?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InitiateDeviceClaimRequest {
        var DeviceId: __string
    }
    interface InitiateDeviceClaimResponse {
        var State: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InvokeDeviceMethodRequest {
        var DeviceId: __string
        var DeviceMethod: DeviceMethod?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceMethodParameters: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InvokeDeviceMethodResponse {
        var DeviceMethodResponse: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeviceEventsRequest {
        var DeviceId: __string
        var FromTimeStamp: __timestampIso8601
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ToTimeStamp: __timestampIso8601
    }
    interface ListDeviceEventsResponse {
        var Events: __listOfDeviceEvent?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDevicesRequest {
        var DeviceType: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDevicesResponse {
        var Devices: __listOfDeviceDescription?
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
    interface TagResourceRequest {
        var ResourceArn: __string
        var Tags: __mapOf__string
    }
    interface UnclaimDeviceRequest {
        var DeviceId: __string
    }
    interface UnclaimDeviceResponse {
        var State: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceRequest {
        var ResourceArn: __string
        var TagKeys: __listOf__string
    }
    interface UpdateDeviceStateRequest {
        var DeviceId: __string
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDeviceStateResponse
    interface __mapOf__string {
        @nativeGetter
        operator fun get(key: String): __string?
        @nativeSetter
        operator fun set(key: String, value: __string)
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-05-14" | "latest" | String */
    }
}