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
import Imagebuilder.Ami
import Imagebuilder.ComponentConfiguration
import Imagebuilder.ComponentSummary
import Imagebuilder.ComponentVersion
import Imagebuilder.DistributionConfigurationSummary
import Imagebuilder.Distribution
import Imagebuilder.Filter
import Imagebuilder.ImagePipeline
import Imagebuilder.ImageRecipeSummary
import Imagebuilder.ImageSummary
import Imagebuilder.ImageVersion
import Imagebuilder.InfrastructureConfigurationSummary
import Imagebuilder.InstanceBlockDeviceMapping
import Imagebuilder.CancelImageCreationRequest
import Imagebuilder.CancelImageCreationResponse
import Imagebuilder.CreateComponentRequest
import Imagebuilder.CreateComponentResponse
import Imagebuilder.CreateDistributionConfigurationRequest
import Imagebuilder.CreateDistributionConfigurationResponse
import Imagebuilder.CreateImageRequest
import Imagebuilder.CreateImageResponse
import Imagebuilder.CreateImagePipelineRequest
import Imagebuilder.CreateImagePipelineResponse
import Imagebuilder.CreateImageRecipeRequest
import Imagebuilder.CreateImageRecipeResponse
import Imagebuilder.CreateInfrastructureConfigurationRequest
import Imagebuilder.CreateInfrastructureConfigurationResponse
import Imagebuilder.DeleteComponentRequest
import Imagebuilder.DeleteComponentResponse
import Imagebuilder.DeleteDistributionConfigurationRequest
import Imagebuilder.DeleteDistributionConfigurationResponse
import Imagebuilder.DeleteImageRequest
import Imagebuilder.DeleteImageResponse
import Imagebuilder.DeleteImagePipelineRequest
import Imagebuilder.DeleteImagePipelineResponse
import Imagebuilder.DeleteImageRecipeRequest
import Imagebuilder.DeleteImageRecipeResponse
import Imagebuilder.DeleteInfrastructureConfigurationRequest
import Imagebuilder.DeleteInfrastructureConfigurationResponse
import Imagebuilder.GetComponentRequest
import Imagebuilder.GetComponentResponse
import Imagebuilder.GetComponentPolicyRequest
import Imagebuilder.GetComponentPolicyResponse
import Imagebuilder.GetDistributionConfigurationRequest
import Imagebuilder.GetDistributionConfigurationResponse
import Imagebuilder.GetImageRequest
import Imagebuilder.GetImageResponse
import Imagebuilder.GetImagePipelineRequest
import Imagebuilder.GetImagePipelineResponse
import Imagebuilder.GetImagePolicyRequest
import Imagebuilder.GetImagePolicyResponse
import Imagebuilder.GetImageRecipeRequest
import Imagebuilder.GetImageRecipeResponse
import Imagebuilder.GetImageRecipePolicyRequest
import Imagebuilder.GetImageRecipePolicyResponse
import Imagebuilder.GetInfrastructureConfigurationRequest
import Imagebuilder.GetInfrastructureConfigurationResponse
import Imagebuilder.ImportComponentRequest
import Imagebuilder.ImportComponentResponse
import Imagebuilder.ListComponentBuildVersionsRequest
import Imagebuilder.ListComponentBuildVersionsResponse
import Imagebuilder.ListComponentsRequest
import Imagebuilder.ListComponentsResponse
import Imagebuilder.ListDistributionConfigurationsRequest
import Imagebuilder.ListDistributionConfigurationsResponse
import Imagebuilder.ListImageBuildVersionsRequest
import Imagebuilder.ListImageBuildVersionsResponse
import Imagebuilder.ListImagePipelineImagesRequest
import Imagebuilder.ListImagePipelineImagesResponse
import Imagebuilder.ListImagePipelinesRequest
import Imagebuilder.ListImagePipelinesResponse
import Imagebuilder.ListImageRecipesRequest
import Imagebuilder.ListImageRecipesResponse
import Imagebuilder.ListImagesRequest
import Imagebuilder.ListImagesResponse
import Imagebuilder.ListInfrastructureConfigurationsRequest
import Imagebuilder.ListInfrastructureConfigurationsResponse
import Imagebuilder.ListTagsForResourceRequest
import Imagebuilder.ListTagsForResourceResponse
import Imagebuilder.PutComponentPolicyRequest
import Imagebuilder.PutComponentPolicyResponse
import Imagebuilder.PutImagePolicyRequest
import Imagebuilder.PutImagePolicyResponse
import Imagebuilder.PutImageRecipePolicyRequest
import Imagebuilder.PutImageRecipePolicyResponse
import Imagebuilder.StartImagePipelineExecutionRequest
import Imagebuilder.StartImagePipelineExecutionResponse
import Imagebuilder.TagResourceRequest
import Imagebuilder.TagResourceResponse
import Imagebuilder.UntagResourceRequest
import Imagebuilder.UntagResourceResponse
import Imagebuilder.UpdateDistributionConfigurationRequest
import Imagebuilder.UpdateDistributionConfigurationResponse
import Imagebuilder.UpdateImagePipelineRequest
import Imagebuilder.UpdateImagePipelineResponse
import Imagebuilder.UpdateInfrastructureConfigurationRequest
import Imagebuilder.UpdateInfrastructureConfigurationResponse
import Imagebuilder.ImageState
import Imagebuilder.TagMap
import Imagebuilder.LaunchPermissionConfiguration
import Imagebuilder.ImageTestsConfiguration
import Imagebuilder.Schedule
import Imagebuilder.Logging
import Imagebuilder.AmiDistributionConfiguration
import Imagebuilder.Component
import Imagebuilder.DistributionConfiguration
import Imagebuilder.ImageRecipe
import Imagebuilder.Image
import Imagebuilder.InfrastructureConfiguration
import Imagebuilder.OutputResources
import Imagebuilder.EbsInstanceBlockDeviceSpecification
import Imagebuilder.S3Logs

typealias AccountList = Array<NonEmptyString>

typealias AmiList = Array<Ami>

typealias AmiNameString = String

typealias Arn = String

typealias ArnList = Array<Arn>

typealias ClientToken = String

typealias ComponentBuildVersionArn = String

typealias ComponentConfigurationList = Array<ComponentConfiguration>

typealias ComponentData = String

typealias ComponentSummaryList = Array<ComponentSummary>

typealias ComponentVersionArn = String

typealias ComponentVersionArnOrBuildVersionArn = String

typealias ComponentVersionList = Array<ComponentVersion>

typealias DateTime = String

typealias DistributionConfigurationArn = String

typealias DistributionConfigurationSummaryList = Array<DistributionConfigurationSummary>

typealias DistributionList = Array<Distribution>

typealias DistributionTimeoutMinutes = Number

typealias EbsIopsInteger = Number

typealias EbsVolumeSizeInteger = Number

typealias EmptyString = String

typealias FilterList = Array<Filter>

typealias FilterName = String

typealias FilterValue = String

typealias FilterValues = Array<FilterValue>

typealias ImageBuildVersionArn = String

typealias ImageBuilderArn = String

typealias ImagePipelineArn = String

typealias ImagePipelineList = Array<ImagePipeline>

typealias ImageRecipeArn = String

typealias ImageRecipeSummaryList = Array<ImageRecipeSummary>

typealias ImageSummaryList = Array<ImageSummary>

typealias ImageTestsTimeoutMinutes = Number

typealias ImageVersionArn = String

typealias ImageVersionList = Array<ImageVersion>

typealias InfrastructureConfigurationArn = String

typealias InfrastructureConfigurationSummaryList = Array<InfrastructureConfigurationSummary>

typealias InlineComponentData = String

typealias InstanceBlockDeviceMappings = Array<InstanceBlockDeviceMapping>

typealias InstanceType = String

typealias InstanceTypeList = Array<InstanceType>

typealias NonEmptyString = String

typealias NullableBoolean = Boolean

typealias ResourceName = String

typealias ResourcePolicyDocument = String

typealias RestrictedInteger = Number

typealias SecurityGroupIds = Array<NonEmptyString>

typealias SnsTopicArn = String

typealias StringList = Array<NonEmptyString>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagValue = String

typealias Uri = String

typealias VersionNumber = String

@JsModule("aws-sdk")
external open class Imagebuilder(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Imagebuilder.Types.ClientConfiguration */
    open fun cancelImageCreation(params: CancelImageCreationRequest, callback: (err: AWSError, data: CancelImageCreationResponse) -> Unit = definedExternally): Request<CancelImageCreationResponse, AWSError>
    open fun cancelImageCreation(callback: (err: AWSError, data: CancelImageCreationResponse) -> Unit = definedExternally): Request<CancelImageCreationResponse, AWSError>
    open fun createComponent(params: CreateComponentRequest, callback: (err: AWSError, data: CreateComponentResponse) -> Unit = definedExternally): Request<CreateComponentResponse, AWSError>
    open fun createComponent(callback: (err: AWSError, data: CreateComponentResponse) -> Unit = definedExternally): Request<CreateComponentResponse, AWSError>
    open fun createDistributionConfiguration(params: CreateDistributionConfigurationRequest, callback: (err: AWSError, data: CreateDistributionConfigurationResponse) -> Unit = definedExternally): Request<CreateDistributionConfigurationResponse, AWSError>
    open fun createDistributionConfiguration(callback: (err: AWSError, data: CreateDistributionConfigurationResponse) -> Unit = definedExternally): Request<CreateDistributionConfigurationResponse, AWSError>
    open fun createImage(params: CreateImageRequest, callback: (err: AWSError, data: CreateImageResponse) -> Unit = definedExternally): Request<CreateImageResponse, AWSError>
    open fun createImage(callback: (err: AWSError, data: CreateImageResponse) -> Unit = definedExternally): Request<CreateImageResponse, AWSError>
    open fun createImagePipeline(params: CreateImagePipelineRequest, callback: (err: AWSError, data: CreateImagePipelineResponse) -> Unit = definedExternally): Request<CreateImagePipelineResponse, AWSError>
    open fun createImagePipeline(callback: (err: AWSError, data: CreateImagePipelineResponse) -> Unit = definedExternally): Request<CreateImagePipelineResponse, AWSError>
    open fun createImageRecipe(params: CreateImageRecipeRequest, callback: (err: AWSError, data: CreateImageRecipeResponse) -> Unit = definedExternally): Request<CreateImageRecipeResponse, AWSError>
    open fun createImageRecipe(callback: (err: AWSError, data: CreateImageRecipeResponse) -> Unit = definedExternally): Request<CreateImageRecipeResponse, AWSError>
    open fun createInfrastructureConfiguration(params: CreateInfrastructureConfigurationRequest, callback: (err: AWSError, data: CreateInfrastructureConfigurationResponse) -> Unit = definedExternally): Request<CreateInfrastructureConfigurationResponse, AWSError>
    open fun createInfrastructureConfiguration(callback: (err: AWSError, data: CreateInfrastructureConfigurationResponse) -> Unit = definedExternally): Request<CreateInfrastructureConfigurationResponse, AWSError>
    open fun deleteComponent(params: DeleteComponentRequest, callback: (err: AWSError, data: DeleteComponentResponse) -> Unit = definedExternally): Request<DeleteComponentResponse, AWSError>
    open fun deleteComponent(callback: (err: AWSError, data: DeleteComponentResponse) -> Unit = definedExternally): Request<DeleteComponentResponse, AWSError>
    open fun deleteDistributionConfiguration(params: DeleteDistributionConfigurationRequest, callback: (err: AWSError, data: DeleteDistributionConfigurationResponse) -> Unit = definedExternally): Request<DeleteDistributionConfigurationResponse, AWSError>
    open fun deleteDistributionConfiguration(callback: (err: AWSError, data: DeleteDistributionConfigurationResponse) -> Unit = definedExternally): Request<DeleteDistributionConfigurationResponse, AWSError>
    open fun deleteImage(params: DeleteImageRequest, callback: (err: AWSError, data: DeleteImageResponse) -> Unit = definedExternally): Request<DeleteImageResponse, AWSError>
    open fun deleteImage(callback: (err: AWSError, data: DeleteImageResponse) -> Unit = definedExternally): Request<DeleteImageResponse, AWSError>
    open fun deleteImagePipeline(params: DeleteImagePipelineRequest, callback: (err: AWSError, data: DeleteImagePipelineResponse) -> Unit = definedExternally): Request<DeleteImagePipelineResponse, AWSError>
    open fun deleteImagePipeline(callback: (err: AWSError, data: DeleteImagePipelineResponse) -> Unit = definedExternally): Request<DeleteImagePipelineResponse, AWSError>
    open fun deleteImageRecipe(params: DeleteImageRecipeRequest, callback: (err: AWSError, data: DeleteImageRecipeResponse) -> Unit = definedExternally): Request<DeleteImageRecipeResponse, AWSError>
    open fun deleteImageRecipe(callback: (err: AWSError, data: DeleteImageRecipeResponse) -> Unit = definedExternally): Request<DeleteImageRecipeResponse, AWSError>
    open fun deleteInfrastructureConfiguration(params: DeleteInfrastructureConfigurationRequest, callback: (err: AWSError, data: DeleteInfrastructureConfigurationResponse) -> Unit = definedExternally): Request<DeleteInfrastructureConfigurationResponse, AWSError>
    open fun deleteInfrastructureConfiguration(callback: (err: AWSError, data: DeleteInfrastructureConfigurationResponse) -> Unit = definedExternally): Request<DeleteInfrastructureConfigurationResponse, AWSError>
    open fun getComponent(params: GetComponentRequest, callback: (err: AWSError, data: GetComponentResponse) -> Unit = definedExternally): Request<GetComponentResponse, AWSError>
    open fun getComponent(callback: (err: AWSError, data: GetComponentResponse) -> Unit = definedExternally): Request<GetComponentResponse, AWSError>
    open fun getComponentPolicy(params: GetComponentPolicyRequest, callback: (err: AWSError, data: GetComponentPolicyResponse) -> Unit = definedExternally): Request<GetComponentPolicyResponse, AWSError>
    open fun getComponentPolicy(callback: (err: AWSError, data: GetComponentPolicyResponse) -> Unit = definedExternally): Request<GetComponentPolicyResponse, AWSError>
    open fun getDistributionConfiguration(params: GetDistributionConfigurationRequest, callback: (err: AWSError, data: GetDistributionConfigurationResponse) -> Unit = definedExternally): Request<GetDistributionConfigurationResponse, AWSError>
    open fun getDistributionConfiguration(callback: (err: AWSError, data: GetDistributionConfigurationResponse) -> Unit = definedExternally): Request<GetDistributionConfigurationResponse, AWSError>
    open fun getImage(params: GetImageRequest, callback: (err: AWSError, data: GetImageResponse) -> Unit = definedExternally): Request<GetImageResponse, AWSError>
    open fun getImage(callback: (err: AWSError, data: GetImageResponse) -> Unit = definedExternally): Request<GetImageResponse, AWSError>
    open fun getImagePipeline(params: GetImagePipelineRequest, callback: (err: AWSError, data: GetImagePipelineResponse) -> Unit = definedExternally): Request<GetImagePipelineResponse, AWSError>
    open fun getImagePipeline(callback: (err: AWSError, data: GetImagePipelineResponse) -> Unit = definedExternally): Request<GetImagePipelineResponse, AWSError>
    open fun getImagePolicy(params: GetImagePolicyRequest, callback: (err: AWSError, data: GetImagePolicyResponse) -> Unit = definedExternally): Request<GetImagePolicyResponse, AWSError>
    open fun getImagePolicy(callback: (err: AWSError, data: GetImagePolicyResponse) -> Unit = definedExternally): Request<GetImagePolicyResponse, AWSError>
    open fun getImageRecipe(params: GetImageRecipeRequest, callback: (err: AWSError, data: GetImageRecipeResponse) -> Unit = definedExternally): Request<GetImageRecipeResponse, AWSError>
    open fun getImageRecipe(callback: (err: AWSError, data: GetImageRecipeResponse) -> Unit = definedExternally): Request<GetImageRecipeResponse, AWSError>
    open fun getImageRecipePolicy(params: GetImageRecipePolicyRequest, callback: (err: AWSError, data: GetImageRecipePolicyResponse) -> Unit = definedExternally): Request<GetImageRecipePolicyResponse, AWSError>
    open fun getImageRecipePolicy(callback: (err: AWSError, data: GetImageRecipePolicyResponse) -> Unit = definedExternally): Request<GetImageRecipePolicyResponse, AWSError>
    open fun getInfrastructureConfiguration(params: GetInfrastructureConfigurationRequest, callback: (err: AWSError, data: GetInfrastructureConfigurationResponse) -> Unit = definedExternally): Request<GetInfrastructureConfigurationResponse, AWSError>
    open fun getInfrastructureConfiguration(callback: (err: AWSError, data: GetInfrastructureConfigurationResponse) -> Unit = definedExternally): Request<GetInfrastructureConfigurationResponse, AWSError>
    open fun importComponent(params: ImportComponentRequest, callback: (err: AWSError, data: ImportComponentResponse) -> Unit = definedExternally): Request<ImportComponentResponse, AWSError>
    open fun importComponent(callback: (err: AWSError, data: ImportComponentResponse) -> Unit = definedExternally): Request<ImportComponentResponse, AWSError>
    open fun listComponentBuildVersions(params: ListComponentBuildVersionsRequest, callback: (err: AWSError, data: ListComponentBuildVersionsResponse) -> Unit = definedExternally): Request<ListComponentBuildVersionsResponse, AWSError>
    open fun listComponentBuildVersions(callback: (err: AWSError, data: ListComponentBuildVersionsResponse) -> Unit = definedExternally): Request<ListComponentBuildVersionsResponse, AWSError>
    open fun listComponents(params: ListComponentsRequest, callback: (err: AWSError, data: ListComponentsResponse) -> Unit = definedExternally): Request<ListComponentsResponse, AWSError>
    open fun listComponents(callback: (err: AWSError, data: ListComponentsResponse) -> Unit = definedExternally): Request<ListComponentsResponse, AWSError>
    open fun listDistributionConfigurations(params: ListDistributionConfigurationsRequest, callback: (err: AWSError, data: ListDistributionConfigurationsResponse) -> Unit = definedExternally): Request<ListDistributionConfigurationsResponse, AWSError>
    open fun listDistributionConfigurations(callback: (err: AWSError, data: ListDistributionConfigurationsResponse) -> Unit = definedExternally): Request<ListDistributionConfigurationsResponse, AWSError>
    open fun listImageBuildVersions(params: ListImageBuildVersionsRequest, callback: (err: AWSError, data: ListImageBuildVersionsResponse) -> Unit = definedExternally): Request<ListImageBuildVersionsResponse, AWSError>
    open fun listImageBuildVersions(callback: (err: AWSError, data: ListImageBuildVersionsResponse) -> Unit = definedExternally): Request<ListImageBuildVersionsResponse, AWSError>
    open fun listImagePipelineImages(params: ListImagePipelineImagesRequest, callback: (err: AWSError, data: ListImagePipelineImagesResponse) -> Unit = definedExternally): Request<ListImagePipelineImagesResponse, AWSError>
    open fun listImagePipelineImages(callback: (err: AWSError, data: ListImagePipelineImagesResponse) -> Unit = definedExternally): Request<ListImagePipelineImagesResponse, AWSError>
    open fun listImagePipelines(params: ListImagePipelinesRequest, callback: (err: AWSError, data: ListImagePipelinesResponse) -> Unit = definedExternally): Request<ListImagePipelinesResponse, AWSError>
    open fun listImagePipelines(callback: (err: AWSError, data: ListImagePipelinesResponse) -> Unit = definedExternally): Request<ListImagePipelinesResponse, AWSError>
    open fun listImageRecipes(params: ListImageRecipesRequest, callback: (err: AWSError, data: ListImageRecipesResponse) -> Unit = definedExternally): Request<ListImageRecipesResponse, AWSError>
    open fun listImageRecipes(callback: (err: AWSError, data: ListImageRecipesResponse) -> Unit = definedExternally): Request<ListImageRecipesResponse, AWSError>
    open fun listImages(params: ListImagesRequest, callback: (err: AWSError, data: ListImagesResponse) -> Unit = definedExternally): Request<ListImagesResponse, AWSError>
    open fun listImages(callback: (err: AWSError, data: ListImagesResponse) -> Unit = definedExternally): Request<ListImagesResponse, AWSError>
    open fun listInfrastructureConfigurations(params: ListInfrastructureConfigurationsRequest, callback: (err: AWSError, data: ListInfrastructureConfigurationsResponse) -> Unit = definedExternally): Request<ListInfrastructureConfigurationsResponse, AWSError>
    open fun listInfrastructureConfigurations(callback: (err: AWSError, data: ListInfrastructureConfigurationsResponse) -> Unit = definedExternally): Request<ListInfrastructureConfigurationsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun putComponentPolicy(params: PutComponentPolicyRequest, callback: (err: AWSError, data: PutComponentPolicyResponse) -> Unit = definedExternally): Request<PutComponentPolicyResponse, AWSError>
    open fun putComponentPolicy(callback: (err: AWSError, data: PutComponentPolicyResponse) -> Unit = definedExternally): Request<PutComponentPolicyResponse, AWSError>
    open fun putImagePolicy(params: PutImagePolicyRequest, callback: (err: AWSError, data: PutImagePolicyResponse) -> Unit = definedExternally): Request<PutImagePolicyResponse, AWSError>
    open fun putImagePolicy(callback: (err: AWSError, data: PutImagePolicyResponse) -> Unit = definedExternally): Request<PutImagePolicyResponse, AWSError>
    open fun putImageRecipePolicy(params: PutImageRecipePolicyRequest, callback: (err: AWSError, data: PutImageRecipePolicyResponse) -> Unit = definedExternally): Request<PutImageRecipePolicyResponse, AWSError>
    open fun putImageRecipePolicy(callback: (err: AWSError, data: PutImageRecipePolicyResponse) -> Unit = definedExternally): Request<PutImageRecipePolicyResponse, AWSError>
    open fun startImagePipelineExecution(params: StartImagePipelineExecutionRequest, callback: (err: AWSError, data: StartImagePipelineExecutionResponse) -> Unit = definedExternally): Request<StartImagePipelineExecutionResponse, AWSError>
    open fun startImagePipelineExecution(callback: (err: AWSError, data: StartImagePipelineExecutionResponse) -> Unit = definedExternally): Request<StartImagePipelineExecutionResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateDistributionConfiguration(params: UpdateDistributionConfigurationRequest, callback: (err: AWSError, data: UpdateDistributionConfigurationResponse) -> Unit = definedExternally): Request<UpdateDistributionConfigurationResponse, AWSError>
    open fun updateDistributionConfiguration(callback: (err: AWSError, data: UpdateDistributionConfigurationResponse) -> Unit = definedExternally): Request<UpdateDistributionConfigurationResponse, AWSError>
    open fun updateImagePipeline(params: UpdateImagePipelineRequest, callback: (err: AWSError, data: UpdateImagePipelineResponse) -> Unit = definedExternally): Request<UpdateImagePipelineResponse, AWSError>
    open fun updateImagePipeline(callback: (err: AWSError, data: UpdateImagePipelineResponse) -> Unit = definedExternally): Request<UpdateImagePipelineResponse, AWSError>
    open fun updateInfrastructureConfiguration(params: UpdateInfrastructureConfigurationRequest, callback: (err: AWSError, data: UpdateInfrastructureConfigurationResponse) -> Unit = definedExternally): Request<UpdateInfrastructureConfigurationResponse, AWSError>
    open fun updateInfrastructureConfiguration(callback: (err: AWSError, data: UpdateInfrastructureConfigurationResponse) -> Unit = definedExternally): Request<UpdateInfrastructureConfigurationResponse, AWSError>
    interface Ami {
        var region: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var image: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var name: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var state: ImageState?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AmiDistributionConfiguration {
        var name: AmiNameString?
            get() = definedExternally
            set(value) = definedExternally
        var description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var amiTags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var launchPermission: LaunchPermissionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelImageCreationRequest {
        var imageBuildVersionArn: ImageBuildVersionArn
        var clientToken: ClientToken
    }
    interface CancelImageCreationResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var imageBuildVersionArn: ImageBuildVersionArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Component {
        var arn: ImageBuilderArn?
            get() = definedExternally
            set(value) = definedExternally
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var version: VersionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var changeDescription: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "BUILD" | "TEST" | String */
        var platform: String /* "Windows" | "Linux" | String */
        var owner: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var data: ComponentData?
            get() = definedExternally
            set(value) = definedExternally
        var kmsKeyId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var encrypted: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var dateCreated: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ComponentConfiguration {
        var componentArn: ComponentVersionArnOrBuildVersionArn
    }
    interface ComponentSummary {
        var arn: ImageBuilderArn?
            get() = definedExternally
            set(value) = definedExternally
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var version: VersionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var platform: String /* "Windows" | "Linux" | String */
        var type: String /* "BUILD" | "TEST" | String */
        var owner: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var changeDescription: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var dateCreated: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ComponentVersion {
        var arn: ImageBuilderArn?
            get() = definedExternally
            set(value) = definedExternally
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var version: VersionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var platform: String /* "Windows" | "Linux" | String */
        var type: String /* "BUILD" | "TEST" | String */
        var owner: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var dateCreated: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateComponentRequest {
        var name: ResourceName
        var semanticVersion: VersionNumber
        var description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var changeDescription: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var platform: String /* "Windows" | "Linux" | String */
        var data: InlineComponentData?
            get() = definedExternally
            set(value) = definedExternally
        var uri: Uri?
            get() = definedExternally
            set(value) = definedExternally
        var kmsKeyId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken
    }
    interface CreateComponentResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var componentBuildVersionArn: ComponentBuildVersionArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDistributionConfigurationRequest {
        var name: ResourceName
        var description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var distributions: DistributionList
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken
    }
    interface CreateDistributionConfigurationResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var distributionConfigurationArn: DistributionConfigurationArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateImagePipelineRequest {
        var name: ResourceName
        var description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var imageRecipeArn: ImageRecipeArn
        var infrastructureConfigurationArn: InfrastructureConfigurationArn
        var distributionConfigurationArn: DistributionConfigurationArn?
            get() = definedExternally
            set(value) = definedExternally
        var imageTestsConfiguration: ImageTestsConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var schedule: Schedule?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "DISABLED" | "ENABLED" | String */
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken
    }
    interface CreateImagePipelineResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var imagePipelineArn: ImagePipelineArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateImageRecipeRequest {
        var name: ResourceName
        var description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var semanticVersion: VersionNumber
        var components: ComponentConfigurationList
        var parentImage: NonEmptyString
        var blockDeviceMappings: InstanceBlockDeviceMappings?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken
    }
    interface CreateImageRecipeResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var imageRecipeArn: ImageRecipeArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateImageRequest {
        var imageRecipeArn: ImageRecipeArn
        var distributionConfigurationArn: DistributionConfigurationArn?
            get() = definedExternally
            set(value) = definedExternally
        var infrastructureConfigurationArn: InfrastructureConfigurationArn
        var imageTestsConfiguration: ImageTestsConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken
    }
    interface CreateImageResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var imageBuildVersionArn: ImageBuildVersionArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateInfrastructureConfigurationRequest {
        var name: ResourceName
        var description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var instanceTypes: InstanceTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var instanceProfileName: NonEmptyString
        var securityGroupIds: SecurityGroupIds?
            get() = definedExternally
            set(value) = definedExternally
        var subnetId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var logging: Logging?
            get() = definedExternally
            set(value) = definedExternally
        var keyPair: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var terminateInstanceOnFailure: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var snsTopicArn: SnsTopicArn?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken
    }
    interface CreateInfrastructureConfigurationResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var infrastructureConfigurationArn: InfrastructureConfigurationArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteComponentRequest {
        var componentBuildVersionArn: ComponentBuildVersionArn
    }
    interface DeleteComponentResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var componentBuildVersionArn: ComponentBuildVersionArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDistributionConfigurationRequest {
        var distributionConfigurationArn: DistributionConfigurationArn
    }
    interface DeleteDistributionConfigurationResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var distributionConfigurationArn: DistributionConfigurationArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteImagePipelineRequest {
        var imagePipelineArn: ImagePipelineArn
    }
    interface DeleteImagePipelineResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var imagePipelineArn: ImagePipelineArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteImageRecipeRequest {
        var imageRecipeArn: ImageRecipeArn
    }
    interface DeleteImageRecipeResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var imageRecipeArn: ImageRecipeArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteImageRequest {
        var imageBuildVersionArn: ImageBuildVersionArn
    }
    interface DeleteImageResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var imageBuildVersionArn: ImageBuildVersionArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteInfrastructureConfigurationRequest {
        var infrastructureConfigurationArn: InfrastructureConfigurationArn
    }
    interface DeleteInfrastructureConfigurationResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var infrastructureConfigurationArn: InfrastructureConfigurationArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Distribution {
        var region: NonEmptyString
        var amiDistributionConfiguration: AmiDistributionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var licenseConfigurationArns: ArnList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DistributionConfiguration {
        var arn: ImageBuilderArn?
            get() = definedExternally
            set(value) = definedExternally
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var distributions: DistributionList?
            get() = definedExternally
            set(value) = definedExternally
        var timeoutMinutes: DistributionTimeoutMinutes
        var dateCreated: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var dateUpdated: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DistributionConfigurationSummary {
        var arn: ImageBuilderArn?
            get() = definedExternally
            set(value) = definedExternally
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var dateCreated: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var dateUpdated: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EbsInstanceBlockDeviceSpecification {
        var encrypted: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var deleteOnTermination: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var iops: EbsIopsInteger?
            get() = definedExternally
            set(value) = definedExternally
        var kmsKeyId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var snapshotId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var volumeSize: EbsVolumeSizeInteger?
            get() = definedExternally
            set(value) = definedExternally
        var volumeType: String /* "standard" | "io1" | "gp2" | "sc1" | "st1" | String */
    }
    interface Filter {
        var name: FilterName?
            get() = definedExternally
            set(value) = definedExternally
        var values: FilterValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetComponentPolicyRequest {
        var componentArn: ComponentBuildVersionArn
    }
    interface GetComponentPolicyResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var policy: ResourcePolicyDocument?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetComponentRequest {
        var componentBuildVersionArn: ComponentBuildVersionArn
    }
    interface GetComponentResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var component: Component?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDistributionConfigurationRequest {
        var distributionConfigurationArn: DistributionConfigurationArn
    }
    interface GetDistributionConfigurationResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var distributionConfiguration: DistributionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetImagePipelineRequest {
        var imagePipelineArn: ImagePipelineArn
    }
    interface GetImagePipelineResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var imagePipeline: ImagePipeline?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetImagePolicyRequest {
        var imageArn: ImageBuildVersionArn
    }
    interface GetImagePolicyResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var policy: ResourcePolicyDocument?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetImageRecipePolicyRequest {
        var imageRecipeArn: ImageRecipeArn
    }
    interface GetImageRecipePolicyResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var policy: ResourcePolicyDocument?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetImageRecipeRequest {
        var imageRecipeArn: ImageRecipeArn
    }
    interface GetImageRecipeResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var imageRecipe: ImageRecipe?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetImageRequest {
        var imageBuildVersionArn: ImageBuildVersionArn
    }
    interface GetImageResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var image: Image?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInfrastructureConfigurationRequest {
        var infrastructureConfigurationArn: InfrastructureConfigurationArn
    }
    interface GetInfrastructureConfigurationResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var infrastructureConfiguration: InfrastructureConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Image {
        var arn: ImageBuilderArn?
            get() = definedExternally
            set(value) = definedExternally
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var version: VersionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var platform: String /* "Windows" | "Linux" | String */
        var state: ImageState?
            get() = definedExternally
            set(value) = definedExternally
        var imageRecipe: ImageRecipe?
            get() = definedExternally
            set(value) = definedExternally
        var sourcePipelineName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var sourcePipelineArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var infrastructureConfiguration: InfrastructureConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var distributionConfiguration: DistributionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var imageTestsConfiguration: ImageTestsConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var dateCreated: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var outputResources: OutputResources?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImagePipeline {
        var arn: ImageBuilderArn?
            get() = definedExternally
            set(value) = definedExternally
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var platform: String /* "Windows" | "Linux" | String */
        var imageRecipeArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var infrastructureConfigurationArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var distributionConfigurationArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var imageTestsConfiguration: ImageTestsConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var schedule: Schedule?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "DISABLED" | "ENABLED" | String */
        var dateCreated: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var dateUpdated: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var dateLastRun: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var dateNextRun: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImageRecipe {
        var arn: ImageBuilderArn?
            get() = definedExternally
            set(value) = definedExternally
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var platform: String /* "Windows" | "Linux" | String */
        var owner: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var version: VersionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var components: ComponentConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
        var parentImage: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var blockDeviceMappings: InstanceBlockDeviceMappings?
            get() = definedExternally
            set(value) = definedExternally
        var dateCreated: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImageRecipeSummary {
        var arn: ImageBuilderArn?
            get() = definedExternally
            set(value) = definedExternally
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var platform: String /* "Windows" | "Linux" | String */
        var owner: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var parentImage: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var dateCreated: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImageState {
        var status: String /* "PENDING" | "CREATING" | "BUILDING" | "TESTING" | "DISTRIBUTING" | "INTEGRATING" | "AVAILABLE" | "CANCELLED" | "FAILED" | "DEPRECATED" | "DELETED" | String */
        var reason: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImageSummary {
        var arn: ImageBuilderArn?
            get() = definedExternally
            set(value) = definedExternally
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var version: VersionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var platform: String /* "Windows" | "Linux" | String */
        var state: ImageState?
            get() = definedExternally
            set(value) = definedExternally
        var owner: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var dateCreated: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var outputResources: OutputResources?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImageTestsConfiguration {
        var imageTestsEnabled: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var timeoutMinutes: ImageTestsTimeoutMinutes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImageVersion {
        var arn: ImageBuilderArn?
            get() = definedExternally
            set(value) = definedExternally
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var version: VersionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var platform: String /* "Windows" | "Linux" | String */
        var owner: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var dateCreated: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportComponentRequest {
        var name: ResourceName
        var semanticVersion: VersionNumber
        var description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var changeDescription: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "BUILD" | "TEST" | String */
        var format: String /* "SHELL" | String */
        var platform: String /* "Windows" | "Linux" | String */
        var data: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var uri: Uri?
            get() = definedExternally
            set(value) = definedExternally
        var kmsKeyId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken
    }
    interface ImportComponentResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var componentBuildVersionArn: ComponentBuildVersionArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InfrastructureConfiguration {
        var arn: ImageBuilderArn?
            get() = definedExternally
            set(value) = definedExternally
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var instanceTypes: InstanceTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var instanceProfileName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var securityGroupIds: SecurityGroupIds?
            get() = definedExternally
            set(value) = definedExternally
        var subnetId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var logging: Logging?
            get() = definedExternally
            set(value) = definedExternally
        var keyPair: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var terminateInstanceOnFailure: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var snsTopicArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var dateCreated: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var dateUpdated: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InfrastructureConfigurationSummary {
        var arn: ImageBuilderArn?
            get() = definedExternally
            set(value) = definedExternally
        var name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var dateCreated: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var dateUpdated: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceBlockDeviceMapping {
        var deviceName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var ebs: EbsInstanceBlockDeviceSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var virtualName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var noDevice: EmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LaunchPermissionConfiguration {
        var userIds: AccountList?
            get() = definedExternally
            set(value) = definedExternally
        var userGroups: StringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListComponentBuildVersionsRequest {
        var componentVersionArn: ComponentVersionArn
        var maxResults: RestrictedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListComponentBuildVersionsResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var componentSummaryList: ComponentSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListComponentsRequest {
        var owner: String /* "Self" | "Shared" | "Amazon" | String */
        var filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: RestrictedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListComponentsResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var componentVersionList: ComponentVersionList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDistributionConfigurationsRequest {
        var filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: RestrictedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDistributionConfigurationsResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var distributionConfigurationSummaryList: DistributionConfigurationSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListImageBuildVersionsRequest {
        var imageVersionArn: ImageVersionArn
        var filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: RestrictedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListImageBuildVersionsResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var imageSummaryList: ImageSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListImagePipelineImagesRequest {
        var imagePipelineArn: ImagePipelineArn
        var filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: RestrictedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListImagePipelineImagesResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var imageSummaryList: ImageSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListImagePipelinesRequest {
        var filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: RestrictedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListImagePipelinesResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var imagePipelineList: ImagePipelineList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListImageRecipesRequest {
        var owner: String /* "Self" | "Shared" | "Amazon" | String */
        var filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: RestrictedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListImageRecipesResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var imageRecipeSummaryList: ImageRecipeSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListImagesRequest {
        var owner: String /* "Self" | "Shared" | "Amazon" | String */
        var filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: RestrictedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListImagesResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var imageVersionList: ImageVersionList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInfrastructureConfigurationsRequest {
        var filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: RestrictedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInfrastructureConfigurationsResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var infrastructureConfigurationSummaryList: InfrastructureConfigurationSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var resourceArn: ImageBuilderArn
    }
    interface ListTagsForResourceResponse {
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Logging {
        var s3Logs: S3Logs?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OutputResources {
        var amis: AmiList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutComponentPolicyRequest {
        var componentArn: ComponentBuildVersionArn
        var policy: ResourcePolicyDocument
    }
    interface PutComponentPolicyResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var componentArn: ComponentBuildVersionArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutImagePolicyRequest {
        var imageArn: ImageBuildVersionArn
        var policy: ResourcePolicyDocument
    }
    interface PutImagePolicyResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var imageArn: ImageBuildVersionArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutImageRecipePolicyRequest {
        var imageRecipeArn: ImageRecipeArn
        var policy: ResourcePolicyDocument
    }
    interface PutImageRecipePolicyResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var imageRecipeArn: ImageRecipeArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3Logs {
        var s3BucketName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var s3KeyPrefix: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Schedule {
        var scheduleExpression: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var pipelineExecutionStartCondition: String /* "EXPRESSION_MATCH_ONLY" | "EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE" | String */
    }
    interface StartImagePipelineExecutionRequest {
        var imagePipelineArn: ImagePipelineArn
        var clientToken: ClientToken
    }
    interface StartImagePipelineExecutionResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var imageBuildVersionArn: ImageBuildVersionArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagMap {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface TagResourceRequest {
        var resourceArn: ImageBuilderArn
        var tags: TagMap
    }
    interface TagResourceResponse
    interface UntagResourceRequest {
        var resourceArn: ImageBuilderArn
        var tagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateDistributionConfigurationRequest {
        var distributionConfigurationArn: DistributionConfigurationArn
        var description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var distributions: DistributionList
        var clientToken: ClientToken
    }
    interface UpdateDistributionConfigurationResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var distributionConfigurationArn: DistributionConfigurationArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateImagePipelineRequest {
        var imagePipelineArn: ImagePipelineArn
        var description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var imageRecipeArn: ImageRecipeArn
        var infrastructureConfigurationArn: InfrastructureConfigurationArn
        var distributionConfigurationArn: DistributionConfigurationArn?
            get() = definedExternally
            set(value) = definedExternally
        var imageTestsConfiguration: ImageTestsConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var schedule: Schedule?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "DISABLED" | "ENABLED" | String */
        var clientToken: ClientToken
    }
    interface UpdateImagePipelineResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var imagePipelineArn: ImagePipelineArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateInfrastructureConfigurationRequest {
        var infrastructureConfigurationArn: InfrastructureConfigurationArn
        var description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var instanceTypes: InstanceTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var instanceProfileName: NonEmptyString
        var securityGroupIds: SecurityGroupIds?
            get() = definedExternally
            set(value) = definedExternally
        var subnetId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var logging: Logging?
            get() = definedExternally
            set(value) = definedExternally
        var keyPair: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var terminateInstanceOnFailure: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var snsTopicArn: SnsTopicArn?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken
    }
    interface UpdateInfrastructureConfigurationResponse {
        var requestId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var infrastructureConfigurationArn: InfrastructureConfigurationArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-12-02" | "latest" | String */
    }
}