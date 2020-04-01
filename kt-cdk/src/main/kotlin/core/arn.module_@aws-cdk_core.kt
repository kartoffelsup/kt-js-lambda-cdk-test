@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external interface ArnComponents {
    var partition: String?
        get() = definedExternally
        set(value) = definedExternally
    var service: String
    var region: String?
        get() = definedExternally
        set(value) = definedExternally
    var account: String?
        get() = definedExternally
        set(value) = definedExternally
    var resource: String
    var sep: String?
        get() = definedExternally
        set(value) = definedExternally
    var resourceName: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Arn {
    companion object {
        fun format(components: ArnComponents, stack: Stack): String
        fun parse(arn: String, sepIfToken: String = definedExternally, hasName: Boolean = definedExternally): ArnComponents
    }
}