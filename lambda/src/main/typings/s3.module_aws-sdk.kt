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
import PresignedPost.Params
import S3.PutObjectRequest
import ManagedUpload.ManagedUploadOptions
import ManagedUpload.SendData

external open class S3Customizations : Service {
    open fun getSignedUrl(operation: String, params: Any, callback: (err: Error, url: String) -> Unit)
    open fun getSignedUrl(operation: String, params: Any): String
    open fun getSignedUrlPromise(operation: String, params: Any): Promise<String>
    open fun createPresignedPost(params: Params, callback: (err: Error, data: S3.PresignedPost) -> Unit)
    open fun createPresignedPost(params: Params): S3.PresignedPost
    open fun upload(params: PutObjectRequest, options: ManagedUploadOptions = definedExternally, callback: (err: Error, data: SendData) -> Unit = definedExternally): ManagedUpload
    open fun upload(params: PutObjectRequest, callback: (err: Error, data: SendData) -> Unit = definedExternally): ManagedUpload

    companion object {
        var ManagedUpload: Any
    }
}