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
import Kafka.BrokerEBSVolumeInfo
import Kafka.ClusterInfo
import Kafka.ClusterOperationInfo
import Kafka.Configuration
import Kafka.ConfigurationRevision
import Kafka.KafkaVersion
import Kafka.NodeInfo
import Kafka.CreateClusterRequest
import Kafka.CreateClusterResponse
import Kafka.CreateConfigurationRequest
import Kafka.CreateConfigurationResponse
import Kafka.DeleteClusterRequest
import Kafka.DeleteClusterResponse
import Kafka.DescribeClusterRequest
import Kafka.DescribeClusterResponse
import Kafka.DescribeClusterOperationRequest
import Kafka.DescribeClusterOperationResponse
import Kafka.DescribeConfigurationRequest
import Kafka.DescribeConfigurationResponse
import Kafka.DescribeConfigurationRevisionRequest
import Kafka.DescribeConfigurationRevisionResponse
import Kafka.GetBootstrapBrokersRequest
import Kafka.GetBootstrapBrokersResponse
import Kafka.ListClusterOperationsRequest
import Kafka.ListClusterOperationsResponse
import Kafka.ListClustersRequest
import Kafka.ListClustersResponse
import Kafka.ListConfigurationRevisionsRequest
import Kafka.ListConfigurationRevisionsResponse
import Kafka.ListConfigurationsRequest
import Kafka.ListConfigurationsResponse
import Kafka.ListKafkaVersionsRequest
import Kafka.ListKafkaVersionsResponse
import Kafka.ListNodesRequest
import Kafka.ListNodesResponse
import Kafka.ListTagsForResourceRequest
import Kafka.ListTagsForResourceResponse
import Kafka.TagResourceRequest
import Kafka.UntagResourceRequest
import Kafka.UpdateBrokerCountRequest
import Kafka.UpdateBrokerCountResponse
import Kafka.UpdateBrokerStorageRequest
import Kafka.UpdateBrokerStorageResponse
import Kafka.UpdateClusterConfigurationRequest
import Kafka.UpdateClusterConfigurationResponse
import Kafka.UpdateMonitoringRequest
import Kafka.UpdateMonitoringResponse
import Kafka.CloudWatchLogs
import Kafka.Firehose
import Kafka.S3
import Kafka.StorageInfo
import Kafka.BrokerSoftwareInfo
import Kafka.Tls
import Kafka.BrokerNodeGroupInfo
import Kafka.ClientAuthentication
import Kafka.EncryptionInfo
import Kafka.OpenMonitoring
import Kafka.LoggingInfo
import Kafka.StateInfo
import Kafka.__mapOf__string
import Kafka.ErrorInfo
import Kafka.MutableClusterInfo
import Kafka.ConfigurationInfo
import Kafka.OpenMonitoringInfo
import Kafka.EncryptionAtRest
import Kafka.EncryptionInTransit
import Kafka.BrokerLogs
import Kafka.Prometheus
import Kafka.PrometheusInfo
import Kafka.JmxExporter
import Kafka.NodeExporter
import Kafka.JmxExporterInfo
import Kafka.NodeExporterInfo
import Kafka.BrokerNodeInfo
import Kafka.ZookeeperNodeInfo
import Kafka.EBSStorageInfo

typealias MaxResults = Number

typealias __boolean = Boolean

typealias __double = Number

typealias __integer = Number

typealias __integerMin1Max15 = Number

typealias __integerMin1Max16384 = Number

typealias __listOfBrokerEBSVolumeInfo = Array<BrokerEBSVolumeInfo>

typealias __listOfClusterInfo = Array<ClusterInfo>

typealias __listOfClusterOperationInfo = Array<ClusterOperationInfo>

typealias __listOfConfiguration = Array<Configuration>

typealias __listOfConfigurationRevision = Array<ConfigurationRevision>

typealias __listOfKafkaVersion = Array<KafkaVersion>

typealias __listOfNodeInfo = Array<NodeInfo>

typealias __listOf__string = Array<__string>

typealias __long = Number

typealias __string = String

typealias __stringMin1Max128 = String

typealias __stringMin1Max64 = String

typealias __stringMin5Max32 = String

typealias __timestampIso8601 = Date

@JsModule("aws-sdk")
external open class Kafka(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Kafka.Types.ClientConfiguration */
    open fun createCluster(params: CreateClusterRequest, callback: (err: AWSError, data: CreateClusterResponse) -> Unit = definedExternally): Request<CreateClusterResponse, AWSError>
    open fun createCluster(callback: (err: AWSError, data: CreateClusterResponse) -> Unit = definedExternally): Request<CreateClusterResponse, AWSError>
    open fun createConfiguration(params: CreateConfigurationRequest, callback: (err: AWSError, data: CreateConfigurationResponse) -> Unit = definedExternally): Request<CreateConfigurationResponse, AWSError>
    open fun createConfiguration(callback: (err: AWSError, data: CreateConfigurationResponse) -> Unit = definedExternally): Request<CreateConfigurationResponse, AWSError>
    open fun deleteCluster(params: DeleteClusterRequest, callback: (err: AWSError, data: DeleteClusterResponse) -> Unit = definedExternally): Request<DeleteClusterResponse, AWSError>
    open fun deleteCluster(callback: (err: AWSError, data: DeleteClusterResponse) -> Unit = definedExternally): Request<DeleteClusterResponse, AWSError>
    open fun describeCluster(params: DescribeClusterRequest, callback: (err: AWSError, data: DescribeClusterResponse) -> Unit = definedExternally): Request<DescribeClusterResponse, AWSError>
    open fun describeCluster(callback: (err: AWSError, data: DescribeClusterResponse) -> Unit = definedExternally): Request<DescribeClusterResponse, AWSError>
    open fun describeClusterOperation(params: DescribeClusterOperationRequest, callback: (err: AWSError, data: DescribeClusterOperationResponse) -> Unit = definedExternally): Request<DescribeClusterOperationResponse, AWSError>
    open fun describeClusterOperation(callback: (err: AWSError, data: DescribeClusterOperationResponse) -> Unit = definedExternally): Request<DescribeClusterOperationResponse, AWSError>
    open fun describeConfiguration(params: DescribeConfigurationRequest, callback: (err: AWSError, data: DescribeConfigurationResponse) -> Unit = definedExternally): Request<DescribeConfigurationResponse, AWSError>
    open fun describeConfiguration(callback: (err: AWSError, data: DescribeConfigurationResponse) -> Unit = definedExternally): Request<DescribeConfigurationResponse, AWSError>
    open fun describeConfigurationRevision(params: DescribeConfigurationRevisionRequest, callback: (err: AWSError, data: DescribeConfigurationRevisionResponse) -> Unit = definedExternally): Request<DescribeConfigurationRevisionResponse, AWSError>
    open fun describeConfigurationRevision(callback: (err: AWSError, data: DescribeConfigurationRevisionResponse) -> Unit = definedExternally): Request<DescribeConfigurationRevisionResponse, AWSError>
    open fun getBootstrapBrokers(params: GetBootstrapBrokersRequest, callback: (err: AWSError, data: GetBootstrapBrokersResponse) -> Unit = definedExternally): Request<GetBootstrapBrokersResponse, AWSError>
    open fun getBootstrapBrokers(callback: (err: AWSError, data: GetBootstrapBrokersResponse) -> Unit = definedExternally): Request<GetBootstrapBrokersResponse, AWSError>
    open fun listClusterOperations(params: ListClusterOperationsRequest, callback: (err: AWSError, data: ListClusterOperationsResponse) -> Unit = definedExternally): Request<ListClusterOperationsResponse, AWSError>
    open fun listClusterOperations(callback: (err: AWSError, data: ListClusterOperationsResponse) -> Unit = definedExternally): Request<ListClusterOperationsResponse, AWSError>
    open fun listClusters(params: ListClustersRequest, callback: (err: AWSError, data: ListClustersResponse) -> Unit = definedExternally): Request<ListClustersResponse, AWSError>
    open fun listClusters(callback: (err: AWSError, data: ListClustersResponse) -> Unit = definedExternally): Request<ListClustersResponse, AWSError>
    open fun listConfigurationRevisions(params: ListConfigurationRevisionsRequest, callback: (err: AWSError, data: ListConfigurationRevisionsResponse) -> Unit = definedExternally): Request<ListConfigurationRevisionsResponse, AWSError>
    open fun listConfigurationRevisions(callback: (err: AWSError, data: ListConfigurationRevisionsResponse) -> Unit = definedExternally): Request<ListConfigurationRevisionsResponse, AWSError>
    open fun listConfigurations(params: ListConfigurationsRequest, callback: (err: AWSError, data: ListConfigurationsResponse) -> Unit = definedExternally): Request<ListConfigurationsResponse, AWSError>
    open fun listConfigurations(callback: (err: AWSError, data: ListConfigurationsResponse) -> Unit = definedExternally): Request<ListConfigurationsResponse, AWSError>
    open fun listKafkaVersions(params: ListKafkaVersionsRequest, callback: (err: AWSError, data: ListKafkaVersionsResponse) -> Unit = definedExternally): Request<ListKafkaVersionsResponse, AWSError>
    open fun listKafkaVersions(callback: (err: AWSError, data: ListKafkaVersionsResponse) -> Unit = definedExternally): Request<ListKafkaVersionsResponse, AWSError>
    open fun listNodes(params: ListNodesRequest, callback: (err: AWSError, data: ListNodesResponse) -> Unit = definedExternally): Request<ListNodesResponse, AWSError>
    open fun listNodes(callback: (err: AWSError, data: ListNodesResponse) -> Unit = definedExternally): Request<ListNodesResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateBrokerCount(params: UpdateBrokerCountRequest, callback: (err: AWSError, data: UpdateBrokerCountResponse) -> Unit = definedExternally): Request<UpdateBrokerCountResponse, AWSError>
    open fun updateBrokerCount(callback: (err: AWSError, data: UpdateBrokerCountResponse) -> Unit = definedExternally): Request<UpdateBrokerCountResponse, AWSError>
    open fun updateBrokerStorage(params: UpdateBrokerStorageRequest, callback: (err: AWSError, data: UpdateBrokerStorageResponse) -> Unit = definedExternally): Request<UpdateBrokerStorageResponse, AWSError>
    open fun updateBrokerStorage(callback: (err: AWSError, data: UpdateBrokerStorageResponse) -> Unit = definedExternally): Request<UpdateBrokerStorageResponse, AWSError>
    open fun updateClusterConfiguration(params: UpdateClusterConfigurationRequest, callback: (err: AWSError, data: UpdateClusterConfigurationResponse) -> Unit = definedExternally): Request<UpdateClusterConfigurationResponse, AWSError>
    open fun updateClusterConfiguration(callback: (err: AWSError, data: UpdateClusterConfigurationResponse) -> Unit = definedExternally): Request<UpdateClusterConfigurationResponse, AWSError>
    open fun updateMonitoring(params: UpdateMonitoringRequest, callback: (err: AWSError, data: UpdateMonitoringResponse) -> Unit = definedExternally): Request<UpdateMonitoringResponse, AWSError>
    open fun updateMonitoring(callback: (err: AWSError, data: UpdateMonitoringResponse) -> Unit = definedExternally): Request<UpdateMonitoringResponse, AWSError>
    interface BrokerEBSVolumeInfo {
        var KafkaBrokerNodeId: __string
        var VolumeSizeGB: __integer
    }
    interface BrokerLogs {
        var CloudWatchLogs: CloudWatchLogs?
            get() = definedExternally
            set(value) = definedExternally
        var Firehose: Firehose?
            get() = definedExternally
            set(value) = definedExternally
        var S3: S3?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BrokerNodeGroupInfo {
        var BrokerAZDistribution: String /* "DEFAULT" | String */
        var ClientSubnets: __listOf__string
        var InstanceType: __stringMin5Max32
        var SecurityGroups: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var StorageInfo: StorageInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BrokerNodeInfo {
        var AttachedENIId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var BrokerId: __double?
            get() = definedExternally
            set(value) = definedExternally
        var ClientSubnet: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ClientVpcIpAddress: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentBrokerSoftwareInfo: BrokerSoftwareInfo?
            get() = definedExternally
            set(value) = definedExternally
        var Endpoints: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BrokerSoftwareInfo {
        var ConfigurationArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationRevision: __long?
            get() = definedExternally
            set(value) = definedExternally
        var KafkaVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientAuthentication {
        var Tls: Tls?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CloudWatchLogs {
        var Enabled: __boolean
        var LogGroup: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterInfo {
        var ActiveOperationArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var BrokerNodeGroupInfo: BrokerNodeGroupInfo?
            get() = definedExternally
            set(value) = definedExternally
        var ClientAuthentication: ClientAuthentication?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentBrokerSoftwareInfo: BrokerSoftwareInfo?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionInfo: EncryptionInfo?
            get() = definedExternally
            set(value) = definedExternally
        var EnhancedMonitoring: String /* "DEFAULT" | "PER_BROKER" | "PER_TOPIC_PER_BROKER" | String */
        var OpenMonitoring: OpenMonitoring?
            get() = definedExternally
            set(value) = definedExternally
        var LoggingInfo: LoggingInfo?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfBrokerNodes: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ACTIVE" | "CREATING" | "UPDATING" | "DELETING" | "FAILED" | String */
        var StateInfo: StateInfo?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var ZookeeperConnectString: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterOperationInfo {
        var ClientRequestId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorInfo: ErrorInfo?
            get() = definedExternally
            set(value) = definedExternally
        var OperationArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OperationState: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OperationType: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SourceClusterInfo: MutableClusterInfo?
            get() = definedExternally
            set(value) = definedExternally
        var TargetClusterInfo: MutableClusterInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Configuration {
        var Arn: __string
        var CreationTime: __timestampIso8601
        var Description: __string
        var KafkaVersions: __listOf__string
        var LatestRevision: ConfigurationRevision
        var Name: __string
    }
    interface ConfigurationInfo {
        var Arn: __string
        var Revision: __long
    }
    interface ConfigurationRevision {
        var CreationTime: __timestampIso8601
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Revision: __long
    }
    interface CreateClusterRequest {
        var BrokerNodeGroupInfo: BrokerNodeGroupInfo
        var ClientAuthentication: ClientAuthentication?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterName: __stringMin1Max64
        var ConfigurationInfo: ConfigurationInfo?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionInfo: EncryptionInfo?
            get() = definedExternally
            set(value) = definedExternally
        var EnhancedMonitoring: String /* "DEFAULT" | "PER_BROKER" | "PER_TOPIC_PER_BROKER" | String */
        var OpenMonitoring: OpenMonitoringInfo?
            get() = definedExternally
            set(value) = definedExternally
        var KafkaVersion: __stringMin1Max128
        var LoggingInfo: LoggingInfo?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfBrokerNodes: __integerMin1Max15
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClusterResponse {
        var ClusterArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ACTIVE" | "CREATING" | "UPDATING" | "DELETING" | "FAILED" | String */
    }
    interface CreateConfigurationRequest {
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var KafkaVersions: __listOf__string
        var Name: __string
        var ServerProperties: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateConfigurationResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var LatestRevision: ConfigurationRevision?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteClusterRequest {
        var ClusterArn: __string
        var CurrentVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteClusterResponse {
        var ClusterArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ACTIVE" | "CREATING" | "UPDATING" | "DELETING" | "FAILED" | String */
    }
    interface DescribeClusterOperationRequest {
        var ClusterOperationArn: __string
    }
    interface DescribeClusterOperationResponse {
        var ClusterOperationInfo: ClusterOperationInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeClusterRequest {
        var ClusterArn: __string
    }
    interface DescribeClusterResponse {
        var ClusterInfo: ClusterInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConfigurationRequest {
        var Arn: __string
    }
    interface DescribeConfigurationResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var KafkaVersions: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var LatestRevision: ConfigurationRevision?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConfigurationRevisionRequest {
        var Arn: __string
        var Revision: __long
    }
    interface DescribeConfigurationRevisionResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Revision: __long?
            get() = definedExternally
            set(value) = definedExternally
        var ServerProperties: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EBSStorageInfo {
        var VolumeSize: __integerMin1Max16384?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EncryptionAtRest {
        var DataVolumeKMSKeyId: __string
    }
    interface EncryptionInTransit {
        var ClientBroker: String /* "TLS" | "TLS_PLAINTEXT" | "PLAINTEXT" | String */
        var InCluster: __boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EncryptionInfo {
        var EncryptionAtRest: EncryptionAtRest?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionInTransit: EncryptionInTransit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ErrorInfo {
        var ErrorCode: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorString: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Firehose {
        var DeliveryStream: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: __boolean
    }
    interface GetBootstrapBrokersRequest {
        var ClusterArn: __string
    }
    interface GetBootstrapBrokersResponse {
        var BootstrapBrokerString: __string?
            get() = definedExternally
            set(value) = definedExternally
        var BootstrapBrokerStringTls: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KafkaVersion {
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "ACTIVE" | "DEPRECATED" | String */
    }
    interface ListClusterOperationsRequest {
        var ClusterArn: __string
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListClusterOperationsResponse {
        var ClusterOperationInfoList: __listOfClusterOperationInfo?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListClustersRequest {
        var ClusterNameFilter: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListClustersResponse {
        var ClusterInfoList: __listOfClusterInfo?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConfigurationRevisionsRequest {
        var Arn: __string
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConfigurationRevisionsResponse {
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
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListKafkaVersionsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListKafkaVersionsResponse {
        var KafkaVersions: __listOfKafkaVersion?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListNodesRequest {
        var ClusterArn: __string
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListNodesResponse {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NodeInfoList: __listOfNodeInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: __string
    }
    interface ListTagsForResourceResponse {
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoggingInfo {
        var BrokerLogs: BrokerLogs
    }
    interface MutableClusterInfo {
        var BrokerEBSVolumeInfo: __listOfBrokerEBSVolumeInfo?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationInfo: ConfigurationInfo?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfBrokerNodes: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var EnhancedMonitoring: String /* "DEFAULT" | "PER_BROKER" | "PER_TOPIC_PER_BROKER" | String */
        var OpenMonitoring: OpenMonitoring?
            get() = definedExternally
            set(value) = definedExternally
        var LoggingInfo: LoggingInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodeExporter {
        var EnabledInBroker: __boolean
    }
    interface NodeExporterInfo {
        var EnabledInBroker: __boolean
    }
    interface JmxExporter {
        var EnabledInBroker: __boolean
    }
    interface JmxExporterInfo {
        var EnabledInBroker: __boolean
    }
    interface OpenMonitoring {
        var Prometheus: Prometheus
    }
    interface OpenMonitoringInfo {
        var Prometheus: PrometheusInfo
    }
    interface Prometheus {
        var JmxExporter: JmxExporter?
            get() = definedExternally
            set(value) = definedExternally
        var NodeExporter: NodeExporter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PrometheusInfo {
        var JmxExporter: JmxExporterInfo?
            get() = definedExternally
            set(value) = definedExternally
        var NodeExporter: NodeExporterInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3 {
        var Bucket: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: __boolean
        var Prefix: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodeInfo {
        var AddedToClusterTime: __string?
            get() = definedExternally
            set(value) = definedExternally
        var BrokerNodeInfo: BrokerNodeInfo?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NodeARN: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NodeType: String /* "BROKER" | String */
        var ZookeeperNodeInfo: ZookeeperNodeInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StateInfo {
        var Code: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Message: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StorageInfo {
        var EbsStorageInfo: EBSStorageInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var ResourceArn: __string
        var Tags: __mapOf__string
    }
    interface Tls {
        var CertificateAuthorityArnList: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceRequest {
        var ResourceArn: __string
        var TagKeys: __listOf__string
    }
    interface UpdateBrokerCountRequest {
        var ClusterArn: __string
        var CurrentVersion: __string
        var TargetNumberOfBrokerNodes: __integerMin1Max15
    }
    interface UpdateBrokerCountResponse {
        var ClusterArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterOperationArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateBrokerStorageRequest {
        var ClusterArn: __string
        var CurrentVersion: __string
        var TargetBrokerEBSVolumeInfo: __listOfBrokerEBSVolumeInfo
    }
    interface UpdateBrokerStorageResponse {
        var ClusterArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterOperationArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateClusterConfigurationRequest {
        var ClusterArn: __string
        var ConfigurationInfo: ConfigurationInfo
        var CurrentVersion: __string
    }
    interface UpdateClusterConfigurationResponse {
        var ClusterArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterOperationArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMonitoringRequest {
        var ClusterArn: __string
        var CurrentVersion: __string
        var EnhancedMonitoring: String /* "DEFAULT" | "PER_BROKER" | "PER_TOPIC_PER_BROKER" | String */
        var OpenMonitoring: OpenMonitoringInfo?
            get() = definedExternally
            set(value) = definedExternally
        var LoggingInfo: LoggingInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMonitoringResponse {
        var ClusterArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterOperationArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ZookeeperNodeInfo {
        var AttachedENIId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ClientVpcIpAddress: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Endpoints: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var ZookeeperId: __double?
            get() = definedExternally
            set(value) = definedExternally
        var ZookeeperVersion: __string?
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
        var apiVersion: String /* "2018-11-14" | "latest" | String */
    }
}