@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import core.IResource
import core.Resource
import kotlin.js.*

external interface IFunction : IResource {
    var functionName: String
    var functionArn: String
    var role: Any?
        get() = definedExternally
        set(value) = definedExternally
    var permissionsNode: Any
    fun addEventSourceMapping(id: String, options: EventSourceMappingOptions): EventSourceMapping
    fun addPermission(id: String, permission: Permission)
    fun addToRolePolicy(statement: PolicyStatement)
    fun grantInvoke(identity: IGrantable): Grant
    fun addEventSource(source: IEventSource)
    fun configureAsyncInvoke(options: EventInvokeConfigOptions)
}

external interface FunctionAttributes {
    var functionArn: String
    var role: Any?
        get() = definedExternally
        set(value) = definedExternally
    var securityGroupId: String?
        get() = definedExternally
        set(value) = definedExternally
    var securityGroup: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external abstract class FunctionBase : Resource, IFunction {
    override var functionName: String
    override var functionArn: String
    override var permissionsNode: Any
    open var canCreatePermissions: Boolean
    override fun addPermission(id: String, permission: Permission)
    override fun addToRolePolicy(statement: PolicyStatement)
    override fun addEventSourceMapping(id: String, options: EventSourceMappingOptions): EventSourceMapping
    override fun grantInvoke(grantee: IGrantable): Grant
    override fun addEventSource(source: IEventSource)
    override fun configureAsyncInvoke(options: EventInvokeConfigOptions)
    open var parsePermissionPrincipal: Any
}

external abstract class QualifiedFunctionBase : FunctionBase {
    open var lambda: IFunction
    override var permissionsNode: Any
    open var qualifier: String
    override fun configureAsyncInvoke(options: EventInvokeConfigOptions)
}