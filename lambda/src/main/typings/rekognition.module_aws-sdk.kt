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
import Rekognition.Asset
import Rekognition.Celebrity
import Rekognition.CelebrityRecognition
import Rekognition.CompareFacesMatch
import Rekognition.ComparedFace
import Rekognition.ContentModerationDetection
import Rekognition.CustomLabel
import Rekognition.Emotion
import Rekognition.FaceDetail
import Rekognition.FaceDetection
import Rekognition.Face
import Rekognition.FaceMatch
import Rekognition.FaceRecord
import Rekognition.Instance
import Rekognition.LabelDetection
import Rekognition.Label
import Rekognition.Landmark
import Rekognition.ModerationLabel
import Rekognition.Parent
import Rekognition.PersonDetection
import Rekognition.PersonMatch
import Rekognition.Point
import Rekognition.ProjectDescription
import Rekognition.ProjectVersionDescription
import Rekognition.RegionOfInterest
import Rekognition.StreamProcessor
import Rekognition.TextDetection
import Rekognition.TextDetectionResult
import Rekognition.UnindexedFace
import Rekognition.CompareFacesRequest
import Rekognition.CompareFacesResponse
import Rekognition.CreateCollectionRequest
import Rekognition.CreateCollectionResponse
import Rekognition.CreateProjectRequest
import Rekognition.CreateProjectResponse
import Rekognition.CreateProjectVersionRequest
import Rekognition.CreateProjectVersionResponse
import Rekognition.CreateStreamProcessorRequest
import Rekognition.CreateStreamProcessorResponse
import Rekognition.DeleteCollectionRequest
import Rekognition.DeleteCollectionResponse
import Rekognition.DeleteFacesRequest
import Rekognition.DeleteFacesResponse
import Rekognition.DeleteStreamProcessorRequest
import Rekognition.DeleteStreamProcessorResponse
import Rekognition.DescribeCollectionRequest
import Rekognition.DescribeCollectionResponse
import Rekognition.DescribeProjectVersionsRequest
import Rekognition.DescribeProjectVersionsResponse
import Rekognition.DescribeProjectsRequest
import Rekognition.DescribeProjectsResponse
import Rekognition.DescribeStreamProcessorRequest
import Rekognition.DescribeStreamProcessorResponse
import Rekognition.DetectCustomLabelsRequest
import Rekognition.DetectCustomLabelsResponse
import Rekognition.DetectFacesRequest
import Rekognition.DetectFacesResponse
import Rekognition.DetectLabelsRequest
import Rekognition.DetectLabelsResponse
import Rekognition.DetectModerationLabelsRequest
import Rekognition.DetectModerationLabelsResponse
import Rekognition.DetectTextRequest
import Rekognition.DetectTextResponse
import Rekognition.GetCelebrityInfoRequest
import Rekognition.GetCelebrityInfoResponse
import Rekognition.GetCelebrityRecognitionRequest
import Rekognition.GetCelebrityRecognitionResponse
import Rekognition.GetContentModerationRequest
import Rekognition.GetContentModerationResponse
import Rekognition.GetFaceDetectionRequest
import Rekognition.GetFaceDetectionResponse
import Rekognition.GetFaceSearchRequest
import Rekognition.GetFaceSearchResponse
import Rekognition.GetLabelDetectionRequest
import Rekognition.GetLabelDetectionResponse
import Rekognition.GetPersonTrackingRequest
import Rekognition.GetPersonTrackingResponse
import Rekognition.GetTextDetectionRequest
import Rekognition.GetTextDetectionResponse
import Rekognition.IndexFacesRequest
import Rekognition.IndexFacesResponse
import Rekognition.ListCollectionsRequest
import Rekognition.ListCollectionsResponse
import Rekognition.ListFacesRequest
import Rekognition.ListFacesResponse
import Rekognition.ListStreamProcessorsRequest
import Rekognition.ListStreamProcessorsResponse
import Rekognition.RecognizeCelebritiesRequest
import Rekognition.RecognizeCelebritiesResponse
import Rekognition.SearchFacesRequest
import Rekognition.SearchFacesResponse
import Rekognition.SearchFacesByImageRequest
import Rekognition.SearchFacesByImageResponse
import Rekognition.StartCelebrityRecognitionRequest
import Rekognition.StartCelebrityRecognitionResponse
import Rekognition.StartContentModerationRequest
import Rekognition.StartContentModerationResponse
import Rekognition.StartFaceDetectionRequest
import Rekognition.StartFaceDetectionResponse
import Rekognition.StartFaceSearchRequest
import Rekognition.StartFaceSearchResponse
import Rekognition.StartLabelDetectionRequest
import Rekognition.StartLabelDetectionResponse
import Rekognition.StartPersonTrackingRequest
import Rekognition.StartPersonTrackingResponse
import Rekognition.StartProjectVersionRequest
import Rekognition.StartProjectVersionResponse
import Rekognition.StartStreamProcessorRequest
import Rekognition.StartStreamProcessorResponse
import Rekognition.StartTextDetectionRequest
import Rekognition.StartTextDetectionResponse
import Rekognition.StopProjectVersionRequest
import Rekognition.StopProjectVersionResponse
import Rekognition.StopStreamProcessorRequest
import Rekognition.StopStreamProcessorResponse
import Rekognition.GroundTruthManifest
import Rekognition.BoundingBox
import Rekognition.CelebrityDetail
import Rekognition.Image
import Rekognition.ComparedSourceImageFace
import Rekognition.Pose
import Rekognition.ImageQuality
import Rekognition.OutputConfig
import Rekognition.TrainingData
import Rekognition.TestingData
import Rekognition.StreamProcessorInput
import Rekognition.StreamProcessorOutput
import Rekognition.StreamProcessorSettings
import Rekognition.Geometry
import Rekognition.HumanLoopConfig
import Rekognition.HumanLoopActivationOutput
import Rekognition.DetectionFilter
import Rekognition.DetectTextFilters
import Rekognition.Summary
import Rekognition.AgeRange
import Rekognition.Smile
import Rekognition.Eyeglasses
import Rekognition.Sunglasses
import Rekognition.Gender
import Rekognition.Beard
import Rekognition.Mustache
import Rekognition.EyeOpen
import Rekognition.MouthOpen
import Rekognition.VideoMetadata
import Rekognition.S3Object
import Rekognition.HumanLoopDataAttributes
import Rekognition.PersonDetail
import Rekognition.TrainingDataResult
import Rekognition.TestingDataResult
import Rekognition.EvaluationResult
import Rekognition.Video
import Rekognition.NotificationChannel
import Rekognition.StartTextDetectionFilters
import Rekognition.KinesisVideoStream
import Rekognition.KinesisDataStream
import Rekognition.FaceSearchSettings

typealias Assets = Array<Asset>

typealias Attributes = Array<String /* "DEFAULT" | "ALL" | String */>

typealias Boolean = Boolean

typealias BoundingBoxHeight = Number

typealias BoundingBoxWidth = Number

typealias CelebrityList = Array<Celebrity>

typealias CelebrityRecognitions = Array<CelebrityRecognition>

typealias ClientRequestToken = String

typealias CollectionId = String

typealias CollectionIdList = Array<CollectionId>

typealias CompareFacesMatchList = Array<CompareFacesMatch>

typealias CompareFacesUnmatchList = Array<ComparedFace>

typealias ComparedFaceList = Array<ComparedFace>

typealias ContentClassifiers = Array<String /* "FreeOfPersonallyIdentifiableInformation" | "FreeOfAdultContent" | String */>

typealias ContentModerationDetections = Array<ContentModerationDetection>

typealias CustomLabels = Array<CustomLabel>

typealias DateTime = Date

typealias Degree = Number

typealias Emotions = Array<Emotion>

typealias ExtendedPaginationToken = String

typealias ExternalImageId = String

typealias FaceDetailList = Array<FaceDetail>

typealias FaceDetections = Array<FaceDetection>

typealias FaceId = String

typealias FaceIdList = Array<FaceId>

typealias FaceList = Array<Face>

typealias FaceMatchList = Array<FaceMatch>

typealias FaceModelVersionList = Array<String>

typealias FaceRecordList = Array<FaceRecord>

typealias Float = Number

typealias FlowDefinitionArn = String

typealias HumanLoopActivationConditionsEvaluationResults = String

typealias HumanLoopActivationReason = String

typealias HumanLoopActivationReasons = Array<HumanLoopActivationReason>

typealias HumanLoopArn = String

typealias HumanLoopName = String

typealias ImageId = String

typealias InferenceUnits = Number

typealias Instances = Array<Instance>

typealias JobId = String

typealias JobTag = String

typealias KinesisDataArn = String

typealias KinesisVideoArn = String

typealias LabelDetections = Array<LabelDetection>

typealias Labels = Array<Label>

typealias Landmarks = Array<Landmark>

typealias MaxFaces = Number

typealias MaxFacesToIndex = Number

typealias MaxResults = Number

typealias ModerationLabels = Array<ModerationLabel>

typealias PageSize = Number

typealias PaginationToken = String

typealias Parents = Array<Parent>

typealias Percent = Number

typealias PersonDetections = Array<PersonDetection>

typealias PersonIndex = Number

typealias PersonMatches = Array<PersonMatch>

typealias Polygon = Array<Point>

typealias ProjectArn = String

typealias ProjectDescriptions = Array<ProjectDescription>

typealias ProjectName = String

typealias ProjectVersionArn = String

typealias ProjectVersionDescriptions = Array<ProjectVersionDescription>

typealias ProjectVersionsPageSize = Number

typealias ProjectsPageSize = Number

typealias Reasons = Array<String /* "EXCEEDS_MAX_FACES" | "EXTREME_POSE" | "LOW_BRIGHTNESS" | "LOW_SHARPNESS" | "LOW_CONFIDENCE" | "SMALL_BOUNDING_BOX" | "LOW_FACE_QUALITY" | String */>

typealias RegionsOfInterest = Array<RegionOfInterest>

typealias RekognitionUniqueId = String

typealias RoleArn = String

typealias S3Bucket = String

typealias S3KeyPrefix = String

typealias S3ObjectName = String

typealias S3ObjectVersion = String

typealias SNSTopicArn = String

typealias StatusMessage = String

typealias StreamProcessorArn = String

typealias StreamProcessorList = Array<StreamProcessor>

typealias StreamProcessorName = String

typealias String = String

typealias TextDetectionList = Array<TextDetection>

typealias TextDetectionResults = Array<TextDetectionResult>

typealias Timestamp = Number

typealias UInteger = Number

typealias ULong = Number

typealias UnindexedFaces = Array<UnindexedFace>

typealias Url = String

typealias Urls = Array<Url>

typealias VersionName = String

typealias VersionNames = Array<VersionName>

@JsModule("aws-sdk")
external open class Rekognition(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Rekognition.Types.ClientConfiguration */
    open fun compareFaces(params: CompareFacesRequest, callback: (err: AWSError, data: CompareFacesResponse) -> Unit = definedExternally): Request<CompareFacesResponse, AWSError>
    open fun compareFaces(callback: (err: AWSError, data: CompareFacesResponse) -> Unit = definedExternally): Request<CompareFacesResponse, AWSError>
    open fun createCollection(params: CreateCollectionRequest, callback: (err: AWSError, data: CreateCollectionResponse) -> Unit = definedExternally): Request<CreateCollectionResponse, AWSError>
    open fun createCollection(callback: (err: AWSError, data: CreateCollectionResponse) -> Unit = definedExternally): Request<CreateCollectionResponse, AWSError>
    open fun createProject(params: CreateProjectRequest, callback: (err: AWSError, data: CreateProjectResponse) -> Unit = definedExternally): Request<CreateProjectResponse, AWSError>
    open fun createProject(callback: (err: AWSError, data: CreateProjectResponse) -> Unit = definedExternally): Request<CreateProjectResponse, AWSError>
    open fun createProjectVersion(params: CreateProjectVersionRequest, callback: (err: AWSError, data: CreateProjectVersionResponse) -> Unit = definedExternally): Request<CreateProjectVersionResponse, AWSError>
    open fun createProjectVersion(callback: (err: AWSError, data: CreateProjectVersionResponse) -> Unit = definedExternally): Request<CreateProjectVersionResponse, AWSError>
    open fun createStreamProcessor(params: CreateStreamProcessorRequest, callback: (err: AWSError, data: CreateStreamProcessorResponse) -> Unit = definedExternally): Request<CreateStreamProcessorResponse, AWSError>
    open fun createStreamProcessor(callback: (err: AWSError, data: CreateStreamProcessorResponse) -> Unit = definedExternally): Request<CreateStreamProcessorResponse, AWSError>
    open fun deleteCollection(params: DeleteCollectionRequest, callback: (err: AWSError, data: DeleteCollectionResponse) -> Unit = definedExternally): Request<DeleteCollectionResponse, AWSError>
    open fun deleteCollection(callback: (err: AWSError, data: DeleteCollectionResponse) -> Unit = definedExternally): Request<DeleteCollectionResponse, AWSError>
    open fun deleteFaces(params: DeleteFacesRequest, callback: (err: AWSError, data: DeleteFacesResponse) -> Unit = definedExternally): Request<DeleteFacesResponse, AWSError>
    open fun deleteFaces(callback: (err: AWSError, data: DeleteFacesResponse) -> Unit = definedExternally): Request<DeleteFacesResponse, AWSError>
    open fun deleteStreamProcessor(params: DeleteStreamProcessorRequest, callback: (err: AWSError, data: DeleteStreamProcessorResponse) -> Unit = definedExternally): Request<DeleteStreamProcessorResponse, AWSError>
    open fun deleteStreamProcessor(callback: (err: AWSError, data: DeleteStreamProcessorResponse) -> Unit = definedExternally): Request<DeleteStreamProcessorResponse, AWSError>
    open fun describeCollection(params: DescribeCollectionRequest, callback: (err: AWSError, data: DescribeCollectionResponse) -> Unit = definedExternally): Request<DescribeCollectionResponse, AWSError>
    open fun describeCollection(callback: (err: AWSError, data: DescribeCollectionResponse) -> Unit = definedExternally): Request<DescribeCollectionResponse, AWSError>
    open fun describeProjectVersions(params: DescribeProjectVersionsRequest, callback: (err: AWSError, data: DescribeProjectVersionsResponse) -> Unit = definedExternally): Request<DescribeProjectVersionsResponse, AWSError>
    open fun describeProjectVersions(callback: (err: AWSError, data: DescribeProjectVersionsResponse) -> Unit = definedExternally): Request<DescribeProjectVersionsResponse, AWSError>
    open fun describeProjects(params: DescribeProjectsRequest, callback: (err: AWSError, data: DescribeProjectsResponse) -> Unit = definedExternally): Request<DescribeProjectsResponse, AWSError>
    open fun describeProjects(callback: (err: AWSError, data: DescribeProjectsResponse) -> Unit = definedExternally): Request<DescribeProjectsResponse, AWSError>
    open fun describeStreamProcessor(params: DescribeStreamProcessorRequest, callback: (err: AWSError, data: DescribeStreamProcessorResponse) -> Unit = definedExternally): Request<DescribeStreamProcessorResponse, AWSError>
    open fun describeStreamProcessor(callback: (err: AWSError, data: DescribeStreamProcessorResponse) -> Unit = definedExternally): Request<DescribeStreamProcessorResponse, AWSError>
    open fun detectCustomLabels(params: DetectCustomLabelsRequest, callback: (err: AWSError, data: DetectCustomLabelsResponse) -> Unit = definedExternally): Request<DetectCustomLabelsResponse, AWSError>
    open fun detectCustomLabels(callback: (err: AWSError, data: DetectCustomLabelsResponse) -> Unit = definedExternally): Request<DetectCustomLabelsResponse, AWSError>
    open fun detectFaces(params: DetectFacesRequest, callback: (err: AWSError, data: DetectFacesResponse) -> Unit = definedExternally): Request<DetectFacesResponse, AWSError>
    open fun detectFaces(callback: (err: AWSError, data: DetectFacesResponse) -> Unit = definedExternally): Request<DetectFacesResponse, AWSError>
    open fun detectLabels(params: DetectLabelsRequest, callback: (err: AWSError, data: DetectLabelsResponse) -> Unit = definedExternally): Request<DetectLabelsResponse, AWSError>
    open fun detectLabels(callback: (err: AWSError, data: DetectLabelsResponse) -> Unit = definedExternally): Request<DetectLabelsResponse, AWSError>
    open fun detectModerationLabels(params: DetectModerationLabelsRequest, callback: (err: AWSError, data: DetectModerationLabelsResponse) -> Unit = definedExternally): Request<DetectModerationLabelsResponse, AWSError>
    open fun detectModerationLabels(callback: (err: AWSError, data: DetectModerationLabelsResponse) -> Unit = definedExternally): Request<DetectModerationLabelsResponse, AWSError>
    open fun detectText(params: DetectTextRequest, callback: (err: AWSError, data: DetectTextResponse) -> Unit = definedExternally): Request<DetectTextResponse, AWSError>
    open fun detectText(callback: (err: AWSError, data: DetectTextResponse) -> Unit = definedExternally): Request<DetectTextResponse, AWSError>
    open fun getCelebrityInfo(params: GetCelebrityInfoRequest, callback: (err: AWSError, data: GetCelebrityInfoResponse) -> Unit = definedExternally): Request<GetCelebrityInfoResponse, AWSError>
    open fun getCelebrityInfo(callback: (err: AWSError, data: GetCelebrityInfoResponse) -> Unit = definedExternally): Request<GetCelebrityInfoResponse, AWSError>
    open fun getCelebrityRecognition(params: GetCelebrityRecognitionRequest, callback: (err: AWSError, data: GetCelebrityRecognitionResponse) -> Unit = definedExternally): Request<GetCelebrityRecognitionResponse, AWSError>
    open fun getCelebrityRecognition(callback: (err: AWSError, data: GetCelebrityRecognitionResponse) -> Unit = definedExternally): Request<GetCelebrityRecognitionResponse, AWSError>
    open fun getContentModeration(params: GetContentModerationRequest, callback: (err: AWSError, data: GetContentModerationResponse) -> Unit = definedExternally): Request<GetContentModerationResponse, AWSError>
    open fun getContentModeration(callback: (err: AWSError, data: GetContentModerationResponse) -> Unit = definedExternally): Request<GetContentModerationResponse, AWSError>
    open fun getFaceDetection(params: GetFaceDetectionRequest, callback: (err: AWSError, data: GetFaceDetectionResponse) -> Unit = definedExternally): Request<GetFaceDetectionResponse, AWSError>
    open fun getFaceDetection(callback: (err: AWSError, data: GetFaceDetectionResponse) -> Unit = definedExternally): Request<GetFaceDetectionResponse, AWSError>
    open fun getFaceSearch(params: GetFaceSearchRequest, callback: (err: AWSError, data: GetFaceSearchResponse) -> Unit = definedExternally): Request<GetFaceSearchResponse, AWSError>
    open fun getFaceSearch(callback: (err: AWSError, data: GetFaceSearchResponse) -> Unit = definedExternally): Request<GetFaceSearchResponse, AWSError>
    open fun getLabelDetection(params: GetLabelDetectionRequest, callback: (err: AWSError, data: GetLabelDetectionResponse) -> Unit = definedExternally): Request<GetLabelDetectionResponse, AWSError>
    open fun getLabelDetection(callback: (err: AWSError, data: GetLabelDetectionResponse) -> Unit = definedExternally): Request<GetLabelDetectionResponse, AWSError>
    open fun getPersonTracking(params: GetPersonTrackingRequest, callback: (err: AWSError, data: GetPersonTrackingResponse) -> Unit = definedExternally): Request<GetPersonTrackingResponse, AWSError>
    open fun getPersonTracking(callback: (err: AWSError, data: GetPersonTrackingResponse) -> Unit = definedExternally): Request<GetPersonTrackingResponse, AWSError>
    open fun getTextDetection(params: GetTextDetectionRequest, callback: (err: AWSError, data: GetTextDetectionResponse) -> Unit = definedExternally): Request<GetTextDetectionResponse, AWSError>
    open fun getTextDetection(callback: (err: AWSError, data: GetTextDetectionResponse) -> Unit = definedExternally): Request<GetTextDetectionResponse, AWSError>
    open fun indexFaces(params: IndexFacesRequest, callback: (err: AWSError, data: IndexFacesResponse) -> Unit = definedExternally): Request<IndexFacesResponse, AWSError>
    open fun indexFaces(callback: (err: AWSError, data: IndexFacesResponse) -> Unit = definedExternally): Request<IndexFacesResponse, AWSError>
    open fun listCollections(params: ListCollectionsRequest, callback: (err: AWSError, data: ListCollectionsResponse) -> Unit = definedExternally): Request<ListCollectionsResponse, AWSError>
    open fun listCollections(callback: (err: AWSError, data: ListCollectionsResponse) -> Unit = definedExternally): Request<ListCollectionsResponse, AWSError>
    open fun listFaces(params: ListFacesRequest, callback: (err: AWSError, data: ListFacesResponse) -> Unit = definedExternally): Request<ListFacesResponse, AWSError>
    open fun listFaces(callback: (err: AWSError, data: ListFacesResponse) -> Unit = definedExternally): Request<ListFacesResponse, AWSError>
    open fun listStreamProcessors(params: ListStreamProcessorsRequest, callback: (err: AWSError, data: ListStreamProcessorsResponse) -> Unit = definedExternally): Request<ListStreamProcessorsResponse, AWSError>
    open fun listStreamProcessors(callback: (err: AWSError, data: ListStreamProcessorsResponse) -> Unit = definedExternally): Request<ListStreamProcessorsResponse, AWSError>
    open fun recognizeCelebrities(params: RecognizeCelebritiesRequest, callback: (err: AWSError, data: RecognizeCelebritiesResponse) -> Unit = definedExternally): Request<RecognizeCelebritiesResponse, AWSError>
    open fun recognizeCelebrities(callback: (err: AWSError, data: RecognizeCelebritiesResponse) -> Unit = definedExternally): Request<RecognizeCelebritiesResponse, AWSError>
    open fun searchFaces(params: SearchFacesRequest, callback: (err: AWSError, data: SearchFacesResponse) -> Unit = definedExternally): Request<SearchFacesResponse, AWSError>
    open fun searchFaces(callback: (err: AWSError, data: SearchFacesResponse) -> Unit = definedExternally): Request<SearchFacesResponse, AWSError>
    open fun searchFacesByImage(params: SearchFacesByImageRequest, callback: (err: AWSError, data: SearchFacesByImageResponse) -> Unit = definedExternally): Request<SearchFacesByImageResponse, AWSError>
    open fun searchFacesByImage(callback: (err: AWSError, data: SearchFacesByImageResponse) -> Unit = definedExternally): Request<SearchFacesByImageResponse, AWSError>
    open fun startCelebrityRecognition(params: StartCelebrityRecognitionRequest, callback: (err: AWSError, data: StartCelebrityRecognitionResponse) -> Unit = definedExternally): Request<StartCelebrityRecognitionResponse, AWSError>
    open fun startCelebrityRecognition(callback: (err: AWSError, data: StartCelebrityRecognitionResponse) -> Unit = definedExternally): Request<StartCelebrityRecognitionResponse, AWSError>
    open fun startContentModeration(params: StartContentModerationRequest, callback: (err: AWSError, data: StartContentModerationResponse) -> Unit = definedExternally): Request<StartContentModerationResponse, AWSError>
    open fun startContentModeration(callback: (err: AWSError, data: StartContentModerationResponse) -> Unit = definedExternally): Request<StartContentModerationResponse, AWSError>
    open fun startFaceDetection(params: StartFaceDetectionRequest, callback: (err: AWSError, data: StartFaceDetectionResponse) -> Unit = definedExternally): Request<StartFaceDetectionResponse, AWSError>
    open fun startFaceDetection(callback: (err: AWSError, data: StartFaceDetectionResponse) -> Unit = definedExternally): Request<StartFaceDetectionResponse, AWSError>
    open fun startFaceSearch(params: StartFaceSearchRequest, callback: (err: AWSError, data: StartFaceSearchResponse) -> Unit = definedExternally): Request<StartFaceSearchResponse, AWSError>
    open fun startFaceSearch(callback: (err: AWSError, data: StartFaceSearchResponse) -> Unit = definedExternally): Request<StartFaceSearchResponse, AWSError>
    open fun startLabelDetection(params: StartLabelDetectionRequest, callback: (err: AWSError, data: StartLabelDetectionResponse) -> Unit = definedExternally): Request<StartLabelDetectionResponse, AWSError>
    open fun startLabelDetection(callback: (err: AWSError, data: StartLabelDetectionResponse) -> Unit = definedExternally): Request<StartLabelDetectionResponse, AWSError>
    open fun startPersonTracking(params: StartPersonTrackingRequest, callback: (err: AWSError, data: StartPersonTrackingResponse) -> Unit = definedExternally): Request<StartPersonTrackingResponse, AWSError>
    open fun startPersonTracking(callback: (err: AWSError, data: StartPersonTrackingResponse) -> Unit = definedExternally): Request<StartPersonTrackingResponse, AWSError>
    open fun startProjectVersion(params: StartProjectVersionRequest, callback: (err: AWSError, data: StartProjectVersionResponse) -> Unit = definedExternally): Request<StartProjectVersionResponse, AWSError>
    open fun startProjectVersion(callback: (err: AWSError, data: StartProjectVersionResponse) -> Unit = definedExternally): Request<StartProjectVersionResponse, AWSError>
    open fun startStreamProcessor(params: StartStreamProcessorRequest, callback: (err: AWSError, data: StartStreamProcessorResponse) -> Unit = definedExternally): Request<StartStreamProcessorResponse, AWSError>
    open fun startStreamProcessor(callback: (err: AWSError, data: StartStreamProcessorResponse) -> Unit = definedExternally): Request<StartStreamProcessorResponse, AWSError>
    open fun startTextDetection(params: StartTextDetectionRequest, callback: (err: AWSError, data: StartTextDetectionResponse) -> Unit = definedExternally): Request<StartTextDetectionResponse, AWSError>
    open fun startTextDetection(callback: (err: AWSError, data: StartTextDetectionResponse) -> Unit = definedExternally): Request<StartTextDetectionResponse, AWSError>
    open fun stopProjectVersion(params: StopProjectVersionRequest, callback: (err: AWSError, data: StopProjectVersionResponse) -> Unit = definedExternally): Request<StopProjectVersionResponse, AWSError>
    open fun stopProjectVersion(callback: (err: AWSError, data: StopProjectVersionResponse) -> Unit = definedExternally): Request<StopProjectVersionResponse, AWSError>
    open fun stopStreamProcessor(params: StopStreamProcessorRequest, callback: (err: AWSError, data: StopStreamProcessorResponse) -> Unit = definedExternally): Request<StopStreamProcessorResponse, AWSError>
    open fun stopStreamProcessor(callback: (err: AWSError, data: StopStreamProcessorResponse) -> Unit = definedExternally): Request<StopStreamProcessorResponse, AWSError>
    open fun waitFor(state: String, params: DescribeProjectVersionsRequest, callback: (err: AWSError, data: DescribeProjectVersionsResponse) -> Unit = definedExternally): Request<DescribeProjectVersionsResponse, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DescribeProjectVersionsResponse) -> Unit = definedExternally): Request<DescribeProjectVersionsResponse, AWSError>
    interface AgeRange {
        var Low: UInteger?
            get() = definedExternally
            set(value) = definedExternally
        var High: UInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Asset {
        var GroundTruthManifest: GroundTruthManifest?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Beard {
        var Value: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Confidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BoundingBox {
        var Width: Float?
            get() = definedExternally
            set(value) = definedExternally
        var Height: Float?
            get() = definedExternally
            set(value) = definedExternally
        var Left: Float?
            get() = definedExternally
            set(value) = definedExternally
        var Top: Float?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Celebrity {
        var Urls: Urls?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Id: RekognitionUniqueId?
            get() = definedExternally
            set(value) = definedExternally
        var Face: ComparedFace?
            get() = definedExternally
            set(value) = definedExternally
        var MatchConfidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CelebrityDetail {
        var Urls: Urls?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Id: RekognitionUniqueId?
            get() = definedExternally
            set(value) = definedExternally
        var Confidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
        var BoundingBox: BoundingBox?
            get() = definedExternally
            set(value) = definedExternally
        var Face: FaceDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CelebrityRecognition {
        var Timestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Celebrity: CelebrityDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CompareFacesMatch {
        var Similarity: Percent?
            get() = definedExternally
            set(value) = definedExternally
        var Face: ComparedFace?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CompareFacesRequest {
        var SourceImage: Image
        var TargetImage: Image
        var SimilarityThreshold: Percent?
            get() = definedExternally
            set(value) = definedExternally
        var QualityFilter: String /* "NONE" | "AUTO" | "LOW" | "MEDIUM" | "HIGH" | String */
    }
    interface CompareFacesResponse {
        var SourceImageFace: ComparedSourceImageFace?
            get() = definedExternally
            set(value) = definedExternally
        var FaceMatches: CompareFacesMatchList?
            get() = definedExternally
            set(value) = definedExternally
        var UnmatchedFaces: CompareFacesUnmatchList?
            get() = definedExternally
            set(value) = definedExternally
        var SourceImageOrientationCorrection: String /* "ROTATE_0" | "ROTATE_90" | "ROTATE_180" | "ROTATE_270" | String */
        var TargetImageOrientationCorrection: String /* "ROTATE_0" | "ROTATE_90" | "ROTATE_180" | "ROTATE_270" | String */
    }
    interface ComparedFace {
        var BoundingBox: BoundingBox?
            get() = definedExternally
            set(value) = definedExternally
        var Confidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
        var Landmarks: Landmarks?
            get() = definedExternally
            set(value) = definedExternally
        var Pose: Pose?
            get() = definedExternally
            set(value) = definedExternally
        var Quality: ImageQuality?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ComparedSourceImageFace {
        var BoundingBox: BoundingBox?
            get() = definedExternally
            set(value) = definedExternally
        var Confidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContentModerationDetection {
        var Timestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ModerationLabel: ModerationLabel?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCollectionRequest {
        var CollectionId: CollectionId
    }
    interface CreateCollectionResponse {
        var StatusCode: UInteger?
            get() = definedExternally
            set(value) = definedExternally
        var CollectionArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var FaceModelVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProjectRequest {
        var ProjectName: ProjectName
    }
    interface CreateProjectResponse {
        var ProjectArn: ProjectArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProjectVersionRequest {
        var ProjectArn: ProjectArn
        var VersionName: VersionName
        var OutputConfig: OutputConfig
        var TrainingData: TrainingData
        var TestingData: TestingData
    }
    interface CreateProjectVersionResponse {
        var ProjectVersionArn: ProjectVersionArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStreamProcessorRequest {
        var Input: StreamProcessorInput
        var Output: StreamProcessorOutput
        var Name: StreamProcessorName
        var Settings: StreamProcessorSettings
        var RoleArn: RoleArn
    }
    interface CreateStreamProcessorResponse {
        var StreamProcessorArn: StreamProcessorArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CustomLabel {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Confidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
        var Geometry: Geometry?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteCollectionRequest {
        var CollectionId: CollectionId
    }
    interface DeleteCollectionResponse {
        var StatusCode: UInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteFacesRequest {
        var CollectionId: CollectionId
        var FaceIds: FaceIdList
    }
    interface DeleteFacesResponse {
        var DeletedFaces: FaceIdList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteStreamProcessorRequest {
        var Name: StreamProcessorName
    }
    interface DeleteStreamProcessorResponse
    interface DescribeCollectionRequest {
        var CollectionId: CollectionId
    }
    interface DescribeCollectionResponse {
        var FaceCount: ULong?
            get() = definedExternally
            set(value) = definedExternally
        var FaceModelVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var CollectionARN: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProjectVersionsRequest {
        var ProjectArn: ProjectArn
        var VersionNames: VersionNames?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: ExtendedPaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ProjectVersionsPageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProjectVersionsResponse {
        var ProjectVersionDescriptions: ProjectVersionDescriptions?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: ExtendedPaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProjectsRequest {
        var NextToken: ExtendedPaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ProjectsPageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProjectsResponse {
        var ProjectDescriptions: ProjectDescriptions?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: ExtendedPaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStreamProcessorRequest {
        var Name: StreamProcessorName
    }
    interface DescribeStreamProcessorResponse {
        var Name: StreamProcessorName?
            get() = definedExternally
            set(value) = definedExternally
        var StreamProcessorArn: StreamProcessorArn?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "STOPPED" | "STARTING" | "RUNNING" | "FAILED" | "STOPPING" | String */
        var StatusMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdateTimestamp: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Input: StreamProcessorInput?
            get() = definedExternally
            set(value) = definedExternally
        var Output: StreamProcessorOutput?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var Settings: StreamProcessorSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectCustomLabelsRequest {
        var ProjectVersionArn: ProjectVersionArn
        var Image: Image
        var MaxResults: UInteger?
            get() = definedExternally
            set(value) = definedExternally
        var MinConfidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectCustomLabelsResponse {
        var CustomLabels: CustomLabels?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectFacesRequest {
        var Image: Image
        var Attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectFacesResponse {
        var FaceDetails: FaceDetailList?
            get() = definedExternally
            set(value) = definedExternally
        var OrientationCorrection: String /* "ROTATE_0" | "ROTATE_90" | "ROTATE_180" | "ROTATE_270" | String */
    }
    interface DetectLabelsRequest {
        var Image: Image
        var MaxLabels: UInteger?
            get() = definedExternally
            set(value) = definedExternally
        var MinConfidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectLabelsResponse {
        var Labels: Labels?
            get() = definedExternally
            set(value) = definedExternally
        var OrientationCorrection: String /* "ROTATE_0" | "ROTATE_90" | "ROTATE_180" | "ROTATE_270" | String */
        var LabelModelVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectModerationLabelsRequest {
        var Image: Image
        var MinConfidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
        var HumanLoopConfig: HumanLoopConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectModerationLabelsResponse {
        var ModerationLabels: ModerationLabels?
            get() = definedExternally
            set(value) = definedExternally
        var ModerationModelVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var HumanLoopActivationOutput: HumanLoopActivationOutput?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectTextFilters {
        var WordFilter: DetectionFilter?
            get() = definedExternally
            set(value) = definedExternally
        var RegionsOfInterest: RegionsOfInterest?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectTextRequest {
        var Image: Image
        var Filters: DetectTextFilters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectTextResponse {
        var TextDetections: TextDetectionList?
            get() = definedExternally
            set(value) = definedExternally
        var TextModelVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectionFilter {
        var MinConfidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
        var MinBoundingBoxHeight: BoundingBoxHeight?
            get() = definedExternally
            set(value) = definedExternally
        var MinBoundingBoxWidth: BoundingBoxWidth?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Emotion {
        var Type: String /* "HAPPY" | "SAD" | "ANGRY" | "CONFUSED" | "DISGUSTED" | "SURPRISED" | "CALM" | "UNKNOWN" | "FEAR" | String */
        var Confidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EvaluationResult {
        var F1Score: Float?
            get() = definedExternally
            set(value) = definedExternally
        var Summary: Summary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EyeOpen {
        var Value: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Confidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Eyeglasses {
        var Value: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Confidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Face {
        var FaceId: FaceId?
            get() = definedExternally
            set(value) = definedExternally
        var BoundingBox: BoundingBox?
            get() = definedExternally
            set(value) = definedExternally
        var ImageId: ImageId?
            get() = definedExternally
            set(value) = definedExternally
        var ExternalImageId: ExternalImageId?
            get() = definedExternally
            set(value) = definedExternally
        var Confidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FaceDetail {
        var BoundingBox: BoundingBox?
            get() = definedExternally
            set(value) = definedExternally
        var AgeRange: AgeRange?
            get() = definedExternally
            set(value) = definedExternally
        var Smile: Smile?
            get() = definedExternally
            set(value) = definedExternally
        var Eyeglasses: Eyeglasses?
            get() = definedExternally
            set(value) = definedExternally
        var Sunglasses: Sunglasses?
            get() = definedExternally
            set(value) = definedExternally
        var Gender: Gender?
            get() = definedExternally
            set(value) = definedExternally
        var Beard: Beard?
            get() = definedExternally
            set(value) = definedExternally
        var Mustache: Mustache?
            get() = definedExternally
            set(value) = definedExternally
        var EyesOpen: EyeOpen?
            get() = definedExternally
            set(value) = definedExternally
        var MouthOpen: MouthOpen?
            get() = definedExternally
            set(value) = definedExternally
        var Emotions: Emotions?
            get() = definedExternally
            set(value) = definedExternally
        var Landmarks: Landmarks?
            get() = definedExternally
            set(value) = definedExternally
        var Pose: Pose?
            get() = definedExternally
            set(value) = definedExternally
        var Quality: ImageQuality?
            get() = definedExternally
            set(value) = definedExternally
        var Confidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FaceDetection {
        var Timestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Face: FaceDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FaceMatch {
        var Similarity: Percent?
            get() = definedExternally
            set(value) = definedExternally
        var Face: Face?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FaceRecord {
        var Face: Face?
            get() = definedExternally
            set(value) = definedExternally
        var FaceDetail: FaceDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FaceSearchSettings {
        var CollectionId: CollectionId?
            get() = definedExternally
            set(value) = definedExternally
        var FaceMatchThreshold: Percent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Gender {
        var Value: String /* "Male" | "Female" | String */
        var Confidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Geometry {
        var BoundingBox: BoundingBox?
            get() = definedExternally
            set(value) = definedExternally
        var Polygon: Polygon?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCelebrityInfoRequest {
        var Id: RekognitionUniqueId
    }
    interface GetCelebrityInfoResponse {
        var Urls: Urls?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCelebrityRecognitionRequest {
        var JobId: JobId
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var SortBy: String /* "ID" | "TIMESTAMP" | String */
    }
    interface GetCelebrityRecognitionResponse {
        var JobStatus: String /* "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | String */
        var StatusMessage: StatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var VideoMetadata: VideoMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var Celebrities: CelebrityRecognitions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetContentModerationRequest {
        var JobId: JobId
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var SortBy: String /* "NAME" | "TIMESTAMP" | String */
    }
    interface GetContentModerationResponse {
        var JobStatus: String /* "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | String */
        var StatusMessage: StatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var VideoMetadata: VideoMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var ModerationLabels: ContentModerationDetections?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var ModerationModelVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFaceDetectionRequest {
        var JobId: JobId
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFaceDetectionResponse {
        var JobStatus: String /* "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | String */
        var StatusMessage: StatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var VideoMetadata: VideoMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var Faces: FaceDetections?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFaceSearchRequest {
        var JobId: JobId
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var SortBy: String /* "INDEX" | "TIMESTAMP" | String */
    }
    interface GetFaceSearchResponse {
        var JobStatus: String /* "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | String */
        var StatusMessage: StatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var VideoMetadata: VideoMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var Persons: PersonMatches?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLabelDetectionRequest {
        var JobId: JobId
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var SortBy: String /* "NAME" | "TIMESTAMP" | String */
    }
    interface GetLabelDetectionResponse {
        var JobStatus: String /* "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | String */
        var StatusMessage: StatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var VideoMetadata: VideoMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var Labels: LabelDetections?
            get() = definedExternally
            set(value) = definedExternally
        var LabelModelVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPersonTrackingRequest {
        var JobId: JobId
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var SortBy: String /* "INDEX" | "TIMESTAMP" | String */
    }
    interface GetPersonTrackingResponse {
        var JobStatus: String /* "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | String */
        var StatusMessage: StatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var VideoMetadata: VideoMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var Persons: PersonDetections?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTextDetectionRequest {
        var JobId: JobId
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTextDetectionResponse {
        var JobStatus: String /* "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | String */
        var StatusMessage: StatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var VideoMetadata: VideoMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var TextDetections: TextDetectionResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var TextModelVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GroundTruthManifest {
        var S3Object: S3Object?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HumanLoopActivationOutput {
        var HumanLoopArn: HumanLoopArn?
            get() = definedExternally
            set(value) = definedExternally
        var HumanLoopActivationReasons: HumanLoopActivationReasons?
            get() = definedExternally
            set(value) = definedExternally
        var HumanLoopActivationConditionsEvaluationResults: HumanLoopActivationConditionsEvaluationResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HumanLoopConfig {
        var HumanLoopName: HumanLoopName
        var FlowDefinitionArn: FlowDefinitionArn
        var DataAttributes: HumanLoopDataAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HumanLoopDataAttributes {
        var ContentClassifiers: ContentClassifiers?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Image {
        var Bytes: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var S3Object: S3Object?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImageQuality {
        var Brightness: Float?
            get() = definedExternally
            set(value) = definedExternally
        var Sharpness: Float?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IndexFacesRequest {
        var CollectionId: CollectionId
        var Image: Image
        var ExternalImageId: ExternalImageId?
            get() = definedExternally
            set(value) = definedExternally
        var DetectionAttributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
        var MaxFaces: MaxFacesToIndex?
            get() = definedExternally
            set(value) = definedExternally
        var QualityFilter: String /* "NONE" | "AUTO" | "LOW" | "MEDIUM" | "HIGH" | String */
    }
    interface IndexFacesResponse {
        var FaceRecords: FaceRecordList?
            get() = definedExternally
            set(value) = definedExternally
        var OrientationCorrection: String /* "ROTATE_0" | "ROTATE_90" | "ROTATE_180" | "ROTATE_270" | String */
        var FaceModelVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var UnindexedFaces: UnindexedFaces?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Instance {
        var BoundingBox: BoundingBox?
            get() = definedExternally
            set(value) = definedExternally
        var Confidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KinesisDataStream {
        var Arn: KinesisDataArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KinesisVideoStream {
        var Arn: KinesisVideoArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Label {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Confidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
        var Instances: Instances?
            get() = definedExternally
            set(value) = definedExternally
        var Parents: Parents?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LabelDetection {
        var Timestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Label: Label?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Landmark {
        var Type: String /* "eyeLeft" | "eyeRight" | "nose" | "mouthLeft" | "mouthRight" | "leftEyeBrowLeft" | "leftEyeBrowRight" | "leftEyeBrowUp" | "rightEyeBrowLeft" | "rightEyeBrowRight" | "rightEyeBrowUp" | "leftEyeLeft" | "leftEyeRight" | "leftEyeUp" | "leftEyeDown" | "rightEyeLeft" | "rightEyeRight" | "rightEyeUp" | "rightEyeDown" | "noseLeft" | "noseRight" | "mouthUp" | "mouthDown" | "leftPupil" | "rightPupil" | "upperJawlineLeft" | "midJawlineLeft" | "chinBottom" | "midJawlineRight" | "upperJawlineRight" | String */
        var X: Float?
            get() = definedExternally
            set(value) = definedExternally
        var Y: Float?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCollectionsRequest {
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCollectionsResponse {
        var CollectionIds: CollectionIdList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var FaceModelVersions: FaceModelVersionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFacesRequest {
        var CollectionId: CollectionId
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFacesResponse {
        var Faces: FaceList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var FaceModelVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStreamProcessorsRequest {
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStreamProcessorsResponse {
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var StreamProcessors: StreamProcessorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModerationLabel {
        var Confidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var ParentName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MouthOpen {
        var Value: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Confidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Mustache {
        var Value: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Confidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NotificationChannel {
        var SNSTopicArn: SNSTopicArn
        var RoleArn: RoleArn
    }
    interface OutputConfig {
        var S3Bucket: S3Bucket?
            get() = definedExternally
            set(value) = definedExternally
        var S3KeyPrefix: S3KeyPrefix?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Parent {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PersonDetail {
        var Index: PersonIndex?
            get() = definedExternally
            set(value) = definedExternally
        var BoundingBox: BoundingBox?
            get() = definedExternally
            set(value) = definedExternally
        var Face: FaceDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PersonDetection {
        var Timestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Person: PersonDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PersonMatch {
        var Timestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Person: PersonDetail?
            get() = definedExternally
            set(value) = definedExternally
        var FaceMatches: FaceMatchList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Point {
        var X: Float?
            get() = definedExternally
            set(value) = definedExternally
        var Y: Float?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Pose {
        var Roll: Degree?
            get() = definedExternally
            set(value) = definedExternally
        var Yaw: Degree?
            get() = definedExternally
            set(value) = definedExternally
        var Pitch: Degree?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProjectDescription {
        var ProjectArn: ProjectArn?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATING" | "CREATED" | "DELETING" | String */
    }
    interface ProjectVersionDescription {
        var ProjectVersionArn: ProjectVersionArn?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var MinInferenceUnits: InferenceUnits?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "TRAINING_IN_PROGRESS" | "TRAINING_COMPLETED" | "TRAINING_FAILED" | "STARTING" | "RUNNING" | "FAILED" | "STOPPING" | "STOPPED" | "DELETING" | String */
        var StatusMessage: StatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var BillableTrainingTimeInSeconds: ULong?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingEndTimestamp: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var OutputConfig: OutputConfig?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingDataResult: TrainingDataResult?
            get() = definedExternally
            set(value) = definedExternally
        var TestingDataResult: TestingDataResult?
            get() = definedExternally
            set(value) = definedExternally
        var EvaluationResult: EvaluationResult?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecognizeCelebritiesRequest {
        var Image: Image
    }
    interface RecognizeCelebritiesResponse {
        var CelebrityFaces: CelebrityList?
            get() = definedExternally
            set(value) = definedExternally
        var UnrecognizedFaces: ComparedFaceList?
            get() = definedExternally
            set(value) = definedExternally
        var OrientationCorrection: String /* "ROTATE_0" | "ROTATE_90" | "ROTATE_180" | "ROTATE_270" | String */
    }
    interface RegionOfInterest {
        var BoundingBox: BoundingBox?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3Object {
        var Bucket: S3Bucket?
            get() = definedExternally
            set(value) = definedExternally
        var Name: S3ObjectName?
            get() = definedExternally
            set(value) = definedExternally
        var Version: S3ObjectVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchFacesByImageRequest {
        var CollectionId: CollectionId
        var Image: Image
        var MaxFaces: MaxFaces?
            get() = definedExternally
            set(value) = definedExternally
        var FaceMatchThreshold: Percent?
            get() = definedExternally
            set(value) = definedExternally
        var QualityFilter: String /* "NONE" | "AUTO" | "LOW" | "MEDIUM" | "HIGH" | String */
    }
    interface SearchFacesByImageResponse {
        var SearchedFaceBoundingBox: BoundingBox?
            get() = definedExternally
            set(value) = definedExternally
        var SearchedFaceConfidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
        var FaceMatches: FaceMatchList?
            get() = definedExternally
            set(value) = definedExternally
        var FaceModelVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchFacesRequest {
        var CollectionId: CollectionId
        var FaceId: FaceId
        var MaxFaces: MaxFaces?
            get() = definedExternally
            set(value) = definedExternally
        var FaceMatchThreshold: Percent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchFacesResponse {
        var SearchedFaceId: FaceId?
            get() = definedExternally
            set(value) = definedExternally
        var FaceMatches: FaceMatchList?
            get() = definedExternally
            set(value) = definedExternally
        var FaceModelVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Smile {
        var Value: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Confidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartCelebrityRecognitionRequest {
        var Video: Video
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationChannel: NotificationChannel?
            get() = definedExternally
            set(value) = definedExternally
        var JobTag: JobTag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartCelebrityRecognitionResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartContentModerationRequest {
        var Video: Video
        var MinConfidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationChannel: NotificationChannel?
            get() = definedExternally
            set(value) = definedExternally
        var JobTag: JobTag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartContentModerationResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartFaceDetectionRequest {
        var Video: Video
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationChannel: NotificationChannel?
            get() = definedExternally
            set(value) = definedExternally
        var FaceAttributes: String /* "DEFAULT" | "ALL" | String */
        var JobTag: JobTag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartFaceDetectionResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartFaceSearchRequest {
        var Video: Video
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var FaceMatchThreshold: Percent?
            get() = definedExternally
            set(value) = definedExternally
        var CollectionId: CollectionId
        var NotificationChannel: NotificationChannel?
            get() = definedExternally
            set(value) = definedExternally
        var JobTag: JobTag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartFaceSearchResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartLabelDetectionRequest {
        var Video: Video
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var MinConfidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationChannel: NotificationChannel?
            get() = definedExternally
            set(value) = definedExternally
        var JobTag: JobTag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartLabelDetectionResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartPersonTrackingRequest {
        var Video: Video
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationChannel: NotificationChannel?
            get() = definedExternally
            set(value) = definedExternally
        var JobTag: JobTag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartPersonTrackingResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartProjectVersionRequest {
        var ProjectVersionArn: ProjectVersionArn
        var MinInferenceUnits: InferenceUnits
    }
    interface StartProjectVersionResponse {
        var Status: String /* "TRAINING_IN_PROGRESS" | "TRAINING_COMPLETED" | "TRAINING_FAILED" | "STARTING" | "RUNNING" | "FAILED" | "STOPPING" | "STOPPED" | "DELETING" | String */
    }
    interface StartStreamProcessorRequest {
        var Name: StreamProcessorName
    }
    interface StartStreamProcessorResponse
    interface StartTextDetectionFilters {
        var WordFilter: DetectionFilter?
            get() = definedExternally
            set(value) = definedExternally
        var RegionsOfInterest: RegionsOfInterest?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartTextDetectionRequest {
        var Video: Video
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationChannel: NotificationChannel?
            get() = definedExternally
            set(value) = definedExternally
        var JobTag: JobTag?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: StartTextDetectionFilters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartTextDetectionResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopProjectVersionRequest {
        var ProjectVersionArn: ProjectVersionArn
    }
    interface StopProjectVersionResponse {
        var Status: String /* "TRAINING_IN_PROGRESS" | "TRAINING_COMPLETED" | "TRAINING_FAILED" | "STARTING" | "RUNNING" | "FAILED" | "STOPPING" | "STOPPED" | "DELETING" | String */
    }
    interface StopStreamProcessorRequest {
        var Name: StreamProcessorName
    }
    interface StopStreamProcessorResponse
    interface StreamProcessor {
        var Name: StreamProcessorName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "STOPPED" | "STARTING" | "RUNNING" | "FAILED" | "STOPPING" | String */
    }
    interface StreamProcessorInput {
        var KinesisVideoStream: KinesisVideoStream?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StreamProcessorOutput {
        var KinesisDataStream: KinesisDataStream?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StreamProcessorSettings {
        var FaceSearch: FaceSearchSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Summary {
        var S3Object: S3Object?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Sunglasses {
        var Value: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Confidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestingData {
        var Assets: Assets?
            get() = definedExternally
            set(value) = definedExternally
        var AutoCreate: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestingDataResult {
        var Input: TestingData?
            get() = definedExternally
            set(value) = definedExternally
        var Output: TestingData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TextDetection {
        var DetectedText: String?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "LINE" | "WORD" | String */
        var Id: UInteger?
            get() = definedExternally
            set(value) = definedExternally
        var ParentId: UInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Confidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
        var Geometry: Geometry?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TextDetectionResult {
        var Timestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TextDetection: TextDetection?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrainingData {
        var Assets: Assets?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrainingDataResult {
        var Input: TrainingData?
            get() = definedExternally
            set(value) = definedExternally
        var Output: TrainingData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UnindexedFace {
        var Reasons: Reasons?
            get() = definedExternally
            set(value) = definedExternally
        var FaceDetail: FaceDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Video {
        var S3Object: S3Object?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VideoMetadata {
        var Codec: String?
            get() = definedExternally
            set(value) = definedExternally
        var DurationMillis: ULong?
            get() = definedExternally
            set(value) = definedExternally
        var Format: String?
            get() = definedExternally
            set(value) = definedExternally
        var FrameRate: Float?
            get() = definedExternally
            set(value) = definedExternally
        var FrameHeight: ULong?
            get() = definedExternally
            set(value) = definedExternally
        var FrameWidth: ULong?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2016-06-27" | "latest" | String */
    }
}