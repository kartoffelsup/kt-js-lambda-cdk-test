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
import DocumentClient.AttributeDefinition
import DocumentClient.AutoScalingPolicyDescription
import DocumentClient.BackupSummary
import DocumentClient.ConsumedCapacity
import DocumentClient.ContributorInsightsSummary
import DocumentClient.Endpoint
import DocumentClient.GlobalSecondaryIndexAutoScalingUpdate
import DocumentClient.GlobalSecondaryIndexDescription
import DocumentClient.GlobalSecondaryIndex
import DocumentClient.GlobalSecondaryIndexUpdate
import DocumentClient.GlobalSecondaryIndexInfo
import DocumentClient.GlobalTableGlobalSecondaryIndexSettingsUpdate
import DocumentClient.GlobalTable
import DocumentClient.ItemCollectionMetrics
import DocumentClient.AttributeMap
import DocumentClient.ItemResponse
import DocumentClient.Key
import DocumentClient.KeySchemaElement
import DocumentClient.LocalSecondaryIndexDescription
import DocumentClient.LocalSecondaryIndex
import DocumentClient.LocalSecondaryIndexInfo
import DocumentClient.ReplicaAutoScalingDescription
import DocumentClient.ReplicaAutoScalingUpdate
import DocumentClient.ReplicaDescription
import DocumentClient.ReplicaGlobalSecondaryIndexAutoScalingDescription
import DocumentClient.ReplicaGlobalSecondaryIndexAutoScalingUpdate
import DocumentClient.ReplicaGlobalSecondaryIndexDescription
import DocumentClient.ReplicaGlobalSecondaryIndex
import DocumentClient.ReplicaGlobalSecondaryIndexSettingsDescription
import DocumentClient.ReplicaGlobalSecondaryIndexSettingsUpdate
import DocumentClient.Replica
import DocumentClient.ReplicaSettingsDescription
import DocumentClient.ReplicaSettingsUpdate
import DocumentClient.ReplicaUpdate
import DocumentClient.ReplicationGroupUpdate
import DocumentClient.Tag
import DocumentClient.TransactGetItem
import DocumentClient.TransactWriteItem
import DocumentClient.WriteRequest
import DocumentClient.CreateSetOptions
import DocumentClient.BatchGetItemInput
import DocumentClient.BatchGetItemOutput
import DocumentClient.BatchWriteItemInput
import DocumentClient.BatchWriteItemOutput
import DocumentClient.DeleteItemInput
import DocumentClient.DeleteItemOutput
import DocumentClient.GetItemInput
import DocumentClient.GetItemOutput
import DocumentClient.PutItemInput
import DocumentClient.PutItemOutput
import DocumentClient.QueryInput
import DocumentClient.QueryOutput
import DocumentClient.ScanInput
import DocumentClient.ScanOutput
import DocumentClient.UpdateItemInput
import DocumentClient.UpdateItemOutput
import DocumentClient.TransactGetItemsInput
import DocumentClient.TransactGetItemsOutput
import DocumentClient.TransactWriteItemsInput
import DocumentClient.TransactWriteItemsOutput
import DocumentClient.ConverterOptions
import DocumentClient.AttributeValueUpdate
import DocumentClient.AutoScalingTargetTrackingScalingPolicyConfigurationDescription
import DocumentClient.AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
import DocumentClient.AutoScalingPolicyUpdate
import DocumentClient.BackupDetails
import DocumentClient.SourceTableDetails
import DocumentClient.SourceTableFeatureDetails
import DocumentClient.BatchGetRequestMap
import DocumentClient.BatchGetResponseMap
import DocumentClient.KeysAndAttributes
import DocumentClient.BatchWriteItemRequestMap
import DocumentClient.ItemCollectionMetricsPerTable
import DocumentClient.ExpressionAttributeNameMap
import DocumentClient.ExpressionAttributeValueMap
import DocumentClient.Capacity
import DocumentClient.SecondaryIndexesCapacityMap
import DocumentClient.PointInTimeRecoveryDescription
import DocumentClient.Projection
import DocumentClient.ProvisionedThroughput
import DocumentClient.GlobalTableDescription
import DocumentClient.ProvisionedThroughputOverride
import DocumentClient.StreamSpecification
import DocumentClient.SSESpecification
import DocumentClient.TableDescription
import DocumentClient.BackupDescription
import DocumentClient.ExpectedAttributeMap
import DocumentClient.ContinuousBackupsDescription
import DocumentClient.FailureException
import DocumentClient.TableAutoScalingDescription
import DocumentClient.TimeToLiveDescription
import DocumentClient.ExpectedAttributeValue
import DocumentClient.Condition
import DocumentClient.AutoScalingSettingsUpdate
import DocumentClient.ProvisionedThroughputDescription
import DocumentClient.UpdateGlobalSecondaryIndexAction
import DocumentClient.CreateGlobalSecondaryIndexAction
import DocumentClient.DeleteGlobalSecondaryIndexAction
import DocumentClient.ItemCollectionKeyAttributeMap
import DocumentClient.PutItemInputAttributeMap
import DocumentClient.KeyConditions
import DocumentClient.FilterConditionMap
import DocumentClient.AutoScalingSettingsDescription
import DocumentClient.BillingModeSummary
import DocumentClient.CreateReplicaAction
import DocumentClient.DeleteReplicaAction
import DocumentClient.CreateReplicationGroupMemberAction
import DocumentClient.UpdateReplicationGroupMemberAction
import DocumentClient.DeleteReplicationGroupMemberAction
import DocumentClient.SSEDescription
import DocumentClient.RestoreSummary
import DocumentClient.ArchivalSummary
import DocumentClient.Get
import DocumentClient.ConditionCheck
import DocumentClient.Put
import DocumentClient.Delete
import DocumentClient.Update
import DocumentClient.PointInTimeRecoverySpecification
import DocumentClient.AttributeUpdates
import DocumentClient.TimeToLiveSpecification
import DocumentClient.PutRequest
import DocumentClient.DeleteRequest

typealias ArchivalReason = String

typealias AttributeDefinitions = Array<AttributeDefinition>

typealias AttributeName = String

typealias AttributeNameList = Array<AttributeName>

typealias AttributeValue = Any

typealias AttributeValueList = Array<AttributeValue>

typealias AutoScalingPolicyDescriptionList = Array<AutoScalingPolicyDescription>

typealias AutoScalingPolicyName = String

typealias AutoScalingRoleArn = String

typealias Backfilling = Boolean

typealias BackupArn = String

typealias BackupCreationDateTime = Date

typealias BackupName = String

typealias BackupSizeBytes = Number

typealias BackupSummaries = Array<BackupSummary>

typealias BackupsInputLimit = Number

typealias BinarySetAttributeValue = Array<dynamic /* Buffer | Uint8Array | Blob | String */>

typealias BooleanAttributeValue = Boolean

typealias BooleanObject = Boolean

typealias ClientRequestToken = String

typealias ConditionExpression = String

typealias ConsistentRead = Boolean

typealias ConsumedCapacityMultiple = Array<ConsumedCapacity>

typealias ConsumedCapacityUnits = Number

typealias ContributorInsightsRule = String

typealias ContributorInsightsRuleList = Array<ContributorInsightsRule>

typealias ContributorInsightsSummaries = Array<ContributorInsightsSummary>

typealias _Date = Date

typealias Double = Number

typealias Endpoints = Array<Endpoint>

typealias ExceptionDescription = String

typealias ExceptionName = String

typealias ExpressionAttributeNameVariable = String

typealias ExpressionAttributeValueVariable = String

typealias GlobalSecondaryIndexAutoScalingUpdateList = Array<GlobalSecondaryIndexAutoScalingUpdate>

typealias GlobalSecondaryIndexDescriptionList = Array<GlobalSecondaryIndexDescription>

typealias GlobalSecondaryIndexList = Array<GlobalSecondaryIndex>

typealias GlobalSecondaryIndexUpdateList = Array<GlobalSecondaryIndexUpdate>

typealias GlobalSecondaryIndexes = Array<GlobalSecondaryIndexInfo>

typealias GlobalTableArnString = String

typealias GlobalTableGlobalSecondaryIndexSettingsUpdateList = Array<GlobalTableGlobalSecondaryIndexSettingsUpdate>

typealias GlobalTableList = Array<GlobalTable>

typealias IndexName = String

typealias Integer = Number

typealias IntegerObject = Number

typealias ItemCollectionMetricsMultiple = Array<ItemCollectionMetrics>

typealias ItemCollectionSizeEstimateBound = Number

typealias ItemCollectionSizeEstimateRange = Array<ItemCollectionSizeEstimateBound>

typealias ItemCount = Number

typealias ItemList = Array<AttributeMap>

typealias ItemResponseList = Array<ItemResponse>

typealias KMSMasterKeyArn = String

typealias KMSMasterKeyId = String

typealias KeyExpression = String

typealias KeyList = Array<Key>

typealias KeySchema = Array<KeySchemaElement>

typealias KeySchemaAttributeName = String

typealias LastUpdateDateTime = Date

typealias ListAttributeValue = Array<AttributeValue>

typealias ListContributorInsightsLimit = Number

typealias ListTablesInputLimit = Number

typealias LocalSecondaryIndexDescriptionList = Array<LocalSecondaryIndexDescription>

typealias LocalSecondaryIndexList = Array<LocalSecondaryIndex>

typealias LocalSecondaryIndexes = Array<LocalSecondaryIndexInfo>

typealias Long = Number

typealias NextTokenString = String

typealias NonKeyAttributeName = String

typealias NonKeyAttributeNameList = Array<NonKeyAttributeName>

typealias NonNegativeLongObject = Number

typealias NullAttributeValue = Boolean

typealias NumberAttributeValue = String

typealias NumberSetAttributeValue = Array<NumberAttributeValue>

typealias PositiveIntegerObject = Number

typealias PositiveLongObject = Number

typealias ProjectionExpression = String

typealias RegionName = String

typealias ReplicaAutoScalingDescriptionList = Array<ReplicaAutoScalingDescription>

typealias ReplicaAutoScalingUpdateList = Array<ReplicaAutoScalingUpdate>

typealias ReplicaDescriptionList = Array<ReplicaDescription>

typealias ReplicaGlobalSecondaryIndexAutoScalingDescriptionList = Array<ReplicaGlobalSecondaryIndexAutoScalingDescription>

typealias ReplicaGlobalSecondaryIndexAutoScalingUpdateList = Array<ReplicaGlobalSecondaryIndexAutoScalingUpdate>

typealias ReplicaGlobalSecondaryIndexDescriptionList = Array<ReplicaGlobalSecondaryIndexDescription>

typealias ReplicaGlobalSecondaryIndexList = Array<ReplicaGlobalSecondaryIndex>

typealias ReplicaGlobalSecondaryIndexSettingsDescriptionList = Array<ReplicaGlobalSecondaryIndexSettingsDescription>

typealias ReplicaGlobalSecondaryIndexSettingsUpdateList = Array<ReplicaGlobalSecondaryIndexSettingsUpdate>

typealias ReplicaList = Array<Replica>

typealias ReplicaSettingsDescriptionList = Array<ReplicaSettingsDescription>

typealias ReplicaSettingsUpdateList = Array<ReplicaSettingsUpdate>

typealias ReplicaStatusDescription = String

typealias ReplicaStatusPercentProgress = String

typealias ReplicaUpdateList = Array<ReplicaUpdate>

typealias ReplicationGroupUpdateList = Array<ReplicationGroupUpdate>

typealias ResourceArnString = String

typealias RestoreInProgress = Boolean

typealias SSEEnabled = Boolean

typealias ScanSegment = Number

typealias ScanTotalSegments = Number

typealias StreamArn = String

typealias StreamEnabled = Boolean

typealias String = String

typealias StringAttributeValue = String

typealias StringSetAttributeValue = Array<StringAttributeValue>

typealias TableArn = String

typealias TableCreationDateTime = Date

typealias TableId = String

typealias TableName = String

typealias TableNameList = Array<TableName>

typealias TagKeyList = Array<TagKeyString>

typealias TagKeyString = String

typealias TagList = Array<Tag>

typealias TagValueString = String

typealias TimeRangeLowerBound = Date

typealias TimeRangeUpperBound = Date

typealias TimeToLiveAttributeName = String

typealias TimeToLiveEnabled = Boolean

typealias TransactGetItemList = Array<TransactGetItem>

typealias TransactWriteItemList = Array<TransactWriteItem>

typealias UpdateExpression = String

typealias WriteRequests = Array<WriteRequest>

external interface File

external open class DocumentClient(options: DocumentClient.DocumentClientOptions /* DocumentClient.DocumentClientOptions & DynamoDB.Types.ClientConfiguration */ = definedExternally) {
    open fun createSet(list: Array<Number>, options: CreateSetOptions = definedExternally): dynamic /* StringSet | NumberSet | BinarySet */
    open fun createSet(list: Array<String>, options: CreateSetOptions = definedExternally): dynamic /* StringSet | NumberSet | BinarySet */
    open fun createSet(list: Array<dynamic /* Buffer | File | Blob | ArrayBuffer | DataView | Int8Array | Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array | stream.Stream */>, options: CreateSetOptions = definedExternally): dynamic /* StringSet | NumberSet | BinarySet */
    open fun batchGet(params: BatchGetItemInput, callback: (err: AWSError, data: BatchGetItemOutput) -> Unit = definedExternally): Request<BatchGetItemOutput, AWSError>
    open fun batchWrite(params: BatchWriteItemInput, callback: (err: AWSError, data: BatchWriteItemOutput) -> Unit = definedExternally): Request<BatchWriteItemOutput, AWSError>
    open fun delete(params: DeleteItemInput, callback: (err: AWSError, data: DeleteItemOutput) -> Unit = definedExternally): Request<DeleteItemOutput, AWSError>
    open fun get(params: GetItemInput, callback: (err: AWSError, data: GetItemOutput) -> Unit = definedExternally): Request<GetItemOutput, AWSError>
    open fun put(params: PutItemInput, callback: (err: AWSError, data: PutItemOutput) -> Unit = definedExternally): Request<PutItemOutput, AWSError>
    open fun query(params: QueryInput, callback: (err: AWSError, data: QueryOutput) -> Unit = definedExternally): Request<QueryOutput, AWSError>
    open fun scan(params: ScanInput, callback: (err: AWSError, data: ScanOutput) -> Unit = definedExternally): Request<ScanOutput, AWSError>
    open fun update(params: UpdateItemInput, callback: (err: AWSError, data: UpdateItemOutput) -> Unit = definedExternally): Request<UpdateItemOutput, AWSError>
    open fun transactGet(params: TransactGetItemsInput, callback: (err: AWSError, data: TransactGetItemsOutput) -> Unit = definedExternally): Request<TransactGetItemsOutput, AWSError>
    open fun transactWrite(params: TransactWriteItemsInput, callback: (err: AWSError, data: TransactWriteItemsOutput) -> Unit = definedExternally): Request<TransactWriteItemsOutput, AWSError>
    interface ConverterOptions {
        var convertEmptyValues: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var wrapNumbers: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentClientOptions : ConverterOptions {
        var params: Json?
            get() = definedExternally
            set(value) = definedExternally
        var service: Any?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSetOptions {
        var validate: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StringSet {
        var type: String /* 'String' */
        var values: Array<String>
    }
    interface NumberSet {
        var type: String /* 'Number' */
        var values: Array<Number>
    }
    interface BinarySet {
        var type: String /* 'Binary' */
        var values: Array<dynamic /* Buffer | File | Blob | ArrayBuffer | DataView | Int8Array | Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array | stream.Stream */>
    }
    interface Blob
    interface ArchivalSummary {
        var ArchivalDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var ArchivalReason: ArchivalReason?
            get() = definedExternally
            set(value) = definedExternally
        var ArchivalBackupArn: BackupArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttributeDefinition {
        var AttributeName: KeySchemaAttributeName
        var AttributeType: String /* "S" | "N" | "B" | String */
    }
    interface AttributeMap {
        @nativeGetter
        operator fun get(key: String): AttributeValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeValue)
    }
    interface AttributeUpdates {
        @nativeGetter
        operator fun get(key: String): AttributeValueUpdate?
        @nativeSetter
        operator fun set(key: String, value: AttributeValueUpdate)
    }
    interface AttributeValueUpdate {
        var Value: AttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var Action: String /* "ADD" | "PUT" | "DELETE" | String */
    }
    interface AutoScalingPolicyDescription {
        var PolicyName: AutoScalingPolicyName?
            get() = definedExternally
            set(value) = definedExternally
        var TargetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoScalingPolicyUpdate {
        var PolicyName: AutoScalingPolicyName?
            get() = definedExternally
            set(value) = definedExternally
        var TargetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
    }
    interface AutoScalingSettingsDescription {
        var MinimumUnits: PositiveLongObject?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumUnits: PositiveLongObject?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingDisabled: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ScalingPolicies: AutoScalingPolicyDescriptionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoScalingSettingsUpdate {
        var MinimumUnits: PositiveLongObject?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumUnits: PositiveLongObject?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingDisabled: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingRoleArn: AutoScalingRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var ScalingPolicyUpdate: AutoScalingPolicyUpdate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoScalingTargetTrackingScalingPolicyConfigurationDescription {
        var DisableScaleIn: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var ScaleInCooldown: IntegerObject?
            get() = definedExternally
            set(value) = definedExternally
        var ScaleOutCooldown: IntegerObject?
            get() = definedExternally
            set(value) = definedExternally
        var TargetValue: Double
    }
    interface AutoScalingTargetTrackingScalingPolicyConfigurationUpdate {
        var DisableScaleIn: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var ScaleInCooldown: IntegerObject?
            get() = definedExternally
            set(value) = definedExternally
        var ScaleOutCooldown: IntegerObject?
            get() = definedExternally
            set(value) = definedExternally
        var TargetValue: Double
    }
    interface BackupDescription {
        var BackupDetails: BackupDetails?
            get() = definedExternally
            set(value) = definedExternally
        var SourceTableDetails: SourceTableDetails?
            get() = definedExternally
            set(value) = definedExternally
        var SourceTableFeatureDetails: SourceTableFeatureDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BackupDetails {
        var BackupArn: BackupArn
        var BackupName: BackupName
        var BackupSizeBytes: BackupSizeBytes?
            get() = definedExternally
            set(value) = definedExternally
        var BackupStatus: String /* "CREATING" | "DELETED" | "AVAILABLE" | String */
        var BackupType: String /* "USER" | "SYSTEM" | "AWS_BACKUP" | String */
        var BackupCreationDateTime: BackupCreationDateTime
        var BackupExpiryDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BackupSummary {
        var TableName: TableName?
            get() = definedExternally
            set(value) = definedExternally
        var TableId: TableId?
            get() = definedExternally
            set(value) = definedExternally
        var TableArn: TableArn?
            get() = definedExternally
            set(value) = definedExternally
        var BackupArn: BackupArn?
            get() = definedExternally
            set(value) = definedExternally
        var BackupName: BackupName?
            get() = definedExternally
            set(value) = definedExternally
        var BackupCreationDateTime: BackupCreationDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var BackupExpiryDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var BackupStatus: String /* "CREATING" | "DELETED" | "AVAILABLE" | String */
        var BackupType: String /* "USER" | "SYSTEM" | "AWS_BACKUP" | String */
        var BackupSizeBytes: BackupSizeBytes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetItemInput {
        var RequestItems: BatchGetRequestMap
        var ReturnConsumedCapacity: String /* "INDEXES" | "TOTAL" | "NONE" | String */
    }
    interface BatchGetItemOutput {
        var Responses: BatchGetResponseMap?
            get() = definedExternally
            set(value) = definedExternally
        var UnprocessedKeys: BatchGetRequestMap?
            get() = definedExternally
            set(value) = definedExternally
        var ConsumedCapacity: ConsumedCapacityMultiple?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetRequestMap {
        @nativeGetter
        operator fun get(key: String): KeysAndAttributes?
        @nativeSetter
        operator fun set(key: String, value: KeysAndAttributes)
    }
    interface BatchGetResponseMap {
        @nativeGetter
        operator fun get(key: String): ItemList?
        @nativeSetter
        operator fun set(key: String, value: ItemList)
    }
    interface BatchWriteItemInput {
        var RequestItems: BatchWriteItemRequestMap
        var ReturnConsumedCapacity: String /* "INDEXES" | "TOTAL" | "NONE" | String */
        var ReturnItemCollectionMetrics: String /* "SIZE" | "NONE" | String */
    }
    interface BatchWriteItemOutput {
        var UnprocessedItems: BatchWriteItemRequestMap?
            get() = definedExternally
            set(value) = definedExternally
        var ItemCollectionMetrics: ItemCollectionMetricsPerTable?
            get() = definedExternally
            set(value) = definedExternally
        var ConsumedCapacity: ConsumedCapacityMultiple?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchWriteItemRequestMap {
        @nativeGetter
        operator fun get(key: String): WriteRequests?
        @nativeSetter
        operator fun set(key: String, value: WriteRequests)
    }
    interface BillingModeSummary {
        var BillingMode: String /* "PROVISIONED" | "PAY_PER_REQUEST" | String */
        var LastUpdateToPayPerRequestDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Capacity {
        var ReadCapacityUnits: ConsumedCapacityUnits?
            get() = definedExternally
            set(value) = definedExternally
        var WriteCapacityUnits: ConsumedCapacityUnits?
            get() = definedExternally
            set(value) = definedExternally
        var CapacityUnits: ConsumedCapacityUnits?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Condition {
        var AttributeValueList: AttributeValueList?
            get() = definedExternally
            set(value) = definedExternally
        var ComparisonOperator: String /* "EQ" | "NE" | "IN" | "LE" | "LT" | "GE" | "GT" | "BETWEEN" | "NOT_NULL" | "NULL" | "CONTAINS" | "NOT_CONTAINS" | "BEGINS_WITH" | String */
    }
    interface ConditionCheck {
        var Key: Key
        var TableName: TableName
        var ConditionExpression: ConditionExpression
        var ExpressionAttributeNames: ExpressionAttributeNameMap?
            get() = definedExternally
            set(value) = definedExternally
        var ExpressionAttributeValues: ExpressionAttributeValueMap?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnValuesOnConditionCheckFailure: String /* "ALL_OLD" | "NONE" | String */
    }
    interface ConsumedCapacity {
        var TableName: TableName?
            get() = definedExternally
            set(value) = definedExternally
        var CapacityUnits: ConsumedCapacityUnits?
            get() = definedExternally
            set(value) = definedExternally
        var ReadCapacityUnits: ConsumedCapacityUnits?
            get() = definedExternally
            set(value) = definedExternally
        var WriteCapacityUnits: ConsumedCapacityUnits?
            get() = definedExternally
            set(value) = definedExternally
        var Table: Capacity?
            get() = definedExternally
            set(value) = definedExternally
        var LocalSecondaryIndexes: SecondaryIndexesCapacityMap?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalSecondaryIndexes: SecondaryIndexesCapacityMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContinuousBackupsDescription {
        var ContinuousBackupsStatus: String /* "ENABLED" | "DISABLED" | String */
        var PointInTimeRecoveryDescription: PointInTimeRecoveryDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContributorInsightsSummary {
        var TableName: TableName?
            get() = definedExternally
            set(value) = definedExternally
        var IndexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var ContributorInsightsStatus: String /* "ENABLING" | "ENABLED" | "DISABLING" | "DISABLED" | "FAILED" | String */
    }
    interface CreateBackupInput {
        var TableName: TableName
        var BackupName: BackupName
    }
    interface CreateBackupOutput {
        var BackupDetails: BackupDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGlobalSecondaryIndexAction {
        var IndexName: IndexName
        var KeySchema: KeySchema
        var Projection: Projection
        var ProvisionedThroughput: ProvisionedThroughput?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGlobalTableInput {
        var GlobalTableName: TableName
        var ReplicationGroup: ReplicaList
    }
    interface CreateGlobalTableOutput {
        var GlobalTableDescription: GlobalTableDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateReplicaAction {
        var RegionName: RegionName
    }
    interface CreateReplicationGroupMemberAction {
        var RegionName: RegionName
        var KMSMasterKeyId: KMSMasterKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedThroughputOverride: ProvisionedThroughputOverride?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalSecondaryIndexes: ReplicaGlobalSecondaryIndexList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTableInput {
        var AttributeDefinitions: AttributeDefinitions
        var TableName: TableName
        var KeySchema: KeySchema
        var LocalSecondaryIndexes: LocalSecondaryIndexList?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalSecondaryIndexes: GlobalSecondaryIndexList?
            get() = definedExternally
            set(value) = definedExternally
        var BillingMode: String /* "PROVISIONED" | "PAY_PER_REQUEST" | String */
        var ProvisionedThroughput: ProvisionedThroughput?
            get() = definedExternally
            set(value) = definedExternally
        var StreamSpecification: StreamSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var SSESpecification: SSESpecification?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTableOutput {
        var TableDescription: TableDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Delete {
        var Key: Key
        var TableName: TableName
        var ConditionExpression: ConditionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var ExpressionAttributeNames: ExpressionAttributeNameMap?
            get() = definedExternally
            set(value) = definedExternally
        var ExpressionAttributeValues: ExpressionAttributeValueMap?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnValuesOnConditionCheckFailure: String /* "ALL_OLD" | "NONE" | String */
    }
    interface DeleteBackupInput {
        var BackupArn: BackupArn
    }
    interface DeleteBackupOutput {
        var BackupDescription: BackupDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteGlobalSecondaryIndexAction {
        var IndexName: IndexName
    }
    interface DeleteItemInput {
        var TableName: TableName
        var Key: Key
        var Expected: ExpectedAttributeMap?
            get() = definedExternally
            set(value) = definedExternally
        var ConditionalOperator: String /* "AND" | "OR" | String */
        var ReturnValues: String /* "NONE" | "ALL_OLD" | "UPDATED_OLD" | "ALL_NEW" | "UPDATED_NEW" | String */
        var ReturnConsumedCapacity: String /* "INDEXES" | "TOTAL" | "NONE" | String */
        var ReturnItemCollectionMetrics: String /* "SIZE" | "NONE" | String */
        var ConditionExpression: ConditionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var ExpressionAttributeNames: ExpressionAttributeNameMap?
            get() = definedExternally
            set(value) = definedExternally
        var ExpressionAttributeValues: ExpressionAttributeValueMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteItemOutput {
        var Attributes: AttributeMap?
            get() = definedExternally
            set(value) = definedExternally
        var ConsumedCapacity: ConsumedCapacity?
            get() = definedExternally
            set(value) = definedExternally
        var ItemCollectionMetrics: ItemCollectionMetrics?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteReplicaAction {
        var RegionName: RegionName
    }
    interface DeleteReplicationGroupMemberAction {
        var RegionName: RegionName
    }
    interface DeleteRequest {
        var Key: Key
    }
    interface DeleteTableInput {
        var TableName: TableName
    }
    interface DeleteTableOutput {
        var TableDescription: TableDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeBackupInput {
        var BackupArn: BackupArn
    }
    interface DescribeBackupOutput {
        var BackupDescription: BackupDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeContinuousBackupsInput {
        var TableName: TableName
    }
    interface DescribeContinuousBackupsOutput {
        var ContinuousBackupsDescription: ContinuousBackupsDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeContributorInsightsInput {
        var TableName: TableName
        var IndexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeContributorInsightsOutput {
        var TableName: TableName?
            get() = definedExternally
            set(value) = definedExternally
        var IndexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var ContributorInsightsRuleList: ContributorInsightsRuleList?
            get() = definedExternally
            set(value) = definedExternally
        var ContributorInsightsStatus: String /* "ENABLING" | "ENABLED" | "DISABLING" | "DISABLED" | "FAILED" | String */
        var LastUpdateDateTime: LastUpdateDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var FailureException: FailureException?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEndpointsRequest
    interface DescribeEndpointsResponse {
        var Endpoints: Endpoints
    }
    interface DescribeGlobalTableInput {
        var GlobalTableName: TableName
    }
    interface DescribeGlobalTableOutput {
        var GlobalTableDescription: GlobalTableDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeGlobalTableSettingsInput {
        var GlobalTableName: TableName
    }
    interface DescribeGlobalTableSettingsOutput {
        var GlobalTableName: TableName?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicaSettings: ReplicaSettingsDescriptionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLimitsInput
    interface DescribeLimitsOutput {
        var AccountMaxReadCapacityUnits: PositiveLongObject?
            get() = definedExternally
            set(value) = definedExternally
        var AccountMaxWriteCapacityUnits: PositiveLongObject?
            get() = definedExternally
            set(value) = definedExternally
        var TableMaxReadCapacityUnits: PositiveLongObject?
            get() = definedExternally
            set(value) = definedExternally
        var TableMaxWriteCapacityUnits: PositiveLongObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTableInput {
        var TableName: TableName
    }
    interface DescribeTableOutput {
        var Table: TableDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTableReplicaAutoScalingInput {
        var TableName: TableName
    }
    interface DescribeTableReplicaAutoScalingOutput {
        var TableAutoScalingDescription: TableAutoScalingDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTimeToLiveInput {
        var TableName: TableName
    }
    interface DescribeTimeToLiveOutput {
        var TimeToLiveDescription: TimeToLiveDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Endpoint {
        var Address: String
        var CachePeriodInMinutes: Long
    }
    interface ExpectedAttributeMap {
        @nativeGetter
        operator fun get(key: String): ExpectedAttributeValue?
        @nativeSetter
        operator fun set(key: String, value: ExpectedAttributeValue)
    }
    interface ExpectedAttributeValue {
        var Value: AttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var Exists: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var ComparisonOperator: String /* "EQ" | "NE" | "IN" | "LE" | "LT" | "GE" | "GT" | "BETWEEN" | "NOT_NULL" | "NULL" | "CONTAINS" | "NOT_CONTAINS" | "BEGINS_WITH" | String */
        var AttributeValueList: AttributeValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExpressionAttributeNameMap {
        @nativeGetter
        operator fun get(key: String): AttributeName?
        @nativeSetter
        operator fun set(key: String, value: AttributeName)
    }
    interface ExpressionAttributeValueMap {
        @nativeGetter
        operator fun get(key: String): AttributeValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeValue)
    }
    interface FailureException {
        var ExceptionName: ExceptionName?
            get() = definedExternally
            set(value) = definedExternally
        var ExceptionDescription: ExceptionDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FilterConditionMap {
        @nativeGetter
        operator fun get(key: String): Condition?
        @nativeSetter
        operator fun set(key: String, value: Condition)
    }
    interface Get {
        var Key: Key
        var TableName: TableName
        var ProjectionExpression: ProjectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var ExpressionAttributeNames: ExpressionAttributeNameMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetItemInput {
        var TableName: TableName
        var Key: Key
        var AttributesToGet: AttributeNameList?
            get() = definedExternally
            set(value) = definedExternally
        var ConsistentRead: ConsistentRead?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnConsumedCapacity: String /* "INDEXES" | "TOTAL" | "NONE" | String */
        var ProjectionExpression: ProjectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var ExpressionAttributeNames: ExpressionAttributeNameMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetItemOutput {
        var Item: AttributeMap?
            get() = definedExternally
            set(value) = definedExternally
        var ConsumedCapacity: ConsumedCapacity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GlobalSecondaryIndex {
        var IndexName: IndexName
        var KeySchema: KeySchema
        var Projection: Projection
        var ProvisionedThroughput: ProvisionedThroughput?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GlobalSecondaryIndexAutoScalingUpdate {
        var IndexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedWriteCapacityAutoScalingUpdate: AutoScalingSettingsUpdate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GlobalSecondaryIndexDescription {
        var IndexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var KeySchema: KeySchema?
            get() = definedExternally
            set(value) = definedExternally
        var Projection: Projection?
            get() = definedExternally
            set(value) = definedExternally
        var IndexStatus: String /* "CREATING" | "UPDATING" | "DELETING" | "ACTIVE" | String */
        var Backfilling: Backfilling?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedThroughput: ProvisionedThroughputDescription?
            get() = definedExternally
            set(value) = definedExternally
        var IndexSizeBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var ItemCount: Long?
            get() = definedExternally
            set(value) = definedExternally
        var IndexArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GlobalSecondaryIndexInfo {
        var IndexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var KeySchema: KeySchema?
            get() = definedExternally
            set(value) = definedExternally
        var Projection: Projection?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedThroughput: ProvisionedThroughput?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GlobalSecondaryIndexUpdate {
        var Update: UpdateGlobalSecondaryIndexAction?
            get() = definedExternally
            set(value) = definedExternally
        var Create: CreateGlobalSecondaryIndexAction?
            get() = definedExternally
            set(value) = definedExternally
        var Delete: DeleteGlobalSecondaryIndexAction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GlobalTable {
        var GlobalTableName: TableName?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicationGroup: ReplicaList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GlobalTableDescription {
        var ReplicationGroup: ReplicaDescriptionList?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalTableArn: GlobalTableArnString?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalTableStatus: String /* "CREATING" | "ACTIVE" | "DELETING" | "UPDATING" | String */
        var GlobalTableName: TableName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GlobalTableGlobalSecondaryIndexSettingsUpdate {
        var IndexName: IndexName
        var ProvisionedWriteCapacityUnits: PositiveLongObject?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedWriteCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ItemCollectionKeyAttributeMap {
        @nativeGetter
        operator fun get(key: String): AttributeValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeValue)
    }
    interface ItemCollectionMetrics {
        var ItemCollectionKey: ItemCollectionKeyAttributeMap?
            get() = definedExternally
            set(value) = definedExternally
        var SizeEstimateRangeGB: ItemCollectionSizeEstimateRange?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ItemCollectionMetricsPerTable {
        @nativeGetter
        operator fun get(key: String): ItemCollectionMetricsMultiple?
        @nativeSetter
        operator fun set(key: String, value: ItemCollectionMetricsMultiple)
    }
    interface ItemResponse {
        var Item: AttributeMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Key {
        @nativeGetter
        operator fun get(key: String): AttributeValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeValue)
    }
    interface KeyConditions {
        @nativeGetter
        operator fun get(key: String): Condition?
        @nativeSetter
        operator fun set(key: String, value: Condition)
    }
    interface KeySchemaElement {
        var AttributeName: KeySchemaAttributeName
        var KeyType: String /* "HASH" | "RANGE" | String */
    }
    interface KeysAndAttributes {
        var Keys: KeyList
        var AttributesToGet: AttributeNameList?
            get() = definedExternally
            set(value) = definedExternally
        var ConsistentRead: ConsistentRead?
            get() = definedExternally
            set(value) = definedExternally
        var ProjectionExpression: ProjectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var ExpressionAttributeNames: ExpressionAttributeNameMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBackupsInput {
        var TableName: TableName?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: BackupsInputLimit?
            get() = definedExternally
            set(value) = definedExternally
        var TimeRangeLowerBound: TimeRangeLowerBound?
            get() = definedExternally
            set(value) = definedExternally
        var TimeRangeUpperBound: TimeRangeUpperBound?
            get() = definedExternally
            set(value) = definedExternally
        var ExclusiveStartBackupArn: BackupArn?
            get() = definedExternally
            set(value) = definedExternally
        var BackupType: String /* "USER" | "SYSTEM" | "AWS_BACKUP" | "ALL" | String */
    }
    interface ListBackupsOutput {
        var BackupSummaries: BackupSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var LastEvaluatedBackupArn: BackupArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListContributorInsightsInput {
        var TableName: TableName?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextTokenString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ListContributorInsightsLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListContributorInsightsOutput {
        var ContributorInsightsSummaries: ContributorInsightsSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextTokenString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGlobalTablesInput {
        var ExclusiveStartGlobalTableName: TableName?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveIntegerObject?
            get() = definedExternally
            set(value) = definedExternally
        var RegionName: RegionName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGlobalTablesOutput {
        var GlobalTables: GlobalTableList?
            get() = definedExternally
            set(value) = definedExternally
        var LastEvaluatedGlobalTableName: TableName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTablesInput {
        var ExclusiveStartTableName: TableName?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: ListTablesInputLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTablesOutput {
        var TableNames: TableNameList?
            get() = definedExternally
            set(value) = definedExternally
        var LastEvaluatedTableName: TableName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsOfResourceInput {
        var ResourceArn: ResourceArnString
        var NextToken: NextTokenString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsOfResourceOutput {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextTokenString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LocalSecondaryIndex {
        var IndexName: IndexName
        var KeySchema: KeySchema
        var Projection: Projection
    }
    interface LocalSecondaryIndexDescription {
        var IndexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var KeySchema: KeySchema?
            get() = definedExternally
            set(value) = definedExternally
        var Projection: Projection?
            get() = definedExternally
            set(value) = definedExternally
        var IndexSizeBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var ItemCount: Long?
            get() = definedExternally
            set(value) = definedExternally
        var IndexArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LocalSecondaryIndexInfo {
        var IndexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var KeySchema: KeySchema?
            get() = definedExternally
            set(value) = definedExternally
        var Projection: Projection?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MapAttributeValue {
        @nativeGetter
        operator fun get(key: String): AttributeValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeValue)
    }
    interface PointInTimeRecoveryDescription {
        var PointInTimeRecoveryStatus: String /* "ENABLED" | "DISABLED" | String */
        var EarliestRestorableDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var LatestRestorableDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PointInTimeRecoverySpecification {
        var PointInTimeRecoveryEnabled: BooleanObject
    }
    interface Projection {
        var ProjectionType: String /* "ALL" | "KEYS_ONLY" | "INCLUDE" | String */
        var NonKeyAttributes: NonKeyAttributeNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProvisionedThroughput {
        var ReadCapacityUnits: PositiveLongObject
        var WriteCapacityUnits: PositiveLongObject
    }
    interface ProvisionedThroughputDescription {
        var LastIncreaseDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var LastDecreaseDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfDecreasesToday: PositiveLongObject?
            get() = definedExternally
            set(value) = definedExternally
        var ReadCapacityUnits: NonNegativeLongObject?
            get() = definedExternally
            set(value) = definedExternally
        var WriteCapacityUnits: NonNegativeLongObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProvisionedThroughputOverride {
        var ReadCapacityUnits: PositiveLongObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Put {
        var Item: PutItemInputAttributeMap
        var TableName: TableName
        var ConditionExpression: ConditionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var ExpressionAttributeNames: ExpressionAttributeNameMap?
            get() = definedExternally
            set(value) = definedExternally
        var ExpressionAttributeValues: ExpressionAttributeValueMap?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnValuesOnConditionCheckFailure: String /* "ALL_OLD" | "NONE" | String */
    }
    interface PutItemInput {
        var TableName: TableName
        var Item: PutItemInputAttributeMap
        var Expected: ExpectedAttributeMap?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnValues: String /* "NONE" | "ALL_OLD" | "UPDATED_OLD" | "ALL_NEW" | "UPDATED_NEW" | String */
        var ReturnConsumedCapacity: String /* "INDEXES" | "TOTAL" | "NONE" | String */
        var ReturnItemCollectionMetrics: String /* "SIZE" | "NONE" | String */
        var ConditionalOperator: String /* "AND" | "OR" | String */
        var ConditionExpression: ConditionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var ExpressionAttributeNames: ExpressionAttributeNameMap?
            get() = definedExternally
            set(value) = definedExternally
        var ExpressionAttributeValues: ExpressionAttributeValueMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutItemInputAttributeMap {
        @nativeGetter
        operator fun get(key: String): AttributeValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeValue)
    }
    interface PutItemOutput {
        var Attributes: AttributeMap?
            get() = definedExternally
            set(value) = definedExternally
        var ConsumedCapacity: ConsumedCapacity?
            get() = definedExternally
            set(value) = definedExternally
        var ItemCollectionMetrics: ItemCollectionMetrics?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutRequest {
        var Item: PutItemInputAttributeMap
    }
    interface QueryInput {
        var TableName: TableName
        var IndexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var Select: String /* "ALL_ATTRIBUTES" | "ALL_PROJECTED_ATTRIBUTES" | "SPECIFIC_ATTRIBUTES" | "COUNT" | String */
        var AttributesToGet: AttributeNameList?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveIntegerObject?
            get() = definedExternally
            set(value) = definedExternally
        var ConsistentRead: ConsistentRead?
            get() = definedExternally
            set(value) = definedExternally
        var KeyConditions: KeyConditions?
            get() = definedExternally
            set(value) = definedExternally
        var QueryFilter: FilterConditionMap?
            get() = definedExternally
            set(value) = definedExternally
        var ConditionalOperator: String /* "AND" | "OR" | String */
        var ScanIndexForward: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var ExclusiveStartKey: Key?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnConsumedCapacity: String /* "INDEXES" | "TOTAL" | "NONE" | String */
        var ProjectionExpression: ProjectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var FilterExpression: ConditionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var KeyConditionExpression: KeyExpression?
            get() = definedExternally
            set(value) = definedExternally
        var ExpressionAttributeNames: ExpressionAttributeNameMap?
            get() = definedExternally
            set(value) = definedExternally
        var ExpressionAttributeValues: ExpressionAttributeValueMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface QueryOutput {
        var Items: ItemList?
            get() = definedExternally
            set(value) = definedExternally
        var Count: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ScannedCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var LastEvaluatedKey: Key?
            get() = definedExternally
            set(value) = definedExternally
        var ConsumedCapacity: ConsumedCapacity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Replica {
        var RegionName: RegionName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplicaAutoScalingDescription {
        var RegionName: RegionName?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalSecondaryIndexes: ReplicaGlobalSecondaryIndexAutoScalingDescriptionList?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicaProvisionedReadCapacityAutoScalingSettings: AutoScalingSettingsDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicaProvisionedWriteCapacityAutoScalingSettings: AutoScalingSettingsDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicaStatus: String /* "CREATING" | "CREATION_FAILED" | "UPDATING" | "DELETING" | "ACTIVE" | String */
    }
    interface ReplicaAutoScalingUpdate {
        var RegionName: RegionName
        var ReplicaGlobalSecondaryIndexUpdates: ReplicaGlobalSecondaryIndexAutoScalingUpdateList?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicaProvisionedReadCapacityAutoScalingUpdate: AutoScalingSettingsUpdate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplicaDescription {
        var RegionName: RegionName?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicaStatus: String /* "CREATING" | "CREATION_FAILED" | "UPDATING" | "DELETING" | "ACTIVE" | String */
        var ReplicaStatusDescription: ReplicaStatusDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicaStatusPercentProgress: ReplicaStatusPercentProgress?
            get() = definedExternally
            set(value) = definedExternally
        var KMSMasterKeyId: KMSMasterKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedThroughputOverride: ProvisionedThroughputOverride?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalSecondaryIndexes: ReplicaGlobalSecondaryIndexDescriptionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplicaGlobalSecondaryIndex {
        var IndexName: IndexName
        var ProvisionedThroughputOverride: ProvisionedThroughputOverride?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplicaGlobalSecondaryIndexAutoScalingDescription {
        var IndexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var IndexStatus: String /* "CREATING" | "UPDATING" | "DELETING" | "ACTIVE" | String */
        var ProvisionedReadCapacityAutoScalingSettings: AutoScalingSettingsDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedWriteCapacityAutoScalingSettings: AutoScalingSettingsDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplicaGlobalSecondaryIndexAutoScalingUpdate {
        var IndexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedReadCapacityAutoScalingUpdate: AutoScalingSettingsUpdate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplicaGlobalSecondaryIndexDescription {
        var IndexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedThroughputOverride: ProvisionedThroughputOverride?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplicaGlobalSecondaryIndexSettingsDescription {
        var IndexName: IndexName
        var IndexStatus: String /* "CREATING" | "UPDATING" | "DELETING" | "ACTIVE" | String */
        var ProvisionedReadCapacityUnits: PositiveLongObject?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedReadCapacityAutoScalingSettings: AutoScalingSettingsDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedWriteCapacityUnits: PositiveLongObject?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedWriteCapacityAutoScalingSettings: AutoScalingSettingsDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplicaGlobalSecondaryIndexSettingsUpdate {
        var IndexName: IndexName
        var ProvisionedReadCapacityUnits: PositiveLongObject?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedReadCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplicaSettingsDescription {
        var RegionName: RegionName
        var ReplicaStatus: String /* "CREATING" | "CREATION_FAILED" | "UPDATING" | "DELETING" | "ACTIVE" | String */
        var ReplicaBillingModeSummary: BillingModeSummary?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicaProvisionedReadCapacityUnits: NonNegativeLongObject?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicaProvisionedReadCapacityAutoScalingSettings: AutoScalingSettingsDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicaProvisionedWriteCapacityUnits: NonNegativeLongObject?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicaProvisionedWriteCapacityAutoScalingSettings: AutoScalingSettingsDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicaGlobalSecondaryIndexSettings: ReplicaGlobalSecondaryIndexSettingsDescriptionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplicaSettingsUpdate {
        var RegionName: RegionName
        var ReplicaProvisionedReadCapacityUnits: PositiveLongObject?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicaGlobalSecondaryIndexSettingsUpdate: ReplicaGlobalSecondaryIndexSettingsUpdateList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplicaUpdate {
        var Create: CreateReplicaAction?
            get() = definedExternally
            set(value) = definedExternally
        var Delete: DeleteReplicaAction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplicationGroupUpdate {
        var Create: CreateReplicationGroupMemberAction?
            get() = definedExternally
            set(value) = definedExternally
        var Update: UpdateReplicationGroupMemberAction?
            get() = definedExternally
            set(value) = definedExternally
        var Delete: DeleteReplicationGroupMemberAction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreSummary {
        var SourceBackupArn: BackupArn?
            get() = definedExternally
            set(value) = definedExternally
        var SourceTableArn: TableArn?
            get() = definedExternally
            set(value) = definedExternally
        var RestoreDateTime: _Date
        var RestoreInProgress: RestoreInProgress
    }
    interface RestoreTableFromBackupInput {
        var TargetTableName: TableName
        var BackupArn: BackupArn
        var BillingModeOverride: String /* "PROVISIONED" | "PAY_PER_REQUEST" | String */
        var GlobalSecondaryIndexOverride: GlobalSecondaryIndexList?
            get() = definedExternally
            set(value) = definedExternally
        var LocalSecondaryIndexOverride: LocalSecondaryIndexList?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedThroughputOverride: ProvisionedThroughput?
            get() = definedExternally
            set(value) = definedExternally
        var SSESpecificationOverride: SSESpecification?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreTableFromBackupOutput {
        var TableDescription: TableDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreTableToPointInTimeInput {
        var SourceTableArn: TableArn?
            get() = definedExternally
            set(value) = definedExternally
        var SourceTableName: TableName?
            get() = definedExternally
            set(value) = definedExternally
        var TargetTableName: TableName
        var UseLatestRestorableTime: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var RestoreDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var BillingModeOverride: String /* "PROVISIONED" | "PAY_PER_REQUEST" | String */
        var GlobalSecondaryIndexOverride: GlobalSecondaryIndexList?
            get() = definedExternally
            set(value) = definedExternally
        var LocalSecondaryIndexOverride: LocalSecondaryIndexList?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedThroughputOverride: ProvisionedThroughput?
            get() = definedExternally
            set(value) = definedExternally
        var SSESpecificationOverride: SSESpecification?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreTableToPointInTimeOutput {
        var TableDescription: TableDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SSEDescription {
        var Status: String /* "ENABLING" | "ENABLED" | "DISABLING" | "DISABLED" | "UPDATING" | String */
        var SSEType: String /* "AES256" | "KMS" | String */
        var KMSMasterKeyArn: KMSMasterKeyArn?
            get() = definedExternally
            set(value) = definedExternally
        var InaccessibleEncryptionDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SSESpecification {
        var Enabled: SSEEnabled?
            get() = definedExternally
            set(value) = definedExternally
        var SSEType: String /* "AES256" | "KMS" | String */
        var KMSMasterKeyId: KMSMasterKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScanInput {
        var TableName: TableName
        var IndexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var AttributesToGet: AttributeNameList?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveIntegerObject?
            get() = definedExternally
            set(value) = definedExternally
        var Select: String /* "ALL_ATTRIBUTES" | "ALL_PROJECTED_ATTRIBUTES" | "SPECIFIC_ATTRIBUTES" | "COUNT" | String */
        var ScanFilter: FilterConditionMap?
            get() = definedExternally
            set(value) = definedExternally
        var ConditionalOperator: String /* "AND" | "OR" | String */
        var ExclusiveStartKey: Key?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnConsumedCapacity: String /* "INDEXES" | "TOTAL" | "NONE" | String */
        var TotalSegments: ScanTotalSegments?
            get() = definedExternally
            set(value) = definedExternally
        var Segment: ScanSegment?
            get() = definedExternally
            set(value) = definedExternally
        var ProjectionExpression: ProjectionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var FilterExpression: ConditionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var ExpressionAttributeNames: ExpressionAttributeNameMap?
            get() = definedExternally
            set(value) = definedExternally
        var ExpressionAttributeValues: ExpressionAttributeValueMap?
            get() = definedExternally
            set(value) = definedExternally
        var ConsistentRead: ConsistentRead?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScanOutput {
        var Items: ItemList?
            get() = definedExternally
            set(value) = definedExternally
        var Count: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ScannedCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var LastEvaluatedKey: Key?
            get() = definedExternally
            set(value) = definedExternally
        var ConsumedCapacity: ConsumedCapacity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SecondaryIndexesCapacityMap {
        @nativeGetter
        operator fun get(key: String): Capacity?
        @nativeSetter
        operator fun set(key: String, value: Capacity)
    }
    interface SourceTableDetails {
        var TableName: TableName
        var TableId: TableId
        var TableArn: TableArn?
            get() = definedExternally
            set(value) = definedExternally
        var TableSizeBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var KeySchema: KeySchema
        var TableCreationDateTime: TableCreationDateTime
        var ProvisionedThroughput: ProvisionedThroughput
        var ItemCount: ItemCount?
            get() = definedExternally
            set(value) = definedExternally
        var BillingMode: String /* "PROVISIONED" | "PAY_PER_REQUEST" | String */
    }
    interface SourceTableFeatureDetails {
        var LocalSecondaryIndexes: LocalSecondaryIndexes?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalSecondaryIndexes: GlobalSecondaryIndexes?
            get() = definedExternally
            set(value) = definedExternally
        var StreamDescription: StreamSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var TimeToLiveDescription: TimeToLiveDescription?
            get() = definedExternally
            set(value) = definedExternally
        var SSEDescription: SSEDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StreamSpecification {
        var StreamEnabled: StreamEnabled
        var StreamViewType: String /* "NEW_IMAGE" | "OLD_IMAGE" | "NEW_AND_OLD_IMAGES" | "KEYS_ONLY" | String */
    }
    interface TableAutoScalingDescription {
        var TableName: TableName?
            get() = definedExternally
            set(value) = definedExternally
        var TableStatus: String /* "CREATING" | "UPDATING" | "DELETING" | "ACTIVE" | "INACCESSIBLE_ENCRYPTION_CREDENTIALS" | "ARCHIVING" | "ARCHIVED" | String */
        var Replicas: ReplicaAutoScalingDescriptionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TableDescription {
        var AttributeDefinitions: AttributeDefinitions?
            get() = definedExternally
            set(value) = definedExternally
        var TableName: TableName?
            get() = definedExternally
            set(value) = definedExternally
        var KeySchema: KeySchema?
            get() = definedExternally
            set(value) = definedExternally
        var TableStatus: String /* "CREATING" | "UPDATING" | "DELETING" | "ACTIVE" | "INACCESSIBLE_ENCRYPTION_CREDENTIALS" | "ARCHIVING" | "ARCHIVED" | String */
        var CreationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedThroughput: ProvisionedThroughputDescription?
            get() = definedExternally
            set(value) = definedExternally
        var TableSizeBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var ItemCount: Long?
            get() = definedExternally
            set(value) = definedExternally
        var TableArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var TableId: TableId?
            get() = definedExternally
            set(value) = definedExternally
        var BillingModeSummary: BillingModeSummary?
            get() = definedExternally
            set(value) = definedExternally
        var LocalSecondaryIndexes: LocalSecondaryIndexDescriptionList?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalSecondaryIndexes: GlobalSecondaryIndexDescriptionList?
            get() = definedExternally
            set(value) = definedExternally
        var StreamSpecification: StreamSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var LatestStreamLabel: String?
            get() = definedExternally
            set(value) = definedExternally
        var LatestStreamArn: StreamArn?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalTableVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var Replicas: ReplicaDescriptionList?
            get() = definedExternally
            set(value) = definedExternally
        var RestoreSummary: RestoreSummary?
            get() = definedExternally
            set(value) = definedExternally
        var SSEDescription: SSEDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ArchivalSummary: ArchivalSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKeyString
        var Value: TagValueString
    }
    interface TagResourceInput {
        var ResourceArn: ResourceArnString
        var Tags: TagList
    }
    interface TimeToLiveDescription {
        var TimeToLiveStatus: String /* "ENABLING" | "DISABLING" | "ENABLED" | "DISABLED" | String */
        var AttributeName: TimeToLiveAttributeName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TimeToLiveSpecification {
        var Enabled: TimeToLiveEnabled
        var AttributeName: TimeToLiveAttributeName
    }
    interface TransactGetItem {
        var Get: Get
    }
    interface TransactGetItemsInput {
        var TransactItems: TransactGetItemList
        var ReturnConsumedCapacity: String /* "INDEXES" | "TOTAL" | "NONE" | String */
    }
    interface TransactGetItemsOutput {
        var ConsumedCapacity: ConsumedCapacityMultiple?
            get() = definedExternally
            set(value) = definedExternally
        var Responses: ItemResponseList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TransactWriteItem {
        var ConditionCheck: ConditionCheck?
            get() = definedExternally
            set(value) = definedExternally
        var Put: Put?
            get() = definedExternally
            set(value) = definedExternally
        var Delete: Delete?
            get() = definedExternally
            set(value) = definedExternally
        var Update: Update?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TransactWriteItemsInput {
        var TransactItems: TransactWriteItemList
        var ReturnConsumedCapacity: String /* "INDEXES" | "TOTAL" | "NONE" | String */
        var ReturnItemCollectionMetrics: String /* "SIZE" | "NONE" | String */
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TransactWriteItemsOutput {
        var ConsumedCapacity: ConsumedCapacityMultiple?
            get() = definedExternally
            set(value) = definedExternally
        var ItemCollectionMetrics: ItemCollectionMetricsPerTable?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceInput {
        var ResourceArn: ResourceArnString
        var TagKeys: TagKeyList
    }
    interface Update {
        var Key: Key
        var UpdateExpression: UpdateExpression
        var TableName: TableName
        var ConditionExpression: ConditionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var ExpressionAttributeNames: ExpressionAttributeNameMap?
            get() = definedExternally
            set(value) = definedExternally
        var ExpressionAttributeValues: ExpressionAttributeValueMap?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnValuesOnConditionCheckFailure: String /* "ALL_OLD" | "NONE" | String */
    }
    interface UpdateContinuousBackupsInput {
        var TableName: TableName
        var PointInTimeRecoverySpecification: PointInTimeRecoverySpecification
    }
    interface UpdateContinuousBackupsOutput {
        var ContinuousBackupsDescription: ContinuousBackupsDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateContributorInsightsInput {
        var TableName: TableName
        var IndexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var ContributorInsightsAction: String /* "ENABLE" | "DISABLE" | String */
    }
    interface UpdateContributorInsightsOutput {
        var TableName: TableName?
            get() = definedExternally
            set(value) = definedExternally
        var IndexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var ContributorInsightsStatus: String /* "ENABLING" | "ENABLED" | "DISABLING" | "DISABLED" | "FAILED" | String */
    }
    interface UpdateGlobalSecondaryIndexAction {
        var IndexName: IndexName
        var ProvisionedThroughput: ProvisionedThroughput
    }
    interface UpdateGlobalTableInput {
        var GlobalTableName: TableName
        var ReplicaUpdates: ReplicaUpdateList
    }
    interface UpdateGlobalTableOutput {
        var GlobalTableDescription: GlobalTableDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGlobalTableSettingsInput {
        var GlobalTableName: TableName
        var GlobalTableBillingMode: String /* "PROVISIONED" | "PAY_PER_REQUEST" | String */
        var GlobalTableProvisionedWriteCapacityUnits: PositiveLongObject?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalTableGlobalSecondaryIndexSettingsUpdate: GlobalTableGlobalSecondaryIndexSettingsUpdateList?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicaSettingsUpdate: ReplicaSettingsUpdateList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGlobalTableSettingsOutput {
        var GlobalTableName: TableName?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicaSettings: ReplicaSettingsDescriptionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateItemInput {
        var TableName: TableName
        var Key: Key
        var AttributeUpdates: AttributeUpdates?
            get() = definedExternally
            set(value) = definedExternally
        var Expected: ExpectedAttributeMap?
            get() = definedExternally
            set(value) = definedExternally
        var ConditionalOperator: String /* "AND" | "OR" | String */
        var ReturnValues: String /* "NONE" | "ALL_OLD" | "UPDATED_OLD" | "ALL_NEW" | "UPDATED_NEW" | String */
        var ReturnConsumedCapacity: String /* "INDEXES" | "TOTAL" | "NONE" | String */
        var ReturnItemCollectionMetrics: String /* "SIZE" | "NONE" | String */
        var UpdateExpression: UpdateExpression?
            get() = definedExternally
            set(value) = definedExternally
        var ConditionExpression: ConditionExpression?
            get() = definedExternally
            set(value) = definedExternally
        var ExpressionAttributeNames: ExpressionAttributeNameMap?
            get() = definedExternally
            set(value) = definedExternally
        var ExpressionAttributeValues: ExpressionAttributeValueMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateItemOutput {
        var Attributes: AttributeMap?
            get() = definedExternally
            set(value) = definedExternally
        var ConsumedCapacity: ConsumedCapacity?
            get() = definedExternally
            set(value) = definedExternally
        var ItemCollectionMetrics: ItemCollectionMetrics?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateReplicationGroupMemberAction {
        var RegionName: RegionName
        var KMSMasterKeyId: KMSMasterKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedThroughputOverride: ProvisionedThroughputOverride?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalSecondaryIndexes: ReplicaGlobalSecondaryIndexList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTableInput {
        var AttributeDefinitions: AttributeDefinitions?
            get() = definedExternally
            set(value) = definedExternally
        var TableName: TableName
        var BillingMode: String /* "PROVISIONED" | "PAY_PER_REQUEST" | String */
        var ProvisionedThroughput: ProvisionedThroughput?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalSecondaryIndexUpdates: GlobalSecondaryIndexUpdateList?
            get() = definedExternally
            set(value) = definedExternally
        var StreamSpecification: StreamSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var SSESpecification: SSESpecification?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicaUpdates: ReplicationGroupUpdateList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTableOutput {
        var TableDescription: TableDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTableReplicaAutoScalingInput {
        var GlobalSecondaryIndexUpdates: GlobalSecondaryIndexAutoScalingUpdateList?
            get() = definedExternally
            set(value) = definedExternally
        var TableName: TableName
        var ProvisionedWriteCapacityAutoScalingUpdate: AutoScalingSettingsUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicaUpdates: ReplicaAutoScalingUpdateList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTableReplicaAutoScalingOutput {
        var TableAutoScalingDescription: TableAutoScalingDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTimeToLiveInput {
        var TableName: TableName
        var TimeToLiveSpecification: TimeToLiveSpecification
    }
    interface UpdateTimeToLiveOutput {
        var TimeToLiveSpecification: TimeToLiveSpecification?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WriteRequest {
        var PutRequest: PutRequest?
            get() = definedExternally
            set(value) = definedExternally
        var DeleteRequest: DeleteRequest?
            get() = definedExternally
            set(value) = definedExternally
    }
}