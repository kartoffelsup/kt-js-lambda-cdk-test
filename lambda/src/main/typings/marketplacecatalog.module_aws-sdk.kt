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
import MarketplaceCatalog.ChangeSummary
import MarketplaceCatalog.ChangeSetSummaryListItem
import MarketplaceCatalog.EntitySummary
import MarketplaceCatalog.ErrorDetail
import MarketplaceCatalog.Filter
import MarketplaceCatalog.Change
import MarketplaceCatalog.CancelChangeSetRequest
import MarketplaceCatalog.CancelChangeSetResponse
import MarketplaceCatalog.DescribeChangeSetRequest
import MarketplaceCatalog.DescribeChangeSetResponse
import MarketplaceCatalog.DescribeEntityRequest
import MarketplaceCatalog.DescribeEntityResponse
import MarketplaceCatalog.ListChangeSetsRequest
import MarketplaceCatalog.ListChangeSetsResponse
import MarketplaceCatalog.ListEntitiesRequest
import MarketplaceCatalog.ListEntitiesResponse
import MarketplaceCatalog.StartChangeSetRequest
import MarketplaceCatalog.StartChangeSetResponse
import MarketplaceCatalog.Entity
import MarketplaceCatalog.Sort

typealias ARN = String

typealias Catalog = String

typealias ChangeSetDescription = Array<ChangeSummary>

typealias ChangeSetName = String

typealias ChangeSetSummaryList = Array<ChangeSetSummaryListItem>

typealias ChangeType = String

typealias ClientRequestToken = String

typealias DateTimeISO8601 = String

typealias EntitySummaryList = Array<EntitySummary>

typealias EntityType = String

typealias ErrorDetailList = Array<ErrorDetail>

typealias FilterList = Array<Filter>

typealias FilterName = String

typealias Identifier = String

typealias Json = String

typealias MaxResultInteger = Number

typealias NextToken = String

typealias RequestedChangeList = Array<Change>

typealias ResourceId = String

typealias ResourceIdList = Array<ResourceId>

typealias SortBy = String

typealias StringValue = String

typealias ValueList = Array<StringValue>

@JsModule("aws-sdk")
external open class MarketplaceCatalog(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & MarketplaceCatalog.Types.ClientConfiguration */
    open fun cancelChangeSet(params: CancelChangeSetRequest, callback: (err: AWSError, data: CancelChangeSetResponse) -> Unit = definedExternally): Request<CancelChangeSetResponse, AWSError>
    open fun cancelChangeSet(callback: (err: AWSError, data: CancelChangeSetResponse) -> Unit = definedExternally): Request<CancelChangeSetResponse, AWSError>
    open fun describeChangeSet(params: DescribeChangeSetRequest, callback: (err: AWSError, data: DescribeChangeSetResponse) -> Unit = definedExternally): Request<DescribeChangeSetResponse, AWSError>
    open fun describeChangeSet(callback: (err: AWSError, data: DescribeChangeSetResponse) -> Unit = definedExternally): Request<DescribeChangeSetResponse, AWSError>
    open fun describeEntity(params: DescribeEntityRequest, callback: (err: AWSError, data: DescribeEntityResponse) -> Unit = definedExternally): Request<DescribeEntityResponse, AWSError>
    open fun describeEntity(callback: (err: AWSError, data: DescribeEntityResponse) -> Unit = definedExternally): Request<DescribeEntityResponse, AWSError>
    open fun listChangeSets(params: ListChangeSetsRequest, callback: (err: AWSError, data: ListChangeSetsResponse) -> Unit = definedExternally): Request<ListChangeSetsResponse, AWSError>
    open fun listChangeSets(callback: (err: AWSError, data: ListChangeSetsResponse) -> Unit = definedExternally): Request<ListChangeSetsResponse, AWSError>
    open fun listEntities(params: ListEntitiesRequest, callback: (err: AWSError, data: ListEntitiesResponse) -> Unit = definedExternally): Request<ListEntitiesResponse, AWSError>
    open fun listEntities(callback: (err: AWSError, data: ListEntitiesResponse) -> Unit = definedExternally): Request<ListEntitiesResponse, AWSError>
    open fun startChangeSet(params: StartChangeSetRequest, callback: (err: AWSError, data: StartChangeSetResponse) -> Unit = definedExternally): Request<StartChangeSetResponse, AWSError>
    open fun startChangeSet(callback: (err: AWSError, data: StartChangeSetResponse) -> Unit = definedExternally): Request<StartChangeSetResponse, AWSError>
    interface CancelChangeSetRequest {
        var Catalog: Catalog
        var ChangeSetId: ResourceId
    }
    interface CancelChangeSetResponse {
        var ChangeSetId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeSetArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Change {
        var ChangeType: ChangeType
        var Entity: Entity
        var Details: Json
    }
    interface ChangeSetSummaryListItem {
        var ChangeSetId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeSetArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeSetName: ChangeSetName?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: DateTimeISO8601?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: DateTimeISO8601?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PREPARING" | "APPLYING" | "SUCCEEDED" | "CANCELLED" | "FAILED" | String */
        var EntityIdList: ResourceIdList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChangeSummary {
        var ChangeType: ChangeType?
            get() = definedExternally
            set(value) = definedExternally
        var Entity: Entity?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorDetailList: ErrorDetailList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeChangeSetRequest {
        var Catalog: Catalog
        var ChangeSetId: ResourceId
    }
    interface DescribeChangeSetResponse {
        var ChangeSetId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeSetArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeSetName: ChangeSetName?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: DateTimeISO8601?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: DateTimeISO8601?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PREPARING" | "APPLYING" | "SUCCEEDED" | "CANCELLED" | "FAILED" | String */
        var FailureDescription: StringValue?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeSet: ChangeSetDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEntityRequest {
        var Catalog: Catalog
        var EntityId: ResourceId
    }
    interface DescribeEntityResponse {
        var EntityType: EntityType?
            get() = definedExternally
            set(value) = definedExternally
        var EntityIdentifier: Identifier?
            get() = definedExternally
            set(value) = definedExternally
        var EntityArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: StringValue?
            get() = definedExternally
            set(value) = definedExternally
        var Details: Json?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Entity {
        var Type: EntityType
        var Identifier: Identifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EntitySummary {
        var Name: StringValue?
            get() = definedExternally
            set(value) = definedExternally
        var EntityType: EntityType?
            get() = definedExternally
            set(value) = definedExternally
        var EntityId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var EntityArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: StringValue?
            get() = definedExternally
            set(value) = definedExternally
        var Visibility: StringValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ErrorDetail {
        var ErrorCode: StringValue?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: StringValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Filter {
        var Name: FilterName?
            get() = definedExternally
            set(value) = definedExternally
        var ValueList: ValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListChangeSetsRequest {
        var Catalog: Catalog
        var FilterList: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Sort: Sort?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListChangeSetsResponse {
        var ChangeSetSummaryList: ChangeSetSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEntitiesRequest {
        var Catalog: Catalog
        var EntityType: EntityType
        var FilterList: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Sort: Sort?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEntitiesResponse {
        var EntitySummaryList: EntitySummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Sort {
        var SortBy: SortBy?
            get() = definedExternally
            set(value) = definedExternally
        var SortOrder: String /* "ASCENDING" | "DESCENDING" | String */
    }
    interface StartChangeSetRequest {
        var Catalog: Catalog
        var ChangeSet: RequestedChangeList
        var ChangeSetName: ChangeSetName?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartChangeSetResponse {
        var ChangeSetId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeSetArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-09-17" | "latest" | String */
    }
}