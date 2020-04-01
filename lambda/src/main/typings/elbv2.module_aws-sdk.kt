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
import ELBv2.Action
import ELBv2.AvailabilityZone
import ELBv2.Certificate
import ELBv2.Cipher
import ELBv2.Limit
import ELBv2.Listener
import ELBv2.LoadBalancerAddress
import ELBv2.LoadBalancerAttribute
import ELBv2.LoadBalancer
import ELBv2.QueryStringKeyValuePair
import ELBv2.RuleCondition
import ELBv2.RulePriorityPair
import ELBv2.Rule
import ELBv2.SslPolicy
import ELBv2.SubnetMapping
import ELBv2.TagDescription
import ELBv2.Tag
import ELBv2.TargetDescription
import ELBv2.TargetGroupAttribute
import ELBv2.TargetGroupTuple
import ELBv2.TargetGroup
import ELBv2.TargetHealthDescription
import ELBv2.AddListenerCertificatesInput
import ELBv2.AddListenerCertificatesOutput
import ELBv2.AddTagsInput
import ELBv2.AddTagsOutput
import ELBv2.CreateListenerInput
import ELBv2.CreateListenerOutput
import ELBv2.CreateLoadBalancerInput
import ELBv2.CreateLoadBalancerOutput
import ELBv2.CreateRuleInput
import ELBv2.CreateRuleOutput
import ELBv2.CreateTargetGroupInput
import ELBv2.CreateTargetGroupOutput
import ELBv2.DeleteListenerInput
import ELBv2.DeleteListenerOutput
import ELBv2.DeleteLoadBalancerInput
import ELBv2.DeleteLoadBalancerOutput
import ELBv2.DeleteRuleInput
import ELBv2.DeleteRuleOutput
import ELBv2.DeleteTargetGroupInput
import ELBv2.DeleteTargetGroupOutput
import ELBv2.DeregisterTargetsInput
import ELBv2.DeregisterTargetsOutput
import ELBv2.DescribeAccountLimitsInput
import ELBv2.DescribeAccountLimitsOutput
import ELBv2.DescribeListenerCertificatesInput
import ELBv2.DescribeListenerCertificatesOutput
import ELBv2.DescribeListenersInput
import ELBv2.DescribeListenersOutput
import ELBv2.DescribeLoadBalancerAttributesInput
import ELBv2.DescribeLoadBalancerAttributesOutput
import ELBv2.DescribeLoadBalancersInput
import ELBv2.DescribeLoadBalancersOutput
import ELBv2.DescribeRulesInput
import ELBv2.DescribeRulesOutput
import ELBv2.DescribeSSLPoliciesInput
import ELBv2.DescribeSSLPoliciesOutput
import ELBv2.DescribeTagsInput
import ELBv2.DescribeTagsOutput
import ELBv2.DescribeTargetGroupAttributesInput
import ELBv2.DescribeTargetGroupAttributesOutput
import ELBv2.DescribeTargetGroupsInput
import ELBv2.DescribeTargetGroupsOutput
import ELBv2.DescribeTargetHealthInput
import ELBv2.DescribeTargetHealthOutput
import ELBv2.ModifyListenerInput
import ELBv2.ModifyListenerOutput
import ELBv2.ModifyLoadBalancerAttributesInput
import ELBv2.ModifyLoadBalancerAttributesOutput
import ELBv2.ModifyRuleInput
import ELBv2.ModifyRuleOutput
import ELBv2.ModifyTargetGroupInput
import ELBv2.ModifyTargetGroupOutput
import ELBv2.ModifyTargetGroupAttributesInput
import ELBv2.ModifyTargetGroupAttributesOutput
import ELBv2.RegisterTargetsInput
import ELBv2.RegisterTargetsOutput
import ELBv2.RemoveListenerCertificatesInput
import ELBv2.RemoveListenerCertificatesOutput
import ELBv2.RemoveTagsInput
import ELBv2.RemoveTagsOutput
import ELBv2.SetIpAddressTypeInput
import ELBv2.SetIpAddressTypeOutput
import ELBv2.SetRulePrioritiesInput
import ELBv2.SetRulePrioritiesOutput
import ELBv2.SetSecurityGroupsInput
import ELBv2.SetSecurityGroupsOutput
import ELBv2.SetSubnetsInput
import ELBv2.SetSubnetsOutput
import ELBv2.AuthenticateOidcActionConfig
import ELBv2.AuthenticateCognitoActionConfig
import ELBv2.RedirectActionConfig
import ELBv2.FixedResponseActionConfig
import ELBv2.ForwardActionConfig
import ELBv2.AuthenticateCognitoActionAuthenticationRequestExtraParams
import ELBv2.AuthenticateOidcActionAuthenticationRequestExtraParams
import ELBv2.Matcher
import ELBv2.TargetGroupStickinessConfig
import ELBv2.LoadBalancerState
import ELBv2.HostHeaderConditionConfig
import ELBv2.PathPatternConditionConfig
import ELBv2.HttpHeaderConditionConfig
import ELBv2.QueryStringConditionConfig
import ELBv2.HttpRequestMethodConditionConfig
import ELBv2.SourceIpConditionConfig
import ELBv2.TargetHealth

typealias ActionOrder = Number

typealias Actions = Array<Action>

typealias AllocationId = String

typealias AuthenticateCognitoActionAuthenticationRequestParamName = String

typealias AuthenticateCognitoActionAuthenticationRequestParamValue = String

typealias AuthenticateCognitoActionScope = String

typealias AuthenticateCognitoActionSessionCookieName = String

typealias AuthenticateCognitoActionSessionTimeout = Number

typealias AuthenticateCognitoActionUserPoolArn = String

typealias AuthenticateCognitoActionUserPoolClientId = String

typealias AuthenticateCognitoActionUserPoolDomain = String

typealias AuthenticateOidcActionAuthenticationRequestParamName = String

typealias AuthenticateOidcActionAuthenticationRequestParamValue = String

typealias AuthenticateOidcActionAuthorizationEndpoint = String

typealias AuthenticateOidcActionClientId = String

typealias AuthenticateOidcActionClientSecret = String

typealias AuthenticateOidcActionIssuer = String

typealias AuthenticateOidcActionScope = String

typealias AuthenticateOidcActionSessionCookieName = String

typealias AuthenticateOidcActionSessionTimeout = Number

typealias AuthenticateOidcActionTokenEndpoint = String

typealias AuthenticateOidcActionUseExistingClientSecret = Boolean

typealias AuthenticateOidcActionUserInfoEndpoint = String

typealias AvailabilityZones = Array<AvailabilityZone>

typealias CanonicalHostedZoneId = String

typealias CertificateArn = String

typealias CertificateList = Array<Certificate>

typealias CipherName = String

typealias CipherPriority = Number

typealias Ciphers = Array<Cipher>

typealias ConditionFieldName = String

typealias CreatedTime = Date

typealias DNSName = String

typealias Default = Boolean

typealias Description = String

typealias FixedResponseActionContentType = String

typealias FixedResponseActionMessage = String

typealias FixedResponseActionStatusCode = String

typealias HealthCheckEnabled = Boolean

typealias HealthCheckIntervalSeconds = Number

typealias HealthCheckPort = String

typealias HealthCheckThresholdCount = Number

typealias HealthCheckTimeoutSeconds = Number

typealias HttpCode = String

typealias HttpHeaderConditionName = String

typealias IpAddress = String

typealias IsDefault = Boolean

typealias Limits = Array<Limit>

typealias ListOfString = Array<StringValue>

typealias ListenerArn = String

typealias ListenerArns = Array<ListenerArn>

typealias Listeners = Array<Listener>

typealias LoadBalancerAddresses = Array<LoadBalancerAddress>

typealias LoadBalancerArn = String

typealias LoadBalancerArns = Array<LoadBalancerArn>

typealias LoadBalancerAttributeKey = String

typealias LoadBalancerAttributeValue = String

typealias LoadBalancerAttributes = Array<LoadBalancerAttribute>

typealias LoadBalancerName = String

typealias LoadBalancerNames = Array<LoadBalancerName>

typealias LoadBalancers = Array<LoadBalancer>

typealias Marker = String

typealias Max = String

typealias Name = String

typealias PageSize = Number

typealias Path = String

typealias Port = Number

typealias PrivateIPv4Address = String

typealias QueryStringKeyValuePairList = Array<QueryStringKeyValuePair>

typealias RedirectActionHost = String

typealias RedirectActionPath = String

typealias RedirectActionPort = String

typealias RedirectActionProtocol = String

typealias RedirectActionQuery = String

typealias ResourceArn = String

typealias ResourceArns = Array<ResourceArn>

typealias RuleArn = String

typealias RuleArns = Array<RuleArn>

typealias RuleConditionList = Array<RuleCondition>

typealias RulePriority = Number

typealias RulePriorityList = Array<RulePriorityPair>

typealias Rules = Array<Rule>

typealias SecurityGroupId = String

typealias SecurityGroups = Array<SecurityGroupId>

typealias SslPolicies = Array<SslPolicy>

typealias SslPolicyName = String

typealias SslPolicyNames = Array<SslPolicyName>

typealias SslProtocol = String

typealias SslProtocols = Array<SslProtocol>

typealias StateReason = String

typealias String = String

typealias StringValue = String

typealias SubnetId = String

typealias SubnetMappings = Array<SubnetMapping>

typealias Subnets = Array<SubnetId>

typealias TagDescriptions = Array<TagDescription>

typealias TagKey = String

typealias TagKeys = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TargetDescriptions = Array<TargetDescription>

typealias TargetGroupArn = String

typealias TargetGroupArns = Array<TargetGroupArn>

typealias TargetGroupAttributeKey = String

typealias TargetGroupAttributeValue = String

typealias TargetGroupAttributes = Array<TargetGroupAttribute>

typealias TargetGroupList = Array<TargetGroupTuple>

typealias TargetGroupName = String

typealias TargetGroupNames = Array<TargetGroupName>

typealias TargetGroupStickinessDurationSeconds = Number

typealias TargetGroupStickinessEnabled = Boolean

typealias TargetGroupWeight = Number

typealias TargetGroups = Array<TargetGroup>

typealias TargetHealthDescriptions = Array<TargetHealthDescription>

typealias TargetId = String

typealias VpcId = String

typealias ZoneName = String

@JsModule("aws-sdk")
external open class ELBv2(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ELBv2.Types.ClientConfiguration */
    open fun addListenerCertificates(params: AddListenerCertificatesInput, callback: (err: AWSError, data: AddListenerCertificatesOutput) -> Unit = definedExternally): Request<AddListenerCertificatesOutput, AWSError>
    open fun addListenerCertificates(callback: (err: AWSError, data: AddListenerCertificatesOutput) -> Unit = definedExternally): Request<AddListenerCertificatesOutput, AWSError>
    open fun addTags(params: AddTagsInput, callback: (err: AWSError, data: AddTagsOutput) -> Unit = definedExternally): Request<AddTagsOutput, AWSError>
    open fun addTags(callback: (err: AWSError, data: AddTagsOutput) -> Unit = definedExternally): Request<AddTagsOutput, AWSError>
    open fun createListener(params: CreateListenerInput, callback: (err: AWSError, data: CreateListenerOutput) -> Unit = definedExternally): Request<CreateListenerOutput, AWSError>
    open fun createListener(callback: (err: AWSError, data: CreateListenerOutput) -> Unit = definedExternally): Request<CreateListenerOutput, AWSError>
    open fun createLoadBalancer(params: CreateLoadBalancerInput, callback: (err: AWSError, data: CreateLoadBalancerOutput) -> Unit = definedExternally): Request<CreateLoadBalancerOutput, AWSError>
    open fun createLoadBalancer(callback: (err: AWSError, data: CreateLoadBalancerOutput) -> Unit = definedExternally): Request<CreateLoadBalancerOutput, AWSError>
    open fun createRule(params: CreateRuleInput, callback: (err: AWSError, data: CreateRuleOutput) -> Unit = definedExternally): Request<CreateRuleOutput, AWSError>
    open fun createRule(callback: (err: AWSError, data: CreateRuleOutput) -> Unit = definedExternally): Request<CreateRuleOutput, AWSError>
    open fun createTargetGroup(params: CreateTargetGroupInput, callback: (err: AWSError, data: CreateTargetGroupOutput) -> Unit = definedExternally): Request<CreateTargetGroupOutput, AWSError>
    open fun createTargetGroup(callback: (err: AWSError, data: CreateTargetGroupOutput) -> Unit = definedExternally): Request<CreateTargetGroupOutput, AWSError>
    open fun deleteListener(params: DeleteListenerInput, callback: (err: AWSError, data: DeleteListenerOutput) -> Unit = definedExternally): Request<DeleteListenerOutput, AWSError>
    open fun deleteListener(callback: (err: AWSError, data: DeleteListenerOutput) -> Unit = definedExternally): Request<DeleteListenerOutput, AWSError>
    open fun deleteLoadBalancer(params: DeleteLoadBalancerInput, callback: (err: AWSError, data: DeleteLoadBalancerOutput) -> Unit = definedExternally): Request<DeleteLoadBalancerOutput, AWSError>
    open fun deleteLoadBalancer(callback: (err: AWSError, data: DeleteLoadBalancerOutput) -> Unit = definedExternally): Request<DeleteLoadBalancerOutput, AWSError>
    open fun deleteRule(params: DeleteRuleInput, callback: (err: AWSError, data: DeleteRuleOutput) -> Unit = definedExternally): Request<DeleteRuleOutput, AWSError>
    open fun deleteRule(callback: (err: AWSError, data: DeleteRuleOutput) -> Unit = definedExternally): Request<DeleteRuleOutput, AWSError>
    open fun deleteTargetGroup(params: DeleteTargetGroupInput, callback: (err: AWSError, data: DeleteTargetGroupOutput) -> Unit = definedExternally): Request<DeleteTargetGroupOutput, AWSError>
    open fun deleteTargetGroup(callback: (err: AWSError, data: DeleteTargetGroupOutput) -> Unit = definedExternally): Request<DeleteTargetGroupOutput, AWSError>
    open fun deregisterTargets(params: DeregisterTargetsInput, callback: (err: AWSError, data: DeregisterTargetsOutput) -> Unit = definedExternally): Request<DeregisterTargetsOutput, AWSError>
    open fun deregisterTargets(callback: (err: AWSError, data: DeregisterTargetsOutput) -> Unit = definedExternally): Request<DeregisterTargetsOutput, AWSError>
    open fun describeAccountLimits(params: DescribeAccountLimitsInput, callback: (err: AWSError, data: DescribeAccountLimitsOutput) -> Unit = definedExternally): Request<DescribeAccountLimitsOutput, AWSError>
    open fun describeAccountLimits(callback: (err: AWSError, data: DescribeAccountLimitsOutput) -> Unit = definedExternally): Request<DescribeAccountLimitsOutput, AWSError>
    open fun describeListenerCertificates(params: DescribeListenerCertificatesInput, callback: (err: AWSError, data: DescribeListenerCertificatesOutput) -> Unit = definedExternally): Request<DescribeListenerCertificatesOutput, AWSError>
    open fun describeListenerCertificates(callback: (err: AWSError, data: DescribeListenerCertificatesOutput) -> Unit = definedExternally): Request<DescribeListenerCertificatesOutput, AWSError>
    open fun describeListeners(params: DescribeListenersInput, callback: (err: AWSError, data: DescribeListenersOutput) -> Unit = definedExternally): Request<DescribeListenersOutput, AWSError>
    open fun describeListeners(callback: (err: AWSError, data: DescribeListenersOutput) -> Unit = definedExternally): Request<DescribeListenersOutput, AWSError>
    open fun describeLoadBalancerAttributes(params: DescribeLoadBalancerAttributesInput, callback: (err: AWSError, data: DescribeLoadBalancerAttributesOutput) -> Unit = definedExternally): Request<DescribeLoadBalancerAttributesOutput, AWSError>
    open fun describeLoadBalancerAttributes(callback: (err: AWSError, data: DescribeLoadBalancerAttributesOutput) -> Unit = definedExternally): Request<DescribeLoadBalancerAttributesOutput, AWSError>
    open fun describeLoadBalancers(params: DescribeLoadBalancersInput, callback: (err: AWSError, data: DescribeLoadBalancersOutput) -> Unit = definedExternally): Request<DescribeLoadBalancersOutput, AWSError>
    open fun describeLoadBalancers(callback: (err: AWSError, data: DescribeLoadBalancersOutput) -> Unit = definedExternally): Request<DescribeLoadBalancersOutput, AWSError>
    open fun describeRules(params: DescribeRulesInput, callback: (err: AWSError, data: DescribeRulesOutput) -> Unit = definedExternally): Request<DescribeRulesOutput, AWSError>
    open fun describeRules(callback: (err: AWSError, data: DescribeRulesOutput) -> Unit = definedExternally): Request<DescribeRulesOutput, AWSError>
    open fun describeSSLPolicies(params: DescribeSSLPoliciesInput, callback: (err: AWSError, data: DescribeSSLPoliciesOutput) -> Unit = definedExternally): Request<DescribeSSLPoliciesOutput, AWSError>
    open fun describeSSLPolicies(callback: (err: AWSError, data: DescribeSSLPoliciesOutput) -> Unit = definedExternally): Request<DescribeSSLPoliciesOutput, AWSError>
    open fun describeTags(params: DescribeTagsInput, callback: (err: AWSError, data: DescribeTagsOutput) -> Unit = definedExternally): Request<DescribeTagsOutput, AWSError>
    open fun describeTags(callback: (err: AWSError, data: DescribeTagsOutput) -> Unit = definedExternally): Request<DescribeTagsOutput, AWSError>
    open fun describeTargetGroupAttributes(params: DescribeTargetGroupAttributesInput, callback: (err: AWSError, data: DescribeTargetGroupAttributesOutput) -> Unit = definedExternally): Request<DescribeTargetGroupAttributesOutput, AWSError>
    open fun describeTargetGroupAttributes(callback: (err: AWSError, data: DescribeTargetGroupAttributesOutput) -> Unit = definedExternally): Request<DescribeTargetGroupAttributesOutput, AWSError>
    open fun describeTargetGroups(params: DescribeTargetGroupsInput, callback: (err: AWSError, data: DescribeTargetGroupsOutput) -> Unit = definedExternally): Request<DescribeTargetGroupsOutput, AWSError>
    open fun describeTargetGroups(callback: (err: AWSError, data: DescribeTargetGroupsOutput) -> Unit = definedExternally): Request<DescribeTargetGroupsOutput, AWSError>
    open fun describeTargetHealth(params: DescribeTargetHealthInput, callback: (err: AWSError, data: DescribeTargetHealthOutput) -> Unit = definedExternally): Request<DescribeTargetHealthOutput, AWSError>
    open fun describeTargetHealth(callback: (err: AWSError, data: DescribeTargetHealthOutput) -> Unit = definedExternally): Request<DescribeTargetHealthOutput, AWSError>
    open fun modifyListener(params: ModifyListenerInput, callback: (err: AWSError, data: ModifyListenerOutput) -> Unit = definedExternally): Request<ModifyListenerOutput, AWSError>
    open fun modifyListener(callback: (err: AWSError, data: ModifyListenerOutput) -> Unit = definedExternally): Request<ModifyListenerOutput, AWSError>
    open fun modifyLoadBalancerAttributes(params: ModifyLoadBalancerAttributesInput, callback: (err: AWSError, data: ModifyLoadBalancerAttributesOutput) -> Unit = definedExternally): Request<ModifyLoadBalancerAttributesOutput, AWSError>
    open fun modifyLoadBalancerAttributes(callback: (err: AWSError, data: ModifyLoadBalancerAttributesOutput) -> Unit = definedExternally): Request<ModifyLoadBalancerAttributesOutput, AWSError>
    open fun modifyRule(params: ModifyRuleInput, callback: (err: AWSError, data: ModifyRuleOutput) -> Unit = definedExternally): Request<ModifyRuleOutput, AWSError>
    open fun modifyRule(callback: (err: AWSError, data: ModifyRuleOutput) -> Unit = definedExternally): Request<ModifyRuleOutput, AWSError>
    open fun modifyTargetGroup(params: ModifyTargetGroupInput, callback: (err: AWSError, data: ModifyTargetGroupOutput) -> Unit = definedExternally): Request<ModifyTargetGroupOutput, AWSError>
    open fun modifyTargetGroup(callback: (err: AWSError, data: ModifyTargetGroupOutput) -> Unit = definedExternally): Request<ModifyTargetGroupOutput, AWSError>
    open fun modifyTargetGroupAttributes(params: ModifyTargetGroupAttributesInput, callback: (err: AWSError, data: ModifyTargetGroupAttributesOutput) -> Unit = definedExternally): Request<ModifyTargetGroupAttributesOutput, AWSError>
    open fun modifyTargetGroupAttributes(callback: (err: AWSError, data: ModifyTargetGroupAttributesOutput) -> Unit = definedExternally): Request<ModifyTargetGroupAttributesOutput, AWSError>
    open fun registerTargets(params: RegisterTargetsInput, callback: (err: AWSError, data: RegisterTargetsOutput) -> Unit = definedExternally): Request<RegisterTargetsOutput, AWSError>
    open fun registerTargets(callback: (err: AWSError, data: RegisterTargetsOutput) -> Unit = definedExternally): Request<RegisterTargetsOutput, AWSError>
    open fun removeListenerCertificates(params: RemoveListenerCertificatesInput, callback: (err: AWSError, data: RemoveListenerCertificatesOutput) -> Unit = definedExternally): Request<RemoveListenerCertificatesOutput, AWSError>
    open fun removeListenerCertificates(callback: (err: AWSError, data: RemoveListenerCertificatesOutput) -> Unit = definedExternally): Request<RemoveListenerCertificatesOutput, AWSError>
    open fun removeTags(params: RemoveTagsInput, callback: (err: AWSError, data: RemoveTagsOutput) -> Unit = definedExternally): Request<RemoveTagsOutput, AWSError>
    open fun removeTags(callback: (err: AWSError, data: RemoveTagsOutput) -> Unit = definedExternally): Request<RemoveTagsOutput, AWSError>
    open fun setIpAddressType(params: SetIpAddressTypeInput, callback: (err: AWSError, data: SetIpAddressTypeOutput) -> Unit = definedExternally): Request<SetIpAddressTypeOutput, AWSError>
    open fun setIpAddressType(callback: (err: AWSError, data: SetIpAddressTypeOutput) -> Unit = definedExternally): Request<SetIpAddressTypeOutput, AWSError>
    open fun setRulePriorities(params: SetRulePrioritiesInput, callback: (err: AWSError, data: SetRulePrioritiesOutput) -> Unit = definedExternally): Request<SetRulePrioritiesOutput, AWSError>
    open fun setRulePriorities(callback: (err: AWSError, data: SetRulePrioritiesOutput) -> Unit = definedExternally): Request<SetRulePrioritiesOutput, AWSError>
    open fun setSecurityGroups(params: SetSecurityGroupsInput, callback: (err: AWSError, data: SetSecurityGroupsOutput) -> Unit = definedExternally): Request<SetSecurityGroupsOutput, AWSError>
    open fun setSecurityGroups(callback: (err: AWSError, data: SetSecurityGroupsOutput) -> Unit = definedExternally): Request<SetSecurityGroupsOutput, AWSError>
    open fun setSubnets(params: SetSubnetsInput, callback: (err: AWSError, data: SetSubnetsOutput) -> Unit = definedExternally): Request<SetSubnetsOutput, AWSError>
    open fun setSubnets(callback: (err: AWSError, data: SetSubnetsOutput) -> Unit = definedExternally): Request<SetSubnetsOutput, AWSError>
    open fun waitFor(state: String, params: DescribeLoadBalancersInput, callback: (err: AWSError, data: DescribeLoadBalancersOutput) -> Unit = definedExternally): Request<DescribeLoadBalancersOutput, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DescribeLoadBalancersOutput) -> Unit = definedExternally): Request<DescribeLoadBalancersOutput, AWSError>
    open fun waitFor(state: String, params: DescribeTargetHealthInput, callback: (err: AWSError, data: DescribeTargetHealthOutput) -> Unit = definedExternally): Request<DescribeTargetHealthOutput, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DescribeTargetHealthOutput) -> Unit = definedExternally): Request<DescribeTargetHealthOutput, AWSError>
    interface Action {
        var Type: String /* "forward" | "authenticate-oidc" | "authenticate-cognito" | "redirect" | "fixed-response" | String */
        var TargetGroupArn: TargetGroupArn?
            get() = definedExternally
            set(value) = definedExternally
        var AuthenticateOidcConfig: AuthenticateOidcActionConfig?
            get() = definedExternally
            set(value) = definedExternally
        var AuthenticateCognitoConfig: AuthenticateCognitoActionConfig?
            get() = definedExternally
            set(value) = definedExternally
        var Order: ActionOrder?
            get() = definedExternally
            set(value) = definedExternally
        var RedirectConfig: RedirectActionConfig?
            get() = definedExternally
            set(value) = definedExternally
        var FixedResponseConfig: FixedResponseActionConfig?
            get() = definedExternally
            set(value) = definedExternally
        var ForwardConfig: ForwardActionConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddListenerCertificatesInput {
        var ListenerArn: ListenerArn
        var Certificates: CertificateList
    }
    interface AddListenerCertificatesOutput {
        var Certificates: CertificateList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddTagsInput {
        var ResourceArns: ResourceArns
        var Tags: TagList
    }
    interface AddTagsOutput
    interface AuthenticateCognitoActionAuthenticationRequestExtraParams {
        @nativeGetter
        operator fun get(key: String): AuthenticateCognitoActionAuthenticationRequestParamValue?
        @nativeSetter
        operator fun set(key: String, value: AuthenticateCognitoActionAuthenticationRequestParamValue)
    }
    interface AuthenticateCognitoActionConfig {
        var UserPoolArn: AuthenticateCognitoActionUserPoolArn
        var UserPoolClientId: AuthenticateCognitoActionUserPoolClientId
        var UserPoolDomain: AuthenticateCognitoActionUserPoolDomain
        var SessionCookieName: AuthenticateCognitoActionSessionCookieName?
            get() = definedExternally
            set(value) = definedExternally
        var Scope: AuthenticateCognitoActionScope?
            get() = definedExternally
            set(value) = definedExternally
        var SessionTimeout: AuthenticateCognitoActionSessionTimeout?
            get() = definedExternally
            set(value) = definedExternally
        var AuthenticationRequestExtraParams: AuthenticateCognitoActionAuthenticationRequestExtraParams?
            get() = definedExternally
            set(value) = definedExternally
        var OnUnauthenticatedRequest: String /* "deny" | "allow" | "authenticate" | String */
    }
    interface AuthenticateOidcActionAuthenticationRequestExtraParams {
        @nativeGetter
        operator fun get(key: String): AuthenticateOidcActionAuthenticationRequestParamValue?
        @nativeSetter
        operator fun set(key: String, value: AuthenticateOidcActionAuthenticationRequestParamValue)
    }
    interface AuthenticateOidcActionConfig {
        var Issuer: AuthenticateOidcActionIssuer
        var AuthorizationEndpoint: AuthenticateOidcActionAuthorizationEndpoint
        var TokenEndpoint: AuthenticateOidcActionTokenEndpoint
        var UserInfoEndpoint: AuthenticateOidcActionUserInfoEndpoint
        var ClientId: AuthenticateOidcActionClientId
        var ClientSecret: AuthenticateOidcActionClientSecret?
            get() = definedExternally
            set(value) = definedExternally
        var SessionCookieName: AuthenticateOidcActionSessionCookieName?
            get() = definedExternally
            set(value) = definedExternally
        var Scope: AuthenticateOidcActionScope?
            get() = definedExternally
            set(value) = definedExternally
        var SessionTimeout: AuthenticateOidcActionSessionTimeout?
            get() = definedExternally
            set(value) = definedExternally
        var AuthenticationRequestExtraParams: AuthenticateOidcActionAuthenticationRequestExtraParams?
            get() = definedExternally
            set(value) = definedExternally
        var OnUnauthenticatedRequest: String /* "deny" | "allow" | "authenticate" | String */
        var UseExistingClientSecret: AuthenticateOidcActionUseExistingClientSecret?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AvailabilityZone {
        var ZoneName: ZoneName?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetId: SubnetId?
            get() = definedExternally
            set(value) = definedExternally
        var LoadBalancerAddresses: LoadBalancerAddresses?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Certificate {
        var CertificateArn: CertificateArn?
            get() = definedExternally
            set(value) = definedExternally
        var IsDefault: Default?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Cipher {
        var Name: CipherName?
            get() = definedExternally
            set(value) = definedExternally
        var Priority: CipherPriority?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateListenerInput {
        var LoadBalancerArn: LoadBalancerArn
        var Protocol: String /* "HTTP" | "HTTPS" | "TCP" | "TLS" | "UDP" | "TCP_UDP" | String */
        var Port: Port
        var SslPolicy: SslPolicyName?
            get() = definedExternally
            set(value) = definedExternally
        var Certificates: CertificateList?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultActions: Actions
    }
    interface CreateListenerOutput {
        var Listeners: Listeners?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLoadBalancerInput {
        var Name: LoadBalancerName
        var Subnets: Subnets?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetMappings: SubnetMappings?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroups: SecurityGroups?
            get() = definedExternally
            set(value) = definedExternally
        var Scheme: String /* "internet-facing" | "internal" | String */
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "application" | "network" | String */
        var IpAddressType: String /* "ipv4" | "dualstack" | String */
    }
    interface CreateLoadBalancerOutput {
        var LoadBalancers: LoadBalancers?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRuleInput {
        var ListenerArn: ListenerArn
        var Conditions: RuleConditionList
        var Priority: RulePriority
        var Actions: Actions
    }
    interface CreateRuleOutput {
        var Rules: Rules?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTargetGroupInput {
        var Name: TargetGroupName
        var Protocol: String /* "HTTP" | "HTTPS" | "TCP" | "TLS" | "UDP" | "TCP_UDP" | String */
        var Port: Port?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: VpcId?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckProtocol: String /* "HTTP" | "HTTPS" | "TCP" | "TLS" | "UDP" | "TCP_UDP" | String */
        var HealthCheckPort: HealthCheckPort?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckEnabled: HealthCheckEnabled?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckPath: Path?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckIntervalSeconds: HealthCheckIntervalSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckTimeoutSeconds: HealthCheckTimeoutSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var HealthyThresholdCount: HealthCheckThresholdCount?
            get() = definedExternally
            set(value) = definedExternally
        var UnhealthyThresholdCount: HealthCheckThresholdCount?
            get() = definedExternally
            set(value) = definedExternally
        var Matcher: Matcher?
            get() = definedExternally
            set(value) = definedExternally
        var TargetType: String /* "instance" | "ip" | "lambda" | String */
    }
    interface CreateTargetGroupOutput {
        var TargetGroups: TargetGroups?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteListenerInput {
        var ListenerArn: ListenerArn
    }
    interface DeleteListenerOutput
    interface DeleteLoadBalancerInput {
        var LoadBalancerArn: LoadBalancerArn
    }
    interface DeleteLoadBalancerOutput
    interface DeleteRuleInput {
        var RuleArn: RuleArn
    }
    interface DeleteRuleOutput
    interface DeleteTargetGroupInput {
        var TargetGroupArn: TargetGroupArn
    }
    interface DeleteTargetGroupOutput
    interface DeregisterTargetsInput {
        var TargetGroupArn: TargetGroupArn
        var Targets: TargetDescriptions
    }
    interface DeregisterTargetsOutput
    interface DescribeAccountLimitsInput {
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAccountLimitsOutput {
        var Limits: Limits?
            get() = definedExternally
            set(value) = definedExternally
        var NextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeListenerCertificatesInput {
        var ListenerArn: ListenerArn
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeListenerCertificatesOutput {
        var Certificates: CertificateList?
            get() = definedExternally
            set(value) = definedExternally
        var NextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeListenersInput {
        var LoadBalancerArn: LoadBalancerArn?
            get() = definedExternally
            set(value) = definedExternally
        var ListenerArns: ListenerArns?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeListenersOutput {
        var Listeners: Listeners?
            get() = definedExternally
            set(value) = definedExternally
        var NextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLoadBalancerAttributesInput {
        var LoadBalancerArn: LoadBalancerArn
    }
    interface DescribeLoadBalancerAttributesOutput {
        var Attributes: LoadBalancerAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLoadBalancersInput {
        var LoadBalancerArns: LoadBalancerArns?
            get() = definedExternally
            set(value) = definedExternally
        var Names: LoadBalancerNames?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLoadBalancersOutput {
        var LoadBalancers: LoadBalancers?
            get() = definedExternally
            set(value) = definedExternally
        var NextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRulesInput {
        var ListenerArn: ListenerArn?
            get() = definedExternally
            set(value) = definedExternally
        var RuleArns: RuleArns?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRulesOutput {
        var Rules: Rules?
            get() = definedExternally
            set(value) = definedExternally
        var NextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSSLPoliciesInput {
        var Names: SslPolicyNames?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSSLPoliciesOutput {
        var SslPolicies: SslPolicies?
            get() = definedExternally
            set(value) = definedExternally
        var NextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTagsInput {
        var ResourceArns: ResourceArns
    }
    interface DescribeTagsOutput {
        var TagDescriptions: TagDescriptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTargetGroupAttributesInput {
        var TargetGroupArn: TargetGroupArn
    }
    interface DescribeTargetGroupAttributesOutput {
        var Attributes: TargetGroupAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTargetGroupsInput {
        var LoadBalancerArn: LoadBalancerArn?
            get() = definedExternally
            set(value) = definedExternally
        var TargetGroupArns: TargetGroupArns?
            get() = definedExternally
            set(value) = definedExternally
        var Names: TargetGroupNames?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTargetGroupsOutput {
        var TargetGroups: TargetGroups?
            get() = definedExternally
            set(value) = definedExternally
        var NextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTargetHealthInput {
        var TargetGroupArn: TargetGroupArn
        var Targets: TargetDescriptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTargetHealthOutput {
        var TargetHealthDescriptions: TargetHealthDescriptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FixedResponseActionConfig {
        var MessageBody: FixedResponseActionMessage?
            get() = definedExternally
            set(value) = definedExternally
        var StatusCode: FixedResponseActionStatusCode
        var ContentType: FixedResponseActionContentType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ForwardActionConfig {
        var TargetGroups: TargetGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var TargetGroupStickinessConfig: TargetGroupStickinessConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HostHeaderConditionConfig {
        var Values: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HttpHeaderConditionConfig {
        var HttpHeaderName: HttpHeaderConditionName?
            get() = definedExternally
            set(value) = definedExternally
        var Values: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HttpRequestMethodConditionConfig {
        var Values: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Limit {
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var Max: Max?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Listener {
        var ListenerArn: ListenerArn?
            get() = definedExternally
            set(value) = definedExternally
        var LoadBalancerArn: LoadBalancerArn?
            get() = definedExternally
            set(value) = definedExternally
        var Port: Port?
            get() = definedExternally
            set(value) = definedExternally
        var Protocol: String /* "HTTP" | "HTTPS" | "TCP" | "TLS" | "UDP" | "TCP_UDP" | String */
        var Certificates: CertificateList?
            get() = definedExternally
            set(value) = definedExternally
        var SslPolicy: SslPolicyName?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultActions: Actions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoadBalancer {
        var LoadBalancerArn: LoadBalancerArn?
            get() = definedExternally
            set(value) = definedExternally
        var DNSName: DNSName?
            get() = definedExternally
            set(value) = definedExternally
        var CanonicalHostedZoneId: CanonicalHostedZoneId?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: CreatedTime?
            get() = definedExternally
            set(value) = definedExternally
        var LoadBalancerName: LoadBalancerName?
            get() = definedExternally
            set(value) = definedExternally
        var Scheme: String /* "internet-facing" | "internal" | String */
        var VpcId: VpcId?
            get() = definedExternally
            set(value) = definedExternally
        var State: LoadBalancerState?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "application" | "network" | String */
        var AvailabilityZones: AvailabilityZones?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroups: SecurityGroups?
            get() = definedExternally
            set(value) = definedExternally
        var IpAddressType: String /* "ipv4" | "dualstack" | String */
    }
    interface LoadBalancerAddress {
        var IpAddress: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
        var AllocationId: AllocationId?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateIPv4Address: PrivateIPv4Address?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoadBalancerAttribute {
        var Key: LoadBalancerAttributeKey?
            get() = definedExternally
            set(value) = definedExternally
        var Value: LoadBalancerAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoadBalancerState {
        var Code: String /* "active" | "provisioning" | "active_impaired" | "failed" | String */
        var Reason: StateReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Matcher {
        var HttpCode: HttpCode
    }
    interface ModifyListenerInput {
        var ListenerArn: ListenerArn
        var Port: Port?
            get() = definedExternally
            set(value) = definedExternally
        var Protocol: String /* "HTTP" | "HTTPS" | "TCP" | "TLS" | "UDP" | "TCP_UDP" | String */
        var SslPolicy: SslPolicyName?
            get() = definedExternally
            set(value) = definedExternally
        var Certificates: CertificateList?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultActions: Actions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyListenerOutput {
        var Listeners: Listeners?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyLoadBalancerAttributesInput {
        var LoadBalancerArn: LoadBalancerArn
        var Attributes: LoadBalancerAttributes
    }
    interface ModifyLoadBalancerAttributesOutput {
        var Attributes: LoadBalancerAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyRuleInput {
        var RuleArn: RuleArn
        var Conditions: RuleConditionList?
            get() = definedExternally
            set(value) = definedExternally
        var Actions: Actions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyRuleOutput {
        var Rules: Rules?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyTargetGroupAttributesInput {
        var TargetGroupArn: TargetGroupArn
        var Attributes: TargetGroupAttributes
    }
    interface ModifyTargetGroupAttributesOutput {
        var Attributes: TargetGroupAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyTargetGroupInput {
        var TargetGroupArn: TargetGroupArn
        var HealthCheckProtocol: String /* "HTTP" | "HTTPS" | "TCP" | "TLS" | "UDP" | "TCP_UDP" | String */
        var HealthCheckPort: HealthCheckPort?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckPath: Path?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckEnabled: HealthCheckEnabled?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckIntervalSeconds: HealthCheckIntervalSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckTimeoutSeconds: HealthCheckTimeoutSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var HealthyThresholdCount: HealthCheckThresholdCount?
            get() = definedExternally
            set(value) = definedExternally
        var UnhealthyThresholdCount: HealthCheckThresholdCount?
            get() = definedExternally
            set(value) = definedExternally
        var Matcher: Matcher?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyTargetGroupOutput {
        var TargetGroups: TargetGroups?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PathPatternConditionConfig {
        var Values: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface QueryStringConditionConfig {
        var Values: QueryStringKeyValuePairList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface QueryStringKeyValuePair {
        var Key: StringValue?
            get() = definedExternally
            set(value) = definedExternally
        var Value: StringValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RedirectActionConfig {
        var Protocol: RedirectActionProtocol?
            get() = definedExternally
            set(value) = definedExternally
        var Port: RedirectActionPort?
            get() = definedExternally
            set(value) = definedExternally
        var Host: RedirectActionHost?
            get() = definedExternally
            set(value) = definedExternally
        var Path: RedirectActionPath?
            get() = definedExternally
            set(value) = definedExternally
        var Query: RedirectActionQuery?
            get() = definedExternally
            set(value) = definedExternally
        var StatusCode: String /* "HTTP_301" | "HTTP_302" | String */
    }
    interface RegisterTargetsInput {
        var TargetGroupArn: TargetGroupArn
        var Targets: TargetDescriptions
    }
    interface RegisterTargetsOutput
    interface RemoveListenerCertificatesInput {
        var ListenerArn: ListenerArn
        var Certificates: CertificateList
    }
    interface RemoveListenerCertificatesOutput
    interface RemoveTagsInput {
        var ResourceArns: ResourceArns
        var TagKeys: TagKeys
    }
    interface RemoveTagsOutput
    interface Rule {
        var RuleArn: RuleArn?
            get() = definedExternally
            set(value) = definedExternally
        var Priority: String?
            get() = definedExternally
            set(value) = definedExternally
        var Conditions: RuleConditionList?
            get() = definedExternally
            set(value) = definedExternally
        var Actions: Actions?
            get() = definedExternally
            set(value) = definedExternally
        var IsDefault: IsDefault?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RuleCondition {
        var Field: ConditionFieldName?
            get() = definedExternally
            set(value) = definedExternally
        var Values: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
        var HostHeaderConfig: HostHeaderConditionConfig?
            get() = definedExternally
            set(value) = definedExternally
        var PathPatternConfig: PathPatternConditionConfig?
            get() = definedExternally
            set(value) = definedExternally
        var HttpHeaderConfig: HttpHeaderConditionConfig?
            get() = definedExternally
            set(value) = definedExternally
        var QueryStringConfig: QueryStringConditionConfig?
            get() = definedExternally
            set(value) = definedExternally
        var HttpRequestMethodConfig: HttpRequestMethodConditionConfig?
            get() = definedExternally
            set(value) = definedExternally
        var SourceIpConfig: SourceIpConditionConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RulePriorityPair {
        var RuleArn: RuleArn?
            get() = definedExternally
            set(value) = definedExternally
        var Priority: RulePriority?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetIpAddressTypeInput {
        var LoadBalancerArn: LoadBalancerArn
        var IpAddressType: String /* "ipv4" | "dualstack" | String */
    }
    interface SetIpAddressTypeOutput {
        var IpAddressType: String /* "ipv4" | "dualstack" | String */
    }
    interface SetRulePrioritiesInput {
        var RulePriorities: RulePriorityList
    }
    interface SetRulePrioritiesOutput {
        var Rules: Rules?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetSecurityGroupsInput {
        var LoadBalancerArn: LoadBalancerArn
        var SecurityGroups: SecurityGroups
    }
    interface SetSecurityGroupsOutput {
        var SecurityGroupIds: SecurityGroups?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetSubnetsInput {
        var LoadBalancerArn: LoadBalancerArn
        var Subnets: Subnets?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetMappings: SubnetMappings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetSubnetsOutput {
        var AvailabilityZones: AvailabilityZones?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SourceIpConditionConfig {
        var Values: ListOfString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SslPolicy {
        var SslProtocols: SslProtocols?
            get() = definedExternally
            set(value) = definedExternally
        var Ciphers: Ciphers?
            get() = definedExternally
            set(value) = definedExternally
        var Name: SslPolicyName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SubnetMapping {
        var SubnetId: SubnetId?
            get() = definedExternally
            set(value) = definedExternally
        var AllocationId: AllocationId?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateIPv4Address: PrivateIPv4Address?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagDescription {
        var ResourceArn: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TargetDescription {
        var Id: TargetId
        var Port: Port?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: ZoneName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TargetGroup {
        var TargetGroupArn: TargetGroupArn?
            get() = definedExternally
            set(value) = definedExternally
        var TargetGroupName: TargetGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var Protocol: String /* "HTTP" | "HTTPS" | "TCP" | "TLS" | "UDP" | "TCP_UDP" | String */
        var Port: Port?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: VpcId?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckProtocol: String /* "HTTP" | "HTTPS" | "TCP" | "TLS" | "UDP" | "TCP_UDP" | String */
        var HealthCheckPort: HealthCheckPort?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckEnabled: HealthCheckEnabled?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckIntervalSeconds: HealthCheckIntervalSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckTimeoutSeconds: HealthCheckTimeoutSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var HealthyThresholdCount: HealthCheckThresholdCount?
            get() = definedExternally
            set(value) = definedExternally
        var UnhealthyThresholdCount: HealthCheckThresholdCount?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckPath: Path?
            get() = definedExternally
            set(value) = definedExternally
        var Matcher: Matcher?
            get() = definedExternally
            set(value) = definedExternally
        var LoadBalancerArns: LoadBalancerArns?
            get() = definedExternally
            set(value) = definedExternally
        var TargetType: String /* "instance" | "ip" | "lambda" | String */
    }
    interface TargetGroupAttribute {
        var Key: TargetGroupAttributeKey?
            get() = definedExternally
            set(value) = definedExternally
        var Value: TargetGroupAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TargetGroupStickinessConfig {
        var Enabled: TargetGroupStickinessEnabled?
            get() = definedExternally
            set(value) = definedExternally
        var DurationSeconds: TargetGroupStickinessDurationSeconds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TargetGroupTuple {
        var TargetGroupArn: TargetGroupArn?
            get() = definedExternally
            set(value) = definedExternally
        var Weight: TargetGroupWeight?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TargetHealth {
        var State: String /* "initial" | "healthy" | "unhealthy" | "unused" | "draining" | "unavailable" | String */
        var Reason: String /* "Elb.RegistrationInProgress" | "Elb.InitialHealthChecking" | "Target.ResponseCodeMismatch" | "Target.Timeout" | "Target.FailedHealthChecks" | "Target.NotRegistered" | "Target.NotInUse" | "Target.DeregistrationInProgress" | "Target.InvalidState" | "Target.IpUnusable" | "Target.HealthCheckDisabled" | "Elb.InternalError" | String */
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TargetHealthDescription {
        var Target: TargetDescription?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckPort: HealthCheckPort?
            get() = definedExternally
            set(value) = definedExternally
        var TargetHealth: TargetHealth?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2015-12-01" | "latest" | String */
    }
}