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
import ManagedUpload.SendData
import ManagedUpload.Progress
import S3.PutObjectRequest
import S3.Tag

external open class ManagedUpload(options: ManagedUpload.ManagedUploadOptions) {
    open fun abort()
    open fun promise(): Promise<SendData>
    open fun send(callback: (err: AWSError, data: SendData) -> Unit = definedExternally)
    open fun on(event: String /* "httpUploadProgress" */, listener: (progress: Progress) -> Unit): Any
    interface Progress {
        var loaded: Number
        var total: Number
    }
    interface SendData {
        var Location: String
        var ETag: String
        var Bucket: String
        var Key: String
    }
    interface ManagedUploadOptions {
        var params: PutObjectRequest?
            get() = definedExternally
            set(value) = definedExternally
        var queueSize: Number?
            get() = definedExternally
            set(value) = definedExternally
        var partSize: Number?
            get() = definedExternally
            set(value) = definedExternally
        var leavePartsOnError: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var service: Any?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Array<Tag>?
            get() = definedExternally
            set(value) = definedExternally
    }

    companion object {
        var maxTotalParts: Number
        var minPartSize: Number
    }
}