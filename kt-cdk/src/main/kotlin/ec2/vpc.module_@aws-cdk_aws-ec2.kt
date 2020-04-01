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

external interface ISubnet : IResource {
    var availabilityZone: String
    var subnetId: String
    var internetConnectivityEstablished: Any
    var routeTable: IRouteTable
}

external interface IRouteTable {
    var routeTableId: String
}

external interface IVpc : IResource {
    var vpcId: String
    var vpcCidrBlock: String
    var publicSubnets: Array<ISubnet>
    var privateSubnets: Array<ISubnet>
    var isolatedSubnets: Array<ISubnet>
    var availabilityZones: Array<String>
    var vpnGatewayId: String?
        get() = definedExternally
        set(value) = definedExternally
    var internetConnectivityEstablished: Any
    fun selectSubnets(selection: SubnetSelection = definedExternally): SelectedSubnets
    fun addVpnConnection(id: String, options: VpnConnectionOptions): VpnConnection
    fun addGatewayEndpoint(id: String, options: GatewayVpcEndpointOptions): GatewayVpcEndpoint
    fun addInterfaceEndpoint(id: String, options: InterfaceVpcEndpointOptions): InterfaceVpcEndpoint
    fun addFlowLog(id: String, options: FlowLogOptions = definedExternally): FlowLog
}

external enum class SubnetType {
    ISOLATED /* = "Isolated" */,
    PRIVATE /* = "Private" */,
    PUBLIC /* = "Public" */
}

external interface SubnetSelection {
    var subnetType: SubnetType?
        get() = definedExternally
        set(value) = definedExternally
    var subnetGroupName: String?
        get() = definedExternally
        set(value) = definedExternally
    var subnetName: String?
        get() = definedExternally
        set(value) = definedExternally
    var onePerAz: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var subnets: Array<ISubnet>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SelectedSubnets {
    var subnetIds: Array<String>
    var availabilityZones: Array<String>
    var internetConnectivityEstablished: Any
    var subnets: Array<ISubnet>
    var hasPublic: Boolean
}

external open class VpcBase : Resource, IVpc {
    override var vpcId: String
    override var vpcCidrBlock: String
    override var publicSubnets: Array<ISubnet>
    override var privateSubnets: Array<ISubnet>
    override var isolatedSubnets: Array<ISubnet>
    override var availabilityZones: Array<String>
    override var internetConnectivityEstablished: Any
    open var natDependencies: Array<IConstruct>
    open var incompleteSubnetDefinition: Boolean
    override fun selectSubnets(selection: SubnetSelection): SelectedSubnets
    override fun addVpnConnection(id: String, options: VpnConnectionOptions): VpnConnection
    override fun addInterfaceEndpoint(id: String, options: InterfaceVpcEndpointOptions): InterfaceVpcEndpoint
    override fun addGatewayEndpoint(id: String, options: GatewayVpcEndpointOptions): GatewayVpcEndpoint
    override fun addFlowLog(id: String, options: FlowLogOptions): FlowLog
    open fun selectSubnetObjects(selection: SubnetSelection = definedExternally): Array<ISubnet>
    open var selectSubnetObjectsByName: Any
    open var selectSubnetObjectsByType: Any
    open var reifySelectionDefaults: Any
}

external interface VpcAttributes {
    var vpcId: String
    var vpcCidrBlock: String?
        get() = definedExternally
        set(value) = definedExternally
    var availabilityZones: Array<String>
    var publicSubnetIds: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var publicSubnetNames: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var publicSubnetRouteTableIds: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var privateSubnetIds: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var privateSubnetNames: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var privateSubnetRouteTableIds: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var isolatedSubnetIds: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var isolatedSubnetNames: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var isolatedSubnetRouteTableIds: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var vpnGatewayId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SubnetAttributes {
    var availabilityZone: String?
        get() = definedExternally
        set(value) = definedExternally
    var subnetId: String
    var routeTableId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface VpcProps {
    var cidr: String?
        get() = definedExternally
        set(value) = definedExternally
    var enableDnsHostnames: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enableDnsSupport: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var defaultInstanceTenancy: DefaultInstanceTenancy?
        get() = definedExternally
        set(value) = definedExternally
    var maxAzs: Number?
        get() = definedExternally
        set(value) = definedExternally
    var natGateways: Number?
        get() = definedExternally
        set(value) = definedExternally
    var natGatewaySubnets: SubnetSelection?
        get() = definedExternally
        set(value) = definedExternally
    var subnetConfiguration: Array<SubnetConfiguration>?
        get() = definedExternally
        set(value) = definedExternally
    var vpnGateway: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var vpnGatewayAsn: Number?
        get() = definedExternally
        set(value) = definedExternally
    var vpnConnections: `T$0`?
        get() = definedExternally
        set(value) = definedExternally
    var vpnRoutePropagation: Array<SubnetSelection>?
        get() = definedExternally
        set(value) = definedExternally
    var gatewayEndpoints: `T$1`?
        get() = definedExternally
        set(value) = definedExternally
}

external enum class DefaultInstanceTenancy {
    DEFAULT /* = "default" */,
    DEDICATED /* = "dedicated" */
}

external interface SubnetConfiguration {
    var cidrMask: Number?
        get() = definedExternally
        set(value) = definedExternally
    var subnetType: SubnetType
    var name: String
    var reserved: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Vpc(scope: Construct, id: String, props: VpcProps = definedExternally) : VpcBase {
    override var vpcId: String
    override var vpcCidrBlock: String
    open var vpcDefaultNetworkAcl: String
    open var vpcCidrBlockAssociations: Array<String>
    open var vpcDefaultSecurityGroup: String
    open var vpcIpv6CidrBlocks: Array<String>
    override var publicSubnets: Array<ISubnet>
    override var privateSubnets: Array<ISubnet>
    override var isolatedSubnets: Array<ISubnet>
    override var availabilityZones: Array<String>
    override var vpnGatewayId: String?
    override var internetConnectivityEstablished: Any
    open var resource: Any
    open var networkBuilder: Any
    open var subnetConfiguration: Any
    open var _internetConnectivityEstablished: Any
    open fun addS3Endpoint(id: String, subnets: Array<SubnetSelection> = definedExternally): GatewayVpcEndpoint
    open fun addDynamoDbEndpoint(id: String, subnets: Array<SubnetSelection> = definedExternally): GatewayVpcEndpoint
    open var createNatGateways: Any
    open var createSubnets: Any
    open var createSubnetResources: Any

    companion object {
        var DEFAULT_CIDR_RANGE: String
        var DEFAULT_SUBNETS: Array<SubnetConfiguration>
        fun fromVpcAttributes(scope: Construct, id: String, attrs: VpcAttributes): IVpc
        fun fromLookup(scope: Construct, id: String, options: VpcLookupOptions): IVpc
    }
}

external interface SubnetProps {
    var availabilityZone: String
    var vpcId: String
    var cidrBlock: String
    var mapPublicIpOnLaunch: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Subnet(scope: Construct, id: String, props: SubnetProps) : Resource, ISubnet {
    override var availabilityZone: String
    override var subnetId: String
    open var subnetVpcId: String
    open var subnetAvailabilityZone: String
    open var subnetIpv6CidrBlocks: Array<String>
    open var subnetNetworkAclAssociationId: String
    open var dependencyElements: Array<IDependable>
    override var routeTable: IRouteTable
    override var internetConnectivityEstablished: Any
    open var _internetConnectivityEstablished: Any
    open var _networkAcl: Any
    open fun addDefaultInternetRoute(gatewayId: String, gatewayAttachment: IDependable)
    open fun addDefaultNatRoute(natGatewayId: String)
    open fun addRoute(id: String, options: AddRouteOptions)

    companion object {
        fun isVpcSubnet(x: Any): Boolean
        fun fromSubnetAttributes(scope: Construct, id: String, attrs: SubnetAttributes): ISubnet
        fun fromSubnetId(scope: Construct, id: String, subnetId: String): ISubnet
    }
}

external interface AddRouteOptions {
    var destinationCidrBlock: String?
        get() = definedExternally
        set(value) = definedExternally
    var destinationIpv6CidrBlock: String?
        get() = definedExternally
        set(value) = definedExternally
    var routerType: RouterType
    var routerId: String
    var enablesInternetConnectivity: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external enum class RouterType {
    EGRESS_ONLY_INTERNET_GATEWAY /* = "EgressOnlyInternetGateway" */,
    GATEWAY /* = "Gateway" */,
    INSTANCE /* = "Instance" */,
    NAT_GATEWAY /* = "NatGateway" */,
    NETWORK_INTERFACE /* = "NetworkInterface" */,
    VPC_PEERING_CONNECTION /* = "VpcPeeringConnection" */
}

external interface PublicSubnetProps : SubnetProps

external interface IPublicSubnet : ISubnet

external interface PublicSubnetAttributes : SubnetAttributes

external open class PublicSubnet(scope: Construct, id: String, props: PublicSubnetProps) : Subnet, IPublicSubnet {

    companion object {
        fun fromPublicSubnetAttributes(scope: Construct, id: String, attrs: PublicSubnetAttributes): IPublicSubnet
    }
}

external interface PrivateSubnetProps : SubnetProps

external interface IPrivateSubnet : ISubnet

external interface PrivateSubnetAttributes : SubnetAttributes

external open class PrivateSubnet(scope: Construct, id: String, props: PrivateSubnetProps) : Subnet, IPrivateSubnet {
    companion object {
        fun fromPrivateSubnetAttributes(scope: Construct, id: String, attrs: PrivateSubnetAttributes): IPrivateSubnet
    }
}