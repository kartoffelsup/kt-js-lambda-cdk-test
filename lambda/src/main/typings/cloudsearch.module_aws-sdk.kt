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
import CloudSearch.AnalysisSchemeStatus
import CloudSearch.DomainStatus
import CloudSearch.ExpressionStatus
import CloudSearch.IndexFieldStatus
import CloudSearch.SuggesterStatus
import CloudSearch.BuildSuggestersRequest
import CloudSearch.BuildSuggestersResponse
import CloudSearch.CreateDomainRequest
import CloudSearch.CreateDomainResponse
import CloudSearch.DefineAnalysisSchemeRequest
import CloudSearch.DefineAnalysisSchemeResponse
import CloudSearch.DefineExpressionRequest
import CloudSearch.DefineExpressionResponse
import CloudSearch.DefineIndexFieldRequest
import CloudSearch.DefineIndexFieldResponse
import CloudSearch.DefineSuggesterRequest
import CloudSearch.DefineSuggesterResponse
import CloudSearch.DeleteAnalysisSchemeRequest
import CloudSearch.DeleteAnalysisSchemeResponse
import CloudSearch.DeleteDomainRequest
import CloudSearch.DeleteDomainResponse
import CloudSearch.DeleteExpressionRequest
import CloudSearch.DeleteExpressionResponse
import CloudSearch.DeleteIndexFieldRequest
import CloudSearch.DeleteIndexFieldResponse
import CloudSearch.DeleteSuggesterRequest
import CloudSearch.DeleteSuggesterResponse
import CloudSearch.DescribeAnalysisSchemesRequest
import CloudSearch.DescribeAnalysisSchemesResponse
import CloudSearch.DescribeAvailabilityOptionsRequest
import CloudSearch.DescribeAvailabilityOptionsResponse
import CloudSearch.DescribeDomainEndpointOptionsRequest
import CloudSearch.DescribeDomainEndpointOptionsResponse
import CloudSearch.DescribeDomainsRequest
import CloudSearch.DescribeDomainsResponse
import CloudSearch.DescribeExpressionsRequest
import CloudSearch.DescribeExpressionsResponse
import CloudSearch.DescribeIndexFieldsRequest
import CloudSearch.DescribeIndexFieldsResponse
import CloudSearch.DescribeScalingParametersRequest
import CloudSearch.DescribeScalingParametersResponse
import CloudSearch.DescribeServiceAccessPoliciesRequest
import CloudSearch.DescribeServiceAccessPoliciesResponse
import CloudSearch.DescribeSuggestersRequest
import CloudSearch.DescribeSuggestersResponse
import CloudSearch.IndexDocumentsRequest
import CloudSearch.IndexDocumentsResponse
import CloudSearch.ListDomainNamesResponse
import CloudSearch.UpdateAvailabilityOptionsRequest
import CloudSearch.UpdateAvailabilityOptionsResponse
import CloudSearch.UpdateDomainEndpointOptionsRequest
import CloudSearch.UpdateDomainEndpointOptionsResponse
import CloudSearch.UpdateScalingParametersRequest
import CloudSearch.UpdateScalingParametersResponse
import CloudSearch.UpdateServiceAccessPoliciesRequest
import CloudSearch.UpdateServiceAccessPoliciesResponse
import CloudSearch.OptionStatus
import CloudSearch.AnalysisOptions
import CloudSearch.AnalysisScheme
import CloudSearch.Expression
import CloudSearch.IndexField
import CloudSearch.Suggester
import CloudSearch.AvailabilityOptionsStatus
import CloudSearch.DomainEndpointOptionsStatus
import CloudSearch.ScalingParametersStatus
import CloudSearch.AccessPoliciesStatus
import CloudSearch.DomainEndpointOptions
import CloudSearch.ServiceEndpoint
import CloudSearch.Limits
import CloudSearch.IntOptions
import CloudSearch.DoubleOptions
import CloudSearch.LiteralOptions
import CloudSearch.TextOptions
import CloudSearch.DateOptions
import CloudSearch.LatLonOptions
import CloudSearch.IntArrayOptions
import CloudSearch.DoubleArrayOptions
import CloudSearch.LiteralArrayOptions
import CloudSearch.TextArrayOptions
import CloudSearch.DateArrayOptions
import CloudSearch.DomainNameMap
import CloudSearch.ScalingParameters
import CloudSearch.DocumentSuggesterOptions

typealias APIVersion = String

typealias ARN = String

typealias AnalysisSchemeStatusList = Array<AnalysisSchemeStatus>

typealias Boolean = Boolean

typealias DomainId = String

typealias DomainName = String

typealias DomainNameList = Array<DomainName>

typealias DomainStatusList = Array<DomainStatus>

typealias Double = Number

typealias DynamicFieldName = String

typealias DynamicFieldNameList = Array<DynamicFieldName>

typealias ExpressionStatusList = Array<ExpressionStatus>

typealias ExpressionValue = String

typealias FieldName = String

typealias FieldNameCommaList = String

typealias FieldNameList = Array<FieldName>

typealias FieldValue = String

typealias IndexFieldStatusList = Array<IndexFieldStatus>

typealias InstanceCount = Number

typealias Long = Number

typealias MaximumPartitionCount = Number

typealias MaximumReplicationCount = Number

typealias MultiAZ = Boolean

typealias PartitionCount = Number

typealias PolicyDocument = String

typealias SearchInstanceType = String

typealias ServiceUrl = String

typealias StandardName = String

typealias StandardNameList = Array<StandardName>

typealias String = String

typealias SuggesterStatusList = Array<SuggesterStatus>

typealias UIntValue = Number

typealias UpdateTimestamp = Date

typealias Word = String

@JsModule("aws-sdk")
external open class CloudSearch(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CloudSearch.Types.ClientConfiguration */
    open fun buildSuggesters(params: BuildSuggestersRequest, callback: (err: AWSError, data: BuildSuggestersResponse) -> Unit = definedExternally): Request<BuildSuggestersResponse, AWSError>
    open fun buildSuggesters(callback: (err: AWSError, data: BuildSuggestersResponse) -> Unit = definedExternally): Request<BuildSuggestersResponse, AWSError>
    open fun createDomain(params: CreateDomainRequest, callback: (err: AWSError, data: CreateDomainResponse) -> Unit = definedExternally): Request<CreateDomainResponse, AWSError>
    open fun createDomain(callback: (err: AWSError, data: CreateDomainResponse) -> Unit = definedExternally): Request<CreateDomainResponse, AWSError>
    open fun defineAnalysisScheme(params: DefineAnalysisSchemeRequest, callback: (err: AWSError, data: DefineAnalysisSchemeResponse) -> Unit = definedExternally): Request<DefineAnalysisSchemeResponse, AWSError>
    open fun defineAnalysisScheme(callback: (err: AWSError, data: DefineAnalysisSchemeResponse) -> Unit = definedExternally): Request<DefineAnalysisSchemeResponse, AWSError>
    open fun defineExpression(params: DefineExpressionRequest, callback: (err: AWSError, data: DefineExpressionResponse) -> Unit = definedExternally): Request<DefineExpressionResponse, AWSError>
    open fun defineExpression(callback: (err: AWSError, data: DefineExpressionResponse) -> Unit = definedExternally): Request<DefineExpressionResponse, AWSError>
    open fun defineIndexField(params: DefineIndexFieldRequest, callback: (err: AWSError, data: DefineIndexFieldResponse) -> Unit = definedExternally): Request<DefineIndexFieldResponse, AWSError>
    open fun defineIndexField(callback: (err: AWSError, data: DefineIndexFieldResponse) -> Unit = definedExternally): Request<DefineIndexFieldResponse, AWSError>
    open fun defineSuggester(params: DefineSuggesterRequest, callback: (err: AWSError, data: DefineSuggesterResponse) -> Unit = definedExternally): Request<DefineSuggesterResponse, AWSError>
    open fun defineSuggester(callback: (err: AWSError, data: DefineSuggesterResponse) -> Unit = definedExternally): Request<DefineSuggesterResponse, AWSError>
    open fun deleteAnalysisScheme(params: DeleteAnalysisSchemeRequest, callback: (err: AWSError, data: DeleteAnalysisSchemeResponse) -> Unit = definedExternally): Request<DeleteAnalysisSchemeResponse, AWSError>
    open fun deleteAnalysisScheme(callback: (err: AWSError, data: DeleteAnalysisSchemeResponse) -> Unit = definedExternally): Request<DeleteAnalysisSchemeResponse, AWSError>
    open fun deleteDomain(params: DeleteDomainRequest, callback: (err: AWSError, data: DeleteDomainResponse) -> Unit = definedExternally): Request<DeleteDomainResponse, AWSError>
    open fun deleteDomain(callback: (err: AWSError, data: DeleteDomainResponse) -> Unit = definedExternally): Request<DeleteDomainResponse, AWSError>
    open fun deleteExpression(params: DeleteExpressionRequest, callback: (err: AWSError, data: DeleteExpressionResponse) -> Unit = definedExternally): Request<DeleteExpressionResponse, AWSError>
    open fun deleteExpression(callback: (err: AWSError, data: DeleteExpressionResponse) -> Unit = definedExternally): Request<DeleteExpressionResponse, AWSError>
    open fun deleteIndexField(params: DeleteIndexFieldRequest, callback: (err: AWSError, data: DeleteIndexFieldResponse) -> Unit = definedExternally): Request<DeleteIndexFieldResponse, AWSError>
    open fun deleteIndexField(callback: (err: AWSError, data: DeleteIndexFieldResponse) -> Unit = definedExternally): Request<DeleteIndexFieldResponse, AWSError>
    open fun deleteSuggester(params: DeleteSuggesterRequest, callback: (err: AWSError, data: DeleteSuggesterResponse) -> Unit = definedExternally): Request<DeleteSuggesterResponse, AWSError>
    open fun deleteSuggester(callback: (err: AWSError, data: DeleteSuggesterResponse) -> Unit = definedExternally): Request<DeleteSuggesterResponse, AWSError>
    open fun describeAnalysisSchemes(params: DescribeAnalysisSchemesRequest, callback: (err: AWSError, data: DescribeAnalysisSchemesResponse) -> Unit = definedExternally): Request<DescribeAnalysisSchemesResponse, AWSError>
    open fun describeAnalysisSchemes(callback: (err: AWSError, data: DescribeAnalysisSchemesResponse) -> Unit = definedExternally): Request<DescribeAnalysisSchemesResponse, AWSError>
    open fun describeAvailabilityOptions(params: DescribeAvailabilityOptionsRequest, callback: (err: AWSError, data: DescribeAvailabilityOptionsResponse) -> Unit = definedExternally): Request<DescribeAvailabilityOptionsResponse, AWSError>
    open fun describeAvailabilityOptions(callback: (err: AWSError, data: DescribeAvailabilityOptionsResponse) -> Unit = definedExternally): Request<DescribeAvailabilityOptionsResponse, AWSError>
    open fun describeDomainEndpointOptions(params: DescribeDomainEndpointOptionsRequest, callback: (err: AWSError, data: DescribeDomainEndpointOptionsResponse) -> Unit = definedExternally): Request<DescribeDomainEndpointOptionsResponse, AWSError>
    open fun describeDomainEndpointOptions(callback: (err: AWSError, data: DescribeDomainEndpointOptionsResponse) -> Unit = definedExternally): Request<DescribeDomainEndpointOptionsResponse, AWSError>
    open fun describeDomains(params: DescribeDomainsRequest, callback: (err: AWSError, data: DescribeDomainsResponse) -> Unit = definedExternally): Request<DescribeDomainsResponse, AWSError>
    open fun describeDomains(callback: (err: AWSError, data: DescribeDomainsResponse) -> Unit = definedExternally): Request<DescribeDomainsResponse, AWSError>
    open fun describeExpressions(params: DescribeExpressionsRequest, callback: (err: AWSError, data: DescribeExpressionsResponse) -> Unit = definedExternally): Request<DescribeExpressionsResponse, AWSError>
    open fun describeExpressions(callback: (err: AWSError, data: DescribeExpressionsResponse) -> Unit = definedExternally): Request<DescribeExpressionsResponse, AWSError>
    open fun describeIndexFields(params: DescribeIndexFieldsRequest, callback: (err: AWSError, data: DescribeIndexFieldsResponse) -> Unit = definedExternally): Request<DescribeIndexFieldsResponse, AWSError>
    open fun describeIndexFields(callback: (err: AWSError, data: DescribeIndexFieldsResponse) -> Unit = definedExternally): Request<DescribeIndexFieldsResponse, AWSError>
    open fun describeScalingParameters(params: DescribeScalingParametersRequest, callback: (err: AWSError, data: DescribeScalingParametersResponse) -> Unit = definedExternally): Request<DescribeScalingParametersResponse, AWSError>
    open fun describeScalingParameters(callback: (err: AWSError, data: DescribeScalingParametersResponse) -> Unit = definedExternally): Request<DescribeScalingParametersResponse, AWSError>
    open fun describeServiceAccessPolicies(params: DescribeServiceAccessPoliciesRequest, callback: (err: AWSError, data: DescribeServiceAccessPoliciesResponse) -> Unit = definedExternally): Request<DescribeServiceAccessPoliciesResponse, AWSError>
    open fun describeServiceAccessPolicies(callback: (err: AWSError, data: DescribeServiceAccessPoliciesResponse) -> Unit = definedExternally): Request<DescribeServiceAccessPoliciesResponse, AWSError>
    open fun describeSuggesters(params: DescribeSuggestersRequest, callback: (err: AWSError, data: DescribeSuggestersResponse) -> Unit = definedExternally): Request<DescribeSuggestersResponse, AWSError>
    open fun describeSuggesters(callback: (err: AWSError, data: DescribeSuggestersResponse) -> Unit = definedExternally): Request<DescribeSuggestersResponse, AWSError>
    open fun indexDocuments(params: IndexDocumentsRequest, callback: (err: AWSError, data: IndexDocumentsResponse) -> Unit = definedExternally): Request<IndexDocumentsResponse, AWSError>
    open fun indexDocuments(callback: (err: AWSError, data: IndexDocumentsResponse) -> Unit = definedExternally): Request<IndexDocumentsResponse, AWSError>
    open fun listDomainNames(callback: (err: AWSError, data: ListDomainNamesResponse) -> Unit = definedExternally): Request<ListDomainNamesResponse, AWSError>
    open fun updateAvailabilityOptions(params: UpdateAvailabilityOptionsRequest, callback: (err: AWSError, data: UpdateAvailabilityOptionsResponse) -> Unit = definedExternally): Request<UpdateAvailabilityOptionsResponse, AWSError>
    open fun updateAvailabilityOptions(callback: (err: AWSError, data: UpdateAvailabilityOptionsResponse) -> Unit = definedExternally): Request<UpdateAvailabilityOptionsResponse, AWSError>
    open fun updateDomainEndpointOptions(params: UpdateDomainEndpointOptionsRequest, callback: (err: AWSError, data: UpdateDomainEndpointOptionsResponse) -> Unit = definedExternally): Request<UpdateDomainEndpointOptionsResponse, AWSError>
    open fun updateDomainEndpointOptions(callback: (err: AWSError, data: UpdateDomainEndpointOptionsResponse) -> Unit = definedExternally): Request<UpdateDomainEndpointOptionsResponse, AWSError>
    open fun updateScalingParameters(params: UpdateScalingParametersRequest, callback: (err: AWSError, data: UpdateScalingParametersResponse) -> Unit = definedExternally): Request<UpdateScalingParametersResponse, AWSError>
    open fun updateScalingParameters(callback: (err: AWSError, data: UpdateScalingParametersResponse) -> Unit = definedExternally): Request<UpdateScalingParametersResponse, AWSError>
    open fun updateServiceAccessPolicies(params: UpdateServiceAccessPoliciesRequest, callback: (err: AWSError, data: UpdateServiceAccessPoliciesResponse) -> Unit = definedExternally): Request<UpdateServiceAccessPoliciesResponse, AWSError>
    open fun updateServiceAccessPolicies(callback: (err: AWSError, data: UpdateServiceAccessPoliciesResponse) -> Unit = definedExternally): Request<UpdateServiceAccessPoliciesResponse, AWSError>
    interface AccessPoliciesStatus {
        var Options: PolicyDocument
        var Status: OptionStatus
    }
    interface AnalysisOptions {
        var Synonyms: String?
            get() = definedExternally
            set(value) = definedExternally
        var Stopwords: String?
            get() = definedExternally
            set(value) = definedExternally
        var StemmingDictionary: String?
            get() = definedExternally
            set(value) = definedExternally
        var JapaneseTokenizationDictionary: String?
            get() = definedExternally
            set(value) = definedExternally
        var AlgorithmicStemming: String /* "none" | "minimal" | "light" | "full" | String */
    }
    interface AnalysisScheme {
        var AnalysisSchemeName: StandardName
        var AnalysisSchemeLanguage: String /* "ar" | "bg" | "ca" | "cs" | "da" | "de" | "el" | "en" | "es" | "eu" | "fa" | "fi" | "fr" | "ga" | "gl" | "he" | "hi" | "hu" | "hy" | "id" | "it" | "ja" | "ko" | "lv" | "mul" | "nl" | "no" | "pt" | "ro" | "ru" | "sv" | "th" | "tr" | "zh-Hans" | "zh-Hant" | String */
        var AnalysisOptions: AnalysisOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AnalysisSchemeStatus {
        var Options: AnalysisScheme
        var Status: OptionStatus
    }
    interface AvailabilityOptionsStatus {
        var Options: MultiAZ
        var Status: OptionStatus
    }
    interface BuildSuggestersRequest {
        var DomainName: DomainName
    }
    interface BuildSuggestersResponse {
        var FieldNames: FieldNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDomainRequest {
        var DomainName: DomainName
    }
    interface CreateDomainResponse {
        var DomainStatus: DomainStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DateArrayOptions {
        var DefaultValue: FieldValue?
            get() = definedExternally
            set(value) = definedExternally
        var SourceFields: FieldNameCommaList?
            get() = definedExternally
            set(value) = definedExternally
        var FacetEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SearchEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DateOptions {
        var DefaultValue: FieldValue?
            get() = definedExternally
            set(value) = definedExternally
        var SourceField: FieldName?
            get() = definedExternally
            set(value) = definedExternally
        var FacetEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SearchEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SortEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DefineAnalysisSchemeRequest {
        var DomainName: DomainName
        var AnalysisScheme: AnalysisScheme
    }
    interface DefineAnalysisSchemeResponse {
        var AnalysisScheme: AnalysisSchemeStatus
    }
    interface DefineExpressionRequest {
        var DomainName: DomainName
        var Expression: Expression
    }
    interface DefineExpressionResponse {
        var Expression: ExpressionStatus
    }
    interface DefineIndexFieldRequest {
        var DomainName: DomainName
        var IndexField: IndexField
    }
    interface DefineIndexFieldResponse {
        var IndexField: IndexFieldStatus
    }
    interface DefineSuggesterRequest {
        var DomainName: DomainName
        var Suggester: Suggester
    }
    interface DefineSuggesterResponse {
        var Suggester: SuggesterStatus
    }
    interface DeleteAnalysisSchemeRequest {
        var DomainName: DomainName
        var AnalysisSchemeName: StandardName
    }
    interface DeleteAnalysisSchemeResponse {
        var AnalysisScheme: AnalysisSchemeStatus
    }
    interface DeleteDomainRequest {
        var DomainName: DomainName
    }
    interface DeleteDomainResponse {
        var DomainStatus: DomainStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteExpressionRequest {
        var DomainName: DomainName
        var ExpressionName: StandardName
    }
    interface DeleteExpressionResponse {
        var Expression: ExpressionStatus
    }
    interface DeleteIndexFieldRequest {
        var DomainName: DomainName
        var IndexFieldName: DynamicFieldName
    }
    interface DeleteIndexFieldResponse {
        var IndexField: IndexFieldStatus
    }
    interface DeleteSuggesterRequest {
        var DomainName: DomainName
        var SuggesterName: StandardName
    }
    interface DeleteSuggesterResponse {
        var Suggester: SuggesterStatus
    }
    interface DescribeAnalysisSchemesRequest {
        var DomainName: DomainName
        var AnalysisSchemeNames: StandardNameList?
            get() = definedExternally
            set(value) = definedExternally
        var Deployed: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAnalysisSchemesResponse {
        var AnalysisSchemes: AnalysisSchemeStatusList
    }
    interface DescribeAvailabilityOptionsRequest {
        var DomainName: DomainName
        var Deployed: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAvailabilityOptionsResponse {
        var AvailabilityOptions: AvailabilityOptionsStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDomainEndpointOptionsRequest {
        var DomainName: DomainName
        var Deployed: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDomainEndpointOptionsResponse {
        var DomainEndpointOptions: DomainEndpointOptionsStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDomainsRequest {
        var DomainNames: DomainNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDomainsResponse {
        var DomainStatusList: DomainStatusList
    }
    interface DescribeExpressionsRequest {
        var DomainName: DomainName
        var ExpressionNames: StandardNameList?
            get() = definedExternally
            set(value) = definedExternally
        var Deployed: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeExpressionsResponse {
        var Expressions: ExpressionStatusList
    }
    interface DescribeIndexFieldsRequest {
        var DomainName: DomainName
        var FieldNames: DynamicFieldNameList?
            get() = definedExternally
            set(value) = definedExternally
        var Deployed: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeIndexFieldsResponse {
        var IndexFields: IndexFieldStatusList
    }
    interface DescribeScalingParametersRequest {
        var DomainName: DomainName
    }
    interface DescribeScalingParametersResponse {
        var ScalingParameters: ScalingParametersStatus
    }
    interface DescribeServiceAccessPoliciesRequest {
        var DomainName: DomainName
        var Deployed: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeServiceAccessPoliciesResponse {
        var AccessPolicies: AccessPoliciesStatus
    }
    interface DescribeSuggestersRequest {
        var DomainName: DomainName
        var SuggesterNames: StandardNameList?
            get() = definedExternally
            set(value) = definedExternally
        var Deployed: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSuggestersResponse {
        var Suggesters: SuggesterStatusList
    }
    interface DocumentSuggesterOptions {
        var SourceField: FieldName
        var FuzzyMatching: String /* "none" | "low" | "high" | String */
        var SortExpression: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DomainEndpointOptions {
        var EnforceHTTPS: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var TLSSecurityPolicy: String /* "Policy-Min-TLS-1-0-2019-07" | "Policy-Min-TLS-1-2-2019-07" | String */
    }
    interface DomainEndpointOptionsStatus {
        var Options: DomainEndpointOptions
        var Status: OptionStatus
    }
    interface DomainNameMap {
        @nativeGetter
        operator fun get(key: String): APIVersion?
        @nativeSetter
        operator fun set(key: String, value: APIVersion)
    }
    interface DomainStatus {
        var DomainId: DomainId
        var DomainName: DomainName
        var ARN: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var Created: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Deleted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var DocService: ServiceEndpoint?
            get() = definedExternally
            set(value) = definedExternally
        var SearchService: ServiceEndpoint?
            get() = definedExternally
            set(value) = definedExternally
        var RequiresIndexDocuments: Boolean
        var Processing: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SearchInstanceType: SearchInstanceType?
            get() = definedExternally
            set(value) = definedExternally
        var SearchPartitionCount: PartitionCount?
            get() = definedExternally
            set(value) = definedExternally
        var SearchInstanceCount: InstanceCount?
            get() = definedExternally
            set(value) = definedExternally
        var Limits: Limits?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DoubleArrayOptions {
        var DefaultValue: Double?
            get() = definedExternally
            set(value) = definedExternally
        var SourceFields: FieldNameCommaList?
            get() = definedExternally
            set(value) = definedExternally
        var FacetEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SearchEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DoubleOptions {
        var DefaultValue: Double?
            get() = definedExternally
            set(value) = definedExternally
        var SourceField: FieldName?
            get() = definedExternally
            set(value) = definedExternally
        var FacetEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SearchEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SortEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Expression {
        var ExpressionName: StandardName
        var ExpressionValue: ExpressionValue
    }
    interface ExpressionStatus {
        var Options: Expression
        var Status: OptionStatus
    }
    interface IndexDocumentsRequest {
        var DomainName: DomainName
    }
    interface IndexDocumentsResponse {
        var FieldNames: FieldNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IndexField {
        var IndexFieldName: DynamicFieldName
        var IndexFieldType: String /* "int" | "double" | "literal" | "text" | "date" | "latlon" | "int-array" | "double-array" | "literal-array" | "text-array" | "date-array" | String */
        var IntOptions: IntOptions?
            get() = definedExternally
            set(value) = definedExternally
        var DoubleOptions: DoubleOptions?
            get() = definedExternally
            set(value) = definedExternally
        var LiteralOptions: LiteralOptions?
            get() = definedExternally
            set(value) = definedExternally
        var TextOptions: TextOptions?
            get() = definedExternally
            set(value) = definedExternally
        var DateOptions: DateOptions?
            get() = definedExternally
            set(value) = definedExternally
        var LatLonOptions: LatLonOptions?
            get() = definedExternally
            set(value) = definedExternally
        var IntArrayOptions: IntArrayOptions?
            get() = definedExternally
            set(value) = definedExternally
        var DoubleArrayOptions: DoubleArrayOptions?
            get() = definedExternally
            set(value) = definedExternally
        var LiteralArrayOptions: LiteralArrayOptions?
            get() = definedExternally
            set(value) = definedExternally
        var TextArrayOptions: TextArrayOptions?
            get() = definedExternally
            set(value) = definedExternally
        var DateArrayOptions: DateArrayOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IndexFieldStatus {
        var Options: IndexField
        var Status: OptionStatus
    }
    interface IntArrayOptions {
        var DefaultValue: Long?
            get() = definedExternally
            set(value) = definedExternally
        var SourceFields: FieldNameCommaList?
            get() = definedExternally
            set(value) = definedExternally
        var FacetEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SearchEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IntOptions {
        var DefaultValue: Long?
            get() = definedExternally
            set(value) = definedExternally
        var SourceField: FieldName?
            get() = definedExternally
            set(value) = definedExternally
        var FacetEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SearchEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SortEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LatLonOptions {
        var DefaultValue: FieldValue?
            get() = definedExternally
            set(value) = definedExternally
        var SourceField: FieldName?
            get() = definedExternally
            set(value) = definedExternally
        var FacetEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SearchEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SortEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Limits {
        var MaximumReplicationCount: MaximumReplicationCount
        var MaximumPartitionCount: MaximumPartitionCount
    }
    interface ListDomainNamesResponse {
        var DomainNames: DomainNameMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LiteralArrayOptions {
        var DefaultValue: FieldValue?
            get() = definedExternally
            set(value) = definedExternally
        var SourceFields: FieldNameCommaList?
            get() = definedExternally
            set(value) = definedExternally
        var FacetEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SearchEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LiteralOptions {
        var DefaultValue: FieldValue?
            get() = definedExternally
            set(value) = definedExternally
        var SourceField: FieldName?
            get() = definedExternally
            set(value) = definedExternally
        var FacetEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SearchEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SortEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OptionStatus {
        var CreationDate: UpdateTimestamp
        var UpdateDate: UpdateTimestamp
        var UpdateVersion: UIntValue?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "RequiresIndexDocuments" | "Processing" | "Active" | "FailedToValidate" | String */
        var PendingDeletion: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScalingParameters {
        var DesiredInstanceType: String /* "search.m1.small" | "search.m1.large" | "search.m2.xlarge" | "search.m2.2xlarge" | "search.m3.medium" | "search.m3.large" | "search.m3.xlarge" | "search.m3.2xlarge" | String */
        var DesiredReplicationCount: UIntValue?
            get() = definedExternally
            set(value) = definedExternally
        var DesiredPartitionCount: UIntValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScalingParametersStatus {
        var Options: ScalingParameters
        var Status: OptionStatus
    }
    interface ServiceEndpoint {
        var Endpoint: ServiceUrl?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Suggester {
        var SuggesterName: StandardName
        var DocumentSuggesterOptions: DocumentSuggesterOptions
    }
    interface SuggesterStatus {
        var Options: Suggester
        var Status: OptionStatus
    }
    interface TextArrayOptions {
        var DefaultValue: FieldValue?
            get() = definedExternally
            set(value) = definedExternally
        var SourceFields: FieldNameCommaList?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var HighlightEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AnalysisScheme: Word?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TextOptions {
        var DefaultValue: FieldValue?
            get() = definedExternally
            set(value) = definedExternally
        var SourceField: FieldName?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SortEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var HighlightEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AnalysisScheme: Word?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateAvailabilityOptionsRequest {
        var DomainName: DomainName
        var MultiAZ: Boolean
    }
    interface UpdateAvailabilityOptionsResponse {
        var AvailabilityOptions: AvailabilityOptionsStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDomainEndpointOptionsRequest {
        var DomainName: DomainName
        var DomainEndpointOptions: DomainEndpointOptions
    }
    interface UpdateDomainEndpointOptionsResponse {
        var DomainEndpointOptions: DomainEndpointOptionsStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateScalingParametersRequest {
        var DomainName: DomainName
        var ScalingParameters: ScalingParameters
    }
    interface UpdateScalingParametersResponse {
        var ScalingParameters: ScalingParametersStatus
    }
    interface UpdateServiceAccessPoliciesRequest {
        var DomainName: DomainName
        var AccessPolicies: PolicyDocument
    }
    interface UpdateServiceAccessPoliciesResponse {
        var AccessPolicies: AccessPoliciesStatus
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2011-02-01" | "2013-01-01" | "latest" | String */
    }
}