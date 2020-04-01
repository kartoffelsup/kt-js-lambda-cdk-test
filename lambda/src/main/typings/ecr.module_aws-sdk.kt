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
import ECR.Attribute
import ECR.AuthorizationData
import ECR.ImageDetail
import ECR.ImageFailure
import ECR.ImageIdentifier
import ECR.Image
import ECR.ImageScanFinding
import ECR.LayerFailure
import ECR.Layer
import ECR.LifecyclePolicyPreviewResult
import ECR.Repository
import ECR.Tag
import ECR.BatchCheckLayerAvailabilityRequest
import ECR.BatchCheckLayerAvailabilityResponse
import ECR.BatchDeleteImageRequest
import ECR.BatchDeleteImageResponse
import ECR.BatchGetImageRequest
import ECR.BatchGetImageResponse
import ECR.CompleteLayerUploadRequest
import ECR.CompleteLayerUploadResponse
import ECR.CreateRepositoryRequest
import ECR.CreateRepositoryResponse
import ECR.DeleteLifecyclePolicyRequest
import ECR.DeleteLifecyclePolicyResponse
import ECR.DeleteRepositoryRequest
import ECR.DeleteRepositoryResponse
import ECR.DeleteRepositoryPolicyRequest
import ECR.DeleteRepositoryPolicyResponse
import ECR.DescribeImageScanFindingsRequest
import ECR.DescribeImageScanFindingsResponse
import ECR.DescribeImagesRequest
import ECR.DescribeImagesResponse
import ECR.DescribeRepositoriesRequest
import ECR.DescribeRepositoriesResponse
import ECR.GetAuthorizationTokenRequest
import ECR.GetAuthorizationTokenResponse
import ECR.GetDownloadUrlForLayerRequest
import ECR.GetDownloadUrlForLayerResponse
import ECR.GetLifecyclePolicyRequest
import ECR.GetLifecyclePolicyResponse
import ECR.GetLifecyclePolicyPreviewRequest
import ECR.GetLifecyclePolicyPreviewResponse
import ECR.GetRepositoryPolicyRequest
import ECR.GetRepositoryPolicyResponse
import ECR.InitiateLayerUploadRequest
import ECR.InitiateLayerUploadResponse
import ECR.ListImagesRequest
import ECR.ListImagesResponse
import ECR.ListTagsForResourceRequest
import ECR.ListTagsForResourceResponse
import ECR.PutImageRequest
import ECR.PutImageResponse
import ECR.PutImageScanningConfigurationRequest
import ECR.PutImageScanningConfigurationResponse
import ECR.PutImageTagMutabilityRequest
import ECR.PutImageTagMutabilityResponse
import ECR.PutLifecyclePolicyRequest
import ECR.PutLifecyclePolicyResponse
import ECR.SetRepositoryPolicyRequest
import ECR.SetRepositoryPolicyResponse
import ECR.StartImageScanRequest
import ECR.StartImageScanResponse
import ECR.StartLifecyclePolicyPreviewRequest
import ECR.StartLifecyclePolicyPreviewResponse
import ECR.TagResourceRequest
import ECR.TagResourceResponse
import ECR.UntagResourceRequest
import ECR.UntagResourceResponse
import ECR.UploadLayerPartRequest
import ECR.UploadLayerPartResponse
import ECR.ImageScanningConfiguration
import ECR.ImageScanStatus
import ECR.ImageScanFindings
import ECR.DescribeImagesFilter
import ECR.LifecyclePolicyPreviewFilter
import ECR.LifecyclePolicyPreviewSummary
import ECR.ImageScanFindingsSummary
import ECR.FindingSeverityCounts
import ECR.LifecyclePolicyRuleAction
import ECR.ListImagesFilter

typealias Arn = String

typealias AttributeKey = String

typealias AttributeList = Array<Attribute>

typealias AttributeValue = String

typealias AuthorizationDataList = Array<AuthorizationData>

typealias Base64 = String

typealias BatchedOperationLayerDigest = String

typealias BatchedOperationLayerDigestList = Array<BatchedOperationLayerDigest>

typealias CreationTimestamp = Date

typealias EvaluationTimestamp = Date

typealias ExpirationTimestamp = Date

typealias FindingDescription = String

typealias FindingName = String

typealias ForceFlag = Boolean

typealias GetAuthorizationTokenRegistryIdList = Array<RegistryId>

typealias ImageCount = Number

typealias ImageDetailList = Array<ImageDetail>

typealias ImageDigest = String

typealias ImageFailureList = Array<ImageFailure>

typealias ImageFailureReason = String

typealias ImageIdentifierList = Array<ImageIdentifier>

typealias ImageList = Array<Image>

typealias ImageManifest = String

typealias ImageScanFindingList = Array<ImageScanFinding>

typealias ImageSizeInBytes = Number

typealias ImageTag = String

typealias ImageTagList = Array<ImageTag>

typealias LayerDigest = String

typealias LayerDigestList = Array<LayerDigest>

typealias LayerFailureList = Array<LayerFailure>

typealias LayerFailureReason = String

typealias LayerList = Array<Layer>

typealias LayerSizeInBytes = Number

typealias LifecyclePolicyPreviewResultList = Array<LifecyclePolicyPreviewResult>

typealias LifecyclePolicyRulePriority = Number

typealias LifecyclePolicyText = String

typealias LifecyclePreviewMaxResults = Number

typealias MaxResults = Number

typealias MediaType = String

typealias MediaTypeList = Array<MediaType>

typealias NextToken = String

typealias PartSize = Number

typealias ProxyEndpoint = String

typealias PushTimestamp = Date

typealias RegistryId = String

typealias RepositoryList = Array<Repository>

typealias RepositoryName = String

typealias RepositoryNameList = Array<RepositoryName>

typealias RepositoryPolicyText = String

typealias ScanOnPushFlag = Boolean

typealias ScanStatusDescription = String

typealias ScanTimestamp = Date

typealias SeverityCount = Number

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias UploadId = String

typealias Url = String

typealias VulnerabilitySourceUpdateTimestamp = Date

@JsModule("aws-sdk")
external open class ECR(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ECR.Types.ClientConfiguration */
    open fun batchCheckLayerAvailability(params: BatchCheckLayerAvailabilityRequest, callback: (err: AWSError, data: BatchCheckLayerAvailabilityResponse) -> Unit = definedExternally): Request<BatchCheckLayerAvailabilityResponse, AWSError>
    open fun batchCheckLayerAvailability(callback: (err: AWSError, data: BatchCheckLayerAvailabilityResponse) -> Unit = definedExternally): Request<BatchCheckLayerAvailabilityResponse, AWSError>
    open fun batchDeleteImage(params: BatchDeleteImageRequest, callback: (err: AWSError, data: BatchDeleteImageResponse) -> Unit = definedExternally): Request<BatchDeleteImageResponse, AWSError>
    open fun batchDeleteImage(callback: (err: AWSError, data: BatchDeleteImageResponse) -> Unit = definedExternally): Request<BatchDeleteImageResponse, AWSError>
    open fun batchGetImage(params: BatchGetImageRequest, callback: (err: AWSError, data: BatchGetImageResponse) -> Unit = definedExternally): Request<BatchGetImageResponse, AWSError>
    open fun batchGetImage(callback: (err: AWSError, data: BatchGetImageResponse) -> Unit = definedExternally): Request<BatchGetImageResponse, AWSError>
    open fun completeLayerUpload(params: CompleteLayerUploadRequest, callback: (err: AWSError, data: CompleteLayerUploadResponse) -> Unit = definedExternally): Request<CompleteLayerUploadResponse, AWSError>
    open fun completeLayerUpload(callback: (err: AWSError, data: CompleteLayerUploadResponse) -> Unit = definedExternally): Request<CompleteLayerUploadResponse, AWSError>
    open fun createRepository(params: CreateRepositoryRequest, callback: (err: AWSError, data: CreateRepositoryResponse) -> Unit = definedExternally): Request<CreateRepositoryResponse, AWSError>
    open fun createRepository(callback: (err: AWSError, data: CreateRepositoryResponse) -> Unit = definedExternally): Request<CreateRepositoryResponse, AWSError>
    open fun deleteLifecyclePolicy(params: DeleteLifecyclePolicyRequest, callback: (err: AWSError, data: DeleteLifecyclePolicyResponse) -> Unit = definedExternally): Request<DeleteLifecyclePolicyResponse, AWSError>
    open fun deleteLifecyclePolicy(callback: (err: AWSError, data: DeleteLifecyclePolicyResponse) -> Unit = definedExternally): Request<DeleteLifecyclePolicyResponse, AWSError>
    open fun deleteRepository(params: DeleteRepositoryRequest, callback: (err: AWSError, data: DeleteRepositoryResponse) -> Unit = definedExternally): Request<DeleteRepositoryResponse, AWSError>
    open fun deleteRepository(callback: (err: AWSError, data: DeleteRepositoryResponse) -> Unit = definedExternally): Request<DeleteRepositoryResponse, AWSError>
    open fun deleteRepositoryPolicy(params: DeleteRepositoryPolicyRequest, callback: (err: AWSError, data: DeleteRepositoryPolicyResponse) -> Unit = definedExternally): Request<DeleteRepositoryPolicyResponse, AWSError>
    open fun deleteRepositoryPolicy(callback: (err: AWSError, data: DeleteRepositoryPolicyResponse) -> Unit = definedExternally): Request<DeleteRepositoryPolicyResponse, AWSError>
    open fun describeImageScanFindings(params: DescribeImageScanFindingsRequest, callback: (err: AWSError, data: DescribeImageScanFindingsResponse) -> Unit = definedExternally): Request<DescribeImageScanFindingsResponse, AWSError>
    open fun describeImageScanFindings(callback: (err: AWSError, data: DescribeImageScanFindingsResponse) -> Unit = definedExternally): Request<DescribeImageScanFindingsResponse, AWSError>
    open fun describeImages(params: DescribeImagesRequest, callback: (err: AWSError, data: DescribeImagesResponse) -> Unit = definedExternally): Request<DescribeImagesResponse, AWSError>
    open fun describeImages(callback: (err: AWSError, data: DescribeImagesResponse) -> Unit = definedExternally): Request<DescribeImagesResponse, AWSError>
    open fun describeRepositories(params: DescribeRepositoriesRequest, callback: (err: AWSError, data: DescribeRepositoriesResponse) -> Unit = definedExternally): Request<DescribeRepositoriesResponse, AWSError>
    open fun describeRepositories(callback: (err: AWSError, data: DescribeRepositoriesResponse) -> Unit = definedExternally): Request<DescribeRepositoriesResponse, AWSError>
    open fun getAuthorizationToken(params: GetAuthorizationTokenRequest, callback: (err: AWSError, data: GetAuthorizationTokenResponse) -> Unit = definedExternally): Request<GetAuthorizationTokenResponse, AWSError>
    open fun getAuthorizationToken(callback: (err: AWSError, data: GetAuthorizationTokenResponse) -> Unit = definedExternally): Request<GetAuthorizationTokenResponse, AWSError>
    open fun getDownloadUrlForLayer(params: GetDownloadUrlForLayerRequest, callback: (err: AWSError, data: GetDownloadUrlForLayerResponse) -> Unit = definedExternally): Request<GetDownloadUrlForLayerResponse, AWSError>
    open fun getDownloadUrlForLayer(callback: (err: AWSError, data: GetDownloadUrlForLayerResponse) -> Unit = definedExternally): Request<GetDownloadUrlForLayerResponse, AWSError>
    open fun getLifecyclePolicy(params: GetLifecyclePolicyRequest, callback: (err: AWSError, data: GetLifecyclePolicyResponse) -> Unit = definedExternally): Request<GetLifecyclePolicyResponse, AWSError>
    open fun getLifecyclePolicy(callback: (err: AWSError, data: GetLifecyclePolicyResponse) -> Unit = definedExternally): Request<GetLifecyclePolicyResponse, AWSError>
    open fun getLifecyclePolicyPreview(params: GetLifecyclePolicyPreviewRequest, callback: (err: AWSError, data: GetLifecyclePolicyPreviewResponse) -> Unit = definedExternally): Request<GetLifecyclePolicyPreviewResponse, AWSError>
    open fun getLifecyclePolicyPreview(callback: (err: AWSError, data: GetLifecyclePolicyPreviewResponse) -> Unit = definedExternally): Request<GetLifecyclePolicyPreviewResponse, AWSError>
    open fun getRepositoryPolicy(params: GetRepositoryPolicyRequest, callback: (err: AWSError, data: GetRepositoryPolicyResponse) -> Unit = definedExternally): Request<GetRepositoryPolicyResponse, AWSError>
    open fun getRepositoryPolicy(callback: (err: AWSError, data: GetRepositoryPolicyResponse) -> Unit = definedExternally): Request<GetRepositoryPolicyResponse, AWSError>
    open fun initiateLayerUpload(params: InitiateLayerUploadRequest, callback: (err: AWSError, data: InitiateLayerUploadResponse) -> Unit = definedExternally): Request<InitiateLayerUploadResponse, AWSError>
    open fun initiateLayerUpload(callback: (err: AWSError, data: InitiateLayerUploadResponse) -> Unit = definedExternally): Request<InitiateLayerUploadResponse, AWSError>
    open fun listImages(params: ListImagesRequest, callback: (err: AWSError, data: ListImagesResponse) -> Unit = definedExternally): Request<ListImagesResponse, AWSError>
    open fun listImages(callback: (err: AWSError, data: ListImagesResponse) -> Unit = definedExternally): Request<ListImagesResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun putImage(params: PutImageRequest, callback: (err: AWSError, data: PutImageResponse) -> Unit = definedExternally): Request<PutImageResponse, AWSError>
    open fun putImage(callback: (err: AWSError, data: PutImageResponse) -> Unit = definedExternally): Request<PutImageResponse, AWSError>
    open fun putImageScanningConfiguration(params: PutImageScanningConfigurationRequest, callback: (err: AWSError, data: PutImageScanningConfigurationResponse) -> Unit = definedExternally): Request<PutImageScanningConfigurationResponse, AWSError>
    open fun putImageScanningConfiguration(callback: (err: AWSError, data: PutImageScanningConfigurationResponse) -> Unit = definedExternally): Request<PutImageScanningConfigurationResponse, AWSError>
    open fun putImageTagMutability(params: PutImageTagMutabilityRequest, callback: (err: AWSError, data: PutImageTagMutabilityResponse) -> Unit = definedExternally): Request<PutImageTagMutabilityResponse, AWSError>
    open fun putImageTagMutability(callback: (err: AWSError, data: PutImageTagMutabilityResponse) -> Unit = definedExternally): Request<PutImageTagMutabilityResponse, AWSError>
    open fun putLifecyclePolicy(params: PutLifecyclePolicyRequest, callback: (err: AWSError, data: PutLifecyclePolicyResponse) -> Unit = definedExternally): Request<PutLifecyclePolicyResponse, AWSError>
    open fun putLifecyclePolicy(callback: (err: AWSError, data: PutLifecyclePolicyResponse) -> Unit = definedExternally): Request<PutLifecyclePolicyResponse, AWSError>
    open fun setRepositoryPolicy(params: SetRepositoryPolicyRequest, callback: (err: AWSError, data: SetRepositoryPolicyResponse) -> Unit = definedExternally): Request<SetRepositoryPolicyResponse, AWSError>
    open fun setRepositoryPolicy(callback: (err: AWSError, data: SetRepositoryPolicyResponse) -> Unit = definedExternally): Request<SetRepositoryPolicyResponse, AWSError>
    open fun startImageScan(params: StartImageScanRequest, callback: (err: AWSError, data: StartImageScanResponse) -> Unit = definedExternally): Request<StartImageScanResponse, AWSError>
    open fun startImageScan(callback: (err: AWSError, data: StartImageScanResponse) -> Unit = definedExternally): Request<StartImageScanResponse, AWSError>
    open fun startLifecyclePolicyPreview(params: StartLifecyclePolicyPreviewRequest, callback: (err: AWSError, data: StartLifecyclePolicyPreviewResponse) -> Unit = definedExternally): Request<StartLifecyclePolicyPreviewResponse, AWSError>
    open fun startLifecyclePolicyPreview(callback: (err: AWSError, data: StartLifecyclePolicyPreviewResponse) -> Unit = definedExternally): Request<StartLifecyclePolicyPreviewResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun uploadLayerPart(params: UploadLayerPartRequest, callback: (err: AWSError, data: UploadLayerPartResponse) -> Unit = definedExternally): Request<UploadLayerPartResponse, AWSError>
    open fun uploadLayerPart(callback: (err: AWSError, data: UploadLayerPartResponse) -> Unit = definedExternally): Request<UploadLayerPartResponse, AWSError>
    open fun waitFor(state: String /* "imageScanComplete" */, params: DescribeImageScanFindingsRequest /* ECR.Types.DescribeImageScanFindingsRequest & `T$0` */, callback: (err: AWSError, data: DescribeImageScanFindingsResponse) -> Unit = definedExternally): Request<DescribeImageScanFindingsResponse, AWSError>
    open fun waitFor(state: String /* "imageScanComplete" */, callback: (err: AWSError, data: DescribeImageScanFindingsResponse) -> Unit = definedExternally): Request<DescribeImageScanFindingsResponse, AWSError>
    open fun waitFor(state: String /* "lifecyclePolicyPreviewComplete" */, params: GetLifecyclePolicyPreviewRequest /* ECR.Types.GetLifecyclePolicyPreviewRequest & `T$0` */, callback: (err: AWSError, data: GetLifecyclePolicyPreviewResponse) -> Unit = definedExternally): Request<GetLifecyclePolicyPreviewResponse, AWSError>
    open fun waitFor(state: String /* "lifecyclePolicyPreviewComplete" */, callback: (err: AWSError, data: GetLifecyclePolicyPreviewResponse) -> Unit = definedExternally): Request<GetLifecyclePolicyPreviewResponse, AWSError>
    interface Attribute {
        var key: AttributeKey
        var value: AttributeValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AuthorizationData {
        var authorizationToken: Base64?
            get() = definedExternally
            set(value) = definedExternally
        var expiresAt: ExpirationTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var proxyEndpoint: ProxyEndpoint?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchCheckLayerAvailabilityRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
        var layerDigests: BatchedOperationLayerDigestList
    }
    interface BatchCheckLayerAvailabilityResponse {
        var layers: LayerList?
            get() = definedExternally
            set(value) = definedExternally
        var failures: LayerFailureList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDeleteImageRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
        var imageIds: ImageIdentifierList
    }
    interface BatchDeleteImageResponse {
        var imageIds: ImageIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var failures: ImageFailureList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetImageRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
        var imageIds: ImageIdentifierList
        var acceptedMediaTypes: MediaTypeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetImageResponse {
        var images: ImageList?
            get() = definedExternally
            set(value) = definedExternally
        var failures: ImageFailureList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CompleteLayerUploadRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
        var uploadId: UploadId
        var layerDigests: LayerDigestList
    }
    interface CompleteLayerUploadResponse {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var uploadId: UploadId?
            get() = definedExternally
            set(value) = definedExternally
        var layerDigest: LayerDigest?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRepositoryRequest {
        var repositoryName: RepositoryName
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var imageTagMutability: String /* "MUTABLE" | "IMMUTABLE" | String */
        var imageScanningConfiguration: ImageScanningConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRepositoryResponse {
        var repository: Repository?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteLifecyclePolicyRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
    }
    interface DeleteLifecyclePolicyResponse {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var lifecyclePolicyText: LifecyclePolicyText?
            get() = definedExternally
            set(value) = definedExternally
        var lastEvaluatedAt: EvaluationTimestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteRepositoryPolicyRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
    }
    interface DeleteRepositoryPolicyResponse {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var policyText: RepositoryPolicyText?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteRepositoryRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
        var force: ForceFlag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteRepositoryResponse {
        var repository: Repository?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeImageScanFindingsRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
        var imageId: ImageIdentifier
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeImageScanFindingsResponse {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var imageId: ImageIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var imageScanStatus: ImageScanStatus?
            get() = definedExternally
            set(value) = definedExternally
        var imageScanFindings: ImageScanFindings?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeImagesFilter {
        var tagStatus: String /* "TAGGED" | "UNTAGGED" | "ANY" | String */
    }
    interface DescribeImagesRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
        var imageIds: ImageIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var filter: DescribeImagesFilter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeImagesResponse {
        var imageDetails: ImageDetailList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRepositoriesRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryNames: RepositoryNameList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRepositoriesResponse {
        var repositories: RepositoryList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FindingSeverityCounts {
        @nativeGetter
        operator fun get(key: String): SeverityCount?
        @nativeSetter
        operator fun set(key: String, value: SeverityCount)
    }
    interface GetAuthorizationTokenRequest {
        var registryIds: GetAuthorizationTokenRegistryIdList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAuthorizationTokenResponse {
        var authorizationData: AuthorizationDataList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDownloadUrlForLayerRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
        var layerDigest: LayerDigest
    }
    interface GetDownloadUrlForLayerResponse {
        var downloadUrl: Url?
            get() = definedExternally
            set(value) = definedExternally
        var layerDigest: LayerDigest?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLifecyclePolicyPreviewRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
        var imageIds: ImageIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: LifecyclePreviewMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var filter: LifecyclePolicyPreviewFilter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLifecyclePolicyPreviewResponse {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var lifecyclePolicyText: LifecyclePolicyText?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "IN_PROGRESS" | "COMPLETE" | "EXPIRED" | "FAILED" | String */
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var previewResults: LifecyclePolicyPreviewResultList?
            get() = definedExternally
            set(value) = definedExternally
        var summary: LifecyclePolicyPreviewSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLifecyclePolicyRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
    }
    interface GetLifecyclePolicyResponse {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var lifecyclePolicyText: LifecyclePolicyText?
            get() = definedExternally
            set(value) = definedExternally
        var lastEvaluatedAt: EvaluationTimestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRepositoryPolicyRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
    }
    interface GetRepositoryPolicyResponse {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var policyText: RepositoryPolicyText?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Image {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var imageId: ImageIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var imageManifest: ImageManifest?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImageDetail {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var imageDigest: ImageDigest?
            get() = definedExternally
            set(value) = definedExternally
        var imageTags: ImageTagList?
            get() = definedExternally
            set(value) = definedExternally
        var imageSizeInBytes: ImageSizeInBytes?
            get() = definedExternally
            set(value) = definedExternally
        var imagePushedAt: PushTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var imageScanStatus: ImageScanStatus?
            get() = definedExternally
            set(value) = definedExternally
        var imageScanFindingsSummary: ImageScanFindingsSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImageFailure {
        var imageId: ImageIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var failureCode: String /* "InvalidImageDigest" | "InvalidImageTag" | "ImageTagDoesNotMatchDigest" | "ImageNotFound" | "MissingDigestAndTag" | String */
        var failureReason: ImageFailureReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImageIdentifier {
        var imageDigest: ImageDigest?
            get() = definedExternally
            set(value) = definedExternally
        var imageTag: ImageTag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImageScanFinding {
        var name: FindingName?
            get() = definedExternally
            set(value) = definedExternally
        var description: FindingDescription?
            get() = definedExternally
            set(value) = definedExternally
        var uri: Url?
            get() = definedExternally
            set(value) = definedExternally
        var severity: String /* "INFORMATIONAL" | "LOW" | "MEDIUM" | "HIGH" | "CRITICAL" | "UNDEFINED" | String */
        var attributes: AttributeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImageScanFindings {
        var imageScanCompletedAt: ScanTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var vulnerabilitySourceUpdatedAt: VulnerabilitySourceUpdateTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var findings: ImageScanFindingList?
            get() = definedExternally
            set(value) = definedExternally
        var findingSeverityCounts: FindingSeverityCounts?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImageScanFindingsSummary {
        var imageScanCompletedAt: ScanTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var vulnerabilitySourceUpdatedAt: VulnerabilitySourceUpdateTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var findingSeverityCounts: FindingSeverityCounts?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImageScanStatus {
        var status: String /* "IN_PROGRESS" | "COMPLETE" | "FAILED" | String */
        var description: ScanStatusDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImageScanningConfiguration {
        var scanOnPush: ScanOnPushFlag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InitiateLayerUploadRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
    }
    interface InitiateLayerUploadResponse {
        var uploadId: UploadId?
            get() = definedExternally
            set(value) = definedExternally
        var partSize: PartSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Layer {
        var layerDigest: LayerDigest?
            get() = definedExternally
            set(value) = definedExternally
        var layerAvailability: String /* "AVAILABLE" | "UNAVAILABLE" | String */
        var layerSize: LayerSizeInBytes?
            get() = definedExternally
            set(value) = definedExternally
        var mediaType: MediaType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LayerFailure {
        var layerDigest: BatchedOperationLayerDigest?
            get() = definedExternally
            set(value) = definedExternally
        var failureCode: String /* "InvalidLayerDigest" | "MissingLayerDigest" | String */
        var failureReason: LayerFailureReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LifecyclePolicyPreviewFilter {
        var tagStatus: String /* "TAGGED" | "UNTAGGED" | "ANY" | String */
    }
    interface LifecyclePolicyPreviewResult {
        var imageTags: ImageTagList?
            get() = definedExternally
            set(value) = definedExternally
        var imageDigest: ImageDigest?
            get() = definedExternally
            set(value) = definedExternally
        var imagePushedAt: PushTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var action: LifecyclePolicyRuleAction?
            get() = definedExternally
            set(value) = definedExternally
        var appliedRulePriority: LifecyclePolicyRulePriority?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LifecyclePolicyPreviewSummary {
        var expiringImageTotalCount: ImageCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LifecyclePolicyRuleAction {
        var type: String /* "EXPIRE" | String */
    }
    interface ListImagesFilter {
        var tagStatus: String /* "TAGGED" | "UNTAGGED" | "ANY" | String */
    }
    interface ListImagesRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var filter: ListImagesFilter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListImagesResponse {
        var imageIds: ImageIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var resourceArn: Arn
    }
    interface ListTagsForResourceResponse {
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutImageRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
        var imageManifest: ImageManifest
        var imageTag: ImageTag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutImageResponse {
        var image: Image?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutImageScanningConfigurationRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
        var imageScanningConfiguration: ImageScanningConfiguration
    }
    interface PutImageScanningConfigurationResponse {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var imageScanningConfiguration: ImageScanningConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutImageTagMutabilityRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
        var imageTagMutability: String /* "MUTABLE" | "IMMUTABLE" | String */
    }
    interface PutImageTagMutabilityResponse {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var imageTagMutability: String /* "MUTABLE" | "IMMUTABLE" | String */
    }
    interface PutLifecyclePolicyRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
        var lifecyclePolicyText: LifecyclePolicyText
    }
    interface PutLifecyclePolicyResponse {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var lifecyclePolicyText: LifecyclePolicyText?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Repository {
        var repositoryArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryUri: Url?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: CreationTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var imageTagMutability: String /* "MUTABLE" | "IMMUTABLE" | String */
        var imageScanningConfiguration: ImageScanningConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetRepositoryPolicyRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
        var policyText: RepositoryPolicyText
        var force: ForceFlag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetRepositoryPolicyResponse {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var policyText: RepositoryPolicyText?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartImageScanRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
        var imageId: ImageIdentifier
    }
    interface StartImageScanResponse {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var imageId: ImageIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var imageScanStatus: ImageScanStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartLifecyclePolicyPreviewRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
        var lifecyclePolicyText: LifecyclePolicyText?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartLifecyclePolicyPreviewResponse {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var lifecyclePolicyText: LifecyclePolicyText?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "IN_PROGRESS" | "COMPLETE" | "EXPIRED" | "FAILED" | String */
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
        var resourceArn: Arn
        var tags: TagList
    }
    interface TagResourceResponse
    interface UntagResourceRequest {
        var resourceArn: Arn
        var tagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UploadLayerPartRequest {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName
        var uploadId: UploadId
        var partFirstByte: PartSize
        var partLastByte: PartSize
        var layerPartBlob: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UploadLayerPartResponse {
        var registryId: RegistryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var uploadId: UploadId?
            get() = definedExternally
            set(value) = definedExternally
        var lastByteReceived: PartSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2015-09-21" | "latest" | String */
    }
}