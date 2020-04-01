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
import TranscribeService.TranscriptionJobSummary
import TranscribeService.VocabularyInfo
import TranscribeService.VocabularyFilterInfo
import TranscribeService.CreateVocabularyRequest
import TranscribeService.CreateVocabularyResponse
import TranscribeService.CreateVocabularyFilterRequest
import TranscribeService.CreateVocabularyFilterResponse
import TranscribeService.DeleteTranscriptionJobRequest
import TranscribeService.DeleteVocabularyRequest
import TranscribeService.DeleteVocabularyFilterRequest
import TranscribeService.GetTranscriptionJobRequest
import TranscribeService.GetTranscriptionJobResponse
import TranscribeService.GetVocabularyRequest
import TranscribeService.GetVocabularyResponse
import TranscribeService.GetVocabularyFilterRequest
import TranscribeService.GetVocabularyFilterResponse
import TranscribeService.ListTranscriptionJobsRequest
import TranscribeService.ListTranscriptionJobsResponse
import TranscribeService.ListVocabulariesRequest
import TranscribeService.ListVocabulariesResponse
import TranscribeService.ListVocabularyFiltersRequest
import TranscribeService.ListVocabularyFiltersResponse
import TranscribeService.StartTranscriptionJobRequest
import TranscribeService.StartTranscriptionJobResponse
import TranscribeService.UpdateVocabularyRequest
import TranscribeService.UpdateVocabularyResponse
import TranscribeService.UpdateVocabularyFilterRequest
import TranscribeService.UpdateVocabularyFilterResponse
import TranscribeService.TranscriptionJob
import TranscribeService.Media
import TranscribeService.Settings
import TranscribeService.JobExecutionSettings
import TranscribeService.ContentRedaction
import TranscribeService.Transcript

typealias Boolean = Boolean

typealias DataAccessRoleArn = String

typealias DateTime = Date

typealias FailureReason = String

typealias KMSKeyId = String

typealias MaxAlternatives = Number

typealias MaxResults = Number

typealias MaxSpeakers = Number

typealias MediaSampleRateHertz = Number

typealias NextToken = String

typealias OutputBucketName = String

typealias Phrase = String

typealias Phrases = Array<Phrase>

typealias TranscriptionJobName = String

typealias TranscriptionJobSummaries = Array<TranscriptionJobSummary>

typealias Uri = String

typealias Vocabularies = Array<VocabularyInfo>

typealias VocabularyFilterName = String

typealias VocabularyFilters = Array<VocabularyFilterInfo>

typealias VocabularyName = String

typealias Word = String

typealias Words = Array<Word>

@JsModule("aws-sdk")
external open class TranscribeService(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & TranscribeService.Types.ClientConfiguration */
    open fun createVocabulary(params: CreateVocabularyRequest, callback: (err: AWSError, data: CreateVocabularyResponse) -> Unit = definedExternally): Request<CreateVocabularyResponse, AWSError>
    open fun createVocabulary(callback: (err: AWSError, data: CreateVocabularyResponse) -> Unit = definedExternally): Request<CreateVocabularyResponse, AWSError>
    open fun createVocabularyFilter(params: CreateVocabularyFilterRequest, callback: (err: AWSError, data: CreateVocabularyFilterResponse) -> Unit = definedExternally): Request<CreateVocabularyFilterResponse, AWSError>
    open fun createVocabularyFilter(callback: (err: AWSError, data: CreateVocabularyFilterResponse) -> Unit = definedExternally): Request<CreateVocabularyFilterResponse, AWSError>
    open fun deleteTranscriptionJob(params: DeleteTranscriptionJobRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteTranscriptionJob(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVocabulary(params: DeleteVocabularyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVocabulary(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVocabularyFilter(params: DeleteVocabularyFilterRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVocabularyFilter(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun getTranscriptionJob(params: GetTranscriptionJobRequest, callback: (err: AWSError, data: GetTranscriptionJobResponse) -> Unit = definedExternally): Request<GetTranscriptionJobResponse, AWSError>
    open fun getTranscriptionJob(callback: (err: AWSError, data: GetTranscriptionJobResponse) -> Unit = definedExternally): Request<GetTranscriptionJobResponse, AWSError>
    open fun getVocabulary(params: GetVocabularyRequest, callback: (err: AWSError, data: GetVocabularyResponse) -> Unit = definedExternally): Request<GetVocabularyResponse, AWSError>
    open fun getVocabulary(callback: (err: AWSError, data: GetVocabularyResponse) -> Unit = definedExternally): Request<GetVocabularyResponse, AWSError>
    open fun getVocabularyFilter(params: GetVocabularyFilterRequest, callback: (err: AWSError, data: GetVocabularyFilterResponse) -> Unit = definedExternally): Request<GetVocabularyFilterResponse, AWSError>
    open fun getVocabularyFilter(callback: (err: AWSError, data: GetVocabularyFilterResponse) -> Unit = definedExternally): Request<GetVocabularyFilterResponse, AWSError>
    open fun listTranscriptionJobs(params: ListTranscriptionJobsRequest, callback: (err: AWSError, data: ListTranscriptionJobsResponse) -> Unit = definedExternally): Request<ListTranscriptionJobsResponse, AWSError>
    open fun listTranscriptionJobs(callback: (err: AWSError, data: ListTranscriptionJobsResponse) -> Unit = definedExternally): Request<ListTranscriptionJobsResponse, AWSError>
    open fun listVocabularies(params: ListVocabulariesRequest, callback: (err: AWSError, data: ListVocabulariesResponse) -> Unit = definedExternally): Request<ListVocabulariesResponse, AWSError>
    open fun listVocabularies(callback: (err: AWSError, data: ListVocabulariesResponse) -> Unit = definedExternally): Request<ListVocabulariesResponse, AWSError>
    open fun listVocabularyFilters(params: ListVocabularyFiltersRequest, callback: (err: AWSError, data: ListVocabularyFiltersResponse) -> Unit = definedExternally): Request<ListVocabularyFiltersResponse, AWSError>
    open fun listVocabularyFilters(callback: (err: AWSError, data: ListVocabularyFiltersResponse) -> Unit = definedExternally): Request<ListVocabularyFiltersResponse, AWSError>
    open fun startTranscriptionJob(params: StartTranscriptionJobRequest, callback: (err: AWSError, data: StartTranscriptionJobResponse) -> Unit = definedExternally): Request<StartTranscriptionJobResponse, AWSError>
    open fun startTranscriptionJob(callback: (err: AWSError, data: StartTranscriptionJobResponse) -> Unit = definedExternally): Request<StartTranscriptionJobResponse, AWSError>
    open fun updateVocabulary(params: UpdateVocabularyRequest, callback: (err: AWSError, data: UpdateVocabularyResponse) -> Unit = definedExternally): Request<UpdateVocabularyResponse, AWSError>
    open fun updateVocabulary(callback: (err: AWSError, data: UpdateVocabularyResponse) -> Unit = definedExternally): Request<UpdateVocabularyResponse, AWSError>
    open fun updateVocabularyFilter(params: UpdateVocabularyFilterRequest, callback: (err: AWSError, data: UpdateVocabularyFilterResponse) -> Unit = definedExternally): Request<UpdateVocabularyFilterResponse, AWSError>
    open fun updateVocabularyFilter(callback: (err: AWSError, data: UpdateVocabularyFilterResponse) -> Unit = definedExternally): Request<UpdateVocabularyFilterResponse, AWSError>
    interface ContentRedaction {
        var RedactionType: String /* "PII" | String */
        var RedactionOutput: String /* "redacted" | "redacted_and_unredacted" | String */
    }
    interface CreateVocabularyFilterRequest {
        var VocabularyFilterName: VocabularyFilterName
        var LanguageCode: String /* "en-US" | "es-US" | "en-AU" | "fr-CA" | "en-GB" | "de-DE" | "pt-BR" | "fr-FR" | "it-IT" | "ko-KR" | "es-ES" | "en-IN" | "hi-IN" | "ar-SA" | "ru-RU" | "zh-CN" | "nl-NL" | "id-ID" | "ta-IN" | "fa-IR" | "en-IE" | "en-AB" | "en-WL" | "pt-PT" | "te-IN" | "tr-TR" | "de-CH" | "he-IL" | "ms-MY" | "ja-JP" | "ar-AE" | String */
        var Words: Words?
            get() = definedExternally
            set(value) = definedExternally
        var VocabularyFilterFileUri: Uri?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateVocabularyFilterResponse {
        var VocabularyFilterName: VocabularyFilterName?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "en-US" | "es-US" | "en-AU" | "fr-CA" | "en-GB" | "de-DE" | "pt-BR" | "fr-FR" | "it-IT" | "ko-KR" | "es-ES" | "en-IN" | "hi-IN" | "ar-SA" | "ru-RU" | "zh-CN" | "nl-NL" | "id-ID" | "ta-IN" | "fa-IR" | "en-IE" | "en-AB" | "en-WL" | "pt-PT" | "te-IN" | "tr-TR" | "de-CH" | "he-IL" | "ms-MY" | "ja-JP" | "ar-AE" | String */
        var LastModifiedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateVocabularyRequest {
        var VocabularyName: VocabularyName
        var LanguageCode: String /* "en-US" | "es-US" | "en-AU" | "fr-CA" | "en-GB" | "de-DE" | "pt-BR" | "fr-FR" | "it-IT" | "ko-KR" | "es-ES" | "en-IN" | "hi-IN" | "ar-SA" | "ru-RU" | "zh-CN" | "nl-NL" | "id-ID" | "ta-IN" | "fa-IR" | "en-IE" | "en-AB" | "en-WL" | "pt-PT" | "te-IN" | "tr-TR" | "de-CH" | "he-IL" | "ms-MY" | "ja-JP" | "ar-AE" | String */
        var Phrases: Phrases?
            get() = definedExternally
            set(value) = definedExternally
        var VocabularyFileUri: Uri?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateVocabularyResponse {
        var VocabularyName: VocabularyName?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "en-US" | "es-US" | "en-AU" | "fr-CA" | "en-GB" | "de-DE" | "pt-BR" | "fr-FR" | "it-IT" | "ko-KR" | "es-ES" | "en-IN" | "hi-IN" | "ar-SA" | "ru-RU" | "zh-CN" | "nl-NL" | "id-ID" | "ta-IN" | "fa-IR" | "en-IE" | "en-AB" | "en-WL" | "pt-PT" | "te-IN" | "tr-TR" | "de-CH" | "he-IL" | "ms-MY" | "ja-JP" | "ar-AE" | String */
        var VocabularyState: String /* "PENDING" | "READY" | "FAILED" | String */
        var LastModifiedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteTranscriptionJobRequest {
        var TranscriptionJobName: TranscriptionJobName
    }
    interface DeleteVocabularyFilterRequest {
        var VocabularyFilterName: VocabularyFilterName
    }
    interface DeleteVocabularyRequest {
        var VocabularyName: VocabularyName
    }
    interface GetTranscriptionJobRequest {
        var TranscriptionJobName: TranscriptionJobName
    }
    interface GetTranscriptionJobResponse {
        var TranscriptionJob: TranscriptionJob?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetVocabularyFilterRequest {
        var VocabularyFilterName: VocabularyFilterName
    }
    interface GetVocabularyFilterResponse {
        var VocabularyFilterName: VocabularyFilterName?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "en-US" | "es-US" | "en-AU" | "fr-CA" | "en-GB" | "de-DE" | "pt-BR" | "fr-FR" | "it-IT" | "ko-KR" | "es-ES" | "en-IN" | "hi-IN" | "ar-SA" | "ru-RU" | "zh-CN" | "nl-NL" | "id-ID" | "ta-IN" | "fa-IR" | "en-IE" | "en-AB" | "en-WL" | "pt-PT" | "te-IN" | "tr-TR" | "de-CH" | "he-IL" | "ms-MY" | "ja-JP" | "ar-AE" | String */
        var LastModifiedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var DownloadUri: Uri?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetVocabularyRequest {
        var VocabularyName: VocabularyName
    }
    interface GetVocabularyResponse {
        var VocabularyName: VocabularyName?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "en-US" | "es-US" | "en-AU" | "fr-CA" | "en-GB" | "de-DE" | "pt-BR" | "fr-FR" | "it-IT" | "ko-KR" | "es-ES" | "en-IN" | "hi-IN" | "ar-SA" | "ru-RU" | "zh-CN" | "nl-NL" | "id-ID" | "ta-IN" | "fa-IR" | "en-IE" | "en-AB" | "en-WL" | "pt-PT" | "te-IN" | "tr-TR" | "de-CH" | "he-IL" | "ms-MY" | "ja-JP" | "ar-AE" | String */
        var VocabularyState: String /* "PENDING" | "READY" | "FAILED" | String */
        var LastModifiedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var DownloadUri: Uri?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobExecutionSettings {
        var AllowDeferredExecution: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var DataAccessRoleArn: DataAccessRoleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTranscriptionJobsRequest {
        var Status: String /* "QUEUED" | "IN_PROGRESS" | "FAILED" | "COMPLETED" | String */
        var JobNameContains: TranscriptionJobName?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTranscriptionJobsResponse {
        var Status: String /* "QUEUED" | "IN_PROGRESS" | "FAILED" | "COMPLETED" | String */
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var TranscriptionJobSummaries: TranscriptionJobSummaries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVocabulariesRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var StateEquals: String /* "PENDING" | "READY" | "FAILED" | String */
        var NameContains: VocabularyName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVocabulariesResponse {
        var Status: String /* "QUEUED" | "IN_PROGRESS" | "FAILED" | "COMPLETED" | String */
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Vocabularies: Vocabularies?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVocabularyFiltersRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NameContains: VocabularyFilterName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVocabularyFiltersResponse {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var VocabularyFilters: VocabularyFilters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Media {
        var MediaFileUri: Uri?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Settings {
        var VocabularyName: VocabularyName?
            get() = definedExternally
            set(value) = definedExternally
        var ShowSpeakerLabels: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var MaxSpeakerLabels: MaxSpeakers?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelIdentification: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ShowAlternatives: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var MaxAlternatives: MaxAlternatives?
            get() = definedExternally
            set(value) = definedExternally
        var VocabularyFilterName: VocabularyFilterName?
            get() = definedExternally
            set(value) = definedExternally
        var VocabularyFilterMethod: String /* "remove" | "mask" | String */
    }
    interface StartTranscriptionJobRequest {
        var TranscriptionJobName: TranscriptionJobName
        var LanguageCode: String /* "en-US" | "es-US" | "en-AU" | "fr-CA" | "en-GB" | "de-DE" | "pt-BR" | "fr-FR" | "it-IT" | "ko-KR" | "es-ES" | "en-IN" | "hi-IN" | "ar-SA" | "ru-RU" | "zh-CN" | "nl-NL" | "id-ID" | "ta-IN" | "fa-IR" | "en-IE" | "en-AB" | "en-WL" | "pt-PT" | "te-IN" | "tr-TR" | "de-CH" | "he-IL" | "ms-MY" | "ja-JP" | "ar-AE" | String */
        var MediaSampleRateHertz: MediaSampleRateHertz?
            get() = definedExternally
            set(value) = definedExternally
        var MediaFormat: String /* "mp3" | "mp4" | "wav" | "flac" | String */
        var Media: Media
        var OutputBucketName: OutputBucketName?
            get() = definedExternally
            set(value) = definedExternally
        var OutputEncryptionKMSKeyId: KMSKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var Settings: Settings?
            get() = definedExternally
            set(value) = definedExternally
        var JobExecutionSettings: JobExecutionSettings?
            get() = definedExternally
            set(value) = definedExternally
        var ContentRedaction: ContentRedaction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartTranscriptionJobResponse {
        var TranscriptionJob: TranscriptionJob?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Transcript {
        var TranscriptFileUri: Uri?
            get() = definedExternally
            set(value) = definedExternally
        var RedactedTranscriptFileUri: Uri?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TranscriptionJob {
        var TranscriptionJobName: TranscriptionJobName?
            get() = definedExternally
            set(value) = definedExternally
        var TranscriptionJobStatus: String /* "QUEUED" | "IN_PROGRESS" | "FAILED" | "COMPLETED" | String */
        var LanguageCode: String /* "en-US" | "es-US" | "en-AU" | "fr-CA" | "en-GB" | "de-DE" | "pt-BR" | "fr-FR" | "it-IT" | "ko-KR" | "es-ES" | "en-IN" | "hi-IN" | "ar-SA" | "ru-RU" | "zh-CN" | "nl-NL" | "id-ID" | "ta-IN" | "fa-IR" | "en-IE" | "en-AB" | "en-WL" | "pt-PT" | "te-IN" | "tr-TR" | "de-CH" | "he-IL" | "ms-MY" | "ja-JP" | "ar-AE" | String */
        var MediaSampleRateHertz: MediaSampleRateHertz?
            get() = definedExternally
            set(value) = definedExternally
        var MediaFormat: String /* "mp3" | "mp4" | "wav" | "flac" | String */
        var Media: Media?
            get() = definedExternally
            set(value) = definedExternally
        var Transcript: Transcript?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var CompletionTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var Settings: Settings?
            get() = definedExternally
            set(value) = definedExternally
        var JobExecutionSettings: JobExecutionSettings?
            get() = definedExternally
            set(value) = definedExternally
        var ContentRedaction: ContentRedaction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TranscriptionJobSummary {
        var TranscriptionJobName: TranscriptionJobName?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var CompletionTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "en-US" | "es-US" | "en-AU" | "fr-CA" | "en-GB" | "de-DE" | "pt-BR" | "fr-FR" | "it-IT" | "ko-KR" | "es-ES" | "en-IN" | "hi-IN" | "ar-SA" | "ru-RU" | "zh-CN" | "nl-NL" | "id-ID" | "ta-IN" | "fa-IR" | "en-IE" | "en-AB" | "en-WL" | "pt-PT" | "te-IN" | "tr-TR" | "de-CH" | "he-IL" | "ms-MY" | "ja-JP" | "ar-AE" | String */
        var TranscriptionJobStatus: String /* "QUEUED" | "IN_PROGRESS" | "FAILED" | "COMPLETED" | String */
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var OutputLocationType: String /* "CUSTOMER_BUCKET" | "SERVICE_BUCKET" | String */
        var ContentRedaction: ContentRedaction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateVocabularyFilterRequest {
        var VocabularyFilterName: VocabularyFilterName
        var Words: Words?
            get() = definedExternally
            set(value) = definedExternally
        var VocabularyFilterFileUri: Uri?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateVocabularyFilterResponse {
        var VocabularyFilterName: VocabularyFilterName?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "en-US" | "es-US" | "en-AU" | "fr-CA" | "en-GB" | "de-DE" | "pt-BR" | "fr-FR" | "it-IT" | "ko-KR" | "es-ES" | "en-IN" | "hi-IN" | "ar-SA" | "ru-RU" | "zh-CN" | "nl-NL" | "id-ID" | "ta-IN" | "fa-IR" | "en-IE" | "en-AB" | "en-WL" | "pt-PT" | "te-IN" | "tr-TR" | "de-CH" | "he-IL" | "ms-MY" | "ja-JP" | "ar-AE" | String */
        var LastModifiedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateVocabularyRequest {
        var VocabularyName: VocabularyName
        var LanguageCode: String /* "en-US" | "es-US" | "en-AU" | "fr-CA" | "en-GB" | "de-DE" | "pt-BR" | "fr-FR" | "it-IT" | "ko-KR" | "es-ES" | "en-IN" | "hi-IN" | "ar-SA" | "ru-RU" | "zh-CN" | "nl-NL" | "id-ID" | "ta-IN" | "fa-IR" | "en-IE" | "en-AB" | "en-WL" | "pt-PT" | "te-IN" | "tr-TR" | "de-CH" | "he-IL" | "ms-MY" | "ja-JP" | "ar-AE" | String */
        var Phrases: Phrases?
            get() = definedExternally
            set(value) = definedExternally
        var VocabularyFileUri: Uri?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateVocabularyResponse {
        var VocabularyName: VocabularyName?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "en-US" | "es-US" | "en-AU" | "fr-CA" | "en-GB" | "de-DE" | "pt-BR" | "fr-FR" | "it-IT" | "ko-KR" | "es-ES" | "en-IN" | "hi-IN" | "ar-SA" | "ru-RU" | "zh-CN" | "nl-NL" | "id-ID" | "ta-IN" | "fa-IR" | "en-IE" | "en-AB" | "en-WL" | "pt-PT" | "te-IN" | "tr-TR" | "de-CH" | "he-IL" | "ms-MY" | "ja-JP" | "ar-AE" | String */
        var LastModifiedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var VocabularyState: String /* "PENDING" | "READY" | "FAILED" | String */
    }
    interface VocabularyFilterInfo {
        var VocabularyFilterName: VocabularyFilterName?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "en-US" | "es-US" | "en-AU" | "fr-CA" | "en-GB" | "de-DE" | "pt-BR" | "fr-FR" | "it-IT" | "ko-KR" | "es-ES" | "en-IN" | "hi-IN" | "ar-SA" | "ru-RU" | "zh-CN" | "nl-NL" | "id-ID" | "ta-IN" | "fa-IR" | "en-IE" | "en-AB" | "en-WL" | "pt-PT" | "te-IN" | "tr-TR" | "de-CH" | "he-IL" | "ms-MY" | "ja-JP" | "ar-AE" | String */
        var LastModifiedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VocabularyInfo {
        var VocabularyName: VocabularyName?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "en-US" | "es-US" | "en-AU" | "fr-CA" | "en-GB" | "de-DE" | "pt-BR" | "fr-FR" | "it-IT" | "ko-KR" | "es-ES" | "en-IN" | "hi-IN" | "ar-SA" | "ru-RU" | "zh-CN" | "nl-NL" | "id-ID" | "ta-IN" | "fa-IR" | "en-IE" | "en-AB" | "en-WL" | "pt-PT" | "te-IN" | "tr-TR" | "de-CH" | "he-IL" | "ms-MY" | "ja-JP" | "ar-AE" | String */
        var LastModifiedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var VocabularyState: String /* "PENDING" | "READY" | "FAILED" | String */
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-10-26" | "latest" | String */
    }
}