@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external interface CfnCreationPolicy {
    var autoScalingCreationPolicy: CfnResourceAutoScalingCreationPolicy?
        get() = definedExternally
        set(value) = definedExternally
    var resourceSignal: CfnResourceSignal?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CfnResourceAutoScalingCreationPolicy {
    var minSuccessfulInstancesPercent: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CfnResourceSignal {
    var count: Number?
        get() = definedExternally
        set(value) = definedExternally
    var timeout: String?
        get() = definedExternally
        set(value) = definedExternally
}

external enum class CfnDeletionPolicy {
    DELETE /* = "Delete" */,
    RETAIN /* = "Retain" */,
    SNAPSHOT /* = "Snapshot" */
}

external interface CfnUpdatePolicy {
    var autoScalingReplacingUpdate: CfnAutoScalingReplacingUpdate?
        get() = definedExternally
        set(value) = definedExternally
    var autoScalingRollingUpdate: CfnAutoScalingRollingUpdate?
        get() = definedExternally
        set(value) = definedExternally
    var autoScalingScheduledAction: CfnAutoScalingScheduledAction?
        get() = definedExternally
        set(value) = definedExternally
    var codeDeployLambdaAliasUpdate: CfnCodeDeployLambdaAliasUpdate?
        get() = definedExternally
        set(value) = definedExternally
    var useOnlineResharding: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enableVersionUpgrade: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CfnAutoScalingRollingUpdate {
    var maxBatchSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minInstancesInService: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minSuccessfulInstancesPercent: Number?
        get() = definedExternally
        set(value) = definedExternally
    var pauseTime: String?
        get() = definedExternally
        set(value) = definedExternally
    var suspendProcesses: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var waitOnResourceSignals: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CfnAutoScalingReplacingUpdate {
    var willReplace: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CfnAutoScalingScheduledAction {
    var ignoreUnmodifiedGroupSizeProperties: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CfnCodeDeployLambdaAliasUpdate {
    var applicationName: String
    var deploymentGroupName: String
    var beforeAllowTrafficHook: String?
        get() = definedExternally
        set(value) = definedExternally
    var afterAllowTrafficHook: String?
        get() = definedExternally
        set(value) = definedExternally
}