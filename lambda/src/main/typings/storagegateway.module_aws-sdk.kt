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
import StorageGateway.CachediSCSIVolume
import StorageGateway.ChapInfo
import StorageGateway.Disk
import StorageGateway.FileShareInfo
import StorageGateway.NetworkInterface
import StorageGateway.GatewayInfo
import StorageGateway.NFSFileShareInfo
import StorageGateway.SMBFileShareInfo
import StorageGateway.StorediSCSIVolume
import StorageGateway.Tag
import StorageGateway.TapeArchive
import StorageGateway.TapeInfo
import StorageGateway.TapeRecoveryPointInfo
import StorageGateway.Tape
import StorageGateway.VTLDevice
import StorageGateway.VolumeInfo
import StorageGateway.VolumeRecoveryPointInfo
import StorageGateway.ActivateGatewayInput
import StorageGateway.ActivateGatewayOutput
import StorageGateway.AddCacheInput
import StorageGateway.AddCacheOutput
import StorageGateway.AddTagsToResourceInput
import StorageGateway.AddTagsToResourceOutput
import StorageGateway.AddUploadBufferInput
import StorageGateway.AddUploadBufferOutput
import StorageGateway.AddWorkingStorageInput
import StorageGateway.AddWorkingStorageOutput
import StorageGateway.AssignTapePoolInput
import StorageGateway.AssignTapePoolOutput
import StorageGateway.AttachVolumeInput
import StorageGateway.AttachVolumeOutput
import StorageGateway.CancelArchivalInput
import StorageGateway.CancelArchivalOutput
import StorageGateway.CancelRetrievalInput
import StorageGateway.CancelRetrievalOutput
import StorageGateway.CreateCachediSCSIVolumeInput
import StorageGateway.CreateCachediSCSIVolumeOutput
import StorageGateway.CreateNFSFileShareInput
import StorageGateway.CreateNFSFileShareOutput
import StorageGateway.CreateSMBFileShareInput
import StorageGateway.CreateSMBFileShareOutput
import StorageGateway.CreateSnapshotInput
import StorageGateway.CreateSnapshotOutput
import StorageGateway.CreateSnapshotFromVolumeRecoveryPointInput
import StorageGateway.CreateSnapshotFromVolumeRecoveryPointOutput
import StorageGateway.CreateStorediSCSIVolumeInput
import StorageGateway.CreateStorediSCSIVolumeOutput
import StorageGateway.CreateTapeWithBarcodeInput
import StorageGateway.CreateTapeWithBarcodeOutput
import StorageGateway.CreateTapesInput
import StorageGateway.CreateTapesOutput
import StorageGateway.DeleteBandwidthRateLimitInput
import StorageGateway.DeleteBandwidthRateLimitOutput
import StorageGateway.DeleteChapCredentialsInput
import StorageGateway.DeleteChapCredentialsOutput
import StorageGateway.DeleteFileShareInput
import StorageGateway.DeleteFileShareOutput
import StorageGateway.DeleteGatewayInput
import StorageGateway.DeleteGatewayOutput
import StorageGateway.DeleteSnapshotScheduleInput
import StorageGateway.DeleteSnapshotScheduleOutput
import StorageGateway.DeleteTapeInput
import StorageGateway.DeleteTapeOutput
import StorageGateway.DeleteTapeArchiveInput
import StorageGateway.DeleteTapeArchiveOutput
import StorageGateway.DeleteVolumeInput
import StorageGateway.DeleteVolumeOutput
import StorageGateway.DescribeAvailabilityMonitorTestInput
import StorageGateway.DescribeAvailabilityMonitorTestOutput
import StorageGateway.DescribeBandwidthRateLimitInput
import StorageGateway.DescribeBandwidthRateLimitOutput
import StorageGateway.DescribeCacheInput
import StorageGateway.DescribeCacheOutput
import StorageGateway.DescribeCachediSCSIVolumesInput
import StorageGateway.DescribeCachediSCSIVolumesOutput
import StorageGateway.DescribeChapCredentialsInput
import StorageGateway.DescribeChapCredentialsOutput
import StorageGateway.DescribeGatewayInformationInput
import StorageGateway.DescribeGatewayInformationOutput
import StorageGateway.DescribeMaintenanceStartTimeInput
import StorageGateway.DescribeMaintenanceStartTimeOutput
import StorageGateway.DescribeNFSFileSharesInput
import StorageGateway.DescribeNFSFileSharesOutput
import StorageGateway.DescribeSMBFileSharesInput
import StorageGateway.DescribeSMBFileSharesOutput
import StorageGateway.DescribeSMBSettingsInput
import StorageGateway.DescribeSMBSettingsOutput
import StorageGateway.DescribeSnapshotScheduleInput
import StorageGateway.DescribeSnapshotScheduleOutput
import StorageGateway.DescribeStorediSCSIVolumesInput
import StorageGateway.DescribeStorediSCSIVolumesOutput
import StorageGateway.DescribeTapeArchivesInput
import StorageGateway.DescribeTapeArchivesOutput
import StorageGateway.DescribeTapeRecoveryPointsInput
import StorageGateway.DescribeTapeRecoveryPointsOutput
import StorageGateway.DescribeTapesInput
import StorageGateway.DescribeTapesOutput
import StorageGateway.DescribeUploadBufferInput
import StorageGateway.DescribeUploadBufferOutput
import StorageGateway.DescribeVTLDevicesInput
import StorageGateway.DescribeVTLDevicesOutput
import StorageGateway.DescribeWorkingStorageInput
import StorageGateway.DescribeWorkingStorageOutput
import StorageGateway.DetachVolumeInput
import StorageGateway.DetachVolumeOutput
import StorageGateway.DisableGatewayInput
import StorageGateway.DisableGatewayOutput
import StorageGateway.JoinDomainInput
import StorageGateway.JoinDomainOutput
import StorageGateway.ListFileSharesInput
import StorageGateway.ListFileSharesOutput
import StorageGateway.ListGatewaysInput
import StorageGateway.ListGatewaysOutput
import StorageGateway.ListLocalDisksInput
import StorageGateway.ListLocalDisksOutput
import StorageGateway.ListTagsForResourceInput
import StorageGateway.ListTagsForResourceOutput
import StorageGateway.ListTapesInput
import StorageGateway.ListTapesOutput
import StorageGateway.ListVolumeInitiatorsInput
import StorageGateway.ListVolumeInitiatorsOutput
import StorageGateway.ListVolumeRecoveryPointsInput
import StorageGateway.ListVolumeRecoveryPointsOutput
import StorageGateway.ListVolumesInput
import StorageGateway.ListVolumesOutput
import StorageGateway.NotifyWhenUploadedInput
import StorageGateway.NotifyWhenUploadedOutput
import StorageGateway.RefreshCacheInput
import StorageGateway.RefreshCacheOutput
import StorageGateway.RemoveTagsFromResourceInput
import StorageGateway.RemoveTagsFromResourceOutput
import StorageGateway.ResetCacheInput
import StorageGateway.ResetCacheOutput
import StorageGateway.RetrieveTapeArchiveInput
import StorageGateway.RetrieveTapeArchiveOutput
import StorageGateway.RetrieveTapeRecoveryPointInput
import StorageGateway.RetrieveTapeRecoveryPointOutput
import StorageGateway.SetLocalConsolePasswordInput
import StorageGateway.SetLocalConsolePasswordOutput
import StorageGateway.SetSMBGuestPasswordInput
import StorageGateway.SetSMBGuestPasswordOutput
import StorageGateway.ShutdownGatewayInput
import StorageGateway.ShutdownGatewayOutput
import StorageGateway.StartAvailabilityMonitorTestInput
import StorageGateway.StartAvailabilityMonitorTestOutput
import StorageGateway.StartGatewayInput
import StorageGateway.StartGatewayOutput
import StorageGateway.UpdateBandwidthRateLimitInput
import StorageGateway.UpdateBandwidthRateLimitOutput
import StorageGateway.UpdateChapCredentialsInput
import StorageGateway.UpdateChapCredentialsOutput
import StorageGateway.UpdateGatewayInformationInput
import StorageGateway.UpdateGatewayInformationOutput
import StorageGateway.UpdateGatewaySoftwareNowInput
import StorageGateway.UpdateGatewaySoftwareNowOutput
import StorageGateway.UpdateMaintenanceStartTimeInput
import StorageGateway.UpdateMaintenanceStartTimeOutput
import StorageGateway.UpdateNFSFileShareInput
import StorageGateway.UpdateNFSFileShareOutput
import StorageGateway.UpdateSMBFileShareInput
import StorageGateway.UpdateSMBFileShareOutput
import StorageGateway.UpdateSMBSecurityStrategyInput
import StorageGateway.UpdateSMBSecurityStrategyOutput
import StorageGateway.UpdateSnapshotScheduleInput
import StorageGateway.UpdateSnapshotScheduleOutput
import StorageGateway.UpdateVTLDeviceTypeInput
import StorageGateway.UpdateVTLDeviceTypeOutput
import StorageGateway.VolumeiSCSIAttributes
import StorageGateway.NFSFileShareDefaults
import StorageGateway.DeviceiSCSIAttributes

typealias ActivationKey = String

typealias Authentication = String

typealias BandwidthDownloadRateLimit = Number

typealias BandwidthType = String

typealias BandwidthUploadRateLimit = Number

typealias Boolean = Boolean

typealias CachediSCSIVolumes = Array<CachediSCSIVolume>

typealias ChapCredentials = Array<ChapInfo>

typealias ChapSecret = String

typealias ClientToken = String

typealias CloudWatchLogGroupARN = String

typealias CreatedDate = Date

typealias DayOfMonth = Number

typealias DayOfWeek = Number

typealias Description = String

typealias DeviceType = String

typealias DiskAllocationType = String

typealias DiskAttribute = String

typealias DiskAttributeList = Array<DiskAttribute>

typealias DiskId = String

typealias DiskIds = Array<DiskId>

typealias Disks = Array<Disk>

typealias DomainName = String

typealias DomainUserName = String

typealias DomainUserPassword = String

typealias DoubleObject = Number

typealias Ec2InstanceId = String

typealias Ec2InstanceRegion = String

typealias FileShareARN = String

typealias FileShareARNList = Array<FileShareARN>

typealias FileShareClientList = Array<IPV4AddressCIDR>

typealias FileShareId = String

typealias FileShareInfoList = Array<FileShareInfo>

typealias FileShareStatus = String

typealias FileShareUser = String

typealias FileShareUserList = Array<FileShareUser>

typealias Folder = String

typealias FolderList = Array<Folder>

typealias GatewayARN = String

typealias GatewayId = String

typealias GatewayName = String

typealias GatewayNetworkInterfaces = Array<NetworkInterface>

typealias GatewayOperationalState = String

typealias GatewayState = String

typealias GatewayTimezone = String

typealias GatewayType = String

typealias Gateways = Array<GatewayInfo>

typealias Host = String

typealias Hosts = Array<Host>

typealias HourOfDay = Number

typealias IPV4AddressCIDR = String

typealias Initiator = String

typealias Initiators = Array<Initiator>

typealias IqnName = String

typealias KMSKey = String

typealias LastSoftwareUpdate = String

typealias LocalConsolePassword = String

typealias LocationARN = String

typealias Marker = String

typealias MediumChangerType = String

typealias MinuteOfHour = Number

typealias NFSFileShareInfoList = Array<NFSFileShareInfo>

typealias NetworkInterfaceId = String

typealias NextUpdateAvailabilityDate = String

typealias NotificationId = String

typealias NumTapesToCreate = Number

typealias OrganizationalUnit = String

typealias Path = String

typealias PermissionId = Number

typealias PermissionMode = String

typealias PoolId = String

typealias PositiveIntObject = Number

typealias RecurrenceInHours = Number

typealias RegionId = String

typealias ResourceARN = String

typealias Role = String

typealias SMBFileShareInfoList = Array<SMBFileShareInfo>

typealias SMBGuestPassword = String

typealias SnapshotDescription = String

typealias SnapshotId = String

typealias Squash = String

typealias StorageClass = String

typealias StorediSCSIVolumes = Array<StorediSCSIVolume>

typealias TagKey = String

typealias TagKeys = Array<TagKey>

typealias TagValue = String

typealias Tags = Array<Tag>

typealias TapeARN = String

typealias TapeARNs = Array<TapeARN>

typealias TapeArchiveStatus = String

typealias TapeArchives = Array<TapeArchive>

typealias TapeBarcode = String

typealias TapeBarcodePrefix = String

typealias TapeDriveType = String

typealias TapeInfos = Array<TapeInfo>

typealias TapeRecoveryPointInfos = Array<TapeRecoveryPointInfo>

typealias TapeRecoveryPointStatus = String

typealias TapeSize = Number

typealias TapeStatus = String

typealias TapeUsage = Number

typealias Tapes = Array<Tape>

typealias TargetARN = String

typealias TargetName = String

typealias Time = Date

typealias TimeoutInSeconds = Number

typealias VTLDeviceARN = String

typealias VTLDeviceARNs = Array<VTLDeviceARN>

typealias VTLDeviceProductIdentifier = String

typealias VTLDeviceType = String

typealias VTLDeviceVendor = String

typealias VTLDevices = Array<VTLDevice>

typealias VolumeARN = String

typealias VolumeARNs = Array<VolumeARN>

typealias VolumeAttachmentStatus = String

typealias VolumeId = String

typealias VolumeInfos = Array<VolumeInfo>

typealias VolumeRecoveryPointInfos = Array<VolumeRecoveryPointInfo>

typealias VolumeStatus = String

typealias VolumeType = String

typealias VolumeUsedInBytes = Number

typealias double = Number

typealias integer = Number

typealias long = Number

@JsModule("aws-sdk")
external open class StorageGateway(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & StorageGateway.Types.ClientConfiguration */
    open fun activateGateway(params: ActivateGatewayInput, callback: (err: AWSError, data: ActivateGatewayOutput) -> Unit = definedExternally): Request<ActivateGatewayOutput, AWSError>
    open fun activateGateway(callback: (err: AWSError, data: ActivateGatewayOutput) -> Unit = definedExternally): Request<ActivateGatewayOutput, AWSError>
    open fun addCache(params: AddCacheInput, callback: (err: AWSError, data: AddCacheOutput) -> Unit = definedExternally): Request<AddCacheOutput, AWSError>
    open fun addCache(callback: (err: AWSError, data: AddCacheOutput) -> Unit = definedExternally): Request<AddCacheOutput, AWSError>
    open fun addTagsToResource(params: AddTagsToResourceInput, callback: (err: AWSError, data: AddTagsToResourceOutput) -> Unit = definedExternally): Request<AddTagsToResourceOutput, AWSError>
    open fun addTagsToResource(callback: (err: AWSError, data: AddTagsToResourceOutput) -> Unit = definedExternally): Request<AddTagsToResourceOutput, AWSError>
    open fun addUploadBuffer(params: AddUploadBufferInput, callback: (err: AWSError, data: AddUploadBufferOutput) -> Unit = definedExternally): Request<AddUploadBufferOutput, AWSError>
    open fun addUploadBuffer(callback: (err: AWSError, data: AddUploadBufferOutput) -> Unit = definedExternally): Request<AddUploadBufferOutput, AWSError>
    open fun addWorkingStorage(params: AddWorkingStorageInput, callback: (err: AWSError, data: AddWorkingStorageOutput) -> Unit = definedExternally): Request<AddWorkingStorageOutput, AWSError>
    open fun addWorkingStorage(callback: (err: AWSError, data: AddWorkingStorageOutput) -> Unit = definedExternally): Request<AddWorkingStorageOutput, AWSError>
    open fun assignTapePool(params: AssignTapePoolInput, callback: (err: AWSError, data: AssignTapePoolOutput) -> Unit = definedExternally): Request<AssignTapePoolOutput, AWSError>
    open fun assignTapePool(callback: (err: AWSError, data: AssignTapePoolOutput) -> Unit = definedExternally): Request<AssignTapePoolOutput, AWSError>
    open fun attachVolume(params: AttachVolumeInput, callback: (err: AWSError, data: AttachVolumeOutput) -> Unit = definedExternally): Request<AttachVolumeOutput, AWSError>
    open fun attachVolume(callback: (err: AWSError, data: AttachVolumeOutput) -> Unit = definedExternally): Request<AttachVolumeOutput, AWSError>
    open fun cancelArchival(params: CancelArchivalInput, callback: (err: AWSError, data: CancelArchivalOutput) -> Unit = definedExternally): Request<CancelArchivalOutput, AWSError>
    open fun cancelArchival(callback: (err: AWSError, data: CancelArchivalOutput) -> Unit = definedExternally): Request<CancelArchivalOutput, AWSError>
    open fun cancelRetrieval(params: CancelRetrievalInput, callback: (err: AWSError, data: CancelRetrievalOutput) -> Unit = definedExternally): Request<CancelRetrievalOutput, AWSError>
    open fun cancelRetrieval(callback: (err: AWSError, data: CancelRetrievalOutput) -> Unit = definedExternally): Request<CancelRetrievalOutput, AWSError>
    open fun createCachediSCSIVolume(params: CreateCachediSCSIVolumeInput, callback: (err: AWSError, data: CreateCachediSCSIVolumeOutput) -> Unit = definedExternally): Request<CreateCachediSCSIVolumeOutput, AWSError>
    open fun createCachediSCSIVolume(callback: (err: AWSError, data: CreateCachediSCSIVolumeOutput) -> Unit = definedExternally): Request<CreateCachediSCSIVolumeOutput, AWSError>
    open fun createNFSFileShare(params: CreateNFSFileShareInput, callback: (err: AWSError, data: CreateNFSFileShareOutput) -> Unit = definedExternally): Request<CreateNFSFileShareOutput, AWSError>
    open fun createNFSFileShare(callback: (err: AWSError, data: CreateNFSFileShareOutput) -> Unit = definedExternally): Request<CreateNFSFileShareOutput, AWSError>
    open fun createSMBFileShare(params: CreateSMBFileShareInput, callback: (err: AWSError, data: CreateSMBFileShareOutput) -> Unit = definedExternally): Request<CreateSMBFileShareOutput, AWSError>
    open fun createSMBFileShare(callback: (err: AWSError, data: CreateSMBFileShareOutput) -> Unit = definedExternally): Request<CreateSMBFileShareOutput, AWSError>
    open fun createSnapshot(params: CreateSnapshotInput, callback: (err: AWSError, data: CreateSnapshotOutput) -> Unit = definedExternally): Request<CreateSnapshotOutput, AWSError>
    open fun createSnapshot(callback: (err: AWSError, data: CreateSnapshotOutput) -> Unit = definedExternally): Request<CreateSnapshotOutput, AWSError>
    open fun createSnapshotFromVolumeRecoveryPoint(params: CreateSnapshotFromVolumeRecoveryPointInput, callback: (err: AWSError, data: CreateSnapshotFromVolumeRecoveryPointOutput) -> Unit = definedExternally): Request<CreateSnapshotFromVolumeRecoveryPointOutput, AWSError>
    open fun createSnapshotFromVolumeRecoveryPoint(callback: (err: AWSError, data: CreateSnapshotFromVolumeRecoveryPointOutput) -> Unit = definedExternally): Request<CreateSnapshotFromVolumeRecoveryPointOutput, AWSError>
    open fun createStorediSCSIVolume(params: CreateStorediSCSIVolumeInput, callback: (err: AWSError, data: CreateStorediSCSIVolumeOutput) -> Unit = definedExternally): Request<CreateStorediSCSIVolumeOutput, AWSError>
    open fun createStorediSCSIVolume(callback: (err: AWSError, data: CreateStorediSCSIVolumeOutput) -> Unit = definedExternally): Request<CreateStorediSCSIVolumeOutput, AWSError>
    open fun createTapeWithBarcode(params: CreateTapeWithBarcodeInput, callback: (err: AWSError, data: CreateTapeWithBarcodeOutput) -> Unit = definedExternally): Request<CreateTapeWithBarcodeOutput, AWSError>
    open fun createTapeWithBarcode(callback: (err: AWSError, data: CreateTapeWithBarcodeOutput) -> Unit = definedExternally): Request<CreateTapeWithBarcodeOutput, AWSError>
    open fun createTapes(params: CreateTapesInput, callback: (err: AWSError, data: CreateTapesOutput) -> Unit = definedExternally): Request<CreateTapesOutput, AWSError>
    open fun createTapes(callback: (err: AWSError, data: CreateTapesOutput) -> Unit = definedExternally): Request<CreateTapesOutput, AWSError>
    open fun deleteBandwidthRateLimit(params: DeleteBandwidthRateLimitInput, callback: (err: AWSError, data: DeleteBandwidthRateLimitOutput) -> Unit = definedExternally): Request<DeleteBandwidthRateLimitOutput, AWSError>
    open fun deleteBandwidthRateLimit(callback: (err: AWSError, data: DeleteBandwidthRateLimitOutput) -> Unit = definedExternally): Request<DeleteBandwidthRateLimitOutput, AWSError>
    open fun deleteChapCredentials(params: DeleteChapCredentialsInput, callback: (err: AWSError, data: DeleteChapCredentialsOutput) -> Unit = definedExternally): Request<DeleteChapCredentialsOutput, AWSError>
    open fun deleteChapCredentials(callback: (err: AWSError, data: DeleteChapCredentialsOutput) -> Unit = definedExternally): Request<DeleteChapCredentialsOutput, AWSError>
    open fun deleteFileShare(params: DeleteFileShareInput, callback: (err: AWSError, data: DeleteFileShareOutput) -> Unit = definedExternally): Request<DeleteFileShareOutput, AWSError>
    open fun deleteFileShare(callback: (err: AWSError, data: DeleteFileShareOutput) -> Unit = definedExternally): Request<DeleteFileShareOutput, AWSError>
    open fun deleteGateway(params: DeleteGatewayInput, callback: (err: AWSError, data: DeleteGatewayOutput) -> Unit = definedExternally): Request<DeleteGatewayOutput, AWSError>
    open fun deleteGateway(callback: (err: AWSError, data: DeleteGatewayOutput) -> Unit = definedExternally): Request<DeleteGatewayOutput, AWSError>
    open fun deleteSnapshotSchedule(params: DeleteSnapshotScheduleInput, callback: (err: AWSError, data: DeleteSnapshotScheduleOutput) -> Unit = definedExternally): Request<DeleteSnapshotScheduleOutput, AWSError>
    open fun deleteSnapshotSchedule(callback: (err: AWSError, data: DeleteSnapshotScheduleOutput) -> Unit = definedExternally): Request<DeleteSnapshotScheduleOutput, AWSError>
    open fun deleteTape(params: DeleteTapeInput, callback: (err: AWSError, data: DeleteTapeOutput) -> Unit = definedExternally): Request<DeleteTapeOutput, AWSError>
    open fun deleteTape(callback: (err: AWSError, data: DeleteTapeOutput) -> Unit = definedExternally): Request<DeleteTapeOutput, AWSError>
    open fun deleteTapeArchive(params: DeleteTapeArchiveInput, callback: (err: AWSError, data: DeleteTapeArchiveOutput) -> Unit = definedExternally): Request<DeleteTapeArchiveOutput, AWSError>
    open fun deleteTapeArchive(callback: (err: AWSError, data: DeleteTapeArchiveOutput) -> Unit = definedExternally): Request<DeleteTapeArchiveOutput, AWSError>
    open fun deleteVolume(params: DeleteVolumeInput, callback: (err: AWSError, data: DeleteVolumeOutput) -> Unit = definedExternally): Request<DeleteVolumeOutput, AWSError>
    open fun deleteVolume(callback: (err: AWSError, data: DeleteVolumeOutput) -> Unit = definedExternally): Request<DeleteVolumeOutput, AWSError>
    open fun describeAvailabilityMonitorTest(params: DescribeAvailabilityMonitorTestInput, callback: (err: AWSError, data: DescribeAvailabilityMonitorTestOutput) -> Unit = definedExternally): Request<DescribeAvailabilityMonitorTestOutput, AWSError>
    open fun describeAvailabilityMonitorTest(callback: (err: AWSError, data: DescribeAvailabilityMonitorTestOutput) -> Unit = definedExternally): Request<DescribeAvailabilityMonitorTestOutput, AWSError>
    open fun describeBandwidthRateLimit(params: DescribeBandwidthRateLimitInput, callback: (err: AWSError, data: DescribeBandwidthRateLimitOutput) -> Unit = definedExternally): Request<DescribeBandwidthRateLimitOutput, AWSError>
    open fun describeBandwidthRateLimit(callback: (err: AWSError, data: DescribeBandwidthRateLimitOutput) -> Unit = definedExternally): Request<DescribeBandwidthRateLimitOutput, AWSError>
    open fun describeCache(params: DescribeCacheInput, callback: (err: AWSError, data: DescribeCacheOutput) -> Unit = definedExternally): Request<DescribeCacheOutput, AWSError>
    open fun describeCache(callback: (err: AWSError, data: DescribeCacheOutput) -> Unit = definedExternally): Request<DescribeCacheOutput, AWSError>
    open fun describeCachediSCSIVolumes(params: DescribeCachediSCSIVolumesInput, callback: (err: AWSError, data: DescribeCachediSCSIVolumesOutput) -> Unit = definedExternally): Request<DescribeCachediSCSIVolumesOutput, AWSError>
    open fun describeCachediSCSIVolumes(callback: (err: AWSError, data: DescribeCachediSCSIVolumesOutput) -> Unit = definedExternally): Request<DescribeCachediSCSIVolumesOutput, AWSError>
    open fun describeChapCredentials(params: DescribeChapCredentialsInput, callback: (err: AWSError, data: DescribeChapCredentialsOutput) -> Unit = definedExternally): Request<DescribeChapCredentialsOutput, AWSError>
    open fun describeChapCredentials(callback: (err: AWSError, data: DescribeChapCredentialsOutput) -> Unit = definedExternally): Request<DescribeChapCredentialsOutput, AWSError>
    open fun describeGatewayInformation(params: DescribeGatewayInformationInput, callback: (err: AWSError, data: DescribeGatewayInformationOutput) -> Unit = definedExternally): Request<DescribeGatewayInformationOutput, AWSError>
    open fun describeGatewayInformation(callback: (err: AWSError, data: DescribeGatewayInformationOutput) -> Unit = definedExternally): Request<DescribeGatewayInformationOutput, AWSError>
    open fun describeMaintenanceStartTime(params: DescribeMaintenanceStartTimeInput, callback: (err: AWSError, data: DescribeMaintenanceStartTimeOutput) -> Unit = definedExternally): Request<DescribeMaintenanceStartTimeOutput, AWSError>
    open fun describeMaintenanceStartTime(callback: (err: AWSError, data: DescribeMaintenanceStartTimeOutput) -> Unit = definedExternally): Request<DescribeMaintenanceStartTimeOutput, AWSError>
    open fun describeNFSFileShares(params: DescribeNFSFileSharesInput, callback: (err: AWSError, data: DescribeNFSFileSharesOutput) -> Unit = definedExternally): Request<DescribeNFSFileSharesOutput, AWSError>
    open fun describeNFSFileShares(callback: (err: AWSError, data: DescribeNFSFileSharesOutput) -> Unit = definedExternally): Request<DescribeNFSFileSharesOutput, AWSError>
    open fun describeSMBFileShares(params: DescribeSMBFileSharesInput, callback: (err: AWSError, data: DescribeSMBFileSharesOutput) -> Unit = definedExternally): Request<DescribeSMBFileSharesOutput, AWSError>
    open fun describeSMBFileShares(callback: (err: AWSError, data: DescribeSMBFileSharesOutput) -> Unit = definedExternally): Request<DescribeSMBFileSharesOutput, AWSError>
    open fun describeSMBSettings(params: DescribeSMBSettingsInput, callback: (err: AWSError, data: DescribeSMBSettingsOutput) -> Unit = definedExternally): Request<DescribeSMBSettingsOutput, AWSError>
    open fun describeSMBSettings(callback: (err: AWSError, data: DescribeSMBSettingsOutput) -> Unit = definedExternally): Request<DescribeSMBSettingsOutput, AWSError>
    open fun describeSnapshotSchedule(params: DescribeSnapshotScheduleInput, callback: (err: AWSError, data: DescribeSnapshotScheduleOutput) -> Unit = definedExternally): Request<DescribeSnapshotScheduleOutput, AWSError>
    open fun describeSnapshotSchedule(callback: (err: AWSError, data: DescribeSnapshotScheduleOutput) -> Unit = definedExternally): Request<DescribeSnapshotScheduleOutput, AWSError>
    open fun describeStorediSCSIVolumes(params: DescribeStorediSCSIVolumesInput, callback: (err: AWSError, data: DescribeStorediSCSIVolumesOutput) -> Unit = definedExternally): Request<DescribeStorediSCSIVolumesOutput, AWSError>
    open fun describeStorediSCSIVolumes(callback: (err: AWSError, data: DescribeStorediSCSIVolumesOutput) -> Unit = definedExternally): Request<DescribeStorediSCSIVolumesOutput, AWSError>
    open fun describeTapeArchives(params: DescribeTapeArchivesInput, callback: (err: AWSError, data: DescribeTapeArchivesOutput) -> Unit = definedExternally): Request<DescribeTapeArchivesOutput, AWSError>
    open fun describeTapeArchives(callback: (err: AWSError, data: DescribeTapeArchivesOutput) -> Unit = definedExternally): Request<DescribeTapeArchivesOutput, AWSError>
    open fun describeTapeRecoveryPoints(params: DescribeTapeRecoveryPointsInput, callback: (err: AWSError, data: DescribeTapeRecoveryPointsOutput) -> Unit = definedExternally): Request<DescribeTapeRecoveryPointsOutput, AWSError>
    open fun describeTapeRecoveryPoints(callback: (err: AWSError, data: DescribeTapeRecoveryPointsOutput) -> Unit = definedExternally): Request<DescribeTapeRecoveryPointsOutput, AWSError>
    open fun describeTapes(params: DescribeTapesInput, callback: (err: AWSError, data: DescribeTapesOutput) -> Unit = definedExternally): Request<DescribeTapesOutput, AWSError>
    open fun describeTapes(callback: (err: AWSError, data: DescribeTapesOutput) -> Unit = definedExternally): Request<DescribeTapesOutput, AWSError>
    open fun describeUploadBuffer(params: DescribeUploadBufferInput, callback: (err: AWSError, data: DescribeUploadBufferOutput) -> Unit = definedExternally): Request<DescribeUploadBufferOutput, AWSError>
    open fun describeUploadBuffer(callback: (err: AWSError, data: DescribeUploadBufferOutput) -> Unit = definedExternally): Request<DescribeUploadBufferOutput, AWSError>
    open fun describeVTLDevices(params: DescribeVTLDevicesInput, callback: (err: AWSError, data: DescribeVTLDevicesOutput) -> Unit = definedExternally): Request<DescribeVTLDevicesOutput, AWSError>
    open fun describeVTLDevices(callback: (err: AWSError, data: DescribeVTLDevicesOutput) -> Unit = definedExternally): Request<DescribeVTLDevicesOutput, AWSError>
    open fun describeWorkingStorage(params: DescribeWorkingStorageInput, callback: (err: AWSError, data: DescribeWorkingStorageOutput) -> Unit = definedExternally): Request<DescribeWorkingStorageOutput, AWSError>
    open fun describeWorkingStorage(callback: (err: AWSError, data: DescribeWorkingStorageOutput) -> Unit = definedExternally): Request<DescribeWorkingStorageOutput, AWSError>
    open fun detachVolume(params: DetachVolumeInput, callback: (err: AWSError, data: DetachVolumeOutput) -> Unit = definedExternally): Request<DetachVolumeOutput, AWSError>
    open fun detachVolume(callback: (err: AWSError, data: DetachVolumeOutput) -> Unit = definedExternally): Request<DetachVolumeOutput, AWSError>
    open fun disableGateway(params: DisableGatewayInput, callback: (err: AWSError, data: DisableGatewayOutput) -> Unit = definedExternally): Request<DisableGatewayOutput, AWSError>
    open fun disableGateway(callback: (err: AWSError, data: DisableGatewayOutput) -> Unit = definedExternally): Request<DisableGatewayOutput, AWSError>
    open fun joinDomain(params: JoinDomainInput, callback: (err: AWSError, data: JoinDomainOutput) -> Unit = definedExternally): Request<JoinDomainOutput, AWSError>
    open fun joinDomain(callback: (err: AWSError, data: JoinDomainOutput) -> Unit = definedExternally): Request<JoinDomainOutput, AWSError>
    open fun listFileShares(params: ListFileSharesInput, callback: (err: AWSError, data: ListFileSharesOutput) -> Unit = definedExternally): Request<ListFileSharesOutput, AWSError>
    open fun listFileShares(callback: (err: AWSError, data: ListFileSharesOutput) -> Unit = definedExternally): Request<ListFileSharesOutput, AWSError>
    open fun listGateways(params: ListGatewaysInput, callback: (err: AWSError, data: ListGatewaysOutput) -> Unit = definedExternally): Request<ListGatewaysOutput, AWSError>
    open fun listGateways(callback: (err: AWSError, data: ListGatewaysOutput) -> Unit = definedExternally): Request<ListGatewaysOutput, AWSError>
    open fun listLocalDisks(params: ListLocalDisksInput, callback: (err: AWSError, data: ListLocalDisksOutput) -> Unit = definedExternally): Request<ListLocalDisksOutput, AWSError>
    open fun listLocalDisks(callback: (err: AWSError, data: ListLocalDisksOutput) -> Unit = definedExternally): Request<ListLocalDisksOutput, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceInput, callback: (err: AWSError, data: ListTagsForResourceOutput) -> Unit = definedExternally): Request<ListTagsForResourceOutput, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceOutput) -> Unit = definedExternally): Request<ListTagsForResourceOutput, AWSError>
    open fun listTapes(params: ListTapesInput, callback: (err: AWSError, data: ListTapesOutput) -> Unit = definedExternally): Request<ListTapesOutput, AWSError>
    open fun listTapes(callback: (err: AWSError, data: ListTapesOutput) -> Unit = definedExternally): Request<ListTapesOutput, AWSError>
    open fun listVolumeInitiators(params: ListVolumeInitiatorsInput, callback: (err: AWSError, data: ListVolumeInitiatorsOutput) -> Unit = definedExternally): Request<ListVolumeInitiatorsOutput, AWSError>
    open fun listVolumeInitiators(callback: (err: AWSError, data: ListVolumeInitiatorsOutput) -> Unit = definedExternally): Request<ListVolumeInitiatorsOutput, AWSError>
    open fun listVolumeRecoveryPoints(params: ListVolumeRecoveryPointsInput, callback: (err: AWSError, data: ListVolumeRecoveryPointsOutput) -> Unit = definedExternally): Request<ListVolumeRecoveryPointsOutput, AWSError>
    open fun listVolumeRecoveryPoints(callback: (err: AWSError, data: ListVolumeRecoveryPointsOutput) -> Unit = definedExternally): Request<ListVolumeRecoveryPointsOutput, AWSError>
    open fun listVolumes(params: ListVolumesInput, callback: (err: AWSError, data: ListVolumesOutput) -> Unit = definedExternally): Request<ListVolumesOutput, AWSError>
    open fun listVolumes(callback: (err: AWSError, data: ListVolumesOutput) -> Unit = definedExternally): Request<ListVolumesOutput, AWSError>
    open fun notifyWhenUploaded(params: NotifyWhenUploadedInput, callback: (err: AWSError, data: NotifyWhenUploadedOutput) -> Unit = definedExternally): Request<NotifyWhenUploadedOutput, AWSError>
    open fun notifyWhenUploaded(callback: (err: AWSError, data: NotifyWhenUploadedOutput) -> Unit = definedExternally): Request<NotifyWhenUploadedOutput, AWSError>
    open fun refreshCache(params: RefreshCacheInput, callback: (err: AWSError, data: RefreshCacheOutput) -> Unit = definedExternally): Request<RefreshCacheOutput, AWSError>
    open fun refreshCache(callback: (err: AWSError, data: RefreshCacheOutput) -> Unit = definedExternally): Request<RefreshCacheOutput, AWSError>
    open fun removeTagsFromResource(params: RemoveTagsFromResourceInput, callback: (err: AWSError, data: RemoveTagsFromResourceOutput) -> Unit = definedExternally): Request<RemoveTagsFromResourceOutput, AWSError>
    open fun removeTagsFromResource(callback: (err: AWSError, data: RemoveTagsFromResourceOutput) -> Unit = definedExternally): Request<RemoveTagsFromResourceOutput, AWSError>
    open fun resetCache(params: ResetCacheInput, callback: (err: AWSError, data: ResetCacheOutput) -> Unit = definedExternally): Request<ResetCacheOutput, AWSError>
    open fun resetCache(callback: (err: AWSError, data: ResetCacheOutput) -> Unit = definedExternally): Request<ResetCacheOutput, AWSError>
    open fun retrieveTapeArchive(params: RetrieveTapeArchiveInput, callback: (err: AWSError, data: RetrieveTapeArchiveOutput) -> Unit = definedExternally): Request<RetrieveTapeArchiveOutput, AWSError>
    open fun retrieveTapeArchive(callback: (err: AWSError, data: RetrieveTapeArchiveOutput) -> Unit = definedExternally): Request<RetrieveTapeArchiveOutput, AWSError>
    open fun retrieveTapeRecoveryPoint(params: RetrieveTapeRecoveryPointInput, callback: (err: AWSError, data: RetrieveTapeRecoveryPointOutput) -> Unit = definedExternally): Request<RetrieveTapeRecoveryPointOutput, AWSError>
    open fun retrieveTapeRecoveryPoint(callback: (err: AWSError, data: RetrieveTapeRecoveryPointOutput) -> Unit = definedExternally): Request<RetrieveTapeRecoveryPointOutput, AWSError>
    open fun setLocalConsolePassword(params: SetLocalConsolePasswordInput, callback: (err: AWSError, data: SetLocalConsolePasswordOutput) -> Unit = definedExternally): Request<SetLocalConsolePasswordOutput, AWSError>
    open fun setLocalConsolePassword(callback: (err: AWSError, data: SetLocalConsolePasswordOutput) -> Unit = definedExternally): Request<SetLocalConsolePasswordOutput, AWSError>
    open fun setSMBGuestPassword(params: SetSMBGuestPasswordInput, callback: (err: AWSError, data: SetSMBGuestPasswordOutput) -> Unit = definedExternally): Request<SetSMBGuestPasswordOutput, AWSError>
    open fun setSMBGuestPassword(callback: (err: AWSError, data: SetSMBGuestPasswordOutput) -> Unit = definedExternally): Request<SetSMBGuestPasswordOutput, AWSError>
    open fun shutdownGateway(params: ShutdownGatewayInput, callback: (err: AWSError, data: ShutdownGatewayOutput) -> Unit = definedExternally): Request<ShutdownGatewayOutput, AWSError>
    open fun shutdownGateway(callback: (err: AWSError, data: ShutdownGatewayOutput) -> Unit = definedExternally): Request<ShutdownGatewayOutput, AWSError>
    open fun startAvailabilityMonitorTest(params: StartAvailabilityMonitorTestInput, callback: (err: AWSError, data: StartAvailabilityMonitorTestOutput) -> Unit = definedExternally): Request<StartAvailabilityMonitorTestOutput, AWSError>
    open fun startAvailabilityMonitorTest(callback: (err: AWSError, data: StartAvailabilityMonitorTestOutput) -> Unit = definedExternally): Request<StartAvailabilityMonitorTestOutput, AWSError>
    open fun startGateway(params: StartGatewayInput, callback: (err: AWSError, data: StartGatewayOutput) -> Unit = definedExternally): Request<StartGatewayOutput, AWSError>
    open fun startGateway(callback: (err: AWSError, data: StartGatewayOutput) -> Unit = definedExternally): Request<StartGatewayOutput, AWSError>
    open fun updateBandwidthRateLimit(params: UpdateBandwidthRateLimitInput, callback: (err: AWSError, data: UpdateBandwidthRateLimitOutput) -> Unit = definedExternally): Request<UpdateBandwidthRateLimitOutput, AWSError>
    open fun updateBandwidthRateLimit(callback: (err: AWSError, data: UpdateBandwidthRateLimitOutput) -> Unit = definedExternally): Request<UpdateBandwidthRateLimitOutput, AWSError>
    open fun updateChapCredentials(params: UpdateChapCredentialsInput, callback: (err: AWSError, data: UpdateChapCredentialsOutput) -> Unit = definedExternally): Request<UpdateChapCredentialsOutput, AWSError>
    open fun updateChapCredentials(callback: (err: AWSError, data: UpdateChapCredentialsOutput) -> Unit = definedExternally): Request<UpdateChapCredentialsOutput, AWSError>
    open fun updateGatewayInformation(params: UpdateGatewayInformationInput, callback: (err: AWSError, data: UpdateGatewayInformationOutput) -> Unit = definedExternally): Request<UpdateGatewayInformationOutput, AWSError>
    open fun updateGatewayInformation(callback: (err: AWSError, data: UpdateGatewayInformationOutput) -> Unit = definedExternally): Request<UpdateGatewayInformationOutput, AWSError>
    open fun updateGatewaySoftwareNow(params: UpdateGatewaySoftwareNowInput, callback: (err: AWSError, data: UpdateGatewaySoftwareNowOutput) -> Unit = definedExternally): Request<UpdateGatewaySoftwareNowOutput, AWSError>
    open fun updateGatewaySoftwareNow(callback: (err: AWSError, data: UpdateGatewaySoftwareNowOutput) -> Unit = definedExternally): Request<UpdateGatewaySoftwareNowOutput, AWSError>
    open fun updateMaintenanceStartTime(params: UpdateMaintenanceStartTimeInput, callback: (err: AWSError, data: UpdateMaintenanceStartTimeOutput) -> Unit = definedExternally): Request<UpdateMaintenanceStartTimeOutput, AWSError>
    open fun updateMaintenanceStartTime(callback: (err: AWSError, data: UpdateMaintenanceStartTimeOutput) -> Unit = definedExternally): Request<UpdateMaintenanceStartTimeOutput, AWSError>
    open fun updateNFSFileShare(params: UpdateNFSFileShareInput, callback: (err: AWSError, data: UpdateNFSFileShareOutput) -> Unit = definedExternally): Request<UpdateNFSFileShareOutput, AWSError>
    open fun updateNFSFileShare(callback: (err: AWSError, data: UpdateNFSFileShareOutput) -> Unit = definedExternally): Request<UpdateNFSFileShareOutput, AWSError>
    open fun updateSMBFileShare(params: UpdateSMBFileShareInput, callback: (err: AWSError, data: UpdateSMBFileShareOutput) -> Unit = definedExternally): Request<UpdateSMBFileShareOutput, AWSError>
    open fun updateSMBFileShare(callback: (err: AWSError, data: UpdateSMBFileShareOutput) -> Unit = definedExternally): Request<UpdateSMBFileShareOutput, AWSError>
    open fun updateSMBSecurityStrategy(params: UpdateSMBSecurityStrategyInput, callback: (err: AWSError, data: UpdateSMBSecurityStrategyOutput) -> Unit = definedExternally): Request<UpdateSMBSecurityStrategyOutput, AWSError>
    open fun updateSMBSecurityStrategy(callback: (err: AWSError, data: UpdateSMBSecurityStrategyOutput) -> Unit = definedExternally): Request<UpdateSMBSecurityStrategyOutput, AWSError>
    open fun updateSnapshotSchedule(params: UpdateSnapshotScheduleInput, callback: (err: AWSError, data: UpdateSnapshotScheduleOutput) -> Unit = definedExternally): Request<UpdateSnapshotScheduleOutput, AWSError>
    open fun updateSnapshotSchedule(callback: (err: AWSError, data: UpdateSnapshotScheduleOutput) -> Unit = definedExternally): Request<UpdateSnapshotScheduleOutput, AWSError>
    open fun updateVTLDeviceType(params: UpdateVTLDeviceTypeInput, callback: (err: AWSError, data: UpdateVTLDeviceTypeOutput) -> Unit = definedExternally): Request<UpdateVTLDeviceTypeOutput, AWSError>
    open fun updateVTLDeviceType(callback: (err: AWSError, data: UpdateVTLDeviceTypeOutput) -> Unit = definedExternally): Request<UpdateVTLDeviceTypeOutput, AWSError>
    interface ActivateGatewayInput {
        var ActivationKey: ActivationKey
        var GatewayName: GatewayName
        var GatewayTimezone: GatewayTimezone
        var GatewayRegion: RegionId
        var GatewayType: GatewayType?
            get() = definedExternally
            set(value) = definedExternally
        var TapeDriveType: TapeDriveType?
            get() = definedExternally
            set(value) = definedExternally
        var MediumChangerType: MediumChangerType?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActivateGatewayOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddCacheInput {
        var GatewayARN: GatewayARN
        var DiskIds: DiskIds
    }
    interface AddCacheOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddTagsToResourceInput {
        var ResourceARN: ResourceARN
        var Tags: Tags
    }
    interface AddTagsToResourceOutput {
        var ResourceARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddUploadBufferInput {
        var GatewayARN: GatewayARN
        var DiskIds: DiskIds
    }
    interface AddUploadBufferOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddWorkingStorageInput {
        var GatewayARN: GatewayARN
        var DiskIds: DiskIds
    }
    interface AddWorkingStorageOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssignTapePoolInput {
        var TapeARN: TapeARN
        var PoolId: PoolId
    }
    interface AssignTapePoolOutput {
        var TapeARN: TapeARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttachVolumeInput {
        var GatewayARN: GatewayARN
        var TargetName: TargetName?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeARN: VolumeARN
        var NetworkInterfaceId: NetworkInterfaceId
        var DiskId: DiskId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttachVolumeOutput {
        var VolumeARN: VolumeARN?
            get() = definedExternally
            set(value) = definedExternally
        var TargetARN: TargetARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CachediSCSIVolume {
        var VolumeARN: VolumeARN?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeId: VolumeId?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeType: VolumeType?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeStatus: VolumeStatus?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeAttachmentStatus: VolumeAttachmentStatus?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeSizeInBytes: long?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeProgress: DoubleObject?
            get() = definedExternally
            set(value) = definedExternally
        var SourceSnapshotId: SnapshotId?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeiSCSIAttributes: VolumeiSCSIAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: CreatedDate?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeUsedInBytes: VolumeUsedInBytes?
            get() = definedExternally
            set(value) = definedExternally
        var KMSKey: KMSKey?
            get() = definedExternally
            set(value) = definedExternally
        var TargetName: TargetName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelArchivalInput {
        var GatewayARN: GatewayARN
        var TapeARN: TapeARN
    }
    interface CancelArchivalOutput {
        var TapeARN: TapeARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelRetrievalInput {
        var GatewayARN: GatewayARN
        var TapeARN: TapeARN
    }
    interface CancelRetrievalOutput {
        var TapeARN: TapeARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChapInfo {
        var TargetARN: TargetARN?
            get() = definedExternally
            set(value) = definedExternally
        var SecretToAuthenticateInitiator: ChapSecret?
            get() = definedExternally
            set(value) = definedExternally
        var InitiatorName: IqnName?
            get() = definedExternally
            set(value) = definedExternally
        var SecretToAuthenticateTarget: ChapSecret?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCachediSCSIVolumeInput {
        var GatewayARN: GatewayARN
        var VolumeSizeInBytes: long
        var SnapshotId: SnapshotId?
            get() = definedExternally
            set(value) = definedExternally
        var TargetName: TargetName
        var SourceVolumeARN: VolumeARN?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkInterfaceId: NetworkInterfaceId
        var ClientToken: ClientToken
        var KMSEncrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var KMSKey: KMSKey?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCachediSCSIVolumeOutput {
        var VolumeARN: VolumeARN?
            get() = definedExternally
            set(value) = definedExternally
        var TargetARN: TargetARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateNFSFileShareInput {
        var ClientToken: ClientToken
        var NFSFileShareDefaults: NFSFileShareDefaults?
            get() = definedExternally
            set(value) = definedExternally
        var GatewayARN: GatewayARN
        var KMSEncrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var KMSKey: KMSKey?
            get() = definedExternally
            set(value) = definedExternally
        var Role: Role
        var LocationARN: LocationARN
        var DefaultStorageClass: StorageClass?
            get() = definedExternally
            set(value) = definedExternally
        var ObjectACL: String /* "private" | "public-read" | "public-read-write" | "authenticated-read" | "bucket-owner-read" | "bucket-owner-full-control" | "aws-exec-read" | String */
        var ClientList: FileShareClientList?
            get() = definedExternally
            set(value) = definedExternally
        var Squash: Squash?
            get() = definedExternally
            set(value) = definedExternally
        var ReadOnly: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var GuessMIMETypeEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RequesterPays: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateNFSFileShareOutput {
        var FileShareARN: FileShareARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSMBFileShareInput {
        var ClientToken: ClientToken
        var GatewayARN: GatewayARN
        var KMSEncrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var KMSKey: KMSKey?
            get() = definedExternally
            set(value) = definedExternally
        var Role: Role
        var LocationARN: LocationARN
        var DefaultStorageClass: StorageClass?
            get() = definedExternally
            set(value) = definedExternally
        var ObjectACL: String /* "private" | "public-read" | "public-read-write" | "authenticated-read" | "bucket-owner-read" | "bucket-owner-full-control" | "aws-exec-read" | String */
        var ReadOnly: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var GuessMIMETypeEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RequesterPays: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SMBACLEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AdminUserList: FileShareUserList?
            get() = definedExternally
            set(value) = definedExternally
        var ValidUserList: FileShareUserList?
            get() = definedExternally
            set(value) = definedExternally
        var InvalidUserList: FileShareUserList?
            get() = definedExternally
            set(value) = definedExternally
        var Authentication: Authentication?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSMBFileShareOutput {
        var FileShareARN: FileShareARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSnapshotFromVolumeRecoveryPointInput {
        var VolumeARN: VolumeARN
        var SnapshotDescription: SnapshotDescription
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSnapshotFromVolumeRecoveryPointOutput {
        var SnapshotId: SnapshotId?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeARN: VolumeARN?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeRecoveryPointTime: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSnapshotInput {
        var VolumeARN: VolumeARN
        var SnapshotDescription: SnapshotDescription
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSnapshotOutput {
        var VolumeARN: VolumeARN?
            get() = definedExternally
            set(value) = definedExternally
        var SnapshotId: SnapshotId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStorediSCSIVolumeInput {
        var GatewayARN: GatewayARN
        var DiskId: DiskId
        var SnapshotId: SnapshotId?
            get() = definedExternally
            set(value) = definedExternally
        var PreserveExistingData: Boolean
        var TargetName: TargetName
        var NetworkInterfaceId: NetworkInterfaceId
        var KMSEncrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var KMSKey: KMSKey?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStorediSCSIVolumeOutput {
        var VolumeARN: VolumeARN?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeSizeInBytes: long?
            get() = definedExternally
            set(value) = definedExternally
        var TargetARN: TargetARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTapeWithBarcodeInput {
        var GatewayARN: GatewayARN
        var TapeSizeInBytes: TapeSize
        var TapeBarcode: TapeBarcode
        var KMSEncrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var KMSKey: KMSKey?
            get() = definedExternally
            set(value) = definedExternally
        var PoolId: PoolId?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTapeWithBarcodeOutput {
        var TapeARN: TapeARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTapesInput {
        var GatewayARN: GatewayARN
        var TapeSizeInBytes: TapeSize
        var ClientToken: ClientToken
        var NumTapesToCreate: NumTapesToCreate
        var TapeBarcodePrefix: TapeBarcodePrefix
        var KMSEncrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var KMSKey: KMSKey?
            get() = definedExternally
            set(value) = definedExternally
        var PoolId: PoolId?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTapesOutput {
        var TapeARNs: TapeARNs?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteBandwidthRateLimitInput {
        var GatewayARN: GatewayARN
        var BandwidthType: BandwidthType
    }
    interface DeleteBandwidthRateLimitOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteChapCredentialsInput {
        var TargetARN: TargetARN
        var InitiatorName: IqnName
    }
    interface DeleteChapCredentialsOutput {
        var TargetARN: TargetARN?
            get() = definedExternally
            set(value) = definedExternally
        var InitiatorName: IqnName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteFileShareInput {
        var FileShareARN: FileShareARN
        var ForceDelete: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteFileShareOutput {
        var FileShareARN: FileShareARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteGatewayInput {
        var GatewayARN: GatewayARN
    }
    interface DeleteGatewayOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteSnapshotScheduleInput {
        var VolumeARN: VolumeARN
    }
    interface DeleteSnapshotScheduleOutput {
        var VolumeARN: VolumeARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteTapeArchiveInput {
        var TapeARN: TapeARN
    }
    interface DeleteTapeArchiveOutput {
        var TapeARN: TapeARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteTapeInput {
        var GatewayARN: GatewayARN
        var TapeARN: TapeARN
    }
    interface DeleteTapeOutput {
        var TapeARN: TapeARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteVolumeInput {
        var VolumeARN: VolumeARN
    }
    interface DeleteVolumeOutput {
        var VolumeARN: VolumeARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAvailabilityMonitorTestInput {
        var GatewayARN: GatewayARN
    }
    interface DescribeAvailabilityMonitorTestOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "COMPLETE" | "FAILED" | "PENDING" | String */
        var StartTime: Time?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeBandwidthRateLimitInput {
        var GatewayARN: GatewayARN
    }
    interface DescribeBandwidthRateLimitOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var AverageUploadRateLimitInBitsPerSec: BandwidthUploadRateLimit?
            get() = definedExternally
            set(value) = definedExternally
        var AverageDownloadRateLimitInBitsPerSec: BandwidthDownloadRateLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCacheInput {
        var GatewayARN: GatewayARN
    }
    interface DescribeCacheOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var DiskIds: DiskIds?
            get() = definedExternally
            set(value) = definedExternally
        var CacheAllocatedInBytes: long?
            get() = definedExternally
            set(value) = definedExternally
        var CacheUsedPercentage: double?
            get() = definedExternally
            set(value) = definedExternally
        var CacheDirtyPercentage: double?
            get() = definedExternally
            set(value) = definedExternally
        var CacheHitPercentage: double?
            get() = definedExternally
            set(value) = definedExternally
        var CacheMissPercentage: double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCachediSCSIVolumesInput {
        var VolumeARNs: VolumeARNs
    }
    interface DescribeCachediSCSIVolumesOutput {
        var CachediSCSIVolumes: CachediSCSIVolumes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeChapCredentialsInput {
        var TargetARN: TargetARN
    }
    interface DescribeChapCredentialsOutput {
        var ChapCredentials: ChapCredentials?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeGatewayInformationInput {
        var GatewayARN: GatewayARN
    }
    interface DescribeGatewayInformationOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var GatewayId: GatewayId?
            get() = definedExternally
            set(value) = definedExternally
        var GatewayName: String?
            get() = definedExternally
            set(value) = definedExternally
        var GatewayTimezone: GatewayTimezone?
            get() = definedExternally
            set(value) = definedExternally
        var GatewayState: GatewayState?
            get() = definedExternally
            set(value) = definedExternally
        var GatewayNetworkInterfaces: GatewayNetworkInterfaces?
            get() = definedExternally
            set(value) = definedExternally
        var GatewayType: GatewayType?
            get() = definedExternally
            set(value) = definedExternally
        var NextUpdateAvailabilityDate: NextUpdateAvailabilityDate?
            get() = definedExternally
            set(value) = definedExternally
        var LastSoftwareUpdate: LastSoftwareUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var Ec2InstanceId: Ec2InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var Ec2InstanceRegion: Ec2InstanceRegion?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var VPCEndpoint: String?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLogGroupARN: CloudWatchLogGroupARN?
            get() = definedExternally
            set(value) = definedExternally
        var HostEnvironment: String /* "VMWARE" | "HYPER-V" | "EC2" | "KVM" | "OTHER" | String */
    }
    interface DescribeMaintenanceStartTimeInput {
        var GatewayARN: GatewayARN
    }
    interface DescribeMaintenanceStartTimeOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var HourOfDay: HourOfDay?
            get() = definedExternally
            set(value) = definedExternally
        var MinuteOfHour: MinuteOfHour?
            get() = definedExternally
            set(value) = definedExternally
        var DayOfWeek: DayOfWeek?
            get() = definedExternally
            set(value) = definedExternally
        var DayOfMonth: DayOfMonth?
            get() = definedExternally
            set(value) = definedExternally
        var Timezone: GatewayTimezone?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeNFSFileSharesInput {
        var FileShareARNList: FileShareARNList
    }
    interface DescribeNFSFileSharesOutput {
        var NFSFileShareInfoList: NFSFileShareInfoList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSMBFileSharesInput {
        var FileShareARNList: FileShareARNList
    }
    interface DescribeSMBFileSharesOutput {
        var SMBFileShareInfoList: SMBFileShareInfoList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSMBSettingsInput {
        var GatewayARN: GatewayARN
    }
    interface DescribeSMBSettingsOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var DomainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
        var ActiveDirectoryStatus: String /* "ACCESS_DENIED" | "DETACHED" | "JOINED" | "JOINING" | "NETWORK_ERROR" | "TIMEOUT" | "UNKNOWN_ERROR" | String */
        var SMBGuestPasswordSet: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SMBSecurityStrategy: String /* "ClientSpecified" | "MandatorySigning" | "MandatoryEncryption" | String */
    }
    interface DescribeSnapshotScheduleInput {
        var VolumeARN: VolumeARN
    }
    interface DescribeSnapshotScheduleOutput {
        var VolumeARN: VolumeARN?
            get() = definedExternally
            set(value) = definedExternally
        var StartAt: HourOfDay?
            get() = definedExternally
            set(value) = definedExternally
        var RecurrenceInHours: RecurrenceInHours?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Timezone: GatewayTimezone?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStorediSCSIVolumesInput {
        var VolumeARNs: VolumeARNs
    }
    interface DescribeStorediSCSIVolumesOutput {
        var StorediSCSIVolumes: StorediSCSIVolumes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTapeArchivesInput {
        var TapeARNs: TapeARNs?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveIntObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTapeArchivesOutput {
        var TapeArchives: TapeArchives?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTapeRecoveryPointsInput {
        var GatewayARN: GatewayARN
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveIntObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTapeRecoveryPointsOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var TapeRecoveryPointInfos: TapeRecoveryPointInfos?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTapesInput {
        var GatewayARN: GatewayARN
        var TapeARNs: TapeARNs?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveIntObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTapesOutput {
        var Tapes: Tapes?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUploadBufferInput {
        var GatewayARN: GatewayARN
    }
    interface DescribeUploadBufferOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var DiskIds: DiskIds?
            get() = definedExternally
            set(value) = definedExternally
        var UploadBufferUsedInBytes: long?
            get() = definedExternally
            set(value) = definedExternally
        var UploadBufferAllocatedInBytes: long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeVTLDevicesInput {
        var GatewayARN: GatewayARN
        var VTLDeviceARNs: VTLDeviceARNs?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveIntObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeVTLDevicesOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var VTLDevices: VTLDevices?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeWorkingStorageInput {
        var GatewayARN: GatewayARN
    }
    interface DescribeWorkingStorageOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var DiskIds: DiskIds?
            get() = definedExternally
            set(value) = definedExternally
        var WorkingStorageUsedInBytes: long?
            get() = definedExternally
            set(value) = definedExternally
        var WorkingStorageAllocatedInBytes: long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetachVolumeInput {
        var VolumeARN: VolumeARN
        var ForceDetach: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetachVolumeOutput {
        var VolumeARN: VolumeARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeviceiSCSIAttributes {
        var TargetARN: TargetARN?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkInterfaceId: NetworkInterfaceId?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkInterfacePort: integer?
            get() = definedExternally
            set(value) = definedExternally
        var ChapEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisableGatewayInput {
        var GatewayARN: GatewayARN
    }
    interface DisableGatewayOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Disk {
        var DiskId: DiskId?
            get() = definedExternally
            set(value) = definedExternally
        var DiskPath: String?
            get() = definedExternally
            set(value) = definedExternally
        var DiskNode: String?
            get() = definedExternally
            set(value) = definedExternally
        var DiskStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var DiskSizeInBytes: long?
            get() = definedExternally
            set(value) = definedExternally
        var DiskAllocationType: DiskAllocationType?
            get() = definedExternally
            set(value) = definedExternally
        var DiskAllocationResource: String?
            get() = definedExternally
            set(value) = definedExternally
        var DiskAttributeList: DiskAttributeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FileShareInfo {
        var FileShareType: String /* "NFS" | "SMB" | String */
        var FileShareARN: FileShareARN?
            get() = definedExternally
            set(value) = definedExternally
        var FileShareId: FileShareId?
            get() = definedExternally
            set(value) = definedExternally
        var FileShareStatus: FileShareStatus?
            get() = definedExternally
            set(value) = definedExternally
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GatewayInfo {
        var GatewayId: GatewayId?
            get() = definedExternally
            set(value) = definedExternally
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var GatewayType: GatewayType?
            get() = definedExternally
            set(value) = definedExternally
        var GatewayOperationalState: GatewayOperationalState?
            get() = definedExternally
            set(value) = definedExternally
        var GatewayName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Ec2InstanceId: Ec2InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var Ec2InstanceRegion: Ec2InstanceRegion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JoinDomainInput {
        var GatewayARN: GatewayARN
        var DomainName: DomainName
        var OrganizationalUnit: OrganizationalUnit?
            get() = definedExternally
            set(value) = definedExternally
        var DomainControllers: Hosts?
            get() = definedExternally
            set(value) = definedExternally
        var TimeoutInSeconds: TimeoutInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var UserName: DomainUserName
        var Password: DomainUserPassword
    }
    interface JoinDomainOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var ActiveDirectoryStatus: String /* "ACCESS_DENIED" | "DETACHED" | "JOINED" | "JOINING" | "NETWORK_ERROR" | "TIMEOUT" | "UNKNOWN_ERROR" | String */
    }
    interface ListFileSharesInput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveIntObject?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFileSharesOutput {
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var NextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var FileShareInfoList: FileShareInfoList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGatewaysInput {
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveIntObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGatewaysOutput {
        var Gateways: Gateways?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLocalDisksInput {
        var GatewayARN: GatewayARN
    }
    interface ListLocalDisksOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var Disks: Disks?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceInput {
        var ResourceARN: ResourceARN
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveIntObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceOutput {
        var ResourceARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTapesInput {
        var TapeARNs: TapeARNs?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveIntObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTapesOutput {
        var TapeInfos: TapeInfos?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVolumeInitiatorsInput {
        var VolumeARN: VolumeARN
    }
    interface ListVolumeInitiatorsOutput {
        var Initiators: Initiators?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVolumeRecoveryPointsInput {
        var GatewayARN: GatewayARN
    }
    interface ListVolumeRecoveryPointsOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeRecoveryPointInfos: VolumeRecoveryPointInfos?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVolumesInput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveIntObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVolumesOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeInfos: VolumeInfos?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NFSFileShareDefaults {
        var FileMode: PermissionMode?
            get() = definedExternally
            set(value) = definedExternally
        var DirectoryMode: PermissionMode?
            get() = definedExternally
            set(value) = definedExternally
        var GroupId: PermissionId?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerId: PermissionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NFSFileShareInfo {
        var NFSFileShareDefaults: NFSFileShareDefaults?
            get() = definedExternally
            set(value) = definedExternally
        var FileShareARN: FileShareARN?
            get() = definedExternally
            set(value) = definedExternally
        var FileShareId: FileShareId?
            get() = definedExternally
            set(value) = definedExternally
        var FileShareStatus: FileShareStatus?
            get() = definedExternally
            set(value) = definedExternally
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var KMSEncrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var KMSKey: KMSKey?
            get() = definedExternally
            set(value) = definedExternally
        var Path: Path?
            get() = definedExternally
            set(value) = definedExternally
        var Role: Role?
            get() = definedExternally
            set(value) = definedExternally
        var LocationARN: LocationARN?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultStorageClass: StorageClass?
            get() = definedExternally
            set(value) = definedExternally
        var ObjectACL: String /* "private" | "public-read" | "public-read-write" | "authenticated-read" | "bucket-owner-read" | "bucket-owner-full-control" | "aws-exec-read" | String */
        var ClientList: FileShareClientList?
            get() = definedExternally
            set(value) = definedExternally
        var Squash: Squash?
            get() = definedExternally
            set(value) = definedExternally
        var ReadOnly: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var GuessMIMETypeEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RequesterPays: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NetworkInterface {
        var Ipv4Address: String?
            get() = definedExternally
            set(value) = definedExternally
        var MacAddress: String?
            get() = definedExternally
            set(value) = definedExternally
        var Ipv6Address: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NotifyWhenUploadedInput {
        var FileShareARN: FileShareARN
    }
    interface NotifyWhenUploadedOutput {
        var FileShareARN: FileShareARN?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationId: NotificationId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RefreshCacheInput {
        var FileShareARN: FileShareARN
        var FolderList: FolderList?
            get() = definedExternally
            set(value) = definedExternally
        var Recursive: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RefreshCacheOutput {
        var FileShareARN: FileShareARN?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationId: NotificationId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveTagsFromResourceInput {
        var ResourceARN: ResourceARN
        var TagKeys: TagKeys
    }
    interface RemoveTagsFromResourceOutput {
        var ResourceARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResetCacheInput {
        var GatewayARN: GatewayARN
    }
    interface ResetCacheOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RetrieveTapeArchiveInput {
        var TapeARN: TapeARN
        var GatewayARN: GatewayARN
    }
    interface RetrieveTapeArchiveOutput {
        var TapeARN: TapeARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RetrieveTapeRecoveryPointInput {
        var TapeARN: TapeARN
        var GatewayARN: GatewayARN
    }
    interface RetrieveTapeRecoveryPointOutput {
        var TapeARN: TapeARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SMBFileShareInfo {
        var FileShareARN: FileShareARN?
            get() = definedExternally
            set(value) = definedExternally
        var FileShareId: FileShareId?
            get() = definedExternally
            set(value) = definedExternally
        var FileShareStatus: FileShareStatus?
            get() = definedExternally
            set(value) = definedExternally
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var KMSEncrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var KMSKey: KMSKey?
            get() = definedExternally
            set(value) = definedExternally
        var Path: Path?
            get() = definedExternally
            set(value) = definedExternally
        var Role: Role?
            get() = definedExternally
            set(value) = definedExternally
        var LocationARN: LocationARN?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultStorageClass: StorageClass?
            get() = definedExternally
            set(value) = definedExternally
        var ObjectACL: String /* "private" | "public-read" | "public-read-write" | "authenticated-read" | "bucket-owner-read" | "bucket-owner-full-control" | "aws-exec-read" | String */
        var ReadOnly: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var GuessMIMETypeEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RequesterPays: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SMBACLEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AdminUserList: FileShareUserList?
            get() = definedExternally
            set(value) = definedExternally
        var ValidUserList: FileShareUserList?
            get() = definedExternally
            set(value) = definedExternally
        var InvalidUserList: FileShareUserList?
            get() = definedExternally
            set(value) = definedExternally
        var Authentication: Authentication?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetLocalConsolePasswordInput {
        var GatewayARN: GatewayARN
        var LocalConsolePassword: LocalConsolePassword
    }
    interface SetLocalConsolePasswordOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetSMBGuestPasswordInput {
        var GatewayARN: GatewayARN
        var Password: SMBGuestPassword
    }
    interface SetSMBGuestPasswordOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ShutdownGatewayInput {
        var GatewayARN: GatewayARN
    }
    interface ShutdownGatewayOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartAvailabilityMonitorTestInput {
        var GatewayARN: GatewayARN
    }
    interface StartAvailabilityMonitorTestOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartGatewayInput {
        var GatewayARN: GatewayARN
    }
    interface StartGatewayOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StorediSCSIVolume {
        var VolumeARN: VolumeARN?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeId: VolumeId?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeType: VolumeType?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeStatus: VolumeStatus?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeAttachmentStatus: VolumeAttachmentStatus?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeSizeInBytes: long?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeProgress: DoubleObject?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeDiskId: DiskId?
            get() = definedExternally
            set(value) = definedExternally
        var SourceSnapshotId: SnapshotId?
            get() = definedExternally
            set(value) = definedExternally
        var PreservedExistingData: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeiSCSIAttributes: VolumeiSCSIAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: CreatedDate?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeUsedInBytes: VolumeUsedInBytes?
            get() = definedExternally
            set(value) = definedExternally
        var KMSKey: KMSKey?
            get() = definedExternally
            set(value) = definedExternally
        var TargetName: TargetName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface Tape {
        var TapeARN: TapeARN?
            get() = definedExternally
            set(value) = definedExternally
        var TapeBarcode: TapeBarcode?
            get() = definedExternally
            set(value) = definedExternally
        var TapeCreatedDate: Time?
            get() = definedExternally
            set(value) = definedExternally
        var TapeSizeInBytes: TapeSize?
            get() = definedExternally
            set(value) = definedExternally
        var TapeStatus: TapeStatus?
            get() = definedExternally
            set(value) = definedExternally
        var VTLDevice: VTLDeviceARN?
            get() = definedExternally
            set(value) = definedExternally
        var Progress: DoubleObject?
            get() = definedExternally
            set(value) = definedExternally
        var TapeUsedInBytes: TapeUsage?
            get() = definedExternally
            set(value) = definedExternally
        var KMSKey: KMSKey?
            get() = definedExternally
            set(value) = definedExternally
        var PoolId: PoolId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TapeArchive {
        var TapeARN: TapeARN?
            get() = definedExternally
            set(value) = definedExternally
        var TapeBarcode: TapeBarcode?
            get() = definedExternally
            set(value) = definedExternally
        var TapeCreatedDate: Time?
            get() = definedExternally
            set(value) = definedExternally
        var TapeSizeInBytes: TapeSize?
            get() = definedExternally
            set(value) = definedExternally
        var CompletionTime: Time?
            get() = definedExternally
            set(value) = definedExternally
        var RetrievedTo: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var TapeStatus: TapeArchiveStatus?
            get() = definedExternally
            set(value) = definedExternally
        var TapeUsedInBytes: TapeUsage?
            get() = definedExternally
            set(value) = definedExternally
        var KMSKey: KMSKey?
            get() = definedExternally
            set(value) = definedExternally
        var PoolId: PoolId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TapeInfo {
        var TapeARN: TapeARN?
            get() = definedExternally
            set(value) = definedExternally
        var TapeBarcode: TapeBarcode?
            get() = definedExternally
            set(value) = definedExternally
        var TapeSizeInBytes: TapeSize?
            get() = definedExternally
            set(value) = definedExternally
        var TapeStatus: TapeStatus?
            get() = definedExternally
            set(value) = definedExternally
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var PoolId: PoolId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TapeRecoveryPointInfo {
        var TapeARN: TapeARN?
            get() = definedExternally
            set(value) = definedExternally
        var TapeRecoveryPointTime: Time?
            get() = definedExternally
            set(value) = definedExternally
        var TapeSizeInBytes: TapeSize?
            get() = definedExternally
            set(value) = definedExternally
        var TapeStatus: TapeRecoveryPointStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateBandwidthRateLimitInput {
        var GatewayARN: GatewayARN
        var AverageUploadRateLimitInBitsPerSec: BandwidthUploadRateLimit?
            get() = definedExternally
            set(value) = definedExternally
        var AverageDownloadRateLimitInBitsPerSec: BandwidthDownloadRateLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateBandwidthRateLimitOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateChapCredentialsInput {
        var TargetARN: TargetARN
        var SecretToAuthenticateInitiator: ChapSecret
        var InitiatorName: IqnName
        var SecretToAuthenticateTarget: ChapSecret?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateChapCredentialsOutput {
        var TargetARN: TargetARN?
            get() = definedExternally
            set(value) = definedExternally
        var InitiatorName: IqnName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGatewayInformationInput {
        var GatewayARN: GatewayARN
        var GatewayName: GatewayName?
            get() = definedExternally
            set(value) = definedExternally
        var GatewayTimezone: GatewayTimezone?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLogGroupARN: CloudWatchLogGroupARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGatewayInformationOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var GatewayName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGatewaySoftwareNowInput {
        var GatewayARN: GatewayARN
    }
    interface UpdateGatewaySoftwareNowOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMaintenanceStartTimeInput {
        var GatewayARN: GatewayARN
        var HourOfDay: HourOfDay
        var MinuteOfHour: MinuteOfHour
        var DayOfWeek: DayOfWeek?
            get() = definedExternally
            set(value) = definedExternally
        var DayOfMonth: DayOfMonth?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMaintenanceStartTimeOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateNFSFileShareInput {
        var FileShareARN: FileShareARN
        var KMSEncrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var KMSKey: KMSKey?
            get() = definedExternally
            set(value) = definedExternally
        var NFSFileShareDefaults: NFSFileShareDefaults?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultStorageClass: StorageClass?
            get() = definedExternally
            set(value) = definedExternally
        var ObjectACL: String /* "private" | "public-read" | "public-read-write" | "authenticated-read" | "bucket-owner-read" | "bucket-owner-full-control" | "aws-exec-read" | String */
        var ClientList: FileShareClientList?
            get() = definedExternally
            set(value) = definedExternally
        var Squash: Squash?
            get() = definedExternally
            set(value) = definedExternally
        var ReadOnly: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var GuessMIMETypeEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RequesterPays: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateNFSFileShareOutput {
        var FileShareARN: FileShareARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSMBFileShareInput {
        var FileShareARN: FileShareARN
        var KMSEncrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var KMSKey: KMSKey?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultStorageClass: StorageClass?
            get() = definedExternally
            set(value) = definedExternally
        var ObjectACL: String /* "private" | "public-read" | "public-read-write" | "authenticated-read" | "bucket-owner-read" | "bucket-owner-full-control" | "aws-exec-read" | String */
        var ReadOnly: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var GuessMIMETypeEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RequesterPays: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SMBACLEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AdminUserList: FileShareUserList?
            get() = definedExternally
            set(value) = definedExternally
        var ValidUserList: FileShareUserList?
            get() = definedExternally
            set(value) = definedExternally
        var InvalidUserList: FileShareUserList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSMBFileShareOutput {
        var FileShareARN: FileShareARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSMBSecurityStrategyInput {
        var GatewayARN: GatewayARN
        var SMBSecurityStrategy: String /* "ClientSpecified" | "MandatorySigning" | "MandatoryEncryption" | String */
    }
    interface UpdateSMBSecurityStrategyOutput {
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSnapshotScheduleInput {
        var VolumeARN: VolumeARN
        var StartAt: HourOfDay
        var RecurrenceInHours: RecurrenceInHours
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSnapshotScheduleOutput {
        var VolumeARN: VolumeARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateVTLDeviceTypeInput {
        var VTLDeviceARN: VTLDeviceARN
        var DeviceType: DeviceType
    }
    interface UpdateVTLDeviceTypeOutput {
        var VTLDeviceARN: VTLDeviceARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VTLDevice {
        var VTLDeviceARN: VTLDeviceARN?
            get() = definedExternally
            set(value) = definedExternally
        var VTLDeviceType: VTLDeviceType?
            get() = definedExternally
            set(value) = definedExternally
        var VTLDeviceVendor: VTLDeviceVendor?
            get() = definedExternally
            set(value) = definedExternally
        var VTLDeviceProductIdentifier: VTLDeviceProductIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceiSCSIAttributes: DeviceiSCSIAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VolumeInfo {
        var VolumeARN: VolumeARN?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeId: VolumeId?
            get() = definedExternally
            set(value) = definedExternally
        var GatewayARN: GatewayARN?
            get() = definedExternally
            set(value) = definedExternally
        var GatewayId: GatewayId?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeType: VolumeType?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeSizeInBytes: long?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeAttachmentStatus: VolumeAttachmentStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VolumeRecoveryPointInfo {
        var VolumeARN: VolumeARN?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeSizeInBytes: long?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeUsageInBytes: long?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeRecoveryPointTime: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VolumeiSCSIAttributes {
        var TargetARN: TargetARN?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkInterfaceId: NetworkInterfaceId?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkInterfacePort: integer?
            get() = definedExternally
            set(value) = definedExternally
        var LunNumber: PositiveIntObject?
            get() = definedExternally
            set(value) = definedExternally
        var ChapEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2013-06-30" | "latest" | String */
    }
}