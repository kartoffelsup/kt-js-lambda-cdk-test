@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import core.IResolvable
import core.IResolveContext
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

external interface PolicyDocumentProps {
    var assignSids: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var statements: Array<PolicyStatement>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class PolicyDocument(props: PolicyDocumentProps = definedExternally) : IResolvable {
    open var creationStack: Array<String>
    open var statements: Any
    open var autoAssignSids: Any
    override fun resolve(context: IResolveContext): Any
    open fun addStatements(vararg statement: PolicyStatement)
    override fun toString(): String
    open fun toJSON(): Any
    open var render: Any

    companion object {
        fun fromJson(obj: Any): PolicyDocument
    }
}