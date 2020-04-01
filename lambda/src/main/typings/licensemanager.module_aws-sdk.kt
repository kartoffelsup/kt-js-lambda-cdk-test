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
import LicenseManager.ConsumedLicenseSummary
import LicenseManager.Filter
import LicenseManager.InventoryFilter
import LicenseManager.LicenseConfigurationAssociation
import LicenseManager.LicenseConfigurationUsage
import LicenseManager.LicenseConfiguration
import LicenseManager.LicenseOperationFailure
import LicenseManager.LicenseSpecification
import LicenseManager.ManagedResourceSummary
import LicenseManager.Metadata
import LicenseManager.ProductInformationFilter
import LicenseManager.ProductInformation
import LicenseManager.ResourceInventory
import LicenseManager.Tag
import LicenseManager.CreateLicenseConfigurationRequest
import LicenseManager.CreateLicenseConfigurationResponse
import LicenseManager.DeleteLicenseConfigurationRequest
import LicenseManager.DeleteLicenseConfigurationResponse
import LicenseManager.GetLicenseConfigurationRequest
import LicenseManager.GetLicenseConfigurationResponse
import LicenseManager.GetServiceSettingsRequest
import LicenseManager.GetServiceSettingsResponse
import LicenseManager.ListAssociationsForLicenseConfigurationRequest
import LicenseManager.ListAssociationsForLicenseConfigurationResponse
import LicenseManager.ListFailuresForLicenseConfigurationOperationsRequest
import LicenseManager.ListFailuresForLicenseConfigurationOperationsResponse
import LicenseManager.ListLicenseConfigurationsRequest
import LicenseManager.ListLicenseConfigurationsResponse
import LicenseManager.ListLicenseSpecificationsForResourceRequest
import LicenseManager.ListLicenseSpecificationsForResourceResponse
import LicenseManager.ListResourceInventoryRequest
import LicenseManager.ListResourceInventoryResponse
import LicenseManager.ListTagsForResourceRequest
import LicenseManager.ListTagsForResourceResponse
import LicenseManager.ListUsageForLicenseConfigurationRequest
import LicenseManager.ListUsageForLicenseConfigurationResponse
import LicenseManager.TagResourceRequest
import LicenseManager.TagResourceResponse
import LicenseManager.UntagResourceRequest
import LicenseManager.UntagResourceResponse
import LicenseManager.UpdateLicenseConfigurationRequest
import LicenseManager.UpdateLicenseConfigurationResponse
import LicenseManager.UpdateLicenseSpecificationsForResourceRequest
import LicenseManager.UpdateLicenseSpecificationsForResourceResponse
import LicenseManager.UpdateServiceSettingsRequest
import LicenseManager.UpdateServiceSettingsResponse
import LicenseManager.AutomatedDiscoveryInformation
import LicenseManager.OrganizationConfiguration

typealias Boolean = Boolean

typealias BoxBoolean = Boolean

typealias BoxInteger = Number

typealias BoxLong = Number

typealias ConsumedLicenseSummaryList = Array<ConsumedLicenseSummary>

typealias DateTime = Date

typealias FilterName = String

typealias FilterValue = String

typealias FilterValues = Array<FilterValue>

typealias Filters = Array<Filter>

typealias InventoryFilterList = Array<InventoryFilter>

typealias LicenseConfigurationAssociations = Array<LicenseConfigurationAssociation>

typealias LicenseConfigurationUsageList = Array<LicenseConfigurationUsage>

typealias LicenseConfigurations = Array<LicenseConfiguration>

typealias LicenseOperationFailureList = Array<LicenseOperationFailure>

typealias LicenseSpecifications = Array<LicenseSpecification>

typealias ManagedResourceSummaryList = Array<ManagedResourceSummary>

typealias MetadataList = Array<Metadata>

typealias ProductInformationFilterList = Array<ProductInformationFilter>

typealias ProductInformationList = Array<ProductInformation>

typealias ResourceInventoryList = Array<ResourceInventory>

typealias String = String

typealias StringList = Array<String>

typealias TagKeyList = Array<String>

typealias TagList = Array<Tag>

@JsModule("aws-sdk")
external open class LicenseManager(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & LicenseManager.Types.ClientConfiguration */
    open fun createLicenseConfiguration(params: CreateLicenseConfigurationRequest, callback: (err: AWSError, data: CreateLicenseConfigurationResponse) -> Unit = definedExternally): Request<CreateLicenseConfigurationResponse, AWSError>
    open fun createLicenseConfiguration(callback: (err: AWSError, data: CreateLicenseConfigurationResponse) -> Unit = definedExternally): Request<CreateLicenseConfigurationResponse, AWSError>
    open fun deleteLicenseConfiguration(params: DeleteLicenseConfigurationRequest, callback: (err: AWSError, data: DeleteLicenseConfigurationResponse) -> Unit = definedExternally): Request<DeleteLicenseConfigurationResponse, AWSError>
    open fun deleteLicenseConfiguration(callback: (err: AWSError, data: DeleteLicenseConfigurationResponse) -> Unit = definedExternally): Request<DeleteLicenseConfigurationResponse, AWSError>
    open fun getLicenseConfiguration(params: GetLicenseConfigurationRequest, callback: (err: AWSError, data: GetLicenseConfigurationResponse) -> Unit = definedExternally): Request<GetLicenseConfigurationResponse, AWSError>
    open fun getLicenseConfiguration(callback: (err: AWSError, data: GetLicenseConfigurationResponse) -> Unit = definedExternally): Request<GetLicenseConfigurationResponse, AWSError>
    open fun getServiceSettings(params: GetServiceSettingsRequest, callback: (err: AWSError, data: GetServiceSettingsResponse) -> Unit = definedExternally): Request<GetServiceSettingsResponse, AWSError>
    open fun getServiceSettings(callback: (err: AWSError, data: GetServiceSettingsResponse) -> Unit = definedExternally): Request<GetServiceSettingsResponse, AWSError>
    open fun listAssociationsForLicenseConfiguration(params: ListAssociationsForLicenseConfigurationRequest, callback: (err: AWSError, data: ListAssociationsForLicenseConfigurationResponse) -> Unit = definedExternally): Request<ListAssociationsForLicenseConfigurationResponse, AWSError>
    open fun listAssociationsForLicenseConfiguration(callback: (err: AWSError, data: ListAssociationsForLicenseConfigurationResponse) -> Unit = definedExternally): Request<ListAssociationsForLicenseConfigurationResponse, AWSError>
    open fun listFailuresForLicenseConfigurationOperations(params: ListFailuresForLicenseConfigurationOperationsRequest, callback: (err: AWSError, data: ListFailuresForLicenseConfigurationOperationsResponse) -> Unit = definedExternally): Request<ListFailuresForLicenseConfigurationOperationsResponse, AWSError>
    open fun listFailuresForLicenseConfigurationOperations(callback: (err: AWSError, data: ListFailuresForLicenseConfigurationOperationsResponse) -> Unit = definedExternally): Request<ListFailuresForLicenseConfigurationOperationsResponse, AWSError>
    open fun listLicenseConfigurations(params: ListLicenseConfigurationsRequest, callback: (err: AWSError, data: ListLicenseConfigurationsResponse) -> Unit = definedExternally): Request<ListLicenseConfigurationsResponse, AWSError>
    open fun listLicenseConfigurations(callback: (err: AWSError, data: ListLicenseConfigurationsResponse) -> Unit = definedExternally): Request<ListLicenseConfigurationsResponse, AWSError>
    open fun listLicenseSpecificationsForResource(params: ListLicenseSpecificationsForResourceRequest, callback: (err: AWSError, data: ListLicenseSpecificationsForResourceResponse) -> Unit = definedExternally): Request<ListLicenseSpecificationsForResourceResponse, AWSError>
    open fun listLicenseSpecificationsForResource(callback: (err: AWSError, data: ListLicenseSpecificationsForResourceResponse) -> Unit = definedExternally): Request<ListLicenseSpecificationsForResourceResponse, AWSError>
    open fun listResourceInventory(params: ListResourceInventoryRequest, callback: (err: AWSError, data: ListResourceInventoryResponse) -> Unit = definedExternally): Request<ListResourceInventoryResponse, AWSError>
    open fun listResourceInventory(callback: (err: AWSError, data: ListResourceInventoryResponse) -> Unit = definedExternally): Request<ListResourceInventoryResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listUsageForLicenseConfiguration(params: ListUsageForLicenseConfigurationRequest, callback: (err: AWSError, data: ListUsageForLicenseConfigurationResponse) -> Unit = definedExternally): Request<ListUsageForLicenseConfigurationResponse, AWSError>
    open fun listUsageForLicenseConfiguration(callback: (err: AWSError, data: ListUsageForLicenseConfigurationResponse) -> Unit = definedExternally): Request<ListUsageForLicenseConfigurationResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateLicenseConfiguration(params: UpdateLicenseConfigurationRequest, callback: (err: AWSError, data: UpdateLicenseConfigurationResponse) -> Unit = definedExternally): Request<UpdateLicenseConfigurationResponse, AWSError>
    open fun updateLicenseConfiguration(callback: (err: AWSError, data: UpdateLicenseConfigurationResponse) -> Unit = definedExternally): Request<UpdateLicenseConfigurationResponse, AWSError>
    open fun updateLicenseSpecificationsForResource(params: UpdateLicenseSpecificationsForResourceRequest, callback: (err: AWSError, data: UpdateLicenseSpecificationsForResourceResponse) -> Unit = definedExternally): Request<UpdateLicenseSpecificationsForResourceResponse, AWSError>
    open fun updateLicenseSpecificationsForResource(callback: (err: AWSError, data: UpdateLicenseSpecificationsForResourceResponse) -> Unit = definedExternally): Request<UpdateLicenseSpecificationsForResourceResponse, AWSError>
    open fun updateServiceSettings(params: UpdateServiceSettingsRequest, callback: (err: AWSError, data: UpdateServiceSettingsResponse) -> Unit = definedExternally): Request<UpdateServiceSettingsResponse, AWSError>
    open fun updateServiceSettings(callback: (err: AWSError, data: UpdateServiceSettingsResponse) -> Unit = definedExternally): Request<UpdateServiceSettingsResponse, AWSError>
    interface AutomatedDiscoveryInformation {
        var LastRunTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConsumedLicenseSummary {
        var ResourceType: String /* "EC2_INSTANCE" | "EC2_HOST" | "EC2_AMI" | "RDS" | "SYSTEMS_MANAGER_MANAGED_INSTANCE" | String */
        var ConsumedLicenses: BoxLong?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLicenseConfigurationRequest {
        var Name: String
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseCountingType: String /* "vCPU" | "Instance" | "Core" | "Socket" | String */
        var LicenseCount: BoxLong?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseCountHardLimit: BoxBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseRules: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var ProductInformationList: ProductInformationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLicenseConfigurationResponse {
        var LicenseConfigurationArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteLicenseConfigurationRequest {
        var LicenseConfigurationArn: String
    }
    interface DeleteLicenseConfigurationResponse
    interface Filter {
        var Name: FilterName?
            get() = definedExternally
            set(value) = definedExternally
        var Values: FilterValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLicenseConfigurationRequest {
        var LicenseConfigurationArn: String
    }
    interface GetLicenseConfigurationResponse {
        var LicenseConfigurationId: String?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseConfigurationArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseCountingType: String /* "vCPU" | "Instance" | "Core" | "Socket" | String */
        var LicenseRules: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseCount: BoxLong?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseCountHardLimit: BoxBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var ConsumedLicenses: BoxLong?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerAccountId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ConsumedLicenseSummaryList: ConsumedLicenseSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var ManagedResourceSummaryList: ManagedResourceSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var ProductInformationList: ProductInformationList?
            get() = definedExternally
            set(value) = definedExternally
        var AutomatedDiscoveryInformation: AutomatedDiscoveryInformation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetServiceSettingsRequest
    interface GetServiceSettingsResponse {
        var S3BucketArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnsTopicArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationConfiguration: OrganizationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var EnableCrossAccountsDiscovery: BoxBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseManagerResourceShareArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InventoryFilter {
        var Name: String
        var Condition: String /* "EQUALS" | "NOT_EQUALS" | "BEGINS_WITH" | "CONTAINS" | String */
        var Value: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LicenseConfiguration {
        var LicenseConfigurationId: String?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseConfigurationArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseCountingType: String /* "vCPU" | "Instance" | "Core" | "Socket" | String */
        var LicenseRules: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseCount: BoxLong?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseCountHardLimit: BoxBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var ConsumedLicenses: BoxLong?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerAccountId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ConsumedLicenseSummaryList: ConsumedLicenseSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var ManagedResourceSummaryList: ManagedResourceSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var ProductInformationList: ProductInformationList?
            get() = definedExternally
            set(value) = definedExternally
        var AutomatedDiscoveryInformation: AutomatedDiscoveryInformation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LicenseConfigurationAssociation {
        var ResourceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: String /* "EC2_INSTANCE" | "EC2_HOST" | "EC2_AMI" | "RDS" | "SYSTEMS_MANAGER_MANAGED_INSTANCE" | String */
        var ResourceOwnerId: String?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LicenseConfigurationUsage {
        var ResourceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: String /* "EC2_INSTANCE" | "EC2_HOST" | "EC2_AMI" | "RDS" | "SYSTEMS_MANAGER_MANAGED_INSTANCE" | String */
        var ResourceStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceOwnerId: String?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var ConsumedLicenses: BoxLong?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LicenseOperationFailure {
        var ResourceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: String /* "EC2_INSTANCE" | "EC2_HOST" | "EC2_AMI" | "RDS" | "SYSTEMS_MANAGER_MANAGED_INSTANCE" | String */
        var ErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var FailureTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var OperationName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceOwnerId: String?
            get() = definedExternally
            set(value) = definedExternally
        var OperationRequestedBy: String?
            get() = definedExternally
            set(value) = definedExternally
        var MetadataList: MetadataList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LicenseSpecification {
        var LicenseConfigurationArn: String
    }
    interface ListAssociationsForLicenseConfigurationRequest {
        var LicenseConfigurationArn: String
        var MaxResults: BoxInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAssociationsForLicenseConfigurationResponse {
        var LicenseConfigurationAssociations: LicenseConfigurationAssociations?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFailuresForLicenseConfigurationOperationsRequest {
        var LicenseConfigurationArn: String
        var MaxResults: BoxInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFailuresForLicenseConfigurationOperationsResponse {
        var LicenseOperationFailureList: LicenseOperationFailureList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLicenseConfigurationsRequest {
        var LicenseConfigurationArns: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: BoxInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLicenseConfigurationsResponse {
        var LicenseConfigurations: LicenseConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLicenseSpecificationsForResourceRequest {
        var ResourceArn: String
        var MaxResults: BoxInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLicenseSpecificationsForResourceResponse {
        var LicenseSpecifications: LicenseSpecifications?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourceInventoryRequest {
        var MaxResults: BoxInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: InventoryFilterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourceInventoryResponse {
        var ResourceInventoryList: ResourceInventoryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: String
    }
    interface ListTagsForResourceResponse {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUsageForLicenseConfigurationRequest {
        var LicenseConfigurationArn: String
        var MaxResults: BoxInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUsageForLicenseConfigurationResponse {
        var LicenseConfigurationUsageList: LicenseConfigurationUsageList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ManagedResourceSummary {
        var ResourceType: String /* "EC2_INSTANCE" | "EC2_HOST" | "EC2_AMI" | "RDS" | "SYSTEMS_MANAGER_MANAGED_INSTANCE" | String */
        var AssociationCount: BoxLong?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Metadata {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Value: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrganizationConfiguration {
        var EnableIntegration: Boolean
    }
    interface ProductInformation {
        var ResourceType: String
        var ProductInformationFilterList: ProductInformationFilterList
    }
    interface ProductInformationFilter {
        var ProductInformationFilterName: String
        var ProductInformationFilterValue: StringList
        var ProductInformationFilterComparator: String
    }
    interface ResourceInventory {
        var ResourceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: String /* "EC2_INSTANCE" | "EC2_HOST" | "EC2_AMI" | "RDS" | "SYSTEMS_MANAGER_MANAGED_INSTANCE" | String */
        var ResourceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Platform: String?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceOwningAccountId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: String?
            get() = definedExternally
            set(value) = definedExternally
        var Value: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var ResourceArn: String
        var Tags: TagList
    }
    interface TagResourceResponse
    interface UntagResourceRequest {
        var ResourceArn: String
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateLicenseConfigurationRequest {
        var LicenseConfigurationArn: String
        var LicenseConfigurationStatus: String /* "AVAILABLE" | "DISABLED" | String */
        var LicenseRules: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseCount: BoxLong?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseCountHardLimit: BoxBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var ProductInformationList: ProductInformationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateLicenseConfigurationResponse
    interface UpdateLicenseSpecificationsForResourceRequest {
        var ResourceArn: String
        var AddLicenseSpecifications: LicenseSpecifications?
            get() = definedExternally
            set(value) = definedExternally
        var RemoveLicenseSpecifications: LicenseSpecifications?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateLicenseSpecificationsForResourceResponse
    interface UpdateServiceSettingsRequest {
        var S3BucketArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnsTopicArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationConfiguration: OrganizationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var EnableCrossAccountsDiscovery: BoxBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateServiceSettingsResponse
    interface ClientApiVersions {
        var apiVersion: String /* "2018-08-01" | "latest" | String */
    }
}