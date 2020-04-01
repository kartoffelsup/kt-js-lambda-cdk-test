@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external var BEGIN_STRING_TOKEN_MARKER: Any

external var BEGIN_LIST_TOKEN_MARKER: Any

external var END_TOKEN_MARKER: Any

external var VALID_KEY_CHARS: Any

external open class TokenString(str: String, re: RegExp) {
    open var str: Any
    open var re: Any
    open fun split(lookup: (id: String) -> IResolvable): TokenizedStringFragments
    open fun test(): Boolean

    companion object {
        fun forString(s: String): TokenString
        fun forListToken(s: String): TokenString
    }
}

external fun regexQuote(s: String): String

external open class NullConcat : IFragmentConcatenator {
    override fun join(_left: Any?, _right: Any?): Any
}

external fun containsListTokenElement(xs: Array<Any>): Boolean

external fun unresolved(obj: Any): Boolean

external fun createTokenDouble(x: Number): Number

external fun extractTokenDouble(encoded: Number): Number?