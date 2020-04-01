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
import ChainableTemporaryCredentials.ChainableTemporaryCredentialsOptions

external open class ChainableTemporaryCredentials(options: ChainableTemporaryCredentials.ChainableTemporaryCredentialsOptions) : Credentials {
    constructor(options: ChainableTemporaryCredentialsOptions)
    override fun refresh(callback: (err: AWSError) -> Unit)
    open var service: Any
    interface ChainableTemporaryCredentialsOptions {
        var params: dynamic /* STS.Types.AssumeRoleRequest | STS.Types.GetSessionTokenRequest */
            get() = definedExternally
            set(value) = definedExternally
        var masterCredentials: Credentials?
            get() = definedExternally
            set(value) = definedExternally
        var stsConfig: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
        var tokenCodeFn: ((serialNumber: String, callback: (err: Error, token: String) -> Unit) -> Unit)?
            get() = definedExternally
            set(value) = definedExternally
    }
}