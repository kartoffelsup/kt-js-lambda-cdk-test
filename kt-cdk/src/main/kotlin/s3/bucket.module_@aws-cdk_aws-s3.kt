@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import core.*
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

external interface IBucket : IResource {
    var bucketArn: String
    var bucketName: String
    var bucketWebsiteUrl: String
    var bucketWebsiteDomainName: String
    var bucketDomainName: String
    var bucketDualStackDomainName: String
    var bucketRegionalDomainName: String
    var encryptionKey: Any?
        get() = definedExternally
        set(value) = definedExternally
    var policy: BucketPolicy?
        get() = definedExternally
        set(value) = definedExternally
    fun addToResourcePolicy(permission: PolicyStatement)
    fun urlForObject(key: String = definedExternally): String
    fun arnForObjects(keyPattern: String): String
    fun grantRead(identity: IGrantable, objectsKeyPattern: Any = definedExternally): Grant
    fun grantWrite(identity: IGrantable, objectsKeyPattern: Any = definedExternally): Grant
    fun grantPut(identity: IGrantable, objectsKeyPattern: Any = definedExternally): Grant
    fun grantDelete(identity: IGrantable, objectsKeyPattern: Any = definedExternally): Grant
    fun grantReadWrite(identity: IGrantable, objectsKeyPattern: Any = definedExternally): Grant
    fun grantPublicAccess(keyPrefix: String = definedExternally, vararg allowedActions: String): Grant
}

external interface BucketAttributes {
    var bucketArn: String?
        get() = definedExternally
        set(value) = definedExternally
    var bucketName: String?
        get() = definedExternally
        set(value) = definedExternally
    var bucketDomainName: String?
        get() = definedExternally
        set(value) = definedExternally
    var bucketWebsiteUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var bucketRegionalDomainName: String?
        get() = definedExternally
        set(value) = definedExternally
    var bucketDualStackDomainName: String?
        get() = definedExternally
        set(value) = definedExternally
    var bucketWebsiteNewUrlFormat: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var encryptionKey: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external open class BucketBase : Resource, IBucket {
    override var bucketArn: String
    override var bucketName: String
    override var bucketDomainName: String
    override var bucketWebsiteUrl: String
    override var bucketWebsiteDomainName: String
    override var bucketRegionalDomainName: String
    override var bucketDualStackDomainName: String
    open var autoCreatePolicy: Boolean
    open var disallowPublicAccess: Boolean
    override fun addToResourcePolicy(permission: PolicyStatement)
    override fun urlForObject(key: String): String
    override fun arnForObjects(keyPattern: String): String
    override fun grantRead(identity: IGrantable, objectsKeyPattern: Any): Grant
    override fun grantWrite(identity: IGrantable, objectsKeyPattern: Any): Grant
    override fun grantPut(identity: IGrantable, objectsKeyPattern: Any): Grant
    override fun grantDelete(identity: IGrantable, objectsKeyPattern: Any): Grant
    override fun grantReadWrite(identity: IGrantable, objectsKeyPattern: Any): Grant
    override fun grantPublicAccess(keyPrefix: String, vararg allowedActions: String): Grant
    open var grant: Any
    open var isGranteeFromAnotherAccount: Any
}

external interface BlockPublicAccessOptions {
    var blockPublicAcls: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var blockPublicPolicy: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ignorePublicAcls: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var restrictPublicBuckets: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class BlockPublicAccess(options: BlockPublicAccessOptions) {
    open var blockPublicAcls: Boolean?
    open var blockPublicPolicy: Boolean?
    open var ignorePublicAcls: Boolean?
    open var restrictPublicBuckets: Boolean?

    companion object {
        var BLOCK_ALL: BlockPublicAccess
        var BLOCK_ACLS: BlockPublicAccess
    }
}

external interface BucketMetrics {
    var id: String
    var prefix: String?
        get() = definedExternally
        set(value) = definedExternally
    var tagFilters: Json?
        get() = definedExternally
        set(value) = definedExternally
}

external enum class HttpMethods {
    GET /* = "GET" */,
    PUT /* = "PUT" */,
    HEAD /* = "HEAD" */,
    POST /* = "POST" */,
    DELETE /* = "DELETE" */
}

external interface CorsRule {
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var maxAge: Number?
        get() = definedExternally
        set(value) = definedExternally
    var allowedHeaders: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var allowedMethods: Array<HttpMethods>
    var allowedOrigins: Array<String>
    var exposedHeaders: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external enum class RedirectProtocol {
    HTTP /* = "http" */,
    HTTPS /* = "https" */
}

external interface RedirectTarget {
    var hostName: String
    var protocol: RedirectProtocol?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BucketProps {
    var encryption: BucketEncryption?
        get() = definedExternally
        set(value) = definedExternally
    var encryptionKey: Any?
        get() = definedExternally
        set(value) = definedExternally
    var bucketName: String?
        get() = definedExternally
        set(value) = definedExternally
    var removalPolicy: Any?
        get() = definedExternally
        set(value) = definedExternally
    var versioned: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var lifecycleRules: Array<LifecycleRule>?
        get() = definedExternally
        set(value) = definedExternally
    var websiteIndexDocument: String?
        get() = definedExternally
        set(value) = definedExternally
    var websiteErrorDocument: String?
        get() = definedExternally
        set(value) = definedExternally
    var websiteRedirect: RedirectTarget?
        get() = definedExternally
        set(value) = definedExternally
    var websiteRoutingRules: Array<RoutingRule>?
        get() = definedExternally
        set(value) = definedExternally
    var accessControl: BucketAccessControl?
        get() = definedExternally
        set(value) = definedExternally
    var publicReadAccess: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var blockPublicAccess: BlockPublicAccess?
        get() = definedExternally
        set(value) = definedExternally
    var metrics: Array<BucketMetrics>?
        get() = definedExternally
        set(value) = definedExternally
    var cors: Array<CorsRule>?
        get() = definedExternally
        set(value) = definedExternally
    var serverAccessLogsBucket: IBucket?
        get() = definedExternally
        set(value) = definedExternally
    var serverAccessLogsPrefix: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Bucket(scope: Construct, id: String, props: BucketProps = definedExternally) : BucketBase {
    override var bucketArn: String
    override var bucketName: String
    override var bucketDomainName: String
    override var bucketWebsiteUrl: String
    override var bucketWebsiteDomainName: String
    override var bucketDualStackDomainName: String
    override var bucketRegionalDomainName: String
    override var encryptionKey: Any?
    override var policy: BucketPolicy?
    override var autoCreatePolicy: Boolean
    override var disallowPublicAccess: Boolean
    open var accessControl: Any
    open var lifecycleRules: Any
    open var versioned: Any
    open var notifications: Any
    open var metrics: Any
    open var cors: Any
    open fun addLifecycleRule(rule: LifecycleRule)
    open fun addMetric(metric: BucketMetrics)
    open fun addCorsRule(rule: CorsRule)
    open fun addEventNotification(event: EventType, dest: IBucketNotificationDestination, vararg filters: NotificationKeyFilter)
    open fun addObjectCreatedNotification(dest: IBucketNotificationDestination, vararg filters: NotificationKeyFilter)
    open fun addObjectRemovedNotification(dest: IBucketNotificationDestination, vararg filters: NotificationKeyFilter)
    open var validateBucketName: Any
    open var parseEncryption: Any
    open var parseLifecycleConfiguration: Any
    open var parseServerAccessLogs: Any
    open var parseMetricConfiguration: Any
    open var parseCorsConfiguration: Any
    open var parseTagFilters: Any
    open var renderWebsiteConfiguration: Any
    open var allowLogDelivery: Any

    companion object {
        fun fromBucketArn(scope: Construct, id: String, bucketArn: String): IBucket
        fun fromBucketName(scope: Construct, id: String, bucketName: String): IBucket
        fun fromBucketAttributes(scope: Construct, id: String, attrs: BucketAttributes): IBucket
    }
}

external enum class BucketEncryption {
    UNENCRYPTED /* = "NONE" */,
    KMS_MANAGED /* = "MANAGED" */,
    S3_MANAGED /* = "S3MANAGED" */,
    KMS /* = "KMS" */
}

external enum class EventType {
    OBJECT_CREATED /* = "s3:ObjectCreated:*" */,
    OBJECT_CREATED_PUT /* = "s3:ObjectCreated:Put" */,
    OBJECT_CREATED_POST /* = "s3:ObjectCreated:Post" */,
    OBJECT_CREATED_COPY /* = "s3:ObjectCreated:Copy" */,
    OBJECT_CREATED_COMPLETE_MULTIPART_UPLOAD /* = "s3:ObjectCreated:CompleteMultipartUpload" */,
    OBJECT_REMOVED /* = "s3:ObjectRemoved:*" */,
    OBJECT_REMOVED_DELETE /* = "s3:ObjectRemoved:Delete" */,
    OBJECT_REMOVED_DELETE_MARKER_CREATED /* = "s3:ObjectRemoved:DeleteMarkerCreated" */,
    REDUCED_REDUNDANCY_LOST_OBJECT /* = "s3:ReducedRedundancyLostObject" */
}

external interface NotificationKeyFilter {
    var prefix: String?
        get() = definedExternally
        set(value) = definedExternally
    var suffix: String?
        get() = definedExternally
        set(value) = definedExternally
}

external enum class BucketAccessControl {
    PRIVATE /* = "Private" */,
    PUBLIC_READ /* = "PublicRead" */,
    PUBLIC_READ_WRITE /* = "PublicReadWrite" */,
    AUTHENTICATED_READ /* = "AuthenticatedRead" */,
    LOG_DELIVERY_WRITE /* = "LogDeliveryWrite" */,
    BUCKET_OWNER_READ /* = "BucketOwnerRead" */,
    BUCKET_OWNER_FULL_CONTROL /* = "BucketOwnerFullControl" */,
    AWS_EXEC_READ /* = "AwsExecRead" */
}

external interface RoutingRuleCondition {
    var httpErrorCodeReturnedEquals: String?
        get() = definedExternally
        set(value) = definedExternally
    var keyPrefixEquals: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class ReplaceKey {
    open var withKey: String?
    open var prefixWithKey: String?

    companion object {
        fun with(keyReplacement: String): ReplaceKey
        fun prefixWith(keyReplacement: String): ReplaceKey
    }
}

external interface RoutingRule {
    var hostName: String?
        get() = definedExternally
        set(value) = definedExternally
    var httpRedirectCode: String?
        get() = definedExternally
        set(value) = definedExternally
    var protocol: RedirectProtocol?
        get() = definedExternally
        set(value) = definedExternally
    var replaceKey: ReplaceKey?
        get() = definedExternally
        set(value) = definedExternally
    var condition: RoutingRuleCondition?
        get() = definedExternally
        set(value) = definedExternally
}