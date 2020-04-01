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
import DeviceFarm.Artifact
import DeviceFarm.DeviceFilter
import DeviceFarm.DeviceInstance
import DeviceFarm.DevicePoolCompatibilityResult
import DeviceFarm.DevicePool
import DeviceFarm.Device
import DeviceFarm.IncompatibilityMessage
import DeviceFarm.InstanceProfile
import DeviceFarm.Job
import DeviceFarm.NetworkProfile
import DeviceFarm.OfferingPromotion
import DeviceFarm.OfferingTransaction
import DeviceFarm.Offering
import DeviceFarm.Problem
import DeviceFarm.Project
import DeviceFarm.RecurringCharge
import DeviceFarm.RemoteAccessSession
import DeviceFarm.Rule
import DeviceFarm.Run
import DeviceFarm.Sample
import DeviceFarm.Suite
import DeviceFarm.Tag
import DeviceFarm.TestGridProject
import DeviceFarm.TestGridSessionAction
import DeviceFarm.TestGridSessionArtifact
import DeviceFarm.TestGridSession
import DeviceFarm.Test
import DeviceFarm.UniqueProblem
import DeviceFarm.Upload
import DeviceFarm.VPCEConfiguration
import DeviceFarm.CreateDevicePoolRequest
import DeviceFarm.CreateDevicePoolResult
import DeviceFarm.CreateInstanceProfileRequest
import DeviceFarm.CreateInstanceProfileResult
import DeviceFarm.CreateNetworkProfileRequest
import DeviceFarm.CreateNetworkProfileResult
import DeviceFarm.CreateProjectRequest
import DeviceFarm.CreateProjectResult
import DeviceFarm.CreateRemoteAccessSessionRequest
import DeviceFarm.CreateRemoteAccessSessionResult
import DeviceFarm.CreateTestGridProjectRequest
import DeviceFarm.CreateTestGridProjectResult
import DeviceFarm.CreateTestGridUrlRequest
import DeviceFarm.CreateTestGridUrlResult
import DeviceFarm.CreateUploadRequest
import DeviceFarm.CreateUploadResult
import DeviceFarm.CreateVPCEConfigurationRequest
import DeviceFarm.CreateVPCEConfigurationResult
import DeviceFarm.DeleteDevicePoolRequest
import DeviceFarm.DeleteDevicePoolResult
import DeviceFarm.DeleteInstanceProfileRequest
import DeviceFarm.DeleteInstanceProfileResult
import DeviceFarm.DeleteNetworkProfileRequest
import DeviceFarm.DeleteNetworkProfileResult
import DeviceFarm.DeleteProjectRequest
import DeviceFarm.DeleteProjectResult
import DeviceFarm.DeleteRemoteAccessSessionRequest
import DeviceFarm.DeleteRemoteAccessSessionResult
import DeviceFarm.DeleteRunRequest
import DeviceFarm.DeleteRunResult
import DeviceFarm.DeleteTestGridProjectRequest
import DeviceFarm.DeleteTestGridProjectResult
import DeviceFarm.DeleteUploadRequest
import DeviceFarm.DeleteUploadResult
import DeviceFarm.DeleteVPCEConfigurationRequest
import DeviceFarm.DeleteVPCEConfigurationResult
import DeviceFarm.GetAccountSettingsRequest
import DeviceFarm.GetAccountSettingsResult
import DeviceFarm.GetDeviceRequest
import DeviceFarm.GetDeviceResult
import DeviceFarm.GetDeviceInstanceRequest
import DeviceFarm.GetDeviceInstanceResult
import DeviceFarm.GetDevicePoolRequest
import DeviceFarm.GetDevicePoolResult
import DeviceFarm.GetDevicePoolCompatibilityRequest
import DeviceFarm.GetDevicePoolCompatibilityResult
import DeviceFarm.GetInstanceProfileRequest
import DeviceFarm.GetInstanceProfileResult
import DeviceFarm.GetJobRequest
import DeviceFarm.GetJobResult
import DeviceFarm.GetNetworkProfileRequest
import DeviceFarm.GetNetworkProfileResult
import DeviceFarm.GetOfferingStatusRequest
import DeviceFarm.GetOfferingStatusResult
import DeviceFarm.GetProjectRequest
import DeviceFarm.GetProjectResult
import DeviceFarm.GetRemoteAccessSessionRequest
import DeviceFarm.GetRemoteAccessSessionResult
import DeviceFarm.GetRunRequest
import DeviceFarm.GetRunResult
import DeviceFarm.GetSuiteRequest
import DeviceFarm.GetSuiteResult
import DeviceFarm.GetTestRequest
import DeviceFarm.GetTestResult
import DeviceFarm.GetTestGridProjectRequest
import DeviceFarm.GetTestGridProjectResult
import DeviceFarm.GetTestGridSessionRequest
import DeviceFarm.GetTestGridSessionResult
import DeviceFarm.GetUploadRequest
import DeviceFarm.GetUploadResult
import DeviceFarm.GetVPCEConfigurationRequest
import DeviceFarm.GetVPCEConfigurationResult
import DeviceFarm.InstallToRemoteAccessSessionRequest
import DeviceFarm.InstallToRemoteAccessSessionResult
import DeviceFarm.ListArtifactsRequest
import DeviceFarm.ListArtifactsResult
import DeviceFarm.ListDeviceInstancesRequest
import DeviceFarm.ListDeviceInstancesResult
import DeviceFarm.ListDevicePoolsRequest
import DeviceFarm.ListDevicePoolsResult
import DeviceFarm.ListDevicesRequest
import DeviceFarm.ListDevicesResult
import DeviceFarm.ListInstanceProfilesRequest
import DeviceFarm.ListInstanceProfilesResult
import DeviceFarm.ListJobsRequest
import DeviceFarm.ListJobsResult
import DeviceFarm.ListNetworkProfilesRequest
import DeviceFarm.ListNetworkProfilesResult
import DeviceFarm.ListOfferingPromotionsRequest
import DeviceFarm.ListOfferingPromotionsResult
import DeviceFarm.ListOfferingTransactionsRequest
import DeviceFarm.ListOfferingTransactionsResult
import DeviceFarm.ListOfferingsRequest
import DeviceFarm.ListOfferingsResult
import DeviceFarm.ListProjectsRequest
import DeviceFarm.ListProjectsResult
import DeviceFarm.ListRemoteAccessSessionsRequest
import DeviceFarm.ListRemoteAccessSessionsResult
import DeviceFarm.ListRunsRequest
import DeviceFarm.ListRunsResult
import DeviceFarm.ListSamplesRequest
import DeviceFarm.ListSamplesResult
import DeviceFarm.ListSuitesRequest
import DeviceFarm.ListSuitesResult
import DeviceFarm.ListTagsForResourceRequest
import DeviceFarm.ListTagsForResourceResponse
import DeviceFarm.ListTestGridProjectsRequest
import DeviceFarm.ListTestGridProjectsResult
import DeviceFarm.ListTestGridSessionActionsRequest
import DeviceFarm.ListTestGridSessionActionsResult
import DeviceFarm.ListTestGridSessionArtifactsRequest
import DeviceFarm.ListTestGridSessionArtifactsResult
import DeviceFarm.ListTestGridSessionsRequest
import DeviceFarm.ListTestGridSessionsResult
import DeviceFarm.ListTestsRequest
import DeviceFarm.ListTestsResult
import DeviceFarm.ListUniqueProblemsRequest
import DeviceFarm.ListUniqueProblemsResult
import DeviceFarm.ListUploadsRequest
import DeviceFarm.ListUploadsResult
import DeviceFarm.ListVPCEConfigurationsRequest
import DeviceFarm.ListVPCEConfigurationsResult
import DeviceFarm.PurchaseOfferingRequest
import DeviceFarm.PurchaseOfferingResult
import DeviceFarm.RenewOfferingRequest
import DeviceFarm.RenewOfferingResult
import DeviceFarm.ScheduleRunRequest
import DeviceFarm.ScheduleRunResult
import DeviceFarm.StopJobRequest
import DeviceFarm.StopJobResult
import DeviceFarm.StopRemoteAccessSessionRequest
import DeviceFarm.StopRemoteAccessSessionResult
import DeviceFarm.StopRunRequest
import DeviceFarm.StopRunResult
import DeviceFarm.TagResourceRequest
import DeviceFarm.TagResourceResponse
import DeviceFarm.UntagResourceRequest
import DeviceFarm.UntagResourceResponse
import DeviceFarm.UpdateDeviceInstanceRequest
import DeviceFarm.UpdateDeviceInstanceResult
import DeviceFarm.UpdateDevicePoolRequest
import DeviceFarm.UpdateDevicePoolResult
import DeviceFarm.UpdateInstanceProfileRequest
import DeviceFarm.UpdateInstanceProfileResult
import DeviceFarm.UpdateNetworkProfileRequest
import DeviceFarm.UpdateNetworkProfileResult
import DeviceFarm.UpdateProjectRequest
import DeviceFarm.UpdateProjectResult
import DeviceFarm.UpdateTestGridProjectRequest
import DeviceFarm.UpdateTestGridProjectResult
import DeviceFarm.UpdateUploadRequest
import DeviceFarm.UpdateUploadResult
import DeviceFarm.UpdateVPCEConfigurationRequest
import DeviceFarm.UpdateVPCEConfigurationResult
import DeviceFarm.PurchasedDevicesMap
import DeviceFarm.TrialMinutes
import DeviceFarm.MaxSlotMap
import DeviceFarm.CreateRemoteAccessSessionConfiguration
import DeviceFarm.CPU
import DeviceFarm.Resolution
import DeviceFarm.AccountSettings
import DeviceFarm.ScheduleRunTest
import DeviceFarm.ScheduleRunConfiguration
import DeviceFarm.OfferingStatusMap
import DeviceFarm.Counters
import DeviceFarm.DeviceMinutes
import DeviceFarm.UniqueProblemsByExecutionResultMap
import DeviceFarm.OfferingStatus
import DeviceFarm.MonetaryAmount
import DeviceFarm.ProblemDetail
import DeviceFarm.Radios
import DeviceFarm.Location
import DeviceFarm.CustomerArtifactPaths
import DeviceFarm.DeviceSelectionResult
import DeviceFarm.DeviceSelectionConfiguration
import DeviceFarm.ExecutionConfiguration
import DeviceFarm.TestParameters

typealias AWSAccountNumber = String

typealias AccountsCleanup = Boolean

typealias AmazonResourceName = String

typealias AmazonResourceNames = Array<AmazonResourceName>

typealias AndroidPaths = Array<String>

typealias AppPackagesCleanup = Boolean

typealias Artifacts = Array<Artifact>

typealias Boolean = Boolean

typealias ClientId = String

typealias ContentType = String

typealias DateTime = Date

typealias DeviceFarmArn = String

typealias DeviceFilterValues = Array<String>

typealias DeviceFilters = Array<DeviceFilter>

typealias DeviceHostPaths = Array<String>

typealias DeviceInstances = Array<DeviceInstance>

typealias DevicePoolCompatibilityResults = Array<DevicePoolCompatibilityResult>

typealias DevicePools = Array<DevicePool>

typealias Devices = Array<Device>

typealias Double = Number

typealias Filter = String

typealias HostAddress = String

typealias IncompatibilityMessages = Array<IncompatibilityMessage>

typealias InstanceLabels = Array<String>

typealias InstanceProfiles = Array<InstanceProfile>

typealias Integer = Number

typealias IosPaths = Array<String>

typealias JobTimeoutMinutes = Number

typealias Jobs = Array<Job>

typealias Long = Number

typealias MaxPageSize = Number

typealias Message = String

typealias Metadata = String

typealias Name = String

typealias NetworkProfiles = Array<NetworkProfile>

typealias OfferingIdentifier = String

typealias OfferingPromotionIdentifier = String

typealias OfferingPromotions = Array<OfferingPromotion>

typealias OfferingTransactions = Array<OfferingTransaction>

typealias Offerings = Array<Offering>

typealias PackageIds = Array<String>

typealias PaginationToken = String

typealias PercentInteger = Number

typealias Problems = Array<Problem>

typealias Projects = Array<Project>

typealias RecurringCharges = Array<RecurringCharge>

typealias RemoteAccessSessions = Array<RemoteAccessSession>

typealias ResourceDescription = String

typealias ResourceId = String

typealias ResourceName = String

typealias Rules = Array<Rule>

typealias Runs = Array<Run>

typealias Samples = Array<Sample>

typealias ServiceDnsName = String

typealias SkipAppResign = Boolean

typealias SshPublicKey = String

typealias String = String

typealias Suites = Array<Suite>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TestGridProjects = Array<TestGridProject>

typealias TestGridSessionActions = Array<TestGridSessionAction>

typealias TestGridSessionArtifacts = Array<TestGridSessionArtifact>

typealias TestGridSessions = Array<TestGridSession>

typealias TestGridUrlExpiresInSecondsInput = Number

typealias Tests = Array<Test>

typealias TransactionIdentifier = String

typealias URL = String

typealias UniqueProblems = Array<UniqueProblem>

typealias Uploads = Array<Upload>

typealias VPCEConfigurationDescription = String

typealias VPCEConfigurationName = String

typealias VPCEConfigurations = Array<VPCEConfiguration>

typealias VPCEServiceName = String

typealias VideoCapture = Boolean

@JsModule("aws-sdk")
external open class DeviceFarm(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & DeviceFarm.Types.ClientConfiguration */
    open fun createDevicePool(params: CreateDevicePoolRequest, callback: (err: AWSError, data: CreateDevicePoolResult) -> Unit = definedExternally): Request<CreateDevicePoolResult, AWSError>
    open fun createDevicePool(callback: (err: AWSError, data: CreateDevicePoolResult) -> Unit = definedExternally): Request<CreateDevicePoolResult, AWSError>
    open fun createInstanceProfile(params: CreateInstanceProfileRequest, callback: (err: AWSError, data: CreateInstanceProfileResult) -> Unit = definedExternally): Request<CreateInstanceProfileResult, AWSError>
    open fun createInstanceProfile(callback: (err: AWSError, data: CreateInstanceProfileResult) -> Unit = definedExternally): Request<CreateInstanceProfileResult, AWSError>
    open fun createNetworkProfile(params: CreateNetworkProfileRequest, callback: (err: AWSError, data: CreateNetworkProfileResult) -> Unit = definedExternally): Request<CreateNetworkProfileResult, AWSError>
    open fun createNetworkProfile(callback: (err: AWSError, data: CreateNetworkProfileResult) -> Unit = definedExternally): Request<CreateNetworkProfileResult, AWSError>
    open fun createProject(params: CreateProjectRequest, callback: (err: AWSError, data: CreateProjectResult) -> Unit = definedExternally): Request<CreateProjectResult, AWSError>
    open fun createProject(callback: (err: AWSError, data: CreateProjectResult) -> Unit = definedExternally): Request<CreateProjectResult, AWSError>
    open fun createRemoteAccessSession(params: CreateRemoteAccessSessionRequest, callback: (err: AWSError, data: CreateRemoteAccessSessionResult) -> Unit = definedExternally): Request<CreateRemoteAccessSessionResult, AWSError>
    open fun createRemoteAccessSession(callback: (err: AWSError, data: CreateRemoteAccessSessionResult) -> Unit = definedExternally): Request<CreateRemoteAccessSessionResult, AWSError>
    open fun createTestGridProject(params: CreateTestGridProjectRequest, callback: (err: AWSError, data: CreateTestGridProjectResult) -> Unit = definedExternally): Request<CreateTestGridProjectResult, AWSError>
    open fun createTestGridProject(callback: (err: AWSError, data: CreateTestGridProjectResult) -> Unit = definedExternally): Request<CreateTestGridProjectResult, AWSError>
    open fun createTestGridUrl(params: CreateTestGridUrlRequest, callback: (err: AWSError, data: CreateTestGridUrlResult) -> Unit = definedExternally): Request<CreateTestGridUrlResult, AWSError>
    open fun createTestGridUrl(callback: (err: AWSError, data: CreateTestGridUrlResult) -> Unit = definedExternally): Request<CreateTestGridUrlResult, AWSError>
    open fun createUpload(params: CreateUploadRequest, callback: (err: AWSError, data: CreateUploadResult) -> Unit = definedExternally): Request<CreateUploadResult, AWSError>
    open fun createUpload(callback: (err: AWSError, data: CreateUploadResult) -> Unit = definedExternally): Request<CreateUploadResult, AWSError>
    open fun createVPCEConfiguration(params: CreateVPCEConfigurationRequest, callback: (err: AWSError, data: CreateVPCEConfigurationResult) -> Unit = definedExternally): Request<CreateVPCEConfigurationResult, AWSError>
    open fun createVPCEConfiguration(callback: (err: AWSError, data: CreateVPCEConfigurationResult) -> Unit = definedExternally): Request<CreateVPCEConfigurationResult, AWSError>
    open fun deleteDevicePool(params: DeleteDevicePoolRequest, callback: (err: AWSError, data: DeleteDevicePoolResult) -> Unit = definedExternally): Request<DeleteDevicePoolResult, AWSError>
    open fun deleteDevicePool(callback: (err: AWSError, data: DeleteDevicePoolResult) -> Unit = definedExternally): Request<DeleteDevicePoolResult, AWSError>
    open fun deleteInstanceProfile(params: DeleteInstanceProfileRequest, callback: (err: AWSError, data: DeleteInstanceProfileResult) -> Unit = definedExternally): Request<DeleteInstanceProfileResult, AWSError>
    open fun deleteInstanceProfile(callback: (err: AWSError, data: DeleteInstanceProfileResult) -> Unit = definedExternally): Request<DeleteInstanceProfileResult, AWSError>
    open fun deleteNetworkProfile(params: DeleteNetworkProfileRequest, callback: (err: AWSError, data: DeleteNetworkProfileResult) -> Unit = definedExternally): Request<DeleteNetworkProfileResult, AWSError>
    open fun deleteNetworkProfile(callback: (err: AWSError, data: DeleteNetworkProfileResult) -> Unit = definedExternally): Request<DeleteNetworkProfileResult, AWSError>
    open fun deleteProject(params: DeleteProjectRequest, callback: (err: AWSError, data: DeleteProjectResult) -> Unit = definedExternally): Request<DeleteProjectResult, AWSError>
    open fun deleteProject(callback: (err: AWSError, data: DeleteProjectResult) -> Unit = definedExternally): Request<DeleteProjectResult, AWSError>
    open fun deleteRemoteAccessSession(params: DeleteRemoteAccessSessionRequest, callback: (err: AWSError, data: DeleteRemoteAccessSessionResult) -> Unit = definedExternally): Request<DeleteRemoteAccessSessionResult, AWSError>
    open fun deleteRemoteAccessSession(callback: (err: AWSError, data: DeleteRemoteAccessSessionResult) -> Unit = definedExternally): Request<DeleteRemoteAccessSessionResult, AWSError>
    open fun deleteRun(params: DeleteRunRequest, callback: (err: AWSError, data: DeleteRunResult) -> Unit = definedExternally): Request<DeleteRunResult, AWSError>
    open fun deleteRun(callback: (err: AWSError, data: DeleteRunResult) -> Unit = definedExternally): Request<DeleteRunResult, AWSError>
    open fun deleteTestGridProject(params: DeleteTestGridProjectRequest, callback: (err: AWSError, data: DeleteTestGridProjectResult) -> Unit = definedExternally): Request<DeleteTestGridProjectResult, AWSError>
    open fun deleteTestGridProject(callback: (err: AWSError, data: DeleteTestGridProjectResult) -> Unit = definedExternally): Request<DeleteTestGridProjectResult, AWSError>
    open fun deleteUpload(params: DeleteUploadRequest, callback: (err: AWSError, data: DeleteUploadResult) -> Unit = definedExternally): Request<DeleteUploadResult, AWSError>
    open fun deleteUpload(callback: (err: AWSError, data: DeleteUploadResult) -> Unit = definedExternally): Request<DeleteUploadResult, AWSError>
    open fun deleteVPCEConfiguration(params: DeleteVPCEConfigurationRequest, callback: (err: AWSError, data: DeleteVPCEConfigurationResult) -> Unit = definedExternally): Request<DeleteVPCEConfigurationResult, AWSError>
    open fun deleteVPCEConfiguration(callback: (err: AWSError, data: DeleteVPCEConfigurationResult) -> Unit = definedExternally): Request<DeleteVPCEConfigurationResult, AWSError>
    open fun getAccountSettings(params: GetAccountSettingsRequest, callback: (err: AWSError, data: GetAccountSettingsResult) -> Unit = definedExternally): Request<GetAccountSettingsResult, AWSError>
    open fun getAccountSettings(callback: (err: AWSError, data: GetAccountSettingsResult) -> Unit = definedExternally): Request<GetAccountSettingsResult, AWSError>
    open fun getDevice(params: GetDeviceRequest, callback: (err: AWSError, data: GetDeviceResult) -> Unit = definedExternally): Request<GetDeviceResult, AWSError>
    open fun getDevice(callback: (err: AWSError, data: GetDeviceResult) -> Unit = definedExternally): Request<GetDeviceResult, AWSError>
    open fun getDeviceInstance(params: GetDeviceInstanceRequest, callback: (err: AWSError, data: GetDeviceInstanceResult) -> Unit = definedExternally): Request<GetDeviceInstanceResult, AWSError>
    open fun getDeviceInstance(callback: (err: AWSError, data: GetDeviceInstanceResult) -> Unit = definedExternally): Request<GetDeviceInstanceResult, AWSError>
    open fun getDevicePool(params: GetDevicePoolRequest, callback: (err: AWSError, data: GetDevicePoolResult) -> Unit = definedExternally): Request<GetDevicePoolResult, AWSError>
    open fun getDevicePool(callback: (err: AWSError, data: GetDevicePoolResult) -> Unit = definedExternally): Request<GetDevicePoolResult, AWSError>
    open fun getDevicePoolCompatibility(params: GetDevicePoolCompatibilityRequest, callback: (err: AWSError, data: GetDevicePoolCompatibilityResult) -> Unit = definedExternally): Request<GetDevicePoolCompatibilityResult, AWSError>
    open fun getDevicePoolCompatibility(callback: (err: AWSError, data: GetDevicePoolCompatibilityResult) -> Unit = definedExternally): Request<GetDevicePoolCompatibilityResult, AWSError>
    open fun getInstanceProfile(params: GetInstanceProfileRequest, callback: (err: AWSError, data: GetInstanceProfileResult) -> Unit = definedExternally): Request<GetInstanceProfileResult, AWSError>
    open fun getInstanceProfile(callback: (err: AWSError, data: GetInstanceProfileResult) -> Unit = definedExternally): Request<GetInstanceProfileResult, AWSError>
    open fun getJob(params: GetJobRequest, callback: (err: AWSError, data: GetJobResult) -> Unit = definedExternally): Request<GetJobResult, AWSError>
    open fun getJob(callback: (err: AWSError, data: GetJobResult) -> Unit = definedExternally): Request<GetJobResult, AWSError>
    open fun getNetworkProfile(params: GetNetworkProfileRequest, callback: (err: AWSError, data: GetNetworkProfileResult) -> Unit = definedExternally): Request<GetNetworkProfileResult, AWSError>
    open fun getNetworkProfile(callback: (err: AWSError, data: GetNetworkProfileResult) -> Unit = definedExternally): Request<GetNetworkProfileResult, AWSError>
    open fun getOfferingStatus(params: GetOfferingStatusRequest, callback: (err: AWSError, data: GetOfferingStatusResult) -> Unit = definedExternally): Request<GetOfferingStatusResult, AWSError>
    open fun getOfferingStatus(callback: (err: AWSError, data: GetOfferingStatusResult) -> Unit = definedExternally): Request<GetOfferingStatusResult, AWSError>
    open fun getProject(params: GetProjectRequest, callback: (err: AWSError, data: GetProjectResult) -> Unit = definedExternally): Request<GetProjectResult, AWSError>
    open fun getProject(callback: (err: AWSError, data: GetProjectResult) -> Unit = definedExternally): Request<GetProjectResult, AWSError>
    open fun getRemoteAccessSession(params: GetRemoteAccessSessionRequest, callback: (err: AWSError, data: GetRemoteAccessSessionResult) -> Unit = definedExternally): Request<GetRemoteAccessSessionResult, AWSError>
    open fun getRemoteAccessSession(callback: (err: AWSError, data: GetRemoteAccessSessionResult) -> Unit = definedExternally): Request<GetRemoteAccessSessionResult, AWSError>
    open fun getRun(params: GetRunRequest, callback: (err: AWSError, data: GetRunResult) -> Unit = definedExternally): Request<GetRunResult, AWSError>
    open fun getRun(callback: (err: AWSError, data: GetRunResult) -> Unit = definedExternally): Request<GetRunResult, AWSError>
    open fun getSuite(params: GetSuiteRequest, callback: (err: AWSError, data: GetSuiteResult) -> Unit = definedExternally): Request<GetSuiteResult, AWSError>
    open fun getSuite(callback: (err: AWSError, data: GetSuiteResult) -> Unit = definedExternally): Request<GetSuiteResult, AWSError>
    open fun getTest(params: GetTestRequest, callback: (err: AWSError, data: GetTestResult) -> Unit = definedExternally): Request<GetTestResult, AWSError>
    open fun getTest(callback: (err: AWSError, data: GetTestResult) -> Unit = definedExternally): Request<GetTestResult, AWSError>
    open fun getTestGridProject(params: GetTestGridProjectRequest, callback: (err: AWSError, data: GetTestGridProjectResult) -> Unit = definedExternally): Request<GetTestGridProjectResult, AWSError>
    open fun getTestGridProject(callback: (err: AWSError, data: GetTestGridProjectResult) -> Unit = definedExternally): Request<GetTestGridProjectResult, AWSError>
    open fun getTestGridSession(params: GetTestGridSessionRequest, callback: (err: AWSError, data: GetTestGridSessionResult) -> Unit = definedExternally): Request<GetTestGridSessionResult, AWSError>
    open fun getTestGridSession(callback: (err: AWSError, data: GetTestGridSessionResult) -> Unit = definedExternally): Request<GetTestGridSessionResult, AWSError>
    open fun getUpload(params: GetUploadRequest, callback: (err: AWSError, data: GetUploadResult) -> Unit = definedExternally): Request<GetUploadResult, AWSError>
    open fun getUpload(callback: (err: AWSError, data: GetUploadResult) -> Unit = definedExternally): Request<GetUploadResult, AWSError>
    open fun getVPCEConfiguration(params: GetVPCEConfigurationRequest, callback: (err: AWSError, data: GetVPCEConfigurationResult) -> Unit = definedExternally): Request<GetVPCEConfigurationResult, AWSError>
    open fun getVPCEConfiguration(callback: (err: AWSError, data: GetVPCEConfigurationResult) -> Unit = definedExternally): Request<GetVPCEConfigurationResult, AWSError>
    open fun installToRemoteAccessSession(params: InstallToRemoteAccessSessionRequest, callback: (err: AWSError, data: InstallToRemoteAccessSessionResult) -> Unit = definedExternally): Request<InstallToRemoteAccessSessionResult, AWSError>
    open fun installToRemoteAccessSession(callback: (err: AWSError, data: InstallToRemoteAccessSessionResult) -> Unit = definedExternally): Request<InstallToRemoteAccessSessionResult, AWSError>
    open fun listArtifacts(params: ListArtifactsRequest, callback: (err: AWSError, data: ListArtifactsResult) -> Unit = definedExternally): Request<ListArtifactsResult, AWSError>
    open fun listArtifacts(callback: (err: AWSError, data: ListArtifactsResult) -> Unit = definedExternally): Request<ListArtifactsResult, AWSError>
    open fun listDeviceInstances(params: ListDeviceInstancesRequest, callback: (err: AWSError, data: ListDeviceInstancesResult) -> Unit = definedExternally): Request<ListDeviceInstancesResult, AWSError>
    open fun listDeviceInstances(callback: (err: AWSError, data: ListDeviceInstancesResult) -> Unit = definedExternally): Request<ListDeviceInstancesResult, AWSError>
    open fun listDevicePools(params: ListDevicePoolsRequest, callback: (err: AWSError, data: ListDevicePoolsResult) -> Unit = definedExternally): Request<ListDevicePoolsResult, AWSError>
    open fun listDevicePools(callback: (err: AWSError, data: ListDevicePoolsResult) -> Unit = definedExternally): Request<ListDevicePoolsResult, AWSError>
    open fun listDevices(params: ListDevicesRequest, callback: (err: AWSError, data: ListDevicesResult) -> Unit = definedExternally): Request<ListDevicesResult, AWSError>
    open fun listDevices(callback: (err: AWSError, data: ListDevicesResult) -> Unit = definedExternally): Request<ListDevicesResult, AWSError>
    open fun listInstanceProfiles(params: ListInstanceProfilesRequest, callback: (err: AWSError, data: ListInstanceProfilesResult) -> Unit = definedExternally): Request<ListInstanceProfilesResult, AWSError>
    open fun listInstanceProfiles(callback: (err: AWSError, data: ListInstanceProfilesResult) -> Unit = definedExternally): Request<ListInstanceProfilesResult, AWSError>
    open fun listJobs(params: ListJobsRequest, callback: (err: AWSError, data: ListJobsResult) -> Unit = definedExternally): Request<ListJobsResult, AWSError>
    open fun listJobs(callback: (err: AWSError, data: ListJobsResult) -> Unit = definedExternally): Request<ListJobsResult, AWSError>
    open fun listNetworkProfiles(params: ListNetworkProfilesRequest, callback: (err: AWSError, data: ListNetworkProfilesResult) -> Unit = definedExternally): Request<ListNetworkProfilesResult, AWSError>
    open fun listNetworkProfiles(callback: (err: AWSError, data: ListNetworkProfilesResult) -> Unit = definedExternally): Request<ListNetworkProfilesResult, AWSError>
    open fun listOfferingPromotions(params: ListOfferingPromotionsRequest, callback: (err: AWSError, data: ListOfferingPromotionsResult) -> Unit = definedExternally): Request<ListOfferingPromotionsResult, AWSError>
    open fun listOfferingPromotions(callback: (err: AWSError, data: ListOfferingPromotionsResult) -> Unit = definedExternally): Request<ListOfferingPromotionsResult, AWSError>
    open fun listOfferingTransactions(params: ListOfferingTransactionsRequest, callback: (err: AWSError, data: ListOfferingTransactionsResult) -> Unit = definedExternally): Request<ListOfferingTransactionsResult, AWSError>
    open fun listOfferingTransactions(callback: (err: AWSError, data: ListOfferingTransactionsResult) -> Unit = definedExternally): Request<ListOfferingTransactionsResult, AWSError>
    open fun listOfferings(params: ListOfferingsRequest, callback: (err: AWSError, data: ListOfferingsResult) -> Unit = definedExternally): Request<ListOfferingsResult, AWSError>
    open fun listOfferings(callback: (err: AWSError, data: ListOfferingsResult) -> Unit = definedExternally): Request<ListOfferingsResult, AWSError>
    open fun listProjects(params: ListProjectsRequest, callback: (err: AWSError, data: ListProjectsResult) -> Unit = definedExternally): Request<ListProjectsResult, AWSError>
    open fun listProjects(callback: (err: AWSError, data: ListProjectsResult) -> Unit = definedExternally): Request<ListProjectsResult, AWSError>
    open fun listRemoteAccessSessions(params: ListRemoteAccessSessionsRequest, callback: (err: AWSError, data: ListRemoteAccessSessionsResult) -> Unit = definedExternally): Request<ListRemoteAccessSessionsResult, AWSError>
    open fun listRemoteAccessSessions(callback: (err: AWSError, data: ListRemoteAccessSessionsResult) -> Unit = definedExternally): Request<ListRemoteAccessSessionsResult, AWSError>
    open fun listRuns(params: ListRunsRequest, callback: (err: AWSError, data: ListRunsResult) -> Unit = definedExternally): Request<ListRunsResult, AWSError>
    open fun listRuns(callback: (err: AWSError, data: ListRunsResult) -> Unit = definedExternally): Request<ListRunsResult, AWSError>
    open fun listSamples(params: ListSamplesRequest, callback: (err: AWSError, data: ListSamplesResult) -> Unit = definedExternally): Request<ListSamplesResult, AWSError>
    open fun listSamples(callback: (err: AWSError, data: ListSamplesResult) -> Unit = definedExternally): Request<ListSamplesResult, AWSError>
    open fun listSuites(params: ListSuitesRequest, callback: (err: AWSError, data: ListSuitesResult) -> Unit = definedExternally): Request<ListSuitesResult, AWSError>
    open fun listSuites(callback: (err: AWSError, data: ListSuitesResult) -> Unit = definedExternally): Request<ListSuitesResult, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTestGridProjects(params: ListTestGridProjectsRequest, callback: (err: AWSError, data: ListTestGridProjectsResult) -> Unit = definedExternally): Request<ListTestGridProjectsResult, AWSError>
    open fun listTestGridProjects(callback: (err: AWSError, data: ListTestGridProjectsResult) -> Unit = definedExternally): Request<ListTestGridProjectsResult, AWSError>
    open fun listTestGridSessionActions(params: ListTestGridSessionActionsRequest, callback: (err: AWSError, data: ListTestGridSessionActionsResult) -> Unit = definedExternally): Request<ListTestGridSessionActionsResult, AWSError>
    open fun listTestGridSessionActions(callback: (err: AWSError, data: ListTestGridSessionActionsResult) -> Unit = definedExternally): Request<ListTestGridSessionActionsResult, AWSError>
    open fun listTestGridSessionArtifacts(params: ListTestGridSessionArtifactsRequest, callback: (err: AWSError, data: ListTestGridSessionArtifactsResult) -> Unit = definedExternally): Request<ListTestGridSessionArtifactsResult, AWSError>
    open fun listTestGridSessionArtifacts(callback: (err: AWSError, data: ListTestGridSessionArtifactsResult) -> Unit = definedExternally): Request<ListTestGridSessionArtifactsResult, AWSError>
    open fun listTestGridSessions(params: ListTestGridSessionsRequest, callback: (err: AWSError, data: ListTestGridSessionsResult) -> Unit = definedExternally): Request<ListTestGridSessionsResult, AWSError>
    open fun listTestGridSessions(callback: (err: AWSError, data: ListTestGridSessionsResult) -> Unit = definedExternally): Request<ListTestGridSessionsResult, AWSError>
    open fun listTests(params: ListTestsRequest, callback: (err: AWSError, data: ListTestsResult) -> Unit = definedExternally): Request<ListTestsResult, AWSError>
    open fun listTests(callback: (err: AWSError, data: ListTestsResult) -> Unit = definedExternally): Request<ListTestsResult, AWSError>
    open fun listUniqueProblems(params: ListUniqueProblemsRequest, callback: (err: AWSError, data: ListUniqueProblemsResult) -> Unit = definedExternally): Request<ListUniqueProblemsResult, AWSError>
    open fun listUniqueProblems(callback: (err: AWSError, data: ListUniqueProblemsResult) -> Unit = definedExternally): Request<ListUniqueProblemsResult, AWSError>
    open fun listUploads(params: ListUploadsRequest, callback: (err: AWSError, data: ListUploadsResult) -> Unit = definedExternally): Request<ListUploadsResult, AWSError>
    open fun listUploads(callback: (err: AWSError, data: ListUploadsResult) -> Unit = definedExternally): Request<ListUploadsResult, AWSError>
    open fun listVPCEConfigurations(params: ListVPCEConfigurationsRequest, callback: (err: AWSError, data: ListVPCEConfigurationsResult) -> Unit = definedExternally): Request<ListVPCEConfigurationsResult, AWSError>
    open fun listVPCEConfigurations(callback: (err: AWSError, data: ListVPCEConfigurationsResult) -> Unit = definedExternally): Request<ListVPCEConfigurationsResult, AWSError>
    open fun purchaseOffering(params: PurchaseOfferingRequest, callback: (err: AWSError, data: PurchaseOfferingResult) -> Unit = definedExternally): Request<PurchaseOfferingResult, AWSError>
    open fun purchaseOffering(callback: (err: AWSError, data: PurchaseOfferingResult) -> Unit = definedExternally): Request<PurchaseOfferingResult, AWSError>
    open fun renewOffering(params: RenewOfferingRequest, callback: (err: AWSError, data: RenewOfferingResult) -> Unit = definedExternally): Request<RenewOfferingResult, AWSError>
    open fun renewOffering(callback: (err: AWSError, data: RenewOfferingResult) -> Unit = definedExternally): Request<RenewOfferingResult, AWSError>
    open fun scheduleRun(params: ScheduleRunRequest, callback: (err: AWSError, data: ScheduleRunResult) -> Unit = definedExternally): Request<ScheduleRunResult, AWSError>
    open fun scheduleRun(callback: (err: AWSError, data: ScheduleRunResult) -> Unit = definedExternally): Request<ScheduleRunResult, AWSError>
    open fun stopJob(params: StopJobRequest, callback: (err: AWSError, data: StopJobResult) -> Unit = definedExternally): Request<StopJobResult, AWSError>
    open fun stopJob(callback: (err: AWSError, data: StopJobResult) -> Unit = definedExternally): Request<StopJobResult, AWSError>
    open fun stopRemoteAccessSession(params: StopRemoteAccessSessionRequest, callback: (err: AWSError, data: StopRemoteAccessSessionResult) -> Unit = definedExternally): Request<StopRemoteAccessSessionResult, AWSError>
    open fun stopRemoteAccessSession(callback: (err: AWSError, data: StopRemoteAccessSessionResult) -> Unit = definedExternally): Request<StopRemoteAccessSessionResult, AWSError>
    open fun stopRun(params: StopRunRequest, callback: (err: AWSError, data: StopRunResult) -> Unit = definedExternally): Request<StopRunResult, AWSError>
    open fun stopRun(callback: (err: AWSError, data: StopRunResult) -> Unit = definedExternally): Request<StopRunResult, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateDeviceInstance(params: UpdateDeviceInstanceRequest, callback: (err: AWSError, data: UpdateDeviceInstanceResult) -> Unit = definedExternally): Request<UpdateDeviceInstanceResult, AWSError>
    open fun updateDeviceInstance(callback: (err: AWSError, data: UpdateDeviceInstanceResult) -> Unit = definedExternally): Request<UpdateDeviceInstanceResult, AWSError>
    open fun updateDevicePool(params: UpdateDevicePoolRequest, callback: (err: AWSError, data: UpdateDevicePoolResult) -> Unit = definedExternally): Request<UpdateDevicePoolResult, AWSError>
    open fun updateDevicePool(callback: (err: AWSError, data: UpdateDevicePoolResult) -> Unit = definedExternally): Request<UpdateDevicePoolResult, AWSError>
    open fun updateInstanceProfile(params: UpdateInstanceProfileRequest, callback: (err: AWSError, data: UpdateInstanceProfileResult) -> Unit = definedExternally): Request<UpdateInstanceProfileResult, AWSError>
    open fun updateInstanceProfile(callback: (err: AWSError, data: UpdateInstanceProfileResult) -> Unit = definedExternally): Request<UpdateInstanceProfileResult, AWSError>
    open fun updateNetworkProfile(params: UpdateNetworkProfileRequest, callback: (err: AWSError, data: UpdateNetworkProfileResult) -> Unit = definedExternally): Request<UpdateNetworkProfileResult, AWSError>
    open fun updateNetworkProfile(callback: (err: AWSError, data: UpdateNetworkProfileResult) -> Unit = definedExternally): Request<UpdateNetworkProfileResult, AWSError>
    open fun updateProject(params: UpdateProjectRequest, callback: (err: AWSError, data: UpdateProjectResult) -> Unit = definedExternally): Request<UpdateProjectResult, AWSError>
    open fun updateProject(callback: (err: AWSError, data: UpdateProjectResult) -> Unit = definedExternally): Request<UpdateProjectResult, AWSError>
    open fun updateTestGridProject(params: UpdateTestGridProjectRequest, callback: (err: AWSError, data: UpdateTestGridProjectResult) -> Unit = definedExternally): Request<UpdateTestGridProjectResult, AWSError>
    open fun updateTestGridProject(callback: (err: AWSError, data: UpdateTestGridProjectResult) -> Unit = definedExternally): Request<UpdateTestGridProjectResult, AWSError>
    open fun updateUpload(params: UpdateUploadRequest, callback: (err: AWSError, data: UpdateUploadResult) -> Unit = definedExternally): Request<UpdateUploadResult, AWSError>
    open fun updateUpload(callback: (err: AWSError, data: UpdateUploadResult) -> Unit = definedExternally): Request<UpdateUploadResult, AWSError>
    open fun updateVPCEConfiguration(params: UpdateVPCEConfigurationRequest, callback: (err: AWSError, data: UpdateVPCEConfigurationResult) -> Unit = definedExternally): Request<UpdateVPCEConfigurationResult, AWSError>
    open fun updateVPCEConfiguration(callback: (err: AWSError, data: UpdateVPCEConfigurationResult) -> Unit = definedExternally): Request<UpdateVPCEConfigurationResult, AWSError>
    interface AccountSettings {
        var awsAccountNumber: AWSAccountNumber?
            get() = definedExternally
            set(value) = definedExternally
        var unmeteredDevices: PurchasedDevicesMap?
            get() = definedExternally
            set(value) = definedExternally
        var unmeteredRemoteAccessDevices: PurchasedDevicesMap?
            get() = definedExternally
            set(value) = definedExternally
        var maxJobTimeoutMinutes: JobTimeoutMinutes?
            get() = definedExternally
            set(value) = definedExternally
        var trialMinutes: TrialMinutes?
            get() = definedExternally
            set(value) = definedExternally
        var maxSlots: MaxSlotMap?
            get() = definedExternally
            set(value) = definedExternally
        var defaultJobTimeoutMinutes: JobTimeoutMinutes?
            get() = definedExternally
            set(value) = definedExternally
        var skipAppResign: SkipAppResign?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Artifact {
        var arn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "UNKNOWN" | "SCREENSHOT" | "DEVICE_LOG" | "MESSAGE_LOG" | "VIDEO_LOG" | "RESULT_LOG" | "SERVICE_LOG" | "WEBKIT_LOG" | "INSTRUMENTATION_OUTPUT" | "EXERCISER_MONKEY_OUTPUT" | "CALABASH_JSON_OUTPUT" | "CALABASH_PRETTY_OUTPUT" | "CALABASH_STANDARD_OUTPUT" | "CALABASH_JAVA_XML_OUTPUT" | "AUTOMATION_OUTPUT" | "APPIUM_SERVER_OUTPUT" | "APPIUM_JAVA_OUTPUT" | "APPIUM_JAVA_XML_OUTPUT" | "APPIUM_PYTHON_OUTPUT" | "APPIUM_PYTHON_XML_OUTPUT" | "EXPLORER_EVENT_LOG" | "EXPLORER_SUMMARY_LOG" | "APPLICATION_CRASH_REPORT" | "XCTEST_LOG" | "VIDEO" | "CUSTOMER_ARTIFACT" | "CUSTOMER_ARTIFACT_LOG" | "TESTSPEC_OUTPUT" | String */
        var extension: String?
            get() = definedExternally
            set(value) = definedExternally
        var url: URL?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CPU {
        var frequency: String?
            get() = definedExternally
            set(value) = definedExternally
        var architecture: String?
            get() = definedExternally
            set(value) = definedExternally
        var clock: Double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Counters {
        var total: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var passed: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var failed: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var warned: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var errored: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var stopped: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var skipped: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDevicePoolRequest {
        var projectArn: AmazonResourceName
        var name: Name
        var description: Message?
            get() = definedExternally
            set(value) = definedExternally
        var rules: Rules
        var maxDevices: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDevicePoolResult {
        var devicePool: DevicePool?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateInstanceProfileRequest {
        var name: Name
        var description: Message?
            get() = definedExternally
            set(value) = definedExternally
        var packageCleanup: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var excludeAppPackagesFromCleanup: PackageIds?
            get() = definedExternally
            set(value) = definedExternally
        var rebootAfterUse: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateInstanceProfileResult {
        var instanceProfile: InstanceProfile?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateNetworkProfileRequest {
        var projectArn: AmazonResourceName
        var name: Name
        var description: Message?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "CURATED" | "PRIVATE" | String */
        var uplinkBandwidthBits: Long?
            get() = definedExternally
            set(value) = definedExternally
        var downlinkBandwidthBits: Long?
            get() = definedExternally
            set(value) = definedExternally
        var uplinkDelayMs: Long?
            get() = definedExternally
            set(value) = definedExternally
        var downlinkDelayMs: Long?
            get() = definedExternally
            set(value) = definedExternally
        var uplinkJitterMs: Long?
            get() = definedExternally
            set(value) = definedExternally
        var downlinkJitterMs: Long?
            get() = definedExternally
            set(value) = definedExternally
        var uplinkLossPercent: PercentInteger?
            get() = definedExternally
            set(value) = definedExternally
        var downlinkLossPercent: PercentInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateNetworkProfileResult {
        var networkProfile: NetworkProfile?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProjectRequest {
        var name: Name
        var defaultJobTimeoutMinutes: JobTimeoutMinutes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProjectResult {
        var project: Project?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRemoteAccessSessionConfiguration {
        var billingMethod: String /* "METERED" | "UNMETERED" | String */
        var vpceConfigurationArns: AmazonResourceNames?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRemoteAccessSessionRequest {
        var projectArn: AmazonResourceName
        var deviceArn: AmazonResourceName
        var instanceArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var sshPublicKey: SshPublicKey?
            get() = definedExternally
            set(value) = definedExternally
        var remoteDebugEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var remoteRecordEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var remoteRecordAppArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var clientId: ClientId?
            get() = definedExternally
            set(value) = definedExternally
        var configuration: CreateRemoteAccessSessionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var interactionMode: String /* "INTERACTIVE" | "NO_VIDEO" | "VIDEO_ONLY" | String */
        var skipAppResign: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRemoteAccessSessionResult {
        var remoteAccessSession: RemoteAccessSession?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTestGridProjectRequest {
        var name: ResourceName
        var description: ResourceDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTestGridProjectResult {
        var testGridProject: TestGridProject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTestGridUrlRequest {
        var projectArn: DeviceFarmArn
        var expiresInSeconds: TestGridUrlExpiresInSecondsInput
    }
    interface CreateTestGridUrlResult {
        var url: String?
            get() = definedExternally
            set(value) = definedExternally
        var expires: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUploadRequest {
        var projectArn: AmazonResourceName
        var name: Name
        var type: String /* "ANDROID_APP" | "IOS_APP" | "WEB_APP" | "EXTERNAL_DATA" | "APPIUM_JAVA_JUNIT_TEST_PACKAGE" | "APPIUM_JAVA_TESTNG_TEST_PACKAGE" | "APPIUM_PYTHON_TEST_PACKAGE" | "APPIUM_NODE_TEST_PACKAGE" | "APPIUM_RUBY_TEST_PACKAGE" | "APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE" | "APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE" | "APPIUM_WEB_PYTHON_TEST_PACKAGE" | "APPIUM_WEB_NODE_TEST_PACKAGE" | "APPIUM_WEB_RUBY_TEST_PACKAGE" | "CALABASH_TEST_PACKAGE" | "INSTRUMENTATION_TEST_PACKAGE" | "UIAUTOMATION_TEST_PACKAGE" | "UIAUTOMATOR_TEST_PACKAGE" | "XCTEST_TEST_PACKAGE" | "XCTEST_UI_TEST_PACKAGE" | "APPIUM_JAVA_JUNIT_TEST_SPEC" | "APPIUM_JAVA_TESTNG_TEST_SPEC" | "APPIUM_PYTHON_TEST_SPEC" | "APPIUM_NODE_TEST_SPEC" | "APPIUM_RUBY_TEST_SPEC" | "APPIUM_WEB_JAVA_JUNIT_TEST_SPEC" | "APPIUM_WEB_JAVA_TESTNG_TEST_SPEC" | "APPIUM_WEB_PYTHON_TEST_SPEC" | "APPIUM_WEB_NODE_TEST_SPEC" | "APPIUM_WEB_RUBY_TEST_SPEC" | "INSTRUMENTATION_TEST_SPEC" | "XCTEST_UI_TEST_SPEC" | String */
        var contentType: ContentType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUploadResult {
        var upload: Upload?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateVPCEConfigurationRequest {
        var vpceConfigurationName: VPCEConfigurationName
        var vpceServiceName: VPCEServiceName
        var serviceDnsName: ServiceDnsName
        var vpceConfigurationDescription: VPCEConfigurationDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateVPCEConfigurationResult {
        var vpceConfiguration: VPCEConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CustomerArtifactPaths {
        var iosPaths: IosPaths?
            get() = definedExternally
            set(value) = definedExternally
        var androidPaths: AndroidPaths?
            get() = definedExternally
            set(value) = definedExternally
        var deviceHostPaths: DeviceHostPaths?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDevicePoolRequest {
        var arn: AmazonResourceName
    }
    interface DeleteDevicePoolResult
    interface DeleteInstanceProfileRequest {
        var arn: AmazonResourceName
    }
    interface DeleteInstanceProfileResult
    interface DeleteNetworkProfileRequest {
        var arn: AmazonResourceName
    }
    interface DeleteNetworkProfileResult
    interface DeleteProjectRequest {
        var arn: AmazonResourceName
    }
    interface DeleteProjectResult
    interface DeleteRemoteAccessSessionRequest {
        var arn: AmazonResourceName
    }
    interface DeleteRemoteAccessSessionResult
    interface DeleteRunRequest {
        var arn: AmazonResourceName
    }
    interface DeleteRunResult
    interface DeleteTestGridProjectRequest {
        var projectArn: DeviceFarmArn
    }
    interface DeleteTestGridProjectResult
    interface DeleteUploadRequest {
        var arn: AmazonResourceName
    }
    interface DeleteUploadResult
    interface DeleteVPCEConfigurationRequest {
        var arn: AmazonResourceName
    }
    interface DeleteVPCEConfigurationResult
    interface Device {
        var arn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var manufacturer: String?
            get() = definedExternally
            set(value) = definedExternally
        var model: String?
            get() = definedExternally
            set(value) = definedExternally
        var modelId: String?
            get() = definedExternally
            set(value) = definedExternally
        var formFactor: String /* "PHONE" | "TABLET" | String */
        var platform: String /* "ANDROID" | "IOS" | String */
        var os: String?
            get() = definedExternally
            set(value) = definedExternally
        var cpu: CPU?
            get() = definedExternally
            set(value) = definedExternally
        var resolution: Resolution?
            get() = definedExternally
            set(value) = definedExternally
        var heapSize: Long?
            get() = definedExternally
            set(value) = definedExternally
        var memory: Long?
            get() = definedExternally
            set(value) = definedExternally
        var image: String?
            get() = definedExternally
            set(value) = definedExternally
        var carrier: String?
            get() = definedExternally
            set(value) = definedExternally
        var radio: String?
            get() = definedExternally
            set(value) = definedExternally
        var remoteAccessEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var remoteDebugEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var fleetType: String?
            get() = definedExternally
            set(value) = definedExternally
        var fleetName: String?
            get() = definedExternally
            set(value) = definedExternally
        var instances: DeviceInstances?
            get() = definedExternally
            set(value) = definedExternally
        var availability: String /* "TEMPORARY_NOT_AVAILABLE" | "BUSY" | "AVAILABLE" | "HIGHLY_AVAILABLE" | String */
    }
    interface DeviceFilter {
        var attribute: String /* "ARN" | "PLATFORM" | "OS_VERSION" | "MODEL" | "AVAILABILITY" | "FORM_FACTOR" | "MANUFACTURER" | "REMOTE_ACCESS_ENABLED" | "REMOTE_DEBUG_ENABLED" | "INSTANCE_ARN" | "INSTANCE_LABELS" | "FLEET_TYPE" | String */
        var operator: String /* "EQUALS" | "LESS_THAN" | "LESS_THAN_OR_EQUALS" | "GREATER_THAN" | "GREATER_THAN_OR_EQUALS" | "IN" | "NOT_IN" | "CONTAINS" | String */
        var values: DeviceFilterValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeviceInstance {
        var arn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var deviceArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var labels: InstanceLabels?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "IN_USE" | "PREPARING" | "AVAILABLE" | "NOT_AVAILABLE" | String */
        var udid: String?
            get() = definedExternally
            set(value) = definedExternally
        var instanceProfile: InstanceProfile?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeviceMinutes {
        var total: Double?
            get() = definedExternally
            set(value) = definedExternally
        var metered: Double?
            get() = definedExternally
            set(value) = definedExternally
        var unmetered: Double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DevicePool {
        var arn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var description: Message?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "CURATED" | "PRIVATE" | String */
        var rules: Rules?
            get() = definedExternally
            set(value) = definedExternally
        var maxDevices: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DevicePoolCompatibilityResult {
        var device: Device?
            get() = definedExternally
            set(value) = definedExternally
        var compatible: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var incompatibilityMessages: IncompatibilityMessages?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeviceSelectionConfiguration {
        var filters: DeviceFilters
        var maxDevices: Integer
    }
    interface DeviceSelectionResult {
        var filters: DeviceFilters?
            get() = definedExternally
            set(value) = definedExternally
        var matchedDevicesCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var maxDevices: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExecutionConfiguration {
        var jobTimeoutMinutes: JobTimeoutMinutes?
            get() = definedExternally
            set(value) = definedExternally
        var accountsCleanup: AccountsCleanup?
            get() = definedExternally
            set(value) = definedExternally
        var appPackagesCleanup: AppPackagesCleanup?
            get() = definedExternally
            set(value) = definedExternally
        var videoCapture: VideoCapture?
            get() = definedExternally
            set(value) = definedExternally
        var skipAppResign: SkipAppResign?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAccountSettingsRequest
    interface GetAccountSettingsResult {
        var accountSettings: AccountSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeviceInstanceRequest {
        var arn: AmazonResourceName
    }
    interface GetDeviceInstanceResult {
        var deviceInstance: DeviceInstance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDevicePoolCompatibilityRequest {
        var devicePoolArn: AmazonResourceName
        var appArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var testType: String /* "BUILTIN_FUZZ" | "BUILTIN_EXPLORER" | "WEB_PERFORMANCE_PROFILE" | "APPIUM_JAVA_JUNIT" | "APPIUM_JAVA_TESTNG" | "APPIUM_PYTHON" | "APPIUM_NODE" | "APPIUM_RUBY" | "APPIUM_WEB_JAVA_JUNIT" | "APPIUM_WEB_JAVA_TESTNG" | "APPIUM_WEB_PYTHON" | "APPIUM_WEB_NODE" | "APPIUM_WEB_RUBY" | "CALABASH" | "INSTRUMENTATION" | "UIAUTOMATION" | "UIAUTOMATOR" | "XCTEST" | "XCTEST_UI" | "REMOTE_ACCESS_RECORD" | "REMOTE_ACCESS_REPLAY" | String */
        var test: ScheduleRunTest?
            get() = definedExternally
            set(value) = definedExternally
        var configuration: ScheduleRunConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDevicePoolCompatibilityResult {
        var compatibleDevices: DevicePoolCompatibilityResults?
            get() = definedExternally
            set(value) = definedExternally
        var incompatibleDevices: DevicePoolCompatibilityResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDevicePoolRequest {
        var arn: AmazonResourceName
    }
    interface GetDevicePoolResult {
        var devicePool: DevicePool?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeviceRequest {
        var arn: AmazonResourceName
    }
    interface GetDeviceResult {
        var device: Device?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInstanceProfileRequest {
        var arn: AmazonResourceName
    }
    interface GetInstanceProfileResult {
        var instanceProfile: InstanceProfile?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetJobRequest {
        var arn: AmazonResourceName
    }
    interface GetJobResult {
        var job: Job?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetNetworkProfileRequest {
        var arn: AmazonResourceName
    }
    interface GetNetworkProfileResult {
        var networkProfile: NetworkProfile?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOfferingStatusRequest {
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOfferingStatusResult {
        var current: OfferingStatusMap?
            get() = definedExternally
            set(value) = definedExternally
        var nextPeriod: OfferingStatusMap?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetProjectRequest {
        var arn: AmazonResourceName
    }
    interface GetProjectResult {
        var project: Project?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRemoteAccessSessionRequest {
        var arn: AmazonResourceName
    }
    interface GetRemoteAccessSessionResult {
        var remoteAccessSession: RemoteAccessSession?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRunRequest {
        var arn: AmazonResourceName
    }
    interface GetRunResult {
        var run: Run?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSuiteRequest {
        var arn: AmazonResourceName
    }
    interface GetSuiteResult {
        var suite: Suite?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTestGridProjectRequest {
        var projectArn: DeviceFarmArn
    }
    interface GetTestGridProjectResult {
        var testGridProject: TestGridProject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTestGridSessionRequest {
        var projectArn: DeviceFarmArn?
            get() = definedExternally
            set(value) = definedExternally
        var sessionId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var sessionArn: DeviceFarmArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTestGridSessionResult {
        var testGridSession: TestGridSession?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTestRequest {
        var arn: AmazonResourceName
    }
    interface GetTestResult {
        var test: Test?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetUploadRequest {
        var arn: AmazonResourceName
    }
    interface GetUploadResult {
        var upload: Upload?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetVPCEConfigurationRequest {
        var arn: AmazonResourceName
    }
    interface GetVPCEConfigurationResult {
        var vpceConfiguration: VPCEConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IncompatibilityMessage {
        var message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "ARN" | "PLATFORM" | "FORM_FACTOR" | "MANUFACTURER" | "REMOTE_ACCESS_ENABLED" | "REMOTE_DEBUG_ENABLED" | "APPIUM_VERSION" | "INSTANCE_ARN" | "INSTANCE_LABELS" | "FLEET_TYPE" | "OS_VERSION" | "MODEL" | "AVAILABILITY" | String */
    }
    interface InstallToRemoteAccessSessionRequest {
        var remoteAccessSessionArn: AmazonResourceName
        var appArn: AmazonResourceName
    }
    interface InstallToRemoteAccessSessionResult {
        var appUpload: Upload?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceProfile {
        var arn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var packageCleanup: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var excludeAppPackagesFromCleanup: PackageIds?
            get() = definedExternally
            set(value) = definedExternally
        var rebootAfterUse: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var description: Message?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Job {
        var arn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "BUILTIN_FUZZ" | "BUILTIN_EXPLORER" | "WEB_PERFORMANCE_PROFILE" | "APPIUM_JAVA_JUNIT" | "APPIUM_JAVA_TESTNG" | "APPIUM_PYTHON" | "APPIUM_NODE" | "APPIUM_RUBY" | "APPIUM_WEB_JAVA_JUNIT" | "APPIUM_WEB_JAVA_TESTNG" | "APPIUM_WEB_PYTHON" | "APPIUM_WEB_NODE" | "APPIUM_WEB_RUBY" | "CALABASH" | "INSTRUMENTATION" | "UIAUTOMATION" | "UIAUTOMATOR" | "XCTEST" | "XCTEST_UI" | "REMOTE_ACCESS_RECORD" | "REMOTE_ACCESS_REPLAY" | String */
        var created: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "PENDING" | "PENDING_CONCURRENCY" | "PENDING_DEVICE" | "PROCESSING" | "SCHEDULING" | "PREPARING" | "RUNNING" | "COMPLETED" | "STOPPING" | String */
        var result: String /* "PENDING" | "PASSED" | "WARNED" | "FAILED" | "SKIPPED" | "ERRORED" | "STOPPED" | String */
        var started: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var stopped: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var counters: Counters?
            get() = definedExternally
            set(value) = definedExternally
        var message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var device: Device?
            get() = definedExternally
            set(value) = definedExternally
        var instanceArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var deviceMinutes: DeviceMinutes?
            get() = definedExternally
            set(value) = definedExternally
        var videoEndpoint: String?
            get() = definedExternally
            set(value) = definedExternally
        var videoCapture: VideoCapture?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListArtifactsRequest {
        var arn: AmazonResourceName
        var type: String /* "SCREENSHOT" | "FILE" | "LOG" | String */
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListArtifactsResult {
        var artifacts: Artifacts?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeviceInstancesRequest {
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeviceInstancesResult {
        var deviceInstances: DeviceInstances?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDevicePoolsRequest {
        var arn: AmazonResourceName
        var type: String /* "CURATED" | "PRIVATE" | String */
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDevicePoolsResult {
        var devicePools: DevicePools?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDevicesRequest {
        var arn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var filters: DeviceFilters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDevicesResult {
        var devices: Devices?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInstanceProfilesRequest {
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInstanceProfilesResult {
        var instanceProfiles: InstanceProfiles?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobsRequest {
        var arn: AmazonResourceName
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobsResult {
        var jobs: Jobs?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListNetworkProfilesRequest {
        var arn: AmazonResourceName
        var type: String /* "CURATED" | "PRIVATE" | String */
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListNetworkProfilesResult {
        var networkProfiles: NetworkProfiles?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOfferingPromotionsRequest {
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOfferingPromotionsResult {
        var offeringPromotions: OfferingPromotions?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOfferingTransactionsRequest {
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOfferingTransactionsResult {
        var offeringTransactions: OfferingTransactions?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOfferingsRequest {
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOfferingsResult {
        var offerings: Offerings?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProjectsRequest {
        var arn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProjectsResult {
        var projects: Projects?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRemoteAccessSessionsRequest {
        var arn: AmazonResourceName
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRemoteAccessSessionsResult {
        var remoteAccessSessions: RemoteAccessSessions?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRunsRequest {
        var arn: AmazonResourceName
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRunsResult {
        var runs: Runs?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSamplesRequest {
        var arn: AmazonResourceName
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSamplesResult {
        var samples: Samples?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSuitesRequest {
        var arn: AmazonResourceName
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSuitesResult {
        var suites: Suites?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceARN: DeviceFarmArn
    }
    interface ListTagsForResourceResponse {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTestGridProjectsRequest {
        var maxResult: MaxPageSize?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTestGridProjectsResult {
        var testGridProjects: TestGridProjects?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTestGridSessionActionsRequest {
        var sessionArn: DeviceFarmArn
        var maxResult: MaxPageSize?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTestGridSessionActionsResult {
        var actions: TestGridSessionActions?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTestGridSessionArtifactsRequest {
        var sessionArn: DeviceFarmArn
        var type: String /* "VIDEO" | "LOG" | String */
        var maxResult: MaxPageSize?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTestGridSessionArtifactsResult {
        var artifacts: TestGridSessionArtifacts?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTestGridSessionsRequest {
        var projectArn: DeviceFarmArn
        var status: String /* "ACTIVE" | "CLOSED" | "ERRORED" | String */
        var creationTimeAfter: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var creationTimeBefore: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var endTimeAfter: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var endTimeBefore: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var maxResult: MaxPageSize?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTestGridSessionsResult {
        var testGridSessions: TestGridSessions?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTestsRequest {
        var arn: AmazonResourceName
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTestsResult {
        var tests: Tests?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUniqueProblemsRequest {
        var arn: AmazonResourceName
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUniqueProblemsResult {
        var uniqueProblems: UniqueProblemsByExecutionResultMap?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUploadsRequest {
        var arn: AmazonResourceName
        var type: String /* "ANDROID_APP" | "IOS_APP" | "WEB_APP" | "EXTERNAL_DATA" | "APPIUM_JAVA_JUNIT_TEST_PACKAGE" | "APPIUM_JAVA_TESTNG_TEST_PACKAGE" | "APPIUM_PYTHON_TEST_PACKAGE" | "APPIUM_NODE_TEST_PACKAGE" | "APPIUM_RUBY_TEST_PACKAGE" | "APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE" | "APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE" | "APPIUM_WEB_PYTHON_TEST_PACKAGE" | "APPIUM_WEB_NODE_TEST_PACKAGE" | "APPIUM_WEB_RUBY_TEST_PACKAGE" | "CALABASH_TEST_PACKAGE" | "INSTRUMENTATION_TEST_PACKAGE" | "UIAUTOMATION_TEST_PACKAGE" | "UIAUTOMATOR_TEST_PACKAGE" | "XCTEST_TEST_PACKAGE" | "XCTEST_UI_TEST_PACKAGE" | "APPIUM_JAVA_JUNIT_TEST_SPEC" | "APPIUM_JAVA_TESTNG_TEST_SPEC" | "APPIUM_PYTHON_TEST_SPEC" | "APPIUM_NODE_TEST_SPEC" | "APPIUM_RUBY_TEST_SPEC" | "APPIUM_WEB_JAVA_JUNIT_TEST_SPEC" | "APPIUM_WEB_JAVA_TESTNG_TEST_SPEC" | "APPIUM_WEB_PYTHON_TEST_SPEC" | "APPIUM_WEB_NODE_TEST_SPEC" | "APPIUM_WEB_RUBY_TEST_SPEC" | "INSTRUMENTATION_TEST_SPEC" | "XCTEST_UI_TEST_SPEC" | String */
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUploadsResult {
        var uploads: Uploads?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVPCEConfigurationsRequest {
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVPCEConfigurationsResult {
        var vpceConfigurations: VPCEConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Location {
        var latitude: Double
        var longitude: Double
    }
    interface MaxSlotMap {
        @nativeGetter
        operator fun get(key: String): Integer?
        @nativeSetter
        operator fun set(key: String, value: Integer)
    }
    interface MonetaryAmount {
        var amount: Double?
            get() = definedExternally
            set(value) = definedExternally
        var currencyCode: String /* "USD" | String */
    }
    interface NetworkProfile {
        var arn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var description: Message?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "CURATED" | "PRIVATE" | String */
        var uplinkBandwidthBits: Long?
            get() = definedExternally
            set(value) = definedExternally
        var downlinkBandwidthBits: Long?
            get() = definedExternally
            set(value) = definedExternally
        var uplinkDelayMs: Long?
            get() = definedExternally
            set(value) = definedExternally
        var downlinkDelayMs: Long?
            get() = definedExternally
            set(value) = definedExternally
        var uplinkJitterMs: Long?
            get() = definedExternally
            set(value) = definedExternally
        var downlinkJitterMs: Long?
            get() = definedExternally
            set(value) = definedExternally
        var uplinkLossPercent: PercentInteger?
            get() = definedExternally
            set(value) = definedExternally
        var downlinkLossPercent: PercentInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Offering {
        var id: OfferingIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var description: Message?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "RECURRING" | String */
        var platform: String /* "ANDROID" | "IOS" | String */
        var recurringCharges: RecurringCharges?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OfferingPromotion {
        var id: OfferingPromotionIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var description: Message?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OfferingStatus {
        var type: String /* "PURCHASE" | "RENEW" | "SYSTEM" | String */
        var offering: Offering?
            get() = definedExternally
            set(value) = definedExternally
        var quantity: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var effectiveOn: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OfferingStatusMap {
        @nativeGetter
        operator fun get(key: String): OfferingStatus?
        @nativeSetter
        operator fun set(key: String, value: OfferingStatus)
    }
    interface OfferingTransaction {
        var offeringStatus: OfferingStatus?
            get() = definedExternally
            set(value) = definedExternally
        var transactionId: TransactionIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var offeringPromotionId: OfferingPromotionIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var createdOn: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var cost: MonetaryAmount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Problem {
        var run: ProblemDetail?
            get() = definedExternally
            set(value) = definedExternally
        var job: ProblemDetail?
            get() = definedExternally
            set(value) = definedExternally
        var suite: ProblemDetail?
            get() = definedExternally
            set(value) = definedExternally
        var test: ProblemDetail?
            get() = definedExternally
            set(value) = definedExternally
        var device: Device?
            get() = definedExternally
            set(value) = definedExternally
        var result: String /* "PENDING" | "PASSED" | "WARNED" | "FAILED" | "SKIPPED" | "ERRORED" | "STOPPED" | String */
        var message: Message?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProblemDetail {
        var arn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Project {
        var arn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var defaultJobTimeoutMinutes: JobTimeoutMinutes?
            get() = definedExternally
            set(value) = definedExternally
        var created: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PurchaseOfferingRequest {
        var offeringId: OfferingIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var quantity: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var offeringPromotionId: OfferingPromotionIdentifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PurchaseOfferingResult {
        var offeringTransaction: OfferingTransaction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PurchasedDevicesMap {
        @nativeGetter
        operator fun get(key: String): Integer?
        @nativeSetter
        operator fun set(key: String, value: Integer)
    }
    interface Radios {
        var wifi: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var bluetooth: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var nfc: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var gps: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecurringCharge {
        var cost: MonetaryAmount?
            get() = definedExternally
            set(value) = definedExternally
        var frequency: String /* "MONTHLY" | String */
    }
    interface RemoteAccessSession {
        var arn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var created: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "PENDING" | "PENDING_CONCURRENCY" | "PENDING_DEVICE" | "PROCESSING" | "SCHEDULING" | "PREPARING" | "RUNNING" | "COMPLETED" | "STOPPING" | String */
        var result: String /* "PENDING" | "PASSED" | "WARNED" | "FAILED" | "SKIPPED" | "ERRORED" | "STOPPED" | String */
        var message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var started: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var stopped: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var device: Device?
            get() = definedExternally
            set(value) = definedExternally
        var instanceArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var remoteDebugEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var remoteRecordEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var remoteRecordAppArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var hostAddress: HostAddress?
            get() = definedExternally
            set(value) = definedExternally
        var clientId: ClientId?
            get() = definedExternally
            set(value) = definedExternally
        var billingMethod: String /* "METERED" | "UNMETERED" | String */
        var deviceMinutes: DeviceMinutes?
            get() = definedExternally
            set(value) = definedExternally
        var endpoint: String?
            get() = definedExternally
            set(value) = definedExternally
        var deviceUdid: String?
            get() = definedExternally
            set(value) = definedExternally
        var interactionMode: String /* "INTERACTIVE" | "NO_VIDEO" | "VIDEO_ONLY" | String */
        var skipAppResign: SkipAppResign?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RenewOfferingRequest {
        var offeringId: OfferingIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var quantity: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RenewOfferingResult {
        var offeringTransaction: OfferingTransaction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Resolution {
        var width: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var height: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Rule {
        var attribute: String /* "ARN" | "PLATFORM" | "FORM_FACTOR" | "MANUFACTURER" | "REMOTE_ACCESS_ENABLED" | "REMOTE_DEBUG_ENABLED" | "APPIUM_VERSION" | "INSTANCE_ARN" | "INSTANCE_LABELS" | "FLEET_TYPE" | "OS_VERSION" | "MODEL" | "AVAILABILITY" | String */
        var operator: String /* "EQUALS" | "LESS_THAN" | "LESS_THAN_OR_EQUALS" | "GREATER_THAN" | "GREATER_THAN_OR_EQUALS" | "IN" | "NOT_IN" | "CONTAINS" | String */
        var value: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Run {
        var arn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "BUILTIN_FUZZ" | "BUILTIN_EXPLORER" | "WEB_PERFORMANCE_PROFILE" | "APPIUM_JAVA_JUNIT" | "APPIUM_JAVA_TESTNG" | "APPIUM_PYTHON" | "APPIUM_NODE" | "APPIUM_RUBY" | "APPIUM_WEB_JAVA_JUNIT" | "APPIUM_WEB_JAVA_TESTNG" | "APPIUM_WEB_PYTHON" | "APPIUM_WEB_NODE" | "APPIUM_WEB_RUBY" | "CALABASH" | "INSTRUMENTATION" | "UIAUTOMATION" | "UIAUTOMATOR" | "XCTEST" | "XCTEST_UI" | "REMOTE_ACCESS_RECORD" | "REMOTE_ACCESS_REPLAY" | String */
        var platform: String /* "ANDROID" | "IOS" | String */
        var created: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "PENDING" | "PENDING_CONCURRENCY" | "PENDING_DEVICE" | "PROCESSING" | "SCHEDULING" | "PREPARING" | "RUNNING" | "COMPLETED" | "STOPPING" | String */
        var result: String /* "PENDING" | "PASSED" | "WARNED" | "FAILED" | "SKIPPED" | "ERRORED" | "STOPPED" | String */
        var started: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var stopped: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var counters: Counters?
            get() = definedExternally
            set(value) = definedExternally
        var message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var totalJobs: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var completedJobs: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var billingMethod: String /* "METERED" | "UNMETERED" | String */
        var deviceMinutes: DeviceMinutes?
            get() = definedExternally
            set(value) = definedExternally
        var networkProfile: NetworkProfile?
            get() = definedExternally
            set(value) = definedExternally
        var parsingResultUrl: String?
            get() = definedExternally
            set(value) = definedExternally
        var resultCode: String /* "PARSING_FAILED" | "VPC_ENDPOINT_SETUP_FAILED" | String */
        var seed: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var appUpload: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var eventCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var jobTimeoutMinutes: JobTimeoutMinutes?
            get() = definedExternally
            set(value) = definedExternally
        var devicePoolArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var locale: String?
            get() = definedExternally
            set(value) = definedExternally
        var radios: Radios?
            get() = definedExternally
            set(value) = definedExternally
        var location: Location?
            get() = definedExternally
            set(value) = definedExternally
        var customerArtifactPaths: CustomerArtifactPaths?
            get() = definedExternally
            set(value) = definedExternally
        var webUrl: String?
            get() = definedExternally
            set(value) = definedExternally
        var skipAppResign: SkipAppResign?
            get() = definedExternally
            set(value) = definedExternally
        var testSpecArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var deviceSelectionResult: DeviceSelectionResult?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Sample {
        var arn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "CPU" | "MEMORY" | "THREADS" | "RX_RATE" | "TX_RATE" | "RX" | "TX" | "NATIVE_FRAMES" | "NATIVE_FPS" | "NATIVE_MIN_DRAWTIME" | "NATIVE_AVG_DRAWTIME" | "NATIVE_MAX_DRAWTIME" | "OPENGL_FRAMES" | "OPENGL_FPS" | "OPENGL_MIN_DRAWTIME" | "OPENGL_AVG_DRAWTIME" | "OPENGL_MAX_DRAWTIME" | String */
        var url: URL?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScheduleRunConfiguration {
        var extraDataPackageArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var networkProfileArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var locale: String?
            get() = definedExternally
            set(value) = definedExternally
        var location: Location?
            get() = definedExternally
            set(value) = definedExternally
        var vpceConfigurationArns: AmazonResourceNames?
            get() = definedExternally
            set(value) = definedExternally
        var customerArtifactPaths: CustomerArtifactPaths?
            get() = definedExternally
            set(value) = definedExternally
        var radios: Radios?
            get() = definedExternally
            set(value) = definedExternally
        var auxiliaryApps: AmazonResourceNames?
            get() = definedExternally
            set(value) = definedExternally
        var billingMethod: String /* "METERED" | "UNMETERED" | String */
    }
    interface ScheduleRunRequest {
        var projectArn: AmazonResourceName
        var appArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var devicePoolArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var deviceSelectionConfiguration: DeviceSelectionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var test: ScheduleRunTest
        var configuration: ScheduleRunConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var executionConfiguration: ExecutionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScheduleRunResult {
        var run: Run?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScheduleRunTest {
        var type: String /* "BUILTIN_FUZZ" | "BUILTIN_EXPLORER" | "WEB_PERFORMANCE_PROFILE" | "APPIUM_JAVA_JUNIT" | "APPIUM_JAVA_TESTNG" | "APPIUM_PYTHON" | "APPIUM_NODE" | "APPIUM_RUBY" | "APPIUM_WEB_JAVA_JUNIT" | "APPIUM_WEB_JAVA_TESTNG" | "APPIUM_WEB_PYTHON" | "APPIUM_WEB_NODE" | "APPIUM_WEB_RUBY" | "CALABASH" | "INSTRUMENTATION" | "UIAUTOMATION" | "UIAUTOMATOR" | "XCTEST" | "XCTEST_UI" | "REMOTE_ACCESS_RECORD" | "REMOTE_ACCESS_REPLAY" | String */
        var testPackageArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var testSpecArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var filter: Filter?
            get() = definedExternally
            set(value) = definedExternally
        var parameters: TestParameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopJobRequest {
        var arn: AmazonResourceName
    }
    interface StopJobResult {
        var job: Job?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopRemoteAccessSessionRequest {
        var arn: AmazonResourceName
    }
    interface StopRemoteAccessSessionResult {
        var remoteAccessSession: RemoteAccessSession?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopRunRequest {
        var arn: AmazonResourceName
    }
    interface StopRunResult {
        var run: Run?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Suite {
        var arn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "BUILTIN_FUZZ" | "BUILTIN_EXPLORER" | "WEB_PERFORMANCE_PROFILE" | "APPIUM_JAVA_JUNIT" | "APPIUM_JAVA_TESTNG" | "APPIUM_PYTHON" | "APPIUM_NODE" | "APPIUM_RUBY" | "APPIUM_WEB_JAVA_JUNIT" | "APPIUM_WEB_JAVA_TESTNG" | "APPIUM_WEB_PYTHON" | "APPIUM_WEB_NODE" | "APPIUM_WEB_RUBY" | "CALABASH" | "INSTRUMENTATION" | "UIAUTOMATION" | "UIAUTOMATOR" | "XCTEST" | "XCTEST_UI" | "REMOTE_ACCESS_RECORD" | "REMOTE_ACCESS_REPLAY" | String */
        var created: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "PENDING" | "PENDING_CONCURRENCY" | "PENDING_DEVICE" | "PROCESSING" | "SCHEDULING" | "PREPARING" | "RUNNING" | "COMPLETED" | "STOPPING" | String */
        var result: String /* "PENDING" | "PASSED" | "WARNED" | "FAILED" | "SKIPPED" | "ERRORED" | "STOPPED" | String */
        var started: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var stopped: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var counters: Counters?
            get() = definedExternally
            set(value) = definedExternally
        var message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var deviceMinutes: DeviceMinutes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface TagResourceRequest {
        var ResourceARN: DeviceFarmArn
        var Tags: TagList
    }
    interface TagResourceResponse
    interface Test {
        var arn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "BUILTIN_FUZZ" | "BUILTIN_EXPLORER" | "WEB_PERFORMANCE_PROFILE" | "APPIUM_JAVA_JUNIT" | "APPIUM_JAVA_TESTNG" | "APPIUM_PYTHON" | "APPIUM_NODE" | "APPIUM_RUBY" | "APPIUM_WEB_JAVA_JUNIT" | "APPIUM_WEB_JAVA_TESTNG" | "APPIUM_WEB_PYTHON" | "APPIUM_WEB_NODE" | "APPIUM_WEB_RUBY" | "CALABASH" | "INSTRUMENTATION" | "UIAUTOMATION" | "UIAUTOMATOR" | "XCTEST" | "XCTEST_UI" | "REMOTE_ACCESS_RECORD" | "REMOTE_ACCESS_REPLAY" | String */
        var created: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "PENDING" | "PENDING_CONCURRENCY" | "PENDING_DEVICE" | "PROCESSING" | "SCHEDULING" | "PREPARING" | "RUNNING" | "COMPLETED" | "STOPPING" | String */
        var result: String /* "PENDING" | "PASSED" | "WARNED" | "FAILED" | "SKIPPED" | "ERRORED" | "STOPPED" | String */
        var started: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var stopped: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var counters: Counters?
            get() = definedExternally
            set(value) = definedExternally
        var message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var deviceMinutes: DeviceMinutes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestGridProject {
        var arn: DeviceFarmArn?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var created: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestGridSession {
        var arn: DeviceFarmArn?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "ACTIVE" | "CLOSED" | "ERRORED" | String */
        var created: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var ended: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var billingMinutes: Double?
            get() = definedExternally
            set(value) = definedExternally
        var seleniumProperties: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestGridSessionAction {
        var action: String?
            get() = definedExternally
            set(value) = definedExternally
        var started: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var duration: Long?
            get() = definedExternally
            set(value) = definedExternally
        var statusCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var requestMethod: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestGridSessionArtifact {
        var filename: String?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "UNKNOWN" | "VIDEO" | "SELENIUM_LOG" | String */
        var url: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestParameters {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface TrialMinutes {
        var total: Double?
            get() = definedExternally
            set(value) = definedExternally
        var remaining: Double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UniqueProblem {
        var message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var problems: Problems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UniqueProblemsByExecutionResultMap {
        @nativeGetter
        operator fun get(key: String): UniqueProblems?
        @nativeSetter
        operator fun set(key: String, value: UniqueProblems)
    }
    interface UntagResourceRequest {
        var ResourceARN: DeviceFarmArn
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateDeviceInstanceRequest {
        var arn: AmazonResourceName
        var profileArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var labels: InstanceLabels?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDeviceInstanceResult {
        var deviceInstance: DeviceInstance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDevicePoolRequest {
        var arn: AmazonResourceName
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var description: Message?
            get() = definedExternally
            set(value) = definedExternally
        var rules: Rules?
            get() = definedExternally
            set(value) = definedExternally
        var maxDevices: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var clearMaxDevices: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDevicePoolResult {
        var devicePool: DevicePool?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateInstanceProfileRequest {
        var arn: AmazonResourceName
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var description: Message?
            get() = definedExternally
            set(value) = definedExternally
        var packageCleanup: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var excludeAppPackagesFromCleanup: PackageIds?
            get() = definedExternally
            set(value) = definedExternally
        var rebootAfterUse: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateInstanceProfileResult {
        var instanceProfile: InstanceProfile?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateNetworkProfileRequest {
        var arn: AmazonResourceName
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var description: Message?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "CURATED" | "PRIVATE" | String */
        var uplinkBandwidthBits: Long?
            get() = definedExternally
            set(value) = definedExternally
        var downlinkBandwidthBits: Long?
            get() = definedExternally
            set(value) = definedExternally
        var uplinkDelayMs: Long?
            get() = definedExternally
            set(value) = definedExternally
        var downlinkDelayMs: Long?
            get() = definedExternally
            set(value) = definedExternally
        var uplinkJitterMs: Long?
            get() = definedExternally
            set(value) = definedExternally
        var downlinkJitterMs: Long?
            get() = definedExternally
            set(value) = definedExternally
        var uplinkLossPercent: PercentInteger?
            get() = definedExternally
            set(value) = definedExternally
        var downlinkLossPercent: PercentInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateNetworkProfileResult {
        var networkProfile: NetworkProfile?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateProjectRequest {
        var arn: AmazonResourceName
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var defaultJobTimeoutMinutes: JobTimeoutMinutes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateProjectResult {
        var project: Project?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTestGridProjectRequest {
        var projectArn: DeviceFarmArn
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var description: ResourceDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTestGridProjectResult {
        var testGridProject: TestGridProject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateUploadRequest {
        var arn: AmazonResourceName
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var contentType: ContentType?
            get() = definedExternally
            set(value) = definedExternally
        var editContent: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateUploadResult {
        var upload: Upload?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateVPCEConfigurationRequest {
        var arn: AmazonResourceName
        var vpceConfigurationName: VPCEConfigurationName?
            get() = definedExternally
            set(value) = definedExternally
        var vpceServiceName: VPCEServiceName?
            get() = definedExternally
            set(value) = definedExternally
        var serviceDnsName: ServiceDnsName?
            get() = definedExternally
            set(value) = definedExternally
        var vpceConfigurationDescription: VPCEConfigurationDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateVPCEConfigurationResult {
        var vpceConfiguration: VPCEConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Upload {
        var arn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var created: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "ANDROID_APP" | "IOS_APP" | "WEB_APP" | "EXTERNAL_DATA" | "APPIUM_JAVA_JUNIT_TEST_PACKAGE" | "APPIUM_JAVA_TESTNG_TEST_PACKAGE" | "APPIUM_PYTHON_TEST_PACKAGE" | "APPIUM_NODE_TEST_PACKAGE" | "APPIUM_RUBY_TEST_PACKAGE" | "APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE" | "APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE" | "APPIUM_WEB_PYTHON_TEST_PACKAGE" | "APPIUM_WEB_NODE_TEST_PACKAGE" | "APPIUM_WEB_RUBY_TEST_PACKAGE" | "CALABASH_TEST_PACKAGE" | "INSTRUMENTATION_TEST_PACKAGE" | "UIAUTOMATION_TEST_PACKAGE" | "UIAUTOMATOR_TEST_PACKAGE" | "XCTEST_TEST_PACKAGE" | "XCTEST_UI_TEST_PACKAGE" | "APPIUM_JAVA_JUNIT_TEST_SPEC" | "APPIUM_JAVA_TESTNG_TEST_SPEC" | "APPIUM_PYTHON_TEST_SPEC" | "APPIUM_NODE_TEST_SPEC" | "APPIUM_RUBY_TEST_SPEC" | "APPIUM_WEB_JAVA_JUNIT_TEST_SPEC" | "APPIUM_WEB_JAVA_TESTNG_TEST_SPEC" | "APPIUM_WEB_PYTHON_TEST_SPEC" | "APPIUM_WEB_NODE_TEST_SPEC" | "APPIUM_WEB_RUBY_TEST_SPEC" | "INSTRUMENTATION_TEST_SPEC" | "XCTEST_UI_TEST_SPEC" | String */
        var status: String /* "INITIALIZED" | "PROCESSING" | "SUCCEEDED" | "FAILED" | String */
        var url: URL?
            get() = definedExternally
            set(value) = definedExternally
        var metadata: Metadata?
            get() = definedExternally
            set(value) = definedExternally
        var contentType: ContentType?
            get() = definedExternally
            set(value) = definedExternally
        var message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var category: String /* "CURATED" | "PRIVATE" | String */
    }
    interface VPCEConfiguration {
        var arn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var vpceConfigurationName: VPCEConfigurationName?
            get() = definedExternally
            set(value) = definedExternally
        var vpceServiceName: VPCEServiceName?
            get() = definedExternally
            set(value) = definedExternally
        var serviceDnsName: ServiceDnsName?
            get() = definedExternally
            set(value) = definedExternally
        var vpceConfigurationDescription: VPCEConfigurationDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2015-06-23" | "latest" | String */
    }
}