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
import Comprehend.BatchItemError
import Comprehend.DocumentClassificationJobProperties
import Comprehend.DocumentClassifierProperties
import Comprehend.DominantLanguageDetectionJobProperties
import Comprehend.EndpointProperties
import Comprehend.EntitiesDetectionJobProperties
import Comprehend.EntityRecognizerMetadataEntityTypesListItem
import Comprehend.EntityRecognizerProperties
import Comprehend.EntityTypesListItem
import Comprehend.KeyPhrasesDetectionJobProperties
import Comprehend.DocumentClass
import Comprehend.BatchDetectDominantLanguageItemResult
import Comprehend.BatchDetectEntitiesItemResult
import Comprehend.BatchDetectKeyPhrasesItemResult
import Comprehend.BatchDetectSentimentItemResult
import Comprehend.BatchDetectSyntaxItemResult
import Comprehend.DominantLanguage
import Comprehend.Entity
import Comprehend.KeyPhrase
import Comprehend.DocumentLabel
import Comprehend.SyntaxToken
import Comprehend.SentimentDetectionJobProperties
import Comprehend.Tag
import Comprehend.TopicsDetectionJobProperties
import Comprehend.BatchDetectDominantLanguageRequest
import Comprehend.BatchDetectDominantLanguageResponse
import Comprehend.BatchDetectEntitiesRequest
import Comprehend.BatchDetectEntitiesResponse
import Comprehend.BatchDetectKeyPhrasesRequest
import Comprehend.BatchDetectKeyPhrasesResponse
import Comprehend.BatchDetectSentimentRequest
import Comprehend.BatchDetectSentimentResponse
import Comprehend.BatchDetectSyntaxRequest
import Comprehend.BatchDetectSyntaxResponse
import Comprehend.ClassifyDocumentRequest
import Comprehend.ClassifyDocumentResponse
import Comprehend.CreateDocumentClassifierRequest
import Comprehend.CreateDocumentClassifierResponse
import Comprehend.CreateEndpointRequest
import Comprehend.CreateEndpointResponse
import Comprehend.CreateEntityRecognizerRequest
import Comprehend.CreateEntityRecognizerResponse
import Comprehend.DeleteDocumentClassifierRequest
import Comprehend.DeleteDocumentClassifierResponse
import Comprehend.DeleteEndpointRequest
import Comprehend.DeleteEndpointResponse
import Comprehend.DeleteEntityRecognizerRequest
import Comprehend.DeleteEntityRecognizerResponse
import Comprehend.DescribeDocumentClassificationJobRequest
import Comprehend.DescribeDocumentClassificationJobResponse
import Comprehend.DescribeDocumentClassifierRequest
import Comprehend.DescribeDocumentClassifierResponse
import Comprehend.DescribeDominantLanguageDetectionJobRequest
import Comprehend.DescribeDominantLanguageDetectionJobResponse
import Comprehend.DescribeEndpointRequest
import Comprehend.DescribeEndpointResponse
import Comprehend.DescribeEntitiesDetectionJobRequest
import Comprehend.DescribeEntitiesDetectionJobResponse
import Comprehend.DescribeEntityRecognizerRequest
import Comprehend.DescribeEntityRecognizerResponse
import Comprehend.DescribeKeyPhrasesDetectionJobRequest
import Comprehend.DescribeKeyPhrasesDetectionJobResponse
import Comprehend.DescribeSentimentDetectionJobRequest
import Comprehend.DescribeSentimentDetectionJobResponse
import Comprehend.DescribeTopicsDetectionJobRequest
import Comprehend.DescribeTopicsDetectionJobResponse
import Comprehend.DetectDominantLanguageRequest
import Comprehend.DetectDominantLanguageResponse
import Comprehend.DetectEntitiesRequest
import Comprehend.DetectEntitiesResponse
import Comprehend.DetectKeyPhrasesRequest
import Comprehend.DetectKeyPhrasesResponse
import Comprehend.DetectSentimentRequest
import Comprehend.DetectSentimentResponse
import Comprehend.DetectSyntaxRequest
import Comprehend.DetectSyntaxResponse
import Comprehend.ListDocumentClassificationJobsRequest
import Comprehend.ListDocumentClassificationJobsResponse
import Comprehend.ListDocumentClassifiersRequest
import Comprehend.ListDocumentClassifiersResponse
import Comprehend.ListDominantLanguageDetectionJobsRequest
import Comprehend.ListDominantLanguageDetectionJobsResponse
import Comprehend.ListEndpointsRequest
import Comprehend.ListEndpointsResponse
import Comprehend.ListEntitiesDetectionJobsRequest
import Comprehend.ListEntitiesDetectionJobsResponse
import Comprehend.ListEntityRecognizersRequest
import Comprehend.ListEntityRecognizersResponse
import Comprehend.ListKeyPhrasesDetectionJobsRequest
import Comprehend.ListKeyPhrasesDetectionJobsResponse
import Comprehend.ListSentimentDetectionJobsRequest
import Comprehend.ListSentimentDetectionJobsResponse
import Comprehend.ListTagsForResourceRequest
import Comprehend.ListTagsForResourceResponse
import Comprehend.ListTopicsDetectionJobsRequest
import Comprehend.ListTopicsDetectionJobsResponse
import Comprehend.StartDocumentClassificationJobRequest
import Comprehend.StartDocumentClassificationJobResponse
import Comprehend.StartDominantLanguageDetectionJobRequest
import Comprehend.StartDominantLanguageDetectionJobResponse
import Comprehend.StartEntitiesDetectionJobRequest
import Comprehend.StartEntitiesDetectionJobResponse
import Comprehend.StartKeyPhrasesDetectionJobRequest
import Comprehend.StartKeyPhrasesDetectionJobResponse
import Comprehend.StartSentimentDetectionJobRequest
import Comprehend.StartSentimentDetectionJobResponse
import Comprehend.StartTopicsDetectionJobRequest
import Comprehend.StartTopicsDetectionJobResponse
import Comprehend.StopDominantLanguageDetectionJobRequest
import Comprehend.StopDominantLanguageDetectionJobResponse
import Comprehend.StopEntitiesDetectionJobRequest
import Comprehend.StopEntitiesDetectionJobResponse
import Comprehend.StopKeyPhrasesDetectionJobRequest
import Comprehend.StopKeyPhrasesDetectionJobResponse
import Comprehend.StopSentimentDetectionJobRequest
import Comprehend.StopSentimentDetectionJobResponse
import Comprehend.StopTrainingDocumentClassifierRequest
import Comprehend.StopTrainingDocumentClassifierResponse
import Comprehend.StopTrainingEntityRecognizerRequest
import Comprehend.StopTrainingEntityRecognizerResponse
import Comprehend.TagResourceRequest
import Comprehend.TagResourceResponse
import Comprehend.UntagResourceRequest
import Comprehend.UntagResourceResponse
import Comprehend.UpdateEndpointRequest
import Comprehend.UpdateEndpointResponse
import Comprehend.SentimentScore
import Comprehend.ClassifierEvaluationMetrics
import Comprehend.DocumentClassifierInputDataConfig
import Comprehend.DocumentClassifierOutputDataConfig
import Comprehend.VpcConfig
import Comprehend.EntityRecognizerInputDataConfig
import Comprehend.InputDataConfig
import Comprehend.OutputDataConfig
import Comprehend.ClassifierMetadata
import Comprehend.EntityRecognizerDocuments
import Comprehend.EntityRecognizerAnnotations
import Comprehend.EntityRecognizerEntityList
import Comprehend.EntityRecognizerEvaluationMetrics
import Comprehend.EntityTypesEvaluationMetrics
import Comprehend.EntityRecognizerMetadata
import Comprehend.DocumentClassificationJobFilter
import Comprehend.DocumentClassifierFilter
import Comprehend.DominantLanguageDetectionJobFilter
import Comprehend.EndpointFilter
import Comprehend.EntitiesDetectionJobFilter
import Comprehend.EntityRecognizerFilter
import Comprehend.KeyPhrasesDetectionJobFilter
import Comprehend.SentimentDetectionJobFilter
import Comprehend.TopicsDetectionJobFilter
import Comprehend.PartOfSpeechTag

typealias AnyLengthString = String

typealias BatchItemErrorList = Array<BatchItemError>

typealias ClientRequestTokenString = String

typealias ComprehendArn = String

typealias ComprehendArnName = String

typealias ComprehendEndpointArn = String

typealias ComprehendEndpointName = String

typealias ComprehendModelArn = String

typealias DocumentClassificationJobPropertiesList = Array<DocumentClassificationJobProperties>

typealias DocumentClassifierArn = String

typealias DocumentClassifierEndpointArn = String

typealias DocumentClassifierPropertiesList = Array<DocumentClassifierProperties>

typealias DominantLanguageDetectionJobPropertiesList = Array<DominantLanguageDetectionJobProperties>

typealias Double = Number

typealias EndpointPropertiesList = Array<EndpointProperties>

typealias EntitiesDetectionJobPropertiesList = Array<EntitiesDetectionJobProperties>

typealias EntityRecognizerArn = String

typealias EntityRecognizerMetadataEntityTypesList = Array<EntityRecognizerMetadataEntityTypesListItem>

typealias EntityRecognizerPropertiesList = Array<EntityRecognizerProperties>

typealias EntityTypeName = String

typealias EntityTypesList = Array<EntityTypesListItem>

typealias Float = Number

typealias IamRoleArn = String

typealias InferenceUnitsInteger = Number

typealias Integer = Number

typealias JobId = String

typealias JobName = String

typealias KeyPhrasesDetectionJobPropertiesList = Array<KeyPhrasesDetectionJobProperties>

typealias KmsKeyId = String

typealias LabelDelimiter = String

typealias ListOfClasses = Array<DocumentClass>

typealias ListOfDetectDominantLanguageResult = Array<BatchDetectDominantLanguageItemResult>

typealias ListOfDetectEntitiesResult = Array<BatchDetectEntitiesItemResult>

typealias ListOfDetectKeyPhrasesResult = Array<BatchDetectKeyPhrasesItemResult>

typealias ListOfDetectSentimentResult = Array<BatchDetectSentimentItemResult>

typealias ListOfDetectSyntaxResult = Array<BatchDetectSyntaxItemResult>

typealias ListOfDominantLanguages = Array<DominantLanguage>

typealias ListOfEntities = Array<Entity>

typealias ListOfKeyPhrases = Array<KeyPhrase>

typealias ListOfLabels = Array<DocumentLabel>

typealias ListOfSyntaxTokens = Array<SyntaxToken>

typealias MaxResultsInteger = Number

typealias NumberOfTopicsInteger = Number

typealias S3Uri = String

typealias SecurityGroupId = String

typealias SecurityGroupIds = Array<SecurityGroupId>

typealias SentimentDetectionJobPropertiesList = Array<SentimentDetectionJobProperties>

typealias String = String

typealias StringList = Array<String>

typealias SubnetId = String

typealias Subnets = Array<SubnetId>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias Timestamp = Date

typealias TopicsDetectionJobPropertiesList = Array<TopicsDetectionJobProperties>

@JsModule("aws-sdk")
external open class Comprehend(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Comprehend.Types.ClientConfiguration */
    open fun batchDetectDominantLanguage(params: BatchDetectDominantLanguageRequest, callback: (err: AWSError, data: BatchDetectDominantLanguageResponse) -> Unit = definedExternally): Request<BatchDetectDominantLanguageResponse, AWSError>
    open fun batchDetectDominantLanguage(callback: (err: AWSError, data: BatchDetectDominantLanguageResponse) -> Unit = definedExternally): Request<BatchDetectDominantLanguageResponse, AWSError>
    open fun batchDetectEntities(params: BatchDetectEntitiesRequest, callback: (err: AWSError, data: BatchDetectEntitiesResponse) -> Unit = definedExternally): Request<BatchDetectEntitiesResponse, AWSError>
    open fun batchDetectEntities(callback: (err: AWSError, data: BatchDetectEntitiesResponse) -> Unit = definedExternally): Request<BatchDetectEntitiesResponse, AWSError>
    open fun batchDetectKeyPhrases(params: BatchDetectKeyPhrasesRequest, callback: (err: AWSError, data: BatchDetectKeyPhrasesResponse) -> Unit = definedExternally): Request<BatchDetectKeyPhrasesResponse, AWSError>
    open fun batchDetectKeyPhrases(callback: (err: AWSError, data: BatchDetectKeyPhrasesResponse) -> Unit = definedExternally): Request<BatchDetectKeyPhrasesResponse, AWSError>
    open fun batchDetectSentiment(params: BatchDetectSentimentRequest, callback: (err: AWSError, data: BatchDetectSentimentResponse) -> Unit = definedExternally): Request<BatchDetectSentimentResponse, AWSError>
    open fun batchDetectSentiment(callback: (err: AWSError, data: BatchDetectSentimentResponse) -> Unit = definedExternally): Request<BatchDetectSentimentResponse, AWSError>
    open fun batchDetectSyntax(params: BatchDetectSyntaxRequest, callback: (err: AWSError, data: BatchDetectSyntaxResponse) -> Unit = definedExternally): Request<BatchDetectSyntaxResponse, AWSError>
    open fun batchDetectSyntax(callback: (err: AWSError, data: BatchDetectSyntaxResponse) -> Unit = definedExternally): Request<BatchDetectSyntaxResponse, AWSError>
    open fun classifyDocument(params: ClassifyDocumentRequest, callback: (err: AWSError, data: ClassifyDocumentResponse) -> Unit = definedExternally): Request<ClassifyDocumentResponse, AWSError>
    open fun classifyDocument(callback: (err: AWSError, data: ClassifyDocumentResponse) -> Unit = definedExternally): Request<ClassifyDocumentResponse, AWSError>
    open fun createDocumentClassifier(params: CreateDocumentClassifierRequest, callback: (err: AWSError, data: CreateDocumentClassifierResponse) -> Unit = definedExternally): Request<CreateDocumentClassifierResponse, AWSError>
    open fun createDocumentClassifier(callback: (err: AWSError, data: CreateDocumentClassifierResponse) -> Unit = definedExternally): Request<CreateDocumentClassifierResponse, AWSError>
    open fun createEndpoint(params: CreateEndpointRequest, callback: (err: AWSError, data: CreateEndpointResponse) -> Unit = definedExternally): Request<CreateEndpointResponse, AWSError>
    open fun createEndpoint(callback: (err: AWSError, data: CreateEndpointResponse) -> Unit = definedExternally): Request<CreateEndpointResponse, AWSError>
    open fun createEntityRecognizer(params: CreateEntityRecognizerRequest, callback: (err: AWSError, data: CreateEntityRecognizerResponse) -> Unit = definedExternally): Request<CreateEntityRecognizerResponse, AWSError>
    open fun createEntityRecognizer(callback: (err: AWSError, data: CreateEntityRecognizerResponse) -> Unit = definedExternally): Request<CreateEntityRecognizerResponse, AWSError>
    open fun deleteDocumentClassifier(params: DeleteDocumentClassifierRequest, callback: (err: AWSError, data: DeleteDocumentClassifierResponse) -> Unit = definedExternally): Request<DeleteDocumentClassifierResponse, AWSError>
    open fun deleteDocumentClassifier(callback: (err: AWSError, data: DeleteDocumentClassifierResponse) -> Unit = definedExternally): Request<DeleteDocumentClassifierResponse, AWSError>
    open fun deleteEndpoint(params: DeleteEndpointRequest, callback: (err: AWSError, data: DeleteEndpointResponse) -> Unit = definedExternally): Request<DeleteEndpointResponse, AWSError>
    open fun deleteEndpoint(callback: (err: AWSError, data: DeleteEndpointResponse) -> Unit = definedExternally): Request<DeleteEndpointResponse, AWSError>
    open fun deleteEntityRecognizer(params: DeleteEntityRecognizerRequest, callback: (err: AWSError, data: DeleteEntityRecognizerResponse) -> Unit = definedExternally): Request<DeleteEntityRecognizerResponse, AWSError>
    open fun deleteEntityRecognizer(callback: (err: AWSError, data: DeleteEntityRecognizerResponse) -> Unit = definedExternally): Request<DeleteEntityRecognizerResponse, AWSError>
    open fun describeDocumentClassificationJob(params: DescribeDocumentClassificationJobRequest, callback: (err: AWSError, data: DescribeDocumentClassificationJobResponse) -> Unit = definedExternally): Request<DescribeDocumentClassificationJobResponse, AWSError>
    open fun describeDocumentClassificationJob(callback: (err: AWSError, data: DescribeDocumentClassificationJobResponse) -> Unit = definedExternally): Request<DescribeDocumentClassificationJobResponse, AWSError>
    open fun describeDocumentClassifier(params: DescribeDocumentClassifierRequest, callback: (err: AWSError, data: DescribeDocumentClassifierResponse) -> Unit = definedExternally): Request<DescribeDocumentClassifierResponse, AWSError>
    open fun describeDocumentClassifier(callback: (err: AWSError, data: DescribeDocumentClassifierResponse) -> Unit = definedExternally): Request<DescribeDocumentClassifierResponse, AWSError>
    open fun describeDominantLanguageDetectionJob(params: DescribeDominantLanguageDetectionJobRequest, callback: (err: AWSError, data: DescribeDominantLanguageDetectionJobResponse) -> Unit = definedExternally): Request<DescribeDominantLanguageDetectionJobResponse, AWSError>
    open fun describeDominantLanguageDetectionJob(callback: (err: AWSError, data: DescribeDominantLanguageDetectionJobResponse) -> Unit = definedExternally): Request<DescribeDominantLanguageDetectionJobResponse, AWSError>
    open fun describeEndpoint(params: DescribeEndpointRequest, callback: (err: AWSError, data: DescribeEndpointResponse) -> Unit = definedExternally): Request<DescribeEndpointResponse, AWSError>
    open fun describeEndpoint(callback: (err: AWSError, data: DescribeEndpointResponse) -> Unit = definedExternally): Request<DescribeEndpointResponse, AWSError>
    open fun describeEntitiesDetectionJob(params: DescribeEntitiesDetectionJobRequest, callback: (err: AWSError, data: DescribeEntitiesDetectionJobResponse) -> Unit = definedExternally): Request<DescribeEntitiesDetectionJobResponse, AWSError>
    open fun describeEntitiesDetectionJob(callback: (err: AWSError, data: DescribeEntitiesDetectionJobResponse) -> Unit = definedExternally): Request<DescribeEntitiesDetectionJobResponse, AWSError>
    open fun describeEntityRecognizer(params: DescribeEntityRecognizerRequest, callback: (err: AWSError, data: DescribeEntityRecognizerResponse) -> Unit = definedExternally): Request<DescribeEntityRecognizerResponse, AWSError>
    open fun describeEntityRecognizer(callback: (err: AWSError, data: DescribeEntityRecognizerResponse) -> Unit = definedExternally): Request<DescribeEntityRecognizerResponse, AWSError>
    open fun describeKeyPhrasesDetectionJob(params: DescribeKeyPhrasesDetectionJobRequest, callback: (err: AWSError, data: DescribeKeyPhrasesDetectionJobResponse) -> Unit = definedExternally): Request<DescribeKeyPhrasesDetectionJobResponse, AWSError>
    open fun describeKeyPhrasesDetectionJob(callback: (err: AWSError, data: DescribeKeyPhrasesDetectionJobResponse) -> Unit = definedExternally): Request<DescribeKeyPhrasesDetectionJobResponse, AWSError>
    open fun describeSentimentDetectionJob(params: DescribeSentimentDetectionJobRequest, callback: (err: AWSError, data: DescribeSentimentDetectionJobResponse) -> Unit = definedExternally): Request<DescribeSentimentDetectionJobResponse, AWSError>
    open fun describeSentimentDetectionJob(callback: (err: AWSError, data: DescribeSentimentDetectionJobResponse) -> Unit = definedExternally): Request<DescribeSentimentDetectionJobResponse, AWSError>
    open fun describeTopicsDetectionJob(params: DescribeTopicsDetectionJobRequest, callback: (err: AWSError, data: DescribeTopicsDetectionJobResponse) -> Unit = definedExternally): Request<DescribeTopicsDetectionJobResponse, AWSError>
    open fun describeTopicsDetectionJob(callback: (err: AWSError, data: DescribeTopicsDetectionJobResponse) -> Unit = definedExternally): Request<DescribeTopicsDetectionJobResponse, AWSError>
    open fun detectDominantLanguage(params: DetectDominantLanguageRequest, callback: (err: AWSError, data: DetectDominantLanguageResponse) -> Unit = definedExternally): Request<DetectDominantLanguageResponse, AWSError>
    open fun detectDominantLanguage(callback: (err: AWSError, data: DetectDominantLanguageResponse) -> Unit = definedExternally): Request<DetectDominantLanguageResponse, AWSError>
    open fun detectEntities(params: DetectEntitiesRequest, callback: (err: AWSError, data: DetectEntitiesResponse) -> Unit = definedExternally): Request<DetectEntitiesResponse, AWSError>
    open fun detectEntities(callback: (err: AWSError, data: DetectEntitiesResponse) -> Unit = definedExternally): Request<DetectEntitiesResponse, AWSError>
    open fun detectKeyPhrases(params: DetectKeyPhrasesRequest, callback: (err: AWSError, data: DetectKeyPhrasesResponse) -> Unit = definedExternally): Request<DetectKeyPhrasesResponse, AWSError>
    open fun detectKeyPhrases(callback: (err: AWSError, data: DetectKeyPhrasesResponse) -> Unit = definedExternally): Request<DetectKeyPhrasesResponse, AWSError>
    open fun detectSentiment(params: DetectSentimentRequest, callback: (err: AWSError, data: DetectSentimentResponse) -> Unit = definedExternally): Request<DetectSentimentResponse, AWSError>
    open fun detectSentiment(callback: (err: AWSError, data: DetectSentimentResponse) -> Unit = definedExternally): Request<DetectSentimentResponse, AWSError>
    open fun detectSyntax(params: DetectSyntaxRequest, callback: (err: AWSError, data: DetectSyntaxResponse) -> Unit = definedExternally): Request<DetectSyntaxResponse, AWSError>
    open fun detectSyntax(callback: (err: AWSError, data: DetectSyntaxResponse) -> Unit = definedExternally): Request<DetectSyntaxResponse, AWSError>
    open fun listDocumentClassificationJobs(params: ListDocumentClassificationJobsRequest, callback: (err: AWSError, data: ListDocumentClassificationJobsResponse) -> Unit = definedExternally): Request<ListDocumentClassificationJobsResponse, AWSError>
    open fun listDocumentClassificationJobs(callback: (err: AWSError, data: ListDocumentClassificationJobsResponse) -> Unit = definedExternally): Request<ListDocumentClassificationJobsResponse, AWSError>
    open fun listDocumentClassifiers(params: ListDocumentClassifiersRequest, callback: (err: AWSError, data: ListDocumentClassifiersResponse) -> Unit = definedExternally): Request<ListDocumentClassifiersResponse, AWSError>
    open fun listDocumentClassifiers(callback: (err: AWSError, data: ListDocumentClassifiersResponse) -> Unit = definedExternally): Request<ListDocumentClassifiersResponse, AWSError>
    open fun listDominantLanguageDetectionJobs(params: ListDominantLanguageDetectionJobsRequest, callback: (err: AWSError, data: ListDominantLanguageDetectionJobsResponse) -> Unit = definedExternally): Request<ListDominantLanguageDetectionJobsResponse, AWSError>
    open fun listDominantLanguageDetectionJobs(callback: (err: AWSError, data: ListDominantLanguageDetectionJobsResponse) -> Unit = definedExternally): Request<ListDominantLanguageDetectionJobsResponse, AWSError>
    open fun listEndpoints(params: ListEndpointsRequest, callback: (err: AWSError, data: ListEndpointsResponse) -> Unit = definedExternally): Request<ListEndpointsResponse, AWSError>
    open fun listEndpoints(callback: (err: AWSError, data: ListEndpointsResponse) -> Unit = definedExternally): Request<ListEndpointsResponse, AWSError>
    open fun listEntitiesDetectionJobs(params: ListEntitiesDetectionJobsRequest, callback: (err: AWSError, data: ListEntitiesDetectionJobsResponse) -> Unit = definedExternally): Request<ListEntitiesDetectionJobsResponse, AWSError>
    open fun listEntitiesDetectionJobs(callback: (err: AWSError, data: ListEntitiesDetectionJobsResponse) -> Unit = definedExternally): Request<ListEntitiesDetectionJobsResponse, AWSError>
    open fun listEntityRecognizers(params: ListEntityRecognizersRequest, callback: (err: AWSError, data: ListEntityRecognizersResponse) -> Unit = definedExternally): Request<ListEntityRecognizersResponse, AWSError>
    open fun listEntityRecognizers(callback: (err: AWSError, data: ListEntityRecognizersResponse) -> Unit = definedExternally): Request<ListEntityRecognizersResponse, AWSError>
    open fun listKeyPhrasesDetectionJobs(params: ListKeyPhrasesDetectionJobsRequest, callback: (err: AWSError, data: ListKeyPhrasesDetectionJobsResponse) -> Unit = definedExternally): Request<ListKeyPhrasesDetectionJobsResponse, AWSError>
    open fun listKeyPhrasesDetectionJobs(callback: (err: AWSError, data: ListKeyPhrasesDetectionJobsResponse) -> Unit = definedExternally): Request<ListKeyPhrasesDetectionJobsResponse, AWSError>
    open fun listSentimentDetectionJobs(params: ListSentimentDetectionJobsRequest, callback: (err: AWSError, data: ListSentimentDetectionJobsResponse) -> Unit = definedExternally): Request<ListSentimentDetectionJobsResponse, AWSError>
    open fun listSentimentDetectionJobs(callback: (err: AWSError, data: ListSentimentDetectionJobsResponse) -> Unit = definedExternally): Request<ListSentimentDetectionJobsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTopicsDetectionJobs(params: ListTopicsDetectionJobsRequest, callback: (err: AWSError, data: ListTopicsDetectionJobsResponse) -> Unit = definedExternally): Request<ListTopicsDetectionJobsResponse, AWSError>
    open fun listTopicsDetectionJobs(callback: (err: AWSError, data: ListTopicsDetectionJobsResponse) -> Unit = definedExternally): Request<ListTopicsDetectionJobsResponse, AWSError>
    open fun startDocumentClassificationJob(params: StartDocumentClassificationJobRequest, callback: (err: AWSError, data: StartDocumentClassificationJobResponse) -> Unit = definedExternally): Request<StartDocumentClassificationJobResponse, AWSError>
    open fun startDocumentClassificationJob(callback: (err: AWSError, data: StartDocumentClassificationJobResponse) -> Unit = definedExternally): Request<StartDocumentClassificationJobResponse, AWSError>
    open fun startDominantLanguageDetectionJob(params: StartDominantLanguageDetectionJobRequest, callback: (err: AWSError, data: StartDominantLanguageDetectionJobResponse) -> Unit = definedExternally): Request<StartDominantLanguageDetectionJobResponse, AWSError>
    open fun startDominantLanguageDetectionJob(callback: (err: AWSError, data: StartDominantLanguageDetectionJobResponse) -> Unit = definedExternally): Request<StartDominantLanguageDetectionJobResponse, AWSError>
    open fun startEntitiesDetectionJob(params: StartEntitiesDetectionJobRequest, callback: (err: AWSError, data: StartEntitiesDetectionJobResponse) -> Unit = definedExternally): Request<StartEntitiesDetectionJobResponse, AWSError>
    open fun startEntitiesDetectionJob(callback: (err: AWSError, data: StartEntitiesDetectionJobResponse) -> Unit = definedExternally): Request<StartEntitiesDetectionJobResponse, AWSError>
    open fun startKeyPhrasesDetectionJob(params: StartKeyPhrasesDetectionJobRequest, callback: (err: AWSError, data: StartKeyPhrasesDetectionJobResponse) -> Unit = definedExternally): Request<StartKeyPhrasesDetectionJobResponse, AWSError>
    open fun startKeyPhrasesDetectionJob(callback: (err: AWSError, data: StartKeyPhrasesDetectionJobResponse) -> Unit = definedExternally): Request<StartKeyPhrasesDetectionJobResponse, AWSError>
    open fun startSentimentDetectionJob(params: StartSentimentDetectionJobRequest, callback: (err: AWSError, data: StartSentimentDetectionJobResponse) -> Unit = definedExternally): Request<StartSentimentDetectionJobResponse, AWSError>
    open fun startSentimentDetectionJob(callback: (err: AWSError, data: StartSentimentDetectionJobResponse) -> Unit = definedExternally): Request<StartSentimentDetectionJobResponse, AWSError>
    open fun startTopicsDetectionJob(params: StartTopicsDetectionJobRequest, callback: (err: AWSError, data: StartTopicsDetectionJobResponse) -> Unit = definedExternally): Request<StartTopicsDetectionJobResponse, AWSError>
    open fun startTopicsDetectionJob(callback: (err: AWSError, data: StartTopicsDetectionJobResponse) -> Unit = definedExternally): Request<StartTopicsDetectionJobResponse, AWSError>
    open fun stopDominantLanguageDetectionJob(params: StopDominantLanguageDetectionJobRequest, callback: (err: AWSError, data: StopDominantLanguageDetectionJobResponse) -> Unit = definedExternally): Request<StopDominantLanguageDetectionJobResponse, AWSError>
    open fun stopDominantLanguageDetectionJob(callback: (err: AWSError, data: StopDominantLanguageDetectionJobResponse) -> Unit = definedExternally): Request<StopDominantLanguageDetectionJobResponse, AWSError>
    open fun stopEntitiesDetectionJob(params: StopEntitiesDetectionJobRequest, callback: (err: AWSError, data: StopEntitiesDetectionJobResponse) -> Unit = definedExternally): Request<StopEntitiesDetectionJobResponse, AWSError>
    open fun stopEntitiesDetectionJob(callback: (err: AWSError, data: StopEntitiesDetectionJobResponse) -> Unit = definedExternally): Request<StopEntitiesDetectionJobResponse, AWSError>
    open fun stopKeyPhrasesDetectionJob(params: StopKeyPhrasesDetectionJobRequest, callback: (err: AWSError, data: StopKeyPhrasesDetectionJobResponse) -> Unit = definedExternally): Request<StopKeyPhrasesDetectionJobResponse, AWSError>
    open fun stopKeyPhrasesDetectionJob(callback: (err: AWSError, data: StopKeyPhrasesDetectionJobResponse) -> Unit = definedExternally): Request<StopKeyPhrasesDetectionJobResponse, AWSError>
    open fun stopSentimentDetectionJob(params: StopSentimentDetectionJobRequest, callback: (err: AWSError, data: StopSentimentDetectionJobResponse) -> Unit = definedExternally): Request<StopSentimentDetectionJobResponse, AWSError>
    open fun stopSentimentDetectionJob(callback: (err: AWSError, data: StopSentimentDetectionJobResponse) -> Unit = definedExternally): Request<StopSentimentDetectionJobResponse, AWSError>
    open fun stopTrainingDocumentClassifier(params: StopTrainingDocumentClassifierRequest, callback: (err: AWSError, data: StopTrainingDocumentClassifierResponse) -> Unit = definedExternally): Request<StopTrainingDocumentClassifierResponse, AWSError>
    open fun stopTrainingDocumentClassifier(callback: (err: AWSError, data: StopTrainingDocumentClassifierResponse) -> Unit = definedExternally): Request<StopTrainingDocumentClassifierResponse, AWSError>
    open fun stopTrainingEntityRecognizer(params: StopTrainingEntityRecognizerRequest, callback: (err: AWSError, data: StopTrainingEntityRecognizerResponse) -> Unit = definedExternally): Request<StopTrainingEntityRecognizerResponse, AWSError>
    open fun stopTrainingEntityRecognizer(callback: (err: AWSError, data: StopTrainingEntityRecognizerResponse) -> Unit = definedExternally): Request<StopTrainingEntityRecognizerResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateEndpoint(params: UpdateEndpointRequest, callback: (err: AWSError, data: UpdateEndpointResponse) -> Unit = definedExternally): Request<UpdateEndpointResponse, AWSError>
    open fun updateEndpoint(callback: (err: AWSError, data: UpdateEndpointResponse) -> Unit = definedExternally): Request<UpdateEndpointResponse, AWSError>
    interface BatchDetectDominantLanguageItemResult {
        var Index: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Languages: ListOfDominantLanguages?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDetectDominantLanguageRequest {
        var TextList: StringList
    }
    interface BatchDetectDominantLanguageResponse {
        var ResultList: ListOfDetectDominantLanguageResult
        var ErrorList: BatchItemErrorList
    }
    interface BatchDetectEntitiesItemResult {
        var Index: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Entities: ListOfEntities?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDetectEntitiesRequest {
        var TextList: StringList
        var LanguageCode: String /* "en" | "es" | "fr" | "de" | "it" | "pt" | "ar" | "hi" | "ja" | "ko" | "zh" | "zh-TW" | String */
    }
    interface BatchDetectEntitiesResponse {
        var ResultList: ListOfDetectEntitiesResult
        var ErrorList: BatchItemErrorList
    }
    interface BatchDetectKeyPhrasesItemResult {
        var Index: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var KeyPhrases: ListOfKeyPhrases?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDetectKeyPhrasesRequest {
        var TextList: StringList
        var LanguageCode: String /* "en" | "es" | "fr" | "de" | "it" | "pt" | "ar" | "hi" | "ja" | "ko" | "zh" | "zh-TW" | String */
    }
    interface BatchDetectKeyPhrasesResponse {
        var ResultList: ListOfDetectKeyPhrasesResult
        var ErrorList: BatchItemErrorList
    }
    interface BatchDetectSentimentItemResult {
        var Index: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Sentiment: String /* "POSITIVE" | "NEGATIVE" | "NEUTRAL" | "MIXED" | String */
        var SentimentScore: SentimentScore?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDetectSentimentRequest {
        var TextList: StringList
        var LanguageCode: String /* "en" | "es" | "fr" | "de" | "it" | "pt" | "ar" | "hi" | "ja" | "ko" | "zh" | "zh-TW" | String */
    }
    interface BatchDetectSentimentResponse {
        var ResultList: ListOfDetectSentimentResult
        var ErrorList: BatchItemErrorList
    }
    interface BatchDetectSyntaxItemResult {
        var Index: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var SyntaxTokens: ListOfSyntaxTokens?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDetectSyntaxRequest {
        var TextList: StringList
        var LanguageCode: String /* "en" | "es" | "fr" | "de" | "it" | "pt" | String */
    }
    interface BatchDetectSyntaxResponse {
        var ResultList: ListOfDetectSyntaxResult
        var ErrorList: BatchItemErrorList
    }
    interface BatchItemError {
        var Index: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClassifierEvaluationMetrics {
        var Accuracy: Double?
            get() = definedExternally
            set(value) = definedExternally
        var Precision: Double?
            get() = definedExternally
            set(value) = definedExternally
        var Recall: Double?
            get() = definedExternally
            set(value) = definedExternally
        var F1Score: Double?
            get() = definedExternally
            set(value) = definedExternally
        var MicroPrecision: Double?
            get() = definedExternally
            set(value) = definedExternally
        var MicroRecall: Double?
            get() = definedExternally
            set(value) = definedExternally
        var MicroF1Score: Double?
            get() = definedExternally
            set(value) = definedExternally
        var HammingLoss: Double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClassifierMetadata {
        var NumberOfLabels: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfTrainedDocuments: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfTestDocuments: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var EvaluationMetrics: ClassifierEvaluationMetrics?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClassifyDocumentRequest {
        var Text: String
        var EndpointArn: DocumentClassifierEndpointArn
    }
    interface ClassifyDocumentResponse {
        var Classes: ListOfClasses?
            get() = definedExternally
            set(value) = definedExternally
        var Labels: ListOfLabels?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDocumentClassifierRequest {
        var DocumentClassifierName: ComprehendArnName
        var DataAccessRoleArn: IamRoleArn
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataConfig: DocumentClassifierInputDataConfig
        var OutputDataConfig: DocumentClassifierOutputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestTokenString?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "en" | "es" | "fr" | "de" | "it" | "pt" | "ar" | "hi" | "ja" | "ko" | "zh" | "zh-TW" | String */
        var VolumeKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
        var Mode: String /* "MULTI_CLASS" | "MULTI_LABEL" | String */
    }
    interface CreateDocumentClassifierResponse {
        var DocumentClassifierArn: DocumentClassifierArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEndpointRequest {
        var EndpointName: ComprehendEndpointName
        var ModelArn: ComprehendModelArn
        var DesiredInferenceUnits: InferenceUnitsInteger
        var ClientRequestToken: ClientRequestTokenString?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEndpointResponse {
        var EndpointArn: ComprehendEndpointArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEntityRecognizerRequest {
        var RecognizerName: ComprehendArnName
        var DataAccessRoleArn: IamRoleArn
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataConfig: EntityRecognizerInputDataConfig
        var ClientRequestToken: ClientRequestTokenString?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "en" | "es" | "fr" | "de" | "it" | "pt" | "ar" | "hi" | "ja" | "ko" | "zh" | "zh-TW" | String */
        var VolumeKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEntityRecognizerResponse {
        var EntityRecognizerArn: EntityRecognizerArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDocumentClassifierRequest {
        var DocumentClassifierArn: DocumentClassifierArn
    }
    interface DeleteDocumentClassifierResponse
    interface DeleteEndpointRequest {
        var EndpointArn: ComprehendEndpointArn
    }
    interface DeleteEndpointResponse
    interface DeleteEntityRecognizerRequest {
        var EntityRecognizerArn: EntityRecognizerArn
    }
    interface DeleteEntityRecognizerResponse
    interface DescribeDocumentClassificationJobRequest {
        var JobId: JobId
    }
    interface DescribeDocumentClassificationJobResponse {
        var DocumentClassificationJobProperties: DocumentClassificationJobProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDocumentClassifierRequest {
        var DocumentClassifierArn: DocumentClassifierArn
    }
    interface DescribeDocumentClassifierResponse {
        var DocumentClassifierProperties: DocumentClassifierProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDominantLanguageDetectionJobRequest {
        var JobId: JobId
    }
    interface DescribeDominantLanguageDetectionJobResponse {
        var DominantLanguageDetectionJobProperties: DominantLanguageDetectionJobProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEndpointRequest {
        var EndpointArn: ComprehendEndpointArn
    }
    interface DescribeEndpointResponse {
        var EndpointProperties: EndpointProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEntitiesDetectionJobRequest {
        var JobId: JobId
    }
    interface DescribeEntitiesDetectionJobResponse {
        var EntitiesDetectionJobProperties: EntitiesDetectionJobProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEntityRecognizerRequest {
        var EntityRecognizerArn: EntityRecognizerArn
    }
    interface DescribeEntityRecognizerResponse {
        var EntityRecognizerProperties: EntityRecognizerProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeKeyPhrasesDetectionJobRequest {
        var JobId: JobId
    }
    interface DescribeKeyPhrasesDetectionJobResponse {
        var KeyPhrasesDetectionJobProperties: KeyPhrasesDetectionJobProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSentimentDetectionJobRequest {
        var JobId: JobId
    }
    interface DescribeSentimentDetectionJobResponse {
        var SentimentDetectionJobProperties: SentimentDetectionJobProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTopicsDetectionJobRequest {
        var JobId: JobId
    }
    interface DescribeTopicsDetectionJobResponse {
        var TopicsDetectionJobProperties: TopicsDetectionJobProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectDominantLanguageRequest {
        var Text: String
    }
    interface DetectDominantLanguageResponse {
        var Languages: ListOfDominantLanguages?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectEntitiesRequest {
        var Text: String
        var LanguageCode: String /* "en" | "es" | "fr" | "de" | "it" | "pt" | "ar" | "hi" | "ja" | "ko" | "zh" | "zh-TW" | String */
    }
    interface DetectEntitiesResponse {
        var Entities: ListOfEntities?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectKeyPhrasesRequest {
        var Text: String
        var LanguageCode: String /* "en" | "es" | "fr" | "de" | "it" | "pt" | "ar" | "hi" | "ja" | "ko" | "zh" | "zh-TW" | String */
    }
    interface DetectKeyPhrasesResponse {
        var KeyPhrases: ListOfKeyPhrases?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectSentimentRequest {
        var Text: String
        var LanguageCode: String /* "en" | "es" | "fr" | "de" | "it" | "pt" | "ar" | "hi" | "ja" | "ko" | "zh" | "zh-TW" | String */
    }
    interface DetectSentimentResponse {
        var Sentiment: String /* "POSITIVE" | "NEGATIVE" | "NEUTRAL" | "MIXED" | String */
        var SentimentScore: SentimentScore?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectSyntaxRequest {
        var Text: String
        var LanguageCode: String /* "en" | "es" | "fr" | "de" | "it" | "pt" | String */
    }
    interface DetectSyntaxResponse {
        var SyntaxTokens: ListOfSyntaxTokens?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentClass {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Score: Float?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentClassificationJobFilter {
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
        var SubmitTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SubmitTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentClassificationJobProperties {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
        var Message: AnyLengthString?
            get() = definedExternally
            set(value) = definedExternally
        var SubmitTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentClassifierArn: DocumentClassifierArn?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataConfig: InputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var OutputDataConfig: OutputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var DataAccessRoleArn: IamRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentClassifierFilter {
        var Status: String /* "SUBMITTED" | "TRAINING" | "DELETING" | "STOP_REQUESTED" | "STOPPED" | "IN_ERROR" | "TRAINED" | String */
        var SubmitTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SubmitTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentClassifierInputDataConfig {
        var S3Uri: S3Uri
        var LabelDelimiter: LabelDelimiter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentClassifierOutputDataConfig {
        var S3Uri: S3Uri?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentClassifierProperties {
        var DocumentClassifierArn: DocumentClassifierArn?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "en" | "es" | "fr" | "de" | "it" | "pt" | "ar" | "hi" | "ja" | "ko" | "zh" | "zh-TW" | String */
        var Status: String /* "SUBMITTED" | "TRAINING" | "DELETING" | "STOP_REQUESTED" | "STOPPED" | "IN_ERROR" | "TRAINED" | String */
        var Message: AnyLengthString?
            get() = definedExternally
            set(value) = definedExternally
        var SubmitTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingStartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingEndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataConfig: DocumentClassifierInputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var OutputDataConfig: DocumentClassifierOutputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var ClassifierMetadata: ClassifierMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var DataAccessRoleArn: IamRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
        var Mode: String /* "MULTI_CLASS" | "MULTI_LABEL" | String */
    }
    interface DocumentLabel {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Score: Float?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DominantLanguage {
        var LanguageCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var Score: Float?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DominantLanguageDetectionJobFilter {
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
        var SubmitTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SubmitTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DominantLanguageDetectionJobProperties {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
        var Message: AnyLengthString?
            get() = definedExternally
            set(value) = definedExternally
        var SubmitTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataConfig: InputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var OutputDataConfig: OutputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var DataAccessRoleArn: IamRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EndpointFilter {
        var ModelArn: ComprehendModelArn?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATING" | "DELETING" | "FAILED" | "IN_SERVICE" | "UPDATING" | String */
        var CreationTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EndpointProperties {
        var EndpointArn: ComprehendEndpointArn?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATING" | "DELETING" | "FAILED" | "IN_SERVICE" | "UPDATING" | String */
        var Message: AnyLengthString?
            get() = definedExternally
            set(value) = definedExternally
        var ModelArn: ComprehendModelArn?
            get() = definedExternally
            set(value) = definedExternally
        var DesiredInferenceUnits: InferenceUnitsInteger?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentInferenceUnits: InferenceUnitsInteger?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EntitiesDetectionJobFilter {
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
        var SubmitTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SubmitTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EntitiesDetectionJobProperties {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
        var Message: AnyLengthString?
            get() = definedExternally
            set(value) = definedExternally
        var SubmitTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EntityRecognizerArn: EntityRecognizerArn?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataConfig: InputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var OutputDataConfig: OutputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "en" | "es" | "fr" | "de" | "it" | "pt" | "ar" | "hi" | "ja" | "ko" | "zh" | "zh-TW" | String */
        var DataAccessRoleArn: IamRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Entity {
        var Score: Float?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "PERSON" | "LOCATION" | "ORGANIZATION" | "COMMERCIAL_ITEM" | "EVENT" | "DATE" | "QUANTITY" | "TITLE" | "OTHER" | String */
        var Text: String?
            get() = definedExternally
            set(value) = definedExternally
        var BeginOffset: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var EndOffset: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EntityRecognizerAnnotations {
        var S3Uri: S3Uri
    }
    interface EntityRecognizerDocuments {
        var S3Uri: S3Uri
    }
    interface EntityRecognizerEntityList {
        var S3Uri: S3Uri
    }
    interface EntityRecognizerEvaluationMetrics {
        var Precision: Double?
            get() = definedExternally
            set(value) = definedExternally
        var Recall: Double?
            get() = definedExternally
            set(value) = definedExternally
        var F1Score: Double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EntityRecognizerFilter {
        var Status: String /* "SUBMITTED" | "TRAINING" | "DELETING" | "STOP_REQUESTED" | "STOPPED" | "IN_ERROR" | "TRAINED" | String */
        var SubmitTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SubmitTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EntityRecognizerInputDataConfig {
        var EntityTypes: EntityTypesList
        var Documents: EntityRecognizerDocuments
        var Annotations: EntityRecognizerAnnotations?
            get() = definedExternally
            set(value) = definedExternally
        var EntityList: EntityRecognizerEntityList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EntityRecognizerMetadata {
        var NumberOfTrainedDocuments: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfTestDocuments: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var EvaluationMetrics: EntityRecognizerEvaluationMetrics?
            get() = definedExternally
            set(value) = definedExternally
        var EntityTypes: EntityRecognizerMetadataEntityTypesList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EntityRecognizerMetadataEntityTypesListItem {
        var Type: AnyLengthString?
            get() = definedExternally
            set(value) = definedExternally
        var EvaluationMetrics: EntityTypesEvaluationMetrics?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfTrainMentions: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EntityRecognizerProperties {
        var EntityRecognizerArn: EntityRecognizerArn?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "en" | "es" | "fr" | "de" | "it" | "pt" | "ar" | "hi" | "ja" | "ko" | "zh" | "zh-TW" | String */
        var Status: String /* "SUBMITTED" | "TRAINING" | "DELETING" | "STOP_REQUESTED" | "STOPPED" | "IN_ERROR" | "TRAINED" | String */
        var Message: AnyLengthString?
            get() = definedExternally
            set(value) = definedExternally
        var SubmitTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingStartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingEndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataConfig: EntityRecognizerInputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var RecognizerMetadata: EntityRecognizerMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var DataAccessRoleArn: IamRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EntityTypesEvaluationMetrics {
        var Precision: Double?
            get() = definedExternally
            set(value) = definedExternally
        var Recall: Double?
            get() = definedExternally
            set(value) = definedExternally
        var F1Score: Double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EntityTypesListItem {
        var Type: EntityTypeName
    }
    interface InputDataConfig {
        var S3Uri: S3Uri
        var InputFormat: String /* "ONE_DOC_PER_FILE" | "ONE_DOC_PER_LINE" | String */
    }
    interface KeyPhrase {
        var Score: Float?
            get() = definedExternally
            set(value) = definedExternally
        var Text: String?
            get() = definedExternally
            set(value) = definedExternally
        var BeginOffset: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var EndOffset: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KeyPhrasesDetectionJobFilter {
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
        var SubmitTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SubmitTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KeyPhrasesDetectionJobProperties {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
        var Message: AnyLengthString?
            get() = definedExternally
            set(value) = definedExternally
        var SubmitTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataConfig: InputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var OutputDataConfig: OutputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "en" | "es" | "fr" | "de" | "it" | "pt" | "ar" | "hi" | "ja" | "ko" | "zh" | "zh-TW" | String */
        var DataAccessRoleArn: IamRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDocumentClassificationJobsRequest {
        var Filter: DocumentClassificationJobFilter?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultsInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDocumentClassificationJobsResponse {
        var DocumentClassificationJobPropertiesList: DocumentClassificationJobPropertiesList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDocumentClassifiersRequest {
        var Filter: DocumentClassifierFilter?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultsInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDocumentClassifiersResponse {
        var DocumentClassifierPropertiesList: DocumentClassifierPropertiesList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDominantLanguageDetectionJobsRequest {
        var Filter: DominantLanguageDetectionJobFilter?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultsInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDominantLanguageDetectionJobsResponse {
        var DominantLanguageDetectionJobPropertiesList: DominantLanguageDetectionJobPropertiesList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEndpointsRequest {
        var Filter: EndpointFilter?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultsInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEndpointsResponse {
        var EndpointPropertiesList: EndpointPropertiesList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEntitiesDetectionJobsRequest {
        var Filter: EntitiesDetectionJobFilter?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultsInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEntitiesDetectionJobsResponse {
        var EntitiesDetectionJobPropertiesList: EntitiesDetectionJobPropertiesList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEntityRecognizersRequest {
        var Filter: EntityRecognizerFilter?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultsInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEntityRecognizersResponse {
        var EntityRecognizerPropertiesList: EntityRecognizerPropertiesList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListKeyPhrasesDetectionJobsRequest {
        var Filter: KeyPhrasesDetectionJobFilter?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultsInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListKeyPhrasesDetectionJobsResponse {
        var KeyPhrasesDetectionJobPropertiesList: KeyPhrasesDetectionJobPropertiesList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSentimentDetectionJobsRequest {
        var Filter: SentimentDetectionJobFilter?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultsInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSentimentDetectionJobsResponse {
        var SentimentDetectionJobPropertiesList: SentimentDetectionJobPropertiesList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: ComprehendArn
    }
    interface ListTagsForResourceResponse {
        var ResourceArn: ComprehendArn?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTopicsDetectionJobsRequest {
        var Filter: TopicsDetectionJobFilter?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultsInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTopicsDetectionJobsResponse {
        var TopicsDetectionJobPropertiesList: TopicsDetectionJobPropertiesList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OutputDataConfig {
        var S3Uri: S3Uri
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PartOfSpeechTag {
        var Tag: String /* "ADJ" | "ADP" | "ADV" | "AUX" | "CONJ" | "CCONJ" | "DET" | "INTJ" | "NOUN" | "NUM" | "O" | "PART" | "PRON" | "PROPN" | "PUNCT" | "SCONJ" | "SYM" | "VERB" | String */
        var Score: Float?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SentimentDetectionJobFilter {
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
        var SubmitTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SubmitTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SentimentDetectionJobProperties {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
        var Message: AnyLengthString?
            get() = definedExternally
            set(value) = definedExternally
        var SubmitTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataConfig: InputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var OutputDataConfig: OutputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "en" | "es" | "fr" | "de" | "it" | "pt" | "ar" | "hi" | "ja" | "ko" | "zh" | "zh-TW" | String */
        var DataAccessRoleArn: IamRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SentimentScore {
        var Positive: Float?
            get() = definedExternally
            set(value) = definedExternally
        var Negative: Float?
            get() = definedExternally
            set(value) = definedExternally
        var Neutral: Float?
            get() = definedExternally
            set(value) = definedExternally
        var Mixed: Float?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartDocumentClassificationJobRequest {
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentClassifierArn: DocumentClassifierArn
        var InputDataConfig: InputDataConfig
        var OutputDataConfig: OutputDataConfig
        var DataAccessRoleArn: IamRoleArn
        var ClientRequestToken: ClientRequestTokenString?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartDocumentClassificationJobResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
    }
    interface StartDominantLanguageDetectionJobRequest {
        var InputDataConfig: InputDataConfig
        var OutputDataConfig: OutputDataConfig
        var DataAccessRoleArn: IamRoleArn
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestTokenString?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartDominantLanguageDetectionJobResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
    }
    interface StartEntitiesDetectionJobRequest {
        var InputDataConfig: InputDataConfig
        var OutputDataConfig: OutputDataConfig
        var DataAccessRoleArn: IamRoleArn
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var EntityRecognizerArn: EntityRecognizerArn?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "en" | "es" | "fr" | "de" | "it" | "pt" | "ar" | "hi" | "ja" | "ko" | "zh" | "zh-TW" | String */
        var ClientRequestToken: ClientRequestTokenString?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartEntitiesDetectionJobResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
    }
    interface StartKeyPhrasesDetectionJobRequest {
        var InputDataConfig: InputDataConfig
        var OutputDataConfig: OutputDataConfig
        var DataAccessRoleArn: IamRoleArn
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "en" | "es" | "fr" | "de" | "it" | "pt" | "ar" | "hi" | "ja" | "ko" | "zh" | "zh-TW" | String */
        var ClientRequestToken: ClientRequestTokenString?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartKeyPhrasesDetectionJobResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
    }
    interface StartSentimentDetectionJobRequest {
        var InputDataConfig: InputDataConfig
        var OutputDataConfig: OutputDataConfig
        var DataAccessRoleArn: IamRoleArn
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "en" | "es" | "fr" | "de" | "it" | "pt" | "ar" | "hi" | "ja" | "ko" | "zh" | "zh-TW" | String */
        var ClientRequestToken: ClientRequestTokenString?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartSentimentDetectionJobResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
    }
    interface StartTopicsDetectionJobRequest {
        var InputDataConfig: InputDataConfig
        var OutputDataConfig: OutputDataConfig
        var DataAccessRoleArn: IamRoleArn
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfTopics: NumberOfTopicsInteger?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestTokenString?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartTopicsDetectionJobResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
    }
    interface StopDominantLanguageDetectionJobRequest {
        var JobId: JobId
    }
    interface StopDominantLanguageDetectionJobResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
    }
    interface StopEntitiesDetectionJobRequest {
        var JobId: JobId
    }
    interface StopEntitiesDetectionJobResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
    }
    interface StopKeyPhrasesDetectionJobRequest {
        var JobId: JobId
    }
    interface StopKeyPhrasesDetectionJobResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
    }
    interface StopSentimentDetectionJobRequest {
        var JobId: JobId
    }
    interface StopSentimentDetectionJobResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
    }
    interface StopTrainingDocumentClassifierRequest {
        var DocumentClassifierArn: DocumentClassifierArn
    }
    interface StopTrainingDocumentClassifierResponse
    interface StopTrainingEntityRecognizerRequest {
        var EntityRecognizerArn: EntityRecognizerArn
    }
    interface StopTrainingEntityRecognizerResponse
    interface SyntaxToken {
        var TokenId: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Text: String?
            get() = definedExternally
            set(value) = definedExternally
        var BeginOffset: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var EndOffset: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var PartOfSpeech: PartOfSpeechTag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var ResourceArn: ComprehendArn
        var Tags: TagList
    }
    interface TagResourceResponse
    interface TopicsDetectionJobFilter {
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
        var SubmitTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SubmitTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TopicsDetectionJobProperties {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
        var Message: AnyLengthString?
            get() = definedExternally
            set(value) = definedExternally
        var SubmitTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataConfig: InputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var OutputDataConfig: OutputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfTopics: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var DataAccessRoleArn: IamRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceRequest {
        var ResourceArn: ComprehendArn
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateEndpointRequest {
        var EndpointArn: ComprehendEndpointArn
        var DesiredInferenceUnits: InferenceUnitsInteger
    }
    interface UpdateEndpointResponse
    interface VpcConfig {
        var SecurityGroupIds: SecurityGroupIds
        var Subnets: Subnets
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-11-27" | "latest" | String */
    }
}