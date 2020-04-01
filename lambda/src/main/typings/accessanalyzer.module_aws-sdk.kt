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
import AccessAnalyzer.AnalyzedResourceSummary
import AccessAnalyzer.AnalyzerSummary
import AccessAnalyzer.ArchiveRuleSummary
import AccessAnalyzer.FindingSummary
import AccessAnalyzer.InlineArchiveRule
import AccessAnalyzer.CreateAnalyzerRequest
import AccessAnalyzer.CreateAnalyzerResponse
import AccessAnalyzer.CreateArchiveRuleRequest
import AccessAnalyzer.DeleteAnalyzerRequest
import AccessAnalyzer.DeleteArchiveRuleRequest
import AccessAnalyzer.GetAnalyzedResourceRequest
import AccessAnalyzer.GetAnalyzedResourceResponse
import AccessAnalyzer.GetAnalyzerRequest
import AccessAnalyzer.GetAnalyzerResponse
import AccessAnalyzer.GetArchiveRuleRequest
import AccessAnalyzer.GetArchiveRuleResponse
import AccessAnalyzer.GetFindingRequest
import AccessAnalyzer.GetFindingResponse
import AccessAnalyzer.ListAnalyzedResourcesRequest
import AccessAnalyzer.ListAnalyzedResourcesResponse
import AccessAnalyzer.ListAnalyzersRequest
import AccessAnalyzer.ListAnalyzersResponse
import AccessAnalyzer.ListArchiveRulesRequest
import AccessAnalyzer.ListArchiveRulesResponse
import AccessAnalyzer.ListFindingsRequest
import AccessAnalyzer.ListFindingsResponse
import AccessAnalyzer.ListTagsForResourceRequest
import AccessAnalyzer.ListTagsForResourceResponse
import AccessAnalyzer.StartResourceScanRequest
import AccessAnalyzer.TagResourceRequest
import AccessAnalyzer.TagResourceResponse
import AccessAnalyzer.UntagResourceRequest
import AccessAnalyzer.UntagResourceResponse
import AccessAnalyzer.UpdateArchiveRuleRequest
import AccessAnalyzer.UpdateFindingsRequest
import AccessAnalyzer.TagsMap
import AccessAnalyzer.FilterCriteriaMap
import AccessAnalyzer.Criterion
import AccessAnalyzer.ConditionKeyMap
import AccessAnalyzer.PrincipalMap
import AccessAnalyzer.AnalyzedResource
import AccessAnalyzer.Finding
import AccessAnalyzer.SortCriteria

typealias ActionList = Array<String>

typealias AnalyzedResourcesList = Array<AnalyzedResourceSummary>

typealias AnalyzerArn = String

typealias AnalyzersList = Array<AnalyzerSummary>

typealias ArchiveRulesList = Array<ArchiveRuleSummary>

typealias Boolean = Boolean

typealias FindingId = String

typealias FindingIdList = Array<FindingId>

typealias FindingsList = Array<FindingSummary>

typealias InlineArchiveRulesList = Array<InlineArchiveRule>

typealias Integer = Number

typealias Name = String

typealias ResourceArn = String

typealias SharedViaList = Array<String>

typealias String = String

typealias TagKeys = Array<String>

typealias Timestamp = Date

typealias Token = String

typealias ValueList = Array<String>

@JsModule("aws-sdk")
external open class AccessAnalyzer(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & AccessAnalyzer.Types.ClientConfiguration */
    open fun createAnalyzer(params: CreateAnalyzerRequest, callback: (err: AWSError, data: CreateAnalyzerResponse) -> Unit = definedExternally): Request<CreateAnalyzerResponse, AWSError>
    open fun createAnalyzer(callback: (err: AWSError, data: CreateAnalyzerResponse) -> Unit = definedExternally): Request<CreateAnalyzerResponse, AWSError>
    open fun createArchiveRule(params: CreateArchiveRuleRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createArchiveRule(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAnalyzer(params: DeleteAnalyzerRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAnalyzer(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteArchiveRule(params: DeleteArchiveRuleRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteArchiveRule(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun getAnalyzedResource(params: GetAnalyzedResourceRequest, callback: (err: AWSError, data: GetAnalyzedResourceResponse) -> Unit = definedExternally): Request<GetAnalyzedResourceResponse, AWSError>
    open fun getAnalyzedResource(callback: (err: AWSError, data: GetAnalyzedResourceResponse) -> Unit = definedExternally): Request<GetAnalyzedResourceResponse, AWSError>
    open fun getAnalyzer(params: GetAnalyzerRequest, callback: (err: AWSError, data: GetAnalyzerResponse) -> Unit = definedExternally): Request<GetAnalyzerResponse, AWSError>
    open fun getAnalyzer(callback: (err: AWSError, data: GetAnalyzerResponse) -> Unit = definedExternally): Request<GetAnalyzerResponse, AWSError>
    open fun getArchiveRule(params: GetArchiveRuleRequest, callback: (err: AWSError, data: GetArchiveRuleResponse) -> Unit = definedExternally): Request<GetArchiveRuleResponse, AWSError>
    open fun getArchiveRule(callback: (err: AWSError, data: GetArchiveRuleResponse) -> Unit = definedExternally): Request<GetArchiveRuleResponse, AWSError>
    open fun getFinding(params: GetFindingRequest, callback: (err: AWSError, data: GetFindingResponse) -> Unit = definedExternally): Request<GetFindingResponse, AWSError>
    open fun getFinding(callback: (err: AWSError, data: GetFindingResponse) -> Unit = definedExternally): Request<GetFindingResponse, AWSError>
    open fun listAnalyzedResources(params: ListAnalyzedResourcesRequest, callback: (err: AWSError, data: ListAnalyzedResourcesResponse) -> Unit = definedExternally): Request<ListAnalyzedResourcesResponse, AWSError>
    open fun listAnalyzedResources(callback: (err: AWSError, data: ListAnalyzedResourcesResponse) -> Unit = definedExternally): Request<ListAnalyzedResourcesResponse, AWSError>
    open fun listAnalyzers(params: ListAnalyzersRequest, callback: (err: AWSError, data: ListAnalyzersResponse) -> Unit = definedExternally): Request<ListAnalyzersResponse, AWSError>
    open fun listAnalyzers(callback: (err: AWSError, data: ListAnalyzersResponse) -> Unit = definedExternally): Request<ListAnalyzersResponse, AWSError>
    open fun listArchiveRules(params: ListArchiveRulesRequest, callback: (err: AWSError, data: ListArchiveRulesResponse) -> Unit = definedExternally): Request<ListArchiveRulesResponse, AWSError>
    open fun listArchiveRules(callback: (err: AWSError, data: ListArchiveRulesResponse) -> Unit = definedExternally): Request<ListArchiveRulesResponse, AWSError>
    open fun listFindings(params: ListFindingsRequest, callback: (err: AWSError, data: ListFindingsResponse) -> Unit = definedExternally): Request<ListFindingsResponse, AWSError>
    open fun listFindings(callback: (err: AWSError, data: ListFindingsResponse) -> Unit = definedExternally): Request<ListFindingsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun startResourceScan(params: StartResourceScanRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun startResourceScan(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateArchiveRule(params: UpdateArchiveRuleRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateArchiveRule(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateFindings(params: UpdateFindingsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateFindings(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    interface AnalyzedResource {
        var actions: ActionList?
            get() = definedExternally
            set(value) = definedExternally
        var analyzedAt: Timestamp
        var createdAt: Timestamp
        var error: String?
            get() = definedExternally
            set(value) = definedExternally
        var isPublic: Boolean
        var resourceArn: ResourceArn
        var resourceType: String /* "AWS::IAM::Role" | "AWS::KMS::Key" | "AWS::Lambda::Function" | "AWS::Lambda::LayerVersion" | "AWS::S3::Bucket" | "AWS::SQS::Queue" | String */
        var sharedVia: SharedViaList?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "ACTIVE" | "ARCHIVED" | "RESOLVED" | String */
        var updatedAt: Timestamp
    }
    interface AnalyzedResourceSummary {
        var resourceArn: ResourceArn
        var resourceType: String /* "AWS::IAM::Role" | "AWS::KMS::Key" | "AWS::Lambda::Function" | "AWS::Lambda::LayerVersion" | "AWS::S3::Bucket" | "AWS::SQS::Queue" | String */
    }
    interface AnalyzerSummary {
        var arn: AnalyzerArn
        var createdAt: Timestamp
        var lastResourceAnalyzed: String?
            get() = definedExternally
            set(value) = definedExternally
        var lastResourceAnalyzedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name
        var tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "ACCOUNT" | String */
    }
    interface ArchiveRuleSummary {
        var createdAt: Timestamp
        var filter: FilterCriteriaMap
        var ruleName: Name
        var updatedAt: Timestamp
    }
    interface ConditionKeyMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface CreateAnalyzerRequest {
        var analyzerName: Name
        var archiveRules: InlineArchiveRulesList?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "ACCOUNT" | String */
    }
    interface CreateAnalyzerResponse {
        var arn: AnalyzerArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateArchiveRuleRequest {
        var analyzerName: Name
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var filter: FilterCriteriaMap
        var ruleName: Name
    }
    interface Criterion {
        var contains: ValueList?
            get() = definedExternally
            set(value) = definedExternally
        var eq: ValueList?
            get() = definedExternally
            set(value) = definedExternally
        var exists: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var neq: ValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAnalyzerRequest {
        var analyzerName: Name
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteArchiveRuleRequest {
        var analyzerName: Name
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var ruleName: Name
    }
    interface FilterCriteriaMap {
        @nativeGetter
        operator fun get(key: String): Criterion?
        @nativeSetter
        operator fun set(key: String, value: Criterion)
    }
    interface Finding {
        var action: ActionList?
            get() = definedExternally
            set(value) = definedExternally
        var analyzedAt: Timestamp
        var condition: ConditionKeyMap
        var createdAt: Timestamp
        var error: String?
            get() = definedExternally
            set(value) = definedExternally
        var id: FindingId
        var isPublic: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var principal: PrincipalMap?
            get() = definedExternally
            set(value) = definedExternally
        var resource: String?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "AWS::IAM::Role" | "AWS::KMS::Key" | "AWS::Lambda::Function" | "AWS::Lambda::LayerVersion" | "AWS::S3::Bucket" | "AWS::SQS::Queue" | String */
        var status: String /* "ACTIVE" | "ARCHIVED" | "RESOLVED" | String */
        var updatedAt: Timestamp
    }
    interface FindingSummary {
        var action: ActionList?
            get() = definedExternally
            set(value) = definedExternally
        var analyzedAt: Timestamp
        var condition: ConditionKeyMap
        var createdAt: Timestamp
        var error: String?
            get() = definedExternally
            set(value) = definedExternally
        var id: FindingId
        var isPublic: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var principal: PrincipalMap?
            get() = definedExternally
            set(value) = definedExternally
        var resource: String?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "AWS::IAM::Role" | "AWS::KMS::Key" | "AWS::Lambda::Function" | "AWS::Lambda::LayerVersion" | "AWS::S3::Bucket" | "AWS::SQS::Queue" | String */
        var status: String /* "ACTIVE" | "ARCHIVED" | "RESOLVED" | String */
        var updatedAt: Timestamp
    }
    interface GetAnalyzedResourceRequest {
        var analyzerArn: AnalyzerArn
        var resourceArn: ResourceArn
    }
    interface GetAnalyzedResourceResponse {
        var resource: AnalyzedResource?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAnalyzerRequest {
        var analyzerName: Name
    }
    interface GetAnalyzerResponse {
        var analyzer: AnalyzerSummary
    }
    interface GetArchiveRuleRequest {
        var analyzerName: Name
        var ruleName: Name
    }
    interface GetArchiveRuleResponse {
        var archiveRule: ArchiveRuleSummary
    }
    interface GetFindingRequest {
        var analyzerArn: AnalyzerArn
        var id: FindingId
    }
    interface GetFindingResponse {
        var finding: Finding?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InlineArchiveRule {
        var filter: FilterCriteriaMap
        var ruleName: Name
    }
    interface ListAnalyzedResourcesRequest {
        var analyzerArn: AnalyzerArn
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "AWS::IAM::Role" | "AWS::KMS::Key" | "AWS::Lambda::Function" | "AWS::Lambda::LayerVersion" | "AWS::S3::Bucket" | "AWS::SQS::Queue" | String */
    }
    interface ListAnalyzedResourcesResponse {
        var analyzedResources: AnalyzedResourcesList
        var nextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAnalyzersRequest {
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "ACCOUNT" | String */
    }
    interface ListAnalyzersResponse {
        var analyzers: AnalyzersList
        var nextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListArchiveRulesRequest {
        var analyzerName: Name
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListArchiveRulesResponse {
        var archiveRules: ArchiveRulesList
        var nextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFindingsRequest {
        var analyzerArn: AnalyzerArn
        var filter: FilterCriteriaMap?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var sort: SortCriteria?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFindingsResponse {
        var findings: FindingsList
        var nextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var resourceArn: String
    }
    interface ListTagsForResourceResponse {
        var tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PrincipalMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface SortCriteria {
        var attributeName: String?
            get() = definedExternally
            set(value) = definedExternally
        var orderBy: String /* "ASC" | "DESC" | String */
    }
    interface StartResourceScanRequest {
        var analyzerArn: AnalyzerArn
        var resourceArn: ResourceArn
    }
    interface TagResourceRequest {
        var resourceArn: String
        var tags: TagsMap
    }
    interface TagResourceResponse
    interface TagsMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface UntagResourceRequest {
        var resourceArn: String
        var tagKeys: TagKeys
    }
    interface UntagResourceResponse
    interface UpdateArchiveRuleRequest {
        var analyzerName: Name
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var filter: FilterCriteriaMap
        var ruleName: Name
    }
    interface UpdateFindingsRequest {
        var analyzerArn: AnalyzerArn
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var ids: FindingIdList?
            get() = definedExternally
            set(value) = definedExternally
        var resourceArn: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "ACTIVE" | "ARCHIVED" | String */
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-11-01" | "latest" | String */
    }
}