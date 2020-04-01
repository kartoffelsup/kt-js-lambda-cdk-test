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

typealias ClientConfiguration = ConfigurationOptions

external open class CognitoIdentityCredentials(options: CognitoIdentityCredentialsInputs /* CognitoIdentityCredentialsInputs & `T$5` */, clientConfig: ConfigurationOptions = definedExternally) : Credentials {
    constructor(options: CognitoIdentityCredentialsInputs)
    override fun refresh(callback: (err: AWSError) -> Unit)
    open fun clearCachedId()
    open var data: dynamic /* CognitoIdentity.Types.GetCredentialsForIdentityResponse | STS.Types.AssumeRoleWithWebIdentityResponse */
    open var identityId: String
    open var params: dynamic /* CognitoIdentity.Types.GetIdInput | CognitoIdentity.Types.GetOpenIdTokenInput | STS.Types.AssumeRoleWithWebIdentityRequest */
}