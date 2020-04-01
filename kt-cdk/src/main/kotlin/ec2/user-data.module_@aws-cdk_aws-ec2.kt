@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

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

external interface LinuxUserDataOptions {
    var shebang: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface S3DownloadOptions {
    var bucket: Any
    var bucketKey: String
    var localFile: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ExecuteFileOptions {
    var filePath: String
    var arguments: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class UserData {
    open fun addCommands(vararg commands: String)
    open fun addOnExitCommands(vararg commands: String)
    open fun render(): String
    open fun addS3DownloadCommand(params: S3DownloadOptions): String
    open fun addExecuteFileCommand(params: ExecuteFileOptions)
    open fun addSignalOnExitCommand(resource: Resource)

    companion object {
        fun forLinux(options: LinuxUserDataOptions = definedExternally): UserData
        fun forWindows(): UserData
        fun custom(content: String): UserData
    }
}