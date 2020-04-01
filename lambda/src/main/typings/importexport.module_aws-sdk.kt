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
import ImportExport.Artifact
import ImportExport.Job
import ImportExport.CancelJobInput
import ImportExport.CancelJobOutput
import ImportExport.CreateJobInput
import ImportExport.CreateJobOutput
import ImportExport.GetShippingLabelInput
import ImportExport.GetShippingLabelOutput
import ImportExport.GetStatusInput
import ImportExport.GetStatusOutput
import ImportExport.ListJobsInput
import ImportExport.ListJobsOutput
import ImportExport.UpdateJobInput
import ImportExport.UpdateJobOutput

typealias APIVersion = String

typealias ArtifactList = Array<Artifact>

typealias Carrier = String

typealias CreationDate = Date

typealias CurrentManifest = String

typealias Description = String

typealias ErrorCount = Number

typealias GenericString = String

typealias IsCanceled = Boolean

typealias IsTruncated = Boolean

typealias JobId = String

typealias JobIdList = Array<GenericString>

typealias JobsList = Array<Job>

typealias LocationCode = String

typealias LocationMessage = String

typealias LogBucket = String

typealias LogKey = String

typealias Manifest = String

typealias ManifestAddendum = String

typealias Marker = String

typealias MaxJobs = Number

typealias ProgressCode = String

typealias ProgressMessage = String

typealias Signature = String

typealias SignatureFileContents = String

typealias Success = Boolean

typealias TrackingNumber = String

typealias URL = String

typealias ValidateOnly = Boolean

typealias WarningMessage = String

typealias city = String

typealias company = String

typealias country = String

typealias name = String

typealias phoneNumber = String

typealias postalCode = String

typealias stateOrProvince = String

typealias street1 = String

typealias street2 = String

typealias street3 = String

@JsModule("aws-sdk")
external open class ImportExport(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ImportExport.Types.ClientConfiguration */
    open fun cancelJob(params: CancelJobInput, callback: (err: AWSError, data: CancelJobOutput) -> Unit = definedExternally): Request<CancelJobOutput, AWSError>
    open fun cancelJob(callback: (err: AWSError, data: CancelJobOutput) -> Unit = definedExternally): Request<CancelJobOutput, AWSError>
    open fun createJob(params: CreateJobInput, callback: (err: AWSError, data: CreateJobOutput) -> Unit = definedExternally): Request<CreateJobOutput, AWSError>
    open fun createJob(callback: (err: AWSError, data: CreateJobOutput) -> Unit = definedExternally): Request<CreateJobOutput, AWSError>
    open fun getShippingLabel(params: GetShippingLabelInput, callback: (err: AWSError, data: GetShippingLabelOutput) -> Unit = definedExternally): Request<GetShippingLabelOutput, AWSError>
    open fun getShippingLabel(callback: (err: AWSError, data: GetShippingLabelOutput) -> Unit = definedExternally): Request<GetShippingLabelOutput, AWSError>
    open fun getStatus(params: GetStatusInput, callback: (err: AWSError, data: GetStatusOutput) -> Unit = definedExternally): Request<GetStatusOutput, AWSError>
    open fun getStatus(callback: (err: AWSError, data: GetStatusOutput) -> Unit = definedExternally): Request<GetStatusOutput, AWSError>
    open fun listJobs(params: ListJobsInput, callback: (err: AWSError, data: ListJobsOutput) -> Unit = definedExternally): Request<ListJobsOutput, AWSError>
    open fun listJobs(callback: (err: AWSError, data: ListJobsOutput) -> Unit = definedExternally): Request<ListJobsOutput, AWSError>
    open fun updateJob(params: UpdateJobInput, callback: (err: AWSError, data: UpdateJobOutput) -> Unit = definedExternally): Request<UpdateJobOutput, AWSError>
    open fun updateJob(callback: (err: AWSError, data: UpdateJobOutput) -> Unit = definedExternally): Request<UpdateJobOutput, AWSError>
    interface Artifact {
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var URL: URL?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelJobInput {
        var JobId: JobId
        var APIVersion: APIVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelJobOutput {
        var Success: Success?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateJobInput {
        var JobType: String /* "Import" | "Export" | String */
        var Manifest: Manifest
        var ManifestAddendum: ManifestAddendum?
            get() = definedExternally
            set(value) = definedExternally
        var ValidateOnly: ValidateOnly
        var APIVersion: APIVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateJobOutput {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var JobType: String /* "Import" | "Export" | String */
        var Signature: Signature?
            get() = definedExternally
            set(value) = definedExternally
        var SignatureFileContents: SignatureFileContents?
            get() = definedExternally
            set(value) = definedExternally
        var WarningMessage: WarningMessage?
            get() = definedExternally
            set(value) = definedExternally
        var ArtifactList: ArtifactList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetShippingLabelInput {
        var jobIds: JobIdList
        var name: name?
            get() = definedExternally
            set(value) = definedExternally
        var company: company?
            get() = definedExternally
            set(value) = definedExternally
        var phoneNumber: phoneNumber?
            get() = definedExternally
            set(value) = definedExternally
        var country: country?
            get() = definedExternally
            set(value) = definedExternally
        var stateOrProvince: stateOrProvince?
            get() = definedExternally
            set(value) = definedExternally
        var city: city?
            get() = definedExternally
            set(value) = definedExternally
        var postalCode: postalCode?
            get() = definedExternally
            set(value) = definedExternally
        var street1: street1?
            get() = definedExternally
            set(value) = definedExternally
        var street2: street2?
            get() = definedExternally
            set(value) = definedExternally
        var street3: street3?
            get() = definedExternally
            set(value) = definedExternally
        var APIVersion: APIVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetShippingLabelOutput {
        var ShippingLabelURL: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Warning: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetStatusInput {
        var JobId: JobId
        var APIVersion: APIVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetStatusOutput {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var JobType: String /* "Import" | "Export" | String */
        var LocationCode: LocationCode?
            get() = definedExternally
            set(value) = definedExternally
        var LocationMessage: LocationMessage?
            get() = definedExternally
            set(value) = definedExternally
        var ProgressCode: ProgressCode?
            get() = definedExternally
            set(value) = definedExternally
        var ProgressMessage: ProgressMessage?
            get() = definedExternally
            set(value) = definedExternally
        var Carrier: Carrier?
            get() = definedExternally
            set(value) = definedExternally
        var TrackingNumber: TrackingNumber?
            get() = definedExternally
            set(value) = definedExternally
        var LogBucket: LogBucket?
            get() = definedExternally
            set(value) = definedExternally
        var LogKey: LogKey?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCount: ErrorCount?
            get() = definedExternally
            set(value) = definedExternally
        var Signature: Signature?
            get() = definedExternally
            set(value) = definedExternally
        var SignatureFileContents: Signature?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentManifest: CurrentManifest?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: CreationDate?
            get() = definedExternally
            set(value) = definedExternally
        var ArtifactList: ArtifactList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Job {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: CreationDate?
            get() = definedExternally
            set(value) = definedExternally
        var IsCanceled: IsCanceled?
            get() = definedExternally
            set(value) = definedExternally
        var JobType: String /* "Import" | "Export" | String */
    }
    interface ListJobsInput {
        var MaxJobs: MaxJobs?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var APIVersion: APIVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobsOutput {
        var Jobs: JobsList?
            get() = definedExternally
            set(value) = definedExternally
        var IsTruncated: IsTruncated?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateJobInput {
        var JobId: JobId
        var Manifest: Manifest
        var JobType: String /* "Import" | "Export" | String */
        var ValidateOnly: ValidateOnly
        var APIVersion: APIVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateJobOutput {
        var Success: Success?
            get() = definedExternally
            set(value) = definedExternally
        var WarningMessage: WarningMessage?
            get() = definedExternally
            set(value) = definedExternally
        var ArtifactList: ArtifactList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2010-06-01" | "latest" | String */
    }
}