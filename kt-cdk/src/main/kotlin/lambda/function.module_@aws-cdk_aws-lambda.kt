@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import core.Construct
import kotlin.js.*

external enum class Tracing {
    ACTIVE /* = "Active" */,
    PASS_THROUGH /* = "PassThrough" */,
    DISABLED /* = "Disabled" */
}

external interface FunctionOptions : EventInvokeConfigOptions {
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
    var timeout: Any?
        get() = definedExternally
        set(value) = definedExternally
    var functionName: String?
        get() = definedExternally
        set(value) = definedExternally
    var memorySize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var initialPolicy: Array<PolicyStatement>?
        get() = definedExternally
        set(value) = definedExternally
    var role: Any?
        get() = definedExternally
        set(value) = definedExternally
    var vpc: Any?
        get() = definedExternally
        set(value) = definedExternally
    var vpcSubnets: Any?
        get() = definedExternally
        set(value) = definedExternally
    var securityGroup: Any?
        get() = definedExternally
        set(value) = definedExternally
    var securityGroups: Array<ISecurityGroup>?
        get() = definedExternally
        set(value) = definedExternally
    var allowAllOutbound: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var deadLetterQueueEnabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var deadLetterQueue: Any?
        get() = definedExternally
        set(value) = definedExternally
    var tracing: Tracing?
        get() = definedExternally
        set(value) = definedExternally
    var layers: Array<ILayerVersion>?
        get() = definedExternally
        set(value) = definedExternally
    var reservedConcurrentExecutions: Number?
        get() = definedExternally
        set(value) = definedExternally
    var events: Array<IEventSource>?
        get() = definedExternally
        set(value) = definedExternally
    var logRetention: Any?
        get() = definedExternally
        set(value) = definedExternally
    var logRetentionRole: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface FunctionProps : FunctionOptions {
    var runtime: Runtime
    var code: Code
    var handler: String
}

external open class Function(scope: Construct, id: String, props: FunctionProps) : FunctionBase {
    override var functionName: String
    override var functionArn: String
    open var runtime: Runtime
    open var deadLetterQueue: Any
    override var permissionsNode: Any
    open var layers: Any
    open var _logGroup: Any
    open var environment: Any
    open fun addEnvironment(key: String, value: String): Function /* this */
    open fun addLayers(vararg layers: ILayerVersion)
    open fun addVersion(name: String, codeSha256: String = definedExternally, description: String = definedExternally, provisionedExecutions: Number = definedExternally, asyncInvokeConfig: EventInvokeConfigOptions = definedExternally): Version
    open var renderEnvironment: Any
    open var configureVpc: Any
    open var buildDeadLetterQueue: Any
    open var buildDeadLetterConfig: Any
    open var buildTracingConfig: Any

    companion object {
        fun fromFunctionArn(scope: Construct, id: String, functionArn: String): IFunction
        fun fromFunctionAttributes(scope: Construct, id: String, attrs: FunctionAttributes): IFunction
    }
}

external fun verifyCodeConfig(code: CodeConfig, runtime: Runtime)