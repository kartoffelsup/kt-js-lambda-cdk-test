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
import Polly.SynthesizeSpeechInput

external open class Presigner(options: Presigner.PresignerOptions = definedExternally) {
    open fun getSynthesizeSpeechUrl(params: SynthesizeSpeechInput, error: Number, callback: (err: AWSError, url: String) -> Unit)
    open fun getSynthesizeSpeechUrl(params: SynthesizeSpeechInput, callback: (err: AWSError, url: String) -> Unit)
    open fun getSynthesizeSpeechUrl(params: SynthesizeSpeechInput, expires: Number = definedExternally): String
    interface PresignerOptions {
        var params: Json?
            get() = definedExternally
            set(value) = definedExternally
        var service: Any?
            get() = definedExternally
            set(value) = definedExternally
    }
}