@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external interface IResolveOptions {
    var scope: IConstruct
    var preparing: Boolean
    var resolver: ITokenResolver
    var prefix: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external fun resolve(obj: Any, options: IResolveOptions): Any

external fun findTokens(scope: IConstruct, fn: () -> Any): Array<IResolvable>

external open class RememberingTokenResolver : DefaultTokenResolver {
    open var tokensSeen: Any
    override fun resolveToken(t: IResolvable, context: IResolveContext, postProcessor: IPostProcessor): Any
    override fun resolveString(s: TokenizedStringFragments, context: IResolveContext): Any
}