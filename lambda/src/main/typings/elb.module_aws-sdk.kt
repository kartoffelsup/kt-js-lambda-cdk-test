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
import ELB.AdditionalAttribute
import ELB.AppCookieStickinessPolicy
import ELB.BackendServerDescription
import ELB.InstanceState
import ELB.Instance
import ELB.LBCookieStickinessPolicy
import ELB.Limit
import ELB.ListenerDescription
import ELB.Listener
import ELB.LoadBalancerDescription
import ELB.PolicyAttributeDescription
import ELB.PolicyAttributeTypeDescription
import ELB.PolicyAttribute
import ELB.PolicyDescription
import ELB.PolicyTypeDescription
import ELB.TagDescription
import ELB.TagKeyOnly
import ELB.Tag
import ELB.AddTagsInput
import ELB.AddTagsOutput
import ELB.ApplySecurityGroupsToLoadBalancerInput
import ELB.ApplySecurityGroupsToLoadBalancerOutput
import ELB.AttachLoadBalancerToSubnetsInput
import ELB.AttachLoadBalancerToSubnetsOutput
import ELB.ConfigureHealthCheckInput
import ELB.ConfigureHealthCheckOutput
import ELB.CreateAppCookieStickinessPolicyInput
import ELB.CreateAppCookieStickinessPolicyOutput
import ELB.CreateLBCookieStickinessPolicyInput
import ELB.CreateLBCookieStickinessPolicyOutput
import ELB.CreateAccessPointInput
import ELB.CreateAccessPointOutput
import ELB.CreateLoadBalancerListenerInput
import ELB.CreateLoadBalancerListenerOutput
import ELB.CreateLoadBalancerPolicyInput
import ELB.CreateLoadBalancerPolicyOutput
import ELB.DeleteAccessPointInput
import ELB.DeleteAccessPointOutput
import ELB.DeleteLoadBalancerListenerInput
import ELB.DeleteLoadBalancerListenerOutput
import ELB.DeleteLoadBalancerPolicyInput
import ELB.DeleteLoadBalancerPolicyOutput
import ELB.DeregisterEndPointsInput
import ELB.DeregisterEndPointsOutput
import ELB.DescribeAccountLimitsInput
import ELB.DescribeAccountLimitsOutput
import ELB.DescribeEndPointStateInput
import ELB.DescribeEndPointStateOutput
import ELB.DescribeLoadBalancerAttributesInput
import ELB.DescribeLoadBalancerAttributesOutput
import ELB.DescribeLoadBalancerPoliciesInput
import ELB.DescribeLoadBalancerPoliciesOutput
import ELB.DescribeLoadBalancerPolicyTypesInput
import ELB.DescribeLoadBalancerPolicyTypesOutput
import ELB.DescribeAccessPointsInput
import ELB.DescribeAccessPointsOutput
import ELB.DescribeTagsInput
import ELB.DescribeTagsOutput
import ELB.DetachLoadBalancerFromSubnetsInput
import ELB.DetachLoadBalancerFromSubnetsOutput
import ELB.RemoveAvailabilityZonesInput
import ELB.RemoveAvailabilityZonesOutput
import ELB.AddAvailabilityZonesInput
import ELB.AddAvailabilityZonesOutput
import ELB.ModifyLoadBalancerAttributesInput
import ELB.ModifyLoadBalancerAttributesOutput
import ELB.RegisterEndPointsInput
import ELB.RegisterEndPointsOutput
import ELB.RemoveTagsInput
import ELB.RemoveTagsOutput
import ELB.SetLoadBalancerListenerSSLCertificateInput
import ELB.SetLoadBalancerListenerSSLCertificateOutput
import ELB.SetLoadBalancerPoliciesForBackendServerInput
import ELB.SetLoadBalancerPoliciesForBackendServerOutput
import ELB.SetLoadBalancerPoliciesOfListenerInput
import ELB.SetLoadBalancerPoliciesOfListenerOutput
import ELB.HealthCheck
import ELB.LoadBalancerAttributes
import ELB.CrossZoneLoadBalancing
import ELB.AccessLog
import ELB.ConnectionDraining
import ELB.ConnectionSettings
import ELB.Policies
import ELB.SourceSecurityGroup

typealias AccessLogEnabled = Boolean

typealias AccessLogInterval = Number

typealias AccessLogPrefix = String

typealias AccessPointName = String

typealias AccessPointPort = Number

typealias AdditionalAttributeKey = String

typealias AdditionalAttributeValue = String

typealias AdditionalAttributes = Array<AdditionalAttribute>

typealias AppCookieStickinessPolicies = Array<AppCookieStickinessPolicy>

typealias AttributeName = String

typealias AttributeType = String

typealias AttributeValue = String

typealias AvailabilityZone = String

typealias AvailabilityZones = Array<AvailabilityZone>

typealias BackendServerDescriptions = Array<BackendServerDescription>

typealias Cardinality = String

typealias ConnectionDrainingEnabled = Boolean

typealias ConnectionDrainingTimeout = Number

typealias CookieExpirationPeriod = Number

typealias CookieName = String

typealias CreatedTime = Date

typealias CrossZoneLoadBalancingEnabled = Boolean

typealias DNSName = String

typealias DefaultValue = String

typealias Description = String

typealias EndPointPort = Number

typealias HealthCheckInterval = Number

typealias HealthCheckTarget = String

typealias HealthCheckTimeout = Number

typealias HealthyThreshold = Number

typealias IdleTimeout = Number

typealias InstanceId = String

typealias InstancePort = Number

typealias InstanceStates = Array<InstanceState>

typealias Instances = Array<Instance>

typealias LBCookieStickinessPolicies = Array<LBCookieStickinessPolicy>

typealias Limits = Array<Limit>

typealias ListenerDescriptions = Array<ListenerDescription>

typealias Listeners = Array<Listener>

typealias LoadBalancerDescriptions = Array<LoadBalancerDescription>

typealias LoadBalancerNames = Array<AccessPointName>

typealias LoadBalancerNamesMax20 = Array<AccessPointName>

typealias LoadBalancerScheme = String

typealias Marker = String

typealias Max = String

typealias Name = String

typealias PageSize = Number

typealias PolicyAttributeDescriptions = Array<PolicyAttributeDescription>

typealias PolicyAttributeTypeDescriptions = Array<PolicyAttributeTypeDescription>

typealias PolicyAttributes = Array<PolicyAttribute>

typealias PolicyDescriptions = Array<PolicyDescription>

typealias PolicyName = String

typealias PolicyNames = Array<PolicyName>

typealias PolicyTypeDescriptions = Array<PolicyTypeDescription>

typealias PolicyTypeName = String

typealias PolicyTypeNames = Array<PolicyTypeName>

typealias Ports = Array<AccessPointPort>

typealias Protocol = String

typealias ReasonCode = String

typealias S3BucketName = String

typealias SSLCertificateId = String

typealias SecurityGroupId = String

typealias SecurityGroupName = String

typealias SecurityGroupOwnerAlias = String

typealias SecurityGroups = Array<SecurityGroupId>

typealias State = String

typealias SubnetId = String

typealias Subnets = Array<SubnetId>

typealias TagDescriptions = Array<TagDescription>

typealias TagKey = String

typealias TagKeyList = Array<TagKeyOnly>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias UnhealthyThreshold = Number

typealias VPCId = String

@JsModule("aws-sdk")
external open class ELB(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ELB.Types.ClientConfiguration */
    open fun addTags(params: AddTagsInput, callback: (err: AWSError, data: AddTagsOutput) -> Unit = definedExternally): Request<AddTagsOutput, AWSError>
    open fun addTags(callback: (err: AWSError, data: AddTagsOutput) -> Unit = definedExternally): Request<AddTagsOutput, AWSError>
    open fun applySecurityGroupsToLoadBalancer(params: ApplySecurityGroupsToLoadBalancerInput, callback: (err: AWSError, data: ApplySecurityGroupsToLoadBalancerOutput) -> Unit = definedExternally): Request<ApplySecurityGroupsToLoadBalancerOutput, AWSError>
    open fun applySecurityGroupsToLoadBalancer(callback: (err: AWSError, data: ApplySecurityGroupsToLoadBalancerOutput) -> Unit = definedExternally): Request<ApplySecurityGroupsToLoadBalancerOutput, AWSError>
    open fun attachLoadBalancerToSubnets(params: AttachLoadBalancerToSubnetsInput, callback: (err: AWSError, data: AttachLoadBalancerToSubnetsOutput) -> Unit = definedExternally): Request<AttachLoadBalancerToSubnetsOutput, AWSError>
    open fun attachLoadBalancerToSubnets(callback: (err: AWSError, data: AttachLoadBalancerToSubnetsOutput) -> Unit = definedExternally): Request<AttachLoadBalancerToSubnetsOutput, AWSError>
    open fun configureHealthCheck(params: ConfigureHealthCheckInput, callback: (err: AWSError, data: ConfigureHealthCheckOutput) -> Unit = definedExternally): Request<ConfigureHealthCheckOutput, AWSError>
    open fun configureHealthCheck(callback: (err: AWSError, data: ConfigureHealthCheckOutput) -> Unit = definedExternally): Request<ConfigureHealthCheckOutput, AWSError>
    open fun createAppCookieStickinessPolicy(params: CreateAppCookieStickinessPolicyInput, callback: (err: AWSError, data: CreateAppCookieStickinessPolicyOutput) -> Unit = definedExternally): Request<CreateAppCookieStickinessPolicyOutput, AWSError>
    open fun createAppCookieStickinessPolicy(callback: (err: AWSError, data: CreateAppCookieStickinessPolicyOutput) -> Unit = definedExternally): Request<CreateAppCookieStickinessPolicyOutput, AWSError>
    open fun createLBCookieStickinessPolicy(params: CreateLBCookieStickinessPolicyInput, callback: (err: AWSError, data: CreateLBCookieStickinessPolicyOutput) -> Unit = definedExternally): Request<CreateLBCookieStickinessPolicyOutput, AWSError>
    open fun createLBCookieStickinessPolicy(callback: (err: AWSError, data: CreateLBCookieStickinessPolicyOutput) -> Unit = definedExternally): Request<CreateLBCookieStickinessPolicyOutput, AWSError>
    open fun createLoadBalancer(params: CreateAccessPointInput, callback: (err: AWSError, data: CreateAccessPointOutput) -> Unit = definedExternally): Request<CreateAccessPointOutput, AWSError>
    open fun createLoadBalancer(callback: (err: AWSError, data: CreateAccessPointOutput) -> Unit = definedExternally): Request<CreateAccessPointOutput, AWSError>
    open fun createLoadBalancerListeners(params: CreateLoadBalancerListenerInput, callback: (err: AWSError, data: CreateLoadBalancerListenerOutput) -> Unit = definedExternally): Request<CreateLoadBalancerListenerOutput, AWSError>
    open fun createLoadBalancerListeners(callback: (err: AWSError, data: CreateLoadBalancerListenerOutput) -> Unit = definedExternally): Request<CreateLoadBalancerListenerOutput, AWSError>
    open fun createLoadBalancerPolicy(params: CreateLoadBalancerPolicyInput, callback: (err: AWSError, data: CreateLoadBalancerPolicyOutput) -> Unit = definedExternally): Request<CreateLoadBalancerPolicyOutput, AWSError>
    open fun createLoadBalancerPolicy(callback: (err: AWSError, data: CreateLoadBalancerPolicyOutput) -> Unit = definedExternally): Request<CreateLoadBalancerPolicyOutput, AWSError>
    open fun deleteLoadBalancer(params: DeleteAccessPointInput, callback: (err: AWSError, data: DeleteAccessPointOutput) -> Unit = definedExternally): Request<DeleteAccessPointOutput, AWSError>
    open fun deleteLoadBalancer(callback: (err: AWSError, data: DeleteAccessPointOutput) -> Unit = definedExternally): Request<DeleteAccessPointOutput, AWSError>
    open fun deleteLoadBalancerListeners(params: DeleteLoadBalancerListenerInput, callback: (err: AWSError, data: DeleteLoadBalancerListenerOutput) -> Unit = definedExternally): Request<DeleteLoadBalancerListenerOutput, AWSError>
    open fun deleteLoadBalancerListeners(callback: (err: AWSError, data: DeleteLoadBalancerListenerOutput) -> Unit = definedExternally): Request<DeleteLoadBalancerListenerOutput, AWSError>
    open fun deleteLoadBalancerPolicy(params: DeleteLoadBalancerPolicyInput, callback: (err: AWSError, data: DeleteLoadBalancerPolicyOutput) -> Unit = definedExternally): Request<DeleteLoadBalancerPolicyOutput, AWSError>
    open fun deleteLoadBalancerPolicy(callback: (err: AWSError, data: DeleteLoadBalancerPolicyOutput) -> Unit = definedExternally): Request<DeleteLoadBalancerPolicyOutput, AWSError>
    open fun deregisterInstancesFromLoadBalancer(params: DeregisterEndPointsInput, callback: (err: AWSError, data: DeregisterEndPointsOutput) -> Unit = definedExternally): Request<DeregisterEndPointsOutput, AWSError>
    open fun deregisterInstancesFromLoadBalancer(callback: (err: AWSError, data: DeregisterEndPointsOutput) -> Unit = definedExternally): Request<DeregisterEndPointsOutput, AWSError>
    open fun describeAccountLimits(params: DescribeAccountLimitsInput, callback: (err: AWSError, data: DescribeAccountLimitsOutput) -> Unit = definedExternally): Request<DescribeAccountLimitsOutput, AWSError>
    open fun describeAccountLimits(callback: (err: AWSError, data: DescribeAccountLimitsOutput) -> Unit = definedExternally): Request<DescribeAccountLimitsOutput, AWSError>
    open fun describeInstanceHealth(params: DescribeEndPointStateInput, callback: (err: AWSError, data: DescribeEndPointStateOutput) -> Unit = definedExternally): Request<DescribeEndPointStateOutput, AWSError>
    open fun describeInstanceHealth(callback: (err: AWSError, data: DescribeEndPointStateOutput) -> Unit = definedExternally): Request<DescribeEndPointStateOutput, AWSError>
    open fun describeLoadBalancerAttributes(params: DescribeLoadBalancerAttributesInput, callback: (err: AWSError, data: DescribeLoadBalancerAttributesOutput) -> Unit = definedExternally): Request<DescribeLoadBalancerAttributesOutput, AWSError>
    open fun describeLoadBalancerAttributes(callback: (err: AWSError, data: DescribeLoadBalancerAttributesOutput) -> Unit = definedExternally): Request<DescribeLoadBalancerAttributesOutput, AWSError>
    open fun describeLoadBalancerPolicies(params: DescribeLoadBalancerPoliciesInput, callback: (err: AWSError, data: DescribeLoadBalancerPoliciesOutput) -> Unit = definedExternally): Request<DescribeLoadBalancerPoliciesOutput, AWSError>
    open fun describeLoadBalancerPolicies(callback: (err: AWSError, data: DescribeLoadBalancerPoliciesOutput) -> Unit = definedExternally): Request<DescribeLoadBalancerPoliciesOutput, AWSError>
    open fun describeLoadBalancerPolicyTypes(params: DescribeLoadBalancerPolicyTypesInput, callback: (err: AWSError, data: DescribeLoadBalancerPolicyTypesOutput) -> Unit = definedExternally): Request<DescribeLoadBalancerPolicyTypesOutput, AWSError>
    open fun describeLoadBalancerPolicyTypes(callback: (err: AWSError, data: DescribeLoadBalancerPolicyTypesOutput) -> Unit = definedExternally): Request<DescribeLoadBalancerPolicyTypesOutput, AWSError>
    open fun describeLoadBalancers(params: DescribeAccessPointsInput, callback: (err: AWSError, data: DescribeAccessPointsOutput) -> Unit = definedExternally): Request<DescribeAccessPointsOutput, AWSError>
    open fun describeLoadBalancers(callback: (err: AWSError, data: DescribeAccessPointsOutput) -> Unit = definedExternally): Request<DescribeAccessPointsOutput, AWSError>
    open fun describeTags(params: DescribeTagsInput, callback: (err: AWSError, data: DescribeTagsOutput) -> Unit = definedExternally): Request<DescribeTagsOutput, AWSError>
    open fun describeTags(callback: (err: AWSError, data: DescribeTagsOutput) -> Unit = definedExternally): Request<DescribeTagsOutput, AWSError>
    open fun detachLoadBalancerFromSubnets(params: DetachLoadBalancerFromSubnetsInput, callback: (err: AWSError, data: DetachLoadBalancerFromSubnetsOutput) -> Unit = definedExternally): Request<DetachLoadBalancerFromSubnetsOutput, AWSError>
    open fun detachLoadBalancerFromSubnets(callback: (err: AWSError, data: DetachLoadBalancerFromSubnetsOutput) -> Unit = definedExternally): Request<DetachLoadBalancerFromSubnetsOutput, AWSError>
    open fun disableAvailabilityZonesForLoadBalancer(params: RemoveAvailabilityZonesInput, callback: (err: AWSError, data: RemoveAvailabilityZonesOutput) -> Unit = definedExternally): Request<RemoveAvailabilityZonesOutput, AWSError>
    open fun disableAvailabilityZonesForLoadBalancer(callback: (err: AWSError, data: RemoveAvailabilityZonesOutput) -> Unit = definedExternally): Request<RemoveAvailabilityZonesOutput, AWSError>
    open fun enableAvailabilityZonesForLoadBalancer(params: AddAvailabilityZonesInput, callback: (err: AWSError, data: AddAvailabilityZonesOutput) -> Unit = definedExternally): Request<AddAvailabilityZonesOutput, AWSError>
    open fun enableAvailabilityZonesForLoadBalancer(callback: (err: AWSError, data: AddAvailabilityZonesOutput) -> Unit = definedExternally): Request<AddAvailabilityZonesOutput, AWSError>
    open fun modifyLoadBalancerAttributes(params: ModifyLoadBalancerAttributesInput, callback: (err: AWSError, data: ModifyLoadBalancerAttributesOutput) -> Unit = definedExternally): Request<ModifyLoadBalancerAttributesOutput, AWSError>
    open fun modifyLoadBalancerAttributes(callback: (err: AWSError, data: ModifyLoadBalancerAttributesOutput) -> Unit = definedExternally): Request<ModifyLoadBalancerAttributesOutput, AWSError>
    open fun registerInstancesWithLoadBalancer(params: RegisterEndPointsInput, callback: (err: AWSError, data: RegisterEndPointsOutput) -> Unit = definedExternally): Request<RegisterEndPointsOutput, AWSError>
    open fun registerInstancesWithLoadBalancer(callback: (err: AWSError, data: RegisterEndPointsOutput) -> Unit = definedExternally): Request<RegisterEndPointsOutput, AWSError>
    open fun removeTags(params: RemoveTagsInput, callback: (err: AWSError, data: RemoveTagsOutput) -> Unit = definedExternally): Request<RemoveTagsOutput, AWSError>
    open fun removeTags(callback: (err: AWSError, data: RemoveTagsOutput) -> Unit = definedExternally): Request<RemoveTagsOutput, AWSError>
    open fun setLoadBalancerListenerSSLCertificate(params: SetLoadBalancerListenerSSLCertificateInput, callback: (err: AWSError, data: SetLoadBalancerListenerSSLCertificateOutput) -> Unit = definedExternally): Request<SetLoadBalancerListenerSSLCertificateOutput, AWSError>
    open fun setLoadBalancerListenerSSLCertificate(callback: (err: AWSError, data: SetLoadBalancerListenerSSLCertificateOutput) -> Unit = definedExternally): Request<SetLoadBalancerListenerSSLCertificateOutput, AWSError>
    open fun setLoadBalancerPoliciesForBackendServer(params: SetLoadBalancerPoliciesForBackendServerInput, callback: (err: AWSError, data: SetLoadBalancerPoliciesForBackendServerOutput) -> Unit = definedExternally): Request<SetLoadBalancerPoliciesForBackendServerOutput, AWSError>
    open fun setLoadBalancerPoliciesForBackendServer(callback: (err: AWSError, data: SetLoadBalancerPoliciesForBackendServerOutput) -> Unit = definedExternally): Request<SetLoadBalancerPoliciesForBackendServerOutput, AWSError>
    open fun setLoadBalancerPoliciesOfListener(params: SetLoadBalancerPoliciesOfListenerInput, callback: (err: AWSError, data: SetLoadBalancerPoliciesOfListenerOutput) -> Unit = definedExternally): Request<SetLoadBalancerPoliciesOfListenerOutput, AWSError>
    open fun setLoadBalancerPoliciesOfListener(callback: (err: AWSError, data: SetLoadBalancerPoliciesOfListenerOutput) -> Unit = definedExternally): Request<SetLoadBalancerPoliciesOfListenerOutput, AWSError>
    open fun waitFor(state: String, params: DescribeEndPointStateInput, callback: (err: AWSError, data: DescribeEndPointStateOutput) -> Unit = definedExternally): Request<DescribeEndPointStateOutput, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DescribeEndPointStateOutput) -> Unit = definedExternally): Request<DescribeEndPointStateOutput, AWSError>
    interface AccessLog {
        var Enabled: AccessLogEnabled
        var S3BucketName: S3BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var EmitInterval: AccessLogInterval?
            get() = definedExternally
            set(value) = definedExternally
        var S3BucketPrefix: AccessLogPrefix?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddAvailabilityZonesInput {
        var LoadBalancerName: AccessPointName
        var AvailabilityZones: AvailabilityZones
    }
    interface AddAvailabilityZonesOutput {
        var AvailabilityZones: AvailabilityZones?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddTagsInput {
        var LoadBalancerNames: LoadBalancerNames
        var Tags: TagList
    }
    interface AddTagsOutput
    interface AdditionalAttribute {
        var Key: AdditionalAttributeKey?
            get() = definedExternally
            set(value) = definedExternally
        var Value: AdditionalAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AppCookieStickinessPolicy {
        var PolicyName: PolicyName?
            get() = definedExternally
            set(value) = definedExternally
        var CookieName: CookieName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplySecurityGroupsToLoadBalancerInput {
        var LoadBalancerName: AccessPointName
        var SecurityGroups: SecurityGroups
    }
    interface ApplySecurityGroupsToLoadBalancerOutput {
        var SecurityGroups: SecurityGroups?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttachLoadBalancerToSubnetsInput {
        var LoadBalancerName: AccessPointName
        var Subnets: Subnets
    }
    interface AttachLoadBalancerToSubnetsOutput {
        var Subnets: Subnets?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BackendServerDescription {
        var InstancePort: InstancePort?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyNames: PolicyNames?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigureHealthCheckInput {
        var LoadBalancerName: AccessPointName
        var HealthCheck: HealthCheck
    }
    interface ConfigureHealthCheckOutput {
        var HealthCheck: HealthCheck?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConnectionDraining {
        var Enabled: ConnectionDrainingEnabled
        var Timeout: ConnectionDrainingTimeout?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConnectionSettings {
        var IdleTimeout: IdleTimeout
    }
    interface CreateAccessPointInput {
        var LoadBalancerName: AccessPointName
        var Listeners: Listeners
        var AvailabilityZones: AvailabilityZones?
            get() = definedExternally
            set(value) = definedExternally
        var Subnets: Subnets?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroups: SecurityGroups?
            get() = definedExternally
            set(value) = definedExternally
        var Scheme: LoadBalancerScheme?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAccessPointOutput {
        var DNSName: DNSName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAppCookieStickinessPolicyInput {
        var LoadBalancerName: AccessPointName
        var PolicyName: PolicyName
        var CookieName: CookieName
    }
    interface CreateAppCookieStickinessPolicyOutput
    interface CreateLBCookieStickinessPolicyInput {
        var LoadBalancerName: AccessPointName
        var PolicyName: PolicyName
        var CookieExpirationPeriod: CookieExpirationPeriod?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLBCookieStickinessPolicyOutput
    interface CreateLoadBalancerListenerInput {
        var LoadBalancerName: AccessPointName
        var Listeners: Listeners
    }
    interface CreateLoadBalancerListenerOutput
    interface CreateLoadBalancerPolicyInput {
        var LoadBalancerName: AccessPointName
        var PolicyName: PolicyName
        var PolicyTypeName: PolicyTypeName
        var PolicyAttributes: PolicyAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLoadBalancerPolicyOutput
    interface CrossZoneLoadBalancing {
        var Enabled: CrossZoneLoadBalancingEnabled
    }
    interface DeleteAccessPointInput {
        var LoadBalancerName: AccessPointName
    }
    interface DeleteAccessPointOutput
    interface DeleteLoadBalancerListenerInput {
        var LoadBalancerName: AccessPointName
        var LoadBalancerPorts: Ports
    }
    interface DeleteLoadBalancerListenerOutput
    interface DeleteLoadBalancerPolicyInput {
        var LoadBalancerName: AccessPointName
        var PolicyName: PolicyName
    }
    interface DeleteLoadBalancerPolicyOutput
    interface DeregisterEndPointsInput {
        var LoadBalancerName: AccessPointName
        var Instances: Instances
    }
    interface DeregisterEndPointsOutput {
        var Instances: Instances?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAccessPointsInput {
        var LoadBalancerNames: LoadBalancerNames?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAccessPointsOutput {
        var LoadBalancerDescriptions: LoadBalancerDescriptions?
            get() = definedExternally
            set(value) = definedExternally
        var NextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
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
    interface DescribeEndPointStateInput {
        var LoadBalancerName: AccessPointName
        var Instances: Instances?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEndPointStateOutput {
        var InstanceStates: InstanceStates?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLoadBalancerAttributesInput {
        var LoadBalancerName: AccessPointName
    }
    interface DescribeLoadBalancerAttributesOutput {
        var LoadBalancerAttributes: LoadBalancerAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLoadBalancerPoliciesInput {
        var LoadBalancerName: AccessPointName?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyNames: PolicyNames?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLoadBalancerPoliciesOutput {
        var PolicyDescriptions: PolicyDescriptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLoadBalancerPolicyTypesInput {
        var PolicyTypeNames: PolicyTypeNames?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLoadBalancerPolicyTypesOutput {
        var PolicyTypeDescriptions: PolicyTypeDescriptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTagsInput {
        var LoadBalancerNames: LoadBalancerNamesMax20
    }
    interface DescribeTagsOutput {
        var TagDescriptions: TagDescriptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetachLoadBalancerFromSubnetsInput {
        var LoadBalancerName: AccessPointName
        var Subnets: Subnets
    }
    interface DetachLoadBalancerFromSubnetsOutput {
        var Subnets: Subnets?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HealthCheck {
        var Target: HealthCheckTarget
        var Interval: HealthCheckInterval
        var Timeout: HealthCheckTimeout
        var UnhealthyThreshold: UnhealthyThreshold
        var HealthyThreshold: HealthyThreshold
    }
    interface Instance {
        var InstanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceState {
        var InstanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var State: State?
            get() = definedExternally
            set(value) = definedExternally
        var ReasonCode: ReasonCode?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LBCookieStickinessPolicy {
        var PolicyName: PolicyName?
            get() = definedExternally
            set(value) = definedExternally
        var CookieExpirationPeriod: CookieExpirationPeriod?
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
        var Protocol: Protocol
        var LoadBalancerPort: AccessPointPort
        var InstanceProtocol: Protocol?
            get() = definedExternally
            set(value) = definedExternally
        var InstancePort: InstancePort
        var SSLCertificateId: SSLCertificateId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListenerDescription {
        var Listener: Listener?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyNames: PolicyNames?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoadBalancerAttributes {
        var CrossZoneLoadBalancing: CrossZoneLoadBalancing?
            get() = definedExternally
            set(value) = definedExternally
        var AccessLog: AccessLog?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionDraining: ConnectionDraining?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionSettings: ConnectionSettings?
            get() = definedExternally
            set(value) = definedExternally
        var AdditionalAttributes: AdditionalAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoadBalancerDescription {
        var LoadBalancerName: AccessPointName?
            get() = definedExternally
            set(value) = definedExternally
        var DNSName: DNSName?
            get() = definedExternally
            set(value) = definedExternally
        var CanonicalHostedZoneName: DNSName?
            get() = definedExternally
            set(value) = definedExternally
        var CanonicalHostedZoneNameID: DNSName?
            get() = definedExternally
            set(value) = definedExternally
        var ListenerDescriptions: ListenerDescriptions?
            get() = definedExternally
            set(value) = definedExternally
        var Policies: Policies?
            get() = definedExternally
            set(value) = definedExternally
        var BackendServerDescriptions: BackendServerDescriptions?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZones: AvailabilityZones?
            get() = definedExternally
            set(value) = definedExternally
        var Subnets: Subnets?
            get() = definedExternally
            set(value) = definedExternally
        var VPCId: VPCId?
            get() = definedExternally
            set(value) = definedExternally
        var Instances: Instances?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheck: HealthCheck?
            get() = definedExternally
            set(value) = definedExternally
        var SourceSecurityGroup: SourceSecurityGroup?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroups: SecurityGroups?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: CreatedTime?
            get() = definedExternally
            set(value) = definedExternally
        var Scheme: LoadBalancerScheme?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyLoadBalancerAttributesInput {
        var LoadBalancerName: AccessPointName
        var LoadBalancerAttributes: LoadBalancerAttributes
    }
    interface ModifyLoadBalancerAttributesOutput {
        var LoadBalancerName: AccessPointName?
            get() = definedExternally
            set(value) = definedExternally
        var LoadBalancerAttributes: LoadBalancerAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Policies {
        var AppCookieStickinessPolicies: AppCookieStickinessPolicies?
            get() = definedExternally
            set(value) = definedExternally
        var LBCookieStickinessPolicies: LBCookieStickinessPolicies?
            get() = definedExternally
            set(value) = definedExternally
        var OtherPolicies: PolicyNames?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyAttribute {
        var AttributeName: AttributeName?
            get() = definedExternally
            set(value) = definedExternally
        var AttributeValue: AttributeValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyAttributeDescription {
        var AttributeName: AttributeName?
            get() = definedExternally
            set(value) = definedExternally
        var AttributeValue: AttributeValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyAttributeTypeDescription {
        var AttributeName: AttributeName?
            get() = definedExternally
            set(value) = definedExternally
        var AttributeType: AttributeType?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultValue: DefaultValue?
            get() = definedExternally
            set(value) = definedExternally
        var Cardinality: Cardinality?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyDescription {
        var PolicyName: PolicyName?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyTypeName: PolicyTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyAttributeDescriptions: PolicyAttributeDescriptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyTypeDescription {
        var PolicyTypeName: PolicyTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyAttributeTypeDescriptions: PolicyAttributeTypeDescriptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterEndPointsInput {
        var LoadBalancerName: AccessPointName
        var Instances: Instances
    }
    interface RegisterEndPointsOutput {
        var Instances: Instances?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveAvailabilityZonesInput {
        var LoadBalancerName: AccessPointName
        var AvailabilityZones: AvailabilityZones
    }
    interface RemoveAvailabilityZonesOutput {
        var AvailabilityZones: AvailabilityZones?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveTagsInput {
        var LoadBalancerNames: LoadBalancerNames
        var Tags: TagKeyList
    }
    interface RemoveTagsOutput
    interface SetLoadBalancerListenerSSLCertificateInput {
        var LoadBalancerName: AccessPointName
        var LoadBalancerPort: AccessPointPort
        var SSLCertificateId: SSLCertificateId
    }
    interface SetLoadBalancerListenerSSLCertificateOutput
    interface SetLoadBalancerPoliciesForBackendServerInput {
        var LoadBalancerName: AccessPointName
        var InstancePort: EndPointPort
        var PolicyNames: PolicyNames
    }
    interface SetLoadBalancerPoliciesForBackendServerOutput
    interface SetLoadBalancerPoliciesOfListenerInput {
        var LoadBalancerName: AccessPointName
        var LoadBalancerPort: AccessPointPort
        var PolicyNames: PolicyNames
    }
    interface SetLoadBalancerPoliciesOfListenerOutput
    interface SourceSecurityGroup {
        var OwnerAlias: SecurityGroupOwnerAlias?
            get() = definedExternally
            set(value) = definedExternally
        var GroupName: SecurityGroupName?
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
        var LoadBalancerName: AccessPointName?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagKeyOnly {
        var Key: TagKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2012-06-01" | "latest" | String */
    }
}