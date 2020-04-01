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
import CloudDirectory.AttributeKeyAndValue
import CloudDirectory.AttributeKey
import CloudDirectory.AttributeNameAndValue
import CloudDirectory.BatchReadOperation
import CloudDirectory.BatchReadOperationResponse
import CloudDirectory.BatchWriteOperation
import CloudDirectory.BatchWriteOperationResponse
import CloudDirectory.Directory
import CloudDirectory.FacetAttribute
import CloudDirectory.FacetAttributeUpdate
import CloudDirectory.IndexAttachment
import CloudDirectory.LinkAttributeUpdate
import CloudDirectory.ObjectAttributeRange
import CloudDirectory.ObjectAttributeUpdate
import CloudDirectory.ObjectIdentifierAndLinkNameTuple
import CloudDirectory.PathToObjectIdentifiers
import CloudDirectory.PolicyAttachment
import CloudDirectory.PolicyToPath
import CloudDirectory.SchemaFacet
import CloudDirectory.Tag
import CloudDirectory.TypedLinkAttributeDefinition
import CloudDirectory.TypedLinkAttributeRange
import CloudDirectory.TypedLinkFacetAttributeUpdate
import CloudDirectory.TypedLinkSpecifier
import CloudDirectory.AddFacetToObjectRequest
import CloudDirectory.AddFacetToObjectResponse
import CloudDirectory.ApplySchemaRequest
import CloudDirectory.ApplySchemaResponse
import CloudDirectory.AttachObjectRequest
import CloudDirectory.AttachObjectResponse
import CloudDirectory.AttachPolicyRequest
import CloudDirectory.AttachPolicyResponse
import CloudDirectory.AttachToIndexRequest
import CloudDirectory.AttachToIndexResponse
import CloudDirectory.AttachTypedLinkRequest
import CloudDirectory.AttachTypedLinkResponse
import CloudDirectory.BatchReadRequest
import CloudDirectory.BatchReadResponse
import CloudDirectory.BatchWriteRequest
import CloudDirectory.BatchWriteResponse
import CloudDirectory.CreateDirectoryRequest
import CloudDirectory.CreateDirectoryResponse
import CloudDirectory.CreateFacetRequest
import CloudDirectory.CreateFacetResponse
import CloudDirectory.CreateIndexRequest
import CloudDirectory.CreateIndexResponse
import CloudDirectory.CreateObjectRequest
import CloudDirectory.CreateObjectResponse
import CloudDirectory.CreateSchemaRequest
import CloudDirectory.CreateSchemaResponse
import CloudDirectory.CreateTypedLinkFacetRequest
import CloudDirectory.CreateTypedLinkFacetResponse
import CloudDirectory.DeleteDirectoryRequest
import CloudDirectory.DeleteDirectoryResponse
import CloudDirectory.DeleteFacetRequest
import CloudDirectory.DeleteFacetResponse
import CloudDirectory.DeleteObjectRequest
import CloudDirectory.DeleteObjectResponse
import CloudDirectory.DeleteSchemaRequest
import CloudDirectory.DeleteSchemaResponse
import CloudDirectory.DeleteTypedLinkFacetRequest
import CloudDirectory.DeleteTypedLinkFacetResponse
import CloudDirectory.DetachFromIndexRequest
import CloudDirectory.DetachFromIndexResponse
import CloudDirectory.DetachObjectRequest
import CloudDirectory.DetachObjectResponse
import CloudDirectory.DetachPolicyRequest
import CloudDirectory.DetachPolicyResponse
import CloudDirectory.DetachTypedLinkRequest
import CloudDirectory.DisableDirectoryRequest
import CloudDirectory.DisableDirectoryResponse
import CloudDirectory.EnableDirectoryRequest
import CloudDirectory.EnableDirectoryResponse
import CloudDirectory.GetAppliedSchemaVersionRequest
import CloudDirectory.GetAppliedSchemaVersionResponse
import CloudDirectory.GetDirectoryRequest
import CloudDirectory.GetDirectoryResponse
import CloudDirectory.GetFacetRequest
import CloudDirectory.GetFacetResponse
import CloudDirectory.GetLinkAttributesRequest
import CloudDirectory.GetLinkAttributesResponse
import CloudDirectory.GetObjectAttributesRequest
import CloudDirectory.GetObjectAttributesResponse
import CloudDirectory.GetObjectInformationRequest
import CloudDirectory.GetObjectInformationResponse
import CloudDirectory.GetSchemaAsJsonRequest
import CloudDirectory.GetSchemaAsJsonResponse
import CloudDirectory.GetTypedLinkFacetInformationRequest
import CloudDirectory.GetTypedLinkFacetInformationResponse
import CloudDirectory.ListAppliedSchemaArnsRequest
import CloudDirectory.ListAppliedSchemaArnsResponse
import CloudDirectory.ListAttachedIndicesRequest
import CloudDirectory.ListAttachedIndicesResponse
import CloudDirectory.ListDevelopmentSchemaArnsRequest
import CloudDirectory.ListDevelopmentSchemaArnsResponse
import CloudDirectory.ListDirectoriesRequest
import CloudDirectory.ListDirectoriesResponse
import CloudDirectory.ListFacetAttributesRequest
import CloudDirectory.ListFacetAttributesResponse
import CloudDirectory.ListFacetNamesRequest
import CloudDirectory.ListFacetNamesResponse
import CloudDirectory.ListIncomingTypedLinksRequest
import CloudDirectory.ListIncomingTypedLinksResponse
import CloudDirectory.ListIndexRequest
import CloudDirectory.ListIndexResponse
import CloudDirectory.ListManagedSchemaArnsRequest
import CloudDirectory.ListManagedSchemaArnsResponse
import CloudDirectory.ListObjectAttributesRequest
import CloudDirectory.ListObjectAttributesResponse
import CloudDirectory.ListObjectChildrenRequest
import CloudDirectory.ListObjectChildrenResponse
import CloudDirectory.ListObjectParentPathsRequest
import CloudDirectory.ListObjectParentPathsResponse
import CloudDirectory.ListObjectParentsRequest
import CloudDirectory.ListObjectParentsResponse
import CloudDirectory.ListObjectPoliciesRequest
import CloudDirectory.ListObjectPoliciesResponse
import CloudDirectory.ListOutgoingTypedLinksRequest
import CloudDirectory.ListOutgoingTypedLinksResponse
import CloudDirectory.ListPolicyAttachmentsRequest
import CloudDirectory.ListPolicyAttachmentsResponse
import CloudDirectory.ListPublishedSchemaArnsRequest
import CloudDirectory.ListPublishedSchemaArnsResponse
import CloudDirectory.ListTagsForResourceRequest
import CloudDirectory.ListTagsForResourceResponse
import CloudDirectory.ListTypedLinkFacetAttributesRequest
import CloudDirectory.ListTypedLinkFacetAttributesResponse
import CloudDirectory.ListTypedLinkFacetNamesRequest
import CloudDirectory.ListTypedLinkFacetNamesResponse
import CloudDirectory.LookupPolicyRequest
import CloudDirectory.LookupPolicyResponse
import CloudDirectory.PublishSchemaRequest
import CloudDirectory.PublishSchemaResponse
import CloudDirectory.PutSchemaFromJsonRequest
import CloudDirectory.PutSchemaFromJsonResponse
import CloudDirectory.RemoveFacetFromObjectRequest
import CloudDirectory.RemoveFacetFromObjectResponse
import CloudDirectory.TagResourceRequest
import CloudDirectory.TagResourceResponse
import CloudDirectory.UntagResourceRequest
import CloudDirectory.UntagResourceResponse
import CloudDirectory.UpdateFacetRequest
import CloudDirectory.UpdateFacetResponse
import CloudDirectory.UpdateLinkAttributesRequest
import CloudDirectory.UpdateLinkAttributesResponse
import CloudDirectory.UpdateObjectAttributesRequest
import CloudDirectory.UpdateObjectAttributesResponse
import CloudDirectory.UpdateSchemaRequest
import CloudDirectory.UpdateSchemaResponse
import CloudDirectory.UpdateTypedLinkFacetRequest
import CloudDirectory.UpdateTypedLinkFacetResponse
import CloudDirectory.UpgradeAppliedSchemaRequest
import CloudDirectory.UpgradeAppliedSchemaResponse
import CloudDirectory.UpgradePublishedSchemaRequest
import CloudDirectory.UpgradePublishedSchemaResponse
import CloudDirectory.ObjectReference
import CloudDirectory.TypedLinkSchemaAndFacetName
import CloudDirectory.TypedAttributeValue
import CloudDirectory.LinkNameToObjectIdentifierMap
import CloudDirectory.BatchListObjectAttributes
import CloudDirectory.BatchListObjectChildren
import CloudDirectory.BatchListAttachedIndices
import CloudDirectory.BatchListObjectParentPaths
import CloudDirectory.BatchGetObjectInformation
import CloudDirectory.BatchGetObjectAttributes
import CloudDirectory.BatchListObjectParents
import CloudDirectory.BatchListObjectPolicies
import CloudDirectory.BatchListPolicyAttachments
import CloudDirectory.BatchLookupPolicy
import CloudDirectory.BatchListIndex
import CloudDirectory.BatchListOutgoingTypedLinks
import CloudDirectory.BatchListIncomingTypedLinks
import CloudDirectory.BatchGetLinkAttributes
import CloudDirectory.BatchReadSuccessfulResponse
import CloudDirectory.BatchReadException
import CloudDirectory.BatchListObjectAttributesResponse
import CloudDirectory.BatchListObjectChildrenResponse
import CloudDirectory.BatchGetObjectInformationResponse
import CloudDirectory.BatchGetObjectAttributesResponse
import CloudDirectory.BatchListAttachedIndicesResponse
import CloudDirectory.BatchListObjectParentPathsResponse
import CloudDirectory.BatchListObjectPoliciesResponse
import CloudDirectory.BatchListPolicyAttachmentsResponse
import CloudDirectory.BatchLookupPolicyResponse
import CloudDirectory.BatchListIndexResponse
import CloudDirectory.BatchListOutgoingTypedLinksResponse
import CloudDirectory.BatchListIncomingTypedLinksResponse
import CloudDirectory.BatchGetLinkAttributesResponse
import CloudDirectory.BatchListObjectParentsResponse
import CloudDirectory.BatchCreateObject
import CloudDirectory.BatchAttachObject
import CloudDirectory.BatchDetachObject
import CloudDirectory.BatchUpdateObjectAttributes
import CloudDirectory.BatchDeleteObject
import CloudDirectory.BatchAddFacetToObject
import CloudDirectory.BatchRemoveFacetFromObject
import CloudDirectory.BatchAttachPolicy
import CloudDirectory.BatchDetachPolicy
import CloudDirectory.BatchCreateIndex
import CloudDirectory.BatchAttachToIndex
import CloudDirectory.BatchDetachFromIndex
import CloudDirectory.BatchAttachTypedLink
import CloudDirectory.BatchDetachTypedLink
import CloudDirectory.BatchUpdateLinkAttributes
import CloudDirectory.BatchCreateObjectResponse
import CloudDirectory.BatchAttachObjectResponse
import CloudDirectory.BatchDetachObjectResponse
import CloudDirectory.BatchUpdateObjectAttributesResponse
import CloudDirectory.BatchDeleteObjectResponse
import CloudDirectory.BatchAddFacetToObjectResponse
import CloudDirectory.BatchRemoveFacetFromObjectResponse
import CloudDirectory.BatchAttachPolicyResponse
import CloudDirectory.BatchDetachPolicyResponse
import CloudDirectory.BatchCreateIndexResponse
import CloudDirectory.BatchAttachToIndexResponse
import CloudDirectory.BatchDetachFromIndexResponse
import CloudDirectory.BatchAttachTypedLinkResponse
import CloudDirectory.BatchDetachTypedLinkResponse
import CloudDirectory.BatchUpdateLinkAttributesResponse
import CloudDirectory.TypedLinkFacet
import CloudDirectory.FacetAttributeDefinition
import CloudDirectory.FacetAttributeReference
import CloudDirectory.RuleMap
import CloudDirectory.Facet
import CloudDirectory.LinkAttributeAction
import CloudDirectory.ObjectIdentifierToLinkNameMap
import CloudDirectory.TypedAttributeValueRange
import CloudDirectory.ObjectAttributeAction
import CloudDirectory.RuleParameterMap
import CloudDirectory.Rule

typealias Arn = String

typealias Arns = Array<Arn>

typealias AttributeKeyAndValueList = Array<AttributeKeyAndValue>

typealias AttributeKeyList = Array<AttributeKey>

typealias AttributeName = String

typealias AttributeNameAndValueList = Array<AttributeNameAndValue>

typealias AttributeNameList = Array<AttributeName>

typealias BatchReadOperationList = Array<BatchReadOperation>

typealias BatchReadOperationResponseList = Array<BatchReadOperationResponse>

typealias BatchReferenceName = String

typealias BatchWriteOperationList = Array<BatchWriteOperation>

typealias BatchWriteOperationResponseList = Array<BatchWriteOperationResponse>

typealias Bool = Boolean

typealias BooleanAttributeValue = Boolean

typealias _Date = Date

typealias DatetimeAttributeValue = Date

typealias DirectoryArn = String

typealias DirectoryList = Array<Directory>

typealias DirectoryName = String

typealias ExceptionMessage = String

typealias FacetAttributeList = Array<FacetAttribute>

typealias FacetAttributeUpdateList = Array<FacetAttributeUpdate>

typealias FacetName = String

typealias FacetNameList = Array<FacetName>

typealias IndexAttachmentList = Array<IndexAttachment>

typealias LinkAttributeUpdateList = Array<LinkAttributeUpdate>

typealias LinkName = String

typealias NextToken = String

typealias NumberAttributeValue = String

typealias NumberResults = Number

typealias ObjectAttributeRangeList = Array<ObjectAttributeRange>

typealias ObjectAttributeUpdateList = Array<ObjectAttributeUpdate>

typealias ObjectIdentifier = String

typealias ObjectIdentifierAndLinkNameList = Array<ObjectIdentifierAndLinkNameTuple>

typealias ObjectIdentifierList = Array<ObjectIdentifier>

typealias PathString = String

typealias PathToObjectIdentifiersList = Array<PathToObjectIdentifiers>

typealias PolicyAttachmentList = Array<PolicyAttachment>

typealias PolicyToPathList = Array<PolicyToPath>

typealias PolicyType = String

typealias RuleKey = String

typealias RuleParameterKey = String

typealias RuleParameterValue = String

typealias SchemaFacetList = Array<SchemaFacet>

typealias SchemaJsonDocument = String

typealias SchemaName = String

typealias SelectorObjectReference = String

typealias StringAttributeValue = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TagsNumberResults = Number

typealias TypedLinkAttributeDefinitionList = Array<TypedLinkAttributeDefinition>

typealias TypedLinkAttributeRangeList = Array<TypedLinkAttributeRange>

typealias TypedLinkFacetAttributeUpdateList = Array<TypedLinkFacetAttributeUpdate>

typealias TypedLinkName = String

typealias TypedLinkNameList = Array<TypedLinkName>

typealias TypedLinkSpecifierList = Array<TypedLinkSpecifier>

typealias Version = String

@JsModule("aws-sdk")
external open class CloudDirectory(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CloudDirectory.Types.ClientConfiguration */
    open fun addFacetToObject(params: AddFacetToObjectRequest, callback: (err: AWSError, data: AddFacetToObjectResponse) -> Unit = definedExternally): Request<AddFacetToObjectResponse, AWSError>
    open fun addFacetToObject(callback: (err: AWSError, data: AddFacetToObjectResponse) -> Unit = definedExternally): Request<AddFacetToObjectResponse, AWSError>
    open fun applySchema(params: ApplySchemaRequest, callback: (err: AWSError, data: ApplySchemaResponse) -> Unit = definedExternally): Request<ApplySchemaResponse, AWSError>
    open fun applySchema(callback: (err: AWSError, data: ApplySchemaResponse) -> Unit = definedExternally): Request<ApplySchemaResponse, AWSError>
    open fun attachObject(params: AttachObjectRequest, callback: (err: AWSError, data: AttachObjectResponse) -> Unit = definedExternally): Request<AttachObjectResponse, AWSError>
    open fun attachObject(callback: (err: AWSError, data: AttachObjectResponse) -> Unit = definedExternally): Request<AttachObjectResponse, AWSError>
    open fun attachPolicy(params: AttachPolicyRequest, callback: (err: AWSError, data: AttachPolicyResponse) -> Unit = definedExternally): Request<AttachPolicyResponse, AWSError>
    open fun attachPolicy(callback: (err: AWSError, data: AttachPolicyResponse) -> Unit = definedExternally): Request<AttachPolicyResponse, AWSError>
    open fun attachToIndex(params: AttachToIndexRequest, callback: (err: AWSError, data: AttachToIndexResponse) -> Unit = definedExternally): Request<AttachToIndexResponse, AWSError>
    open fun attachToIndex(callback: (err: AWSError, data: AttachToIndexResponse) -> Unit = definedExternally): Request<AttachToIndexResponse, AWSError>
    open fun attachTypedLink(params: AttachTypedLinkRequest, callback: (err: AWSError, data: AttachTypedLinkResponse) -> Unit = definedExternally): Request<AttachTypedLinkResponse, AWSError>
    open fun attachTypedLink(callback: (err: AWSError, data: AttachTypedLinkResponse) -> Unit = definedExternally): Request<AttachTypedLinkResponse, AWSError>
    open fun batchRead(params: BatchReadRequest, callback: (err: AWSError, data: BatchReadResponse) -> Unit = definedExternally): Request<BatchReadResponse, AWSError>
    open fun batchRead(callback: (err: AWSError, data: BatchReadResponse) -> Unit = definedExternally): Request<BatchReadResponse, AWSError>
    open fun batchWrite(params: BatchWriteRequest, callback: (err: AWSError, data: BatchWriteResponse) -> Unit = definedExternally): Request<BatchWriteResponse, AWSError>
    open fun batchWrite(callback: (err: AWSError, data: BatchWriteResponse) -> Unit = definedExternally): Request<BatchWriteResponse, AWSError>
    open fun createDirectory(params: CreateDirectoryRequest, callback: (err: AWSError, data: CreateDirectoryResponse) -> Unit = definedExternally): Request<CreateDirectoryResponse, AWSError>
    open fun createDirectory(callback: (err: AWSError, data: CreateDirectoryResponse) -> Unit = definedExternally): Request<CreateDirectoryResponse, AWSError>
    open fun createFacet(params: CreateFacetRequest, callback: (err: AWSError, data: CreateFacetResponse) -> Unit = definedExternally): Request<CreateFacetResponse, AWSError>
    open fun createFacet(callback: (err: AWSError, data: CreateFacetResponse) -> Unit = definedExternally): Request<CreateFacetResponse, AWSError>
    open fun createIndex(params: CreateIndexRequest, callback: (err: AWSError, data: CreateIndexResponse) -> Unit = definedExternally): Request<CreateIndexResponse, AWSError>
    open fun createIndex(callback: (err: AWSError, data: CreateIndexResponse) -> Unit = definedExternally): Request<CreateIndexResponse, AWSError>
    open fun createObject(params: CreateObjectRequest, callback: (err: AWSError, data: CreateObjectResponse) -> Unit = definedExternally): Request<CreateObjectResponse, AWSError>
    open fun createObject(callback: (err: AWSError, data: CreateObjectResponse) -> Unit = definedExternally): Request<CreateObjectResponse, AWSError>
    open fun createSchema(params: CreateSchemaRequest, callback: (err: AWSError, data: CreateSchemaResponse) -> Unit = definedExternally): Request<CreateSchemaResponse, AWSError>
    open fun createSchema(callback: (err: AWSError, data: CreateSchemaResponse) -> Unit = definedExternally): Request<CreateSchemaResponse, AWSError>
    open fun createTypedLinkFacet(params: CreateTypedLinkFacetRequest, callback: (err: AWSError, data: CreateTypedLinkFacetResponse) -> Unit = definedExternally): Request<CreateTypedLinkFacetResponse, AWSError>
    open fun createTypedLinkFacet(callback: (err: AWSError, data: CreateTypedLinkFacetResponse) -> Unit = definedExternally): Request<CreateTypedLinkFacetResponse, AWSError>
    open fun deleteDirectory(params: DeleteDirectoryRequest, callback: (err: AWSError, data: DeleteDirectoryResponse) -> Unit = definedExternally): Request<DeleteDirectoryResponse, AWSError>
    open fun deleteDirectory(callback: (err: AWSError, data: DeleteDirectoryResponse) -> Unit = definedExternally): Request<DeleteDirectoryResponse, AWSError>
    open fun deleteFacet(params: DeleteFacetRequest, callback: (err: AWSError, data: DeleteFacetResponse) -> Unit = definedExternally): Request<DeleteFacetResponse, AWSError>
    open fun deleteFacet(callback: (err: AWSError, data: DeleteFacetResponse) -> Unit = definedExternally): Request<DeleteFacetResponse, AWSError>
    open fun deleteObject(params: DeleteObjectRequest, callback: (err: AWSError, data: DeleteObjectResponse) -> Unit = definedExternally): Request<DeleteObjectResponse, AWSError>
    open fun deleteObject(callback: (err: AWSError, data: DeleteObjectResponse) -> Unit = definedExternally): Request<DeleteObjectResponse, AWSError>
    open fun deleteSchema(params: DeleteSchemaRequest, callback: (err: AWSError, data: DeleteSchemaResponse) -> Unit = definedExternally): Request<DeleteSchemaResponse, AWSError>
    open fun deleteSchema(callback: (err: AWSError, data: DeleteSchemaResponse) -> Unit = definedExternally): Request<DeleteSchemaResponse, AWSError>
    open fun deleteTypedLinkFacet(params: DeleteTypedLinkFacetRequest, callback: (err: AWSError, data: DeleteTypedLinkFacetResponse) -> Unit = definedExternally): Request<DeleteTypedLinkFacetResponse, AWSError>
    open fun deleteTypedLinkFacet(callback: (err: AWSError, data: DeleteTypedLinkFacetResponse) -> Unit = definedExternally): Request<DeleteTypedLinkFacetResponse, AWSError>
    open fun detachFromIndex(params: DetachFromIndexRequest, callback: (err: AWSError, data: DetachFromIndexResponse) -> Unit = definedExternally): Request<DetachFromIndexResponse, AWSError>
    open fun detachFromIndex(callback: (err: AWSError, data: DetachFromIndexResponse) -> Unit = definedExternally): Request<DetachFromIndexResponse, AWSError>
    open fun detachObject(params: DetachObjectRequest, callback: (err: AWSError, data: DetachObjectResponse) -> Unit = definedExternally): Request<DetachObjectResponse, AWSError>
    open fun detachObject(callback: (err: AWSError, data: DetachObjectResponse) -> Unit = definedExternally): Request<DetachObjectResponse, AWSError>
    open fun detachPolicy(params: DetachPolicyRequest, callback: (err: AWSError, data: DetachPolicyResponse) -> Unit = definedExternally): Request<DetachPolicyResponse, AWSError>
    open fun detachPolicy(callback: (err: AWSError, data: DetachPolicyResponse) -> Unit = definedExternally): Request<DetachPolicyResponse, AWSError>
    open fun detachTypedLink(params: DetachTypedLinkRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun detachTypedLink(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disableDirectory(params: DisableDirectoryRequest, callback: (err: AWSError, data: DisableDirectoryResponse) -> Unit = definedExternally): Request<DisableDirectoryResponse, AWSError>
    open fun disableDirectory(callback: (err: AWSError, data: DisableDirectoryResponse) -> Unit = definedExternally): Request<DisableDirectoryResponse, AWSError>
    open fun enableDirectory(params: EnableDirectoryRequest, callback: (err: AWSError, data: EnableDirectoryResponse) -> Unit = definedExternally): Request<EnableDirectoryResponse, AWSError>
    open fun enableDirectory(callback: (err: AWSError, data: EnableDirectoryResponse) -> Unit = definedExternally): Request<EnableDirectoryResponse, AWSError>
    open fun getAppliedSchemaVersion(params: GetAppliedSchemaVersionRequest, callback: (err: AWSError, data: GetAppliedSchemaVersionResponse) -> Unit = definedExternally): Request<GetAppliedSchemaVersionResponse, AWSError>
    open fun getAppliedSchemaVersion(callback: (err: AWSError, data: GetAppliedSchemaVersionResponse) -> Unit = definedExternally): Request<GetAppliedSchemaVersionResponse, AWSError>
    open fun getDirectory(params: GetDirectoryRequest, callback: (err: AWSError, data: GetDirectoryResponse) -> Unit = definedExternally): Request<GetDirectoryResponse, AWSError>
    open fun getDirectory(callback: (err: AWSError, data: GetDirectoryResponse) -> Unit = definedExternally): Request<GetDirectoryResponse, AWSError>
    open fun getFacet(params: GetFacetRequest, callback: (err: AWSError, data: GetFacetResponse) -> Unit = definedExternally): Request<GetFacetResponse, AWSError>
    open fun getFacet(callback: (err: AWSError, data: GetFacetResponse) -> Unit = definedExternally): Request<GetFacetResponse, AWSError>
    open fun getLinkAttributes(params: GetLinkAttributesRequest, callback: (err: AWSError, data: GetLinkAttributesResponse) -> Unit = definedExternally): Request<GetLinkAttributesResponse, AWSError>
    open fun getLinkAttributes(callback: (err: AWSError, data: GetLinkAttributesResponse) -> Unit = definedExternally): Request<GetLinkAttributesResponse, AWSError>
    open fun getObjectAttributes(params: GetObjectAttributesRequest, callback: (err: AWSError, data: GetObjectAttributesResponse) -> Unit = definedExternally): Request<GetObjectAttributesResponse, AWSError>
    open fun getObjectAttributes(callback: (err: AWSError, data: GetObjectAttributesResponse) -> Unit = definedExternally): Request<GetObjectAttributesResponse, AWSError>
    open fun getObjectInformation(params: GetObjectInformationRequest, callback: (err: AWSError, data: GetObjectInformationResponse) -> Unit = definedExternally): Request<GetObjectInformationResponse, AWSError>
    open fun getObjectInformation(callback: (err: AWSError, data: GetObjectInformationResponse) -> Unit = definedExternally): Request<GetObjectInformationResponse, AWSError>
    open fun getSchemaAsJson(params: GetSchemaAsJsonRequest, callback: (err: AWSError, data: GetSchemaAsJsonResponse) -> Unit = definedExternally): Request<GetSchemaAsJsonResponse, AWSError>
    open fun getSchemaAsJson(callback: (err: AWSError, data: GetSchemaAsJsonResponse) -> Unit = definedExternally): Request<GetSchemaAsJsonResponse, AWSError>
    open fun getTypedLinkFacetInformation(params: GetTypedLinkFacetInformationRequest, callback: (err: AWSError, data: GetTypedLinkFacetInformationResponse) -> Unit = definedExternally): Request<GetTypedLinkFacetInformationResponse, AWSError>
    open fun getTypedLinkFacetInformation(callback: (err: AWSError, data: GetTypedLinkFacetInformationResponse) -> Unit = definedExternally): Request<GetTypedLinkFacetInformationResponse, AWSError>
    open fun listAppliedSchemaArns(params: ListAppliedSchemaArnsRequest, callback: (err: AWSError, data: ListAppliedSchemaArnsResponse) -> Unit = definedExternally): Request<ListAppliedSchemaArnsResponse, AWSError>
    open fun listAppliedSchemaArns(callback: (err: AWSError, data: ListAppliedSchemaArnsResponse) -> Unit = definedExternally): Request<ListAppliedSchemaArnsResponse, AWSError>
    open fun listAttachedIndices(params: ListAttachedIndicesRequest, callback: (err: AWSError, data: ListAttachedIndicesResponse) -> Unit = definedExternally): Request<ListAttachedIndicesResponse, AWSError>
    open fun listAttachedIndices(callback: (err: AWSError, data: ListAttachedIndicesResponse) -> Unit = definedExternally): Request<ListAttachedIndicesResponse, AWSError>
    open fun listDevelopmentSchemaArns(params: ListDevelopmentSchemaArnsRequest, callback: (err: AWSError, data: ListDevelopmentSchemaArnsResponse) -> Unit = definedExternally): Request<ListDevelopmentSchemaArnsResponse, AWSError>
    open fun listDevelopmentSchemaArns(callback: (err: AWSError, data: ListDevelopmentSchemaArnsResponse) -> Unit = definedExternally): Request<ListDevelopmentSchemaArnsResponse, AWSError>
    open fun listDirectories(params: ListDirectoriesRequest, callback: (err: AWSError, data: ListDirectoriesResponse) -> Unit = definedExternally): Request<ListDirectoriesResponse, AWSError>
    open fun listDirectories(callback: (err: AWSError, data: ListDirectoriesResponse) -> Unit = definedExternally): Request<ListDirectoriesResponse, AWSError>
    open fun listFacetAttributes(params: ListFacetAttributesRequest, callback: (err: AWSError, data: ListFacetAttributesResponse) -> Unit = definedExternally): Request<ListFacetAttributesResponse, AWSError>
    open fun listFacetAttributes(callback: (err: AWSError, data: ListFacetAttributesResponse) -> Unit = definedExternally): Request<ListFacetAttributesResponse, AWSError>
    open fun listFacetNames(params: ListFacetNamesRequest, callback: (err: AWSError, data: ListFacetNamesResponse) -> Unit = definedExternally): Request<ListFacetNamesResponse, AWSError>
    open fun listFacetNames(callback: (err: AWSError, data: ListFacetNamesResponse) -> Unit = definedExternally): Request<ListFacetNamesResponse, AWSError>
    open fun listIncomingTypedLinks(params: ListIncomingTypedLinksRequest, callback: (err: AWSError, data: ListIncomingTypedLinksResponse) -> Unit = definedExternally): Request<ListIncomingTypedLinksResponse, AWSError>
    open fun listIncomingTypedLinks(callback: (err: AWSError, data: ListIncomingTypedLinksResponse) -> Unit = definedExternally): Request<ListIncomingTypedLinksResponse, AWSError>
    open fun listIndex(params: ListIndexRequest, callback: (err: AWSError, data: ListIndexResponse) -> Unit = definedExternally): Request<ListIndexResponse, AWSError>
    open fun listIndex(callback: (err: AWSError, data: ListIndexResponse) -> Unit = definedExternally): Request<ListIndexResponse, AWSError>
    open fun listManagedSchemaArns(params: ListManagedSchemaArnsRequest, callback: (err: AWSError, data: ListManagedSchemaArnsResponse) -> Unit = definedExternally): Request<ListManagedSchemaArnsResponse, AWSError>
    open fun listManagedSchemaArns(callback: (err: AWSError, data: ListManagedSchemaArnsResponse) -> Unit = definedExternally): Request<ListManagedSchemaArnsResponse, AWSError>
    open fun listObjectAttributes(params: ListObjectAttributesRequest, callback: (err: AWSError, data: ListObjectAttributesResponse) -> Unit = definedExternally): Request<ListObjectAttributesResponse, AWSError>
    open fun listObjectAttributes(callback: (err: AWSError, data: ListObjectAttributesResponse) -> Unit = definedExternally): Request<ListObjectAttributesResponse, AWSError>
    open fun listObjectChildren(params: ListObjectChildrenRequest, callback: (err: AWSError, data: ListObjectChildrenResponse) -> Unit = definedExternally): Request<ListObjectChildrenResponse, AWSError>
    open fun listObjectChildren(callback: (err: AWSError, data: ListObjectChildrenResponse) -> Unit = definedExternally): Request<ListObjectChildrenResponse, AWSError>
    open fun listObjectParentPaths(params: ListObjectParentPathsRequest, callback: (err: AWSError, data: ListObjectParentPathsResponse) -> Unit = definedExternally): Request<ListObjectParentPathsResponse, AWSError>
    open fun listObjectParentPaths(callback: (err: AWSError, data: ListObjectParentPathsResponse) -> Unit = definedExternally): Request<ListObjectParentPathsResponse, AWSError>
    open fun listObjectParents(params: ListObjectParentsRequest, callback: (err: AWSError, data: ListObjectParentsResponse) -> Unit = definedExternally): Request<ListObjectParentsResponse, AWSError>
    open fun listObjectParents(callback: (err: AWSError, data: ListObjectParentsResponse) -> Unit = definedExternally): Request<ListObjectParentsResponse, AWSError>
    open fun listObjectPolicies(params: ListObjectPoliciesRequest, callback: (err: AWSError, data: ListObjectPoliciesResponse) -> Unit = definedExternally): Request<ListObjectPoliciesResponse, AWSError>
    open fun listObjectPolicies(callback: (err: AWSError, data: ListObjectPoliciesResponse) -> Unit = definedExternally): Request<ListObjectPoliciesResponse, AWSError>
    open fun listOutgoingTypedLinks(params: ListOutgoingTypedLinksRequest, callback: (err: AWSError, data: ListOutgoingTypedLinksResponse) -> Unit = definedExternally): Request<ListOutgoingTypedLinksResponse, AWSError>
    open fun listOutgoingTypedLinks(callback: (err: AWSError, data: ListOutgoingTypedLinksResponse) -> Unit = definedExternally): Request<ListOutgoingTypedLinksResponse, AWSError>
    open fun listPolicyAttachments(params: ListPolicyAttachmentsRequest, callback: (err: AWSError, data: ListPolicyAttachmentsResponse) -> Unit = definedExternally): Request<ListPolicyAttachmentsResponse, AWSError>
    open fun listPolicyAttachments(callback: (err: AWSError, data: ListPolicyAttachmentsResponse) -> Unit = definedExternally): Request<ListPolicyAttachmentsResponse, AWSError>
    open fun listPublishedSchemaArns(params: ListPublishedSchemaArnsRequest, callback: (err: AWSError, data: ListPublishedSchemaArnsResponse) -> Unit = definedExternally): Request<ListPublishedSchemaArnsResponse, AWSError>
    open fun listPublishedSchemaArns(callback: (err: AWSError, data: ListPublishedSchemaArnsResponse) -> Unit = definedExternally): Request<ListPublishedSchemaArnsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTypedLinkFacetAttributes(params: ListTypedLinkFacetAttributesRequest, callback: (err: AWSError, data: ListTypedLinkFacetAttributesResponse) -> Unit = definedExternally): Request<ListTypedLinkFacetAttributesResponse, AWSError>
    open fun listTypedLinkFacetAttributes(callback: (err: AWSError, data: ListTypedLinkFacetAttributesResponse) -> Unit = definedExternally): Request<ListTypedLinkFacetAttributesResponse, AWSError>
    open fun listTypedLinkFacetNames(params: ListTypedLinkFacetNamesRequest, callback: (err: AWSError, data: ListTypedLinkFacetNamesResponse) -> Unit = definedExternally): Request<ListTypedLinkFacetNamesResponse, AWSError>
    open fun listTypedLinkFacetNames(callback: (err: AWSError, data: ListTypedLinkFacetNamesResponse) -> Unit = definedExternally): Request<ListTypedLinkFacetNamesResponse, AWSError>
    open fun lookupPolicy(params: LookupPolicyRequest, callback: (err: AWSError, data: LookupPolicyResponse) -> Unit = definedExternally): Request<LookupPolicyResponse, AWSError>
    open fun lookupPolicy(callback: (err: AWSError, data: LookupPolicyResponse) -> Unit = definedExternally): Request<LookupPolicyResponse, AWSError>
    open fun publishSchema(params: PublishSchemaRequest, callback: (err: AWSError, data: PublishSchemaResponse) -> Unit = definedExternally): Request<PublishSchemaResponse, AWSError>
    open fun publishSchema(callback: (err: AWSError, data: PublishSchemaResponse) -> Unit = definedExternally): Request<PublishSchemaResponse, AWSError>
    open fun putSchemaFromJson(params: PutSchemaFromJsonRequest, callback: (err: AWSError, data: PutSchemaFromJsonResponse) -> Unit = definedExternally): Request<PutSchemaFromJsonResponse, AWSError>
    open fun putSchemaFromJson(callback: (err: AWSError, data: PutSchemaFromJsonResponse) -> Unit = definedExternally): Request<PutSchemaFromJsonResponse, AWSError>
    open fun removeFacetFromObject(params: RemoveFacetFromObjectRequest, callback: (err: AWSError, data: RemoveFacetFromObjectResponse) -> Unit = definedExternally): Request<RemoveFacetFromObjectResponse, AWSError>
    open fun removeFacetFromObject(callback: (err: AWSError, data: RemoveFacetFromObjectResponse) -> Unit = definedExternally): Request<RemoveFacetFromObjectResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateFacet(params: UpdateFacetRequest, callback: (err: AWSError, data: UpdateFacetResponse) -> Unit = definedExternally): Request<UpdateFacetResponse, AWSError>
    open fun updateFacet(callback: (err: AWSError, data: UpdateFacetResponse) -> Unit = definedExternally): Request<UpdateFacetResponse, AWSError>
    open fun updateLinkAttributes(params: UpdateLinkAttributesRequest, callback: (err: AWSError, data: UpdateLinkAttributesResponse) -> Unit = definedExternally): Request<UpdateLinkAttributesResponse, AWSError>
    open fun updateLinkAttributes(callback: (err: AWSError, data: UpdateLinkAttributesResponse) -> Unit = definedExternally): Request<UpdateLinkAttributesResponse, AWSError>
    open fun updateObjectAttributes(params: UpdateObjectAttributesRequest, callback: (err: AWSError, data: UpdateObjectAttributesResponse) -> Unit = definedExternally): Request<UpdateObjectAttributesResponse, AWSError>
    open fun updateObjectAttributes(callback: (err: AWSError, data: UpdateObjectAttributesResponse) -> Unit = definedExternally): Request<UpdateObjectAttributesResponse, AWSError>
    open fun updateSchema(params: UpdateSchemaRequest, callback: (err: AWSError, data: UpdateSchemaResponse) -> Unit = definedExternally): Request<UpdateSchemaResponse, AWSError>
    open fun updateSchema(callback: (err: AWSError, data: UpdateSchemaResponse) -> Unit = definedExternally): Request<UpdateSchemaResponse, AWSError>
    open fun updateTypedLinkFacet(params: UpdateTypedLinkFacetRequest, callback: (err: AWSError, data: UpdateTypedLinkFacetResponse) -> Unit = definedExternally): Request<UpdateTypedLinkFacetResponse, AWSError>
    open fun updateTypedLinkFacet(callback: (err: AWSError, data: UpdateTypedLinkFacetResponse) -> Unit = definedExternally): Request<UpdateTypedLinkFacetResponse, AWSError>
    open fun upgradeAppliedSchema(params: UpgradeAppliedSchemaRequest, callback: (err: AWSError, data: UpgradeAppliedSchemaResponse) -> Unit = definedExternally): Request<UpgradeAppliedSchemaResponse, AWSError>
    open fun upgradeAppliedSchema(callback: (err: AWSError, data: UpgradeAppliedSchemaResponse) -> Unit = definedExternally): Request<UpgradeAppliedSchemaResponse, AWSError>
    open fun upgradePublishedSchema(params: UpgradePublishedSchemaRequest, callback: (err: AWSError, data: UpgradePublishedSchemaResponse) -> Unit = definedExternally): Request<UpgradePublishedSchemaResponse, AWSError>
    open fun upgradePublishedSchema(callback: (err: AWSError, data: UpgradePublishedSchemaResponse) -> Unit = definedExternally): Request<UpgradePublishedSchemaResponse, AWSError>
    interface AddFacetToObjectRequest {
        var DirectoryArn: Arn
        var SchemaFacet: SchemaFacet
        var ObjectAttributeList: AttributeKeyAndValueList?
            get() = definedExternally
            set(value) = definedExternally
        var ObjectReference: ObjectReference
    }
    interface AddFacetToObjectResponse
    interface ApplySchemaRequest {
        var PublishedSchemaArn: Arn
        var DirectoryArn: Arn
    }
    interface ApplySchemaResponse {
        var AppliedSchemaArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DirectoryArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttachObjectRequest {
        var DirectoryArn: Arn
        var ParentReference: ObjectReference
        var ChildReference: ObjectReference
        var LinkName: LinkName
    }
    interface AttachObjectResponse {
        var AttachedObjectIdentifier: ObjectIdentifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttachPolicyRequest {
        var DirectoryArn: Arn
        var PolicyReference: ObjectReference
        var ObjectReference: ObjectReference
    }
    interface AttachPolicyResponse
    interface AttachToIndexRequest {
        var DirectoryArn: Arn
        var IndexReference: ObjectReference
        var TargetReference: ObjectReference
    }
    interface AttachToIndexResponse {
        var AttachedObjectIdentifier: ObjectIdentifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttachTypedLinkRequest {
        var DirectoryArn: Arn
        var SourceObjectReference: ObjectReference
        var TargetObjectReference: ObjectReference
        var TypedLinkFacet: TypedLinkSchemaAndFacetName
        var Attributes: AttributeNameAndValueList
    }
    interface AttachTypedLinkResponse {
        var TypedLinkSpecifier: TypedLinkSpecifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttributeKey {
        var SchemaArn: Arn
        var FacetName: FacetName
        var Name: AttributeName
    }
    interface AttributeKeyAndValue {
        var Key: AttributeKey
        var Value: TypedAttributeValue
    }
    interface AttributeNameAndValue {
        var AttributeName: AttributeName
        var Value: TypedAttributeValue
    }
    interface BatchAddFacetToObject {
        var SchemaFacet: SchemaFacet
        var ObjectAttributeList: AttributeKeyAndValueList
        var ObjectReference: ObjectReference
    }
    interface BatchAddFacetToObjectResponse
    interface BatchAttachObject {
        var ParentReference: ObjectReference
        var ChildReference: ObjectReference
        var LinkName: LinkName
    }
    interface BatchAttachObjectResponse {
        var attachedObjectIdentifier: ObjectIdentifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchAttachPolicy {
        var PolicyReference: ObjectReference
        var ObjectReference: ObjectReference
    }
    interface BatchAttachPolicyResponse
    interface BatchAttachToIndex {
        var IndexReference: ObjectReference
        var TargetReference: ObjectReference
    }
    interface BatchAttachToIndexResponse {
        var AttachedObjectIdentifier: ObjectIdentifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchAttachTypedLink {
        var SourceObjectReference: ObjectReference
        var TargetObjectReference: ObjectReference
        var TypedLinkFacet: TypedLinkSchemaAndFacetName
        var Attributes: AttributeNameAndValueList
    }
    interface BatchAttachTypedLinkResponse {
        var TypedLinkSpecifier: TypedLinkSpecifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchCreateIndex {
        var OrderedIndexedAttributeList: AttributeKeyList
        var IsUnique: Bool
        var ParentReference: ObjectReference?
            get() = definedExternally
            set(value) = definedExternally
        var LinkName: LinkName?
            get() = definedExternally
            set(value) = definedExternally
        var BatchReferenceName: BatchReferenceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchCreateIndexResponse {
        var ObjectIdentifier: ObjectIdentifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchCreateObject {
        var SchemaFacet: SchemaFacetList
        var ObjectAttributeList: AttributeKeyAndValueList
        var ParentReference: ObjectReference?
            get() = definedExternally
            set(value) = definedExternally
        var LinkName: LinkName?
            get() = definedExternally
            set(value) = definedExternally
        var BatchReferenceName: BatchReferenceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchCreateObjectResponse {
        var ObjectIdentifier: ObjectIdentifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDeleteObject {
        var ObjectReference: ObjectReference
    }
    interface BatchDeleteObjectResponse
    interface BatchDetachFromIndex {
        var IndexReference: ObjectReference
        var TargetReference: ObjectReference
    }
    interface BatchDetachFromIndexResponse {
        var DetachedObjectIdentifier: ObjectIdentifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDetachObject {
        var ParentReference: ObjectReference
        var LinkName: LinkName
        var BatchReferenceName: BatchReferenceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDetachObjectResponse {
        var detachedObjectIdentifier: ObjectIdentifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDetachPolicy {
        var PolicyReference: ObjectReference
        var ObjectReference: ObjectReference
    }
    interface BatchDetachPolicyResponse
    interface BatchDetachTypedLink {
        var TypedLinkSpecifier: TypedLinkSpecifier
    }
    interface BatchDetachTypedLinkResponse
    interface BatchGetLinkAttributes {
        var TypedLinkSpecifier: TypedLinkSpecifier
        var AttributeNames: AttributeNameList
    }
    interface BatchGetLinkAttributesResponse {
        var Attributes: AttributeKeyAndValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetObjectAttributes {
        var ObjectReference: ObjectReference
        var SchemaFacet: SchemaFacet
        var AttributeNames: AttributeNameList
    }
    interface BatchGetObjectAttributesResponse {
        var Attributes: AttributeKeyAndValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetObjectInformation {
        var ObjectReference: ObjectReference
    }
    interface BatchGetObjectInformationResponse {
        var SchemaFacets: SchemaFacetList?
            get() = definedExternally
            set(value) = definedExternally
        var ObjectIdentifier: ObjectIdentifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchListAttachedIndices {
        var TargetReference: ObjectReference
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchListAttachedIndicesResponse {
        var IndexAttachments: IndexAttachmentList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchListIncomingTypedLinks {
        var ObjectReference: ObjectReference
        var FilterAttributeRanges: TypedLinkAttributeRangeList?
            get() = definedExternally
            set(value) = definedExternally
        var FilterTypedLink: TypedLinkSchemaAndFacetName?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchListIncomingTypedLinksResponse {
        var LinkSpecifiers: TypedLinkSpecifierList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchListIndex {
        var RangesOnIndexedValues: ObjectAttributeRangeList?
            get() = definedExternally
            set(value) = definedExternally
        var IndexReference: ObjectReference
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchListIndexResponse {
        var IndexAttachments: IndexAttachmentList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchListObjectAttributes {
        var ObjectReference: ObjectReference
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
        var FacetFilter: SchemaFacet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchListObjectAttributesResponse {
        var Attributes: AttributeKeyAndValueList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchListObjectChildren {
        var ObjectReference: ObjectReference
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchListObjectChildrenResponse {
        var Children: LinkNameToObjectIdentifierMap?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchListObjectParentPaths {
        var ObjectReference: ObjectReference
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchListObjectParentPathsResponse {
        var PathToObjectIdentifiersList: PathToObjectIdentifiersList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchListObjectParents {
        var ObjectReference: ObjectReference
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchListObjectParentsResponse {
        var ParentLinks: ObjectIdentifierAndLinkNameList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchListObjectPolicies {
        var ObjectReference: ObjectReference
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchListObjectPoliciesResponse {
        var AttachedPolicyIds: ObjectIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchListOutgoingTypedLinks {
        var ObjectReference: ObjectReference
        var FilterAttributeRanges: TypedLinkAttributeRangeList?
            get() = definedExternally
            set(value) = definedExternally
        var FilterTypedLink: TypedLinkSchemaAndFacetName?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchListOutgoingTypedLinksResponse {
        var TypedLinkSpecifiers: TypedLinkSpecifierList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchListPolicyAttachments {
        var PolicyReference: ObjectReference
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchListPolicyAttachmentsResponse {
        var ObjectIdentifiers: ObjectIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchLookupPolicy {
        var ObjectReference: ObjectReference
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchLookupPolicyResponse {
        var PolicyToPathList: PolicyToPathList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchReadException {
        var Type: String /* "ValidationException" | "InvalidArnException" | "ResourceNotFoundException" | "InvalidNextTokenException" | "AccessDeniedException" | "NotNodeException" | "FacetValidationException" | "CannotListParentOfRootException" | "NotIndexException" | "NotPolicyException" | "DirectoryNotEnabledException" | "LimitExceededException" | "InternalServiceException" | String */
        var Message: ExceptionMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchReadOperation {
        var ListObjectAttributes: BatchListObjectAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var ListObjectChildren: BatchListObjectChildren?
            get() = definedExternally
            set(value) = definedExternally
        var ListAttachedIndices: BatchListAttachedIndices?
            get() = definedExternally
            set(value) = definedExternally
        var ListObjectParentPaths: BatchListObjectParentPaths?
            get() = definedExternally
            set(value) = definedExternally
        var GetObjectInformation: BatchGetObjectInformation?
            get() = definedExternally
            set(value) = definedExternally
        var GetObjectAttributes: BatchGetObjectAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var ListObjectParents: BatchListObjectParents?
            get() = definedExternally
            set(value) = definedExternally
        var ListObjectPolicies: BatchListObjectPolicies?
            get() = definedExternally
            set(value) = definedExternally
        var ListPolicyAttachments: BatchListPolicyAttachments?
            get() = definedExternally
            set(value) = definedExternally
        var LookupPolicy: BatchLookupPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var ListIndex: BatchListIndex?
            get() = definedExternally
            set(value) = definedExternally
        var ListOutgoingTypedLinks: BatchListOutgoingTypedLinks?
            get() = definedExternally
            set(value) = definedExternally
        var ListIncomingTypedLinks: BatchListIncomingTypedLinks?
            get() = definedExternally
            set(value) = definedExternally
        var GetLinkAttributes: BatchGetLinkAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchReadOperationResponse {
        var SuccessfulResponse: BatchReadSuccessfulResponse?
            get() = definedExternally
            set(value) = definedExternally
        var ExceptionResponse: BatchReadException?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchReadRequest {
        var DirectoryArn: Arn
        var Operations: BatchReadOperationList
        var ConsistencyLevel: String /* "SERIALIZABLE" | "EVENTUAL" | String */
    }
    interface BatchReadResponse {
        var Responses: BatchReadOperationResponseList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchReadSuccessfulResponse {
        var ListObjectAttributes: BatchListObjectAttributesResponse?
            get() = definedExternally
            set(value) = definedExternally
        var ListObjectChildren: BatchListObjectChildrenResponse?
            get() = definedExternally
            set(value) = definedExternally
        var GetObjectInformation: BatchGetObjectInformationResponse?
            get() = definedExternally
            set(value) = definedExternally
        var GetObjectAttributes: BatchGetObjectAttributesResponse?
            get() = definedExternally
            set(value) = definedExternally
        var ListAttachedIndices: BatchListAttachedIndicesResponse?
            get() = definedExternally
            set(value) = definedExternally
        var ListObjectParentPaths: BatchListObjectParentPathsResponse?
            get() = definedExternally
            set(value) = definedExternally
        var ListObjectPolicies: BatchListObjectPoliciesResponse?
            get() = definedExternally
            set(value) = definedExternally
        var ListPolicyAttachments: BatchListPolicyAttachmentsResponse?
            get() = definedExternally
            set(value) = definedExternally
        var LookupPolicy: BatchLookupPolicyResponse?
            get() = definedExternally
            set(value) = definedExternally
        var ListIndex: BatchListIndexResponse?
            get() = definedExternally
            set(value) = definedExternally
        var ListOutgoingTypedLinks: BatchListOutgoingTypedLinksResponse?
            get() = definedExternally
            set(value) = definedExternally
        var ListIncomingTypedLinks: BatchListIncomingTypedLinksResponse?
            get() = definedExternally
            set(value) = definedExternally
        var GetLinkAttributes: BatchGetLinkAttributesResponse?
            get() = definedExternally
            set(value) = definedExternally
        var ListObjectParents: BatchListObjectParentsResponse?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchRemoveFacetFromObject {
        var SchemaFacet: SchemaFacet
        var ObjectReference: ObjectReference
    }
    interface BatchRemoveFacetFromObjectResponse
    interface BatchUpdateLinkAttributes {
        var TypedLinkSpecifier: TypedLinkSpecifier
        var AttributeUpdates: LinkAttributeUpdateList
    }
    interface BatchUpdateLinkAttributesResponse
    interface BatchUpdateObjectAttributes {
        var ObjectReference: ObjectReference
        var AttributeUpdates: ObjectAttributeUpdateList
    }
    interface BatchUpdateObjectAttributesResponse {
        var ObjectIdentifier: ObjectIdentifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchWriteOperation {
        var CreateObject: BatchCreateObject?
            get() = definedExternally
            set(value) = definedExternally
        var AttachObject: BatchAttachObject?
            get() = definedExternally
            set(value) = definedExternally
        var DetachObject: BatchDetachObject?
            get() = definedExternally
            set(value) = definedExternally
        var UpdateObjectAttributes: BatchUpdateObjectAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var DeleteObject: BatchDeleteObject?
            get() = definedExternally
            set(value) = definedExternally
        var AddFacetToObject: BatchAddFacetToObject?
            get() = definedExternally
            set(value) = definedExternally
        var RemoveFacetFromObject: BatchRemoveFacetFromObject?
            get() = definedExternally
            set(value) = definedExternally
        var AttachPolicy: BatchAttachPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var DetachPolicy: BatchDetachPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var CreateIndex: BatchCreateIndex?
            get() = definedExternally
            set(value) = definedExternally
        var AttachToIndex: BatchAttachToIndex?
            get() = definedExternally
            set(value) = definedExternally
        var DetachFromIndex: BatchDetachFromIndex?
            get() = definedExternally
            set(value) = definedExternally
        var AttachTypedLink: BatchAttachTypedLink?
            get() = definedExternally
            set(value) = definedExternally
        var DetachTypedLink: BatchDetachTypedLink?
            get() = definedExternally
            set(value) = definedExternally
        var UpdateLinkAttributes: BatchUpdateLinkAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchWriteOperationResponse {
        var CreateObject: BatchCreateObjectResponse?
            get() = definedExternally
            set(value) = definedExternally
        var AttachObject: BatchAttachObjectResponse?
            get() = definedExternally
            set(value) = definedExternally
        var DetachObject: BatchDetachObjectResponse?
            get() = definedExternally
            set(value) = definedExternally
        var UpdateObjectAttributes: BatchUpdateObjectAttributesResponse?
            get() = definedExternally
            set(value) = definedExternally
        var DeleteObject: BatchDeleteObjectResponse?
            get() = definedExternally
            set(value) = definedExternally
        var AddFacetToObject: BatchAddFacetToObjectResponse?
            get() = definedExternally
            set(value) = definedExternally
        var RemoveFacetFromObject: BatchRemoveFacetFromObjectResponse?
            get() = definedExternally
            set(value) = definedExternally
        var AttachPolicy: BatchAttachPolicyResponse?
            get() = definedExternally
            set(value) = definedExternally
        var DetachPolicy: BatchDetachPolicyResponse?
            get() = definedExternally
            set(value) = definedExternally
        var CreateIndex: BatchCreateIndexResponse?
            get() = definedExternally
            set(value) = definedExternally
        var AttachToIndex: BatchAttachToIndexResponse?
            get() = definedExternally
            set(value) = definedExternally
        var DetachFromIndex: BatchDetachFromIndexResponse?
            get() = definedExternally
            set(value) = definedExternally
        var AttachTypedLink: BatchAttachTypedLinkResponse?
            get() = definedExternally
            set(value) = definedExternally
        var DetachTypedLink: BatchDetachTypedLinkResponse?
            get() = definedExternally
            set(value) = definedExternally
        var UpdateLinkAttributes: BatchUpdateLinkAttributesResponse?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchWriteRequest {
        var DirectoryArn: Arn
        var Operations: BatchWriteOperationList
    }
    interface BatchWriteResponse {
        var Responses: BatchWriteOperationResponseList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDirectoryRequest {
        var Name: DirectoryName
        var SchemaArn: Arn
    }
    interface CreateDirectoryResponse {
        var DirectoryArn: DirectoryArn
        var Name: DirectoryName
        var ObjectIdentifier: ObjectIdentifier
        var AppliedSchemaArn: Arn
    }
    interface CreateFacetRequest {
        var SchemaArn: Arn
        var Name: FacetName
        var Attributes: FacetAttributeList?
            get() = definedExternally
            set(value) = definedExternally
        var ObjectType: String /* "NODE" | "LEAF_NODE" | "POLICY" | "INDEX" | String */
        var FacetStyle: String /* "STATIC" | "DYNAMIC" | String */
    }
    interface CreateFacetResponse
    interface CreateIndexRequest {
        var DirectoryArn: Arn
        var OrderedIndexedAttributeList: AttributeKeyList
        var IsUnique: Bool
        var ParentReference: ObjectReference?
            get() = definedExternally
            set(value) = definedExternally
        var LinkName: LinkName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateIndexResponse {
        var ObjectIdentifier: ObjectIdentifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateObjectRequest {
        var DirectoryArn: Arn
        var SchemaFacets: SchemaFacetList
        var ObjectAttributeList: AttributeKeyAndValueList?
            get() = definedExternally
            set(value) = definedExternally
        var ParentReference: ObjectReference?
            get() = definedExternally
            set(value) = definedExternally
        var LinkName: LinkName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateObjectResponse {
        var ObjectIdentifier: ObjectIdentifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSchemaRequest {
        var Name: SchemaName
    }
    interface CreateSchemaResponse {
        var SchemaArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTypedLinkFacetRequest {
        var SchemaArn: Arn
        var Facet: TypedLinkFacet
    }
    interface CreateTypedLinkFacetResponse
    interface DeleteDirectoryRequest {
        var DirectoryArn: Arn
    }
    interface DeleteDirectoryResponse {
        var DirectoryArn: Arn
    }
    interface DeleteFacetRequest {
        var SchemaArn: Arn
        var Name: FacetName
    }
    interface DeleteFacetResponse
    interface DeleteObjectRequest {
        var DirectoryArn: Arn
        var ObjectReference: ObjectReference
    }
    interface DeleteObjectResponse
    interface DeleteSchemaRequest {
        var SchemaArn: Arn
    }
    interface DeleteSchemaResponse {
        var SchemaArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteTypedLinkFacetRequest {
        var SchemaArn: Arn
        var Name: TypedLinkName
    }
    interface DeleteTypedLinkFacetResponse
    interface DetachFromIndexRequest {
        var DirectoryArn: Arn
        var IndexReference: ObjectReference
        var TargetReference: ObjectReference
    }
    interface DetachFromIndexResponse {
        var DetachedObjectIdentifier: ObjectIdentifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetachObjectRequest {
        var DirectoryArn: Arn
        var ParentReference: ObjectReference
        var LinkName: LinkName
    }
    interface DetachObjectResponse {
        var DetachedObjectIdentifier: ObjectIdentifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetachPolicyRequest {
        var DirectoryArn: Arn
        var PolicyReference: ObjectReference
        var ObjectReference: ObjectReference
    }
    interface DetachPolicyResponse
    interface DetachTypedLinkRequest {
        var DirectoryArn: Arn
        var TypedLinkSpecifier: TypedLinkSpecifier
    }
    interface Directory {
        var Name: DirectoryName?
            get() = definedExternally
            set(value) = definedExternally
        var DirectoryArn: DirectoryArn?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ENABLED" | "DISABLED" | "DELETED" | String */
        var CreationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisableDirectoryRequest {
        var DirectoryArn: Arn
    }
    interface DisableDirectoryResponse {
        var DirectoryArn: Arn
    }
    interface EnableDirectoryRequest {
        var DirectoryArn: Arn
    }
    interface EnableDirectoryResponse {
        var DirectoryArn: Arn
    }
    interface Facet {
        var Name: FacetName?
            get() = definedExternally
            set(value) = definedExternally
        var ObjectType: String /* "NODE" | "LEAF_NODE" | "POLICY" | "INDEX" | String */
        var FacetStyle: String /* "STATIC" | "DYNAMIC" | String */
    }
    interface FacetAttribute {
        var Name: AttributeName
        var AttributeDefinition: FacetAttributeDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var AttributeReference: FacetAttributeReference?
            get() = definedExternally
            set(value) = definedExternally
        var RequiredBehavior: String /* "REQUIRED_ALWAYS" | "NOT_REQUIRED" | String */
    }
    interface FacetAttributeDefinition {
        var Type: String /* "STRING" | "BINARY" | "BOOLEAN" | "NUMBER" | "DATETIME" | "VARIANT" | String */
        var DefaultValue: TypedAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var IsImmutable: Bool?
            get() = definedExternally
            set(value) = definedExternally
        var Rules: RuleMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FacetAttributeReference {
        var TargetFacetName: FacetName
        var TargetAttributeName: AttributeName
    }
    interface FacetAttributeUpdate {
        var Attribute: FacetAttribute?
            get() = definedExternally
            set(value) = definedExternally
        var Action: String /* "CREATE_OR_UPDATE" | "DELETE" | String */
    }
    interface GetAppliedSchemaVersionRequest {
        var SchemaArn: Arn
    }
    interface GetAppliedSchemaVersionResponse {
        var AppliedSchemaArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDirectoryRequest {
        var DirectoryArn: DirectoryArn
    }
    interface GetDirectoryResponse {
        var Directory: Directory
    }
    interface GetFacetRequest {
        var SchemaArn: Arn
        var Name: FacetName
    }
    interface GetFacetResponse {
        var Facet: Facet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLinkAttributesRequest {
        var DirectoryArn: Arn
        var TypedLinkSpecifier: TypedLinkSpecifier
        var AttributeNames: AttributeNameList
        var ConsistencyLevel: String /* "SERIALIZABLE" | "EVENTUAL" | String */
    }
    interface GetLinkAttributesResponse {
        var Attributes: AttributeKeyAndValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetObjectAttributesRequest {
        var DirectoryArn: Arn
        var ObjectReference: ObjectReference
        var ConsistencyLevel: String /* "SERIALIZABLE" | "EVENTUAL" | String */
        var SchemaFacet: SchemaFacet
        var AttributeNames: AttributeNameList
    }
    interface GetObjectAttributesResponse {
        var Attributes: AttributeKeyAndValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetObjectInformationRequest {
        var DirectoryArn: Arn
        var ObjectReference: ObjectReference
        var ConsistencyLevel: String /* "SERIALIZABLE" | "EVENTUAL" | String */
    }
    interface GetObjectInformationResponse {
        var SchemaFacets: SchemaFacetList?
            get() = definedExternally
            set(value) = definedExternally
        var ObjectIdentifier: ObjectIdentifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSchemaAsJsonRequest {
        var SchemaArn: Arn
    }
    interface GetSchemaAsJsonResponse {
        var Name: SchemaName?
            get() = definedExternally
            set(value) = definedExternally
        var Document: SchemaJsonDocument?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTypedLinkFacetInformationRequest {
        var SchemaArn: Arn
        var Name: TypedLinkName
    }
    interface GetTypedLinkFacetInformationResponse {
        var IdentityAttributeOrder: AttributeNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IndexAttachment {
        var IndexedAttributes: AttributeKeyAndValueList?
            get() = definedExternally
            set(value) = definedExternally
        var ObjectIdentifier: ObjectIdentifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LinkAttributeAction {
        var AttributeActionType: String /* "CREATE_OR_UPDATE" | "DELETE" | String */
        var AttributeUpdateValue: TypedAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LinkAttributeUpdate {
        var AttributeKey: AttributeKey?
            get() = definedExternally
            set(value) = definedExternally
        var AttributeAction: LinkAttributeAction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LinkNameToObjectIdentifierMap {
        @nativeGetter
        operator fun get(key: String): ObjectIdentifier?
        @nativeSetter
        operator fun set(key: String, value: ObjectIdentifier)
    }
    interface ListAppliedSchemaArnsRequest {
        var DirectoryArn: Arn
        var SchemaArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAppliedSchemaArnsResponse {
        var SchemaArns: Arns?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAttachedIndicesRequest {
        var DirectoryArn: Arn
        var TargetReference: ObjectReference
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
        var ConsistencyLevel: String /* "SERIALIZABLE" | "EVENTUAL" | String */
    }
    interface ListAttachedIndicesResponse {
        var IndexAttachments: IndexAttachmentList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDevelopmentSchemaArnsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDevelopmentSchemaArnsResponse {
        var SchemaArns: Arns?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDirectoriesRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
        var state: String /* "ENABLED" | "DISABLED" | "DELETED" | String */
    }
    interface ListDirectoriesResponse {
        var Directories: DirectoryList
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFacetAttributesRequest {
        var SchemaArn: Arn
        var Name: FacetName
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFacetAttributesResponse {
        var Attributes: FacetAttributeList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFacetNamesRequest {
        var SchemaArn: Arn
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFacetNamesResponse {
        var FacetNames: FacetNameList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIncomingTypedLinksRequest {
        var DirectoryArn: Arn
        var ObjectReference: ObjectReference
        var FilterAttributeRanges: TypedLinkAttributeRangeList?
            get() = definedExternally
            set(value) = definedExternally
        var FilterTypedLink: TypedLinkSchemaAndFacetName?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
        var ConsistencyLevel: String /* "SERIALIZABLE" | "EVENTUAL" | String */
    }
    interface ListIncomingTypedLinksResponse {
        var LinkSpecifiers: TypedLinkSpecifierList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIndexRequest {
        var DirectoryArn: Arn
        var RangesOnIndexedValues: ObjectAttributeRangeList?
            get() = definedExternally
            set(value) = definedExternally
        var IndexReference: ObjectReference
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var ConsistencyLevel: String /* "SERIALIZABLE" | "EVENTUAL" | String */
    }
    interface ListIndexResponse {
        var IndexAttachments: IndexAttachmentList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListManagedSchemaArnsRequest {
        var SchemaArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListManagedSchemaArnsResponse {
        var SchemaArns: Arns?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListObjectAttributesRequest {
        var DirectoryArn: Arn
        var ObjectReference: ObjectReference
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
        var ConsistencyLevel: String /* "SERIALIZABLE" | "EVENTUAL" | String */
        var FacetFilter: SchemaFacet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListObjectAttributesResponse {
        var Attributes: AttributeKeyAndValueList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListObjectChildrenRequest {
        var DirectoryArn: Arn
        var ObjectReference: ObjectReference
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
        var ConsistencyLevel: String /* "SERIALIZABLE" | "EVENTUAL" | String */
    }
    interface ListObjectChildrenResponse {
        var Children: LinkNameToObjectIdentifierMap?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListObjectParentPathsRequest {
        var DirectoryArn: Arn
        var ObjectReference: ObjectReference
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListObjectParentPathsResponse {
        var PathToObjectIdentifiersList: PathToObjectIdentifiersList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListObjectParentsRequest {
        var DirectoryArn: Arn
        var ObjectReference: ObjectReference
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
        var ConsistencyLevel: String /* "SERIALIZABLE" | "EVENTUAL" | String */
        var IncludeAllLinksToEachParent: Bool?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListObjectParentsResponse {
        var Parents: ObjectIdentifierToLinkNameMap?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var ParentLinks: ObjectIdentifierAndLinkNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListObjectPoliciesRequest {
        var DirectoryArn: Arn
        var ObjectReference: ObjectReference
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
        var ConsistencyLevel: String /* "SERIALIZABLE" | "EVENTUAL" | String */
    }
    interface ListObjectPoliciesResponse {
        var AttachedPolicyIds: ObjectIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOutgoingTypedLinksRequest {
        var DirectoryArn: Arn
        var ObjectReference: ObjectReference
        var FilterAttributeRanges: TypedLinkAttributeRangeList?
            get() = definedExternally
            set(value) = definedExternally
        var FilterTypedLink: TypedLinkSchemaAndFacetName?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
        var ConsistencyLevel: String /* "SERIALIZABLE" | "EVENTUAL" | String */
    }
    interface ListOutgoingTypedLinksResponse {
        var TypedLinkSpecifiers: TypedLinkSpecifierList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPolicyAttachmentsRequest {
        var DirectoryArn: Arn
        var PolicyReference: ObjectReference
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
        var ConsistencyLevel: String /* "SERIALIZABLE" | "EVENTUAL" | String */
    }
    interface ListPolicyAttachmentsResponse {
        var ObjectIdentifiers: ObjectIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPublishedSchemaArnsRequest {
        var SchemaArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPublishedSchemaArnsResponse {
        var SchemaArns: Arns?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: Arn
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: TagsNumberResults?
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
    interface ListTypedLinkFacetAttributesRequest {
        var SchemaArn: Arn
        var Name: TypedLinkName
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTypedLinkFacetAttributesResponse {
        var Attributes: TypedLinkAttributeDefinitionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTypedLinkFacetNamesRequest {
        var SchemaArn: Arn
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTypedLinkFacetNamesResponse {
        var FacetNames: TypedLinkNameList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LookupPolicyRequest {
        var DirectoryArn: Arn
        var ObjectReference: ObjectReference
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: NumberResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LookupPolicyResponse {
        var PolicyToPathList: PolicyToPathList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ObjectAttributeAction {
        var ObjectAttributeActionType: String /* "CREATE_OR_UPDATE" | "DELETE" | String */
        var ObjectAttributeUpdateValue: TypedAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ObjectAttributeRange {
        var AttributeKey: AttributeKey?
            get() = definedExternally
            set(value) = definedExternally
        var Range: TypedAttributeValueRange?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ObjectAttributeUpdate {
        var ObjectAttributeKey: AttributeKey?
            get() = definedExternally
            set(value) = definedExternally
        var ObjectAttributeAction: ObjectAttributeAction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ObjectIdentifierAndLinkNameTuple {
        var ObjectIdentifier: ObjectIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var LinkName: LinkName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ObjectIdentifierToLinkNameMap {
        @nativeGetter
        operator fun get(key: String): LinkName?
        @nativeSetter
        operator fun set(key: String, value: LinkName)
    }
    interface ObjectReference {
        var Selector: SelectorObjectReference?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PathToObjectIdentifiers {
        var Path: PathString?
            get() = definedExternally
            set(value) = definedExternally
        var ObjectIdentifiers: ObjectIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyAttachment {
        var PolicyId: ObjectIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var ObjectIdentifier: ObjectIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyType: PolicyType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyToPath {
        var Path: PathString?
            get() = definedExternally
            set(value) = definedExternally
        var Policies: PolicyAttachmentList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PublishSchemaRequest {
        var DevelopmentSchemaArn: Arn
        var Version: Version
        var MinorVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
        var Name: SchemaName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PublishSchemaResponse {
        var PublishedSchemaArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutSchemaFromJsonRequest {
        var SchemaArn: Arn
        var Document: SchemaJsonDocument
    }
    interface PutSchemaFromJsonResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveFacetFromObjectRequest {
        var DirectoryArn: Arn
        var SchemaFacet: SchemaFacet
        var ObjectReference: ObjectReference
    }
    interface RemoveFacetFromObjectResponse
    interface Rule {
        var Type: String /* "BINARY_LENGTH" | "NUMBER_COMPARISON" | "STRING_FROM_SET" | "STRING_LENGTH" | String */
        var Parameters: RuleParameterMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RuleMap {
        @nativeGetter
        operator fun get(key: String): Rule?
        @nativeSetter
        operator fun set(key: String, value: Rule)
    }
    interface RuleParameterMap {
        @nativeGetter
        operator fun get(key: String): RuleParameterValue?
        @nativeSetter
        operator fun set(key: String, value: RuleParameterValue)
    }
    interface SchemaFacet {
        var SchemaArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var FacetName: FacetName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var Value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var ResourceArn: Arn
        var Tags: TagList
    }
    interface TagResourceResponse
    interface TypedAttributeValue {
        var StringValue: StringAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var BinaryValue: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var BooleanValue: BooleanAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var NumberValue: NumberAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var DatetimeValue: DatetimeAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TypedAttributeValueRange {
        var StartMode: String /* "FIRST" | "LAST" | "LAST_BEFORE_MISSING_VALUES" | "INCLUSIVE" | "EXCLUSIVE" | String */
        var StartValue: TypedAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var EndMode: String /* "FIRST" | "LAST" | "LAST_BEFORE_MISSING_VALUES" | "INCLUSIVE" | "EXCLUSIVE" | String */
        var EndValue: TypedAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TypedLinkAttributeDefinition {
        var Name: AttributeName
        var Type: String /* "STRING" | "BINARY" | "BOOLEAN" | "NUMBER" | "DATETIME" | "VARIANT" | String */
        var DefaultValue: TypedAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var IsImmutable: Bool?
            get() = definedExternally
            set(value) = definedExternally
        var Rules: RuleMap?
            get() = definedExternally
            set(value) = definedExternally
        var RequiredBehavior: String /* "REQUIRED_ALWAYS" | "NOT_REQUIRED" | String */
    }
    interface TypedLinkAttributeRange {
        var AttributeName: AttributeName?
            get() = definedExternally
            set(value) = definedExternally
        var Range: TypedAttributeValueRange
    }
    interface TypedLinkFacet {
        var Name: TypedLinkName
        var Attributes: TypedLinkAttributeDefinitionList
        var IdentityAttributeOrder: AttributeNameList
    }
    interface TypedLinkFacetAttributeUpdate {
        var Attribute: TypedLinkAttributeDefinition
        var Action: String /* "CREATE_OR_UPDATE" | "DELETE" | String */
    }
    interface TypedLinkSchemaAndFacetName {
        var SchemaArn: Arn
        var TypedLinkName: TypedLinkName
    }
    interface TypedLinkSpecifier {
        var TypedLinkFacet: TypedLinkSchemaAndFacetName
        var SourceObjectReference: ObjectReference
        var TargetObjectReference: ObjectReference
        var IdentityAttributeValues: AttributeNameAndValueList
    }
    interface UntagResourceRequest {
        var ResourceArn: Arn
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateFacetRequest {
        var SchemaArn: Arn
        var Name: FacetName
        var AttributeUpdates: FacetAttributeUpdateList?
            get() = definedExternally
            set(value) = definedExternally
        var ObjectType: String /* "NODE" | "LEAF_NODE" | "POLICY" | "INDEX" | String */
    }
    interface UpdateFacetResponse
    interface UpdateLinkAttributesRequest {
        var DirectoryArn: Arn
        var TypedLinkSpecifier: TypedLinkSpecifier
        var AttributeUpdates: LinkAttributeUpdateList
    }
    interface UpdateLinkAttributesResponse
    interface UpdateObjectAttributesRequest {
        var DirectoryArn: Arn
        var ObjectReference: ObjectReference
        var AttributeUpdates: ObjectAttributeUpdateList
    }
    interface UpdateObjectAttributesResponse {
        var ObjectIdentifier: ObjectIdentifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSchemaRequest {
        var SchemaArn: Arn
        var Name: SchemaName
    }
    interface UpdateSchemaResponse {
        var SchemaArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTypedLinkFacetRequest {
        var SchemaArn: Arn
        var Name: TypedLinkName
        var AttributeUpdates: TypedLinkFacetAttributeUpdateList
        var IdentityAttributeOrder: AttributeNameList
    }
    interface UpdateTypedLinkFacetResponse
    interface UpgradeAppliedSchemaRequest {
        var PublishedSchemaArn: Arn
        var DirectoryArn: Arn
        var DryRun: Bool?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpgradeAppliedSchemaResponse {
        var UpgradedSchemaArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DirectoryArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpgradePublishedSchemaRequest {
        var DevelopmentSchemaArn: Arn
        var PublishedSchemaArn: Arn
        var MinorVersion: Version
        var DryRun: Bool?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpgradePublishedSchemaResponse {
        var UpgradedSchemaArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2016-05-10" | "2017-01-11" | "latest" | String */
    }
}