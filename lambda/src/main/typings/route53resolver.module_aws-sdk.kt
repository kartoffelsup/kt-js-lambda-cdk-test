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
import Route53Resolver.Filter
import Route53Resolver.IpAddressRequest
import Route53Resolver.IpAddressResponse
import Route53Resolver.ResolverEndpoint
import Route53Resolver.ResolverRuleAssociation
import Route53Resolver.ResolverRule
import Route53Resolver.Tag
import Route53Resolver.TargetAddress
import Route53Resolver.AssociateResolverEndpointIpAddressRequest
import Route53Resolver.AssociateResolverEndpointIpAddressResponse
import Route53Resolver.AssociateResolverRuleRequest
import Route53Resolver.AssociateResolverRuleResponse
import Route53Resolver.CreateResolverEndpointRequest
import Route53Resolver.CreateResolverEndpointResponse
import Route53Resolver.CreateResolverRuleRequest
import Route53Resolver.CreateResolverRuleResponse
import Route53Resolver.DeleteResolverEndpointRequest
import Route53Resolver.DeleteResolverEndpointResponse
import Route53Resolver.DeleteResolverRuleRequest
import Route53Resolver.DeleteResolverRuleResponse
import Route53Resolver.DisassociateResolverEndpointIpAddressRequest
import Route53Resolver.DisassociateResolverEndpointIpAddressResponse
import Route53Resolver.DisassociateResolverRuleRequest
import Route53Resolver.DisassociateResolverRuleResponse
import Route53Resolver.GetResolverEndpointRequest
import Route53Resolver.GetResolverEndpointResponse
import Route53Resolver.GetResolverRuleRequest
import Route53Resolver.GetResolverRuleResponse
import Route53Resolver.GetResolverRuleAssociationRequest
import Route53Resolver.GetResolverRuleAssociationResponse
import Route53Resolver.GetResolverRulePolicyRequest
import Route53Resolver.GetResolverRulePolicyResponse
import Route53Resolver.ListResolverEndpointIpAddressesRequest
import Route53Resolver.ListResolverEndpointIpAddressesResponse
import Route53Resolver.ListResolverEndpointsRequest
import Route53Resolver.ListResolverEndpointsResponse
import Route53Resolver.ListResolverRuleAssociationsRequest
import Route53Resolver.ListResolverRuleAssociationsResponse
import Route53Resolver.ListResolverRulesRequest
import Route53Resolver.ListResolverRulesResponse
import Route53Resolver.ListTagsForResourceRequest
import Route53Resolver.ListTagsForResourceResponse
import Route53Resolver.PutResolverRulePolicyRequest
import Route53Resolver.PutResolverRulePolicyResponse
import Route53Resolver.TagResourceRequest
import Route53Resolver.TagResourceResponse
import Route53Resolver.UntagResourceRequest
import Route53Resolver.UntagResourceResponse
import Route53Resolver.UpdateResolverEndpointRequest
import Route53Resolver.UpdateResolverEndpointResponse
import Route53Resolver.UpdateResolverRuleRequest
import Route53Resolver.UpdateResolverRuleResponse
import Route53Resolver.IpAddressUpdate
import Route53Resolver.ResolverRuleConfig

typealias AccountId = String

typealias Arn = String

typealias Boolean = Boolean

typealias CreatorRequestId = String

typealias DomainName = String

typealias FilterName = String

typealias FilterValue = String

typealias FilterValues = Array<FilterValue>

typealias Filters = Array<Filter>

typealias Ip = String

typealias IpAddressCount = Number

typealias IpAddressesRequest = Array<IpAddressRequest>

typealias IpAddressesResponse = Array<IpAddressResponse>

typealias MaxResults = Number

typealias Name = String

typealias NextToken = String

typealias Port = Number

typealias ResolverEndpoints = Array<ResolverEndpoint>

typealias ResolverRuleAssociations = Array<ResolverRuleAssociation>

typealias ResolverRulePolicy = String

typealias ResolverRules = Array<ResolverRule>

typealias ResourceId = String

typealias Rfc3339TimeString = String

typealias SecurityGroupIds = Array<ResourceId>

typealias StatusMessage = String

typealias SubnetId = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TargetList = Array<TargetAddress>

@JsModule("aws-sdk")
external open class Route53Resolver(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Route53Resolver.Types.ClientConfiguration */
    open fun associateResolverEndpointIpAddress(params: AssociateResolverEndpointIpAddressRequest, callback: (err: AWSError, data: AssociateResolverEndpointIpAddressResponse) -> Unit = definedExternally): Request<AssociateResolverEndpointIpAddressResponse, AWSError>
    open fun associateResolverEndpointIpAddress(callback: (err: AWSError, data: AssociateResolverEndpointIpAddressResponse) -> Unit = definedExternally): Request<AssociateResolverEndpointIpAddressResponse, AWSError>
    open fun associateResolverRule(params: AssociateResolverRuleRequest, callback: (err: AWSError, data: AssociateResolverRuleResponse) -> Unit = definedExternally): Request<AssociateResolverRuleResponse, AWSError>
    open fun associateResolverRule(callback: (err: AWSError, data: AssociateResolverRuleResponse) -> Unit = definedExternally): Request<AssociateResolverRuleResponse, AWSError>
    open fun createResolverEndpoint(params: CreateResolverEndpointRequest, callback: (err: AWSError, data: CreateResolverEndpointResponse) -> Unit = definedExternally): Request<CreateResolverEndpointResponse, AWSError>
    open fun createResolverEndpoint(callback: (err: AWSError, data: CreateResolverEndpointResponse) -> Unit = definedExternally): Request<CreateResolverEndpointResponse, AWSError>
    open fun createResolverRule(params: CreateResolverRuleRequest, callback: (err: AWSError, data: CreateResolverRuleResponse) -> Unit = definedExternally): Request<CreateResolverRuleResponse, AWSError>
    open fun createResolverRule(callback: (err: AWSError, data: CreateResolverRuleResponse) -> Unit = definedExternally): Request<CreateResolverRuleResponse, AWSError>
    open fun deleteResolverEndpoint(params: DeleteResolverEndpointRequest, callback: (err: AWSError, data: DeleteResolverEndpointResponse) -> Unit = definedExternally): Request<DeleteResolverEndpointResponse, AWSError>
    open fun deleteResolverEndpoint(callback: (err: AWSError, data: DeleteResolverEndpointResponse) -> Unit = definedExternally): Request<DeleteResolverEndpointResponse, AWSError>
    open fun deleteResolverRule(params: DeleteResolverRuleRequest, callback: (err: AWSError, data: DeleteResolverRuleResponse) -> Unit = definedExternally): Request<DeleteResolverRuleResponse, AWSError>
    open fun deleteResolverRule(callback: (err: AWSError, data: DeleteResolverRuleResponse) -> Unit = definedExternally): Request<DeleteResolverRuleResponse, AWSError>
    open fun disassociateResolverEndpointIpAddress(params: DisassociateResolverEndpointIpAddressRequest, callback: (err: AWSError, data: DisassociateResolverEndpointIpAddressResponse) -> Unit = definedExternally): Request<DisassociateResolverEndpointIpAddressResponse, AWSError>
    open fun disassociateResolverEndpointIpAddress(callback: (err: AWSError, data: DisassociateResolverEndpointIpAddressResponse) -> Unit = definedExternally): Request<DisassociateResolverEndpointIpAddressResponse, AWSError>
    open fun disassociateResolverRule(params: DisassociateResolverRuleRequest, callback: (err: AWSError, data: DisassociateResolverRuleResponse) -> Unit = definedExternally): Request<DisassociateResolverRuleResponse, AWSError>
    open fun disassociateResolverRule(callback: (err: AWSError, data: DisassociateResolverRuleResponse) -> Unit = definedExternally): Request<DisassociateResolverRuleResponse, AWSError>
    open fun getResolverEndpoint(params: GetResolverEndpointRequest, callback: (err: AWSError, data: GetResolverEndpointResponse) -> Unit = definedExternally): Request<GetResolverEndpointResponse, AWSError>
    open fun getResolverEndpoint(callback: (err: AWSError, data: GetResolverEndpointResponse) -> Unit = definedExternally): Request<GetResolverEndpointResponse, AWSError>
    open fun getResolverRule(params: GetResolverRuleRequest, callback: (err: AWSError, data: GetResolverRuleResponse) -> Unit = definedExternally): Request<GetResolverRuleResponse, AWSError>
    open fun getResolverRule(callback: (err: AWSError, data: GetResolverRuleResponse) -> Unit = definedExternally): Request<GetResolverRuleResponse, AWSError>
    open fun getResolverRuleAssociation(params: GetResolverRuleAssociationRequest, callback: (err: AWSError, data: GetResolverRuleAssociationResponse) -> Unit = definedExternally): Request<GetResolverRuleAssociationResponse, AWSError>
    open fun getResolverRuleAssociation(callback: (err: AWSError, data: GetResolverRuleAssociationResponse) -> Unit = definedExternally): Request<GetResolverRuleAssociationResponse, AWSError>
    open fun getResolverRulePolicy(params: GetResolverRulePolicyRequest, callback: (err: AWSError, data: GetResolverRulePolicyResponse) -> Unit = definedExternally): Request<GetResolverRulePolicyResponse, AWSError>
    open fun getResolverRulePolicy(callback: (err: AWSError, data: GetResolverRulePolicyResponse) -> Unit = definedExternally): Request<GetResolverRulePolicyResponse, AWSError>
    open fun listResolverEndpointIpAddresses(params: ListResolverEndpointIpAddressesRequest, callback: (err: AWSError, data: ListResolverEndpointIpAddressesResponse) -> Unit = definedExternally): Request<ListResolverEndpointIpAddressesResponse, AWSError>
    open fun listResolverEndpointIpAddresses(callback: (err: AWSError, data: ListResolverEndpointIpAddressesResponse) -> Unit = definedExternally): Request<ListResolverEndpointIpAddressesResponse, AWSError>
    open fun listResolverEndpoints(params: ListResolverEndpointsRequest, callback: (err: AWSError, data: ListResolverEndpointsResponse) -> Unit = definedExternally): Request<ListResolverEndpointsResponse, AWSError>
    open fun listResolverEndpoints(callback: (err: AWSError, data: ListResolverEndpointsResponse) -> Unit = definedExternally): Request<ListResolverEndpointsResponse, AWSError>
    open fun listResolverRuleAssociations(params: ListResolverRuleAssociationsRequest, callback: (err: AWSError, data: ListResolverRuleAssociationsResponse) -> Unit = definedExternally): Request<ListResolverRuleAssociationsResponse, AWSError>
    open fun listResolverRuleAssociations(callback: (err: AWSError, data: ListResolverRuleAssociationsResponse) -> Unit = definedExternally): Request<ListResolverRuleAssociationsResponse, AWSError>
    open fun listResolverRules(params: ListResolverRulesRequest, callback: (err: AWSError, data: ListResolverRulesResponse) -> Unit = definedExternally): Request<ListResolverRulesResponse, AWSError>
    open fun listResolverRules(callback: (err: AWSError, data: ListResolverRulesResponse) -> Unit = definedExternally): Request<ListResolverRulesResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun putResolverRulePolicy(params: PutResolverRulePolicyRequest, callback: (err: AWSError, data: PutResolverRulePolicyResponse) -> Unit = definedExternally): Request<PutResolverRulePolicyResponse, AWSError>
    open fun putResolverRulePolicy(callback: (err: AWSError, data: PutResolverRulePolicyResponse) -> Unit = definedExternally): Request<PutResolverRulePolicyResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateResolverEndpoint(params: UpdateResolverEndpointRequest, callback: (err: AWSError, data: UpdateResolverEndpointResponse) -> Unit = definedExternally): Request<UpdateResolverEndpointResponse, AWSError>
    open fun updateResolverEndpoint(callback: (err: AWSError, data: UpdateResolverEndpointResponse) -> Unit = definedExternally): Request<UpdateResolverEndpointResponse, AWSError>
    open fun updateResolverRule(params: UpdateResolverRuleRequest, callback: (err: AWSError, data: UpdateResolverRuleResponse) -> Unit = definedExternally): Request<UpdateResolverRuleResponse, AWSError>
    open fun updateResolverRule(callback: (err: AWSError, data: UpdateResolverRuleResponse) -> Unit = definedExternally): Request<UpdateResolverRuleResponse, AWSError>
    interface AssociateResolverEndpointIpAddressRequest {
        var ResolverEndpointId: ResourceId
        var IpAddress: IpAddressUpdate
    }
    interface AssociateResolverEndpointIpAddressResponse {
        var ResolverEndpoint: ResolverEndpoint?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateResolverRuleRequest {
        var ResolverRuleId: ResourceId
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var VPCId: ResourceId
    }
    interface AssociateResolverRuleResponse {
        var ResolverRuleAssociation: ResolverRuleAssociation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateResolverEndpointRequest {
        var CreatorRequestId: CreatorRequestId
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: SecurityGroupIds
        var Direction: String /* "INBOUND" | "OUTBOUND" | String */
        var IpAddresses: IpAddressesRequest
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateResolverEndpointResponse {
        var ResolverEndpoint: ResolverEndpoint?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateResolverRuleRequest {
        var CreatorRequestId: CreatorRequestId
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var RuleType: String /* "FORWARD" | "SYSTEM" | "RECURSIVE" | String */
        var DomainName: DomainName
        var TargetIps: TargetList?
            get() = definedExternally
            set(value) = definedExternally
        var ResolverEndpointId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateResolverRuleResponse {
        var ResolverRule: ResolverRule?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteResolverEndpointRequest {
        var ResolverEndpointId: ResourceId
    }
    interface DeleteResolverEndpointResponse {
        var ResolverEndpoint: ResolverEndpoint?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteResolverRuleRequest {
        var ResolverRuleId: ResourceId
    }
    interface DeleteResolverRuleResponse {
        var ResolverRule: ResolverRule?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateResolverEndpointIpAddressRequest {
        var ResolverEndpointId: ResourceId
        var IpAddress: IpAddressUpdate
    }
    interface DisassociateResolverEndpointIpAddressResponse {
        var ResolverEndpoint: ResolverEndpoint?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateResolverRuleRequest {
        var VPCId: ResourceId
        var ResolverRuleId: ResourceId
    }
    interface DisassociateResolverRuleResponse {
        var ResolverRuleAssociation: ResolverRuleAssociation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Filter {
        var Name: FilterName?
            get() = definedExternally
            set(value) = definedExternally
        var Values: FilterValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResolverEndpointRequest {
        var ResolverEndpointId: ResourceId
    }
    interface GetResolverEndpointResponse {
        var ResolverEndpoint: ResolverEndpoint?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResolverRuleAssociationRequest {
        var ResolverRuleAssociationId: ResourceId
    }
    interface GetResolverRuleAssociationResponse {
        var ResolverRuleAssociation: ResolverRuleAssociation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResolverRulePolicyRequest {
        var Arn: Arn
    }
    interface GetResolverRulePolicyResponse {
        var ResolverRulePolicy: ResolverRulePolicy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResolverRuleRequest {
        var ResolverRuleId: ResourceId
    }
    interface GetResolverRuleResponse {
        var ResolverRule: ResolverRule?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IpAddressRequest {
        var SubnetId: SubnetId
        var Ip: Ip?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IpAddressResponse {
        var IpId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetId: SubnetId?
            get() = definedExternally
            set(value) = definedExternally
        var Ip: Ip?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATING" | "FAILED_CREATION" | "ATTACHING" | "ATTACHED" | "REMAP_DETACHING" | "REMAP_ATTACHING" | "DETACHING" | "FAILED_RESOURCE_GONE" | "DELETING" | "DELETE_FAILED_FAS_EXPIRED" | String */
        var StatusMessage: StatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Rfc3339TimeString?
            get() = definedExternally
            set(value) = definedExternally
        var ModificationTime: Rfc3339TimeString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IpAddressUpdate {
        var IpId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetId: SubnetId?
            get() = definedExternally
            set(value) = definedExternally
        var Ip: Ip?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResolverEndpointIpAddressesRequest {
        var ResolverEndpointId: ResourceId
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResolverEndpointIpAddressesResponse {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var IpAddresses: IpAddressesResponse?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResolverEndpointsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResolverEndpointsResponse {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var ResolverEndpoints: ResolverEndpoints?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResolverRuleAssociationsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResolverRuleAssociationsResponse {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var ResolverRuleAssociations: ResolverRuleAssociations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResolverRulesRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResolverRulesResponse {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var ResolverRules: ResolverRules?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: Arn
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceResponse {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutResolverRulePolicyRequest {
        var Arn: Arn
        var ResolverRulePolicy: ResolverRulePolicy
    }
    interface PutResolverRulePolicyResponse {
        var ReturnValue: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResolverEndpoint {
        var Id: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var CreatorRequestId: CreatorRequestId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: SecurityGroupIds?
            get() = definedExternally
            set(value) = definedExternally
        var Direction: String /* "INBOUND" | "OUTBOUND" | String */
        var IpAddressCount: IpAddressCount?
            get() = definedExternally
            set(value) = definedExternally
        var HostVPCId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATING" | "OPERATIONAL" | "UPDATING" | "AUTO_RECOVERING" | "ACTION_NEEDED" | "DELETING" | String */
        var StatusMessage: StatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Rfc3339TimeString?
            get() = definedExternally
            set(value) = definedExternally
        var ModificationTime: Rfc3339TimeString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResolverRule {
        var Id: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var CreatorRequestId: CreatorRequestId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DomainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "COMPLETE" | "DELETING" | "UPDATING" | "FAILED" | String */
        var StatusMessage: StatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var RuleType: String /* "FORWARD" | "SYSTEM" | "RECURSIVE" | String */
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var TargetIps: TargetList?
            get() = definedExternally
            set(value) = definedExternally
        var ResolverEndpointId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var ShareStatus: String /* "NOT_SHARED" | "SHARED_WITH_ME" | "SHARED_BY_ME" | String */
    }
    interface ResolverRuleAssociation {
        var Id: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var ResolverRuleId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var VPCId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATING" | "COMPLETE" | "DELETING" | "FAILED" | "OVERRIDDEN" | String */
        var StatusMessage: StatusMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResolverRuleConfig {
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var TargetIps: TargetList?
            get() = definedExternally
            set(value) = definedExternally
        var ResolverEndpointId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
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
        var ResourceArn: Arn
        var Tags: TagList
    }
    interface TagResourceResponse
    interface TargetAddress {
        var Ip: Ip
        var Port: Port?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceRequest {
        var ResourceArn: Arn
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateResolverEndpointRequest {
        var ResolverEndpointId: ResourceId
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateResolverEndpointResponse {
        var ResolverEndpoint: ResolverEndpoint?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateResolverRuleRequest {
        var ResolverRuleId: ResourceId
        var Config: ResolverRuleConfig
    }
    interface UpdateResolverRuleResponse {
        var ResolverRule: ResolverRule?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-04-01" | "latest" | String */
    }
}