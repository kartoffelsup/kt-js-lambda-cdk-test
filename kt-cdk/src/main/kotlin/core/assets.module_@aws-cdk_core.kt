@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external interface FileAssetSource {
    var sourceHash: String
    var fileName: String
    var packaging: FileAssetPackaging
}

external interface DockerImageAssetSource {
    var sourceHash: String
    var directoryName: String
    var dockerBuildArgs: `T$0`?
        get() = definedExternally
        set(value) = definedExternally
    var dockerBuildTarget: String?
        get() = definedExternally
        set(value) = definedExternally
    var dockerFile: String?
        get() = definedExternally
        set(value) = definedExternally
    var repositoryName: String?
        get() = definedExternally
        set(value) = definedExternally
}

external enum class FileAssetPackaging {
    ZIP_DIRECTORY /* = "zip" */,
    FILE /* = "file" */
}

external interface FileAssetLocation {
    var bucketName: String
    var objectKey: String
    var s3Url: String
}

external interface DockerImageAssetLocation {
    var imageUri: String
    var repositoryName: String
}