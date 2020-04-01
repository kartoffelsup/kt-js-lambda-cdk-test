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

external enum class Protocol {
    ALL /* = "-1" */,
    TCP /* = "tcp" */,
    UDP /* = "udp" */,
    ICMP /* = "icmp" */,
    ICMPV6 /* = "58" */
}

external interface PortProps {
    var protocol: Protocol
    var fromPort: Number?
        get() = definedExternally
        set(value) = definedExternally
    var toPort: Number?
        get() = definedExternally
        set(value) = definedExternally
    var stringRepresentation: String
}

external open class Port(props: PortProps) {
    open var props: Any
    open var canInlineRule: Boolean
    open fun toRuleJson(): Any
    override fun toString(): String

    companion object {
        fun tcp(port: Number): Port
        fun tcpRange(startPort: Number, endPort: Number): Port
        fun allTcp(): Port
        fun udp(port: Number): Port
        fun udpRange(startPort: Number, endPort: Number): Port
        fun allUdp(): Port
        fun icmpTypeAndCode(type: Number, code: Number): Port
        fun icmpType(type: Number): Port
        fun icmpPing(): Port
        fun allIcmp(): Port
        fun allTraffic(): Port
    }
}