@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

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

external interface LoadFileOptions {
    var filename: String?
        get() = definedExternally
        set(value) = definedExternally
    var isConfig: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IniFileContent {
    @nativeGetter
    operator fun get(key: String): `T$1`?
    @nativeSetter
    operator fun set(key: String, value: `T$1`)
}

external open class IniLoader {
    open fun clearCachedFiles()
    open fun loadFrom(options: LoadFileOptions): IniFileContent
}

external fun parseFile(filename: String, isConfig: Boolean): IniFileContent