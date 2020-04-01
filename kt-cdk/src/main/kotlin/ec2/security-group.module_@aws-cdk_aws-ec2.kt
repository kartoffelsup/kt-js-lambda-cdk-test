@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import core.Construct
import core.IResource
import core.Resource
import core.ResourceProps

external interface ISecurityGroup : IResource, IPeer {
    var securityGroupId: String
    var allowAllOutbound: Boolean
    fun addIngressRule(peer: IPeer, connection: Port, description: String = definedExternally, remoteRule: Boolean = definedExternally)
    fun addEgressRule(peer: IPeer, connection: Port, description: String = definedExternally, remoteRule: Boolean = definedExternally)
}

external open class SecurityGroupBase(scope: Construct, id: String, props: ResourceProps = definedExternally) : Resource, ISecurityGroup {
    override var securityGroupId: String
    override var allowAllOutbound: Boolean
    override var connections: Connections
    open var defaultPort: Port
    override fun addIngressRule(peer: IPeer, connection: Port, description: String, remoteRule: Boolean)
    override fun addEgressRule(peer: IPeer, connection: Port, description: String, remoteRule: Boolean)
    override fun toIngressRuleConfig(): Any
    override fun toEgressRuleConfig(): Any

    companion object {
        fun isSecurityGroup(x: Any): Boolean
    }
}

external interface SecurityGroupProps {
    var securityGroupName: String?
        get() = definedExternally
        set(value) = definedExternally
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
    var vpc: IVpc
    var allowAllOutbound: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SecurityGroupImportOptions {
    var allowAllOutbound: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var mutable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class SecurityGroup(scope: Construct, id: String, props: SecurityGroupProps) : SecurityGroupBase {
    open var securityGroupName: String
    override var securityGroupId: String
    open var securityGroupVpcId: String
    override var allowAllOutbound: Boolean
    open var securityGroup: Any
    open var directIngressRules: Any
    open var directEgressRules: Any
    override fun addIngressRule(peer: IPeer, connection: Port, description: String, remoteRule: Boolean)
    override fun addEgressRule(peer: IPeer, connection: Port, description: String, remoteRule: Boolean)
    open var addDirectIngressRule: Any
    open var hasIngressRule: Any
    open var addDirectEgressRule: Any
    open var hasEgressRule: Any
    open var addDefaultEgressRule: Any
    open var removeNoTrafficRule: Any

    companion object {
        fun fromSecurityGroupId(scope: Construct, id: String, securityGroupId: String, options: SecurityGroupImportOptions = definedExternally): ISecurityGroup
    }
}

external interface ConnectionRule {
    var protocol: String?
        get() = definedExternally
        set(value) = definedExternally
    var fromPort: Number
    var toPort: Number?
        get() = definedExternally
        set(value) = definedExternally
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
}