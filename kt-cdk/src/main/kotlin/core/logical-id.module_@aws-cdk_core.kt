@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external open class LogicalIDs {
    open var renames: Any
    open var reverse: Any
    open fun addRename(oldId: String, newId: String)
    open fun applyRename(oldId: String): String
    open fun assertAllRenamesApplied()
}