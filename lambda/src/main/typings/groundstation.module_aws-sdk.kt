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
import GroundStation.ConfigListItem
import GroundStation.ContactData
import GroundStation.DataflowEndpointListItem
import GroundStation.EndpointDetails
import GroundStation.GroundStationData
import GroundStation.MissionProfileListItem
import GroundStation.SatelliteListItem
import GroundStation.CancelContactRequest
import GroundStation.ContactIdResponse
import GroundStation.CreateConfigRequest
import GroundStation.ConfigIdResponse
import GroundStation.CreateDataflowEndpointGroupRequest
import GroundStation.DataflowEndpointGroupIdResponse
import GroundStation.CreateMissionProfileRequest
import GroundStation.MissionProfileIdResponse
import GroundStation.DeleteConfigRequest
import GroundStation.DeleteDataflowEndpointGroupRequest
import GroundStation.DeleteMissionProfileRequest
import GroundStation.DescribeContactRequest
import GroundStation.DescribeContactResponse
import GroundStation.GetConfigRequest
import GroundStation.GetConfigResponse
import GroundStation.GetDataflowEndpointGroupRequest
import GroundStation.GetDataflowEndpointGroupResponse
import GroundStation.GetMinuteUsageRequest
import GroundStation.GetMinuteUsageResponse
import GroundStation.GetMissionProfileRequest
import GroundStation.GetMissionProfileResponse
import GroundStation.GetSatelliteRequest
import GroundStation.GetSatelliteResponse
import GroundStation.ListConfigsRequest
import GroundStation.ListConfigsResponse
import GroundStation.ListContactsRequest
import GroundStation.ListContactsResponse
import GroundStation.ListDataflowEndpointGroupsRequest
import GroundStation.ListDataflowEndpointGroupsResponse
import GroundStation.ListGroundStationsRequest
import GroundStation.ListGroundStationsResponse
import GroundStation.ListMissionProfilesRequest
import GroundStation.ListMissionProfilesResponse
import GroundStation.ListSatellitesRequest
import GroundStation.ListSatellitesResponse
import GroundStation.ListTagsForResourceRequest
import GroundStation.ListTagsForResourceResponse
import GroundStation.ReserveContactRequest
import GroundStation.TagResourceRequest
import GroundStation.TagResourceResponse
import GroundStation.UntagResourceRequest
import GroundStation.UntagResourceResponse
import GroundStation.UpdateConfigRequest
import GroundStation.UpdateMissionProfileRequest
import GroundStation.SpectrumConfig
import GroundStation.DecodeConfig
import GroundStation.DemodulationConfig
import GroundStation.UplinkSpectrumConfig
import GroundStation.Eirp
import GroundStation.AntennaDownlinkConfig
import GroundStation.AntennaDownlinkDemodDecodeConfig
import GroundStation.AntennaUplinkConfig
import GroundStation.DataflowEndpointConfig
import GroundStation.TrackingConfig
import GroundStation.UplinkEchoConfig
import GroundStation.Elevation
import GroundStation.TagsMap
import GroundStation.ConfigTypeData
import GroundStation.SocketAddress
import GroundStation.DataflowEndpoint
import GroundStation.SecurityDetails
import GroundStation.FrequencyBandwidth
import GroundStation.Frequency

typealias Boolean = Boolean

typealias ConfigArn = String

typealias ConfigList = Array<ConfigListItem>

typealias ContactList = Array<ContactData>

typealias DataflowEdge = Array<ConfigArn>

typealias DataflowEdgeList = Array<DataflowEdge>

typealias DataflowEndpointGroupArn = String

typealias DataflowEndpointGroupList = Array<DataflowEndpointListItem>

typealias Double = Number

typealias DurationInSeconds = Number

typealias EndpointDetailsList = Array<EndpointDetails>

typealias GroundStationIdList = Array<String>

typealias GroundStationList = Array<GroundStationData>

typealias Integer = Number

typealias JsonString = String

typealias MissionProfileArn = String

typealias MissionProfileList = Array<MissionProfileListItem>

typealias RoleArn = String

typealias SafeName = String

typealias SatelliteList = Array<SatelliteListItem>

typealias SecurityGroupIdList = Array<String>

typealias StatusList = Array<String /* "AVAILABLE" | "AWS_CANCELLED" | "CANCELLED" | "CANCELLING" | "COMPLETED" | "FAILED" | "FAILED_TO_SCHEDULE" | "PASS" | "POSTPASS" | "PREPASS" | "SCHEDULED" | "SCHEDULING" | String */>

typealias String = String

typealias SubnetList = Array<String>

typealias TagKeys = Array<String>

typealias Timestamp = Date

typealias Uuid = String

typealias noradSatelliteID = Number

typealias satelliteArn = String

@JsModule("aws-sdk")
external open class GroundStation(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & GroundStation.Types.ClientConfiguration */
    open fun cancelContact(params: CancelContactRequest, callback: (err: AWSError, data: ContactIdResponse) -> Unit = definedExternally): Request<ContactIdResponse, AWSError>
    open fun cancelContact(callback: (err: AWSError, data: ContactIdResponse) -> Unit = definedExternally): Request<ContactIdResponse, AWSError>
    open fun createConfig(params: CreateConfigRequest, callback: (err: AWSError, data: ConfigIdResponse) -> Unit = definedExternally): Request<ConfigIdResponse, AWSError>
    open fun createConfig(callback: (err: AWSError, data: ConfigIdResponse) -> Unit = definedExternally): Request<ConfigIdResponse, AWSError>
    open fun createDataflowEndpointGroup(params: CreateDataflowEndpointGroupRequest, callback: (err: AWSError, data: DataflowEndpointGroupIdResponse) -> Unit = definedExternally): Request<DataflowEndpointGroupIdResponse, AWSError>
    open fun createDataflowEndpointGroup(callback: (err: AWSError, data: DataflowEndpointGroupIdResponse) -> Unit = definedExternally): Request<DataflowEndpointGroupIdResponse, AWSError>
    open fun createMissionProfile(params: CreateMissionProfileRequest, callback: (err: AWSError, data: MissionProfileIdResponse) -> Unit = definedExternally): Request<MissionProfileIdResponse, AWSError>
    open fun createMissionProfile(callback: (err: AWSError, data: MissionProfileIdResponse) -> Unit = definedExternally): Request<MissionProfileIdResponse, AWSError>
    open fun deleteConfig(params: DeleteConfigRequest, callback: (err: AWSError, data: ConfigIdResponse) -> Unit = definedExternally): Request<ConfigIdResponse, AWSError>
    open fun deleteConfig(callback: (err: AWSError, data: ConfigIdResponse) -> Unit = definedExternally): Request<ConfigIdResponse, AWSError>
    open fun deleteDataflowEndpointGroup(params: DeleteDataflowEndpointGroupRequest, callback: (err: AWSError, data: DataflowEndpointGroupIdResponse) -> Unit = definedExternally): Request<DataflowEndpointGroupIdResponse, AWSError>
    open fun deleteDataflowEndpointGroup(callback: (err: AWSError, data: DataflowEndpointGroupIdResponse) -> Unit = definedExternally): Request<DataflowEndpointGroupIdResponse, AWSError>
    open fun deleteMissionProfile(params: DeleteMissionProfileRequest, callback: (err: AWSError, data: MissionProfileIdResponse) -> Unit = definedExternally): Request<MissionProfileIdResponse, AWSError>
    open fun deleteMissionProfile(callback: (err: AWSError, data: MissionProfileIdResponse) -> Unit = definedExternally): Request<MissionProfileIdResponse, AWSError>
    open fun describeContact(params: DescribeContactRequest, callback: (err: AWSError, data: DescribeContactResponse) -> Unit = definedExternally): Request<DescribeContactResponse, AWSError>
    open fun describeContact(callback: (err: AWSError, data: DescribeContactResponse) -> Unit = definedExternally): Request<DescribeContactResponse, AWSError>
    open fun getConfig(params: GetConfigRequest, callback: (err: AWSError, data: GetConfigResponse) -> Unit = definedExternally): Request<GetConfigResponse, AWSError>
    open fun getConfig(callback: (err: AWSError, data: GetConfigResponse) -> Unit = definedExternally): Request<GetConfigResponse, AWSError>
    open fun getDataflowEndpointGroup(params: GetDataflowEndpointGroupRequest, callback: (err: AWSError, data: GetDataflowEndpointGroupResponse) -> Unit = definedExternally): Request<GetDataflowEndpointGroupResponse, AWSError>
    open fun getDataflowEndpointGroup(callback: (err: AWSError, data: GetDataflowEndpointGroupResponse) -> Unit = definedExternally): Request<GetDataflowEndpointGroupResponse, AWSError>
    open fun getMinuteUsage(params: GetMinuteUsageRequest, callback: (err: AWSError, data: GetMinuteUsageResponse) -> Unit = definedExternally): Request<GetMinuteUsageResponse, AWSError>
    open fun getMinuteUsage(callback: (err: AWSError, data: GetMinuteUsageResponse) -> Unit = definedExternally): Request<GetMinuteUsageResponse, AWSError>
    open fun getMissionProfile(params: GetMissionProfileRequest, callback: (err: AWSError, data: GetMissionProfileResponse) -> Unit = definedExternally): Request<GetMissionProfileResponse, AWSError>
    open fun getMissionProfile(callback: (err: AWSError, data: GetMissionProfileResponse) -> Unit = definedExternally): Request<GetMissionProfileResponse, AWSError>
    open fun getSatellite(params: GetSatelliteRequest, callback: (err: AWSError, data: GetSatelliteResponse) -> Unit = definedExternally): Request<GetSatelliteResponse, AWSError>
    open fun getSatellite(callback: (err: AWSError, data: GetSatelliteResponse) -> Unit = definedExternally): Request<GetSatelliteResponse, AWSError>
    open fun listConfigs(params: ListConfigsRequest, callback: (err: AWSError, data: ListConfigsResponse) -> Unit = definedExternally): Request<ListConfigsResponse, AWSError>
    open fun listConfigs(callback: (err: AWSError, data: ListConfigsResponse) -> Unit = definedExternally): Request<ListConfigsResponse, AWSError>
    open fun listContacts(params: ListContactsRequest, callback: (err: AWSError, data: ListContactsResponse) -> Unit = definedExternally): Request<ListContactsResponse, AWSError>
    open fun listContacts(callback: (err: AWSError, data: ListContactsResponse) -> Unit = definedExternally): Request<ListContactsResponse, AWSError>
    open fun listDataflowEndpointGroups(params: ListDataflowEndpointGroupsRequest, callback: (err: AWSError, data: ListDataflowEndpointGroupsResponse) -> Unit = definedExternally): Request<ListDataflowEndpointGroupsResponse, AWSError>
    open fun listDataflowEndpointGroups(callback: (err: AWSError, data: ListDataflowEndpointGroupsResponse) -> Unit = definedExternally): Request<ListDataflowEndpointGroupsResponse, AWSError>
    open fun listGroundStations(params: ListGroundStationsRequest, callback: (err: AWSError, data: ListGroundStationsResponse) -> Unit = definedExternally): Request<ListGroundStationsResponse, AWSError>
    open fun listGroundStations(callback: (err: AWSError, data: ListGroundStationsResponse) -> Unit = definedExternally): Request<ListGroundStationsResponse, AWSError>
    open fun listMissionProfiles(params: ListMissionProfilesRequest, callback: (err: AWSError, data: ListMissionProfilesResponse) -> Unit = definedExternally): Request<ListMissionProfilesResponse, AWSError>
    open fun listMissionProfiles(callback: (err: AWSError, data: ListMissionProfilesResponse) -> Unit = definedExternally): Request<ListMissionProfilesResponse, AWSError>
    open fun listSatellites(params: ListSatellitesRequest, callback: (err: AWSError, data: ListSatellitesResponse) -> Unit = definedExternally): Request<ListSatellitesResponse, AWSError>
    open fun listSatellites(callback: (err: AWSError, data: ListSatellitesResponse) -> Unit = definedExternally): Request<ListSatellitesResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun reserveContact(params: ReserveContactRequest, callback: (err: AWSError, data: ContactIdResponse) -> Unit = definedExternally): Request<ContactIdResponse, AWSError>
    open fun reserveContact(callback: (err: AWSError, data: ContactIdResponse) -> Unit = definedExternally): Request<ContactIdResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateConfig(params: UpdateConfigRequest, callback: (err: AWSError, data: ConfigIdResponse) -> Unit = definedExternally): Request<ConfigIdResponse, AWSError>
    open fun updateConfig(callback: (err: AWSError, data: ConfigIdResponse) -> Unit = definedExternally): Request<ConfigIdResponse, AWSError>
    open fun updateMissionProfile(params: UpdateMissionProfileRequest, callback: (err: AWSError, data: MissionProfileIdResponse) -> Unit = definedExternally): Request<MissionProfileIdResponse, AWSError>
    open fun updateMissionProfile(callback: (err: AWSError, data: MissionProfileIdResponse) -> Unit = definedExternally): Request<MissionProfileIdResponse, AWSError>
    interface AntennaDownlinkConfig {
        var spectrumConfig: SpectrumConfig
    }
    interface AntennaDownlinkDemodDecodeConfig {
        var decodeConfig: DecodeConfig
        var demodulationConfig: DemodulationConfig
        var spectrumConfig: SpectrumConfig
    }
    interface AntennaUplinkConfig {
        var spectrumConfig: UplinkSpectrumConfig
        var targetEirp: Eirp
    }
    interface CancelContactRequest {
        var contactId: String
    }
    interface ConfigIdResponse {
        var configArn: ConfigArn?
            get() = definedExternally
            set(value) = definedExternally
        var configId: String?
            get() = definedExternally
            set(value) = definedExternally
        var configType: String /* "antenna-downlink" | "antenna-downlink-demod-decode" | "antenna-uplink" | "dataflow-endpoint" | "tracking" | "uplink-echo" | String */
    }
    interface ConfigListItem {
        var configArn: ConfigArn?
            get() = definedExternally
            set(value) = definedExternally
        var configId: String?
            get() = definedExternally
            set(value) = definedExternally
        var configType: String /* "antenna-downlink" | "antenna-downlink-demod-decode" | "antenna-uplink" | "dataflow-endpoint" | "tracking" | "uplink-echo" | String */
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigTypeData {
        var antennaDownlinkConfig: AntennaDownlinkConfig?
            get() = definedExternally
            set(value) = definedExternally
        var antennaDownlinkDemodDecodeConfig: AntennaDownlinkDemodDecodeConfig?
            get() = definedExternally
            set(value) = definedExternally
        var antennaUplinkConfig: AntennaUplinkConfig?
            get() = definedExternally
            set(value) = definedExternally
        var dataflowEndpointConfig: DataflowEndpointConfig?
            get() = definedExternally
            set(value) = definedExternally
        var trackingConfig: TrackingConfig?
            get() = definedExternally
            set(value) = definedExternally
        var uplinkEchoConfig: UplinkEchoConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContactData {
        var contactId: String?
            get() = definedExternally
            set(value) = definedExternally
        var contactStatus: String /* "AVAILABLE" | "AWS_CANCELLED" | "CANCELLED" | "CANCELLING" | "COMPLETED" | "FAILED" | "FAILED_TO_SCHEDULE" | "PASS" | "POSTPASS" | "PREPASS" | "SCHEDULED" | "SCHEDULING" | String */
        var endTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var errorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var groundStation: String?
            get() = definedExternally
            set(value) = definedExternally
        var maximumElevation: Elevation?
            get() = definedExternally
            set(value) = definedExternally
        var missionProfileArn: MissionProfileArn?
            get() = definedExternally
            set(value) = definedExternally
        var postPassEndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var prePassStartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var region: String?
            get() = definedExternally
            set(value) = definedExternally
        var satelliteArn: satelliteArn?
            get() = definedExternally
            set(value) = definedExternally
        var startTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContactIdResponse {
        var contactId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateConfigRequest {
        var configData: ConfigTypeData
        var name: SafeName
        var tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDataflowEndpointGroupRequest {
        var endpointDetails: EndpointDetailsList
        var tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateMissionProfileRequest {
        var contactPostPassDurationSeconds: DurationInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var contactPrePassDurationSeconds: DurationInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var dataflowEdges: DataflowEdgeList
        var minimumViableContactDurationSeconds: DurationInSeconds
        var name: SafeName
        var tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
        var trackingConfigArn: ConfigArn
    }
    interface DataflowEndpoint {
        var address: SocketAddress?
            get() = definedExternally
            set(value) = definedExternally
        var name: SafeName?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "created" | "creating" | "deleted" | "deleting" | "failed" | String */
    }
    interface DataflowEndpointConfig {
        var dataflowEndpointName: String
        var dataflowEndpointRegion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataflowEndpointGroupIdResponse {
        var dataflowEndpointGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataflowEndpointListItem {
        var dataflowEndpointGroupArn: DataflowEndpointGroupArn?
            get() = definedExternally
            set(value) = definedExternally
        var dataflowEndpointGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DecodeConfig {
        var unvalidatedJSON: JsonString
    }
    interface DeleteConfigRequest {
        var configId: String
        var configType: String /* "antenna-downlink" | "antenna-downlink-demod-decode" | "antenna-uplink" | "dataflow-endpoint" | "tracking" | "uplink-echo" | String */
    }
    interface DeleteDataflowEndpointGroupRequest {
        var dataflowEndpointGroupId: String
    }
    interface DeleteMissionProfileRequest {
        var missionProfileId: String
    }
    interface DemodulationConfig {
        var unvalidatedJSON: JsonString
    }
    interface DescribeContactRequest {
        var contactId: String
    }
    interface DescribeContactResponse {
        var contactId: String?
            get() = definedExternally
            set(value) = definedExternally
        var contactStatus: String /* "AVAILABLE" | "AWS_CANCELLED" | "CANCELLED" | "CANCELLING" | "COMPLETED" | "FAILED" | "FAILED_TO_SCHEDULE" | "PASS" | "POSTPASS" | "PREPASS" | "SCHEDULED" | "SCHEDULING" | String */
        var endTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var errorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var groundStation: String?
            get() = definedExternally
            set(value) = definedExternally
        var maximumElevation: Elevation?
            get() = definedExternally
            set(value) = definedExternally
        var missionProfileArn: MissionProfileArn?
            get() = definedExternally
            set(value) = definedExternally
        var postPassEndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var prePassStartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var region: String?
            get() = definedExternally
            set(value) = definedExternally
        var satelliteArn: satelliteArn?
            get() = definedExternally
            set(value) = definedExternally
        var startTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Eirp {
        var units: String /* "dBW" | String */
        var value: Double
    }
    interface Elevation {
        var unit: String /* "DEGREE_ANGLE" | "RADIAN" | String */
        var value: Double
    }
    interface EndpointDetails {
        var endpoint: DataflowEndpoint?
            get() = definedExternally
            set(value) = definedExternally
        var securityDetails: SecurityDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Frequency {
        var units: String /* "GHz" | "MHz" | "kHz" | String */
        var value: Double
    }
    interface FrequencyBandwidth {
        var units: String /* "GHz" | "MHz" | "kHz" | String */
        var value: Double
    }
    interface GetConfigRequest {
        var configId: String
        var configType: String /* "antenna-downlink" | "antenna-downlink-demod-decode" | "antenna-uplink" | "dataflow-endpoint" | "tracking" | "uplink-echo" | String */
    }
    interface GetConfigResponse {
        var configArn: ConfigArn
        var configData: ConfigTypeData
        var configId: String
        var configType: String /* "antenna-downlink" | "antenna-downlink-demod-decode" | "antenna-uplink" | "dataflow-endpoint" | "tracking" | "uplink-echo" | String */
        var name: String
        var tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDataflowEndpointGroupRequest {
        var dataflowEndpointGroupId: String
    }
    interface GetDataflowEndpointGroupResponse {
        var dataflowEndpointGroupArn: DataflowEndpointGroupArn?
            get() = definedExternally
            set(value) = definedExternally
        var dataflowEndpointGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var endpointsDetails: EndpointDetailsList?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMinuteUsageRequest {
        var month: Integer
        var year: Integer
    }
    interface GetMinuteUsageResponse {
        var estimatedMinutesRemaining: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var isReservedMinutesCustomer: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var totalReservedMinuteAllocation: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var totalScheduledMinutes: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var upcomingMinutesScheduled: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMissionProfileRequest {
        var missionProfileId: String
    }
    interface GetMissionProfileResponse {
        var contactPostPassDurationSeconds: DurationInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var contactPrePassDurationSeconds: DurationInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var dataflowEdges: DataflowEdgeList?
            get() = definedExternally
            set(value) = definedExternally
        var minimumViableContactDurationSeconds: DurationInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var missionProfileArn: MissionProfileArn?
            get() = definedExternally
            set(value) = definedExternally
        var missionProfileId: String?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var region: String?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
        var trackingConfigArn: ConfigArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSatelliteRequest {
        var satelliteId: String
    }
    interface GetSatelliteResponse {
        var groundStations: GroundStationIdList?
            get() = definedExternally
            set(value) = definedExternally
        var noradSatelliteID: noradSatelliteID?
            get() = definedExternally
            set(value) = definedExternally
        var satelliteArn: satelliteArn?
            get() = definedExternally
            set(value) = definedExternally
        var satelliteId: Uuid?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GroundStationData {
        var groundStationId: String?
            get() = definedExternally
            set(value) = definedExternally
        var groundStationName: String?
            get() = definedExternally
            set(value) = definedExternally
        var region: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConfigsRequest {
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConfigsResponse {
        var configList: ConfigList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListContactsRequest {
        var endTime: Timestamp
        var groundStation: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var missionProfileArn: MissionProfileArn?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var satelliteArn: satelliteArn?
            get() = definedExternally
            set(value) = definedExternally
        var startTime: Timestamp
        var statusList: StatusList
    }
    interface ListContactsResponse {
        var contactList: ContactList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDataflowEndpointGroupsRequest {
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDataflowEndpointGroupsResponse {
        var dataflowEndpointGroupList: DataflowEndpointGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroundStationsRequest {
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var satelliteId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroundStationsResponse {
        var groundStationList: GroundStationList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMissionProfilesRequest {
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMissionProfilesResponse {
        var missionProfileList: MissionProfileList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSatellitesRequest {
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSatellitesResponse {
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var satellites: SatelliteList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var resourceArn: String
    }
    interface ListTagsForResourceResponse {
        var tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MissionProfileIdResponse {
        var missionProfileId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MissionProfileListItem {
        var missionProfileArn: MissionProfileArn?
            get() = definedExternally
            set(value) = definedExternally
        var missionProfileId: String?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var region: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReserveContactRequest {
        var endTime: Timestamp
        var groundStation: String
        var missionProfileArn: MissionProfileArn
        var satelliteArn: satelliteArn
        var startTime: Timestamp
        var tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SatelliteListItem {
        var groundStations: GroundStationIdList?
            get() = definedExternally
            set(value) = definedExternally
        var noradSatelliteID: noradSatelliteID?
            get() = definedExternally
            set(value) = definedExternally
        var satelliteArn: satelliteArn?
            get() = definedExternally
            set(value) = definedExternally
        var satelliteId: Uuid?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SecurityDetails {
        var roleArn: RoleArn
        var securityGroupIds: SecurityGroupIdList
        var subnetIds: SubnetList
    }
    interface SocketAddress {
        var name: String
        var port: Integer
    }
    interface SpectrumConfig {
        var bandwidth: FrequencyBandwidth
        var centerFrequency: Frequency
        var polarization: String /* "LEFT_HAND" | "NONE" | "RIGHT_HAND" | String */
    }
    interface TagResourceRequest {
        var resourceArn: String
        var tags: TagsMap
    }
    interface TagResourceResponse
    interface TagsMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface TrackingConfig {
        var autotrack: String /* "PREFERRED" | "REMOVED" | "REQUIRED" | String */
    }
    interface UntagResourceRequest {
        var resourceArn: String
        var tagKeys: TagKeys
    }
    interface UntagResourceResponse
    interface UpdateConfigRequest {
        var configData: ConfigTypeData
        var configId: String
        var configType: String /* "antenna-downlink" | "antenna-downlink-demod-decode" | "antenna-uplink" | "dataflow-endpoint" | "tracking" | "uplink-echo" | String */
        var name: SafeName
    }
    interface UpdateMissionProfileRequest {
        var contactPostPassDurationSeconds: DurationInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var contactPrePassDurationSeconds: DurationInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var dataflowEdges: DataflowEdgeList?
            get() = definedExternally
            set(value) = definedExternally
        var minimumViableContactDurationSeconds: DurationInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var missionProfileId: String
        var name: SafeName?
            get() = definedExternally
            set(value) = definedExternally
        var trackingConfigArn: ConfigArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UplinkEchoConfig {
        var antennaUplinkConfigArn: ConfigArn
        var enabled: Boolean
    }
    interface UplinkSpectrumConfig {
        var centerFrequency: Frequency
        var polarization: String /* "LEFT_HAND" | "NONE" | "RIGHT_HAND" | String */
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-05-23" | "latest" | String */
    }
}