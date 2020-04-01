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
import WAFV2.ExcludedRule
import WAFV2.HTTPHeader
import WAFV2.IPSetSummary
import WAFV2.LoggingConfiguration
import WAFV2.ManagedRuleGroupSummary
import WAFV2.FieldToMatch
import WAFV2.RegexPatternSetSummary
import WAFV2.Regex
import WAFV2.RuleGroupSummary
import WAFV2.RuleSummary
import WAFV2.Rule
import WAFV2.SampledHTTPRequest
import WAFV2.Statement
import WAFV2.Tag
import WAFV2.TextTransformation
import WAFV2.WebACLSummary
import WAFV2.AssociateWebACLRequest
import WAFV2.AssociateWebACLResponse
import WAFV2.CheckCapacityRequest
import WAFV2.CheckCapacityResponse
import WAFV2.CreateIPSetRequest
import WAFV2.CreateIPSetResponse
import WAFV2.CreateRegexPatternSetRequest
import WAFV2.CreateRegexPatternSetResponse
import WAFV2.CreateRuleGroupRequest
import WAFV2.CreateRuleGroupResponse
import WAFV2.CreateWebACLRequest
import WAFV2.CreateWebACLResponse
import WAFV2.DeleteIPSetRequest
import WAFV2.DeleteIPSetResponse
import WAFV2.DeleteLoggingConfigurationRequest
import WAFV2.DeleteLoggingConfigurationResponse
import WAFV2.DeleteRegexPatternSetRequest
import WAFV2.DeleteRegexPatternSetResponse
import WAFV2.DeleteRuleGroupRequest
import WAFV2.DeleteRuleGroupResponse
import WAFV2.DeleteWebACLRequest
import WAFV2.DeleteWebACLResponse
import WAFV2.DescribeManagedRuleGroupRequest
import WAFV2.DescribeManagedRuleGroupResponse
import WAFV2.DisassociateWebACLRequest
import WAFV2.DisassociateWebACLResponse
import WAFV2.GetIPSetRequest
import WAFV2.GetIPSetResponse
import WAFV2.GetLoggingConfigurationRequest
import WAFV2.GetLoggingConfigurationResponse
import WAFV2.GetRateBasedStatementManagedKeysRequest
import WAFV2.GetRateBasedStatementManagedKeysResponse
import WAFV2.GetRegexPatternSetRequest
import WAFV2.GetRegexPatternSetResponse
import WAFV2.GetRuleGroupRequest
import WAFV2.GetRuleGroupResponse
import WAFV2.GetSampledRequestsRequest
import WAFV2.GetSampledRequestsResponse
import WAFV2.GetWebACLRequest
import WAFV2.GetWebACLResponse
import WAFV2.GetWebACLForResourceRequest
import WAFV2.GetWebACLForResourceResponse
import WAFV2.ListAvailableManagedRuleGroupsRequest
import WAFV2.ListAvailableManagedRuleGroupsResponse
import WAFV2.ListIPSetsRequest
import WAFV2.ListIPSetsResponse
import WAFV2.ListLoggingConfigurationsRequest
import WAFV2.ListLoggingConfigurationsResponse
import WAFV2.ListRegexPatternSetsRequest
import WAFV2.ListRegexPatternSetsResponse
import WAFV2.ListResourcesForWebACLRequest
import WAFV2.ListResourcesForWebACLResponse
import WAFV2.ListRuleGroupsRequest
import WAFV2.ListRuleGroupsResponse
import WAFV2.ListTagsForResourceRequest
import WAFV2.ListTagsForResourceResponse
import WAFV2.ListWebACLsRequest
import WAFV2.ListWebACLsResponse
import WAFV2.PutLoggingConfigurationRequest
import WAFV2.PutLoggingConfigurationResponse
import WAFV2.TagResourceRequest
import WAFV2.TagResourceResponse
import WAFV2.UntagResourceRequest
import WAFV2.UntagResourceResponse
import WAFV2.UpdateIPSetRequest
import WAFV2.UpdateIPSetResponse
import WAFV2.UpdateRegexPatternSetRequest
import WAFV2.UpdateRegexPatternSetResponse
import WAFV2.UpdateRuleGroupRequest
import WAFV2.UpdateRuleGroupResponse
import WAFV2.UpdateWebACLRequest
import WAFV2.UpdateWebACLResponse
import WAFV2.VisibilityConfig
import WAFV2.DefaultAction
import WAFV2.BlockAction
import WAFV2.AllowAction
import WAFV2.SingleHeader
import WAFV2.SingleQueryArgument
import WAFV2.AllQueryArguments
import WAFV2.UriPath
import WAFV2.QueryString
import WAFV2.Body
import WAFV2.Method
import WAFV2.IPSet
import WAFV2.RateBasedStatementManagedKeysIPSet
import WAFV2.RegexPatternSet
import WAFV2.RuleGroup
import WAFV2.TimeWindow
import WAFV2.WebACL
import WAFV2.TagInfoForResource
import WAFV2.CountAction
import WAFV2.NoneAction
import WAFV2.RuleAction
import WAFV2.OverrideAction
import WAFV2.HTTPRequest
import WAFV2.ByteMatchStatement
import WAFV2.SqliMatchStatement
import WAFV2.XssMatchStatement
import WAFV2.SizeConstraintStatement
import WAFV2.GeoMatchStatement
import WAFV2.RuleGroupReferenceStatement
import WAFV2.IPSetReferenceStatement
import WAFV2.RegexPatternSetReferenceStatement
import WAFV2.RateBasedStatement
import WAFV2.AndStatement
import WAFV2.OrStatement
import WAFV2.NotStatement
import WAFV2.ManagedRuleGroupStatement

typealias Action = String

typealias Boolean = Boolean

typealias CapacityUnit = Number

typealias ConsumedCapacity = Number

typealias Country = String

typealias CountryCodes = Array<String /* "AF" | "AX" | "AL" | "DZ" | "AS" | "AD" | "AO" | "AI" | "AQ" | "AG" | "AR" | "AM" | "AW" | "AU" | "AT" | "AZ" | "BS" | "BH" | "BD" | "BB" | "BY" | "BE" | "BZ" | "BJ" | "BM" | "BT" | "BO" | "BQ" | "BA" | "BW" | "BV" | "BR" | "IO" | "BN" | "BG" | "BF" | "BI" | "KH" | "CM" | "CA" | "CV" | "KY" | "CF" | "TD" | "CL" | "CN" | "CX" | "CC" | "CO" | "KM" | "CG" | "CD" | "CK" | "CR" | "CI" | "HR" | "CU" | "CW" | "CY" | "CZ" | "DK" | "DJ" | "DM" | "DO" | "EC" | "EG" | "SV" | "GQ" | "ER" | "EE" | "ET" | "FK" | "FO" | "FJ" | "FI" | "FR" | "GF" | "PF" | "TF" | "GA" | "GM" | "GE" | "DE" | "GH" | "GI" | "GR" | "GL" | "GD" | "GP" | "GU" | "GT" | "GG" | "GN" | "GW" | "GY" | "HT" | "HM" | "VA" | "HN" | "HK" | "HU" | "IS" | "IN" | "ID" | "IR" | "IQ" | "IE" | "IM" | "IL" | "IT" | "JM" | "JP" | "JE" | "JO" | "KZ" | "KE" | "KI" | "KP" | "KR" | "KW" | "KG" | "LA" | "LV" | "LB" | "LS" | "LR" | "LY" | "LI" | "LT" | "LU" | "MO" | "MK" | "MG" | "MW" | "MY" | "MV" | "ML" | "MT" | "MH" | "MQ" | "MR" | "MU" | "YT" | "MX" | "FM" | "MD" | "MC" | "MN" | "ME" | "MS" | "MA" | "MZ" | "MM" | "NA" | "NR" | "NP" | "NL" | "NC" | "NZ" | "NI" | "NE" | "NG" | "NU" | "NF" | "MP" | "NO" | "OM" | "PK" | "PW" | "PS" | "PA" | "PG" | "PY" | "PE" | "PH" | "PN" | "PL" | "PT" | "PR" | "QA" | "RE" | "RO" | "RU" | "RW" | "BL" | "SH" | "KN" | "LC" | "MF" | "PM" | "VC" | "WS" | "SM" | "ST" | "SA" | "SN" | "RS" | "SC" | "SL" | "SG" | "SX" | "SK" | "SI" | "SB" | "SO" | "ZA" | "GS" | "SS" | "ES" | "LK" | "SD" | "SR" | "SJ" | "SZ" | "SE" | "CH" | "SY" | "TW" | "TJ" | "TZ" | "TH" | "TL" | "TG" | "TK" | "TO" | "TT" | "TN" | "TR" | "TM" | "TC" | "TV" | "UG" | "UA" | "AE" | "GB" | "US" | "UM" | "UY" | "UZ" | "VU" | "VE" | "VN" | "VG" | "VI" | "WF" | "EH" | "YE" | "ZM" | "ZW" | String */>

typealias EntityDescription = String

typealias EntityId = String

typealias EntityName = String

typealias ExcludedRules = Array<ExcludedRule>

typealias FieldToMatchData = String

typealias HTTPHeaders = Array<HTTPHeader>

typealias HTTPMethod = String

typealias HTTPVersion = String

typealias HeaderName = String

typealias HeaderValue = String

typealias IPAddress = String

typealias IPAddresses = Array<IPAddress>

typealias IPSetSummaries = Array<IPSetSummary>

typealias IPString = String

typealias ListMaxItems = Number

typealias LockToken = String

typealias LogDestinationConfigs = Array<ResourceArn>

typealias LoggingConfigurations = Array<LoggingConfiguration>

typealias ManagedRuleGroupSummaries = Array<ManagedRuleGroupSummary>

typealias MetricName = String

typealias NextMarker = String

typealias PaginationLimit = Number

typealias PopulationSize = Number

typealias RateLimit = Number

typealias RedactedFields = Array<FieldToMatch>

typealias RegexPatternSetSummaries = Array<RegexPatternSetSummary>

typealias RegexPatternString = String

typealias RegularExpressionList = Array<Regex>

typealias ResourceArn = String

typealias ResourceArns = Array<ResourceArn>

typealias RuleGroupSummaries = Array<RuleGroupSummary>

typealias RulePriority = Number

typealias RuleSummaries = Array<RuleSummary>

typealias Rules = Array<Rule>

typealias SampleWeight = Number

typealias SampledHTTPRequests = Array<SampledHTTPRequest>

typealias Size = Number

typealias Statements = Array<Statement>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TextTransformationPriority = Number

typealias TextTransformations = Array<TextTransformation>

typealias Timestamp = Date

typealias URIString = String

typealias VendorName = String

typealias WebACLSummaries = Array<WebACLSummary>

@JsModule("aws-sdk")
external open class WAFV2(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & WAFV2.Types.ClientConfiguration */
    open fun associateWebACL(params: AssociateWebACLRequest, callback: (err: AWSError, data: AssociateWebACLResponse) -> Unit = definedExternally): Request<AssociateWebACLResponse, AWSError>
    open fun associateWebACL(callback: (err: AWSError, data: AssociateWebACLResponse) -> Unit = definedExternally): Request<AssociateWebACLResponse, AWSError>
    open fun checkCapacity(params: CheckCapacityRequest, callback: (err: AWSError, data: CheckCapacityResponse) -> Unit = definedExternally): Request<CheckCapacityResponse, AWSError>
    open fun checkCapacity(callback: (err: AWSError, data: CheckCapacityResponse) -> Unit = definedExternally): Request<CheckCapacityResponse, AWSError>
    open fun createIPSet(params: CreateIPSetRequest, callback: (err: AWSError, data: CreateIPSetResponse) -> Unit = definedExternally): Request<CreateIPSetResponse, AWSError>
    open fun createIPSet(callback: (err: AWSError, data: CreateIPSetResponse) -> Unit = definedExternally): Request<CreateIPSetResponse, AWSError>
    open fun createRegexPatternSet(params: CreateRegexPatternSetRequest, callback: (err: AWSError, data: CreateRegexPatternSetResponse) -> Unit = definedExternally): Request<CreateRegexPatternSetResponse, AWSError>
    open fun createRegexPatternSet(callback: (err: AWSError, data: CreateRegexPatternSetResponse) -> Unit = definedExternally): Request<CreateRegexPatternSetResponse, AWSError>
    open fun createRuleGroup(params: CreateRuleGroupRequest, callback: (err: AWSError, data: CreateRuleGroupResponse) -> Unit = definedExternally): Request<CreateRuleGroupResponse, AWSError>
    open fun createRuleGroup(callback: (err: AWSError, data: CreateRuleGroupResponse) -> Unit = definedExternally): Request<CreateRuleGroupResponse, AWSError>
    open fun createWebACL(params: CreateWebACLRequest, callback: (err: AWSError, data: CreateWebACLResponse) -> Unit = definedExternally): Request<CreateWebACLResponse, AWSError>
    open fun createWebACL(callback: (err: AWSError, data: CreateWebACLResponse) -> Unit = definedExternally): Request<CreateWebACLResponse, AWSError>
    open fun deleteIPSet(params: DeleteIPSetRequest, callback: (err: AWSError, data: DeleteIPSetResponse) -> Unit = definedExternally): Request<DeleteIPSetResponse, AWSError>
    open fun deleteIPSet(callback: (err: AWSError, data: DeleteIPSetResponse) -> Unit = definedExternally): Request<DeleteIPSetResponse, AWSError>
    open fun deleteLoggingConfiguration(params: DeleteLoggingConfigurationRequest, callback: (err: AWSError, data: DeleteLoggingConfigurationResponse) -> Unit = definedExternally): Request<DeleteLoggingConfigurationResponse, AWSError>
    open fun deleteLoggingConfiguration(callback: (err: AWSError, data: DeleteLoggingConfigurationResponse) -> Unit = definedExternally): Request<DeleteLoggingConfigurationResponse, AWSError>
    open fun deleteRegexPatternSet(params: DeleteRegexPatternSetRequest, callback: (err: AWSError, data: DeleteRegexPatternSetResponse) -> Unit = definedExternally): Request<DeleteRegexPatternSetResponse, AWSError>
    open fun deleteRegexPatternSet(callback: (err: AWSError, data: DeleteRegexPatternSetResponse) -> Unit = definedExternally): Request<DeleteRegexPatternSetResponse, AWSError>
    open fun deleteRuleGroup(params: DeleteRuleGroupRequest, callback: (err: AWSError, data: DeleteRuleGroupResponse) -> Unit = definedExternally): Request<DeleteRuleGroupResponse, AWSError>
    open fun deleteRuleGroup(callback: (err: AWSError, data: DeleteRuleGroupResponse) -> Unit = definedExternally): Request<DeleteRuleGroupResponse, AWSError>
    open fun deleteWebACL(params: DeleteWebACLRequest, callback: (err: AWSError, data: DeleteWebACLResponse) -> Unit = definedExternally): Request<DeleteWebACLResponse, AWSError>
    open fun deleteWebACL(callback: (err: AWSError, data: DeleteWebACLResponse) -> Unit = definedExternally): Request<DeleteWebACLResponse, AWSError>
    open fun describeManagedRuleGroup(params: DescribeManagedRuleGroupRequest, callback: (err: AWSError, data: DescribeManagedRuleGroupResponse) -> Unit = definedExternally): Request<DescribeManagedRuleGroupResponse, AWSError>
    open fun describeManagedRuleGroup(callback: (err: AWSError, data: DescribeManagedRuleGroupResponse) -> Unit = definedExternally): Request<DescribeManagedRuleGroupResponse, AWSError>
    open fun disassociateWebACL(params: DisassociateWebACLRequest, callback: (err: AWSError, data: DisassociateWebACLResponse) -> Unit = definedExternally): Request<DisassociateWebACLResponse, AWSError>
    open fun disassociateWebACL(callback: (err: AWSError, data: DisassociateWebACLResponse) -> Unit = definedExternally): Request<DisassociateWebACLResponse, AWSError>
    open fun getIPSet(params: GetIPSetRequest, callback: (err: AWSError, data: GetIPSetResponse) -> Unit = definedExternally): Request<GetIPSetResponse, AWSError>
    open fun getIPSet(callback: (err: AWSError, data: GetIPSetResponse) -> Unit = definedExternally): Request<GetIPSetResponse, AWSError>
    open fun getLoggingConfiguration(params: GetLoggingConfigurationRequest, callback: (err: AWSError, data: GetLoggingConfigurationResponse) -> Unit = definedExternally): Request<GetLoggingConfigurationResponse, AWSError>
    open fun getLoggingConfiguration(callback: (err: AWSError, data: GetLoggingConfigurationResponse) -> Unit = definedExternally): Request<GetLoggingConfigurationResponse, AWSError>
    open fun getRateBasedStatementManagedKeys(params: GetRateBasedStatementManagedKeysRequest, callback: (err: AWSError, data: GetRateBasedStatementManagedKeysResponse) -> Unit = definedExternally): Request<GetRateBasedStatementManagedKeysResponse, AWSError>
    open fun getRateBasedStatementManagedKeys(callback: (err: AWSError, data: GetRateBasedStatementManagedKeysResponse) -> Unit = definedExternally): Request<GetRateBasedStatementManagedKeysResponse, AWSError>
    open fun getRegexPatternSet(params: GetRegexPatternSetRequest, callback: (err: AWSError, data: GetRegexPatternSetResponse) -> Unit = definedExternally): Request<GetRegexPatternSetResponse, AWSError>
    open fun getRegexPatternSet(callback: (err: AWSError, data: GetRegexPatternSetResponse) -> Unit = definedExternally): Request<GetRegexPatternSetResponse, AWSError>
    open fun getRuleGroup(params: GetRuleGroupRequest, callback: (err: AWSError, data: GetRuleGroupResponse) -> Unit = definedExternally): Request<GetRuleGroupResponse, AWSError>
    open fun getRuleGroup(callback: (err: AWSError, data: GetRuleGroupResponse) -> Unit = definedExternally): Request<GetRuleGroupResponse, AWSError>
    open fun getSampledRequests(params: GetSampledRequestsRequest, callback: (err: AWSError, data: GetSampledRequestsResponse) -> Unit = definedExternally): Request<GetSampledRequestsResponse, AWSError>
    open fun getSampledRequests(callback: (err: AWSError, data: GetSampledRequestsResponse) -> Unit = definedExternally): Request<GetSampledRequestsResponse, AWSError>
    open fun getWebACL(params: GetWebACLRequest, callback: (err: AWSError, data: GetWebACLResponse) -> Unit = definedExternally): Request<GetWebACLResponse, AWSError>
    open fun getWebACL(callback: (err: AWSError, data: GetWebACLResponse) -> Unit = definedExternally): Request<GetWebACLResponse, AWSError>
    open fun getWebACLForResource(params: GetWebACLForResourceRequest, callback: (err: AWSError, data: GetWebACLForResourceResponse) -> Unit = definedExternally): Request<GetWebACLForResourceResponse, AWSError>
    open fun getWebACLForResource(callback: (err: AWSError, data: GetWebACLForResourceResponse) -> Unit = definedExternally): Request<GetWebACLForResourceResponse, AWSError>
    open fun listAvailableManagedRuleGroups(params: ListAvailableManagedRuleGroupsRequest, callback: (err: AWSError, data: ListAvailableManagedRuleGroupsResponse) -> Unit = definedExternally): Request<ListAvailableManagedRuleGroupsResponse, AWSError>
    open fun listAvailableManagedRuleGroups(callback: (err: AWSError, data: ListAvailableManagedRuleGroupsResponse) -> Unit = definedExternally): Request<ListAvailableManagedRuleGroupsResponse, AWSError>
    open fun listIPSets(params: ListIPSetsRequest, callback: (err: AWSError, data: ListIPSetsResponse) -> Unit = definedExternally): Request<ListIPSetsResponse, AWSError>
    open fun listIPSets(callback: (err: AWSError, data: ListIPSetsResponse) -> Unit = definedExternally): Request<ListIPSetsResponse, AWSError>
    open fun listLoggingConfigurations(params: ListLoggingConfigurationsRequest, callback: (err: AWSError, data: ListLoggingConfigurationsResponse) -> Unit = definedExternally): Request<ListLoggingConfigurationsResponse, AWSError>
    open fun listLoggingConfigurations(callback: (err: AWSError, data: ListLoggingConfigurationsResponse) -> Unit = definedExternally): Request<ListLoggingConfigurationsResponse, AWSError>
    open fun listRegexPatternSets(params: ListRegexPatternSetsRequest, callback: (err: AWSError, data: ListRegexPatternSetsResponse) -> Unit = definedExternally): Request<ListRegexPatternSetsResponse, AWSError>
    open fun listRegexPatternSets(callback: (err: AWSError, data: ListRegexPatternSetsResponse) -> Unit = definedExternally): Request<ListRegexPatternSetsResponse, AWSError>
    open fun listResourcesForWebACL(params: ListResourcesForWebACLRequest, callback: (err: AWSError, data: ListResourcesForWebACLResponse) -> Unit = definedExternally): Request<ListResourcesForWebACLResponse, AWSError>
    open fun listResourcesForWebACL(callback: (err: AWSError, data: ListResourcesForWebACLResponse) -> Unit = definedExternally): Request<ListResourcesForWebACLResponse, AWSError>
    open fun listRuleGroups(params: ListRuleGroupsRequest, callback: (err: AWSError, data: ListRuleGroupsResponse) -> Unit = definedExternally): Request<ListRuleGroupsResponse, AWSError>
    open fun listRuleGroups(callback: (err: AWSError, data: ListRuleGroupsResponse) -> Unit = definedExternally): Request<ListRuleGroupsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listWebACLs(params: ListWebACLsRequest, callback: (err: AWSError, data: ListWebACLsResponse) -> Unit = definedExternally): Request<ListWebACLsResponse, AWSError>
    open fun listWebACLs(callback: (err: AWSError, data: ListWebACLsResponse) -> Unit = definedExternally): Request<ListWebACLsResponse, AWSError>
    open fun putLoggingConfiguration(params: PutLoggingConfigurationRequest, callback: (err: AWSError, data: PutLoggingConfigurationResponse) -> Unit = definedExternally): Request<PutLoggingConfigurationResponse, AWSError>
    open fun putLoggingConfiguration(callback: (err: AWSError, data: PutLoggingConfigurationResponse) -> Unit = definedExternally): Request<PutLoggingConfigurationResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateIPSet(params: UpdateIPSetRequest, callback: (err: AWSError, data: UpdateIPSetResponse) -> Unit = definedExternally): Request<UpdateIPSetResponse, AWSError>
    open fun updateIPSet(callback: (err: AWSError, data: UpdateIPSetResponse) -> Unit = definedExternally): Request<UpdateIPSetResponse, AWSError>
    open fun updateRegexPatternSet(params: UpdateRegexPatternSetRequest, callback: (err: AWSError, data: UpdateRegexPatternSetResponse) -> Unit = definedExternally): Request<UpdateRegexPatternSetResponse, AWSError>
    open fun updateRegexPatternSet(callback: (err: AWSError, data: UpdateRegexPatternSetResponse) -> Unit = definedExternally): Request<UpdateRegexPatternSetResponse, AWSError>
    open fun updateRuleGroup(params: UpdateRuleGroupRequest, callback: (err: AWSError, data: UpdateRuleGroupResponse) -> Unit = definedExternally): Request<UpdateRuleGroupResponse, AWSError>
    open fun updateRuleGroup(callback: (err: AWSError, data: UpdateRuleGroupResponse) -> Unit = definedExternally): Request<UpdateRuleGroupResponse, AWSError>
    open fun updateWebACL(params: UpdateWebACLRequest, callback: (err: AWSError, data: UpdateWebACLResponse) -> Unit = definedExternally): Request<UpdateWebACLResponse, AWSError>
    open fun updateWebACL(callback: (err: AWSError, data: UpdateWebACLResponse) -> Unit = definedExternally): Request<UpdateWebACLResponse, AWSError>
    interface AllQueryArguments
    interface AllowAction
    interface AndStatement {
        var Statements: Statements
    }
    interface AssociateWebACLRequest {
        var WebACLArn: ResourceArn
        var ResourceArn: ResourceArn
    }
    interface AssociateWebACLResponse
    interface BlockAction
    interface Body
    interface ByteMatchStatement {
        var SearchString: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var FieldToMatch: FieldToMatch
        var TextTransformations: TextTransformations
        var PositionalConstraint: String /* "EXACTLY" | "STARTS_WITH" | "ENDS_WITH" | "CONTAINS" | "CONTAINS_WORD" | String */
    }
    interface CheckCapacityRequest {
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
        var Rules: Rules
    }
    interface CheckCapacityResponse {
        var Capacity: ConsumedCapacity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CountAction
    interface CreateIPSetRequest {
        var Name: EntityName
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
        var Description: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var IPAddressVersion: String /* "IPV4" | "IPV6" | String */
        var Addresses: IPAddresses
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateIPSetResponse {
        var Summary: IPSetSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRegexPatternSetRequest {
        var Name: EntityName
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
        var Description: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var RegularExpressionList: RegularExpressionList
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRegexPatternSetResponse {
        var Summary: RegexPatternSetSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRuleGroupRequest {
        var Name: EntityName
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
        var Capacity: CapacityUnit
        var Description: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Rules: Rules?
            get() = definedExternally
            set(value) = definedExternally
        var VisibilityConfig: VisibilityConfig
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRuleGroupResponse {
        var Summary: RuleGroupSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateWebACLRequest {
        var Name: EntityName
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
        var DefaultAction: DefaultAction
        var Description: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Rules: Rules?
            get() = definedExternally
            set(value) = definedExternally
        var VisibilityConfig: VisibilityConfig
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateWebACLResponse {
        var Summary: WebACLSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DefaultAction {
        var Block: BlockAction?
            get() = definedExternally
            set(value) = definedExternally
        var Allow: AllowAction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteIPSetRequest {
        var Name: EntityName
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
        var Id: EntityId
        var LockToken: LockToken
    }
    interface DeleteIPSetResponse
    interface DeleteLoggingConfigurationRequest {
        var ResourceArn: ResourceArn
    }
    interface DeleteLoggingConfigurationResponse
    interface DeleteRegexPatternSetRequest {
        var Name: EntityName
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
        var Id: EntityId
        var LockToken: LockToken
    }
    interface DeleteRegexPatternSetResponse
    interface DeleteRuleGroupRequest {
        var Name: EntityName
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
        var Id: EntityId
        var LockToken: LockToken
    }
    interface DeleteRuleGroupResponse
    interface DeleteWebACLRequest {
        var Name: EntityName
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
        var Id: EntityId
        var LockToken: LockToken
    }
    interface DeleteWebACLResponse
    interface DescribeManagedRuleGroupRequest {
        var VendorName: VendorName
        var Name: EntityName
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
    }
    interface DescribeManagedRuleGroupResponse {
        var Capacity: CapacityUnit?
            get() = definedExternally
            set(value) = definedExternally
        var Rules: RuleSummaries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateWebACLRequest {
        var ResourceArn: ResourceArn
    }
    interface DisassociateWebACLResponse
    interface ExcludedRule {
        var Name: EntityName
    }
    interface FieldToMatch {
        var SingleHeader: SingleHeader?
            get() = definedExternally
            set(value) = definedExternally
        var SingleQueryArgument: SingleQueryArgument?
            get() = definedExternally
            set(value) = definedExternally
        var AllQueryArguments: AllQueryArguments?
            get() = definedExternally
            set(value) = definedExternally
        var UriPath: UriPath?
            get() = definedExternally
            set(value) = definedExternally
        var QueryString: QueryString?
            get() = definedExternally
            set(value) = definedExternally
        var Body: Body?
            get() = definedExternally
            set(value) = definedExternally
        var Method: Method?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GeoMatchStatement {
        var CountryCodes: CountryCodes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIPSetRequest {
        var Name: EntityName
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
        var Id: EntityId
    }
    interface GetIPSetResponse {
        var IPSet: IPSet?
            get() = definedExternally
            set(value) = definedExternally
        var LockToken: LockToken?
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
    interface GetRateBasedStatementManagedKeysRequest {
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
        var WebACLName: EntityName
        var WebACLId: EntityId
        var RuleName: EntityName
    }
    interface GetRateBasedStatementManagedKeysResponse {
        var ManagedKeysIPV4: RateBasedStatementManagedKeysIPSet?
            get() = definedExternally
            set(value) = definedExternally
        var ManagedKeysIPV6: RateBasedStatementManagedKeysIPSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRegexPatternSetRequest {
        var Name: EntityName
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
        var Id: EntityId
    }
    interface GetRegexPatternSetResponse {
        var RegexPatternSet: RegexPatternSet?
            get() = definedExternally
            set(value) = definedExternally
        var LockToken: LockToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRuleGroupRequest {
        var Name: EntityName
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
        var Id: EntityId
    }
    interface GetRuleGroupResponse {
        var RuleGroup: RuleGroup?
            get() = definedExternally
            set(value) = definedExternally
        var LockToken: LockToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSampledRequestsRequest {
        var WebAclArn: ResourceArn
        var RuleMetricName: MetricName
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
        var TimeWindow: TimeWindow
        var MaxItems: ListMaxItems
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
    interface GetWebACLForResourceRequest {
        var ResourceArn: ResourceArn
    }
    interface GetWebACLForResourceResponse {
        var WebACL: WebACL?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetWebACLRequest {
        var Name: EntityName
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
        var Id: EntityId
    }
    interface GetWebACLResponse {
        var WebACL: WebACL?
            get() = definedExternally
            set(value) = definedExternally
        var LockToken: LockToken?
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
        var Name: EntityName
        var Id: EntityId
        var ARN: ResourceArn
        var Description: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var IPAddressVersion: String /* "IPV4" | "IPV6" | String */
        var Addresses: IPAddresses
    }
    interface IPSetReferenceStatement {
        var ARN: ResourceArn
    }
    interface IPSetSummary {
        var Name: EntityName?
            get() = definedExternally
            set(value) = definedExternally
        var Id: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var Description: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var LockToken: LockToken?
            get() = definedExternally
            set(value) = definedExternally
        var ARN: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAvailableManagedRuleGroupsRequest {
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PaginationLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAvailableManagedRuleGroupsResponse {
        var NextMarker: NextMarker?
            get() = definedExternally
            set(value) = definedExternally
        var ManagedRuleGroups: ManagedRuleGroupSummaries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIPSetsRequest {
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
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
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
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
    interface ListRegexPatternSetsRequest {
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
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
    interface ListResourcesForWebACLRequest {
        var WebACLArn: ResourceArn
        var ResourceType: String /* "APPLICATION_LOAD_BALANCER" | "API_GATEWAY" | String */
    }
    interface ListResourcesForWebACLResponse {
        var ResourceArns: ResourceArns?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRuleGroupsRequest {
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
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
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
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
    interface LoggingConfiguration {
        var ResourceArn: ResourceArn
        var LogDestinationConfigs: LogDestinationConfigs
        var RedactedFields: RedactedFields?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ManagedRuleGroupStatement {
        var VendorName: VendorName
        var Name: EntityName
        var ExcludedRules: ExcludedRules?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ManagedRuleGroupSummary {
        var VendorName: VendorName?
            get() = definedExternally
            set(value) = definedExternally
        var Name: EntityName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Method
    interface NoneAction
    interface NotStatement {
        var Statement: Statement
    }
    interface OrStatement {
        var Statements: Statements
    }
    interface OverrideAction {
        var Count: CountAction?
            get() = definedExternally
            set(value) = definedExternally
        var None: NoneAction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutLoggingConfigurationRequest {
        var LoggingConfiguration: LoggingConfiguration
    }
    interface PutLoggingConfigurationResponse {
        var LoggingConfiguration: LoggingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface QueryString
    interface RateBasedStatement {
        var Limit: RateLimit
        var AggregateKeyType: String /* "IP" | String */
        var ScopeDownStatement: Statement?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RateBasedStatementManagedKeysIPSet {
        var IPAddressVersion: String /* "IPV4" | "IPV6" | String */
        var Addresses: IPAddresses?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Regex {
        var RegexString: RegexPatternString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegexPatternSet {
        var Name: EntityName?
            get() = definedExternally
            set(value) = definedExternally
        var Id: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var ARN: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
        var Description: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var RegularExpressionList: RegularExpressionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegexPatternSetReferenceStatement {
        var ARN: ResourceArn
        var FieldToMatch: FieldToMatch
        var TextTransformations: TextTransformations
    }
    interface RegexPatternSetSummary {
        var Name: EntityName?
            get() = definedExternally
            set(value) = definedExternally
        var Id: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var Description: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var LockToken: LockToken?
            get() = definedExternally
            set(value) = definedExternally
        var ARN: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Rule {
        var Name: EntityName
        var Priority: RulePriority
        var Statement: Statement
        var Action: RuleAction?
            get() = definedExternally
            set(value) = definedExternally
        var OverrideAction: OverrideAction?
            get() = definedExternally
            set(value) = definedExternally
        var VisibilityConfig: VisibilityConfig
    }
    interface RuleAction {
        var Block: BlockAction?
            get() = definedExternally
            set(value) = definedExternally
        var Allow: AllowAction?
            get() = definedExternally
            set(value) = definedExternally
        var Count: CountAction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RuleGroup {
        var Name: EntityName
        var Id: EntityId
        var Capacity: CapacityUnit
        var ARN: ResourceArn
        var Description: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Rules: Rules?
            get() = definedExternally
            set(value) = definedExternally
        var VisibilityConfig: VisibilityConfig
    }
    interface RuleGroupReferenceStatement {
        var ARN: ResourceArn
        var ExcludedRules: ExcludedRules?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RuleGroupSummary {
        var Name: EntityName?
            get() = definedExternally
            set(value) = definedExternally
        var Id: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var Description: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var LockToken: LockToken?
            get() = definedExternally
            set(value) = definedExternally
        var ARN: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RuleSummary {
        var Name: EntityName?
            get() = definedExternally
            set(value) = definedExternally
        var Action: RuleAction?
            get() = definedExternally
            set(value) = definedExternally
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
        var RuleNameWithinRuleGroup: EntityName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SingleHeader {
        var Name: FieldToMatchData
    }
    interface SingleQueryArgument {
        var Name: FieldToMatchData
    }
    interface SizeConstraintStatement {
        var FieldToMatch: FieldToMatch
        var ComparisonOperator: String /* "EQ" | "NE" | "LE" | "LT" | "GE" | "GT" | String */
        var Size: Size
        var TextTransformations: TextTransformations
    }
    interface SqliMatchStatement {
        var FieldToMatch: FieldToMatch
        var TextTransformations: TextTransformations
    }
    interface Statement {
        var ByteMatchStatement: ByteMatchStatement?
            get() = definedExternally
            set(value) = definedExternally
        var SqliMatchStatement: SqliMatchStatement?
            get() = definedExternally
            set(value) = definedExternally
        var XssMatchStatement: XssMatchStatement?
            get() = definedExternally
            set(value) = definedExternally
        var SizeConstraintStatement: SizeConstraintStatement?
            get() = definedExternally
            set(value) = definedExternally
        var GeoMatchStatement: GeoMatchStatement?
            get() = definedExternally
            set(value) = definedExternally
        var RuleGroupReferenceStatement: RuleGroupReferenceStatement?
            get() = definedExternally
            set(value) = definedExternally
        var IPSetReferenceStatement: IPSetReferenceStatement?
            get() = definedExternally
            set(value) = definedExternally
        var RegexPatternSetReferenceStatement: RegexPatternSetReferenceStatement?
            get() = definedExternally
            set(value) = definedExternally
        var RateBasedStatement: RateBasedStatement?
            get() = definedExternally
            set(value) = definedExternally
        var AndStatement: AndStatement?
            get() = definedExternally
            set(value) = definedExternally
        var OrStatement: OrStatement?
            get() = definedExternally
            set(value) = definedExternally
        var NotStatement: NotStatement?
            get() = definedExternally
            set(value) = definedExternally
        var ManagedRuleGroupStatement: ManagedRuleGroupStatement?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
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
    interface TextTransformation {
        var Priority: TextTransformationPriority
        var Type: String /* "NONE" | "COMPRESS_WHITE_SPACE" | "HTML_ENTITY_DECODE" | "LOWERCASE" | "CMD_LINE" | "URL_DECODE" | String */
    }
    interface TimeWindow {
        var StartTime: Timestamp
        var EndTime: Timestamp
    }
    interface UntagResourceRequest {
        var ResourceARN: ResourceArn
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateIPSetRequest {
        var Name: EntityName
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
        var Id: EntityId
        var Description: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Addresses: IPAddresses
        var LockToken: LockToken
    }
    interface UpdateIPSetResponse {
        var NextLockToken: LockToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRegexPatternSetRequest {
        var Name: EntityName
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
        var Id: EntityId
        var Description: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var RegularExpressionList: RegularExpressionList
        var LockToken: LockToken
    }
    interface UpdateRegexPatternSetResponse {
        var NextLockToken: LockToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRuleGroupRequest {
        var Name: EntityName
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
        var Id: EntityId
        var Description: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Rules: Rules?
            get() = definedExternally
            set(value) = definedExternally
        var VisibilityConfig: VisibilityConfig
        var LockToken: LockToken
    }
    interface UpdateRuleGroupResponse {
        var NextLockToken: LockToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateWebACLRequest {
        var Name: EntityName
        var Scope: String /* "CLOUDFRONT" | "REGIONAL" | String */
        var Id: EntityId
        var DefaultAction: DefaultAction
        var Description: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Rules: Rules?
            get() = definedExternally
            set(value) = definedExternally
        var VisibilityConfig: VisibilityConfig
        var LockToken: LockToken
    }
    interface UpdateWebACLResponse {
        var NextLockToken: LockToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UriPath
    interface VisibilityConfig {
        var SampledRequestsEnabled: Boolean
        var CloudWatchMetricsEnabled: Boolean
        var MetricName: MetricName
    }
    interface WebACL {
        var Name: EntityName
        var Id: EntityId
        var ARN: ResourceArn
        var DefaultAction: DefaultAction
        var Description: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Rules: Rules?
            get() = definedExternally
            set(value) = definedExternally
        var VisibilityConfig: VisibilityConfig
        var Capacity: ConsumedCapacity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WebACLSummary {
        var Name: EntityName?
            get() = definedExternally
            set(value) = definedExternally
        var Id: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var Description: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var LockToken: LockToken?
            get() = definedExternally
            set(value) = definedExternally
        var ARN: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface XssMatchStatement {
        var FieldToMatch: FieldToMatch
        var TextTransformations: TextTransformations
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-07-29" | "latest" | String */
    }
}