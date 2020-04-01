@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import core.CfnResource
import core.Construct
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

external interface CrossAccountDestinationProps {
    var destinationName: String?
        get() = definedExternally
        set(value) = definedExternally
    var role: Any
    var targetArn: String
}

external abstract class CrossAccountDestination(scope: CfnResource, id: String, props: CrossAccountDestinationProps) : CfnResource, ILogSubscriptionDestination {
    open var policyDocument: Any
    open var destinationName: String
    open var destinationArn: String
    open var resource: Any
    open fun addToPolicy(statement: PolicyStatement)
    open var generateUniqueName: Any
    open var lazyStringifiedPolicyDocument: Any
}