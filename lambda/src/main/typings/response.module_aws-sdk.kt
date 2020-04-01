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

external open class Response<D, E> {
    open fun hasNextPage(): Boolean
    open fun nextPage(callback: (err: E, data: D) -> Unit = definedExternally): dynamic /* Request<D, E> | Unit */
    open var data: dynamic /* D | Unit */
    open var error: dynamic /* E | Unit */
    open var requestId: String
    open var redirectCount: Number
    open var retryCount: Number
    open var httpResponse: HttpResponse
}