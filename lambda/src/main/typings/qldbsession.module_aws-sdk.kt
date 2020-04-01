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
import QLDBSession.ValueHolder
import QLDBSession.SendCommandRequest
import QLDBSession.SendCommandResult
import QLDBSession.Page
import QLDBSession.StartSessionRequest
import QLDBSession.StartTransactionRequest
import QLDBSession.EndSessionRequest
import QLDBSession.CommitTransactionRequest
import QLDBSession.AbortTransactionRequest
import QLDBSession.ExecuteStatementRequest
import QLDBSession.FetchPageRequest
import QLDBSession.StartSessionResult
import QLDBSession.StartTransactionResult
import QLDBSession.EndSessionResult
import QLDBSession.CommitTransactionResult
import QLDBSession.AbortTransactionResult
import QLDBSession.ExecuteStatementResult
import QLDBSession.FetchPageResult

typealias IonText = String

typealias LedgerName = String

typealias PageToken = String

typealias SessionToken = String

typealias Statement = String

typealias StatementParameters = Array<ValueHolder>

typealias TransactionId = String

typealias ValueHolders = Array<ValueHolder>

@JsModule("aws-sdk")
external open class QLDBSession(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & QLDBSession.Types.ClientConfiguration */
    open fun sendCommand(params: SendCommandRequest, callback: (err: AWSError, data: SendCommandResult) -> Unit = definedExternally): Request<SendCommandResult, AWSError>
    open fun sendCommand(callback: (err: AWSError, data: SendCommandResult) -> Unit = definedExternally): Request<SendCommandResult, AWSError>
    interface AbortTransactionRequest
    interface AbortTransactionResult
    interface CommitTransactionRequest {
        var TransactionId: TransactionId
        var CommitDigest: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CommitTransactionResult {
        var TransactionId: TransactionId?
            get() = definedExternally
            set(value) = definedExternally
        var CommitDigest: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EndSessionRequest
    interface EndSessionResult
    interface ExecuteStatementRequest {
        var TransactionId: TransactionId
        var Statement: Statement
        var Parameters: StatementParameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExecuteStatementResult {
        var FirstPage: Page?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FetchPageRequest {
        var TransactionId: TransactionId
        var NextPageToken: PageToken
    }
    interface FetchPageResult {
        var Page: Page?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Page {
        var Values: ValueHolders?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendCommandRequest {
        var SessionToken: SessionToken?
            get() = definedExternally
            set(value) = definedExternally
        var StartSession: StartSessionRequest?
            get() = definedExternally
            set(value) = definedExternally
        var StartTransaction: StartTransactionRequest?
            get() = definedExternally
            set(value) = definedExternally
        var EndSession: EndSessionRequest?
            get() = definedExternally
            set(value) = definedExternally
        var CommitTransaction: CommitTransactionRequest?
            get() = definedExternally
            set(value) = definedExternally
        var AbortTransaction: AbortTransactionRequest?
            get() = definedExternally
            set(value) = definedExternally
        var ExecuteStatement: ExecuteStatementRequest?
            get() = definedExternally
            set(value) = definedExternally
        var FetchPage: FetchPageRequest?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendCommandResult {
        var StartSession: StartSessionResult?
            get() = definedExternally
            set(value) = definedExternally
        var StartTransaction: StartTransactionResult?
            get() = definedExternally
            set(value) = definedExternally
        var EndSession: EndSessionResult?
            get() = definedExternally
            set(value) = definedExternally
        var CommitTransaction: CommitTransactionResult?
            get() = definedExternally
            set(value) = definedExternally
        var AbortTransaction: AbortTransactionResult?
            get() = definedExternally
            set(value) = definedExternally
        var ExecuteStatement: ExecuteStatementResult?
            get() = definedExternally
            set(value) = definedExternally
        var FetchPage: FetchPageResult?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartSessionRequest {
        var LedgerName: LedgerName
    }
    interface StartSessionResult {
        var SessionToken: SessionToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartTransactionRequest
    interface StartTransactionResult {
        var TransactionId: TransactionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ValueHolder {
        var IonBinary: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var IonText: IonText?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-07-11" | "latest" | String */
    }
}