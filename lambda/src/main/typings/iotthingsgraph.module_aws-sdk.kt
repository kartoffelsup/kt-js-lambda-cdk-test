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
import IoTThingsGraph.DependencyRevision
import IoTThingsGraph.EntityDescription
import IoTThingsGraph.EntityFilter
import IoTThingsGraph.FlowExecutionMessage
import IoTThingsGraph.FlowExecutionSummary
import IoTThingsGraph.FlowTemplateFilter
import IoTThingsGraph.FlowTemplateSummary
import IoTThingsGraph.SystemInstanceFilter
import IoTThingsGraph.SystemInstanceSummary
import IoTThingsGraph.SystemTemplateFilter
import IoTThingsGraph.SystemTemplateSummary
import IoTThingsGraph.Tag
import IoTThingsGraph.Thing
import IoTThingsGraph.AssociateEntityToThingRequest
import IoTThingsGraph.AssociateEntityToThingResponse
import IoTThingsGraph.CreateFlowTemplateRequest
import IoTThingsGraph.CreateFlowTemplateResponse
import IoTThingsGraph.CreateSystemInstanceRequest
import IoTThingsGraph.CreateSystemInstanceResponse
import IoTThingsGraph.CreateSystemTemplateRequest
import IoTThingsGraph.CreateSystemTemplateResponse
import IoTThingsGraph.DeleteFlowTemplateRequest
import IoTThingsGraph.DeleteFlowTemplateResponse
import IoTThingsGraph.DeleteNamespaceRequest
import IoTThingsGraph.DeleteNamespaceResponse
import IoTThingsGraph.DeleteSystemInstanceRequest
import IoTThingsGraph.DeleteSystemInstanceResponse
import IoTThingsGraph.DeleteSystemTemplateRequest
import IoTThingsGraph.DeleteSystemTemplateResponse
import IoTThingsGraph.DeploySystemInstanceRequest
import IoTThingsGraph.DeploySystemInstanceResponse
import IoTThingsGraph.DeprecateFlowTemplateRequest
import IoTThingsGraph.DeprecateFlowTemplateResponse
import IoTThingsGraph.DeprecateSystemTemplateRequest
import IoTThingsGraph.DeprecateSystemTemplateResponse
import IoTThingsGraph.DescribeNamespaceRequest
import IoTThingsGraph.DescribeNamespaceResponse
import IoTThingsGraph.DissociateEntityFromThingRequest
import IoTThingsGraph.DissociateEntityFromThingResponse
import IoTThingsGraph.GetEntitiesRequest
import IoTThingsGraph.GetEntitiesResponse
import IoTThingsGraph.GetFlowTemplateRequest
import IoTThingsGraph.GetFlowTemplateResponse
import IoTThingsGraph.GetFlowTemplateRevisionsRequest
import IoTThingsGraph.GetFlowTemplateRevisionsResponse
import IoTThingsGraph.GetNamespaceDeletionStatusRequest
import IoTThingsGraph.GetNamespaceDeletionStatusResponse
import IoTThingsGraph.GetSystemInstanceRequest
import IoTThingsGraph.GetSystemInstanceResponse
import IoTThingsGraph.GetSystemTemplateRequest
import IoTThingsGraph.GetSystemTemplateResponse
import IoTThingsGraph.GetSystemTemplateRevisionsRequest
import IoTThingsGraph.GetSystemTemplateRevisionsResponse
import IoTThingsGraph.GetUploadStatusRequest
import IoTThingsGraph.GetUploadStatusResponse
import IoTThingsGraph.ListFlowExecutionMessagesRequest
import IoTThingsGraph.ListFlowExecutionMessagesResponse
import IoTThingsGraph.ListTagsForResourceRequest
import IoTThingsGraph.ListTagsForResourceResponse
import IoTThingsGraph.SearchEntitiesRequest
import IoTThingsGraph.SearchEntitiesResponse
import IoTThingsGraph.SearchFlowExecutionsRequest
import IoTThingsGraph.SearchFlowExecutionsResponse
import IoTThingsGraph.SearchFlowTemplatesRequest
import IoTThingsGraph.SearchFlowTemplatesResponse
import IoTThingsGraph.SearchSystemInstancesRequest
import IoTThingsGraph.SearchSystemInstancesResponse
import IoTThingsGraph.SearchSystemTemplatesRequest
import IoTThingsGraph.SearchSystemTemplatesResponse
import IoTThingsGraph.SearchThingsRequest
import IoTThingsGraph.SearchThingsResponse
import IoTThingsGraph.TagResourceRequest
import IoTThingsGraph.TagResourceResponse
import IoTThingsGraph.UndeploySystemInstanceRequest
import IoTThingsGraph.UndeploySystemInstanceResponse
import IoTThingsGraph.UntagResourceRequest
import IoTThingsGraph.UntagResourceResponse
import IoTThingsGraph.UpdateFlowTemplateRequest
import IoTThingsGraph.UpdateFlowTemplateResponse
import IoTThingsGraph.UpdateSystemTemplateRequest
import IoTThingsGraph.UpdateSystemTemplateResponse
import IoTThingsGraph.UploadEntityDefinitionsRequest
import IoTThingsGraph.UploadEntityDefinitionsResponse
import IoTThingsGraph.DefinitionDocument
import IoTThingsGraph.MetricsConfiguration
import IoTThingsGraph.FlowTemplateDescription
import IoTThingsGraph.SystemInstanceDescription
import IoTThingsGraph.SystemTemplateDescription

typealias Arn = String

typealias DefinitionText = String

typealias DependencyRevisions = Array<DependencyRevision>

typealias DeprecateExistingEntities = Boolean

typealias Enabled = Boolean

typealias EntityDescriptions = Array<EntityDescription>

typealias EntityFilterValue = String

typealias EntityFilterValues = Array<EntityFilterValue>

typealias EntityFilters = Array<EntityFilter>

typealias EntityTypes = Array<String /* "DEVICE" | "SERVICE" | "DEVICE_MODEL" | "CAPABILITY" | "STATE" | "ACTION" | "EVENT" | "PROPERTY" | "MAPPING" | "ENUM" | String */>

typealias FlowExecutionId = String

typealias FlowExecutionMessageId = String

typealias FlowExecutionMessagePayload = String

typealias FlowExecutionMessages = Array<FlowExecutionMessage>

typealias FlowExecutionSummaries = Array<FlowExecutionSummary>

typealias FlowTemplateFilterValue = String

typealias FlowTemplateFilterValues = Array<FlowTemplateFilterValue>

typealias FlowTemplateFilters = Array<FlowTemplateFilter>

typealias FlowTemplateSummaries = Array<FlowTemplateSummary>

typealias GreengrassDeploymentId = String

typealias GreengrassGroupId = String

typealias GreengrassGroupVersionId = String

typealias GroupName = String

typealias MaxResults = Number

typealias NamespaceName = String

typealias NextToken = String

typealias ResourceArn = String

typealias RoleArn = String

typealias S3BucketName = String

typealias String = String

typealias StringList = Array<String>

typealias SyncWithPublicNamespace = Boolean

typealias SystemInstanceFilterValue = String

typealias SystemInstanceFilterValues = Array<SystemInstanceFilterValue>

typealias SystemInstanceFilters = Array<SystemInstanceFilter>

typealias SystemInstanceSummaries = Array<SystemInstanceSummary>

typealias SystemTemplateFilterValue = String

typealias SystemTemplateFilterValues = Array<SystemTemplateFilterValue>

typealias SystemTemplateFilters = Array<SystemTemplateFilter>

typealias SystemTemplateSummaries = Array<SystemTemplateSummary>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias ThingArn = String

typealias ThingName = String

typealias Things = Array<Thing>

typealias Timestamp = Date

typealias UploadId = String

typealias Urn = String

typealias Urns = Array<Urn>

typealias Version = Number

@JsModule("aws-sdk")
external open class IoTThingsGraph(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & IoTThingsGraph.Types.ClientConfiguration */
    open fun associateEntityToThing(params: AssociateEntityToThingRequest, callback: (err: AWSError, data: AssociateEntityToThingResponse) -> Unit = definedExternally): Request<AssociateEntityToThingResponse, AWSError>
    open fun associateEntityToThing(callback: (err: AWSError, data: AssociateEntityToThingResponse) -> Unit = definedExternally): Request<AssociateEntityToThingResponse, AWSError>
    open fun createFlowTemplate(params: CreateFlowTemplateRequest, callback: (err: AWSError, data: CreateFlowTemplateResponse) -> Unit = definedExternally): Request<CreateFlowTemplateResponse, AWSError>
    open fun createFlowTemplate(callback: (err: AWSError, data: CreateFlowTemplateResponse) -> Unit = definedExternally): Request<CreateFlowTemplateResponse, AWSError>
    open fun createSystemInstance(params: CreateSystemInstanceRequest, callback: (err: AWSError, data: CreateSystemInstanceResponse) -> Unit = definedExternally): Request<CreateSystemInstanceResponse, AWSError>
    open fun createSystemInstance(callback: (err: AWSError, data: CreateSystemInstanceResponse) -> Unit = definedExternally): Request<CreateSystemInstanceResponse, AWSError>
    open fun createSystemTemplate(params: CreateSystemTemplateRequest, callback: (err: AWSError, data: CreateSystemTemplateResponse) -> Unit = definedExternally): Request<CreateSystemTemplateResponse, AWSError>
    open fun createSystemTemplate(callback: (err: AWSError, data: CreateSystemTemplateResponse) -> Unit = definedExternally): Request<CreateSystemTemplateResponse, AWSError>
    open fun deleteFlowTemplate(params: DeleteFlowTemplateRequest, callback: (err: AWSError, data: DeleteFlowTemplateResponse) -> Unit = definedExternally): Request<DeleteFlowTemplateResponse, AWSError>
    open fun deleteFlowTemplate(callback: (err: AWSError, data: DeleteFlowTemplateResponse) -> Unit = definedExternally): Request<DeleteFlowTemplateResponse, AWSError>
    open fun deleteNamespace(params: DeleteNamespaceRequest, callback: (err: AWSError, data: DeleteNamespaceResponse) -> Unit = definedExternally): Request<DeleteNamespaceResponse, AWSError>
    open fun deleteNamespace(callback: (err: AWSError, data: DeleteNamespaceResponse) -> Unit = definedExternally): Request<DeleteNamespaceResponse, AWSError>
    open fun deleteSystemInstance(params: DeleteSystemInstanceRequest, callback: (err: AWSError, data: DeleteSystemInstanceResponse) -> Unit = definedExternally): Request<DeleteSystemInstanceResponse, AWSError>
    open fun deleteSystemInstance(callback: (err: AWSError, data: DeleteSystemInstanceResponse) -> Unit = definedExternally): Request<DeleteSystemInstanceResponse, AWSError>
    open fun deleteSystemTemplate(params: DeleteSystemTemplateRequest, callback: (err: AWSError, data: DeleteSystemTemplateResponse) -> Unit = definedExternally): Request<DeleteSystemTemplateResponse, AWSError>
    open fun deleteSystemTemplate(callback: (err: AWSError, data: DeleteSystemTemplateResponse) -> Unit = definedExternally): Request<DeleteSystemTemplateResponse, AWSError>
    open fun deploySystemInstance(params: DeploySystemInstanceRequest, callback: (err: AWSError, data: DeploySystemInstanceResponse) -> Unit = definedExternally): Request<DeploySystemInstanceResponse, AWSError>
    open fun deploySystemInstance(callback: (err: AWSError, data: DeploySystemInstanceResponse) -> Unit = definedExternally): Request<DeploySystemInstanceResponse, AWSError>
    open fun deprecateFlowTemplate(params: DeprecateFlowTemplateRequest, callback: (err: AWSError, data: DeprecateFlowTemplateResponse) -> Unit = definedExternally): Request<DeprecateFlowTemplateResponse, AWSError>
    open fun deprecateFlowTemplate(callback: (err: AWSError, data: DeprecateFlowTemplateResponse) -> Unit = definedExternally): Request<DeprecateFlowTemplateResponse, AWSError>
    open fun deprecateSystemTemplate(params: DeprecateSystemTemplateRequest, callback: (err: AWSError, data: DeprecateSystemTemplateResponse) -> Unit = definedExternally): Request<DeprecateSystemTemplateResponse, AWSError>
    open fun deprecateSystemTemplate(callback: (err: AWSError, data: DeprecateSystemTemplateResponse) -> Unit = definedExternally): Request<DeprecateSystemTemplateResponse, AWSError>
    open fun describeNamespace(params: DescribeNamespaceRequest, callback: (err: AWSError, data: DescribeNamespaceResponse) -> Unit = definedExternally): Request<DescribeNamespaceResponse, AWSError>
    open fun describeNamespace(callback: (err: AWSError, data: DescribeNamespaceResponse) -> Unit = definedExternally): Request<DescribeNamespaceResponse, AWSError>
    open fun dissociateEntityFromThing(params: DissociateEntityFromThingRequest, callback: (err: AWSError, data: DissociateEntityFromThingResponse) -> Unit = definedExternally): Request<DissociateEntityFromThingResponse, AWSError>
    open fun dissociateEntityFromThing(callback: (err: AWSError, data: DissociateEntityFromThingResponse) -> Unit = definedExternally): Request<DissociateEntityFromThingResponse, AWSError>
    open fun getEntities(params: GetEntitiesRequest, callback: (err: AWSError, data: GetEntitiesResponse) -> Unit = definedExternally): Request<GetEntitiesResponse, AWSError>
    open fun getEntities(callback: (err: AWSError, data: GetEntitiesResponse) -> Unit = definedExternally): Request<GetEntitiesResponse, AWSError>
    open fun getFlowTemplate(params: GetFlowTemplateRequest, callback: (err: AWSError, data: GetFlowTemplateResponse) -> Unit = definedExternally): Request<GetFlowTemplateResponse, AWSError>
    open fun getFlowTemplate(callback: (err: AWSError, data: GetFlowTemplateResponse) -> Unit = definedExternally): Request<GetFlowTemplateResponse, AWSError>
    open fun getFlowTemplateRevisions(params: GetFlowTemplateRevisionsRequest, callback: (err: AWSError, data: GetFlowTemplateRevisionsResponse) -> Unit = definedExternally): Request<GetFlowTemplateRevisionsResponse, AWSError>
    open fun getFlowTemplateRevisions(callback: (err: AWSError, data: GetFlowTemplateRevisionsResponse) -> Unit = definedExternally): Request<GetFlowTemplateRevisionsResponse, AWSError>
    open fun getNamespaceDeletionStatus(params: GetNamespaceDeletionStatusRequest, callback: (err: AWSError, data: GetNamespaceDeletionStatusResponse) -> Unit = definedExternally): Request<GetNamespaceDeletionStatusResponse, AWSError>
    open fun getNamespaceDeletionStatus(callback: (err: AWSError, data: GetNamespaceDeletionStatusResponse) -> Unit = definedExternally): Request<GetNamespaceDeletionStatusResponse, AWSError>
    open fun getSystemInstance(params: GetSystemInstanceRequest, callback: (err: AWSError, data: GetSystemInstanceResponse) -> Unit = definedExternally): Request<GetSystemInstanceResponse, AWSError>
    open fun getSystemInstance(callback: (err: AWSError, data: GetSystemInstanceResponse) -> Unit = definedExternally): Request<GetSystemInstanceResponse, AWSError>
    open fun getSystemTemplate(params: GetSystemTemplateRequest, callback: (err: AWSError, data: GetSystemTemplateResponse) -> Unit = definedExternally): Request<GetSystemTemplateResponse, AWSError>
    open fun getSystemTemplate(callback: (err: AWSError, data: GetSystemTemplateResponse) -> Unit = definedExternally): Request<GetSystemTemplateResponse, AWSError>
    open fun getSystemTemplateRevisions(params: GetSystemTemplateRevisionsRequest, callback: (err: AWSError, data: GetSystemTemplateRevisionsResponse) -> Unit = definedExternally): Request<GetSystemTemplateRevisionsResponse, AWSError>
    open fun getSystemTemplateRevisions(callback: (err: AWSError, data: GetSystemTemplateRevisionsResponse) -> Unit = definedExternally): Request<GetSystemTemplateRevisionsResponse, AWSError>
    open fun getUploadStatus(params: GetUploadStatusRequest, callback: (err: AWSError, data: GetUploadStatusResponse) -> Unit = definedExternally): Request<GetUploadStatusResponse, AWSError>
    open fun getUploadStatus(callback: (err: AWSError, data: GetUploadStatusResponse) -> Unit = definedExternally): Request<GetUploadStatusResponse, AWSError>
    open fun listFlowExecutionMessages(params: ListFlowExecutionMessagesRequest, callback: (err: AWSError, data: ListFlowExecutionMessagesResponse) -> Unit = definedExternally): Request<ListFlowExecutionMessagesResponse, AWSError>
    open fun listFlowExecutionMessages(callback: (err: AWSError, data: ListFlowExecutionMessagesResponse) -> Unit = definedExternally): Request<ListFlowExecutionMessagesResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun searchEntities(params: SearchEntitiesRequest, callback: (err: AWSError, data: SearchEntitiesResponse) -> Unit = definedExternally): Request<SearchEntitiesResponse, AWSError>
    open fun searchEntities(callback: (err: AWSError, data: SearchEntitiesResponse) -> Unit = definedExternally): Request<SearchEntitiesResponse, AWSError>
    open fun searchFlowExecutions(params: SearchFlowExecutionsRequest, callback: (err: AWSError, data: SearchFlowExecutionsResponse) -> Unit = definedExternally): Request<SearchFlowExecutionsResponse, AWSError>
    open fun searchFlowExecutions(callback: (err: AWSError, data: SearchFlowExecutionsResponse) -> Unit = definedExternally): Request<SearchFlowExecutionsResponse, AWSError>
    open fun searchFlowTemplates(params: SearchFlowTemplatesRequest, callback: (err: AWSError, data: SearchFlowTemplatesResponse) -> Unit = definedExternally): Request<SearchFlowTemplatesResponse, AWSError>
    open fun searchFlowTemplates(callback: (err: AWSError, data: SearchFlowTemplatesResponse) -> Unit = definedExternally): Request<SearchFlowTemplatesResponse, AWSError>
    open fun searchSystemInstances(params: SearchSystemInstancesRequest, callback: (err: AWSError, data: SearchSystemInstancesResponse) -> Unit = definedExternally): Request<SearchSystemInstancesResponse, AWSError>
    open fun searchSystemInstances(callback: (err: AWSError, data: SearchSystemInstancesResponse) -> Unit = definedExternally): Request<SearchSystemInstancesResponse, AWSError>
    open fun searchSystemTemplates(params: SearchSystemTemplatesRequest, callback: (err: AWSError, data: SearchSystemTemplatesResponse) -> Unit = definedExternally): Request<SearchSystemTemplatesResponse, AWSError>
    open fun searchSystemTemplates(callback: (err: AWSError, data: SearchSystemTemplatesResponse) -> Unit = definedExternally): Request<SearchSystemTemplatesResponse, AWSError>
    open fun searchThings(params: SearchThingsRequest, callback: (err: AWSError, data: SearchThingsResponse) -> Unit = definedExternally): Request<SearchThingsResponse, AWSError>
    open fun searchThings(callback: (err: AWSError, data: SearchThingsResponse) -> Unit = definedExternally): Request<SearchThingsResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun undeploySystemInstance(params: UndeploySystemInstanceRequest, callback: (err: AWSError, data: UndeploySystemInstanceResponse) -> Unit = definedExternally): Request<UndeploySystemInstanceResponse, AWSError>
    open fun undeploySystemInstance(callback: (err: AWSError, data: UndeploySystemInstanceResponse) -> Unit = definedExternally): Request<UndeploySystemInstanceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateFlowTemplate(params: UpdateFlowTemplateRequest, callback: (err: AWSError, data: UpdateFlowTemplateResponse) -> Unit = definedExternally): Request<UpdateFlowTemplateResponse, AWSError>
    open fun updateFlowTemplate(callback: (err: AWSError, data: UpdateFlowTemplateResponse) -> Unit = definedExternally): Request<UpdateFlowTemplateResponse, AWSError>
    open fun updateSystemTemplate(params: UpdateSystemTemplateRequest, callback: (err: AWSError, data: UpdateSystemTemplateResponse) -> Unit = definedExternally): Request<UpdateSystemTemplateResponse, AWSError>
    open fun updateSystemTemplate(callback: (err: AWSError, data: UpdateSystemTemplateResponse) -> Unit = definedExternally): Request<UpdateSystemTemplateResponse, AWSError>
    open fun uploadEntityDefinitions(params: UploadEntityDefinitionsRequest, callback: (err: AWSError, data: UploadEntityDefinitionsResponse) -> Unit = definedExternally): Request<UploadEntityDefinitionsResponse, AWSError>
    open fun uploadEntityDefinitions(callback: (err: AWSError, data: UploadEntityDefinitionsResponse) -> Unit = definedExternally): Request<UploadEntityDefinitionsResponse, AWSError>
    interface AssociateEntityToThingRequest {
        var thingName: ThingName
        var entityId: Urn
        var namespaceVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateEntityToThingResponse
    interface CreateFlowTemplateRequest {
        var definition: DefinitionDocument
        var compatibleNamespaceVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFlowTemplateResponse {
        var summary: FlowTemplateSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSystemInstanceRequest {
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var definition: DefinitionDocument
        var target: String /* "GREENGRASS" | "CLOUD" | String */
        var greengrassGroupName: GroupName?
            get() = definedExternally
            set(value) = definedExternally
        var s3BucketName: S3BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var metricsConfiguration: MetricsConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var flowActionsRoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSystemInstanceResponse {
        var summary: SystemInstanceSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSystemTemplateRequest {
        var definition: DefinitionDocument
        var compatibleNamespaceVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSystemTemplateResponse {
        var summary: SystemTemplateSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DefinitionDocument {
        var language: String /* "GRAPHQL" | String */
        var text: DefinitionText
    }
    interface DeleteFlowTemplateRequest {
        var id: Urn
    }
    interface DeleteFlowTemplateResponse
    interface DeleteNamespaceRequest
    interface DeleteNamespaceResponse {
        var namespaceArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var namespaceName: NamespaceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteSystemInstanceRequest {
        var id: Urn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteSystemInstanceResponse
    interface DeleteSystemTemplateRequest {
        var id: Urn
    }
    interface DeleteSystemTemplateResponse
    interface DependencyRevision {
        var id: Urn?
            get() = definedExternally
            set(value) = definedExternally
        var revisionNumber: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeploySystemInstanceRequest {
        var id: Urn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeploySystemInstanceResponse {
        var summary: SystemInstanceSummary
        var greengrassDeploymentId: GreengrassDeploymentId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeprecateFlowTemplateRequest {
        var id: Urn
    }
    interface DeprecateFlowTemplateResponse
    interface DeprecateSystemTemplateRequest {
        var id: Urn
    }
    interface DeprecateSystemTemplateResponse
    interface DescribeNamespaceRequest {
        var namespaceName: NamespaceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeNamespaceResponse {
        var namespaceArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var namespaceName: NamespaceName?
            get() = definedExternally
            set(value) = definedExternally
        var trackingNamespaceName: NamespaceName?
            get() = definedExternally
            set(value) = definedExternally
        var trackingNamespaceVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
        var namespaceVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DissociateEntityFromThingRequest {
        var thingName: ThingName
        var entityType: String /* "DEVICE" | "SERVICE" | "DEVICE_MODEL" | "CAPABILITY" | "STATE" | "ACTION" | "EVENT" | "PROPERTY" | "MAPPING" | "ENUM" | String */
    }
    interface DissociateEntityFromThingResponse
    interface EntityDescription {
        var id: Urn?
            get() = definedExternally
            set(value) = definedExternally
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "DEVICE" | "SERVICE" | "DEVICE_MODEL" | "CAPABILITY" | "STATE" | "ACTION" | "EVENT" | "PROPERTY" | "MAPPING" | "ENUM" | String */
        var createdAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var definition: DefinitionDocument?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EntityFilter {
        var name: String /* "NAME" | "NAMESPACE" | "SEMANTIC_TYPE_PATH" | "REFERENCED_ENTITY_ID" | String */
        var value: EntityFilterValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FlowExecutionMessage {
        var messageId: FlowExecutionMessageId?
            get() = definedExternally
            set(value) = definedExternally
        var eventType: String /* "EXECUTION_STARTED" | "EXECUTION_FAILED" | "EXECUTION_ABORTED" | "EXECUTION_SUCCEEDED" | "STEP_STARTED" | "STEP_FAILED" | "STEP_SUCCEEDED" | "ACTIVITY_SCHEDULED" | "ACTIVITY_STARTED" | "ACTIVITY_FAILED" | "ACTIVITY_SUCCEEDED" | "START_FLOW_EXECUTION_TASK" | "SCHEDULE_NEXT_READY_STEPS_TASK" | "THING_ACTION_TASK" | "THING_ACTION_TASK_FAILED" | "THING_ACTION_TASK_SUCCEEDED" | "ACKNOWLEDGE_TASK_MESSAGE" | String */
        var timestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var payload: FlowExecutionMessagePayload?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FlowExecutionSummary {
        var flowExecutionId: FlowExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "RUNNING" | "ABORTED" | "SUCCEEDED" | "FAILED" | String */
        var systemInstanceId: Urn?
            get() = definedExternally
            set(value) = definedExternally
        var flowTemplateId: Urn?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var updatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FlowTemplateDescription {
        var summary: FlowTemplateSummary?
            get() = definedExternally
            set(value) = definedExternally
        var definition: DefinitionDocument?
            get() = definedExternally
            set(value) = definedExternally
        var validatedNamespaceVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FlowTemplateFilter {
        var name: String /* "DEVICE_MODEL_ID" | String */
        var value: FlowTemplateFilterValues
    }
    interface FlowTemplateSummary {
        var id: Urn?
            get() = definedExternally
            set(value) = definedExternally
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var revisionNumber: Version?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetEntitiesRequest {
        var ids: Urns
        var namespaceVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetEntitiesResponse {
        var descriptions: EntityDescriptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFlowTemplateRequest {
        var id: Urn
        var revisionNumber: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFlowTemplateResponse {
        var description: FlowTemplateDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFlowTemplateRevisionsRequest {
        var id: Urn
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFlowTemplateRevisionsResponse {
        var summaries: FlowTemplateSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetNamespaceDeletionStatusRequest
    interface GetNamespaceDeletionStatusResponse {
        var namespaceArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var namespaceName: NamespaceName?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | String */
        var errorCode: String /* "VALIDATION_FAILED" | String */
        var errorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSystemInstanceRequest {
        var id: Urn
    }
    interface GetSystemInstanceResponse {
        var description: SystemInstanceDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSystemTemplateRequest {
        var id: Urn
        var revisionNumber: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSystemTemplateResponse {
        var description: SystemTemplateDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSystemTemplateRevisionsRequest {
        var id: Urn
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSystemTemplateRevisionsResponse {
        var summaries: SystemTemplateSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetUploadStatusRequest {
        var uploadId: UploadId
    }
    interface GetUploadStatusResponse {
        var uploadId: UploadId
        var uploadStatus: String /* "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | String */
        var namespaceArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var namespaceName: NamespaceName?
            get() = definedExternally
            set(value) = definedExternally
        var namespaceVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
        var failureReason: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp
    }
    interface ListFlowExecutionMessagesRequest {
        var flowExecutionId: FlowExecutionId
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFlowExecutionMessagesResponse {
        var messages: FlowExecutionMessages?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var resourceArn: ResourceArn
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceResponse {
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MetricsConfiguration {
        var cloudMetricEnabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
        var metricRuleRoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchEntitiesRequest {
        var entityTypes: EntityTypes
        var filters: EntityFilters?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var namespaceVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchEntitiesResponse {
        var descriptions: EntityDescriptions?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchFlowExecutionsRequest {
        var systemInstanceId: Urn
        var flowExecutionId: FlowExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var startTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var endTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchFlowExecutionsResponse {
        var summaries: FlowExecutionSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchFlowTemplatesRequest {
        var filters: FlowTemplateFilters?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchFlowTemplatesResponse {
        var summaries: FlowTemplateSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchSystemInstancesRequest {
        var filters: SystemInstanceFilters?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchSystemInstancesResponse {
        var summaries: SystemInstanceSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchSystemTemplatesRequest {
        var filters: SystemTemplateFilters?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchSystemTemplatesResponse {
        var summaries: SystemTemplateSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchThingsRequest {
        var entityId: Urn
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var namespaceVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchThingsResponse {
        var things: Things?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SystemInstanceDescription {
        var summary: SystemInstanceSummary?
            get() = definedExternally
            set(value) = definedExternally
        var definition: DefinitionDocument?
            get() = definedExternally
            set(value) = definedExternally
        var s3BucketName: S3BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var metricsConfiguration: MetricsConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var validatedNamespaceVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
        var validatedDependencyRevisions: DependencyRevisions?
            get() = definedExternally
            set(value) = definedExternally
        var flowActionsRoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SystemInstanceFilter {
        var name: String /* "SYSTEM_TEMPLATE_ID" | "STATUS" | "GREENGRASS_GROUP_NAME" | String */
        var value: SystemInstanceFilterValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SystemInstanceSummary {
        var id: Urn?
            get() = definedExternally
            set(value) = definedExternally
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "NOT_DEPLOYED" | "BOOTSTRAP" | "DEPLOY_IN_PROGRESS" | "DEPLOYED_IN_TARGET" | "UNDEPLOY_IN_PROGRESS" | "FAILED" | "PENDING_DELETE" | "DELETED_IN_TARGET" | String */
        var target: String /* "GREENGRASS" | "CLOUD" | String */
        var greengrassGroupName: GroupName?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var updatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var greengrassGroupId: GreengrassGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var greengrassGroupVersionId: GreengrassGroupVersionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SystemTemplateDescription {
        var summary: SystemTemplateSummary?
            get() = definedExternally
            set(value) = definedExternally
        var definition: DefinitionDocument?
            get() = definedExternally
            set(value) = definedExternally
        var validatedNamespaceVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SystemTemplateFilter {
        var name: String /* "FLOW_TEMPLATE_ID" | String */
        var value: SystemTemplateFilterValues
    }
    interface SystemTemplateSummary {
        var id: Urn?
            get() = definedExternally
            set(value) = definedExternally
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var revisionNumber: Version?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var key: TagKey
        var value: TagValue
    }
    interface TagResourceRequest {
        var resourceArn: ResourceArn
        var tags: TagList
    }
    interface TagResourceResponse
    interface Thing {
        var thingArn: ThingArn?
            get() = definedExternally
            set(value) = definedExternally
        var thingName: ThingName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UndeploySystemInstanceRequest {
        var id: Urn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UndeploySystemInstanceResponse {
        var summary: SystemInstanceSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceRequest {
        var resourceArn: ResourceArn
        var tagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateFlowTemplateRequest {
        var id: Urn
        var definition: DefinitionDocument
        var compatibleNamespaceVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFlowTemplateResponse {
        var summary: FlowTemplateSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSystemTemplateRequest {
        var id: Urn
        var definition: DefinitionDocument
        var compatibleNamespaceVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSystemTemplateResponse {
        var summary: SystemTemplateSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UploadEntityDefinitionsRequest {
        var document: DefinitionDocument?
            get() = definedExternally
            set(value) = definedExternally
        var syncWithPublicNamespace: SyncWithPublicNamespace?
            get() = definedExternally
            set(value) = definedExternally
        var deprecateExistingEntities: DeprecateExistingEntities?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UploadEntityDefinitionsResponse {
        var uploadId: UploadId
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-09-06" | "latest" | String */
    }
}