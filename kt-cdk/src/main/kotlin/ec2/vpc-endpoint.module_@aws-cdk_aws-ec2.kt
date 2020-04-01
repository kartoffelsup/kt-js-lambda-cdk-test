@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import core.*
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

external interface IVpcEndpoint : IResource {
    var vpcEndpointId: String
}

external open class VpcEndpoint : Resource, IVpcEndpoint {
    override var vpcEndpointId: String
    open var policyDocument: Any
    open fun addToPolicy(statement: PolicyStatement)
}

external interface IGatewayVpcEndpoint : IVpcEndpoint

external enum class VpcEndpointType {
    INTERFACE /* = "Interface" */,
    GATEWAY /* = "Gateway" */
}

external interface IGatewayVpcEndpointService {
    var name: String
}

external open class GatewayVpcEndpointAwsService(name: String, prefix: String = definedExternally) : IGatewayVpcEndpointService {
    override var name: String

    companion object {
        var DYNAMODB: GatewayVpcEndpointAwsService
        var S3: GatewayVpcEndpointAwsService
    }
}

external interface GatewayVpcEndpointOptions {
    var service: IGatewayVpcEndpointService
    var subnets: Array<SubnetSelection>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GatewayVpcEndpointProps : GatewayVpcEndpointOptions {
    var vpc: IVpc
}

external open class GatewayVpcEndpoint(scope: Construct, id: String, props: GatewayVpcEndpointProps) : VpcEndpoint, IGatewayVpcEndpoint {
    override var vpcEndpointId: String
    open var vpcEndpointCreationTimestamp: String
    open var vpcEndpointNetworkInterfaceIds: Array<String>
    open var vpcEndpointDnsEntries: Array<String>

    companion object {
        fun fromGatewayVpcEndpointId(scope: Construct, id: String, gatewayVpcEndpointId: String): IGatewayVpcEndpoint
    }
}

external interface IInterfaceVpcEndpointService {
    var name: String
    var port: Number
    var privateDnsDefault: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class InterfaceVpcEndpointService(name: String, port: Number = definedExternally) : IInterfaceVpcEndpointService {
    override var name: String
    override var port: Number
}

external open class InterfaceVpcEndpointAwsService(name: String, prefix: String = definedExternally, port: Number = definedExternally) : IInterfaceVpcEndpointService {
    override var name: String
    override var port: Number

    companion object {
        var SAGEMAKER_NOTEBOOK: InterfaceVpcEndpointAwsService
        var CLOUDFORMATION: InterfaceVpcEndpointAwsService
        var CLOUDTRAIL: InterfaceVpcEndpointAwsService
        var CODEBUILD: InterfaceVpcEndpointAwsService
        var CODEBUILD_FIPS: InterfaceVpcEndpointAwsService
        var CODECOMMIT: InterfaceVpcEndpointAwsService
        var CODECOMMIT_FIPS: InterfaceVpcEndpointAwsService
        var CODEPIPELINE: InterfaceVpcEndpointAwsService
        var CONFIG: InterfaceVpcEndpointAwsService
        var EC2: InterfaceVpcEndpointAwsService
        var EC2_MESSAGES: InterfaceVpcEndpointAwsService
        var ECR: InterfaceVpcEndpointAwsService
        var ECR_DOCKER: InterfaceVpcEndpointAwsService
        var ECS: InterfaceVpcEndpointAwsService
        var ECS_AGENT: InterfaceVpcEndpointAwsService
        var ECS_TELEMETRY: InterfaceVpcEndpointAwsService
        var ELASTIC_INFERENCE_RUNTIME: InterfaceVpcEndpointAwsService
        var ELASTIC_LOAD_BALANCING: InterfaceVpcEndpointAwsService
        var CLOUDWATCH_EVENTS: InterfaceVpcEndpointAwsService
        var APIGATEWAY: InterfaceVpcEndpointAwsService
        var CODECOMMIT_GIT: InterfaceVpcEndpointAwsService
        var CODECOMMIT_GIT_FIPS: InterfaceVpcEndpointAwsService
        var KINESIS_STREAMS: InterfaceVpcEndpointAwsService
        var KMS: InterfaceVpcEndpointAwsService
        var CLOUDWATCH_LOGS: InterfaceVpcEndpointAwsService
        var CLOUDWATCH: InterfaceVpcEndpointAwsService
        var SAGEMAKER_API: InterfaceVpcEndpointAwsService
        var SAGEMAKER_RUNTIME: InterfaceVpcEndpointAwsService
        var SAGEMAKER_RUNTIME_FIPS: InterfaceVpcEndpointAwsService
        var SECRETS_MANAGER: InterfaceVpcEndpointAwsService
        var SERVICE_CATALOG: InterfaceVpcEndpointAwsService
        var SNS: InterfaceVpcEndpointAwsService
        var SQS: InterfaceVpcEndpointAwsService
        var SSM: InterfaceVpcEndpointAwsService
        var SSM_MESSAGES: InterfaceVpcEndpointAwsService
        var STS: InterfaceVpcEndpointAwsService
        var TRANSFER: InterfaceVpcEndpointAwsService
        var STORAGE_GATEWAY: InterfaceVpcEndpointAwsService
        var REKOGNITION: InterfaceVpcEndpointAwsService
        var REKOGNITION_FIPS: InterfaceVpcEndpointAwsService
    }
}

external interface InterfaceVpcEndpointOptions {
    var service: IInterfaceVpcEndpointService
    var privateDnsEnabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var subnets: SubnetSelection?
        get() = definedExternally
        set(value) = definedExternally
    var securityGroups: Array<ISecurityGroup>?
        get() = definedExternally
        set(value) = definedExternally
    var open: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface InterfaceVpcEndpointProps : InterfaceVpcEndpointOptions {
    var vpc: IVpc
}

external interface IInterfaceVpcEndpoint : IVpcEndpoint, IConnectable

external open class InterfaceVpcEndpoint(scope: Construct, id: String, props: InterfaceVpcEndpointProps) : VpcEndpoint, IInterfaceVpcEndpoint {
    override var vpcEndpointId: String
    open var vpcEndpointCreationTimestamp: String
    open var vpcEndpointDnsEntries: Array<String>
    open var vpcEndpointNetworkInterfaceIds: Array<String>
    open var securityGroupId: String
    override var connections: Connections

    companion object {
        fun fromInterfaceVpcEndpointAttributes(scope: Construct, id: String, attrs: InterfaceVpcEndpointAttributes): IInterfaceVpcEndpoint
    }
}

external interface InterfaceVpcEndpointAttributes {
    var vpcEndpointId: String
    var securityGroupId: String?
        get() = definedExternally
        set(value) = definedExternally
    var securityGroups: Array<ISecurityGroup>?
        get() = definedExternally
        set(value) = definedExternally
    var port: Number
}