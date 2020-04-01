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
import ServiceCatalog.Tag
import ServiceCatalog.BudgetDetail
import ServiceCatalog.CloudWatchDashboard
import ServiceCatalog.ConstraintDetail
import ServiceCatalog.ConstraintSummary
import ServiceCatalog.ExecutionParameter
import ServiceCatalog.FailedServiceActionAssociation
import ServiceCatalog.LaunchPathSummary
import ServiceCatalog.OrganizationNode
import ServiceCatalog.PortfolioDetail
import ServiceCatalog.Principal
import ServiceCatalog.ProductViewAggregationValue
import ServiceCatalog.ProductViewDetail
import ServiceCatalog.ProductViewSummary
import ServiceCatalog.ProvisionedProductAttribute
import ServiceCatalog.ProvisionedProductDetail
import ServiceCatalog.ProvisionedProductPlanSummary
import ServiceCatalog.ProvisioningArtifactDetail
import ServiceCatalog.ProvisioningArtifactParameter
import ServiceCatalog.ProvisioningArtifactSummary
import ServiceCatalog.ProvisioningArtifactView
import ServiceCatalog.ProvisioningArtifact
import ServiceCatalog.ProvisioningParameter
import ServiceCatalog.RecordDetail
import ServiceCatalog.RecordError
import ServiceCatalog.RecordOutput
import ServiceCatalog.RecordTag
import ServiceCatalog.ResourceChangeDetail
import ServiceCatalog.ResourceChange
import ServiceCatalog.ResourceDetail
import ServiceCatalog.ServiceActionAssociation
import ServiceCatalog.ServiceActionSummary
import ServiceCatalog.ShareError
import ServiceCatalog.SourceProvisioningArtifactPropertiesMap
import ServiceCatalog.StackInstance
import ServiceCatalog.TagOptionDetail
import ServiceCatalog.TagOptionSummary
import ServiceCatalog.UpdateProvisioningParameter
import ServiceCatalog.UsageInstruction
import ServiceCatalog.AcceptPortfolioShareInput
import ServiceCatalog.AcceptPortfolioShareOutput
import ServiceCatalog.AssociateBudgetWithResourceInput
import ServiceCatalog.AssociateBudgetWithResourceOutput
import ServiceCatalog.AssociatePrincipalWithPortfolioInput
import ServiceCatalog.AssociatePrincipalWithPortfolioOutput
import ServiceCatalog.AssociateProductWithPortfolioInput
import ServiceCatalog.AssociateProductWithPortfolioOutput
import ServiceCatalog.AssociateServiceActionWithProvisioningArtifactInput
import ServiceCatalog.AssociateServiceActionWithProvisioningArtifactOutput
import ServiceCatalog.AssociateTagOptionWithResourceInput
import ServiceCatalog.AssociateTagOptionWithResourceOutput
import ServiceCatalog.BatchAssociateServiceActionWithProvisioningArtifactInput
import ServiceCatalog.BatchAssociateServiceActionWithProvisioningArtifactOutput
import ServiceCatalog.BatchDisassociateServiceActionFromProvisioningArtifactInput
import ServiceCatalog.BatchDisassociateServiceActionFromProvisioningArtifactOutput
import ServiceCatalog.CopyProductInput
import ServiceCatalog.CopyProductOutput
import ServiceCatalog.CreateConstraintInput
import ServiceCatalog.CreateConstraintOutput
import ServiceCatalog.CreatePortfolioInput
import ServiceCatalog.CreatePortfolioOutput
import ServiceCatalog.CreatePortfolioShareInput
import ServiceCatalog.CreatePortfolioShareOutput
import ServiceCatalog.CreateProductInput
import ServiceCatalog.CreateProductOutput
import ServiceCatalog.CreateProvisionedProductPlanInput
import ServiceCatalog.CreateProvisionedProductPlanOutput
import ServiceCatalog.CreateProvisioningArtifactInput
import ServiceCatalog.CreateProvisioningArtifactOutput
import ServiceCatalog.CreateServiceActionInput
import ServiceCatalog.CreateServiceActionOutput
import ServiceCatalog.CreateTagOptionInput
import ServiceCatalog.CreateTagOptionOutput
import ServiceCatalog.DeleteConstraintInput
import ServiceCatalog.DeleteConstraintOutput
import ServiceCatalog.DeletePortfolioInput
import ServiceCatalog.DeletePortfolioOutput
import ServiceCatalog.DeletePortfolioShareInput
import ServiceCatalog.DeletePortfolioShareOutput
import ServiceCatalog.DeleteProductInput
import ServiceCatalog.DeleteProductOutput
import ServiceCatalog.DeleteProvisionedProductPlanInput
import ServiceCatalog.DeleteProvisionedProductPlanOutput
import ServiceCatalog.DeleteProvisioningArtifactInput
import ServiceCatalog.DeleteProvisioningArtifactOutput
import ServiceCatalog.DeleteServiceActionInput
import ServiceCatalog.DeleteServiceActionOutput
import ServiceCatalog.DeleteTagOptionInput
import ServiceCatalog.DeleteTagOptionOutput
import ServiceCatalog.DescribeConstraintInput
import ServiceCatalog.DescribeConstraintOutput
import ServiceCatalog.DescribeCopyProductStatusInput
import ServiceCatalog.DescribeCopyProductStatusOutput
import ServiceCatalog.DescribePortfolioInput
import ServiceCatalog.DescribePortfolioOutput
import ServiceCatalog.DescribePortfolioShareStatusInput
import ServiceCatalog.DescribePortfolioShareStatusOutput
import ServiceCatalog.DescribeProductInput
import ServiceCatalog.DescribeProductOutput
import ServiceCatalog.DescribeProductAsAdminInput
import ServiceCatalog.DescribeProductAsAdminOutput
import ServiceCatalog.DescribeProductViewInput
import ServiceCatalog.DescribeProductViewOutput
import ServiceCatalog.DescribeProvisionedProductInput
import ServiceCatalog.DescribeProvisionedProductOutput
import ServiceCatalog.DescribeProvisionedProductPlanInput
import ServiceCatalog.DescribeProvisionedProductPlanOutput
import ServiceCatalog.DescribeProvisioningArtifactInput
import ServiceCatalog.DescribeProvisioningArtifactOutput
import ServiceCatalog.DescribeProvisioningParametersInput
import ServiceCatalog.DescribeProvisioningParametersOutput
import ServiceCatalog.DescribeRecordInput
import ServiceCatalog.DescribeRecordOutput
import ServiceCatalog.DescribeServiceActionInput
import ServiceCatalog.DescribeServiceActionOutput
import ServiceCatalog.DescribeServiceActionExecutionParametersInput
import ServiceCatalog.DescribeServiceActionExecutionParametersOutput
import ServiceCatalog.DescribeTagOptionInput
import ServiceCatalog.DescribeTagOptionOutput
import ServiceCatalog.DisableAWSOrganizationsAccessInput
import ServiceCatalog.DisableAWSOrganizationsAccessOutput
import ServiceCatalog.DisassociateBudgetFromResourceInput
import ServiceCatalog.DisassociateBudgetFromResourceOutput
import ServiceCatalog.DisassociatePrincipalFromPortfolioInput
import ServiceCatalog.DisassociatePrincipalFromPortfolioOutput
import ServiceCatalog.DisassociateProductFromPortfolioInput
import ServiceCatalog.DisassociateProductFromPortfolioOutput
import ServiceCatalog.DisassociateServiceActionFromProvisioningArtifactInput
import ServiceCatalog.DisassociateServiceActionFromProvisioningArtifactOutput
import ServiceCatalog.DisassociateTagOptionFromResourceInput
import ServiceCatalog.DisassociateTagOptionFromResourceOutput
import ServiceCatalog.EnableAWSOrganizationsAccessInput
import ServiceCatalog.EnableAWSOrganizationsAccessOutput
import ServiceCatalog.ExecuteProvisionedProductPlanInput
import ServiceCatalog.ExecuteProvisionedProductPlanOutput
import ServiceCatalog.ExecuteProvisionedProductServiceActionInput
import ServiceCatalog.ExecuteProvisionedProductServiceActionOutput
import ServiceCatalog.GetAWSOrganizationsAccessStatusInput
import ServiceCatalog.GetAWSOrganizationsAccessStatusOutput
import ServiceCatalog.ListAcceptedPortfolioSharesInput
import ServiceCatalog.ListAcceptedPortfolioSharesOutput
import ServiceCatalog.ListBudgetsForResourceInput
import ServiceCatalog.ListBudgetsForResourceOutput
import ServiceCatalog.ListConstraintsForPortfolioInput
import ServiceCatalog.ListConstraintsForPortfolioOutput
import ServiceCatalog.ListLaunchPathsInput
import ServiceCatalog.ListLaunchPathsOutput
import ServiceCatalog.ListOrganizationPortfolioAccessInput
import ServiceCatalog.ListOrganizationPortfolioAccessOutput
import ServiceCatalog.ListPortfolioAccessInput
import ServiceCatalog.ListPortfolioAccessOutput
import ServiceCatalog.ListPortfoliosInput
import ServiceCatalog.ListPortfoliosOutput
import ServiceCatalog.ListPortfoliosForProductInput
import ServiceCatalog.ListPortfoliosForProductOutput
import ServiceCatalog.ListPrincipalsForPortfolioInput
import ServiceCatalog.ListPrincipalsForPortfolioOutput
import ServiceCatalog.ListProvisionedProductPlansInput
import ServiceCatalog.ListProvisionedProductPlansOutput
import ServiceCatalog.ListProvisioningArtifactsInput
import ServiceCatalog.ListProvisioningArtifactsOutput
import ServiceCatalog.ListProvisioningArtifactsForServiceActionInput
import ServiceCatalog.ListProvisioningArtifactsForServiceActionOutput
import ServiceCatalog.ListRecordHistoryInput
import ServiceCatalog.ListRecordHistoryOutput
import ServiceCatalog.ListResourcesForTagOptionInput
import ServiceCatalog.ListResourcesForTagOptionOutput
import ServiceCatalog.ListServiceActionsInput
import ServiceCatalog.ListServiceActionsOutput
import ServiceCatalog.ListServiceActionsForProvisioningArtifactInput
import ServiceCatalog.ListServiceActionsForProvisioningArtifactOutput
import ServiceCatalog.ListStackInstancesForProvisionedProductInput
import ServiceCatalog.ListStackInstancesForProvisionedProductOutput
import ServiceCatalog.ListTagOptionsInput
import ServiceCatalog.ListTagOptionsOutput
import ServiceCatalog.ProvisionProductInput
import ServiceCatalog.ProvisionProductOutput
import ServiceCatalog.RejectPortfolioShareInput
import ServiceCatalog.RejectPortfolioShareOutput
import ServiceCatalog.ScanProvisionedProductsInput
import ServiceCatalog.ScanProvisionedProductsOutput
import ServiceCatalog.SearchProductsInput
import ServiceCatalog.SearchProductsOutput
import ServiceCatalog.SearchProductsAsAdminInput
import ServiceCatalog.SearchProductsAsAdminOutput
import ServiceCatalog.SearchProvisionedProductsInput
import ServiceCatalog.SearchProvisionedProductsOutput
import ServiceCatalog.TerminateProvisionedProductInput
import ServiceCatalog.TerminateProvisionedProductOutput
import ServiceCatalog.UpdateConstraintInput
import ServiceCatalog.UpdateConstraintOutput
import ServiceCatalog.UpdatePortfolioInput
import ServiceCatalog.UpdatePortfolioOutput
import ServiceCatalog.UpdateProductInput
import ServiceCatalog.UpdateProductOutput
import ServiceCatalog.UpdateProvisionedProductInput
import ServiceCatalog.UpdateProvisionedProductOutput
import ServiceCatalog.UpdateProvisionedProductPropertiesInput
import ServiceCatalog.UpdateProvisionedProductPropertiesOutput
import ServiceCatalog.UpdateProvisioningArtifactInput
import ServiceCatalog.UpdateProvisioningArtifactOutput
import ServiceCatalog.UpdateServiceActionInput
import ServiceCatalog.UpdateServiceActionOutput
import ServiceCatalog.UpdateTagOptionInput
import ServiceCatalog.UpdateTagOptionOutput
import ServiceCatalog.ProvisioningArtifactProperties
import ServiceCatalog.ProvisioningArtifactInfo
import ServiceCatalog.ServiceActionDefinitionMap
import ServiceCatalog.ServiceActionDetail
import ServiceCatalog.ShareDetails
import ServiceCatalog.ProvisionedProductPlanDetails
import ServiceCatalog.ProvisioningArtifactPreferences
import ServiceCatalog.ExecutionParameterMap
import ServiceCatalog.AccessLevelFilter
import ServiceCatalog.ListRecordHistorySearchFilter
import ServiceCatalog.ListTagOptionsFilters
import ServiceCatalog.ProvisioningPreferences
import ServiceCatalog.ParameterConstraints
import ServiceCatalog.ResourceTargetDefinition
import ServiceCatalog.ProductViewFilters
import ServiceCatalog.ProductViewAggregations
import ServiceCatalog.ProvisionedProductFilters
import ServiceCatalog.UpdateProvisioningPreferences
import ServiceCatalog.ProvisionedProductProperties

typealias AcceptLanguage = String

typealias AccessLevelFilterValue = String

typealias AccountId = String

typealias AccountIds = Array<AccountId>

typealias AddTags = Array<Tag>

typealias AllowedValue = String

typealias AllowedValues = Array<AllowedValue>

typealias ApproximateCount = Number

typealias AttributeValue = String

typealias BudgetName = String

typealias Budgets = Array<BudgetDetail>

typealias CausingEntity = String

typealias CloudWatchDashboardName = String

typealias CloudWatchDashboards = Array<CloudWatchDashboard>

typealias ConstraintDescription = String

typealias ConstraintDetails = Array<ConstraintDetail>

typealias ConstraintParameters = String

typealias ConstraintSummaries = Array<ConstraintSummary>

typealias ConstraintType = String

typealias CopyOptions = Array<String /* "CopyTags" | String */>

typealias CreatedTime = Date

typealias CreationTime = Date

typealias DefaultValue = String

typealias Description = String

typealias DisableTemplateValidation = Boolean

typealias Error = String

typealias ErrorCode = String

typealias ErrorDescription = String

typealias ExecutionParameterKey = String

typealias ExecutionParameterType = String

typealias ExecutionParameterValue = String

typealias ExecutionParameterValueList = Array<ExecutionParameterValue>

typealias ExecutionParameters = Array<ExecutionParameter>

typealias FailedServiceActionAssociations = Array<FailedServiceActionAssociation>

typealias HasDefaultPath = Boolean

typealias Id = String

typealias IdempotencyToken = String

typealias IgnoreErrors = Boolean

typealias InstructionType = String

typealias InstructionValue = String

typealias LastRequestId = String

typealias LaunchPathSummaries = Array<LaunchPathSummary>

typealias LogicalResourceId = String

typealias Message = String

typealias Namespaces = Array<AccountId>

typealias NoEcho = Boolean

typealias NotificationArn = String

typealias NotificationArns = Array<NotificationArn>

typealias OrganizationNodeValue = String

typealias OrganizationNodes = Array<OrganizationNode>

typealias OutputKey = String

typealias OutputValue = String

typealias PageSize = Number

typealias PageToken = String

typealias ParameterKey = String

typealias ParameterType = String

typealias ParameterValue = String

typealias PhysicalId = String

typealias PhysicalResourceId = String

typealias PlanResourceType = String

typealias PortfolioDescription = String

typealias PortfolioDetails = Array<PortfolioDetail>

typealias PortfolioDisplayName = String

typealias PortfolioName = String

typealias PrincipalARN = String

typealias Principals = Array<Principal>

typealias ProductArn = String

typealias ProductViewAggregationType = String

typealias ProductViewAggregationValues = Array<ProductViewAggregationValue>

typealias ProductViewDetails = Array<ProductViewDetail>

typealias ProductViewDistributor = String

typealias ProductViewFilterValue = String

typealias ProductViewFilterValues = Array<ProductViewFilterValue>

typealias ProductViewName = String

typealias ProductViewOwner = String

typealias ProductViewShortDescription = String

typealias ProductViewSummaries = Array<ProductViewSummary>

typealias PropertyName = String

typealias PropertyValue = String

typealias ProviderName = String

typealias ProvisionedProductAttributes = Array<ProvisionedProductAttribute>

typealias ProvisionedProductDetails = Array<ProvisionedProductDetail>

typealias ProvisionedProductId = String

typealias ProvisionedProductName = String

typealias ProvisionedProductNameOrArn = String

typealias ProvisionedProductPlanName = String

typealias ProvisionedProductPlans = Array<ProvisionedProductPlanSummary>

typealias ProvisionedProductStatusMessage = String

typealias ProvisionedProductType = String

typealias ProvisionedProductViewFilterValue = String

typealias ProvisionedProductViewFilterValues = Array<ProvisionedProductViewFilterValue>

typealias ProvisioningArtifactActive = Boolean

typealias ProvisioningArtifactCreatedTime = Date

typealias ProvisioningArtifactDescription = String

typealias ProvisioningArtifactDetails = Array<ProvisioningArtifactDetail>

typealias ProvisioningArtifactInfoKey = String

typealias ProvisioningArtifactInfoValue = String

typealias ProvisioningArtifactName = String

typealias ProvisioningArtifactParameters = Array<ProvisioningArtifactParameter>

typealias ProvisioningArtifactPropertyValue = String

typealias ProvisioningArtifactSummaries = Array<ProvisioningArtifactSummary>

typealias ProvisioningArtifactViews = Array<ProvisioningArtifactView>

typealias ProvisioningArtifacts = Array<ProvisioningArtifact>

typealias ProvisioningParameters = Array<ProvisioningParameter>

typealias RecordDetails = Array<RecordDetail>

typealias RecordErrors = Array<RecordError>

typealias RecordOutputs = Array<RecordOutput>

typealias RecordTagKey = String

typealias RecordTagValue = String

typealias RecordTags = Array<RecordTag>

typealias RecordType = String

typealias Region = String

typealias ResourceARN = String

typealias ResourceChangeDetails = Array<ResourceChangeDetail>

typealias ResourceChanges = Array<ResourceChange>

typealias ResourceDetailARN = String

typealias ResourceDetailCreatedTime = Date

typealias ResourceDetailDescription = String

typealias ResourceDetailId = String

typealias ResourceDetailName = String

typealias ResourceDetails = Array<ResourceDetail>

typealias ResourceId = String

typealias ResourceType = String

typealias Scope = Array<String /* "PROPERTIES" | "METADATA" | "CREATIONPOLICY" | "UPDATEPOLICY" | "DELETIONPOLICY" | "TAGS" | String */>

typealias SearchFilterKey = String

typealias SearchFilterValue = String

typealias SearchProvisionedProductsPageSize = Number

typealias ServiceActionAssociationErrorMessage = String

typealias ServiceActionAssociations = Array<ServiceActionAssociation>

typealias ServiceActionDefinitionValue = String

typealias ServiceActionDescription = String

typealias ServiceActionName = String

typealias ServiceActionSummaries = Array<ServiceActionSummary>

typealias ShareErrors = Array<ShareError>

typealias SortField = String

typealias SourceProvisioningArtifactProperties = Array<SourceProvisioningArtifactPropertiesMap>

typealias StackInstances = Array<StackInstance>

typealias StackSetAccounts = Array<AccountId>

typealias StackSetFailureToleranceCount = Number

typealias StackSetFailureTolerancePercentage = Number

typealias StackSetMaxConcurrencyCount = Number

typealias StackSetMaxConcurrencyPercentage = Number

typealias StackSetRegions = Array<Region>

typealias StatusDetail = String

typealias StatusMessage = String

typealias SuccessfulShares = Array<AccountId>

typealias SupportDescription = String

typealias SupportEmail = String

typealias SupportUrl = String

typealias TagKey = String

typealias TagKeys = Array<TagKey>

typealias TagOptionActive = Boolean

typealias TagOptionDetails = Array<TagOptionDetail>

typealias TagOptionId = String

typealias TagOptionKey = String

typealias TagOptionSummaries = Array<TagOptionSummary>

typealias TagOptionValue = String

typealias TagOptionValues = Array<TagOptionValue>

typealias TagValue = String

typealias Tags = Array<Tag>

typealias TotalResultsCount = Number

typealias UpdateProvisioningParameters = Array<UpdateProvisioningParameter>

typealias UpdatedTime = Date

typealias UsageInstructions = Array<UsageInstruction>

typealias UsePreviousValue = Boolean

typealias UserArn = String

typealias UserArnSession = String

typealias Verbose = Boolean

@JsModule("aws-sdk")
external open class ServiceCatalog(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ServiceCatalog.Types.ClientConfiguration */
    open fun acceptPortfolioShare(params: AcceptPortfolioShareInput, callback: (err: AWSError, data: AcceptPortfolioShareOutput) -> Unit = definedExternally): Request<AcceptPortfolioShareOutput, AWSError>
    open fun acceptPortfolioShare(callback: (err: AWSError, data: AcceptPortfolioShareOutput) -> Unit = definedExternally): Request<AcceptPortfolioShareOutput, AWSError>
    open fun associateBudgetWithResource(params: AssociateBudgetWithResourceInput, callback: (err: AWSError, data: AssociateBudgetWithResourceOutput) -> Unit = definedExternally): Request<AssociateBudgetWithResourceOutput, AWSError>
    open fun associateBudgetWithResource(callback: (err: AWSError, data: AssociateBudgetWithResourceOutput) -> Unit = definedExternally): Request<AssociateBudgetWithResourceOutput, AWSError>
    open fun associatePrincipalWithPortfolio(params: AssociatePrincipalWithPortfolioInput, callback: (err: AWSError, data: AssociatePrincipalWithPortfolioOutput) -> Unit = definedExternally): Request<AssociatePrincipalWithPortfolioOutput, AWSError>
    open fun associatePrincipalWithPortfolio(callback: (err: AWSError, data: AssociatePrincipalWithPortfolioOutput) -> Unit = definedExternally): Request<AssociatePrincipalWithPortfolioOutput, AWSError>
    open fun associateProductWithPortfolio(params: AssociateProductWithPortfolioInput, callback: (err: AWSError, data: AssociateProductWithPortfolioOutput) -> Unit = definedExternally): Request<AssociateProductWithPortfolioOutput, AWSError>
    open fun associateProductWithPortfolio(callback: (err: AWSError, data: AssociateProductWithPortfolioOutput) -> Unit = definedExternally): Request<AssociateProductWithPortfolioOutput, AWSError>
    open fun associateServiceActionWithProvisioningArtifact(params: AssociateServiceActionWithProvisioningArtifactInput, callback: (err: AWSError, data: AssociateServiceActionWithProvisioningArtifactOutput) -> Unit = definedExternally): Request<AssociateServiceActionWithProvisioningArtifactOutput, AWSError>
    open fun associateServiceActionWithProvisioningArtifact(callback: (err: AWSError, data: AssociateServiceActionWithProvisioningArtifactOutput) -> Unit = definedExternally): Request<AssociateServiceActionWithProvisioningArtifactOutput, AWSError>
    open fun associateTagOptionWithResource(params: AssociateTagOptionWithResourceInput, callback: (err: AWSError, data: AssociateTagOptionWithResourceOutput) -> Unit = definedExternally): Request<AssociateTagOptionWithResourceOutput, AWSError>
    open fun associateTagOptionWithResource(callback: (err: AWSError, data: AssociateTagOptionWithResourceOutput) -> Unit = definedExternally): Request<AssociateTagOptionWithResourceOutput, AWSError>
    open fun batchAssociateServiceActionWithProvisioningArtifact(params: BatchAssociateServiceActionWithProvisioningArtifactInput, callback: (err: AWSError, data: BatchAssociateServiceActionWithProvisioningArtifactOutput) -> Unit = definedExternally): Request<BatchAssociateServiceActionWithProvisioningArtifactOutput, AWSError>
    open fun batchAssociateServiceActionWithProvisioningArtifact(callback: (err: AWSError, data: BatchAssociateServiceActionWithProvisioningArtifactOutput) -> Unit = definedExternally): Request<BatchAssociateServiceActionWithProvisioningArtifactOutput, AWSError>
    open fun batchDisassociateServiceActionFromProvisioningArtifact(params: BatchDisassociateServiceActionFromProvisioningArtifactInput, callback: (err: AWSError, data: BatchDisassociateServiceActionFromProvisioningArtifactOutput) -> Unit = definedExternally): Request<BatchDisassociateServiceActionFromProvisioningArtifactOutput, AWSError>
    open fun batchDisassociateServiceActionFromProvisioningArtifact(callback: (err: AWSError, data: BatchDisassociateServiceActionFromProvisioningArtifactOutput) -> Unit = definedExternally): Request<BatchDisassociateServiceActionFromProvisioningArtifactOutput, AWSError>
    open fun copyProduct(params: CopyProductInput, callback: (err: AWSError, data: CopyProductOutput) -> Unit = definedExternally): Request<CopyProductOutput, AWSError>
    open fun copyProduct(callback: (err: AWSError, data: CopyProductOutput) -> Unit = definedExternally): Request<CopyProductOutput, AWSError>
    open fun createConstraint(params: CreateConstraintInput, callback: (err: AWSError, data: CreateConstraintOutput) -> Unit = definedExternally): Request<CreateConstraintOutput, AWSError>
    open fun createConstraint(callback: (err: AWSError, data: CreateConstraintOutput) -> Unit = definedExternally): Request<CreateConstraintOutput, AWSError>
    open fun createPortfolio(params: CreatePortfolioInput, callback: (err: AWSError, data: CreatePortfolioOutput) -> Unit = definedExternally): Request<CreatePortfolioOutput, AWSError>
    open fun createPortfolio(callback: (err: AWSError, data: CreatePortfolioOutput) -> Unit = definedExternally): Request<CreatePortfolioOutput, AWSError>
    open fun createPortfolioShare(params: CreatePortfolioShareInput, callback: (err: AWSError, data: CreatePortfolioShareOutput) -> Unit = definedExternally): Request<CreatePortfolioShareOutput, AWSError>
    open fun createPortfolioShare(callback: (err: AWSError, data: CreatePortfolioShareOutput) -> Unit = definedExternally): Request<CreatePortfolioShareOutput, AWSError>
    open fun createProduct(params: CreateProductInput, callback: (err: AWSError, data: CreateProductOutput) -> Unit = definedExternally): Request<CreateProductOutput, AWSError>
    open fun createProduct(callback: (err: AWSError, data: CreateProductOutput) -> Unit = definedExternally): Request<CreateProductOutput, AWSError>
    open fun createProvisionedProductPlan(params: CreateProvisionedProductPlanInput, callback: (err: AWSError, data: CreateProvisionedProductPlanOutput) -> Unit = definedExternally): Request<CreateProvisionedProductPlanOutput, AWSError>
    open fun createProvisionedProductPlan(callback: (err: AWSError, data: CreateProvisionedProductPlanOutput) -> Unit = definedExternally): Request<CreateProvisionedProductPlanOutput, AWSError>
    open fun createProvisioningArtifact(params: CreateProvisioningArtifactInput, callback: (err: AWSError, data: CreateProvisioningArtifactOutput) -> Unit = definedExternally): Request<CreateProvisioningArtifactOutput, AWSError>
    open fun createProvisioningArtifact(callback: (err: AWSError, data: CreateProvisioningArtifactOutput) -> Unit = definedExternally): Request<CreateProvisioningArtifactOutput, AWSError>
    open fun createServiceAction(params: CreateServiceActionInput, callback: (err: AWSError, data: CreateServiceActionOutput) -> Unit = definedExternally): Request<CreateServiceActionOutput, AWSError>
    open fun createServiceAction(callback: (err: AWSError, data: CreateServiceActionOutput) -> Unit = definedExternally): Request<CreateServiceActionOutput, AWSError>
    open fun createTagOption(params: CreateTagOptionInput, callback: (err: AWSError, data: CreateTagOptionOutput) -> Unit = definedExternally): Request<CreateTagOptionOutput, AWSError>
    open fun createTagOption(callback: (err: AWSError, data: CreateTagOptionOutput) -> Unit = definedExternally): Request<CreateTagOptionOutput, AWSError>
    open fun deleteConstraint(params: DeleteConstraintInput, callback: (err: AWSError, data: DeleteConstraintOutput) -> Unit = definedExternally): Request<DeleteConstraintOutput, AWSError>
    open fun deleteConstraint(callback: (err: AWSError, data: DeleteConstraintOutput) -> Unit = definedExternally): Request<DeleteConstraintOutput, AWSError>
    open fun deletePortfolio(params: DeletePortfolioInput, callback: (err: AWSError, data: DeletePortfolioOutput) -> Unit = definedExternally): Request<DeletePortfolioOutput, AWSError>
    open fun deletePortfolio(callback: (err: AWSError, data: DeletePortfolioOutput) -> Unit = definedExternally): Request<DeletePortfolioOutput, AWSError>
    open fun deletePortfolioShare(params: DeletePortfolioShareInput, callback: (err: AWSError, data: DeletePortfolioShareOutput) -> Unit = definedExternally): Request<DeletePortfolioShareOutput, AWSError>
    open fun deletePortfolioShare(callback: (err: AWSError, data: DeletePortfolioShareOutput) -> Unit = definedExternally): Request<DeletePortfolioShareOutput, AWSError>
    open fun deleteProduct(params: DeleteProductInput, callback: (err: AWSError, data: DeleteProductOutput) -> Unit = definedExternally): Request<DeleteProductOutput, AWSError>
    open fun deleteProduct(callback: (err: AWSError, data: DeleteProductOutput) -> Unit = definedExternally): Request<DeleteProductOutput, AWSError>
    open fun deleteProvisionedProductPlan(params: DeleteProvisionedProductPlanInput, callback: (err: AWSError, data: DeleteProvisionedProductPlanOutput) -> Unit = definedExternally): Request<DeleteProvisionedProductPlanOutput, AWSError>
    open fun deleteProvisionedProductPlan(callback: (err: AWSError, data: DeleteProvisionedProductPlanOutput) -> Unit = definedExternally): Request<DeleteProvisionedProductPlanOutput, AWSError>
    open fun deleteProvisioningArtifact(params: DeleteProvisioningArtifactInput, callback: (err: AWSError, data: DeleteProvisioningArtifactOutput) -> Unit = definedExternally): Request<DeleteProvisioningArtifactOutput, AWSError>
    open fun deleteProvisioningArtifact(callback: (err: AWSError, data: DeleteProvisioningArtifactOutput) -> Unit = definedExternally): Request<DeleteProvisioningArtifactOutput, AWSError>
    open fun deleteServiceAction(params: DeleteServiceActionInput, callback: (err: AWSError, data: DeleteServiceActionOutput) -> Unit = definedExternally): Request<DeleteServiceActionOutput, AWSError>
    open fun deleteServiceAction(callback: (err: AWSError, data: DeleteServiceActionOutput) -> Unit = definedExternally): Request<DeleteServiceActionOutput, AWSError>
    open fun deleteTagOption(params: DeleteTagOptionInput, callback: (err: AWSError, data: DeleteTagOptionOutput) -> Unit = definedExternally): Request<DeleteTagOptionOutput, AWSError>
    open fun deleteTagOption(callback: (err: AWSError, data: DeleteTagOptionOutput) -> Unit = definedExternally): Request<DeleteTagOptionOutput, AWSError>
    open fun describeConstraint(params: DescribeConstraintInput, callback: (err: AWSError, data: DescribeConstraintOutput) -> Unit = definedExternally): Request<DescribeConstraintOutput, AWSError>
    open fun describeConstraint(callback: (err: AWSError, data: DescribeConstraintOutput) -> Unit = definedExternally): Request<DescribeConstraintOutput, AWSError>
    open fun describeCopyProductStatus(params: DescribeCopyProductStatusInput, callback: (err: AWSError, data: DescribeCopyProductStatusOutput) -> Unit = definedExternally): Request<DescribeCopyProductStatusOutput, AWSError>
    open fun describeCopyProductStatus(callback: (err: AWSError, data: DescribeCopyProductStatusOutput) -> Unit = definedExternally): Request<DescribeCopyProductStatusOutput, AWSError>
    open fun describePortfolio(params: DescribePortfolioInput, callback: (err: AWSError, data: DescribePortfolioOutput) -> Unit = definedExternally): Request<DescribePortfolioOutput, AWSError>
    open fun describePortfolio(callback: (err: AWSError, data: DescribePortfolioOutput) -> Unit = definedExternally): Request<DescribePortfolioOutput, AWSError>
    open fun describePortfolioShareStatus(params: DescribePortfolioShareStatusInput, callback: (err: AWSError, data: DescribePortfolioShareStatusOutput) -> Unit = definedExternally): Request<DescribePortfolioShareStatusOutput, AWSError>
    open fun describePortfolioShareStatus(callback: (err: AWSError, data: DescribePortfolioShareStatusOutput) -> Unit = definedExternally): Request<DescribePortfolioShareStatusOutput, AWSError>
    open fun describeProduct(params: DescribeProductInput, callback: (err: AWSError, data: DescribeProductOutput) -> Unit = definedExternally): Request<DescribeProductOutput, AWSError>
    open fun describeProduct(callback: (err: AWSError, data: DescribeProductOutput) -> Unit = definedExternally): Request<DescribeProductOutput, AWSError>
    open fun describeProductAsAdmin(params: DescribeProductAsAdminInput, callback: (err: AWSError, data: DescribeProductAsAdminOutput) -> Unit = definedExternally): Request<DescribeProductAsAdminOutput, AWSError>
    open fun describeProductAsAdmin(callback: (err: AWSError, data: DescribeProductAsAdminOutput) -> Unit = definedExternally): Request<DescribeProductAsAdminOutput, AWSError>
    open fun describeProductView(params: DescribeProductViewInput, callback: (err: AWSError, data: DescribeProductViewOutput) -> Unit = definedExternally): Request<DescribeProductViewOutput, AWSError>
    open fun describeProductView(callback: (err: AWSError, data: DescribeProductViewOutput) -> Unit = definedExternally): Request<DescribeProductViewOutput, AWSError>
    open fun describeProvisionedProduct(params: DescribeProvisionedProductInput, callback: (err: AWSError, data: DescribeProvisionedProductOutput) -> Unit = definedExternally): Request<DescribeProvisionedProductOutput, AWSError>
    open fun describeProvisionedProduct(callback: (err: AWSError, data: DescribeProvisionedProductOutput) -> Unit = definedExternally): Request<DescribeProvisionedProductOutput, AWSError>
    open fun describeProvisionedProductPlan(params: DescribeProvisionedProductPlanInput, callback: (err: AWSError, data: DescribeProvisionedProductPlanOutput) -> Unit = definedExternally): Request<DescribeProvisionedProductPlanOutput, AWSError>
    open fun describeProvisionedProductPlan(callback: (err: AWSError, data: DescribeProvisionedProductPlanOutput) -> Unit = definedExternally): Request<DescribeProvisionedProductPlanOutput, AWSError>
    open fun describeProvisioningArtifact(params: DescribeProvisioningArtifactInput, callback: (err: AWSError, data: DescribeProvisioningArtifactOutput) -> Unit = definedExternally): Request<DescribeProvisioningArtifactOutput, AWSError>
    open fun describeProvisioningArtifact(callback: (err: AWSError, data: DescribeProvisioningArtifactOutput) -> Unit = definedExternally): Request<DescribeProvisioningArtifactOutput, AWSError>
    open fun describeProvisioningParameters(params: DescribeProvisioningParametersInput, callback: (err: AWSError, data: DescribeProvisioningParametersOutput) -> Unit = definedExternally): Request<DescribeProvisioningParametersOutput, AWSError>
    open fun describeProvisioningParameters(callback: (err: AWSError, data: DescribeProvisioningParametersOutput) -> Unit = definedExternally): Request<DescribeProvisioningParametersOutput, AWSError>
    open fun describeRecord(params: DescribeRecordInput, callback: (err: AWSError, data: DescribeRecordOutput) -> Unit = definedExternally): Request<DescribeRecordOutput, AWSError>
    open fun describeRecord(callback: (err: AWSError, data: DescribeRecordOutput) -> Unit = definedExternally): Request<DescribeRecordOutput, AWSError>
    open fun describeServiceAction(params: DescribeServiceActionInput, callback: (err: AWSError, data: DescribeServiceActionOutput) -> Unit = definedExternally): Request<DescribeServiceActionOutput, AWSError>
    open fun describeServiceAction(callback: (err: AWSError, data: DescribeServiceActionOutput) -> Unit = definedExternally): Request<DescribeServiceActionOutput, AWSError>
    open fun describeServiceActionExecutionParameters(params: DescribeServiceActionExecutionParametersInput, callback: (err: AWSError, data: DescribeServiceActionExecutionParametersOutput) -> Unit = definedExternally): Request<DescribeServiceActionExecutionParametersOutput, AWSError>
    open fun describeServiceActionExecutionParameters(callback: (err: AWSError, data: DescribeServiceActionExecutionParametersOutput) -> Unit = definedExternally): Request<DescribeServiceActionExecutionParametersOutput, AWSError>
    open fun describeTagOption(params: DescribeTagOptionInput, callback: (err: AWSError, data: DescribeTagOptionOutput) -> Unit = definedExternally): Request<DescribeTagOptionOutput, AWSError>
    open fun describeTagOption(callback: (err: AWSError, data: DescribeTagOptionOutput) -> Unit = definedExternally): Request<DescribeTagOptionOutput, AWSError>
    open fun disableAWSOrganizationsAccess(params: DisableAWSOrganizationsAccessInput, callback: (err: AWSError, data: DisableAWSOrganizationsAccessOutput) -> Unit = definedExternally): Request<DisableAWSOrganizationsAccessOutput, AWSError>
    open fun disableAWSOrganizationsAccess(callback: (err: AWSError, data: DisableAWSOrganizationsAccessOutput) -> Unit = definedExternally): Request<DisableAWSOrganizationsAccessOutput, AWSError>
    open fun disassociateBudgetFromResource(params: DisassociateBudgetFromResourceInput, callback: (err: AWSError, data: DisassociateBudgetFromResourceOutput) -> Unit = definedExternally): Request<DisassociateBudgetFromResourceOutput, AWSError>
    open fun disassociateBudgetFromResource(callback: (err: AWSError, data: DisassociateBudgetFromResourceOutput) -> Unit = definedExternally): Request<DisassociateBudgetFromResourceOutput, AWSError>
    open fun disassociatePrincipalFromPortfolio(params: DisassociatePrincipalFromPortfolioInput, callback: (err: AWSError, data: DisassociatePrincipalFromPortfolioOutput) -> Unit = definedExternally): Request<DisassociatePrincipalFromPortfolioOutput, AWSError>
    open fun disassociatePrincipalFromPortfolio(callback: (err: AWSError, data: DisassociatePrincipalFromPortfolioOutput) -> Unit = definedExternally): Request<DisassociatePrincipalFromPortfolioOutput, AWSError>
    open fun disassociateProductFromPortfolio(params: DisassociateProductFromPortfolioInput, callback: (err: AWSError, data: DisassociateProductFromPortfolioOutput) -> Unit = definedExternally): Request<DisassociateProductFromPortfolioOutput, AWSError>
    open fun disassociateProductFromPortfolio(callback: (err: AWSError, data: DisassociateProductFromPortfolioOutput) -> Unit = definedExternally): Request<DisassociateProductFromPortfolioOutput, AWSError>
    open fun disassociateServiceActionFromProvisioningArtifact(params: DisassociateServiceActionFromProvisioningArtifactInput, callback: (err: AWSError, data: DisassociateServiceActionFromProvisioningArtifactOutput) -> Unit = definedExternally): Request<DisassociateServiceActionFromProvisioningArtifactOutput, AWSError>
    open fun disassociateServiceActionFromProvisioningArtifact(callback: (err: AWSError, data: DisassociateServiceActionFromProvisioningArtifactOutput) -> Unit = definedExternally): Request<DisassociateServiceActionFromProvisioningArtifactOutput, AWSError>
    open fun disassociateTagOptionFromResource(params: DisassociateTagOptionFromResourceInput, callback: (err: AWSError, data: DisassociateTagOptionFromResourceOutput) -> Unit = definedExternally): Request<DisassociateTagOptionFromResourceOutput, AWSError>
    open fun disassociateTagOptionFromResource(callback: (err: AWSError, data: DisassociateTagOptionFromResourceOutput) -> Unit = definedExternally): Request<DisassociateTagOptionFromResourceOutput, AWSError>
    open fun enableAWSOrganizationsAccess(params: EnableAWSOrganizationsAccessInput, callback: (err: AWSError, data: EnableAWSOrganizationsAccessOutput) -> Unit = definedExternally): Request<EnableAWSOrganizationsAccessOutput, AWSError>
    open fun enableAWSOrganizationsAccess(callback: (err: AWSError, data: EnableAWSOrganizationsAccessOutput) -> Unit = definedExternally): Request<EnableAWSOrganizationsAccessOutput, AWSError>
    open fun executeProvisionedProductPlan(params: ExecuteProvisionedProductPlanInput, callback: (err: AWSError, data: ExecuteProvisionedProductPlanOutput) -> Unit = definedExternally): Request<ExecuteProvisionedProductPlanOutput, AWSError>
    open fun executeProvisionedProductPlan(callback: (err: AWSError, data: ExecuteProvisionedProductPlanOutput) -> Unit = definedExternally): Request<ExecuteProvisionedProductPlanOutput, AWSError>
    open fun executeProvisionedProductServiceAction(params: ExecuteProvisionedProductServiceActionInput, callback: (err: AWSError, data: ExecuteProvisionedProductServiceActionOutput) -> Unit = definedExternally): Request<ExecuteProvisionedProductServiceActionOutput, AWSError>
    open fun executeProvisionedProductServiceAction(callback: (err: AWSError, data: ExecuteProvisionedProductServiceActionOutput) -> Unit = definedExternally): Request<ExecuteProvisionedProductServiceActionOutput, AWSError>
    open fun getAWSOrganizationsAccessStatus(params: GetAWSOrganizationsAccessStatusInput, callback: (err: AWSError, data: GetAWSOrganizationsAccessStatusOutput) -> Unit = definedExternally): Request<GetAWSOrganizationsAccessStatusOutput, AWSError>
    open fun getAWSOrganizationsAccessStatus(callback: (err: AWSError, data: GetAWSOrganizationsAccessStatusOutput) -> Unit = definedExternally): Request<GetAWSOrganizationsAccessStatusOutput, AWSError>
    open fun listAcceptedPortfolioShares(params: ListAcceptedPortfolioSharesInput, callback: (err: AWSError, data: ListAcceptedPortfolioSharesOutput) -> Unit = definedExternally): Request<ListAcceptedPortfolioSharesOutput, AWSError>
    open fun listAcceptedPortfolioShares(callback: (err: AWSError, data: ListAcceptedPortfolioSharesOutput) -> Unit = definedExternally): Request<ListAcceptedPortfolioSharesOutput, AWSError>
    open fun listBudgetsForResource(params: ListBudgetsForResourceInput, callback: (err: AWSError, data: ListBudgetsForResourceOutput) -> Unit = definedExternally): Request<ListBudgetsForResourceOutput, AWSError>
    open fun listBudgetsForResource(callback: (err: AWSError, data: ListBudgetsForResourceOutput) -> Unit = definedExternally): Request<ListBudgetsForResourceOutput, AWSError>
    open fun listConstraintsForPortfolio(params: ListConstraintsForPortfolioInput, callback: (err: AWSError, data: ListConstraintsForPortfolioOutput) -> Unit = definedExternally): Request<ListConstraintsForPortfolioOutput, AWSError>
    open fun listConstraintsForPortfolio(callback: (err: AWSError, data: ListConstraintsForPortfolioOutput) -> Unit = definedExternally): Request<ListConstraintsForPortfolioOutput, AWSError>
    open fun listLaunchPaths(params: ListLaunchPathsInput, callback: (err: AWSError, data: ListLaunchPathsOutput) -> Unit = definedExternally): Request<ListLaunchPathsOutput, AWSError>
    open fun listLaunchPaths(callback: (err: AWSError, data: ListLaunchPathsOutput) -> Unit = definedExternally): Request<ListLaunchPathsOutput, AWSError>
    open fun listOrganizationPortfolioAccess(params: ListOrganizationPortfolioAccessInput, callback: (err: AWSError, data: ListOrganizationPortfolioAccessOutput) -> Unit = definedExternally): Request<ListOrganizationPortfolioAccessOutput, AWSError>
    open fun listOrganizationPortfolioAccess(callback: (err: AWSError, data: ListOrganizationPortfolioAccessOutput) -> Unit = definedExternally): Request<ListOrganizationPortfolioAccessOutput, AWSError>
    open fun listPortfolioAccess(params: ListPortfolioAccessInput, callback: (err: AWSError, data: ListPortfolioAccessOutput) -> Unit = definedExternally): Request<ListPortfolioAccessOutput, AWSError>
    open fun listPortfolioAccess(callback: (err: AWSError, data: ListPortfolioAccessOutput) -> Unit = definedExternally): Request<ListPortfolioAccessOutput, AWSError>
    open fun listPortfolios(params: ListPortfoliosInput, callback: (err: AWSError, data: ListPortfoliosOutput) -> Unit = definedExternally): Request<ListPortfoliosOutput, AWSError>
    open fun listPortfolios(callback: (err: AWSError, data: ListPortfoliosOutput) -> Unit = definedExternally): Request<ListPortfoliosOutput, AWSError>
    open fun listPortfoliosForProduct(params: ListPortfoliosForProductInput, callback: (err: AWSError, data: ListPortfoliosForProductOutput) -> Unit = definedExternally): Request<ListPortfoliosForProductOutput, AWSError>
    open fun listPortfoliosForProduct(callback: (err: AWSError, data: ListPortfoliosForProductOutput) -> Unit = definedExternally): Request<ListPortfoliosForProductOutput, AWSError>
    open fun listPrincipalsForPortfolio(params: ListPrincipalsForPortfolioInput, callback: (err: AWSError, data: ListPrincipalsForPortfolioOutput) -> Unit = definedExternally): Request<ListPrincipalsForPortfolioOutput, AWSError>
    open fun listPrincipalsForPortfolio(callback: (err: AWSError, data: ListPrincipalsForPortfolioOutput) -> Unit = definedExternally): Request<ListPrincipalsForPortfolioOutput, AWSError>
    open fun listProvisionedProductPlans(params: ListProvisionedProductPlansInput, callback: (err: AWSError, data: ListProvisionedProductPlansOutput) -> Unit = definedExternally): Request<ListProvisionedProductPlansOutput, AWSError>
    open fun listProvisionedProductPlans(callback: (err: AWSError, data: ListProvisionedProductPlansOutput) -> Unit = definedExternally): Request<ListProvisionedProductPlansOutput, AWSError>
    open fun listProvisioningArtifacts(params: ListProvisioningArtifactsInput, callback: (err: AWSError, data: ListProvisioningArtifactsOutput) -> Unit = definedExternally): Request<ListProvisioningArtifactsOutput, AWSError>
    open fun listProvisioningArtifacts(callback: (err: AWSError, data: ListProvisioningArtifactsOutput) -> Unit = definedExternally): Request<ListProvisioningArtifactsOutput, AWSError>
    open fun listProvisioningArtifactsForServiceAction(params: ListProvisioningArtifactsForServiceActionInput, callback: (err: AWSError, data: ListProvisioningArtifactsForServiceActionOutput) -> Unit = definedExternally): Request<ListProvisioningArtifactsForServiceActionOutput, AWSError>
    open fun listProvisioningArtifactsForServiceAction(callback: (err: AWSError, data: ListProvisioningArtifactsForServiceActionOutput) -> Unit = definedExternally): Request<ListProvisioningArtifactsForServiceActionOutput, AWSError>
    open fun listRecordHistory(params: ListRecordHistoryInput, callback: (err: AWSError, data: ListRecordHistoryOutput) -> Unit = definedExternally): Request<ListRecordHistoryOutput, AWSError>
    open fun listRecordHistory(callback: (err: AWSError, data: ListRecordHistoryOutput) -> Unit = definedExternally): Request<ListRecordHistoryOutput, AWSError>
    open fun listResourcesForTagOption(params: ListResourcesForTagOptionInput, callback: (err: AWSError, data: ListResourcesForTagOptionOutput) -> Unit = definedExternally): Request<ListResourcesForTagOptionOutput, AWSError>
    open fun listResourcesForTagOption(callback: (err: AWSError, data: ListResourcesForTagOptionOutput) -> Unit = definedExternally): Request<ListResourcesForTagOptionOutput, AWSError>
    open fun listServiceActions(params: ListServiceActionsInput, callback: (err: AWSError, data: ListServiceActionsOutput) -> Unit = definedExternally): Request<ListServiceActionsOutput, AWSError>
    open fun listServiceActions(callback: (err: AWSError, data: ListServiceActionsOutput) -> Unit = definedExternally): Request<ListServiceActionsOutput, AWSError>
    open fun listServiceActionsForProvisioningArtifact(params: ListServiceActionsForProvisioningArtifactInput, callback: (err: AWSError, data: ListServiceActionsForProvisioningArtifactOutput) -> Unit = definedExternally): Request<ListServiceActionsForProvisioningArtifactOutput, AWSError>
    open fun listServiceActionsForProvisioningArtifact(callback: (err: AWSError, data: ListServiceActionsForProvisioningArtifactOutput) -> Unit = definedExternally): Request<ListServiceActionsForProvisioningArtifactOutput, AWSError>
    open fun listStackInstancesForProvisionedProduct(params: ListStackInstancesForProvisionedProductInput, callback: (err: AWSError, data: ListStackInstancesForProvisionedProductOutput) -> Unit = definedExternally): Request<ListStackInstancesForProvisionedProductOutput, AWSError>
    open fun listStackInstancesForProvisionedProduct(callback: (err: AWSError, data: ListStackInstancesForProvisionedProductOutput) -> Unit = definedExternally): Request<ListStackInstancesForProvisionedProductOutput, AWSError>
    open fun listTagOptions(params: ListTagOptionsInput, callback: (err: AWSError, data: ListTagOptionsOutput) -> Unit = definedExternally): Request<ListTagOptionsOutput, AWSError>
    open fun listTagOptions(callback: (err: AWSError, data: ListTagOptionsOutput) -> Unit = definedExternally): Request<ListTagOptionsOutput, AWSError>
    open fun provisionProduct(params: ProvisionProductInput, callback: (err: AWSError, data: ProvisionProductOutput) -> Unit = definedExternally): Request<ProvisionProductOutput, AWSError>
    open fun provisionProduct(callback: (err: AWSError, data: ProvisionProductOutput) -> Unit = definedExternally): Request<ProvisionProductOutput, AWSError>
    open fun rejectPortfolioShare(params: RejectPortfolioShareInput, callback: (err: AWSError, data: RejectPortfolioShareOutput) -> Unit = definedExternally): Request<RejectPortfolioShareOutput, AWSError>
    open fun rejectPortfolioShare(callback: (err: AWSError, data: RejectPortfolioShareOutput) -> Unit = definedExternally): Request<RejectPortfolioShareOutput, AWSError>
    open fun scanProvisionedProducts(params: ScanProvisionedProductsInput, callback: (err: AWSError, data: ScanProvisionedProductsOutput) -> Unit = definedExternally): Request<ScanProvisionedProductsOutput, AWSError>
    open fun scanProvisionedProducts(callback: (err: AWSError, data: ScanProvisionedProductsOutput) -> Unit = definedExternally): Request<ScanProvisionedProductsOutput, AWSError>
    open fun searchProducts(params: SearchProductsInput, callback: (err: AWSError, data: SearchProductsOutput) -> Unit = definedExternally): Request<SearchProductsOutput, AWSError>
    open fun searchProducts(callback: (err: AWSError, data: SearchProductsOutput) -> Unit = definedExternally): Request<SearchProductsOutput, AWSError>
    open fun searchProductsAsAdmin(params: SearchProductsAsAdminInput, callback: (err: AWSError, data: SearchProductsAsAdminOutput) -> Unit = definedExternally): Request<SearchProductsAsAdminOutput, AWSError>
    open fun searchProductsAsAdmin(callback: (err: AWSError, data: SearchProductsAsAdminOutput) -> Unit = definedExternally): Request<SearchProductsAsAdminOutput, AWSError>
    open fun searchProvisionedProducts(params: SearchProvisionedProductsInput, callback: (err: AWSError, data: SearchProvisionedProductsOutput) -> Unit = definedExternally): Request<SearchProvisionedProductsOutput, AWSError>
    open fun searchProvisionedProducts(callback: (err: AWSError, data: SearchProvisionedProductsOutput) -> Unit = definedExternally): Request<SearchProvisionedProductsOutput, AWSError>
    open fun terminateProvisionedProduct(params: TerminateProvisionedProductInput, callback: (err: AWSError, data: TerminateProvisionedProductOutput) -> Unit = definedExternally): Request<TerminateProvisionedProductOutput, AWSError>
    open fun terminateProvisionedProduct(callback: (err: AWSError, data: TerminateProvisionedProductOutput) -> Unit = definedExternally): Request<TerminateProvisionedProductOutput, AWSError>
    open fun updateConstraint(params: UpdateConstraintInput, callback: (err: AWSError, data: UpdateConstraintOutput) -> Unit = definedExternally): Request<UpdateConstraintOutput, AWSError>
    open fun updateConstraint(callback: (err: AWSError, data: UpdateConstraintOutput) -> Unit = definedExternally): Request<UpdateConstraintOutput, AWSError>
    open fun updatePortfolio(params: UpdatePortfolioInput, callback: (err: AWSError, data: UpdatePortfolioOutput) -> Unit = definedExternally): Request<UpdatePortfolioOutput, AWSError>
    open fun updatePortfolio(callback: (err: AWSError, data: UpdatePortfolioOutput) -> Unit = definedExternally): Request<UpdatePortfolioOutput, AWSError>
    open fun updateProduct(params: UpdateProductInput, callback: (err: AWSError, data: UpdateProductOutput) -> Unit = definedExternally): Request<UpdateProductOutput, AWSError>
    open fun updateProduct(callback: (err: AWSError, data: UpdateProductOutput) -> Unit = definedExternally): Request<UpdateProductOutput, AWSError>
    open fun updateProvisionedProduct(params: UpdateProvisionedProductInput, callback: (err: AWSError, data: UpdateProvisionedProductOutput) -> Unit = definedExternally): Request<UpdateProvisionedProductOutput, AWSError>
    open fun updateProvisionedProduct(callback: (err: AWSError, data: UpdateProvisionedProductOutput) -> Unit = definedExternally): Request<UpdateProvisionedProductOutput, AWSError>
    open fun updateProvisionedProductProperties(params: UpdateProvisionedProductPropertiesInput, callback: (err: AWSError, data: UpdateProvisionedProductPropertiesOutput) -> Unit = definedExternally): Request<UpdateProvisionedProductPropertiesOutput, AWSError>
    open fun updateProvisionedProductProperties(callback: (err: AWSError, data: UpdateProvisionedProductPropertiesOutput) -> Unit = definedExternally): Request<UpdateProvisionedProductPropertiesOutput, AWSError>
    open fun updateProvisioningArtifact(params: UpdateProvisioningArtifactInput, callback: (err: AWSError, data: UpdateProvisioningArtifactOutput) -> Unit = definedExternally): Request<UpdateProvisioningArtifactOutput, AWSError>
    open fun updateProvisioningArtifact(callback: (err: AWSError, data: UpdateProvisioningArtifactOutput) -> Unit = definedExternally): Request<UpdateProvisioningArtifactOutput, AWSError>
    open fun updateServiceAction(params: UpdateServiceActionInput, callback: (err: AWSError, data: UpdateServiceActionOutput) -> Unit = definedExternally): Request<UpdateServiceActionOutput, AWSError>
    open fun updateServiceAction(callback: (err: AWSError, data: UpdateServiceActionOutput) -> Unit = definedExternally): Request<UpdateServiceActionOutput, AWSError>
    open fun updateTagOption(params: UpdateTagOptionInput, callback: (err: AWSError, data: UpdateTagOptionOutput) -> Unit = definedExternally): Request<UpdateTagOptionOutput, AWSError>
    open fun updateTagOption(callback: (err: AWSError, data: UpdateTagOptionOutput) -> Unit = definedExternally): Request<UpdateTagOptionOutput, AWSError>
    interface AcceptPortfolioShareInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var PortfolioId: Id
        var PortfolioShareType: String /* "IMPORTED" | "AWS_SERVICECATALOG" | "AWS_ORGANIZATIONS" | String */
    }
    interface AcceptPortfolioShareOutput
    interface AccessLevelFilter {
        var Key: String /* "Account" | "Role" | "User" | String */
        var Value: AccessLevelFilterValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateBudgetWithResourceInput {
        var BudgetName: BudgetName
        var ResourceId: Id
    }
    interface AssociateBudgetWithResourceOutput
    interface AssociatePrincipalWithPortfolioInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var PortfolioId: Id
        var PrincipalARN: PrincipalARN
        var PrincipalType: String /* "IAM" | String */
    }
    interface AssociatePrincipalWithPortfolioOutput
    interface AssociateProductWithPortfolioInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var ProductId: Id
        var PortfolioId: Id
        var SourcePortfolioId: Id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateProductWithPortfolioOutput
    interface AssociateServiceActionWithProvisioningArtifactInput {
        var ProductId: Id
        var ProvisioningArtifactId: Id
        var ServiceActionId: Id
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateServiceActionWithProvisioningArtifactOutput
    interface AssociateTagOptionWithResourceInput {
        var ResourceId: ResourceId
        var TagOptionId: TagOptionId
    }
    interface AssociateTagOptionWithResourceOutput
    interface BatchAssociateServiceActionWithProvisioningArtifactInput {
        var ServiceActionAssociations: ServiceActionAssociations
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchAssociateServiceActionWithProvisioningArtifactOutput {
        var FailedServiceActionAssociations: FailedServiceActionAssociations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDisassociateServiceActionFromProvisioningArtifactInput {
        var ServiceActionAssociations: ServiceActionAssociations
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDisassociateServiceActionFromProvisioningArtifactOutput {
        var FailedServiceActionAssociations: FailedServiceActionAssociations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BudgetDetail {
        var BudgetName: BudgetName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CloudWatchDashboard {
        var Name: CloudWatchDashboardName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConstraintDetail {
        var ConstraintId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Type: ConstraintType?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ConstraintDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Owner: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var ProductId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var PortfolioId: Id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConstraintSummary {
        var Type: ConstraintType?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ConstraintDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CopyProductInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var SourceProductArn: ProductArn
        var TargetProductId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var TargetProductName: ProductViewName?
            get() = definedExternally
            set(value) = definedExternally
        var SourceProvisioningArtifactIdentifiers: SourceProvisioningArtifactProperties?
            get() = definedExternally
            set(value) = definedExternally
        var CopyOptions: CopyOptions?
            get() = definedExternally
            set(value) = definedExternally
        var IdempotencyToken: IdempotencyToken
    }
    interface CopyProductOutput {
        var CopyProductToken: Id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateConstraintInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var PortfolioId: Id
        var ProductId: Id
        var Parameters: ConstraintParameters
        var Type: ConstraintType
        var Description: ConstraintDescription?
            get() = definedExternally
            set(value) = definedExternally
        var IdempotencyToken: IdempotencyToken
    }
    interface CreateConstraintOutput {
        var ConstraintDetail: ConstraintDetail?
            get() = definedExternally
            set(value) = definedExternally
        var ConstraintParameters: ConstraintParameters?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "AVAILABLE" | "CREATING" | "FAILED" | String */
    }
    interface CreatePortfolioInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: PortfolioDisplayName
        var Description: PortfolioDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ProviderName: ProviderName
        var Tags: AddTags?
            get() = definedExternally
            set(value) = definedExternally
        var IdempotencyToken: IdempotencyToken
    }
    interface CreatePortfolioOutput {
        var PortfolioDetail: PortfolioDetail?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePortfolioShareInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var PortfolioId: Id
        var AccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationNode: OrganizationNode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePortfolioShareOutput {
        var PortfolioShareToken: Id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProductInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ProductViewName
        var Owner: ProductViewOwner
        var Description: ProductViewShortDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Distributor: ProductViewOwner?
            get() = definedExternally
            set(value) = definedExternally
        var SupportDescription: SupportDescription?
            get() = definedExternally
            set(value) = definedExternally
        var SupportEmail: SupportEmail?
            get() = definedExternally
            set(value) = definedExternally
        var SupportUrl: SupportUrl?
            get() = definedExternally
            set(value) = definedExternally
        var ProductType: String /* "CLOUD_FORMATION_TEMPLATE" | "MARKETPLACE" | String */
        var Tags: AddTags?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisioningArtifactParameters: ProvisioningArtifactProperties
        var IdempotencyToken: IdempotencyToken
    }
    interface CreateProductOutput {
        var ProductViewDetail: ProductViewDetail?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisioningArtifactDetail: ProvisioningArtifactDetail?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProvisionedProductPlanInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var PlanName: ProvisionedProductPlanName
        var PlanType: String /* "CLOUDFORMATION" | String */
        var NotificationArns: NotificationArns?
            get() = definedExternally
            set(value) = definedExternally
        var PathId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ProductId: Id
        var ProvisionedProductName: ProvisionedProductName
        var ProvisioningArtifactId: Id
        var ProvisioningParameters: UpdateProvisioningParameters?
            get() = definedExternally
            set(value) = definedExternally
        var IdempotencyToken: IdempotencyToken
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProvisionedProductPlanOutput {
        var PlanName: ProvisionedProductPlanName?
            get() = definedExternally
            set(value) = definedExternally
        var PlanId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionProductId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedProductName: ProvisionedProductName?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisioningArtifactId: Id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProvisioningArtifactInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var ProductId: Id
        var Parameters: ProvisioningArtifactProperties
        var IdempotencyToken: IdempotencyToken
    }
    interface CreateProvisioningArtifactOutput {
        var ProvisioningArtifactDetail: ProvisioningArtifactDetail?
            get() = definedExternally
            set(value) = definedExternally
        var Info: ProvisioningArtifactInfo?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "AVAILABLE" | "CREATING" | "FAILED" | String */
    }
    interface CreateServiceActionInput {
        var Name: ServiceActionName
        var DefinitionType: String /* "SSM_AUTOMATION" | String */
        var Definition: ServiceActionDefinitionMap
        var Description: ServiceActionDescription?
            get() = definedExternally
            set(value) = definedExternally
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var IdempotencyToken: IdempotencyToken
    }
    interface CreateServiceActionOutput {
        var ServiceActionDetail: ServiceActionDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTagOptionInput {
        var Key: TagOptionKey
        var Value: TagOptionValue
    }
    interface CreateTagOptionOutput {
        var TagOptionDetail: TagOptionDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteConstraintInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id
    }
    interface DeleteConstraintOutput
    interface DeletePortfolioInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id
    }
    interface DeletePortfolioOutput
    interface DeletePortfolioShareInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var PortfolioId: Id
        var AccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationNode: OrganizationNode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeletePortfolioShareOutput {
        var PortfolioShareToken: Id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteProductInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id
    }
    interface DeleteProductOutput
    interface DeleteProvisionedProductPlanInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var PlanId: Id
        var IgnoreErrors: IgnoreErrors?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteProvisionedProductPlanOutput
    interface DeleteProvisioningArtifactInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var ProductId: Id
        var ProvisioningArtifactId: Id
    }
    interface DeleteProvisioningArtifactOutput
    interface DeleteServiceActionInput {
        var Id: Id
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteServiceActionOutput
    interface DeleteTagOptionInput {
        var Id: TagOptionId
    }
    interface DeleteTagOptionOutput
    interface DescribeConstraintInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id
    }
    interface DescribeConstraintOutput {
        var ConstraintDetail: ConstraintDetail?
            get() = definedExternally
            set(value) = definedExternally
        var ConstraintParameters: ConstraintParameters?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "AVAILABLE" | "CREATING" | "FAILED" | String */
    }
    interface DescribeCopyProductStatusInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var CopyProductToken: Id
    }
    interface DescribeCopyProductStatusOutput {
        var CopyProductStatus: String /* "SUCCEEDED" | "IN_PROGRESS" | "FAILED" | String */
        var TargetProductId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var StatusDetail: StatusDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePortfolioInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id
    }
    interface DescribePortfolioOutput {
        var PortfolioDetail: PortfolioDetail?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var TagOptions: TagOptionDetails?
            get() = definedExternally
            set(value) = definedExternally
        var Budgets: Budgets?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePortfolioShareStatusInput {
        var PortfolioShareToken: Id
    }
    interface DescribePortfolioShareStatusOutput {
        var PortfolioShareToken: Id?
            get() = definedExternally
            set(value) = definedExternally
        var PortfolioId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationNodeValue: OrganizationNodeValue?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "NOT_STARTED" | "IN_PROGRESS" | "COMPLETED" | "COMPLETED_WITH_ERRORS" | "ERROR" | String */
        var ShareDetails: ShareDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProductAsAdminInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id
    }
    interface DescribeProductAsAdminOutput {
        var ProductViewDetail: ProductViewDetail?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisioningArtifactSummaries: ProvisioningArtifactSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var TagOptions: TagOptionDetails?
            get() = definedExternally
            set(value) = definedExternally
        var Budgets: Budgets?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProductInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id
    }
    interface DescribeProductOutput {
        var ProductViewSummary: ProductViewSummary?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisioningArtifacts: ProvisioningArtifacts?
            get() = definedExternally
            set(value) = definedExternally
        var Budgets: Budgets?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProductViewInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id
    }
    interface DescribeProductViewOutput {
        var ProductViewSummary: ProductViewSummary?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisioningArtifacts: ProvisioningArtifacts?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProvisionedProductInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id
    }
    interface DescribeProvisionedProductOutput {
        var ProvisionedProductDetail: ProvisionedProductDetail?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchDashboards: CloudWatchDashboards?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProvisionedProductPlanInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var PlanId: Id
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProvisionedProductPlanOutput {
        var ProvisionedProductPlanDetails: ProvisionedProductPlanDetails?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceChanges: ResourceChanges?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProvisioningArtifactInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisioningArtifactId: Id
        var ProductId: Id
        var Verbose: Verbose?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProvisioningArtifactOutput {
        var ProvisioningArtifactDetail: ProvisioningArtifactDetail?
            get() = definedExternally
            set(value) = definedExternally
        var Info: ProvisioningArtifactInfo?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "AVAILABLE" | "CREATING" | "FAILED" | String */
    }
    interface DescribeProvisioningParametersInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var ProductId: Id
        var ProvisioningArtifactId: Id
        var PathId: Id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProvisioningParametersOutput {
        var ProvisioningArtifactParameters: ProvisioningArtifactParameters?
            get() = definedExternally
            set(value) = definedExternally
        var ConstraintSummaries: ConstraintSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var UsageInstructions: UsageInstructions?
            get() = definedExternally
            set(value) = definedExternally
        var TagOptions: TagOptionSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisioningArtifactPreferences: ProvisioningArtifactPreferences?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRecordInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRecordOutput {
        var RecordDetail: RecordDetail?
            get() = definedExternally
            set(value) = definedExternally
        var RecordOutputs: RecordOutputs?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeServiceActionExecutionParametersInput {
        var ProvisionedProductId: Id
        var ServiceActionId: Id
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeServiceActionExecutionParametersOutput {
        var ServiceActionParameters: ExecutionParameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeServiceActionInput {
        var Id: Id
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeServiceActionOutput {
        var ServiceActionDetail: ServiceActionDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTagOptionInput {
        var Id: TagOptionId
    }
    interface DescribeTagOptionOutput {
        var TagOptionDetail: TagOptionDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisableAWSOrganizationsAccessInput
    interface DisableAWSOrganizationsAccessOutput
    interface DisassociateBudgetFromResourceInput {
        var BudgetName: BudgetName
        var ResourceId: Id
    }
    interface DisassociateBudgetFromResourceOutput
    interface DisassociatePrincipalFromPortfolioInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var PortfolioId: Id
        var PrincipalARN: PrincipalARN
    }
    interface DisassociatePrincipalFromPortfolioOutput
    interface DisassociateProductFromPortfolioInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var ProductId: Id
        var PortfolioId: Id
    }
    interface DisassociateProductFromPortfolioOutput
    interface DisassociateServiceActionFromProvisioningArtifactInput {
        var ProductId: Id
        var ProvisioningArtifactId: Id
        var ServiceActionId: Id
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateServiceActionFromProvisioningArtifactOutput
    interface DisassociateTagOptionFromResourceInput {
        var ResourceId: ResourceId
        var TagOptionId: TagOptionId
    }
    interface DisassociateTagOptionFromResourceOutput
    interface EnableAWSOrganizationsAccessInput
    interface EnableAWSOrganizationsAccessOutput
    interface ExecuteProvisionedProductPlanInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var PlanId: Id
        var IdempotencyToken: IdempotencyToken
    }
    interface ExecuteProvisionedProductPlanOutput {
        var RecordDetail: RecordDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExecuteProvisionedProductServiceActionInput {
        var ProvisionedProductId: Id
        var ServiceActionId: Id
        var ExecuteToken: IdempotencyToken
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: ExecutionParameterMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExecuteProvisionedProductServiceActionOutput {
        var RecordDetail: RecordDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExecutionParameter {
        var Name: ExecutionParameterKey?
            get() = definedExternally
            set(value) = definedExternally
        var Type: ExecutionParameterType?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultValues: ExecutionParameterValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExecutionParameterMap {
        @nativeGetter
        operator fun get(key: String): ExecutionParameterValueList?
        @nativeSetter
        operator fun set(key: String, value: ExecutionParameterValueList)
    }
    interface FailedServiceActionAssociation {
        var ServiceActionId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ProductId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisioningArtifactId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: String /* "DUPLICATE_RESOURCE" | "INTERNAL_FAILURE" | "LIMIT_EXCEEDED" | "RESOURCE_NOT_FOUND" | "THROTTLING" | String */
        var ErrorMessage: ServiceActionAssociationErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAWSOrganizationsAccessStatusInput
    interface GetAWSOrganizationsAccessStatusOutput {
        var AccessStatus: String /* "ENABLED" | "UNDER_CHANGE" | "DISABLED" | String */
    }
    interface LaunchPathSummary {
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ConstraintSummaries: ConstraintSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var Name: PortfolioName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAcceptedPortfolioSharesInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var PortfolioShareType: String /* "IMPORTED" | "AWS_SERVICECATALOG" | "AWS_ORGANIZATIONS" | String */
    }
    interface ListAcceptedPortfolioSharesOutput {
        var PortfolioDetails: PortfolioDetails?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBudgetsForResourceInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: Id
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBudgetsForResourceOutput {
        var Budgets: Budgets?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConstraintsForPortfolioInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var PortfolioId: Id
        var ProductId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConstraintsForPortfolioOutput {
        var ConstraintDetails: ConstraintDetails?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLaunchPathsInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var ProductId: Id
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLaunchPathsOutput {
        var LaunchPathSummaries: LaunchPathSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOrganizationPortfolioAccessInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var PortfolioId: Id
        var OrganizationNodeType: String /* "ORGANIZATION" | "ORGANIZATIONAL_UNIT" | "ACCOUNT" | String */
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOrganizationPortfolioAccessOutput {
        var OrganizationNodes: OrganizationNodes?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPortfolioAccessInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var PortfolioId: Id
        var OrganizationParentId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPortfolioAccessOutput {
        var AccountIds: AccountIds?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPortfoliosForProductInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var ProductId: Id
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPortfoliosForProductOutput {
        var PortfolioDetails: PortfolioDetails?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPortfoliosInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPortfoliosOutput {
        var PortfolioDetails: PortfolioDetails?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPrincipalsForPortfolioInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var PortfolioId: Id
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPrincipalsForPortfolioOutput {
        var Principals: Principals?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProvisionedProductPlansInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionProductId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
        var AccessLevelFilter: AccessLevelFilter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProvisionedProductPlansOutput {
        var ProvisionedProductPlans: ProvisionedProductPlans?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProvisioningArtifactsForServiceActionInput {
        var ServiceActionId: Id
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProvisioningArtifactsForServiceActionOutput {
        var ProvisioningArtifactViews: ProvisioningArtifactViews?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProvisioningArtifactsInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var ProductId: Id
    }
    interface ListProvisioningArtifactsOutput {
        var ProvisioningArtifactDetails: ProvisioningArtifactDetails?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRecordHistoryInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var AccessLevelFilter: AccessLevelFilter?
            get() = definedExternally
            set(value) = definedExternally
        var SearchFilter: ListRecordHistorySearchFilter?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRecordHistoryOutput {
        var RecordDetails: RecordDetails?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRecordHistorySearchFilter {
        var Key: SearchFilterKey?
            get() = definedExternally
            set(value) = definedExternally
        var Value: SearchFilterValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourcesForTagOptionInput {
        var TagOptionId: TagOptionId
        var ResourceType: ResourceType?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourcesForTagOptionOutput {
        var ResourceDetails: ResourceDetails?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListServiceActionsForProvisioningArtifactInput {
        var ProductId: Id
        var ProvisioningArtifactId: Id
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListServiceActionsForProvisioningArtifactOutput {
        var ServiceActionSummaries: ServiceActionSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListServiceActionsInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListServiceActionsOutput {
        var ServiceActionSummaries: ServiceActionSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStackInstancesForProvisionedProductInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedProductId: Id
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStackInstancesForProvisionedProductOutput {
        var StackInstances: StackInstances?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagOptionsFilters {
        var Key: TagOptionKey?
            get() = definedExternally
            set(value) = definedExternally
        var Value: TagOptionValue?
            get() = definedExternally
            set(value) = definedExternally
        var Active: TagOptionActive?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagOptionsInput {
        var Filters: ListTagOptionsFilters?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagOptionsOutput {
        var TagOptionDetails: TagOptionDetails?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrganizationNode {
        var Type: String /* "ORGANIZATION" | "ORGANIZATIONAL_UNIT" | "ACCOUNT" | String */
        var Value: OrganizationNodeValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ParameterConstraints {
        var AllowedValues: AllowedValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PortfolioDetail {
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: PortfolioDisplayName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: PortfolioDescription?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var ProviderName: ProviderName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Principal {
        var PrincipalARN: PrincipalARN?
            get() = definedExternally
            set(value) = definedExternally
        var PrincipalType: String /* "IAM" | String */
    }
    interface ProductViewAggregationValue {
        var Value: AttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var ApproximateCount: ApproximateCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProductViewAggregations {
        @nativeGetter
        operator fun get(key: String): ProductViewAggregationValues?
        @nativeSetter
        operator fun set(key: String, value: ProductViewAggregationValues)
    }
    interface ProductViewDetail {
        var ProductViewSummary: ProductViewSummary?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "AVAILABLE" | "CREATING" | "FAILED" | String */
        var ProductARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: CreatedTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProductViewFilters {
        @nativeGetter
        operator fun get(key: String): ProductViewFilterValues?
        @nativeSetter
        operator fun set(key: String, value: ProductViewFilterValues)
    }
    interface ProductViewSummary {
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ProductId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ProductViewName?
            get() = definedExternally
            set(value) = definedExternally
        var Owner: ProductViewOwner?
            get() = definedExternally
            set(value) = definedExternally
        var ShortDescription: ProductViewShortDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "CLOUD_FORMATION_TEMPLATE" | "MARKETPLACE" | String */
        var Distributor: ProductViewDistributor?
            get() = definedExternally
            set(value) = definedExternally
        var HasDefaultPath: HasDefaultPath?
            get() = definedExternally
            set(value) = definedExternally
        var SupportEmail: SupportEmail?
            get() = definedExternally
            set(value) = definedExternally
        var SupportDescription: SupportDescription?
            get() = definedExternally
            set(value) = definedExternally
        var SupportUrl: SupportUrl?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProvisionProductInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var ProductId: Id
        var ProvisioningArtifactId: Id
        var PathId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedProductName: ProvisionedProductName
        var ProvisioningParameters: ProvisioningParameters?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisioningPreferences: ProvisioningPreferences?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationArns: NotificationArns?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionToken: IdempotencyToken
    }
    interface ProvisionProductOutput {
        var RecordDetail: RecordDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProvisionedProductAttribute {
        var Name: ProvisionedProductNameOrArn?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: ProvisionedProductNameOrArn?
            get() = definedExternally
            set(value) = definedExternally
        var Type: ProvisionedProductType?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "AVAILABLE" | "UNDER_CHANGE" | "TAINTED" | "ERROR" | "PLAN_IN_PROGRESS" | String */
        var StatusMessage: ProvisionedProductStatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: CreatedTime?
            get() = definedExternally
            set(value) = definedExternally
        var IdempotencyToken: IdempotencyToken?
            get() = definedExternally
            set(value) = definedExternally
        var LastRecordId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var PhysicalId: PhysicalId?
            get() = definedExternally
            set(value) = definedExternally
        var ProductId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisioningArtifactId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var UserArn: UserArn?
            get() = definedExternally
            set(value) = definedExternally
        var UserArnSession: UserArnSession?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProvisionedProductDetail {
        var Name: ProvisionedProductNameOrArn?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: ProvisionedProductNameOrArn?
            get() = definedExternally
            set(value) = definedExternally
        var Type: ProvisionedProductType?
            get() = definedExternally
            set(value) = definedExternally
        var Id: ProvisionedProductId?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "AVAILABLE" | "UNDER_CHANGE" | "TAINTED" | "ERROR" | "PLAN_IN_PROGRESS" | String */
        var StatusMessage: ProvisionedProductStatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: CreatedTime?
            get() = definedExternally
            set(value) = definedExternally
        var IdempotencyToken: IdempotencyToken?
            get() = definedExternally
            set(value) = definedExternally
        var LastRecordId: LastRequestId?
            get() = definedExternally
            set(value) = definedExternally
        var ProductId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisioningArtifactId: Id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProvisionedProductFilters {
        @nativeGetter
        operator fun get(key: String): ProvisionedProductViewFilterValues?
        @nativeSetter
        operator fun set(key: String, value: ProvisionedProductViewFilterValues)
    }
    interface ProvisionedProductPlanDetails {
        var CreatedTime: CreatedTime?
            get() = definedExternally
            set(value) = definedExternally
        var PathId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ProductId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var PlanName: ProvisionedProductPlanName?
            get() = definedExternally
            set(value) = definedExternally
        var PlanId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionProductId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionProductName: ProvisionedProductName?
            get() = definedExternally
            set(value) = definedExternally
        var PlanType: String /* "CLOUDFORMATION" | String */
        var ProvisioningArtifactId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATE_IN_PROGRESS" | "CREATE_SUCCESS" | "CREATE_FAILED" | "EXECUTE_IN_PROGRESS" | "EXECUTE_SUCCESS" | "EXECUTE_FAILED" | String */
        var UpdatedTime: UpdatedTime?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationArns: NotificationArns?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisioningParameters: UpdateProvisioningParameters?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var StatusMessage: StatusMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProvisionedProductPlanSummary {
        var PlanName: ProvisionedProductPlanName?
            get() = definedExternally
            set(value) = definedExternally
        var PlanId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionProductId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionProductName: ProvisionedProductName?
            get() = definedExternally
            set(value) = definedExternally
        var PlanType: String /* "CLOUDFORMATION" | String */
        var ProvisioningArtifactId: Id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProvisionedProductProperties {
        @nativeGetter
        operator fun get(key: String): PropertyValue?
        @nativeSetter
        operator fun set(key: String, value: PropertyValue)
    }
    interface ProvisioningArtifact {
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ProvisioningArtifactName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ProvisioningArtifactDescription?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: ProvisioningArtifactCreatedTime?
            get() = definedExternally
            set(value) = definedExternally
        var Guidance: String /* "DEFAULT" | "DEPRECATED" | String */
    }
    interface ProvisioningArtifactDetail {
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ProvisioningArtifactName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ProvisioningArtifactName?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "CLOUD_FORMATION_TEMPLATE" | "MARKETPLACE_AMI" | "MARKETPLACE_CAR" | String */
        var CreatedTime: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var Active: ProvisioningArtifactActive?
            get() = definedExternally
            set(value) = definedExternally
        var Guidance: String /* "DEFAULT" | "DEPRECATED" | String */
    }
    interface ProvisioningArtifactInfo {
        @nativeGetter
        operator fun get(key: String): ProvisioningArtifactInfoValue?
        @nativeSetter
        operator fun set(key: String, value: ProvisioningArtifactInfoValue)
    }
    interface ProvisioningArtifactParameter {
        var ParameterKey: ParameterKey?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultValue: DefaultValue?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterType: ParameterType?
            get() = definedExternally
            set(value) = definedExternally
        var IsNoEcho: NoEcho?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterConstraints: ParameterConstraints?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProvisioningArtifactPreferences {
        var StackSetAccounts: StackSetAccounts?
            get() = definedExternally
            set(value) = definedExternally
        var StackSetRegions: StackSetRegions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProvisioningArtifactProperties {
        var Name: ProvisioningArtifactName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ProvisioningArtifactDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Info: ProvisioningArtifactInfo
        var Type: String /* "CLOUD_FORMATION_TEMPLATE" | "MARKETPLACE_AMI" | "MARKETPLACE_CAR" | String */
        var DisableTemplateValidation: DisableTemplateValidation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProvisioningArtifactSummary {
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ProvisioningArtifactName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ProvisioningArtifactDescription?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: ProvisioningArtifactCreatedTime?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisioningArtifactMetadata: ProvisioningArtifactInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProvisioningArtifactView {
        var ProductViewSummary: ProductViewSummary?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisioningArtifact: ProvisioningArtifact?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProvisioningParameter {
        var Key: ParameterKey?
            get() = definedExternally
            set(value) = definedExternally
        var Value: ParameterValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProvisioningPreferences {
        var StackSetAccounts: StackSetAccounts?
            get() = definedExternally
            set(value) = definedExternally
        var StackSetRegions: StackSetRegions?
            get() = definedExternally
            set(value) = definedExternally
        var StackSetFailureToleranceCount: StackSetFailureToleranceCount?
            get() = definedExternally
            set(value) = definedExternally
        var StackSetFailureTolerancePercentage: StackSetFailureTolerancePercentage?
            get() = definedExternally
            set(value) = definedExternally
        var StackSetMaxConcurrencyCount: StackSetMaxConcurrencyCount?
            get() = definedExternally
            set(value) = definedExternally
        var StackSetMaxConcurrencyPercentage: StackSetMaxConcurrencyPercentage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecordDetail {
        var RecordId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedProductName: ProvisionedProductName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATED" | "IN_PROGRESS" | "IN_PROGRESS_IN_ERROR" | "SUCCEEDED" | "FAILED" | String */
        var CreatedTime: CreatedTime?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedTime: UpdatedTime?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedProductType: ProvisionedProductType?
            get() = definedExternally
            set(value) = definedExternally
        var RecordType: RecordType?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedProductId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ProductId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisioningArtifactId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var PathId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var RecordErrors: RecordErrors?
            get() = definedExternally
            set(value) = definedExternally
        var RecordTags: RecordTags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecordError {
        var Code: ErrorCode?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ErrorDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecordOutput {
        var OutputKey: OutputKey?
            get() = definedExternally
            set(value) = definedExternally
        var OutputValue: OutputValue?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecordTag {
        var Key: RecordTagKey?
            get() = definedExternally
            set(value) = definedExternally
        var Value: RecordTagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RejectPortfolioShareInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var PortfolioId: Id
        var PortfolioShareType: String /* "IMPORTED" | "AWS_SERVICECATALOG" | "AWS_ORGANIZATIONS" | String */
    }
    interface RejectPortfolioShareOutput
    interface ResourceChange {
        var Action: String /* "ADD" | "MODIFY" | "REMOVE" | String */
        var LogicalResourceId: LogicalResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var PhysicalResourceId: PhysicalResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: PlanResourceType?
            get() = definedExternally
            set(value) = definedExternally
        var Replacement: String /* "TRUE" | "FALSE" | "CONDITIONAL" | String */
        var Scope: Scope?
            get() = definedExternally
            set(value) = definedExternally
        var Details: ResourceChangeDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceChangeDetail {
        var Target: ResourceTargetDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var Evaluation: String /* "STATIC" | "DYNAMIC" | String */
        var CausingEntity: CausingEntity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceDetail {
        var Id: ResourceDetailId?
            get() = definedExternally
            set(value) = definedExternally
        var ARN: ResourceDetailARN?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ResourceDetailName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ResourceDetailDescription?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: ResourceDetailCreatedTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceTargetDefinition {
        var Attribute: String /* "PROPERTIES" | "METADATA" | "CREATIONPOLICY" | "UPDATEPOLICY" | "DELETIONPOLICY" | "TAGS" | String */
        var Name: PropertyName?
            get() = definedExternally
            set(value) = definedExternally
        var RequiresRecreation: String /* "NEVER" | "CONDITIONALLY" | "ALWAYS" | String */
    }
    interface ScanProvisionedProductsInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var AccessLevelFilter: AccessLevelFilter?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScanProvisionedProductsOutput {
        var ProvisionedProducts: ProvisionedProductDetails?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchProductsAsAdminInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var PortfolioId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: ProductViewFilters?
            get() = definedExternally
            set(value) = definedExternally
        var SortBy: String /* "Title" | "VersionCount" | "CreationDate" | String */
        var SortOrder: String /* "ASCENDING" | "DESCENDING" | String */
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var ProductSource: String /* "ACCOUNT" | String */
    }
    interface SearchProductsAsAdminOutput {
        var ProductViewDetails: ProductViewDetails?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchProductsInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: ProductViewFilters?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var SortBy: String /* "Title" | "VersionCount" | "CreationDate" | String */
        var SortOrder: String /* "ASCENDING" | "DESCENDING" | String */
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchProductsOutput {
        var ProductViewSummaries: ProductViewSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var ProductViewAggregations: ProductViewAggregations?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchProvisionedProductsInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var AccessLevelFilter: AccessLevelFilter?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: ProvisionedProductFilters?
            get() = definedExternally
            set(value) = definedExternally
        var SortBy: SortField?
            get() = definedExternally
            set(value) = definedExternally
        var SortOrder: String /* "ASCENDING" | "DESCENDING" | String */
        var PageSize: SearchProvisionedProductsPageSize?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchProvisionedProductsOutput {
        var ProvisionedProducts: ProvisionedProductAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var TotalResultsCount: TotalResultsCount?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServiceActionAssociation {
        var ServiceActionId: Id
        var ProductId: Id
        var ProvisioningArtifactId: Id
    }
    interface ServiceActionDefinitionMap {
        @nativeGetter
        operator fun get(key: String): ServiceActionDefinitionValue?
        @nativeSetter
        operator fun set(key: String, value: ServiceActionDefinitionValue)
    }
    interface ServiceActionDetail {
        var ServiceActionSummary: ServiceActionSummary?
            get() = definedExternally
            set(value) = definedExternally
        var Definition: ServiceActionDefinitionMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServiceActionSummary {
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ServiceActionName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ServiceActionDescription?
            get() = definedExternally
            set(value) = definedExternally
        var DefinitionType: String /* "SSM_AUTOMATION" | String */
    }
    interface ShareDetails {
        var SuccessfulShares: SuccessfulShares?
            get() = definedExternally
            set(value) = definedExternally
        var ShareErrors: ShareErrors?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ShareError {
        var Accounts: Namespaces?
            get() = definedExternally
            set(value) = definedExternally
        var Message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var Error: Error?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SourceProvisioningArtifactPropertiesMap {
        @nativeGetter
        operator fun get(key: String): ProvisioningArtifactPropertyValue?
        @nativeSetter
        operator fun set(key: String, value: ProvisioningArtifactPropertyValue)
    }
    interface StackInstance {
        var Account: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var Region: Region?
            get() = definedExternally
            set(value) = definedExternally
        var StackInstanceStatus: String /* "CURRENT" | "OUTDATED" | "INOPERABLE" | String */
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface TagOptionDetail {
        var Key: TagOptionKey?
            get() = definedExternally
            set(value) = definedExternally
        var Value: TagOptionValue?
            get() = definedExternally
            set(value) = definedExternally
        var Active: TagOptionActive?
            get() = definedExternally
            set(value) = definedExternally
        var Id: TagOptionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagOptionSummary {
        var Key: TagOptionKey?
            get() = definedExternally
            set(value) = definedExternally
        var Values: TagOptionValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TerminateProvisionedProductInput {
        var ProvisionedProductName: ProvisionedProductNameOrArn?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedProductId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var TerminateToken: IdempotencyToken
        var IgnoreErrors: IgnoreErrors?
            get() = definedExternally
            set(value) = definedExternally
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TerminateProvisionedProductOutput {
        var RecordDetail: RecordDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateConstraintInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id
        var Description: ConstraintDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: ConstraintParameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateConstraintOutput {
        var ConstraintDetail: ConstraintDetail?
            get() = definedExternally
            set(value) = definedExternally
        var ConstraintParameters: ConstraintParameters?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "AVAILABLE" | "CREATING" | "FAILED" | String */
    }
    interface UpdatePortfolioInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id
        var DisplayName: PortfolioDisplayName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: PortfolioDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ProviderName: ProviderName?
            get() = definedExternally
            set(value) = definedExternally
        var AddTags: AddTags?
            get() = definedExternally
            set(value) = definedExternally
        var RemoveTags: TagKeys?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdatePortfolioOutput {
        var PortfolioDetail: PortfolioDetail?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateProductInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id
        var Name: ProductViewName?
            get() = definedExternally
            set(value) = definedExternally
        var Owner: ProductViewOwner?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ProductViewShortDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Distributor: ProductViewOwner?
            get() = definedExternally
            set(value) = definedExternally
        var SupportDescription: SupportDescription?
            get() = definedExternally
            set(value) = definedExternally
        var SupportEmail: SupportEmail?
            get() = definedExternally
            set(value) = definedExternally
        var SupportUrl: SupportUrl?
            get() = definedExternally
            set(value) = definedExternally
        var AddTags: AddTags?
            get() = definedExternally
            set(value) = definedExternally
        var RemoveTags: TagKeys?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateProductOutput {
        var ProductViewDetail: ProductViewDetail?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateProvisionedProductInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedProductName: ProvisionedProductNameOrArn?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedProductId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ProductId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisioningArtifactId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var PathId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisioningParameters: UpdateProvisioningParameters?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisioningPreferences: UpdateProvisioningPreferences?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var UpdateToken: IdempotencyToken
    }
    interface UpdateProvisionedProductOutput {
        var RecordDetail: RecordDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateProvisionedProductPropertiesInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedProductId: Id
        var ProvisionedProductProperties: ProvisionedProductProperties
        var IdempotencyToken: IdempotencyToken
    }
    interface UpdateProvisionedProductPropertiesOutput {
        var ProvisionedProductId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisionedProductProperties: ProvisionedProductProperties?
            get() = definedExternally
            set(value) = definedExternally
        var RecordId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATED" | "IN_PROGRESS" | "IN_PROGRESS_IN_ERROR" | "SUCCEEDED" | "FAILED" | String */
    }
    interface UpdateProvisioningArtifactInput {
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
        var ProductId: Id
        var ProvisioningArtifactId: Id
        var Name: ProvisioningArtifactName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ProvisioningArtifactDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Active: ProvisioningArtifactActive?
            get() = definedExternally
            set(value) = definedExternally
        var Guidance: String /* "DEFAULT" | "DEPRECATED" | String */
    }
    interface UpdateProvisioningArtifactOutput {
        var ProvisioningArtifactDetail: ProvisioningArtifactDetail?
            get() = definedExternally
            set(value) = definedExternally
        var Info: ProvisioningArtifactInfo?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "AVAILABLE" | "CREATING" | "FAILED" | String */
    }
    interface UpdateProvisioningParameter {
        var Key: ParameterKey?
            get() = definedExternally
            set(value) = definedExternally
        var Value: ParameterValue?
            get() = definedExternally
            set(value) = definedExternally
        var UsePreviousValue: UsePreviousValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateProvisioningPreferences {
        var StackSetAccounts: StackSetAccounts?
            get() = definedExternally
            set(value) = definedExternally
        var StackSetRegions: StackSetRegions?
            get() = definedExternally
            set(value) = definedExternally
        var StackSetFailureToleranceCount: StackSetFailureToleranceCount?
            get() = definedExternally
            set(value) = definedExternally
        var StackSetFailureTolerancePercentage: StackSetFailureTolerancePercentage?
            get() = definedExternally
            set(value) = definedExternally
        var StackSetMaxConcurrencyCount: StackSetMaxConcurrencyCount?
            get() = definedExternally
            set(value) = definedExternally
        var StackSetMaxConcurrencyPercentage: StackSetMaxConcurrencyPercentage?
            get() = definedExternally
            set(value) = definedExternally
        var StackSetOperationType: String /* "CREATE" | "UPDATE" | "DELETE" | String */
    }
    interface UpdateServiceActionInput {
        var Id: Id
        var Name: ServiceActionName?
            get() = definedExternally
            set(value) = definedExternally
        var Definition: ServiceActionDefinitionMap?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ServiceActionDescription?
            get() = definedExternally
            set(value) = definedExternally
        var AcceptLanguage: AcceptLanguage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateServiceActionOutput {
        var ServiceActionDetail: ServiceActionDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTagOptionInput {
        var Id: TagOptionId
        var Value: TagOptionValue?
            get() = definedExternally
            set(value) = definedExternally
        var Active: TagOptionActive?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTagOptionOutput {
        var TagOptionDetail: TagOptionDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UsageInstruction {
        var Type: InstructionType?
            get() = definedExternally
            set(value) = definedExternally
        var Value: InstructionValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2015-12-10" | "latest" | String */
    }
}