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
import MediaLive.AudioChannelMapping
import MediaLive.AudioDescription
import MediaLive.AudioSelector
import MediaLive.CaptionDescription
import MediaLive.CaptionLanguageMapping
import MediaLive.CaptionSelector
import MediaLive.ChannelEgressEndpoint
import MediaLive.ChannelSummary
import MediaLive.Input
import MediaLive.InputAttachment
import MediaLive.InputChannelLevel
import MediaLive.InputDestination
import MediaLive.InputDestinationRequest
import MediaLive.InputSecurityGroup
import MediaLive.InputSource
import MediaLive.InputSourceRequest
import MediaLive.InputWhitelistRule
import MediaLive.InputWhitelistRuleCidr
import MediaLive.MediaConnectFlow
import MediaLive.MediaConnectFlowRequest
import MediaLive.MediaPackageOutputDestinationSettings
import MediaLive.MultiplexOutputDestination
import MediaLive.MultiplexProgramSummary
import MediaLive.MultiplexSummary
import MediaLive.Offering
import MediaLive.Output
import MediaLive.OutputDestination
import MediaLive.OutputDestinationSettings
import MediaLive.OutputGroup
import MediaLive.PipelineDetail
import MediaLive.PipelinePauseStateSettings
import MediaLive.Reservation
import MediaLive.ScheduleAction
import MediaLive.Scte35Descriptor
import MediaLive.VideoDescription
import MediaLive.BatchUpdateScheduleRequest
import MediaLive.BatchUpdateScheduleResponse
import MediaLive.CreateChannelRequest
import MediaLive.CreateChannelResponse
import MediaLive.CreateInputRequest
import MediaLive.CreateInputResponse
import MediaLive.CreateInputSecurityGroupRequest
import MediaLive.CreateInputSecurityGroupResponse
import MediaLive.CreateMultiplexRequest
import MediaLive.CreateMultiplexResponse
import MediaLive.CreateMultiplexProgramRequest
import MediaLive.CreateMultiplexProgramResponse
import MediaLive.CreateTagsRequest
import MediaLive.DeleteChannelRequest
import MediaLive.DeleteChannelResponse
import MediaLive.DeleteInputRequest
import MediaLive.DeleteInputResponse
import MediaLive.DeleteInputSecurityGroupRequest
import MediaLive.DeleteInputSecurityGroupResponse
import MediaLive.DeleteMultiplexRequest
import MediaLive.DeleteMultiplexResponse
import MediaLive.DeleteMultiplexProgramRequest
import MediaLive.DeleteMultiplexProgramResponse
import MediaLive.DeleteReservationRequest
import MediaLive.DeleteReservationResponse
import MediaLive.DeleteScheduleRequest
import MediaLive.DeleteScheduleResponse
import MediaLive.DeleteTagsRequest
import MediaLive.DescribeChannelRequest
import MediaLive.DescribeChannelResponse
import MediaLive.DescribeInputRequest
import MediaLive.DescribeInputResponse
import MediaLive.DescribeInputSecurityGroupRequest
import MediaLive.DescribeInputSecurityGroupResponse
import MediaLive.DescribeMultiplexRequest
import MediaLive.DescribeMultiplexResponse
import MediaLive.DescribeMultiplexProgramRequest
import MediaLive.DescribeMultiplexProgramResponse
import MediaLive.DescribeOfferingRequest
import MediaLive.DescribeOfferingResponse
import MediaLive.DescribeReservationRequest
import MediaLive.DescribeReservationResponse
import MediaLive.DescribeScheduleRequest
import MediaLive.DescribeScheduleResponse
import MediaLive.ListChannelsRequest
import MediaLive.ListChannelsResponse
import MediaLive.ListInputSecurityGroupsRequest
import MediaLive.ListInputSecurityGroupsResponse
import MediaLive.ListInputsRequest
import MediaLive.ListInputsResponse
import MediaLive.ListMultiplexProgramsRequest
import MediaLive.ListMultiplexProgramsResponse
import MediaLive.ListMultiplexesRequest
import MediaLive.ListMultiplexesResponse
import MediaLive.ListOfferingsRequest
import MediaLive.ListOfferingsResponse
import MediaLive.ListReservationsRequest
import MediaLive.ListReservationsResponse
import MediaLive.ListTagsForResourceRequest
import MediaLive.ListTagsForResourceResponse
import MediaLive.PurchaseOfferingRequest
import MediaLive.PurchaseOfferingResponse
import MediaLive.StartChannelRequest
import MediaLive.StartChannelResponse
import MediaLive.StartMultiplexRequest
import MediaLive.StartMultiplexResponse
import MediaLive.StopChannelRequest
import MediaLive.StopChannelResponse
import MediaLive.StopMultiplexRequest
import MediaLive.StopMultiplexResponse
import MediaLive.UpdateChannelRequest
import MediaLive.UpdateChannelResponse
import MediaLive.UpdateChannelClassRequest
import MediaLive.UpdateChannelClassResponse
import MediaLive.UpdateInputRequest
import MediaLive.UpdateInputResponse
import MediaLive.UpdateInputSecurityGroupRequest
import MediaLive.UpdateInputSecurityGroupResponse
import MediaLive.UpdateMultiplexRequest
import MediaLive.UpdateMultiplexResponse
import MediaLive.UpdateMultiplexProgramRequest
import MediaLive.UpdateMultiplexProgramResponse
import MediaLive.UpdateReservationRequest
import MediaLive.UpdateReservationResponse
import MediaLive.M2tsSettings
import MediaLive.OutputLocationRef
import MediaLive.ArchiveContainerSettings
import MediaLive.AacSettings
import MediaLive.Ac3Settings
import MediaLive.Eac3Settings
import MediaLive.Mp2Settings
import MediaLive.PassThroughSettings
import MediaLive.AudioNormalizationSettings
import MediaLive.AudioCodecSettings
import MediaLive.RemixSettings
import MediaLive.InputLocation
import MediaLive.AudioSelectorSettings
import MediaLive.AudioLanguageSelection
import MediaLive.AudioPidSelection
import MediaLive.AvailSettings
import MediaLive.Scte35SpliceInsert
import MediaLive.Scte35TimeSignalApos
import MediaLive.BatchScheduleActionCreateRequest
import MediaLive.BatchScheduleActionDeleteRequest
import MediaLive.BatchScheduleActionCreateResult
import MediaLive.BatchScheduleActionDeleteResult
import MediaLive.CaptionDestinationSettings
import MediaLive.AribDestinationSettings
import MediaLive.BurnInDestinationSettings
import MediaLive.DvbSubDestinationSettings
import MediaLive.EmbeddedDestinationSettings
import MediaLive.EmbeddedPlusScte20DestinationSettings
import MediaLive.RtmpCaptionInfoDestinationSettings
import MediaLive.Scte20PlusEmbeddedDestinationSettings
import MediaLive.Scte27DestinationSettings
import MediaLive.SmpteTtDestinationSettings
import MediaLive.TeletextDestinationSettings
import MediaLive.TtmlDestinationSettings
import MediaLive.WebvttDestinationSettings
import MediaLive.CaptionSelectorSettings
import MediaLive.AribSourceSettings
import MediaLive.DvbSubSourceSettings
import MediaLive.EmbeddedSourceSettings
import MediaLive.Scte20SourceSettings
import MediaLive.Scte27SourceSettings
import MediaLive.TeletextSourceSettings
import MediaLive.EncoderSettings
import MediaLive.InputSpecification
import MediaLive.Tags
import MediaLive.Channel
import MediaLive.InputVpcRequest
import MediaLive.MultiplexProgramSettings
import MediaLive.MultiplexProgram
import MediaLive.MultiplexSettings
import MediaLive.Multiplex
import MediaLive.MultiplexProgramPacketIdentifiersMap
import MediaLive.ReservationResourceSpecification
import MediaLive.AvailBlanking
import MediaLive.AvailConfiguration
import MediaLive.BlackoutSlate
import MediaLive.GlobalConfiguration
import MediaLive.NielsenConfiguration
import MediaLive.TimecodeConfig
import MediaLive.InputLossBehavior
import MediaLive.ColorSpacePassthroughSettings
import MediaLive.Rec601Settings
import MediaLive.Rec709Settings
import MediaLive.H264ColorSpaceSettings
import MediaLive.Hdr10Settings
import MediaLive.H265ColorSpaceSettings
import MediaLive.HlsAkamaiSettings
import MediaLive.HlsBasicPutSettings
import MediaLive.HlsMediaStoreSettings
import MediaLive.HlsWebdavSettings
import MediaLive.HlsCdnSettings
import MediaLive.KeyProviderSettings
import MediaLive.HlsSettings
import MediaLive.AudioOnlyHlsSettings
import MediaLive.Fmp4HlsSettings
import MediaLive.StandardHlsSettings
import MediaLive.InputSettings
import MediaLive.StartTimecode
import MediaLive.StopTimecode
import MediaLive.InputDestinationVpc
import MediaLive.NetworkInputSettings
import MediaLive.VideoSelector
import MediaLive.InputClippingSettings
import MediaLive.StaticKeySettings
import MediaLive.DvbNitSettings
import MediaLive.DvbSdtSettings
import MediaLive.DvbTdtSettings
import MediaLive.MultiplexMediaConnectOutputDestinationSettings
import MediaLive.MultiplexProgramServiceDescriptor
import MediaLive.MultiplexVideoSettings
import MediaLive.MultiplexSettingsSummary
import MediaLive.MultiplexStatmuxVideoSettings
import MediaLive.HlsInputSettings
import MediaLive.OutputSettings
import MediaLive.MultiplexProgramChannelDestinationSettings
import MediaLive.OutputGroupSettings
import MediaLive.ArchiveGroupSettings
import MediaLive.FrameCaptureGroupSettings
import MediaLive.HlsGroupSettings
import MediaLive.MediaPackageGroupSettings
import MediaLive.MsSmoothGroupSettings
import MediaLive.MultiplexGroupSettings
import MediaLive.RtmpGroupSettings
import MediaLive.UdpGroupSettings
import MediaLive.ArchiveOutputSettings
import MediaLive.FrameCaptureOutputSettings
import MediaLive.HlsOutputSettings
import MediaLive.MediaPackageOutputSettings
import MediaLive.MsSmoothOutputSettings
import MediaLive.MultiplexOutputSettings
import MediaLive.RtmpOutputSettings
import MediaLive.UdpOutputSettings
import MediaLive.ScheduleActionSettings
import MediaLive.ScheduleActionStartSettings
import MediaLive.HlsId3SegmentTaggingScheduleActionSettings
import MediaLive.HlsTimedMetadataScheduleActionSettings
import MediaLive.InputSwitchScheduleActionSettings
import MediaLive.PauseStateScheduleActionSettings
import MediaLive.Scte35ReturnToNetworkScheduleActionSettings
import MediaLive.Scte35SpliceInsertScheduleActionSettings
import MediaLive.Scte35TimeSignalScheduleActionSettings
import MediaLive.StaticImageActivateScheduleActionSettings
import MediaLive.StaticImageDeactivateScheduleActionSettings
import MediaLive.FixedModeScheduleActionStartSettings
import MediaLive.FollowModeScheduleActionStartSettings
import MediaLive.ImmediateModeScheduleActionStartSettings
import MediaLive.Scte35DescriptorSettings
import MediaLive.Scte35SegmentationDescriptor
import MediaLive.Scte35DeliveryRestrictions
import MediaLive.M3u8Settings
import MediaLive.UdpContainerSettings
import MediaLive.FecOutputSettings
import MediaLive.FrameCaptureSettings
import MediaLive.H264Settings
import MediaLive.H265Settings
import MediaLive.VideoCodecSettings
import MediaLive.VideoSelectorSettings
import MediaLive.VideoSelectorPid
import MediaLive.VideoSelectorProgramId

typealias MaxResults = Number

typealias __double = Number

typealias __doubleMin0 = Number

typealias __doubleMin1 = Number

typealias __doubleMinNegative59Max0 = Number

typealias __integer = Number

typealias __integerMin0 = Number

typealias __integerMin0Max10 = Number

typealias __integerMin0Max100 = Number

typealias __integerMin0Max1000 = Number

typealias __integerMin0Max10000 = Number

typealias __integerMin0Max1000000 = Number

typealias __integerMin0Max100000000 = Number

typealias __integerMin0Max128 = Number

typealias __integerMin0Max15 = Number

typealias __integerMin0Max255 = Number

typealias __integerMin0Max30 = Number

typealias __integerMin0Max32768 = Number

typealias __integerMin0Max3600 = Number

typealias __integerMin0Max500 = Number

typealias __integerMin0Max600 = Number

typealias __integerMin0Max65535 = Number

typealias __integerMin0Max65536 = Number

typealias __integerMin0Max7 = Number

typealias __integerMin0Max8191 = Number

typealias __integerMin1 = Number

typealias __integerMin1000 = Number

typealias __integerMin1000000Max100000000 = Number

typealias __integerMin100000Max100000000 = Number

typealias __integerMin100000Max40000000 = Number

typealias __integerMin100000Max80000000 = Number

typealias __integerMin1000Max3000 = Number

typealias __integerMin1000Max30000 = Number

typealias __integerMin1Max10 = Number

typealias __integerMin1Max1000000 = Number

typealias __integerMin1Max16 = Number

typealias __integerMin1Max20 = Number

typealias __integerMin1Max3003 = Number

typealias __integerMin1Max31 = Number

typealias __integerMin1Max32 = Number

typealias __integerMin1Max3600000 = Number

typealias __integerMin1Max4 = Number

typealias __integerMin1Max5 = Number

typealias __integerMin1Max6 = Number

typealias __integerMin1Max8 = Number

typealias __integerMin25Max10000 = Number

typealias __integerMin25Max2000 = Number

typealias __integerMin3 = Number

typealias __integerMin30 = Number

typealias __integerMin4Max20 = Number

typealias __integerMin96Max600 = Number

typealias __integerMinNegative1000Max1000 = Number

typealias __integerMinNegative60Max6 = Number

typealias __integerMinNegative60Max60 = Number

typealias __listOfAudioChannelMapping = Array<AudioChannelMapping>

typealias __listOfAudioDescription = Array<AudioDescription>

typealias __listOfAudioSelector = Array<AudioSelector>

typealias __listOfCaptionDescription = Array<CaptionDescription>

typealias __listOfCaptionLanguageMapping = Array<CaptionLanguageMapping>

typealias __listOfCaptionSelector = Array<CaptionSelector>

typealias __listOfChannelEgressEndpoint = Array<ChannelEgressEndpoint>

typealias __listOfChannelSummary = Array<ChannelSummary>

typealias __listOfHlsAdMarkers = Array<String /* "ADOBE" | "ELEMENTAL" | "ELEMENTAL_SCTE35" | String */>

typealias __listOfInput = Array<Input>

typealias __listOfInputAttachment = Array<InputAttachment>

typealias __listOfInputChannelLevel = Array<InputChannelLevel>

typealias __listOfInputDestination = Array<InputDestination>

typealias __listOfInputDestinationRequest = Array<InputDestinationRequest>

typealias __listOfInputSecurityGroup = Array<InputSecurityGroup>

typealias __listOfInputSource = Array<InputSource>

typealias __listOfInputSourceRequest = Array<InputSourceRequest>

typealias __listOfInputWhitelistRule = Array<InputWhitelistRule>

typealias __listOfInputWhitelistRuleCidr = Array<InputWhitelistRuleCidr>

typealias __listOfMediaConnectFlow = Array<MediaConnectFlow>

typealias __listOfMediaConnectFlowRequest = Array<MediaConnectFlowRequest>

typealias __listOfMediaPackageOutputDestinationSettings = Array<MediaPackageOutputDestinationSettings>

typealias __listOfMultiplexOutputDestination = Array<MultiplexOutputDestination>

typealias __listOfMultiplexProgramSummary = Array<MultiplexProgramSummary>

typealias __listOfMultiplexSummary = Array<MultiplexSummary>

typealias __listOfOffering = Array<Offering>

typealias __listOfOutput = Array<Output>

typealias __listOfOutputDestination = Array<OutputDestination>

typealias __listOfOutputDestinationSettings = Array<OutputDestinationSettings>

typealias __listOfOutputGroup = Array<OutputGroup>

typealias __listOfPipelineDetail = Array<PipelineDetail>

typealias __listOfPipelinePauseStateSettings = Array<PipelinePauseStateSettings>

typealias __listOfReservation = Array<Reservation>

typealias __listOfScheduleAction = Array<ScheduleAction>

typealias __listOfScte35Descriptor = Array<Scte35Descriptor>

typealias __listOfVideoDescription = Array<VideoDescription>

typealias __listOf__integer = Array<__integer>

typealias __listOf__string = Array<__string>

typealias __longMin0Max1099511627775 = Number

typealias __longMin0Max4294967295 = Number

typealias __longMin0Max8589934591 = Number

typealias __string = String

typealias __stringMax256 = String

typealias __stringMax32 = String

typealias __stringMin1 = String

typealias __stringMin1Max255 = String

typealias __stringMin1Max256 = String

typealias __stringMin32Max32 = String

typealias __stringMin34Max34 = String

typealias __stringMin3Max3 = String

typealias __stringMin6Max6 = String

@JsModule("aws-sdk")
external open class MediaLive(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & MediaLive.Types.ClientConfiguration */
    open fun batchUpdateSchedule(params: BatchUpdateScheduleRequest, callback: (err: AWSError, data: BatchUpdateScheduleResponse) -> Unit = definedExternally): Request<BatchUpdateScheduleResponse, AWSError>
    open fun batchUpdateSchedule(callback: (err: AWSError, data: BatchUpdateScheduleResponse) -> Unit = definedExternally): Request<BatchUpdateScheduleResponse, AWSError>
    open fun createChannel(params: CreateChannelRequest, callback: (err: AWSError, data: CreateChannelResponse) -> Unit = definedExternally): Request<CreateChannelResponse, AWSError>
    open fun createChannel(callback: (err: AWSError, data: CreateChannelResponse) -> Unit = definedExternally): Request<CreateChannelResponse, AWSError>
    open fun createInput(params: CreateInputRequest, callback: (err: AWSError, data: CreateInputResponse) -> Unit = definedExternally): Request<CreateInputResponse, AWSError>
    open fun createInput(callback: (err: AWSError, data: CreateInputResponse) -> Unit = definedExternally): Request<CreateInputResponse, AWSError>
    open fun createInputSecurityGroup(params: CreateInputSecurityGroupRequest, callback: (err: AWSError, data: CreateInputSecurityGroupResponse) -> Unit = definedExternally): Request<CreateInputSecurityGroupResponse, AWSError>
    open fun createInputSecurityGroup(callback: (err: AWSError, data: CreateInputSecurityGroupResponse) -> Unit = definedExternally): Request<CreateInputSecurityGroupResponse, AWSError>
    open fun createMultiplex(params: CreateMultiplexRequest, callback: (err: AWSError, data: CreateMultiplexResponse) -> Unit = definedExternally): Request<CreateMultiplexResponse, AWSError>
    open fun createMultiplex(callback: (err: AWSError, data: CreateMultiplexResponse) -> Unit = definedExternally): Request<CreateMultiplexResponse, AWSError>
    open fun createMultiplexProgram(params: CreateMultiplexProgramRequest, callback: (err: AWSError, data: CreateMultiplexProgramResponse) -> Unit = definedExternally): Request<CreateMultiplexProgramResponse, AWSError>
    open fun createMultiplexProgram(callback: (err: AWSError, data: CreateMultiplexProgramResponse) -> Unit = definedExternally): Request<CreateMultiplexProgramResponse, AWSError>
    open fun createTags(params: CreateTagsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createTags(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteChannel(params: DeleteChannelRequest, callback: (err: AWSError, data: DeleteChannelResponse) -> Unit = definedExternally): Request<DeleteChannelResponse, AWSError>
    open fun deleteChannel(callback: (err: AWSError, data: DeleteChannelResponse) -> Unit = definedExternally): Request<DeleteChannelResponse, AWSError>
    open fun deleteInput(params: DeleteInputRequest, callback: (err: AWSError, data: DeleteInputResponse) -> Unit = definedExternally): Request<DeleteInputResponse, AWSError>
    open fun deleteInput(callback: (err: AWSError, data: DeleteInputResponse) -> Unit = definedExternally): Request<DeleteInputResponse, AWSError>
    open fun deleteInputSecurityGroup(params: DeleteInputSecurityGroupRequest, callback: (err: AWSError, data: DeleteInputSecurityGroupResponse) -> Unit = definedExternally): Request<DeleteInputSecurityGroupResponse, AWSError>
    open fun deleteInputSecurityGroup(callback: (err: AWSError, data: DeleteInputSecurityGroupResponse) -> Unit = definedExternally): Request<DeleteInputSecurityGroupResponse, AWSError>
    open fun deleteMultiplex(params: DeleteMultiplexRequest, callback: (err: AWSError, data: DeleteMultiplexResponse) -> Unit = definedExternally): Request<DeleteMultiplexResponse, AWSError>
    open fun deleteMultiplex(callback: (err: AWSError, data: DeleteMultiplexResponse) -> Unit = definedExternally): Request<DeleteMultiplexResponse, AWSError>
    open fun deleteMultiplexProgram(params: DeleteMultiplexProgramRequest, callback: (err: AWSError, data: DeleteMultiplexProgramResponse) -> Unit = definedExternally): Request<DeleteMultiplexProgramResponse, AWSError>
    open fun deleteMultiplexProgram(callback: (err: AWSError, data: DeleteMultiplexProgramResponse) -> Unit = definedExternally): Request<DeleteMultiplexProgramResponse, AWSError>
    open fun deleteReservation(params: DeleteReservationRequest, callback: (err: AWSError, data: DeleteReservationResponse) -> Unit = definedExternally): Request<DeleteReservationResponse, AWSError>
    open fun deleteReservation(callback: (err: AWSError, data: DeleteReservationResponse) -> Unit = definedExternally): Request<DeleteReservationResponse, AWSError>
    open fun deleteSchedule(params: DeleteScheduleRequest, callback: (err: AWSError, data: DeleteScheduleResponse) -> Unit = definedExternally): Request<DeleteScheduleResponse, AWSError>
    open fun deleteSchedule(callback: (err: AWSError, data: DeleteScheduleResponse) -> Unit = definedExternally): Request<DeleteScheduleResponse, AWSError>
    open fun deleteTags(params: DeleteTagsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteTags(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeChannel(params: DescribeChannelRequest, callback: (err: AWSError, data: DescribeChannelResponse) -> Unit = definedExternally): Request<DescribeChannelResponse, AWSError>
    open fun describeChannel(callback: (err: AWSError, data: DescribeChannelResponse) -> Unit = definedExternally): Request<DescribeChannelResponse, AWSError>
    open fun describeInput(params: DescribeInputRequest, callback: (err: AWSError, data: DescribeInputResponse) -> Unit = definedExternally): Request<DescribeInputResponse, AWSError>
    open fun describeInput(callback: (err: AWSError, data: DescribeInputResponse) -> Unit = definedExternally): Request<DescribeInputResponse, AWSError>
    open fun describeInputSecurityGroup(params: DescribeInputSecurityGroupRequest, callback: (err: AWSError, data: DescribeInputSecurityGroupResponse) -> Unit = definedExternally): Request<DescribeInputSecurityGroupResponse, AWSError>
    open fun describeInputSecurityGroup(callback: (err: AWSError, data: DescribeInputSecurityGroupResponse) -> Unit = definedExternally): Request<DescribeInputSecurityGroupResponse, AWSError>
    open fun describeMultiplex(params: DescribeMultiplexRequest, callback: (err: AWSError, data: DescribeMultiplexResponse) -> Unit = definedExternally): Request<DescribeMultiplexResponse, AWSError>
    open fun describeMultiplex(callback: (err: AWSError, data: DescribeMultiplexResponse) -> Unit = definedExternally): Request<DescribeMultiplexResponse, AWSError>
    open fun describeMultiplexProgram(params: DescribeMultiplexProgramRequest, callback: (err: AWSError, data: DescribeMultiplexProgramResponse) -> Unit = definedExternally): Request<DescribeMultiplexProgramResponse, AWSError>
    open fun describeMultiplexProgram(callback: (err: AWSError, data: DescribeMultiplexProgramResponse) -> Unit = definedExternally): Request<DescribeMultiplexProgramResponse, AWSError>
    open fun describeOffering(params: DescribeOfferingRequest, callback: (err: AWSError, data: DescribeOfferingResponse) -> Unit = definedExternally): Request<DescribeOfferingResponse, AWSError>
    open fun describeOffering(callback: (err: AWSError, data: DescribeOfferingResponse) -> Unit = definedExternally): Request<DescribeOfferingResponse, AWSError>
    open fun describeReservation(params: DescribeReservationRequest, callback: (err: AWSError, data: DescribeReservationResponse) -> Unit = definedExternally): Request<DescribeReservationResponse, AWSError>
    open fun describeReservation(callback: (err: AWSError, data: DescribeReservationResponse) -> Unit = definedExternally): Request<DescribeReservationResponse, AWSError>
    open fun describeSchedule(params: DescribeScheduleRequest, callback: (err: AWSError, data: DescribeScheduleResponse) -> Unit = definedExternally): Request<DescribeScheduleResponse, AWSError>
    open fun describeSchedule(callback: (err: AWSError, data: DescribeScheduleResponse) -> Unit = definedExternally): Request<DescribeScheduleResponse, AWSError>
    open fun listChannels(params: ListChannelsRequest, callback: (err: AWSError, data: ListChannelsResponse) -> Unit = definedExternally): Request<ListChannelsResponse, AWSError>
    open fun listChannels(callback: (err: AWSError, data: ListChannelsResponse) -> Unit = definedExternally): Request<ListChannelsResponse, AWSError>
    open fun listInputSecurityGroups(params: ListInputSecurityGroupsRequest, callback: (err: AWSError, data: ListInputSecurityGroupsResponse) -> Unit = definedExternally): Request<ListInputSecurityGroupsResponse, AWSError>
    open fun listInputSecurityGroups(callback: (err: AWSError, data: ListInputSecurityGroupsResponse) -> Unit = definedExternally): Request<ListInputSecurityGroupsResponse, AWSError>
    open fun listInputs(params: ListInputsRequest, callback: (err: AWSError, data: ListInputsResponse) -> Unit = definedExternally): Request<ListInputsResponse, AWSError>
    open fun listInputs(callback: (err: AWSError, data: ListInputsResponse) -> Unit = definedExternally): Request<ListInputsResponse, AWSError>
    open fun listMultiplexPrograms(params: ListMultiplexProgramsRequest, callback: (err: AWSError, data: ListMultiplexProgramsResponse) -> Unit = definedExternally): Request<ListMultiplexProgramsResponse, AWSError>
    open fun listMultiplexPrograms(callback: (err: AWSError, data: ListMultiplexProgramsResponse) -> Unit = definedExternally): Request<ListMultiplexProgramsResponse, AWSError>
    open fun listMultiplexes(params: ListMultiplexesRequest, callback: (err: AWSError, data: ListMultiplexesResponse) -> Unit = definedExternally): Request<ListMultiplexesResponse, AWSError>
    open fun listMultiplexes(callback: (err: AWSError, data: ListMultiplexesResponse) -> Unit = definedExternally): Request<ListMultiplexesResponse, AWSError>
    open fun listOfferings(params: ListOfferingsRequest, callback: (err: AWSError, data: ListOfferingsResponse) -> Unit = definedExternally): Request<ListOfferingsResponse, AWSError>
    open fun listOfferings(callback: (err: AWSError, data: ListOfferingsResponse) -> Unit = definedExternally): Request<ListOfferingsResponse, AWSError>
    open fun listReservations(params: ListReservationsRequest, callback: (err: AWSError, data: ListReservationsResponse) -> Unit = definedExternally): Request<ListReservationsResponse, AWSError>
    open fun listReservations(callback: (err: AWSError, data: ListReservationsResponse) -> Unit = definedExternally): Request<ListReservationsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun purchaseOffering(params: PurchaseOfferingRequest, callback: (err: AWSError, data: PurchaseOfferingResponse) -> Unit = definedExternally): Request<PurchaseOfferingResponse, AWSError>
    open fun purchaseOffering(callback: (err: AWSError, data: PurchaseOfferingResponse) -> Unit = definedExternally): Request<PurchaseOfferingResponse, AWSError>
    open fun startChannel(params: StartChannelRequest, callback: (err: AWSError, data: StartChannelResponse) -> Unit = definedExternally): Request<StartChannelResponse, AWSError>
    open fun startChannel(callback: (err: AWSError, data: StartChannelResponse) -> Unit = definedExternally): Request<StartChannelResponse, AWSError>
    open fun startMultiplex(params: StartMultiplexRequest, callback: (err: AWSError, data: StartMultiplexResponse) -> Unit = definedExternally): Request<StartMultiplexResponse, AWSError>
    open fun startMultiplex(callback: (err: AWSError, data: StartMultiplexResponse) -> Unit = definedExternally): Request<StartMultiplexResponse, AWSError>
    open fun stopChannel(params: StopChannelRequest, callback: (err: AWSError, data: StopChannelResponse) -> Unit = definedExternally): Request<StopChannelResponse, AWSError>
    open fun stopChannel(callback: (err: AWSError, data: StopChannelResponse) -> Unit = definedExternally): Request<StopChannelResponse, AWSError>
    open fun stopMultiplex(params: StopMultiplexRequest, callback: (err: AWSError, data: StopMultiplexResponse) -> Unit = definedExternally): Request<StopMultiplexResponse, AWSError>
    open fun stopMultiplex(callback: (err: AWSError, data: StopMultiplexResponse) -> Unit = definedExternally): Request<StopMultiplexResponse, AWSError>
    open fun updateChannel(params: UpdateChannelRequest, callback: (err: AWSError, data: UpdateChannelResponse) -> Unit = definedExternally): Request<UpdateChannelResponse, AWSError>
    open fun updateChannel(callback: (err: AWSError, data: UpdateChannelResponse) -> Unit = definedExternally): Request<UpdateChannelResponse, AWSError>
    open fun updateChannelClass(params: UpdateChannelClassRequest, callback: (err: AWSError, data: UpdateChannelClassResponse) -> Unit = definedExternally): Request<UpdateChannelClassResponse, AWSError>
    open fun updateChannelClass(callback: (err: AWSError, data: UpdateChannelClassResponse) -> Unit = definedExternally): Request<UpdateChannelClassResponse, AWSError>
    open fun updateInput(params: UpdateInputRequest, callback: (err: AWSError, data: UpdateInputResponse) -> Unit = definedExternally): Request<UpdateInputResponse, AWSError>
    open fun updateInput(callback: (err: AWSError, data: UpdateInputResponse) -> Unit = definedExternally): Request<UpdateInputResponse, AWSError>
    open fun updateInputSecurityGroup(params: UpdateInputSecurityGroupRequest, callback: (err: AWSError, data: UpdateInputSecurityGroupResponse) -> Unit = definedExternally): Request<UpdateInputSecurityGroupResponse, AWSError>
    open fun updateInputSecurityGroup(callback: (err: AWSError, data: UpdateInputSecurityGroupResponse) -> Unit = definedExternally): Request<UpdateInputSecurityGroupResponse, AWSError>
    open fun updateMultiplex(params: UpdateMultiplexRequest, callback: (err: AWSError, data: UpdateMultiplexResponse) -> Unit = definedExternally): Request<UpdateMultiplexResponse, AWSError>
    open fun updateMultiplex(callback: (err: AWSError, data: UpdateMultiplexResponse) -> Unit = definedExternally): Request<UpdateMultiplexResponse, AWSError>
    open fun updateMultiplexProgram(params: UpdateMultiplexProgramRequest, callback: (err: AWSError, data: UpdateMultiplexProgramResponse) -> Unit = definedExternally): Request<UpdateMultiplexProgramResponse, AWSError>
    open fun updateMultiplexProgram(callback: (err: AWSError, data: UpdateMultiplexProgramResponse) -> Unit = definedExternally): Request<UpdateMultiplexProgramResponse, AWSError>
    open fun updateReservation(params: UpdateReservationRequest, callback: (err: AWSError, data: UpdateReservationResponse) -> Unit = definedExternally): Request<UpdateReservationResponse, AWSError>
    open fun updateReservation(callback: (err: AWSError, data: UpdateReservationResponse) -> Unit = definedExternally): Request<UpdateReservationResponse, AWSError>
    open fun waitFor(state: String, params: DescribeChannelRequest, callback: (err: AWSError, data: DescribeChannelResponse) -> Unit = definedExternally): Request<DescribeChannelResponse, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DescribeChannelResponse) -> Unit = definedExternally): Request<DescribeChannelResponse, AWSError>
    open fun waitFor(state: String, params: DescribeMultiplexRequest, callback: (err: AWSError, data: DescribeMultiplexResponse) -> Unit = definedExternally): Request<DescribeMultiplexResponse, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DescribeMultiplexResponse) -> Unit = definedExternally): Request<DescribeMultiplexResponse, AWSError>
    interface AacSettings {
        var Bitrate: __double?
            get() = definedExternally
            set(value) = definedExternally
        var CodingMode: String /* "AD_RECEIVER_MIX" | "CODING_MODE_1_0" | "CODING_MODE_1_1" | "CODING_MODE_2_0" | "CODING_MODE_5_1" | String */
        var InputType: String /* "BROADCASTER_MIXED_AD" | "NORMAL" | String */
        var Profile: String /* "HEV1" | "HEV2" | "LC" | String */
        var RateControlMode: String /* "CBR" | "VBR" | String */
        var RawFormat: String /* "LATM_LOAS" | "NONE" | String */
        var SampleRate: __double?
            get() = definedExternally
            set(value) = definedExternally
        var Spec: String /* "MPEG2" | "MPEG4" | String */
        var VbrQuality: String /* "HIGH" | "LOW" | "MEDIUM_HIGH" | "MEDIUM_LOW" | String */
    }
    interface Ac3Settings {
        var Bitrate: __double?
            get() = definedExternally
            set(value) = definedExternally
        var BitstreamMode: String /* "COMMENTARY" | "COMPLETE_MAIN" | "DIALOGUE" | "EMERGENCY" | "HEARING_IMPAIRED" | "MUSIC_AND_EFFECTS" | "VISUALLY_IMPAIRED" | "VOICE_OVER" | String */
        var CodingMode: String /* "CODING_MODE_1_0" | "CODING_MODE_1_1" | "CODING_MODE_2_0" | "CODING_MODE_3_2_LFE" | String */
        var Dialnorm: __integerMin1Max31?
            get() = definedExternally
            set(value) = definedExternally
        var DrcProfile: String /* "FILM_STANDARD" | "NONE" | String */
        var LfeFilter: String /* "DISABLED" | "ENABLED" | String */
        var MetadataControl: String /* "FOLLOW_INPUT" | "USE_CONFIGURED" | String */
    }
    interface ArchiveContainerSettings {
        var M2tsSettings: M2tsSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ArchiveGroupSettings {
        var Destination: OutputLocationRef
        var RolloverInterval: __integerMin1?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ArchiveOutputSettings {
        var ContainerSettings: ArchiveContainerSettings
        var Extension: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NameModifier: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AribDestinationSettings
    interface AribSourceSettings
    interface AudioChannelMapping {
        var InputChannelLevels: __listOfInputChannelLevel
        var OutputChannel: __integerMin0Max7
    }
    interface AudioCodecSettings {
        var AacSettings: AacSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Ac3Settings: Ac3Settings?
            get() = definedExternally
            set(value) = definedExternally
        var Eac3Settings: Eac3Settings?
            get() = definedExternally
            set(value) = definedExternally
        var Mp2Settings: Mp2Settings?
            get() = definedExternally
            set(value) = definedExternally
        var PassThroughSettings: PassThroughSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AudioDescription {
        var AudioNormalizationSettings: AudioNormalizationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var AudioSelectorName: __string
        var AudioType: String /* "CLEAN_EFFECTS" | "HEARING_IMPAIRED" | "UNDEFINED" | "VISUAL_IMPAIRED_COMMENTARY" | String */
        var AudioTypeControl: String /* "FOLLOW_INPUT" | "USE_CONFIGURED" | String */
        var CodecSettings: AudioCodecSettings?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: __stringMin3Max3?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCodeControl: String /* "FOLLOW_INPUT" | "USE_CONFIGURED" | String */
        var Name: __string
        var RemixSettings: RemixSettings?
            get() = definedExternally
            set(value) = definedExternally
        var StreamName: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AudioLanguageSelection {
        var LanguageCode: __string
        var LanguageSelectionPolicy: String /* "LOOSE" | "STRICT" | String */
    }
    interface AudioNormalizationSettings {
        var Algorithm: String /* "ITU_1770_1" | "ITU_1770_2" | String */
        var AlgorithmControl: String /* "CORRECT_AUDIO" | String */
        var TargetLkfs: __doubleMinNegative59Max0?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AudioOnlyHlsSettings {
        var AudioGroupId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var AudioOnlyImage: InputLocation?
            get() = definedExternally
            set(value) = definedExternally
        var AudioTrackType: String /* "ALTERNATE_AUDIO_AUTO_SELECT" | "ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT" | "ALTERNATE_AUDIO_NOT_AUTO_SELECT" | "AUDIO_ONLY_VARIANT_STREAM" | String */
        var SegmentType: String /* "AAC" | "FMP4" | String */
    }
    interface AudioPidSelection {
        var Pid: __integerMin0Max8191
    }
    interface AudioSelector {
        var Name: __stringMin1
        var SelectorSettings: AudioSelectorSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AudioSelectorSettings {
        var AudioLanguageSelection: AudioLanguageSelection?
            get() = definedExternally
            set(value) = definedExternally
        var AudioPidSelection: AudioPidSelection?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AvailBlanking {
        var AvailBlankingImage: InputLocation?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "DISABLED" | "ENABLED" | String */
    }
    interface AvailConfiguration {
        var AvailSettings: AvailSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AvailSettings {
        var Scte35SpliceInsert: Scte35SpliceInsert?
            get() = definedExternally
            set(value) = definedExternally
        var Scte35TimeSignalApos: Scte35TimeSignalApos?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchScheduleActionCreateRequest {
        var ScheduleActions: __listOfScheduleAction
    }
    interface BatchScheduleActionCreateResult {
        var ScheduleActions: __listOfScheduleAction
    }
    interface BatchScheduleActionDeleteRequest {
        var ActionNames: __listOf__string
    }
    interface BatchScheduleActionDeleteResult {
        var ScheduleActions: __listOfScheduleAction
    }
    interface BatchUpdateScheduleRequest {
        var ChannelId: __string
        var Creates: BatchScheduleActionCreateRequest?
            get() = definedExternally
            set(value) = definedExternally
        var Deletes: BatchScheduleActionDeleteRequest?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchUpdateScheduleResponse {
        var Creates: BatchScheduleActionCreateResult?
            get() = definedExternally
            set(value) = definedExternally
        var Deletes: BatchScheduleActionDeleteResult?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BlackoutSlate {
        var BlackoutSlateImage: InputLocation?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkEndBlackout: String /* "DISABLED" | "ENABLED" | String */
        var NetworkEndBlackoutImage: InputLocation?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkId: __stringMin34Max34?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "DISABLED" | "ENABLED" | String */
    }
    interface BurnInDestinationSettings {
        var Alignment: String /* "CENTERED" | "LEFT" | "SMART" | String */
        var BackgroundColor: String /* "BLACK" | "NONE" | "WHITE" | String */
        var BackgroundOpacity: __integerMin0Max255?
            get() = definedExternally
            set(value) = definedExternally
        var Font: InputLocation?
            get() = definedExternally
            set(value) = definedExternally
        var FontColor: String /* "BLACK" | "BLUE" | "GREEN" | "RED" | "WHITE" | "YELLOW" | String */
        var FontOpacity: __integerMin0Max255?
            get() = definedExternally
            set(value) = definedExternally
        var FontResolution: __integerMin96Max600?
            get() = definedExternally
            set(value) = definedExternally
        var FontSize: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OutlineColor: String /* "BLACK" | "BLUE" | "GREEN" | "RED" | "WHITE" | "YELLOW" | String */
        var OutlineSize: __integerMin0Max10?
            get() = definedExternally
            set(value) = definedExternally
        var ShadowColor: String /* "BLACK" | "NONE" | "WHITE" | String */
        var ShadowOpacity: __integerMin0Max255?
            get() = definedExternally
            set(value) = definedExternally
        var ShadowXOffset: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var ShadowYOffset: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var TeletextGridControl: String /* "FIXED" | "SCALED" | String */
        var XPosition: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var YPosition: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CaptionDescription {
        var CaptionSelectorName: __string
        var DestinationSettings: CaptionDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string
    }
    interface CaptionDestinationSettings {
        var AribDestinationSettings: AribDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var BurnInDestinationSettings: BurnInDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var DvbSubDestinationSettings: DvbSubDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var EmbeddedDestinationSettings: EmbeddedDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var EmbeddedPlusScte20DestinationSettings: EmbeddedPlusScte20DestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var RtmpCaptionInfoDestinationSettings: RtmpCaptionInfoDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Scte20PlusEmbeddedDestinationSettings: Scte20PlusEmbeddedDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Scte27DestinationSettings: Scte27DestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var SmpteTtDestinationSettings: SmpteTtDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var TeletextDestinationSettings: TeletextDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var TtmlDestinationSettings: TtmlDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var WebvttDestinationSettings: WebvttDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CaptionLanguageMapping {
        var CaptionChannel: __integerMin1Max4
        var LanguageCode: __stringMin3Max3
        var LanguageDescription: __stringMin1
    }
    interface CaptionSelector {
        var LanguageCode: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __stringMin1
        var SelectorSettings: CaptionSelectorSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CaptionSelectorSettings {
        var AribSourceSettings: AribSourceSettings?
            get() = definedExternally
            set(value) = definedExternally
        var DvbSubSourceSettings: DvbSubSourceSettings?
            get() = definedExternally
            set(value) = definedExternally
        var EmbeddedSourceSettings: EmbeddedSourceSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Scte20SourceSettings: Scte20SourceSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Scte27SourceSettings: Scte27SourceSettings?
            get() = definedExternally
            set(value) = definedExternally
        var TeletextSourceSettings: TeletextSourceSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Channel {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelClass: String /* "STANDARD" | "SINGLE_PIPELINE" | String */
        var Destinations: __listOfOutputDestination?
            get() = definedExternally
            set(value) = definedExternally
        var EgressEndpoints: __listOfChannelEgressEndpoint?
            get() = definedExternally
            set(value) = definedExternally
        var EncoderSettings: EncoderSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var InputAttachments: __listOfInputAttachment?
            get() = definedExternally
            set(value) = definedExternally
        var InputSpecification: InputSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var LogLevel: String /* "ERROR" | "WARNING" | "INFO" | "DEBUG" | "DISABLED" | String */
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PipelineDetails: __listOfPipelineDetail?
            get() = definedExternally
            set(value) = definedExternally
        var PipelinesRunningCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "CREATING" | "CREATE_FAILED" | "IDLE" | "STARTING" | "RUNNING" | "RECOVERING" | "STOPPING" | "DELETING" | "DELETED" | "UPDATING" | "UPDATE_FAILED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChannelEgressEndpoint {
        var SourceIp: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChannelSummary {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelClass: String /* "STANDARD" | "SINGLE_PIPELINE" | String */
        var Destinations: __listOfOutputDestination?
            get() = definedExternally
            set(value) = definedExternally
        var EgressEndpoints: __listOfChannelEgressEndpoint?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var InputAttachments: __listOfInputAttachment?
            get() = definedExternally
            set(value) = definedExternally
        var InputSpecification: InputSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var LogLevel: String /* "ERROR" | "WARNING" | "INFO" | "DEBUG" | "DISABLED" | String */
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PipelinesRunningCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "CREATING" | "CREATE_FAILED" | "IDLE" | "STARTING" | "RUNNING" | "RECOVERING" | "STOPPING" | "DELETING" | "DELETED" | "UPDATING" | "UPDATE_FAILED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ColorSpacePassthroughSettings
    interface CreateChannelRequest {
        var ChannelClass: String /* "STANDARD" | "SINGLE_PIPELINE" | String */
        var Destinations: __listOfOutputDestination?
            get() = definedExternally
            set(value) = definedExternally
        var EncoderSettings: EncoderSettings?
            get() = definedExternally
            set(value) = definedExternally
        var InputAttachments: __listOfInputAttachment?
            get() = definedExternally
            set(value) = definedExternally
        var InputSpecification: InputSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var LogLevel: String /* "ERROR" | "WARNING" | "INFO" | "DEBUG" | "DISABLED" | String */
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Reserved: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateChannelResponse {
        var Channel: Channel?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateInputRequest {
        var Destinations: __listOfInputDestinationRequest?
            get() = definedExternally
            set(value) = definedExternally
        var InputSecurityGroups: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var MediaConnectFlows: __listOfMediaConnectFlowRequest?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Sources: __listOfInputSourceRequest?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "UDP_PUSH" | "RTP_PUSH" | "RTMP_PUSH" | "RTMP_PULL" | "URL_PULL" | "MP4_FILE" | "MEDIACONNECT" | String */
        var Vpc: InputVpcRequest?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateInputResponse {
        var Input: Input?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateInputSecurityGroupRequest {
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var WhitelistRules: __listOfInputWhitelistRuleCidr?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateInputSecurityGroupResponse {
        var SecurityGroup: InputSecurityGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateMultiplexProgramRequest {
        var MultiplexId: __string
        var MultiplexProgramSettings: MultiplexProgramSettings
        var ProgramName: __string
        var RequestId: __string
    }
    interface CreateMultiplexProgramResponse {
        var MultiplexProgram: MultiplexProgram?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateMultiplexRequest {
        var AvailabilityZones: __listOf__string
        var MultiplexSettings: MultiplexSettings
        var Name: __string
        var RequestId: __string
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateMultiplexResponse {
        var Multiplex: Multiplex?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTagsRequest {
        var ResourceArn: __string
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteChannelRequest {
        var ChannelId: __string
    }
    interface DeleteChannelResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelClass: String /* "STANDARD" | "SINGLE_PIPELINE" | String */
        var Destinations: __listOfOutputDestination?
            get() = definedExternally
            set(value) = definedExternally
        var EgressEndpoints: __listOfChannelEgressEndpoint?
            get() = definedExternally
            set(value) = definedExternally
        var EncoderSettings: EncoderSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var InputAttachments: __listOfInputAttachment?
            get() = definedExternally
            set(value) = definedExternally
        var InputSpecification: InputSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var LogLevel: String /* "ERROR" | "WARNING" | "INFO" | "DEBUG" | "DISABLED" | String */
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PipelineDetails: __listOfPipelineDetail?
            get() = definedExternally
            set(value) = definedExternally
        var PipelinesRunningCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "CREATING" | "CREATE_FAILED" | "IDLE" | "STARTING" | "RUNNING" | "RECOVERING" | "STOPPING" | "DELETING" | "DELETED" | "UPDATING" | "UPDATE_FAILED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteInputRequest {
        var InputId: __string
    }
    interface DeleteInputResponse
    interface DeleteInputSecurityGroupRequest {
        var InputSecurityGroupId: __string
    }
    interface DeleteInputSecurityGroupResponse
    interface DeleteMultiplexProgramRequest {
        var MultiplexId: __string
        var ProgramName: __string
    }
    interface DeleteMultiplexProgramResponse {
        var ChannelId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MultiplexProgramSettings: MultiplexProgramSettings?
            get() = definedExternally
            set(value) = definedExternally
        var PacketIdentifiersMap: MultiplexProgramPacketIdentifiersMap?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramName: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteMultiplexRequest {
        var MultiplexId: __string
    }
    interface DeleteMultiplexResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZones: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Destinations: __listOfMultiplexOutputDestination?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MultiplexSettings: MultiplexSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PipelinesRunningCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "CREATING" | "CREATE_FAILED" | "IDLE" | "STARTING" | "RUNNING" | "RECOVERING" | "STOPPING" | "DELETING" | "DELETED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteReservationRequest {
        var ReservationId: __string
    }
    interface DeleteReservationResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Count: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var CurrencyCode: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var DurationUnits: String /* "MONTHS" | String */
        var End: __string?
            get() = definedExternally
            set(value) = definedExternally
        var FixedPrice: __double?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingType: String /* "NO_UPFRONT" | String */
        var Region: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ReservationId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceSpecification: ReservationResourceSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var Start: __string?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ACTIVE" | "EXPIRED" | "CANCELED" | "DELETED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var UsagePrice: __double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteScheduleRequest {
        var ChannelId: __string
    }
    interface DeleteScheduleResponse
    interface DeleteTagsRequest {
        var ResourceArn: __string
        var TagKeys: __listOf__string
    }
    interface DescribeChannelRequest {
        var ChannelId: __string
    }
    interface DescribeChannelResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelClass: String /* "STANDARD" | "SINGLE_PIPELINE" | String */
        var Destinations: __listOfOutputDestination?
            get() = definedExternally
            set(value) = definedExternally
        var EgressEndpoints: __listOfChannelEgressEndpoint?
            get() = definedExternally
            set(value) = definedExternally
        var EncoderSettings: EncoderSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var InputAttachments: __listOfInputAttachment?
            get() = definedExternally
            set(value) = definedExternally
        var InputSpecification: InputSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var LogLevel: String /* "ERROR" | "WARNING" | "INFO" | "DEBUG" | "DISABLED" | String */
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PipelineDetails: __listOfPipelineDetail?
            get() = definedExternally
            set(value) = definedExternally
        var PipelinesRunningCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "CREATING" | "CREATE_FAILED" | "IDLE" | "STARTING" | "RUNNING" | "RECOVERING" | "STOPPING" | "DELETING" | "DELETED" | "UPDATING" | "UPDATE_FAILED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInputRequest {
        var InputId: __string
    }
    interface DescribeInputResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var AttachedChannels: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Destinations: __listOfInputDestination?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var InputClass: String /* "STANDARD" | "SINGLE_PIPELINE" | String */
        var InputSourceType: String /* "STATIC" | "DYNAMIC" | String */
        var MediaConnectFlows: __listOfMediaConnectFlow?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroups: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Sources: __listOfInputSource?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "CREATING" | "DETACHED" | "ATTACHED" | "DELETING" | "DELETED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "UDP_PUSH" | "RTP_PUSH" | "RTMP_PUSH" | "RTMP_PULL" | "URL_PULL" | "MP4_FILE" | "MEDIACONNECT" | String */
    }
    interface DescribeInputSecurityGroupRequest {
        var InputSecurityGroupId: __string
    }
    interface DescribeInputSecurityGroupResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Inputs: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "IDLE" | "IN_USE" | "UPDATING" | "DELETED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var WhitelistRules: __listOfInputWhitelistRule?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMultiplexProgramRequest {
        var MultiplexId: __string
        var ProgramName: __string
    }
    interface DescribeMultiplexProgramResponse {
        var ChannelId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MultiplexProgramSettings: MultiplexProgramSettings?
            get() = definedExternally
            set(value) = definedExternally
        var PacketIdentifiersMap: MultiplexProgramPacketIdentifiersMap?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramName: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMultiplexRequest {
        var MultiplexId: __string
    }
    interface DescribeMultiplexResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZones: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Destinations: __listOfMultiplexOutputDestination?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MultiplexSettings: MultiplexSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PipelinesRunningCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "CREATING" | "CREATE_FAILED" | "IDLE" | "STARTING" | "RUNNING" | "RECOVERING" | "STOPPING" | "DELETING" | "DELETED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeOfferingRequest {
        var OfferingId: __string
    }
    interface DescribeOfferingResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CurrencyCode: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var DurationUnits: String /* "MONTHS" | String */
        var FixedPrice: __double?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingType: String /* "NO_UPFRONT" | String */
        var Region: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceSpecification: ReservationResourceSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var UsagePrice: __double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeReservationRequest {
        var ReservationId: __string
    }
    interface DescribeReservationResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Count: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var CurrencyCode: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var DurationUnits: String /* "MONTHS" | String */
        var End: __string?
            get() = definedExternally
            set(value) = definedExternally
        var FixedPrice: __double?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingType: String /* "NO_UPFRONT" | String */
        var Region: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ReservationId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceSpecification: ReservationResourceSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var Start: __string?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ACTIVE" | "EXPIRED" | "CANCELED" | "DELETED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var UsagePrice: __double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeScheduleRequest {
        var ChannelId: __string
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeScheduleResponse {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduleActions: __listOfScheduleAction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DvbNitSettings {
        var NetworkId: __integerMin0Max65536
        var NetworkName: __stringMin1Max256
        var RepInterval: __integerMin25Max10000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DvbSdtSettings {
        var OutputSdt: String /* "SDT_FOLLOW" | "SDT_FOLLOW_IF_PRESENT" | "SDT_MANUAL" | "SDT_NONE" | String */
        var RepInterval: __integerMin25Max2000?
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
        var Alignment: String /* "CENTERED" | "LEFT" | "SMART" | String */
        var BackgroundColor: String /* "BLACK" | "NONE" | "WHITE" | String */
        var BackgroundOpacity: __integerMin0Max255?
            get() = definedExternally
            set(value) = definedExternally
        var Font: InputLocation?
            get() = definedExternally
            set(value) = definedExternally
        var FontColor: String /* "BLACK" | "BLUE" | "GREEN" | "RED" | "WHITE" | "YELLOW" | String */
        var FontOpacity: __integerMin0Max255?
            get() = definedExternally
            set(value) = definedExternally
        var FontResolution: __integerMin96Max600?
            get() = definedExternally
            set(value) = definedExternally
        var FontSize: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OutlineColor: String /* "BLACK" | "BLUE" | "GREEN" | "RED" | "WHITE" | "YELLOW" | String */
        var OutlineSize: __integerMin0Max10?
            get() = definedExternally
            set(value) = definedExternally
        var ShadowColor: String /* "BLACK" | "NONE" | "WHITE" | String */
        var ShadowOpacity: __integerMin0Max255?
            get() = definedExternally
            set(value) = definedExternally
        var ShadowXOffset: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var ShadowYOffset: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var TeletextGridControl: String /* "FIXED" | "SCALED" | String */
        var XPosition: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var YPosition: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DvbSubSourceSettings {
        var Pid: __integerMin1?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DvbTdtSettings {
        var RepInterval: __integerMin1000Max30000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Eac3Settings {
        var AttenuationControl: String /* "ATTENUATE_3_DB" | "NONE" | String */
        var Bitrate: __double?
            get() = definedExternally
            set(value) = definedExternally
        var BitstreamMode: String /* "COMMENTARY" | "COMPLETE_MAIN" | "EMERGENCY" | "HEARING_IMPAIRED" | "VISUALLY_IMPAIRED" | String */
        var CodingMode: String /* "CODING_MODE_1_0" | "CODING_MODE_2_0" | "CODING_MODE_3_2" | String */
        var DcFilter: String /* "DISABLED" | "ENABLED" | String */
        var Dialnorm: __integerMin1Max31?
            get() = definedExternally
            set(value) = definedExternally
        var DrcLine: String /* "FILM_LIGHT" | "FILM_STANDARD" | "MUSIC_LIGHT" | "MUSIC_STANDARD" | "NONE" | "SPEECH" | String */
        var DrcRf: String /* "FILM_LIGHT" | "FILM_STANDARD" | "MUSIC_LIGHT" | "MUSIC_STANDARD" | "NONE" | "SPEECH" | String */
        var LfeControl: String /* "LFE" | "NO_LFE" | String */
        var LfeFilter: String /* "DISABLED" | "ENABLED" | String */
        var LoRoCenterMixLevel: __double?
            get() = definedExternally
            set(value) = definedExternally
        var LoRoSurroundMixLevel: __double?
            get() = definedExternally
            set(value) = definedExternally
        var LtRtCenterMixLevel: __double?
            get() = definedExternally
            set(value) = definedExternally
        var LtRtSurroundMixLevel: __double?
            get() = definedExternally
            set(value) = definedExternally
        var MetadataControl: String /* "FOLLOW_INPUT" | "USE_CONFIGURED" | String */
        var PassthroughControl: String /* "NO_PASSTHROUGH" | "WHEN_POSSIBLE" | String */
        var PhaseControl: String /* "NO_SHIFT" | "SHIFT_90_DEGREES" | String */
        var StereoDownmix: String /* "DPL2" | "LO_RO" | "LT_RT" | "NOT_INDICATED" | String */
        var SurroundExMode: String /* "DISABLED" | "ENABLED" | "NOT_INDICATED" | String */
        var SurroundMode: String /* "DISABLED" | "ENABLED" | "NOT_INDICATED" | String */
    }
    interface EmbeddedDestinationSettings
    interface EmbeddedPlusScte20DestinationSettings
    interface EmbeddedSourceSettings {
        var Convert608To708: String /* "DISABLED" | "UPCONVERT" | String */
        var Scte20Detection: String /* "AUTO" | "OFF" | String */
        var Source608ChannelNumber: __integerMin1Max4?
            get() = definedExternally
            set(value) = definedExternally
        var Source608TrackNumber: __integerMin1Max5?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EncoderSettings {
        var AudioDescriptions: __listOfAudioDescription
        var AvailBlanking: AvailBlanking?
            get() = definedExternally
            set(value) = definedExternally
        var AvailConfiguration: AvailConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var BlackoutSlate: BlackoutSlate?
            get() = definedExternally
            set(value) = definedExternally
        var CaptionDescriptions: __listOfCaptionDescription?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalConfiguration: GlobalConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var NielsenConfiguration: NielsenConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var OutputGroups: __listOfOutputGroup
        var TimecodeConfig: TimecodeConfig
        var VideoDescriptions: __listOfVideoDescription
    }
    interface FecOutputSettings {
        var ColumnDepth: __integerMin4Max20?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeFec: String /* "COLUMN" | "COLUMN_AND_ROW" | String */
        var RowLength: __integerMin1Max20?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FixedModeScheduleActionStartSettings {
        var Time: __string
    }
    interface Fmp4HlsSettings {
        var AudioRenditionSets: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FollowModeScheduleActionStartSettings {
        var FollowPoint: String /* "END" | "START" | String */
        var ReferenceActionName: __string
    }
    interface FrameCaptureGroupSettings {
        var Destination: OutputLocationRef
    }
    interface FrameCaptureOutputSettings {
        var NameModifier: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FrameCaptureSettings {
        var CaptureInterval: __integerMin1Max3600000
        var CaptureIntervalUnits: String /* "MILLISECONDS" | "SECONDS" | String */
    }
    interface GlobalConfiguration {
        var InitialAudioGain: __integerMinNegative60Max60?
            get() = definedExternally
            set(value) = definedExternally
        var InputEndAction: String /* "NONE" | "SWITCH_AND_LOOP_INPUTS" | String */
        var InputLossBehavior: InputLossBehavior?
            get() = definedExternally
            set(value) = definedExternally
        var OutputLockingMode: String /* "EPOCH_LOCKING" | "PIPELINE_LOCKING" | String */
        var OutputTimingSource: String /* "INPUT_CLOCK" | "SYSTEM_CLOCK" | String */
        var SupportLowFramerateInputs: String /* "DISABLED" | "ENABLED" | String */
    }
    interface H264ColorSpaceSettings {
        var ColorSpacePassthroughSettings: ColorSpacePassthroughSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Rec601Settings: Rec601Settings?
            get() = definedExternally
            set(value) = definedExternally
        var Rec709Settings: Rec709Settings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface H264Settings {
        var AdaptiveQuantization: String /* "HIGH" | "HIGHER" | "LOW" | "MAX" | "MEDIUM" | "OFF" | String */
        var AfdSignaling: String /* "AUTO" | "FIXED" | "NONE" | String */
        var Bitrate: __integerMin1000?
            get() = definedExternally
            set(value) = definedExternally
        var BufFillPct: __integerMin0Max100?
            get() = definedExternally
            set(value) = definedExternally
        var BufSize: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var ColorMetadata: String /* "IGNORE" | "INSERT" | String */
        var ColorSpaceSettings: H264ColorSpaceSettings?
            get() = definedExternally
            set(value) = definedExternally
        var EntropyEncoding: String /* "CABAC" | "CAVLC" | String */
        var FixedAfd: String /* "AFD_0000" | "AFD_0010" | "AFD_0011" | "AFD_0100" | "AFD_1000" | "AFD_1001" | "AFD_1010" | "AFD_1011" | "AFD_1101" | "AFD_1110" | "AFD_1111" | String */
        var FlickerAq: String /* "DISABLED" | "ENABLED" | String */
        var FramerateControl: String /* "INITIALIZE_FROM_SOURCE" | "SPECIFIED" | String */
        var FramerateDenominator: __integerMin1?
            get() = definedExternally
            set(value) = definedExternally
        var FramerateNumerator: __integerMin1?
            get() = definedExternally
            set(value) = definedExternally
        var GopBReference: String /* "DISABLED" | "ENABLED" | String */
        var GopClosedCadence: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var GopNumBFrames: __integerMin0Max7?
            get() = definedExternally
            set(value) = definedExternally
        var GopSize: __double?
            get() = definedExternally
            set(value) = definedExternally
        var GopSizeUnits: String /* "FRAMES" | "SECONDS" | String */
        var Level: String /* "H264_LEVEL_1" | "H264_LEVEL_1_1" | "H264_LEVEL_1_2" | "H264_LEVEL_1_3" | "H264_LEVEL_2" | "H264_LEVEL_2_1" | "H264_LEVEL_2_2" | "H264_LEVEL_3" | "H264_LEVEL_3_1" | "H264_LEVEL_3_2" | "H264_LEVEL_4" | "H264_LEVEL_4_1" | "H264_LEVEL_4_2" | "H264_LEVEL_5" | "H264_LEVEL_5_1" | "H264_LEVEL_5_2" | "H264_LEVEL_AUTO" | String */
        var LookAheadRateControl: String /* "HIGH" | "LOW" | "MEDIUM" | String */
        var MaxBitrate: __integerMin1000?
            get() = definedExternally
            set(value) = definedExternally
        var MinIInterval: __integerMin0Max30?
            get() = definedExternally
            set(value) = definedExternally
        var NumRefFrames: __integerMin1Max6?
            get() = definedExternally
            set(value) = definedExternally
        var ParControl: String /* "INITIALIZE_FROM_SOURCE" | "SPECIFIED" | String */
        var ParDenominator: __integerMin1?
            get() = definedExternally
            set(value) = definedExternally
        var ParNumerator: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Profile: String /* "BASELINE" | "HIGH" | "HIGH_10BIT" | "HIGH_422" | "HIGH_422_10BIT" | "MAIN" | String */
        var QvbrQualityLevel: __integerMin1Max10?
            get() = definedExternally
            set(value) = definedExternally
        var RateControlMode: String /* "CBR" | "MULTIPLEX" | "QVBR" | "VBR" | String */
        var ScanType: String /* "INTERLACED" | "PROGRESSIVE" | String */
        var SceneChangeDetect: String /* "DISABLED" | "ENABLED" | String */
        var Slices: __integerMin1Max32?
            get() = definedExternally
            set(value) = definedExternally
        var Softness: __integerMin0Max128?
            get() = definedExternally
            set(value) = definedExternally
        var SpatialAq: String /* "DISABLED" | "ENABLED" | String */
        var SubgopLength: String /* "DYNAMIC" | "FIXED" | String */
        var Syntax: String /* "DEFAULT" | "RP2027" | String */
        var TemporalAq: String /* "DISABLED" | "ENABLED" | String */
        var TimecodeInsertion: String /* "DISABLED" | "PIC_TIMING_SEI" | String */
    }
    interface H265ColorSpaceSettings {
        var ColorSpacePassthroughSettings: ColorSpacePassthroughSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Hdr10Settings: Hdr10Settings?
            get() = definedExternally
            set(value) = definedExternally
        var Rec601Settings: Rec601Settings?
            get() = definedExternally
            set(value) = definedExternally
        var Rec709Settings: Rec709Settings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface H265Settings {
        var AdaptiveQuantization: String /* "HIGH" | "HIGHER" | "LOW" | "MAX" | "MEDIUM" | "OFF" | String */
        var AfdSignaling: String /* "AUTO" | "FIXED" | "NONE" | String */
        var AlternativeTransferFunction: String /* "INSERT" | "OMIT" | String */
        var Bitrate: __integerMin100000Max40000000?
            get() = definedExternally
            set(value) = definedExternally
        var BufSize: __integerMin100000Max80000000?
            get() = definedExternally
            set(value) = definedExternally
        var ColorMetadata: String /* "IGNORE" | "INSERT" | String */
        var ColorSpaceSettings: H265ColorSpaceSettings?
            get() = definedExternally
            set(value) = definedExternally
        var FixedAfd: String /* "AFD_0000" | "AFD_0010" | "AFD_0011" | "AFD_0100" | "AFD_1000" | "AFD_1001" | "AFD_1010" | "AFD_1011" | "AFD_1101" | "AFD_1110" | "AFD_1111" | String */
        var FlickerAq: String /* "DISABLED" | "ENABLED" | String */
        var FramerateDenominator: __integerMin1Max3003
        var FramerateNumerator: __integerMin1
        var GopClosedCadence: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var GopSize: __double?
            get() = definedExternally
            set(value) = definedExternally
        var GopSizeUnits: String /* "FRAMES" | "SECONDS" | String */
        var Level: String /* "H265_LEVEL_1" | "H265_LEVEL_2" | "H265_LEVEL_2_1" | "H265_LEVEL_3" | "H265_LEVEL_3_1" | "H265_LEVEL_4" | "H265_LEVEL_4_1" | "H265_LEVEL_5" | "H265_LEVEL_5_1" | "H265_LEVEL_5_2" | "H265_LEVEL_6" | "H265_LEVEL_6_1" | "H265_LEVEL_6_2" | "H265_LEVEL_AUTO" | String */
        var LookAheadRateControl: String /* "HIGH" | "LOW" | "MEDIUM" | String */
        var MaxBitrate: __integerMin100000Max40000000?
            get() = definedExternally
            set(value) = definedExternally
        var MinIInterval: __integerMin0Max30?
            get() = definedExternally
            set(value) = definedExternally
        var ParDenominator: __integerMin1?
            get() = definedExternally
            set(value) = definedExternally
        var ParNumerator: __integerMin1?
            get() = definedExternally
            set(value) = definedExternally
        var Profile: String /* "MAIN" | "MAIN_10BIT" | String */
        var QvbrQualityLevel: __integerMin1Max10?
            get() = definedExternally
            set(value) = definedExternally
        var RateControlMode: String /* "CBR" | "MULTIPLEX" | "QVBR" | String */
        var ScanType: String /* "PROGRESSIVE" | String */
        var SceneChangeDetect: String /* "DISABLED" | "ENABLED" | String */
        var Slices: __integerMin1Max16?
            get() = definedExternally
            set(value) = definedExternally
        var Tier: String /* "HIGH" | "MAIN" | String */
        var TimecodeInsertion: String /* "DISABLED" | "PIC_TIMING_SEI" | String */
    }
    interface Hdr10Settings {
        var MaxCll: __integerMin0Max32768?
            get() = definedExternally
            set(value) = definedExternally
        var MaxFall: __integerMin0Max32768?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HlsAkamaiSettings {
        var ConnectionRetryInterval: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var FilecacheDuration: __integerMin0Max600?
            get() = definedExternally
            set(value) = definedExternally
        var HttpTransferMode: String /* "CHUNKED" | "NON_CHUNKED" | String */
        var NumRetries: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var RestartDelay: __integerMin0Max15?
            get() = definedExternally
            set(value) = definedExternally
        var Salt: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Token: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HlsBasicPutSettings {
        var ConnectionRetryInterval: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var FilecacheDuration: __integerMin0Max600?
            get() = definedExternally
            set(value) = definedExternally
        var NumRetries: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var RestartDelay: __integerMin0Max15?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HlsCdnSettings {
        var HlsAkamaiSettings: HlsAkamaiSettings?
            get() = definedExternally
            set(value) = definedExternally
        var HlsBasicPutSettings: HlsBasicPutSettings?
            get() = definedExternally
            set(value) = definedExternally
        var HlsMediaStoreSettings: HlsMediaStoreSettings?
            get() = definedExternally
            set(value) = definedExternally
        var HlsWebdavSettings: HlsWebdavSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HlsGroupSettings {
        var AdMarkers: __listOfHlsAdMarkers?
            get() = definedExternally
            set(value) = definedExternally
        var BaseUrlContent: __string?
            get() = definedExternally
            set(value) = definedExternally
        var BaseUrlContent1: __string?
            get() = definedExternally
            set(value) = definedExternally
        var BaseUrlManifest: __string?
            get() = definedExternally
            set(value) = definedExternally
        var BaseUrlManifest1: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CaptionLanguageMappings: __listOfCaptionLanguageMapping?
            get() = definedExternally
            set(value) = definedExternally
        var CaptionLanguageSetting: String /* "INSERT" | "NONE" | "OMIT" | String */
        var ClientCache: String /* "DISABLED" | "ENABLED" | String */
        var CodecSpecification: String /* "RFC_4281" | "RFC_6381" | String */
        var ConstantIv: __stringMin32Max32?
            get() = definedExternally
            set(value) = definedExternally
        var Destination: OutputLocationRef
        var DirectoryStructure: String /* "SINGLE_DIRECTORY" | "SUBDIRECTORY_PER_STREAM" | String */
        var EncryptionType: String /* "AES128" | "SAMPLE_AES" | String */
        var HlsCdnSettings: HlsCdnSettings?
            get() = definedExternally
            set(value) = definedExternally
        var HlsId3SegmentTagging: String /* "DISABLED" | "ENABLED" | String */
        var IFrameOnlyPlaylists: String /* "DISABLED" | "STANDARD" | String */
        var IndexNSegments: __integerMin3?
            get() = definedExternally
            set(value) = definedExternally
        var InputLossAction: String /* "EMIT_OUTPUT" | "PAUSE_OUTPUT" | String */
        var IvInManifest: String /* "EXCLUDE" | "INCLUDE" | String */
        var IvSource: String /* "EXPLICIT" | "FOLLOWS_SEGMENT_NUMBER" | String */
        var KeepSegments: __integerMin1?
            get() = definedExternally
            set(value) = definedExternally
        var KeyFormat: __string?
            get() = definedExternally
            set(value) = definedExternally
        var KeyFormatVersions: __string?
            get() = definedExternally
            set(value) = definedExternally
        var KeyProviderSettings: KeyProviderSettings?
            get() = definedExternally
            set(value) = definedExternally
        var ManifestCompression: String /* "GZIP" | "NONE" | String */
        var ManifestDurationFormat: String /* "FLOATING_POINT" | "INTEGER" | String */
        var MinSegmentLength: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var Mode: String /* "LIVE" | "VOD" | String */
        var OutputSelection: String /* "MANIFESTS_AND_SEGMENTS" | "SEGMENTS_ONLY" | String */
        var ProgramDateTime: String /* "EXCLUDE" | "INCLUDE" | String */
        var ProgramDateTimePeriod: __integerMin0Max3600?
            get() = definedExternally
            set(value) = definedExternally
        var RedundantManifest: String /* "DISABLED" | "ENABLED" | String */
        var SegmentLength: __integerMin1?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentationMode: String /* "USE_INPUT_SEGMENTATION" | "USE_SEGMENT_DURATION" | String */
        var SegmentsPerSubdirectory: __integerMin1?
            get() = definedExternally
            set(value) = definedExternally
        var StreamInfResolution: String /* "EXCLUDE" | "INCLUDE" | String */
        var TimedMetadataId3Frame: String /* "NONE" | "PRIV" | "TDRL" | String */
        var TimedMetadataId3Period: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var TimestampDeltaMilliseconds: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var TsFileMode: String /* "SEGMENTED_FILES" | "SINGLE_FILE" | String */
    }
    interface HlsId3SegmentTaggingScheduleActionSettings {
        var Tag: __string
    }
    interface HlsInputSettings {
        var Bandwidth: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var BufferSegments: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var Retries: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var RetryInterval: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HlsMediaStoreSettings {
        var ConnectionRetryInterval: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var FilecacheDuration: __integerMin0Max600?
            get() = definedExternally
            set(value) = definedExternally
        var MediaStoreStorageClass: String /* "TEMPORAL" | String */
        var NumRetries: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var RestartDelay: __integerMin0Max15?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HlsOutputSettings {
        var H265PackagingType: String /* "HEV1" | "HVC1" | String */
        var HlsSettings: HlsSettings
        var NameModifier: __stringMin1?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentModifier: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HlsSettings {
        var AudioOnlyHlsSettings: AudioOnlyHlsSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Fmp4HlsSettings: Fmp4HlsSettings?
            get() = definedExternally
            set(value) = definedExternally
        var StandardHlsSettings: StandardHlsSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HlsTimedMetadataScheduleActionSettings {
        var Id3: __string
    }
    interface HlsWebdavSettings {
        var ConnectionRetryInterval: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var FilecacheDuration: __integerMin0Max600?
            get() = definedExternally
            set(value) = definedExternally
        var HttpTransferMode: String /* "CHUNKED" | "NON_CHUNKED" | String */
        var NumRetries: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var RestartDelay: __integerMin0Max15?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImmediateModeScheduleActionStartSettings
    interface Input {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var AttachedChannels: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Destinations: __listOfInputDestination?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var InputClass: String /* "STANDARD" | "SINGLE_PIPELINE" | String */
        var InputSourceType: String /* "STATIC" | "DYNAMIC" | String */
        var MediaConnectFlows: __listOfMediaConnectFlow?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroups: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Sources: __listOfInputSource?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "CREATING" | "DETACHED" | "ATTACHED" | "DELETING" | "DELETED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "UDP_PUSH" | "RTP_PUSH" | "RTMP_PUSH" | "RTMP_PULL" | "URL_PULL" | "MP4_FILE" | "MEDIACONNECT" | String */
    }
    interface InputAttachment {
        var InputAttachmentName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var InputId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var InputSettings: InputSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputChannelLevel {
        var Gain: __integerMinNegative60Max6
        var InputChannel: __integerMin0Max15
    }
    interface InputClippingSettings {
        var InputTimecodeSource: String /* "ZEROBASED" | "EMBEDDED" | String */
        var StartTimecode: StartTimecode?
            get() = definedExternally
            set(value) = definedExternally
        var StopTimecode: StopTimecode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputDestination {
        var Ip: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Port: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Vpc: InputDestinationVpc?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputDestinationRequest {
        var StreamName: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputDestinationVpc {
        var AvailabilityZone: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkInterfaceId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputLocation {
        var PasswordParam: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Uri: __string
        var Username: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputLossBehavior {
        var BlackFrameMsec: __integerMin0Max1000000?
            get() = definedExternally
            set(value) = definedExternally
        var InputLossImageColor: __stringMin6Max6?
            get() = definedExternally
            set(value) = definedExternally
        var InputLossImageSlate: InputLocation?
            get() = definedExternally
            set(value) = definedExternally
        var InputLossImageType: String /* "COLOR" | "SLATE" | String */
        var RepeatFrameMsec: __integerMin0Max1000000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputSecurityGroup {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Inputs: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "IDLE" | "IN_USE" | "UPDATING" | "DELETED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var WhitelistRules: __listOfInputWhitelistRule?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputSettings {
        var AudioSelectors: __listOfAudioSelector?
            get() = definedExternally
            set(value) = definedExternally
        var CaptionSelectors: __listOfCaptionSelector?
            get() = definedExternally
            set(value) = definedExternally
        var DeblockFilter: String /* "DISABLED" | "ENABLED" | String */
        var DenoiseFilter: String /* "DISABLED" | "ENABLED" | String */
        var FilterStrength: __integerMin1Max5?
            get() = definedExternally
            set(value) = definedExternally
        var InputFilter: String /* "AUTO" | "DISABLED" | "FORCED" | String */
        var NetworkInputSettings: NetworkInputSettings?
            get() = definedExternally
            set(value) = definedExternally
        var SourceEndBehavior: String /* "CONTINUE" | "LOOP" | String */
        var VideoSelector: VideoSelector?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputSource {
        var PasswordParam: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Username: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputSourceRequest {
        var PasswordParam: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Username: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputSpecification {
        var Codec: String /* "MPEG2" | "AVC" | "HEVC" | String */
        var MaximumBitrate: String /* "MAX_10_MBPS" | "MAX_20_MBPS" | "MAX_50_MBPS" | String */
        var Resolution: String /* "SD" | "HD" | "UHD" | String */
    }
    interface InputSwitchScheduleActionSettings {
        var InputAttachmentNameReference: __string
        var InputClippingSettings: InputClippingSettings?
            get() = definedExternally
            set(value) = definedExternally
        var UrlPath: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputVpcRequest {
        var SecurityGroupIds: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: __listOf__string
    }
    interface InputWhitelistRule {
        var Cidr: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputWhitelistRuleCidr {
        var Cidr: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KeyProviderSettings {
        var StaticKeySettings: StaticKeySettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListChannelsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListChannelsResponse {
        var Channels: __listOfChannelSummary?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInputSecurityGroupsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInputSecurityGroupsResponse {
        var InputSecurityGroups: __listOfInputSecurityGroup?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInputsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInputsResponse {
        var Inputs: __listOfInput?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMultiplexProgramsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var MultiplexId: __string
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMultiplexProgramsResponse {
        var MultiplexPrograms: __listOfMultiplexProgramSummary?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMultiplexesRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMultiplexesResponse {
        var Multiplexes: __listOfMultiplexSummary?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOfferingsRequest {
        var ChannelClass: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelConfiguration: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Codec: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumBitrate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumFramerate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Resolution: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SpecialFeature: __string?
            get() = definedExternally
            set(value) = definedExternally
        var VideoQuality: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOfferingsResponse {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Offerings: __listOfOffering?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListReservationsRequest {
        var ChannelClass: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Codec: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumBitrate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumFramerate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Resolution: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SpecialFeature: __string?
            get() = definedExternally
            set(value) = definedExternally
        var VideoQuality: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListReservationsResponse {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Reservations: __listOfReservation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: __string
    }
    interface ListTagsForResourceResponse {
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface M2tsSettings {
        var AbsentInputAudioBehavior: String /* "DROP" | "ENCODE_SILENCE" | String */
        var Arib: String /* "DISABLED" | "ENABLED" | String */
        var AribCaptionsPid: __string?
            get() = definedExternally
            set(value) = definedExternally
        var AribCaptionsPidControl: String /* "AUTO" | "USE_CONFIGURED" | String */
        var AudioBufferModel: String /* "ATSC" | "DVB" | String */
        var AudioFramesPerPes: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var AudioPids: __string?
            get() = definedExternally
            set(value) = definedExternally
        var AudioStreamType: String /* "ATSC" | "DVB" | String */
        var Bitrate: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var BufferModel: String /* "MULTIPLEX" | "NONE" | String */
        var CcDescriptor: String /* "DISABLED" | "ENABLED" | String */
        var DvbNitSettings: DvbNitSettings?
            get() = definedExternally
            set(value) = definedExternally
        var DvbSdtSettings: DvbSdtSettings?
            get() = definedExternally
            set(value) = definedExternally
        var DvbSubPids: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DvbTdtSettings: DvbTdtSettings?
            get() = definedExternally
            set(value) = definedExternally
        var DvbTeletextPid: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Ebif: String /* "NONE" | "PASSTHROUGH" | String */
        var EbpAudioInterval: String /* "VIDEO_AND_FIXED_INTERVALS" | "VIDEO_INTERVAL" | String */
        var EbpLookaheadMs: __integerMin0Max10000?
            get() = definedExternally
            set(value) = definedExternally
        var EbpPlacement: String /* "VIDEO_AND_AUDIO_PIDS" | "VIDEO_PID" | String */
        var EcmPid: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EsRateInPes: String /* "EXCLUDE" | "INCLUDE" | String */
        var EtvPlatformPid: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EtvSignalPid: __string?
            get() = definedExternally
            set(value) = definedExternally
        var FragmentTime: __doubleMin0?
            get() = definedExternally
            set(value) = definedExternally
        var Klv: String /* "NONE" | "PASSTHROUGH" | String */
        var KlvDataPids: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NielsenId3Behavior: String /* "NO_PASSTHROUGH" | "PASSTHROUGH" | String */
        var NullPacketBitrate: __doubleMin0?
            get() = definedExternally
            set(value) = definedExternally
        var PatInterval: __integerMin0Max1000?
            get() = definedExternally
            set(value) = definedExternally
        var PcrControl: String /* "CONFIGURED_PCR_PERIOD" | "PCR_EVERY_PES_PACKET" | String */
        var PcrPeriod: __integerMin0Max500?
            get() = definedExternally
            set(value) = definedExternally
        var PcrPid: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PmtInterval: __integerMin0Max1000?
            get() = definedExternally
            set(value) = definedExternally
        var PmtPid: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramNum: __integerMin0Max65535?
            get() = definedExternally
            set(value) = definedExternally
        var RateMode: String /* "CBR" | "VBR" | String */
        var Scte27Pids: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Scte35Control: String /* "NONE" | "PASSTHROUGH" | String */
        var Scte35Pid: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentationMarkers: String /* "EBP" | "EBP_LEGACY" | "NONE" | "PSI_SEGSTART" | "RAI_ADAPT" | "RAI_SEGSTART" | String */
        var SegmentationStyle: String /* "MAINTAIN_CADENCE" | "RESET_CADENCE" | String */
        var SegmentationTime: __doubleMin1?
            get() = definedExternally
            set(value) = definedExternally
        var TimedMetadataBehavior: String /* "NO_PASSTHROUGH" | "PASSTHROUGH" | String */
        var TimedMetadataPid: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TransportStreamId: __integerMin0Max65535?
            get() = definedExternally
            set(value) = definedExternally
        var VideoPid: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface M3u8Settings {
        var AudioFramesPerPes: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var AudioPids: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EcmPid: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NielsenId3Behavior: String /* "NO_PASSTHROUGH" | "PASSTHROUGH" | String */
        var PatInterval: __integerMin0Max1000?
            get() = definedExternally
            set(value) = definedExternally
        var PcrControl: String /* "CONFIGURED_PCR_PERIOD" | "PCR_EVERY_PES_PACKET" | String */
        var PcrPeriod: __integerMin0Max500?
            get() = definedExternally
            set(value) = definedExternally
        var PcrPid: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PmtInterval: __integerMin0Max1000?
            get() = definedExternally
            set(value) = definedExternally
        var PmtPid: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramNum: __integerMin0Max65535?
            get() = definedExternally
            set(value) = definedExternally
        var Scte35Behavior: String /* "NO_PASSTHROUGH" | "PASSTHROUGH" | String */
        var Scte35Pid: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TimedMetadataBehavior: String /* "NO_PASSTHROUGH" | "PASSTHROUGH" | String */
        var TimedMetadataPid: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TransportStreamId: __integerMin0Max65535?
            get() = definedExternally
            set(value) = definedExternally
        var VideoPid: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MediaConnectFlow {
        var FlowArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MediaConnectFlowRequest {
        var FlowArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MediaPackageGroupSettings {
        var Destination: OutputLocationRef
    }
    interface MediaPackageOutputDestinationSettings {
        var ChannelId: __stringMin1?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MediaPackageOutputSettings
    interface Mp2Settings {
        var Bitrate: __double?
            get() = definedExternally
            set(value) = definedExternally
        var CodingMode: String /* "CODING_MODE_1_0" | "CODING_MODE_2_0" | String */
        var SampleRate: __double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MsSmoothGroupSettings {
        var AcquisitionPointId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var AudioOnlyTimecodeControl: String /* "PASSTHROUGH" | "USE_CONFIGURED_CLOCK" | String */
        var CertificateMode: String /* "SELF_SIGNED" | "VERIFY_AUTHENTICITY" | String */
        var ConnectionRetryInterval: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var Destination: OutputLocationRef
        var EventId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EventIdMode: String /* "NO_EVENT_ID" | "USE_CONFIGURED" | "USE_TIMESTAMP" | String */
        var EventStopBehavior: String /* "NONE" | "SEND_EOS" | String */
        var FilecacheDuration: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var FragmentLength: __integerMin1?
            get() = definedExternally
            set(value) = definedExternally
        var InputLossAction: String /* "EMIT_OUTPUT" | "PAUSE_OUTPUT" | String */
        var NumRetries: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var RestartDelay: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentationMode: String /* "USE_INPUT_SEGMENTATION" | "USE_SEGMENT_DURATION" | String */
        var SendDelayMs: __integerMin0Max10000?
            get() = definedExternally
            set(value) = definedExternally
        var SparseTrackType: String /* "NONE" | "SCTE_35" | String */
        var StreamManifestBehavior: String /* "DO_NOT_SEND" | "SEND" | String */
        var TimestampOffset: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TimestampOffsetMode: String /* "USE_CONFIGURED_OFFSET" | "USE_EVENT_START_DATE" | String */
    }
    interface MsSmoothOutputSettings {
        var H265PackagingType: String /* "HEV1" | "HVC1" | String */
        var NameModifier: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Multiplex {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZones: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Destinations: __listOfMultiplexOutputDestination?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MultiplexSettings: MultiplexSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PipelinesRunningCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "CREATING" | "CREATE_FAILED" | "IDLE" | "STARTING" | "RUNNING" | "RECOVERING" | "STOPPING" | "DELETING" | "DELETED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MultiplexGroupSettings
    interface MultiplexMediaConnectOutputDestinationSettings {
        var EntitlementArn: __stringMin1?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MultiplexOutputDestination {
        var MediaConnectSettings: MultiplexMediaConnectOutputDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MultiplexOutputSettings {
        var Destination: OutputLocationRef
    }
    interface MultiplexProgram {
        var ChannelId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MultiplexProgramSettings: MultiplexProgramSettings?
            get() = definedExternally
            set(value) = definedExternally
        var PacketIdentifiersMap: MultiplexProgramPacketIdentifiersMap?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramName: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MultiplexProgramChannelDestinationSettings {
        var MultiplexId: __stringMin1?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramName: __stringMin1?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MultiplexProgramPacketIdentifiersMap {
        var AudioPids: __listOf__integer?
            get() = definedExternally
            set(value) = definedExternally
        var DvbSubPids: __listOf__integer?
            get() = definedExternally
            set(value) = definedExternally
        var DvbTeletextPid: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var EtvPlatformPid: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var EtvSignalPid: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var KlvDataPids: __listOf__integer?
            get() = definedExternally
            set(value) = definedExternally
        var PcrPid: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var PmtPid: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateMetadataPid: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Scte27Pids: __listOf__integer?
            get() = definedExternally
            set(value) = definedExternally
        var Scte35Pid: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var TimedMetadataPid: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var VideoPid: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MultiplexProgramServiceDescriptor {
        var ProviderName: __stringMax256
        var ServiceName: __stringMax256
    }
    interface MultiplexProgramSettings {
        var PreferredChannelPipeline: String /* "CURRENTLY_ACTIVE" | "PIPELINE_0" | "PIPELINE_1" | String */
        var ProgramNumber: __integerMin0Max65535
        var ServiceDescriptor: MultiplexProgramServiceDescriptor?
            get() = definedExternally
            set(value) = definedExternally
        var VideoSettings: MultiplexVideoSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MultiplexProgramSummary {
        var ChannelId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramName: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MultiplexSettings {
        var MaximumVideoBufferDelayMilliseconds: __integerMin1000Max3000?
            get() = definedExternally
            set(value) = definedExternally
        var TransportStreamBitrate: __integerMin1000000Max100000000
        var TransportStreamId: __integerMin0Max65535
        var TransportStreamReservedBitrate: __integerMin0Max100000000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MultiplexSettingsSummary {
        var TransportStreamBitrate: __integerMin1000000Max100000000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MultiplexStatmuxVideoSettings {
        var MaximumBitrate: __integerMin100000Max100000000?
            get() = definedExternally
            set(value) = definedExternally
        var MinimumBitrate: __integerMin100000Max100000000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MultiplexSummary {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZones: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MultiplexSettings: MultiplexSettingsSummary?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PipelinesRunningCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "CREATING" | "CREATE_FAILED" | "IDLE" | "STARTING" | "RUNNING" | "RECOVERING" | "STOPPING" | "DELETING" | "DELETED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MultiplexVideoSettings {
        var ConstantBitrate: __integerMin100000Max100000000?
            get() = definedExternally
            set(value) = definedExternally
        var StatmuxSettings: MultiplexStatmuxVideoSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NetworkInputSettings {
        var HlsInputSettings: HlsInputSettings?
            get() = definedExternally
            set(value) = definedExternally
        var ServerValidation: String /* "CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME" | "CHECK_CRYPTOGRAPHY_ONLY" | String */
    }
    interface NielsenConfiguration {
        var DistributorId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NielsenPcmToId3Tagging: String /* "DISABLED" | "ENABLED" | String */
    }
    interface Offering {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CurrencyCode: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var DurationUnits: String /* "MONTHS" | String */
        var FixedPrice: __double?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingType: String /* "NO_UPFRONT" | String */
        var Region: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceSpecification: ReservationResourceSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var UsagePrice: __double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Output {
        var AudioDescriptionNames: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var CaptionDescriptionNames: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var OutputName: __stringMin1Max255?
            get() = definedExternally
            set(value) = definedExternally
        var OutputSettings: OutputSettings
        var VideoDescriptionName: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OutputDestination {
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MediaPackageSettings: __listOfMediaPackageOutputDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var MultiplexSettings: MultiplexProgramChannelDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Settings: __listOfOutputDestinationSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OutputDestinationSettings {
        var PasswordParam: __string?
            get() = definedExternally
            set(value) = definedExternally
        var StreamName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Username: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OutputGroup {
        var Name: __stringMax32?
            get() = definedExternally
            set(value) = definedExternally
        var OutputGroupSettings: OutputGroupSettings
        var Outputs: __listOfOutput
    }
    interface OutputGroupSettings {
        var ArchiveGroupSettings: ArchiveGroupSettings?
            get() = definedExternally
            set(value) = definedExternally
        var FrameCaptureGroupSettings: FrameCaptureGroupSettings?
            get() = definedExternally
            set(value) = definedExternally
        var HlsGroupSettings: HlsGroupSettings?
            get() = definedExternally
            set(value) = definedExternally
        var MediaPackageGroupSettings: MediaPackageGroupSettings?
            get() = definedExternally
            set(value) = definedExternally
        var MsSmoothGroupSettings: MsSmoothGroupSettings?
            get() = definedExternally
            set(value) = definedExternally
        var MultiplexGroupSettings: MultiplexGroupSettings?
            get() = definedExternally
            set(value) = definedExternally
        var RtmpGroupSettings: RtmpGroupSettings?
            get() = definedExternally
            set(value) = definedExternally
        var UdpGroupSettings: UdpGroupSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OutputLocationRef {
        var DestinationRefId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OutputSettings {
        var ArchiveOutputSettings: ArchiveOutputSettings?
            get() = definedExternally
            set(value) = definedExternally
        var FrameCaptureOutputSettings: FrameCaptureOutputSettings?
            get() = definedExternally
            set(value) = definedExternally
        var HlsOutputSettings: HlsOutputSettings?
            get() = definedExternally
            set(value) = definedExternally
        var MediaPackageOutputSettings: MediaPackageOutputSettings?
            get() = definedExternally
            set(value) = definedExternally
        var MsSmoothOutputSettings: MsSmoothOutputSettings?
            get() = definedExternally
            set(value) = definedExternally
        var MultiplexOutputSettings: MultiplexOutputSettings?
            get() = definedExternally
            set(value) = definedExternally
        var RtmpOutputSettings: RtmpOutputSettings?
            get() = definedExternally
            set(value) = definedExternally
        var UdpOutputSettings: UdpOutputSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PassThroughSettings
    interface PauseStateScheduleActionSettings {
        var Pipelines: __listOfPipelinePauseStateSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PipelineDetail {
        var ActiveInputAttachmentName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ActiveInputSwitchActionName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PipelineId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PipelinePauseStateSettings {
        var PipelineId: String /* "PIPELINE_0" | "PIPELINE_1" | String */
    }
    interface PurchaseOfferingRequest {
        var Count: __integerMin1
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingId: __string
        var RequestId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Start: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PurchaseOfferingResponse {
        var Reservation: Reservation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Rec601Settings
    interface Rec709Settings
    interface RemixSettings {
        var ChannelMappings: __listOfAudioChannelMapping
        var ChannelsIn: __integerMin1Max16?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelsOut: __integerMin1Max8?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Reservation {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Count: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var CurrencyCode: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var DurationUnits: String /* "MONTHS" | String */
        var End: __string?
            get() = definedExternally
            set(value) = definedExternally
        var FixedPrice: __double?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OfferingType: String /* "NO_UPFRONT" | String */
        var Region: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ReservationId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceSpecification: ReservationResourceSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var Start: __string?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ACTIVE" | "EXPIRED" | "CANCELED" | "DELETED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var UsagePrice: __double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReservationResourceSpecification {
        var ChannelClass: String /* "STANDARD" | "SINGLE_PIPELINE" | String */
        var Codec: String /* "MPEG2" | "AVC" | "HEVC" | "AUDIO" | String */
        var MaximumBitrate: String /* "MAX_10_MBPS" | "MAX_20_MBPS" | "MAX_50_MBPS" | String */
        var MaximumFramerate: String /* "MAX_30_FPS" | "MAX_60_FPS" | String */
        var Resolution: String /* "SD" | "HD" | "FHD" | "UHD" | String */
        var ResourceType: String /* "INPUT" | "OUTPUT" | "MULTIPLEX" | "CHANNEL" | String */
        var SpecialFeature: String /* "ADVANCED_AUDIO" | "AUDIO_NORMALIZATION" | String */
        var VideoQuality: String /* "STANDARD" | "ENHANCED" | "PREMIUM" | String */
    }
    interface RtmpCaptionInfoDestinationSettings
    interface RtmpGroupSettings {
        var AuthenticationScheme: String /* "AKAMAI" | "COMMON" | String */
        var CacheFullBehavior: String /* "DISCONNECT_IMMEDIATELY" | "WAIT_FOR_SERVER" | String */
        var CacheLength: __integerMin30?
            get() = definedExternally
            set(value) = definedExternally
        var CaptionData: String /* "ALL" | "FIELD1_608" | "FIELD1_AND_FIELD2_608" | String */
        var InputLossAction: String /* "EMIT_OUTPUT" | "PAUSE_OUTPUT" | String */
        var RestartDelay: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RtmpOutputSettings {
        var CertificateMode: String /* "SELF_SIGNED" | "VERIFY_AUTHENTICITY" | String */
        var ConnectionRetryInterval: __integerMin1?
            get() = definedExternally
            set(value) = definedExternally
        var Destination: OutputLocationRef
        var NumRetries: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScheduleAction {
        var ActionName: __string
        var ScheduleActionSettings: ScheduleActionSettings
        var ScheduleActionStartSettings: ScheduleActionStartSettings
    }
    interface ScheduleActionSettings {
        var HlsId3SegmentTaggingSettings: HlsId3SegmentTaggingScheduleActionSettings?
            get() = definedExternally
            set(value) = definedExternally
        var HlsTimedMetadataSettings: HlsTimedMetadataScheduleActionSettings?
            get() = definedExternally
            set(value) = definedExternally
        var InputSwitchSettings: InputSwitchScheduleActionSettings?
            get() = definedExternally
            set(value) = definedExternally
        var PauseStateSettings: PauseStateScheduleActionSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Scte35ReturnToNetworkSettings: Scte35ReturnToNetworkScheduleActionSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Scte35SpliceInsertSettings: Scte35SpliceInsertScheduleActionSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Scte35TimeSignalSettings: Scte35TimeSignalScheduleActionSettings?
            get() = definedExternally
            set(value) = definedExternally
        var StaticImageActivateSettings: StaticImageActivateScheduleActionSettings?
            get() = definedExternally
            set(value) = definedExternally
        var StaticImageDeactivateSettings: StaticImageDeactivateScheduleActionSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScheduleActionStartSettings {
        var FixedModeScheduleActionStartSettings: FixedModeScheduleActionStartSettings?
            get() = definedExternally
            set(value) = definedExternally
        var FollowModeScheduleActionStartSettings: FollowModeScheduleActionStartSettings?
            get() = definedExternally
            set(value) = definedExternally
        var ImmediateModeScheduleActionStartSettings: ImmediateModeScheduleActionStartSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Scte20PlusEmbeddedDestinationSettings
    interface Scte20SourceSettings {
        var Convert608To708: String /* "DISABLED" | "UPCONVERT" | String */
        var Source608ChannelNumber: __integerMin1Max4?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Scte27DestinationSettings
    interface Scte27SourceSettings {
        var Pid: __integerMin1?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Scte35DeliveryRestrictions {
        var ArchiveAllowedFlag: String /* "ARCHIVE_NOT_ALLOWED" | "ARCHIVE_ALLOWED" | String */
        var DeviceRestrictions: String /* "NONE" | "RESTRICT_GROUP0" | "RESTRICT_GROUP1" | "RESTRICT_GROUP2" | String */
        var NoRegionalBlackoutFlag: String /* "REGIONAL_BLACKOUT" | "NO_REGIONAL_BLACKOUT" | String */
        var WebDeliveryAllowedFlag: String /* "WEB_DELIVERY_NOT_ALLOWED" | "WEB_DELIVERY_ALLOWED" | String */
    }
    interface Scte35Descriptor {
        var Scte35DescriptorSettings: Scte35DescriptorSettings
    }
    interface Scte35DescriptorSettings {
        var SegmentationDescriptorScte35DescriptorSettings: Scte35SegmentationDescriptor
    }
    interface Scte35ReturnToNetworkScheduleActionSettings {
        var SpliceEventId: __longMin0Max4294967295
    }
    interface Scte35SegmentationDescriptor {
        var DeliveryRestrictions: Scte35DeliveryRestrictions?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentNum: __integerMin0Max255?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentationCancelIndicator: String /* "SEGMENTATION_EVENT_NOT_CANCELED" | "SEGMENTATION_EVENT_CANCELED" | String */
        var SegmentationDuration: __longMin0Max1099511627775?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentationEventId: __longMin0Max4294967295
        var SegmentationTypeId: __integerMin0Max255?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentationUpid: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentationUpidType: __integerMin0Max255?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentsExpected: __integerMin0Max255?
            get() = definedExternally
            set(value) = definedExternally
        var SubSegmentNum: __integerMin0Max255?
            get() = definedExternally
            set(value) = definedExternally
        var SubSegmentsExpected: __integerMin0Max255?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Scte35SpliceInsert {
        var AdAvailOffset: __integerMinNegative1000Max1000?
            get() = definedExternally
            set(value) = definedExternally
        var NoRegionalBlackoutFlag: String /* "FOLLOW" | "IGNORE" | String */
        var WebDeliveryAllowedFlag: String /* "FOLLOW" | "IGNORE" | String */
    }
    interface Scte35SpliceInsertScheduleActionSettings {
        var Duration: __longMin0Max8589934591?
            get() = definedExternally
            set(value) = definedExternally
        var SpliceEventId: __longMin0Max4294967295
    }
    interface Scte35TimeSignalApos {
        var AdAvailOffset: __integerMinNegative1000Max1000?
            get() = definedExternally
            set(value) = definedExternally
        var NoRegionalBlackoutFlag: String /* "FOLLOW" | "IGNORE" | String */
        var WebDeliveryAllowedFlag: String /* "FOLLOW" | "IGNORE" | String */
    }
    interface Scte35TimeSignalScheduleActionSettings {
        var Scte35Descriptors: __listOfScte35Descriptor
    }
    interface SmpteTtDestinationSettings
    interface StandardHlsSettings {
        var AudioRenditionSets: __string?
            get() = definedExternally
            set(value) = definedExternally
        var M3u8Settings: M3u8Settings
    }
    interface StartChannelRequest {
        var ChannelId: __string
    }
    interface StartChannelResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelClass: String /* "STANDARD" | "SINGLE_PIPELINE" | String */
        var Destinations: __listOfOutputDestination?
            get() = definedExternally
            set(value) = definedExternally
        var EgressEndpoints: __listOfChannelEgressEndpoint?
            get() = definedExternally
            set(value) = definedExternally
        var EncoderSettings: EncoderSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var InputAttachments: __listOfInputAttachment?
            get() = definedExternally
            set(value) = definedExternally
        var InputSpecification: InputSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var LogLevel: String /* "ERROR" | "WARNING" | "INFO" | "DEBUG" | "DISABLED" | String */
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PipelineDetails: __listOfPipelineDetail?
            get() = definedExternally
            set(value) = definedExternally
        var PipelinesRunningCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "CREATING" | "CREATE_FAILED" | "IDLE" | "STARTING" | "RUNNING" | "RECOVERING" | "STOPPING" | "DELETING" | "DELETED" | "UPDATING" | "UPDATE_FAILED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartMultiplexRequest {
        var MultiplexId: __string
    }
    interface StartMultiplexResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZones: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Destinations: __listOfMultiplexOutputDestination?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MultiplexSettings: MultiplexSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PipelinesRunningCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "CREATING" | "CREATE_FAILED" | "IDLE" | "STARTING" | "RUNNING" | "RECOVERING" | "STOPPING" | "DELETING" | "DELETED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartTimecode {
        var Timecode: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StaticImageActivateScheduleActionSettings {
        var Duration: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var FadeIn: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var FadeOut: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var Height: __integerMin1?
            get() = definedExternally
            set(value) = definedExternally
        var Image: InputLocation
        var ImageX: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var ImageY: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var Layer: __integerMin0Max7?
            get() = definedExternally
            set(value) = definedExternally
        var Opacity: __integerMin0Max100?
            get() = definedExternally
            set(value) = definedExternally
        var Width: __integerMin1?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StaticImageDeactivateScheduleActionSettings {
        var FadeOut: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
        var Layer: __integerMin0Max7?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StaticKeySettings {
        var KeyProviderServer: InputLocation?
            get() = definedExternally
            set(value) = definedExternally
        var StaticKeyValue: __stringMin32Max32
    }
    interface StopChannelRequest {
        var ChannelId: __string
    }
    interface StopChannelResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelClass: String /* "STANDARD" | "SINGLE_PIPELINE" | String */
        var Destinations: __listOfOutputDestination?
            get() = definedExternally
            set(value) = definedExternally
        var EgressEndpoints: __listOfChannelEgressEndpoint?
            get() = definedExternally
            set(value) = definedExternally
        var EncoderSettings: EncoderSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var InputAttachments: __listOfInputAttachment?
            get() = definedExternally
            set(value) = definedExternally
        var InputSpecification: InputSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var LogLevel: String /* "ERROR" | "WARNING" | "INFO" | "DEBUG" | "DISABLED" | String */
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PipelineDetails: __listOfPipelineDetail?
            get() = definedExternally
            set(value) = definedExternally
        var PipelinesRunningCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "CREATING" | "CREATE_FAILED" | "IDLE" | "STARTING" | "RUNNING" | "RECOVERING" | "STOPPING" | "DELETING" | "DELETED" | "UPDATING" | "UPDATE_FAILED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopMultiplexRequest {
        var MultiplexId: __string
    }
    interface StopMultiplexResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZones: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Destinations: __listOfMultiplexOutputDestination?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MultiplexSettings: MultiplexSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PipelinesRunningCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "CREATING" | "CREATE_FAILED" | "IDLE" | "STARTING" | "RUNNING" | "RECOVERING" | "STOPPING" | "DELETING" | "DELETED" | String */
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopTimecode {
        var LastFrameClippingBehavior: String /* "EXCLUDE_LAST_FRAME" | "INCLUDE_LAST_FRAME" | String */
        var Timecode: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tags {
        @nativeGetter
        operator fun get(key: String): __string?
        @nativeSetter
        operator fun set(key: String, value: __string)
    }
    interface TeletextDestinationSettings
    interface TeletextSourceSettings {
        var PageNumber: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TimecodeConfig {
        var Source: String /* "EMBEDDED" | "SYSTEMCLOCK" | "ZEROBASED" | String */
        var SyncThreshold: __integerMin1Max1000000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TtmlDestinationSettings {
        var StyleControl: String /* "PASSTHROUGH" | "USE_CONFIGURED" | String */
    }
    interface UdpContainerSettings {
        var M2tsSettings: M2tsSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UdpGroupSettings {
        var InputLossAction: String /* "DROP_PROGRAM" | "DROP_TS" | "EMIT_PROGRAM" | String */
        var TimedMetadataId3Frame: String /* "NONE" | "PRIV" | "TDRL" | String */
        var TimedMetadataId3Period: __integerMin0?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UdpOutputSettings {
        var BufferMsec: __integerMin0Max10000?
            get() = definedExternally
            set(value) = definedExternally
        var ContainerSettings: UdpContainerSettings
        var Destination: OutputLocationRef
        var FecOutputSettings: FecOutputSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateChannelClassRequest {
        var ChannelClass: String /* "STANDARD" | "SINGLE_PIPELINE" | String */
        var ChannelId: __string
        var Destinations: __listOfOutputDestination?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateChannelClassResponse {
        var Channel: Channel?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateChannelRequest {
        var ChannelId: __string
        var Destinations: __listOfOutputDestination?
            get() = definedExternally
            set(value) = definedExternally
        var EncoderSettings: EncoderSettings?
            get() = definedExternally
            set(value) = definedExternally
        var InputAttachments: __listOfInputAttachment?
            get() = definedExternally
            set(value) = definedExternally
        var InputSpecification: InputSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var LogLevel: String /* "ERROR" | "WARNING" | "INFO" | "DEBUG" | "DISABLED" | String */
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateChannelResponse {
        var Channel: Channel?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateInputRequest {
        var Destinations: __listOfInputDestinationRequest?
            get() = definedExternally
            set(value) = definedExternally
        var InputId: __string
        var InputSecurityGroups: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var MediaConnectFlows: __listOfMediaConnectFlowRequest?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Sources: __listOfInputSourceRequest?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateInputResponse {
        var Input: Input?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateInputSecurityGroupRequest {
        var InputSecurityGroupId: __string
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var WhitelistRules: __listOfInputWhitelistRuleCidr?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateInputSecurityGroupResponse {
        var SecurityGroup: InputSecurityGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMultiplexProgramRequest {
        var MultiplexId: __string
        var MultiplexProgramSettings: MultiplexProgramSettings?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramName: __string
    }
    interface UpdateMultiplexProgramResponse {
        var MultiplexProgram: MultiplexProgram?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMultiplexRequest {
        var MultiplexId: __string
        var MultiplexSettings: MultiplexSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMultiplexResponse {
        var Multiplex: Multiplex?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateReservationRequest {
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ReservationId: __string
    }
    interface UpdateReservationResponse {
        var Reservation: Reservation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VideoCodecSettings {
        var FrameCaptureSettings: FrameCaptureSettings?
            get() = definedExternally
            set(value) = definedExternally
        var H264Settings: H264Settings?
            get() = definedExternally
            set(value) = definedExternally
        var H265Settings: H265Settings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VideoDescription {
        var CodecSettings: VideoCodecSettings?
            get() = definedExternally
            set(value) = definedExternally
        var Height: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string
        var RespondToAfd: String /* "NONE" | "PASSTHROUGH" | "RESPOND" | String */
        var ScalingBehavior: String /* "DEFAULT" | "STRETCH_TO_OUTPUT" | String */
        var Sharpness: __integerMin0Max100?
            get() = definedExternally
            set(value) = definedExternally
        var Width: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VideoSelector {
        var ColorSpace: String /* "FOLLOW" | "REC_601" | "REC_709" | String */
        var ColorSpaceUsage: String /* "FALLBACK" | "FORCE" | String */
        var SelectorSettings: VideoSelectorSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VideoSelectorPid {
        var Pid: __integerMin0Max8191?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VideoSelectorProgramId {
        var ProgramId: __integerMin0Max65536?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VideoSelectorSettings {
        var VideoSelectorPid: VideoSelectorPid?
            get() = definedExternally
            set(value) = definedExternally
        var VideoSelectorProgramId: VideoSelectorProgramId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WebvttDestinationSettings
    interface ClientApiVersions {
        var apiVersion: String /* "2017-10-14" | "latest" | String */
    }
}