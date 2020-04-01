@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

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

external interface IVersion : IFunction {
    var version: String
    var lambda: IFunction
}

external interface VersionProps : EventInvokeConfigOptions {
    var codeSha256: String?
        get() = definedExternally
        set(value) = definedExternally
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
    var lambda: IFunction
    var provisionedConcurrentExecutions: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface VersionAttributes {
    var version: String
    var lambda: IFunction
}

external open class Version(scope: Construct, id: String, props: VersionProps) : QualifiedFunctionBase, IVersion {
    override var version: String
    override var lambda: IFunction
    override var functionArn: String
    override var functionName: String
    override var qualifier: String
    open var determineProvisionedConcurrency: Any

    companion object {
        fun fromVersionArn(scope: Construct, id: String, versionArn: String): IVersion
        fun fromVersionAttributes(scope: Construct, id: String, attrs: VersionAttributes): IVersion
    }
}

external fun extractQualifierFromArn(arn: String): String