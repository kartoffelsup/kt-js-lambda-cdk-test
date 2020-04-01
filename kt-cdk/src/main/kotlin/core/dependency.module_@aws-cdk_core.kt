@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external interface IDependable

external open class ConcreteDependable : IDependable {
    open var _dependencyRoots: Any
    open fun add(construct: IConstruct)
}

external open class DependableTrait {
    open var dependencyRoots: Array<IConstruct>

    companion object {
        fun implement(instance: IDependable, trait: DependableTrait)
        fun get(instance: IDependable): DependableTrait
    }
}