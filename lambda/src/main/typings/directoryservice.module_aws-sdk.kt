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
import DirectoryService.Attribute
import DirectoryService.CertificateInfo
import DirectoryService.ConditionalForwarder
import DirectoryService.DirectoryDescription
import DirectoryService.DomainController
import DirectoryService.EventTopic
import DirectoryService.IpRoute
import DirectoryService.IpRouteInfo
import DirectoryService.LDAPSSettingInfo
import DirectoryService.LogSubscription
import DirectoryService.SchemaExtensionInfo
import DirectoryService.SharedDirectory
import DirectoryService.Snapshot
import DirectoryService.Tag
import DirectoryService.Trust
import DirectoryService.AcceptSharedDirectoryRequest
import DirectoryService.AcceptSharedDirectoryResult
import DirectoryService.AddIpRoutesRequest
import DirectoryService.AddIpRoutesResult
import DirectoryService.AddTagsToResourceRequest
import DirectoryService.AddTagsToResourceResult
import DirectoryService.CancelSchemaExtensionRequest
import DirectoryService.CancelSchemaExtensionResult
import DirectoryService.ConnectDirectoryRequest
import DirectoryService.ConnectDirectoryResult
import DirectoryService.CreateAliasRequest
import DirectoryService.CreateAliasResult
import DirectoryService.CreateComputerRequest
import DirectoryService.CreateComputerResult
import DirectoryService.CreateConditionalForwarderRequest
import DirectoryService.CreateConditionalForwarderResult
import DirectoryService.CreateDirectoryRequest
import DirectoryService.CreateDirectoryResult
import DirectoryService.CreateLogSubscriptionRequest
import DirectoryService.CreateLogSubscriptionResult
import DirectoryService.CreateMicrosoftADRequest
import DirectoryService.CreateMicrosoftADResult
import DirectoryService.CreateSnapshotRequest
import DirectoryService.CreateSnapshotResult
import DirectoryService.CreateTrustRequest
import DirectoryService.CreateTrustResult
import DirectoryService.DeleteConditionalForwarderRequest
import DirectoryService.DeleteConditionalForwarderResult
import DirectoryService.DeleteDirectoryRequest
import DirectoryService.DeleteDirectoryResult
import DirectoryService.DeleteLogSubscriptionRequest
import DirectoryService.DeleteLogSubscriptionResult
import DirectoryService.DeleteSnapshotRequest
import DirectoryService.DeleteSnapshotResult
import DirectoryService.DeleteTrustRequest
import DirectoryService.DeleteTrustResult
import DirectoryService.DeregisterCertificateRequest
import DirectoryService.DeregisterCertificateResult
import DirectoryService.DeregisterEventTopicRequest
import DirectoryService.DeregisterEventTopicResult
import DirectoryService.DescribeCertificateRequest
import DirectoryService.DescribeCertificateResult
import DirectoryService.DescribeConditionalForwardersRequest
import DirectoryService.DescribeConditionalForwardersResult
import DirectoryService.DescribeDirectoriesRequest
import DirectoryService.DescribeDirectoriesResult
import DirectoryService.DescribeDomainControllersRequest
import DirectoryService.DescribeDomainControllersResult
import DirectoryService.DescribeEventTopicsRequest
import DirectoryService.DescribeEventTopicsResult
import DirectoryService.DescribeLDAPSSettingsRequest
import DirectoryService.DescribeLDAPSSettingsResult
import DirectoryService.DescribeSharedDirectoriesRequest
import DirectoryService.DescribeSharedDirectoriesResult
import DirectoryService.DescribeSnapshotsRequest
import DirectoryService.DescribeSnapshotsResult
import DirectoryService.DescribeTrustsRequest
import DirectoryService.DescribeTrustsResult
import DirectoryService.DisableLDAPSRequest
import DirectoryService.DisableLDAPSResult
import DirectoryService.DisableRadiusRequest
import DirectoryService.DisableRadiusResult
import DirectoryService.DisableSsoRequest
import DirectoryService.DisableSsoResult
import DirectoryService.EnableLDAPSRequest
import DirectoryService.EnableLDAPSResult
import DirectoryService.EnableRadiusRequest
import DirectoryService.EnableRadiusResult
import DirectoryService.EnableSsoRequest
import DirectoryService.EnableSsoResult
import DirectoryService.GetDirectoryLimitsRequest
import DirectoryService.GetDirectoryLimitsResult
import DirectoryService.GetSnapshotLimitsRequest
import DirectoryService.GetSnapshotLimitsResult
import DirectoryService.ListCertificatesRequest
import DirectoryService.ListCertificatesResult
import DirectoryService.ListIpRoutesRequest
import DirectoryService.ListIpRoutesResult
import DirectoryService.ListLogSubscriptionsRequest
import DirectoryService.ListLogSubscriptionsResult
import DirectoryService.ListSchemaExtensionsRequest
import DirectoryService.ListSchemaExtensionsResult
import DirectoryService.ListTagsForResourceRequest
import DirectoryService.ListTagsForResourceResult
import DirectoryService.RegisterCertificateRequest
import DirectoryService.RegisterCertificateResult
import DirectoryService.RegisterEventTopicRequest
import DirectoryService.RegisterEventTopicResult
import DirectoryService.RejectSharedDirectoryRequest
import DirectoryService.RejectSharedDirectoryResult
import DirectoryService.RemoveIpRoutesRequest
import DirectoryService.RemoveIpRoutesResult
import DirectoryService.RemoveTagsFromResourceRequest
import DirectoryService.RemoveTagsFromResourceResult
import DirectoryService.ResetUserPasswordRequest
import DirectoryService.ResetUserPasswordResult
import DirectoryService.RestoreFromSnapshotRequest
import DirectoryService.RestoreFromSnapshotResult
import DirectoryService.ShareDirectoryRequest
import DirectoryService.ShareDirectoryResult
import DirectoryService.StartSchemaExtensionRequest
import DirectoryService.StartSchemaExtensionResult
import DirectoryService.UnshareDirectoryRequest
import DirectoryService.UnshareDirectoryResult
import DirectoryService.UpdateConditionalForwarderRequest
import DirectoryService.UpdateConditionalForwarderResult
import DirectoryService.UpdateNumberOfDomainControllersRequest
import DirectoryService.UpdateNumberOfDomainControllersResult
import DirectoryService.UpdateRadiusRequest
import DirectoryService.UpdateRadiusResult
import DirectoryService.UpdateTrustRequest
import DirectoryService.UpdateTrustResult
import DirectoryService.VerifyTrustRequest
import DirectoryService.VerifyTrustResult
import DirectoryService.DirectoryConnectSettings
import DirectoryService.Computer
import DirectoryService.DirectoryVpcSettings
import DirectoryService.Certificate
import DirectoryService.DirectoryVpcSettingsDescription
import DirectoryService.DirectoryConnectSettingsDescription
import DirectoryService.RadiusSettings
import DirectoryService.OwnerDirectoryDescription
import DirectoryService.DirectoryLimits
import DirectoryService.SnapshotLimits
import DirectoryService.ShareTarget
import DirectoryService.UnshareTarget

typealias AccessUrl = String

typealias AddedDateTime = Date

typealias AliasName = String

typealias AttributeName = String

typealias AttributeValue = String

typealias Attributes = Array<Attribute>

typealias AvailabilityZone = String

typealias AvailabilityZones = Array<AvailabilityZone>

typealias CertificateCN = String

typealias CertificateData = String

typealias CertificateExpiryDateTime = Date

typealias CertificateId = String

typealias CertificateRegisteredDateTime = Date

typealias CertificateStateReason = String

typealias CertificatesInfo = Array<CertificateInfo>

typealias CidrIp = String

typealias CidrIps = Array<CidrIp>

typealias CloudOnlyDirectoriesLimitReached = Boolean

typealias ComputerName = String

typealias ComputerPassword = String

typealias ConditionalForwarders = Array<ConditionalForwarder>

typealias ConnectPassword = String

typealias ConnectedDirectoriesLimitReached = Boolean

typealias CreateSnapshotBeforeSchemaExtension = Boolean

typealias CreatedDateTime = Date

typealias CustomerId = String

typealias CustomerUserName = String

typealias DeleteAssociatedConditionalForwarder = Boolean

typealias Description = String

typealias DesiredNumberOfDomainControllers = Number

typealias DirectoryDescriptions = Array<DirectoryDescription>

typealias DirectoryId = String

typealias DirectoryIds = Array<DirectoryId>

typealias DirectoryName = String

typealias DirectoryShortName = String

typealias DnsIpAddrs = Array<IpAddr>

typealias DomainControllerId = String

typealias DomainControllerIds = Array<DomainControllerId>

typealias DomainControllerStatusReason = String

typealias DomainControllers = Array<DomainController>

typealias EndDateTime = Date

typealias EventTopics = Array<EventTopic>

typealias IpAddr = String

typealias IpAddrs = Array<IpAddr>

typealias IpRouteStatusReason = String

typealias IpRoutes = Array<IpRoute>

typealias IpRoutesInfo = Array<IpRouteInfo>

typealias LDAPSSettingsInfo = Array<LDAPSSettingInfo>

typealias LDAPSStatusReason = String

typealias LastUpdatedDateTime = Date

typealias LaunchTime = Date

typealias LdifContent = String

typealias Limit = Number

typealias LogGroupName = String

typealias LogSubscriptions = Array<LogSubscription>

typealias ManualSnapshotsLimitReached = Boolean

typealias NextToken = String

typealias Notes = String

typealias OrganizationalUnitDN = String

typealias PageLimit = Number

typealias Password = String

typealias PortNumber = Number

typealias RadiusDisplayLabel = String

typealias RadiusRetries = Number

typealias RadiusSharedSecret = String

typealias RadiusTimeout = Number

typealias RemoteDomainName = String

typealias RemoteDomainNames = Array<RemoteDomainName>

typealias RequestId = String

typealias ResourceId = String

typealias SID = String

typealias SchemaExtensionId = String

typealias SchemaExtensionStatusReason = String

typealias SchemaExtensionsInfo = Array<SchemaExtensionInfo>

typealias SecurityGroupId = String

typealias Server = String

typealias Servers = Array<Server>

typealias SharedDirectories = Array<SharedDirectory>

typealias SnapshotId = String

typealias SnapshotIds = Array<SnapshotId>

typealias SnapshotName = String

typealias Snapshots = Array<Snapshot>

typealias SsoEnabled = Boolean

typealias StageReason = String

typealias StartDateTime = Date

typealias StartTime = Date

typealias StateLastUpdatedDateTime = Date

typealias SubnetId = String

typealias SubnetIds = Array<SubnetId>

typealias SubscriptionCreatedDateTime = Date

typealias TagKey = String

typealias TagKeys = Array<TagKey>

typealias TagValue = String

typealias Tags = Array<Tag>

typealias TargetId = String

typealias TopicArn = String

typealias TopicName = String

typealias TopicNames = Array<TopicName>

typealias TrustId = String

typealias TrustIds = Array<TrustId>

typealias TrustPassword = String

typealias TrustStateReason = String

typealias Trusts = Array<Trust>

typealias UpdateSecurityGroupForDirectoryControllers = Boolean

typealias UseSameUsername = Boolean

typealias UserName = String

typealias UserPassword = String

typealias VpcId = String

@JsModule("aws-sdk")
external open class DirectoryService(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & DirectoryService.Types.ClientConfiguration */
    open fun acceptSharedDirectory(params: AcceptSharedDirectoryRequest, callback: (err: AWSError, data: AcceptSharedDirectoryResult) -> Unit = definedExternally): Request<AcceptSharedDirectoryResult, AWSError>
    open fun acceptSharedDirectory(callback: (err: AWSError, data: AcceptSharedDirectoryResult) -> Unit = definedExternally): Request<AcceptSharedDirectoryResult, AWSError>
    open fun addIpRoutes(params: AddIpRoutesRequest, callback: (err: AWSError, data: AddIpRoutesResult) -> Unit = definedExternally): Request<AddIpRoutesResult, AWSError>
    open fun addIpRoutes(callback: (err: AWSError, data: AddIpRoutesResult) -> Unit = definedExternally): Request<AddIpRoutesResult, AWSError>
    open fun addTagsToResource(params: AddTagsToResourceRequest, callback: (err: AWSError, data: AddTagsToResourceResult) -> Unit = definedExternally): Request<AddTagsToResourceResult, AWSError>
    open fun addTagsToResource(callback: (err: AWSError, data: AddTagsToResourceResult) -> Unit = definedExternally): Request<AddTagsToResourceResult, AWSError>
    open fun cancelSchemaExtension(params: CancelSchemaExtensionRequest, callback: (err: AWSError, data: CancelSchemaExtensionResult) -> Unit = definedExternally): Request<CancelSchemaExtensionResult, AWSError>
    open fun cancelSchemaExtension(callback: (err: AWSError, data: CancelSchemaExtensionResult) -> Unit = definedExternally): Request<CancelSchemaExtensionResult, AWSError>
    open fun connectDirectory(params: ConnectDirectoryRequest, callback: (err: AWSError, data: ConnectDirectoryResult) -> Unit = definedExternally): Request<ConnectDirectoryResult, AWSError>
    open fun connectDirectory(callback: (err: AWSError, data: ConnectDirectoryResult) -> Unit = definedExternally): Request<ConnectDirectoryResult, AWSError>
    open fun createAlias(params: CreateAliasRequest, callback: (err: AWSError, data: CreateAliasResult) -> Unit = definedExternally): Request<CreateAliasResult, AWSError>
    open fun createAlias(callback: (err: AWSError, data: CreateAliasResult) -> Unit = definedExternally): Request<CreateAliasResult, AWSError>
    open fun createComputer(params: CreateComputerRequest, callback: (err: AWSError, data: CreateComputerResult) -> Unit = definedExternally): Request<CreateComputerResult, AWSError>
    open fun createComputer(callback: (err: AWSError, data: CreateComputerResult) -> Unit = definedExternally): Request<CreateComputerResult, AWSError>
    open fun createConditionalForwarder(params: CreateConditionalForwarderRequest, callback: (err: AWSError, data: CreateConditionalForwarderResult) -> Unit = definedExternally): Request<CreateConditionalForwarderResult, AWSError>
    open fun createConditionalForwarder(callback: (err: AWSError, data: CreateConditionalForwarderResult) -> Unit = definedExternally): Request<CreateConditionalForwarderResult, AWSError>
    open fun createDirectory(params: CreateDirectoryRequest, callback: (err: AWSError, data: CreateDirectoryResult) -> Unit = definedExternally): Request<CreateDirectoryResult, AWSError>
    open fun createDirectory(callback: (err: AWSError, data: CreateDirectoryResult) -> Unit = definedExternally): Request<CreateDirectoryResult, AWSError>
    open fun createLogSubscription(params: CreateLogSubscriptionRequest, callback: (err: AWSError, data: CreateLogSubscriptionResult) -> Unit = definedExternally): Request<CreateLogSubscriptionResult, AWSError>
    open fun createLogSubscription(callback: (err: AWSError, data: CreateLogSubscriptionResult) -> Unit = definedExternally): Request<CreateLogSubscriptionResult, AWSError>
    open fun createMicrosoftAD(params: CreateMicrosoftADRequest, callback: (err: AWSError, data: CreateMicrosoftADResult) -> Unit = definedExternally): Request<CreateMicrosoftADResult, AWSError>
    open fun createMicrosoftAD(callback: (err: AWSError, data: CreateMicrosoftADResult) -> Unit = definedExternally): Request<CreateMicrosoftADResult, AWSError>
    open fun createSnapshot(params: CreateSnapshotRequest, callback: (err: AWSError, data: CreateSnapshotResult) -> Unit = definedExternally): Request<CreateSnapshotResult, AWSError>
    open fun createSnapshot(callback: (err: AWSError, data: CreateSnapshotResult) -> Unit = definedExternally): Request<CreateSnapshotResult, AWSError>
    open fun createTrust(params: CreateTrustRequest, callback: (err: AWSError, data: CreateTrustResult) -> Unit = definedExternally): Request<CreateTrustResult, AWSError>
    open fun createTrust(callback: (err: AWSError, data: CreateTrustResult) -> Unit = definedExternally): Request<CreateTrustResult, AWSError>
    open fun deleteConditionalForwarder(params: DeleteConditionalForwarderRequest, callback: (err: AWSError, data: DeleteConditionalForwarderResult) -> Unit = definedExternally): Request<DeleteConditionalForwarderResult, AWSError>
    open fun deleteConditionalForwarder(callback: (err: AWSError, data: DeleteConditionalForwarderResult) -> Unit = definedExternally): Request<DeleteConditionalForwarderResult, AWSError>
    open fun deleteDirectory(params: DeleteDirectoryRequest, callback: (err: AWSError, data: DeleteDirectoryResult) -> Unit = definedExternally): Request<DeleteDirectoryResult, AWSError>
    open fun deleteDirectory(callback: (err: AWSError, data: DeleteDirectoryResult) -> Unit = definedExternally): Request<DeleteDirectoryResult, AWSError>
    open fun deleteLogSubscription(params: DeleteLogSubscriptionRequest, callback: (err: AWSError, data: DeleteLogSubscriptionResult) -> Unit = definedExternally): Request<DeleteLogSubscriptionResult, AWSError>
    open fun deleteLogSubscription(callback: (err: AWSError, data: DeleteLogSubscriptionResult) -> Unit = definedExternally): Request<DeleteLogSubscriptionResult, AWSError>
    open fun deleteSnapshot(params: DeleteSnapshotRequest, callback: (err: AWSError, data: DeleteSnapshotResult) -> Unit = definedExternally): Request<DeleteSnapshotResult, AWSError>
    open fun deleteSnapshot(callback: (err: AWSError, data: DeleteSnapshotResult) -> Unit = definedExternally): Request<DeleteSnapshotResult, AWSError>
    open fun deleteTrust(params: DeleteTrustRequest, callback: (err: AWSError, data: DeleteTrustResult) -> Unit = definedExternally): Request<DeleteTrustResult, AWSError>
    open fun deleteTrust(callback: (err: AWSError, data: DeleteTrustResult) -> Unit = definedExternally): Request<DeleteTrustResult, AWSError>
    open fun deregisterCertificate(params: DeregisterCertificateRequest, callback: (err: AWSError, data: DeregisterCertificateResult) -> Unit = definedExternally): Request<DeregisterCertificateResult, AWSError>
    open fun deregisterCertificate(callback: (err: AWSError, data: DeregisterCertificateResult) -> Unit = definedExternally): Request<DeregisterCertificateResult, AWSError>
    open fun deregisterEventTopic(params: DeregisterEventTopicRequest, callback: (err: AWSError, data: DeregisterEventTopicResult) -> Unit = definedExternally): Request<DeregisterEventTopicResult, AWSError>
    open fun deregisterEventTopic(callback: (err: AWSError, data: DeregisterEventTopicResult) -> Unit = definedExternally): Request<DeregisterEventTopicResult, AWSError>
    open fun describeCertificate(params: DescribeCertificateRequest, callback: (err: AWSError, data: DescribeCertificateResult) -> Unit = definedExternally): Request<DescribeCertificateResult, AWSError>
    open fun describeCertificate(callback: (err: AWSError, data: DescribeCertificateResult) -> Unit = definedExternally): Request<DescribeCertificateResult, AWSError>
    open fun describeConditionalForwarders(params: DescribeConditionalForwardersRequest, callback: (err: AWSError, data: DescribeConditionalForwardersResult) -> Unit = definedExternally): Request<DescribeConditionalForwardersResult, AWSError>
    open fun describeConditionalForwarders(callback: (err: AWSError, data: DescribeConditionalForwardersResult) -> Unit = definedExternally): Request<DescribeConditionalForwardersResult, AWSError>
    open fun describeDirectories(params: DescribeDirectoriesRequest, callback: (err: AWSError, data: DescribeDirectoriesResult) -> Unit = definedExternally): Request<DescribeDirectoriesResult, AWSError>
    open fun describeDirectories(callback: (err: AWSError, data: DescribeDirectoriesResult) -> Unit = definedExternally): Request<DescribeDirectoriesResult, AWSError>
    open fun describeDomainControllers(params: DescribeDomainControllersRequest, callback: (err: AWSError, data: DescribeDomainControllersResult) -> Unit = definedExternally): Request<DescribeDomainControllersResult, AWSError>
    open fun describeDomainControllers(callback: (err: AWSError, data: DescribeDomainControllersResult) -> Unit = definedExternally): Request<DescribeDomainControllersResult, AWSError>
    open fun describeEventTopics(params: DescribeEventTopicsRequest, callback: (err: AWSError, data: DescribeEventTopicsResult) -> Unit = definedExternally): Request<DescribeEventTopicsResult, AWSError>
    open fun describeEventTopics(callback: (err: AWSError, data: DescribeEventTopicsResult) -> Unit = definedExternally): Request<DescribeEventTopicsResult, AWSError>
    open fun describeLDAPSSettings(params: DescribeLDAPSSettingsRequest, callback: (err: AWSError, data: DescribeLDAPSSettingsResult) -> Unit = definedExternally): Request<DescribeLDAPSSettingsResult, AWSError>
    open fun describeLDAPSSettings(callback: (err: AWSError, data: DescribeLDAPSSettingsResult) -> Unit = definedExternally): Request<DescribeLDAPSSettingsResult, AWSError>
    open fun describeSharedDirectories(params: DescribeSharedDirectoriesRequest, callback: (err: AWSError, data: DescribeSharedDirectoriesResult) -> Unit = definedExternally): Request<DescribeSharedDirectoriesResult, AWSError>
    open fun describeSharedDirectories(callback: (err: AWSError, data: DescribeSharedDirectoriesResult) -> Unit = definedExternally): Request<DescribeSharedDirectoriesResult, AWSError>
    open fun describeSnapshots(params: DescribeSnapshotsRequest, callback: (err: AWSError, data: DescribeSnapshotsResult) -> Unit = definedExternally): Request<DescribeSnapshotsResult, AWSError>
    open fun describeSnapshots(callback: (err: AWSError, data: DescribeSnapshotsResult) -> Unit = definedExternally): Request<DescribeSnapshotsResult, AWSError>
    open fun describeTrusts(params: DescribeTrustsRequest, callback: (err: AWSError, data: DescribeTrustsResult) -> Unit = definedExternally): Request<DescribeTrustsResult, AWSError>
    open fun describeTrusts(callback: (err: AWSError, data: DescribeTrustsResult) -> Unit = definedExternally): Request<DescribeTrustsResult, AWSError>
    open fun disableLDAPS(params: DisableLDAPSRequest, callback: (err: AWSError, data: DisableLDAPSResult) -> Unit = definedExternally): Request<DisableLDAPSResult, AWSError>
    open fun disableLDAPS(callback: (err: AWSError, data: DisableLDAPSResult) -> Unit = definedExternally): Request<DisableLDAPSResult, AWSError>
    open fun disableRadius(params: DisableRadiusRequest, callback: (err: AWSError, data: DisableRadiusResult) -> Unit = definedExternally): Request<DisableRadiusResult, AWSError>
    open fun disableRadius(callback: (err: AWSError, data: DisableRadiusResult) -> Unit = definedExternally): Request<DisableRadiusResult, AWSError>
    open fun disableSso(params: DisableSsoRequest, callback: (err: AWSError, data: DisableSsoResult) -> Unit = definedExternally): Request<DisableSsoResult, AWSError>
    open fun disableSso(callback: (err: AWSError, data: DisableSsoResult) -> Unit = definedExternally): Request<DisableSsoResult, AWSError>
    open fun enableLDAPS(params: EnableLDAPSRequest, callback: (err: AWSError, data: EnableLDAPSResult) -> Unit = definedExternally): Request<EnableLDAPSResult, AWSError>
    open fun enableLDAPS(callback: (err: AWSError, data: EnableLDAPSResult) -> Unit = definedExternally): Request<EnableLDAPSResult, AWSError>
    open fun enableRadius(params: EnableRadiusRequest, callback: (err: AWSError, data: EnableRadiusResult) -> Unit = definedExternally): Request<EnableRadiusResult, AWSError>
    open fun enableRadius(callback: (err: AWSError, data: EnableRadiusResult) -> Unit = definedExternally): Request<EnableRadiusResult, AWSError>
    open fun enableSso(params: EnableSsoRequest, callback: (err: AWSError, data: EnableSsoResult) -> Unit = definedExternally): Request<EnableSsoResult, AWSError>
    open fun enableSso(callback: (err: AWSError, data: EnableSsoResult) -> Unit = definedExternally): Request<EnableSsoResult, AWSError>
    open fun getDirectoryLimits(params: GetDirectoryLimitsRequest, callback: (err: AWSError, data: GetDirectoryLimitsResult) -> Unit = definedExternally): Request<GetDirectoryLimitsResult, AWSError>
    open fun getDirectoryLimits(callback: (err: AWSError, data: GetDirectoryLimitsResult) -> Unit = definedExternally): Request<GetDirectoryLimitsResult, AWSError>
    open fun getSnapshotLimits(params: GetSnapshotLimitsRequest, callback: (err: AWSError, data: GetSnapshotLimitsResult) -> Unit = definedExternally): Request<GetSnapshotLimitsResult, AWSError>
    open fun getSnapshotLimits(callback: (err: AWSError, data: GetSnapshotLimitsResult) -> Unit = definedExternally): Request<GetSnapshotLimitsResult, AWSError>
    open fun listCertificates(params: ListCertificatesRequest, callback: (err: AWSError, data: ListCertificatesResult) -> Unit = definedExternally): Request<ListCertificatesResult, AWSError>
    open fun listCertificates(callback: (err: AWSError, data: ListCertificatesResult) -> Unit = definedExternally): Request<ListCertificatesResult, AWSError>
    open fun listIpRoutes(params: ListIpRoutesRequest, callback: (err: AWSError, data: ListIpRoutesResult) -> Unit = definedExternally): Request<ListIpRoutesResult, AWSError>
    open fun listIpRoutes(callback: (err: AWSError, data: ListIpRoutesResult) -> Unit = definedExternally): Request<ListIpRoutesResult, AWSError>
    open fun listLogSubscriptions(params: ListLogSubscriptionsRequest, callback: (err: AWSError, data: ListLogSubscriptionsResult) -> Unit = definedExternally): Request<ListLogSubscriptionsResult, AWSError>
    open fun listLogSubscriptions(callback: (err: AWSError, data: ListLogSubscriptionsResult) -> Unit = definedExternally): Request<ListLogSubscriptionsResult, AWSError>
    open fun listSchemaExtensions(params: ListSchemaExtensionsRequest, callback: (err: AWSError, data: ListSchemaExtensionsResult) -> Unit = definedExternally): Request<ListSchemaExtensionsResult, AWSError>
    open fun listSchemaExtensions(callback: (err: AWSError, data: ListSchemaExtensionsResult) -> Unit = definedExternally): Request<ListSchemaExtensionsResult, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResult) -> Unit = definedExternally): Request<ListTagsForResourceResult, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResult) -> Unit = definedExternally): Request<ListTagsForResourceResult, AWSError>
    open fun registerCertificate(params: RegisterCertificateRequest, callback: (err: AWSError, data: RegisterCertificateResult) -> Unit = definedExternally): Request<RegisterCertificateResult, AWSError>
    open fun registerCertificate(callback: (err: AWSError, data: RegisterCertificateResult) -> Unit = definedExternally): Request<RegisterCertificateResult, AWSError>
    open fun registerEventTopic(params: RegisterEventTopicRequest, callback: (err: AWSError, data: RegisterEventTopicResult) -> Unit = definedExternally): Request<RegisterEventTopicResult, AWSError>
    open fun registerEventTopic(callback: (err: AWSError, data: RegisterEventTopicResult) -> Unit = definedExternally): Request<RegisterEventTopicResult, AWSError>
    open fun rejectSharedDirectory(params: RejectSharedDirectoryRequest, callback: (err: AWSError, data: RejectSharedDirectoryResult) -> Unit = definedExternally): Request<RejectSharedDirectoryResult, AWSError>
    open fun rejectSharedDirectory(callback: (err: AWSError, data: RejectSharedDirectoryResult) -> Unit = definedExternally): Request<RejectSharedDirectoryResult, AWSError>
    open fun removeIpRoutes(params: RemoveIpRoutesRequest, callback: (err: AWSError, data: RemoveIpRoutesResult) -> Unit = definedExternally): Request<RemoveIpRoutesResult, AWSError>
    open fun removeIpRoutes(callback: (err: AWSError, data: RemoveIpRoutesResult) -> Unit = definedExternally): Request<RemoveIpRoutesResult, AWSError>
    open fun removeTagsFromResource(params: RemoveTagsFromResourceRequest, callback: (err: AWSError, data: RemoveTagsFromResourceResult) -> Unit = definedExternally): Request<RemoveTagsFromResourceResult, AWSError>
    open fun removeTagsFromResource(callback: (err: AWSError, data: RemoveTagsFromResourceResult) -> Unit = definedExternally): Request<RemoveTagsFromResourceResult, AWSError>
    open fun resetUserPassword(params: ResetUserPasswordRequest, callback: (err: AWSError, data: ResetUserPasswordResult) -> Unit = definedExternally): Request<ResetUserPasswordResult, AWSError>
    open fun resetUserPassword(callback: (err: AWSError, data: ResetUserPasswordResult) -> Unit = definedExternally): Request<ResetUserPasswordResult, AWSError>
    open fun restoreFromSnapshot(params: RestoreFromSnapshotRequest, callback: (err: AWSError, data: RestoreFromSnapshotResult) -> Unit = definedExternally): Request<RestoreFromSnapshotResult, AWSError>
    open fun restoreFromSnapshot(callback: (err: AWSError, data: RestoreFromSnapshotResult) -> Unit = definedExternally): Request<RestoreFromSnapshotResult, AWSError>
    open fun shareDirectory(params: ShareDirectoryRequest, callback: (err: AWSError, data: ShareDirectoryResult) -> Unit = definedExternally): Request<ShareDirectoryResult, AWSError>
    open fun shareDirectory(callback: (err: AWSError, data: ShareDirectoryResult) -> Unit = definedExternally): Request<ShareDirectoryResult, AWSError>
    open fun startSchemaExtension(params: StartSchemaExtensionRequest, callback: (err: AWSError, data: StartSchemaExtensionResult) -> Unit = definedExternally): Request<StartSchemaExtensionResult, AWSError>
    open fun startSchemaExtension(callback: (err: AWSError, data: StartSchemaExtensionResult) -> Unit = definedExternally): Request<StartSchemaExtensionResult, AWSError>
    open fun unshareDirectory(params: UnshareDirectoryRequest, callback: (err: AWSError, data: UnshareDirectoryResult) -> Unit = definedExternally): Request<UnshareDirectoryResult, AWSError>
    open fun unshareDirectory(callback: (err: AWSError, data: UnshareDirectoryResult) -> Unit = definedExternally): Request<UnshareDirectoryResult, AWSError>
    open fun updateConditionalForwarder(params: UpdateConditionalForwarderRequest, callback: (err: AWSError, data: UpdateConditionalForwarderResult) -> Unit = definedExternally): Request<UpdateConditionalForwarderResult, AWSError>
    open fun updateConditionalForwarder(callback: (err: AWSError, data: UpdateConditionalForwarderResult) -> Unit = definedExternally): Request<UpdateConditionalForwarderResult, AWSError>
    open fun updateNumberOfDomainControllers(params: UpdateNumberOfDomainControllersRequest, callback: (err: AWSError, data: UpdateNumberOfDomainControllersResult) -> Unit = definedExternally): Request<UpdateNumberOfDomainControllersResult, AWSError>
    open fun updateNumberOfDomainControllers(callback: (err: AWSError, data: UpdateNumberOfDomainControllersResult) -> Unit = definedExternally): Request<UpdateNumberOfDomainControllersResult, AWSError>
    open fun updateRadius(params: UpdateRadiusRequest, callback: (err: AWSError, data: UpdateRadiusResult) -> Unit = definedExternally): Request<UpdateRadiusResult, AWSError>
    open fun updateRadius(callback: (err: AWSError, data: UpdateRadiusResult) -> Unit = definedExternally): Request<UpdateRadiusResult, AWSError>
    open fun updateTrust(params: UpdateTrustRequest, callback: (err: AWSError, data: UpdateTrustResult) -> Unit = definedExternally): Request<UpdateTrustResult, AWSError>
    open fun updateTrust(callback: (err: AWSError, data: UpdateTrustResult) -> Unit = definedExternally): Request<UpdateTrustResult, AWSError>
    open fun verifyTrust(params: VerifyTrustRequest, callback: (err: AWSError, data: VerifyTrustResult) -> Unit = definedExternally): Request<VerifyTrustResult, AWSError>
    open fun verifyTrust(callback: (err: AWSError, data: VerifyTrustResult) -> Unit = definedExternally): Request<VerifyTrustResult, AWSError>
    interface AcceptSharedDirectoryRequest {
        var SharedDirectoryId: DirectoryId
    }
    interface AcceptSharedDirectoryResult {
        var SharedDirectory: SharedDirectory?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddIpRoutesRequest {
        var DirectoryId: DirectoryId
        var IpRoutes: IpRoutes
        var UpdateSecurityGroupForDirectoryControllers: UpdateSecurityGroupForDirectoryControllers?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddIpRoutesResult
    interface AddTagsToResourceRequest {
        var ResourceId: ResourceId
        var Tags: Tags
    }
    interface AddTagsToResourceResult
    interface Attribute {
        var Name: AttributeName?
            get() = definedExternally
            set(value) = definedExternally
        var Value: AttributeValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelSchemaExtensionRequest {
        var DirectoryId: DirectoryId
        var SchemaExtensionId: SchemaExtensionId
    }
    interface CancelSchemaExtensionResult
    interface Certificate {
        var CertificateId: CertificateId?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "Registering" | "Registered" | "RegisterFailed" | "Deregistering" | "Deregistered" | "DeregisterFailed" | String */
        var StateReason: CertificateStateReason?
            get() = definedExternally
            set(value) = definedExternally
        var CommonName: CertificateCN?
            get() = definedExternally
            set(value) = definedExternally
        var RegisteredDateTime: CertificateRegisteredDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var ExpiryDateTime: CertificateExpiryDateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CertificateInfo {
        var CertificateId: CertificateId?
            get() = definedExternally
            set(value) = definedExternally
        var CommonName: CertificateCN?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "Registering" | "Registered" | "RegisterFailed" | "Deregistering" | "Deregistered" | "DeregisterFailed" | String */
        var ExpiryDateTime: CertificateExpiryDateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Computer {
        var ComputerId: SID?
            get() = definedExternally
            set(value) = definedExternally
        var ComputerName: ComputerName?
            get() = definedExternally
            set(value) = definedExternally
        var ComputerAttributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConditionalForwarder {
        var RemoteDomainName: RemoteDomainName?
            get() = definedExternally
            set(value) = definedExternally
        var DnsIpAddrs: DnsIpAddrs?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationScope: String /* "Domain" | String */
    }
    interface ConnectDirectoryRequest {
        var Name: DirectoryName
        var ShortName: DirectoryShortName?
            get() = definedExternally
            set(value) = definedExternally
        var Password: ConnectPassword
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Size: String /* "Small" | "Large" | String */
        var ConnectSettings: DirectoryConnectSettings
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConnectDirectoryResult {
        var DirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAliasRequest {
        var DirectoryId: DirectoryId
        var Alias: AliasName
    }
    interface CreateAliasResult {
        var DirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
        var Alias: AliasName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateComputerRequest {
        var DirectoryId: DirectoryId
        var ComputerName: ComputerName
        var Password: ComputerPassword
        var OrganizationalUnitDistinguishedName: OrganizationalUnitDN?
            get() = definedExternally
            set(value) = definedExternally
        var ComputerAttributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateComputerResult {
        var Computer: Computer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateConditionalForwarderRequest {
        var DirectoryId: DirectoryId
        var RemoteDomainName: RemoteDomainName
        var DnsIpAddrs: DnsIpAddrs
    }
    interface CreateConditionalForwarderResult
    interface CreateDirectoryRequest {
        var Name: DirectoryName
        var ShortName: DirectoryShortName?
            get() = definedExternally
            set(value) = definedExternally
        var Password: Password
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Size: String /* "Small" | "Large" | String */
        var VpcSettings: DirectoryVpcSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDirectoryResult {
        var DirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLogSubscriptionRequest {
        var DirectoryId: DirectoryId
        var LogGroupName: LogGroupName
    }
    interface CreateLogSubscriptionResult
    interface CreateMicrosoftADRequest {
        var Name: DirectoryName
        var ShortName: DirectoryShortName?
            get() = definedExternally
            set(value) = definedExternally
        var Password: Password
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var VpcSettings: DirectoryVpcSettings
        var Edition: String /* "Enterprise" | "Standard" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateMicrosoftADResult {
        var DirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSnapshotRequest {
        var DirectoryId: DirectoryId
        var Name: SnapshotName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSnapshotResult {
        var SnapshotId: SnapshotId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTrustRequest {
        var DirectoryId: DirectoryId
        var RemoteDomainName: RemoteDomainName
        var TrustPassword: TrustPassword
        var TrustDirection: String /* "One-Way: Outgoing" | "One-Way: Incoming" | "Two-Way" | String */
        var TrustType: String /* "Forest" | "External" | String */
        var ConditionalForwarderIpAddrs: DnsIpAddrs?
            get() = definedExternally
            set(value) = definedExternally
        var SelectiveAuth: String /* "Enabled" | "Disabled" | String */
    }
    interface CreateTrustResult {
        var TrustId: TrustId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteConditionalForwarderRequest {
        var DirectoryId: DirectoryId
        var RemoteDomainName: RemoteDomainName
    }
    interface DeleteConditionalForwarderResult
    interface DeleteDirectoryRequest {
        var DirectoryId: DirectoryId
    }
    interface DeleteDirectoryResult {
        var DirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteLogSubscriptionRequest {
        var DirectoryId: DirectoryId
    }
    interface DeleteLogSubscriptionResult
    interface DeleteSnapshotRequest {
        var SnapshotId: SnapshotId
    }
    interface DeleteSnapshotResult {
        var SnapshotId: SnapshotId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteTrustRequest {
        var TrustId: TrustId
        var DeleteAssociatedConditionalForwarder: DeleteAssociatedConditionalForwarder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteTrustResult {
        var TrustId: TrustId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeregisterCertificateRequest {
        var DirectoryId: DirectoryId
        var CertificateId: CertificateId
    }
    interface DeregisterCertificateResult
    interface DeregisterEventTopicRequest {
        var DirectoryId: DirectoryId
        var TopicName: TopicName
    }
    interface DeregisterEventTopicResult
    interface DescribeCertificateRequest {
        var DirectoryId: DirectoryId
        var CertificateId: CertificateId
    }
    interface DescribeCertificateResult {
        var Certificate: Certificate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConditionalForwardersRequest {
        var DirectoryId: DirectoryId
        var RemoteDomainNames: RemoteDomainNames?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConditionalForwardersResult {
        var ConditionalForwarders: ConditionalForwarders?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDirectoriesRequest {
        var DirectoryIds: DirectoryIds?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDirectoriesResult {
        var DirectoryDescriptions: DirectoryDescriptions?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDomainControllersRequest {
        var DirectoryId: DirectoryId
        var DomainControllerIds: DomainControllerIds?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDomainControllersResult {
        var DomainControllers: DomainControllers?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventTopicsRequest {
        var DirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
        var TopicNames: TopicNames?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventTopicsResult {
        var EventTopics: EventTopics?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLDAPSSettingsRequest {
        var DirectoryId: DirectoryId
        var Type: String /* "Client" | String */
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PageLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLDAPSSettingsResult {
        var LDAPSSettingsInfo: LDAPSSettingsInfo?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSharedDirectoriesRequest {
        var OwnerDirectoryId: DirectoryId
        var SharedDirectoryIds: DirectoryIds?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSharedDirectoriesResult {
        var SharedDirectories: SharedDirectories?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSnapshotsRequest {
        var DirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotIds: SnapshotIds?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSnapshotsResult {
        var Snapshots: Snapshots?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTrustsRequest {
        var DirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
        var TrustIds: TrustIds?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTrustsResult {
        var Trusts: Trusts?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DirectoryConnectSettings {
        var VpcId: VpcId
        var SubnetIds: SubnetIds
        var CustomerDnsIps: DnsIpAddrs
        var CustomerUserName: UserName
    }
    interface DirectoryConnectSettingsDescription {
        var VpcId: VpcId?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: SubnetIds?
            get() = definedExternally
            set(value) = definedExternally
        var CustomerUserName: UserName?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupId: SecurityGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZones: AvailabilityZones?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectIps: IpAddrs?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DirectoryDescription {
        var DirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: DirectoryName?
            get() = definedExternally
            set(value) = definedExternally
        var ShortName: DirectoryShortName?
            get() = definedExternally
            set(value) = definedExternally
        var Size: String /* "Small" | "Large" | String */
        var Edition: String /* "Enterprise" | "Standard" | String */
        var Alias: AliasName?
            get() = definedExternally
            set(value) = definedExternally
        var AccessUrl: AccessUrl?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var DnsIpAddrs: DnsIpAddrs?
            get() = definedExternally
            set(value) = definedExternally
        var Stage: String /* "Requested" | "Creating" | "Created" | "Active" | "Inoperable" | "Impaired" | "Restoring" | "RestoreFailed" | "Deleting" | "Deleted" | "Failed" | String */
        var ShareStatus: String /* "Shared" | "PendingAcceptance" | "Rejected" | "Rejecting" | "RejectFailed" | "Sharing" | "ShareFailed" | "Deleted" | "Deleting" | String */
        var ShareMethod: String /* "ORGANIZATIONS" | "HANDSHAKE" | String */
        var ShareNotes: Notes?
            get() = definedExternally
            set(value) = definedExternally
        var LaunchTime: LaunchTime?
            get() = definedExternally
            set(value) = definedExternally
        var StageLastUpdatedDateTime: LastUpdatedDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "SimpleAD" | "ADConnector" | "MicrosoftAD" | "SharedMicrosoftAD" | String */
        var VpcSettings: DirectoryVpcSettingsDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectSettings: DirectoryConnectSettingsDescription?
            get() = definedExternally
            set(value) = definedExternally
        var RadiusSettings: RadiusSettings?
            get() = definedExternally
            set(value) = definedExternally
        var RadiusStatus: String /* "Creating" | "Completed" | "Failed" | String */
        var StageReason: StageReason?
            get() = definedExternally
            set(value) = definedExternally
        var SsoEnabled: SsoEnabled?
            get() = definedExternally
            set(value) = definedExternally
        var DesiredNumberOfDomainControllers: DesiredNumberOfDomainControllers?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerDirectoryDescription: OwnerDirectoryDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DirectoryLimits {
        var CloudOnlyDirectoriesLimit: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var CloudOnlyDirectoriesCurrentCount: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var CloudOnlyDirectoriesLimitReached: CloudOnlyDirectoriesLimitReached?
            get() = definedExternally
            set(value) = definedExternally
        var CloudOnlyMicrosoftADLimit: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var CloudOnlyMicrosoftADCurrentCount: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var CloudOnlyMicrosoftADLimitReached: CloudOnlyDirectoriesLimitReached?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectedDirectoriesLimit: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectedDirectoriesCurrentCount: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectedDirectoriesLimitReached: ConnectedDirectoriesLimitReached?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DirectoryVpcSettings {
        var VpcId: VpcId
        var SubnetIds: SubnetIds
    }
    interface DirectoryVpcSettingsDescription {
        var VpcId: VpcId?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: SubnetIds?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupId: SecurityGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZones: AvailabilityZones?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisableLDAPSRequest {
        var DirectoryId: DirectoryId
        var Type: String /* "Client" | String */
    }
    interface DisableLDAPSResult
    interface DisableRadiusRequest {
        var DirectoryId: DirectoryId
    }
    interface DisableRadiusResult
    interface DisableSsoRequest {
        var DirectoryId: DirectoryId
        var UserName: UserName?
            get() = definedExternally
            set(value) = definedExternally
        var Password: ConnectPassword?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisableSsoResult
    interface DomainController {
        var DirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
        var DomainControllerId: DomainControllerId?
            get() = definedExternally
            set(value) = definedExternally
        var DnsIpAddr: IpAddr?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: VpcId?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetId: SubnetId?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: AvailabilityZone?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Creating" | "Active" | "Impaired" | "Restoring" | "Deleting" | "Deleted" | "Failed" | String */
        var StatusReason: DomainControllerStatusReason?
            get() = definedExternally
            set(value) = definedExternally
        var LaunchTime: LaunchTime?
            get() = definedExternally
            set(value) = definedExternally
        var StatusLastUpdatedDateTime: LastUpdatedDateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnableLDAPSRequest {
        var DirectoryId: DirectoryId
        var Type: String /* "Client" | String */
    }
    interface EnableLDAPSResult
    interface EnableRadiusRequest {
        var DirectoryId: DirectoryId
        var RadiusSettings: RadiusSettings
    }
    interface EnableRadiusResult
    interface EnableSsoRequest {
        var DirectoryId: DirectoryId
        var UserName: UserName?
            get() = definedExternally
            set(value) = definedExternally
        var Password: ConnectPassword?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnableSsoResult
    interface EventTopic {
        var DirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
        var TopicName: TopicName?
            get() = definedExternally
            set(value) = definedExternally
        var TopicArn: TopicArn?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDateTime: CreatedDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Registered" | "Topic not found" | "Failed" | "Deleted" | String */
    }
    interface GetDirectoryLimitsRequest
    interface GetDirectoryLimitsResult {
        var DirectoryLimits: DirectoryLimits?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSnapshotLimitsRequest {
        var DirectoryId: DirectoryId
    }
    interface GetSnapshotLimitsResult {
        var SnapshotLimits: SnapshotLimits?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IpRoute {
        var CidrIp: CidrIp?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IpRouteInfo {
        var DirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
        var CidrIp: CidrIp?
            get() = definedExternally
            set(value) = definedExternally
        var IpRouteStatusMsg: String /* "Adding" | "Added" | "Removing" | "Removed" | "AddFailed" | "RemoveFailed" | String */
        var AddedDateTime: AddedDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var IpRouteStatusReason: IpRouteStatusReason?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LDAPSSettingInfo {
        var LDAPSStatus: String /* "Enabling" | "Enabled" | "EnableFailed" | "Disabled" | String */
        var LDAPSStatusReason: LDAPSStatusReason?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedDateTime: LastUpdatedDateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCertificatesRequest {
        var DirectoryId: DirectoryId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PageLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCertificatesResult {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var CertificatesInfo: CertificatesInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIpRoutesRequest {
        var DirectoryId: DirectoryId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIpRoutesResult {
        var IpRoutesInfo: IpRoutesInfo?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLogSubscriptionsRequest {
        var DirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLogSubscriptionsResult {
        var LogSubscriptions: LogSubscriptions?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSchemaExtensionsRequest {
        var DirectoryId: DirectoryId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSchemaExtensionsResult {
        var SchemaExtensionsInfo: SchemaExtensionsInfo?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceId: ResourceId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceResult {
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogSubscription {
        var DirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
        var LogGroupName: LogGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var SubscriptionCreatedDateTime: SubscriptionCreatedDateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OwnerDirectoryDescription {
        var DirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
        var AccountId: CustomerId?
            get() = definedExternally
            set(value) = definedExternally
        var DnsIpAddrs: DnsIpAddrs?
            get() = definedExternally
            set(value) = definedExternally
        var VpcSettings: DirectoryVpcSettingsDescription?
            get() = definedExternally
            set(value) = definedExternally
        var RadiusSettings: RadiusSettings?
            get() = definedExternally
            set(value) = definedExternally
        var RadiusStatus: String /* "Creating" | "Completed" | "Failed" | String */
    }
    interface RadiusSettings {
        var RadiusServers: Servers?
            get() = definedExternally
            set(value) = definedExternally
        var RadiusPort: PortNumber?
            get() = definedExternally
            set(value) = definedExternally
        var RadiusTimeout: RadiusTimeout?
            get() = definedExternally
            set(value) = definedExternally
        var RadiusRetries: RadiusRetries?
            get() = definedExternally
            set(value) = definedExternally
        var SharedSecret: RadiusSharedSecret?
            get() = definedExternally
            set(value) = definedExternally
        var AuthenticationProtocol: String /* "PAP" | "CHAP" | "MS-CHAPv1" | "MS-CHAPv2" | String */
        var DisplayLabel: RadiusDisplayLabel?
            get() = definedExternally
            set(value) = definedExternally
        var UseSameUsername: UseSameUsername?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterCertificateRequest {
        var DirectoryId: DirectoryId
        var CertificateData: CertificateData
    }
    interface RegisterCertificateResult {
        var CertificateId: CertificateId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterEventTopicRequest {
        var DirectoryId: DirectoryId
        var TopicName: TopicName
    }
    interface RegisterEventTopicResult
    interface RejectSharedDirectoryRequest {
        var SharedDirectoryId: DirectoryId
    }
    interface RejectSharedDirectoryResult {
        var SharedDirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveIpRoutesRequest {
        var DirectoryId: DirectoryId
        var CidrIps: CidrIps
    }
    interface RemoveIpRoutesResult
    interface RemoveTagsFromResourceRequest {
        var ResourceId: ResourceId
        var TagKeys: TagKeys
    }
    interface RemoveTagsFromResourceResult
    interface ResetUserPasswordRequest {
        var DirectoryId: DirectoryId
        var UserName: CustomerUserName
        var NewPassword: UserPassword
    }
    interface ResetUserPasswordResult
    interface RestoreFromSnapshotRequest {
        var SnapshotId: SnapshotId
    }
    interface RestoreFromSnapshotResult
    interface SchemaExtensionInfo {
        var DirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaExtensionId: SchemaExtensionId?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaExtensionStatus: String /* "Initializing" | "CreatingSnapshot" | "UpdatingSchema" | "Replicating" | "CancelInProgress" | "RollbackInProgress" | "Cancelled" | "Failed" | "Completed" | String */
        var SchemaExtensionStatusReason: SchemaExtensionStatusReason?
            get() = definedExternally
            set(value) = definedExternally
        var StartDateTime: StartDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var EndDateTime: EndDateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ShareDirectoryRequest {
        var DirectoryId: DirectoryId
        var ShareNotes: Notes?
            get() = definedExternally
            set(value) = definedExternally
        var ShareTarget: ShareTarget
        var ShareMethod: String /* "ORGANIZATIONS" | "HANDSHAKE" | String */
    }
    interface ShareDirectoryResult {
        var SharedDirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ShareTarget {
        var Id: TargetId
        var Type: String /* "ACCOUNT" | String */
    }
    interface SharedDirectory {
        var OwnerAccountId: CustomerId?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerDirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
        var ShareMethod: String /* "ORGANIZATIONS" | "HANDSHAKE" | String */
        var SharedAccountId: CustomerId?
            get() = definedExternally
            set(value) = definedExternally
        var SharedDirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
        var ShareStatus: String /* "Shared" | "PendingAcceptance" | "Rejected" | "Rejecting" | "RejectFailed" | "Sharing" | "ShareFailed" | "Deleted" | "Deleting" | String */
        var ShareNotes: Notes?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDateTime: CreatedDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedDateTime: LastUpdatedDateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Snapshot {
        var DirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotId: SnapshotId?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "Auto" | "Manual" | String */
        var Name: SnapshotName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Creating" | "Completed" | "Failed" | String */
        var StartTime: StartTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SnapshotLimits {
        var ManualSnapshotsLimit: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var ManualSnapshotsCurrentCount: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var ManualSnapshotsLimitReached: ManualSnapshotsLimitReached?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartSchemaExtensionRequest {
        var DirectoryId: DirectoryId
        var CreateSnapshotBeforeSchemaExtension: CreateSnapshotBeforeSchemaExtension
        var LdifContent: LdifContent
        var Description: Description
    }
    interface StartSchemaExtensionResult {
        var SchemaExtensionId: SchemaExtensionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface Trust {
        var DirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
        var TrustId: TrustId?
            get() = definedExternally
            set(value) = definedExternally
        var RemoteDomainName: RemoteDomainName?
            get() = definedExternally
            set(value) = definedExternally
        var TrustType: String /* "Forest" | "External" | String */
        var TrustDirection: String /* "One-Way: Outgoing" | "One-Way: Incoming" | "Two-Way" | String */
        var TrustState: String /* "Creating" | "Created" | "Verifying" | "VerifyFailed" | "Verified" | "Updating" | "UpdateFailed" | "Updated" | "Deleting" | "Deleted" | "Failed" | String */
        var CreatedDateTime: CreatedDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedDateTime: LastUpdatedDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var StateLastUpdatedDateTime: StateLastUpdatedDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var TrustStateReason: TrustStateReason?
            get() = definedExternally
            set(value) = definedExternally
        var SelectiveAuth: String /* "Enabled" | "Disabled" | String */
    }
    interface UnshareDirectoryRequest {
        var DirectoryId: DirectoryId
        var UnshareTarget: UnshareTarget
    }
    interface UnshareDirectoryResult {
        var SharedDirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UnshareTarget {
        var Id: TargetId
        var Type: String /* "ACCOUNT" | String */
    }
    interface UpdateConditionalForwarderRequest {
        var DirectoryId: DirectoryId
        var RemoteDomainName: RemoteDomainName
        var DnsIpAddrs: DnsIpAddrs
    }
    interface UpdateConditionalForwarderResult
    interface UpdateNumberOfDomainControllersRequest {
        var DirectoryId: DirectoryId
        var DesiredNumber: DesiredNumberOfDomainControllers
    }
    interface UpdateNumberOfDomainControllersResult
    interface UpdateRadiusRequest {
        var DirectoryId: DirectoryId
        var RadiusSettings: RadiusSettings
    }
    interface UpdateRadiusResult
    interface UpdateTrustRequest {
        var TrustId: TrustId
        var SelectiveAuth: String /* "Enabled" | "Disabled" | String */
    }
    interface UpdateTrustResult {
        var RequestId: RequestId?
            get() = definedExternally
            set(value) = definedExternally
        var TrustId: TrustId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VerifyTrustRequest {
        var TrustId: TrustId
    }
    interface VerifyTrustResult {
        var TrustId: TrustId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2015-04-16" | "latest" | String */
    }
}