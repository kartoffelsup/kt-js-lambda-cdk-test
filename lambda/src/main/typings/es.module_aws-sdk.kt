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
import ES.AdditionalLimit
import ES.CompatibleVersionsMap
import ES.DescribePackagesFilter
import ES.DomainInfo
import ES.DomainPackageDetails
import ES.ElasticsearchDomainStatus
import ES.PackageDetails
import ES.RecurringCharge
import ES.ReservedElasticsearchInstance
import ES.ReservedElasticsearchInstanceOffering
import ES.StorageTypeLimit
import ES.StorageType
import ES.Tag
import ES.UpgradeHistory
import ES.UpgradeStepItem
import ES.AddTagsRequest
import ES.AssociatePackageRequest
import ES.AssociatePackageResponse
import ES.CancelElasticsearchServiceSoftwareUpdateRequest
import ES.CancelElasticsearchServiceSoftwareUpdateResponse
import ES.CreateElasticsearchDomainRequest
import ES.CreateElasticsearchDomainResponse
import ES.CreatePackageRequest
import ES.CreatePackageResponse
import ES.DeleteElasticsearchDomainRequest
import ES.DeleteElasticsearchDomainResponse
import ES.DeletePackageRequest
import ES.DeletePackageResponse
import ES.DescribeElasticsearchDomainRequest
import ES.DescribeElasticsearchDomainResponse
import ES.DescribeElasticsearchDomainConfigRequest
import ES.DescribeElasticsearchDomainConfigResponse
import ES.DescribeElasticsearchDomainsRequest
import ES.DescribeElasticsearchDomainsResponse
import ES.DescribeElasticsearchInstanceTypeLimitsRequest
import ES.DescribeElasticsearchInstanceTypeLimitsResponse
import ES.DescribePackagesRequest
import ES.DescribePackagesResponse
import ES.DescribeReservedElasticsearchInstanceOfferingsRequest
import ES.DescribeReservedElasticsearchInstanceOfferingsResponse
import ES.DescribeReservedElasticsearchInstancesRequest
import ES.DescribeReservedElasticsearchInstancesResponse
import ES.DissociatePackageRequest
import ES.DissociatePackageResponse
import ES.GetCompatibleElasticsearchVersionsRequest
import ES.GetCompatibleElasticsearchVersionsResponse
import ES.GetUpgradeHistoryRequest
import ES.GetUpgradeHistoryResponse
import ES.GetUpgradeStatusRequest
import ES.GetUpgradeStatusResponse
import ES.ListDomainNamesResponse
import ES.ListDomainsForPackageRequest
import ES.ListDomainsForPackageResponse
import ES.ListElasticsearchInstanceTypesRequest
import ES.ListElasticsearchInstanceTypesResponse
import ES.ListElasticsearchVersionsRequest
import ES.ListElasticsearchVersionsResponse
import ES.ListPackagesForDomainRequest
import ES.ListPackagesForDomainResponse
import ES.ListTagsRequest
import ES.ListTagsResponse
import ES.PurchaseReservedElasticsearchInstanceOfferingRequest
import ES.PurchaseReservedElasticsearchInstanceOfferingResponse
import ES.RemoveTagsRequest
import ES.StartElasticsearchServiceSoftwareUpdateRequest
import ES.StartElasticsearchServiceSoftwareUpdateResponse
import ES.UpdateElasticsearchDomainConfigRequest
import ES.UpdateElasticsearchDomainConfigResponse
import ES.UpgradeElasticsearchDomainRequest
import ES.UpgradeElasticsearchDomainResponse
import ES.OptionStatus
import ES.AdvancedOptions
import ES.MasterUserOptions
import ES.AdvancedSecurityOptions
import ES.ServiceSoftwareOptions
import ES.CognitoOptions
import ES.ElasticsearchClusterConfig
import ES.EBSOptions
import ES.SnapshotOptions
import ES.VPCOptions
import ES.EncryptionAtRestOptions
import ES.NodeToNodeEncryptionOptions
import ES.LogPublishingOptions
import ES.DomainEndpointOptions
import ES.AdvancedSecurityOptionsInput
import ES.PackageSource
import ES.ElasticsearchDomainConfig
import ES.LimitsByRole
import ES.ErrorDetails
import ES.ZoneAwarenessConfig
import ES.ElasticsearchVersionStatus
import ES.ElasticsearchClusterConfigStatus
import ES.EBSOptionsStatus
import ES.AccessPoliciesStatus
import ES.SnapshotOptionsStatus
import ES.VPCDerivedInfoStatus
import ES.CognitoOptionsStatus
import ES.EncryptionAtRestOptionsStatus
import ES.NodeToNodeEncryptionOptionsStatus
import ES.AdvancedOptionsStatus
import ES.LogPublishingOptionsStatus
import ES.DomainEndpointOptionsStatus
import ES.AdvancedSecurityOptionsStatus
import ES.EndpointsMap
import ES.VPCDerivedInfo
import ES.InstanceCountLimits
import ES.InstanceLimits
import ES.Limits
import ES.LogPublishingOption

typealias ARN = String

typealias AdditionalLimitList = Array<AdditionalLimit>

typealias Boolean = Boolean

typealias CloudWatchLogsLogGroupArn = String

typealias CompatibleElasticsearchVersionsList = Array<CompatibleVersionsMap>

typealias CreatedAt = Date

typealias DeploymentCloseDateTimeStamp = Date

typealias DescribePackagesFilterList = Array<DescribePackagesFilter>

typealias DescribePackagesFilterValue = String

typealias DescribePackagesFilterValues = Array<DescribePackagesFilterValue>

typealias DomainId = String

typealias DomainInfoList = Array<DomainInfo>

typealias DomainName = String

typealias DomainNameList = Array<DomainName>

typealias DomainPackageDetailsList = Array<DomainPackageDetails>

typealias Double = Number

typealias ElasticsearchDomainStatusList = Array<ElasticsearchDomainStatus>

typealias ElasticsearchInstanceTypeList = Array<String /* "m3.medium.elasticsearch" | "m3.large.elasticsearch" | "m3.xlarge.elasticsearch" | "m3.2xlarge.elasticsearch" | "m4.large.elasticsearch" | "m4.xlarge.elasticsearch" | "m4.2xlarge.elasticsearch" | "m4.4xlarge.elasticsearch" | "m4.10xlarge.elasticsearch" | "m5.large.elasticsearch" | "m5.xlarge.elasticsearch" | "m5.2xlarge.elasticsearch" | "m5.4xlarge.elasticsearch" | "m5.12xlarge.elasticsearch" | "r5.large.elasticsearch" | "r5.xlarge.elasticsearch" | "r5.2xlarge.elasticsearch" | "r5.4xlarge.elasticsearch" | "r5.12xlarge.elasticsearch" | "c5.large.elasticsearch" | "c5.xlarge.elasticsearch" | "c5.2xlarge.elasticsearch" | "c5.4xlarge.elasticsearch" | "c5.9xlarge.elasticsearch" | "c5.18xlarge.elasticsearch" | "ultrawarm1.medium.elasticsearch" | "ultrawarm1.large.elasticsearch" | "t2.micro.elasticsearch" | "t2.small.elasticsearch" | "t2.medium.elasticsearch" | "r3.large.elasticsearch" | "r3.xlarge.elasticsearch" | "r3.2xlarge.elasticsearch" | "r3.4xlarge.elasticsearch" | "r3.8xlarge.elasticsearch" | "i2.xlarge.elasticsearch" | "i2.2xlarge.elasticsearch" | "d2.xlarge.elasticsearch" | "d2.2xlarge.elasticsearch" | "d2.4xlarge.elasticsearch" | "d2.8xlarge.elasticsearch" | "c4.large.elasticsearch" | "c4.xlarge.elasticsearch" | "c4.2xlarge.elasticsearch" | "c4.4xlarge.elasticsearch" | "c4.8xlarge.elasticsearch" | "r4.large.elasticsearch" | "r4.xlarge.elasticsearch" | "r4.2xlarge.elasticsearch" | "r4.4xlarge.elasticsearch" | "r4.8xlarge.elasticsearch" | "r4.16xlarge.elasticsearch" | "i3.large.elasticsearch" | "i3.xlarge.elasticsearch" | "i3.2xlarge.elasticsearch" | "i3.4xlarge.elasticsearch" | "i3.8xlarge.elasticsearch" | "i3.16xlarge.elasticsearch" | String */>

typealias ElasticsearchVersionList = Array<ElasticsearchVersionString>

typealias ElasticsearchVersionString = String

typealias ErrorMessage = String

typealias ErrorType = String

typealias GUID = String

typealias IdentityPoolId = String

typealias InstanceCount = Number

typealias InstanceRole = String

typealias Integer = Number

typealias IntegerClass = Number

typealias Issue = String

typealias Issues = Array<Issue>

typealias KmsKeyId = String

typealias LastUpdated = Date

typealias LimitName = String

typealias LimitValue = String

typealias LimitValueList = Array<LimitValue>

typealias MaxResults = Number

typealias MaximumInstanceCount = Number

typealias MinimumInstanceCount = Number

typealias NextToken = String

typealias PackageDescription = String

typealias PackageDetailsList = Array<PackageDetails>

typealias PackageID = String

typealias PackageName = String

typealias Password = String

typealias PolicyDocument = String

typealias RecurringChargeList = Array<RecurringCharge>

typealias ReferencePath = String

typealias ReservationToken = String

typealias ReservedElasticsearchInstanceList = Array<ReservedElasticsearchInstance>

typealias ReservedElasticsearchInstanceOfferingList = Array<ReservedElasticsearchInstanceOffering>

typealias RoleArn = String

typealias S3BucketName = String

typealias S3Key = String

typealias ServiceUrl = String

typealias StartTimestamp = Date

typealias StorageSubTypeName = String

typealias StorageTypeLimitList = Array<StorageTypeLimit>

typealias StorageTypeList = Array<StorageType>

typealias StorageTypeName = String

typealias String = String

typealias StringList = Array<String>

typealias TagKey = String

typealias TagList = Array<Tag>

typealias TagValue = String

typealias UIntValue = Number

typealias UpdateTimestamp = Date

typealias UpgradeHistoryList = Array<UpgradeHistory>

typealias UpgradeName = String

typealias UpgradeStepsList = Array<UpgradeStepItem>

typealias UserPoolId = String

typealias Username = String

@JsModule("aws-sdk")
external open class ES(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ES.Types.ClientConfiguration */
    open fun addTags(params: AddTagsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun addTags(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun associatePackage(params: AssociatePackageRequest, callback: (err: AWSError, data: AssociatePackageResponse) -> Unit = definedExternally): Request<AssociatePackageResponse, AWSError>
    open fun associatePackage(callback: (err: AWSError, data: AssociatePackageResponse) -> Unit = definedExternally): Request<AssociatePackageResponse, AWSError>
    open fun cancelElasticsearchServiceSoftwareUpdate(params: CancelElasticsearchServiceSoftwareUpdateRequest, callback: (err: AWSError, data: CancelElasticsearchServiceSoftwareUpdateResponse) -> Unit = definedExternally): Request<CancelElasticsearchServiceSoftwareUpdateResponse, AWSError>
    open fun cancelElasticsearchServiceSoftwareUpdate(callback: (err: AWSError, data: CancelElasticsearchServiceSoftwareUpdateResponse) -> Unit = definedExternally): Request<CancelElasticsearchServiceSoftwareUpdateResponse, AWSError>
    open fun createElasticsearchDomain(params: CreateElasticsearchDomainRequest, callback: (err: AWSError, data: CreateElasticsearchDomainResponse) -> Unit = definedExternally): Request<CreateElasticsearchDomainResponse, AWSError>
    open fun createElasticsearchDomain(callback: (err: AWSError, data: CreateElasticsearchDomainResponse) -> Unit = definedExternally): Request<CreateElasticsearchDomainResponse, AWSError>
    open fun createPackage(params: CreatePackageRequest, callback: (err: AWSError, data: CreatePackageResponse) -> Unit = definedExternally): Request<CreatePackageResponse, AWSError>
    open fun createPackage(callback: (err: AWSError, data: CreatePackageResponse) -> Unit = definedExternally): Request<CreatePackageResponse, AWSError>
    open fun deleteElasticsearchDomain(params: DeleteElasticsearchDomainRequest, callback: (err: AWSError, data: DeleteElasticsearchDomainResponse) -> Unit = definedExternally): Request<DeleteElasticsearchDomainResponse, AWSError>
    open fun deleteElasticsearchDomain(callback: (err: AWSError, data: DeleteElasticsearchDomainResponse) -> Unit = definedExternally): Request<DeleteElasticsearchDomainResponse, AWSError>
    open fun deleteElasticsearchServiceRole(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePackage(params: DeletePackageRequest, callback: (err: AWSError, data: DeletePackageResponse) -> Unit = definedExternally): Request<DeletePackageResponse, AWSError>
    open fun deletePackage(callback: (err: AWSError, data: DeletePackageResponse) -> Unit = definedExternally): Request<DeletePackageResponse, AWSError>
    open fun describeElasticsearchDomain(params: DescribeElasticsearchDomainRequest, callback: (err: AWSError, data: DescribeElasticsearchDomainResponse) -> Unit = definedExternally): Request<DescribeElasticsearchDomainResponse, AWSError>
    open fun describeElasticsearchDomain(callback: (err: AWSError, data: DescribeElasticsearchDomainResponse) -> Unit = definedExternally): Request<DescribeElasticsearchDomainResponse, AWSError>
    open fun describeElasticsearchDomainConfig(params: DescribeElasticsearchDomainConfigRequest, callback: (err: AWSError, data: DescribeElasticsearchDomainConfigResponse) -> Unit = definedExternally): Request<DescribeElasticsearchDomainConfigResponse, AWSError>
    open fun describeElasticsearchDomainConfig(callback: (err: AWSError, data: DescribeElasticsearchDomainConfigResponse) -> Unit = definedExternally): Request<DescribeElasticsearchDomainConfigResponse, AWSError>
    open fun describeElasticsearchDomains(params: DescribeElasticsearchDomainsRequest, callback: (err: AWSError, data: DescribeElasticsearchDomainsResponse) -> Unit = definedExternally): Request<DescribeElasticsearchDomainsResponse, AWSError>
    open fun describeElasticsearchDomains(callback: (err: AWSError, data: DescribeElasticsearchDomainsResponse) -> Unit = definedExternally): Request<DescribeElasticsearchDomainsResponse, AWSError>
    open fun describeElasticsearchInstanceTypeLimits(params: DescribeElasticsearchInstanceTypeLimitsRequest, callback: (err: AWSError, data: DescribeElasticsearchInstanceTypeLimitsResponse) -> Unit = definedExternally): Request<DescribeElasticsearchInstanceTypeLimitsResponse, AWSError>
    open fun describeElasticsearchInstanceTypeLimits(callback: (err: AWSError, data: DescribeElasticsearchInstanceTypeLimitsResponse) -> Unit = definedExternally): Request<DescribeElasticsearchInstanceTypeLimitsResponse, AWSError>
    open fun describePackages(params: DescribePackagesRequest, callback: (err: AWSError, data: DescribePackagesResponse) -> Unit = definedExternally): Request<DescribePackagesResponse, AWSError>
    open fun describePackages(callback: (err: AWSError, data: DescribePackagesResponse) -> Unit = definedExternally): Request<DescribePackagesResponse, AWSError>
    open fun describeReservedElasticsearchInstanceOfferings(params: DescribeReservedElasticsearchInstanceOfferingsRequest, callback: (err: AWSError, data: DescribeReservedElasticsearchInstanceOfferingsResponse) -> Unit = definedExternally): Request<DescribeReservedElasticsearchInstanceOfferingsResponse, AWSError>
    open fun describeReservedElasticsearchInstanceOfferings(callback: (err: AWSError, data: DescribeReservedElasticsearchInstanceOfferingsResponse) -> Unit = definedExternally): Request<DescribeReservedElasticsearchInstanceOfferingsResponse, AWSError>
    open fun describeReservedElasticsearchInstances(params: DescribeReservedElasticsearchInstancesRequest, callback: (err: AWSError, data: DescribeReservedElasticsearchInstancesResponse) -> Unit = definedExternally): Request<DescribeReservedElasticsearchInstancesResponse, AWSError>
    open fun describeReservedElasticsearchInstances(callback: (err: AWSError, data: DescribeReservedElasticsearchInstancesResponse) -> Unit = definedExternally): Request<DescribeReservedElasticsearchInstancesResponse, AWSError>
    open fun dissociatePackage(params: DissociatePackageRequest, callback: (err: AWSError, data: DissociatePackageResponse) -> Unit = definedExternally): Request<DissociatePackageResponse, AWSError>
    open fun dissociatePackage(callback: (err: AWSError, data: DissociatePackageResponse) -> Unit = definedExternally): Request<DissociatePackageResponse, AWSError>
    open fun getCompatibleElasticsearchVersions(params: GetCompatibleElasticsearchVersionsRequest, callback: (err: AWSError, data: GetCompatibleElasticsearchVersionsResponse) -> Unit = definedExternally): Request<GetCompatibleElasticsearchVersionsResponse, AWSError>
    open fun getCompatibleElasticsearchVersions(callback: (err: AWSError, data: GetCompatibleElasticsearchVersionsResponse) -> Unit = definedExternally): Request<GetCompatibleElasticsearchVersionsResponse, AWSError>
    open fun getUpgradeHistory(params: GetUpgradeHistoryRequest, callback: (err: AWSError, data: GetUpgradeHistoryResponse) -> Unit = definedExternally): Request<GetUpgradeHistoryResponse, AWSError>
    open fun getUpgradeHistory(callback: (err: AWSError, data: GetUpgradeHistoryResponse) -> Unit = definedExternally): Request<GetUpgradeHistoryResponse, AWSError>
    open fun getUpgradeStatus(params: GetUpgradeStatusRequest, callback: (err: AWSError, data: GetUpgradeStatusResponse) -> Unit = definedExternally): Request<GetUpgradeStatusResponse, AWSError>
    open fun getUpgradeStatus(callback: (err: AWSError, data: GetUpgradeStatusResponse) -> Unit = definedExternally): Request<GetUpgradeStatusResponse, AWSError>
    open fun listDomainNames(callback: (err: AWSError, data: ListDomainNamesResponse) -> Unit = definedExternally): Request<ListDomainNamesResponse, AWSError>
    open fun listDomainsForPackage(params: ListDomainsForPackageRequest, callback: (err: AWSError, data: ListDomainsForPackageResponse) -> Unit = definedExternally): Request<ListDomainsForPackageResponse, AWSError>
    open fun listDomainsForPackage(callback: (err: AWSError, data: ListDomainsForPackageResponse) -> Unit = definedExternally): Request<ListDomainsForPackageResponse, AWSError>
    open fun listElasticsearchInstanceTypes(params: ListElasticsearchInstanceTypesRequest, callback: (err: AWSError, data: ListElasticsearchInstanceTypesResponse) -> Unit = definedExternally): Request<ListElasticsearchInstanceTypesResponse, AWSError>
    open fun listElasticsearchInstanceTypes(callback: (err: AWSError, data: ListElasticsearchInstanceTypesResponse) -> Unit = definedExternally): Request<ListElasticsearchInstanceTypesResponse, AWSError>
    open fun listElasticsearchVersions(params: ListElasticsearchVersionsRequest, callback: (err: AWSError, data: ListElasticsearchVersionsResponse) -> Unit = definedExternally): Request<ListElasticsearchVersionsResponse, AWSError>
    open fun listElasticsearchVersions(callback: (err: AWSError, data: ListElasticsearchVersionsResponse) -> Unit = definedExternally): Request<ListElasticsearchVersionsResponse, AWSError>
    open fun listPackagesForDomain(params: ListPackagesForDomainRequest, callback: (err: AWSError, data: ListPackagesForDomainResponse) -> Unit = definedExternally): Request<ListPackagesForDomainResponse, AWSError>
    open fun listPackagesForDomain(callback: (err: AWSError, data: ListPackagesForDomainResponse) -> Unit = definedExternally): Request<ListPackagesForDomainResponse, AWSError>
    open fun listTags(params: ListTagsRequest, callback: (err: AWSError, data: ListTagsResponse) -> Unit = definedExternally): Request<ListTagsResponse, AWSError>
    open fun listTags(callback: (err: AWSError, data: ListTagsResponse) -> Unit = definedExternally): Request<ListTagsResponse, AWSError>
    open fun purchaseReservedElasticsearchInstanceOffering(params: PurchaseReservedElasticsearchInstanceOfferingRequest, callback: (err: AWSError, data: PurchaseReservedElasticsearchInstanceOfferingResponse) -> Unit = definedExternally): Request<PurchaseReservedElasticsearchInstanceOfferingResponse, AWSError>
    open fun purchaseReservedElasticsearchInstanceOffering(callback: (err: AWSError, data: PurchaseReservedElasticsearchInstanceOfferingResponse) -> Unit = definedExternally): Request<PurchaseReservedElasticsearchInstanceOfferingResponse, AWSError>
    open fun removeTags(params: RemoveTagsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeTags(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun startElasticsearchServiceSoftwareUpdate(params: StartElasticsearchServiceSoftwareUpdateRequest, callback: (err: AWSError, data: StartElasticsearchServiceSoftwareUpdateResponse) -> Unit = definedExternally): Request<StartElasticsearchServiceSoftwareUpdateResponse, AWSError>
    open fun startElasticsearchServiceSoftwareUpdate(callback: (err: AWSError, data: StartElasticsearchServiceSoftwareUpdateResponse) -> Unit = definedExternally): Request<StartElasticsearchServiceSoftwareUpdateResponse, AWSError>
    open fun updateElasticsearchDomainConfig(params: UpdateElasticsearchDomainConfigRequest, callback: (err: AWSError, data: UpdateElasticsearchDomainConfigResponse) -> Unit = definedExternally): Request<UpdateElasticsearchDomainConfigResponse, AWSError>
    open fun updateElasticsearchDomainConfig(callback: (err: AWSError, data: UpdateElasticsearchDomainConfigResponse) -> Unit = definedExternally): Request<UpdateElasticsearchDomainConfigResponse, AWSError>
    open fun upgradeElasticsearchDomain(params: UpgradeElasticsearchDomainRequest, callback: (err: AWSError, data: UpgradeElasticsearchDomainResponse) -> Unit = definedExternally): Request<UpgradeElasticsearchDomainResponse, AWSError>
    open fun upgradeElasticsearchDomain(callback: (err: AWSError, data: UpgradeElasticsearchDomainResponse) -> Unit = definedExternally): Request<UpgradeElasticsearchDomainResponse, AWSError>
    interface AccessPoliciesStatus {
        var Options: PolicyDocument
        var Status: OptionStatus
    }
    interface AddTagsRequest {
        var ARN: ARN
        var TagList: TagList
    }
    interface AdditionalLimit {
        var LimitName: LimitName?
            get() = definedExternally
            set(value) = definedExternally
        var LimitValues: LimitValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdvancedOptions {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface AdvancedOptionsStatus {
        var Options: AdvancedOptions
        var Status: OptionStatus
    }
    interface AdvancedSecurityOptions {
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var InternalUserDatabaseEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdvancedSecurityOptionsInput {
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var InternalUserDatabaseEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var MasterUserOptions: MasterUserOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdvancedSecurityOptionsStatus {
        var Options: AdvancedSecurityOptions
        var Status: OptionStatus
    }
    interface AssociatePackageRequest {
        var PackageID: PackageID
        var DomainName: DomainName
    }
    interface AssociatePackageResponse {
        var DomainPackageDetails: DomainPackageDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelElasticsearchServiceSoftwareUpdateRequest {
        var DomainName: DomainName
    }
    interface CancelElasticsearchServiceSoftwareUpdateResponse {
        var ServiceSoftwareOptions: ServiceSoftwareOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CognitoOptions {
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var UserPoolId: UserPoolId?
            get() = definedExternally
            set(value) = definedExternally
        var IdentityPoolId: IdentityPoolId?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CognitoOptionsStatus {
        var Options: CognitoOptions
        var Status: OptionStatus
    }
    interface CompatibleVersionsMap {
        var SourceVersion: ElasticsearchVersionString?
            get() = definedExternally
            set(value) = definedExternally
        var TargetVersions: ElasticsearchVersionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateElasticsearchDomainRequest {
        var DomainName: DomainName
        var ElasticsearchVersion: ElasticsearchVersionString?
            get() = definedExternally
            set(value) = definedExternally
        var ElasticsearchClusterConfig: ElasticsearchClusterConfig?
            get() = definedExternally
            set(value) = definedExternally
        var EBSOptions: EBSOptions?
            get() = definedExternally
            set(value) = definedExternally
        var AccessPolicies: PolicyDocument?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotOptions: SnapshotOptions?
            get() = definedExternally
            set(value) = definedExternally
        var VPCOptions: VPCOptions?
            get() = definedExternally
            set(value) = definedExternally
        var CognitoOptions: CognitoOptions?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionAtRestOptions: EncryptionAtRestOptions?
            get() = definedExternally
            set(value) = definedExternally
        var NodeToNodeEncryptionOptions: NodeToNodeEncryptionOptions?
            get() = definedExternally
            set(value) = definedExternally
        var AdvancedOptions: AdvancedOptions?
            get() = definedExternally
            set(value) = definedExternally
        var LogPublishingOptions: LogPublishingOptions?
            get() = definedExternally
            set(value) = definedExternally
        var DomainEndpointOptions: DomainEndpointOptions?
            get() = definedExternally
            set(value) = definedExternally
        var AdvancedSecurityOptions: AdvancedSecurityOptionsInput?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateElasticsearchDomainResponse {
        var DomainStatus: ElasticsearchDomainStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePackageRequest {
        var PackageName: PackageName
        var PackageType: String /* "TXT-DICTIONARY" | String */
        var PackageDescription: PackageDescription?
            get() = definedExternally
            set(value) = definedExternally
        var PackageSource: PackageSource
    }
    interface CreatePackageResponse {
        var PackageDetails: PackageDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteElasticsearchDomainRequest {
        var DomainName: DomainName
    }
    interface DeleteElasticsearchDomainResponse {
        var DomainStatus: ElasticsearchDomainStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeletePackageRequest {
        var PackageID: PackageID
    }
    interface DeletePackageResponse {
        var PackageDetails: PackageDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeElasticsearchDomainConfigRequest {
        var DomainName: DomainName
    }
    interface DescribeElasticsearchDomainConfigResponse {
        var DomainConfig: ElasticsearchDomainConfig
    }
    interface DescribeElasticsearchDomainRequest {
        var DomainName: DomainName
    }
    interface DescribeElasticsearchDomainResponse {
        var DomainStatus: ElasticsearchDomainStatus
    }
    interface DescribeElasticsearchDomainsRequest {
        var DomainNames: DomainNameList
    }
    interface DescribeElasticsearchDomainsResponse {
        var DomainStatusList: ElasticsearchDomainStatusList
    }
    interface DescribeElasticsearchInstanceTypeLimitsRequest {
        var DomainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: String /* "m3.medium.elasticsearch" | "m3.large.elasticsearch" | "m3.xlarge.elasticsearch" | "m3.2xlarge.elasticsearch" | "m4.large.elasticsearch" | "m4.xlarge.elasticsearch" | "m4.2xlarge.elasticsearch" | "m4.4xlarge.elasticsearch" | "m4.10xlarge.elasticsearch" | "m5.large.elasticsearch" | "m5.xlarge.elasticsearch" | "m5.2xlarge.elasticsearch" | "m5.4xlarge.elasticsearch" | "m5.12xlarge.elasticsearch" | "r5.large.elasticsearch" | "r5.xlarge.elasticsearch" | "r5.2xlarge.elasticsearch" | "r5.4xlarge.elasticsearch" | "r5.12xlarge.elasticsearch" | "c5.large.elasticsearch" | "c5.xlarge.elasticsearch" | "c5.2xlarge.elasticsearch" | "c5.4xlarge.elasticsearch" | "c5.9xlarge.elasticsearch" | "c5.18xlarge.elasticsearch" | "ultrawarm1.medium.elasticsearch" | "ultrawarm1.large.elasticsearch" | "t2.micro.elasticsearch" | "t2.small.elasticsearch" | "t2.medium.elasticsearch" | "r3.large.elasticsearch" | "r3.xlarge.elasticsearch" | "r3.2xlarge.elasticsearch" | "r3.4xlarge.elasticsearch" | "r3.8xlarge.elasticsearch" | "i2.xlarge.elasticsearch" | "i2.2xlarge.elasticsearch" | "d2.xlarge.elasticsearch" | "d2.2xlarge.elasticsearch" | "d2.4xlarge.elasticsearch" | "d2.8xlarge.elasticsearch" | "c4.large.elasticsearch" | "c4.xlarge.elasticsearch" | "c4.2xlarge.elasticsearch" | "c4.4xlarge.elasticsearch" | "c4.8xlarge.elasticsearch" | "r4.large.elasticsearch" | "r4.xlarge.elasticsearch" | "r4.2xlarge.elasticsearch" | "r4.4xlarge.elasticsearch" | "r4.8xlarge.elasticsearch" | "r4.16xlarge.elasticsearch" | "i3.large.elasticsearch" | "i3.xlarge.elasticsearch" | "i3.2xlarge.elasticsearch" | "i3.4xlarge.elasticsearch" | "i3.8xlarge.elasticsearch" | "i3.16xlarge.elasticsearch" | String */
        var ElasticsearchVersion: ElasticsearchVersionString
    }
    interface DescribeElasticsearchInstanceTypeLimitsResponse {
        var LimitsByRole: LimitsByRole?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePackagesFilter {
        var Name: String /* "PackageID" | "PackageName" | "PackageStatus" | String */
        var Value: DescribePackagesFilterValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePackagesRequest {
        var Filters: DescribePackagesFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePackagesResponse {
        var PackageDetailsList: PackageDetailsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeReservedElasticsearchInstanceOfferingsRequest {
        var ReservedElasticsearchInstanceOfferingId: GUID?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeReservedElasticsearchInstanceOfferingsResponse {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var ReservedElasticsearchInstanceOfferings: ReservedElasticsearchInstanceOfferingList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeReservedElasticsearchInstancesRequest {
        var ReservedElasticsearchInstanceId: GUID?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeReservedElasticsearchInstancesResponse {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReservedElasticsearchInstances: ReservedElasticsearchInstanceList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DissociatePackageRequest {
        var PackageID: PackageID
        var DomainName: DomainName
    }
    interface DissociatePackageResponse {
        var DomainPackageDetails: DomainPackageDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DomainEndpointOptions {
        var EnforceHTTPS: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var TLSSecurityPolicy: String /* "Policy-Min-TLS-1-0-2019-07" | "Policy-Min-TLS-1-2-2019-07" | String */
    }
    interface DomainEndpointOptionsStatus {
        var Options: DomainEndpointOptions
        var Status: OptionStatus
    }
    interface DomainInfo {
        var DomainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DomainPackageDetails {
        var PackageID: PackageID?
            get() = definedExternally
            set(value) = definedExternally
        var PackageName: PackageName?
            get() = definedExternally
            set(value) = definedExternally
        var PackageType: String /* "TXT-DICTIONARY" | String */
        var LastUpdated: LastUpdated?
            get() = definedExternally
            set(value) = definedExternally
        var DomainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
        var DomainPackageStatus: String /* "ASSOCIATING" | "ASSOCIATION_FAILED" | "ACTIVE" | "DISSOCIATING" | "DISSOCIATION_FAILED" | String */
        var ReferencePath: ReferencePath?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorDetails: ErrorDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EBSOptions {
        var EBSEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeType: String /* "standard" | "gp2" | "io1" | String */
        var VolumeSize: IntegerClass?
            get() = definedExternally
            set(value) = definedExternally
        var Iops: IntegerClass?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EBSOptionsStatus {
        var Options: EBSOptions
        var Status: OptionStatus
    }
    interface ElasticsearchClusterConfig {
        var InstanceType: String /* "m3.medium.elasticsearch" | "m3.large.elasticsearch" | "m3.xlarge.elasticsearch" | "m3.2xlarge.elasticsearch" | "m4.large.elasticsearch" | "m4.xlarge.elasticsearch" | "m4.2xlarge.elasticsearch" | "m4.4xlarge.elasticsearch" | "m4.10xlarge.elasticsearch" | "m5.large.elasticsearch" | "m5.xlarge.elasticsearch" | "m5.2xlarge.elasticsearch" | "m5.4xlarge.elasticsearch" | "m5.12xlarge.elasticsearch" | "r5.large.elasticsearch" | "r5.xlarge.elasticsearch" | "r5.2xlarge.elasticsearch" | "r5.4xlarge.elasticsearch" | "r5.12xlarge.elasticsearch" | "c5.large.elasticsearch" | "c5.xlarge.elasticsearch" | "c5.2xlarge.elasticsearch" | "c5.4xlarge.elasticsearch" | "c5.9xlarge.elasticsearch" | "c5.18xlarge.elasticsearch" | "ultrawarm1.medium.elasticsearch" | "ultrawarm1.large.elasticsearch" | "t2.micro.elasticsearch" | "t2.small.elasticsearch" | "t2.medium.elasticsearch" | "r3.large.elasticsearch" | "r3.xlarge.elasticsearch" | "r3.2xlarge.elasticsearch" | "r3.4xlarge.elasticsearch" | "r3.8xlarge.elasticsearch" | "i2.xlarge.elasticsearch" | "i2.2xlarge.elasticsearch" | "d2.xlarge.elasticsearch" | "d2.2xlarge.elasticsearch" | "d2.4xlarge.elasticsearch" | "d2.8xlarge.elasticsearch" | "c4.large.elasticsearch" | "c4.xlarge.elasticsearch" | "c4.2xlarge.elasticsearch" | "c4.4xlarge.elasticsearch" | "c4.8xlarge.elasticsearch" | "r4.large.elasticsearch" | "r4.xlarge.elasticsearch" | "r4.2xlarge.elasticsearch" | "r4.4xlarge.elasticsearch" | "r4.8xlarge.elasticsearch" | "r4.16xlarge.elasticsearch" | "i3.large.elasticsearch" | "i3.xlarge.elasticsearch" | "i3.2xlarge.elasticsearch" | "i3.4xlarge.elasticsearch" | "i3.8xlarge.elasticsearch" | "i3.16xlarge.elasticsearch" | String */
        var InstanceCount: IntegerClass?
            get() = definedExternally
            set(value) = definedExternally
        var DedicatedMasterEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ZoneAwarenessEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ZoneAwarenessConfig: ZoneAwarenessConfig?
            get() = definedExternally
            set(value) = definedExternally
        var DedicatedMasterType: String /* "m3.medium.elasticsearch" | "m3.large.elasticsearch" | "m3.xlarge.elasticsearch" | "m3.2xlarge.elasticsearch" | "m4.large.elasticsearch" | "m4.xlarge.elasticsearch" | "m4.2xlarge.elasticsearch" | "m4.4xlarge.elasticsearch" | "m4.10xlarge.elasticsearch" | "m5.large.elasticsearch" | "m5.xlarge.elasticsearch" | "m5.2xlarge.elasticsearch" | "m5.4xlarge.elasticsearch" | "m5.12xlarge.elasticsearch" | "r5.large.elasticsearch" | "r5.xlarge.elasticsearch" | "r5.2xlarge.elasticsearch" | "r5.4xlarge.elasticsearch" | "r5.12xlarge.elasticsearch" | "c5.large.elasticsearch" | "c5.xlarge.elasticsearch" | "c5.2xlarge.elasticsearch" | "c5.4xlarge.elasticsearch" | "c5.9xlarge.elasticsearch" | "c5.18xlarge.elasticsearch" | "ultrawarm1.medium.elasticsearch" | "ultrawarm1.large.elasticsearch" | "t2.micro.elasticsearch" | "t2.small.elasticsearch" | "t2.medium.elasticsearch" | "r3.large.elasticsearch" | "r3.xlarge.elasticsearch" | "r3.2xlarge.elasticsearch" | "r3.4xlarge.elasticsearch" | "r3.8xlarge.elasticsearch" | "i2.xlarge.elasticsearch" | "i2.2xlarge.elasticsearch" | "d2.xlarge.elasticsearch" | "d2.2xlarge.elasticsearch" | "d2.4xlarge.elasticsearch" | "d2.8xlarge.elasticsearch" | "c4.large.elasticsearch" | "c4.xlarge.elasticsearch" | "c4.2xlarge.elasticsearch" | "c4.4xlarge.elasticsearch" | "c4.8xlarge.elasticsearch" | "r4.large.elasticsearch" | "r4.xlarge.elasticsearch" | "r4.2xlarge.elasticsearch" | "r4.4xlarge.elasticsearch" | "r4.8xlarge.elasticsearch" | "r4.16xlarge.elasticsearch" | "i3.large.elasticsearch" | "i3.xlarge.elasticsearch" | "i3.2xlarge.elasticsearch" | "i3.4xlarge.elasticsearch" | "i3.8xlarge.elasticsearch" | "i3.16xlarge.elasticsearch" | String */
        var DedicatedMasterCount: IntegerClass?
            get() = definedExternally
            set(value) = definedExternally
        var WarmEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var WarmType: String /* "ultrawarm1.medium.elasticsearch" | "ultrawarm1.large.elasticsearch" | String */
        var WarmCount: IntegerClass?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ElasticsearchClusterConfigStatus {
        var Options: ElasticsearchClusterConfig
        var Status: OptionStatus
    }
    interface ElasticsearchDomainConfig {
        var ElasticsearchVersion: ElasticsearchVersionStatus?
            get() = definedExternally
            set(value) = definedExternally
        var ElasticsearchClusterConfig: ElasticsearchClusterConfigStatus?
            get() = definedExternally
            set(value) = definedExternally
        var EBSOptions: EBSOptionsStatus?
            get() = definedExternally
            set(value) = definedExternally
        var AccessPolicies: AccessPoliciesStatus?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotOptions: SnapshotOptionsStatus?
            get() = definedExternally
            set(value) = definedExternally
        var VPCOptions: VPCDerivedInfoStatus?
            get() = definedExternally
            set(value) = definedExternally
        var CognitoOptions: CognitoOptionsStatus?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionAtRestOptions: EncryptionAtRestOptionsStatus?
            get() = definedExternally
            set(value) = definedExternally
        var NodeToNodeEncryptionOptions: NodeToNodeEncryptionOptionsStatus?
            get() = definedExternally
            set(value) = definedExternally
        var AdvancedOptions: AdvancedOptionsStatus?
            get() = definedExternally
            set(value) = definedExternally
        var LogPublishingOptions: LogPublishingOptionsStatus?
            get() = definedExternally
            set(value) = definedExternally
        var DomainEndpointOptions: DomainEndpointOptionsStatus?
            get() = definedExternally
            set(value) = definedExternally
        var AdvancedSecurityOptions: AdvancedSecurityOptionsStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ElasticsearchDomainStatus {
        var DomainId: DomainId
        var DomainName: DomainName
        var ARN: ARN
        var Created: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Deleted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Endpoint: ServiceUrl?
            get() = definedExternally
            set(value) = definedExternally
        var Endpoints: EndpointsMap?
            get() = definedExternally
            set(value) = definedExternally
        var Processing: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var UpgradeProcessing: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ElasticsearchVersion: ElasticsearchVersionString?
            get() = definedExternally
            set(value) = definedExternally
        var ElasticsearchClusterConfig: ElasticsearchClusterConfig
        var EBSOptions: EBSOptions?
            get() = definedExternally
            set(value) = definedExternally
        var AccessPolicies: PolicyDocument?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotOptions: SnapshotOptions?
            get() = definedExternally
            set(value) = definedExternally
        var VPCOptions: VPCDerivedInfo?
            get() = definedExternally
            set(value) = definedExternally
        var CognitoOptions: CognitoOptions?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionAtRestOptions: EncryptionAtRestOptions?
            get() = definedExternally
            set(value) = definedExternally
        var NodeToNodeEncryptionOptions: NodeToNodeEncryptionOptions?
            get() = definedExternally
            set(value) = definedExternally
        var AdvancedOptions: AdvancedOptions?
            get() = definedExternally
            set(value) = definedExternally
        var LogPublishingOptions: LogPublishingOptions?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceSoftwareOptions: ServiceSoftwareOptions?
            get() = definedExternally
            set(value) = definedExternally
        var DomainEndpointOptions: DomainEndpointOptions?
            get() = definedExternally
            set(value) = definedExternally
        var AdvancedSecurityOptions: AdvancedSecurityOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ElasticsearchVersionStatus {
        var Options: ElasticsearchVersionString
        var Status: OptionStatus
    }
    interface EncryptionAtRestOptions {
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EncryptionAtRestOptionsStatus {
        var Options: EncryptionAtRestOptions
        var Status: OptionStatus
    }
    interface EndpointsMap {
        @nativeGetter
        operator fun get(key: String): ServiceUrl?
        @nativeSetter
        operator fun set(key: String, value: ServiceUrl)
    }
    interface ErrorDetails {
        var ErrorType: ErrorType?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCompatibleElasticsearchVersionsRequest {
        var DomainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCompatibleElasticsearchVersionsResponse {
        var CompatibleElasticsearchVersions: CompatibleElasticsearchVersionsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetUpgradeHistoryRequest {
        var DomainName: DomainName
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetUpgradeHistoryResponse {
        var UpgradeHistories: UpgradeHistoryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetUpgradeStatusRequest {
        var DomainName: DomainName
    }
    interface GetUpgradeStatusResponse {
        var UpgradeStep: String /* "PRE_UPGRADE_CHECK" | "SNAPSHOT" | "UPGRADE" | String */
        var StepStatus: String /* "IN_PROGRESS" | "SUCCEEDED" | "SUCCEEDED_WITH_ISSUES" | "FAILED" | String */
        var UpgradeName: UpgradeName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceCountLimits {
        var MinimumInstanceCount: MinimumInstanceCount?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumInstanceCount: MaximumInstanceCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceLimits {
        var InstanceCountLimits: InstanceCountLimits?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Limits {
        var StorageTypes: StorageTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceLimits: InstanceLimits?
            get() = definedExternally
            set(value) = definedExternally
        var AdditionalLimits: AdditionalLimitList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LimitsByRole {
        @nativeGetter
        operator fun get(key: String): Limits?
        @nativeSetter
        operator fun set(key: String, value: Limits)
    }
    interface ListDomainNamesResponse {
        var DomainNames: DomainInfoList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDomainsForPackageRequest {
        var PackageID: PackageID
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDomainsForPackageResponse {
        var DomainPackageDetailsList: DomainPackageDetailsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListElasticsearchInstanceTypesRequest {
        var ElasticsearchVersion: ElasticsearchVersionString
        var DomainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListElasticsearchInstanceTypesResponse {
        var ElasticsearchInstanceTypes: ElasticsearchInstanceTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListElasticsearchVersionsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListElasticsearchVersionsResponse {
        var ElasticsearchVersions: ElasticsearchVersionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPackagesForDomainRequest {
        var DomainName: DomainName
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPackagesForDomainResponse {
        var DomainPackageDetailsList: DomainPackageDetailsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsRequest {
        var ARN: ARN
    }
    interface ListTagsResponse {
        var TagList: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogPublishingOption {
        var CloudWatchLogsLogGroupArn: CloudWatchLogsLogGroupArn?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogPublishingOptions {
        @nativeGetter
        operator fun get(key: String): LogPublishingOption?
        @nativeSetter
        operator fun set(key: String, value: LogPublishingOption)
    }
    interface LogPublishingOptionsStatus {
        var Options: LogPublishingOptions?
            get() = definedExternally
            set(value) = definedExternally
        var Status: OptionStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MasterUserOptions {
        var MasterUserARN: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var MasterUserName: Username?
            get() = definedExternally
            set(value) = definedExternally
        var MasterUserPassword: Password?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodeToNodeEncryptionOptions {
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodeToNodeEncryptionOptionsStatus {
        var Options: NodeToNodeEncryptionOptions
        var Status: OptionStatus
    }
    interface OptionStatus {
        var CreationDate: UpdateTimestamp
        var UpdateDate: UpdateTimestamp
        var UpdateVersion: UIntValue?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "RequiresIndexDocuments" | "Processing" | "Active" | String */
        var PendingDeletion: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PackageDetails {
        var PackageID: PackageID?
            get() = definedExternally
            set(value) = definedExternally
        var PackageName: PackageName?
            get() = definedExternally
            set(value) = definedExternally
        var PackageType: String /* "TXT-DICTIONARY" | String */
        var PackageDescription: PackageDescription?
            get() = definedExternally
            set(value) = definedExternally
        var PackageStatus: String /* "COPYING" | "COPY_FAILED" | "VALIDATING" | "VALIDATION_FAILED" | "AVAILABLE" | "DELETING" | "DELETED" | "DELETE_FAILED" | String */
        var CreatedAt: CreatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorDetails: ErrorDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PackageSource {
        var S3BucketName: S3BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var S3Key: S3Key?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PurchaseReservedElasticsearchInstanceOfferingRequest {
        var ReservedElasticsearchInstanceOfferingId: GUID
        var ReservationName: ReservationToken
        var InstanceCount: InstanceCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PurchaseReservedElasticsearchInstanceOfferingResponse {
        var ReservedElasticsearchInstanceId: GUID?
            get() = definedExternally
            set(value) = definedExternally
        var ReservationName: ReservationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecurringCharge {
        var RecurringChargeAmount: Double?
            get() = definedExternally
            set(value) = definedExternally
        var RecurringChargeFrequency: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveTagsRequest {
        var ARN: ARN
        var TagKeys: StringList
    }
    interface ReservedElasticsearchInstance {
        var ReservationName: ReservationToken?
            get() = definedExternally
            set(value) = definedExternally
        var ReservedElasticsearchInstanceId: GUID?
            get() = definedExternally
            set(value) = definedExternally
        var ReservedElasticsearchInstanceOfferingId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ElasticsearchInstanceType: String /* "m3.medium.elasticsearch" | "m3.large.elasticsearch" | "m3.xlarge.elasticsearch" | "m3.2xlarge.elasticsearch" | "m4.large.elasticsearch" | "m4.xlarge.elasticsearch" | "m4.2xlarge.elasticsearch" | "m4.4xlarge.elasticsearch" | "m4.10xlarge.elasticsearch" | "m5.large.elasticsearch" | "m5.xlarge.elasticsearch" | "m5.2xlarge.elasticsearch" | "m5.4xlarge.elasticsearch" | "m5.12xlarge.elasticsearch" | "r5.large.elasticsearch" | "r5.xlarge.elasticsearch" | "r5.2xlarge.elasticsearch" | "r5.4xlarge.elasticsearch" | "r5.12xlarge.elasticsearch" | "c5.large.elasticsearch" | "c5.xlarge.elasticsearch" | "c5.2xlarge.elasticsearch" | "c5.4xlarge.elasticsearch" | "c5.9xlarge.elasticsearch" | "c5.18xlarge.elasticsearch" | "ultrawarm1.medium.elasticsearch" | "ultrawarm1.large.elasticsearch" | "t2.micro.elasticsearch" | "t2.small.elasticsearch" | "t2.medium.elasticsearch" | "r3.large.elasticsearch" | "r3.xlarge.elasticsearch" | "r3.2xlarge.elasticsearch" | "r3.4xlarge.elasticsearch" | "r3.8xlarge.elasticsearch" | "i2.xlarge.elasticsearch" | "i2.2xlarge.elasticsearch" | "d2.xlarge.elasticsearch" | "d2.2xlarge.elasticsearch" | "d2.4xlarge.elasticsearch" | "d2.8xlarge.elasticsearch" | "c4.large.elasticsearch" | "c4.xlarge.elasticsearch" | "c4.2xlarge.elasticsearch" | "c4.4xlarge.elasticsearch" | "c4.8xlarge.elasticsearch" | "r4.large.elasticsearch" | "r4.xlarge.elasticsearch" | "r4.2xlarge.elasticsearch" | "r4.4xlarge.elasticsearch" | "r4.8xlarge.elasticsearch" | "r4.16xlarge.elasticsearch" | "i3.large.elasticsearch" | "i3.xlarge.elasticsearch" | "i3.2xlarge.elasticsearch" | "i3.4xlarge.elasticsearch" | "i3.8xlarge.elasticsearch" | "i3.16xlarge.elasticsearch" | String */
        var StartTime: UpdateTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var FixedPrice: Double?
            get() = definedExternally
            set(value) = definedExternally
        var UsagePrice: Double?
            get() = definedExternally
            set(value) = definedExternally
        var CurrencyCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var ElasticsearchInstanceCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var State: String?
            get() = definedExternally
            set(value) = definedExternally
        var PaymentOption: String /* "ALL_UPFRONT" | "PARTIAL_UPFRONT" | "NO_UPFRONT" | String */
        var RecurringCharges: RecurringChargeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReservedElasticsearchInstanceOffering {
        var ReservedElasticsearchInstanceOfferingId: GUID?
            get() = definedExternally
            set(value) = definedExternally
        var ElasticsearchInstanceType: String /* "m3.medium.elasticsearch" | "m3.large.elasticsearch" | "m3.xlarge.elasticsearch" | "m3.2xlarge.elasticsearch" | "m4.large.elasticsearch" | "m4.xlarge.elasticsearch" | "m4.2xlarge.elasticsearch" | "m4.4xlarge.elasticsearch" | "m4.10xlarge.elasticsearch" | "m5.large.elasticsearch" | "m5.xlarge.elasticsearch" | "m5.2xlarge.elasticsearch" | "m5.4xlarge.elasticsearch" | "m5.12xlarge.elasticsearch" | "r5.large.elasticsearch" | "r5.xlarge.elasticsearch" | "r5.2xlarge.elasticsearch" | "r5.4xlarge.elasticsearch" | "r5.12xlarge.elasticsearch" | "c5.large.elasticsearch" | "c5.xlarge.elasticsearch" | "c5.2xlarge.elasticsearch" | "c5.4xlarge.elasticsearch" | "c5.9xlarge.elasticsearch" | "c5.18xlarge.elasticsearch" | "ultrawarm1.medium.elasticsearch" | "ultrawarm1.large.elasticsearch" | "t2.micro.elasticsearch" | "t2.small.elasticsearch" | "t2.medium.elasticsearch" | "r3.large.elasticsearch" | "r3.xlarge.elasticsearch" | "r3.2xlarge.elasticsearch" | "r3.4xlarge.elasticsearch" | "r3.8xlarge.elasticsearch" | "i2.xlarge.elasticsearch" | "i2.2xlarge.elasticsearch" | "d2.xlarge.elasticsearch" | "d2.2xlarge.elasticsearch" | "d2.4xlarge.elasticsearch" | "d2.8xlarge.elasticsearch" | "c4.large.elasticsearch" | "c4.xlarge.elasticsearch" | "c4.2xlarge.elasticsearch" | "c4.4xlarge.elasticsearch" | "c4.8xlarge.elasticsearch" | "r4.large.elasticsearch" | "r4.xlarge.elasticsearch" | "r4.2xlarge.elasticsearch" | "r4.4xlarge.elasticsearch" | "r4.8xlarge.elasticsearch" | "r4.16xlarge.elasticsearch" | "i3.large.elasticsearch" | "i3.xlarge.elasticsearch" | "i3.2xlarge.elasticsearch" | "i3.4xlarge.elasticsearch" | "i3.8xlarge.elasticsearch" | "i3.16xlarge.elasticsearch" | String */
        var Duration: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var FixedPrice: Double?
            get() = definedExternally
            set(value) = definedExternally
        var UsagePrice: Double?
            get() = definedExternally
            set(value) = definedExternally
        var CurrencyCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var PaymentOption: String /* "ALL_UPFRONT" | "PARTIAL_UPFRONT" | "NO_UPFRONT" | String */
        var RecurringCharges: RecurringChargeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServiceSoftwareOptions {
        var CurrentVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var NewVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var UpdateAvailable: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Cancellable: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var UpdateStatus: String /* "PENDING_UPDATE" | "IN_PROGRESS" | "COMPLETED" | "NOT_ELIGIBLE" | "ELIGIBLE" | String */
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var AutomatedUpdateDate: DeploymentCloseDateTimeStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SnapshotOptions {
        var AutomatedSnapshotStartHour: IntegerClass?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SnapshotOptionsStatus {
        var Options: SnapshotOptions
        var Status: OptionStatus
    }
    interface StartElasticsearchServiceSoftwareUpdateRequest {
        var DomainName: DomainName
    }
    interface StartElasticsearchServiceSoftwareUpdateResponse {
        var ServiceSoftwareOptions: ServiceSoftwareOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StorageType {
        var StorageTypeName: StorageTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var StorageSubTypeName: StorageSubTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var StorageTypeLimits: StorageTypeLimitList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StorageTypeLimit {
        var LimitName: LimitName?
            get() = definedExternally
            set(value) = definedExternally
        var LimitValues: LimitValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface UpdateElasticsearchDomainConfigRequest {
        var DomainName: DomainName
        var ElasticsearchClusterConfig: ElasticsearchClusterConfig?
            get() = definedExternally
            set(value) = definedExternally
        var EBSOptions: EBSOptions?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotOptions: SnapshotOptions?
            get() = definedExternally
            set(value) = definedExternally
        var VPCOptions: VPCOptions?
            get() = definedExternally
            set(value) = definedExternally
        var CognitoOptions: CognitoOptions?
            get() = definedExternally
            set(value) = definedExternally
        var AdvancedOptions: AdvancedOptions?
            get() = definedExternally
            set(value) = definedExternally
        var AccessPolicies: PolicyDocument?
            get() = definedExternally
            set(value) = definedExternally
        var LogPublishingOptions: LogPublishingOptions?
            get() = definedExternally
            set(value) = definedExternally
        var DomainEndpointOptions: DomainEndpointOptions?
            get() = definedExternally
            set(value) = definedExternally
        var AdvancedSecurityOptions: AdvancedSecurityOptionsInput?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateElasticsearchDomainConfigResponse {
        var DomainConfig: ElasticsearchDomainConfig
    }
    interface UpgradeElasticsearchDomainRequest {
        var DomainName: DomainName
        var TargetVersion: ElasticsearchVersionString
        var PerformCheckOnly: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpgradeElasticsearchDomainResponse {
        var DomainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
        var TargetVersion: ElasticsearchVersionString?
            get() = definedExternally
            set(value) = definedExternally
        var PerformCheckOnly: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpgradeHistory {
        var UpgradeName: UpgradeName?
            get() = definedExternally
            set(value) = definedExternally
        var StartTimestamp: StartTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var UpgradeStatus: String /* "IN_PROGRESS" | "SUCCEEDED" | "SUCCEEDED_WITH_ISSUES" | "FAILED" | String */
        var StepsList: UpgradeStepsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpgradeStepItem {
        var UpgradeStep: String /* "PRE_UPGRADE_CHECK" | "SNAPSHOT" | "UPGRADE" | String */
        var UpgradeStepStatus: String /* "IN_PROGRESS" | "SUCCEEDED" | "SUCCEEDED_WITH_ISSUES" | "FAILED" | String */
        var Issues: Issues?
            get() = definedExternally
            set(value) = definedExternally
        var ProgressPercent: Double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VPCDerivedInfo {
        var VPCId: String?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZones: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VPCDerivedInfoStatus {
        var Options: VPCDerivedInfo
        var Status: OptionStatus
    }
    interface VPCOptions {
        var SubnetIds: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ZoneAwarenessConfig {
        var AvailabilityZoneCount: IntegerClass?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2015-01-01" | "latest" | String */
    }
}