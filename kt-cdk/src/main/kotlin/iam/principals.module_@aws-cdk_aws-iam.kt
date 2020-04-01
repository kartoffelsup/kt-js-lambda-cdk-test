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

external interface IGrantable {
    var grantPrincipal: IPrincipal
}

external interface IPrincipal : IGrantable {
    var assumeRoleAction: String
    var policyFragment: PrincipalPolicyFragment
    fun addToPolicy(statement: PolicyStatement): Boolean
}

external open class PrincipalBase : IPrincipal {
    override var grantPrincipal: IPrincipal
    override var policyFragment: PrincipalPolicyFragment
    override var assumeRoleAction: String
    override fun addToPolicy(_statement: PolicyStatement): Boolean
    override fun toString(): String
}

external open class PrincipalPolicyFragment(principalJson: Json, conditions: Json = definedExternally) {
    open var principalJson: Json
    open var conditions: Json
}

external open class ArnPrincipal(arn: String) : PrincipalBase {
    open var arn: String
    override fun toString(): String
}

external open class AccountPrincipal(accountId: Any) : ArnPrincipal {
    open var accountId: Any
    override fun toString(): String
}

external interface ServicePrincipalOpts {
    var region: String?
        get() = definedExternally
        set(value) = definedExternally
    var conditions: Json?
        get() = definedExternally
        set(value) = definedExternally
}

external open class ServicePrincipal(service: String, opts: ServicePrincipalOpts = definedExternally) : PrincipalBase {
    open var service: String
    open var opts: Any
    override fun toString(): String
}

external open class OrganizationPrincipal(organizationId: String) : PrincipalBase {
    open var organizationId: String
    override fun toString(): String
}

external open class CanonicalUserPrincipal(canonicalUserId: String) : PrincipalBase {
    open var canonicalUserId: String
    override fun toString(): String
}

external open class FederatedPrincipal(federated: String, conditions: Json, assumeRoleAction: String = definedExternally) : PrincipalBase {
    open var federated: String
    open var conditions: Json
    override var assumeRoleAction: String
    override fun toString(): String
}

external open class AccountRootPrincipal : AccountPrincipal {
    override fun toString(): String
}

external open class AnyPrincipal : ArnPrincipal {
    override fun toString(): String
}

external open class Anyone : AnyPrincipal

external open class CompositePrincipal(vararg principals: PrincipalBase) : PrincipalBase {
    override var assumeRoleAction: String
    open var principals: Any
    open fun addPrincipals(vararg principals: PrincipalBase): CompositePrincipal /* this */
    override fun toString(): String
}