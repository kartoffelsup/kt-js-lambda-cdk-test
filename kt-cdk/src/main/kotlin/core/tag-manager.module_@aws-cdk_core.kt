@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external interface ITaggable {
    var tags: TagManager
}

external interface TagManagerOptions {
    var tagPropertyName: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class TagManager(tagType: TagType, resourceTypeName: String, tagStructure: Any = definedExternally, options: TagManagerOptions = definedExternally) {
    open var tagPropertyName: String
    open var tags: Any
    open var priorities: Any
    open var tagFormatter: Any
    open var resourceTypeName: Any
    open var initialTagPriority: Any
    open fun setTag(key: String, value: String, priority: Number = definedExternally, applyToLaunchedInstances: Boolean = definedExternally)
    open fun removeTag(key: String, priority: Number)
    open fun renderTags(): Any
    open fun applyTagAspectHere(include: Array<String> = definedExternally, exclude: Array<String> = definedExternally): Boolean
    open fun hasTags(): Boolean
    open var _setTag: Any

    companion object {
        fun isTaggable(construct: Any): Boolean
    }
}