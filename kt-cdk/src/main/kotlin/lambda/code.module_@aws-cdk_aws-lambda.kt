@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import core.CfnResource
import core.Construct
import kotlin.js.*
import kotlin.js.Json

external open class Code {
    open var isInline: Boolean
    open fun bind(scope: Construct): CodeConfig
    open fun bindToResource(_resource: CfnResource, _options: ResourceBindOptions = definedExternally)

    companion object {
        fun fromBucket(bucket: IBucket, key: String, objectVersion: String = definedExternally): S3Code
        fun bucket(bucket: IBucket, key: String, objectVersion: String = definedExternally): S3Code
        fun fromInline(code: String): InlineCode
        fun inline(code: String): InlineCode
        fun fromAsset(path: String, options: AssetOptions = definedExternally): AssetCode
        fun asset(path: String): AssetCode
        fun fromCfnParameters(props: CfnParametersCodeProps = definedExternally): CfnParametersCode
        fun cfnParameters(props: CfnParametersCodeProps = definedExternally): CfnParametersCode
    }
}

external interface CodeConfig {
    var inlineCode: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class S3Code(bucket: IBucket, key: String, objectVersion: String? = definedExternally) : Code {
    open var key: Any
    open var objectVersion: Any
    open var bucketName: Any
    override fun bind(_scope: Construct): CodeConfig
}

external open class InlineCode(code: String) : Code {
    open var code: Any
    override fun bind(_scope: Construct): CodeConfig
}

external open class AssetCode(path: String, options: AssetOptions = definedExternally) : Code {
    open var path: String
    open var options: Any
    open var asset: Any
    override fun bind(scope: Construct): CodeConfig
    override fun bindToResource(resource: CfnResource, options: ResourceBindOptions)
}

external interface ResourceBindOptions {
    var resourceProperty: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CfnParametersCodeProps {
    var bucketNameParam: Any?
        get() = definedExternally
        set(value) = definedExternally
    var objectKeyParam: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external open class CfnParametersCode(props: CfnParametersCodeProps = definedExternally) : Code {
    open var _bucketNameParam: Any
    open var _objectKeyParam: Any
    override fun bind(scope: Construct): CodeConfig
}