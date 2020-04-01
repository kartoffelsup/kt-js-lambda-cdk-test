@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external interface AppProps {
    var autoSynth: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var outdir: String?
        get() = definedExternally
        set(value) = definedExternally
    var stackTraces: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var runtimeInfo: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var context: `T$0`?
        get() = definedExternally
        set(value) = definedExternally
    var treeMetadata: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class App(props: AppProps = definedExternally) :
    Construct {
    open var _assembly: Any
    open var runtimeInfo: Any
    open var outdir: Any
    open var loadContext: Any

    companion object {
        fun isApp(obj: Any): Boolean
    }
}