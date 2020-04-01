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

external open class ConfigurationServicePlaceholders {
    open var acm: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var apigateway: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var applicationautoscaling: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var appstream: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var autoscaling: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var batch: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var budgets: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var clouddirectory: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var cloudformation: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var cloudfront: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var cloudhsm: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var cloudsearch: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var cloudsearchdomain: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var cloudtrail: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var cloudwatch: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var cloudwatchevents: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var cloudwatchlogs: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var codebuild: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var codecommit: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var codedeploy: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var codepipeline: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var cognitoidentity: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var cognitoidentityserviceprovider: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var cognitosync: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var configservice: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var cur: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var datapipeline: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var devicefarm: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var directconnect: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var directoryservice: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var discovery: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var dms: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var dynamodb: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var dynamodbstreams: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var ec2: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var ecr: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var ecs: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var efs: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var elasticache: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var elasticbeanstalk: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var elb: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var elbv2: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var emr: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var es: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var elastictranscoder: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var firehose: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var gamelift: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var glacier: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var health: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var iam: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var importexport: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var inspector: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var iot: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var iotdata: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var kinesis: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var kinesisanalytics: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var kms: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var lambda: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var lexruntime: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var lightsail: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var machinelearning: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var marketplacecommerceanalytics: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var marketplacemetering: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var mturk: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var mobileanalytics: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var opsworks: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var opsworkscm: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var organizations: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var pinpoint: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var polly: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var rds: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var redshift: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var rekognition: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var resourcegroupstaggingapi: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var route53: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var route53domains: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var s3: ServiceConfigurationOptions /* ServiceConfigurationOptions & UseDualstackConfigOptions & ClientApiVersions */
    open var s3control: ServiceConfigurationOptions /* ServiceConfigurationOptions & UseDualstackConfigOptions & ClientApiVersions */
    open var servicecatalog: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var ses: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var shield: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var simpledb: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var sms: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var snowball: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var sns: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var sqs: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var ssm: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var storagegateway: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var stepfunctions: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var sts: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var support: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var swf: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var xray: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var waf: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var wafregional: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var workdocs: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var workspaces: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var codestar: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var lexmodelbuildingservice: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var marketplaceentitlementservice: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var athena: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var greengrass: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var dax: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var migrationhub: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var cloudhsmv2: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var glue: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var mobile: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var pricing: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var costexplorer: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var mediaconvert: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var medialive: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var mediapackage: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var mediastore: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var mediastoredata: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var appsync: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var guardduty: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var mq: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var comprehend: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var iotjobsdataplane: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var kinesisvideoarchivedmedia: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var kinesisvideomedia: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var kinesisvideo: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var sagemakerruntime: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var sagemaker: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var translate: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var resourcegroups: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var alexaforbusiness: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var cloud9: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var serverlessapplicationrepository: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var servicediscovery: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var workmail: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var autoscalingplans: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var transcribeservice: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var connect: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var acmpca: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var fms: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var secretsmanager: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var iotanalytics: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var iot1clickdevicesservice: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var iot1clickprojects: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var pi: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var neptune: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var mediatailor: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var eks: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var macie: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var dlm: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var signer: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var chime: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var pinpointemail: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var ram: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var route53resolver: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var pinpointsmsvoice: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var quicksight: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var rdsdataservice: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var amplify: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var datasync: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var robomaker: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var transfer: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var globalaccelerator: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var comprehendmedical: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var kinesisanalyticsv2: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var mediaconnect: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var fsx: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var securityhub: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var appmesh: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var licensemanager: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var kafka: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var apigatewaymanagementapi: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var apigatewayv2: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var docdb: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var backup: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var worklink: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var textract: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var managedblockchain: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var mediapackagevod: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var groundstation: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var iotthingsgraph: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var iotevents: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var ioteventsdata: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var personalize: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var personalizeevents: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var personalizeruntime: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var applicationinsights: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var servicequotas: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var ec2instanceconnect: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var eventbridge: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var lakeformation: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var forecastservice: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var forecastqueryservice: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var qldb: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var qldbsession: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var workmailmessageflow: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var codestarnotifications: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var savingsplans: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var sso: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var ssooidc: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var marketplacecatalog: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var dataexchange: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var sesv2: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var migrationhubconfig: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var connectparticipant: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var appconfig: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var iotsecuretunneling: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var wafv2: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var elasticinference: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var imagebuilder: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var schemas: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var accessanalyzer: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var codegurureviewer: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var codeguruprofiler: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var computeoptimizer: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var frauddetector: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var kendra: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var networkmanager: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var outposts: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var augmentedairuntime: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var ebs: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var kinesisvideosignalingchannels: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var detective: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
    open var codestarconnections: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */
}

external interface ConfigurationServiceApiVersions {
    var acm: String /* "2015-12-08" | "latest" | String */
    var apigateway: String /* "2015-07-09" | "latest" | String */
    var applicationautoscaling: String /* "2016-02-06" | "latest" | String */
    var appstream: String /* "2016-12-01" | "latest" | String */
    var autoscaling: String /* "2011-01-01" | "latest" | String */
    var batch: String /* "2016-08-10" | "latest" | String */
    var budgets: String /* "2016-10-20" | "latest" | String */
    var clouddirectory: String /* "2016-05-10" | "2017-01-11" | "latest" | String */
    var cloudformation: String /* "2010-05-15" | "latest" | String */
    var cloudfront: String /* "2013-05-12" | "2013-11-11" | "2014-05-31" | "2014-10-21" | "2014-11-06" | "2015-04-17" | "2015-07-27" | "2015-09-17" | "2016-01-13" | "2016-01-28" | "2016-08-01" | "2016-08-20" | "2016-09-07" | "2016-09-29" | "2016-11-25" | "2017-03-25" | "2017-10-30" | "2018-06-18" | "2018-11-05" | "2019-03-26" | "latest" | String */
    var cloudhsm: String /* "2014-05-30" | "latest" | String */
    var cloudsearch: String /* "2011-02-01" | "2013-01-01" | "latest" | String */
    var cloudsearchdomain: String /* "2013-01-01" | "latest" | String */
    var cloudtrail: String /* "2013-11-01" | "latest" | String */
    var cloudwatch: String /* "2010-08-01" | "latest" | String */
    var cloudwatchevents: String /* "2014-02-03" | "2015-10-07" | "latest" | String */
    var cloudwatchlogs: String /* "2014-03-28" | "latest" | String */
    var codebuild: String /* "2016-10-06" | "latest" | String */
    var codecommit: String /* "2015-04-13" | "latest" | String */
    var codedeploy: String /* "2014-10-06" | "latest" | String */
    var codepipeline: String /* "2015-07-09" | "latest" | String */
    var cognitoidentity: String /* "2014-06-30" | "latest" | String */
    var cognitoidentityserviceprovider: String /* "2016-04-18" | "latest" | String */
    var cognitosync: String /* "2014-06-30" | "latest" | String */
    var configservice: String /* "2014-11-12" | "latest" | String */
    var cur: String /* "2017-01-06" | "latest" | String */
    var datapipeline: String /* "2012-10-29" | "latest" | String */
    var devicefarm: String /* "2015-06-23" | "latest" | String */
    var directconnect: String /* "2012-10-25" | "latest" | String */
    var directoryservice: String /* "2015-04-16" | "latest" | String */
    var discovery: String /* "2015-11-01" | "latest" | String */
    var dms: String /* "2016-01-01" | "latest" | String */
    var dynamodb: String /* "2011-12-05" | "2012-08-10" | "latest" | String */
    var dynamodbstreams: String /* "2012-08-10" | "latest" | String */
    var ec2: String /* "2013-06-15" | "2013-10-15" | "2014-02-01" | "2014-05-01" | "2014-06-15" | "2014-09-01" | "2014-10-01" | "2015-03-01" | "2015-04-15" | "2015-10-01" | "2016-04-01" | "2016-09-15" | "2016-11-15" | "latest" | String */
    var ecr: String /* "2015-09-21" | "latest" | String */
    var ecs: String /* "2014-11-13" | "latest" | String */
    var efs: String /* "2015-02-01" | "latest" | String */
    var elasticache: String /* "2012-11-15" | "2014-03-24" | "2014-07-15" | "2014-09-30" | "2015-02-02" | "latest" | String */
    var elasticbeanstalk: String /* "2010-12-01" | "latest" | String */
    var elb: String /* "2012-06-01" | "latest" | String */
    var elbv2: String /* "2015-12-01" | "latest" | String */
    var emr: String /* "2009-03-31" | "latest" | String */
    var es: String /* "2015-01-01" | "latest" | String */
    var elastictranscoder: String /* "2012-09-25" | "latest" | String */
    var firehose: String /* "2015-08-04" | "latest" | String */
    var gamelift: String /* "2015-10-01" | "latest" | String */
    var glacier: String /* "2012-06-01" | "latest" | String */
    var health: String /* "2016-08-04" | "latest" | String */
    var iam: String /* "2010-05-08" | "latest" | String */
    var importexport: String /* "2010-06-01" | "latest" | String */
    var inspector: String /* "2015-08-18" | "2016-02-16" | "latest" | String */
    var iot: String /* "2015-05-28" | "latest" | String */
    var iotdata: String /* "2015-05-28" | "latest" | String */
    var kinesis: String /* "2013-12-02" | "latest" | String */
    var kinesisanalytics: String /* "2015-08-14" | "latest" | String */
    var kms: String /* "2014-11-01" | "latest" | String */
    var lambda: String /* "2014-11-11" | "2015-03-31" | "latest" | String */
    var lexruntime: String /* "2016-11-28" | "latest" | String */
    var lightsail: String /* "2016-11-28" | "latest" | String */
    var machinelearning: String /* "2014-12-12" | "latest" | String */
    var marketplacecommerceanalytics: String /* "2015-07-01" | "latest" | String */
    var marketplacemetering: String /* "2016-01-14" | "latest" | String */
    var mturk: String /* "2017-01-17" | "latest" | String */
    var mobileanalytics: String /* "2014-06-05" | "latest" | String */
    var opsworks: String /* "2013-02-18" | "latest" | String */
    var opsworkscm: String /* "2016-11-01" | "latest" | String */
    var organizations: String /* "2016-11-28" | "latest" | String */
    var pinpoint: String /* "2016-12-01" | "latest" | String */
    var polly: String /* "2016-06-10" | "latest" | String */
    var rds: String /* "2013-01-10" | "2013-02-12" | "2013-09-09" | "2014-09-01" | "2014-10-31" | "latest" | String */
    var redshift: String /* "2012-12-01" | "latest" | String */
    var rekognition: String /* "2016-06-27" | "latest" | String */
    var resourcegroupstaggingapi: String /* "2017-01-26" | "latest" | String */
    var route53: String /* "2013-04-01" | "latest" | String */
    var route53domains: String /* "2014-05-15" | "latest" | String */
    var s3: String /* "2006-03-01" | "latest" | String */
    var s3control: String /* "2018-08-20" | "latest" | String */
    var servicecatalog: String /* "2015-12-10" | "latest" | String */
    var ses: String /* "2010-12-01" | "latest" | String */
    var shield: String /* "2016-06-02" | "latest" | String */
    var simpledb: String /* "2009-04-15" | "latest" | String */
    var sms: String /* "2016-10-24" | "latest" | String */
    var snowball: String /* "2016-06-30" | "latest" | String */
    var sns: String /* "2010-03-31" | "latest" | String */
    var sqs: String /* "2012-11-05" | "latest" | String */
    var ssm: String /* "2014-11-06" | "latest" | String */
    var storagegateway: String /* "2013-06-30" | "latest" | String */
    var stepfunctions: String /* "2016-11-23" | "latest" | String */
    var sts: String /* "2011-06-15" | "latest" | String */
    var support: String /* "2013-04-15" | "latest" | String */
    var swf: String /* "2012-01-25" | "latest" | String */
    var xray: String /* "2016-04-12" | "latest" | String */
    var waf: String /* "2015-08-24" | "latest" | String */
    var wafregional: String /* "2016-11-28" | "latest" | String */
    var workdocs: String /* "2016-05-01" | "latest" | String */
    var workspaces: String /* "2015-04-08" | "latest" | String */
    var codestar: String /* "2017-04-19" | "latest" | String */
    var lexmodelbuildingservice: String /* "2017-04-19" | "latest" | String */
    var marketplaceentitlementservice: String /* "2017-01-11" | "latest" | String */
    var athena: String /* "2017-05-18" | "latest" | String */
    var greengrass: String /* "2017-06-07" | "latest" | String */
    var dax: String /* "2017-04-19" | "latest" | String */
    var migrationhub: String /* "2017-05-31" | "latest" | String */
    var cloudhsmv2: String /* "2017-04-28" | "latest" | String */
    var glue: String /* "2017-03-31" | "latest" | String */
    var mobile: String /* "2017-07-01" | "latest" | String */
    var pricing: String /* "2017-10-15" | "latest" | String */
    var costexplorer: String /* "2017-10-25" | "latest" | String */
    var mediaconvert: String /* "2017-08-29" | "latest" | String */
    var medialive: String /* "2017-10-14" | "latest" | String */
    var mediapackage: String /* "2017-10-12" | "latest" | String */
    var mediastore: String /* "2017-09-01" | "latest" | String */
    var mediastoredata: String /* "2017-09-01" | "latest" | String */
    var appsync: String /* "2017-07-25" | "latest" | String */
    var guardduty: String /* "2017-11-28" | "latest" | String */
    var mq: String /* "2017-11-27" | "latest" | String */
    var comprehend: String /* "2017-11-27" | "latest" | String */
    var iotjobsdataplane: String /* "2017-09-29" | "latest" | String */
    var kinesisvideoarchivedmedia: String /* "2017-09-30" | "latest" | String */
    var kinesisvideomedia: String /* "2017-09-30" | "latest" | String */
    var kinesisvideo: String /* "2017-09-30" | "latest" | String */
    var sagemakerruntime: String /* "2017-05-13" | "latest" | String */
    var sagemaker: String /* "2017-07-24" | "latest" | String */
    var translate: String /* "2017-07-01" | "latest" | String */
    var resourcegroups: String /* "2017-11-27" | "latest" | String */
    var alexaforbusiness: String /* "2017-11-09" | "latest" | String */
    var cloud9: String /* "2017-09-23" | "latest" | String */
    var serverlessapplicationrepository: String /* "2017-09-08" | "latest" | String */
    var servicediscovery: String /* "2017-03-14" | "latest" | String */
    var workmail: String /* "2017-10-01" | "latest" | String */
    var autoscalingplans: String /* "2018-01-06" | "latest" | String */
    var transcribeservice: String /* "2017-10-26" | "latest" | String */
    var connect: String /* "2017-08-08" | "latest" | String */
    var acmpca: String /* "2017-08-22" | "latest" | String */
    var fms: String /* "2018-01-01" | "latest" | String */
    var secretsmanager: String /* "2017-10-17" | "latest" | String */
    var iotanalytics: String /* "2017-11-27" | "latest" | String */
    var iot1clickdevicesservice: String /* "2018-05-14" | "latest" | String */
    var iot1clickprojects: String /* "2018-05-14" | "latest" | String */
    var pi: String /* "2018-02-27" | "latest" | String */
    var neptune: String /* "2014-10-31" | "latest" | String */
    var mediatailor: String /* "2018-04-23" | "latest" | String */
    var eks: String /* "2017-11-01" | "latest" | String */
    var macie: String /* "2017-12-19" | "latest" | String */
    var dlm: String /* "2018-01-12" | "latest" | String */
    var signer: String /* "2017-08-25" | "latest" | String */
    var chime: String /* "2018-05-01" | "latest" | String */
    var pinpointemail: String /* "2018-07-26" | "latest" | String */
    var ram: String /* "2018-01-04" | "latest" | String */
    var route53resolver: String /* "2018-04-01" | "latest" | String */
    var pinpointsmsvoice: String /* "2018-09-05" | "latest" | String */
    var quicksight: String /* "2018-04-01" | "latest" | String */
    var rdsdataservice: String /* "2018-08-01" | "latest" | String */
    var amplify: String /* "2017-07-25" | "latest" | String */
    var datasync: String /* "2018-11-09" | "latest" | String */
    var robomaker: String /* "2018-06-29" | "latest" | String */
    var transfer: String /* "2018-11-05" | "latest" | String */
    var globalaccelerator: String /* "2018-08-08" | "latest" | String */
    var comprehendmedical: String /* "2018-10-30" | "latest" | String */
    var kinesisanalyticsv2: String /* "2018-05-23" | "latest" | String */
    var mediaconnect: String /* "2018-11-14" | "latest" | String */
    var fsx: String /* "2018-03-01" | "latest" | String */
    var securityhub: String /* "2018-10-26" | "latest" | String */
    var appmesh: String /* "2018-10-01" | "2019-01-25" | "latest" | String */
    var licensemanager: String /* "2018-08-01" | "latest" | String */
    var kafka: String /* "2018-11-14" | "latest" | String */
    var apigatewaymanagementapi: String /* "2018-11-29" | "latest" | String */
    var apigatewayv2: String /* "2018-11-29" | "latest" | String */
    var docdb: String /* "2014-10-31" | "latest" | String */
    var backup: String /* "2018-11-15" | "latest" | String */
    var worklink: String /* "2018-09-25" | "latest" | String */
    var textract: String /* "2018-06-27" | "latest" | String */
    var managedblockchain: String /* "2018-09-24" | "latest" | String */
    var mediapackagevod: String /* "2018-11-07" | "latest" | String */
    var groundstation: String /* "2019-05-23" | "latest" | String */
    var iotthingsgraph: String /* "2018-09-06" | "latest" | String */
    var iotevents: String /* "2018-07-27" | "latest" | String */
    var ioteventsdata: String /* "2018-10-23" | "latest" | String */
    var personalize: String /* "2018-05-22" | "latest" | String */
    var personalizeevents: String /* "2018-03-22" | "latest" | String */
    var personalizeruntime: String /* "2018-05-22" | "latest" | String */
    var applicationinsights: String /* "2018-11-25" | "latest" | String */
    var servicequotas: String /* "2019-06-24" | "latest" | String */
    var ec2instanceconnect: String /* "2018-04-02" | "latest" | String */
    var eventbridge: String /* "2015-10-07" | "latest" | String */
    var lakeformation: String /* "2017-03-31" | "latest" | String */
    var forecastservice: String /* "2018-06-26" | "latest" | String */
    var forecastqueryservice: String /* "2018-06-26" | "latest" | String */
    var qldb: String /* "2019-01-02" | "latest" | String */
    var qldbsession: String /* "2019-07-11" | "latest" | String */
    var workmailmessageflow: String /* "2019-05-01" | "latest" | String */
    var codestarnotifications: String /* "2019-10-15" | "latest" | String */
    var savingsplans: String /* "2019-06-28" | "latest" | String */
    var sso: String /* "2019-06-10" | "latest" | String */
    var ssooidc: String /* "2019-06-10" | "latest" | String */
    var marketplacecatalog: String /* "2018-09-17" | "latest" | String */
    var dataexchange: String /* "2017-07-25" | "latest" | String */
    var sesv2: String /* "2019-09-27" | "latest" | String */
    var migrationhubconfig: String /* "2019-06-30" | "latest" | String */
    var connectparticipant: String /* "2018-09-07" | "latest" | String */
    var appconfig: String /* "2019-10-09" | "latest" | String */
    var iotsecuretunneling: String /* "2018-10-05" | "latest" | String */
    var wafv2: String /* "2019-07-29" | "latest" | String */
    var elasticinference: String /* "2017-07-25" | "latest" | String */
    var imagebuilder: String /* "2019-12-02" | "latest" | String */
    var schemas: String /* "2019-12-02" | "latest" | String */
    var accessanalyzer: String /* "2019-11-01" | "latest" | String */
    var codegurureviewer: String /* "2019-09-19" | "latest" | String */
    var codeguruprofiler: String /* "2019-07-18" | "latest" | String */
    var computeoptimizer: String /* "2019-11-01" | "latest" | String */
    var frauddetector: String /* "2019-11-15" | "latest" | String */
    var kendra: String /* "2019-02-03" | "latest" | String */
    var networkmanager: String /* "2019-07-05" | "latest" | String */
    var outposts: String /* "2019-12-03" | "latest" | String */
    var augmentedairuntime: String /* "2019-11-07" | "latest" | String */
    var ebs: String /* "2019-11-02" | "latest" | String */
    var kinesisvideosignalingchannels: String /* "2019-12-04" | "latest" | String */
    var detective: String /* "2018-10-26" | "latest" | String */
    var codestarconnections: String /* "2019-12-01" | "latest" | String */
}