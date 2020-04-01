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
import Pinpoint.ActivityResponse
import Pinpoint.ApplicationResponse
import Pinpoint.CampaignResponse
import Pinpoint.EndpointBatchItem
import Pinpoint.EndpointResponse
import Pinpoint.ExportJobResponse
import Pinpoint.ImportJobResponse
import Pinpoint.JourneyResponse
import Pinpoint.MultiConditionalBranch
import Pinpoint.RandomSplitEntry
import Pinpoint.RecommenderConfigurationResponse
import Pinpoint.ResultRow
import Pinpoint.ResultRowValue
import Pinpoint.SegmentDimensions
import Pinpoint.SegmentGroup
import Pinpoint.SegmentReference
import Pinpoint.SegmentResponse
import Pinpoint.SimpleCondition
import Pinpoint.TemplateResponse
import Pinpoint.TemplateVersionResponse
import Pinpoint.TreatmentResource
import Pinpoint.WriteTreatmentResource
import Pinpoint.CreateAppRequest
import Pinpoint.CreateAppResponse
import Pinpoint.CreateCampaignRequest
import Pinpoint.CreateCampaignResponse
import Pinpoint.CreateEmailTemplateRequest
import Pinpoint.CreateEmailTemplateResponse
import Pinpoint.CreateExportJobRequest
import Pinpoint.CreateExportJobResponse
import Pinpoint.CreateImportJobRequest
import Pinpoint.CreateImportJobResponse
import Pinpoint.CreateJourneyRequest
import Pinpoint.CreateJourneyResponse
import Pinpoint.CreatePushTemplateRequest
import Pinpoint.CreatePushTemplateResponse
import Pinpoint.CreateRecommenderConfigurationRequest
import Pinpoint.CreateRecommenderConfigurationResponse
import Pinpoint.CreateSegmentRequest
import Pinpoint.CreateSegmentResponse
import Pinpoint.CreateSmsTemplateRequest
import Pinpoint.CreateSmsTemplateResponse
import Pinpoint.CreateVoiceTemplateRequest
import Pinpoint.CreateVoiceTemplateResponse
import Pinpoint.DeleteAdmChannelRequest
import Pinpoint.DeleteAdmChannelResponse
import Pinpoint.DeleteApnsChannelRequest
import Pinpoint.DeleteApnsChannelResponse
import Pinpoint.DeleteApnsSandboxChannelRequest
import Pinpoint.DeleteApnsSandboxChannelResponse
import Pinpoint.DeleteApnsVoipChannelRequest
import Pinpoint.DeleteApnsVoipChannelResponse
import Pinpoint.DeleteApnsVoipSandboxChannelRequest
import Pinpoint.DeleteApnsVoipSandboxChannelResponse
import Pinpoint.DeleteAppRequest
import Pinpoint.DeleteAppResponse
import Pinpoint.DeleteBaiduChannelRequest
import Pinpoint.DeleteBaiduChannelResponse
import Pinpoint.DeleteCampaignRequest
import Pinpoint.DeleteCampaignResponse
import Pinpoint.DeleteEmailChannelRequest
import Pinpoint.DeleteEmailChannelResponse
import Pinpoint.DeleteEmailTemplateRequest
import Pinpoint.DeleteEmailTemplateResponse
import Pinpoint.DeleteEndpointRequest
import Pinpoint.DeleteEndpointResponse
import Pinpoint.DeleteEventStreamRequest
import Pinpoint.DeleteEventStreamResponse
import Pinpoint.DeleteGcmChannelRequest
import Pinpoint.DeleteGcmChannelResponse
import Pinpoint.DeleteJourneyRequest
import Pinpoint.DeleteJourneyResponse
import Pinpoint.DeletePushTemplateRequest
import Pinpoint.DeletePushTemplateResponse
import Pinpoint.DeleteRecommenderConfigurationRequest
import Pinpoint.DeleteRecommenderConfigurationResponse
import Pinpoint.DeleteSegmentRequest
import Pinpoint.DeleteSegmentResponse
import Pinpoint.DeleteSmsChannelRequest
import Pinpoint.DeleteSmsChannelResponse
import Pinpoint.DeleteSmsTemplateRequest
import Pinpoint.DeleteSmsTemplateResponse
import Pinpoint.DeleteUserEndpointsRequest
import Pinpoint.DeleteUserEndpointsResponse
import Pinpoint.DeleteVoiceChannelRequest
import Pinpoint.DeleteVoiceChannelResponse
import Pinpoint.DeleteVoiceTemplateRequest
import Pinpoint.DeleteVoiceTemplateResponse
import Pinpoint.GetAdmChannelRequest
import Pinpoint.GetAdmChannelResponse
import Pinpoint.GetApnsChannelRequest
import Pinpoint.GetApnsChannelResponse
import Pinpoint.GetApnsSandboxChannelRequest
import Pinpoint.GetApnsSandboxChannelResponse
import Pinpoint.GetApnsVoipChannelRequest
import Pinpoint.GetApnsVoipChannelResponse
import Pinpoint.GetApnsVoipSandboxChannelRequest
import Pinpoint.GetApnsVoipSandboxChannelResponse
import Pinpoint.GetAppRequest
import Pinpoint.GetAppResponse
import Pinpoint.GetApplicationDateRangeKpiRequest
import Pinpoint.GetApplicationDateRangeKpiResponse
import Pinpoint.GetApplicationSettingsRequest
import Pinpoint.GetApplicationSettingsResponse
import Pinpoint.GetAppsRequest
import Pinpoint.GetAppsResponse
import Pinpoint.GetBaiduChannelRequest
import Pinpoint.GetBaiduChannelResponse
import Pinpoint.GetCampaignRequest
import Pinpoint.GetCampaignResponse
import Pinpoint.GetCampaignActivitiesRequest
import Pinpoint.GetCampaignActivitiesResponse
import Pinpoint.GetCampaignDateRangeKpiRequest
import Pinpoint.GetCampaignDateRangeKpiResponse
import Pinpoint.GetCampaignVersionRequest
import Pinpoint.GetCampaignVersionResponse
import Pinpoint.GetCampaignVersionsRequest
import Pinpoint.GetCampaignVersionsResponse
import Pinpoint.GetCampaignsRequest
import Pinpoint.GetCampaignsResponse
import Pinpoint.GetChannelsRequest
import Pinpoint.GetChannelsResponse
import Pinpoint.GetEmailChannelRequest
import Pinpoint.GetEmailChannelResponse
import Pinpoint.GetEmailTemplateRequest
import Pinpoint.GetEmailTemplateResponse
import Pinpoint.GetEndpointRequest
import Pinpoint.GetEndpointResponse
import Pinpoint.GetEventStreamRequest
import Pinpoint.GetEventStreamResponse
import Pinpoint.GetExportJobRequest
import Pinpoint.GetExportJobResponse
import Pinpoint.GetExportJobsRequest
import Pinpoint.GetExportJobsResponse
import Pinpoint.GetGcmChannelRequest
import Pinpoint.GetGcmChannelResponse
import Pinpoint.GetImportJobRequest
import Pinpoint.GetImportJobResponse
import Pinpoint.GetImportJobsRequest
import Pinpoint.GetImportJobsResponse
import Pinpoint.GetJourneyRequest
import Pinpoint.GetJourneyResponse
import Pinpoint.GetJourneyDateRangeKpiRequest
import Pinpoint.GetJourneyDateRangeKpiResponse
import Pinpoint.GetJourneyExecutionActivityMetricsRequest
import Pinpoint.GetJourneyExecutionActivityMetricsResponse
import Pinpoint.GetJourneyExecutionMetricsRequest
import Pinpoint.GetJourneyExecutionMetricsResponse
import Pinpoint.GetPushTemplateRequest
import Pinpoint.GetPushTemplateResponse
import Pinpoint.GetRecommenderConfigurationRequest
import Pinpoint.GetRecommenderConfigurationResponse
import Pinpoint.GetRecommenderConfigurationsRequest
import Pinpoint.GetRecommenderConfigurationsResponse
import Pinpoint.GetSegmentRequest
import Pinpoint.GetSegmentResponse
import Pinpoint.GetSegmentExportJobsRequest
import Pinpoint.GetSegmentExportJobsResponse
import Pinpoint.GetSegmentImportJobsRequest
import Pinpoint.GetSegmentImportJobsResponse
import Pinpoint.GetSegmentVersionRequest
import Pinpoint.GetSegmentVersionResponse
import Pinpoint.GetSegmentVersionsRequest
import Pinpoint.GetSegmentVersionsResponse
import Pinpoint.GetSegmentsRequest
import Pinpoint.GetSegmentsResponse
import Pinpoint.GetSmsChannelRequest
import Pinpoint.GetSmsChannelResponse
import Pinpoint.GetSmsTemplateRequest
import Pinpoint.GetSmsTemplateResponse
import Pinpoint.GetUserEndpointsRequest
import Pinpoint.GetUserEndpointsResponse
import Pinpoint.GetVoiceChannelRequest
import Pinpoint.GetVoiceChannelResponse
import Pinpoint.GetVoiceTemplateRequest
import Pinpoint.GetVoiceTemplateResponse
import Pinpoint.ListJourneysRequest
import Pinpoint.ListJourneysResponse
import Pinpoint.ListTagsForResourceRequest
import Pinpoint.ListTagsForResourceResponse
import Pinpoint.ListTemplateVersionsRequest
import Pinpoint.ListTemplateVersionsResponse
import Pinpoint.ListTemplatesRequest
import Pinpoint.ListTemplatesResponse
import Pinpoint.PhoneNumberValidateRequest
import Pinpoint.PhoneNumberValidateResponse
import Pinpoint.PutEventStreamRequest
import Pinpoint.PutEventStreamResponse
import Pinpoint.PutEventsRequest
import Pinpoint.PutEventsResponse
import Pinpoint.RemoveAttributesRequest
import Pinpoint.RemoveAttributesResponse
import Pinpoint.SendMessagesRequest
import Pinpoint.SendMessagesResponse
import Pinpoint.SendUsersMessagesRequest
import Pinpoint.SendUsersMessagesResponse
import Pinpoint.TagResourceRequest
import Pinpoint.UntagResourceRequest
import Pinpoint.UpdateAdmChannelRequest
import Pinpoint.UpdateAdmChannelResponse
import Pinpoint.UpdateApnsChannelRequest
import Pinpoint.UpdateApnsChannelResponse
import Pinpoint.UpdateApnsSandboxChannelRequest
import Pinpoint.UpdateApnsSandboxChannelResponse
import Pinpoint.UpdateApnsVoipChannelRequest
import Pinpoint.UpdateApnsVoipChannelResponse
import Pinpoint.UpdateApnsVoipSandboxChannelRequest
import Pinpoint.UpdateApnsVoipSandboxChannelResponse
import Pinpoint.UpdateApplicationSettingsRequest
import Pinpoint.UpdateApplicationSettingsResponse
import Pinpoint.UpdateBaiduChannelRequest
import Pinpoint.UpdateBaiduChannelResponse
import Pinpoint.UpdateCampaignRequest
import Pinpoint.UpdateCampaignResponse
import Pinpoint.UpdateEmailChannelRequest
import Pinpoint.UpdateEmailChannelResponse
import Pinpoint.UpdateEmailTemplateRequest
import Pinpoint.UpdateEmailTemplateResponse
import Pinpoint.UpdateEndpointRequest
import Pinpoint.UpdateEndpointResponse
import Pinpoint.UpdateEndpointsBatchRequest
import Pinpoint.UpdateEndpointsBatchResponse
import Pinpoint.UpdateGcmChannelRequest
import Pinpoint.UpdateGcmChannelResponse
import Pinpoint.UpdateJourneyRequest
import Pinpoint.UpdateJourneyResponse
import Pinpoint.UpdateJourneyStateRequest
import Pinpoint.UpdateJourneyStateResponse
import Pinpoint.UpdatePushTemplateRequest
import Pinpoint.UpdatePushTemplateResponse
import Pinpoint.UpdateRecommenderConfigurationRequest
import Pinpoint.UpdateRecommenderConfigurationResponse
import Pinpoint.UpdateSegmentRequest
import Pinpoint.UpdateSegmentResponse
import Pinpoint.UpdateSmsChannelRequest
import Pinpoint.UpdateSmsChannelResponse
import Pinpoint.UpdateSmsTemplateRequest
import Pinpoint.UpdateSmsTemplateResponse
import Pinpoint.UpdateTemplateActiveVersionRequest
import Pinpoint.UpdateTemplateActiveVersionResponse
import Pinpoint.UpdateVoiceChannelRequest
import Pinpoint.UpdateVoiceChannelResponse
import Pinpoint.UpdateVoiceTemplateRequest
import Pinpoint.UpdateVoiceTemplateResponse
import Pinpoint.MapOf__string
import Pinpoint.MapOfListOf__string
import Pinpoint.ConditionalSplitActivity
import Pinpoint.EmailMessageActivity
import Pinpoint.HoldoutActivity
import Pinpoint.MultiConditionalSplitActivity
import Pinpoint.RandomSplitActivity
import Pinpoint.WaitActivity
import Pinpoint.BaseKpiResult
import Pinpoint.CampaignHook
import Pinpoint.CampaignLimits
import Pinpoint.QuietTime
import Pinpoint.EventDimensions
import Pinpoint.CampaignState
import Pinpoint.MessageConfiguration
import Pinpoint.Schedule
import Pinpoint.TemplateConfiguration
import Pinpoint.MapOfChannelResponse
import Pinpoint.Condition
import Pinpoint.WaitTime
import Pinpoint.CreateApplicationRequest
import Pinpoint.WriteCampaignRequest
import Pinpoint.EmailTemplateRequest
import Pinpoint.CreateTemplateMessageBody
import Pinpoint.ExportJobRequest
import Pinpoint.ImportJobRequest
import Pinpoint.WriteJourneyRequest
import Pinpoint.PushNotificationTemplateRequest
import Pinpoint.CreateRecommenderConfiguration
import Pinpoint.WriteSegmentRequest
import Pinpoint.SMSTemplateRequest
import Pinpoint.VoiceTemplateRequest
import Pinpoint.ADMChannelResponse
import Pinpoint.APNSChannelResponse
import Pinpoint.APNSSandboxChannelResponse
import Pinpoint.APNSVoipChannelResponse
import Pinpoint.APNSVoipSandboxChannelResponse
import Pinpoint.BaiduChannelResponse
import Pinpoint.EmailChannelResponse
import Pinpoint.MessageBody
import Pinpoint.EventStream
import Pinpoint.GCMChannelResponse
import Pinpoint.SMSChannelResponse
import Pinpoint.EndpointsResponse
import Pinpoint.VoiceChannelResponse
import Pinpoint.ADMMessage
import Pinpoint.APNSMessage
import Pinpoint.BaiduMessage
import Pinpoint.DefaultMessage
import Pinpoint.DefaultPushNotificationMessage
import Pinpoint.EmailMessage
import Pinpoint.GCMMessage
import Pinpoint.SMSMessage
import Pinpoint.VoiceMessage
import Pinpoint.RawEmail
import Pinpoint.SimpleEmail
import Pinpoint.JourneyEmailMessage
import Pinpoint.EndpointDemographic
import Pinpoint.EndpointLocation
import Pinpoint.MapOf__double
import Pinpoint.EndpointUser
import Pinpoint.Session
import Pinpoint.MapOfAttributeDimension
import Pinpoint.SetDimension
import Pinpoint.MapOfMetricDimension
import Pinpoint.PublicEndpoint
import Pinpoint.MapOfEvent
import Pinpoint.MapOfEventsBatch
import Pinpoint.MapOfItemResponse
import Pinpoint.ExportJobResource
import Pinpoint.GPSCoordinates
import Pinpoint.ApplicationDateRangeKpiResponse
import Pinpoint.ApplicationSettingsResource
import Pinpoint.ApplicationsResponse
import Pinpoint.ActivitiesResponse
import Pinpoint.CampaignDateRangeKpiResponse
import Pinpoint.CampaignsResponse
import Pinpoint.ChannelsResponse
import Pinpoint.EmailTemplateResponse
import Pinpoint.ExportJobsResponse
import Pinpoint.ImportJobsResponse
import Pinpoint.JourneyDateRangeKpiResponse
import Pinpoint.JourneyExecutionActivityMetricsResponse
import Pinpoint.JourneyExecutionMetricsResponse
import Pinpoint.PushNotificationTemplateResponse
import Pinpoint.ListRecommenderConfigurationsResponse
import Pinpoint.SegmentsResponse
import Pinpoint.SMSTemplateResponse
import Pinpoint.VoiceTemplateResponse
import Pinpoint.ImportJobResource
import Pinpoint.EndpointItemResponse
import Pinpoint.MapOfEventItemResponse
import Pinpoint.MapOfActivity
import Pinpoint.JourneyLimits
import Pinpoint.JourneySchedule
import Pinpoint.StartCondition
import Pinpoint.JourneysResponse
import Pinpoint.TagsModel
import Pinpoint.TemplateVersionsResponse
import Pinpoint.TemplatesResponse
import Pinpoint.Message
import Pinpoint.CampaignEmailMessage
import Pinpoint.CampaignSmsMessage
import Pinpoint.MapOfAddressConfiguration
import Pinpoint.MapOfEndpointSendConfiguration
import Pinpoint.DirectMessageConfiguration
import Pinpoint.MapOfEndpointMessageResult
import Pinpoint.MapOfMessageResult
import Pinpoint.NumberValidateRequest
import Pinpoint.NumberValidateResponse
import Pinpoint.AndroidPushNotificationTemplate
import Pinpoint.APNSPushNotificationTemplate
import Pinpoint.DefaultPushNotificationTemplate
import Pinpoint.WriteEventStream
import Pinpoint.EventsRequest
import Pinpoint.EventsResponse
import Pinpoint.UpdateAttributesRequest
import Pinpoint.AttributesResource
import Pinpoint.CampaignEventFilter
import Pinpoint.RecencyDimension
import Pinpoint.SegmentBehaviors
import Pinpoint.SegmentDemographics
import Pinpoint.SegmentLocation
import Pinpoint.MapOf__integer
import Pinpoint.GPSPointDimension
import Pinpoint.SegmentImportResource
import Pinpoint.SegmentGroupList
import Pinpoint.MessageRequest
import Pinpoint.MessageResponse
import Pinpoint.MapOfMapOfEndpointMessageResult
import Pinpoint.SendUsersMessageRequest
import Pinpoint.SendUsersMessageResponse
import Pinpoint.EventCondition
import Pinpoint.SegmentCondition
import Pinpoint.SimpleEmailPart
import Pinpoint.Template
import Pinpoint.ADMChannelRequest
import Pinpoint.APNSChannelRequest
import Pinpoint.APNSSandboxChannelRequest
import Pinpoint.APNSVoipChannelRequest
import Pinpoint.APNSVoipSandboxChannelRequest
import Pinpoint.WriteApplicationSettingsRequest
import Pinpoint.BaiduChannelRequest
import Pinpoint.EmailChannelRequest
import Pinpoint.EndpointRequest
import Pinpoint.EndpointBatchRequest
import Pinpoint.GCMChannelRequest
import Pinpoint.JourneyStateRequest
import Pinpoint.UpdateRecommenderConfiguration
import Pinpoint.SMSChannelRequest
import Pinpoint.TemplateActiveVersionRequest
import Pinpoint.VoiceChannelRequest
import Pinpoint.Activity
import Pinpoint.AddressConfiguration
import Pinpoint.AttributeDimension
import Pinpoint.ChannelResponse
import Pinpoint.EndpointMessageResult
import Pinpoint.EndpointSendConfiguration
import Pinpoint.Event
import Pinpoint.EventItemResponse
import Pinpoint.EventsBatch
import Pinpoint.ItemResponse
import Pinpoint.MessageResult
import Pinpoint.MetricDimension

typealias __boolean = Boolean

typealias __double = Number

typealias __integer = Number

typealias ListOfActivityResponse = Array<ActivityResponse>

typealias ListOfApplicationResponse = Array<ApplicationResponse>

typealias ListOfCampaignResponse = Array<CampaignResponse>

typealias ListOfEndpointBatchItem = Array<EndpointBatchItem>

typealias ListOfEndpointResponse = Array<EndpointResponse>

typealias ListOfExportJobResponse = Array<ExportJobResponse>

typealias ListOfImportJobResponse = Array<ImportJobResponse>

typealias ListOfJourneyResponse = Array<JourneyResponse>

typealias ListOfMultiConditionalBranch = Array<MultiConditionalBranch>

typealias ListOfRandomSplitEntry = Array<RandomSplitEntry>

typealias ListOfRecommenderConfigurationResponse = Array<RecommenderConfigurationResponse>

typealias ListOfResultRow = Array<ResultRow>

typealias ListOfResultRowValue = Array<ResultRowValue>

typealias ListOfSegmentDimensions = Array<SegmentDimensions>

typealias ListOfSegmentGroup = Array<SegmentGroup>

typealias ListOfSegmentReference = Array<SegmentReference>

typealias ListOfSegmentResponse = Array<SegmentResponse>

typealias ListOfSimpleCondition = Array<SimpleCondition>

typealias ListOfTemplateResponse = Array<TemplateResponse>

typealias ListOfTemplateVersionResponse = Array<TemplateVersionResponse>

typealias ListOfTreatmentResource = Array<TreatmentResource>

typealias ListOfWriteTreatmentResource = Array<WriteTreatmentResource>

typealias ListOf__string = Array<__string>

typealias __string = String

typealias __timestampIso8601 = Date

@JsModule("aws-sdk")
external open class Pinpoint(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Pinpoint.Types.ClientConfiguration */
    open fun createApp(params: CreateAppRequest, callback: (err: AWSError, data: CreateAppResponse) -> Unit = definedExternally): Request<CreateAppResponse, AWSError>
    open fun createApp(callback: (err: AWSError, data: CreateAppResponse) -> Unit = definedExternally): Request<CreateAppResponse, AWSError>
    open fun createCampaign(params: CreateCampaignRequest, callback: (err: AWSError, data: CreateCampaignResponse) -> Unit = definedExternally): Request<CreateCampaignResponse, AWSError>
    open fun createCampaign(callback: (err: AWSError, data: CreateCampaignResponse) -> Unit = definedExternally): Request<CreateCampaignResponse, AWSError>
    open fun createEmailTemplate(params: CreateEmailTemplateRequest, callback: (err: AWSError, data: CreateEmailTemplateResponse) -> Unit = definedExternally): Request<CreateEmailTemplateResponse, AWSError>
    open fun createEmailTemplate(callback: (err: AWSError, data: CreateEmailTemplateResponse) -> Unit = definedExternally): Request<CreateEmailTemplateResponse, AWSError>
    open fun createExportJob(params: CreateExportJobRequest, callback: (err: AWSError, data: CreateExportJobResponse) -> Unit = definedExternally): Request<CreateExportJobResponse, AWSError>
    open fun createExportJob(callback: (err: AWSError, data: CreateExportJobResponse) -> Unit = definedExternally): Request<CreateExportJobResponse, AWSError>
    open fun createImportJob(params: CreateImportJobRequest, callback: (err: AWSError, data: CreateImportJobResponse) -> Unit = definedExternally): Request<CreateImportJobResponse, AWSError>
    open fun createImportJob(callback: (err: AWSError, data: CreateImportJobResponse) -> Unit = definedExternally): Request<CreateImportJobResponse, AWSError>
    open fun createJourney(params: CreateJourneyRequest, callback: (err: AWSError, data: CreateJourneyResponse) -> Unit = definedExternally): Request<CreateJourneyResponse, AWSError>
    open fun createJourney(callback: (err: AWSError, data: CreateJourneyResponse) -> Unit = definedExternally): Request<CreateJourneyResponse, AWSError>
    open fun createPushTemplate(params: CreatePushTemplateRequest, callback: (err: AWSError, data: CreatePushTemplateResponse) -> Unit = definedExternally): Request<CreatePushTemplateResponse, AWSError>
    open fun createPushTemplate(callback: (err: AWSError, data: CreatePushTemplateResponse) -> Unit = definedExternally): Request<CreatePushTemplateResponse, AWSError>
    open fun createRecommenderConfiguration(params: CreateRecommenderConfigurationRequest, callback: (err: AWSError, data: CreateRecommenderConfigurationResponse) -> Unit = definedExternally): Request<CreateRecommenderConfigurationResponse, AWSError>
    open fun createRecommenderConfiguration(callback: (err: AWSError, data: CreateRecommenderConfigurationResponse) -> Unit = definedExternally): Request<CreateRecommenderConfigurationResponse, AWSError>
    open fun createSegment(params: CreateSegmentRequest, callback: (err: AWSError, data: CreateSegmentResponse) -> Unit = definedExternally): Request<CreateSegmentResponse, AWSError>
    open fun createSegment(callback: (err: AWSError, data: CreateSegmentResponse) -> Unit = definedExternally): Request<CreateSegmentResponse, AWSError>
    open fun createSmsTemplate(params: CreateSmsTemplateRequest, callback: (err: AWSError, data: CreateSmsTemplateResponse) -> Unit = definedExternally): Request<CreateSmsTemplateResponse, AWSError>
    open fun createSmsTemplate(callback: (err: AWSError, data: CreateSmsTemplateResponse) -> Unit = definedExternally): Request<CreateSmsTemplateResponse, AWSError>
    open fun createVoiceTemplate(params: CreateVoiceTemplateRequest, callback: (err: AWSError, data: CreateVoiceTemplateResponse) -> Unit = definedExternally): Request<CreateVoiceTemplateResponse, AWSError>
    open fun createVoiceTemplate(callback: (err: AWSError, data: CreateVoiceTemplateResponse) -> Unit = definedExternally): Request<CreateVoiceTemplateResponse, AWSError>
    open fun deleteAdmChannel(params: DeleteAdmChannelRequest, callback: (err: AWSError, data: DeleteAdmChannelResponse) -> Unit = definedExternally): Request<DeleteAdmChannelResponse, AWSError>
    open fun deleteAdmChannel(callback: (err: AWSError, data: DeleteAdmChannelResponse) -> Unit = definedExternally): Request<DeleteAdmChannelResponse, AWSError>
    open fun deleteApnsChannel(params: DeleteApnsChannelRequest, callback: (err: AWSError, data: DeleteApnsChannelResponse) -> Unit = definedExternally): Request<DeleteApnsChannelResponse, AWSError>
    open fun deleteApnsChannel(callback: (err: AWSError, data: DeleteApnsChannelResponse) -> Unit = definedExternally): Request<DeleteApnsChannelResponse, AWSError>
    open fun deleteApnsSandboxChannel(params: DeleteApnsSandboxChannelRequest, callback: (err: AWSError, data: DeleteApnsSandboxChannelResponse) -> Unit = definedExternally): Request<DeleteApnsSandboxChannelResponse, AWSError>
    open fun deleteApnsSandboxChannel(callback: (err: AWSError, data: DeleteApnsSandboxChannelResponse) -> Unit = definedExternally): Request<DeleteApnsSandboxChannelResponse, AWSError>
    open fun deleteApnsVoipChannel(params: DeleteApnsVoipChannelRequest, callback: (err: AWSError, data: DeleteApnsVoipChannelResponse) -> Unit = definedExternally): Request<DeleteApnsVoipChannelResponse, AWSError>
    open fun deleteApnsVoipChannel(callback: (err: AWSError, data: DeleteApnsVoipChannelResponse) -> Unit = definedExternally): Request<DeleteApnsVoipChannelResponse, AWSError>
    open fun deleteApnsVoipSandboxChannel(params: DeleteApnsVoipSandboxChannelRequest, callback: (err: AWSError, data: DeleteApnsVoipSandboxChannelResponse) -> Unit = definedExternally): Request<DeleteApnsVoipSandboxChannelResponse, AWSError>
    open fun deleteApnsVoipSandboxChannel(callback: (err: AWSError, data: DeleteApnsVoipSandboxChannelResponse) -> Unit = definedExternally): Request<DeleteApnsVoipSandboxChannelResponse, AWSError>
    open fun deleteApp(params: DeleteAppRequest, callback: (err: AWSError, data: DeleteAppResponse) -> Unit = definedExternally): Request<DeleteAppResponse, AWSError>
    open fun deleteApp(callback: (err: AWSError, data: DeleteAppResponse) -> Unit = definedExternally): Request<DeleteAppResponse, AWSError>
    open fun deleteBaiduChannel(params: DeleteBaiduChannelRequest, callback: (err: AWSError, data: DeleteBaiduChannelResponse) -> Unit = definedExternally): Request<DeleteBaiduChannelResponse, AWSError>
    open fun deleteBaiduChannel(callback: (err: AWSError, data: DeleteBaiduChannelResponse) -> Unit = definedExternally): Request<DeleteBaiduChannelResponse, AWSError>
    open fun deleteCampaign(params: DeleteCampaignRequest, callback: (err: AWSError, data: DeleteCampaignResponse) -> Unit = definedExternally): Request<DeleteCampaignResponse, AWSError>
    open fun deleteCampaign(callback: (err: AWSError, data: DeleteCampaignResponse) -> Unit = definedExternally): Request<DeleteCampaignResponse, AWSError>
    open fun deleteEmailChannel(params: DeleteEmailChannelRequest, callback: (err: AWSError, data: DeleteEmailChannelResponse) -> Unit = definedExternally): Request<DeleteEmailChannelResponse, AWSError>
    open fun deleteEmailChannel(callback: (err: AWSError, data: DeleteEmailChannelResponse) -> Unit = definedExternally): Request<DeleteEmailChannelResponse, AWSError>
    open fun deleteEmailTemplate(params: DeleteEmailTemplateRequest, callback: (err: AWSError, data: DeleteEmailTemplateResponse) -> Unit = definedExternally): Request<DeleteEmailTemplateResponse, AWSError>
    open fun deleteEmailTemplate(callback: (err: AWSError, data: DeleteEmailTemplateResponse) -> Unit = definedExternally): Request<DeleteEmailTemplateResponse, AWSError>
    open fun deleteEndpoint(params: DeleteEndpointRequest, callback: (err: AWSError, data: DeleteEndpointResponse) -> Unit = definedExternally): Request<DeleteEndpointResponse, AWSError>
    open fun deleteEndpoint(callback: (err: AWSError, data: DeleteEndpointResponse) -> Unit = definedExternally): Request<DeleteEndpointResponse, AWSError>
    open fun deleteEventStream(params: DeleteEventStreamRequest, callback: (err: AWSError, data: DeleteEventStreamResponse) -> Unit = definedExternally): Request<DeleteEventStreamResponse, AWSError>
    open fun deleteEventStream(callback: (err: AWSError, data: DeleteEventStreamResponse) -> Unit = definedExternally): Request<DeleteEventStreamResponse, AWSError>
    open fun deleteGcmChannel(params: DeleteGcmChannelRequest, callback: (err: AWSError, data: DeleteGcmChannelResponse) -> Unit = definedExternally): Request<DeleteGcmChannelResponse, AWSError>
    open fun deleteGcmChannel(callback: (err: AWSError, data: DeleteGcmChannelResponse) -> Unit = definedExternally): Request<DeleteGcmChannelResponse, AWSError>
    open fun deleteJourney(params: DeleteJourneyRequest, callback: (err: AWSError, data: DeleteJourneyResponse) -> Unit = definedExternally): Request<DeleteJourneyResponse, AWSError>
    open fun deleteJourney(callback: (err: AWSError, data: DeleteJourneyResponse) -> Unit = definedExternally): Request<DeleteJourneyResponse, AWSError>
    open fun deletePushTemplate(params: DeletePushTemplateRequest, callback: (err: AWSError, data: DeletePushTemplateResponse) -> Unit = definedExternally): Request<DeletePushTemplateResponse, AWSError>
    open fun deletePushTemplate(callback: (err: AWSError, data: DeletePushTemplateResponse) -> Unit = definedExternally): Request<DeletePushTemplateResponse, AWSError>
    open fun deleteRecommenderConfiguration(params: DeleteRecommenderConfigurationRequest, callback: (err: AWSError, data: DeleteRecommenderConfigurationResponse) -> Unit = definedExternally): Request<DeleteRecommenderConfigurationResponse, AWSError>
    open fun deleteRecommenderConfiguration(callback: (err: AWSError, data: DeleteRecommenderConfigurationResponse) -> Unit = definedExternally): Request<DeleteRecommenderConfigurationResponse, AWSError>
    open fun deleteSegment(params: DeleteSegmentRequest, callback: (err: AWSError, data: DeleteSegmentResponse) -> Unit = definedExternally): Request<DeleteSegmentResponse, AWSError>
    open fun deleteSegment(callback: (err: AWSError, data: DeleteSegmentResponse) -> Unit = definedExternally): Request<DeleteSegmentResponse, AWSError>
    open fun deleteSmsChannel(params: DeleteSmsChannelRequest, callback: (err: AWSError, data: DeleteSmsChannelResponse) -> Unit = definedExternally): Request<DeleteSmsChannelResponse, AWSError>
    open fun deleteSmsChannel(callback: (err: AWSError, data: DeleteSmsChannelResponse) -> Unit = definedExternally): Request<DeleteSmsChannelResponse, AWSError>
    open fun deleteSmsTemplate(params: DeleteSmsTemplateRequest, callback: (err: AWSError, data: DeleteSmsTemplateResponse) -> Unit = definedExternally): Request<DeleteSmsTemplateResponse, AWSError>
    open fun deleteSmsTemplate(callback: (err: AWSError, data: DeleteSmsTemplateResponse) -> Unit = definedExternally): Request<DeleteSmsTemplateResponse, AWSError>
    open fun deleteUserEndpoints(params: DeleteUserEndpointsRequest, callback: (err: AWSError, data: DeleteUserEndpointsResponse) -> Unit = definedExternally): Request<DeleteUserEndpointsResponse, AWSError>
    open fun deleteUserEndpoints(callback: (err: AWSError, data: DeleteUserEndpointsResponse) -> Unit = definedExternally): Request<DeleteUserEndpointsResponse, AWSError>
    open fun deleteVoiceChannel(params: DeleteVoiceChannelRequest, callback: (err: AWSError, data: DeleteVoiceChannelResponse) -> Unit = definedExternally): Request<DeleteVoiceChannelResponse, AWSError>
    open fun deleteVoiceChannel(callback: (err: AWSError, data: DeleteVoiceChannelResponse) -> Unit = definedExternally): Request<DeleteVoiceChannelResponse, AWSError>
    open fun deleteVoiceTemplate(params: DeleteVoiceTemplateRequest, callback: (err: AWSError, data: DeleteVoiceTemplateResponse) -> Unit = definedExternally): Request<DeleteVoiceTemplateResponse, AWSError>
    open fun deleteVoiceTemplate(callback: (err: AWSError, data: DeleteVoiceTemplateResponse) -> Unit = definedExternally): Request<DeleteVoiceTemplateResponse, AWSError>
    open fun getAdmChannel(params: GetAdmChannelRequest, callback: (err: AWSError, data: GetAdmChannelResponse) -> Unit = definedExternally): Request<GetAdmChannelResponse, AWSError>
    open fun getAdmChannel(callback: (err: AWSError, data: GetAdmChannelResponse) -> Unit = definedExternally): Request<GetAdmChannelResponse, AWSError>
    open fun getApnsChannel(params: GetApnsChannelRequest, callback: (err: AWSError, data: GetApnsChannelResponse) -> Unit = definedExternally): Request<GetApnsChannelResponse, AWSError>
    open fun getApnsChannel(callback: (err: AWSError, data: GetApnsChannelResponse) -> Unit = definedExternally): Request<GetApnsChannelResponse, AWSError>
    open fun getApnsSandboxChannel(params: GetApnsSandboxChannelRequest, callback: (err: AWSError, data: GetApnsSandboxChannelResponse) -> Unit = definedExternally): Request<GetApnsSandboxChannelResponse, AWSError>
    open fun getApnsSandboxChannel(callback: (err: AWSError, data: GetApnsSandboxChannelResponse) -> Unit = definedExternally): Request<GetApnsSandboxChannelResponse, AWSError>
    open fun getApnsVoipChannel(params: GetApnsVoipChannelRequest, callback: (err: AWSError, data: GetApnsVoipChannelResponse) -> Unit = definedExternally): Request<GetApnsVoipChannelResponse, AWSError>
    open fun getApnsVoipChannel(callback: (err: AWSError, data: GetApnsVoipChannelResponse) -> Unit = definedExternally): Request<GetApnsVoipChannelResponse, AWSError>
    open fun getApnsVoipSandboxChannel(params: GetApnsVoipSandboxChannelRequest, callback: (err: AWSError, data: GetApnsVoipSandboxChannelResponse) -> Unit = definedExternally): Request<GetApnsVoipSandboxChannelResponse, AWSError>
    open fun getApnsVoipSandboxChannel(callback: (err: AWSError, data: GetApnsVoipSandboxChannelResponse) -> Unit = definedExternally): Request<GetApnsVoipSandboxChannelResponse, AWSError>
    open fun getApp(params: GetAppRequest, callback: (err: AWSError, data: GetAppResponse) -> Unit = definedExternally): Request<GetAppResponse, AWSError>
    open fun getApp(callback: (err: AWSError, data: GetAppResponse) -> Unit = definedExternally): Request<GetAppResponse, AWSError>
    open fun getApplicationDateRangeKpi(params: GetApplicationDateRangeKpiRequest, callback: (err: AWSError, data: GetApplicationDateRangeKpiResponse) -> Unit = definedExternally): Request<GetApplicationDateRangeKpiResponse, AWSError>
    open fun getApplicationDateRangeKpi(callback: (err: AWSError, data: GetApplicationDateRangeKpiResponse) -> Unit = definedExternally): Request<GetApplicationDateRangeKpiResponse, AWSError>
    open fun getApplicationSettings(params: GetApplicationSettingsRequest, callback: (err: AWSError, data: GetApplicationSettingsResponse) -> Unit = definedExternally): Request<GetApplicationSettingsResponse, AWSError>
    open fun getApplicationSettings(callback: (err: AWSError, data: GetApplicationSettingsResponse) -> Unit = definedExternally): Request<GetApplicationSettingsResponse, AWSError>
    open fun getApps(params: GetAppsRequest, callback: (err: AWSError, data: GetAppsResponse) -> Unit = definedExternally): Request<GetAppsResponse, AWSError>
    open fun getApps(callback: (err: AWSError, data: GetAppsResponse) -> Unit = definedExternally): Request<GetAppsResponse, AWSError>
    open fun getBaiduChannel(params: GetBaiduChannelRequest, callback: (err: AWSError, data: GetBaiduChannelResponse) -> Unit = definedExternally): Request<GetBaiduChannelResponse, AWSError>
    open fun getBaiduChannel(callback: (err: AWSError, data: GetBaiduChannelResponse) -> Unit = definedExternally): Request<GetBaiduChannelResponse, AWSError>
    open fun getCampaign(params: GetCampaignRequest, callback: (err: AWSError, data: GetCampaignResponse) -> Unit = definedExternally): Request<GetCampaignResponse, AWSError>
    open fun getCampaign(callback: (err: AWSError, data: GetCampaignResponse) -> Unit = definedExternally): Request<GetCampaignResponse, AWSError>
    open fun getCampaignActivities(params: GetCampaignActivitiesRequest, callback: (err: AWSError, data: GetCampaignActivitiesResponse) -> Unit = definedExternally): Request<GetCampaignActivitiesResponse, AWSError>
    open fun getCampaignActivities(callback: (err: AWSError, data: GetCampaignActivitiesResponse) -> Unit = definedExternally): Request<GetCampaignActivitiesResponse, AWSError>
    open fun getCampaignDateRangeKpi(params: GetCampaignDateRangeKpiRequest, callback: (err: AWSError, data: GetCampaignDateRangeKpiResponse) -> Unit = definedExternally): Request<GetCampaignDateRangeKpiResponse, AWSError>
    open fun getCampaignDateRangeKpi(callback: (err: AWSError, data: GetCampaignDateRangeKpiResponse) -> Unit = definedExternally): Request<GetCampaignDateRangeKpiResponse, AWSError>
    open fun getCampaignVersion(params: GetCampaignVersionRequest, callback: (err: AWSError, data: GetCampaignVersionResponse) -> Unit = definedExternally): Request<GetCampaignVersionResponse, AWSError>
    open fun getCampaignVersion(callback: (err: AWSError, data: GetCampaignVersionResponse) -> Unit = definedExternally): Request<GetCampaignVersionResponse, AWSError>
    open fun getCampaignVersions(params: GetCampaignVersionsRequest, callback: (err: AWSError, data: GetCampaignVersionsResponse) -> Unit = definedExternally): Request<GetCampaignVersionsResponse, AWSError>
    open fun getCampaignVersions(callback: (err: AWSError, data: GetCampaignVersionsResponse) -> Unit = definedExternally): Request<GetCampaignVersionsResponse, AWSError>
    open fun getCampaigns(params: GetCampaignsRequest, callback: (err: AWSError, data: GetCampaignsResponse) -> Unit = definedExternally): Request<GetCampaignsResponse, AWSError>
    open fun getCampaigns(callback: (err: AWSError, data: GetCampaignsResponse) -> Unit = definedExternally): Request<GetCampaignsResponse, AWSError>
    open fun getChannels(params: GetChannelsRequest, callback: (err: AWSError, data: GetChannelsResponse) -> Unit = definedExternally): Request<GetChannelsResponse, AWSError>
    open fun getChannels(callback: (err: AWSError, data: GetChannelsResponse) -> Unit = definedExternally): Request<GetChannelsResponse, AWSError>
    open fun getEmailChannel(params: GetEmailChannelRequest, callback: (err: AWSError, data: GetEmailChannelResponse) -> Unit = definedExternally): Request<GetEmailChannelResponse, AWSError>
    open fun getEmailChannel(callback: (err: AWSError, data: GetEmailChannelResponse) -> Unit = definedExternally): Request<GetEmailChannelResponse, AWSError>
    open fun getEmailTemplate(params: GetEmailTemplateRequest, callback: (err: AWSError, data: GetEmailTemplateResponse) -> Unit = definedExternally): Request<GetEmailTemplateResponse, AWSError>
    open fun getEmailTemplate(callback: (err: AWSError, data: GetEmailTemplateResponse) -> Unit = definedExternally): Request<GetEmailTemplateResponse, AWSError>
    open fun getEndpoint(params: GetEndpointRequest, callback: (err: AWSError, data: GetEndpointResponse) -> Unit = definedExternally): Request<GetEndpointResponse, AWSError>
    open fun getEndpoint(callback: (err: AWSError, data: GetEndpointResponse) -> Unit = definedExternally): Request<GetEndpointResponse, AWSError>
    open fun getEventStream(params: GetEventStreamRequest, callback: (err: AWSError, data: GetEventStreamResponse) -> Unit = definedExternally): Request<GetEventStreamResponse, AWSError>
    open fun getEventStream(callback: (err: AWSError, data: GetEventStreamResponse) -> Unit = definedExternally): Request<GetEventStreamResponse, AWSError>
    open fun getExportJob(params: GetExportJobRequest, callback: (err: AWSError, data: GetExportJobResponse) -> Unit = definedExternally): Request<GetExportJobResponse, AWSError>
    open fun getExportJob(callback: (err: AWSError, data: GetExportJobResponse) -> Unit = definedExternally): Request<GetExportJobResponse, AWSError>
    open fun getExportJobs(params: GetExportJobsRequest, callback: (err: AWSError, data: GetExportJobsResponse) -> Unit = definedExternally): Request<GetExportJobsResponse, AWSError>
    open fun getExportJobs(callback: (err: AWSError, data: GetExportJobsResponse) -> Unit = definedExternally): Request<GetExportJobsResponse, AWSError>
    open fun getGcmChannel(params: GetGcmChannelRequest, callback: (err: AWSError, data: GetGcmChannelResponse) -> Unit = definedExternally): Request<GetGcmChannelResponse, AWSError>
    open fun getGcmChannel(callback: (err: AWSError, data: GetGcmChannelResponse) -> Unit = definedExternally): Request<GetGcmChannelResponse, AWSError>
    open fun getImportJob(params: GetImportJobRequest, callback: (err: AWSError, data: GetImportJobResponse) -> Unit = definedExternally): Request<GetImportJobResponse, AWSError>
    open fun getImportJob(callback: (err: AWSError, data: GetImportJobResponse) -> Unit = definedExternally): Request<GetImportJobResponse, AWSError>
    open fun getImportJobs(params: GetImportJobsRequest, callback: (err: AWSError, data: GetImportJobsResponse) -> Unit = definedExternally): Request<GetImportJobsResponse, AWSError>
    open fun getImportJobs(callback: (err: AWSError, data: GetImportJobsResponse) -> Unit = definedExternally): Request<GetImportJobsResponse, AWSError>
    open fun getJourney(params: GetJourneyRequest, callback: (err: AWSError, data: GetJourneyResponse) -> Unit = definedExternally): Request<GetJourneyResponse, AWSError>
    open fun getJourney(callback: (err: AWSError, data: GetJourneyResponse) -> Unit = definedExternally): Request<GetJourneyResponse, AWSError>
    open fun getJourneyDateRangeKpi(params: GetJourneyDateRangeKpiRequest, callback: (err: AWSError, data: GetJourneyDateRangeKpiResponse) -> Unit = definedExternally): Request<GetJourneyDateRangeKpiResponse, AWSError>
    open fun getJourneyDateRangeKpi(callback: (err: AWSError, data: GetJourneyDateRangeKpiResponse) -> Unit = definedExternally): Request<GetJourneyDateRangeKpiResponse, AWSError>
    open fun getJourneyExecutionActivityMetrics(params: GetJourneyExecutionActivityMetricsRequest, callback: (err: AWSError, data: GetJourneyExecutionActivityMetricsResponse) -> Unit = definedExternally): Request<GetJourneyExecutionActivityMetricsResponse, AWSError>
    open fun getJourneyExecutionActivityMetrics(callback: (err: AWSError, data: GetJourneyExecutionActivityMetricsResponse) -> Unit = definedExternally): Request<GetJourneyExecutionActivityMetricsResponse, AWSError>
    open fun getJourneyExecutionMetrics(params: GetJourneyExecutionMetricsRequest, callback: (err: AWSError, data: GetJourneyExecutionMetricsResponse) -> Unit = definedExternally): Request<GetJourneyExecutionMetricsResponse, AWSError>
    open fun getJourneyExecutionMetrics(callback: (err: AWSError, data: GetJourneyExecutionMetricsResponse) -> Unit = definedExternally): Request<GetJourneyExecutionMetricsResponse, AWSError>
    open fun getPushTemplate(params: GetPushTemplateRequest, callback: (err: AWSError, data: GetPushTemplateResponse) -> Unit = definedExternally): Request<GetPushTemplateResponse, AWSError>
    open fun getPushTemplate(callback: (err: AWSError, data: GetPushTemplateResponse) -> Unit = definedExternally): Request<GetPushTemplateResponse, AWSError>
    open fun getRecommenderConfiguration(params: GetRecommenderConfigurationRequest, callback: (err: AWSError, data: GetRecommenderConfigurationResponse) -> Unit = definedExternally): Request<GetRecommenderConfigurationResponse, AWSError>
    open fun getRecommenderConfiguration(callback: (err: AWSError, data: GetRecommenderConfigurationResponse) -> Unit = definedExternally): Request<GetRecommenderConfigurationResponse, AWSError>
    open fun getRecommenderConfigurations(params: GetRecommenderConfigurationsRequest, callback: (err: AWSError, data: GetRecommenderConfigurationsResponse) -> Unit = definedExternally): Request<GetRecommenderConfigurationsResponse, AWSError>
    open fun getRecommenderConfigurations(callback: (err: AWSError, data: GetRecommenderConfigurationsResponse) -> Unit = definedExternally): Request<GetRecommenderConfigurationsResponse, AWSError>
    open fun getSegment(params: GetSegmentRequest, callback: (err: AWSError, data: GetSegmentResponse) -> Unit = definedExternally): Request<GetSegmentResponse, AWSError>
    open fun getSegment(callback: (err: AWSError, data: GetSegmentResponse) -> Unit = definedExternally): Request<GetSegmentResponse, AWSError>
    open fun getSegmentExportJobs(params: GetSegmentExportJobsRequest, callback: (err: AWSError, data: GetSegmentExportJobsResponse) -> Unit = definedExternally): Request<GetSegmentExportJobsResponse, AWSError>
    open fun getSegmentExportJobs(callback: (err: AWSError, data: GetSegmentExportJobsResponse) -> Unit = definedExternally): Request<GetSegmentExportJobsResponse, AWSError>
    open fun getSegmentImportJobs(params: GetSegmentImportJobsRequest, callback: (err: AWSError, data: GetSegmentImportJobsResponse) -> Unit = definedExternally): Request<GetSegmentImportJobsResponse, AWSError>
    open fun getSegmentImportJobs(callback: (err: AWSError, data: GetSegmentImportJobsResponse) -> Unit = definedExternally): Request<GetSegmentImportJobsResponse, AWSError>
    open fun getSegmentVersion(params: GetSegmentVersionRequest, callback: (err: AWSError, data: GetSegmentVersionResponse) -> Unit = definedExternally): Request<GetSegmentVersionResponse, AWSError>
    open fun getSegmentVersion(callback: (err: AWSError, data: GetSegmentVersionResponse) -> Unit = definedExternally): Request<GetSegmentVersionResponse, AWSError>
    open fun getSegmentVersions(params: GetSegmentVersionsRequest, callback: (err: AWSError, data: GetSegmentVersionsResponse) -> Unit = definedExternally): Request<GetSegmentVersionsResponse, AWSError>
    open fun getSegmentVersions(callback: (err: AWSError, data: GetSegmentVersionsResponse) -> Unit = definedExternally): Request<GetSegmentVersionsResponse, AWSError>
    open fun getSegments(params: GetSegmentsRequest, callback: (err: AWSError, data: GetSegmentsResponse) -> Unit = definedExternally): Request<GetSegmentsResponse, AWSError>
    open fun getSegments(callback: (err: AWSError, data: GetSegmentsResponse) -> Unit = definedExternally): Request<GetSegmentsResponse, AWSError>
    open fun getSmsChannel(params: GetSmsChannelRequest, callback: (err: AWSError, data: GetSmsChannelResponse) -> Unit = definedExternally): Request<GetSmsChannelResponse, AWSError>
    open fun getSmsChannel(callback: (err: AWSError, data: GetSmsChannelResponse) -> Unit = definedExternally): Request<GetSmsChannelResponse, AWSError>
    open fun getSmsTemplate(params: GetSmsTemplateRequest, callback: (err: AWSError, data: GetSmsTemplateResponse) -> Unit = definedExternally): Request<GetSmsTemplateResponse, AWSError>
    open fun getSmsTemplate(callback: (err: AWSError, data: GetSmsTemplateResponse) -> Unit = definedExternally): Request<GetSmsTemplateResponse, AWSError>
    open fun getUserEndpoints(params: GetUserEndpointsRequest, callback: (err: AWSError, data: GetUserEndpointsResponse) -> Unit = definedExternally): Request<GetUserEndpointsResponse, AWSError>
    open fun getUserEndpoints(callback: (err: AWSError, data: GetUserEndpointsResponse) -> Unit = definedExternally): Request<GetUserEndpointsResponse, AWSError>
    open fun getVoiceChannel(params: GetVoiceChannelRequest, callback: (err: AWSError, data: GetVoiceChannelResponse) -> Unit = definedExternally): Request<GetVoiceChannelResponse, AWSError>
    open fun getVoiceChannel(callback: (err: AWSError, data: GetVoiceChannelResponse) -> Unit = definedExternally): Request<GetVoiceChannelResponse, AWSError>
    open fun getVoiceTemplate(params: GetVoiceTemplateRequest, callback: (err: AWSError, data: GetVoiceTemplateResponse) -> Unit = definedExternally): Request<GetVoiceTemplateResponse, AWSError>
    open fun getVoiceTemplate(callback: (err: AWSError, data: GetVoiceTemplateResponse) -> Unit = definedExternally): Request<GetVoiceTemplateResponse, AWSError>
    open fun listJourneys(params: ListJourneysRequest, callback: (err: AWSError, data: ListJourneysResponse) -> Unit = definedExternally): Request<ListJourneysResponse, AWSError>
    open fun listJourneys(callback: (err: AWSError, data: ListJourneysResponse) -> Unit = definedExternally): Request<ListJourneysResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTemplateVersions(params: ListTemplateVersionsRequest, callback: (err: AWSError, data: ListTemplateVersionsResponse) -> Unit = definedExternally): Request<ListTemplateVersionsResponse, AWSError>
    open fun listTemplateVersions(callback: (err: AWSError, data: ListTemplateVersionsResponse) -> Unit = definedExternally): Request<ListTemplateVersionsResponse, AWSError>
    open fun listTemplates(params: ListTemplatesRequest, callback: (err: AWSError, data: ListTemplatesResponse) -> Unit = definedExternally): Request<ListTemplatesResponse, AWSError>
    open fun listTemplates(callback: (err: AWSError, data: ListTemplatesResponse) -> Unit = definedExternally): Request<ListTemplatesResponse, AWSError>
    open fun phoneNumberValidate(params: PhoneNumberValidateRequest, callback: (err: AWSError, data: PhoneNumberValidateResponse) -> Unit = definedExternally): Request<PhoneNumberValidateResponse, AWSError>
    open fun phoneNumberValidate(callback: (err: AWSError, data: PhoneNumberValidateResponse) -> Unit = definedExternally): Request<PhoneNumberValidateResponse, AWSError>
    open fun putEventStream(params: PutEventStreamRequest, callback: (err: AWSError, data: PutEventStreamResponse) -> Unit = definedExternally): Request<PutEventStreamResponse, AWSError>
    open fun putEventStream(callback: (err: AWSError, data: PutEventStreamResponse) -> Unit = definedExternally): Request<PutEventStreamResponse, AWSError>
    open fun putEvents(params: PutEventsRequest, callback: (err: AWSError, data: PutEventsResponse) -> Unit = definedExternally): Request<PutEventsResponse, AWSError>
    open fun putEvents(callback: (err: AWSError, data: PutEventsResponse) -> Unit = definedExternally): Request<PutEventsResponse, AWSError>
    open fun removeAttributes(params: RemoveAttributesRequest, callback: (err: AWSError, data: RemoveAttributesResponse) -> Unit = definedExternally): Request<RemoveAttributesResponse, AWSError>
    open fun removeAttributes(callback: (err: AWSError, data: RemoveAttributesResponse) -> Unit = definedExternally): Request<RemoveAttributesResponse, AWSError>
    open fun sendMessages(params: SendMessagesRequest, callback: (err: AWSError, data: SendMessagesResponse) -> Unit = definedExternally): Request<SendMessagesResponse, AWSError>
    open fun sendMessages(callback: (err: AWSError, data: SendMessagesResponse) -> Unit = definedExternally): Request<SendMessagesResponse, AWSError>
    open fun sendUsersMessages(params: SendUsersMessagesRequest, callback: (err: AWSError, data: SendUsersMessagesResponse) -> Unit = definedExternally): Request<SendUsersMessagesResponse, AWSError>
    open fun sendUsersMessages(callback: (err: AWSError, data: SendUsersMessagesResponse) -> Unit = definedExternally): Request<SendUsersMessagesResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateAdmChannel(params: UpdateAdmChannelRequest, callback: (err: AWSError, data: UpdateAdmChannelResponse) -> Unit = definedExternally): Request<UpdateAdmChannelResponse, AWSError>
    open fun updateAdmChannel(callback: (err: AWSError, data: UpdateAdmChannelResponse) -> Unit = definedExternally): Request<UpdateAdmChannelResponse, AWSError>
    open fun updateApnsChannel(params: UpdateApnsChannelRequest, callback: (err: AWSError, data: UpdateApnsChannelResponse) -> Unit = definedExternally): Request<UpdateApnsChannelResponse, AWSError>
    open fun updateApnsChannel(callback: (err: AWSError, data: UpdateApnsChannelResponse) -> Unit = definedExternally): Request<UpdateApnsChannelResponse, AWSError>
    open fun updateApnsSandboxChannel(params: UpdateApnsSandboxChannelRequest, callback: (err: AWSError, data: UpdateApnsSandboxChannelResponse) -> Unit = definedExternally): Request<UpdateApnsSandboxChannelResponse, AWSError>
    open fun updateApnsSandboxChannel(callback: (err: AWSError, data: UpdateApnsSandboxChannelResponse) -> Unit = definedExternally): Request<UpdateApnsSandboxChannelResponse, AWSError>
    open fun updateApnsVoipChannel(params: UpdateApnsVoipChannelRequest, callback: (err: AWSError, data: UpdateApnsVoipChannelResponse) -> Unit = definedExternally): Request<UpdateApnsVoipChannelResponse, AWSError>
    open fun updateApnsVoipChannel(callback: (err: AWSError, data: UpdateApnsVoipChannelResponse) -> Unit = definedExternally): Request<UpdateApnsVoipChannelResponse, AWSError>
    open fun updateApnsVoipSandboxChannel(params: UpdateApnsVoipSandboxChannelRequest, callback: (err: AWSError, data: UpdateApnsVoipSandboxChannelResponse) -> Unit = definedExternally): Request<UpdateApnsVoipSandboxChannelResponse, AWSError>
    open fun updateApnsVoipSandboxChannel(callback: (err: AWSError, data: UpdateApnsVoipSandboxChannelResponse) -> Unit = definedExternally): Request<UpdateApnsVoipSandboxChannelResponse, AWSError>
    open fun updateApplicationSettings(params: UpdateApplicationSettingsRequest, callback: (err: AWSError, data: UpdateApplicationSettingsResponse) -> Unit = definedExternally): Request<UpdateApplicationSettingsResponse, AWSError>
    open fun updateApplicationSettings(callback: (err: AWSError, data: UpdateApplicationSettingsResponse) -> Unit = definedExternally): Request<UpdateApplicationSettingsResponse, AWSError>
    open fun updateBaiduChannel(params: UpdateBaiduChannelRequest, callback: (err: AWSError, data: UpdateBaiduChannelResponse) -> Unit = definedExternally): Request<UpdateBaiduChannelResponse, AWSError>
    open fun updateBaiduChannel(callback: (err: AWSError, data: UpdateBaiduChannelResponse) -> Unit = definedExternally): Request<UpdateBaiduChannelResponse, AWSError>
    open fun updateCampaign(params: UpdateCampaignRequest, callback: (err: AWSError, data: UpdateCampaignResponse) -> Unit = definedExternally): Request<UpdateCampaignResponse, AWSError>
    open fun updateCampaign(callback: (err: AWSError, data: UpdateCampaignResponse) -> Unit = definedExternally): Request<UpdateCampaignResponse, AWSError>
    open fun updateEmailChannel(params: UpdateEmailChannelRequest, callback: (err: AWSError, data: UpdateEmailChannelResponse) -> Unit = definedExternally): Request<UpdateEmailChannelResponse, AWSError>
    open fun updateEmailChannel(callback: (err: AWSError, data: UpdateEmailChannelResponse) -> Unit = definedExternally): Request<UpdateEmailChannelResponse, AWSError>
    open fun updateEmailTemplate(params: UpdateEmailTemplateRequest, callback: (err: AWSError, data: UpdateEmailTemplateResponse) -> Unit = definedExternally): Request<UpdateEmailTemplateResponse, AWSError>
    open fun updateEmailTemplate(callback: (err: AWSError, data: UpdateEmailTemplateResponse) -> Unit = definedExternally): Request<UpdateEmailTemplateResponse, AWSError>
    open fun updateEndpoint(params: UpdateEndpointRequest, callback: (err: AWSError, data: UpdateEndpointResponse) -> Unit = definedExternally): Request<UpdateEndpointResponse, AWSError>
    open fun updateEndpoint(callback: (err: AWSError, data: UpdateEndpointResponse) -> Unit = definedExternally): Request<UpdateEndpointResponse, AWSError>
    open fun updateEndpointsBatch(params: UpdateEndpointsBatchRequest, callback: (err: AWSError, data: UpdateEndpointsBatchResponse) -> Unit = definedExternally): Request<UpdateEndpointsBatchResponse, AWSError>
    open fun updateEndpointsBatch(callback: (err: AWSError, data: UpdateEndpointsBatchResponse) -> Unit = definedExternally): Request<UpdateEndpointsBatchResponse, AWSError>
    open fun updateGcmChannel(params: UpdateGcmChannelRequest, callback: (err: AWSError, data: UpdateGcmChannelResponse) -> Unit = definedExternally): Request<UpdateGcmChannelResponse, AWSError>
    open fun updateGcmChannel(callback: (err: AWSError, data: UpdateGcmChannelResponse) -> Unit = definedExternally): Request<UpdateGcmChannelResponse, AWSError>
    open fun updateJourney(params: UpdateJourneyRequest, callback: (err: AWSError, data: UpdateJourneyResponse) -> Unit = definedExternally): Request<UpdateJourneyResponse, AWSError>
    open fun updateJourney(callback: (err: AWSError, data: UpdateJourneyResponse) -> Unit = definedExternally): Request<UpdateJourneyResponse, AWSError>
    open fun updateJourneyState(params: UpdateJourneyStateRequest, callback: (err: AWSError, data: UpdateJourneyStateResponse) -> Unit = definedExternally): Request<UpdateJourneyStateResponse, AWSError>
    open fun updateJourneyState(callback: (err: AWSError, data: UpdateJourneyStateResponse) -> Unit = definedExternally): Request<UpdateJourneyStateResponse, AWSError>
    open fun updatePushTemplate(params: UpdatePushTemplateRequest, callback: (err: AWSError, data: UpdatePushTemplateResponse) -> Unit = definedExternally): Request<UpdatePushTemplateResponse, AWSError>
    open fun updatePushTemplate(callback: (err: AWSError, data: UpdatePushTemplateResponse) -> Unit = definedExternally): Request<UpdatePushTemplateResponse, AWSError>
    open fun updateRecommenderConfiguration(params: UpdateRecommenderConfigurationRequest, callback: (err: AWSError, data: UpdateRecommenderConfigurationResponse) -> Unit = definedExternally): Request<UpdateRecommenderConfigurationResponse, AWSError>
    open fun updateRecommenderConfiguration(callback: (err: AWSError, data: UpdateRecommenderConfigurationResponse) -> Unit = definedExternally): Request<UpdateRecommenderConfigurationResponse, AWSError>
    open fun updateSegment(params: UpdateSegmentRequest, callback: (err: AWSError, data: UpdateSegmentResponse) -> Unit = definedExternally): Request<UpdateSegmentResponse, AWSError>
    open fun updateSegment(callback: (err: AWSError, data: UpdateSegmentResponse) -> Unit = definedExternally): Request<UpdateSegmentResponse, AWSError>
    open fun updateSmsChannel(params: UpdateSmsChannelRequest, callback: (err: AWSError, data: UpdateSmsChannelResponse) -> Unit = definedExternally): Request<UpdateSmsChannelResponse, AWSError>
    open fun updateSmsChannel(callback: (err: AWSError, data: UpdateSmsChannelResponse) -> Unit = definedExternally): Request<UpdateSmsChannelResponse, AWSError>
    open fun updateSmsTemplate(params: UpdateSmsTemplateRequest, callback: (err: AWSError, data: UpdateSmsTemplateResponse) -> Unit = definedExternally): Request<UpdateSmsTemplateResponse, AWSError>
    open fun updateSmsTemplate(callback: (err: AWSError, data: UpdateSmsTemplateResponse) -> Unit = definedExternally): Request<UpdateSmsTemplateResponse, AWSError>
    open fun updateTemplateActiveVersion(params: UpdateTemplateActiveVersionRequest, callback: (err: AWSError, data: UpdateTemplateActiveVersionResponse) -> Unit = definedExternally): Request<UpdateTemplateActiveVersionResponse, AWSError>
    open fun updateTemplateActiveVersion(callback: (err: AWSError, data: UpdateTemplateActiveVersionResponse) -> Unit = definedExternally): Request<UpdateTemplateActiveVersionResponse, AWSError>
    open fun updateVoiceChannel(params: UpdateVoiceChannelRequest, callback: (err: AWSError, data: UpdateVoiceChannelResponse) -> Unit = definedExternally): Request<UpdateVoiceChannelResponse, AWSError>
    open fun updateVoiceChannel(callback: (err: AWSError, data: UpdateVoiceChannelResponse) -> Unit = definedExternally): Request<UpdateVoiceChannelResponse, AWSError>
    open fun updateVoiceTemplate(params: UpdateVoiceTemplateRequest, callback: (err: AWSError, data: UpdateVoiceTemplateResponse) -> Unit = definedExternally): Request<UpdateVoiceTemplateResponse, AWSError>
    open fun updateVoiceTemplate(callback: (err: AWSError, data: UpdateVoiceTemplateResponse) -> Unit = definedExternally): Request<UpdateVoiceTemplateResponse, AWSError>
    interface ADMChannelRequest {
        var ClientId: __string
        var ClientSecret: __string
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ADMChannelResponse {
        var ApplicationId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var HasCredential: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var IsArchived: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Platform: __string
        var Version: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ADMMessage {
        var Action: String /* "OPEN_APP" | "DEEP_LINK" | "URL" | String */
        var Body: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ConsolidationKey: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Data: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var ExpiresAfter: __string?
            get() = definedExternally
            set(value) = definedExternally
        var IconReference: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ImageIconUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ImageUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MD5: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RawContent: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SilentPush: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SmallImageIconUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Sound: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Substitutions: MapOfListOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Title: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface APNSChannelRequest {
        var BundleId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Certificate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultAuthenticationMethod: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateKey: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TeamId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TokenKey: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TokenKeyId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface APNSChannelResponse {
        var ApplicationId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultAuthenticationMethod: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var HasCredential: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var HasTokenKey: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var IsArchived: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Platform: __string
        var Version: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface APNSMessage {
        var APNSPushType: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Action: String /* "OPEN_APP" | "DEEP_LINK" | "URL" | String */
        var Badge: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Body: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Category: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CollapseId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Data: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var MediaUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredAuthenticationMethod: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Priority: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RawContent: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SilentPush: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Sound: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Substitutions: MapOfListOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var ThreadId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TimeToLive: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Title: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface APNSPushNotificationTemplate {
        var Action: String /* "OPEN_APP" | "DEEP_LINK" | "URL" | String */
        var Body: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MediaUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RawContent: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Sound: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Title: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface APNSSandboxChannelRequest {
        var BundleId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Certificate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultAuthenticationMethod: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateKey: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TeamId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TokenKey: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TokenKeyId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface APNSSandboxChannelResponse {
        var ApplicationId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultAuthenticationMethod: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var HasCredential: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var HasTokenKey: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var IsArchived: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Platform: __string
        var Version: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface APNSVoipChannelRequest {
        var BundleId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Certificate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultAuthenticationMethod: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateKey: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TeamId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TokenKey: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TokenKeyId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface APNSVoipChannelResponse {
        var ApplicationId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultAuthenticationMethod: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var HasCredential: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var HasTokenKey: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var IsArchived: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Platform: __string
        var Version: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface APNSVoipSandboxChannelRequest {
        var BundleId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Certificate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultAuthenticationMethod: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateKey: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TeamId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TokenKey: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TokenKeyId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface APNSVoipSandboxChannelResponse {
        var ApplicationId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultAuthenticationMethod: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var HasCredential: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var HasTokenKey: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var IsArchived: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Platform: __string
        var Version: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActivitiesResponse {
        var Item: ListOfActivityResponse
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Activity {
        var ConditionalSplit: ConditionalSplitActivity?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EMAIL: EmailMessageActivity?
            get() = definedExternally
            set(value) = definedExternally
        var Holdout: HoldoutActivity?
            get() = definedExternally
            set(value) = definedExternally
        var MultiCondition: MultiConditionalSplitActivity?
            get() = definedExternally
            set(value) = definedExternally
        var RandomSplit: RandomSplitActivity?
            get() = definedExternally
            set(value) = definedExternally
        var Wait: WaitActivity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActivityResponse {
        var ApplicationId: __string
        var CampaignId: __string
        var End: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string
        var Result: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduledStart: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Start: __string?
            get() = definedExternally
            set(value) = definedExternally
        var State: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SuccessfulEndpointCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var TimezonesCompletedCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var TimezonesTotalCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var TotalEndpointCount: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var TreatmentId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddressConfiguration {
        var BodyOverride: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelType: String /* "GCM" | "APNS" | "APNS_SANDBOX" | "APNS_VOIP" | "APNS_VOIP_SANDBOX" | "ADM" | "SMS" | "VOICE" | "EMAIL" | "BAIDU" | "CUSTOM" | String */
        var Context: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var RawContent: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Substitutions: MapOfListOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var TitleOverride: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AndroidPushNotificationTemplate {
        var Action: String /* "OPEN_APP" | "DEEP_LINK" | "URL" | String */
        var Body: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ImageIconUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ImageUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RawContent: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SmallImageIconUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Sound: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Title: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationDateRangeKpiResponse {
        var ApplicationId: __string
        var EndTime: __timestampIso8601
        var KpiName: __string
        var KpiResult: BaseKpiResult
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: __timestampIso8601
    }
    interface ApplicationResponse {
        var Arn: __string
        var Id: __string
        var Name: __string
        var tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationSettingsResource {
        var ApplicationId: __string
        var CampaignHook: CampaignHook?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Limits: CampaignLimits?
            get() = definedExternally
            set(value) = definedExternally
        var QuietTime: QuietTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationsResponse {
        var Item: ListOfApplicationResponse?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttributeDimension {
        var AttributeType: String /* "INCLUSIVE" | "EXCLUSIVE" | String */
        var Values: ListOf__string
    }
    interface AttributesResource {
        var ApplicationId: __string
        var AttributeType: __string
        var Attributes: ListOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BaiduChannelRequest {
        var ApiKey: __string
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SecretKey: __string
    }
    interface BaiduChannelResponse {
        var ApplicationId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Credential: __string
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var HasCredential: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var IsArchived: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Platform: __string
        var Version: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BaiduMessage {
        var Action: String /* "OPEN_APP" | "DEEP_LINK" | "URL" | String */
        var Body: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Data: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var IconReference: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ImageIconUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ImageUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RawContent: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SilentPush: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SmallImageIconUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Sound: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Substitutions: MapOfListOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var TimeToLive: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Title: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BaseKpiResult {
        var Rows: ListOfResultRow
    }
    interface CampaignDateRangeKpiResponse {
        var ApplicationId: __string
        var CampaignId: __string
        var EndTime: __timestampIso8601
        var KpiName: __string
        var KpiResult: BaseKpiResult
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: __timestampIso8601
    }
    interface CampaignEmailMessage {
        var Body: __string?
            get() = definedExternally
            set(value) = definedExternally
        var FromAddress: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HtmlBody: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Title: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CampaignEventFilter {
        var Dimensions: EventDimensions
        var FilterType: String /* "SYSTEM" | "ENDPOINT" | String */
    }
    interface CampaignHook {
        var LambdaFunctionName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Mode: String /* "DELIVERY" | "FILTER" | String */
        var WebUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CampaignLimits {
        var Daily: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumDuration: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var MessagesPerSecond: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Total: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CampaignResponse {
        var AdditionalTreatments: ListOfTreatmentResource?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationId: __string
        var Arn: __string
        var CreationDate: __string
        var DefaultState: CampaignState?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HoldoutPercent: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Hook: CampaignHook?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string
        var IsPaused: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: __string
        var Limits: CampaignLimits?
            get() = definedExternally
            set(value) = definedExternally
        var MessageConfiguration: MessageConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: Schedule?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentId: __string
        var SegmentVersion: __integer
        var State: CampaignState?
            get() = definedExternally
            set(value) = definedExternally
        var tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateConfiguration: TemplateConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var TreatmentDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TreatmentName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CampaignSmsMessage {
        var Body: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MessageType: String /* "TRANSACTIONAL" | "PROMOTIONAL" | String */
        var SenderId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CampaignState {
        var CampaignStatus: String /* "SCHEDULED" | "EXECUTING" | "PENDING_NEXT_RUN" | "COMPLETED" | "PAUSED" | "DELETED" | String */
    }
    interface CampaignsResponse {
        var Item: ListOfCampaignResponse
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChannelResponse {
        var ApplicationId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var HasCredential: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var IsArchived: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChannelsResponse {
        var Channels: MapOfChannelResponse
    }
    interface Condition {
        var Conditions: ListOfSimpleCondition?
            get() = definedExternally
            set(value) = definedExternally
        var Operator: String /* "ALL" | "ANY" | String */
    }
    interface ConditionalSplitActivity {
        var Condition: Condition?
            get() = definedExternally
            set(value) = definedExternally
        var EvaluationWaitTime: WaitTime?
            get() = definedExternally
            set(value) = definedExternally
        var FalseActivity: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TrueActivity: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAppRequest {
        var CreateApplicationRequest: CreateApplicationRequest
    }
    interface CreateAppResponse {
        var ApplicationResponse: ApplicationResponse
    }
    interface CreateApplicationRequest {
        var Name: __string
        var tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCampaignRequest {
        var ApplicationId: __string
        var WriteCampaignRequest: WriteCampaignRequest
    }
    interface CreateCampaignResponse {
        var CampaignResponse: CampaignResponse
    }
    interface CreateEmailTemplateRequest {
        var EmailTemplateRequest: EmailTemplateRequest
        var TemplateName: __string
    }
    interface CreateEmailTemplateResponse {
        var CreateTemplateMessageBody: CreateTemplateMessageBody
    }
    interface CreateExportJobRequest {
        var ApplicationId: __string
        var ExportJobRequest: ExportJobRequest
    }
    interface CreateExportJobResponse {
        var ExportJobResponse: ExportJobResponse
    }
    interface CreateImportJobRequest {
        var ApplicationId: __string
        var ImportJobRequest: ImportJobRequest
    }
    interface CreateImportJobResponse {
        var ImportJobResponse: ImportJobResponse
    }
    interface CreateJourneyRequest {
        var ApplicationId: __string
        var WriteJourneyRequest: WriteJourneyRequest
    }
    interface CreateJourneyResponse {
        var JourneyResponse: JourneyResponse
    }
    interface CreatePushTemplateRequest {
        var PushNotificationTemplateRequest: PushNotificationTemplateRequest
        var TemplateName: __string
    }
    interface CreatePushTemplateResponse {
        var CreateTemplateMessageBody: CreateTemplateMessageBody
    }
    interface CreateRecommenderConfiguration {
        var Attributes: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RecommendationProviderIdType: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RecommendationProviderRoleArn: __string
        var RecommendationProviderUri: __string
        var RecommendationTransformerUri: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RecommendationsDisplayName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RecommendationsPerMessage: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRecommenderConfigurationRequest {
        var CreateRecommenderConfiguration: CreateRecommenderConfiguration
    }
    interface CreateRecommenderConfigurationResponse {
        var RecommenderConfigurationResponse: RecommenderConfigurationResponse
    }
    interface CreateSegmentRequest {
        var ApplicationId: __string
        var WriteSegmentRequest: WriteSegmentRequest
    }
    interface CreateSegmentResponse {
        var SegmentResponse: SegmentResponse
    }
    interface CreateSmsTemplateRequest {
        var SMSTemplateRequest: SMSTemplateRequest
        var TemplateName: __string
    }
    interface CreateSmsTemplateResponse {
        var CreateTemplateMessageBody: CreateTemplateMessageBody
    }
    interface CreateTemplateMessageBody {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Message: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RequestID: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateVoiceTemplateRequest {
        var TemplateName: __string
        var VoiceTemplateRequest: VoiceTemplateRequest
    }
    interface CreateVoiceTemplateResponse {
        var CreateTemplateMessageBody: CreateTemplateMessageBody
    }
    interface DefaultMessage {
        var Body: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Substitutions: MapOfListOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DefaultPushNotificationMessage {
        var Action: String /* "OPEN_APP" | "DEEP_LINK" | "URL" | String */
        var Body: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Data: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var SilentPush: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Substitutions: MapOfListOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Title: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DefaultPushNotificationTemplate {
        var Action: String /* "OPEN_APP" | "DEEP_LINK" | "URL" | String */
        var Body: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Sound: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Title: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAdmChannelRequest {
        var ApplicationId: __string
    }
    interface DeleteAdmChannelResponse {
        var ADMChannelResponse: ADMChannelResponse
    }
    interface DeleteApnsChannelRequest {
        var ApplicationId: __string
    }
    interface DeleteApnsChannelResponse {
        var APNSChannelResponse: APNSChannelResponse
    }
    interface DeleteApnsSandboxChannelRequest {
        var ApplicationId: __string
    }
    interface DeleteApnsSandboxChannelResponse {
        var APNSSandboxChannelResponse: APNSSandboxChannelResponse
    }
    interface DeleteApnsVoipChannelRequest {
        var ApplicationId: __string
    }
    interface DeleteApnsVoipChannelResponse {
        var APNSVoipChannelResponse: APNSVoipChannelResponse
    }
    interface DeleteApnsVoipSandboxChannelRequest {
        var ApplicationId: __string
    }
    interface DeleteApnsVoipSandboxChannelResponse {
        var APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse
    }
    interface DeleteAppRequest {
        var ApplicationId: __string
    }
    interface DeleteAppResponse {
        var ApplicationResponse: ApplicationResponse
    }
    interface DeleteBaiduChannelRequest {
        var ApplicationId: __string
    }
    interface DeleteBaiduChannelResponse {
        var BaiduChannelResponse: BaiduChannelResponse
    }
    interface DeleteCampaignRequest {
        var ApplicationId: __string
        var CampaignId: __string
    }
    interface DeleteCampaignResponse {
        var CampaignResponse: CampaignResponse
    }
    interface DeleteEmailChannelRequest {
        var ApplicationId: __string
    }
    interface DeleteEmailChannelResponse {
        var EmailChannelResponse: EmailChannelResponse
    }
    interface DeleteEmailTemplateRequest {
        var TemplateName: __string
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteEmailTemplateResponse {
        var MessageBody: MessageBody
    }
    interface DeleteEndpointRequest {
        var ApplicationId: __string
        var EndpointId: __string
    }
    interface DeleteEndpointResponse {
        var EndpointResponse: EndpointResponse
    }
    interface DeleteEventStreamRequest {
        var ApplicationId: __string
    }
    interface DeleteEventStreamResponse {
        var EventStream: EventStream
    }
    interface DeleteGcmChannelRequest {
        var ApplicationId: __string
    }
    interface DeleteGcmChannelResponse {
        var GCMChannelResponse: GCMChannelResponse
    }
    interface DeleteJourneyRequest {
        var ApplicationId: __string
        var JourneyId: __string
    }
    interface DeleteJourneyResponse {
        var JourneyResponse: JourneyResponse
    }
    interface DeletePushTemplateRequest {
        var TemplateName: __string
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeletePushTemplateResponse {
        var MessageBody: MessageBody
    }
    interface DeleteRecommenderConfigurationRequest {
        var RecommenderId: __string
    }
    interface DeleteRecommenderConfigurationResponse {
        var RecommenderConfigurationResponse: RecommenderConfigurationResponse
    }
    interface DeleteSegmentRequest {
        var ApplicationId: __string
        var SegmentId: __string
    }
    interface DeleteSegmentResponse {
        var SegmentResponse: SegmentResponse
    }
    interface DeleteSmsChannelRequest {
        var ApplicationId: __string
    }
    interface DeleteSmsChannelResponse {
        var SMSChannelResponse: SMSChannelResponse
    }
    interface DeleteSmsTemplateRequest {
        var TemplateName: __string
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteSmsTemplateResponse {
        var MessageBody: MessageBody
    }
    interface DeleteUserEndpointsRequest {
        var ApplicationId: __string
        var UserId: __string
    }
    interface DeleteUserEndpointsResponse {
        var EndpointsResponse: EndpointsResponse
    }
    interface DeleteVoiceChannelRequest {
        var ApplicationId: __string
    }
    interface DeleteVoiceChannelResponse {
        var VoiceChannelResponse: VoiceChannelResponse
    }
    interface DeleteVoiceTemplateRequest {
        var TemplateName: __string
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteVoiceTemplateResponse {
        var MessageBody: MessageBody
    }
    interface DirectMessageConfiguration {
        var ADMMessage: ADMMessage?
            get() = definedExternally
            set(value) = definedExternally
        var APNSMessage: APNSMessage?
            get() = definedExternally
            set(value) = definedExternally
        var BaiduMessage: BaiduMessage?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultMessage: DefaultMessage?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultPushNotificationMessage: DefaultPushNotificationMessage?
            get() = definedExternally
            set(value) = definedExternally
        var EmailMessage: EmailMessage?
            get() = definedExternally
            set(value) = definedExternally
        var GCMMessage: GCMMessage?
            get() = definedExternally
            set(value) = definedExternally
        var SMSMessage: SMSMessage?
            get() = definedExternally
            set(value) = definedExternally
        var VoiceMessage: VoiceMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EmailChannelRequest {
        var ConfigurationSet: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var FromAddress: __string
        var Identity: __string
        var RoleArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EmailChannelResponse {
        var ApplicationId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationSet: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var FromAddress: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HasCredential: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Identity: __string?
            get() = definedExternally
            set(value) = definedExternally
        var IsArchived: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MessagesPerSecond: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Platform: __string
        var RoleArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EmailMessage {
        var Body: __string?
            get() = definedExternally
            set(value) = definedExternally
        var FeedbackForwardingAddress: __string?
            get() = definedExternally
            set(value) = definedExternally
        var FromAddress: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RawEmail: RawEmail?
            get() = definedExternally
            set(value) = definedExternally
        var ReplyToAddresses: ListOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var SimpleEmail: SimpleEmail?
            get() = definedExternally
            set(value) = definedExternally
        var Substitutions: MapOfListOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EmailMessageActivity {
        var MessageConfig: JourneyEmailMessage?
            get() = definedExternally
            set(value) = definedExternally
        var NextActivity: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EmailTemplateRequest {
        var DefaultSubstitutions: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HtmlPart: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RecommenderId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Subject: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TextPart: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EmailTemplateResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: __string
        var DefaultSubstitutions: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HtmlPart: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: __string
        var RecommenderId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Subject: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateName: __string
        var TemplateType: String /* "EMAIL" | "SMS" | "VOICE" | "PUSH" | String */
        var TextPart: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EndpointBatchItem {
        var Address: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: MapOfListOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelType: String /* "GCM" | "APNS" | "APNS_SANDBOX" | "APNS_VOIP" | "APNS_VOIP_SANDBOX" | "ADM" | "SMS" | "VOICE" | "EMAIL" | "BAIDU" | "CUSTOM" | String */
        var Demographic: EndpointDemographic?
            get() = definedExternally
            set(value) = definedExternally
        var EffectiveDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointStatus: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Location: EndpointLocation?
            get() = definedExternally
            set(value) = definedExternally
        var Metrics: MapOf__double?
            get() = definedExternally
            set(value) = definedExternally
        var OptOut: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var User: EndpointUser?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EndpointBatchRequest {
        var Item: ListOfEndpointBatchItem
    }
    interface EndpointDemographic {
        var AppVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Locale: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Make: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Model: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ModelVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Platform: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Timezone: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EndpointItemResponse {
        var Message: __string?
            get() = definedExternally
            set(value) = definedExternally
        var StatusCode: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EndpointLocation {
        var City: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Country: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Latitude: __double?
            get() = definedExternally
            set(value) = definedExternally
        var Longitude: __double?
            get() = definedExternally
            set(value) = definedExternally
        var PostalCode: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Region: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EndpointMessageResult {
        var Address: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DeliveryStatus: String /* "SUCCESSFUL" | "THROTTLED" | "TEMPORARY_FAILURE" | "PERMANENT_FAILURE" | "UNKNOWN_FAILURE" | "OPT_OUT" | "DUPLICATE" | String */
        var MessageId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var StatusCode: __integer
        var StatusMessage: __string?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EndpointRequest {
        var Address: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: MapOfListOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelType: String /* "GCM" | "APNS" | "APNS_SANDBOX" | "APNS_VOIP" | "APNS_VOIP_SANDBOX" | "ADM" | "SMS" | "VOICE" | "EMAIL" | "BAIDU" | "CUSTOM" | String */
        var Demographic: EndpointDemographic?
            get() = definedExternally
            set(value) = definedExternally
        var EffectiveDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointStatus: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Location: EndpointLocation?
            get() = definedExternally
            set(value) = definedExternally
        var Metrics: MapOf__double?
            get() = definedExternally
            set(value) = definedExternally
        var OptOut: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var User: EndpointUser?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EndpointResponse {
        var Address: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: MapOfListOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelType: String /* "GCM" | "APNS" | "APNS_SANDBOX" | "APNS_VOIP" | "APNS_VOIP_SANDBOX" | "ADM" | "SMS" | "VOICE" | "EMAIL" | "BAIDU" | "CUSTOM" | String */
        var CohortId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Demographic: EndpointDemographic?
            get() = definedExternally
            set(value) = definedExternally
        var EffectiveDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointStatus: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Location: EndpointLocation?
            get() = definedExternally
            set(value) = definedExternally
        var Metrics: MapOf__double?
            get() = definedExternally
            set(value) = definedExternally
        var OptOut: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var User: EndpointUser?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EndpointSendConfiguration {
        var BodyOverride: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Context: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var RawContent: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Substitutions: MapOfListOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var TitleOverride: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EndpointUser {
        var UserAttributes: MapOfListOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var UserId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EndpointsResponse {
        var Item: ListOfEndpointResponse
    }
    interface Event {
        var AppPackageName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var AppTitle: __string?
            get() = definedExternally
            set(value) = definedExternally
        var AppVersionCode: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var ClientSdkVersion: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EventType: __string
        var Metrics: MapOf__double?
            get() = definedExternally
            set(value) = definedExternally
        var SdkName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Session: Session?
            get() = definedExternally
            set(value) = definedExternally
        var Timestamp: __string
    }
    interface EventCondition {
        var Dimensions: EventDimensions
        var MessageActivity: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventDimensions {
        var Attributes: MapOfAttributeDimension?
            get() = definedExternally
            set(value) = definedExternally
        var EventType: SetDimension?
            get() = definedExternally
            set(value) = definedExternally
        var Metrics: MapOfMetricDimension?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventItemResponse {
        var Message: __string?
            get() = definedExternally
            set(value) = definedExternally
        var StatusCode: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventStream {
        var ApplicationId: __string
        var DestinationStreamArn: __string
        var ExternalId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedBy: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: __string
    }
    interface EventsBatch {
        var Endpoint: PublicEndpoint
        var Events: MapOfEvent
    }
    interface EventsRequest {
        var BatchItem: MapOfEventsBatch
    }
    interface EventsResponse {
        var Results: MapOfItemResponse?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExportJobRequest {
        var RoleArn: __string
        var S3UrlPrefix: __string
        var SegmentId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentVersion: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExportJobResource {
        var RoleArn: __string
        var S3UrlPrefix: __string
        var SegmentId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentVersion: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExportJobResponse {
        var ApplicationId: __string
        var CompletedPieces: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var CompletionDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: __string
        var Definition: ExportJobResource
        var FailedPieces: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Failures: ListOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string
        var JobStatus: String /* "CREATED" | "PREPARING_FOR_INITIALIZATION" | "INITIALIZING" | "PROCESSING" | "PENDING_JOB" | "COMPLETING" | "COMPLETED" | "FAILING" | "FAILED" | String */
        var TotalFailures: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var TotalPieces: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var TotalProcessed: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Type: __string
    }
    interface ExportJobsResponse {
        var Item: ListOfExportJobResponse
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GCMChannelRequest {
        var ApiKey: __string
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GCMChannelResponse {
        var ApplicationId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Credential: __string
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var HasCredential: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var IsArchived: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Platform: __string
        var Version: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GCMMessage {
        var Action: String /* "OPEN_APP" | "DEEP_LINK" | "URL" | String */
        var Body: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CollapseKey: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Data: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var IconReference: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ImageIconUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ImageUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Priority: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RawContent: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RestrictedPackageName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SilentPush: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SmallImageIconUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Sound: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Substitutions: MapOfListOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var TimeToLive: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Title: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GPSCoordinates {
        var Latitude: __double
        var Longitude: __double
    }
    interface GPSPointDimension {
        var Coordinates: GPSCoordinates
        var RangeInKilometers: __double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAdmChannelRequest {
        var ApplicationId: __string
    }
    interface GetAdmChannelResponse {
        var ADMChannelResponse: ADMChannelResponse
    }
    interface GetApnsChannelRequest {
        var ApplicationId: __string
    }
    interface GetApnsChannelResponse {
        var APNSChannelResponse: APNSChannelResponse
    }
    interface GetApnsSandboxChannelRequest {
        var ApplicationId: __string
    }
    interface GetApnsSandboxChannelResponse {
        var APNSSandboxChannelResponse: APNSSandboxChannelResponse
    }
    interface GetApnsVoipChannelRequest {
        var ApplicationId: __string
    }
    interface GetApnsVoipChannelResponse {
        var APNSVoipChannelResponse: APNSVoipChannelResponse
    }
    interface GetApnsVoipSandboxChannelRequest {
        var ApplicationId: __string
    }
    interface GetApnsVoipSandboxChannelResponse {
        var APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse
    }
    interface GetAppRequest {
        var ApplicationId: __string
    }
    interface GetAppResponse {
        var ApplicationResponse: ApplicationResponse
    }
    interface GetApplicationDateRangeKpiRequest {
        var ApplicationId: __string
        var EndTime: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var KpiName: __string
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: __string?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetApplicationDateRangeKpiResponse {
        var ApplicationDateRangeKpiResponse: ApplicationDateRangeKpiResponse
    }
    interface GetApplicationSettingsRequest {
        var ApplicationId: __string
    }
    interface GetApplicationSettingsResponse {
        var ApplicationSettingsResource: ApplicationSettingsResource
    }
    interface GetAppsRequest {
        var PageSize: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Token: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAppsResponse {
        var ApplicationsResponse: ApplicationsResponse
    }
    interface GetBaiduChannelRequest {
        var ApplicationId: __string
    }
    interface GetBaiduChannelResponse {
        var BaiduChannelResponse: BaiduChannelResponse
    }
    interface GetCampaignActivitiesRequest {
        var ApplicationId: __string
        var CampaignId: __string
        var PageSize: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Token: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCampaignActivitiesResponse {
        var ActivitiesResponse: ActivitiesResponse
    }
    interface GetCampaignDateRangeKpiRequest {
        var ApplicationId: __string
        var CampaignId: __string
        var EndTime: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var KpiName: __string
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: __string?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCampaignDateRangeKpiResponse {
        var CampaignDateRangeKpiResponse: CampaignDateRangeKpiResponse
    }
    interface GetCampaignRequest {
        var ApplicationId: __string
        var CampaignId: __string
    }
    interface GetCampaignResponse {
        var CampaignResponse: CampaignResponse
    }
    interface GetCampaignVersionRequest {
        var ApplicationId: __string
        var CampaignId: __string
        var Version: __string
    }
    interface GetCampaignVersionResponse {
        var CampaignResponse: CampaignResponse
    }
    interface GetCampaignVersionsRequest {
        var ApplicationId: __string
        var CampaignId: __string
        var PageSize: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Token: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCampaignVersionsResponse {
        var CampaignsResponse: CampaignsResponse
    }
    interface GetCampaignsRequest {
        var ApplicationId: __string
        var PageSize: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Token: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCampaignsResponse {
        var CampaignsResponse: CampaignsResponse
    }
    interface GetChannelsRequest {
        var ApplicationId: __string
    }
    interface GetChannelsResponse {
        var ChannelsResponse: ChannelsResponse
    }
    interface GetEmailChannelRequest {
        var ApplicationId: __string
    }
    interface GetEmailChannelResponse {
        var EmailChannelResponse: EmailChannelResponse
    }
    interface GetEmailTemplateRequest {
        var TemplateName: __string
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetEmailTemplateResponse {
        var EmailTemplateResponse: EmailTemplateResponse
    }
    interface GetEndpointRequest {
        var ApplicationId: __string
        var EndpointId: __string
    }
    interface GetEndpointResponse {
        var EndpointResponse: EndpointResponse
    }
    interface GetEventStreamRequest {
        var ApplicationId: __string
    }
    interface GetEventStreamResponse {
        var EventStream: EventStream
    }
    interface GetExportJobRequest {
        var ApplicationId: __string
        var JobId: __string
    }
    interface GetExportJobResponse {
        var ExportJobResponse: ExportJobResponse
    }
    interface GetExportJobsRequest {
        var ApplicationId: __string
        var PageSize: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Token: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetExportJobsResponse {
        var ExportJobsResponse: ExportJobsResponse
    }
    interface GetGcmChannelRequest {
        var ApplicationId: __string
    }
    interface GetGcmChannelResponse {
        var GCMChannelResponse: GCMChannelResponse
    }
    interface GetImportJobRequest {
        var ApplicationId: __string
        var JobId: __string
    }
    interface GetImportJobResponse {
        var ImportJobResponse: ImportJobResponse
    }
    interface GetImportJobsRequest {
        var ApplicationId: __string
        var PageSize: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Token: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetImportJobsResponse {
        var ImportJobsResponse: ImportJobsResponse
    }
    interface GetJourneyDateRangeKpiRequest {
        var ApplicationId: __string
        var EndTime: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var JourneyId: __string
        var KpiName: __string
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: __string?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetJourneyDateRangeKpiResponse {
        var JourneyDateRangeKpiResponse: JourneyDateRangeKpiResponse
    }
    interface GetJourneyExecutionActivityMetricsRequest {
        var ApplicationId: __string
        var JourneyActivityId: __string
        var JourneyId: __string
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetJourneyExecutionActivityMetricsResponse {
        var JourneyExecutionActivityMetricsResponse: JourneyExecutionActivityMetricsResponse
    }
    interface GetJourneyExecutionMetricsRequest {
        var ApplicationId: __string
        var JourneyId: __string
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetJourneyExecutionMetricsResponse {
        var JourneyExecutionMetricsResponse: JourneyExecutionMetricsResponse
    }
    interface GetJourneyRequest {
        var ApplicationId: __string
        var JourneyId: __string
    }
    interface GetJourneyResponse {
        var JourneyResponse: JourneyResponse
    }
    interface GetPushTemplateRequest {
        var TemplateName: __string
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPushTemplateResponse {
        var PushNotificationTemplateResponse: PushNotificationTemplateResponse
    }
    interface GetRecommenderConfigurationRequest {
        var RecommenderId: __string
    }
    interface GetRecommenderConfigurationResponse {
        var RecommenderConfigurationResponse: RecommenderConfigurationResponse
    }
    interface GetRecommenderConfigurationsRequest {
        var PageSize: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Token: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRecommenderConfigurationsResponse {
        var ListRecommenderConfigurationsResponse: ListRecommenderConfigurationsResponse
    }
    interface GetSegmentExportJobsRequest {
        var ApplicationId: __string
        var PageSize: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentId: __string
        var Token: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSegmentExportJobsResponse {
        var ExportJobsResponse: ExportJobsResponse
    }
    interface GetSegmentImportJobsRequest {
        var ApplicationId: __string
        var PageSize: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentId: __string
        var Token: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSegmentImportJobsResponse {
        var ImportJobsResponse: ImportJobsResponse
    }
    interface GetSegmentRequest {
        var ApplicationId: __string
        var SegmentId: __string
    }
    interface GetSegmentResponse {
        var SegmentResponse: SegmentResponse
    }
    interface GetSegmentVersionRequest {
        var ApplicationId: __string
        var SegmentId: __string
        var Version: __string
    }
    interface GetSegmentVersionResponse {
        var SegmentResponse: SegmentResponse
    }
    interface GetSegmentVersionsRequest {
        var ApplicationId: __string
        var PageSize: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentId: __string
        var Token: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSegmentVersionsResponse {
        var SegmentsResponse: SegmentsResponse
    }
    interface GetSegmentsRequest {
        var ApplicationId: __string
        var PageSize: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Token: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSegmentsResponse {
        var SegmentsResponse: SegmentsResponse
    }
    interface GetSmsChannelRequest {
        var ApplicationId: __string
    }
    interface GetSmsChannelResponse {
        var SMSChannelResponse: SMSChannelResponse
    }
    interface GetSmsTemplateRequest {
        var TemplateName: __string
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSmsTemplateResponse {
        var SMSTemplateResponse: SMSTemplateResponse
    }
    interface GetUserEndpointsRequest {
        var ApplicationId: __string
        var UserId: __string
    }
    interface GetUserEndpointsResponse {
        var EndpointsResponse: EndpointsResponse
    }
    interface GetVoiceChannelRequest {
        var ApplicationId: __string
    }
    interface GetVoiceChannelResponse {
        var VoiceChannelResponse: VoiceChannelResponse
    }
    interface GetVoiceTemplateRequest {
        var TemplateName: __string
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetVoiceTemplateResponse {
        var VoiceTemplateResponse: VoiceTemplateResponse
    }
    interface HoldoutActivity {
        var NextActivity: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Percentage: __integer
    }
    interface ImportJobRequest {
        var DefineSegment: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ExternalId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Format: String /* "CSV" | "JSON" | String */
        var RegisterEndpoints: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: __string
        var S3Url: __string
        var SegmentId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentName: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportJobResource {
        var DefineSegment: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ExternalId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Format: String /* "CSV" | "JSON" | String */
        var RegisterEndpoints: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: __string
        var S3Url: __string
        var SegmentId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentName: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportJobResponse {
        var ApplicationId: __string
        var CompletedPieces: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var CompletionDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: __string
        var Definition: ImportJobResource
        var FailedPieces: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Failures: ListOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string
        var JobStatus: String /* "CREATED" | "PREPARING_FOR_INITIALIZATION" | "INITIALIZING" | "PROCESSING" | "PENDING_JOB" | "COMPLETING" | "COMPLETED" | "FAILING" | "FAILED" | String */
        var TotalFailures: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var TotalPieces: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var TotalProcessed: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Type: __string
    }
    interface ImportJobsResponse {
        var Item: ListOfImportJobResponse
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ItemResponse {
        var EndpointItemResponse: EndpointItemResponse?
            get() = definedExternally
            set(value) = definedExternally
        var EventsItemResponse: MapOfEventItemResponse?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JourneyDateRangeKpiResponse {
        var ApplicationId: __string
        var EndTime: __timestampIso8601
        var JourneyId: __string
        var KpiName: __string
        var KpiResult: BaseKpiResult
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: __timestampIso8601
    }
    interface JourneyEmailMessage {
        var FromAddress: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JourneyExecutionActivityMetricsResponse {
        var ActivityType: __string
        var ApplicationId: __string
        var JourneyActivityId: __string
        var JourneyId: __string
        var LastEvaluatedTime: __string
        var Metrics: MapOf__string
    }
    interface JourneyExecutionMetricsResponse {
        var ApplicationId: __string
        var JourneyId: __string
        var LastEvaluatedTime: __string
        var Metrics: MapOf__string
    }
    interface JourneyLimits {
        var DailyCap: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointReentryCap: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var MessagesPerSecond: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JourneyResponse {
        var Activities: MapOfActivity?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationId: __string
        var CreationDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string
        var LastModifiedDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Limits: JourneyLimits?
            get() = definedExternally
            set(value) = definedExternally
        var LocalTime: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string
        var QuietTime: QuietTime?
            get() = definedExternally
            set(value) = definedExternally
        var RefreshFrequency: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: JourneySchedule?
            get() = definedExternally
            set(value) = definedExternally
        var StartActivity: __string?
            get() = definedExternally
            set(value) = definedExternally
        var StartCondition: StartCondition?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "DRAFT" | "ACTIVE" | "COMPLETED" | "CANCELLED" | "CLOSED" | String */
        var tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JourneySchedule {
        var EndTime: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var Timezone: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JourneyStateRequest {
        var State: String /* "DRAFT" | "ACTIVE" | "COMPLETED" | "CANCELLED" | "CLOSED" | String */
    }
    interface JourneysResponse {
        var Item: ListOfJourneyResponse
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJourneysRequest {
        var ApplicationId: __string
        var PageSize: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Token: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJourneysResponse {
        var JourneysResponse: JourneysResponse
    }
    interface ListRecommenderConfigurationsResponse {
        var Item: ListOfRecommenderConfigurationResponse
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: __string
    }
    interface ListTagsForResourceResponse {
        var TagsModel: TagsModel
    }
    interface ListTemplateVersionsRequest {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateName: __string
        var TemplateType: __string
    }
    interface ListTemplateVersionsResponse {
        var TemplateVersionsResponse: TemplateVersionsResponse
    }
    interface ListTemplatesRequest {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Prefix: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateType: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTemplatesResponse {
        var TemplatesResponse: TemplatesResponse
    }
    interface Message {
        var Action: String /* "OPEN_APP" | "DEEP_LINK" | "URL" | String */
        var Body: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ImageIconUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ImageSmallIconUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ImageUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var JsonBody: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MediaUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RawContent: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SilentPush: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var TimeToLive: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Title: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MessageBody {
        var Message: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RequestID: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MessageConfiguration {
        var ADMMessage: Message?
            get() = definedExternally
            set(value) = definedExternally
        var APNSMessage: Message?
            get() = definedExternally
            set(value) = definedExternally
        var BaiduMessage: Message?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultMessage: Message?
            get() = definedExternally
            set(value) = definedExternally
        var EmailMessage: CampaignEmailMessage?
            get() = definedExternally
            set(value) = definedExternally
        var GCMMessage: Message?
            get() = definedExternally
            set(value) = definedExternally
        var SMSMessage: CampaignSmsMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MessageRequest {
        var Addresses: MapOfAddressConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Context: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Endpoints: MapOfEndpointSendConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var MessageConfiguration: DirectMessageConfiguration
        var TemplateConfiguration: TemplateConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var TraceId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MessageResponse {
        var ApplicationId: __string
        var EndpointResult: MapOfEndpointMessageResult?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Result: MapOfMessageResult?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MessageResult {
        var DeliveryStatus: String /* "SUCCESSFUL" | "THROTTLED" | "TEMPORARY_FAILURE" | "PERMANENT_FAILURE" | "UNKNOWN_FAILURE" | "OPT_OUT" | "DUPLICATE" | String */
        var MessageId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var StatusCode: __integer
        var StatusMessage: __string?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MetricDimension {
        var ComparisonOperator: __string
        var Value: __double
    }
    interface MultiConditionalBranch {
        var Condition: SimpleCondition?
            get() = definedExternally
            set(value) = definedExternally
        var NextActivity: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MultiConditionalSplitActivity {
        var Branches: ListOfMultiConditionalBranch?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultActivity: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EvaluationWaitTime: WaitTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NumberValidateRequest {
        var IsoCountryCode: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PhoneNumber: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NumberValidateResponse {
        var Carrier: __string?
            get() = definedExternally
            set(value) = definedExternally
        var City: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CleansedPhoneNumberE164: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CleansedPhoneNumberNational: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Country: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CountryCodeIso2: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CountryCodeNumeric: __string?
            get() = definedExternally
            set(value) = definedExternally
        var County: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OriginalCountryCodeIso2: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OriginalPhoneNumber: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PhoneType: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PhoneTypeCode: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Timezone: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ZipCode: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PhoneNumberValidateRequest {
        var NumberValidateRequest: NumberValidateRequest
    }
    interface PhoneNumberValidateResponse {
        var NumberValidateResponse: NumberValidateResponse
    }
    interface PublicEndpoint {
        var Address: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: MapOfListOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelType: String /* "GCM" | "APNS" | "APNS_SANDBOX" | "APNS_VOIP" | "APNS_VOIP_SANDBOX" | "ADM" | "SMS" | "VOICE" | "EMAIL" | "BAIDU" | "CUSTOM" | String */
        var Demographic: EndpointDemographic?
            get() = definedExternally
            set(value) = definedExternally
        var EffectiveDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointStatus: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Location: EndpointLocation?
            get() = definedExternally
            set(value) = definedExternally
        var Metrics: MapOf__double?
            get() = definedExternally
            set(value) = definedExternally
        var OptOut: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var User: EndpointUser?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PushNotificationTemplateRequest {
        var ADM: AndroidPushNotificationTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var APNS: APNSPushNotificationTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var Baidu: AndroidPushNotificationTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var Default: DefaultPushNotificationTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultSubstitutions: __string?
            get() = definedExternally
            set(value) = definedExternally
        var GCM: AndroidPushNotificationTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var RecommenderId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PushNotificationTemplateResponse {
        var ADM: AndroidPushNotificationTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var APNS: APNSPushNotificationTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Baidu: AndroidPushNotificationTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: __string
        var Default: DefaultPushNotificationTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultSubstitutions: __string?
            get() = definedExternally
            set(value) = definedExternally
        var GCM: AndroidPushNotificationTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: __string
        var RecommenderId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateName: __string
        var TemplateType: String /* "EMAIL" | "SMS" | "VOICE" | "PUSH" | String */
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutEventStreamRequest {
        var ApplicationId: __string
        var WriteEventStream: WriteEventStream
    }
    interface PutEventStreamResponse {
        var EventStream: EventStream
    }
    interface PutEventsRequest {
        var ApplicationId: __string
        var EventsRequest: EventsRequest
    }
    interface PutEventsResponse {
        var EventsResponse: EventsResponse
    }
    interface QuietTime {
        var End: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Start: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RandomSplitActivity {
        var Branches: ListOfRandomSplitEntry?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RandomSplitEntry {
        var NextActivity: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Percentage: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RawEmail {
        var Data: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecencyDimension {
        var Duration: String /* "HR_24" | "DAY_7" | "DAY_14" | "DAY_30" | String */
        var RecencyType: String /* "ACTIVE" | "INACTIVE" | String */
    }
    interface RecommenderConfigurationResponse {
        var Attributes: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: __string
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string
        var LastModifiedDate: __string
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RecommendationProviderIdType: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RecommendationProviderRoleArn: __string
        var RecommendationProviderUri: __string
        var RecommendationTransformerUri: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RecommendationsDisplayName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RecommendationsPerMessage: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveAttributesRequest {
        var ApplicationId: __string
        var AttributeType: __string
        var UpdateAttributesRequest: UpdateAttributesRequest
    }
    interface RemoveAttributesResponse {
        var AttributesResource: AttributesResource
    }
    interface ResultRow {
        var GroupedBys: ListOfResultRowValue
        var Values: ListOfResultRowValue
    }
    interface ResultRowValue {
        var Key: __string
        var Type: __string
        var Value: __string
    }
    interface SMSChannelRequest {
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SenderId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ShortCode: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SMSChannelResponse {
        var ApplicationId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var HasCredential: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var IsArchived: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Platform: __string
        var PromotionalMessagesPerSecond: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var SenderId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ShortCode: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TransactionalMessagesPerSecond: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SMSMessage {
        var Body: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Keyword: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MessageType: String /* "TRANSACTIONAL" | "PROMOTIONAL" | String */
        var OriginationNumber: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SenderId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Substitutions: MapOfListOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SMSTemplateRequest {
        var Body: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultSubstitutions: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RecommenderId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SMSTemplateResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Body: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: __string
        var DefaultSubstitutions: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: __string
        var RecommenderId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateName: __string
        var TemplateType: String /* "EMAIL" | "SMS" | "VOICE" | "PUSH" | String */
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Schedule {
        var EndTime: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EventFilter: CampaignEventFilter?
            get() = definedExternally
            set(value) = definedExternally
        var Frequency: String /* "ONCE" | "HOURLY" | "DAILY" | "WEEKLY" | "MONTHLY" | "EVENT" | String */
        var IsLocalTime: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var QuietTime: QuietTime?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: __string
        var Timezone: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SegmentBehaviors {
        var Recency: RecencyDimension?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SegmentCondition {
        var SegmentId: __string
    }
    interface SegmentDemographics {
        var AppVersion: SetDimension?
            get() = definedExternally
            set(value) = definedExternally
        var Channel: SetDimension?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceType: SetDimension?
            get() = definedExternally
            set(value) = definedExternally
        var Make: SetDimension?
            get() = definedExternally
            set(value) = definedExternally
        var Model: SetDimension?
            get() = definedExternally
            set(value) = definedExternally
        var Platform: SetDimension?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SegmentDimensions {
        var Attributes: MapOfAttributeDimension?
            get() = definedExternally
            set(value) = definedExternally
        var Behavior: SegmentBehaviors?
            get() = definedExternally
            set(value) = definedExternally
        var Demographic: SegmentDemographics?
            get() = definedExternally
            set(value) = definedExternally
        var Location: SegmentLocation?
            get() = definedExternally
            set(value) = definedExternally
        var Metrics: MapOfMetricDimension?
            get() = definedExternally
            set(value) = definedExternally
        var UserAttributes: MapOfAttributeDimension?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SegmentGroup {
        var Dimensions: ListOfSegmentDimensions?
            get() = definedExternally
            set(value) = definedExternally
        var SourceSegments: ListOfSegmentReference?
            get() = definedExternally
            set(value) = definedExternally
        var SourceType: String /* "ALL" | "ANY" | "NONE" | String */
        var Type: String /* "ALL" | "ANY" | "NONE" | String */
    }
    interface SegmentGroupList {
        var Groups: ListOfSegmentGroup?
            get() = definedExternally
            set(value) = definedExternally
        var Include: String /* "ALL" | "ANY" | "NONE" | String */
    }
    interface SegmentImportResource {
        var ChannelCounts: MapOf__integer?
            get() = definedExternally
            set(value) = definedExternally
        var ExternalId: __string
        var Format: String /* "CSV" | "JSON" | String */
        var RoleArn: __string
        var S3Url: __string
        var Size: __integer
    }
    interface SegmentLocation {
        var Country: SetDimension?
            get() = definedExternally
            set(value) = definedExternally
        var GPSPoint: GPSPointDimension?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SegmentReference {
        var Id: __string
        var Version: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SegmentResponse {
        var ApplicationId: __string
        var Arn: __string
        var CreationDate: __string
        var Dimensions: SegmentDimensions?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string
        var ImportDefinition: SegmentImportResource?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentGroups: SegmentGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentType: String /* "DIMENSIONAL" | "IMPORT" | String */
        var tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SegmentsResponse {
        var Item: ListOfSegmentResponse
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendMessagesRequest {
        var ApplicationId: __string
        var MessageRequest: MessageRequest
    }
    interface SendMessagesResponse {
        var MessageResponse: MessageResponse
    }
    interface SendUsersMessageRequest {
        var Context: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var MessageConfiguration: DirectMessageConfiguration
        var TemplateConfiguration: TemplateConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var TraceId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Users: MapOfEndpointSendConfiguration
    }
    interface SendUsersMessageResponse {
        var ApplicationId: __string
        var RequestId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Result: MapOfMapOfEndpointMessageResult?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendUsersMessagesRequest {
        var ApplicationId: __string
        var SendUsersMessageRequest: SendUsersMessageRequest
    }
    interface SendUsersMessagesResponse {
        var SendUsersMessageResponse: SendUsersMessageResponse
    }
    interface Session {
        var Duration: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string
        var StartTimestamp: __string
        var StopTimestamp: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetDimension {
        var DimensionType: String /* "INCLUSIVE" | "EXCLUSIVE" | String */
        var Values: ListOf__string
    }
    interface SimpleCondition {
        var EventCondition: EventCondition?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentCondition: SegmentCondition?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentDimensions: SegmentDimensions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SimpleEmail {
        var HtmlPart: SimpleEmailPart?
            get() = definedExternally
            set(value) = definedExternally
        var Subject: SimpleEmailPart?
            get() = definedExternally
            set(value) = definedExternally
        var TextPart: SimpleEmailPart?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SimpleEmailPart {
        var Charset: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Data: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartCondition {
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentStartCondition: SegmentCondition?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var ResourceArn: __string
        var TagsModel: TagsModel
    }
    interface TagsModel {
        var tags: MapOf__string
    }
    interface Template {
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TemplateActiveVersionRequest {
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TemplateConfiguration {
        var EmailTemplate: Template?
            get() = definedExternally
            set(value) = definedExternally
        var PushTemplate: Template?
            get() = definedExternally
            set(value) = definedExternally
        var SMSTemplate: Template?
            get() = definedExternally
            set(value) = definedExternally
        var VoiceTemplate: Template?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TemplateResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: __string
        var DefaultSubstitutions: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: __string
        var tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateName: __string
        var TemplateType: String /* "EMAIL" | "SMS" | "VOICE" | "PUSH" | String */
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TemplateVersionResponse {
        var CreationDate: __string
        var DefaultSubstitutions: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: __string
        var TemplateDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateName: __string
        var TemplateType: __string
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TemplateVersionsResponse {
        var Item: ListOfTemplateVersionResponse
        var Message: __string?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RequestID: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TemplatesResponse {
        var Item: ListOfTemplateResponse
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TreatmentResource {
        var Id: __string
        var MessageConfiguration: MessageConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: Schedule?
            get() = definedExternally
            set(value) = definedExternally
        var SizePercent: __integer
        var State: CampaignState?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateConfiguration: TemplateConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var TreatmentDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TreatmentName: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceRequest {
        var ResourceArn: __string
        var TagKeys: ListOf__string
    }
    interface UpdateAdmChannelRequest {
        var ADMChannelRequest: ADMChannelRequest
        var ApplicationId: __string
    }
    interface UpdateAdmChannelResponse {
        var ADMChannelResponse: ADMChannelResponse
    }
    interface UpdateApnsChannelRequest {
        var APNSChannelRequest: APNSChannelRequest
        var ApplicationId: __string
    }
    interface UpdateApnsChannelResponse {
        var APNSChannelResponse: APNSChannelResponse
    }
    interface UpdateApnsSandboxChannelRequest {
        var APNSSandboxChannelRequest: APNSSandboxChannelRequest
        var ApplicationId: __string
    }
    interface UpdateApnsSandboxChannelResponse {
        var APNSSandboxChannelResponse: APNSSandboxChannelResponse
    }
    interface UpdateApnsVoipChannelRequest {
        var APNSVoipChannelRequest: APNSVoipChannelRequest
        var ApplicationId: __string
    }
    interface UpdateApnsVoipChannelResponse {
        var APNSVoipChannelResponse: APNSVoipChannelResponse
    }
    interface UpdateApnsVoipSandboxChannelRequest {
        var APNSVoipSandboxChannelRequest: APNSVoipSandboxChannelRequest
        var ApplicationId: __string
    }
    interface UpdateApnsVoipSandboxChannelResponse {
        var APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse
    }
    interface UpdateApplicationSettingsRequest {
        var ApplicationId: __string
        var WriteApplicationSettingsRequest: WriteApplicationSettingsRequest
    }
    interface UpdateApplicationSettingsResponse {
        var ApplicationSettingsResource: ApplicationSettingsResource
    }
    interface UpdateAttributesRequest {
        var Blacklist: ListOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateBaiduChannelRequest {
        var ApplicationId: __string
        var BaiduChannelRequest: BaiduChannelRequest
    }
    interface UpdateBaiduChannelResponse {
        var BaiduChannelResponse: BaiduChannelResponse
    }
    interface UpdateCampaignRequest {
        var ApplicationId: __string
        var CampaignId: __string
        var WriteCampaignRequest: WriteCampaignRequest
    }
    interface UpdateCampaignResponse {
        var CampaignResponse: CampaignResponse
    }
    interface UpdateEmailChannelRequest {
        var ApplicationId: __string
        var EmailChannelRequest: EmailChannelRequest
    }
    interface UpdateEmailChannelResponse {
        var EmailChannelResponse: EmailChannelResponse
    }
    interface UpdateEmailTemplateRequest {
        var CreateNewVersion: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EmailTemplateRequest: EmailTemplateRequest
        var TemplateName: __string
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateEmailTemplateResponse {
        var MessageBody: MessageBody
    }
    interface UpdateEndpointRequest {
        var ApplicationId: __string
        var EndpointId: __string
        var EndpointRequest: EndpointRequest
    }
    interface UpdateEndpointResponse {
        var MessageBody: MessageBody
    }
    interface UpdateEndpointsBatchRequest {
        var ApplicationId: __string
        var EndpointBatchRequest: EndpointBatchRequest
    }
    interface UpdateEndpointsBatchResponse {
        var MessageBody: MessageBody
    }
    interface UpdateGcmChannelRequest {
        var ApplicationId: __string
        var GCMChannelRequest: GCMChannelRequest
    }
    interface UpdateGcmChannelResponse {
        var GCMChannelResponse: GCMChannelResponse
    }
    interface UpdateJourneyRequest {
        var ApplicationId: __string
        var JourneyId: __string
        var WriteJourneyRequest: WriteJourneyRequest
    }
    interface UpdateJourneyResponse {
        var JourneyResponse: JourneyResponse
    }
    interface UpdateJourneyStateRequest {
        var ApplicationId: __string
        var JourneyId: __string
        var JourneyStateRequest: JourneyStateRequest
    }
    interface UpdateJourneyStateResponse {
        var JourneyResponse: JourneyResponse
    }
    interface UpdatePushTemplateRequest {
        var CreateNewVersion: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var PushNotificationTemplateRequest: PushNotificationTemplateRequest
        var TemplateName: __string
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdatePushTemplateResponse {
        var MessageBody: MessageBody
    }
    interface UpdateRecommenderConfiguration {
        var Attributes: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RecommendationProviderIdType: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RecommendationProviderRoleArn: __string
        var RecommendationProviderUri: __string
        var RecommendationTransformerUri: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RecommendationsDisplayName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RecommendationsPerMessage: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRecommenderConfigurationRequest {
        var RecommenderId: __string
        var UpdateRecommenderConfiguration: UpdateRecommenderConfiguration
    }
    interface UpdateRecommenderConfigurationResponse {
        var RecommenderConfigurationResponse: RecommenderConfigurationResponse
    }
    interface UpdateSegmentRequest {
        var ApplicationId: __string
        var SegmentId: __string
        var WriteSegmentRequest: WriteSegmentRequest
    }
    interface UpdateSegmentResponse {
        var SegmentResponse: SegmentResponse
    }
    interface UpdateSmsChannelRequest {
        var ApplicationId: __string
        var SMSChannelRequest: SMSChannelRequest
    }
    interface UpdateSmsChannelResponse {
        var SMSChannelResponse: SMSChannelResponse
    }
    interface UpdateSmsTemplateRequest {
        var CreateNewVersion: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SMSTemplateRequest: SMSTemplateRequest
        var TemplateName: __string
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSmsTemplateResponse {
        var MessageBody: MessageBody
    }
    interface UpdateTemplateActiveVersionRequest {
        var TemplateActiveVersionRequest: TemplateActiveVersionRequest
        var TemplateName: __string
        var TemplateType: __string
    }
    interface UpdateTemplateActiveVersionResponse {
        var MessageBody: MessageBody
    }
    interface UpdateVoiceChannelRequest {
        var ApplicationId: __string
        var VoiceChannelRequest: VoiceChannelRequest
    }
    interface UpdateVoiceChannelResponse {
        var VoiceChannelResponse: VoiceChannelResponse
    }
    interface UpdateVoiceTemplateRequest {
        var CreateNewVersion: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateName: __string
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
        var VoiceTemplateRequest: VoiceTemplateRequest
    }
    interface UpdateVoiceTemplateResponse {
        var MessageBody: MessageBody
    }
    interface VoiceChannelRequest {
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VoiceChannelResponse {
        var ApplicationId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var HasCredential: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var IsArchived: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Platform: __string
        var Version: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VoiceMessage {
        var Body: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OriginationNumber: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Substitutions: MapOfListOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var VoiceId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VoiceTemplateRequest {
        var Body: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultSubstitutions: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: __string?
            get() = definedExternally
            set(value) = definedExternally
        var tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
        var VoiceId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VoiceTemplateResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Body: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: __string
        var DefaultSubstitutions: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: __string
        var tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateName: __string
        var TemplateType: String /* "EMAIL" | "SMS" | "VOICE" | "PUSH" | String */
        var Version: __string?
            get() = definedExternally
            set(value) = definedExternally
        var VoiceId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WaitActivity {
        var NextActivity: __string?
            get() = definedExternally
            set(value) = definedExternally
        var WaitTime: WaitTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WaitTime {
        var WaitFor: __string?
            get() = definedExternally
            set(value) = definedExternally
        var WaitUntil: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WriteApplicationSettingsRequest {
        var CampaignHook: CampaignHook?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchMetricsEnabled: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Limits: CampaignLimits?
            get() = definedExternally
            set(value) = definedExternally
        var QuietTime: QuietTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WriteCampaignRequest {
        var AdditionalTreatments: ListOfWriteTreatmentResource?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HoldoutPercent: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Hook: CampaignHook?
            get() = definedExternally
            set(value) = definedExternally
        var IsPaused: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Limits: CampaignLimits?
            get() = definedExternally
            set(value) = definedExternally
        var MessageConfiguration: MessageConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: Schedule?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentVersion: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateConfiguration: TemplateConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var TreatmentDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TreatmentName: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WriteEventStream {
        var DestinationStreamArn: __string
        var RoleArn: __string
    }
    interface WriteJourneyRequest {
        var Activities: MapOfActivity?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Limits: JourneyLimits?
            get() = definedExternally
            set(value) = definedExternally
        var LocalTime: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string
        var QuietTime: QuietTime?
            get() = definedExternally
            set(value) = definedExternally
        var RefreshFrequency: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: JourneySchedule?
            get() = definedExternally
            set(value) = definedExternally
        var StartActivity: __string?
            get() = definedExternally
            set(value) = definedExternally
        var StartCondition: StartCondition?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "DRAFT" | "ACTIVE" | "COMPLETED" | "CANCELLED" | "CLOSED" | String */
    }
    interface WriteSegmentRequest {
        var Dimensions: SegmentDimensions?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentGroups: SegmentGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WriteTreatmentResource {
        var MessageConfiguration: MessageConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: Schedule?
            get() = definedExternally
            set(value) = definedExternally
        var SizePercent: __integer
        var TemplateConfiguration: TemplateConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var TreatmentDescription: __string?
            get() = definedExternally
            set(value) = definedExternally
        var TreatmentName: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MapOfActivity {
        @nativeGetter
        operator fun get(key: String): Activity?
        @nativeSetter
        operator fun set(key: String, value: Activity)
    }
    interface MapOfAddressConfiguration {
        @nativeGetter
        operator fun get(key: String): AddressConfiguration?
        @nativeSetter
        operator fun set(key: String, value: AddressConfiguration)
    }
    interface MapOfAttributeDimension {
        @nativeGetter
        operator fun get(key: String): AttributeDimension?
        @nativeSetter
        operator fun set(key: String, value: AttributeDimension)
    }
    interface MapOfChannelResponse {
        @nativeGetter
        operator fun get(key: String): ChannelResponse?
        @nativeSetter
        operator fun set(key: String, value: ChannelResponse)
    }
    interface MapOfEndpointMessageResult {
        @nativeGetter
        operator fun get(key: String): EndpointMessageResult?
        @nativeSetter
        operator fun set(key: String, value: EndpointMessageResult)
    }
    interface MapOfEndpointSendConfiguration {
        @nativeGetter
        operator fun get(key: String): EndpointSendConfiguration?
        @nativeSetter
        operator fun set(key: String, value: EndpointSendConfiguration)
    }
    interface MapOfEvent {
        @nativeGetter
        operator fun get(key: String): Event?
        @nativeSetter
        operator fun set(key: String, value: Event)
    }
    interface MapOfEventItemResponse {
        @nativeGetter
        operator fun get(key: String): EventItemResponse?
        @nativeSetter
        operator fun set(key: String, value: EventItemResponse)
    }
    interface MapOfEventsBatch {
        @nativeGetter
        operator fun get(key: String): EventsBatch?
        @nativeSetter
        operator fun set(key: String, value: EventsBatch)
    }
    interface MapOfItemResponse {
        @nativeGetter
        operator fun get(key: String): ItemResponse?
        @nativeSetter
        operator fun set(key: String, value: ItemResponse)
    }
    interface MapOfMessageResult {
        @nativeGetter
        operator fun get(key: String): MessageResult?
        @nativeSetter
        operator fun set(key: String, value: MessageResult)
    }
    interface MapOfMetricDimension {
        @nativeGetter
        operator fun get(key: String): MetricDimension?
        @nativeSetter
        operator fun set(key: String, value: MetricDimension)
    }
    interface MapOf__double {
        @nativeGetter
        operator fun get(key: String): __double?
        @nativeSetter
        operator fun set(key: String, value: __double)
    }
    interface MapOf__integer {
        @nativeGetter
        operator fun get(key: String): __integer?
        @nativeSetter
        operator fun set(key: String, value: __integer)
    }
    interface MapOfListOf__string {
        @nativeGetter
        operator fun get(key: String): ListOf__string?
        @nativeSetter
        operator fun set(key: String, value: ListOf__string)
    }
    interface MapOfMapOfEndpointMessageResult {
        @nativeGetter
        operator fun get(key: String): MapOfEndpointMessageResult?
        @nativeSetter
        operator fun set(key: String, value: MapOfEndpointMessageResult)
    }
    interface MapOf__string {
        @nativeGetter
        operator fun get(key: String): __string?
        @nativeSetter
        operator fun set(key: String, value: __string)
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2016-12-01" | "latest" | String */
    }
}