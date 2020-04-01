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

external interface IManagedPolicy {
    var managedPolicyArn: String
}

external interface ManagedPolicyProps {
    var managedPolicyName: String?
        get() = definedExternally
        set(value) = definedExternally
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
    var path: String?
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
}

external open class ManagedPolicy(scope: Construct, id: String, props: ManagedPolicyProps = definedExternally) : Resource, IManagedPolicy {
    override var managedPolicyArn: String
    open var document: PolicyDocument
    open var managedPolicyName: String
    open var description: String
    open var path: String
    open var roles: Any
    open var users: Any
    open var groups: Any
    open fun addStatements(vararg statement: PolicyStatement)
    open fun attachToUser(user: IUser)
    open fun attachToRole(role: IRole)
    open fun attachToGroup(group: IGroup)

    companion object {
        fun fromManagedPolicyName(scope: Construct, id: String, managedPolicyName: String): IManagedPolicy
        fun fromManagedPolicyArn(scope: Construct, id: String, managedPolicyArn: String): IManagedPolicy
        fun fromAwsManagedPolicyName(managedPolicyName: String): IManagedPolicy
    }
}