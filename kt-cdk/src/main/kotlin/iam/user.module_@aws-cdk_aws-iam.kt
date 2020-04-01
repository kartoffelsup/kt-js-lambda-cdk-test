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

external interface IUser : IIdentity {
    var userName: String
    var userArn: String
    fun addToGroup(group: IGroup)
}

external interface UserProps {
    var groups: Array<IGroup>?
        get() = definedExternally
        set(value) = definedExternally
    var managedPolicies: Array<IManagedPolicy>?
        get() = definedExternally
        set(value) = definedExternally
    var path: String?
        get() = definedExternally
        set(value) = definedExternally
    var permissionsBoundary: IManagedPolicy?
        get() = definedExternally
        set(value) = definedExternally
    var userName: String?
        get() = definedExternally
        set(value) = definedExternally
    var password: Any?
        get() = definedExternally
        set(value) = definedExternally
    var passwordResetRequired: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class User(scope: Construct, id: String, props: UserProps = definedExternally) : Resource, IIdentity, IUser {
    override var grantPrincipal: IPrincipal
    override var assumeRoleAction: String
    override var userName: String
    override var userArn: String
    open var permissionsBoundary: IManagedPolicy
    override var policyFragment: PrincipalPolicyFragment
    open var groups: Any
    open var managedPolicies: Any
    open var attachedPolicies: Any
    open var defaultPolicy: Any
    override fun addToGroup(group: IGroup)
    override fun addManagedPolicy(policy: IManagedPolicy)
    override fun attachInlinePolicy(policy: Policy)
    override fun addToPolicy(statement: PolicyStatement): Boolean
    open var parseLoginProfile: Any

    companion object {
        fun fromUserName(scope: Construct, id: String, userName: String): IUser
    }
}