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
import EBS.Block
import EBS.ChangedBlock
import EBS.GetSnapshotBlockRequest
import EBS.GetSnapshotBlockResponse
import EBS.ListChangedBlocksRequest
import EBS.ListChangedBlocksResponse
import EBS.ListSnapshotBlocksRequest
import EBS.ListSnapshotBlocksResponse

typealias BlockIndex = Number

typealias BlockSize = Number

typealias BlockToken = String

typealias Blocks = Array<Block>

typealias ChangedBlocks = Array<ChangedBlock>

typealias Checksum = String

typealias DataLength = Number

typealias MaxResults = Number

typealias PageToken = String

typealias SnapshotId = String

typealias TimeStamp = Date

typealias VolumeSize = Number

@JsModule("aws-sdk")
external open class EBS(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & EBS.Types.ClientConfiguration */
    open fun getSnapshotBlock(params: GetSnapshotBlockRequest, callback: (err: AWSError, data: GetSnapshotBlockResponse) -> Unit = definedExternally): Request<GetSnapshotBlockResponse, AWSError>
    open fun getSnapshotBlock(callback: (err: AWSError, data: GetSnapshotBlockResponse) -> Unit = definedExternally): Request<GetSnapshotBlockResponse, AWSError>
    open fun listChangedBlocks(params: ListChangedBlocksRequest, callback: (err: AWSError, data: ListChangedBlocksResponse) -> Unit = definedExternally): Request<ListChangedBlocksResponse, AWSError>
    open fun listChangedBlocks(callback: (err: AWSError, data: ListChangedBlocksResponse) -> Unit = definedExternally): Request<ListChangedBlocksResponse, AWSError>
    open fun listSnapshotBlocks(params: ListSnapshotBlocksRequest, callback: (err: AWSError, data: ListSnapshotBlocksResponse) -> Unit = definedExternally): Request<ListSnapshotBlocksResponse, AWSError>
    open fun listSnapshotBlocks(callback: (err: AWSError, data: ListSnapshotBlocksResponse) -> Unit = definedExternally): Request<ListSnapshotBlocksResponse, AWSError>
    interface Block {
        var BlockIndex: BlockIndex?
            get() = definedExternally
            set(value) = definedExternally
        var BlockToken: BlockToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChangedBlock {
        var BlockIndex: BlockIndex?
            get() = definedExternally
            set(value) = definedExternally
        var FirstBlockToken: BlockToken?
            get() = definedExternally
            set(value) = definedExternally
        var SecondBlockToken: BlockToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSnapshotBlockRequest {
        var SnapshotId: SnapshotId
        var BlockIndex: BlockIndex
        var BlockToken: BlockToken
    }
    interface GetSnapshotBlockResponse {
        var DataLength: DataLength?
            get() = definedExternally
            set(value) = definedExternally
        var BlockData: dynamic /* Buffer | Uint8Array | Blob | String | Readable */
            get() = definedExternally
            set(value) = definedExternally
        var Checksum: Checksum?
            get() = definedExternally
            set(value) = definedExternally
        var ChecksumAlgorithm: String /* "SHA256" | String */
    }
    interface ListChangedBlocksRequest {
        var FirstSnapshotId: SnapshotId?
            get() = definedExternally
            set(value) = definedExternally
        var SecondSnapshotId: SnapshotId
        var NextToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var StartingBlockIndex: BlockIndex?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListChangedBlocksResponse {
        var ChangedBlocks: ChangedBlocks?
            get() = definedExternally
            set(value) = definedExternally
        var ExpiryTime: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeSize: VolumeSize?
            get() = definedExternally
            set(value) = definedExternally
        var BlockSize: BlockSize?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSnapshotBlocksRequest {
        var SnapshotId: SnapshotId
        var NextToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var StartingBlockIndex: BlockIndex?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSnapshotBlocksResponse {
        var Blocks: Blocks?
            get() = definedExternally
            set(value) = definedExternally
        var ExpiryTime: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeSize: VolumeSize?
            get() = definedExternally
            set(value) = definedExternally
        var BlockSize: BlockSize?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-11-02" | "latest" | String */
    }
}