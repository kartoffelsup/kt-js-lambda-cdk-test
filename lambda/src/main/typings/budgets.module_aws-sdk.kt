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
import Budgets.BudgetedAndActualAmounts
import Budgets.Budget
import Budgets.NotificationWithSubscribers
import Budgets.Notification
import Budgets.Subscriber
import Budgets.CreateBudgetRequest
import Budgets.CreateBudgetResponse
import Budgets.CreateNotificationRequest
import Budgets.CreateNotificationResponse
import Budgets.CreateSubscriberRequest
import Budgets.CreateSubscriberResponse
import Budgets.DeleteBudgetRequest
import Budgets.DeleteBudgetResponse
import Budgets.DeleteNotificationRequest
import Budgets.DeleteNotificationResponse
import Budgets.DeleteSubscriberRequest
import Budgets.DeleteSubscriberResponse
import Budgets.DescribeBudgetRequest
import Budgets.DescribeBudgetResponse
import Budgets.DescribeBudgetPerformanceHistoryRequest
import Budgets.DescribeBudgetPerformanceHistoryResponse
import Budgets.DescribeBudgetsRequest
import Budgets.DescribeBudgetsResponse
import Budgets.DescribeNotificationsForBudgetRequest
import Budgets.DescribeNotificationsForBudgetResponse
import Budgets.DescribeSubscribersForNotificationRequest
import Budgets.DescribeSubscribersForNotificationResponse
import Budgets.UpdateBudgetRequest
import Budgets.UpdateBudgetResponse
import Budgets.UpdateNotificationRequest
import Budgets.UpdateNotificationResponse
import Budgets.UpdateSubscriberRequest
import Budgets.UpdateSubscriberResponse
import Budgets.Spend
import Budgets.PlannedBudgetLimits
import Budgets.CostFilters
import Budgets.CostTypes
import Budgets.TimePeriod
import Budgets.CalculatedSpend
import Budgets.BudgetPerformanceHistory

typealias AccountId = String

typealias BudgetName = String

typealias BudgetedAndActualAmountsList = Array<BudgetedAndActualAmounts>

typealias Budgets = Array<Budget>

typealias DimensionValues = Array<GenericString>

typealias GenericString = String

typealias GenericTimestamp = Date

typealias MaxResults = Number

typealias NotificationThreshold = Number

typealias NotificationWithSubscribersList = Array<NotificationWithSubscribers>

typealias Notifications = Array<Notification>

typealias NullableBoolean = Boolean

typealias NumericValue = String

typealias SubscriberAddress = String

typealias Subscribers = Array<Subscriber>

typealias UnitValue = String

@JsModule("aws-sdk")
external open class Budgets(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Budgets.Types.ClientConfiguration */
    open fun createBudget(params: CreateBudgetRequest, callback: (err: AWSError, data: CreateBudgetResponse) -> Unit = definedExternally): Request<CreateBudgetResponse, AWSError>
    open fun createBudget(callback: (err: AWSError, data: CreateBudgetResponse) -> Unit = definedExternally): Request<CreateBudgetResponse, AWSError>
    open fun createNotification(params: CreateNotificationRequest, callback: (err: AWSError, data: CreateNotificationResponse) -> Unit = definedExternally): Request<CreateNotificationResponse, AWSError>
    open fun createNotification(callback: (err: AWSError, data: CreateNotificationResponse) -> Unit = definedExternally): Request<CreateNotificationResponse, AWSError>
    open fun createSubscriber(params: CreateSubscriberRequest, callback: (err: AWSError, data: CreateSubscriberResponse) -> Unit = definedExternally): Request<CreateSubscriberResponse, AWSError>
    open fun createSubscriber(callback: (err: AWSError, data: CreateSubscriberResponse) -> Unit = definedExternally): Request<CreateSubscriberResponse, AWSError>
    open fun deleteBudget(params: DeleteBudgetRequest, callback: (err: AWSError, data: DeleteBudgetResponse) -> Unit = definedExternally): Request<DeleteBudgetResponse, AWSError>
    open fun deleteBudget(callback: (err: AWSError, data: DeleteBudgetResponse) -> Unit = definedExternally): Request<DeleteBudgetResponse, AWSError>
    open fun deleteNotification(params: DeleteNotificationRequest, callback: (err: AWSError, data: DeleteNotificationResponse) -> Unit = definedExternally): Request<DeleteNotificationResponse, AWSError>
    open fun deleteNotification(callback: (err: AWSError, data: DeleteNotificationResponse) -> Unit = definedExternally): Request<DeleteNotificationResponse, AWSError>
    open fun deleteSubscriber(params: DeleteSubscriberRequest, callback: (err: AWSError, data: DeleteSubscriberResponse) -> Unit = definedExternally): Request<DeleteSubscriberResponse, AWSError>
    open fun deleteSubscriber(callback: (err: AWSError, data: DeleteSubscriberResponse) -> Unit = definedExternally): Request<DeleteSubscriberResponse, AWSError>
    open fun describeBudget(params: DescribeBudgetRequest, callback: (err: AWSError, data: DescribeBudgetResponse) -> Unit = definedExternally): Request<DescribeBudgetResponse, AWSError>
    open fun describeBudget(callback: (err: AWSError, data: DescribeBudgetResponse) -> Unit = definedExternally): Request<DescribeBudgetResponse, AWSError>
    open fun describeBudgetPerformanceHistory(params: DescribeBudgetPerformanceHistoryRequest, callback: (err: AWSError, data: DescribeBudgetPerformanceHistoryResponse) -> Unit = definedExternally): Request<DescribeBudgetPerformanceHistoryResponse, AWSError>
    open fun describeBudgetPerformanceHistory(callback: (err: AWSError, data: DescribeBudgetPerformanceHistoryResponse) -> Unit = definedExternally): Request<DescribeBudgetPerformanceHistoryResponse, AWSError>
    open fun describeBudgets(params: DescribeBudgetsRequest, callback: (err: AWSError, data: DescribeBudgetsResponse) -> Unit = definedExternally): Request<DescribeBudgetsResponse, AWSError>
    open fun describeBudgets(callback: (err: AWSError, data: DescribeBudgetsResponse) -> Unit = definedExternally): Request<DescribeBudgetsResponse, AWSError>
    open fun describeNotificationsForBudget(params: DescribeNotificationsForBudgetRequest, callback: (err: AWSError, data: DescribeNotificationsForBudgetResponse) -> Unit = definedExternally): Request<DescribeNotificationsForBudgetResponse, AWSError>
    open fun describeNotificationsForBudget(callback: (err: AWSError, data: DescribeNotificationsForBudgetResponse) -> Unit = definedExternally): Request<DescribeNotificationsForBudgetResponse, AWSError>
    open fun describeSubscribersForNotification(params: DescribeSubscribersForNotificationRequest, callback: (err: AWSError, data: DescribeSubscribersForNotificationResponse) -> Unit = definedExternally): Request<DescribeSubscribersForNotificationResponse, AWSError>
    open fun describeSubscribersForNotification(callback: (err: AWSError, data: DescribeSubscribersForNotificationResponse) -> Unit = definedExternally): Request<DescribeSubscribersForNotificationResponse, AWSError>
    open fun updateBudget(params: UpdateBudgetRequest, callback: (err: AWSError, data: UpdateBudgetResponse) -> Unit = definedExternally): Request<UpdateBudgetResponse, AWSError>
    open fun updateBudget(callback: (err: AWSError, data: UpdateBudgetResponse) -> Unit = definedExternally): Request<UpdateBudgetResponse, AWSError>
    open fun updateNotification(params: UpdateNotificationRequest, callback: (err: AWSError, data: UpdateNotificationResponse) -> Unit = definedExternally): Request<UpdateNotificationResponse, AWSError>
    open fun updateNotification(callback: (err: AWSError, data: UpdateNotificationResponse) -> Unit = definedExternally): Request<UpdateNotificationResponse, AWSError>
    open fun updateSubscriber(params: UpdateSubscriberRequest, callback: (err: AWSError, data: UpdateSubscriberResponse) -> Unit = definedExternally): Request<UpdateSubscriberResponse, AWSError>
    open fun updateSubscriber(callback: (err: AWSError, data: UpdateSubscriberResponse) -> Unit = definedExternally): Request<UpdateSubscriberResponse, AWSError>
    interface Budget {
        var BudgetName: BudgetName
        var BudgetLimit: Spend?
            get() = definedExternally
            set(value) = definedExternally
        var PlannedBudgetLimits: PlannedBudgetLimits?
            get() = definedExternally
            set(value) = definedExternally
        var CostFilters: CostFilters?
            get() = definedExternally
            set(value) = definedExternally
        var CostTypes: CostTypes?
            get() = definedExternally
            set(value) = definedExternally
        var TimeUnit: String /* "DAILY" | "MONTHLY" | "QUARTERLY" | "ANNUALLY" | String */
        var TimePeriod: TimePeriod?
            get() = definedExternally
            set(value) = definedExternally
        var CalculatedSpend: CalculatedSpend?
            get() = definedExternally
            set(value) = definedExternally
        var BudgetType: String /* "USAGE" | "COST" | "RI_UTILIZATION" | "RI_COVERAGE" | "SAVINGS_PLANS_UTILIZATION" | "SAVINGS_PLANS_COVERAGE" | String */
        var LastUpdatedTime: GenericTimestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BudgetPerformanceHistory {
        var BudgetName: BudgetName?
            get() = definedExternally
            set(value) = definedExternally
        var BudgetType: String /* "USAGE" | "COST" | "RI_UTILIZATION" | "RI_COVERAGE" | "SAVINGS_PLANS_UTILIZATION" | "SAVINGS_PLANS_COVERAGE" | String */
        var CostFilters: CostFilters?
            get() = definedExternally
            set(value) = definedExternally
        var CostTypes: CostTypes?
            get() = definedExternally
            set(value) = definedExternally
        var TimeUnit: String /* "DAILY" | "MONTHLY" | "QUARTERLY" | "ANNUALLY" | String */
        var BudgetedAndActualAmountsList: BudgetedAndActualAmountsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BudgetedAndActualAmounts {
        var BudgetedAmount: Spend?
            get() = definedExternally
            set(value) = definedExternally
        var ActualAmount: Spend?
            get() = definedExternally
            set(value) = definedExternally
        var TimePeriod: TimePeriod?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CalculatedSpend {
        var ActualSpend: Spend
        var ForecastedSpend: Spend?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CostFilters {
        @nativeGetter
        operator fun get(key: String): DimensionValues?
        @nativeSetter
        operator fun set(key: String, value: DimensionValues)
    }
    interface CostTypes {
        var IncludeTax: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeSubscription: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var UseBlended: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeRefund: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeCredit: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeUpfront: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeRecurring: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeOtherSubscription: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeSupport: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeDiscount: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var UseAmortized: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBudgetRequest {
        var AccountId: AccountId
        var Budget: Budget
        var NotificationsWithSubscribers: NotificationWithSubscribersList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBudgetResponse
    interface CreateNotificationRequest {
        var AccountId: AccountId
        var BudgetName: BudgetName
        var Notification: Notification
        var Subscribers: Subscribers
    }
    interface CreateNotificationResponse
    interface CreateSubscriberRequest {
        var AccountId: AccountId
        var BudgetName: BudgetName
        var Notification: Notification
        var Subscriber: Subscriber
    }
    interface CreateSubscriberResponse
    interface DeleteBudgetRequest {
        var AccountId: AccountId
        var BudgetName: BudgetName
    }
    interface DeleteBudgetResponse
    interface DeleteNotificationRequest {
        var AccountId: AccountId
        var BudgetName: BudgetName
        var Notification: Notification
    }
    interface DeleteNotificationResponse
    interface DeleteSubscriberRequest {
        var AccountId: AccountId
        var BudgetName: BudgetName
        var Notification: Notification
        var Subscriber: Subscriber
    }
    interface DeleteSubscriberResponse
    interface DescribeBudgetPerformanceHistoryRequest {
        var AccountId: AccountId
        var BudgetName: BudgetName
        var TimePeriod: TimePeriod?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeBudgetPerformanceHistoryResponse {
        var BudgetPerformanceHistory: BudgetPerformanceHistory?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeBudgetRequest {
        var AccountId: AccountId
        var BudgetName: BudgetName
    }
    interface DescribeBudgetResponse {
        var Budget: Budget?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeBudgetsRequest {
        var AccountId: AccountId
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeBudgetsResponse {
        var Budgets: Budgets?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeNotificationsForBudgetRequest {
        var AccountId: AccountId
        var BudgetName: BudgetName
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeNotificationsForBudgetResponse {
        var Notifications: Notifications?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSubscribersForNotificationRequest {
        var AccountId: AccountId
        var BudgetName: BudgetName
        var Notification: Notification
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSubscribersForNotificationResponse {
        var Subscribers: Subscribers?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Notification {
        var NotificationType: String /* "ACTUAL" | "FORECASTED" | String */
        var ComparisonOperator: String /* "GREATER_THAN" | "LESS_THAN" | "EQUAL_TO" | String */
        var Threshold: NotificationThreshold
        var ThresholdType: String /* "PERCENTAGE" | "ABSOLUTE_VALUE" | String */
        var NotificationState: String /* "OK" | "ALARM" | String */
    }
    interface NotificationWithSubscribers {
        var Notification: Notification
        var Subscribers: Subscribers
    }
    interface PlannedBudgetLimits {
        @nativeGetter
        operator fun get(key: String): Spend?
        @nativeSetter
        operator fun set(key: String, value: Spend)
    }
    interface Spend {
        var Amount: NumericValue
        var Unit: UnitValue
    }
    interface Subscriber {
        var SubscriptionType: String /* "SNS" | "EMAIL" | String */
        var Address: SubscriberAddress
    }
    interface TimePeriod {
        var Start: GenericTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var End: GenericTimestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateBudgetRequest {
        var AccountId: AccountId
        var NewBudget: Budget
    }
    interface UpdateBudgetResponse
    interface UpdateNotificationRequest {
        var AccountId: AccountId
        var BudgetName: BudgetName
        var OldNotification: Notification
        var NewNotification: Notification
    }
    interface UpdateNotificationResponse
    interface UpdateSubscriberRequest {
        var AccountId: AccountId
        var BudgetName: BudgetName
        var Notification: Notification
        var OldSubscriber: Subscriber
        var NewSubscriber: Subscriber
    }
    interface UpdateSubscriberResponse
    interface ClientApiVersions {
        var apiVersion: String /* "2016-10-20" | "latest" | String */
    }
}