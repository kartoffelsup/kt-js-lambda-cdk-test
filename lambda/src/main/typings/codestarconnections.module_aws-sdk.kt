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
import CodeStarconnections.Connection
import CodeStarconnections.CreateConnectionInput
import CodeStarconnections.CreateConnectionOutput
import CodeStarconnections.DeleteConnectionInput
import CodeStarconnections.DeleteConnectionOutput
import CodeStarconnections.GetConnectionInput
import CodeStarconnections.GetConnectionOutput
import CodeStarconnections.ListConnectionsInput
import CodeStarconnections.ListConnectionsOutput

typealias AccountId = String

typealias ConnectionArn = String

typealias ConnectionList = Array<Connection>

typealias ConnectionName = String

typealias MaxResults = Number

typealias NextToken = String

@JsModule("aws-sdk")
external open class CodeStarconnections(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CodeStarconnections.Types.ClientConfiguration */
    open fun createConnection(params: CreateConnectionInput, callback: (err: AWSError, data: CreateConnectionOutput) -> Unit = definedExternally): Request<CreateConnectionOutput, AWSError>
    open fun createConnection(callback: (err: AWSError, data: CreateConnectionOutput) -> Unit = definedExternally): Request<CreateConnectionOutput, AWSError>
    open fun deleteConnection(params: DeleteConnectionInput, callback: (err: AWSError, data: DeleteConnectionOutput) -> Unit = definedExternally): Request<DeleteConnectionOutput, AWSError>
    open fun deleteConnection(callback: (err: AWSError, data: DeleteConnectionOutput) -> Unit = definedExternally): Request<DeleteConnectionOutput, AWSError>
    open fun getConnection(params: GetConnectionInput, callback: (err: AWSError, data: GetConnectionOutput) -> Unit = definedExternally): Request<GetConnectionOutput, AWSError>
    open fun getConnection(callback: (err: AWSError, data: GetConnectionOutput) -> Unit = definedExternally): Request<GetConnectionOutput, AWSError>
    open fun listConnections(params: ListConnectionsInput, callback: (err: AWSError, data: ListConnectionsOutput) -> Unit = definedExternally): Request<ListConnectionsOutput, AWSError>
    open fun listConnections(callback: (err: AWSError, data: ListConnectionsOutput) -> Unit = definedExternally): Request<ListConnectionsOutput, AWSError>
    interface Connection {
        var ConnectionName: ConnectionName?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionArn: ConnectionArn?
            get() = definedExternally
            set(value) = definedExternally
        var ProviderType: String /* "Bitbucket" | String */
        var OwnerAccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionStatus: String /* "PENDING" | "AVAILABLE" | "ERROR" | String */
    }
    interface CreateConnectionInput {
        var ProviderType: String /* "Bitbucket" | String */
        var ConnectionName: ConnectionName
    }
    interface CreateConnectionOutput {
        var ConnectionArn: ConnectionArn
    }
    interface DeleteConnectionInput {
        var ConnectionArn: ConnectionArn
    }
    interface DeleteConnectionOutput
    interface GetConnectionInput {
        var ConnectionArn: ConnectionArn
    }
    interface GetConnectionOutput {
        var Connection: Connection?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConnectionsInput {
        var ProviderTypeFilter: String /* "Bitbucket" | String */
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConnectionsOutput {
        var Connections: ConnectionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-12-01" | "latest" | String */
    }
}