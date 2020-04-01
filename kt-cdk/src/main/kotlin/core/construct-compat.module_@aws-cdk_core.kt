@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external interface IConstruct : IDependable {
    var node: ConstructNode
}

external interface ISynthesisSession {
    var outdir: String
    var assembly: Any
}

external open class Construct(scope: Construct, id: String) :
    IConstruct {
    override var node: ConstructNode
    open fun onValidate(): Array<String>
    open fun onPrepare()
    open fun onSynthesize(session: ISynthesisSession)
    open fun validate(): Array<String>
    open fun prepare()
    open fun synthesize(session: ISynthesisSession)

    companion object {
        fun isConstruct(x: Any): Boolean
    }
}

external enum class ConstructOrder {
    PREORDER /* = 0 */,
    POSTORDER /* = 1 */
}

external open class ConstructNode(host: Construct, scope: IConstruct, id: String) {
    open fun tryFindChild(id: String): IConstruct?
    open fun findChild(id: String): IConstruct
    open fun findAll(order: ConstructOrder = definedExternally): Array<IConstruct>
    open fun setContext(key: String, value: Any)
    open fun tryGetContext(key: String): Any
    open fun addMetadata(type: String, data: Any, fromFunction: Any = definedExternally)
    open fun addInfo(message: String)
    open fun addWarning(message: String)
    open fun addError(message: String)
    open fun applyAspect(aspect: IAspect)
    open fun addDependency(vararg dependencies: IDependable)
    open fun tryRemoveChild(childName: String): Boolean

    companion object {
        var PATH_SEP: Any
        fun prepare(node: ConstructNode)
        fun validate(node: ConstructNode): Array<ValidationError>
    }
}

external interface ValidationError {
    var source: Construct
    var message: String
}

external interface Dependency {
    var source: IConstruct
    var target: IConstruct
}