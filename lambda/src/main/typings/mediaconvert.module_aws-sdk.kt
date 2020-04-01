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
import MediaConvert.AudioDescription
import MediaConvert.CaptionDescription
import MediaConvert.CaptionDescriptionPreset
import MediaConvert.CmafAdditionalManifest
import MediaConvert.DashAdditionalManifest
import MediaConvert.Endpoint
import MediaConvert.HlsAdditionalManifest
import MediaConvert.HlsCaptionLanguageMapping
import MediaConvert.Id3Insertion
import MediaConvert.Input
import MediaConvert.InputClipping
import MediaConvert.InputTemplate
import MediaConvert.InsertableImage
import MediaConvert.Job
import MediaConvert.JobTemplate
import MediaConvert.MsSmoothAdditionalManifest
import MediaConvert.Output
import MediaConvert.OutputChannelMapping
import MediaConvert.OutputDetail
import MediaConvert.OutputGroup
import MediaConvert.OutputGroupDetail
import MediaConvert.Preset
import MediaConvert.Queue
import MediaConvert.AssociateCertificateRequest
import MediaConvert.AssociateCertificateResponse
import MediaConvert.CancelJobRequest
import MediaConvert.CancelJobResponse
import MediaConvert.CreateJobRequest
import MediaConvert.CreateJobResponse
import MediaConvert.CreateJobTemplateRequest
import MediaConvert.CreateJobTemplateResponse
import MediaConvert.CreatePresetRequest
import MediaConvert.CreatePresetResponse
import MediaConvert.CreateQueueRequest
import MediaConvert.CreateQueueResponse
import MediaConvert.DeleteJobTemplateRequest
import MediaConvert.DeleteJobTemplateResponse
import MediaConvert.DeletePresetRequest
import MediaConvert.DeletePresetResponse
import MediaConvert.DeleteQueueRequest
import MediaConvert.DeleteQueueResponse
import MediaConvert.DescribeEndpointsRequest
import MediaConvert.DescribeEndpointsResponse
import MediaConvert.DisassociateCertificateRequest
import MediaConvert.DisassociateCertificateResponse
import MediaConvert.GetJobRequest
import MediaConvert.GetJobResponse
import MediaConvert.GetJobTemplateRequest
import MediaConvert.GetJobTemplateResponse
import MediaConvert.GetPresetRequest
import MediaConvert.GetPresetResponse
import MediaConvert.GetQueueRequest
import MediaConvert.GetQueueResponse
import MediaConvert.ListJobTemplatesRequest
import MediaConvert.ListJobTemplatesResponse
import MediaConvert.ListJobsRequest
import MediaConvert.ListJobsResponse
import MediaConvert.ListPresetsRequest
import MediaConvert.ListPresetsResponse
import MediaConvert.ListQueuesRequest
import MediaConvert.ListQueuesResponse
import MediaConvert.ListTagsForResourceRequest
import MediaConvert.ListTagsForResourceResponse
import MediaConvert.TagResourceRequest
import MediaConvert.TagResourceResponse
import MediaConvert.UntagResourceRequest
import MediaConvert.UntagResourceResponse
import MediaConvert.UpdateJobTemplateRequest
import MediaConvert.UpdateJobTemplateResponse
import MediaConvert.UpdatePresetRequest
import MediaConvert.UpdatePresetResponse
import MediaConvert.UpdateQueueRequest
import MediaConvert.UpdateQueueResponse
import MediaConvert.AacSettings
import MediaConvert.Ac3Settings
import MediaConvert.AiffSettings
import MediaConvert.Eac3AtmosSettings
import MediaConvert.Eac3Settings
import MediaConvert.Mp2Settings
import MediaConvert.Mp3Settings
import MediaConvert.WavSettings
import MediaConvert.AudioNormalizationSettings
import MediaConvert.AudioCodecSettings
import MediaConvert.RemixSettings
import MediaConvert.Av1QvbrSettings
import MediaConvert.CaptionDestinationSettings
import MediaConvert.BurninDestinationSettings
import MediaConvert.DvbSubDestinationSettings
import MediaConvert.EmbeddedDestinationSettings
import MediaConvert.ImscDestinationSettings
import MediaConvert.SccDestinationSettings
import MediaConvert.TeletextDestinationSettings
import MediaConvert.TtmlDestinationSettings
import MediaConvert.CaptionSourceSettings
import MediaConvert.AncillarySourceSettings
import MediaConvert.DvbSubSourceSettings
import MediaConvert.EmbeddedSourceSettings
import MediaConvert.FileSourceSettings
import MediaConvert.TeletextSourceSettings
import MediaConvert.TrackSourceSettings
import MediaConvert.SpekeKeyProviderCmaf
import MediaConvert.StaticKeyProvider
import MediaConvert.DestinationSettings
import MediaConvert.CmafEncryptionSettings
import MediaConvert.Hdr10Metadata
import MediaConvert.CmfcSettings
import MediaConvert.F4vSettings
import MediaConvert.M2tsSettings
import MediaConvert.M3u8Settings
import MediaConvert.MovSettings
import MediaConvert.Mp4Settings
import MediaConvert.MpdSettings
import MediaConvert.AccelerationSettings
import MediaConvert.JobSettings
import MediaConvert.__mapOf__string
import MediaConvert.JobTemplateSettings
import MediaConvert.PresetSettings
import MediaConvert.ReservationPlanSettings
import MediaConvert.SpekeKeyProvider
import MediaConvert.DashIsoEncryptionSettings
import MediaConvert.S3DestinationSettings
import MediaConvert.DolbyVisionLevel6Metadata
import MediaConvert.EsamManifestConfirmConditionNotification
import MediaConvert.EsamSignalProcessingNotification
import MediaConvert.H264QvbrSettings
import MediaConvert.H265QvbrSettings
import MediaConvert.HlsEncryptionSettings
import MediaConvert.__mapOfAudioSelectorGroup
import MediaConvert.__mapOfAudioSelector
import MediaConvert.__mapOfCaptionSelector
import MediaConvert.Rectangle
import MediaConvert.InputDecryptionSettings
import MediaConvert.ImageInserter
import MediaConvert.VideoSelector
import MediaConvert.JobMessages
import MediaConvert.Timing
import MediaConvert.AvailBlanking
import MediaConvert.EsamSettings
import MediaConvert.MotionImageInserter
import MediaConvert.NielsenConfiguration
import MediaConvert.TimecodeConfig
import MediaConvert.TimedMetadataInsertion
import MediaConvert.ResourceTags
import MediaConvert.DvbNitSettings
import MediaConvert.DvbSdtSettings
import MediaConvert.DvbTdtSettings
import MediaConvert.M2tsScte35Esam
import MediaConvert.MotionImageInsertionFramerate
import MediaConvert.MotionImageInsertionOffset
import MediaConvert.MsSmoothEncryptionSettings
import MediaConvert.NoiseReducerFilterSettings
import MediaConvert.NoiseReducerSpatialFilterSettings
import MediaConvert.NoiseReducerTemporalFilterSettings
import MediaConvert.ContainerSettings
import MediaConvert.OutputSettings
import MediaConvert.VideoDescription
import MediaConvert.VideoDetail
import MediaConvert.OutputGroupSettings
import MediaConvert.CmafGroupSettings
import MediaConvert.DashIsoGroupSettings
import MediaConvert.FileGroupSettings
import MediaConvert.HlsGroupSettings
import MediaConvert.MsSmoothGroupSettings
import MediaConvert.HlsSettings
import MediaConvert.ReservationPlan
import MediaConvert.ChannelMapping
import MediaConvert.S3DestinationAccessControl
import MediaConvert.S3EncryptionSettings
import MediaConvert.Av1Settings
import MediaConvert.FrameCaptureSettings
import MediaConvert.H264Settings
import MediaConvert.H265Settings
import MediaConvert.Mpeg2Settings
import MediaConvert.ProresSettings
import MediaConvert.VideoCodecSettings
import MediaConvert.VideoPreprocessor
import MediaConvert.ColorCorrector
import MediaConvert.Deinterlacer
import MediaConvert.DolbyVision
import MediaConvert.NoiseReducer
import MediaConvert.TimecodeBurnin
import MediaConvert.AudioSelector
import MediaConvert.AudioSelectorGroup
import MediaConvert.CaptionSelector

typealias __doubleMin0 = Number

typealias __doubleMin0Max1 = Number

typealias __doubleMin0Max2147483647 = Number

typealias __doubleMinNegative59Max0 = Number

typealias __doubleMinNegative60Max3 = Number

typealias __doubleMinNegative60MaxNegative1 = Number

typealias __doubleMinNegative6Max3 = Number

typealias __integer = Number

typealias __integerMin0Max0 = Number

typealias __integerMin0Max1 = Number

typealias __integerMin0Max10 = Number

typealias __integerMin0Max100 = Number

typealias __integerMin0Max1000 = Number

typealias __integerMin0Max10000 = Number

typealias __integerMin0Max1152000000 = Number

typealias __integerMin0Max128 = Number

typealias __integerMin0Max1466400000 = Number

typealias __integerMin0Max15 = Number

typealias __integerMin0Max16 = Number

typealias __integerMin0Max2147483647 = Number

typealias __integerMin0Max255 = Number

typealias __integerMin0Max3 = Number

typealias __integerMin0Max30 = Number

typealias __integerMin0Max30000 = Number

typealias __integerMin0Max3600 = Number

typealias __integerMin0Max4 = Number

typealias __integerMin0Max47185920 = Number

typealias __integerMin0Max500 = Number

typealias __integerMin0Max50000 = Number

typealias __integerMin0Max65535 = Number

typealias __integerMin0Max7 = Number

typealias __integerMin0Max8 = Number

typealias __integerMin0Max9 = Number

typealias __integerMin0Max96 = Number

typealias __integerMin0Max99 = Number

typealias __integerMin1000Max1152000000 = Number

typealias __integerMin1000Max1466400000 = Number

typealias __integerMin1000Max288000000 = Number

typealias __integerMin1000Max30000 = Number

typealias __integerMin1000Max300000000 = Number

typealias __integerMin10Max48 = Number

typealias __integerMin16000Max320000 = Number

typealias __integerMin16Max24 = Number

typealias __integerMin1Max1 = Number

typealias __integerMin1Max10 = Number

typealias __integerMin1Max100 = Number

typealias __integerMin1Max10000000 = Number

typealias __integerMin1Max1001 = Number

typealias __integerMin1Max17895697 = Number

typealias __integerMin1Max2 = Number

typealias __integerMin1Max20 = Number

typealias __integerMin1Max2147483640 = Number

typealias __integerMin1Max2147483647 = Number

typealias __integerMin1Max31 = Number

typealias __integerMin1Max32 = Number

typealias __integerMin1Max4 = Number

typealias __integerMin1Max6 = Number

typealias __integerMin1Max64 = Number

typealias __integerMin22050Max48000 = Number

typealias __integerMin24Max60000 = Number

typealias __integerMin25Max10000 = Number

typealias __integerMin25Max2000 = Number

typealias __integerMin2Max2147483647 = Number

typealias __integerMin32000Max384000 = Number

typealias __integerMin32000Max48000 = Number

typealias __integerMin32Max8182 = Number

typealias __integerMin32Max8192 = Number

typealias __integerMin384000Max768000 = Number

typealias __integerMin48000Max48000 = Number

typealias __integerMin6000Max1024000 = Number

typealias __integerMin64000Max640000 = Number

typealias __integerMin7Max15 = Number

typealias __integerMin8000Max192000 = Number

typealias __integerMin8000Max96000 = Number

typealias __integerMin96Max600 = Number

typealias __integerMinNegative1000Max1000 = Number

typealias __integerMinNegative180Max180 = Number

typealias __integerMinNegative1Max3 = Number

typealias __integerMinNegative2147483648Max2147483647 = Number

typealias __integerMinNegative2Max3 = Number

typealias __integerMinNegative50Max50 = Number

typealias __integerMinNegative5Max5 = Number

typealias __integerMinNegative60Max6 = Number

typealias __integerMinNegative70Max0 = Number

typealias __listOfAudioDescription = Array<AudioDescription>

typealias __listOfCaptionDescription = Array<CaptionDescription>

typealias __listOfCaptionDescriptionPreset = Array<CaptionDescriptionPreset>

typealias __listOfCmafAdditionalManifest = Array<CmafAdditionalManifest>

typealias __listOfDashAdditionalManifest = Array<DashAdditionalManifest>

typealias __listOfEndpoint = Array<Endpoint>

typealias __listOfHlsAdMarkers = Array<String /* "ELEMENTAL" | "ELEMENTAL_SCTE35" | String */>

typealias __listOfHlsAdditionalManifest = Array<HlsAdditionalManifest>

typealias __listOfHlsCaptionLanguageMapping = Array<HlsCaptionLanguageMapping>

typealias __listOfId3Insertion = Array<Id3Insertion>

typealias __listOfInput = Array<Input>

typealias __listOfInputClipping = Array<InputClipping>

typealias __listOfInputTemplate = Array<InputTemplate>

typealias __listOfInsertableImage = Array<InsertableImage>

typealias __listOfJob = Array<Job>

typealias __listOfJobTemplate = Array<JobTemplate>

typealias __listOfMsSmoothAdditionalManifest = Array<MsSmoothAdditionalManifest>

typealias __listOfOutput = Array<Output>

typealias __listOfOutputChannelMapping = Array<OutputChannelMapping>

typealias __listOfOutputDetail = Array<OutputDetail>

typealias __listOfOutputGroup = Array<OutputGroup>

typealias __listOfOutputGroupDetail = Array<OutputGroupDetail>

typealias __listOfPreset = Array<Preset>

typealias __listOfQueue = Array<Queue>

typealias __listOfTeletextPageType = Array<String /* "PAGE_TYPE_INITIAL" | "PAGE_TYPE_SUBTITLE" | "PAGE_TYPE_ADDL_INFO" | "PAGE_TYPE_PROGRAM_SCHEDULE" | "PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE" | String */>

typealias __listOf__integerMin1Max2147483647 = Array<__integerMin1Max2147483647>

typealias __listOf__integerMin32Max8182 = Array<__integerMin32Max8182>

typealias __listOf__integerMinNegative60Max6 = Array<__integerMinNegative60Max6>

typealias __listOf__string = Array<__string>

typealias __listOf__stringMin1 = Array<__stringMin1>

typealias __listOf__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12 = Array<__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12>

typealias __listOf__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12 = Array<__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12>

typealias __listOf__stringPatternS3ASSETMAPXml = Array<__stringPatternS3ASSETMAPXml>

typealias __string = String

typealias __stringMin0 = String

typealias __stringMin1 = String

typealias __stringMin11Max11Pattern01D20305D205D = String

typealias __stringMin14Max1285PatternS3Mov09PngHttpsMov09Png = String

typealias __stringMin14PatternS3BmpBMPPngPNGHttpsBmpBMPPngPNG = String

typealias __stringMin14PatternS3BmpBMPPngPNGTgaTGAHttpsBmpBMPPngPNGTgaTGA = String

typealias __stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIHttpsSccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMI = String

typealias __stringMin16Max24PatternAZaZ0922AZaZ0916 = String

typealias __stringMin1Max256 = String

typealias __stringMin24Max512PatternAZaZ0902 = String

typealias __stringMin32Max32Pattern09aFAF32 = String

typealias __stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12 = String

typealias __stringMin3Max3Pattern1809aFAF09aEAE = String

typealias __stringMin3Max3PatternAZaZ3 = String

typealias __stringMin9Max19PatternAZ26EastWestCentralNorthSouthEastWest1912 = String

typealias __stringPattern = String

typealias __stringPattern010920405090509092 = String

typealias __stringPattern01D20305D205D = String

typealias __stringPattern0940191020191209301 = String

typealias __stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12 = String

typealias __stringPatternAZaZ0902 = String

typealias __stringPatternAZaZ0932 = String

typealias __stringPatternAZaZ23AZaZ = String

typealias __stringPatternArnAwsUsGovAcm = String

typealias __stringPatternArnAwsUsGovCnKmsAZ26EastWestCentralNorthSouthEastWest1912D12KeyAFAF098AFAF094AFAF094AFAF094AFAF0912 = String

typealias __stringPatternDD = String

typealias __stringPatternHttps = String

typealias __stringPatternIdentityAZaZ26AZaZ09163 = String

typealias __stringPatternS3 = String

typealias __stringPatternS3ASSETMAPXml = String

typealias __stringPatternS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEEHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEE = String

typealias __stringPatternS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLLHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLL = String

typealias __stringPatternSNManifestConfirmConditionNotificationNS = String

typealias __stringPatternSNSignalProcessingNotificationNS = String

typealias __stringPatternW = String

typealias __stringPatternWS = String

typealias __timestampUnix = Date

@JsModule("aws-sdk")
external open class MediaConvert(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & MediaConvert.Types.ClientConfiguration */
    open fun associateCertificate(params: AssociateCertificateRequest, callback: (err: AWSError, data: AssociateCertificateResponse) -> Unit = definedExternally): Request<AssociateCertificateResponse, AWSError>
    open fun associateCertificate(callback: (err: AWSError, data: AssociateCertificateResponse) -> Unit = definedExternally): Request<AssociateCertificateResponse, AWSError>
    open fun cancelJob(params: CancelJobRequest, callback: (err: AWSError, data: CancelJobResponse) -> Unit = definedExternally): Request<CancelJobResponse, AWSError>
    open fun cancelJob(callback: (err: AWSError, data: CancelJobResponse) -> Unit = definedExternally): Request<CancelJobResponse, AWSError>
    open fun createJob(params: CreateJobRequest, callback: (err: AWSError, data: CreateJobResponse) -> Unit = definedExternally): Request<CreateJobResponse, AWSError>
    open fun createJob(callback: (err: AWSError, data: CreateJobResponse) -> Unit = definedExternally): Request<CreateJobResponse, AWSError>
    open fun createJobTemplate(params: CreateJobTemplateRequest, callback: (err: AWSError, data: CreateJobTemplateResponse) -> Unit = definedExternally): Request<CreateJobTemplateResponse, AWSError>
    open fun createJobTemplate(callback: (err: AWSError, data: CreateJobTemplateResponse) -> Unit = definedExternally): Request<CreateJobTemplateResponse, AWSError>
    open fun createPreset(params: CreatePresetRequest, callback: (err: AWSError, data: CreatePresetResponse) -> Unit = definedExternally): Request<CreatePresetResponse, AWSError>
    open fun createPreset(callback: (err: AWSError, data: CreatePresetResponse) -> Unit = definedExternally): Request<CreatePresetResponse, AWSError>
    open fun createQueue(params: CreateQueueRequest, callback: (err: AWSError, data: CreateQueueResponse) -> Unit = definedExternally): Request<CreateQueueResponse, AWSError>
    open fun createQueue(callback: (err: AWSError, data: CreateQueueResponse) -> Unit = definedExternally): Request<CreateQueueResponse, AWSError>
    open fun deleteJobTemplate(params: DeleteJobTemplateRequest, callback: (err: AWSError, data: DeleteJobTemplateResponse) -> Unit = definedExternally): Request<DeleteJobTemplateResponse, AWSError>
    open fun deleteJobTemplate(callback: (err: AWSError, data: DeleteJobTemplateResponse) -> Unit = definedExternally): Request<DeleteJobTemplateResponse, AWSError>
    open fun deletePreset(params: DeletePresetRequest, callback: (err: AWSError, data: DeletePresetResponse) -> Unit = definedExternally): Request<DeletePresetResponse, AWSError>
    open fun deletePreset(callback: (err: AWSError, data: DeletePresetResponse) -> Unit = definedExternally): Request<DeletePresetResponse, AWSError>
    open fun deleteQueue(params: DeleteQueueRequest, callback: (err: AWSError, data: DeleteQueueResponse) -> Unit = definedExternally): Request<DeleteQueueResponse, AWSError>
    open fun deleteQueue(callback: (err: AWSError, data: DeleteQueueResponse) -> Unit = definedExternally): Request<DeleteQueueResponse, AWSError>
    open fun describeEndpoints(params: DescribeEndpointsRequest, callback: (err: AWSError, data: DescribeEndpointsResponse) -> Unit = definedExternally): Request<DescribeEndpointsResponse, AWSError>
    open fun describeEndpoints(callback: (err: AWSError, data: DescribeEndpointsResponse) -> Unit = definedExternally): Request<DescribeEndpointsResponse, AWSError>
    open fun disassociateCertificate(params: DisassociateCertificateRequest, callback: (err: AWSError, data: DisassociateCertificateResponse) -> Unit = definedExternally): Request<DisassociateCertificateResponse, AWSError>
    open fun disassociateCertificate(callback: (err: AWSError, data: DisassociateCertificateResponse) -> Unit = definedExternally): Request<DisassociateCertificateResponse, AWSError>
    open fun getJob(params: GetJobRequest, callback: (err: AWSError, data: GetJobResponse) -> Unit = definedExternally): Request<GetJobResponse, AWSError>
    open fun getJob(callback: (err: AWSError, data: GetJobResponse) -> Unit = definedExternally): Request<GetJobResponse, AWSError>
    open fun getJobTemplate(params: GetJobTemplateRequest, callback: (err: AWSError, data: GetJobTemplateResponse) -> Unit = definedExternally): Request<GetJobTemplateResponse, AWSError>
    open fun getJobTemplate(callback: (err: AWSError, data: GetJobTemplateResponse) -> Unit = definedExternally): Request<GetJobTemplateResponse, AWSError>
    open fun getPreset(params: GetPresetRequest, callback: (err: AWSError, data: GetPresetResponse) -> Unit = definedExternally): Request<GetPresetResponse, AWSError>
    open fun getPreset(callback: (err: AWSError, data: GetPresetResponse) -> Unit = definedExternally): Request<GetPresetResponse, AWSError>
    open fun getQueue(params: GetQueueRequest, callback: (err: AWSError, data: GetQueueResponse) -> Unit = definedExternally): Request<GetQueueResponse, AWSError>
    open fun getQueue(callback: (err: AWSError, data: GetQueueResponse) -> Unit = definedExternally): Request<GetQueueResponse, AWSError>
    open fun listJobTemplates(params: ListJobTemplatesRequest, callback: (err: AWSError, data: ListJobTemplatesResponse) -> Unit = definedExternally): Request<ListJobTemplatesResponse, AWSError>
    open fun listJobTemplates(callback: (err: AWSError, data: ListJobTemplatesResponse) -> Unit = definedExternally): Request<ListJobTemplatesResponse, AWSError>
    open fun listJobs(params: ListJobsRequest, callback: (err: AWSError, data: ListJobsResponse) -> Unit = definedExternally): Request<ListJobsResponse, AWSError>
    open fun listJobs(callback: (err: AWSError, data: ListJobsResponse) -> Unit = definedExternally): Request<ListJobsResponse, AWSError>
    open fun listPresets(params: ListPresetsRequest, callback: (err: AWSError, data: ListPresetsResponse) -> Unit = definedExternally): Request<ListPresetsResponse, AWSError>
    open fun listPresets(callback: (err: AWSError, data: ListPresetsResponse) -> Unit = definedExternally): Request<ListPresetsResponse, AWSError>
    open fun listQueues(params: ListQueuesRequest, callback: (err: AWSError, data: ListQueuesResponse) -> Unit = definedExternally): Request<ListQueuesResponse, AWSError>
    open fun listQueues(callback: (err: AWSError, data: ListQueuesResponse) -> Unit = definedExternally): Request<ListQueuesResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateJobTemplate(params: UpdateJobTemplateRequest, callback: (err: AWSError, data: UpdateJobTemplateResponse) -> Unit = definedExternally): Request<UpdateJobTemplateResponse, AWSError>
    open fun updateJobTemplate(callback: (err: AWSError, data: UpdateJobTemplateResponse) -> Unit = definedExternally): Request<UpdateJobTemplateResponse, AWSError>
    open fun updatePreset(params: UpdatePresetRequest, callback: (err: AWSError, data: UpdatePresetResponse) -> Unit = definedExternally): Request<UpdatePresetResponse, AWSError>
    open fun updatePreset(callback: (err: AWSError, data: UpdatePresetResponse) -> Unit = definedExternally): Request<UpdatePresetResponse, AWSError>
    open fun updateQueue(params: UpdateQueueRequest, callback: (err: AWSError, data: UpdateQueueResponse) -> Unit = definedExternally): Request<UpdateQueueResponse, AWSError>
    open fun updateQueue(callback: (err: AWSError, data: UpdateQueueResponse) -> Unit = definedExternally): Request<UpdateQueueResponse, AWSError>
    interface AacSettings {
        var AudioDescriptionBroadcasterMix: String /* "BROADCASTER_MIXED_AD" | "NORMAL" | String */
        var Bitrate: __integerMin6000Max1024000?
            get() = definedExternally
            set(value) = definedExternally
        var CodecProfile: String /* "LC" | "HEV1" | "HEV2" | String */
        var CodingMode: String /* "AD_RECEIVER_MIX" | "CODING_MODE_1_0" | "CODING_MODE_1_1" | "CODING_MODE_2_0" | "CODING_MODE_5_1" | String */
        var RateControlMode: String /* "CBR" | "VBR" | String */
        var RawFormat: String /* "LATM_LOAS" | "NONE" | String */
        var SampleRate: __integerMin8000Max96000?
            get() = definedExternally
            set(value) = definedExternally
        var Specification: String /* "MPEG2" | "MPEG4" | String */
        var VbrQuality: String /* "LOW" | "MEDIUM_LOW" | "MEDIUM_HIGH" | "HIGH" | String */
    }
    interface Ac3Settings {
        var Bitrate: __integerMin64000Max640000?
            get() = definedExternally
            set(value) = definedExternally
        var BitstreamMode: String /* "COMPLETE_MAIN" | "COMMENTARY" | "DIALOGUE" | "EMERGENCY" | "HEARING_IMPAIRED" | "MUSIC_AND_EFFECTS" | "VISUALLY_IMPAIRED" | "VOICE_OVER" | String */
        var CodingMode: String /* "CODING_MODE_1_0" | "CODING_MODE_1_1" | "CODING_MODE_2_0" | "CODING_MODE_3_2_LFE" | String */
        var Dialnorm: __integerMin1Max31?
            get() = definedExternally
            set(value) = definedExternally
        var DynamicRangeCompressionProfile: String /* "FILM_STANDARD" | "NONE" | String */
        var LfeFilter: String /* "ENABLED" | "DISABLED" | String */
        var MetadataControl: String /* "FOLLOW_INPUT" | "USE_CONFIGURED" | String */
        var SampleRate: __integerMin48000Max48000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AccelerationSettings {
        var Mode: String /* "DISABLED" | "ENABLED" | "PREFERRED" | String */
    }
    interface AiffSettings {
        var BitDepth: __integerMin16Max24?
            get() = definedExternally
            set(value) = definedExternally
        var Channels: __integerMin1Max64?
            get() = definedExternally
            set(value) = definedExternally
        var SampleRate: __integerMin8000Max192000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AncillarySourceSettings {
        var Convert608To708: String /* "UPCONVERT" | "DISABLED" | String */
        var SourceAncillaryChannelNumber: __integerMin1Max4?
            get() = definedExternally
            set(value) = definedExternally
        var TerminateCaptions: String /* "END_OF_INPUT" | "DISABLED" | String */
    }
    interface AssociateCertificateRequest {
        var Arn: __string
    }
    interface AssociateCertificateResponse
    interface AudioCodecSettings {
        var AacSettings: AacSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Ac3Settings: Ac3Settings?
            get() = definedExternally
            set(value) = definedExternally
        var AiffSettings: AiffSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Codec: String /* "AAC" | "MP2" | "MP3" | "WAV" | "AIFF" | "AC3" | "EAC3" | "EAC3_ATMOS" | "PASSTHROUGH" | String */
        var Eac3AtmosSettings: Eac3AtmosSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Eac3Settings: Eac3Settings?
            get() = definedExternally
            set(value) = definedExternally
        var Mp2Settings: Mp2Settings?
            get() = definedExternally
            set(value) = definedExternally
        var Mp3Settings: Mp3Settings?
            get() = definedExternally
            set(value) = definedExternally
        var WavSettings: WavSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AudioDescription {
        var AudioNormalizationSettings: AudioNormalizationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var AudioSourceName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var AudioType: __integerMin0Max255?
            get() = definedExternally
            set(value) = definedExternally
        var AudioTypeControl: String /* "FOLLOW_INPUT" | "USE_CONFIGURED" | String */
        var CodecSettings: AudioCodecSettings?
            get() = definedExternally
            set(value) = definedExternally
        var CustomLanguageCode: __stringPatternAZaZ23AZaZ?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "ENG" | "SPA" | "FRA" | "DEU" | "GER" | "ZHO" | "ARA" | "HIN" | "JPN" | "RUS" | "POR" | "ITA" | "URD" | "VIE" | "KOR" | "PAN" | "ABK" | "AAR" | "AFR" | "AKA" | "SQI" | "AMH" | "ARG" | "HYE" | "ASM" | "AVA" | "AVE" | "AYM" | "AZE" | "BAM" | "BAK" | "EUS" | "BEL" | "BEN" | "BIH" | "BIS" | "BOS" | "BRE" | "BUL" | "MYA" | "CAT" | "KHM" | "CHA" | "CHE" | "NYA" | "CHU" | "CHV" | "COR" | "COS" | "CRE" | "HRV" | "CES" | "DAN" | "DIV" | "NLD" | "DZO" | "ENM" | "EPO" | "EST" | "EWE" | "FAO" | "FIJ" | "FIN" | "FRM" | "FUL" | "GLA" | "GLG" | "LUG" | "KAT" | "ELL" | "GRN" | "GUJ" | "HAT" | "HAU" | "HEB" | "HER" | "HMO" | "HUN" | "ISL" | "IDO" | "IBO" | "IND" | "INA" | "ILE" | "IKU" | "IPK" | "GLE" | "JAV" | "KAL" | "KAN" | "KAU" | "KAS" | "KAZ" | "KIK" | "KIN" | "KIR" | "KOM" | "KON" | "KUA" | "KUR" | "LAO" | "LAT" | "LAV" | "LIM" | "LIN" | "LIT" | "LUB" | "LTZ" | "MKD" | "MLG" | "MSA" | "MAL" | "MLT" | "GLV" | "MRI" | "MAR" | "MAH" | "MON" | "NAU" | "NAV" | "NDE" | "NBL" | "NDO" | "NEP" | "SME" | "NOR" | "NOB" | "NNO" | "OCI" | "OJI" | "ORI" | "ORM" | "OSS" | "PLI" | "FAS" | "POL" | "PUS" | "QUE" | "QAA" | "RON" | "ROH" | "RUN" | "SMO" | "SAG" | "SAN" | "SRD" | "SRB" | "SNA" | "III" | "SND" | "SIN" | "SLK" | "SLV" | "SOM" | "SOT" | "SUN" | "SWA" | "SSW" | "SWE" | "TGL" | "TAH" | "TGK" | "TAM" | "TAT" | "TEL" | "THA" | "BOD" | "TIR" | "TON" | "TSO" | "TSN" | "TUR" | "TUK" | "TWI" | "UIG" | "UKR" | "UZB" | "VEN" | "VOL" | "WLN" | "CYM" | "FRY" | "WOL" | "XHO" | "YID" | "YOR" | "ZHA" | "ZUL" | "ORJ" | "QPC" | "TNG" | String */
        var LanguageCodeControl: String /* "FOLLOW_INPUT" | "USE_CONFIGURED" | String */
        var RemixSettings: RemixSettings?
            get() = definedExternally
            set(value) = definedExternally
        var StreamName: __stringPatternWS?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AudioNormalizationSettings {
        var Algorithm: String /* "ITU_BS_1770_1" | "ITU_BS_1770_2" | "ITU_BS_1770_3" | "ITU_BS_1770_4" | String */
        var AlgorithmControl: String /* "CORRECT_AUDIO" | "MEASURE_ONLY" | String */
        var CorrectionGateLevel: __integerMinNegative70Max0?
            get() = definedExternally
            set(value) = definedExternally
        var LoudnessLogging: String /* "LOG" | "DONT_LOG" | String */
        var PeakCalculation: String /* "TRUE_PEAK" | "NONE" | String */
        var TargetLkfs: __doubleMinNegative59Max0?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AudioSelector {
        var CustomLanguageCode: __stringMin3Max3PatternAZaZ3?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultSelection: String /* "DEFAULT" | "NOT_DEFAULT" | String */
        var ExternalAudioFileInput: __stringPatternS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEEHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEE?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "ENG" | "SPA" | "FRA" | "DEU" | "GER" | "ZHO" | "ARA" | "HIN" | "JPN" | "RUS" | "POR" | "ITA" | "URD" | "VIE" | "KOR" | "PAN" | "ABK" | "AAR" | "AFR" | "AKA" | "SQI" | "AMH" | "ARG" | "HYE" | "ASM" | "AVA" | "AVE" | "AYM" | "AZE" | "BAM" | "BAK" | "EUS" | "BEL" | "BEN" | "BIH" | "BIS" | "BOS" | "BRE" | "BUL" | "MYA" | "CAT" | "KHM" | "CHA" | "CHE" | "NYA" | "CHU" | "CHV" | "COR" | "COS" | "CRE" | "HRV" | "CES" | "DAN" | "DIV" | "NLD" | "DZO" | "ENM" | "EPO" | "EST" | "EWE" | "FAO" | "FIJ" | "FIN" | "FRM" | "FUL" | "GLA" | "GLG" | "LUG" | "KAT" | "ELL" | "GRN" | "GUJ" | "HAT" | "HAU" | "HEB" | "HER" | "HMO" | "HUN" | "ISL" | "IDO" | "IBO" | "IND" | "INA" | "ILE" | "IKU" | "IPK" | "GLE" | "JAV" | "KAL" | "KAN" | "KAU" | "KAS" | "KAZ" | "KIK" | "KIN" | "KIR" | "KOM" | "KON" | "KUA" | "KUR" | "LAO" | "LAT" | "LAV" | "LIM" | "LIN" | "LIT" | "LUB" | "LTZ" | "MKD" | "MLG" | "MSA" | "MAL" | "MLT" | "GLV" | "MRI" | "MAR" | "MAH" | "MON" | "NAU" | "NAV" | "NDE" | "NBL" | "NDO" | "NEP" | "SME" | "NOR" | "NOB" | "NNO" | "OCI" | "OJI" | "ORI" | "ORM" | "OSS" | "PLI" | "FAS" | "POL" | "PUS" | "QUE" | "QAA" | "RON" | "ROH" | "RUN" | "SMO" | "SAG" | "SAN" | "SRD" | "SRB" | "SNA" | "III" | "SND" | "SIN" | "SLK" | "SLV" | "SOM" | "SOT" | "SUN" | "SWA" | "SSW" | "SWE" | "TGL" | "TAH" | "TGK" | "TAM" | "TAT" | "TEL" | "THA" | "BOD" | "TIR" | "TON" | "TSO" | "TSN" | "TUR" | "TUK" | "TWI" | "UIG" | "UKR" | "UZB" | "VEN" | "VOL" | "WLN" | "CYM" | "FRY" | "WOL" | "XHO" | "YID" | "YOR" | "ZHA" | "ZUL" | "ORJ" | "QPC" | "TNG" | String */
        var Offset: __integerMinNegative2147483648Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var Pids: __listOf__integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramSelection: __integerMin0Max8?
            get() = definedExternally
            set(value) = definedExternally
        var RemixSettings: RemixSettings?
            get() = definedExternally
            set(value) = definedExternally
        var SelectorType: String /* "PID" | "TRACK" | "LANGUAGE_CODE" | String */
        var Tracks: __listOf__integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AudioSelectorGroup {
        var AudioSelectorNames: __listOf__stringMin1?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Av1QvbrSettings {
        var QvbrQualityLevel: __integerMin1Max10?
            get() = definedExternally
            set(value) = definedExternally
        var QvbrQualityLevelFineTune: __doubleMin0Max1?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Av1Settings {
        var AdaptiveQuantization: String /* "OFF" | "LOW" | "MEDIUM" | "HIGH" | "HIGHER" | "MAX" | String */
        var FramerateControl: String /* "INITIALIZE_FROM_SOURCE" | "SPECIFIED" | String */
        var FramerateConversionAlgorithm: String /* "DUPLICATE_DROP" | "INTERPOLATE" | String */
        var FramerateDenominator: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var FramerateNumerator: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var GopSize: __doubleMin0?
            get() = definedExternally
            set(value) = definedExternally
        var MaxBitrate: __integerMin1000Max1152000000?
            get() = definedExternally
            set(value) = definedExternally
        var NumberBFramesBetweenReferenceFrames: __integerMin7Max15?
            get() = definedExternally
            set(value) = definedExternally
        var QvbrSettings: Av1QvbrSettings?
            get() = definedExternally
            set(value) = definedExternally
        var RateControlMode: String /* "QVBR" | String */
        var Slices: __integerMin1Max32?
            get() = definedExternally
            set(value) = definedExternally
        var SpatialAdaptiveQuantization: String /* "DISABLED" | "ENABLED" | String */
    }
    interface AvailBlanking {
        var AvailBlankingImage: __stringMin14PatternS3BmpBMPPngPNGHttpsBmpBMPPngPNG?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BurninDestinationSettings {
        var Alignment: String /* "CENTERED" | "LEFT" | String */
        var BackgroundColor: String /* "NONE" | "BLACK" | "WHITE" | String */
        var BackgroundOpacity: __integerMin0Max255?
            get() = definedExternally
            set(value) = definedExternally
        var FontColor: String /* "WHITE" | "BLACK" | "YELLOW" | "RED" | "GREEN" | "BLUE" | String */
        var FontOpacity: __integerMin0Max255?
            get() = definedExternally
            set(value) = definedExternally
        var FontResolution: __integerMin96Max600?
            get() = definedExternally
            set(value) = definedExternally
        var FontScript: String /* "AUTOMATIC" | "HANS" | "HANT" | String */
        var FontSize: __integerMin0Max96?
            get() = definedExternally
            set(value) = definedExternally
        var OutlineColor: String /* "BLACK" | "WHITE" | "YELLOW" | "RED" | "GREEN" | "BLUE" | String */
        var OutlineSize: __integerMin0Max10?
            get() = definedExternally
            set(value) = definedExternally
        var ShadowColor: String /* "NONE" | "BLACK" | "WHITE" | String */
        var ShadowOpacity: __integerMin0Max255?
            get() = definedExternally
            set(value) = definedExternally
        var ShadowXOffset: __integerMinNegative2147483648Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var ShadowYOffset: __integerMinNegative2147483648Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var TeletextSpacing: String /* "FIXED_GRID" | "PROPORTIONAL" | String */
        var XPosition: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var YPosition: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelJobRequest {
        var Id: __string
    }
    interface CancelJobResponse
    interface CaptionDescription {
        var CaptionSelectorName: __stringMin1?
            get() = definedExternally
            set(value) = definedExternally
        var CustomLanguageCode: __stringPatternAZaZ23AZaZ?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationSettings: CaptionDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "ENG" | "SPA" | "FRA" | "DEU" | "GER" | "ZHO" | "ARA" | "HIN" | "JPN" | "RUS" | "POR" | "ITA" | "URD" | "VIE" | "KOR" | "PAN" | "ABK" | "AAR" | "AFR" | "AKA" | "SQI" | "AMH" | "ARG" | "HYE" | "ASM" | "AVA" | "AVE" | "AYM" | "AZE" | "BAM" | "BAK" | "EUS" | "BEL" | "BEN" | "BIH" | "BIS" | "BOS" | "BRE" | "BUL" | "MYA" | "CAT" | "KHM" | "CHA" | "CHE" | "NYA" | "CHU" | "CHV" | "COR" | "COS" | "CRE" | "HRV" | "CES" | "DAN" | "DIV" | "NLD" | "DZO" | "ENM" | "EPO" | "EST" | "EWE" | "FAO" | "FIJ" | "FIN" | "FRM" | "FUL" | "GLA" | "GLG" | "LUG" | "KAT" | "ELL" | "GRN" | "GUJ" | "HAT" | "HAU" | "HEB" | "HER" | "HMO" | "HUN" | "ISL" | "IDO" | "IBO" | "IND" | "INA" | "ILE" | "IKU" | "IPK" | "GLE" | "JAV" | "KAL" | "KAN" | "KAU" | "KAS" | "KAZ" | "KIK" | "KIN" | "KIR" | "KOM" | "KON" | "KUA" | "KUR" | "LAO" | "LAT" | "LAV" | "LIM" | "LIN" | "LIT" | "LUB" | "LTZ" | "MKD" | "MLG" | "MSA" | "MAL" | "MLT" | "GLV" | "MRI" | "MAR" | "MAH" | "MON" | "NAU" | "NAV" | "NDE" | "NBL" | "NDO" | "NEP" | "SME" | "NOR" | "NOB" | "NNO" | "OCI" | "OJI" | "ORI" | "ORM" | "OSS" | "PLI" | "FAS" | "POL" | "PUS" | "QUE" | "QAA" | "RON" | "ROH" | "RUN" | "SMO" | "SAG" | "SAN" | "SRD" | "SRB" | "SNA" | "III" | "SND" | "SIN" | "SLK" | "SLV" | "SOM" | "SOT" | "SUN" | "SWA" | "SSW" | "SWE" | "TGL" | "TAH" | "TGK" | "TAM" | "TAT" | "TEL" | "THA" | "BOD" | "TIR" | "TON" | "TSO" | "TSN" | "TUR" | "TUK" | "TWI" | "UIG" | "UKR" | "UZB" | "VEN" | "VOL" | "WLN" | "CYM" | "FRY" | "WOL" | "XHO" | "YID" | "YOR" | "ZHA" | "ZUL" | "ORJ" | "QPC" | "TNG" | String */
        var LanguageDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CaptionDescriptionPreset {
        var CustomLanguageCode: __stringPatternAZaZ23AZaZ?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationSettings: CaptionDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "ENG" | "SPA" | "FRA" | "DEU" | "GER" | "ZHO" | "ARA" | "HIN" | "JPN" | "RUS" | "POR" | "ITA" | "URD" | "VIE" | "KOR" | "PAN" | "ABK" | "AAR" | "AFR" | "AKA" | "SQI" | "AMH" | "ARG" | "HYE" | "ASM" | "AVA" | "AVE" | "AYM" | "AZE" | "BAM" | "BAK" | "EUS" | "BEL" | "BEN" | "BIH" | "BIS" | "BOS" | "BRE" | "BUL" | "MYA" | "CAT" | "KHM" | "CHA" | "CHE" | "NYA" | "CHU" | "CHV" | "COR" | "COS" | "CRE" | "HRV" | "CES" | "DAN" | "DIV" | "NLD" | "DZO" | "ENM" | "EPO" | "EST" | "EWE" | "FAO" | "FIJ" | "FIN" | "FRM" | "FUL" | "GLA" | "GLG" | "LUG" | "KAT" | "ELL" | "GRN" | "GUJ" | "HAT" | "HAU" | "HEB" | "HER" | "HMO" | "HUN" | "ISL" | "IDO" | "IBO" | "IND" | "INA" | "ILE" | "IKU" | "IPK" | "GLE" | "JAV" | "KAL" | "KAN" | "KAU" | "KAS" | "KAZ" | "KIK" | "KIN" | "KIR" | "KOM" | "KON" | "KUA" | "KUR" | "LAO" | "LAT" | "LAV" | "LIM" | "LIN" | "LIT" | "LUB" | "LTZ" | "MKD" | "MLG" | "MSA" | "MAL" | "MLT" | "GLV" | "MRI" | "MAR" | "MAH" | "MON" | "NAU" | "NAV" | "NDE" | "NBL" | "NDO" | "NEP" | "SME" | "NOR" | "NOB" | "NNO" | "OCI" | "OJI" | "ORI" | "ORM" | "OSS" | "PLI" | "FAS" | "POL" | "PUS" | "QUE" | "QAA" | "RON" | "ROH" | "RUN" | "SMO" | "SAG" | "SAN" | "SRD" | "SRB" | "SNA" | "III" | "SND" | "SIN" | "SLK" | "SLV" | "SOM" | "SOT" | "SUN" | "SWA" | "SSW" | "SWE" | "TGL" | "TAH" | "TGK" | "TAM" | "TAT" | "TEL" | "THA" | "BOD" | "TIR" | "TON" | "TSO" | "TSN" | "TUR" | "TUK" | "TWI" | "UIG" | "UKR" | "UZB" | "VEN" | "VOL" | "WLN" | "CYM" | "FRY" | "WOL" | "XHO" | "YID" | "YOR" | "ZHA" | "ZUL" | "ORJ" | "QPC" | "TNG" | String */
        var LanguageDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CaptionDestinationSettings {
        var BurninDestinationSettings: BurninDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationType: String /* "BURN_IN" | "DVB_SUB" | "EMBEDDED" | "EMBEDDED_PLUS_SCTE20" | "IMSC" | "SCTE20_PLUS_EMBEDDED" | "SCC" | "SRT" | "SMI" | "TELETEXT" | "TTML" | "WEBVTT" | String */
        var DvbSubDestinationSettings: DvbSubDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var EmbeddedDestinationSettings: EmbeddedDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var ImscDestinationSettings: ImscDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var SccDestinationSettings: SccDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var TeletextDestinationSettings: TeletextDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var TtmlDestinationSettings: TtmlDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CaptionSelector {
        var CustomLanguageCode: __stringMin3Max3PatternAZaZ3?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "ENG" | "SPA" | "FRA" | "DEU" | "GER" | "ZHO" | "ARA" | "HIN" | "JPN" | "RUS" | "POR" | "ITA" | "URD" | "VIE" | "KOR" | "PAN" | "ABK" | "AAR" | "AFR" | "AKA" | "SQI" | "AMH" | "ARG" | "HYE" | "ASM" | "AVA" | "AVE" | "AYM" | "AZE" | "BAM" | "BAK" | "EUS" | "BEL" | "BEN" | "BIH" | "BIS" | "BOS" | "BRE" | "BUL" | "MYA" | "CAT" | "KHM" | "CHA" | "CHE" | "NYA" | "CHU" | "CHV" | "COR" | "COS" | "CRE" | "HRV" | "CES" | "DAN" | "DIV" | "NLD" | "DZO" | "ENM" | "EPO" | "EST" | "EWE" | "FAO" | "FIJ" | "FIN" | "FRM" | "FUL" | "GLA" | "GLG" | "LUG" | "KAT" | "ELL" | "GRN" | "GUJ" | "HAT" | "HAU" | "HEB" | "HER" | "HMO" | "HUN" | "ISL" | "IDO" | "IBO" | "IND" | "INA" | "ILE" | "IKU" | "IPK" | "GLE" | "JAV" | "KAL" | "KAN" | "KAU" | "KAS" | "KAZ" | "KIK" | "KIN" | "KIR" | "KOM" | "KON" | "KUA" | "KUR" | "LAO" | "LAT" | "LAV" | "LIM" | "LIN" | "LIT" | "LUB" | "LTZ" | "MKD" | "MLG" | "MSA" | "MAL" | "MLT" | "GLV" | "MRI" | "MAR" | "MAH" | "MON" | "NAU" | "NAV" | "NDE" | "NBL" | "NDO" | "NEP" | "SME" | "NOR" | "NOB" | "NNO" | "OCI" | "OJI" | "ORI" | "ORM" | "OSS" | "PLI" | "FAS" | "POL" | "PUS" | "QUE" | "QAA" | "RON" | "ROH" | "RUN" | "SMO" | "SAG" | "SAN" | "SRD" | "SRB" | "SNA" | "III" | "SND" | "SIN" | "SLK" | "SLV" | "SOM" | "SOT" | "SUN" | "SWA" | "SSW" | "SWE" | "TGL" | "TAH" | "TGK" | "TAM" | "TAT" | "TEL" | "THA" | "BOD" | "TIR" | "TON" | "TSO" | "TSN" | "TUR" | "TUK" | "TWI" | "UIG" | "UKR" | "UZB" | "VEN" | "VOL" | "WLN" | "CYM" | "FRY" | "WOL" | "XHO" | "YID" | "YOR" | "ZHA" | "ZUL" | "ORJ" | "QPC" | "TNG" | String */
        var SourceSettings: CaptionSourceSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CaptionSourceSettings {
        var AncillarySourceSettings: AncillarySourceSettings?
            get() = definedExternally
            set(value) = definedExternally
        var DvbSubSourceSettings: DvbSubSourceSettings?
            get() = definedExternally
            set(value) = definedExternally
        var EmbeddedSourceSettings: EmbeddedSourceSettings?
            get() = definedExternally
            set(value) = definedExternally
        var FileSourceSettings: FileSourceSettings?
            get() = definedExternally
            set(value) = definedExternally
        var SourceType: String /* "ANCILLARY" | "DVB_SUB" | "EMBEDDED" | "SCTE20" | "SCC" | "TTML" | "STL" | "SRT" | "SMI" | "TELETEXT" | "NULL_SOURCE" | "IMSC" | String */
        var TeletextSourceSettings: TeletextSourceSettings?
            get() = definedExternally
            set(value) = definedExternally
        var TrackSourceSettings: TrackSourceSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChannelMapping {
        var OutputChannels: __listOfOutputChannelMapping?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CmafAdditionalManifest {
        var ManifestNameModifier: __stringMin1?
            get() = definedExternally
            set(value) = definedExternally
        var SelectedOutputs: __listOf__stringMin1?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CmafEncryptionSettings {
        var ConstantInitializationVector: __stringMin32Max32Pattern09aFAF32?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionMethod: String /* "SAMPLE_AES" | "AES_CTR" | String */
        var InitializationVectorInManifest: String /* "INCLUDE" | "EXCLUDE" | String */
        var SpekeKeyProvider: SpekeKeyProviderCmaf?
            get() = definedExternally
            set(value) = definedExternally
        var StaticKeyProvider: StaticKeyProvider?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "SPEKE" | "STATIC_KEY" | String */
    }
    interface CmafGroupSettings {
        var AdditionalManifests: __listOfCmafAdditionalManifest?
            get() = definedExternally
            set(value) = definedExternally
        var BaseUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ClientCache: String /* "DISABLED" | "ENABLED" | String */
        var CodecSpecification: String /* "RFC_6381" | "RFC_4281" | String */
        var Destination: __stringPatternS3?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationSettings: DestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Encryption: CmafEncryptionSettings?
            get() = definedExternally
            set(value) = definedExternally
        var FragmentLength: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var ManifestCompression: String /* "GZIP" | "NONE" | String */
        var ManifestDurationFormat: String /* "FLOATING_POINT" | "INTEGER" | String */
        var MinBufferTime: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var MinFinalSegmentLength: __doubleMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var MpdProfile: String /* "MAIN_PROFILE" | "ON_DEMAND_PROFILE" | String */
        var SegmentControl: String /* "SINGLE_FILE" | "SEGMENTED_FILES" | String */
        var SegmentLength: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var StreamInfResolution: String /* "INCLUDE" | "EXCLUDE" | String */
        var WriteDashManifest: String /* "DISABLED" | "ENABLED" | String */
        var WriteHlsManifest: String /* "DISABLED" | "ENABLED" | String */
        var WriteSegmentTimelineInRepresentation: String /* "ENABLED" | "DISABLED" | String */
    }
    interface CmfcSettings {
        var Scte35Esam: String /* "INSERT" | "NONE" | String */
        var Scte35Source: String /* "PASSTHROUGH" | "NONE" | String */
    }
    interface ColorCorrector {
        var Brightness: __integerMin1Max100?
            get() = definedExternally
            set(value) = definedExternally
        var ColorSpaceConversion: String /* "NONE" | "FORCE_601" | "FORCE_709" | "FORCE_HDR10" | "FORCE_HLG_2020" | String */
        var Contrast: __integerMin1Max100?
            get() = definedExternally
            set(value) = definedExternally
        var Hdr10Metadata: Hdr10Metadata?
            get() = definedExternally
            set(value) = definedExternally
        var Hue: __integerMinNegative180Max180?
            get() = definedExternally
            set(value) = definedExternally
        var Saturation: __integerMin1Max100?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContainerSettings {
        var CmfcSettings: CmfcSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Container: String /* "F4V" | "ISMV" | "M2TS" | "M3U8" | "CMFC" | "MOV" | "MP4" | "MPD" | "MXF" | "RAW" | String */
        var F4vSettings: F4vSettings?
            get() = definedExternally
            set(value) = definedExternally
        var M2tsSettings: M2tsSettings?
            get() = definedExternally
            set(value) = definedExternally
        var M3u8Settings: M3u8Settings?
            get() = definedExternally
            set(value) = definedExternally
        var MovSettings: MovSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Mp4Settings: Mp4Settings?
            get() = definedExternally
            set(value) = definedExternally
        var MpdSettings: MpdSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateJobRequest {
        var AccelerationSettings: AccelerationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var BillingTagsSource: String /* "QUEUE" | "PRESET" | "JOB_TEMPLATE" | "JOB" | String */
        var ClientRequestToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var JobTemplate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Priority: __integerMinNegative50Max50?
            get() = definedExternally
            set(value) = definedExternally
        var Queue: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Role: __string
        var Settings: JobSettings
        var SimulateReservedQueue: String /* "DISABLED" | "ENABLED" | String */
        var StatusUpdateInterval: String /* "SECONDS_10" | "SECONDS_12" | "SECONDS_15" | "SECONDS_20" | "SECONDS_30" | "SECONDS_60" | "SECONDS_120" | "SECONDS_180" | "SECONDS_240" | "SECONDS_300" | "SECONDS_360" | "SECONDS_420" | "SECONDS_480" | "SECONDS_540" | "SECONDS_600" | String */
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var UserMetadata: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateJobResponse {
        var Job: Job?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateJobTemplateRequest {
        var AccelerationSettings: AccelerationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Category: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string
        var Priority: __integerMinNegative50Max50?
            get() = definedExternally
            set(value) = definedExternally
        var Queue: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Settings: JobTemplateSettings
        var StatusUpdateInterval: String /* "SECONDS_10" | "SECONDS_12" | "SECONDS_15" | "SECONDS_20" | "SECONDS_30" | "SECONDS_60" | "SECONDS_120" | "SECONDS_180" | "SECONDS_240" | "SECONDS_300" | "SECONDS_360" | "SECONDS_420" | "SECONDS_480" | "SECONDS_540" | "SECONDS_600" | String */
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateJobTemplateResponse {
        var JobTemplate: JobTemplate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePresetRequest {
        var Category: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string
        var Settings: PresetSettings
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePresetResponse {
        var Preset: Preset?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateQueueRequest {
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string
        var PricingPlan: String /* "ON_DEMAND" | "RESERVED" | String */
        var ReservationPlanSettings: ReservationPlanSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "ACTIVE" | "PAUSED" | String */
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateQueueResponse {
        var Queue: Queue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DashAdditionalManifest {
        var ManifestNameModifier: __stringMin1?
            get() = definedExternally
            set(value) = definedExternally
        var SelectedOutputs: __listOf__stringMin1?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DashIsoEncryptionSettings {
        var PlaybackDeviceCompatibility: String /* "CENC_V1" | "UNENCRYPTED_SEI" | String */
        var SpekeKeyProvider: SpekeKeyProvider?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DashIsoGroupSettings {
        var AdditionalManifests: __listOfDashAdditionalManifest?
            get() = definedExternally
            set(value) = definedExternally
        var BaseUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Destination: __stringPatternS3?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationSettings: DestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Encryption: DashIsoEncryptionSettings?
            get() = definedExternally
            set(value) = definedExternally
        var FragmentLength: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var HbbtvCompliance: String /* "HBBTV_1_5" | "NONE" | String */
        var MinBufferTime: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var MpdProfile: String /* "MAIN_PROFILE" | "ON_DEMAND_PROFILE" | String */
        var SegmentControl: String /* "SINGLE_FILE" | "SEGMENTED_FILES" | String */
        var SegmentLength: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var WriteSegmentTimelineInRepresentation: String /* "ENABLED" | "DISABLED" | String */
    }
    interface Deinterlacer {
        var Algorithm: String /* "INTERPOLATE" | "INTERPOLATE_TICKER" | "BLEND" | "BLEND_TICKER" | String */
        var Control: String /* "FORCE_ALL_FRAMES" | "NORMAL" | String */
        var Mode: String /* "DEINTERLACE" | "INVERSE_TELECINE" | "ADAPTIVE" | String */
    }
    interface DeleteJobTemplateRequest {
        var Name: __string
    }
    interface DeleteJobTemplateResponse
    interface DeletePresetRequest {
        var Name: __string
    }
    interface DeletePresetResponse
    interface DeleteQueueRequest {
        var Name: __string
    }
    interface DeleteQueueResponse
    interface DescribeEndpointsRequest {
        var MaxResults: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Mode: String /* "DEFAULT" | "GET_ONLY" | String */
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEndpointsResponse {
        var Endpoints: __listOfEndpoint?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DestinationSettings {
        var S3Settings: S3DestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateCertificateRequest {
        var Arn: __string
    }
    interface DisassociateCertificateResponse
    interface DolbyVision {
        var L6Metadata: DolbyVisionLevel6Metadata?
            get() = definedExternally
            set(value) = definedExternally
        var L6Mode: String /* "PASSTHROUGH" | "RECALCULATE" | "SPECIFY" | String */
        var Profile: String /* "PROFILE_5" | String */
    }
    interface DolbyVisionLevel6Metadata {
        var MaxCll: __integerMin0Max65535?
            get() = definedExternally
            set(value) = definedExternally
        var MaxFall: __integerMin0Max65535?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DvbNitSettings {
        var NetworkId: __integerMin0Max65535?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkName: __stringMin1Max256?
            get() = definedExternally
            set(value) = definedExternally
        var NitInterval: __integerMin25Max10000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DvbSdtSettings {
        var OutputSdt: String /* "SDT_FOLLOW" | "SDT_FOLLOW_IF_PRESENT" | "SDT_MANUAL" | "SDT_NONE" | String */
        var SdtInterval: __integerMin25Max2000?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceName: __stringMin1Max256?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceProviderName: __stringMin1Max256?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DvbSubDestinationSettings {
        var Alignment: String /* "CENTERED" | "LEFT" | String */
        var BackgroundColor: String /* "NONE" | "BLACK" | "WHITE" | String */
        var BackgroundOpacity: __integerMin0Max255?
            get() = definedExternally
            set(value) = definedExternally
        var FontColor: String /* "WHITE" | "BLACK" | "YELLOW" | "RED" | "GREEN" | "BLUE" | String */
        var FontOpacity: __integerMin0Max255?
            get() = definedExternally
            set(value) = definedExternally
        var FontResolution: __integerMin96Max600?
            get() = definedExternally
            set(value) = definedExternally
        var FontScript: String /* "AUTOMATIC" | "HANS" | "HANT" | String */
        var FontSize: __integerMin0Max96?
            get() = definedExternally
            set(value) = definedExternally
        var OutlineColor: String /* "BLACK" | "WHITE" | "YELLOW" | "RED" | "GREEN" | "BLUE" | String */
        var OutlineSize: __integerMin0Max10?
            get() = definedExternally
            set(value) = definedExternally
        var ShadowColor: String /* "NONE" | "BLACK" | "WHITE" | String */
        var ShadowOpacity: __integerMin0Max255?
            get() = definedExternally
            set(value) = definedExternally
        var ShadowXOffset: __integerMinNegative2147483648Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var ShadowYOffset: __integerMinNegative2147483648Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var SubtitlingType: String /* "HEARING_IMPAIRED" | "STANDARD" | String */
        var TeletextSpacing: String /* "FIXED_GRID" | "PROPORTIONAL" | String */
        var XPosition: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var YPosition: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DvbSubSourceSettings {
        var Pid: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DvbTdtSettings {
        var TdtInterval: __integerMin1000Max30000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Eac3AtmosSettings {
        var Bitrate: __integerMin384000Max768000?
            get() = definedExternally
            set(value) = definedExternally
        var BitstreamMode: String /* "COMPLETE_MAIN" | String */
        var CodingMode: String /* "CODING_MODE_9_1_6" | String */
        var DialogueIntelligence: String /* "ENABLED" | "DISABLED" | String */
        var DynamicRangeCompressionLine: String /* "NONE" | "FILM_STANDARD" | "FILM_LIGHT" | "MUSIC_STANDARD" | "MUSIC_LIGHT" | "SPEECH" | String */
        var DynamicRangeCompressionRf: String /* "NONE" | "FILM_STANDARD" | "FILM_LIGHT" | "MUSIC_STANDARD" | "MUSIC_LIGHT" | "SPEECH" | String */
        var LoRoCenterMixLevel: __doubleMinNegative6Max3?
            get() = definedExternally
            set(value) = definedExternally
        var LoRoSurroundMixLevel: __doubleMinNegative60MaxNegative1?
            get() = definedExternally
            set(value) = definedExternally
        var LtRtCenterMixLevel: __doubleMinNegative6Max3?
            get() = definedExternally
            set(value) = definedExternally
        var LtRtSurroundMixLevel: __doubleMinNegative60MaxNegative1?
            get() = definedExternally
            set(value) = definedExternally
        var MeteringMode: String /* "LEQ_A" | "ITU_BS_1770_1" | "ITU_BS_1770_2" | "ITU_BS_1770_3" | "ITU_BS_1770_4" | String */
        var SampleRate: __integerMin48000Max48000?
            get() = definedExternally
            set(value) = definedExternally
        var SpeechThreshold: __integerMin1Max100?
            get() = definedExternally
            set(value) = definedExternally
        var StereoDownmix: String /* "NOT_INDICATED" | "STEREO" | "SURROUND" | "DPL2" | String */
        var SurroundExMode: String /* "NOT_INDICATED" | "ENABLED" | "DISABLED" | String */
    }
    interface Eac3Settings {
        var AttenuationControl: String /* "ATTENUATE_3_DB" | "NONE" | String */
        var Bitrate: __integerMin64000Max640000?
            get() = definedExternally
            set(value) = definedExternally
        var BitstreamMode: String /* "COMPLETE_MAIN" | "COMMENTARY" | "EMERGENCY" | "HEARING_IMPAIRED" | "VISUALLY_IMPAIRED" | String */
        var CodingMode: String /* "CODING_MODE_1_0" | "CODING_MODE_2_0" | "CODING_MODE_3_2" | String */
        var DcFilter: String /* "ENABLED" | "DISABLED" | String */
        var Dialnorm: __integerMin1Max31?
            get() = definedExternally
            set(value) = definedExternally
        var DynamicRangeCompressionLine: String /* "NONE" | "FILM_STANDARD" | "FILM_LIGHT" | "MUSIC_STANDARD" | "MUSIC_LIGHT" | "SPEECH" | String */
        var DynamicRangeCompressionRf: String /* "NONE" | "FILM_STANDARD" | "FILM_LIGHT" | "MUSIC_STANDARD" | "MUSIC_LIGHT" | "SPEECH" | String */
        var LfeControl: String /* "LFE" | "NO_LFE" | String */
        var LfeFilter: String /* "ENABLED" | "DISABLED" | String */
        var LoRoCenterMixLevel: __doubleMinNegative60Max3?
            get() = definedExternally
            set(value) = definedExternally
        var LoRoSurroundMixLevel: __doubleMinNegative60MaxNegative1?
            get() = definedExternally
            set(value) = definedExternally
        var LtRtCenterMixLevel: __doubleMinNegative60Max3?
            get() = definedExternally
            set(value) = definedExternally
        var LtRtSurroundMixLevel: __doubleMinNegative60MaxNegative1?
            get() = definedExternally
            set(value) = definedExternally
        var MetadataControl: String /* "FOLLOW_INPUT" | "USE_CONFIGURED" | String */
        var PassthroughControl: String /* "WHEN_POSSIBLE" | "NO_PASSTHROUGH" | String */
        var PhaseControl: String /* "SHIFT_90_DEGREES" | "NO_SHIFT" | String */
        var SampleRate: __integerMin48000Max48000?
            get() = definedExternally
            set(value) = definedExternally
        var StereoDownmix: String /* "NOT_INDICATED" | "LO_RO" | "LT_RT" | "DPL2" | String */
        var SurroundExMode: String /* "NOT_INDICATED" | "ENABLED" | "DISABLED" | String */
        var SurroundMode: String /* "NOT_INDICATED" | "ENABLED" | "DISABLED" | String */
    }
    interface EmbeddedDestinationSettings {
        var Destination608ChannelNumber: __integerMin1Max4?
            get() = definedExternally
            set(value) = definedExternally
        var Destination708ServiceNumber: __integerMin1Max6?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EmbeddedSourceSettings {
        var Convert608To708: String /* "UPCONVERT" | "DISABLED" | String */
        var Source608ChannelNumber: __integerMin1Max4?
            get() = definedExternally
            set(value) = definedExternally
        var Source608TrackNumber: __integerMin1Max1?
            get() = definedExternally
            set(value) = definedExternally
        var TerminateCaptions: String /* "END_OF_INPUT" | "DISABLED" | String */
    }
    interface Endpoint {
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EsamManifestConfirmConditionNotification {
        var MccXml: __stringPatternSNManifestConfirmConditionNotificationNS?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EsamSettings {
        var ManifestConfirmConditionNotification: EsamManifestConfirmConditionNotification?
            get() = definedExternally
            set(value) = definedExternally
        var ResponseSignalPreroll: __integerMin0Max30000?
            get() = definedExternally
            set(value) = definedExternally
        var SignalProcessingNotification: EsamSignalProcessingNotification?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EsamSignalProcessingNotification {
        var SccXml: __stringPatternSNSignalProcessingNotificationNS?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface F4vSettings {
        var MoovPlacement: String /* "PROGRESSIVE_DOWNLOAD" | "NORMAL" | String */
    }
    interface FileGroupSettings {
        var Destination: __stringPatternS3?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationSettings: DestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FileSourceSettings {
        var Convert608To708: String /* "UPCONVERT" | "DISABLED" | String */
        var SourceFile: __stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIHttpsSccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMI?
            get() = definedExternally
            set(value) = definedExternally
        var TimeDelta: __integerMinNegative2147483648Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FrameCaptureSettings {
        var FramerateDenominator: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var FramerateNumerator: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var MaxCaptures: __integerMin1Max10000000?
            get() = definedExternally
            set(value) = definedExternally
        var Quality: __integerMin1Max100?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetJobRequest {
        var Id: __string
    }
    interface GetJobResponse {
        var Job: Job?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetJobTemplateRequest {
        var Name: __string
    }
    interface GetJobTemplateResponse {
        var JobTemplate: JobTemplate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPresetRequest {
        var Name: __string
    }
    interface GetPresetResponse {
        var Preset: Preset?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetQueueRequest {
        var Name: __string
    }
    interface GetQueueResponse {
        var Queue: Queue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface H264QvbrSettings {
        var MaxAverageBitrate: __integerMin1000Max1152000000?
            get() = definedExternally
            set(value) = definedExternally
        var QvbrQualityLevel: __integerMin1Max10?
            get() = definedExternally
            set(value) = definedExternally
        var QvbrQualityLevelFineTune: __doubleMin0Max1?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface H264Settings {
        var AdaptiveQuantization: String /* "OFF" | "LOW" | "MEDIUM" | "HIGH" | "HIGHER" | "MAX" | String */
        var Bitrate: __integerMin1000Max1152000000?
            get() = definedExternally
            set(value) = definedExternally
        var CodecLevel: String /* "AUTO" | "LEVEL_1" | "LEVEL_1_1" | "LEVEL_1_2" | "LEVEL_1_3" | "LEVEL_2" | "LEVEL_2_1" | "LEVEL_2_2" | "LEVEL_3" | "LEVEL_3_1" | "LEVEL_3_2" | "LEVEL_4" | "LEVEL_4_1" | "LEVEL_4_2" | "LEVEL_5" | "LEVEL_5_1" | "LEVEL_5_2" | String */
        var CodecProfile: String /* "BASELINE" | "HIGH" | "HIGH_10BIT" | "HIGH_422" | "HIGH_422_10BIT" | "MAIN" | String */
        var DynamicSubGop: String /* "ADAPTIVE" | "STATIC" | String */
        var EntropyEncoding: String /* "CABAC" | "CAVLC" | String */
        var FieldEncoding: String /* "PAFF" | "FORCE_FIELD" | String */
        var FlickerAdaptiveQuantization: String /* "DISABLED" | "ENABLED" | String */
        var FramerateControl: String /* "INITIALIZE_FROM_SOURCE" | "SPECIFIED" | String */
        var FramerateConversionAlgorithm: String /* "DUPLICATE_DROP" | "INTERPOLATE" | String */
        var FramerateDenominator: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var FramerateNumerator: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var GopBReference: String /* "DISABLED" | "ENABLED" | String */
        var GopClosedCadence: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var GopSize: __doubleMin0?
            get() = definedExternally
            set(value) = definedExternally
        var GopSizeUnits: String /* "FRAMES" | "SECONDS" | String */
        var HrdBufferInitialFillPercentage: __integerMin0Max100?
            get() = definedExternally
            set(value) = definedExternally
        var HrdBufferSize: __integerMin0Max1152000000?
            get() = definedExternally
            set(value) = definedExternally
        var InterlaceMode: String /* "PROGRESSIVE" | "TOP_FIELD" | "BOTTOM_FIELD" | "FOLLOW_TOP_FIELD" | "FOLLOW_BOTTOM_FIELD" | String */
        var MaxBitrate: __integerMin1000Max1152000000?
            get() = definedExternally
            set(value) = definedExternally
        var MinIInterval: __integerMin0Max30?
            get() = definedExternally
            set(value) = definedExternally
        var NumberBFramesBetweenReferenceFrames: __integerMin0Max7?
            get() = definedExternally
            set(value) = definedExternally
        var NumberReferenceFrames: __integerMin1Max6?
            get() = definedExternally
            set(value) = definedExternally
        var ParControl: String /* "INITIALIZE_FROM_SOURCE" | "SPECIFIED" | String */
        var ParDenominator: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var ParNumerator: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var QualityTuningLevel: String /* "SINGLE_PASS" | "SINGLE_PASS_HQ" | "MULTI_PASS_HQ" | String */
        var QvbrSettings: H264QvbrSettings?
            get() = definedExternally
            set(value) = definedExternally
        var RateControlMode: String /* "VBR" | "CBR" | "QVBR" | String */
        var RepeatPps: String /* "DISABLED" | "ENABLED" | String */
        var SceneChangeDetect: String /* "DISABLED" | "ENABLED" | "TRANSITION_DETECTION" | String */
        var Slices: __integerMin1Max32?
            get() = definedExternally
            set(value) = definedExternally
        var SlowPal: String /* "DISABLED" | "ENABLED" | String */
        var Softness: __integerMin0Max128?
            get() = definedExternally
            set(value) = definedExternally
        var SpatialAdaptiveQuantization: String /* "DISABLED" | "ENABLED" | String */
        var Syntax: String /* "DEFAULT" | "RP2027" | String */
        var Telecine: String /* "NONE" | "SOFT" | "HARD" | String */
        var TemporalAdaptiveQuantization: String /* "DISABLED" | "ENABLED" | String */
        var UnregisteredSeiTimecode: String /* "DISABLED" | "ENABLED" | String */
    }
    interface H265QvbrSettings {
        var MaxAverageBitrate: __integerMin1000Max1466400000?
            get() = definedExternally
            set(value) = definedExternally
        var QvbrQualityLevel: __integerMin1Max10?
            get() = definedExternally
            set(value) = definedExternally
        var QvbrQualityLevelFineTune: __doubleMin0Max1?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface H265Settings {
        var AdaptiveQuantization: String /* "OFF" | "LOW" | "MEDIUM" | "HIGH" | "HIGHER" | "MAX" | String */
        var AlternateTransferFunctionSei: String /* "DISABLED" | "ENABLED" | String */
        var Bitrate: __integerMin1000Max1466400000?
            get() = definedExternally
            set(value) = definedExternally
        var CodecLevel: String /* "AUTO" | "LEVEL_1" | "LEVEL_2" | "LEVEL_2_1" | "LEVEL_3" | "LEVEL_3_1" | "LEVEL_4" | "LEVEL_4_1" | "LEVEL_5" | "LEVEL_5_1" | "LEVEL_5_2" | "LEVEL_6" | "LEVEL_6_1" | "LEVEL_6_2" | String */
        var CodecProfile: String /* "MAIN_MAIN" | "MAIN_HIGH" | "MAIN10_MAIN" | "MAIN10_HIGH" | "MAIN_422_8BIT_MAIN" | "MAIN_422_8BIT_HIGH" | "MAIN_422_10BIT_MAIN" | "MAIN_422_10BIT_HIGH" | String */
        var DynamicSubGop: String /* "ADAPTIVE" | "STATIC" | String */
        var FlickerAdaptiveQuantization: String /* "DISABLED" | "ENABLED" | String */
        var FramerateControl: String /* "INITIALIZE_FROM_SOURCE" | "SPECIFIED" | String */
        var FramerateConversionAlgorithm: String /* "DUPLICATE_DROP" | "INTERPOLATE" | String */
        var FramerateDenominator: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var FramerateNumerator: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var GopBReference: String /* "DISABLED" | "ENABLED" | String */
        var GopClosedCadence: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var GopSize: __doubleMin0?
            get() = definedExternally
            set(value) = definedExternally
        var GopSizeUnits: String /* "FRAMES" | "SECONDS" | String */
        var HrdBufferInitialFillPercentage: __integerMin0Max100?
            get() = definedExternally
            set(value) = definedExternally
        var HrdBufferSize: __integerMin0Max1466400000?
            get() = definedExternally
            set(value) = definedExternally
        var InterlaceMode: String /* "PROGRESSIVE" | "TOP_FIELD" | "BOTTOM_FIELD" | "FOLLOW_TOP_FIELD" | "FOLLOW_BOTTOM_FIELD" | String */
        var MaxBitrate: __integerMin1000Max1466400000?
            get() = definedExternally
            set(value) = definedExternally
        var MinIInterval: __integerMin0Max30?
            get() = definedExternally
            set(value) = definedExternally
        var NumberBFramesBetweenReferenceFrames: __integerMin0Max7?
            get() = definedExternally
            set(value) = definedExternally
        var NumberReferenceFrames: __integerMin1Max6?
            get() = definedExternally
            set(value) = definedExternally
        var ParControl: String /* "INITIALIZE_FROM_SOURCE" | "SPECIFIED" | String */
        var ParDenominator: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var ParNumerator: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var QualityTuningLevel: String /* "SINGLE_PASS" | "SINGLE_PASS_HQ" | "MULTI_PASS_HQ" | String */
        var QvbrSettings: H265QvbrSettings?
            get() = definedExternally
            set(value) = definedExternally
        var RateControlMode: String /* "VBR" | "CBR" | "QVBR" | String */
        var SampleAdaptiveOffsetFilterMode: String /* "DEFAULT" | "ADAPTIVE" | "OFF" | String */
        var SceneChangeDetect: String /* "DISABLED" | "ENABLED" | "TRANSITION_DETECTION" | String */
        var Slices: __integerMin1Max32?
            get() = definedExternally
            set(value) = definedExternally
        var SlowPal: String /* "DISABLED" | "ENABLED" | String */
        var SpatialAdaptiveQuantization: String /* "DISABLED" | "ENABLED" | String */
        var Telecine: String /* "NONE" | "SOFT" | "HARD" | String */
        var TemporalAdaptiveQuantization: String /* "DISABLED" | "ENABLED" | String */
        var TemporalIds: String /* "DISABLED" | "ENABLED" | String */
        var Tiles: String /* "DISABLED" | "ENABLED" | String */
        var UnregisteredSeiTimecode: String /* "DISABLED" | "ENABLED" | String */
        var WriteMp4PackagingType: String /* "HVC1" | "HEV1" | String */
    }
    interface Hdr10Metadata {
        var BluePrimaryX: __integerMin0Max50000?
            get() = definedExternally
            set(value) = definedExternally
        var BluePrimaryY: __integerMin0Max50000?
            get() = definedExternally
            set(value) = definedExternally
        var GreenPrimaryX: __integerMin0Max50000?
            get() = definedExternally
            set(value) = definedExternally
        var GreenPrimaryY: __integerMin0Max50000?
            get() = definedExternally
            set(value) = definedExternally
        var MaxContentLightLevel: __integerMin0Max65535?
            get() = definedExternally
            set(value) = definedExternally
        var MaxFrameAverageLightLevel: __integerMin0Max65535?
            get() = definedExternally
            set(value) = definedExternally
        var MaxLuminance: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var MinLuminance: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var RedPrimaryX: __integerMin0Max50000?
            get() = definedExternally
            set(value) = definedExternally
        var RedPrimaryY: __integerMin0Max50000?
            get() = definedExternally
            set(value) = definedExternally
        var WhitePointX: __integerMin0Max50000?
            get() = definedExternally
            set(value) = definedExternally
        var WhitePointY: __integerMin0Max50000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HlsAdditionalManifest {
        var ManifestNameModifier: __stringMin1?
            get() = definedExternally
            set(value) = definedExternally
        var SelectedOutputs: __listOf__stringMin1?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HlsCaptionLanguageMapping {
        var CaptionChannel: __integerMinNegative2147483648Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var CustomLanguageCode: __stringMin3Max3PatternAZaZ3?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "ENG" | "SPA" | "FRA" | "DEU" | "GER" | "ZHO" | "ARA" | "HIN" | "JPN" | "RUS" | "POR" | "ITA" | "URD" | "VIE" | "KOR" | "PAN" | "ABK" | "AAR" | "AFR" | "AKA" | "SQI" | "AMH" | "ARG" | "HYE" | "ASM" | "AVA" | "AVE" | "AYM" | "AZE" | "BAM" | "BAK" | "EUS" | "BEL" | "BEN" | "BIH" | "BIS" | "BOS" | "BRE" | "BUL" | "MYA" | "CAT" | "KHM" | "CHA" | "CHE" | "NYA" | "CHU" | "CHV" | "COR" | "COS" | "CRE" | "HRV" | "CES" | "DAN" | "DIV" | "NLD" | "DZO" | "ENM" | "EPO" | "EST" | "EWE" | "FAO" | "FIJ" | "FIN" | "FRM" | "FUL" | "GLA" | "GLG" | "LUG" | "KAT" | "ELL" | "GRN" | "GUJ" | "HAT" | "HAU" | "HEB" | "HER" | "HMO" | "HUN" | "ISL" | "IDO" | "IBO" | "IND" | "INA" | "ILE" | "IKU" | "IPK" | "GLE" | "JAV" | "KAL" | "KAN" | "KAU" | "KAS" | "KAZ" | "KIK" | "KIN" | "KIR" | "KOM" | "KON" | "KUA" | "KUR" | "LAO" | "LAT" | "LAV" | "LIM" | "LIN" | "LIT" | "LUB" | "LTZ" | "MKD" | "MLG" | "MSA" | "MAL" | "MLT" | "GLV" | "MRI" | "MAR" | "MAH" | "MON" | "NAU" | "NAV" | "NDE" | "NBL" | "NDO" | "NEP" | "SME" | "NOR" | "NOB" | "NNO" | "OCI" | "OJI" | "ORI" | "ORM" | "OSS" | "PLI" | "FAS" | "POL" | "PUS" | "QUE" | "QAA" | "RON" | "ROH" | "RUN" | "SMO" | "SAG" | "SAN" | "SRD" | "SRB" | "SNA" | "III" | "SND" | "SIN" | "SLK" | "SLV" | "SOM" | "SOT" | "SUN" | "SWA" | "SSW" | "SWE" | "TGL" | "TAH" | "TGK" | "TAM" | "TAT" | "TEL" | "THA" | "BOD" | "TIR" | "TON" | "TSO" | "TSN" | "TUR" | "TUK" | "TWI" | "UIG" | "UKR" | "UZB" | "VEN" | "VOL" | "WLN" | "CYM" | "FRY" | "WOL" | "XHO" | "YID" | "YOR" | "ZHA" | "ZUL" | "ORJ" | "QPC" | "TNG" | String */
        var LanguageDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HlsEncryptionSettings {
        var ConstantInitializationVector: __stringMin32Max32Pattern09aFAF32?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionMethod: String /* "AES128" | "SAMPLE_AES" | String */
        var InitializationVectorInManifest: String /* "INCLUDE" | "EXCLUDE" | String */
        var OfflineEncrypted: String /* "ENABLED" | "DISABLED" | String */
        var SpekeKeyProvider: SpekeKeyProvider?
            get() = definedExternally
            set(value) = definedExternally
        var StaticKeyProvider: StaticKeyProvider?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "SPEKE" | "STATIC_KEY" | String */
    }
    interface HlsGroupSettings {
        var AdMarkers: __listOfHlsAdMarkers?
            get() = definedExternally
            set(value) = definedExternally
        var AdditionalManifests: __listOfHlsAdditionalManifest?
            get() = definedExternally
            set(value) = definedExternally
        var BaseUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CaptionLanguageMappings: __listOfHlsCaptionLanguageMapping?
            get() = definedExternally
            set(value) = definedExternally
        var CaptionLanguageSetting: String /* "INSERT" | "OMIT" | "NONE" | String */
        var ClientCache: String /* "DISABLED" | "ENABLED" | String */
        var CodecSpecification: String /* "RFC_6381" | "RFC_4281" | String */
        var Destination: __stringPatternS3?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationSettings: DestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var DirectoryStructure: String /* "SINGLE_DIRECTORY" | "SUBDIRECTORY_PER_STREAM" | String */
        var Encryption: HlsEncryptionSettings?
            get() = definedExternally
            set(value) = definedExternally
        var ManifestCompression: String /* "GZIP" | "NONE" | String */
        var ManifestDurationFormat: String /* "FLOATING_POINT" | "INTEGER" | String */
        var MinFinalSegmentLength: __doubleMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var MinSegmentLength: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var OutputSelection: String /* "MANIFESTS_AND_SEGMENTS" | "SEGMENTS_ONLY" | String */
        var ProgramDateTime: String /* "INCLUDE" | "EXCLUDE" | String */
        var ProgramDateTimePeriod: __integerMin0Max3600?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentControl: String /* "SINGLE_FILE" | "SEGMENTED_FILES" | String */
        var SegmentLength: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentsPerSubdirectory: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var StreamInfResolution: String /* "INCLUDE" | "EXCLUDE" | String */
        var TimedMetadataId3Frame: String /* "NONE" | "PRIV" | "TDRL" | String */
        var TimedMetadataId3Period: __integerMinNegative2147483648Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var TimestampDeltaMilliseconds: __integerMinNegative2147483648Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HlsSettings {
        var AudioGroupId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var AudioOnlyContainer: String /* "AUTOMATIC" | "M2TS" | String */
        var AudioRenditionSets: __string?
            get() = definedExternally
            set(value) = definedExternally
        var AudioTrackType: String /* "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT" | "ALTERNATE_AUDIO_AUTO_SELECT" | "ALTERNATE_AUDIO_NOT_AUTO_SELECT" | "AUDIO_ONLY_VARIANT_STREAM" | String */
        var IFrameOnlyManifest: String /* "INCLUDE" | "EXCLUDE" | String */
        var SegmentModifier: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Id3Insertion {
        var Id3: __stringPatternAZaZ0902?
            get() = definedExternally
            set(value) = definedExternally
        var Timecode: __stringPattern010920405090509092?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImageInserter {
        var InsertableImages: __listOfInsertableImage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImscDestinationSettings {
        var StylePassthrough: String /* "ENABLED" | "DISABLED" | String */
    }
    interface Input {
        var AudioSelectorGroups: __mapOfAudioSelectorGroup?
            get() = definedExternally
            set(value) = definedExternally
        var AudioSelectors: __mapOfAudioSelector?
            get() = definedExternally
            set(value) = definedExternally
        var CaptionSelectors: __mapOfCaptionSelector?
            get() = definedExternally
            set(value) = definedExternally
        var Crop: Rectangle?
            get() = definedExternally
            set(value) = definedExternally
        var DeblockFilter: String /* "ENABLED" | "DISABLED" | String */
        var DecryptionSettings: InputDecryptionSettings?
            get() = definedExternally
            set(value) = definedExternally
        var DenoiseFilter: String /* "ENABLED" | "DISABLED" | String */
        var FileInput: __stringPatternS3MM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLLHttpsMM2VVMMPPEEGGMMPP3AAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8WWEEBBMMLLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMXXMMLL?
            get() = definedExternally
            set(value) = definedExternally
        var FilterEnable: String /* "AUTO" | "DISABLE" | "FORCE" | String */
        var FilterStrength: __integerMinNegative5Max5?
            get() = definedExternally
            set(value) = definedExternally
        var ImageInserter: ImageInserter?
            get() = definedExternally
            set(value) = definedExternally
        var InputClippings: __listOfInputClipping?
            get() = definedExternally
            set(value) = definedExternally
        var Position: Rectangle?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramNumber: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var PsiControl: String /* "IGNORE_PSI" | "USE_PSI" | String */
        var SupplementalImps: __listOf__stringPatternS3ASSETMAPXml?
            get() = definedExternally
            set(value) = definedExternally
        var TimecodeSource: String /* "EMBEDDED" | "ZEROBASED" | "SPECIFIEDSTART" | String */
        var TimecodeStart: __stringMin11Max11Pattern01D20305D205D?
            get() = definedExternally
            set(value) = definedExternally
        var VideoSelector: VideoSelector?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputClipping {
        var EndTimecode: __stringPattern010920405090509092?
            get() = definedExternally
            set(value) = definedExternally
        var StartTimecode: __stringPattern010920405090509092?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputDecryptionSettings {
        var DecryptionMode: String /* "AES_CTR" | "AES_CBC" | "AES_GCM" | String */
        var EncryptedDecryptionKey: __stringMin24Max512PatternAZaZ0902?
            get() = definedExternally
            set(value) = definedExternally
        var InitializationVector: __stringMin16Max24PatternAZaZ0922AZaZ0916?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyRegion: __stringMin9Max19PatternAZ26EastWestCentralNorthSouthEastWest1912?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputTemplate {
        var AudioSelectorGroups: __mapOfAudioSelectorGroup?
            get() = definedExternally
            set(value) = definedExternally
        var AudioSelectors: __mapOfAudioSelector?
            get() = definedExternally
            set(value) = definedExternally
        var CaptionSelectors: __mapOfCaptionSelector?
            get() = definedExternally
            set(value) = definedExternally
        var Crop: Rectangle?
            get() = definedExternally
            set(value) = definedExternally
        var DeblockFilter: String /* "ENABLED" | "DISABLED" | String */
        var DenoiseFilter: String /* "ENABLED" | "DISABLED" | String */
        var FilterEnable: String /* "AUTO" | "DISABLE" | "FORCE" | String */
        var FilterStrength: __integerMinNegative5Max5?
            get() = definedExternally
            set(value) = definedExternally
        var ImageInserter: ImageInserter?
            get() = definedExternally
            set(value) = definedExternally
        var InputClippings: __listOfInputClipping?
            get() = definedExternally
            set(value) = definedExternally
        var Position: Rectangle?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramNumber: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var PsiControl: String /* "IGNORE_PSI" | "USE_PSI" | String */
        var TimecodeSource: String /* "EMBEDDED" | "ZEROBASED" | "SPECIFIEDSTART" | String */
        var TimecodeStart: __stringMin11Max11Pattern01D20305D205D?
            get() = definedExternally
            set(value) = definedExternally
        var VideoSelector: VideoSelector?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InsertableImage {
        var Duration: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var FadeIn: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var FadeOut: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var Height: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var ImageInserterInput: __stringMin14PatternS3BmpBMPPngPNGTgaTGAHttpsBmpBMPPngPNGTgaTGA?
            get() = definedExternally
            set(value) = definedExternally
        var ImageX: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var ImageY: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var Layer: __integerMin0Max99?
            get() = definedExternally
            set(value) = definedExternally
        var Opacity: __integerMin0Max100?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: __stringPattern01D20305D205D?
            get() = definedExternally
            set(value) = definedExternally
        var Width: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Job {
        var AccelerationSettings: AccelerationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var AccelerationStatus: String /* "NOT_APPLICABLE" | "IN_PROGRESS" | "ACCELERATED" | "NOT_ACCELERATED" | String */
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var BillingTagsSource: String /* "QUEUE" | "PRESET" | "JOB_TEMPLATE" | "JOB" | String */
        var CreatedAt: __timestampUnix?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentPhase: String /* "PROBING" | "TRANSCODING" | "UPLOADING" | String */
        var ErrorCode: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var JobPercentComplete: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var JobTemplate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Messages: JobMessages?
            get() = definedExternally
            set(value) = definedExternally
        var OutputGroupDetails: __listOfOutputGroupDetail?
            get() = definedExternally
            set(value) = definedExternally
        var Priority: __integerMinNegative50Max50?
            get() = definedExternally
            set(value) = definedExternally
        var Queue: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RetryCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Role: __string
        var Settings: JobSettings
        var SimulateReservedQueue: String /* "DISABLED" | "ENABLED" | String */
        var Status: String /* "SUBMITTED" | "PROGRESSING" | "COMPLETE" | "CANCELED" | "ERROR" | String */
        var StatusUpdateInterval: String /* "SECONDS_10" | "SECONDS_12" | "SECONDS_15" | "SECONDS_20" | "SECONDS_30" | "SECONDS_60" | "SECONDS_120" | "SECONDS_180" | "SECONDS_240" | "SECONDS_300" | "SECONDS_360" | "SECONDS_420" | "SECONDS_480" | "SECONDS_540" | "SECONDS_600" | String */
        var Timing: Timing?
            get() = definedExternally
            set(value) = definedExternally
        var UserMetadata: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobMessages {
        var Info: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Warning: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobSettings {
        var AdAvailOffset: __integerMinNegative1000Max1000?
            get() = definedExternally
            set(value) = definedExternally
        var AvailBlanking: AvailBlanking?
            get() = definedExternally
            set(value) = definedExternally
        var Esam: EsamSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Inputs: __listOfInput?
            get() = definedExternally
            set(value) = definedExternally
        var MotionImageInserter: MotionImageInserter?
            get() = definedExternally
            set(value) = definedExternally
        var NielsenConfiguration: NielsenConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var OutputGroups: __listOfOutputGroup?
            get() = definedExternally
            set(value) = definedExternally
        var TimecodeConfig: TimecodeConfig?
            get() = definedExternally
            set(value) = definedExternally
        var TimedMetadataInsertion: TimedMetadataInsertion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobTemplate {
        var AccelerationSettings: AccelerationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Category: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: __timestampUnix?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdated: __timestampUnix?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string
        var Priority: __integerMinNegative50Max50?
            get() = definedExternally
            set(value) = definedExternally
        var Queue: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Settings: JobTemplateSettings
        var StatusUpdateInterval: String /* "SECONDS_10" | "SECONDS_12" | "SECONDS_15" | "SECONDS_20" | "SECONDS_30" | "SECONDS_60" | "SECONDS_120" | "SECONDS_180" | "SECONDS_240" | "SECONDS_300" | "SECONDS_360" | "SECONDS_420" | "SECONDS_480" | "SECONDS_540" | "SECONDS_600" | String */
        var Type: String /* "SYSTEM" | "CUSTOM" | String */
    }
    interface JobTemplateSettings {
        var AdAvailOffset: __integerMinNegative1000Max1000?
            get() = definedExternally
            set(value) = definedExternally
        var AvailBlanking: AvailBlanking?
            get() = definedExternally
            set(value) = definedExternally
        var Esam: EsamSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Inputs: __listOfInputTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var MotionImageInserter: MotionImageInserter?
            get() = definedExternally
            set(value) = definedExternally
        var NielsenConfiguration: NielsenConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var OutputGroups: __listOfOutputGroup?
            get() = definedExternally
            set(value) = definedExternally
        var TimecodeConfig: TimecodeConfig?
            get() = definedExternally
            set(value) = definedExternally
        var TimedMetadataInsertion: TimedMetadataInsertion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobTemplatesRequest {
        var Category: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ListBy: String /* "NAME" | "CREATION_DATE" | "SYSTEM" | String */
        var MaxResults: __integerMin1Max20?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Order: String /* "ASCENDING" | "DESCENDING" | String */
    }
    interface ListJobTemplatesResponse {
        var JobTemplates: __listOfJobTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobsRequest {
        var MaxResults: __integerMin1Max20?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Order: String /* "ASCENDING" | "DESCENDING" | String */
        var Queue: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "SUBMITTED" | "PROGRESSING" | "COMPLETE" | "CANCELED" | "ERROR" | String */
    }
    interface ListJobsResponse {
        var Jobs: __listOfJob?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPresetsRequest {
        var Category: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ListBy: String /* "NAME" | "CREATION_DATE" | "SYSTEM" | String */
        var MaxResults: __integerMin1Max20?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Order: String /* "ASCENDING" | "DESCENDING" | String */
    }
    interface ListPresetsResponse {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Presets: __listOfPreset?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListQueuesRequest {
        var ListBy: String /* "NAME" | "CREATION_DATE" | String */
        var MaxResults: __integerMin1Max20?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Order: String /* "ASCENDING" | "DESCENDING" | String */
    }
    interface ListQueuesResponse {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Queues: __listOfQueue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var Arn: __string
    }
    interface ListTagsForResourceResponse {
        var ResourceTags: ResourceTags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface M2tsScte35Esam {
        var Scte35EsamPid: __integerMin32Max8182?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface M2tsSettings {
        var AudioBufferModel: String /* "DVB" | "ATSC" | String */
        var AudioFramesPerPes: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var AudioPids: __listOf__integerMin32Max8182?
            get() = definedExternally
            set(value) = definedExternally
        var Bitrate: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var BufferModel: String /* "MULTIPLEX" | "NONE" | String */
        var DvbNitSettings: DvbNitSettings?
            get() = definedExternally
            set(value) = definedExternally
        var DvbSdtSettings: DvbSdtSettings?
            get() = definedExternally
            set(value) = definedExternally
        var DvbSubPids: __listOf__integerMin32Max8182?
            get() = definedExternally
            set(value) = definedExternally
        var DvbTdtSettings: DvbTdtSettings?
            get() = definedExternally
            set(value) = definedExternally
        var DvbTeletextPid: __integerMin32Max8182?
            get() = definedExternally
            set(value) = definedExternally
        var EbpAudioInterval: String /* "VIDEO_AND_FIXED_INTERVALS" | "VIDEO_INTERVAL" | String */
        var EbpPlacement: String /* "VIDEO_AND_AUDIO_PIDS" | "VIDEO_PID" | String */
        var EsRateInPes: String /* "INCLUDE" | "EXCLUDE" | String */
        var ForceTsVideoEbpOrder: String /* "FORCE" | "DEFAULT" | String */
        var FragmentTime: __doubleMin0?
            get() = definedExternally
            set(value) = definedExternally
        var MaxPcrInterval: __integerMin0Max500?
            get() = definedExternally
            set(value) = definedExternally
        var MinEbpInterval: __integerMin0Max10000?
            get() = definedExternally
            set(value) = definedExternally
        var NielsenId3: String /* "INSERT" | "NONE" | String */
        var NullPacketBitrate: __doubleMin0?
            get() = definedExternally
            set(value) = definedExternally
        var PatInterval: __integerMin0Max1000?
            get() = definedExternally
            set(value) = definedExternally
        var PcrControl: String /* "PCR_EVERY_PES_PACKET" | "CONFIGURED_PCR_PERIOD" | String */
        var PcrPid: __integerMin32Max8182?
            get() = definedExternally
            set(value) = definedExternally
        var PmtInterval: __integerMin0Max1000?
            get() = definedExternally
            set(value) = definedExternally
        var PmtPid: __integerMin32Max8182?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateMetadataPid: __integerMin32Max8182?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramNumber: __integerMin0Max65535?
            get() = definedExternally
            set(value) = definedExternally
        var RateMode: String /* "VBR" | "CBR" | String */
        var Scte35Esam: M2tsScte35Esam?
            get() = definedExternally
            set(value) = definedExternally
        var Scte35Pid: __integerMin32Max8182?
            get() = definedExternally
            set(value) = definedExternally
        var Scte35Source: String /* "PASSTHROUGH" | "NONE" | String */
        var SegmentationMarkers: String /* "NONE" | "RAI_SEGSTART" | "RAI_ADAPT" | "PSI_SEGSTART" | "EBP" | "EBP_LEGACY" | String */
        var SegmentationStyle: String /* "MAINTAIN_CADENCE" | "RESET_CADENCE" | String */
        var SegmentationTime: __doubleMin0?
            get() = definedExternally
            set(value) = definedExternally
        var TimedMetadataPid: __integerMin32Max8182?
            get() = definedExternally
            set(value) = definedExternally
        var TransportStreamId: __integerMin0Max65535?
            get() = definedExternally
            set(value) = definedExternally
        var VideoPid: __integerMin32Max8182?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface M3u8Settings {
        var AudioFramesPerPes: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var AudioPids: __listOf__integerMin32Max8182?
            get() = definedExternally
            set(value) = definedExternally
        var NielsenId3: String /* "INSERT" | "NONE" | String */
        var PatInterval: __integerMin0Max1000?
            get() = definedExternally
            set(value) = definedExternally
        var PcrControl: String /* "PCR_EVERY_PES_PACKET" | "CONFIGURED_PCR_PERIOD" | String */
        var PcrPid: __integerMin32Max8182?
            get() = definedExternally
            set(value) = definedExternally
        var PmtInterval: __integerMin0Max1000?
            get() = definedExternally
            set(value) = definedExternally
        var PmtPid: __integerMin32Max8182?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateMetadataPid: __integerMin32Max8182?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramNumber: __integerMin0Max65535?
            get() = definedExternally
            set(value) = definedExternally
        var Scte35Pid: __integerMin32Max8182?
            get() = definedExternally
            set(value) = definedExternally
        var Scte35Source: String /* "PASSTHROUGH" | "NONE" | String */
        var TimedMetadata: String /* "PASSTHROUGH" | "NONE" | String */
        var TimedMetadataPid: __integerMin32Max8182?
            get() = definedExternally
            set(value) = definedExternally
        var TransportStreamId: __integerMin0Max65535?
            get() = definedExternally
            set(value) = definedExternally
        var VideoPid: __integerMin32Max8182?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MotionImageInserter {
        var Framerate: MotionImageInsertionFramerate?
            get() = definedExternally
            set(value) = definedExternally
        var Input: __stringMin14Max1285PatternS3Mov09PngHttpsMov09Png?
            get() = definedExternally
            set(value) = definedExternally
        var InsertionMode: String /* "MOV" | "PNG" | String */
        var Offset: MotionImageInsertionOffset?
            get() = definedExternally
            set(value) = definedExternally
        var Playback: String /* "ONCE" | "REPEAT" | String */
        var StartTime: __stringMin11Max11Pattern01D20305D205D?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MotionImageInsertionFramerate {
        var FramerateDenominator: __integerMin1Max17895697?
            get() = definedExternally
            set(value) = definedExternally
        var FramerateNumerator: __integerMin1Max2147483640?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MotionImageInsertionOffset {
        var ImageX: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var ImageY: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MovSettings {
        var ClapAtom: String /* "INCLUDE" | "EXCLUDE" | String */
        var CslgAtom: String /* "INCLUDE" | "EXCLUDE" | String */
        var Mpeg2FourCCControl: String /* "XDCAM" | "MPEG" | String */
        var PaddingControl: String /* "OMNEON" | "NONE" | String */
        var Reference: String /* "SELF_CONTAINED" | "EXTERNAL" | String */
    }
    interface Mp2Settings {
        var Bitrate: __integerMin32000Max384000?
            get() = definedExternally
            set(value) = definedExternally
        var Channels: __integerMin1Max2?
            get() = definedExternally
            set(value) = definedExternally
        var SampleRate: __integerMin32000Max48000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Mp3Settings {
        var Bitrate: __integerMin16000Max320000?
            get() = definedExternally
            set(value) = definedExternally
        var Channels: __integerMin1Max2?
            get() = definedExternally
            set(value) = definedExternally
        var RateControlMode: String /* "CBR" | "VBR" | String */
        var SampleRate: __integerMin22050Max48000?
            get() = definedExternally
            set(value) = definedExternally
        var VbrQuality: __integerMin0Max9?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Mp4Settings {
        var CslgAtom: String /* "INCLUDE" | "EXCLUDE" | String */
        var CttsVersion: __integerMin0Max1?
            get() = definedExternally
            set(value) = definedExternally
        var FreeSpaceBox: String /* "INCLUDE" | "EXCLUDE" | String */
        var MoovPlacement: String /* "PROGRESSIVE_DOWNLOAD" | "NORMAL" | String */
        var Mp4MajorBrand: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MpdSettings {
        var CaptionContainerType: String /* "RAW" | "FRAGMENTED_MP4" | String */
        var Scte35Esam: String /* "INSERT" | "NONE" | String */
        var Scte35Source: String /* "PASSTHROUGH" | "NONE" | String */
    }
    interface Mpeg2Settings {
        var AdaptiveQuantization: String /* "OFF" | "LOW" | "MEDIUM" | "HIGH" | String */
        var Bitrate: __integerMin1000Max288000000?
            get() = definedExternally
            set(value) = definedExternally
        var CodecLevel: String /* "AUTO" | "LOW" | "MAIN" | "HIGH1440" | "HIGH" | String */
        var CodecProfile: String /* "MAIN" | "PROFILE_422" | String */
        var DynamicSubGop: String /* "ADAPTIVE" | "STATIC" | String */
        var FramerateControl: String /* "INITIALIZE_FROM_SOURCE" | "SPECIFIED" | String */
        var FramerateConversionAlgorithm: String /* "DUPLICATE_DROP" | "INTERPOLATE" | String */
        var FramerateDenominator: __integerMin1Max1001?
            get() = definedExternally
            set(value) = definedExternally
        var FramerateNumerator: __integerMin24Max60000?
            get() = definedExternally
            set(value) = definedExternally
        var GopClosedCadence: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var GopSize: __doubleMin0?
            get() = definedExternally
            set(value) = definedExternally
        var GopSizeUnits: String /* "FRAMES" | "SECONDS" | String */
        var HrdBufferInitialFillPercentage: __integerMin0Max100?
            get() = definedExternally
            set(value) = definedExternally
        var HrdBufferSize: __integerMin0Max47185920?
            get() = definedExternally
            set(value) = definedExternally
        var InterlaceMode: String /* "PROGRESSIVE" | "TOP_FIELD" | "BOTTOM_FIELD" | "FOLLOW_TOP_FIELD" | "FOLLOW_BOTTOM_FIELD" | String */
        var IntraDcPrecision: String /* "AUTO" | "INTRA_DC_PRECISION_8" | "INTRA_DC_PRECISION_9" | "INTRA_DC_PRECISION_10" | "INTRA_DC_PRECISION_11" | String */
        var MaxBitrate: __integerMin1000Max300000000?
            get() = definedExternally
            set(value) = definedExternally
        var MinIInterval: __integerMin0Max30?
            get() = definedExternally
            set(value) = definedExternally
        var NumberBFramesBetweenReferenceFrames: __integerMin0Max7?
            get() = definedExternally
            set(value) = definedExternally
        var ParControl: String /* "INITIALIZE_FROM_SOURCE" | "SPECIFIED" | String */
        var ParDenominator: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var ParNumerator: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var QualityTuningLevel: String /* "SINGLE_PASS" | "MULTI_PASS" | String */
        var RateControlMode: String /* "VBR" | "CBR" | String */
        var SceneChangeDetect: String /* "DISABLED" | "ENABLED" | String */
        var SlowPal: String /* "DISABLED" | "ENABLED" | String */
        var Softness: __integerMin0Max128?
            get() = definedExternally
            set(value) = definedExternally
        var SpatialAdaptiveQuantization: String /* "DISABLED" | "ENABLED" | String */
        var Syntax: String /* "DEFAULT" | "D_10" | String */
        var Telecine: String /* "NONE" | "SOFT" | "HARD" | String */
        var TemporalAdaptiveQuantization: String /* "DISABLED" | "ENABLED" | String */
    }
    interface MsSmoothAdditionalManifest {
        var ManifestNameModifier: __stringMin1?
            get() = definedExternally
            set(value) = definedExternally
        var SelectedOutputs: __listOf__stringMin1?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MsSmoothEncryptionSettings {
        var SpekeKeyProvider: SpekeKeyProvider?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MsSmoothGroupSettings {
        var AdditionalManifests: __listOfMsSmoothAdditionalManifest?
            get() = definedExternally
            set(value) = definedExternally
        var AudioDeduplication: String /* "COMBINE_DUPLICATE_STREAMS" | "NONE" | String */
        var Destination: __stringPatternS3?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationSettings: DestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Encryption: MsSmoothEncryptionSettings?
            get() = definedExternally
            set(value) = definedExternally
        var FragmentLength: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var ManifestEncoding: String /* "UTF8" | "UTF16" | String */
    }
    interface NielsenConfiguration {
        var BreakoutCode: __integerMin0Max0?
            get() = definedExternally
            set(value) = definedExternally
        var DistributorId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NoiseReducer {
        var Filter: String /* "BILATERAL" | "MEAN" | "GAUSSIAN" | "LANCZOS" | "SHARPEN" | "CONSERVE" | "SPATIAL" | "TEMPORAL" | String */
        var FilterSettings: NoiseReducerFilterSettings?
            get() = definedExternally
            set(value) = definedExternally
        var SpatialFilterSettings: NoiseReducerSpatialFilterSettings?
            get() = definedExternally
            set(value) = definedExternally
        var TemporalFilterSettings: NoiseReducerTemporalFilterSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NoiseReducerFilterSettings {
        var Strength: __integerMin0Max3?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NoiseReducerSpatialFilterSettings {
        var PostFilterSharpenStrength: __integerMin0Max3?
            get() = definedExternally
            set(value) = definedExternally
        var Speed: __integerMinNegative2Max3?
            get() = definedExternally
            set(value) = definedExternally
        var Strength: __integerMin0Max16?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NoiseReducerTemporalFilterSettings {
        var AggressiveMode: __integerMin0Max4?
            get() = definedExternally
            set(value) = definedExternally
        var Speed: __integerMinNegative1Max3?
            get() = definedExternally
            set(value) = definedExternally
        var Strength: __integerMin0Max16?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Output {
        var AudioDescriptions: __listOfAudioDescription?
            get() = definedExternally
            set(value) = definedExternally
        var CaptionDescriptions: __listOfCaptionDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ContainerSettings: ContainerSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Extension: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NameModifier: __stringMin1?
            get() = definedExternally
            set(value) = definedExternally
        var OutputSettings: OutputSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Preset: __stringMin0?
            get() = definedExternally
            set(value) = definedExternally
        var VideoDescription: VideoDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OutputChannelMapping {
        var InputChannels: __listOf__integerMinNegative60Max6?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OutputDetail {
        var DurationInMs: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var VideoDetails: VideoDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OutputGroup {
        var CustomName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OutputGroupSettings: OutputGroupSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Outputs: __listOfOutput?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OutputGroupDetail {
        var OutputDetails: __listOfOutputDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OutputGroupSettings {
        var CmafGroupSettings: CmafGroupSettings?
            get() = definedExternally
            set(value) = definedExternally
        var DashIsoGroupSettings: DashIsoGroupSettings?
            get() = definedExternally
            set(value) = definedExternally
        var FileGroupSettings: FileGroupSettings?
            get() = definedExternally
            set(value) = definedExternally
        var HlsGroupSettings: HlsGroupSettings?
            get() = definedExternally
            set(value) = definedExternally
        var MsSmoothGroupSettings: MsSmoothGroupSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "HLS_GROUP_SETTINGS" | "DASH_ISO_GROUP_SETTINGS" | "FILE_GROUP_SETTINGS" | "MS_SMOOTH_GROUP_SETTINGS" | "CMAF_GROUP_SETTINGS" | String */
    }
    interface OutputSettings {
        var HlsSettings: HlsSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Preset {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Category: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: __timestampUnix?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdated: __timestampUnix?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string
        var Settings: PresetSettings
        var Type: String /* "SYSTEM" | "CUSTOM" | String */
    }
    interface PresetSettings {
        var AudioDescriptions: __listOfAudioDescription?
            get() = definedExternally
            set(value) = definedExternally
        var CaptionDescriptions: __listOfCaptionDescriptionPreset?
            get() = definedExternally
            set(value) = definedExternally
        var ContainerSettings: ContainerSettings?
            get() = definedExternally
            set(value) = definedExternally
        var VideoDescription: VideoDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProresSettings {
        var CodecProfile: String /* "APPLE_PRORES_422" | "APPLE_PRORES_422_HQ" | "APPLE_PRORES_422_LT" | "APPLE_PRORES_422_PROXY" | String */
        var FramerateControl: String /* "INITIALIZE_FROM_SOURCE" | "SPECIFIED" | String */
        var FramerateConversionAlgorithm: String /* "DUPLICATE_DROP" | "INTERPOLATE" | String */
        var FramerateDenominator: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var FramerateNumerator: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var InterlaceMode: String /* "PROGRESSIVE" | "TOP_FIELD" | "BOTTOM_FIELD" | "FOLLOW_TOP_FIELD" | "FOLLOW_BOTTOM_FIELD" | String */
        var ParControl: String /* "INITIALIZE_FROM_SOURCE" | "SPECIFIED" | String */
        var ParDenominator: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var ParNumerator: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var SlowPal: String /* "DISABLED" | "ENABLED" | String */
        var Telecine: String /* "NONE" | "HARD" | String */
    }
    interface Queue {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: __timestampUnix?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdated: __timestampUnix?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string
        var PricingPlan: String /* "ON_DEMAND" | "RESERVED" | String */
        var ProgressingJobsCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var ReservationPlan: ReservationPlan?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "ACTIVE" | "PAUSED" | String */
        var SubmittedJobsCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "SYSTEM" | "CUSTOM" | String */
    }
    interface Rectangle {
        var Height: __integerMin2Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var Width: __integerMin2Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var X: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var Y: __integerMin0Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemixSettings {
        var ChannelMapping: ChannelMapping?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelsIn: __integerMin1Max64?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelsOut: __integerMin1Max64?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReservationPlan {
        var Commitment: String /* "ONE_YEAR" | String */
        var ExpiresAt: __timestampUnix?
            get() = definedExternally
            set(value) = definedExternally
        var PurchasedAt: __timestampUnix?
            get() = definedExternally
            set(value) = definedExternally
        var RenewalType: String /* "AUTO_RENEW" | "EXPIRE" | String */
        var ReservedSlots: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "ACTIVE" | "EXPIRED" | String */
    }
    interface ReservationPlanSettings {
        var Commitment: String /* "ONE_YEAR" | String */
        var RenewalType: String /* "AUTO_RENEW" | "EXPIRE" | String */
        var ReservedSlots: __integer
    }
    interface ResourceTags {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3DestinationAccessControl {
        var CannedAcl: String /* "PUBLIC_READ" | "AUTHENTICATED_READ" | "BUCKET_OWNER_READ" | "BUCKET_OWNER_FULL_CONTROL" | String */
    }
    interface S3DestinationSettings {
        var AccessControl: S3DestinationAccessControl?
            get() = definedExternally
            set(value) = definedExternally
        var Encryption: S3EncryptionSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3EncryptionSettings {
        var EncryptionType: String /* "SERVER_SIDE_ENCRYPTION_S3" | "SERVER_SIDE_ENCRYPTION_KMS" | String */
        var KmsKeyArn: __stringPatternArnAwsUsGovCnKmsAZ26EastWestCentralNorthSouthEastWest1912D12KeyAFAF098AFAF094AFAF094AFAF094AFAF0912?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SccDestinationSettings {
        var Framerate: String /* "FRAMERATE_23_97" | "FRAMERATE_24" | "FRAMERATE_25" | "FRAMERATE_29_97_DROPFRAME" | "FRAMERATE_29_97_NON_DROPFRAME" | String */
    }
    interface SpekeKeyProvider {
        var CertificateArn: __stringPatternArnAwsUsGovAcm?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SystemIds: __listOf__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __stringPatternHttps?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SpekeKeyProviderCmaf {
        var CertificateArn: __stringPatternArnAwsUsGovAcm?
            get() = definedExternally
            set(value) = definedExternally
        var DashSignaledSystemIds: __listOf__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12?
            get() = definedExternally
            set(value) = definedExternally
        var HlsSignaledSystemIds: __listOf__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: __stringPatternW?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __stringPatternHttps?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StaticKeyProvider {
        var KeyFormat: __stringPatternIdentityAZaZ26AZaZ09163?
            get() = definedExternally
            set(value) = definedExternally
        var KeyFormatVersions: __stringPatternDD?
            get() = definedExternally
            set(value) = definedExternally
        var StaticKeyValue: __stringPatternAZaZ0932?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var Arn: __string
        var Tags: __mapOf__string
    }
    interface TagResourceResponse
    interface TeletextDestinationSettings {
        var PageNumber: __stringMin3Max3Pattern1809aFAF09aEAE?
            get() = definedExternally
            set(value) = definedExternally
        var PageTypes: __listOfTeletextPageType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TeletextSourceSettings {
        var PageNumber: __stringMin3Max3Pattern1809aFAF09aEAE?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TimecodeBurnin {
        var FontSize: __integerMin10Max48?
            get() = definedExternally
            set(value) = definedExternally
        var Position: String /* "TOP_CENTER" | "TOP_LEFT" | "TOP_RIGHT" | "MIDDLE_LEFT" | "MIDDLE_CENTER" | "MIDDLE_RIGHT" | "BOTTOM_LEFT" | "BOTTOM_CENTER" | "BOTTOM_RIGHT" | String */
        var Prefix: __stringPattern?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TimecodeConfig {
        var Anchor: __stringPattern010920405090509092?
            get() = definedExternally
            set(value) = definedExternally
        var Source: String /* "EMBEDDED" | "ZEROBASED" | "SPECIFIEDSTART" | String */
        var Start: __stringPattern010920405090509092?
            get() = definedExternally
            set(value) = definedExternally
        var TimestampOffset: __stringPattern0940191020191209301?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TimedMetadataInsertion {
        var Id3Insertions: __listOfId3Insertion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Timing {
        var FinishTime: __timestampUnix?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: __timestampUnix?
            get() = definedExternally
            set(value) = definedExternally
        var SubmitTime: __timestampUnix?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrackSourceSettings {
        var TrackNumber: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TtmlDestinationSettings {
        var StylePassthrough: String /* "ENABLED" | "DISABLED" | String */
    }
    interface UntagResourceRequest {
        var Arn: __string
        var TagKeys: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceResponse
    interface UpdateJobTemplateRequest {
        var AccelerationSettings: AccelerationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Category: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string
        var Priority: __integerMinNegative50Max50?
            get() = definedExternally
            set(value) = definedExternally
        var Queue: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Settings: JobTemplateSettings?
            get() = definedExternally
            set(value) = definedExternally
        var StatusUpdateInterval: String /* "SECONDS_10" | "SECONDS_12" | "SECONDS_15" | "SECONDS_20" | "SECONDS_30" | "SECONDS_60" | "SECONDS_120" | "SECONDS_180" | "SECONDS_240" | "SECONDS_300" | "SECONDS_360" | "SECONDS_420" | "SECONDS_480" | "SECONDS_540" | "SECONDS_600" | String */
    }
    interface UpdateJobTemplateResponse {
        var JobTemplate: JobTemplate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdatePresetRequest {
        var Category: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string
        var Settings: PresetSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdatePresetResponse {
        var Preset: Preset?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateQueueRequest {
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string
        var ReservationPlanSettings: ReservationPlanSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "ACTIVE" | "PAUSED" | String */
    }
    interface UpdateQueueResponse {
        var Queue: Queue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VideoCodecSettings {
        var Av1Settings: Av1Settings?
            get() = definedExternally
            set(value) = definedExternally
        var Codec: String /* "FRAME_CAPTURE" | "AV1" | "H_264" | "H_265" | "MPEG2" | "PRORES" | String */
        var FrameCaptureSettings: FrameCaptureSettings?
            get() = definedExternally
            set(value) = definedExternally
        var H264Settings: H264Settings?
            get() = definedExternally
            set(value) = definedExternally
        var H265Settings: H265Settings?
            get() = definedExternally
            set(value) = definedExternally
        var Mpeg2Settings: Mpeg2Settings?
            get() = definedExternally
            set(value) = definedExternally
        var ProresSettings: ProresSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VideoDescription {
        var AfdSignaling: String /* "NONE" | "AUTO" | "FIXED" | String */
        var AntiAlias: String /* "DISABLED" | "ENABLED" | String */
        var CodecSettings: VideoCodecSettings?
            get() = definedExternally
            set(value) = definedExternally
        var ColorMetadata: String /* "IGNORE" | "INSERT" | String */
        var Crop: Rectangle?
            get() = definedExternally
            set(value) = definedExternally
        var DropFrameTimecode: String /* "DISABLED" | "ENABLED" | String */
        var FixedAfd: __integerMin0Max15?
            get() = definedExternally
            set(value) = definedExternally
        var Height: __integerMin32Max8192?
            get() = definedExternally
            set(value) = definedExternally
        var Position: Rectangle?
            get() = definedExternally
            set(value) = definedExternally
        var RespondToAfd: String /* "NONE" | "RESPOND" | "PASSTHROUGH" | String */
        var ScalingBehavior: String /* "DEFAULT" | "STRETCH_TO_OUTPUT" | String */
        var Sharpness: __integerMin0Max100?
            get() = definedExternally
            set(value) = definedExternally
        var TimecodeInsertion: String /* "DISABLED" | "PIC_TIMING_SEI" | String */
        var VideoPreprocessors: VideoPreprocessor?
            get() = definedExternally
            set(value) = definedExternally
        var Width: __integerMin32Max8192?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VideoDetail {
        var HeightInPx: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var WidthInPx: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VideoPreprocessor {
        var ColorCorrector: ColorCorrector?
            get() = definedExternally
            set(value) = definedExternally
        var Deinterlacer: Deinterlacer?
            get() = definedExternally
            set(value) = definedExternally
        var DolbyVision: DolbyVision?
            get() = definedExternally
            set(value) = definedExternally
        var ImageInserter: ImageInserter?
            get() = definedExternally
            set(value) = definedExternally
        var NoiseReducer: NoiseReducer?
            get() = definedExternally
            set(value) = definedExternally
        var TimecodeBurnin: TimecodeBurnin?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VideoSelector {
        var AlphaBehavior: String /* "DISCARD" | "REMAP_TO_LUMA" | String */
        var ColorSpace: String /* "FOLLOW" | "REC_601" | "REC_709" | "HDR10" | "HLG_2020" | String */
        var ColorSpaceUsage: String /* "FORCE" | "FALLBACK" | String */
        var Hdr10Metadata: Hdr10Metadata?
            get() = definedExternally
            set(value) = definedExternally
        var Pid: __integerMin1Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramNumber: __integerMinNegative2147483648Max2147483647?
            get() = definedExternally
            set(value) = definedExternally
        var Rotate: String /* "DEGREE_0" | "DEGREES_90" | "DEGREES_180" | "DEGREES_270" | "AUTO" | String */
    }
    interface WavSettings {
        var BitDepth: __integerMin16Max24?
            get() = definedExternally
            set(value) = definedExternally
        var Channels: __integerMin1Max64?
            get() = definedExternally
            set(value) = definedExternally
        var Format: String /* "RIFF" | "RF64" | String */
        var SampleRate: __integerMin8000Max192000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface __mapOfAudioSelector {
        @nativeGetter
        operator fun get(key: String): AudioSelector?
        @nativeSetter
        operator fun set(key: String, value: AudioSelector)
    }
    interface __mapOfAudioSelectorGroup {
        @nativeGetter
        operator fun get(key: String): AudioSelectorGroup?
        @nativeSetter
        operator fun set(key: String, value: AudioSelectorGroup)
    }
    interface __mapOfCaptionSelector {
        @nativeGetter
        operator fun get(key: String): CaptionSelector?
        @nativeSetter
        operator fun set(key: String, value: CaptionSelector)
    }
    interface __mapOf__string {
        @nativeGetter
        operator fun get(key: String): __string?
        @nativeSetter
        operator fun set(key: String, value: __string)
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-08-29" | "latest" | String */
    }
}