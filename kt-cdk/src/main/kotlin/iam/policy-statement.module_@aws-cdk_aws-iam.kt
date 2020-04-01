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

external open class PolicyStatement(props: PolicyStatementProps = definedExternally) {
    open var sid: String
    open var effect: Effect
    open var action: Any
    open var notAction: Any
    open var principal: Any
    open var notPrincipal: Any
    open var resource: Any
    open var notResource: Any
    open var condition: Any
    open fun addActions(vararg actions: String)
    open fun addNotActions(vararg notActions: String)
    open fun addPrincipals(vararg principals: IPrincipal)
    open fun addNotPrincipals(vararg notPrincipals: IPrincipal)
    open fun addAwsAccountPrincipal(accountId: String)
    open fun addArnPrincipal(arn: String)
    open fun addServicePrincipal(service: String, opts: ServicePrincipalOpts = definedExternally)
    open fun addFederatedPrincipal(federated: Any, conditions: Json)
    open fun addAccountRootPrincipal()
    open fun addCanonicalUserPrincipal(canonicalUserId: String)
    open fun addAnyPrincipal()
    open fun addResources(vararg arns: String)
    open fun addNotResources(vararg arns: String)
    open fun addAllResources()
    open fun addCondition(key: String, value: Any)
    open fun addConditions(conditions: Json)
    open fun addAccountCondition(accountId: String)
    open fun toStatementJson(): Any
    override fun toString(): String
    open fun toJSON(): Any

    companion object {
        fun fromJson(obj: Any): PolicyStatement
    }
}

external enum class Effect {
    ALLOW /* = "Allow" */,
    DENY /* = "Deny" */
}

external interface PolicyStatementProps {
    var sid: String?
        get() = definedExternally
        set(value) = definedExternally
    var actions: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var notActions: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var principals: Array<IPrincipal>?
        get() = definedExternally
        set(value) = definedExternally
    var notPrincipals: Array<IPrincipal>?
        get() = definedExternally
        set(value) = definedExternally
    var resources: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var notResources: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var conditions: Json?
        get() = definedExternally
        set(value) = definedExternally
    var effect: Effect?
        get() = definedExternally
        set(value) = definedExternally
}