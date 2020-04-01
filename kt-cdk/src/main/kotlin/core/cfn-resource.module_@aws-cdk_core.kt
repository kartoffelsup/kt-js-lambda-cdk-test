@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*
import kotlin.js.Json

external interface CfnResourceProps {
    var type: String
    var properties: Json?
        get() = definedExternally
        set(value) = definedExternally
}

external open class CfnResource(scope: Construct, id: String, props: CfnResourceProps) :
    CfnRefElement {
    open var cfnOptions: ICfnResourceOptions
    open var cfnResourceType: String
    open var rawOverrides: Any
    open var dependsOn: Any
    open fun applyRemovalPolicy(policy: RemovalPolicy?, options: RemovalPolicyOptions = definedExternally)
    open fun getAtt(attributeName: String): Reference
    open fun addOverride(path: String, value: Any)
    open fun addDeletionOverride(path: String)
    open fun addPropertyOverride(propertyPath: String, value: Any)
    open fun addPropertyDeletionOverride(propertyPath: String)
    open fun addDependsOn(target: CfnResource)
    override fun toString(): String
    open fun renderProperties(props: Json): Json
    open fun validateProperties(_properties: Any)

    companion object {
        fun isCfnResource(construct: IConstruct): Boolean
    }
}

external enum class TagType {
    STANDARD /* = "StandardTag" */,
    AUTOSCALING_GROUP /* = "AutoScalingGroupTag" */,
    MAP /* = "StringToStringMap" */,
    KEY_VALUE /* = "KeyValue" */,
    NOT_TAGGABLE /* = "NotTaggable" */
}

external interface ICfnResourceOptions {
    var condition: CfnCondition?
        get() = definedExternally
        set(value) = definedExternally
    var creationPolicy: CfnCreationPolicy?
        get() = definedExternally
        set(value) = definedExternally
    var deletionPolicy: CfnDeletionPolicy?
        get() = definedExternally
        set(value) = definedExternally
    var updatePolicy: CfnUpdatePolicy?
        get() = definedExternally
        set(value) = definedExternally
    var updateReplacePolicy: CfnDeletionPolicy?
        get() = definedExternally
        set(value) = definedExternally
    var metadata: Json?
        get() = definedExternally
        set(value) = definedExternally
}