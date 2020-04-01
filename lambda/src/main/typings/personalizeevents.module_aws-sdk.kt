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
import PersonalizeEvents.Event
import PersonalizeEvents.PutEventsRequest

typealias _Date = Date

typealias EventList = Array<Event>

typealias EventPropertiesJSON = String

typealias StringType = String

typealias UserId = String

@JsModule("aws-sdk")
external open class PersonalizeEvents(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & PersonalizeEvents.Types.ClientConfiguration */
    open fun putEvents(params: PutEventsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putEvents(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    interface Event {
        var eventId: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var eventType: StringType
        var properties: EventPropertiesJSON
        var sentAt: _Date
    }
    interface PutEventsRequest {
        var trackingId: StringType
        var userId: UserId?
            get() = definedExternally
            set(value) = definedExternally
        var sessionId: StringType
        var eventList: EventList
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-03-22" | "latest" | String */
    }
}