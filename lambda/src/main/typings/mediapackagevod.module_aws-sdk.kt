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
import MediaPackageVod.AssetShallow
import MediaPackageVod.DashManifest
import MediaPackageVod.EgressEndpoint
import MediaPackageVod.HlsManifest
import MediaPackageVod.MssManifest
import MediaPackageVod.PackagingConfiguration
import MediaPackageVod.PackagingGroup
import MediaPackageVod.CreateAssetRequest
import MediaPackageVod.CreateAssetResponse
import MediaPackageVod.CreatePackagingConfigurationRequest
import MediaPackageVod.CreatePackagingConfigurationResponse
import MediaPackageVod.CreatePackagingGroupRequest
import MediaPackageVod.CreatePackagingGroupResponse
import MediaPackageVod.DeleteAssetRequest
import MediaPackageVod.DeleteAssetResponse
import MediaPackageVod.DeletePackagingConfigurationRequest
import MediaPackageVod.DeletePackagingConfigurationResponse
import MediaPackageVod.DeletePackagingGroupRequest
import MediaPackageVod.DeletePackagingGroupResponse
import MediaPackageVod.DescribeAssetRequest
import MediaPackageVod.DescribeAssetResponse
import MediaPackageVod.DescribePackagingConfigurationRequest
import MediaPackageVod.DescribePackagingConfigurationResponse
import MediaPackageVod.DescribePackagingGroupRequest
import MediaPackageVod.DescribePackagingGroupResponse
import MediaPackageVod.ListAssetsRequest
import MediaPackageVod.ListAssetsResponse
import MediaPackageVod.ListPackagingConfigurationsRequest
import MediaPackageVod.ListPackagingConfigurationsResponse
import MediaPackageVod.ListPackagingGroupsRequest
import MediaPackageVod.ListPackagingGroupsResponse
import MediaPackageVod.SpekeKeyProvider
import MediaPackageVod.CmafEncryption
import MediaPackageVod.CmafPackage
import MediaPackageVod.DashPackage
import MediaPackageVod.HlsPackage
import MediaPackageVod.MssPackage
import MediaPackageVod.StreamSelection
import MediaPackageVod.DashEncryption
import MediaPackageVod.HlsEncryption
import MediaPackageVod.MssEncryption

typealias MaxResults = Number

typealias __boolean = Boolean

typealias __integer = Number

typealias __listOfAssetShallow = Array<AssetShallow>

typealias __listOfDashManifest = Array<DashManifest>

typealias __listOfEgressEndpoint = Array<EgressEndpoint>

typealias __listOfHlsManifest = Array<HlsManifest>

typealias __listOfMssManifest = Array<MssManifest>

typealias __listOfPackagingConfiguration = Array<PackagingConfiguration>

typealias __listOfPackagingGroup = Array<PackagingGroup>

typealias __listOf__PeriodTriggersElement = Array<String /* "ADS" | String */>

typealias __listOf__string = Array<__string>

typealias __string = String

@JsModule("aws-sdk")
external open class MediaPackageVod(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & MediaPackageVod.Types.ClientConfiguration */
    open fun createAsset(params: CreateAssetRequest, callback: (err: AWSError, data: CreateAssetResponse) -> Unit = definedExternally): Request<CreateAssetResponse, AWSError>
    open fun createAsset(callback: (err: AWSError, data: CreateAssetResponse) -> Unit = definedExternally): Request<CreateAssetResponse, AWSError>
    open fun createPackagingConfiguration(params: CreatePackagingConfigurationRequest, callback: (err: AWSError, data: CreatePackagingConfigurationResponse) -> Unit = definedExternally): Request<CreatePackagingConfigurationResponse, AWSError>
    open fun createPackagingConfiguration(callback: (err: AWSError, data: CreatePackagingConfigurationResponse) -> Unit = definedExternally): Request<CreatePackagingConfigurationResponse, AWSError>
    open fun createPackagingGroup(params: CreatePackagingGroupRequest, callback: (err: AWSError, data: CreatePackagingGroupResponse) -> Unit = definedExternally): Request<CreatePackagingGroupResponse, AWSError>
    open fun createPackagingGroup(callback: (err: AWSError, data: CreatePackagingGroupResponse) -> Unit = definedExternally): Request<CreatePackagingGroupResponse, AWSError>
    open fun deleteAsset(params: DeleteAssetRequest, callback: (err: AWSError, data: DeleteAssetResponse) -> Unit = definedExternally): Request<DeleteAssetResponse, AWSError>
    open fun deleteAsset(callback: (err: AWSError, data: DeleteAssetResponse) -> Unit = definedExternally): Request<DeleteAssetResponse, AWSError>
    open fun deletePackagingConfiguration(params: DeletePackagingConfigurationRequest, callback: (err: AWSError, data: DeletePackagingConfigurationResponse) -> Unit = definedExternally): Request<DeletePackagingConfigurationResponse, AWSError>
    open fun deletePackagingConfiguration(callback: (err: AWSError, data: DeletePackagingConfigurationResponse) -> Unit = definedExternally): Request<DeletePackagingConfigurationResponse, AWSError>
    open fun deletePackagingGroup(params: DeletePackagingGroupRequest, callback: (err: AWSError, data: DeletePackagingGroupResponse) -> Unit = definedExternally): Request<DeletePackagingGroupResponse, AWSError>
    open fun deletePackagingGroup(callback: (err: AWSError, data: DeletePackagingGroupResponse) -> Unit = definedExternally): Request<DeletePackagingGroupResponse, AWSError>
    open fun describeAsset(params: DescribeAssetRequest, callback: (err: AWSError, data: DescribeAssetResponse) -> Unit = definedExternally): Request<DescribeAssetResponse, AWSError>
    open fun describeAsset(callback: (err: AWSError, data: DescribeAssetResponse) -> Unit = definedExternally): Request<DescribeAssetResponse, AWSError>
    open fun describePackagingConfiguration(params: DescribePackagingConfigurationRequest, callback: (err: AWSError, data: DescribePackagingConfigurationResponse) -> Unit = definedExternally): Request<DescribePackagingConfigurationResponse, AWSError>
    open fun describePackagingConfiguration(callback: (err: AWSError, data: DescribePackagingConfigurationResponse) -> Unit = definedExternally): Request<DescribePackagingConfigurationResponse, AWSError>
    open fun describePackagingGroup(params: DescribePackagingGroupRequest, callback: (err: AWSError, data: DescribePackagingGroupResponse) -> Unit = definedExternally): Request<DescribePackagingGroupResponse, AWSError>
    open fun describePackagingGroup(callback: (err: AWSError, data: DescribePackagingGroupResponse) -> Unit = definedExternally): Request<DescribePackagingGroupResponse, AWSError>
    open fun listAssets(params: ListAssetsRequest, callback: (err: AWSError, data: ListAssetsResponse) -> Unit = definedExternally): Request<ListAssetsResponse, AWSError>
    open fun listAssets(callback: (err: AWSError, data: ListAssetsResponse) -> Unit = definedExternally): Request<ListAssetsResponse, AWSError>
    open fun listPackagingConfigurations(params: ListPackagingConfigurationsRequest, callback: (err: AWSError, data: ListPackagingConfigurationsResponse) -> Unit = definedExternally): Request<ListPackagingConfigurationsResponse, AWSError>
    open fun listPackagingConfigurations(callback: (err: AWSError, data: ListPackagingConfigurationsResponse) -> Unit = definedExternally): Request<ListPackagingConfigurationsResponse, AWSError>
    open fun listPackagingGroups(params: ListPackagingGroupsRequest, callback: (err: AWSError, data: ListPackagingGroupsResponse) -> Unit = definedExternally): Request<ListPackagingGroupsResponse, AWSError>
    open fun listPackagingGroups(callback: (err: AWSError, data: ListPackagingGroupsResponse) -> Unit = definedExternally): Request<ListPackagingGroupsResponse, AWSError>
    interface AssetShallow {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PackagingGroupId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SourceArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SourceRoleArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CmafEncryption {
        var SpekeKeyProvider: SpekeKeyProvider
    }
    interface CmafPackage {
        var Encryption: CmafEncryption?
            get() = definedExternally
            set(value) = definedExternally
        var HlsManifests: __listOfHlsManifest
        var SegmentDurationSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAssetRequest {
        var Id: __string
        var PackagingGroupId: __string
        var ResourceId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SourceArn: __string
        var SourceRoleArn: __string
    }
    interface CreateAssetResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EgressEndpoints: __listOfEgressEndpoint?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PackagingGroupId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SourceArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SourceRoleArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePackagingConfigurationRequest {
        var CmafPackage: CmafPackage?
            get() = definedExternally
            set(value) = definedExternally
        var DashPackage: DashPackage?
            get() = definedExternally
            set(value) = definedExternally
        var HlsPackage: HlsPackage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string
        var MssPackage: MssPackage?
            get() = definedExternally
            set(value) = definedExternally
        var PackagingGroupId: __string
    }
    interface CreatePackagingConfigurationResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CmafPackage: CmafPackage?
            get() = definedExternally
            set(value) = definedExternally
        var DashPackage: DashPackage?
            get() = definedExternally
            set(value) = definedExternally
        var HlsPackage: HlsPackage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MssPackage: MssPackage?
            get() = definedExternally
            set(value) = definedExternally
        var PackagingGroupId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePackagingGroupRequest {
        var Id: __string
    }
    interface CreatePackagingGroupResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DomainName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DashEncryption {
        var SpekeKeyProvider: SpekeKeyProvider
    }
    interface DashManifest {
        var ManifestLayout: String /* "FULL" | "COMPACT" | String */
        var ManifestName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MinBufferTimeSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Profile: String /* "NONE" | "HBBTV_1_5" | String */
        var StreamSelection: StreamSelection?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DashPackage {
        var DashManifests: __listOfDashManifest
        var Encryption: DashEncryption?
            get() = definedExternally
            set(value) = definedExternally
        var PeriodTriggers: __listOf__PeriodTriggersElement?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentDurationSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentTemplateFormat: String /* "NUMBER_WITH_TIMELINE" | "TIME_WITH_TIMELINE" | "NUMBER_WITH_DURATION" | String */
    }
    interface DeleteAssetRequest {
        var Id: __string
    }
    interface DeleteAssetResponse
    interface DeletePackagingConfigurationRequest {
        var Id: __string
    }
    interface DeletePackagingConfigurationResponse
    interface DeletePackagingGroupRequest {
        var Id: __string
    }
    interface DeletePackagingGroupResponse
    interface DescribeAssetRequest {
        var Id: __string
    }
    interface DescribeAssetResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EgressEndpoints: __listOfEgressEndpoint?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PackagingGroupId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SourceArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SourceRoleArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePackagingConfigurationRequest {
        var Id: __string
    }
    interface DescribePackagingConfigurationResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CmafPackage: CmafPackage?
            get() = definedExternally
            set(value) = definedExternally
        var DashPackage: DashPackage?
            get() = definedExternally
            set(value) = definedExternally
        var HlsPackage: HlsPackage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MssPackage: MssPackage?
            get() = definedExternally
            set(value) = definedExternally
        var PackagingGroupId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePackagingGroupRequest {
        var Id: __string
    }
    interface DescribePackagingGroupResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DomainName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EgressEndpoint {
        var PackagingConfigurationId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HlsEncryption {
        var ConstantInitializationVector: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionMethod: String /* "AES_128" | "SAMPLE_AES" | String */
        var SpekeKeyProvider: SpekeKeyProvider
    }
    interface HlsManifest {
        var AdMarkers: String /* "NONE" | "SCTE35_ENHANCED" | "PASSTHROUGH" | String */
        var IncludeIframeOnlyStream: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ManifestName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramDateTimeIntervalSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var RepeatExtXKey: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var StreamSelection: StreamSelection?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HlsPackage {
        var Encryption: HlsEncryption?
            get() = definedExternally
            set(value) = definedExternally
        var HlsManifests: __listOfHlsManifest
        var SegmentDurationSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var UseAudioRenditionGroup: __boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAssetsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PackagingGroupId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAssetsResponse {
        var Assets: __listOfAssetShallow?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPackagingConfigurationsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PackagingGroupId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPackagingConfigurationsResponse {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PackagingConfigurations: __listOfPackagingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPackagingGroupsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPackagingGroupsResponse {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PackagingGroups: __listOfPackagingGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MssEncryption {
        var SpekeKeyProvider: SpekeKeyProvider
    }
    interface MssManifest {
        var ManifestName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var StreamSelection: StreamSelection?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MssPackage {
        var Encryption: MssEncryption?
            get() = definedExternally
            set(value) = definedExternally
        var MssManifests: __listOfMssManifest
        var SegmentDurationSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PackagingConfiguration {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CmafPackage: CmafPackage?
            get() = definedExternally
            set(value) = definedExternally
        var DashPackage: DashPackage?
            get() = definedExternally
            set(value) = definedExternally
        var HlsPackage: HlsPackage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MssPackage: MssPackage?
            get() = definedExternally
            set(value) = definedExternally
        var PackagingGroupId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PackagingGroup {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DomainName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SpekeKeyProvider {
        var RoleArn: __string
        var SystemIds: __listOf__string
        var Url: __string
    }
    interface StreamSelection {
        var MaxVideoBitsPerSecond: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var MinVideoBitsPerSecond: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var StreamOrder: String /* "ORIGINAL" | "VIDEO_BITRATE_ASCENDING" | "VIDEO_BITRATE_DESCENDING" | String */
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-11-07" | "latest" | String */
    }
}