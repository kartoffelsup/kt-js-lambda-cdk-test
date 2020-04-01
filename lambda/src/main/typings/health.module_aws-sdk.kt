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
import Health.OrganizationAffectedEntitiesErrorItem
import Health.EventDetailsErrorItem
import Health.OrganizationEventDetailsErrorItem
import Health.OrganizationEventDetails
import Health.EventDetails
import Health.EntityAggregate
import Health.AffectedEntity
import Health.EventAggregate
import Health.Event
import Health.EventType
import Health.EventAccountFilter
import Health.OrganizationEvent
import Health.DateTimeRange
import Health.tagSet
import Health.DescribeAffectedAccountsForOrganizationRequest
import Health.DescribeAffectedAccountsForOrganizationResponse
import Health.DescribeAffectedEntitiesRequest
import Health.DescribeAffectedEntitiesResponse
import Health.DescribeAffectedEntitiesForOrganizationRequest
import Health.DescribeAffectedEntitiesForOrganizationResponse
import Health.DescribeEntityAggregatesRequest
import Health.DescribeEntityAggregatesResponse
import Health.DescribeEventAggregatesRequest
import Health.DescribeEventAggregatesResponse
import Health.DescribeEventDetailsRequest
import Health.DescribeEventDetailsResponse
import Health.DescribeEventDetailsForOrganizationRequest
import Health.DescribeEventDetailsForOrganizationResponse
import Health.DescribeEventTypesRequest
import Health.DescribeEventTypesResponse
import Health.DescribeEventsRequest
import Health.DescribeEventsResponse
import Health.DescribeEventsForOrganizationRequest
import Health.DescribeEventsForOrganizationResponse
import Health.DescribeHealthServiceStatusForOrganizationResponse
import Health.EntityFilter
import Health.EventFilter
import Health.EventTypeFilter
import Health.OrganizationEventFilter
import Health.EventDescription
import Health.eventMetadata

typealias DescribeAffectedEntitiesForOrganizationFailedSet = Array<OrganizationAffectedEntitiesErrorItem>

typealias DescribeEventDetailsFailedSet = Array<EventDetailsErrorItem>

typealias DescribeEventDetailsForOrganizationFailedSet = Array<OrganizationEventDetailsErrorItem>

typealias DescribeEventDetailsForOrganizationSuccessfulSet = Array<OrganizationEventDetails>

typealias DescribeEventDetailsSuccessfulSet = Array<EventDetails>

typealias EntityAggregateList = Array<EntityAggregate>

typealias EntityList = Array<AffectedEntity>

typealias EventAggregateList = Array<EventAggregate>

typealias EventArnsList = Array<eventArn>

typealias EventList = Array<Event>

typealias EventTypeCategoryList = Array<String /* "issue" | "accountNotification" | "scheduledChange" | "investigation" | String */>

typealias EventTypeCodeList = Array<eventTypeCode>

typealias EventTypeList = Array<EventType>

typealias OrganizationEntityFiltersList = Array<EventAccountFilter>

typealias OrganizationEventDetailFiltersList = Array<EventAccountFilter>

typealias OrganizationEventList = Array<OrganizationEvent>

typealias accountId = String

typealias affectedAccountsList = Array<accountId>

typealias aggregateValue = String

typealias availabilityZone = String

typealias availabilityZones = Array<availabilityZone>

typealias awsAccountIdsList = Array<accountId>

typealias count = Number

typealias dateTimeRangeList = Array<DateTimeRange>

typealias entityArn = String

typealias entityArnList = Array<entityArn>

typealias entityStatusCodeList = Array<String /* "IMPAIRED" | "UNIMPAIRED" | "UNKNOWN" | String */>

typealias entityUrl = String

typealias entityValue = String

typealias entityValueList = Array<entityValue>

typealias eventArn = String

typealias eventArnList = Array<eventArn>

typealias eventDescription = String

typealias eventStatusCodeList = Array<String /* "open" | "closed" | "upcoming" | String */>

typealias eventType = String

typealias eventTypeCategoryList = Array<String /* "issue" | "accountNotification" | "scheduledChange" | "investigation" | String */>

typealias eventTypeCode = String

typealias eventTypeList = Array<eventType>

typealias healthServiceAccessStatusForOrganization = String

typealias locale = String

typealias maxResults = Number

typealias metadataKey = String

typealias metadataValue = String

typealias nextToken = String

typealias region = String

typealias regionList = Array<region>

typealias service = String

typealias serviceList = Array<service>

typealias tagFilter = Array<tagSet>

typealias tagKey = String

typealias tagValue = String

typealias timestamp = Date

@JsModule("aws-sdk")
external open class Health(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Health.Types.ClientConfiguration */
    open fun describeAffectedAccountsForOrganization(params: DescribeAffectedAccountsForOrganizationRequest, callback: (err: AWSError, data: DescribeAffectedAccountsForOrganizationResponse) -> Unit = definedExternally): Request<DescribeAffectedAccountsForOrganizationResponse, AWSError>
    open fun describeAffectedAccountsForOrganization(callback: (err: AWSError, data: DescribeAffectedAccountsForOrganizationResponse) -> Unit = definedExternally): Request<DescribeAffectedAccountsForOrganizationResponse, AWSError>
    open fun describeAffectedEntities(params: DescribeAffectedEntitiesRequest, callback: (err: AWSError, data: DescribeAffectedEntitiesResponse) -> Unit = definedExternally): Request<DescribeAffectedEntitiesResponse, AWSError>
    open fun describeAffectedEntities(callback: (err: AWSError, data: DescribeAffectedEntitiesResponse) -> Unit = definedExternally): Request<DescribeAffectedEntitiesResponse, AWSError>
    open fun describeAffectedEntitiesForOrganization(params: DescribeAffectedEntitiesForOrganizationRequest, callback: (err: AWSError, data: DescribeAffectedEntitiesForOrganizationResponse) -> Unit = definedExternally): Request<DescribeAffectedEntitiesForOrganizationResponse, AWSError>
    open fun describeAffectedEntitiesForOrganization(callback: (err: AWSError, data: DescribeAffectedEntitiesForOrganizationResponse) -> Unit = definedExternally): Request<DescribeAffectedEntitiesForOrganizationResponse, AWSError>
    open fun describeEntityAggregates(params: DescribeEntityAggregatesRequest, callback: (err: AWSError, data: DescribeEntityAggregatesResponse) -> Unit = definedExternally): Request<DescribeEntityAggregatesResponse, AWSError>
    open fun describeEntityAggregates(callback: (err: AWSError, data: DescribeEntityAggregatesResponse) -> Unit = definedExternally): Request<DescribeEntityAggregatesResponse, AWSError>
    open fun describeEventAggregates(params: DescribeEventAggregatesRequest, callback: (err: AWSError, data: DescribeEventAggregatesResponse) -> Unit = definedExternally): Request<DescribeEventAggregatesResponse, AWSError>
    open fun describeEventAggregates(callback: (err: AWSError, data: DescribeEventAggregatesResponse) -> Unit = definedExternally): Request<DescribeEventAggregatesResponse, AWSError>
    open fun describeEventDetails(params: DescribeEventDetailsRequest, callback: (err: AWSError, data: DescribeEventDetailsResponse) -> Unit = definedExternally): Request<DescribeEventDetailsResponse, AWSError>
    open fun describeEventDetails(callback: (err: AWSError, data: DescribeEventDetailsResponse) -> Unit = definedExternally): Request<DescribeEventDetailsResponse, AWSError>
    open fun describeEventDetailsForOrganization(params: DescribeEventDetailsForOrganizationRequest, callback: (err: AWSError, data: DescribeEventDetailsForOrganizationResponse) -> Unit = definedExternally): Request<DescribeEventDetailsForOrganizationResponse, AWSError>
    open fun describeEventDetailsForOrganization(callback: (err: AWSError, data: DescribeEventDetailsForOrganizationResponse) -> Unit = definedExternally): Request<DescribeEventDetailsForOrganizationResponse, AWSError>
    open fun describeEventTypes(params: DescribeEventTypesRequest, callback: (err: AWSError, data: DescribeEventTypesResponse) -> Unit = definedExternally): Request<DescribeEventTypesResponse, AWSError>
    open fun describeEventTypes(callback: (err: AWSError, data: DescribeEventTypesResponse) -> Unit = definedExternally): Request<DescribeEventTypesResponse, AWSError>
    open fun describeEvents(params: DescribeEventsRequest, callback: (err: AWSError, data: DescribeEventsResponse) -> Unit = definedExternally): Request<DescribeEventsResponse, AWSError>
    open fun describeEvents(callback: (err: AWSError, data: DescribeEventsResponse) -> Unit = definedExternally): Request<DescribeEventsResponse, AWSError>
    open fun describeEventsForOrganization(params: DescribeEventsForOrganizationRequest, callback: (err: AWSError, data: DescribeEventsForOrganizationResponse) -> Unit = definedExternally): Request<DescribeEventsForOrganizationResponse, AWSError>
    open fun describeEventsForOrganization(callback: (err: AWSError, data: DescribeEventsForOrganizationResponse) -> Unit = definedExternally): Request<DescribeEventsForOrganizationResponse, AWSError>
    open fun describeHealthServiceStatusForOrganization(callback: (err: AWSError, data: DescribeHealthServiceStatusForOrganizationResponse) -> Unit = definedExternally): Request<DescribeHealthServiceStatusForOrganizationResponse, AWSError>
    open fun disableHealthServiceAccessForOrganization(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun enableHealthServiceAccessForOrganization(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    interface AffectedEntity {
        var entityArn: entityArn?
            get() = definedExternally
            set(value) = definedExternally
        var eventArn: eventArn?
            get() = definedExternally
            set(value) = definedExternally
        var entityValue: entityValue?
            get() = definedExternally
            set(value) = definedExternally
        var entityUrl: entityUrl?
            get() = definedExternally
            set(value) = definedExternally
        var awsAccountId: accountId?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedTime: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var statusCode: String /* "IMPAIRED" | "UNIMPAIRED" | "UNKNOWN" | String */
        var tags: tagSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DateTimeRange {
        var from: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var to: timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAffectedAccountsForOrganizationRequest {
        var eventArn: eventArn
        var nextToken: nextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: maxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAffectedAccountsForOrganizationResponse {
        var affectedAccounts: affectedAccountsList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: nextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAffectedEntitiesForOrganizationRequest {
        var organizationEntityFilters: OrganizationEntityFiltersList
        var locale: locale?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: nextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: maxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAffectedEntitiesForOrganizationResponse {
        var entities: EntityList?
            get() = definedExternally
            set(value) = definedExternally
        var failedSet: DescribeAffectedEntitiesForOrganizationFailedSet?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: nextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAffectedEntitiesRequest {
        var filter: EntityFilter
        var locale: locale?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: nextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: maxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAffectedEntitiesResponse {
        var entities: EntityList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: nextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEntityAggregatesRequest {
        var eventArns: EventArnsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEntityAggregatesResponse {
        var entityAggregates: EntityAggregateList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventAggregatesRequest {
        var filter: EventFilter?
            get() = definedExternally
            set(value) = definedExternally
        var aggregateField: String /* "eventTypeCategory" | String */
        var maxResults: maxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: nextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventAggregatesResponse {
        var eventAggregates: EventAggregateList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: nextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventDetailsForOrganizationRequest {
        var organizationEventDetailFilters: OrganizationEventDetailFiltersList
        var locale: locale?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventDetailsForOrganizationResponse {
        var successfulSet: DescribeEventDetailsForOrganizationSuccessfulSet?
            get() = definedExternally
            set(value) = definedExternally
        var failedSet: DescribeEventDetailsForOrganizationFailedSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventDetailsRequest {
        var eventArns: eventArnList
        var locale: locale?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventDetailsResponse {
        var successfulSet: DescribeEventDetailsSuccessfulSet?
            get() = definedExternally
            set(value) = definedExternally
        var failedSet: DescribeEventDetailsFailedSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventTypesRequest {
        var filter: EventTypeFilter?
            get() = definedExternally
            set(value) = definedExternally
        var locale: locale?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: nextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: maxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventTypesResponse {
        var eventTypes: EventTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: nextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventsForOrganizationRequest {
        var filter: OrganizationEventFilter?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: nextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: maxResults?
            get() = definedExternally
            set(value) = definedExternally
        var locale: locale?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventsForOrganizationResponse {
        var events: OrganizationEventList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: nextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventsRequest {
        var filter: EventFilter?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: nextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: maxResults?
            get() = definedExternally
            set(value) = definedExternally
        var locale: locale?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventsResponse {
        var events: EventList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: nextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeHealthServiceStatusForOrganizationResponse {
        var healthServiceAccessStatusForOrganization: healthServiceAccessStatusForOrganization?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EntityAggregate {
        var eventArn: eventArn?
            get() = definedExternally
            set(value) = definedExternally
        var count: count?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EntityFilter {
        var eventArns: eventArnList
        var entityArns: entityArnList?
            get() = definedExternally
            set(value) = definedExternally
        var entityValues: entityValueList?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedTimes: dateTimeRangeList?
            get() = definedExternally
            set(value) = definedExternally
        var tags: tagFilter?
            get() = definedExternally
            set(value) = definedExternally
        var statusCodes: entityStatusCodeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Event {
        var arn: eventArn?
            get() = definedExternally
            set(value) = definedExternally
        var service: service?
            get() = definedExternally
            set(value) = definedExternally
        var eventTypeCode: eventTypeCode?
            get() = definedExternally
            set(value) = definedExternally
        var eventTypeCategory: String /* "issue" | "accountNotification" | "scheduledChange" | "investigation" | String */
        var region: region?
            get() = definedExternally
            set(value) = definedExternally
        var availabilityZone: availabilityZone?
            get() = definedExternally
            set(value) = definedExternally
        var startTime: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var endTime: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedTime: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var statusCode: String /* "open" | "closed" | "upcoming" | String */
    }
    interface EventAccountFilter {
        var eventArn: eventArn
        var awsAccountId: accountId
    }
    interface EventAggregate {
        var aggregateValue: aggregateValue?
            get() = definedExternally
            set(value) = definedExternally
        var count: count?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventDescription {
        var latestDescription: eventDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventDetails {
        var event: Event?
            get() = definedExternally
            set(value) = definedExternally
        var eventDescription: EventDescription?
            get() = definedExternally
            set(value) = definedExternally
        var eventMetadata: eventMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventDetailsErrorItem {
        var eventArn: eventArn?
            get() = definedExternally
            set(value) = definedExternally
        var errorName: String?
            get() = definedExternally
            set(value) = definedExternally
        var errorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventFilter {
        var eventArns: eventArnList?
            get() = definedExternally
            set(value) = definedExternally
        var eventTypeCodes: eventTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var services: serviceList?
            get() = definedExternally
            set(value) = definedExternally
        var regions: regionList?
            get() = definedExternally
            set(value) = definedExternally
        var availabilityZones: availabilityZones?
            get() = definedExternally
            set(value) = definedExternally
        var startTimes: dateTimeRangeList?
            get() = definedExternally
            set(value) = definedExternally
        var endTimes: dateTimeRangeList?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedTimes: dateTimeRangeList?
            get() = definedExternally
            set(value) = definedExternally
        var entityArns: entityArnList?
            get() = definedExternally
            set(value) = definedExternally
        var entityValues: entityValueList?
            get() = definedExternally
            set(value) = definedExternally
        var eventTypeCategories: eventTypeCategoryList?
            get() = definedExternally
            set(value) = definedExternally
        var tags: tagFilter?
            get() = definedExternally
            set(value) = definedExternally
        var eventStatusCodes: eventStatusCodeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventType {
        var service: service?
            get() = definedExternally
            set(value) = definedExternally
        var code: eventTypeCode?
            get() = definedExternally
            set(value) = definedExternally
        var category: String /* "issue" | "accountNotification" | "scheduledChange" | "investigation" | String */
    }
    interface EventTypeFilter {
        var eventTypeCodes: EventTypeCodeList?
            get() = definedExternally
            set(value) = definedExternally
        var services: serviceList?
            get() = definedExternally
            set(value) = definedExternally
        var eventTypeCategories: EventTypeCategoryList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrganizationAffectedEntitiesErrorItem {
        var awsAccountId: accountId?
            get() = definedExternally
            set(value) = definedExternally
        var eventArn: eventArn?
            get() = definedExternally
            set(value) = definedExternally
        var errorName: String?
            get() = definedExternally
            set(value) = definedExternally
        var errorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrganizationEvent {
        var arn: eventArn?
            get() = definedExternally
            set(value) = definedExternally
        var service: service?
            get() = definedExternally
            set(value) = definedExternally
        var eventTypeCode: eventTypeCode?
            get() = definedExternally
            set(value) = definedExternally
        var eventTypeCategory: String /* "issue" | "accountNotification" | "scheduledChange" | "investigation" | String */
        var region: region?
            get() = definedExternally
            set(value) = definedExternally
        var startTime: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var endTime: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedTime: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var statusCode: String /* "open" | "closed" | "upcoming" | String */
    }
    interface OrganizationEventDetails {
        var awsAccountId: accountId?
            get() = definedExternally
            set(value) = definedExternally
        var event: Event?
            get() = definedExternally
            set(value) = definedExternally
        var eventDescription: EventDescription?
            get() = definedExternally
            set(value) = definedExternally
        var eventMetadata: eventMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrganizationEventDetailsErrorItem {
        var awsAccountId: accountId?
            get() = definedExternally
            set(value) = definedExternally
        var eventArn: eventArn?
            get() = definedExternally
            set(value) = definedExternally
        var errorName: String?
            get() = definedExternally
            set(value) = definedExternally
        var errorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrganizationEventFilter {
        var eventTypeCodes: eventTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var awsAccountIds: awsAccountIdsList?
            get() = definedExternally
            set(value) = definedExternally
        var services: serviceList?
            get() = definedExternally
            set(value) = definedExternally
        var regions: regionList?
            get() = definedExternally
            set(value) = definedExternally
        var startTime: DateTimeRange?
            get() = definedExternally
            set(value) = definedExternally
        var endTime: DateTimeRange?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedTime: DateTimeRange?
            get() = definedExternally
            set(value) = definedExternally
        var entityArns: entityArnList?
            get() = definedExternally
            set(value) = definedExternally
        var entityValues: entityValueList?
            get() = definedExternally
            set(value) = definedExternally
        var eventTypeCategories: eventTypeCategoryList?
            get() = definedExternally
            set(value) = definedExternally
        var eventStatusCodes: eventStatusCodeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface eventMetadata {
        @nativeGetter
        operator fun get(key: String): metadataValue?
        @nativeSetter
        operator fun set(key: String, value: metadataValue)
    }
    interface tagSet {
        @nativeGetter
        operator fun get(key: String): tagValue?
        @nativeSetter
        operator fun set(key: String, value: tagValue)
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2016-08-04" | "latest" | String */
    }
}