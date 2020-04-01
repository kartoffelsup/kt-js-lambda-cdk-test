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

external interface IPeer : IConnectable {
    fun toIngressRuleConfig(): Any
    fun toEgressRuleConfig(): Any
}

external open class Peer {
    companion object {
        fun ipv4(cidrIp: String): IPeer
        fun anyIpv4(): IPeer
        fun ipv6(cidrIp: String): IPeer
        fun anyIpv6(): IPeer
        fun prefixList(prefixListId: String): IPeer
    }
}