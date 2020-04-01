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
import PinpointSMSVoice.EventDestination
import PinpointSMSVoice.CreateConfigurationSetRequest
import PinpointSMSVoice.CreateConfigurationSetResponse
import PinpointSMSVoice.CreateConfigurationSetEventDestinationRequest
import PinpointSMSVoice.CreateConfigurationSetEventDestinationResponse
import PinpointSMSVoice.DeleteConfigurationSetRequest
import PinpointSMSVoice.DeleteConfigurationSetResponse
import PinpointSMSVoice.DeleteConfigurationSetEventDestinationRequest
import PinpointSMSVoice.DeleteConfigurationSetEventDestinationResponse
import PinpointSMSVoice.GetConfigurationSetEventDestinationsRequest
import PinpointSMSVoice.GetConfigurationSetEventDestinationsResponse
import PinpointSMSVoice.ListConfigurationSetsRequest
import PinpointSMSVoice.ListConfigurationSetsResponse
import PinpointSMSVoice.SendVoiceMessageRequest
import PinpointSMSVoice.SendVoiceMessageResponse
import PinpointSMSVoice.UpdateConfigurationSetEventDestinationRequest
import PinpointSMSVoice.UpdateConfigurationSetEventDestinationResponse
import PinpointSMSVoice.EventDestinationDefinition
import PinpointSMSVoice.CloudWatchLogsDestination
import PinpointSMSVoice.KinesisFirehoseDestination
import PinpointSMSVoice.SnsDestination
import PinpointSMSVoice.VoiceMessageContent
import PinpointSMSVoice.CallInstructionsMessageType
import PinpointSMSVoice.PlainTextMessageType
import PinpointSMSVoice.SSMLMessageType

typealias Boolean = Boolean

typealias ConfigurationSets = Array<WordCharactersWithDelimiters>

typealias EventDestinations = Array<EventDestination>

typealias EventTypes = Array<String /* "INITIATED_CALL" | "RINGING" | "ANSWERED" | "COMPLETED_CALL" | "BUSY" | "FAILED" | "NO_ANSWER" | String */>

typealias NextTokenString = String

typealias NonEmptyString = String

typealias String = String

typealias WordCharactersWithDelimiters = String

typealias __string = String

@JsModule("aws-sdk")
external open class PinpointSMSVoice(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & PinpointSMSVoice.Types.ClientConfiguration */
    open fun createConfigurationSet(params: CreateConfigurationSetRequest, callback: (err: AWSError, data: CreateConfigurationSetResponse) -> Unit = definedExternally): Request<CreateConfigurationSetResponse, AWSError>
    open fun createConfigurationSet(callback: (err: AWSError, data: CreateConfigurationSetResponse) -> Unit = definedExternally): Request<CreateConfigurationSetResponse, AWSError>
    open fun createConfigurationSetEventDestination(params: CreateConfigurationSetEventDestinationRequest, callback: (err: AWSError, data: CreateConfigurationSetEventDestinationResponse) -> Unit = definedExternally): Request<CreateConfigurationSetEventDestinationResponse, AWSError>
    open fun createConfigurationSetEventDestination(callback: (err: AWSError, data: CreateConfigurationSetEventDestinationResponse) -> Unit = definedExternally): Request<CreateConfigurationSetEventDestinationResponse, AWSError>
    open fun deleteConfigurationSet(params: DeleteConfigurationSetRequest, callback: (err: AWSError, data: DeleteConfigurationSetResponse) -> Unit = definedExternally): Request<DeleteConfigurationSetResponse, AWSError>
    open fun deleteConfigurationSet(callback: (err: AWSError, data: DeleteConfigurationSetResponse) -> Unit = definedExternally): Request<DeleteConfigurationSetResponse, AWSError>
    open fun deleteConfigurationSetEventDestination(params: DeleteConfigurationSetEventDestinationRequest, callback: (err: AWSError, data: DeleteConfigurationSetEventDestinationResponse) -> Unit = definedExternally): Request<DeleteConfigurationSetEventDestinationResponse, AWSError>
    open fun deleteConfigurationSetEventDestination(callback: (err: AWSError, data: DeleteConfigurationSetEventDestinationResponse) -> Unit = definedExternally): Request<DeleteConfigurationSetEventDestinationResponse, AWSError>
    open fun getConfigurationSetEventDestinations(params: GetConfigurationSetEventDestinationsRequest, callback: (err: AWSError, data: GetConfigurationSetEventDestinationsResponse) -> Unit = definedExternally): Request<GetConfigurationSetEventDestinationsResponse, AWSError>
    open fun getConfigurationSetEventDestinations(callback: (err: AWSError, data: GetConfigurationSetEventDestinationsResponse) -> Unit = definedExternally): Request<GetConfigurationSetEventDestinationsResponse, AWSError>
    open fun listConfigurationSets(params: ListConfigurationSetsRequest, callback: (err: AWSError, data: ListConfigurationSetsResponse) -> Unit = definedExternally): Request<ListConfigurationSetsResponse, AWSError>
    open fun listConfigurationSets(callback: (err: AWSError, data: ListConfigurationSetsResponse) -> Unit = definedExternally): Request<ListConfigurationSetsResponse, AWSError>
    open fun sendVoiceMessage(params: SendVoiceMessageRequest, callback: (err: AWSError, data: SendVoiceMessageResponse) -> Unit = definedExternally): Request<SendVoiceMessageResponse, AWSError>
    open fun sendVoiceMessage(callback: (err: AWSError, data: SendVoiceMessageResponse) -> Unit = definedExternally): Request<SendVoiceMessageResponse, AWSError>
    open fun updateConfigurationSetEventDestination(params: UpdateConfigurationSetEventDestinationRequest, callback: (err: AWSError, data: UpdateConfigurationSetEventDestinationResponse) -> Unit = definedExternally): Request<UpdateConfigurationSetEventDestinationResponse, AWSError>
    open fun updateConfigurationSetEventDestination(callback: (err: AWSError, data: UpdateConfigurationSetEventDestinationResponse) -> Unit = definedExternally): Request<UpdateConfigurationSetEventDestinationResponse, AWSError>
    interface CallInstructionsMessageType {
        var Text: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CloudWatchLogsDestination {
        var IamRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var LogGroupArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateConfigurationSetEventDestinationRequest {
        var ConfigurationSetName: __string
        var EventDestination: EventDestinationDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var EventDestinationName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateConfigurationSetEventDestinationResponse
    interface CreateConfigurationSetRequest {
        var ConfigurationSetName: WordCharactersWithDelimiters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateConfigurationSetResponse
    interface DeleteConfigurationSetEventDestinationRequest {
        var ConfigurationSetName: __string
        var EventDestinationName: __string
    }
    interface DeleteConfigurationSetEventDestinationResponse
    interface DeleteConfigurationSetRequest {
        var ConfigurationSetName: __string
    }
    interface DeleteConfigurationSetResponse
    interface EventDestination {
        var CloudWatchLogsDestination: CloudWatchLogsDestination?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var KinesisFirehoseDestination: KinesisFirehoseDestination?
            get() = definedExternally
            set(value) = definedExternally
        var MatchingEventTypes: EventTypes?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnsDestination: SnsDestination?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventDestinationDefinition {
        var CloudWatchLogsDestination: CloudWatchLogsDestination?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var KinesisFirehoseDestination: KinesisFirehoseDestination?
            get() = definedExternally
            set(value) = definedExternally
        var MatchingEventTypes: EventTypes?
            get() = definedExternally
            set(value) = definedExternally
        var SnsDestination: SnsDestination?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetConfigurationSetEventDestinationsRequest {
        var ConfigurationSetName: __string
    }
    interface GetConfigurationSetEventDestinationsResponse {
        var EventDestinations: EventDestinations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KinesisFirehoseDestination {
        var DeliveryStreamArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var IamRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConfigurationSetsRequest {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConfigurationSetsResponse {
        var ConfigurationSets: ConfigurationSets?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextTokenString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PlainTextMessageType {
        var LanguageCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var Text: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var VoiceId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SSMLMessageType {
        var LanguageCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var Text: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var VoiceId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendVoiceMessageRequest {
        var CallerId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationSetName: WordCharactersWithDelimiters?
            get() = definedExternally
            set(value) = definedExternally
        var Content: VoiceMessageContent?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationPhoneNumber: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var OriginationPhoneNumber: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendVoiceMessageResponse {
        var MessageId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SnsDestination {
        var TopicArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateConfigurationSetEventDestinationRequest {
        var ConfigurationSetName: __string
        var EventDestination: EventDestinationDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var EventDestinationName: __string
    }
    interface UpdateConfigurationSetEventDestinationResponse
    interface VoiceMessageContent {
        var CallInstructionsMessage: CallInstructionsMessageType?
            get() = definedExternally
            set(value) = definedExternally
        var PlainTextMessage: PlainTextMessageType?
            get() = definedExternally
            set(value) = definedExternally
        var SSMLMessage: SSMLMessageType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-09-05" | "latest" | String */
    }
}