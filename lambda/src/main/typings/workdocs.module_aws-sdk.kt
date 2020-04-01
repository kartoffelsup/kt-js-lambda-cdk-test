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
import WorkDocs.Comment
import WorkDocs.DocumentMetadata
import WorkDocs.DocumentVersionMetadata
import WorkDocs.FolderMetadata
import WorkDocs.GroupMetadata
import WorkDocs.User
import WorkDocs.PermissionInfo
import WorkDocs.Principal
import WorkDocs.ResourcePathComponent
import WorkDocs.SharePrincipal
import WorkDocs.ShareResult
import WorkDocs.Subscription
import WorkDocs.Activity
import WorkDocs.UserMetadata
import WorkDocs.AbortDocumentVersionUploadRequest
import WorkDocs.ActivateUserRequest
import WorkDocs.ActivateUserResponse
import WorkDocs.AddResourcePermissionsRequest
import WorkDocs.AddResourcePermissionsResponse
import WorkDocs.CreateCommentRequest
import WorkDocs.CreateCommentResponse
import WorkDocs.CreateCustomMetadataRequest
import WorkDocs.CreateCustomMetadataResponse
import WorkDocs.CreateFolderRequest
import WorkDocs.CreateFolderResponse
import WorkDocs.CreateLabelsRequest
import WorkDocs.CreateLabelsResponse
import WorkDocs.CreateNotificationSubscriptionRequest
import WorkDocs.CreateNotificationSubscriptionResponse
import WorkDocs.CreateUserRequest
import WorkDocs.CreateUserResponse
import WorkDocs.DeactivateUserRequest
import WorkDocs.DeleteCommentRequest
import WorkDocs.DeleteCustomMetadataRequest
import WorkDocs.DeleteCustomMetadataResponse
import WorkDocs.DeleteDocumentRequest
import WorkDocs.DeleteFolderRequest
import WorkDocs.DeleteFolderContentsRequest
import WorkDocs.DeleteLabelsRequest
import WorkDocs.DeleteLabelsResponse
import WorkDocs.DeleteNotificationSubscriptionRequest
import WorkDocs.DeleteUserRequest
import WorkDocs.DescribeActivitiesRequest
import WorkDocs.DescribeActivitiesResponse
import WorkDocs.DescribeCommentsRequest
import WorkDocs.DescribeCommentsResponse
import WorkDocs.DescribeDocumentVersionsRequest
import WorkDocs.DescribeDocumentVersionsResponse
import WorkDocs.DescribeFolderContentsRequest
import WorkDocs.DescribeFolderContentsResponse
import WorkDocs.DescribeGroupsRequest
import WorkDocs.DescribeGroupsResponse
import WorkDocs.DescribeNotificationSubscriptionsRequest
import WorkDocs.DescribeNotificationSubscriptionsResponse
import WorkDocs.DescribeResourcePermissionsRequest
import WorkDocs.DescribeResourcePermissionsResponse
import WorkDocs.DescribeRootFoldersRequest
import WorkDocs.DescribeRootFoldersResponse
import WorkDocs.DescribeUsersRequest
import WorkDocs.DescribeUsersResponse
import WorkDocs.GetCurrentUserRequest
import WorkDocs.GetCurrentUserResponse
import WorkDocs.GetDocumentRequest
import WorkDocs.GetDocumentResponse
import WorkDocs.GetDocumentPathRequest
import WorkDocs.GetDocumentPathResponse
import WorkDocs.GetDocumentVersionRequest
import WorkDocs.GetDocumentVersionResponse
import WorkDocs.GetFolderRequest
import WorkDocs.GetFolderResponse
import WorkDocs.GetFolderPathRequest
import WorkDocs.GetFolderPathResponse
import WorkDocs.GetResourcesRequest
import WorkDocs.GetResourcesResponse
import WorkDocs.InitiateDocumentVersionUploadRequest
import WorkDocs.InitiateDocumentVersionUploadResponse
import WorkDocs.RemoveAllResourcePermissionsRequest
import WorkDocs.RemoveResourcePermissionRequest
import WorkDocs.UpdateDocumentRequest
import WorkDocs.UpdateDocumentVersionRequest
import WorkDocs.UpdateFolderRequest
import WorkDocs.UpdateUserRequest
import WorkDocs.UpdateUserResponse
import WorkDocs.Participants
import WorkDocs.ResourceMetadata
import WorkDocs.CommentMetadata
import WorkDocs.NotificationOptions
import WorkDocs.CustomMetadataMap
import WorkDocs.StorageRuleType
import WorkDocs.DocumentThumbnailUrlMap
import WorkDocs.DocumentSourceUrlMap
import WorkDocs.ResourcePath
import WorkDocs.UploadMetadata
import WorkDocs.SignedHeaderMap
import WorkDocs.UserStorageMetadata

typealias ActivityNamesFilterType = String

typealias AuthenticationHeaderType = String

typealias BooleanType = Boolean

typealias CommentIdType = String

typealias CommentList = Array<Comment>

typealias CommentTextType = String

typealias CustomMetadataKeyList = Array<CustomMetadataKeyType>

typealias CustomMetadataKeyType = String

typealias CustomMetadataValueType = String

typealias DocumentContentType = String

typealias DocumentMetadataList = Array<DocumentMetadata>

typealias DocumentVersionIdType = String

typealias DocumentVersionMetadataList = Array<DocumentVersionMetadata>

typealias EmailAddressType = String

typealias FieldNamesType = String

typealias FolderMetadataList = Array<FolderMetadata>

typealias GroupMetadataList = Array<GroupMetadata>

typealias GroupNameType = String

typealias HashType = String

typealias HeaderNameType = String

typealias HeaderValueType = String

typealias IdType = String

typealias LimitType = Number

typealias MarkerType = String

typealias MessageType = String

typealias OrganizationUserList = Array<User>

typealias PageMarkerType = String

typealias PasswordType = String

typealias PermissionInfoList = Array<PermissionInfo>

typealias PositiveIntegerType = Number

typealias PositiveSizeType = Number

typealias PrincipalList = Array<Principal>

typealias ResourceIdType = String

typealias ResourceNameType = String

typealias ResourcePathComponentList = Array<ResourcePathComponent>

typealias SearchQueryType = String

typealias SharePrincipalList = Array<SharePrincipal>

typealias ShareResultsList = Array<ShareResult>

typealias SharedLabel = String

typealias SharedLabels = Array<SharedLabel>

typealias SizeType = Number

typealias SubscriptionEndPointType = String

typealias SubscriptionList = Array<Subscription>

typealias TimeZoneIdType = String

typealias TimestampType = Date

typealias UrlType = String

typealias UserActivities = Array<Activity>

typealias UserAttributeValueType = String

typealias UserIdsType = String

typealias UserMetadataList = Array<UserMetadata>

typealias UsernameType = String

@JsModule("aws-sdk")
external open class WorkDocs(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & WorkDocs.Types.ClientConfiguration */
    open fun abortDocumentVersionUpload(params: AbortDocumentVersionUploadRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun abortDocumentVersionUpload(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun activateUser(params: ActivateUserRequest, callback: (err: AWSError, data: ActivateUserResponse) -> Unit = definedExternally): Request<ActivateUserResponse, AWSError>
    open fun activateUser(callback: (err: AWSError, data: ActivateUserResponse) -> Unit = definedExternally): Request<ActivateUserResponse, AWSError>
    open fun addResourcePermissions(params: AddResourcePermissionsRequest, callback: (err: AWSError, data: AddResourcePermissionsResponse) -> Unit = definedExternally): Request<AddResourcePermissionsResponse, AWSError>
    open fun addResourcePermissions(callback: (err: AWSError, data: AddResourcePermissionsResponse) -> Unit = definedExternally): Request<AddResourcePermissionsResponse, AWSError>
    open fun createComment(params: CreateCommentRequest, callback: (err: AWSError, data: CreateCommentResponse) -> Unit = definedExternally): Request<CreateCommentResponse, AWSError>
    open fun createComment(callback: (err: AWSError, data: CreateCommentResponse) -> Unit = definedExternally): Request<CreateCommentResponse, AWSError>
    open fun createCustomMetadata(params: CreateCustomMetadataRequest, callback: (err: AWSError, data: CreateCustomMetadataResponse) -> Unit = definedExternally): Request<CreateCustomMetadataResponse, AWSError>
    open fun createCustomMetadata(callback: (err: AWSError, data: CreateCustomMetadataResponse) -> Unit = definedExternally): Request<CreateCustomMetadataResponse, AWSError>
    open fun createFolder(params: CreateFolderRequest, callback: (err: AWSError, data: CreateFolderResponse) -> Unit = definedExternally): Request<CreateFolderResponse, AWSError>
    open fun createFolder(callback: (err: AWSError, data: CreateFolderResponse) -> Unit = definedExternally): Request<CreateFolderResponse, AWSError>
    open fun createLabels(params: CreateLabelsRequest, callback: (err: AWSError, data: CreateLabelsResponse) -> Unit = definedExternally): Request<CreateLabelsResponse, AWSError>
    open fun createLabels(callback: (err: AWSError, data: CreateLabelsResponse) -> Unit = definedExternally): Request<CreateLabelsResponse, AWSError>
    open fun createNotificationSubscription(params: CreateNotificationSubscriptionRequest, callback: (err: AWSError, data: CreateNotificationSubscriptionResponse) -> Unit = definedExternally): Request<CreateNotificationSubscriptionResponse, AWSError>
    open fun createNotificationSubscription(callback: (err: AWSError, data: CreateNotificationSubscriptionResponse) -> Unit = definedExternally): Request<CreateNotificationSubscriptionResponse, AWSError>
    open fun createUser(params: CreateUserRequest, callback: (err: AWSError, data: CreateUserResponse) -> Unit = definedExternally): Request<CreateUserResponse, AWSError>
    open fun createUser(callback: (err: AWSError, data: CreateUserResponse) -> Unit = definedExternally): Request<CreateUserResponse, AWSError>
    open fun deactivateUser(params: DeactivateUserRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deactivateUser(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteComment(params: DeleteCommentRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteComment(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteCustomMetadata(params: DeleteCustomMetadataRequest, callback: (err: AWSError, data: DeleteCustomMetadataResponse) -> Unit = definedExternally): Request<DeleteCustomMetadataResponse, AWSError>
    open fun deleteCustomMetadata(callback: (err: AWSError, data: DeleteCustomMetadataResponse) -> Unit = definedExternally): Request<DeleteCustomMetadataResponse, AWSError>
    open fun deleteDocument(params: DeleteDocumentRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDocument(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteFolder(params: DeleteFolderRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteFolder(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteFolderContents(params: DeleteFolderContentsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteFolderContents(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteLabels(params: DeleteLabelsRequest, callback: (err: AWSError, data: DeleteLabelsResponse) -> Unit = definedExternally): Request<DeleteLabelsResponse, AWSError>
    open fun deleteLabels(callback: (err: AWSError, data: DeleteLabelsResponse) -> Unit = definedExternally): Request<DeleteLabelsResponse, AWSError>
    open fun deleteNotificationSubscription(params: DeleteNotificationSubscriptionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteNotificationSubscription(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUser(params: DeleteUserRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUser(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeActivities(params: DescribeActivitiesRequest, callback: (err: AWSError, data: DescribeActivitiesResponse) -> Unit = definedExternally): Request<DescribeActivitiesResponse, AWSError>
    open fun describeActivities(callback: (err: AWSError, data: DescribeActivitiesResponse) -> Unit = definedExternally): Request<DescribeActivitiesResponse, AWSError>
    open fun describeComments(params: DescribeCommentsRequest, callback: (err: AWSError, data: DescribeCommentsResponse) -> Unit = definedExternally): Request<DescribeCommentsResponse, AWSError>
    open fun describeComments(callback: (err: AWSError, data: DescribeCommentsResponse) -> Unit = definedExternally): Request<DescribeCommentsResponse, AWSError>
    open fun describeDocumentVersions(params: DescribeDocumentVersionsRequest, callback: (err: AWSError, data: DescribeDocumentVersionsResponse) -> Unit = definedExternally): Request<DescribeDocumentVersionsResponse, AWSError>
    open fun describeDocumentVersions(callback: (err: AWSError, data: DescribeDocumentVersionsResponse) -> Unit = definedExternally): Request<DescribeDocumentVersionsResponse, AWSError>
    open fun describeFolderContents(params: DescribeFolderContentsRequest, callback: (err: AWSError, data: DescribeFolderContentsResponse) -> Unit = definedExternally): Request<DescribeFolderContentsResponse, AWSError>
    open fun describeFolderContents(callback: (err: AWSError, data: DescribeFolderContentsResponse) -> Unit = definedExternally): Request<DescribeFolderContentsResponse, AWSError>
    open fun describeGroups(params: DescribeGroupsRequest, callback: (err: AWSError, data: DescribeGroupsResponse) -> Unit = definedExternally): Request<DescribeGroupsResponse, AWSError>
    open fun describeGroups(callback: (err: AWSError, data: DescribeGroupsResponse) -> Unit = definedExternally): Request<DescribeGroupsResponse, AWSError>
    open fun describeNotificationSubscriptions(params: DescribeNotificationSubscriptionsRequest, callback: (err: AWSError, data: DescribeNotificationSubscriptionsResponse) -> Unit = definedExternally): Request<DescribeNotificationSubscriptionsResponse, AWSError>
    open fun describeNotificationSubscriptions(callback: (err: AWSError, data: DescribeNotificationSubscriptionsResponse) -> Unit = definedExternally): Request<DescribeNotificationSubscriptionsResponse, AWSError>
    open fun describeResourcePermissions(params: DescribeResourcePermissionsRequest, callback: (err: AWSError, data: DescribeResourcePermissionsResponse) -> Unit = definedExternally): Request<DescribeResourcePermissionsResponse, AWSError>
    open fun describeResourcePermissions(callback: (err: AWSError, data: DescribeResourcePermissionsResponse) -> Unit = definedExternally): Request<DescribeResourcePermissionsResponse, AWSError>
    open fun describeRootFolders(params: DescribeRootFoldersRequest, callback: (err: AWSError, data: DescribeRootFoldersResponse) -> Unit = definedExternally): Request<DescribeRootFoldersResponse, AWSError>
    open fun describeRootFolders(callback: (err: AWSError, data: DescribeRootFoldersResponse) -> Unit = definedExternally): Request<DescribeRootFoldersResponse, AWSError>
    open fun describeUsers(params: DescribeUsersRequest, callback: (err: AWSError, data: DescribeUsersResponse) -> Unit = definedExternally): Request<DescribeUsersResponse, AWSError>
    open fun describeUsers(callback: (err: AWSError, data: DescribeUsersResponse) -> Unit = definedExternally): Request<DescribeUsersResponse, AWSError>
    open fun getCurrentUser(params: GetCurrentUserRequest, callback: (err: AWSError, data: GetCurrentUserResponse) -> Unit = definedExternally): Request<GetCurrentUserResponse, AWSError>
    open fun getCurrentUser(callback: (err: AWSError, data: GetCurrentUserResponse) -> Unit = definedExternally): Request<GetCurrentUserResponse, AWSError>
    open fun getDocument(params: GetDocumentRequest, callback: (err: AWSError, data: GetDocumentResponse) -> Unit = definedExternally): Request<GetDocumentResponse, AWSError>
    open fun getDocument(callback: (err: AWSError, data: GetDocumentResponse) -> Unit = definedExternally): Request<GetDocumentResponse, AWSError>
    open fun getDocumentPath(params: GetDocumentPathRequest, callback: (err: AWSError, data: GetDocumentPathResponse) -> Unit = definedExternally): Request<GetDocumentPathResponse, AWSError>
    open fun getDocumentPath(callback: (err: AWSError, data: GetDocumentPathResponse) -> Unit = definedExternally): Request<GetDocumentPathResponse, AWSError>
    open fun getDocumentVersion(params: GetDocumentVersionRequest, callback: (err: AWSError, data: GetDocumentVersionResponse) -> Unit = definedExternally): Request<GetDocumentVersionResponse, AWSError>
    open fun getDocumentVersion(callback: (err: AWSError, data: GetDocumentVersionResponse) -> Unit = definedExternally): Request<GetDocumentVersionResponse, AWSError>
    open fun getFolder(params: GetFolderRequest, callback: (err: AWSError, data: GetFolderResponse) -> Unit = definedExternally): Request<GetFolderResponse, AWSError>
    open fun getFolder(callback: (err: AWSError, data: GetFolderResponse) -> Unit = definedExternally): Request<GetFolderResponse, AWSError>
    open fun getFolderPath(params: GetFolderPathRequest, callback: (err: AWSError, data: GetFolderPathResponse) -> Unit = definedExternally): Request<GetFolderPathResponse, AWSError>
    open fun getFolderPath(callback: (err: AWSError, data: GetFolderPathResponse) -> Unit = definedExternally): Request<GetFolderPathResponse, AWSError>
    open fun getResources(params: GetResourcesRequest, callback: (err: AWSError, data: GetResourcesResponse) -> Unit = definedExternally): Request<GetResourcesResponse, AWSError>
    open fun getResources(callback: (err: AWSError, data: GetResourcesResponse) -> Unit = definedExternally): Request<GetResourcesResponse, AWSError>
    open fun initiateDocumentVersionUpload(params: InitiateDocumentVersionUploadRequest, callback: (err: AWSError, data: InitiateDocumentVersionUploadResponse) -> Unit = definedExternally): Request<InitiateDocumentVersionUploadResponse, AWSError>
    open fun initiateDocumentVersionUpload(callback: (err: AWSError, data: InitiateDocumentVersionUploadResponse) -> Unit = definedExternally): Request<InitiateDocumentVersionUploadResponse, AWSError>
    open fun removeAllResourcePermissions(params: RemoveAllResourcePermissionsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeAllResourcePermissions(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeResourcePermission(params: RemoveResourcePermissionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeResourcePermission(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateDocument(params: UpdateDocumentRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateDocument(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateDocumentVersion(params: UpdateDocumentVersionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateDocumentVersion(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateFolder(params: UpdateFolderRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateFolder(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateUser(params: UpdateUserRequest, callback: (err: AWSError, data: UpdateUserResponse) -> Unit = definedExternally): Request<UpdateUserResponse, AWSError>
    open fun updateUser(callback: (err: AWSError, data: UpdateUserResponse) -> Unit = definedExternally): Request<UpdateUserResponse, AWSError>
    interface AbortDocumentVersionUploadRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentId: ResourceIdType
        var VersionId: DocumentVersionIdType
    }
    interface ActivateUserRequest {
        var UserId: IdType
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActivateUserResponse {
        var User: User?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Activity {
        var Type: String /* "DOCUMENT_CHECKED_IN" | "DOCUMENT_CHECKED_OUT" | "DOCUMENT_RENAMED" | "DOCUMENT_VERSION_UPLOADED" | "DOCUMENT_VERSION_DELETED" | "DOCUMENT_VERSION_VIEWED" | "DOCUMENT_VERSION_DOWNLOADED" | "DOCUMENT_RECYCLED" | "DOCUMENT_RESTORED" | "DOCUMENT_REVERTED" | "DOCUMENT_SHARED" | "DOCUMENT_UNSHARED" | "DOCUMENT_SHARE_PERMISSION_CHANGED" | "DOCUMENT_SHAREABLE_LINK_CREATED" | "DOCUMENT_SHAREABLE_LINK_REMOVED" | "DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED" | "DOCUMENT_MOVED" | "DOCUMENT_COMMENT_ADDED" | "DOCUMENT_COMMENT_DELETED" | "DOCUMENT_ANNOTATION_ADDED" | "DOCUMENT_ANNOTATION_DELETED" | "FOLDER_CREATED" | "FOLDER_DELETED" | "FOLDER_RENAMED" | "FOLDER_RECYCLED" | "FOLDER_RESTORED" | "FOLDER_SHARED" | "FOLDER_UNSHARED" | "FOLDER_SHARE_PERMISSION_CHANGED" | "FOLDER_SHAREABLE_LINK_CREATED" | "FOLDER_SHAREABLE_LINK_REMOVED" | "FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED" | "FOLDER_MOVED" | String */
        var TimeStamp: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var IsIndirectActivity: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationId: IdType?
            get() = definedExternally
            set(value) = definedExternally
        var Initiator: UserMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var Participants: Participants?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceMetadata: ResourceMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var OriginalParent: ResourceMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var CommentMetadata: CommentMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddResourcePermissionsRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: ResourceIdType
        var Principals: SharePrincipalList
        var NotificationOptions: NotificationOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddResourcePermissionsResponse {
        var ShareResults: ShareResultsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Comment {
        var CommentId: CommentIdType
        var ParentId: CommentIdType?
            get() = definedExternally
            set(value) = definedExternally
        var ThreadId: CommentIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Text: CommentTextType?
            get() = definedExternally
            set(value) = definedExternally
        var Contributor: User?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTimestamp: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "DRAFT" | "PUBLISHED" | "DELETED" | String */
        var Visibility: String /* "PUBLIC" | "PRIVATE" | String */
        var RecipientId: IdType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CommentMetadata {
        var CommentId: CommentIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Contributor: User?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTimestamp: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var CommentStatus: String /* "DRAFT" | "PUBLISHED" | "DELETED" | String */
        var RecipientId: IdType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCommentRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentId: ResourceIdType
        var VersionId: DocumentVersionIdType
        var ParentId: CommentIdType?
            get() = definedExternally
            set(value) = definedExternally
        var ThreadId: CommentIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Text: CommentTextType
        var Visibility: String /* "PUBLIC" | "PRIVATE" | String */
        var NotifyCollaborators: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCommentResponse {
        var Comment: Comment?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCustomMetadataRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: ResourceIdType
        var VersionId: DocumentVersionIdType?
            get() = definedExternally
            set(value) = definedExternally
        var CustomMetadata: CustomMetadataMap
    }
    interface CreateCustomMetadataResponse
    interface CreateFolderRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ResourceNameType?
            get() = definedExternally
            set(value) = definedExternally
        var ParentFolderId: ResourceIdType
    }
    interface CreateFolderResponse {
        var Metadata: FolderMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLabelsRequest {
        var ResourceId: ResourceIdType
        var Labels: SharedLabels
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLabelsResponse
    interface CreateNotificationSubscriptionRequest {
        var OrganizationId: IdType
        var Endpoint: SubscriptionEndPointType
        var Protocol: String /* "HTTPS" | String */
        var SubscriptionType: String /* "ALL" | String */
    }
    interface CreateNotificationSubscriptionResponse {
        var Subscription: Subscription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUserRequest {
        var OrganizationId: IdType?
            get() = definedExternally
            set(value) = definedExternally
        var Username: UsernameType
        var EmailAddress: EmailAddressType?
            get() = definedExternally
            set(value) = definedExternally
        var GivenName: UserAttributeValueType
        var Surname: UserAttributeValueType
        var Password: PasswordType
        var TimeZoneId: TimeZoneIdType?
            get() = definedExternally
            set(value) = definedExternally
        var StorageRule: StorageRuleType?
            get() = definedExternally
            set(value) = definedExternally
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUserResponse {
        var User: User?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CustomMetadataMap {
        @nativeGetter
        operator fun get(key: String): CustomMetadataValueType?
        @nativeSetter
        operator fun set(key: String, value: CustomMetadataValueType)
    }
    interface DeactivateUserRequest {
        var UserId: IdType
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteCommentRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentId: ResourceIdType
        var VersionId: DocumentVersionIdType
        var CommentId: CommentIdType
    }
    interface DeleteCustomMetadataRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: ResourceIdType
        var VersionId: DocumentVersionIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Keys: CustomMetadataKeyList?
            get() = definedExternally
            set(value) = definedExternally
        var DeleteAll: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteCustomMetadataResponse
    interface DeleteDocumentRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentId: ResourceIdType
    }
    interface DeleteFolderContentsRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var FolderId: ResourceIdType
    }
    interface DeleteFolderRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var FolderId: ResourceIdType
    }
    interface DeleteLabelsRequest {
        var ResourceId: ResourceIdType
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var Labels: SharedLabels?
            get() = definedExternally
            set(value) = definedExternally
        var DeleteAll: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteLabelsResponse
    interface DeleteNotificationSubscriptionRequest {
        var SubscriptionId: IdType
        var OrganizationId: IdType
    }
    interface DeleteUserRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var UserId: IdType
    }
    interface DescribeActivitiesRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationId: IdType?
            get() = definedExternally
            set(value) = definedExternally
        var ActivityTypes: ActivityNamesFilterType?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: IdType?
            get() = definedExternally
            set(value) = definedExternally
        var UserId: IdType?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeIndirectActivities: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: LimitType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: MarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeActivitiesResponse {
        var UserActivities: UserActivities?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: MarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCommentsRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentId: ResourceIdType
        var VersionId: DocumentVersionIdType
        var Limit: LimitType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: MarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCommentsResponse {
        var Comments: CommentList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: MarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDocumentVersionsRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentId: ResourceIdType
        var Marker: PageMarkerType?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: LimitType?
            get() = definedExternally
            set(value) = definedExternally
        var Include: FieldNamesType?
            get() = definedExternally
            set(value) = definedExternally
        var Fields: FieldNamesType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDocumentVersionsResponse {
        var DocumentVersions: DocumentVersionMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: PageMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFolderContentsRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var FolderId: ResourceIdType
        var Sort: String /* "DATE" | "NAME" | String */
        var Order: String /* "ASCENDING" | "DESCENDING" | String */
        var Limit: LimitType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: PageMarkerType?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "ALL" | "DOCUMENT" | "FOLDER" | String */
        var Include: FieldNamesType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFolderContentsResponse {
        var Folders: FolderMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var Documents: DocumentMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: PageMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeGroupsRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var SearchQuery: SearchQueryType
        var OrganizationId: IdType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: MarkerType?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveIntegerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeGroupsResponse {
        var Groups: GroupMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: MarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeNotificationSubscriptionsRequest {
        var OrganizationId: IdType
        var Marker: PageMarkerType?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: LimitType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeNotificationSubscriptionsResponse {
        var Subscriptions: SubscriptionList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: PageMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeResourcePermissionsRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: ResourceIdType
        var PrincipalId: IdType?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: LimitType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: PageMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeResourcePermissionsResponse {
        var Principals: PrincipalList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: PageMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRootFoldersRequest {
        var AuthenticationToken: AuthenticationHeaderType
        var Limit: LimitType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: PageMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRootFoldersResponse {
        var Folders: FolderMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: PageMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUsersRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationId: IdType?
            get() = definedExternally
            set(value) = definedExternally
        var UserIds: UserIdsType?
            get() = definedExternally
            set(value) = definedExternally
        var Query: SearchQueryType?
            get() = definedExternally
            set(value) = definedExternally
        var Include: String /* "ALL" | "ACTIVE_PENDING" | String */
        var Order: String /* "ASCENDING" | "DESCENDING" | String */
        var Sort: String /* "USER_NAME" | "FULL_NAME" | "STORAGE_LIMIT" | "USER_STATUS" | "STORAGE_USED" | String */
        var Marker: PageMarkerType?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: LimitType?
            get() = definedExternally
            set(value) = definedExternally
        var Fields: FieldNamesType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUsersResponse {
        var Users: OrganizationUserList?
            get() = definedExternally
            set(value) = definedExternally
        var TotalNumberOfUsers: SizeType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: PageMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentMetadata {
        var Id: ResourceIdType?
            get() = definedExternally
            set(value) = definedExternally
        var CreatorId: IdType?
            get() = definedExternally
            set(value) = definedExternally
        var ParentFolderId: ResourceIdType?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTimestamp: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var ModifiedTimestamp: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersionMetadata: DocumentVersionMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceState: String /* "ACTIVE" | "RESTORING" | "RECYCLING" | "RECYCLED" | String */
        var Labels: SharedLabels?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentSourceUrlMap {
        @nativeGetter
        operator fun get(key: String): UrlType?
        @nativeSetter
        operator fun set(key: String, value: UrlType)
    }
    interface DocumentThumbnailUrlMap {
        @nativeGetter
        operator fun get(key: String): UrlType?
        @nativeSetter
        operator fun set(key: String, value: UrlType)
    }
    interface DocumentVersionMetadata {
        var Id: DocumentVersionIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ResourceNameType?
            get() = definedExternally
            set(value) = definedExternally
        var ContentType: DocumentContentType?
            get() = definedExternally
            set(value) = definedExternally
        var Size: SizeType?
            get() = definedExternally
            set(value) = definedExternally
        var Signature: HashType?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "INITIALIZED" | "ACTIVE" | String */
        var CreatedTimestamp: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var ModifiedTimestamp: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var ContentCreatedTimestamp: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var ContentModifiedTimestamp: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var CreatorId: IdType?
            get() = definedExternally
            set(value) = definedExternally
        var Thumbnail: DocumentThumbnailUrlMap?
            get() = definedExternally
            set(value) = definedExternally
        var Source: DocumentSourceUrlMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FolderMetadata {
        var Id: ResourceIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ResourceNameType?
            get() = definedExternally
            set(value) = definedExternally
        var CreatorId: IdType?
            get() = definedExternally
            set(value) = definedExternally
        var ParentFolderId: ResourceIdType?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTimestamp: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var ModifiedTimestamp: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceState: String /* "ACTIVE" | "RESTORING" | "RECYCLING" | "RECYCLED" | String */
        var Signature: HashType?
            get() = definedExternally
            set(value) = definedExternally
        var Labels: SharedLabels?
            get() = definedExternally
            set(value) = definedExternally
        var Size: SizeType?
            get() = definedExternally
            set(value) = definedExternally
        var LatestVersionSize: SizeType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCurrentUserRequest {
        var AuthenticationToken: AuthenticationHeaderType
    }
    interface GetCurrentUserResponse {
        var User: User?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDocumentPathRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentId: IdType
        var Limit: LimitType?
            get() = definedExternally
            set(value) = definedExternally
        var Fields: FieldNamesType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: PageMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDocumentPathResponse {
        var Path: ResourcePath?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDocumentRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentId: ResourceIdType
        var IncludeCustomMetadata: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDocumentResponse {
        var Metadata: DocumentMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var CustomMetadata: CustomMetadataMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDocumentVersionRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentId: ResourceIdType
        var VersionId: DocumentVersionIdType
        var Fields: FieldNamesType?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeCustomMetadata: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDocumentVersionResponse {
        var Metadata: DocumentVersionMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var CustomMetadata: CustomMetadataMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFolderPathRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var FolderId: IdType
        var Limit: LimitType?
            get() = definedExternally
            set(value) = definedExternally
        var Fields: FieldNamesType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: PageMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFolderPathResponse {
        var Path: ResourcePath?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFolderRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var FolderId: ResourceIdType
        var IncludeCustomMetadata: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFolderResponse {
        var Metadata: FolderMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var CustomMetadata: CustomMetadataMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResourcesRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var UserId: IdType?
            get() = definedExternally
            set(value) = definedExternally
        var CollectionType: String /* "SHARED_WITH_ME" | String */
        var Limit: LimitType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: PageMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResourcesResponse {
        var Folders: FolderMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var Documents: DocumentMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: PageMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GroupMetadata {
        var Id: IdType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: GroupNameType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InitiateDocumentVersionUploadRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var Id: ResourceIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ResourceNameType?
            get() = definedExternally
            set(value) = definedExternally
        var ContentCreatedTimestamp: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var ContentModifiedTimestamp: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var ContentType: DocumentContentType?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentSizeInBytes: SizeType?
            get() = definedExternally
            set(value) = definedExternally
        var ParentFolderId: ResourceIdType
    }
    interface InitiateDocumentVersionUploadResponse {
        var Metadata: DocumentMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var UploadMetadata: UploadMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NotificationOptions {
        var SendEmail: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
        var EmailMessage: MessageType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Participants {
        var Users: UserMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var Groups: GroupMetadataList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PermissionInfo {
        var Role: String /* "VIEWER" | "CONTRIBUTOR" | "OWNER" | "COOWNER" | String */
        var Type: String /* "DIRECT" | "INHERITED" | String */
    }
    interface Principal {
        var Id: IdType?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "USER" | "GROUP" | "INVITE" | "ANONYMOUS" | "ORGANIZATION" | String */
        var Roles: PermissionInfoList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveAllResourcePermissionsRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: ResourceIdType
    }
    interface RemoveResourcePermissionRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: ResourceIdType
        var PrincipalId: IdType
        var PrincipalType: String /* "USER" | "GROUP" | "INVITE" | "ANONYMOUS" | "ORGANIZATION" | String */
    }
    interface ResourceMetadata {
        var Type: String /* "FOLDER" | "DOCUMENT" | String */
        var Name: ResourceNameType?
            get() = definedExternally
            set(value) = definedExternally
        var OriginalName: ResourceNameType?
            get() = definedExternally
            set(value) = definedExternally
        var Id: ResourceIdType?
            get() = definedExternally
            set(value) = definedExternally
        var VersionId: DocumentVersionIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Owner: UserMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var ParentId: ResourceIdType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourcePath {
        var Components: ResourcePathComponentList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourcePathComponent {
        var Id: IdType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ResourceNameType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SharePrincipal {
        var Id: IdType
        var Type: String /* "USER" | "GROUP" | "INVITE" | "ANONYMOUS" | "ORGANIZATION" | String */
        var Role: String /* "VIEWER" | "CONTRIBUTOR" | "OWNER" | "COOWNER" | String */
    }
    interface ShareResult {
        var PrincipalId: IdType?
            get() = definedExternally
            set(value) = definedExternally
        var InviteePrincipalId: IdType?
            get() = definedExternally
            set(value) = definedExternally
        var Role: String /* "VIEWER" | "CONTRIBUTOR" | "OWNER" | "COOWNER" | String */
        var Status: String /* "SUCCESS" | "FAILURE" | String */
        var ShareId: ResourceIdType?
            get() = definedExternally
            set(value) = definedExternally
        var StatusMessage: MessageType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SignedHeaderMap {
        @nativeGetter
        operator fun get(key: String): HeaderValueType?
        @nativeSetter
        operator fun set(key: String, value: HeaderValueType)
    }
    interface StorageRuleType {
        var StorageAllocatedInBytes: PositiveSizeType?
            get() = definedExternally
            set(value) = definedExternally
        var StorageType: String /* "UNLIMITED" | "QUOTA" | String */
    }
    interface Subscription {
        var SubscriptionId: IdType?
            get() = definedExternally
            set(value) = definedExternally
        var EndPoint: SubscriptionEndPointType?
            get() = definedExternally
            set(value) = definedExternally
        var Protocol: String /* "HTTPS" | String */
    }
    interface UpdateDocumentRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentId: ResourceIdType
        var Name: ResourceNameType?
            get() = definedExternally
            set(value) = definedExternally
        var ParentFolderId: ResourceIdType?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceState: String /* "ACTIVE" | "RESTORING" | "RECYCLING" | "RECYCLED" | String */
    }
    interface UpdateDocumentVersionRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentId: ResourceIdType
        var VersionId: DocumentVersionIdType
        var VersionStatus: String /* "ACTIVE" | String */
    }
    interface UpdateFolderRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var FolderId: ResourceIdType
        var Name: ResourceNameType?
            get() = definedExternally
            set(value) = definedExternally
        var ParentFolderId: ResourceIdType?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceState: String /* "ACTIVE" | "RESTORING" | "RECYCLING" | "RECYCLED" | String */
    }
    interface UpdateUserRequest {
        var AuthenticationToken: AuthenticationHeaderType?
            get() = definedExternally
            set(value) = definedExternally
        var UserId: IdType
        var GivenName: UserAttributeValueType?
            get() = definedExternally
            set(value) = definedExternally
        var Surname: UserAttributeValueType?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "USER" | "ADMIN" | "POWERUSER" | "MINIMALUSER" | "WORKSPACESUSER" | String */
        var StorageRule: StorageRuleType?
            get() = definedExternally
            set(value) = definedExternally
        var TimeZoneId: TimeZoneIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Locale: String /* "en" | "fr" | "ko" | "de" | "es" | "ja" | "ru" | "zh_CN" | "zh_TW" | "pt_BR" | "default" | String */
        var GrantPoweruserPrivileges: String /* "TRUE" | "FALSE" | String */
    }
    interface UpdateUserResponse {
        var User: User?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UploadMetadata {
        var UploadUrl: UrlType?
            get() = definedExternally
            set(value) = definedExternally
        var SignedHeaders: SignedHeaderMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface User {
        var Id: IdType?
            get() = definedExternally
            set(value) = definedExternally
        var Username: UsernameType?
            get() = definedExternally
            set(value) = definedExternally
        var EmailAddress: EmailAddressType?
            get() = definedExternally
            set(value) = definedExternally
        var GivenName: UserAttributeValueType?
            get() = definedExternally
            set(value) = definedExternally
        var Surname: UserAttributeValueType?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationId: IdType?
            get() = definedExternally
            set(value) = definedExternally
        var RootFolderId: ResourceIdType?
            get() = definedExternally
            set(value) = definedExternally
        var RecycleBinFolderId: ResourceIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "ACTIVE" | "INACTIVE" | "PENDING" | String */
        var Type: String /* "USER" | "ADMIN" | "POWERUSER" | "MINIMALUSER" | "WORKSPACESUSER" | String */
        var CreatedTimestamp: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var ModifiedTimestamp: TimestampType?
            get() = definedExternally
            set(value) = definedExternally
        var TimeZoneId: TimeZoneIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Locale: String /* "en" | "fr" | "ko" | "de" | "es" | "ja" | "ru" | "zh_CN" | "zh_TW" | "pt_BR" | "default" | String */
        var Storage: UserStorageMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserMetadata {
        var Id: IdType?
            get() = definedExternally
            set(value) = definedExternally
        var Username: UsernameType?
            get() = definedExternally
            set(value) = definedExternally
        var GivenName: UserAttributeValueType?
            get() = definedExternally
            set(value) = definedExternally
        var Surname: UserAttributeValueType?
            get() = definedExternally
            set(value) = definedExternally
        var EmailAddress: EmailAddressType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserStorageMetadata {
        var StorageUtilizedInBytes: SizeType?
            get() = definedExternally
            set(value) = definedExternally
        var StorageRule: StorageRuleType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2016-05-01" | "latest" | String */
    }
}