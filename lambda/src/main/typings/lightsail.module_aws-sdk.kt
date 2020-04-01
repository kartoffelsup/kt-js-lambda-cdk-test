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
import Lightsail.AddOn
import Lightsail.AddOnRequest
import Lightsail.Alarm
import Lightsail.AttachedDisk
import Lightsail.AutoSnapshotDetails
import Lightsail.AvailabilityZone
import Lightsail.Blueprint
import Lightsail.Bundle
import Lightsail.CloudFormationStackRecord
import Lightsail.CloudFormationStackRecordSourceInfo
import Lightsail.ContactMethod
import Lightsail.DiskInfo
import Lightsail.Disk
import Lightsail.DiskMap
import Lightsail.DiskSnapshot
import Lightsail.DomainEntry
import Lightsail.Domain
import Lightsail.ExportSnapshotRecord
import Lightsail.HostKeyAttributes
import Lightsail.InstanceEntry
import Lightsail.InstanceHealthSummary
import Lightsail.Instance
import Lightsail.InstancePortInfo
import Lightsail.InstancePortState
import Lightsail.InstanceSnapshot
import Lightsail.KeyPair
import Lightsail.LoadBalancer
import Lightsail.LoadBalancerTlsCertificateDomainValidationOption
import Lightsail.LoadBalancerTlsCertificateDomainValidationRecord
import Lightsail.LoadBalancerTlsCertificate
import Lightsail.LoadBalancerTlsCertificateSummary
import Lightsail.LogEvent
import Lightsail.MetricDatapoint
import Lightsail.Operation
import Lightsail.PendingMaintenanceAction
import Lightsail.PortInfo
import Lightsail.Region
import Lightsail.RelationalDatabaseBlueprint
import Lightsail.RelationalDatabaseBundle
import Lightsail.RelationalDatabaseEvent
import Lightsail.RelationalDatabase
import Lightsail.RelationalDatabaseParameter
import Lightsail.RelationalDatabaseSnapshot
import Lightsail.StaticIp
import Lightsail.Tag
import Lightsail.AllocateStaticIpRequest
import Lightsail.AllocateStaticIpResult
import Lightsail.AttachDiskRequest
import Lightsail.AttachDiskResult
import Lightsail.AttachInstancesToLoadBalancerRequest
import Lightsail.AttachInstancesToLoadBalancerResult
import Lightsail.AttachLoadBalancerTlsCertificateRequest
import Lightsail.AttachLoadBalancerTlsCertificateResult
import Lightsail.AttachStaticIpRequest
import Lightsail.AttachStaticIpResult
import Lightsail.CloseInstancePublicPortsRequest
import Lightsail.CloseInstancePublicPortsResult
import Lightsail.CopySnapshotRequest
import Lightsail.CopySnapshotResult
import Lightsail.CreateCloudFormationStackRequest
import Lightsail.CreateCloudFormationStackResult
import Lightsail.CreateContactMethodRequest
import Lightsail.CreateContactMethodResult
import Lightsail.CreateDiskRequest
import Lightsail.CreateDiskResult
import Lightsail.CreateDiskFromSnapshotRequest
import Lightsail.CreateDiskFromSnapshotResult
import Lightsail.CreateDiskSnapshotRequest
import Lightsail.CreateDiskSnapshotResult
import Lightsail.CreateDomainRequest
import Lightsail.CreateDomainResult
import Lightsail.CreateDomainEntryRequest
import Lightsail.CreateDomainEntryResult
import Lightsail.CreateInstanceSnapshotRequest
import Lightsail.CreateInstanceSnapshotResult
import Lightsail.CreateInstancesRequest
import Lightsail.CreateInstancesResult
import Lightsail.CreateInstancesFromSnapshotRequest
import Lightsail.CreateInstancesFromSnapshotResult
import Lightsail.CreateKeyPairRequest
import Lightsail.CreateKeyPairResult
import Lightsail.CreateLoadBalancerRequest
import Lightsail.CreateLoadBalancerResult
import Lightsail.CreateLoadBalancerTlsCertificateRequest
import Lightsail.CreateLoadBalancerTlsCertificateResult
import Lightsail.CreateRelationalDatabaseRequest
import Lightsail.CreateRelationalDatabaseResult
import Lightsail.CreateRelationalDatabaseFromSnapshotRequest
import Lightsail.CreateRelationalDatabaseFromSnapshotResult
import Lightsail.CreateRelationalDatabaseSnapshotRequest
import Lightsail.CreateRelationalDatabaseSnapshotResult
import Lightsail.DeleteAlarmRequest
import Lightsail.DeleteAlarmResult
import Lightsail.DeleteAutoSnapshotRequest
import Lightsail.DeleteAutoSnapshotResult
import Lightsail.DeleteContactMethodRequest
import Lightsail.DeleteContactMethodResult
import Lightsail.DeleteDiskRequest
import Lightsail.DeleteDiskResult
import Lightsail.DeleteDiskSnapshotRequest
import Lightsail.DeleteDiskSnapshotResult
import Lightsail.DeleteDomainRequest
import Lightsail.DeleteDomainResult
import Lightsail.DeleteDomainEntryRequest
import Lightsail.DeleteDomainEntryResult
import Lightsail.DeleteInstanceRequest
import Lightsail.DeleteInstanceResult
import Lightsail.DeleteInstanceSnapshotRequest
import Lightsail.DeleteInstanceSnapshotResult
import Lightsail.DeleteKeyPairRequest
import Lightsail.DeleteKeyPairResult
import Lightsail.DeleteKnownHostKeysRequest
import Lightsail.DeleteKnownHostKeysResult
import Lightsail.DeleteLoadBalancerRequest
import Lightsail.DeleteLoadBalancerResult
import Lightsail.DeleteLoadBalancerTlsCertificateRequest
import Lightsail.DeleteLoadBalancerTlsCertificateResult
import Lightsail.DeleteRelationalDatabaseRequest
import Lightsail.DeleteRelationalDatabaseResult
import Lightsail.DeleteRelationalDatabaseSnapshotRequest
import Lightsail.DeleteRelationalDatabaseSnapshotResult
import Lightsail.DetachDiskRequest
import Lightsail.DetachDiskResult
import Lightsail.DetachInstancesFromLoadBalancerRequest
import Lightsail.DetachInstancesFromLoadBalancerResult
import Lightsail.DetachStaticIpRequest
import Lightsail.DetachStaticIpResult
import Lightsail.DisableAddOnRequest
import Lightsail.DisableAddOnResult
import Lightsail.DownloadDefaultKeyPairRequest
import Lightsail.DownloadDefaultKeyPairResult
import Lightsail.EnableAddOnRequest
import Lightsail.EnableAddOnResult
import Lightsail.ExportSnapshotRequest
import Lightsail.ExportSnapshotResult
import Lightsail.GetActiveNamesRequest
import Lightsail.GetActiveNamesResult
import Lightsail.GetAlarmsRequest
import Lightsail.GetAlarmsResult
import Lightsail.GetAutoSnapshotsRequest
import Lightsail.GetAutoSnapshotsResult
import Lightsail.GetBlueprintsRequest
import Lightsail.GetBlueprintsResult
import Lightsail.GetBundlesRequest
import Lightsail.GetBundlesResult
import Lightsail.GetCloudFormationStackRecordsRequest
import Lightsail.GetCloudFormationStackRecordsResult
import Lightsail.GetContactMethodsRequest
import Lightsail.GetContactMethodsResult
import Lightsail.GetDiskRequest
import Lightsail.GetDiskResult
import Lightsail.GetDiskSnapshotRequest
import Lightsail.GetDiskSnapshotResult
import Lightsail.GetDiskSnapshotsRequest
import Lightsail.GetDiskSnapshotsResult
import Lightsail.GetDisksRequest
import Lightsail.GetDisksResult
import Lightsail.GetDomainRequest
import Lightsail.GetDomainResult
import Lightsail.GetDomainsRequest
import Lightsail.GetDomainsResult
import Lightsail.GetExportSnapshotRecordsRequest
import Lightsail.GetExportSnapshotRecordsResult
import Lightsail.GetInstanceRequest
import Lightsail.GetInstanceResult
import Lightsail.GetInstanceAccessDetailsRequest
import Lightsail.GetInstanceAccessDetailsResult
import Lightsail.GetInstanceMetricDataRequest
import Lightsail.GetInstanceMetricDataResult
import Lightsail.GetInstancePortStatesRequest
import Lightsail.GetInstancePortStatesResult
import Lightsail.GetInstanceSnapshotRequest
import Lightsail.GetInstanceSnapshotResult
import Lightsail.GetInstanceSnapshotsRequest
import Lightsail.GetInstanceSnapshotsResult
import Lightsail.GetInstanceStateRequest
import Lightsail.GetInstanceStateResult
import Lightsail.GetInstancesRequest
import Lightsail.GetInstancesResult
import Lightsail.GetKeyPairRequest
import Lightsail.GetKeyPairResult
import Lightsail.GetKeyPairsRequest
import Lightsail.GetKeyPairsResult
import Lightsail.GetLoadBalancerRequest
import Lightsail.GetLoadBalancerResult
import Lightsail.GetLoadBalancerMetricDataRequest
import Lightsail.GetLoadBalancerMetricDataResult
import Lightsail.GetLoadBalancerTlsCertificatesRequest
import Lightsail.GetLoadBalancerTlsCertificatesResult
import Lightsail.GetLoadBalancersRequest
import Lightsail.GetLoadBalancersResult
import Lightsail.GetOperationRequest
import Lightsail.GetOperationResult
import Lightsail.GetOperationsRequest
import Lightsail.GetOperationsResult
import Lightsail.GetOperationsForResourceRequest
import Lightsail.GetOperationsForResourceResult
import Lightsail.GetRegionsRequest
import Lightsail.GetRegionsResult
import Lightsail.GetRelationalDatabaseRequest
import Lightsail.GetRelationalDatabaseResult
import Lightsail.GetRelationalDatabaseBlueprintsRequest
import Lightsail.GetRelationalDatabaseBlueprintsResult
import Lightsail.GetRelationalDatabaseBundlesRequest
import Lightsail.GetRelationalDatabaseBundlesResult
import Lightsail.GetRelationalDatabaseEventsRequest
import Lightsail.GetRelationalDatabaseEventsResult
import Lightsail.GetRelationalDatabaseLogEventsRequest
import Lightsail.GetRelationalDatabaseLogEventsResult
import Lightsail.GetRelationalDatabaseLogStreamsRequest
import Lightsail.GetRelationalDatabaseLogStreamsResult
import Lightsail.GetRelationalDatabaseMasterUserPasswordRequest
import Lightsail.GetRelationalDatabaseMasterUserPasswordResult
import Lightsail.GetRelationalDatabaseMetricDataRequest
import Lightsail.GetRelationalDatabaseMetricDataResult
import Lightsail.GetRelationalDatabaseParametersRequest
import Lightsail.GetRelationalDatabaseParametersResult
import Lightsail.GetRelationalDatabaseSnapshotRequest
import Lightsail.GetRelationalDatabaseSnapshotResult
import Lightsail.GetRelationalDatabaseSnapshotsRequest
import Lightsail.GetRelationalDatabaseSnapshotsResult
import Lightsail.GetRelationalDatabasesRequest
import Lightsail.GetRelationalDatabasesResult
import Lightsail.GetStaticIpRequest
import Lightsail.GetStaticIpResult
import Lightsail.GetStaticIpsRequest
import Lightsail.GetStaticIpsResult
import Lightsail.ImportKeyPairRequest
import Lightsail.ImportKeyPairResult
import Lightsail.IsVpcPeeredRequest
import Lightsail.IsVpcPeeredResult
import Lightsail.OpenInstancePublicPortsRequest
import Lightsail.OpenInstancePublicPortsResult
import Lightsail.PeerVpcRequest
import Lightsail.PeerVpcResult
import Lightsail.PutAlarmRequest
import Lightsail.PutAlarmResult
import Lightsail.PutInstancePublicPortsRequest
import Lightsail.PutInstancePublicPortsResult
import Lightsail.RebootInstanceRequest
import Lightsail.RebootInstanceResult
import Lightsail.RebootRelationalDatabaseRequest
import Lightsail.RebootRelationalDatabaseResult
import Lightsail.ReleaseStaticIpRequest
import Lightsail.ReleaseStaticIpResult
import Lightsail.SendContactMethodVerificationRequest
import Lightsail.SendContactMethodVerificationResult
import Lightsail.StartInstanceRequest
import Lightsail.StartInstanceResult
import Lightsail.StartRelationalDatabaseRequest
import Lightsail.StartRelationalDatabaseResult
import Lightsail.StopInstanceRequest
import Lightsail.StopInstanceResult
import Lightsail.StopRelationalDatabaseRequest
import Lightsail.StopRelationalDatabaseResult
import Lightsail.TagResourceRequest
import Lightsail.TagResourceResult
import Lightsail.TestAlarmRequest
import Lightsail.TestAlarmResult
import Lightsail.UnpeerVpcRequest
import Lightsail.UnpeerVpcResult
import Lightsail.UntagResourceRequest
import Lightsail.UntagResourceResult
import Lightsail.UpdateDomainEntryRequest
import Lightsail.UpdateDomainEntryResult
import Lightsail.UpdateLoadBalancerAttributeRequest
import Lightsail.UpdateLoadBalancerAttributeResult
import Lightsail.UpdateRelationalDatabaseRequest
import Lightsail.UpdateRelationalDatabaseResult
import Lightsail.UpdateRelationalDatabaseParametersRequest
import Lightsail.UpdateRelationalDatabaseParametersResult
import Lightsail.AutoSnapshotAddOnRequest
import Lightsail.ResourceLocation
import Lightsail.MonitoredResourceInfo
import Lightsail.DestinationInfo
import Lightsail.AttachedDiskMap
import Lightsail.DomainEntryOptions
import Lightsail.ExportSnapshotRecordSourceInfo
import Lightsail.InstanceSnapshotInfo
import Lightsail.DiskSnapshotInfo
import Lightsail.InstanceAccessDetails
import Lightsail.InstanceState
import Lightsail.InstanceHardware
import Lightsail.InstanceNetworking
import Lightsail.PasswordData
import Lightsail.MonthlyTransfer
import Lightsail.LoadBalancerConfigurationOptions
import Lightsail.LoadBalancerTlsCertificateRenewalSummary
import Lightsail.RelationalDatabaseHardware
import Lightsail.PendingModifiedRelationalDatabaseValues
import Lightsail.RelationalDatabaseEndpoint

typealias AddOnList = Array<AddOn>

typealias AddOnRequestList = Array<AddOnRequest>

typealias AlarmsList = Array<Alarm>

typealias AttachedDiskList = Array<AttachedDisk>

typealias AutoSnapshotDate = String

typealias AutoSnapshotDetailsList = Array<AutoSnapshotDetails>

typealias AvailabilityZoneList = Array<AvailabilityZone>

typealias Base64 = String

typealias BlueprintList = Array<Blueprint>

typealias BundleList = Array<Bundle>

typealias CloudFormationStackRecordList = Array<CloudFormationStackRecord>

typealias CloudFormationStackRecordSourceInfoList = Array<CloudFormationStackRecordSourceInfo>

typealias ContactMethodsList = Array<ContactMethod>

typealias ContactProtocolsList = Array<String /* "Email" | "SMS" | String */>

typealias DiskInfoList = Array<DiskInfo>

typealias DiskList = Array<Disk>

typealias DiskMapList = Array<DiskMap>

typealias DiskSnapshotList = Array<DiskSnapshot>

typealias DomainEntryList = Array<DomainEntry>

typealias DomainEntryOptionsKeys = String

typealias DomainEntryType = String

typealias DomainList = Array<Domain>

typealias DomainName = String

typealias DomainNameList = Array<DomainName>

typealias ExportSnapshotRecordList = Array<ExportSnapshotRecord>

typealias HostKeysList = Array<HostKeyAttributes>

typealias InstanceEntryList = Array<InstanceEntry>

typealias InstanceHealthSummaryList = Array<InstanceHealthSummary>

typealias InstanceList = Array<Instance>

typealias InstancePlatformList = Array<String /* "LINUX_UNIX" | "WINDOWS" | String */>

typealias InstancePortInfoList = Array<InstancePortInfo>

typealias InstancePortStateList = Array<InstancePortState>

typealias InstanceSnapshotList = Array<InstanceSnapshot>

typealias IpAddress = String

typealias IpV6Address = String

typealias IsoDate = Date

typealias KeyPairList = Array<KeyPair>

typealias LoadBalancerList = Array<LoadBalancer>

typealias LoadBalancerTlsCertificateDomainValidationOptionList = Array<LoadBalancerTlsCertificateDomainValidationOption>

typealias LoadBalancerTlsCertificateDomainValidationRecordList = Array<LoadBalancerTlsCertificateDomainValidationRecord>

typealias LoadBalancerTlsCertificateList = Array<LoadBalancerTlsCertificate>

typealias LoadBalancerTlsCertificateSummaryList = Array<LoadBalancerTlsCertificateSummary>

typealias LogEventList = Array<LogEvent>

typealias MetricDatapointList = Array<MetricDatapoint>

typealias MetricPeriod = Number

typealias MetricStatisticList = Array<String /* "Minimum" | "Maximum" | "Sum" | "Average" | "SampleCount" | String */>

typealias NonEmptyString = String

typealias NotificationTriggerList = Array<String /* "OK" | "ALARM" | "INSUFFICIENT_DATA" | String */>

typealias OperationList = Array<Operation>

typealias PendingMaintenanceActionList = Array<PendingMaintenanceAction>

typealias Port = Number

typealias PortInfoList = Array<PortInfo>

typealias PortList = Array<Port>

typealias RegionList = Array<Region>

typealias RelationalDatabaseBlueprintList = Array<RelationalDatabaseBlueprint>

typealias RelationalDatabaseBundleList = Array<RelationalDatabaseBundle>

typealias RelationalDatabaseEventList = Array<RelationalDatabaseEvent>

typealias RelationalDatabaseList = Array<RelationalDatabase>

typealias RelationalDatabaseParameterList = Array<RelationalDatabaseParameter>

typealias RelationalDatabaseSnapshotList = Array<RelationalDatabaseSnapshot>

typealias ResourceArn = String

typealias ResourceName = String

typealias ResourceNameList = Array<ResourceName>

typealias SensitiveString = String

typealias StaticIpList = Array<StaticIp>

typealias StringList = Array<String>

typealias StringMax256 = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TimeOfDay = String

typealias double = Number

typealias float = Number

typealias integer = Number

typealias timestamp = Date

@JsModule("aws-sdk")
external open class Lightsail(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Lightsail.Types.ClientConfiguration */
    open fun allocateStaticIp(params: AllocateStaticIpRequest, callback: (err: AWSError, data: AllocateStaticIpResult) -> Unit = definedExternally): Request<AllocateStaticIpResult, AWSError>
    open fun allocateStaticIp(callback: (err: AWSError, data: AllocateStaticIpResult) -> Unit = definedExternally): Request<AllocateStaticIpResult, AWSError>
    open fun attachDisk(params: AttachDiskRequest, callback: (err: AWSError, data: AttachDiskResult) -> Unit = definedExternally): Request<AttachDiskResult, AWSError>
    open fun attachDisk(callback: (err: AWSError, data: AttachDiskResult) -> Unit = definedExternally): Request<AttachDiskResult, AWSError>
    open fun attachInstancesToLoadBalancer(params: AttachInstancesToLoadBalancerRequest, callback: (err: AWSError, data: AttachInstancesToLoadBalancerResult) -> Unit = definedExternally): Request<AttachInstancesToLoadBalancerResult, AWSError>
    open fun attachInstancesToLoadBalancer(callback: (err: AWSError, data: AttachInstancesToLoadBalancerResult) -> Unit = definedExternally): Request<AttachInstancesToLoadBalancerResult, AWSError>
    open fun attachLoadBalancerTlsCertificate(params: AttachLoadBalancerTlsCertificateRequest, callback: (err: AWSError, data: AttachLoadBalancerTlsCertificateResult) -> Unit = definedExternally): Request<AttachLoadBalancerTlsCertificateResult, AWSError>
    open fun attachLoadBalancerTlsCertificate(callback: (err: AWSError, data: AttachLoadBalancerTlsCertificateResult) -> Unit = definedExternally): Request<AttachLoadBalancerTlsCertificateResult, AWSError>
    open fun attachStaticIp(params: AttachStaticIpRequest, callback: (err: AWSError, data: AttachStaticIpResult) -> Unit = definedExternally): Request<AttachStaticIpResult, AWSError>
    open fun attachStaticIp(callback: (err: AWSError, data: AttachStaticIpResult) -> Unit = definedExternally): Request<AttachStaticIpResult, AWSError>
    open fun closeInstancePublicPorts(params: CloseInstancePublicPortsRequest, callback: (err: AWSError, data: CloseInstancePublicPortsResult) -> Unit = definedExternally): Request<CloseInstancePublicPortsResult, AWSError>
    open fun closeInstancePublicPorts(callback: (err: AWSError, data: CloseInstancePublicPortsResult) -> Unit = definedExternally): Request<CloseInstancePublicPortsResult, AWSError>
    open fun copySnapshot(params: CopySnapshotRequest, callback: (err: AWSError, data: CopySnapshotResult) -> Unit = definedExternally): Request<CopySnapshotResult, AWSError>
    open fun copySnapshot(callback: (err: AWSError, data: CopySnapshotResult) -> Unit = definedExternally): Request<CopySnapshotResult, AWSError>
    open fun createCloudFormationStack(params: CreateCloudFormationStackRequest, callback: (err: AWSError, data: CreateCloudFormationStackResult) -> Unit = definedExternally): Request<CreateCloudFormationStackResult, AWSError>
    open fun createCloudFormationStack(callback: (err: AWSError, data: CreateCloudFormationStackResult) -> Unit = definedExternally): Request<CreateCloudFormationStackResult, AWSError>
    open fun createContactMethod(params: CreateContactMethodRequest, callback: (err: AWSError, data: CreateContactMethodResult) -> Unit = definedExternally): Request<CreateContactMethodResult, AWSError>
    open fun createContactMethod(callback: (err: AWSError, data: CreateContactMethodResult) -> Unit = definedExternally): Request<CreateContactMethodResult, AWSError>
    open fun createDisk(params: CreateDiskRequest, callback: (err: AWSError, data: CreateDiskResult) -> Unit = definedExternally): Request<CreateDiskResult, AWSError>
    open fun createDisk(callback: (err: AWSError, data: CreateDiskResult) -> Unit = definedExternally): Request<CreateDiskResult, AWSError>
    open fun createDiskFromSnapshot(params: CreateDiskFromSnapshotRequest, callback: (err: AWSError, data: CreateDiskFromSnapshotResult) -> Unit = definedExternally): Request<CreateDiskFromSnapshotResult, AWSError>
    open fun createDiskFromSnapshot(callback: (err: AWSError, data: CreateDiskFromSnapshotResult) -> Unit = definedExternally): Request<CreateDiskFromSnapshotResult, AWSError>
    open fun createDiskSnapshot(params: CreateDiskSnapshotRequest, callback: (err: AWSError, data: CreateDiskSnapshotResult) -> Unit = definedExternally): Request<CreateDiskSnapshotResult, AWSError>
    open fun createDiskSnapshot(callback: (err: AWSError, data: CreateDiskSnapshotResult) -> Unit = definedExternally): Request<CreateDiskSnapshotResult, AWSError>
    open fun createDomain(params: CreateDomainRequest, callback: (err: AWSError, data: CreateDomainResult) -> Unit = definedExternally): Request<CreateDomainResult, AWSError>
    open fun createDomain(callback: (err: AWSError, data: CreateDomainResult) -> Unit = definedExternally): Request<CreateDomainResult, AWSError>
    open fun createDomainEntry(params: CreateDomainEntryRequest, callback: (err: AWSError, data: CreateDomainEntryResult) -> Unit = definedExternally): Request<CreateDomainEntryResult, AWSError>
    open fun createDomainEntry(callback: (err: AWSError, data: CreateDomainEntryResult) -> Unit = definedExternally): Request<CreateDomainEntryResult, AWSError>
    open fun createInstanceSnapshot(params: CreateInstanceSnapshotRequest, callback: (err: AWSError, data: CreateInstanceSnapshotResult) -> Unit = definedExternally): Request<CreateInstanceSnapshotResult, AWSError>
    open fun createInstanceSnapshot(callback: (err: AWSError, data: CreateInstanceSnapshotResult) -> Unit = definedExternally): Request<CreateInstanceSnapshotResult, AWSError>
    open fun createInstances(params: CreateInstancesRequest, callback: (err: AWSError, data: CreateInstancesResult) -> Unit = definedExternally): Request<CreateInstancesResult, AWSError>
    open fun createInstances(callback: (err: AWSError, data: CreateInstancesResult) -> Unit = definedExternally): Request<CreateInstancesResult, AWSError>
    open fun createInstancesFromSnapshot(params: CreateInstancesFromSnapshotRequest, callback: (err: AWSError, data: CreateInstancesFromSnapshotResult) -> Unit = definedExternally): Request<CreateInstancesFromSnapshotResult, AWSError>
    open fun createInstancesFromSnapshot(callback: (err: AWSError, data: CreateInstancesFromSnapshotResult) -> Unit = definedExternally): Request<CreateInstancesFromSnapshotResult, AWSError>
    open fun createKeyPair(params: CreateKeyPairRequest, callback: (err: AWSError, data: CreateKeyPairResult) -> Unit = definedExternally): Request<CreateKeyPairResult, AWSError>
    open fun createKeyPair(callback: (err: AWSError, data: CreateKeyPairResult) -> Unit = definedExternally): Request<CreateKeyPairResult, AWSError>
    open fun createLoadBalancer(params: CreateLoadBalancerRequest, callback: (err: AWSError, data: CreateLoadBalancerResult) -> Unit = definedExternally): Request<CreateLoadBalancerResult, AWSError>
    open fun createLoadBalancer(callback: (err: AWSError, data: CreateLoadBalancerResult) -> Unit = definedExternally): Request<CreateLoadBalancerResult, AWSError>
    open fun createLoadBalancerTlsCertificate(params: CreateLoadBalancerTlsCertificateRequest, callback: (err: AWSError, data: CreateLoadBalancerTlsCertificateResult) -> Unit = definedExternally): Request<CreateLoadBalancerTlsCertificateResult, AWSError>
    open fun createLoadBalancerTlsCertificate(callback: (err: AWSError, data: CreateLoadBalancerTlsCertificateResult) -> Unit = definedExternally): Request<CreateLoadBalancerTlsCertificateResult, AWSError>
    open fun createRelationalDatabase(params: CreateRelationalDatabaseRequest, callback: (err: AWSError, data: CreateRelationalDatabaseResult) -> Unit = definedExternally): Request<CreateRelationalDatabaseResult, AWSError>
    open fun createRelationalDatabase(callback: (err: AWSError, data: CreateRelationalDatabaseResult) -> Unit = definedExternally): Request<CreateRelationalDatabaseResult, AWSError>
    open fun createRelationalDatabaseFromSnapshot(params: CreateRelationalDatabaseFromSnapshotRequest, callback: (err: AWSError, data: CreateRelationalDatabaseFromSnapshotResult) -> Unit = definedExternally): Request<CreateRelationalDatabaseFromSnapshotResult, AWSError>
    open fun createRelationalDatabaseFromSnapshot(callback: (err: AWSError, data: CreateRelationalDatabaseFromSnapshotResult) -> Unit = definedExternally): Request<CreateRelationalDatabaseFromSnapshotResult, AWSError>
    open fun createRelationalDatabaseSnapshot(params: CreateRelationalDatabaseSnapshotRequest, callback: (err: AWSError, data: CreateRelationalDatabaseSnapshotResult) -> Unit = definedExternally): Request<CreateRelationalDatabaseSnapshotResult, AWSError>
    open fun createRelationalDatabaseSnapshot(callback: (err: AWSError, data: CreateRelationalDatabaseSnapshotResult) -> Unit = definedExternally): Request<CreateRelationalDatabaseSnapshotResult, AWSError>
    open fun deleteAlarm(params: DeleteAlarmRequest, callback: (err: AWSError, data: DeleteAlarmResult) -> Unit = definedExternally): Request<DeleteAlarmResult, AWSError>
    open fun deleteAlarm(callback: (err: AWSError, data: DeleteAlarmResult) -> Unit = definedExternally): Request<DeleteAlarmResult, AWSError>
    open fun deleteAutoSnapshot(params: DeleteAutoSnapshotRequest, callback: (err: AWSError, data: DeleteAutoSnapshotResult) -> Unit = definedExternally): Request<DeleteAutoSnapshotResult, AWSError>
    open fun deleteAutoSnapshot(callback: (err: AWSError, data: DeleteAutoSnapshotResult) -> Unit = definedExternally): Request<DeleteAutoSnapshotResult, AWSError>
    open fun deleteContactMethod(params: DeleteContactMethodRequest, callback: (err: AWSError, data: DeleteContactMethodResult) -> Unit = definedExternally): Request<DeleteContactMethodResult, AWSError>
    open fun deleteContactMethod(callback: (err: AWSError, data: DeleteContactMethodResult) -> Unit = definedExternally): Request<DeleteContactMethodResult, AWSError>
    open fun deleteDisk(params: DeleteDiskRequest, callback: (err: AWSError, data: DeleteDiskResult) -> Unit = definedExternally): Request<DeleteDiskResult, AWSError>
    open fun deleteDisk(callback: (err: AWSError, data: DeleteDiskResult) -> Unit = definedExternally): Request<DeleteDiskResult, AWSError>
    open fun deleteDiskSnapshot(params: DeleteDiskSnapshotRequest, callback: (err: AWSError, data: DeleteDiskSnapshotResult) -> Unit = definedExternally): Request<DeleteDiskSnapshotResult, AWSError>
    open fun deleteDiskSnapshot(callback: (err: AWSError, data: DeleteDiskSnapshotResult) -> Unit = definedExternally): Request<DeleteDiskSnapshotResult, AWSError>
    open fun deleteDomain(params: DeleteDomainRequest, callback: (err: AWSError, data: DeleteDomainResult) -> Unit = definedExternally): Request<DeleteDomainResult, AWSError>
    open fun deleteDomain(callback: (err: AWSError, data: DeleteDomainResult) -> Unit = definedExternally): Request<DeleteDomainResult, AWSError>
    open fun deleteDomainEntry(params: DeleteDomainEntryRequest, callback: (err: AWSError, data: DeleteDomainEntryResult) -> Unit = definedExternally): Request<DeleteDomainEntryResult, AWSError>
    open fun deleteDomainEntry(callback: (err: AWSError, data: DeleteDomainEntryResult) -> Unit = definedExternally): Request<DeleteDomainEntryResult, AWSError>
    open fun deleteInstance(params: DeleteInstanceRequest, callback: (err: AWSError, data: DeleteInstanceResult) -> Unit = definedExternally): Request<DeleteInstanceResult, AWSError>
    open fun deleteInstance(callback: (err: AWSError, data: DeleteInstanceResult) -> Unit = definedExternally): Request<DeleteInstanceResult, AWSError>
    open fun deleteInstanceSnapshot(params: DeleteInstanceSnapshotRequest, callback: (err: AWSError, data: DeleteInstanceSnapshotResult) -> Unit = definedExternally): Request<DeleteInstanceSnapshotResult, AWSError>
    open fun deleteInstanceSnapshot(callback: (err: AWSError, data: DeleteInstanceSnapshotResult) -> Unit = definedExternally): Request<DeleteInstanceSnapshotResult, AWSError>
    open fun deleteKeyPair(params: DeleteKeyPairRequest, callback: (err: AWSError, data: DeleteKeyPairResult) -> Unit = definedExternally): Request<DeleteKeyPairResult, AWSError>
    open fun deleteKeyPair(callback: (err: AWSError, data: DeleteKeyPairResult) -> Unit = definedExternally): Request<DeleteKeyPairResult, AWSError>
    open fun deleteKnownHostKeys(params: DeleteKnownHostKeysRequest, callback: (err: AWSError, data: DeleteKnownHostKeysResult) -> Unit = definedExternally): Request<DeleteKnownHostKeysResult, AWSError>
    open fun deleteKnownHostKeys(callback: (err: AWSError, data: DeleteKnownHostKeysResult) -> Unit = definedExternally): Request<DeleteKnownHostKeysResult, AWSError>
    open fun deleteLoadBalancer(params: DeleteLoadBalancerRequest, callback: (err: AWSError, data: DeleteLoadBalancerResult) -> Unit = definedExternally): Request<DeleteLoadBalancerResult, AWSError>
    open fun deleteLoadBalancer(callback: (err: AWSError, data: DeleteLoadBalancerResult) -> Unit = definedExternally): Request<DeleteLoadBalancerResult, AWSError>
    open fun deleteLoadBalancerTlsCertificate(params: DeleteLoadBalancerTlsCertificateRequest, callback: (err: AWSError, data: DeleteLoadBalancerTlsCertificateResult) -> Unit = definedExternally): Request<DeleteLoadBalancerTlsCertificateResult, AWSError>
    open fun deleteLoadBalancerTlsCertificate(callback: (err: AWSError, data: DeleteLoadBalancerTlsCertificateResult) -> Unit = definedExternally): Request<DeleteLoadBalancerTlsCertificateResult, AWSError>
    open fun deleteRelationalDatabase(params: DeleteRelationalDatabaseRequest, callback: (err: AWSError, data: DeleteRelationalDatabaseResult) -> Unit = definedExternally): Request<DeleteRelationalDatabaseResult, AWSError>
    open fun deleteRelationalDatabase(callback: (err: AWSError, data: DeleteRelationalDatabaseResult) -> Unit = definedExternally): Request<DeleteRelationalDatabaseResult, AWSError>
    open fun deleteRelationalDatabaseSnapshot(params: DeleteRelationalDatabaseSnapshotRequest, callback: (err: AWSError, data: DeleteRelationalDatabaseSnapshotResult) -> Unit = definedExternally): Request<DeleteRelationalDatabaseSnapshotResult, AWSError>
    open fun deleteRelationalDatabaseSnapshot(callback: (err: AWSError, data: DeleteRelationalDatabaseSnapshotResult) -> Unit = definedExternally): Request<DeleteRelationalDatabaseSnapshotResult, AWSError>
    open fun detachDisk(params: DetachDiskRequest, callback: (err: AWSError, data: DetachDiskResult) -> Unit = definedExternally): Request<DetachDiskResult, AWSError>
    open fun detachDisk(callback: (err: AWSError, data: DetachDiskResult) -> Unit = definedExternally): Request<DetachDiskResult, AWSError>
    open fun detachInstancesFromLoadBalancer(params: DetachInstancesFromLoadBalancerRequest, callback: (err: AWSError, data: DetachInstancesFromLoadBalancerResult) -> Unit = definedExternally): Request<DetachInstancesFromLoadBalancerResult, AWSError>
    open fun detachInstancesFromLoadBalancer(callback: (err: AWSError, data: DetachInstancesFromLoadBalancerResult) -> Unit = definedExternally): Request<DetachInstancesFromLoadBalancerResult, AWSError>
    open fun detachStaticIp(params: DetachStaticIpRequest, callback: (err: AWSError, data: DetachStaticIpResult) -> Unit = definedExternally): Request<DetachStaticIpResult, AWSError>
    open fun detachStaticIp(callback: (err: AWSError, data: DetachStaticIpResult) -> Unit = definedExternally): Request<DetachStaticIpResult, AWSError>
    open fun disableAddOn(params: DisableAddOnRequest, callback: (err: AWSError, data: DisableAddOnResult) -> Unit = definedExternally): Request<DisableAddOnResult, AWSError>
    open fun disableAddOn(callback: (err: AWSError, data: DisableAddOnResult) -> Unit = definedExternally): Request<DisableAddOnResult, AWSError>
    open fun downloadDefaultKeyPair(params: DownloadDefaultKeyPairRequest, callback: (err: AWSError, data: DownloadDefaultKeyPairResult) -> Unit = definedExternally): Request<DownloadDefaultKeyPairResult, AWSError>
    open fun downloadDefaultKeyPair(callback: (err: AWSError, data: DownloadDefaultKeyPairResult) -> Unit = definedExternally): Request<DownloadDefaultKeyPairResult, AWSError>
    open fun enableAddOn(params: EnableAddOnRequest, callback: (err: AWSError, data: EnableAddOnResult) -> Unit = definedExternally): Request<EnableAddOnResult, AWSError>
    open fun enableAddOn(callback: (err: AWSError, data: EnableAddOnResult) -> Unit = definedExternally): Request<EnableAddOnResult, AWSError>
    open fun exportSnapshot(params: ExportSnapshotRequest, callback: (err: AWSError, data: ExportSnapshotResult) -> Unit = definedExternally): Request<ExportSnapshotResult, AWSError>
    open fun exportSnapshot(callback: (err: AWSError, data: ExportSnapshotResult) -> Unit = definedExternally): Request<ExportSnapshotResult, AWSError>
    open fun getActiveNames(params: GetActiveNamesRequest, callback: (err: AWSError, data: GetActiveNamesResult) -> Unit = definedExternally): Request<GetActiveNamesResult, AWSError>
    open fun getActiveNames(callback: (err: AWSError, data: GetActiveNamesResult) -> Unit = definedExternally): Request<GetActiveNamesResult, AWSError>
    open fun getAlarms(params: GetAlarmsRequest, callback: (err: AWSError, data: GetAlarmsResult) -> Unit = definedExternally): Request<GetAlarmsResult, AWSError>
    open fun getAlarms(callback: (err: AWSError, data: GetAlarmsResult) -> Unit = definedExternally): Request<GetAlarmsResult, AWSError>
    open fun getAutoSnapshots(params: GetAutoSnapshotsRequest, callback: (err: AWSError, data: GetAutoSnapshotsResult) -> Unit = definedExternally): Request<GetAutoSnapshotsResult, AWSError>
    open fun getAutoSnapshots(callback: (err: AWSError, data: GetAutoSnapshotsResult) -> Unit = definedExternally): Request<GetAutoSnapshotsResult, AWSError>
    open fun getBlueprints(params: GetBlueprintsRequest, callback: (err: AWSError, data: GetBlueprintsResult) -> Unit = definedExternally): Request<GetBlueprintsResult, AWSError>
    open fun getBlueprints(callback: (err: AWSError, data: GetBlueprintsResult) -> Unit = definedExternally): Request<GetBlueprintsResult, AWSError>
    open fun getBundles(params: GetBundlesRequest, callback: (err: AWSError, data: GetBundlesResult) -> Unit = definedExternally): Request<GetBundlesResult, AWSError>
    open fun getBundles(callback: (err: AWSError, data: GetBundlesResult) -> Unit = definedExternally): Request<GetBundlesResult, AWSError>
    open fun getCloudFormationStackRecords(params: GetCloudFormationStackRecordsRequest, callback: (err: AWSError, data: GetCloudFormationStackRecordsResult) -> Unit = definedExternally): Request<GetCloudFormationStackRecordsResult, AWSError>
    open fun getCloudFormationStackRecords(callback: (err: AWSError, data: GetCloudFormationStackRecordsResult) -> Unit = definedExternally): Request<GetCloudFormationStackRecordsResult, AWSError>
    open fun getContactMethods(params: GetContactMethodsRequest, callback: (err: AWSError, data: GetContactMethodsResult) -> Unit = definedExternally): Request<GetContactMethodsResult, AWSError>
    open fun getContactMethods(callback: (err: AWSError, data: GetContactMethodsResult) -> Unit = definedExternally): Request<GetContactMethodsResult, AWSError>
    open fun getDisk(params: GetDiskRequest, callback: (err: AWSError, data: GetDiskResult) -> Unit = definedExternally): Request<GetDiskResult, AWSError>
    open fun getDisk(callback: (err: AWSError, data: GetDiskResult) -> Unit = definedExternally): Request<GetDiskResult, AWSError>
    open fun getDiskSnapshot(params: GetDiskSnapshotRequest, callback: (err: AWSError, data: GetDiskSnapshotResult) -> Unit = definedExternally): Request<GetDiskSnapshotResult, AWSError>
    open fun getDiskSnapshot(callback: (err: AWSError, data: GetDiskSnapshotResult) -> Unit = definedExternally): Request<GetDiskSnapshotResult, AWSError>
    open fun getDiskSnapshots(params: GetDiskSnapshotsRequest, callback: (err: AWSError, data: GetDiskSnapshotsResult) -> Unit = definedExternally): Request<GetDiskSnapshotsResult, AWSError>
    open fun getDiskSnapshots(callback: (err: AWSError, data: GetDiskSnapshotsResult) -> Unit = definedExternally): Request<GetDiskSnapshotsResult, AWSError>
    open fun getDisks(params: GetDisksRequest, callback: (err: AWSError, data: GetDisksResult) -> Unit = definedExternally): Request<GetDisksResult, AWSError>
    open fun getDisks(callback: (err: AWSError, data: GetDisksResult) -> Unit = definedExternally): Request<GetDisksResult, AWSError>
    open fun getDomain(params: GetDomainRequest, callback: (err: AWSError, data: GetDomainResult) -> Unit = definedExternally): Request<GetDomainResult, AWSError>
    open fun getDomain(callback: (err: AWSError, data: GetDomainResult) -> Unit = definedExternally): Request<GetDomainResult, AWSError>
    open fun getDomains(params: GetDomainsRequest, callback: (err: AWSError, data: GetDomainsResult) -> Unit = definedExternally): Request<GetDomainsResult, AWSError>
    open fun getDomains(callback: (err: AWSError, data: GetDomainsResult) -> Unit = definedExternally): Request<GetDomainsResult, AWSError>
    open fun getExportSnapshotRecords(params: GetExportSnapshotRecordsRequest, callback: (err: AWSError, data: GetExportSnapshotRecordsResult) -> Unit = definedExternally): Request<GetExportSnapshotRecordsResult, AWSError>
    open fun getExportSnapshotRecords(callback: (err: AWSError, data: GetExportSnapshotRecordsResult) -> Unit = definedExternally): Request<GetExportSnapshotRecordsResult, AWSError>
    open fun getInstance(params: GetInstanceRequest, callback: (err: AWSError, data: GetInstanceResult) -> Unit = definedExternally): Request<GetInstanceResult, AWSError>
    open fun getInstance(callback: (err: AWSError, data: GetInstanceResult) -> Unit = definedExternally): Request<GetInstanceResult, AWSError>
    open fun getInstanceAccessDetails(params: GetInstanceAccessDetailsRequest, callback: (err: AWSError, data: GetInstanceAccessDetailsResult) -> Unit = definedExternally): Request<GetInstanceAccessDetailsResult, AWSError>
    open fun getInstanceAccessDetails(callback: (err: AWSError, data: GetInstanceAccessDetailsResult) -> Unit = definedExternally): Request<GetInstanceAccessDetailsResult, AWSError>
    open fun getInstanceMetricData(params: GetInstanceMetricDataRequest, callback: (err: AWSError, data: GetInstanceMetricDataResult) -> Unit = definedExternally): Request<GetInstanceMetricDataResult, AWSError>
    open fun getInstanceMetricData(callback: (err: AWSError, data: GetInstanceMetricDataResult) -> Unit = definedExternally): Request<GetInstanceMetricDataResult, AWSError>
    open fun getInstancePortStates(params: GetInstancePortStatesRequest, callback: (err: AWSError, data: GetInstancePortStatesResult) -> Unit = definedExternally): Request<GetInstancePortStatesResult, AWSError>
    open fun getInstancePortStates(callback: (err: AWSError, data: GetInstancePortStatesResult) -> Unit = definedExternally): Request<GetInstancePortStatesResult, AWSError>
    open fun getInstanceSnapshot(params: GetInstanceSnapshotRequest, callback: (err: AWSError, data: GetInstanceSnapshotResult) -> Unit = definedExternally): Request<GetInstanceSnapshotResult, AWSError>
    open fun getInstanceSnapshot(callback: (err: AWSError, data: GetInstanceSnapshotResult) -> Unit = definedExternally): Request<GetInstanceSnapshotResult, AWSError>
    open fun getInstanceSnapshots(params: GetInstanceSnapshotsRequest, callback: (err: AWSError, data: GetInstanceSnapshotsResult) -> Unit = definedExternally): Request<GetInstanceSnapshotsResult, AWSError>
    open fun getInstanceSnapshots(callback: (err: AWSError, data: GetInstanceSnapshotsResult) -> Unit = definedExternally): Request<GetInstanceSnapshotsResult, AWSError>
    open fun getInstanceState(params: GetInstanceStateRequest, callback: (err: AWSError, data: GetInstanceStateResult) -> Unit = definedExternally): Request<GetInstanceStateResult, AWSError>
    open fun getInstanceState(callback: (err: AWSError, data: GetInstanceStateResult) -> Unit = definedExternally): Request<GetInstanceStateResult, AWSError>
    open fun getInstances(params: GetInstancesRequest, callback: (err: AWSError, data: GetInstancesResult) -> Unit = definedExternally): Request<GetInstancesResult, AWSError>
    open fun getInstances(callback: (err: AWSError, data: GetInstancesResult) -> Unit = definedExternally): Request<GetInstancesResult, AWSError>
    open fun getKeyPair(params: GetKeyPairRequest, callback: (err: AWSError, data: GetKeyPairResult) -> Unit = definedExternally): Request<GetKeyPairResult, AWSError>
    open fun getKeyPair(callback: (err: AWSError, data: GetKeyPairResult) -> Unit = definedExternally): Request<GetKeyPairResult, AWSError>
    open fun getKeyPairs(params: GetKeyPairsRequest, callback: (err: AWSError, data: GetKeyPairsResult) -> Unit = definedExternally): Request<GetKeyPairsResult, AWSError>
    open fun getKeyPairs(callback: (err: AWSError, data: GetKeyPairsResult) -> Unit = definedExternally): Request<GetKeyPairsResult, AWSError>
    open fun getLoadBalancer(params: GetLoadBalancerRequest, callback: (err: AWSError, data: GetLoadBalancerResult) -> Unit = definedExternally): Request<GetLoadBalancerResult, AWSError>
    open fun getLoadBalancer(callback: (err: AWSError, data: GetLoadBalancerResult) -> Unit = definedExternally): Request<GetLoadBalancerResult, AWSError>
    open fun getLoadBalancerMetricData(params: GetLoadBalancerMetricDataRequest, callback: (err: AWSError, data: GetLoadBalancerMetricDataResult) -> Unit = definedExternally): Request<GetLoadBalancerMetricDataResult, AWSError>
    open fun getLoadBalancerMetricData(callback: (err: AWSError, data: GetLoadBalancerMetricDataResult) -> Unit = definedExternally): Request<GetLoadBalancerMetricDataResult, AWSError>
    open fun getLoadBalancerTlsCertificates(params: GetLoadBalancerTlsCertificatesRequest, callback: (err: AWSError, data: GetLoadBalancerTlsCertificatesResult) -> Unit = definedExternally): Request<GetLoadBalancerTlsCertificatesResult, AWSError>
    open fun getLoadBalancerTlsCertificates(callback: (err: AWSError, data: GetLoadBalancerTlsCertificatesResult) -> Unit = definedExternally): Request<GetLoadBalancerTlsCertificatesResult, AWSError>
    open fun getLoadBalancers(params: GetLoadBalancersRequest, callback: (err: AWSError, data: GetLoadBalancersResult) -> Unit = definedExternally): Request<GetLoadBalancersResult, AWSError>
    open fun getLoadBalancers(callback: (err: AWSError, data: GetLoadBalancersResult) -> Unit = definedExternally): Request<GetLoadBalancersResult, AWSError>
    open fun getOperation(params: GetOperationRequest, callback: (err: AWSError, data: GetOperationResult) -> Unit = definedExternally): Request<GetOperationResult, AWSError>
    open fun getOperation(callback: (err: AWSError, data: GetOperationResult) -> Unit = definedExternally): Request<GetOperationResult, AWSError>
    open fun getOperations(params: GetOperationsRequest, callback: (err: AWSError, data: GetOperationsResult) -> Unit = definedExternally): Request<GetOperationsResult, AWSError>
    open fun getOperations(callback: (err: AWSError, data: GetOperationsResult) -> Unit = definedExternally): Request<GetOperationsResult, AWSError>
    open fun getOperationsForResource(params: GetOperationsForResourceRequest, callback: (err: AWSError, data: GetOperationsForResourceResult) -> Unit = definedExternally): Request<GetOperationsForResourceResult, AWSError>
    open fun getOperationsForResource(callback: (err: AWSError, data: GetOperationsForResourceResult) -> Unit = definedExternally): Request<GetOperationsForResourceResult, AWSError>
    open fun getRegions(params: GetRegionsRequest, callback: (err: AWSError, data: GetRegionsResult) -> Unit = definedExternally): Request<GetRegionsResult, AWSError>
    open fun getRegions(callback: (err: AWSError, data: GetRegionsResult) -> Unit = definedExternally): Request<GetRegionsResult, AWSError>
    open fun getRelationalDatabase(params: GetRelationalDatabaseRequest, callback: (err: AWSError, data: GetRelationalDatabaseResult) -> Unit = definedExternally): Request<GetRelationalDatabaseResult, AWSError>
    open fun getRelationalDatabase(callback: (err: AWSError, data: GetRelationalDatabaseResult) -> Unit = definedExternally): Request<GetRelationalDatabaseResult, AWSError>
    open fun getRelationalDatabaseBlueprints(params: GetRelationalDatabaseBlueprintsRequest, callback: (err: AWSError, data: GetRelationalDatabaseBlueprintsResult) -> Unit = definedExternally): Request<GetRelationalDatabaseBlueprintsResult, AWSError>
    open fun getRelationalDatabaseBlueprints(callback: (err: AWSError, data: GetRelationalDatabaseBlueprintsResult) -> Unit = definedExternally): Request<GetRelationalDatabaseBlueprintsResult, AWSError>
    open fun getRelationalDatabaseBundles(params: GetRelationalDatabaseBundlesRequest, callback: (err: AWSError, data: GetRelationalDatabaseBundlesResult) -> Unit = definedExternally): Request<GetRelationalDatabaseBundlesResult, AWSError>
    open fun getRelationalDatabaseBundles(callback: (err: AWSError, data: GetRelationalDatabaseBundlesResult) -> Unit = definedExternally): Request<GetRelationalDatabaseBundlesResult, AWSError>
    open fun getRelationalDatabaseEvents(params: GetRelationalDatabaseEventsRequest, callback: (err: AWSError, data: GetRelationalDatabaseEventsResult) -> Unit = definedExternally): Request<GetRelationalDatabaseEventsResult, AWSError>
    open fun getRelationalDatabaseEvents(callback: (err: AWSError, data: GetRelationalDatabaseEventsResult) -> Unit = definedExternally): Request<GetRelationalDatabaseEventsResult, AWSError>
    open fun getRelationalDatabaseLogEvents(params: GetRelationalDatabaseLogEventsRequest, callback: (err: AWSError, data: GetRelationalDatabaseLogEventsResult) -> Unit = definedExternally): Request<GetRelationalDatabaseLogEventsResult, AWSError>
    open fun getRelationalDatabaseLogEvents(callback: (err: AWSError, data: GetRelationalDatabaseLogEventsResult) -> Unit = definedExternally): Request<GetRelationalDatabaseLogEventsResult, AWSError>
    open fun getRelationalDatabaseLogStreams(params: GetRelationalDatabaseLogStreamsRequest, callback: (err: AWSError, data: GetRelationalDatabaseLogStreamsResult) -> Unit = definedExternally): Request<GetRelationalDatabaseLogStreamsResult, AWSError>
    open fun getRelationalDatabaseLogStreams(callback: (err: AWSError, data: GetRelationalDatabaseLogStreamsResult) -> Unit = definedExternally): Request<GetRelationalDatabaseLogStreamsResult, AWSError>
    open fun getRelationalDatabaseMasterUserPassword(params: GetRelationalDatabaseMasterUserPasswordRequest, callback: (err: AWSError, data: GetRelationalDatabaseMasterUserPasswordResult) -> Unit = definedExternally): Request<GetRelationalDatabaseMasterUserPasswordResult, AWSError>
    open fun getRelationalDatabaseMasterUserPassword(callback: (err: AWSError, data: GetRelationalDatabaseMasterUserPasswordResult) -> Unit = definedExternally): Request<GetRelationalDatabaseMasterUserPasswordResult, AWSError>
    open fun getRelationalDatabaseMetricData(params: GetRelationalDatabaseMetricDataRequest, callback: (err: AWSError, data: GetRelationalDatabaseMetricDataResult) -> Unit = definedExternally): Request<GetRelationalDatabaseMetricDataResult, AWSError>
    open fun getRelationalDatabaseMetricData(callback: (err: AWSError, data: GetRelationalDatabaseMetricDataResult) -> Unit = definedExternally): Request<GetRelationalDatabaseMetricDataResult, AWSError>
    open fun getRelationalDatabaseParameters(params: GetRelationalDatabaseParametersRequest, callback: (err: AWSError, data: GetRelationalDatabaseParametersResult) -> Unit = definedExternally): Request<GetRelationalDatabaseParametersResult, AWSError>
    open fun getRelationalDatabaseParameters(callback: (err: AWSError, data: GetRelationalDatabaseParametersResult) -> Unit = definedExternally): Request<GetRelationalDatabaseParametersResult, AWSError>
    open fun getRelationalDatabaseSnapshot(params: GetRelationalDatabaseSnapshotRequest, callback: (err: AWSError, data: GetRelationalDatabaseSnapshotResult) -> Unit = definedExternally): Request<GetRelationalDatabaseSnapshotResult, AWSError>
    open fun getRelationalDatabaseSnapshot(callback: (err: AWSError, data: GetRelationalDatabaseSnapshotResult) -> Unit = definedExternally): Request<GetRelationalDatabaseSnapshotResult, AWSError>
    open fun getRelationalDatabaseSnapshots(params: GetRelationalDatabaseSnapshotsRequest, callback: (err: AWSError, data: GetRelationalDatabaseSnapshotsResult) -> Unit = definedExternally): Request<GetRelationalDatabaseSnapshotsResult, AWSError>
    open fun getRelationalDatabaseSnapshots(callback: (err: AWSError, data: GetRelationalDatabaseSnapshotsResult) -> Unit = definedExternally): Request<GetRelationalDatabaseSnapshotsResult, AWSError>
    open fun getRelationalDatabases(params: GetRelationalDatabasesRequest, callback: (err: AWSError, data: GetRelationalDatabasesResult) -> Unit = definedExternally): Request<GetRelationalDatabasesResult, AWSError>
    open fun getRelationalDatabases(callback: (err: AWSError, data: GetRelationalDatabasesResult) -> Unit = definedExternally): Request<GetRelationalDatabasesResult, AWSError>
    open fun getStaticIp(params: GetStaticIpRequest, callback: (err: AWSError, data: GetStaticIpResult) -> Unit = definedExternally): Request<GetStaticIpResult, AWSError>
    open fun getStaticIp(callback: (err: AWSError, data: GetStaticIpResult) -> Unit = definedExternally): Request<GetStaticIpResult, AWSError>
    open fun getStaticIps(params: GetStaticIpsRequest, callback: (err: AWSError, data: GetStaticIpsResult) -> Unit = definedExternally): Request<GetStaticIpsResult, AWSError>
    open fun getStaticIps(callback: (err: AWSError, data: GetStaticIpsResult) -> Unit = definedExternally): Request<GetStaticIpsResult, AWSError>
    open fun importKeyPair(params: ImportKeyPairRequest, callback: (err: AWSError, data: ImportKeyPairResult) -> Unit = definedExternally): Request<ImportKeyPairResult, AWSError>
    open fun importKeyPair(callback: (err: AWSError, data: ImportKeyPairResult) -> Unit = definedExternally): Request<ImportKeyPairResult, AWSError>
    open fun isVpcPeered(params: IsVpcPeeredRequest, callback: (err: AWSError, data: IsVpcPeeredResult) -> Unit = definedExternally): Request<IsVpcPeeredResult, AWSError>
    open fun isVpcPeered(callback: (err: AWSError, data: IsVpcPeeredResult) -> Unit = definedExternally): Request<IsVpcPeeredResult, AWSError>
    open fun openInstancePublicPorts(params: OpenInstancePublicPortsRequest, callback: (err: AWSError, data: OpenInstancePublicPortsResult) -> Unit = definedExternally): Request<OpenInstancePublicPortsResult, AWSError>
    open fun openInstancePublicPorts(callback: (err: AWSError, data: OpenInstancePublicPortsResult) -> Unit = definedExternally): Request<OpenInstancePublicPortsResult, AWSError>
    open fun peerVpc(params: PeerVpcRequest, callback: (err: AWSError, data: PeerVpcResult) -> Unit = definedExternally): Request<PeerVpcResult, AWSError>
    open fun peerVpc(callback: (err: AWSError, data: PeerVpcResult) -> Unit = definedExternally): Request<PeerVpcResult, AWSError>
    open fun putAlarm(params: PutAlarmRequest, callback: (err: AWSError, data: PutAlarmResult) -> Unit = definedExternally): Request<PutAlarmResult, AWSError>
    open fun putAlarm(callback: (err: AWSError, data: PutAlarmResult) -> Unit = definedExternally): Request<PutAlarmResult, AWSError>
    open fun putInstancePublicPorts(params: PutInstancePublicPortsRequest, callback: (err: AWSError, data: PutInstancePublicPortsResult) -> Unit = definedExternally): Request<PutInstancePublicPortsResult, AWSError>
    open fun putInstancePublicPorts(callback: (err: AWSError, data: PutInstancePublicPortsResult) -> Unit = definedExternally): Request<PutInstancePublicPortsResult, AWSError>
    open fun rebootInstance(params: RebootInstanceRequest, callback: (err: AWSError, data: RebootInstanceResult) -> Unit = definedExternally): Request<RebootInstanceResult, AWSError>
    open fun rebootInstance(callback: (err: AWSError, data: RebootInstanceResult) -> Unit = definedExternally): Request<RebootInstanceResult, AWSError>
    open fun rebootRelationalDatabase(params: RebootRelationalDatabaseRequest, callback: (err: AWSError, data: RebootRelationalDatabaseResult) -> Unit = definedExternally): Request<RebootRelationalDatabaseResult, AWSError>
    open fun rebootRelationalDatabase(callback: (err: AWSError, data: RebootRelationalDatabaseResult) -> Unit = definedExternally): Request<RebootRelationalDatabaseResult, AWSError>
    open fun releaseStaticIp(params: ReleaseStaticIpRequest, callback: (err: AWSError, data: ReleaseStaticIpResult) -> Unit = definedExternally): Request<ReleaseStaticIpResult, AWSError>
    open fun releaseStaticIp(callback: (err: AWSError, data: ReleaseStaticIpResult) -> Unit = definedExternally): Request<ReleaseStaticIpResult, AWSError>
    open fun sendContactMethodVerification(params: SendContactMethodVerificationRequest, callback: (err: AWSError, data: SendContactMethodVerificationResult) -> Unit = definedExternally): Request<SendContactMethodVerificationResult, AWSError>
    open fun sendContactMethodVerification(callback: (err: AWSError, data: SendContactMethodVerificationResult) -> Unit = definedExternally): Request<SendContactMethodVerificationResult, AWSError>
    open fun startInstance(params: StartInstanceRequest, callback: (err: AWSError, data: StartInstanceResult) -> Unit = definedExternally): Request<StartInstanceResult, AWSError>
    open fun startInstance(callback: (err: AWSError, data: StartInstanceResult) -> Unit = definedExternally): Request<StartInstanceResult, AWSError>
    open fun startRelationalDatabase(params: StartRelationalDatabaseRequest, callback: (err: AWSError, data: StartRelationalDatabaseResult) -> Unit = definedExternally): Request<StartRelationalDatabaseResult, AWSError>
    open fun startRelationalDatabase(callback: (err: AWSError, data: StartRelationalDatabaseResult) -> Unit = definedExternally): Request<StartRelationalDatabaseResult, AWSError>
    open fun stopInstance(params: StopInstanceRequest, callback: (err: AWSError, data: StopInstanceResult) -> Unit = definedExternally): Request<StopInstanceResult, AWSError>
    open fun stopInstance(callback: (err: AWSError, data: StopInstanceResult) -> Unit = definedExternally): Request<StopInstanceResult, AWSError>
    open fun stopRelationalDatabase(params: StopRelationalDatabaseRequest, callback: (err: AWSError, data: StopRelationalDatabaseResult) -> Unit = definedExternally): Request<StopRelationalDatabaseResult, AWSError>
    open fun stopRelationalDatabase(callback: (err: AWSError, data: StopRelationalDatabaseResult) -> Unit = definedExternally): Request<StopRelationalDatabaseResult, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResult) -> Unit = definedExternally): Request<TagResourceResult, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResult) -> Unit = definedExternally): Request<TagResourceResult, AWSError>
    open fun testAlarm(params: TestAlarmRequest, callback: (err: AWSError, data: TestAlarmResult) -> Unit = definedExternally): Request<TestAlarmResult, AWSError>
    open fun testAlarm(callback: (err: AWSError, data: TestAlarmResult) -> Unit = definedExternally): Request<TestAlarmResult, AWSError>
    open fun unpeerVpc(params: UnpeerVpcRequest, callback: (err: AWSError, data: UnpeerVpcResult) -> Unit = definedExternally): Request<UnpeerVpcResult, AWSError>
    open fun unpeerVpc(callback: (err: AWSError, data: UnpeerVpcResult) -> Unit = definedExternally): Request<UnpeerVpcResult, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResult) -> Unit = definedExternally): Request<UntagResourceResult, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResult) -> Unit = definedExternally): Request<UntagResourceResult, AWSError>
    open fun updateDomainEntry(params: UpdateDomainEntryRequest, callback: (err: AWSError, data: UpdateDomainEntryResult) -> Unit = definedExternally): Request<UpdateDomainEntryResult, AWSError>
    open fun updateDomainEntry(callback: (err: AWSError, data: UpdateDomainEntryResult) -> Unit = definedExternally): Request<UpdateDomainEntryResult, AWSError>
    open fun updateLoadBalancerAttribute(params: UpdateLoadBalancerAttributeRequest, callback: (err: AWSError, data: UpdateLoadBalancerAttributeResult) -> Unit = definedExternally): Request<UpdateLoadBalancerAttributeResult, AWSError>
    open fun updateLoadBalancerAttribute(callback: (err: AWSError, data: UpdateLoadBalancerAttributeResult) -> Unit = definedExternally): Request<UpdateLoadBalancerAttributeResult, AWSError>
    open fun updateRelationalDatabase(params: UpdateRelationalDatabaseRequest, callback: (err: AWSError, data: UpdateRelationalDatabaseResult) -> Unit = definedExternally): Request<UpdateRelationalDatabaseResult, AWSError>
    open fun updateRelationalDatabase(callback: (err: AWSError, data: UpdateRelationalDatabaseResult) -> Unit = definedExternally): Request<UpdateRelationalDatabaseResult, AWSError>
    open fun updateRelationalDatabaseParameters(params: UpdateRelationalDatabaseParametersRequest, callback: (err: AWSError, data: UpdateRelationalDatabaseParametersResult) -> Unit = definedExternally): Request<UpdateRelationalDatabaseParametersResult, AWSError>
    open fun updateRelationalDatabaseParameters(callback: (err: AWSError, data: UpdateRelationalDatabaseParametersResult) -> Unit = definedExternally): Request<UpdateRelationalDatabaseParametersResult, AWSError>
    interface AddOn {
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var status: String?
            get() = definedExternally
            set(value) = definedExternally
        var snapshotTimeOfDay: TimeOfDay?
            get() = definedExternally
            set(value) = definedExternally
        var nextSnapshotTimeOfDay: TimeOfDay?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddOnRequest {
        var addOnType: String /* "AutoSnapshot" | String */
        var autoSnapshotAddOnRequest: AutoSnapshotAddOnRequest?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Alarm {
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var location: ResourceLocation?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "Instance" | "StaticIp" | "KeyPair" | "InstanceSnapshot" | "Domain" | "PeeredVpc" | "LoadBalancer" | "LoadBalancerTlsCertificate" | "Disk" | "DiskSnapshot" | "RelationalDatabase" | "RelationalDatabaseSnapshot" | "ExportSnapshotRecord" | "CloudFormationStackRecord" | "Alarm" | "ContactMethod" | String */
        var supportCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var monitoredResourceInfo: MonitoredResourceInfo?
            get() = definedExternally
            set(value) = definedExternally
        var comparisonOperator: String /* "GreaterThanOrEqualToThreshold" | "GreaterThanThreshold" | "LessThanThreshold" | "LessThanOrEqualToThreshold" | String */
        var evaluationPeriods: integer?
            get() = definedExternally
            set(value) = definedExternally
        var period: MetricPeriod?
            get() = definedExternally
            set(value) = definedExternally
        var threshold: double?
            get() = definedExternally
            set(value) = definedExternally
        var datapointsToAlarm: integer?
            get() = definedExternally
            set(value) = definedExternally
        var treatMissingData: String /* "breaching" | "notBreaching" | "ignore" | "missing" | String */
        var statistic: String /* "Minimum" | "Maximum" | "Sum" | "Average" | "SampleCount" | String */
        var metricName: String /* "CPUUtilization" | "NetworkIn" | "NetworkOut" | "StatusCheckFailed" | "StatusCheckFailed_Instance" | "StatusCheckFailed_System" | "ClientTLSNegotiationErrorCount" | "HealthyHostCount" | "UnhealthyHostCount" | "HTTPCode_LB_4XX_Count" | "HTTPCode_LB_5XX_Count" | "HTTPCode_Instance_2XX_Count" | "HTTPCode_Instance_3XX_Count" | "HTTPCode_Instance_4XX_Count" | "HTTPCode_Instance_5XX_Count" | "InstanceResponseTime" | "RejectedConnectionCount" | "RequestCount" | "DatabaseConnections" | "DiskQueueDepth" | "FreeStorageSpace" | "NetworkReceiveThroughput" | "NetworkTransmitThroughput" | String */
        var state: String /* "OK" | "ALARM" | "INSUFFICIENT_DATA" | String */
        var unit: String /* "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Count" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second" | "None" | String */
        var contactProtocols: ContactProtocolsList?
            get() = definedExternally
            set(value) = definedExternally
        var notificationTriggers: NotificationTriggerList?
            get() = definedExternally
            set(value) = definedExternally
        var notificationEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AllocateStaticIpRequest {
        var staticIpName: ResourceName
    }
    interface AllocateStaticIpResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttachDiskRequest {
        var diskName: ResourceName
        var instanceName: ResourceName
        var diskPath: NonEmptyString
    }
    interface AttachDiskResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttachInstancesToLoadBalancerRequest {
        var loadBalancerName: ResourceName
        var instanceNames: ResourceNameList
    }
    interface AttachInstancesToLoadBalancerResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttachLoadBalancerTlsCertificateRequest {
        var loadBalancerName: ResourceName
        var certificateName: ResourceName
    }
    interface AttachLoadBalancerTlsCertificateResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttachStaticIpRequest {
        var staticIpName: ResourceName
        var instanceName: ResourceName
    }
    interface AttachStaticIpResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttachedDisk {
        var path: String?
            get() = definedExternally
            set(value) = definedExternally
        var sizeInGb: integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttachedDiskMap {
        @nativeGetter
        operator fun get(key: String): DiskMapList?
        @nativeSetter
        operator fun set(key: String, value: DiskMapList)
    }
    interface AutoSnapshotAddOnRequest {
        var snapshotTimeOfDay: TimeOfDay?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoSnapshotDetails {
        var date: String?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Success" | "Failed" | "InProgress" | "NotFound" | String */
        var fromAttachedDisks: AttachedDiskList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AvailabilityZone {
        var zoneName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var state: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Blueprint {
        var blueprintId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var group: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "os" | "app" | String */
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var isActive: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var minPower: integer?
            get() = definedExternally
            set(value) = definedExternally
        var version: String?
            get() = definedExternally
            set(value) = definedExternally
        var versionCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var productUrl: String?
            get() = definedExternally
            set(value) = definedExternally
        var licenseUrl: String?
            get() = definedExternally
            set(value) = definedExternally
        var platform: String /* "LINUX_UNIX" | "WINDOWS" | String */
    }
    interface Bundle {
        var price: float?
            get() = definedExternally
            set(value) = definedExternally
        var cpuCount: integer?
            get() = definedExternally
            set(value) = definedExternally
        var diskSizeInGb: integer?
            get() = definedExternally
            set(value) = definedExternally
        var bundleId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var instanceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var isActive: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var power: integer?
            get() = definedExternally
            set(value) = definedExternally
        var ramSizeInGb: float?
            get() = definedExternally
            set(value) = definedExternally
        var transferPerMonthInGb: integer?
            get() = definedExternally
            set(value) = definedExternally
        var supportedPlatforms: InstancePlatformList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CloseInstancePublicPortsRequest {
        var portInfo: PortInfo
        var instanceName: ResourceName
    }
    interface CloseInstancePublicPortsResult {
        var operation: Operation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CloudFormationStackRecord {
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var location: ResourceLocation?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "Instance" | "StaticIp" | "KeyPair" | "InstanceSnapshot" | "Domain" | "PeeredVpc" | "LoadBalancer" | "LoadBalancerTlsCertificate" | "Disk" | "DiskSnapshot" | "RelationalDatabase" | "RelationalDatabaseSnapshot" | "ExportSnapshotRecord" | "CloudFormationStackRecord" | "Alarm" | "ContactMethod" | String */
        var state: String /* "Started" | "Succeeded" | "Failed" | String */
        var sourceInfo: CloudFormationStackRecordSourceInfoList?
            get() = definedExternally
            set(value) = definedExternally
        var destinationInfo: DestinationInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CloudFormationStackRecordSourceInfo {
        var resourceType: String /* "ExportSnapshotRecord" | String */
        var name: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContactMethod {
        var contactEndpoint: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "PendingVerification" | "Valid" | "Invalid" | String */
        var protocol: String /* "Email" | "SMS" | String */
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var location: ResourceLocation?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "Instance" | "StaticIp" | "KeyPair" | "InstanceSnapshot" | "Domain" | "PeeredVpc" | "LoadBalancer" | "LoadBalancerTlsCertificate" | "Disk" | "DiskSnapshot" | "RelationalDatabase" | "RelationalDatabaseSnapshot" | "ExportSnapshotRecord" | "CloudFormationStackRecord" | "Alarm" | "ContactMethod" | String */
        var supportCode: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CopySnapshotRequest {
        var sourceSnapshotName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var sourceResourceName: String?
            get() = definedExternally
            set(value) = definedExternally
        var restoreDate: String?
            get() = definedExternally
            set(value) = definedExternally
        var useLatestRestorableAutoSnapshot: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var targetSnapshotName: ResourceName
        var sourceRegion: String /* "us-east-1" | "us-east-2" | "us-west-1" | "us-west-2" | "eu-west-1" | "eu-west-2" | "eu-west-3" | "eu-central-1" | "ca-central-1" | "ap-south-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-northeast-1" | "ap-northeast-2" | String */
    }
    interface CopySnapshotResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCloudFormationStackRequest {
        var instances: InstanceEntryList
    }
    interface CreateCloudFormationStackResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateContactMethodRequest {
        var protocol: String /* "Email" | "SMS" | String */
        var contactEndpoint: StringMax256
    }
    interface CreateContactMethodResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDiskFromSnapshotRequest {
        var diskName: ResourceName
        var diskSnapshotName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var availabilityZone: NonEmptyString
        var sizeInGb: integer
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var addOns: AddOnRequestList?
            get() = definedExternally
            set(value) = definedExternally
        var sourceDiskName: String?
            get() = definedExternally
            set(value) = definedExternally
        var restoreDate: String?
            get() = definedExternally
            set(value) = definedExternally
        var useLatestRestorableAutoSnapshot: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDiskFromSnapshotResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDiskRequest {
        var diskName: ResourceName
        var availabilityZone: NonEmptyString
        var sizeInGb: integer
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var addOns: AddOnRequestList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDiskResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDiskSnapshotRequest {
        var diskName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var diskSnapshotName: ResourceName
        var instanceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDiskSnapshotResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDomainEntryRequest {
        var domainName: DomainName
        var domainEntry: DomainEntry
    }
    interface CreateDomainEntryResult {
        var operation: Operation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDomainRequest {
        var domainName: DomainName
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDomainResult {
        var operation: Operation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateInstanceSnapshotRequest {
        var instanceSnapshotName: ResourceName
        var instanceName: ResourceName
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateInstanceSnapshotResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateInstancesFromSnapshotRequest {
        var instanceNames: StringList
        var attachedDiskMapping: AttachedDiskMap?
            get() = definedExternally
            set(value) = definedExternally
        var availabilityZone: String
        var instanceSnapshotName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var bundleId: NonEmptyString
        var userData: String?
            get() = definedExternally
            set(value) = definedExternally
        var keyPairName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var addOns: AddOnRequestList?
            get() = definedExternally
            set(value) = definedExternally
        var sourceInstanceName: String?
            get() = definedExternally
            set(value) = definedExternally
        var restoreDate: String?
            get() = definedExternally
            set(value) = definedExternally
        var useLatestRestorableAutoSnapshot: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateInstancesFromSnapshotResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateInstancesRequest {
        var instanceNames: StringList
        var availabilityZone: String
        var customImageName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var blueprintId: NonEmptyString
        var bundleId: NonEmptyString
        var userData: String?
            get() = definedExternally
            set(value) = definedExternally
        var keyPairName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var addOns: AddOnRequestList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateInstancesResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateKeyPairRequest {
        var keyPairName: ResourceName
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateKeyPairResult {
        var keyPair: KeyPair?
            get() = definedExternally
            set(value) = definedExternally
        var publicKeyBase64: Base64?
            get() = definedExternally
            set(value) = definedExternally
        var privateKeyBase64: Base64?
            get() = definedExternally
            set(value) = definedExternally
        var operation: Operation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLoadBalancerRequest {
        var loadBalancerName: ResourceName
        var instancePort: Port
        var healthCheckPath: String?
            get() = definedExternally
            set(value) = definedExternally
        var certificateName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var certificateDomainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
        var certificateAlternativeNames: DomainNameList?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLoadBalancerResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLoadBalancerTlsCertificateRequest {
        var loadBalancerName: ResourceName
        var certificateName: ResourceName
        var certificateDomainName: DomainName
        var certificateAlternativeNames: DomainNameList?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLoadBalancerTlsCertificateResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRelationalDatabaseFromSnapshotRequest {
        var relationalDatabaseName: ResourceName
        var availabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var publiclyAccessible: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var relationalDatabaseSnapshotName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var relationalDatabaseBundleId: String?
            get() = definedExternally
            set(value) = definedExternally
        var sourceRelationalDatabaseName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var restoreTime: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var useLatestRestorableTime: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRelationalDatabaseFromSnapshotResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRelationalDatabaseRequest {
        var relationalDatabaseName: ResourceName
        var availabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var relationalDatabaseBlueprintId: String
        var relationalDatabaseBundleId: String
        var masterDatabaseName: String
        var masterUsername: String
        var masterUserPassword: SensitiveString?
            get() = definedExternally
            set(value) = definedExternally
        var preferredBackupWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var preferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var publiclyAccessible: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRelationalDatabaseResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRelationalDatabaseSnapshotRequest {
        var relationalDatabaseName: ResourceName
        var relationalDatabaseSnapshotName: ResourceName
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRelationalDatabaseSnapshotResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAlarmRequest {
        var alarmName: ResourceName
    }
    interface DeleteAlarmResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAutoSnapshotRequest {
        var resourceName: ResourceName
        var date: AutoSnapshotDate
    }
    interface DeleteAutoSnapshotResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteContactMethodRequest {
        var protocol: String /* "Email" | "SMS" | String */
    }
    interface DeleteContactMethodResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDiskRequest {
        var diskName: ResourceName
        var forceDeleteAddOns: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDiskResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDiskSnapshotRequest {
        var diskSnapshotName: ResourceName
    }
    interface DeleteDiskSnapshotResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDomainEntryRequest {
        var domainName: DomainName
        var domainEntry: DomainEntry
    }
    interface DeleteDomainEntryResult {
        var operation: Operation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDomainRequest {
        var domainName: DomainName
    }
    interface DeleteDomainResult {
        var operation: Operation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteInstanceRequest {
        var instanceName: ResourceName
        var forceDeleteAddOns: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteInstanceResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteInstanceSnapshotRequest {
        var instanceSnapshotName: ResourceName
    }
    interface DeleteInstanceSnapshotResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteKeyPairRequest {
        var keyPairName: ResourceName
    }
    interface DeleteKeyPairResult {
        var operation: Operation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteKnownHostKeysRequest {
        var instanceName: ResourceName
    }
    interface DeleteKnownHostKeysResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteLoadBalancerRequest {
        var loadBalancerName: ResourceName
    }
    interface DeleteLoadBalancerResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteLoadBalancerTlsCertificateRequest {
        var loadBalancerName: ResourceName
        var certificateName: ResourceName
        var force: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteLoadBalancerTlsCertificateResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteRelationalDatabaseRequest {
        var relationalDatabaseName: ResourceName
        var skipFinalSnapshot: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var finalRelationalDatabaseSnapshotName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteRelationalDatabaseResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteRelationalDatabaseSnapshotRequest {
        var relationalDatabaseSnapshotName: ResourceName
    }
    interface DeleteRelationalDatabaseSnapshotResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DestinationInfo {
        var id: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var service: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetachDiskRequest {
        var diskName: ResourceName
    }
    interface DetachDiskResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetachInstancesFromLoadBalancerRequest {
        var loadBalancerName: ResourceName
        var instanceNames: ResourceNameList
    }
    interface DetachInstancesFromLoadBalancerResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetachStaticIpRequest {
        var staticIpName: ResourceName
    }
    interface DetachStaticIpResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisableAddOnRequest {
        var addOnType: String /* "AutoSnapshot" | String */
        var resourceName: ResourceName
    }
    interface DisableAddOnResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Disk {
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var supportCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var location: ResourceLocation?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "Instance" | "StaticIp" | "KeyPair" | "InstanceSnapshot" | "Domain" | "PeeredVpc" | "LoadBalancer" | "LoadBalancerTlsCertificate" | "Disk" | "DiskSnapshot" | "RelationalDatabase" | "RelationalDatabaseSnapshot" | "ExportSnapshotRecord" | "CloudFormationStackRecord" | "Alarm" | "ContactMethod" | String */
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var addOns: AddOnList?
            get() = definedExternally
            set(value) = definedExternally
        var sizeInGb: integer?
            get() = definedExternally
            set(value) = definedExternally
        var isSystemDisk: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var iops: integer?
            get() = definedExternally
            set(value) = definedExternally
        var path: String?
            get() = definedExternally
            set(value) = definedExternally
        var state: String /* "pending" | "error" | "available" | "in-use" | "unknown" | String */
        var attachedTo: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var isAttached: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var attachmentState: String?
            get() = definedExternally
            set(value) = definedExternally
        var gbInUse: integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DiskInfo {
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var path: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var sizeInGb: integer?
            get() = definedExternally
            set(value) = definedExternally
        var isSystemDisk: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DiskMap {
        var originalDiskPath: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var newDiskName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DiskSnapshot {
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var supportCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var location: ResourceLocation?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "Instance" | "StaticIp" | "KeyPair" | "InstanceSnapshot" | "Domain" | "PeeredVpc" | "LoadBalancer" | "LoadBalancerTlsCertificate" | "Disk" | "DiskSnapshot" | "RelationalDatabase" | "RelationalDatabaseSnapshot" | "ExportSnapshotRecord" | "CloudFormationStackRecord" | "Alarm" | "ContactMethod" | String */
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var sizeInGb: integer?
            get() = definedExternally
            set(value) = definedExternally
        var state: String /* "pending" | "completed" | "error" | "unknown" | String */
        var progress: String?
            get() = definedExternally
            set(value) = definedExternally
        var fromDiskName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var fromDiskArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var fromInstanceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var fromInstanceArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var isFromAutoSnapshot: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DiskSnapshotInfo {
        var sizeInGb: integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Domain {
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var supportCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var location: ResourceLocation?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "Instance" | "StaticIp" | "KeyPair" | "InstanceSnapshot" | "Domain" | "PeeredVpc" | "LoadBalancer" | "LoadBalancerTlsCertificate" | "Disk" | "DiskSnapshot" | "RelationalDatabase" | "RelationalDatabaseSnapshot" | "ExportSnapshotRecord" | "CloudFormationStackRecord" | "Alarm" | "ContactMethod" | String */
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var domainEntries: DomainEntryList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DomainEntry {
        var id: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var name: DomainName?
            get() = definedExternally
            set(value) = definedExternally
        var target: String?
            get() = definedExternally
            set(value) = definedExternally
        var isAlias: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var type: DomainEntryType?
            get() = definedExternally
            set(value) = definedExternally
        var options: DomainEntryOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DomainEntryOptions {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface DownloadDefaultKeyPairRequest
    interface DownloadDefaultKeyPairResult {
        var publicKeyBase64: Base64?
            get() = definedExternally
            set(value) = definedExternally
        var privateKeyBase64: Base64?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnableAddOnRequest {
        var resourceName: ResourceName
        var addOnRequest: AddOnRequest
    }
    interface EnableAddOnResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExportSnapshotRecord {
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var location: ResourceLocation?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "Instance" | "StaticIp" | "KeyPair" | "InstanceSnapshot" | "Domain" | "PeeredVpc" | "LoadBalancer" | "LoadBalancerTlsCertificate" | "Disk" | "DiskSnapshot" | "RelationalDatabase" | "RelationalDatabaseSnapshot" | "ExportSnapshotRecord" | "CloudFormationStackRecord" | "Alarm" | "ContactMethod" | String */
        var state: String /* "Started" | "Succeeded" | "Failed" | String */
        var sourceInfo: ExportSnapshotRecordSourceInfo?
            get() = definedExternally
            set(value) = definedExternally
        var destinationInfo: DestinationInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExportSnapshotRecordSourceInfo {
        var resourceType: String /* "InstanceSnapshot" | "DiskSnapshot" | String */
        var createdAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var name: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var fromResourceName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var fromResourceArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var instanceSnapshotInfo: InstanceSnapshotInfo?
            get() = definedExternally
            set(value) = definedExternally
        var diskSnapshotInfo: DiskSnapshotInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExportSnapshotRequest {
        var sourceSnapshotName: ResourceName
    }
    interface ExportSnapshotResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetActiveNamesRequest {
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetActiveNamesResult {
        var activeNames: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAlarmsRequest {
        var alarmName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var monitoredResourceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAlarmsResult {
        var alarms: AlarmsList?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAutoSnapshotsRequest {
        var resourceName: ResourceName
    }
    interface GetAutoSnapshotsResult {
        var resourceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "Instance" | "StaticIp" | "KeyPair" | "InstanceSnapshot" | "Domain" | "PeeredVpc" | "LoadBalancer" | "LoadBalancerTlsCertificate" | "Disk" | "DiskSnapshot" | "RelationalDatabase" | "RelationalDatabaseSnapshot" | "ExportSnapshotRecord" | "CloudFormationStackRecord" | "Alarm" | "ContactMethod" | String */
        var autoSnapshots: AutoSnapshotDetailsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBlueprintsRequest {
        var includeInactive: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBlueprintsResult {
        var blueprints: BlueprintList?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBundlesRequest {
        var includeInactive: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBundlesResult {
        var bundles: BundleList?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCloudFormationStackRecordsRequest {
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCloudFormationStackRecordsResult {
        var cloudFormationStackRecords: CloudFormationStackRecordList?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetContactMethodsRequest {
        var protocols: ContactProtocolsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetContactMethodsResult {
        var contactMethods: ContactMethodsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDiskRequest {
        var diskName: ResourceName
    }
    interface GetDiskResult {
        var disk: Disk?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDiskSnapshotRequest {
        var diskSnapshotName: ResourceName
    }
    interface GetDiskSnapshotResult {
        var diskSnapshot: DiskSnapshot?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDiskSnapshotsRequest {
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDiskSnapshotsResult {
        var diskSnapshots: DiskSnapshotList?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDisksRequest {
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDisksResult {
        var disks: DiskList?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDomainRequest {
        var domainName: DomainName
    }
    interface GetDomainResult {
        var domain: Domain?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDomainsRequest {
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDomainsResult {
        var domains: DomainList?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetExportSnapshotRecordsRequest {
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetExportSnapshotRecordsResult {
        var exportSnapshotRecords: ExportSnapshotRecordList?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInstanceAccessDetailsRequest {
        var instanceName: ResourceName
        var protocol: String /* "ssh" | "rdp" | String */
    }
    interface GetInstanceAccessDetailsResult {
        var accessDetails: InstanceAccessDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInstanceMetricDataRequest {
        var instanceName: ResourceName
        var metricName: String /* "CPUUtilization" | "NetworkIn" | "NetworkOut" | "StatusCheckFailed" | "StatusCheckFailed_Instance" | "StatusCheckFailed_System" | String */
        var period: MetricPeriod
        var startTime: timestamp
        var endTime: timestamp
        var unit: String /* "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Count" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second" | "None" | String */
        var statistics: MetricStatisticList
    }
    interface GetInstanceMetricDataResult {
        var metricName: String /* "CPUUtilization" | "NetworkIn" | "NetworkOut" | "StatusCheckFailed" | "StatusCheckFailed_Instance" | "StatusCheckFailed_System" | String */
        var metricData: MetricDatapointList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInstancePortStatesRequest {
        var instanceName: ResourceName
    }
    interface GetInstancePortStatesResult {
        var portStates: InstancePortStateList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInstanceRequest {
        var instanceName: ResourceName
    }
    interface GetInstanceResult {
        var instance: Instance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInstanceSnapshotRequest {
        var instanceSnapshotName: ResourceName
    }
    interface GetInstanceSnapshotResult {
        var instanceSnapshot: InstanceSnapshot?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInstanceSnapshotsRequest {
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInstanceSnapshotsResult {
        var instanceSnapshots: InstanceSnapshotList?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInstanceStateRequest {
        var instanceName: ResourceName
    }
    interface GetInstanceStateResult {
        var state: InstanceState?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInstancesRequest {
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInstancesResult {
        var instances: InstanceList?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetKeyPairRequest {
        var keyPairName: ResourceName
    }
    interface GetKeyPairResult {
        var keyPair: KeyPair?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetKeyPairsRequest {
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetKeyPairsResult {
        var keyPairs: KeyPairList?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLoadBalancerMetricDataRequest {
        var loadBalancerName: ResourceName
        var metricName: String /* "ClientTLSNegotiationErrorCount" | "HealthyHostCount" | "UnhealthyHostCount" | "HTTPCode_LB_4XX_Count" | "HTTPCode_LB_5XX_Count" | "HTTPCode_Instance_2XX_Count" | "HTTPCode_Instance_3XX_Count" | "HTTPCode_Instance_4XX_Count" | "HTTPCode_Instance_5XX_Count" | "InstanceResponseTime" | "RejectedConnectionCount" | "RequestCount" | String */
        var period: MetricPeriod
        var startTime: timestamp
        var endTime: timestamp
        var unit: String /* "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Count" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second" | "None" | String */
        var statistics: MetricStatisticList
    }
    interface GetLoadBalancerMetricDataResult {
        var metricName: String /* "ClientTLSNegotiationErrorCount" | "HealthyHostCount" | "UnhealthyHostCount" | "HTTPCode_LB_4XX_Count" | "HTTPCode_LB_5XX_Count" | "HTTPCode_Instance_2XX_Count" | "HTTPCode_Instance_3XX_Count" | "HTTPCode_Instance_4XX_Count" | "HTTPCode_Instance_5XX_Count" | "InstanceResponseTime" | "RejectedConnectionCount" | "RequestCount" | String */
        var metricData: MetricDatapointList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLoadBalancerRequest {
        var loadBalancerName: ResourceName
    }
    interface GetLoadBalancerResult {
        var loadBalancer: LoadBalancer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLoadBalancerTlsCertificatesRequest {
        var loadBalancerName: ResourceName
    }
    interface GetLoadBalancerTlsCertificatesResult {
        var tlsCertificates: LoadBalancerTlsCertificateList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLoadBalancersRequest {
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLoadBalancersResult {
        var loadBalancers: LoadBalancerList?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOperationRequest {
        var operationId: NonEmptyString
    }
    interface GetOperationResult {
        var operation: Operation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOperationsForResourceRequest {
        var resourceName: ResourceName
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOperationsForResourceResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageCount: String?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOperationsRequest {
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOperationsResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRegionsRequest {
        var includeAvailabilityZones: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var includeRelationalDatabaseAvailabilityZones: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRegionsResult {
        var regions: RegionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRelationalDatabaseBlueprintsRequest {
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRelationalDatabaseBlueprintsResult {
        var blueprints: RelationalDatabaseBlueprintList?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRelationalDatabaseBundlesRequest {
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRelationalDatabaseBundlesResult {
        var bundles: RelationalDatabaseBundleList?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRelationalDatabaseEventsRequest {
        var relationalDatabaseName: ResourceName
        var durationInMinutes: integer?
            get() = definedExternally
            set(value) = definedExternally
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRelationalDatabaseEventsResult {
        var relationalDatabaseEvents: RelationalDatabaseEventList?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRelationalDatabaseLogEventsRequest {
        var relationalDatabaseName: ResourceName
        var logStreamName: String
        var startTime: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var endTime: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var startFromHead: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRelationalDatabaseLogEventsResult {
        var resourceLogEvents: LogEventList?
            get() = definedExternally
            set(value) = definedExternally
        var nextBackwardToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var nextForwardToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRelationalDatabaseLogStreamsRequest {
        var relationalDatabaseName: ResourceName
    }
    interface GetRelationalDatabaseLogStreamsResult {
        var logStreams: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRelationalDatabaseMasterUserPasswordRequest {
        var relationalDatabaseName: ResourceName
        var passwordVersion: String /* "CURRENT" | "PREVIOUS" | "PENDING" | String */
    }
    interface GetRelationalDatabaseMasterUserPasswordResult {
        var masterUserPassword: SensitiveString?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRelationalDatabaseMetricDataRequest {
        var relationalDatabaseName: ResourceName
        var metricName: String /* "CPUUtilization" | "DatabaseConnections" | "DiskQueueDepth" | "FreeStorageSpace" | "NetworkReceiveThroughput" | "NetworkTransmitThroughput" | String */
        var period: MetricPeriod
        var startTime: IsoDate
        var endTime: IsoDate
        var unit: String /* "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Count" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second" | "None" | String */
        var statistics: MetricStatisticList
    }
    interface GetRelationalDatabaseMetricDataResult {
        var metricName: String /* "CPUUtilization" | "DatabaseConnections" | "DiskQueueDepth" | "FreeStorageSpace" | "NetworkReceiveThroughput" | "NetworkTransmitThroughput" | String */
        var metricData: MetricDatapointList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRelationalDatabaseParametersRequest {
        var relationalDatabaseName: ResourceName
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRelationalDatabaseParametersResult {
        var parameters: RelationalDatabaseParameterList?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRelationalDatabaseRequest {
        var relationalDatabaseName: ResourceName
    }
    interface GetRelationalDatabaseResult {
        var relationalDatabase: RelationalDatabase?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRelationalDatabaseSnapshotRequest {
        var relationalDatabaseSnapshotName: ResourceName
    }
    interface GetRelationalDatabaseSnapshotResult {
        var relationalDatabaseSnapshot: RelationalDatabaseSnapshot?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRelationalDatabaseSnapshotsRequest {
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRelationalDatabaseSnapshotsResult {
        var relationalDatabaseSnapshots: RelationalDatabaseSnapshotList?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRelationalDatabasesRequest {
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRelationalDatabasesResult {
        var relationalDatabases: RelationalDatabaseList?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetStaticIpRequest {
        var staticIpName: ResourceName
    }
    interface GetStaticIpResult {
        var staticIp: StaticIp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetStaticIpsRequest {
        var pageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetStaticIpsResult {
        var staticIps: StaticIpList?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HostKeyAttributes {
        var algorithm: String?
            get() = definedExternally
            set(value) = definedExternally
        var publicKey: String?
            get() = definedExternally
            set(value) = definedExternally
        var witnessedAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var fingerprintSHA1: String?
            get() = definedExternally
            set(value) = definedExternally
        var fingerprintSHA256: String?
            get() = definedExternally
            set(value) = definedExternally
        var notValidBefore: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var notValidAfter: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportKeyPairRequest {
        var keyPairName: ResourceName
        var publicKeyBase64: Base64
    }
    interface ImportKeyPairResult {
        var operation: Operation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Instance {
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var supportCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var location: ResourceLocation?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "Instance" | "StaticIp" | "KeyPair" | "InstanceSnapshot" | "Domain" | "PeeredVpc" | "LoadBalancer" | "LoadBalancerTlsCertificate" | "Disk" | "DiskSnapshot" | "RelationalDatabase" | "RelationalDatabaseSnapshot" | "ExportSnapshotRecord" | "CloudFormationStackRecord" | "Alarm" | "ContactMethod" | String */
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var blueprintId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var blueprintName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var bundleId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var addOns: AddOnList?
            get() = definedExternally
            set(value) = definedExternally
        var isStaticIp: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var privateIpAddress: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
        var publicIpAddress: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
        var ipv6Address: IpV6Address?
            get() = definedExternally
            set(value) = definedExternally
        var hardware: InstanceHardware?
            get() = definedExternally
            set(value) = definedExternally
        var networking: InstanceNetworking?
            get() = definedExternally
            set(value) = definedExternally
        var state: InstanceState?
            get() = definedExternally
            set(value) = definedExternally
        var username: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var sshKeyName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceAccessDetails {
        var certKey: String?
            get() = definedExternally
            set(value) = definedExternally
        var expiresAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var ipAddress: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
        var password: String?
            get() = definedExternally
            set(value) = definedExternally
        var passwordData: PasswordData?
            get() = definedExternally
            set(value) = definedExternally
        var privateKey: String?
            get() = definedExternally
            set(value) = definedExternally
        var protocol: String /* "ssh" | "rdp" | String */
        var instanceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var username: String?
            get() = definedExternally
            set(value) = definedExternally
        var hostKeys: HostKeysList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceEntry {
        var sourceName: ResourceName
        var instanceType: NonEmptyString
        var portInfoSource: String /* "DEFAULT" | "INSTANCE" | "NONE" | "CLOSED" | String */
        var userData: String?
            get() = definedExternally
            set(value) = definedExternally
        var availabilityZone: String
    }
    interface InstanceHardware {
        var cpuCount: integer?
            get() = definedExternally
            set(value) = definedExternally
        var disks: DiskList?
            get() = definedExternally
            set(value) = definedExternally
        var ramSizeInGb: float?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceHealthSummary {
        var instanceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var instanceHealth: String /* "initial" | "healthy" | "unhealthy" | "unused" | "draining" | "unavailable" | String */
        var instanceHealthReason: String /* "Lb.RegistrationInProgress" | "Lb.InitialHealthChecking" | "Lb.InternalError" | "Instance.ResponseCodeMismatch" | "Instance.Timeout" | "Instance.FailedHealthChecks" | "Instance.NotRegistered" | "Instance.NotInUse" | "Instance.DeregistrationInProgress" | "Instance.InvalidState" | "Instance.IpUnusable" | String */
    }
    interface InstanceNetworking {
        var monthlyTransfer: MonthlyTransfer?
            get() = definedExternally
            set(value) = definedExternally
        var ports: InstancePortInfoList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstancePortInfo {
        var fromPort: Port?
            get() = definedExternally
            set(value) = definedExternally
        var toPort: Port?
            get() = definedExternally
            set(value) = definedExternally
        var protocol: String /* "tcp" | "all" | "udp" | String */
        var accessFrom: String?
            get() = definedExternally
            set(value) = definedExternally
        var accessType: String /* "Public" | "Private" | String */
        var commonName: String?
            get() = definedExternally
            set(value) = definedExternally
        var accessDirection: String /* "inbound" | "outbound" | String */
    }
    interface InstancePortState {
        var fromPort: Port?
            get() = definedExternally
            set(value) = definedExternally
        var toPort: Port?
            get() = definedExternally
            set(value) = definedExternally
        var protocol: String /* "tcp" | "all" | "udp" | String */
        var state: String /* "open" | "closed" | String */
    }
    interface InstanceSnapshot {
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var supportCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var location: ResourceLocation?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "Instance" | "StaticIp" | "KeyPair" | "InstanceSnapshot" | "Domain" | "PeeredVpc" | "LoadBalancer" | "LoadBalancerTlsCertificate" | "Disk" | "DiskSnapshot" | "RelationalDatabase" | "RelationalDatabaseSnapshot" | "ExportSnapshotRecord" | "CloudFormationStackRecord" | "Alarm" | "ContactMethod" | String */
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var state: String /* "pending" | "error" | "available" | String */
        var progress: String?
            get() = definedExternally
            set(value) = definedExternally
        var fromAttachedDisks: DiskList?
            get() = definedExternally
            set(value) = definedExternally
        var fromInstanceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var fromInstanceArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var fromBlueprintId: String?
            get() = definedExternally
            set(value) = definedExternally
        var fromBundleId: String?
            get() = definedExternally
            set(value) = definedExternally
        var isFromAutoSnapshot: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var sizeInGb: integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceSnapshotInfo {
        var fromBundleId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var fromBlueprintId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var fromDiskInfo: DiskInfoList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceState {
        var code: integer?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IsVpcPeeredRequest
    interface IsVpcPeeredResult {
        var isPeered: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KeyPair {
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var supportCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var location: ResourceLocation?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "Instance" | "StaticIp" | "KeyPair" | "InstanceSnapshot" | "Domain" | "PeeredVpc" | "LoadBalancer" | "LoadBalancerTlsCertificate" | "Disk" | "DiskSnapshot" | "RelationalDatabase" | "RelationalDatabaseSnapshot" | "ExportSnapshotRecord" | "CloudFormationStackRecord" | "Alarm" | "ContactMethod" | String */
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var fingerprint: Base64?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoadBalancer {
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var supportCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var location: ResourceLocation?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "Instance" | "StaticIp" | "KeyPair" | "InstanceSnapshot" | "Domain" | "PeeredVpc" | "LoadBalancer" | "LoadBalancerTlsCertificate" | "Disk" | "DiskSnapshot" | "RelationalDatabase" | "RelationalDatabaseSnapshot" | "ExportSnapshotRecord" | "CloudFormationStackRecord" | "Alarm" | "ContactMethod" | String */
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var dnsName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var state: String /* "active" | "provisioning" | "active_impaired" | "failed" | "unknown" | String */
        var protocol: String /* "HTTP_HTTPS" | "HTTP" | String */
        var publicPorts: PortList?
            get() = definedExternally
            set(value) = definedExternally
        var healthCheckPath: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var instancePort: integer?
            get() = definedExternally
            set(value) = definedExternally
        var instanceHealthSummary: InstanceHealthSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var tlsCertificateSummaries: LoadBalancerTlsCertificateSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var configurationOptions: LoadBalancerConfigurationOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoadBalancerConfigurationOptions {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface LoadBalancerTlsCertificate {
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var supportCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var location: ResourceLocation?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "Instance" | "StaticIp" | "KeyPair" | "InstanceSnapshot" | "Domain" | "PeeredVpc" | "LoadBalancer" | "LoadBalancerTlsCertificate" | "Disk" | "DiskSnapshot" | "RelationalDatabase" | "RelationalDatabaseSnapshot" | "ExportSnapshotRecord" | "CloudFormationStackRecord" | "Alarm" | "ContactMethod" | String */
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var loadBalancerName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var isAttached: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "PENDING_VALIDATION" | "ISSUED" | "INACTIVE" | "EXPIRED" | "VALIDATION_TIMED_OUT" | "REVOKED" | "FAILED" | "UNKNOWN" | String */
        var domainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
        var domainValidationRecords: LoadBalancerTlsCertificateDomainValidationRecordList?
            get() = definedExternally
            set(value) = definedExternally
        var failureReason: String /* "NO_AVAILABLE_CONTACTS" | "ADDITIONAL_VERIFICATION_REQUIRED" | "DOMAIN_NOT_ALLOWED" | "INVALID_PUBLIC_DOMAIN" | "OTHER" | String */
        var issuedAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var issuer: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var keyAlgorithm: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var notAfter: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var notBefore: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var renewalSummary: LoadBalancerTlsCertificateRenewalSummary?
            get() = definedExternally
            set(value) = definedExternally
        var revocationReason: String /* "UNSPECIFIED" | "KEY_COMPROMISE" | "CA_COMPROMISE" | "AFFILIATION_CHANGED" | "SUPERCEDED" | "CESSATION_OF_OPERATION" | "CERTIFICATE_HOLD" | "REMOVE_FROM_CRL" | "PRIVILEGE_WITHDRAWN" | "A_A_COMPROMISE" | String */
        var revokedAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var serial: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var signatureAlgorithm: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var subject: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var subjectAlternativeNames: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoadBalancerTlsCertificateDomainValidationOption {
        var domainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
        var validationStatus: String /* "PENDING_VALIDATION" | "FAILED" | "SUCCESS" | String */
    }
    interface LoadBalancerTlsCertificateDomainValidationRecord {
        var name: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var type: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var value: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var validationStatus: String /* "PENDING_VALIDATION" | "FAILED" | "SUCCESS" | String */
        var domainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoadBalancerTlsCertificateRenewalSummary {
        var renewalStatus: String /* "PENDING_AUTO_RENEWAL" | "PENDING_VALIDATION" | "SUCCESS" | "FAILED" | String */
        var domainValidationOptions: LoadBalancerTlsCertificateDomainValidationOptionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoadBalancerTlsCertificateSummary {
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var isAttached: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogEvent {
        var createdAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MetricDatapoint {
        var average: double?
            get() = definedExternally
            set(value) = definedExternally
        var maximum: double?
            get() = definedExternally
            set(value) = definedExternally
        var minimum: double?
            get() = definedExternally
            set(value) = definedExternally
        var sampleCount: double?
            get() = definedExternally
            set(value) = definedExternally
        var sum: double?
            get() = definedExternally
            set(value) = definedExternally
        var timestamp: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var unit: String /* "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Count" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second" | "None" | String */
    }
    interface MonitoredResourceInfo {
        var arn: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "Instance" | "StaticIp" | "KeyPair" | "InstanceSnapshot" | "Domain" | "PeeredVpc" | "LoadBalancer" | "LoadBalancerTlsCertificate" | "Disk" | "DiskSnapshot" | "RelationalDatabase" | "RelationalDatabaseSnapshot" | "ExportSnapshotRecord" | "CloudFormationStackRecord" | "Alarm" | "ContactMethod" | String */
    }
    interface MonthlyTransfer {
        var gbPerMonthAllocated: integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OpenInstancePublicPortsRequest {
        var portInfo: PortInfo
        var instanceName: ResourceName
    }
    interface OpenInstancePublicPortsResult {
        var operation: Operation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Operation {
        var id: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var resourceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "Instance" | "StaticIp" | "KeyPair" | "InstanceSnapshot" | "Domain" | "PeeredVpc" | "LoadBalancer" | "LoadBalancerTlsCertificate" | "Disk" | "DiskSnapshot" | "RelationalDatabase" | "RelationalDatabaseSnapshot" | "ExportSnapshotRecord" | "CloudFormationStackRecord" | "Alarm" | "ContactMethod" | String */
        var createdAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var location: ResourceLocation?
            get() = definedExternally
            set(value) = definedExternally
        var isTerminal: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var operationDetails: String?
            get() = definedExternally
            set(value) = definedExternally
        var operationType: String /* "DeleteKnownHostKeys" | "DeleteInstance" | "CreateInstance" | "StopInstance" | "StartInstance" | "RebootInstance" | "OpenInstancePublicPorts" | "PutInstancePublicPorts" | "CloseInstancePublicPorts" | "AllocateStaticIp" | "ReleaseStaticIp" | "AttachStaticIp" | "DetachStaticIp" | "UpdateDomainEntry" | "DeleteDomainEntry" | "CreateDomain" | "DeleteDomain" | "CreateInstanceSnapshot" | "DeleteInstanceSnapshot" | "CreateInstancesFromSnapshot" | "CreateLoadBalancer" | "DeleteLoadBalancer" | "AttachInstancesToLoadBalancer" | "DetachInstancesFromLoadBalancer" | "UpdateLoadBalancerAttribute" | "CreateLoadBalancerTlsCertificate" | "DeleteLoadBalancerTlsCertificate" | "AttachLoadBalancerTlsCertificate" | "CreateDisk" | "DeleteDisk" | "AttachDisk" | "DetachDisk" | "CreateDiskSnapshot" | "DeleteDiskSnapshot" | "CreateDiskFromSnapshot" | "CreateRelationalDatabase" | "UpdateRelationalDatabase" | "DeleteRelationalDatabase" | "CreateRelationalDatabaseFromSnapshot" | "CreateRelationalDatabaseSnapshot" | "DeleteRelationalDatabaseSnapshot" | "UpdateRelationalDatabaseParameters" | "StartRelationalDatabase" | "RebootRelationalDatabase" | "StopRelationalDatabase" | "EnableAddOn" | "DisableAddOn" | "PutAlarm" | "GetAlarms" | "DeleteAlarm" | "TestAlarm" | "CreateContactMethod" | "GetContactMethods" | "SendContactMethodVerification" | "DeleteContactMethod" | String */
        var status: String /* "NotStarted" | "Started" | "Failed" | "Completed" | "Succeeded" | String */
        var statusChangedAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var errorCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var errorDetails: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PasswordData {
        var ciphertext: String?
            get() = definedExternally
            set(value) = definedExternally
        var keyPairName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PeerVpcRequest
    interface PeerVpcResult {
        var operation: Operation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PendingMaintenanceAction {
        var action: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var currentApplyDate: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PendingModifiedRelationalDatabaseValues {
        var masterUserPassword: String?
            get() = definedExternally
            set(value) = definedExternally
        var engineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var backupRetentionEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PortInfo {
        var fromPort: Port?
            get() = definedExternally
            set(value) = definedExternally
        var toPort: Port?
            get() = definedExternally
            set(value) = definedExternally
        var protocol: String /* "tcp" | "all" | "udp" | String */
    }
    interface PutAlarmRequest {
        var alarmName: ResourceName
        var metricName: String /* "CPUUtilization" | "NetworkIn" | "NetworkOut" | "StatusCheckFailed" | "StatusCheckFailed_Instance" | "StatusCheckFailed_System" | "ClientTLSNegotiationErrorCount" | "HealthyHostCount" | "UnhealthyHostCount" | "HTTPCode_LB_4XX_Count" | "HTTPCode_LB_5XX_Count" | "HTTPCode_Instance_2XX_Count" | "HTTPCode_Instance_3XX_Count" | "HTTPCode_Instance_4XX_Count" | "HTTPCode_Instance_5XX_Count" | "InstanceResponseTime" | "RejectedConnectionCount" | "RequestCount" | "DatabaseConnections" | "DiskQueueDepth" | "FreeStorageSpace" | "NetworkReceiveThroughput" | "NetworkTransmitThroughput" | String */
        var monitoredResourceName: ResourceName
        var comparisonOperator: String /* "GreaterThanOrEqualToThreshold" | "GreaterThanThreshold" | "LessThanThreshold" | "LessThanOrEqualToThreshold" | String */
        var threshold: double
        var evaluationPeriods: integer
        var datapointsToAlarm: integer?
            get() = definedExternally
            set(value) = definedExternally
        var treatMissingData: String /* "breaching" | "notBreaching" | "ignore" | "missing" | String */
        var contactProtocols: ContactProtocolsList?
            get() = definedExternally
            set(value) = definedExternally
        var notificationTriggers: NotificationTriggerList?
            get() = definedExternally
            set(value) = definedExternally
        var notificationEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutAlarmResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutInstancePublicPortsRequest {
        var portInfos: PortInfoList
        var instanceName: ResourceName
    }
    interface PutInstancePublicPortsResult {
        var operation: Operation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RebootInstanceRequest {
        var instanceName: ResourceName
    }
    interface RebootInstanceResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RebootRelationalDatabaseRequest {
        var relationalDatabaseName: ResourceName
    }
    interface RebootRelationalDatabaseResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Region {
        var continentCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var displayName: String?
            get() = definedExternally
            set(value) = definedExternally
        var name: String /* "us-east-1" | "us-east-2" | "us-west-1" | "us-west-2" | "eu-west-1" | "eu-west-2" | "eu-west-3" | "eu-central-1" | "ca-central-1" | "ap-south-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-northeast-1" | "ap-northeast-2" | String */
        var availabilityZones: AvailabilityZoneList?
            get() = definedExternally
            set(value) = definedExternally
        var relationalDatabaseAvailabilityZones: AvailabilityZoneList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RelationalDatabase {
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var supportCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var location: ResourceLocation?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "Instance" | "StaticIp" | "KeyPair" | "InstanceSnapshot" | "Domain" | "PeeredVpc" | "LoadBalancer" | "LoadBalancerTlsCertificate" | "Disk" | "DiskSnapshot" | "RelationalDatabase" | "RelationalDatabaseSnapshot" | "ExportSnapshotRecord" | "CloudFormationStackRecord" | "Alarm" | "ContactMethod" | String */
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var relationalDatabaseBlueprintId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var relationalDatabaseBundleId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var masterDatabaseName: String?
            get() = definedExternally
            set(value) = definedExternally
        var hardware: RelationalDatabaseHardware?
            get() = definedExternally
            set(value) = definedExternally
        var state: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var secondaryAvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var backupRetentionEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var pendingModifiedValues: PendingModifiedRelationalDatabaseValues?
            get() = definedExternally
            set(value) = definedExternally
        var engine: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var engineVersion: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var latestRestorableTime: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var masterUsername: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var parameterApplyStatus: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var preferredBackupWindow: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var preferredMaintenanceWindow: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var publiclyAccessible: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var masterEndpoint: RelationalDatabaseEndpoint?
            get() = definedExternally
            set(value) = definedExternally
        var pendingMaintenanceActions: PendingMaintenanceActionList?
            get() = definedExternally
            set(value) = definedExternally
        var caCertificateIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RelationalDatabaseBlueprint {
        var blueprintId: String?
            get() = definedExternally
            set(value) = definedExternally
        var engine: String /* "mysql" | String */
        var engineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var engineDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var engineVersionDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var isEngineDefault: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RelationalDatabaseBundle {
        var bundleId: String?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var price: float?
            get() = definedExternally
            set(value) = definedExternally
        var ramSizeInGb: float?
            get() = definedExternally
            set(value) = definedExternally
        var diskSizeInGb: integer?
            get() = definedExternally
            set(value) = definedExternally
        var transferPerMonthInGb: integer?
            get() = definedExternally
            set(value) = definedExternally
        var cpuCount: integer?
            get() = definedExternally
            set(value) = definedExternally
        var isEncrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var isActive: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RelationalDatabaseEndpoint {
        var port: integer?
            get() = definedExternally
            set(value) = definedExternally
        var address: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RelationalDatabaseEvent {
        var resource: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var message: String?
            get() = definedExternally
            set(value) = definedExternally
        var eventCategories: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RelationalDatabaseHardware {
        var cpuCount: integer?
            get() = definedExternally
            set(value) = definedExternally
        var diskSizeInGb: integer?
            get() = definedExternally
            set(value) = definedExternally
        var ramSizeInGb: float?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RelationalDatabaseParameter {
        var allowedValues: String?
            get() = definedExternally
            set(value) = definedExternally
        var applyMethod: String?
            get() = definedExternally
            set(value) = definedExternally
        var applyType: String?
            get() = definedExternally
            set(value) = definedExternally
        var dataType: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var isModifiable: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var parameterName: String?
            get() = definedExternally
            set(value) = definedExternally
        var parameterValue: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RelationalDatabaseSnapshot {
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var supportCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var location: ResourceLocation?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "Instance" | "StaticIp" | "KeyPair" | "InstanceSnapshot" | "Domain" | "PeeredVpc" | "LoadBalancer" | "LoadBalancerTlsCertificate" | "Disk" | "DiskSnapshot" | "RelationalDatabase" | "RelationalDatabaseSnapshot" | "ExportSnapshotRecord" | "CloudFormationStackRecord" | "Alarm" | "ContactMethod" | String */
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var engine: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var engineVersion: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var sizeInGb: integer?
            get() = definedExternally
            set(value) = definedExternally
        var state: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var fromRelationalDatabaseName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var fromRelationalDatabaseArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var fromRelationalDatabaseBundleId: String?
            get() = definedExternally
            set(value) = definedExternally
        var fromRelationalDatabaseBlueprintId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReleaseStaticIpRequest {
        var staticIpName: ResourceName
    }
    interface ReleaseStaticIpResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceLocation {
        var availabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var regionName: String /* "us-east-1" | "us-east-2" | "us-west-1" | "us-west-2" | "eu-west-1" | "eu-west-2" | "eu-west-3" | "eu-central-1" | "ca-central-1" | "ap-south-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-northeast-1" | "ap-northeast-2" | String */
    }
    interface SendContactMethodVerificationRequest {
        var protocol: String /* "Email" | String */
    }
    interface SendContactMethodVerificationResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartInstanceRequest {
        var instanceName: ResourceName
    }
    interface StartInstanceResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartRelationalDatabaseRequest {
        var relationalDatabaseName: ResourceName
    }
    interface StartRelationalDatabaseResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StaticIp {
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var supportCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: IsoDate?
            get() = definedExternally
            set(value) = definedExternally
        var location: ResourceLocation?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "Instance" | "StaticIp" | "KeyPair" | "InstanceSnapshot" | "Domain" | "PeeredVpc" | "LoadBalancer" | "LoadBalancerTlsCertificate" | "Disk" | "DiskSnapshot" | "RelationalDatabase" | "RelationalDatabaseSnapshot" | "ExportSnapshotRecord" | "CloudFormationStackRecord" | "Alarm" | "ContactMethod" | String */
        var ipAddress: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
        var attachedTo: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var isAttached: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopInstanceRequest {
        var instanceName: ResourceName
        var force: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopInstanceResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopRelationalDatabaseRequest {
        var relationalDatabaseName: ResourceName
        var relationalDatabaseSnapshotName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopRelationalDatabaseResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var key: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var resourceName: ResourceName
        var resourceArn: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList
    }
    interface TagResourceResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestAlarmRequest {
        var alarmName: ResourceName
        var state: String /* "OK" | "ALARM" | "INSUFFICIENT_DATA" | String */
    }
    interface TestAlarmResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UnpeerVpcRequest
    interface UnpeerVpcResult {
        var operation: Operation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceRequest {
        var resourceName: ResourceName
        var resourceArn: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
        var tagKeys: TagKeyList
    }
    interface UntagResourceResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDomainEntryRequest {
        var domainName: DomainName
        var domainEntry: DomainEntry
    }
    interface UpdateDomainEntryResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateLoadBalancerAttributeRequest {
        var loadBalancerName: ResourceName
        var attributeName: String /* "HealthCheckPath" | "SessionStickinessEnabled" | "SessionStickiness_LB_CookieDurationSeconds" | String */
        var attributeValue: StringMax256
    }
    interface UpdateLoadBalancerAttributeResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRelationalDatabaseParametersRequest {
        var relationalDatabaseName: ResourceName
        var parameters: RelationalDatabaseParameterList
    }
    interface UpdateRelationalDatabaseParametersResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRelationalDatabaseRequest {
        var relationalDatabaseName: ResourceName
        var masterUserPassword: SensitiveString?
            get() = definedExternally
            set(value) = definedExternally
        var rotateMasterUserPassword: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var preferredBackupWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var preferredMaintenanceWindow: String?
            get() = definedExternally
            set(value) = definedExternally
        var enableBackupRetention: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var disableBackupRetention: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var publiclyAccessible: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var applyImmediately: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var caCertificateIdentifier: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRelationalDatabaseResult {
        var operations: OperationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2016-11-28" | "latest" | String */
    }
}