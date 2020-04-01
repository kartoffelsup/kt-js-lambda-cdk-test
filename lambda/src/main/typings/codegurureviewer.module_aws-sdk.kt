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
import CodeGuruReviewer.RepositoryAssociationSummary
import CodeGuruReviewer.AssociateRepositoryRequest
import CodeGuruReviewer.AssociateRepositoryResponse
import CodeGuruReviewer.DescribeRepositoryAssociationRequest
import CodeGuruReviewer.DescribeRepositoryAssociationResponse
import CodeGuruReviewer.DisassociateRepositoryRequest
import CodeGuruReviewer.DisassociateRepositoryResponse
import CodeGuruReviewer.ListRepositoryAssociationsRequest
import CodeGuruReviewer.ListRepositoryAssociationsResponse
import CodeGuruReviewer.Repository
import CodeGuruReviewer.RepositoryAssociation
import CodeGuruReviewer.CodeCommitRepository

typealias Arn = String

typealias AssociationId = String

typealias ClientRequestToken = String

typealias MaxResults = Number

typealias Name = String

typealias Names = Array<Name>

typealias NextToken = String

typealias Owner = String

typealias Owners = Array<Owner>

typealias ProviderTypes = Array<String /* "CodeCommit" | "GitHub" | String */>

typealias RepositoryAssociationStates = Array<String /* "Associated" | "Associating" | "Failed" | "Disassociating" | String */>

typealias RepositoryAssociationSummaries = Array<RepositoryAssociationSummary>

typealias StateReason = String

typealias TimeStamp = Date

@JsModule("aws-sdk")
external open class CodeGuruReviewer(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CodeGuruReviewer.Types.ClientConfiguration */
    open fun associateRepository(params: AssociateRepositoryRequest, callback: (err: AWSError, data: AssociateRepositoryResponse) -> Unit = definedExternally): Request<AssociateRepositoryResponse, AWSError>
    open fun associateRepository(callback: (err: AWSError, data: AssociateRepositoryResponse) -> Unit = definedExternally): Request<AssociateRepositoryResponse, AWSError>
    open fun describeRepositoryAssociation(params: DescribeRepositoryAssociationRequest, callback: (err: AWSError, data: DescribeRepositoryAssociationResponse) -> Unit = definedExternally): Request<DescribeRepositoryAssociationResponse, AWSError>
    open fun describeRepositoryAssociation(callback: (err: AWSError, data: DescribeRepositoryAssociationResponse) -> Unit = definedExternally): Request<DescribeRepositoryAssociationResponse, AWSError>
    open fun disassociateRepository(params: DisassociateRepositoryRequest, callback: (err: AWSError, data: DisassociateRepositoryResponse) -> Unit = definedExternally): Request<DisassociateRepositoryResponse, AWSError>
    open fun disassociateRepository(callback: (err: AWSError, data: DisassociateRepositoryResponse) -> Unit = definedExternally): Request<DisassociateRepositoryResponse, AWSError>
    open fun listRepositoryAssociations(params: ListRepositoryAssociationsRequest, callback: (err: AWSError, data: ListRepositoryAssociationsResponse) -> Unit = definedExternally): Request<ListRepositoryAssociationsResponse, AWSError>
    open fun listRepositoryAssociations(callback: (err: AWSError, data: ListRepositoryAssociationsResponse) -> Unit = definedExternally): Request<ListRepositoryAssociationsResponse, AWSError>
    interface AssociateRepositoryRequest {
        var Repository: Repository
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateRepositoryResponse {
        var RepositoryAssociation: RepositoryAssociation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CodeCommitRepository {
        var Name: Name
    }
    interface DescribeRepositoryAssociationRequest {
        var AssociationArn: Arn
    }
    interface DescribeRepositoryAssociationResponse {
        var RepositoryAssociation: RepositoryAssociation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateRepositoryRequest {
        var AssociationArn: Arn
    }
    interface DisassociateRepositoryResponse {
        var RepositoryAssociation: RepositoryAssociation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRepositoryAssociationsRequest {
        var ProviderTypes: ProviderTypes?
            get() = definedExternally
            set(value) = definedExternally
        var States: RepositoryAssociationStates?
            get() = definedExternally
            set(value) = definedExternally
        var Names: Names?
            get() = definedExternally
            set(value) = definedExternally
        var Owners: Owners?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRepositoryAssociationsResponse {
        var RepositoryAssociationSummaries: RepositoryAssociationSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Repository {
        var CodeCommit: CodeCommitRepository?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RepositoryAssociation {
        var AssociationId: AssociationId?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var Owner: Owner?
            get() = definedExternally
            set(value) = definedExternally
        var ProviderType: String /* "CodeCommit" | "GitHub" | String */
        var State: String /* "Associated" | "Associating" | "Failed" | "Disassociating" | String */
        var StateReason: StateReason?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTimeStamp: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTimeStamp: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RepositoryAssociationSummary {
        var AssociationArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTimeStamp: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var AssociationId: AssociationId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var Owner: Owner?
            get() = definedExternally
            set(value) = definedExternally
        var ProviderType: String /* "CodeCommit" | "GitHub" | String */
        var State: String /* "Associated" | "Associating" | "Failed" | "Disassociating" | String */
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-09-19" | "latest" | String */
    }
}