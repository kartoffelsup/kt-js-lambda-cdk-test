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
import ResourceGroups.GroupFilter
import ResourceGroups.GroupIdentifier
import ResourceGroups.Group
import ResourceGroups.QueryError
import ResourceGroups.ResourceFilter
import ResourceGroups.ResourceIdentifier
import ResourceGroups.CreateGroupInput
import ResourceGroups.CreateGroupOutput
import ResourceGroups.DeleteGroupInput
import ResourceGroups.DeleteGroupOutput
import ResourceGroups.GetGroupInput
import ResourceGroups.GetGroupOutput
import ResourceGroups.GetGroupQueryInput
import ResourceGroups.GetGroupQueryOutput
import ResourceGroups.GetTagsInput
import ResourceGroups.GetTagsOutput
import ResourceGroups.ListGroupResourcesInput
import ResourceGroups.ListGroupResourcesOutput
import ResourceGroups.ListGroupsInput
import ResourceGroups.ListGroupsOutput
import ResourceGroups.SearchResourcesInput
import ResourceGroups.SearchResourcesOutput
import ResourceGroups.TagInput
import ResourceGroups.TagOutput
import ResourceGroups.UntagInput
import ResourceGroups.UntagOutput
import ResourceGroups.UpdateGroupInput
import ResourceGroups.UpdateGroupOutput
import ResourceGroups.UpdateGroupQueryInput
import ResourceGroups.UpdateGroupQueryOutput
import ResourceGroups.ResourceQuery
import ResourceGroups.Tags
import ResourceGroups.GroupQuery

typealias GroupArn = String

typealias GroupDescription = String

typealias GroupFilterList = Array<GroupFilter>

typealias GroupFilterValue = String

typealias GroupFilterValues = Array<GroupFilterValue>

typealias GroupIdentifierList = Array<GroupIdentifier>

typealias GroupList = Array<Group>

typealias GroupName = String

typealias MaxResults = Number

typealias NextToken = String

typealias Query = String

typealias QueryErrorList = Array<QueryError>

typealias QueryErrorMessage = String

typealias ResourceArn = String

typealias ResourceFilterList = Array<ResourceFilter>

typealias ResourceFilterValue = String

typealias ResourceFilterValues = Array<ResourceFilterValue>

typealias ResourceIdentifierList = Array<ResourceIdentifier>

typealias ResourceType = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagValue = String

@JsModule("aws-sdk")
external open class ResourceGroups(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ResourceGroups.Types.ClientConfiguration */
    open fun createGroup(params: CreateGroupInput, callback: (err: AWSError, data: CreateGroupOutput) -> Unit = definedExternally): Request<CreateGroupOutput, AWSError>
    open fun createGroup(callback: (err: AWSError, data: CreateGroupOutput) -> Unit = definedExternally): Request<CreateGroupOutput, AWSError>
    open fun deleteGroup(params: DeleteGroupInput, callback: (err: AWSError, data: DeleteGroupOutput) -> Unit = definedExternally): Request<DeleteGroupOutput, AWSError>
    open fun deleteGroup(callback: (err: AWSError, data: DeleteGroupOutput) -> Unit = definedExternally): Request<DeleteGroupOutput, AWSError>
    open fun getGroup(params: GetGroupInput, callback: (err: AWSError, data: GetGroupOutput) -> Unit = definedExternally): Request<GetGroupOutput, AWSError>
    open fun getGroup(callback: (err: AWSError, data: GetGroupOutput) -> Unit = definedExternally): Request<GetGroupOutput, AWSError>
    open fun getGroupQuery(params: GetGroupQueryInput, callback: (err: AWSError, data: GetGroupQueryOutput) -> Unit = definedExternally): Request<GetGroupQueryOutput, AWSError>
    open fun getGroupQuery(callback: (err: AWSError, data: GetGroupQueryOutput) -> Unit = definedExternally): Request<GetGroupQueryOutput, AWSError>
    open fun getTags(params: GetTagsInput, callback: (err: AWSError, data: GetTagsOutput) -> Unit = definedExternally): Request<GetTagsOutput, AWSError>
    open fun getTags(callback: (err: AWSError, data: GetTagsOutput) -> Unit = definedExternally): Request<GetTagsOutput, AWSError>
    open fun listGroupResources(params: ListGroupResourcesInput, callback: (err: AWSError, data: ListGroupResourcesOutput) -> Unit = definedExternally): Request<ListGroupResourcesOutput, AWSError>
    open fun listGroupResources(callback: (err: AWSError, data: ListGroupResourcesOutput) -> Unit = definedExternally): Request<ListGroupResourcesOutput, AWSError>
    open fun listGroups(params: ListGroupsInput, callback: (err: AWSError, data: ListGroupsOutput) -> Unit = definedExternally): Request<ListGroupsOutput, AWSError>
    open fun listGroups(callback: (err: AWSError, data: ListGroupsOutput) -> Unit = definedExternally): Request<ListGroupsOutput, AWSError>
    open fun searchResources(params: SearchResourcesInput, callback: (err: AWSError, data: SearchResourcesOutput) -> Unit = definedExternally): Request<SearchResourcesOutput, AWSError>
    open fun searchResources(callback: (err: AWSError, data: SearchResourcesOutput) -> Unit = definedExternally): Request<SearchResourcesOutput, AWSError>
    open fun tag(params: TagInput, callback: (err: AWSError, data: TagOutput) -> Unit = definedExternally): Request<TagOutput, AWSError>
    open fun tag(callback: (err: AWSError, data: TagOutput) -> Unit = definedExternally): Request<TagOutput, AWSError>
    open fun untag(params: UntagInput, callback: (err: AWSError, data: UntagOutput) -> Unit = definedExternally): Request<UntagOutput, AWSError>
    open fun untag(callback: (err: AWSError, data: UntagOutput) -> Unit = definedExternally): Request<UntagOutput, AWSError>
    open fun updateGroup(params: UpdateGroupInput, callback: (err: AWSError, data: UpdateGroupOutput) -> Unit = definedExternally): Request<UpdateGroupOutput, AWSError>
    open fun updateGroup(callback: (err: AWSError, data: UpdateGroupOutput) -> Unit = definedExternally): Request<UpdateGroupOutput, AWSError>
    open fun updateGroupQuery(params: UpdateGroupQueryInput, callback: (err: AWSError, data: UpdateGroupQueryOutput) -> Unit = definedExternally): Request<UpdateGroupQueryOutput, AWSError>
    open fun updateGroupQuery(callback: (err: AWSError, data: UpdateGroupQueryOutput) -> Unit = definedExternally): Request<UpdateGroupQueryOutput, AWSError>
    interface CreateGroupInput {
        var Name: GroupName
        var Description: GroupDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceQuery: ResourceQuery
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGroupOutput {
        var Group: Group?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceQuery: ResourceQuery?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteGroupInput {
        var GroupName: GroupName
    }
    interface DeleteGroupOutput {
        var Group: Group?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetGroupInput {
        var GroupName: GroupName
    }
    interface GetGroupOutput {
        var Group: Group?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetGroupQueryInput {
        var GroupName: GroupName
    }
    interface GetGroupQueryOutput {
        var GroupQuery: GroupQuery?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTagsInput {
        var Arn: GroupArn
    }
    interface GetTagsOutput {
        var Arn: GroupArn?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Group {
        var GroupArn: GroupArn
        var Name: GroupName
        var Description: GroupDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GroupFilter {
        var Name: String /* "resource-type" | String */
        var Values: GroupFilterValues
    }
    interface GroupIdentifier {
        var GroupName: GroupName?
            get() = definedExternally
            set(value) = definedExternally
        var GroupArn: GroupArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GroupQuery {
        var GroupName: GroupName
        var ResourceQuery: ResourceQuery
    }
    interface ListGroupResourcesInput {
        var GroupName: GroupName
        var Filters: ResourceFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroupResourcesOutput {
        var ResourceIdentifiers: ResourceIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var QueryErrors: QueryErrorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroupsInput {
        var Filters: GroupFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroupsOutput {
        var GroupIdentifiers: GroupIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var Groups: GroupList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface QueryError {
        var ErrorCode: String /* "CLOUDFORMATION_STACK_INACTIVE" | "CLOUDFORMATION_STACK_NOT_EXISTING" | String */
        var Message: QueryErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceFilter {
        var Name: String /* "resource-type" | String */
        var Values: ResourceFilterValues
    }
    interface ResourceIdentifier {
        var ResourceArn: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: ResourceType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceQuery {
        var Type: String /* "TAG_FILTERS_1_0" | "CLOUDFORMATION_STACK_1_0" | String */
        var Query: Query
    }
    interface SearchResourcesInput {
        var ResourceQuery: ResourceQuery
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchResourcesOutput {
        var ResourceIdentifiers: ResourceIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var QueryErrors: QueryErrorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagInput {
        var Arn: GroupArn
        var Tags: Tags
    }
    interface TagOutput {
        var Arn: GroupArn?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tags {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface UntagInput {
        var Arn: GroupArn
        var Keys: TagKeyList
    }
    interface UntagOutput {
        var Arn: GroupArn?
            get() = definedExternally
            set(value) = definedExternally
        var Keys: TagKeyList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGroupInput {
        var GroupName: GroupName
        var Description: GroupDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGroupOutput {
        var Group: Group?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGroupQueryInput {
        var GroupName: GroupName
        var ResourceQuery: ResourceQuery
    }
    interface UpdateGroupQueryOutput {
        var GroupQuery: GroupQuery?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-11-27" | "latest" | String */
    }
}