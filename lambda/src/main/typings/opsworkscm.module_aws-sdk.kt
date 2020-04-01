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
import OpsWorksCM.AccountAttribute
import OpsWorksCM.Backup
import OpsWorksCM.EngineAttribute
import OpsWorksCM.ServerEvent
import OpsWorksCM.Server
import OpsWorksCM.Tag
import OpsWorksCM.AssociateNodeRequest
import OpsWorksCM.AssociateNodeResponse
import OpsWorksCM.CreateBackupRequest
import OpsWorksCM.CreateBackupResponse
import OpsWorksCM.CreateServerRequest
import OpsWorksCM.CreateServerResponse
import OpsWorksCM.DeleteBackupRequest
import OpsWorksCM.DeleteBackupResponse
import OpsWorksCM.DeleteServerRequest
import OpsWorksCM.DeleteServerResponse
import OpsWorksCM.DescribeAccountAttributesRequest
import OpsWorksCM.DescribeAccountAttributesResponse
import OpsWorksCM.DescribeBackupsRequest
import OpsWorksCM.DescribeBackupsResponse
import OpsWorksCM.DescribeEventsRequest
import OpsWorksCM.DescribeEventsResponse
import OpsWorksCM.DescribeNodeAssociationStatusRequest
import OpsWorksCM.DescribeNodeAssociationStatusResponse
import OpsWorksCM.DescribeServersRequest
import OpsWorksCM.DescribeServersResponse
import OpsWorksCM.DisassociateNodeRequest
import OpsWorksCM.DisassociateNodeResponse
import OpsWorksCM.ExportServerEngineAttributeRequest
import OpsWorksCM.ExportServerEngineAttributeResponse
import OpsWorksCM.ListTagsForResourceRequest
import OpsWorksCM.ListTagsForResourceResponse
import OpsWorksCM.RestoreServerRequest
import OpsWorksCM.RestoreServerResponse
import OpsWorksCM.StartMaintenanceRequest
import OpsWorksCM.StartMaintenanceResponse
import OpsWorksCM.TagResourceRequest
import OpsWorksCM.TagResourceResponse
import OpsWorksCM.UntagResourceRequest
import OpsWorksCM.UntagResourceResponse
import OpsWorksCM.UpdateServerRequest
import OpsWorksCM.UpdateServerResponse
import OpsWorksCM.UpdateServerEngineAttributesRequest
import OpsWorksCM.UpdateServerEngineAttributesResponse

typealias AWSOpsWorksCMResourceArn = String

typealias AccountAttributes = Array<AccountAttribute>

typealias AttributeName = String

typealias AttributeValue = String

typealias BackupId = String

typealias BackupRetentionCountDefinition = Number

typealias Backups = Array<Backup>

typealias Boolean = Boolean

typealias CustomCertificate = String

typealias CustomDomain = String

typealias CustomPrivateKey = String

typealias EngineAttributeName = String

typealias EngineAttributeValue = String

typealias EngineAttributes = Array<EngineAttribute>

typealias InstanceProfileArn = String

typealias Integer = Number

typealias KeyPair = String

typealias MaxResults = Number

typealias NextToken = String

typealias NodeAssociationStatusToken = String

typealias NodeName = String

typealias ServerEvents = Array<ServerEvent>

typealias ServerName = String

typealias Servers = Array<Server>

typealias ServiceRoleArn = String

typealias String = String

typealias Strings = Array<String>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TimeWindowDefinition = String

typealias Timestamp = Date

@JsModule("aws-sdk")
external open class OpsWorksCM(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & OpsWorksCM.Types.ClientConfiguration */
    open fun associateNode(params: AssociateNodeRequest, callback: (err: AWSError, data: AssociateNodeResponse) -> Unit = definedExternally): Request<AssociateNodeResponse, AWSError>
    open fun associateNode(callback: (err: AWSError, data: AssociateNodeResponse) -> Unit = definedExternally): Request<AssociateNodeResponse, AWSError>
    open fun createBackup(params: CreateBackupRequest, callback: (err: AWSError, data: CreateBackupResponse) -> Unit = definedExternally): Request<CreateBackupResponse, AWSError>
    open fun createBackup(callback: (err: AWSError, data: CreateBackupResponse) -> Unit = definedExternally): Request<CreateBackupResponse, AWSError>
    open fun createServer(params: CreateServerRequest, callback: (err: AWSError, data: CreateServerResponse) -> Unit = definedExternally): Request<CreateServerResponse, AWSError>
    open fun createServer(callback: (err: AWSError, data: CreateServerResponse) -> Unit = definedExternally): Request<CreateServerResponse, AWSError>
    open fun deleteBackup(params: DeleteBackupRequest, callback: (err: AWSError, data: DeleteBackupResponse) -> Unit = definedExternally): Request<DeleteBackupResponse, AWSError>
    open fun deleteBackup(callback: (err: AWSError, data: DeleteBackupResponse) -> Unit = definedExternally): Request<DeleteBackupResponse, AWSError>
    open fun deleteServer(params: DeleteServerRequest, callback: (err: AWSError, data: DeleteServerResponse) -> Unit = definedExternally): Request<DeleteServerResponse, AWSError>
    open fun deleteServer(callback: (err: AWSError, data: DeleteServerResponse) -> Unit = definedExternally): Request<DeleteServerResponse, AWSError>
    open fun describeAccountAttributes(params: DescribeAccountAttributesRequest, callback: (err: AWSError, data: DescribeAccountAttributesResponse) -> Unit = definedExternally): Request<DescribeAccountAttributesResponse, AWSError>
    open fun describeAccountAttributes(callback: (err: AWSError, data: DescribeAccountAttributesResponse) -> Unit = definedExternally): Request<DescribeAccountAttributesResponse, AWSError>
    open fun describeBackups(params: DescribeBackupsRequest, callback: (err: AWSError, data: DescribeBackupsResponse) -> Unit = definedExternally): Request<DescribeBackupsResponse, AWSError>
    open fun describeBackups(callback: (err: AWSError, data: DescribeBackupsResponse) -> Unit = definedExternally): Request<DescribeBackupsResponse, AWSError>
    open fun describeEvents(params: DescribeEventsRequest, callback: (err: AWSError, data: DescribeEventsResponse) -> Unit = definedExternally): Request<DescribeEventsResponse, AWSError>
    open fun describeEvents(callback: (err: AWSError, data: DescribeEventsResponse) -> Unit = definedExternally): Request<DescribeEventsResponse, AWSError>
    open fun describeNodeAssociationStatus(params: DescribeNodeAssociationStatusRequest, callback: (err: AWSError, data: DescribeNodeAssociationStatusResponse) -> Unit = definedExternally): Request<DescribeNodeAssociationStatusResponse, AWSError>
    open fun describeNodeAssociationStatus(callback: (err: AWSError, data: DescribeNodeAssociationStatusResponse) -> Unit = definedExternally): Request<DescribeNodeAssociationStatusResponse, AWSError>
    open fun describeServers(params: DescribeServersRequest, callback: (err: AWSError, data: DescribeServersResponse) -> Unit = definedExternally): Request<DescribeServersResponse, AWSError>
    open fun describeServers(callback: (err: AWSError, data: DescribeServersResponse) -> Unit = definedExternally): Request<DescribeServersResponse, AWSError>
    open fun disassociateNode(params: DisassociateNodeRequest, callback: (err: AWSError, data: DisassociateNodeResponse) -> Unit = definedExternally): Request<DisassociateNodeResponse, AWSError>
    open fun disassociateNode(callback: (err: AWSError, data: DisassociateNodeResponse) -> Unit = definedExternally): Request<DisassociateNodeResponse, AWSError>
    open fun exportServerEngineAttribute(params: ExportServerEngineAttributeRequest, callback: (err: AWSError, data: ExportServerEngineAttributeResponse) -> Unit = definedExternally): Request<ExportServerEngineAttributeResponse, AWSError>
    open fun exportServerEngineAttribute(callback: (err: AWSError, data: ExportServerEngineAttributeResponse) -> Unit = definedExternally): Request<ExportServerEngineAttributeResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun restoreServer(params: RestoreServerRequest, callback: (err: AWSError, data: RestoreServerResponse) -> Unit = definedExternally): Request<RestoreServerResponse, AWSError>
    open fun restoreServer(callback: (err: AWSError, data: RestoreServerResponse) -> Unit = definedExternally): Request<RestoreServerResponse, AWSError>
    open fun startMaintenance(params: StartMaintenanceRequest, callback: (err: AWSError, data: StartMaintenanceResponse) -> Unit = definedExternally): Request<StartMaintenanceResponse, AWSError>
    open fun startMaintenance(callback: (err: AWSError, data: StartMaintenanceResponse) -> Unit = definedExternally): Request<StartMaintenanceResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateServer(params: UpdateServerRequest, callback: (err: AWSError, data: UpdateServerResponse) -> Unit = definedExternally): Request<UpdateServerResponse, AWSError>
    open fun updateServer(callback: (err: AWSError, data: UpdateServerResponse) -> Unit = definedExternally): Request<UpdateServerResponse, AWSError>
    open fun updateServerEngineAttributes(params: UpdateServerEngineAttributesRequest, callback: (err: AWSError, data: UpdateServerEngineAttributesResponse) -> Unit = definedExternally): Request<UpdateServerEngineAttributesResponse, AWSError>
    open fun updateServerEngineAttributes(callback: (err: AWSError, data: UpdateServerEngineAttributesResponse) -> Unit = definedExternally): Request<UpdateServerEngineAttributesResponse, AWSError>
    open fun waitFor(state: String /* "nodeAssociated" */, params: DescribeNodeAssociationStatusRequest /* OpsWorksCM.Types.DescribeNodeAssociationStatusRequest & `T$0` */, callback: (err: AWSError, data: DescribeNodeAssociationStatusResponse) -> Unit = definedExternally): Request<DescribeNodeAssociationStatusResponse, AWSError>
    open fun waitFor(state: String /* "nodeAssociated" */, callback: (err: AWSError, data: DescribeNodeAssociationStatusResponse) -> Unit = definedExternally): Request<DescribeNodeAssociationStatusResponse, AWSError>
    interface AccountAttribute {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Maximum: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Used: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateNodeRequest {
        var ServerName: ServerName
        var NodeName: NodeName
        var EngineAttributes: EngineAttributes
    }
    interface AssociateNodeResponse {
        var NodeAssociationStatusToken: NodeAssociationStatusToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Backup {
        var BackupArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var BackupId: BackupId?
            get() = definedExternally
            set(value) = definedExternally
        var BackupType: String /* "AUTOMATED" | "MANUAL" | String */
        var CreatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineModel: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceProfileArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var KeyPair: String?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredBackupWindow: TimeWindowDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: TimeWindowDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var S3DataSize: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var S3DataUrl: String?
            get() = definedExternally
            set(value) = definedExternally
        var S3LogUrl: String?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var ServerName: ServerName?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "IN_PROGRESS" | "OK" | "FAILED" | "DELETING" | String */
        var StatusDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var ToolsVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var UserArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBackupRequest {
        var ServerName: ServerName
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBackupResponse {
        var Backup: Backup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateServerRequest {
        var AssociatePublicIpAddress: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CustomDomain: CustomDomain?
            get() = definedExternally
            set(value) = definedExternally
        var CustomCertificate: CustomCertificate?
            get() = definedExternally
            set(value) = definedExternally
        var CustomPrivateKey: CustomPrivateKey?
            get() = definedExternally
            set(value) = definedExternally
        var DisableAutomatedBackup: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineModel: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineAttributes: EngineAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var BackupRetentionCount: BackupRetentionCountDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var ServerName: ServerName
        var InstanceProfileArn: InstanceProfileArn
        var InstanceType: String
        var KeyPair: KeyPair?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMaintenanceWindow: TimeWindowDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredBackupWindow: TimeWindowDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceRoleArn: ServiceRoleArn
        var SubnetIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var BackupId: BackupId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateServerResponse {
        var Server: Server?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteBackupRequest {
        var BackupId: BackupId
    }
    interface DeleteBackupResponse
    interface DeleteServerRequest {
        var ServerName: ServerName
    }
    interface DeleteServerResponse
    interface DescribeAccountAttributesRequest
    interface DescribeAccountAttributesResponse {
        var Attributes: AccountAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeBackupsRequest {
        var BackupId: BackupId?
            get() = definedExternally
            set(value) = definedExternally
        var ServerName: ServerName?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeBackupsResponse {
        var Backups: Backups?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventsRequest {
        var ServerName: ServerName
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventsResponse {
        var ServerEvents: ServerEvents?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeNodeAssociationStatusRequest {
        var NodeAssociationStatusToken: NodeAssociationStatusToken
        var ServerName: ServerName
    }
    interface DescribeNodeAssociationStatusResponse {
        var NodeAssociationStatus: String /* "SUCCESS" | "FAILED" | "IN_PROGRESS" | String */
        var EngineAttributes: EngineAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeServersRequest {
        var ServerName: ServerName?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeServersResponse {
        var Servers: Servers?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateNodeRequest {
        var ServerName: ServerName
        var NodeName: NodeName
        var EngineAttributes: EngineAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateNodeResponse {
        var NodeAssociationStatusToken: NodeAssociationStatusToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EngineAttribute {
        var Name: EngineAttributeName?
            get() = definedExternally
            set(value) = definedExternally
        var Value: EngineAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExportServerEngineAttributeRequest {
        var ExportAttributeName: String
        var ServerName: ServerName
        var InputAttributes: EngineAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExportServerEngineAttributeResponse {
        var EngineAttribute: EngineAttribute?
            get() = definedExternally
            set(value) = definedExternally
        var ServerName: ServerName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: AWSOpsWorksCMResourceArn
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceResponse {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreServerRequest {
        var BackupId: BackupId
        var ServerName: ServerName
        var InstanceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var KeyPair: KeyPair?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreServerResponse
    interface Server {
        var AssociatePublicIpAddress: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var BackupRetentionCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ServerName: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CloudFormationStackArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var CustomDomain: CustomDomain?
            get() = definedExternally
            set(value) = definedExternally
        var DisableAutomatedBackup: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Endpoint: String?
            get() = definedExternally
            set(value) = definedExternally
        var Engine: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineModel: String?
            get() = definedExternally
            set(value) = definedExternally
        var EngineAttributes: EngineAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceProfileArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var KeyPair: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaintenanceStatus: String /* "SUCCESS" | "FAILED" | String */
        var PreferredMaintenanceWindow: TimeWindowDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredBackupWindow: TimeWindowDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "BACKING_UP" | "CONNECTION_LOST" | "CREATING" | "DELETING" | "MODIFYING" | "FAILED" | "HEALTHY" | "RUNNING" | "RESTORING" | "SETUP" | "UNDER_MAINTENANCE" | "UNHEALTHY" | "TERMINATED" | String */
        var StatusReason: String?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: Strings?
            get() = definedExternally
            set(value) = definedExternally
        var ServerArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServerEvent {
        var CreatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ServerName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
        var LogUrl: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartMaintenanceRequest {
        var ServerName: ServerName
        var EngineAttributes: EngineAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartMaintenanceResponse {
        var Server: Server?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface TagResourceRequest {
        var ResourceArn: AWSOpsWorksCMResourceArn
        var Tags: TagList
    }
    interface TagResourceResponse
    interface UntagResourceRequest {
        var ResourceArn: AWSOpsWorksCMResourceArn
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateServerEngineAttributesRequest {
        var ServerName: ServerName
        var AttributeName: AttributeName
        var AttributeValue: AttributeValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateServerEngineAttributesResponse {
        var Server: Server?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateServerRequest {
        var DisableAutomatedBackup: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var BackupRetentionCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ServerName: ServerName
        var PreferredMaintenanceWindow: TimeWindowDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredBackupWindow: TimeWindowDefinition?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateServerResponse {
        var Server: Server?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2016-11-01" | "latest" | String */
    }
}