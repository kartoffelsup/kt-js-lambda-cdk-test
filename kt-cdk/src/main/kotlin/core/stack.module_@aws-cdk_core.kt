@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*
import kotlin.js.Json

external interface `T$0` {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}

external interface StackProps {
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
    var env: Environment?
        get() = definedExternally
        set(value) = definedExternally
    var stackName: String?
        get() = definedExternally
        set(value) = definedExternally
    var tags: `T$0`?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Stack(scope: Construct = definedExternally, id: String = definedExternally, props: StackProps = definedExternally) : Construct,
    ITaggable {
    override var tags: TagManager
    open var templateOptions: ITemplateOptions
    open var region: String
    open var account: String
    open var environment: String
    open var nestedStackResource: CfnResource
    open var templateUrl: String
    open var templateFile: String
    open var artifactId: String
    open var _logicalIds: Any
    open var _stackDependencies: Any
    open var _missingContext: Any
    open var _assetParameters: Any
    open var _templateUrl: Any
    open var _stackName: Any
    open var addedImageAssets: Any
    open fun resolve(obj: Any): Any
    open fun toJsonString(obj: Any, space: Number = definedExternally): String
    open fun renameLogicalId(oldId: String, newId: String)
    open fun getLogicalId(element: CfnElement): String
    open fun addDependency(target: Stack, reason: String = definedExternally)
    open fun formatArn(components: ArnComponents): String
    open fun parseArn(arn: String, sepIfToken: String = definedExternally, hasName: Boolean = definedExternally): ArnComponents
    open fun addFileAsset(asset: FileAssetSource): FileAssetLocation
    open fun addDockerImageAsset(asset: DockerImageAssetSource): DockerImageAssetLocation
    open fun addTransform(transform: String)
    open fun allocateLogicalId(cfnElement: CfnElement): String
    override fun prepare()
    override fun synthesize(session: ISynthesisSession)
    open fun prepareCrossReference(sourceStack: Stack, reference: Reference): IResolvable
    open var getCreateExportsScope: Any
    open var parseEnvironment: Any
    open var stackDependencyReasons: Any
    open var collectMetadata: Any
    open var generateUniqueId: Any
    open var generateExportName: Any
    open var determineCrossReferenceFactory: Any
    open var findTokens: Any

    companion object {
        fun isStack(x: Any): Boolean
        fun of(construct: IConstruct): Stack
    }
}

external interface ITemplateOptions {
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
    var templateFormatVersion: String?
        get() = definedExternally
        set(value) = definedExternally
    var transform: String?
        get() = definedExternally
        set(value) = definedExternally
    var transforms: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var metadata: Json?
        get() = definedExternally
        set(value) = definedExternally
}