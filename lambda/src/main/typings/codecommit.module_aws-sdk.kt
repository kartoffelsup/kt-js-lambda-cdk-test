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
import CodeCommit.Approval
import CodeCommit.ApprovalRule
import CodeCommit.BatchAssociateApprovalRuleTemplateWithRepositoriesError
import CodeCommit.BatchDescribeMergeConflictsError
import CodeCommit.BatchDisassociateApprovalRuleTemplateFromRepositoriesError
import CodeCommit.BatchGetCommitsError
import CodeCommit.Comment
import CodeCommit.CommentsForComparedCommit
import CodeCommit.CommentsForPullRequest
import CodeCommit.Commit
import CodeCommit.ConflictMetadata
import CodeCommit.Conflict
import CodeCommit.DeleteFileEntry
import CodeCommit.Difference
import CodeCommit.File
import CodeCommit.FileMetadata
import CodeCommit.Folder
import CodeCommit.MergeHunk
import CodeCommit.PullRequestEvent
import CodeCommit.PullRequestTarget
import CodeCommit.PutFileEntry
import CodeCommit.ReplaceContentEntry
import CodeCommit.RepositoryMetadata
import CodeCommit.RepositoryNameIdPair
import CodeCommit.RepositoryTriggerExecutionFailure
import CodeCommit.RepositoryTrigger
import CodeCommit.SetFileModeEntry
import CodeCommit.SubModule
import CodeCommit.SymbolicLink
import CodeCommit.Target
import CodeCommit.AssociateApprovalRuleTemplateWithRepositoryInput
import CodeCommit.BatchAssociateApprovalRuleTemplateWithRepositoriesInput
import CodeCommit.BatchAssociateApprovalRuleTemplateWithRepositoriesOutput
import CodeCommit.BatchDescribeMergeConflictsInput
import CodeCommit.BatchDescribeMergeConflictsOutput
import CodeCommit.BatchDisassociateApprovalRuleTemplateFromRepositoriesInput
import CodeCommit.BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput
import CodeCommit.BatchGetCommitsInput
import CodeCommit.BatchGetCommitsOutput
import CodeCommit.BatchGetRepositoriesInput
import CodeCommit.BatchGetRepositoriesOutput
import CodeCommit.CreateApprovalRuleTemplateInput
import CodeCommit.CreateApprovalRuleTemplateOutput
import CodeCommit.CreateBranchInput
import CodeCommit.CreateCommitInput
import CodeCommit.CreateCommitOutput
import CodeCommit.CreatePullRequestInput
import CodeCommit.CreatePullRequestOutput
import CodeCommit.CreatePullRequestApprovalRuleInput
import CodeCommit.CreatePullRequestApprovalRuleOutput
import CodeCommit.CreateRepositoryInput
import CodeCommit.CreateRepositoryOutput
import CodeCommit.CreateUnreferencedMergeCommitInput
import CodeCommit.CreateUnreferencedMergeCommitOutput
import CodeCommit.DeleteApprovalRuleTemplateInput
import CodeCommit.DeleteApprovalRuleTemplateOutput
import CodeCommit.DeleteBranchInput
import CodeCommit.DeleteBranchOutput
import CodeCommit.DeleteCommentContentInput
import CodeCommit.DeleteCommentContentOutput
import CodeCommit.DeleteFileInput
import CodeCommit.DeleteFileOutput
import CodeCommit.DeletePullRequestApprovalRuleInput
import CodeCommit.DeletePullRequestApprovalRuleOutput
import CodeCommit.DeleteRepositoryInput
import CodeCommit.DeleteRepositoryOutput
import CodeCommit.DescribeMergeConflictsInput
import CodeCommit.DescribeMergeConflictsOutput
import CodeCommit.DescribePullRequestEventsInput
import CodeCommit.DescribePullRequestEventsOutput
import CodeCommit.DisassociateApprovalRuleTemplateFromRepositoryInput
import CodeCommit.EvaluatePullRequestApprovalRulesInput
import CodeCommit.EvaluatePullRequestApprovalRulesOutput
import CodeCommit.GetApprovalRuleTemplateInput
import CodeCommit.GetApprovalRuleTemplateOutput
import CodeCommit.GetBlobInput
import CodeCommit.GetBlobOutput
import CodeCommit.GetBranchInput
import CodeCommit.GetBranchOutput
import CodeCommit.GetCommentInput
import CodeCommit.GetCommentOutput
import CodeCommit.GetCommentsForComparedCommitInput
import CodeCommit.GetCommentsForComparedCommitOutput
import CodeCommit.GetCommentsForPullRequestInput
import CodeCommit.GetCommentsForPullRequestOutput
import CodeCommit.GetCommitInput
import CodeCommit.GetCommitOutput
import CodeCommit.GetDifferencesInput
import CodeCommit.GetDifferencesOutput
import CodeCommit.GetFileInput
import CodeCommit.GetFileOutput
import CodeCommit.GetFolderInput
import CodeCommit.GetFolderOutput
import CodeCommit.GetMergeCommitInput
import CodeCommit.GetMergeCommitOutput
import CodeCommit.GetMergeConflictsInput
import CodeCommit.GetMergeConflictsOutput
import CodeCommit.GetMergeOptionsInput
import CodeCommit.GetMergeOptionsOutput
import CodeCommit.GetPullRequestInput
import CodeCommit.GetPullRequestOutput
import CodeCommit.GetPullRequestApprovalStatesInput
import CodeCommit.GetPullRequestApprovalStatesOutput
import CodeCommit.GetPullRequestOverrideStateInput
import CodeCommit.GetPullRequestOverrideStateOutput
import CodeCommit.GetRepositoryInput
import CodeCommit.GetRepositoryOutput
import CodeCommit.GetRepositoryTriggersInput
import CodeCommit.GetRepositoryTriggersOutput
import CodeCommit.ListApprovalRuleTemplatesInput
import CodeCommit.ListApprovalRuleTemplatesOutput
import CodeCommit.ListAssociatedApprovalRuleTemplatesForRepositoryInput
import CodeCommit.ListAssociatedApprovalRuleTemplatesForRepositoryOutput
import CodeCommit.ListBranchesInput
import CodeCommit.ListBranchesOutput
import CodeCommit.ListPullRequestsInput
import CodeCommit.ListPullRequestsOutput
import CodeCommit.ListRepositoriesInput
import CodeCommit.ListRepositoriesOutput
import CodeCommit.ListRepositoriesForApprovalRuleTemplateInput
import CodeCommit.ListRepositoriesForApprovalRuleTemplateOutput
import CodeCommit.ListTagsForResourceInput
import CodeCommit.ListTagsForResourceOutput
import CodeCommit.MergeBranchesByFastForwardInput
import CodeCommit.MergeBranchesByFastForwardOutput
import CodeCommit.MergeBranchesBySquashInput
import CodeCommit.MergeBranchesBySquashOutput
import CodeCommit.MergeBranchesByThreeWayInput
import CodeCommit.MergeBranchesByThreeWayOutput
import CodeCommit.MergePullRequestByFastForwardInput
import CodeCommit.MergePullRequestByFastForwardOutput
import CodeCommit.MergePullRequestBySquashInput
import CodeCommit.MergePullRequestBySquashOutput
import CodeCommit.MergePullRequestByThreeWayInput
import CodeCommit.MergePullRequestByThreeWayOutput
import CodeCommit.OverridePullRequestApprovalRulesInput
import CodeCommit.PostCommentForComparedCommitInput
import CodeCommit.PostCommentForComparedCommitOutput
import CodeCommit.PostCommentForPullRequestInput
import CodeCommit.PostCommentForPullRequestOutput
import CodeCommit.PostCommentReplyInput
import CodeCommit.PostCommentReplyOutput
import CodeCommit.PutFileInput
import CodeCommit.PutFileOutput
import CodeCommit.PutRepositoryTriggersInput
import CodeCommit.PutRepositoryTriggersOutput
import CodeCommit.TagResourceInput
import CodeCommit.TestRepositoryTriggersInput
import CodeCommit.TestRepositoryTriggersOutput
import CodeCommit.UntagResourceInput
import CodeCommit.UpdateApprovalRuleTemplateContentInput
import CodeCommit.UpdateApprovalRuleTemplateContentOutput
import CodeCommit.UpdateApprovalRuleTemplateDescriptionInput
import CodeCommit.UpdateApprovalRuleTemplateDescriptionOutput
import CodeCommit.UpdateApprovalRuleTemplateNameInput
import CodeCommit.UpdateApprovalRuleTemplateNameOutput
import CodeCommit.UpdateCommentInput
import CodeCommit.UpdateCommentOutput
import CodeCommit.UpdateDefaultBranchInput
import CodeCommit.UpdatePullRequestApprovalRuleContentInput
import CodeCommit.UpdatePullRequestApprovalRuleContentOutput
import CodeCommit.UpdatePullRequestApprovalStateInput
import CodeCommit.UpdatePullRequestDescriptionInput
import CodeCommit.UpdatePullRequestDescriptionOutput
import CodeCommit.UpdatePullRequestStatusInput
import CodeCommit.UpdatePullRequestStatusOutput
import CodeCommit.UpdatePullRequestTitleInput
import CodeCommit.UpdatePullRequestTitleOutput
import CodeCommit.UpdateRepositoryDescriptionInput
import CodeCommit.UpdateRepositoryNameInput
import CodeCommit.OriginApprovalRuleTemplate
import CodeCommit.Location
import CodeCommit.UserInfo
import CodeCommit.FileSizes
import CodeCommit.FileModes
import CodeCommit.ObjectTypes
import CodeCommit.IsBinaryFile
import CodeCommit.MergeOperations
import CodeCommit.ApprovalRuleTemplate
import CodeCommit.PullRequest
import CodeCommit.TagsMap
import CodeCommit.ConflictResolution
import CodeCommit.BranchInfo
import CodeCommit.BlobMetadata
import CodeCommit.Evaluation
import CodeCommit.MergeHunkDetail
import CodeCommit.PullRequestCreatedEventMetadata
import CodeCommit.PullRequestStatusChangedEventMetadata
import CodeCommit.PullRequestSourceReferenceUpdatedEventMetadata
import CodeCommit.PullRequestMergedStateChangedEventMetadata
import CodeCommit.ApprovalRuleEventMetadata
import CodeCommit.ApprovalStateChangedEventMetadata
import CodeCommit.ApprovalRuleOverriddenEventMetadata
import CodeCommit.MergeMetadata
import CodeCommit.SourceFileSpecifier

typealias AccountId = String

typealias AdditionalData = String

typealias ApprovalList = Array<Approval>

typealias ApprovalRuleContent = String

typealias ApprovalRuleId = String

typealias ApprovalRuleName = String

typealias ApprovalRuleTemplateContent = String

typealias ApprovalRuleTemplateDescription = String

typealias ApprovalRuleTemplateId = String

typealias ApprovalRuleTemplateName = String

typealias ApprovalRuleTemplateNameList = Array<ApprovalRuleTemplateName>

typealias ApprovalRulesList = Array<ApprovalRule>

typealias ApprovalRulesNotSatisfiedList = Array<ApprovalRuleName>

typealias ApprovalRulesSatisfiedList = Array<ApprovalRuleName>

typealias Approved = Boolean

typealias Arn = String

typealias BatchAssociateApprovalRuleTemplateWithRepositoriesErrorsList = Array<BatchAssociateApprovalRuleTemplateWithRepositoriesError>

typealias BatchDescribeMergeConflictsErrors = Array<BatchDescribeMergeConflictsError>

typealias BatchDisassociateApprovalRuleTemplateFromRepositoriesErrorsList = Array<BatchDisassociateApprovalRuleTemplateFromRepositoriesError>

typealias BatchGetCommitsErrorsList = Array<BatchGetCommitsError>

typealias BranchName = String

typealias BranchNameList = Array<BranchName>

typealias CapitalBoolean = Boolean

typealias ClientRequestToken = String

typealias CloneUrlHttp = String

typealias CloneUrlSsh = String

typealias CommentId = String

typealias Comments = Array<Comment>

typealias CommentsForComparedCommitData = Array<CommentsForComparedCommit>

typealias CommentsForPullRequestData = Array<CommentsForPullRequest>

typealias CommitId = String

typealias CommitIdsInputList = Array<ObjectId>

typealias CommitName = String

typealias CommitObjectsList = Array<Commit>

typealias ConflictMetadataList = Array<ConflictMetadata>

typealias Conflicts = Array<Conflict>

typealias Content = String

typealias CreationDate = Date

typealias _Date = String

typealias DeleteFileEntries = Array<DeleteFileEntry>

typealias Description = String

typealias DifferenceList = Array<Difference>

typealias Email = String

typealias ErrorCode = String

typealias ErrorMessage = String

typealias EventDate = Date

typealias ExceptionName = String

typealias FileList = Array<File>

typealias FilePaths = Array<Path>

typealias FileSize = Number

typealias FilesMetadata = Array<FileMetadata>

typealias FolderList = Array<Folder>

typealias HunkContent = String

typealias IsCommentDeleted = Boolean

typealias IsContentConflict = Boolean

typealias IsFileModeConflict = Boolean

typealias IsHunkConflict = Boolean

typealias IsMergeable = Boolean

typealias IsMerged = Boolean

typealias IsMove = Boolean

typealias IsObjectTypeConflict = Boolean

typealias KeepEmptyFolders = Boolean

typealias LastModifiedDate = Date

typealias Limit = Number

typealias LineNumber = Number

typealias MaxResults = Number

typealias MergeHunks = Array<MergeHunk>

typealias MergeOptions = Array<String /* "FAST_FORWARD_MERGE" | "SQUASH_MERGE" | "THREE_WAY_MERGE" | String */>

typealias Message = String

typealias Mode = String

typealias Name = String

typealias NextToken = String

typealias NumberOfConflicts = Number

typealias ObjectId = String

typealias ObjectSize = Number

typealias Overridden = Boolean

typealias ParentList = Array<ObjectId>

typealias Path = String

typealias Position = Number

typealias PullRequestEventList = Array<PullRequestEvent>

typealias PullRequestId = String

typealias PullRequestIdList = Array<PullRequestId>

typealias PullRequestTargetList = Array<PullRequestTarget>

typealias PutFileEntries = Array<PutFileEntry>

typealias ReferenceName = String

typealias ReplaceContentEntries = Array<ReplaceContentEntry>

typealias RepositoryDescription = String

typealias RepositoryId = String

typealias RepositoryMetadataList = Array<RepositoryMetadata>

typealias RepositoryName = String

typealias RepositoryNameIdPairList = Array<RepositoryNameIdPair>

typealias RepositoryNameList = Array<RepositoryName>

typealias RepositoryNotFoundList = Array<RepositoryName>

typealias RepositoryTriggerCustomData = String

typealias RepositoryTriggerEventList = Array<String /* "all" | "updateReference" | "createReference" | "deleteReference" | String */>

typealias RepositoryTriggerExecutionFailureList = Array<RepositoryTriggerExecutionFailure>

typealias RepositoryTriggerExecutionFailureMessage = String

typealias RepositoryTriggerName = String

typealias RepositoryTriggerNameList = Array<RepositoryTriggerName>

typealias RepositoryTriggersConfigurationId = String

typealias RepositoryTriggersList = Array<RepositoryTrigger>

typealias ResourceArn = String

typealias RevisionId = String

typealias RuleContentSha256 = String

typealias SetFileModeEntries = Array<SetFileModeEntry>

typealias SubModuleList = Array<SubModule>

typealias SymbolicLinkList = Array<SymbolicLink>

typealias TagKey = String

typealias TagKeysList = Array<TagKey>

typealias TagValue = String

typealias TargetList = Array<Target>

typealias Title = String

@JsModule("aws-sdk")
external open class CodeCommit(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CodeCommit.Types.ClientConfiguration */
    open fun associateApprovalRuleTemplateWithRepository(params: AssociateApprovalRuleTemplateWithRepositoryInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun associateApprovalRuleTemplateWithRepository(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun batchAssociateApprovalRuleTemplateWithRepositories(params: BatchAssociateApprovalRuleTemplateWithRepositoriesInput, callback: (err: AWSError, data: BatchAssociateApprovalRuleTemplateWithRepositoriesOutput) -> Unit = definedExternally): Request<BatchAssociateApprovalRuleTemplateWithRepositoriesOutput, AWSError>
    open fun batchAssociateApprovalRuleTemplateWithRepositories(callback: (err: AWSError, data: BatchAssociateApprovalRuleTemplateWithRepositoriesOutput) -> Unit = definedExternally): Request<BatchAssociateApprovalRuleTemplateWithRepositoriesOutput, AWSError>
    open fun batchDescribeMergeConflicts(params: BatchDescribeMergeConflictsInput, callback: (err: AWSError, data: BatchDescribeMergeConflictsOutput) -> Unit = definedExternally): Request<BatchDescribeMergeConflictsOutput, AWSError>
    open fun batchDescribeMergeConflicts(callback: (err: AWSError, data: BatchDescribeMergeConflictsOutput) -> Unit = definedExternally): Request<BatchDescribeMergeConflictsOutput, AWSError>
    open fun batchDisassociateApprovalRuleTemplateFromRepositories(params: BatchDisassociateApprovalRuleTemplateFromRepositoriesInput, callback: (err: AWSError, data: BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput) -> Unit = definedExternally): Request<BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput, AWSError>
    open fun batchDisassociateApprovalRuleTemplateFromRepositories(callback: (err: AWSError, data: BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput) -> Unit = definedExternally): Request<BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput, AWSError>
    open fun batchGetCommits(params: BatchGetCommitsInput, callback: (err: AWSError, data: BatchGetCommitsOutput) -> Unit = definedExternally): Request<BatchGetCommitsOutput, AWSError>
    open fun batchGetCommits(callback: (err: AWSError, data: BatchGetCommitsOutput) -> Unit = definedExternally): Request<BatchGetCommitsOutput, AWSError>
    open fun batchGetRepositories(params: BatchGetRepositoriesInput, callback: (err: AWSError, data: BatchGetRepositoriesOutput) -> Unit = definedExternally): Request<BatchGetRepositoriesOutput, AWSError>
    open fun batchGetRepositories(callback: (err: AWSError, data: BatchGetRepositoriesOutput) -> Unit = definedExternally): Request<BatchGetRepositoriesOutput, AWSError>
    open fun createApprovalRuleTemplate(params: CreateApprovalRuleTemplateInput, callback: (err: AWSError, data: CreateApprovalRuleTemplateOutput) -> Unit = definedExternally): Request<CreateApprovalRuleTemplateOutput, AWSError>
    open fun createApprovalRuleTemplate(callback: (err: AWSError, data: CreateApprovalRuleTemplateOutput) -> Unit = definedExternally): Request<CreateApprovalRuleTemplateOutput, AWSError>
    open fun createBranch(params: CreateBranchInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createBranch(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createCommit(params: CreateCommitInput, callback: (err: AWSError, data: CreateCommitOutput) -> Unit = definedExternally): Request<CreateCommitOutput, AWSError>
    open fun createCommit(callback: (err: AWSError, data: CreateCommitOutput) -> Unit = definedExternally): Request<CreateCommitOutput, AWSError>
    open fun createPullRequest(params: CreatePullRequestInput, callback: (err: AWSError, data: CreatePullRequestOutput) -> Unit = definedExternally): Request<CreatePullRequestOutput, AWSError>
    open fun createPullRequest(callback: (err: AWSError, data: CreatePullRequestOutput) -> Unit = definedExternally): Request<CreatePullRequestOutput, AWSError>
    open fun createPullRequestApprovalRule(params: CreatePullRequestApprovalRuleInput, callback: (err: AWSError, data: CreatePullRequestApprovalRuleOutput) -> Unit = definedExternally): Request<CreatePullRequestApprovalRuleOutput, AWSError>
    open fun createPullRequestApprovalRule(callback: (err: AWSError, data: CreatePullRequestApprovalRuleOutput) -> Unit = definedExternally): Request<CreatePullRequestApprovalRuleOutput, AWSError>
    open fun createRepository(params: CreateRepositoryInput, callback: (err: AWSError, data: CreateRepositoryOutput) -> Unit = definedExternally): Request<CreateRepositoryOutput, AWSError>
    open fun createRepository(callback: (err: AWSError, data: CreateRepositoryOutput) -> Unit = definedExternally): Request<CreateRepositoryOutput, AWSError>
    open fun createUnreferencedMergeCommit(params: CreateUnreferencedMergeCommitInput, callback: (err: AWSError, data: CreateUnreferencedMergeCommitOutput) -> Unit = definedExternally): Request<CreateUnreferencedMergeCommitOutput, AWSError>
    open fun createUnreferencedMergeCommit(callback: (err: AWSError, data: CreateUnreferencedMergeCommitOutput) -> Unit = definedExternally): Request<CreateUnreferencedMergeCommitOutput, AWSError>
    open fun deleteApprovalRuleTemplate(params: DeleteApprovalRuleTemplateInput, callback: (err: AWSError, data: DeleteApprovalRuleTemplateOutput) -> Unit = definedExternally): Request<DeleteApprovalRuleTemplateOutput, AWSError>
    open fun deleteApprovalRuleTemplate(callback: (err: AWSError, data: DeleteApprovalRuleTemplateOutput) -> Unit = definedExternally): Request<DeleteApprovalRuleTemplateOutput, AWSError>
    open fun deleteBranch(params: DeleteBranchInput, callback: (err: AWSError, data: DeleteBranchOutput) -> Unit = definedExternally): Request<DeleteBranchOutput, AWSError>
    open fun deleteBranch(callback: (err: AWSError, data: DeleteBranchOutput) -> Unit = definedExternally): Request<DeleteBranchOutput, AWSError>
    open fun deleteCommentContent(params: DeleteCommentContentInput, callback: (err: AWSError, data: DeleteCommentContentOutput) -> Unit = definedExternally): Request<DeleteCommentContentOutput, AWSError>
    open fun deleteCommentContent(callback: (err: AWSError, data: DeleteCommentContentOutput) -> Unit = definedExternally): Request<DeleteCommentContentOutput, AWSError>
    open fun deleteFile(params: DeleteFileInput, callback: (err: AWSError, data: DeleteFileOutput) -> Unit = definedExternally): Request<DeleteFileOutput, AWSError>
    open fun deleteFile(callback: (err: AWSError, data: DeleteFileOutput) -> Unit = definedExternally): Request<DeleteFileOutput, AWSError>
    open fun deletePullRequestApprovalRule(params: DeletePullRequestApprovalRuleInput, callback: (err: AWSError, data: DeletePullRequestApprovalRuleOutput) -> Unit = definedExternally): Request<DeletePullRequestApprovalRuleOutput, AWSError>
    open fun deletePullRequestApprovalRule(callback: (err: AWSError, data: DeletePullRequestApprovalRuleOutput) -> Unit = definedExternally): Request<DeletePullRequestApprovalRuleOutput, AWSError>
    open fun deleteRepository(params: DeleteRepositoryInput, callback: (err: AWSError, data: DeleteRepositoryOutput) -> Unit = definedExternally): Request<DeleteRepositoryOutput, AWSError>
    open fun deleteRepository(callback: (err: AWSError, data: DeleteRepositoryOutput) -> Unit = definedExternally): Request<DeleteRepositoryOutput, AWSError>
    open fun describeMergeConflicts(params: DescribeMergeConflictsInput, callback: (err: AWSError, data: DescribeMergeConflictsOutput) -> Unit = definedExternally): Request<DescribeMergeConflictsOutput, AWSError>
    open fun describeMergeConflicts(callback: (err: AWSError, data: DescribeMergeConflictsOutput) -> Unit = definedExternally): Request<DescribeMergeConflictsOutput, AWSError>
    open fun describePullRequestEvents(params: DescribePullRequestEventsInput, callback: (err: AWSError, data: DescribePullRequestEventsOutput) -> Unit = definedExternally): Request<DescribePullRequestEventsOutput, AWSError>
    open fun describePullRequestEvents(callback: (err: AWSError, data: DescribePullRequestEventsOutput) -> Unit = definedExternally): Request<DescribePullRequestEventsOutput, AWSError>
    open fun disassociateApprovalRuleTemplateFromRepository(params: DisassociateApprovalRuleTemplateFromRepositoryInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disassociateApprovalRuleTemplateFromRepository(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun evaluatePullRequestApprovalRules(params: EvaluatePullRequestApprovalRulesInput, callback: (err: AWSError, data: EvaluatePullRequestApprovalRulesOutput) -> Unit = definedExternally): Request<EvaluatePullRequestApprovalRulesOutput, AWSError>
    open fun evaluatePullRequestApprovalRules(callback: (err: AWSError, data: EvaluatePullRequestApprovalRulesOutput) -> Unit = definedExternally): Request<EvaluatePullRequestApprovalRulesOutput, AWSError>
    open fun getApprovalRuleTemplate(params: GetApprovalRuleTemplateInput, callback: (err: AWSError, data: GetApprovalRuleTemplateOutput) -> Unit = definedExternally): Request<GetApprovalRuleTemplateOutput, AWSError>
    open fun getApprovalRuleTemplate(callback: (err: AWSError, data: GetApprovalRuleTemplateOutput) -> Unit = definedExternally): Request<GetApprovalRuleTemplateOutput, AWSError>
    open fun getBlob(params: GetBlobInput, callback: (err: AWSError, data: GetBlobOutput) -> Unit = definedExternally): Request<GetBlobOutput, AWSError>
    open fun getBlob(callback: (err: AWSError, data: GetBlobOutput) -> Unit = definedExternally): Request<GetBlobOutput, AWSError>
    open fun getBranch(params: GetBranchInput, callback: (err: AWSError, data: GetBranchOutput) -> Unit = definedExternally): Request<GetBranchOutput, AWSError>
    open fun getBranch(callback: (err: AWSError, data: GetBranchOutput) -> Unit = definedExternally): Request<GetBranchOutput, AWSError>
    open fun getComment(params: GetCommentInput, callback: (err: AWSError, data: GetCommentOutput) -> Unit = definedExternally): Request<GetCommentOutput, AWSError>
    open fun getComment(callback: (err: AWSError, data: GetCommentOutput) -> Unit = definedExternally): Request<GetCommentOutput, AWSError>
    open fun getCommentsForComparedCommit(params: GetCommentsForComparedCommitInput, callback: (err: AWSError, data: GetCommentsForComparedCommitOutput) -> Unit = definedExternally): Request<GetCommentsForComparedCommitOutput, AWSError>
    open fun getCommentsForComparedCommit(callback: (err: AWSError, data: GetCommentsForComparedCommitOutput) -> Unit = definedExternally): Request<GetCommentsForComparedCommitOutput, AWSError>
    open fun getCommentsForPullRequest(params: GetCommentsForPullRequestInput, callback: (err: AWSError, data: GetCommentsForPullRequestOutput) -> Unit = definedExternally): Request<GetCommentsForPullRequestOutput, AWSError>
    open fun getCommentsForPullRequest(callback: (err: AWSError, data: GetCommentsForPullRequestOutput) -> Unit = definedExternally): Request<GetCommentsForPullRequestOutput, AWSError>
    open fun getCommit(params: GetCommitInput, callback: (err: AWSError, data: GetCommitOutput) -> Unit = definedExternally): Request<GetCommitOutput, AWSError>
    open fun getCommit(callback: (err: AWSError, data: GetCommitOutput) -> Unit = definedExternally): Request<GetCommitOutput, AWSError>
    open fun getDifferences(params: GetDifferencesInput, callback: (err: AWSError, data: GetDifferencesOutput) -> Unit = definedExternally): Request<GetDifferencesOutput, AWSError>
    open fun getDifferences(callback: (err: AWSError, data: GetDifferencesOutput) -> Unit = definedExternally): Request<GetDifferencesOutput, AWSError>
    open fun getFile(params: GetFileInput, callback: (err: AWSError, data: GetFileOutput) -> Unit = definedExternally): Request<GetFileOutput, AWSError>
    open fun getFile(callback: (err: AWSError, data: GetFileOutput) -> Unit = definedExternally): Request<GetFileOutput, AWSError>
    open fun getFolder(params: GetFolderInput, callback: (err: AWSError, data: GetFolderOutput) -> Unit = definedExternally): Request<GetFolderOutput, AWSError>
    open fun getFolder(callback: (err: AWSError, data: GetFolderOutput) -> Unit = definedExternally): Request<GetFolderOutput, AWSError>
    open fun getMergeCommit(params: GetMergeCommitInput, callback: (err: AWSError, data: GetMergeCommitOutput) -> Unit = definedExternally): Request<GetMergeCommitOutput, AWSError>
    open fun getMergeCommit(callback: (err: AWSError, data: GetMergeCommitOutput) -> Unit = definedExternally): Request<GetMergeCommitOutput, AWSError>
    open fun getMergeConflicts(params: GetMergeConflictsInput, callback: (err: AWSError, data: GetMergeConflictsOutput) -> Unit = definedExternally): Request<GetMergeConflictsOutput, AWSError>
    open fun getMergeConflicts(callback: (err: AWSError, data: GetMergeConflictsOutput) -> Unit = definedExternally): Request<GetMergeConflictsOutput, AWSError>
    open fun getMergeOptions(params: GetMergeOptionsInput, callback: (err: AWSError, data: GetMergeOptionsOutput) -> Unit = definedExternally): Request<GetMergeOptionsOutput, AWSError>
    open fun getMergeOptions(callback: (err: AWSError, data: GetMergeOptionsOutput) -> Unit = definedExternally): Request<GetMergeOptionsOutput, AWSError>
    open fun getPullRequest(params: GetPullRequestInput, callback: (err: AWSError, data: GetPullRequestOutput) -> Unit = definedExternally): Request<GetPullRequestOutput, AWSError>
    open fun getPullRequest(callback: (err: AWSError, data: GetPullRequestOutput) -> Unit = definedExternally): Request<GetPullRequestOutput, AWSError>
    open fun getPullRequestApprovalStates(params: GetPullRequestApprovalStatesInput, callback: (err: AWSError, data: GetPullRequestApprovalStatesOutput) -> Unit = definedExternally): Request<GetPullRequestApprovalStatesOutput, AWSError>
    open fun getPullRequestApprovalStates(callback: (err: AWSError, data: GetPullRequestApprovalStatesOutput) -> Unit = definedExternally): Request<GetPullRequestApprovalStatesOutput, AWSError>
    open fun getPullRequestOverrideState(params: GetPullRequestOverrideStateInput, callback: (err: AWSError, data: GetPullRequestOverrideStateOutput) -> Unit = definedExternally): Request<GetPullRequestOverrideStateOutput, AWSError>
    open fun getPullRequestOverrideState(callback: (err: AWSError, data: GetPullRequestOverrideStateOutput) -> Unit = definedExternally): Request<GetPullRequestOverrideStateOutput, AWSError>
    open fun getRepository(params: GetRepositoryInput, callback: (err: AWSError, data: GetRepositoryOutput) -> Unit = definedExternally): Request<GetRepositoryOutput, AWSError>
    open fun getRepository(callback: (err: AWSError, data: GetRepositoryOutput) -> Unit = definedExternally): Request<GetRepositoryOutput, AWSError>
    open fun getRepositoryTriggers(params: GetRepositoryTriggersInput, callback: (err: AWSError, data: GetRepositoryTriggersOutput) -> Unit = definedExternally): Request<GetRepositoryTriggersOutput, AWSError>
    open fun getRepositoryTriggers(callback: (err: AWSError, data: GetRepositoryTriggersOutput) -> Unit = definedExternally): Request<GetRepositoryTriggersOutput, AWSError>
    open fun listApprovalRuleTemplates(params: ListApprovalRuleTemplatesInput, callback: (err: AWSError, data: ListApprovalRuleTemplatesOutput) -> Unit = definedExternally): Request<ListApprovalRuleTemplatesOutput, AWSError>
    open fun listApprovalRuleTemplates(callback: (err: AWSError, data: ListApprovalRuleTemplatesOutput) -> Unit = definedExternally): Request<ListApprovalRuleTemplatesOutput, AWSError>
    open fun listAssociatedApprovalRuleTemplatesForRepository(params: ListAssociatedApprovalRuleTemplatesForRepositoryInput, callback: (err: AWSError, data: ListAssociatedApprovalRuleTemplatesForRepositoryOutput) -> Unit = definedExternally): Request<ListAssociatedApprovalRuleTemplatesForRepositoryOutput, AWSError>
    open fun listAssociatedApprovalRuleTemplatesForRepository(callback: (err: AWSError, data: ListAssociatedApprovalRuleTemplatesForRepositoryOutput) -> Unit = definedExternally): Request<ListAssociatedApprovalRuleTemplatesForRepositoryOutput, AWSError>
    open fun listBranches(params: ListBranchesInput, callback: (err: AWSError, data: ListBranchesOutput) -> Unit = definedExternally): Request<ListBranchesOutput, AWSError>
    open fun listBranches(callback: (err: AWSError, data: ListBranchesOutput) -> Unit = definedExternally): Request<ListBranchesOutput, AWSError>
    open fun listPullRequests(params: ListPullRequestsInput, callback: (err: AWSError, data: ListPullRequestsOutput) -> Unit = definedExternally): Request<ListPullRequestsOutput, AWSError>
    open fun listPullRequests(callback: (err: AWSError, data: ListPullRequestsOutput) -> Unit = definedExternally): Request<ListPullRequestsOutput, AWSError>
    open fun listRepositories(params: ListRepositoriesInput, callback: (err: AWSError, data: ListRepositoriesOutput) -> Unit = definedExternally): Request<ListRepositoriesOutput, AWSError>
    open fun listRepositories(callback: (err: AWSError, data: ListRepositoriesOutput) -> Unit = definedExternally): Request<ListRepositoriesOutput, AWSError>
    open fun listRepositoriesForApprovalRuleTemplate(params: ListRepositoriesForApprovalRuleTemplateInput, callback: (err: AWSError, data: ListRepositoriesForApprovalRuleTemplateOutput) -> Unit = definedExternally): Request<ListRepositoriesForApprovalRuleTemplateOutput, AWSError>
    open fun listRepositoriesForApprovalRuleTemplate(callback: (err: AWSError, data: ListRepositoriesForApprovalRuleTemplateOutput) -> Unit = definedExternally): Request<ListRepositoriesForApprovalRuleTemplateOutput, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceInput, callback: (err: AWSError, data: ListTagsForResourceOutput) -> Unit = definedExternally): Request<ListTagsForResourceOutput, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceOutput) -> Unit = definedExternally): Request<ListTagsForResourceOutput, AWSError>
    open fun mergeBranchesByFastForward(params: MergeBranchesByFastForwardInput, callback: (err: AWSError, data: MergeBranchesByFastForwardOutput) -> Unit = definedExternally): Request<MergeBranchesByFastForwardOutput, AWSError>
    open fun mergeBranchesByFastForward(callback: (err: AWSError, data: MergeBranchesByFastForwardOutput) -> Unit = definedExternally): Request<MergeBranchesByFastForwardOutput, AWSError>
    open fun mergeBranchesBySquash(params: MergeBranchesBySquashInput, callback: (err: AWSError, data: MergeBranchesBySquashOutput) -> Unit = definedExternally): Request<MergeBranchesBySquashOutput, AWSError>
    open fun mergeBranchesBySquash(callback: (err: AWSError, data: MergeBranchesBySquashOutput) -> Unit = definedExternally): Request<MergeBranchesBySquashOutput, AWSError>
    open fun mergeBranchesByThreeWay(params: MergeBranchesByThreeWayInput, callback: (err: AWSError, data: MergeBranchesByThreeWayOutput) -> Unit = definedExternally): Request<MergeBranchesByThreeWayOutput, AWSError>
    open fun mergeBranchesByThreeWay(callback: (err: AWSError, data: MergeBranchesByThreeWayOutput) -> Unit = definedExternally): Request<MergeBranchesByThreeWayOutput, AWSError>
    open fun mergePullRequestByFastForward(params: MergePullRequestByFastForwardInput, callback: (err: AWSError, data: MergePullRequestByFastForwardOutput) -> Unit = definedExternally): Request<MergePullRequestByFastForwardOutput, AWSError>
    open fun mergePullRequestByFastForward(callback: (err: AWSError, data: MergePullRequestByFastForwardOutput) -> Unit = definedExternally): Request<MergePullRequestByFastForwardOutput, AWSError>
    open fun mergePullRequestBySquash(params: MergePullRequestBySquashInput, callback: (err: AWSError, data: MergePullRequestBySquashOutput) -> Unit = definedExternally): Request<MergePullRequestBySquashOutput, AWSError>
    open fun mergePullRequestBySquash(callback: (err: AWSError, data: MergePullRequestBySquashOutput) -> Unit = definedExternally): Request<MergePullRequestBySquashOutput, AWSError>
    open fun mergePullRequestByThreeWay(params: MergePullRequestByThreeWayInput, callback: (err: AWSError, data: MergePullRequestByThreeWayOutput) -> Unit = definedExternally): Request<MergePullRequestByThreeWayOutput, AWSError>
    open fun mergePullRequestByThreeWay(callback: (err: AWSError, data: MergePullRequestByThreeWayOutput) -> Unit = definedExternally): Request<MergePullRequestByThreeWayOutput, AWSError>
    open fun overridePullRequestApprovalRules(params: OverridePullRequestApprovalRulesInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun overridePullRequestApprovalRules(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun postCommentForComparedCommit(params: PostCommentForComparedCommitInput, callback: (err: AWSError, data: PostCommentForComparedCommitOutput) -> Unit = definedExternally): Request<PostCommentForComparedCommitOutput, AWSError>
    open fun postCommentForComparedCommit(callback: (err: AWSError, data: PostCommentForComparedCommitOutput) -> Unit = definedExternally): Request<PostCommentForComparedCommitOutput, AWSError>
    open fun postCommentForPullRequest(params: PostCommentForPullRequestInput, callback: (err: AWSError, data: PostCommentForPullRequestOutput) -> Unit = definedExternally): Request<PostCommentForPullRequestOutput, AWSError>
    open fun postCommentForPullRequest(callback: (err: AWSError, data: PostCommentForPullRequestOutput) -> Unit = definedExternally): Request<PostCommentForPullRequestOutput, AWSError>
    open fun postCommentReply(params: PostCommentReplyInput, callback: (err: AWSError, data: PostCommentReplyOutput) -> Unit = definedExternally): Request<PostCommentReplyOutput, AWSError>
    open fun postCommentReply(callback: (err: AWSError, data: PostCommentReplyOutput) -> Unit = definedExternally): Request<PostCommentReplyOutput, AWSError>
    open fun putFile(params: PutFileInput, callback: (err: AWSError, data: PutFileOutput) -> Unit = definedExternally): Request<PutFileOutput, AWSError>
    open fun putFile(callback: (err: AWSError, data: PutFileOutput) -> Unit = definedExternally): Request<PutFileOutput, AWSError>
    open fun putRepositoryTriggers(params: PutRepositoryTriggersInput, callback: (err: AWSError, data: PutRepositoryTriggersOutput) -> Unit = definedExternally): Request<PutRepositoryTriggersOutput, AWSError>
    open fun putRepositoryTriggers(callback: (err: AWSError, data: PutRepositoryTriggersOutput) -> Unit = definedExternally): Request<PutRepositoryTriggersOutput, AWSError>
    open fun tagResource(params: TagResourceInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun testRepositoryTriggers(params: TestRepositoryTriggersInput, callback: (err: AWSError, data: TestRepositoryTriggersOutput) -> Unit = definedExternally): Request<TestRepositoryTriggersOutput, AWSError>
    open fun testRepositoryTriggers(callback: (err: AWSError, data: TestRepositoryTriggersOutput) -> Unit = definedExternally): Request<TestRepositoryTriggersOutput, AWSError>
    open fun untagResource(params: UntagResourceInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateApprovalRuleTemplateContent(params: UpdateApprovalRuleTemplateContentInput, callback: (err: AWSError, data: UpdateApprovalRuleTemplateContentOutput) -> Unit = definedExternally): Request<UpdateApprovalRuleTemplateContentOutput, AWSError>
    open fun updateApprovalRuleTemplateContent(callback: (err: AWSError, data: UpdateApprovalRuleTemplateContentOutput) -> Unit = definedExternally): Request<UpdateApprovalRuleTemplateContentOutput, AWSError>
    open fun updateApprovalRuleTemplateDescription(params: UpdateApprovalRuleTemplateDescriptionInput, callback: (err: AWSError, data: UpdateApprovalRuleTemplateDescriptionOutput) -> Unit = definedExternally): Request<UpdateApprovalRuleTemplateDescriptionOutput, AWSError>
    open fun updateApprovalRuleTemplateDescription(callback: (err: AWSError, data: UpdateApprovalRuleTemplateDescriptionOutput) -> Unit = definedExternally): Request<UpdateApprovalRuleTemplateDescriptionOutput, AWSError>
    open fun updateApprovalRuleTemplateName(params: UpdateApprovalRuleTemplateNameInput, callback: (err: AWSError, data: UpdateApprovalRuleTemplateNameOutput) -> Unit = definedExternally): Request<UpdateApprovalRuleTemplateNameOutput, AWSError>
    open fun updateApprovalRuleTemplateName(callback: (err: AWSError, data: UpdateApprovalRuleTemplateNameOutput) -> Unit = definedExternally): Request<UpdateApprovalRuleTemplateNameOutput, AWSError>
    open fun updateComment(params: UpdateCommentInput, callback: (err: AWSError, data: UpdateCommentOutput) -> Unit = definedExternally): Request<UpdateCommentOutput, AWSError>
    open fun updateComment(callback: (err: AWSError, data: UpdateCommentOutput) -> Unit = definedExternally): Request<UpdateCommentOutput, AWSError>
    open fun updateDefaultBranch(params: UpdateDefaultBranchInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateDefaultBranch(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updatePullRequestApprovalRuleContent(params: UpdatePullRequestApprovalRuleContentInput, callback: (err: AWSError, data: UpdatePullRequestApprovalRuleContentOutput) -> Unit = definedExternally): Request<UpdatePullRequestApprovalRuleContentOutput, AWSError>
    open fun updatePullRequestApprovalRuleContent(callback: (err: AWSError, data: UpdatePullRequestApprovalRuleContentOutput) -> Unit = definedExternally): Request<UpdatePullRequestApprovalRuleContentOutput, AWSError>
    open fun updatePullRequestApprovalState(params: UpdatePullRequestApprovalStateInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updatePullRequestApprovalState(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updatePullRequestDescription(params: UpdatePullRequestDescriptionInput, callback: (err: AWSError, data: UpdatePullRequestDescriptionOutput) -> Unit = definedExternally): Request<UpdatePullRequestDescriptionOutput, AWSError>
    open fun updatePullRequestDescription(callback: (err: AWSError, data: UpdatePullRequestDescriptionOutput) -> Unit = definedExternally): Request<UpdatePullRequestDescriptionOutput, AWSError>
    open fun updatePullRequestStatus(params: UpdatePullRequestStatusInput, callback: (err: AWSError, data: UpdatePullRequestStatusOutput) -> Unit = definedExternally): Request<UpdatePullRequestStatusOutput, AWSError>
    open fun updatePullRequestStatus(callback: (err: AWSError, data: UpdatePullRequestStatusOutput) -> Unit = definedExternally): Request<UpdatePullRequestStatusOutput, AWSError>
    open fun updatePullRequestTitle(params: UpdatePullRequestTitleInput, callback: (err: AWSError, data: UpdatePullRequestTitleOutput) -> Unit = definedExternally): Request<UpdatePullRequestTitleOutput, AWSError>
    open fun updatePullRequestTitle(callback: (err: AWSError, data: UpdatePullRequestTitleOutput) -> Unit = definedExternally): Request<UpdatePullRequestTitleOutput, AWSError>
    open fun updateRepositoryDescription(params: UpdateRepositoryDescriptionInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateRepositoryDescription(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateRepositoryName(params: UpdateRepositoryNameInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateRepositoryName(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    interface Approval {
        var userArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var approvalState: String /* "APPROVE" | "REVOKE" | String */
    }
    interface ApprovalRule {
        var approvalRuleId: ApprovalRuleId?
            get() = definedExternally
            set(value) = definedExternally
        var approvalRuleName: ApprovalRuleName?
            get() = definedExternally
            set(value) = definedExternally
        var approvalRuleContent: ApprovalRuleContent?
            get() = definedExternally
            set(value) = definedExternally
        var ruleContentSha256: RuleContentSha256?
            get() = definedExternally
            set(value) = definedExternally
        var lastModifiedDate: LastModifiedDate?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: CreationDate?
            get() = definedExternally
            set(value) = definedExternally
        var lastModifiedUser: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var originApprovalRuleTemplate: OriginApprovalRuleTemplate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApprovalRuleEventMetadata {
        var approvalRuleName: ApprovalRuleName?
            get() = definedExternally
            set(value) = definedExternally
        var approvalRuleId: ApprovalRuleId?
            get() = definedExternally
            set(value) = definedExternally
        var approvalRuleContent: ApprovalRuleContent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApprovalRuleOverriddenEventMetadata {
        var revisionId: RevisionId?
            get() = definedExternally
            set(value) = definedExternally
        var overrideStatus: String /* "OVERRIDE" | "REVOKE" | String */
    }
    interface ApprovalRuleTemplate {
        var approvalRuleTemplateId: ApprovalRuleTemplateId?
            get() = definedExternally
            set(value) = definedExternally
        var approvalRuleTemplateName: ApprovalRuleTemplateName?
            get() = definedExternally
            set(value) = definedExternally
        var approvalRuleTemplateDescription: ApprovalRuleTemplateDescription?
            get() = definedExternally
            set(value) = definedExternally
        var approvalRuleTemplateContent: ApprovalRuleTemplateContent?
            get() = definedExternally
            set(value) = definedExternally
        var ruleContentSha256: RuleContentSha256?
            get() = definedExternally
            set(value) = definedExternally
        var lastModifiedDate: LastModifiedDate?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: CreationDate?
            get() = definedExternally
            set(value) = definedExternally
        var lastModifiedUser: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApprovalStateChangedEventMetadata {
        var revisionId: RevisionId?
            get() = definedExternally
            set(value) = definedExternally
        var approvalStatus: String /* "APPROVE" | "REVOKE" | String */
    }
    interface AssociateApprovalRuleTemplateWithRepositoryInput {
        var approvalRuleTemplateName: ApprovalRuleTemplateName
        var repositoryName: RepositoryName
    }
    interface BatchAssociateApprovalRuleTemplateWithRepositoriesError {
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var errorCode: ErrorCode?
            get() = definedExternally
            set(value) = definedExternally
        var errorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchAssociateApprovalRuleTemplateWithRepositoriesInput {
        var approvalRuleTemplateName: ApprovalRuleTemplateName
        var repositoryNames: RepositoryNameList
    }
    interface BatchAssociateApprovalRuleTemplateWithRepositoriesOutput {
        var associatedRepositoryNames: RepositoryNameList
        var errors: BatchAssociateApprovalRuleTemplateWithRepositoriesErrorsList
    }
    interface BatchDescribeMergeConflictsError {
        var filePath: Path
        var exceptionName: ExceptionName
        var message: Message
    }
    interface BatchDescribeMergeConflictsInput {
        var repositoryName: RepositoryName
        var destinationCommitSpecifier: CommitName
        var sourceCommitSpecifier: CommitName
        var mergeOption: String /* "FAST_FORWARD_MERGE" | "SQUASH_MERGE" | "THREE_WAY_MERGE" | String */
        var maxMergeHunks: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var maxConflictFiles: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var filePaths: FilePaths?
            get() = definedExternally
            set(value) = definedExternally
        var conflictDetailLevel: String /* "FILE_LEVEL" | "LINE_LEVEL" | String */
        var conflictResolutionStrategy: String /* "NONE" | "ACCEPT_SOURCE" | "ACCEPT_DESTINATION" | "AUTOMERGE" | String */
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDescribeMergeConflictsOutput {
        var conflicts: Conflicts
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var errors: BatchDescribeMergeConflictsErrors?
            get() = definedExternally
            set(value) = definedExternally
        var destinationCommitId: ObjectId
        var sourceCommitId: ObjectId
        var baseCommitId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDisassociateApprovalRuleTemplateFromRepositoriesError {
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var errorCode: ErrorCode?
            get() = definedExternally
            set(value) = definedExternally
        var errorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDisassociateApprovalRuleTemplateFromRepositoriesInput {
        var approvalRuleTemplateName: ApprovalRuleTemplateName
        var repositoryNames: RepositoryNameList
    }
    interface BatchDisassociateApprovalRuleTemplateFromRepositoriesOutput {
        var disassociatedRepositoryNames: RepositoryNameList
        var errors: BatchDisassociateApprovalRuleTemplateFromRepositoriesErrorsList
    }
    interface BatchGetCommitsError {
        var commitId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var errorCode: ErrorCode?
            get() = definedExternally
            set(value) = definedExternally
        var errorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetCommitsInput {
        var commitIds: CommitIdsInputList
        var repositoryName: RepositoryName
    }
    interface BatchGetCommitsOutput {
        var commits: CommitObjectsList?
            get() = definedExternally
            set(value) = definedExternally
        var errors: BatchGetCommitsErrorsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetRepositoriesInput {
        var repositoryNames: RepositoryNameList
    }
    interface BatchGetRepositoriesOutput {
        var repositories: RepositoryMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var repositoriesNotFound: RepositoryNotFoundList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BlobMetadata {
        var blobId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var path: Path?
            get() = definedExternally
            set(value) = definedExternally
        var mode: Mode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BranchInfo {
        var branchName: BranchName?
            get() = definedExternally
            set(value) = definedExternally
        var commitId: CommitId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Comment {
        var commentId: CommentId?
            get() = definedExternally
            set(value) = definedExternally
        var content: Content?
            get() = definedExternally
            set(value) = definedExternally
        var inReplyTo: CommentId?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: CreationDate?
            get() = definedExternally
            set(value) = definedExternally
        var lastModifiedDate: LastModifiedDate?
            get() = definedExternally
            set(value) = definedExternally
        var authorArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var deleted: IsCommentDeleted?
            get() = definedExternally
            set(value) = definedExternally
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CommentsForComparedCommit {
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var beforeCommitId: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var afterCommitId: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var beforeBlobId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var afterBlobId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var location: Location?
            get() = definedExternally
            set(value) = definedExternally
        var comments: Comments?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CommentsForPullRequest {
        var pullRequestId: PullRequestId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var beforeCommitId: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var afterCommitId: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var beforeBlobId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var afterBlobId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var location: Location?
            get() = definedExternally
            set(value) = definedExternally
        var comments: Comments?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Commit {
        var commitId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var treeId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var parents: ParentList?
            get() = definedExternally
            set(value) = definedExternally
        var message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var author: UserInfo?
            get() = definedExternally
            set(value) = definedExternally
        var committer: UserInfo?
            get() = definedExternally
            set(value) = definedExternally
        var additionalData: AdditionalData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Conflict {
        var conflictMetadata: ConflictMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var mergeHunks: MergeHunks?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConflictMetadata {
        var filePath: Path?
            get() = definedExternally
            set(value) = definedExternally
        var fileSizes: FileSizes?
            get() = definedExternally
            set(value) = definedExternally
        var fileModes: FileModes?
            get() = definedExternally
            set(value) = definedExternally
        var objectTypes: ObjectTypes?
            get() = definedExternally
            set(value) = definedExternally
        var numberOfConflicts: NumberOfConflicts?
            get() = definedExternally
            set(value) = definedExternally
        var isBinaryFile: IsBinaryFile?
            get() = definedExternally
            set(value) = definedExternally
        var contentConflict: IsContentConflict?
            get() = definedExternally
            set(value) = definedExternally
        var fileModeConflict: IsFileModeConflict?
            get() = definedExternally
            set(value) = definedExternally
        var objectTypeConflict: IsObjectTypeConflict?
            get() = definedExternally
            set(value) = definedExternally
        var mergeOperations: MergeOperations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConflictResolution {
        var replaceContents: ReplaceContentEntries?
            get() = definedExternally
            set(value) = definedExternally
        var deleteFiles: DeleteFileEntries?
            get() = definedExternally
            set(value) = definedExternally
        var setFileModes: SetFileModeEntries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateApprovalRuleTemplateInput {
        var approvalRuleTemplateName: ApprovalRuleTemplateName
        var approvalRuleTemplateContent: ApprovalRuleTemplateContent
        var approvalRuleTemplateDescription: ApprovalRuleTemplateDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateApprovalRuleTemplateOutput {
        var approvalRuleTemplate: ApprovalRuleTemplate
    }
    interface CreateBranchInput {
        var repositoryName: RepositoryName
        var branchName: BranchName
        var commitId: CommitId
    }
    interface CreateCommitInput {
        var repositoryName: RepositoryName
        var branchName: BranchName
        var parentCommitId: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var authorName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var email: Email?
            get() = definedExternally
            set(value) = definedExternally
        var commitMessage: Message?
            get() = definedExternally
            set(value) = definedExternally
        var keepEmptyFolders: KeepEmptyFolders?
            get() = definedExternally
            set(value) = definedExternally
        var putFiles: PutFileEntries?
            get() = definedExternally
            set(value) = definedExternally
        var deleteFiles: DeleteFileEntries?
            get() = definedExternally
            set(value) = definedExternally
        var setFileModes: SetFileModeEntries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCommitOutput {
        var commitId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var treeId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var filesAdded: FilesMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var filesUpdated: FilesMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var filesDeleted: FilesMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePullRequestApprovalRuleInput {
        var pullRequestId: PullRequestId
        var approvalRuleName: ApprovalRuleName
        var approvalRuleContent: ApprovalRuleContent
    }
    interface CreatePullRequestApprovalRuleOutput {
        var approvalRule: ApprovalRule
    }
    interface CreatePullRequestInput {
        var title: Title
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var targets: TargetList
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePullRequestOutput {
        var pullRequest: PullRequest
    }
    interface CreateRepositoryInput {
        var repositoryName: RepositoryName
        var repositoryDescription: RepositoryDescription?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRepositoryOutput {
        var repositoryMetadata: RepositoryMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUnreferencedMergeCommitInput {
        var repositoryName: RepositoryName
        var sourceCommitSpecifier: CommitName
        var destinationCommitSpecifier: CommitName
        var mergeOption: String /* "FAST_FORWARD_MERGE" | "SQUASH_MERGE" | "THREE_WAY_MERGE" | String */
        var conflictDetailLevel: String /* "FILE_LEVEL" | "LINE_LEVEL" | String */
        var conflictResolutionStrategy: String /* "NONE" | "ACCEPT_SOURCE" | "ACCEPT_DESTINATION" | "AUTOMERGE" | String */
        var authorName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var email: Email?
            get() = definedExternally
            set(value) = definedExternally
        var commitMessage: Message?
            get() = definedExternally
            set(value) = definedExternally
        var keepEmptyFolders: KeepEmptyFolders?
            get() = definedExternally
            set(value) = definedExternally
        var conflictResolution: ConflictResolution?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUnreferencedMergeCommitOutput {
        var commitId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var treeId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteApprovalRuleTemplateInput {
        var approvalRuleTemplateName: ApprovalRuleTemplateName
    }
    interface DeleteApprovalRuleTemplateOutput {
        var approvalRuleTemplateId: ApprovalRuleTemplateId
    }
    interface DeleteBranchInput {
        var repositoryName: RepositoryName
        var branchName: BranchName
    }
    interface DeleteBranchOutput {
        var deletedBranch: BranchInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteCommentContentInput {
        var commentId: CommentId
    }
    interface DeleteCommentContentOutput {
        var comment: Comment?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteFileEntry {
        var filePath: Path
    }
    interface DeleteFileInput {
        var repositoryName: RepositoryName
        var branchName: BranchName
        var filePath: Path
        var parentCommitId: CommitId
        var keepEmptyFolders: KeepEmptyFolders?
            get() = definedExternally
            set(value) = definedExternally
        var commitMessage: Message?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var email: Email?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteFileOutput {
        var commitId: ObjectId
        var blobId: ObjectId
        var treeId: ObjectId
        var filePath: Path
    }
    interface DeletePullRequestApprovalRuleInput {
        var pullRequestId: PullRequestId
        var approvalRuleName: ApprovalRuleName
    }
    interface DeletePullRequestApprovalRuleOutput {
        var approvalRuleId: ApprovalRuleId
    }
    interface DeleteRepositoryInput {
        var repositoryName: RepositoryName
    }
    interface DeleteRepositoryOutput {
        var repositoryId: RepositoryId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMergeConflictsInput {
        var repositoryName: RepositoryName
        var destinationCommitSpecifier: CommitName
        var sourceCommitSpecifier: CommitName
        var mergeOption: String /* "FAST_FORWARD_MERGE" | "SQUASH_MERGE" | "THREE_WAY_MERGE" | String */
        var maxMergeHunks: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var filePath: Path
        var conflictDetailLevel: String /* "FILE_LEVEL" | "LINE_LEVEL" | String */
        var conflictResolutionStrategy: String /* "NONE" | "ACCEPT_SOURCE" | "ACCEPT_DESTINATION" | "AUTOMERGE" | String */
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMergeConflictsOutput {
        var conflictMetadata: ConflictMetadata
        var mergeHunks: MergeHunks
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var destinationCommitId: ObjectId
        var sourceCommitId: ObjectId
        var baseCommitId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePullRequestEventsInput {
        var pullRequestId: PullRequestId
        var pullRequestEventType: String /* "PULL_REQUEST_CREATED" | "PULL_REQUEST_STATUS_CHANGED" | "PULL_REQUEST_SOURCE_REFERENCE_UPDATED" | "PULL_REQUEST_MERGE_STATE_CHANGED" | "PULL_REQUEST_APPROVAL_RULE_CREATED" | "PULL_REQUEST_APPROVAL_RULE_UPDATED" | "PULL_REQUEST_APPROVAL_RULE_DELETED" | "PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN" | "PULL_REQUEST_APPROVAL_STATE_CHANGED" | String */
        var actorArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePullRequestEventsOutput {
        var pullRequestEvents: PullRequestEventList
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Difference {
        var beforeBlob: BlobMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var afterBlob: BlobMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var changeType: String /* "A" | "M" | "D" | String */
    }
    interface DisassociateApprovalRuleTemplateFromRepositoryInput {
        var approvalRuleTemplateName: ApprovalRuleTemplateName
        var repositoryName: RepositoryName
    }
    interface EvaluatePullRequestApprovalRulesInput {
        var pullRequestId: PullRequestId
        var revisionId: RevisionId
    }
    interface EvaluatePullRequestApprovalRulesOutput {
        var evaluation: Evaluation
    }
    interface Evaluation {
        var approved: Approved?
            get() = definedExternally
            set(value) = definedExternally
        var overridden: Overridden?
            get() = definedExternally
            set(value) = definedExternally
        var approvalRulesSatisfied: ApprovalRulesSatisfiedList?
            get() = definedExternally
            set(value) = definedExternally
        var approvalRulesNotSatisfied: ApprovalRulesNotSatisfiedList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface File {
        var blobId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var absolutePath: Path?
            get() = definedExternally
            set(value) = definedExternally
        var relativePath: Path?
            get() = definedExternally
            set(value) = definedExternally
        var fileMode: String /* "EXECUTABLE" | "NORMAL" | "SYMLINK" | String */
    }
    interface FileMetadata {
        var absolutePath: Path?
            get() = definedExternally
            set(value) = definedExternally
        var blobId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var fileMode: String /* "EXECUTABLE" | "NORMAL" | "SYMLINK" | String */
    }
    interface FileModes {
        var source: String /* "EXECUTABLE" | "NORMAL" | "SYMLINK" | String */
        var destination: String /* "EXECUTABLE" | "NORMAL" | "SYMLINK" | String */
        var base: String /* "EXECUTABLE" | "NORMAL" | "SYMLINK" | String */
    }
    interface FileSizes {
        var source: FileSize?
            get() = definedExternally
            set(value) = definedExternally
        var destination: FileSize?
            get() = definedExternally
            set(value) = definedExternally
        var base: FileSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Folder {
        var treeId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var absolutePath: Path?
            get() = definedExternally
            set(value) = definedExternally
        var relativePath: Path?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetApprovalRuleTemplateInput {
        var approvalRuleTemplateName: ApprovalRuleTemplateName
    }
    interface GetApprovalRuleTemplateOutput {
        var approvalRuleTemplate: ApprovalRuleTemplate
    }
    interface GetBlobInput {
        var repositoryName: RepositoryName
        var blobId: ObjectId
    }
    interface GetBlobOutput {
        var content: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBranchInput {
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var branchName: BranchName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBranchOutput {
        var branch: BranchInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCommentInput {
        var commentId: CommentId
    }
    interface GetCommentOutput {
        var comment: Comment?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCommentsForComparedCommitInput {
        var repositoryName: RepositoryName
        var beforeCommitId: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var afterCommitId: CommitId
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCommentsForComparedCommitOutput {
        var commentsForComparedCommitData: CommentsForComparedCommitData?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCommentsForPullRequestInput {
        var pullRequestId: PullRequestId
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var beforeCommitId: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var afterCommitId: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCommentsForPullRequestOutput {
        var commentsForPullRequestData: CommentsForPullRequestData?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCommitInput {
        var repositoryName: RepositoryName
        var commitId: ObjectId
    }
    interface GetCommitOutput {
        var commit: Commit
    }
    interface GetDifferencesInput {
        var repositoryName: RepositoryName
        var beforeCommitSpecifier: CommitName?
            get() = definedExternally
            set(value) = definedExternally
        var afterCommitSpecifier: CommitName
        var beforePath: Path?
            get() = definedExternally
            set(value) = definedExternally
        var afterPath: Path?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDifferencesOutput {
        var differences: DifferenceList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFileInput {
        var repositoryName: RepositoryName
        var commitSpecifier: CommitName?
            get() = definedExternally
            set(value) = definedExternally
        var filePath: Path
    }
    interface GetFileOutput {
        var commitId: ObjectId
        var blobId: ObjectId
        var filePath: Path
        var fileMode: String /* "EXECUTABLE" | "NORMAL" | "SYMLINK" | String */
        var fileSize: ObjectSize
        var fileContent: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFolderInput {
        var repositoryName: RepositoryName
        var commitSpecifier: CommitName?
            get() = definedExternally
            set(value) = definedExternally
        var folderPath: Path
    }
    interface GetFolderOutput {
        var commitId: ObjectId
        var folderPath: Path
        var treeId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var subFolders: FolderList?
            get() = definedExternally
            set(value) = definedExternally
        var files: FileList?
            get() = definedExternally
            set(value) = definedExternally
        var symbolicLinks: SymbolicLinkList?
            get() = definedExternally
            set(value) = definedExternally
        var subModules: SubModuleList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMergeCommitInput {
        var repositoryName: RepositoryName
        var sourceCommitSpecifier: CommitName
        var destinationCommitSpecifier: CommitName
        var conflictDetailLevel: String /* "FILE_LEVEL" | "LINE_LEVEL" | String */
        var conflictResolutionStrategy: String /* "NONE" | "ACCEPT_SOURCE" | "ACCEPT_DESTINATION" | "AUTOMERGE" | String */
    }
    interface GetMergeCommitOutput {
        var sourceCommitId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var destinationCommitId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var baseCommitId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var mergedCommitId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMergeConflictsInput {
        var repositoryName: RepositoryName
        var destinationCommitSpecifier: CommitName
        var sourceCommitSpecifier: CommitName
        var mergeOption: String /* "FAST_FORWARD_MERGE" | "SQUASH_MERGE" | "THREE_WAY_MERGE" | String */
        var conflictDetailLevel: String /* "FILE_LEVEL" | "LINE_LEVEL" | String */
        var maxConflictFiles: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var conflictResolutionStrategy: String /* "NONE" | "ACCEPT_SOURCE" | "ACCEPT_DESTINATION" | "AUTOMERGE" | String */
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMergeConflictsOutput {
        var mergeable: IsMergeable
        var destinationCommitId: ObjectId
        var sourceCommitId: ObjectId
        var baseCommitId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var conflictMetadataList: ConflictMetadataList
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMergeOptionsInput {
        var repositoryName: RepositoryName
        var sourceCommitSpecifier: CommitName
        var destinationCommitSpecifier: CommitName
        var conflictDetailLevel: String /* "FILE_LEVEL" | "LINE_LEVEL" | String */
        var conflictResolutionStrategy: String /* "NONE" | "ACCEPT_SOURCE" | "ACCEPT_DESTINATION" | "AUTOMERGE" | String */
    }
    interface GetMergeOptionsOutput {
        var mergeOptions: MergeOptions
        var sourceCommitId: ObjectId
        var destinationCommitId: ObjectId
        var baseCommitId: ObjectId
    }
    interface GetPullRequestApprovalStatesInput {
        var pullRequestId: PullRequestId
        var revisionId: RevisionId
    }
    interface GetPullRequestApprovalStatesOutput {
        var approvals: ApprovalList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPullRequestInput {
        var pullRequestId: PullRequestId
    }
    interface GetPullRequestOutput {
        var pullRequest: PullRequest
    }
    interface GetPullRequestOverrideStateInput {
        var pullRequestId: PullRequestId
        var revisionId: RevisionId
    }
    interface GetPullRequestOverrideStateOutput {
        var overridden: Overridden?
            get() = definedExternally
            set(value) = definedExternally
        var overrider: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRepositoryInput {
        var repositoryName: RepositoryName
    }
    interface GetRepositoryOutput {
        var repositoryMetadata: RepositoryMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRepositoryTriggersInput {
        var repositoryName: RepositoryName
    }
    interface GetRepositoryTriggersOutput {
        var configurationId: RepositoryTriggersConfigurationId?
            get() = definedExternally
            set(value) = definedExternally
        var triggers: RepositoryTriggersList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IsBinaryFile {
        var source: CapitalBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var destination: CapitalBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var base: CapitalBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListApprovalRuleTemplatesInput {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListApprovalRuleTemplatesOutput {
        var approvalRuleTemplateNames: ApprovalRuleTemplateNameList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAssociatedApprovalRuleTemplatesForRepositoryInput {
        var repositoryName: RepositoryName
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAssociatedApprovalRuleTemplatesForRepositoryOutput {
        var approvalRuleTemplateNames: ApprovalRuleTemplateNameList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBranchesInput {
        var repositoryName: RepositoryName
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBranchesOutput {
        var branches: BranchNameList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPullRequestsInput {
        var repositoryName: RepositoryName
        var authorArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var pullRequestStatus: String /* "OPEN" | "CLOSED" | String */
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPullRequestsOutput {
        var pullRequestIds: PullRequestIdList
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRepositoriesForApprovalRuleTemplateInput {
        var approvalRuleTemplateName: ApprovalRuleTemplateName
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRepositoriesForApprovalRuleTemplateOutput {
        var repositoryNames: RepositoryNameList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRepositoriesInput {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var sortBy: String /* "repositoryName" | "lastModifiedDate" | String */
        var order: String /* "ascending" | "descending" | String */
    }
    interface ListRepositoriesOutput {
        var repositories: RepositoryNameIdPairList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceInput {
        var resourceArn: ResourceArn
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceOutput {
        var tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Location {
        var filePath: Path?
            get() = definedExternally
            set(value) = definedExternally
        var filePosition: Position?
            get() = definedExternally
            set(value) = definedExternally
        var relativeFileVersion: String /* "BEFORE" | "AFTER" | String */
    }
    interface MergeBranchesByFastForwardInput {
        var repositoryName: RepositoryName
        var sourceCommitSpecifier: CommitName
        var destinationCommitSpecifier: CommitName
        var targetBranch: BranchName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MergeBranchesByFastForwardOutput {
        var commitId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var treeId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MergeBranchesBySquashInput {
        var repositoryName: RepositoryName
        var sourceCommitSpecifier: CommitName
        var destinationCommitSpecifier: CommitName
        var targetBranch: BranchName?
            get() = definedExternally
            set(value) = definedExternally
        var conflictDetailLevel: String /* "FILE_LEVEL" | "LINE_LEVEL" | String */
        var conflictResolutionStrategy: String /* "NONE" | "ACCEPT_SOURCE" | "ACCEPT_DESTINATION" | "AUTOMERGE" | String */
        var authorName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var email: Email?
            get() = definedExternally
            set(value) = definedExternally
        var commitMessage: Message?
            get() = definedExternally
            set(value) = definedExternally
        var keepEmptyFolders: KeepEmptyFolders?
            get() = definedExternally
            set(value) = definedExternally
        var conflictResolution: ConflictResolution?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MergeBranchesBySquashOutput {
        var commitId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var treeId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MergeBranchesByThreeWayInput {
        var repositoryName: RepositoryName
        var sourceCommitSpecifier: CommitName
        var destinationCommitSpecifier: CommitName
        var targetBranch: BranchName?
            get() = definedExternally
            set(value) = definedExternally
        var conflictDetailLevel: String /* "FILE_LEVEL" | "LINE_LEVEL" | String */
        var conflictResolutionStrategy: String /* "NONE" | "ACCEPT_SOURCE" | "ACCEPT_DESTINATION" | "AUTOMERGE" | String */
        var authorName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var email: Email?
            get() = definedExternally
            set(value) = definedExternally
        var commitMessage: Message?
            get() = definedExternally
            set(value) = definedExternally
        var keepEmptyFolders: KeepEmptyFolders?
            get() = definedExternally
            set(value) = definedExternally
        var conflictResolution: ConflictResolution?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MergeBranchesByThreeWayOutput {
        var commitId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var treeId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MergeHunk {
        var isConflict: IsHunkConflict?
            get() = definedExternally
            set(value) = definedExternally
        var source: MergeHunkDetail?
            get() = definedExternally
            set(value) = definedExternally
        var destination: MergeHunkDetail?
            get() = definedExternally
            set(value) = definedExternally
        var base: MergeHunkDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MergeHunkDetail {
        var startLine: LineNumber?
            get() = definedExternally
            set(value) = definedExternally
        var endLine: LineNumber?
            get() = definedExternally
            set(value) = definedExternally
        var hunkContent: HunkContent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MergeMetadata {
        var isMerged: IsMerged?
            get() = definedExternally
            set(value) = definedExternally
        var mergedBy: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var mergeCommitId: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var mergeOption: String /* "FAST_FORWARD_MERGE" | "SQUASH_MERGE" | "THREE_WAY_MERGE" | String */
    }
    interface MergeOperations {
        var source: String /* "A" | "M" | "D" | String */
        var destination: String /* "A" | "M" | "D" | String */
    }
    interface MergePullRequestByFastForwardInput {
        var pullRequestId: PullRequestId
        var repositoryName: RepositoryName
        var sourceCommitId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MergePullRequestByFastForwardOutput {
        var pullRequest: PullRequest?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MergePullRequestBySquashInput {
        var pullRequestId: PullRequestId
        var repositoryName: RepositoryName
        var sourceCommitId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var conflictDetailLevel: String /* "FILE_LEVEL" | "LINE_LEVEL" | String */
        var conflictResolutionStrategy: String /* "NONE" | "ACCEPT_SOURCE" | "ACCEPT_DESTINATION" | "AUTOMERGE" | String */
        var commitMessage: Message?
            get() = definedExternally
            set(value) = definedExternally
        var authorName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var email: Email?
            get() = definedExternally
            set(value) = definedExternally
        var keepEmptyFolders: KeepEmptyFolders?
            get() = definedExternally
            set(value) = definedExternally
        var conflictResolution: ConflictResolution?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MergePullRequestBySquashOutput {
        var pullRequest: PullRequest?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MergePullRequestByThreeWayInput {
        var pullRequestId: PullRequestId
        var repositoryName: RepositoryName
        var sourceCommitId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var conflictDetailLevel: String /* "FILE_LEVEL" | "LINE_LEVEL" | String */
        var conflictResolutionStrategy: String /* "NONE" | "ACCEPT_SOURCE" | "ACCEPT_DESTINATION" | "AUTOMERGE" | String */
        var commitMessage: Message?
            get() = definedExternally
            set(value) = definedExternally
        var authorName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var email: Email?
            get() = definedExternally
            set(value) = definedExternally
        var keepEmptyFolders: KeepEmptyFolders?
            get() = definedExternally
            set(value) = definedExternally
        var conflictResolution: ConflictResolution?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MergePullRequestByThreeWayOutput {
        var pullRequest: PullRequest?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ObjectTypes {
        var source: String /* "FILE" | "DIRECTORY" | "GIT_LINK" | "SYMBOLIC_LINK" | String */
        var destination: String /* "FILE" | "DIRECTORY" | "GIT_LINK" | "SYMBOLIC_LINK" | String */
        var base: String /* "FILE" | "DIRECTORY" | "GIT_LINK" | "SYMBOLIC_LINK" | String */
    }
    interface OriginApprovalRuleTemplate {
        var approvalRuleTemplateId: ApprovalRuleTemplateId?
            get() = definedExternally
            set(value) = definedExternally
        var approvalRuleTemplateName: ApprovalRuleTemplateName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OverridePullRequestApprovalRulesInput {
        var pullRequestId: PullRequestId
        var revisionId: RevisionId
        var overrideStatus: String /* "OVERRIDE" | "REVOKE" | String */
    }
    interface PostCommentForComparedCommitInput {
        var repositoryName: RepositoryName
        var beforeCommitId: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var afterCommitId: CommitId
        var location: Location?
            get() = definedExternally
            set(value) = definedExternally
        var content: Content
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PostCommentForComparedCommitOutput {
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var beforeCommitId: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var afterCommitId: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var beforeBlobId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var afterBlobId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var location: Location?
            get() = definedExternally
            set(value) = definedExternally
        var comment: Comment?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PostCommentForPullRequestInput {
        var pullRequestId: PullRequestId
        var repositoryName: RepositoryName
        var beforeCommitId: CommitId
        var afterCommitId: CommitId
        var location: Location?
            get() = definedExternally
            set(value) = definedExternally
        var content: Content
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PostCommentForPullRequestOutput {
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var pullRequestId: PullRequestId?
            get() = definedExternally
            set(value) = definedExternally
        var beforeCommitId: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var afterCommitId: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var beforeBlobId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var afterBlobId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var location: Location?
            get() = definedExternally
            set(value) = definedExternally
        var comment: Comment?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PostCommentReplyInput {
        var inReplyTo: CommentId
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var content: Content
    }
    interface PostCommentReplyOutput {
        var comment: Comment?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PullRequest {
        var pullRequestId: PullRequestId?
            get() = definedExternally
            set(value) = definedExternally
        var title: Title?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var lastActivityDate: LastModifiedDate?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: CreationDate?
            get() = definedExternally
            set(value) = definedExternally
        var pullRequestStatus: String /* "OPEN" | "CLOSED" | String */
        var authorArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var pullRequestTargets: PullRequestTargetList?
            get() = definedExternally
            set(value) = definedExternally
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var revisionId: RevisionId?
            get() = definedExternally
            set(value) = definedExternally
        var approvalRules: ApprovalRulesList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PullRequestCreatedEventMetadata {
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var sourceCommitId: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var destinationCommitId: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var mergeBase: CommitId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PullRequestEvent {
        var pullRequestId: PullRequestId?
            get() = definedExternally
            set(value) = definedExternally
        var eventDate: EventDate?
            get() = definedExternally
            set(value) = definedExternally
        var pullRequestEventType: String /* "PULL_REQUEST_CREATED" | "PULL_REQUEST_STATUS_CHANGED" | "PULL_REQUEST_SOURCE_REFERENCE_UPDATED" | "PULL_REQUEST_MERGE_STATE_CHANGED" | "PULL_REQUEST_APPROVAL_RULE_CREATED" | "PULL_REQUEST_APPROVAL_RULE_UPDATED" | "PULL_REQUEST_APPROVAL_RULE_DELETED" | "PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN" | "PULL_REQUEST_APPROVAL_STATE_CHANGED" | String */
        var actorArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var pullRequestCreatedEventMetadata: PullRequestCreatedEventMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var pullRequestStatusChangedEventMetadata: PullRequestStatusChangedEventMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var pullRequestSourceReferenceUpdatedEventMetadata: PullRequestSourceReferenceUpdatedEventMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var pullRequestMergedStateChangedEventMetadata: PullRequestMergedStateChangedEventMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var approvalRuleEventMetadata: ApprovalRuleEventMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var approvalStateChangedEventMetadata: ApprovalStateChangedEventMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var approvalRuleOverriddenEventMetadata: ApprovalRuleOverriddenEventMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PullRequestMergedStateChangedEventMetadata {
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var destinationReference: ReferenceName?
            get() = definedExternally
            set(value) = definedExternally
        var mergeMetadata: MergeMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PullRequestSourceReferenceUpdatedEventMetadata {
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var beforeCommitId: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var afterCommitId: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var mergeBase: CommitId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PullRequestStatusChangedEventMetadata {
        var pullRequestStatus: String /* "OPEN" | "CLOSED" | String */
    }
    interface PullRequestTarget {
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var sourceReference: ReferenceName?
            get() = definedExternally
            set(value) = definedExternally
        var destinationReference: ReferenceName?
            get() = definedExternally
            set(value) = definedExternally
        var destinationCommit: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var sourceCommit: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var mergeBase: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var mergeMetadata: MergeMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutFileEntry {
        var filePath: Path
        var fileMode: String /* "EXECUTABLE" | "NORMAL" | "SYMLINK" | String */
        var fileContent: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var sourceFile: SourceFileSpecifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutFileInput {
        var repositoryName: RepositoryName
        var branchName: BranchName
        var fileContent: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var filePath: Path
        var fileMode: String /* "EXECUTABLE" | "NORMAL" | "SYMLINK" | String */
        var parentCommitId: CommitId?
            get() = definedExternally
            set(value) = definedExternally
        var commitMessage: Message?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var email: Email?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutFileOutput {
        var commitId: ObjectId
        var blobId: ObjectId
        var treeId: ObjectId
    }
    interface PutRepositoryTriggersInput {
        var repositoryName: RepositoryName
        var triggers: RepositoryTriggersList
    }
    interface PutRepositoryTriggersOutput {
        var configurationId: RepositoryTriggersConfigurationId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplaceContentEntry {
        var filePath: Path
        var replacementType: String /* "KEEP_BASE" | "KEEP_SOURCE" | "KEEP_DESTINATION" | "USE_NEW_CONTENT" | String */
        var content: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var fileMode: String /* "EXECUTABLE" | "NORMAL" | "SYMLINK" | String */
    }
    interface RepositoryMetadata {
        var accountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryId: RepositoryId?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryDescription: RepositoryDescription?
            get() = definedExternally
            set(value) = definedExternally
        var defaultBranch: BranchName?
            get() = definedExternally
            set(value) = definedExternally
        var lastModifiedDate: LastModifiedDate?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: CreationDate?
            get() = definedExternally
            set(value) = definedExternally
        var cloneUrlHttp: CloneUrlHttp?
            get() = definedExternally
            set(value) = definedExternally
        var cloneUrlSsh: CloneUrlSsh?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RepositoryNameIdPair {
        var repositoryName: RepositoryName?
            get() = definedExternally
            set(value) = definedExternally
        var repositoryId: RepositoryId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RepositoryTrigger {
        var name: RepositoryTriggerName
        var destinationArn: Arn
        var customData: RepositoryTriggerCustomData?
            get() = definedExternally
            set(value) = definedExternally
        var branches: BranchNameList?
            get() = definedExternally
            set(value) = definedExternally
        var events: RepositoryTriggerEventList
    }
    interface RepositoryTriggerExecutionFailure {
        var trigger: RepositoryTriggerName?
            get() = definedExternally
            set(value) = definedExternally
        var failureMessage: RepositoryTriggerExecutionFailureMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetFileModeEntry {
        var filePath: Path
        var fileMode: String /* "EXECUTABLE" | "NORMAL" | "SYMLINK" | String */
    }
    interface SourceFileSpecifier {
        var filePath: Path
        var isMove: IsMove?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SubModule {
        var commitId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var absolutePath: Path?
            get() = definedExternally
            set(value) = definedExternally
        var relativePath: Path?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SymbolicLink {
        var blobId: ObjectId?
            get() = definedExternally
            set(value) = definedExternally
        var absolutePath: Path?
            get() = definedExternally
            set(value) = definedExternally
        var relativePath: Path?
            get() = definedExternally
            set(value) = definedExternally
        var fileMode: String /* "EXECUTABLE" | "NORMAL" | "SYMLINK" | String */
    }
    interface TagResourceInput {
        var resourceArn: ResourceArn
        var tags: TagsMap
    }
    interface TagsMap {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface Target {
        var repositoryName: RepositoryName
        var sourceReference: ReferenceName
        var destinationReference: ReferenceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestRepositoryTriggersInput {
        var repositoryName: RepositoryName
        var triggers: RepositoryTriggersList
    }
    interface TestRepositoryTriggersOutput {
        var successfulExecutions: RepositoryTriggerNameList?
            get() = definedExternally
            set(value) = definedExternally
        var failedExecutions: RepositoryTriggerExecutionFailureList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceInput {
        var resourceArn: ResourceArn
        var tagKeys: TagKeysList
    }
    interface UpdateApprovalRuleTemplateContentInput {
        var approvalRuleTemplateName: ApprovalRuleTemplateName
        var newRuleContent: ApprovalRuleTemplateContent
        var existingRuleContentSha256: RuleContentSha256?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateApprovalRuleTemplateContentOutput {
        var approvalRuleTemplate: ApprovalRuleTemplate
    }
    interface UpdateApprovalRuleTemplateDescriptionInput {
        var approvalRuleTemplateName: ApprovalRuleTemplateName
        var approvalRuleTemplateDescription: ApprovalRuleTemplateDescription
    }
    interface UpdateApprovalRuleTemplateDescriptionOutput {
        var approvalRuleTemplate: ApprovalRuleTemplate
    }
    interface UpdateApprovalRuleTemplateNameInput {
        var oldApprovalRuleTemplateName: ApprovalRuleTemplateName
        var newApprovalRuleTemplateName: ApprovalRuleTemplateName
    }
    interface UpdateApprovalRuleTemplateNameOutput {
        var approvalRuleTemplate: ApprovalRuleTemplate
    }
    interface UpdateCommentInput {
        var commentId: CommentId
        var content: Content
    }
    interface UpdateCommentOutput {
        var comment: Comment?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDefaultBranchInput {
        var repositoryName: RepositoryName
        var defaultBranchName: BranchName
    }
    interface UpdatePullRequestApprovalRuleContentInput {
        var pullRequestId: PullRequestId
        var approvalRuleName: ApprovalRuleName
        var existingRuleContentSha256: RuleContentSha256?
            get() = definedExternally
            set(value) = definedExternally
        var newRuleContent: ApprovalRuleContent
    }
    interface UpdatePullRequestApprovalRuleContentOutput {
        var approvalRule: ApprovalRule
    }
    interface UpdatePullRequestApprovalStateInput {
        var pullRequestId: PullRequestId
        var revisionId: RevisionId
        var approvalState: String /* "APPROVE" | "REVOKE" | String */
    }
    interface UpdatePullRequestDescriptionInput {
        var pullRequestId: PullRequestId
        var description: Description
    }
    interface UpdatePullRequestDescriptionOutput {
        var pullRequest: PullRequest
    }
    interface UpdatePullRequestStatusInput {
        var pullRequestId: PullRequestId
        var pullRequestStatus: String /* "OPEN" | "CLOSED" | String */
    }
    interface UpdatePullRequestStatusOutput {
        var pullRequest: PullRequest
    }
    interface UpdatePullRequestTitleInput {
        var pullRequestId: PullRequestId
        var title: Title
    }
    interface UpdatePullRequestTitleOutput {
        var pullRequest: PullRequest
    }
    interface UpdateRepositoryDescriptionInput {
        var repositoryName: RepositoryName
        var repositoryDescription: RepositoryDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRepositoryNameInput {
        var oldName: RepositoryName
        var newName: RepositoryName
    }
    interface UserInfo {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var email: Email?
            get() = definedExternally
            set(value) = definedExternally
        var date: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2015-04-13" | "latest" | String */
    }
}