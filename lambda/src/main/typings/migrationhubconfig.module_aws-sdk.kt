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
import MigrationHubConfig.HomeRegionControl
import MigrationHubConfig.CreateHomeRegionControlRequest
import MigrationHubConfig.CreateHomeRegionControlResult
import MigrationHubConfig.DescribeHomeRegionControlsRequest
import MigrationHubConfig.DescribeHomeRegionControlsResult
import MigrationHubConfig.GetHomeRegionRequest
import MigrationHubConfig.GetHomeRegionResult
import MigrationHubConfig.Target

typealias ControlId = String

typealias DescribeHomeRegionControlsMaxResults = Number

typealias DryRun = Boolean

typealias HomeRegion = String

typealias HomeRegionControls = Array<HomeRegionControl>

typealias RequestedTime = Date

typealias TargetId = String

typealias Token = String

@JsModule("aws-sdk")
external open class MigrationHubConfig(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & MigrationHubConfig.Types.ClientConfiguration */
    open fun createHomeRegionControl(params: CreateHomeRegionControlRequest, callback: (err: AWSError, data: CreateHomeRegionControlResult) -> Unit = definedExternally): Request<CreateHomeRegionControlResult, AWSError>
    open fun createHomeRegionControl(callback: (err: AWSError, data: CreateHomeRegionControlResult) -> Unit = definedExternally): Request<CreateHomeRegionControlResult, AWSError>
    open fun describeHomeRegionControls(params: DescribeHomeRegionControlsRequest, callback: (err: AWSError, data: DescribeHomeRegionControlsResult) -> Unit = definedExternally): Request<DescribeHomeRegionControlsResult, AWSError>
    open fun describeHomeRegionControls(callback: (err: AWSError, data: DescribeHomeRegionControlsResult) -> Unit = definedExternally): Request<DescribeHomeRegionControlsResult, AWSError>
    open fun getHomeRegion(params: GetHomeRegionRequest, callback: (err: AWSError, data: GetHomeRegionResult) -> Unit = definedExternally): Request<GetHomeRegionResult, AWSError>
    open fun getHomeRegion(callback: (err: AWSError, data: GetHomeRegionResult) -> Unit = definedExternally): Request<GetHomeRegionResult, AWSError>
    interface CreateHomeRegionControlRequest {
        var HomeRegion: HomeRegion
        var Target: Target
        var DryRun: DryRun?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateHomeRegionControlResult {
        var HomeRegionControl: HomeRegionControl?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeHomeRegionControlsRequest {
        var ControlId: ControlId?
            get() = definedExternally
            set(value) = definedExternally
        var HomeRegion: HomeRegion?
            get() = definedExternally
            set(value) = definedExternally
        var Target: Target?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: DescribeHomeRegionControlsMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeHomeRegionControlsResult {
        var HomeRegionControls: HomeRegionControls?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetHomeRegionRequest
    interface GetHomeRegionResult {
        var HomeRegion: HomeRegion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HomeRegionControl {
        var ControlId: ControlId?
            get() = definedExternally
            set(value) = definedExternally
        var HomeRegion: HomeRegion?
            get() = definedExternally
            set(value) = definedExternally
        var Target: Target?
            get() = definedExternally
            set(value) = definedExternally
        var RequestedTime: RequestedTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Target {
        var Type: String /* "ACCOUNT" | String */
        var Id: TargetId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-06-30" | "latest" | String */
    }
}