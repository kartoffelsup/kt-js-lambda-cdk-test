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

external interface LayerVersionProps {
    var compatibleRuntimes: Array<Runtime>?
        get() = definedExternally
        set(value) = definedExternally
    var code: Code
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
    var license: String?
        get() = definedExternally
        set(value) = definedExternally
    var layerVersionName: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ILayerVersion : IResource {
    var layerVersionArn: String
    var compatibleRuntimes: Array<Runtime>?
        get() = definedExternally
        set(value) = definedExternally
    fun addPermission(id: String, permission: LayerVersionPermission)
}

external open class LayerVersionBase : Resource, ILayerVersion {
    override var layerVersionArn: String
    override fun addPermission(id: String, permission: LayerVersionPermission)
}

external interface LayerVersionPermission {
    var accountId: String
    var organizationId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LayerVersionAttributes {
    var layerVersionArn: String
    var compatibleRuntimes: Array<Runtime>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class LayerVersion(scope: Construct, id: String, props: LayerVersionProps) : LayerVersionBase {
    override var layerVersionArn: String
    override var compatibleRuntimes: Array<Runtime>?

    companion object {
        fun fromLayerVersionArn(scope: Construct, id: String, layerVersionArn: String): ILayerVersion
        fun fromLayerVersionAttributes(scope: Construct, id: String, attrs: LayerVersionAttributes): ILayerVersion
    }
}