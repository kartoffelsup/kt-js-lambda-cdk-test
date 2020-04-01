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
import WAF.ActivatedRule
import WAF.ByteMatchSetSummary
import WAF.ByteMatchSetUpdate
import WAF.ByteMatchTuple
import WAF.ExcludedRule
import WAF.GeoMatchConstraint
import WAF.GeoMatchSetSummary
import WAF.GeoMatchSetUpdate
import WAF.HTTPHeader
import WAF.IPSetDescriptor
import WAF.IPSetSummary
import WAF.IPSetUpdate
import WAF.LoggingConfiguration
import WAF.Predicate
import WAF.FieldToMatch
import WAF.RegexMatchSetSummary
import WAF.RegexMatchSetUpdate
import WAF.RegexMatchTuple
import WAF.RegexPatternSetSummary
import WAF.RegexPatternSetUpdate
import WAF.RuleGroupSummary
import WAF.RuleGroupUpdate
import WAF.RuleSummary
import WAF.RuleUpdate
import WAF.SampledHTTPRequest
import WAF.SizeConstraintSetSummary
import WAF.SizeConstraintSetUpdate
import WAF.SizeConstraint
import WAF.SqlInjectionMatchSetSummary
import WAF.SqlInjectionMatchSetUpdate
import WAF.SqlInjectionMatchTuple
import WAF.SubscribedRuleGroupSummary
import WAF.Tag
import WAF.WebACLSummary
import WAF.WebACLUpdate
import WAF.XssMatchSetSummary
import WAF.XssMatchSetUpdate
import WAF.XssMatchTuple
import WAF.CreateByteMatchSetRequest
import WAF.CreateByteMatchSetResponse
import WAF.CreateGeoMatchSetRequest
import WAF.CreateGeoMatchSetResponse
import WAF.CreateIPSetRequest
import WAF.CreateIPSetResponse
import WAF.CreateRateBasedRuleRequest
import WAF.CreateRateBasedRuleResponse
import WAF.CreateRegexMatchSetRequest
import WAF.CreateRegexMatchSetResponse
import WAF.CreateRegexPatternSetRequest
import WAF.CreateRegexPatternSetResponse
import WAF.CreateRuleRequest
import WAF.CreateRuleResponse
import WAF.CreateRuleGroupRequest
import WAF.CreateRuleGroupResponse
import WAF.CreateSizeConstraintSetRequest
import WAF.CreateSizeConstraintSetResponse
import WAF.CreateSqlInjectionMatchSetRequest
import WAF.CreateSqlInjectionMatchSetResponse
import WAF.CreateWebACLRequest
import WAF.CreateWebACLResponse
import WAF.CreateXssMatchSetRequest
import WAF.CreateXssMatchSetResponse
import WAF.DeleteByteMatchSetRequest
import WAF.DeleteByteMatchSetResponse
import WAF.DeleteGeoMatchSetRequest
import WAF.DeleteGeoMatchSetResponse
import WAF.DeleteIPSetRequest
import WAF.DeleteIPSetResponse
import WAF.DeleteLoggingConfigurationRequest
import WAF.DeleteLoggingConfigurationResponse
import WAF.DeletePermissionPolicyRequest
import WAF.DeletePermissionPolicyResponse
import WAF.DeleteRateBasedRuleRequest
import WAF.DeleteRateBasedRuleResponse
import WAF.DeleteRegexMatchSetRequest
import WAF.DeleteRegexMatchSetResponse
import WAF.DeleteRegexPatternSetRequest
import WAF.DeleteRegexPatternSetResponse
import WAF.DeleteRuleRequest
import WAF.DeleteRuleResponse
import WAF.DeleteRuleGroupRequest
import WAF.DeleteRuleGroupResponse
import WAF.DeleteSizeConstraintSetRequest
import WAF.DeleteSizeConstraintSetResponse
import WAF.DeleteSqlInjectionMatchSetRequest
import WAF.DeleteSqlInjectionMatchSetResponse
import WAF.DeleteWebACLRequest
import WAF.DeleteWebACLResponse
import WAF.DeleteXssMatchSetRequest
import WAF.DeleteXssMatchSetResponse
import WAF.GetByteMatchSetRequest
import WAF.GetByteMatchSetResponse
import WAF.GetChangeTokenRequest
import WAF.GetChangeTokenResponse
import WAF.GetChangeTokenStatusRequest
import WAF.GetChangeTokenStatusResponse
import WAF.GetGeoMatchSetRequest
import WAF.GetGeoMatchSetResponse
import WAF.GetIPSetRequest
import WAF.GetIPSetResponse
import WAF.GetLoggingConfigurationRequest
import WAF.GetLoggingConfigurationResponse
import WAF.GetPermissionPolicyRequest
import WAF.GetPermissionPolicyResponse
import WAF.GetRateBasedRuleRequest
import WAF.GetRateBasedRuleResponse
import WAF.GetRateBasedRuleManagedKeysRequest
import WAF.GetRateBasedRuleManagedKeysResponse
import WAF.GetRegexMatchSetRequest
import WAF.GetRegexMatchSetResponse
import WAF.GetRegexPatternSetRequest
import WAF.GetRegexPatternSetResponse
import WAF.GetRuleRequest
import WAF.GetRuleResponse
import WAF.GetRuleGroupRequest
import WAF.GetRuleGroupResponse
import WAF.GetSampledRequestsRequest
import WAF.GetSampledRequestsResponse
import WAF.GetSizeConstraintSetRequest
import WAF.GetSizeConstraintSetResponse
import WAF.GetSqlInjectionMatchSetRequest
import WAF.GetSqlInjectionMatchSetResponse
import WAF.GetWebACLRequest
import WAF.GetWebACLResponse
import WAF.GetXssMatchSetRequest
import WAF.GetXssMatchSetResponse
import WAF.ListActivatedRulesInRuleGroupRequest
import WAF.ListActivatedRulesInRuleGroupResponse
import WAF.ListByteMatchSetsRequest
import WAF.ListByteMatchSetsResponse
import WAF.ListGeoMatchSetsRequest
import WAF.ListGeoMatchSetsResponse
import WAF.ListIPSetsRequest
import WAF.ListIPSetsResponse
import WAF.ListLoggingConfigurationsRequest
import WAF.ListLoggingConfigurationsResponse
import WAF.ListRateBasedRulesRequest
import WAF.ListRateBasedRulesResponse
import WAF.ListRegexMatchSetsRequest
import WAF.ListRegexMatchSetsResponse
import WAF.ListRegexPatternSetsRequest
import WAF.ListRegexPatternSetsResponse
import WAF.ListRuleGroupsRequest
import WAF.ListRuleGroupsResponse
import WAF.ListRulesRequest
import WAF.ListRulesResponse
import WAF.ListSizeConstraintSetsRequest
import WAF.ListSizeConstraintSetsResponse
import WAF.ListSqlInjectionMatchSetsRequest
import WAF.ListSqlInjectionMatchSetsResponse
import WAF.ListSubscribedRuleGroupsRequest
import WAF.ListSubscribedRuleGroupsResponse
import WAF.ListTagsForResourceRequest
import WAF.ListTagsForResourceResponse
import WAF.ListWebACLsRequest
import WAF.ListWebACLsResponse
import WAF.ListXssMatchSetsRequest
import WAF.ListXssMatchSetsResponse
import WAF.PutLoggingConfigurationRequest
import WAF.PutLoggingConfigurationResponse
import WAF.PutPermissionPolicyRequest
import WAF.PutPermissionPolicyResponse
import WAF.TagResourceRequest
import WAF.TagResourceResponse
import WAF.UntagResourceRequest
import WAF.UntagResourceResponse
import WAF.UpdateByteMatchSetRequest
import WAF.UpdateByteMatchSetResponse
import WAF.UpdateGeoMatchSetRequest
import WAF.UpdateGeoMatchSetResponse
import WAF.UpdateIPSetRequest
import WAF.UpdateIPSetResponse
import WAF.UpdateRateBasedRuleRequest
import WAF.UpdateRateBasedRuleResponse
import WAF.UpdateRegexMatchSetRequest
import WAF.UpdateRegexMatchSetResponse
import WAF.UpdateRegexPatternSetRequest
import WAF.UpdateRegexPatternSetResponse
import WAF.UpdateRuleRequest
import WAF.UpdateRuleResponse
import WAF.UpdateRuleGroupRequest
import WAF.UpdateRuleGroupResponse
import WAF.UpdateSizeConstraintSetRequest
import WAF.UpdateSizeConstraintSetResponse
import WAF.UpdateSqlInjectionMatchSetRequest
import WAF.UpdateSqlInjectionMatchSetResponse
import WAF.UpdateWebACLRequest
import WAF.UpdateWebACLResponse
import WAF.UpdateXssMatchSetRequest
import WAF.UpdateXssMatchSetResponse
import WAF.WafAction
import WAF.WafOverrideAction
import WAF.ByteMatchSet
import WAF.GeoMatchSet
import WAF.IPSet
import WAF.RateBasedRule
import WAF.RegexMatchSet
import WAF.RegexPatternSet
import WAF.RuleGroup
import WAF.Rule
import WAF.SizeConstraintSet
import WAF.SqlInjectionMatchSet
import WAF.WebACL
import WAF.XssMatchSet
import WAF.TimeWindow
import WAF.TagInfoForResource
import WAF.HTTPRequest

typealias Action = String

typealias ActivatedRules = Array<ActivatedRule>

typealias ByteMatchSetSummaries = Array<ByteMatchSetSummary>

typealias ByteMatchSetUpdates = Array<ByteMatchSetUpdate>

typealias ByteMatchTuples = Array<ByteMatchTuple>

typealias ChangeToken = String

typealias Country = String

typealias ExcludedRules = Array<ExcludedRule>

typealias GeoMatchConstraints = Array<GeoMatchConstraint>

typealias GeoMatchSetSummaries = Array<GeoMatchSetSummary>

typealias GeoMatchSetUpdates = Array<GeoMatchSetUpdate>

typealias GetSampledRequestsMaxItems = Number

typealias HTTPHeaders = Array<HTTPHeader>

typealias HTTPMethod = String

typealias HTTPVersion = String

typealias HeaderName = String

typealias HeaderValue = String

typealias IPSetDescriptorValue = String

typealias IPSetDescriptors = Array<IPSetDescriptor>

typealias IPSetSummaries = Array<IPSetSummary>

typealias IPSetUpdates = Array<IPSetUpdate>

typealias IPString = String

typealias LogDestinationConfigs = Array<ResourceArn>

typealias LoggingConfigurations = Array<LoggingConfiguration>

typealias ManagedKey = String

typealias ManagedKeys = Array<ManagedKey>

typealias MatchFieldData = String

typealias MetricName = String

typealias Negated = Boolean

typealias NextMarker = String

typealias PaginationLimit = Number

typealias PolicyString = String

typealias PopulationSize = Number

typealias Predicates = Array<Predicate>

typealias RateLimit = Number

typealias RedactedFields = Array<FieldToMatch>

typealias RegexMatchSetSummaries = Array<RegexMatchSetSummary>

typealias RegexMatchSetUpdates = Array<RegexMatchSetUpdate>

typealias RegexMatchTuples = Array<RegexMatchTuple>

typealias RegexPatternSetSummaries = Array<RegexPatternSetSummary>

typealias RegexPatternSetUpdates = Array<RegexPatternSetUpdate>

typealias RegexPatternString = String

typealias RegexPatternStrings = Array<RegexPatternString>

typealias ResourceArn = String

typealias ResourceId = String

typealias ResourceName = String

typealias RuleGroupSummaries = Array<RuleGroupSummary>

typealias RuleGroupUpdates = Array<RuleGroupUpdate>

typealias RulePriority = Number

typealias RuleSummaries = Array<RuleSummary>

typealias RuleUpdates = Array<RuleUpdate>

typealias SampleWeight = Number

typealias SampledHTTPRequests = Array<SampledHTTPRequest>

typealias Size = Number

typealias SizeConstraintSetSummaries = Array<SizeConstraintSetSummary>

typealias SizeConstraintSetUpdates = Array<SizeConstraintSetUpdate>

typealias SizeConstraints = Array<SizeConstraint>

typealias SqlInjectionMatchSetSummaries = Array<SqlInjectionMatchSetSummary>

typealias SqlInjectionMatchSetUpdates = Array<SqlInjectionMatchSetUpdate>

typealias SqlInjectionMatchTuples = Array<SqlInjectionMatchTuple>

typealias SubscribedRuleGroupSummaries = Array<SubscribedRuleGroupSummary>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias Timestamp = Date

typealias URIString = String

typealias WebACLSummaries = Array<WebACLSummary>

typealias WebACLUpdates = Array<WebACLUpdate>

typealias XssMatchSetSummaries = Array<XssMatchSetSummary>

typealias XssMatchSetUpdates = Array<XssMatchSetUpdate>

typealias XssMatchTuples = Array<XssMatchTuple>

@JsModule("aws-sdk")
external open class WAF(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & WAF.Types.ClientConfiguration */
    open fun createByteMatchSet(params: CreateByteMatchSetRequest, callback: (err: AWSError, data: CreateByteMatchSetResponse) -> Unit = definedExternally): Request<CreateByteMatchSetResponse, AWSError>
    open fun createByteMatchSet(callback: (err: AWSError, data: CreateByteMatchSetResponse) -> Unit = definedExternally): Request<CreateByteMatchSetResponse, AWSError>
    open fun createGeoMatchSet(params: CreateGeoMatchSetRequest, callback: (err: AWSError, data: CreateGeoMatchSetResponse) -> Unit = definedExternally): Request<CreateGeoMatchSetResponse, AWSError>
    open fun createGeoMatchSet(callback: (err: AWSError, data: CreateGeoMatchSetResponse) -> Unit = definedExternally): Request<CreateGeoMatchSetResponse, AWSError>
    open fun createIPSet(params: CreateIPSetRequest, callback: (err: AWSError, data: CreateIPSetResponse) -> Unit = definedExternally): Request<CreateIPSetResponse, AWSError>
    open fun createIPSet(callback: (err: AWSError, data: CreateIPSetResponse) -> Unit = definedExternally): Request<CreateIPSetResponse, AWSError>
    open fun createRateBasedRule(params: CreateRateBasedRuleRequest, callback: (err: AWSError, data: CreateRateBasedRuleResponse) -> Unit = definedExternally): Request<CreateRateBasedRuleResponse, AWSError>
    open fun createRateBasedRule(callback: (err: AWSError, data: CreateRateBasedRuleResponse) -> Unit = definedExternally): Request<CreateRateBasedRuleResponse, AWSError>
    open fun createRegexMatchSet(params: CreateRegexMatchSetRequest, callback: (err: AWSError, data: CreateRegexMatchSetResponse) -> Unit = definedExternally): Request<CreateRegexMatchSetResponse, AWSError>
    open fun createRegexMatchSet(callback: (err: AWSError, data: CreateRegexMatchSetResponse) -> Unit = definedExternally): Request<CreateRegexMatchSetResponse, AWSError>
    open fun createRegexPatternSet(params: CreateRegexPatternSetRequest, callback: (err: AWSError, data: CreateRegexPatternSetResponse) -> Unit = definedExternally): Request<CreateRegexPatternSetResponse, AWSError>
    open fun createRegexPatternSet(callback: (err: AWSError, data: CreateRegexPatternSetResponse) -> Unit = definedExternally): Request<CreateRegexPatternSetResponse, AWSError>
    open fun createRule(params: CreateRuleRequest, callback: (err: AWSError, data: CreateRuleResponse) -> Unit = definedExternally): Request<CreateRuleResponse, AWSError>
    open fun createRule(callback: (err: AWSError, data: CreateRuleResponse) -> Unit = definedExternally): Request<CreateRuleResponse, AWSError>
    open fun createRuleGroup(params: CreateRuleGroupRequest, callback: (err: AWSError, data: CreateRuleGroupResponse) -> Unit = definedExternally): Request<CreateRuleGroupResponse, AWSError>
    open fun createRuleGroup(callback: (err: AWSError, data: CreateRuleGroupResponse) -> Unit = definedExternally): Request<CreateRuleGroupResponse, AWSError>
    open fun createSizeConstraintSet(params: CreateSizeConstraintSetRequest, callback: (err: AWSError, data: CreateSizeConstraintSetResponse) -> Unit = definedExternally): Request<CreateSizeConstraintSetResponse, AWSError>
    open fun createSizeConstraintSet(callback: (err: AWSError, data: CreateSizeConstraintSetResponse) -> Unit = definedExternally): Request<CreateSizeConstraintSetResponse, AWSError>
    open fun createSqlInjectionMatchSet(params: CreateSqlInjectionMatchSetRequest, callback: (err: AWSError, data: CreateSqlInjectionMatchSetResponse) -> Unit = definedExternally): Request<CreateSqlInjectionMatchSetResponse, AWSError>
    open fun createSqlInjectionMatchSet(callback: (err: AWSError, data: CreateSqlInjectionMatchSetResponse) -> Unit = definedExternally): Request<CreateSqlInjectionMatchSetResponse, AWSError>
    open fun createWebACL(params: CreateWebACLRequest, callback: (err: AWSError, data: CreateWebACLResponse) -> Unit = definedExternally): Request<CreateWebACLResponse, AWSError>
    open fun createWebACL(callback: (err: AWSError, data: CreateWebACLResponse) -> Unit = definedExternally): Request<CreateWebACLResponse, AWSError>
    open fun createXssMatchSet(params: CreateXssMatchSetRequest, callback: (err: AWSError, data: CreateXssMatchSetResponse) -> Unit = definedExternally): Request<CreateXssMatchSetResponse, AWSError>
    open fun createXssMatchSet(callback: (err: AWSError, data: CreateXssMatchSetResponse) -> Unit = definedExternally): Request<CreateXssMatchSetResponse, AWSError>
    open fun deleteByteMatchSet(params: DeleteByteMatchSetRequest, callback: (err: AWSError, data: DeleteByteMatchSetResponse) -> Unit = definedExternally): Request<DeleteByteMatchSetResponse, AWSError>
    open fun deleteByteMatchSet(callback: (err: AWSError, data: DeleteByteMatchSetResponse) -> Unit = definedExternally): Request<DeleteByteMatchSetResponse, AWSError>
    open fun deleteGeoMatchSet(params: DeleteGeoMatchSetRequest, callback: (err: AWSError, data: DeleteGeoMatchSetResponse) -> Unit = definedExternally): Request<DeleteGeoMatchSetResponse, AWSError>
    open fun deleteGeoMatchSet(callback: (err: AWSError, data: DeleteGeoMatchSetResponse) -> Unit = definedExternally): Request<DeleteGeoMatchSetResponse, AWSError>
    open fun deleteIPSet(params: DeleteIPSetRequest, callback: (err: AWSError, data: DeleteIPSetResponse) -> Unit = definedExternally): Request<DeleteIPSetResponse, AWSError>
    open fun deleteIPSet(callback: (err: AWSError, data: DeleteIPSetResponse) -> Unit = definedExternally): Request<DeleteIPSetResponse, AWSError>
    open fun deleteLoggingConfiguration(params: DeleteLoggingConfigurationRequest, callback: (err: AWSError, data: DeleteLoggingConfigurationResponse) -> Unit = definedExternally): Request<DeleteLoggingConfigurationResponse, AWSError>
    open fun deleteLoggingConfiguration(callback: (err: AWSError, data: DeleteLoggingConfigurationResponse) -> Unit = definedExternally): Request<DeleteLoggingConfigurationResponse, AWSError>
    open fun deletePermissionPolicy(params: DeletePermissionPolicyRequest, callback: (err: AWSError, data: DeletePermissionPolicyResponse) -> Unit = definedExternally): Request<DeletePermissionPolicyResponse, AWSError>
    open fun deletePermissionPolicy(callback: (err: AWSError, data: DeletePermissionPolicyResponse) -> Unit = definedExternally): Request<DeletePermissionPolicyResponse, AWSError>
    open fun deleteRateBasedRule(params: DeleteRateBasedRuleRequest, callback: (err: AWSError, data: DeleteRateBasedRuleResponse) -> Unit = definedExternally): Request<DeleteRateBasedRuleResponse, AWSError>
    open fun deleteRateBasedRule(callback: (err: AWSError, data: DeleteRateBasedRuleResponse) -> Unit = definedExternally): Request<DeleteRateBasedRuleResponse, AWSError>
    open fun deleteRegexMatchSet(params: DeleteRegexMatchSetRequest, callback: (err: AWSError, data: DeleteRegexMatchSetResponse) -> Unit = definedExternally): Request<DeleteRegexMatchSetResponse, AWSError>
    open fun deleteRegexMatchSet(callback: (err: AWSError, data: DeleteRegexMatchSetResponse) -> Unit = definedExternally): Request<DeleteRegexMatchSetResponse, AWSError>
    open fun deleteRegexPatternSet(params: DeleteRegexPatternSetRequest, callback: (err: AWSError, data: DeleteRegexPatternSetResponse) -> Unit = definedExternally): Request<DeleteRegexPatternSetResponse, AWSError>
    open fun deleteRegexPatternSet(callback: (err: AWSError, data: DeleteRegexPatternSetResponse) -> Unit = definedExternally): Request<DeleteRegexPatternSetResponse, AWSError>
    open fun deleteRule(params: DeleteRuleRequest, callback: (err: AWSError, data: DeleteRuleResponse) -> Unit = definedExternally): Request<DeleteRuleResponse, AWSError>
    open fun deleteRule(callback: (err: AWSError, data: DeleteRuleResponse) -> Unit = definedExternally): Request<DeleteRuleResponse, AWSError>
    open fun deleteRuleGroup(params: DeleteRuleGroupRequest, callback: (err: AWSError, data: DeleteRuleGroupResponse) -> Unit = definedExternally): Request<DeleteRuleGroupResponse, AWSError>
    open fun deleteRuleGroup(callback: (err: AWSError, data: DeleteRuleGroupResponse) -> Unit = definedExternally): Request<DeleteRuleGroupResponse, AWSError>
    open fun deleteSizeConstraintSet(params: DeleteSizeConstraintSetRequest, callback: (err: AWSError, data: DeleteSizeConstraintSetResponse) -> Unit = definedExternally): Request<DeleteSizeConstraintSetResponse, AWSError>
    open fun deleteSizeConstraintSet(callback: (err: AWSError, data: DeleteSizeConstraintSetResponse) -> Unit = definedExternally): Request<DeleteSizeConstraintSetResponse, AWSError>
    open fun deleteSqlInjectionMatchSet(params: DeleteSqlInjectionMatchSetRequest, callback: (err: AWSError, data: DeleteSqlInjectionMatchSetResponse) -> Unit = definedExternally): Request<DeleteSqlInjectionMatchSetResponse, AWSError>
    open fun deleteSqlInjectionMatchSet(callback: (err: AWSError, data: DeleteSqlInjectionMatchSetResponse) -> Unit = definedExternally): Request<DeleteSqlInjectionMatchSetResponse, AWSError>
    open fun deleteWebACL(params: DeleteWebACLRequest, callback: (err: AWSError, data: DeleteWebACLResponse) -> Unit = definedExternally): Request<DeleteWebACLResponse, AWSError>
    open fun deleteWebACL(callback: (err: AWSError, data: DeleteWebACLResponse) -> Unit = definedExternally): Request<DeleteWebACLResponse, AWSError>
    open fun deleteXssMatchSet(params: DeleteXssMatchSetRequest, callback: (err: AWSError, data: DeleteXssMatchSetResponse) -> Unit = definedExternally): Request<DeleteXssMatchSetResponse, AWSError>
    open fun deleteXssMatchSet(callback: (err: AWSError, data: DeleteXssMatchSetResponse) -> Unit = definedExternally): Request<DeleteXssMatchSetResponse, AWSError>
    open fun getByteMatchSet(params: GetByteMatchSetRequest, callback: (err: AWSError, data: GetByteMatchSetResponse) -> Unit = definedExternally): Request<GetByteMatchSetResponse, AWSError>
    open fun getByteMatchSet(callback: (err: AWSError, data: GetByteMatchSetResponse) -> Unit = definedExternally): Request<GetByteMatchSetResponse, AWSError>
    open fun getChangeToken(params: GetChangeTokenRequest, callback: (err: AWSError, data: GetChangeTokenResponse) -> Unit = definedExternally): Request<GetChangeTokenResponse, AWSError>
    open fun getChangeToken(callback: (err: AWSError, data: GetChangeTokenResponse) -> Unit = definedExternally): Request<GetChangeTokenResponse, AWSError>
    open fun getChangeTokenStatus(params: GetChangeTokenStatusRequest, callback: (err: AWSError, data: GetChangeTokenStatusResponse) -> Unit = definedExternally): Request<GetChangeTokenStatusResponse, AWSError>
    open fun getChangeTokenStatus(callback: (err: AWSError, data: GetChangeTokenStatusResponse) -> Unit = definedExternally): Request<GetChangeTokenStatusResponse, AWSError>
    open fun getGeoMatchSet(params: GetGeoMatchSetRequest, callback: (err: AWSError, data: GetGeoMatchSetResponse) -> Unit = definedExternally): Request<GetGeoMatchSetResponse, AWSError>
    open fun getGeoMatchSet(callback: (err: AWSError, data: GetGeoMatchSetResponse) -> Unit = definedExternally): Request<GetGeoMatchSetResponse, AWSError>
    open fun getIPSet(params: GetIPSetRequest, callback: (err: AWSError, data: GetIPSetResponse) -> Unit = definedExternally): Request<GetIPSetResponse, AWSError>
    open fun getIPSet(callback: (err: AWSError, data: GetIPSetResponse) -> Unit = definedExternally): Request<GetIPSetResponse, AWSError>
    open fun getLoggingConfiguration(params: GetLoggingConfigurationRequest, callback: (err: AWSError, data: GetLoggingConfigurationResponse) -> Unit = definedExternally): Request<GetLoggingConfigurationResponse, AWSError>
    open fun getLoggingConfiguration(callback: (err: AWSError, data: GetLoggingConfigurationResponse) -> Unit = definedExternally): Request<GetLoggingConfigurationResponse, AWSError>
    open fun getPermissionPolicy(params: GetPermissionPolicyRequest, callback: (err: AWSError, data: GetPermissionPolicyResponse) -> Unit = definedExternally): Request<GetPermissionPolicyResponse, AWSError>
    open fun getPermissionPolicy(callback: (err: AWSError, data: GetPermissionPolicyResponse) -> Unit = definedExternally): Request<GetPermissionPolicyResponse, AWSError>
    open fun getRateBasedRule(params: GetRateBasedRuleRequest, callback: (err: AWSError, data: GetRateBasedRuleResponse) -> Unit = definedExternally): Request<GetRateBasedRuleResponse, AWSError>
    open fun getRateBasedRule(callback: (err: AWSError, data: GetRateBasedRuleResponse) -> Unit = definedExternally): Request<GetRateBasedRuleResponse, AWSError>
    open fun getRateBasedRuleManagedKeys(params: GetRateBasedRuleManagedKeysRequest, callback: (err: AWSError, data: GetRateBasedRuleManagedKeysResponse) -> Unit = definedExternally): Request<GetRateBasedRuleManagedKeysResponse, AWSError>
    open fun getRateBasedRuleManagedKeys(callback: (err: AWSError, data: GetRateBasedRuleManagedKeysResponse) -> Unit = definedExternally): Request<GetRateBasedRuleManagedKeysResponse, AWSError>
    open fun getRegexMatchSet(params: GetRegexMatchSetRequest, callback: (err: AWSError, data: GetRegexMatchSetResponse) -> Unit = definedExternally): Request<GetRegexMatchSetResponse, AWSError>
    open fun getRegexMatchSet(callback: (err: AWSError, data: GetRegexMatchSetResponse) -> Unit = definedExternally): Request<GetRegexMatchSetResponse, AWSError>
    open fun getRegexPatternSet(params: GetRegexPatternSetRequest, callback: (err: AWSError, data: GetRegexPatternSetResponse) -> Unit = definedExternally): Request<GetRegexPatternSetResponse, AWSError>
    open fun getRegexPatternSet(callback: (err: AWSError, data: GetRegexPatternSetResponse) -> Unit = definedExternally): Request<GetRegexPatternSetResponse, AWSError>
    open fun getRule(params: GetRuleRequest, callback: (err: AWSError, data: GetRuleResponse) -> Unit = definedExternally): Request<GetRuleResponse, AWSError>
    open fun getRule(callback: (err: AWSError, data: GetRuleResponse) -> Unit = definedExternally): Request<GetRuleResponse, AWSError>
    open fun getRuleGroup(params: GetRuleGroupRequest, callback: (err: AWSError, data: GetRuleGroupResponse) -> Unit = definedExternally): Request<GetRuleGroupResponse, AWSError>
    open fun getRuleGroup(callback: (err: AWSError, data: GetRuleGroupResponse) -> Unit = definedExternally): Request<GetRuleGroupResponse, AWSError>
    open fun getSampledRequests(params: GetSampledRequestsRequest, callback: (err: AWSError, data: GetSampledRequestsResponse) -> Unit = definedExternally): Request<GetSampledRequestsResponse, AWSError>
    open fun getSampledRequests(callback: (err: AWSError, data: GetSampledRequestsResponse) -> Unit = definedExternally): Request<GetSampledRequestsResponse, AWSError>
    open fun getSizeConstraintSet(params: GetSizeConstraintSetRequest, callback: (err: AWSError, data: GetSizeConstraintSetResponse) -> Unit = definedExternally): Request<GetSizeConstraintSetResponse, AWSError>
    open fun getSizeConstraintSet(callback: (err: AWSError, data: GetSizeConstraintSetResponse) -> Unit = definedExternally): Request<GetSizeConstraintSetResponse, AWSError>
    open fun getSqlInjectionMatchSet(params: GetSqlInjectionMatchSetRequest, callback: (err: AWSError, data: GetSqlInjectionMatchSetResponse) -> Unit = definedExternally): Request<GetSqlInjectionMatchSetResponse, AWSError>
    open fun getSqlInjectionMatchSet(callback: (err: AWSError, data: GetSqlInjectionMatchSetResponse) -> Unit = definedExternally): Request<GetSqlInjectionMatchSetResponse, AWSError>
    open fun getWebACL(params: GetWebACLRequest, callback: (err: AWSError, data: GetWebACLResponse) -> Unit = definedExternally): Request<GetWebACLResponse, AWSError>
    open fun getWebACL(callback: (err: AWSError, data: GetWebACLResponse) -> Unit = definedExternally): Request<GetWebACLResponse, AWSError>
    open fun getXssMatchSet(params: GetXssMatchSetRequest, callback: (err: AWSError, data: GetXssMatchSetResponse) -> Unit = definedExternally): Request<GetXssMatchSetResponse, AWSError>
    open fun getXssMatchSet(callback: (err: AWSError, data: GetXssMatchSetResponse) -> Unit = definedExternally): Request<GetXssMatchSetResponse, AWSError>
    open fun listActivatedRulesInRuleGroup(params: ListActivatedRulesInRuleGroupRequest, callback: (err: AWSError, data: ListActivatedRulesInRuleGroupResponse) -> Unit = definedExternally): Request<ListActivatedRulesInRuleGroupResponse, AWSError>
    open fun listActivatedRulesInRuleGroup(callback: (err: AWSError, data: ListActivatedRulesInRuleGroupResponse) -> Unit = definedExternally): Request<ListActivatedRulesInRuleGroupResponse, AWSError>
    open fun listByteMatchSets(params: ListByteMatchSetsRequest, callback: (err: AWSError, data: ListByteMatchSetsResponse) -> Unit = definedExternally): Request<ListByteMatchSetsResponse, AWSError>
    open fun listByteMatchSets(callback: (err: AWSError, data: ListByteMatchSetsResponse) -> Unit = definedExternally): Request<ListByteMatchSetsResponse, AWSError>
    open fun listGeoMatchSets(params: ListGeoMatchSetsRequest, callback: (err: AWSError, data: ListGeoMatchSetsResponse) -> Unit = definedExternally): Request<ListGeoMatchSetsResponse, AWSError>
    open fun listGeoMatchSets(callback: (err: AWSError, data: ListGeoMatchSetsResponse) -> Unit = definedExternally): Request<ListGeoMatchSetsResponse, AWSError>
    open fun listIPSets(params: ListIPSetsRequest, callback: (err: AWSError, data: ListIPSetsResponse) -> Unit = definedExternally): Request<ListIPSetsResponse, AWSError>
    open fun listIPSets(callback: (err: AWSError, data: ListIPSetsResponse) -> Unit = definedExternally): Request<ListIPSetsResponse, AWSError>
    open fun listLoggingConfigurations(params: ListLoggingConfigurationsRequest, callback: (err: AWSError, data: ListLoggingConfigurationsResponse) -> Unit = definedExternally): Request<ListLoggingConfigurationsResponse, AWSError>
    open fun listLoggingConfigurations(callback: (err: AWSError, data: ListLoggingConfigurationsResponse) -> Unit = definedExternally): Request<ListLoggingConfigurationsResponse, AWSError>
    open fun listRateBasedRules(params: ListRateBasedRulesRequest, callback: (err: AWSError, data: ListRateBasedRulesResponse) -> Unit = definedExternally): Request<ListRateBasedRulesResponse, AWSError>
    open fun listRateBasedRules(callback: (err: AWSError, data: ListRateBasedRulesResponse) -> Unit = definedExternally): Request<ListRateBasedRulesResponse, AWSError>
    open fun listRegexMatchSets(params: ListRegexMatchSetsRequest, callback: (err: AWSError, data: ListRegexMatchSetsResponse) -> Unit = definedExternally): Request<ListRegexMatchSetsResponse, AWSError>
    open fun listRegexMatchSets(callback: (err: AWSError, data: ListRegexMatchSetsResponse) -> Unit = definedExternally): Request<ListRegexMatchSetsResponse, AWSError>
    open fun listRegexPatternSets(params: ListRegexPatternSetsRequest, callback: (err: AWSError, data: ListRegexPatternSetsResponse) -> Unit = definedExternally): Request<ListRegexPatternSetsResponse, AWSError>
    open fun listRegexPatternSets(callback: (err: AWSError, data: ListRegexPatternSetsResponse) -> Unit = definedExternally): Request<ListRegexPatternSetsResponse, AWSError>
    open fun listRuleGroups(params: ListRuleGroupsRequest, callback: (err: AWSError, data: ListRuleGroupsResponse) -> Unit = definedExternally): Request<ListRuleGroupsResponse, AWSError>
    open fun listRuleGroups(callback: (err: AWSError, data: ListRuleGroupsResponse) -> Unit = definedExternally): Request<ListRuleGroupsResponse, AWSError>
    open fun listRules(params: ListRulesRequest, callback: (err: AWSError, data: ListRulesResponse) -> Unit = definedExternally): Request<ListRulesResponse, AWSError>
    open fun listRules(callback: (err: AWSError, data: ListRulesResponse) -> Unit = definedExternally): Request<ListRulesResponse, AWSError>
    open fun listSizeConstraintSets(params: ListSizeConstraintSetsRequest, callback: (err: AWSError, data: ListSizeConstraintSetsResponse) -> Unit = definedExternally): Request<ListSizeConstraintSetsResponse, AWSError>
    open fun listSizeConstraintSets(callback: (err: AWSError, data: ListSizeConstraintSetsResponse) -> Unit = definedExternally): Request<ListSizeConstraintSetsResponse, AWSError>
    open fun listSqlInjectionMatchSets(params: ListSqlInjectionMatchSetsRequest, callback: (err: AWSError, data: ListSqlInjectionMatchSetsResponse) -> Unit = definedExternally): Request<ListSqlInjectionMatchSetsResponse, AWSError>
    open fun listSqlInjectionMatchSets(callback: (err: AWSError, data: ListSqlInjectionMatchSetsResponse) -> Unit = definedExternally): Request<ListSqlInjectionMatchSetsResponse, AWSError>
    open fun listSubscribedRuleGroups(params: ListSubscribedRuleGroupsRequest, callback: (err: AWSError, data: ListSubscribedRuleGroupsResponse) -> Unit = definedExternally): Request<ListSubscribedRuleGroupsResponse, AWSError>
    open fun listSubscribedRuleGroups(callback: (err: AWSError, data: ListSubscribedRuleGroupsResponse) -> Unit = definedExternally): Request<ListSubscribedRuleGroupsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listWebACLs(params: ListWebACLsRequest, callback: (err: AWSError, data: ListWebACLsResponse) -> Unit = definedExternally): Request<ListWebACLsResponse, AWSError>
    open fun listWebACLs(callback: (err: AWSError, data: ListWebACLsResponse) -> Unit = definedExternally): Request<ListWebACLsResponse, AWSError>
    open fun listXssMatchSets(params: ListXssMatchSetsRequest, callback: (err: AWSError, data: ListXssMatchSetsResponse) -> Unit = definedExternally): Request<ListXssMatchSetsResponse, AWSError>
    open fun listXssMatchSets(callback: (err: AWSError, data: ListXssMatchSetsResponse) -> Unit = definedExternally): Request<ListXssMatchSetsResponse, AWSError>
    open fun putLoggingConfiguration(params: PutLoggingConfigurationRequest, callback: (err: AWSError, data: PutLoggingConfigurationResponse) -> Unit = definedExternally): Request<PutLoggingConfigurationResponse, AWSError>
    open fun putLoggingConfiguration(callback: (err: AWSError, data: PutLoggingConfigurationResponse) -> Unit = definedExternally): Request<PutLoggingConfigurationResponse, AWSError>
    open fun putPermissionPolicy(params: PutPermissionPolicyRequest, callback: (err: AWSError, data: PutPermissionPolicyResponse) -> Unit = definedExternally): Request<PutPermissionPolicyResponse, AWSError>
    open fun putPermissionPolicy(callback: (err: AWSError, data: PutPermissionPolicyResponse) -> Unit = definedExternally): Request<PutPermissionPolicyResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateByteMatchSet(params: UpdateByteMatchSetRequest, callback: (err: AWSError, data: UpdateByteMatchSetResponse) -> Unit = definedExternally): Request<UpdateByteMatchSetResponse, AWSError>
    open fun updateByteMatchSet(callback: (err: AWSError, data: UpdateByteMatchSetResponse) -> Unit = definedExternally): Request<UpdateByteMatchSetResponse, AWSError>
    open fun updateGeoMatchSet(params: UpdateGeoMatchSetRequest, callback: (err: AWSError, data: UpdateGeoMatchSetResponse) -> Unit = definedExternally): Request<UpdateGeoMatchSetResponse, AWSError>
    open fun updateGeoMatchSet(callback: (err: AWSError, data: UpdateGeoMatchSetResponse) -> Unit = definedExternally): Request<UpdateGeoMatchSetResponse, AWSError>
    open fun updateIPSet(params: UpdateIPSetRequest, callback: (err: AWSError, data: UpdateIPSetResponse) -> Unit = definedExternally): Request<UpdateIPSetResponse, AWSError>
    open fun updateIPSet(callback: (err: AWSError, data: UpdateIPSetResponse) -> Unit = definedExternally): Request<UpdateIPSetResponse, AWSError>
    open fun updateRateBasedRule(params: UpdateRateBasedRuleRequest, callback: (err: AWSError, data: UpdateRateBasedRuleResponse) -> Unit = definedExternally): Request<UpdateRateBasedRuleResponse, AWSError>
    open fun updateRateBasedRule(callback: (err: AWSError, data: UpdateRateBasedRuleResponse) -> Unit = definedExternally): Request<UpdateRateBasedRuleResponse, AWSError>
    open fun updateRegexMatchSet(params: UpdateRegexMatchSetRequest, callback: (err: AWSError, data: UpdateRegexMatchSetResponse) -> Unit = definedExternally): Request<UpdateRegexMatchSetResponse, AWSError>
    open fun updateRegexMatchSet(callback: (err: AWSError, data: UpdateRegexMatchSetResponse) -> Unit = definedExternally): Request<UpdateRegexMatchSetResponse, AWSError>
    open fun updateRegexPatternSet(params: UpdateRegexPatternSetRequest, callback: (err: AWSError, data: UpdateRegexPatternSetResponse) -> Unit = definedExternally): Request<UpdateRegexPatternSetResponse, AWSError>
    open fun updateRegexPatternSet(callback: (err: AWSError, data: UpdateRegexPatternSetResponse) -> Unit = definedExternally): Request<UpdateRegexPatternSetResponse, AWSError>
    open fun updateRule(params: UpdateRuleRequest, callback: (err: AWSError, data: UpdateRuleResponse) -> Unit = definedExternally): Request<UpdateRuleResponse, AWSError>
    open fun updateRule(callback: (err: AWSError, data: UpdateRuleResponse) -> Unit = definedExternally): Request<UpdateRuleResponse, AWSError>
    open fun updateRuleGroup(params: UpdateRuleGroupRequest, callback: (err: AWSError, data: UpdateRuleGroupResponse) -> Unit = definedExternally): Request<UpdateRuleGroupResponse, AWSError>
    open fun updateRuleGroup(callback: (err: AWSError, data: UpdateRuleGroupResponse) -> Unit = definedExternally): Request<UpdateRuleGroupResponse, AWSError>
    open fun updateSizeConstraintSet(params: UpdateSizeConstraintSetRequest, callback: (err: AWSError, data: UpdateSizeConstraintSetResponse) -> Unit = definedExternally): Request<UpdateSizeConstraintSetResponse, AWSError>
    open fun updateSizeConstraintSet(callback: (err: AWSError, data: UpdateSizeConstraintSetResponse) -> Unit = definedExternally): Request<UpdateSizeConstraintSetResponse, AWSError>
    open fun updateSqlInjectionMatchSet(params: UpdateSqlInjectionMatchSetRequest, callback: (err: AWSError, data: UpdateSqlInjectionMatchSetResponse) -> Unit = definedExternally): Request<UpdateSqlInjectionMatchSetResponse, AWSError>
    open fun updateSqlInjectionMatchSet(callback: (err: AWSError, data: UpdateSqlInjectionMatchSetResponse) -> Unit = definedExternally): Request<UpdateSqlInjectionMatchSetResponse, AWSError>
    open fun updateWebACL(params: UpdateWebACLRequest, callback: (err: AWSError, data: UpdateWebACLResponse) -> Unit = definedExternally): Request<UpdateWebACLResponse, AWSError>
    open fun updateWebACL(callback: (err: AWSError, data: UpdateWebACLResponse) -> Unit = definedExternally): Request<UpdateWebACLResponse, AWSError>
    open fun updateXssMatchSet(params: UpdateXssMatchSetRequest, callback: (err: AWSError, data: UpdateXssMatchSetResponse) -> Unit = definedExternally): Request<UpdateXssMatchSetResponse, AWSError>
    open fun updateXssMatchSet(callback: (err: AWSError, data: UpdateXssMatchSetResponse) -> Unit = definedExternally): Request<UpdateXssMatchSetResponse, AWSError>
    interface ActivatedRule {
        var Priority: RulePriority
        var RuleId: ResourceId
        var Action: WafAction?
            get() = definedExternally
            set(value) = definedExternally
        var OverrideAction: WafOverrideAction?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "REGULAR" | "RATE_BASED" | "GROUP" | String */
        var ExcludedRules: ExcludedRules?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ByteMatchSet {
        var ByteMatchSetId: ResourceId
        var Name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var ByteMatchTuples: ByteMatchTuples
    }
    interface ByteMatchSetSummary {
        var ByteMatchSetId: ResourceId
        var Name: ResourceName
    }
    interface ByteMatchSetUpdate {
        var Action: String /* "INSERT" | "DELETE" | String */
        var ByteMatchTuple: ByteMatchTuple
    }
    interface ByteMatchTuple {
        var FieldToMatch: FieldToMatch
        var TargetString: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var TextTransformation: String /* "NONE" | "COMPRESS_WHITE_SPACE" | "HTML_ENTITY_DECODE" | "LOWERCASE" | "CMD_LINE" | "URL_DECODE" | String */
        var PositionalConstraint: String /* "EXACTLY" | "STARTS_WITH" | "ENDS_WITH" | "CONTAINS" | "CONTAINS_WORD" | String */
    }
    interface CreateByteMatchSetRequest {
        var Name: ResourceName
        var ChangeToken: ChangeToken
    }
    interface CreateByteMatchSetResponse {
        var ByteMatchSet: ByteMatchSet?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGeoMatchSetRequest {
        var Name: ResourceName
        var ChangeToken: ChangeToken
    }
    interface CreateGeoMatchSetResponse {
        var GeoMatchSet: GeoMatchSet?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateIPSetRequest {
        var Name: ResourceName
        var ChangeToken: ChangeToken
    }
    interface CreateIPSetResponse {
        var IPSet: IPSet?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRateBasedRuleRequest {
        var Name: ResourceName
        var MetricName: MetricName
        var RateKey: String /* "IP" | String */
        var RateLimit: RateLimit
        var ChangeToken: ChangeToken
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRateBasedRuleResponse {
        var Rule: RateBasedRule?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRegexMatchSetRequest {
        var Name: ResourceName
        var ChangeToken: ChangeToken
    }
    interface CreateRegexMatchSetResponse {
        var RegexMatchSet: RegexMatchSet?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRegexPatternSetRequest {
        var Name: ResourceName
        var ChangeToken: ChangeToken
    }
    interface CreateRegexPatternSetResponse {
        var RegexPatternSet: RegexPatternSet?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRuleGroupRequest {
        var Name: ResourceName
        var MetricName: MetricName
        var ChangeToken: ChangeToken
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRuleGroupResponse {
        var RuleGroup: RuleGroup?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRuleRequest {
        var Name: ResourceName
        var MetricName: MetricName
        var ChangeToken: ChangeToken
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRuleResponse {
        var Rule: Rule?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSizeConstraintSetRequest {
        var Name: ResourceName
        var ChangeToken: ChangeToken
    }
    interface CreateSizeConstraintSetResponse {
        var SizeConstraintSet: SizeConstraintSet?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSqlInjectionMatchSetRequest {
        var Name: ResourceName
        var ChangeToken: ChangeToken
    }
    interface CreateSqlInjectionMatchSetResponse {
        var SqlInjectionMatchSet: SqlInjectionMatchSet?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateWebACLRequest {
        var Name: ResourceName
        var MetricName: MetricName
        var DefaultAction: WafAction
        var ChangeToken: ChangeToken
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateWebACLResponse {
        var WebACL: WebACL?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateXssMatchSetRequest {
        var Name: ResourceName
        var ChangeToken: ChangeToken
    }
    interface CreateXssMatchSetResponse {
        var XssMatchSet: XssMatchSet?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteByteMatchSetRequest {
        var ByteMatchSetId: ResourceId
        var ChangeToken: ChangeToken
    }
    interface DeleteByteMatchSetResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteGeoMatchSetRequest {
        var GeoMatchSetId: ResourceId
        var ChangeToken: ChangeToken
    }
    interface DeleteGeoMatchSetResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteIPSetRequest {
        var IPSetId: ResourceId
        var ChangeToken: ChangeToken
    }
    interface DeleteIPSetResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteLoggingConfigurationRequest {
        var ResourceArn: ResourceArn
    }
    interface DeleteLoggingConfigurationResponse
    interface DeletePermissionPolicyRequest {
        var ResourceArn: ResourceArn
    }
    interface DeletePermissionPolicyResponse
    interface DeleteRateBasedRuleRequest {
        var RuleId: ResourceId
        var ChangeToken: ChangeToken
    }
    interface DeleteRateBasedRuleResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteRegexMatchSetRequest {
        var RegexMatchSetId: ResourceId
        var ChangeToken: ChangeToken
    }
    interface DeleteRegexMatchSetResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteRegexPatternSetRequest {
        var RegexPatternSetId: ResourceId
        var ChangeToken: ChangeToken
    }
    interface DeleteRegexPatternSetResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteRuleGroupRequest {
        var RuleGroupId: ResourceId
        var ChangeToken: ChangeToken
    }
    interface DeleteRuleGroupResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteRuleRequest {
        var RuleId: ResourceId
        var ChangeToken: ChangeToken
    }
    interface DeleteRuleResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteSizeConstraintSetRequest {
        var SizeConstraintSetId: ResourceId
        var ChangeToken: ChangeToken
    }
    interface DeleteSizeConstraintSetResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteSqlInjectionMatchSetRequest {
        var SqlInjectionMatchSetId: ResourceId
        var ChangeToken: ChangeToken
    }
    interface DeleteSqlInjectionMatchSetResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteWebACLRequest {
        var WebACLId: ResourceId
        var ChangeToken: ChangeToken
    }
    interface DeleteWebACLResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteXssMatchSetRequest {
        var XssMatchSetId: ResourceId
        var ChangeToken: ChangeToken
    }
    interface DeleteXssMatchSetResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExcludedRule {
        var RuleId: ResourceId
    }
    interface FieldToMatch {
        var Type: String /* "URI" | "QUERY_STRING" | "HEADER" | "METHOD" | "BODY" | "SINGLE_QUERY_ARG" | "ALL_QUERY_ARGS" | String */
        var Data: MatchFieldData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GeoMatchConstraint {
        var Type: String /* "Country" | String */
        var Value: String /* "AF" | "AX" | "AL" | "DZ" | "AS" | "AD" | "AO" | "AI" | "AQ" | "AG" | "AR" | "AM" | "AW" | "AU" | "AT" | "AZ" | "BS" | "BH" | "BD" | "BB" | "BY" | "BE" | "BZ" | "BJ" | "BM" | "BT" | "BO" | "BQ" | "BA" | "BW" | "BV" | "BR" | "IO" | "BN" | "BG" | "BF" | "BI" | "KH" | "CM" | "CA" | "CV" | "KY" | "CF" | "TD" | "CL" | "CN" | "CX" | "CC" | "CO" | "KM" | "CG" | "CD" | "CK" | "CR" | "CI" | "HR" | "CU" | "CW" | "CY" | "CZ" | "DK" | "DJ" | "DM" | "DO" | "EC" | "EG" | "SV" | "GQ" | "ER" | "EE" | "ET" | "FK" | "FO" | "FJ" | "FI" | "FR" | "GF" | "PF" | "TF" | "GA" | "GM" | "GE" | "DE" | "GH" | "GI" | "GR" | "GL" | "GD" | "GP" | "GU" | "GT" | "GG" | "GN" | "GW" | "GY" | "HT" | "HM" | "VA" | "HN" | "HK" | "HU" | "IS" | "IN" | "ID" | "IR" | "IQ" | "IE" | "IM" | "IL" | "IT" | "JM" | "JP" | "JE" | "JO" | "KZ" | "KE" | "KI" | "KP" | "KR" | "KW" | "KG" | "LA" | "LV" | "LB" | "LS" | "LR" | "LY" | "LI" | "LT" | "LU" | "MO" | "MK" | "MG" | "MW" | "MY" | "MV" | "ML" | "MT" | "MH" | "MQ" | "MR" | "MU" | "YT" | "MX" | "FM" | "MD" | "MC" | "MN" | "ME" | "MS" | "MA" | "MZ" | "MM" | "NA" | "NR" | "NP" | "NL" | "NC" | "NZ" | "NI" | "NE" | "NG" | "NU" | "NF" | "MP" | "NO" | "OM" | "PK" | "PW" | "PS" | "PA" | "PG" | "PY" | "PE" | "PH" | "PN" | "PL" | "PT" | "PR" | "QA" | "RE" | "RO" | "RU" | "RW" | "BL" | "SH" | "KN" | "LC" | "MF" | "PM" | "VC" | "WS" | "SM" | "ST" | "SA" | "SN" | "RS" | "SC" | "SL" | "SG" | "SX" | "SK" | "SI" | "SB" | "SO" | "ZA" | "GS" | "SS" | "ES" | "LK" | "SD" | "SR" | "SJ" | "SZ" | "SE" | "CH" | "SY" | "TW" | "TJ" | "TZ" | "TH" | "TL" | "TG" | "TK" | "TO" | "TT" | "TN" | "TR" | "TM" | "TC" | "TV" | "UG" | "UA" | "AE" | "GB" | "US" | "UM" | "UY" | "UZ" | "VU" | "VE" | "VN" | "VG" | "VI" | "WF" | "EH" | "YE" | "ZM" | "ZW" | String */
    }
    interface GeoMatchSet {
        var GeoMatchSetId: ResourceId
        var Name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var GeoMatchConstraints: GeoMatchConstraints
    }
    interface GeoMatchSetSummary {
        var GeoMatchSetId: ResourceId
        var Name: ResourceName
    }
    interface GeoMatchSetUpdate {
        var Action: String /* "INSERT" | "DELETE" | String */
        var GeoMatchConstraint: GeoMatchConstraint
    }
    interface GetByteMatchSetRequest {
        var ByteMatchSetId: ResourceId
    }
    interface GetByteMatchSetResponse {
        var ByteMatchSet: ByteMatchSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetChangeTokenRequest
    interface GetChangeTokenResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetChangeTokenStatusRequest {
        var ChangeToken: ChangeToken
    }
    interface GetChangeTokenStatusResponse {
        var ChangeTokenStatus: String /* "PROVISIONED" | "PENDING" | "INSYNC" | String */
    }
    interface GetGeoMatchSetRequest {
        var GeoMatchSetId: ResourceId
    }
    interface GetGeoMatchSetResponse {
        var GeoMatchSet: GeoMatchSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIPSetRequest {
        var IPSetId: ResourceId
    }
    interface GetIPSetResponse {
        var IPSet: IPSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLoggingConfigurationRequest {
        var ResourceArn: ResourceArn
    }
    interface GetLoggingConfigurationResponse {
        var LoggingConfiguration: LoggingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPermissionPolicyRequest {
        var ResourceArn: ResourceArn
    }
    interface GetPermissionPolicyResponse {
        var Policy: PolicyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRateBasedRuleManagedKeysRequest {
        var RuleId: ResourceId
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRateBasedRuleManagedKeysResponse {
        var ManagedKeys: ManagedKeys?
            get() = definedExternally
            set(value) = definedExternally
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRateBasedRuleRequest {
        var RuleId: ResourceId
    }
    interface GetRateBasedRuleResponse {
        var Rule: RateBasedRule?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRegexMatchSetRequest {
        var RegexMatchSetId: ResourceId
    }
    interface GetRegexMatchSetResponse {
        var RegexMatchSet: RegexMatchSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRegexPatternSetRequest {
        var RegexPatternSetId: ResourceId
    }
    interface GetRegexPatternSetResponse {
        var RegexPatternSet: RegexPatternSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRuleGroupRequest {
        var RuleGroupId: ResourceId
    }
    interface GetRuleGroupResponse {
        var RuleGroup: RuleGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRuleRequest {
        var RuleId: ResourceId
    }
    interface GetRuleResponse {
        var Rule: Rule?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSampledRequestsRequest {
        var WebAclId: ResourceId
        var RuleId: ResourceId
        var TimeWindow: TimeWindow
        var MaxItems: GetSampledRequestsMaxItems
    }
    interface GetSampledRequestsResponse {
        var SampledRequests: SampledHTTPRequests?
            get() = definedExternally
            set(value) = definedExternally
        var PopulationSize: PopulationSize?
            get() = definedExternally
            set(value) = definedExternally
        var TimeWindow: TimeWindow?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSizeConstraintSetRequest {
        var SizeConstraintSetId: ResourceId
    }
    interface GetSizeConstraintSetResponse {
        var SizeConstraintSet: SizeConstraintSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSqlInjectionMatchSetRequest {
        var SqlInjectionMatchSetId: ResourceId
    }
    interface GetSqlInjectionMatchSetResponse {
        var SqlInjectionMatchSet: SqlInjectionMatchSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetWebACLRequest {
        var WebACLId: ResourceId
    }
    interface GetWebACLResponse {
        var WebACL: WebACL?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetXssMatchSetRequest {
        var XssMatchSetId: ResourceId
    }
    interface GetXssMatchSetResponse {
        var XssMatchSet: XssMatchSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HTTPHeader {
        var Name: HeaderName?
            get() = definedExternally
            set(value) = definedExternally
        var Value: HeaderValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HTTPRequest {
        var ClientIP: IPString?
            get() = definedExternally
            set(value) = definedExternally
        var Country: Country?
            get() = definedExternally
            set(value) = definedExternally
        var URI: URIString?
            get() = definedExternally
            set(value) = definedExternally
        var Method: HTTPMethod?
            get() = definedExternally
            set(value) = definedExternally
        var HTTPVersion: HTTPVersion?
            get() = definedExternally
            set(value) = definedExternally
        var Headers: HTTPHeaders?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IPSet {
        var IPSetId: ResourceId
        var Name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var IPSetDescriptors: IPSetDescriptors
    }
    interface IPSetDescriptor {
        var Type: String /* "IPV4" | "IPV6" | String */
        var Value: IPSetDescriptorValue
    }
    interface IPSetSummary {
        var IPSetId: ResourceId
        var Name: ResourceName
    }
    interface IPSetUpdate {
        var Action: String /* "INSERT" | "DELETE" | String */
        var IPSetDescriptor: IPSetDescriptor
    }
    interface ListActivatedRulesInRuleGroupRequest {
        var RuleGroupId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PaginationLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListActivatedRulesInRuleGroupResponse {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var ActivatedRules: ActivatedRules?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListByteMatchSetsRequest {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PaginationLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListByteMatchSetsResponse {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var ByteMatchSets: ByteMatchSetSummaries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGeoMatchSetsRequest {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PaginationLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGeoMatchSetsResponse {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var GeoMatchSets: GeoMatchSetSummaries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIPSetsRequest {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PaginationLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIPSetsResponse {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var IPSets: IPSetSummaries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLoggingConfigurationsRequest {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PaginationLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLoggingConfigurationsResponse {
        var LoggingConfigurations: LoggingConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRateBasedRulesRequest {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PaginationLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRateBasedRulesResponse {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var Rules: RuleSummaries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRegexMatchSetsRequest {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PaginationLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRegexMatchSetsResponse {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var RegexMatchSets: RegexMatchSetSummaries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRegexPatternSetsRequest {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PaginationLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRegexPatternSetsResponse {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var RegexPatternSets: RegexPatternSetSummaries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRuleGroupsRequest {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PaginationLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRuleGroupsResponse {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var RuleGroups: RuleGroupSummaries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRulesRequest {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PaginationLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRulesResponse {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var Rules: RuleSummaries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSizeConstraintSetsRequest {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PaginationLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSizeConstraintSetsResponse {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var SizeConstraintSets: SizeConstraintSetSummaries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSqlInjectionMatchSetsRequest {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PaginationLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSqlInjectionMatchSetsResponse {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var SqlInjectionMatchSets: SqlInjectionMatchSetSummaries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSubscribedRuleGroupsRequest {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PaginationLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSubscribedRuleGroupsResponse {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var RuleGroups: SubscribedRuleGroupSummaries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PaginationLimit?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceARN: ResourceArn
    }
    interface ListTagsForResourceResponse {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var TagInfoForResource: TagInfoForResource?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListWebACLsRequest {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PaginationLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListWebACLsResponse {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var WebACLs: WebACLSummaries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListXssMatchSetsRequest {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PaginationLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListXssMatchSetsResponse {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var XssMatchSets: XssMatchSetSummaries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoggingConfiguration {
        var ResourceArn: ResourceArn
        var LogDestinationConfigs: LogDestinationConfigs
        var RedactedFields: RedactedFields?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Predicate {
        var Negated: Negated
        var Type: String /* "IPMatch" | "ByteMatch" | "SqlInjectionMatch" | "GeoMatch" | "SizeConstraint" | "XssMatch" | "RegexMatch" | String */
        var DataId: ResourceId
    }
    interface PutLoggingConfigurationRequest {
        var LoggingConfiguration: LoggingConfiguration
    }
    interface PutLoggingConfigurationResponse {
        var LoggingConfiguration: LoggingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutPermissionPolicyRequest {
        var ResourceArn: ResourceArn
        var Policy: PolicyString
    }
    interface PutPermissionPolicyResponse
    interface RateBasedRule {
        var RuleId: ResourceId
        var Name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var MetricName: MetricName?
            get() = definedExternally
            set(value) = definedExternally
        var MatchPredicates: Predicates
        var RateKey: String /* "IP" | String */
        var RateLimit: RateLimit
    }
    interface RegexMatchSet {
        var RegexMatchSetId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var RegexMatchTuples: RegexMatchTuples?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegexMatchSetSummary {
        var RegexMatchSetId: ResourceId
        var Name: ResourceName
    }
    interface RegexMatchSetUpdate {
        var Action: String /* "INSERT" | "DELETE" | String */
        var RegexMatchTuple: RegexMatchTuple
    }
    interface RegexMatchTuple {
        var FieldToMatch: FieldToMatch
        var TextTransformation: String /* "NONE" | "COMPRESS_WHITE_SPACE" | "HTML_ENTITY_DECODE" | "LOWERCASE" | "CMD_LINE" | "URL_DECODE" | String */
        var RegexPatternSetId: ResourceId
    }
    interface RegexPatternSet {
        var RegexPatternSetId: ResourceId
        var Name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var RegexPatternStrings: RegexPatternStrings
    }
    interface RegexPatternSetSummary {
        var RegexPatternSetId: ResourceId
        var Name: ResourceName
    }
    interface RegexPatternSetUpdate {
        var Action: String /* "INSERT" | "DELETE" | String */
        var RegexPatternString: RegexPatternString
    }
    interface Rule {
        var RuleId: ResourceId
        var Name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var MetricName: MetricName?
            get() = definedExternally
            set(value) = definedExternally
        var Predicates: Predicates
    }
    interface RuleGroup {
        var RuleGroupId: ResourceId
        var Name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var MetricName: MetricName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RuleGroupSummary {
        var RuleGroupId: ResourceId
        var Name: ResourceName
    }
    interface RuleGroupUpdate {
        var Action: String /* "INSERT" | "DELETE" | String */
        var ActivatedRule: ActivatedRule
    }
    interface RuleSummary {
        var RuleId: ResourceId
        var Name: ResourceName
    }
    interface RuleUpdate {
        var Action: String /* "INSERT" | "DELETE" | String */
        var Predicate: Predicate
    }
    interface SampledHTTPRequest {
        var Request: HTTPRequest
        var Weight: SampleWeight
        var Timestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Action: Action?
            get() = definedExternally
            set(value) = definedExternally
        var RuleWithinRuleGroup: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SizeConstraint {
        var FieldToMatch: FieldToMatch
        var TextTransformation: String /* "NONE" | "COMPRESS_WHITE_SPACE" | "HTML_ENTITY_DECODE" | "LOWERCASE" | "CMD_LINE" | "URL_DECODE" | String */
        var ComparisonOperator: String /* "EQ" | "NE" | "LE" | "LT" | "GE" | "GT" | String */
        var Size: Size
    }
    interface SizeConstraintSet {
        var SizeConstraintSetId: ResourceId
        var Name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var SizeConstraints: SizeConstraints
    }
    interface SizeConstraintSetSummary {
        var SizeConstraintSetId: ResourceId
        var Name: ResourceName
    }
    interface SizeConstraintSetUpdate {
        var Action: String /* "INSERT" | "DELETE" | String */
        var SizeConstraint: SizeConstraint
    }
    interface SqlInjectionMatchSet {
        var SqlInjectionMatchSetId: ResourceId
        var Name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var SqlInjectionMatchTuples: SqlInjectionMatchTuples
    }
    interface SqlInjectionMatchSetSummary {
        var SqlInjectionMatchSetId: ResourceId
        var Name: ResourceName
    }
    interface SqlInjectionMatchSetUpdate {
        var Action: String /* "INSERT" | "DELETE" | String */
        var SqlInjectionMatchTuple: SqlInjectionMatchTuple
    }
    interface SqlInjectionMatchTuple {
        var FieldToMatch: FieldToMatch
        var TextTransformation: String /* "NONE" | "COMPRESS_WHITE_SPACE" | "HTML_ENTITY_DECODE" | "LOWERCASE" | "CMD_LINE" | "URL_DECODE" | String */
    }
    interface SubscribedRuleGroupSummary {
        var RuleGroupId: ResourceId
        var Name: ResourceName
        var MetricName: MetricName
    }
    interface Tag {
        var Key: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var Value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagInfoForResource {
        var ResourceARN: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
        var TagList: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var ResourceARN: ResourceArn
        var Tags: TagList
    }
    interface TagResourceResponse
    interface TimeWindow {
        var StartTime: Timestamp
        var EndTime: Timestamp
    }
    interface UntagResourceRequest {
        var ResourceARN: ResourceArn
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateByteMatchSetRequest {
        var ByteMatchSetId: ResourceId
        var ChangeToken: ChangeToken
        var Updates: ByteMatchSetUpdates
    }
    interface UpdateByteMatchSetResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGeoMatchSetRequest {
        var GeoMatchSetId: ResourceId
        var ChangeToken: ChangeToken
        var Updates: GeoMatchSetUpdates
    }
    interface UpdateGeoMatchSetResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateIPSetRequest {
        var IPSetId: ResourceId
        var ChangeToken: ChangeToken
        var Updates: IPSetUpdates
    }
    interface UpdateIPSetResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRateBasedRuleRequest {
        var RuleId: ResourceId
        var ChangeToken: ChangeToken
        var Updates: RuleUpdates
        var RateLimit: RateLimit
    }
    interface UpdateRateBasedRuleResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRegexMatchSetRequest {
        var RegexMatchSetId: ResourceId
        var Updates: RegexMatchSetUpdates
        var ChangeToken: ChangeToken
    }
    interface UpdateRegexMatchSetResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRegexPatternSetRequest {
        var RegexPatternSetId: ResourceId
        var Updates: RegexPatternSetUpdates
        var ChangeToken: ChangeToken
    }
    interface UpdateRegexPatternSetResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRuleGroupRequest {
        var RuleGroupId: ResourceId
        var Updates: RuleGroupUpdates
        var ChangeToken: ChangeToken
    }
    interface UpdateRuleGroupResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRuleRequest {
        var RuleId: ResourceId
        var ChangeToken: ChangeToken
        var Updates: RuleUpdates
    }
    interface UpdateRuleResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSizeConstraintSetRequest {
        var SizeConstraintSetId: ResourceId
        var ChangeToken: ChangeToken
        var Updates: SizeConstraintSetUpdates
    }
    interface UpdateSizeConstraintSetResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSqlInjectionMatchSetRequest {
        var SqlInjectionMatchSetId: ResourceId
        var ChangeToken: ChangeToken
        var Updates: SqlInjectionMatchSetUpdates
    }
    interface UpdateSqlInjectionMatchSetResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateWebACLRequest {
        var WebACLId: ResourceId
        var ChangeToken: ChangeToken
        var Updates: WebACLUpdates?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultAction: WafAction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateWebACLResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateXssMatchSetRequest {
        var XssMatchSetId: ResourceId
        var ChangeToken: ChangeToken
        var Updates: XssMatchSetUpdates
    }
    interface UpdateXssMatchSetResponse {
        var ChangeToken: ChangeToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WafAction {
        var Type: String /* "BLOCK" | "ALLOW" | "COUNT" | String */
    }
    interface WafOverrideAction {
        var Type: String /* "NONE" | "COUNT" | String */
    }
    interface WebACL {
        var WebACLId: ResourceId
        var Name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var MetricName: MetricName?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultAction: WafAction
        var Rules: ActivatedRules
        var WebACLArn: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WebACLSummary {
        var WebACLId: ResourceId
        var Name: ResourceName
    }
    interface WebACLUpdate {
        var Action: String /* "INSERT" | "DELETE" | String */
        var ActivatedRule: ActivatedRule
    }
    interface XssMatchSet {
        var XssMatchSetId: ResourceId
        var Name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var XssMatchTuples: XssMatchTuples
    }
    interface XssMatchSetSummary {
        var XssMatchSetId: ResourceId
        var Name: ResourceName
    }
    interface XssMatchSetUpdate {
        var Action: String /* "INSERT" | "DELETE" | String */
        var XssMatchTuple: XssMatchTuple
    }
    interface XssMatchTuple {
        var FieldToMatch: FieldToMatch
        var TextTransformation: String /* "NONE" | "COMPRESS_WHITE_SPACE" | "HTML_ENTITY_DECODE" | "LOWERCASE" | "CMD_LINE" | "URL_DECODE" | String */
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2015-08-24" | "latest" | String */
    }
}