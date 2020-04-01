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
import MediaStoreData.Item
import MediaStoreData.DeleteObjectRequest
import MediaStoreData.DeleteObjectResponse
import MediaStoreData.DescribeObjectRequest
import MediaStoreData.DescribeObjectResponse
import MediaStoreData.GetObjectRequest
import MediaStoreData.GetObjectResponse
import MediaStoreData.ListItemsRequest
import MediaStoreData.ListItemsResponse
import MediaStoreData.PutObjectRequest
import MediaStoreData.PutObjectResponse

typealias ContentRangePattern = String

typealias ContentType = String

typealias ETag = String

typealias ItemList = Array<Item>

typealias ItemName = String

typealias ListLimit = Number

typealias ListPathNaming = String

typealias NonNegativeLong = Number

typealias PaginationToken = String

typealias PathNaming = String

typealias RangePattern = String

typealias SHA256Hash = String

typealias StringPrimitive = String

typealias TimeStamp = Date

typealias statusCode = Number

@JsModule("aws-sdk")
external open class MediaStoreData(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & MediaStoreData.Types.ClientConfiguration */
    open fun deleteObject(params: DeleteObjectRequest, callback: (err: AWSError, data: DeleteObjectResponse) -> Unit = definedExternally): Request<DeleteObjectResponse, AWSError>
    open fun deleteObject(callback: (err: AWSError, data: DeleteObjectResponse) -> Unit = definedExternally): Request<DeleteObjectResponse, AWSError>
    open fun describeObject(params: DescribeObjectRequest, callback: (err: AWSError, data: DescribeObjectResponse) -> Unit = definedExternally): Request<DescribeObjectResponse, AWSError>
    open fun describeObject(callback: (err: AWSError, data: DescribeObjectResponse) -> Unit = definedExternally): Request<DescribeObjectResponse, AWSError>
    open fun getObject(params: GetObjectRequest, callback: (err: AWSError, data: GetObjectResponse) -> Unit = definedExternally): Request<GetObjectResponse, AWSError>
    open fun getObject(callback: (err: AWSError, data: GetObjectResponse) -> Unit = definedExternally): Request<GetObjectResponse, AWSError>
    open fun listItems(params: ListItemsRequest, callback: (err: AWSError, data: ListItemsResponse) -> Unit = definedExternally): Request<ListItemsResponse, AWSError>
    open fun listItems(callback: (err: AWSError, data: ListItemsResponse) -> Unit = definedExternally): Request<ListItemsResponse, AWSError>
    open fun putObject(params: PutObjectRequest, callback: (err: AWSError, data: PutObjectResponse) -> Unit = definedExternally): Request<PutObjectResponse, AWSError>
    open fun putObject(callback: (err: AWSError, data: PutObjectResponse) -> Unit = definedExternally): Request<PutObjectResponse, AWSError>
    interface DeleteObjectRequest {
        var Path: PathNaming
    }
    interface DeleteObjectResponse
    interface DescribeObjectRequest {
        var Path: PathNaming
    }
    interface DescribeObjectResponse {
        var ETag: ETag?
            get() = definedExternally
            set(value) = definedExternally
        var ContentType: ContentType?
            get() = definedExternally
            set(value) = definedExternally
        var ContentLength: NonNegativeLong?
            get() = definedExternally
            set(value) = definedExternally
        var CacheControl: StringPrimitive?
            get() = definedExternally
            set(value) = definedExternally
        var LastModified: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetObjectRequest {
        var Path: PathNaming
        var Range: RangePattern?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetObjectResponse {
        var Body: dynamic /* Buffer | Uint8Array | Blob | String | Readable */
            get() = definedExternally
            set(value) = definedExternally
        var CacheControl: StringPrimitive?
            get() = definedExternally
            set(value) = definedExternally
        var ContentRange: ContentRangePattern?
            get() = definedExternally
            set(value) = definedExternally
        var ContentLength: NonNegativeLong?
            get() = definedExternally
            set(value) = definedExternally
        var ContentType: ContentType?
            get() = definedExternally
            set(value) = definedExternally
        var ETag: ETag?
            get() = definedExternally
            set(value) = definedExternally
        var LastModified: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var StatusCode: statusCode
    }
    interface Item {
        var Name: ItemName?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "OBJECT" | "FOLDER" | String */
        var ETag: ETag?
            get() = definedExternally
            set(value) = definedExternally
        var LastModified: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var ContentType: ContentType?
            get() = definedExternally
            set(value) = definedExternally
        var ContentLength: NonNegativeLong?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListItemsRequest {
        var Path: ListPathNaming?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ListLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListItemsResponse {
        var Items: ItemList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutObjectRequest {
        var Body: dynamic /* Buffer | Uint8Array | Blob | String | Readable */
            get() = definedExternally
            set(value) = definedExternally
        var Path: PathNaming
        var ContentType: ContentType?
            get() = definedExternally
            set(value) = definedExternally
        var CacheControl: StringPrimitive?
            get() = definedExternally
            set(value) = definedExternally
        var StorageClass: String /* "TEMPORAL" | String */
        var UploadAvailability: String /* "STANDARD" | "STREAMING" | String */
    }
    interface PutObjectResponse {
        var ContentSHA256: SHA256Hash?
            get() = definedExternally
            set(value) = definedExternally
        var ETag: ETag?
            get() = definedExternally
            set(value) = definedExternally
        var StorageClass: String /* "TEMPORAL" | String */
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-09-01" | "latest" | String */
    }
}