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
import Route53.Change
import Route53.DelegationSet
import Route53.Dimension
import Route53.GeoLocationDetails
import Route53.HealthCheckObservation
import Route53.HealthCheck
import Route53.HostedZone
import Route53.QueryLoggingConfig
import Route53.ResourceRecordSet
import Route53.ResourceRecord
import Route53.ResourceTagSet
import Route53.Tag
import Route53.TrafficPolicy
import Route53.TrafficPolicyInstance
import Route53.TrafficPolicySummary
import Route53.VPC
import Route53.AssociateVPCWithHostedZoneRequest
import Route53.AssociateVPCWithHostedZoneResponse
import Route53.ChangeResourceRecordSetsRequest
import Route53.ChangeResourceRecordSetsResponse
import Route53.ChangeTagsForResourceRequest
import Route53.ChangeTagsForResourceResponse
import Route53.CreateHealthCheckRequest
import Route53.CreateHealthCheckResponse
import Route53.CreateHostedZoneRequest
import Route53.CreateHostedZoneResponse
import Route53.CreateQueryLoggingConfigRequest
import Route53.CreateQueryLoggingConfigResponse
import Route53.CreateReusableDelegationSetRequest
import Route53.CreateReusableDelegationSetResponse
import Route53.CreateTrafficPolicyRequest
import Route53.CreateTrafficPolicyResponse
import Route53.CreateTrafficPolicyInstanceRequest
import Route53.CreateTrafficPolicyInstanceResponse
import Route53.CreateTrafficPolicyVersionRequest
import Route53.CreateTrafficPolicyVersionResponse
import Route53.CreateVPCAssociationAuthorizationRequest
import Route53.CreateVPCAssociationAuthorizationResponse
import Route53.DeleteHealthCheckRequest
import Route53.DeleteHealthCheckResponse
import Route53.DeleteHostedZoneRequest
import Route53.DeleteHostedZoneResponse
import Route53.DeleteQueryLoggingConfigRequest
import Route53.DeleteQueryLoggingConfigResponse
import Route53.DeleteReusableDelegationSetRequest
import Route53.DeleteReusableDelegationSetResponse
import Route53.DeleteTrafficPolicyRequest
import Route53.DeleteTrafficPolicyResponse
import Route53.DeleteTrafficPolicyInstanceRequest
import Route53.DeleteTrafficPolicyInstanceResponse
import Route53.DeleteVPCAssociationAuthorizationRequest
import Route53.DeleteVPCAssociationAuthorizationResponse
import Route53.DisassociateVPCFromHostedZoneRequest
import Route53.DisassociateVPCFromHostedZoneResponse
import Route53.GetAccountLimitRequest
import Route53.GetAccountLimitResponse
import Route53.GetChangeRequest
import Route53.GetChangeResponse
import Route53.GetCheckerIpRangesRequest
import Route53.GetCheckerIpRangesResponse
import Route53.GetGeoLocationRequest
import Route53.GetGeoLocationResponse
import Route53.GetHealthCheckRequest
import Route53.GetHealthCheckResponse
import Route53.GetHealthCheckCountRequest
import Route53.GetHealthCheckCountResponse
import Route53.GetHealthCheckLastFailureReasonRequest
import Route53.GetHealthCheckLastFailureReasonResponse
import Route53.GetHealthCheckStatusRequest
import Route53.GetHealthCheckStatusResponse
import Route53.GetHostedZoneRequest
import Route53.GetHostedZoneResponse
import Route53.GetHostedZoneCountRequest
import Route53.GetHostedZoneCountResponse
import Route53.GetHostedZoneLimitRequest
import Route53.GetHostedZoneLimitResponse
import Route53.GetQueryLoggingConfigRequest
import Route53.GetQueryLoggingConfigResponse
import Route53.GetReusableDelegationSetRequest
import Route53.GetReusableDelegationSetResponse
import Route53.GetReusableDelegationSetLimitRequest
import Route53.GetReusableDelegationSetLimitResponse
import Route53.GetTrafficPolicyRequest
import Route53.GetTrafficPolicyResponse
import Route53.GetTrafficPolicyInstanceRequest
import Route53.GetTrafficPolicyInstanceResponse
import Route53.GetTrafficPolicyInstanceCountRequest
import Route53.GetTrafficPolicyInstanceCountResponse
import Route53.ListGeoLocationsRequest
import Route53.ListGeoLocationsResponse
import Route53.ListHealthChecksRequest
import Route53.ListHealthChecksResponse
import Route53.ListHostedZonesRequest
import Route53.ListHostedZonesResponse
import Route53.ListHostedZonesByNameRequest
import Route53.ListHostedZonesByNameResponse
import Route53.ListQueryLoggingConfigsRequest
import Route53.ListQueryLoggingConfigsResponse
import Route53.ListResourceRecordSetsRequest
import Route53.ListResourceRecordSetsResponse
import Route53.ListReusableDelegationSetsRequest
import Route53.ListReusableDelegationSetsResponse
import Route53.ListTagsForResourceRequest
import Route53.ListTagsForResourceResponse
import Route53.ListTagsForResourcesRequest
import Route53.ListTagsForResourcesResponse
import Route53.ListTrafficPoliciesRequest
import Route53.ListTrafficPoliciesResponse
import Route53.ListTrafficPolicyInstancesRequest
import Route53.ListTrafficPolicyInstancesResponse
import Route53.ListTrafficPolicyInstancesByHostedZoneRequest
import Route53.ListTrafficPolicyInstancesByHostedZoneResponse
import Route53.ListTrafficPolicyInstancesByPolicyRequest
import Route53.ListTrafficPolicyInstancesByPolicyResponse
import Route53.ListTrafficPolicyVersionsRequest
import Route53.ListTrafficPolicyVersionsResponse
import Route53.ListVPCAssociationAuthorizationsRequest
import Route53.ListVPCAssociationAuthorizationsResponse
import Route53.TestDNSAnswerRequest
import Route53.TestDNSAnswerResponse
import Route53.UpdateHealthCheckRequest
import Route53.UpdateHealthCheckResponse
import Route53.UpdateHostedZoneCommentRequest
import Route53.UpdateHostedZoneCommentResponse
import Route53.UpdateTrafficPolicyCommentRequest
import Route53.UpdateTrafficPolicyCommentResponse
import Route53.UpdateTrafficPolicyInstanceRequest
import Route53.UpdateTrafficPolicyInstanceResponse
import Route53.ChangeInfo
import Route53.ChangeBatch
import Route53.HealthCheckConfig
import Route53.HostedZoneConfig
import Route53.AccountLimit
import Route53.HostedZoneLimit
import Route53.ReusableDelegationSetLimit
import Route53.LinkedService
import Route53.CloudWatchAlarmConfiguration
import Route53.AlarmIdentifier
import Route53.StatusReport
import Route53.GeoLocation
import Route53.AliasTarget

typealias AlarmName = String

typealias AliasHealthEnabled = Boolean

typealias AssociateVPCComment = String

typealias Changes = Array<Change>

typealias CheckerIpRanges = Array<IPAddressCidr>

typealias ChildHealthCheckList = Array<HealthCheckId>

typealias CloudWatchLogsLogGroupArn = String

typealias DNSName = String

typealias DNSRCode = String

typealias DelegationSetNameServers = Array<DNSName>

typealias DelegationSets = Array<DelegationSet>

typealias DimensionField = String

typealias DimensionList = Array<Dimension>

typealias Disabled = Boolean

typealias DisassociateVPCComment = String

typealias EnableSNI = Boolean

typealias EvaluationPeriods = Number

typealias FailureThreshold = Number

typealias FullyQualifiedDomainName = String

typealias GeoLocationContinentCode = String

typealias GeoLocationContinentName = String

typealias GeoLocationCountryCode = String

typealias GeoLocationCountryName = String

typealias GeoLocationDetailsList = Array<GeoLocationDetails>

typealias GeoLocationSubdivisionCode = String

typealias GeoLocationSubdivisionName = String

typealias HealthCheckCount = Number

typealias HealthCheckId = String

typealias HealthCheckNonce = String

typealias HealthCheckObservations = Array<HealthCheckObservation>

typealias HealthCheckRegionList = Array<String /* "us-east-1" | "us-west-1" | "us-west-2" | "eu-west-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-northeast-1" | "sa-east-1" | String */>

typealias HealthCheckVersion = Number

typealias HealthChecks = Array<HealthCheck>

typealias HealthThreshold = Number

typealias HostedZoneCount = Number

typealias HostedZoneRRSetCount = Number

typealias HostedZones = Array<HostedZone>

typealias IPAddress = String

typealias IPAddressCidr = String

typealias Inverted = Boolean

typealias IsPrivateZone = Boolean

typealias LimitValue = Number

typealias MaxResults = String

typealias MeasureLatency = Boolean

typealias Message = String

typealias MetricName = String

typealias Nameserver = String

typealias Namespace = String

typealias Nonce = String

typealias PageMarker = String

typealias PageMaxItems = String

typealias PageTruncated = Boolean

typealias PaginationToken = String

typealias Period = Number

typealias Port = Number

typealias QueryLoggingConfigId = String

typealias QueryLoggingConfigs = Array<QueryLoggingConfig>

typealias RData = String

typealias RecordData = Array<RecordDataEntry>

typealias RecordDataEntry = String

typealias RequestInterval = Number

typealias ResettableElementNameList = Array<String /* "FullyQualifiedDomainName" | "Regions" | "ResourcePath" | "ChildHealthChecks" | String */>

typealias ResourceDescription = String

typealias ResourceId = String

typealias ResourcePath = String

typealias ResourceRecordSetIdentifier = String

typealias ResourceRecordSetMultiValueAnswer = Boolean

typealias ResourceRecordSetWeight = Number

typealias ResourceRecordSets = Array<ResourceRecordSet>

typealias ResourceRecords = Array<ResourceRecord>

typealias ResourceTagSetList = Array<ResourceTagSet>

typealias ResourceURI = String

typealias SearchString = String

typealias ServicePrincipal = String

typealias Status = String

typealias SubnetMask = String

typealias TTL = Number

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagResourceId = String

typealias TagResourceIdList = Array<TagResourceId>

typealias TagValue = String

typealias Threshold = Number

typealias TimeStamp = Date

typealias TrafficPolicies = Array<TrafficPolicy>

typealias TrafficPolicyComment = String

typealias TrafficPolicyDocument = String

typealias TrafficPolicyId = String

typealias TrafficPolicyInstanceCount = Number

typealias TrafficPolicyInstanceId = String

typealias TrafficPolicyInstanceState = String

typealias TrafficPolicyInstances = Array<TrafficPolicyInstance>

typealias TrafficPolicyName = String

typealias TrafficPolicySummaries = Array<TrafficPolicySummary>

typealias TrafficPolicyVersion = Number

typealias TrafficPolicyVersionMarker = String

typealias TransportProtocol = String

typealias UsageCount = Number

typealias VPCId = String

typealias VPCs = Array<VPC>

@JsModule("aws-sdk")
external open class Route53(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Route53.Types.ClientConfiguration */
    open fun associateVPCWithHostedZone(params: AssociateVPCWithHostedZoneRequest, callback: (err: AWSError, data: AssociateVPCWithHostedZoneResponse) -> Unit = definedExternally): Request<AssociateVPCWithHostedZoneResponse, AWSError>
    open fun associateVPCWithHostedZone(callback: (err: AWSError, data: AssociateVPCWithHostedZoneResponse) -> Unit = definedExternally): Request<AssociateVPCWithHostedZoneResponse, AWSError>
    open fun changeResourceRecordSets(params: ChangeResourceRecordSetsRequest, callback: (err: AWSError, data: ChangeResourceRecordSetsResponse) -> Unit = definedExternally): Request<ChangeResourceRecordSetsResponse, AWSError>
    open fun changeResourceRecordSets(callback: (err: AWSError, data: ChangeResourceRecordSetsResponse) -> Unit = definedExternally): Request<ChangeResourceRecordSetsResponse, AWSError>
    open fun changeTagsForResource(params: ChangeTagsForResourceRequest, callback: (err: AWSError, data: ChangeTagsForResourceResponse) -> Unit = definedExternally): Request<ChangeTagsForResourceResponse, AWSError>
    open fun changeTagsForResource(callback: (err: AWSError, data: ChangeTagsForResourceResponse) -> Unit = definedExternally): Request<ChangeTagsForResourceResponse, AWSError>
    open fun createHealthCheck(params: CreateHealthCheckRequest, callback: (err: AWSError, data: CreateHealthCheckResponse) -> Unit = definedExternally): Request<CreateHealthCheckResponse, AWSError>
    open fun createHealthCheck(callback: (err: AWSError, data: CreateHealthCheckResponse) -> Unit = definedExternally): Request<CreateHealthCheckResponse, AWSError>
    open fun createHostedZone(params: CreateHostedZoneRequest, callback: (err: AWSError, data: CreateHostedZoneResponse) -> Unit = definedExternally): Request<CreateHostedZoneResponse, AWSError>
    open fun createHostedZone(callback: (err: AWSError, data: CreateHostedZoneResponse) -> Unit = definedExternally): Request<CreateHostedZoneResponse, AWSError>
    open fun createQueryLoggingConfig(params: CreateQueryLoggingConfigRequest, callback: (err: AWSError, data: CreateQueryLoggingConfigResponse) -> Unit = definedExternally): Request<CreateQueryLoggingConfigResponse, AWSError>
    open fun createQueryLoggingConfig(callback: (err: AWSError, data: CreateQueryLoggingConfigResponse) -> Unit = definedExternally): Request<CreateQueryLoggingConfigResponse, AWSError>
    open fun createReusableDelegationSet(params: CreateReusableDelegationSetRequest, callback: (err: AWSError, data: CreateReusableDelegationSetResponse) -> Unit = definedExternally): Request<CreateReusableDelegationSetResponse, AWSError>
    open fun createReusableDelegationSet(callback: (err: AWSError, data: CreateReusableDelegationSetResponse) -> Unit = definedExternally): Request<CreateReusableDelegationSetResponse, AWSError>
    open fun createTrafficPolicy(params: CreateTrafficPolicyRequest, callback: (err: AWSError, data: CreateTrafficPolicyResponse) -> Unit = definedExternally): Request<CreateTrafficPolicyResponse, AWSError>
    open fun createTrafficPolicy(callback: (err: AWSError, data: CreateTrafficPolicyResponse) -> Unit = definedExternally): Request<CreateTrafficPolicyResponse, AWSError>
    open fun createTrafficPolicyInstance(params: CreateTrafficPolicyInstanceRequest, callback: (err: AWSError, data: CreateTrafficPolicyInstanceResponse) -> Unit = definedExternally): Request<CreateTrafficPolicyInstanceResponse, AWSError>
    open fun createTrafficPolicyInstance(callback: (err: AWSError, data: CreateTrafficPolicyInstanceResponse) -> Unit = definedExternally): Request<CreateTrafficPolicyInstanceResponse, AWSError>
    open fun createTrafficPolicyVersion(params: CreateTrafficPolicyVersionRequest, callback: (err: AWSError, data: CreateTrafficPolicyVersionResponse) -> Unit = definedExternally): Request<CreateTrafficPolicyVersionResponse, AWSError>
    open fun createTrafficPolicyVersion(callback: (err: AWSError, data: CreateTrafficPolicyVersionResponse) -> Unit = definedExternally): Request<CreateTrafficPolicyVersionResponse, AWSError>
    open fun createVPCAssociationAuthorization(params: CreateVPCAssociationAuthorizationRequest, callback: (err: AWSError, data: CreateVPCAssociationAuthorizationResponse) -> Unit = definedExternally): Request<CreateVPCAssociationAuthorizationResponse, AWSError>
    open fun createVPCAssociationAuthorization(callback: (err: AWSError, data: CreateVPCAssociationAuthorizationResponse) -> Unit = definedExternally): Request<CreateVPCAssociationAuthorizationResponse, AWSError>
    open fun deleteHealthCheck(params: DeleteHealthCheckRequest, callback: (err: AWSError, data: DeleteHealthCheckResponse) -> Unit = definedExternally): Request<DeleteHealthCheckResponse, AWSError>
    open fun deleteHealthCheck(callback: (err: AWSError, data: DeleteHealthCheckResponse) -> Unit = definedExternally): Request<DeleteHealthCheckResponse, AWSError>
    open fun deleteHostedZone(params: DeleteHostedZoneRequest, callback: (err: AWSError, data: DeleteHostedZoneResponse) -> Unit = definedExternally): Request<DeleteHostedZoneResponse, AWSError>
    open fun deleteHostedZone(callback: (err: AWSError, data: DeleteHostedZoneResponse) -> Unit = definedExternally): Request<DeleteHostedZoneResponse, AWSError>
    open fun deleteQueryLoggingConfig(params: DeleteQueryLoggingConfigRequest, callback: (err: AWSError, data: DeleteQueryLoggingConfigResponse) -> Unit = definedExternally): Request<DeleteQueryLoggingConfigResponse, AWSError>
    open fun deleteQueryLoggingConfig(callback: (err: AWSError, data: DeleteQueryLoggingConfigResponse) -> Unit = definedExternally): Request<DeleteQueryLoggingConfigResponse, AWSError>
    open fun deleteReusableDelegationSet(params: DeleteReusableDelegationSetRequest, callback: (err: AWSError, data: DeleteReusableDelegationSetResponse) -> Unit = definedExternally): Request<DeleteReusableDelegationSetResponse, AWSError>
    open fun deleteReusableDelegationSet(callback: (err: AWSError, data: DeleteReusableDelegationSetResponse) -> Unit = definedExternally): Request<DeleteReusableDelegationSetResponse, AWSError>
    open fun deleteTrafficPolicy(params: DeleteTrafficPolicyRequest, callback: (err: AWSError, data: DeleteTrafficPolicyResponse) -> Unit = definedExternally): Request<DeleteTrafficPolicyResponse, AWSError>
    open fun deleteTrafficPolicy(callback: (err: AWSError, data: DeleteTrafficPolicyResponse) -> Unit = definedExternally): Request<DeleteTrafficPolicyResponse, AWSError>
    open fun deleteTrafficPolicyInstance(params: DeleteTrafficPolicyInstanceRequest, callback: (err: AWSError, data: DeleteTrafficPolicyInstanceResponse) -> Unit = definedExternally): Request<DeleteTrafficPolicyInstanceResponse, AWSError>
    open fun deleteTrafficPolicyInstance(callback: (err: AWSError, data: DeleteTrafficPolicyInstanceResponse) -> Unit = definedExternally): Request<DeleteTrafficPolicyInstanceResponse, AWSError>
    open fun deleteVPCAssociationAuthorization(params: DeleteVPCAssociationAuthorizationRequest, callback: (err: AWSError, data: DeleteVPCAssociationAuthorizationResponse) -> Unit = definedExternally): Request<DeleteVPCAssociationAuthorizationResponse, AWSError>
    open fun deleteVPCAssociationAuthorization(callback: (err: AWSError, data: DeleteVPCAssociationAuthorizationResponse) -> Unit = definedExternally): Request<DeleteVPCAssociationAuthorizationResponse, AWSError>
    open fun disassociateVPCFromHostedZone(params: DisassociateVPCFromHostedZoneRequest, callback: (err: AWSError, data: DisassociateVPCFromHostedZoneResponse) -> Unit = definedExternally): Request<DisassociateVPCFromHostedZoneResponse, AWSError>
    open fun disassociateVPCFromHostedZone(callback: (err: AWSError, data: DisassociateVPCFromHostedZoneResponse) -> Unit = definedExternally): Request<DisassociateVPCFromHostedZoneResponse, AWSError>
    open fun getAccountLimit(params: GetAccountLimitRequest, callback: (err: AWSError, data: GetAccountLimitResponse) -> Unit = definedExternally): Request<GetAccountLimitResponse, AWSError>
    open fun getAccountLimit(callback: (err: AWSError, data: GetAccountLimitResponse) -> Unit = definedExternally): Request<GetAccountLimitResponse, AWSError>
    open fun getChange(params: GetChangeRequest, callback: (err: AWSError, data: GetChangeResponse) -> Unit = definedExternally): Request<GetChangeResponse, AWSError>
    open fun getChange(callback: (err: AWSError, data: GetChangeResponse) -> Unit = definedExternally): Request<GetChangeResponse, AWSError>
    open fun getCheckerIpRanges(params: GetCheckerIpRangesRequest, callback: (err: AWSError, data: GetCheckerIpRangesResponse) -> Unit = definedExternally): Request<GetCheckerIpRangesResponse, AWSError>
    open fun getCheckerIpRanges(callback: (err: AWSError, data: GetCheckerIpRangesResponse) -> Unit = definedExternally): Request<GetCheckerIpRangesResponse, AWSError>
    open fun getGeoLocation(params: GetGeoLocationRequest, callback: (err: AWSError, data: GetGeoLocationResponse) -> Unit = definedExternally): Request<GetGeoLocationResponse, AWSError>
    open fun getGeoLocation(callback: (err: AWSError, data: GetGeoLocationResponse) -> Unit = definedExternally): Request<GetGeoLocationResponse, AWSError>
    open fun getHealthCheck(params: GetHealthCheckRequest, callback: (err: AWSError, data: GetHealthCheckResponse) -> Unit = definedExternally): Request<GetHealthCheckResponse, AWSError>
    open fun getHealthCheck(callback: (err: AWSError, data: GetHealthCheckResponse) -> Unit = definedExternally): Request<GetHealthCheckResponse, AWSError>
    open fun getHealthCheckCount(params: GetHealthCheckCountRequest, callback: (err: AWSError, data: GetHealthCheckCountResponse) -> Unit = definedExternally): Request<GetHealthCheckCountResponse, AWSError>
    open fun getHealthCheckCount(callback: (err: AWSError, data: GetHealthCheckCountResponse) -> Unit = definedExternally): Request<GetHealthCheckCountResponse, AWSError>
    open fun getHealthCheckLastFailureReason(params: GetHealthCheckLastFailureReasonRequest, callback: (err: AWSError, data: GetHealthCheckLastFailureReasonResponse) -> Unit = definedExternally): Request<GetHealthCheckLastFailureReasonResponse, AWSError>
    open fun getHealthCheckLastFailureReason(callback: (err: AWSError, data: GetHealthCheckLastFailureReasonResponse) -> Unit = definedExternally): Request<GetHealthCheckLastFailureReasonResponse, AWSError>
    open fun getHealthCheckStatus(params: GetHealthCheckStatusRequest, callback: (err: AWSError, data: GetHealthCheckStatusResponse) -> Unit = definedExternally): Request<GetHealthCheckStatusResponse, AWSError>
    open fun getHealthCheckStatus(callback: (err: AWSError, data: GetHealthCheckStatusResponse) -> Unit = definedExternally): Request<GetHealthCheckStatusResponse, AWSError>
    open fun getHostedZone(params: GetHostedZoneRequest, callback: (err: AWSError, data: GetHostedZoneResponse) -> Unit = definedExternally): Request<GetHostedZoneResponse, AWSError>
    open fun getHostedZone(callback: (err: AWSError, data: GetHostedZoneResponse) -> Unit = definedExternally): Request<GetHostedZoneResponse, AWSError>
    open fun getHostedZoneCount(params: GetHostedZoneCountRequest, callback: (err: AWSError, data: GetHostedZoneCountResponse) -> Unit = definedExternally): Request<GetHostedZoneCountResponse, AWSError>
    open fun getHostedZoneCount(callback: (err: AWSError, data: GetHostedZoneCountResponse) -> Unit = definedExternally): Request<GetHostedZoneCountResponse, AWSError>
    open fun getHostedZoneLimit(params: GetHostedZoneLimitRequest, callback: (err: AWSError, data: GetHostedZoneLimitResponse) -> Unit = definedExternally): Request<GetHostedZoneLimitResponse, AWSError>
    open fun getHostedZoneLimit(callback: (err: AWSError, data: GetHostedZoneLimitResponse) -> Unit = definedExternally): Request<GetHostedZoneLimitResponse, AWSError>
    open fun getQueryLoggingConfig(params: GetQueryLoggingConfigRequest, callback: (err: AWSError, data: GetQueryLoggingConfigResponse) -> Unit = definedExternally): Request<GetQueryLoggingConfigResponse, AWSError>
    open fun getQueryLoggingConfig(callback: (err: AWSError, data: GetQueryLoggingConfigResponse) -> Unit = definedExternally): Request<GetQueryLoggingConfigResponse, AWSError>
    open fun getReusableDelegationSet(params: GetReusableDelegationSetRequest, callback: (err: AWSError, data: GetReusableDelegationSetResponse) -> Unit = definedExternally): Request<GetReusableDelegationSetResponse, AWSError>
    open fun getReusableDelegationSet(callback: (err: AWSError, data: GetReusableDelegationSetResponse) -> Unit = definedExternally): Request<GetReusableDelegationSetResponse, AWSError>
    open fun getReusableDelegationSetLimit(params: GetReusableDelegationSetLimitRequest, callback: (err: AWSError, data: GetReusableDelegationSetLimitResponse) -> Unit = definedExternally): Request<GetReusableDelegationSetLimitResponse, AWSError>
    open fun getReusableDelegationSetLimit(callback: (err: AWSError, data: GetReusableDelegationSetLimitResponse) -> Unit = definedExternally): Request<GetReusableDelegationSetLimitResponse, AWSError>
    open fun getTrafficPolicy(params: GetTrafficPolicyRequest, callback: (err: AWSError, data: GetTrafficPolicyResponse) -> Unit = definedExternally): Request<GetTrafficPolicyResponse, AWSError>
    open fun getTrafficPolicy(callback: (err: AWSError, data: GetTrafficPolicyResponse) -> Unit = definedExternally): Request<GetTrafficPolicyResponse, AWSError>
    open fun getTrafficPolicyInstance(params: GetTrafficPolicyInstanceRequest, callback: (err: AWSError, data: GetTrafficPolicyInstanceResponse) -> Unit = definedExternally): Request<GetTrafficPolicyInstanceResponse, AWSError>
    open fun getTrafficPolicyInstance(callback: (err: AWSError, data: GetTrafficPolicyInstanceResponse) -> Unit = definedExternally): Request<GetTrafficPolicyInstanceResponse, AWSError>
    open fun getTrafficPolicyInstanceCount(params: GetTrafficPolicyInstanceCountRequest, callback: (err: AWSError, data: GetTrafficPolicyInstanceCountResponse) -> Unit = definedExternally): Request<GetTrafficPolicyInstanceCountResponse, AWSError>
    open fun getTrafficPolicyInstanceCount(callback: (err: AWSError, data: GetTrafficPolicyInstanceCountResponse) -> Unit = definedExternally): Request<GetTrafficPolicyInstanceCountResponse, AWSError>
    open fun listGeoLocations(params: ListGeoLocationsRequest, callback: (err: AWSError, data: ListGeoLocationsResponse) -> Unit = definedExternally): Request<ListGeoLocationsResponse, AWSError>
    open fun listGeoLocations(callback: (err: AWSError, data: ListGeoLocationsResponse) -> Unit = definedExternally): Request<ListGeoLocationsResponse, AWSError>
    open fun listHealthChecks(params: ListHealthChecksRequest, callback: (err: AWSError, data: ListHealthChecksResponse) -> Unit = definedExternally): Request<ListHealthChecksResponse, AWSError>
    open fun listHealthChecks(callback: (err: AWSError, data: ListHealthChecksResponse) -> Unit = definedExternally): Request<ListHealthChecksResponse, AWSError>
    open fun listHostedZones(params: ListHostedZonesRequest, callback: (err: AWSError, data: ListHostedZonesResponse) -> Unit = definedExternally): Request<ListHostedZonesResponse, AWSError>
    open fun listHostedZones(callback: (err: AWSError, data: ListHostedZonesResponse) -> Unit = definedExternally): Request<ListHostedZonesResponse, AWSError>
    open fun listHostedZonesByName(params: ListHostedZonesByNameRequest, callback: (err: AWSError, data: ListHostedZonesByNameResponse) -> Unit = definedExternally): Request<ListHostedZonesByNameResponse, AWSError>
    open fun listHostedZonesByName(callback: (err: AWSError, data: ListHostedZonesByNameResponse) -> Unit = definedExternally): Request<ListHostedZonesByNameResponse, AWSError>
    open fun listQueryLoggingConfigs(params: ListQueryLoggingConfigsRequest, callback: (err: AWSError, data: ListQueryLoggingConfigsResponse) -> Unit = definedExternally): Request<ListQueryLoggingConfigsResponse, AWSError>
    open fun listQueryLoggingConfigs(callback: (err: AWSError, data: ListQueryLoggingConfigsResponse) -> Unit = definedExternally): Request<ListQueryLoggingConfigsResponse, AWSError>
    open fun listResourceRecordSets(params: ListResourceRecordSetsRequest, callback: (err: AWSError, data: ListResourceRecordSetsResponse) -> Unit = definedExternally): Request<ListResourceRecordSetsResponse, AWSError>
    open fun listResourceRecordSets(callback: (err: AWSError, data: ListResourceRecordSetsResponse) -> Unit = definedExternally): Request<ListResourceRecordSetsResponse, AWSError>
    open fun listReusableDelegationSets(params: ListReusableDelegationSetsRequest, callback: (err: AWSError, data: ListReusableDelegationSetsResponse) -> Unit = definedExternally): Request<ListReusableDelegationSetsResponse, AWSError>
    open fun listReusableDelegationSets(callback: (err: AWSError, data: ListReusableDelegationSetsResponse) -> Unit = definedExternally): Request<ListReusableDelegationSetsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResources(params: ListTagsForResourcesRequest, callback: (err: AWSError, data: ListTagsForResourcesResponse) -> Unit = definedExternally): Request<ListTagsForResourcesResponse, AWSError>
    open fun listTagsForResources(callback: (err: AWSError, data: ListTagsForResourcesResponse) -> Unit = definedExternally): Request<ListTagsForResourcesResponse, AWSError>
    open fun listTrafficPolicies(params: ListTrafficPoliciesRequest, callback: (err: AWSError, data: ListTrafficPoliciesResponse) -> Unit = definedExternally): Request<ListTrafficPoliciesResponse, AWSError>
    open fun listTrafficPolicies(callback: (err: AWSError, data: ListTrafficPoliciesResponse) -> Unit = definedExternally): Request<ListTrafficPoliciesResponse, AWSError>
    open fun listTrafficPolicyInstances(params: ListTrafficPolicyInstancesRequest, callback: (err: AWSError, data: ListTrafficPolicyInstancesResponse) -> Unit = definedExternally): Request<ListTrafficPolicyInstancesResponse, AWSError>
    open fun listTrafficPolicyInstances(callback: (err: AWSError, data: ListTrafficPolicyInstancesResponse) -> Unit = definedExternally): Request<ListTrafficPolicyInstancesResponse, AWSError>
    open fun listTrafficPolicyInstancesByHostedZone(params: ListTrafficPolicyInstancesByHostedZoneRequest, callback: (err: AWSError, data: ListTrafficPolicyInstancesByHostedZoneResponse) -> Unit = definedExternally): Request<ListTrafficPolicyInstancesByHostedZoneResponse, AWSError>
    open fun listTrafficPolicyInstancesByHostedZone(callback: (err: AWSError, data: ListTrafficPolicyInstancesByHostedZoneResponse) -> Unit = definedExternally): Request<ListTrafficPolicyInstancesByHostedZoneResponse, AWSError>
    open fun listTrafficPolicyInstancesByPolicy(params: ListTrafficPolicyInstancesByPolicyRequest, callback: (err: AWSError, data: ListTrafficPolicyInstancesByPolicyResponse) -> Unit = definedExternally): Request<ListTrafficPolicyInstancesByPolicyResponse, AWSError>
    open fun listTrafficPolicyInstancesByPolicy(callback: (err: AWSError, data: ListTrafficPolicyInstancesByPolicyResponse) -> Unit = definedExternally): Request<ListTrafficPolicyInstancesByPolicyResponse, AWSError>
    open fun listTrafficPolicyVersions(params: ListTrafficPolicyVersionsRequest, callback: (err: AWSError, data: ListTrafficPolicyVersionsResponse) -> Unit = definedExternally): Request<ListTrafficPolicyVersionsResponse, AWSError>
    open fun listTrafficPolicyVersions(callback: (err: AWSError, data: ListTrafficPolicyVersionsResponse) -> Unit = definedExternally): Request<ListTrafficPolicyVersionsResponse, AWSError>
    open fun listVPCAssociationAuthorizations(params: ListVPCAssociationAuthorizationsRequest, callback: (err: AWSError, data: ListVPCAssociationAuthorizationsResponse) -> Unit = definedExternally): Request<ListVPCAssociationAuthorizationsResponse, AWSError>
    open fun listVPCAssociationAuthorizations(callback: (err: AWSError, data: ListVPCAssociationAuthorizationsResponse) -> Unit = definedExternally): Request<ListVPCAssociationAuthorizationsResponse, AWSError>
    open fun testDNSAnswer(params: TestDNSAnswerRequest, callback: (err: AWSError, data: TestDNSAnswerResponse) -> Unit = definedExternally): Request<TestDNSAnswerResponse, AWSError>
    open fun testDNSAnswer(callback: (err: AWSError, data: TestDNSAnswerResponse) -> Unit = definedExternally): Request<TestDNSAnswerResponse, AWSError>
    open fun updateHealthCheck(params: UpdateHealthCheckRequest, callback: (err: AWSError, data: UpdateHealthCheckResponse) -> Unit = definedExternally): Request<UpdateHealthCheckResponse, AWSError>
    open fun updateHealthCheck(callback: (err: AWSError, data: UpdateHealthCheckResponse) -> Unit = definedExternally): Request<UpdateHealthCheckResponse, AWSError>
    open fun updateHostedZoneComment(params: UpdateHostedZoneCommentRequest, callback: (err: AWSError, data: UpdateHostedZoneCommentResponse) -> Unit = definedExternally): Request<UpdateHostedZoneCommentResponse, AWSError>
    open fun updateHostedZoneComment(callback: (err: AWSError, data: UpdateHostedZoneCommentResponse) -> Unit = definedExternally): Request<UpdateHostedZoneCommentResponse, AWSError>
    open fun updateTrafficPolicyComment(params: UpdateTrafficPolicyCommentRequest, callback: (err: AWSError, data: UpdateTrafficPolicyCommentResponse) -> Unit = definedExternally): Request<UpdateTrafficPolicyCommentResponse, AWSError>
    open fun updateTrafficPolicyComment(callback: (err: AWSError, data: UpdateTrafficPolicyCommentResponse) -> Unit = definedExternally): Request<UpdateTrafficPolicyCommentResponse, AWSError>
    open fun updateTrafficPolicyInstance(params: UpdateTrafficPolicyInstanceRequest, callback: (err: AWSError, data: UpdateTrafficPolicyInstanceResponse) -> Unit = definedExternally): Request<UpdateTrafficPolicyInstanceResponse, AWSError>
    open fun updateTrafficPolicyInstance(callback: (err: AWSError, data: UpdateTrafficPolicyInstanceResponse) -> Unit = definedExternally): Request<UpdateTrafficPolicyInstanceResponse, AWSError>
    open fun waitFor(state: String /* "resourceRecordSetsChanged" */, params: GetChangeRequest /* Route53.Types.GetChangeRequest & `T$0` */, callback: (err: AWSError, data: GetChangeResponse) -> Unit = definedExternally): Request<GetChangeResponse, AWSError>
    open fun waitFor(state: String /* "resourceRecordSetsChanged" */, callback: (err: AWSError, data: GetChangeResponse) -> Unit = definedExternally): Request<GetChangeResponse, AWSError>
    interface AccountLimit {
        var Type: String /* "MAX_HEALTH_CHECKS_BY_OWNER" | "MAX_HOSTED_ZONES_BY_OWNER" | "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER" | "MAX_REUSABLE_DELEGATION_SETS_BY_OWNER" | "MAX_TRAFFIC_POLICIES_BY_OWNER" | String */
        var Value: LimitValue
    }
    interface AlarmIdentifier {
        var Region: String /* "us-east-1" | "us-east-2" | "us-west-1" | "us-west-2" | "ca-central-1" | "eu-central-1" | "eu-west-1" | "eu-west-2" | "eu-west-3" | "ap-east-1" | "me-south-1" | "ap-south-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-northeast-1" | "ap-northeast-2" | "ap-northeast-3" | "eu-north-1" | "sa-east-1" | "cn-northwest-1" | "cn-north-1" | String */
        var Name: AlarmName
    }
    interface AliasTarget {
        var HostedZoneId: ResourceId
        var DNSName: DNSName
        var EvaluateTargetHealth: AliasHealthEnabled
    }
    interface AssociateVPCWithHostedZoneRequest {
        var HostedZoneId: ResourceId
        var VPC: VPC
        var Comment: AssociateVPCComment?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateVPCWithHostedZoneResponse {
        var ChangeInfo: ChangeInfo
    }
    interface Change {
        var Action: String /* "CREATE" | "DELETE" | "UPSERT" | String */
        var ResourceRecordSet: ResourceRecordSet
    }
    interface ChangeBatch {
        var Comment: ResourceDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Changes: Changes
    }
    interface ChangeInfo {
        var Id: ResourceId
        var Status: String /* "PENDING" | "INSYNC" | String */
        var SubmittedAt: TimeStamp
        var Comment: ResourceDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChangeResourceRecordSetsRequest {
        var HostedZoneId: ResourceId
        var ChangeBatch: ChangeBatch
    }
    interface ChangeResourceRecordSetsResponse {
        var ChangeInfo: ChangeInfo
    }
    interface ChangeTagsForResourceRequest {
        var ResourceType: String /* "healthcheck" | "hostedzone" | String */
        var ResourceId: TagResourceId
        var AddTags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var RemoveTagKeys: TagKeyList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChangeTagsForResourceResponse
    interface CloudWatchAlarmConfiguration {
        var EvaluationPeriods: EvaluationPeriods
        var Threshold: Threshold
        var ComparisonOperator: String /* "GreaterThanOrEqualToThreshold" | "GreaterThanThreshold" | "LessThanThreshold" | "LessThanOrEqualToThreshold" | String */
        var Period: Period
        var MetricName: MetricName
        var Namespace: Namespace
        var Statistic: String /* "Average" | "Sum" | "SampleCount" | "Maximum" | "Minimum" | String */
        var Dimensions: DimensionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateHealthCheckRequest {
        var CallerReference: HealthCheckNonce
        var HealthCheckConfig: HealthCheckConfig
    }
    interface CreateHealthCheckResponse {
        var HealthCheck: HealthCheck
        var Location: ResourceURI
    }
    interface CreateHostedZoneRequest {
        var Name: DNSName
        var VPC: VPC?
            get() = definedExternally
            set(value) = definedExternally
        var CallerReference: Nonce
        var HostedZoneConfig: HostedZoneConfig?
            get() = definedExternally
            set(value) = definedExternally
        var DelegationSetId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateHostedZoneResponse {
        var HostedZone: HostedZone
        var ChangeInfo: ChangeInfo
        var DelegationSet: DelegationSet
        var VPC: VPC?
            get() = definedExternally
            set(value) = definedExternally
        var Location: ResourceURI
    }
    interface CreateQueryLoggingConfigRequest {
        var HostedZoneId: ResourceId
        var CloudWatchLogsLogGroupArn: CloudWatchLogsLogGroupArn
    }
    interface CreateQueryLoggingConfigResponse {
        var QueryLoggingConfig: QueryLoggingConfig
        var Location: ResourceURI
    }
    interface CreateReusableDelegationSetRequest {
        var CallerReference: Nonce
        var HostedZoneId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateReusableDelegationSetResponse {
        var DelegationSet: DelegationSet
        var Location: ResourceURI
    }
    interface CreateTrafficPolicyInstanceRequest {
        var HostedZoneId: ResourceId
        var Name: DNSName
        var TTL: TTL
        var TrafficPolicyId: TrafficPolicyId
        var TrafficPolicyVersion: TrafficPolicyVersion
    }
    interface CreateTrafficPolicyInstanceResponse {
        var TrafficPolicyInstance: TrafficPolicyInstance
        var Location: ResourceURI
    }
    interface CreateTrafficPolicyRequest {
        var Name: TrafficPolicyName
        var Document: TrafficPolicyDocument
        var Comment: TrafficPolicyComment?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTrafficPolicyResponse {
        var TrafficPolicy: TrafficPolicy
        var Location: ResourceURI
    }
    interface CreateTrafficPolicyVersionRequest {
        var Id: TrafficPolicyId
        var Document: TrafficPolicyDocument
        var Comment: TrafficPolicyComment?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTrafficPolicyVersionResponse {
        var TrafficPolicy: TrafficPolicy
        var Location: ResourceURI
    }
    interface CreateVPCAssociationAuthorizationRequest {
        var HostedZoneId: ResourceId
        var VPC: VPC
    }
    interface CreateVPCAssociationAuthorizationResponse {
        var HostedZoneId: ResourceId
        var VPC: VPC
    }
    interface DelegationSet {
        var Id: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var CallerReference: Nonce?
            get() = definedExternally
            set(value) = definedExternally
        var NameServers: DelegationSetNameServers
    }
    interface DeleteHealthCheckRequest {
        var HealthCheckId: HealthCheckId
    }
    interface DeleteHealthCheckResponse
    interface DeleteHostedZoneRequest {
        var Id: ResourceId
    }
    interface DeleteHostedZoneResponse {
        var ChangeInfo: ChangeInfo
    }
    interface DeleteQueryLoggingConfigRequest {
        var Id: QueryLoggingConfigId
    }
    interface DeleteQueryLoggingConfigResponse
    interface DeleteReusableDelegationSetRequest {
        var Id: ResourceId
    }
    interface DeleteReusableDelegationSetResponse
    interface DeleteTrafficPolicyInstanceRequest {
        var Id: TrafficPolicyInstanceId
    }
    interface DeleteTrafficPolicyInstanceResponse
    interface DeleteTrafficPolicyRequest {
        var Id: TrafficPolicyId
        var Version: TrafficPolicyVersion
    }
    interface DeleteTrafficPolicyResponse
    interface DeleteVPCAssociationAuthorizationRequest {
        var HostedZoneId: ResourceId
        var VPC: VPC
    }
    interface DeleteVPCAssociationAuthorizationResponse
    interface Dimension {
        var Name: DimensionField
        var Value: DimensionField
    }
    interface DisassociateVPCFromHostedZoneRequest {
        var HostedZoneId: ResourceId
        var VPC: VPC
        var Comment: DisassociateVPCComment?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateVPCFromHostedZoneResponse {
        var ChangeInfo: ChangeInfo
    }
    interface GeoLocation {
        var ContinentCode: GeoLocationContinentCode?
            get() = definedExternally
            set(value) = definedExternally
        var CountryCode: GeoLocationCountryCode?
            get() = definedExternally
            set(value) = definedExternally
        var SubdivisionCode: GeoLocationSubdivisionCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GeoLocationDetails {
        var ContinentCode: GeoLocationContinentCode?
            get() = definedExternally
            set(value) = definedExternally
        var ContinentName: GeoLocationContinentName?
            get() = definedExternally
            set(value) = definedExternally
        var CountryCode: GeoLocationCountryCode?
            get() = definedExternally
            set(value) = definedExternally
        var CountryName: GeoLocationCountryName?
            get() = definedExternally
            set(value) = definedExternally
        var SubdivisionCode: GeoLocationSubdivisionCode?
            get() = definedExternally
            set(value) = definedExternally
        var SubdivisionName: GeoLocationSubdivisionName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAccountLimitRequest {
        var Type: String /* "MAX_HEALTH_CHECKS_BY_OWNER" | "MAX_HOSTED_ZONES_BY_OWNER" | "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER" | "MAX_REUSABLE_DELEGATION_SETS_BY_OWNER" | "MAX_TRAFFIC_POLICIES_BY_OWNER" | String */
    }
    interface GetAccountLimitResponse {
        var Limit: AccountLimit
        var Count: UsageCount
    }
    interface GetChangeRequest {
        var Id: ResourceId
    }
    interface GetChangeResponse {
        var ChangeInfo: ChangeInfo
    }
    interface GetCheckerIpRangesRequest
    interface GetCheckerIpRangesResponse {
        var CheckerIpRanges: CheckerIpRanges
    }
    interface GetGeoLocationRequest {
        var ContinentCode: GeoLocationContinentCode?
            get() = definedExternally
            set(value) = definedExternally
        var CountryCode: GeoLocationCountryCode?
            get() = definedExternally
            set(value) = definedExternally
        var SubdivisionCode: GeoLocationSubdivisionCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetGeoLocationResponse {
        var GeoLocationDetails: GeoLocationDetails
    }
    interface GetHealthCheckCountRequest
    interface GetHealthCheckCountResponse {
        var HealthCheckCount: HealthCheckCount
    }
    interface GetHealthCheckLastFailureReasonRequest {
        var HealthCheckId: HealthCheckId
    }
    interface GetHealthCheckLastFailureReasonResponse {
        var HealthCheckObservations: HealthCheckObservations
    }
    interface GetHealthCheckRequest {
        var HealthCheckId: HealthCheckId
    }
    interface GetHealthCheckResponse {
        var HealthCheck: HealthCheck
    }
    interface GetHealthCheckStatusRequest {
        var HealthCheckId: HealthCheckId
    }
    interface GetHealthCheckStatusResponse {
        var HealthCheckObservations: HealthCheckObservations
    }
    interface GetHostedZoneCountRequest
    interface GetHostedZoneCountResponse {
        var HostedZoneCount: HostedZoneCount
    }
    interface GetHostedZoneLimitRequest {
        var Type: String /* "MAX_RRSETS_BY_ZONE" | "MAX_VPCS_ASSOCIATED_BY_ZONE" | String */
        var HostedZoneId: ResourceId
    }
    interface GetHostedZoneLimitResponse {
        var Limit: HostedZoneLimit
        var Count: UsageCount
    }
    interface GetHostedZoneRequest {
        var Id: ResourceId
    }
    interface GetHostedZoneResponse {
        var HostedZone: HostedZone
        var DelegationSet: DelegationSet?
            get() = definedExternally
            set(value) = definedExternally
        var VPCs: VPCs?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetQueryLoggingConfigRequest {
        var Id: QueryLoggingConfigId
    }
    interface GetQueryLoggingConfigResponse {
        var QueryLoggingConfig: QueryLoggingConfig
    }
    interface GetReusableDelegationSetLimitRequest {
        var Type: String /* "MAX_ZONES_BY_REUSABLE_DELEGATION_SET" | String */
        var DelegationSetId: ResourceId
    }
    interface GetReusableDelegationSetLimitResponse {
        var Limit: ReusableDelegationSetLimit
        var Count: UsageCount
    }
    interface GetReusableDelegationSetRequest {
        var Id: ResourceId
    }
    interface GetReusableDelegationSetResponse {
        var DelegationSet: DelegationSet
    }
    interface GetTrafficPolicyInstanceCountRequest
    interface GetTrafficPolicyInstanceCountResponse {
        var TrafficPolicyInstanceCount: TrafficPolicyInstanceCount
    }
    interface GetTrafficPolicyInstanceRequest {
        var Id: TrafficPolicyInstanceId
    }
    interface GetTrafficPolicyInstanceResponse {
        var TrafficPolicyInstance: TrafficPolicyInstance
    }
    interface GetTrafficPolicyRequest {
        var Id: TrafficPolicyId
        var Version: TrafficPolicyVersion
    }
    interface GetTrafficPolicyResponse {
        var TrafficPolicy: TrafficPolicy
    }
    interface HealthCheck {
        var Id: HealthCheckId
        var CallerReference: HealthCheckNonce
        var LinkedService: LinkedService?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckConfig: HealthCheckConfig
        var HealthCheckVersion: HealthCheckVersion
        var CloudWatchAlarmConfiguration: CloudWatchAlarmConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HealthCheckConfig {
        var IPAddress: IPAddress?
            get() = definedExternally
            set(value) = definedExternally
        var Port: Port?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "HTTP" | "HTTPS" | "HTTP_STR_MATCH" | "HTTPS_STR_MATCH" | "TCP" | "CALCULATED" | "CLOUDWATCH_METRIC" | String */
        var ResourcePath: ResourcePath?
            get() = definedExternally
            set(value) = definedExternally
        var FullyQualifiedDomainName: FullyQualifiedDomainName?
            get() = definedExternally
            set(value) = definedExternally
        var SearchString: SearchString?
            get() = definedExternally
            set(value) = definedExternally
        var RequestInterval: RequestInterval?
            get() = definedExternally
            set(value) = definedExternally
        var FailureThreshold: FailureThreshold?
            get() = definedExternally
            set(value) = definedExternally
        var MeasureLatency: MeasureLatency?
            get() = definedExternally
            set(value) = definedExternally
        var Inverted: Inverted?
            get() = definedExternally
            set(value) = definedExternally
        var Disabled: Disabled?
            get() = definedExternally
            set(value) = definedExternally
        var HealthThreshold: HealthThreshold?
            get() = definedExternally
            set(value) = definedExternally
        var ChildHealthChecks: ChildHealthCheckList?
            get() = definedExternally
            set(value) = definedExternally
        var EnableSNI: EnableSNI?
            get() = definedExternally
            set(value) = definedExternally
        var Regions: HealthCheckRegionList?
            get() = definedExternally
            set(value) = definedExternally
        var AlarmIdentifier: AlarmIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var InsufficientDataHealthStatus: String /* "Healthy" | "Unhealthy" | "LastKnownStatus" | String */
    }
    interface HealthCheckObservation {
        var Region: String /* "us-east-1" | "us-west-1" | "us-west-2" | "eu-west-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-northeast-1" | "sa-east-1" | String */
        var IPAddress: IPAddress?
            get() = definedExternally
            set(value) = definedExternally
        var StatusReport: StatusReport?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HostedZone {
        var Id: ResourceId
        var Name: DNSName
        var CallerReference: Nonce
        var Config: HostedZoneConfig?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceRecordSetCount: HostedZoneRRSetCount?
            get() = definedExternally
            set(value) = definedExternally
        var LinkedService: LinkedService?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HostedZoneConfig {
        var Comment: ResourceDescription?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateZone: IsPrivateZone?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HostedZoneLimit {
        var Type: String /* "MAX_RRSETS_BY_ZONE" | "MAX_VPCS_ASSOCIATED_BY_ZONE" | String */
        var Value: LimitValue
    }
    interface LinkedService {
        var ServicePrincipal: ServicePrincipal?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ResourceDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGeoLocationsRequest {
        var StartContinentCode: GeoLocationContinentCode?
            get() = definedExternally
            set(value) = definedExternally
        var StartCountryCode: GeoLocationCountryCode?
            get() = definedExternally
            set(value) = definedExternally
        var StartSubdivisionCode: GeoLocationSubdivisionCode?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: PageMaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGeoLocationsResponse {
        var GeoLocationDetailsList: GeoLocationDetailsList
        var IsTruncated: PageTruncated
        var NextContinentCode: GeoLocationContinentCode?
            get() = definedExternally
            set(value) = definedExternally
        var NextCountryCode: GeoLocationCountryCode?
            get() = definedExternally
            set(value) = definedExternally
        var NextSubdivisionCode: GeoLocationSubdivisionCode?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: PageMaxItems
    }
    interface ListHealthChecksRequest {
        var Marker: PageMarker?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: PageMaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHealthChecksResponse {
        var HealthChecks: HealthChecks
        var Marker: PageMarker
        var IsTruncated: PageTruncated
        var NextMarker: PageMarker?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: PageMaxItems
    }
    interface ListHostedZonesByNameRequest {
        var DNSName: DNSName?
            get() = definedExternally
            set(value) = definedExternally
        var HostedZoneId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: PageMaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHostedZonesByNameResponse {
        var HostedZones: HostedZones
        var DNSName: DNSName?
            get() = definedExternally
            set(value) = definedExternally
        var HostedZoneId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var IsTruncated: PageTruncated
        var NextDNSName: DNSName?
            get() = definedExternally
            set(value) = definedExternally
        var NextHostedZoneId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: PageMaxItems
    }
    interface ListHostedZonesRequest {
        var Marker: PageMarker?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: PageMaxItems?
            get() = definedExternally
            set(value) = definedExternally
        var DelegationSetId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHostedZonesResponse {
        var HostedZones: HostedZones
        var Marker: PageMarker
        var IsTruncated: PageTruncated
        var NextMarker: PageMarker?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: PageMaxItems
    }
    interface ListQueryLoggingConfigsRequest {
        var HostedZoneId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListQueryLoggingConfigsResponse {
        var QueryLoggingConfigs: QueryLoggingConfigs
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourceRecordSetsRequest {
        var HostedZoneId: ResourceId
        var StartRecordName: DNSName?
            get() = definedExternally
            set(value) = definedExternally
        var StartRecordType: String /* "SOA" | "A" | "TXT" | "NS" | "CNAME" | "MX" | "NAPTR" | "PTR" | "SRV" | "SPF" | "AAAA" | "CAA" | String */
        var StartRecordIdentifier: ResourceRecordSetIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: PageMaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourceRecordSetsResponse {
        var ResourceRecordSets: ResourceRecordSets
        var IsTruncated: PageTruncated
        var NextRecordName: DNSName?
            get() = definedExternally
            set(value) = definedExternally
        var NextRecordType: String /* "SOA" | "A" | "TXT" | "NS" | "CNAME" | "MX" | "NAPTR" | "PTR" | "SRV" | "SPF" | "AAAA" | "CAA" | String */
        var NextRecordIdentifier: ResourceRecordSetIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: PageMaxItems
    }
    interface ListReusableDelegationSetsRequest {
        var Marker: PageMarker?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: PageMaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListReusableDelegationSetsResponse {
        var DelegationSets: DelegationSets
        var Marker: PageMarker
        var IsTruncated: PageTruncated
        var NextMarker: PageMarker?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: PageMaxItems
    }
    interface ListTagsForResourceRequest {
        var ResourceType: String /* "healthcheck" | "hostedzone" | String */
        var ResourceId: TagResourceId
    }
    interface ListTagsForResourceResponse {
        var ResourceTagSet: ResourceTagSet
    }
    interface ListTagsForResourcesRequest {
        var ResourceType: String /* "healthcheck" | "hostedzone" | String */
        var ResourceIds: TagResourceIdList
    }
    interface ListTagsForResourcesResponse {
        var ResourceTagSets: ResourceTagSetList
    }
    interface ListTrafficPoliciesRequest {
        var TrafficPolicyIdMarker: TrafficPolicyId?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: PageMaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTrafficPoliciesResponse {
        var TrafficPolicySummaries: TrafficPolicySummaries
        var IsTruncated: PageTruncated
        var TrafficPolicyIdMarker: TrafficPolicyId
        var MaxItems: PageMaxItems
    }
    interface ListTrafficPolicyInstancesByHostedZoneRequest {
        var HostedZoneId: ResourceId
        var TrafficPolicyInstanceNameMarker: DNSName?
            get() = definedExternally
            set(value) = definedExternally
        var TrafficPolicyInstanceTypeMarker: String /* "SOA" | "A" | "TXT" | "NS" | "CNAME" | "MX" | "NAPTR" | "PTR" | "SRV" | "SPF" | "AAAA" | "CAA" | String */
        var MaxItems: PageMaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTrafficPolicyInstancesByHostedZoneResponse {
        var TrafficPolicyInstances: TrafficPolicyInstances
        var TrafficPolicyInstanceNameMarker: DNSName?
            get() = definedExternally
            set(value) = definedExternally
        var TrafficPolicyInstanceTypeMarker: String /* "SOA" | "A" | "TXT" | "NS" | "CNAME" | "MX" | "NAPTR" | "PTR" | "SRV" | "SPF" | "AAAA" | "CAA" | String */
        var IsTruncated: PageTruncated
        var MaxItems: PageMaxItems
    }
    interface ListTrafficPolicyInstancesByPolicyRequest {
        var TrafficPolicyId: TrafficPolicyId
        var TrafficPolicyVersion: TrafficPolicyVersion
        var HostedZoneIdMarker: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var TrafficPolicyInstanceNameMarker: DNSName?
            get() = definedExternally
            set(value) = definedExternally
        var TrafficPolicyInstanceTypeMarker: String /* "SOA" | "A" | "TXT" | "NS" | "CNAME" | "MX" | "NAPTR" | "PTR" | "SRV" | "SPF" | "AAAA" | "CAA" | String */
        var MaxItems: PageMaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTrafficPolicyInstancesByPolicyResponse {
        var TrafficPolicyInstances: TrafficPolicyInstances
        var HostedZoneIdMarker: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var TrafficPolicyInstanceNameMarker: DNSName?
            get() = definedExternally
            set(value) = definedExternally
        var TrafficPolicyInstanceTypeMarker: String /* "SOA" | "A" | "TXT" | "NS" | "CNAME" | "MX" | "NAPTR" | "PTR" | "SRV" | "SPF" | "AAAA" | "CAA" | String */
        var IsTruncated: PageTruncated
        var MaxItems: PageMaxItems
    }
    interface ListTrafficPolicyInstancesRequest {
        var HostedZoneIdMarker: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var TrafficPolicyInstanceNameMarker: DNSName?
            get() = definedExternally
            set(value) = definedExternally
        var TrafficPolicyInstanceTypeMarker: String /* "SOA" | "A" | "TXT" | "NS" | "CNAME" | "MX" | "NAPTR" | "PTR" | "SRV" | "SPF" | "AAAA" | "CAA" | String */
        var MaxItems: PageMaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTrafficPolicyInstancesResponse {
        var TrafficPolicyInstances: TrafficPolicyInstances
        var HostedZoneIdMarker: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var TrafficPolicyInstanceNameMarker: DNSName?
            get() = definedExternally
            set(value) = definedExternally
        var TrafficPolicyInstanceTypeMarker: String /* "SOA" | "A" | "TXT" | "NS" | "CNAME" | "MX" | "NAPTR" | "PTR" | "SRV" | "SPF" | "AAAA" | "CAA" | String */
        var IsTruncated: PageTruncated
        var MaxItems: PageMaxItems
    }
    interface ListTrafficPolicyVersionsRequest {
        var Id: TrafficPolicyId
        var TrafficPolicyVersionMarker: TrafficPolicyVersionMarker?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: PageMaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTrafficPolicyVersionsResponse {
        var TrafficPolicies: TrafficPolicies
        var IsTruncated: PageTruncated
        var TrafficPolicyVersionMarker: TrafficPolicyVersionMarker
        var MaxItems: PageMaxItems
    }
    interface ListVPCAssociationAuthorizationsRequest {
        var HostedZoneId: ResourceId
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVPCAssociationAuthorizationsResponse {
        var HostedZoneId: ResourceId
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var VPCs: VPCs
    }
    interface QueryLoggingConfig {
        var Id: QueryLoggingConfigId
        var HostedZoneId: ResourceId
        var CloudWatchLogsLogGroupArn: CloudWatchLogsLogGroupArn
    }
    interface ResourceRecord {
        var Value: RData
    }
    interface ResourceRecordSet {
        var Name: DNSName
        var Type: String /* "SOA" | "A" | "TXT" | "NS" | "CNAME" | "MX" | "NAPTR" | "PTR" | "SRV" | "SPF" | "AAAA" | "CAA" | String */
        var SetIdentifier: ResourceRecordSetIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var Weight: ResourceRecordSetWeight?
            get() = definedExternally
            set(value) = definedExternally
        var Region: String /* "us-east-1" | "us-east-2" | "us-west-1" | "us-west-2" | "ca-central-1" | "eu-west-1" | "eu-west-2" | "eu-west-3" | "eu-central-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-northeast-1" | "ap-northeast-2" | "ap-northeast-3" | "eu-north-1" | "sa-east-1" | "cn-north-1" | "cn-northwest-1" | "ap-east-1" | "me-south-1" | "ap-south-1" | String */
        var GeoLocation: GeoLocation?
            get() = definedExternally
            set(value) = definedExternally
        var Failover: String /* "PRIMARY" | "SECONDARY" | String */
        var MultiValueAnswer: ResourceRecordSetMultiValueAnswer?
            get() = definedExternally
            set(value) = definedExternally
        var TTL: TTL?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceRecords: ResourceRecords?
            get() = definedExternally
            set(value) = definedExternally
        var AliasTarget: AliasTarget?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckId: HealthCheckId?
            get() = definedExternally
            set(value) = definedExternally
        var TrafficPolicyInstanceId: TrafficPolicyInstanceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceTagSet {
        var ResourceType: String /* "healthcheck" | "hostedzone" | String */
        var ResourceId: TagResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReusableDelegationSetLimit {
        var Type: String /* "MAX_ZONES_BY_REUSABLE_DELEGATION_SET" | String */
        var Value: LimitValue
    }
    interface StatusReport {
        var Status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var CheckedTime: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var Value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestDNSAnswerRequest {
        var HostedZoneId: ResourceId
        var RecordName: DNSName
        var RecordType: String /* "SOA" | "A" | "TXT" | "NS" | "CNAME" | "MX" | "NAPTR" | "PTR" | "SRV" | "SPF" | "AAAA" | "CAA" | String */
        var ResolverIP: IPAddress?
            get() = definedExternally
            set(value) = definedExternally
        var EDNS0ClientSubnetIP: IPAddress?
            get() = definedExternally
            set(value) = definedExternally
        var EDNS0ClientSubnetMask: SubnetMask?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestDNSAnswerResponse {
        var Nameserver: Nameserver
        var RecordName: DNSName
        var RecordType: String /* "SOA" | "A" | "TXT" | "NS" | "CNAME" | "MX" | "NAPTR" | "PTR" | "SRV" | "SPF" | "AAAA" | "CAA" | String */
        var RecordData: RecordData
        var ResponseCode: DNSRCode
        var Protocol: TransportProtocol
    }
    interface TrafficPolicy {
        var Id: TrafficPolicyId
        var Version: TrafficPolicyVersion
        var Name: TrafficPolicyName
        var Type: String /* "SOA" | "A" | "TXT" | "NS" | "CNAME" | "MX" | "NAPTR" | "PTR" | "SRV" | "SPF" | "AAAA" | "CAA" | String */
        var Document: TrafficPolicyDocument
        var Comment: TrafficPolicyComment?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrafficPolicyInstance {
        var Id: TrafficPolicyInstanceId
        var HostedZoneId: ResourceId
        var Name: DNSName
        var TTL: TTL
        var State: TrafficPolicyInstanceState
        var Message: Message
        var TrafficPolicyId: TrafficPolicyId
        var TrafficPolicyVersion: TrafficPolicyVersion
        var TrafficPolicyType: String /* "SOA" | "A" | "TXT" | "NS" | "CNAME" | "MX" | "NAPTR" | "PTR" | "SRV" | "SPF" | "AAAA" | "CAA" | String */
    }
    interface TrafficPolicySummary {
        var Id: TrafficPolicyId
        var Name: TrafficPolicyName
        var Type: String /* "SOA" | "A" | "TXT" | "NS" | "CNAME" | "MX" | "NAPTR" | "PTR" | "SRV" | "SPF" | "AAAA" | "CAA" | String */
        var LatestVersion: TrafficPolicyVersion
        var TrafficPolicyCount: TrafficPolicyVersion
    }
    interface UpdateHealthCheckRequest {
        var HealthCheckId: HealthCheckId
        var HealthCheckVersion: HealthCheckVersion?
            get() = definedExternally
            set(value) = definedExternally
        var IPAddress: IPAddress?
            get() = definedExternally
            set(value) = definedExternally
        var Port: Port?
            get() = definedExternally
            set(value) = definedExternally
        var ResourcePath: ResourcePath?
            get() = definedExternally
            set(value) = definedExternally
        var FullyQualifiedDomainName: FullyQualifiedDomainName?
            get() = definedExternally
            set(value) = definedExternally
        var SearchString: SearchString?
            get() = definedExternally
            set(value) = definedExternally
        var FailureThreshold: FailureThreshold?
            get() = definedExternally
            set(value) = definedExternally
        var Inverted: Inverted?
            get() = definedExternally
            set(value) = definedExternally
        var Disabled: Disabled?
            get() = definedExternally
            set(value) = definedExternally
        var HealthThreshold: HealthThreshold?
            get() = definedExternally
            set(value) = definedExternally
        var ChildHealthChecks: ChildHealthCheckList?
            get() = definedExternally
            set(value) = definedExternally
        var EnableSNI: EnableSNI?
            get() = definedExternally
            set(value) = definedExternally
        var Regions: HealthCheckRegionList?
            get() = definedExternally
            set(value) = definedExternally
        var AlarmIdentifier: AlarmIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var InsufficientDataHealthStatus: String /* "Healthy" | "Unhealthy" | "LastKnownStatus" | String */
        var ResetElements: ResettableElementNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateHealthCheckResponse {
        var HealthCheck: HealthCheck
    }
    interface UpdateHostedZoneCommentRequest {
        var Id: ResourceId
        var Comment: ResourceDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateHostedZoneCommentResponse {
        var HostedZone: HostedZone
    }
    interface UpdateTrafficPolicyCommentRequest {
        var Id: TrafficPolicyId
        var Version: TrafficPolicyVersion
        var Comment: TrafficPolicyComment
    }
    interface UpdateTrafficPolicyCommentResponse {
        var TrafficPolicy: TrafficPolicy
    }
    interface UpdateTrafficPolicyInstanceRequest {
        var Id: TrafficPolicyInstanceId
        var TTL: TTL
        var TrafficPolicyId: TrafficPolicyId
        var TrafficPolicyVersion: TrafficPolicyVersion
    }
    interface UpdateTrafficPolicyInstanceResponse {
        var TrafficPolicyInstance: TrafficPolicyInstance
    }
    interface VPC {
        var VPCRegion: String /* "us-east-1" | "us-east-2" | "us-west-1" | "us-west-2" | "eu-west-1" | "eu-west-2" | "eu-west-3" | "eu-central-1" | "ap-east-1" | "me-south-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-south-1" | "ap-northeast-1" | "ap-northeast-2" | "ap-northeast-3" | "eu-north-1" | "sa-east-1" | "ca-central-1" | "cn-north-1" | String */
        var VPCId: VPCId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2013-04-01" | "latest" | String */
    }
}