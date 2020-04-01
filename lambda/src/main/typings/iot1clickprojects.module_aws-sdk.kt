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
import IoT1ClickProjects.PlacementSummary
import IoT1ClickProjects.ProjectSummary
import IoT1ClickProjects.AssociateDeviceWithPlacementRequest
import IoT1ClickProjects.AssociateDeviceWithPlacementResponse
import IoT1ClickProjects.CreatePlacementRequest
import IoT1ClickProjects.CreatePlacementResponse
import IoT1ClickProjects.CreateProjectRequest
import IoT1ClickProjects.CreateProjectResponse
import IoT1ClickProjects.DeletePlacementRequest
import IoT1ClickProjects.DeletePlacementResponse
import IoT1ClickProjects.DeleteProjectRequest
import IoT1ClickProjects.DeleteProjectResponse
import IoT1ClickProjects.DescribePlacementRequest
import IoT1ClickProjects.DescribePlacementResponse
import IoT1ClickProjects.DescribeProjectRequest
import IoT1ClickProjects.DescribeProjectResponse
import IoT1ClickProjects.DisassociateDeviceFromPlacementRequest
import IoT1ClickProjects.DisassociateDeviceFromPlacementResponse
import IoT1ClickProjects.GetDevicesInPlacementRequest
import IoT1ClickProjects.GetDevicesInPlacementResponse
import IoT1ClickProjects.ListPlacementsRequest
import IoT1ClickProjects.ListPlacementsResponse
import IoT1ClickProjects.ListProjectsRequest
import IoT1ClickProjects.ListProjectsResponse
import IoT1ClickProjects.ListTagsForResourceRequest
import IoT1ClickProjects.ListTagsForResourceResponse
import IoT1ClickProjects.TagResourceRequest
import IoT1ClickProjects.TagResourceResponse
import IoT1ClickProjects.UntagResourceRequest
import IoT1ClickProjects.UntagResourceResponse
import IoT1ClickProjects.UpdatePlacementRequest
import IoT1ClickProjects.UpdatePlacementResponse
import IoT1ClickProjects.UpdateProjectRequest
import IoT1ClickProjects.UpdateProjectResponse
import IoT1ClickProjects.PlacementAttributeMap
import IoT1ClickProjects.PlacementTemplate
import IoT1ClickProjects.TagMap
import IoT1ClickProjects.PlacementDescription
import IoT1ClickProjects.ProjectDescription
import IoT1ClickProjects.DeviceCallbackOverrideMap
import IoT1ClickProjects.DeviceTemplate
import IoT1ClickProjects.DeviceMap
import IoT1ClickProjects.DefaultPlacementAttributeMap
import IoT1ClickProjects.DeviceTemplateMap

typealias AttributeDefaultValue = String

typealias AttributeName = String

typealias AttributeValue = String

typealias Description = String

typealias DeviceCallbackKey = String

typealias DeviceCallbackValue = String

typealias DeviceId = String

typealias DeviceTemplateName = String

typealias DeviceType = String

typealias MaxResults = Number

typealias NextToken = String

typealias PlacementName = String

typealias PlacementSummaryList = Array<PlacementSummary>

typealias ProjectArn = String

typealias ProjectName = String

typealias ProjectSummaryList = Array<ProjectSummary>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagValue = String

typealias Time = Date

@JsModule("aws-sdk")
external open class IoT1ClickProjects(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & IoT1ClickProjects.Types.ClientConfiguration */
    open fun associateDeviceWithPlacement(params: AssociateDeviceWithPlacementRequest, callback: (err: AWSError, data: AssociateDeviceWithPlacementResponse) -> Unit = definedExternally): Request<AssociateDeviceWithPlacementResponse, AWSError>
    open fun associateDeviceWithPlacement(callback: (err: AWSError, data: AssociateDeviceWithPlacementResponse) -> Unit = definedExternally): Request<AssociateDeviceWithPlacementResponse, AWSError>
    open fun createPlacement(params: CreatePlacementRequest, callback: (err: AWSError, data: CreatePlacementResponse) -> Unit = definedExternally): Request<CreatePlacementResponse, AWSError>
    open fun createPlacement(callback: (err: AWSError, data: CreatePlacementResponse) -> Unit = definedExternally): Request<CreatePlacementResponse, AWSError>
    open fun createProject(params: CreateProjectRequest, callback: (err: AWSError, data: CreateProjectResponse) -> Unit = definedExternally): Request<CreateProjectResponse, AWSError>
    open fun createProject(callback: (err: AWSError, data: CreateProjectResponse) -> Unit = definedExternally): Request<CreateProjectResponse, AWSError>
    open fun deletePlacement(params: DeletePlacementRequest, callback: (err: AWSError, data: DeletePlacementResponse) -> Unit = definedExternally): Request<DeletePlacementResponse, AWSError>
    open fun deletePlacement(callback: (err: AWSError, data: DeletePlacementResponse) -> Unit = definedExternally): Request<DeletePlacementResponse, AWSError>
    open fun deleteProject(params: DeleteProjectRequest, callback: (err: AWSError, data: DeleteProjectResponse) -> Unit = definedExternally): Request<DeleteProjectResponse, AWSError>
    open fun deleteProject(callback: (err: AWSError, data: DeleteProjectResponse) -> Unit = definedExternally): Request<DeleteProjectResponse, AWSError>
    open fun describePlacement(params: DescribePlacementRequest, callback: (err: AWSError, data: DescribePlacementResponse) -> Unit = definedExternally): Request<DescribePlacementResponse, AWSError>
    open fun describePlacement(callback: (err: AWSError, data: DescribePlacementResponse) -> Unit = definedExternally): Request<DescribePlacementResponse, AWSError>
    open fun describeProject(params: DescribeProjectRequest, callback: (err: AWSError, data: DescribeProjectResponse) -> Unit = definedExternally): Request<DescribeProjectResponse, AWSError>
    open fun describeProject(callback: (err: AWSError, data: DescribeProjectResponse) -> Unit = definedExternally): Request<DescribeProjectResponse, AWSError>
    open fun disassociateDeviceFromPlacement(params: DisassociateDeviceFromPlacementRequest, callback: (err: AWSError, data: DisassociateDeviceFromPlacementResponse) -> Unit = definedExternally): Request<DisassociateDeviceFromPlacementResponse, AWSError>
    open fun disassociateDeviceFromPlacement(callback: (err: AWSError, data: DisassociateDeviceFromPlacementResponse) -> Unit = definedExternally): Request<DisassociateDeviceFromPlacementResponse, AWSError>
    open fun getDevicesInPlacement(params: GetDevicesInPlacementRequest, callback: (err: AWSError, data: GetDevicesInPlacementResponse) -> Unit = definedExternally): Request<GetDevicesInPlacementResponse, AWSError>
    open fun getDevicesInPlacement(callback: (err: AWSError, data: GetDevicesInPlacementResponse) -> Unit = definedExternally): Request<GetDevicesInPlacementResponse, AWSError>
    open fun listPlacements(params: ListPlacementsRequest, callback: (err: AWSError, data: ListPlacementsResponse) -> Unit = definedExternally): Request<ListPlacementsResponse, AWSError>
    open fun listPlacements(callback: (err: AWSError, data: ListPlacementsResponse) -> Unit = definedExternally): Request<ListPlacementsResponse, AWSError>
    open fun listProjects(params: ListProjectsRequest, callback: (err: AWSError, data: ListProjectsResponse) -> Unit = definedExternally): Request<ListProjectsResponse, AWSError>
    open fun listProjects(callback: (err: AWSError, data: ListProjectsResponse) -> Unit = definedExternally): Request<ListProjectsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updatePlacement(params: UpdatePlacementRequest, callback: (err: AWSError, data: UpdatePlacementResponse) -> Unit = definedExternally): Request<UpdatePlacementResponse, AWSError>
    open fun updatePlacement(callback: (err: AWSError, data: UpdatePlacementResponse) -> Unit = definedExternally): Request<UpdatePlacementResponse, AWSError>
    open fun updateProject(params: UpdateProjectRequest, callback: (err: AWSError, data: UpdateProjectResponse) -> Unit = definedExternally): Request<UpdateProjectResponse, AWSError>
    open fun updateProject(callback: (err: AWSError, data: UpdateProjectResponse) -> Unit = definedExternally): Request<UpdateProjectResponse, AWSError>
    interface AssociateDeviceWithPlacementRequest {
        var projectName: ProjectName
        var placementName: PlacementName
        var deviceId: DeviceId
        var deviceTemplateName: DeviceTemplateName
    }
    interface AssociateDeviceWithPlacementResponse
    interface CreatePlacementRequest {
        var placementName: PlacementName
        var projectName: ProjectName
        var attributes: PlacementAttributeMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePlacementResponse
    interface CreateProjectRequest {
        var projectName: ProjectName
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var placementTemplate: PlacementTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProjectResponse
    interface DefaultPlacementAttributeMap {
        @nativeGetter
        operator fun get(key: String): AttributeDefaultValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeDefaultValue)
    }
    interface DeletePlacementRequest {
        var placementName: PlacementName
        var projectName: ProjectName
    }
    interface DeletePlacementResponse
    interface DeleteProjectRequest {
        var projectName: ProjectName
    }
    interface DeleteProjectResponse
    interface DescribePlacementRequest {
        var placementName: PlacementName
        var projectName: ProjectName
    }
    interface DescribePlacementResponse {
        var placement: PlacementDescription
    }
    interface DescribeProjectRequest {
        var projectName: ProjectName
    }
    interface DescribeProjectResponse {
        var project: ProjectDescription
    }
    interface DeviceCallbackOverrideMap {
        @nativeGetter
        operator fun get(key: String): DeviceCallbackValue?
        @nativeSetter
        operator fun set(key: String, value: DeviceCallbackValue)
    }
    interface DeviceMap {
        @nativeGetter
        operator fun get(key: String): DeviceId?
        @nativeSetter
        operator fun set(key: String, value: DeviceId)
    }
    interface DeviceTemplate {
        var deviceType: DeviceType?
            get() = definedExternally
            set(value) = definedExternally
        var callbackOverrides: DeviceCallbackOverrideMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeviceTemplateMap {
        @nativeGetter
        operator fun get(key: String): DeviceTemplate?
        @nativeSetter
        operator fun set(key: String, value: DeviceTemplate)
    }
    interface DisassociateDeviceFromPlacementRequest {
        var projectName: ProjectName
        var placementName: PlacementName
        var deviceTemplateName: DeviceTemplateName
    }
    interface DisassociateDeviceFromPlacementResponse
    interface GetDevicesInPlacementRequest {
        var projectName: ProjectName
        var placementName: PlacementName
    }
    interface GetDevicesInPlacementResponse {
        var devices: DeviceMap
    }
    interface ListPlacementsRequest {
        var projectName: ProjectName
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPlacementsResponse {
        var placements: PlacementSummaryList
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProjectsRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProjectsResponse {
        var projects: ProjectSummaryList
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var resourceArn: ProjectArn
    }
    interface ListTagsForResourceResponse {
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PlacementAttributeMap {
        @nativeGetter
        operator fun get(key: String): AttributeValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeValue)
    }
    interface PlacementDescription {
        var projectName: ProjectName
        var placementName: PlacementName
        var attributes: PlacementAttributeMap
        var createdDate: Time
        var updatedDate: Time
    }
    interface PlacementSummary {
        var projectName: ProjectName
        var placementName: PlacementName
        var createdDate: Time
        var updatedDate: Time
    }
    interface PlacementTemplate {
        var defaultAttributes: DefaultPlacementAttributeMap?
            get() = definedExternally
            set(value) = definedExternally
        var deviceTemplates: DeviceTemplateMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProjectDescription {
        var arn: ProjectArn?
            get() = definedExternally
            set(value) = definedExternally
        var projectName: ProjectName
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Time
        var updatedDate: Time
        var placementTemplate: PlacementTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProjectSummary {
        var arn: ProjectArn?
            get() = definedExternally
            set(value) = definedExternally
        var projectName: ProjectName
        var createdDate: Time
        var updatedDate: Time
        var tags: TagMap?
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
        var resourceArn: ProjectArn
        var tags: TagMap
    }
    interface TagResourceResponse
    interface UntagResourceRequest {
        var resourceArn: ProjectArn
        var tagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdatePlacementRequest {
        var placementName: PlacementName
        var projectName: ProjectName
        var attributes: PlacementAttributeMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdatePlacementResponse
    interface UpdateProjectRequest {
        var projectName: ProjectName
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var placementTemplate: PlacementTemplate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateProjectResponse
    interface ClientApiVersions {
        var apiVersion: String /* "2018-05-14" | "latest" | String */
    }
}