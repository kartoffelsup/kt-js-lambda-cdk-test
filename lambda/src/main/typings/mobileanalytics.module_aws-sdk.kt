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
import MobileAnalytics.Event
import MobileAnalytics.PutEventsInput
import MobileAnalytics.Session
import MobileAnalytics.MapOfStringToString
import MobileAnalytics.MapOfStringToNumber

typealias Double = Number

typealias EventListDefinition = Array<Event>

typealias ISO8601Timestamp = String

typealias Long = Number

typealias String = String

typealias String0to1000Chars = String

typealias String10Chars = String

typealias String50Chars = String

@JsModule("aws-sdk")
external open class MobileAnalytics(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & MobileAnalytics.Types.ClientConfiguration */
    open fun putEvents(params: PutEventsInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putEvents(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    interface Event {
        var eventType: String50Chars
        var timestamp: ISO8601Timestamp
        var session: Session?
            get() = definedExternally
            set(value) = definedExternally
        var version: String10Chars?
            get() = definedExternally
            set(value) = definedExternally
        var attributes: MapOfStringToString?
            get() = definedExternally
            set(value) = definedExternally
        var metrics: MapOfStringToNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MapOfStringToNumber {
        @nativeGetter
        operator fun get(key: String): Double?
        @nativeSetter
        operator fun set(key: String, value: Double)
    }
    interface MapOfStringToString {
        @nativeGetter
        operator fun get(key: String): String0to1000Chars?
        @nativeSetter
        operator fun set(key: String, value: String0to1000Chars)
    }
    interface PutEventsInput {
        var events: EventListDefinition
        var clientContext: String
        var clientContextEncoding: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Session {
        var id: String50Chars?
            get() = definedExternally
            set(value) = definedExternally
        var duration: Long?
            get() = definedExternally
            set(value) = definedExternally
        var startTimestamp: ISO8601Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var stopTimestamp: ISO8601Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2014-06-05" | "latest" | String */
    }
}