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
import LexModelBuildingService.BotAliasMetadata
import LexModelBuildingService.BotChannelAssociation
import LexModelBuildingService.BotMetadata
import LexModelBuildingService.BuiltinIntentMetadata
import LexModelBuildingService.BuiltinIntentSlot
import LexModelBuildingService.BuiltinSlotTypeMetadata
import LexModelBuildingService.EnumerationValue
import LexModelBuildingService.Intent
import LexModelBuildingService.IntentMetadata
import LexModelBuildingService.UtteranceData
import LexModelBuildingService.UtteranceList
import LexModelBuildingService.LogSettingsRequest
import LexModelBuildingService.LogSettingsResponse
import LexModelBuildingService.Message
import LexModelBuildingService.Slot
import LexModelBuildingService.SlotTypeConfiguration
import LexModelBuildingService.SlotTypeMetadata
import LexModelBuildingService.Tag
import LexModelBuildingService.CreateBotVersionRequest
import LexModelBuildingService.CreateBotVersionResponse
import LexModelBuildingService.CreateIntentVersionRequest
import LexModelBuildingService.CreateIntentVersionResponse
import LexModelBuildingService.CreateSlotTypeVersionRequest
import LexModelBuildingService.CreateSlotTypeVersionResponse
import LexModelBuildingService.DeleteBotRequest
import LexModelBuildingService.DeleteBotAliasRequest
import LexModelBuildingService.DeleteBotChannelAssociationRequest
import LexModelBuildingService.DeleteBotVersionRequest
import LexModelBuildingService.DeleteIntentRequest
import LexModelBuildingService.DeleteIntentVersionRequest
import LexModelBuildingService.DeleteSlotTypeRequest
import LexModelBuildingService.DeleteSlotTypeVersionRequest
import LexModelBuildingService.DeleteUtterancesRequest
import LexModelBuildingService.GetBotRequest
import LexModelBuildingService.GetBotResponse
import LexModelBuildingService.GetBotAliasRequest
import LexModelBuildingService.GetBotAliasResponse
import LexModelBuildingService.GetBotAliasesRequest
import LexModelBuildingService.GetBotAliasesResponse
import LexModelBuildingService.GetBotChannelAssociationRequest
import LexModelBuildingService.GetBotChannelAssociationResponse
import LexModelBuildingService.GetBotChannelAssociationsRequest
import LexModelBuildingService.GetBotChannelAssociationsResponse
import LexModelBuildingService.GetBotVersionsRequest
import LexModelBuildingService.GetBotVersionsResponse
import LexModelBuildingService.GetBotsRequest
import LexModelBuildingService.GetBotsResponse
import LexModelBuildingService.GetBuiltinIntentRequest
import LexModelBuildingService.GetBuiltinIntentResponse
import LexModelBuildingService.GetBuiltinIntentsRequest
import LexModelBuildingService.GetBuiltinIntentsResponse
import LexModelBuildingService.GetBuiltinSlotTypesRequest
import LexModelBuildingService.GetBuiltinSlotTypesResponse
import LexModelBuildingService.GetExportRequest
import LexModelBuildingService.GetExportResponse
import LexModelBuildingService.GetImportRequest
import LexModelBuildingService.GetImportResponse
import LexModelBuildingService.GetIntentRequest
import LexModelBuildingService.GetIntentResponse
import LexModelBuildingService.GetIntentVersionsRequest
import LexModelBuildingService.GetIntentVersionsResponse
import LexModelBuildingService.GetIntentsRequest
import LexModelBuildingService.GetIntentsResponse
import LexModelBuildingService.GetSlotTypeRequest
import LexModelBuildingService.GetSlotTypeResponse
import LexModelBuildingService.GetSlotTypeVersionsRequest
import LexModelBuildingService.GetSlotTypeVersionsResponse
import LexModelBuildingService.GetSlotTypesRequest
import LexModelBuildingService.GetSlotTypesResponse
import LexModelBuildingService.GetUtterancesViewRequest
import LexModelBuildingService.GetUtterancesViewResponse
import LexModelBuildingService.ListTagsForResourceRequest
import LexModelBuildingService.ListTagsForResourceResponse
import LexModelBuildingService.PutBotRequest
import LexModelBuildingService.PutBotResponse
import LexModelBuildingService.PutBotAliasRequest
import LexModelBuildingService.PutBotAliasResponse
import LexModelBuildingService.PutIntentRequest
import LexModelBuildingService.PutIntentResponse
import LexModelBuildingService.PutSlotTypeRequest
import LexModelBuildingService.PutSlotTypeResponse
import LexModelBuildingService.StartImportRequest
import LexModelBuildingService.StartImportResponse
import LexModelBuildingService.TagResourceRequest
import LexModelBuildingService.TagResourceResponse
import LexModelBuildingService.UntagResourceRequest
import LexModelBuildingService.UntagResourceResponse
import LexModelBuildingService.ConversationLogsResponse
import LexModelBuildingService.ChannelConfigurationMap
import LexModelBuildingService.Prompt
import LexModelBuildingService.Statement
import LexModelBuildingService.FollowUpPrompt
import LexModelBuildingService.CodeHook
import LexModelBuildingService.FulfillmentActivity
import LexModelBuildingService.ConversationLogsRequest
import LexModelBuildingService.SlotTypeRegexConfiguration

typealias AliasName = String

typealias AliasNameOrListAll = String

typealias AmazonResourceName = String

typealias Boolean = Boolean

typealias BotAliasMetadataList = Array<BotAliasMetadata>

typealias BotChannelAssociationList = Array<BotChannelAssociation>

typealias BotChannelName = String

typealias BotMetadataList = Array<BotMetadata>

typealias BotName = String

typealias BotVersions = Array<Version>

typealias BuiltinIntentMetadataList = Array<BuiltinIntentMetadata>

typealias BuiltinIntentSignature = String

typealias BuiltinIntentSlotList = Array<BuiltinIntentSlot>

typealias BuiltinSlotTypeMetadataList = Array<BuiltinSlotTypeMetadata>

typealias BuiltinSlotTypeSignature = String

typealias ContentString = String

typealias Count = Number

typealias CustomOrBuiltinSlotTypeName = String

typealias Description = String

typealias EnumerationValues = Array<EnumerationValue>

typealias GroupNumber = Number

typealias IamRoleArn = String

typealias IntentList = Array<Intent>

typealias IntentMetadataList = Array<IntentMetadata>

typealias IntentName = String

typealias IntentUtteranceList = Array<Utterance>

typealias KmsKeyArn = String

typealias LambdaARN = String

typealias ListOfUtterance = Array<UtteranceData>

typealias ListsOfUtterances = Array<UtteranceList>

typealias LocaleList = Array<String /* "en-US" | "en-GB" | "de-DE" | String */>

typealias LogSettingsRequestList = Array<LogSettingsRequest>

typealias LogSettingsResponseList = Array<LogSettingsResponse>

typealias MaxResults = Number

typealias MessageList = Array<Message>

typealias MessageVersion = String

typealias Name = String

typealias NextToken = String

typealias NumericalVersion = String

typealias Priority = Number

typealias PromptMaxAttempts = Number

typealias RegexPattern = String

typealias ResourceArn = String

typealias ResourcePrefix = String

typealias ResponseCard = String

typealias SessionTTL = Number

typealias SlotList = Array<Slot>

typealias SlotName = String

typealias SlotTypeConfigurations = Array<SlotTypeConfiguration>

typealias SlotTypeMetadataList = Array<SlotTypeMetadata>

typealias SlotTypeName = String

typealias SlotUtteranceList = Array<Utterance>

typealias String = String

typealias StringList = Array<String>

typealias SynonymList = Array<Value>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias Timestamp = Date

typealias UserId = String

typealias Utterance = String

typealias UtteranceString = String

typealias Value = String

typealias Version = String

@JsModule("aws-sdk")
external open class LexModelBuildingService(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & LexModelBuildingService.Types.ClientConfiguration */
    open fun createBotVersion(params: CreateBotVersionRequest, callback: (err: AWSError, data: CreateBotVersionResponse) -> Unit = definedExternally): Request<CreateBotVersionResponse, AWSError>
    open fun createBotVersion(callback: (err: AWSError, data: CreateBotVersionResponse) -> Unit = definedExternally): Request<CreateBotVersionResponse, AWSError>
    open fun createIntentVersion(params: CreateIntentVersionRequest, callback: (err: AWSError, data: CreateIntentVersionResponse) -> Unit = definedExternally): Request<CreateIntentVersionResponse, AWSError>
    open fun createIntentVersion(callback: (err: AWSError, data: CreateIntentVersionResponse) -> Unit = definedExternally): Request<CreateIntentVersionResponse, AWSError>
    open fun createSlotTypeVersion(params: CreateSlotTypeVersionRequest, callback: (err: AWSError, data: CreateSlotTypeVersionResponse) -> Unit = definedExternally): Request<CreateSlotTypeVersionResponse, AWSError>
    open fun createSlotTypeVersion(callback: (err: AWSError, data: CreateSlotTypeVersionResponse) -> Unit = definedExternally): Request<CreateSlotTypeVersionResponse, AWSError>
    open fun deleteBot(params: DeleteBotRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteBot(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteBotAlias(params: DeleteBotAliasRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteBotAlias(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteBotChannelAssociation(params: DeleteBotChannelAssociationRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteBotChannelAssociation(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteBotVersion(params: DeleteBotVersionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteBotVersion(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteIntent(params: DeleteIntentRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteIntent(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteIntentVersion(params: DeleteIntentVersionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteIntentVersion(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSlotType(params: DeleteSlotTypeRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSlotType(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSlotTypeVersion(params: DeleteSlotTypeVersionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSlotTypeVersion(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUtterances(params: DeleteUtterancesRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUtterances(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun getBot(params: GetBotRequest, callback: (err: AWSError, data: GetBotResponse) -> Unit = definedExternally): Request<GetBotResponse, AWSError>
    open fun getBot(callback: (err: AWSError, data: GetBotResponse) -> Unit = definedExternally): Request<GetBotResponse, AWSError>
    open fun getBotAlias(params: GetBotAliasRequest, callback: (err: AWSError, data: GetBotAliasResponse) -> Unit = definedExternally): Request<GetBotAliasResponse, AWSError>
    open fun getBotAlias(callback: (err: AWSError, data: GetBotAliasResponse) -> Unit = definedExternally): Request<GetBotAliasResponse, AWSError>
    open fun getBotAliases(params: GetBotAliasesRequest, callback: (err: AWSError, data: GetBotAliasesResponse) -> Unit = definedExternally): Request<GetBotAliasesResponse, AWSError>
    open fun getBotAliases(callback: (err: AWSError, data: GetBotAliasesResponse) -> Unit = definedExternally): Request<GetBotAliasesResponse, AWSError>
    open fun getBotChannelAssociation(params: GetBotChannelAssociationRequest, callback: (err: AWSError, data: GetBotChannelAssociationResponse) -> Unit = definedExternally): Request<GetBotChannelAssociationResponse, AWSError>
    open fun getBotChannelAssociation(callback: (err: AWSError, data: GetBotChannelAssociationResponse) -> Unit = definedExternally): Request<GetBotChannelAssociationResponse, AWSError>
    open fun getBotChannelAssociations(params: GetBotChannelAssociationsRequest, callback: (err: AWSError, data: GetBotChannelAssociationsResponse) -> Unit = definedExternally): Request<GetBotChannelAssociationsResponse, AWSError>
    open fun getBotChannelAssociations(callback: (err: AWSError, data: GetBotChannelAssociationsResponse) -> Unit = definedExternally): Request<GetBotChannelAssociationsResponse, AWSError>
    open fun getBotVersions(params: GetBotVersionsRequest, callback: (err: AWSError, data: GetBotVersionsResponse) -> Unit = definedExternally): Request<GetBotVersionsResponse, AWSError>
    open fun getBotVersions(callback: (err: AWSError, data: GetBotVersionsResponse) -> Unit = definedExternally): Request<GetBotVersionsResponse, AWSError>
    open fun getBots(params: GetBotsRequest, callback: (err: AWSError, data: GetBotsResponse) -> Unit = definedExternally): Request<GetBotsResponse, AWSError>
    open fun getBots(callback: (err: AWSError, data: GetBotsResponse) -> Unit = definedExternally): Request<GetBotsResponse, AWSError>
    open fun getBuiltinIntent(params: GetBuiltinIntentRequest, callback: (err: AWSError, data: GetBuiltinIntentResponse) -> Unit = definedExternally): Request<GetBuiltinIntentResponse, AWSError>
    open fun getBuiltinIntent(callback: (err: AWSError, data: GetBuiltinIntentResponse) -> Unit = definedExternally): Request<GetBuiltinIntentResponse, AWSError>
    open fun getBuiltinIntents(params: GetBuiltinIntentsRequest, callback: (err: AWSError, data: GetBuiltinIntentsResponse) -> Unit = definedExternally): Request<GetBuiltinIntentsResponse, AWSError>
    open fun getBuiltinIntents(callback: (err: AWSError, data: GetBuiltinIntentsResponse) -> Unit = definedExternally): Request<GetBuiltinIntentsResponse, AWSError>
    open fun getBuiltinSlotTypes(params: GetBuiltinSlotTypesRequest, callback: (err: AWSError, data: GetBuiltinSlotTypesResponse) -> Unit = definedExternally): Request<GetBuiltinSlotTypesResponse, AWSError>
    open fun getBuiltinSlotTypes(callback: (err: AWSError, data: GetBuiltinSlotTypesResponse) -> Unit = definedExternally): Request<GetBuiltinSlotTypesResponse, AWSError>
    open fun getExport(params: GetExportRequest, callback: (err: AWSError, data: GetExportResponse) -> Unit = definedExternally): Request<GetExportResponse, AWSError>
    open fun getExport(callback: (err: AWSError, data: GetExportResponse) -> Unit = definedExternally): Request<GetExportResponse, AWSError>
    open fun getImport(params: GetImportRequest, callback: (err: AWSError, data: GetImportResponse) -> Unit = definedExternally): Request<GetImportResponse, AWSError>
    open fun getImport(callback: (err: AWSError, data: GetImportResponse) -> Unit = definedExternally): Request<GetImportResponse, AWSError>
    open fun getIntent(params: GetIntentRequest, callback: (err: AWSError, data: GetIntentResponse) -> Unit = definedExternally): Request<GetIntentResponse, AWSError>
    open fun getIntent(callback: (err: AWSError, data: GetIntentResponse) -> Unit = definedExternally): Request<GetIntentResponse, AWSError>
    open fun getIntentVersions(params: GetIntentVersionsRequest, callback: (err: AWSError, data: GetIntentVersionsResponse) -> Unit = definedExternally): Request<GetIntentVersionsResponse, AWSError>
    open fun getIntentVersions(callback: (err: AWSError, data: GetIntentVersionsResponse) -> Unit = definedExternally): Request<GetIntentVersionsResponse, AWSError>
    open fun getIntents(params: GetIntentsRequest, callback: (err: AWSError, data: GetIntentsResponse) -> Unit = definedExternally): Request<GetIntentsResponse, AWSError>
    open fun getIntents(callback: (err: AWSError, data: GetIntentsResponse) -> Unit = definedExternally): Request<GetIntentsResponse, AWSError>
    open fun getSlotType(params: GetSlotTypeRequest, callback: (err: AWSError, data: GetSlotTypeResponse) -> Unit = definedExternally): Request<GetSlotTypeResponse, AWSError>
    open fun getSlotType(callback: (err: AWSError, data: GetSlotTypeResponse) -> Unit = definedExternally): Request<GetSlotTypeResponse, AWSError>
    open fun getSlotTypeVersions(params: GetSlotTypeVersionsRequest, callback: (err: AWSError, data: GetSlotTypeVersionsResponse) -> Unit = definedExternally): Request<GetSlotTypeVersionsResponse, AWSError>
    open fun getSlotTypeVersions(callback: (err: AWSError, data: GetSlotTypeVersionsResponse) -> Unit = definedExternally): Request<GetSlotTypeVersionsResponse, AWSError>
    open fun getSlotTypes(params: GetSlotTypesRequest, callback: (err: AWSError, data: GetSlotTypesResponse) -> Unit = definedExternally): Request<GetSlotTypesResponse, AWSError>
    open fun getSlotTypes(callback: (err: AWSError, data: GetSlotTypesResponse) -> Unit = definedExternally): Request<GetSlotTypesResponse, AWSError>
    open fun getUtterancesView(params: GetUtterancesViewRequest, callback: (err: AWSError, data: GetUtterancesViewResponse) -> Unit = definedExternally): Request<GetUtterancesViewResponse, AWSError>
    open fun getUtterancesView(callback: (err: AWSError, data: GetUtterancesViewResponse) -> Unit = definedExternally): Request<GetUtterancesViewResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun putBot(params: PutBotRequest, callback: (err: AWSError, data: PutBotResponse) -> Unit = definedExternally): Request<PutBotResponse, AWSError>
    open fun putBot(callback: (err: AWSError, data: PutBotResponse) -> Unit = definedExternally): Request<PutBotResponse, AWSError>
    open fun putBotAlias(params: PutBotAliasRequest, callback: (err: AWSError, data: PutBotAliasResponse) -> Unit = definedExternally): Request<PutBotAliasResponse, AWSError>
    open fun putBotAlias(callback: (err: AWSError, data: PutBotAliasResponse) -> Unit = definedExternally): Request<PutBotAliasResponse, AWSError>
    open fun putIntent(params: PutIntentRequest, callback: (err: AWSError, data: PutIntentResponse) -> Unit = definedExternally): Request<PutIntentResponse, AWSError>
    open fun putIntent(callback: (err: AWSError, data: PutIntentResponse) -> Unit = definedExternally): Request<PutIntentResponse, AWSError>
    open fun putSlotType(params: PutSlotTypeRequest, callback: (err: AWSError, data: PutSlotTypeResponse) -> Unit = definedExternally): Request<PutSlotTypeResponse, AWSError>
    open fun putSlotType(callback: (err: AWSError, data: PutSlotTypeResponse) -> Unit = definedExternally): Request<PutSlotTypeResponse, AWSError>
    open fun startImport(params: StartImportRequest, callback: (err: AWSError, data: StartImportResponse) -> Unit = definedExternally): Request<StartImportResponse, AWSError>
    open fun startImport(callback: (err: AWSError, data: StartImportResponse) -> Unit = definedExternally): Request<StartImportResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    interface BotAliasMetadata {
        var name: AliasName?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var botVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
        var botName: BotName?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var checksum: String?
            get() = definedExternally
            set(value) = definedExternally
        var conversationLogs: ConversationLogsResponse?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BotChannelAssociation {
        var name: BotChannelName?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var botAlias: AliasName?
            get() = definedExternally
            set(value) = definedExternally
        var botName: BotName?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "Facebook" | "Slack" | "Twilio-Sms" | "Kik" | String */
        var botConfiguration: ChannelConfigurationMap?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "IN_PROGRESS" | "CREATED" | "FAILED" | String */
        var failureReason: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BotMetadata {
        var name: BotName?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "BUILDING" | "READY" | "READY_BASIC_TESTING" | "FAILED" | "NOT_BUILT" | String */
        var lastUpdatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BuiltinIntentMetadata {
        var signature: BuiltinIntentSignature?
            get() = definedExternally
            set(value) = definedExternally
        var supportedLocales: LocaleList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BuiltinIntentSlot {
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BuiltinSlotTypeMetadata {
        var signature: BuiltinSlotTypeSignature?
            get() = definedExternally
            set(value) = definedExternally
        var supportedLocales: LocaleList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChannelConfigurationMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface CodeHook {
        var uri: LambdaARN
        var messageVersion: MessageVersion
    }
    interface ConversationLogsRequest {
        var logSettings: LogSettingsRequestList
        var iamRoleArn: IamRoleArn
    }
    interface ConversationLogsResponse {
        var logSettings: LogSettingsResponseList?
            get() = definedExternally
            set(value) = definedExternally
        var iamRoleArn: IamRoleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBotVersionRequest {
        var name: BotName
        var checksum: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBotVersionResponse {
        var name: BotName?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var intents: IntentList?
            get() = definedExternally
            set(value) = definedExternally
        var clarificationPrompt: Prompt?
            get() = definedExternally
            set(value) = definedExternally
        var abortStatement: Statement?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "BUILDING" | "READY" | "READY_BASIC_TESTING" | "FAILED" | "NOT_BUILT" | String */
        var failureReason: String?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var idleSessionTTLInSeconds: SessionTTL?
            get() = definedExternally
            set(value) = definedExternally
        var voiceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var checksum: String?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var locale: String /* "en-US" | "en-GB" | "de-DE" | String */
        var childDirected: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var detectSentiment: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateIntentVersionRequest {
        var name: IntentName
        var checksum: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateIntentVersionResponse {
        var name: IntentName?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var slots: SlotList?
            get() = definedExternally
            set(value) = definedExternally
        var sampleUtterances: IntentUtteranceList?
            get() = definedExternally
            set(value) = definedExternally
        var confirmationPrompt: Prompt?
            get() = definedExternally
            set(value) = definedExternally
        var rejectionStatement: Statement?
            get() = definedExternally
            set(value) = definedExternally
        var followUpPrompt: FollowUpPrompt?
            get() = definedExternally
            set(value) = definedExternally
        var conclusionStatement: Statement?
            get() = definedExternally
            set(value) = definedExternally
        var dialogCodeHook: CodeHook?
            get() = definedExternally
            set(value) = definedExternally
        var fulfillmentActivity: FulfillmentActivity?
            get() = definedExternally
            set(value) = definedExternally
        var parentIntentSignature: BuiltinIntentSignature?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var checksum: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSlotTypeVersionRequest {
        var name: SlotTypeName
        var checksum: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSlotTypeVersionResponse {
        var name: SlotTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var enumerationValues: EnumerationValues?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var checksum: String?
            get() = definedExternally
            set(value) = definedExternally
        var valueSelectionStrategy: String /* "ORIGINAL_VALUE" | "TOP_RESOLUTION" | String */
        var parentSlotTypeSignature: CustomOrBuiltinSlotTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var slotTypeConfigurations: SlotTypeConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteBotAliasRequest {
        var name: AliasName
        var botName: BotName
    }
    interface DeleteBotChannelAssociationRequest {
        var name: BotChannelName
        var botName: BotName
        var botAlias: AliasName
    }
    interface DeleteBotRequest {
        var name: BotName
    }
    interface DeleteBotVersionRequest {
        var name: BotName
        var version: NumericalVersion
    }
    interface DeleteIntentRequest {
        var name: IntentName
    }
    interface DeleteIntentVersionRequest {
        var name: IntentName
        var version: NumericalVersion
    }
    interface DeleteSlotTypeRequest {
        var name: SlotTypeName
    }
    interface DeleteSlotTypeVersionRequest {
        var name: SlotTypeName
        var version: NumericalVersion
    }
    interface DeleteUtterancesRequest {
        var botName: BotName
        var userId: UserId
    }
    interface EnumerationValue {
        var value: Value
        var synonyms: SynonymList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FollowUpPrompt {
        var prompt: Prompt
        var rejectionStatement: Statement
    }
    interface FulfillmentActivity {
        var type: String /* "ReturnIntent" | "CodeHook" | String */
        var codeHook: CodeHook?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBotAliasRequest {
        var name: AliasName
        var botName: BotName
    }
    interface GetBotAliasResponse {
        var name: AliasName?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var botVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
        var botName: BotName?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var checksum: String?
            get() = definedExternally
            set(value) = definedExternally
        var conversationLogs: ConversationLogsResponse?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBotAliasesRequest {
        var botName: BotName
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nameContains: AliasName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBotAliasesResponse {
        var BotAliases: BotAliasMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBotChannelAssociationRequest {
        var name: BotChannelName
        var botName: BotName
        var botAlias: AliasName
    }
    interface GetBotChannelAssociationResponse {
        var name: BotChannelName?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var botAlias: AliasName?
            get() = definedExternally
            set(value) = definedExternally
        var botName: BotName?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "Facebook" | "Slack" | "Twilio-Sms" | "Kik" | String */
        var botConfiguration: ChannelConfigurationMap?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "IN_PROGRESS" | "CREATED" | "FAILED" | String */
        var failureReason: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBotChannelAssociationsRequest {
        var botName: BotName
        var botAlias: AliasNameOrListAll
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nameContains: BotChannelName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBotChannelAssociationsResponse {
        var botChannelAssociations: BotChannelAssociationList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBotRequest {
        var name: BotName
        var versionOrAlias: String
    }
    interface GetBotResponse {
        var name: BotName?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var intents: IntentList?
            get() = definedExternally
            set(value) = definedExternally
        var clarificationPrompt: Prompt?
            get() = definedExternally
            set(value) = definedExternally
        var abortStatement: Statement?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "BUILDING" | "READY" | "READY_BASIC_TESTING" | "FAILED" | "NOT_BUILT" | String */
        var failureReason: String?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var idleSessionTTLInSeconds: SessionTTL?
            get() = definedExternally
            set(value) = definedExternally
        var voiceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var checksum: String?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var locale: String /* "en-US" | "en-GB" | "de-DE" | String */
        var childDirected: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var detectSentiment: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBotVersionsRequest {
        var name: BotName
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBotVersionsResponse {
        var bots: BotMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBotsRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nameContains: BotName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBotsResponse {
        var bots: BotMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBuiltinIntentRequest {
        var signature: BuiltinIntentSignature
    }
    interface GetBuiltinIntentResponse {
        var signature: BuiltinIntentSignature?
            get() = definedExternally
            set(value) = definedExternally
        var supportedLocales: LocaleList?
            get() = definedExternally
            set(value) = definedExternally
        var slots: BuiltinIntentSlotList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBuiltinIntentsRequest {
        var locale: String /* "en-US" | "en-GB" | "de-DE" | String */
        var signatureContains: String?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBuiltinIntentsResponse {
        var intents: BuiltinIntentMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBuiltinSlotTypesRequest {
        var locale: String /* "en-US" | "en-GB" | "de-DE" | String */
        var signatureContains: String?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBuiltinSlotTypesResponse {
        var slotTypes: BuiltinSlotTypeMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetExportRequest {
        var name: Name
        var version: NumericalVersion
        var resourceType: String /* "BOT" | "INTENT" | "SLOT_TYPE" | String */
        var exportType: String /* "ALEXA_SKILLS_KIT" | "LEX" | String */
    }
    interface GetExportResponse {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var version: NumericalVersion?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "BOT" | "INTENT" | "SLOT_TYPE" | String */
        var exportType: String /* "ALEXA_SKILLS_KIT" | "LEX" | String */
        var exportStatus: String /* "IN_PROGRESS" | "READY" | "FAILED" | String */
        var failureReason: String?
            get() = definedExternally
            set(value) = definedExternally
        var url: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetImportRequest {
        var importId: String
    }
    interface GetImportResponse {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "BOT" | "INTENT" | "SLOT_TYPE" | String */
        var mergeStrategy: String /* "OVERWRITE_LATEST" | "FAIL_ON_CONFLICT" | String */
        var importId: String?
            get() = definedExternally
            set(value) = definedExternally
        var importStatus: String /* "IN_PROGRESS" | "COMPLETE" | "FAILED" | String */
        var failureReason: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIntentRequest {
        var name: IntentName
        var version: Version
    }
    interface GetIntentResponse {
        var name: IntentName?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var slots: SlotList?
            get() = definedExternally
            set(value) = definedExternally
        var sampleUtterances: IntentUtteranceList?
            get() = definedExternally
            set(value) = definedExternally
        var confirmationPrompt: Prompt?
            get() = definedExternally
            set(value) = definedExternally
        var rejectionStatement: Statement?
            get() = definedExternally
            set(value) = definedExternally
        var followUpPrompt: FollowUpPrompt?
            get() = definedExternally
            set(value) = definedExternally
        var conclusionStatement: Statement?
            get() = definedExternally
            set(value) = definedExternally
        var dialogCodeHook: CodeHook?
            get() = definedExternally
            set(value) = definedExternally
        var fulfillmentActivity: FulfillmentActivity?
            get() = definedExternally
            set(value) = definedExternally
        var parentIntentSignature: BuiltinIntentSignature?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var checksum: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIntentVersionsRequest {
        var name: IntentName
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIntentVersionsResponse {
        var intents: IntentMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIntentsRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nameContains: IntentName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIntentsResponse {
        var intents: IntentMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSlotTypeRequest {
        var name: SlotTypeName
        var version: Version
    }
    interface GetSlotTypeResponse {
        var name: SlotTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var enumerationValues: EnumerationValues?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var checksum: String?
            get() = definedExternally
            set(value) = definedExternally
        var valueSelectionStrategy: String /* "ORIGINAL_VALUE" | "TOP_RESOLUTION" | String */
        var parentSlotTypeSignature: CustomOrBuiltinSlotTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var slotTypeConfigurations: SlotTypeConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSlotTypeVersionsRequest {
        var name: SlotTypeName
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSlotTypeVersionsResponse {
        var slotTypes: SlotTypeMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSlotTypesRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nameContains: SlotTypeName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSlotTypesResponse {
        var slotTypes: SlotTypeMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetUtterancesViewRequest {
        var botName: BotName
        var botVersions: BotVersions
        var statusType: String /* "Detected" | "Missed" | String */
    }
    interface GetUtterancesViewResponse {
        var botName: BotName?
            get() = definedExternally
            set(value) = definedExternally
        var utterances: ListsOfUtterances?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Intent {
        var intentName: IntentName
        var intentVersion: Version
    }
    interface IntentMetadata {
        var name: IntentName?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var resourceArn: AmazonResourceName
    }
    interface ListTagsForResourceResponse {
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogSettingsRequest {
        var logType: String /* "AUDIO" | "TEXT" | String */
        var destination: String /* "CLOUDWATCH_LOGS" | "S3" | String */
        var kmsKeyArn: KmsKeyArn?
            get() = definedExternally
            set(value) = definedExternally
        var resourceArn: ResourceArn
    }
    interface LogSettingsResponse {
        var logType: String /* "AUDIO" | "TEXT" | String */
        var destination: String /* "CLOUDWATCH_LOGS" | "S3" | String */
        var kmsKeyArn: KmsKeyArn?
            get() = definedExternally
            set(value) = definedExternally
        var resourceArn: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
        var resourcePrefix: ResourcePrefix?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Message {
        var contentType: String /* "PlainText" | "SSML" | "CustomPayload" | String */
        var content: ContentString
        var groupNumber: GroupNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Prompt {
        var messages: MessageList
        var maxAttempts: PromptMaxAttempts
        var responseCard: ResponseCard?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutBotAliasRequest {
        var name: AliasName
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var botVersion: Version
        var botName: BotName
        var checksum: String?
            get() = definedExternally
            set(value) = definedExternally
        var conversationLogs: ConversationLogsRequest?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutBotAliasResponse {
        var name: AliasName?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var botVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
        var botName: BotName?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var checksum: String?
            get() = definedExternally
            set(value) = definedExternally
        var conversationLogs: ConversationLogsResponse?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutBotRequest {
        var name: BotName
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var intents: IntentList?
            get() = definedExternally
            set(value) = definedExternally
        var clarificationPrompt: Prompt?
            get() = definedExternally
            set(value) = definedExternally
        var abortStatement: Statement?
            get() = definedExternally
            set(value) = definedExternally
        var idleSessionTTLInSeconds: SessionTTL?
            get() = definedExternally
            set(value) = definedExternally
        var voiceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var checksum: String?
            get() = definedExternally
            set(value) = definedExternally
        var processBehavior: String /* "SAVE" | "BUILD" | String */
        var locale: String /* "en-US" | "en-GB" | "de-DE" | String */
        var childDirected: Boolean
        var detectSentiment: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var createVersion: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutBotResponse {
        var name: BotName?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var intents: IntentList?
            get() = definedExternally
            set(value) = definedExternally
        var clarificationPrompt: Prompt?
            get() = definedExternally
            set(value) = definedExternally
        var abortStatement: Statement?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "BUILDING" | "READY" | "READY_BASIC_TESTING" | "FAILED" | "NOT_BUILT" | String */
        var failureReason: String?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var idleSessionTTLInSeconds: SessionTTL?
            get() = definedExternally
            set(value) = definedExternally
        var voiceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var checksum: String?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var locale: String /* "en-US" | "en-GB" | "de-DE" | String */
        var childDirected: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var createVersion: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var detectSentiment: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutIntentRequest {
        var name: IntentName
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var slots: SlotList?
            get() = definedExternally
            set(value) = definedExternally
        var sampleUtterances: IntentUtteranceList?
            get() = definedExternally
            set(value) = definedExternally
        var confirmationPrompt: Prompt?
            get() = definedExternally
            set(value) = definedExternally
        var rejectionStatement: Statement?
            get() = definedExternally
            set(value) = definedExternally
        var followUpPrompt: FollowUpPrompt?
            get() = definedExternally
            set(value) = definedExternally
        var conclusionStatement: Statement?
            get() = definedExternally
            set(value) = definedExternally
        var dialogCodeHook: CodeHook?
            get() = definedExternally
            set(value) = definedExternally
        var fulfillmentActivity: FulfillmentActivity?
            get() = definedExternally
            set(value) = definedExternally
        var parentIntentSignature: BuiltinIntentSignature?
            get() = definedExternally
            set(value) = definedExternally
        var checksum: String?
            get() = definedExternally
            set(value) = definedExternally
        var createVersion: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutIntentResponse {
        var name: IntentName?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var slots: SlotList?
            get() = definedExternally
            set(value) = definedExternally
        var sampleUtterances: IntentUtteranceList?
            get() = definedExternally
            set(value) = definedExternally
        var confirmationPrompt: Prompt?
            get() = definedExternally
            set(value) = definedExternally
        var rejectionStatement: Statement?
            get() = definedExternally
            set(value) = definedExternally
        var followUpPrompt: FollowUpPrompt?
            get() = definedExternally
            set(value) = definedExternally
        var conclusionStatement: Statement?
            get() = definedExternally
            set(value) = definedExternally
        var dialogCodeHook: CodeHook?
            get() = definedExternally
            set(value) = definedExternally
        var fulfillmentActivity: FulfillmentActivity?
            get() = definedExternally
            set(value) = definedExternally
        var parentIntentSignature: BuiltinIntentSignature?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var checksum: String?
            get() = definedExternally
            set(value) = definedExternally
        var createVersion: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutSlotTypeRequest {
        var name: SlotTypeName
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var enumerationValues: EnumerationValues?
            get() = definedExternally
            set(value) = definedExternally
        var checksum: String?
            get() = definedExternally
            set(value) = definedExternally
        var valueSelectionStrategy: String /* "ORIGINAL_VALUE" | "TOP_RESOLUTION" | String */
        var createVersion: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var parentSlotTypeSignature: CustomOrBuiltinSlotTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var slotTypeConfigurations: SlotTypeConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutSlotTypeResponse {
        var name: SlotTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var enumerationValues: EnumerationValues?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var checksum: String?
            get() = definedExternally
            set(value) = definedExternally
        var valueSelectionStrategy: String /* "ORIGINAL_VALUE" | "TOP_RESOLUTION" | String */
        var createVersion: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var parentSlotTypeSignature: CustomOrBuiltinSlotTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var slotTypeConfigurations: SlotTypeConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Slot {
        var name: SlotName
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var slotConstraint: String /* "Required" | "Optional" | String */
        var slotType: CustomOrBuiltinSlotTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var slotTypeVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
        var valueElicitationPrompt: Prompt?
            get() = definedExternally
            set(value) = definedExternally
        var priority: Priority?
            get() = definedExternally
            set(value) = definedExternally
        var sampleUtterances: SlotUtteranceList?
            get() = definedExternally
            set(value) = definedExternally
        var responseCard: ResponseCard?
            get() = definedExternally
            set(value) = definedExternally
        var obfuscationSetting: String /* "NONE" | "DEFAULT_OBFUSCATION" | String */
    }
    interface SlotTypeConfiguration {
        var regexConfiguration: SlotTypeRegexConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SlotTypeMetadata {
        var name: SlotTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SlotTypeRegexConfiguration {
        var pattern: RegexPattern
    }
    interface StartImportRequest {
        var payload: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "BOT" | "INTENT" | "SLOT_TYPE" | String */
        var mergeStrategy: String /* "OVERWRITE_LATEST" | "FAIL_ON_CONFLICT" | String */
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartImportResponse {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "BOT" | "INTENT" | "SLOT_TYPE" | String */
        var mergeStrategy: String /* "OVERWRITE_LATEST" | "FAIL_ON_CONFLICT" | String */
        var importId: String?
            get() = definedExternally
            set(value) = definedExternally
        var importStatus: String /* "IN_PROGRESS" | "COMPLETE" | "FAILED" | String */
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var createdDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Statement {
        var messages: MessageList
        var responseCard: ResponseCard?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var key: TagKey
        var value: TagValue
    }
    interface TagResourceRequest {
        var resourceArn: AmazonResourceName
        var tags: TagList
    }
    interface TagResourceResponse
    interface UntagResourceRequest {
        var resourceArn: AmazonResourceName
        var tagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UtteranceData {
        var utteranceString: UtteranceString?
            get() = definedExternally
            set(value) = definedExternally
        var count: Count?
            get() = definedExternally
            set(value) = definedExternally
        var distinctUsers: Count?
            get() = definedExternally
            set(value) = definedExternally
        var firstUtteredDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastUtteredDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UtteranceList {
        var botVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
        var utterances: ListOfUtterance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-04-19" | "latest" | String */
    }
}