@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external open class FileAssetParameters(scope: Construct, id: String) :
    Construct {
    open var bucketNameParameter: CfnParameter
    open var objectKeyParameter: CfnParameter
    open var artifactHashParameter: CfnParameter
}