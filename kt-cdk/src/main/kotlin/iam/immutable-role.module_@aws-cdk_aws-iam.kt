@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import core.Construct
import core.Stack
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

external open class ImmutableRole(scope: Construct, id: String, role: IRole) : Construct, IRole {
    open var role: Any
    override var assumeRoleAction: String
    override var policyFragment: PrincipalPolicyFragment
    override var grantPrincipal: IPrincipal /* this */
    override var roleArn: String
    override var roleName: String
    override var stack: Stack
    override fun attachInlinePolicy(_policy: Policy)
    override fun addManagedPolicy(_policy: IManagedPolicy)
    override fun addToPolicy(_statement: PolicyStatement): Boolean
    override fun grant(grantee: IPrincipal, vararg actions: String): Grant
    override fun grantPassRole(grantee: IPrincipal): Grant
}