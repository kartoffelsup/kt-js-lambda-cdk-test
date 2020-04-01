@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external open class CloudFormationLang {
    companion object {
        fun toJSON(obj: Any, space: Number = definedExternally): String
        fun concat(left: Any?, right: Any?): Any
    }
}

external var CLOUDFORMATION_TOKEN_RESOLVER: DefaultTokenResolver

external fun minimalCloudFormationJoin(delimiter: String, values: Array<Any>): Array<Any>

external fun isNameOfCloudFormationIntrinsic(name: String): Boolean