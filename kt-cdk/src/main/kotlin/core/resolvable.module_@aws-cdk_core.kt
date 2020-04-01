@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external interface IResolveContext {
    var scope: IConstruct
    var preparing: Boolean
    fun resolve(x: Any): Any
    fun registerPostProcessor(postProcessor: IPostProcessor)
}

external interface IResolvable {
    fun resolve(context: IResolveContext): Any
}

external interface IPostProcessor {
    fun postProcess(input: Any, context: IResolveContext): Any
}

external interface ITokenResolver {
    fun resolveToken(t: IResolvable, context: IResolveContext, postProcessor: IPostProcessor): Any
    fun resolveString(s: TokenizedStringFragments, context: IResolveContext): Any
    fun resolveList(l: Array<String>, context: IResolveContext): Any
}

external interface IFragmentConcatenator {
    fun join(left: Any?, right: Any?): Any
}

external open class StringConcat : IFragmentConcatenator {
    override fun join(left: Any?, right: Any?): Any
}

external open class DefaultTokenResolver(concat: IFragmentConcatenator) :
    ITokenResolver {
    open var concat: Any
    override fun resolveToken(t: IResolvable, context: IResolveContext, postProcessor: IPostProcessor): Any
    override fun resolveString(fragments: TokenizedStringFragments, context: IResolveContext): Any
    override fun resolveList(xs: Array<String>, context: IResolveContext): Any
}