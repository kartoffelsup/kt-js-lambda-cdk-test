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

external interface IFilterPattern {
    var logPatternString: String
}

external abstract class JsonPattern(jsonPatternString: String) : IFilterPattern {
    open var jsonPatternString: String
}

external open class FilterPattern {
    companion object {
        fun literal(logPatternString: String): IFilterPattern
        fun allEvents(): IFilterPattern
        fun allTerms(vararg terms: String): IFilterPattern
        fun anyTerm(vararg terms: String): IFilterPattern
        fun anyTermGroup(vararg termGroups: Array<String>): IFilterPattern
        fun stringValue(jsonField: String, comparison: String, value: String): JsonPattern
        fun numberValue(jsonField: String, comparison: String, value: Number): JsonPattern
        fun isNull(jsonField: String): JsonPattern
        fun notExists(jsonField: String): JsonPattern
        fun exists(jsonField: String): JsonPattern
        fun booleanValue(jsonField: String, value: Boolean): JsonPattern
        fun all(vararg patterns: JsonPattern): JsonPattern
        fun any(vararg patterns: JsonPattern): JsonPattern
        fun spaceDelimited(vararg columns: String): SpaceDelimitedTextPattern
    }
}

external interface RestrictionMap {
    @nativeGetter
    operator fun get(column: String): Array<ColumnRestriction>?
    @nativeSetter
    operator fun set(column: String, value: Array<ColumnRestriction>)
}

external abstract class SpaceDelimitedTextPattern(columns: Array<String>, restrictions: RestrictionMap) : IFilterPattern {
    open var columns: Any
    open var restrictions: Any
    open fun whereString(columnName: String, comparison: String, value: String): SpaceDelimitedTextPattern
    open fun whereNumber(columnName: String, comparison: String, value: Number): SpaceDelimitedTextPattern
    open var columnExpression: Any
    open var addRestriction: Any

    companion object {
        fun construct(columns: Array<String>): SpaceDelimitedTextPattern
    }
}

external interface ColumnRestriction {
    var comparison: String
    var stringValue: String?
        get() = definedExternally
        set(value) = definedExternally
    var numberValue: Number?
        get() = definedExternally
        set(value) = definedExternally
}