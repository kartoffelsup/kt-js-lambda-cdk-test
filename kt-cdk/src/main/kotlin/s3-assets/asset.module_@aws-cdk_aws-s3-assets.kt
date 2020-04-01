@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import core.CfnResource
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

external interface AssetOptions {
    var readers: Array<IGrantable>?
        get() = definedExternally
        set(value) = definedExternally
    var sourceHash: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AssetProps : AssetOptions {
    var path: String
}

external open class Asset(scope: CfnResource, id: String, props: AssetProps) : CfnResource {
    open var s3BucketName: String
    open var s3ObjectKey: String
    open var s3Url: String
    open var assetPath: String
    open var bucket: Any
    open var isZipArchive: Boolean
    open var sourceHash: String
    open fun addResourceMetadata(resource: CfnResource, resourceProperty: String)
    open fun grantRead(grantee: IGrantable)
}