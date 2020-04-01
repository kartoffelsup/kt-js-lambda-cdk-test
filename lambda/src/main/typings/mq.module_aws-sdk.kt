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
import MQ.AvailabilityZone
import MQ.BrokerEngineType
import MQ.BrokerInstance
import MQ.BrokerInstanceOption
import MQ.BrokerSummary
import MQ.Configuration
import MQ.ConfigurationId
import MQ.ConfigurationRevision
import MQ.EngineVersion
import MQ.SanitizationWarning
import MQ.User
import MQ.UserSummary
import MQ.CreateBrokerRequest
import MQ.CreateBrokerResponse
import MQ.CreateConfigurationRequest
import MQ.CreateConfigurationResponse
import MQ.CreateTagsRequest
import MQ.CreateUserRequest
import MQ.CreateUserResponse
import MQ.DeleteBrokerRequest
import MQ.DeleteBrokerResponse
import MQ.DeleteTagsRequest
import MQ.DeleteUserRequest
import MQ.DeleteUserResponse
import MQ.DescribeBrokerRequest
import MQ.DescribeBrokerResponse
import MQ.DescribeBrokerEngineTypesRequest
import MQ.DescribeBrokerEngineTypesResponse
import MQ.DescribeBrokerInstanceOptionsRequest
import MQ.DescribeBrokerInstanceOptionsResponse
import MQ.DescribeConfigurationRequest
import MQ.DescribeConfigurationResponse
import MQ.DescribeConfigurationRevisionRequest
import MQ.DescribeConfigurationRevisionResponse
import MQ.DescribeUserRequest
import MQ.DescribeUserResponse
import MQ.ListBrokersRequest
import MQ.ListBrokersResponse
import MQ.ListConfigurationRevisionsRequest
import MQ.ListConfigurationRevisionsResponse
import MQ.ListConfigurationsRequest
import MQ.ListConfigurationsResponse
import MQ.ListTagsRequest
import MQ.ListTagsResponse
import MQ.ListUsersRequest
import MQ.ListUsersResponse
import MQ.RebootBrokerRequest
import MQ.RebootBrokerResponse
import MQ.UpdateBrokerRequest
import MQ.UpdateBrokerResponse
import MQ.UpdateConfigurationRequest
import MQ.UpdateConfigurationResponse
import MQ.UpdateUserRequest
import MQ.UpdateUserResponse
import MQ.__mapOf__string
import MQ.EncryptionOptions
import MQ.Logs
import MQ.WeeklyStartTime
import MQ.Configurations
import MQ.LogsSummary
import MQ.UserPendingChanges
import MQ.PendingLogs

typealias MaxResults = Number

typealias __boolean = Boolean

typealias __integer = Number

typealias __integerMin5Max100 = Number

typealias __listOfAvailabilityZone = Array<AvailabilityZone>

typealias __listOfBrokerEngineType = Array<BrokerEngineType>

typealias __listOfBrokerInstance = Array<BrokerInstance>

typealias __listOfBrokerInstanceOption = Array<BrokerInstanceOption>

typealias __listOfBrokerSummary = Array<BrokerSummary>

typealias __listOfConfiguration = Array<Configuration>

typealias __listOfConfigurationId = Array<ConfigurationId>

typealias __listOfConfigurationRevision = Array<ConfigurationRevision>

typealias __listOfDeploymentMode = Array<String /* "SINGLE_INSTANCE" | "ACTIVE_STANDBY_MULTI_AZ" | String */>

typealias __listOfEngineVersion = Array<EngineVersion>

typealias __listOfSanitizationWarning = Array<SanitizationWarning>

typealias __listOfUser = Array<User>

typealias __listOfUserSummary = Array<UserSummary>

typealias __listOf__string = Array<__string>

typealias __string = String

typealias __timestampIso8601 = Date

@JsModule("aws-sdk")
external open class MQ(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & MQ.Types.ClientConfiguration */
    open fun createBroker(params: CreateBrokerRequest, callback: (err: AWSError, data: CreateBrokerResponse) -> Unit = definedExternally): Request<CreateBrokerResponse, AWSError>
    open fun createBroker(callback: (err: AWSError, data: CreateBrokerResponse) -> Unit = definedExternally): Request<CreateBrokerResponse, AWSError>
    open fun createConfiguration(params: CreateConfigurationRequest, callback: (err: AWSError, data: CreateConfigurationResponse) -> Unit = definedExternally): Request<CreateConfigurationResponse, AWSError>
    open fun createConfiguration(callback: (err: AWSError, data: CreateConfigurationResponse) -> Unit = definedExternally): Request<CreateConfigurationResponse, AWSError>
    open fun createTags(params: CreateTagsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createTags(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createUser(params: CreateUserRequest, callback: (err: AWSError, data: CreateUserResponse) -> Unit = definedExternally): Request<CreateUserResponse, AWSError>
    open fun createUser(callback: (err: AWSError, data: CreateUserResponse) -> Unit = definedExternally): Request<CreateUserResponse, AWSError>
    open fun deleteBroker(params: DeleteBrokerRequest, callback: (err: AWSError, data: DeleteBrokerResponse) -> Unit = definedExternally): Request<DeleteBrokerResponse, AWSError>
    open fun deleteBroker(callback: (err: AWSError, data: DeleteBrokerResponse) -> Unit = definedExternally): Request<DeleteBrokerResponse, AWSError>
    open fun deleteTags(params: DeleteTagsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteTags(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUser(params: DeleteUserRequest, callback: (err: AWSError, data: DeleteUserResponse) -> Unit = definedExternally): Request<DeleteUserResponse, AWSError>
    open fun deleteUser(callback: (err: AWSError, data: DeleteUserResponse) -> Unit = definedExternally): Request<DeleteUserResponse, AWSError>
    open fun describeBroker(params: DescribeBrokerRequest, callback: (err: AWSError, data: DescribeBrokerResponse) -> Unit = definedExternally): Request<DescribeBrokerResponse, AWSError>
    open fun describeBroker(callback: (err: AWSError, data: DescribeBrokerResponse) -> Unit = definedExternally): Request<DescribeBrokerResponse, AWSError>
    open fun describeBrokerEngineTypes(params: DescribeBrokerEngineTypesRequest, callback: (err: AWSError, data: DescribeBrokerEngineTypesResponse) -> Unit = definedExternally): Request<DescribeBrokerEngineTypesResponse, AWSError>
    open fun describeBrokerEngineTypes(callback: (err: AWSError, data: DescribeBrokerEngineTypesResponse) -> Unit = definedExternally): Request<DescribeBrokerEngineTypesResponse, AWSError>
    open fun describeBrokerInstanceOptions(params: DescribeBrokerInstanceOptionsRequest, callback: (err: AWSError, data: DescribeBrokerInstanceOptionsResponse) -> Unit = definedExternally): Request<DescribeBrokerInstanceOptionsResponse, AWSError>
    open fun describeBrokerInstanceOptions(callback: (err: AWSError, data: DescribeBrokerInstanceOptionsResponse) -> Unit = definedExternally): Request<DescribeBrokerInstanceOptionsResponse, AWSError>
    open fun describeConfiguration(params: DescribeConfigurationRequest, callback: (err: AWSError, data: DescribeConfigurationResponse) -> Unit = definedExternally): Request<DescribeConfigurationResponse, AWSError>
    open fun describeConfiguration(callback: (err: AWSError, data: DescribeConfigurationResponse) -> Unit = definedExternally): Request<DescribeConfigurationResponse, AWSError>
    open fun describeConfigurationRevision(params: DescribeConfigurationRevisionRequest, callback: (err: AWSError, data: DescribeConfigurationRevisionResponse) -> Unit = definedExternally): Request<DescribeConfigurationRevisionResponse, AWSError>
    open fun describeConfigurationRevision(callback: (err: AWSError, data: DescribeConfigurationRevisionResponse) -> Unit = definedExternally): Request<DescribeConfigurationRevisionResponse, AWSError>
    open fun describeUser(params: DescribeUserRequest, callback: (err: AWSError, data: DescribeUserResponse) -> Unit = definedExternally): Request<DescribeUserResponse, AWSError>
    open fun describeUser(callback: (err: AWSError, data: DescribeUserResponse) -> Unit = definedExternally): Request<DescribeUserResponse, AWSError>
    open fun listBrokers(params: ListBrokersRequest, callback: (err: AWSError, data: ListBrokersResponse) -> Unit = definedExternally): Request<ListBrokersResponse, AWSError>
    open fun listBrokers(callback: (err: AWSError, data: ListBrokersResponse) -> Unit = definedExternally): Request<ListBrokersResponse, AWSError>
    open fun listConfigurationRevisions(params: ListConfigurationRevisionsRequest, callback: (err: AWSError, data: ListConfigurationRevisionsResponse) -> Unit = definedExternally): Request<ListConfigurationRevisionsResponse, AWSError>
    open fun listConfigurationRevisions(callback: (err: AWSError, data: ListConfigurationRevisionsResponse) -> Unit = definedExternally): Request<ListConfigurationRevisionsResponse, AWSError>
    open fun listConfigurations(params: ListConfigurationsRequest, callback: (err: AWSError, data: ListConfigurationsResponse) -> Unit = definedExternally): Request<ListConfigurationsResponse, AWSError>
    open fun listConfigurations(callback: (err: AWSError, data: ListConfigurationsResponse) -> Unit = definedExternally): Request<ListConfigurationsResponse, AWSError>
    open fun listTags(params: ListTagsRequest, callback: (err: AWSError, data: ListTagsResponse) -> Unit = definedExternally): Request<ListTagsResponse, AWSError>
    open fun listTags(callback: (err: AWSError, data: ListTagsResponse) -> Unit = definedExternally): Request<ListTagsResponse, AWSError>
    open fun listUsers(params: ListUsersRequest, callback: (err: AWSError, data: ListUsersResponse) -> Unit = definedExternally): Request<ListUsersResponse, AWSError>
    open fun listUsers(callback: (err: AWSError, data: ListUsersResponse) -> Unit = definedExternally): Request<ListUsersResponse, AWSError>
    open fun rebootBroker(params: RebootBrokerRequest, callback: (err: AWSError, data: RebootBrokerResponse) -> Unit = definedExternally): Request<RebootBrokerResponse, AWSError>
    open fun rebootBroker(callback: (err: AWSError, data: RebootBrokerResponse) -> Unit = definedExternally): Request<RebootBrokerResponse, AWSError>
    open fun updateBroker(params: UpdateBrokerRequest, callback: (err: AWSError, data: UpdateBrokerResponse) -> Unit = definedExternally): Request<UpdateBrokerResponse, AWSError>
    open fun updateBroker(callback: (err: AWSError, data: UpdateBrokerResponse) -> Unit = definedExternally): Request<UpdateBrokerResponse, AWSError>
    open fun updateConfiguration(params: UpdateConfigurationRequest, callback: (err: AWSError, data: UpdateConfigurationResponse) -> Unit = definedExternally): Request<UpdateConfigurationResponse, AWSError>
    open fun updateConfiguration(callback: (err: AWSError, data: UpdateConfigurationResponse) -> Unit = definedExternally): Request<UpdateConfigurationResponse, AWSError>
    open fun updateUser(params: UpdateUserRequest, callback: (err: AWSError, data: UpdateUserResponse) -> Unit = definedExternally): Request<UpdateUserResponse, AWSError>
    open fun updateUser(callback: (err: AWSError, data: UpdateUserResponse) -> Unit = definedExternally): Request<UpdateUserResponse, AWSError>
    interface AvailabilityZone {
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BrokerEngineType {
        var EngineType: String /* "ACTIVEMQ" | String */
        var EngineVersions: __listOfEngineVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BrokerInstance {
        var ConsoleURL: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Endpoints: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var IpAddress: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BrokerInstanceOption {
        var AvailabilityZones: __listOfAvailabilityZone?
            get() = definedExternally
            set(value) = definedExternally
        var EngineType: String /* "ACTIVEMQ" | String */
        var HostInstanceType: __string?
            get() = definedExternally
            set(value) = definedExternally
        var StorageType: String /* "EBS" | "EFS" | String */
        var SupportedDeploymentModes: __listOfDeploymentMode?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedEngineVersions: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BrokerSummary {
        var BrokerArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var BrokerId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var BrokerName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var BrokerState: String /* "CREATION_IN_PROGRESS" | "CREATION_FAILED" | "DELETION_IN_PROGRESS" | "RUNNING" | "REBOOT_IN_PROGRESS" | String */
        var Created: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentMode: String /* "SINGLE_INSTANCE" | "ACTIVE_STANDBY_MULTI_AZ" | String */
        var HostInstanceType: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Configuration {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Created: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EngineType: String /* "ACTIVEMQ" | String */
        var EngineVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestRevision: ConfigurationRevision?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigurationId {
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Revision: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigurationRevision {
        var Created: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Revision: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Configurations {
        var Current: ConfigurationId?
            get() = definedExternally
            set(value) = definedExternally
        var History: __listOfConfigurationId?
            get() = definedExternally
            set(value) = definedExternally
        var Pending: ConfigurationId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBrokerRequest {
        var AutoMinorVersionUpgrade: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var BrokerName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Configuration: ConfigurationId?
            get() = definedExternally
            set(value) = definedExternally
        var CreatorRequestId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentMode: String /* "SINGLE_INSTANCE" | "ACTIVE_STANDBY_MULTI_AZ" | String */
        var EncryptionOptions: EncryptionOptions?
            get() = definedExternally
            set(value) = definedExternally
        var EngineType: String /* "ACTIVEMQ" | String */
        var EngineVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HostInstanceType: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Logs: Logs?
            get() = definedExternally
            set(value) = definedExternally
        var MaintenanceWindowStartTime: WeeklyStartTime?
            get() = definedExternally
            set(value) = definedExternally
        var PubliclyAccessible: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroups: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var StorageType: String /* "EBS" | "EFS" | String */
        var SubnetIds: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Users: __listOfUser?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBrokerResponse {
        var BrokerArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var BrokerId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateConfigurationRequest {
        var EngineType: String /* "ACTIVEMQ" | String */
        var EngineVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateConfigurationResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Created: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestRevision: ConfigurationRevision?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTagsRequest {
        var ResourceArn: __string
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUserRequest {
        var BrokerId: __string
        var ConsoleAccess: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Groups: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Password: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Username: __string
    }
    interface CreateUserResponse
    interface DeleteBrokerRequest {
        var BrokerId: __string
    }
    interface DeleteBrokerResponse {
        var BrokerId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteTagsRequest {
        var ResourceArn: __string
        var TagKeys: __listOf__string
    }
    interface DeleteUserRequest {
        var BrokerId: __string
        var Username: __string
    }
    interface DeleteUserResponse
    interface DescribeBrokerEngineTypesRequest {
        var EngineType: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeBrokerEngineTypesResponse {
        var BrokerEngineTypes: __listOfBrokerEngineType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: __integerMin5Max100?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeBrokerInstanceOptionsRequest {
        var EngineType: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HostInstanceType: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var StorageType: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeBrokerInstanceOptionsResponse {
        var BrokerInstanceOptions: __listOfBrokerInstanceOption?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: __integerMin5Max100?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeBrokerRequest {
        var BrokerId: __string
    }
    interface DescribeBrokerResponse {
        var AutoMinorVersionUpgrade: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var BrokerArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var BrokerId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var BrokerInstances: __listOfBrokerInstance?
            get() = definedExternally
            set(value) = definedExternally
        var BrokerName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var BrokerState: String /* "CREATION_IN_PROGRESS" | "CREATION_FAILED" | "DELETION_IN_PROGRESS" | "RUNNING" | "REBOOT_IN_PROGRESS" | String */
        var Configurations: Configurations?
            get() = definedExternally
            set(value) = definedExternally
        var Created: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentMode: String /* "SINGLE_INSTANCE" | "ACTIVE_STANDBY_MULTI_AZ" | String */
        var EncryptionOptions: EncryptionOptions?
            get() = definedExternally
            set(value) = definedExternally
        var EngineType: String /* "ACTIVEMQ" | String */
        var EngineVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HostInstanceType: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Logs: LogsSummary?
            get() = definedExternally
            set(value) = definedExternally
        var MaintenanceWindowStartTime: WeeklyStartTime?
            get() = definedExternally
            set(value) = definedExternally
        var PendingEngineVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PendingHostInstanceType: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PendingSecurityGroups: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var PubliclyAccessible: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroups: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var StorageType: String /* "EBS" | "EFS" | String */
        var SubnetIds: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Users: __listOfUserSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConfigurationRequest {
        var ConfigurationId: __string
    }
    interface DescribeConfigurationResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Created: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EngineType: String /* "ACTIVEMQ" | String */
        var EngineVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestRevision: ConfigurationRevision?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConfigurationRevisionRequest {
        var ConfigurationId: __string
        var ConfigurationRevision: __string
    }
    interface DescribeConfigurationRevisionResponse {
        var ConfigurationId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Created: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var Data: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUserRequest {
        var BrokerId: __string
        var Username: __string
    }
    interface DescribeUserResponse {
        var BrokerId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ConsoleAccess: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Groups: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Pending: UserPendingChanges?
            get() = definedExternally
            set(value) = definedExternally
        var Username: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EncryptionOptions {
        var KmsKeyId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var UseAwsOwnedKey: __boolean
    }
    interface EngineVersion {
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBrokersRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBrokersResponse {
        var BrokerSummaries: __listOfBrokerSummary?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConfigurationRevisionsRequest {
        var ConfigurationId: __string
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConfigurationRevisionsResponse {
        var ConfigurationId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Revisions: __listOfConfigurationRevision?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConfigurationsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConfigurationsResponse {
        var Configurations: __listOfConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsRequest {
        var ResourceArn: __string
    }
    interface ListTagsResponse {
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUsersRequest {
        var BrokerId: __string
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUsersResponse {
        var BrokerId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: __integerMin5Max100?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Users: __listOfUserSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Logs {
        var Audit: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var General: __boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogsSummary {
        var Audit: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AuditLogGroup: __string?
            get() = definedExternally
            set(value) = definedExternally
        var General: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var GeneralLogGroup: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Pending: PendingLogs?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PendingLogs {
        var Audit: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var General: __boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RebootBrokerRequest {
        var BrokerId: __string
    }
    interface RebootBrokerResponse
    interface SanitizationWarning {
        var AttributeName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ElementName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Reason: String /* "DISALLOWED_ELEMENT_REMOVED" | "DISALLOWED_ATTRIBUTE_REMOVED" | "INVALID_ATTRIBUTE_VALUE_REMOVED" | String */
    }
    interface UpdateBrokerRequest {
        var AutoMinorVersionUpgrade: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var BrokerId: __string
        var Configuration: ConfigurationId?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HostInstanceType: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Logs: Logs?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroups: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateBrokerResponse {
        var AutoMinorVersionUpgrade: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var BrokerId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Configuration: ConfigurationId?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HostInstanceType: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Logs: Logs?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroups: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateConfigurationRequest {
        var ConfigurationId: __string
        var Data: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateConfigurationResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Created: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestRevision: ConfigurationRevision?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Warnings: __listOfSanitizationWarning?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateUserRequest {
        var BrokerId: __string
        var ConsoleAccess: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Groups: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Password: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Username: __string
    }
    interface UpdateUserResponse
    interface User {
        var ConsoleAccess: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Groups: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Password: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Username: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserPendingChanges {
        var ConsoleAccess: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Groups: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var PendingChange: String /* "CREATE" | "UPDATE" | "DELETE" | String */
    }
    interface UserSummary {
        var PendingChange: String /* "CREATE" | "UPDATE" | "DELETE" | String */
        var Username: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WeeklyStartTime {
        var DayOfWeek: String /* "MONDAY" | "TUESDAY" | "WEDNESDAY" | "THURSDAY" | "FRIDAY" | "SATURDAY" | "SUNDAY" | String */
        var TimeOfDay: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TimeZone: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface __mapOf__string {
        @nativeGetter
        operator fun get(key: String): __string?
        @nativeSetter
        operator fun set(key: String, value: __string)
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-11-27" | "latest" | String */
    }
}