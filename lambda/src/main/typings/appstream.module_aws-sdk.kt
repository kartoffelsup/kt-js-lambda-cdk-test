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
import AppStream.AccessEndpoint
import AppStream.Application
import AppStream.DirectoryConfig
import AppStream.FleetError
import AppStream.Fleet
import AppStream.ImageBuilder
import AppStream.Image
import AppStream.LastReportGenerationExecutionError
import AppStream.ResourceError
import AppStream.Session
import AppStream.SharedImagePermissions
import AppStream.StackError
import AppStream.Stack
import AppStream.StorageConnector
import AppStream.UsageReportSubscription
import AppStream.User
import AppStream.UserSetting
import AppStream.UserStackAssociationError
import AppStream.UserStackAssociation
import AppStream.AssociateFleetRequest
import AppStream.AssociateFleetResult
import AppStream.BatchAssociateUserStackRequest
import AppStream.BatchAssociateUserStackResult
import AppStream.BatchDisassociateUserStackRequest
import AppStream.BatchDisassociateUserStackResult
import AppStream.CopyImageRequest
import AppStream.CopyImageResponse
import AppStream.CreateDirectoryConfigRequest
import AppStream.CreateDirectoryConfigResult
import AppStream.CreateFleetRequest
import AppStream.CreateFleetResult
import AppStream.CreateImageBuilderRequest
import AppStream.CreateImageBuilderResult
import AppStream.CreateImageBuilderStreamingURLRequest
import AppStream.CreateImageBuilderStreamingURLResult
import AppStream.CreateStackRequest
import AppStream.CreateStackResult
import AppStream.CreateStreamingURLRequest
import AppStream.CreateStreamingURLResult
import AppStream.CreateUsageReportSubscriptionRequest
import AppStream.CreateUsageReportSubscriptionResult
import AppStream.CreateUserRequest
import AppStream.CreateUserResult
import AppStream.DeleteDirectoryConfigRequest
import AppStream.DeleteDirectoryConfigResult
import AppStream.DeleteFleetRequest
import AppStream.DeleteFleetResult
import AppStream.DeleteImageRequest
import AppStream.DeleteImageResult
import AppStream.DeleteImageBuilderRequest
import AppStream.DeleteImageBuilderResult
import AppStream.DeleteImagePermissionsRequest
import AppStream.DeleteImagePermissionsResult
import AppStream.DeleteStackRequest
import AppStream.DeleteStackResult
import AppStream.DeleteUsageReportSubscriptionRequest
import AppStream.DeleteUsageReportSubscriptionResult
import AppStream.DeleteUserRequest
import AppStream.DeleteUserResult
import AppStream.DescribeDirectoryConfigsRequest
import AppStream.DescribeDirectoryConfigsResult
import AppStream.DescribeFleetsRequest
import AppStream.DescribeFleetsResult
import AppStream.DescribeImageBuildersRequest
import AppStream.DescribeImageBuildersResult
import AppStream.DescribeImagePermissionsRequest
import AppStream.DescribeImagePermissionsResult
import AppStream.DescribeImagesRequest
import AppStream.DescribeImagesResult
import AppStream.DescribeSessionsRequest
import AppStream.DescribeSessionsResult
import AppStream.DescribeStacksRequest
import AppStream.DescribeStacksResult
import AppStream.DescribeUsageReportSubscriptionsRequest
import AppStream.DescribeUsageReportSubscriptionsResult
import AppStream.DescribeUserStackAssociationsRequest
import AppStream.DescribeUserStackAssociationsResult
import AppStream.DescribeUsersRequest
import AppStream.DescribeUsersResult
import AppStream.DisableUserRequest
import AppStream.DisableUserResult
import AppStream.DisassociateFleetRequest
import AppStream.DisassociateFleetResult
import AppStream.EnableUserRequest
import AppStream.EnableUserResult
import AppStream.ExpireSessionRequest
import AppStream.ExpireSessionResult
import AppStream.ListAssociatedFleetsRequest
import AppStream.ListAssociatedFleetsResult
import AppStream.ListAssociatedStacksRequest
import AppStream.ListAssociatedStacksResult
import AppStream.ListTagsForResourceRequest
import AppStream.ListTagsForResourceResponse
import AppStream.StartFleetRequest
import AppStream.StartFleetResult
import AppStream.StartImageBuilderRequest
import AppStream.StartImageBuilderResult
import AppStream.StopFleetRequest
import AppStream.StopFleetResult
import AppStream.StopImageBuilderRequest
import AppStream.StopImageBuilderResult
import AppStream.TagResourceRequest
import AppStream.TagResourceResponse
import AppStream.UntagResourceRequest
import AppStream.UntagResourceResponse
import AppStream.UpdateDirectoryConfigRequest
import AppStream.UpdateDirectoryConfigResult
import AppStream.UpdateFleetRequest
import AppStream.UpdateFleetResult
import AppStream.UpdateImagePermissionsRequest
import AppStream.UpdateImagePermissionsResult
import AppStream.UpdateStackRequest
import AppStream.UpdateStackResult
import AppStream.Metadata
import AppStream.ServiceAccountCredentials
import AppStream.ComputeCapacity
import AppStream.VpcConfig
import AppStream.DomainJoinInfo
import AppStream.Tags
import AppStream.ApplicationSettings
import AppStream.ComputeCapacityStatus
import AppStream.ImageStateChangeReason
import AppStream.ImagePermissions
import AppStream.ImageBuilderStateChangeReason
import AppStream.NetworkAccessConfiguration
import AppStream.ApplicationSettingsResponse

typealias AccessEndpointList = Array<AccessEndpoint>

typealias AccountName = String

typealias AccountPassword = String

typealias Applications = Array<Application>

typealias AppstreamAgentVersion = String

typealias Arn = String

typealias ArnList = Array<Arn>

typealias AwsAccountId = String

typealias AwsAccountIdList = Array<AwsAccountId>

typealias Boolean = Boolean

typealias BooleanObject = Boolean

typealias DescribeImagesMaxResults = Number

typealias Description = String

typealias DirectoryConfigList = Array<DirectoryConfig>

typealias DirectoryName = String

typealias DirectoryNameList = Array<DirectoryName>

typealias DisplayName = String

typealias Domain = String

typealias DomainList = Array<Domain>

typealias EmbedHostDomain = String

typealias EmbedHostDomains = Array<EmbedHostDomain>

typealias FeedbackURL = String

typealias FleetAttributes = Array<String /* "VPC_CONFIGURATION" | "VPC_CONFIGURATION_SECURITY_GROUP_IDS" | "DOMAIN_JOIN_INFO" | "IAM_ROLE_ARN" | String */>

typealias FleetErrors = Array<FleetError>

typealias FleetList = Array<Fleet>

typealias ImageBuilderList = Array<ImageBuilder>

typealias ImageList = Array<Image>

typealias Integer = Number

typealias LastReportGenerationExecutionErrors = Array<LastReportGenerationExecutionError>

typealias Long = Number

typealias MaxResults = Number

typealias Name = String

typealias OrganizationalUnitDistinguishedName = String

typealias OrganizationalUnitDistinguishedNamesList = Array<OrganizationalUnitDistinguishedName>

typealias RedirectURL = String

typealias RegionName = String

typealias ResourceErrors = Array<ResourceError>

typealias ResourceIdentifier = String

typealias SecurityGroupIdList = Array<String>

typealias SessionList = Array<Session>

typealias SettingsGroup = String

typealias SharedImagePermissionsList = Array<SharedImagePermissions>

typealias StackAttributes = Array<String /* "STORAGE_CONNECTORS" | "STORAGE_CONNECTOR_HOMEFOLDERS" | "STORAGE_CONNECTOR_GOOGLE_DRIVE" | "STORAGE_CONNECTOR_ONE_DRIVE" | "REDIRECT_URL" | "FEEDBACK_URL" | "THEME_NAME" | "USER_SETTINGS" | "EMBED_HOST_DOMAINS" | "IAM_ROLE_ARN" | "ACCESS_ENDPOINTS" | String */>

typealias StackErrors = Array<StackError>

typealias StackList = Array<Stack>

typealias StorageConnectorList = Array<StorageConnector>

typealias StreamingUrlUserId = String

typealias String = String

typealias StringList = Array<String>

typealias SubnetIdList = Array<String>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagValue = String

typealias Timestamp = Date

typealias UsageReportSubscriptionList = Array<UsageReportSubscription>

typealias UserAttributeValue = String

typealias UserId = String

typealias UserList = Array<User>

typealias UserSettingList = Array<UserSetting>

typealias UserStackAssociationErrorList = Array<UserStackAssociationError>

typealias UserStackAssociationList = Array<UserStackAssociation>

typealias Username = String

@JsModule("aws-sdk")
external open class AppStream(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & AppStream.Types.ClientConfiguration */
    open fun associateFleet(params: AssociateFleetRequest, callback: (err: AWSError, data: AssociateFleetResult) -> Unit = definedExternally): Request<AssociateFleetResult, AWSError>
    open fun associateFleet(callback: (err: AWSError, data: AssociateFleetResult) -> Unit = definedExternally): Request<AssociateFleetResult, AWSError>
    open fun batchAssociateUserStack(params: BatchAssociateUserStackRequest, callback: (err: AWSError, data: BatchAssociateUserStackResult) -> Unit = definedExternally): Request<BatchAssociateUserStackResult, AWSError>
    open fun batchAssociateUserStack(callback: (err: AWSError, data: BatchAssociateUserStackResult) -> Unit = definedExternally): Request<BatchAssociateUserStackResult, AWSError>
    open fun batchDisassociateUserStack(params: BatchDisassociateUserStackRequest, callback: (err: AWSError, data: BatchDisassociateUserStackResult) -> Unit = definedExternally): Request<BatchDisassociateUserStackResult, AWSError>
    open fun batchDisassociateUserStack(callback: (err: AWSError, data: BatchDisassociateUserStackResult) -> Unit = definedExternally): Request<BatchDisassociateUserStackResult, AWSError>
    open fun copyImage(params: CopyImageRequest, callback: (err: AWSError, data: CopyImageResponse) -> Unit = definedExternally): Request<CopyImageResponse, AWSError>
    open fun copyImage(callback: (err: AWSError, data: CopyImageResponse) -> Unit = definedExternally): Request<CopyImageResponse, AWSError>
    open fun createDirectoryConfig(params: CreateDirectoryConfigRequest, callback: (err: AWSError, data: CreateDirectoryConfigResult) -> Unit = definedExternally): Request<CreateDirectoryConfigResult, AWSError>
    open fun createDirectoryConfig(callback: (err: AWSError, data: CreateDirectoryConfigResult) -> Unit = definedExternally): Request<CreateDirectoryConfigResult, AWSError>
    open fun createFleet(params: CreateFleetRequest, callback: (err: AWSError, data: CreateFleetResult) -> Unit = definedExternally): Request<CreateFleetResult, AWSError>
    open fun createFleet(callback: (err: AWSError, data: CreateFleetResult) -> Unit = definedExternally): Request<CreateFleetResult, AWSError>
    open fun createImageBuilder(params: CreateImageBuilderRequest, callback: (err: AWSError, data: CreateImageBuilderResult) -> Unit = definedExternally): Request<CreateImageBuilderResult, AWSError>
    open fun createImageBuilder(callback: (err: AWSError, data: CreateImageBuilderResult) -> Unit = definedExternally): Request<CreateImageBuilderResult, AWSError>
    open fun createImageBuilderStreamingURL(params: CreateImageBuilderStreamingURLRequest, callback: (err: AWSError, data: CreateImageBuilderStreamingURLResult) -> Unit = definedExternally): Request<CreateImageBuilderStreamingURLResult, AWSError>
    open fun createImageBuilderStreamingURL(callback: (err: AWSError, data: CreateImageBuilderStreamingURLResult) -> Unit = definedExternally): Request<CreateImageBuilderStreamingURLResult, AWSError>
    open fun createStack(params: CreateStackRequest, callback: (err: AWSError, data: CreateStackResult) -> Unit = definedExternally): Request<CreateStackResult, AWSError>
    open fun createStack(callback: (err: AWSError, data: CreateStackResult) -> Unit = definedExternally): Request<CreateStackResult, AWSError>
    open fun createStreamingURL(params: CreateStreamingURLRequest, callback: (err: AWSError, data: CreateStreamingURLResult) -> Unit = definedExternally): Request<CreateStreamingURLResult, AWSError>
    open fun createStreamingURL(callback: (err: AWSError, data: CreateStreamingURLResult) -> Unit = definedExternally): Request<CreateStreamingURLResult, AWSError>
    open fun createUsageReportSubscription(params: CreateUsageReportSubscriptionRequest, callback: (err: AWSError, data: CreateUsageReportSubscriptionResult) -> Unit = definedExternally): Request<CreateUsageReportSubscriptionResult, AWSError>
    open fun createUsageReportSubscription(callback: (err: AWSError, data: CreateUsageReportSubscriptionResult) -> Unit = definedExternally): Request<CreateUsageReportSubscriptionResult, AWSError>
    open fun createUser(params: CreateUserRequest, callback: (err: AWSError, data: CreateUserResult) -> Unit = definedExternally): Request<CreateUserResult, AWSError>
    open fun createUser(callback: (err: AWSError, data: CreateUserResult) -> Unit = definedExternally): Request<CreateUserResult, AWSError>
    open fun deleteDirectoryConfig(params: DeleteDirectoryConfigRequest, callback: (err: AWSError, data: DeleteDirectoryConfigResult) -> Unit = definedExternally): Request<DeleteDirectoryConfigResult, AWSError>
    open fun deleteDirectoryConfig(callback: (err: AWSError, data: DeleteDirectoryConfigResult) -> Unit = definedExternally): Request<DeleteDirectoryConfigResult, AWSError>
    open fun deleteFleet(params: DeleteFleetRequest, callback: (err: AWSError, data: DeleteFleetResult) -> Unit = definedExternally): Request<DeleteFleetResult, AWSError>
    open fun deleteFleet(callback: (err: AWSError, data: DeleteFleetResult) -> Unit = definedExternally): Request<DeleteFleetResult, AWSError>
    open fun deleteImage(params: DeleteImageRequest, callback: (err: AWSError, data: DeleteImageResult) -> Unit = definedExternally): Request<DeleteImageResult, AWSError>
    open fun deleteImage(callback: (err: AWSError, data: DeleteImageResult) -> Unit = definedExternally): Request<DeleteImageResult, AWSError>
    open fun deleteImageBuilder(params: DeleteImageBuilderRequest, callback: (err: AWSError, data: DeleteImageBuilderResult) -> Unit = definedExternally): Request<DeleteImageBuilderResult, AWSError>
    open fun deleteImageBuilder(callback: (err: AWSError, data: DeleteImageBuilderResult) -> Unit = definedExternally): Request<DeleteImageBuilderResult, AWSError>
    open fun deleteImagePermissions(params: DeleteImagePermissionsRequest, callback: (err: AWSError, data: DeleteImagePermissionsResult) -> Unit = definedExternally): Request<DeleteImagePermissionsResult, AWSError>
    open fun deleteImagePermissions(callback: (err: AWSError, data: DeleteImagePermissionsResult) -> Unit = definedExternally): Request<DeleteImagePermissionsResult, AWSError>
    open fun deleteStack(params: DeleteStackRequest, callback: (err: AWSError, data: DeleteStackResult) -> Unit = definedExternally): Request<DeleteStackResult, AWSError>
    open fun deleteStack(callback: (err: AWSError, data: DeleteStackResult) -> Unit = definedExternally): Request<DeleteStackResult, AWSError>
    open fun deleteUsageReportSubscription(params: DeleteUsageReportSubscriptionRequest, callback: (err: AWSError, data: DeleteUsageReportSubscriptionResult) -> Unit = definedExternally): Request<DeleteUsageReportSubscriptionResult, AWSError>
    open fun deleteUsageReportSubscription(callback: (err: AWSError, data: DeleteUsageReportSubscriptionResult) -> Unit = definedExternally): Request<DeleteUsageReportSubscriptionResult, AWSError>
    open fun deleteUser(params: DeleteUserRequest, callback: (err: AWSError, data: DeleteUserResult) -> Unit = definedExternally): Request<DeleteUserResult, AWSError>
    open fun deleteUser(callback: (err: AWSError, data: DeleteUserResult) -> Unit = definedExternally): Request<DeleteUserResult, AWSError>
    open fun describeDirectoryConfigs(params: DescribeDirectoryConfigsRequest, callback: (err: AWSError, data: DescribeDirectoryConfigsResult) -> Unit = definedExternally): Request<DescribeDirectoryConfigsResult, AWSError>
    open fun describeDirectoryConfigs(callback: (err: AWSError, data: DescribeDirectoryConfigsResult) -> Unit = definedExternally): Request<DescribeDirectoryConfigsResult, AWSError>
    open fun describeFleets(params: DescribeFleetsRequest, callback: (err: AWSError, data: DescribeFleetsResult) -> Unit = definedExternally): Request<DescribeFleetsResult, AWSError>
    open fun describeFleets(callback: (err: AWSError, data: DescribeFleetsResult) -> Unit = definedExternally): Request<DescribeFleetsResult, AWSError>
    open fun describeImageBuilders(params: DescribeImageBuildersRequest, callback: (err: AWSError, data: DescribeImageBuildersResult) -> Unit = definedExternally): Request<DescribeImageBuildersResult, AWSError>
    open fun describeImageBuilders(callback: (err: AWSError, data: DescribeImageBuildersResult) -> Unit = definedExternally): Request<DescribeImageBuildersResult, AWSError>
    open fun describeImagePermissions(params: DescribeImagePermissionsRequest, callback: (err: AWSError, data: DescribeImagePermissionsResult) -> Unit = definedExternally): Request<DescribeImagePermissionsResult, AWSError>
    open fun describeImagePermissions(callback: (err: AWSError, data: DescribeImagePermissionsResult) -> Unit = definedExternally): Request<DescribeImagePermissionsResult, AWSError>
    open fun describeImages(params: DescribeImagesRequest, callback: (err: AWSError, data: DescribeImagesResult) -> Unit = definedExternally): Request<DescribeImagesResult, AWSError>
    open fun describeImages(callback: (err: AWSError, data: DescribeImagesResult) -> Unit = definedExternally): Request<DescribeImagesResult, AWSError>
    open fun describeSessions(params: DescribeSessionsRequest, callback: (err: AWSError, data: DescribeSessionsResult) -> Unit = definedExternally): Request<DescribeSessionsResult, AWSError>
    open fun describeSessions(callback: (err: AWSError, data: DescribeSessionsResult) -> Unit = definedExternally): Request<DescribeSessionsResult, AWSError>
    open fun describeStacks(params: DescribeStacksRequest, callback: (err: AWSError, data: DescribeStacksResult) -> Unit = definedExternally): Request<DescribeStacksResult, AWSError>
    open fun describeStacks(callback: (err: AWSError, data: DescribeStacksResult) -> Unit = definedExternally): Request<DescribeStacksResult, AWSError>
    open fun describeUsageReportSubscriptions(params: DescribeUsageReportSubscriptionsRequest, callback: (err: AWSError, data: DescribeUsageReportSubscriptionsResult) -> Unit = definedExternally): Request<DescribeUsageReportSubscriptionsResult, AWSError>
    open fun describeUsageReportSubscriptions(callback: (err: AWSError, data: DescribeUsageReportSubscriptionsResult) -> Unit = definedExternally): Request<DescribeUsageReportSubscriptionsResult, AWSError>
    open fun describeUserStackAssociations(params: DescribeUserStackAssociationsRequest, callback: (err: AWSError, data: DescribeUserStackAssociationsResult) -> Unit = definedExternally): Request<DescribeUserStackAssociationsResult, AWSError>
    open fun describeUserStackAssociations(callback: (err: AWSError, data: DescribeUserStackAssociationsResult) -> Unit = definedExternally): Request<DescribeUserStackAssociationsResult, AWSError>
    open fun describeUsers(params: DescribeUsersRequest, callback: (err: AWSError, data: DescribeUsersResult) -> Unit = definedExternally): Request<DescribeUsersResult, AWSError>
    open fun describeUsers(callback: (err: AWSError, data: DescribeUsersResult) -> Unit = definedExternally): Request<DescribeUsersResult, AWSError>
    open fun disableUser(params: DisableUserRequest, callback: (err: AWSError, data: DisableUserResult) -> Unit = definedExternally): Request<DisableUserResult, AWSError>
    open fun disableUser(callback: (err: AWSError, data: DisableUserResult) -> Unit = definedExternally): Request<DisableUserResult, AWSError>
    open fun disassociateFleet(params: DisassociateFleetRequest, callback: (err: AWSError, data: DisassociateFleetResult) -> Unit = definedExternally): Request<DisassociateFleetResult, AWSError>
    open fun disassociateFleet(callback: (err: AWSError, data: DisassociateFleetResult) -> Unit = definedExternally): Request<DisassociateFleetResult, AWSError>
    open fun enableUser(params: EnableUserRequest, callback: (err: AWSError, data: EnableUserResult) -> Unit = definedExternally): Request<EnableUserResult, AWSError>
    open fun enableUser(callback: (err: AWSError, data: EnableUserResult) -> Unit = definedExternally): Request<EnableUserResult, AWSError>
    open fun expireSession(params: ExpireSessionRequest, callback: (err: AWSError, data: ExpireSessionResult) -> Unit = definedExternally): Request<ExpireSessionResult, AWSError>
    open fun expireSession(callback: (err: AWSError, data: ExpireSessionResult) -> Unit = definedExternally): Request<ExpireSessionResult, AWSError>
    open fun listAssociatedFleets(params: ListAssociatedFleetsRequest, callback: (err: AWSError, data: ListAssociatedFleetsResult) -> Unit = definedExternally): Request<ListAssociatedFleetsResult, AWSError>
    open fun listAssociatedFleets(callback: (err: AWSError, data: ListAssociatedFleetsResult) -> Unit = definedExternally): Request<ListAssociatedFleetsResult, AWSError>
    open fun listAssociatedStacks(params: ListAssociatedStacksRequest, callback: (err: AWSError, data: ListAssociatedStacksResult) -> Unit = definedExternally): Request<ListAssociatedStacksResult, AWSError>
    open fun listAssociatedStacks(callback: (err: AWSError, data: ListAssociatedStacksResult) -> Unit = definedExternally): Request<ListAssociatedStacksResult, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun startFleet(params: StartFleetRequest, callback: (err: AWSError, data: StartFleetResult) -> Unit = definedExternally): Request<StartFleetResult, AWSError>
    open fun startFleet(callback: (err: AWSError, data: StartFleetResult) -> Unit = definedExternally): Request<StartFleetResult, AWSError>
    open fun startImageBuilder(params: StartImageBuilderRequest, callback: (err: AWSError, data: StartImageBuilderResult) -> Unit = definedExternally): Request<StartImageBuilderResult, AWSError>
    open fun startImageBuilder(callback: (err: AWSError, data: StartImageBuilderResult) -> Unit = definedExternally): Request<StartImageBuilderResult, AWSError>
    open fun stopFleet(params: StopFleetRequest, callback: (err: AWSError, data: StopFleetResult) -> Unit = definedExternally): Request<StopFleetResult, AWSError>
    open fun stopFleet(callback: (err: AWSError, data: StopFleetResult) -> Unit = definedExternally): Request<StopFleetResult, AWSError>
    open fun stopImageBuilder(params: StopImageBuilderRequest, callback: (err: AWSError, data: StopImageBuilderResult) -> Unit = definedExternally): Request<StopImageBuilderResult, AWSError>
    open fun stopImageBuilder(callback: (err: AWSError, data: StopImageBuilderResult) -> Unit = definedExternally): Request<StopImageBuilderResult, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateDirectoryConfig(params: UpdateDirectoryConfigRequest, callback: (err: AWSError, data: UpdateDirectoryConfigResult) -> Unit = definedExternally): Request<UpdateDirectoryConfigResult, AWSError>
    open fun updateDirectoryConfig(callback: (err: AWSError, data: UpdateDirectoryConfigResult) -> Unit = definedExternally): Request<UpdateDirectoryConfigResult, AWSError>
    open fun updateFleet(params: UpdateFleetRequest, callback: (err: AWSError, data: UpdateFleetResult) -> Unit = definedExternally): Request<UpdateFleetResult, AWSError>
    open fun updateFleet(callback: (err: AWSError, data: UpdateFleetResult) -> Unit = definedExternally): Request<UpdateFleetResult, AWSError>
    open fun updateImagePermissions(params: UpdateImagePermissionsRequest, callback: (err: AWSError, data: UpdateImagePermissionsResult) -> Unit = definedExternally): Request<UpdateImagePermissionsResult, AWSError>
    open fun updateImagePermissions(callback: (err: AWSError, data: UpdateImagePermissionsResult) -> Unit = definedExternally): Request<UpdateImagePermissionsResult, AWSError>
    open fun updateStack(params: UpdateStackRequest, callback: (err: AWSError, data: UpdateStackResult) -> Unit = definedExternally): Request<UpdateStackResult, AWSError>
    open fun updateStack(callback: (err: AWSError, data: UpdateStackResult) -> Unit = definedExternally): Request<UpdateStackResult, AWSError>
    open fun waitFor(state: String, params: DescribeFleetsRequest, callback: (err: AWSError, data: DescribeFleetsResult) -> Unit = definedExternally): Request<DescribeFleetsResult, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DescribeFleetsResult) -> Unit = definedExternally): Request<DescribeFleetsResult, AWSError>
    interface AccessEndpoint {
        var EndpointType: String /* "STREAMING" | String */
        var VpceId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Application {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: String?
            get() = definedExternally
            set(value) = definedExternally
        var IconURL: String?
            get() = definedExternally
            set(value) = definedExternally
        var LaunchPath: String?
            get() = definedExternally
            set(value) = definedExternally
        var LaunchParameters: String?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Metadata: Metadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationSettings {
        var Enabled: Boolean
        var SettingsGroup: SettingsGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationSettingsResponse {
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SettingsGroup: SettingsGroup?
            get() = definedExternally
            set(value) = definedExternally
        var S3BucketName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateFleetRequest {
        var FleetName: String
        var StackName: String
    }
    interface AssociateFleetResult
    interface BatchAssociateUserStackRequest {
        var UserStackAssociations: UserStackAssociationList
    }
    interface BatchAssociateUserStackResult {
        var errors: UserStackAssociationErrorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDisassociateUserStackRequest {
        var UserStackAssociations: UserStackAssociationList
    }
    interface BatchDisassociateUserStackResult {
        var errors: UserStackAssociationErrorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ComputeCapacity {
        var DesiredInstances: Integer
    }
    interface ComputeCapacityStatus {
        var Desired: Integer
        var Running: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var InUse: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Available: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CopyImageRequest {
        var SourceImageName: Name
        var DestinationImageName: Name
        var DestinationRegion: RegionName
        var DestinationImageDescription: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CopyImageResponse {
        var DestinationImageName: Name?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDirectoryConfigRequest {
        var DirectoryName: DirectoryName
        var OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList
        var ServiceAccountCredentials: ServiceAccountCredentials
    }
    interface CreateDirectoryConfigResult {
        var DirectoryConfig: DirectoryConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFleetRequest {
        var Name: Name
        var ImageName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ImageArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: String
        var FleetType: String /* "ALWAYS_ON" | "ON_DEMAND" | String */
        var ComputeCapacity: ComputeCapacity
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
        var MaxUserDurationInSeconds: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var DisconnectTimeoutInSeconds: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: DisplayName?
            get() = definedExternally
            set(value) = definedExternally
        var EnableDefaultInternetAccess: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var DomainJoinInfo: DomainJoinInfo?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var IdleDisconnectTimeoutInSeconds: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoleArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFleetResult {
        var Fleet: Fleet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateImageBuilderRequest {
        var Name: Name
        var ImageName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ImageArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: String
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: DisplayName?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoleArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var EnableDefaultInternetAccess: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var DomainJoinInfo: DomainJoinInfo?
            get() = definedExternally
            set(value) = definedExternally
        var AppstreamAgentVersion: AppstreamAgentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var AccessEndpoints: AccessEndpointList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateImageBuilderResult {
        var ImageBuilder: ImageBuilder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateImageBuilderStreamingURLRequest {
        var Name: String
        var Validity: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateImageBuilderStreamingURLResult {
        var StreamingURL: String?
            get() = definedExternally
            set(value) = definedExternally
        var Expires: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStackRequest {
        var Name: Name
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: DisplayName?
            get() = definedExternally
            set(value) = definedExternally
        var StorageConnectors: StorageConnectorList?
            get() = definedExternally
            set(value) = definedExternally
        var RedirectURL: RedirectURL?
            get() = definedExternally
            set(value) = definedExternally
        var FeedbackURL: FeedbackURL?
            get() = definedExternally
            set(value) = definedExternally
        var UserSettings: UserSettingList?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationSettings: ApplicationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var AccessEndpoints: AccessEndpointList?
            get() = definedExternally
            set(value) = definedExternally
        var EmbedHostDomains: EmbedHostDomains?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStackResult {
        var Stack: Stack?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStreamingURLRequest {
        var StackName: String
        var FleetName: String
        var UserId: StreamingUrlUserId
        var ApplicationId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Validity: Long?
            get() = definedExternally
            set(value) = definedExternally
        var SessionContext: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStreamingURLResult {
        var StreamingURL: String?
            get() = definedExternally
            set(value) = definedExternally
        var Expires: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUsageReportSubscriptionRequest
    interface CreateUsageReportSubscriptionResult {
        var S3BucketName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: String /* "DAILY" | String */
    }
    interface CreateUserRequest {
        var UserName: Username
        var MessageAction: String /* "SUPPRESS" | "RESEND" | String */
        var FirstName: UserAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var LastName: UserAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var AuthenticationType: String /* "API" | "SAML" | "USERPOOL" | String */
    }
    interface CreateUserResult
    interface DeleteDirectoryConfigRequest {
        var DirectoryName: DirectoryName
    }
    interface DeleteDirectoryConfigResult
    interface DeleteFleetRequest {
        var Name: String
    }
    interface DeleteFleetResult
    interface DeleteImageBuilderRequest {
        var Name: Name
    }
    interface DeleteImageBuilderResult {
        var ImageBuilder: ImageBuilder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteImagePermissionsRequest {
        var Name: Name
        var SharedAccountId: AwsAccountId
    }
    interface DeleteImagePermissionsResult
    interface DeleteImageRequest {
        var Name: Name
    }
    interface DeleteImageResult {
        var Image: Image?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteStackRequest {
        var Name: String
    }
    interface DeleteStackResult
    interface DeleteUsageReportSubscriptionRequest
    interface DeleteUsageReportSubscriptionResult
    interface DeleteUserRequest {
        var UserName: Username
        var AuthenticationType: String /* "API" | "SAML" | "USERPOOL" | String */
    }
    interface DeleteUserResult
    interface DescribeDirectoryConfigsRequest {
        var DirectoryNames: DirectoryNameList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDirectoryConfigsResult {
        var DirectoryConfigs: DirectoryConfigList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFleetsRequest {
        var Names: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFleetsResult {
        var Fleets: FleetList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeImageBuildersRequest {
        var Names: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeImageBuildersResult {
        var ImageBuilders: ImageBuilderList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeImagePermissionsRequest {
        var Name: Name
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var SharedAwsAccountIds: AwsAccountIdList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeImagePermissionsResult {
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var SharedImagePermissionsList: SharedImagePermissionsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeImagesRequest {
        var Names: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var Arns: ArnList?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "PUBLIC" | "PRIVATE" | "SHARED" | String */
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: DescribeImagesMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeImagesResult {
        var Images: ImageList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSessionsRequest {
        var StackName: String
        var FleetName: String
        var UserId: UserId?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var AuthenticationType: String /* "API" | "SAML" | "USERPOOL" | String */
    }
    interface DescribeSessionsResult {
        var Sessions: SessionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStacksRequest {
        var Names: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStacksResult {
        var Stacks: StackList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUsageReportSubscriptionsRequest {
        var MaxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUsageReportSubscriptionsResult {
        var UsageReportSubscriptions: UsageReportSubscriptionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUserStackAssociationsRequest {
        var StackName: String?
            get() = definedExternally
            set(value) = definedExternally
        var UserName: Username?
            get() = definedExternally
            set(value) = definedExternally
        var AuthenticationType: String /* "API" | "SAML" | "USERPOOL" | String */
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUserStackAssociationsResult {
        var UserStackAssociations: UserStackAssociationList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUsersRequest {
        var AuthenticationType: String /* "API" | "SAML" | "USERPOOL" | String */
        var MaxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUsersResult {
        var Users: UserList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DirectoryConfig {
        var DirectoryName: DirectoryName
        var OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceAccountCredentials: ServiceAccountCredentials?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisableUserRequest {
        var UserName: Username
        var AuthenticationType: String /* "API" | "SAML" | "USERPOOL" | String */
    }
    interface DisableUserResult
    interface DisassociateFleetRequest {
        var FleetName: String
        var StackName: String
    }
    interface DisassociateFleetResult
    interface DomainJoinInfo {
        var DirectoryName: DirectoryName?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationalUnitDistinguishedName: OrganizationalUnitDistinguishedName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnableUserRequest {
        var UserName: Username
        var AuthenticationType: String /* "API" | "SAML" | "USERPOOL" | String */
    }
    interface EnableUserResult
    interface ExpireSessionRequest {
        var SessionId: String
    }
    interface ExpireSessionResult
    interface Fleet {
        var Arn: Arn
        var Name: String
        var DisplayName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var ImageName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ImageArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: String
        var FleetType: String /* "ALWAYS_ON" | "ON_DEMAND" | String */
        var ComputeCapacityStatus: ComputeCapacityStatus
        var MaxUserDurationInSeconds: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var DisconnectTimeoutInSeconds: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "STARTING" | "RUNNING" | "STOPPING" | "STOPPED" | String */
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var FleetErrors: FleetErrors?
            get() = definedExternally
            set(value) = definedExternally
        var EnableDefaultInternetAccess: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var DomainJoinInfo: DomainJoinInfo?
            get() = definedExternally
            set(value) = definedExternally
        var IdleDisconnectTimeoutInSeconds: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoleArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FleetError {
        var ErrorCode: String /* "IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION" | "IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION" | "IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION" | "NETWORK_INTERFACE_LIMIT_EXCEEDED" | "INTERNAL_SERVICE_ERROR" | "IAM_SERVICE_ROLE_IS_MISSING" | "MACHINE_ROLE_IS_MISSING" | "STS_DISABLED_IN_REGION" | "SUBNET_HAS_INSUFFICIENT_IP_ADDRESSES" | "IAM_SERVICE_ROLE_MISSING_DESCRIBE_SUBNET_ACTION" | "SUBNET_NOT_FOUND" | "IMAGE_NOT_FOUND" | "INVALID_SUBNET_CONFIGURATION" | "SECURITY_GROUPS_NOT_FOUND" | "IGW_NOT_ATTACHED" | "IAM_SERVICE_ROLE_MISSING_DESCRIBE_SECURITY_GROUPS_ACTION" | "DOMAIN_JOIN_ERROR_FILE_NOT_FOUND" | "DOMAIN_JOIN_ERROR_ACCESS_DENIED" | "DOMAIN_JOIN_ERROR_LOGON_FAILURE" | "DOMAIN_JOIN_ERROR_INVALID_PARAMETER" | "DOMAIN_JOIN_ERROR_MORE_DATA" | "DOMAIN_JOIN_ERROR_NO_SUCH_DOMAIN" | "DOMAIN_JOIN_ERROR_NOT_SUPPORTED" | "DOMAIN_JOIN_NERR_INVALID_WORKGROUP_NAME" | "DOMAIN_JOIN_NERR_WORKSTATION_NOT_STARTED" | "DOMAIN_JOIN_ERROR_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED" | "DOMAIN_JOIN_NERR_PASSWORD_EXPIRED" | "DOMAIN_JOIN_INTERNAL_SERVICE_ERROR" | String */
        var ErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Image {
        var Name: String
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var BaseImageArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: String?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "PENDING" | "AVAILABLE" | "FAILED" | "COPYING" | "DELETING" | String */
        var Visibility: String /* "PUBLIC" | "PRIVATE" | "SHARED" | String */
        var ImageBuilderSupported: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ImageBuilderName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Platform: String /* "WINDOWS" | "WINDOWS_SERVER_2016" | "WINDOWS_SERVER_2019" | String */
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var StateChangeReason: ImageStateChangeReason?
            get() = definedExternally
            set(value) = definedExternally
        var Applications: Applications?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var PublicBaseImageReleasedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var AppstreamAgentVersion: AppstreamAgentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var ImagePermissions: ImagePermissions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImageBuilder {
        var Name: String
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var ImageArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Platform: String /* "WINDOWS" | "WINDOWS_SERVER_2016" | "WINDOWS_SERVER_2019" | String */
        var IamRoleArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "PENDING" | "UPDATING_AGENT" | "RUNNING" | "STOPPING" | "STOPPED" | "REBOOTING" | "SNAPSHOTTING" | "DELETING" | "FAILED" | String */
        var StateChangeReason: ImageBuilderStateChangeReason?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EnableDefaultInternetAccess: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var DomainJoinInfo: DomainJoinInfo?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkAccessConfiguration: NetworkAccessConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var ImageBuilderErrors: ResourceErrors?
            get() = definedExternally
            set(value) = definedExternally
        var AppstreamAgentVersion: AppstreamAgentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var AccessEndpoints: AccessEndpointList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImageBuilderStateChangeReason {
        var Code: String /* "INTERNAL_ERROR" | "IMAGE_UNAVAILABLE" | String */
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImagePermissions {
        var allowFleet: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var allowImageBuilder: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImageStateChangeReason {
        var Code: String /* "INTERNAL_ERROR" | "IMAGE_BUILDER_NOT_AVAILABLE" | "IMAGE_COPY_FAILURE" | String */
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LastReportGenerationExecutionError {
        var ErrorCode: String /* "RESOURCE_NOT_FOUND" | "ACCESS_DENIED" | "INTERNAL_SERVICE_ERROR" | String */
        var ErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAssociatedFleetsRequest {
        var StackName: String
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAssociatedFleetsResult {
        var Names: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAssociatedStacksRequest {
        var FleetName: String
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAssociatedStacksResult {
        var Names: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: Arn
    }
    interface ListTagsForResourceResponse {
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Metadata {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface NetworkAccessConfiguration {
        var EniPrivateIpAddress: String?
            get() = definedExternally
            set(value) = definedExternally
        var EniId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceError {
        var ErrorCode: String /* "IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION" | "IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION" | "IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION" | "NETWORK_INTERFACE_LIMIT_EXCEEDED" | "INTERNAL_SERVICE_ERROR" | "IAM_SERVICE_ROLE_IS_MISSING" | "MACHINE_ROLE_IS_MISSING" | "STS_DISABLED_IN_REGION" | "SUBNET_HAS_INSUFFICIENT_IP_ADDRESSES" | "IAM_SERVICE_ROLE_MISSING_DESCRIBE_SUBNET_ACTION" | "SUBNET_NOT_FOUND" | "IMAGE_NOT_FOUND" | "INVALID_SUBNET_CONFIGURATION" | "SECURITY_GROUPS_NOT_FOUND" | "IGW_NOT_ATTACHED" | "IAM_SERVICE_ROLE_MISSING_DESCRIBE_SECURITY_GROUPS_ACTION" | "DOMAIN_JOIN_ERROR_FILE_NOT_FOUND" | "DOMAIN_JOIN_ERROR_ACCESS_DENIED" | "DOMAIN_JOIN_ERROR_LOGON_FAILURE" | "DOMAIN_JOIN_ERROR_INVALID_PARAMETER" | "DOMAIN_JOIN_ERROR_MORE_DATA" | "DOMAIN_JOIN_ERROR_NO_SUCH_DOMAIN" | "DOMAIN_JOIN_ERROR_NOT_SUPPORTED" | "DOMAIN_JOIN_NERR_INVALID_WORKGROUP_NAME" | "DOMAIN_JOIN_NERR_WORKSTATION_NOT_STARTED" | "DOMAIN_JOIN_ERROR_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED" | "DOMAIN_JOIN_NERR_PASSWORD_EXPIRED" | "DOMAIN_JOIN_INTERNAL_SERVICE_ERROR" | String */
        var ErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServiceAccountCredentials {
        var AccountName: AccountName
        var AccountPassword: AccountPassword
    }
    interface Session {
        var Id: String
        var UserId: UserId
        var StackName: String
        var FleetName: String
        var State: String /* "ACTIVE" | "PENDING" | "EXPIRED" | String */
        var ConnectionState: String /* "CONNECTED" | "NOT_CONNECTED" | String */
        var StartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var MaxExpirationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var AuthenticationType: String /* "API" | "SAML" | "USERPOOL" | String */
        var NetworkAccessConfiguration: NetworkAccessConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SharedImagePermissions {
        var sharedAccountId: AwsAccountId
        var imagePermissions: ImagePermissions
    }
    interface Stack {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var StorageConnectors: StorageConnectorList?
            get() = definedExternally
            set(value) = definedExternally
        var RedirectURL: RedirectURL?
            get() = definedExternally
            set(value) = definedExternally
        var FeedbackURL: FeedbackURL?
            get() = definedExternally
            set(value) = definedExternally
        var StackErrors: StackErrors?
            get() = definedExternally
            set(value) = definedExternally
        var UserSettings: UserSettingList?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationSettings: ApplicationSettingsResponse?
            get() = definedExternally
            set(value) = definedExternally
        var AccessEndpoints: AccessEndpointList?
            get() = definedExternally
            set(value) = definedExternally
        var EmbedHostDomains: EmbedHostDomains?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StackError {
        var ErrorCode: String /* "STORAGE_CONNECTOR_ERROR" | "INTERNAL_SERVICE_ERROR" | String */
        var ErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartFleetRequest {
        var Name: String
    }
    interface StartFleetResult
    interface StartImageBuilderRequest {
        var Name: String
        var AppstreamAgentVersion: AppstreamAgentVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartImageBuilderResult {
        var ImageBuilder: ImageBuilder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopFleetRequest {
        var Name: String
    }
    interface StopFleetResult
    interface StopImageBuilderRequest {
        var Name: String
    }
    interface StopImageBuilderResult {
        var ImageBuilder: ImageBuilder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StorageConnector {
        var ConnectorType: String /* "HOMEFOLDERS" | "GOOGLE_DRIVE" | "ONE_DRIVE" | String */
        var ResourceIdentifier: ResourceIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var Domains: DomainList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var ResourceArn: Arn
        var Tags: Tags
    }
    interface TagResourceResponse
    interface Tags {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface UntagResourceRequest {
        var ResourceArn: Arn
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateDirectoryConfigRequest {
        var DirectoryName: DirectoryName
        var OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceAccountCredentials: ServiceAccountCredentials?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDirectoryConfigResult {
        var DirectoryConfig: DirectoryConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFleetRequest {
        var ImageName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ImageArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var ComputeCapacity: ComputeCapacity?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
        var MaxUserDurationInSeconds: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var DisconnectTimeoutInSeconds: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var DeleteVpcConfig: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: DisplayName?
            get() = definedExternally
            set(value) = definedExternally
        var EnableDefaultInternetAccess: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var DomainJoinInfo: DomainJoinInfo?
            get() = definedExternally
            set(value) = definedExternally
        var IdleDisconnectTimeoutInSeconds: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var AttributesToDelete: FleetAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoleArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFleetResult {
        var Fleet: Fleet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateImagePermissionsRequest {
        var Name: Name
        var SharedAccountId: AwsAccountId
        var ImagePermissions: ImagePermissions
    }
    interface UpdateImagePermissionsResult
    interface UpdateStackRequest {
        var DisplayName: DisplayName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String
        var StorageConnectors: StorageConnectorList?
            get() = definedExternally
            set(value) = definedExternally
        var DeleteStorageConnectors: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RedirectURL: RedirectURL?
            get() = definedExternally
            set(value) = definedExternally
        var FeedbackURL: FeedbackURL?
            get() = definedExternally
            set(value) = definedExternally
        var AttributesToDelete: StackAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var UserSettings: UserSettingList?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationSettings: ApplicationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var AccessEndpoints: AccessEndpointList?
            get() = definedExternally
            set(value) = definedExternally
        var EmbedHostDomains: EmbedHostDomains?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateStackResult {
        var Stack: Stack?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UsageReportSubscription {
        var S3BucketName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: String /* "DAILY" | String */
        var LastGeneratedReportDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SubscriptionErrors: LastReportGenerationExecutionErrors?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface User {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var UserName: Username?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var FirstName: UserAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var LastName: UserAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var AuthenticationType: String /* "API" | "SAML" | "USERPOOL" | String */
    }
    interface UserSetting {
        var Action: String /* "CLIPBOARD_COPY_FROM_LOCAL_DEVICE" | "CLIPBOARD_COPY_TO_LOCAL_DEVICE" | "FILE_UPLOAD" | "FILE_DOWNLOAD" | "PRINTING_TO_LOCAL_DEVICE" | String */
        var Permission: String /* "ENABLED" | "DISABLED" | String */
    }
    interface UserStackAssociation {
        var StackName: String
        var UserName: Username
        var AuthenticationType: String /* "API" | "SAML" | "USERPOOL" | String */
        var SendEmailNotification: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserStackAssociationError {
        var UserStackAssociation: UserStackAssociation?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: String /* "STACK_NOT_FOUND" | "USER_NAME_NOT_FOUND" | "INTERNAL_ERROR" | String */
        var ErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VpcConfig {
        var SubnetIds: SubnetIdList?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: SecurityGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2016-12-01" | "latest" | String */
    }
}