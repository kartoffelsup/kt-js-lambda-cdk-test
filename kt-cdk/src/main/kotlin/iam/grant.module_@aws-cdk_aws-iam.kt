@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import core.IConstruct
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

external interface CommonGrantOptions {
    var grantee: IGrantable
    var actions: Array<String>
    var resourceArns: Array<String>
}

external interface GrantWithResourceOptions : CommonGrantOptions {
    var resource: IResourceWithPolicy
    var resourceSelfArns: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GrantOnPrincipalOptions : CommonGrantOptions {
    var scope: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GrantOnPrincipalAndResourceOptions : CommonGrantOptions {
    var resource: IResourceWithPolicy
    var resourceSelfArns: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var resourcePolicyPrincipal: IPrincipal?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Grant {
    open var principalStatement: PolicyStatement
    open var resourceStatement: PolicyStatement
    open var options: Any
    open fun assertSuccess()

    companion object {
        fun addToPrincipalOrResource(options: GrantWithResourceOptions): Grant
        fun addToPrincipal(options: GrantOnPrincipalOptions): Grant
        fun addToPrincipalAndResource(options: GrantOnPrincipalAndResourceOptions): Grant
        fun drop(grantee: IGrantable, _intent: String): Grant
    }
}

external interface IResourceWithPolicy : IConstruct {
    fun addToResourcePolicy(statement: PolicyStatement)
}