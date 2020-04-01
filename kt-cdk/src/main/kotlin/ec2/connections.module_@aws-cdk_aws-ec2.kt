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

external interface IConnectable {
    var connections: Connections
}

external interface ConnectionsProps {
    var peer: IPeer?
        get() = definedExternally
        set(value) = definedExternally
    var securityGroups: Array<ISecurityGroup>?
        get() = definedExternally
        set(value) = definedExternally
    var defaultPort: Port?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Connections(props: ConnectionsProps = definedExternally) : IConnectable {
    override var connections: Connections
    open var defaultPort: Port
    open var _securityGroups: Any
    open var _securityGroupRules: Any
    open var skip: Any
    open var remoteRule: Any
    open fun addSecurityGroup(vararg securityGroups: ISecurityGroup)
    open fun allowTo(other: IConnectable, portRange: Port, description: String = definedExternally)
    open fun allowFrom(other: IConnectable, portRange: Port, description: String = definedExternally)
    open fun allowInternally(portRange: Port, description: String = definedExternally)
    open fun allowToAnyIpv4(portRange: Port, description: String = definedExternally)
    open fun allowFromAnyIpv4(portRange: Port, description: String = definedExternally)
    open fun allowDefaultPortFrom(other: IConnectable, description: String = definedExternally)
    open fun allowDefaultPortInternally(description: String = definedExternally)
    open fun allowDefaultPortFromAnyIpv4(description: String = definedExternally)
    open fun allowToDefaultPort(other: IConnectable, description: String = definedExternally)
    open fun allowDefaultPortTo(other: IConnectable, description: String = definedExternally)
}