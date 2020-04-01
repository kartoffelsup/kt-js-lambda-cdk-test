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
import Outposts.InstanceTypeItem
import Outposts.Outpost
import Outposts.Site
import Outposts.CreateOutpostInput
import Outposts.CreateOutpostOutput
import Outposts.DeleteOutpostInput
import Outposts.DeleteOutpostOutput
import Outposts.DeleteSiteInput
import Outposts.DeleteSiteOutput
import Outposts.GetOutpostInput
import Outposts.GetOutpostOutput
import Outposts.GetOutpostInstanceTypesInput
import Outposts.GetOutpostInstanceTypesOutput
import Outposts.ListOutpostsInput
import Outposts.ListOutpostsOutput
import Outposts.ListSitesInput
import Outposts.ListSitesOutput

typealias AccountId = String

typealias AvailabilityZone = String

typealias AvailabilityZoneId = String

typealias InstanceType = String

typealias InstanceTypeListDefinition = Array<InstanceTypeItem>

typealias LifeCycleStatus = String

typealias MaxResults1000 = Number

typealias OutpostArn = String

typealias OutpostDescription = String

typealias OutpostId = String

typealias OutpostName = String

typealias OwnerId = String

typealias SiteDescription = String

typealias SiteId = String

typealias SiteName = String

typealias Token = String

typealias outpostListDefinition = Array<Outpost>

typealias siteListDefinition = Array<Site>

@JsModule("aws-sdk")
external open class Outposts(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Outposts.Types.ClientConfiguration */
    open fun createOutpost(params: CreateOutpostInput, callback: (err: AWSError, data: CreateOutpostOutput) -> Unit = definedExternally): Request<CreateOutpostOutput, AWSError>
    open fun createOutpost(callback: (err: AWSError, data: CreateOutpostOutput) -> Unit = definedExternally): Request<CreateOutpostOutput, AWSError>
    open fun deleteOutpost(params: DeleteOutpostInput, callback: (err: AWSError, data: DeleteOutpostOutput) -> Unit = definedExternally): Request<DeleteOutpostOutput, AWSError>
    open fun deleteOutpost(callback: (err: AWSError, data: DeleteOutpostOutput) -> Unit = definedExternally): Request<DeleteOutpostOutput, AWSError>
    open fun deleteSite(params: DeleteSiteInput, callback: (err: AWSError, data: DeleteSiteOutput) -> Unit = definedExternally): Request<DeleteSiteOutput, AWSError>
    open fun deleteSite(callback: (err: AWSError, data: DeleteSiteOutput) -> Unit = definedExternally): Request<DeleteSiteOutput, AWSError>
    open fun getOutpost(params: GetOutpostInput, callback: (err: AWSError, data: GetOutpostOutput) -> Unit = definedExternally): Request<GetOutpostOutput, AWSError>
    open fun getOutpost(callback: (err: AWSError, data: GetOutpostOutput) -> Unit = definedExternally): Request<GetOutpostOutput, AWSError>
    open fun getOutpostInstanceTypes(params: GetOutpostInstanceTypesInput, callback: (err: AWSError, data: GetOutpostInstanceTypesOutput) -> Unit = definedExternally): Request<GetOutpostInstanceTypesOutput, AWSError>
    open fun getOutpostInstanceTypes(callback: (err: AWSError, data: GetOutpostInstanceTypesOutput) -> Unit = definedExternally): Request<GetOutpostInstanceTypesOutput, AWSError>
    open fun listOutposts(params: ListOutpostsInput, callback: (err: AWSError, data: ListOutpostsOutput) -> Unit = definedExternally): Request<ListOutpostsOutput, AWSError>
    open fun listOutposts(callback: (err: AWSError, data: ListOutpostsOutput) -> Unit = definedExternally): Request<ListOutpostsOutput, AWSError>
    open fun listSites(params: ListSitesInput, callback: (err: AWSError, data: ListSitesOutput) -> Unit = definedExternally): Request<ListSitesOutput, AWSError>
    open fun listSites(callback: (err: AWSError, data: ListSitesOutput) -> Unit = definedExternally): Request<ListSitesOutput, AWSError>
    interface CreateOutpostInput {
        var Name: OutpostName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: OutpostDescription?
            get() = definedExternally
            set(value) = definedExternally
        var SiteId: SiteId
        var AvailabilityZone: AvailabilityZone?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZoneId: AvailabilityZoneId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateOutpostOutput {
        var Outpost: Outpost?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteOutpostInput {
        var OutpostId: OutpostId
    }
    interface DeleteOutpostOutput
    interface DeleteSiteInput {
        var SiteId: SiteId
    }
    interface DeleteSiteOutput
    interface GetOutpostInput {
        var OutpostId: OutpostId
    }
    interface GetOutpostInstanceTypesInput {
        var OutpostId: OutpostId
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults1000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOutpostInstanceTypesOutput {
        var InstanceTypes: InstanceTypeListDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var OutpostId: OutpostId?
            get() = definedExternally
            set(value) = definedExternally
        var OutpostArn: OutpostArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOutpostOutput {
        var Outpost: Outpost?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceTypeItem {
        var InstanceType: InstanceType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOutpostsInput {
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults1000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOutpostsOutput {
        var Outposts: outpostListDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSitesInput {
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults1000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSitesOutput {
        var Sites: siteListDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Outpost {
        var OutpostId: OutpostId?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerId: OwnerId?
            get() = definedExternally
            set(value) = definedExternally
        var OutpostArn: OutpostArn?
            get() = definedExternally
            set(value) = definedExternally
        var SiteId: SiteId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: OutpostName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: OutpostDescription?
            get() = definedExternally
            set(value) = definedExternally
        var LifeCycleStatus: LifeCycleStatus?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: AvailabilityZone?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZoneId: AvailabilityZoneId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Site {
        var SiteId: SiteId?
            get() = definedExternally
            set(value) = definedExternally
        var AccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: SiteName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: SiteDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-12-03" | "latest" | String */
    }
}