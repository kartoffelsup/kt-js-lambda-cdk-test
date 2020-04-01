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
import GameLift.Alias
import GameLift.Build
import GameLift.DesiredPlayerSession
import GameLift.EC2InstanceLimit
import GameLift.Event
import GameLift.FleetAttributes
import GameLift.FleetCapacity
import GameLift.FleetUtilization
import GameLift.GameProperty
import GameLift.GameSessionDetail
import GameLift.GameSession
import GameLift.GameSessionQueueDestination
import GameLift.GameSessionQueue
import GameLift.Instance
import GameLift.IpPermission
import GameLift.MatchedPlayerSession
import GameLift.MatchmakingConfiguration
import GameLift.MatchmakingRuleSet
import GameLift.MatchmakingTicket
import GameLift.PlacedPlayerSession
import GameLift.PlayerLatency
import GameLift.PlayerLatencyPolicy
import GameLift.Player
import GameLift.PlayerSession
import GameLift.ScalingPolicy
import GameLift.Script
import GameLift.ServerProcess
import GameLift.Tag
import GameLift.VpcPeeringAuthorization
import GameLift.VpcPeeringConnection
import GameLift.AcceptMatchInput
import GameLift.AcceptMatchOutput
import GameLift.CreateAliasInput
import GameLift.CreateAliasOutput
import GameLift.CreateBuildInput
import GameLift.CreateBuildOutput
import GameLift.CreateFleetInput
import GameLift.CreateFleetOutput
import GameLift.CreateGameSessionInput
import GameLift.CreateGameSessionOutput
import GameLift.CreateGameSessionQueueInput
import GameLift.CreateGameSessionQueueOutput
import GameLift.CreateMatchmakingConfigurationInput
import GameLift.CreateMatchmakingConfigurationOutput
import GameLift.CreateMatchmakingRuleSetInput
import GameLift.CreateMatchmakingRuleSetOutput
import GameLift.CreatePlayerSessionInput
import GameLift.CreatePlayerSessionOutput
import GameLift.CreatePlayerSessionsInput
import GameLift.CreatePlayerSessionsOutput
import GameLift.CreateScriptInput
import GameLift.CreateScriptOutput
import GameLift.CreateVpcPeeringAuthorizationInput
import GameLift.CreateVpcPeeringAuthorizationOutput
import GameLift.CreateVpcPeeringConnectionInput
import GameLift.CreateVpcPeeringConnectionOutput
import GameLift.DeleteAliasInput
import GameLift.DeleteBuildInput
import GameLift.DeleteFleetInput
import GameLift.DeleteGameSessionQueueInput
import GameLift.DeleteGameSessionQueueOutput
import GameLift.DeleteMatchmakingConfigurationInput
import GameLift.DeleteMatchmakingConfigurationOutput
import GameLift.DeleteMatchmakingRuleSetInput
import GameLift.DeleteMatchmakingRuleSetOutput
import GameLift.DeleteScalingPolicyInput
import GameLift.DeleteScriptInput
import GameLift.DeleteVpcPeeringAuthorizationInput
import GameLift.DeleteVpcPeeringAuthorizationOutput
import GameLift.DeleteVpcPeeringConnectionInput
import GameLift.DeleteVpcPeeringConnectionOutput
import GameLift.DescribeAliasInput
import GameLift.DescribeAliasOutput
import GameLift.DescribeBuildInput
import GameLift.DescribeBuildOutput
import GameLift.DescribeEC2InstanceLimitsInput
import GameLift.DescribeEC2InstanceLimitsOutput
import GameLift.DescribeFleetAttributesInput
import GameLift.DescribeFleetAttributesOutput
import GameLift.DescribeFleetCapacityInput
import GameLift.DescribeFleetCapacityOutput
import GameLift.DescribeFleetEventsInput
import GameLift.DescribeFleetEventsOutput
import GameLift.DescribeFleetPortSettingsInput
import GameLift.DescribeFleetPortSettingsOutput
import GameLift.DescribeFleetUtilizationInput
import GameLift.DescribeFleetUtilizationOutput
import GameLift.DescribeGameSessionDetailsInput
import GameLift.DescribeGameSessionDetailsOutput
import GameLift.DescribeGameSessionPlacementInput
import GameLift.DescribeGameSessionPlacementOutput
import GameLift.DescribeGameSessionQueuesInput
import GameLift.DescribeGameSessionQueuesOutput
import GameLift.DescribeGameSessionsInput
import GameLift.DescribeGameSessionsOutput
import GameLift.DescribeInstancesInput
import GameLift.DescribeInstancesOutput
import GameLift.DescribeMatchmakingInput
import GameLift.DescribeMatchmakingOutput
import GameLift.DescribeMatchmakingConfigurationsInput
import GameLift.DescribeMatchmakingConfigurationsOutput
import GameLift.DescribeMatchmakingRuleSetsInput
import GameLift.DescribeMatchmakingRuleSetsOutput
import GameLift.DescribePlayerSessionsInput
import GameLift.DescribePlayerSessionsOutput
import GameLift.DescribeRuntimeConfigurationInput
import GameLift.DescribeRuntimeConfigurationOutput
import GameLift.DescribeScalingPoliciesInput
import GameLift.DescribeScalingPoliciesOutput
import GameLift.DescribeScriptInput
import GameLift.DescribeScriptOutput
import GameLift.DescribeVpcPeeringAuthorizationsInput
import GameLift.DescribeVpcPeeringAuthorizationsOutput
import GameLift.DescribeVpcPeeringConnectionsInput
import GameLift.DescribeVpcPeeringConnectionsOutput
import GameLift.GetGameSessionLogUrlInput
import GameLift.GetGameSessionLogUrlOutput
import GameLift.GetInstanceAccessInput
import GameLift.GetInstanceAccessOutput
import GameLift.ListAliasesInput
import GameLift.ListAliasesOutput
import GameLift.ListBuildsInput
import GameLift.ListBuildsOutput
import GameLift.ListFleetsInput
import GameLift.ListFleetsOutput
import GameLift.ListScriptsInput
import GameLift.ListScriptsOutput
import GameLift.ListTagsForResourceRequest
import GameLift.ListTagsForResourceResponse
import GameLift.PutScalingPolicyInput
import GameLift.PutScalingPolicyOutput
import GameLift.RequestUploadCredentialsInput
import GameLift.RequestUploadCredentialsOutput
import GameLift.ResolveAliasInput
import GameLift.ResolveAliasOutput
import GameLift.SearchGameSessionsInput
import GameLift.SearchGameSessionsOutput
import GameLift.StartFleetActionsInput
import GameLift.StartFleetActionsOutput
import GameLift.StartGameSessionPlacementInput
import GameLift.StartGameSessionPlacementOutput
import GameLift.StartMatchBackfillInput
import GameLift.StartMatchBackfillOutput
import GameLift.StartMatchmakingInput
import GameLift.StartMatchmakingOutput
import GameLift.StopFleetActionsInput
import GameLift.StopFleetActionsOutput
import GameLift.StopGameSessionPlacementInput
import GameLift.StopGameSessionPlacementOutput
import GameLift.StopMatchmakingInput
import GameLift.StopMatchmakingOutput
import GameLift.TagResourceRequest
import GameLift.TagResourceResponse
import GameLift.UntagResourceRequest
import GameLift.UntagResourceResponse
import GameLift.UpdateAliasInput
import GameLift.UpdateAliasOutput
import GameLift.UpdateBuildInput
import GameLift.UpdateBuildOutput
import GameLift.UpdateFleetAttributesInput
import GameLift.UpdateFleetAttributesOutput
import GameLift.UpdateFleetCapacityInput
import GameLift.UpdateFleetCapacityOutput
import GameLift.UpdateFleetPortSettingsInput
import GameLift.UpdateFleetPortSettingsOutput
import GameLift.UpdateGameSessionInput
import GameLift.UpdateGameSessionOutput
import GameLift.UpdateGameSessionQueueInput
import GameLift.UpdateGameSessionQueueOutput
import GameLift.UpdateMatchmakingConfigurationInput
import GameLift.UpdateMatchmakingConfigurationOutput
import GameLift.UpdateRuntimeConfigurationInput
import GameLift.UpdateRuntimeConfigurationOutput
import GameLift.UpdateScriptInput
import GameLift.UpdateScriptOutput
import GameLift.ValidateMatchmakingRuleSetInput
import GameLift.ValidateMatchmakingRuleSetOutput
import GameLift.RoutingStrategy
import GameLift.StringDoubleMap
import GameLift.S3Location
import GameLift.AwsCredentials
import GameLift.RuntimeConfiguration
import GameLift.ResourceCreationLimitPolicy
import GameLift.CertificateConfiguration
import GameLift.PlayerDataMap
import GameLift.GameSessionPlacement
import GameLift.EC2InstanceCounts
import GameLift.InstanceAccess
import GameLift.InstanceCredentials
import GameLift.GameSessionConnectionInfo
import GameLift.PlayerAttributeMap
import GameLift.LatencyMap
import GameLift.AttributeValue
import GameLift.TargetConfiguration
import GameLift.VpcPeeringConnectionStatus

typealias AliasId = String

typealias AliasList = Array<Alias>

typealias AmazonResourceName = String

typealias ArnStringModel = String

typealias BooleanModel = Boolean

typealias BuildArn = String

typealias BuildId = String

typealias BuildList = Array<Build>

typealias CustomEventData = String

typealias DesiredPlayerSessionList = Array<DesiredPlayerSession>

typealias DnsName = String

typealias Double = Number

typealias DoubleObject = Number

typealias EC2InstanceLimitList = Array<EC2InstanceLimit>

typealias EventList = Array<Event>

typealias FleetActionList = Array<String /* "AUTO_SCALING" | String */>

typealias FleetAttributesList = Array<FleetAttributes>

typealias FleetCapacityList = Array<FleetCapacity>

typealias FleetId = String

typealias FleetIdList = Array<FleetId>

typealias FleetUtilizationList = Array<FleetUtilization>

typealias Float = Number

typealias FreeText = String

typealias GamePropertyKey = String

typealias GamePropertyList = Array<GameProperty>

typealias GamePropertyValue = String

typealias GameSessionActivationTimeoutSeconds = Number

typealias GameSessionData = String

typealias GameSessionDetailList = Array<GameSessionDetail>

typealias GameSessionList = Array<GameSession>

typealias GameSessionQueueDestinationList = Array<GameSessionQueueDestination>

typealias GameSessionQueueList = Array<GameSessionQueue>

typealias GameSessionQueueName = String

typealias GameSessionQueueNameList = Array<GameSessionQueueName>

typealias IdStringModel = String

typealias InstanceId = String

typealias InstanceList = Array<Instance>

typealias Integer = Number

typealias IpAddress = String

typealias IpPermissionsList = Array<IpPermission>

typealias MatchedPlayerSessionList = Array<MatchedPlayerSession>

typealias MatchmakerData = String

typealias MatchmakingAcceptanceTimeoutInteger = Number

typealias MatchmakingConfigurationArn = String

typealias MatchmakingConfigurationList = Array<MatchmakingConfiguration>

typealias MatchmakingConfigurationName = String

typealias MatchmakingConfigurationNameList = Array<MatchmakingConfigurationName>

typealias MatchmakingIdList = Array<MatchmakingIdStringModel>

typealias MatchmakingIdStringModel = String

typealias MatchmakingRequestTimeoutInteger = Number

typealias MatchmakingRuleSetArn = String

typealias MatchmakingRuleSetList = Array<MatchmakingRuleSet>

typealias MatchmakingRuleSetName = String

typealias MatchmakingRuleSetNameList = Array<MatchmakingRuleSetName>

typealias MatchmakingTicketList = Array<MatchmakingTicket>

typealias MaxConcurrentGameSessionActivations = Number

typealias MetricGroup = String

typealias MetricGroupList = Array<MetricGroup>

typealias NonBlankAndLengthConstraintString = String

typealias NonBlankString = String

typealias NonEmptyString = String

typealias NonZeroAndMaxString = String

typealias PlacedPlayerSessionList = Array<PlacedPlayerSession>

typealias PlayerData = String

typealias PlayerIdList = Array<NonZeroAndMaxString>

typealias PlayerLatencyList = Array<PlayerLatency>

typealias PlayerLatencyPolicyList = Array<PlayerLatencyPolicy>

typealias PlayerList = Array<Player>

typealias PlayerSessionId = String

typealias PlayerSessionList = Array<PlayerSession>

typealias PortNumber = Number

typealias PositiveInteger = Number

typealias PositiveLong = Number

typealias QueueArnsList = Array<ArnStringModel>

typealias RuleSetBody = String

typealias RuleSetLimit = Number

typealias ScalingPolicyList = Array<ScalingPolicy>

typealias ScriptArn = String

typealias ScriptId = String

typealias ScriptList = Array<Script>

typealias ServerProcessList = Array<ServerProcess>

typealias SnsArnStringModel = String

typealias StringList = Array<NonZeroAndMaxString>

typealias StringModel = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias Timestamp = Date

typealias VpcPeeringAuthorizationList = Array<VpcPeeringAuthorization>

typealias VpcPeeringConnectionList = Array<VpcPeeringConnection>

typealias WholeNumber = Number

@JsModule("aws-sdk")
external open class GameLift(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & GameLift.Types.ClientConfiguration */
    open fun acceptMatch(params: AcceptMatchInput, callback: (err: AWSError, data: AcceptMatchOutput) -> Unit = definedExternally): Request<AcceptMatchOutput, AWSError>
    open fun acceptMatch(callback: (err: AWSError, data: AcceptMatchOutput) -> Unit = definedExternally): Request<AcceptMatchOutput, AWSError>
    open fun createAlias(params: CreateAliasInput, callback: (err: AWSError, data: CreateAliasOutput) -> Unit = definedExternally): Request<CreateAliasOutput, AWSError>
    open fun createAlias(callback: (err: AWSError, data: CreateAliasOutput) -> Unit = definedExternally): Request<CreateAliasOutput, AWSError>
    open fun createBuild(params: CreateBuildInput, callback: (err: AWSError, data: CreateBuildOutput) -> Unit = definedExternally): Request<CreateBuildOutput, AWSError>
    open fun createBuild(callback: (err: AWSError, data: CreateBuildOutput) -> Unit = definedExternally): Request<CreateBuildOutput, AWSError>
    open fun createFleet(params: CreateFleetInput, callback: (err: AWSError, data: CreateFleetOutput) -> Unit = definedExternally): Request<CreateFleetOutput, AWSError>
    open fun createFleet(callback: (err: AWSError, data: CreateFleetOutput) -> Unit = definedExternally): Request<CreateFleetOutput, AWSError>
    open fun createGameSession(params: CreateGameSessionInput, callback: (err: AWSError, data: CreateGameSessionOutput) -> Unit = definedExternally): Request<CreateGameSessionOutput, AWSError>
    open fun createGameSession(callback: (err: AWSError, data: CreateGameSessionOutput) -> Unit = definedExternally): Request<CreateGameSessionOutput, AWSError>
    open fun createGameSessionQueue(params: CreateGameSessionQueueInput, callback: (err: AWSError, data: CreateGameSessionQueueOutput) -> Unit = definedExternally): Request<CreateGameSessionQueueOutput, AWSError>
    open fun createGameSessionQueue(callback: (err: AWSError, data: CreateGameSessionQueueOutput) -> Unit = definedExternally): Request<CreateGameSessionQueueOutput, AWSError>
    open fun createMatchmakingConfiguration(params: CreateMatchmakingConfigurationInput, callback: (err: AWSError, data: CreateMatchmakingConfigurationOutput) -> Unit = definedExternally): Request<CreateMatchmakingConfigurationOutput, AWSError>
    open fun createMatchmakingConfiguration(callback: (err: AWSError, data: CreateMatchmakingConfigurationOutput) -> Unit = definedExternally): Request<CreateMatchmakingConfigurationOutput, AWSError>
    open fun createMatchmakingRuleSet(params: CreateMatchmakingRuleSetInput, callback: (err: AWSError, data: CreateMatchmakingRuleSetOutput) -> Unit = definedExternally): Request<CreateMatchmakingRuleSetOutput, AWSError>
    open fun createMatchmakingRuleSet(callback: (err: AWSError, data: CreateMatchmakingRuleSetOutput) -> Unit = definedExternally): Request<CreateMatchmakingRuleSetOutput, AWSError>
    open fun createPlayerSession(params: CreatePlayerSessionInput, callback: (err: AWSError, data: CreatePlayerSessionOutput) -> Unit = definedExternally): Request<CreatePlayerSessionOutput, AWSError>
    open fun createPlayerSession(callback: (err: AWSError, data: CreatePlayerSessionOutput) -> Unit = definedExternally): Request<CreatePlayerSessionOutput, AWSError>
    open fun createPlayerSessions(params: CreatePlayerSessionsInput, callback: (err: AWSError, data: CreatePlayerSessionsOutput) -> Unit = definedExternally): Request<CreatePlayerSessionsOutput, AWSError>
    open fun createPlayerSessions(callback: (err: AWSError, data: CreatePlayerSessionsOutput) -> Unit = definedExternally): Request<CreatePlayerSessionsOutput, AWSError>
    open fun createScript(params: CreateScriptInput, callback: (err: AWSError, data: CreateScriptOutput) -> Unit = definedExternally): Request<CreateScriptOutput, AWSError>
    open fun createScript(callback: (err: AWSError, data: CreateScriptOutput) -> Unit = definedExternally): Request<CreateScriptOutput, AWSError>
    open fun createVpcPeeringAuthorization(params: CreateVpcPeeringAuthorizationInput, callback: (err: AWSError, data: CreateVpcPeeringAuthorizationOutput) -> Unit = definedExternally): Request<CreateVpcPeeringAuthorizationOutput, AWSError>
    open fun createVpcPeeringAuthorization(callback: (err: AWSError, data: CreateVpcPeeringAuthorizationOutput) -> Unit = definedExternally): Request<CreateVpcPeeringAuthorizationOutput, AWSError>
    open fun createVpcPeeringConnection(params: CreateVpcPeeringConnectionInput, callback: (err: AWSError, data: CreateVpcPeeringConnectionOutput) -> Unit = definedExternally): Request<CreateVpcPeeringConnectionOutput, AWSError>
    open fun createVpcPeeringConnection(callback: (err: AWSError, data: CreateVpcPeeringConnectionOutput) -> Unit = definedExternally): Request<CreateVpcPeeringConnectionOutput, AWSError>
    open fun deleteAlias(params: DeleteAliasInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAlias(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteBuild(params: DeleteBuildInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteBuild(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteFleet(params: DeleteFleetInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteFleet(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteGameSessionQueue(params: DeleteGameSessionQueueInput, callback: (err: AWSError, data: DeleteGameSessionQueueOutput) -> Unit = definedExternally): Request<DeleteGameSessionQueueOutput, AWSError>
    open fun deleteGameSessionQueue(callback: (err: AWSError, data: DeleteGameSessionQueueOutput) -> Unit = definedExternally): Request<DeleteGameSessionQueueOutput, AWSError>
    open fun deleteMatchmakingConfiguration(params: DeleteMatchmakingConfigurationInput, callback: (err: AWSError, data: DeleteMatchmakingConfigurationOutput) -> Unit = definedExternally): Request<DeleteMatchmakingConfigurationOutput, AWSError>
    open fun deleteMatchmakingConfiguration(callback: (err: AWSError, data: DeleteMatchmakingConfigurationOutput) -> Unit = definedExternally): Request<DeleteMatchmakingConfigurationOutput, AWSError>
    open fun deleteMatchmakingRuleSet(params: DeleteMatchmakingRuleSetInput, callback: (err: AWSError, data: DeleteMatchmakingRuleSetOutput) -> Unit = definedExternally): Request<DeleteMatchmakingRuleSetOutput, AWSError>
    open fun deleteMatchmakingRuleSet(callback: (err: AWSError, data: DeleteMatchmakingRuleSetOutput) -> Unit = definedExternally): Request<DeleteMatchmakingRuleSetOutput, AWSError>
    open fun deleteScalingPolicy(params: DeleteScalingPolicyInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteScalingPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteScript(params: DeleteScriptInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteScript(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVpcPeeringAuthorization(params: DeleteVpcPeeringAuthorizationInput, callback: (err: AWSError, data: DeleteVpcPeeringAuthorizationOutput) -> Unit = definedExternally): Request<DeleteVpcPeeringAuthorizationOutput, AWSError>
    open fun deleteVpcPeeringAuthorization(callback: (err: AWSError, data: DeleteVpcPeeringAuthorizationOutput) -> Unit = definedExternally): Request<DeleteVpcPeeringAuthorizationOutput, AWSError>
    open fun deleteVpcPeeringConnection(params: DeleteVpcPeeringConnectionInput, callback: (err: AWSError, data: DeleteVpcPeeringConnectionOutput) -> Unit = definedExternally): Request<DeleteVpcPeeringConnectionOutput, AWSError>
    open fun deleteVpcPeeringConnection(callback: (err: AWSError, data: DeleteVpcPeeringConnectionOutput) -> Unit = definedExternally): Request<DeleteVpcPeeringConnectionOutput, AWSError>
    open fun describeAlias(params: DescribeAliasInput, callback: (err: AWSError, data: DescribeAliasOutput) -> Unit = definedExternally): Request<DescribeAliasOutput, AWSError>
    open fun describeAlias(callback: (err: AWSError, data: DescribeAliasOutput) -> Unit = definedExternally): Request<DescribeAliasOutput, AWSError>
    open fun describeBuild(params: DescribeBuildInput, callback: (err: AWSError, data: DescribeBuildOutput) -> Unit = definedExternally): Request<DescribeBuildOutput, AWSError>
    open fun describeBuild(callback: (err: AWSError, data: DescribeBuildOutput) -> Unit = definedExternally): Request<DescribeBuildOutput, AWSError>
    open fun describeEC2InstanceLimits(params: DescribeEC2InstanceLimitsInput, callback: (err: AWSError, data: DescribeEC2InstanceLimitsOutput) -> Unit = definedExternally): Request<DescribeEC2InstanceLimitsOutput, AWSError>
    open fun describeEC2InstanceLimits(callback: (err: AWSError, data: DescribeEC2InstanceLimitsOutput) -> Unit = definedExternally): Request<DescribeEC2InstanceLimitsOutput, AWSError>
    open fun describeFleetAttributes(params: DescribeFleetAttributesInput, callback: (err: AWSError, data: DescribeFleetAttributesOutput) -> Unit = definedExternally): Request<DescribeFleetAttributesOutput, AWSError>
    open fun describeFleetAttributes(callback: (err: AWSError, data: DescribeFleetAttributesOutput) -> Unit = definedExternally): Request<DescribeFleetAttributesOutput, AWSError>
    open fun describeFleetCapacity(params: DescribeFleetCapacityInput, callback: (err: AWSError, data: DescribeFleetCapacityOutput) -> Unit = definedExternally): Request<DescribeFleetCapacityOutput, AWSError>
    open fun describeFleetCapacity(callback: (err: AWSError, data: DescribeFleetCapacityOutput) -> Unit = definedExternally): Request<DescribeFleetCapacityOutput, AWSError>
    open fun describeFleetEvents(params: DescribeFleetEventsInput, callback: (err: AWSError, data: DescribeFleetEventsOutput) -> Unit = definedExternally): Request<DescribeFleetEventsOutput, AWSError>
    open fun describeFleetEvents(callback: (err: AWSError, data: DescribeFleetEventsOutput) -> Unit = definedExternally): Request<DescribeFleetEventsOutput, AWSError>
    open fun describeFleetPortSettings(params: DescribeFleetPortSettingsInput, callback: (err: AWSError, data: DescribeFleetPortSettingsOutput) -> Unit = definedExternally): Request<DescribeFleetPortSettingsOutput, AWSError>
    open fun describeFleetPortSettings(callback: (err: AWSError, data: DescribeFleetPortSettingsOutput) -> Unit = definedExternally): Request<DescribeFleetPortSettingsOutput, AWSError>
    open fun describeFleetUtilization(params: DescribeFleetUtilizationInput, callback: (err: AWSError, data: DescribeFleetUtilizationOutput) -> Unit = definedExternally): Request<DescribeFleetUtilizationOutput, AWSError>
    open fun describeFleetUtilization(callback: (err: AWSError, data: DescribeFleetUtilizationOutput) -> Unit = definedExternally): Request<DescribeFleetUtilizationOutput, AWSError>
    open fun describeGameSessionDetails(params: DescribeGameSessionDetailsInput, callback: (err: AWSError, data: DescribeGameSessionDetailsOutput) -> Unit = definedExternally): Request<DescribeGameSessionDetailsOutput, AWSError>
    open fun describeGameSessionDetails(callback: (err: AWSError, data: DescribeGameSessionDetailsOutput) -> Unit = definedExternally): Request<DescribeGameSessionDetailsOutput, AWSError>
    open fun describeGameSessionPlacement(params: DescribeGameSessionPlacementInput, callback: (err: AWSError, data: DescribeGameSessionPlacementOutput) -> Unit = definedExternally): Request<DescribeGameSessionPlacementOutput, AWSError>
    open fun describeGameSessionPlacement(callback: (err: AWSError, data: DescribeGameSessionPlacementOutput) -> Unit = definedExternally): Request<DescribeGameSessionPlacementOutput, AWSError>
    open fun describeGameSessionQueues(params: DescribeGameSessionQueuesInput, callback: (err: AWSError, data: DescribeGameSessionQueuesOutput) -> Unit = definedExternally): Request<DescribeGameSessionQueuesOutput, AWSError>
    open fun describeGameSessionQueues(callback: (err: AWSError, data: DescribeGameSessionQueuesOutput) -> Unit = definedExternally): Request<DescribeGameSessionQueuesOutput, AWSError>
    open fun describeGameSessions(params: DescribeGameSessionsInput, callback: (err: AWSError, data: DescribeGameSessionsOutput) -> Unit = definedExternally): Request<DescribeGameSessionsOutput, AWSError>
    open fun describeGameSessions(callback: (err: AWSError, data: DescribeGameSessionsOutput) -> Unit = definedExternally): Request<DescribeGameSessionsOutput, AWSError>
    open fun describeInstances(params: DescribeInstancesInput, callback: (err: AWSError, data: DescribeInstancesOutput) -> Unit = definedExternally): Request<DescribeInstancesOutput, AWSError>
    open fun describeInstances(callback: (err: AWSError, data: DescribeInstancesOutput) -> Unit = definedExternally): Request<DescribeInstancesOutput, AWSError>
    open fun describeMatchmaking(params: DescribeMatchmakingInput, callback: (err: AWSError, data: DescribeMatchmakingOutput) -> Unit = definedExternally): Request<DescribeMatchmakingOutput, AWSError>
    open fun describeMatchmaking(callback: (err: AWSError, data: DescribeMatchmakingOutput) -> Unit = definedExternally): Request<DescribeMatchmakingOutput, AWSError>
    open fun describeMatchmakingConfigurations(params: DescribeMatchmakingConfigurationsInput, callback: (err: AWSError, data: DescribeMatchmakingConfigurationsOutput) -> Unit = definedExternally): Request<DescribeMatchmakingConfigurationsOutput, AWSError>
    open fun describeMatchmakingConfigurations(callback: (err: AWSError, data: DescribeMatchmakingConfigurationsOutput) -> Unit = definedExternally): Request<DescribeMatchmakingConfigurationsOutput, AWSError>
    open fun describeMatchmakingRuleSets(params: DescribeMatchmakingRuleSetsInput, callback: (err: AWSError, data: DescribeMatchmakingRuleSetsOutput) -> Unit = definedExternally): Request<DescribeMatchmakingRuleSetsOutput, AWSError>
    open fun describeMatchmakingRuleSets(callback: (err: AWSError, data: DescribeMatchmakingRuleSetsOutput) -> Unit = definedExternally): Request<DescribeMatchmakingRuleSetsOutput, AWSError>
    open fun describePlayerSessions(params: DescribePlayerSessionsInput, callback: (err: AWSError, data: DescribePlayerSessionsOutput) -> Unit = definedExternally): Request<DescribePlayerSessionsOutput, AWSError>
    open fun describePlayerSessions(callback: (err: AWSError, data: DescribePlayerSessionsOutput) -> Unit = definedExternally): Request<DescribePlayerSessionsOutput, AWSError>
    open fun describeRuntimeConfiguration(params: DescribeRuntimeConfigurationInput, callback: (err: AWSError, data: DescribeRuntimeConfigurationOutput) -> Unit = definedExternally): Request<DescribeRuntimeConfigurationOutput, AWSError>
    open fun describeRuntimeConfiguration(callback: (err: AWSError, data: DescribeRuntimeConfigurationOutput) -> Unit = definedExternally): Request<DescribeRuntimeConfigurationOutput, AWSError>
    open fun describeScalingPolicies(params: DescribeScalingPoliciesInput, callback: (err: AWSError, data: DescribeScalingPoliciesOutput) -> Unit = definedExternally): Request<DescribeScalingPoliciesOutput, AWSError>
    open fun describeScalingPolicies(callback: (err: AWSError, data: DescribeScalingPoliciesOutput) -> Unit = definedExternally): Request<DescribeScalingPoliciesOutput, AWSError>
    open fun describeScript(params: DescribeScriptInput, callback: (err: AWSError, data: DescribeScriptOutput) -> Unit = definedExternally): Request<DescribeScriptOutput, AWSError>
    open fun describeScript(callback: (err: AWSError, data: DescribeScriptOutput) -> Unit = definedExternally): Request<DescribeScriptOutput, AWSError>
    open fun describeVpcPeeringAuthorizations(params: DescribeVpcPeeringAuthorizationsInput, callback: (err: AWSError, data: DescribeVpcPeeringAuthorizationsOutput) -> Unit = definedExternally): Request<DescribeVpcPeeringAuthorizationsOutput, AWSError>
    open fun describeVpcPeeringAuthorizations(callback: (err: AWSError, data: DescribeVpcPeeringAuthorizationsOutput) -> Unit = definedExternally): Request<DescribeVpcPeeringAuthorizationsOutput, AWSError>
    open fun describeVpcPeeringConnections(params: DescribeVpcPeeringConnectionsInput, callback: (err: AWSError, data: DescribeVpcPeeringConnectionsOutput) -> Unit = definedExternally): Request<DescribeVpcPeeringConnectionsOutput, AWSError>
    open fun describeVpcPeeringConnections(callback: (err: AWSError, data: DescribeVpcPeeringConnectionsOutput) -> Unit = definedExternally): Request<DescribeVpcPeeringConnectionsOutput, AWSError>
    open fun getGameSessionLogUrl(params: GetGameSessionLogUrlInput, callback: (err: AWSError, data: GetGameSessionLogUrlOutput) -> Unit = definedExternally): Request<GetGameSessionLogUrlOutput, AWSError>
    open fun getGameSessionLogUrl(callback: (err: AWSError, data: GetGameSessionLogUrlOutput) -> Unit = definedExternally): Request<GetGameSessionLogUrlOutput, AWSError>
    open fun getInstanceAccess(params: GetInstanceAccessInput, callback: (err: AWSError, data: GetInstanceAccessOutput) -> Unit = definedExternally): Request<GetInstanceAccessOutput, AWSError>
    open fun getInstanceAccess(callback: (err: AWSError, data: GetInstanceAccessOutput) -> Unit = definedExternally): Request<GetInstanceAccessOutput, AWSError>
    open fun listAliases(params: ListAliasesInput, callback: (err: AWSError, data: ListAliasesOutput) -> Unit = definedExternally): Request<ListAliasesOutput, AWSError>
    open fun listAliases(callback: (err: AWSError, data: ListAliasesOutput) -> Unit = definedExternally): Request<ListAliasesOutput, AWSError>
    open fun listBuilds(params: ListBuildsInput, callback: (err: AWSError, data: ListBuildsOutput) -> Unit = definedExternally): Request<ListBuildsOutput, AWSError>
    open fun listBuilds(callback: (err: AWSError, data: ListBuildsOutput) -> Unit = definedExternally): Request<ListBuildsOutput, AWSError>
    open fun listFleets(params: ListFleetsInput, callback: (err: AWSError, data: ListFleetsOutput) -> Unit = definedExternally): Request<ListFleetsOutput, AWSError>
    open fun listFleets(callback: (err: AWSError, data: ListFleetsOutput) -> Unit = definedExternally): Request<ListFleetsOutput, AWSError>
    open fun listScripts(params: ListScriptsInput, callback: (err: AWSError, data: ListScriptsOutput) -> Unit = definedExternally): Request<ListScriptsOutput, AWSError>
    open fun listScripts(callback: (err: AWSError, data: ListScriptsOutput) -> Unit = definedExternally): Request<ListScriptsOutput, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun putScalingPolicy(params: PutScalingPolicyInput, callback: (err: AWSError, data: PutScalingPolicyOutput) -> Unit = definedExternally): Request<PutScalingPolicyOutput, AWSError>
    open fun putScalingPolicy(callback: (err: AWSError, data: PutScalingPolicyOutput) -> Unit = definedExternally): Request<PutScalingPolicyOutput, AWSError>
    open fun requestUploadCredentials(params: RequestUploadCredentialsInput, callback: (err: AWSError, data: RequestUploadCredentialsOutput) -> Unit = definedExternally): Request<RequestUploadCredentialsOutput, AWSError>
    open fun requestUploadCredentials(callback: (err: AWSError, data: RequestUploadCredentialsOutput) -> Unit = definedExternally): Request<RequestUploadCredentialsOutput, AWSError>
    open fun resolveAlias(params: ResolveAliasInput, callback: (err: AWSError, data: ResolveAliasOutput) -> Unit = definedExternally): Request<ResolveAliasOutput, AWSError>
    open fun resolveAlias(callback: (err: AWSError, data: ResolveAliasOutput) -> Unit = definedExternally): Request<ResolveAliasOutput, AWSError>
    open fun searchGameSessions(params: SearchGameSessionsInput, callback: (err: AWSError, data: SearchGameSessionsOutput) -> Unit = definedExternally): Request<SearchGameSessionsOutput, AWSError>
    open fun searchGameSessions(callback: (err: AWSError, data: SearchGameSessionsOutput) -> Unit = definedExternally): Request<SearchGameSessionsOutput, AWSError>
    open fun startFleetActions(params: StartFleetActionsInput, callback: (err: AWSError, data: StartFleetActionsOutput) -> Unit = definedExternally): Request<StartFleetActionsOutput, AWSError>
    open fun startFleetActions(callback: (err: AWSError, data: StartFleetActionsOutput) -> Unit = definedExternally): Request<StartFleetActionsOutput, AWSError>
    open fun startGameSessionPlacement(params: StartGameSessionPlacementInput, callback: (err: AWSError, data: StartGameSessionPlacementOutput) -> Unit = definedExternally): Request<StartGameSessionPlacementOutput, AWSError>
    open fun startGameSessionPlacement(callback: (err: AWSError, data: StartGameSessionPlacementOutput) -> Unit = definedExternally): Request<StartGameSessionPlacementOutput, AWSError>
    open fun startMatchBackfill(params: StartMatchBackfillInput, callback: (err: AWSError, data: StartMatchBackfillOutput) -> Unit = definedExternally): Request<StartMatchBackfillOutput, AWSError>
    open fun startMatchBackfill(callback: (err: AWSError, data: StartMatchBackfillOutput) -> Unit = definedExternally): Request<StartMatchBackfillOutput, AWSError>
    open fun startMatchmaking(params: StartMatchmakingInput, callback: (err: AWSError, data: StartMatchmakingOutput) -> Unit = definedExternally): Request<StartMatchmakingOutput, AWSError>
    open fun startMatchmaking(callback: (err: AWSError, data: StartMatchmakingOutput) -> Unit = definedExternally): Request<StartMatchmakingOutput, AWSError>
    open fun stopFleetActions(params: StopFleetActionsInput, callback: (err: AWSError, data: StopFleetActionsOutput) -> Unit = definedExternally): Request<StopFleetActionsOutput, AWSError>
    open fun stopFleetActions(callback: (err: AWSError, data: StopFleetActionsOutput) -> Unit = definedExternally): Request<StopFleetActionsOutput, AWSError>
    open fun stopGameSessionPlacement(params: StopGameSessionPlacementInput, callback: (err: AWSError, data: StopGameSessionPlacementOutput) -> Unit = definedExternally): Request<StopGameSessionPlacementOutput, AWSError>
    open fun stopGameSessionPlacement(callback: (err: AWSError, data: StopGameSessionPlacementOutput) -> Unit = definedExternally): Request<StopGameSessionPlacementOutput, AWSError>
    open fun stopMatchmaking(params: StopMatchmakingInput, callback: (err: AWSError, data: StopMatchmakingOutput) -> Unit = definedExternally): Request<StopMatchmakingOutput, AWSError>
    open fun stopMatchmaking(callback: (err: AWSError, data: StopMatchmakingOutput) -> Unit = definedExternally): Request<StopMatchmakingOutput, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateAlias(params: UpdateAliasInput, callback: (err: AWSError, data: UpdateAliasOutput) -> Unit = definedExternally): Request<UpdateAliasOutput, AWSError>
    open fun updateAlias(callback: (err: AWSError, data: UpdateAliasOutput) -> Unit = definedExternally): Request<UpdateAliasOutput, AWSError>
    open fun updateBuild(params: UpdateBuildInput, callback: (err: AWSError, data: UpdateBuildOutput) -> Unit = definedExternally): Request<UpdateBuildOutput, AWSError>
    open fun updateBuild(callback: (err: AWSError, data: UpdateBuildOutput) -> Unit = definedExternally): Request<UpdateBuildOutput, AWSError>
    open fun updateFleetAttributes(params: UpdateFleetAttributesInput, callback: (err: AWSError, data: UpdateFleetAttributesOutput) -> Unit = definedExternally): Request<UpdateFleetAttributesOutput, AWSError>
    open fun updateFleetAttributes(callback: (err: AWSError, data: UpdateFleetAttributesOutput) -> Unit = definedExternally): Request<UpdateFleetAttributesOutput, AWSError>
    open fun updateFleetCapacity(params: UpdateFleetCapacityInput, callback: (err: AWSError, data: UpdateFleetCapacityOutput) -> Unit = definedExternally): Request<UpdateFleetCapacityOutput, AWSError>
    open fun updateFleetCapacity(callback: (err: AWSError, data: UpdateFleetCapacityOutput) -> Unit = definedExternally): Request<UpdateFleetCapacityOutput, AWSError>
    open fun updateFleetPortSettings(params: UpdateFleetPortSettingsInput, callback: (err: AWSError, data: UpdateFleetPortSettingsOutput) -> Unit = definedExternally): Request<UpdateFleetPortSettingsOutput, AWSError>
    open fun updateFleetPortSettings(callback: (err: AWSError, data: UpdateFleetPortSettingsOutput) -> Unit = definedExternally): Request<UpdateFleetPortSettingsOutput, AWSError>
    open fun updateGameSession(params: UpdateGameSessionInput, callback: (err: AWSError, data: UpdateGameSessionOutput) -> Unit = definedExternally): Request<UpdateGameSessionOutput, AWSError>
    open fun updateGameSession(callback: (err: AWSError, data: UpdateGameSessionOutput) -> Unit = definedExternally): Request<UpdateGameSessionOutput, AWSError>
    open fun updateGameSessionQueue(params: UpdateGameSessionQueueInput, callback: (err: AWSError, data: UpdateGameSessionQueueOutput) -> Unit = definedExternally): Request<UpdateGameSessionQueueOutput, AWSError>
    open fun updateGameSessionQueue(callback: (err: AWSError, data: UpdateGameSessionQueueOutput) -> Unit = definedExternally): Request<UpdateGameSessionQueueOutput, AWSError>
    open fun updateMatchmakingConfiguration(params: UpdateMatchmakingConfigurationInput, callback: (err: AWSError, data: UpdateMatchmakingConfigurationOutput) -> Unit = definedExternally): Request<UpdateMatchmakingConfigurationOutput, AWSError>
    open fun updateMatchmakingConfiguration(callback: (err: AWSError, data: UpdateMatchmakingConfigurationOutput) -> Unit = definedExternally): Request<UpdateMatchmakingConfigurationOutput, AWSError>
    open fun updateRuntimeConfiguration(params: UpdateRuntimeConfigurationInput, callback: (err: AWSError, data: UpdateRuntimeConfigurationOutput) -> Unit = definedExternally): Request<UpdateRuntimeConfigurationOutput, AWSError>
    open fun updateRuntimeConfiguration(callback: (err: AWSError, data: UpdateRuntimeConfigurationOutput) -> Unit = definedExternally): Request<UpdateRuntimeConfigurationOutput, AWSError>
    open fun updateScript(params: UpdateScriptInput, callback: (err: AWSError, data: UpdateScriptOutput) -> Unit = definedExternally): Request<UpdateScriptOutput, AWSError>
    open fun updateScript(callback: (err: AWSError, data: UpdateScriptOutput) -> Unit = definedExternally): Request<UpdateScriptOutput, AWSError>
    open fun validateMatchmakingRuleSet(params: ValidateMatchmakingRuleSetInput, callback: (err: AWSError, data: ValidateMatchmakingRuleSetOutput) -> Unit = definedExternally): Request<ValidateMatchmakingRuleSetOutput, AWSError>
    open fun validateMatchmakingRuleSet(callback: (err: AWSError, data: ValidateMatchmakingRuleSetOutput) -> Unit = definedExternally): Request<ValidateMatchmakingRuleSetOutput, AWSError>
    interface AcceptMatchInput {
        var TicketId: MatchmakingIdStringModel
        var PlayerIds: StringList
        var AcceptanceType: String /* "ACCEPT" | "REJECT" | String */
    }
    interface AcceptMatchOutput
    interface Alias {
        var AliasId: AliasId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NonBlankAndLengthConstraintString?
            get() = definedExternally
            set(value) = definedExternally
        var AliasArn: ArnStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var Description: FreeText?
            get() = definedExternally
            set(value) = definedExternally
        var RoutingStrategy: RoutingStrategy?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttributeValue {
        var S: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var N: DoubleObject?
            get() = definedExternally
            set(value) = definedExternally
        var SL: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var SDM: StringDoubleMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsCredentials {
        var AccessKeyId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var SecretAccessKey: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var SessionToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Build {
        var BuildId: BuildId?
            get() = definedExternally
            set(value) = definedExternally
        var BuildArn: BuildArn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: FreeText?
            get() = definedExternally
            set(value) = definedExternally
        var Version: FreeText?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "INITIALIZED" | "READY" | "FAILED" | String */
        var SizeOnDisk: PositiveLong?
            get() = definedExternally
            set(value) = definedExternally
        var OperatingSystem: String /* "WINDOWS_2012" | "AMAZON_LINUX" | "AMAZON_LINUX_2" | String */
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CertificateConfiguration {
        var CertificateType: String /* "DISABLED" | "GENERATED" | String */
    }
    interface CreateAliasInput {
        var Name: NonBlankAndLengthConstraintString
        var Description: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var RoutingStrategy: RoutingStrategy
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAliasOutput {
        var Alias: Alias?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBuildInput {
        var Name: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var Version: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var StorageLocation: S3Location?
            get() = definedExternally
            set(value) = definedExternally
        var OperatingSystem: String /* "WINDOWS_2012" | "AMAZON_LINUX" | "AMAZON_LINUX_2" | String */
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBuildOutput {
        var Build: Build?
            get() = definedExternally
            set(value) = definedExternally
        var UploadCredentials: AwsCredentials?
            get() = definedExternally
            set(value) = definedExternally
        var StorageLocation: S3Location?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFleetInput {
        var Name: NonZeroAndMaxString
        var Description: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var BuildId: BuildId?
            get() = definedExternally
            set(value) = definedExternally
        var ScriptId: ScriptId?
            get() = definedExternally
            set(value) = definedExternally
        var ServerLaunchPath: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var ServerLaunchParameters: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var LogPaths: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var EC2InstanceType: String /* "t2.micro" | "t2.small" | "t2.medium" | "t2.large" | "c3.large" | "c3.xlarge" | "c3.2xlarge" | "c3.4xlarge" | "c3.8xlarge" | "c4.large" | "c4.xlarge" | "c4.2xlarge" | "c4.4xlarge" | "c4.8xlarge" | "c5.large" | "c5.xlarge" | "c5.2xlarge" | "c5.4xlarge" | "c5.9xlarge" | "c5.12xlarge" | "c5.18xlarge" | "c5.24xlarge" | "r3.large" | "r3.xlarge" | "r3.2xlarge" | "r3.4xlarge" | "r3.8xlarge" | "r4.large" | "r4.xlarge" | "r4.2xlarge" | "r4.4xlarge" | "r4.8xlarge" | "r4.16xlarge" | "r5.large" | "r5.xlarge" | "r5.2xlarge" | "r5.4xlarge" | "r5.8xlarge" | "r5.12xlarge" | "r5.16xlarge" | "r5.24xlarge" | "m3.medium" | "m3.large" | "m3.xlarge" | "m3.2xlarge" | "m4.large" | "m4.xlarge" | "m4.2xlarge" | "m4.4xlarge" | "m4.10xlarge" | "m5.large" | "m5.xlarge" | "m5.2xlarge" | "m5.4xlarge" | "m5.8xlarge" | "m5.12xlarge" | "m5.16xlarge" | "m5.24xlarge" | String */
        var EC2InboundPermissions: IpPermissionsList?
            get() = definedExternally
            set(value) = definedExternally
        var NewGameSessionProtectionPolicy: String /* "NoProtection" | "FullProtection" | String */
        var RuntimeConfiguration: RuntimeConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceCreationLimitPolicy: ResourceCreationLimitPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var MetricGroups: MetricGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var PeerVpcAwsAccountId: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var PeerVpcId: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var FleetType: String /* "ON_DEMAND" | "SPOT" | String */
        var InstanceRoleArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateConfiguration: CertificateConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFleetOutput {
        var FleetAttributes: FleetAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGameSessionInput {
        var FleetId: FleetId?
            get() = definedExternally
            set(value) = definedExternally
        var AliasId: AliasId?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumPlayerSessionCount: WholeNumber
        var Name: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var GameProperties: GamePropertyList?
            get() = definedExternally
            set(value) = definedExternally
        var CreatorId: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var GameSessionId: IdStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var IdempotencyToken: IdStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var GameSessionData: GameSessionData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGameSessionOutput {
        var GameSession: GameSession?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGameSessionQueueInput {
        var Name: GameSessionQueueName
        var TimeoutInSeconds: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var PlayerLatencyPolicies: PlayerLatencyPolicyList?
            get() = definedExternally
            set(value) = definedExternally
        var Destinations: GameSessionQueueDestinationList?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGameSessionQueueOutput {
        var GameSessionQueue: GameSessionQueue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateMatchmakingConfigurationInput {
        var Name: MatchmakingIdStringModel
        var Description: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var GameSessionQueueArns: QueueArnsList
        var RequestTimeoutSeconds: MatchmakingRequestTimeoutInteger
        var AcceptanceTimeoutSeconds: MatchmakingAcceptanceTimeoutInteger?
            get() = definedExternally
            set(value) = definedExternally
        var AcceptanceRequired: BooleanModel
        var RuleSetName: MatchmakingRuleSetName
        var NotificationTarget: SnsArnStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var AdditionalPlayerCount: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var CustomEventData: CustomEventData?
            get() = definedExternally
            set(value) = definedExternally
        var GameProperties: GamePropertyList?
            get() = definedExternally
            set(value) = definedExternally
        var GameSessionData: GameSessionData?
            get() = definedExternally
            set(value) = definedExternally
        var BackfillMode: String /* "AUTOMATIC" | "MANUAL" | String */
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateMatchmakingConfigurationOutput {
        var Configuration: MatchmakingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateMatchmakingRuleSetInput {
        var Name: MatchmakingIdStringModel
        var RuleSetBody: RuleSetBody
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateMatchmakingRuleSetOutput {
        var RuleSet: MatchmakingRuleSet
    }
    interface CreatePlayerSessionInput {
        var GameSessionId: ArnStringModel
        var PlayerId: NonZeroAndMaxString
        var PlayerData: PlayerData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePlayerSessionOutput {
        var PlayerSession: PlayerSession?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePlayerSessionsInput {
        var GameSessionId: ArnStringModel
        var PlayerIds: PlayerIdList
        var PlayerDataMap: PlayerDataMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePlayerSessionsOutput {
        var PlayerSessions: PlayerSessionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateScriptInput {
        var Name: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var Version: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var StorageLocation: S3Location?
            get() = definedExternally
            set(value) = definedExternally
        var ZipFile: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateScriptOutput {
        var Script: Script?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateVpcPeeringAuthorizationInput {
        var GameLiftAwsAccountId: NonZeroAndMaxString
        var PeerVpcId: NonZeroAndMaxString
    }
    interface CreateVpcPeeringAuthorizationOutput {
        var VpcPeeringAuthorization: VpcPeeringAuthorization?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateVpcPeeringConnectionInput {
        var FleetId: FleetId
        var PeerVpcAwsAccountId: NonZeroAndMaxString
        var PeerVpcId: NonZeroAndMaxString
    }
    interface CreateVpcPeeringConnectionOutput
    interface DeleteAliasInput {
        var AliasId: AliasId
    }
    interface DeleteBuildInput {
        var BuildId: BuildId
    }
    interface DeleteFleetInput {
        var FleetId: FleetId
    }
    interface DeleteGameSessionQueueInput {
        var Name: GameSessionQueueName
    }
    interface DeleteGameSessionQueueOutput
    interface DeleteMatchmakingConfigurationInput {
        var Name: MatchmakingConfigurationName
    }
    interface DeleteMatchmakingConfigurationOutput
    interface DeleteMatchmakingRuleSetInput {
        var Name: MatchmakingRuleSetName
    }
    interface DeleteMatchmakingRuleSetOutput
    interface DeleteScalingPolicyInput {
        var Name: NonZeroAndMaxString
        var FleetId: FleetId
    }
    interface DeleteScriptInput {
        var ScriptId: ScriptId
    }
    interface DeleteVpcPeeringAuthorizationInput {
        var GameLiftAwsAccountId: NonZeroAndMaxString
        var PeerVpcId: NonZeroAndMaxString
    }
    interface DeleteVpcPeeringAuthorizationOutput
    interface DeleteVpcPeeringConnectionInput {
        var FleetId: FleetId
        var VpcPeeringConnectionId: NonZeroAndMaxString
    }
    interface DeleteVpcPeeringConnectionOutput
    interface DescribeAliasInput {
        var AliasId: AliasId
    }
    interface DescribeAliasOutput {
        var Alias: Alias?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeBuildInput {
        var BuildId: BuildId
    }
    interface DescribeBuildOutput {
        var Build: Build?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEC2InstanceLimitsInput {
        var EC2InstanceType: String /* "t2.micro" | "t2.small" | "t2.medium" | "t2.large" | "c3.large" | "c3.xlarge" | "c3.2xlarge" | "c3.4xlarge" | "c3.8xlarge" | "c4.large" | "c4.xlarge" | "c4.2xlarge" | "c4.4xlarge" | "c4.8xlarge" | "c5.large" | "c5.xlarge" | "c5.2xlarge" | "c5.4xlarge" | "c5.9xlarge" | "c5.12xlarge" | "c5.18xlarge" | "c5.24xlarge" | "r3.large" | "r3.xlarge" | "r3.2xlarge" | "r3.4xlarge" | "r3.8xlarge" | "r4.large" | "r4.xlarge" | "r4.2xlarge" | "r4.4xlarge" | "r4.8xlarge" | "r4.16xlarge" | "r5.large" | "r5.xlarge" | "r5.2xlarge" | "r5.4xlarge" | "r5.8xlarge" | "r5.12xlarge" | "r5.16xlarge" | "r5.24xlarge" | "m3.medium" | "m3.large" | "m3.xlarge" | "m3.2xlarge" | "m4.large" | "m4.xlarge" | "m4.2xlarge" | "m4.4xlarge" | "m4.10xlarge" | "m5.large" | "m5.xlarge" | "m5.2xlarge" | "m5.4xlarge" | "m5.8xlarge" | "m5.12xlarge" | "m5.16xlarge" | "m5.24xlarge" | String */
    }
    interface DescribeEC2InstanceLimitsOutput {
        var EC2InstanceLimits: EC2InstanceLimitList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFleetAttributesInput {
        var FleetIds: FleetIdList?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFleetAttributesOutput {
        var FleetAttributes: FleetAttributesList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFleetCapacityInput {
        var FleetIds: FleetIdList?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFleetCapacityOutput {
        var FleetCapacity: FleetCapacityList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFleetEventsInput {
        var FleetId: FleetId
        var StartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFleetEventsOutput {
        var Events: EventList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFleetPortSettingsInput {
        var FleetId: FleetId
    }
    interface DescribeFleetPortSettingsOutput {
        var InboundPermissions: IpPermissionsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFleetUtilizationInput {
        var FleetIds: FleetIdList?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFleetUtilizationOutput {
        var FleetUtilization: FleetUtilizationList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeGameSessionDetailsInput {
        var FleetId: FleetId?
            get() = definedExternally
            set(value) = definedExternally
        var GameSessionId: ArnStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var AliasId: AliasId?
            get() = definedExternally
            set(value) = definedExternally
        var StatusFilter: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeGameSessionDetailsOutput {
        var GameSessionDetails: GameSessionDetailList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeGameSessionPlacementInput {
        var PlacementId: IdStringModel
    }
    interface DescribeGameSessionPlacementOutput {
        var GameSessionPlacement: GameSessionPlacement?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeGameSessionQueuesInput {
        var Names: GameSessionQueueNameList?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeGameSessionQueuesOutput {
        var GameSessionQueues: GameSessionQueueList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeGameSessionsInput {
        var FleetId: FleetId?
            get() = definedExternally
            set(value) = definedExternally
        var GameSessionId: ArnStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var AliasId: AliasId?
            get() = definedExternally
            set(value) = definedExternally
        var StatusFilter: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeGameSessionsOutput {
        var GameSessions: GameSessionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInstancesInput {
        var FleetId: FleetId
        var InstanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInstancesOutput {
        var Instances: InstanceList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMatchmakingConfigurationsInput {
        var Names: MatchmakingConfigurationNameList?
            get() = definedExternally
            set(value) = definedExternally
        var RuleSetName: MatchmakingRuleSetName?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMatchmakingConfigurationsOutput {
        var Configurations: MatchmakingConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMatchmakingInput {
        var TicketIds: MatchmakingIdList
    }
    interface DescribeMatchmakingOutput {
        var TicketList: MatchmakingTicketList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMatchmakingRuleSetsInput {
        var Names: MatchmakingRuleSetNameList?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: RuleSetLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMatchmakingRuleSetsOutput {
        var RuleSets: MatchmakingRuleSetList
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePlayerSessionsInput {
        var GameSessionId: ArnStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var PlayerId: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var PlayerSessionId: PlayerSessionId?
            get() = definedExternally
            set(value) = definedExternally
        var PlayerSessionStatusFilter: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePlayerSessionsOutput {
        var PlayerSessions: PlayerSessionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRuntimeConfigurationInput {
        var FleetId: FleetId
    }
    interface DescribeRuntimeConfigurationOutput {
        var RuntimeConfiguration: RuntimeConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeScalingPoliciesInput {
        var FleetId: FleetId
        var StatusFilter: String /* "ACTIVE" | "UPDATE_REQUESTED" | "UPDATING" | "DELETE_REQUESTED" | "DELETING" | "DELETED" | "ERROR" | String */
        var Limit: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeScalingPoliciesOutput {
        var ScalingPolicies: ScalingPolicyList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeScriptInput {
        var ScriptId: ScriptId
    }
    interface DescribeScriptOutput {
        var Script: Script?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeVpcPeeringAuthorizationsInput
    interface DescribeVpcPeeringAuthorizationsOutput {
        var VpcPeeringAuthorizations: VpcPeeringAuthorizationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeVpcPeeringConnectionsInput {
        var FleetId: FleetId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeVpcPeeringConnectionsOutput {
        var VpcPeeringConnections: VpcPeeringConnectionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DesiredPlayerSession {
        var PlayerId: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var PlayerData: PlayerData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EC2InstanceCounts {
        var DESIRED: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var MINIMUM: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var MAXIMUM: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var PENDING: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var ACTIVE: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var IDLE: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var TERMINATING: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EC2InstanceLimit {
        var EC2InstanceType: String /* "t2.micro" | "t2.small" | "t2.medium" | "t2.large" | "c3.large" | "c3.xlarge" | "c3.2xlarge" | "c3.4xlarge" | "c3.8xlarge" | "c4.large" | "c4.xlarge" | "c4.2xlarge" | "c4.4xlarge" | "c4.8xlarge" | "c5.large" | "c5.xlarge" | "c5.2xlarge" | "c5.4xlarge" | "c5.9xlarge" | "c5.12xlarge" | "c5.18xlarge" | "c5.24xlarge" | "r3.large" | "r3.xlarge" | "r3.2xlarge" | "r3.4xlarge" | "r3.8xlarge" | "r4.large" | "r4.xlarge" | "r4.2xlarge" | "r4.4xlarge" | "r4.8xlarge" | "r4.16xlarge" | "r5.large" | "r5.xlarge" | "r5.2xlarge" | "r5.4xlarge" | "r5.8xlarge" | "r5.12xlarge" | "r5.16xlarge" | "r5.24xlarge" | "m3.medium" | "m3.large" | "m3.xlarge" | "m3.2xlarge" | "m4.large" | "m4.xlarge" | "m4.2xlarge" | "m4.4xlarge" | "m4.10xlarge" | "m5.large" | "m5.xlarge" | "m5.2xlarge" | "m5.4xlarge" | "m5.8xlarge" | "m5.12xlarge" | "m5.16xlarge" | "m5.24xlarge" | String */
        var CurrentInstances: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceLimit: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Event {
        var EventId: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var EventCode: String /* "GENERIC_EVENT" | "FLEET_CREATED" | "FLEET_DELETED" | "FLEET_SCALING_EVENT" | "FLEET_STATE_DOWNLOADING" | "FLEET_STATE_VALIDATING" | "FLEET_STATE_BUILDING" | "FLEET_STATE_ACTIVATING" | "FLEET_STATE_ACTIVE" | "FLEET_STATE_ERROR" | "FLEET_INITIALIZATION_FAILED" | "FLEET_BINARY_DOWNLOAD_FAILED" | "FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND" | "FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE" | "FLEET_VALIDATION_TIMED_OUT" | "FLEET_ACTIVATION_FAILED" | "FLEET_ACTIVATION_FAILED_NO_INSTANCES" | "FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED" | "SERVER_PROCESS_INVALID_PATH" | "SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT" | "SERVER_PROCESS_PROCESS_READY_TIMEOUT" | "SERVER_PROCESS_CRASHED" | "SERVER_PROCESS_TERMINATED_UNHEALTHY" | "SERVER_PROCESS_FORCE_TERMINATED" | "SERVER_PROCESS_PROCESS_EXIT_TIMEOUT" | "GAME_SESSION_ACTIVATION_TIMEOUT" | "FLEET_CREATION_EXTRACTING_BUILD" | "FLEET_CREATION_RUNNING_INSTALLER" | "FLEET_CREATION_VALIDATING_RUNTIME_CONFIG" | "FLEET_VPC_PEERING_SUCCEEDED" | "FLEET_VPC_PEERING_FAILED" | "FLEET_VPC_PEERING_DELETED" | "INSTANCE_INTERRUPTED" | String */
        var Message: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var EventTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var PreSignedLogUrl: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FleetAttributes {
        var FleetId: FleetId?
            get() = definedExternally
            set(value) = definedExternally
        var FleetArn: ArnStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var FleetType: String /* "ON_DEMAND" | "SPOT" | String */
        var InstanceType: String /* "t2.micro" | "t2.small" | "t2.medium" | "t2.large" | "c3.large" | "c3.xlarge" | "c3.2xlarge" | "c3.4xlarge" | "c3.8xlarge" | "c4.large" | "c4.xlarge" | "c4.2xlarge" | "c4.4xlarge" | "c4.8xlarge" | "c5.large" | "c5.xlarge" | "c5.2xlarge" | "c5.4xlarge" | "c5.9xlarge" | "c5.12xlarge" | "c5.18xlarge" | "c5.24xlarge" | "r3.large" | "r3.xlarge" | "r3.2xlarge" | "r3.4xlarge" | "r3.8xlarge" | "r4.large" | "r4.xlarge" | "r4.2xlarge" | "r4.4xlarge" | "r4.8xlarge" | "r4.16xlarge" | "r5.large" | "r5.xlarge" | "r5.2xlarge" | "r5.4xlarge" | "r5.8xlarge" | "r5.12xlarge" | "r5.16xlarge" | "r5.24xlarge" | "m3.medium" | "m3.large" | "m3.xlarge" | "m3.2xlarge" | "m4.large" | "m4.xlarge" | "m4.2xlarge" | "m4.4xlarge" | "m4.10xlarge" | "m5.large" | "m5.xlarge" | "m5.2xlarge" | "m5.4xlarge" | "m5.8xlarge" | "m5.12xlarge" | "m5.16xlarge" | "m5.24xlarge" | String */
        var Description: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TerminationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "NEW" | "DOWNLOADING" | "VALIDATING" | "BUILDING" | "ACTIVATING" | "ACTIVE" | "DELETING" | "ERROR" | "TERMINATED" | String */
        var BuildId: BuildId?
            get() = definedExternally
            set(value) = definedExternally
        var BuildArn: BuildArn?
            get() = definedExternally
            set(value) = definedExternally
        var ScriptId: ScriptId?
            get() = definedExternally
            set(value) = definedExternally
        var ScriptArn: ScriptArn?
            get() = definedExternally
            set(value) = definedExternally
        var ServerLaunchPath: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var ServerLaunchParameters: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var LogPaths: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var NewGameSessionProtectionPolicy: String /* "NoProtection" | "FullProtection" | String */
        var OperatingSystem: String /* "WINDOWS_2012" | "AMAZON_LINUX" | "AMAZON_LINUX_2" | String */
        var ResourceCreationLimitPolicy: ResourceCreationLimitPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var MetricGroups: MetricGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var StoppedActions: FleetActionList?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceRoleArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateConfiguration: CertificateConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FleetCapacity {
        var FleetId: FleetId?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: String /* "t2.micro" | "t2.small" | "t2.medium" | "t2.large" | "c3.large" | "c3.xlarge" | "c3.2xlarge" | "c3.4xlarge" | "c3.8xlarge" | "c4.large" | "c4.xlarge" | "c4.2xlarge" | "c4.4xlarge" | "c4.8xlarge" | "c5.large" | "c5.xlarge" | "c5.2xlarge" | "c5.4xlarge" | "c5.9xlarge" | "c5.12xlarge" | "c5.18xlarge" | "c5.24xlarge" | "r3.large" | "r3.xlarge" | "r3.2xlarge" | "r3.4xlarge" | "r3.8xlarge" | "r4.large" | "r4.xlarge" | "r4.2xlarge" | "r4.4xlarge" | "r4.8xlarge" | "r4.16xlarge" | "r5.large" | "r5.xlarge" | "r5.2xlarge" | "r5.4xlarge" | "r5.8xlarge" | "r5.12xlarge" | "r5.16xlarge" | "r5.24xlarge" | "m3.medium" | "m3.large" | "m3.xlarge" | "m3.2xlarge" | "m4.large" | "m4.xlarge" | "m4.2xlarge" | "m4.4xlarge" | "m4.10xlarge" | "m5.large" | "m5.xlarge" | "m5.2xlarge" | "m5.4xlarge" | "m5.8xlarge" | "m5.12xlarge" | "m5.16xlarge" | "m5.24xlarge" | String */
        var InstanceCounts: EC2InstanceCounts?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FleetUtilization {
        var FleetId: FleetId?
            get() = definedExternally
            set(value) = definedExternally
        var ActiveServerProcessCount: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var ActiveGameSessionCount: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentPlayerSessionCount: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumPlayerSessionCount: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GameProperty {
        var Key: GamePropertyKey
        var Value: GamePropertyValue
    }
    interface GameSession {
        var GameSessionId: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var FleetId: FleetId?
            get() = definedExternally
            set(value) = definedExternally
        var FleetArn: ArnStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TerminationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentPlayerSessionCount: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumPlayerSessionCount: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "ACTIVE" | "ACTIVATING" | "TERMINATED" | "TERMINATING" | "ERROR" | String */
        var StatusReason: String /* "INTERRUPTED" | String */
        var GameProperties: GamePropertyList?
            get() = definedExternally
            set(value) = definedExternally
        var IpAddress: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
        var DnsName: DnsName?
            get() = definedExternally
            set(value) = definedExternally
        var Port: PortNumber?
            get() = definedExternally
            set(value) = definedExternally
        var PlayerSessionCreationPolicy: String /* "ACCEPT_ALL" | "DENY_ALL" | String */
        var CreatorId: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var GameSessionData: GameSessionData?
            get() = definedExternally
            set(value) = definedExternally
        var MatchmakerData: MatchmakerData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GameSessionConnectionInfo {
        var GameSessionArn: ArnStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var IpAddress: StringModel?
            get() = definedExternally
            set(value) = definedExternally
        var DnsName: DnsName?
            get() = definedExternally
            set(value) = definedExternally
        var Port: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var MatchedPlayerSessions: MatchedPlayerSessionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GameSessionDetail {
        var GameSession: GameSession?
            get() = definedExternally
            set(value) = definedExternally
        var ProtectionPolicy: String /* "NoProtection" | "FullProtection" | String */
    }
    interface GameSessionPlacement {
        var PlacementId: IdStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var GameSessionQueueName: GameSessionQueueName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "FULFILLED" | "CANCELLED" | "TIMED_OUT" | "FAILED" | String */
        var GameProperties: GamePropertyList?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumPlayerSessionCount: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var GameSessionName: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var GameSessionId: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var GameSessionArn: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var GameSessionRegion: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var PlayerLatencies: PlayerLatencyList?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var IpAddress: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
        var DnsName: DnsName?
            get() = definedExternally
            set(value) = definedExternally
        var Port: PortNumber?
            get() = definedExternally
            set(value) = definedExternally
        var PlacedPlayerSessions: PlacedPlayerSessionList?
            get() = definedExternally
            set(value) = definedExternally
        var GameSessionData: GameSessionData?
            get() = definedExternally
            set(value) = definedExternally
        var MatchmakerData: MatchmakerData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GameSessionQueue {
        var Name: GameSessionQueueName?
            get() = definedExternally
            set(value) = definedExternally
        var GameSessionQueueArn: ArnStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var TimeoutInSeconds: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var PlayerLatencyPolicies: PlayerLatencyPolicyList?
            get() = definedExternally
            set(value) = definedExternally
        var Destinations: GameSessionQueueDestinationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GameSessionQueueDestination {
        var DestinationArn: ArnStringModel?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetGameSessionLogUrlInput {
        var GameSessionId: ArnStringModel
    }
    interface GetGameSessionLogUrlOutput {
        var PreSignedUrl: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInstanceAccessInput {
        var FleetId: FleetId
        var InstanceId: InstanceId
    }
    interface GetInstanceAccessOutput {
        var InstanceAccess: InstanceAccess?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Instance {
        var FleetId: FleetId?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var IpAddress: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
        var DnsName: DnsName?
            get() = definedExternally
            set(value) = definedExternally
        var OperatingSystem: String /* "WINDOWS_2012" | "AMAZON_LINUX" | "AMAZON_LINUX_2" | String */
        var Type: String /* "t2.micro" | "t2.small" | "t2.medium" | "t2.large" | "c3.large" | "c3.xlarge" | "c3.2xlarge" | "c3.4xlarge" | "c3.8xlarge" | "c4.large" | "c4.xlarge" | "c4.2xlarge" | "c4.4xlarge" | "c4.8xlarge" | "c5.large" | "c5.xlarge" | "c5.2xlarge" | "c5.4xlarge" | "c5.9xlarge" | "c5.12xlarge" | "c5.18xlarge" | "c5.24xlarge" | "r3.large" | "r3.xlarge" | "r3.2xlarge" | "r3.4xlarge" | "r3.8xlarge" | "r4.large" | "r4.xlarge" | "r4.2xlarge" | "r4.4xlarge" | "r4.8xlarge" | "r4.16xlarge" | "r5.large" | "r5.xlarge" | "r5.2xlarge" | "r5.4xlarge" | "r5.8xlarge" | "r5.12xlarge" | "r5.16xlarge" | "r5.24xlarge" | "m3.medium" | "m3.large" | "m3.xlarge" | "m3.2xlarge" | "m4.large" | "m4.xlarge" | "m4.2xlarge" | "m4.4xlarge" | "m4.10xlarge" | "m5.large" | "m5.xlarge" | "m5.2xlarge" | "m5.4xlarge" | "m5.8xlarge" | "m5.12xlarge" | "m5.16xlarge" | "m5.24xlarge" | String */
        var Status: String /* "PENDING" | "ACTIVE" | "TERMINATING" | String */
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceAccess {
        var FleetId: FleetId?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var IpAddress: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
        var OperatingSystem: String /* "WINDOWS_2012" | "AMAZON_LINUX" | "AMAZON_LINUX_2" | String */
        var Credentials: InstanceCredentials?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceCredentials {
        var UserName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Secret: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IpPermission {
        var FromPort: PortNumber
        var ToPort: PortNumber
        var IpRange: NonBlankString
        var Protocol: String /* "TCP" | "UDP" | String */
    }
    interface LatencyMap {
        @nativeGetter
        operator fun get(key: String): PositiveInteger?
        @nativeSetter
        operator fun set(key: String, value: PositiveInteger)
    }
    interface ListAliasesInput {
        var RoutingStrategyType: String /* "SIMPLE" | "TERMINAL" | String */
        var Name: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAliasesOutput {
        var Aliases: AliasList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBuildsInput {
        var Status: String /* "INITIALIZED" | "READY" | "FAILED" | String */
        var Limit: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBuildsOutput {
        var Builds: BuildList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFleetsInput {
        var BuildId: BuildId?
            get() = definedExternally
            set(value) = definedExternally
        var ScriptId: ScriptId?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFleetsOutput {
        var FleetIds: FleetIdList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListScriptsInput {
        var Limit: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListScriptsOutput {
        var Scripts: ScriptList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceARN: AmazonResourceName
    }
    interface ListTagsForResourceResponse {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MatchedPlayerSession {
        var PlayerId: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var PlayerSessionId: PlayerSessionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MatchmakingConfiguration {
        var Name: MatchmakingIdStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationArn: MatchmakingConfigurationArn?
            get() = definedExternally
            set(value) = definedExternally
        var Description: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var GameSessionQueueArns: QueueArnsList?
            get() = definedExternally
            set(value) = definedExternally
        var RequestTimeoutSeconds: MatchmakingRequestTimeoutInteger?
            get() = definedExternally
            set(value) = definedExternally
        var AcceptanceTimeoutSeconds: MatchmakingAcceptanceTimeoutInteger?
            get() = definedExternally
            set(value) = definedExternally
        var AcceptanceRequired: BooleanModel?
            get() = definedExternally
            set(value) = definedExternally
        var RuleSetName: MatchmakingIdStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var RuleSetArn: MatchmakingRuleSetArn?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationTarget: SnsArnStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var AdditionalPlayerCount: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var CustomEventData: CustomEventData?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var GameProperties: GamePropertyList?
            get() = definedExternally
            set(value) = definedExternally
        var GameSessionData: GameSessionData?
            get() = definedExternally
            set(value) = definedExternally
        var BackfillMode: String /* "AUTOMATIC" | "MANUAL" | String */
    }
    interface MatchmakingRuleSet {
        var RuleSetName: MatchmakingIdStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var RuleSetArn: MatchmakingRuleSetArn?
            get() = definedExternally
            set(value) = definedExternally
        var RuleSetBody: RuleSetBody
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MatchmakingTicket {
        var TicketId: MatchmakingIdStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationName: MatchmakingIdStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationArn: MatchmakingConfigurationArn?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CANCELLED" | "COMPLETED" | "FAILED" | "PLACING" | "QUEUED" | "REQUIRES_ACCEPTANCE" | "SEARCHING" | "TIMED_OUT" | String */
        var StatusReason: StringModel?
            get() = definedExternally
            set(value) = definedExternally
        var StatusMessage: StringModel?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Players: PlayerList?
            get() = definedExternally
            set(value) = definedExternally
        var GameSessionConnectionInfo: GameSessionConnectionInfo?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedWaitTime: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PlacedPlayerSession {
        var PlayerId: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var PlayerSessionId: PlayerSessionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Player {
        var PlayerId: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var PlayerAttributes: PlayerAttributeMap?
            get() = definedExternally
            set(value) = definedExternally
        var Team: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var LatencyInMs: LatencyMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PlayerAttributeMap {
        @nativeGetter
        operator fun get(key: String): AttributeValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeValue)
    }
    interface PlayerDataMap {
        @nativeGetter
        operator fun get(key: String): PlayerData?
        @nativeSetter
        operator fun set(key: String, value: PlayerData)
    }
    interface PlayerLatency {
        var PlayerId: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var RegionIdentifier: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var LatencyInMilliseconds: Float?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PlayerLatencyPolicy {
        var MaximumIndividualPlayerLatencyMilliseconds: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyDurationSeconds: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PlayerSession {
        var PlayerSessionId: PlayerSessionId?
            get() = definedExternally
            set(value) = definedExternally
        var PlayerId: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var GameSessionId: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var FleetId: FleetId?
            get() = definedExternally
            set(value) = definedExternally
        var FleetArn: ArnStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TerminationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "RESERVED" | "ACTIVE" | "COMPLETED" | "TIMEDOUT" | String */
        var IpAddress: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
        var DnsName: DnsName?
            get() = definedExternally
            set(value) = definedExternally
        var Port: PortNumber?
            get() = definedExternally
            set(value) = definedExternally
        var PlayerData: PlayerData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutScalingPolicyInput {
        var Name: NonZeroAndMaxString
        var FleetId: FleetId
        var ScalingAdjustment: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ScalingAdjustmentType: String /* "ChangeInCapacity" | "ExactCapacity" | "PercentChangeInCapacity" | String */
        var Threshold: Double?
            get() = definedExternally
            set(value) = definedExternally
        var ComparisonOperator: String /* "GreaterThanOrEqualToThreshold" | "GreaterThanThreshold" | "LessThanThreshold" | "LessThanOrEqualToThreshold" | String */
        var EvaluationPeriods: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var MetricName: String /* "ActivatingGameSessions" | "ActiveGameSessions" | "ActiveInstances" | "AvailableGameSessions" | "AvailablePlayerSessions" | "CurrentPlayerSessions" | "IdleInstances" | "PercentAvailableGameSessions" | "PercentIdleInstances" | "QueueDepth" | "WaitTime" | String */
        var PolicyType: String /* "RuleBased" | "TargetBased" | String */
        var TargetConfiguration: TargetConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutScalingPolicyOutput {
        var Name: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RequestUploadCredentialsInput {
        var BuildId: BuildId
    }
    interface RequestUploadCredentialsOutput {
        var UploadCredentials: AwsCredentials?
            get() = definedExternally
            set(value) = definedExternally
        var StorageLocation: S3Location?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResolveAliasInput {
        var AliasId: AliasId
    }
    interface ResolveAliasOutput {
        var FleetId: FleetId?
            get() = definedExternally
            set(value) = definedExternally
        var FleetArn: ArnStringModel?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceCreationLimitPolicy {
        var NewGameSessionsPerCreator: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyPeriodInMinutes: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RoutingStrategy {
        var Type: String /* "SIMPLE" | "TERMINAL" | String */
        var FleetId: FleetId?
            get() = definedExternally
            set(value) = definedExternally
        var Message: FreeText?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RuntimeConfiguration {
        var ServerProcesses: ServerProcessList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxConcurrentGameSessionActivations: MaxConcurrentGameSessionActivations?
            get() = definedExternally
            set(value) = definedExternally
        var GameSessionActivationTimeoutSeconds: GameSessionActivationTimeoutSeconds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3Location {
        var Bucket: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Key: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var ObjectVersion: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScalingPolicy {
        var FleetId: FleetId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "ACTIVE" | "UPDATE_REQUESTED" | "UPDATING" | "DELETE_REQUESTED" | "DELETING" | "DELETED" | "ERROR" | String */
        var ScalingAdjustment: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ScalingAdjustmentType: String /* "ChangeInCapacity" | "ExactCapacity" | "PercentChangeInCapacity" | String */
        var ComparisonOperator: String /* "GreaterThanOrEqualToThreshold" | "GreaterThanThreshold" | "LessThanThreshold" | "LessThanOrEqualToThreshold" | String */
        var Threshold: Double?
            get() = definedExternally
            set(value) = definedExternally
        var EvaluationPeriods: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var MetricName: String /* "ActivatingGameSessions" | "ActiveGameSessions" | "ActiveInstances" | "AvailableGameSessions" | "AvailablePlayerSessions" | "CurrentPlayerSessions" | "IdleInstances" | "PercentAvailableGameSessions" | "PercentIdleInstances" | "QueueDepth" | "WaitTime" | String */
        var PolicyType: String /* "RuleBased" | "TargetBased" | String */
        var TargetConfiguration: TargetConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Script {
        var ScriptId: ScriptId?
            get() = definedExternally
            set(value) = definedExternally
        var ScriptArn: ScriptArn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var Version: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var SizeOnDisk: PositiveLong?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var StorageLocation: S3Location?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchGameSessionsInput {
        var FleetId: FleetId?
            get() = definedExternally
            set(value) = definedExternally
        var AliasId: AliasId?
            get() = definedExternally
            set(value) = definedExternally
        var FilterExpression: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var SortExpression: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchGameSessionsOutput {
        var GameSessions: GameSessionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServerProcess {
        var LaunchPath: NonZeroAndMaxString
        var Parameters: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var ConcurrentExecutions: PositiveInteger
    }
    interface StartFleetActionsInput {
        var FleetId: FleetId
        var Actions: FleetActionList
    }
    interface StartFleetActionsOutput
    interface StartGameSessionPlacementInput {
        var PlacementId: IdStringModel
        var GameSessionQueueName: GameSessionQueueName
        var GameProperties: GamePropertyList?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumPlayerSessionCount: WholeNumber
        var GameSessionName: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var PlayerLatencies: PlayerLatencyList?
            get() = definedExternally
            set(value) = definedExternally
        var DesiredPlayerSessions: DesiredPlayerSessionList?
            get() = definedExternally
            set(value) = definedExternally
        var GameSessionData: GameSessionData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartGameSessionPlacementOutput {
        var GameSessionPlacement: GameSessionPlacement?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartMatchBackfillInput {
        var TicketId: MatchmakingIdStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationName: MatchmakingConfigurationName
        var GameSessionArn: ArnStringModel
        var Players: PlayerList
    }
    interface StartMatchBackfillOutput {
        var MatchmakingTicket: MatchmakingTicket?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartMatchmakingInput {
        var TicketId: MatchmakingIdStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationName: MatchmakingConfigurationName
        var Players: PlayerList
    }
    interface StartMatchmakingOutput {
        var MatchmakingTicket: MatchmakingTicket?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopFleetActionsInput {
        var FleetId: FleetId
        var Actions: FleetActionList
    }
    interface StopFleetActionsOutput
    interface StopGameSessionPlacementInput {
        var PlacementId: IdStringModel
    }
    interface StopGameSessionPlacementOutput {
        var GameSessionPlacement: GameSessionPlacement?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopMatchmakingInput {
        var TicketId: MatchmakingIdStringModel
    }
    interface StopMatchmakingOutput
    interface StringDoubleMap {
        @nativeGetter
        operator fun get(key: String): DoubleObject?
        @nativeSetter
        operator fun set(key: String, value: DoubleObject)
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface TagResourceRequest {
        var ResourceARN: AmazonResourceName
        var Tags: TagList
    }
    interface TagResourceResponse
    interface TargetConfiguration {
        var TargetValue: Double
    }
    interface UntagResourceRequest {
        var ResourceARN: AmazonResourceName
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateAliasInput {
        var AliasId: AliasId
        var Name: NonBlankAndLengthConstraintString?
            get() = definedExternally
            set(value) = definedExternally
        var Description: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var RoutingStrategy: RoutingStrategy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateAliasOutput {
        var Alias: Alias?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateBuildInput {
        var BuildId: BuildId
        var Name: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var Version: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateBuildOutput {
        var Build: Build?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFleetAttributesInput {
        var FleetId: FleetId
        var Name: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var Description: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var NewGameSessionProtectionPolicy: String /* "NoProtection" | "FullProtection" | String */
        var ResourceCreationLimitPolicy: ResourceCreationLimitPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var MetricGroups: MetricGroupList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFleetAttributesOutput {
        var FleetId: FleetId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFleetCapacityInput {
        var FleetId: FleetId
        var DesiredInstances: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var MinSize: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var MaxSize: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFleetCapacityOutput {
        var FleetId: FleetId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFleetPortSettingsInput {
        var FleetId: FleetId
        var InboundPermissionAuthorizations: IpPermissionsList?
            get() = definedExternally
            set(value) = definedExternally
        var InboundPermissionRevocations: IpPermissionsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFleetPortSettingsOutput {
        var FleetId: FleetId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGameSessionInput {
        var GameSessionId: ArnStringModel
        var MaximumPlayerSessionCount: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var PlayerSessionCreationPolicy: String /* "ACCEPT_ALL" | "DENY_ALL" | String */
        var ProtectionPolicy: String /* "NoProtection" | "FullProtection" | String */
    }
    interface UpdateGameSessionOutput {
        var GameSession: GameSession?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGameSessionQueueInput {
        var Name: GameSessionQueueName
        var TimeoutInSeconds: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var PlayerLatencyPolicies: PlayerLatencyPolicyList?
            get() = definedExternally
            set(value) = definedExternally
        var Destinations: GameSessionQueueDestinationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGameSessionQueueOutput {
        var GameSessionQueue: GameSessionQueue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMatchmakingConfigurationInput {
        var Name: MatchmakingConfigurationName
        var Description: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var GameSessionQueueArns: QueueArnsList?
            get() = definedExternally
            set(value) = definedExternally
        var RequestTimeoutSeconds: MatchmakingRequestTimeoutInteger?
            get() = definedExternally
            set(value) = definedExternally
        var AcceptanceTimeoutSeconds: MatchmakingAcceptanceTimeoutInteger?
            get() = definedExternally
            set(value) = definedExternally
        var AcceptanceRequired: BooleanModel?
            get() = definedExternally
            set(value) = definedExternally
        var RuleSetName: MatchmakingRuleSetName?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationTarget: SnsArnStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var AdditionalPlayerCount: WholeNumber?
            get() = definedExternally
            set(value) = definedExternally
        var CustomEventData: CustomEventData?
            get() = definedExternally
            set(value) = definedExternally
        var GameProperties: GamePropertyList?
            get() = definedExternally
            set(value) = definedExternally
        var GameSessionData: GameSessionData?
            get() = definedExternally
            set(value) = definedExternally
        var BackfillMode: String /* "AUTOMATIC" | "MANUAL" | String */
    }
    interface UpdateMatchmakingConfigurationOutput {
        var Configuration: MatchmakingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRuntimeConfigurationInput {
        var FleetId: FleetId
        var RuntimeConfiguration: RuntimeConfiguration
    }
    interface UpdateRuntimeConfigurationOutput {
        var RuntimeConfiguration: RuntimeConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateScriptInput {
        var ScriptId: ScriptId
        var Name: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var Version: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var StorageLocation: S3Location?
            get() = definedExternally
            set(value) = definedExternally
        var ZipFile: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateScriptOutput {
        var Script: Script?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ValidateMatchmakingRuleSetInput {
        var RuleSetBody: RuleSetBody
    }
    interface ValidateMatchmakingRuleSetOutput {
        var Valid: BooleanModel?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VpcPeeringAuthorization {
        var GameLiftAwsAccountId: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var PeerVpcAwsAccountId: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var PeerVpcId: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ExpirationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VpcPeeringConnection {
        var FleetId: FleetId?
            get() = definedExternally
            set(value) = definedExternally
        var FleetArn: ArnStringModel?
            get() = definedExternally
            set(value) = definedExternally
        var IpV4CidrBlock: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var VpcPeeringConnectionId: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var Status: VpcPeeringConnectionStatus?
            get() = definedExternally
            set(value) = definedExternally
        var PeerVpcId: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var GameLiftVpcId: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VpcPeeringConnectionStatus {
        var Code: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
        var Message: NonZeroAndMaxString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2015-10-01" | "latest" | String */
    }
}