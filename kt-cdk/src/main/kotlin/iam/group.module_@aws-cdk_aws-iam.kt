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

external interface IGroup : IIdentity {
    var groupName: String
    var groupArn: String
}

external interface GroupProps {
    var groupName: String?
        get() = definedExternally
        set(value) = definedExternally
    var managedPolicies: Array<IManagedPolicy>?
        get() = definedExternally
        set(value) = definedExternally
    var path: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class GroupBase : Resource, IGroup {
    override var groupName: String
    override var groupArn: String
    override var grantPrincipal: IPrincipal
    override var assumeRoleAction: String
    override var policyFragment: PrincipalPolicyFragment
    open var attachedPolicies: Any
    open var defaultPolicy: Any
    override fun attachInlinePolicy(policy: Policy)
    override fun addManagedPolicy(_policy: IManagedPolicy)
    open fun addUser(user: IUser)
    override fun addToPolicy(statement: PolicyStatement): Boolean
}

external open class Group(scope: Construct, id: String, props: GroupProps = definedExternally) : GroupBase {
    override var groupName: String
    override var groupArn: String
    open var managedPolicies: Any
    override fun addManagedPolicy(policy: IManagedPolicy)

    companion object {
        fun fromGroupArn(scope: Construct, id: String, groupArn: String): IGroup
    }
}