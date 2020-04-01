import kotlin.js.Json
import kotlin.js.Promise
import kotlin.js.json

@JsName("handler")
fun handler(event: dynamic, context: dynamic): Promise<Json> {
    console.log("Hello Lambda from Kotlin")
    return Promise.resolve(json(
        "hello" to "world"
    ))
}
