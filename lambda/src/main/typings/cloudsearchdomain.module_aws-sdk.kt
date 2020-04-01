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
import CloudSearchDomain.Bucket
import CloudSearchDomain.DocumentServiceWarning
import CloudSearchDomain.Hit
import CloudSearchDomain.SuggestionMatch
import CloudSearchDomain.SearchRequest
import CloudSearchDomain.SearchResponse
import CloudSearchDomain.SuggestRequest
import CloudSearchDomain.SuggestResponse
import CloudSearchDomain.UploadDocumentsRequest
import CloudSearchDomain.UploadDocumentsResponse
import CloudSearchDomain.BucketInfo
import CloudSearchDomain.Fields
import CloudSearchDomain.Exprs
import CloudSearchDomain.Highlights
import CloudSearchDomain.SearchStatus
import CloudSearchDomain.Hits
import CloudSearchDomain.Facets
import CloudSearchDomain.Stats
import CloudSearchDomain.FieldStats
import CloudSearchDomain.SuggestStatus
import CloudSearchDomain.SuggestModel

typealias Adds = Number

typealias BucketList = Array<Bucket>

typealias Cursor = String

typealias Deletes = Number

typealias DocumentServiceWarnings = Array<DocumentServiceWarning>

typealias Double = Number

typealias Expr = String

typealias Facet = String

typealias FieldValue = Array<String>

typealias FilterQuery = String

typealias Highlight = String

typealias HitList = Array<Hit>

typealias Long = Number

typealias Partial = Boolean

typealias Query = String

typealias QueryOptions = String

typealias Return = String

typealias Size = Number

typealias Sort = String

typealias Start = Number

typealias Stat = String

typealias String = String

typealias Suggester = String

typealias Suggestions = Array<SuggestionMatch>

typealias SuggestionsSize = Number

@JsModule("aws-sdk")
external open class CloudSearchDomain(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CloudSearchDomain.Types.ClientConfiguration */
    open fun search(params: SearchRequest, callback: (err: AWSError, data: SearchResponse) -> Unit = definedExternally): Request<SearchResponse, AWSError>
    open fun search(callback: (err: AWSError, data: SearchResponse) -> Unit = definedExternally): Request<SearchResponse, AWSError>
    open fun suggest(params: SuggestRequest, callback: (err: AWSError, data: SuggestResponse) -> Unit = definedExternally): Request<SuggestResponse, AWSError>
    open fun suggest(callback: (err: AWSError, data: SuggestResponse) -> Unit = definedExternally): Request<SuggestResponse, AWSError>
    open fun uploadDocuments(params: UploadDocumentsRequest, callback: (err: AWSError, data: UploadDocumentsResponse) -> Unit = definedExternally): Request<UploadDocumentsResponse, AWSError>
    open fun uploadDocuments(callback: (err: AWSError, data: UploadDocumentsResponse) -> Unit = definedExternally): Request<UploadDocumentsResponse, AWSError>
    interface Bucket {
        var value: String?
            get() = definedExternally
            set(value) = definedExternally
        var count: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BucketInfo {
        var buckets: BucketList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentServiceWarning {
        var message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Exprs {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface Facets {
        @nativeGetter
        operator fun get(key: String): BucketInfo?
        @nativeSetter
        operator fun set(key: String, value: BucketInfo)
    }
    interface FieldStats {
        var min: String?
            get() = definedExternally
            set(value) = definedExternally
        var max: String?
            get() = definedExternally
            set(value) = definedExternally
        var count: Long?
            get() = definedExternally
            set(value) = definedExternally
        var missing: Long?
            get() = definedExternally
            set(value) = definedExternally
        var sum: Double?
            get() = definedExternally
            set(value) = definedExternally
        var sumOfSquares: Double?
            get() = definedExternally
            set(value) = definedExternally
        var mean: String?
            get() = definedExternally
            set(value) = definedExternally
        var stddev: Double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Fields {
        @nativeGetter
        operator fun get(key: String): FieldValue?
        @nativeSetter
        operator fun set(key: String, value: FieldValue)
    }
    interface Highlights {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface Hit {
        var id: String?
            get() = definedExternally
            set(value) = definedExternally
        var fields: Fields?
            get() = definedExternally
            set(value) = definedExternally
        var exprs: Exprs?
            get() = definedExternally
            set(value) = definedExternally
        var highlights: Highlights?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Hits {
        var found: Long?
            get() = definedExternally
            set(value) = definedExternally
        var start: Long?
            get() = definedExternally
            set(value) = definedExternally
        var cursor: String?
            get() = definedExternally
            set(value) = definedExternally
        var hit: HitList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchRequest {
        var cursor: Cursor?
            get() = definedExternally
            set(value) = definedExternally
        var expr: Expr?
            get() = definedExternally
            set(value) = definedExternally
        var facet: Facet?
            get() = definedExternally
            set(value) = definedExternally
        var filterQuery: FilterQuery?
            get() = definedExternally
            set(value) = definedExternally
        var highlight: Highlight?
            get() = definedExternally
            set(value) = definedExternally
        var partial: Partial?
            get() = definedExternally
            set(value) = definedExternally
        var query: Query
        var queryOptions: QueryOptions?
            get() = definedExternally
            set(value) = definedExternally
        var queryParser: String /* "simple" | "structured" | "lucene" | "dismax" | String */
        var `return`: Return?
            get() = definedExternally
            set(value) = definedExternally
        var size: Size?
            get() = definedExternally
            set(value) = definedExternally
        var sort: Sort?
            get() = definedExternally
            set(value) = definedExternally
        var start: Start?
            get() = definedExternally
            set(value) = definedExternally
        var stats: Stat?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchResponse {
        var status: SearchStatus?
            get() = definedExternally
            set(value) = definedExternally
        var hits: Hits?
            get() = definedExternally
            set(value) = definedExternally
        var facets: Facets?
            get() = definedExternally
            set(value) = definedExternally
        var stats: Stats?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchStatus {
        var timems: Long?
            get() = definedExternally
            set(value) = definedExternally
        var rid: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Stats {
        @nativeGetter
        operator fun get(key: String): FieldStats?
        @nativeSetter
        operator fun set(key: String, value: FieldStats)
    }
    interface SuggestModel {
        var query: String?
            get() = definedExternally
            set(value) = definedExternally
        var found: Long?
            get() = definedExternally
            set(value) = definedExternally
        var suggestions: Suggestions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SuggestRequest {
        var query: Query
        var suggester: Suggester
        var size: SuggestionsSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SuggestResponse {
        var status: SuggestStatus?
            get() = definedExternally
            set(value) = definedExternally
        var suggest: SuggestModel?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SuggestStatus {
        var timems: Long?
            get() = definedExternally
            set(value) = definedExternally
        var rid: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SuggestionMatch {
        var suggestion: String?
            get() = definedExternally
            set(value) = definedExternally
        var score: Long?
            get() = definedExternally
            set(value) = definedExternally
        var id: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UploadDocumentsRequest {
        var documents: dynamic /* Buffer | Uint8Array | Blob | String | Readable */
            get() = definedExternally
            set(value) = definedExternally
        var contentType: String /* "application/json" | "application/xml" | String */
    }
    interface UploadDocumentsResponse {
        var status: String?
            get() = definedExternally
            set(value) = definedExternally
        var adds: Adds?
            get() = definedExternally
            set(value) = definedExternally
        var deletes: Deletes?
            get() = definedExternally
            set(value) = definedExternally
        var warnings: DocumentServiceWarnings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2013-01-01" | "latest" | String */
    }
}