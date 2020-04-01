@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface LambdaRuntimeProps {
    var supportsInlineCode: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external enum class RuntimeFamily {
    NODEJS /* = 0 */,
    JAVA /* = 1 */,
    PYTHON /* = 2 */,
    DOTNET_CORE /* = 3 */,
    GO /* = 4 */,
    RUBY /* = 5 */,
    OTHER /* = 6 */
}

external open class Runtime(name: String, family: RuntimeFamily = definedExternally, props: LambdaRuntimeProps = definedExternally) {
    open var name: String
    open var supportsInlineCode: Boolean
    open var family: RuntimeFamily
    override fun toString(): String
    open fun runtimeEquals(other: Runtime): Boolean

    companion object {
        var ALL: Array<Runtime>
        var NODEJS: Runtime
        var NODEJS_4_3: Runtime
        var NODEJS_6_10: Runtime
        var NODEJS_8_10: Runtime
        var NODEJS_10_X: Runtime
        var NODEJS_12_X: Runtime
        var PYTHON_2_7: Runtime
        var PYTHON_3_6: Runtime
        var PYTHON_3_7: Runtime
        var PYTHON_3_8: Runtime
        var JAVA_8: Runtime
        var JAVA_11: Runtime
        var DOTNET_CORE_1: Runtime
        var DOTNET_CORE_2: Runtime
        var DOTNET_CORE_2_1: Runtime
        var GO_1_X: Runtime
        var RUBY_2_5: Runtime
        var PROVIDED: Runtime
    }
}