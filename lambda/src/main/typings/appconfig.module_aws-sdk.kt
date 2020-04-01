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
import AppConfig.Application
import AppConfig.ConfigurationProfileSummary
import AppConfig.DeploymentSummary
import AppConfig.DeploymentStrategy
import AppConfig.Environment
import AppConfig.Monitor
import AppConfig.Validator
import AppConfig.CreateApplicationRequest
import AppConfig.CreateConfigurationProfileRequest
import AppConfig.ConfigurationProfile
import AppConfig.CreateDeploymentStrategyRequest
import AppConfig.CreateEnvironmentRequest
import AppConfig.DeleteApplicationRequest
import AppConfig.DeleteConfigurationProfileRequest
import AppConfig.DeleteDeploymentStrategyRequest
import AppConfig.DeleteEnvironmentRequest
import AppConfig.GetApplicationRequest
import AppConfig.GetConfigurationRequest
import AppConfig.Configuration
import AppConfig.GetConfigurationProfileRequest
import AppConfig.GetDeploymentRequest
import AppConfig.Deployment
import AppConfig.GetDeploymentStrategyRequest
import AppConfig.GetEnvironmentRequest
import AppConfig.ListApplicationsRequest
import AppConfig.Applications
import AppConfig.ListConfigurationProfilesRequest
import AppConfig.ConfigurationProfiles
import AppConfig.ListDeploymentStrategiesRequest
import AppConfig.DeploymentStrategies
import AppConfig.ListDeploymentsRequest
import AppConfig.Deployments
import AppConfig.ListEnvironmentsRequest
import AppConfig.Environments
import AppConfig.ListTagsForResourceRequest
import AppConfig.ResourceTags
import AppConfig.StartDeploymentRequest
import AppConfig.StopDeploymentRequest
import AppConfig.TagResourceRequest
import AppConfig.UntagResourceRequest
import AppConfig.UpdateApplicationRequest
import AppConfig.UpdateConfigurationProfileRequest
import AppConfig.UpdateDeploymentStrategyRequest
import AppConfig.UpdateEnvironmentRequest
import AppConfig.ValidateConfigurationRequest
import AppConfig.TagMap

typealias ApplicationList = Array<Application>

typealias Arn = String

typealias ConfigurationProfileSummaryList = Array<ConfigurationProfileSummary>

typealias DeploymentList = Array<DeploymentSummary>

typealias DeploymentStrategyId = String

typealias DeploymentStrategyList = Array<DeploymentStrategy>

typealias Description = String

typealias EnvironmentList = Array<Environment>

typealias GrowthFactor = Number

typealias Id = String

typealias Integer = Number

typealias Iso8601DateTime = Date

typealias MaxResults = Number

typealias MinutesBetween0And24Hours = Number

typealias MonitorList = Array<Monitor>

typealias Name = String

typealias NextToken = String

typealias Percentage = Number

typealias String = String

typealias StringWithLengthBetween0And32768 = String

typealias StringWithLengthBetween1And64 = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagValue = String

typealias Uri = String

typealias ValidatorList = Array<Validator>

typealias ValidatorTypeList = Array<String /* "JSON_SCHEMA" | "LAMBDA" | String */>

typealias Version = String

@JsModule("aws-sdk")
external open class AppConfig(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & AppConfig.Types.ClientConfiguration */
    open fun createApplication(params: CreateApplicationRequest, callback: (err: AWSError, data: Application) -> Unit = definedExternally): Request<Application, AWSError>
    open fun createApplication(callback: (err: AWSError, data: Application) -> Unit = definedExternally): Request<Application, AWSError>
    open fun createConfigurationProfile(params: CreateConfigurationProfileRequest, callback: (err: AWSError, data: ConfigurationProfile) -> Unit = definedExternally): Request<ConfigurationProfile, AWSError>
    open fun createConfigurationProfile(callback: (err: AWSError, data: ConfigurationProfile) -> Unit = definedExternally): Request<ConfigurationProfile, AWSError>
    open fun createDeploymentStrategy(params: CreateDeploymentStrategyRequest, callback: (err: AWSError, data: DeploymentStrategy) -> Unit = definedExternally): Request<DeploymentStrategy, AWSError>
    open fun createDeploymentStrategy(callback: (err: AWSError, data: DeploymentStrategy) -> Unit = definedExternally): Request<DeploymentStrategy, AWSError>
    open fun createEnvironment(params: CreateEnvironmentRequest, callback: (err: AWSError, data: Environment) -> Unit = definedExternally): Request<Environment, AWSError>
    open fun createEnvironment(callback: (err: AWSError, data: Environment) -> Unit = definedExternally): Request<Environment, AWSError>
    open fun deleteApplication(params: DeleteApplicationRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteApplication(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteConfigurationProfile(params: DeleteConfigurationProfileRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteConfigurationProfile(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDeploymentStrategy(params: DeleteDeploymentStrategyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDeploymentStrategy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEnvironment(params: DeleteEnvironmentRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEnvironment(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun getApplication(params: GetApplicationRequest, callback: (err: AWSError, data: Application) -> Unit = definedExternally): Request<Application, AWSError>
    open fun getApplication(callback: (err: AWSError, data: Application) -> Unit = definedExternally): Request<Application, AWSError>
    open fun getConfiguration(params: GetConfigurationRequest, callback: (err: AWSError, data: Configuration) -> Unit = definedExternally): Request<Configuration, AWSError>
    open fun getConfiguration(callback: (err: AWSError, data: Configuration) -> Unit = definedExternally): Request<Configuration, AWSError>
    open fun getConfigurationProfile(params: GetConfigurationProfileRequest, callback: (err: AWSError, data: ConfigurationProfile) -> Unit = definedExternally): Request<ConfigurationProfile, AWSError>
    open fun getConfigurationProfile(callback: (err: AWSError, data: ConfigurationProfile) -> Unit = definedExternally): Request<ConfigurationProfile, AWSError>
    open fun getDeployment(params: GetDeploymentRequest, callback: (err: AWSError, data: Deployment) -> Unit = definedExternally): Request<Deployment, AWSError>
    open fun getDeployment(callback: (err: AWSError, data: Deployment) -> Unit = definedExternally): Request<Deployment, AWSError>
    open fun getDeploymentStrategy(params: GetDeploymentStrategyRequest, callback: (err: AWSError, data: DeploymentStrategy) -> Unit = definedExternally): Request<DeploymentStrategy, AWSError>
    open fun getDeploymentStrategy(callback: (err: AWSError, data: DeploymentStrategy) -> Unit = definedExternally): Request<DeploymentStrategy, AWSError>
    open fun getEnvironment(params: GetEnvironmentRequest, callback: (err: AWSError, data: Environment) -> Unit = definedExternally): Request<Environment, AWSError>
    open fun getEnvironment(callback: (err: AWSError, data: Environment) -> Unit = definedExternally): Request<Environment, AWSError>
    open fun listApplications(params: ListApplicationsRequest, callback: (err: AWSError, data: Applications) -> Unit = definedExternally): Request<Applications, AWSError>
    open fun listApplications(callback: (err: AWSError, data: Applications) -> Unit = definedExternally): Request<Applications, AWSError>
    open fun listConfigurationProfiles(params: ListConfigurationProfilesRequest, callback: (err: AWSError, data: ConfigurationProfiles) -> Unit = definedExternally): Request<ConfigurationProfiles, AWSError>
    open fun listConfigurationProfiles(callback: (err: AWSError, data: ConfigurationProfiles) -> Unit = definedExternally): Request<ConfigurationProfiles, AWSError>
    open fun listDeploymentStrategies(params: ListDeploymentStrategiesRequest, callback: (err: AWSError, data: DeploymentStrategies) -> Unit = definedExternally): Request<DeploymentStrategies, AWSError>
    open fun listDeploymentStrategies(callback: (err: AWSError, data: DeploymentStrategies) -> Unit = definedExternally): Request<DeploymentStrategies, AWSError>
    open fun listDeployments(params: ListDeploymentsRequest, callback: (err: AWSError, data: Deployments) -> Unit = definedExternally): Request<Deployments, AWSError>
    open fun listDeployments(callback: (err: AWSError, data: Deployments) -> Unit = definedExternally): Request<Deployments, AWSError>
    open fun listEnvironments(params: ListEnvironmentsRequest, callback: (err: AWSError, data: Environments) -> Unit = definedExternally): Request<Environments, AWSError>
    open fun listEnvironments(callback: (err: AWSError, data: Environments) -> Unit = definedExternally): Request<Environments, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ResourceTags) -> Unit = definedExternally): Request<ResourceTags, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ResourceTags) -> Unit = definedExternally): Request<ResourceTags, AWSError>
    open fun startDeployment(params: StartDeploymentRequest, callback: (err: AWSError, data: Deployment) -> Unit = definedExternally): Request<Deployment, AWSError>
    open fun startDeployment(callback: (err: AWSError, data: Deployment) -> Unit = definedExternally): Request<Deployment, AWSError>
    open fun stopDeployment(params: StopDeploymentRequest, callback: (err: AWSError, data: Deployment) -> Unit = definedExternally): Request<Deployment, AWSError>
    open fun stopDeployment(callback: (err: AWSError, data: Deployment) -> Unit = definedExternally): Request<Deployment, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateApplication(params: UpdateApplicationRequest, callback: (err: AWSError, data: Application) -> Unit = definedExternally): Request<Application, AWSError>
    open fun updateApplication(callback: (err: AWSError, data: Application) -> Unit = definedExternally): Request<Application, AWSError>
    open fun updateConfigurationProfile(params: UpdateConfigurationProfileRequest, callback: (err: AWSError, data: ConfigurationProfile) -> Unit = definedExternally): Request<ConfigurationProfile, AWSError>
    open fun updateConfigurationProfile(callback: (err: AWSError, data: ConfigurationProfile) -> Unit = definedExternally): Request<ConfigurationProfile, AWSError>
    open fun updateDeploymentStrategy(params: UpdateDeploymentStrategyRequest, callback: (err: AWSError, data: DeploymentStrategy) -> Unit = definedExternally): Request<DeploymentStrategy, AWSError>
    open fun updateDeploymentStrategy(callback: (err: AWSError, data: DeploymentStrategy) -> Unit = definedExternally): Request<DeploymentStrategy, AWSError>
    open fun updateEnvironment(params: UpdateEnvironmentRequest, callback: (err: AWSError, data: Environment) -> Unit = definedExternally): Request<Environment, AWSError>
    open fun updateEnvironment(callback: (err: AWSError, data: Environment) -> Unit = definedExternally): Request<Environment, AWSError>
    open fun validateConfiguration(params: ValidateConfigurationRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun validateConfiguration(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    interface Application {
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Applications {
        var Items: ApplicationList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Configuration {
        var Content: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
        var ContentType: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigurationProfile {
        var ApplicationId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var LocationUri: Uri?
            get() = definedExternally
            set(value) = definedExternally
        var RetrievalRoleArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Validators: ValidatorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigurationProfileSummary {
        var ApplicationId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var LocationUri: Uri?
            get() = definedExternally
            set(value) = definedExternally
        var ValidatorTypes: ValidatorTypeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigurationProfiles {
        var Items: ConfigurationProfileSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateApplicationRequest {
        var Name: Name
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateConfigurationProfileRequest {
        var ApplicationId: Id
        var Name: Name
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var LocationUri: Uri
        var RetrievalRoleArn: Arn
        var Validators: ValidatorList?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeploymentStrategyRequest {
        var Name: Name
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentDurationInMinutes: MinutesBetween0And24Hours
        var FinalBakeTimeInMinutes: MinutesBetween0And24Hours?
            get() = definedExternally
            set(value) = definedExternally
        var GrowthFactor: GrowthFactor
        var GrowthType: String /* "LINEAR" | "EXPONENTIAL" | String */
        var ReplicateTo: String /* "NONE" | "SSM_DOCUMENT" | String */
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEnvironmentRequest {
        var ApplicationId: Id
        var Name: Name
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Monitors: MonitorList?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteApplicationRequest {
        var ApplicationId: Id
    }
    interface DeleteConfigurationProfileRequest {
        var ApplicationId: Id
        var ConfigurationProfileId: Id
    }
    interface DeleteDeploymentStrategyRequest {
        var DeploymentStrategyId: DeploymentStrategyId
    }
    interface DeleteEnvironmentRequest {
        var ApplicationId: Id
        var EnvironmentId: Id
    }
    interface Deployment {
        var ApplicationId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentStrategyId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationProfileId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentNumber: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationLocationUri: Uri?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentDurationInMinutes: MinutesBetween0And24Hours?
            get() = definedExternally
            set(value) = definedExternally
        var GrowthType: String /* "LINEAR" | "EXPONENTIAL" | String */
        var GrowthFactor: Percentage?
            get() = definedExternally
            set(value) = definedExternally
        var FinalBakeTimeInMinutes: MinutesBetween0And24Hours?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "BAKING" | "VALIDATING" | "DEPLOYING" | "COMPLETE" | "ROLLING_BACK" | "ROLLED_BACK" | String */
        var PercentageComplete: Percentage?
            get() = definedExternally
            set(value) = definedExternally
        var StartedAt: Iso8601DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var CompletedAt: Iso8601DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeploymentStrategies {
        var Items: DeploymentStrategyList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeploymentStrategy {
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentDurationInMinutes: MinutesBetween0And24Hours?
            get() = definedExternally
            set(value) = definedExternally
        var GrowthType: String /* "LINEAR" | "EXPONENTIAL" | String */
        var GrowthFactor: Percentage?
            get() = definedExternally
            set(value) = definedExternally
        var FinalBakeTimeInMinutes: MinutesBetween0And24Hours?
            get() = definedExternally
            set(value) = definedExternally
        var ReplicateTo: String /* "NONE" | "SSM_DOCUMENT" | String */
    }
    interface DeploymentSummary {
        var DeploymentNumber: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentDurationInMinutes: MinutesBetween0And24Hours?
            get() = definedExternally
            set(value) = definedExternally
        var GrowthType: String /* "LINEAR" | "EXPONENTIAL" | String */
        var GrowthFactor: Percentage?
            get() = definedExternally
            set(value) = definedExternally
        var FinalBakeTimeInMinutes: MinutesBetween0And24Hours?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "BAKING" | "VALIDATING" | "DEPLOYING" | "COMPLETE" | "ROLLING_BACK" | "ROLLED_BACK" | String */
        var PercentageComplete: Percentage?
            get() = definedExternally
            set(value) = definedExternally
        var StartedAt: Iso8601DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var CompletedAt: Iso8601DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Deployments {
        var Items: DeploymentList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Environment {
        var ApplicationId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "READY_FOR_DEPLOYMENT" | "DEPLOYING" | "ROLLING_BACK" | "ROLLED_BACK" | String */
        var Monitors: MonitorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Environments {
        var Items: EnvironmentList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetApplicationRequest {
        var ApplicationId: Id
    }
    interface GetConfigurationProfileRequest {
        var ApplicationId: Id
        var ConfigurationProfileId: Id
    }
    interface GetConfigurationRequest {
        var Application: StringWithLengthBetween1And64
        var Environment: StringWithLengthBetween1And64
        var Configuration: StringWithLengthBetween1And64
        var ClientId: StringWithLengthBetween1And64
        var ClientConfigurationVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeploymentRequest {
        var ApplicationId: Id
        var EnvironmentId: Id
        var DeploymentNumber: Integer
    }
    interface GetDeploymentStrategyRequest {
        var DeploymentStrategyId: DeploymentStrategyId
    }
    interface GetEnvironmentRequest {
        var ApplicationId: Id
        var EnvironmentId: Id
    }
    interface ListApplicationsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConfigurationProfilesRequest {
        var ApplicationId: Id
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeploymentStrategiesRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeploymentsRequest {
        var ApplicationId: Id
        var EnvironmentId: Id
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEnvironmentsRequest {
        var ApplicationId: Id
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: Arn
    }
    interface Monitor {
        var AlarmArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var AlarmRoleArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceTags {
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartDeploymentRequest {
        var ApplicationId: Id
        var EnvironmentId: Id
        var DeploymentStrategyId: DeploymentStrategyId
        var ConfigurationProfileId: Id
        var ConfigurationVersion: Version
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopDeploymentRequest {
        var ApplicationId: Id
        var EnvironmentId: Id
        var DeploymentNumber: Integer
    }
    interface TagMap {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface TagResourceRequest {
        var ResourceArn: Arn
        var Tags: TagMap
    }
    interface UntagResourceRequest {
        var ResourceArn: Arn
        var TagKeys: TagKeyList
    }
    interface UpdateApplicationRequest {
        var ApplicationId: Id
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateConfigurationProfileRequest {
        var ApplicationId: Id
        var ConfigurationProfileId: Id
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var RetrievalRoleArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Validators: ValidatorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDeploymentStrategyRequest {
        var DeploymentStrategyId: DeploymentStrategyId
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentDurationInMinutes: MinutesBetween0And24Hours?
            get() = definedExternally
            set(value) = definedExternally
        var FinalBakeTimeInMinutes: MinutesBetween0And24Hours?
            get() = definedExternally
            set(value) = definedExternally
        var GrowthFactor: GrowthFactor?
            get() = definedExternally
            set(value) = definedExternally
        var GrowthType: String /* "LINEAR" | "EXPONENTIAL" | String */
    }
    interface UpdateEnvironmentRequest {
        var ApplicationId: Id
        var EnvironmentId: Id
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Monitors: MonitorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ValidateConfigurationRequest {
        var ApplicationId: Id
        var ConfigurationProfileId: Id
        var ConfigurationVersion: Version
    }
    interface Validator {
        var Type: String /* "JSON_SCHEMA" | "LAMBDA" | String */
        var Content: StringWithLengthBetween0And32768
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-10-09" | "latest" | String */
    }
}