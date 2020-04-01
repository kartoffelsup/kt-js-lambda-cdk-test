@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external open class TokenMap {
    open var stringTokenMap: Any
    open var numberTokenMap: Any
    open var tokenCounter: Any
    open fun registerString(token: IResolvable, displayHint: String = definedExternally): String
    open fun registerList(token: IResolvable, displayHint: String = definedExternally): Array<String>
    open fun registerNumber(token: IResolvable): Number
    open fun tokenFromEncoding(x: Any): IResolvable?
    open fun lookupString(s: String): IResolvable?
    open fun lookupList(xs: Array<String>): IResolvable?
    open fun splitString(s: String): TokenizedStringFragments
    open fun lookupNumberToken(x: Number): IResolvable?
    open fun lookupToken(key: String): IResolvable
    open var registerStringKey: Any
    open var registerNumberKey: Any

    companion object {
        fun instance(): TokenMap
    }
}