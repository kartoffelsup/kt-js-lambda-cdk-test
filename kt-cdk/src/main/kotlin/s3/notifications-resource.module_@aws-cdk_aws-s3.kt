@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import core.CfnResource
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

external interface NotificationsProps {
    var bucket: Bucket
}

external open class BucketNotifications(scope: CfnResource, id: String, props: NotificationsProps) : CfnResource {
    open var lambdaNotifications: Any
    open var queueNotifications: Any
    open var topicNotifications: Any
    open var resource: Any
    open var bucket: Any
    open fun addNotification(event: EventType, target: IBucketNotificationDestination, vararg filters: NotificationKeyFilter)
    open var renderNotificationConfiguration: Any
    open var createResourceOnce: Any
}