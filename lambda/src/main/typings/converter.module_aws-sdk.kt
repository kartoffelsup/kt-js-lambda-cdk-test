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
import DynamoDB.AttributeValue
import DynamoDB.AttributeMap

typealias ConverterOptions = DynamoDB.DocumentClient.ConverterOptions

external open class Converter {
    companion object {
        fun input(data: Any, options: Converter.ConverterOptions = definedExternally): AttributeValue
        fun marshall(data: Json, options: Converter.ConverterOptions = definedExternally): AttributeMap
        fun output(data: AttributeValue, options: Converter.ConverterOptions = definedExternally): Any
        fun unmarshall(data: AttributeMap, options: Converter.ConverterOptions = definedExternally): Json
    }
}