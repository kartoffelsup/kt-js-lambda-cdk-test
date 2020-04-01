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
import CloudHSM.Tag
import CloudHSM.AddTagsToResourceRequest
import CloudHSM.AddTagsToResourceResponse
import CloudHSM.CreateHapgRequest
import CloudHSM.CreateHapgResponse
import CloudHSM.CreateHsmRequest
import CloudHSM.CreateHsmResponse
import CloudHSM.CreateLunaClientRequest
import CloudHSM.CreateLunaClientResponse
import CloudHSM.DeleteHapgRequest
import CloudHSM.DeleteHapgResponse
import CloudHSM.DeleteHsmRequest
import CloudHSM.DeleteHsmResponse
import CloudHSM.DeleteLunaClientRequest
import CloudHSM.DeleteLunaClientResponse
import CloudHSM.DescribeHapgRequest
import CloudHSM.DescribeHapgResponse
import CloudHSM.DescribeHsmRequest
import CloudHSM.DescribeHsmResponse
import CloudHSM.DescribeLunaClientRequest
import CloudHSM.DescribeLunaClientResponse
import CloudHSM.GetConfigRequest
import CloudHSM.GetConfigResponse
import CloudHSM.ListAvailableZonesRequest
import CloudHSM.ListAvailableZonesResponse
import CloudHSM.ListHapgsRequest
import CloudHSM.ListHapgsResponse
import CloudHSM.ListHsmsRequest
import CloudHSM.ListHsmsResponse
import CloudHSM.ListLunaClientsRequest
import CloudHSM.ListLunaClientsResponse
import CloudHSM.ListTagsForResourceRequest
import CloudHSM.ListTagsForResourceResponse
import CloudHSM.ModifyHapgRequest
import CloudHSM.ModifyHapgResponse
import CloudHSM.ModifyHsmRequest
import CloudHSM.ModifyHsmResponse
import CloudHSM.ModifyLunaClientRequest
import CloudHSM.ModifyLunaClientResponse
import CloudHSM.RemoveTagsFromResourceRequest
import CloudHSM.RemoveTagsFromResourceResponse

typealias AZ = String

typealias AZList = Array<AZ>

typealias Certificate = String

typealias CertificateFingerprint = String

typealias ClientArn = String

typealias ClientLabel = String

typealias ClientList = Array<ClientArn>

typealias ClientToken = String

typealias EniId = String

typealias ExternalId = String

typealias HapgArn = String

typealias HapgList = Array<HapgArn>

typealias HsmArn = String

typealias HsmList = Array<HsmArn>

typealias HsmSerialNumber = String

typealias IamRoleArn = String

typealias IpAddress = String

typealias Label = String

typealias PaginationToken = String

typealias PartitionArn = String

typealias PartitionList = Array<PartitionArn>

typealias PartitionSerial = String

typealias PartitionSerialList = Array<PartitionSerial>

typealias SshKey = String

typealias String = String

typealias SubnetId = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias Timestamp = String

typealias VpcId = String

@JsModule("aws-sdk")
external open class CloudHSM(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CloudHSM.Types.ClientConfiguration */
    open fun addTagsToResource(params: AddTagsToResourceRequest, callback: (err: AWSError, data: AddTagsToResourceResponse) -> Unit = definedExternally): Request<AddTagsToResourceResponse, AWSError>
    open fun addTagsToResource(callback: (err: AWSError, data: AddTagsToResourceResponse) -> Unit = definedExternally): Request<AddTagsToResourceResponse, AWSError>
    open fun createHapg(params: CreateHapgRequest, callback: (err: AWSError, data: CreateHapgResponse) -> Unit = definedExternally): Request<CreateHapgResponse, AWSError>
    open fun createHapg(callback: (err: AWSError, data: CreateHapgResponse) -> Unit = definedExternally): Request<CreateHapgResponse, AWSError>
    open fun createHsm(params: CreateHsmRequest, callback: (err: AWSError, data: CreateHsmResponse) -> Unit = definedExternally): Request<CreateHsmResponse, AWSError>
    open fun createHsm(callback: (err: AWSError, data: CreateHsmResponse) -> Unit = definedExternally): Request<CreateHsmResponse, AWSError>
    open fun createLunaClient(params: CreateLunaClientRequest, callback: (err: AWSError, data: CreateLunaClientResponse) -> Unit = definedExternally): Request<CreateLunaClientResponse, AWSError>
    open fun createLunaClient(callback: (err: AWSError, data: CreateLunaClientResponse) -> Unit = definedExternally): Request<CreateLunaClientResponse, AWSError>
    open fun deleteHapg(params: DeleteHapgRequest, callback: (err: AWSError, data: DeleteHapgResponse) -> Unit = definedExternally): Request<DeleteHapgResponse, AWSError>
    open fun deleteHapg(callback: (err: AWSError, data: DeleteHapgResponse) -> Unit = definedExternally): Request<DeleteHapgResponse, AWSError>
    open fun deleteHsm(params: DeleteHsmRequest, callback: (err: AWSError, data: DeleteHsmResponse) -> Unit = definedExternally): Request<DeleteHsmResponse, AWSError>
    open fun deleteHsm(callback: (err: AWSError, data: DeleteHsmResponse) -> Unit = definedExternally): Request<DeleteHsmResponse, AWSError>
    open fun deleteLunaClient(params: DeleteLunaClientRequest, callback: (err: AWSError, data: DeleteLunaClientResponse) -> Unit = definedExternally): Request<DeleteLunaClientResponse, AWSError>
    open fun deleteLunaClient(callback: (err: AWSError, data: DeleteLunaClientResponse) -> Unit = definedExternally): Request<DeleteLunaClientResponse, AWSError>
    open fun describeHapg(params: DescribeHapgRequest, callback: (err: AWSError, data: DescribeHapgResponse) -> Unit = definedExternally): Request<DescribeHapgResponse, AWSError>
    open fun describeHapg(callback: (err: AWSError, data: DescribeHapgResponse) -> Unit = definedExternally): Request<DescribeHapgResponse, AWSError>
    open fun describeHsm(params: DescribeHsmRequest, callback: (err: AWSError, data: DescribeHsmResponse) -> Unit = definedExternally): Request<DescribeHsmResponse, AWSError>
    open fun describeHsm(callback: (err: AWSError, data: DescribeHsmResponse) -> Unit = definedExternally): Request<DescribeHsmResponse, AWSError>
    open fun describeLunaClient(params: DescribeLunaClientRequest, callback: (err: AWSError, data: DescribeLunaClientResponse) -> Unit = definedExternally): Request<DescribeLunaClientResponse, AWSError>
    open fun describeLunaClient(callback: (err: AWSError, data: DescribeLunaClientResponse) -> Unit = definedExternally): Request<DescribeLunaClientResponse, AWSError>
    open fun getConfig(params: GetConfigRequest, callback: (err: AWSError, data: GetConfigResponse) -> Unit = definedExternally): Request<GetConfigResponse, AWSError>
    open fun getConfig(callback: (err: AWSError, data: GetConfigResponse) -> Unit = definedExternally): Request<GetConfigResponse, AWSError>
    open fun listAvailableZones(params: ListAvailableZonesRequest, callback: (err: AWSError, data: ListAvailableZonesResponse) -> Unit = definedExternally): Request<ListAvailableZonesResponse, AWSError>
    open fun listAvailableZones(callback: (err: AWSError, data: ListAvailableZonesResponse) -> Unit = definedExternally): Request<ListAvailableZonesResponse, AWSError>
    open fun listHapgs(params: ListHapgsRequest, callback: (err: AWSError, data: ListHapgsResponse) -> Unit = definedExternally): Request<ListHapgsResponse, AWSError>
    open fun listHapgs(callback: (err: AWSError, data: ListHapgsResponse) -> Unit = definedExternally): Request<ListHapgsResponse, AWSError>
    open fun listHsms(params: ListHsmsRequest, callback: (err: AWSError, data: ListHsmsResponse) -> Unit = definedExternally): Request<ListHsmsResponse, AWSError>
    open fun listHsms(callback: (err: AWSError, data: ListHsmsResponse) -> Unit = definedExternally): Request<ListHsmsResponse, AWSError>
    open fun listLunaClients(params: ListLunaClientsRequest, callback: (err: AWSError, data: ListLunaClientsResponse) -> Unit = definedExternally): Request<ListLunaClientsResponse, AWSError>
    open fun listLunaClients(callback: (err: AWSError, data: ListLunaClientsResponse) -> Unit = definedExternally): Request<ListLunaClientsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun modifyHapg(params: ModifyHapgRequest, callback: (err: AWSError, data: ModifyHapgResponse) -> Unit = definedExternally): Request<ModifyHapgResponse, AWSError>
    open fun modifyHapg(callback: (err: AWSError, data: ModifyHapgResponse) -> Unit = definedExternally): Request<ModifyHapgResponse, AWSError>
    open fun modifyHsm(params: ModifyHsmRequest, callback: (err: AWSError, data: ModifyHsmResponse) -> Unit = definedExternally): Request<ModifyHsmResponse, AWSError>
    open fun modifyHsm(callback: (err: AWSError, data: ModifyHsmResponse) -> Unit = definedExternally): Request<ModifyHsmResponse, AWSError>
    open fun modifyLunaClient(params: ModifyLunaClientRequest, callback: (err: AWSError, data: ModifyLunaClientResponse) -> Unit = definedExternally): Request<ModifyLunaClientResponse, AWSError>
    open fun modifyLunaClient(callback: (err: AWSError, data: ModifyLunaClientResponse) -> Unit = definedExternally): Request<ModifyLunaClientResponse, AWSError>
    open fun removeTagsFromResource(params: RemoveTagsFromResourceRequest, callback: (err: AWSError, data: RemoveTagsFromResourceResponse) -> Unit = definedExternally): Request<RemoveTagsFromResourceResponse, AWSError>
    open fun removeTagsFromResource(callback: (err: AWSError, data: RemoveTagsFromResourceResponse) -> Unit = definedExternally): Request<RemoveTagsFromResourceResponse, AWSError>
    interface AddTagsToResourceRequest {
        var ResourceArn: String
        var TagList: TagList
    }
    interface AddTagsToResourceResponse {
        var Status: String
    }
    interface CreateHapgRequest {
        var Label: Label
    }
    interface CreateHapgResponse {
        var HapgArn: HapgArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateHsmRequest {
        var SubnetId: SubnetId
        var SshKey: SshKey
        var EniIp: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoleArn: IamRoleArn
        var ExternalId: ExternalId?
            get() = definedExternally
            set(value) = definedExternally
        var SubscriptionType: String /* "PRODUCTION" | String */
        var ClientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var SyslogIp: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateHsmResponse {
        var HsmArn: HsmArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLunaClientRequest {
        var Label: ClientLabel?
            get() = definedExternally
            set(value) = definedExternally
        var Certificate: Certificate
    }
    interface CreateLunaClientResponse {
        var ClientArn: ClientArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteHapgRequest {
        var HapgArn: HapgArn
    }
    interface DeleteHapgResponse {
        var Status: String
    }
    interface DeleteHsmRequest {
        var HsmArn: HsmArn
    }
    interface DeleteHsmResponse {
        var Status: String
    }
    interface DeleteLunaClientRequest {
        var ClientArn: ClientArn
    }
    interface DeleteLunaClientResponse {
        var Status: String
    }
    interface DescribeHapgRequest {
        var HapgArn: HapgArn
    }
    interface DescribeHapgResponse {
        var HapgArn: HapgArn?
            get() = definedExternally
            set(value) = definedExternally
        var HapgSerial: String?
            get() = definedExternally
            set(value) = definedExternally
        var HsmsLastActionFailed: HsmList?
            get() = definedExternally
            set(value) = definedExternally
        var HsmsPendingDeletion: HsmList?
            get() = definedExternally
            set(value) = definedExternally
        var HsmsPendingRegistration: HsmList?
            get() = definedExternally
            set(value) = definedExternally
        var Label: Label?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var PartitionSerialList: PartitionSerialList?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "READY" | "UPDATING" | "DEGRADED" | String */
    }
    interface DescribeHsmRequest {
        var HsmArn: HsmArn?
            get() = definedExternally
            set(value) = definedExternally
        var HsmSerialNumber: HsmSerialNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeHsmResponse {
        var HsmArn: HsmArn?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "RUNNING" | "UPDATING" | "SUSPENDED" | "TERMINATING" | "TERMINATED" | "DEGRADED" | String */
        var StatusDetails: String?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: AZ?
            get() = definedExternally
            set(value) = definedExternally
        var EniId: EniId?
            get() = definedExternally
            set(value) = definedExternally
        var EniIp: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
        var SubscriptionType: String /* "PRODUCTION" | String */
        var SubscriptionStartDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SubscriptionEndDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: VpcId?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetId: SubnetId?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoleArn: IamRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var SerialNumber: HsmSerialNumber?
            get() = definedExternally
            set(value) = definedExternally
        var VendorName: String?
            get() = definedExternally
            set(value) = definedExternally
        var HsmType: String?
            get() = definedExternally
            set(value) = definedExternally
        var SoftwareVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var SshPublicKey: SshKey?
            get() = definedExternally
            set(value) = definedExternally
        var SshKeyLastUpdated: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ServerCertUri: String?
            get() = definedExternally
            set(value) = definedExternally
        var ServerCertLastUpdated: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Partitions: PartitionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLunaClientRequest {
        var ClientArn: ClientArn?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateFingerprint: CertificateFingerprint?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLunaClientResponse {
        var ClientArn: ClientArn?
            get() = definedExternally
            set(value) = definedExternally
        var Certificate: Certificate?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateFingerprint: CertificateFingerprint?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Label: Label?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetConfigRequest {
        var ClientArn: ClientArn
        var ClientVersion: String /* "5.1" | "5.3" | String */
        var HapgList: HapgList
    }
    interface GetConfigResponse {
        var ConfigType: String?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigFile: String?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigCred: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAvailableZonesRequest
    interface ListAvailableZonesResponse {
        var AZList: AZList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHapgsRequest {
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHapgsResponse {
        var HapgList: HapgList
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHsmsRequest {
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHsmsResponse {
        var HsmList: HsmList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLunaClientsRequest {
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLunaClientsResponse {
        var ClientList: ClientList
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: String
    }
    interface ListTagsForResourceResponse {
        var TagList: TagList
    }
    interface ModifyHapgRequest {
        var HapgArn: HapgArn
        var Label: Label?
            get() = definedExternally
            set(value) = definedExternally
        var PartitionSerialList: PartitionSerialList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyHapgResponse {
        var HapgArn: HapgArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyHsmRequest {
        var HsmArn: HsmArn
        var SubnetId: SubnetId?
            get() = definedExternally
            set(value) = definedExternally
        var EniIp: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoleArn: IamRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var ExternalId: ExternalId?
            get() = definedExternally
            set(value) = definedExternally
        var SyslogIp: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyHsmResponse {
        var HsmArn: HsmArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyLunaClientRequest {
        var ClientArn: ClientArn
        var Certificate: Certificate
    }
    interface ModifyLunaClientResponse {
        var ClientArn: ClientArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveTagsFromResourceRequest {
        var ResourceArn: String
        var TagKeyList: TagKeyList
    }
    interface RemoveTagsFromResourceResponse {
        var Status: String
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2014-05-30" | "latest" | String */
    }
}