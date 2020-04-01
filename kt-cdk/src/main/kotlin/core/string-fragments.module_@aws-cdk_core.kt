@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external open class TokenizedStringFragments {
    open var fragments: Any
    open fun addLiteral(lit: Any)
    open fun addToken(token: IResolvable)
    open fun addIntrinsic(value: Any)
    open fun mapTokens(mapper: ITokenMapper): TokenizedStringFragments
    open fun join(concat: IFragmentConcatenator): Any
}

external interface ITokenMapper {
    fun mapToken(t: IResolvable): Any
}