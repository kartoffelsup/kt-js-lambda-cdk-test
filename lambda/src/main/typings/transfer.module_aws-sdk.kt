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
import Transfer.HomeDirectoryMapEntry
import Transfer.ListedServer
import Transfer.ListedUser
import Transfer.SshPublicKey
import Transfer.Tag
import Transfer.CreateServerRequest
import Transfer.CreateServerResponse
import Transfer.CreateUserRequest
import Transfer.CreateUserResponse
import Transfer.DeleteServerRequest
import Transfer.DeleteSshPublicKeyRequest
import Transfer.DeleteUserRequest
import Transfer.DescribeServerRequest
import Transfer.DescribeServerResponse
import Transfer.DescribeUserRequest
import Transfer.DescribeUserResponse
import Transfer.ImportSshPublicKeyRequest
import Transfer.ImportSshPublicKeyResponse
import Transfer.ListServersRequest
import Transfer.ListServersResponse
import Transfer.ListTagsForResourceRequest
import Transfer.ListTagsForResourceResponse
import Transfer.ListUsersRequest
import Transfer.ListUsersResponse
import Transfer.StartServerRequest
import Transfer.StopServerRequest
import Transfer.TagResourceRequest
import Transfer.TestIdentityProviderRequest
import Transfer.TestIdentityProviderResponse
import Transfer.UntagResourceRequest
import Transfer.UpdateServerRequest
import Transfer.UpdateServerResponse
import Transfer.UpdateUserRequest
import Transfer.UpdateUserResponse
import Transfer.EndpointDetails
import Transfer.IdentityProviderDetails
import Transfer.DescribedServer
import Transfer.DescribedUser

typealias AddressAllocationId = String

typealias AddressAllocationIds = Array<AddressAllocationId>

typealias Arn = String

typealias DateImported = Date

typealias HomeDirectory = String

typealias HomeDirectoryMappings = Array<HomeDirectoryMapEntry>

typealias HostKey = String

typealias HostKeyFingerprint = String

typealias ListedServers = Array<ListedServer>

typealias ListedUsers = Array<ListedUser>

typealias MapEntry = String

typealias MapTarget = String

typealias MaxResults = Number

typealias Message = String

typealias NextToken = String

typealias NullableRole = String

typealias Policy = String

typealias Response = String

typealias Role = String

typealias ServerId = String

typealias SshPublicKeyBody = String

typealias SshPublicKeyCount = Number

typealias SshPublicKeyId = String

typealias SshPublicKeys = Array<SshPublicKey>

typealias StatusCode = Number

typealias SubnetId = String

typealias SubnetIds = Array<SubnetId>

typealias TagKey = String

typealias TagKeys = Array<TagKey>

typealias TagValue = String

typealias Tags = Array<Tag>

typealias Url = String

typealias UserCount = Number

typealias UserName = String

typealias UserPassword = String

typealias VpcEndpointId = String

typealias VpcId = String

@JsModule("aws-sdk")
external open class Transfer(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Transfer.Types.ClientConfiguration */
    open fun createServer(params: CreateServerRequest, callback: (err: AWSError, data: CreateServerResponse) -> Unit = definedExternally): Request<CreateServerResponse, AWSError>
    open fun createServer(callback: (err: AWSError, data: CreateServerResponse) -> Unit = definedExternally): Request<CreateServerResponse, AWSError>
    open fun createUser(params: CreateUserRequest, callback: (err: AWSError, data: CreateUserResponse) -> Unit = definedExternally): Request<CreateUserResponse, AWSError>
    open fun createUser(callback: (err: AWSError, data: CreateUserResponse) -> Unit = definedExternally): Request<CreateUserResponse, AWSError>
    open fun deleteServer(params: DeleteServerRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteServer(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSshPublicKey(params: DeleteSshPublicKeyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSshPublicKey(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUser(params: DeleteUserRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUser(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeServer(params: DescribeServerRequest, callback: (err: AWSError, data: DescribeServerResponse) -> Unit = definedExternally): Request<DescribeServerResponse, AWSError>
    open fun describeServer(callback: (err: AWSError, data: DescribeServerResponse) -> Unit = definedExternally): Request<DescribeServerResponse, AWSError>
    open fun describeUser(params: DescribeUserRequest, callback: (err: AWSError, data: DescribeUserResponse) -> Unit = definedExternally): Request<DescribeUserResponse, AWSError>
    open fun describeUser(callback: (err: AWSError, data: DescribeUserResponse) -> Unit = definedExternally): Request<DescribeUserResponse, AWSError>
    open fun importSshPublicKey(params: ImportSshPublicKeyRequest, callback: (err: AWSError, data: ImportSshPublicKeyResponse) -> Unit = definedExternally): Request<ImportSshPublicKeyResponse, AWSError>
    open fun importSshPublicKey(callback: (err: AWSError, data: ImportSshPublicKeyResponse) -> Unit = definedExternally): Request<ImportSshPublicKeyResponse, AWSError>
    open fun listServers(params: ListServersRequest, callback: (err: AWSError, data: ListServersResponse) -> Unit = definedExternally): Request<ListServersResponse, AWSError>
    open fun listServers(callback: (err: AWSError, data: ListServersResponse) -> Unit = definedExternally): Request<ListServersResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listUsers(params: ListUsersRequest, callback: (err: AWSError, data: ListUsersResponse) -> Unit = definedExternally): Request<ListUsersResponse, AWSError>
    open fun listUsers(callback: (err: AWSError, data: ListUsersResponse) -> Unit = definedExternally): Request<ListUsersResponse, AWSError>
    open fun startServer(params: StartServerRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun startServer(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopServer(params: StopServerRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopServer(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun testIdentityProvider(params: TestIdentityProviderRequest, callback: (err: AWSError, data: TestIdentityProviderResponse) -> Unit = definedExternally): Request<TestIdentityProviderResponse, AWSError>
    open fun testIdentityProvider(callback: (err: AWSError, data: TestIdentityProviderResponse) -> Unit = definedExternally): Request<TestIdentityProviderResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateServer(params: UpdateServerRequest, callback: (err: AWSError, data: UpdateServerResponse) -> Unit = definedExternally): Request<UpdateServerResponse, AWSError>
    open fun updateServer(callback: (err: AWSError, data: UpdateServerResponse) -> Unit = definedExternally): Request<UpdateServerResponse, AWSError>
    open fun updateUser(params: UpdateUserRequest, callback: (err: AWSError, data: UpdateUserResponse) -> Unit = definedExternally): Request<UpdateUserResponse, AWSError>
    open fun updateUser(callback: (err: AWSError, data: UpdateUserResponse) -> Unit = definedExternally): Request<UpdateUserResponse, AWSError>
    interface CreateServerRequest {
        var EndpointDetails: EndpointDetails?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointType: String /* "PUBLIC" | "VPC" | "VPC_ENDPOINT" | String */
        var HostKey: HostKey?
            get() = definedExternally
            set(value) = definedExternally
        var IdentityProviderDetails: IdentityProviderDetails?
            get() = definedExternally
            set(value) = definedExternally
        var IdentityProviderType: String /* "SERVICE_MANAGED" | "API_GATEWAY" | String */
        var LoggingRole: Role?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateServerResponse {
        var ServerId: ServerId
    }
    interface CreateUserRequest {
        var HomeDirectory: HomeDirectory?
            get() = definedExternally
            set(value) = definedExternally
        var HomeDirectoryType: String /* "PATH" | "LOGICAL" | String */
        var HomeDirectoryMappings: HomeDirectoryMappings?
            get() = definedExternally
            set(value) = definedExternally
        var Policy: Policy?
            get() = definedExternally
            set(value) = definedExternally
        var Role: Role
        var ServerId: ServerId
        var SshPublicKeyBody: SshPublicKeyBody?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var UserName: UserName
    }
    interface CreateUserResponse {
        var ServerId: ServerId
        var UserName: UserName
    }
    interface DeleteServerRequest {
        var ServerId: ServerId
    }
    interface DeleteSshPublicKeyRequest {
        var ServerId: ServerId
        var SshPublicKeyId: SshPublicKeyId
        var UserName: UserName
    }
    interface DeleteUserRequest {
        var ServerId: ServerId
        var UserName: UserName
    }
    interface DescribeServerRequest {
        var ServerId: ServerId
    }
    interface DescribeServerResponse {
        var Server: DescribedServer
    }
    interface DescribeUserRequest {
        var ServerId: ServerId
        var UserName: UserName
    }
    interface DescribeUserResponse {
        var ServerId: ServerId
        var User: DescribedUser
    }
    interface DescribedServer {
        var Arn: Arn
        var EndpointDetails: EndpointDetails?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointType: String /* "PUBLIC" | "VPC" | "VPC_ENDPOINT" | String */
        var HostKeyFingerprint: HostKeyFingerprint?
            get() = definedExternally
            set(value) = definedExternally
        var IdentityProviderDetails: IdentityProviderDetails?
            get() = definedExternally
            set(value) = definedExternally
        var IdentityProviderType: String /* "SERVICE_MANAGED" | "API_GATEWAY" | String */
        var LoggingRole: Role?
            get() = definedExternally
            set(value) = definedExternally
        var ServerId: ServerId?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "OFFLINE" | "ONLINE" | "STARTING" | "STOPPING" | "START_FAILED" | "STOP_FAILED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var UserCount: UserCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribedUser {
        var Arn: Arn
        var HomeDirectory: HomeDirectory?
            get() = definedExternally
            set(value) = definedExternally
        var HomeDirectoryMappings: HomeDirectoryMappings?
            get() = definedExternally
            set(value) = definedExternally
        var HomeDirectoryType: String /* "PATH" | "LOGICAL" | String */
        var Policy: Policy?
            get() = definedExternally
            set(value) = definedExternally
        var Role: Role?
            get() = definedExternally
            set(value) = definedExternally
        var SshPublicKeys: SshPublicKeys?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var UserName: UserName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EndpointDetails {
        var AddressAllocationIds: AddressAllocationIds?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: SubnetIds?
            get() = definedExternally
            set(value) = definedExternally
        var VpcEndpointId: VpcEndpointId?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: VpcId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HomeDirectoryMapEntry {
        var Entry: MapEntry
        var Target: MapTarget
    }
    interface IdentityProviderDetails {
        var Url: Url?
            get() = definedExternally
            set(value) = definedExternally
        var InvocationRole: Role?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportSshPublicKeyRequest {
        var ServerId: ServerId
        var SshPublicKeyBody: SshPublicKeyBody
        var UserName: UserName
    }
    interface ImportSshPublicKeyResponse {
        var ServerId: ServerId
        var SshPublicKeyId: SshPublicKeyId
        var UserName: UserName
    }
    interface ListServersRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListServersResponse {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Servers: ListedServers
    }
    interface ListTagsForResourceRequest {
        var Arn: Arn
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUsersRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var ServerId: ServerId
    }
    interface ListUsersResponse {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var ServerId: ServerId
        var Users: ListedUsers
    }
    interface ListedServer {
        var Arn: Arn
        var IdentityProviderType: String /* "SERVICE_MANAGED" | "API_GATEWAY" | String */
        var EndpointType: String /* "PUBLIC" | "VPC" | "VPC_ENDPOINT" | String */
        var LoggingRole: Role?
            get() = definedExternally
            set(value) = definedExternally
        var ServerId: ServerId?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "OFFLINE" | "ONLINE" | "STARTING" | "STOPPING" | "START_FAILED" | "STOP_FAILED" | String */
        var UserCount: UserCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListedUser {
        var Arn: Arn
        var HomeDirectory: HomeDirectory?
            get() = definedExternally
            set(value) = definedExternally
        var HomeDirectoryType: String /* "PATH" | "LOGICAL" | String */
        var Role: Role?
            get() = definedExternally
            set(value) = definedExternally
        var SshPublicKeyCount: SshPublicKeyCount?
            get() = definedExternally
            set(value) = definedExternally
        var UserName: UserName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SshPublicKey {
        var DateImported: DateImported
        var SshPublicKeyBody: SshPublicKeyBody
        var SshPublicKeyId: SshPublicKeyId
    }
    interface StartServerRequest {
        var ServerId: ServerId
    }
    interface StopServerRequest {
        var ServerId: ServerId
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface TagResourceRequest {
        var Arn: Arn
        var Tags: Tags
    }
    interface TestIdentityProviderRequest {
        var ServerId: ServerId
        var UserName: UserName
        var UserPassword: UserPassword?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestIdentityProviderResponse {
        var Response: Response?
            get() = definedExternally
            set(value) = definedExternally
        var StatusCode: StatusCode
        var Message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var Url: Url
    }
    interface UntagResourceRequest {
        var Arn: Arn
        var TagKeys: TagKeys
    }
    interface UpdateServerRequest {
        var EndpointDetails: EndpointDetails?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointType: String /* "PUBLIC" | "VPC" | "VPC_ENDPOINT" | String */
        var HostKey: HostKey?
            get() = definedExternally
            set(value) = definedExternally
        var IdentityProviderDetails: IdentityProviderDetails?
            get() = definedExternally
            set(value) = definedExternally
        var LoggingRole: NullableRole?
            get() = definedExternally
            set(value) = definedExternally
        var ServerId: ServerId
    }
    interface UpdateServerResponse {
        var ServerId: ServerId
    }
    interface UpdateUserRequest {
        var HomeDirectory: HomeDirectory?
            get() = definedExternally
            set(value) = definedExternally
        var HomeDirectoryType: String /* "PATH" | "LOGICAL" | String */
        var HomeDirectoryMappings: HomeDirectoryMappings?
            get() = definedExternally
            set(value) = definedExternally
        var Policy: Policy?
            get() = definedExternally
            set(value) = definedExternally
        var Role: Role?
            get() = definedExternally
            set(value) = definedExternally
        var ServerId: ServerId
        var UserName: UserName
    }
    interface UpdateUserResponse {
        var ServerId: ServerId
        var UserName: UserName
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-11-05" | "latest" | String */
    }
}