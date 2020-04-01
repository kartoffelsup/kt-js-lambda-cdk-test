@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import core.Construct
import core.Resource
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

external interface `T$1` {
    @nativeGetter
    operator fun get(name: String): PolicyDocument?
    @nativeSetter
    operator fun set(name: String, value: PolicyDocument)
}

external interface RoleProps {
    var assumedBy: IPrincipal
    var externalId: String?
        get() = definedExternally
        set(value) = definedExternally
    var externalIds: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var managedPolicies: Array<IManagedPolicy>?
        get() = definedExternally
        set(value) = definedExternally
    var inlinePolicies: `T$1`?
        get() = definedExternally
        set(value) = definedExternally
    var path: String?
        get() = definedExternally
        set(value) = definedExternally
    var permissionsBoundary: IManagedPolicy?
        get() = definedExternally
        set(value) = definedExternally
    var roleName: String?
        get() = definedExternally
        set(value) = definedExternally
    var maxSessionDuration: Any?
        get() = definedExternally
        set(value) = definedExternally
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface FromRoleArnOptions {
    var mutable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Role(scope: Construct, id: String, props: RoleProps) : Resource, IRole {
    override var grantPrincipal: IPrincipal
    override var assumeRoleAction: String
    open var assumeRolePolicy: PolicyDocument
    override var roleArn: String
    open var roleId: String
    override var roleName: String
    override var policyFragment: PrincipalPolicyFragment
    open var permissionsBoundary: IManagedPolicy
    open var defaultPolicy: Any
    open var managedPolicies: Any
    open var attachedPolicies: Any
    open var immutableRole: Any
    override fun addToPolicy(statement: PolicyStatement): Boolean
    override fun addManagedPolicy(policy: IManagedPolicy)
    override fun attachInlinePolicy(policy: Policy)
    override fun grant(grantee: IPrincipal, vararg actions: String): Grant
    override fun grantPassRole(identity: IPrincipal): Grant
    open fun withoutPolicyUpdates(): IRole

    companion object {
        fun fromRoleArn(scope: Construct, id: String, roleArn: String, options: FromRoleArnOptions = definedExternally): IRole
    }
}

external interface IRole : IIdentity {
    var roleArn: String
    var roleName: String
    fun grant(grantee: IPrincipal, vararg actions: String): Grant
    fun grantPassRole(grantee: IPrincipal): Grant
}