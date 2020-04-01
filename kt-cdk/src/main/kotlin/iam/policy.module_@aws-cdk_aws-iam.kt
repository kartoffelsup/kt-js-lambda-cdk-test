@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import core.Construct
import core.IResource
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

external interface IPolicy : IResource {
    var policyName: String
}

external interface PolicyProps {
    var policyName: String?
        get() = definedExternally
        set(value) = definedExternally
    var users: Array<IUser>?
        get() = definedExternally
        set(value) = definedExternally
    var roles: Array<IRole>?
        get() = definedExternally
        set(value) = definedExternally
    var groups: Array<IGroup>?
        get() = definedExternally
        set(value) = definedExternally
    var statements: Array<PolicyStatement>?
        get() = definedExternally
        set(value) = definedExternally
    var force: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Policy(scope: Construct, id: String, props: PolicyProps = definedExternally) : Resource, IPolicy {
    open var document: PolicyDocument
    override var policyName: String
    open var roles: Any
    open var users: Any
    open var groups: Any
    open var force: Any
    open var referenceTaken: Any
    open fun addStatements(vararg statement: PolicyStatement)
    open fun attachToUser(user: IUser)
    open fun attachToRole(role: IRole)
    open fun attachToGroup(group: IGroup)

    companion object {
        fun fromPolicyName(scope: Construct, id: String, policyName: String): IPolicy
    }
}