@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external interface IResource : IConstruct {
    var stack: Stack
}

external interface ResourceProps {
    var physicalName: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Resource(scope: Construct, id: String, props: ResourceProps = definedExternally) : Construct,
    IResource {
    override var stack: Stack
    open var physicalName: String
    open var _physicalName: Any
    open var _allowCrossEnvironment: Any
    open fun generatePhysicalName(): String
    open fun getResourceNameAttribute(nameAttr: String): String
    open fun getResourceArnAttribute(arnAttr: String, arnComponents: ArnComponents): String
}