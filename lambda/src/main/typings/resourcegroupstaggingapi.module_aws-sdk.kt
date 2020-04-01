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
import ResourceGroupsTaggingAPI.ResourceTagMapping
import ResourceGroupsTaggingAPI.Summary
import ResourceGroupsTaggingAPI.TagFilter
import ResourceGroupsTaggingAPI.Tag
import ResourceGroupsTaggingAPI.DescribeReportCreationInput
import ResourceGroupsTaggingAPI.DescribeReportCreationOutput
import ResourceGroupsTaggingAPI.GetComplianceSummaryInput
import ResourceGroupsTaggingAPI.GetComplianceSummaryOutput
import ResourceGroupsTaggingAPI.GetResourcesInput
import ResourceGroupsTaggingAPI.GetResourcesOutput
import ResourceGroupsTaggingAPI.GetTagKeysInput
import ResourceGroupsTaggingAPI.GetTagKeysOutput
import ResourceGroupsTaggingAPI.GetTagValuesInput
import ResourceGroupsTaggingAPI.GetTagValuesOutput
import ResourceGroupsTaggingAPI.StartReportCreationInput
import ResourceGroupsTaggingAPI.StartReportCreationOutput
import ResourceGroupsTaggingAPI.TagResourcesInput
import ResourceGroupsTaggingAPI.TagResourcesOutput
import ResourceGroupsTaggingAPI.UntagResourcesInput
import ResourceGroupsTaggingAPI.UntagResourcesOutput
import ResourceGroupsTaggingAPI.FailureInfo
import ResourceGroupsTaggingAPI.ComplianceDetails
import ResourceGroupsTaggingAPI.TagMap
import ResourceGroupsTaggingAPI.FailedResourcesMap

typealias AmazonResourceType = String

typealias ComplianceStatus = Boolean

typealias ErrorMessage = String

typealias ExcludeCompliantResources = Boolean

typealias GroupBy = Array<String /* "TARGET_ID" | "REGION" | "RESOURCE_TYPE" | String */>

typealias IncludeComplianceDetails = Boolean

typealias LastUpdated = String

typealias MaxResultsGetComplianceSummary = Number

typealias NonCompliantResources = Number

typealias PaginationToken = String

typealias Region = String

typealias RegionFilterList = Array<Region>

typealias ResourceARN = String

typealias ResourceARNList = Array<ResourceARN>

typealias ResourceTagMappingList = Array<ResourceTagMapping>

typealias ResourceTypeFilterList = Array<AmazonResourceType>

typealias ResourcesPerPage = Number

typealias S3Bucket = String

typealias S3Location = String

typealias Status = String

typealias StatusCode = Number

typealias SummaryList = Array<Summary>

typealias TagFilterList = Array<TagFilter>

typealias TagKey = String

typealias TagKeyFilterList = Array<TagKey>

typealias TagKeyList = Array<TagKey>

typealias TagKeyListForUntag = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TagValueList = Array<TagValue>

typealias TagValuesOutputList = Array<TagValue>

typealias TagsPerPage = Number

typealias TargetId = String

typealias TargetIdFilterList = Array<TargetId>

@JsModule("aws-sdk")
external open class ResourceGroupsTaggingAPI(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ResourceGroupsTaggingAPI.Types.ClientConfiguration */
    open fun describeReportCreation(params: DescribeReportCreationInput, callback: (err: AWSError, data: DescribeReportCreationOutput) -> Unit = definedExternally): Request<DescribeReportCreationOutput, AWSError>
    open fun describeReportCreation(callback: (err: AWSError, data: DescribeReportCreationOutput) -> Unit = definedExternally): Request<DescribeReportCreationOutput, AWSError>
    open fun getComplianceSummary(params: GetComplianceSummaryInput, callback: (err: AWSError, data: GetComplianceSummaryOutput) -> Unit = definedExternally): Request<GetComplianceSummaryOutput, AWSError>
    open fun getComplianceSummary(callback: (err: AWSError, data: GetComplianceSummaryOutput) -> Unit = definedExternally): Request<GetComplianceSummaryOutput, AWSError>
    open fun getResources(params: GetResourcesInput, callback: (err: AWSError, data: GetResourcesOutput) -> Unit = definedExternally): Request<GetResourcesOutput, AWSError>
    open fun getResources(callback: (err: AWSError, data: GetResourcesOutput) -> Unit = definedExternally): Request<GetResourcesOutput, AWSError>
    open fun getTagKeys(params: GetTagKeysInput, callback: (err: AWSError, data: GetTagKeysOutput) -> Unit = definedExternally): Request<GetTagKeysOutput, AWSError>
    open fun getTagKeys(callback: (err: AWSError, data: GetTagKeysOutput) -> Unit = definedExternally): Request<GetTagKeysOutput, AWSError>
    open fun getTagValues(params: GetTagValuesInput, callback: (err: AWSError, data: GetTagValuesOutput) -> Unit = definedExternally): Request<GetTagValuesOutput, AWSError>
    open fun getTagValues(callback: (err: AWSError, data: GetTagValuesOutput) -> Unit = definedExternally): Request<GetTagValuesOutput, AWSError>
    open fun startReportCreation(params: StartReportCreationInput, callback: (err: AWSError, data: StartReportCreationOutput) -> Unit = definedExternally): Request<StartReportCreationOutput, AWSError>
    open fun startReportCreation(callback: (err: AWSError, data: StartReportCreationOutput) -> Unit = definedExternally): Request<StartReportCreationOutput, AWSError>
    open fun tagResources(params: TagResourcesInput, callback: (err: AWSError, data: TagResourcesOutput) -> Unit = definedExternally): Request<TagResourcesOutput, AWSError>
    open fun tagResources(callback: (err: AWSError, data: TagResourcesOutput) -> Unit = definedExternally): Request<TagResourcesOutput, AWSError>
    open fun untagResources(params: UntagResourcesInput, callback: (err: AWSError, data: UntagResourcesOutput) -> Unit = definedExternally): Request<UntagResourcesOutput, AWSError>
    open fun untagResources(callback: (err: AWSError, data: UntagResourcesOutput) -> Unit = definedExternally): Request<UntagResourcesOutput, AWSError>
    interface ComplianceDetails {
        var NoncompliantKeys: TagKeyList?
            get() = definedExternally
            set(value) = definedExternally
        var KeysWithNoncompliantValues: TagKeyList?
            get() = definedExternally
            set(value) = definedExternally
        var ComplianceStatus: ComplianceStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeReportCreationInput
    interface DescribeReportCreationOutput {
        var Status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var S3Location: S3Location?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FailedResourcesMap {
        @nativeGetter
        operator fun get(key: String): FailureInfo?
        @nativeSetter
        operator fun set(key: String, value: FailureInfo)
    }
    interface FailureInfo {
        var StatusCode: StatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: String /* "InternalServiceException" | "InvalidParameterException" | String */
        var ErrorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetComplianceSummaryInput {
        var TargetIdFilters: TargetIdFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var RegionFilters: RegionFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceTypeFilters: ResourceTypeFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var TagKeyFilters: TagKeyFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var GroupBy: GroupBy?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultsGetComplianceSummary?
            get() = definedExternally
            set(value) = definedExternally
        var PaginationToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetComplianceSummaryOutput {
        var SummaryList: SummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var PaginationToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResourcesInput {
        var PaginationToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var TagFilters: TagFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourcesPerPage: ResourcesPerPage?
            get() = definedExternally
            set(value) = definedExternally
        var TagsPerPage: TagsPerPage?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceTypeFilters: ResourceTypeFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeComplianceDetails: IncludeComplianceDetails?
            get() = definedExternally
            set(value) = definedExternally
        var ExcludeCompliantResources: ExcludeCompliantResources?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResourcesOutput {
        var PaginationToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceTagMappingList: ResourceTagMappingList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTagKeysInput {
        var PaginationToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTagKeysOutput {
        var PaginationToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var TagKeys: TagKeyList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTagValuesInput {
        var PaginationToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var Key: TagKey
    }
    interface GetTagValuesOutput {
        var PaginationToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var TagValues: TagValuesOutputList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceTagMapping {
        var ResourceARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var ComplianceDetails: ComplianceDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartReportCreationInput {
        var S3Bucket: S3Bucket
    }
    interface StartReportCreationOutput
    interface Summary {
        var LastUpdated: LastUpdated?
            get() = definedExternally
            set(value) = definedExternally
        var TargetId: TargetId?
            get() = definedExternally
            set(value) = definedExternally
        var TargetIdType: String /* "ACCOUNT" | "OU" | "ROOT" | String */
        var Region: Region?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: AmazonResourceType?
            get() = definedExternally
            set(value) = definedExternally
        var NonCompliantResources: NonCompliantResources?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface TagFilter {
        var Key: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var Values: TagValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagMap {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface TagResourcesInput {
        var ResourceARNList: ResourceARNList
        var Tags: TagMap
    }
    interface TagResourcesOutput {
        var FailedResourcesMap: FailedResourcesMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourcesInput {
        var ResourceARNList: ResourceARNList
        var TagKeys: TagKeyListForUntag
    }
    interface UntagResourcesOutput {
        var FailedResourcesMap: FailedResourcesMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-01-26" | "latest" | String */
    }
}