@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import core.Construct
import core.IResource
import core.Resource

external interface IVpnConnection : IResource {
    var vpnId: String
    var customerGatewayId: String
    var customerGatewayIp: String
    var customerGatewayAsn: Number
}

external interface VpnTunnelOption {
    var preSharedKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var tunnelInsideCidr: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface VpnConnectionOptions {
    var ip: String
    var asn: Number?
        get() = definedExternally
        set(value) = definedExternally
    var staticRoutes: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var tunnelOptions: Array<VpnTunnelOption>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface VpnConnectionProps : VpnConnectionOptions {
    var vpc: IVpc
}

external enum class VpnConnectionType {
    IPSEC_1 /* = "ipsec.1" */,
    DUMMY /* = "dummy" */
}

external open class VpnConnection(scope: Construct, id: String, props: VpnConnectionProps) : Resource, IVpnConnection {
    override var vpnId: String
    override var customerGatewayId: String
    override var customerGatewayIp: String
    override var customerGatewayAsn: Number
}

external var RESERVED_TUNNEL_INSIDE_CIDR: Array<String>