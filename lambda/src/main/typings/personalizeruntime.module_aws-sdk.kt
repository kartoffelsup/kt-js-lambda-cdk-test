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
import PersonalizeRuntime.PredictedItem
import PersonalizeRuntime.GetPersonalizedRankingRequest
import PersonalizeRuntime.GetPersonalizedRankingResponse
import PersonalizeRuntime.GetRecommendationsRequest
import PersonalizeRuntime.GetRecommendationsResponse
import PersonalizeRuntime.Context

typealias Arn = String

typealias AttributeName = String

typealias AttributeValue = String

typealias InputList = Array<ItemID>

typealias ItemID = String

typealias ItemList = Array<PredictedItem>

typealias NumResults = Number

typealias UserID = String

@JsModule("aws-sdk")
external open class PersonalizeRuntime(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & PersonalizeRuntime.Types.ClientConfiguration */
    open fun getPersonalizedRanking(params: GetPersonalizedRankingRequest, callback: (err: AWSError, data: GetPersonalizedRankingResponse) -> Unit = definedExternally): Request<GetPersonalizedRankingResponse, AWSError>
    open fun getPersonalizedRanking(callback: (err: AWSError, data: GetPersonalizedRankingResponse) -> Unit = definedExternally): Request<GetPersonalizedRankingResponse, AWSError>
    open fun getRecommendations(params: GetRecommendationsRequest, callback: (err: AWSError, data: GetRecommendationsResponse) -> Unit = definedExternally): Request<GetRecommendationsResponse, AWSError>
    open fun getRecommendations(callback: (err: AWSError, data: GetRecommendationsResponse) -> Unit = definedExternally): Request<GetRecommendationsResponse, AWSError>
    interface Context {
        @nativeGetter
        operator fun get(key: String): AttributeValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeValue)
    }
    interface GetPersonalizedRankingRequest {
        var campaignArn: Arn
        var inputList: InputList
        var userId: UserID
        var context: Context?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPersonalizedRankingResponse {
        var personalizedRanking: ItemList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRecommendationsRequest {
        var campaignArn: Arn
        var itemId: ItemID?
            get() = definedExternally
            set(value) = definedExternally
        var userId: UserID?
            get() = definedExternally
            set(value) = definedExternally
        var numResults: NumResults?
            get() = definedExternally
            set(value) = definedExternally
        var context: Context?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRecommendationsResponse {
        var itemList: ItemList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PredictedItem {
        var itemId: ItemID?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-05-22" | "latest" | String */
    }
}