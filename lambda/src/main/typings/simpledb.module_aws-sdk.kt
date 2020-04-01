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
import SimpleDB.Attribute
import SimpleDB.DeletableAttribute
import SimpleDB.DeletableItem
import SimpleDB.Item
import SimpleDB.ReplaceableAttribute
import SimpleDB.ReplaceableItem
import SimpleDB.BatchDeleteAttributesRequest
import SimpleDB.BatchPutAttributesRequest
import SimpleDB.CreateDomainRequest
import SimpleDB.DeleteAttributesRequest
import SimpleDB.DeleteDomainRequest
import SimpleDB.DomainMetadataRequest
import SimpleDB.DomainMetadataResult
import SimpleDB.GetAttributesRequest
import SimpleDB.GetAttributesResult
import SimpleDB.ListDomainsRequest
import SimpleDB.ListDomainsResult
import SimpleDB.PutAttributesRequest
import SimpleDB.SelectRequest
import SimpleDB.SelectResult
import SimpleDB.UpdateCondition

typealias AttributeList = Array<Attribute>

typealias AttributeNameList = Array<String>

typealias Boolean = Boolean

typealias DeletableAttributeList = Array<DeletableAttribute>

typealias DeletableItemList = Array<DeletableItem>

typealias DomainNameList = Array<String>

typealias Integer = Number

typealias ItemList = Array<Item>

typealias Long = Number

typealias ReplaceableAttributeList = Array<ReplaceableAttribute>

typealias ReplaceableItemList = Array<ReplaceableItem>

typealias String = String

@JsModule("aws-sdk")
external open class SimpleDB(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & SimpleDB.Types.ClientConfiguration */
    open fun batchDeleteAttributes(params: BatchDeleteAttributesRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun batchDeleteAttributes(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun batchPutAttributes(params: BatchPutAttributesRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun batchPutAttributes(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createDomain(params: CreateDomainRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createDomain(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAttributes(params: DeleteAttributesRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAttributes(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDomain(params: DeleteDomainRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDomain(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun domainMetadata(params: DomainMetadataRequest, callback: (err: AWSError, data: DomainMetadataResult) -> Unit = definedExternally): Request<DomainMetadataResult, AWSError>
    open fun domainMetadata(callback: (err: AWSError, data: DomainMetadataResult) -> Unit = definedExternally): Request<DomainMetadataResult, AWSError>
    open fun getAttributes(params: GetAttributesRequest, callback: (err: AWSError, data: GetAttributesResult) -> Unit = definedExternally): Request<GetAttributesResult, AWSError>
    open fun getAttributes(callback: (err: AWSError, data: GetAttributesResult) -> Unit = definedExternally): Request<GetAttributesResult, AWSError>
    open fun listDomains(params: ListDomainsRequest, callback: (err: AWSError, data: ListDomainsResult) -> Unit = definedExternally): Request<ListDomainsResult, AWSError>
    open fun listDomains(callback: (err: AWSError, data: ListDomainsResult) -> Unit = definedExternally): Request<ListDomainsResult, AWSError>
    open fun putAttributes(params: PutAttributesRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putAttributes(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun select(params: SelectRequest, callback: (err: AWSError, data: SelectResult) -> Unit = definedExternally): Request<SelectResult, AWSError>
    open fun select(callback: (err: AWSError, data: SelectResult) -> Unit = definedExternally): Request<SelectResult, AWSError>
    interface Attribute {
        var Name: String
        var AlternateNameEncoding: String?
            get() = definedExternally
            set(value) = definedExternally
        var Value: String
        var AlternateValueEncoding: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDeleteAttributesRequest {
        var DomainName: String
        var Items: DeletableItemList
    }
    interface BatchPutAttributesRequest {
        var DomainName: String
        var Items: ReplaceableItemList
    }
    interface CreateDomainRequest {
        var DomainName: String
    }
    interface DeletableAttribute {
        var Name: String
        var Value: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeletableItem {
        var Name: String
        var Attributes: DeletableAttributeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAttributesRequest {
        var DomainName: String
        var ItemName: String
        var Attributes: DeletableAttributeList?
            get() = definedExternally
            set(value) = definedExternally
        var Expected: UpdateCondition?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDomainRequest {
        var DomainName: String
    }
    interface DomainMetadataRequest {
        var DomainName: String
    }
    interface DomainMetadataResult {
        var ItemCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ItemNamesSizeBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var AttributeNameCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var AttributeNamesSizeBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var AttributeValueCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var AttributeValuesSizeBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var Timestamp: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAttributesRequest {
        var DomainName: String
        var ItemName: String
        var AttributeNames: AttributeNameList?
            get() = definedExternally
            set(value) = definedExternally
        var ConsistentRead: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAttributesResult {
        var Attributes: AttributeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Item {
        var Name: String
        var AlternateNameEncoding: String?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: AttributeList
    }
    interface ListDomainsRequest {
        var MaxNumberOfDomains: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDomainsResult {
        var DomainNames: DomainNameList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutAttributesRequest {
        var DomainName: String
        var ItemName: String
        var Attributes: ReplaceableAttributeList
        var Expected: UpdateCondition?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplaceableAttribute {
        var Name: String
        var Value: String
        var Replace: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplaceableItem {
        var Name: String
        var Attributes: ReplaceableAttributeList
    }
    interface SelectRequest {
        var SelectExpression: String
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var ConsistentRead: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SelectResult {
        var Items: ItemList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateCondition {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Value: String?
            get() = definedExternally
            set(value) = definedExternally
        var Exists: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2009-04-15" | "latest" | String */
    }
}