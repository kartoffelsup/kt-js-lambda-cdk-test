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

external open class ConfigBase(options: ConfigurationOptions = definedExternally) : ConfigurationOptions {
    open fun getCredentials(callback: (err: AWSError) -> Unit)
    open fun loadFromPath(path: String): ConfigBase
    open fun update(options: ConfigurationOptions /* ConfigurationOptions & Json */, allowUnknownKeys: Boolean)
    open fun update(options: ConfigurationOptions, allowUnknownKeys: Boolean = definedExternally)
    open fun getPromisesDependency(): dynamic /* Any | Unit */
    open fun setPromisesDependency(dep: Any)
}

external open class Config(options: ConfigurationOptions /* ConfigurationOptions & ConfigurationServicePlaceholders & APIVersions */ = definedExternally) : ConfigBase {
    override fun loadFromPath(path: String): Config /* Config & ConfigurationServicePlaceholders & APIVersions */
    override fun update(options: ConfigurationOptions /* ConfigurationOptions & ConfigurationServicePlaceholders & APIVersions & Json */, allowUnknownKeys: Boolean)
    override fun update(options: ConfigurationOptions /* ConfigurationOptions & ConfigurationServicePlaceholders & APIVersions */, allowUnknownKeys: Boolean)
}

external interface HTTPOptions {
    var proxy: String?
        get() = definedExternally
        set(value) = definedExternally
    var agent: dynamic /* httpAgent | httpsAgent */
        get() = definedExternally
        set(value) = definedExternally
    var connectTimeout: Number?
        get() = definedExternally
        set(value) = definedExternally
    var timeout: Number?
        get() = definedExternally
        set(value) = definedExternally
    var xhrAsync: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var xhrWithCredentials: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Logger {
    var write: ((chunk: Any, encoding: String, callback: () -> Unit) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var log: ((messages: Any) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ParamValidation {
    var min: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var max: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var pattern: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enum: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RetryDelayOptions {
    var base: Number?
        get() = definedExternally
        set(value) = definedExternally
    var customBackoff: ((retryCount: Number, err: Error) -> Number)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface APIVersions {
    var apiVersion: String /* "latest" | String */
    var apiVersions: ConfigurationServiceApiVersions?
        get() = definedExternally
        set(value) = definedExternally
}

external open class ConfigurationOptions {
    open var computeChecksums: Boolean
    open var convertResponseTypes: Boolean
    open var correctClockSkew: Boolean
    open var customUserAgent: String
    open var credentials: dynamic /* Credentials | CredentialsOptions | Nothing? */
    open var credentialProvider: CredentialProviderChain
    open var accessKeyId: String
    open var secretAccessKey: String
    open var sessionToken: String
    open var httpOptions: HTTPOptions
    open var logger: Logger
    open var maxRedirects: Number
    open var maxRetries: Number
    open var paramValidation: dynamic /* ParamValidation | Boolean */
    open var region: String
    open var retryDelayOptions: RetryDelayOptions
    open var s3BucketEndpoint: Boolean
    open var s3DisableBodySigning: Boolean
    open var s3ForcePathStyle: Boolean
    open var s3UsEast1RegionalEndpoint: String /* "regional" | "legacy" */
    open var s3UseArnRegion: Boolean
    open var signatureCache: Boolean
    open var signatureVersion: String /* "v2" | "v3" | "v4" | String */
    open var sslEnabled: Boolean
    open var systemClockOffset: Number
    open var useAccelerateEndpoint: Boolean
    open var dynamoDbCrc32: Boolean
    open var endpointDiscoveryEnabled: Boolean
    open var endpointCacheSize: Number
    open var hostPrefixEnabled: Boolean
    open var stsRegionalEndpoints: String /* "legacy" | "regional" */
}